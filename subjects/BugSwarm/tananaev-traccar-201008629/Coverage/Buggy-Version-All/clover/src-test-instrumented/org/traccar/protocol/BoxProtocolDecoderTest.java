/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;


import org.junit.Test;
import org.traccar.ProtocolTest;

public class BoxProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ib8ib8lx1dxrvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,23750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ib8ib8lx1dxrvn.R.globalSliceStart(getClass().getName(),23732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehib8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ib8ib8lx1dxrvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ib8ib8lx1dxrvn.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.BoxProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehib8() throws Exception{try{__CLR4_5_2ib8ib8lx1dxrvn.R.inc(23732);

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23733);BoxProtocolDecoder decoder = new BoxProtocolDecoder(new BoxProtocol());
        
        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23734);verifyNothing(decoder, text(
                "H,BT,358281002435893,081028142432,F5813D19,6D6E6DC2"));
        
        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23735);verifyNothing(decoder, text(
                "H,BT,N878123,080415081234,D63E6DD9,6D6E6DC2,8944100300825505377"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23736);verifyPosition(decoder, text(
                "L,081028142429,G,52.51084,-1.70849,0,170,0,1,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23737);verifyPosition(decoder, text(
                "L,081028142432,G,52.51081,-1.70849,0,203,0,16,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23738);verifyNothing(decoder, text(
                "L,080528112501,AI1,145.56"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23739);verifyNothing(decoder, text(
                "E,1"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23740);verifyPosition(decoder, text(
                "L,150728150130,G,24.68312,46.67526,0,140,0,3,20;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23741);verifyPosition(decoder, text(
                "L,150728155815,G,24.68311,46.67528,0,140,0,6,21;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23742);verifyPosition(decoder, text(
                "L,150728155833,G,24.68311,46.67528,11,140,0,52,23;A,0.79;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23743);verifyPosition(decoder, text(
                "L,150728155934,G,24.68396,46.67489,0,282,0.12,1,21;A,1.27;D,1.23;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23744);verifyPosition(decoder, text(
                "L,150728160033,G,24.68414,46.67485,0,282,0.12,1,21;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23745);verifyPosition(decoder, text(
                "L,150728160133,G,24.68388,46.675,0,282,0.12,1,21;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23746);verifyPosition(decoder, text(
                "L,150728160233,G,24.68377,46.67501,0,282,0.12,1,21;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23747);verifyPosition(decoder, text(
                "L,150728160333,G,24.684,46.67488,0,282,0.12,1,21;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23748);verifyPosition(decoder, text(
                "L,150728155855,G,24.68413,46.67482,0,282,0.14,53,21;A,0;D,0;I,0"));

        __CLR4_5_2ib8ib8lx1dxrvn.R.inc(23749);verifyPosition(decoder, text(
                "L,150728160400,G,24.68413,46.67482,0,282,0.14,7,20;A,0;D,0;I,0;END,25,326,150728155814"));

    }finally{__CLR4_5_2ib8ib8lx1dxrvn.R.flushNeeded();}}

}
