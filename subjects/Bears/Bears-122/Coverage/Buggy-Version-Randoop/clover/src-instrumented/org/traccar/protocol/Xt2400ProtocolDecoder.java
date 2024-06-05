/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import javax.xml.bind.DatatypeConverter;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Xt2400ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ie7ie7lwydyky1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,23958,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Xt2400ProtocolDecoder(Xt2400Protocol protocol) {
        super(protocol);__CLR4_5_2ie7ie7lwydyky1.R.inc(23840);try{__CLR4_5_2ie7ie7lwydyky1.R.inc(23839);

        __CLR4_5_2ie7ie7lwydyky1.R.inc(23841);String config = Context.getConfig().getString(getProtocolName() + ".config");
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23842);if ((((config != null)&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23843)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23844)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23845);setConfig(config);
        }
    }}finally{__CLR4_5_2ie7ie7lwydyky1.R.flushNeeded();}}

    private static final Map<Integer, Integer> TAG_LENGTH_MAP = new HashMap<>();

    static {try{__CLR4_5_2ie7ie7lwydyky1.R.inc(23846);
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23847);int[] l1 = {
                0x01, 0x02, 0x04, 0x0b, 0x0c, 0x0d, 0x12, 0x13,
                0x16, 0x17, 0x1c, 0x1f, 0x23, 0x2c, 0x2d, 0x30,
                0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38,
                0x39, 0x3a, 0x3b, 0x3c, 0x3d, 0x3e, 0x40, 0x41,
                0x53, 0x66, 0x69, 0x6a, 0x93, 0x94, 0x96
        };
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23848);int[] l2 = {
                0x05, 0x09, 0x0a, 0x14, 0x15, 0x1d, 0x1e, 0x24,
                0x26, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48,
                0x49, 0x57, 0x58, 0x59, 0x5a, 0x6b, 0x6f, 0x7A,
                0x7B, 0x7C, 0x7d, 0x7E, 0x7F, 0x80, 0x81, 0x82,
                0x83, 0x84, 0x85, 0x86
        };
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23849);int[] l4 = {
                0x03, 0x06, 0x07, 0x08, 0x0e, 0x0f, 0x10, 0x11,
                0x18, 0x19, 0x1a, 0x1b, 0x20, 0x21, 0x22, 0x2e,
                0x2f, 0x4a, 0x4b, 0x4c, 0x4d, 0x4e, 0x4f, 0x50,
                0x51, 0x52, 0x54, 0x55, 0x56, 0x5b, 0x5c, 0x5d,
                0x5e, 0x5f, 0x60, 0x61, 0x62, 0x68, 0x6e, 0x71,
                0x72, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x87,
                0x88, 0x89, 0x8a, 0x8b, 0x8c, 0x8d
        };
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23850);for (int i : l1) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23851);TAG_LENGTH_MAP.put(i, 1);
        }
        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23852);for (int i : l2) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23853);TAG_LENGTH_MAP.put(i, 2);
        }
        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23854);for (int i : l4) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23855);TAG_LENGTH_MAP.put(i, 4);
        }
        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23856);TAG_LENGTH_MAP.put(0x95, 24);
    }finally{__CLR4_5_2ie7ie7lwydyky1.R.flushNeeded();}}

    private static int getTagLength(int tag) {try{__CLR4_5_2ie7ie7lwydyky1.R.inc(23857);
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23858);Integer length = TAG_LENGTH_MAP.get(tag);
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23859);if ((((length == null)&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23860)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23861)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23862);throw new IllegalArgumentException("Unknown tag: " + tag);
        }
        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23863);return length;
    }finally{__CLR4_5_2ie7ie7lwydyky1.R.flushNeeded();}}

    private Map<Short, byte[]> formats = new HashMap<>();

    public void setConfig(String configString) {try{__CLR4_5_2ie7ie7lwydyky1.R.inc(23864);
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23865);Pattern pattern = Pattern.compile(":wycfg pcr\\[\\d+\\] ([0-9a-fA-F]{2})[0-9a-fA-F]{2}([0-9a-fA-F]+)");
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23866);Matcher matcher = pattern.matcher(configString);
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23867);while ((((matcher.find())&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23868)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23869)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23870);formats.put(Short.parseShort(matcher.group(1), 16), DatatypeConverter.parseHexBinary(matcher.group(2)));
        }
    }}finally{__CLR4_5_2ie7ie7lwydyky1.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ie7ie7lwydyky1.R.inc(23871);

        __CLR4_5_2ie7ie7lwydyky1.R.inc(23872);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2ie7ie7lwydyky1.R.inc(23873);byte[] format = null;
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23874);if ((((formats.size() > 1)&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23875)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23876)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23877);format = formats.get(buf.getUnsignedByte(buf.readerIndex()));
        } }else {__CLR4_5_2ie7ie7lwydyky1.R.inc(23878);if ((((!formats.isEmpty())&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23879)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23880)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23881);format = formats.values().iterator().next();
        }

        }}__CLR4_5_2ie7ie7lwydyky1.R.inc(23882);if ((((format == null)&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23883)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23884)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23885);return null;
        }

        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23886);Position position = new Position();
        __CLR4_5_2ie7ie7lwydyky1.R.inc(23887);position.setProtocol(getProtocolName());

        __CLR4_5_2ie7ie7lwydyky1.R.inc(23888);for (byte tag : format) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2ie7ie7lwydyky1.R.inc(23889);switch ((int) tag) {
                case 0x03:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23890);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23891);DeviceSession deviceSession = getDeviceSession(
                            channel, remoteAddress, String.valueOf(buf.readUnsignedInt()));
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23892);if ((((deviceSession == null)&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23893)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23894)==0&false))) {{
                        __CLR4_5_2ie7ie7lwydyky1.R.inc(23895);return null;
                    }
                    }__CLR4_5_2ie7ie7lwydyky1.R.inc(23896);position.setDeviceId(deviceSession.getDeviceId());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23897);break;
                case 0x04:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23898);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23899);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23900);break;
                case 0x05:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23901);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23902);position.set(Position.KEY_INDEX, buf.readUnsignedShort());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23903);break;
                case 0x06:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23904);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23905);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23906);break;
                case 0x07:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23907);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23908);position.setLatitude(buf.readInt() * 0.000001);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23909);break;
                case 0x08:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23910);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23911);position.setLongitude(buf.readInt() * 0.000001);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23912);break;
                case 0x09:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23913);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23914);position.setAltitude(buf.readShort() * 0.1);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23915);break;
                case 0x0a:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23916);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23917);position.setCourse(buf.readShort() * 0.1);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23918);break;
                case 0x0b:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23919);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23920);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23921);break;
                case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23922);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23923);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedInt());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23924);break;
                case 0x12:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23925);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23926);position.set(Position.KEY_HDOP, buf.readUnsignedByte() * 0.1);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23927);break;
                case 0x13:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23928);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23929);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23930);break;
                case 0x14:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23931);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23932);position.set(Position.KEY_RSSI, buf.readShort());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23933);break;
                case 0x16:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23934);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23935);position.set(Position.KEY_BATTERY, buf.readUnsignedByte() * 0.1);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23936);break;
                case 0x17:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23937);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23938);position.set(Position.KEY_POWER, buf.readUnsignedByte() * 0.1);
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23939);break;
                case 0x57:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23940);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23941);position.set(Position.KEY_OBD_SPEED, UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23942);break;
                case 0x65:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23943);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23944);position.set(Position.KEY_VIN, buf.readBytes(17).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23945);break;
                case 0x73:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23946);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23947);position.set(Position.KEY_VERSION_FW, buf.readBytes(16).toString(StandardCharsets.US_ASCII).trim());
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23948);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ie7ie7lwydyky1.R.inc(23949);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23950);buf.skipBytes(getTagLength(tag));
                    __CLR4_5_2ie7ie7lwydyky1.R.inc(23951);break;
            }
        }

        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23952);if ((((position.getLatitude() != 0 && position.getLongitude() != 0)&&(__CLR4_5_2ie7ie7lwydyky1.R.iget(23953)!=0|true))||(__CLR4_5_2ie7ie7lwydyky1.R.iget(23954)==0&false))) {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23955);position.setValid(true);
        } }else {{
            __CLR4_5_2ie7ie7lwydyky1.R.inc(23956);getLastLocation(position, position.getDeviceTime());
        }

        }__CLR4_5_2ie7ie7lwydyky1.R.inc(23957);return position;
    }finally{__CLR4_5_2ie7ie7lwydyky1.R.flushNeeded();}}

}
