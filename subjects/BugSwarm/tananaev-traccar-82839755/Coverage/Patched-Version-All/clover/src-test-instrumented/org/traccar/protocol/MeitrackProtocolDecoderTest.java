/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class MeitrackProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bdxbdxlx1e82b9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565619500L,8589935092L,14778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bdxbdxlx1e82b9.R.globalSliceStart(getClass().getName(),14757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bdxbdxlx1e82b9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bdxbdxlx1e82b9.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.MeitrackProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbdx() throws Exception{try{__CLR4_5_2bdxbdxlx1e82b9.R.inc(14757);

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14758);MeitrackProtocolDecoder decoder = new MeitrackProtocolDecoder(new MeitrackProtocol());

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14759);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$A158,79007001520234,AAA,35,40.996370,-8.575065,150730184834,A,8,24,0,1,1.3,173,32573389,31405012,268|3|2BC0|250B,2000,|||0A2D|0000,00000001,,50,,,,,,,,,,,,,*4A", Charset.defaultCharset())));
        
        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14760);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$G145,862106024274815,AAA,35,-1.287125,36.906061,150530054639,A,10,13,12,67,0.8,1621,38359791,42330881,639|2|FB2|2F3,0000,3|0|0|A58|432,,,1,0009,*26", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14761);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$I152,013949004569813,AAA,37,54.739468,25.273648,150208173414,A,5,24,0,73,1.5,165,74,3381,246|1|0065|118A,0000,0003|0003|0000|08D4|0002,006380DF,,1,0008*7C", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14762);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$E141,863071013799553,AAA,35,-1.264521,36.801128,150307132846,A,11,20,0.2,0,5,1767,84045888,36496633,639|02|100E|844,1234,0018|||025D|00CB,*17", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14763);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$m140,013777008931857,AAA,1,54.739580,25.273263,141120144603,V,0,25,0,6,50.0,159,19825,13940,246|1|0065|118A,0100,0000|0000|0000|092A|0001,,*1C", Charset.defaultCharset())));
        
        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14764);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$X138,862170010187175,AAA,35,-29.960365,-51.655455,130507201625,A,8,9,0,107,0.9,7,169322,126582,724|6|0547|132B,0000,0009|000A||0278|0000,*BE", Charset.defaultCharset())));
        
        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14765);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$X138,862170010187175,AAA,35,-29.960365,-51.655455,130507201625,A,8,9,0,107,0.9,-7,169322,126582,724|6|0547|132B,0000,0009|000A||0278|0000,*BE", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14766);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$]138,012896000475498,AAA,35,-6.138255,106.910545,121205074600,A,5,18,0,0,0,49,3800,24826,510|10|0081|4F4F,0000,0011|0012|0010|0963|0000,,*94", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14767);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$d138,012896000475498,AAA,35,-6.138255,106.910545,121205074819,A,7,18,0,0,0,49,3800,24965,510|10|0081|4F4F,0000,000D|0010|0012|0963|0000,,*BF", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14768);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$j138,012896000475498,AAA,35,-6.138306,106.910655,121205103708,A,3,11,0,0,1,36,4182,35025,510|10|0081|4F4F,0000,000A|000C|000A|0915|0000,,*BF", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14769);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$m139,012896005334567,AAA,35,-33.866423,151.190060,121208020649,A,7,27,0,32,4,13,6150,49517,505|2|0B67|5A6C,0000,0000|0000|0000|0977|0000,,*F1", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14770);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$A141,012896005334567,AAA,35,-33.866543,151.190148,121209081758,A,6,27,0,16,1,48,65551,152784,505|2|0B5F|D9D3,0000,0000|0000|0000|0A39|0000,,*5B", Charset.defaultCharset())));
        
        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14771);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$_128,861074020109479,AAA,34,22.512618,114.057065,090215000318,V,0,31,0,0,0,0,0,733,302|720|3EE4|BBB5,0000,0006|0006||028C|0000,*E3", Charset.defaultCharset())));
        
        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14772);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$K146,013227004985762,AAA,35,28.618005,-81.246783,131101213828,A,9,22,0,209,1.1,23,80974,1187923,310|260|2A13|634E,0000,0000|0000|0000|09DA|0B34,,*51", Charset.defaultCharset())));
        
        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14773);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$E150,013777001165479,AAA,35,10.296601,123.872115,140501161505,A,4,22,1,170,1.4,77,39097,393563,515|3|A0CC|ED96,0000,0008|0003|0000|09D5|0000,,,1,0009*1E", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14774);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$B140,013777001293701,AAA,35,-7.266760,112.743550,140521095314,A,3,22,0,275,2.7,45,1984,8059,510|1|3504|EBFE,0000,0000|0000|0000|0914|0002,,*F9\r\n", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14775);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "$$J163,123123123123123,AFF,0004,35,58.588926,16.180473,140928192856,A,10,27,0,161,1.2,19,1648894,435695,240|24|88B9|E435,0000,|||0A22|0000,00000001,,50,,,,,,,,,,,,,*70\r\n", Charset.defaultCharset())));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14776);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "24245838362c3336393830303031343039303032312c4343432c020134000100000023381f91ffe354b806c5e3121b0009130000000000000000d33801007cbf0200fe0101000435feeb02000500a3010000000000002a62650d0a"))));

        __CLR4_5_2bdxbdxlx1e82b9.R.inc(14777);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "2424473937302c3336393830303031333436303637342c4343432c020134005b000000010ce304035db9e000ec6f591a000013000000000c001801edb70200c96d0100e60001004838576501000300a101c20400000000010ce304035db9e000ee6f591a000013000000000c001801edb70200ca6d0100e60001004838576501000300a101c20400000000010ce304035db9e000ef6f591a000013000000000c001801edb70200cc6d0100e60001004838576501000300a101c20400000000020ce304035db9e000f76f591a000016000000000c001801edb70200d36d0100e60001004838576502000300a101bf04000000000a0ce304035db9e000f76f591a000016000000000c001801edb70200d46d0100e60001004838576500000300a101bf0400000000020ce304035db9e000fb6f591a000016000000000c001801edb70200d86d0100e60001004838576502000300a101760400000000180ce304035db9e000fc6f591a0000120000000000008c00edb70200d96d0100e60001004838576502000300a10176040000000019b1e2040323b9e0000b70591a0105150600bb0012002901edb70200e76d0100e60001004838576502000300a2017005000000002023e304031fb9e0001070591a010615070027010d001601fcb70200ec6d0100e60001004838576502000300a201800500000000201fe3040302b9e0001170591a010615090019010d001501feb70200ed6d0100e60001004838576502000300a2018005000000002018e30403dcb8e0001270591a0106150b0011010d00150100b80200ee6d0100e60001004838576502000300a2018005000000002036e3040345b8e0001570591a0107150b002d010b0013010ab80200f16d0100e60001004838576502000300a2018005000000002053e3040326b8e0001670591a0107150d0041010b0013010eb80200f26d0100e60001004838576502000300a2018005000000002070e3040310b8e0001770591a0107150e004f010b00130111b80200f36d0100e60001004838576502000300a2018005000000002095e3040306b8e0001870591a0107150d005a010b00140115b80200f46d0100e60001004838576502000300a20180050000000020b3e3040305b8e0001970591a0107150b0060010b00140118b80200f56d0100e60001004838576502000300a20183050000000020cfe3040308b8e0001a70591a0107150b0066010b0014011bb80200f66d0100e60001004838576502000300a20183050000000020eee304030cb8e0001b70591a0106170b0004000d0014011eb80200f76d0100e60001004838576502000300a2018305000000002a62350d0a"))));

        //verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
        //        "2424473937302C3336393830303031333232303032302C4343432C02013400540000001F0E885701225FCC06F574A419000614000000001200280012390C0081080000CC01000062305446000000007901000000000000000000000000000000000000000000008004000080040000800400008004000000000000000000000000000000000000FEEE00001F0E885701225FCC06CD7AA419000614000000001200280012390C00260D0000CC01000062305446000000007801A403000000001F0E885701225FCC06257DA419000617000000001200280012390C007E0F0000CC01000062305446000000007701A403000000001F0E885701225FCC067E7FA419000016000000001200280012390C00D6110000CC01000062305446000000007701A603000000001F0E885701225FCC06D681A419000017000000001200280012390C002E140000CC01000062305446000000007601A603000000001F0E885701225FCC062E84A419000015000000001200280012390C0086160000CC01000062305446000000007501A603000000001F0E885701225FCC067A83A51900060E000000001200280012390C0065190000CC0100006230EAB7000000007301A403000000001F0E885701225FCC06D285A51900060E000000001200280012390C00BD1B0000CC01000062305446000000007101A203000000001F0E885701225FCC062B88A51900060F000000001200280012390C00151E0000CC01000062305446000000007001A203000000001F0E885701225FCC06838AA519000613000000001200280012390C006D200000CC01000062305446000000007001A603000000001F0E885701225FCC06DB8CA519000010000000001200280012390C00C5220000CC01000062305446000000006E01A603000000001F0E885701225FCC06348FA519000016000000001200280012390C001D250000CC01000062305446000000006401000000000000020E885701225FCC06D9D9A519000600000000001200280012390C007828000000000000000000000200000054010000000000001F0E885701225FCC062DDCA519000616000000001200280012390C00CC2A0000CC01000062305446020000007B010000000000000A0E885701225FCC065BDDA519000613000000001200280012390C00F92B0000CC01000062305446000000007C01000000000000020E885701225FCC065CDDA519000010000000001200280012390C00FB2B0000CC01000062305446020000007C010000000000001F0E885701225FCC0685DEA519000013000000001200280012390C00242D0000CC01000062305446020000007D010000000000002A35620D0A"))));
       
    }finally{__CLR4_5_2bdxbdxlx1e82b9.R.flushNeeded();}}

}
