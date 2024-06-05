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

public class NvsProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dpfdpflwye7giu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,17833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NvsProtocolDecoder(NvsProtocol protocol) {
        super(protocol);__CLR4_5_2dpfdpflwye7giu.R.inc(17764);try{__CLR4_5_2dpfdpflwye7giu.R.inc(17763);
    }finally{__CLR4_5_2dpfdpflwye7giu.R.flushNeeded();}}

    private void sendResponse(Channel channel, String response) {try{__CLR4_5_2dpfdpflwye7giu.R.inc(17765);
        __CLR4_5_2dpfdpflwye7giu.R.inc(17766);if ((((channel != null)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17767)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17768)==0&false))) {{
            __CLR4_5_2dpfdpflwye7giu.R.inc(17769);channel.write(ChannelBuffers.copiedBuffer(response, StandardCharsets.US_ASCII));
        }
    }}finally{__CLR4_5_2dpfdpflwye7giu.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dpfdpflwye7giu.R.inc(17770);

        __CLR4_5_2dpfdpflwye7giu.R.inc(17771);ChannelBuffer buf = (ChannelBuffer) msg;


        __CLR4_5_2dpfdpflwye7giu.R.inc(17772);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17773)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17774)==0&false))) {{

            __CLR4_5_2dpfdpflwye7giu.R.inc(17775);buf.readUnsignedShort(); // length

            __CLR4_5_2dpfdpflwye7giu.R.inc(17776);String imei = buf.toString(buf.readerIndex(), 15, StandardCharsets.US_ASCII);

            __CLR4_5_2dpfdpflwye7giu.R.inc(17777);if ((((getDeviceSession(channel, remoteAddress, imei) != null)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17778)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17779)==0&false))) {{
                __CLR4_5_2dpfdpflwye7giu.R.inc(17780);sendResponse(channel, "OK");
            } }else {{
                __CLR4_5_2dpfdpflwye7giu.R.inc(17781);sendResponse(channel, "NO01");
            }

        }} }else {{

            __CLR4_5_2dpfdpflwye7giu.R.inc(17782);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2dpfdpflwye7giu.R.inc(17783);if ((((deviceSession == null)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17784)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17785)==0&false))) {{
                __CLR4_5_2dpfdpflwye7giu.R.inc(17786);return null;
            }

            }__CLR4_5_2dpfdpflwye7giu.R.inc(17787);List<Position> positions = new LinkedList<>();

            __CLR4_5_2dpfdpflwye7giu.R.inc(17788);buf.skipBytes(4); // marker
            __CLR4_5_2dpfdpflwye7giu.R.inc(17789);buf.readUnsignedShort(); // length
            __CLR4_5_2dpfdpflwye7giu.R.inc(17790);buf.readLong(); // imei
            __CLR4_5_2dpfdpflwye7giu.R.inc(17791);buf.readUnsignedByte(); // codec
            __CLR4_5_2dpfdpflwye7giu.R.inc(17792);int count = buf.readUnsignedByte();

            __CLR4_5_2dpfdpflwye7giu.R.inc(17793);for (int i = 0; (((i < count)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17794)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17795)==0&false)); i++) {{
                __CLR4_5_2dpfdpflwye7giu.R.inc(17796);Position position = new Position();
                __CLR4_5_2dpfdpflwye7giu.R.inc(17797);position.setProtocol(getProtocolName());
                __CLR4_5_2dpfdpflwye7giu.R.inc(17798);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2dpfdpflwye7giu.R.inc(17799);position.setTime(new Date(buf.readUnsignedInt() * 1000));

                __CLR4_5_2dpfdpflwye7giu.R.inc(17800);position.set("reason", buf.readUnsignedByte());

                __CLR4_5_2dpfdpflwye7giu.R.inc(17801);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_2dpfdpflwye7giu.R.inc(17802);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_2dpfdpflwye7giu.R.inc(17803);position.setAltitude(buf.readShort());
                __CLR4_5_2dpfdpflwye7giu.R.inc(17804);position.setCourse(buf.readUnsignedShort());

                __CLR4_5_2dpfdpflwye7giu.R.inc(17805);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_2dpfdpflwye7giu.R.inc(17806);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
                __CLR4_5_2dpfdpflwye7giu.R.inc(17807);position.setValid(buf.readUnsignedByte() != 0);

                __CLR4_5_2dpfdpflwye7giu.R.inc(17808);buf.readUnsignedByte(); // used systems

                __CLR4_5_2dpfdpflwye7giu.R.inc(17809);buf.readUnsignedByte(); // cause element id

                // Read 1 byte data
                __CLR4_5_2dpfdpflwye7giu.R.inc(17810);int cnt = buf.readUnsignedByte();
                __CLR4_5_2dpfdpflwye7giu.R.inc(17811);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17812)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17813)==0&false)); j++) {{
                    __CLR4_5_2dpfdpflwye7giu.R.inc(17814);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedByte());
                }

                // Read 2 byte data
                }__CLR4_5_2dpfdpflwye7giu.R.inc(17815);cnt = buf.readUnsignedByte();
                __CLR4_5_2dpfdpflwye7giu.R.inc(17816);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17817)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17818)==0&false)); j++) {{
                    __CLR4_5_2dpfdpflwye7giu.R.inc(17819);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedShort());
                }

                // Read 4 byte data
                }__CLR4_5_2dpfdpflwye7giu.R.inc(17820);cnt = buf.readUnsignedByte();
                __CLR4_5_2dpfdpflwye7giu.R.inc(17821);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17822)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17823)==0&false)); j++) {{
                    __CLR4_5_2dpfdpflwye7giu.R.inc(17824);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedInt());
                }

                // Read 8 byte data
                }__CLR4_5_2dpfdpflwye7giu.R.inc(17825);cnt = buf.readUnsignedByte();
                __CLR4_5_2dpfdpflwye7giu.R.inc(17826);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dpfdpflwye7giu.R.iget(17827)!=0|true))||(__CLR4_5_2dpfdpflwye7giu.R.iget(17828)==0&false)); j++) {{
                    __CLR4_5_2dpfdpflwye7giu.R.inc(17829);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), buf.readLong());
                }

                }__CLR4_5_2dpfdpflwye7giu.R.inc(17830);positions.add(position);
            }

            }__CLR4_5_2dpfdpflwye7giu.R.inc(17831);return positions;

        }

        }__CLR4_5_2dpfdpflwye7giu.R.inc(17832);return null;
    }finally{__CLR4_5_2dpfdpflwye7giu.R.flushNeeded();}}

}
