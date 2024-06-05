/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class CalAmpProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ibqibqlx1dwmsc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,23764,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ibqibqlx1dwmsc.R.globalSliceStart(getClass().getName(),23750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehibq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ibqibqlx1dwmsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ibqibqlx1dwmsc.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.CalAmpProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehibq() throws Exception{try{__CLR4_5_2ibqibqlx1dwmsc.R.inc(23750);

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23751);CalAmpProtocolDecoder decoder = new CalAmpProtocolDecoder(new CalAmpProtocol());

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23752);verifyPosition(decoder, binary(
                "83092701131797081078220107010200dc583d4d3f583d4d3f19c70502cd1d512d00005f180000008500ec0800101eff980f090100313102000000000000000000"));

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23753);verifyPosition(decoder, binary(
                "8305133303910501010102004557E5AB2457E3B3E01FD828DBFE9E3465000028C90000004201310704001EFFA12F0B22081BCA05000000000000000F87000E8E2F00EA029E0000082D"));

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23754);verifyPosition(decoder, binary(
                "8305313301481601010102045557ea2eba57ea2eba1ebf06db005f2e5e0000220c00000000000006200000ff8f000a00000bca06000000000000000f1b000f35ef00ea02900000087000000060"));

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23755);verifyPosition(decoder, binary(
                "8305454205067001010102008157a9bddc57a96aaa17cdb98fccc1a457000056ac00000000000007250000ff8f000e00082711570000000000ffff101b00003148000010680000000000000000000000050000000000000000000005b0000000000000289600000000000000000000069b00000000000008e400000000000000000000000000000003000000010000070f"));

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23756);verifyPosition(decoder, binary(
                "83052132052924010101020001575c590300000000000000000000000000000000000000000000002c0000ff8f0000030801010000"));
        
        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23757);verifyPosition(decoder, binary(
                "830543321494860101010a0080560b5a5e0eadd0291becf3c500f005090f1f3305000003010040c0a600000000000000008b12a102"));

        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23758);verifyPosition(decoder, binary(
                "830543321494860101010a0c215608b6680ead5ada1bed88d300000049801f000500000300003cf33200000000000000008b0ce101"));
        
        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23759);verifyNothing(decoder, binary(
                "830545321041830101010300010000333862000023c301000000004532104183ffffff353816051610691f420040163953294fffffffffffffffff8996604211639032949f4f54413a317c303b302c317c343b302c34004f5441535441543a302c302c302c302c302c222200564255533a342c322e302e302c343533323130343138332c5630312e30332e30312e34302c5630312e30332e30312e33312c2c0056494e2d494e464f3a56494e3d31464d5a5537324539355a4137303032362c4445562d5245474e3d55532c535256522d5245474e3d555300"));
        
        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23760);verifyPosition(decoder, binary(
                "8308353301059723580f01020102088952d994c352d994c4134fa767c4c482e20000c12700000d29006e1002019affc90f061d00060c0000"));
        
        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23761);verifyPosition(decoder, binary(
                "8308355233050116134f01020102445652d993e152d993e1124c728cc68f0647000023c00000000000000e02019affc90f071c0015020000"));
        
        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23762);verifyPosition(decoder, binary(
                "830545420185450101010200075517fb335516c5c40fb1aea4cf4cbf250000000000000000008900260015ffb10f001108110a0000"));
        
        __CLR4_5_2ibqibqlx1dwmsc.R.inc(23763);verifyPosition(decoder, binary(
                "830543321494750101010A00085492798A0EC4F9E71BDA3B81005600040F1F33050000030000000076000000000000000000000000"));

    }finally{__CLR4_5_2ibqibqlx1dwmsc.R.flushNeeded();}}

}
