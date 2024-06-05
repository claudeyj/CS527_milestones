/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AstraProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2icmicmlx1dzdxq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,23787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2icmicmlx1dzdxq.R.globalSliceStart(getClass().getName(),23782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehicm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2icmicmlx1dzdxq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2icmicmlx1dzdxq.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AstraProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23782,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehicm() throws Exception{try{__CLR4_5_2icmicmlx1dzdxq.R.inc(23782);

        __CLR4_5_2icmicmlx1dzdxq.R.inc(23783);AstraProtocolDecoder decoder = new AstraProtocolDecoder(new AstraProtocol());

        __CLR4_5_2icmicmlx1dzdxq.R.inc(23784);verifyPositions(decoder, binary(
                "4b00700529c0c265976b8202cba9ff00676d864554a9c30000000020073401006436000300030008000000000000a0000100001920c43d00009600428302cba9ff00676d864554aa3e000000002007240100643b000300020008000000000000b0000100001920c43d00009600420f0e"));

        __CLR4_5_2icmicmlx1dzdxq.R.inc(23785);verifyPositions(decoder, binary(
                "4b00320524c1da58769e6d0322617effe874024453065600a800000100080000643e0000000000000000000000069500e7bb"));

        __CLR4_5_2icmicmlx1dzdxq.R.inc(23786);verifyPositions(decoder, binary(
                "4b013c02213aec35c501ad031368b8ffcd1ad043e5c4500c79000100003101005c490c001c0009020200020015069600ae03136801ffcd1af143e5c452125e000100003101005c491200090011010000020015068500af0313629effcd1f4b43e5c45d1e46000100003101005c491e00080409040500040015068700b0031359d5ffcd35ad43e5c47b2a3b000001003101005c492a1b1a0d0b0f0b00080015068700b103134984ffcd4b1e43e5c4913354000100003101005c49340b0103090606000f0015067700b203132e1affcd5a5a43e5c4af3348000001003101005c4935070a08000a070017001505f700b30313192cffcd7af143e5c4cd3733000001003101005c4937091206050a0800200015058600b403130debffcda88743e5c4eb2c3e000001003101005c493707030601080600290015058600b377"));

    }finally{__CLR4_5_2icmicmlx1dzdxq.R.flushNeeded();}}

}
