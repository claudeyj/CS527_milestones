/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class PiligrimProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2e79e79lwye66np{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,18499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public PiligrimProtocolDecoder(PiligrimProtocol protocol) {
        super(protocol);__CLR4_5_2e79e79lwye66np.R.inc(18406);try{__CLR4_5_2e79e79lwye66np.R.inc(18405);
    }finally{__CLR4_5_2e79e79lwye66np.R.flushNeeded();}}

    private void sendResponse(Channel channel, String message) {try{__CLR4_5_2e79e79lwye66np.R.inc(18407);
        __CLR4_5_2e79e79lwye66np.R.inc(18408);if ((((channel != null)&&(__CLR4_5_2e79e79lwye66np.R.iget(18409)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18410)==0&false))) {{
            __CLR4_5_2e79e79lwye66np.R.inc(18411);HttpResponse response = new DefaultHttpResponse(
                    HttpVersion.HTTP_1_1, HttpResponseStatus.OK);
            __CLR4_5_2e79e79lwye66np.R.inc(18412);response.setContent(ChannelBuffers.copiedBuffer(
                    ByteOrder.BIG_ENDIAN, message, StandardCharsets.US_ASCII));
            __CLR4_5_2e79e79lwye66np.R.inc(18413);channel.write(response);
        }
    }}finally{__CLR4_5_2e79e79lwye66np.R.flushNeeded();}}

    public static final int MSG_GPS = 0xF1;
    public static final int MSG_GPS_SENSORS = 0xF2;
    public static final int MSG_EVENTS = 0xF3;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2e79e79lwye66np.R.inc(18414);

        __CLR4_5_2e79e79lwye66np.R.inc(18415);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2e79e79lwye66np.R.inc(18416);String uri = request.getUri();

        __CLR4_5_2e79e79lwye66np.R.inc(18417);if ((((uri.startsWith("/config"))&&(__CLR4_5_2e79e79lwye66np.R.iget(18418)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18419)==0&false))) {{

            __CLR4_5_2e79e79lwye66np.R.inc(18420);sendResponse(channel, "CONFIG: OK");

        } }else {__CLR4_5_2e79e79lwye66np.R.inc(18421);if ((((uri.startsWith("/addlog"))&&(__CLR4_5_2e79e79lwye66np.R.iget(18422)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18423)==0&false))) {{

            __CLR4_5_2e79e79lwye66np.R.inc(18424);sendResponse(channel, "ADDLOG: OK");

        } }else {__CLR4_5_2e79e79lwye66np.R.inc(18425);if ((((uri.startsWith("/inform"))&&(__CLR4_5_2e79e79lwye66np.R.iget(18426)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18427)==0&false))) {{

            __CLR4_5_2e79e79lwye66np.R.inc(18428);sendResponse(channel, "INFORM: OK");

        } }else {__CLR4_5_2e79e79lwye66np.R.inc(18429);if ((((uri.startsWith("/bingps"))&&(__CLR4_5_2e79e79lwye66np.R.iget(18430)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18431)==0&false))) {{

            __CLR4_5_2e79e79lwye66np.R.inc(18432);sendResponse(channel, "BINGPS: OK");

            __CLR4_5_2e79e79lwye66np.R.inc(18433);QueryStringDecoder decoder = new QueryStringDecoder(request.getUri());
            __CLR4_5_2e79e79lwye66np.R.inc(18434);DeviceSession deviceSession = getDeviceSession(
                    channel, remoteAddress, decoder.getParameters().get("imei").get(0));
            __CLR4_5_2e79e79lwye66np.R.inc(18435);if ((((deviceSession == null)&&(__CLR4_5_2e79e79lwye66np.R.iget(18436)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18437)==0&false))) {{
                __CLR4_5_2e79e79lwye66np.R.inc(18438);return null;
            }

            }__CLR4_5_2e79e79lwye66np.R.inc(18439);List<Position> positions = new LinkedList<>();
            __CLR4_5_2e79e79lwye66np.R.inc(18440);ChannelBuffer buf = request.getContent();

            __CLR4_5_2e79e79lwye66np.R.inc(18441);while ((((buf.readableBytes() > 2)&&(__CLR4_5_2e79e79lwye66np.R.iget(18442)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18443)==0&false))) {{

                __CLR4_5_2e79e79lwye66np.R.inc(18444);buf.readUnsignedByte(); // header
                __CLR4_5_2e79e79lwye66np.R.inc(18445);int type = buf.readUnsignedByte();
                __CLR4_5_2e79e79lwye66np.R.inc(18446);buf.readUnsignedByte(); // length

                __CLR4_5_2e79e79lwye66np.R.inc(18447);if ((((type == MSG_GPS || type == MSG_GPS_SENSORS)&&(__CLR4_5_2e79e79lwye66np.R.iget(18448)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18449)==0&false))) {{

                    __CLR4_5_2e79e79lwye66np.R.inc(18450);Position position = new Position();
                    __CLR4_5_2e79e79lwye66np.R.inc(18451);position.setProtocol(getProtocolName());
                    __CLR4_5_2e79e79lwye66np.R.inc(18452);position.setDeviceId(deviceSession.getDeviceId());

                    __CLR4_5_2e79e79lwye66np.R.inc(18453);DateBuilder dateBuilder = new DateBuilder()
                            .setDay(buf.readUnsignedByte())
                            .setMonth(buf.getByte(buf.readerIndex()) & 0x0f)
                            .setYear(2010 + (buf.readUnsignedByte() >> 4))
                            .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
                    __CLR4_5_2e79e79lwye66np.R.inc(18454);position.setTime(dateBuilder.getDate());

                    __CLR4_5_2e79e79lwye66np.R.inc(18455);double latitude = buf.readUnsignedByte();
                    __CLR4_5_2e79e79lwye66np.R.inc(18456);latitude += buf.readUnsignedByte() / 60.0;
                    __CLR4_5_2e79e79lwye66np.R.inc(18457);latitude += buf.readUnsignedByte() / 6000.0;
                    __CLR4_5_2e79e79lwye66np.R.inc(18458);latitude += buf.readUnsignedByte() / 600000.0;

                    __CLR4_5_2e79e79lwye66np.R.inc(18459);double longitude = buf.readUnsignedByte();
                    __CLR4_5_2e79e79lwye66np.R.inc(18460);longitude += buf.readUnsignedByte() / 60.0;
                    __CLR4_5_2e79e79lwye66np.R.inc(18461);longitude += buf.readUnsignedByte() / 6000.0;
                    __CLR4_5_2e79e79lwye66np.R.inc(18462);longitude += buf.readUnsignedByte() / 600000.0;

                    __CLR4_5_2e79e79lwye66np.R.inc(18463);int flags = buf.readUnsignedByte();
                    __CLR4_5_2e79e79lwye66np.R.inc(18464);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_2e79e79lwye66np.R.iget(18465)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18466)==0&false))) {{
                        __CLR4_5_2e79e79lwye66np.R.inc(18467);latitude = -latitude;
                    }
                    }__CLR4_5_2e79e79lwye66np.R.inc(18468);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2e79e79lwye66np.R.iget(18469)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18470)==0&false))) {{
                        __CLR4_5_2e79e79lwye66np.R.inc(18471);longitude = -longitude;
                    }
                    }__CLR4_5_2e79e79lwye66np.R.inc(18472);position.setLatitude(latitude);
                    __CLR4_5_2e79e79lwye66np.R.inc(18473);position.setLongitude(longitude);

                    __CLR4_5_2e79e79lwye66np.R.inc(18474);int satellites = buf.readUnsignedByte();
                    __CLR4_5_2e79e79lwye66np.R.inc(18475);position.set(Position.KEY_SATELLITES, satellites);
                    __CLR4_5_2e79e79lwye66np.R.inc(18476);position.setValid(satellites >= 3);

                    __CLR4_5_2e79e79lwye66np.R.inc(18477);position.setSpeed(buf.readUnsignedByte());

                    __CLR4_5_2e79e79lwye66np.R.inc(18478);double course = buf.readUnsignedByte() << 1;
                    __CLR4_5_2e79e79lwye66np.R.inc(18479);course += (flags >> 2) & 1;
                    __CLR4_5_2e79e79lwye66np.R.inc(18480);course += buf.readUnsignedByte() / 100.0;
                    __CLR4_5_2e79e79lwye66np.R.inc(18481);position.setCourse(course);

                    __CLR4_5_2e79e79lwye66np.R.inc(18482);if ((((type == MSG_GPS_SENSORS)&&(__CLR4_5_2e79e79lwye66np.R.iget(18483)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18484)==0&false))) {{
                        __CLR4_5_2e79e79lwye66np.R.inc(18485);double power = buf.readUnsignedByte();
                        __CLR4_5_2e79e79lwye66np.R.inc(18486);power += buf.readUnsignedByte() << 8;
                        __CLR4_5_2e79e79lwye66np.R.inc(18487);position.set(Position.KEY_POWER, power * 0.01);

                        __CLR4_5_2e79e79lwye66np.R.inc(18488);double battery = buf.readUnsignedByte();
                        __CLR4_5_2e79e79lwye66np.R.inc(18489);battery += buf.readUnsignedByte() << 8;
                        __CLR4_5_2e79e79lwye66np.R.inc(18490);position.set(Position.KEY_BATTERY, battery * 0.01);

                        __CLR4_5_2e79e79lwye66np.R.inc(18491);buf.skipBytes(6);
                    }

                    }__CLR4_5_2e79e79lwye66np.R.inc(18492);positions.add(position);

                } }else {__CLR4_5_2e79e79lwye66np.R.inc(18493);if ((((type == MSG_EVENTS)&&(__CLR4_5_2e79e79lwye66np.R.iget(18494)!=0|true))||(__CLR4_5_2e79e79lwye66np.R.iget(18495)==0&false))) {{

                    __CLR4_5_2e79e79lwye66np.R.inc(18496);buf.skipBytes(13);
                }
            }}}

            }__CLR4_5_2e79e79lwye66np.R.inc(18497);return positions;
        }

        }}}}__CLR4_5_2e79e79lwye66np.R.inc(18498);return null;
    }finally{__CLR4_5_2e79e79lwye66np.R.flushNeeded();}}

}
