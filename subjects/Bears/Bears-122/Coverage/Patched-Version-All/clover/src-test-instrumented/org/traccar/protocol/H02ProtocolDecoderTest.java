/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

public class H02ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kldkldlwye7j42{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,26759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kldkldlwye7j42.R.globalSliceStart(getClass().getName(),26689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kldkldlwye7j42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kldkldlwye7j42.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkld() throws Exception{try{__CLR4_5_2kldkldlwye7j42.R.inc(26689);

        __CLR4_5_2kldkldlwye7j42.R.inc(26690);H02ProtocolDecoder decoder = new H02ProtocolDecoder(new H02Protocol());

        __CLR4_5_2kldkldlwye7j42.R.inc(26691);verifyPosition(decoder, binary(
                "2442091341332059572807175137358006000183640e000000fffffbfdff001f080000000000ea1e0000000021"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26692);verifyNull(decoder, buffer(
                "*HQ,4109198974,#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26693);verifyAttributes(decoder, buffer(
                "*HQ,1700086468,LINK,180902,15,0,84,0,0,240517,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26694);verifyNull(decoder, buffer(
                "*HQ,355488020882405,V3,095426,74001,01,010278,045142,128,-92,02DE,0,X,090517,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26695);verifyNull(decoder, buffer(
                "*HQ,355488020882405,V3,095426,74001,04,010278,045142,128,-92,010278,026311,125,,010278,026582,125,,010278,028322,119,,02DD,0,X,090517,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26696);verifyPosition(decoder, buffer(
                "*HQ,4109179024,V19,181519,V,3853.2587,S,06205.9175,W,000.00,000,090217,,5492932630888,8954315265044716555?,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26697);verifyPosition(decoder, buffer(
                "*HQ,8161289587,V1,181933,A,5444.3994,N,02516.3844,E,000.05,000,090317,FFFFBBFF,246,03,00002,41565#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26698);verifyPosition(decoder, binary(
                "2421305109380127171003170520046500100286297e003085ffffdfffff03440069129344006400001151415a20"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26699);verifyPosition(decoder, buffer(
                "*HQ,2130510938,V1,012632,A,0520.0663,N,10028.6324,E,0.286,023,100317,FFFFDFFF,69129336,0,100.0,18,5141,5A20#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26700);verifyPosition(decoder, buffer(
                "*HQ,4210209006,V1,201812,A,2608.9437,N,08016.2521,W,000.80,000,150317,EFE7F9FF,310,260,0,0,6#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26701);verifyPosition(decoder, buffer(
                "*HQ,4210209006,V1,201844,A,2608.9437,N,08016.2521,W,000.80,000,150317,FFFFF9FF,310,260,0,0,6#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26702);verifyPosition(decoder, buffer(
                "*HQ,4109179024,V19,103732,V,3853.2770,S,06205.8678,W,000.00,000,100217,,5492932630888,8954314165044716555?,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26703);verifyAttributes(decoder, buffer(
                "*HQ,4109179024,NBR,103732,722,310,0,6,8106,32010,23,8101,22007,25,8106,12010,23,8106,22105,22,8101,22012,16,8106,42010,5,100217,FFFFFBFF,5#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26704);verifyNull(decoder, buffer(
                "*HQ,355488020930796,V3,002339,62160,06,024852,035421,148,0,024852,035425,143,,022251,036482,137,,024852,000335,133,,024852,031751,133,,024852,035423,133,,02A1,0,X,010104,EFE7FBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26705);verifyPosition(decoder, buffer(
                "*HQ,4106012736,V1,224434,A,1827.3855,N,06705.7577,W,000.00,000,100117,FFFFFBFF,310,260,49101,1753,5#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26706);verifyAttributes(decoder, buffer(
                "*HQ,4208150188,NBR,210249,260,6,0,7,1014,50675,37,1014,50633,27,1014,17933,18,1014,17231,15,1014,50632,12,1014,13211,11,1014,17031,10,281216,FFFFFBFF,2#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26707);verifyAttributes(decoder, buffer(
                "*HQ,1600068812,NBR,141335,262,02,255,6,431,17003,26,431,11101,13,431,6353,13,431,22172,13,431,11093,13,431,60861,10,151216,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26708);verifyPosition(decoder, buffer(
                "*HQ,353588020068342,V1,084436,A,3257.01525,N,00655.03865,W,57.78,40,011216,FFFBFFFF,25c,a, 154,b04c#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26709);verifyNull(decoder, buffer(
                "*HQ,356803210091319,BS,,2d4,a,1b63,1969,26,1b63,10b2,31,0,0,25,,ffffffff,60#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26710);verifyAttributes(decoder, buffer(
                "*HQ,1400046168,NBR,160169,460,0,1,4,9338,3692,150,9338,3691,145,9338,3690,140,9338,3692,139,180813,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26711);verifyAttributes(decoder, buffer(
                "*HQ,1600068860,NBR,120156,262,03,255,6,802,54702,46,802,5032,37,802,54782,30,802,5052,28,802,54712,12,802,5042,12,081116,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26712);verifyAttributes(decoder, buffer(
                "*HQ,1600068860,NBR,110326,262,03,255,6,802,23152,23,812,49449,14,802,35382,13,802,35402,11,812,56622,09,802,23132,04,081116,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26713);verifyAttributes(decoder, buffer(
                "*HQ,1600068860,LINK,112137,20,8,67,0,0,081116,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26714);verifyNull(decoder, buffer(
                "*HQ,355488020533263,V3,121536,65501,04,000152,014001,156,-64,000161,010642,138,,000152,014003,129,,000152,013973,126,,02E4,0,X,071116,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26715);verifyPosition(decoder, buffer(
                "*HQ,4209917484,V19,093043,V,5052.9749,N,00426.4322,E,000.00,000,130916,,0032475874141,8944538530000543700F,FFFFFBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26716);verifyPosition(decoder, buffer(
                "*HQ,353505220873067,V1,,V,4605.75732,N,01430.73863,E,0.00,0,,FFFFFFEF,125,194,  64,d3#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26717);verifyPosition(decoder, buffer(
                "*HQ,4210051415,V1,164549,A,0956.3869,N,08406.7068,W,000.00,000,221215,FFFFFBFF,712,01,0,0,6#"),
                position("2015-12-22 16:45:49.000", true, 9.93978, -84.11178));

        __CLR4_5_2kldkldlwye7j42.R.inc(26718);verifyAttributes(decoder, buffer(
                "*HQ,1451316451,NBR,112315,724,10,2,2,215,2135,123,215,2131,121,011215,FFFFFFFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26719);verifyPosition(decoder, buffer(
                "*HQ,1451316485,V1,121557,A,-23-3.3408,S,-48-2.8926,W,0.1,158,241115,FFFFFFFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26720);verifyPosition(decoder, buffer(
                "*HQ,1451316485,V1,121557,A,-23-35.3408,S,-48-2.8926,W,0.1,158,241115,FFFFFFFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26721);verifyPosition(decoder, buffer(
                "*HQ,355488020119695,V1,050418,,2827.61232,N,07703.84822,E,0.00,0,031015,FFFEFBFF#"),
                position("2015-10-03 05:04:18.000", false, 28.46021, 77.06414));

        __CLR4_5_2kldkldlwye7j42.R.inc(26722);verifyPosition(decoder, buffer(
                "*HQ,1451316409,V1,030149,A,-23-29.0095,S,-46-51.5852,W,2.4,065,070315,FFFFFFFF#"),
                position("2015-03-07 03:01:49.000", true, -23.48349, -46.85975));

        __CLR4_5_2kldkldlwye7j42.R.inc(26723);verifyNull(decoder, buffer(
                "*HQ,353588020068342,V1,000000,V,0.0000,0,0.0000,0,0.00,0.00,000000,ffffffff,000106,000002,000203,004c87,16#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26724);verifyPosition(decoder, buffer(
                "*HQ,3800008786,V1,062507,V,3048.2437,N,03058.5617,E,000.00,000,250413,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26725);verifyPosition(decoder, buffer(
                "*HQ,4300256455,V1,111817,A,1935.5128,N,04656.3243,E,0.00,100,170913,FFE7FBFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26726);verifyPosition(decoder, buffer(
                "*HQ,123456789012345,V1,155850,A,5214.5346,N,2117.4683,E,0.00,270.90,131012,ffffffff,000000,000000,000000,000000#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26727);verifyPosition(decoder, buffer(
                "*HQ,353588010001689,V1,221116,A,1548.8220,S,4753.1679,W,0.00,0.00,300413,ffffffff,0002d4,000004,0001cd,000047#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26728);verifyPosition(decoder, buffer(
                "*HQ,354188045498669,V1,195200,A,701.8915,S,3450.3399,W,0.00,205.70,050213,ffffffff,000243,000000,000000#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26729);verifyPosition(decoder, buffer(
                "*HQ,2705171109,V1,213324,A,5002.5849,N,01433.7822,E,0.00,000,140613,FFFFFFFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26730);verifyPosition(decoder, buffer(
                "*TH,2020916012,V1,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26731);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S17,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26732);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S14,100,10,1,3,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26733);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S20,ERROR,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26734);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S20,DONE,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,F7FFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26735);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,R8,ERROR,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26736);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S23,165.165.33.250:8800,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26737);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S24,thit.gd,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26738);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S1,OK,pass_word,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFD#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26739);verifyPosition(decoder, buffer(
                "*HQ,353588020068342,V1,062840,A,5241.1249,N,954.9490,E,0.00,0.00,231013,ffffffff,000106,000002,000203,004c87,24#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26740);verifyPosition(decoder, buffer(
                "*HQ,353505220903211,V1,075228,A,5227.5039,N,01032.8443,E,0.00,0,231013,FFFBFFFF,106,14, 201,2173#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26741);verifyPosition(decoder, buffer(
                "*HQ,353505220903211,V1,140817,A,5239.3538,N,01003.5292,E,21.03,312,221013,FFFBFFFF,106,14, 203,1cd#"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26742);verifyPosition(decoder, buffer(
                "*HQ,356823035368767,V1,083618,A,0955.6392,N,07809.0796,E,0.00,0,070414,FFFBFFFF,194,3b5,  71,c9a9#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26743);verifyNull(decoder, buffer(
                "*HQ,8401016597,BASE,152609,0,0,0,0,211014,FFFFFFFF#"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26744);verifyPosition(decoder, binary(
                "2441060116601245431311165035313006004318210e000000fffffbffff0024"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26745);verifyPosition(decoder, binary(
                "24410600082621532131081504419390060740418306000000fffffbfdff0015060000002c02dc0c000000001f"),
                position("2015-08-31 21:53:21.000", true, 4.69898, -74.06971));

        __CLR4_5_2kldkldlwye7j42.R.inc(26746);verifyPosition(decoder, binary(
                "2427051711092133391406135002584900014337822e000000ffffffffff0000"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26747);verifyPosition(decoder, binary(
                "2427051711092134091406135002584900014337822e000000ffffffffff0000"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26748);verifyPosition(decoder, binary(
                "2410307310010503162209022212874500113466574C014028fffffbffff0000"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26749);verifyPosition(decoder, binary(
                "2441090013450831250401145047888000008554650e000000fffff9ffff001006000000000106020299109c01"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26750);verifyPosition(decoder, binary(
                "24270517030820321418041423307879000463213792000056fffff9ffff0000"));

        __CLR4_5_2kldkldlwye7j42.R.inc(26751);verifyPosition(decoder, binary(
                "2441091144271222470112142233983006114026520E000000FFFFFBFFFF0014060000000001CC00262B0F170A"));
        
        __CLR4_5_2kldkldlwye7j42.R.inc(26752);verifyPosition(decoder, binary(
                "24971305007205201916101533335008000073206976000000effffbffff000252776566060000000000000000000049"));

    }finally{__CLR4_5_2kldkldlwye7j42.R.flushNeeded();}}

    @Test
    public void testDecodeStatus() throws Exception {__CLR4_5_2kldkldlwye7j42.R.globalSliceStart(getClass().getName(),26753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w9vb5lkn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kldkldlwye7j42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kldkldlwye7j42.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolDecoderTest.testDecodeStatus",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w9vb5lkn5() throws Exception{try{__CLR4_5_2kldkldlwye7j42.R.inc(26753);

        __CLR4_5_2kldkldlwye7j42.R.inc(26754);H02ProtocolDecoder decoder = new H02ProtocolDecoder(new H02Protocol());

        __CLR4_5_2kldkldlwye7j42.R.inc(26755);verifyAttribute(decoder, buffer(
                "*HQ,2705171109,V1,213324,A,5002.5849,N,01433.7822,E,0.00,000,140613,FFFFFFFF#"),
                Position.KEY_STATUS, 0xFFFFFFFFL);

        __CLR4_5_2kldkldlwye7j42.R.inc(26756);verifyAttribute(decoder, buffer(
                "*HQ,4109179024,V19,181519,V,3853.2587,S,06205.9175,W,000.00,000,090217,,5492932630888,8954315265044716555?,FFFFFBFF#"),
                Position.KEY_STATUS, 0xFFFFFBFFL);

        __CLR4_5_2kldkldlwye7j42.R.inc(26757);verifyAttribute(decoder, binary(
                "2441091144271222470112142233983006114026520E000000FFFFFBFFFF0014060000000001CC00262B0F170A"),
                Position.KEY_STATUS, 0xFFFFFBFFL);

        __CLR4_5_2kldkldlwye7j42.R.inc(26758);verifyAttribute(decoder, buffer(
                "*HQ,4210051415,V1,164549,A,0956.3869,N,08406.7068,W,000.00,000,221215,FFFFFBFF,712,01,0,0,6#"),
                Position.KEY_STATUS, 0xFFFFFBFFL);

    }finally{__CLR4_5_2kldkldlwye7j42.R.flushNeeded();}}

}
