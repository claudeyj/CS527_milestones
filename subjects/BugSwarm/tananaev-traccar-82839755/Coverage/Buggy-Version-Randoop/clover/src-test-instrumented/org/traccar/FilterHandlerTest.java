/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import java.util.Date;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.traccar.model.Position;

public class FilterHandlerTest {static class __CLR4_5_2atgatglx1e46ea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private FilterHandler filtingHandler;
    private FilterHandler passingHandler;

    @Before
    public void setUp() {try{__CLR4_5_2atgatglx1e46ea.R.inc(14020);
        __CLR4_5_2atgatglx1e46ea.R.inc(14021);filtingHandler = new FilterHandler(true, true, true, 10, 10);
        __CLR4_5_2atgatglx1e46ea.R.inc(14022);passingHandler = new FilterHandler(false, false, false, 0, 0);
    }finally{__CLR4_5_2atgatglx1e46ea.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_5_2atgatglx1e46ea.R.inc(14023);
        __CLR4_5_2atgatglx1e46ea.R.inc(14024);filtingHandler = null;
        __CLR4_5_2atgatglx1e46ea.R.inc(14025);passingHandler = null;
    }finally{__CLR4_5_2atgatglx1e46ea.R.flushNeeded();}}
    
    private Position createPosition(
            long deviceId,
            Date time,
            boolean valid,
            double latitude,
            double longitude,
            double altitude,
            double speed,
            double course) {try{__CLR4_5_2atgatglx1e46ea.R.inc(14026);

        __CLR4_5_2atgatglx1e46ea.R.inc(14027);Position p = new Position();
        __CLR4_5_2atgatglx1e46ea.R.inc(14028);p.setDeviceId(deviceId);
        __CLR4_5_2atgatglx1e46ea.R.inc(14029);p.setTime(time);
        __CLR4_5_2atgatglx1e46ea.R.inc(14030);p.setValid(valid);
        __CLR4_5_2atgatglx1e46ea.R.inc(14031);p.setLatitude(latitude);
        __CLR4_5_2atgatglx1e46ea.R.inc(14032);p.setLongitude(longitude);
        __CLR4_5_2atgatglx1e46ea.R.inc(14033);p.setAltitude(altitude);
        __CLR4_5_2atgatglx1e46ea.R.inc(14034);p.setSpeed(speed);
        __CLR4_5_2atgatglx1e46ea.R.inc(14035);p.setCourse(course);
        __CLR4_5_2atgatglx1e46ea.R.inc(14036);return p;
    }finally{__CLR4_5_2atgatglx1e46ea.R.flushNeeded();}}

    @Test
    public void testFilterInvalid() throws Exception {__CLR4_5_2atgatglx1e46ea.R.globalSliceStart(getClass().getName(),14037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f94z0atx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2atgatglx1e46ea.R.rethrow($CLV_t2$);}finally{__CLR4_5_2atgatglx1e46ea.R.globalSliceEnd(getClass().getName(),"org.traccar.FilterHandlerTest.testFilterInvalid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f94z0atx() throws Exception{try{__CLR4_5_2atgatglx1e46ea.R.inc(14037);

        __CLR4_5_2atgatglx1e46ea.R.inc(14038);Position position = createPosition(0, new Date(), true, 10, 10, 10, 10, 10);

        __CLR4_5_2atgatglx1e46ea.R.inc(14039);assertNotNull(filtingHandler.decode(null, null, position));
        __CLR4_5_2atgatglx1e46ea.R.inc(14040);assertNotNull(passingHandler.decode(null, null, position));

        __CLR4_5_2atgatglx1e46ea.R.inc(14041);position = createPosition(0, new Date(), false, 10, 10, 10, 10, 10);

        __CLR4_5_2atgatglx1e46ea.R.inc(14042);assertNull(filtingHandler.decode(null, null, position));
        __CLR4_5_2atgatglx1e46ea.R.inc(14043);assertNotNull(passingHandler.decode(null, null, position));
    }finally{__CLR4_5_2atgatglx1e46ea.R.flushNeeded();}}

}
