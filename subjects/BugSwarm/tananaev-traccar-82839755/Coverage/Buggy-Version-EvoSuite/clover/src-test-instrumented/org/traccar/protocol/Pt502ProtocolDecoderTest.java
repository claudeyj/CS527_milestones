/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class Pt502ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bepbeplx1e39mf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565395579L,8589935092L,14797,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bepbeplx1e39mf.R.globalSliceStart(getClass().getName(),14785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bepbeplx1e39mf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bepbeplx1e39mf.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Pt502ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbep() throws Exception{try{__CLR4_5_2bepbeplx1e39mf.R.inc(14785);

        __CLR4_5_2bepbeplx1e39mf.R.inc(14786);Pt502ProtocolDecoder decoder = new Pt502ProtocolDecoder(new Pt502Protocol());
        
        __CLR4_5_2bepbeplx1e39mf.R.inc(14787);verify(decoder.decode(null, null,
                "$POS,216769295715,163237.000,A,3258.1738,S,02755.4350,E,0.00,215.88,100915,,,A/0000,0//232300//5b3/"));

        __CLR4_5_2bepbeplx1e39mf.R.inc(14788);verify(decoder.decode(null, null,
                "$POS,11023456,033731.000,A,0335.2617,N,09841.1587,E,0.00,88.12,210615,,,A/0000,0/1f8/388900//f33//"));

        __CLR4_5_2bepbeplx1e39mf.R.inc(14789);verify(decoder.decode(null, null,
                "$POS,6094,205523.000,A,1013.6223,N,06728.4248,W,0.0,99.3,011112,,,A/00000,00000/0/23895000//"));

        __CLR4_5_2bepbeplx1e39mf.R.inc(14790);verify(decoder.decode(null, null,
                "$POS,6120,233326.000,V,0935.1201,N,06914.6933,W,0.00,,151112,,,A/00000,00000/0/0/"));

        __CLR4_5_2bepbeplx1e39mf.R.inc(14791);verify(decoder.decode(null, null,
                "$POS,6002,233257.000,A,0931.0430,N,06912.8707,W,0.05,146.98,141112,,,A/00010,00000/0/5360872"));

        __CLR4_5_2bepbeplx1e39mf.R.inc(14792);verify(decoder.decode(null, null,
                "$POS,6095,233344.000,V,0933.0451,N,06912.3360,W,,,151112,,,N/00000,00000/0/1677600/"));

        __CLR4_5_2bepbeplx1e39mf.R.inc(14793);verify(decoder.decode(null, null,
                "$PHO0,6091,233606.000,A,0902.9855,N,06944.3654,W,0.0,43.8,141112,,,A/00010,00000/0/224000//"));
        
        __CLR4_5_2bepbeplx1e39mf.R.inc(14794);verify(decoder.decode(null, null,
                "$POS,353451000164,082405.000,A,1254.8501,N,10051.6752,E,0.00,237.99,160513,,,A/0000,0/0/55000//a71/"));
        
        __CLR4_5_2bepbeplx1e39mf.R.inc(14795);verify(decoder.decode(null, null,
                "$POS,012896008586486,154215.000,A,0118.0143,S,03646.9144,E,0.00,83.29,180714,,,A/0000,0/0/29200//644/"));
        
        __CLR4_5_2bepbeplx1e39mf.R.inc(14796);verify(decoder.decode(null, null,
                "$POS,1151000,205326.000,A,0901.3037,N,07928.2751,W,48.79,30.55,170814,,,A/00010,10000/0,0,0,0/15986500//fb8/"));

    }finally{__CLR4_5_2bepbeplx1e39mf.R.flushNeeded();}}

}
