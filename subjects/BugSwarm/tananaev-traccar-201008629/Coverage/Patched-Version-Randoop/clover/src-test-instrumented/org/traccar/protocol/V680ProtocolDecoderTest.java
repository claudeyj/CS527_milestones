/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class V680ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jn6jn6lx1e0kqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565269350L,8589935092L,25480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jn6jn6lx1e0kqh.R.globalSliceStart(getClass().getName(),25458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn6jn6lx1e0kqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn6jn6lx1e0kqh.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.V680ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjn6() throws Exception{try{__CLR4_5_2jn6jn6lx1e0kqh.R.inc(25458);

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25459);V680ProtocolDecoder decoder = new V680ProtocolDecoder(new V680Protocol());

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25460);verifyPosition(decoder, text(
                "#867967020910610#01234567890#1#0000#AUT#1#0500000000120000#114.036291,E,22.665795,N,111.00,000.00#111116#193333##"),
                position("2016-11-11 19:33:33.000", true, 22.66579, 114.03629));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25461);verifyPosition(decoder, text(
                "#355488020168617##1#0000#AUT#01#260001a412966f#1834.790700,E,5302.748800,N,0.00,0.00#310316#174538.000##"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25462);verifyPosition(decoder, text(
                "#355488020168617##1#0000#AUT#01##1834.770100,E,5302.742800,N,0.62,0.00#310316#211537.000##"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25463);verifyNothing(decoder, text(
                "#353588102019155"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25464);verifyPosition(decoder, text(
                "#135790246811222#13486119277#1#0000#SOS#1#27bc10af#11407.4182,E,2232.7632,N,0.00,79.50#070709#134147.000##"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25465);verifyPosition(decoder, text(
                "#356823031193431##0#0000#SF#1#72403#V#04702.3025,W,2252.18380,S,008.18,0#090413#134938"),
                position("2013-04-09 13:49:38.000", false, -22.86973, -47.038375));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25466);verifyPosition(decoder, text(
                "#356823033219838#1000#0#1478#AUT#1#66830FFB#03855.6628,E,4716.6821,N,001.41,259#130812#143905"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25467);verifyPosition(decoder, text(
                "#353588102019155##1#0000#AUT#01#7240060be7873f#4849.079800,W,2614.458200,S,0.00,0.00#130413#182110.000"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25468);verifyPosition(decoder, text(
                "#353588302045917##1#0000#AUT#01#7243141c2b14c3#4738.442300,W,2334.874000,S,0.00,0.30#170413#004831.000"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25469);verifyPosition(decoder, text(
                "#352897045085282##0#0000#AUT#1#72400510730208,00d36307,10734fc4#4647.8922,W,2339.1956,S,2.60,63.74#200413#094310.000"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25470);verifyPosition(decoder, text(
                "#356823033537791##0#0000#AUT#1#V#03610.2179,E,5004.5796,N,000.01,349#180513#073758"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25471);verifyPosition(decoder, text(
                "#356823031236214##0#0000#AUT#1#V#01904.5491,E,6941.0085,N,000.09,248#170513#160140"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25472);verifyNothing(decoder, text(
                "#353588550032869##1#0000#AUT#01#72400401cd01a5#00000.0000,E,0000.0000,N,0.00,#000000#000000.000"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25473);verifyPosition(decoder, text(
                "#352897045085282##0#0000#AUT#1#72400510730208,00d36307,10734fc4#4647.8922,W,2339.1956,S,2.60,63.74#200413#094310.000##"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25474);verifyPosition(decoder, text(
                "#352165050199210##13#0000#AUT#1#72400605471305,054712fd,054712ff#05144.0008,W,3005.5011,S,0.11,201.46#260713#172647.000##"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25475);verifyPosition(decoder, text(
                "#356823031166908#13001190527#0#0000#AUT#4#V#07136.4070,W,1040.0575,N,000.35,257#280813#142836#V#07136.4088,W,1040.0580,N,000.49,288#280813#142846#V#07136.4098,W,1040.0590,N,000.59,264#280813#142856#V#07136.4093,W,1040.0605,N,000.30,264#280813#142906##"));

        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25476);verifyPosition(decoder, text(
                "#355488020132015##1#0000#AUT#01#510089246a34c0#10641.338800,E,619.427100,S,0.00,0.00#011113#161942.000##"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25477);verifyPosition(decoder, text(
                "#359094025419110#bigfriend#0#1234#AUTO#1##04632.8846,W,2327.2264,S,0.00,0.00#220913#234808##"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25478);verifyPosition(decoder, text(
                "#353588102031599##1#0000#AUT#01#41300304843fc1#7955.124400,E,642.095500,N,5.28,95.21#041213#074431.000##"));
        
        __CLR4_5_2jn6jn6lx1e0kqh.R.inc(25479);verifyPosition(decoder, text(
                "1#0000#AUT#01#23403007fa650e#16.747700,W,5136.356500,N,0.00,0.00#040415#002051.000"));

    }finally{__CLR4_5_2jn6jn6lx1e0kqh.R.flushNeeded();}}

}
