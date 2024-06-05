/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class GranitFrameDecoderTest extends ProtocolTest {static class __CLR4_5_2iocioclx1dwmxy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,24213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iocioclx1dwmxy.R.globalSliceStart(getClass().getName(),24204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehioc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iocioclx1dwmxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iocioclx1dwmxy.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GranitFrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24204,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehioc() throws Exception{try{__CLR4_5_2iocioclx1dwmxy.R.inc(24204);

        __CLR4_5_2iocioclx1dwmxy.R.inc(24205);GranitFrameDecoder decoder = new GranitFrameDecoder();

        __CLR4_5_2iocioclx1dwmxy.R.inc(24206);Assert.assertEquals(
                binary("2b525243427e1a003e2934757c57b8b03c38d279b4e61e9bd7006b000000001c00002a4533"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "2b525243427e1a003e2934757c57b8b03c38d279b4e61e9bd7006b000000001c00002a45330d0a")));

        __CLR4_5_2iocioclx1dwmxy.R.inc(24207);Assert.assertEquals(
                binary("2b525243427e1a000d0a34757c57b8b03c38d279b4e61e9bd7006b000000001c00002a4533"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "2b525243427e1a000d0a34757c57b8b03c38d279b4e61e9bd7006b000000001c00002a45330d0a")));

        __CLR4_5_2iocioclx1dwmxy.R.inc(24208);Assert.assertEquals(
                binary("4f4b"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "4f4b0d0a2b525243427e1a000d0a34757c57b8b03c38d279b4e61e9bd7006b000000001c00002a45330d0a")));

        __CLR4_5_2iocioclx1dwmxy.R.inc(24209);Assert.assertEquals(
                binary("2b444441547e84003e290401d01690737c57b8903c383c7fa0e5081b64006b000000001c0000b8803c388e7fe7e5102197006c000000001c0000b8813c38ad7f02e6042035006c000000001d0000b8813c38bf7f13e6001d1e006c000000001d0000b8813c38bf7f13e6001d00006c000000001d0000b8903c38977f34e6091065006c000000001e000014002a3932"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN,
                        "2b444441547e84003e290401d01690737c57b8903c383c7fa0e5081b64006b000000001c0000b8803c388e7fe7e5102197006c000000001c0000b8813c38ad7f02e6042035006c000000001d0000b8813c38bf7f13e6001d1e006c000000001d0000b8813c38bf7f13e6001d00006c000000001d0000b8903c38977f34e6091065006c000000001e000014002a39320d0a")));

        __CLR4_5_2iocioclx1dwmxy.R.inc(24210);Assert.assertEquals(
                binary("2b444441547e84003e290401d41680747c57f8a03c38987f50e6005300006c000000001c0000f8b03c38987f50e6005300006c000000001c0000fefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefe14002a4346"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN,
                        "2b444441547e84003e290401d41680747c57f8a03c38987f50e6005300006c000000001c0000f8b03c38987f50e6005300006c000000001c0000fefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefefe14002a43460d0a")));

        __CLR4_5_2iocioclx1dwmxy.R.inc(24211);Assert.assertEquals(
                binary("2b49444e543a204e6176696761746f722e30347820204669726d776172652076657273696f6e202030373132474c4e202a3231"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "2b49444e543a204e6176696761746f722e30347820204669726d776172652076657273696f6e202030373132474c4e202a32310d0a")));

        __CLR4_5_2iocioclx1dwmxy.R.inc(24212);Assert.assertEquals(
                binary("4552524f522057524f4e4720434845434b53554d5f31"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "4552524f522057524f4e4720434845434b53554d5f310d0a")));

    }finally{__CLR4_5_2iocioclx1dwmxy.R.flushNeeded();}}

}
