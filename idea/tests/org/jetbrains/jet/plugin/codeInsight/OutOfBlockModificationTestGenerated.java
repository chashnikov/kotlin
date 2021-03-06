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

package org.jetbrains.jet.plugin.codeInsight;

import com.intellij.testFramework.TestDataPath;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.jetbrains.jet.JUnit3RunnerWithInners;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/outOfBlock")
@TestDataPath("$PROJECT_ROOT")
@RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
public class OutOfBlockModificationTestGenerated extends AbstractOutOfBlockModificationTest {
    public void testAllFilesPresentInOutOfBlock() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/outOfBlock"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("FunInFun.kt")
    public void testFunInFun() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/FunInFun.kt");
        doTest(fileName);
    }
    
    @TestMetadata("FunNoBody.kt")
    public void testFunNoBody() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/FunNoBody.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InAntonymsObjectDeclaration.kt")
    public void testInAntonymsObjectDeclaration() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InAntonymsObjectDeclaration.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClass.kt")
    public void testInClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InClass.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClassPropertyAccessor.kt")
    public void testInClassPropertyAccessor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InClassPropertyAccessor.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunInFunWithBody.kt")
    public void testInFunInFunWithBody() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InFunInFunWithBody.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunInMultiDeclaration.kt")
    public void testInFunInMultiDeclaration() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InFunInMultiDeclaration.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunWithInference.kt")
    public void testInFunWithInference() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InFunWithInference.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunctionLiteral.kt")
    public void testInFunctionLiteral() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InFunctionLiteral.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InGlobalPropertyWithGetter.kt")
    public void testInGlobalPropertyWithGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InGlobalPropertyWithGetter.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InMethod.kt")
    public void testInMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InMethod.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InPropertyAccessorWithInference.kt")
    public void testInPropertyAccessorWithInference() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InPropertyAccessorWithInference.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InPropertyWithFunctionLiteral.kt")
    public void testInPropertyWithFunctionLiteral() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InPropertyWithFunctionLiteral.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InPropertyWithInference.kt")
    public void testInPropertyWithInference() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/codeInsight/outOfBlock/InPropertyWithInference.kt");
        doTest(fileName);
    }
    
}
