/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class MxtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25gm5gmlx1dlpfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,7165,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MxtProtocolDecoder(MxtProtocol protocol) {
        super(protocol);__CLR4_5_25gm5gmlx1dlpfi.R.inc(7079);try{__CLR4_5_25gm5gmlx1dlpfi.R.inc(7078);
    }finally{__CLR4_5_25gm5gmlx1dlpfi.R.flushNeeded();}}

    private static final int MSG_ACK = 0x02;
    private static final int MSG_NACK = 0x03;
    private static final int MSG_POSITION = 0x31;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_25gm5gmlx1dlpfi.R.inc(7080);

        __CLR4_5_25gm5gmlx1dlpfi.R.inc(7081);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25gm5gmlx1dlpfi.R.inc(7082);buf.readUnsignedByte(); // start
        __CLR4_5_25gm5gmlx1dlpfi.R.inc(7083);buf.readUnsignedByte(); // device descriptor
        __CLR4_5_25gm5gmlx1dlpfi.R.inc(7084);int type = buf.readUnsignedByte();

        __CLR4_5_25gm5gmlx1dlpfi.R.inc(7085);String id = String.valueOf(buf.readUnsignedInt());
        __CLR4_5_25gm5gmlx1dlpfi.R.inc(7086);if ((((!identify(id, channel))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7087)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7088)==0&false))) {{
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7089);return null;
        }

        }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7090);if ((((type == MSG_POSITION)&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7091)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7092)==0&false))) {{

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7093);Position position = new Position();
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7094);position.setProtocol(getProtocolName());
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7095);position.setDeviceId(getDeviceId());

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7096);buf.readUnsignedByte(); // protocol
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7097);int infoGroups = buf.readUnsignedByte();

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7098);position.set(Event.KEY_INDEX, buf.readUnsignedShort());

            // Date and time
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7099);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7100);time.clear();
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7101);time.set(Calendar.YEAR, 2000);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7102);time.set(Calendar.MONTH, 0);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7103);time.set(Calendar.DAY_OF_MONTH, 1);

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7104);long date = buf.readUnsignedInt();

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7105);long days = BitUtil.range(date, 6 + 6 + 5);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7106);long hours = BitUtil.range(date, 6 + 6, 5);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7107);long minutes = BitUtil.range(date, 6, 6);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7108);long seconds = BitUtil.range(date, 0, 6);

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7109);long millis = time.getTimeInMillis();
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7110);millis += (((days * 24 + hours) * 60 + minutes) * 60 + seconds) * 1000;

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7111);position.setTime(new Date(millis));

            // Location
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7112);position.setValid(true);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7113);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7114);position.setLongitude(buf.readInt() / 1000000.0);

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7115);long flags = buf.readUnsignedInt();
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7116);position.set(Event.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7117);position.set(Event.KEY_ALARM, BitUtil.check(flags, 1));
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7118);position.set(Event.KEY_INPUT, BitUtil.range(flags, 2, 5));
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7119);position.set(Event.KEY_OUTPUT, BitUtil.range(flags, 7, 3));
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7120);position.setCourse(BitUtil.range(flags, 10, 3) * 45);
            //position.setValid(BitUtil.check(flags, 15));
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7121);position.set(Event.KEY_CHARGE, BitUtil.check(flags, 20));

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7122);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7123);int inputMask = buf.readUnsignedByte();
            
            __CLR4_5_25gm5gmlx1dlpfi.R.inc(7124);if ((((BitUtil.check(infoGroups, 0))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7125)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7126)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7127);buf.skipBytes(8); // waypoints
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7128);if ((((BitUtil.check(infoGroups, 1))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7129)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7130)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7131);buf.skipBytes(8); // wireless accessory
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7132);if ((((BitUtil.check(infoGroups, 2))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7133)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7134)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7135);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7136);position.set(Event.KEY_HDOP, buf.readUnsignedByte());
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7137);buf.readUnsignedByte(); // GPS accuracy
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7138);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7139);buf.readUnsignedShort(); // time since boot
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7140);buf.readUnsignedByte(); // input voltage
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7141);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7142);if ((((BitUtil.check(infoGroups, 3))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7143)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7144)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7145);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7146);if ((((BitUtil.check(infoGroups, 4))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7147)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7148)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7149);buf.readUnsignedInt(); // hours
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7150);if ((((BitUtil.check(infoGroups, 5))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7151)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7152)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7153);buf.readUnsignedInt(); // reason
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7154);if ((((BitUtil.check(infoGroups, 6))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7155)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7156)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7157);position.set(Event.KEY_POWER, buf.readUnsignedShort() * 0.001);
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7158);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());
            }
            
            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7159);if ((((BitUtil.check(infoGroups, 7))&&(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7160)!=0|true))||(__CLR4_5_25gm5gmlx1dlpfi.R.iget(7161)==0&false))) {{
                __CLR4_5_25gm5gmlx1dlpfi.R.inc(7162);position.set(Event.KEY_RFID, buf.readUnsignedInt());
            }

            }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7163);return position;
        }

        }__CLR4_5_25gm5gmlx1dlpfi.R.inc(7164);return null;
    }finally{__CLR4_5_25gm5gmlx1dlpfi.R.flushNeeded();}}

}
