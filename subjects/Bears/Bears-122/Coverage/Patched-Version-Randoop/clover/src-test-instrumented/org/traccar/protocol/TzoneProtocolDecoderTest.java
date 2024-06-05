/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class TzoneProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2lgdlgdlwye6945{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,27816,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2lgdlgdlwye6945.R.globalSliceStart(getClass().getName(),27805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehlgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lgdlgdlwye6945.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lgdlgdlwye6945.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TzoneProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehlgd() throws Exception{try{__CLR4_5_2lgdlgdlwye6945.R.inc(27805);

        __CLR4_5_2lgdlgdlwye6945.R.inc(27806);TzoneProtocolDecoder decoder = new TzoneProtocolDecoder(new TzoneProtocol());

        __CLR4_5_2lgdlgdlwye6945.R.inc(27807);verifyPosition(decoder, binary(
                "545a005024240153011000000863835025559464110103080a22001609011bed79245964a9110103080a22000a0000550c00000604396f04222c000daac000151701a204870000000000000003000959000546190d0a"));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27808);verifyPosition(decoder, binary(
                "545A005224240153010E000008638350256668551008130616090016050079F63D2527FAF710081306160900A000002F0D33000803015B07013D7976000DAAE0400537016C049E000000000000000300800002B65EEA0D0A"));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27809);verifyPosition(decoder, binary(
                "545a00582424010b022000000860041028904798100803030c2700160a007da96203356669100803030c2700000000000e000004002813730010aa4000000617017100000000000080000000000000000000000000000000007701fe0d0a"));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27810);verifyPosition(decoder, binary(
                "545a00582424010b022000000860041028904798100803030d1a001609007da9620335666a100803030d1900000000000e000004002813730010aa400000063701720000000000008000000000000000000000000000000000787f0c0d0a"));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27811);verifyPosition(decoder, binary(
                "545a00582424010b021e000008637710239476270f080b0a3228001600000000000000000000000000000000000000000000000401a00822001088c00020183701a6053800000000800000000000000000000000000000000077c9860d0a"),
                position("1999-11-30 00:00:00.000", false, 0.0, 0.0));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27812);verifyPosition(decoder, binary(
                "545A00912424010B021E000008661040203754350F061807083800160400CE5ADC041447620F0618070838000A0000060C7C0004253378370010AAC000000C37018504E500000000800000000000000000390B0A0014061113000000051200140610600014061220001000133800140610070010001473001000151100101500640010000920001000148400000000000000F2EF570D0A"),
                position("2015-06-24 07:08:56.000", true, 22.53946, 114.06310));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27813);verifyNull(decoder, binary(
                "545A009E2424010A0205000008637710225481290F010F081E33000000000010A0C000310E35000005840000000000000000000000000066140A00140612200010001511001406101000140612490014061308001015006400051400170014061012000000050200140612470000000504001406100700140612510014061260001015012000000005080014061252001406130900101501410000000506000853A40D0A"));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27814);verifyNull(decoder, binary(
                "545A00992424010A0205000008637710225481290F010F082634000000000010A0C000311035000005870000000000000000000000000061130A000000050800101500640014061251001406130800051400170010150141001406101000140612200014061309000000050200140610070014061260001406124900140612470014061012001406125200100015110010150120000000050400183E8A0D0A"));

        __CLR4_5_2lgdlgdlwye6945.R.inc(27815);verifyNull(decoder, binary(
                "545A00942424010A0205000008637710225481290F010F091C1F000000000010A1C000310F3500000586000000000000000000000000005C120A001406101000140612490014061012001406125200000005040000000502001015012000000005080010001511001406122000140612600014061247001406130900140610070010150141000514001700140612510010150064007A907C0D0A"));

    }finally{__CLR4_5_2lgdlgdlwye6945.R.flushNeeded();}}

}
