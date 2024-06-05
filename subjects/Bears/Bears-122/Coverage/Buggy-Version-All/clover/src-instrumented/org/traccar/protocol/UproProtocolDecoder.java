/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class UproProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2hfkhfklwydzr2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,22695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public UproProtocolDecoder(UproProtocol protocol) {
        super(protocol);__CLR4_5_2hfkhfklwydzr2e.R.inc(22593);try{__CLR4_5_2hfkhfklwydzr2e.R.inc(22592);
    }finally{__CLR4_5_2hfkhfklwydzr2e.R.flushNeeded();}}

    private static final Pattern PATTERN_HEADER = new PatternBuilder()
            .text("*")
            .expression("..20")
            .expression("([01])")                // ack
            .number("(d+),")                     // device id
            .expression("(.)")                   // type
            .expression("(.)")                   // subtype
            .any()
            .compile();

    private static final Pattern PATTERN_LOCATION = new PatternBuilder()
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .number("(dd)(dd)(dddd)")            // latitude
            .number("(ddd)(dd)(dddd)")           // longitude
            .number("(d)")                       // flags
            .number("(dd)")                      // speed
            .number("(dd)")                      // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .compile();

    private void decodeLocation(Position position, String data) {try{__CLR4_5_2hfkhfklwydzr2e.R.inc(22594);
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22595);Parser parser = new Parser(PATTERN_LOCATION, data);
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22596);if ((((parser.matches())&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22597)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22598)==0&false))) {{

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22599);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22600);position.setValid(true);
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22601);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22602);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22603);int flags = parser.nextInt(0);
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22604);position.setValid(BitUtil.check(flags, 0));
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22605);if ((((!BitUtil.check(flags, 1))&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22606)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22607)==0&false))) {{
                __CLR4_5_2hfkhfklwydzr2e.R.inc(22608);position.setLatitude(-position.getLatitude());
            }
            }__CLR4_5_2hfkhfklwydzr2e.R.inc(22609);if ((((!BitUtil.check(flags, 2))&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22610)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22611)==0&false))) {{
                __CLR4_5_2hfkhfklwydzr2e.R.inc(22612);position.setLongitude(-position.getLongitude());
            }

            }__CLR4_5_2hfkhfklwydzr2e.R.inc(22613);position.setSpeed(parser.nextInt(0) * 2);
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22614);position.setCourse(parser.nextInt(0) * 10);

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22615);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22616);position.setTime(dateBuilder.getDate());

        }
    }}finally{__CLR4_5_2hfkhfklwydzr2e.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2hfkhfklwydzr2e.R.inc(22617);

        __CLR4_5_2hfkhfklwydzr2e.R.inc(22618);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2hfkhfklwydzr2e.R.inc(22619);if ((((buf.getByte(buf.readerIndex()) != '*')&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22620)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22621)==0&false))) {{
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22622);throw new ParseException(null, 0);
        }

        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22623);int headerIndex = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '&');
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22624);if ((((headerIndex < 0)&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22625)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22626)==0&false))) {{
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22627);headerIndex = buf.writerIndex();
        }
        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22628);String header = buf.readBytes(headerIndex - buf.readerIndex()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2hfkhfklwydzr2e.R.inc(22629);Parser parser = new Parser(PATTERN_HEADER, header);
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22630);if ((((!parser.matches())&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22631)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22632)==0&false))) {{
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22633);return null;
        }

        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22634);boolean reply = parser.next().equals("1");

        __CLR4_5_2hfkhfklwydzr2e.R.inc(22635);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22636);if ((((deviceSession == null)&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22637)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22638)==0&false))) {{
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22639);return null;
        }

        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22640);Position position = new Position();
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22641);position.setProtocol(getProtocolName());
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22642);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2hfkhfklwydzr2e.R.inc(22643);String type = parser.next();
        __CLR4_5_2hfkhfklwydzr2e.R.inc(22644);String subtype = parser.next();

        __CLR4_5_2hfkhfklwydzr2e.R.inc(22645);if ((((reply && channel != null)&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22646)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22647)==0&false))) {{
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22648);channel.write("*MG20Y" + type + subtype + "#");
        }

        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22649);while ((((buf.readable())&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22650)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22651)==0&false))) {{

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22652);buf.readByte(); // skip delimiter

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22653);byte dataType = buf.readByte();

            __CLR4_5_2hfkhfklwydzr2e.R.inc(22654);int delimiterIndex = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '&');
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22655);if ((((delimiterIndex < 0)&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22656)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22657)==0&false))) {{
                __CLR4_5_2hfkhfklwydzr2e.R.inc(22658);delimiterIndex = buf.writerIndex();
            }

            }__CLR4_5_2hfkhfklwydzr2e.R.inc(22659);ChannelBuffer data = buf.readBytes(delimiterIndex - buf.readerIndex());

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2hfkhfklwydzr2e.R.inc(22660);switch (dataType) {
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22661);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22662);decodeLocation(position, data.toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22663);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22664);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22665);position.set(Position.KEY_STATUS, data.toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22666);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22667);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22668);long odometer = 0;
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22669);while ((((data.readable())&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22670)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22671)==0&false))) {{
                        __CLR4_5_2hfkhfklwydzr2e.R.inc(22672);odometer <<= 4;
                        __CLR4_5_2hfkhfklwydzr2e.R.inc(22673);odometer += data.readByte() - (byte) '0';
                    }
                    }__CLR4_5_2hfkhfklwydzr2e.R.inc(22674);position.set(Position.KEY_ODOMETER, odometer * 2 * 1852 / 3600);
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22675);break;
                case 'P':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22676);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22677);position.setNetwork(new Network(CellTower.from(
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII)),
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII)),
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII), 16),
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII), 16))));
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22678);break;
                case 'Q':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22679);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22680);position.set("obd-pid", ChannelBuffers.hexDump(data));
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22681);break;
                case 'R':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22682);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22683);position.set("odb-travel", ChannelBuffers.hexDump(data));
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22684);break;
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22685);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22686);position.set("obd-traffic", ChannelBuffers.hexDump(data));
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22687);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2hfkhfklwydzr2e.R.inc(22688);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2hfkhfklwydzr2e.R.inc(22689);break;
            }

        }

        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22690);if ((((position.getLatitude() != 0 && position.getLongitude() != 0)&&(__CLR4_5_2hfkhfklwydzr2e.R.iget(22691)!=0|true))||(__CLR4_5_2hfkhfklwydzr2e.R.iget(22692)==0&false))) {{
            __CLR4_5_2hfkhfklwydzr2e.R.inc(22693);return position;
        }

        }__CLR4_5_2hfkhfklwydzr2e.R.inc(22694);return null;
    }finally{__CLR4_5_2hfkhfklwydzr2e.R.flushNeeded();}}

}
