/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Command;

public class Tk103ProtocolEncoderTest extends ProtocolTest {static class __CLR4_5_2lb7lb7lwydzt36{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,27662,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEncodeEngineStop() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2espkz1lb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodeEngineStop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2espkz1lb7() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27619);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27620);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27621);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27622);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27623);command.setType(Command.TYPE_ENGINE_STOP);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27624);Assert.assertEquals("(123456789012345AV011)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

    @Test
    public void testEncodePositionSingle() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocu00wlbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodePositionSingle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocu00wlbd() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27625);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27626);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27627);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27628);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27629);command.setType(Command.TYPE_POSITION_SINGLE);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27630);Assert.assertEquals("(123456789012345AP00)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

    @Test
    public void testEncodePositionPeriodic() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wo4vzhlbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodePositionPeriodic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wo4vzhlbj() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27631);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27632);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27633);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27634);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27635);command.setType(Command.TYPE_POSITION_PERIODIC);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27636);command.set(Command.KEY_FREQUENCY, 60);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27637);Assert.assertEquals("(123456789012345AR00003C0000)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

    @Test
    public void testEncodePositionStop() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q0ajvelbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodePositionStop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q0ajvelbq() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27638);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27639);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27640);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27641);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27642);command.setType(Command.TYPE_POSITION_STOP);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27643);Assert.assertEquals("(123456789012345AR0000000000)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

    @Test
    public void testEncodeGetVersion() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aa49v3lbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodeGetVersion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aa49v3lbw() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27644);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27645);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27646);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27647);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27648);command.setType(Command.TYPE_GET_VERSION);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27649);Assert.assertEquals("(123456789012345AP07)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

    @Test
    public void testEncodeRebootDevice() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y55qjulc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodeRebootDevice",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y55qjulc2() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27650);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27651);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27652);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27653);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27654);command.setType(Command.TYPE_REBOOT_DEVICE);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27655);Assert.assertEquals("(123456789012345AT00)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

    @Test
    public void testEncodeSetOdometer() throws Exception {__CLR4_5_2lb7lb7lwydzt36.R.globalSliceStart(getClass().getName(),27656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ukv3dclc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lb7lb7lwydzt36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lb7lb7lwydzt36.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolEncoderTest.testEncodeSetOdometer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ukv3dclc8() throws Exception{try{__CLR4_5_2lb7lb7lwydzt36.R.inc(27656);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27657);Tk103ProtocolEncoder encoder = new Tk103ProtocolEncoder();
        
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27658);Command command = new Command();
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27659);command.setDeviceId(1);
        __CLR4_5_2lb7lb7lwydzt36.R.inc(27660);command.setType(Command.TYPE_SET_ODOMETER);

        __CLR4_5_2lb7lb7lwydzt36.R.inc(27661);Assert.assertEquals("(123456789012345AX01)", encoder.encodeCommand(command));

    }finally{__CLR4_5_2lb7lb7lwydzt36.R.flushNeeded();}}

}
