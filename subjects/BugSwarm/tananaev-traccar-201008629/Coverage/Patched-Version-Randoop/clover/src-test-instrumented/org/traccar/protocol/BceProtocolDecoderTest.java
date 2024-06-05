/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class BceProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ieaiealx1e0kbs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565269350L,8589935092L,23850,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ieaiealx1e0kbs.R.globalSliceStart(getClass().getName(),23842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ieaiealx1e0kbs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ieaiealx1e0kbs.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.BceProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23842,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiea() throws Exception{try{__CLR4_5_2ieaiealx1e0kbs.R.inc(23842);

        __CLR4_5_2ieaiealx1e0kbs.R.inc(23843);BceProtocolDecoder decoder = new BceProtocolDecoder(new BceProtocol());

        __CLR4_5_2ieaiealx1e0kbs.R.inc(23844);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "be76619c834601004200a0003fd769c568ffc3db0079161d420683a9414918b1150000000000d102660167040000000000009f06357f0000a401042ea415e10232000000000000000000000051"));

        __CLR4_5_2ieaiealx1e0kbs.R.inc(23845);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "be76619c834601004200a0003ff76cc568ffc3db00bd151d423c8ca9410a18af150000000000d1023a0160040000000000009f06427f0000a401042ea416e1003e00000000000000000000009a"));

        __CLR4_5_2ieaiealx1e0kbs.R.inc(23846);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "be76619c834601004202a5863f57f8b868ffc3db0001712642b70b9d41221946200246d23342d1023e016404000000000000a0065a7f0000a4010496f277e3064300000000000000000000003f97f8b868ffc3db0074712642ae0a9d412919452102fff19042d102a4026304000000000000a006487f0000a4010496f277e3064300000000000000000000003fb7f8b868ffc3db00c6712642000a9d413019442002a6074542d102300165040000000000009f064f7f0000a4010496f277e3064300000000000000000000003fd7f8b868ffc3db002872264245099d413518421f02bea35e42d1021e0164040000000000009f06377f0000a4010496f277e3064300000000000000000000003fe7f8b868ffc3db0061722642e3089d413a28421f02a05ff641d102580163040000000000009f06577f0000a4010496f277e3064300000000000000000000003f17f9b868ffc3db0021732642a3079d414119411d02d69fcc42d102440165040000000000009f06437f0000a4010496f277e3064300000000000000000000003f37f9b868ffc3db00ae732642b4069d414628421b02e0629742d1024c0167040000000000009f06557f0000a4010496f277e3064300000000000000000000003f57f9b868ffc3db0044742642ae059d414c28421a027540a342d102860163040000000000009f065b7f0000a4010496f277e3064300000000000000000000003f97f9b868ffc3db007275264256039d4153284417029e1f2f43d1024a016704000000000000a0064e7f0000a4010496f277e306430000000000000000000000db"));

        __CLR4_5_2ieaiealx1e0kbs.R.inc(23847);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "2d41abfa2e4501004e02a5a0068609f96a009106260af96a00a006260af96a009106960af96a00a306a60af96a008f06b60af96a009106960cf96a00a03e0715f96affc300804000e6a23a4230ccc441001f47850200000000a0000000bd6542651a110d004b1000000000a401045a56bf4d02480000000000000000061623f96a00a0062623f96a00913ea728f96affc300804000e6a23a4230ccc441001f7f850200000000a0000000bd6542651a110d004a1000000000a401045a56bf4d02480000000000000000069639f96a00a006a639f96a00913e373cf96affc300804000e6a23a4230ccc441001f7f850200000000a0000000ad6534651a110d004a1000000000a401045a56bf4d024800000000000000003ed74ff96affc300804000e6a23a4230ccc441001f7f850200000000a0000000ad6534651a111b004a1000000000a401045a56bf4d01480000000000000000061650f96a00a0062650f96a00913e6763f96affc300804000e6a23a4230ccc441001f7f850200000000a0000000ad6534651a110d004a1000000000a401045a56bf4d01480000000000000000069666f96a00a006a666f96a00913e0777f96affc300804000e6a23a4230ccc441001f7f850200000000a0000000ad6534651a110d004a1000000000a401045a56bf4d0148000000000000000006067df96a00a006167df96a0091063687f96a00a3064687f96a008f065687f96a0091063689f96a00a03e978af96affc300804000e6a23a4230ccc441001f87850200000000a0000000ad6527651a110d004a1000000000a401045a56bf4d024800000000000000000e"));
        
        __CLR4_5_2ieaiealx1e0kbs.R.inc(23848);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "be76619c834601003302a5e8327764726bff432fc52a420e2c93410028afd2070000000080024a0005040000000000008e06547f0000a401043cf21f390e54328764726bff432fc52a420e2c93410028afd2070000000080024c0005040000000000008e064f7f0000a401043cf21f390e54329764726bff432fc52a420e2c93410028afd2070000000080024e0002040000000000008d064f7f0000a401043cf21f390e5432a764726bff432fc52a420e2c93410028afd2070000000080024e0004040000000000008e06587f0000a401043cf21f390e5432b764726bff432fc52a420e2c93410028afd207000000008002460005040000000000008e06557f0000a401043cf21f390e5432c764726bff432fc52a420e2c93410028afd2070000000080024e0004040000000000008e06347f0000a401043cf21f390e5432d764726bff432fc52a420e2c93410028afd2070000000080024e0002040000000000008e06547f0000a401043cf21f390e5432e764726bff432fc52a420e2c93410028afd207000000008002540002040000000000008e06477f0000a401043cf21f390e5432f764726bff432fc52a420e2c93410028afd207000000008002540004040000000000008d064f7f0000a401043cf21f390e54320765726bff432fc52a420e2c93410028afd207000000008002540004040000000000008e064d7f0000a401043cf21f390e54321765726bff432fc52a420e2c93410028afd207000000008002540004040000000000008e06467f0000a401043cf21f390e544200a0003f3743c96bffc3db0060c81c42d885ab41002aaf060000000000d102380167040000000000008a064f7f0000a4010412a46b330033000000000000000000000025"));

        __CLR4_5_2ieaiealx1e0kbs.R.inc(23849);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "ca07629c834601002702a58f3c278ff96a0bc000a0c00140bc3a42508bc541002a70a905000000009000c101a40103d904440e003000000000000000000000000000000000000001013c878ff96a0bc000a0c00140bc3a42508bc541002970a905000000009000c301a40103d904440e003000000000000000000000000000000000000001013cb7d2f96a0bc000a0c00124bc3a426b8fc5410428000404000000009000c401a40103d904440e003500000000000000000000000000000000000001013cc7d2f96a0bc000a0c00124bc3a426b8fc5410428000404000000009000c301a40103d904440e003500000000000000000000000000000000000001013cd7f2f96a0bc000a0c00114bc3a42a48fc5410029027e03000000009000c301a40103d904440e003000000000000000000000000000000000000001013c670dfa6a0bc000a0c001f1bb3a42418dc541002a484904000000009000c001a40103d904440e003a00000000000000000000000000000000000001013c770dfa6a0bc000a0c001f1bb3a42418dc5410028484904000000009000bf01a40103d904440e003a00000000000000000000000000000000000001013c470efa6a0bc000a0c001f1bb3a42418dc5410029484904000000009000bf01a40103d904440e003a00000000000000000000000000000000000001013c5711fa6a0bc000a0c001f1bb3a42418dc5410029484904000000009000c101a40103d904440e003000000000000000000000000000000000000001013f00a0003cc795866b0bc000a0c00144bc3a423a90c541003697cb03000000008000cf01a40103d9040d0f0030000000000000000000000000000000000000010100"));

    }finally{__CLR4_5_2ieaiealx1e0kbs.R.flushNeeded();}}

}