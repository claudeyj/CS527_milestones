/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Command;

public class Pt502ProtocolEncoderTest extends ProtocolTest {static class __CLR4_5_2l20l20lwydwgwh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,27310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEncodeOutputControl() throws Exception {__CLR4_5_2l20l20lwydwgwh.R.globalSliceStart(getClass().getName(),27288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2blarujl20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l20l20lwydwgwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l20l20lwydwgwh.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Pt502ProtocolEncoderTest.testEncodeOutputControl",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2blarujl20() throws Exception{try{__CLR4_5_2l20l20lwydwgwh.R.inc(27288);

        __CLR4_5_2l20l20lwydwgwh.R.inc(27289);Pt502ProtocolEncoder encoder = new Pt502ProtocolEncoder();
        
        __CLR4_5_2l20l20lwydwgwh.R.inc(27290);Command command = new Command();
        __CLR4_5_2l20l20lwydwgwh.R.inc(27291);command.setDeviceId(1);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27292);command.setType(Command.TYPE_OUTPUT_CONTROL);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27293);command.set(Command.KEY_INDEX, 2);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27294);command.set(Command.KEY_DATA, 1);
        
        __CLR4_5_2l20l20lwydwgwh.R.inc(27295);Assert.assertEquals("#OPC2,1\r\n", encoder.encodeCommand(command));

    }finally{__CLR4_5_2l20l20lwydwgwh.R.flushNeeded();}}
    
    @Test
    public void testEncodeTimezone() throws Exception {__CLR4_5_2l20l20lwydwgwh.R.globalSliceStart(getClass().getName(),27296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eh3s7cl28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l20l20lwydwgwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l20l20lwydwgwh.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Pt502ProtocolEncoderTest.testEncodeTimezone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eh3s7cl28() throws Exception{try{__CLR4_5_2l20l20lwydwgwh.R.inc(27296);

        __CLR4_5_2l20l20lwydwgwh.R.inc(27297);Pt502ProtocolEncoder encoder = new Pt502ProtocolEncoder();

        __CLR4_5_2l20l20lwydwgwh.R.inc(27298);Command command = new Command();
        __CLR4_5_2l20l20lwydwgwh.R.inc(27299);command.setDeviceId(1);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27300);command.setType(Command.TYPE_SET_TIMEZONE);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27301);command.set(Command.KEY_TIMEZONE, 8);

        __CLR4_5_2l20l20lwydwgwh.R.inc(27302);Assert.assertEquals("#TMZ8\r\n", encoder.encodeCommand(command));

    }finally{__CLR4_5_2l20l20lwydwgwh.R.flushNeeded();}}


    @Test
    public void testEncodeAlarmSpeed() throws Exception {__CLR4_5_2l20l20lwydwgwh.R.globalSliceStart(getClass().getName(),27303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2upxf8ll2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l20l20lwydwgwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l20l20lwydwgwh.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Pt502ProtocolEncoderTest.testEncodeAlarmSpeed",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2upxf8ll2f() throws Exception{try{__CLR4_5_2l20l20lwydwgwh.R.inc(27303);

        __CLR4_5_2l20l20lwydwgwh.R.inc(27304);Pt502ProtocolEncoder encoder = new Pt502ProtocolEncoder();

        __CLR4_5_2l20l20lwydwgwh.R.inc(27305);Command command = new Command();
        __CLR4_5_2l20l20lwydwgwh.R.inc(27306);command.setDeviceId(1);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27307);command.setType(Command.TYPE_ALARM_SPEED);
        __CLR4_5_2l20l20lwydwgwh.R.inc(27308);command.set(Command.KEY_DATA, 120);

        __CLR4_5_2l20l20lwydwgwh.R.inc(27309);Assert.assertEquals("#SPD120\r\n", encoder.encodeCommand(command));

    }finally{__CLR4_5_2l20l20lwydwgwh.R.flushNeeded();}}

}
