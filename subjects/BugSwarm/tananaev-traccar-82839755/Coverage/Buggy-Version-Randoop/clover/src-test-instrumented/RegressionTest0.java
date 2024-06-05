/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_29dd9ddlx1e46bw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yt33u9dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test01",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yt33u9dd() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12145);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12146);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12147)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12148)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12149);System.out.format("%n%s%n", "RegressionTest0.test01");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12150);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12151);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12152);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12153);java.lang.String str2 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12154);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test02() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277t1wb9dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test02",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277t1wb9dn() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12155);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12156);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12157)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12158)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12159);System.out.format("%n%s%n", "RegressionTest0.test02");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12160);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12161);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12162);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12163);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12164);org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12165);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12166);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext3, channelEvent4);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12167);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12168);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test03() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agt0os9e1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test03",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agt0os9e1() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12169);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12170);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12171)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12172)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12173);System.out.format("%n%s%n", "RegressionTest0.test03");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12174);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12175);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12176);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12177);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12178);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12179);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12180);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12181);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12182);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12183);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12184);org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12185);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12186);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext12, channelEvent13);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12187);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12188);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12189);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12190);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test04() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpszh99en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test04",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpszh99en() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12191);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12192);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12193)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12194)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12195);System.out.format("%n%s%n", "RegressionTest0.test04");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12196);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12197);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12198);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12199);org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12200);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12201);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12202);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test05() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gysy9q9ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test05",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gysy9q9ez() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12203);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12204);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12205)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12206)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12207);System.out.format("%n%s%n", "RegressionTest0.test05");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12208);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12209);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12210);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12211);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12212);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12213);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12214);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12215);java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12216);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12217);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12218);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test06() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7sx279ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test06",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7sx279ff() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12219);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12220);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12221)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12222)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12223);System.out.format("%n%s%n", "RegressionTest0.test06");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12224);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12225);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12226);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12227);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12228);java.lang.String str3 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12229);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12230);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test07() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngsvuo9fr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test07",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngsvuo9fr() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12231);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12232);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12233)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12234)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12235);System.out.format("%n%s%n", "RegressionTest0.test07");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12236);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12237);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12238);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12239);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12240);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12241);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12242);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12243);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12244);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12245);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12246);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12247);org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12248);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12249);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext14, channelEvent15);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12250);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12251);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12252);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12253);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12254);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test08() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpsun59gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test08",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpsun59gf() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12255);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12256);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12257)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12258)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12259);System.out.format("%n%s%n", "RegressionTest0.test08");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12260);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12261);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12262);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12263);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12264);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12265);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12266);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12267);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12268);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12269);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12270);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12271);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12272);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12273);java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12274);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12275);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12276);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12277);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12278);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12279);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test09() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tystfm9h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test09",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tystfm9h4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12280);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12281);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12282)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12283)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12284);System.out.format("%n%s%n", "RegressionTest0.test09");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12285);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12286);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12287);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12288);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12289);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12290);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12291);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12292);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12293);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12294);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12295);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12296);java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12297);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12298);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12299);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12300);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12301);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test10() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufo0uw9hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufo0uw9hq() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12302);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12303);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12304)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12305)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12306);System.out.format("%n%s%n", "RegressionTest0.test10");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12307);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12308);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12309);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12310);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12311);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12312);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12313);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12314);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12315);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12316);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12317);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12318);boolean boolean15 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12319);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12320);org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12321);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12322);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext16, channelEvent17);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12323);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12324);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12325);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12326);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12327);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test11() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xonznd9ig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xonznd9ig() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12328);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12329);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12330)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12331)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12332);System.out.format("%n%s%n", "RegressionTest0.test11");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12333);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12334);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12335);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12336);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12337);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12338);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12339);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12340);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12341);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12342);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12343);org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12344);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12345);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext13, channelEvent14);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12346);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12347);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12348);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12349);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test12() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3g3ja9j2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3g3ja9j2() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12350);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12351);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12352)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12353)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12354);System.out.format("%n%s%n", "RegressionTest0.test12");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12355);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12356);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12357);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12358);java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12359);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12360);org.junit.Assert.assertNotNull(wildcardClass3);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test13() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uug4qt9jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uug4qt9jd() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12361);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12362);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12363)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12364)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12365);System.out.format("%n%s%n", "RegressionTest0.test13");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12366);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12367);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12368);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12369);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12370);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12371);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12372);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12373);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12374);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12375);java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12376);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12377);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12378);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12379);org.junit.Assert.assertNotNull(wildcardClass13);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test14() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlg5yc9jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlg5yc9jw() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12380);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12381);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12382)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12383)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12384);System.out.format("%n%s%n", "RegressionTest0.test14");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12385);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12386);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12387);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12388);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12389);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12390);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12391);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12392);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12393);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12394);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12395);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12396);boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12397);java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12398);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12399);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12400);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12401);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12402);org.junit.Assert.assertNotNull(wildcardClass17);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test15() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocg75v9kj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocg75v9kj() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12403);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12404);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12405)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12406)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12407);System.out.format("%n%s%n", "RegressionTest0.test15");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12408);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12409);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12410);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12411);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12412);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12413);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12414);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12415);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12416);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12417);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12418);java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12419);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12420);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12421);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12422);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12423);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test16() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3g8de9l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3g8de9l4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12424);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12425);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12426)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12427)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12428);System.out.format("%n%s%n", "RegressionTest0.test16");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12429);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12430);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12431);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12432);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12433);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12434);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12435);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12436);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12437);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12438);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12439);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12440);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12441);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12442);long long18 = aquilaProtocolDecoder1.getDeviceId();
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12443);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12444);java.lang.String str19 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12445);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12446);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12447);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12448);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12449);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12450);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12451);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test17() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hug9kx9lw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hug9kx9lw() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12452);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12453);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12454)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12455)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12456);System.out.format("%n%s%n", "RegressionTest0.test17");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12457);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12458);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12459);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12460);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12461);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12462);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12463);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12464);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12465);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12466);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12467);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12468);java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12469);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12470);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12471);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12472);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12473);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test18() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elgasg9mi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elgasg9mi() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12474);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12475);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12476)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12477)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12478);System.out.format("%n%s%n", "RegressionTest0.test18");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12479);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12480);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12481);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12482);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12483);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12484);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12485);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12486);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12487);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12488);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12489);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12490);java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12491);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12492);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12493);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12494);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12495);org.junit.Assert.assertNotNull(wildcardClass15);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test19() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcgbzz9n4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcgbzz9n4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12496);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12497);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12498)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12499)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12500);System.out.format("%n%s%n", "RegressionTest0.test19");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12501);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12502);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12503);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12504);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12505);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12506);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12507);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12508);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12509);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12510);java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12511);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12512);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12513);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12514);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test20() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avl4kp9nn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avl4kp9nn() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12515);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12516);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12517)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12518)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12519);System.out.format("%n%s%n", "RegressionTest0.test20");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12520);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12521);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12522);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12523);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12524);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12525);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12526);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12527);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12528);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12529);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12530);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12531);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12532);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12533);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12534);org.jboss.netty.channel.ChannelEvent channelEvent19 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12535);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12536);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext18, channelEvent19);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12537);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12538);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12539);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12540);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12541);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12542);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test21() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ml5s89of();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ml5s89of() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12543);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12544);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12545)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12546)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12547);System.out.format("%n%s%n", "RegressionTest0.test21");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12548);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12549);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12550);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12551);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12552);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12553);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12554);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12555);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12556);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12557);boolean boolean13 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12558);java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12559);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12560);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12561);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12562);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12563);org.junit.Assert.assertNotNull(wildcardClass14);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test22() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dl6zr9p0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dl6zr9p0() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12564);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12565);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12566)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12567)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12568);System.out.format("%n%s%n", "RegressionTest0.test22");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12569);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12570);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12571);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12572);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12573);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12574);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12575);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12576);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12577);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12578);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12579);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12580);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12581);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12582);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12583);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12584);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12585);org.jboss.netty.channel.Channel channel23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12586);java.net.SocketAddress socketAddress24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12587);boolean boolean26 = aquilaProtocolDecoder1.identify("", channel23, socketAddress24, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12588);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12589);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12590);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12591);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12592);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12593);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12594);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12595);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test23() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_214l87a9pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_214l87a9pw() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12596);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12597);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12598)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12599)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12600);System.out.format("%n%s%n", "RegressionTest0.test23");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12601);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12602);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12603);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12604);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12605);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12606);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12607);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12608);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12609);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12610);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12611);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12612);boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12613);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12614);org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12615);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12616);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext17, channelEvent18);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12617);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12618);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12619);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12620);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12621);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test24() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224eql79qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224eql79qm() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12622);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12623);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12624)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12625)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12626);System.out.format("%n%s%n", "RegressionTest0.test24");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12627);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12628);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12629);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12630);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12631);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12632);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12633);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12634);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12635);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12636);boolean boolean13 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12637);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12638);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12639);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12640);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test25() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25depdo9r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12641,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25depdo9r5() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12641);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12642);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12643)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12644)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12645);System.out.format("%n%s%n", "RegressionTest0.test25");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12646);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12647);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12648);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test26() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28meo659rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28meo659rd() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12649);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12650);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12651)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12652)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12653);System.out.format("%n%s%n", "RegressionTest0.test26");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12654);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12655);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12656);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12657);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12658);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12659);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12660);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12661);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12662);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12663);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12664);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12665);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12666);java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12667);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12668);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12669);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12670);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12671);org.junit.Assert.assertNotNull(wildcardClass17);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test27() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvemym9s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvemym9s0() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12672);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12673);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12674)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12675)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12676);System.out.format("%n%s%n", "RegressionTest0.test27");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12677);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12678);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12679);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12680);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12681);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12682);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12683);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12684);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12685);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12686);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12687);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12688);java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12689);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12690);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12691);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12692);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12693);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test28() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4elr39sm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test28",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4elr39sm() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12694);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12695);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12696)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12697)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12698);System.out.format("%n%s%n", "RegressionTest0.test28");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12699);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12700);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12701);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12702);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12703);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12704);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12705);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12706);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12707);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12708);boolean boolean12 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12709);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12710);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12711);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12712);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12713);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12714);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12715);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12716);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test29() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2idekjk9t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test29",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2idekjk9t9() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12717);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12718);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12719)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12720)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12721);System.out.format("%n%s%n", "RegressionTest0.test29");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12722);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12723);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12724);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12725);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12726);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12727);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12728);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12729);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12730);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12731);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12732);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12733);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12734);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12735);java.net.SocketAddress socketAddress19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12736);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12737);org.jboss.netty.channel.Channel channel23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12738);java.net.SocketAddress socketAddress24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12739);boolean boolean25 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12740);boolean boolean26 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12741);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12742);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12743);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12744);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12745);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12746);org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12747);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test30() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu9ryu9u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test30",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu9ryu9u4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12748);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12749);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12750)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12751)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12752);System.out.format("%n%s%n", "RegressionTest0.test30");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12753);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12754);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12755);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12756);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12757);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12758);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12759);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12760);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12761);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12762);java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12763);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12764);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12765);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12766);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test31() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m39qrb9un();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test31",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m39qrb9un() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12767);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12768);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12769)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12770)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12771);System.out.format("%n%s%n", "RegressionTest0.test31");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12772);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12773);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12774);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12775);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12776);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12777);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12778);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12779);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12780);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12781);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12782);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12783);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12784);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12785);java.net.SocketAddress socketAddress19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12786);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12787);org.jboss.netty.channel.Channel channel23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12788);java.net.SocketAddress socketAddress24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12789);boolean boolean25 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12790);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12791);java.lang.String str26 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12792);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12793);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12794);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12795);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12796);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12797);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12798);org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test32() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pc9pjs9vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test32",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pc9pjs9vj() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12799);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12800);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12801)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12802)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12803);System.out.format("%n%s%n", "RegressionTest0.test32");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12804);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12805);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12806);java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12807);org.junit.Assert.assertNotNull(wildcardClass2);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test33() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl9oc99vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test33",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl9oc99vs() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12808);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12809);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12810)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12811)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12812);System.out.format("%n%s%n", "RegressionTest0.test33");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12813);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12814);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12815);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12816);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12817);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12818);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12819);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12820);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12821);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12822);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12823);java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12824);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12825);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12826);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12827);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test34() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu9n4q9wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu9n4q9wc() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12828);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12829);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12830)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12831)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12832);System.out.format("%n%s%n", "RegressionTest0.test34");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12833);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12834);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12835);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12836);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12837);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12838);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12839);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12840);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12841);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12842);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12843);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12844);java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12845);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12846);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12847);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12848);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12849);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12850);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test35() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z39lx79wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test35",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z39lx79wz() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12851);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12852);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12853)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12854)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12855);System.out.format("%n%s%n", "RegressionTest0.test35");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12856);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12857);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12858);org.jboss.netty.channel.Channel channel3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12859);java.net.SocketAddress socketAddress4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12860);boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12861);boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12862);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12863);boolean boolean10 = aquilaProtocolDecoder1.identify("hi!", channel9);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12864);long long11 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12865);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12866);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12867);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12868);org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test36() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wouh9g9xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test36",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wouh9g9xh() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12869);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12870);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12871)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12872)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12873);System.out.format("%n%s%n", "RegressionTest0.test36");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12874);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12875);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12876);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12877);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12878);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12879);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12880);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12881);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12882);java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12883);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12884);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12885);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12886);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test37() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfuigz9xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test37",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12887,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfuigz9xz() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12887);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12888);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12889)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12890)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12891);System.out.format("%n%s%n", "RegressionTest0.test37");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12892);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12893);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12894);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12895);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12896);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12897);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12898);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12899);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12900);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12901);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12902);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12903);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12904);long long17 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12905);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12906);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12907);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12908);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12909);org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test38() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6ujoi9ym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test38",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6ujoi9ym() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12910);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12911);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12912)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12913)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12914);System.out.format("%n%s%n", "RegressionTest0.test38");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12915);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12916);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12917);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12918);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12919);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12920);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12921);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12922);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12923);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12924);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12925);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12926);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12927);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12928);java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12929);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12930);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12931);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12932);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12933);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12934);org.junit.Assert.assertNotNull(wildcardClass18);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test39() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mxukw19zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mxukw19zb() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12935);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12936);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12937)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12938)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12939);System.out.format("%n%s%n", "RegressionTest0.test39");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12940);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12941);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12942);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12943);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12944);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12945);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12946);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12947);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12948);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12949);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12950);boolean boolean14 = aquilaProtocolDecoder1.identify("hi!", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12951);java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12952);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12953);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12954);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12955);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12956);org.junit.Assert.assertNotNull(wildcardClass15);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test40() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgzdgr9zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test40",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgzdgr9zx() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12957);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12958);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12959)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12960)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12961);System.out.format("%n%s%n", "RegressionTest0.test40");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12962);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12963);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12964);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12965);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12966);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12967);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12968);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12969);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12970);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12971);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12972);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12973);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12974);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12975);java.net.SocketAddress socketAddress19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12976);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12977);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12978);org.jboss.netty.channel.ChannelEvent channelEvent23 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12979);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12980);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext22, channelEvent23);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12981);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12982);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12983);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12984);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12985);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12986);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test41() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),12987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7zeoaa0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test41",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12987,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7zeoaa0r() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(12987);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12988);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(12989)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(12990)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(12991);System.out.format("%n%s%n", "RegressionTest0.test41");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(12992);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12993);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12994);org.jboss.netty.channel.Channel channel3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12995);java.net.SocketAddress socketAddress4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12996);boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(12997);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12998);java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(12999);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13000);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test42() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyzfvta15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test42",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyzfvta15() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13001);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13002);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13003)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13004)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13005);System.out.format("%n%s%n", "RegressionTest0.test42");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13006);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13007);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13008);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13009);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13010);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13011);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13012);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13013);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13014);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13015);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13016);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13017);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13018);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13019);boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13020);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13021);org.jboss.netty.channel.ChannelEvent channelEvent21 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13022);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13023);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext20, channelEvent21);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13024);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13025);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13026);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13027);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13028);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13029);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test43() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpzh3ca1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test43",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpzh3ca1y() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13030);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13031);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13032)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13033)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13034);System.out.format("%n%s%n", "RegressionTest0.test43");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13035);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13036);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13037);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13038);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13039);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13040);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13041);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13042);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13043);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13044);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13045);org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13046);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13047);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext12, channelEvent13);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13048);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13049);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13050);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13051);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13052);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test44() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gziava2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test44",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gziava2l() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13053);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13054);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13055)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13056)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13057);System.out.format("%n%s%n", "RegressionTest0.test44");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13058);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13059);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13060);org.jboss.netty.channel.Channel channel3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13061);java.net.SocketAddress socketAddress4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13062);boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13063);boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13064);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13065);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13066);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13067);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test45() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267zjiea30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test45",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267zjiea30() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13068);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13069);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13070)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13071)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13072);System.out.format("%n%s%n", "RegressionTest0.test45");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13073);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13074);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13075);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13076);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13077);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13078);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13079);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13080);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13081);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13082);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13083);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13084);boolean boolean15 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13085);long long16 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13086);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13087);boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13088);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13089);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13090);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13091);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13092);org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13093);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test46() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yzkpxa3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test46",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yzkpxa3q() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13094);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13095);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13096)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13097)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13098);System.out.format("%n%s%n", "RegressionTest0.test46");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13099);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13100);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13101);org.jboss.netty.channel.Channel channel3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13102);java.net.SocketAddress socketAddress4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13103);boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13104);org.jboss.netty.channel.Channel channel8 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13105);java.net.SocketAddress socketAddress9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13106);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel8, socketAddress9, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13107);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13108);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test47() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0e2ka45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0e2ka45() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13109);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13110);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13111)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13112)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13113);System.out.format("%n%s%n", "RegressionTest0.test47");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13114);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13115);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13116);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13117);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13118);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13119);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13120);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13121);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13122);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13123);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13124);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13125);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13126);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13127);java.net.SocketAddress socketAddress19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13128);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13129);org.jboss.netty.channel.Channel channel23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13130);java.net.SocketAddress socketAddress24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13131);boolean boolean26 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13132);java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13133);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13134);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13135);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13136);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13137);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13138);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13139);org.junit.Assert.assertNotNull(wildcardClass27);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test48() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23j0cv1a50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test48",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23j0cv1a50() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13140);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13141);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13142)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13143)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13144);System.out.format("%n%s%n", "RegressionTest0.test48");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13145);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13146);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13147);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13148);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13149);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13150);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13151);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13152);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13153);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13154);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13155);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13156);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13157);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13158);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13159);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13160);java.net.SocketAddress socketAddress21 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13161);boolean boolean22 = aquilaProtocolDecoder1.identify("", channel20, socketAddress21);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13162);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13163);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13164);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13165);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13166);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13167);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13168);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test49() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s0bnia5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test49",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s0bnia5t() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13169);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13170);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13171)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13172)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13173);System.out.format("%n%s%n", "RegressionTest0.test49");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13174);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13175);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13176);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13177);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13178);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13179);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13180);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13181);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13182);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13183);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13184);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13185);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13186);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13187);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13188);java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13189);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13190);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13191);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13192);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13193);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13194);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13195);org.junit.Assert.assertNotNull(wildcardClass19);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test50() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278vj2sa6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test50",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278vj2sa6k() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13196);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13197);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13198)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13199)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13200);System.out.format("%n%s%n", "RegressionTest0.test50");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13201);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13202);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13203);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13204);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13205);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13206);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13207);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13208);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13209);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13210);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13211);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13212);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13213);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13214);org.jboss.netty.channel.Channel channel19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13215);java.net.SocketAddress socketAddress20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13216);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel19, socketAddress20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13217);boolean boolean22 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13218);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13219);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13220);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13221);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13222);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13223);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13224);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test51() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ahvhv9a7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test51",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ahvhv9a7d() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13225);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13226);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13227)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13228)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13229);System.out.format("%n%s%n", "RegressionTest0.test51");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13230);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13231);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13232);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13233);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13234);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13235);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13236);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13237);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13238);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13239);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13240);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13241);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13242);org.jboss.netty.channel.Channel channel19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13243);java.net.SocketAddress socketAddress20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13244);boolean boolean21 = aquilaProtocolDecoder1.identify("hi!", channel19, socketAddress20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13245);org.jboss.netty.channel.Channel channel23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13246);java.net.SocketAddress socketAddress24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13247);boolean boolean26 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13248);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13249);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13250);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13251);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13252);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13253);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test52() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqvgnqa86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test52",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqvgnqa86() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13254);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13255);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13256)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13257)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13258);System.out.format("%n%s%n", "RegressionTest0.test52");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13259);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13260);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13261);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13262);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13263);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13264);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13265);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13266);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13267);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13268);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13269);long long13 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13270);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13271);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13272);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13273);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13274);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13275);org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test53() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzvfg7a8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test53",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzvfg7a8s() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13276);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13277);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13278)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13279)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13280);System.out.format("%n%s%n", "RegressionTest0.test53");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13281);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13282);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13283);org.jboss.netty.channel.Channel channel3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13284);java.net.SocketAddress socketAddress4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13285);boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13286);boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13287);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13288);boolean boolean10 = aquilaProtocolDecoder1.identify("hi!", channel9);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13289);org.jboss.netty.channel.Channel channel12 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13290);java.net.SocketAddress socketAddress13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13291);boolean boolean15 = aquilaProtocolDecoder1.identify("hi!", channel12, socketAddress13, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13292);boolean boolean16 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13293);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13294);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13295);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13296);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13297);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test54() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8ve8oa9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test54",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8ve8oa9e() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13298);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13299);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13300)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13301)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13302);System.out.format("%n%s%n", "RegressionTest0.test54");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13303);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13304);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13305);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13306);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13307);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13308);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13309);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13310);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13311);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13312);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13313);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13314);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13315);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13316);boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13317);java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13318);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13319);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13320);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13321);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13322);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13323);org.junit.Assert.assertNotNull(wildcardClass20);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test55() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvd15aa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test55",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvd15aa4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13324);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13325);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13326)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13327)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13328);System.out.format("%n%s%n", "RegressionTest0.test55");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13329);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13330);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13331);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13332);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13333);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13334);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13335);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13336);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13337);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13338);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13339);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13340);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13341);boolean boolean18 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13342);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13343);java.net.SocketAddress socketAddress21 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13344);boolean boolean22 = aquilaProtocolDecoder1.identify("", channel20, socketAddress21);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13345);org.jboss.netty.channel.Channel channel24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13346);boolean boolean25 = aquilaProtocolDecoder1.identify("hi!", channel24);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13347);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13348);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13349);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13350);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13351);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13352);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13353);org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test56() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqvbtmaay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test56",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqvbtmaay() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13354);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13355);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13356)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13357)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13358);System.out.format("%n%s%n", "RegressionTest0.test56");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13359);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13360);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13361);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13362);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13363);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13364);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13365);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13366);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13367);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13368);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13369);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13370);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13371);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13372);org.jboss.netty.channel.Channel channel19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13373);java.net.SocketAddress socketAddress20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13374);boolean boolean22 = aquilaProtocolDecoder1.identify("", channel19, socketAddress20, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13375);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13376);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13377);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13378);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13379);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13380);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test57() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzvam3abp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test57",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzvam3abp() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13381);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13382);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13383)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13384)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13385);System.out.format("%n%s%n", "RegressionTest0.test57");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13386);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13387);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13388);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13389);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13390);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13391);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13392);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13393);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13394);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13395);long long12 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13396);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13397);org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13398);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13399);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext13, channelEvent14);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13400);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13401);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13402);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13403);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13404);org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test58() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8v9ekacd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test58",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8v9ekacd() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13405);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13406);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13407)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13408)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13409);System.out.format("%n%s%n", "RegressionTest0.test58");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13410);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13411);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13412);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13413);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13414);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13415);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13416);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13417);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13418);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13419);boolean boolean13 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11, true);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13420);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13421);java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13422);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13423);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13424);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13425);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13426);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test59() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yj8ts3acz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test59",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yj8ts3acz() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13427);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13428);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13429)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13430)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13431);System.out.format("%n%s%n", "RegressionTest0.test59");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13432);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13433);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13434);org.jboss.netty.channel.Channel channel3 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13435);java.net.SocketAddress socketAddress4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13436);boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13437);boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13438);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13439);boolean boolean10 = aquilaProtocolDecoder1.identify("hi!", channel9);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13440);org.jboss.netty.channel.Channel channel12 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13441);boolean boolean13 = aquilaProtocolDecoder1.identify("", channel12);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13442);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13443);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13444);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13445);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test60() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2dmctadi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test60",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2dmctadi() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13446);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13447);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13448)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13449)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13450);System.out.format("%n%s%n", "RegressionTest0.test60");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13451);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13452);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13453);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13454);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13455);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13456);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13457);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13458);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13459);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13460);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13461);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13462);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13463);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13464);boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13465);long long20 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13466);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13467);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13468);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13469);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13470);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13471);org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test61() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utdnkcae8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test61",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utdnkcae8() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13472);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13473);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13474)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13475)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13476);System.out.format("%n%s%n", "RegressionTest0.test61");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13477);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13478);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13479);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13480);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13481);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13482);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13483);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13484);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13485);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13486);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13487);boolean boolean13 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13488);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13489);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13490);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13491);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13492);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13493);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test62() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkdorvaeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test62",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkdorvaeu() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13494);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13495);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13496)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13497)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13498);System.out.format("%n%s%n", "RegressionTest0.test62");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13499);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13500);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13501);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13502);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13503);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13504);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13505);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13506);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13507);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13508);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13509);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13510);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13511);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13512);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13513);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13514);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13515);long long22 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13516);long long23 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13517);org.jboss.netty.channel.Channel channel25 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13518);boolean boolean26 = aquilaProtocolDecoder1.identify("", channel25);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13519);org.jboss.netty.channel.Channel channel28 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13520);java.net.SocketAddress socketAddress29 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13521);boolean boolean31 = aquilaProtocolDecoder1.identify("", channel28, socketAddress29, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13522);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13523);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13524);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13525);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13526);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13527);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13528);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13529);org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13530);org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13531);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13532);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test63() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obdpzeafx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test63",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obdpzeafx() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13533);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13534);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13535)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13536)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13537);System.out.format("%n%s%n", "RegressionTest0.test63");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13538);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13539);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13540);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13541);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13542);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13543);boolean boolean6 = aquilaProtocolDecoder1.identify("hi!", channel4, socketAddress5);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13544);boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13545);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13546);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13547);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13548);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13549);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test64() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2dr6xage();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test64",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2dr6xage() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13550);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13551);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13552)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13553)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13554);System.out.format("%n%s%n", "RegressionTest0.test64");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13555);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13556);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13557);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13558);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13559);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13560);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13561);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13562);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13563);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13564);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13565);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13566);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13567);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13568);org.jboss.netty.channel.Channel channel19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13569);boolean boolean20 = aquilaProtocolDecoder1.identify("", channel19);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13570);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13571);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13572);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13573);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13574);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13575);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test65() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htdsegah4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test65",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htdsegah4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13576);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13577);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13578)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13579)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13580);System.out.format("%n%s%n", "RegressionTest0.test65");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13581);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13582);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13583);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13584);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13585);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13586);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13587);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13588);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13589);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13590);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13591);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13592);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13593);org.jboss.netty.channel.Channel channel19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13594);java.net.SocketAddress socketAddress20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13595);boolean boolean21 = aquilaProtocolDecoder1.identify("hi!", channel19, socketAddress20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13596);long long22 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13597);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13598);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13599);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13600);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13601);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13602);org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test66() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekdtlzahv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test66",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekdtlzahv() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13603);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13604);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13605)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13606)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13607);System.out.format("%n%s%n", "RegressionTest0.test66");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13608);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13609);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13610);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13611);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13612);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13613);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13614);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13615);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13616);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13617);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13618);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13619);boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13620);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13621);java.net.SocketAddress socketAddress19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13622);boolean boolean21 = aquilaProtocolDecoder1.identify("hi!", channel18, socketAddress19, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13623);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13624);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13625);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13626);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13627);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test67() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbdutiaik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test67",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbdutiaik() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13628);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13629);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13630)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13631)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13632);System.out.format("%n%s%n", "RegressionTest0.test67");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13633);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13634);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13635);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13636);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13637);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13638);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13639);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13640);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13641);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13642);boolean boolean13 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13643);boolean boolean14 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13644);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13645);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13646);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13647);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13648);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test68() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282dw11aj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test68",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282dw11aj5() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13649);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13650);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13651)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13652)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13653);System.out.format("%n%s%n", "RegressionTest0.test68");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13654);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13655);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13656);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13657);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13658);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13659);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13660);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13661);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13662);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13663);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13664);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13665);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13666);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13667);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13668);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13669);java.net.SocketAddress socketAddress21 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13670);boolean boolean23 = aquilaProtocolDecoder1.identify("hi!", channel20, socketAddress21, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13671);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13672);org.jboss.netty.channel.ChannelEvent channelEvent25 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13673);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13674);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext24, channelEvent25);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13675);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13676);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13677);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13678);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13679);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13680);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13681);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13682);org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test69() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24tdx8kak3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test69",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24tdx8kak3() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13683);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13684);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13685)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13686)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13687);System.out.format("%n%s%n", "RegressionTest0.test69");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13688);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13689);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13690);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13691);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13692);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13693);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13694);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13695);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13696);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13697);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13698);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13699);boolean boolean15 = aquilaProtocolDecoder1.identify("hi!", channel14);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13700);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13701);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13702);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13703);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13704);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test70() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ciptaakp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test70",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ciptaakp() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13705);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13706);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13707)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13708)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13709);System.out.format("%n%s%n", "RegressionTest0.test70");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13710);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13711);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13712);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13713);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13714);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13715);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13716);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13717);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13718);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13719);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13720);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13721);boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13722);org.jboss.netty.channel.Channel channel18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13723);boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13724);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13725);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13726);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13727);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13728);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test71() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_213ir0tald();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test71",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_213ir0tald() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13729);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13730);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13731)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13732)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13733);System.out.format("%n%s%n", "RegressionTest0.test71");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13734);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13735);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13736);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13737);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13738);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13739);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13740);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13741);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13742);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13743);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13744);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13745);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13746);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13747);org.jboss.netty.channel.Channel channel19 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13748);java.net.SocketAddress socketAddress20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13749);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel19, socketAddress20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13750);org.jboss.netty.channel.Channel channel23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13751);boolean boolean24 = aquilaProtocolDecoder1.identify("", channel23);
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13752);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13753);java.lang.String str25 = aquilaProtocolDecoder1.getProtocolName();
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13754);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13755);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13756);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13757);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13758);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13759);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13760);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13761);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test72() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_225h7roama();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test72",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_225h7roama() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13762);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13763);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13764)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13765)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13766);System.out.format("%n%s%n", "RegressionTest0.test72");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13767);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13768);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13769);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13770);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13771);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13772);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13773);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13774);long long9 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13775);org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13776);org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13777);try {
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13778);aquilaProtocolDecoder1.handleUpstream(channelHandlerContext10, channelEvent11);
            __CLR4_5_29dd9ddlx1e46bw.R.inc(13779);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13780);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13781);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13782);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13783);org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test73() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25eh6k5amw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test73",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25eh6k5amw() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13784);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13785);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13786)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13787)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13788);System.out.format("%n%s%n", "RegressionTest0.test73");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13789);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13790);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13791);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13792);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13793);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13794);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13795);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13796);boolean boolean9 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13797);boolean boolean10 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13798);boolean boolean11 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13799);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13800);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13801);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13802);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13803);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13804);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test74() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28nh5cmanh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test74",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28nh5cmanh() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13805);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13806);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13807)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13808)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13809);System.out.format("%n%s%n", "RegressionTest0.test74");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13810);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13811);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13812);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13813);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13814);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13815);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13816);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13817);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13818);boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13819);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13820);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13821);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13822);boolean boolean18 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13823);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13824);java.net.SocketAddress socketAddress21 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13825);boolean boolean23 = aquilaProtocolDecoder1.identify("hi!", channel20, socketAddress21, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13826);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13827);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13828);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13829);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13830);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13831);org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test75() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bwh453ao8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test75",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bwh453ao8() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13832);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13833);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13834)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13835)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13836);System.out.format("%n%s%n", "RegressionTest0.test75");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13837);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13838);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13839);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13840);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13841);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13842);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13843);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13844);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13845);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13846);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13847);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13848);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13849);boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13850);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13851);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13852);boolean boolean21 = aquilaProtocolDecoder1.identify("", channel20);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13853);java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13854);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13855);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13856);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13857);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13858);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13859);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13860);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13861);org.junit.Assert.assertNotNull(wildcardClass22);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test76() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5h2xkap2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test76",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5h2xkap2() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13862);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13863);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13864)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13865)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13866);System.out.format("%n%s%n", "RegressionTest0.test76");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13867);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13868);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13869);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13870);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13871);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13872);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13873);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13874);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13875);boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13876);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13877);java.net.SocketAddress socketAddress14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13878);boolean boolean15 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13879);org.jboss.netty.channel.Channel channel17 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13880);java.net.SocketAddress socketAddress18 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13881);boolean boolean20 = aquilaProtocolDecoder1.identify("hi!", channel17, socketAddress18, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13882);org.jboss.netty.channel.Channel channel22 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13883);java.net.SocketAddress socketAddress23 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13884);boolean boolean24 = aquilaProtocolDecoder1.identify("hi!", channel22, socketAddress23);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13885);org.jboss.netty.channel.Channel channel26 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13886);boolean boolean27 = aquilaProtocolDecoder1.identify("", channel26);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13887);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13888);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13889);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13890);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13891);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13892);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13893);org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test77() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ieh1q1apy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test77",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ieh1q1apy() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13894);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13895);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13896)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13897)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13898);System.out.format("%n%s%n", "RegressionTest0.test77");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13899);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13900);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13901);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13902);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13903);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13904);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13905);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13906);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13907);java.net.SocketAddress socketAddress11 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13908);boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13909);org.jboss.netty.channel.Channel channel15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13910);java.net.SocketAddress socketAddress16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13911);boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13912);long long18 = aquilaProtocolDecoder1.getDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13913);org.jboss.netty.channel.Channel channel20 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13914);java.net.SocketAddress socketAddress21 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13915);boolean boolean23 = aquilaProtocolDecoder1.identify("", channel20, socketAddress21, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13916);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13917);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13918);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13919);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13920);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13921);org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13922);org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test78() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnh0iiaqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test78",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnh0iiaqr() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13923);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13924);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13925)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13926)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13927);System.out.format("%n%s%n", "RegressionTest0.test78");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13928);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13929);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13930);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13931);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13932);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13933);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13934);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13935);boolean boolean9 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13936);boolean boolean10 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13937);java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13938);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13939);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13940);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13941);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13942);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13943);org.junit.Assert.assertNotNull(wildcardClass11);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test79() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owgzazarc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test79",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owgzazarc() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13944);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13945);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13946)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13947)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13948);System.out.format("%n%s%n", "RegressionTest0.test79");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13949);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13950);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13951);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13952);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13953);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13954);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13955);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13956);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13957);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13958);org.jboss.netty.channel.Channel channel13 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13959);boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13960);org.jboss.netty.channel.Channel channel16 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13961);java.net.SocketAddress socketAddress17 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13962);boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel16, socketAddress17, true);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13963);org.jboss.netty.channel.Channel channel21 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13964);java.net.SocketAddress socketAddress22 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13965);boolean boolean24 = aquilaProtocolDecoder1.identify("", channel21, socketAddress22, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13966);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13967);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13968);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13969);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13970);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13971);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test80() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pdc6q9as4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test80",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pdc6q9as4() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13972);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13973);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13974)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13975)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13976);System.out.format("%n%s%n", "RegressionTest0.test80");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13977);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13978);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13979);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13980);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13981);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13982);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13983);boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13984);org.jboss.netty.channel.Channel channel10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13985);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13986);java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13987);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13988);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13989);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13990);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13991);org.junit.Assert.assertNotNull(wildcardClass12);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}

    @Test
    public void test81() throws Throwable {__CLR4_5_29dd9ddlx1e46bw.R.globalSliceStart(getClass().getName(),13992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smc5iqaso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dd9ddlx1e46bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dd9ddlx1e46bw.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test81",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smc5iqaso() throws Throwable{try{__CLR4_5_29dd9ddlx1e46bw.R.inc(13992);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13993);if ((((debug)&&(__CLR4_5_29dd9ddlx1e46bw.R.iget(13994)!=0|true))||(__CLR4_5_29dd9ddlx1e46bw.R.iget(13995)==0&false)))
            {__CLR4_5_29dd9ddlx1e46bw.R.inc(13996);System.out.format("%n%s%n", "RegressionTest0.test81");
        }__CLR4_5_29dd9ddlx1e46bw.R.inc(13997);org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13998);org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(13999);boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14000);org.jboss.netty.channel.Channel channel4 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14001);java.net.SocketAddress socketAddress5 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14002);boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14003);org.jboss.netty.channel.Channel channel9 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14004);java.net.SocketAddress socketAddress10 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14005);boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14006);boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14007);org.jboss.netty.channel.Channel channel14 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14008);java.net.SocketAddress socketAddress15 = null;
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14009);boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14010);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14011);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14012);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14013);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_5_29dd9ddlx1e46bw.R.inc(14014);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }finally{__CLR4_5_29dd9ddlx1e46bw.R.flushNeeded();}}
}

