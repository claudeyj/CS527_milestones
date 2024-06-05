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
package org.traccar.helper;

import org.traccar.model.Position;

import java.util.AbstractMap;
import java.util.Map;

@java.lang.SuppressWarnings({"fallthrough"}) public final class ObdDecoder {public static class __CLR4_5_23z83z8lx1dz8xx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,5224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ObdDecoder() {try{__CLR4_5_23z83z8lx1dz8xx.R.inc(5156);
    }finally{__CLR4_5_23z83z8lx1dz8xx.R.flushNeeded();}}

    private static final int MODE_CURRENT = 0x01;
    private static final int MODE_FREEZE_FRAME = 0x02;
    private static final int MODE_CODES = 0x03;

    private static final int PID_ENGINE_LOAD = 0x04;
    private static final int PID_COOLANT_TEMPERATURE = 0x05;
    private static final int PID_ENGINE_RPM = 0x0C;
    private static final int PID_VEHICLE_SPEED = 0x0D;
    private static final int PID_THROTTLE_POSITION = 0x11;
    private static final int PID_MIL_DISTANCE = 0x21;
    private static final int PID_FUEL_LEVEL = 0x2F;
    private static final int PID_DISTANCE_CLEARED = 0x31;

    public static Map.Entry<String, Object> decode(int mode, String value) {try{__CLR4_5_23z83z8lx1dz8xx.R.inc(5157);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_23z83z8lx1dz8xx.R.inc(5158);switch (mode) {
            case MODE_CURRENT:if (!__CLB4_5_2_bool0) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5159);__CLB4_5_2_bool0=true;}
            case MODE_FREEZE_FRAME:if (!__CLB4_5_2_bool0) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5160);__CLB4_5_2_bool0=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5161);return decodeData(
                        Integer.parseInt(value.substring(0, 2), 16),
                        Integer.parseInt(value.substring(2), 16), true);
            case MODE_CODES:if (!__CLB4_5_2_bool0) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5162);__CLB4_5_2_bool0=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5163);return decodeCodes(value);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5164);__CLB4_5_2_bool0=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5165);return null;
        }
    }finally{__CLR4_5_23z83z8lx1dz8xx.R.flushNeeded();}}

    private static Map.Entry<String, Object> createEntry(String key, Object value) {try{__CLR4_5_23z83z8lx1dz8xx.R.inc(5166);
        __CLR4_5_23z83z8lx1dz8xx.R.inc(5167);return new AbstractMap.SimpleEntry<>(key, value);
    }finally{__CLR4_5_23z83z8lx1dz8xx.R.flushNeeded();}}

    public static Map.Entry<String, Object> decodeCodes(String value) {try{__CLR4_5_23z83z8lx1dz8xx.R.inc(5168);
        __CLR4_5_23z83z8lx1dz8xx.R.inc(5169);StringBuilder codes = new StringBuilder();
        __CLR4_5_23z83z8lx1dz8xx.R.inc(5170);for (int i = 0; (((i < value.length() / 4)&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5171)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5172)==0&false)); i++) {{
            __CLR4_5_23z83z8lx1dz8xx.R.inc(5173);int numValue = Integer.parseInt(value.substring(i * 4, (i + 1) * 4), 16);
            __CLR4_5_23z83z8lx1dz8xx.R.inc(5174);codes.append(' ');
            boolean __CLB4_5_2_bool1=false;__CLR4_5_23z83z8lx1dz8xx.R.inc(5175);switch (numValue >> 14) {
                case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5176);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5177);codes.append('C');
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5178);break;
                case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5179);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5180);codes.append('B');
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5181);break;
                case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5182);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5183);codes.append('U');
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5184);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5185);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5186);codes.append('P');
                    __CLR4_5_23z83z8lx1dz8xx.R.inc(5187);break;
            }
            __CLR4_5_23z83z8lx1dz8xx.R.inc(5188);codes.append(String.format("%04X", numValue & 0x3FFF));
        }
        }__CLR4_5_23z83z8lx1dz8xx.R.inc(5189);if ((((codes.length() > 0)&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5190)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5191)==0&false))) {{
            __CLR4_5_23z83z8lx1dz8xx.R.inc(5192);return createEntry(Position.KEY_DTCS, codes.toString().trim());
        } }else {{
            __CLR4_5_23z83z8lx1dz8xx.R.inc(5193);return null;
        }
    }}finally{__CLR4_5_23z83z8lx1dz8xx.R.flushNeeded();}}

    public static Map.Entry<String, Object> decodeData(int pid, int value, boolean convert) {try{__CLR4_5_23z83z8lx1dz8xx.R.inc(5194);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_23z83z8lx1dz8xx.R.inc(5195);switch (pid) {
            case PID_ENGINE_LOAD:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5196);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5197);return createEntry("engineLoad", (((convert )&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5198)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5199)==0&false))? value * 100 / 255 : value);
            case PID_COOLANT_TEMPERATURE:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5200);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5201);return createEntry("coolantTemperature", (((convert )&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5202)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5203)==0&false))? value - 40 : value);
            case PID_ENGINE_RPM:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5204);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5205);return createEntry(Position.KEY_RPM, (((convert )&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5206)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5207)==0&false))? value / 4 : value);
            case PID_VEHICLE_SPEED:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5208);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5209);return createEntry(Position.KEY_OBD_SPEED, value);
            case PID_THROTTLE_POSITION:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5210);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5211);return createEntry("throttle", (((convert )&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5212)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5213)==0&false))? value * 100 / 255 : value);
            case PID_MIL_DISTANCE:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5214);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5215);return createEntry("milDistance", value);
            case PID_FUEL_LEVEL:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5216);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5217);return createEntry(Position.KEY_FUEL, (((convert )&&(__CLR4_5_23z83z8lx1dz8xx.R.iget(5218)!=0|true))||(__CLR4_5_23z83z8lx1dz8xx.R.iget(5219)==0&false))? value * 100 / 255 : value);
            case PID_DISTANCE_CLEARED:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5220);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5221);return createEntry("clearedDistance", value);
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_23z83z8lx1dz8xx.R.inc(5222);__CLB4_5_2_bool2=true;}
                __CLR4_5_23z83z8lx1dz8xx.R.inc(5223);return null;
        }
    }finally{__CLR4_5_23z83z8lx1dz8xx.R.flushNeeded();}}

}
