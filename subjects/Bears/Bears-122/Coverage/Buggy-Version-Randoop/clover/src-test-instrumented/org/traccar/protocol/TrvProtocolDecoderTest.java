/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TrvProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2lfilfilwydymki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,27789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2lfilfilwydymki.R.globalSliceStart(getClass().getName(),27774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehlfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lfilfilwydymki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lfilfilwydymki.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TrvProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27774,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehlfi() throws Exception{try{__CLR4_5_2lfilfilwydymki.R.inc(27774);

        __CLR4_5_2lfilfilwydymki.R.inc(27775);TrvProtocolDecoder decoder = new TrvProtocolDecoder(new TrvProtocol());

        __CLR4_5_2lfilfilwydymki.R.inc(27776);verifyNull(decoder, text(
                "IWAP00353456789012345"));

        __CLR4_5_2lfilfilwydymki.R.inc(27777);verifyPosition(decoder, text(
                "IWAP01080524A2232.9806N11404.9355E000.1061830323.8706000908000102,460,0,9520,3671,Home|74-DE-2B-44-88-8C|97& Home1|74-DE-2B-44-88-8C|97&Home2|74-DE-2B-44-88-8C|97& Home3|74-DE-2B-44-88-8C|97"));

        __CLR4_5_2lfilfilwydymki.R.inc(27778);verifyNull(decoder, text(
                "IWAP02,zh_cn,0,7,460,0,9520|3671|13,9520|3672|12,9520|3673|11,9520|3674|10,9520|3675|9,9520|3676|8,9520|3677|7,4,1|D8-24-BD-79-FA-1F|59&2|3C-46-D8-6D-CE-01|81&3|0C-4C-39-1A-7C-65|69&4|70-A8-E3-5D-D7-C0|65"));

        __CLR4_5_2lfilfilwydymki.R.inc(27779);verifyPosition(decoder, text(
                "IWAP10080524A2232.9806N11404.9355E000.1061830323.8706000908000502,460,0,9520,3671,00,zh-cn,00,HOME|74-DE-2B-44-88-8C|97&HOME1|74-DE-2B-44-88-8C|97&HOME2|74-DE-2B-44-88-8C|97&HOME3|74-DE-2B-44-88-8C|97"));

        __CLR4_5_2lfilfilwydymki.R.inc(27780);verifyNull(decoder, text(
                "IWAP03,06000908000102,5555,30"));

        __CLR4_5_2lfilfilwydymki.R.inc(27781);verifyNull(decoder, text(
                "TRVAP00353456789012345"));

        __CLR4_5_2lfilfilwydymki.R.inc(27782);verifyAttributes(decoder, text(
                "TRVCP01,06000908000102"));

        __CLR4_5_2lfilfilwydymki.R.inc(27783);verifyAttributes(decoder, text(
                "TRVCP01,100007100000001020151060011"));

        __CLR4_5_2lfilfilwydymki.R.inc(27784);verifyPosition(decoder, text(
                "TRVAP01160211A2544.5118N05553.7586E105.711185941.52010001010010000,424,030,3011,27003"));

        __CLR4_5_2lfilfilwydymki.R.inc(27785);verifyPosition(decoder, text(
                "TRVAP01160209A2540.8863N05546.6125E005.6075734123.7910000810010000,424,030,3012,27323"));

        __CLR4_5_2lfilfilwydymki.R.inc(27786);verifyPosition(decoder, text(
                "TRVAP01080524A2232.9806N11404.9355E000.1061830323.8706000908000102,460,0,9520,3671"));

        __CLR4_5_2lfilfilwydymki.R.inc(27787);verifyPosition(decoder, text(
                "TRVAP01080524A2232.9806N11404.9355E000.1061830323.8706000908000102,460,0,9520,3671"),
                position("2008-05-24 06:18:30.000", true, 22.54968, 114.08226));

        __CLR4_5_2lfilfilwydymki.R.inc(27788);verifyPosition(decoder, text(
                "TRVAP10080524A2232.9806N11404.9355E000.1061830323.8706000908000502,460,0,9520,3671,00,zh-cn,00"));

    }finally{__CLR4_5_2lfilfilwydymki.R.flushNeeded();}}

}
