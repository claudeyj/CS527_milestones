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

@java.lang.SuppressWarnings({"fallthrough"}) public class UproProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2f4af4alx1e1mgt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,19697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public UproProtocolDecoder(UproProtocol protocol) {
        super(protocol);__CLR4_5_2f4af4alx1e1mgt.R.inc(19595);try{__CLR4_5_2f4af4alx1e1mgt.R.inc(19594);
    }finally{__CLR4_5_2f4af4alx1e1mgt.R.flushNeeded();}}

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
            .number("(dd)(dd)(dd)")              // time
            .number("(dd)(dd)(dddd)")            // latitude
            .number("(ddd)(dd)(dddd)")           // longitude
            .number("(d)")                       // flags
            .number("(dd)")                      // speed
            .number("(dd)")                      // course
            .number("(dd)(dd)(dd)")              // date
            .compile();

    private void decodeLocation(Position position, String data) {try{__CLR4_5_2f4af4alx1e1mgt.R.inc(19596);
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19597);Parser parser = new Parser(PATTERN_LOCATION, data);
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19598);if ((((parser.matches())&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19599)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19600)==0&false))) {{

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19601);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19602);position.setValid(true);
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19603);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19604);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19605);int flags = parser.nextInt();
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19606);position.setValid(BitUtil.check(flags, 0));
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19607);if ((((!BitUtil.check(flags, 1))&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19608)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19609)==0&false))) {{
                __CLR4_5_2f4af4alx1e1mgt.R.inc(19610);position.setLatitude(-position.getLatitude());
            }
            }__CLR4_5_2f4af4alx1e1mgt.R.inc(19611);if ((((!BitUtil.check(flags, 2))&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19612)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19613)==0&false))) {{
                __CLR4_5_2f4af4alx1e1mgt.R.inc(19614);position.setLongitude(-position.getLongitude());
            }

            }__CLR4_5_2f4af4alx1e1mgt.R.inc(19615);position.setSpeed(parser.nextInt() * 2);
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19616);position.setCourse(parser.nextInt() * 10);

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19617);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19618);position.setTime(dateBuilder.getDate());

        }
    }}finally{__CLR4_5_2f4af4alx1e1mgt.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2f4af4alx1e1mgt.R.inc(19619);

        __CLR4_5_2f4af4alx1e1mgt.R.inc(19620);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2f4af4alx1e1mgt.R.inc(19621);if ((((buf.getByte(buf.readerIndex()) != '*')&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19622)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19623)==0&false))) {{
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19624);throw new ParseException(null, 0);
        }

        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19625);int headerIndex = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '&');
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19626);if ((((headerIndex < 0)&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19627)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19628)==0&false))) {{
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19629);headerIndex = buf.writerIndex();
        }
        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19630);String header = buf.readBytes(headerIndex - buf.readerIndex()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2f4af4alx1e1mgt.R.inc(19631);Parser parser = new Parser(PATTERN_HEADER, header);
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19632);if ((((!parser.matches())&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19633)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19634)==0&false))) {{
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19635);return null;
        }

        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19636);boolean reply = parser.next().equals("1");

        __CLR4_5_2f4af4alx1e1mgt.R.inc(19637);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19638);if ((((deviceSession == null)&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19639)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19640)==0&false))) {{
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19641);return null;
        }

        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19642);Position position = new Position();
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19643);position.setProtocol(getProtocolName());
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19644);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2f4af4alx1e1mgt.R.inc(19645);String type = parser.next();
        __CLR4_5_2f4af4alx1e1mgt.R.inc(19646);String subtype = parser.next();

        __CLR4_5_2f4af4alx1e1mgt.R.inc(19647);if ((((reply && channel != null)&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19648)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19649)==0&false))) {{
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19650);channel.write("*MG20Y" + type + subtype + "#");
        }

        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19651);while ((((buf.readable())&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19652)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19653)==0&false))) {{

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19654);buf.readByte(); // skip delimiter

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19655);byte dataType = buf.readByte();

            __CLR4_5_2f4af4alx1e1mgt.R.inc(19656);int delimiterIndex = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '&');
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19657);if ((((delimiterIndex < 0)&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19658)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19659)==0&false))) {{
                __CLR4_5_2f4af4alx1e1mgt.R.inc(19660);delimiterIndex = buf.writerIndex();
            }

            }__CLR4_5_2f4af4alx1e1mgt.R.inc(19661);ChannelBuffer data = buf.readBytes(delimiterIndex - buf.readerIndex());

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2f4af4alx1e1mgt.R.inc(19662);switch (dataType) {
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19663);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19664);decodeLocation(position, data.toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19665);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19666);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19667);position.set(Position.KEY_STATUS, data.toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19668);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19669);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19670);long odometer = 0;
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19671);while ((((data.readable())&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19672)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19673)==0&false))) {{
                        __CLR4_5_2f4af4alx1e1mgt.R.inc(19674);odometer <<= 4;
                        __CLR4_5_2f4af4alx1e1mgt.R.inc(19675);odometer += data.readByte() - (byte) '0';
                    }
                    }__CLR4_5_2f4af4alx1e1mgt.R.inc(19676);position.set(Position.KEY_ODOMETER, odometer * 2 * 1852 / 3600);
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19677);break;
                case 'P':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19678);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19679);position.setNetwork(new Network(CellTower.from(
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII)),
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII)),
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII), 16),
                            Integer.parseInt(data.readBytes(4).toString(StandardCharsets.US_ASCII), 16))));
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19680);break;
                case 'Q':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19681);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19682);position.set("obd-pid", ChannelBuffers.hexDump(data));
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19683);break;
                case 'R':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19684);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19685);position.set("odb-travel", ChannelBuffers.hexDump(data));
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19686);break;
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19687);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19688);position.set("obd-traffic", ChannelBuffers.hexDump(data));
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19689);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2f4af4alx1e1mgt.R.inc(19690);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2f4af4alx1e1mgt.R.inc(19691);break;
            }

        }

        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19692);if ((((position.getLatitude() != 0 && position.getLongitude() != 0)&&(__CLR4_5_2f4af4alx1e1mgt.R.iget(19693)!=0|true))||(__CLR4_5_2f4af4alx1e1mgt.R.iget(19694)==0&false))) {{
            __CLR4_5_2f4af4alx1e1mgt.R.inc(19695);return position;
        }

        }__CLR4_5_2f4af4alx1e1mgt.R.inc(19696);return null;
    }finally{__CLR4_5_2f4af4alx1e1mgt.R.flushNeeded();}}

}
