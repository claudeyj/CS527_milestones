/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Command;

public class H02ProtocolEncoderTest extends ProtocolTest {static class __CLR4_5_2iseiselx1dxs2a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,24376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private H02ProtocolEncoder encoder = new H02ProtocolEncoder();
    private DateTime time = new DateTime().withHourOfDay(1).withMinuteOfHour(2).withSecondOfMinute(3);;

    @Test
    public void testAlarmArmEncode() throws Exception {__CLR4_5_2iseiselx1dxs2a.R.globalSliceStart(getClass().getName(),24350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0ld46ise();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iseiselx1dxs2a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iseiselx1dxs2a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolEncoderTest.testAlarmArmEncode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0ld46ise() throws Exception{try{__CLR4_5_2iseiselx1dxs2a.R.inc(24350);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24351);Command command = new Command();
        __CLR4_5_2iseiselx1dxs2a.R.inc(24352);command.setDeviceId(1);
        __CLR4_5_2iseiselx1dxs2a.R.inc(24353);command.setType(Command.TYPE_ALARM_ARM);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24354);Assert.assertEquals("*HQ,123456789012345,SCF,010203,0,0#", encoder.encodeCommand(command, time));
    }finally{__CLR4_5_2iseiselx1dxs2a.R.flushNeeded();}}

    @Test
    public void testAlarmDisarmEncode() throws Exception {__CLR4_5_2iseiselx1dxs2a.R.globalSliceStart(getClass().getName(),24355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ci7r9yisj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iseiselx1dxs2a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iseiselx1dxs2a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolEncoderTest.testAlarmDisarmEncode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ci7r9yisj() throws Exception{try{__CLR4_5_2iseiselx1dxs2a.R.inc(24355);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24356);Command command = new Command();
        __CLR4_5_2iseiselx1dxs2a.R.inc(24357);command.setDeviceId(1);
        __CLR4_5_2iseiselx1dxs2a.R.inc(24358);command.setType(Command.TYPE_ALARM_DISARM);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24359);Assert.assertEquals("*HQ,123456789012345,SCF,010203,1,1#", encoder.encodeCommand(command, time));
    }finally{__CLR4_5_2iseiselx1dxs2a.R.flushNeeded();}}

    @Test
    public void testEngineStopEncode() throws Exception {__CLR4_5_2iseiselx1dxs2a.R.globalSliceStart(getClass().getName(),24360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o1a61fiso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iseiselx1dxs2a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iseiselx1dxs2a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolEncoderTest.testEngineStopEncode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o1a61fiso() throws Exception{try{__CLR4_5_2iseiselx1dxs2a.R.inc(24360);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24361);Command command = new Command();
        __CLR4_5_2iseiselx1dxs2a.R.inc(24362);command.setDeviceId(1);
        __CLR4_5_2iseiselx1dxs2a.R.inc(24363);command.setType(Command.TYPE_ENGINE_STOP);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24364);Assert.assertEquals("*HQ,123456789012345,S20,010203,1,3,10,3,5,5,3,5,3,5,3,5#", encoder.encodeCommand(command, time));
    }finally{__CLR4_5_2iseiselx1dxs2a.R.flushNeeded();}}

    @Test
    public void testEngineResumeEncode() throws Exception {__CLR4_5_2iseiselx1dxs2a.R.globalSliceStart(getClass().getName(),24365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojh2siist();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iseiselx1dxs2a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iseiselx1dxs2a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolEncoderTest.testEngineResumeEncode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojh2siist() throws Exception{try{__CLR4_5_2iseiselx1dxs2a.R.inc(24365);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24366);Command command = new Command();
        __CLR4_5_2iseiselx1dxs2a.R.inc(24367);command.setDeviceId(1);
        __CLR4_5_2iseiselx1dxs2a.R.inc(24368);command.setType(Command.TYPE_ENGINE_RESUME);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24369);Assert.assertEquals("*HQ,123456789012345,S20,010203,0,0#", encoder.encodeCommand(command, time));
    }finally{__CLR4_5_2iseiselx1dxs2a.R.flushNeeded();}}

    @Test
    public void testPositionPeriodicEncode() throws Exception {__CLR4_5_2iseiselx1dxs2a.R.globalSliceStart(getClass().getName(),24370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqpqtvisy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iseiselx1dxs2a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iseiselx1dxs2a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02ProtocolEncoderTest.testPositionPeriodicEncode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqpqtvisy() throws Exception{try{__CLR4_5_2iseiselx1dxs2a.R.inc(24370);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24371);Command command = new Command();
        __CLR4_5_2iseiselx1dxs2a.R.inc(24372);command.setDeviceId(1);
        __CLR4_5_2iseiselx1dxs2a.R.inc(24373);command.set(Command.KEY_FREQUENCY, 10);
        __CLR4_5_2iseiselx1dxs2a.R.inc(24374);command.setType(Command.TYPE_POSITION_PERIODIC);

        __CLR4_5_2iseiselx1dxs2a.R.inc(24375);Assert.assertEquals("*HQ,123456789012345,S71,010203,22,10#", encoder.encodeCommand(command, time));
    }finally{__CLR4_5_2iseiselx1dxs2a.R.flushNeeded();}}

}
