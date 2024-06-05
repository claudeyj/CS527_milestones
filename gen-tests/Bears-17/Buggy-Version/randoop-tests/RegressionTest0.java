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
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass1 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        java.lang.Class<?> wildcardClass21 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray67 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray67);
        java.lang.Class<?> wildcardClass69 = namedTypeArray67.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(namedTypeArray67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray65 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray65);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray67 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray67);
        java.lang.Class<?>[] wildcardClassArray69 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdSubtypeResolver0.registerSubtypes(wildcardClassArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(namedTypeArray65);
        org.junit.Assert.assertNotNull(namedTypeArray67);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        java.lang.Class<?> wildcardClass67 = wildcardClassArray56.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdSubtypeResolver0.registerSubtypes(namedTypeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        java.lang.Class<?> wildcardClass45 = wildcardClassArray33.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray76);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdSubtypeResolver0.registerSubtypes(namedTypeArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray76);
        java.lang.Class<?> wildcardClass87 = wildcardClassArray76.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray65 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray65);
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(namedTypeArray65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType67 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray68 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType67 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray68);
        java.lang.Class<?> wildcardClass70 = namedTypeArray68.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(namedTypeArray68);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        java.lang.Class<?> wildcardClass43 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray44 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver1.registerSubtypes(namedTypeArray44);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver53 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass54 = stdSubtypeResolver53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass48;
        wildcardClassArray57[1] = wildcardClass50;
        wildcardClassArray57[2] = wildcardClass52;
        wildcardClassArray57[3] = wildcardClass54;
        stdSubtypeResolver46.registerSubtypes(wildcardClassArray57);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray57);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray57);
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        java.lang.Class<?> wildcardClass45 = namedTypeArray43.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType45 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray46 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType45 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray46);
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray77);
        java.lang.Class<?> wildcardClass89 = wildcardClassArray77.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray67 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray67);
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(namedTypeArray67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray44 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver1.registerSubtypes(namedTypeArray44);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver53 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass54 = stdSubtypeResolver53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass48;
        wildcardClassArray57[1] = wildcardClass50;
        wildcardClassArray57[2] = wildcardClass52;
        wildcardClassArray57[3] = wildcardClass54;
        stdSubtypeResolver46.registerSubtypes(wildcardClassArray57);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray57);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray68 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver1.registerSubtypes(namedTypeArray68);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType70 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray71 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType70 };
        stdSubtypeResolver1.registerSubtypes(namedTypeArray71);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray71);
        java.lang.Class<?> wildcardClass74 = namedTypeArray71.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(namedTypeArray68);
        org.junit.Assert.assertNotNull(namedTypeArray71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType45 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray46 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType45 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray46);
        java.lang.Class<?> wildcardClass48 = namedTypeArray46.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray44 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver1.registerSubtypes(namedTypeArray44);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver53 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass54 = stdSubtypeResolver53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass48;
        wildcardClassArray57[1] = wildcardClass50;
        wildcardClassArray57[2] = wildcardClass52;
        wildcardClassArray57[3] = wildcardClass54;
        stdSubtypeResolver46.registerSubtypes(wildcardClassArray57);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray57);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray68 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver1.registerSubtypes(namedTypeArray68);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType70 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray71 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType70 };
        stdSubtypeResolver1.registerSubtypes(namedTypeArray71);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray71);
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(namedTypeArray68);
        org.junit.Assert.assertNotNull(namedTypeArray71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray77);
        java.lang.Class<?> wildcardClass89 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        java.lang.Class<?> wildcardClass21 = wildcardClassArray11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray65 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray65);
        java.lang.Class<?> wildcardClass67 = namedTypeArray65.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(namedTypeArray65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray88 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray88);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType90 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray91 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType90 };
        stdSubtypeResolver21.registerSubtypes(namedTypeArray91);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray91);
        java.lang.Class<?> wildcardClass94 = namedTypeArray91.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray88);
        org.junit.Assert.assertNotNull(namedTypeArray91);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver53 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass54 = stdSubtypeResolver53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass48;
        wildcardClassArray57[1] = wildcardClass50;
        wildcardClassArray57[2] = wildcardClass52;
        wildcardClassArray57[3] = wildcardClass54;
        stdSubtypeResolver46.registerSubtypes(wildcardClassArray57);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver74 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass75 = stdSubtypeResolver74.getClass();
        java.lang.Class[] classArray77 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        wildcardClassArray78[0] = wildcardClass69;
        wildcardClassArray78[1] = wildcardClass71;
        wildcardClassArray78[2] = wildcardClass73;
        wildcardClassArray78[3] = wildcardClass75;
        stdSubtypeResolver67.registerSubtypes(wildcardClassArray78);
        stdSubtypeResolver46.registerSubtypes(wildcardClassArray78);
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray78);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass46;
        wildcardClassArray55[1] = wildcardClass48;
        wildcardClassArray55[2] = wildcardClass50;
        wildcardClassArray55[3] = wildcardClass52;
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray55);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray76);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType88 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType88 };
        stdSubtypeResolver43.registerSubtypes(namedTypeArray89);
        java.lang.Class<?> wildcardClass91 = stdSubtypeResolver43.getClass();
        java.lang.Class[] classArray93 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray94 = (java.lang.Class<?>[]) classArray93;
        wildcardClassArray94[0] = wildcardClass91;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray94);
        java.lang.Class<?> wildcardClass98 = wildcardClassArray94.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(classArray93);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray76);
        java.lang.Class<?>[] wildcardClassArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdSubtypeResolver0.registerSubtypes(wildcardClassArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray76);
        java.lang.Class<?> wildcardClass87 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray44 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver1.registerSubtypes(namedTypeArray44);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver53 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass54 = stdSubtypeResolver53.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass48;
        wildcardClassArray57[1] = wildcardClass50;
        wildcardClassArray57[2] = wildcardClass52;
        wildcardClassArray57[3] = wildcardClass54;
        stdSubtypeResolver46.registerSubtypes(wildcardClassArray57);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray57);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray57);
        java.lang.Class<?> wildcardClass69 = wildcardClassArray57.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType45 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray46 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType45 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray46);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver54 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass55 = stdSubtypeResolver54.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver56 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass57 = stdSubtypeResolver56.getClass();
        java.lang.Class[] classArray59 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass51;
        wildcardClassArray60[1] = wildcardClass53;
        wildcardClassArray60[2] = wildcardClass55;
        wildcardClassArray60[3] = wildcardClass57;
        stdSubtypeResolver49.registerSubtypes(wildcardClassArray60);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver75 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass76 = stdSubtypeResolver75.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver77 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass78 = stdSubtypeResolver77.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        wildcardClassArray81[0] = wildcardClass72;
        wildcardClassArray81[1] = wildcardClass74;
        wildcardClassArray81[2] = wildcardClass76;
        wildcardClassArray81[3] = wildcardClass78;
        stdSubtypeResolver70.registerSubtypes(wildcardClassArray81);
        stdSubtypeResolver49.registerSubtypes(wildcardClassArray81);
        stdSubtypeResolver48.registerSubtypes(wildcardClassArray81);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType93 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray94 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType93 };
        stdSubtypeResolver48.registerSubtypes(namedTypeArray94);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray94);
        java.lang.Class<?> wildcardClass97 = namedTypeArray94.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray46);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(namedTypeArray94);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType67 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray68 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType67 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray68);
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(namedTypeArray68);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass46;
        wildcardClassArray55[1] = wildcardClass48;
        wildcardClassArray55[2] = wildcardClass50;
        wildcardClassArray55[3] = wildcardClass52;
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray55);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray55);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray77);
        java.lang.Class<?> wildcardClass89 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray67 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray67);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver74 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass75 = stdSubtypeResolver74.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver76 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass77 = stdSubtypeResolver76.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass71;
        wildcardClassArray80[1] = wildcardClass73;
        wildcardClassArray80[2] = wildcardClass75;
        wildcardClassArray80[3] = wildcardClass77;
        stdSubtypeResolver69.registerSubtypes(wildcardClassArray80);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(namedTypeArray67);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray65 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray65);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray67 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray67);
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(namedTypeArray65);
        org.junit.Assert.assertNotNull(namedTypeArray67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass46;
        wildcardClassArray55[1] = wildcardClass48;
        wildcardClassArray55[2] = wildcardClass50;
        wildcardClassArray55[3] = wildcardClass52;
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray55);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray55);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray89);
        java.lang.Class<?> wildcardClass91 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass46;
        wildcardClassArray55[1] = wildcardClass48;
        wildcardClassArray55[2] = wildcardClass50;
        wildcardClassArray55[3] = wildcardClass52;
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray55);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray76);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType88 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType88 };
        stdSubtypeResolver43.registerSubtypes(namedTypeArray89);
        java.lang.Class<?> wildcardClass91 = stdSubtypeResolver43.getClass();
        java.lang.Class[] classArray93 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray94 = (java.lang.Class<?>[]) classArray93;
        wildcardClassArray94[0] = wildcardClass91;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray94);
        java.lang.Class<?> wildcardClass98 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(classArray93);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType88 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType88 };
        stdSubtypeResolver21.registerSubtypes(namedTypeArray89);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray89);
        java.lang.Class<?> wildcardClass92 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType88 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType88 };
        stdSubtypeResolver21.registerSubtypes(namedTypeArray89);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray89);
        java.lang.Class<?> wildcardClass92 = namedTypeArray89.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass3 = stdSubtypeResolver2.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass5 = stdSubtypeResolver4.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass7 = stdSubtypeResolver6.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass9 = stdSubtypeResolver8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass3;
        wildcardClassArray12[1] = wildcardClass5;
        wildcardClassArray12[2] = wildcardClass7;
        wildcardClassArray12[3] = wildcardClass9;
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray12);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass24 = stdSubtypeResolver23.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass26 = stdSubtypeResolver25.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass28 = stdSubtypeResolver27.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass30 = stdSubtypeResolver29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass24;
        wildcardClassArray33[1] = wildcardClass26;
        wildcardClassArray33[2] = wildcardClass28;
        wildcardClassArray33[3] = wildcardClass30;
        stdSubtypeResolver22.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver1.registerSubtypes(wildcardClassArray33);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray33);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray45 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray45);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(namedTypeArray45);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver51 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass52 = stdSubtypeResolver51.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass46;
        wildcardClassArray55[1] = wildcardClass48;
        wildcardClassArray55[2] = wildcardClass50;
        wildcardClassArray55[3] = wildcardClass52;
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray55);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass67 = stdSubtypeResolver66.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver68 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass69 = stdSubtypeResolver68.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver70 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass71 = stdSubtypeResolver70.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver72 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass73 = stdSubtypeResolver72.getClass();
        java.lang.Class[] classArray75 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        wildcardClassArray76[0] = wildcardClass67;
        wildcardClassArray76[1] = wildcardClass69;
        wildcardClassArray76[2] = wildcardClass71;
        wildcardClassArray76[3] = wildcardClass73;
        stdSubtypeResolver65.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver44.registerSubtypes(wildcardClassArray76);
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray76);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType88 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType88 };
        stdSubtypeResolver43.registerSubtypes(namedTypeArray89);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray89);
        java.lang.Class<?> wildcardClass92 = namedTypeArray89.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType45 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray46 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType45 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray46);
        java.lang.Class<?> wildcardClass48 = namedTypeArray46.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(namedTypeArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass47;
        wildcardClassArray56[1] = wildcardClass49;
        wildcardClassArray56[2] = wildcardClass51;
        wildcardClassArray56[3] = wildcardClass53;
        stdSubtypeResolver45.registerSubtypes(wildcardClassArray56);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray56);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray67 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray67);
        java.lang.Class<?>[] wildcardClassArray69 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdSubtypeResolver0.registerSubtypes(wildcardClassArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(namedTypeArray67);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass10 = stdSubtypeResolver9.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        wildcardClassArray13[0] = wildcardClass4;
        wildcardClassArray13[1] = wildcardClass6;
        wildcardClassArray13[2] = wildcardClass8;
        wildcardClassArray13[3] = wildcardClass10;
        stdSubtypeResolver2.registerSubtypes(wildcardClassArray13);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass31 = stdSubtypeResolver30.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass25;
        wildcardClassArray34[1] = wildcardClass27;
        wildcardClassArray34[2] = wildcardClass29;
        wildcardClassArray34[3] = wildcardClass31;
        stdSubtypeResolver23.registerSubtypes(wildcardClassArray34);
        stdSubtypeResolver2.registerSubtypes(wildcardClassArray34);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray45 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver2.registerSubtypes(namedTypeArray45);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver52 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass53 = stdSubtypeResolver52.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver54 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass55 = stdSubtypeResolver54.getClass();
        java.lang.Class[] classArray57 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass49;
        wildcardClassArray58[1] = wildcardClass51;
        wildcardClassArray58[2] = wildcardClass53;
        wildcardClassArray58[3] = wildcardClass55;
        stdSubtypeResolver47.registerSubtypes(wildcardClassArray58);
        stdSubtypeResolver2.registerSubtypes(wildcardClassArray58);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray69 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver2.registerSubtypes(namedTypeArray69);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType71 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray72 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType71 };
        stdSubtypeResolver2.registerSubtypes(namedTypeArray72);
        stdSubtypeResolver1.registerSubtypes(namedTypeArray72);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray72);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType76 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray77 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType76 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray77);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(namedTypeArray45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(namedTypeArray69);
        org.junit.Assert.assertNotNull(namedTypeArray72);
        org.junit.Assert.assertNotNull(namedTypeArray77);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver64 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver65 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass66 = stdSubtypeResolver65.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        java.lang.Class[] classArray74 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        wildcardClassArray75[0] = wildcardClass66;
        wildcardClassArray75[1] = wildcardClass68;
        wildcardClassArray75[2] = wildcardClass70;
        wildcardClassArray75[3] = wildcardClass72;
        stdSubtypeResolver64.registerSubtypes(wildcardClassArray75);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray75);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray86 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray86);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray86);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray89 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver0.registerSubtypes(namedTypeArray89);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(namedTypeArray86);
        org.junit.Assert.assertNotNull(namedTypeArray89);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver44 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass45 = stdSubtypeResolver44.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver46 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass47 = stdSubtypeResolver46.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver48 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass49 = stdSubtypeResolver48.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver50 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass51 = stdSubtypeResolver50.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass45;
        wildcardClassArray54[1] = wildcardClass47;
        wildcardClassArray54[2] = wildcardClass49;
        wildcardClassArray54[3] = wildcardClass51;
        stdSubtypeResolver43.registerSubtypes(wildcardClassArray54);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray54);
        java.lang.Class<?> wildcardClass65 = wildcardClassArray54.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray88 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray88);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType90 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray91 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType90 };
        stdSubtypeResolver21.registerSubtypes(namedTypeArray91);
        stdSubtypeResolver0.registerSubtypes(namedTypeArray91);
        java.lang.Class<?> wildcardClass94 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray88);
        org.junit.Assert.assertNotNull(namedTypeArray91);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType89 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray90 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType89 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray90);
        java.lang.Class<?> wildcardClass92 = namedTypeArray90.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray90);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass2 = stdSubtypeResolver1.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass4 = stdSubtypeResolver3.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass6 = stdSubtypeResolver5.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass8 = stdSubtypeResolver7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass4;
        wildcardClassArray11[2] = wildcardClass6;
        wildcardClassArray11[3] = wildcardClass8;
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray11);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass23 = stdSubtypeResolver22.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass25 = stdSubtypeResolver24.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass27 = stdSubtypeResolver26.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass29 = stdSubtypeResolver28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass23;
        wildcardClassArray32[1] = wildcardClass25;
        wildcardClassArray32[2] = wildcardClass27;
        wildcardClassArray32[3] = wildcardClass29;
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray32);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver42 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver43 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass44 = stdSubtypeResolver43.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver45 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass46 = stdSubtypeResolver45.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver47 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass48 = stdSubtypeResolver47.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver49 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass50 = stdSubtypeResolver49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass44;
        wildcardClassArray53[1] = wildcardClass46;
        wildcardClassArray53[2] = wildcardClass48;
        wildcardClassArray53[3] = wildcardClass50;
        stdSubtypeResolver42.registerSubtypes(wildcardClassArray53);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray53);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray64 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        stdSubtypeResolver21.registerSubtypes(namedTypeArray64);
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver66 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver67 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass68 = stdSubtypeResolver67.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver69 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass70 = stdSubtypeResolver69.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver71 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass72 = stdSubtypeResolver71.getClass();
        com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver stdSubtypeResolver73 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        java.lang.Class<?> wildcardClass74 = stdSubtypeResolver73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass68;
        wildcardClassArray77[1] = wildcardClass70;
        wildcardClassArray77[2] = wildcardClass72;
        wildcardClassArray77[3] = wildcardClass74;
        stdSubtypeResolver66.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver21.registerSubtypes(wildcardClassArray77);
        stdSubtypeResolver0.registerSubtypes(wildcardClassArray77);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType89 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray90 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType89 };
        stdSubtypeResolver0.registerSubtypes(namedTypeArray90);
        java.lang.Class<?> wildcardClass92 = stdSubtypeResolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(namedTypeArray64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(namedTypeArray90);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }
}

