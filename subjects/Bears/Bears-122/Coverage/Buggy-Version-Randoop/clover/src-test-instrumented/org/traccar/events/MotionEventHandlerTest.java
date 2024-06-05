/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.events;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;
import org.traccar.BaseTest;
import org.traccar.model.DeviceState;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.reports.model.TripsConfig;

public class MotionEventHandlerTest extends BaseTest {static class __CLR4_5_2jn9jn9lwydylvk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,25495,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Date date(String time) throws ParseException {try{__CLR4_5_2jn9jn9lwydylvk.R.inc(25461);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25462);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25463);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25464);return dateFormat.parse(time);
    }finally{__CLR4_5_2jn9jn9lwydylvk.R.flushNeeded();}}

    @Test
    public void testMotionEventHandler() throws Exception {__CLR4_5_2jn9jn9lwydylvk.R.globalSliceStart(getClass().getName(),25465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lncdi9jnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn9jn9lwydylvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn9jn9lwydylvk.R.globalSliceEnd(getClass().getName(),"org.traccar.events.MotionEventHandlerTest.testMotionEventHandler",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lncdi9jnd() throws Exception{try{__CLR4_5_2jn9jn9lwydylvk.R.inc(25465);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25466);TripsConfig tripsConfig = new TripsConfig(500, 300 * 1000, 300 * 1000, false, 0);

        __CLR4_5_2jn9jn9lwydylvk.R.inc(25467);Position position = new Position();
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25468);position.setTime(date("2017-01-01 00:00:00"));
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25469);position.set(Position.KEY_MOTION, true);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25470);position.set(Position.KEY_TOTAL_DISTANCE, 0);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25471);DeviceState deviceState = new DeviceState();
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25472);deviceState.setMotionState(false);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25473);deviceState.setMotionPosition(position);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25474);Position nextPosition = new Position();

        __CLR4_5_2jn9jn9lwydylvk.R.inc(25475);nextPosition.setTime(date("2017-01-01 00:02:00"));
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25476);nextPosition.set(Position.KEY_MOTION, true);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25477);nextPosition.set(Position.KEY_TOTAL_DISTANCE, 200);

        __CLR4_5_2jn9jn9lwydylvk.R.inc(25478);Event event = MotionEventHandler.updateMotionState(deviceState, nextPosition, tripsConfig);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25479);assertNull(event);

        __CLR4_5_2jn9jn9lwydylvk.R.inc(25480);nextPosition.set(Position.KEY_TOTAL_DISTANCE, 600);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25481);event = MotionEventHandler.updateMotionState(deviceState, nextPosition, tripsConfig);        
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25482);assertNotNull(event);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25483);assertEquals(Event.TYPE_DEVICE_MOVING, event.getType());
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25484);assertTrue(deviceState.getMotionState());
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25485);assertNull(deviceState.getMotionPosition());

        __CLR4_5_2jn9jn9lwydylvk.R.inc(25486);deviceState.setMotionState(false);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25487);deviceState.setMotionPosition(position);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25488);nextPosition.setTime(date("2017-01-01 00:06:00"));
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25489);nextPosition.set(Position.KEY_TOTAL_DISTANCE, 200);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25490);event = MotionEventHandler.updateMotionState(deviceState, nextPosition, tripsConfig);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25491);assertNotNull(event);
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25492);assertEquals(Event.TYPE_DEVICE_MOVING, event.getType());
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25493);assertTrue(deviceState.getMotionState());
        __CLR4_5_2jn9jn9lwydylvk.R.inc(25494);assertNull(deviceState.getMotionPosition());
    }finally{__CLR4_5_2jn9jn9lwydylvk.R.flushNeeded();}}

}
