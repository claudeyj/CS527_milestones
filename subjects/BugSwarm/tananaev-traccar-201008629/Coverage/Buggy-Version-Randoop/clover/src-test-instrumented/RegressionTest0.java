/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_2gg9gg9lx1dwme8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,23078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_299l2d6gg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_299l2d6gg9() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21321);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21322);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21323)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21324)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21325);System.out.format("%n%s%n", "RegressionTest0.test001");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21326);int int0 = org.traccar.protocol.TeltonikaProtocolDecoder.CODEC_GH3000;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21327);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test002() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_260l3kpggg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_260l3kpggg() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21328);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21329);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21330)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21331)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21332);System.out.format("%n%s%n", "RegressionTest0.test002");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21333);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21334);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21335);org.traccar.model.Position position2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21336);java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21337);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21338);teltonikaProtocolDecoder1.getLastLocation(position2, date3);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21339);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test003() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22rl4s8ggs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22rl4s8ggs() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21340);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21341);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21342)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21343)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21344);System.out.format("%n%s%n", "RegressionTest0.test003");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21345);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21346);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21347);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21348);long long3 = teltonikaProtocolDecoder1.addUnknownDevice("");
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21349);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test004() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2heu09gh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2heu09gh2() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21350);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21351);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21352)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21353)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21354);System.out.format("%n%s%n", "RegressionTest0.test004");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21355);int int0 = org.traccar.protocol.TeltonikaProtocolDecoder.CODEC_12;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21356);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test005() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qessqgh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qessqgh9() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21357);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21358);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21359)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21360)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21361);System.out.format("%n%s%n", "RegressionTest0.test005");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21362);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21363);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21364);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21365);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21366);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21367);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21368);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21369);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21370);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test006() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zerl7ghn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zerl7ghn() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21371);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21372);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21373)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21374)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21375);System.out.format("%n%s%n", "RegressionTest0.test006");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21376);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21377);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21378);java.lang.Class<?> wildcardClass2 = teltonikaProtocolDecoder1.getClass();
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21379);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test007() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a8eqdoghw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test007",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a8eqdoghw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21380);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21381);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21382)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21383)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21384);System.out.format("%n%s%n", "RegressionTest0.test007");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21385);int int0 = org.traccar.protocol.TeltonikaProtocolDecoder.CODEC_FM4X00;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21386);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test008() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dhep65gi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test008",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dhep65gi3() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21387);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21388);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21389)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21390)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21391);System.out.format("%n%s%n", "RegressionTest0.test008");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21392);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21393);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21394);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21395);java.lang.String str2 = teltonikaProtocolDecoder1.getProtocolName();
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21396);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test009() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gqenymgid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test009",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gqenymgid() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21397);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21398);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21399)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21400)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21401);System.out.format("%n%s%n", "RegressionTest0.test009");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21402);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21403);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21404);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21405);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21406);java.lang.String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21407);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21408);org.traccar.DeviceSession deviceSession5 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21409);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test010() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h79vdwgiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test010",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h79vdwgiq() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21410);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21411);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21412)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21413)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21414);System.out.format("%n%s%n", "RegressionTest0.test010");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21415);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21416);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21417);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21418);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21419);java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21420);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21421);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21422);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21423);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test011() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kg9u6dgj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test011",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kg9u6dgj4() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21424);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21425);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21426)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21427)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21428);System.out.format("%n%s%n", "RegressionTest0.test011");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21429);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21430);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21431);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21432);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21433);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21434);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21435);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21436);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21437);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test012() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2np9syugji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test012",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2np9syugji() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21438);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21439);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21440)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21441)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21442);System.out.format("%n%s%n", "RegressionTest0.test012");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21443);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21444);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21445);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21446);org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21447);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21448);teltonikaProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21449);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test013() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qy9rrbgju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test013",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qy9rrbgju() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21450);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21451);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21452)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21453)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21454);System.out.format("%n%s%n", "RegressionTest0.test013");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21455);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21456);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21457);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test014() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u79qjsgk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test014",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u79qjsgk2() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21458);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21459);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21460)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21461)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21462);System.out.format("%n%s%n", "RegressionTest0.test014");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21463);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21464);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21465);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21466);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21467);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21468);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21469);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21470);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21471);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test015() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xg9pc9gkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test015",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xg9pc9gkg() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21472);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21473);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21474)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21475)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21476);System.out.format("%n%s%n", "RegressionTest0.test015");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21477);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21478);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21479);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21480);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21481);java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21482);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21483);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21484);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21485);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test016() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ybuduegku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test016",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ybuduegku() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21486);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21487);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21488)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21489)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21490);System.out.format("%n%s%n", "RegressionTest0.test016");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21491);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21492);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21493);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21494);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21495);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21496);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21497);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21498);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21499);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test017() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v2uf1xgl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test017",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v2uf1xgl8() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21500);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21501);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21502)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21503)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21504);System.out.format("%n%s%n", "RegressionTest0.test017");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21505);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21506);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21507);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21508);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21509);java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21510);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21511);org.traccar.DeviceSession deviceSession5 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21512);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21513);org.junit.Assert.assertNotNull(strArray4);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test018() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtug9gglm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test018",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtug9gglm() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21514);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21515);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21516)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21517)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21518);System.out.format("%n%s%n", "RegressionTest0.test018");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21519);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21520);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21521);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21522);long long3 = teltonikaProtocolDecoder1.addUnknownDevice("hi!");
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21523);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test019() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2okuhgzglw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test019",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2okuhgzglw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21524);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21525);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21526)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21527)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21528);System.out.format("%n%s%n", "RegressionTest0.test019");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21529);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21530);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21531);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21532);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21533);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21534);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21535);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21536);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21537);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test020() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o3za1pgma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test020",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o3za1pgma() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21538);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21539);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21540)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21541)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21542);System.out.format("%n%s%n", "RegressionTest0.test020");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21543);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21544);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21545);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21546);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21547);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21548);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21549);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21550);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21551);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test021() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuzb98gmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test021",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuzb98gmo() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21552);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21553);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21554)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21555)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21556);System.out.format("%n%s%n", "RegressionTest0.test021");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21557);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21558);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21559);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21560);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21561);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21562);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21563);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21564);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21565);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test022() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hlzcgrgn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test022",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hlzcgrgn2() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21566);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21567);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21568)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21569)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21570);System.out.format("%n%s%n", "RegressionTest0.test022");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21571);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21572);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21573);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21574);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21575);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21576);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21577);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21578);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21579);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test023() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eczdoagng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test023",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eczdoagng() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21580);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21581);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21582)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21583)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21584);System.out.format("%n%s%n", "RegressionTest0.test023");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21585);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21586);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21587);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21588);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21589);java.lang.String[] strArray5 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21590);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21591);org.traccar.DeviceSession deviceSession6 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21592);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21593);org.junit.Assert.assertNotNull(strArray5);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test024() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b3zevtgnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test024",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b3zevtgnu() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21594);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21595);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21596)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21597)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21598);System.out.format("%n%s%n", "RegressionTest0.test024");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21599);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21600);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21601);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21602);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21603);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21604);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21605);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21606);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21607);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test025() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uzg3cgo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test025",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uzg3cgo8() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21608);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21609);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21610)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21611)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21612);System.out.format("%n%s%n", "RegressionTest0.test025");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21613);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21614);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21615);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21616);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21617);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21618);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21619);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21620);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21621);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test026() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lzhavgom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test026",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lzhavgom() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21622);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21623);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21624)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21625)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21626);System.out.format("%n%s%n", "RegressionTest0.test026");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21627);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21628);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21629);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21630);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21631);java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21632);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21633);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21634);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21635);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test027() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21cziiegp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test027",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21cziiegp0() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21636);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21637);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21638)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21639)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21640);System.out.format("%n%s%n", "RegressionTest0.test027");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21641);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21642);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21643);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21644);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21645);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21646);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21647);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21648);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21649);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test028() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21w0ga3gpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test028",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21w0ga3gpe() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21650);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21651);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21652)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21653)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21654);System.out.format("%n%s%n", "RegressionTest0.test028");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21655);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21656);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21657);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21658);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21659);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21660);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21661);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21662);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21663);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test029() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2550f2kgps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test029",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2550f2kgps() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21664);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21665);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21666)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21667)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21668);System.out.format("%n%s%n", "RegressionTest0.test029");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21669);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21670);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21671);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21672);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21673);java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21674);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21675);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21676);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21677);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test030() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lvmhugq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test030",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lvmhugq6() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21678);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21679);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21680)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21681)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21682);System.out.format("%n%s%n", "RegressionTest0.test030");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21683);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21684);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21685);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21686);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21687);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21688);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21689);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21690);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21691);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test031() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uvlabgqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test031",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21692,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uvlabgqk() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21692);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21693);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21694)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21695)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21696);System.out.format("%n%s%n", "RegressionTest0.test031");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21697);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21698);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21699);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21700);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21701);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21702);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21703);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21704);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21705);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test032() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3vk2sgqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test032",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3vk2sgqy() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21706);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21707);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21708)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21709)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21710);System.out.format("%n%s%n", "RegressionTest0.test032");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21711);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21712);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21713);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21714);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21715);java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21716);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21717);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21718);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21719);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test033() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fcviv9grc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test033",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fcviv9grc() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21720);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21721);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21722)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21723)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21724);System.out.format("%n%s%n", "RegressionTest0.test033");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21725);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21726);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21727);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21728);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21729);java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21730);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21731);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21732);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21733);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test034() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ilvhnqgrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test034",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ilvhnqgrq() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21734);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21735);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21736)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21737)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21738);System.out.format("%n%s%n", "RegressionTest0.test034");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21739);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21740);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21741);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21742);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21743);java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21744);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21745);org.traccar.DeviceSession deviceSession6 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21746);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21747);org.junit.Assert.assertNotNull(strArray5);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test035() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2luvgg7gs4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test035",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2luvgg7gs4() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21748);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21749);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21750)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21751)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21752);System.out.format("%n%s%n", "RegressionTest0.test035");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21753);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21754);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21755);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21756);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21757);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21758);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21759);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21760);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21761);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test036() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3vf8ogsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test036",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3vf8ogsi() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21762);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21763);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21764)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21765)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21766);System.out.format("%n%s%n", "RegressionTest0.test036");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21767);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21768);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21769);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21770);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21771);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21772);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21773);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21774);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21775);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test037() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2scve15gsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test037",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2scve15gsw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21776);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21777);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21778)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21779)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21780);System.out.format("%n%s%n", "RegressionTest0.test037");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21781);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21782);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21783);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21784);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21785);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21786);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21787);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21788);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21789);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test038() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vlvctmgta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test038",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vlvctmgta() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21790);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21791);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21792)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21793)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21794);System.out.format("%n%s%n", "RegressionTest0.test038");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21795);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21796);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21797);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21798);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21799);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21800);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21801);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21802);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21803);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test039() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yuvbm3gto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test039",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21804,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yuvbm3gto() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21804);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21805);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21806)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21807)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21808);System.out.format("%n%s%n", "RegressionTest0.test039");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21809);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21810);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21811);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21812);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21813);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21814);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21815);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21816);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21817);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test040() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zbqj1dgu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test040",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zbqj1dgu2() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21818);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21819);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21820)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21821)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21822);System.out.format("%n%s%n", "RegressionTest0.test040");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21823);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21824);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21825);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21826);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21827);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21828);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21829);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21830);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21831);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test041() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wgdk5agug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test041",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wgdk5agug() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21832);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21833);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21834)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21835)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21836);System.out.format("%n%s%n", "RegressionTest0.test041");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21837);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21838);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21839);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21840);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21841);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21842);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21843);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21844);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21845);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test042() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t7dlctguu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test042",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t7dlctguu() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21846);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21847);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21848)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21849)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21850);System.out.format("%n%s%n", "RegressionTest0.test042");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21851);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21852);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21853);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21854);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21855);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21856);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21857);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21858);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21859);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test043() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pydmkcgv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test043",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pydmkcgv8() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21860);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21861);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21862)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21863)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21864);System.out.format("%n%s%n", "RegressionTest0.test043");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21865);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21866);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21867);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21868);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21869);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21870);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21871);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21872);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21873);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test044() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mpdnrvgvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test044",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mpdnrvgvm() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21874);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21875);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21876)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21877)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21878);System.out.format("%n%s%n", "RegressionTest0.test044");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21879);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21880);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21881);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21882);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21883);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21884);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21885);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21886);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21887);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test045() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgdozegw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test045",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgdozegw0() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21888);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21889);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21890)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21891)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21892);System.out.format("%n%s%n", "RegressionTest0.test045");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21893);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21894);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21895);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21896);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21897);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21898);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21899);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21900);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21901);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test046() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g7dq6xgwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test046",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g7dq6xgwe() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21902);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21903);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21904)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21905)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21906);System.out.format("%n%s%n", "RegressionTest0.test046");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21907);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21908);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21909);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21910);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21911);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21912);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21913);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21914);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21915);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test047() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cydreggws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test047",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cydreggws() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21916);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21917);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21918)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21919)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21920);System.out.format("%n%s%n", "RegressionTest0.test047");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21921);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21922);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21923);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21924);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21925);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21926);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21927);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21928);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21929);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test048() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29pdslzgx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test048",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29pdslzgx6() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21930);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21931);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21932)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21933)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21934);System.out.format("%n%s%n", "RegressionTest0.test048");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21935);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21936);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21937);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21938);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21939);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21940);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21941);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21942);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21943);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test049() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26gdttigxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test049",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26gdttigxk() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21944);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21945);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21946)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21947)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21948);System.out.format("%n%s%n", "RegressionTest0.test049");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21949);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21950);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21951);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21952);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21953);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21954);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21955);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21956);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21957);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test050() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25zime8gxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test050",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25zime8gxy() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21958);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21959);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21960)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21961)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21962);System.out.format("%n%s%n", "RegressionTest0.test050");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21963);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21964);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21965);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21966);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21967);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21968);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21969);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21970);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21971);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test051() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qinlrgyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test051",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qinlrgyc() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21972);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21973);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21974)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21975)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21976);System.out.format("%n%s%n", "RegressionTest0.test051");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21977);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21978);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21979);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21980);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21981);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21982);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21983);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21984);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21985);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test052() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),21986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ihb6qgyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test052",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ihb6qgyq() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(21986);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21987);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21988)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(21989)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(21990);System.out.format("%n%s%n", "RegressionTest0.test052");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(21991);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21992);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21993);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21994);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21995);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21996);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21997);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(21998);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(21999);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test053() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23rh9z7gz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test053",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23rh9z7gz4() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22000);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22001);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22002)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22003)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22004);System.out.format("%n%s%n", "RegressionTest0.test053");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22005);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22006);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22007);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22008);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22009);java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22010);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22011);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22012);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22013);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test054() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270h8rogzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test054",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270h8rogzi() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22014);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22015);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22016)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22017)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22018);System.out.format("%n%s%n", "RegressionTest0.test054");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22019);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22020);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22021);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22022);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22023);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22024);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22025);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22026);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22027);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test055() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9h7k5gzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test055",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9h7k5gzw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22028);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22029);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22030)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22031)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22032);System.out.format("%n%s%n", "RegressionTest0.test055");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22033);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22034);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22035);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22036);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22037);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22038);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22039);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22040);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22041);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test056() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dih6cmh0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test056",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dih6cmh0a() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22042);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22043);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22044)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22045)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22046);System.out.format("%n%s%n", "RegressionTest0.test056");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22047);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22048);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22049);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22050);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22051);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22052);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22053);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22054);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22055);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test057() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grh553h0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test057",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grh553h0o() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22056);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22057);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22058)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22059)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22060);System.out.format("%n%s%n", "RegressionTest0.test057");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22061);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22062);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22063);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22064);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22065);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22066);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22067);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22068);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22069);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test058() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k0h3xkh12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test058",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k0h3xkh12() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22070);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22071);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22072)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22073)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22074);System.out.format("%n%s%n", "RegressionTest0.test058");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22075);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22076);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22077);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22078);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22079);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22080);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22081);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22082);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22083);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test059() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n9h2q1h1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test059",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n9h2q1h1g() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22084);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22085);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22086)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22087)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22088);System.out.format("%n%s%n", "RegressionTest0.test059");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22089);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22090);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22091);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22092);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22093);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22094);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22095);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22096);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22097);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test060() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqca5bh1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test060",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22098,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqca5bh1u() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22098);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22099);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22100)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22101)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22102);System.out.format("%n%s%n", "RegressionTest0.test060");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22103);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22104);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22105);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22106);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22107);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22108);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22109);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22110);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22111);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test061() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qzc8xsh28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test061",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qzc8xsh28() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22112);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22113);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22114)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22115)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22116);System.out.format("%n%s%n", "RegressionTest0.test061");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22117);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22118);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22119);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22120);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22121);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22122);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22123);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22124);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22125);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test062() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8c7q9h2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test062",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8c7q9h2m() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22126);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22127);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22128)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22129)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22130);System.out.format("%n%s%n", "RegressionTest0.test062");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22131);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22132);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22133);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22134);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22135);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22136);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22137);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22138);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22139);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test063() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xhc6iqh30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test063",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xhc6iqh30() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22140);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22141);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22142)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22143)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22144);System.out.format("%n%s%n", "RegressionTest0.test063");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22145);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22146);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22147);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22148);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22149);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22150);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22151);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22152);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22153);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test064() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yarwnxh3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test064",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yarwnxh3e() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22154);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22155);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22156)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22157)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22158);System.out.format("%n%s%n", "RegressionTest0.test064");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22159);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22160);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22161);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22162);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22163);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22164);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22165);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22166);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22167);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test065() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v1rxvgh3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test065",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v1rxvgh3s() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22168);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22169);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22170)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22171)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22172);System.out.format("%n%s%n", "RegressionTest0.test065");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22173);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22174);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22175);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22176);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22177);java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22178);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22179);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22180);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22181);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test066() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rsrz2zh46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test066",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rsrz2zh46() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22182);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22183);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22184)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22185)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22186);System.out.format("%n%s%n", "RegressionTest0.test066");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22187);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22188);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22189);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22190);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22191);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22192);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22193);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22194);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22195);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test067() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojs0aih4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test067",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojs0aih4k() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22196);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22197);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22198)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22199)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22200);System.out.format("%n%s%n", "RegressionTest0.test067");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22201);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22202);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22203);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22204);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22205);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22206);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22207);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22208);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22209);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test068() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2las1i1h4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test068",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2las1i1h4y() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22210);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22211);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22212)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22213)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22214);System.out.format("%n%s%n", "RegressionTest0.test068");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22215);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22216);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22217);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22218);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22219);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22220);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22221);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22222);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22223);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test069() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1s2pkh5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test069",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22224,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1s2pkh5c() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22224);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22225);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22226)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22227)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22228);System.out.format("%n%s%n", "RegressionTest0.test069");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22229);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22230);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22231);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22232);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22233);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22234);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22235);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22236);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22237);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test070() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hkwvaah5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test070",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hkwvaah5q() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22238);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22239);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22240)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22241)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22242);System.out.format("%n%s%n", "RegressionTest0.test070");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22243);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22244);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22245);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22246);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22247);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22248);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22249);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22250);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22251);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test071() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ebwwhth64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test071",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ebwwhth64() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22252);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22253);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22254)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22255)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22256);System.out.format("%n%s%n", "RegressionTest0.test071");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22257);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22258);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22259);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22260);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22261);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22262);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22263);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22264);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22265);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test072() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b2wxpch6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test072",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22266,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b2wxpch6i() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22266);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22267);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22268)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22269)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22270);System.out.format("%n%s%n", "RegressionTest0.test072");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22271);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22272);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22273);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22274);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22275);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22276);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22277);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22278);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22279);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test073() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27twywvh6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test073",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27twywvh6w() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22280);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22281);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22282)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22283)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22284);System.out.format("%n%s%n", "RegressionTest0.test073");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22285);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22286);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22287);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22288);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22289);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22290);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22291);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22292);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22293);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test074() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24kx04eh7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test074",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24kx04eh7a() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22294);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22295);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22296)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22297)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22298);System.out.format("%n%s%n", "RegressionTest0.test074");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22299);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22300);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22301);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22302);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22303);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22304);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22305);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22306);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22307);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test075() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21bx1bxh7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test075",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21bx1bxh7o() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22308);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22309);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22310)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22311)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22312);System.out.format("%n%s%n", "RegressionTest0.test075");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22313);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22314);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22315);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22316);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22317);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22318);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22319);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22320);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22321);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test076() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x2xgkh82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test076",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x2xgkh82() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22322);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22323);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22324)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22325)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22326);System.out.format("%n%s%n", "RegressionTest0.test076");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22327);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22328);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22329);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22330);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22331);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22332);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22333);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22334);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22335);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test077() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2562w91h8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test077",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2562w91h8g() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22336);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22337);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22338)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22339)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22340);System.out.format("%n%s%n", "RegressionTest0.test077");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22341);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22342);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22343);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22344);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22345);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22346);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22347);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22348);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22349);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test078() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f2v1ih8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test078",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f2v1ih8u() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22350);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22351);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22352)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22353)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22354);System.out.format("%n%s%n", "RegressionTest0.test078");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22355);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22356);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22357);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22358);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22359);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22360);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22361);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22362);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22363);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test079() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bo2ttzh98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test079",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22364,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bo2ttzh98() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22364);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22365);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22366)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22367)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22368);System.out.format("%n%s%n", "RegressionTest0.test079");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22369);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22370);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22371);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22372);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22373);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22374);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22375);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22376);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22377);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test080() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c4y199h9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test080",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c4y199h9m() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22378);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22379);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22380)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22381)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22382);System.out.format("%n%s%n", "RegressionTest0.test080");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22383);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22384);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22385);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22386);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22387);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22388);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22389);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22390);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22391);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test081() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fdy01qha0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test081",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fdy01qha0() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22392);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22393);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22394)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22395)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22396);System.out.format("%n%s%n", "RegressionTest0.test081");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22397);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22398);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22399);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22400);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22401);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22402);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22403);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22404);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22405);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test082() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2imxyu7hae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test082",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2imxyu7hae() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22406);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22407);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22408)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22409)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22410);System.out.format("%n%s%n", "RegressionTest0.test082");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22411);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22412);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22413);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22414);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22415);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22416);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22417);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22418);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22419);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test083() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lvxxmohas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test083",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lvxxmohas() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22420);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22421);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22422)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22423)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22424);System.out.format("%n%s%n", "RegressionTest0.test083");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22425);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22426);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22427);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22428);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22429);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22430);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22431);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22432);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22433);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test084() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p4xwf5hb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test084",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p4xwf5hb6() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22434);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22435);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22436)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22437)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22438);System.out.format("%n%s%n", "RegressionTest0.test084");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22439);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22440);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22441);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22442);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22443);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22444);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22445);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22446);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22447);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test085() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sdxv7mhbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test085",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sdxv7mhbk() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22448);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22449);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22450)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22451)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22452);System.out.format("%n%s%n", "RegressionTest0.test085");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22453);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22454);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22455);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22456);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22457);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22458);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22459);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22460);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22461);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test086() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmxu03hby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test086",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmxu03hby() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22462);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22463);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22464)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22465)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22466);System.out.format("%n%s%n", "RegressionTest0.test086");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22467);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22468);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22469);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22470);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22471);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22472);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22473);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22474);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22475);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test087() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvxsskhcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test087",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvxsskhcc() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22476);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22477);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22478)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22479)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22480);System.out.format("%n%s%n", "RegressionTest0.test087");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22481);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22482);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22483);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22484);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22485);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22486);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22487);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22488);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22489);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test088() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww6ae3hcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test088",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww6ae3hcq() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22490);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22491);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22492)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22493)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22494);System.out.format("%n%s%n", "RegressionTest0.test088");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22495);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22496);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22497);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22498);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22499);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22500);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22501);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22502);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22503);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test089() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tn6blmhd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test089",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tn6blmhd4() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22504);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22505);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22506)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22507)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22508);System.out.format("%n%s%n", "RegressionTest0.test089");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22509);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22510);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22511);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22512);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22513);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22514);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22515);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22516);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22517);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test090() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t6b46chdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test090",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t6b46chdi() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22518);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22519);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22520)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22521)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22522);System.out.format("%n%s%n", "RegressionTest0.test090");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22523);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22524);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22525);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22526);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22527);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22528);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22529);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22530);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22531);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test091() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxb5dvhdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test091",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxb5dvhdw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22532);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22533);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22534)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22535)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22536);System.out.format("%n%s%n", "RegressionTest0.test091");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22537);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22538);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22539);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22540);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22541);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22542);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22543);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22544);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22545);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test092() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mob6lehea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test092",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mob6lehea() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22546);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22547);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22548)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22549)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22550);System.out.format("%n%s%n", "RegressionTest0.test092");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22551);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22552);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22553);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22554);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22555);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22556);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22557);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22558);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22559);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test093() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfb7sxheo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test093",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfb7sxheo() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22560);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22561);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22562)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22563)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22564);System.out.format("%n%s%n", "RegressionTest0.test093");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22565);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22566);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22567);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22568);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22569);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22570);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22571);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22572);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22573);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test094() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6b90ghf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test094",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6b90ghf2() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22574);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22575);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22576)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22577)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22578);System.out.format("%n%s%n", "RegressionTest0.test094");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22579);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22580);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22581);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22582);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22583);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22584);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22585);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22586);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22587);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test095() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cxba7zhfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test095",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cxba7zhfg() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22588);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22589);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22590)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22591)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22592);System.out.format("%n%s%n", "RegressionTest0.test095");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22593);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22594);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22595);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22596);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22597);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22598);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22599);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22600);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22601);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test096() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29obbfihfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test096",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29obbfihfu() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22602);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22603);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22604)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22605)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22606);System.out.format("%n%s%n", "RegressionTest0.test096");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22607);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22608);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22609);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22610);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22611);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22612);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22613);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22614);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22615);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test097() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fbcn1hg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test097",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22616,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fbcn1hg8() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22616);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22617);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22618)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22619)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22620);System.out.format("%n%s%n", "RegressionTest0.test097");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22621);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22622);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22623);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22624);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22625);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22626);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22627);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22628);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22629);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test098() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_236bdukhgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test098",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_236bdukhgm() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22630);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22631);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22632)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22633)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22634);System.out.format("%n%s%n", "RegressionTest0.test098");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22635);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22636);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22637);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22638);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22639);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22640);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22641);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22642);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22643);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test099() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22okxxhh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test099",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22okxxhh0() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22644);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22645);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22646)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22647)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22648);System.out.format("%n%s%n", "RegressionTest0.test099");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22649);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22650);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22651);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22652);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22653);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22654);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22655);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22656);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22657);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test100() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2enfq0qhhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test100",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2enfq0qhhe() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22658);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22659);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22660)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22661)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22662);System.out.format("%n%s%n", "RegressionTest0.test100");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22663);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22664);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22665);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22666);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22667);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22668);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22669);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22670);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22671);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test101() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2befr89hhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test101",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2befr89hhs() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22672);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22673);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22674)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22675)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22676);System.out.format("%n%s%n", "RegressionTest0.test101");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22677);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22678);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22679);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22680);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22681);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22682);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22683);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22684);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22685);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test102() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285fsfshi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test102",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285fsfshi6() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22686);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22687);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22688)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22689)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22690);System.out.format("%n%s%n", "RegressionTest0.test102");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22691);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22692);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22693);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22694);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22695);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22696);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22697);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22698);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22699);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test103() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wftnbhik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test103",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wftnbhik() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22700);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22701);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22702)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22703)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22704);System.out.format("%n%s%n", "RegressionTest0.test103");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22705);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22706);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22707);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22708);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22709);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22710);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22711);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22712);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22713);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test104() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21nfuuuhiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test104",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21nfuuuhiy() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22714);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22715);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22716)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22717)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22718);System.out.format("%n%s%n", "RegressionTest0.test104");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22719);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22720);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22721);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22722);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22723);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22724);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22725);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22726);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22727);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test105() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21lk3xnhjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test105",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21lk3xnhjc() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22728);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22729);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22730)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22731)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22732);System.out.format("%n%s%n", "RegressionTest0.test105");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22733);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22734);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22735);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22736);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22737);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22738);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22739);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22740);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22741);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test106() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24uk2q4hjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test106",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24uk2q4hjq() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22742);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22743);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22744)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22745)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22746);System.out.format("%n%s%n", "RegressionTest0.test106");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22747);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22748);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22749);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22750);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22751);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22752);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22753);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22754);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22755);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test107() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283k1ilhk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test107",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283k1ilhk4() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22756);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22757);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22758)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22759)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22760);System.out.format("%n%s%n", "RegressionTest0.test107");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22761);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22762);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22763);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22764);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22765);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22766);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22767);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22768);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22769);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test108() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bck0b2hki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test108",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bck0b2hki() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22770);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22771);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22772)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22773)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22774);System.out.format("%n%s%n", "RegressionTest0.test108");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22775);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22776);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22777);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22778);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22779);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22780);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22781);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22782);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22783);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test109() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eljz3jhkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test109",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eljz3jhkw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22784);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22785);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22786)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22787)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22788);System.out.format("%n%s%n", "RegressionTest0.test109");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22789);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22790);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22791);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22792);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22793);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22794);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22795);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22796);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22797);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test110() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f2f6ithla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test110",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f2f6ithla() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22798);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22799);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22800)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22801)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22802);System.out.format("%n%s%n", "RegressionTest0.test110");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22803);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22804);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22805);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22806);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22807);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22808);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22809);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22810);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22811);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test111() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibf5bahlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test111",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibf5bahlo() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22812);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22813);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22814)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22815)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22816);System.out.format("%n%s%n", "RegressionTest0.test111");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22817);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22818);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22819);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22820);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22821);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22822);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22823);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22824);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22825);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test112() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lkf43rhm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test112",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lkf43rhm2() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22826);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22827);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22828)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22829)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22830);System.out.format("%n%s%n", "RegressionTest0.test112");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22831);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22832);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22833);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22834);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22835);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22836);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22837);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22838);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22839);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test113() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2otf2w8hmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test113",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2otf2w8hmg() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22840);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22841);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22842)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22843)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22844);System.out.format("%n%s%n", "RegressionTest0.test113");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22845);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22846);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22847);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22848);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22849);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22850);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22851);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22852);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22853);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test114() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s2f1ophmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test114",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s2f1ophmu() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22854);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22855);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22856)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22857)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22858);System.out.format("%n%s%n", "RegressionTest0.test114");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22859);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22860);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22861);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22862);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22863);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22864);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22865);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22866);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22867);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test115() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbf0h6hn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test115",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbf0h6hn8() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22868);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22869);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22870)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22871)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22872);System.out.format("%n%s%n", "RegressionTest0.test115");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22873);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22874);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22875);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22876);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22877);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22878);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22879);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22880);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22881);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test116() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykez9nhnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test116",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykez9nhnm() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22882);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22883);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22884)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22885)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22886);System.out.format("%n%s%n", "RegressionTest0.test116");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22887);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22888);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22889);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22890);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22891);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22892);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22893);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22894);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22895);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test117() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7p3x0ho0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test117",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7p3x0ho0() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22896);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22897);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22898)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22899)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22900);System.out.format("%n%s%n", "RegressionTest0.test117");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22901);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22902);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22903);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22904);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22905);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22906);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22907);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22908);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22909);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test118() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2typ54jhoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test118",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2typ54jhoe() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22910);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22911);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22912)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22913)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22914);System.out.format("%n%s%n", "RegressionTest0.test118");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22915);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22916);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22917);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22918);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22919);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22920);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22921);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22922);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22923);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test119() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpp6c2hos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test119",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22924,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpp6c2hos() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22924);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22925);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22926)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22927)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22928);System.out.format("%n%s%n", "RegressionTest0.test119");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22929);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22930);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22931);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22932);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22933);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22934);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22935);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22936);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22937);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test120() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q8tywshp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test120",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q8tywshp6() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22938);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22939);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22940)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22941)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22942);System.out.format("%n%s%n", "RegressionTest0.test120");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22943);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22944);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22945);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22946);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22947);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22948);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22949);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22950);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22951);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test121() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mzu04bhpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test121",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mzu04bhpk() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22952);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22953);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22954)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22955)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22956);System.out.format("%n%s%n", "RegressionTest0.test121");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22957);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22958);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22959);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22960);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22961);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22962);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22963);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22964);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22965);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test122() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jqu1buhpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test122",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jqu1buhpy() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22966);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22967);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22968)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22969)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22970);System.out.format("%n%s%n", "RegressionTest0.test122");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22971);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22972);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22973);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22974);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22975);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22976);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22977);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22978);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22979);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test123() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ghu2jdhqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test123",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ghu2jdhqc() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22980);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22981);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22982)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22983)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22984);System.out.format("%n%s%n", "RegressionTest0.test123");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22985);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22986);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22987);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22988);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22989);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22990);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22991);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(22992);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22993);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test124() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),22994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d8u3qwhqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test124",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d8u3qwhqq() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(22994);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(22995);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22996)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(22997)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(22998);System.out.format("%n%s%n", "RegressionTest0.test124");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(22999);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23000);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23001);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23002);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23003);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23004);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23005);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23006);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23007);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test125() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),23008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29zu4yfhr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test125",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29zu4yfhr4() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(23008);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23009);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23010)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23011)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(23012);System.out.format("%n%s%n", "RegressionTest0.test125");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(23013);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23014);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23015);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23016);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23017);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23018);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23019);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23020);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23021);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test126() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),23022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qu65yhri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test126",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qu65yhri() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(23022);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23023);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23024)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23025)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(23026);System.out.format("%n%s%n", "RegressionTest0.test126");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(23027);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23028);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23029);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23030);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23031);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23032);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23033);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23034);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23035);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test127() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),23036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hu7dhhrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test127",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hu7dhhrw() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(23036);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23037);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23038)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23039)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(23040);System.out.format("%n%s%n", "RegressionTest0.test127");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(23041);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23042);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23043);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23044);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23045);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23046);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23047);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23048);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23049);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test128() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),23050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28u8l0hsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test128",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28u8l0hsa() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(23050);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23051);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23052)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23053)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(23054);System.out.format("%n%s%n", "RegressionTest0.test128");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(23055);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23056);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23057);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23058);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23059);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23060);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23061);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23062);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23063);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}

    @Test
    public void test129() throws Throwable {__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceStart(getClass().getName(),23064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2305q7hhso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg9gg9lx1dwme8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg9gg9lx1dwme8.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test129",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2305q7hhso() throws Throwable{try{__CLR4_5_2gg9gg9lx1dwme8.R.inc(23064);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23065);if ((((debug)&&(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23066)!=0|true))||(__CLR4_5_2gg9gg9lx1dwme8.R.iget(23067)==0&false)))
            {__CLR4_5_2gg9gg9lx1dwme8.R.inc(23068);System.out.format("%n%s%n", "RegressionTest0.test129");
        }__CLR4_5_2gg9gg9lx1dwme8.R.inc(23069);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23070);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23071);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23072);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23073);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23074);try {
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23075);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg9gg9lx1dwme8.R.inc(23076);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg9gg9lx1dwme8.R.inc(23077);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg9gg9lx1dwme8.R.flushNeeded();}}
}

