/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Anton Tananaev (anton@traccar.org)
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
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class AdmProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25gz5gzlwye7d3u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,7155,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AdmProtocolDecoder(AdmProtocol protocol) {
        super(protocol);__CLR4_5_25gz5gzlwye7d3u.R.inc(7092);try{__CLR4_5_25gz5gzlwye7d3u.R.inc(7091);
    }finally{__CLR4_5_25gz5gzlwye7d3u.R.flushNeeded();}}

    public static final int MSG_IMEI = 0x03;
    public static final int MSG_PHOTO = 0x0A;
    public static final int MSG_ADM5 = 0x01;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25gz5gzlwye7d3u.R.inc(7093);

        __CLR4_5_25gz5gzlwye7d3u.R.inc(7094);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25gz5gzlwye7d3u.R.inc(7095);buf.readUnsignedShort(); // device id
        __CLR4_5_25gz5gzlwye7d3u.R.inc(7096);buf.readUnsignedByte(); // length

        __CLR4_5_25gz5gzlwye7d3u.R.inc(7097);int type = buf.readUnsignedByte();

        __CLR4_5_25gz5gzlwye7d3u.R.inc(7098);DeviceSession deviceSession;
        __CLR4_5_25gz5gzlwye7d3u.R.inc(7099);if ((((type == MSG_IMEI)&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7100)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7101)==0&false))) {{
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7102);deviceSession = getDeviceSession(
                    channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));
        } }else {{
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7103);deviceSession = getDeviceSession(channel, remoteAddress);
        }

        }__CLR4_5_25gz5gzlwye7d3u.R.inc(7104);if ((((deviceSession == null)&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7105)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7106)==0&false))) {{
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7107);return null;
        }

        }__CLR4_5_25gz5gzlwye7d3u.R.inc(7108);if ((((BitUtil.to(type, 2) == 0)&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7109)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7110)==0&false))) {{

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7111);Position position = new Position();
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7112);position.setProtocol(getProtocolName());
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7113);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7114);position.set(Position.KEY_VERSION_FW, buf.readUnsignedByte());
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7115);buf.readUnsignedShort(); // index

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7116);position.set(Position.KEY_STATUS, buf.readUnsignedShort());

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7117);position.setValid(true);
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7118);position.setLatitude(buf.readFloat());
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7119);position.setLongitude(buf.readFloat());
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7120);position.setCourse(buf.readUnsignedShort() * 0.1);
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7121);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort() * 0.1));

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7122);position.set(Position.KEY_ACCELERATION, buf.readUnsignedByte());

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7123);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7124);position.set(Position.KEY_HDOP, buf.readUnsignedByte() * 0.1);
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7125);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte() & 0x0f);

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7126);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7127);position.set(Position.KEY_POWER, buf.readUnsignedShort());
            __CLR4_5_25gz5gzlwye7d3u.R.inc(7128);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_25gz5gzlwye7d3u.R.inc(7129);if ((((BitUtil.check(type, 2))&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7130)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7131)==0&false))) {{
                __CLR4_5_25gz5gzlwye7d3u.R.inc(7132);buf.skipBytes(4);
            }

            }__CLR4_5_25gz5gzlwye7d3u.R.inc(7133);if ((((BitUtil.check(type, 3))&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7134)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7135)==0&false))) {{
                __CLR4_5_25gz5gzlwye7d3u.R.inc(7136);buf.skipBytes(12);
            }

            }__CLR4_5_25gz5gzlwye7d3u.R.inc(7137);if ((((BitUtil.check(type, 4))&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7138)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7139)==0&false))) {{
                __CLR4_5_25gz5gzlwye7d3u.R.inc(7140);buf.skipBytes(8);
            }

            }__CLR4_5_25gz5gzlwye7d3u.R.inc(7141);if ((((BitUtil.check(type, 5))&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7142)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7143)==0&false))) {{
                __CLR4_5_25gz5gzlwye7d3u.R.inc(7144);buf.skipBytes(9);
            }

            }__CLR4_5_25gz5gzlwye7d3u.R.inc(7145);if ((((BitUtil.check(type, 6))&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7146)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7147)==0&false))) {{
                __CLR4_5_25gz5gzlwye7d3u.R.inc(7148);buf.skipBytes(buf.getUnsignedByte(buf.readerIndex()));
            }

            }__CLR4_5_25gz5gzlwye7d3u.R.inc(7149);if ((((BitUtil.check(type, 7))&&(__CLR4_5_25gz5gzlwye7d3u.R.iget(7150)!=0|true))||(__CLR4_5_25gz5gzlwye7d3u.R.iget(7151)==0&false))) {{
                __CLR4_5_25gz5gzlwye7d3u.R.inc(7152);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_25gz5gzlwye7d3u.R.inc(7153);return position;
        }

        }__CLR4_5_25gz5gzlwye7d3u.R.inc(7154);return null;
    }finally{__CLR4_5_25gz5gzlwye7d3u.R.flushNeeded();}}

}
