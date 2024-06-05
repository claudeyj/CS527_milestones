import org.apache.commons.math3.complex.Complex;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        Complex complex3 = complex0.multiply((double) (short) 1);
        Complex complex4 = complex3.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }
}
