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
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class Vt200ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2hmzhmzlwye7heb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,22908,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Vt200ProtocolDecoder(Vt200Protocol protocol) {
        super(protocol);__CLR4_5_2hmzhmzlwye7heb.R.inc(22860);try{__CLR4_5_2hmzhmzlwye7heb.R.inc(22859);
    }finally{__CLR4_5_2hmzhmzlwye7heb.R.flushNeeded();}}

    private static double decodeCoordinate(int value) {try{__CLR4_5_2hmzhmzlwye7heb.R.inc(22861);
        __CLR4_5_2hmzhmzlwye7heb.R.inc(22862);int degrees = value / 1000000;
        __CLR4_5_2hmzhmzlwye7heb.R.inc(22863);int minutes = value % 1000000;
        __CLR4_5_2hmzhmzlwye7heb.R.inc(22864);return degrees + minutes * 0.0001 / 60;
    }finally{__CLR4_5_2hmzhmzlwye7heb.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2hmzhmzlwye7heb.R.inc(22865);

        __CLR4_5_2hmzhmzlwye7heb.R.inc(22866);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2hmzhmzlwye7heb.R.inc(22867);buf.skipBytes(1); // header

        __CLR4_5_2hmzhmzlwye7heb.R.inc(22868);String id = ChannelBuffers.hexDump(buf.readBytes(6));
        __CLR4_5_2hmzhmzlwye7heb.R.inc(22869);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_2hmzhmzlwye7heb.R.inc(22870);if ((((deviceSession == null)&&(__CLR4_5_2hmzhmzlwye7heb.R.iget(22871)!=0|true))||(__CLR4_5_2hmzhmzlwye7heb.R.iget(22872)==0&false))) {{
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22873);return null;
        }

        }__CLR4_5_2hmzhmzlwye7heb.R.inc(22874);int type = buf.readUnsignedShort();
        __CLR4_5_2hmzhmzlwye7heb.R.inc(22875);buf.readUnsignedShort(); // length

        __CLR4_5_2hmzhmzlwye7heb.R.inc(22876);if ((((type == 0x2086 || type == 0x2084 || type == 0x2082)&&(__CLR4_5_2hmzhmzlwye7heb.R.iget(22877)!=0|true))||(__CLR4_5_2hmzhmzlwye7heb.R.iget(22878)==0&false))) {{

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22879);Position position = new Position();
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22880);position.setProtocol(getProtocolName());
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22881);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22882);buf.readUnsignedByte(); // data type
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22883);buf.readUnsignedShort(); // trip id

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22884);DateBuilder dateBuilder = new DateBuilder();
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22885);dateBuilder.setDateReverse(
                    BcdUtil.readInteger(buf, 2), BcdUtil.readInteger(buf, 2), BcdUtil.readInteger(buf, 2));
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22886);dateBuilder.setTime(
                    BcdUtil.readInteger(buf, 2), BcdUtil.readInteger(buf, 2), BcdUtil.readInteger(buf, 2));
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22887);position.setTime(dateBuilder.getDate());

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22888);position.setLatitude(decodeCoordinate(BcdUtil.readInteger(buf, 8)));
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22889);position.setLongitude(decodeCoordinate(BcdUtil.readInteger(buf, 9)));

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22890);int flags = buf.readUnsignedByte();
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22891);position.setValid(BitUtil.check(flags, 0));
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22892);if ((((!BitUtil.check(flags, 1))&&(__CLR4_5_2hmzhmzlwye7heb.R.iget(22893)!=0|true))||(__CLR4_5_2hmzhmzlwye7heb.R.iget(22894)==0&false))) {{
                __CLR4_5_2hmzhmzlwye7heb.R.inc(22895);position.setLatitude(-position.getLatitude());
            }
            }__CLR4_5_2hmzhmzlwye7heb.R.inc(22896);if ((((!BitUtil.check(flags, 1))&&(__CLR4_5_2hmzhmzlwye7heb.R.iget(22897)!=0|true))||(__CLR4_5_2hmzhmzlwye7heb.R.iget(22898)==0&false))) {{
                __CLR4_5_2hmzhmzlwye7heb.R.inc(22899);position.setLongitude(-position.getLongitude());
            }

            }__CLR4_5_2hmzhmzlwye7heb.R.inc(22900);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22901);position.setCourse(buf.readUnsignedByte() * 2);

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22902);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22903);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22904);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);
            __CLR4_5_2hmzhmzlwye7heb.R.inc(22905);position.set(Position.KEY_STATUS, buf.readUnsignedInt());

            // additional data

            __CLR4_5_2hmzhmzlwye7heb.R.inc(22906);return position;

        }

        }__CLR4_5_2hmzhmzlwye7heb.R.inc(22907);return null;
    }finally{__CLR4_5_2hmzhmzlwye7heb.R.flushNeeded();}}

}
