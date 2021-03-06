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

package org.jetbrains.jet.psi;

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
@InnerTestClasses({JetPsiMatcherTestGenerated.Expressions.class, JetPsiMatcherTestGenerated.Types.class})
@RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
public class JetPsiMatcherTestGenerated extends AbstractJetPsiMatcherTest {
    @TestMetadata("idea/testData/jetPsiMatcher/expressions")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({Expressions.ArrayAccess.class, Expressions.BinaryExpr.class, Expressions.Call.class, Expressions.Const.class, Expressions.Misc.class, Expressions.SimpleName.class, Expressions.Super.class, Expressions.Throw.class, Expressions.UnaryExpr.class})
    @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
    public static class Expressions extends AbstractJetPsiMatcherTest {
        public void testAllFilesPresentInExpressions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/arrayAccess")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class ArrayAccess extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInArrayAccess() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/arrayAccess"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("arrayAccess1.kt")
            public void testArrayAccess1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/arrayAccess/arrayAccess1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("arrayAccess2.kt")
            public void testArrayAccess2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/arrayAccess/arrayAccess2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_arrayAccess1.kt")
            public void test_arrayAccess1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/arrayAccess/_arrayAccess1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_arrayAccess2.kt")
            public void test_arrayAccess2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/arrayAccess/_arrayAccess2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_arrayAccess3.kt")
            public void test_arrayAccess3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/arrayAccess/_arrayAccess3.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class BinaryExpr extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInBinaryExpr() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/binaryExpr"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("binaryExpr1.kt")
            public void testBinaryExpr1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/binaryExpr1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("binaryExpr2.kt")
            public void testBinaryExpr2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/binaryExpr2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("binaryExpr3.kt")
            public void testBinaryExpr3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/binaryExpr3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("binaryExpr4.kt")
            public void testBinaryExpr4() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/binaryExpr4.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("binaryExpr5.kt")
            public void testBinaryExpr5() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/binaryExpr5.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_binaryExpr1.kt")
            public void test_binaryExpr1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/_binaryExpr1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_binaryExpr2.kt")
            public void test_binaryExpr2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/_binaryExpr2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_binaryExpr3.kt")
            public void test_binaryExpr3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/_binaryExpr3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_binaryExpr4.kt")
            public void test_binaryExpr4() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/_binaryExpr4.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_binaryExpr5.kt")
            public void test_binaryExpr5() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/_binaryExpr5.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_binaryExpr6.kt")
            public void test_binaryExpr6() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/binaryExpr/_binaryExpr6.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/call")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class Call extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInCall() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/call"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("call1.kt")
            public void testCall1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/call1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("call2.kt")
            public void testCall2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/call2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("call3.kt")
            public void testCall3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/call3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("call4.kt")
            public void testCall4() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/call4.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_call1.kt")
            public void test_call1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/_call1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_call2.kt")
            public void test_call2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/_call2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_call3.kt")
            public void test_call3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/_call3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_call4.kt")
            public void test_call4() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/call/_call4.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/const")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class Const extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInConst() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/const"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("const.kt")
            public void testConst() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/const/const.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_const.kt")
            public void test_const() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/const/_const.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/misc")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class Misc extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInMisc() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/misc"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("misc1.kt")
            public void testMisc1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/misc/misc1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("misc2.kt")
            public void testMisc2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/misc/misc2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("misc3.kt")
            public void testMisc3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/misc/misc3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_misc1.kt")
            public void test_misc1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/misc/_misc1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_misc2.kt")
            public void test_misc2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/misc/_misc2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_misc3.kt")
            public void test_misc3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/misc/_misc3.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/simpleName")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class SimpleName extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInSimpleName() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/simpleName"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("simpleName.kt")
            public void testSimpleName() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/simpleName/simpleName.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("simpleName2.kt")
            public void testSimpleName2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/simpleName/simpleName2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_simpleName.kt")
            public void test_simpleName() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/simpleName/_simpleName.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/super")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class Super extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInSuper() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/super"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("super1.kt")
            public void testSuper1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/super1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("super2.kt")
            public void testSuper2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/super2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("super3.kt")
            public void testSuper3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/super3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("super4.kt")
            public void testSuper4() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/super4.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_super1.kt")
            public void test_super1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/_super1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_super2.kt")
            public void test_super2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/_super2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_super3.kt")
            public void test_super3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/_super3.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_super4.kt")
            public void test_super4() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/super/_super4.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/throw")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class Throw extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInThrow() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/throw"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("throw.kt")
            public void testThrow() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/throw/throw.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_throw.kt")
            public void test_throw() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/throw/_throw.kt");
                doTestExpressions(fileName);
            }
            
        }
        
        @TestMetadata("idea/testData/jetPsiMatcher/expressions/unaryExpr")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
        public static class UnaryExpr extends AbstractJetPsiMatcherTest {
            public void testAllFilesPresentInUnaryExpr() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/expressions/unaryExpr"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("unaryExpr1.kt")
            public void testUnaryExpr1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/unaryExpr/unaryExpr1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("unaryExpr2.kt")
            public void testUnaryExpr2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/unaryExpr/unaryExpr2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_unaryExpr1.kt")
            public void test_unaryExpr1() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/unaryExpr/_unaryExpr1.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_unaryExpr2.kt")
            public void test_unaryExpr2() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/unaryExpr/_unaryExpr2.kt");
                doTestExpressions(fileName);
            }
            
            @TestMetadata("_unaryExpr3.kt")
            public void test_unaryExpr3() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/expressions/unaryExpr/_unaryExpr3.kt");
                doTestExpressions(fileName);
            }
            
        }
        
    }
    
    @TestMetadata("idea/testData/jetPsiMatcher/types")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
    public static class Types extends AbstractJetPsiMatcherTest {
        public void testAllFilesPresentInTypes() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/jetPsiMatcher/types"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("functional1.kt")
        public void testFunctional1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/functional1.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("functional2.kt")
        public void testFunctional2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/functional2.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("functional3.kt")
        public void testFunctional3() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/functional3.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("nullable1.kt")
        public void testNullable1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/nullable1.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("user1.kt")
        public void testUser1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/user1.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("user2.kt")
        public void testUser2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/user2.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("_functional1.kt")
        public void test_functional1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/_functional1.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("_functional2.kt")
        public void test_functional2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/_functional2.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("_nullable1.kt")
        public void test_nullable1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/_nullable1.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("_user1.kt")
        public void test_user1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/_user1.kt");
            doTestTypes(fileName);
        }
        
        @TestMetadata("_user2.kt")
        public void test_user2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/jetPsiMatcher/types/_user2.kt");
            doTestTypes(fileName);
        }
        
    }
    
}
