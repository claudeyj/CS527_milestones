/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Tk102ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jd8jd8lx1dvh8y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,25114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jd8jd8lx1dvh8y.R.globalSliceStart(getClass().getName(),25100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jd8jd8lx1dvh8y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jd8jd8lx1dvh8y.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk102ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjd8() throws Exception{try{__CLR4_5_2jd8jd8lx1dvh8y.R.inc(25100);

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25101);Tk102ProtocolDecoder decoder = new Tk102ProtocolDecoder(new Tk102Protocol());

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25102);verifyNothing(decoder, buffer(
                "[\u0080000000000021315452]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25103);verifyNothing(decoder, buffer(
                "[\u00f0000000000021315452]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25104);verifyPosition(decoder, buffer(
                "[\u009001001000016(ONE025857A2232.0729N11356.0030E000.02109110100000000)]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25105);verifyPosition(decoder, buffer(
                "[\u009001001000016(ITV025857A2232.0729N11356.0030E000.02109110100000000)]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25106);verifyNothing(decoder, buffer(
                "[!0000000081r(353327023367238,TK102-W998_01_V1.1.001_130219,255,001,255,001,0,100,100,0,internet,0000,0000,0,0,255,0,4,1,11,00)]"));
        
        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25107);verifyNothing(decoder, buffer(
                "[L0000001323N(GSM,0,0,07410001,20120101162600,404,010,9261,130,0,2353,130,35,9263,130,33,1)]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25108);verifyNothing(decoder, buffer(
                "[%0000000082(100100000000000600-30-65535)]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25109);verifyNothing(decoder, buffer(
                "[#0000000004(062100000000000600-0-0)]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25110);verifyPosition(decoder, buffer(
                "[=00000000836(ITV013939A4913.8317N02824.9241E000.90018031310010000)]"));
        
        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25111);verifyPosition(decoder, buffer(
                "[=00000000366(ITV012209A4913.8281N02824.9258E000.32018031310010000)]"));
        
        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25112);verifyPosition(decoder, buffer(
                "[;00000000106(ONE200834A5952.8114N01046.0832E003.93212071305010000)]"));

        __CLR4_5_2jd8jd8lx1dvh8y.R.inc(25113);verifyPosition(decoder, buffer(
                "[\u00930000000000F(ITV153047A1534.0805N03233.0888E000.00029041500000400&Wsz-wl001&B0000)]"));

    }finally{__CLR4_5_2jd8jd8lx1dvh8y.R.flushNeeded();}}

}
