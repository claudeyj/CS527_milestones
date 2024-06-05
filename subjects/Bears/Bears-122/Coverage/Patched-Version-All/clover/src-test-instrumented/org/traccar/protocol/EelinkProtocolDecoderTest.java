/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class EelinkProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k61k61lwye7ixo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,26158,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k61k61lwye7ixo.R.globalSliceStart(getClass().getName(),26137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k61k61lwye7ixo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k61k61lwye7ixo.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.EelinkProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk61() throws Exception{try{__CLR4_5_2k61k61lwye7ixo.R.inc(26137);

        __CLR4_5_2k61k61lwye7ixo.R.inc(26138);EelinkProtocolDecoder decoder = new EelinkProtocolDecoder(new EelinkProtocol());

        __CLR4_5_2k61k61lwye7ixo.R.inc(26139);verifyNull(decoder, binary(
                "676701000c007b03525440717505180104"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26140);verifyPosition(decoder, binary(
                "6767050022001F59643640000000000000000000000001CC0000249500142000015964A6C0006E"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26141);verifyAttributes(decoder, binary(
                "67670300040021006E"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26142);verifyPosition(decoder, binary(
                "676705002200255964369D000000000000000000000001CC0000249500142000025964A71D006A"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26143);verifyAttributes(decoder, binary(
                "67670300040028006A"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26144);verifyPosition(decoder, binary(
                "676712002d066c592cca6803002631a60b22127700240046005c08020d000301af000da0fd12007f11ce05820000001899c0"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26145);verifyPosition(decoder, binary(
                "676702002509f65868507603a1e92e03cf90fe000000019f000117ee00111e0120631145003101510000"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26146);verifyPosition(decoder, binary(
                "676712001e0092579714d60201f90001785003a301cd1a006a118504f2000000000000"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26147);verifyPosition(decoder, binary(
                "676712003400505784cc0b130246479b07d05a06001800000000070195039f046100002cc52e6466b391604a4900890e7c00000000000006ca"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26148);verifyPosition(decoder, binary(
                "676714002b00515784cc24130246479b07d05a06001800010000060195039f046100002cc52f6466b391604a49020089"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26149);verifyNull(decoder, binary(
                "676701000c002603541880486128290120"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26150);verifyPosition(decoder, binary(
                "676704001c01a4569ff2dd0517a0f7020b0d9a06011000d8001e005b0004450183"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26151);verifyPosition(decoder, binary(
                "676705002200ba569fc3520517a0d8020b0f740f007100d8001e005b0004460101569fd162001f"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26152);verifyPosition(decoder, binary(
                "676702002500bb569fc3610517a091020b116000001900d8001e005b00044601001f1170003200000000"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26153);verifyPosition(decoder, binary(
                "676704001c00b7569fc3020517a2d7020b08e100000000d8001e005b0004460004"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26154);verifyNull(decoder, binary(
                "676701000b001b035418804661834901"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26155);verifyAttributes(decoder, binary(
                "6767030004001A0001"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26156);verifyNull(decoder, binary(
                "6767070088001050E2281400FFFFFFFF02334455660333445566043344556605AA00000007334455660A334455660B334455660C4E2000000DAA0000000E334455660F3344556610AAAA000011334455661C334455661F334455662133445566423344556646334455664D334455665C334455665E33445566880000000089000000008A000000008B00000000"));

        __CLR4_5_2k61k61lwye7ixo.R.inc(26157);verifyPosition(decoder, binary(
                "676702001b03c5538086df0190c1790b3482df0f0157020800013beb00342401"));

    }finally{__CLR4_5_2k61k61lwye7ixo.R.flushNeeded();}}

}
