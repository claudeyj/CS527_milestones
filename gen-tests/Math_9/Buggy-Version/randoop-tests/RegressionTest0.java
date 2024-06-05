import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.apache.commons.math3.geometry.euclidean.threed.Line line0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.threed.Line line1 = new org.apache.commons.math3.geometry.euclidean.threed.Line(line0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.apache.commons.math3.geometry.euclidean.threed.Vector3D vector3D0 = null;
        org.apache.commons.math3.geometry.euclidean.threed.Vector3D vector3D1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.geometry.euclidean.threed.Line line2 = new org.apache.commons.math3.geometry.euclidean.threed.Line(vector3D0, vector3D1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

