/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Christoph Krey (c@ckrey.de)
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.protocol;

import org.traccar.StringProtocolEncoder;
import org.traccar.helper.Log;
import org.traccar.model.Command;

@java.lang.SuppressWarnings({"fallthrough"}) public class Tk103ProtocolEncoder extends StringProtocolEncoder {public static class __CLR4_5_2g8ug8ulwydykmq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,21076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2g8ug8ulwydykmq.R.inc(21054);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2g8ug8ulwydykmq.R.inc(21055);switch (command.getType()) {
            case Command.TYPE_GET_VERSION:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21056);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21057);return formatCommand(command, "({%s}AP07)", Command.KEY_UNIQUE_ID);
            case Command.TYPE_REBOOT_DEVICE:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21058);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21059);return formatCommand(command, "({%s}AT00)", Command.KEY_UNIQUE_ID);
            case Command.TYPE_SET_ODOMETER:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21060);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21061);return formatCommand(command, "({%s}AX01)", Command.KEY_UNIQUE_ID);
            case Command.TYPE_POSITION_SINGLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21062);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21063);return formatCommand(command, "({%s}AP00)", Command.KEY_UNIQUE_ID);
            case Command.TYPE_POSITION_PERIODIC:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21064);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21065);return formatCommand(command, "({%s}AR00%s0000)", Command.KEY_UNIQUE_ID,
                        String.format("%04X", command.getInteger(Command.KEY_FREQUENCY)));
            case Command.TYPE_POSITION_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21066);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21067);return formatCommand(command, "({%s}AR0000000000)", Command.KEY_UNIQUE_ID);
            case Command.TYPE_ENGINE_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21068);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21069);return formatCommand(command, "({%s}AV011)", Command.KEY_UNIQUE_ID);
            case Command.TYPE_ENGINE_RESUME:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21070);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21071);return formatCommand(command, "({%s}AV010)", Command.KEY_UNIQUE_ID);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2g8ug8ulwydykmq.R.inc(21072);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21073);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2g8ug8ulwydykmq.R.inc(21074);break;
        }

        __CLR4_5_2g8ug8ulwydykmq.R.inc(21075);return null;
    }finally{__CLR4_5_2g8ug8ulwydykmq.R.flushNeeded();}}

}
