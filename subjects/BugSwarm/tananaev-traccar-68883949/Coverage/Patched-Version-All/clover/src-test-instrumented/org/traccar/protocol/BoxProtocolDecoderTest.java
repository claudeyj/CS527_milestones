/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import org.traccar.helper.TestDataManager;
import static org.traccar.helper.DecoderVerifier.verify;
import org.junit.Test;

public class BoxProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_28qp8qplx1dsoua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564902470L,8589935092L,11337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_28qp8qplx1dsoua.R.globalSliceStart(getClass().getName(),11329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49eh8qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28qp8qplx1dsoua.R.rethrow($CLV_t2$);}finally{__CLR4_5_28qp8qplx1dsoua.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.BoxProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49eh8qp() throws Exception{try{__CLR4_5_28qp8qplx1dsoua.R.inc(11329);

        __CLR4_5_28qp8qplx1dsoua.R.inc(11330);BoxProtocolDecoder decoder = new BoxProtocolDecoder(new BoxProtocol());
        
        __CLR4_5_28qp8qplx1dsoua.R.inc(11331);assertNull(decoder.decode(null, null,
                "H,BT,358281002435893,081028142432,F5813D19,6D6E6DC2"));
        
        __CLR4_5_28qp8qplx1dsoua.R.inc(11332);assertNull(decoder.decode(null, null,
                "H,BT,N878123,080415081234,D63E6DD9,6D6E6DC2,8944100300825505377"));

        __CLR4_5_28qp8qplx1dsoua.R.inc(11333);verify(decoder.decode(null, null,
                "L,081028142429,G,52.51084,-1.70849,0,170,0,1,0"));

        __CLR4_5_28qp8qplx1dsoua.R.inc(11334);verify(decoder.decode(null, null,
                "L,081028142432,G,52.51081,-1.70849,0,203,0,16,0"));

        __CLR4_5_28qp8qplx1dsoua.R.inc(11335);assertNull(decoder.decode(null, null,
                "L,080528112501,AI1,145.56"));

        __CLR4_5_28qp8qplx1dsoua.R.inc(11336);assertNull(decoder.decode(null, null,
                "E,1"));

    }finally{__CLR4_5_28qp8qplx1dsoua.R.flushNeeded();}}

}
