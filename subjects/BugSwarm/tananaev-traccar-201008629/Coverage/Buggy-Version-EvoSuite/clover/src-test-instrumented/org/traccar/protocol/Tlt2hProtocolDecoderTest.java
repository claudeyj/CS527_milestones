/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Tlt2hProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jeujeulx1dvh9d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,25167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jeujeulx1dvh9d.R.globalSliceStart(getClass().getName(),25158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jeujeulx1dvh9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jeujeulx1dvh9d.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tlt2hProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjeu() throws Exception{try{__CLR4_5_2jeujeulx1dvh9d.R.inc(25158);

        __CLR4_5_2jeujeulx1dvh9d.R.inc(25159);Tlt2hProtocolDecoder decoder = new Tlt2hProtocolDecoder(new Tlt2hProtocol());

        __CLR4_5_2jeujeulx1dvh9d.R.inc(25160);verifyPositions(decoder, text(
                "#357671030108689##0000#AUTO#1\r\n",
                "#13AE2F8F$GPRMC,211452.000,A,0017.378794,S,03603.441981,E,0.000,0,060216,,,A*68\r\n"));

        __CLR4_5_2jeujeulx1dvh9d.R.inc(25161);verifyPositions(decoder, text(
                "#357671030946351#V500#0000#AUTO#1\r\n",
                "#$GPRMC,223835.000,A,0615.3545,S,10708.5779,E,14.62,97.41,070313,,,D*70\r\n"),
                position("2013-03-07 22:38:35.000", true, -6.25591, 107.14297));

        __CLR4_5_2jeujeulx1dvh9d.R.inc(25162);verifyPositions(decoder, text(
                "\r\n#357671030946351#V500#0000#AUTO#1\r\n",
                "#$GPRMC,223835.000,A,0615.3545,S,10708.5779,E,14.62,97.41,070313,,,D*70\r\n"));
        
        __CLR4_5_2jeujeulx1dvh9d.R.inc(25163);verifyPositions(decoder, text(
                "#357671030938911#V500#0000#AUTOSTOP#1\r\n",
                "#00b34d3c$GPRMC,140026.000,A,2623.6452,S,02828.8990,E,0.00,65.44,130213,,,A*4B\r\n"));

        __CLR4_5_2jeujeulx1dvh9d.R.inc(25164);verifyPositions(decoder, text(
                "#123456789000001#V3338#0000#SMS#3\r\n",
                "#25ee0dff$GPRMC,083945.180,A,2233.4249,N,11406.0046,E,0.00,315.00,251207,,,A*6E\r\n",
                "#25ee0dff$GPRMC,083950.180,A,2233.4249,N,11406.0046,E,0.00,315.00,251207,,,A*6E\r\n",
                "#25ee0dff$GPRMC,083955.180,A,2233.4249,N,11406.0046,E,0.00,315.00,251207,,,A*6E"));
        
        __CLR4_5_2jeujeulx1dvh9d.R.inc(25165);verifyPositions(decoder, text(
                "#353686009063310#353686009063310#0000#AUTO#2\r\n",
                "#239757a9$GPRMC,150252.001,A,2326.6856,S,4631.8154,W,,,260513,,,A*52\r\n",
                "#239757a9$GPRMC,150322.001,A,2326.6854,S,4631.8157,W,,,260513,,,A*55"));
        
        __CLR4_5_2jeujeulx1dvh9d.R.inc(25166);verifyPositions(decoder, text(
                "#357671031289215#V600#0000#AUTOLOW#1\r\n",
                "#00735e1c$GPRMC,115647.000,A,5553.6524,N,02632.3128,E,0.00,0.0,130614,0.0,W,A*28"));

    }finally{__CLR4_5_2jeujeulx1dvh9d.R.flushNeeded();}}

}
