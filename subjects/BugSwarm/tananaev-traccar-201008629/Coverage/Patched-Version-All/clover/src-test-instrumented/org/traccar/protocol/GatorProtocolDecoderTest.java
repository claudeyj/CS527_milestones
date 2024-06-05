/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class GatorProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ikpikplx1e1o24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,24085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testDecodeId() {__CLR4_5_2ikpikplx1e1o24.R.globalSliceStart(getClass().getName(),24073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vl94xuikp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ikpikplx1e1o24.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ikpikplx1e1o24.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GatorProtocolDecoderTest.testDecodeId",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vl94xuikp(){try{__CLR4_5_2ikpikplx1e1o24.R.inc(24073);
        
        __CLR4_5_2ikpikplx1e1o24.R.inc(24074);Assert.assertEquals("3512345006", GatorProtocolDecoder.decodeId(12, 162, 50, 134));
        
    }finally{__CLR4_5_2ikpikplx1e1o24.R.flushNeeded();}}

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ikpikplx1e1o24.R.globalSliceStart(getClass().getName(),24075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehikr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ikpikplx1e1o24.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ikpikplx1e1o24.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GatorProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehikr() throws Exception{try{__CLR4_5_2ikpikplx1e1o24.R.inc(24075);

        __CLR4_5_2ikpikplx1e1o24.R.inc(24076);GatorProtocolDecoder decoder = new GatorProtocolDecoder(new GatorProtocol());

        __CLR4_5_2ikpikplx1e1o24.R.inc(24077);verifyAttributes(decoder, binary(
                "2424800026364101b31608041108380273453415301532000000008000010000122800000124000000c40d"));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24078);verifyNothing(decoder, binary(
                "242421000658e3d851150d"));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24079);verifyAttributes(decoder, binary(
                "242480002658e3d851a60101c662bc00000000000000000000000000470007a30b0c00b10fc900ff00460d"));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24080);verifyNothing(decoder, binary(
                "242421000643e30282070d"));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24081);verifyPosition(decoder, binary(
                "24248000260009632d141121072702059226180104367500000000c04700079c0c34000ad80b00ff000a0d"),
                position("2014-11-21 07:27:02.000", true, 59.37697, 10.72792));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24082);verifyPosition(decoder, binary(
                "24248100230CA23285100306145907022346901135294700000000C04001012C0E1100000021CB0D"));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24083);verifyPosition(decoder, binary(
                "2424800023c2631e00111220104909833268648703804100000000c0470000000b4e00000000550d"),
                position("2011-12-20 10:49:09.000", true, -33.44773, -70.63402));

        __CLR4_5_2ikpikplx1e1o24.R.inc(24084);verifyPosition(decoder, binary(
                "24248000260009632d141121072702059226180104367500000000c04700079c0c34000ad80b00ff000a0d"));
        
    }finally{__CLR4_5_2ikpikplx1e1o24.R.flushNeeded();}}

}
