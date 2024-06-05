/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class Tk103ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bhwbhwlx1e46ra{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bhwbhwlx1e46ra.R.globalSliceStart(getClass().getName(),14900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bhwbhwlx1e46ra.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bhwbhwlx1e46ra.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbhw() throws Exception{try{__CLR4_5_2bhwbhwlx1e46ra.R.inc(14900);

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14901);Tk103ProtocolDecoder decoder = new Tk103ProtocolDecoder(new Tk103Protocol());

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14902);verify(decoder.decode(null, null,
                "(088047365460BP05354188047365460150929A3258.1754S02755.4323E009.4193927301.9000000000L00000000)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14903);verify(decoder.decode(null, null,
                "(088048003342BP05354188048003342150917A1352.9801N10030.9050E000.0103115265.5600010000L000003F9)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14904);verify(decoder.decode(null, null,
                "(088048003342BR00150917A1352.9801N10030.9050E000.0103224000.0000010000L000003F9)"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14905);verify(decoder.decode(null, null,
                "(088048003342BR00150807A1352.9871N10030.9084E000.0110718000.0001010000L00000000)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14906);assertNull(decoder.decode(null, null,
                "(090411121854BP0000001234567890HSO"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14907);verify(decoder.decode(null, null,
                "(01029131573BR00150428A3801.6382N02351.0159E000.0080729278.7800000000LEF9ECB9C)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14908);verify(decoder.decode(null, null,
                "(035988863964BP05000035988863964110524A4241.7977N02318.7561E000.0123536356.5100000000L000946BB"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14909);verify(decoder.decode(null, null,
                "(013632782450BP05000013632782450120803V0000.0000N00000.0000E000.0174654000.0000000000L00000000"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14910);verify(decoder.decode(null, null,
                "(013666666666BP05000013666666666110925A1234.5678N01234.5678W000.002033490.00000000000L000024DE"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14911);verify(decoder.decode(null, null,
                "(013666666666BO012110925A1234.5678N01234.5678W000.0025948118.7200000000L000024DE"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14912);verify(decoder.decode(null, null,
                "\n\n\n(088045133878BR00130228A5124.5526N00117.7152W000.0233614352.2200000000L01B0CF1C"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14913);verify(decoder.decode(null, null,
                "(008600410203BP05000008600410203130721A4152.5790N01239.2770E000.0145238173.870100000AL0000000"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14914);verify(decoder.decode(null, null,
                "(013012345678BR00130515A4843.9703N01907.6211E000.019232800000000000000L00009239"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14915);verify(decoder.decode(null, null,
                "(012345678901BP05000012345678901130520A3439.9629S05826.3504W000.1175622323.8700000000L000450AC"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14916);verify(decoder.decode(null, null,
                "(012345678901BR00130520A3439.9629S05826.3504W000.1175622323.8700000000L000450AC"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14917);verify(decoder.decode(null, null,
                "(352606090042050,BP05,240414,V,0000.0000N,00000.0000E,000.0,193133,000.0"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14918);verify(decoder.decode(null, null,
                "(352606090042050,BP05,240414,A,4527.3513N,00909.9758E,4.80,112825,155.49"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14919);verify(decoder.decode(null, null,
                "(013632782450,BP05,101201,A,2234.0297N,11405.9101E,000.0,040137,178.48,00000000,L00000000"));
        
        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14920);verify(decoder.decode(null, null,
                "(864768010009188,BP05,271114,V,4012.19376N,00824.05638E,000.0,154436,000.0"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14921);verify(decoder.decode(null, null,
                "(013632651491,BP05,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14922);verify(decoder.decode(null, null,
                "(013632651491,ZC07,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14923);verify(decoder.decode(null, null,
                "(013632651491,ZC11,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14924);verify(decoder.decode(null, null,
                "(013632651491,ZC12,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14925);verify(decoder.decode(null, null,
                "(013632651491,ZC13,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14926);verify(decoder.decode(null, null,
                "(013632651491,ZC17,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14927);assertNull(decoder.decode(null, null,
                "(013632651491,ZC20,040613,040137,6,42,112,0)"));

        __CLR4_5_2bhwbhwlx1e46ra.R.inc(14928);verify(decoder.decode(null, null,
                "(094050000111BP05000094050000111150808A3804.2418N04616.7468E000.0201447133.3501000011L0028019DT000)"));

    }finally{__CLR4_5_2bhwbhwlx1e46ra.R.flushNeeded();}}

}