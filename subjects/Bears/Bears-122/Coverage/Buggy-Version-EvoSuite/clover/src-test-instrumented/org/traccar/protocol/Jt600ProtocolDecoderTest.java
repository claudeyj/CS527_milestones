/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.traccar.ProtocolTest;

import org.junit.Test;

public class Jt600ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kqhkqhlwydwgtr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,26901,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kqhkqhlwydwgtr.R.globalSliceStart(getClass().getName(),26873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kqhkqhlwydwgtr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kqhkqhlwydwgtr.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Jt600ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkqh() throws Exception{try{__CLR4_5_2kqhkqhlwydwgtr.R.inc(26873);

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26874);Jt600ProtocolDecoder decoder = new Jt600ProtocolDecoder(new Jt600Protocol());

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26875);verifyPositions(decoder, binary(
                "24624090196121001b19071703493631277203074235752f295800005308010000768b0822"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26876);verifyPositions(decoder, binary(
                "24624090196123019519071703412131285623074214252f10560000130801000076850819071703420631282832074215165f172c0000030801000076850919071703422131282792074216635f222e0000130801000076850919071703423631282808074218261f212a0000130801000076860819071703435131283678074222928f08350000930801000076860919071703440631283003074223174f19500000930801000076870819071703445131279872074224584f07380000930801000076870819071703453631280643074227091f1b220000530801000076880919071703455131281043074228216f0a260000530801000076880819071703460631281229074228988f0c260000530801000076880819071703462131281551074229954f1f220000530801000076880919071703463631281289074230503f114e0000530801000076880819071703465131281186074230884f094f0000530801000076880819071703470631280308074231240f17500000530801000076880619071703472131280358074231636f0b1d0000530801000076890821"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26877);verifyPositions(decoder, binary(
                "2475604055531611002311111600311326144436028210791d016c0000001f070000000020c03c4f6d07d80ccf"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26878);verifyPositions(decoder, binary(
                "2475201509260111002313101503464722331560113555309F00000000002D0500CB206800F064109326381A03"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26879);verifyPositions(decoder, binary(
                "2475605035891613002328091601152806086750106533350c00000000000a000000000000e1ff4f97007f1607"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26880);verifyPosition(decoder, buffer(
                "(3301210003,U01,040812,185302,T,22.564025,N,113.242329,E,5.21,152,9,32%,00000000000011,10133,5173,22,100,1)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26881);verifyPosition(decoder, buffer(
                "(3301210003,U02,040812,185302,T,22.564025,N,113.242329,E,5,152,9,32%,00000000000011,10133,5173,22,100,1)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26882);verifyPosition(decoder, buffer(
                "(3301210003,U03,040812,185302,T,22.564025,N,113.242329,E,5,152,9,32%,00000000000011,10133,5173,22,100,1)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26883);verifyNull(decoder, buffer(
                "(3301210003,U04)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26884);verifyPosition(decoder, buffer(
                "(3301210003,U06,1,040812,185302,T,22.564025,N,113.242329,E,5,152,9,32%,0000000000011,10133,5173,22,100,1,300,100,10)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26885);verifyPosition(decoder, buffer(
                "(3460311327,U01,220916,135251,T,9.552607,N,13.658292,W,0.31,0,9,0%,00001001000000,11012,10,27,0,0,33)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26886);verifyPosition(decoder, buffer(
                "(3460311327,U01,010100,000024,F,0.000000,N,0.000000,E,0.00,0,0,100%,00000001000000,263,1,18,0,0,33)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26887);verifyNull(decoder, buffer(
                "(3460311327,@JT)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26888);verifyPosition(decoder, buffer(
                "(3460311327,U06,11,220916,135643,T,9.552553,N,13.658265,W,0.61,0,9,100%,00000001000000,11012,10,30,0,0,126,0,30)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26889);verifyPosition(decoder, buffer(
                "(3460311327,U06,10,220916,140619,T,9.552495,N,13.658227,W,0.43,0,7,0%,00101001000000,11012,10,0,0,0,126,0,30)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26890);verifyPositions(decoder, binary(
                "24311021600111001B16021105591022329862114046227B0598095080012327951435161F"),
                position("2011-02-16 05:59:10.000", true, 22.54977, -114.07705));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26891);verifyPositions(decoder, binary(
                "24312082002911001B171012052831243810120255336425001907190003FD2B91044D1FA0"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26892);verifyPositions(decoder, binary(
                "24312082002911001B1710120533052438099702553358450004061E0003EE000000000C00"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26893);verifyPositions(decoder, binary(
                "24608111888821001B09060908045322564025113242329F0598000001003F0000002D00AB"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26894);verifyPosition(decoder, buffer(
                "(3110312099,W01,11404.6204,E,2232.9961,N,A,040511,063736,4,7,100,4,17,1,1,company)"),
                position("2011-05-04 06:37:36.000", true, 22.54994, 114.07701));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26895);verifyPosition(decoder, buffer(
                "(3120820029,W01,02553.3555,E,2438.0997,S,A,171012,053339,0,8,20,6,31,5,20,20)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26896);verifyPosition(decoder, buffer(
                "(3330104377,U01,010100,010228,F,00.000000,N,000.000000,E,0,0,0,0%,00001000000000,741,14,22,0,206)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26897);verifyNull(decoder, buffer(
                "(6221107674,2,U09,129,2,A,280513113036,E,02711.0500,S,1721.0876,A,030613171243,E,02756.7618,S,2300.0325,3491,538200,14400,1)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26898);verifyPosition(decoder, buffer(
                "(3301210003,U02,040812,185302,T,00.000000,N,000.000000,E,0,0,0,0%,00000000000011,741,51,22,0,1,05)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26899);verifyPosition(decoder, buffer(
                "(3301210003,U06,4,250916,133207,T,7.011013,N,25.060708,W,27.61,102,10,0%,00101011000000,0,1,0,448,0,126,1,30)"));

        __CLR4_5_2kqhkqhlwydwgtr.R.inc(26900);verifyPosition(decoder, buffer(
                "(3551001012,U01,010100,000032,F,0.000000,N,0.000000,E,0.00,0,0,10%,00000000010000,15748,7923,23,0,0,3E)"));

    }finally{__CLR4_5_2kqhkqhlwydwgtr.R.flushNeeded();}}

}
