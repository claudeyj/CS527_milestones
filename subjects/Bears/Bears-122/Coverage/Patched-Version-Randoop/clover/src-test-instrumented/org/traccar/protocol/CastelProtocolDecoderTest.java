/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class CastelProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k2jk2jlwye68p3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k2jk2jlwye68p3.R.globalSliceStart(getClass().getName(),26011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k2jk2jlwye68p3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k2jk2jlwye68p3.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.CastelProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk2j() throws Exception{try{__CLR4_5_2k2jk2jlwye68p3.R.inc(26011);

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26012);CastelProtocolDecoder decoder = new CastelProtocolDecoder(new CastelProtocol());

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26013);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40408200033231334c32303137303031313039000000000000100136477b5964477b590400000000000000dc410f000000000204000709207910008304011c07110e110dd41a160714a95a0f00001e058c4944442d3231334c2056312e312e3120323031372d30352d3038004944442d3231334c2056312e312e300000006da10d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26014);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40408200033231334c323031373030303131370000000000001001000c6759a10d67590a9e1200000000000e3e0000000000020000000e4e791c000004010d0711060515083017086cd1181f000040067d4944442d3231334c2056312e312e3120323031372d30352d3038004944442d3231334c2056312e312e3000000066e30d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26015);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404043000432313345503230313630303035383500000000004006a2021d5810031d58ae940400da050000f6040000070000000400076401680000000001001bd20d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26016);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040d0000432313345503230313630303035383500000000001001831c1c58b1fc1c58ae94040012220000f60400005800000000000763016800008484004944445f3231335730315f532056312e302e37004944445f3231335730315f482056312e302e370032000110021003100410051006100710081009100a100b100c100d100e1011100111021103110411051106110711011202120312041201130213031301160216011701180218011b011c011d011e011f021f031f041f051f061f071f0121022101260127012861780d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26017);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404029000432313345503230313630303035383500000000009001ffffffff0000b4fc1c582b6e0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26018);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40406000043231334550323031363030303538350000000000400708000000831c1c58f4fb1c58ae94040012220000f604000058000000200007630168000084c401040b10090c3532db3f07f07f7520090100000101010e00000000c7920d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26019);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404042000432313345503230313630303035383500000000001002831c1c58b7fc1c58ae94040012220000f604000058000000000007630168000084840072a20d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26020);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040d0000432313345503230313630303035383500000000001001831c1c5805fe1c58ae94040012220000f60400005800000000000763016800008484004944445f3231335730315f532056312e302e37004944445f3231335730315f482056312e302e370032000110021003100410051006100710081009100a100b100c100d100e1011100111021103110411051106110711011202120312041201130213031301160216011701180218011b011c011d011e011f021f031f041f051f061f071f012102210126012701284eb10d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26021);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40405700043231334e583230313630303131373700000000004002c458ce572159ce57a9e2020082030000500c00000f0000000400036401240e0403023c000505210c210d210f21102101075b14030121330269430d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26022);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40407800043231334e583230313630303131373700000000004004fa52ce574b53ce57cad1020041020000050c00000d0000000400036401240b0503001b042105210c210d210f211021112113211c211f212121232124212c212d213021312133213e2141214221452149214a214c214f215021384e0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26023);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040a600043231334e583230313630303131373700000000004005fa52ce575053ce57cad102006b020000050c00000d0000000400036401240b050300001b042105210c210d210f211021112113211c211f212121232124212c212d213021312133213e2141214221452149214a214c214f215021015bd604301f500600000653000000bc0bffff78250000ff2d98642401000f8080e038000f0f0000000000000077b10d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26024);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40404300043231334e583230313630303131373700000000004006fa52ce574e53ce57cad1020053020000050c00000d0000000400036401240b0503000000feec0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26025);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40403600043231334e583230313630303033343600000000004009ad31a457050810061a35b29bf80ae6da83180300320bbe32580d0a40403600043231334e583230313630303033343600000000004009ad31a457050810061a35b29bf80ae6da83180300320bbe32580d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26026);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040d400043535333133350000000000000000000000000000100196d499574bd899570000000000000000010000000000000000000000002410000000004944445f3231334730325f532056322e332e345f4e004944445f3231334730325f482056322e332e345f4e0032000110021003100410051006100710081009100a100b100c100d100e1011100111021103110411051106110711011202120312041201130213031301160216011701180218011b011c011d011e011f021f031f041f051f061f071f012102210126012701285b410d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26027);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "24243f00676e6768656636313031313132393030313734002001840d0000d2deb556020602100b35360456cf09e6ebac0200000000030000000001abc10d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26028);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "24243f00676e6768656636313031313132393030313734002001840d000000dfb556020602100b36298256cf0956ebac020000990c7f0000000001b4830d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26029);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040590004313030303030303030303800000000000000000040010072f53f56c25240560000000078b00900000000009c3100000000030100011900030001090b0f080106c04fe40b4037310c0060e001ff018d01e05e0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26030);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40405900043231334e5832303135303030303336000000000040010073dd735600df7356b9220000270b000000000000000000000400000000240e03000201120c0f0a19050c1e5808ca35530dd902540d9c010000e5300d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26031);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404055000431303031313132353239393837000000000000001002C1F0695230086A529C911100000000000F890000A60500000000036301014CFF000001190A0D0539191480D60488C5721800000000BF8A640D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26032);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40406000043130303131313235323939383700000000000000400705000000C1F0695249F469529C9111000000000069830000D80040000400036401014C04030001190A0D04201E1480D60488C5721800000000AF0101060F000F00EA1E0D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26033);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404057000431303031313132353239393837000000000000004002C1F06952F0F169529C9111000000000069830000470000000400036401014C01030078000505210C210D210F21102101073BE8030064280AEB930D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26034);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40405900043130303131313235323939383700000000000000400101C1F06952E7F069529C9111000000000069830000070000000400036401014C00030001190A0D0412041480D60488C57218000000009F01E803ED9A0D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26035);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040B9000431303031313132353239393837000000000000004005C1F069521BF169529C9111000000000069830000130000000400036401014C0003000022032104210521062107210C210D210E210F2110211121132115211C211F21212124212E212F2130213121322133213C214221432144214521472149214A214C214D214E210100643B6232E803003E64280A3C24FE00010E010F00D5805A483C640000000000010000E02E000000066400000500000000A7710D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26036);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404043000431303031313132353239393837000000000000004006C1F0695209F169529C91110000000000698300000D0000000400036401014C00030000009AF40D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26037);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404086000431303031313132353239393837000000000000004004C1F0695200F169529C91110000000000698300000D0000000400036401014C00030022032104210521062107210C210D210E210F2110211121132115211C211F21212124212E212F2130213121322133213C214221432144214521472149214A214C214D214E219AE90D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26038);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40407F000431303031313132353239393837000000000000001001C1F06952FDF069529C91110000000000698300000C0000000000036401014C00030001190A0D04121A1480D60488C5721800000000AF4944445F3231364730325F532056312E322E31004944445F3231364730325F482056312E322E31000000DF640D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26039);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "404044000c3631313135303030303935360000000000000000420600011e0a0f0b1312864fcd08c07a13030100640acf000004000a000000000000007ba083a66ad80d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26040);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40405c000c363131313530303030393536000000000000000040011c0a0f0e362dca53cd0860831303000000000300000000ff000000000000007ba083a650542d3639305f56312e312e320050542d3639302056312e32008a020d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26041);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040450004323132474c31313433303035303033000000000040082ca89b55a6a99b555c57000000000000c40200000b0000001400036401111f000302f5533bd653f10d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26042);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40404d0004323132474c3131343330303530303300000000004007120000002ca89b55cba99b555c57000000000000c40200000b0000000000036401111f000102000101170000000068850d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26043);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040420004323132474c31313433303035303033000000000010022ca89b55cca99b555c57000000000000cf0200000b0000000000036401111f0000020013be0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26044);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040870004323132474c31313433303035303033000000000040052ca89b55e3a89b555c57000000000000c4020000040000001400036401111f0003000012042105210b210c210d210f211021112113211c2121212321242133213421422146214f212b50663603003ce9030dff060000600dffffc25865ffff9e02b43624000000003cbc0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26045);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "4040d00004323132474c31313433303035303033000000000010013ec09b5596c29b555c57000000000000de0200000f0000000000036401111f000000004944445f3231334730325f532056322e322e36004944445f3231334730325f482056322e322e360032000110021003100410051006100710081009100a100b100c100d100e1011100111021103110411051106110711011202120312041201130213031301160216011701180218011b011c011d011e011f021f031f041f051f061f071f012102210126012701288a690d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26046);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40404d0004323132474c3131343330303530303300000000004007050000003ec09b5564c29b555c57000000000000de0200000f0000002000036401111f0000020001010e00000000237e0d0a"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26047);verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40401F00043130303131313235323939383700000000000000100303320D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26048);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40407F000431303031313132353239393837000000000000001001C1F06952FDF069529C91110000000000698300000C0000000000036401014C00030001190A0D04121A1480D60488C5721800000000AF4944445F3231364730325F532056312E322E31004944445F3231364730325F482056312E322E31000000DF640D0A"));

        __CLR4_5_2k2jk2jlwye68p3.R.inc(26049);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40405900043130303131313235323939383700000000000000400101C1F06952E7F069529C9111000000000069830000070000000400036401014C00030001190A0D0412041480D60488C57218000000009F01E803ED9A0D0A"));
        
        __CLR4_5_2k2jk2jlwye68p3.R.inc(26050);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "40405900043335343034333035303834343134330000000000400100f61a7355c11b7355710000000b00000000000000000000000400000000240e0200020106060f100b2d5a78a7076ec0fb1d00008c065f010000ac220d0a"));

    }finally{__CLR4_5_2k2jk2jlwye68p3.R.flushNeeded();}}

}
