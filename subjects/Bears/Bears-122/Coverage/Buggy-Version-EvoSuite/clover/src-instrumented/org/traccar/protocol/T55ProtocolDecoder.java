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

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.socket.DatagramChannel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Pattern;

public class T55ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fbffbflwydwero{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,20016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public T55ProtocolDecoder(T55Protocol protocol) {
        super(protocol);__CLR4_5_2fbffbflwydwero.R.inc(19852);try{__CLR4_5_2fbffbflwydwero.R.inc(19851);
    }finally{__CLR4_5_2fbffbflwydwero.R.flushNeeded();}}

    private static final Pattern PATTERN_GPRMC = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d{2,3})(dd.d+),")          // longitude
            .expression("([EW]),")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .expression("[^*]+")
            .text("*")
            .expression("[^,]+")
            .number(",(d+)")                     // satellites
            .number(",(d+)")                     // imei
            .expression(",([01])")               // ignition
            .number(",(d+)")                     // fuel
            .number(",(d+)").optional(5)         // battery
            .number("((?:,d+)+)?")               // parameters
            .any()
            .compile();

    private static final Pattern PATTERN_GPGGA = new PatternBuilder()
            .text("$GPGGA,")
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .number("(d+)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d+)(dd.d+),")              // longitude
            .expression("([EW]),")
            .any()
            .compile();

    private static final Pattern PATTERN_GPRMA = new PatternBuilder()
            .text("$GPRMA,")
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),,,")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .any()
            .compile();

    private static final Pattern PATTERN_TRCCR = new PatternBuilder()
            .text("$TRCCR,")
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(d+.d+),")                  // speed
            .number("(d+.d+),")                  // course
            .number("(-?d+.d+),")                // altitude
            .number("(d+.?d*),")                 // battery
            .any()
            .compile();

    private Position position = null;

    private Position decodeGprmc(
            DeviceSession deviceSession, String sentence, SocketAddress remoteAddress, Channel channel) {try{__CLR4_5_2fbffbflwydwero.R.inc(19853);

        __CLR4_5_2fbffbflwydwero.R.inc(19854);if ((((channel != null && !(channel instanceof DatagramChannel))&&(__CLR4_5_2fbffbflwydwero.R.iget(19855)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19856)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19857);channel.write("OK1\r\n");
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19858);Parser parser = new Parser(PATTERN_GPRMC, sentence);
        __CLR4_5_2fbffbflwydwero.R.inc(19859);if ((((!parser.matches())&&(__CLR4_5_2fbffbflwydwero.R.iget(19860)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19861)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19862);return null;
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19863);Position position = new Position();
        __CLR4_5_2fbffbflwydwero.R.inc(19864);position.setProtocol(getProtocolName());

        __CLR4_5_2fbffbflwydwero.R.inc(19865);if ((((deviceSession != null)&&(__CLR4_5_2fbffbflwydwero.R.iget(19866)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19867)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19868);position.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19869);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2fbffbflwydwero.R.inc(19870);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fbffbflwydwero.R.inc(19871);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fbffbflwydwero.R.inc(19872);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2fbffbflwydwero.R.inc(19873);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19874);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2fbffbflwydwero.R.inc(19875);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19876);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fbffbflwydwero.R.inc(19877);if ((((parser.hasNext(5))&&(__CLR4_5_2fbffbflwydwero.R.iget(19878)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19879)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19880);position.set(Position.KEY_SATELLITES, parser.nextInt());

            __CLR4_5_2fbffbflwydwero.R.inc(19881);deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2fbffbflwydwero.R.inc(19882);if ((((deviceSession == null)&&(__CLR4_5_2fbffbflwydwero.R.iget(19883)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19884)==0&false))) {{
                __CLR4_5_2fbffbflwydwero.R.inc(19885);return null;
            }
            }__CLR4_5_2fbffbflwydwero.R.inc(19886);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fbffbflwydwero.R.inc(19887);position.set(Position.KEY_IGNITION, parser.hasNext() && parser.next().equals("1"));
            __CLR4_5_2fbffbflwydwero.R.inc(19888);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt(0));
            __CLR4_5_2fbffbflwydwero.R.inc(19889);position.set(Position.KEY_BATTERY, parser.nextInt());
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19890);if ((((parser.hasNext())&&(__CLR4_5_2fbffbflwydwero.R.iget(19891)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19892)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19893);String[] parameters = parser.next().split(",");
            __CLR4_5_2fbffbflwydwero.R.inc(19894);for (int i = 1; (((i < parameters.length)&&(__CLR4_5_2fbffbflwydwero.R.iget(19895)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19896)==0&false)); i++) {{
                __CLR4_5_2fbffbflwydwero.R.inc(19897);position.set(Position.PREFIX_IO + i, parameters[i]);
            }
        }}

        }__CLR4_5_2fbffbflwydwero.R.inc(19898);if ((((deviceSession != null)&&(__CLR4_5_2fbffbflwydwero.R.iget(19899)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19900)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19901);return position;
        } }else {{
            __CLR4_5_2fbffbflwydwero.R.inc(19902);this.position = position; // save position
            __CLR4_5_2fbffbflwydwero.R.inc(19903);return null;
        }
    }}finally{__CLR4_5_2fbffbflwydwero.R.flushNeeded();}}

    private Position decodeGpgga(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2fbffbflwydwero.R.inc(19904);

        __CLR4_5_2fbffbflwydwero.R.inc(19905);Parser parser = new Parser(PATTERN_GPGGA, sentence);
        __CLR4_5_2fbffbflwydwero.R.inc(19906);if ((((!parser.matches())&&(__CLR4_5_2fbffbflwydwero.R.iget(19907)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19908)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19909);return null;
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19910);Position position = new Position();
        __CLR4_5_2fbffbflwydwero.R.inc(19911);position.setProtocol(getProtocolName());
        __CLR4_5_2fbffbflwydwero.R.inc(19912);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fbffbflwydwero.R.inc(19913);DateBuilder dateBuilder = new DateBuilder()
                .setCurrentDate()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19914);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fbffbflwydwero.R.inc(19915);position.setValid(true);
        __CLR4_5_2fbffbflwydwero.R.inc(19916);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fbffbflwydwero.R.inc(19917);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2fbffbflwydwero.R.inc(19918);return position;
    }finally{__CLR4_5_2fbffbflwydwero.R.flushNeeded();}}

    private Position decodeGprma(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2fbffbflwydwero.R.inc(19919);

        __CLR4_5_2fbffbflwydwero.R.inc(19920);Parser parser = new Parser(PATTERN_GPRMA, sentence);
        __CLR4_5_2fbffbflwydwero.R.inc(19921);if ((((!parser.matches())&&(__CLR4_5_2fbffbflwydwero.R.iget(19922)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19923)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19924);return null;
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19925);Position position = new Position();
        __CLR4_5_2fbffbflwydwero.R.inc(19926);position.setProtocol(getProtocolName());
        __CLR4_5_2fbffbflwydwero.R.inc(19927);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fbffbflwydwero.R.inc(19928);position.setTime(new Date());
        __CLR4_5_2fbffbflwydwero.R.inc(19929);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fbffbflwydwero.R.inc(19930);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fbffbflwydwero.R.inc(19931);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2fbffbflwydwero.R.inc(19932);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19933);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2fbffbflwydwero.R.inc(19934);return position;
    }finally{__CLR4_5_2fbffbflwydwero.R.flushNeeded();}}

    private Position decodeTrccr(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2fbffbflwydwero.R.inc(19935);

        __CLR4_5_2fbffbflwydwero.R.inc(19936);Parser parser = new Parser(PATTERN_TRCCR, sentence);
        __CLR4_5_2fbffbflwydwero.R.inc(19937);if ((((!parser.matches())&&(__CLR4_5_2fbffbflwydwero.R.iget(19938)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19939)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19940);return null;
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19941);Position position = new Position();
        __CLR4_5_2fbffbflwydwero.R.inc(19942);position.setProtocol(getProtocolName());
        __CLR4_5_2fbffbflwydwero.R.inc(19943);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fbffbflwydwero.R.inc(19944);position.setTime(parser.nextDateTime());

        __CLR4_5_2fbffbflwydwero.R.inc(19945);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fbffbflwydwero.R.inc(19946);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19947);position.setLongitude(parser.nextDouble(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19948);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19949);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2fbffbflwydwero.R.inc(19950);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2fbffbflwydwero.R.inc(19951);position.set(Position.KEY_BATTERY, parser.nextDouble(0));

        __CLR4_5_2fbffbflwydwero.R.inc(19952);return position;
    }finally{__CLR4_5_2fbffbflwydwero.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fbffbflwydwero.R.inc(19953);

        __CLR4_5_2fbffbflwydwero.R.inc(19954);String sentence = (String) msg;

        __CLR4_5_2fbffbflwydwero.R.inc(19955);DeviceSession deviceSession;

        __CLR4_5_2fbffbflwydwero.R.inc(19956);if ((((!sentence.startsWith("$") && sentence.contains("$"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19957)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19958)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19959);int index = sentence.indexOf("$");
            __CLR4_5_2fbffbflwydwero.R.inc(19960);String id = sentence.substring(0, index);
            __CLR4_5_2fbffbflwydwero.R.inc(19961);if ((((id.endsWith(","))&&(__CLR4_5_2fbffbflwydwero.R.iget(19962)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19963)==0&false))) {{
                __CLR4_5_2fbffbflwydwero.R.inc(19964);id = id.substring(0, id.length() - 1);
            } }else {__CLR4_5_2fbffbflwydwero.R.inc(19965);if ((((id.endsWith("/"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19966)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19967)==0&false))) {{
                __CLR4_5_2fbffbflwydwero.R.inc(19968);id = id.substring(id.indexOf('/') + 1, id.length() - 1);
            }
            }}__CLR4_5_2fbffbflwydwero.R.inc(19969);deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2fbffbflwydwero.R.inc(19970);sentence = sentence.substring(index);
        } }else {{
            __CLR4_5_2fbffbflwydwero.R.inc(19971);deviceSession = getDeviceSession(channel, remoteAddress);
        }

        }__CLR4_5_2fbffbflwydwero.R.inc(19972);if ((((sentence.startsWith("$PGID"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19973)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19974)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19975);getDeviceSession(channel, remoteAddress, sentence.substring(6, sentence.length() - 3));
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(19976);if ((((sentence.startsWith("$PCPTI"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19977)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19978)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19979);getDeviceSession(channel, remoteAddress, sentence.substring(7, sentence.indexOf(",", 7)));
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(19980);if ((((sentence.startsWith("IMEI"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19981)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19982)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19983);getDeviceSession(channel, remoteAddress, sentence.substring(5, sentence.length()));
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(19984);if ((((sentence.startsWith("$GPFID"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19985)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19986)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19987);deviceSession = getDeviceSession(channel, remoteAddress, sentence.substring(7, sentence.length()));
            __CLR4_5_2fbffbflwydwero.R.inc(19988);if ((((deviceSession != null && position != null)&&(__CLR4_5_2fbffbflwydwero.R.iget(19989)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19990)==0&false))) {{
                __CLR4_5_2fbffbflwydwero.R.inc(19991);Position position = this.position;
                __CLR4_5_2fbffbflwydwero.R.inc(19992);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_2fbffbflwydwero.R.inc(19993);this.position = null;
                __CLR4_5_2fbffbflwydwero.R.inc(19994);return position;
            }
        }} }else {__CLR4_5_2fbffbflwydwero.R.inc(19995);if ((((sentence.matches("^[0-9A-F]+$"))&&(__CLR4_5_2fbffbflwydwero.R.iget(19996)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(19997)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(19998);getDeviceSession(channel, remoteAddress, sentence);
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(19999);if ((((sentence.startsWith("$GPRMC"))&&(__CLR4_5_2fbffbflwydwero.R.iget(20000)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(20001)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(20002);return decodeGprmc(deviceSession, sentence, remoteAddress, channel);
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(20003);if ((((sentence.startsWith("$GPGGA") && deviceSession != null)&&(__CLR4_5_2fbffbflwydwero.R.iget(20004)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(20005)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(20006);return decodeGpgga(deviceSession, sentence);
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(20007);if ((((sentence.startsWith("$GPRMA") && deviceSession != null)&&(__CLR4_5_2fbffbflwydwero.R.iget(20008)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(20009)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(20010);return decodeGprma(deviceSession, sentence);
        } }else {__CLR4_5_2fbffbflwydwero.R.inc(20011);if ((((sentence.startsWith("$TRCCR") && deviceSession != null)&&(__CLR4_5_2fbffbflwydwero.R.iget(20012)!=0|true))||(__CLR4_5_2fbffbflwydwero.R.iget(20013)==0&false))) {{
            __CLR4_5_2fbffbflwydwero.R.inc(20014);return decodeTrccr(deviceSession, sentence);
        }

        }}}}}}}}}__CLR4_5_2fbffbflwydwero.R.inc(20015);return null;
    }finally{__CLR4_5_2fbffbflwydwero.R.flushNeeded();}}

}
