/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class FoxProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27lr7lrlx1dzad1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,9909,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FoxProtocolDecoder(FoxProtocol protocol) {
        super(protocol);__CLR4_5_27lr7lrlx1dzad1.R.inc(9856);try{__CLR4_5_27lr7lrlx1dzad1.R.inc(9855);
    }finally{__CLR4_5_27lr7lrlx1dzad1.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(d+),")                     // status id
            .expression("([AV]),")               // validity
            .number("(dd)(dd)(dd),")             // date
            .number("(dd)(dd)(dd),")             // time
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .expression("[^,]*,")                // cell info
            .number("([01]+) ")                  // input
            .number("(d+) ")                     // power
            .number("(d+) ")                     // temperature
            .number("(d+) ")                     // rpm
            .number("(d+) ")                     // fuel
            .number("(d+) ")                     // adc 1
            .number("(d+) ")                     // adc 2
            .number("([01]+) ")                  // output
            .number("(d+),")                     // odometer
            .expression("(.+)")                  // status info
            .compile();

    private String getAttribute(String xml, String key) {try{__CLR4_5_27lr7lrlx1dzad1.R.inc(9857);
        __CLR4_5_27lr7lrlx1dzad1.R.inc(9858);int start = xml.indexOf(key + "=\"");
        __CLR4_5_27lr7lrlx1dzad1.R.inc(9859);if ((((start != -1)&&(__CLR4_5_27lr7lrlx1dzad1.R.iget(9860)!=0|true))||(__CLR4_5_27lr7lrlx1dzad1.R.iget(9861)==0&false))) {{
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9862);start += key.length() + 2;
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9863);int end = xml.indexOf("\"", start);
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9864);if ((((end != -1)&&(__CLR4_5_27lr7lrlx1dzad1.R.iget(9865)!=0|true))||(__CLR4_5_27lr7lrlx1dzad1.R.iget(9866)==0&false))) {{
                __CLR4_5_27lr7lrlx1dzad1.R.inc(9867);return xml.substring(start, end);
            }
        }}
        }__CLR4_5_27lr7lrlx1dzad1.R.inc(9868);return null;
    }finally{__CLR4_5_27lr7lrlx1dzad1.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27lr7lrlx1dzad1.R.inc(9869);

        __CLR4_5_27lr7lrlx1dzad1.R.inc(9870);String xml = (String) msg;
        __CLR4_5_27lr7lrlx1dzad1.R.inc(9871);String id = getAttribute(xml, "id");
        __CLR4_5_27lr7lrlx1dzad1.R.inc(9872);String data = getAttribute(xml, "data");

        __CLR4_5_27lr7lrlx1dzad1.R.inc(9873);if ((((id != null && data != null)&&(__CLR4_5_27lr7lrlx1dzad1.R.iget(9874)!=0|true))||(__CLR4_5_27lr7lrlx1dzad1.R.iget(9875)==0&false))) {{

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9876);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9877);if ((((deviceSession == null)&&(__CLR4_5_27lr7lrlx1dzad1.R.iget(9878)!=0|true))||(__CLR4_5_27lr7lrlx1dzad1.R.iget(9879)==0&false))) {{
                __CLR4_5_27lr7lrlx1dzad1.R.inc(9880);return null;
            }

            }__CLR4_5_27lr7lrlx1dzad1.R.inc(9881);Parser parser = new Parser(PATTERN, data);
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9882);if ((((!parser.matches())&&(__CLR4_5_27lr7lrlx1dzad1.R.iget(9883)!=0|true))||(__CLR4_5_27lr7lrlx1dzad1.R.iget(9884)==0&false))) {{
                __CLR4_5_27lr7lrlx1dzad1.R.inc(9885);return null;
            }

            }__CLR4_5_27lr7lrlx1dzad1.R.inc(9886);Position position = new Position();
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9887);position.setProtocol(getProtocolName());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9888);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9889);position.set(Position.KEY_STATUS, parser.nextInt());

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9890);position.setValid(parser.next().equals("A"));

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9891);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9892);position.setTime(dateBuilder.getDate());

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9893);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9894);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9895);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9896);position.setCourse(parser.nextDouble());

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9897);position.set(Position.KEY_INPUT, parser.nextInt(2));
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9898);position.set(Position.KEY_POWER, parser.nextDouble() / 10);
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9899);position.set(Position.PREFIX_TEMP + 1, parser.nextInt());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9900);position.set(Position.KEY_RPM, parser.nextInt());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9901);position.set(Position.KEY_FUEL, parser.nextInt());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9902);position.set(Position.PREFIX_ADC + 1, parser.nextInt());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9903);position.set(Position.PREFIX_ADC + 2, parser.nextInt());
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9904);position.set(Position.KEY_OUTPUT, parser.nextInt(2));
            __CLR4_5_27lr7lrlx1dzad1.R.inc(9905);position.set(Position.KEY_ODOMETER, parser.nextInt());

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9906);position.set("statusData", parser.next());

            __CLR4_5_27lr7lrlx1dzad1.R.inc(9907);return position;

        }

        }__CLR4_5_27lr7lrlx1dzad1.R.inc(9908);return null;
    }finally{__CLR4_5_27lr7lrlx1dzad1.R.flushNeeded();}}

}