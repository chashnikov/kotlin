/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.j2k

import org.jetbrains.jet.j2k.ast.Type
import org.jetbrains.jet.j2k.ast.Nullability
import com.intellij.psi.*
import org.jetbrains.jet.j2k.visitors.TypeVisitor

class TypeConverter(val settings: ConverterSettings) {
    public fun convertType(`type`: PsiType?, nullability: Nullability = Nullability.Default): Type {
        if (`type` == null) return Type.Empty

        val result = `type`.accept<Type>(TypeVisitor(this))!!
        return when (nullability) {
            Nullability.NotNull -> result.toNotNullType()
            Nullability.Nullable -> result.toNullableType()
            Nullability.Default -> result
        }
    }

    public fun convertTypes(types: Array<PsiType>): List<Type> {
        return types.map { convertType(it) }
    }

    public fun convertVariableType(variable: PsiVariable): Type {
        var nullability = variable.nullabilityFromAnnotations()

        if (nullability == Nullability.Default) {
            val initializer = variable.getInitializer()
            if (initializer != null) {
                val initializerNullability = initializer.nullability()
                if (variable.hasModifierProperty(PsiModifier.FINAL)) { //TODO: replace check for final modifier with effective final
                    nullability = initializerNullability
                }
                else if (initializerNullability == Nullability.Nullable) { // if variable is not final then non-nullability of initializer does not mean that variable is non-null
                    nullability = Nullability.Nullable
                }
            }
        }

        if (nullability == Nullability.Default) {
            val scope = searchScope(variable)
            if (scope != null) {
                if (findVariableUsages(variable, scope).any { isNullableFromUsage(it) }) {
                    nullability = Nullability.Nullable
                }
            }
        }

        if (nullability == Nullability.Default && variable is PsiParameter) {
            val method = variable.getDeclarationScope() as? PsiMethod
            if (method != null) {
                val scope = searchScope(method)
                if (scope != null) {
                    val parameters = method.getParameterList().getParameters()
                    val parameterIndex = parameters.indexOf(variable)
                    for (call in findMethodCalls(method, scope)) {
                        val args = call.getArgumentList().getExpressions()
                        if (args.size == parameters.size) {
                            if (args[parameterIndex].nullability() == Nullability.Nullable) {
                                nullability = Nullability.Nullable
                                break
                            }
                        }
                    }
                }
            }
        }

        return convertType(variable.getType(), nullability)
    }

    public fun convertMethodReturnType(method: PsiMethod): Type {
        var nullability = method.nullabilityFromAnnotations()

        if (nullability == Nullability.Default) {
            var isInAnonymousClass = false
            method.getBody()?.accept(object: JavaRecursiveElementVisitor() {
                override fun visitAnonymousClass(aClass: PsiAnonymousClass) {
                    isInAnonymousClass = true
                    super.visitAnonymousClass(aClass)
                    isInAnonymousClass = false
                }

                override fun visitReturnStatement(statement: PsiReturnStatement) {
                    if (!isInAnonymousClass && statement.getReturnValue()?.nullability() == Nullability.Nullable) {
                        nullability = Nullability.Nullable
                    }
                }
            })
        }

        if (nullability == Nullability.Default) {
            val scope = searchScope(method)
            if (scope != null) {
                if (findMethodCalls(method, scope).any { isNullableFromUsage(it) }) {
                    nullability = Nullability.Nullable
                }
            }
        }

        return convertType(method.getReturnType(), nullability)
    }

    private fun searchScope(element: PsiElement): PsiElement? {
        return when(element) {
            is PsiParameter -> element.getDeclarationScope()
            is PsiField -> if (element.hasModifierProperty(PsiModifier.PRIVATE)) element.getContainingClass() else element.getContainingFile()
            is PsiMethod -> if (element.hasModifierProperty(PsiModifier.PRIVATE)) element.getContainingClass() else element.getContainingFile()
            is PsiLocalVariable -> element.getContainingMethod()
            else -> null
        }
    }

    private fun PsiExpression.nullability(): Nullability {
        return when (this) {
            is PsiLiteralExpression -> if (getValue() != null) Nullability.NotNull else Nullability.Nullable

            is PsiNewExpression -> Nullability.NotNull

            is PsiConditionalExpression -> {
                val nullability1 = getThenExpression()?.nullability()
                if (nullability1 == Nullability.Nullable) return Nullability.Nullable
                val nullability2 = getElseExpression()?.nullability()
                if (nullability2 == Nullability.Nullable) return Nullability.Nullable
                if (nullability1 == Nullability.NotNull && nullability2 == Nullability.NotNull) return Nullability.NotNull
                Nullability.Default
            }

            is PsiParenthesizedExpression -> getExpression()?.nullability() ?: Nullability.Default

        //TODO: some other cases

            else -> Nullability.Default
        }
    }

    private fun isNullableFromUsage(usage: PsiExpression): Boolean {
        val parent = usage.getParent() ?: return false
        if (parent is PsiAssignmentExpression && parent.getOperationTokenType() == JavaTokenType.EQ && usage == parent.getLExpression()) {
            return parent.getRExpression()?.nullability() == Nullability.Nullable
        }
        else if (parent is PsiBinaryExpression) {
            val operationType = parent.getOperationTokenType()
            if (operationType == JavaTokenType.EQEQ || operationType == JavaTokenType.NE) {
                val otherOperand = if (usage == parent.getLOperand()) parent.getROperand() else parent.getLOperand()
                return otherOperand?.nullability() == Nullability.Nullable
            }
        }
        return false
    }
}