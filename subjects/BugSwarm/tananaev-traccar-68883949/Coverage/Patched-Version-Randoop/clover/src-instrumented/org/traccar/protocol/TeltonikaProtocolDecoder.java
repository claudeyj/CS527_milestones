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

import java.nio.charset.Charset;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class TeltonikaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2715715lx1dp8ra{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,9257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public TeltonikaProtocolDecoder(TeltonikaProtocol protocol) {
        super(protocol);__CLR4_5_2715715lx1dp8ra.R.inc(9114);try{__CLR4_5_2715715lx1dp8ra.R.inc(9113);
    }finally{__CLR4_5_2715715lx1dp8ra.R.flushNeeded();}}

    private void parseIdentification(Channel channel, ChannelBuffer buf) {try{__CLR4_5_2715715lx1dp8ra.R.inc(9115);

        __CLR4_5_2715715lx1dp8ra.R.inc(9116);int length = buf.readUnsignedShort();
        __CLR4_5_2715715lx1dp8ra.R.inc(9117);String imei = buf.toString(buf.readerIndex(), length, Charset.defaultCharset());
        __CLR4_5_2715715lx1dp8ra.R.inc(9118);boolean result =  identify(imei, channel);

        __CLR4_5_2715715lx1dp8ra.R.inc(9119);if ((((channel != null)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9120)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9121)==0&false))) {{
            __CLR4_5_2715715lx1dp8ra.R.inc(9122);ChannelBuffer response = ChannelBuffers.directBuffer(1);
            __CLR4_5_2715715lx1dp8ra.R.inc(9123);response.writeByte((((result )&&(__CLR4_5_2715715lx1dp8ra.R.iget(9124)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9125)==0&false))? 1 : 0);
            __CLR4_5_2715715lx1dp8ra.R.inc(9126);channel.write(response);
        }
    }}finally{__CLR4_5_2715715lx1dp8ra.R.flushNeeded();}}

    private static final int CODEC_GH3000 = 0x07;
    private static final int CODEC_FM4X00 = 0x08;
    private static final int CODEC_12 = 0x0C;
    
    private List<Position> parseLocation(Channel channel, ChannelBuffer buf) {try{__CLR4_5_2715715lx1dp8ra.R.inc(9127);
        __CLR4_5_2715715lx1dp8ra.R.inc(9128);List<Position> positions = new LinkedList<Position>();
        
        __CLR4_5_2715715lx1dp8ra.R.inc(9129);buf.skipBytes(4); // marker
        __CLR4_5_2715715lx1dp8ra.R.inc(9130);buf.readUnsignedInt(); // data length
        __CLR4_5_2715715lx1dp8ra.R.inc(9131);int codec = buf.readUnsignedByte(); // codec
        
        __CLR4_5_2715715lx1dp8ra.R.inc(9132);if ((((codec == CODEC_12)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9133)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9134)==0&false))) {{
            // TODO: decode serial port data
            __CLR4_5_2715715lx1dp8ra.R.inc(9135);return null;
        }
        
        }__CLR4_5_2715715lx1dp8ra.R.inc(9136);int count = buf.readUnsignedByte();
        
        __CLR4_5_2715715lx1dp8ra.R.inc(9137);for (int i = 0; (((i < count)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9138)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9139)==0&false)); i++) {{
            __CLR4_5_2715715lx1dp8ra.R.inc(9140);Position position = new Position();
            __CLR4_5_2715715lx1dp8ra.R.inc(9141);position.setProtocol(getProtocolName());
            
            __CLR4_5_2715715lx1dp8ra.R.inc(9142);position.setDeviceId(getDeviceId());
            
            __CLR4_5_2715715lx1dp8ra.R.inc(9143);int globalMask = 0x0f;
            
            __CLR4_5_2715715lx1dp8ra.R.inc(9144);if ((((codec == CODEC_GH3000)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9145)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9146)==0&false))) {{

                __CLR4_5_2715715lx1dp8ra.R.inc(9147);long time = buf.readUnsignedInt() & 0x3fffffff;
                __CLR4_5_2715715lx1dp8ra.R.inc(9148);time += 1167609600; // 2007-01-01 00:00:00
                __CLR4_5_2715715lx1dp8ra.R.inc(9149);position.setTime(new Date(time * 1000));
                
                __CLR4_5_2715715lx1dp8ra.R.inc(9150);globalMask = buf.readUnsignedByte();
                __CLR4_5_2715715lx1dp8ra.R.inc(9151);if ((((!BitUtil.check(globalMask, 0))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9152)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9153)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9154);return null;
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9155);int locationMask = buf.readUnsignedByte();
                
                __CLR4_5_2715715lx1dp8ra.R.inc(9156);if ((((BitUtil.check(locationMask, 0))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9157)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9158)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9159);position.setLatitude(buf.readFloat());
                    __CLR4_5_2715715lx1dp8ra.R.inc(9160);position.setLongitude(buf.readFloat());
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9161);if ((((BitUtil.check(locationMask, 1))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9162)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9163)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9164);position.setAltitude(buf.readUnsignedShort());
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9165);if ((((BitUtil.check(locationMask, 2))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9166)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9167)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9168);position.setCourse(buf.readUnsignedByte() * 360.0 / 256);
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9169);if ((((BitUtil.check(locationMask, 3))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9170)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9171)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9172);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9173);if ((((BitUtil.check(locationMask, 4))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9174)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9175)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9176);int satellites = buf.readUnsignedByte();
                    __CLR4_5_2715715lx1dp8ra.R.inc(9177);position.set(Event.KEY_SATELLITES, satellites);
                    __CLR4_5_2715715lx1dp8ra.R.inc(9178);position.setValid(satellites >= 3);
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9179);if ((((BitUtil.check(locationMask, 5))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9180)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9181)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9182);position.set("area", buf.readUnsignedShort());
                    __CLR4_5_2715715lx1dp8ra.R.inc(9183);position.set(Event.KEY_CELL, buf.readUnsignedShort());
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9184);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9185)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9186)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9187);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                }
                
                }__CLR4_5_2715715lx1dp8ra.R.inc(9188);if ((((BitUtil.check(locationMask, 7))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9189)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9190)==0&false))) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9191);position.set("operator", buf.readUnsignedInt());
                }

            }} }else {{

                __CLR4_5_2715715lx1dp8ra.R.inc(9192);position.setTime(new Date(buf.readLong()));

                __CLR4_5_2715715lx1dp8ra.R.inc(9193);position.set("priority", buf.readUnsignedByte());

                __CLR4_5_2715715lx1dp8ra.R.inc(9194);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_2715715lx1dp8ra.R.inc(9195);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_2715715lx1dp8ra.R.inc(9196);position.setAltitude(buf.readShort());
                __CLR4_5_2715715lx1dp8ra.R.inc(9197);position.setCourse(buf.readUnsignedShort());

                __CLR4_5_2715715lx1dp8ra.R.inc(9198);int satellites = buf.readUnsignedByte();
                __CLR4_5_2715715lx1dp8ra.R.inc(9199);position.set(Event.KEY_SATELLITES, satellites);

                __CLR4_5_2715715lx1dp8ra.R.inc(9200);position.setValid(satellites != 0);

                __CLR4_5_2715715lx1dp8ra.R.inc(9201);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

                __CLR4_5_2715715lx1dp8ra.R.inc(9202);position.set(Event.KEY_EVENT, buf.readUnsignedByte());

                __CLR4_5_2715715lx1dp8ra.R.inc(9203);buf.readUnsignedByte(); // total IO data records

            }
            
            // Read 1 byte data
            }__CLR4_5_2715715lx1dp8ra.R.inc(9204);if ((((BitUtil.check(globalMask, 1))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9205)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9206)==0&false))) {{
                __CLR4_5_2715715lx1dp8ra.R.inc(9207);int cnt = buf.readUnsignedByte();
                __CLR4_5_2715715lx1dp8ra.R.inc(9208);for (int j = 0; (((j < cnt)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9209)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9210)==0&false)); j++) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9211);int id = buf.readUnsignedByte();
                    __CLR4_5_2715715lx1dp8ra.R.inc(9212);if ((((id == 1)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9213)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9214)==0&false))) {{
                        __CLR4_5_2715715lx1dp8ra.R.inc(9215);position.set(Event.KEY_POWER, buf.readUnsignedByte());
                    } }else {{
                        __CLR4_5_2715715lx1dp8ra.R.inc(9216);position.set(Event.PREFIX_IO + id, buf.readUnsignedByte());
                    }
                }}
            }}

            
            // Read 2 byte data
            }__CLR4_5_2715715lx1dp8ra.R.inc(9217);if ((((BitUtil.check(globalMask, 2))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9218)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9219)==0&false))) {{
                __CLR4_5_2715715lx1dp8ra.R.inc(9220);int cnt = buf.readUnsignedByte();
                __CLR4_5_2715715lx1dp8ra.R.inc(9221);for (int j = 0; (((j < cnt)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9222)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9223)==0&false)); j++) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9224);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedShort());
                }
            }}

            // Read 4 byte data
            }__CLR4_5_2715715lx1dp8ra.R.inc(9225);if ((((BitUtil.check(globalMask, 3))&&(__CLR4_5_2715715lx1dp8ra.R.iget(9226)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9227)==0&false))) {{
                __CLR4_5_2715715lx1dp8ra.R.inc(9228);int cnt = buf.readUnsignedByte();
                __CLR4_5_2715715lx1dp8ra.R.inc(9229);for (int j = 0; (((j < cnt)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9230)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9231)==0&false)); j++) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9232);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readUnsignedInt());
                }
            }}

            // Read 8 byte data
            }__CLR4_5_2715715lx1dp8ra.R.inc(9233);if ((((codec == CODEC_FM4X00)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9234)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9235)==0&false))) {{
                __CLR4_5_2715715lx1dp8ra.R.inc(9236);int cnt = buf.readUnsignedByte();
                __CLR4_5_2715715lx1dp8ra.R.inc(9237);for (int j = 0; (((j < cnt)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9238)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9239)==0&false)); j++) {{
                    __CLR4_5_2715715lx1dp8ra.R.inc(9240);position.set(Event.PREFIX_IO + buf.readUnsignedByte(), buf.readLong());
                }
            }}
            }__CLR4_5_2715715lx1dp8ra.R.inc(9241);positions.add(position);
        }
        
        }__CLR4_5_2715715lx1dp8ra.R.inc(9242);if ((((channel != null)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9243)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9244)==0&false))) {{
            __CLR4_5_2715715lx1dp8ra.R.inc(9245);ChannelBuffer response = ChannelBuffers.directBuffer(4);
            __CLR4_5_2715715lx1dp8ra.R.inc(9246);response.writeInt(count);
            __CLR4_5_2715715lx1dp8ra.R.inc(9247);channel.write(response);
        }
        
        }__CLR4_5_2715715lx1dp8ra.R.inc(9248);return positions;
    }finally{__CLR4_5_2715715lx1dp8ra.R.flushNeeded();}}
    
    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2715715lx1dp8ra.R.inc(9249);
        
        __CLR4_5_2715715lx1dp8ra.R.inc(9250);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_2715715lx1dp8ra.R.inc(9251);if ((((buf.getUnsignedShort(0) > 0)&&(__CLR4_5_2715715lx1dp8ra.R.iget(9252)!=0|true))||(__CLR4_5_2715715lx1dp8ra.R.iget(9253)==0&false))) {{
            __CLR4_5_2715715lx1dp8ra.R.inc(9254);parseIdentification(channel, buf);
        } }else {{
            __CLR4_5_2715715lx1dp8ra.R.inc(9255);return parseLocation(channel, buf);
        }
        
        }__CLR4_5_2715715lx1dp8ra.R.inc(9256);return null;
    }finally{__CLR4_5_2715715lx1dp8ra.R.flushNeeded();}}

}
