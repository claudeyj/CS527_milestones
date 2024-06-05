/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EasyTrackProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_28ro8rolx1dp9s0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564743050L,8589935092L,11374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_28ro8rolx1dp9s0.R.globalSliceStart(getClass().getName(),11364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49eh8ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ro8rolx1dp9s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ro8rolx1dp9s0.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.EasyTrackProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11364,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49eh8ro() throws Exception{try{__CLR4_5_28ro8rolx1dp9s0.R.inc(11364);

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11365);EasyTrackProtocolDecoder decoder = new EasyTrackProtocolDecoder(new EasyTrackProtocol());

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11366);assertNull(decoder.decode(null, null, "*ET,135790246811221,GZ,0001,0005"));

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11367);verify(decoder.decode(null, null,
                "*ET,135790246811221,DW,A,0A090D,101C0D,00CF27C6,0413FA4E,0000,0000,00000000,20,4,0000,00F123"));

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11368);verify(decoder.decode(null, null,
                "*ET,135790246811221,DW,A,050915,0C2A27,00CE5954,04132263,0000,0000,01000000,20,4,0000,001254"));

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11369);verify(decoder.decode(null, null,
                "*ET,135790246811221,DW,A,0A090D,101C0D,00CF27C6,0413FA4E,0000,0000,00000000,20,4,0000,00F123,100"));

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11370);verify(decoder.decode(null, null,
                "*ET,135790246811221,DW,A,0A090D,101C0D,00CF27C6,8413FA4E,0000,0000,00000000,20,4,0000,00F123,100"));

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11371);verify(decoder.decode(null, null,
                "*ET,358155100003016,HB,A,0d081e,07381e,8038ee09,03d2e9be,004f,0000,40c00000,0f,100,0000,00037c,29"));
        
        __CLR4_5_28ro8rolx1dp9s0.R.inc(11372);verify(decoder.decode(null, null,
                "*ET,358155100003016,HB,A,0d081e,073900,8038ee2f,03d2e9fd,0114,0000,40c00000,12,100,0000,00037c,32"));

        __CLR4_5_28ro8rolx1dp9s0.R.inc(11373);verify(decoder.decode(null, null,
                "*ET,135790246811221,HB,A,050915,0C2A27,00CE5954,04132263,0000,0000,01000000,20,4,0000,00F123,100,200"));

    }finally{__CLR4_5_28ro8rolx1dp9s0.R.flushNeeded();}}

}
