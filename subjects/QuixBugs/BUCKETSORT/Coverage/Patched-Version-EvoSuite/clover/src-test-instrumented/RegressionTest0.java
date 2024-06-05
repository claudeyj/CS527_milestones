/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_21cm1cmlwzscb2x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,3114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yt33u1cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test01",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yt33u1cm() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1750);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1751);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1752)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1753)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1754);System.out.format("%n%s%n", "RegressionTest0.test01");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1755);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1756);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1757);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1758);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1759);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1760);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1761);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1762);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test02() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277t1wb1cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test02",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277t1wb1cz() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1763);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1764);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1765)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1766)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1767);System.out.format("%n%s%n", "RegressionTest0.test02");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1768);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1769);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1770);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test03() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agt0os1d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test03",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agt0os1d7() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1771);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1772);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1773)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1774)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1775);System.out.format("%n%s%n", "RegressionTest0.test03");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1776);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1777);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1778);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1779);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1780);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (-1));
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1781);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1782);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1783);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test04() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpszh91dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test04",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpszh91dk() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1784);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1785);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1786)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1787)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1788);System.out.format("%n%s%n", "RegressionTest0.test04");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1789);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1790);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1791);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1792);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1793);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1794);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1795);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1796);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test05() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gysy9q1dx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test05",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gysy9q1dx() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1797);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1798);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1799)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1800)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1801);System.out.format("%n%s%n", "RegressionTest0.test05");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1802);java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1803);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1804);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1805);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1806);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1807);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1808);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1809);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test06() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7sx271ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test06",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7sx271ea() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1810);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1811);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1812)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1813)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1814);System.out.format("%n%s%n", "RegressionTest0.test06");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1815);correct_java_programs.BUCKETSORT bUCKETSORT0 = new correct_java_programs.BUCKETSORT();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1816);java.lang.Class<?> wildcardClass1 = bUCKETSORT0.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1817);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test07() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngsvuo1ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test07",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngsvuo1ei() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1818);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1819);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1820)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1821)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1822);System.out.format("%n%s%n", "RegressionTest0.test07");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1823);java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1824);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1825);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1826);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1827);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1828);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1829);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1830);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test08() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpsun51ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test08",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpsun51ev() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1831);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1832);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1833)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1834)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1835);System.out.format("%n%s%n", "RegressionTest0.test08");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1836);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 0, 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1837);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1838);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1839);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1840);java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1841);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1842);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1843);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test09() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tystfm1f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test09",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tystfm1f8() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1844);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1845);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1846)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1847)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1848);System.out.format("%n%s%n", "RegressionTest0.test09");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1849);java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1850);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1851);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1852);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1853);java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.BUCKETSORT.bucketsort(intList3, (int) (short) 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1854);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1855);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1856);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test10() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufo0uw1fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufo0uw1fl() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1857);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1858);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1859)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1860)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1861);System.out.format("%n%s%n", "RegressionTest0.test10");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1862);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1863);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1864);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1865);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1866);java.lang.Class<?> wildcardClass6 = intList5.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1867);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1868);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1869);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1870);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test11() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xonznd1fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xonznd1fz() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1871);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1872);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1873)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1874)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1875);System.out.format("%n%s%n", "RegressionTest0.test11");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1876);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1877);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1878);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1879);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1880);java.lang.Class<?> wildcardClass6 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1881);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1882);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1883);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1884);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test12() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3g3ja1gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3g3ja1gd() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1885);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1886);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1887)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1888)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1889);System.out.format("%n%s%n", "RegressionTest0.test12");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1890);java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1891);java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1892);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1893);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1894);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 100);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1895);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1896);org.junit.Assert.assertNotNull(intArray3);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1897);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test13() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uug4qt1gq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uug4qt1gq() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1898);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1899);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1900)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1901)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1902);System.out.format("%n%s%n", "RegressionTest0.test13");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1903);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1904);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1905);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1906);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1907);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1908);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1909);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1910);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1911);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1912);org.junit.Assert.assertNotNull(intList5);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test14() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlg5yc1h5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlg5yc1h5() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1913);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1914);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1915)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1916)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1917);System.out.format("%n%s%n", "RegressionTest0.test14");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1918);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1919);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1920);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1921);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1922);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1923);java.lang.Class<?> wildcardClass8 = intList5.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1924);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1925);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1926);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1927);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1928);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test15() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocg75v1hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocg75v1hl() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1929);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1930);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1931)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1932)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1933);System.out.format("%n%s%n", "RegressionTest0.test15");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1934);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1935);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1936);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1937);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1938);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1939);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1940);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1941);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1942);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1943);org.junit.Assert.assertNotNull(intList5);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test16() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3g8de1i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3g8de1i0() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1944);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1945);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1946)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1947)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1948);System.out.format("%n%s%n", "RegressionTest0.test16");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1949);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1950);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1951);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1952);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1953);java.lang.Class<?> wildcardClass6 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1954);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1955);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1956);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1957);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test17() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hug9kx1ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hug9kx1ie() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1958);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1959);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1960)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1961)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1962);System.out.format("%n%s%n", "RegressionTest0.test17");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1963);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1964);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1965);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1966);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1967);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1968);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1969);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1970);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1971);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1972);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1973);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test18() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elgasg1iu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elgasg1iu() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1974);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1975);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1976)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1977)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1978);System.out.format("%n%s%n", "RegressionTest0.test18");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1979);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1980);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1981);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1982);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1983);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1984);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(1985);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1986);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1987);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1988);org.junit.Assert.assertNotNull(intList5);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test19() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),1989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcgbzz1j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcgbzz1j9() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(1989);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1990);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(1991)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(1992)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(1993);System.out.format("%n%s%n", "RegressionTest0.test19");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(1994);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1995);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1996);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1997);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1998);java.lang.Class<?> wildcardClass6 = intList5.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(1999);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2000);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2001);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2002);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test20() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avl4kp1jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avl4kp1jn() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2003);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2004);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2005)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2006)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2007);System.out.format("%n%s%n", "RegressionTest0.test20");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2008);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2009);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2010);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2011);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2012);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2013);java.lang.Class<?> wildcardClass8 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2014);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2015);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2016);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2017);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2018);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test21() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ml5s81k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2019,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ml5s81k3() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2019);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2020);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2021)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2022)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2023);System.out.format("%n%s%n", "RegressionTest0.test21");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2024);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2025);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2026);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2027);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2028);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2029);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2030);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2031);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2032);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2033);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2034);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test22() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dl6zr1kj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dl6zr1kj() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2035);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2036);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2037)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2038)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2039);System.out.format("%n%s%n", "RegressionTest0.test22");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2040);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2041);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2042);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2043);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2044);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2045);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2046);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2047);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2048);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2049);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2050);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test23() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_214l87a1kz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_214l87a1kz() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2051);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2052);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2053)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2054)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2055);System.out.format("%n%s%n", "RegressionTest0.test23");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2056);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2057);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2058);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2059);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2060);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2061);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2062);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2063);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2064);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2065);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2066);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2067);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2068);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2069);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test24() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224eql71li();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224eql71li() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2070);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2071);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2072)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2073)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2074);System.out.format("%n%s%n", "RegressionTest0.test24");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2075);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2076);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2077);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2078);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2079);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2080);java.lang.Class<?> wildcardClass8 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2081);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2082);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2083);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2084);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2085);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test25() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25depdo1ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25depdo1ly() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2086);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2087);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2088)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2089)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2090);System.out.format("%n%s%n", "RegressionTest0.test25");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2091);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2092);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2093);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2094);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2095);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2096);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2097);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2098);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2099);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2100);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2101);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2102);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2103);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2104);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test26() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28meo651mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28meo651mh() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2105);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2106);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2107)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2108)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2109);System.out.format("%n%s%n", "RegressionTest0.test26");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2110);java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2111);java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2112);boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2113);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2114);java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.BUCKETSORT.bucketsort(intList3, 100);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2115);org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2116);org.junit.Assert.assertNotNull(intArray2);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2117);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test27() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvemym1mu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvemym1mu() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2118);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2119);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2120)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2121)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2122);System.out.format("%n%s%n", "RegressionTest0.test27");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2123);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2124);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2125);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2126);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2127);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2128);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2129);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2130);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2131);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2132);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2133);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test28() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4elr31na();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test28",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4elr31na() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2134);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2135);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2136)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2137)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2138);System.out.format("%n%s%n", "RegressionTest0.test28");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2139);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2140);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2141);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2142);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2143);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2144);java.lang.Class<?> wildcardClass8 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2145);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2146);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2147);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2148);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2149);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test29() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idekjk1nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test29",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idekjk1nq() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2150);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2151);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2152)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2153)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2154);System.out.format("%n%s%n", "RegressionTest0.test29");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2155);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2156);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2157);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2158);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2159);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2160);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2161);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2162);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2163);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2164);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2165);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2166);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2167);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2168);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2169);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2170);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test30() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu9ryu1ob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test30",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu9ryu1ob() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2171);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2172);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2173)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2174)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2175);System.out.format("%n%s%n", "RegressionTest0.test30");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2176);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2177);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2178);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2179);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2180);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2181);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2182);java.lang.Class<?> wildcardClass10 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2183);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2184);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2185);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2186);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2187);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2188);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test31() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m39qrb1ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test31",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m39qrb1ot() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2189);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2190);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2191)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2192)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2193);System.out.format("%n%s%n", "RegressionTest0.test31");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2194);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2195);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2196);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2197);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2198);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2199);java.lang.Class<?> wildcardClass8 = intList5.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2200);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2201);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2202);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2203);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2204);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test32() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pc9pjs1p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test32",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pc9pjs1p9() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2205);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2206);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2207)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2208)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2209);System.out.format("%n%s%n", "RegressionTest0.test32");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2210);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2211);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2212);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2213);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2214);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2215);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2216);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2217);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2218);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2219);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2220);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2221);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test33() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl9oc91pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test33",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl9oc91pq() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2222);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2223);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2224)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2225)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2226);System.out.format("%n%s%n", "RegressionTest0.test33");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2227);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2228);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2229);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2230);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2231);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2232);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2233);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2234);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2235);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2236);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2237);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2238);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2239);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2240);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test34() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu9n4q1q9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu9n4q1q9() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2241);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2242);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2243)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2244)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2245);System.out.format("%n%s%n", "RegressionTest0.test34");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2246);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2247);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2248);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2249);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2250);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2251);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2252);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2253);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2254);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2255);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2256);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test35() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z39lx71qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test35",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z39lx71qp() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2257);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2258);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2259)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2260)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2261);System.out.format("%n%s%n", "RegressionTest0.test35");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2262);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2263);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2264);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2265);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2266);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2267);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2268);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2269);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2270);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2271);org.junit.Assert.assertNotNull(intList5);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test36() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wouh9g1r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test36",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2272,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wouh9g1r4() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2272);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2273);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2274)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2275)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2276);System.out.format("%n%s%n", "RegressionTest0.test36");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2277);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2278);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2279);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2280);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2281);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2282);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2283);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2284);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2285);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2286);java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2287);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2288);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2289);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2290);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2291);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2292);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2293);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2294);org.junit.Assert.assertNotNull(intList13);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test37() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfuigz1rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test37",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfuigz1rr() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2295);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2296);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2297)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2298)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2299);System.out.format("%n%s%n", "RegressionTest0.test37");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2300);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2301);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2302);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2303);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2304);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2305);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2306);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2307);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2308);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2309);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2310);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2311);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2312);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2313);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2314);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2315);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test38() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6ujoi1sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test38",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6ujoi1sc() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2316);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2317);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2318)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2319)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2320);System.out.format("%n%s%n", "RegressionTest0.test38");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2321);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2322);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2323);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2324);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2325);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2326);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2327);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2328);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2329);java.lang.Class<?> wildcardClass14 = intList13.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2330);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2331);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2332);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2333);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2334);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2335);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2336);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2337);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test39() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mxukw11sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mxukw11sy() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2338);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2339);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2340)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2341)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2342);System.out.format("%n%s%n", "RegressionTest0.test39");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2343);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2344);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2345);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2346);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2347);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2348);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2349);java.lang.Class<?> wildcardClass10 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2350);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2351);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2352);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2353);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2354);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2355);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test40() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgzdgr1tg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test40",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgzdgr1tg() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2356);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2357);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2358)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2359)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2360);System.out.format("%n%s%n", "RegressionTest0.test40");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2361);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2362);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2363);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2364);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2365);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2366);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2367);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2368);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2369);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2370);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2371);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2372);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2373);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2374);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test41() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7zeoa1tz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test41",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7zeoa1tz() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2375);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2376);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2377)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2378)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2379);System.out.format("%n%s%n", "RegressionTest0.test41");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2380);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2381);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2382);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2383);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2384);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2385);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2386);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2387);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2388);java.lang.Class<?> wildcardClass14 = intList11.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2389);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2390);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2391);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2392);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2393);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2394);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2395);org.junit.Assert.assertNotNull(intList13);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2396);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test42() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyzfvt1ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test42",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyzfvt1ul() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2397);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2398);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2399)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2400)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2401);System.out.format("%n%s%n", "RegressionTest0.test42");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2402);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2403);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2404);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2405);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2406);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2407);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2408);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2409);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2410);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2411);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2412);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2413);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2414);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2415);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2416);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2417);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test43() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpzh3c1v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test43",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpzh3c1v6() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2418);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2419);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2420)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2421)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2422);System.out.format("%n%s%n", "RegressionTest0.test43");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2423);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2424);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2425);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2426);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2427);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2428);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2429);java.lang.Class<?> wildcardClass10 = intList5.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2430);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2431);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2432);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2433);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2434);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2435);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test44() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gziav1vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test44",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gziav1vo() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2436);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2437);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2438)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2439)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2440);System.out.format("%n%s%n", "RegressionTest0.test44");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2441);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2442);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2443);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2444);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2445);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2446);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2447);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2448);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2449);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2450);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2451);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2452);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2453);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2454);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test45() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267zjie1w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test45",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267zjie1w7() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2455);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2456);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2457)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2458)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2459);System.out.format("%n%s%n", "RegressionTest0.test45");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2460);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2461);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2462);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2463);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2464);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2465);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2466);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2467);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2468);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2469);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2470);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test46() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yzkpx1wn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test46",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yzkpx1wn() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2471);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2472);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2473)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2474)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2475);System.out.format("%n%s%n", "RegressionTest0.test46");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2476);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2477);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2478);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2479);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2480);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2481);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2482);java.lang.Class<?> wildcardClass10 = intList9.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2483);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2484);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2485);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2486);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2487);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2488);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test47() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0e2k1x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0e2k1x5() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2489);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2490);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2491)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2492)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2493);System.out.format("%n%s%n", "RegressionTest0.test47");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2494);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2495);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2496);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2497);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2498);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2499);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2500);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2501);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2502);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2503);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2504);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2505);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2506);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2507);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test48() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23j0cv11xo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test48",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23j0cv11xo() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2508);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2509);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2510)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2511)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2512);System.out.format("%n%s%n", "RegressionTest0.test48");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2513);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2514);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2515);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2516);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2517);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2518);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2519);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2520);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2521);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2522);java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2523);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2524);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2525);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2526);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2527);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2528);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2529);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2530);org.junit.Assert.assertNotNull(intList13);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test49() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s0bni1yb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test49",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2531,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s0bni1yb() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2531);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2532);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2533)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2534)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2535);System.out.format("%n%s%n", "RegressionTest0.test49");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2536);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2537);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2538);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2539);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2540);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2541);java.lang.Class<?> wildcardClass8 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2542);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2543);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2544);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2545);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2546);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test50() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278vj2s1yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test50",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278vj2s1yr() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2547);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2548);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2549)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2550)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2551);System.out.format("%n%s%n", "RegressionTest0.test50");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2552);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2553);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2554);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2555);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2556);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2557);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2558);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2559);java.lang.Class<?> wildcardClass12 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2560);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2561);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2562);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2563);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2564);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2565);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2566);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test51() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahvhv91zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test51",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahvhv91zb() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2567);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2568);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2569)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2570)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2571);System.out.format("%n%s%n", "RegressionTest0.test51");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2572);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2573);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2574);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2575);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2576);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2577);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2578);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2579);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2580);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2581);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2582);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2583);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2584);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2585);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2586);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2587);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test52() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqvgnq1zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test52",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqvgnq1zw() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2588);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2589);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2590)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2591)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2592);System.out.format("%n%s%n", "RegressionTest0.test52");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2593);java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 10, 100, 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2594);java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2595);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2596);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2597);java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2598);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2599);org.junit.Assert.assertNotNull(intArray4);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2600);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test53() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzvfg7209();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test53",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzvfg7209() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2601);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2602);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2603)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2604)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2605);System.out.format("%n%s%n", "RegressionTest0.test53");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2606);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2607);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2608);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2609);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2610);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2611);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2612);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2613);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2614);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2615);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2616);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2617);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2618);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2619);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test54() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8ve8o20s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test54",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8ve8o20s() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2620);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2621);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2622)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2623)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2624);System.out.format("%n%s%n", "RegressionTest0.test54");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2625);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2626);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2627);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2628);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2629);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2630);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2631);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2632);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2633);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2634);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2635);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2636);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test55() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvd15219();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test55",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvd15219() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2637);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2638);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2639)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2640)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2641);System.out.format("%n%s%n", "RegressionTest0.test55");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2642);java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2643);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2644);java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) (short) 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2645);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test56() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqvbtm21i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test56",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqvbtm21i() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2646);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2647);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2648)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2649)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2650);System.out.format("%n%s%n", "RegressionTest0.test56");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2651);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2652);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2653);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2654);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2655);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2656);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2657);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2658);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2659);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2660);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2661);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2662);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2663);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2664);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2665);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2666);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test57() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzvam3223();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test57",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzvam3223() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2667);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2668);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2669)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2670)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2671);System.out.format("%n%s%n", "RegressionTest0.test57");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2672);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2673);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2674);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2675);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2676);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2677);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2678);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2679);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2680);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2681);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2682);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2683);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2684);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2685);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test58() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8v9ek22m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test58",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8v9ek22m() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2686);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2687);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2688)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2689)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2690);System.out.format("%n%s%n", "RegressionTest0.test58");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2691);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2692);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2693);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2694);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2695);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2696);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2697);java.lang.Class<?> wildcardClass10 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2698);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2699);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2700);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2701);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2702);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2703);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test59() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yj8ts3234();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test59",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yj8ts3234() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2704);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2705);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2706)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2707)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2708);System.out.format("%n%s%n", "RegressionTest0.test59");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2709);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2710);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2711);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2712);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2713);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2714);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2715);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2716);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2717);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test60() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2dmct23i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test60",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2dmct23i() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2718);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2719);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2720)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2721)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2722);System.out.format("%n%s%n", "RegressionTest0.test60");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2723);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2724);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2725);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2726);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2727);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2728);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2729);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2730);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2731);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2732);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2733);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2734);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2735);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test61() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utdnkc240();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test61",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utdnkc240() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2736);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2737);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2738)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2739)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2740);System.out.format("%n%s%n", "RegressionTest0.test61");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2741);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2742);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2743);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2744);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2745);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2746);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2747);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2748);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2749);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2750);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2751);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2752);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2753);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2754);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2755);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2756);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test62() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkdorv24l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test62",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkdorv24l() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2757);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2758);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2759)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2760)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2761);System.out.format("%n%s%n", "RegressionTest0.test62");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2762);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2763);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2764);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2765);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2766);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2767);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2768);java.lang.Class<?> wildcardClass10 = intList9.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2769);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2770);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2771);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2772);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2773);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2774);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test63() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obdpze253();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test63",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obdpze253() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2775);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2776);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2777)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2778)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2779);System.out.format("%n%s%n", "RegressionTest0.test63");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2780);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2781);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2782);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2783);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2784);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2785);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2786);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2787);java.lang.Class<?> wildcardClass12 = intList11.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2788);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2789);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2790);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2791);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2792);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2793);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2794);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test64() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2dr6x25n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test64",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2dr6x25n() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2795);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2796);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2797)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2798)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2799);System.out.format("%n%s%n", "RegressionTest0.test64");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2800);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2801);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2802);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2803);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2804);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2805);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2806);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2807);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2808);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2809);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2810);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2811);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2812);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test65() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htdseg265();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test65",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htdseg265() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2813);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2814);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2815)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2816)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2817);System.out.format("%n%s%n", "RegressionTest0.test65");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2818);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2819);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2820);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2821);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2822);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2823);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2824);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2825);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2826);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2827);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2828);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2829);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2830);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2831);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test66() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekdtlz26o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test66",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekdtlz26o() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2832);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2833);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2834)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2835)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2836);System.out.format("%n%s%n", "RegressionTest0.test66");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2837);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2838);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2839);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2840);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2841);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2842);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2843);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2844);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(2845);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2846);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2847);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2848);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2849);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2850);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test67() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbduti277();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test67",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbduti277() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2851);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2852);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2853)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2854)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2855);System.out.format("%n%s%n", "RegressionTest0.test67");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2856);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2857);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2858);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2859);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2860);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2861);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2862);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2863);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2864);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2865);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2866);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2867);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2868);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test68() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282dw1127p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test68",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282dw1127p() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2869);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2870);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2871)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2872)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2873);System.out.format("%n%s%n", "RegressionTest0.test68");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2874);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2875);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2876);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2877);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2878);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2879);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2880);java.lang.Class<?> wildcardClass10 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2881);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2882);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2883);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2884);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2885);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2886);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test69() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24tdx8k287();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test69",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2887,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24tdx8k287() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2887);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2888);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2889)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2890)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2891);System.out.format("%n%s%n", "RegressionTest0.test69");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2892);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2893);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2894);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2895);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2896);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2897);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2898);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2899);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2900);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2901);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2902);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2903);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2904);org.junit.Assert.assertNotNull(intList11);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test70() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cipta28p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test70",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cipta28p() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2905);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2906);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2907)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2908)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2909);System.out.format("%n%s%n", "RegressionTest0.test70");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2910);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2911);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2912);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2913);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2914);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2915);java.lang.Class<?> wildcardClass8 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2916);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2917);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2918);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2919);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2920);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test71() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213ir0t295();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test71",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213ir0t295() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2921);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2922);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2923)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2924)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2925);System.out.format("%n%s%n", "RegressionTest0.test71");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2926);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2927);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2928);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2929);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2930);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2931);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2932);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2933);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2934);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2935);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2936);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test72() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225h7ro29l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test72",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225h7ro29l() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2937);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2938);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2939)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2940)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2941);System.out.format("%n%s%n", "RegressionTest0.test72");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2942);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2943);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2944);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2945);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2946);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2947);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2948);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2949);java.lang.Class<?> wildcardClass12 = intList11.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2950);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2951);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2952);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2953);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2954);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2955);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2956);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test73() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25eh6k52a5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test73",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25eh6k52a5() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2957);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2958);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2959)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2960)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2961);System.out.format("%n%s%n", "RegressionTest0.test73");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2962);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2963);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2964);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2965);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2966);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2967);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2968);java.lang.Class<?> wildcardClass10 = intList7.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2969);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2970);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2971);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2972);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2973);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2974);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test74() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28nh5cm2an();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test74",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28nh5cm2an() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2975);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2976);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2977)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2978)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2979);System.out.format("%n%s%n", "RegressionTest0.test74");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2980);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2981);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2982);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2983);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2984);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2985);java.lang.Class<?> wildcardClass8 = intList5.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2986);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2987);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2988);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2989);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2990);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test75() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),2991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bwh4532b3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test75",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bwh4532b3() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(2991);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2992);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(2993)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(2994)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(2995);System.out.format("%n%s%n", "RegressionTest0.test75");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(2996);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2997);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2998);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(2999);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3000);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3001);java.lang.Class<?> wildcardClass8 = intList2.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3002);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3003);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3004);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3005);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3006);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test76() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),3007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5h2xk2bj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test76",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5h2xk2bj() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(3007);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3008);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(3009)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(3010)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(3011);System.out.format("%n%s%n", "RegressionTest0.test76");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(3012);java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3013);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3014);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3015);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(3016);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) -1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(3017);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3018);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3019);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test77() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),3020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ieh1q12bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test77",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ieh1q12bw() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(3020);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3021);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(3022)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(3023)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(3024);System.out.format("%n%s%n", "RegressionTest0.test77");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(3025);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3026);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3027);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3028);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3029);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3030);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3031);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3032);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3033);org.junit.Assert.assertNotNull(intList7);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test78() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),3034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnh0ii2ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test78",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnh0ii2ca() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(3034);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3035);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(3036)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(3037)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(3038);System.out.format("%n%s%n", "RegressionTest0.test78");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(3039);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3040);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3041);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3042);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3043);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3044);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3045);java.lang.Class<?> wildcardClass10 = intList9.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3046);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3047);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3048);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3049);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3050);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3051);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test79() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),3052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owgzaz2cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test79",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owgzaz2cs() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(3052);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3053);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(3054)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(3055)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(3056);System.out.format("%n%s%n", "RegressionTest0.test79");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(3057);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3058);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3059);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3060);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3061);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3062);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3063);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(3064);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(3065);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3066);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3067);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3068);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3069);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3070);org.junit.Assert.assertNotNull(intList9);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test80() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),3071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdc6q92db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test80",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdc6q92db() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(3071);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3072);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(3073)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(3074)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(3075);System.out.format("%n%s%n", "RegressionTest0.test80");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(3076);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3077);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3078);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3079);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3080);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3081);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3082);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3083);java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3084);try {
            __CLR4_5_21cm1cmlwzscb2x.R.inc(3085);java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
            __CLR4_5_21cm1cmlwzscb2x.R.inc(3086);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3087);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3088);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3089);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3090);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3091);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3092);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3093);org.junit.Assert.assertNotNull(intList13);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}

    @Test
    public void test81() throws Throwable {__CLR4_5_21cm1cmlwzscb2x.R.globalSliceStart(getClass().getName(),3094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smc5iq2dy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm1cmlwzscb2x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm1cmlwzscb2x.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test81",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smc5iq2dy() throws Throwable{try{__CLR4_5_21cm1cmlwzscb2x.R.inc(3094);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3095);if ((((debug)&&(__CLR4_5_21cm1cmlwzscb2x.R.iget(3096)!=0|true))||(__CLR4_5_21cm1cmlwzscb2x.R.iget(3097)==0&false)))
            {__CLR4_5_21cm1cmlwzscb2x.R.inc(3098);System.out.format("%n%s%n", "RegressionTest0.test81");
        }__CLR4_5_21cm1cmlwzscb2x.R.inc(3099);java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3100);java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3101);boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3102);java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3103);java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3104);java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3105);java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3106);java.lang.Class<?> wildcardClass12 = intList11.getClass();
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3107);org.junit.Assert.assertNotNull(intArray1);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3108);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3109);org.junit.Assert.assertNotNull(intList5);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3110);org.junit.Assert.assertNotNull(intList7);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3111);org.junit.Assert.assertNotNull(intList9);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3112);org.junit.Assert.assertNotNull(intList11);
        __CLR4_5_21cm1cmlwzscb2x.R.inc(3113);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_21cm1cmlwzscb2x.R.flushNeeded();}}
}

