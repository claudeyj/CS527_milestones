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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class Tk102ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dwadwalx1dzbwv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,18073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk102ProtocolDecoder(Tk102Protocol protocol) {
        super(protocol);__CLR4_5_2dwadwalx1dzbwv.R.inc(18011);try{__CLR4_5_2dwadwalx1dzbwv.R.inc(18010);
    }finally{__CLR4_5_2dwadwalx1dzbwv.R.flushNeeded();}}

    public static final int MSG_LOGIN_REQUEST = 0x80;
    public static final int MSG_LOGIN_REQUEST_2 = 0x21;
    public static final int MSG_LOGIN_RESPONSE = 0x00;
    public static final int MSG_HEARTBEAT_REQUEST = 0xF0;
    public static final int MSG_HEARTBEAT_RESPONSE = 0xFF;
    public static final int MSG_REPORT_ONCE = 0x90;
    public static final int MSG_REPORT_INTERVAL = 0x93;

    public static final int MODE_GPRS = 0x30;
    public static final int MODE_GPRS_SMS = 0x33;

    private static final Pattern PATTERN = new PatternBuilder()
            .text("(")
            .expression("[A-Z]+")
            .number("(dd)(dd)(dd)")              // time
            .expression("([AV])")                // validity
            .number("(dd)(dd.dddd)([NS])")       // latitude
            .number("(ddd)(dd.dddd)([EW])")      // longitude
            .number("(ddd.ddd)")                 // speed
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .text(")")
            .compile();

    private void sendResponse(Channel channel, int type, ChannelBuffer dataSequence, ChannelBuffer content) {try{__CLR4_5_2dwadwalx1dzbwv.R.inc(18012);
        __CLR4_5_2dwadwalx1dzbwv.R.inc(18013);if ((((channel != null)&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18014)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18015)==0&false))) {{
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18016);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18017);response.writeByte('[');
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18018);response.writeByte(type);
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18019);response.writeBytes(dataSequence);
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18020);response.writeByte(content.readableBytes());
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18021);response.writeBytes(content);
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18022);response.writeByte(']');
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18023);channel.write(response);
        }
    }}finally{__CLR4_5_2dwadwalx1dzbwv.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dwadwalx1dzbwv.R.inc(18024);

        __CLR4_5_2dwadwalx1dzbwv.R.inc(18025);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2dwadwalx1dzbwv.R.inc(18026);buf.skipBytes(1); // header
        __CLR4_5_2dwadwalx1dzbwv.R.inc(18027);int type = buf.readUnsignedByte();
        __CLR4_5_2dwadwalx1dzbwv.R.inc(18028);ChannelBuffer dataSequence = buf.readBytes(10);
        __CLR4_5_2dwadwalx1dzbwv.R.inc(18029);int length = buf.readUnsignedByte();

        __CLR4_5_2dwadwalx1dzbwv.R.inc(18030);if ((((type == MSG_LOGIN_REQUEST || type == MSG_LOGIN_REQUEST_2)&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18031)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18032)==0&false))) {{

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18033);ChannelBuffer data = buf.readBytes(length);

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18034);String id;
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18035);if ((((type == MSG_LOGIN_REQUEST)&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18036)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18037)==0&false))) {{
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18038);id =  data.toString(StandardCharsets.US_ASCII);
            } }else {{
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18039);id = data.copy(1, 15).toString(StandardCharsets.US_ASCII);
            }

            }__CLR4_5_2dwadwalx1dzbwv.R.inc(18040);if ((((getDeviceSession(channel, remoteAddress, id) != null)&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18041)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18042)==0&false))) {{
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18043);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18044);response.writeByte(MODE_GPRS);
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18045);response.writeBytes(data);
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18046);sendResponse(channel, MSG_LOGIN_RESPONSE, dataSequence, response);
            }

        }} }else {__CLR4_5_2dwadwalx1dzbwv.R.inc(18047);if ((((type == MSG_HEARTBEAT_REQUEST)&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18048)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18049)==0&false))) {{

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18050);sendResponse(channel, MSG_HEARTBEAT_RESPONSE, dataSequence, buf.readBytes(length));

        } }else {{

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18051);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18052);if ((((deviceSession == null)&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18053)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18054)==0&false))) {{
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18055);return null;
            }

            }__CLR4_5_2dwadwalx1dzbwv.R.inc(18056);Parser parser = new Parser(PATTERN, buf.readBytes(length).toString(StandardCharsets.US_ASCII));
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18057);if ((((!parser.matches())&&(__CLR4_5_2dwadwalx1dzbwv.R.iget(18058)!=0|true))||(__CLR4_5_2dwadwalx1dzbwv.R.iget(18059)==0&false))) {{
                __CLR4_5_2dwadwalx1dzbwv.R.inc(18060);return null;
            }

            }__CLR4_5_2dwadwalx1dzbwv.R.inc(18061);Position position = new Position();
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18062);position.setProtocol(getProtocolName());
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18063);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18064);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18065);position.setValid(parser.next().equals("A"));
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18066);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18067);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18068);position.setSpeed(parser.nextDouble());

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18069);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2dwadwalx1dzbwv.R.inc(18070);position.setTime(dateBuilder.getDate());

            __CLR4_5_2dwadwalx1dzbwv.R.inc(18071);return position;

        }

        }}__CLR4_5_2dwadwalx1dzbwv.R.inc(18072);return null;
    }finally{__CLR4_5_2dwadwalx1dzbwv.R.flushNeeded();}}

}
