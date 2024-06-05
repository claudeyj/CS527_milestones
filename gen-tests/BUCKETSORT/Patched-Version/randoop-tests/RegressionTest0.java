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
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        correct_java_programs.BUCKETSORT bUCKETSORT0 = new correct_java_programs.BUCKETSORT();
        java.lang.Class<?> wildcardClass1 = bUCKETSORT0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.BUCKETSORT.bucketsort(intList3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass6 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.BUCKETSORT.bucketsort(intList3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 10, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

