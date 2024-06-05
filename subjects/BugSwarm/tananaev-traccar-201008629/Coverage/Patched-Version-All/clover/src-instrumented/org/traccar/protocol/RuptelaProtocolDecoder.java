/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class RuptelaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cr4cr4lx1e1lrj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,16612,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public RuptelaProtocolDecoder(RuptelaProtocol protocol) {
        super(protocol);__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16529);try{__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16528);
    }finally{__CLR4_5_2cr4cr4lx1e1lrj.R.flushNeeded();}}

    public static final int MSG_RECORDS = 1;
    public static final int MSG_EXTENDED_RECORDS = 68;
    public static final int MSG_SMS_VIA_GPRS = 108;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16530);

        __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16531);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16532);buf.readUnsignedShort(); // data length

        __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16533);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16534);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16535);if ((((deviceSession == null)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16536)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16537)==0&false))) {{
            __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16538);return null;
        }

        }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16539);int type = buf.readUnsignedByte();

        __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16540);if ((((type == MSG_RECORDS || type == MSG_EXTENDED_RECORDS)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16541)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16542)==0&false))) {{
            __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16543);List<Position> positions = new LinkedList<>();

            __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16544);buf.readUnsignedByte(); // records left
            __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16545);int count = buf.readUnsignedByte();

            __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16546);for (int i = 0; (((i < count)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16547)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16548)==0&false)); i++) {{
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16549);Position position = new Position();
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16550);position.setProtocol(getProtocolName());
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16551);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16552);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16553);buf.readUnsignedByte(); // timestamp extension

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16554);if ((((type == MSG_EXTENDED_RECORDS)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16555)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16556)==0&false))) {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16557);buf.readUnsignedByte(); // record extension
                }

                }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16558);buf.readUnsignedByte(); // priority (reserved)

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16559);position.setValid(true);
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16560);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16561);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16562);position.setAltitude(buf.readUnsignedShort() / 10.0);
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16563);position.setCourse(buf.readUnsignedShort() / 100.0);

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16564);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16565);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16566);position.set(Position.KEY_HDOP, buf.readUnsignedByte() / 10.0);

                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16567);if ((((type == MSG_EXTENDED_RECORDS)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16568)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16569)==0&false))) {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16570);buf.readUnsignedShort(); // event
                } }else {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16571);buf.readUnsignedByte(); // event
                }

                // Read 1 byte data
                }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16572);int cnt = buf.readUnsignedByte();
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16573);for (int j = 0; (((j < cnt)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16574)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16575)==0&false)); j++) {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16576);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16577)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16578)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16579);position.set(Position.PREFIX_IO + id, buf.readUnsignedByte());
                }

                // Read 2 byte data
                }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16580);cnt = buf.readUnsignedByte();
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16581);for (int j = 0; (((j < cnt)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16582)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16583)==0&false)); j++) {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16584);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16585)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16586)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16587);position.set(Position.PREFIX_IO + id, buf.readUnsignedShort());
                }

                // Read 4 byte data
                }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16588);cnt = buf.readUnsignedByte();
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16589);for (int j = 0; (((j < cnt)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16590)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16591)==0&false)); j++) {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16592);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16593)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16594)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16595);position.set(Position.PREFIX_IO + id, buf.readUnsignedInt());
                }

                // Read 8 byte data
                }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16596);cnt = buf.readUnsignedByte();
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16597);for (int j = 0; (((j < cnt)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16598)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16599)==0&false)); j++) {{
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16600);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16601)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16602)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16603);position.set(Position.PREFIX_IO + id, buf.readLong());
                }

                }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16604);positions.add(position);
            }

            }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16605);if ((((channel != null)&&(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16606)!=0|true))||(__CLR4_5_2cr4cr4lx1e1lrj.R.iget(16607)==0&false))) {{
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16608);byte[] response = {0x00, 0x02, 0x64, 0x01, 0x13, (byte) 0xbc};
                __CLR4_5_2cr4cr4lx1e1lrj.R.inc(16609);channel.write(ChannelBuffers.wrappedBuffer(response)); // acknowledgement
            }

            }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16610);return positions;
        }

        }__CLR4_5_2cr4cr4lx1e1lrj.R.inc(16611);return null;
    }finally{__CLR4_5_2cr4cr4lx1e1lrj.R.flushNeeded();}}

}
