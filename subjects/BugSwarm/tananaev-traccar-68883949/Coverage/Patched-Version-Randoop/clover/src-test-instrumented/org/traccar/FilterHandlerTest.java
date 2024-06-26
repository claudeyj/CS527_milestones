/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.TestDataManager;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.protocol.AtrackProtocolDecoder;

import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.traccar.helper.DecoderVerifier.verify;

public class FilterHandlerTest {static class __CLR4_5_28kn8knlx1dp9os{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564743050L,8589935092L,11135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private FilterHandler filtingHandler;
    private FilterHandler passingHandler;

    @Before
    public void setUp() {try{__CLR4_5_28kn8knlx1dp9os.R.inc(11111);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11112);filtingHandler = new FilterHandler(true, true, true, 10, 10);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11113);passingHandler = new FilterHandler(false, false, false, 0, 0);
    }finally{__CLR4_5_28kn8knlx1dp9os.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_5_28kn8knlx1dp9os.R.inc(11114);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11115);filtingHandler = null;
        __CLR4_5_28kn8knlx1dp9os.R.inc(11116);passingHandler = null;
    }finally{__CLR4_5_28kn8knlx1dp9os.R.flushNeeded();}}
    
    private Position createPosition(
            long deviceId,
            Date time,
            boolean valid,
            double latitude,
            double longitude,
            double altitude,
            double speed,
            double course) {try{__CLR4_5_28kn8knlx1dp9os.R.inc(11117);

        __CLR4_5_28kn8knlx1dp9os.R.inc(11118);Position p = new Position();
        __CLR4_5_28kn8knlx1dp9os.R.inc(11119);p.setDeviceId(deviceId);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11120);p.setTime(time);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11121);p.setValid(valid);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11122);p.setLatitude(latitude);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11123);p.setLongitude(longitude);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11124);p.setAltitude(altitude);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11125);p.setSpeed(speed);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11126);p.setCourse(course);
        __CLR4_5_28kn8knlx1dp9os.R.inc(11127);return p;
    }finally{__CLR4_5_28kn8knlx1dp9os.R.flushNeeded();}}

    @Test
    public void testFilterInvalid() throws Exception {__CLR4_5_28kn8knlx1dp9os.R.globalSliceStart(getClass().getName(),11128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f94z08l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28kn8knlx1dp9os.R.rethrow($CLV_t2$);}finally{__CLR4_5_28kn8knlx1dp9os.R.globalSliceEnd(getClass().getName(),"org.traccar.FilterHandlerTest.testFilterInvalid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f94z08l4() throws Exception{try{__CLR4_5_28kn8knlx1dp9os.R.inc(11128);

        __CLR4_5_28kn8knlx1dp9os.R.inc(11129);Position position = createPosition(0, new Date(), true, 10, 10, 10, 10, 10);

        __CLR4_5_28kn8knlx1dp9os.R.inc(11130);assertNotNull(filtingHandler.decode(null, null, position));
        __CLR4_5_28kn8knlx1dp9os.R.inc(11131);assertNotNull(passingHandler.decode(null, null, position));

        __CLR4_5_28kn8knlx1dp9os.R.inc(11132);position = createPosition(0, new Date(), false, 10, 10, 10, 10, 10);

        __CLR4_5_28kn8knlx1dp9os.R.inc(11133);assertNull(filtingHandler.decode(null, null, position));
        __CLR4_5_28kn8knlx1dp9os.R.inc(11134);assertNotNull(passingHandler.decode(null, null, position));
    }finally{__CLR4_5_28kn8knlx1dp9os.R.flushNeeded();}}

}
