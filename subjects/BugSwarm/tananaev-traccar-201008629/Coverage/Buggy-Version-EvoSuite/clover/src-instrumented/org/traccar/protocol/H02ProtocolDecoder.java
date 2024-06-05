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

@java.lang.SuppressWarnings({"fallthrough"}) public class H02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29d49d4lx1dvdy3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,12311,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public H02ProtocolDecoder(H02Protocol protocol) {
        super(protocol);__CLR4_5_29d49d4lx1dvdy3.R.inc(12137);try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12136);
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    private static double readCoordinate(ChannelBuffer buf, boolean lon) {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12138);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12139);int degrees = BcdUtil.readInteger(buf, 2);
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12140);if ((((lon)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12141)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12142)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12143);degrees = degrees * 10 + (buf.getUnsignedByte(buf.readerIndex()) >> 4);
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12144);double result = 0;
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12145);if ((((lon)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12146)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12147)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12148);result = buf.readUnsignedByte() & 0x0f;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12149);int length = 6;
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12150);if ((((lon)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12151)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12152)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12153);length = 5;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12154);result = result * 10 + BcdUtil.readInteger(buf, length) * 0.0001;

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12155);result /= 60;
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12156);result += degrees;

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12157);return result;
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    private void processStatus(Position position, long status) {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12158);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12159);if ((((!BitUtil.check(status, 0))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12160)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12161)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12162);position.set(Position.KEY_ALARM, Position.ALARM_VIBRATION);
        } }else {__CLR4_5_29d49d4lx1dvdy3.R.inc(12163);if ((((!BitUtil.check(status, 1))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12164)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12165)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12166);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        } }else {__CLR4_5_29d49d4lx1dvdy3.R.inc(12167);if ((((!BitUtil.check(status, 2))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12168)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12169)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12170);position.set(Position.KEY_ALARM, Position.ALARM_OVERSPEED);
        }

        }}}__CLR4_5_29d49d4lx1dvdy3.R.inc(12171);position.set(Position.KEY_IGNITION, !BitUtil.check(status, 10));
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12172);position.set(Position.KEY_STATUS, status);

    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    private String decodeBattery(int value) {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12173);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_29d49d4lx1dvdy3.R.inc(12174);switch (value) {
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12175);__CLB4_5_2_bool0=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12176);return "100%";
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12177);__CLB4_5_2_bool0=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12178);return "80%";
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12179);__CLB4_5_2_bool0=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12180);return "60%";
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12181);__CLB4_5_2_bool0=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12182);return "20%";
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12183);__CLB4_5_2_bool0=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12184);return "10%";
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12185);__CLB4_5_2_bool0=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12186);return null;
        }
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    private Position decodeBinary(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12187);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12188);Position position = new Position();
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12189);position.setProtocol(getProtocolName());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12190);buf.readByte(); // marker

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12191);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, ChannelBuffers.hexDump(buf.readBytes(5)));
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12192);if ((((deviceSession == null)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12193)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12194)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12195);return null;
        }
        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12196);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12197);DateBuilder dateBuilder = new DateBuilder()
                .setHour(BcdUtil.readInteger(buf, 2))
                .setMinute(BcdUtil.readInteger(buf, 2))
                .setSecond(BcdUtil.readInteger(buf, 2))
                .setDay(BcdUtil.readInteger(buf, 2))
                .setMonth(BcdUtil.readInteger(buf, 2))
                .setYear(BcdUtil.readInteger(buf, 2));
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12198);position.setTime(dateBuilder.getDate());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12199);double latitude = readCoordinate(buf, false);
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12200);position.set(Position.KEY_BATTERY, decodeBattery(buf.readUnsignedByte()));
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12201);double longitude = readCoordinate(buf, true);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12202);int flags = buf.readUnsignedByte() & 0x0f;
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12203);position.setValid((flags & 0x02) != 0);
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12204);if (((((flags & 0x04) == 0)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12205)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12206)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12207);latitude = -latitude;
        }
        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12208);if (((((flags & 0x08) == 0)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12209)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12210)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12211);longitude = -longitude;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12212);position.setLatitude(latitude);
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12213);position.setLongitude(longitude);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12214);position.setSpeed(BcdUtil.readInteger(buf, 3));
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12215);position.setCourse((buf.readUnsignedByte() & 0x0f) * 100.0 + BcdUtil.readInteger(buf, 2));

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12216);processStatus(position, buf.readUnsignedInt());
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12217);return position;
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*")
            .expression("..,")                   // manufacturer
            .number("(d+),")                     // imei
            .expression("[^,]+,")
            .any()
            .number("(?:(dd)(dd)(dd))?,")        // time
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
            .number("(?:(dd)(dd)(dd))?,")        // date (ddmmyy)
            .any()
            .number("(x{8})")                    // status
            .groupBegin()
            .number(", *(x+),")                  // mcc
            .number(" *(x+),")                   // mnc
            .number(" *(x+),")                   // lac
            .number(" *(x+)")                    // cid
            .groupEnd("?")
            .any()
            .compile();

    private static final Pattern PATTERN_NBR = new PatternBuilder()
            .text("*")
            .expression("..,")                   // manufacturer
            .number("(d+),")                     // imei
            .text("NBR,")
            .number("(dd)(dd)(dd),")             // time
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("d+,")                       // gsm delay time
            .number("d+,")                       // count
            .number("((?:d+,d+,d+,)+)")          // cells
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(x{8})")                    // status
            .any()
            .compile();

    private Position decodeText(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12218);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12219);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12220);if ((((!parser.matches())&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12221)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12222)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12223);return null;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12224);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12225);if ((((deviceSession == null)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12226)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12227)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12228);return null;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12229);Position position = new Position();
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12230);position.setProtocol(getProtocolName());
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12231);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12232);DateBuilder dateBuilder = new DateBuilder();
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12233);if ((((parser.hasNext(3))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12234)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12235)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12236);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12237);if ((((parser.hasNext())&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12238)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12239)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12240);position.setValid(parser.next().equals("A"));
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12241);if ((((parser.hasNext(2))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12242)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12243)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12244);position.setLatitude(-parser.nextCoordinate());
        }
        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12245);if ((((parser.hasNext(2))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12246)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12247)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12248);position.setLatitude(parser.nextCoordinate());
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12249);if ((((parser.hasNext(2))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12250)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12251)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12252);position.setLongitude(-parser.nextCoordinate());
        }
        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12253);if ((((parser.hasNext(2))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12254)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12255)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12256);position.setLongitude(parser.nextCoordinate());
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12257);position.setSpeed(parser.nextDouble());
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12258);position.setCourse(parser.nextDouble());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12259);if ((((parser.hasNext(3))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12260)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12261)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12262);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12263);position.setTime(dateBuilder.getDate());
        } }else {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12264);position.setTime(new Date());
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12265);processStatus(position, parser.nextLong(16));

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12266);return position;
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    private Position decodeLbs(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12267);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12268);Parser parser = new Parser(PATTERN_NBR, sentence);
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12269);if ((((!parser.matches())&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12270)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12271)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12272);return null;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12273);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12274);if ((((deviceSession == null)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12275)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12276)==0&false))) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12277);return null;
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12278);Position position = new Position();
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12279);position.setProtocol(getProtocolName());
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12280);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12281);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12282);Network network = new Network();
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12283);int mcc = parser.nextInt();
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12284);int mnc = parser.nextInt();

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12285);String[] cells = parser.next().split(",");
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12286);for (int i = 0; (((i < cells.length / 3)&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12287)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12288)==0&false)); i++) {{
            __CLR4_5_29d49d4lx1dvdy3.R.inc(12289);network.addCellTower(CellTower.from(mcc, mnc, Integer.parseInt(cells[i * 3]),
                    Integer.parseInt(cells[i * 3 + 1]), Integer.parseInt(cells[i * 3 + 2])));
        }

        }__CLR4_5_29d49d4lx1dvdy3.R.inc(12290);position.setNetwork(network);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12291);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12292);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12293);processStatus(position, parser.nextLong(16));

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12294);return position;
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29d49d4lx1dvdy3.R.inc(12295);

        __CLR4_5_29d49d4lx1dvdy3.R.inc(12296);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_29d49d4lx1dvdy3.R.inc(12297);String marker = buf.toString(0, 1, StandardCharsets.US_ASCII);

        boolean __CLB4_5_2_bool1=false;__CLR4_5_29d49d4lx1dvdy3.R.inc(12298);switch (marker) {
            case "*":if (!__CLB4_5_2_bool1) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12299);__CLB4_5_2_bool1=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12300);String sentence = buf.toString(StandardCharsets.US_ASCII);
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12301);if ((((sentence.contains(",NBR,"))&&(__CLR4_5_29d49d4lx1dvdy3.R.iget(12302)!=0|true))||(__CLR4_5_29d49d4lx1dvdy3.R.iget(12303)==0&false))) {{
                    __CLR4_5_29d49d4lx1dvdy3.R.inc(12304);return decodeLbs(sentence, channel, remoteAddress);
                } }else {{
                    __CLR4_5_29d49d4lx1dvdy3.R.inc(12305);return decodeText(sentence, channel, remoteAddress);
                }
            }case "$":if (!__CLB4_5_2_bool1) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12306);__CLB4_5_2_bool1=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12307);return decodeBinary(buf, channel, remoteAddress);
            case "X":if (!__CLB4_5_2_bool1) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12308);__CLB4_5_2_bool1=true;}
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_29d49d4lx1dvdy3.R.inc(12309);__CLB4_5_2_bool1=true;}
                __CLR4_5_29d49d4lx1dvdy3.R.inc(12310);return null;
        }
    }finally{__CLR4_5_29d49d4lx1dvdy3.R.flushNeeded();}}

}
