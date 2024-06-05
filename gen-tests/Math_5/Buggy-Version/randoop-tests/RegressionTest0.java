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
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.complex.Complex complex4 = complex2.divide(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Class<?> wildcardClass3 = complex1.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.junit.Assert.assertNotNull(complex0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.ComplexField complexField6 = complex5.getField();
        org.apache.commons.math3.complex.Complex complex7 = complex5.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexField6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        double double2 = complex1.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex12.nthRoot(10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100L);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        double double12 = complex11.abs();
        org.apache.commons.math3.complex.Complex complex13 = complex11.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 0L, (double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex(0.0d, (double) (short) 0);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        org.apache.commons.math3.complex.ComplexField complexField8 = complex6.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex2.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) '4', (double) (byte) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex10 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math3.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math3.complex.Complex complex15 = complex13.divide((double) 1);
        double double16 = complex13.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex10.subtract(complex13);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (byte) 10, 0.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        java.lang.String str23 = complex22.toString();
        org.apache.commons.math3.complex.ComplexField complexField24 = complex22.getField();
        org.apache.commons.math3.complex.Complex complex25 = complex12.add(complex22);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0.0, 97.0)" + "'", str23, "(0.0, 97.0)");
        org.junit.Assert.assertNotNull(complexField24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex12.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math3.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex25.divide(complex27);
        java.lang.Class<?> wildcardClass30 = complex29.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        double double5 = complex2.getReal();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math3.complex.Complex> complexList7 = complex2.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex15 = complex12.multiply(0);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        double double10 = complex8.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex12.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex24.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex(100.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex26.divide(complex28);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        double double8 = complex6.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        double double1 = complex0.getReal();
        org.apache.commons.math3.complex.Complex complex3 = complex0.divide((double) 100.0f);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex9 = complex7.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.97d + "'", double8 == 0.97d);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cosh();
        java.lang.Class<?> wildcardClass9 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        boolean boolean3 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex11);
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex1.pow(complex12);
        org.apache.commons.math3.complex.Complex complex16 = complex12.pow((double) '#');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex12 = complex5.multiply(complex11);
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex1.pow(complex12);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.ComplexField complexField2 = complex0.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complexField2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        java.lang.String str10 = complex9.toString();
        boolean boolean11 = complex9.isNaN();
        java.lang.String str12 = complex9.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0.0, 97.0)" + "'", str10, "(0.0, 97.0)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0.0, 97.0)" + "'", str12, "(0.0, 97.0)");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf(0.0d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 10, (double) 0.0f);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        boolean boolean4 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex(97.0d, (double) (short) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        boolean boolean10 = complex9.isInfinite();
        java.lang.Class<?> wildcardClass11 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex12.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math3.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex25.divide(complex27);
        org.apache.commons.math3.complex.Complex complex31 = complex27.subtract((double) 1);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        boolean boolean10 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math3.complex.Complex complex12 = complex11.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex14 = complex2.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 10, (double) 0.0f);
        org.apache.commons.math3.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math3.complex.Complex complex4 = complex2.cos();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex6 = complex4.subtract(complex5);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.junit.Assert.assertNotNull(complex0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex12.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math3.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math3.complex.Complex complex29 = complex25.divide(complex27);
        org.apache.commons.math3.complex.Complex complex30 = complex29.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ONE;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot((int) '#');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexList2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) 1L);
        double double5 = complex2.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1.0f, Double.NaN);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        double double8 = complex6.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex8.asin();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex8.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex17 = complex8.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex18 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex23 = complex21.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex28 = complex21.multiply(complex27);
        boolean boolean29 = complex28.isInfinite();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt1z();
        org.apache.commons.math3.complex.Complex complex31 = complex18.divide(complex30);
        org.apache.commons.math3.complex.Complex complex32 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex5.multiply(complex33);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        double double1 = complex0.getReal();
        org.apache.commons.math3.complex.Complex complex2 = complex0.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex12.divide(complex24);
        java.lang.String str26 = complex24.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(97.0051545022222, 0.0)" + "'", str26, "(97.0051545022222, 0.0)");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) 1L);
        org.apache.commons.math3.complex.Complex complex6 = complex4.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        double double11 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex13 = complex10.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex9.divide(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex13.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex15.log();
        org.apache.commons.math3.complex.Complex complex17 = complex6.add(complex15);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex10 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex2.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        boolean boolean10 = complex9.isInfinite();
        org.apache.commons.math3.complex.Complex complex11 = complex9.reciprocal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        double double8 = complex2.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 1, 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex(0.0d, (double) (short) 0);
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide(complex5);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex12.divide(1.0d);
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex16 = complex14.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, (double) '4');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) ' ');
        double double2 = complex1.getImaginary();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math3.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex22 = complex15.multiply(complex21);
        boolean boolean23 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex25 = complex12.divide(complex24);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex25.nthRoot((int) '#');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        java.lang.String str13 = complex12.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0.0, 1.0)" + "'", str13, "(0.0, 1.0)");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex10 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.ZERO;
        double double12 = complex11.abs();
        org.apache.commons.math3.complex.Complex complex14 = complex11.add((double) (byte) 100);
        org.apache.commons.math3.complex.ComplexField complexField15 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex16 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex2.pow(complex16);
        java.lang.String str18 = complex17.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1.0, 0.0)" + "'", str18, "(1.0, 0.0)");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math3.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex15 = complex13.add(complex14);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex18.pow((double) 1L);
        boolean boolean21 = complex15.equals((java.lang.Object) complex18);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex8.divide((double) (byte) 100);
        java.lang.String str12 = complex11.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0.0, 0.97)" + "'", str12, "(0.0, 0.97)");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex11.asin();
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) (byte) 0);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math3.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex16.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex16.asin();
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex23 = complex16.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex16.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex13.divide(complex25);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (short) 0);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        double double12 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex2.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.sqrt1z();
        double double3 = complex1.getImaginary();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math3.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math3.complex.Complex complex8 = complex6.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex6.asin();
        boolean boolean10 = complex1.equals((java.lang.Object) complex9);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        double double8 = complex7.getImaginary();
        double double9 = complex7.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.97d + "'", double8 == 0.97d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.97d + "'", double9 == 0.97d);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = complex0.multiply((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        double double5 = complex2.getReal();
        org.apache.commons.math3.complex.Complex complex6 = complex2.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        double double13 = complex12.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex5 = complex2.pow((double) (byte) -1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex10 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex11 = org.apache.commons.math3.complex.Complex.ZERO;
        double double12 = complex11.abs();
        org.apache.commons.math3.complex.Complex complex14 = complex11.add((double) (byte) 100);
        org.apache.commons.math3.complex.ComplexField complexField15 = complex11.getField();
        org.apache.commons.math3.complex.Complex complex16 = complex11.cosh();
        org.apache.commons.math3.complex.Complex complex17 = complex2.pow(complex16);
        double double18 = complex17.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        double double12 = complex2.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = complex2.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.ZERO;
        double double4 = complex3.abs();
        org.apache.commons.math3.complex.Complex complex6 = complex3.add((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex2.divide(complex6);
        org.apache.commons.math3.complex.Complex complex8 = complex6.cosh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((double) 100.0f);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        double double1 = complex0.abs();
        org.apache.commons.math3.complex.Complex complex3 = complex0.multiply((double) (short) 1);
        double double4 = complex3.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.NaN;
        double double1 = complex0.getReal();
        org.apache.commons.math3.complex.Complex complex3 = complex0.pow((double) (byte) 100);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 'a', 0.0d);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.divide((double) 1);
        org.apache.commons.math3.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0, (double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex2.multiply(complex8);
        org.apache.commons.math3.complex.Complex complex11 = complex2.multiply((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex13 = complex2.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }
}

