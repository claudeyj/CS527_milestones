/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_2gy6gy6lx1h8qw4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570690501L,8589935092L,23813,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),21966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yt33ugy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test01",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yt33ugy6() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21966);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21967);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21968)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21969)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21970);System.out.format("%n%s%n", "RegressionTest0.test01");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21971);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21972);java.lang.Class<?> wildcardClass1 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21973);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21974);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test02() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),21975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277t1wbgyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test02",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277t1wbgyf() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21975);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21976);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21977)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21978)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21979);System.out.format("%n%s%n", "RegressionTest0.test02");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21980);org.openpnp.model.Location location0 = null;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21981);org.openpnp.model.Location location1 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21982);try {
            __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21983);double double2 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.getAngleFromPoint(location0, location1);
            __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21984);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test03() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),21985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agt0osgyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test03",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agt0osgyp() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21985);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21986);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21987)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21988)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21989);System.out.format("%n%s%n", "RegressionTest0.test03");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21990);org.openpnp.model.Location location0 = null;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21991);org.openpnp.model.Location location1 = null;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21992);org.openpnp.model.Length length2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21993);try {
            __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21994);org.openpnp.model.Location location3 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.getPointAlongLine(location0, location1, length2);
            __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21995);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test04() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),21996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpszh9gz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test04",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpszh9gz0() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(21996);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(21997);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21998)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(21999)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22000);System.out.format("%n%s%n", "RegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22001);try {
            __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22002);org.openpnp.machine.reference.feeder.ReferenceStripFeeder referenceStripFeeder0 = new org.openpnp.machine.reference.feeder.ReferenceStripFeeder();
            __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22003);org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Configuration instance not yet initialized.");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test05() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gysy9qgz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test05",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gysy9qgz8() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22004);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22005);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22006)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22007)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22008);System.out.format("%n%s%n", "RegressionTest0.test05");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22009);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22010);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22011);java.lang.Class<?> wildcardClass2 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22012);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22013);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22014);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test06() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7sx27gzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test06",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7sx27gzj() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22015);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22016);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22017)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22018)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22019);System.out.format("%n%s%n", "RegressionTest0.test06");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22020);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22021);java.lang.Class<?> wildcardClass1 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22022);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22023);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test07() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngsvuogzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test07",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngsvuogzs() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22024);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22025);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22026)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22027)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22028);System.out.format("%n%s%n", "RegressionTest0.test07");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22029);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22030);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22031);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test08() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpsun5h00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test08",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpsun5h00() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22032);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22033);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22034)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22035)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22036);System.out.format("%n%s%n", "RegressionTest0.test08");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22037);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22038);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22039);java.lang.Class<?> wildcardClass2 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22040);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22041);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22042);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test09() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tystfmh0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test09",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tystfmh0b() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22043);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22044);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22045)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22046)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22047);System.out.format("%n%s%n", "RegressionTest0.test09");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22048);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22049);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22050);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22051);java.lang.Class<?> wildcardClass3 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22052);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22053);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22054);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22055);org.junit.Assert.assertNotNull(wildcardClass3);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test10() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufo0uwh0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufo0uwh0o() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22056);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22057);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22058)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22059)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22060);System.out.format("%n%s%n", "RegressionTest0.test10");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22061);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22062);java.lang.Class<?> wildcardClass1 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22063);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22064);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test11() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xonzndh0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xonzndh0x() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22065);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22066);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22067)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22068)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22069);System.out.format("%n%s%n", "RegressionTest0.test11");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22070);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22071);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22072);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22073);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22074);java.lang.Class<?> wildcardClass4 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22075);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22076);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22077);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22078);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22079);org.junit.Assert.assertNotNull(wildcardClass4);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test12() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3g3jah1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22080,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3g3jah1c() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22080);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22081);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22082)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22083)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22084);System.out.format("%n%s%n", "RegressionTest0.test12");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22085);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22086);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22087);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22088);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22089);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22090);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22091);java.lang.Class<?> wildcardClass6 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22092);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22093);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22094);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22095);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22096);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22097);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22098);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test13() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uug4qth1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uug4qth1v() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22099);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22100);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22101)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22102)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22103);System.out.format("%n%s%n", "RegressionTest0.test13");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22104);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22105);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22106);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22107);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22108);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22109);java.lang.Class<?> wildcardClass5 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22110);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22111);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22112);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22113);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22114);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22115);org.junit.Assert.assertNotNull(wildcardClass5);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test14() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlg5ych2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlg5ych2c() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22116);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22117);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22118)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22119)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22120);System.out.format("%n%s%n", "RegressionTest0.test14");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22121);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22122);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22123);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22124);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22125);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22126);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22127);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22128);java.lang.Class<?> wildcardClass7 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22129);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22130);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22131);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22132);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22133);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22134);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22135);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22136);org.junit.Assert.assertNotNull(wildcardClass7);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test15() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocg75vh2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocg75vh2x() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22137);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22138);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22139)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22140)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22141);System.out.format("%n%s%n", "RegressionTest0.test15");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22142);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22143);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22144);java.lang.Class<?> wildcardClass2 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22145);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22146);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22147);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test16() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3g8deh38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3g8deh38() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22148);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22149);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22150)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22151)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22152);System.out.format("%n%s%n", "RegressionTest0.test16");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22153);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22154);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22155);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22156);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22157);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22158);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22159);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22160);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22161);java.lang.Class<?> wildcardClass8 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22162);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22163);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22164);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22165);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22166);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22167);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22168);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22169);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22170);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test17() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hug9kxh3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hug9kxh3v() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22171);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22172);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22173)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22174)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22175);System.out.format("%n%s%n", "RegressionTest0.test17");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22176);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22177);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22178);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22179);java.lang.Class<?> wildcardClass3 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22180);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22181);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22182);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22183);org.junit.Assert.assertNotNull(wildcardClass3);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test18() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elgasgh48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elgasgh48() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22184);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22185);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22186)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22187)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22188);System.out.format("%n%s%n", "RegressionTest0.test18");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22189);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22190);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22191);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22192);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22193);java.lang.Class<?> wildcardClass4 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22194);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22195);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22196);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22197);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22198);org.junit.Assert.assertNotNull(wildcardClass4);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test19() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcgbzzh4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcgbzzh4n() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22199);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22200);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22201)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22202)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22203);System.out.format("%n%s%n", "RegressionTest0.test19");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22204);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22205);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22206);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22207);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22208);java.lang.Class<?> wildcardClass4 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22209);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22210);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22211);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22212);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22213);org.junit.Assert.assertNotNull(wildcardClass4);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test20() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avl4kph52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avl4kph52() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22214);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22215);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22216)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22217)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22218);System.out.format("%n%s%n", "RegressionTest0.test20");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22219);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22220);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22221);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22222);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22223);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22224);java.lang.Class<?> wildcardClass5 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22225);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22226);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22227);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22228);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22229);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22230);org.junit.Assert.assertNotNull(wildcardClass5);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test21() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ml5s8h5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ml5s8h5j() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22231);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22232);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22233)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22234)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22235);System.out.format("%n%s%n", "RegressionTest0.test21");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22236);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22237);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22238);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22239);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22240);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22241);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22242);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22243);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22244);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22245);java.lang.Class<?> wildcardClass9 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22246);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22247);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22248);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22249);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22250);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22251);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22252);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22253);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22254);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22255);org.junit.Assert.assertNotNull(wildcardClass9);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test22() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dl6zrh68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dl6zrh68() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22256);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22257);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22258)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22259)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22260);System.out.format("%n%s%n", "RegressionTest0.test22");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22261);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22262);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22263);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22264);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22265);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22266);java.lang.Class<?> wildcardClass5 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22267);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22268);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22269);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22270);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22271);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22272);org.junit.Assert.assertNotNull(wildcardClass5);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test23() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_214l87ah6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_214l87ah6p() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22273);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22274);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22275)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22276)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22277);System.out.format("%n%s%n", "RegressionTest0.test23");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22278);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22279);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22280);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22281);java.lang.Class<?> wildcardClass3 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22282);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22283);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22284);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22285);org.junit.Assert.assertNotNull(wildcardClass3);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test24() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224eql7h72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224eql7h72() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22286);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22287);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22288)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22289)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22290);System.out.format("%n%s%n", "RegressionTest0.test24");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22291);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22292);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22293);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22294);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22295);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22296);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22297);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22298);java.lang.Class<?> wildcardClass7 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22299);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22300);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22301);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22302);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22303);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22304);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22305);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22306);org.junit.Assert.assertNotNull(wildcardClass7);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test25() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25depdoh7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25depdoh7n() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22307);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22308);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22309)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22310)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22311);System.out.format("%n%s%n", "RegressionTest0.test25");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22312);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22313);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22314);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22315);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22316);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22317);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22318);java.lang.Class<?> wildcardClass6 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22319);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22320);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22321);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22322);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22323);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22324);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22325);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test26() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28meo65h86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28meo65h86() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22326);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22327);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22328)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22329)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22330);System.out.format("%n%s%n", "RegressionTest0.test26");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22331);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22332);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22333);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22334);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22335);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22336);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22337);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22338);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22339);java.lang.Class<?> wildcardClass8 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22340);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22341);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22342);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22343);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22344);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22345);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22346);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22347);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22348);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test27() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvemymh8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvemymh8t() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22349);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22350);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22351)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22352)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22353);System.out.format("%n%s%n", "RegressionTest0.test27");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22354);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22355);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22356);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22357);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22358);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22359);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22360);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22361);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22362);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22363);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22364);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22365);java.lang.Class<?> wildcardClass11 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22366);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22367);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22368);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22369);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22370);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22371);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22372);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22373);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22374);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22375);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22376);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22377);org.junit.Assert.assertNotNull(wildcardClass11);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test28() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4elr3h9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test28",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4elr3h9m() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22378);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22379);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22380)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22381)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22382);System.out.format("%n%s%n", "RegressionTest0.test28");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22383);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22384);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22385);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22386);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22387);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22388);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22389);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22390);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22391);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22392);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22393);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22394);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22395);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22396);java.lang.Class<?> wildcardClass13 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22397);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22398);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22399);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22400);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22401);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22402);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22403);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22404);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22405);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22406);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22407);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22408);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22409);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22410);org.junit.Assert.assertNotNull(wildcardClass13);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test29() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idekjkhaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test29",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idekjkhaj() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22411);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22412);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22413)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22414)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22415);System.out.format("%n%s%n", "RegressionTest0.test29");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22416);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22417);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22418);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22419);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22420);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22421);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22422);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22423);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22424);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22425);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22426);java.lang.Class<?> wildcardClass10 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22427);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22428);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22429);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22430);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22431);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22432);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22433);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22434);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22435);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22436);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22437);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test30() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu9ryuhba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test30",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu9ryuhba() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22438);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22439);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22440)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22441)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22442);System.out.format("%n%s%n", "RegressionTest0.test30");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22443);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22444);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22445);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22446);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22447);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22448);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22449);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22450);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22451);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22452);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22453);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22454);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22455);java.lang.Class<?> wildcardClass12 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22456);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22457);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22458);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22459);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22460);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22461);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22462);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22463);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22464);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22465);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22466);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22467);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22468);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test31() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m39qrbhc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test31",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m39qrbhc5() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22469);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22470);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22471)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22472)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22473);System.out.format("%n%s%n", "RegressionTest0.test31");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22474);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22475);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22476);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22477);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22478);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22479);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22480);java.lang.Class<?> wildcardClass6 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22481);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22482);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22483);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22484);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22485);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22486);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22487);org.junit.Assert.assertNotNull(wildcardClass6);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test32() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pc9pjshco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test32",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pc9pjshco() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22488);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22489);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22490)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22491)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22492);System.out.format("%n%s%n", "RegressionTest0.test32");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22493);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22494);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22495);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22496);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22497);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22498);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22499);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22500);java.lang.Class<?> wildcardClass7 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22501);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22502);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22503);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22504);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22505);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22506);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22507);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22508);org.junit.Assert.assertNotNull(wildcardClass7);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test33() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl9oc9hd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test33",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22509,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl9oc9hd9() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22509);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22510);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22511)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22512)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22513);System.out.format("%n%s%n", "RegressionTest0.test33");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22514);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22515);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22516);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22517);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22518);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22519);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22520);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22521);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22522);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22523);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22524);java.lang.Class<?> wildcardClass10 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22525);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22526);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22527);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22528);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22529);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22530);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22531);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22532);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22533);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22534);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22535);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test34() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu9n4qhe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu9n4qhe0() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22536);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22537);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22538)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22539)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22540);System.out.format("%n%s%n", "RegressionTest0.test34");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22541);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22542);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22543);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22544);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22545);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22546);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22547);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22548);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22549);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22550);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22551);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22552);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22553);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22554);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22555);java.lang.Class<?> wildcardClass14 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22556);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22557);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22558);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22559);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22560);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22561);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22562);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22563);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22564);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22565);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22566);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22567);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22568);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22569);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22570);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test35() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z39lx7hez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test35",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z39lx7hez() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22571);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22572);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22573)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22574)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22575);System.out.format("%n%s%n", "RegressionTest0.test35");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22576);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22577);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22578);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22579);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22580);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22581);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22582);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22583);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22584);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22585);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22586);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22587);java.lang.Class<?> wildcardClass11 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22588);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22589);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22590);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22591);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22592);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22593);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22594);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22595);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22596);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22597);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22598);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22599);org.junit.Assert.assertNotNull(wildcardClass11);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test36() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wouh9ghfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test36",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22600,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wouh9ghfs() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22600);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22601);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22602)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22603)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22604);System.out.format("%n%s%n", "RegressionTest0.test36");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22605);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22606);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22607);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22608);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22609);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22610);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22611);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22612);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22613);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22614);java.lang.Class<?> wildcardClass9 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22615);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22616);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22617);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22618);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22619);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22620);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22621);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22622);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22623);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22624);org.junit.Assert.assertNotNull(wildcardClass9);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test37() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfuigzhgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test37",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfuigzhgh() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22625);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22626);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22627)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22628)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22629);System.out.format("%n%s%n", "RegressionTest0.test37");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22630);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22631);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22632);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22633);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22634);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22635);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22636);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22637);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22638);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22639);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22640);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22641);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22642);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22643);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22644);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22645);java.lang.Class<?> wildcardClass15 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22646);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22647);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22648);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22649);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22650);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22651);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22652);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22653);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22654);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22655);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22656);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22657);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22658);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22659);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22660);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22661);org.junit.Assert.assertNotNull(wildcardClass15);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test38() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6ujoihhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test38",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6ujoihhi() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22662);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22663);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22664)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22665)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22666);System.out.format("%n%s%n", "RegressionTest0.test38");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22667);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22668);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22669);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22670);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22671);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22672);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22673);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22674);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22675);java.lang.Class<?> wildcardClass8 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22676);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22677);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22678);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22679);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22680);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22681);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22682);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22683);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22684);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test39() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mxukw1hi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mxukw1hi5() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22685);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22686);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22687)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22688)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22689);System.out.format("%n%s%n", "RegressionTest0.test39");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22690);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22691);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22692);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22693);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22694);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22695);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22696);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22697);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22698);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22699);java.lang.Class<?> wildcardClass9 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22700);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22701);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22702);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22703);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22704);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22705);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22706);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22707);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22708);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22709);org.junit.Assert.assertNotNull(wildcardClass9);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test40() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgzdgrhiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test40",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgzdgrhiu() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22710);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22711);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22712)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22713)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22714);System.out.format("%n%s%n", "RegressionTest0.test40");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22715);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22716);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22717);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22718);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22719);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22720);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22721);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22722);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22723);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22724);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22725);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22726);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22727);java.lang.Class<?> wildcardClass12 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22728);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22729);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22730);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22731);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22732);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22733);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22734);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22735);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22736);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22737);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22738);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22739);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22740);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test41() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7zeoahjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test41",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7zeoahjp() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22741);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22742);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22743)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22744)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22745);System.out.format("%n%s%n", "RegressionTest0.test41");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22746);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22747);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22748);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22749);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22750);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22751);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22752);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22753);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22754);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22755);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22756);java.lang.Class<?> wildcardClass10 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22757);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22758);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22759);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22760);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22761);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22762);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22763);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22764);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22765);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22766);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22767);org.junit.Assert.assertNotNull(wildcardClass10);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test42() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyzfvthkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test42",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyzfvthkg() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22768);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22769);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22770)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22771)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22772);System.out.format("%n%s%n", "RegressionTest0.test42");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22773);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22774);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22775);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22776);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22777);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22778);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22779);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22780);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22781);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22782);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22783);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22784);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22785);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22786);java.lang.Class<?> wildcardClass13 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22787);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22788);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22789);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22790);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22791);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22792);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22793);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22794);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22795);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22796);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22797);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22798);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22799);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22800);org.junit.Assert.assertNotNull(wildcardClass13);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test43() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpzh3chld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test43",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpzh3chld() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22801);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22802);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22803)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22804)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22805);System.out.format("%n%s%n", "RegressionTest0.test43");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22806);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22807);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22808);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22809);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22810);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22811);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22812);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22813);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22814);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22815);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22816);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22817);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22818);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22819);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22820);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22821);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22822);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22823);java.lang.Class<?> wildcardClass17 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22824);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22825);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22826);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22827);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22828);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22829);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22830);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22831);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22832);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22833);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22834);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22835);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22836);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22837);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22838);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22839);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22840);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22841);org.junit.Assert.assertNotNull(wildcardClass17);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test44() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gziavhmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test44",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22842,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gziavhmi() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22842);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22843);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22844)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22845)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22846);System.out.format("%n%s%n", "RegressionTest0.test44");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22847);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22848);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22849);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22850);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22851);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22852);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22853);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22854);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22855);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22856);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22857);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22858);java.lang.Class<?> wildcardClass11 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22859);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22860);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22861);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22862);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22863);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22864);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22865);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22866);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22867);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22868);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22869);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22870);org.junit.Assert.assertNotNull(wildcardClass11);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test45() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267zjiehnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test45",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267zjiehnb() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22871);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22872);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22873)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22874)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22875);System.out.format("%n%s%n", "RegressionTest0.test45");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22876);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22877);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22878);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22879);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22880);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22881);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22882);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22883);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22884);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22885);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22886);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22887);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22888);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22889);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22890);java.lang.Class<?> wildcardClass14 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22891);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22892);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22893);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22894);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22895);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22896);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22897);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22898);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22899);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22900);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22901);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22902);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22903);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22904);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22905);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test46() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yzkpxhoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test46",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yzkpxhoa() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22906);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22907);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22908)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22909)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22910);System.out.format("%n%s%n", "RegressionTest0.test46");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22911);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22912);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22913);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22914);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22915);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22916);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22917);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22918);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22919);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22920);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22921);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22922);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22923);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22924);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22925);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22926);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22927);java.lang.Class<?> wildcardClass16 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22928);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22929);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22930);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22931);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22932);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22933);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22934);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22935);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22936);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22937);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22938);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22939);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22940);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22941);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22942);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22943);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22944);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test47() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0e2khpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0e2khpd() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22945);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22946);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22947)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22948)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22949);System.out.format("%n%s%n", "RegressionTest0.test47");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22950);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22951);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22952);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22953);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22954);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22955);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22956);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22957);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22958);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22959);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22960);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22961);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22962);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22963);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22964);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22965);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22966);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22967);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22968);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22969);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22970);java.lang.Class<?> wildcardClass20 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22971);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22972);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22973);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22974);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22975);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22976);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22977);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22978);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22979);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22980);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22981);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22982);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22983);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22984);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22985);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22986);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22987);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22988);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22989);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22990);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22991);org.junit.Assert.assertNotNull(wildcardClass20);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test48() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),22992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23j0cv1hqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test48",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23j0cv1hqo() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22992);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22993);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22994)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(22995)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22996);System.out.format("%n%s%n", "RegressionTest0.test48");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(22997);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22998);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(22999);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23000);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23001);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23002);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23003);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23004);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23005);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23006);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23007);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23008);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23009);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23010);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23011);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23012);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23013);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23014);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23015);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23016);java.lang.Class<?> wildcardClass19 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23017);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23018);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23019);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23020);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23021);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23022);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23023);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23024);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23025);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23026);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23027);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23028);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23029);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23030);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23031);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23032);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23033);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23034);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23035);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23036);org.junit.Assert.assertNotNull(wildcardClass19);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test49() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s0bnihrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test49",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s0bnihrx() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23037);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23038);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23039)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23040)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23041);System.out.format("%n%s%n", "RegressionTest0.test49");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23042);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23043);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23044);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23045);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23046);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23047);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23048);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23049);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23050);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23051);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23052);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23053);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23054);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23055);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23056);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23057);java.lang.Class<?> wildcardClass15 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23058);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23059);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23060);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23061);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23062);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23063);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23064);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23065);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23066);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23067);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23068);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23069);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23070);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23071);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23072);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23073);org.junit.Assert.assertNotNull(wildcardClass15);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test50() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278vj2shsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test50",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278vj2shsy() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23074);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23075);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23076)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23077)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23078);System.out.format("%n%s%n", "RegressionTest0.test50");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23079);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23080);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23081);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23082);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23083);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23084);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23085);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23086);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23087);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23088);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23089);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23090);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23091);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23092);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23093);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23094);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23095);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23096);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23097);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23098);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23099);java.lang.String str20 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23100);java.lang.Class<?> wildcardClass21 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23101);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23102);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23103);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23104);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23105);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23106);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23107);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23108);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23109);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23110);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23111);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23112);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23113);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23114);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23115);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23116);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23117);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23118);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23119);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23120);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23121);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23122);org.junit.Assert.assertNotNull(wildcardClass21);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test51() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahvhv9hub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test51",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahvhv9hub() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23123);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23124);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23125)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23126)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23127);System.out.format("%n%s%n", "RegressionTest0.test51");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23128);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23129);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23130);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23131);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23132);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23133);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23134);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23135);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23136);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23137);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23138);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23139);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23140);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23141);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23142);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23143);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23144);java.lang.Class<?> wildcardClass16 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23145);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23146);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23147);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23148);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23149);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23150);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23151);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23152);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23153);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23154);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23155);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23156);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23157);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23158);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23159);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23160);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23161);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test52() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqvgnqhve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test52",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqvgnqhve() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23162);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23163);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23164)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23165)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23166);System.out.format("%n%s%n", "RegressionTest0.test52");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23167);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23168);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23169);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23170);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23171);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23172);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23173);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23174);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23175);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23176);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23177);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23178);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23179);java.lang.Class<?> wildcardClass12 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23180);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23181);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23182);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23183);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23184);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23185);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23186);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23187);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23188);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23189);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23190);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23191);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23192);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test53() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzvfg7hw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test53",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzvfg7hw9() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23193);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23194);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23195)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23196)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23197);System.out.format("%n%s%n", "RegressionTest0.test53");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23198);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23199);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23200);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23201);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23202);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23203);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23204);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23205);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23206);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23207);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23208);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23209);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23210);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23211);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23212);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23213);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23214);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23215);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23216);java.lang.Class<?> wildcardClass18 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23217);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23218);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23219);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23220);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23221);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23222);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23223);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23224);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23225);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23226);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23227);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23228);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23229);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23230);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23231);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23232);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23233);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23234);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23235);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test54() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8ve8ohxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test54",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8ve8ohxg() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23236);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23237);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23238)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23239)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23240);System.out.format("%n%s%n", "RegressionTest0.test54");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23241);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23242);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23243);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23244);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23245);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23246);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23247);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23248);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23249);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23250);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23251);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23252);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23253);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23254);java.lang.Class<?> wildcardClass13 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23255);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23256);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23257);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23258);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23259);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23260);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23261);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23262);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23263);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23264);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23265);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23266);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23267);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23268);org.junit.Assert.assertNotNull(wildcardClass13);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test55() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvd15hyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test55",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvd15hyd() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23269);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23270);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23271)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23272)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23273);System.out.format("%n%s%n", "RegressionTest0.test55");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23274);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23275);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23276);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23277);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23278);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23279);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23280);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23281);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23282);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23283);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23284);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23285);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23286);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23287);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23288);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23289);java.lang.Class<?> wildcardClass15 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23290);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23291);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23292);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23293);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23294);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23295);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23296);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23297);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23298);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23299);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23300);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23301);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23302);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23303);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23304);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Clear Plastic" + "'", str14, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23305);org.junit.Assert.assertNotNull(wildcardClass15);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test56() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqvbtmhze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test56",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqvbtmhze() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23306);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23307);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23308)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23309)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23310);System.out.format("%n%s%n", "RegressionTest0.test56");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23311);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23312);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23313);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23314);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23315);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23316);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23317);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23318);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23319);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23320);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23321);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23322);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23323);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23324);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23325);java.lang.Class<?> wildcardClass14 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23326);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23327);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23328);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23329);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23330);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23331);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23332);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23333);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23334);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23335);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23336);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23337);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23338);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23339);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23340);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test57() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzvam3i0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test57",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzvam3i0d() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23341);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23342);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23343)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23344)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23345);System.out.format("%n%s%n", "RegressionTest0.test57");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23346);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23347);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23348);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23349);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23350);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23351);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23352);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23353);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23354);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23355);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23356);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23357);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23358);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23359);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23360);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23361);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23362);java.lang.Class<?> wildcardClass16 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23363);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23364);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23365);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23366);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23367);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23368);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23369);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23370);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23371);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23372);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23373);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23374);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23375);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23376);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23377);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Clear Plastic" + "'", str14, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23378);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Clear Plastic" + "'", str15, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23379);org.junit.Assert.assertNotNull(wildcardClass16);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test58() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8v9eki1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test58",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8v9eki1g() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23380);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23381);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23382)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23383)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23384);System.out.format("%n%s%n", "RegressionTest0.test58");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23385);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23386);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23387);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23388);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23389);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23390);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23391);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23392);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23393);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23394);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23395);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23396);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23397);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23398);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23399);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23400);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23401);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23402);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23403);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23404);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23405);java.lang.String str20 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23406);java.lang.String str21 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23407);java.lang.String str22 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23408);java.lang.String str23 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23409);java.lang.Class<?> wildcardClass24 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23410);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23411);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23412);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23413);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23414);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23415);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23416);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23417);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23418);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23419);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23420);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23421);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23422);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23423);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23424);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23425);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23426);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23427);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23428);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23429);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23430);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23431);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23432);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23433);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Black Plastic" + "'", str23, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23434);org.junit.Assert.assertNotNull(wildcardClass24);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test59() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yj8ts3i2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test59",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yj8ts3i2z() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23435);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23436);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23437)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23438)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23439);System.out.format("%n%s%n", "RegressionTest0.test59");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23440);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23441);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23442);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23443);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23444);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23445);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23446);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23447);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23448);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23449);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23450);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23451);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23452);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23453);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23454);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23455);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23456);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23457);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23458);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23459);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23460);java.lang.String str20 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23461);java.lang.String str21 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23462);java.lang.String str22 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23463);java.lang.Class<?> wildcardClass23 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23464);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23465);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23466);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23467);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23468);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23469);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23470);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23471);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23472);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23473);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23474);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23475);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23476);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23477);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23478);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23479);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23480);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23481);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23482);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23483);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23484);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23485);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23486);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23487);org.junit.Assert.assertNotNull(wildcardClass23);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test60() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2dmcti4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test60",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2dmcti4g() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23488);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23489);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23490)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23491)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23492);System.out.format("%n%s%n", "RegressionTest0.test60");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23493);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23494);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23495);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23496);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23497);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23498);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23499);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23500);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23501);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23502);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23503);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23504);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23505);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23506);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23507);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23508);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23509);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23510);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23511);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23512);java.lang.Class<?> wildcardClass19 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23513);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23514);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23515);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23516);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23517);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23518);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23519);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23520);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23521);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23522);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23523);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23524);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23525);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23526);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23527);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23528);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23529);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23530);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "White Paper" + "'", str17, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23531);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "White Paper" + "'", str18, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23532);org.junit.Assert.assertNotNull(wildcardClass19);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test61() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utdnkci5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test61",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utdnkci5p() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23533);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23534);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23535)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23536)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23537);System.out.format("%n%s%n", "RegressionTest0.test61");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23538);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23539);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23540);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23541);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23542);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23543);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23544);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23545);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23546);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23547);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23548);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23549);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23550);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23551);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23552);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23553);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23554);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23555);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23556);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23557);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23558);java.lang.String str20 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23559);java.lang.String str21 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23560);java.lang.Class<?> wildcardClass22 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23561);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23562);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23563);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23564);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23565);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23566);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23567);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23568);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23569);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23570);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23571);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23572);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23573);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23574);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23575);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23576);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23577);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23578);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23579);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23580);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23581);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23582);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23583);org.junit.Assert.assertNotNull(wildcardClass22);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test62() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkdorvi74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test62",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkdorvi74() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23584);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23585);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23586)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23587)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23588);System.out.format("%n%s%n", "RegressionTest0.test62");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23589);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23590);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23591);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23592);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23593);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23594);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23595);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23596);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23597);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23598);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23599);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23600);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23601);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23602);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23603);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23604);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23605);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23606);java.lang.Class<?> wildcardClass17 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23607);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23608);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23609);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23610);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23611);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23612);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23613);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23614);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23615);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23616);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23617);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23618);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23619);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23620);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23621);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23622);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23623);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23624);org.junit.Assert.assertNotNull(wildcardClass17);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test63() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obdpzei89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test63",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obdpzei89() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23625);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23626);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23627)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23628)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23629);System.out.format("%n%s%n", "RegressionTest0.test63");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23630);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23631);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23632);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23633);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23634);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23635);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23636);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23637);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23638);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23639);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23640);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23641);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23642);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23643);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23644);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23645);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23646);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23647);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23648);java.lang.Class<?> wildcardClass18 = tapeType0.getClass();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23649);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23650);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23651);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23652);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23653);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23654);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23655);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23656);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23657);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23658);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23659);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23660);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23661);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23662);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23663);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23664);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23665);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23666);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "White Paper" + "'", str17, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23667);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test64() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2dr6xi9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test64",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2dr6xi9g() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23668);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23669);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23670)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23671)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23672);System.out.format("%n%s%n", "RegressionTest0.test64");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23673);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23674);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23675);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23676);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23677);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23678);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23679);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23680);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23681);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23682);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23683);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23684);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23685);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23686);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23687);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23688);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23689);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23690);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23691);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23692);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23693);java.lang.String str20 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23694);java.lang.String str21 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23695);java.lang.String str22 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23696);java.lang.String str23 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23697);java.lang.String str24 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23698);java.lang.String str25 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23699);java.lang.String str26 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23700);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.BlackPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23701);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Black Plastic" + "'", str1, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23702);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Black Plastic" + "'", str2, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23703);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Black Plastic" + "'", str3, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23704);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Black Plastic" + "'", str4, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23705);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Black Plastic" + "'", str5, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23706);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Black Plastic" + "'", str6, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23707);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Black Plastic" + "'", str7, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23708);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Black Plastic" + "'", str8, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23709);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Black Plastic" + "'", str9, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23710);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Black Plastic" + "'", str10, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23711);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Black Plastic" + "'", str11, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23712);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Black Plastic" + "'", str12, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23713);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Black Plastic" + "'", str13, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23714);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Black Plastic" + "'", str14, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23715);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Black Plastic" + "'", str15, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23716);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Black Plastic" + "'", str16, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23717);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Black Plastic" + "'", str17, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23718);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Black Plastic" + "'", str18, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23719);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Black Plastic" + "'", str19, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23720);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Black Plastic" + "'", str20, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23721);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Black Plastic" + "'", str21, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23722);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Black Plastic" + "'", str22, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23723);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Black Plastic" + "'", str23, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23724);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Black Plastic" + "'", str24, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23725);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Black Plastic" + "'", str25, "Black Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23726);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Black Plastic" + "'", str26, "Black Plastic");
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test65() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htdsegib3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test65",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htdsegib3() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23727);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23728);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23729)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23730)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23731);System.out.format("%n%s%n", "RegressionTest0.test65");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23732);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23733);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23734);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23735);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23736);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23737);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23738);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23739);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23740);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23741);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23742);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23743);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23744);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23745);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23746);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23747);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23748);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23749);java.lang.String str17 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23750);java.lang.String str18 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23751);java.lang.String str19 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23752);java.lang.String str20 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23753);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.WhitePaper));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23754);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "White Paper" + "'", str1, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23755);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "White Paper" + "'", str2, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23756);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "White Paper" + "'", str3, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23757);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "White Paper" + "'", str4, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23758);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Paper" + "'", str5, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23759);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "White Paper" + "'", str6, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23760);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "White Paper" + "'", str7, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23761);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "White Paper" + "'", str8, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23762);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "White Paper" + "'", str9, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23763);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "White Paper" + "'", str10, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23764);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "White Paper" + "'", str11, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23765);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "White Paper" + "'", str12, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23766);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "White Paper" + "'", str13, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23767);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "White Paper" + "'", str14, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23768);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "White Paper" + "'", str15, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23769);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "White Paper" + "'", str16, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23770);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "White Paper" + "'", str17, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23771);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "White Paper" + "'", str18, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23772);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "White Paper" + "'", str19, "White Paper");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23773);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "White Paper" + "'", str20, "White Paper");
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}

    @Test
    public void test66() throws Throwable {__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceStart(getClass().getName(),23774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekdtlzice();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gy6gy6lx1h8qw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gy6gy6lx1h8qw4.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test66",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23774,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekdtlzice() throws Throwable{try{__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23774);
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23775);if ((((debug)&&(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23776)!=0|true))||(__CLR4_5_2gy6gy6lx1h8qw4.R.iget(23777)==0&false)))
            {__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23778);System.out.format("%n%s%n", "RegressionTest0.test66");
        }__CLR4_5_2gy6gy6lx1h8qw4.R.inc(23779);org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType tapeType0 = org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic;
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23780);java.lang.String str1 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23781);java.lang.String str2 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23782);java.lang.String str3 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23783);java.lang.String str4 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23784);java.lang.String str5 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23785);java.lang.String str6 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23786);java.lang.String str7 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23787);java.lang.String str8 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23788);java.lang.String str9 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23789);java.lang.String str10 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23790);java.lang.String str11 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23791);java.lang.String str12 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23792);java.lang.String str13 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23793);java.lang.String str14 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23794);java.lang.String str15 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23795);java.lang.String str16 = tapeType0.toString();
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23796);org.junit.Assert.assertTrue("'" + tapeType0 + "' != '" + org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic + "'", tapeType0.equals(org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType.ClearPlastic));
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23797);org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Clear Plastic" + "'", str1, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23798);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Clear Plastic" + "'", str2, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23799);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Clear Plastic" + "'", str3, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23800);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Clear Plastic" + "'", str4, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23801);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clear Plastic" + "'", str5, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23802);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Clear Plastic" + "'", str6, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23803);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Clear Plastic" + "'", str7, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23804);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Clear Plastic" + "'", str8, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23805);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Clear Plastic" + "'", str9, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23806);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clear Plastic" + "'", str10, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23807);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Clear Plastic" + "'", str11, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23808);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Clear Plastic" + "'", str12, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23809);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Clear Plastic" + "'", str13, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23810);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Clear Plastic" + "'", str14, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23811);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Clear Plastic" + "'", str15, "Clear Plastic");
        __CLR4_5_2gy6gy6lx1h8qw4.R.inc(23812);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Clear Plastic" + "'", str16, "Clear Plastic");
    }finally{__CLR4_5_2gy6gy6lx1h8qw4.R.flushNeeded();}}
}

