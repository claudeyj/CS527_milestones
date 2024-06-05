/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;


public class CityeasyProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k4mk4mlwye68pc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k4mk4mlwye68pc.R.globalSliceStart(getClass().getName(),26086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k4mk4mlwye68pc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k4mk4mlwye68pc.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.CityeasyProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk4m() throws Exception{try{__CLR4_5_2k4mk4mlwye68pc.R.inc(26086);

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26087);CityeasyProtocolDecoder decoder = new CityeasyProtocolDecoder(new CityeasyProtocol());

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26088);verifyNotNull(decoder, binary(
                "545400853575570249020100033b3430342c34352c31303638312c31313632312c33352c31303638312c31313632322c32332c31303638312c32383938332c32332c31303638312c31313632332c32312c31303638312c32333338312c31372c31303638312c32323538332c31372c31303638312c32363434312c31330000000d352e0d0a"));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26089);verifyNull(decoder, binary(
                "54540019357557024902010002520704100000000bbe700d0a"));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26090);verifyNull(decoder, binary(
                "5454001735755702490201434a01000000000c24280d0a"));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26091);verifyNull(decoder, binary(
                "545400153520000000000100010000000111000D0A"));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26092);verifyNull(decoder, binary(
                "54540019357557024902000002520704300000000376390d0a"));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26093);verifyPosition(decoder, binary(
                "5454006135200000000001000332303134313131303039353430392C412C342C4E2C32322E3533373232382C452C3131342E3032323737342C302E312C312E392C35302E363B3436302C302C31303137332C343635322C34310000000B63130D0A"),
                position("2014-11-10 09:54:09.000", true, 22.53723, 114.02277));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26094);verifyPosition(decoder, binary(
                "5454006135200000000001000432303134313131303039353330362C412C352C4E2C32322E3533373233352C452C3131342E3032323838312C302E322C312E362C35342E313B3436302C302C31303137332C343635322C343100000045EC620D0A"));

        __CLR4_5_2k4mk4mlwye68pc.R.inc(26095);verifyPosition(decoder, binary(
                "5454009035755702490200000332303135303732393033303834352c412c362c4e2c31322e3833353735362c452c37372e3638373039362c302e332c312e322c3931302e303b3430342c34352c31303638312c31313632312c34332c31303638312c31313632332c32312c31303638312c32323538332c32302c31303638312c32333338312c31380000000267370d0a"));

    }finally{__CLR4_5_2k4mk4mlwye68pc.R.flushNeeded();}}

}
