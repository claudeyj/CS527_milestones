/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

public class AdmProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ialiallx1e1nwh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,23717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ialiallx1e1nwh.R.globalSliceStart(getClass().getName(),23709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehial();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ialiallx1e1nwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ialiallx1e1nwh.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AdmProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehial() throws Exception{try{__CLR4_5_2ialiallx1e1nwh.R.inc(23709);

        __CLR4_5_2ialiallx1e1nwh.R.inc(23710);AdmProtocolDecoder decoder = new AdmProtocolDecoder(new AdmProtocol());

        __CLR4_5_2ialiallx1e1nwh.R.inc(23711);verifyNothing(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "010042033836313331313030323639343838320501000000000000000000000000000000000000000000000000000000000000000000000000000000000000000073"));

        __CLR4_5_2ialiallx1e1nwh.R.inc(23712);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01002680336510002062A34C423DCF8E42A50B1700005801140767E30F568F2534107D220000"));

        __CLR4_5_2ialiallx1e1nwh.R.inc(23713);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "010022003300072020000000000000000044062A330000000000107F10565D4A8310"));

        __CLR4_5_2ialiallx1e1nwh.R.inc(23714);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "0100268033641080207AA34C424CCF8E4239030800005B01140755E30F560000F00F70220000"));

        __CLR4_5_2ialiallx1e1nwh.R.inc(23715);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01002680336510002062A34C423DCF8E42A50B1700005801140767E30F568F2534107D220000"));

        __CLR4_5_2ialiallx1e1nwh.R.inc(23716);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01002200333508202000000000000000007F0D9F030000000000E39A1056E24A8210"));

    }finally{__CLR4_5_2ialiallx1e1nwh.R.flushNeeded();}}

}
