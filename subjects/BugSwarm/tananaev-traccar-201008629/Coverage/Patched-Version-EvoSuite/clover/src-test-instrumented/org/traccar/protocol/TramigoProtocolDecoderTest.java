/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TramigoProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jkijkilx1dzed7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,25374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jkijkilx1dzed7.R.globalSliceStart(getClass().getName(),25362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jkijkilx1dzed7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jkijkilx1dzed7.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TramigoProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjki() throws Exception{try{__CLR4_5_2jkijkilx1dzed7.R.inc(25362);

        __CLR4_5_2jkijkilx1dzed7.R.inc(25363);TramigoProtocolDecoder decoder = new TramigoProtocolDecoder(new TramigoProtocol());

        __CLR4_5_2jkijkilx1dzed7.R.inc(25364);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "80009e08b00086000101bc1803778a59c58dea57546573742054323320547261636b65723a204d6f76696e672c20312e3639206b6d204e57206f66205574656b6f6e2c2045646f2c204e472c20362e34363137302c20352e36313938322c20452077697468207370656564203333206b6d2f682c2031363a3138205365702032372020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25365);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "8000853eb000b8000101fcff032f14665a89e2564176656e7369732053797353657276653a2049676e6974696f6e206f6e2064657465637465642c206d6f76696e672c20302e3135206b6d205357206f66204261626120416e696d61736861756e205374726565742d426f64652054686f6d61732053742e2c20537572756c6572652c204c61676f7320436974792c204e472c20362e34383736352c20332e33343735352c2031303a3031204d6172203131202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25366);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "8000973eb000b90001012128032f14667794e2564176656e7369732053797353657276653a2049676e6974696f6e206f6e2064657465637465642c2073746f707065642c20302e3134206b6d205357206f66204261626120416e696d61736861756e205374726565742d426f64652054686f6d61732053742e2c20537572756c6572652c204c61676f7320436974792c204e472c20362e34383736372c20332e33343737332c2031303a3438204d6172203131202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25367);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "8000b73eb000ad000101fdd2032f1466c9cbe2564176656e7369732053797353657276653a2049676e6974696f6e206f6e2064657465637465642c206d6f76696e672c20302e3131206b6d2045206f6620416c68616a69204d6173686120526f616420466f6f746272696467652c20537572756c6572652c204c61676f7320436974792c204e472c20362e35303031342c20332e33353434332c2031343a3434204d6172203131202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25368);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "8000883eb000d3000101b223032f1466fc89e2564176656e7369732053797353657276653a2049676e6974696f6e206f66662064657465637465642c2049676e4f6e506572696f643a2030303a30323a34312c2073746f707065642c20302e3039206b6d205345206f66204a696e616475205072696d617279205363686f6f6c20416465204f6e6974696d6572696e2053742e2c20537572756c6572652c204c61676f7320436974792c204e472c20362e34383639332c20332e33343636302c2031303a3033204d6172203131202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25369);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "80009a3eb000d300010109ff032f1466b195e2564176656e7369732053797353657276653a2049676e6974696f6e206f66662064657465637465642c2049676e4f6e506572696f643a2030303a30353a31342c2073746f707065642c20302e3039206b6d205345206f66204a696e616475205072696d617279205363686f6f6c20416465204f6e6974696d6572696e2053742e2c20537572756c6572652c204c61676f7320436974792c204e472c20362e34383639312c20332e33343636322c2031303a3533204d6172203131202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25370);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "8000bc3eb000ba000101622c032f1466bacce2564176656e7369732053797353657276653a2049676e6974696f6e206f66662064657465637465642c2049676e4f6e506572696f643a2030303a30343a30302c206d6f76696e672c20617420416b6572656c6520526f61642d4f67756e6c616e612044726976652c20537572756c6572652c204c61676f7320436974792c204e472c20362e35303630332c20332e33353232382c2031343a3438204d6172203131202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25371);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "80001d3cb000b3000101160f032f1466b475e0564176656e7369732053797353657276653a205374617475732c204750533a203931252c2047534d3a203737252c20475052533a20436f6e6e65637465642c20626174746572793a20313030252c207265706f7274733a2049676e6974696f6e20286f6666292c205374617475732028352c322e302c3732302c3330292c20362e34393239382c20332e33343836352c2031393a3038204d6172203920454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25372);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "80005408b000af000101b23903677f00c8436d3842616c697365204f6e653a20416c6c756d616765206d61726368652064e974656374e92c20676172e92c20302e3735206b6d20452064652045636f6c65204175746f726f757465206465204b696e73686173612c2056696c6c65206465204b696e73686173612c204b696e73686173612c2043442c202d342e33343130362c2031352e33343931352c2030313a3030204a616e2031202020454f46"));

        __CLR4_5_2jkijkilx1dzed7.R.inc(25373);verifyAttributes(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "8000011bb0009e0001015b93032ef6f35994a9545472616d69676f3a204d6f76696e672c20302e3930206b6d205345206f66204372616e6562726f6f6b20466972652053746174696f6e2c2050656e726974682c205379646e65792c2041552c202d33332e37303732322c203135302e37313735392c2053452077697468207370656564203337206b6d2f682c2031393a3438204a616e20342020454f46"));

    }finally{__CLR4_5_2jkijkilx1dzed7.R.flushNeeded();}}

}
