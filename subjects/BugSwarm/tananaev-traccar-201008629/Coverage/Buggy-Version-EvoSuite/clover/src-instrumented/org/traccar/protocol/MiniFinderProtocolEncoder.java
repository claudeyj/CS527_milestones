/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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

@java.lang.SuppressWarnings({"fallthrough"}) public class MiniFinderProtocolEncoder extends StringProtocolEncoder implements StringProtocolEncoder.ValueFormatter {public static class __CLR4_5_2b3gb3glx1dved2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,14432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public String formatValue(String key, Object value) {try{__CLR4_5_2b3gb3glx1dved2.R.inc(14380);

        __CLR4_5_2b3gb3glx1dved2.R.inc(14381);if ((((key.equals(Command.KEY_ENABLE))&&(__CLR4_5_2b3gb3glx1dved2.R.iget(14382)!=0|true))||(__CLR4_5_2b3gb3glx1dved2.R.iget(14383)==0&false))) {{
            __CLR4_5_2b3gb3glx1dved2.R.inc(14384);return ((((Boolean) value )&&(__CLR4_5_2b3gb3glx1dved2.R.iget(14385)!=0|true))||(__CLR4_5_2b3gb3glx1dved2.R.iget(14386)==0&false))? "1" : "0";
        } }else {__CLR4_5_2b3gb3glx1dved2.R.inc(14387);if ((((key.equals(Command.KEY_TIMEZONE))&&(__CLR4_5_2b3gb3glx1dved2.R.iget(14388)!=0|true))||(__CLR4_5_2b3gb3glx1dved2.R.iget(14389)==0&false))) {{
            __CLR4_5_2b3gb3glx1dved2.R.inc(14390);return String.format("%+03d", ((Number) value).longValue() / 3600);
        } }else {__CLR4_5_2b3gb3glx1dved2.R.inc(14391);if ((((key.equals(Command.KEY_INDEX))&&(__CLR4_5_2b3gb3glx1dved2.R.iget(14392)!=0|true))||(__CLR4_5_2b3gb3glx1dved2.R.iget(14393)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2b3gb3glx1dved2.R.inc(14394);switch (((Number) value).intValue()) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2b3gb3glx1dved2.R.inc(14395);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b3gb3glx1dved2.R.inc(14396);return "A";
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2b3gb3glx1dved2.R.inc(14397);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b3gb3glx1dved2.R.inc(14398);return "B";
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2b3gb3glx1dved2.R.inc(14399);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b3gb3glx1dved2.R.inc(14400);return "C";
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2b3gb3glx1dved2.R.inc(14401);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b3gb3glx1dved2.R.inc(14402);return null;
            }
        }

        }}}__CLR4_5_2b3gb3glx1dved2.R.inc(14403);return null;
    }finally{__CLR4_5_2b3gb3glx1dved2.R.flushNeeded();}}

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2b3gb3glx1dved2.R.inc(14404);

        __CLR4_5_2b3gb3glx1dved2.R.inc(14405);initDevicePassword(command, "123456");

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2b3gb3glx1dved2.R.inc(14406);switch (command.getType()) {
            case Command.TYPE_SET_TIMEZONE:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14407);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14408);return formatCommand(command, "{%s}L{%s}", this, Command.KEY_DEVICE_PASSWORD, Command.KEY_TIMEZONE);
            case Command.TYPE_VOICE_MONITORING:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14409);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14410);return formatCommand(command, "{%s}P{%s}", this, Command.KEY_DEVICE_PASSWORD, Command.KEY_ENABLE);
            case Command.TYPE_ALARM_SPEED:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14411);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14412);return formatCommand(command, "{%s}J1{%s}", Command.KEY_DEVICE_PASSWORD, Command.KEY_DATA);
            case Command.TYPE_ALARM_GEOFENCE:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14413);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14414);return formatCommand(command, "{%s}R1{%s}", Command.KEY_DEVICE_PASSWORD, Command.KEY_RADIUS);
            case Command.TYPE_ALARM_VIBRATION:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14415);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14416);return formatCommand(command, "{%s}W1,{%s}", Command.KEY_DEVICE_PASSWORD, Command.KEY_DATA);
            case Command.TYPE_SET_AGPS:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14417);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14418);return formatCommand(command, "{%s}AGPS{%s}", this, Command.KEY_DEVICE_PASSWORD, Command.KEY_ENABLE);
            case Command.TYPE_ALARM_FALL:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14419);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14420);return formatCommand(command, "{%s}F{%s}", this, Command.KEY_DEVICE_PASSWORD, Command.KEY_ENABLE);
            case Command.TYPE_MODE_POWER_SAVING:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14421);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14422);return formatCommand(command, "{%s}SP{%s}", this, Command.KEY_DEVICE_PASSWORD, Command.KEY_ENABLE);
            case Command.TYPE_MODE_DEEP_SLEEP:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14423);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14424);return formatCommand(command, "{%s}DS{%s}", this, Command.KEY_DEVICE_PASSWORD, Command.KEY_ENABLE);
            case Command.TYPE_SOS_NUMBER:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14425);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14426);return formatCommand(command, "{%s}{%s}1,{%s}", this,
                        Command.KEY_DEVICE_PASSWORD, Command.KEY_INDEX, Command.KEY_PHONE);
            case Command.TYPE_SET_INDICATOR:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14427);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14428);return formatCommand(command, "{%s}LED{%s}", Command.KEY_DEVICE_PASSWORD, Command.KEY_DATA);
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2b3gb3glx1dved2.R.inc(14429);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b3gb3glx1dved2.R.inc(14430);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2b3gb3glx1dved2.R.inc(14431);return null;
        }
    }finally{__CLR4_5_2b3gb3glx1dved2.R.flushNeeded();}}

}
