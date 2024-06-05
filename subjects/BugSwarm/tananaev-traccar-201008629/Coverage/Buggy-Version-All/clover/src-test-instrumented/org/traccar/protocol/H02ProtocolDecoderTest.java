/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class H02ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2iqziqzlx1dxs25{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,24350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iqziqzlx1dxs25.R.globalSliceStart(getClass().getName(),24299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iqziqzlx1dxs25.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iqziqzlx1dxs25.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24299,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiqz() throws Exception{try{__CLR4_5_2iqziqzlx1dxs25.R.inc(24299);

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24300);H02ProtocolDecoder decoder = new H02ProtocolDecoder(new H02Protocol());

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24301);verifyNothing(decoder, buffer(
                "*HQ,355488020930796,V3,002339,62160,06,024852,035421,148,0,024852,035425,143,,022251,036482,137,,024852,000335,133,,024852,031751,133,,024852,035423,133,,02A1,0,X,010104,EFE7FBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24302);verifyPosition(decoder, buffer(
                "*HQ,4106012736,V1,224434,A,1827.3855,N,06705.7577,W,000.00,000,100117,FFFFFBFF,310,260,49101,1753,5#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24303);verifyAttributes(decoder, buffer(
                "*HQ,4208150188,NBR,210249,260,6,0,7,1014,50675,37,1014,50633,27,1014,17933,18,1014,17231,15,1014,50632,12,1014,13211,11,1014,17031,10,281216,FFFFFBFF,2#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24304);verifyAttributes(decoder, buffer(
                "*HQ,1600068812,NBR,141335,262,02,255,6,431,17003,26,431,11101,13,431,6353,13,431,22172,13,431,11093,13,431,60861,10,151216,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24305);verifyPosition(decoder, buffer(
                "*HQ,353588020068342,V1,084436,A,3257.01525,N,00655.03865,W,57.78,40,011216,FFFBFFFF,25c,a, 154,b04c#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24306);verifyNothing(decoder, buffer(
                "*HQ,356803210091319,BS,,2d4,a,1b63,1969,26,1b63,10b2,31,0,0,25,,ffffffff,60#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24307);verifyAttributes(decoder, buffer(
                "*HQ,1400046168,NBR,160169,460,0,1,4,9338,3692,150,9338,3691,145,9338,3690,140,9338,3692,139,180813,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24308);verifyAttributes(decoder, buffer(
                "*HQ,1600068860,NBR,120156,262,03,255,6,802,54702,46,802,5032,37,802,54782,30,802,5052,28,802,54712,12,802,5042,12,081116,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24309);verifyAttributes(decoder, buffer(
                "*HQ,1600068860,NBR,110326,262,03,255,6,802,23152,23,812,49449,14,802,35382,13,802,35402,11,812,56622,09,802,23132,04,081116,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24310);verifyNothing(decoder, buffer(
                "*HQ,1600068860,LINK,112137,20,8,67,0,0,081116,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24311);verifyNothing(decoder, buffer(
                "*HQ,355488020533263,V3,121536,65501,04,000152,014001,156,-64,000161,010642,138,,000152,014003,129,,000152,013973,126,,02E4,0,X,071116,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24312);verifyPosition(decoder, buffer(
                "*HQ,4209917484,V19,093043,V,5052.9749,N,00426.4322,E,000.00,000,130916,,0032475874141,8944538530000543700F,FFFFFBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24313);verifyPosition(decoder, buffer(
                "*HQ,353505220873067,V1,,V,4605.75732,N,01430.73863,E,0.00,0,,FFFFFFEF,125,194,  64,d3#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24314);verifyPosition(decoder, buffer(
                "*HQ,4210051415,V1,164549,A,0956.3869,N,08406.7068,W,000.00,000,221215,FFFFFBFF,712,01,0,0,6#"),
                position("2015-12-22 16:45:49.000", true, 9.93978, -84.11178));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24315);verifyAttributes(decoder, buffer(
                "*HQ,1451316451,NBR,112315,724,10,2,2,215,2135,123,215,2131,121,011215,FFFFFFFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24316);verifyPosition(decoder, buffer(
                "*HQ,1451316485,V1,121557,A,-23-3.3408,S,-48-2.8926,W,0.1,158,241115,FFFFFFFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24317);verifyPosition(decoder, buffer(
                "*HQ,1451316485,V1,121557,A,-23-35.3408,S,-48-2.8926,W,0.1,158,241115,FFFFFFFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24318);verifyPosition(decoder, buffer(
                "*HQ,355488020119695,V1,050418,,2827.61232,N,07703.84822,E,0.00,0,031015,FFFEFBFF#"),
                position("2015-10-03 05:04:18.000", false, 28.46021, 77.06414));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24319);verifyPosition(decoder, buffer(
                "*HQ,1451316409,V1,030149,A,-23-29.0095,S,-46-51.5852,W,2.4,065,070315,FFFFFFFF#"),
                position("2015-03-07 03:01:49.000", true, -23.48349, -46.85975));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24320);verifyNothing(decoder, buffer(
                "*HQ,353588020068342,V1,000000,V,0.0000,0,0.0000,0,0.00,0.00,000000,ffffffff,000106,000002,000203,004c87,16#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24321);verifyPosition(decoder, buffer(
                "*HQ,3800008786,V1,062507,V,3048.2437,N,03058.5617,E,000.00,000,250413,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24322);verifyPosition(decoder, buffer(
                "*HQ,4300256455,V1,111817,A,1935.5128,N,04656.3243,E,0.00,100,170913,FFE7FBFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24323);verifyPosition(decoder, buffer(
                "*HQ,123456789012345,V1,155850,A,5214.5346,N,2117.4683,E,0.00,270.90,131012,ffffffff,000000,000000,000000,000000#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24324);verifyPosition(decoder, buffer(
                "*HQ,353588010001689,V1,221116,A,1548.8220,S,4753.1679,W,0.00,0.00,300413,ffffffff,0002d4,000004,0001cd,000047#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24325);verifyPosition(decoder, buffer(
                "*HQ,354188045498669,V1,195200,A,701.8915,S,3450.3399,W,0.00,205.70,050213,ffffffff,000243,000000,000000#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24326);verifyPosition(decoder, buffer(
                "*HQ,2705171109,V1,213324,A,5002.5849,N,01433.7822,E,0.00,000,140613,FFFFFFFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24327);verifyPosition(decoder, buffer(
                "*TH,2020916012,V1,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24328);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S17,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24329);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S14,100,10,1,3,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24330);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S20,ERROR,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24331);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S20,DONE,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,F7FFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24332);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,R8,ERROR,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24333);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S23,165.165.33.250:8800,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24334);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S24,thit.gd,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24335);verifyPosition(decoder, buffer(
                "*TH,2020916012,V4,S1,OK,pass_word,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFD#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24336);verifyPosition(decoder, buffer(
                "*HQ,353588020068342,V1,062840,A,5241.1249,N,954.9490,E,0.00,0.00,231013,ffffffff,000106,000002,000203,004c87,24#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24337);verifyPosition(decoder, buffer(
                "*HQ,353505220903211,V1,075228,A,5227.5039,N,01032.8443,E,0.00,0,231013,FFFBFFFF,106,14, 201,2173#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24338);verifyPosition(decoder, buffer(
                "*HQ,353505220903211,V1,140817,A,5239.3538,N,01003.5292,E,21.03,312,221013,FFFBFFFF,106,14, 203,1cd#"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24339);verifyPosition(decoder, buffer(
                "*HQ,356823035368767,V1,083618,A,0955.6392,N,07809.0796,E,0.00,0,070414,FFFBFFFF,194,3b5,  71,c9a9#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24340);verifyNothing(decoder, buffer(
                "*HQ,8401016597,BASE,152609,0,0,0,0,211014,FFFFFFFF#"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24341);verifyPosition(decoder, binary(
                "2441060116601245431311165035313006004318210e000000fffffbffff0024"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24342);verifyPosition(decoder, binary(
                "24410600082621532131081504419390060740418306000000fffffbfdff0015060000002c02dc0c000000001f"),
                position("2015-08-31 21:53:21.000", true, 4.69898, -74.06971));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24343);verifyPosition(decoder, binary(
                "2427051711092133391406135002584900014337822e000000ffffffffff0000"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24344);verifyPosition(decoder, binary(
                "2427051711092134091406135002584900014337822e000000ffffffffff0000"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24345);verifyPosition(decoder, binary(
                "2410307310010503162209022212874500113466574C014028fffffbffff0000"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24346);verifyPosition(decoder, binary(
                "2441090013450831250401145047888000008554650e000000fffff9ffff001006000000000106020299109c01"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24347);verifyPosition(decoder, binary(
                "24270517030820321418041423307879000463213792000056fffff9ffff0000"));

        __CLR4_5_2iqziqzlx1dxs25.R.inc(24348);verifyPosition(decoder, binary(
                "2441091144271222470112142233983006114026520E000000FFFFFBFFFF0014060000000001CC00262B0F170A"));
        
        __CLR4_5_2iqziqzlx1dxs25.R.inc(24349);verifyPosition(decoder, binary(
                "24971305007205201916101533335008000073206976000000effffbffff000252776566060000000000000000000049"));

    }finally{__CLR4_5_2iqziqzlx1dxs25.R.flushNeeded();}}

}
