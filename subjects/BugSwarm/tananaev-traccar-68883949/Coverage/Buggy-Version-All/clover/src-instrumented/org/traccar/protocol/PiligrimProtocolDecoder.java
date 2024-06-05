/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class PiligrimProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_262h62hlx1dlpl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,7965,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public PiligrimProtocolDecoder(PiligrimProtocol protocol) {
        super(protocol);__CLR4_5_262h62hlx1dlpl2.R.inc(7866);try{__CLR4_5_262h62hlx1dlpl2.R.inc(7865);
    }finally{__CLR4_5_262h62hlx1dlpl2.R.flushNeeded();}}

    private void sendResponse(Channel channel, String message) {try{__CLR4_5_262h62hlx1dlpl2.R.inc(7867);
        __CLR4_5_262h62hlx1dlpl2.R.inc(7868);if ((((channel != null)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7869)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7870)==0&false))) {{
            __CLR4_5_262h62hlx1dlpl2.R.inc(7871);HttpResponse response = new DefaultHttpResponse(
                    HttpVersion.HTTP_1_1, HttpResponseStatus.OK);
            __CLR4_5_262h62hlx1dlpl2.R.inc(7872);response.setContent(ChannelBuffers.copiedBuffer(
                    ByteOrder.BIG_ENDIAN, message, Charset.defaultCharset()));
            __CLR4_5_262h62hlx1dlpl2.R.inc(7873);channel.write(response);
        }
    }}finally{__CLR4_5_262h62hlx1dlpl2.R.flushNeeded();}}

    private static final int MSG_GPS = 0xF1;
    private static final int MSG_GPS_SENSORS = 0xF2;
    private static final int MSG_EVENTS = 0xF3;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_262h62hlx1dlpl2.R.inc(7874);
        
        __CLR4_5_262h62hlx1dlpl2.R.inc(7875);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_262h62hlx1dlpl2.R.inc(7876);String uri = request.getUri();
        
        __CLR4_5_262h62hlx1dlpl2.R.inc(7877);if ((((uri.startsWith("/config"))&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7878)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7879)==0&false))) {{

            __CLR4_5_262h62hlx1dlpl2.R.inc(7880);sendResponse(channel, "CONFIG: OK");
        
        } }else {__CLR4_5_262h62hlx1dlpl2.R.inc(7881);if ((((uri.startsWith("/addlog"))&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7882)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7883)==0&false))) {{

            __CLR4_5_262h62hlx1dlpl2.R.inc(7884);sendResponse(channel, "ADDLOG: OK");
        
        } }else {__CLR4_5_262h62hlx1dlpl2.R.inc(7885);if ((((uri.startsWith("/inform"))&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7886)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7887)==0&false))) {{

            __CLR4_5_262h62hlx1dlpl2.R.inc(7888);sendResponse(channel, "INFORM: OK");
        
        } }else {__CLR4_5_262h62hlx1dlpl2.R.inc(7889);if ((((uri.startsWith("/bingps"))&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7890)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7891)==0&false))) {{

            __CLR4_5_262h62hlx1dlpl2.R.inc(7892);sendResponse(channel, "BINGPS: OK");
            
            // Identification
            __CLR4_5_262h62hlx1dlpl2.R.inc(7893);QueryStringDecoder decoder = new QueryStringDecoder(request.getUri());
            __CLR4_5_262h62hlx1dlpl2.R.inc(7894);if ((((!identify(decoder.getParameters().get("imei").get(0), channel))&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7895)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7896)==0&false))) {{
                __CLR4_5_262h62hlx1dlpl2.R.inc(7897);return null;
            }

            }__CLR4_5_262h62hlx1dlpl2.R.inc(7898);List<Position> positions = new LinkedList<Position>();
            __CLR4_5_262h62hlx1dlpl2.R.inc(7899);ChannelBuffer buf = request.getContent();
            
            __CLR4_5_262h62hlx1dlpl2.R.inc(7900);while ((((buf.readableBytes() > 2)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7901)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7902)==0&false))) {{

                __CLR4_5_262h62hlx1dlpl2.R.inc(7903);buf.readUnsignedByte(); // header
                __CLR4_5_262h62hlx1dlpl2.R.inc(7904);int type = buf.readUnsignedByte();
                __CLR4_5_262h62hlx1dlpl2.R.inc(7905);buf.readUnsignedByte(); // length
                
                __CLR4_5_262h62hlx1dlpl2.R.inc(7906);if ((((type == MSG_GPS || type == MSG_GPS_SENSORS)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7907)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7908)==0&false))) {{
                    
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7909);Position position = new Position();
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7910);position.setProtocol(getProtocolName());
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7911);position.setDeviceId(getDeviceId());
                    
                    // Time
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7912);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7913);time.clear();
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7914);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7915);time.set(Calendar.MONTH, (buf.getByte(buf.readerIndex()) & 0x0f) - 1);
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7916);time.set(Calendar.YEAR, 2010 + (buf.readUnsignedByte() >> 4));
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7917);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7918);time.set(Calendar.MINUTE, buf.readUnsignedByte());
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7919);time.set(Calendar.SECOND, buf.readUnsignedByte());
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7920);position.setTime(time.getTime());
                    
                    // Latitude
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7921);double latitude = buf.readUnsignedByte();
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7922);latitude += buf.readUnsignedByte() / 60.0;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7923);latitude += buf.readUnsignedByte() / 6000.0;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7924);latitude += buf.readUnsignedByte() / 600000.0;
                    
                    // Longitude
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7925);double longitude = buf.readUnsignedByte();
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7926);longitude += buf.readUnsignedByte() / 60.0;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7927);longitude += buf.readUnsignedByte() / 6000.0;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7928);longitude += buf.readUnsignedByte() / 600000.0;
                    
                    // Hemisphere
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7929);int flags = buf.readUnsignedByte();
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7930);if (((((flags & 0x01) != 0)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7931)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7932)==0&false))) {__CLR4_5_262h62hlx1dlpl2.R.inc(7933);latitude = -latitude;
                    }__CLR4_5_262h62hlx1dlpl2.R.inc(7934);if (((((flags & 0x02) != 0)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7935)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7936)==0&false))) {__CLR4_5_262h62hlx1dlpl2.R.inc(7937);longitude = -longitude;
                    }__CLR4_5_262h62hlx1dlpl2.R.inc(7938);position.setLatitude(latitude);
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7939);position.setLongitude(longitude);
                    
                    // Satellites
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7940);int satellites = buf.readUnsignedByte();
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7941);position.set(Event.KEY_SATELLITES, satellites);
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7942);position.setValid(satellites >= 3);
                    
                    // Speed
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7943);position.setSpeed(buf.readUnsignedByte());
                    
                    // Course
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7944);double course = buf.readUnsignedByte() << 1;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7945);course += (flags >> 2) & 1;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7946);course += buf.readUnsignedByte() / 100.0;
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7947);position.setCourse(course);

                    // Sensors
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7948);if ((((type == MSG_GPS_SENSORS)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7949)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7950)==0&false))) {{

                        // External power
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7951);double power = buf.readUnsignedByte();
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7952);power += buf.readUnsignedByte() << 8;
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7953);position.set(Event.KEY_POWER, power / 100);

                        // Battery
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7954);double battery = buf.readUnsignedByte();
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7955);battery += buf.readUnsignedByte() << 8;
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7956);position.set(Event.KEY_BATTERY, battery / 100);
                        
                        __CLR4_5_262h62hlx1dlpl2.R.inc(7957);buf.skipBytes(6);
                        
                    }
                    }__CLR4_5_262h62hlx1dlpl2.R.inc(7958);positions.add(position);
                    
                } }else {__CLR4_5_262h62hlx1dlpl2.R.inc(7959);if ((((type == MSG_EVENTS)&&(__CLR4_5_262h62hlx1dlpl2.R.iget(7960)!=0|true))||(__CLR4_5_262h62hlx1dlpl2.R.iget(7961)==0&false))) {{
                    
                    __CLR4_5_262h62hlx1dlpl2.R.inc(7962);buf.skipBytes(13);
                }
            }}}
            
            }__CLR4_5_262h62hlx1dlpl2.R.inc(7963);return positions;
        }

        }}}}__CLR4_5_262h62hlx1dlpl2.R.inc(7964);return null;
    }finally{__CLR4_5_262h62hlx1dlpl2.R.flushNeeded();}}

}
