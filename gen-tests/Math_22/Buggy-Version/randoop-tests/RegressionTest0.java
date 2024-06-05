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
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.852535450683186d + "'", double4 == 1.852535450683186d);
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
            double double7 = fDistribution3.cumulativeProbability(1.4156934670037509d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1.416) must be less than or equal to upper endpoint (-1)");
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
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution3.inverseCumulativeProbability(1.4156934670037509d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.416 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution4.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double6 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double8 = fDistribution3.cumulativeProbability((double) (byte) 100);
        double double10 = fDistribution3.probability((double) 1L);
        double double12 = fDistribution3.density((double) (byte) 100);
        boolean boolean13 = fDistribution3.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5435932968585407E-37d + "'", double12 == 2.5435932968585407E-37d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double8 = fDistribution3.probability(1.0606060606060606d, (double) 10.0f);
        double double10 = fDistribution3.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41691984004679694d + "'", double8 == 0.41691984004679694d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(1.2474990051070387d, (double) ' ', (double) (short) 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        boolean boolean5 = fDistribution3.isSupportConnected();
        double double6 = fDistribution3.sample();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5581271419632108d + "'", double4 == 0.5581271419632108d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.4319483852680703d + "'", double6 == 1.4319483852680703d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        boolean boolean5 = fDistribution4.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double8 = fDistribution2.probability(0.0d, 0.41691984004679694d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.663252185563053E-6d + "'", double8 == 8.663252185563053E-6d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0606060606060606d + "'", double6 == 1.0606060606060606d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 0.626060586338863d);
        double double3 = fDistribution2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.41648793629172826d + "'", double3 == 0.41648793629172826d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        boolean boolean8 = fDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 0.626060586338863d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double4 = fDistribution2.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.626060586338863d + "'", double3 == 0.626060586338863d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.04d, 1.0E-6d, Double.POSITIVE_INFINITY);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double double5 = fDistribution2.getSupportUpperBound();
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0586757364580157, 0.7313894334559393, 0.9636276680403274, 0.9698713049558391, 0.8507494541503263, 1.359372203555218, 1.18270751221939, 0.8445667214270132, 1.1011250804150055, 1.3509720379117462, 0.8819559487142907, 0.9116475604011962, 0.9862471891372617, 0.9608415641852639, 0.972071319692753, 0.5875047104727847, 0.8563905536985635, 1.0792706895381088, 0.717352070178162, 1.4821812551499793, 1.2828053085117683, 1.0552594279156036, 0.9409647749921126, 1.0469093140184669, 1.332381265576114, 0.9747891191293573, 1.3650751645416772, 1.358270820122037, 1.130454043810085, 1.264774959108438, 1.1409284703893965, 0.8590229351100434]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.6195177466448822, 1.3958179580559218, 0.6239703595452735, 0.6810960588378614, 0.6842886071866523, 1.509904524419079, 0.5761054883994603, 1.6033236359821796, 1.4426532822947429, 1.4255834882737433, 0.6102932755571069, 0.5699004486361863, 1.3732052030420607, 0.602791279962016, 0.6032836154623716, 1.8209598349229816, 1.4950914035478806, 2.378963715975713, 1.4980375642117942, 3.1128537969471957, 0.5861828388957949, 1.8872218250655033, 0.5612730184232065, 0.6186988391614401, 0.651953642258662, 1.9715421007188927, 1.4035894250627226, 0.6334119311731932, 0.5899507427286482, 0.5610644044606982, 0.676665152130721, 0.5555982148215696, 0.5744215721960989, 1.9942714936151769, 1.686262269684209]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.04d + "'", double11 == 1.04d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.04d + "'", double12 == 1.04d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 1, (double) ' ');
        fDistribution3.reseedRandomGenerator(0L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 0.626060586338863d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double6 = fDistribution2.cumulativeProbability((double) (short) 0, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.626060586338863d + "'", double3 == 0.626060586338863d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7388507789659673d + "'", double6 == 0.7388507789659673d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double[] doubleArray6 = fDistribution2.sample((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.1805012878698717, 1.0453782048962268, 0.7165418994937003, 0.9572926698702564, 1.4146550225361891, 1.50203466133924, 1.208037155471987, 0.8283959523505071, 0.9626138654471885, 1.252200307500743, 0.9442993826234737, 1.390755821355143, 1.436559200278718, 0.7674117444872971, 1.1224119581292293, 0.9381424374369137, 1.7235915350670314, 0.6518039530768489, 0.755788816097108, 1.081307739192698, 1.002801925095013, 1.2296891693312821, 1.1781546818356512, 1.2960025263521375, 0.8693751890632319, 0.9956489876646448, 1.4945945595740615, 1.1174631022869443, 1.167755403180028, 1.2389752206940035, 0.9923500788772045, 0.8234984108012794]");
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) 100.0f);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double7 = fDistribution3.density(1.0E-9d);
        double double10 = fDistribution3.cumulativeProbability(0.9991464280668363d, 1.4156934670037509d);
        java.lang.Class<?> wildcardClass11 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.264052298244972d + "'", double5 == 2.264052298244972d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9763743821628994E-127d + "'", double7 == 6.9763743821628994E-127d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3607074498973102d + "'", double10 == 0.3607074498973102d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution3.cumulativeProbability(1.0E-9d);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5878138564879554d + "'", double4 == 0.5878138564879554d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.36023399548104E-137d + "'", double7 == 4.36023399548104E-137d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 0.0f, (double) (byte) 1, 2.5435932968585407E-37d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistribution2.cumulativeProbability(0.41648793629172826d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0.416) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double7 = fDistribution2.density((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 2.264052298244972d, (double) 10L, (double) (-1L));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double4 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0204081632653061d + "'", double4 == 1.0204081632653061d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 1, (double) ' ');
        double double4 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double7 = fDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.11548333333333333d + "'", double7 == 0.11548333333333333d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0E-9d, (double) 1.0f, 1.4156934670037509d);
        double double5 = fDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double7 = fDistribution3.density(1.0E-9d);
        double double10 = fDistribution3.cumulativeProbability(0.9991464280668363d, 1.4156934670037509d);
        double double13 = fDistribution3.probability(0.5100954971439539d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.163158605059185d + "'", double5 == 2.163158605059185d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9763743821628994E-127d + "'", double7 == 6.9763743821628994E-127d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3607074498973102d + "'", double10 == 0.3607074498973102d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.48783899606986947d + "'", double13 == 0.48783899606986947d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.8854066430986287d, 0.41691984004679694d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double6 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6510913243593629d + "'", double5 == 0.6510913243593629d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.04d + "'", double6 == 1.04d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 1.4156934670037509d);
        boolean boolean3 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.11548333333333333d, 52.0d, (double) 100L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getSupportUpperBound();
        double double4 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution3.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 10L, 1.4156934670037509d);
        double double3 = fDistribution2.getNumericalMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (short) -1, (double) 1L, 1.8303131613029425E-25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100, 1.0d, (double) ' ');
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistribution3.inverseCumulativeProbability(1.4156934670037509d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.416 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double7 = fDistribution2.inverseCumulativeProbability(1.0d);
        double double10 = fDistribution2.cumulativeProbability(0.41648793629172826d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999915276579888d + "'", double10 == 0.9999915276579888d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        java.lang.Class<?> wildcardClass6 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) 1L, 6.9763743821628994E-127d, 1.0606060606060606d);
        double double4 = fDistribution3.getSupportUpperBound();
        double double5 = fDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getDenominatorDegreesOfFreedom();
        boolean boolean5 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getNumericalVariance();
        double double10 = fDistribution4.cumulativeProbability((double) (byte) 1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09652240883912439d + "'", double7 == 0.09652240883912439d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 100, 0.626060586338863d);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double4 = fDistribution2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.626060586338863d + "'", double3 == 0.626060586338863d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.626060586338863d + "'", double4 == 0.626060586338863d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        double double6 = fDistribution2.probability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass5 = fDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.getNumericalVariance();
        double double5 = fDistribution3.sample();
        double double7 = fDistribution3.density(1.0E-9d);
        double double10 = fDistribution3.cumulativeProbability(0.9991464280668363d, 1.4156934670037509d);
        double double13 = fDistribution3.probability(0.5100954971439539d, (double) (byte) 1);
        boolean boolean14 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11548333333333333d + "'", double4 == 0.11548333333333333d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.591946597615608d + "'", double5 == 1.591946597615608d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9763743821628994E-127d + "'", double7 == 6.9763743821628994E-127d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3607074498973102d + "'", double10 == 0.3607074498973102d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.48783899606986947d + "'", double13 == 0.48783899606986947d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double4 = fDistribution3.sample();
        double double5 = fDistribution3.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistribution3.inverseCumulativeProbability(Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException; message: function values at endpoints do not have different signs, endpoints: [0, ?], values: [?, ?]");
        } catch (org.apache.commons.math3.exception.NoBracketingException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5308013116916737d + "'", double4 == 1.5308013116916737d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        boolean boolean6 = fDistribution3.isSupportUpperBoundInclusive();
        double double9 = fDistribution3.cumulativeProbability((double) (short) -1, 0.0d);
        boolean boolean10 = fDistribution3.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 0, 0.11548333333333333d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution(0.3607074498973102d, (double) (byte) 100, 0.48783899606986947d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        double double7 = fDistribution2.inverseCumulativeProbability(1.0d);
        boolean boolean8 = fDistribution2.isSupportLowerBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        fDistribution2.reseedRandomGenerator((long) '4');
        double double8 = fDistribution2.cumulativeProbability(1.0606060606060606d, 2.264052298244972d);
        double double9 = fDistribution2.getNumeratorDegreesOfFreedom();
        double double11 = fDistribution2.cumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.38456135447581064d + "'", double8 == 0.38456135447581064d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getDenominatorDegreesOfFreedom();
        double double5 = fDistribution2.density((double) 10);
        boolean boolean6 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8303131613029425E-25d + "'", double5 == 1.8303131613029425E-25d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double7 = fDistribution3.density(0.0d);
        double double9 = fDistribution3.probability((double) (byte) 1);
        double double10 = fDistribution3.getSupportLowerBound();
        boolean boolean11 = fDistribution3.isSupportUpperBoundInclusive();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistribution3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.probability((double) (short) -1);
        double double6 = fDistribution3.getNumeratorDegreesOfFreedom();
        boolean boolean7 = fDistribution3.isSupportConnected();
        double double8 = fDistribution3.getNumeratorDegreesOfFreedom();
        double double9 = fDistribution3.getNumericalMean();
        double double10 = fDistribution3.getNumericalVariance();
        fDistribution3.reseedRandomGenerator((long) ' ');
        double double13 = fDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11548333333333333d + "'", double10 == 0.11548333333333333d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) 100.0f);
        double double3 = fDistribution2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3071572884605822d + "'", double3 == 1.3071572884605822d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, 1.0E-9d, (double) 1.0f, 1.4156934670037509d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = fDistribution4.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double[] doubleArray4 = fDistribution2.sample((int) ' ');
        double double6 = fDistribution2.cumulativeProbability(1.8854066430986287d);
        double double7 = fDistribution2.getSupportLowerBound();
        double double10 = fDistribution2.cumulativeProbability(1.2474990051070387d, (double) (short) 100);
        double double11 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertNotNull(doubleArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.9163689121840727, 1.393167274722689, 1.064979722504693, 1.174713934074015, 1.263156672874464, 1.138467642599582, 0.7633687399535913, 1.499588810374659, 1.0885017360422984, 1.0823615668748887, 1.2586968616349727, 1.3828969252153906, 0.9562277400895117, 0.9068097961166706, 1.0378642403528713, 0.681399120235566, 1.2773555923439144, 0.7606004716882377, 1.4335805123047505, 1.446987819001876, 0.8557572257451453, 0.8336600185950455, 1.2412125143628674, 1.075311974936305, 1.2124256904438422, 1.2019657904813454, 0.9215546645034143, 1.061431167170768, 1.00346779664531, 0.7871500832421308, 0.8061351705178698, 0.8750920186585526]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9991464280668363d + "'", double6 == 0.9991464280668363d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.13526883789928168d + "'", double10 == 0.13526883789928168d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.FDistribution fDistribution4 = new org.apache.commons.math3.distribution.FDistribution(randomGenerator0, (double) 100.0f, (double) '#', (-1.0d));
        double double5 = fDistribution4.getNumericalMean();
        double double6 = fDistribution4.getNumeratorDegreesOfFreedom();
        double double7 = fDistribution4.getNumericalMean();
        double double8 = fDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0606060606060606d + "'", double7 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double6 = fDistribution3.getSupportLowerBound();
        double double8 = fDistribution3.probability((double) (short) 1);
        double double11 = fDistribution3.probability((double) (-1L), (double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) (byte) 0, Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: degrees of freedom (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(1.8303131613029425E-25d, Double.NaN);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math3.distribution.FDistribution fDistribution3 = new org.apache.commons.math3.distribution.FDistribution((double) ' ', (double) '4', (double) (byte) 100);
        double double5 = fDistribution3.cumulativeProbability((double) (short) 1);
        double double6 = fDistribution3.getSupportLowerBound();
        double double8 = fDistribution3.probability((double) (short) 1);
        double double9 = fDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5100954971439539d + "'", double5 == 0.5100954971439539d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.04d + "'", double9 == 1.04d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution((double) 100L, (double) (byte) 100);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math3.distribution.FDistribution fDistribution2 = new org.apache.commons.math3.distribution.FDistribution(10.0d, (double) (short) 1);
        double double3 = fDistribution2.getNumeratorDegreesOfFreedom();
        boolean boolean4 = fDistribution2.isSupportUpperBoundInclusive();
        double double5 = fDistribution2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }
}
