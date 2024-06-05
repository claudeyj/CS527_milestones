/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import java.util.Date;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.traccar.database.IdentityManager;
import org.traccar.model.Position;
import org.traccar.model.Device;

public class FilterHandlerTest extends BaseTest {static class __CLR4_5_2hx1hx1lx1e1nm9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,23256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private FilterHandler filtingHandler;
    private FilterHandler passingHandler;

    @Before
    public void setUp() {try{__CLR4_5_2hx1hx1lx1e1nm9.R.inc(23221);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23222);passingHandler = new FilterHandler();
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23223);filtingHandler = new FilterHandler();
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23224);filtingHandler.setFilterInvalid(true);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23225);filtingHandler.setFilterZero(true);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23226);filtingHandler.setFilterDuplicate(true);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23227);filtingHandler.setFilterApproximate(true);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23228);filtingHandler.setFilterStatic(true);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23229);filtingHandler.setFilterDistance(10);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23230);filtingHandler.setFilterLimit(10);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23231);filtingHandler.setFilterFuture(5 * 60);
    }finally{__CLR4_5_2hx1hx1lx1e1nm9.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_5_2hx1hx1lx1e1nm9.R.inc(23232);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23233);filtingHandler = null;
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23234);passingHandler = null;
    }finally{__CLR4_5_2hx1hx1lx1e1nm9.R.flushNeeded();}}

    private Position createPosition(
            long deviceId,
            Date time,
            boolean valid,
            double latitude,
            double longitude,
            double altitude,
            double speed,
            double course) {try{__CLR4_5_2hx1hx1lx1e1nm9.R.inc(23235);

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23236);Position p = new Position();
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23237);p.setDeviceId(deviceId);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23238);p.setTime(time);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23239);p.setValid(valid);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23240);p.setLatitude(latitude);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23241);p.setLongitude(longitude);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23242);p.setAltitude(altitude);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23243);p.setSpeed(speed);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23244);p.setCourse(course);
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23245);return p;
    }finally{__CLR4_5_2hx1hx1lx1e1nm9.R.flushNeeded();}}

    @Test
    public void testFilterInvalid() throws Exception {__CLR4_5_2hx1hx1lx1e1nm9.R.globalSliceStart(getClass().getName(),23246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f94z0hxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hx1hx1lx1e1nm9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hx1hx1lx1e1nm9.R.globalSliceEnd(getClass().getName(),"org.traccar.FilterHandlerTest.testFilterInvalid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f94z0hxq() throws Exception{try{__CLR4_5_2hx1hx1lx1e1nm9.R.inc(23246);

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23247);Position position = createPosition(0, new Date(), true, 10, 10, 10, 10, 10);

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23248);assertNotNull(filtingHandler.decode(null, null, position));
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23249);assertNotNull(passingHandler.decode(null, null, position));

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23250);position = createPosition(0, new Date(Long.MAX_VALUE), true, 10, 10, 10, 10, 10);

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23251);assertNull(filtingHandler.decode(null, null, position));
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23252);assertNotNull(passingHandler.decode(null, null, position));

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23253);position = createPosition(0, new Date(), false, 10, 10, 10, 10, 10);

        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23254);assertNull(filtingHandler.decode(null, null, position));
        __CLR4_5_2hx1hx1lx1e1nm9.R.inc(23255);assertNotNull(passingHandler.decode(null, null, position));
    }finally{__CLR4_5_2hx1hx1lx1e1nm9.R.flushNeeded();}}

}
