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

public class AdmProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24vi4vilx1e0fkl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,6382,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AdmProtocolDecoder(AdmProtocol protocol) {
        super(protocol);__CLR4_5_24vi4vilx1e0fkl.R.inc(6319);try{__CLR4_5_24vi4vilx1e0fkl.R.inc(6318);
    }finally{__CLR4_5_24vi4vilx1e0fkl.R.flushNeeded();}}

    public static final int MSG_IMEI = 0x03;
    public static final int MSG_PHOTO = 0x0A;
    public static final int MSG_ADM5 = 0x01;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_24vi4vilx1e0fkl.R.inc(6320);

        __CLR4_5_24vi4vilx1e0fkl.R.inc(6321);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_24vi4vilx1e0fkl.R.inc(6322);buf.readUnsignedShort(); // device id
        __CLR4_5_24vi4vilx1e0fkl.R.inc(6323);buf.readUnsignedByte(); // length

        __CLR4_5_24vi4vilx1e0fkl.R.inc(6324);int type = buf.readUnsignedByte();

        __CLR4_5_24vi4vilx1e0fkl.R.inc(6325);DeviceSession deviceSession;
        __CLR4_5_24vi4vilx1e0fkl.R.inc(6326);if ((((type == MSG_IMEI)&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6327)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6328)==0&false))) {{
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6329);deviceSession = getDeviceSession(
                    channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));
        } }else {{
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6330);deviceSession = getDeviceSession(channel, remoteAddress);
        }

        }__CLR4_5_24vi4vilx1e0fkl.R.inc(6331);if ((((deviceSession == null)&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6332)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6333)==0&false))) {{
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6334);return null;
        }

        }__CLR4_5_24vi4vilx1e0fkl.R.inc(6335);if ((((BitUtil.to(type, 2) == 0)&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6336)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6337)==0&false))) {{

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6338);Position position = new Position();
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6339);position.setProtocol(getProtocolName());
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6340);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6341);buf.readUnsignedByte(); // firmware version
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6342);buf.readUnsignedShort(); // index

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6343);position.set(Position.KEY_STATUS, buf.readUnsignedShort());

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6344);position.setValid(true);
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6345);position.setLatitude(buf.readFloat());
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6346);position.setLongitude(buf.readFloat());
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6347);position.setCourse(buf.readUnsignedShort() * 0.1);
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6348);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort() * 0.1));

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6349);buf.readUnsignedByte(); // acceleration

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6350);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6351);position.set(Position.KEY_HDOP, buf.readUnsignedByte() * 0.1);
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6352);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte() & 0x0f);

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6353);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6354);position.set(Position.KEY_POWER, buf.readUnsignedShort());
            __CLR4_5_24vi4vilx1e0fkl.R.inc(6355);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_24vi4vilx1e0fkl.R.inc(6356);if ((((BitUtil.check(type, 2))&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6357)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6358)==0&false))) {{
                __CLR4_5_24vi4vilx1e0fkl.R.inc(6359);buf.skipBytes(4);
            }

            }__CLR4_5_24vi4vilx1e0fkl.R.inc(6360);if ((((BitUtil.check(type, 3))&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6361)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6362)==0&false))) {{
                __CLR4_5_24vi4vilx1e0fkl.R.inc(6363);buf.skipBytes(12);
            }

            }__CLR4_5_24vi4vilx1e0fkl.R.inc(6364);if ((((BitUtil.check(type, 4))&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6365)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6366)==0&false))) {{
                __CLR4_5_24vi4vilx1e0fkl.R.inc(6367);buf.skipBytes(8);
            }

            }__CLR4_5_24vi4vilx1e0fkl.R.inc(6368);if ((((BitUtil.check(type, 5))&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6369)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6370)==0&false))) {{
                __CLR4_5_24vi4vilx1e0fkl.R.inc(6371);buf.skipBytes(9);
            }

            }__CLR4_5_24vi4vilx1e0fkl.R.inc(6372);if ((((BitUtil.check(type, 6))&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6373)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6374)==0&false))) {{
                __CLR4_5_24vi4vilx1e0fkl.R.inc(6375);buf.skipBytes(buf.getUnsignedByte(buf.readerIndex()));
            }

            }__CLR4_5_24vi4vilx1e0fkl.R.inc(6376);if ((((BitUtil.check(type, 7))&&(__CLR4_5_24vi4vilx1e0fkl.R.iget(6377)!=0|true))||(__CLR4_5_24vi4vilx1e0fkl.R.iget(6378)==0&false))) {{
                __CLR4_5_24vi4vilx1e0fkl.R.inc(6379);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_24vi4vilx1e0fkl.R.inc(6380);return position;
        }

        }__CLR4_5_24vi4vilx1e0fkl.R.inc(6381);return null;
    }finally{__CLR4_5_24vi4vilx1e0fkl.R.flushNeeded();}}

}
