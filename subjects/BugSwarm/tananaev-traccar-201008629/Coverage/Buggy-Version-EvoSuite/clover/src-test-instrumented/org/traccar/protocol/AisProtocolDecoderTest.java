/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AisProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2i7fi7flx1dvgte{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,23599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2i7fi7flx1dvgte.R.globalSliceStart(getClass().getName(),23595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehi7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i7fi7flx1dvgte.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i7fi7flx1dvgte.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AisProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehi7f() throws Exception{try{__CLR4_5_2i7fi7flx1dvgte.R.inc(23595);

        __CLR4_5_2i7fi7flx1dvgte.R.inc(23596);AisProtocolDecoder decoder = new AisProtocolDecoder(new AisProtocol());

        __CLR4_5_2i7fi7flx1dvgte.R.inc(23597);verifyPositions(decoder, text(
                "!AIVDM,2,1,8,A,53UlSb01l>Ei=H4KF218PTpv222222222222221?8h=766gB0<Ck11DTp888,0*14s:MTb827ebc7686b,c:1481688227737*4d\\\r\n" +
                "!AIVDM,2,2,8,A,88888888888,2*24\r\n" +
                "!AIVDM,1,1,,A,13T=Qr0P001cmmLEf;A00?wN0PSU,0*29\r\n" +
                "!AIVDM,1,1,,A,35Qf023Ohi1n5gdDRLW5FSQP00u@,0*18\r\n" +
                "!AIVDM,1,1,,A,B3P@f>0000K6J;5KAIT03wpUkP06,0*5D\\s:MTb827ebc7686b,c:1481688230418*45\\\r\n" +
                "!AIVDM,1,1,,B,B52Q8a@00Ul`9N5@ssbmCwr5oP06,0*36\r\n" +
                "!AIVDM,1,1,,A,1815<S@01VQnKGlE0sk:WHcT0@O4,0*78\r\n" +
                "!AIVDM,1,1,,A,35N7G;5OhQG?oJfE`G`cM9E`0001,0*6C\r\n" +
                "!AIVDM,1,1,,B,13Ug;r0P011cqHJEevuEiOwf0L3h,0*6A\r\n" +
                "!AIVDM,1,1,,A,13MKsr?0001dJC2Ee4W;jnal08Qj,0*00\r\n\r\n"));

        __CLR4_5_2i7fi7flx1dvgte.R.inc(23598);verifyPositions(decoder, text(
                "!AIVDM,1,1,,A,H3FUli4T000000000000001p0400,0*6E\\s:MTb827eba584a8,c:1481688176110*46\\\r\n" +
                "!AIVDM,1,1,,B,13UhUh0P01QcoRTEdtB>4?v<2D=j,0*54\r\n\r\n"));

    }finally{__CLR4_5_2i7fi7flx1dvgte.R.flushNeeded();}}

}
