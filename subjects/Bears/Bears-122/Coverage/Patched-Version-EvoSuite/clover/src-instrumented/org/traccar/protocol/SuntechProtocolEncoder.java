/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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

@java.lang.SuppressWarnings({"fallthrough"}) public class SuntechProtocolEncoder extends StringProtocolEncoder {public static class __CLR4_5_2f8qf8qlwye41fe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,19781,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2f8qf8qlwye41fe.R.inc(19754);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2f8qf8qlwye41fe.R.inc(19755);switch (command.getType()) {
            case Command.TYPE_REBOOT_DEVICE:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19756);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19757);return formatCommand(command, "SA200CMD;{%s};02;Reboot\r", Command.KEY_UNIQUE_ID);
            case Command.TYPE_POSITION_SINGLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19758);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19759);return formatCommand(command, "SA200GTR;{%s};02;\r", Command.KEY_UNIQUE_ID);
            case Command.TYPE_OUTPUT_CONTROL:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19760);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19761);if ((((command.getAttributes().containsKey(Command.KEY_DATA))&&(__CLR4_5_2f8qf8qlwye41fe.R.iget(19762)!=0|true))||(__CLR4_5_2f8qf8qlwye41fe.R.iget(19763)==0&false))) {{
                    __CLR4_5_2f8qf8qlwye41fe.R.inc(19764);if ((((command.getAttributes().get(Command.KEY_DATA).equals("1"))&&(__CLR4_5_2f8qf8qlwye41fe.R.iget(19765)!=0|true))||(__CLR4_5_2f8qf8qlwye41fe.R.iget(19766)==0&false))) {{
                        __CLR4_5_2f8qf8qlwye41fe.R.inc(19767);return formatCommand(command, "SA200CMD;{%s};02;Enable{%s}\r",
                                Command.KEY_UNIQUE_ID, Command.KEY_INDEX);
                    } }else {{
                        __CLR4_5_2f8qf8qlwye41fe.R.inc(19768);return formatCommand(command, "SA200CMD;{%s};02;Disable{%s}\r",
                                Command.KEY_UNIQUE_ID, Command.KEY_INDEX);
                    }
                }}
            }case Command.TYPE_ENGINE_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19769);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19770);return formatCommand(command, "SA200CMD;{%s};02;Enable1\r", Command.KEY_UNIQUE_ID);
            case Command.TYPE_ENGINE_RESUME:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19771);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19772);return formatCommand(command, "SA200CMD;{%s};02;Disable1\r", Command.KEY_UNIQUE_ID);
            case Command.TYPE_ALARM_ARM:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19773);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19774);return formatCommand(command, "SA200CMD;{%s};02;Enable2\r", Command.KEY_UNIQUE_ID);
            case Command.TYPE_ALARM_DISARM:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19775);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19776);return formatCommand(command, "SA200CMD;{%s};02;Disable2\r", Command.KEY_UNIQUE_ID);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2f8qf8qlwye41fe.R.inc(19777);__CLB4_5_2_bool0=true;}
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19778);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2f8qf8qlwye41fe.R.inc(19779);break;
        }

        __CLR4_5_2f8qf8qlwye41fe.R.inc(19780);return null;
    }finally{__CLR4_5_2f8qf8qlwye41fe.R.flushNeeded();}}

}