/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class HuabaoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bfibfilwye7fy6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,14922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public HuabaoProtocolDecoder(HuabaoProtocol protocol) {
        super(protocol);__CLR4_5_2bfibfilwye7fy6.R.inc(14815);try{__CLR4_5_2bfibfilwye7fy6.R.inc(14814);
    }finally{__CLR4_5_2bfibfilwye7fy6.R.flushNeeded();}}

    public static final int MSG_GENERAL_RESPONSE = 0x8001;
    public static final int MSG_TERMINAL_REGISTER = 0x0100;
    public static final int MSG_TERMINAL_REGISTER_RESPONSE = 0x8100;
    public static final int MSG_TERMINAL_AUTH = 0x0102;
    public static final int MSG_LOCATION_REPORT = 0x0200;
    public static final int MSG_OIL_CONTROL = 0XA006;

    public static final int RESULT_SUCCESS = 0;

    public static ChannelBuffer formatMessage(int type, ChannelBuffer id, ChannelBuffer data) {try{__CLR4_5_2bfibfilwye7fy6.R.inc(14816);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14817);ChannelBuffer buf = ChannelBuffers.dynamicBuffer();
        __CLR4_5_2bfibfilwye7fy6.R.inc(14818);buf.writeByte(0x7e);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14819);buf.writeShort(type);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14820);buf.writeShort(data.readableBytes());
        __CLR4_5_2bfibfilwye7fy6.R.inc(14821);buf.writeBytes(id);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14822);buf.writeShort(1); // index
        __CLR4_5_2bfibfilwye7fy6.R.inc(14823);buf.writeBytes(data);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14824);buf.writeByte(Checksum.xor(buf.toByteBuffer(1, buf.readableBytes() - 1)));
        __CLR4_5_2bfibfilwye7fy6.R.inc(14825);buf.writeByte(0x7e);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14826);return buf;
    }finally{__CLR4_5_2bfibfilwye7fy6.R.flushNeeded();}}

    private void sendGeneralResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int type, int index) {try{__CLR4_5_2bfibfilwye7fy6.R.inc(14827);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14828);if ((((channel != null)&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14829)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14830)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14831);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2bfibfilwye7fy6.R.inc(14832);response.writeShort(index);
            __CLR4_5_2bfibfilwye7fy6.R.inc(14833);response.writeShort(type);
            __CLR4_5_2bfibfilwye7fy6.R.inc(14834);response.writeByte(RESULT_SUCCESS);
            __CLR4_5_2bfibfilwye7fy6.R.inc(14835);channel.write(formatMessage(MSG_GENERAL_RESPONSE, id, response), remoteAddress);
        }
    }}finally{__CLR4_5_2bfibfilwye7fy6.R.flushNeeded();}}

    private String decodeAlarm(long value) {try{__CLR4_5_2bfibfilwye7fy6.R.inc(14836);
        __CLR4_5_2bfibfilwye7fy6.R.inc(14837);if ((((BitUtil.check(value, 0))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14838)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14839)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14840);return Position.ALARM_SOS;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14841);if ((((BitUtil.check(value, 1))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14842)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14843)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14844);return Position.ALARM_OVERSPEED;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14845);if ((((BitUtil.check(value, 5))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14846)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14847)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14848);return Position.ALARM_GPS_ANTENNA_CUT;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14849);if ((((BitUtil.check(value, 4) || BitUtil.check(value, 9)
                || BitUtil.check(value, 10) || BitUtil.check(value, 11))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14850)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14851)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14852);return Position.ALARM_FAULT;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14853);if ((((BitUtil.check(value, 8))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14854)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14855)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14856);return Position.ALARM_POWER_OFF;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14857);if ((((BitUtil.check(value, 20))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14858)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14859)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14860);return Position.ALARM_GEOFENCE;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14861);if ((((BitUtil.check(value, 29))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14862)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14863)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14864);return Position.ALARM_ACCIDENT;
        }
        }__CLR4_5_2bfibfilwye7fy6.R.inc(14865);return null;
    }finally{__CLR4_5_2bfibfilwye7fy6.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bfibfilwye7fy6.R.inc(14866);

        __CLR4_5_2bfibfilwye7fy6.R.inc(14867);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2bfibfilwye7fy6.R.inc(14868);buf.readUnsignedByte(); // start marker
        __CLR4_5_2bfibfilwye7fy6.R.inc(14869);int type = buf.readUnsignedShort();
        __CLR4_5_2bfibfilwye7fy6.R.inc(14870);buf.readUnsignedShort(); // body length
        __CLR4_5_2bfibfilwye7fy6.R.inc(14871);ChannelBuffer id = buf.readBytes(6); // phone number
        __CLR4_5_2bfibfilwye7fy6.R.inc(14872);int index = buf.readUnsignedShort();

        __CLR4_5_2bfibfilwye7fy6.R.inc(14873);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, ChannelBuffers.hexDump(id));
        __CLR4_5_2bfibfilwye7fy6.R.inc(14874);if ((((deviceSession == null)&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14875)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14876)==0&false))) {{
            __CLR4_5_2bfibfilwye7fy6.R.inc(14877);return null;
        }

        }__CLR4_5_2bfibfilwye7fy6.R.inc(14878);if ((((type == MSG_TERMINAL_REGISTER)&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14879)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14880)==0&false))) {{

            __CLR4_5_2bfibfilwye7fy6.R.inc(14881);if ((((channel != null)&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14882)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14883)==0&false))) {{
                __CLR4_5_2bfibfilwye7fy6.R.inc(14884);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2bfibfilwye7fy6.R.inc(14885);response.writeShort(index);
                __CLR4_5_2bfibfilwye7fy6.R.inc(14886);response.writeByte(RESULT_SUCCESS);
                __CLR4_5_2bfibfilwye7fy6.R.inc(14887);response.writeBytes("authentication".getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_2bfibfilwye7fy6.R.inc(14888);channel.write(formatMessage(MSG_TERMINAL_REGISTER_RESPONSE, id, response), remoteAddress);
            }

        }} }else {__CLR4_5_2bfibfilwye7fy6.R.inc(14889);if ((((type == MSG_TERMINAL_AUTH)&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14890)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14891)==0&false))) {{

            __CLR4_5_2bfibfilwye7fy6.R.inc(14892);sendGeneralResponse(channel, remoteAddress, id, type, index);

        } }else {__CLR4_5_2bfibfilwye7fy6.R.inc(14893);if ((((type == MSG_LOCATION_REPORT)&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14894)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14895)==0&false))) {{

            __CLR4_5_2bfibfilwye7fy6.R.inc(14896);Position position = new Position();
            __CLR4_5_2bfibfilwye7fy6.R.inc(14897);position.setProtocol(getProtocolName());
            __CLR4_5_2bfibfilwye7fy6.R.inc(14898);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2bfibfilwye7fy6.R.inc(14899);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedInt()));

            __CLR4_5_2bfibfilwye7fy6.R.inc(14900);int flags = buf.readInt();

            __CLR4_5_2bfibfilwye7fy6.R.inc(14901);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 0));

            __CLR4_5_2bfibfilwye7fy6.R.inc(14902);position.setValid(BitUtil.check(flags, 1));

            __CLR4_5_2bfibfilwye7fy6.R.inc(14903);double lat = buf.readUnsignedInt() * 0.000001;
            __CLR4_5_2bfibfilwye7fy6.R.inc(14904);double lon = buf.readUnsignedInt() * 0.000001;

            __CLR4_5_2bfibfilwye7fy6.R.inc(14905);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14906)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14907)==0&false))) {{
                __CLR4_5_2bfibfilwye7fy6.R.inc(14908);position.setLatitude(-lat);
            } }else {{
                __CLR4_5_2bfibfilwye7fy6.R.inc(14909);position.setLatitude(lat);
            }

            }__CLR4_5_2bfibfilwye7fy6.R.inc(14910);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_2bfibfilwye7fy6.R.iget(14911)!=0|true))||(__CLR4_5_2bfibfilwye7fy6.R.iget(14912)==0&false))) {{
                __CLR4_5_2bfibfilwye7fy6.R.inc(14913);position.setLongitude(-lon);
            } }else {{
                __CLR4_5_2bfibfilwye7fy6.R.inc(14914);position.setLongitude(lon);
            }

            }__CLR4_5_2bfibfilwye7fy6.R.inc(14915);position.setAltitude(buf.readShort());
            __CLR4_5_2bfibfilwye7fy6.R.inc(14916);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort() * 0.1));
            __CLR4_5_2bfibfilwye7fy6.R.inc(14917);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2bfibfilwye7fy6.R.inc(14918);DateBuilder dateBuilder = new DateBuilder(TimeZone.getTimeZone("GMT+8"))
                    .setYear(BcdUtil.readInteger(buf, 2))
                    .setMonth(BcdUtil.readInteger(buf, 2))
                    .setDay(BcdUtil.readInteger(buf, 2))
                    .setHour(BcdUtil.readInteger(buf, 2))
                    .setMinute(BcdUtil.readInteger(buf, 2))
                    .setSecond(BcdUtil.readInteger(buf, 2));
            __CLR4_5_2bfibfilwye7fy6.R.inc(14919);position.setTime(dateBuilder.getDate());

            // additional information

            __CLR4_5_2bfibfilwye7fy6.R.inc(14920);return position;

        }

        }}}__CLR4_5_2bfibfilwye7fy6.R.inc(14921);return null;
    }finally{__CLR4_5_2bfibfilwye7fy6.R.flushNeeded();}}

}
