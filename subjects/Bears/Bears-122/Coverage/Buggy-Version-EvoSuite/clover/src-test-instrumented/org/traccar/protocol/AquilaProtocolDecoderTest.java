/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AquilaProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jxvjxvlwydwgil{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,25857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jxvjxvlwydwgil.R.globalSliceStart(getClass().getName(),25843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jxvjxvlwydwgil.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jxvjxvlwydwgil.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AquilaProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjxv() throws Exception{try{__CLR4_5_2jxvjxvlwydwgil.R.inc(25843);

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25844);AquilaProtocolDecoder decoder = new AquilaProtocolDecoder(new AquilaProtocol());

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25845);verifyPosition(decoder, text(
                "$$CLIENT_1ZF,170215089,1,18.462809,73.824188,170613182744,A,19,0,0,256,4,4.860000,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,259,3731,*37"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25846);verifyPosition(decoder, text(
                "$$CLIENT_1ZF,170222318,101,22.846016,75.949104,170321103506,A,0,0,244991,0,10,0.860000,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,12483,294,*3D"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25847);verifyNull(decoder, text(
                "$$CLIENT_1ZF,170222318,15,2_00AP,70.35.195.185,5089,internet,T1:10 S,T2:1 M,Ad1:9164061023,Ad2:9164061023,TOF:0 S,,OSC:75 KM,OST:0 S,GPS:YES,Ignition:ON,*75"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25848);verifyPosition(decoder, text(
                "$$CLIENT_1ZF,170222318,1,22.836912,75.942215,170321110736,A,11,12,247196,103,10,0.810000,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,13325,306,*36"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25849);verifyPosition(decoder, text(
                "$$CLIENT_1ZF,130329214,1,12.962985,77.576484,140127165433,A,22,0,0,140,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1253,420,1,0,1,0,0,1,P(01:410104000102|05:410521|0C:410C0000|0D:410D65|21:4121161C),D(P0121|B2105),-895,745,-145,300,*26"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25850);verifyPosition(decoder, text(
                "$$CLIENT_1NS,101010119,1,22.845943,75.949059,170202184000,A,27,0,0,120,31141,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,399,3709,0,0,0,0,0,0,P(01:|04:|05:|0B:|0C:|0D:|10:|1C:|21:|23:|30:|31:|1F:|11:|00:|00:|),D(),-89,44,-1062,0,*49"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25851);verifyPosition(decoder, text(
                "$$CLIENT_1DT,151028368,1,19.108438,72.925308,160628154920,A,22,0,0,131,3503,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,*1D"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25852);verifyNull(decoder, text(
                "$$CLIENT_1DT,160319372,1,28.549541,77.249802,160628140743,A,23,0,-65025,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,*0D"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25853);verifyPosition(decoder, text(
                "$$SRINI_1MS,141214807,1,12.963515,77.533844,150925161628,A,27,0,8,0,68,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,*43"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25854);verifyPosition(decoder, text(
                "$$CLIENT_1ZF,130329214,1,12.962985,77.576484,140127165433,A,22,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,*26"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25855);verifyPosition(decoder, text(
                "$$CLIENT_1WP,141216511,3,12.963123,77.534012,150908163534,A,31,0,0,0,7,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,*28"));

        __CLR4_5_2jxvjxvlwydwgil.R.inc(25856);verifyPosition(decoder, text(
                "$$CLIENT_1WP,141216511,3,12.963212,77.533989,150908164041,V,31,0,0,0,8,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,*2A"));

    }finally{__CLR4_5_2jxvjxvlwydwgil.R.flushNeeded();}}

}
