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
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.Class<?> wildcardClass1 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.openpnp.model.Location location0 = null;
        org.openpnp.model.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.getAngleFromPoint(location0, location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.openpnp.model.Location location0 = null;
        org.openpnp.model.Location location1 = null;
        org.openpnp.model.Length length2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openpnp.model.Location location3 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.getPointAlongLine(location0, location1, length2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            org.openpnp.machine.reference.feeder.ReferenceStripFeeder referenceStripFeeder0 = new org.openpnp.machine.reference.feeder.ReferenceStripFeeder();
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Configuration instance not yet initialized.");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.Class<?> wildcardClass2 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.Class<?> wildcardClass1 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.Class<?> wildcardClass2 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.Class<?> wildcardClass3 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.Class<?> wildcardClass1 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.Class<?> wildcardClass4 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.Class<?> wildcardClass6 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.Class<?> wildcardClass5 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.Class<?> wildcardClass7 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.Class<?> wildcardClass2 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.Class<?> wildcardClass8 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.Class<?> wildcardClass3 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.Class<?> wildcardClass4 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.Class<?> wildcardClass4 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.Class<?> wildcardClass5 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.Class<?> wildcardClass9 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.Class<?> wildcardClass5 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.Class<?> wildcardClass3 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.Class<?> wildcardClass7 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.Class<?> wildcardClass6 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.Class<?> wildcardClass8 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.Class<?> wildcardClass11 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.Class<?> wildcardClass13 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.Class<?> wildcardClass10 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.Class<?> wildcardClass12 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.Class<?> wildcardClass6 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.Class<?> wildcardClass7 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.Class<?> wildcardClass10 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.Class<?> wildcardClass14 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.Class<?> wildcardClass11 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.Class<?> wildcardClass9 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.Class<?> wildcardClass15 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.Class<?> wildcardClass8 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.Class<?> wildcardClass9 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.Class<?> wildcardClass12 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.Class<?> wildcardClass10 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.Class<?> wildcardClass13 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.Class<?> wildcardClass17 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.Class<?> wildcardClass11 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.Class<?> wildcardClass14 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.Class<?> wildcardClass16 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.Class<?> wildcardClass20 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.Class<?> wildcardClass19 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.Class<?> wildcardClass15 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.Class<?> wildcardClass21 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.Class<?> wildcardClass16 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.Class<?> wildcardClass12 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.Class<?> wildcardClass18 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.Class<?> wildcardClass13 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.Class<?> wildcardClass15 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Clear Plastic" + "'", str14, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.Class<?> wildcardClass14 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.Class<?> wildcardClass16 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Clear Plastic" + "'", str14, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Clear Plastic" + "'", str15, "Clear Plastic");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.String str21 = tapeType0.toString();
        java.lang.String str22 = tapeType0.toString();
        java.lang.String str23 = tapeType0.toString();
        java.lang.Class<?> wildcardClass24 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Black Plastic" + "'", str23, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.String str21 = tapeType0.toString();
        java.lang.String str22 = tapeType0.toString();
        java.lang.Class<?> wildcardClass23 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.Class<?> wildcardClass19 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "White Paper" + "'", str17, "White Paper");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "White Paper" + "'", str18, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.String str21 = tapeType0.toString();
        java.lang.Class<?> wildcardClass22 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.Class<?> wildcardClass17 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.Class<?> wildcardClass18 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "White Paper" + "'", str17, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.String str21 = tapeType0.toString();
        java.lang.String str22 = tapeType0.toString();
        java.lang.String str23 = tapeType0.toString();
        java.lang.String str24 = tapeType0.toString();
        java.lang.String str25 = tapeType0.toString();
        java.lang.String str26 = tapeType0.toString();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Black Plastic" + "'", str23, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Black Plastic" + "'", str24, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Black Plastic" + "'", str25, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Black Plastic" + "'", str26, "Black Plastic");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Clear Plastic" + "'", str14, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Clear Plastic" + "'", str15, "Clear Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Clear Plastic" + "'", str16, "Clear Plastic");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.String str21 = tapeType0.toString();
        java.lang.String str22 = tapeType0.toString();
        java.lang.String str23 = tapeType0.toString();
        java.lang.String str24 = tapeType0.toString();
        java.lang.Class<?> wildcardClass25 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Black Plastic" + "'", str23, "Black Plastic");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Black Plastic" + "'", str24, "Black Plastic");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        java.lang.String str1 = tapeType0.toString();
        java.lang.String str2 = tapeType0.toString();
        java.lang.String str3 = tapeType0.toString();
        java.lang.String str4 = tapeType0.toString();
        java.lang.String str5 = tapeType0.toString();
        java.lang.String str6 = tapeType0.toString();
        java.lang.String str7 = tapeType0.toString();
        java.lang.String str8 = tapeType0.toString();
        java.lang.String str9 = tapeType0.toString();
        java.lang.String str10 = tapeType0.toString();
        java.lang.String str11 = tapeType0.toString();
        java.lang.String str12 = tapeType0.toString();
        java.lang.String str13 = tapeType0.toString();
        java.lang.String str14 = tapeType0.toString();
        java.lang.String str15 = tapeType0.toString();
        java.lang.String str16 = tapeType0.toString();
        java.lang.String str17 = tapeType0.toString();
        java.lang.String str18 = tapeType0.toString();
        java.lang.String str19 = tapeType0.toString();
        java.lang.String str20 = tapeType0.toString();
        java.lang.Class<?> wildcardClass21 = tapeType0.getClass();
        org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "White Paper" + "'", str17, "White Paper");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "White Paper" + "'", str18, "White Paper");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "White Paper" + "'", str19, "White Paper");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "White Paper" + "'", str20, "White Paper");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

