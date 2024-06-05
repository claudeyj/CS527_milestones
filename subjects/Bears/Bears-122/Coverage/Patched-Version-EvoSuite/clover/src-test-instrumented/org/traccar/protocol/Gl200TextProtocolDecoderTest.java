/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gl200TextProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k9nk9nlwye43fo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384035522L,8589935092L,26363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k9nk9nlwye43fo.R.globalSliceStart(getClass().getName(),26267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k9nk9nlwye43fo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k9nk9nlwye43fo.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gl200TextProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26267,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk9n() throws Exception{try{__CLR4_5_2k9nk9nlwye43fo.R.inc(26267);

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26268);Gl200TextProtocolDecoder decoder = new Gl200TextProtocolDecoder(new Gl200Protocol());

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26269);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,280500,A1000043D20139,GL300VC,41,,31,0,0,,,3.87,0,1,1,,,20170802150751,70,,48.0,,,20170802112145,03AC$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26270);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,2D0300,A1000043D20139,1G1JC5444R7252367,,11,,31,0,1,12986,,4.16,0,2,,,20170802145640,,,,,,+0000,0,20170802145643,CD5A$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26271);verifyPosition(decoder, buffer(
                "+RESP:GTMPN,450102,865084030001323,gb100,0,1.6,0,-93.1,121.393023,31.164105,20170619103113,0460,0000,1806,2142,00,20170619103143,0512$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26272);verifyPosition(decoder, buffer(
                "+RESP:GTTRI,862370030005908,1,0,99,1,0.0,354,18.5,18.821100,-34.084002,20170607152024,0655,0001,00DD,1CAE,00,0103010100,20170607172115,3E7D$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26273);verifyPositions(decoder, buffer(
                "+RESP:GTERI,060800,861074023677175,,00000002,12351,10,1,1,0.0,0,2862.4,-78.467273,-0.164998,20170529181717,,,,,,0.0,00259:11:50,,,0,210104,2,1,28E17436060000E2,1,015F,0,20170529181723,2824$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26274);verifyPosition(decoder, buffer(
                "+RESP:GTSWG,110100,358688000000158,,1,0,2.1,0,27.1,121.390717,31.164424,20110901073917,0460,0000,1878,0873,,20110901154653,0015$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26275);verifyPosition(decoder, buffer(
                "+RESP:GTTMP,110100,358688000000158,,2,60,1,1,4.3,92,70.0,121.354335,31.222073,20110214013254,0460,0000,18d8,6141,00,80,20110214093254,000F$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26276);verifyPosition(decoder, buffer(
                "+RESP:GTSTT,110100,358688000000158,,41,0,4.3,92,70.0,121.354335,31.222073,20110214013254,0460,0000,18d8,6141,,20110214093254,0022$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26277);verifyPosition(decoder, buffer(
                "+RESP:GTBPL,110100,358688000000158,,3.53,0,4.3,92,70.0,121.354335,31.222073,20110214013254,0460,0000,18d8,6141,,20110214093254,001F$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26278);verifyNotNull(decoder, buffer(
                "+BUFF:GTIGL,060228,862894020180553,,,00,1,1,3.4,199,409.6,-63.174466,-17.739317,20170407121823,0000,0000,0000,0000,00,15989.5,20170407081824,9606$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26279);verifyNotNull(decoder, buffer(
                "+RESP:GTFRI,060228,862894020180553,,14827,10,1,1,3.4,199,409.6,-63.174466,-17.739317,20170407121823,0000,0000,0000,0000,00,15989.5,01070:43:13,13,180,0,220101,,,,20170407081824,9607$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26280);verifyPositions(decoder, buffer(
                "+RESP:GTERI,060502,861074023376992,,00000002,27239,10,1,1,0.2,312,183.3,-79.320820,-2.499110,20170401212005,0740,0000,EE4E,C98F,00,0.0,02114:36:35,,,90,220504,2,0,0,20170401212007,9E3D$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26281);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,060502,861074023689626,,25202,10,1,1,0.0,0,2744.1,-78.261047,0.023452,20170401211940,,,,,,0.0,00079:19:15,,,51,110000,,,,20170401212003,4DA7$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26282);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,060100,135790246811220,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,12345:12:34,,,80,210100,,,,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26283);verifyPositions(decoder, buffer(
                "+RESP:GTERI,06020B,862170010196747,,00000000,,10,1,2,1.8,0,-2.5,117.198440,31.845219,20120802061037,0460,0000,5663,0358,00,0.0,,,,0,410000,20120802061040,0012$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26284);verifyPositions(decoder, buffer(
                "+RESP:GTERI,060502,861074023692562,,00000002,14197,10,1,1,0.2,220,491.8,-79.064212,-2.159754,20170401212007,0740,0000,EE49,CE25,00,0.0,01509:10:58,,,87,220104,2,0,0,20170401212010,D14D$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26285);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,210102,354524044925825,,1,1,1,29,2.8,0,133.7,-90.203063,32.265473,20170318005208,,,,,10800,4,20170318005208,0002$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26286);verifyPositions(decoder, false, buffer(
                "+RESP:GTFRI,210102,354524044925825,,1,1,1,,,,,,,,310,410,51bc,ca1dae6,10800,1,20170318214333,0002$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26287);verifyAttributes(decoder, buffer(
                "+RESP:GTGSM,400201,862365030025161,STR,0234,0015,003a,62a2,16,,0234,0015,003a,56a2,14,,0234,0015,003a,062a,13,,0234,0015,003a,32d9,11,,0234,0015,003a,56a0,11,,,,,,,,0234,0015,003a,7489,17,,20170219200048,0033$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26288);verifyAttributes(decoder, buffer(
                "+RESP:GTGSM,400201,862365030025161,STR,0234,0015,003a,56a2,18,,0234,0015,003a,77bc,14,,0234,0015,003a,32d9,12,,0234,0015,003a,062a,12,,0234,0015,003a,62a2,11,,0234,0015,003a,56a0,10,,0234,0015,003a,7489,15,,20170219080049,0030$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26289);verifyAttributes(decoder, buffer(
                "+RESP:GTGSM,400201,862365030034940,STR,0234,0030,0870,2469,19,,0234,0030,0870,35ee,18,,0234,0030,0870,16ac,12,,0234,0030,0870,16b2,11,,0234,0030,0870,360f,6,,0234,0030,0870,165d,6,,0234,0030,0870,35ef,17,,20170215220049,008D$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26290);verifyPosition(decoder, buffer(
                "+RESP:GTSTR,400201,862365030034940,GL500,0,0,2,21.1,86,0,1.6,0,5.8,0.622831,51.582688,20170215090422,0234,0030,0870,35EF,,,,20170215220049,008C$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26291);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,2C0402,867162020000816,,0,0,1,2,0.3,337,245.7,-82.373387,34.634011,20170215003054,,,,,,63,20170215003241,3EAB$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26292);verifyNotNull(decoder, buffer(
                "+RESP:GTWIF,210102,354524044608058,,4,c413e200ff14,-39,,,,c413e2010e55,-39,,,,c8d3ff04a837,-43,,,,42490f997c6d,-57,,,,,,,,100,20170201020055,0001$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26293);verifyNotNull(decoder, buffer(
                "+RESP:GTWIF,210102,354524044484948,,1,08626693fb98,-36,,,,,,,,97,20170119071300,05E3$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26294);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,210102,A100004D9EF2AE,,41,,8,99,0,17.7,21,3.58,0,1,1,0,0,20161216135038,4,,,,,20161216135038,00AB$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26295);verifyAttributes(decoder, buffer(
                "+RESP:GTSTR,400201,862365030034957,GL500,0,0,2,23.1,5,2,0.2,0,36.0,0.623089,51.582744,20161129174625,0234,0015,03C3,3550,,,,20161129174625,0026$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26296);verifyNotNull(decoder, buffer(
                "+RESP:GTSTR,400201,862365030034957,GL500,0,1,2,21.8,100,0,,,,,,,0234,0015,03C3,3550,,,,20161129174009,0023$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26297);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,210102,A10000499AEF9B,,41,,0,0,0,15.0,9,3.87,0,1,1,0,0,20161101140211,72,,,,,20161101140211,00A3$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26298);verifyAttributes(decoder, buffer(
                "+RESP:GTNMR,210102,A10000499AEF9B,,0,0,1,9,0.0,0,288.0,-76.902364,39.578828,20161101134145,,,,,00,73,20161101134145,009F$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26299);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,210102,A10000499AEF9B,,0,1,1,9,0.5,0,288.0,-76.902364,39.578828,20161101134124,,,,,00,73,20161101134123,009D$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26300);verifyAttributes(decoder, buffer(
                "+RESP:GTRTL,210102,A10000499AEF9B,,0,0,1,10,0.2,0,305.4,-76.902274,39.578517,20161101155001,,,,,00,73,20161101155001,00A6$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26301);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,110100,358688000000158,,41,898600810906F8048812,18,99,0,33.23,1,4.19,1,1,1,0,0,20110714104934,100,,,,,20110714104934,0014$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26302);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,080100,135790246811220,,16,898600810906F8048812,16,0,1,11870,,4.1,0,0,0,,20090214013254,,12340,,00,00,+0800,0,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26303);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,040100,135790246811220,,16,898600810906F8048812,16,0,1,,0,4.4,0,0,0,0,20090214013254,13000,00,00,+0800,0,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26304);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,060100,135790246811220,,16,898600810906F8048812,16,0,1,12000,,4.4,0,0,0,0,20090214013254,0,1300,2000,00,00,+0800,0,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26305);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,1A0800,860599000773978,GL300,41,89701016426133851978,17,0,1,26.6,,3.90,1,1,0,0,0,20161003184043,69,1,44,,,20161004040811,022C$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26306);verifyAttributes(decoder, buffer(
                "+BUFF:GTINF,1A0800,860599000773978,GL300,41,89701016426133851978,23,0,1,204.7,,3.84,1,1,0,0,0,20161006072548,62,1,38,,,20161006082343,0C98$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26307);verifyPosition(decoder, buffer(
                "+RESP:GTFRI,360100,864251020141408,3VWGW6AJ0FM237324,gv500,,10,1,1,0.0,0,2258.4,-99.256948,19.555800,20160929214743,0334,0020,0084,65AC,00,0.0,,,,100,410000,0,nan,,20160929214743,13BA$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26308);verifyPosition(decoder, buffer(
                "+RESP:GTOBD,360201,864251020186064,4T1BE46KX7U018210,,0,19FFFF,4T1BE46KX7U018210,1,14283,983901C0,799,36,18,,33792,0,0,0,,,38,,6,53557,0,0.0,0,219.5,-76.661456,39.832588,20160507132153,20160507132154,0230$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26309);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,360201,864251020186064,1G1JC5444R7252367,,12802,10,1,0,0.0,0,219.5,-76.661456,39.832588,20160507132235,,,,,,20460.9,00080:03:37,,,100,210000,791,,56,20160507132239,0233$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26310);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,1F0101,135790246811220,1G1JC5444R7252367,,,00,2,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,0,4.3,92,70.0,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,2000.0,12345:12:34,,,80,210100,,,50,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26311);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,1F0101,135790246811220,1G1JC5444R7252367,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,12345:12:34,,92,80,210100,,,50,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26312);verifyPosition(decoder, buffer(
                "+RESP:GTSTT,060228,862894020178276,,21,0,0.0,0,411.3,-63.169745,-17.776330,20160319132220,0736,0003,6AD4,5BAA,00,20160319092223,1FBD$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26313);verifyPosition(decoder, buffer(
                "+RESP:GTNMR,210102,A10000458356CE,,0,1,1,9,0.0,8,190.7,-85.765865,42.894837,20160316123202,,,,,60,30,20160316123202,0137$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26314);verifyPosition(decoder, buffer(
                "+RESP:GTIDA,060228,862894020178276,,,01C68011010000C7,1,1,0,0.0,0,413.0,-63.169675,-17.776349,20160317222129,0736,0003,6AD4,32CF,00,34.9,,,,,20160317182130,1626$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26315);verifyPosition(decoder, buffer(
                "+RESP:GTIGN,060228,862894020180553,,9860,0,0.2,189,420.0,-63.158195,-17.800608,20160309022951,0736,0003,6AD4,3471,00,,881.2,20160308222956,129A$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26316);verifyPosition(decoder, buffer(
                "+BUFF:GTIGF,060228,862894020180553,,1958,0,0.0,240,390.3,-63.089213,-17.764712,20160309122854,0736,0003,6AB8,5A23,00,,936.8,20160309082858,1368$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26317);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,060228,862894020180553,,,10,1,1,20.0,147,329.7,-62.899703,-17.720434,20160309113548,0736,0003,6AAE,3381,00,913.3,,,,0,220101,,,,20160309073554,132B$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26318);verifyPositions(decoder, buffer(
                "+BUFF:GTFRI,060402,862894021808798,,,10,1,1,0.0,349,394.3,-63.287717,-17.662410,20160116234031,0736,0003,6ABA,8305,00,3326.8,,,,94,220100,,,,20160116194035,4D83"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26319);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,2C0204,867162020003125,GL300W,0,0,2,1,1.7,205,2867.0,-78.481127,-0.206828,20160215210433,0740,0000,7596,5891C,0.0,1,1.7,205,2867.0,-78.481127,-0.206828,20160215210503,0740,0000,7596,5891C,0.0,88,20160215210506,1E78$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26320);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,060228,862894020178276,,15153,10,1,1,0.0,0,431.7,-63.169571,-17.776235,20160210153458,0736,0003,6AD4,80EF,00,34.9,00117:31:26,13442,15163,0,210101,,,,20160210113503,38EE$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26321);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,110100,A5868800000015,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20110214013254,0460,0000,18d8,6141,00,80,20110214013254,000C"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26322);verifyNotNull(decoder, buffer(
                "+RESP:GTFRI,210102,A10000458356CE,,0,1,1,15,1.4,0,190.6,-85.765763,42.894896,20160208164505,4126,210,0,18673,00,92,20160208164507,00A6"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26323);verifyPositions(decoder, buffer(
                "+BUFF:GTFRI,060402,862894021808798,,,10,1,1,0.0,349,394.3,-63.287717,-17.662410,20160116234031,0736,0003,6ABA,8305,00,3326.8,,,,94,220100,,,,20160116194035,4D83"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26324);verifyPosition(decoder, buffer(
                "+RESP:GTIDA,06020A,862170013895931,,,D2C4FBC5,1,1,1,0.8,0,22.2,117.198630,31.845229,20120802121626,0460,0000,5663,2BB9,00,0.0,,,,,20120802121627,008E$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26325);verifyAttributes(decoder, buffer(
                "+RESP:GTINF,1F0101,135790246811220,1G1JC5444R7252367,,16,898600810906F8048812,16,0,1,12000,,4.2,0,0,,,20090214013254,,,,,,+0800,0,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26326);verifyPositions(decoder, false, buffer(
                "+RESP:GTFRI,120113,555564055560555,,1,1,1,,,,,,,,0282,0380,f080,cabf,6900,79,20140824165629,0001$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26327);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,0F0106,862193020451183,,,10,1,1,0.0,163,,-57.513617,-25.368191,20150918182145,,,,,,21235.0,,,,0,210100,,,,20150918182149,00B8$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26328);verifyPosition(decoder, buffer(
                "+RESP:GTOBD,1F0109,864251020135483,,gv500,0,78FFFF,,1,12613,,,,,,,,,,,,,,1286,0,0.0,0,17.1,3.379630,6.529701,20150813074639,0621,0030,51C0,A2B3,00,0.0,20150813074641,A7E6$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26329);verifyPosition(decoder, buffer(
                "+RESP:GTOBD,1F0109,864251020135483,4T1BE46KX7U018210,gv500,0,78FFFF,4T1BE46KX7U018210,1,13411,981B81C0,787,3,43,,921,463,1,10,0300030103030304001200310351035203530354,20,55,,1286,0,6.5,74,21.6,3.379710,6.529714,20150813074824,0621,0030,51C0,A2B3,00,0.0,20150813074828,A7E9$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26330);verifyPosition(decoder, buffer(
                "+RESP:GTSTT,1A0401,860599000508846,,41,0,0.0,84,107.5,-76.657998,39.497203,20150623160622,0310,0260,B435,3B81,,20150623160622,0F54$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26331);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,1A0401,860599000508846,,0,0,1,1,134.8,154,278.7,-76.671089,39.778885,20150623154301,0310,0260,043F,7761,,99,20150623154314,0F24$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26332);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,1A0200,860599000165464,CRI001,0,0,1,2,,41,,-71.153137,42.301634,20150328020301,,,,,280.3,55,20150327220351,320C"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26333);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,02010D,867844001675407,,0,0,1,2,0.0,0,28.9,8.591011,56.476397,20140915213209,0238,0001,03CB,2871,,97,20140915213459,009A"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26334);verifyNull(decoder, buffer(
                "+RESP:GTINF,359464030073766,8938003990320469804f,18,99,100,1,0,+2.00,0,20131018084015,00EE,0103090402"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26335);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,04040C,359231038939904,,,10,1,2,0.0,117,346.0,8.924243,50.798077,20130618122040,0262,0002,0299,109C,00,0.0,,,,,,,,,20130618122045,00F6"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26336);verifyPosition(decoder, buffer(
                "+RESP:GTSTT,04040C,359231038939904,,42,0,0.0,117,346.0,8.924243,50.798077,20130618125152,0262,0002,0299,109C,00,20130618125154,017A"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26337);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,020102,000035988863964,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26338);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,020102,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26339);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,020102,135790246811220,,0,0,2,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,0,4.3,92,70.0,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26340);verifyPosition(decoder, buffer(
                "+RESP:GTDOG,020102,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26341);verifyPosition(decoder, buffer(
                "+RESP:GTLBC,020102,135790246811220,,+8613800000000,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26342);verifyPosition(decoder, buffer(
                "+RESP:GTGCR,020102,135790246811220,,3,50,180,2,0.4,296,-5.4,121.391055,31.164473,20100714104934,0460,0000,1878,0873,00,,20100714104934,000C"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26343);verifyPosition(decoder, buffer(
                "+RESP:GTFRI,07000D,868487001005941,,0,0,1,1,0.0,0,46.3,-77.039627,38.907573,20120731175232,0310,0260,B44B,EBC9,0015e96913a7,-58,,100,20120731175244,0114"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26344);verifyPosition(decoder, buffer(
                "+RESP:GTHBM,0F0100,135790246811220,,,10,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26345);verifyPosition(decoder, buffer(
                "+RESP:GTHBM,0F0100,135790246811220,,,11,1,1,24.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26346);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,02010C,867844001274144,,0,0,1,1,18.0,233,118.1,7.615551,51.515600,20140106130516,0262,0007,79E6,B956,,72,20140106140524,09CE$"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26347);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,02010C,867844001274649,,0,0,1,1,0.0,0,122.5,7.684216,51.524512,20140106233722,0262,0007,79EE,1D22,,93,20140107003805,03C4$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26348);verifyPositions(decoder, buffer(
                "+BUFF:GTFRI,210101,863286020016706,,,10,1,1,,,,49.903915,40.391669,20140818105815,,,,,,,,,,,210100,,,,,000C$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26349);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,240100,135790246811220,,,10,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,12345:12:34,,80,,,,,,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26350);verifyPositions(decoder, buffer(
                "+RESP:GTFRI,240100,135790246811220,,,10,2,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,0,4.3,92,70.0,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,2000.0,12345:12:34,,,80,,,,,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26351);verifyNotNull(decoder, buffer(
                "+RESP:GTSTT,280100,A1000043D20139,,42,0,0.1,321,228.6,-76.660884,39.832552,20150615120628,0310,0484,00600019,0A52,,20150615085741,0320$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26352);verifyNotNull(decoder, buffer(
                "+RESP:GTRTL,280100,A1000043D20139,,0,0,1,1,0.1,321,239.1,-76.661047,39.832501,20150615114455,0310,0484,00600019,0A52,,87,20150615074456,031E$"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26353);verifyAttributes(decoder, buffer(
                "+BUFF:GTBPL,1A0800,860599000773978,GL300,3.55,0,0.0,0,257.1,60.565437,56.818277,20161006070553,,,,,204.7,20161006071028,0C75$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26354);verifyAttributes(decoder, buffer(
                "+RESP:GTTEM,1A0102,860599000000448,,3,33,0,5.8,0,33.4,117.201191,31.832502,20130109061410,0460,0000,5678,2079,,20130109061517,0091$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26355);verifyAttributes(decoder, buffer(
                "+RESP:GTJDR,0A0102,135790246811220,,0,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,20090214093254,11F0$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26356);verifyAttributes(decoder, buffer(
                "+RESP:GTJDS,0A0102,135790246811220,,2,0,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,20090214093254,11F0$"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26357);verifyAttributes(decoder, buffer(
                "+RESP:GTSOS,020102,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0$"));
        
        __CLR4_5_2k9nk9nlwye43fo.R.inc(26358);verifyAttributes(decoder, buffer(
                "+RESP:GTVER,1A0800,860599000773978,GL300,GL300,0A03,0103,20161007041531,10F8$"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26359);verifyNull(decoder, buffer(
                "+ACK:GTHBD,1A0401,135790246811220,,20100214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26360);verifyAttributes(decoder, buffer(
                "+ACK:GTRTO,1A0800,860599000773978,GL300,VER,FFFF,20161006053520,0C19"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26361);verifyAttributes(decoder, buffer(
                "+ACK:GTJDC,0A0102,135790246811220,,0016,20090214093254,11F0"));

        __CLR4_5_2k9nk9nlwye43fo.R.inc(26362);verifyAttributes(decoder, buffer(
                "+ACK:GTGEO,1A0102,135790246811220,,0,0008,20100310172830,11F0"));

    }finally{__CLR4_5_2k9nk9nlwye43fo.R.flushNeeded();}}

}
