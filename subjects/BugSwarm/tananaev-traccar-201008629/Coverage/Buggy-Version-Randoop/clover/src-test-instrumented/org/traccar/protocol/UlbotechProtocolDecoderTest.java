/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class UlbotechProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jikjiklx1dwn8l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,25318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jikjiklx1dwn8l.R.globalSliceStart(getClass().getName(),25292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jikjiklx1dwn8l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jikjiklx1dwn8l.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.UlbotechProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjik() throws Exception{try{__CLR4_5_2jikjiklx1dwn8l.R.inc(25292);

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25293);UlbotechProtocolDecoder decoder = new UlbotechProtocolDecoder(new UlbotechProtocol());

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25294);verifyPosition(decoder, binary(
                "f8010108675210214191372010e042010e0292dcd601a999c9000c00900269030400420000040400d87d6e0506034f1754220b070d31056d410c0000310d00312f4a1005f000000200947df8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25295);verifyPosition(decoder, binary(
                "f8010103515810532780699f7e2e3f010e015ee4c906bde45c00000000008b0304004000000404002c776005060373193622110b00240b00fee8ffff807dffff606d0b00fee9af000000af0000000b00feee7d78807dffffffff100101cc2af8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25296);verifyPosition(decoder, binary(
                "F8010103596580420045259CFB3329010E015ED91506BDE5A800000000009E030402420000040400492AA405060344197E220D071131058F410C1591310D48312F8F413107C60804027666B00C138254D182607A826EE083BE554385F50019423CAD1DF8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25297);verifyNotNull(decoder, binary(
                "F8010108683230231070781EA3676E020BFFFFFFFFFFFFFFFFFFFF780304000000030404000002C20506032A1790220E100101AC72F8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25298);verifyNotNull(decoder, binary(
                "f8010108683230220996561ea6ce1c020bffffffffffffffffffff78030400000000040400087b710506035519ad2214060800000000000000006220f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25299);verifyAttributes(decoder, binary(
                "f8010108683230220996561ea6ce3f020b02cc00114e86000002f153030400000000040400087b710506035619a4221406080000000000000000fbcff8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25300);verifyAttributes(decoder, binary(
                "f8010108683230211861161e9d8c48020b00de0063eb730128b56161030400010001040400127d0705060174179422021005e000000001db06f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25301);verifyPosition(decoder, binary(
                "f8010108683230220996561ea6cdf9010eff47465cfb68d7a000000000270f030400000000040400087b710506035119ba22140608000000000000000022cef8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25302);verifyPosition(decoder, binary(
                "f8010108683230220996561ea74274010eff47477bfb68d89000000000270f030400000000040400087b710506035419472214060800000000000000006661f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25303);verifyPosition(decoder, binary(
                "f8010103515790566431569e5fbb9d010e015ee2b906bde4a000000000009f03040a4000000404000115fe05060340173f22030711310583410c0000310d00312f834131000008040000b78c09077320290082c021100101120af8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25304);verifyNothing(decoder, binary(
                "2a545330312c33353430343330353133383934363023"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25305);verifyPosition(decoder, binary(
                "f8010108679650230646339de69054010e015ee17506bde2c60000000000ac0304024000000404000009f705060390181422170711310583410c0000310d00312f834131018608040003130a100101136cf8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25306);verifyPosition(decoder, binary(
                "f8010108679650230651689dc8e45b010e01194a26fbd47fa6001f003c0054030402420000040400024d7b0506037c18692212071131057f410c0ee0310d1b312f41413112ef0804000dd59fcc32f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25307);verifyPosition(decoder, binary(
                "f8010103596580419465449da89d16010efe5580fe0923d82100140129005903040242000004040001a7f10506037818be220e070e31057b410c1324310d144131fa3208040020b1418297f8"));
        
        __CLR4_5_2jikjiklx1dwn8l.R.inc(25308);verifyPosition(decoder, binary(
                "f8010103596580419465449da8564e010efe55a1800923d04b0000000000710304000000000404000178d2050603571876220ec3caf8"));
        
        __CLR4_5_2jikjiklx1dwn8l.R.inc(25309);verifyPosition(decoder, binary(
                "f8010103545500500179009ccb4b62010e00144db906310d3f0000000000cb0304000000000404000a8123050603211860221006080000000100000000ef97f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25310);verifyPosition(decoder, binary(
                "F80101035785203457289495D60235010E016175A506C2C838000000000064"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25311);verifyPosition(decoder, binary(
                "F8010108621060211481299C4247FA010E015EE1D606BDE797000301370081030402420000040400523CAF050603921743220706080000000000000000071131058E410C0E30310D48312F8E4131046A080402C8F2545445F8"));
        
        __CLR4_5_2jikjiklx1dwn8l.R.inc(25312);verifyPosition(decoder, binary(
                "F8010108621060211481299C4249FA010E015EE27506BDE80900020000008F030402420000040400523CAF05060392173F220706080000000000000000071131058E410C0E40310D48312F8E41310884080402CA60E43872F8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25313);verifyNotNull(decoder, binary(
                "f8010108653280262660481cdacf830209ffffffffffffffff780304000300000404000000030506017418a021f99697f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25314);verifyNotNull(decoder, binary(
                "f801010865328026266048fffeae800209ffffffffffffffff7803040200000004040000000005060375175421f3060800000000000000009c28f8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25315);verifyPosition(decoder, binary(
                "f8010108653280262660489ce260b4010e01e757bd022340d7002b010d01570304020200000404000000260506036a17d42200060800000000000000000a0101ab9ff8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25316);verifyPosition(decoder, binary(
                "f8010108653280262660489ce260df010e01e756f30223384a0003010a02a80304020200000404000001280506036217fe22010608000000000000000005aaf8"));

        __CLR4_5_2jikjiklx1dwn8l.R.inc(25317);verifyPosition(decoder, binary(
                "f8010108653280262660489ce26128010e01e769ac022336290014010300730304020200000404000003c905060371181c2201060800000000000000000a0140e471f8"));

    }finally{__CLR4_5_2jikjiklx1dwn8l.R.flushNeeded();}}

}
