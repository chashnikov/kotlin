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

package org.jetbrains.jet.shortenRefs;

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
@TestMetadata("idea/testData/shortenRefs")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({ShortenRefsTestGenerated.Constructor.class, ShortenRefsTestGenerated.Imports.class, ShortenRefsTestGenerated.Java.class, ShortenRefsTestGenerated.Type.class})
@RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
public class ShortenRefsTestGenerated extends AbstractShortenRefsTest {
    public void testAllFilesPresentInShortenRefs() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
    }
    
    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/classObject.kt");
        doTest(fileName);
    }
    
    @TestMetadata("JavaStaticMethod.kt")
    public void testJavaStaticMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/JavaStaticMethod.kt");
        doTest(fileName);
    }
    
    @TestMetadata("noShortening.kt")
    public void testNoShortening() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/noShortening.kt");
        doTest(fileName);
    }
    
    @TestMetadata("idea/testData/shortenRefs/constructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
    public static class Constructor extends AbstractShortenRefsTest {
        public void testAllFilesPresentInConstructor() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/constructor"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("Ambiguous.kt")
        public void testAmbiguous() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/Ambiguous.kt");
            doTest(fileName);
        }
        
        @TestMetadata("GenericType.kt")
        public void testGenericType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/GenericType.kt");
            doTest(fileName);
        }
        
        @TestMetadata("LeaveQualified.kt")
        public void testLeaveQualified() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified.kt");
            doTest(fileName);
        }
        
        @TestMetadata("LeaveQualified1.kt")
        public void testLeaveQualified1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified1.kt");
            doTest(fileName);
        }
        
        @TestMetadata("LeaveQualified2.kt")
        public void testLeaveQualified2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified2.kt");
            doTest(fileName);
        }
        
        @TestMetadata("LeaveQualified3.kt")
        public void testLeaveQualified3() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified3.kt");
            doTest(fileName);
        }
        
        @TestMetadata("LeaveQualified5.kt")
        public void testLeaveQualified5() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified5.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NestedClass.kt")
        public void testNestedClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NestedClass.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NestedClassWithImport.kt")
        public void testNestedClassWithImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NestedClassWithImport.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NoImportNeeded.kt")
        public void testNoImportNeeded() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NoImportNeeded.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NoImportNeeded2.kt")
        public void testNoImportNeeded2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NoImportNeeded2.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NoImportNeeded3.kt")
        public void testNoImportNeeded3() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NoImportNeeded3.kt");
            doTest(fileName);
        }
        
        @TestMetadata("WorksForClassNameRange.kt")
        public void testWorksForClassNameRange() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/WorksForClassNameRange.kt");
            doTest(fileName);
        }
        
        @TestMetadata("WorksForClassNameRange2.kt")
        public void testWorksForClassNameRange2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/WorksForClassNameRange2.kt");
            doTest(fileName);
        }
        
    }
    
    @TestMetadata("idea/testData/shortenRefs/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
    public static class Imports extends AbstractShortenRefsTest {
        public void testAllFilesPresentInImports() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/imports"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("leaveQualifiedConstructor.kt")
        public void testLeaveQualifiedConstructor() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/imports/leaveQualifiedConstructor.kt");
            doTest(fileName);
        }
        
        @TestMetadata("leaveQualifiedType.kt")
        public void testLeaveQualifiedType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/imports/leaveQualifiedType.kt");
            doTest(fileName);
        }
        
        @TestMetadata("optimizeMultipleImports.kt")
        public void testOptimizeMultipleImports() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/imports/optimizeMultipleImports.kt");
            doTest(fileName);
        }
        
    }
    
    @TestMetadata("idea/testData/shortenRefs/java")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
    public static class Java extends AbstractShortenRefsTest {
        public void testAllFilesPresentInJava() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/java"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("innerClassNoImports.kt")
        public void testInnerClassNoImports() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/innerClassNoImports.kt");
            doTest(fileName);
        }
        
        @TestMetadata("innerClassOnDemandImport.kt")
        public void testInnerClassOnDemandImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/innerClassOnDemandImport.kt");
            doTest(fileName);
        }
        
        @TestMetadata("staticClassNoImports.kt")
        public void testStaticClassNoImports() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticClassNoImports.kt");
            doTest(fileName);
        }
        
        @TestMetadata("staticClassOnDemandImport.kt")
        public void testStaticClassOnDemandImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticClassOnDemandImport.kt");
            doTest(fileName);
        }
        
        @TestMetadata("staticFieldNoImports.kt")
        public void testStaticFieldNoImports() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticFieldNoImports.kt");
            doTest(fileName);
        }
        
        @TestMetadata("staticFieldOnDemandImport.kt")
        public void testStaticFieldOnDemandImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticFieldOnDemandImport.kt");
            doTest(fileName);
        }
        
        @TestMetadata("staticMethodNoImports.kt")
        public void testStaticMethodNoImports() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticMethodNoImports.kt");
            doTest(fileName);
        }
        
        @TestMetadata("staticMethodOnDemandImport.kt")
        public void testStaticMethodOnDemandImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticMethodOnDemandImport.kt");
            doTest(fileName);
        }
        
    }
    
    @TestMetadata("idea/testData/shortenRefs/type")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
    public static class Type extends AbstractShortenRefsTest {
        public void testAllFilesPresentInType() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/type"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("ClassNameInsideArguments.kt")
        public void testClassNameInsideArguments() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/ClassNameInsideArguments.kt");
            doTest(fileName);
        }
        
        @TestMetadata("ClassNameInsideLambda.kt")
        public void testClassNameInsideLambda() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/ClassNameInsideLambda.kt");
            doTest(fileName);
        }
        
        @TestMetadata("ClassSameNameAsPackage.kt")
        public void testClassSameNameAsPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/ClassSameNameAsPackage.kt");
            doTest(fileName);
        }
        
        @TestMetadata("delegationSpecifier.kt")
        public void testDelegationSpecifier() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/delegationSpecifier.kt");
            doTest(fileName);
        }
        
        @TestMetadata("FunctionType.kt")
        public void testFunctionType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/FunctionType.kt");
            doTest(fileName);
        }
        
        @TestMetadata("GenericType.kt")
        public void testGenericType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/GenericType.kt");
            doTest(fileName);
        }
        
        @TestMetadata("GenericType2.kt")
        public void testGenericType2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/GenericType2.kt");
            doTest(fileName);
        }
        
        @TestMetadata("GenericType3.kt")
        public void testGenericType3() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/GenericType3.kt");
            doTest(fileName);
        }
        
        @TestMetadata("LeaveQualified.kt")
        public void testLeaveQualified() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/LeaveQualified.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NestedClass.kt")
        public void testNestedClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NestedClass.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NestedClassRefInImport.kt")
        public void testNestedClassRefInImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NestedClassRefInImport.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NoImportNeeded.kt")
        public void testNoImportNeeded() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NoImportNeeded.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NoImportNeeded2.kt")
        public void testNoImportNeeded2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NoImportNeeded2.kt");
            doTest(fileName);
        }
        
        @TestMetadata("NullableType.kt")
        public void testNullableType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NullableType.kt");
            doTest(fileName);
        }
        
        @TestMetadata("SameClassTwice.kt")
        public void testSameClassTwice() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/SameClassTwice.kt");
            doTest(fileName);
        }
        
        @TestMetadata("SimpleAddImport.kt")
        public void testSimpleAddImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/SimpleAddImport.kt");
            doTest(fileName);
        }
        
        @TestMetadata("TwoClassesSameNames.kt")
        public void testTwoClassesSameNames() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/shortenRefs/type/TwoClassesSameNames.kt");
            doTest(fileName);
        }
        
    }
    
}
