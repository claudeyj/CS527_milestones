/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class V680ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bmmbmmlx1e82go{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565619500L,8589935092L,15089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bmmbmmlx1e82go.R.globalSliceStart(getClass().getName(),15070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bmmbmmlx1e82go.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bmmbmmlx1e82go.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.V680ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbmm() throws Exception{try{__CLR4_5_2bmmbmmlx1e82go.R.inc(15070);

        __CLR4_5_2bmmbmmlx1e82go.R.inc(15071);V680ProtocolDecoder decoder = new V680ProtocolDecoder(new V680Protocol());
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15072);assertNull(decoder.decode(null, null,
                "#353588102019155"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15073);verify(decoder.decode(null, null,
                "#356823031193431##0#0000#SF#1#72403#V#04702.3025,W,2252.18380,S,008.18,0#090413#134938"));

        __CLR4_5_2bmmbmmlx1e82go.R.inc(15074);verify(decoder.decode(null, null,
                "#356823033219838#1000#0#1478#AUT#1#66830FFB#03855.6628,E,4716.6821,N,001.41,259#130812#143905"));

        __CLR4_5_2bmmbmmlx1e82go.R.inc(15075);verify(decoder.decode(null, null,
                "#353588102019155##1#0000#AUT#01#7240060be7873f#4849.079800,W,2614.458200,S,0.00,0.00#130413#182110.000"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15076);verify(decoder.decode(null, null,
                "#353588302045917##1#0000#AUT#01#7243141c2b14c3#4738.442300,W,2334.874000,S,0.00,0.30#170413#004831.000"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15077);verify(decoder.decode(null, null,
                "#352897045085282##0#0000#AUT#1#72400510730208,00d36307,10734fc4#4647.8922,W,2339.1956,S,2.60,63.74#200413#094310.000"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15078);verify(decoder.decode(null, null,
                "#356823033537791##0#0000#AUT#1#V#03610.2179,E,5004.5796,N,000.01,349#180513#073758"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15079);verify(decoder.decode(null, null,
                "#356823031236214##0#0000#AUT#1#V#01904.5491,E,6941.0085,N,000.09,248#170513#160140"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15080);assertNull(decoder.decode(null, null,
                "#353588550032869##1#0000#AUT#01#72400401cd01a5#00000.0000,E,0000.0000,N,0.00,#000000#000000.000"));

        __CLR4_5_2bmmbmmlx1e82go.R.inc(15081);verify(decoder.decode(null, null,
                "#352897045085282##0#0000#AUT#1#72400510730208,00d36307,10734fc4#4647.8922,W,2339.1956,S,2.60,63.74#200413#094310.000##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15082);verify(decoder.decode(null, null,
                "#352165050199210##13#0000#AUT#1#72400605471305,054712fd,054712ff#05144.0008,W,3005.5011,S,0.11,201.46#260713#172647.000##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15083);verify(decoder.decode(null, null,
                "#356823031166908#13001190527#0#0000#AUT#4#V#07136.4070,W,1040.0575,N,000.35,257#280813#142836#V#07136.4088,W,1040.0580,N,000.49,288#280813#142846#V#07136.4098,W,1040.0590,N,000.59,264#280813#142856#V#07136.4093,W,1040.0605,N,000.30,264#280813#142906##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15084);verify(decoder.decode(null, null,
                "#135790246811222#13486119277#1#0000#SOS#1#27bc10af#11407.4182,E,2232.7632,N,0.00,79.50#070709#134147.000##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15085);verify(decoder.decode(null, null,
                "#355488020132015##1#0000#AUT#01#510089246a34c0#10641.338800,E,619.427100,S,0.00,0.00#011113#161942.000##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15086);verify(decoder.decode(null, null,
                "#359094025419110#bigfriend#0#1234#AUTO#1##04632.8846,W,2327.2264,S,0.00,0.00#220913#234808##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15087);verify(decoder.decode(null, null,
                "#353588102031599##1#0000#AUT#01#41300304843fc1#7955.124400,E,642.095500,N,5.28,95.21#041213#074431.000##"));
        
        __CLR4_5_2bmmbmmlx1e82go.R.inc(15088);verify(decoder.decode(null, null,
                "1#0000#AUT#01#23403007fa650e#16.747700,W,5136.356500,N,0.00,0.00#040415#002051.000"));

    }finally{__CLR4_5_2bmmbmmlx1e82go.R.flushNeeded();}}

}
