/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

import static org.junit.Assume.assumeTrue;

public class At2000ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jz5jz5lwydwgiz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,25907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jz5jz5lwydwgiz.R.globalSliceStart(getClass().getName(),25889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jz5jz5lwydwgiz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jz5jz5lwydwgiz.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.At2000ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjz5() throws Exception{try{__CLR4_5_2jz5jz5lwydwgiz.R.inc(25889);

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25890);assumeTrue(Boolean.parseBoolean(System.getenv("CI")));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25891);At2000ProtocolDecoder decoder;

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25892);decoder = new At2000ProtocolDecoder(new At2000Protocol());

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25893);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01012f00000000000000000000000000003335373435343037313632373539388b57ec3a6ec7e3310a1ceb0a70fd751b8f2e7be6df1d6dcd80129f66fff0ea1c"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25894);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "89000000000000000000000000000000"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25895);decoder = new At2000ProtocolDecoder(new At2000Protocol());

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25896);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01012f0000000000000000000000000000333537343534303731363036313936ddf189075add9a32d97b54073025963e65849a3a59940d05fd8db655fc84bc6d"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25897);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "893b01000000000000000000000000003b40bcdab6387d829146701d8cb53daaa87b84d24b40cb24fd86da5d3f5f02b0f6f603c43c5a513418a0b2bdcaba603dbe737687cfe9082c57668eb6789d2b029a35aeac6a609558b96de5d7ad37917c902efc878ca9aff474f9d5d2417191285b8d5749bd3ffa86cc99096ce24c1f6ac350ae9adf3d5c788f80b4e3d3dc2dbb8abc1414ea1b52fdb55b2bb8af223ec528245f99d451b715e5774c5397db645d9ae441e645f8dae70230b728e81f51240868712d6f426fd694dbad8026fcf487c268939f04593ad86391cc829b1a1bdac8804ff7507544a69dc0b1b3927d7344e8a5b26fa56825283b3e476330b36d15011e1647ebd9f2ef71844ed32c0dc050457bfbd79160e6d1d8cda00a0927c8957631770e98eb20735aa46b0b18502baf4c45d2623ee51a4320cf3018010e7bbf8bc0dd79eb28e88b727ea67e980b8a91"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25898);decoder = new At2000ProtocolDecoder(new At2000Protocol());

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25899);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01012f000000000000000000000000000033353734353430373136303631393637f5441a9862260117858237fe3160388490f0df7d46c09112ee087235a92101"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25900);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "89043203000000000000000000000000d01ff1df1b56ba9185bb741ddc253f3cee093b1f8193100cd95777b5288a6f29d1b343a952f882ce8825679f7e27ad88ed7898bff92f716acadfc3c17fa8c1a6b9d0934e8f042433a183776c06c1acd73efb4b9f19030debb4dceb161fb3e6630757d25c3e995b7cf5f446318dcc1677eb215d1af49f11cd7300598bcdc40cc25466ed2391d836c782e44bc04a332e902b2b34f5597a542af4ca670cdfc18d87ce2a225c3e6f2f32359d4914c6df09aa5ee306c229260d4a56da53f93398bc8a6e77095305ee214cf605de20d3876a993fb810486f75bcd514c12442bf4dc3fbe7963b20d5100b5ecff1c1aef4c4b3736a04e245d50f538327db21d55270b279db5ac5a9658876bae3d9b5026b8975bb2bf4d100b8492760d66ae31f27bf9c525c2d794860eabca9c788b91152dbce79f336daaf6a7a9547bf1dd8e3334c891f4548fd6d112ebf45125c2a8abd3a786ebbcfdd03101b524bbf465f14a9a424305ce7de56ffca85b4657fc8c03e4349c0ca6be64d1cf595ee91f8173678ef2267dae54dd00028450c48d9b74c925af0f245d409d8773238dce5832747587f53a12155869c1d464eb0630f94cf8dceb76aa39995411d4ce7743b1501692425afec498535526067e79f568b7f71ee47d8b4929118d57b13d56cdbfd26582d579dee"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25901);decoder = new At2000ProtocolDecoder(new At2000Protocol());

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25902);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01012f0000000000000000000000000000333537343534303731363035353033dd529a1eb5df9f3b6d320b38250e03306692957e8c2127d8e381a717f639b4c9"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25903);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "89898701000000000000000000000000ae99e38f13d44f536769eb4930a6826dfebe5b98a6048941e89b17c9cdcb276be4af7c0d188d07c90d6e94aa9efcb465fe7aeaff4d85caf837483b4e9b32fbbacfbc4e175eebf57a27f552a64fc3419565d2dfbea668511a08d5a526342fad0e93b20c4449ad8defab4a9ac68cf7dad86971eb2cd96810d9d6a9c56e07fd90e4c28cfc53a069b63efe37a0523a69b607a2dc011ba17b177c5332c04be1faeeabed24539b3b790fa8a8610ab3633e0140ed79690fcae9dea43c7daad780d95a511d8f4875e621bcfe7516a03b80eb3c473ffd4bc1eda298dfa7d994a2cfeaa5d24c190d52d72fd90975a2e6f9ed3b95017133952262f91787c46839738a80c333dc53ee4d8afe75315d801efe17bc7309f30cfce64906bf70e6844c835781cbb64b49e9315ca3c2cd39d00a03cc7178a4ebc5df230dcdfd44ec588791d488f96bb6ff4007a753f552bda4d1766632aa3ec5eb38feb23ed6efb8f382a7f22b70adc9cb533c09bf749190c36d63b572c1acfc3a59138d51273835ab13c4689df01e3d2c2dd1829e00aac5c56b5d51e60d6731833f82c7464d88df663ca28a20eedeecb60f3704ae78281838caa116184e414db459768321bbfa1e83ad59fe168eb81f3b41cfe0e39c8aa78cbbe5825620bf053a1cb62e04d4cdf17ca2dc9305d47c"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25904);decoder = new At2000ProtocolDecoder(new At2000Protocol());

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25905);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01012f00000000000000000000000000003335363137333036343430373439320fad981997ae8e031fe10c0ea7641903ca32c0331df467233d2a9cd886fbeef8"));

        __CLR4_5_2jz5jz5lwydwgiz.R.inc(25906);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "893f0000000000000000000000000000e048b1a31deba3f5dbe8877f574877e6ed4d022b6611a10d80dfc4c0c11fa8aacf4a9de61528327e2b66843dd9c5d3a7cc9ee1d9c71a34bb482145d88b4fda3e"));

    }finally{__CLR4_5_2jz5jz5lwydwgiz.R.flushNeeded();}}

}
