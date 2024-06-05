/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2016 Anton Tananaev (anton@traccar.org)
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

public class TramigoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ej2ej2lx1dzc7k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,18919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TramigoProtocolDecoder(TramigoProtocol protocol) {
        super(protocol);__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18831);try{__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18830);
    }finally{__CLR4_5_2ej2ej2lx1dzc7k.R.flushNeeded();}}

    public static final int MSG_COMPACT = 0x0100;
    public static final int MSG_FULL = 0x00FE;

    private static final String[] DIRECTIONS = new String[] {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18832);

        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18833);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18834);int protocol = buf.readUnsignedByte();
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18835);buf.readUnsignedByte(); // version id
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18836);int index = buf.readUnsignedShort();
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18837);int type = buf.readUnsignedShort();
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18838);buf.readUnsignedShort(); // length
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18839);buf.readUnsignedShort(); // mask
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18840);buf.readUnsignedShort(); // checksum
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18841);long id = buf.readUnsignedInt();
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18842);buf.readUnsignedInt(); // time

        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18843);Position position = new Position();
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18844);position.setProtocol(getProtocolName());
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18845);position.set(Position.KEY_INDEX, index);
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18846);position.setValid(true);

        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18847);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(id));
        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18848);if ((((deviceSession == null)&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18849)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18850)==0&false))) {{
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18851);return null;
        }
        }__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18852);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18853);if ((((protocol == 0x01 && (type == MSG_COMPACT || type == MSG_FULL))&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18854)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18855)==0&false))) {{

            // need to send ack?

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18856);buf.readUnsignedShort(); // report trigger
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18857);buf.readUnsignedShort(); // state flag

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18858);position.setLatitude(buf.readUnsignedInt() * 0.0000001);
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18859);position.setLongitude(buf.readUnsignedInt() * 0.0000001);

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18860);buf.readUnsignedShort(); // GSM signal quality
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18861);buf.readUnsignedShort(); // satellites in fix
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18862);buf.readUnsignedShort(); // satellites in track
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18863);buf.readUnsignedShort(); // GPS antenna state

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18864);position.setSpeed(buf.readUnsignedShort() * 0.194384);
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18865);position.setCourse((double) buf.readUnsignedShort());

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18866);buf.readUnsignedInt(); // distance

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18867);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18868);buf.readUnsignedShort(); // battery charger status

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18869);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            // parse other data

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18870);return position;

        } }else {__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18871);if ((((protocol == 0x80)&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18872)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18873)==0&false))) {{

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18874);if ((((channel != null)&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18875)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18876)==0&false))) {{
                __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18877);channel.write(ChannelBuffers.copiedBuffer("gprs,ack," + index, StandardCharsets.US_ASCII));
            }

            }__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18878);String sentence = buf.toString(StandardCharsets.US_ASCII);

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18879);Pattern pattern = Pattern.compile("(-?\\d+\\.\\d+), (-?\\d+\\.\\d+)");
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18880);Matcher matcher = pattern.matcher(sentence);
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18881);if ((((!matcher.find())&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18882)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18883)==0&false))) {{
                __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18884);return null;
            }
            }__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18885);position.setLatitude(Double.parseDouble(matcher.group(1)));
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18886);position.setLongitude(Double.parseDouble(matcher.group(2)));

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18887);pattern = Pattern.compile("([NSWE]{1,2}) with speed (\\d+) km/h");
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18888);matcher = pattern.matcher(sentence);
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18889);if ((((matcher.find())&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18890)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18891)==0&false))) {{
                __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18892);for (int i = 0; (((i < DIRECTIONS.length)&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18893)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18894)==0&false)); i++) {{
                    __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18895);if ((((matcher.group(1).equals(DIRECTIONS[i]))&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18896)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18897)==0&false))) {{
                        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18898);position.setCourse(i * 45.0);
                        __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18899);break;
                    }
                }}
                }__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18900);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(matcher.group(2))));
            }

            }__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18901);pattern = Pattern.compile("(\\d{1,2}:\\d{2} \\w{3} \\d{1,2})");
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18902);matcher = pattern.matcher(sentence);
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18903);if ((((!matcher.find())&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18904)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18905)==0&false))) {{
                __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18906);return null;
            }
            }__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18907);DateFormat dateFormat = new SimpleDateFormat("HH:mm MMM d yyyy", Locale.ENGLISH);
            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18908);position.setTime(DateUtil.correctYear(
                    dateFormat.parse(matcher.group(1) + " " + Calendar.getInstance().get(Calendar.YEAR))));

            __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18909);if ((((sentence.contains("Ignition on detected"))&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18910)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18911)==0&false))) {{
                __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18912);position.set(Position.KEY_IGNITION, true);
            } }else {__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18913);if ((((sentence.contains("Ignition off detected"))&&(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18914)!=0|true))||(__CLR4_5_2ej2ej2lx1dzc7k.R.iget(18915)==0&false))) {{
                __CLR4_5_2ej2ej2lx1dzc7k.R.inc(18916);position.set(Position.KEY_IGNITION, false);
            }

            }}__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18917);return position;

        }

        }}__CLR4_5_2ej2ej2lx1dzc7k.R.inc(18918);return null;
    }finally{__CLR4_5_2ej2ej2lx1dzc7k.R.flushNeeded();}}

}
