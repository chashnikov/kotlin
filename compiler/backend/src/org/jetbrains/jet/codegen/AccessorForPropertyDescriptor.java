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

package org.jetbrains.jet.codegen;

import org.jetbrains.jet.lang.descriptors.DeclarationDescriptor;
import org.jetbrains.jet.lang.descriptors.Modality;
import org.jetbrains.jet.lang.descriptors.PropertyDescriptor;
import org.jetbrains.jet.lang.descriptors.Visibilities;
import org.jetbrains.jet.lang.descriptors.annotations.Annotations;
import org.jetbrains.jet.lang.descriptors.impl.PropertyDescriptorImpl;
import org.jetbrains.jet.lang.descriptors.impl.PropertyGetterDescriptorImpl;
import org.jetbrains.jet.lang.descriptors.impl.PropertySetterDescriptorImpl;
import org.jetbrains.jet.lang.descriptors.impl.TypeParameterDescriptorImpl;
import org.jetbrains.jet.lang.resolve.DescriptorUtils;
import org.jetbrains.jet.lang.resolve.name.Name;
import org.jetbrains.jet.lang.types.JetType;

import java.util.Collections;

public class AccessorForPropertyDescriptor extends PropertyDescriptorImpl {
    public AccessorForPropertyDescriptor(PropertyDescriptor pd, DeclarationDescriptor containingDeclaration, int index) {
        super(containingDeclaration, Annotations.EMPTY, Modality.FINAL, Visibilities.LOCAL,
              pd.isVar(), Name.identifier(pd.getName() + "$b$" + index),
              Kind.DECLARATION);

        boolean isStaticProperty = AsmUtil.isPropertyWithBackingFieldInOuterClass(pd)
                                   && !AsmUtil.isClassObjectWithBackingFieldsInOuter(containingDeclaration);
        JetType receiverType = !isStaticProperty ? DescriptorUtils.getReceiverParameterType(pd.getReceiverParameter()) : null;

        setType(pd.getType(), Collections.<TypeParameterDescriptorImpl>emptyList(), isStaticProperty ? null : pd.getExpectedThisObject(),
                receiverType);
        initialize(new Getter(this), new Setter(this));
    }

    public static class Getter extends PropertyGetterDescriptorImpl {
        public Getter(AccessorForPropertyDescriptor property) {
            super(property, Annotations.EMPTY, Modality.FINAL, Visibilities.LOCAL,
                  false,
                  false, Kind.DECLARATION);
            initialize(property.getType());
        }
    }

    public static class Setter extends PropertySetterDescriptorImpl {
        public Setter(AccessorForPropertyDescriptor property) {
            super(property, Annotations.EMPTY, Modality.FINAL, Visibilities.LOCAL,
                  false,
                  false, Kind.DECLARATION);
            initializeDefault();
        }
    }
}
