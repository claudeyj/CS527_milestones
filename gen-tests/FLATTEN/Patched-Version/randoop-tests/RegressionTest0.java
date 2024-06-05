import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 0.0d);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0.0d + "'", obj1, 0.0d);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0L + "'", obj1, 0L);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0 + "'", obj1, 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 10L);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 10L + "'", obj1, 10L);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + '#' + "'", obj1, '#');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = fLATTEN0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 1.0d + "'", obj1, 1.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0.0f + "'", obj1, 0.0f);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (byte) 10 + "'", obj1, (byte) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 100.0d);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 100.0d + "'", obj1, 100.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (byte) 1);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (byte) 1 + "'", obj1, (byte) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (short) -1 + "'", obj1, (short) -1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (byte) 0 + "'", obj1, (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (-1.0d) + "'", obj1, (-1.0d));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + true + "'", obj1, true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (short) 1 + "'", obj1, (short) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (-1.0f) + "'", obj1, (-1.0f));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 100.0f + "'", obj1, 100.0f);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (short) 0 + "'", obj1, (short) 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (short) 10 + "'", obj1, (short) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 10.0d + "'", obj1, 10.0d);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 1L + "'", obj1, 1L);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass2 = fLATTEN0.getClass();
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass4 = fLATTEN0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) (-1L));
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (-1L) + "'", obj1, (-1L));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass2 = fLATTEN0.getClass();
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) ' ');
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + ' ' + "'", obj1, ' ');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.Object");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) 1.0f);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 1.0f + "'", obj1, 1.0f);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = fLATTEN0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + "" + "'", obj1, "");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj2.getClass();
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Class<?> wildcardClass8 = obj6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj7);
        java.lang.Class<?> wildcardClass9 = obj7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Class");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj3);
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Class");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Class");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        java.lang.Object obj11 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass1);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.Object");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj4);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten(obj7);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj3);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj3);
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Class<?> wildcardClass9 = obj6.getClass();
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten(obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Class");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Class");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten(obj9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten(obj8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten(obj9);
        java.lang.Object obj11 = correct_java_programs.FLATTEN.flatten(obj10);
        java.lang.Object obj12 = correct_java_programs.FLATTEN.flatten(obj11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj11 = correct_java_programs.FLATTEN.flatten(obj10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass2 = fLATTEN0.getClass();
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj6);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj3);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten(obj7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten(obj9);
        java.lang.Class<?> wildcardClass11 = obj9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.Object");
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.Class");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Class");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass1);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten(obj8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + "hi!" + "'", obj1, "hi!");
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        java.lang.Object obj9 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Class");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class java.lang.Class");
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        correct_java_programs.FLATTEN fLATTEN0 = new correct_java_programs.FLATTEN();
        java.lang.Class<?> wildcardClass1 = fLATTEN0.getClass();
        java.lang.Object obj2 = correct_java_programs.FLATTEN.flatten((java.lang.Object) fLATTEN0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj2);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = correct_java_programs.FLATTEN.flatten((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = correct_java_programs.FLATTEN.flatten(obj10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class correct_java_programs.FLATTEN");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.Class");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Class");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Class");
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Object obj3 = correct_java_programs.FLATTEN.flatten(obj0);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = correct_java_programs.FLATTEN.flatten(obj3);
        java.lang.Object obj6 = correct_java_programs.FLATTEN.flatten(obj5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }
}

