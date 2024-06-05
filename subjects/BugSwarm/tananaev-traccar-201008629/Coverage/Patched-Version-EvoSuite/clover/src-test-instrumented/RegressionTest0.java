/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_2gg5gg5lx1dzdjm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,23200,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_299l2d6gg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test001",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_299l2d6gg5() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21317);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21318);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21319)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21320)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21321);System.out.format("%n%s%n", "RegressionTest0.test001");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21322);int int0 = org.traccar.protocol.TeltonikaProtocolDecoder.CODEC_GH3000;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21323);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test002() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_260l3kpggc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test002",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_260l3kpggc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21324);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21325);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21326)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21327)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21328);System.out.format("%n%s%n", "RegressionTest0.test002");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21329);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21330);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21331);org.traccar.model.Position position2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21332);java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21333);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21334);teltonikaProtocolDecoder1.getLastLocation(position2, date3);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21335);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test003() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22rl4s8ggo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test003",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22rl4s8ggo() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21336);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21337);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21338)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21339)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21340);System.out.format("%n%s%n", "RegressionTest0.test003");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21341);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21342);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21343);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21344);long long3 = teltonikaProtocolDecoder1.addUnknownDevice("");
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21345);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test004() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2heu09ggy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test004",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2heu09ggy() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21346);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21347);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21348)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21349)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21350);System.out.format("%n%s%n", "RegressionTest0.test004");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21351);int int0 = org.traccar.protocol.TeltonikaProtocolDecoder.CODEC_12;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21352);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test005() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qessqgh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test005",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qessqgh5() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21353);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21354);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21355)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21356)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21357);System.out.format("%n%s%n", "RegressionTest0.test005");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21358);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21359);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21360);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21361);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21362);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21363);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21364);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21365);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21366);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test006() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zerl7ghj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test006",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zerl7ghj() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21367);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21368);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21369)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21370)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21371);System.out.format("%n%s%n", "RegressionTest0.test006");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21372);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21373);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21374);java.lang.Class<?> wildcardClass2 = teltonikaProtocolDecoder1.getClass();
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21375);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test007() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a8eqdoghs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test007",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a8eqdoghs() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21376);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21377);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21378)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21379)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21380);System.out.format("%n%s%n", "RegressionTest0.test007");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21381);int int0 = org.traccar.protocol.TeltonikaProtocolDecoder.CODEC_FM4X00;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21382);org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test008() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dhep65ghz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test008",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21383,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dhep65ghz() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21383);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21384);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21385)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21386)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21387);System.out.format("%n%s%n", "RegressionTest0.test008");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21388);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21389);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21390);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21391);java.lang.String str2 = teltonikaProtocolDecoder1.getProtocolName();
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21392);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test009() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gqenymgi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test009",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gqenymgi9() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21393);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21394);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21395)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21396)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21397);System.out.format("%n%s%n", "RegressionTest0.test009");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21398);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21399);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21400);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21401);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21402);java.lang.String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21403);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21404);org.traccar.DeviceSession deviceSession5 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21405);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test010() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h79vdwgim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test010",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h79vdwgim() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21406);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21407);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21408)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21409)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21410);System.out.format("%n%s%n", "RegressionTest0.test010");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21411);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21412);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21413);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21414);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21415);java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21416);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21417);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21418);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21419);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test011() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kg9u6dgj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test011",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kg9u6dgj0() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21420);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21421);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21422)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21423)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21424);System.out.format("%n%s%n", "RegressionTest0.test011");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21425);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21426);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21427);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21428);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21429);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21430);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21431);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21432);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21433);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test012() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2np9syugje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test012",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2np9syugje() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21434);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21435);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21436)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21437)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21438);System.out.format("%n%s%n", "RegressionTest0.test012");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21439);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21440);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21441);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21442);org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21443);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21444);teltonikaProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21445);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test013() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qy9rrbgjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test013",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qy9rrbgjq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21446);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21447);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21448)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21449)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21450);System.out.format("%n%s%n", "RegressionTest0.test013");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21451);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21452);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21453);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test014() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u79qjsgjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test014",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u79qjsgjy() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21454);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21455);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21456)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21457)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21458);System.out.format("%n%s%n", "RegressionTest0.test014");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21459);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21460);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21461);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21462);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21463);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21464);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21465);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21466);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21467);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test015() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xg9pc9gkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test015",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xg9pc9gkc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21468);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21469);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21470)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21471)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21472);System.out.format("%n%s%n", "RegressionTest0.test015");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21473);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21474);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21475);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21476);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21477);java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21478);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21479);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21480);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21481);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test016() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ybuduegkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test016",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ybuduegkq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21482);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21483);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21484)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21485)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21486);System.out.format("%n%s%n", "RegressionTest0.test016");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21487);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21488);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21489);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21490);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21491);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21492);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21493);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21494);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21495);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test017() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v2uf1xgl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test017",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v2uf1xgl4() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21496);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21497);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21498)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21499)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21500);System.out.format("%n%s%n", "RegressionTest0.test017");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21501);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21502);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21503);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21504);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21505);java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21506);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21507);org.traccar.DeviceSession deviceSession5 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21508);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21509);org.junit.Assert.assertNotNull(strArray4);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test018() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtug9ggli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test018",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtug9ggli() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21510);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21511);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21512)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21513)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21514);System.out.format("%n%s%n", "RegressionTest0.test018");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21515);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21516);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21517);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21518);long long3 = teltonikaProtocolDecoder1.addUnknownDevice("hi!");
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21519);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test019() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2okuhgzgls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test019",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21520,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2okuhgzgls() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21520);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21521);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21522)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21523)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21524);System.out.format("%n%s%n", "RegressionTest0.test019");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21525);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21526);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21527);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21528);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21529);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21530);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21531);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21532);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21533);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test020() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o3za1pgm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test020",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o3za1pgm6() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21534);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21535);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21536)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21537)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21538);System.out.format("%n%s%n", "RegressionTest0.test020");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21539);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21540);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21541);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21542);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21543);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21544);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21545);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21546);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21547);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test021() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuzb98gmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test021",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuzb98gmk() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21548);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21549);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21550)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21551)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21552);System.out.format("%n%s%n", "RegressionTest0.test021");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21553);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21554);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21555);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21556);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21557);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21558);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21559);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21560);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21561);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test022() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hlzcgrgmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test022",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hlzcgrgmy() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21562);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21563);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21564)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21565)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21566);System.out.format("%n%s%n", "RegressionTest0.test022");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21567);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21568);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21569);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21570);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21571);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21572);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21573);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21574);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21575);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test023() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eczdoagnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test023",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eczdoagnc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21576);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21577);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21578)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21579)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21580);System.out.format("%n%s%n", "RegressionTest0.test023");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21581);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21582);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21583);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21584);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21585);java.lang.String[] strArray5 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21586);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21587);org.traccar.DeviceSession deviceSession6 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21588);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21589);org.junit.Assert.assertNotNull(strArray5);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test024() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b3zevtgnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test024",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b3zevtgnq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21590);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21591);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21592)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21593)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21594);System.out.format("%n%s%n", "RegressionTest0.test024");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21595);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21596);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21597);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21598);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21599);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21600);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21601);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21602);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21603);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test025() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uzg3cgo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test025",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uzg3cgo4() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21604);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21605);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21606)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21607)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21608);System.out.format("%n%s%n", "RegressionTest0.test025");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21609);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21610);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21611);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21612);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21613);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21614);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21615);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21616);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21617);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test026() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lzhavgoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test026",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21618,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lzhavgoi() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21618);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21619);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21620)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21621)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21622);System.out.format("%n%s%n", "RegressionTest0.test026");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21623);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21624);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21625);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21626);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21627);java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21628);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21629);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21630);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21631);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test027() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21cziiegow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test027",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21cziiegow() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21632);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21633);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21634)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21635)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21636);System.out.format("%n%s%n", "RegressionTest0.test027");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21637);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21638);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21639);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21640);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21641);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21642);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21643);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21644);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21645);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test028() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21w0ga3gpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test028",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21w0ga3gpa() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21646);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21647);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21648)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21649)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21650);System.out.format("%n%s%n", "RegressionTest0.test028");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21651);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21652);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21653);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21654);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21655);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21656);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21657);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21658);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21659);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test029() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2550f2kgpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test029",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2550f2kgpo() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21660);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21661);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21662)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21663)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21664);System.out.format("%n%s%n", "RegressionTest0.test029");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21665);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21666);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21667);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21668);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21669);java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21670);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21671);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21672);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21673);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test030() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lvmhugq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test030",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lvmhugq2() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21674);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21675);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21676)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21677)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21678);System.out.format("%n%s%n", "RegressionTest0.test030");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21679);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21680);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21681);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21682);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21683);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21684);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21685);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21686);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21687);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test031() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uvlabgqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test031",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uvlabgqg() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21688);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21689);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21690)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21691)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21692);System.out.format("%n%s%n", "RegressionTest0.test031");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21693);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21694);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21695);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21696);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21697);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21698);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21699);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21700);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21701);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test032() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3vk2sgqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test032",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3vk2sgqu() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21702);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21703);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21704)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21705)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21706);System.out.format("%n%s%n", "RegressionTest0.test032");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21707);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21708);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21709);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21710);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21711);java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21712);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21713);org.traccar.DeviceSession deviceSession7 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21714);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21715);org.junit.Assert.assertNotNull(strArray6);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test033() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fcviv9gr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test033",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fcviv9gr8() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21716);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21717);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21718)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21719)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21720);System.out.format("%n%s%n", "RegressionTest0.test033");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21721);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21722);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21723);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21724);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21725);java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21726);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21727);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21728);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21729);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test034() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ilvhnqgrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test034",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ilvhnqgrm() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21730);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21731);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21732)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21733)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21734);System.out.format("%n%s%n", "RegressionTest0.test034");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21735);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21736);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21737);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21738);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21739);java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21740);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21741);org.traccar.DeviceSession deviceSession6 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21742);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21743);org.junit.Assert.assertNotNull(strArray5);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test035() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2luvgg7gs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test035",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2luvgg7gs0() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21744);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21745);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21746)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21747)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21748);System.out.format("%n%s%n", "RegressionTest0.test035");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21749);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21750);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21751);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21752);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21753);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21754);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21755);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21756);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21757);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test036() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3vf8ogse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test036",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3vf8ogse() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21758);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21759);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21760)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21761)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21762);System.out.format("%n%s%n", "RegressionTest0.test036");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21763);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21764);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21765);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21766);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21767);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21768);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21769);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21770);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21771);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test037() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2scve15gss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test037",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2scve15gss() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21772);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21773);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21774)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21775)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21776);System.out.format("%n%s%n", "RegressionTest0.test037");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21777);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21778);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21779);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21780);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21781);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21782);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21783);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21784);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21785);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test038() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vlvctmgt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test038",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vlvctmgt6() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21786);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21787);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21788)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21789)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21790);System.out.format("%n%s%n", "RegressionTest0.test038");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21791);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21792);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21793);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21794);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21795);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21796);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21797);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21798);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21799);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test039() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yuvbm3gtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test039",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yuvbm3gtk() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21800);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21801);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21802)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21803)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21804);System.out.format("%n%s%n", "RegressionTest0.test039");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21805);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21806);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21807);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21808);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21809);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21810);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21811);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21812);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21813);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test040() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zbqj1dgty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test040",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zbqj1dgty() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21814);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21815);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21816)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21817)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21818);System.out.format("%n%s%n", "RegressionTest0.test040");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21819);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21820);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21821);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21822);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21823);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21824);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21825);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21826);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21827);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test041() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wgdk5aguc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test041",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wgdk5aguc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21828);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21829);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21830)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21831)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21832);System.out.format("%n%s%n", "RegressionTest0.test041");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21833);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21834);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21835);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21836);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21837);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21838);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21839);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21840);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21841);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test042() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t7dlctguq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test042",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21842,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t7dlctguq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21842);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21843);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21844)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21845)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21846);System.out.format("%n%s%n", "RegressionTest0.test042");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21847);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21848);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21849);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21850);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21851);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21852);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21853);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21854);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21855);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test043() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pydmkcgv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test043",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pydmkcgv4() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21856);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21857);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21858)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21859)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21860);System.out.format("%n%s%n", "RegressionTest0.test043");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21861);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21862);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21863);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21864);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21865);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21866);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21867);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21868);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21869);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test044() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mpdnrvgvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test044",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mpdnrvgvi() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21870);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21871);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21872)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21873)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21874);System.out.format("%n%s%n", "RegressionTest0.test044");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21875);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21876);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21877);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21878);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21879);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21880);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21881);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21882);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21883);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test045() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgdozegvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test045",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21884,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgdozegvw() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21884);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21885);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21886)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21887)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21888);System.out.format("%n%s%n", "RegressionTest0.test045");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21889);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21890);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21891);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21892);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21893);java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21894);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21895);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21896);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21897);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test046() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g7dq6xgwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test046",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g7dq6xgwa() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21898);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21899);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21900)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21901)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21902);System.out.format("%n%s%n", "RegressionTest0.test046");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21903);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21904);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21905);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21906);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21907);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21908);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21909);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21910);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21911);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test047() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cydreggwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test047",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21912,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cydreggwo() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21912);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21913);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21914)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21915)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21916);System.out.format("%n%s%n", "RegressionTest0.test047");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21917);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21918);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21919);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21920);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21921);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21922);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21923);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21924);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21925);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test048() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29pdslzgx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test048",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29pdslzgx2() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21926);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21927);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21928)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21929)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21930);System.out.format("%n%s%n", "RegressionTest0.test048");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21931);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21932);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21933);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21934);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21935);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21936);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21937);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21938);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21939);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test049() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26gdttigxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test049",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26gdttigxg() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21940);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21941);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21942)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21943)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21944);System.out.format("%n%s%n", "RegressionTest0.test049");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21945);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21946);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21947);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21948);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21949);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21950);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21951);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21952);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21953);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test050() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25zime8gxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test050",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25zime8gxu() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21954);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21955);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21956)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21957)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21958);System.out.format("%n%s%n", "RegressionTest0.test050");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21959);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21960);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21961);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21962);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21963);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21964);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21965);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21966);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21967);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test051() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qinlrgy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test051",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qinlrgy8() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21968);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21969);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21970)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21971)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21972);System.out.format("%n%s%n", "RegressionTest0.test051");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21973);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21974);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21975);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21976);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21977);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21978);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21979);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21980);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21981);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test052() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ihb6qgym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test052",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21982,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ihb6qgym() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21982);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21983);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21984)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21985)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21986);System.out.format("%n%s%n", "RegressionTest0.test052");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21987);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21988);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21989);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21990);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21991);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21992);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21993);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21994);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21995);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test053() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),21996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23rh9z7gz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test053",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23rh9z7gz0() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(21996);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(21997);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21998)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(21999)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22000);System.out.format("%n%s%n", "RegressionTest0.test053");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22001);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22002);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22003);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22004);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22005);java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22006);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22007);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22008);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22009);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test054() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270h8rogze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test054",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270h8rogze() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22010);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22011);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22012)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22013)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22014);System.out.format("%n%s%n", "RegressionTest0.test054");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22015);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22016);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22017);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22018);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22019);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22020);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22021);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22022);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22023);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test055() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9h7k5gzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test055",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9h7k5gzs() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22024);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22025);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22026)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22027)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22028);System.out.format("%n%s%n", "RegressionTest0.test055");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22029);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22030);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22031);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22032);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22033);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22034);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22035);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22036);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22037);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test056() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dih6cmh06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test056",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dih6cmh06() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22038);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22039);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22040)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22041)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22042);System.out.format("%n%s%n", "RegressionTest0.test056");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22043);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22044);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22045);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22046);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22047);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22048);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22049);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22050);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22051);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test057() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grh553h0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test057",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grh553h0k() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22052);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22053);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22054)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22055)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22056);System.out.format("%n%s%n", "RegressionTest0.test057");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22057);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22058);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22059);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22060);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22061);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22062);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22063);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22064);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22065);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test058() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k0h3xkh0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test058",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k0h3xkh0y() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22066);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22067);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22068)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22069)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22070);System.out.format("%n%s%n", "RegressionTest0.test058");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22071);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22072);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22073);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22074);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22075);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22076);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22077);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22078);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22079);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test059() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n9h2q1h1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test059",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22080,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n9h2q1h1c() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22080);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22081);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22082)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22083)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22084);System.out.format("%n%s%n", "RegressionTest0.test059");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22085);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22086);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22087);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22088);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22089);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22090);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22091);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22092);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22093);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test060() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqca5bh1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test060",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqca5bh1q() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22094);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22095);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22096)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22097)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22098);System.out.format("%n%s%n", "RegressionTest0.test060");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22099);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22100);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22101);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22102);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22103);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22104);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22105);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22106);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22107);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test061() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qzc8xsh24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test061",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qzc8xsh24() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22108);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22109);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22110)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22111)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22112);System.out.format("%n%s%n", "RegressionTest0.test061");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22113);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22114);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22115);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22116);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22117);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22118);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22119);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22120);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22121);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test062() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8c7q9h2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test062",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22122,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8c7q9h2i() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22122);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22123);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22124)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22125)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22126);System.out.format("%n%s%n", "RegressionTest0.test062");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22127);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22128);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22129);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22130);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22131);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22132);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22133);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22134);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22135);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test063() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xhc6iqh2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test063",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xhc6iqh2w() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22136);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22137);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22138)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22139)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22140);System.out.format("%n%s%n", "RegressionTest0.test063");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22141);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22142);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22143);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22144);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22145);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22146);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22147);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22148);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22149);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test064() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yarwnxh3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test064",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yarwnxh3a() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22150);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22151);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22152)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22153)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22154);System.out.format("%n%s%n", "RegressionTest0.test064");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22155);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22156);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22157);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22158);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22159);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22160);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22161);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22162);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22163);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test065() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v1rxvgh3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test065",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v1rxvgh3o() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22164);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22165);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22166)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22167)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22168);System.out.format("%n%s%n", "RegressionTest0.test065");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22169);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22170);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22171);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22172);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22173);java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22174);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22175);org.traccar.DeviceSession deviceSession8 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22176);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22177);org.junit.Assert.assertNotNull(strArray7);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test066() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rsrz2zh42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test066",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rsrz2zh42() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22178);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22179);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22180)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22181)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22182);System.out.format("%n%s%n", "RegressionTest0.test066");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22183);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22184);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22185);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22186);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22187);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22188);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22189);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22190);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22191);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test067() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojs0aih4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test067",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojs0aih4g() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22192);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22193);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22194)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22195)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22196);System.out.format("%n%s%n", "RegressionTest0.test067");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22197);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22198);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22199);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22200);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22201);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22202);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22203);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22204);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22205);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test068() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2las1i1h4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test068",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2las1i1h4u() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22206);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22207);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22208)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22209)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22210);System.out.format("%n%s%n", "RegressionTest0.test068");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22211);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22212);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22213);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22214);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22215);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22216);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22217);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22218);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22219);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test069() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1s2pkh58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test069",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1s2pkh58() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22220);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22221);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22222)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22223)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22224);System.out.format("%n%s%n", "RegressionTest0.test069");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22225);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22226);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22227);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22228);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22229);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22230);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22231);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22232);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22233);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test070() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hkwvaah5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test070",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hkwvaah5m() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22234);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22235);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22236)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22237)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22238);System.out.format("%n%s%n", "RegressionTest0.test070");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22239);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22240);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22241);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22242);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22243);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22244);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22245);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22246);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22247);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test071() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ebwwhth60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test071",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ebwwhth60() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22248);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22249);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22250)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22251)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22252);System.out.format("%n%s%n", "RegressionTest0.test071");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22253);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22254);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22255);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22256);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22257);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22258);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22259);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22260);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22261);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test072() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b2wxpch6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test072",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b2wxpch6e() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22262);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22263);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22264)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22265)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22266);System.out.format("%n%s%n", "RegressionTest0.test072");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22267);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22268);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22269);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22270);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22271);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22272);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22273);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22274);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22275);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test073() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27twywvh6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test073",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27twywvh6s() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22276);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22277);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22278)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22279)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22280);System.out.format("%n%s%n", "RegressionTest0.test073");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22281);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22282);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22283);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22284);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22285);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22286);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22287);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22288);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22289);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test074() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24kx04eh76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test074",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24kx04eh76() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22290);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22291);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22292)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22293)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22294);System.out.format("%n%s%n", "RegressionTest0.test074");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22295);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22296);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22297);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22298);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22299);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22300);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22301);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22302);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22303);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test075() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21bx1bxh7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test075",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21bx1bxh7k() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22304);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22305);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22306)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22307)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22308);System.out.format("%n%s%n", "RegressionTest0.test075");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22309);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22310);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22311);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22312);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22313);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22314);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22315);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22316);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22317);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test076() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x2xgkh7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test076",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x2xgkh7y() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22318);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22319);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22320)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22321)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22322);System.out.format("%n%s%n", "RegressionTest0.test076");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22323);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22324);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22325);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22326);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22327);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22328);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22329);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22330);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22331);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test077() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2562w91h8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test077",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2562w91h8c() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22332);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22333);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22334)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22335)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22336);System.out.format("%n%s%n", "RegressionTest0.test077");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22337);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22338);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22339);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22340);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22341);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22342);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22343);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22344);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22345);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test078() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f2v1ih8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test078",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f2v1ih8q() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22346);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22347);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22348)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22349)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22350);System.out.format("%n%s%n", "RegressionTest0.test078");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22351);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22352);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22353);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22354);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22355);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22356);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22357);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22358);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22359);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test079() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bo2ttzh94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test079",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bo2ttzh94() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22360);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22361);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22362)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22363)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22364);System.out.format("%n%s%n", "RegressionTest0.test079");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22365);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22366);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22367);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22368);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22369);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22370);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22371);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22372);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22373);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test080() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c4y199h9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test080",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c4y199h9i() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22374);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22375);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22376)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22377)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22378);System.out.format("%n%s%n", "RegressionTest0.test080");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22379);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22380);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22381);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22382);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22383);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22384);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22385);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22386);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22387);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test081() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fdy01qh9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test081",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fdy01qh9w() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22388);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22389);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22390)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22391)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22392);System.out.format("%n%s%n", "RegressionTest0.test081");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22393);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22394);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22395);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22396);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22397);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22398);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22399);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22400);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22401);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test082() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2imxyu7haa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test082",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2imxyu7haa() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22402);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22403);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22404)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22405)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22406);System.out.format("%n%s%n", "RegressionTest0.test082");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22407);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22408);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22409);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22410);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22411);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22412);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22413);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22414);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22415);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test083() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lvxxmohao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test083",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lvxxmohao() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22416);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22417);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22418)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22419)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22420);System.out.format("%n%s%n", "RegressionTest0.test083");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22421);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22422);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22423);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22424);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22425);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22426);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22427);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22428);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22429);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test084() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p4xwf5hb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test084",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p4xwf5hb2() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22430);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22431);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22432)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22433)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22434);System.out.format("%n%s%n", "RegressionTest0.test084");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22435);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22436);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22437);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22438);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22439);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22440);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22441);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22442);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22443);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test085() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sdxv7mhbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test085",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sdxv7mhbg() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22444);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22445);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22446)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22447)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22448);System.out.format("%n%s%n", "RegressionTest0.test085");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22449);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22450);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22451);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22452);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22453);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22454);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22455);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22456);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22457);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test086() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmxu03hbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test086",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmxu03hbu() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22458);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22459);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22460)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22461)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22462);System.out.format("%n%s%n", "RegressionTest0.test086");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22463);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22464);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22465);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22466);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22467);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22468);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22469);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22470);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22471);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test087() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvxsskhc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test087",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvxsskhc8() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22472);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22473);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22474)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22475)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22476);System.out.format("%n%s%n", "RegressionTest0.test087");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22477);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22478);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22479);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22480);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22481);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22482);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22483);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22484);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22485);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test088() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww6ae3hcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test088",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww6ae3hcm() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22486);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22487);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22488)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22489)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22490);System.out.format("%n%s%n", "RegressionTest0.test088");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22491);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22492);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22493);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22494);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22495);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22496);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22497);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22498);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22499);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test089() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tn6blmhd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test089",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tn6blmhd0() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22500);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22501);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22502)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22503)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22504);System.out.format("%n%s%n", "RegressionTest0.test089");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22505);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22506);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22507);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22508);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22509);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22510);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22511);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22512);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22513);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test090() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t6b46chde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test090",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t6b46chde() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22514);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22515);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22516)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22517)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22518);System.out.format("%n%s%n", "RegressionTest0.test090");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22519);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22520);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22521);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22522);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22523);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22524);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22525);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22526);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22527);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test091() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxb5dvhds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test091",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxb5dvhds() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22528);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22529);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22530)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22531)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22532);System.out.format("%n%s%n", "RegressionTest0.test091");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22533);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22534);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22535);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22536);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22537);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22538);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22539);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22540);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22541);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test092() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mob6lehe6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test092",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mob6lehe6() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22542);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22543);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22544)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22545)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22546);System.out.format("%n%s%n", "RegressionTest0.test092");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22547);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22548);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22549);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22550);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22551);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22552);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22553);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22554);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22555);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test093() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfb7sxhek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test093",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfb7sxhek() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22556);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22557);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22558)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22559)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22560);System.out.format("%n%s%n", "RegressionTest0.test093");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22561);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22562);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22563);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22564);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22565);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22566);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22567);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22568);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22569);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test094() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6b90ghey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test094",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6b90ghey() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22570);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22571);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22572)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22573)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22574);System.out.format("%n%s%n", "RegressionTest0.test094");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22575);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22576);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22577);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22578);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22579);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22580);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22581);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22582);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22583);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test095() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cxba7zhfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test095",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cxba7zhfc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22584);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22585);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22586)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22587)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22588);System.out.format("%n%s%n", "RegressionTest0.test095");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22589);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22590);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22591);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22592);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22593);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22594);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22595);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22596);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22597);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test096() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29obbfihfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test096",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29obbfihfq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22598);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22599);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22600)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22601)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22602);System.out.format("%n%s%n", "RegressionTest0.test096");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22603);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22604);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22605);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22606);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22607);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22608);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22609);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22610);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22611);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test097() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fbcn1hg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test097",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fbcn1hg4() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22612);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22613);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22614)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22615)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22616);System.out.format("%n%s%n", "RegressionTest0.test097");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22617);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22618);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22619);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22620);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22621);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22622);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22623);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22624);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22625);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test098() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_236bdukhgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test098",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_236bdukhgi() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22626);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22627);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22628)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22629)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22630);System.out.format("%n%s%n", "RegressionTest0.test098");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22631);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22632);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22633);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22634);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22635);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22636);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22637);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22638);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22639);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test099() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22okxxhgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test099",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22okxxhgw() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22640);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22641);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22642)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22643)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22644);System.out.format("%n%s%n", "RegressionTest0.test099");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22645);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22646);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22647);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22648);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22649);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22650);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22651);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22652);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22653);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test100() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2enfq0qhha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test100",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2enfq0qhha() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22654);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22655);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22656)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22657)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22658);System.out.format("%n%s%n", "RegressionTest0.test100");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22659);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22660);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22661);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22662);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22663);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22664);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22665);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22666);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22667);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test101() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2befr89hho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test101",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2befr89hho() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22668);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22669);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22670)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22671)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22672);System.out.format("%n%s%n", "RegressionTest0.test101");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22673);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22674);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22675);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22676);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22677);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22678);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22679);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22680);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22681);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test102() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285fsfshi2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test102",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285fsfshi2() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22682);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22683);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22684)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22685)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22686);System.out.format("%n%s%n", "RegressionTest0.test102");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22687);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22688);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22689);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22690);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22691);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22692);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22693);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22694);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22695);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test103() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wftnbhig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test103",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wftnbhig() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22696);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22697);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22698)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22699)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22700);System.out.format("%n%s%n", "RegressionTest0.test103");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22701);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22702);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22703);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22704);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22705);java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22706);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22707);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22708);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22709);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test104() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21nfuuuhiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test104",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21nfuuuhiu() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22710);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22711);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22712)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22713)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22714);System.out.format("%n%s%n", "RegressionTest0.test104");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22715);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22716);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22717);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22718);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22719);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22720);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22721);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22722);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22723);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test105() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21lk3xnhj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test105",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21lk3xnhj8() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22724);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22725);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22726)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22727)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22728);System.out.format("%n%s%n", "RegressionTest0.test105");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22729);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22730);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22731);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22732);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22733);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22734);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22735);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22736);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22737);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test106() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24uk2q4hjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test106",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24uk2q4hjm() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22738);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22739);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22740)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22741)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22742);System.out.format("%n%s%n", "RegressionTest0.test106");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22743);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22744);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22745);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22746);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22747);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22748);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22749);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22750);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22751);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test107() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283k1ilhk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test107",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283k1ilhk0() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22752);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22753);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22754)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22755)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22756);System.out.format("%n%s%n", "RegressionTest0.test107");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22757);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22758);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22759);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22760);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22761);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22762);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22763);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22764);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22765);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test108() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bck0b2hke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test108",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bck0b2hke() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22766);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22767);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22768)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22769)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22770);System.out.format("%n%s%n", "RegressionTest0.test108");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22771);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22772);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22773);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22774);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22775);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22776);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22777);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22778);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22779);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test109() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eljz3jhks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test109",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eljz3jhks() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22780);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22781);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22782)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22783)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22784);System.out.format("%n%s%n", "RegressionTest0.test109");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22785);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22786);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22787);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22788);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22789);java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22790);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22791);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22792);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22793);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test110() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f2f6ithl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test110",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f2f6ithl6() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22794);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22795);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22796)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22797)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22798);System.out.format("%n%s%n", "RegressionTest0.test110");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22799);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22800);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22801);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22802);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22803);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22804);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22805);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22806);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22807);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test111() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibf5bahlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test111",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibf5bahlk() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22808);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22809);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22810)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22811)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22812);System.out.format("%n%s%n", "RegressionTest0.test111");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22813);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22814);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22815);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22816);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22817);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22818);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22819);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22820);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22821);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test112() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lkf43rhly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test112",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lkf43rhly() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22822);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22823);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22824)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22825)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22826);System.out.format("%n%s%n", "RegressionTest0.test112");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22827);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22828);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22829);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22830);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22831);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22832);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22833);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22834);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22835);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test113() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2otf2w8hmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test113",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2otf2w8hmc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22836);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22837);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22838)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22839)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22840);System.out.format("%n%s%n", "RegressionTest0.test113");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22841);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22842);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22843);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22844);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22845);java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22846);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22847);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22848);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22849);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test114() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s2f1ophmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test114",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s2f1ophmq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22850);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22851);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22852)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22853)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22854);System.out.format("%n%s%n", "RegressionTest0.test114");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22855);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22856);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22857);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22858);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22859);java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22860);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22861);org.traccar.DeviceSession deviceSession9 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22862);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22863);org.junit.Assert.assertNotNull(strArray8);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test115() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbf0h6hn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test115",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbf0h6hn4() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22864);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22865);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22866)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22867)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22868);System.out.format("%n%s%n", "RegressionTest0.test115");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22869);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22870);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22871);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22872);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22873);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22874);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22875);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22876);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22877);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test116() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykez9nhni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test116",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykez9nhni() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22878);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22879);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22880)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22881)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22882);System.out.format("%n%s%n", "RegressionTest0.test116");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22883);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22884);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22885);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22886);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22887);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22888);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22889);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22890);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22891);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test117() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7p3x0hnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test117",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7p3x0hnw() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22892);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22893);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22894)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22895)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22896);System.out.format("%n%s%n", "RegressionTest0.test117");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22897);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22898);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22899);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22900);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22901);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22902);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22903);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22904);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22905);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test118() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2typ54jhoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test118",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2typ54jhoa() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22906);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22907);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22908)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22909)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22910);System.out.format("%n%s%n", "RegressionTest0.test118");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22911);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22912);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22913);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22914);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22915);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22916);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22917);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22918);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22919);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test119() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpp6c2hoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test119",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpp6c2hoo() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22920);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22921);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22922)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22923)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22924);System.out.format("%n%s%n", "RegressionTest0.test119");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22925);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22926);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22927);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22928);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22929);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22930);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22931);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22932);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22933);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test120() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q8tywshp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test120",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q8tywshp2() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22934);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22935);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22936)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22937)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22938);System.out.format("%n%s%n", "RegressionTest0.test120");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22939);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22940);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22941);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22942);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22943);java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22944);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22945);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22946);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22947);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test121() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mzu04bhpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test121",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mzu04bhpg() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22948);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22949);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22950)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22951)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22952);System.out.format("%n%s%n", "RegressionTest0.test121");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22953);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22954);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22955);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22956);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22957);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22958);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22959);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22960);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22961);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test122() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jqu1buhpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test122",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jqu1buhpu() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22962);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22963);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22964)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22965)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22966);System.out.format("%n%s%n", "RegressionTest0.test122");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22967);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22968);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22969);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22970);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22971);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22972);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22973);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22974);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22975);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test123() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ghu2jdhq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test123",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ghu2jdhq8() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22976);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22977);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22978)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22979)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22980);System.out.format("%n%s%n", "RegressionTest0.test123");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22981);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22982);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22983);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22984);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22985);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22986);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22987);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22988);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22989);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test124() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),22990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d8u3qwhqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test124",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d8u3qwhqm() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22990);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22991);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22992)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(22993)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22994);System.out.format("%n%s%n", "RegressionTest0.test124");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(22995);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22996);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22997);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22998);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(22999);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23000);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23001);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23002);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23003);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test125() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29zu4yfhr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test125",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29zu4yfhr0() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23004);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23005);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23006)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23007)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23008);System.out.format("%n%s%n", "RegressionTest0.test125");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23009);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23010);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23011);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23012);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23013);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23014);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23015);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23016);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23017);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test126() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qu65yhre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test126",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qu65yhre() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23018);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23019);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23020)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23021)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23022);System.out.format("%n%s%n", "RegressionTest0.test126");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23023);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23024);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23025);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23026);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23027);java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23028);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23029);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23030);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23031);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test127() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hu7dhhrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test127",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hu7dhhrs() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23032);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23033);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23034)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23035)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23036);System.out.format("%n%s%n", "RegressionTest0.test127");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23037);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23038);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23039);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23040);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23041);java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23042);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23043);org.traccar.DeviceSession deviceSession10 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23044);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23045);org.junit.Assert.assertNotNull(strArray9);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test128() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28u8l0hs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test128",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28u8l0hs6() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23046);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23047);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23048)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23049)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23050);System.out.format("%n%s%n", "RegressionTest0.test128");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23051);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23052);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23053);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23054);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23055);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23056);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23057);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23058);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23059);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test129() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2305q7hhsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test129",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2305q7hhsk() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23060);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23061);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23062)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23063)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23064);System.out.format("%n%s%n", "RegressionTest0.test129");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23065);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23066);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23067);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23068);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23069);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23070);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23071);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23072);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23073);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test130() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23h0xmrhsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test130",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23h0xmrhsy() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23074);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23075);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23076)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23077)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23078);System.out.format("%n%s%n", "RegressionTest0.test130");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23079);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23080);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23081);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23082);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23083);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23084);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23085);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23086);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23087);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test131() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26q0wf8htc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test131",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26q0wf8htc() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23088);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23089);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23090)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23091)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23092);System.out.format("%n%s%n", "RegressionTest0.test131");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23093);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23094);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23095);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23096);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23097);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23098);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23099);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23100);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23101);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test132() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29z0v7phtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test132",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29z0v7phtq() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23102);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23103);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23104)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23105)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23106);System.out.format("%n%s%n", "RegressionTest0.test132");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23107);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23108);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23109);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23110);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23111);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23112);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23113);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23114);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23115);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test133() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d80u06hu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test133",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d80u06hu4() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23116);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23117);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23118)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23119)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23120);System.out.format("%n%s%n", "RegressionTest0.test133");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23121);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23122);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23123);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23124);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23125);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23126);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23127);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23128);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23129);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test134() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gh0ssnhui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test134",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23130,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gh0ssnhui() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23130);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23131);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23132)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23133)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23134);System.out.format("%n%s%n", "RegressionTest0.test134");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23135);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23136);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23137);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23138);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23139);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23140);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23141);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23142);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23143);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test135() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jq0rl4huw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test135",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jq0rl4huw() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23144);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23145);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23146)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23147)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23148);System.out.format("%n%s%n", "RegressionTest0.test135");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23149);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23150);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23151);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23152);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23153);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23154);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23155);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23156);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23157);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test136() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mz0qdlhva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test136",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mz0qdlhva() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23158);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23159);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23160)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23161)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23162);System.out.format("%n%s%n", "RegressionTest0.test136");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23163);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23164);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23165);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23166);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23167);java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23168);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23169);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23170);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23171);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test137() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q80p62hvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test137",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q80p62hvo() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23172);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23173);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23174)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23175)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23176);System.out.format("%n%s%n", "RegressionTest0.test137");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23177);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23178);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23179);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23180);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23181);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23182);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23183);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23184);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23185);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}

    @Test
    public void test138() throws Throwable {__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceStart(getClass().getName(),23186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2th0nyjhw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gg5gg5lx1dzdjm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gg5gg5lx1dzdjm.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test138",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23186,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2th0nyjhw2() throws Throwable{try{__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23186);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23187);if ((((debug)&&(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23188)!=0|true))||(__CLR4_5_2gg5gg5lx1dzdjm.R.iget(23189)==0&false)))
            {__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23190);System.out.format("%n%s%n", "RegressionTest0.test138");
        }__CLR4_5_2gg5gg5lx1dzdjm.R.inc(23191);org.traccar.protocol.TeltonikaProtocol teltonikaProtocol0 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23192);org.traccar.protocol.TeltonikaProtocolDecoder teltonikaProtocolDecoder1 = new org.traccar.protocol.TeltonikaProtocolDecoder(teltonikaProtocol0);
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23193);org.jboss.netty.channel.Channel channel2 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23194);java.net.SocketAddress socketAddress3 = null;
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23195);java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23196);try {
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23197);org.traccar.DeviceSession deviceSession11 = teltonikaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23198);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_2gg5gg5lx1dzdjm.R.inc(23199);org.junit.Assert.assertNotNull(strArray10);
    }finally{__CLR4_5_2gg5gg5lx1dzdjm.R.flushNeeded();}}
}

