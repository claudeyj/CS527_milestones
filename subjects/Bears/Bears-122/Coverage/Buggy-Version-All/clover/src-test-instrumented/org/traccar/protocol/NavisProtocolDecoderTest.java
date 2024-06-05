/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

import org.junit.Test;

public class NavisProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kynkynlwydzt06{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,27175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kynkynlwydzt06.R.globalSliceStart(getClass().getName(),27167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kynkynlwydzt06.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kynkynlwydzt06.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.NavisProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkyn() throws Exception{try{__CLR4_5_2kynkynlwydzt06.R.inc(27167);

        __CLR4_5_2kynkynlwydzt06.R.inc(27168);NavisProtocolDecoder decoder = new NavisProtocolDecoder(new NavisProtocol());

        __CLR4_5_2kynkynlwydzt06.R.inc(27169);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404E5443010000007B000000130044342A3E533A383631373835303035323035303739"));

        __CLR4_5_2kynkynlwydzt06.R.inc(27170);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404e5443010000000000000059009adb2a3e54250000000000ff1500040b0a1008291838001200760ee600000000000000000000000f1500040b0a10ac20703fb1aec23f00000000320149668f430000000000000000000000000000000000000000000000f3808080"),
                position("2016-11-11 21:00:04.000", true, 53.74336, 87.14437));

        __CLR4_5_2kynkynlwydzt06.R.inc(27171);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404e544300000000040000005a00c6812a3e410125e3a60700011705071503011030210c0000fa200910e6000000000000000000000001082106150010ae97643f88a39f3f0000000090001fcc6c450000000000000000000000000000000000000000000000f6808080"));

        __CLR4_5_2kynkynlwydzt06.R.inc(27172);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404e544301000000000000005a002e6c2a3e410125d7540100001512233a0b0a0f08026300000a000b000b00020000000000000000000c12233b0b0a0f03fd6d3f0fde603f00000000ba0051e0c845000000000000000000000000000000000000000000000080808080"));

        __CLR4_5_2kynkynlwydzt06.R.inc(27173);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404E5443010000007B0000005A0050692A3E410125DB0E00000015110707110A0C0880630000AA39A2381600020000000000000000000C110708110A0CB389793F1AEF263F00000000120034F516440000000000000000000000FAFF000000FAFF000000FAFF80808080"));

        __CLR4_5_2kynkynlwydzt06.R.inc(27174);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404E5443010000007B000000130047372A3E533A383631373835303035313236303639"));

    }finally{__CLR4_5_2kynkynlwydzt06.R.flushNeeded();}}

}
