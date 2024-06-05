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

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@java.lang.SuppressWarnings({"fallthrough"}) public class WatchProtocolEncoder extends StringProtocolEncoder implements StringProtocolEncoder.ValueFormatter {public static class __CLR4_5_2fffffflx1e0iwg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,20071,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public String formatValue(String key, Object value) {try{__CLR4_5_2fffffflx1e0iwg.R.inc(19995);
        __CLR4_5_2fffffflx1e0iwg.R.inc(19996);if ((((key.equals(Command.KEY_TIMEZONE))&&(__CLR4_5_2fffffflx1e0iwg.R.iget(19997)!=0|true))||(__CLR4_5_2fffffflx1e0iwg.R.iget(19998)==0&false))) {{
            __CLR4_5_2fffffflx1e0iwg.R.inc(19999);double offset = ((Number) value).longValue() / 3600.0;
            __CLR4_5_2fffffflx1e0iwg.R.inc(20000);DecimalFormat fmt = new DecimalFormat("+#.##;-#.##", DecimalFormatSymbols.getInstance(Locale.US));
            __CLR4_5_2fffffflx1e0iwg.R.inc(20001);return fmt.format(offset);
        }

        }__CLR4_5_2fffffflx1e0iwg.R.inc(20002);return null;
    }finally{__CLR4_5_2fffffflx1e0iwg.R.flushNeeded();}}


    protected String formatCommand(Command command, String format, String... keys) {try{__CLR4_5_2fffffflx1e0iwg.R.inc(20003);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20004);String content = super.formatCommand(command, format, this, keys);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20005);return String.format("[CS*%s*%04x*%s]",
                getUniqueId(command.getDeviceId()), content.length(), content);
    }finally{__CLR4_5_2fffffflx1e0iwg.R.flushNeeded();}}

    private int getEnableFlag(Command command) {try{__CLR4_5_2fffffflx1e0iwg.R.inc(20006);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20007);if ((((command.getBoolean(Command.KEY_ENABLE))&&(__CLR4_5_2fffffflx1e0iwg.R.iget(20008)!=0|true))||(__CLR4_5_2fffffflx1e0iwg.R.iget(20009)==0&false))) {{
            __CLR4_5_2fffffflx1e0iwg.R.inc(20010);return 1;
        } }else {{
            __CLR4_5_2fffffflx1e0iwg.R.inc(20011);return 0;
        }
    }}finally{__CLR4_5_2fffffflx1e0iwg.R.flushNeeded();}}

    private static Map<Byte, Byte> mapping = new HashMap<>();

    static {try{__CLR4_5_2fffffflx1e0iwg.R.inc(20012);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20013);mapping.put((byte) 0x7d, (byte) 0x01);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20014);mapping.put((byte) 0x5B, (byte) 0x02);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20015);mapping.put((byte) 0x5D, (byte) 0x03);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20016);mapping.put((byte) 0x2C, (byte) 0x04);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20017);mapping.put((byte) 0x2A, (byte) 0x05);
    }finally{__CLR4_5_2fffffflx1e0iwg.R.flushNeeded();}}

    private String getBinaryData(Command command) {try{__CLR4_5_2fffffflx1e0iwg.R.inc(20018);
        __CLR4_5_2fffffflx1e0iwg.R.inc(20019);byte[] data = DatatypeConverter.parseHexBinary(command.getString(Command.KEY_DATA));

        __CLR4_5_2fffffflx1e0iwg.R.inc(20020);int encodedLength = data.length;
        __CLR4_5_2fffffflx1e0iwg.R.inc(20021);for (byte b : data) {{
            __CLR4_5_2fffffflx1e0iwg.R.inc(20022);if ((((mapping.containsKey(b))&&(__CLR4_5_2fffffflx1e0iwg.R.iget(20023)!=0|true))||(__CLR4_5_2fffffflx1e0iwg.R.iget(20024)==0&false))) {{
                __CLR4_5_2fffffflx1e0iwg.R.inc(20025);encodedLength += 1;
            }
        }}

        }__CLR4_5_2fffffflx1e0iwg.R.inc(20026);int index = 0;
        __CLR4_5_2fffffflx1e0iwg.R.inc(20027);byte[] encodedData = new byte[encodedLength];

        __CLR4_5_2fffffflx1e0iwg.R.inc(20028);for (byte b : data) {{
            __CLR4_5_2fffffflx1e0iwg.R.inc(20029);Byte replacement = mapping.get(b);
            __CLR4_5_2fffffflx1e0iwg.R.inc(20030);if ((((replacement != null)&&(__CLR4_5_2fffffflx1e0iwg.R.iget(20031)!=0|true))||(__CLR4_5_2fffffflx1e0iwg.R.iget(20032)==0&false))) {{
                __CLR4_5_2fffffflx1e0iwg.R.inc(20033);encodedData[index] = 0x7D;
                __CLR4_5_2fffffflx1e0iwg.R.inc(20034);index += 1;
                __CLR4_5_2fffffflx1e0iwg.R.inc(20035);encodedData[index] = replacement;
            } }else {{
                __CLR4_5_2fffffflx1e0iwg.R.inc(20036);encodedData[index] = b;
            }
            }__CLR4_5_2fffffflx1e0iwg.R.inc(20037);index += 1;
        }

        }__CLR4_5_2fffffflx1e0iwg.R.inc(20038);return new String(encodedData, StandardCharsets.US_ASCII);
    }finally{__CLR4_5_2fffffflx1e0iwg.R.flushNeeded();}}

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2fffffflx1e0iwg.R.inc(20039);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2fffffflx1e0iwg.R.inc(20040);switch (command.getType()) {
            case Command.TYPE_POSITION_SINGLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20041);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20042);return formatCommand(command, "RG");
            case Command.TYPE_SOS_NUMBER:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20043);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20044);return formatCommand(command, "SOS{%s},{%s}", Command.KEY_INDEX, Command.KEY_PHONE);
            case Command.TYPE_ALARM_SOS:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20045);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20046);return formatCommand(command, "SOSSMS," + getEnableFlag(command));
            case Command.TYPE_ALARM_BATTERY:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20047);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20048);return formatCommand(command, "LOWBAT," + getEnableFlag(command));
            case Command.TYPE_REBOOT_DEVICE:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20049);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20050);return formatCommand(command, "RESET");
            case Command.TYPE_ALARM_REMOVE:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20051);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20052);return formatCommand(command, "REMOVE," + getEnableFlag(command));
            case Command.TYPE_SILENCE_TIME:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20053);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20054);return formatCommand(command, "SILENCETIME,{%s}", Command.KEY_DATA);
            case Command.TYPE_ALARM_CLOCK:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20055);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20056);return formatCommand(command, "REMIND,{%s}", Command.KEY_DATA);
            case Command.TYPE_SET_PHONEBOOK:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20057);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20058);return formatCommand(command, "PHB,{%s}", Command.KEY_DATA);
            case Command.TYPE_VOICE_MESSAGE:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20059);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20060);return formatCommand(command, "TK," + getBinaryData(command));
            case Command.TYPE_POSITION_PERIODIC:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20061);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20062);return formatCommand(command, "UPLOAD,{%s}", Command.KEY_FREQUENCY);
            case Command.TYPE_SET_TIMEZONE:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20063);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20064);return formatCommand(command, "LZ,,{%s}", Command.KEY_TIMEZONE);
            case Command.TYPE_SET_INDICATOR:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20065);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20066);return formatCommand(command, "FLOWER,{%s}", Command.KEY_DATA);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fffffflx1e0iwg.R.inc(20067);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fffffflx1e0iwg.R.inc(20068);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2fffffflx1e0iwg.R.inc(20069);break;
        }

        __CLR4_5_2fffffflx1e0iwg.R.inc(20070);return null;
    }finally{__CLR4_5_2fffffflx1e0iwg.R.flushNeeded();}}

}
