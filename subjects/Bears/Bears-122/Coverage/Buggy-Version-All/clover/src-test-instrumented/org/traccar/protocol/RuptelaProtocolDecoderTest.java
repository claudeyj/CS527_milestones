/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class RuptelaProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l2tl2tlwydzt1b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,27330,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l2tl2tlwydzt1b.R.globalSliceStart(getClass().getName(),27317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l2tl2tlwydzt1b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l2tl2tlwydzt1b.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.RuptelaProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl2t() throws Exception{try{__CLR4_5_2l2tl2tlwydzt1b.R.inc(27317);

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27318);RuptelaProtocolDecoder decoder = new RuptelaProtocolDecoder(new RuptelaProtocol());

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27319);verifyNull(decoder, binary(
                "002e000315bc70d3e2ff0f4f42443130302e30312e30382e30300000c2b30ea77e430000601b000001f40000003c00144aa0"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27320);verifyAttributes(decoder, binary(
                "0011000315A07F440B1D07534554494f20636f6e66696775726174696f6e2064617461206f6b341C"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27321);verifyAttributes(decoder, binary(
                "0044000313612d76c5cb0744494e313d312c44494e323d302c44494e333d302c44494e343d302c444f5554313d312c444f5554323d312c41494e313d31372c41494e323d3236ac80"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27322);verifyPositions(decoder, binary(
                "000B00000B1A29F64B1A0902FF4E9CAF2C07D608F11A1480BA015030303130FF4E9CAF2C07D608F11A1480BA0250303031318C91"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27323);verifyPositions(decoder, binary(
                "01a4000315bc70f9b69244000458068f4a0030000d11398a1c0c19fd056524040b000c0a00090c0005010031f40032fd0033f200ce47002400002500001c010199000195010196010086000900aa0000001e0ff000d3ffff0043ffff01930000019200000194000002220000022300000200300000000200af000e872401008e000000000000000058068f4a0031000d11398a1c0c19fd056524040b000c0a00090400870000880000a90000820010008b0002021e0000021f0000021d0000021c0000022400000225000000890000008505f00220000002210000008300000084000002260000022700000228000003008a00000000008d00000000008c000000000058068f4a0032000d11398a1c0c19fd056524040b000c0a000905019f01005800001b1f00ad0000cfb10b02290000022a0000022b0000022c0000022d00000012000000130000001d367400c52f8000740055023e0502060097000000000096000058520041007746cb00d0000003f1005c0007c21b0072001864880058068f4a0033000d11398a1c0c19fd056524040b000c0a000900000001008e0000000000000000e815"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27324);verifyPositions(decoder, binary(
                "033d000315bc70f9b69244000858068f3b0030010d11354e1c0c17a5055d54560c00000900050c0005010031f30032fb0033f300ce00002400002500001c010199000195010196010086000900aa0000001e0ff300d3ffff0043ffff01930000019200000194000002220000022300000200300000000000af000e872401008e000000000000000058068f3b0031010d11354e1c0c17a5055d54560c00000900050400870000880000a90000820010008b0000021e0000021f0000021d0000021c0000022400000225000000890000008500000220000002210000008300000084000002260000022700000228000003008a00000000008d00000000008c000000000058068f3b0032010d11354e1c0c17a5055d54560c000009000505019f01005800001b1f00ad0000cfac0b02290000022a0000022b0000022c0000022d00000012000000130000001d31b100c5000000740000023e0502060097000000000096000058520041007746be00d0000003f1005c0007c2150072001864880058068f3b0033010d11354e1c0c17a5055d54560c000009000500000001008e000000000000000058068f3b0130000d11354e1c0c17a5055d54560d00000900070c0005010031f30032fb0033f300ce00002400002500001c010199000195010196010086000900aa0000001e0ff300d3ffff0043ffff01930000019200000194000002220000022300000200300000000000af000e872401008e000000000000000058068f3b0131000d11354e1c0c17a5055d54560d00000900070400870000880000a90000820010008b0000021e0000021f0000021d0000021c0000022400000225000000890000008500000220000002210000008300000084000002260000022700000228000003008a00000000008d00000000008c000000000058068f3b0132000d11354e1c0c17a5055d54560d000009000705019f01005800001b1f00ad0000cfac0b02290000022a0000022b0000022c0000022d00000012000000130000001d31ae00c5000000740000023e0502060097000000000096000058520041007746be00d0000003f1005c0007c2150072001864880058068f3b0133000d11354e1c0c17a5055d54560d000009000700000001008e0000000000000000084d"));
        
        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27325);verifyPositions(decoder, binary(
                "0050000310f5615f419c0100015613d8ed0000fff5b37a035af37801e700000900000d07071b0c020003001c01202cad000500064302a81d33e61e100116317cd3ffff174ad60241000077fa960000f232003c2e"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27326);verifyPositions(decoder, binary(
                "00560003116e7438a7a50100015565cbb9000020fd21300f113f4600005f000600090d090805011b13cf00020003001c012029ad00041d31dd1e0ebd160000c50000047200000000d0000000004100016a2a960000a5a300c9ee"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27327);verifyPositions(decoder, binary(
                "00a10003116e7438a7a5010002553dddbe000020fddaff0f12289b007200000600000c070805011b18cf00020003001c01201dad01041d32d81e0d7d160000c50000047200000000d000000000410000b1ae960000a5a300553dddd4000020fdd96f0f122bfe005c16f80700050b090805011b18cf00020003001c01201ead01041d338a1e0d8d160000c50000047200000000d000000000410000b1bd960000a5a3001681"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27328);verifyPositions(decoder, binary(
                "007900000b1a2a5585c30100024e9c036900000f101733208ff45e07b31b570a001009090605011b1a020003001c01ad01021d338e16000002960000601a41014bc16d004e9c038400000f104fdf20900d20075103b00a001308090605011b1a020003001c01ad01021d33b116000002960000601a41014bc1ea0028f9"));

        __CLR4_5_2l2tl2tlwydzt1b.R.inc(27329);verifyPositions(decoder, binary(
                "009200000c07a6bacd4701000552db5cc20000187b8b251ace478e087c044c0a000009070000000052db5cfe0000187b8ab01ace47190879044c0900000b070000000052db5d3a0000187b8b251ace474b089d044c09000009070000000052db5d760000187b8b9a1ace475c08cd044c08000009070000000052db5db20000187b8b141ace46e708b3044c08000009070000000041cb"));

    }finally{__CLR4_5_2l2tl2tlwydzt1b.R.flushNeeded();}}

}
