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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class NvsProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bw4bw4lx1dwk6w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,15482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NvsProtocolDecoder(NvsProtocol protocol) {
        super(protocol);__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15413);try{__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15412);
    }finally{__CLR4_5_2bw4bw4lx1dwk6w.R.flushNeeded();}}

    private void sendResponse(Channel channel, String response) {try{__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15414);
        __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15415);if ((((channel != null)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15416)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15417)==0&false))) {{
            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15418);channel.write(ChannelBuffers.copiedBuffer(response, StandardCharsets.US_ASCII));
        }
    }}finally{__CLR4_5_2bw4bw4lx1dwk6w.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15419);

        __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15420);ChannelBuffer buf = (ChannelBuffer) msg;


        __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15421);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15422)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15423)==0&false))) {{

            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15424);buf.readUnsignedShort(); // length

            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15425);String imei = buf.toString(buf.readerIndex(), 15, StandardCharsets.US_ASCII);

            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15426);if ((((getDeviceSession(channel, remoteAddress, imei) != null)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15427)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15428)==0&false))) {{
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15429);sendResponse(channel, "OK");
            } }else {{
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15430);sendResponse(channel, "NO01");
            }

        }} }else {{

            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15431);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15432);if ((((deviceSession == null)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15433)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15434)==0&false))) {{
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15435);return null;
            }

            }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15436);List<Position> positions = new LinkedList<>();

            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15437);buf.skipBytes(4); // marker
            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15438);buf.readUnsignedShort(); // length
            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15439);buf.readLong(); // imei
            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15440);buf.readUnsignedByte(); // codec
            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15441);int count = buf.readUnsignedByte();

            __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15442);for (int i = 0; (((i < count)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15443)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15444)==0&false)); i++) {{
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15445);Position position = new Position();
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15446);position.setProtocol(getProtocolName());
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15447);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15448);position.setTime(new Date(buf.readUnsignedInt() * 1000));

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15449);position.set("reason", buf.readUnsignedByte());

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15450);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15451);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15452);position.setAltitude(buf.readShort());
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15453);position.setCourse(buf.readUnsignedShort());

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15454);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15455);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15456);position.setValid(buf.readUnsignedByte() != 0);

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15457);buf.readUnsignedByte(); // used systems

                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15458);buf.readUnsignedByte(); // cause element id

                // Read 1 byte data
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15459);int cnt = buf.readUnsignedByte();
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15460);for (int j = 0; (((j < cnt)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15461)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15462)==0&false)); j++) {{
                    __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15463);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedByte());
                }

                // Read 2 byte data
                }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15464);cnt = buf.readUnsignedByte();
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15465);for (int j = 0; (((j < cnt)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15466)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15467)==0&false)); j++) {{
                    __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15468);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedShort());
                }

                // Read 4 byte data
                }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15469);cnt = buf.readUnsignedByte();
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15470);for (int j = 0; (((j < cnt)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15471)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15472)==0&false)); j++) {{
                    __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15473);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedInt());
                }

                // Read 8 byte data
                }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15474);cnt = buf.readUnsignedByte();
                __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15475);for (int j = 0; (((j < cnt)&&(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15476)!=0|true))||(__CLR4_5_2bw4bw4lx1dwk6w.R.iget(15477)==0&false)); j++) {{
                    __CLR4_5_2bw4bw4lx1dwk6w.R.inc(15478);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readLong());
                }

                }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15479);positions.add(position);
            }

            }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15480);return positions;

        }

        }__CLR4_5_2bw4bw4lx1dwk6w.R.inc(15481);return null;
    }finally{__CLR4_5_2bw4bw4lx1dwk6w.R.flushNeeded();}}

}
