/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class VisiontekProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jnsjnslx1e1oe0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,25490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jnsjnslx1e1oe0.R.globalSliceStart(getClass().getName(),25480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jnsjnslx1e1oe0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jnsjnslx1e1oe0.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.VisiontekProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjns() throws Exception{try{__CLR4_5_2jnsjnslx1e1oe0.R.inc(25480);

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25481);VisiontekProtocolDecoder decoder = new VisiontekProtocolDecoder(new VisiontekProtocol());

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25482);verifyPosition(decoder, text(
                "$1,117,28,01,16,15,05,48,1725.0518N,07824.5298E,0620,11,0,185,2062,0,0,0,1,1,1,1,24,00.0000,00.3740,00.0000,VAJRA V1.00,A"));

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25483);verifyPosition(decoder, text(
                "$1,VMC,358072044271838,26,10,15,10,43,20,17.066418N,080.395667E,000.0,285,00.8,0074,6390,0,0,0,0,0,0,0,0,00.00,00.00,00,00,0000,12.7,4.0,24,10,0000000000000,A,0"));

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25484);verifyNothing(decoder, text(
                "$1,VMC,358072044271838,25,10,15,09,19,40,00.0000000,000.0000000,000.0,000,00.0,0000,6070,0,0,0,0,0,0,0,0,00.00,00.00,00,00,0000,12.5,4.0,99,00,0000000000000,V,0"));

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25485);verifyPosition(decoder, text(
                "$1,AP116,05,06,15,11,48,32,1725.0460N,07824.5289E,0617,07,0,030,2091,0,0,0,1,1,1,1,20,00.0000,00.3820,00.0000,VAJRA V1.00,A"));

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25486);verifyPosition(decoder, text(
                "$1,AP09BU9397,861785006462448,20,06,14,15,03,28,17267339N,078279407E,060.0,073,0550,11,0,1,0,0,1,1,26,A,0000000000"),
                position("2014-06-20 15:03:28.000", true, 17.44556, 78.46567));

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25487);verifyNothing(decoder, text(
                "$1,AP09BU9397,861785006462448,20,06,14,15,03,28,000000000,0000000000,000.0,000,0000,00,0,1,0,0,1,1,24,V,0000000000"));
        
        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25488);verifyNothing(decoder, text(
                "$1,1234567890,02,06,11,17,07,45,00000000,000000000,00.0,0,0,V"));

        __CLR4_5_2jnsjnslx1e1oe0.R.inc(25489);verifyPosition(decoder, text(
                "$1,1234567890,02,06,11,17,07,45,17267690N,078279340E,060.0,113,0,A"));

    }finally{__CLR4_5_2jnsjnslx1e1oe0.R.flushNeeded();}}

}
