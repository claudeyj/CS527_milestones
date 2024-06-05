/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.DateUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TramigoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gszgszlwye7h8x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,21870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TramigoProtocolDecoder(TramigoProtocol protocol) {
        super(protocol);__CLR4_5_2gszgszlwye7h8x.R.inc(21780);try{__CLR4_5_2gszgszlwye7h8x.R.inc(21779);
    }finally{__CLR4_5_2gszgszlwye7h8x.R.flushNeeded();}}

    public static final int MSG_COMPACT = 0x0100;
    public static final int MSG_FULL = 0x00FE;

    private static final String[] DIRECTIONS = new String[] {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gszgszlwye7h8x.R.inc(21781);

        __CLR4_5_2gszgszlwye7h8x.R.inc(21782);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2gszgszlwye7h8x.R.inc(21783);int protocol = buf.readUnsignedByte();
        __CLR4_5_2gszgszlwye7h8x.R.inc(21784);buf.readUnsignedByte(); // version id
        __CLR4_5_2gszgszlwye7h8x.R.inc(21785);int index = buf.readUnsignedShort();
        __CLR4_5_2gszgszlwye7h8x.R.inc(21786);int type = buf.readUnsignedShort();
        __CLR4_5_2gszgszlwye7h8x.R.inc(21787);buf.readUnsignedShort(); // length
        __CLR4_5_2gszgszlwye7h8x.R.inc(21788);buf.readUnsignedShort(); // mask
        __CLR4_5_2gszgszlwye7h8x.R.inc(21789);buf.readUnsignedShort(); // checksum
        __CLR4_5_2gszgszlwye7h8x.R.inc(21790);long id = buf.readUnsignedInt();
        __CLR4_5_2gszgszlwye7h8x.R.inc(21791);buf.readUnsignedInt(); // time

        __CLR4_5_2gszgszlwye7h8x.R.inc(21792);Position position = new Position();
        __CLR4_5_2gszgszlwye7h8x.R.inc(21793);position.setProtocol(getProtocolName());
        __CLR4_5_2gszgszlwye7h8x.R.inc(21794);position.set(Position.KEY_INDEX, index);
        __CLR4_5_2gszgszlwye7h8x.R.inc(21795);position.setValid(true);

        __CLR4_5_2gszgszlwye7h8x.R.inc(21796);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(id));
        __CLR4_5_2gszgszlwye7h8x.R.inc(21797);if ((((deviceSession == null)&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21798)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21799)==0&false))) {{
            __CLR4_5_2gszgszlwye7h8x.R.inc(21800);return null;
        }
        }__CLR4_5_2gszgszlwye7h8x.R.inc(21801);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2gszgszlwye7h8x.R.inc(21802);if ((((protocol == 0x01 && (type == MSG_COMPACT || type == MSG_FULL))&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21803)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21804)==0&false))) {{

            // need to send ack?

            __CLR4_5_2gszgszlwye7h8x.R.inc(21805);buf.readUnsignedShort(); // report trigger
            __CLR4_5_2gszgszlwye7h8x.R.inc(21806);buf.readUnsignedShort(); // state flag

            __CLR4_5_2gszgszlwye7h8x.R.inc(21807);position.setLatitude(buf.readUnsignedInt() * 0.0000001);
            __CLR4_5_2gszgszlwye7h8x.R.inc(21808);position.setLongitude(buf.readUnsignedInt() * 0.0000001);

            __CLR4_5_2gszgszlwye7h8x.R.inc(21809);position.set(Position.KEY_RSSI, buf.readUnsignedShort());
            __CLR4_5_2gszgszlwye7h8x.R.inc(21810);position.set(Position.KEY_SATELLITES, buf.readUnsignedShort());
            __CLR4_5_2gszgszlwye7h8x.R.inc(21811);position.set(Position.KEY_SATELLITES_VISIBLE, buf.readUnsignedShort());
            __CLR4_5_2gszgszlwye7h8x.R.inc(21812);position.set("gpsAntennaStatus", buf.readUnsignedShort());

            __CLR4_5_2gszgszlwye7h8x.R.inc(21813);position.setSpeed(buf.readUnsignedShort() * 0.194384);
            __CLR4_5_2gszgszlwye7h8x.R.inc(21814);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2gszgszlwye7h8x.R.inc(21815);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_2gszgszlwye7h8x.R.inc(21816);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_2gszgszlwye7h8x.R.inc(21817);position.set(Position.KEY_CHARGE, buf.readUnsignedShort());

            __CLR4_5_2gszgszlwye7h8x.R.inc(21818);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            // parse other data

            __CLR4_5_2gszgszlwye7h8x.R.inc(21819);return position;

        } }else {__CLR4_5_2gszgszlwye7h8x.R.inc(21820);if ((((protocol == 0x80)&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21821)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21822)==0&false))) {{

            __CLR4_5_2gszgszlwye7h8x.R.inc(21823);if ((((channel != null)&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21824)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21825)==0&false))) {{
                __CLR4_5_2gszgszlwye7h8x.R.inc(21826);channel.write(ChannelBuffers.copiedBuffer("gprs,ack," + index, StandardCharsets.US_ASCII));
            }

            }__CLR4_5_2gszgszlwye7h8x.R.inc(21827);String sentence = buf.toString(StandardCharsets.US_ASCII);

            __CLR4_5_2gszgszlwye7h8x.R.inc(21828);Pattern pattern = Pattern.compile("(-?\\d+\\.\\d+), (-?\\d+\\.\\d+)");
            __CLR4_5_2gszgszlwye7h8x.R.inc(21829);Matcher matcher = pattern.matcher(sentence);
            __CLR4_5_2gszgszlwye7h8x.R.inc(21830);if ((((!matcher.find())&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21831)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21832)==0&false))) {{
                __CLR4_5_2gszgszlwye7h8x.R.inc(21833);return null;
            }
            }__CLR4_5_2gszgszlwye7h8x.R.inc(21834);position.setLatitude(Double.parseDouble(matcher.group(1)));
            __CLR4_5_2gszgszlwye7h8x.R.inc(21835);position.setLongitude(Double.parseDouble(matcher.group(2)));

            __CLR4_5_2gszgszlwye7h8x.R.inc(21836);pattern = Pattern.compile("([NSWE]{1,2}) with speed (\\d+) km/h");
            __CLR4_5_2gszgszlwye7h8x.R.inc(21837);matcher = pattern.matcher(sentence);
            __CLR4_5_2gszgszlwye7h8x.R.inc(21838);if ((((matcher.find())&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21839)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21840)==0&false))) {{
                __CLR4_5_2gszgszlwye7h8x.R.inc(21841);for (int i = 0; (((i < DIRECTIONS.length)&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21842)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21843)==0&false)); i++) {{
                    __CLR4_5_2gszgszlwye7h8x.R.inc(21844);if ((((matcher.group(1).equals(DIRECTIONS[i]))&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21845)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21846)==0&false))) {{
                        __CLR4_5_2gszgszlwye7h8x.R.inc(21847);position.setCourse(i * 45.0);
                        __CLR4_5_2gszgszlwye7h8x.R.inc(21848);break;
                    }
                }}
                }__CLR4_5_2gszgszlwye7h8x.R.inc(21849);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(matcher.group(2))));
            }

            }__CLR4_5_2gszgszlwye7h8x.R.inc(21850);pattern = Pattern.compile("(\\d{1,2}:\\d{2}(:\\d{2})? \\w{3} \\d{1,2})");
            __CLR4_5_2gszgszlwye7h8x.R.inc(21851);matcher = pattern.matcher(sentence);
            __CLR4_5_2gszgszlwye7h8x.R.inc(21852);if ((((!matcher.find())&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21853)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21854)==0&false))) {{
                __CLR4_5_2gszgszlwye7h8x.R.inc(21855);return null;
            }
            }__CLR4_5_2gszgszlwye7h8x.R.inc(21856);DateFormat dateFormat = new SimpleDateFormat(
                    (((matcher.group(2) != null )&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21857)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21858)==0&false))? "HH:mm:ss MMM d yyyy" : "HH:mm MMM d yyyy", Locale.ENGLISH);
            __CLR4_5_2gszgszlwye7h8x.R.inc(21859);position.setTime(DateUtil.correctYear(
                    dateFormat.parse(matcher.group(1) + " " + Calendar.getInstance().get(Calendar.YEAR))));

            __CLR4_5_2gszgszlwye7h8x.R.inc(21860);if ((((sentence.contains("Ignition on detected"))&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21861)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21862)==0&false))) {{
                __CLR4_5_2gszgszlwye7h8x.R.inc(21863);position.set(Position.KEY_IGNITION, true);
            } }else {__CLR4_5_2gszgszlwye7h8x.R.inc(21864);if ((((sentence.contains("Ignition off detected"))&&(__CLR4_5_2gszgszlwye7h8x.R.iget(21865)!=0|true))||(__CLR4_5_2gszgszlwye7h8x.R.iget(21866)==0&false))) {{
                __CLR4_5_2gszgszlwye7h8x.R.inc(21867);position.set(Position.KEY_IGNITION, false);
            }

            }}__CLR4_5_2gszgszlwye7h8x.R.inc(21868);return position;

        }

        }}__CLR4_5_2gszgszlwye7h8x.R.inc(21869);return null;
    }finally{__CLR4_5_2gszgszlwye7h8x.R.flushNeeded();}}

}
