/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.nio.charset.Charset;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class TeltonikaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27ic7iclx1e3813{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,9876,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public TeltonikaProtocolDecoder(TeltonikaProtocol protocol) {
        super(protocol);__CLR4_5_27ic7iclx1e3813.R.inc(9733);try{__CLR4_5_27ic7iclx1e3813.R.inc(9732);
    }finally{__CLR4_5_27ic7iclx1e3813.R.flushNeeded();}}

    private void parseIdentification(Channel channel, ChannelBuffer buf) {try{__CLR4_5_27ic7iclx1e3813.R.inc(9734);

        __CLR4_5_27ic7iclx1e3813.R.inc(9735);int length = buf.readUnsignedShort();
        __CLR4_5_27ic7iclx1e3813.R.inc(9736);String imei = buf.toString(buf.readerIndex(), length, Charset.defaultCharset());
        __CLR4_5_27ic7iclx1e3813.R.inc(9737);boolean result =  identify(imei, channel);

        __CLR4_5_27ic7iclx1e3813.R.inc(9738);if ((((channel != null)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9739)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9740)==0&false))) {{
            __CLR4_5_27ic7iclx1e3813.R.inc(9741);ChannelBuffer response = ChannelBuffers.directBuffer(1);
            __CLR4_5_27ic7iclx1e3813.R.inc(9742);response.writeByte((((result )&&(__CLR4_5_27ic7iclx1e3813.R.iget(9743)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9744)==0&false))? 1 : 0);
            __CLR4_5_27ic7iclx1e3813.R.inc(9745);channel.write(response);
        }
    }}finally{__CLR4_5_27ic7iclx1e3813.R.flushNeeded();}}

    private static final int CODEC_GH3000 = 0x07;
    private static final int CODEC_FM4X00 = 0x08;
    private static final int CODEC_12 = 0x0C;
    
    private List<Position> parseLocation(Channel channel, ChannelBuffer buf) {try{__CLR4_5_27ic7iclx1e3813.R.inc(9746);
        __CLR4_5_27ic7iclx1e3813.R.inc(9747);List<Position> positions = new LinkedList<>();
        
        __CLR4_5_27ic7iclx1e3813.R.inc(9748);buf.skipBytes(4); // marker
        __CLR4_5_27ic7iclx1e3813.R.inc(9749);buf.readUnsignedInt(); // data length
        __CLR4_5_27ic7iclx1e3813.R.inc(9750);int codec = buf.readUnsignedByte(); // codec
        
        __CLR4_5_27ic7iclx1e3813.R.inc(9751);if ((((codec == CODEC_12)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9752)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9753)==0&false))) {{
            // TODO: decode serial port data
            __CLR4_5_27ic7iclx1e3813.R.inc(9754);return null;
        }
        
        }__CLR4_5_27ic7iclx1e3813.R.inc(9755);int count = buf.readUnsignedByte();
        
        __CLR4_5_27ic7iclx1e3813.R.inc(9756);for (int i = 0; (((i < count)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9757)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9758)==0&false)); i++) {{
            __CLR4_5_27ic7iclx1e3813.R.inc(9759);Position position = new Position();
            __CLR4_5_27ic7iclx1e3813.R.inc(9760);position.setProtocol(getProtocolName());
            
            __CLR4_5_27ic7iclx1e3813.R.inc(9761);position.setDeviceId(getDeviceId());
            
            __CLR4_5_27ic7iclx1e3813.R.inc(9762);int globalMask = 0x0f;
            
            __CLR4_5_27ic7iclx1e3813.R.inc(9763);if ((((codec == CODEC_GH3000)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9764)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9765)==0&false))) {{

                __CLR4_5_27ic7iclx1e3813.R.inc(9766);long time = buf.readUnsignedInt() & 0x3fffffff;
                __CLR4_5_27ic7iclx1e3813.R.inc(9767);time += 1167609600; // 2007-01-01 00:00:00
                __CLR4_5_27ic7iclx1e3813.R.inc(9768);position.setTime(new Date(time * 1000));
                
                __CLR4_5_27ic7iclx1e3813.R.inc(9769);globalMask = buf.readUnsignedByte();
                __CLR4_5_27ic7iclx1e3813.R.inc(9770);if ((((!BitUtil.check(globalMask, 0))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9771)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9772)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9773);return null;
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9774);int locationMask = buf.readUnsignedByte();
                
                __CLR4_5_27ic7iclx1e3813.R.inc(9775);if ((((BitUtil.check(locationMask, 0))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9776)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9777)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9778);position.setLatitude(buf.readFloat());
                    __CLR4_5_27ic7iclx1e3813.R.inc(9779);position.setLongitude(buf.readFloat());
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9780);if ((((BitUtil.check(locationMask, 1))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9781)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9782)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9783);position.setAltitude(buf.readUnsignedShort());
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9784);if ((((BitUtil.check(locationMask, 2))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9785)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9786)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9787);position.setCourse(buf.readUnsignedByte() * 360.0 / 256);
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9788);if ((((BitUtil.check(locationMask, 3))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9789)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9790)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9791);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9792);if ((((BitUtil.check(locationMask, 4))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9793)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9794)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9795);int satellites = buf.readUnsignedByte();
                    __CLR4_5_27ic7iclx1e3813.R.inc(9796);position.set(Event.KEY_SATELLITES, satellites);
                    __CLR4_5_27ic7iclx1e3813.R.inc(9797);position.setValid(satellites >= 3);
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9798);if ((((BitUtil.check(locationMask, 5))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9799)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9800)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9801);position.set("area", buf.readUnsignedShort());
                    __CLR4_5_27ic7iclx1e3813.R.inc(9802);position.set(Event.KEY_CELL, buf.readUnsignedShort());
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9803);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9804)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9805)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9806);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                }
                
                }__CLR4_5_27ic7iclx1e3813.R.inc(9807);if ((((BitUtil.check(locationMask, 7))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9808)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9809)==0&false))) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9810);position.set("operator", buf.readUnsignedInt());
                }

            }} }else {{

                __CLR4_5_27ic7iclx1e3813.R.inc(9811);position.setTime(new Date(buf.readLong()));

                __CLR4_5_27ic7iclx1e3813.R.inc(9812);position.set("priority", buf.readUnsignedByte());

                __CLR4_5_27ic7iclx1e3813.R.inc(9813);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_27ic7iclx1e3813.R.inc(9814);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_27ic7iclx1e3813.R.inc(9815);position.setAltitude(buf.readShort());
                __CLR4_5_27ic7iclx1e3813.R.inc(9816);position.setCourse(buf.readUnsignedShort());

                __CLR4_5_27ic7iclx1e3813.R.inc(9817);int satellites = buf.readUnsignedByte();
                __CLR4_5_27ic7iclx1e3813.R.inc(9818);position.set(Event.KEY_SATELLITES, satellites);

                __CLR4_5_27ic7iclx1e3813.R.inc(9819);position.setValid(satellites != 0);

                __CLR4_5_27ic7iclx1e3813.R.inc(9820);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

                __CLR4_5_27ic7iclx1e3813.R.inc(9821);position.set(Event.KEY_EVENT, buf.readUnsignedByte());

                __CLR4_5_27ic7iclx1e3813.R.inc(9822);buf.readUnsignedByte(); // total IO data records

            }
            
            // Read 1 byte data
            }__CLR4_5_27ic7iclx1e3813.R.inc(9823);if ((((BitUtil.check(globalMask, 1))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9824)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9825)==0&false))) {{
                __CLR4_5_27ic7iclx1e3813.R.inc(9826);int cnt = buf.readUnsignedByte();
                __CLR4_5_27ic7iclx1e3813.R.inc(9827);for (int j = 0; (((j < cnt)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9828)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9829)==0&false)); j++) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9830);int id = buf.readUnsignedByte();
                    __CLR4_5_27ic7iclx1e3813.R.inc(9831);if ((((id == 1)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9832)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9833)==0&false))) {{
                        __CLR4_5_27ic7iclx1e3813.R.inc(9834);position.set(Event.KEY_POWER, buf.readUnsignedByte());
                    } }else {{
                        __CLR4_5_27ic7iclx1e3813.R.inc(9835);position.set(Event.PREFIX_IO + id, buf.readUnsignedByte());
                    }
                }}
            }}

            // Read 2 byte data
            }__CLR4_5_27ic7iclx1e3813.R.inc(9836);if ((((BitUtil.check(globalMask, 2))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9837)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9838)==0&false))) {{
                __CLR4_5_27ic7iclx1e3813.R.inc(9839);int cnt = buf.readUnsignedByte();
                __CLR4_5_27ic7iclx1e3813.R.inc(9840);for (int j = 0; (((j < cnt)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9841)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9842)==0&false)); j++) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9843);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedShort());
                }
            }}

            // Read 4 byte data
            }__CLR4_5_27ic7iclx1e3813.R.inc(9844);if ((((BitUtil.check(globalMask, 3))&&(__CLR4_5_27ic7iclx1e3813.R.iget(9845)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9846)==0&false))) {{
                __CLR4_5_27ic7iclx1e3813.R.inc(9847);int cnt = buf.readUnsignedByte();
                __CLR4_5_27ic7iclx1e3813.R.inc(9848);for (int j = 0; (((j < cnt)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9849)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9850)==0&false)); j++) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9851);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedInt());
                }
            }}

            // Read 8 byte data
            }__CLR4_5_27ic7iclx1e3813.R.inc(9852);if ((((codec == CODEC_FM4X00)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9853)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9854)==0&false))) {{
                __CLR4_5_27ic7iclx1e3813.R.inc(9855);int cnt = buf.readUnsignedByte();
                __CLR4_5_27ic7iclx1e3813.R.inc(9856);for (int j = 0; (((j < cnt)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9857)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9858)==0&false)); j++) {{
                    __CLR4_5_27ic7iclx1e3813.R.inc(9859);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readLong());
                }
            }}
            }__CLR4_5_27ic7iclx1e3813.R.inc(9860);positions.add(position);
        }
        
        }__CLR4_5_27ic7iclx1e3813.R.inc(9861);if ((((channel != null)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9862)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9863)==0&false))) {{
            __CLR4_5_27ic7iclx1e3813.R.inc(9864);ChannelBuffer response = ChannelBuffers.directBuffer(4);
            __CLR4_5_27ic7iclx1e3813.R.inc(9865);response.writeInt(count);
            __CLR4_5_27ic7iclx1e3813.R.inc(9866);channel.write(response);
        }
        
        }__CLR4_5_27ic7iclx1e3813.R.inc(9867);return positions;
    }finally{__CLR4_5_27ic7iclx1e3813.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27ic7iclx1e3813.R.inc(9868);
        
        __CLR4_5_27ic7iclx1e3813.R.inc(9869);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_27ic7iclx1e3813.R.inc(9870);if ((((buf.getUnsignedShort(0) > 0)&&(__CLR4_5_27ic7iclx1e3813.R.iget(9871)!=0|true))||(__CLR4_5_27ic7iclx1e3813.R.iget(9872)==0&false))) {{
            __CLR4_5_27ic7iclx1e3813.R.inc(9873);parseIdentification(channel, buf);
        } }else {{
            __CLR4_5_27ic7iclx1e3813.R.inc(9874);return parseLocation(channel, buf);
        }
        
        }__CLR4_5_27ic7iclx1e3813.R.inc(9875);return null;
    }finally{__CLR4_5_27ic7iclx1e3813.R.flushNeeded();}}

}
