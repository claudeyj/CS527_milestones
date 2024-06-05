/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class GlobalSatProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2b6ab6alx1e781j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565580367L,8589935092L,14496,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2b6ab6alx1e781j.R.globalSliceStart(getClass().getName(),14482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehb6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b6ab6alx1e781j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b6ab6alx1e781j.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GlobalSatProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehb6a() throws Exception{try{__CLR4_5_2b6ab6alx1e781j.R.inc(14482);

        __CLR4_5_2b6ab6alx1e781j.R.inc(14483);GlobalSatProtocolDecoder decoder = new GlobalSatProtocolDecoder(new GlobalSatProtocol());

        __CLR4_5_2b6ab6alx1e781j.R.inc(14484);assertNull(decoder.decode(null, null, "GSh,131826789036289,3,M,ea04*3d"));

        __CLR4_5_2b6ab6alx1e781j.R.inc(14485);decoder.setFormat0("SORPZAB27GHKLMN*U!");

        __CLR4_5_2b6ab6alx1e781j.R.inc(14486);verify(decoder.decode(null, null,
                "GSr,011412001878820,4,5,00,,1,250114,105316,E00610.2925,N4612.1824,0,0.02,0,1,0.0,64*51!"));

        __CLR4_5_2b6ab6alx1e781j.R.inc(14487);verify(decoder.decode(null, null,
                "GSr,357938020310710,,4,04,,1,170315,060657,E00000.0000,N0000.0000,148,0.00,0,0,0.0,11991mV*6c!"));

        __CLR4_5_2b6ab6alx1e781j.R.inc(14488);decoder.setFormat0("TSPRXAB27GHKLMnaicz*U!");

        __CLR4_5_2b6ab6alx1e781j.R.inc(14489);verify(decoder.decode(null, null,
                "GSr,1,135785412249986,01,I,EA02,3,230410,153318,E12129.2839,N2459.8570,0,1.17,212,8,1.0,12.3V*55"));

        __CLR4_5_2b6ab6alx1e781j.R.inc(14490);verify(decoder.decode(null, null,
                "GSr,GTR-128,012896009148443,0040,5,0080,3,190813,185812,W11203.3661,N3330.2104,344,0.24,78,9,0.8,60%,0,0,12,\"310,410,0bdd,050d,02,21\",\"310,410,0bdd,0639,24,7\"*79"));

        __CLR4_5_2b6ab6alx1e781j.R.inc(14491);verify(decoder.decode(null, null,
                "$355632004245866,1,1,040202,093633,E12129.2252,N2459.8891,00161,0.0100,147,07,2.4"));

        __CLR4_5_2b6ab6alx1e781j.R.inc(14492);verify(decoder.decode(null, null,
                "$355632000959420,9,3,160413,230536,E03738.4906,N5546.3148,00000,0.3870,147,07,2.4"));
        
        __CLR4_5_2b6ab6alx1e781j.R.inc(14493);verify(decoder.decode(null, null,
                "$353681041893264,9,3,240913,100833,E08513.0122,N5232.9395,181.3,22.02,251.30,9,1.00"));

        /*verify(decoder.decode(null, null,
                "$353681041893264,9,4,230913,052449,\"250,99,B443,422E,42,37\",\"250,99,B443,4232,43,44\",\"250,99,B443,7910,40,32\",\"250,99,B443,B456,40,28\",\"250,99,B443,B455,40,27\""));*/

        __CLR4_5_2b6ab6alx1e781j.R.inc(14494);decoder.setFormat0("SPRXYAB27GHKLMmnaefghiotuvwb*U!");
        
        __CLR4_5_2b6ab6alx1e781j.R.inc(14495);verify(decoder.decode(null, null,
                "GSr,GTR-128,013227006963064,0080,1,a080,3,190615,163816,W07407.7134,N0440.8601,2579,0.01,130,12,0.7,11540mV,0,77,14,\"732,123,0744,2fc1,41,23\",\"732,123,0744,2dfe,05,28\",\"732,123,0744,272a,15,21\",\"732,123,0744,2f02,27,23\"*3b!"));

    }finally{__CLR4_5_2b6ab6alx1e781j.R.flushNeeded();}}

}
