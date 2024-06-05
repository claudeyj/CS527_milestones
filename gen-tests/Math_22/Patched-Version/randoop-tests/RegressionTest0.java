import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        double double0 = org.apache.commons.math3.distribution.FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-9d + "'", double0 == 1.0E-9d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 0, (double) 1.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        double double0 = org.apache.commons.math3.distribution.AbstractRealDistribution.SOLVER_DEFAULT_ABSOLUTE_ACCURACY;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-6d + "'", double0 == 1.0E-6d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 0.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = fDistribution3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((-1.0d), (double) (-1), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution3.probability((double) 100.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = fDistribution3.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6526324471839393d + "'", double4 == 1.6526324471839393d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        boolean boolean9 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.5435932968585407E-37d + "'", double7 == 2.5435932968585407E-37d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution3.cumulativeProbability(1.5396806059889714d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.54) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double double10 = fDistribution3.probability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution3.probability((double) (short) 10, 1.0E-9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double6 = fDistribution3.getSupportLowerBound();
        double double8 = fDistribution3.probability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution3.inverseCumulativeProbability(1.5396806059889714d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.54 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double double10 = fDistribution3.probability((double) 1L);
        double double11 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (short) 10, 0.0d, 1.0606060606060606d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double8 = fDistribution3.probability(1.0606060606060606d, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistribution3.probability(2.5435932968585407E-37d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41691984004679694d + "'", double8 == 0.41691984004679694d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        boolean boolean6 = fDistribution4.isSupportLowerBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.inverseCumulativeProbability(6.9763743821628994E-127d);
        java.lang.Class<?> wildcardClass9 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double8 = fDistribution3.probability(1.0606060606060606d, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistribution3.cumulativeProbability(0.11548333333333333d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.115) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41691984004679694d + "'", double8 == 0.41691984004679694d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double8 = fDistribution3.probability(1.0606060606060606d, (double) 10.0f);
        double double10 = fDistribution3.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41691984004679694d + "'", double8 == 0.41691984004679694d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.0d, (double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double12 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11548333333333333d + "'", double12 == 0.11548333333333333d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.sample();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6074779627759674d + "'", double4 == 0.6074779627759674d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6016573064016222d + "'", double6 == 1.6016573064016222d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double8 = fDistribution3.inverseCumulativeProbability(6.9763743821628994E-127d);
        double double9 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.cumulativeProbability((double) (short) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double8 = fDistribution2.probability(0.0d, 0.41691984004679694d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.663252185563053E-6d + "'", double8 == 8.663252185563053E-6d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0606060606060606d + "'", double6 == 1.0606060606060606d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution3.cumulativeProbability(8.663252185563053E-6d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) -1, (double) 1L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = fDistribution4.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 1.4627249395148658d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double4 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4627249395148658d + "'", double3 == 1.4627249395148658d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.04d, 1.0E-6d, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double double5 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.1145220152743283, 1.0450039019371486, 0.9253357324354333, 1.1992881807259972, 1.0108784684462278, 0.7587521782285979, 0.9156091007102259, 1.0924903868677698, 1.1311433299507676, 0.7657181683711308, 0.7703273301828206, 1.1308383203993992, 0.8994053497704263, 1.3051357932546879, 0.773184336622814, 0.8795078479991681, 0.6847404577199547, 0.8872042219342423, 1.3382953013236412, 1.1410418619279046, 0.941879872147931, 0.9285304473027141, 1.2506917410161646, 1.1289911840703866, 1.1923365643428412, 0.9982878533047664, 0.8901217917957281, 0.9339621940925419, 0.9683280493803191, 1.4394100340489044, 1.3641103999094117, 0.9255208011010677]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double[] doubleArray10 = fDistribution3.sample((int) '#');
        double double11 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.getNumericalMean();
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.6605819689164981, 0.5786319288763598, 1.8858812519507306, 0.6853399249084613, 1.5059425757182425, 0.6500573443646901, 1.8246238063485025, 1.616055300623739, 0.6377772019848327, 2.1468707775240636, 1.781093071083626, 1.7087731032870237, 0.6763582595546549, 0.6138681468556401, 1.5015114254543196, 0.5760827664958271, 1.4661028812929937, 0.5955241298088193, 0.6075964182332577, 3.00999727116901, 0.6235306127269347, 1.5267894272227278, 2.5659927443598933, 1.528275337259077, 1.5201875964715754, 0.6270129288272364, 2.1308135792587906, 1.4739573933312, 0.5938639392474658, 1.391515760495585, 0.6104369919078005, 2.156304641322211, 1.5867574919632772, 0.574957581914879, 0.592632354581438]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.04d + "'", double11 == 1.04d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.04d + "'", double12 == 1.04d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 1, (double) ' ');
        fDistribution3.reseedRandomGenerator(0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double double6 = fDistribution2.cumulativeProbability(0.660864413065614d);
        double double7 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.999809324596262, 1.1591587675833006, 1.0153274484543424, 0.9407363883969723, 0.8057449106666523, 1.0774438819792171, 1.2524464242143214, 0.7685859372931984, 0.7017697914724815, 1.1155236960642967, 0.9824635547356851, 0.9345074389862633, 0.7894624051866342, 0.6880931983337567, 1.1398296267576944, 0.6736084681057173, 0.891012618709553, 1.1067613735229276, 1.2984332327008687, 0.9627945267835735, 0.8019344124711806, 0.6506880998447262, 0.9318969017991384, 0.8341442251492645, 1.2012458398841745, 1.1494688605769199, 0.6577219459545987, 1.1638437035375844, 1.5702291198231992, 0.7013593924391657, 0.9875924389914288, 0.954179559308952]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.019767886005263337d + "'", double6 == 0.019767886005263337d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution3.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            fDistribution4.reseedRandomGenerator((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09652240883912439d + "'", double7 == 0.09652240883912439d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double[] doubleArray6 = fDistribution2.sample((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.201939888928835, 0.941077419019926, 1.2363418078432005, 0.8967729740698178, 1.4096441016568888, 1.1242663707775788, 0.8751951042211698, 0.8662947243027264, 0.9854840698817833, 0.9327260564896647, 0.6328967585128126, 0.8996906066700099, 0.9301938198836728, 1.4169020162593733, 1.0407662070200585, 1.1307447780170472, 1.3209265574404665, 0.9130818479453028, 1.099715052583766, 0.6529740513981338, 1.2660672805229494, 0.9971049833210597, 0.9462957641670655, 0.9974836581816728, 0.6970235106049688, 0.9880453255364573, 0.859541709484209, 1.0697128534450806, 1.1566715743442992, 0.7716286858269397, 0.6802561643346358, 0.8500725267474241]");
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) ' ');
        boolean boolean13 = fDistribution3.isSupportLowerBoundInclusive();
        double double14 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11548333333333333d + "'", double10 == 0.11548333333333333d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) 100.0f);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double7 = fDistribution3.density(1.0E-9d);
        double double10 = fDistribution3.cumulativeProbability(0.019767886005263337d, 1.5396806059889714d);
        java.lang.Class<?> wildcardClass11 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6111078780694479d + "'", double5 == 0.6111078780694479d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9763743821628994E-127d + "'", double7 == 6.9763743821628994E-127d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9182740537213d + "'", double10 == 0.9182740537213d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.cumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.04d + "'", double10 == 1.04d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.cumulativeProbability(1.0E-9d);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1065783047156517d + "'", double4 == 2.1065783047156517d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.36023399548104E-137d + "'", double7 == 4.36023399548104E-137d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        fDistribution2.reseedRandomGenerator((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution2.cumulativeProbability(1.0606060606060606d, 0.6111078780694479d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.061) must be less than or equal to upper endpoint (0.611)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 100, 0.6309456395782457d, (double) (short) -1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        fDistribution2.reseedRandomGenerator((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution2.cumulativeProbability((double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (35) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getNumericalVariance();
        boolean boolean8 = fDistribution4.isSupportLowerBoundInclusive();
        double double10 = fDistribution4.inverseCumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09652240883912439d + "'", double7 == 0.09652240883912439d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 0.6111078780694479d, (double) 10L, (double) (-1L));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double4 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0204081632653061d + "'", double4 == 1.0204081632653061d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 1, (double) ' ');
        double double4 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass7 = fDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (-1L), Double.POSITIVE_INFINITY, 6.9763743821628994E-127d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.11548333333333333d + "'", double7 == 0.11548333333333333d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0606060606060606d + "'", double7 == 1.0606060606060606d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0E-9d, (double) 1.0f, 1.5396806059889714d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double7 = fDistribution3.density(1.0E-9d);
        double double10 = fDistribution3.cumulativeProbability(0.019767886005263337d, 1.5396806059889714d);
        double double13 = fDistribution3.probability(0.5100954971439539d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5542973048612675d + "'", double5 == 0.5542973048612675d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9763743821628994E-127d + "'", double7 == 6.9763743821628994E-127d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9182740537213d + "'", double10 == 0.9182740537213d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.48783899606986947d + "'", double13 == 0.48783899606986947d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(0.660864413065614d, 0.41691984004679694d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double6 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.4492669926998256d + "'", double5 == 1.4492669926998256d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.04d + "'", double6 == 1.04d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 1.5396806059889714d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double double9 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        fDistribution3.reseedRandomGenerator((long) 0);
        double double9 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = fDistribution3.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 35 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 1.5396806059889714d);
        double double3 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) -1, (double) 1L, 1.8303131613029425E-25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double11 = fDistribution3.density((double) 1);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2474990051070387d + "'", double11 == 1.2474990051070387d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100, 1.0d, (double) ' ');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution3.inverseCumulativeProbability(1.5396806059889714d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.54 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalVariance();
        double double8 = fDistribution4.probability(0.0d, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09652240883912439d + "'", double5 == 0.09652240883912439d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double7 = fDistribution2.inverseCumulativeProbability(1.0d);
        double double10 = fDistribution2.cumulativeProbability(3.8245231624947675d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.139710879120685E-11d + "'", double10 == 5.139710879120685E-11d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        java.lang.Class<?> wildcardClass6 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 1L, 6.9763743821628994E-127d, 1.0606060606060606d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double5 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution4.cumulativeProbability(1.6016573064016222d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.602) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09652240883912439d + "'", double7 == 0.09652240883912439d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double[] doubleArray10 = fDistribution3.sample((int) '#');
        double double11 = fDistribution3.getNumericalMean();
        double double12 = fDistribution3.getNumericalMean();
        double double13 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.6474282359902443, 0.6700054043896507, 2.5743009401280568, 1.675411087176349, 1.97869990914911, 0.5974566628428288, 1.4615137195943417, 1.5007942065848345, 0.6116855768347833, 0.6405618134010099, 1.473673941670878, 1.7522552495879042, 1.868768462475952, 1.4323019001502157, 0.6027607474389847, 2.3177762444739094, 1.6624942790244606, 2.694229799600085, 0.6529789983159331, 0.6168987429612787, 0.6540693072500257, 1.818046731553464, 0.6490979889316703, 1.7337409723035164, 0.6509453981959674, 0.5987146680807695, 1.5228151427860412, 0.6681560012092758, 0.5745079207611657, 2.3853799096834405, 1.5137651081024357, 2.1880362960816484, 0.6656282665305179, 1.8398199484382407, 2.3978117135420454]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.04d + "'", double11 == 1.04d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.04d + "'", double12 == 1.04d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.11548333333333333d, 52.0d, (double) 100L);
        double double5 = fDistribution3.probability(0.41691984004679694d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double11 = fDistribution3.density((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistribution3.cumulativeProbability(Double.POSITIVE_INFINITY, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (?) must be less than or equal to upper endpoint (100)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2474990051070387d + "'", double11 == 1.2474990051070387d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        java.lang.Class<?> wildcardClass4 = fDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double double10 = fDistribution3.probability((double) 1L);
        double double12 = fDistribution3.density((double) (byte) 100);
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5435932968585407E-37d + "'", double12 == 2.5435932968585407E-37d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double11 = fDistribution3.density((double) 1);
        double double12 = fDistribution3.getSupportLowerBound();
        double double13 = fDistribution3.getNumericalMean();
        double double15 = fDistribution3.inverseCumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2474990051070387d + "'", double11 == 1.2474990051070387d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.04d + "'", double13 == 1.04d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.2474990051070387d, (double) ' ', (double) (short) 0);
        boolean boolean4 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11548333333333333d + "'", double10 == 0.11548333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        double double7 = fDistribution4.density(0.600974118296547d);
        double double9 = fDistribution4.cumulativeProbability(10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.389118332080223d + "'", double7 == 0.389118332080223d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999999818907d + "'", double9 == 0.9999999999818907d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = fDistribution4.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalMean();
        double double13 = fDistribution3.probability(1.0E-9d, 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.04d + "'", double10 == 1.04d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5352813635270406d + "'", double13 == 0.5352813635270406d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(2.1065783047156517d, 4.36023399548104E-137d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 1.4627249395148658d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.cumulativeProbability((double) (short) 0, 32.0d);
        double double7 = fDistribution2.sample();
        double double8 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4627249395148658d + "'", double3 == 1.4627249395148658d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.931871856951955d + "'", double6 == 0.931871856951955d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 16.971712791151774d + "'", double7 == 16.971712791151774d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 1L, 6.9763743821628994E-127d, 1.0606060606060606d);
        boolean boolean4 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        double double5 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.5542973048612675d, 0.41691984004679694d, (double) (short) 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double6 = fDistribution3.getSupportLowerBound();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.630212703853667d + "'", double4 == 1.630212703853667d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        double double4 = fDistribution2.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(8.663252185563053E-6d, (double) '4', 0.931871856951955d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = fDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10, 2.5435932968585407E-37d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.5435932968585407E-37d + "'", double3 == 2.5435932968585407E-37d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double6 = fDistribution2.getSupportUpperBound();
        java.lang.Class<?> wildcardClass7 = fDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalVariance();
        double double11 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11548333333333333d + "'", double10 == 0.11548333333333333d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11548333333333333d + "'", double11 == 0.11548333333333333d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.6074779627759674d, 1.398660360324075d, (double) (short) 1);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6074779627759674d + "'", double4 == 0.6074779627759674d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        double double13 = fDistribution3.inverseCumulativeProbability(5.139710879120685E-11d);
        double double14 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double double10 = fDistribution3.probability((double) 1L);
        double double12 = fDistribution3.density((double) (byte) 100);
        double double13 = fDistribution3.getNumericalMean();
        double double14 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double16 = fDistribution3.cumulativeProbability(0.09652240883912439d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5435932968585407E-37d + "'", double12 == 2.5435932968585407E-37d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.04d + "'", double13 == 1.04d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.5436849956425015E-10d + "'", double16 == 2.5436849956425015E-10d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        boolean boolean8 = fDistribution3.isSupportConnected();
        double double9 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) (byte) 10, 1.0E-9d, Double.NaN);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.cumulativeProbability(Double.NaN, 0.600974118296547d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10, 2.5435932968585407E-37d);
        double double3 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 1.4627249395148658d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        fDistribution2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4627249395148658d + "'", double3 == 1.4627249395148658d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 1.5396806059889714d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistribution2.cumulativeProbability((double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        boolean boolean9 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0E-9d, (double) 1.0f, 1.5396806059889714d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution4.inverseCumulativeProbability(52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double7 = fDistribution2.inverseCumulativeProbability(1.0d);
        double double8 = fDistribution2.getNumericalVariance();
        double double9 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04295085381091212d + "'", double8 == 0.04295085381091212d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double7 = fDistribution2.inverseCumulativeProbability(1.0d);
        boolean boolean8 = fDistribution2.isSupportLowerBoundInclusive();
        java.lang.Class<?> wildcardClass9 = fDistribution2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, Double.NaN, 0.09652240883912439d, 0.0d);
        double double5 = fDistribution4.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double7 = fDistribution3.density(1.0E-9d);
        double double10 = fDistribution3.cumulativeProbability(0.019767886005263337d, 1.5396806059889714d);
        double double13 = fDistribution3.probability(0.5100954971439539d, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistribution3.inverseCumulativeProbability(1.04d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.04 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.559741114137245d + "'", double5 == 0.559741114137245d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9763743821628994E-127d + "'", double7 == 6.9763743821628994E-127d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9182740537213d + "'", double10 == 0.9182740537213d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.48783899606986947d + "'", double13 == 0.48783899606986947d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.0E-6d, (double) (byte) 0, 0.019767886005263337d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 1.4627249395148658d);
        double double3 = fDistribution2.sample();
        boolean boolean4 = fDistribution2.isSupportConnected();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.675152925748353d + "'", double3 == 5.675152925748353d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        double double4 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double5 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 1, (double) ' ');
        fDistribution3.reseedRandomGenerator(10L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double7 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 1L, 6.9763743821628994E-127d, 1.0606060606060606d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double7 = fDistribution3.cumulativeProbability(4.36023399548104E-137d, 1.2474990051070387d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution3.cumulativeProbability(2.1065783047156517d, 6.9763743821628994E-127d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (2.107) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double10 = fDistribution3.getSupportLowerBound();
        double double12 = fDistribution3.cumulativeProbability((double) (short) -1);
        fDistribution3.reseedRandomGenerator((long) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 1.4627249395148658d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.cumulativeProbability((double) (short) 0, 32.0d);
        double double7 = fDistribution2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistribution2.probability(1.0E-9d, 2.5435932968585407E-37d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4627249395148658d + "'", double3 == 1.4627249395148658d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.931871856951955d + "'", double6 == 0.931871856951955d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.022641934145946d + "'", double7 == 4.022641934145946d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (-1.0f), 0.5542973048612675d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }
}
