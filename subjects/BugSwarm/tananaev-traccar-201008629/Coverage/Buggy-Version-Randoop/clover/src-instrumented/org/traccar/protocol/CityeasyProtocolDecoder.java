/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class CityeasyProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_274y74ylx1dwip5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,9291,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CityeasyProtocolDecoder(CityeasyProtocol protocol) {
        super(protocol);__CLR4_5_274y74ylx1dwip5.R.inc(9251);try{__CLR4_5_274y74ylx1dwip5.R.inc(9250);
    }finally{__CLR4_5_274y74ylx1dwip5.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .groupBegin()
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd),")             // time
            .number("([AV]),")                   // validity
            .number("(d+),")                     // satellites
            .number("([NS]),(d+.d+),")           // latitude
            .number("([EW]),(d+.d+),")           // longitude
            .number("(d+.d),")                   // speed
            .number("(d+.d),")                   // hdop
            .number("(d+.d)")                    // altitude
            .groupEnd("?").text(";")
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(d+),")                     // lac
            .number("(d+)")                      // cell
            .any()
            .compile();

    public static final int MSG_ADDRESS_REQUEST = 0x0001;
    public static final int MSG_STATUS = 0x0002;
    public static final int MSG_LOCATION_REPORT = 0x0003;
    public static final int MSG_LOCATION_REQUEST = 0x0004;
    public static final int MSG_LOCATION_INTERVAL = 0x0005;
    public static final int MSG_PHONE_NUMBER = 0x0006;
    public static final int MSG_MONITORING = 0x0007;
    public static final int MSG_TIMEZONE = 0x0008;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_274y74ylx1dwip5.R.inc(9252);

        __CLR4_5_274y74ylx1dwip5.R.inc(9253);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_274y74ylx1dwip5.R.inc(9254);buf.skipBytes(2); // header
        __CLR4_5_274y74ylx1dwip5.R.inc(9255);buf.readUnsignedShort(); // length

        __CLR4_5_274y74ylx1dwip5.R.inc(9256);String imei = ChannelBuffers.hexDump(buf.readBytes(7));
        __CLR4_5_274y74ylx1dwip5.R.inc(9257);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, imei, imei + Checksum.luhn(Long.parseLong(imei)));
        __CLR4_5_274y74ylx1dwip5.R.inc(9258);if ((((deviceSession == null)&&(__CLR4_5_274y74ylx1dwip5.R.iget(9259)!=0|true))||(__CLR4_5_274y74ylx1dwip5.R.iget(9260)==0&false))) {{
            __CLR4_5_274y74ylx1dwip5.R.inc(9261);return null;
        }

        }__CLR4_5_274y74ylx1dwip5.R.inc(9262);int type = buf.readUnsignedShort();

        __CLR4_5_274y74ylx1dwip5.R.inc(9263);if ((((type == MSG_LOCATION_REPORT || type == MSG_LOCATION_REQUEST)&&(__CLR4_5_274y74ylx1dwip5.R.iget(9264)!=0|true))||(__CLR4_5_274y74ylx1dwip5.R.iget(9265)==0&false))) {{

            __CLR4_5_274y74ylx1dwip5.R.inc(9266);String sentence = buf.toString(buf.readerIndex(), buf.readableBytes() - 8, StandardCharsets.US_ASCII);
            __CLR4_5_274y74ylx1dwip5.R.inc(9267);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_274y74ylx1dwip5.R.inc(9268);if ((((!parser.matches())&&(__CLR4_5_274y74ylx1dwip5.R.iget(9269)!=0|true))||(__CLR4_5_274y74ylx1dwip5.R.iget(9270)==0&false))) {{
                __CLR4_5_274y74ylx1dwip5.R.inc(9271);return null;
            }

            }__CLR4_5_274y74ylx1dwip5.R.inc(9272);Position position = new Position();
            __CLR4_5_274y74ylx1dwip5.R.inc(9273);position.setProtocol(getProtocolName());
            __CLR4_5_274y74ylx1dwip5.R.inc(9274);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_274y74ylx1dwip5.R.inc(9275);if ((((parser.hasNext(15))&&(__CLR4_5_274y74ylx1dwip5.R.iget(9276)!=0|true))||(__CLR4_5_274y74ylx1dwip5.R.iget(9277)==0&false))) {{

                __CLR4_5_274y74ylx1dwip5.R.inc(9278);DateBuilder dateBuilder = new DateBuilder()
                        .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                        .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
                __CLR4_5_274y74ylx1dwip5.R.inc(9279);position.setTime(dateBuilder.getDate());

                __CLR4_5_274y74ylx1dwip5.R.inc(9280);position.setValid(parser.next().equals("A"));
                __CLR4_5_274y74ylx1dwip5.R.inc(9281);position.set(Position.KEY_SATELLITES, parser.next());

                __CLR4_5_274y74ylx1dwip5.R.inc(9282);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
                __CLR4_5_274y74ylx1dwip5.R.inc(9283);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));

                __CLR4_5_274y74ylx1dwip5.R.inc(9284);position.setSpeed(parser.nextDouble());
                __CLR4_5_274y74ylx1dwip5.R.inc(9285);position.set(Position.KEY_HDOP, parser.nextDouble());
                __CLR4_5_274y74ylx1dwip5.R.inc(9286);position.setAltitude(parser.nextDouble());

            } }else {{

                __CLR4_5_274y74ylx1dwip5.R.inc(9287);getLastLocation(position, null);

            }

            }__CLR4_5_274y74ylx1dwip5.R.inc(9288);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(), parser.nextInt())));

            __CLR4_5_274y74ylx1dwip5.R.inc(9289);return position;
        }

        }__CLR4_5_274y74ylx1dwip5.R.inc(9290);return null;
    }finally{__CLR4_5_274y74ylx1dwip5.R.flushNeeded();}}

}
