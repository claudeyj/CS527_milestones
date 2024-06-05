/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TotemProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bj0bj0lx1e46s0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bj0bj0lx1e46s0.R.globalSliceStart(getClass().getName(),14940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bj0bj0lx1e46s0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bj0bj0lx1e46s0.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TotemProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbj0() throws Exception{try{__CLR4_5_2bj0bj0lx1e46s0.R.inc(14940);

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14941);TotemProtocolDecoder decoder = new TotemProtocolDecoder(new TotemProtocol());

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14942);verify(decoder.decode(null, null,
                "$$BE863771024392112|AA$GPRMC,044704.000,A,1439.3334,N,12059.1417,E,0.00,0.00,200815,,,A*67|01.7|00.8|01.4|000000000000|20150820044704|14291265|00000000|4EECBF8B31|0000|0.0000|0002|00000|56E7"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14943);verify(decoder.decode(null, null,
                "$$AE860990002922822|AA$GPRMC,051002.00,A,0439.26245,N,10108.94448,E,0.023,,140315,,,A*71|02.98|01.95|02.26|000000000000|20150314051003|13841157|105A3B1C|0000|0.0000|0005|5324"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14944);verify(decoder.decode(null, null,
                "$$AE860990002922822|AA$GPRMC,051002.00,A,0439.26245,N,10108.94448,E,0.023,,140315,,,A*71|02.98|01.95|02.26|000000000000|20150314051003|13841157|105A3B1C|0000|0.0000|0005|5324\r"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14945);assertNull(decoder.decode(null, null,
                "$$BB862170017856731|AA$GPRMC,000000.00,V,0000.0000,N,00000.0000,E,000.0,000.0,000000,,,A*73|00.0|00.0|00.0|000000001000|20000000000000|13790000|00000000|00000000|00000000|0.0000|0007|8C23"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14946);verify(decoder.decode(null, null,
                "$$B8862170017856731|AA$GPRMC,171849.00,A,3644.9893,N,01012.9927,E,0.049,51,200813,,,A*73|1.59|0.97|1.25|100000001000|20130820171849|13690000|00000000|019BD508|00000000|0.0000|0026|1B2C"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14947);verify(decoder.decode(null, null,
                "$$B2359772032984289|AA$GPRMC,104446.000,A,5011.3944,N,01439.6637,E,0.00,,290212,,,A*7D|01.8|00.9|01.5|000000100000|20120229104446|14151221|00050000|046D085E|0000|0.0000|1170|29A7"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14948);verify(decoder.decode(null, null,
                "$$8B862170017861566|AA180613080657|A|2237.1901|N|11402.1369|E|1.579|178|8.70|100000001000|13811|00000000|253162F5|00000000|0.0000|0014|2B16"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14949);verify(decoder.decode(null, null,
                "$$72862170017856731|3913090911165280000370000000000000000019BD508A0400000003.400000093644.9817N01012.9944E00506F2E"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14950);verify(decoder.decode(null, null,
                "$$B0456123|61$GPRMC,114725.00,A,1258.68276,N,07730.60237,E,0.410,,080113,,,A*79|1.44|0.66|1.27|000000000000|20130108114425|03600000|00000000|053C2BFE|0000|0.3325|0063|2005"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14951);assertNull(decoder.decode(null, null,
                "$$AE359772033395899|AA000000000000000000000000000000000000000000000000000000000000|00.0|00.0|00.0|000000000000|20090215000153|13601435|00000000|00000000|0000|0.0000|0007|2DAA"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14952);assertNull(decoder.decode(null, null,
                "$$AE359772033395899|AA000000000000000000000000000000000000000000000000000000000000|00.0|00.0|00.0|00000000|20090215001204|14182037|00000000|0012D888|0000|0.0000|0016|5B51"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14953);assertNull(decoder.decode(null, null,
                "$$AE359772033395899|AA00000000000000000000000000000000000000000000000000000000000|00.0|00.0|00.0|00000000000|20090215001337|14182013|00000000|0012D888|0000|0.0000|0017|346E"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14954);verify(decoder.decode(null, null,
                "$$B3359772032399074|60$GPRMC,094859.000,A,3648.2229,N,01008.0976,E,0.00,,221211,,,A*79|02.3|01.3|02.0|000000000000|20111222094858|13360808|00000000|00000000|0000|0.0000|0001||A977"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14955);verify(decoder.decode(null, null,
                "$$B3359772032399074|09$GPRMC,094905.000,A,3648.2229,N,01008.0976,E,0.00,,221211,,,A*71|02.1|01.3|01.7|000000000000|20111222094905|03210533|00000000|00000000|0000|0.0000|0002||FA58"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14956);verify(decoder.decode(null, null,
                "$$B3359772032399074|AA$GPRMC,093911.000,A,3648.2146,N,01008.0977,E,0.00,,140312,,,A*7E|02.1|01.1|01.8|000000000000|20120314093910|04100057|00000000|0012D887|0000|0.0000|1128||C50E"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14957);verify(decoder.decode(null, null,
                "$$B3359772032399074|AA$GPRMC,094258.000,A,3648.2146,N,01008.0977,E,0.00,,140312,,,A*7F|02.1|01.1|01.8|000000000000|20120314094257|04120057|00000000|0012D887|0000|0.0000|1136||CA32"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14958);verify(decoder.decode(null, null,
                "$$B3359772032399074|AA$GPRMC,234603.000,A,3648.2179,N,01008.0962,E,0.00,,030412,,,A*74|01.8|01.0|01.5|000000000000|20120403234603|14251914|00000000|0012D888|0000|0.0000|3674||940B"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14959);verify(decoder.decode(null, null,
                "$$B3359772032399074|AA$GPRMC,234603.000,A,3648.2179,N,01008.0962,E,0.00,,030412,,,A*74|01.8|01.0|01.5|000000000000|20120403234603|14251914|00000000|0012D888|0000|0.0000|3674|940B"));
        
        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14960);verify(decoder.decode(null, null,
                "$$B2356895037578518|AA$GPRMC,173829.000,A,3740.4107,N,02129.9815,E,0.00,,111113,,,A*7B|02.6|01.6|02.1|000000000000|20131111173829|14041251|00000000|002E0DD7|0000|0.0240|6010|8128"));

        __CLR4_5_2bj0bj0lx1e46s0.R.inc(14961);verify(decoder.decode(null, null,
                "$$B2356895037578518|AA$GPRMC,203823.000,A,3740.3285,N,02129.9295,E,0.00,,111113,,,A*79|01.5|01.0|01.1|000000000000|20131111203823|14041251|00000000|002E0DD7|0000|0.0000|6371|3824"));

    }finally{__CLR4_5_2bj0bj0lx1e46s0.R.flushNeeded();}}

}
