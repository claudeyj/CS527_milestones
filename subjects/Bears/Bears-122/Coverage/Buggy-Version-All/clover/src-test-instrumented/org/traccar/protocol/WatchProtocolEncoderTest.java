/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Command;

public class WatchProtocolEncoderTest extends ProtocolTest {static class __CLR4_5_2lkelkelwydzt6u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,27979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEncode() throws Exception {__CLR4_5_2lkelkelwydzt6u.R.globalSliceStart(getClass().getName(),27950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rhti0hlke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lkelkelwydzt6u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lkelkelwydzt6u.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.WatchProtocolEncoderTest.testEncode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rhti0hlke() throws Exception{try{__CLR4_5_2lkelkelwydzt6u.R.inc(27950);

        __CLR4_5_2lkelkelwydzt6u.R.inc(27951);WatchProtocolEncoder encoder = new WatchProtocolEncoder();
        
        __CLR4_5_2lkelkelwydzt6u.R.inc(27952);Command command;

        __CLR4_5_2lkelkelwydzt6u.R.inc(27953);command = new Command();
        __CLR4_5_2lkelkelwydzt6u.R.inc(27954);command.setDeviceId(1);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27955);command.setType(Command.TYPE_REBOOT_DEVICE);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27956);Assert.assertEquals("[CS*123456789012345*0005*RESET]", encoder.encodeCommand(command));

        __CLR4_5_2lkelkelwydzt6u.R.inc(27957);command = new Command();
        __CLR4_5_2lkelkelwydzt6u.R.inc(27958);command.setDeviceId(1);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27959);command.setType(Command.TYPE_SOS_NUMBER);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27960);command.set(Command.KEY_INDEX, 1);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27961);command.set(Command.KEY_PHONE, "123456789");
        __CLR4_5_2lkelkelwydzt6u.R.inc(27962);Assert.assertEquals("[CS*123456789012345*000e*SOS1,123456789]", encoder.encodeCommand(command));

        __CLR4_5_2lkelkelwydzt6u.R.inc(27963);command = new Command();
        __CLR4_5_2lkelkelwydzt6u.R.inc(27964);command.setDeviceId(1);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27965);command.setType(Command.TYPE_VOICE_MESSAGE);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27966);command.set(Command.KEY_DATA, "3333");
        __CLR4_5_2lkelkelwydzt6u.R.inc(27967);Assert.assertEquals("[CS*123456789012345*0005*TK,33]", encoder.encodeCommand(command));

        __CLR4_5_2lkelkelwydzt6u.R.inc(27968);command = new Command();
        __CLR4_5_2lkelkelwydzt6u.R.inc(27969);command.setDeviceId(1);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27970);command.setType(Command.TYPE_SET_TIMEZONE);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27971);command.set(Command.KEY_TIMEZONE, 60 * 60);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27972);Assert.assertEquals("[CS*123456789012345*0006*LZ,,+1]", encoder.encodeCommand(command));

        __CLR4_5_2lkelkelwydzt6u.R.inc(27973);command.set(Command.KEY_TIMEZONE, 90 * 60);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27974);Assert.assertEquals("[CS*123456789012345*0008*LZ,,+1.5]", encoder.encodeCommand(command));

        __CLR4_5_2lkelkelwydzt6u.R.inc(27975);command.set(Command.KEY_TIMEZONE, -60 * 60);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27976);Assert.assertEquals("[CS*123456789012345*0006*LZ,,-1]", encoder.encodeCommand(command));

        __CLR4_5_2lkelkelwydzt6u.R.inc(27977);command.set(Command.KEY_TIMEZONE, -11 * 60 * 60 - 30 * 60);
        __CLR4_5_2lkelkelwydzt6u.R.inc(27978);Assert.assertEquals("[CS*123456789012345*0009*LZ,,-11.5]", encoder.encodeCommand(command));
    }finally{__CLR4_5_2lkelkelwydzt6u.R.flushNeeded();}}

}
