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
        java_programs.WRAP wRAP0 = new java_programs.WRAP();
        java.lang.Class<?> wildcardClass1 = wRAP0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.util.ArrayList<java.lang.String> strList2 = java_programs.WRAP.wrap("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }
}

