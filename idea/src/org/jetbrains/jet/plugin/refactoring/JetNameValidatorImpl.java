/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.plugin.refactoring;

import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.psi.JetElement;
import org.jetbrains.jet.lang.psi.JetExpression;
import org.jetbrains.jet.lang.psi.JetVisitorVoid;
import org.jetbrains.jet.lang.resolve.BindingContext;
import org.jetbrains.jet.lang.resolve.name.Name;
import org.jetbrains.jet.lang.resolve.scopes.JetScope;
import org.jetbrains.jet.plugin.project.AnalyzerFacadeWithCache;

import java.util.HashSet;
import java.util.Set;

public class JetNameValidatorImpl extends JetNameValidator {
    public static enum Target {
        FUNCTIONS_AND_CLASSES,
        PROPERTIES
    }

    private final PsiElement myContainer;
    private final PsiElement myAnchor;
    private final Target myTarget;

    public JetNameValidatorImpl(PsiElement container, PsiElement anchor, Target target) {
        super(container.getProject());
        myContainer = container;
        myAnchor = anchor;
        myTarget = target;
    }

    @Override
    protected boolean validateInner(String name) {
        Set<JetScope> visitedScopes = new HashSet<JetScope>();

        PsiElement sibling;
        if (myAnchor != null) {
            sibling = myAnchor;
        }
        else {
            if (myContainer instanceof JetExpression) {
                return checkElement(name, myContainer, visitedScopes);
            }
            sibling = myContainer.getFirstChild();
        }

        while (sibling != null) {
            if (!checkElement(name, sibling, visitedScopes)) return false;
            sibling = sibling.getNextSibling();
        }

        return true;
    }

    private boolean checkElement(String name, PsiElement sibling, final Set<JetScope> visitedScopes) {
        if (!(sibling instanceof JetElement)) return true;

        final BindingContext bindingContext = AnalyzerFacadeWithCache.getContextForElement((JetElement) sibling);
        final Name identifier = Name.identifier(name);

        final Ref<Boolean> result = new Ref<Boolean>(true);
        JetVisitorVoid visitor = new JetVisitorVoid() {
            @Override
            public void visitElement(@NotNull PsiElement element) {
                if (result.get()) {
                    element.acceptChildren(this);
                }
            }

            @Override
            public void visitExpression(@NotNull JetExpression expression) {
                JetScope resolutionScope = bindingContext.get(BindingContext.RESOLUTION_SCOPE, expression);
                if (!visitedScopes.add(resolutionScope)) return;

                if (resolutionScope != null) {
                    boolean noConflict;
                    if (myTarget == Target.PROPERTIES) {
                        noConflict = resolutionScope.getProperties(identifier).isEmpty()
                                     && resolutionScope.getLocalVariable(identifier) == null;
                    }
                    else {
                        noConflict = resolutionScope.getFunctions(identifier).isEmpty()
                                     && resolutionScope.getClassifier(identifier) == null;
                    }

                    if (!noConflict) {
                        result.set(false);
                        return;
                    }
                }

                super.visitExpression(expression);
            }
        };
        sibling.accept(visitor);
        return result.get();
    }
}
