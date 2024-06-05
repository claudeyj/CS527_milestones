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
        io.github.classgraph.ClassGraph.CircumventEncapsulationMethod circumventEncapsulationMethod0 = io.github.classgraph.ClassGraph.CIRCUMVENT_ENCAPSULATION;
        java.lang.Class<?> wildcardClass1 = circumventEncapsulationMethod0.getClass();
        org.junit.Assert.assertTrue("'" + circumventEncapsulationMethod0 + "' != '" + io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE + "'", circumventEncapsulationMethod0.equals(io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        io.github.classgraph.ClassGraph.CircumventEncapsulationMethod circumventEncapsulationMethod0 = io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.JVM_DRIVER;
        org.junit.Assert.assertTrue("'" + circumventEncapsulationMethod0 + "' != '" + io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.JVM_DRIVER + "'", circumventEncapsulationMethod0.equals(io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.JVM_DRIVER));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        io.github.classgraph.ClassGraph.CircumventEncapsulationMethod circumventEncapsulationMethod0 = io.github.classgraph.ClassGraph.CIRCUMVENT_ENCAPSULATION;
        io.github.classgraph.ClassGraph.CIRCUMVENT_ENCAPSULATION = circumventEncapsulationMethod0;
        io.github.classgraph.ClassGraph.CIRCUMVENT_ENCAPSULATION = circumventEncapsulationMethod0;
        org.junit.Assert.assertTrue("'" + circumventEncapsulationMethod0 + "' != '" + io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE + "'", circumventEncapsulationMethod0.equals(io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        io.github.classgraph.ClassGraph.CircumventEncapsulationMethod circumventEncapsulationMethod0 = io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE;
        org.junit.Assert.assertTrue("'" + circumventEncapsulationMethod0 + "' != '" + io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE + "'", circumventEncapsulationMethod0.equals(io.github.classgraph.ClassGraph.CircumventEncapsulationMethod.NONE));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        io.github.classgraph.ClassGraph classGraph4 = new io.github.classgraph.ClassGraph();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph12 = classGraph4.rejectClasses(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.classgraph.ClassGraph classGraph13 = classGraph3.blacklistPackages(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rejecting the root package (\"\") will cause nothing to be scanned");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classGraph12);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ModulePathInfo modulePathInfo2 = classGraph1.getModulePathInfo();
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(modulePathInfo2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.ignoreMethodVisibility();
        org.junit.Assert.assertNotNull(classGraph1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        java.util.List<java.net.URI> uRIList4 = classGraph3.getClasspathURIs();
        io.github.classgraph.ClassGraph classGraph5 = classGraph3.enableAllInfo();
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(uRIList4);
        org.junit.Assert.assertNotNull(classGraph5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        java.util.concurrent.ExecutorService executorService4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.classgraph.ScanResult scanResult6 = classGraph1.scan(executorService4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        io.github.classgraph.ClassGraph classGraph4 = classGraph3.enableMethodInfo();
        io.github.classgraph.ClassGraph.ClasspathElementFilter classpathElementFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.classgraph.ClassGraph classGraph6 = classGraph4.filterClasspathElements(classpathElementFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(classGraph4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        io.github.classgraph.ClassGraph classGraph4 = classGraph3.ignoreParentClassLoaders();
        io.github.classgraph.ClassGraph classGraph5 = classGraph3.enableAnnotationInfo();
        io.github.classgraph.ClassGraph classGraph6 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph7 = classGraph6.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph8 = classGraph6.enableInterClassDependencies();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph16 = classGraph6.rejectModules(strArray15);
        io.github.classgraph.ClassGraph classGraph17 = classGraph5.whitelistPackages(strArray15);
        io.github.classgraph.ClassGraph classGraph18 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph19 = classGraph18.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph21 = classGraph19.verbose(true);
        io.github.classgraph.ClassGraph classGraph22 = classGraph21.ignoreParentClassLoaders();
        io.github.classgraph.ClassGraph classGraph23 = classGraph21.enableAnnotationInfo();
        io.github.classgraph.ClassGraph classGraph24 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph25 = classGraph24.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph26 = classGraph24.enableInterClassDependencies();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph34 = classGraph24.rejectModules(strArray33);
        io.github.classgraph.ClassGraph classGraph35 = classGraph23.whitelistPackages(strArray33);
        io.github.classgraph.ClassGraph classGraph36 = classGraph17.acceptPackagesNonRecursive(strArray33);
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(classGraph4);
        org.junit.Assert.assertNotNull(classGraph5);
        org.junit.Assert.assertNotNull(classGraph7);
        org.junit.Assert.assertNotNull(classGraph8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(classGraph16);
        org.junit.Assert.assertNotNull(classGraph17);
        org.junit.Assert.assertNotNull(classGraph19);
        org.junit.Assert.assertNotNull(classGraph21);
        org.junit.Assert.assertNotNull(classGraph22);
        org.junit.Assert.assertNotNull(classGraph23);
        org.junit.Assert.assertNotNull(classGraph25);
        org.junit.Assert.assertNotNull(classGraph26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(classGraph34);
        org.junit.Assert.assertNotNull(classGraph35);
        org.junit.Assert.assertNotNull(classGraph36);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        io.github.classgraph.ClassGraph classGraph4 = classGraph3.ignoreParentClassLoaders();
        io.github.classgraph.ClassGraph classGraph5 = new io.github.classgraph.ClassGraph();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph13 = classGraph5.rejectClasses(strArray12);
        io.github.classgraph.ClassGraph classGraph14 = classGraph3.whitelistPathsNonRecursive(strArray12);
        java.util.List<java.net.URL> uRLList15 = classGraph3.getClasspathURLs();
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(classGraph4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classGraph13);
        org.junit.Assert.assertNotNull(classGraph14);
        org.junit.Assert.assertNotNull(uRLList15);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph2 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph3 = classGraph2.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph5 = classGraph3.verbose(true);
        io.github.classgraph.ClassGraph classGraph6 = classGraph5.ignoreParentClassLoaders();
        io.github.classgraph.ClassGraph classGraph7 = classGraph5.enableAnnotationInfo();
        io.github.classgraph.ClassGraph classGraph8 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph9 = classGraph8.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph10 = classGraph8.enableInterClassDependencies();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph18 = classGraph8.rejectModules(strArray17);
        io.github.classgraph.ClassGraph classGraph19 = classGraph7.whitelistPackages(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.github.classgraph.ClassGraph classGraph20 = classGraph1.rejectPackages(strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rejecting the root package (\"\") will cause nothing to be scanned");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(classGraph5);
        org.junit.Assert.assertNotNull(classGraph6);
        org.junit.Assert.assertNotNull(classGraph7);
        org.junit.Assert.assertNotNull(classGraph9);
        org.junit.Assert.assertNotNull(classGraph10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(classGraph18);
        org.junit.Assert.assertNotNull(classGraph19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph3 = classGraph1.verbose(true);
        io.github.classgraph.ClassGraph classGraph4 = classGraph3.ignoreParentClassLoaders();
        io.github.classgraph.ClassGraph classGraph5 = new io.github.classgraph.ClassGraph();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph13 = classGraph5.rejectClasses(strArray12);
        io.github.classgraph.ClassGraph classGraph14 = classGraph3.whitelistPathsNonRecursive(strArray12);
        io.github.classgraph.ClassGraph classGraph15 = classGraph14.enableMethodInfo();
        io.github.classgraph.ClassGraph classGraph16 = classGraph14.enableClassInfo();
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph3);
        org.junit.Assert.assertNotNull(classGraph4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classGraph13);
        org.junit.Assert.assertNotNull(classGraph14);
        org.junit.Assert.assertNotNull(classGraph15);
        org.junit.Assert.assertNotNull(classGraph16);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        io.github.classgraph.ClassGraph classGraph5 = classGraph0.whitelistLibOrExtJars(strArray4);
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classGraph5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph2 = classGraph0.enableInterClassDependencies();
        io.github.classgraph.ClassGraph classGraph3 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph4 = classGraph3.enableSystemJarsAndModules();
        io.github.classgraph.ClassGraph classGraph5 = classGraph3.enableInterClassDependencies();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        io.github.classgraph.ClassGraph classGraph13 = classGraph3.rejectModules(strArray12);
        io.github.classgraph.ClassGraph classGraph14 = classGraph0.acceptPackages(strArray12);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        io.github.classgraph.ClassGraph classGraph22 = classGraph14.acceptClasspathElementsContainingResourcePath(strArray21);
        java.lang.ClassLoader classLoader23 = null;
        io.github.classgraph.ClassGraph classGraph24 = classGraph14.addClassLoader(classLoader23);
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph2);
        org.junit.Assert.assertNotNull(classGraph4);
        org.junit.Assert.assertNotNull(classGraph5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classGraph13);
        org.junit.Assert.assertNotNull(classGraph14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(classGraph22);
        org.junit.Assert.assertNotNull(classGraph24);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        io.github.classgraph.ClassGraph classGraph0 = new io.github.classgraph.ClassGraph();
        io.github.classgraph.ClassGraph classGraph1 = classGraph0.disableDirScanning();
        io.github.classgraph.ClassGraph classGraph2 = classGraph1.ignoreParentClassLoaders();
        org.junit.Assert.assertNotNull(classGraph1);
        org.junit.Assert.assertNotNull(classGraph2);
    }
}

