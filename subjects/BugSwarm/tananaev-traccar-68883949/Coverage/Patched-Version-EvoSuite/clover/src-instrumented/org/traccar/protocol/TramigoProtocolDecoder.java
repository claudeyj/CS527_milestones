/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TramigoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27o27o2lx1doauj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,10011,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TramigoProtocolDecoder(TramigoProtocol protocol) {
        super(protocol);__CLR4_5_27o27o2lx1doauj.R.inc(9939);try{__CLR4_5_27o27o2lx1doauj.R.inc(9938);
    }finally{__CLR4_5_27o27o2lx1doauj.R.flushNeeded();}}

    private static final int MSG_COMPACT = 0x0100;
    private static final int MSG_FULL = 0x00FE;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_27o27o2lx1doauj.R.inc(9940);

        __CLR4_5_27o27o2lx1doauj.R.inc(9941);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_27o27o2lx1doauj.R.inc(9942);int protocol = buf.readUnsignedByte();
        __CLR4_5_27o27o2lx1doauj.R.inc(9943);buf.readUnsignedByte(); // version id
        __CLR4_5_27o27o2lx1doauj.R.inc(9944);int index = buf.readUnsignedShort();
        __CLR4_5_27o27o2lx1doauj.R.inc(9945);int type = buf.readUnsignedShort();
        __CLR4_5_27o27o2lx1doauj.R.inc(9946);buf.readUnsignedShort(); // length
        __CLR4_5_27o27o2lx1doauj.R.inc(9947);buf.readUnsignedShort(); // mask
        __CLR4_5_27o27o2lx1doauj.R.inc(9948);buf.readUnsignedShort(); // checksum
        __CLR4_5_27o27o2lx1doauj.R.inc(9949);long id = buf.readUnsignedInt();
        __CLR4_5_27o27o2lx1doauj.R.inc(9950);buf.readUnsignedInt(); // time

        // Create new position
        __CLR4_5_27o27o2lx1doauj.R.inc(9951);Position position = new Position();
        __CLR4_5_27o27o2lx1doauj.R.inc(9952);position.setProtocol(getProtocolName());
        __CLR4_5_27o27o2lx1doauj.R.inc(9953);position.set(Event.KEY_INDEX, index);
        __CLR4_5_27o27o2lx1doauj.R.inc(9954);position.setValid(true);

        // Get device id
        __CLR4_5_27o27o2lx1doauj.R.inc(9955);if ((((!identify(String.valueOf(id), channel))&&(__CLR4_5_27o27o2lx1doauj.R.iget(9956)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(9957)==0&false))) {{
            __CLR4_5_27o27o2lx1doauj.R.inc(9958);return null;
        }
        }__CLR4_5_27o27o2lx1doauj.R.inc(9959);position.setDeviceId(getDeviceId());

        __CLR4_5_27o27o2lx1doauj.R.inc(9960);if ((((protocol == 0x01 && (type == MSG_COMPACT || type == MSG_FULL))&&(__CLR4_5_27o27o2lx1doauj.R.iget(9961)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(9962)==0&false))) {{

            // TODO: send ack

            __CLR4_5_27o27o2lx1doauj.R.inc(9963);buf.readUnsignedShort(); // report trigger
            __CLR4_5_27o27o2lx1doauj.R.inc(9964);buf.readUnsignedShort(); // state flag

            __CLR4_5_27o27o2lx1doauj.R.inc(9965);position.setLatitude(buf.readUnsignedInt() * 0.0000001);
            __CLR4_5_27o27o2lx1doauj.R.inc(9966);position.setLongitude(buf.readUnsignedInt() * 0.0000001);

            __CLR4_5_27o27o2lx1doauj.R.inc(9967);buf.readUnsignedShort(); // GSM signal quality
            __CLR4_5_27o27o2lx1doauj.R.inc(9968);buf.readUnsignedShort(); // satellites in fix
            __CLR4_5_27o27o2lx1doauj.R.inc(9969);buf.readUnsignedShort(); // satellites in track
            __CLR4_5_27o27o2lx1doauj.R.inc(9970);buf.readUnsignedShort(); // GPS antenna state

            __CLR4_5_27o27o2lx1doauj.R.inc(9971);position.setSpeed(buf.readUnsignedShort() * 0.194384);
            __CLR4_5_27o27o2lx1doauj.R.inc(9972);position.setCourse((double )buf.readUnsignedShort());

            __CLR4_5_27o27o2lx1doauj.R.inc(9973);buf.readUnsignedInt(); // distance

            __CLR4_5_27o27o2lx1doauj.R.inc(9974);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_27o27o2lx1doauj.R.inc(9975);buf.readUnsignedShort(); // battery charger status

            __CLR4_5_27o27o2lx1doauj.R.inc(9976);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            // TODO: parse other data
            __CLR4_5_27o27o2lx1doauj.R.inc(9977);return position;

        } }else {__CLR4_5_27o27o2lx1doauj.R.inc(9978);if ((((protocol == 0x80)&&(__CLR4_5_27o27o2lx1doauj.R.iget(9979)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(9980)==0&false))) {{

            __CLR4_5_27o27o2lx1doauj.R.inc(9981);if ((((channel != null)&&(__CLR4_5_27o27o2lx1doauj.R.iget(9982)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(9983)==0&false))) {{
                __CLR4_5_27o27o2lx1doauj.R.inc(9984);channel.write(ChannelBuffers.copiedBuffer("gprs,ack," + index, Charset.defaultCharset()));
            }

            }__CLR4_5_27o27o2lx1doauj.R.inc(9985);String sentence = buf.toString(Charset.defaultCharset());

            // Coordinates
            __CLR4_5_27o27o2lx1doauj.R.inc(9986);Pattern pattern = Pattern.compile("(-?\\d+\\.\\d+), (-?\\d+\\.\\d+)");
            __CLR4_5_27o27o2lx1doauj.R.inc(9987);Matcher matcher = pattern.matcher(sentence);
            __CLR4_5_27o27o2lx1doauj.R.inc(9988);if ((((!matcher.find())&&(__CLR4_5_27o27o2lx1doauj.R.iget(9989)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(9990)==0&false))) {{
                __CLR4_5_27o27o2lx1doauj.R.inc(9991);return null;
            }
            }__CLR4_5_27o27o2lx1doauj.R.inc(9992);position.setLatitude(Double.valueOf(matcher.group(1)));
            __CLR4_5_27o27o2lx1doauj.R.inc(9993);position.setLongitude(Double.valueOf(matcher.group(2)));

            // Speed and Course
            __CLR4_5_27o27o2lx1doauj.R.inc(9994);pattern = Pattern.compile("([NSWE]{1,2}) with speed (\\d+) km/h");
            __CLR4_5_27o27o2lx1doauj.R.inc(9995);matcher = pattern.matcher(sentence);
            __CLR4_5_27o27o2lx1doauj.R.inc(9996);if ((((matcher.find())&&(__CLR4_5_27o27o2lx1doauj.R.iget(9997)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(9998)==0&false))) {{
                __CLR4_5_27o27o2lx1doauj.R.inc(9999);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(matcher.group(2))));
                __CLR4_5_27o27o2lx1doauj.R.inc(10000);position.setCourse(0); // matcher.group(1) for course
            }

            // Time
            }__CLR4_5_27o27o2lx1doauj.R.inc(10001);pattern = Pattern.compile("(\\d{1,2}:\\d{2} \\w{3} \\d{1,2})");
            __CLR4_5_27o27o2lx1doauj.R.inc(10002);matcher = pattern.matcher(sentence);
            __CLR4_5_27o27o2lx1doauj.R.inc(10003);if ((((!matcher.find())&&(__CLR4_5_27o27o2lx1doauj.R.iget(10004)!=0|true))||(__CLR4_5_27o27o2lx1doauj.R.iget(10005)==0&false))) {{
                __CLR4_5_27o27o2lx1doauj.R.inc(10006);return null;
            }
            }__CLR4_5_27o27o2lx1doauj.R.inc(10007);DateFormat dateFormat = new SimpleDateFormat("HH:mm MMM d yyyy", Locale.ENGLISH);
            __CLR4_5_27o27o2lx1doauj.R.inc(10008);position.setTime(dateFormat.parse(matcher.group(1) + " " + Calendar.getInstance().get(Calendar.YEAR)));
            __CLR4_5_27o27o2lx1doauj.R.inc(10009);return position;
        }

        }}__CLR4_5_27o27o2lx1doauj.R.inc(10010);return null;
    }finally{__CLR4_5_27o27o2lx1doauj.R.flushNeeded();}}

}
