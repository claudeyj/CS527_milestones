/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class WatchProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ljqljqlwydwh15{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,27950,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ljqljqlwydwh15.R.globalSliceStart(getClass().getName(),27926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehljq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ljqljqlwydwh15.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ljqljqlwydwh15.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.WatchProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehljq() throws Exception{try{__CLR4_5_2ljqljqlwydwh15.R.inc(27926);

        __CLR4_5_2ljqljqlwydwh15.R.inc(27927);WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        __CLR4_5_2ljqljqlwydwh15.R.inc(27928);verifyPosition(decoder, buffer(
                "[3G*6005412902*011F*WT,170517,133811,V,18.512200,N,73.7750283,E,0.00,0.0,0.0,0,92,82,4262,0,00000010,2,1,404,22,10125,8301,141,10125,13921,122,5,Skynet,28:c6:8e:be:87:c0,-60,Intel Wi-Fi,4c:60:de:32:3d:38,-70,Nirvanic-2,40:e3:d6:4a:d9:c2,-73,A4-Guest,40:e3:d6:4a:d9:c4,-73,A4Idatix,40:e3:d6:4a:d9:c3,-73,13.8]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27929);verifyPosition(decoder, buffer(
                "[3G*8308406279*00CC*UD3,170417,190930,V,54.739618,N,25.273213,E,0.0,323.53,175.1,6,51,83,0,0,00000000,1,1,246,01,200,13242758,51,3,TEO-189835,00:8c:54:58:1d:64,-84,Cgates_7137,78:54:2e:e3:71:37,-85,ASUS,9c:5c:8e:b8:d4:78,-93]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27930);verifyPosition(decoder, buffer(
                "[SG*9051004074*0058*AL,120117,145602,V,40.058413,N,76.336618,W,11.519,188,99,00,01,80,0,50,00000000,0,1,0,0,,10]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27931);verifyPosition(decoder, buffer(
                "[SG*9051000884*009B*UD,030117,161129,V,52.745450,N,0.369512,,0.1481,000,99,00,70,5,0,50,00000000,5,1,234,15,893,3611,135,893,3612,132,893,3993,131,893,30986,129,893,40088,126,,00]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27932);verifyPosition(decoder, buffer(
                "[3G*6430073509*00E7*UD2,241016,081622,V,09.951861,N,-84.1422119,W,0.00,0.0,0.0,0,39,94,0,0,00000000,1,0,712,3,2007,18961,123,4,Luz,00:23:6a:34:ee:76,-70,familia,b0:c5:54:b9:90:ef,-78,fam salas delgado,fc:b4:e6:5d:50:ea,-81,QWERTY,c8:3a:35:43:0f:e8,-93]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27933);verifyPosition(decoder, buffer(
                "[3G*6105117105*008D*UD2,210716,231601,V,-33.480366,N,-70.7630692,E,0.00,0.0,0.0,0,100,34,0,0,00000000,3,255,730,2,29731,54315,167,29731,54316,162,29731,54317,145]"),
                position("2016-07-21 23:16:01.000", false, -33.48037, -70.76307));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27934);verifyPosition(decoder, buffer(
                "[3G*4700222306*0077*UD,120316,140610,V,48.779045,N, 9.1574736,E,0.00,0.0,0.0,0,25,83,0,0,00000000,2,255,262,1,21041,9067,121,21041,5981,116]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27935);verifyPosition(decoder, buffer(
                "[3G*4700222306*011F*UD2,120316,140444,A,48.779045,N, 9.1574736,E,0.57,12.8,0.0,7,28,77,0,0,00000000,2,2,262,1,21041,9067,121,21041,5981,116,5,WG-Superlativ,34:31:c4:c8:a9:22,-67,EasyBox-28E858,18:83:bf:28:e8:f4,-70,MoMaXXg,be:05:43:b7:19:15,-72,MoMaXX2,bc:05:43:b7:19:15,-72,Gastzugang,18:83:bf:28:e8:f5,-72]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27936);verifyNull(decoder, buffer(
                "[SG*9081000548*0009*LK,0,100]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27937);verifyPosition(decoder, buffer(
                "[SG*9081000548*00A9*UD,110116,113639,V,16.479064,S,68.119072,,0.7593,000,99,00,80,80,0,50,00000000,5,1,736,2,10103,10732,153,10103,11061,152,10103,11012,152,10103,10151,150,10103,10731,143,,00]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27938);verifyPosition(decoder, buffer(
                "[3G*2256002206*0079*UD2,100116,153723,A,38.000000,N,-9.000000,W,0.44,299.3,0.0,7,100,86,0,0,00000008,2,0,268,3,3010,51042,146,3010,51043,132]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27939);verifyNull(decoder, buffer(
                "[3G*8800000015*0003*TKQ]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27940);verifyPosition(decoder, buffer(
                "[3G*4700186508*00B1*UD,301015,084840,V,45.853100,N,14.6224899,E,0.00,0.0,0.0,0,84,61,0,11,00000008,7,255,293,70,60,6453,139,60,6432,139,60,6431,132,60,6457,127,60,16353,126,60,6451,121,60,16352,118]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27941);verifyNull(decoder, buffer(
                "[SG*8800000015*0002*LK]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27942);verifyAttributes(decoder, buffer(
                "[3G*4700186508*000B*LK,0,10,100]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27943);verifyPosition(decoder, buffer(
                "[SG*8800000015*0087*UD,220414,134652,A,22.571707,N,113.8613968,E,0.1,0.0,100,7,60,90,1000,50,0000,4,1,460,0,9360,4082,131,9360,4092,148,9360,4091,143,9360,4153,141]"),
                position("2014-04-22 13:46:52.000", true, 22.57171, 113.86140));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27944);verifyPosition(decoder, buffer(
                "[SG*8800000015*0087*UD,220414,134652,A,22.571707,N,113.8613968,E,0.1,0.0,100,7,60,90,1000,50,0000,4,1,460,0,9360,4082,131,9360,4092,148,9360,4091,143,9360,4153,141]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27945);verifyPosition(decoder, buffer(
                "[SG*8800000015*0088*UD2,220414,134652,A,22.571707,N,113.8613968,E,0.1,0.0,100,7,60,90,1000,50,0000,4,1,460,0,9360,4082,131,9360,4092,148,9360,4091,143,9360,4153,141]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27946);verifyPosition(decoder, buffer(
                "[SG*8800000015*0087*AL,220414,134652,A,22.571707,N,113.8613968,E,0.1,0.0,100,7,60,90,1000,50,0001,4,1,460,0,9360,4082,131,9360,4092,148,9360,4091,143,9360,4153,141]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27947);verifyAttributes(decoder, buffer(
                "[CS*8800000015*0008*PULSE,72]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27948);verifyAttributes(decoder, buffer(
                "[3G*6005412902*0007*heart,0]"));

        __CLR4_5_2ljqljqlwydwh15.R.inc(27949);verifyAttributes(decoder, buffer(
                "[3G*6005412902*0008*heart,71]"));

    }finally{__CLR4_5_2ljqljqlwydwh15.R.flushNeeded();}}

}
