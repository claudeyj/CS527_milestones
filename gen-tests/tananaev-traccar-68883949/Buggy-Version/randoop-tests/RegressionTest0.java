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
        org.traccar.database.PermissionsManager permissionsManager0 = org.traccar.Context.getPermissionsManager();
        org.junit.Assert.assertNull(permissionsManager0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.traccar.database.DataManager dataManager0 = org.traccar.Context.getDataManager();
        org.junit.Assert.assertNull(dataManager0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.Context.init(strArray0);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Connections could not be acquired from the underlying database!");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }
}

