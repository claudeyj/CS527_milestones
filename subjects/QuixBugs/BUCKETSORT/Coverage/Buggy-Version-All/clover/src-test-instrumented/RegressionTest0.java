/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_21cm1cmlwzsbdsf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,3276,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yt33u1cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test01",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yt33u1cm() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1750);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1751);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1752)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1753)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1754);System.out.format("%n%s%n", "RegressionTest0.test01");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1755);java_programs.BUCKETSORT bUCKETSORT0 = new java_programs.BUCKETSORT();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1756);java.lang.Class<?> wildcardClass1 = bUCKETSORT0.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1757);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test02() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277t1wb1cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test02",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277t1wb1cu() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1758);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1759);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1760)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1761)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1762);System.out.format("%n%s%n", "RegressionTest0.test02");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1763);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1764);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1765);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1766);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1767);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, (int) '#');
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1768);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1769);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1770);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test03() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agt0os1d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test03",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agt0os1d7() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1771);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1772);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1773)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1774)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1775);System.out.format("%n%s%n", "RegressionTest0.test03");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1776);java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1777);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1778);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1779);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1780);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1781);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1782);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1783);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test04() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpszh91dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test04",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpszh91dk() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1784);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1785);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1786)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1787)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1788);System.out.format("%n%s%n", "RegressionTest0.test04");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1789);java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1790);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1791);java.util.ArrayList<java.lang.Integer> intList2 = java_programs.BUCKETSORT.bucketsort(intList0, 100);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1792);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test05() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gysy9q1dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test05",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gysy9q1dt() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1793);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1794);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1795)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1796)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1797);System.out.format("%n%s%n", "RegressionTest0.test05");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1798);java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1), (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1799);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1800);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1801);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1802);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1803);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1804);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1805);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test06() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7sx271e6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test06",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7sx271e6() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1806);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1807);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1808)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1809)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1810);System.out.format("%n%s%n", "RegressionTest0.test06");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1811);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1812);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1813);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1814);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1815);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1816);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1817);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1818);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test07() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngsvuo1ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test07",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1819,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngsvuo1ej() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1819);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1820);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1821)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1822)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1823);System.out.format("%n%s%n", "RegressionTest0.test07");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1824);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 1, 0, 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1825);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1826);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1827);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1828);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1829);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1830);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1831);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test08() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpsun51ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test08",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpsun51ew() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1832);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1833);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1834)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1835)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1836);System.out.format("%n%s%n", "RegressionTest0.test08");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1837);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1838);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1839);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test09() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tystfm1f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test09",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tystfm1f4() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1840);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1841);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1842)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1843)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1844);System.out.format("%n%s%n", "RegressionTest0.test09");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1845);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 100, (-1), 1 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1846);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1847);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1848);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1849);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1850);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1851);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1852);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test10() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufo0uw1fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufo0uw1fh() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1853);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1854);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1855)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1856)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1857);System.out.format("%n%s%n", "RegressionTest0.test10");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1858);java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, 10, 1, 1, (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1859);java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1860);boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1861);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1862);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList6, (int) (byte) 100);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1863);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1864);org.junit.Assert.assertNotNull(intArray5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1865);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test11() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xonznd1fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1866,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xonznd1fu() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1866);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1867);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1868)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1869)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1870);System.out.format("%n%s%n", "RegressionTest0.test11");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1871);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1), (-1), 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1872);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1873);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1874);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1875);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1876);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1877);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1878);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test12() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3g3ja1g7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3g3ja1g7() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1879);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1880);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1881)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1882)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1883);System.out.format("%n%s%n", "RegressionTest0.test12");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1884);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1885);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1886);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1887);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1888);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, (int) '4');
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1889);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1890);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1891);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test13() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uug4qt1gk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uug4qt1gk() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1892);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1893);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1894)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1895)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1896);System.out.format("%n%s%n", "RegressionTest0.test13");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1897);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1898);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1899);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1900);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1901);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1902);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1903);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1904);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test14() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlg5yc1gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlg5yc1gx() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1905);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1906);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1907)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1908)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1909);System.out.format("%n%s%n", "RegressionTest0.test14");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1910);java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1911);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1912);java.util.ArrayList<java.lang.Integer> intList2 = java_programs.BUCKETSORT.bucketsort(intList0, 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1913);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test15() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocg75v1h6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocg75v1h6() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1914);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1915);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1916)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1917)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1918);System.out.format("%n%s%n", "RegressionTest0.test15");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1919);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, 10, 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1920);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1921);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1922);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1923);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1924);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1925);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1926);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test16() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3g8de1hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3g8de1hj() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1927);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1928);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1929)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1930)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1931);System.out.format("%n%s%n", "RegressionTest0.test16");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1932);java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1933);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1934);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1935);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1936);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1937);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1938);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1939);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test17() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hug9kx1hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hug9kx1hw() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1940);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1941);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1942)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1943)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1944);System.out.format("%n%s%n", "RegressionTest0.test17");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1945);java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 0, 1, 0, 1 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1946);java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1947);boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1948);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1949);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList6, (int) (short) 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1950);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1951);org.junit.Assert.assertNotNull(intArray5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1952);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test18() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elgasg1i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elgasg1i9() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1953);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1954);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1955)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1956)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1957);System.out.format("%n%s%n", "RegressionTest0.test18");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1958);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1959);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1960);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1961);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1962);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1963);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1964);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1965);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test19() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcgbzz1im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcgbzz1im() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1966);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1967);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1968)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1969)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1970);System.out.format("%n%s%n", "RegressionTest0.test19");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1971);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1972);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1973);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1974);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1975);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1976);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1977);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1978);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test20() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avl4kp1iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avl4kp1iz() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1979);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1980);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1981)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1982)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1983);System.out.format("%n%s%n", "RegressionTest0.test20");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1984);java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 100, 100, (-1), (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1985);java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1986);boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1987);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1988);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList6, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(1989);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1990);org.junit.Assert.assertNotNull(intArray5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1991);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test21() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),1992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ml5s81jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ml5s81jc() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(1992);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1993);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1994)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(1995)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(1996);System.out.format("%n%s%n", "RegressionTest0.test21");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(1997);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1998);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(1999);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2000);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2001);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2002);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2003);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2004);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test22() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dl6zr1jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dl6zr1jp() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2005);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2006);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2007)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2008)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2009);System.out.format("%n%s%n", "RegressionTest0.test22");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2010);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100, 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2011);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2012);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2013);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2014);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2015);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2016);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2017);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test23() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_214l87a1k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_214l87a1k2() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2018);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2019);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2020)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2021)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2022);System.out.format("%n%s%n", "RegressionTest0.test23");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2023);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1), 0, 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2024);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2025);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2026);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2027);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2028);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2029);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2030);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test24() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224eql71kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224eql71kf() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2031);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2032);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2033)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2034)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2035);System.out.format("%n%s%n", "RegressionTest0.test24");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2036);java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2037);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2038);java.util.ArrayList<java.lang.Integer> intList2 = java_programs.BUCKETSORT.bucketsort(intList0, (int) (short) 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2039);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test25() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25depdo1ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25depdo1ko() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2040);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2041);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2042)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2043)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2044);System.out.format("%n%s%n", "RegressionTest0.test25");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2045);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 1, 1 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2046);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2047);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2048);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2049);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList4, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2050);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2051);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2052);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test26() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28meo651l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28meo651l1() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2053);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2054);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2055)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2056)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2057);System.out.format("%n%s%n", "RegressionTest0.test26");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2058);java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2059);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2060);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2061);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2062);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2063);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2064);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2065);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test27() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvemym1le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvemym1le() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2066);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2067);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2068)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2069)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2070);System.out.format("%n%s%n", "RegressionTest0.test27");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2071);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 10, 1 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2072);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2073);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2074);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2075);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2076);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2077);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2078);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test28() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4elr31lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test28",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4elr31lr() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2079);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2080);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2081)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2082)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2083);System.out.format("%n%s%n", "RegressionTest0.test28");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2084);java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 10, 100, 10 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2085);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2086);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2087);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2088);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2089);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2090);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2091);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test29() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idekjk1m4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test29",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idekjk1m4() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2092);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2093);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2094)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2095)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2096);System.out.format("%n%s%n", "RegressionTest0.test29");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2097);java.lang.Integer[] intArray5 = new java.lang.Integer[] { 0, (-1), (-1), 0, (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2098);java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2099);boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2100);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2101);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList6, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2102);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2103);org.junit.Assert.assertNotNull(intArray5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2104);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test30() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu9ryu1mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test30",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu9ryu1mh() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2105);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2106);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2107)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2108)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2109);System.out.format("%n%s%n", "RegressionTest0.test30");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2110);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 10, 100 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2111);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2112);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2113);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2114);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList4, (int) (short) 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2115);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2116);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2117);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test31() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m39qrb1mu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test31",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m39qrb1mu() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2118);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2119);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2120)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2121)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2122);System.out.format("%n%s%n", "RegressionTest0.test31");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2123);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 0, 10, 1 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2124);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2125);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2126);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2127);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2128);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2129);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2130);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test32() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pc9pjs1n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test32",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2131,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pc9pjs1n7() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2131);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2132);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2133)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2134)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2135);System.out.format("%n%s%n", "RegressionTest0.test32");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2136);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 100, (-1), 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2137);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2138);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2139);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2140);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, 10);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2141);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2142);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2143);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test33() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl9oc91nk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test33",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl9oc91nk() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2144);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2145);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2146)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2147)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2148);System.out.format("%n%s%n", "RegressionTest0.test33");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2149);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, 100 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2150);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2151);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2152);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2153);java.util.ArrayList<java.lang.Integer> intList6 = java_programs.BUCKETSORT.bucketsort(intList3, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2154);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2155);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2156);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test34() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu9n4q1nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu9n4q1nx() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2157);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2158);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2159)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2160)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2161);System.out.format("%n%s%n", "RegressionTest0.test34");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2162);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2163);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2164);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2165);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2166);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2167);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) -1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2168);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2169);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2170);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2171);org.junit.Assert.assertNotNull(intList5);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test35() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z39lx71oc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test35",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z39lx71oc() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2172);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2173);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2174)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2175)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2176);System.out.format("%n%s%n", "RegressionTest0.test35");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2177);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2178);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2179);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2180);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2181);java.lang.Class<?> wildcardClass6 = intList5.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2182);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2183);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2184);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2185);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test36() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wouh9g1oq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test36",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2186,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wouh9g1oq() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2186);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2187);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2188)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2189)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2190);System.out.format("%n%s%n", "RegressionTest0.test36");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2191);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2192);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2193);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2194);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2195);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2196);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2197);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2198);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2199);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2200);org.junit.Assert.assertNotNull(intList5);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test37() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfuigz1p5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test37",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfuigz1p5() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2201);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2202);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2203)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2204)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2205);System.out.format("%n%s%n", "RegressionTest0.test37");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2206);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 100, (-1) };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2207);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2208);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2209);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2210);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList4, 0);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2211);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2212);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2213);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test38() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6ujoi1pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test38",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6ujoi1pi() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2214);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2215);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2216)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2217)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2218);System.out.format("%n%s%n", "RegressionTest0.test38");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2219);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2220);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2221);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2222);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2223);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2224);java.lang.Class<?> wildcardClass8 = intList5.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2225);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2226);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2227);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2228);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2229);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test39() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mxukw11py();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mxukw11py() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2230);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2231);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2232)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2233)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2234);System.out.format("%n%s%n", "RegressionTest0.test39");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2235);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2236);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2237);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2238);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2239);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2240);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2241);java.lang.Class<?> wildcardClass10 = intList5.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2242);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2243);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2244);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2245);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2246);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2247);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test40() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgzdgr1qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test40",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgzdgr1qg() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2248);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2249);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2250)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2251)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2252);System.out.format("%n%s%n", "RegressionTest0.test40");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2253);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2254);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2255);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2256);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2257);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2258);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2259);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2260);java.lang.Class<?> wildcardClass12 = intList11.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2261);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2262);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2263);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2264);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2265);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2266);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2267);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test41() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7zeoa1r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test41",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7zeoa1r0() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2268);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2269);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2270)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2271)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2272);System.out.format("%n%s%n", "RegressionTest0.test41");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2273);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2274);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2275);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2276);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2277);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2278);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2279);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2280);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2281);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2282);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2283);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test42() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyzfvt1rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test42",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyzfvt1rg() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2284);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2285);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2286)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2287)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2288);System.out.format("%n%s%n", "RegressionTest0.test42");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2289);java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), 0, (-1), 100 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2290);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2291);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2292);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2293);java.util.ArrayList<java.lang.Integer> intList8 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2294);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2295);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2296);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test43() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpzh3c1rt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test43",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpzh3c1rt() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2297);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2298);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2299)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2300)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2301);System.out.format("%n%s%n", "RegressionTest0.test43");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2302);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2303);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2304);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2305);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2306);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2307);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2308);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2309);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2310);java.lang.Class<?> wildcardClass14 = intList13.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2311);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2312);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2313);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2314);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2315);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2316);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2317);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2318);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test44() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gziav1sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test44",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gziav1sf() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2319);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2320);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2321)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2322)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2323);System.out.format("%n%s%n", "RegressionTest0.test44");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2324);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2325);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2326);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2327);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2328);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2329);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2330);java.lang.Class<?> wildcardClass10 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2331);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2332);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2333);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2334);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2335);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2336);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test45() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267zjie1sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test45",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267zjie1sx() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2337);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2338);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2339)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2340)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2341);System.out.format("%n%s%n", "RegressionTest0.test45");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2342);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2343);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2344);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2345);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2346);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2347);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2348);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2349);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2350);java.lang.Class<?> wildcardClass14 = intList13.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2351);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2352);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2353);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2354);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2355);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2356);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2357);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2358);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test46() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yzkpx1tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test46",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yzkpx1tj() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2359);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2360);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2361)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2362)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2363);System.out.format("%n%s%n", "RegressionTest0.test46");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2364);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2365);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2366);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2367);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2368);java.lang.Class<?> wildcardClass6 = intList2.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2369);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2370);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2371);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2372);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test47() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0e2k1tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0e2k1tx() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2373);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2374);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2375)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2376)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2377);System.out.format("%n%s%n", "RegressionTest0.test47");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2378);java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2379);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2380);java.util.ArrayList<java.lang.Integer> intList2 = java_programs.BUCKETSORT.bucketsort(intList0, (int) (short) 1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2381);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test48() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23j0cv11u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test48",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2382,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23j0cv11u6() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2382);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2383);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2384)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2385)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2386);System.out.format("%n%s%n", "RegressionTest0.test48");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2387);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2388);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2389);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2390);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2391);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2392);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2393);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2394);java.lang.Class<?> wildcardClass12 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2395);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2396);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2397);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2398);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2399);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2400);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2401);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test49() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s0bni1uq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test49",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s0bni1uq() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2402);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2403);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2404)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2405)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2406);System.out.format("%n%s%n", "RegressionTest0.test49");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2407);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2408);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2409);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2410);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2411);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2412);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2413);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2414);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2415);java.lang.Class<?> wildcardClass14 = intList13.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2416);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2417);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2418);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2419);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2420);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2421);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2422);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2423);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test50() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278vj2s1vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test50",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278vj2s1vc() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2424);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2425);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2426)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2427)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2428);System.out.format("%n%s%n", "RegressionTest0.test50");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2429);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2430);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2431);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2432);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2433);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2434);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2435);java.lang.Class<?> wildcardClass10 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2436);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2437);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2438);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2439);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2440);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2441);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test51() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahvhv91vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test51",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahvhv91vu() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2442);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2443);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2444)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2445)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2446);System.out.format("%n%s%n", "RegressionTest0.test51");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2447);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2448);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2449);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2450);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2451);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2452);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2453);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2454);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2455);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2456);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2457);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2458);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2459);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2460);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2461);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2462);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2463);org.junit.Assert.assertNotNull(intList15);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test52() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqvgnq1wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test52",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqvgnq1wg() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2464);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2465);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2466)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2467)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2468);System.out.format("%n%s%n", "RegressionTest0.test52");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2469);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2470);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2471);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2472);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2473);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2474);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2475);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2476);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2477);java.lang.Class<?> wildcardClass14 = intList13.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2478);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2479);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2480);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2481);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2482);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2483);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2484);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2485);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test53() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzvfg71x2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test53",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzvfg71x2() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2486);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2487);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2488)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2489)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2490);System.out.format("%n%s%n", "RegressionTest0.test53");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2491);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2492);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2493);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2494);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2495);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2496);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2497);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2498);java.lang.Class<?> wildcardClass12 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2499);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2500);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2501);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2502);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2503);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2504);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2505);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test54() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8ve8o1xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test54",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8ve8o1xm() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2506);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2507);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2508)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2509)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2510);System.out.format("%n%s%n", "RegressionTest0.test54");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2511);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2512);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2513);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2514);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2515);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2516);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2517);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2518);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2519);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2520);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2521);java.lang.Class<?> wildcardClass18 = intList17.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2522);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2523);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2524);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2525);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2526);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2527);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2528);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2529);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2530);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2531);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test55() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvd151yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test55",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvd151yc() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2532);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2533);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2534)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2535)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2536);System.out.format("%n%s%n", "RegressionTest0.test55");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2537);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2538);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2539);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2540);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2541);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2542);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2543);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2544);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2545);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2546);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2547);java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2548);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2549);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2550);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2551);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2552);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2553);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2554);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2555);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2556);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2557);org.junit.Assert.assertNotNull(intList19);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test56() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqvbtm1z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test56",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqvbtm1z2() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2558);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2559);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2560)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2561)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2562);System.out.format("%n%s%n", "RegressionTest0.test56");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2563);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2564);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2565);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2566);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2567);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2568);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2569);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2570);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2571);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2572);java.lang.Class<?> wildcardClass16 = intList15.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2573);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2574);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2575);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2576);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2577);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2578);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2579);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2580);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2581);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test57() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzvam31zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test57",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzvam31zq() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2582);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2583);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2584)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2585)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2586);System.out.format("%n%s%n", "RegressionTest0.test57");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2587);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2588);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2589);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2590);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2591);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2592);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2593);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2594);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2595);java.lang.Class<?> wildcardClass14 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2596);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2597);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2598);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2599);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2600);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2601);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2602);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2603);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test58() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8v9ek20c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test58",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8v9ek20c() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2604);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2605);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2606)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2607)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2608);System.out.format("%n%s%n", "RegressionTest0.test58");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2609);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2610);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2611);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2612);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2613);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2614);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2615);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2616);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2617);java.lang.Class<?> wildcardClass14 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2618);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2619);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2620);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2621);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2622);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2623);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2624);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2625);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test59() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yj8ts320y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test59",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yj8ts320y() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2626);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2627);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2628)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2629)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2630);System.out.format("%n%s%n", "RegressionTest0.test59");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2631);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2632);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2633);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2634);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2635);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2636);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2637);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2638);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2639);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2640);java.lang.Class<?> wildcardClass16 = intList13.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2641);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2642);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2643);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2644);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2645);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2646);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2647);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2648);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2649);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test60() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2dmct21m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test60",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2dmct21m() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2650);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2651);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2652)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2653)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2654);System.out.format("%n%s%n", "RegressionTest0.test60");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2655);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2656);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2657);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2658);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2659);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2660);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2661);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2662);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2663);java.lang.Class<?> wildcardClass14 = intList11.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2664);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2665);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2666);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2667);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2668);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2669);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2670);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2671);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test61() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utdnkc228();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test61",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utdnkc228() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2672);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2673);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2674)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2675)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2676);System.out.format("%n%s%n", "RegressionTest0.test61");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2677);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2678);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2679);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2680);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2681);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2682);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2683);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2684);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2685);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2686);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2687);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2688);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2689);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2690);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2691);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2692);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2693);org.junit.Assert.assertNotNull(intList15);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test62() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkdorv22u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test62",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkdorv22u() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2694);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2695);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2696)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2697)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2698);System.out.format("%n%s%n", "RegressionTest0.test62");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2699);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2700);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2701);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2702);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2703);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2704);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2705);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2706);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2707);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2708);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2709);java.lang.Class<?> wildcardClass18 = intList13.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2710);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2711);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2712);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2713);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2714);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2715);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2716);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2717);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2718);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2719);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test63() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obdpze23k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test63",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obdpze23k() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2720);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2721);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2722)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2723)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2724);System.out.format("%n%s%n", "RegressionTest0.test63");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2725);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2726);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2727);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2728);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2729);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2730);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2731);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2732);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2733);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2734);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2735);java.lang.Class<?> wildcardClass18 = intList15.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2736);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2737);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2738);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2739);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2740);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2741);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2742);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2743);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2744);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2745);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test64() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2dr6x24a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test64",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2dr6x24a() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2746);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2747);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2748)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2749)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2750);System.out.format("%n%s%n", "RegressionTest0.test64");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2751);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2752);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2753);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2754);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2755);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2756);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2757);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2758);java.lang.Class<?> wildcardClass12 = intList11.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2759);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2760);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2761);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2762);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2763);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2764);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2765);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test65() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htdseg24u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test65",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htdseg24u() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2766);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2767);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2768)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2769)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2770);System.out.format("%n%s%n", "RegressionTest0.test65");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2771);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2772);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2773);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2774);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2775);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2776);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2777);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2778);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2779);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2780);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2781);java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2782);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2783);java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList17, (-1));
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2784);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2785);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2786);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2787);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2788);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2789);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2790);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2791);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2792);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2793);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2794);org.junit.Assert.assertNotNull(intList19);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test66() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekdtlz25n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test66",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekdtlz25n() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2795);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2796);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2797)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2798)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2799);System.out.format("%n%s%n", "RegressionTest0.test66");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2800);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2801);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2802);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2803);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2804);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2805);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2806);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2807);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2808);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2809);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2810);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2811);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2812);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2813);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2814);org.junit.Assert.assertNotNull(intList13);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test67() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbduti267();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test67",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbduti267() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2815);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2816);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2817)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2818)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2819);System.out.format("%n%s%n", "RegressionTest0.test67");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2820);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2821);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2822);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2823);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2824);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2825);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2826);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2827);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2828);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2829);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2830);java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2831);java.lang.Class<?> wildcardClass20 = intList19.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2832);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2833);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2834);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2835);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2836);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2837);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2838);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2839);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2840);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2841);org.junit.Assert.assertNotNull(intList19);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2842);org.junit.Assert.assertNotNull(wildcardClass20);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test68() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282dw1126z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test68",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282dw1126z() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2843);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2844);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2845)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2846)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2847);System.out.format("%n%s%n", "RegressionTest0.test68");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2848);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2849);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2850);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2851);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2852);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2853);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2854);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2855);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2856);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2857);java.lang.Class<?> wildcardClass16 = intList15.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2858);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2859);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2860);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2861);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2862);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2863);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2864);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2865);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2866);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test69() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24tdx8k27n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test69",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24tdx8k27n() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2867);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2868);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2869)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2870)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2871);System.out.format("%n%s%n", "RegressionTest0.test69");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2872);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2873);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2874);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2875);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2876);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2877);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2878);java.lang.Class<?> wildcardClass10 = intList5.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2879);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2880);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2881);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2882);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2883);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2884);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test70() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cipta285();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test70",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cipta285() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2885);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2886);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2887)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2888)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2889);System.out.format("%n%s%n", "RegressionTest0.test70");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2890);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2891);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2892);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2893);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2894);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2895);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2896);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2897);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2898);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2899);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2900);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2901);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2902);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2903);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2904);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2905);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2906);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2907);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2908);org.junit.Assert.assertNotNull(intList17);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test71() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213ir0t28t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test71",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213ir0t28t() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2909);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2910);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2911)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2912)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2913);System.out.format("%n%s%n", "RegressionTest0.test71");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2914);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2915);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2916);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2917);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2918);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2919);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2920);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2921);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2922);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2923);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2924);java.lang.Class<?> wildcardClass18 = intList17.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2925);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2926);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2927);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2928);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2929);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2930);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2931);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2932);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2933);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2934);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test72() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225h7ro29j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test72",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225h7ro29j() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2935);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2936);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2937)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2938)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2939);System.out.format("%n%s%n", "RegressionTest0.test72");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2940);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2941);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2942);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2943);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2944);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2945);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2946);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2947);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2948);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2949);java.lang.Class<?> wildcardClass16 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2950);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2951);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2952);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2953);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2954);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2955);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2956);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2957);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2958);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test73() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25eh6k52a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test73",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25eh6k52a7() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2959);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2960);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2961)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2962)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2963);System.out.format("%n%s%n", "RegressionTest0.test73");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2964);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2965);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2966);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2967);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2968);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2969);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2970);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2971);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2972);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2973);java.lang.Class<?> wildcardClass16 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2974);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2975);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2976);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2977);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2978);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2979);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2980);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2981);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2982);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test74() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),2983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28nh5cm2av();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test74",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28nh5cm2av() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(2983);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2984);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2985)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(2986)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(2987);System.out.format("%n%s%n", "RegressionTest0.test74");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(2988);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2989);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2990);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2991);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2992);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2993);try {
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2994);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) -1);
            __CLR4_5_21cm1cmlwzsbdsf.R.inc(2995);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2996);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2997);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2998);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(2999);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test75() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bwh4532bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test75",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bwh4532bc() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3000);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3001);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3002)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3003)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3004);System.out.format("%n%s%n", "RegressionTest0.test75");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3005);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3006);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3007);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3008);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3009);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3010);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3011);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3012);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3013);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test76() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5h2xk2bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test76",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5h2xk2bq() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3014);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3015);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3016)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3017)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3018);System.out.format("%n%s%n", "RegressionTest0.test76");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3019);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3020);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3021);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3022);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3023);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3024);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList7, 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3025);java.lang.Class<?> wildcardClass10 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3026);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3027);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3028);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3029);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3030);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3031);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test77() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ieh1q12c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test77",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ieh1q12c8() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3032);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3033);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3034)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3035)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3036);System.out.format("%n%s%n", "RegressionTest0.test77");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3037);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3038);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3039);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3040);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3041);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3042);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3043);java.lang.Class<?> wildcardClass10 = intList5.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3044);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3045);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3046);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3047);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3048);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3049);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test78() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnh0ii2cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test78",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnh0ii2cq() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3050);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3051);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3052)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3053)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3054);System.out.format("%n%s%n", "RegressionTest0.test78");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3055);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3056);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3057);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3058);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3059);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3060);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3061);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3062);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3063);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3064);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3065);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3066);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3067);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3068);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3069);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3070);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3071);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3072);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3073);org.junit.Assert.assertNotNull(intList17);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test79() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owgzaz2de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test79",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owgzaz2de() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3074);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3075);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3076)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3077)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3078);System.out.format("%n%s%n", "RegressionTest0.test79");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3079);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3080);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3081);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3082);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3083);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3084);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3085);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3086);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3087);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3088);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3089);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3090);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3091);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3092);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3093);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3094);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3095);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3096);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3097);org.junit.Assert.assertNotNull(intList17);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test80() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdc6q92e2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test80",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3098,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdc6q92e2() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3098);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3099);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3100)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3101)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3102);System.out.format("%n%s%n", "RegressionTest0.test80");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3103);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3104);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3105);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3106);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3107);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3108);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3109);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3110);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3111);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList9, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3112);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3113);java.lang.Class<?> wildcardClass18 = intList9.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3114);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3115);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3116);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3117);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3118);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3119);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3120);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3121);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3122);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3123);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test81() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smc5iq2es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test81",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smc5iq2es() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3124);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3125);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3126)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3127)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3128);System.out.format("%n%s%n", "RegressionTest0.test81");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3129);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3130);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3131);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3132);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3133);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3134);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3135);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3136);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3137);java.lang.Class<?> wildcardClass14 = intList11.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3138);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3139);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3140);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3141);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3142);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3143);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3144);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3145);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test82() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvc4b72fe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test82",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvc4b72fe() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3146);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3147);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3148)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3149)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3150);System.out.format("%n%s%n", "RegressionTest0.test82");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3151);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3152);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3153);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3154);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3155);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3156);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3157);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3158);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3159);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3160);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3161);java.lang.Class<?> wildcardClass18 = intList17.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3162);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3163);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3164);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3165);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3166);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3167);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3168);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3169);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3170);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3171);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test83() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4c33o2g4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test83",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4c33o2g4() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3172);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3173);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3174)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3175)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3176);System.out.format("%n%s%n", "RegressionTest0.test83");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3177);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3178);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3179);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3180);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3181);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, (int) 'a');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3182);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3183);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3184);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3185);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3186);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3187);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test84() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wns02z2gk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test84",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wns02z2gk() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3188);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3189);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3190)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3191)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3192);System.out.format("%n%s%n", "RegressionTest0.test84");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3193);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3194);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3195);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3196);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3197);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3198);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3199);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3200);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList9, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3201);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3202);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3203);java.util.ArrayList<java.lang.Integer> intList19 = java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3204);java.util.ArrayList<java.lang.Integer> intList21 = java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3205);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3206);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3207);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3208);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3209);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3210);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3211);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3212);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3213);org.junit.Assert.assertNotNull(intList17);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3214);org.junit.Assert.assertNotNull(intList19);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3215);org.junit.Assert.assertNotNull(intList21);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test85() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tes1ai2hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test85",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tes1ai2hc() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3216);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3217);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3218)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3219)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3220);System.out.format("%n%s%n", "RegressionTest0.test85");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3221);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3222);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3223);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3224);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3225);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3226);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3227);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3228);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3229);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3230);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3231);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3232);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3233);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3234);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3235);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3236);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3237);org.junit.Assert.assertNotNull(intList15);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test86() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5s2i12hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test86",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5s2i12hy() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3238);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3239);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3240)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3241)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3242);System.out.format("%n%s%n", "RegressionTest0.test86");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3243);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3244);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3245);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3246);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3247);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3248);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3249);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3250);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3251);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}

    @Test
    public void test87() throws Throwable {__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceStart(getClass().getName(),3252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mws3pk2ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzsbdsf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzsbdsf.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test87",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mws3pk2ic() throws Throwable{try{__CLR4_5_21cm1cmlwzsbdsf.R.inc(3252);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3253);if ((((debug)&&(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3254)!=0|true))||(__CLR4_5_21cm1cmlwzsbdsf.R.iget(3255)==0&false)))
            {__CLR4_5_21cm1cmlwzsbdsf.R.inc(3256);System.out.format("%n%s%n", "RegressionTest0.test87");
        }__CLR4_5_21cm1cmlwzsbdsf.R.inc(3257);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3258);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3259);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3260);java.util.ArrayList<java.lang.Integer> intList5 = java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3261);java.util.ArrayList<java.lang.Integer> intList7 = java_programs.BUCKETSORT.bucketsort(intList5, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3262);java.util.ArrayList<java.lang.Integer> intList9 = java_programs.BUCKETSORT.bucketsort(intList5, 0);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3263);java.util.ArrayList<java.lang.Integer> intList11 = java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3264);java.util.ArrayList<java.lang.Integer> intList13 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3265);java.util.ArrayList<java.lang.Integer> intList15 = java_programs.BUCKETSORT.bucketsort(intList11, 100);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3266);java.util.ArrayList<java.lang.Integer> intList17 = java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3267);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3268);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3269);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3270);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3271);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3272);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3273);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3274);org.junit.Assert.assertNotNull(intList15);
        __CLR4_5_21cm1cmlwzsbdsf.R.inc(3275);org.junit.Assert.assertNotNull(intList17);
    }finally{__CLR4_5_21cm1cmlwzsbdsf.R.flushNeeded();}}
}

