/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class LaipacProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bbtbbtlx1e82an{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565619500L,8589935092L,14707,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bbtbbtlx1e82an.R.globalSliceStart(getClass().getName(),14681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bbtbbtlx1e82an.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bbtbbtlx1e82an.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.LaipacProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbbt() throws Exception{try{__CLR4_5_2bbtbbtlx1e82an.R.inc(14681);

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14682);LaipacProtocolDecoder decoder = new LaipacProtocolDecoder(new LaipacProtocol());

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14683);assertNull(decoder.decode(null, null, "$AVSYS,99999999,V1.50,SN0000103,32768*15"));
        
        __CLR4_5_2bbtbbtlx1e82an.R.inc(14684);assertNull(decoder.decode(null, null, "$ECHK,99999999,0*35"));
        
        __CLR4_5_2bbtbbtlx1e82an.R.inc(14685);assertNull(decoder.decode(null, null, "$AVSYS,MSG00002,14406,7046811160,64*1A"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14686);assertNull(decoder.decode(null, null, "$EAVSYS,MSG00002,8931086013104404999,,Owner,0x52014406*76"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14687);assertNull(decoder.decode(null, null, "$ECHK,MSG00002,0*5E"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14688);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,A,4351.0542,N,07923.5445,W,0.29,78.66,180703,0,3.727,17,1,0,0*37"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14689);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,a,4351.0542,N,07923.5445,W,0.29,78.66,180703,0,3.727,17,1,0,0*17"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14690);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,v,4351.0542,N,07923.5445,W,0.29,78.66,180703,0,3.727,17,1,0,0*00"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14691);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,r,4351.0542,N,07923.5445,W,0.29,78.66,180703,0,3.727,17,1,0,0*04"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14692);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,A,4351.0542,N,07923.5445,W,0.29,78.66,180703,S,3.727,17,1,0,0*54"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14693);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,A,4351.0542,N,07923.5445,W,0.29,78.66,180703,T,3.727,17,1,0,0*53"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14694);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,A,4351.0542,N,07923.5445,W,0.29,78.66,180703,3,3.727,17,1,0,0*34"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14695);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,A,4351.0542,N,07923.5445,W,0.29,78.66,180703,X,3.727,17,1,0,0*5F"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14696);verify(decoder.decode(null, null,
                "$AVRMC,99999999,164339,A,4351.0542,N,07923.5445,W,0.29,78.66,180703,4,3.727,17,1,0,0*33"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14697);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,003016,v,0000.0000,N,00000.0000,E,0.00,0.00,200614,0,3804,167,1,0,0,0D7AB913,020408*23"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14698);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,003049,V,0000.0000,N,00000.0000,E,0.00,0.00,200614,H,3804,167,1,0,0,0D7AB913,020408*71"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14699);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,041942,V,0000.0000,N,00000.0000,E,0.00,0.00,200614,H,4115,167,1,0,0*0E"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14700);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,043703,V,0000.0000,N,00000.0000,E,0.00,0.00,200614,H,4115,167,1,0,0*07"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14701);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,043750,V,0000.0000,N,00000.0000,E,0.00,0.00,200614,H,4115,167,1,0,0*01"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14702);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,124022,V,0000.0000,N,00000.0000,E,0.00,0.00,240614,3,4076,167,1,0,0,0D7AB913,020408*0D"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14703);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,124058,A,5053.0447,N,00557.8549,E,0.45,65.06,240614,0,4037,167,1,0,0,0D7AB913,020408*26"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14704);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,124144,A,5053.0450,N,00557.8544,E,0.00,65.06,240614,3,4076,167,1,0,0,0D7AB913,020408*26"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14705);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,125142,R,5053.0442,N,00557.8694,E,1.21,40.90,240614,0,4037,167,1,0,0,0D7AB913,020408*33"));

        __CLR4_5_2bbtbbtlx1e82an.R.inc(14706);verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,125517,R,5053.0442,N,00557.8694,E,0.00,0.00,240614,H,4076,167,1,0,0,0D7AB913,020408*75"));
        
        /*verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,043104,p,5114.4664,N,00534.3308,E,0.00,0.00,280614,0,4115,495,1,0,0,0D48C3DC,020408*52"));
        
        verify(decoder.decode(null, null,
                "$AVRMC,MSG00002,050601,P,5114.4751,N,00534.3175,E,0.00,0.00,280614,0,4115,495,1,0,0,0D48C3DC,020408*7D"));*/

    }finally{__CLR4_5_2bbtbbtlx1e82an.R.flushNeeded();}}

}
