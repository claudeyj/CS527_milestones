/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.SocketAddress;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class RuptelaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26wd6wdlx1e453p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,9005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public RuptelaProtocolDecoder(RuptelaProtocol protocol) {
        super(protocol);__CLR4_5_26wd6wdlx1e453p.R.inc(8942);try{__CLR4_5_26wd6wdlx1e453p.R.inc(8941);
    }finally{__CLR4_5_26wd6wdlx1e453p.R.flushNeeded();}}

    private static final int COMMAND_RECORDS = 0x01;
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_26wd6wdlx1e453p.R.inc(8943);

        __CLR4_5_26wd6wdlx1e453p.R.inc(8944);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26wd6wdlx1e453p.R.inc(8945);buf.readUnsignedShort(); // data length

        // Identify device
        __CLR4_5_26wd6wdlx1e453p.R.inc(8946);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_26wd6wdlx1e453p.R.inc(8947);if ((((!identify(imei, channel))&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8948)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8949)==0&false))) {{
            __CLR4_5_26wd6wdlx1e453p.R.inc(8950);return null;
        }

        }__CLR4_5_26wd6wdlx1e453p.R.inc(8951);int type = buf.readUnsignedByte();
        
        __CLR4_5_26wd6wdlx1e453p.R.inc(8952);if ((((type == COMMAND_RECORDS)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8953)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8954)==0&false))) {{
            __CLR4_5_26wd6wdlx1e453p.R.inc(8955);List<Position> positions = new LinkedList<>();

            __CLR4_5_26wd6wdlx1e453p.R.inc(8956);buf.readUnsignedByte(); // records left
            __CLR4_5_26wd6wdlx1e453p.R.inc(8957);int count = buf.readUnsignedByte();

            __CLR4_5_26wd6wdlx1e453p.R.inc(8958);for (int i = 0; (((i < count)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8959)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8960)==0&false)); i++) {{
                __CLR4_5_26wd6wdlx1e453p.R.inc(8961);Position position = new Position();
                __CLR4_5_26wd6wdlx1e453p.R.inc(8962);position.setProtocol(getProtocolName());
                __CLR4_5_26wd6wdlx1e453p.R.inc(8963);position.setDeviceId(getDeviceId());

                // Time
                __CLR4_5_26wd6wdlx1e453p.R.inc(8964);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_26wd6wdlx1e453p.R.inc(8965);buf.readUnsignedByte(); // timestamp extension

                __CLR4_5_26wd6wdlx1e453p.R.inc(8966);buf.readUnsignedByte(); // priority (reserved)
                
                // Location
                __CLR4_5_26wd6wdlx1e453p.R.inc(8967);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_26wd6wdlx1e453p.R.inc(8968);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_26wd6wdlx1e453p.R.inc(8969);position.setAltitude(buf.readUnsignedShort() / 10.0);
                __CLR4_5_26wd6wdlx1e453p.R.inc(8970);position.setCourse(buf.readUnsignedShort() / 100.0);

                // Validity
                __CLR4_5_26wd6wdlx1e453p.R.inc(8971);int satellites = buf.readUnsignedByte();
                __CLR4_5_26wd6wdlx1e453p.R.inc(8972);position.set(Event.KEY_SATELLITES, satellites);
                __CLR4_5_26wd6wdlx1e453p.R.inc(8973);position.setValid(satellites >= 3);

                __CLR4_5_26wd6wdlx1e453p.R.inc(8974);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

                __CLR4_5_26wd6wdlx1e453p.R.inc(8975);position.set(Event.KEY_HDOP, buf.readUnsignedByte() / 10.0);

                __CLR4_5_26wd6wdlx1e453p.R.inc(8976);buf.readUnsignedByte();

                // Read 1 byte data
                __CLR4_5_26wd6wdlx1e453p.R.inc(8977);int cnt = buf.readUnsignedByte();
                __CLR4_5_26wd6wdlx1e453p.R.inc(8978);for (int j = 0; (((j < cnt)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8979)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8980)==0&false)); j++) {{
                    __CLR4_5_26wd6wdlx1e453p.R.inc(8981);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedByte());
                }

                // Read 2 byte data
                }__CLR4_5_26wd6wdlx1e453p.R.inc(8982);cnt = buf.readUnsignedByte();
                __CLR4_5_26wd6wdlx1e453p.R.inc(8983);for (int j = 0; (((j < cnt)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8984)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8985)==0&false)); j++) {{
                    __CLR4_5_26wd6wdlx1e453p.R.inc(8986);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedShort());
                }

                // Read 4 byte data
                }__CLR4_5_26wd6wdlx1e453p.R.inc(8987);cnt = buf.readUnsignedByte();
                __CLR4_5_26wd6wdlx1e453p.R.inc(8988);for (int j = 0; (((j < cnt)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8989)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8990)==0&false)); j++) {{
                    __CLR4_5_26wd6wdlx1e453p.R.inc(8991);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedInt());
                }

                // Read 8 byte data
                }__CLR4_5_26wd6wdlx1e453p.R.inc(8992);cnt = buf.readUnsignedByte();
                __CLR4_5_26wd6wdlx1e453p.R.inc(8993);for (int j = 0; (((j < cnt)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8994)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(8995)==0&false)); j++) {{
                    __CLR4_5_26wd6wdlx1e453p.R.inc(8996);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readLong());
                }
                }__CLR4_5_26wd6wdlx1e453p.R.inc(8997);positions.add(position);
            }

            // Acknowledgement
            }__CLR4_5_26wd6wdlx1e453p.R.inc(8998);if ((((channel != null)&&(__CLR4_5_26wd6wdlx1e453p.R.iget(8999)!=0|true))||(__CLR4_5_26wd6wdlx1e453p.R.iget(9000)==0&false))) {{
                __CLR4_5_26wd6wdlx1e453p.R.inc(9001);byte[] response = {0x00, 0x02, 0x64, 0x01, 0x13, (byte)0xbc};
                __CLR4_5_26wd6wdlx1e453p.R.inc(9002);channel.write(ChannelBuffers.wrappedBuffer(response));
            }

            }__CLR4_5_26wd6wdlx1e453p.R.inc(9003);return positions;
        }
        
        }__CLR4_5_26wd6wdlx1e453p.R.inc(9004);return null;
    }finally{__CLR4_5_26wd6wdlx1e453p.R.flushNeeded();}}

}
