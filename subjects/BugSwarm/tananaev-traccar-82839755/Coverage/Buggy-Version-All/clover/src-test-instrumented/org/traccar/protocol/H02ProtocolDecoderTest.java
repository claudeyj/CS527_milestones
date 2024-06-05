/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.charset.Charset;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;

public class H02ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2b7xb7xlx1e51y4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565479029L,8589935092L,14572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2b7xb7xlx1e51y4.R.globalSliceStart(getClass().getName(),14541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehb7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b7xb7xlx1e51y4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b7xb7xlx1e51y4.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehb7x() throws Exception{try{__CLR4_5_2b7xb7xlx1e51y4.R.inc(14541);

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14542);H02ProtocolDecoder decoder = new H02ProtocolDecoder(new H02Protocol());

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14543);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,1451316409,V1,030149,A,-23-29.0095,S,-46-51.5852,W,2.4,065,070315,FFFFFFFF#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14544);assertNull(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,353588020068342,V1,000000,V,0.0000,0,0.0000,0,0.00,0.00,000000,ffffffff,000106,000002,000203,004c87,16#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14545);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,3800008786,V1,062507,V,3048.2437,N,03058.5617,E,000.00,000,250413,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14546);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,4300256455,V1,111817,A,1935.5128,N,04656.3243,E,0.00,100,170913,FFE7FBFF#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14547);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,123456789012345,V1,155850,A,5214.5346,N,2117.4683,E,0.00,270.90,131012,ffffffff,000000,000000,000000,000000#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14548);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,353588010001689,V1,221116,A,1548.8220,S,4753.1679,W,0.00,0.00,300413,ffffffff,0002d4,000004,0001cd,000047#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14549);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,354188045498669,V1,195200,A,701.8915,S,3450.3399,W,0.00,205.70,050213,ffffffff,000243,000000,000000#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14550);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,2705171109,V1,213324,A,5002.5849,N,01433.7822,E,0.00,000,140613,FFFFFFFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14551);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V1,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14552);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S17,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14553);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S14,100,10,1,3,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14554);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S20,ERROR,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14555);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S20,DONE,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,F7FFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14556);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,R8,ERROR,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14557);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S23,165.165.33.250:8800,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14558);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S24,thit.gd,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFF#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14559);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*TH,2020916012,V4,S1,OK,pass_word,130305,050316,A,2212.8745,N,11346.6574,E,14.28,028,220902,FFFFFBFD#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14560);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,353588020068342,V1,062840,A,5241.1249,N,954.9490,E,0.00,0.00,231013,ffffffff,000106,000002,000203,004c87,24#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14561);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,353505220903211,V1,075228,A,5227.5039,N,01032.8443,E,0.00,0,231013,FFFBFFFF,106,14, 201,2173#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14562);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,353505220903211,V1,140817,A,5239.3538,N,01003.5292,E,21.03,312,221013,FFFBFFFF,106,14, 203,1cd#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14563);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,356823035368767,V1,083618,A,0955.6392,N,07809.0796,E,0.00,0,070414,FFFBFFFF,194,3b5,  71,c9a9#", Charset.defaultCharset())));
        
        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14564);assertNull(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "*HQ,8401016597,BASE,152609,0,0,0,0,211014,FFFFFFFF#", Charset.defaultCharset())));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14565);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "24410600082621532131081504419390060740418306000000fffffbfdff0015060000002c02dc0c000000001f"))));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14566);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "2427051711092133391406135002584900014337822e000000ffffffffff0000"))));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14567);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "2427051711092134091406135002584900014337822e000000ffffffffff0000"))));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14568);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "2410307310010503162209022212874500113466574C014028fffffbffff0000"))));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14569);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "2441090013450831250401145047888000008554650e000000fffff9ffff001006000000000106020299109c01"))));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14570);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "24270517030820321418041423307879000463213792000056fffff9ffff0000"))));

        __CLR4_5_2b7xb7xlx1e51y4.R.inc(14571);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "2441091144271222470112142233983006114026520E000000FFFFFBFFFF0014060000000001CC00262B0F170A"))));

    }finally{__CLR4_5_2b7xb7xlx1e51y4.R.flushNeeded();}}

}
