/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class H02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2b1vb1vlwye65xb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,14550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public H02ProtocolDecoder(H02Protocol protocol) {
        super(protocol);__CLR4_5_2b1vb1vlwye65xb.R.inc(14324);try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14323);
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private static double readCoordinate(ChannelBuffer buf, boolean lon) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14325);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14326);int degrees = BcdUtil.readInteger(buf, 2);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14327);if ((((lon)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14328)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14329)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14330);degrees = degrees * 10 + (buf.getUnsignedByte(buf.readerIndex()) >> 4);
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14331);double result = 0;
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14332);if ((((lon)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14333)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14334)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14335);result = buf.readUnsignedByte() & 0x0f;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14336);int length = 6;
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14337);if ((((lon)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14338)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14339)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14340);length = 5;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14341);result = result * 10 + BcdUtil.readInteger(buf, length) * 0.0001;

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14342);result /= 60;
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14343);result += degrees;

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14344);return result;
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private void processStatus(Position position, long status) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14345);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14346);if ((((!BitUtil.check(status, 0))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14347)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14348)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14349);position.set(Position.KEY_ALARM, Position.ALARM_VIBRATION);
        } }else {__CLR4_5_2b1vb1vlwye65xb.R.inc(14350);if ((((!BitUtil.check(status, 1))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14351)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14352)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14353);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        } }else {__CLR4_5_2b1vb1vlwye65xb.R.inc(14354);if ((((!BitUtil.check(status, 2))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14355)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14356)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14357);position.set(Position.KEY_ALARM, Position.ALARM_OVERSPEED);
        } }else {__CLR4_5_2b1vb1vlwye65xb.R.inc(14358);if ((((!BitUtil.check(status, 19))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14359)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14360)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14361);position.set(Position.KEY_ALARM, Position.ALARM_POWER_CUT);
        }

        }}}}__CLR4_5_2b1vb1vlwye65xb.R.inc(14362);position.set(Position.KEY_IGNITION, BitUtil.check(status, 10));
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14363);position.set(Position.KEY_STATUS, status);

    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private Integer decodeBattery(int value) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14364);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2b1vb1vlwye65xb.R.inc(14365);switch (value) {
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14366);__CLB4_5_2_bool0=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14367);return 100;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14368);__CLB4_5_2_bool0=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14369);return 80;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14370);__CLB4_5_2_bool0=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14371);return 60;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14372);__CLB4_5_2_bool0=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14373);return 20;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14374);__CLB4_5_2_bool0=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14375);return 10;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14376);__CLB4_5_2_bool0=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14377);return null;
        }
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private Position decodeBinary(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14378);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14379);Position position = new Position();
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14380);position.setProtocol(getProtocolName());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14381);buf.readByte(); // marker

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14382);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, ChannelBuffers.hexDump(buf.readBytes(5)));
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14383);if ((((deviceSession == null)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14384)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14385)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14386);return null;
        }
        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14387);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14388);DateBuilder dateBuilder = new DateBuilder()
                .setHour(BcdUtil.readInteger(buf, 2))
                .setMinute(BcdUtil.readInteger(buf, 2))
                .setSecond(BcdUtil.readInteger(buf, 2))
                .setDay(BcdUtil.readInteger(buf, 2))
                .setMonth(BcdUtil.readInteger(buf, 2))
                .setYear(BcdUtil.readInteger(buf, 2));
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14389);position.setTime(dateBuilder.getDate());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14390);double latitude = readCoordinate(buf, false);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14391);position.set(Position.KEY_BATTERY_LEVEL, decodeBattery(buf.readUnsignedByte()));
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14392);double longitude = readCoordinate(buf, true);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14393);int flags = buf.readUnsignedByte() & 0x0f;
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14394);position.setValid((flags & 0x02) != 0);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14395);if (((((flags & 0x04) == 0)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14396)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14397)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14398);latitude = -latitude;
        }
        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14399);if (((((flags & 0x08) == 0)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14400)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14401)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14402);longitude = -longitude;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14403);position.setLatitude(latitude);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14404);position.setLongitude(longitude);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14405);position.setSpeed(BcdUtil.readInteger(buf, 3));
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14406);position.setCourse((buf.readUnsignedByte() & 0x0f) * 100.0 + BcdUtil.readInteger(buf, 2));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14407);processStatus(position, buf.readUnsignedInt());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14408);return position;
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*")
            .expression("..,")                   // manufacturer
            .number("(d+),")                     // imei
            .expression("[^,]+,")
            .any()
            .number("(?:(dd)(dd)(dd))?,")        // time (hhmmss)
            .expression("([AV])?,")              // validity
            .groupBegin()
            .number("-(d+)-(d+.d+),")            // latitude
            .or()
            .number("(d+)(dd.d+),")              // latitude
            .groupEnd()
            .expression("([NS]),")
            .groupBegin()
            .number("-(d+)-(d+.d+),")            // longitude
            .or()
            .number("(d+)(dd.d+),")              // longitude
            .groupEnd()
            .expression("([EW]),")
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*)?,")                // course
            .number("(?:(dd)(dd)(dd))?")         // date (ddmmyy)
            .any()
            .number(",(x{8})")                   // status
            .groupBegin()
            .number(",(d+),")                    // odometer
            .number("(-?d+),")                   // temperature
            .number("(d+.d+),")                  // fuel
            .number("(-?d+),")                   // altitude
            .number("(x+),")                     // lac
            .number("(x+)#")                     // cid
            .or()
            .number(",(d+),")
            .number("(d+),")
            .number("(d+),")
            .number("(d+)#")
            .or()
            .expression(",.*")
            .or()
            .text("#")
            .groupEnd()
            .compile();

    private static final Pattern PATTERN_NBR = new PatternBuilder()
            .text("*")
            .expression("..,")                   // manufacturer
            .number("(d+),")                     // imei
            .text("NBR,")
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("d+,")                       // gsm delay time
            .number("d+,")                       // count
            .number("((?:d+,d+,d+,)+)")          // cells
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(x{8})")                    // status
            .any()
            .compile();

    private static final Pattern PATTERN_LINK = new PatternBuilder()
            .text("*")
            .expression("..,")                   // manufacturer
            .number("(d+),")                     // imei
            .text("LINK,")
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d+),")                     // rssi
            .number("(d+),")                     // satellites
            .number("(d+),")                     // battery
            .number("(d+),")                     // steps
            .number("(d+),")                     // turnovers
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(x{8})")                    // status
            .any()
            .compile();

    private Position decodeText(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14409);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14410);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14411);if ((((!parser.matches())&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14412)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14413)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14414);return null;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14415);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14416);if ((((deviceSession == null)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14417)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14418)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14419);return null;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14420);Position position = new Position();
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14421);position.setProtocol(getProtocolName());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14422);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14423);DateBuilder dateBuilder = new DateBuilder();
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14424);if ((((parser.hasNext(3))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14425)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14426)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14427);dateBuilder.setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14428);if ((((parser.hasNext())&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14429)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14430)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14431);position.setValid(parser.next().equals("A"));
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14432);if ((((parser.hasNext(2))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14433)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14434)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14435);position.setLatitude(-parser.nextCoordinate());
        }
        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14436);if ((((parser.hasNext(2))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14437)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14438)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14439);position.setLatitude(parser.nextCoordinate());
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14440);if ((((parser.hasNext(2))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14441)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14442)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14443);position.setLongitude(-parser.nextCoordinate());
        }
        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14444);if ((((parser.hasNext(2))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14445)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14446)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14447);position.setLongitude(parser.nextCoordinate());
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14448);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14449);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14450);if ((((parser.hasNext(3))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14451)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14452)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14453);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14454);position.setTime(dateBuilder.getDate());
        } }else {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14455);position.setTime(new Date());
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14456);processStatus(position, parser.nextLong(16, 0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14457);if ((((parser.hasNext(6))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14458)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14459)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14460);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14461);position.set(Position.PREFIX_TEMP + 1, parser.nextInt(0));
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14462);position.set(Position.KEY_FUEL_LEVEL, parser.nextDouble(0));

            __CLR4_5_2b1vb1vlwye65xb.R.inc(14463);position.setAltitude(parser.nextInt(0));

            __CLR4_5_2b1vb1vlwye65xb.R.inc(14464);position.setNetwork(new Network(CellTower.fromLacCid(parser.nextHexInt(0), parser.nextHexInt(0))));
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14465);if ((((parser.hasNext(4))&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14466)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14467)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14468);for (int i = 1; (((i <= 4)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14469)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14470)==0&false)); i++) {{
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14471);position.set(Position.PREFIX_IO + i, parser.nextInt(0));
            }
        }}

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14472);return position;
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private Position decodeLbs(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14473);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14474);Parser parser = new Parser(PATTERN_NBR, sentence);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14475);if ((((!parser.matches())&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14476)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14477)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14478);return null;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14479);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14480);if ((((deviceSession == null)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14481)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14482)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14483);return null;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14484);Position position = new Position();
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14485);position.setProtocol(getProtocolName());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14486);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14487);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14488);Network network = new Network();
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14489);int mcc = parser.nextInt(0);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14490);int mnc = parser.nextInt(0);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14491);String[] cells = parser.next().split(",");
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14492);for (int i = 0; (((i < cells.length / 3)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14493)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14494)==0&false)); i++) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14495);network.addCellTower(CellTower.from(mcc, mnc, Integer.parseInt(cells[i * 3]),
                    Integer.parseInt(cells[i * 3 + 1]), Integer.parseInt(cells[i * 3 + 2])));
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14496);position.setNetwork(network);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14497);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14498);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14499);processStatus(position, parser.nextLong(16, 0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14500);return position;
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    private Position decodeLink(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14501);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14502);Parser parser = new Parser(PATTERN_LINK, sentence);
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14503);if ((((!parser.matches())&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14504)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14505)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14506);return null;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14507);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14508);if ((((deviceSession == null)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14509)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14510)==0&false))) {{
            __CLR4_5_2b1vb1vlwye65xb.R.inc(14511);return null;
        }

        }__CLR4_5_2b1vb1vlwye65xb.R.inc(14512);Position position = new Position();
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14513);position.setProtocol(getProtocolName());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14514);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14515);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14516);position.set(Position.KEY_RSSI, parser.nextInt());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14517);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14518);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14519);position.set("steps", parser.nextInt());
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14520);position.set("turnovers", parser.nextInt());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14521);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14522);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14523);processStatus(position, parser.nextLong(16, 0));

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14524);return position;
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2b1vb1vlwye65xb.R.inc(14525);

        __CLR4_5_2b1vb1vlwye65xb.R.inc(14526);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2b1vb1vlwye65xb.R.inc(14527);String marker = buf.toString(0, 1, StandardCharsets.US_ASCII);

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2b1vb1vlwye65xb.R.inc(14528);switch (marker) {
            case "*":if (!__CLB4_5_2_bool1) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14529);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14530);String sentence = buf.toString(StandardCharsets.US_ASCII);
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14531);int typeStart = sentence.indexOf(',', sentence.indexOf(',') + 1) + 1;
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14532);int typeEnd = sentence.indexOf(',', typeStart);
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14533);if ((((typeEnd > 0)&&(__CLR4_5_2b1vb1vlwye65xb.R.iget(14534)!=0|true))||(__CLR4_5_2b1vb1vlwye65xb.R.iget(14535)==0&false))) {{
                    __CLR4_5_2b1vb1vlwye65xb.R.inc(14536);String type = sentence.substring(typeStart, typeEnd);
                    boolean __CLB4_5_2_bool2=false;__CLR4_5_2b1vb1vlwye65xb.R.inc(14537);switch (type) {
                        case "NBR":if (!__CLB4_5_2_bool2) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14538);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2b1vb1vlwye65xb.R.inc(14539);return decodeLbs(sentence, channel, remoteAddress);
                        case "LINK":if (!__CLB4_5_2_bool2) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14540);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2b1vb1vlwye65xb.R.inc(14541);return decodeLink(sentence, channel, remoteAddress);
                        default:if (!__CLB4_5_2_bool2) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14542);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2b1vb1vlwye65xb.R.inc(14543);return decodeText(sentence, channel, remoteAddress);
                    }
                } }else {{
                    __CLR4_5_2b1vb1vlwye65xb.R.inc(14544);return null;
                }
            }case "$":if (!__CLB4_5_2_bool1) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14545);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14546);return decodeBinary(buf, channel, remoteAddress);
            case "X":if (!__CLB4_5_2_bool1) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14547);__CLB4_5_2_bool1=true;}
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2b1vb1vlwye65xb.R.inc(14548);__CLB4_5_2_bool1=true;}
                __CLR4_5_2b1vb1vlwye65xb.R.inc(14549);return null;
        }
    }finally{__CLR4_5_2b1vb1vlwye65xb.R.flushNeeded();}}

}
