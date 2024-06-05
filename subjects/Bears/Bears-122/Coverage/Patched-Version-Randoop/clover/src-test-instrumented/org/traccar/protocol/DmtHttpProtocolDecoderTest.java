/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.handler.codec.http.HttpMethod;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class DmtHttpProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k5bk5blwye68py{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k5bk5blwye68py.R.globalSliceStart(getClass().getName(),26111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5bk5blwye68py.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5bk5blwye68py.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.DmtHttpProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk5b() throws Exception{try{__CLR4_5_2k5bk5blwye68py.R.inc(26111);

        __CLR4_5_2k5bk5blwye68py.R.inc(26112);DmtHttpProtocolDecoder decoder = new DmtHttpProtocolDecoder(new DmtHttpProtocol());

        __CLR4_5_2k5bk5blwye68py.R.inc(26113);verifyPositions(decoder, request(HttpMethod.POST, "/",
                buffer("{\"SerNo\":131693,\"IMEI\":\"356692063643328\",\"ICCID\":\"8944538523010771676\",\"ProdId\":33,\"FW\":\"33.4.1.27\",\"Records\":[{\"SeqNo\":125,\"Reason\":11,\"DateUTC\":\"2017-05-11 05:58:44\",\"Fields\":[{\"GpsUTC\":\"2017-05-08 18:04:57\",\"Lat\":43.7370138,\"Long\":-79.3462607,\"Alt\":197,\"Spd\":0,\"SpdAcc\":13,\"Head\":66,\"PDOP\":18,\"PosAcc\":37,\"GpsStat\":7,\"FType\":0},{\"DIn\":2,\"DOut\":0,\"DevStat\":2,\"FType\":2},{\"AnalogueData\":{\"1\":14641,\"3\":2484,\"4\":26,\"5\":10868},\"FType\":6},{\"AnalogueData\":{\"11\":34,\"12\":0,\"13\":309,\"14\":9921,\"15\":3},\"FType\":7}]},{\"SeqNo\":128,\"Reason\":11,\"DateUTC\":\"2017-05-11 17:59:45\",\"Fields\":[{\"GpsUTC\":\"2017-05-08 18:04:57\",\"Lat\":43.7370138,\"Long\":-79.3462607,\"Alt\":197,\"Spd\":0,\"SpdAcc\":13,\"Head\":66,\"PDOP\":18,\"PosAcc\":37,\"GpsStat\":7,\"FType\":0},{\"DIn\":2,\"DOut\":0,\"DevStat\":2,\"FType\":2},{\"AnalogueData\":{\"1\":14607,\"3\":2752,\"4\":26,\"5\":11062},\"FType\":6},{\"AnalogueData\":{\"11\":34,\"12\":1,\"13\":325,\"14\":10881,\"15\":3},\"FType\":7}]},{\"SeqNo\":130,\"Reason\":9,\"DateUTC\":\"2017-05-11 19:30:03\",\"Fields\":[{\"GpsUTC\":\"2017-05-08 18:04:57\",\"Lat\":43.7370138,\"Long\":-79.3462607,\"Alt\":197,\"Spd\":0,\"SpdAcc\":13,\"Head\":66,\"PDOP\":18,\"PosAcc\":37,\"GpsStat\":3,\"FType\":0},{\"DIn\":6,\"DOut\":0,\"DevStat\":2,\"FType\":2},{\"AnalogueData\":{\"1\":14599,\"3\":2731,\"4\":27,\"5\":10965},\"FType\":6},{\"AnalogueData\":{\"11\":34,\"12\":2,\"13\":329,\"14\":11121,\"15\":3},\"FType\":7}]},{\"SeqNo\":131,\"Reason\":11,\"DateUTC\":\"2017-05-11 19:32:03\",\"Fields\":[{\"GpsUTC\":\"2017-05-08 18:04:57\",\"Lat\":43.7370138,\"Long\":-79.3462607,\"Alt\":197,\"Spd\":0,\"SpdAcc\":13,\"Head\":66,\"PDOP\":18,\"PosAcc\":37,\"GpsStat\":7,\"FType\":0},{\"DIn\":6,\"DOut\":0,\"DevStat\":2,\"FType\":2},{\"AnalogueData\":{\"1\":14403,\"3\":2783,\"4\":27,\"5\":10965},\"FType\":6},{\"AnalogueData\":{\"11\":34,\"12\":2,\"13\":330,\"14\":11181,\"15\":3},\"FType\":7}]},{\"SeqNo\":133,\"Reason\":11,\"DateUTC\":\"2017-05-11 19:36:15\",\"Fields\":[{\"GpsUTC\":\"2017-05-08 18:04:57\",\"Lat\":43.7370138,\"Long\":-79.3462607,\"Alt\":197,\"Spd\":0,\"SpdAcc\":13,\"Head\":66,\"PDOP\":18,\"PosAcc\":37,\"GpsStat\":7,\"FType\":0},{\"DIn\":6,\"DOut\":0,\"DevStat\":2,\"FType\":2},{\"AnalogueData\":{\"1\":14319,\"3\":2898,\"4\":23,\"5\":10965},\"FType\":6},{\"AnalogueData\":{\"11\":34,\"12\":3,\"13\":331,\"14\":11241,\"15\":3},\"FType\":7}]}]}")));

    }finally{__CLR4_5_2k5bk5blwye68py.R.flushNeeded();}}

}