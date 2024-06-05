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

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class RuptelaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26fn6fnlx1dp8m7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,8403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public RuptelaProtocolDecoder(RuptelaProtocol protocol) {
        super(protocol);__CLR4_5_26fn6fnlx1dp8m7.R.inc(8340);try{__CLR4_5_26fn6fnlx1dp8m7.R.inc(8339);
    }finally{__CLR4_5_26fn6fnlx1dp8m7.R.flushNeeded();}}

    private static final int COMMAND_RECORDS = 0x01;
    
    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26fn6fnlx1dp8m7.R.inc(8341);

        __CLR4_5_26fn6fnlx1dp8m7.R.inc(8342);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26fn6fnlx1dp8m7.R.inc(8343);buf.readUnsignedShort(); // data length

        // Identify device
        __CLR4_5_26fn6fnlx1dp8m7.R.inc(8344);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_26fn6fnlx1dp8m7.R.inc(8345);if ((((!identify(imei, channel))&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8346)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8347)==0&false))) {{
            __CLR4_5_26fn6fnlx1dp8m7.R.inc(8348);return null;
        }

        }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8349);int type = buf.readUnsignedByte();
        
        __CLR4_5_26fn6fnlx1dp8m7.R.inc(8350);if ((((type == COMMAND_RECORDS)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8351)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8352)==0&false))) {{
            __CLR4_5_26fn6fnlx1dp8m7.R.inc(8353);List<Position> positions = new LinkedList<Position>();

            __CLR4_5_26fn6fnlx1dp8m7.R.inc(8354);buf.readUnsignedByte(); // records left
            __CLR4_5_26fn6fnlx1dp8m7.R.inc(8355);int count = buf.readUnsignedByte();

            __CLR4_5_26fn6fnlx1dp8m7.R.inc(8356);for (int i = 0; (((i < count)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8357)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8358)==0&false)); i++) {{
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8359);Position position = new Position();
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8360);position.setProtocol(getProtocolName());
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8361);position.setDeviceId(getDeviceId());

                // Time
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8362);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8363);buf.readUnsignedByte(); // timestamp extension

                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8364);buf.readUnsignedByte(); // priority (reserved)
                
                // Location
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8365);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8366);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8367);position.setAltitude(buf.readUnsignedShort() / 10.0);
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8368);position.setCourse(buf.readUnsignedShort() / 100.0);

                // Validity
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8369);int satellites = buf.readUnsignedByte();
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8370);position.set(Event.KEY_SATELLITES, satellites);
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8371);position.setValid(satellites >= 3);

                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8372);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8373);position.set(Event.KEY_HDOP, buf.readUnsignedByte() / 10.0);

                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8374);buf.readUnsignedByte();

                // Read 1 byte data
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8375);int cnt = buf.readUnsignedByte();
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8376);for (int j = 0; (((j < cnt)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8377)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8378)==0&false)); j++) {{
                    __CLR4_5_26fn6fnlx1dp8m7.R.inc(8379);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedByte());
                }

                // Read 2 byte data
                }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8380);cnt = buf.readUnsignedByte();
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8381);for (int j = 0; (((j < cnt)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8382)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8383)==0&false)); j++) {{
                    __CLR4_5_26fn6fnlx1dp8m7.R.inc(8384);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedShort());
                }

                // Read 4 byte data
                }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8385);cnt = buf.readUnsignedByte();
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8386);for (int j = 0; (((j < cnt)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8387)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8388)==0&false)); j++) {{
                    __CLR4_5_26fn6fnlx1dp8m7.R.inc(8389);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedInt());
                }

                // Read 8 byte data
                }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8390);cnt = buf.readUnsignedByte();
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8391);for (int j = 0; (((j < cnt)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8392)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8393)==0&false)); j++) {{
                    __CLR4_5_26fn6fnlx1dp8m7.R.inc(8394);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readLong());
                }
                }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8395);positions.add(position);
            }

            // Acknowledgement
            }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8396);if ((((channel != null)&&(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8397)!=0|true))||(__CLR4_5_26fn6fnlx1dp8m7.R.iget(8398)==0&false))) {{
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8399);byte[] response = {0x00, 0x02, 0x64, 0x01, 0x13, (byte)0xbc};
                __CLR4_5_26fn6fnlx1dp8m7.R.inc(8400);channel.write(ChannelBuffers.wrappedBuffer(response));
            }

            }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8401);return positions;
        }
        
        }__CLR4_5_26fn6fnlx1dp8m7.R.inc(8402);return null;
    }finally{__CLR4_5_26fn6fnlx1dp8m7.R.flushNeeded();}}

}
