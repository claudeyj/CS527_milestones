/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class UproProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2lhllhllwydzt61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,27864,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2lhllhllwydzt61.R.globalSliceStart(getClass().getName(),27849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehlhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lhllhllwydzt61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lhllhllwydzt61.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.UproProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehlhl() throws Exception{try{__CLR4_5_2lhllhllwydzt61.R.inc(27849);

        __CLR4_5_2lhllhllwydzt61.R.inc(27850);UproProtocolDecoder decoder = new UproProtocolDecoder(new UproProtocol());

        __CLR4_5_2lhllhllwydzt61.R.inc(27851);verifyPosition(decoder, binary(
                "2a4d473230313836383530303032303030343836372c414226413035303032343138313438373536303636303131373732323030303031313132313626583331302c3236302c34383837322c353639312c37333b34383837322c3732322c38363b34383837322c353639332c38383b34383837322c323336332c39303b34383837322c323336322c393726423030303030303030303026573030264e3230265a31342659313430303323"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27852);verifyPosition(decoder, binary(
                "2a4d473230303639333530323030303033353537332c42412641303834313237333332363334353230373033383933373630303030303235313131362642303130303030303030302647303036323030264d393930264e3235264f3035303026433030313a363b363926510411058c0c125c0d0a2fff4237ee614d66454c140826555f50000000000300000000000000000026543139333723"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27853);verifyPosition(decoder, buffer(
                "*MG201693502000035441,BA&A1213073325458307036690710000151116&P0730000032ce4fb3&D1&B0000000000&C005799?7&S3,20161115120025,07035.54659E,3324.87721N,3000,0,0,0,0,847,599,8,40,0,19,20&U_P\0\0\0\0\0\0\0\0\0\0\0\0\0\0&T0107"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27854);verifyPosition(decoder, buffer(
                "*MG201693502000034964,AB&A0800253335360507036975710000091116&P0730000032d2a94d&B0000000000&N13&Z12&U_P\0\0\0\0\0\0\0\0\0\0\0\0\0"),
                position("2016-11-09 08:00:25.000", true, -33.58934, -70.61626));

        __CLR4_5_2lhllhllwydzt61.R.inc(27855);verifyNull(decoder, buffer(
                "*MG20113800138000,AH"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27856);verifyPosition(decoder, buffer(
                "*MG201693502000034964,AB&A0200183324418107033792800009051116&B0000000000&N15&Z94&U_P\0\0\0\0\0\0\0\0\0\0\0\0\0\0"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27857);verifyPosition(decoder, buffer(
                "*MG201693502000034964,AB&A0200543324412007033805910000051116&P0730000032d66785&B0000000000&N15&Z92&U_P\0\0\0\0\0\0\0\0\0\0\0\0\0\0"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27858);verifyPosition(decoder, buffer(
                "*AI2000905447674,BA&A2003064913201201845107561627121016&B0100000000&C05>8=961&F0333&K023101002154A7"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27859);verifyPosition(decoder, buffer(
                "*AI200905300036,AH&A0317264913209801844913060000251115&B0500000000&C0;4?72:9&F0000"),
                position("2015-11-25 03:17:26.000", false, 49.22016, 18.74855));

        __CLR4_5_2lhllhllwydzt61.R.inc(27860);verifyPosition(decoder, buffer(
                "*AI2000905300036,AS&A1647304913209801844913060000251115&B0400000000&C0;4?72:9&F0000"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27861);verifyPosition(decoder, buffer(
                "*AI2000905300036,AC1&A1648014913209801844913060000251115&B0400000000&C0;4?72:9&F0000"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27862);verifyPosition(decoder, buffer(
                "*AI2000905300036,AB1&A1702464913231101844949860000251115&B0500000000&C0;4?72:9&F0000"));

        __CLR4_5_2lhllhllwydzt61.R.inc(27863);verifyPosition(decoder, buffer(
                "*AI2000905300036,AD1&A1703054913231101844949860000251115&B0500000000&C0;4?72:9&F0000"));

    }finally{__CLR4_5_2lhllhllwydzt61.R.flushNeeded();}}

}
