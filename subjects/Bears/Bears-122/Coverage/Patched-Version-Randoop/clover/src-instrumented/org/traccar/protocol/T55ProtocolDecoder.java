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

public class T55ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fbefbelwye66vt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,20015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public T55ProtocolDecoder(T55Protocol protocol) {
        super(protocol);__CLR4_5_2fbefbelwye66vt.R.inc(19851);try{__CLR4_5_2fbefbelwye66vt.R.inc(19850);
    }finally{__CLR4_5_2fbefbelwye66vt.R.flushNeeded();}}

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
            DeviceSession deviceSession, String sentence, SocketAddress remoteAddress, Channel channel) {try{__CLR4_5_2fbefbelwye66vt.R.inc(19852);

        __CLR4_5_2fbefbelwye66vt.R.inc(19853);if ((((channel != null && !(channel instanceof DatagramChannel))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19854)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19855)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19856);channel.write("OK1\r\n");
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19857);Parser parser = new Parser(PATTERN_GPRMC, sentence);
        __CLR4_5_2fbefbelwye66vt.R.inc(19858);if ((((!parser.matches())&&(__CLR4_5_2fbefbelwye66vt.R.iget(19859)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19860)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19861);return null;
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19862);Position position = new Position();
        __CLR4_5_2fbefbelwye66vt.R.inc(19863);position.setProtocol(getProtocolName());

        __CLR4_5_2fbefbelwye66vt.R.inc(19864);if ((((deviceSession != null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(19865)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19866)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19867);position.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19868);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2fbefbelwye66vt.R.inc(19869);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fbefbelwye66vt.R.inc(19870);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fbefbelwye66vt.R.inc(19871);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2fbefbelwye66vt.R.inc(19872);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19873);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2fbefbelwye66vt.R.inc(19874);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19875);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fbefbelwye66vt.R.inc(19876);if ((((parser.hasNext(5))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19877)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19878)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19879);position.set(Position.KEY_SATELLITES, parser.nextInt());

            __CLR4_5_2fbefbelwye66vt.R.inc(19880);deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2fbefbelwye66vt.R.inc(19881);if ((((deviceSession == null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(19882)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19883)==0&false))) {{
                __CLR4_5_2fbefbelwye66vt.R.inc(19884);return null;
            }
            }__CLR4_5_2fbefbelwye66vt.R.inc(19885);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fbefbelwye66vt.R.inc(19886);position.set(Position.KEY_IGNITION, parser.hasNext() && parser.next().equals("1"));
            __CLR4_5_2fbefbelwye66vt.R.inc(19887);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt(0));
            __CLR4_5_2fbefbelwye66vt.R.inc(19888);position.set(Position.KEY_BATTERY, parser.nextInt());
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19889);if ((((parser.hasNext())&&(__CLR4_5_2fbefbelwye66vt.R.iget(19890)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19891)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19892);String[] parameters = parser.next().split(",");
            __CLR4_5_2fbefbelwye66vt.R.inc(19893);for (int i = 1; (((i < parameters.length)&&(__CLR4_5_2fbefbelwye66vt.R.iget(19894)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19895)==0&false)); i++) {{
                __CLR4_5_2fbefbelwye66vt.R.inc(19896);position.set(Position.PREFIX_IO + i, parameters[i]);
            }
        }}

        }__CLR4_5_2fbefbelwye66vt.R.inc(19897);if ((((deviceSession != null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(19898)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19899)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19900);return position;
        } }else {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19901);this.position = position; // save position
            __CLR4_5_2fbefbelwye66vt.R.inc(19902);return null;
        }
    }}finally{__CLR4_5_2fbefbelwye66vt.R.flushNeeded();}}

    private Position decodeGpgga(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2fbefbelwye66vt.R.inc(19903);

        __CLR4_5_2fbefbelwye66vt.R.inc(19904);Parser parser = new Parser(PATTERN_GPGGA, sentence);
        __CLR4_5_2fbefbelwye66vt.R.inc(19905);if ((((!parser.matches())&&(__CLR4_5_2fbefbelwye66vt.R.iget(19906)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19907)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19908);return null;
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19909);Position position = new Position();
        __CLR4_5_2fbefbelwye66vt.R.inc(19910);position.setProtocol(getProtocolName());
        __CLR4_5_2fbefbelwye66vt.R.inc(19911);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fbefbelwye66vt.R.inc(19912);DateBuilder dateBuilder = new DateBuilder()
                .setCurrentDate()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19913);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fbefbelwye66vt.R.inc(19914);position.setValid(true);
        __CLR4_5_2fbefbelwye66vt.R.inc(19915);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fbefbelwye66vt.R.inc(19916);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2fbefbelwye66vt.R.inc(19917);return position;
    }finally{__CLR4_5_2fbefbelwye66vt.R.flushNeeded();}}

    private Position decodeGprma(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2fbefbelwye66vt.R.inc(19918);

        __CLR4_5_2fbefbelwye66vt.R.inc(19919);Parser parser = new Parser(PATTERN_GPRMA, sentence);
        __CLR4_5_2fbefbelwye66vt.R.inc(19920);if ((((!parser.matches())&&(__CLR4_5_2fbefbelwye66vt.R.iget(19921)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19922)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19923);return null;
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19924);Position position = new Position();
        __CLR4_5_2fbefbelwye66vt.R.inc(19925);position.setProtocol(getProtocolName());
        __CLR4_5_2fbefbelwye66vt.R.inc(19926);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fbefbelwye66vt.R.inc(19927);position.setTime(new Date());
        __CLR4_5_2fbefbelwye66vt.R.inc(19928);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fbefbelwye66vt.R.inc(19929);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fbefbelwye66vt.R.inc(19930);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2fbefbelwye66vt.R.inc(19931);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19932);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2fbefbelwye66vt.R.inc(19933);return position;
    }finally{__CLR4_5_2fbefbelwye66vt.R.flushNeeded();}}

    private Position decodeTrccr(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2fbefbelwye66vt.R.inc(19934);

        __CLR4_5_2fbefbelwye66vt.R.inc(19935);Parser parser = new Parser(PATTERN_TRCCR, sentence);
        __CLR4_5_2fbefbelwye66vt.R.inc(19936);if ((((!parser.matches())&&(__CLR4_5_2fbefbelwye66vt.R.iget(19937)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19938)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19939);return null;
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19940);Position position = new Position();
        __CLR4_5_2fbefbelwye66vt.R.inc(19941);position.setProtocol(getProtocolName());
        __CLR4_5_2fbefbelwye66vt.R.inc(19942);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fbefbelwye66vt.R.inc(19943);position.setTime(parser.nextDateTime());

        __CLR4_5_2fbefbelwye66vt.R.inc(19944);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fbefbelwye66vt.R.inc(19945);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19946);position.setLongitude(parser.nextDouble(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19947);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19948);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2fbefbelwye66vt.R.inc(19949);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2fbefbelwye66vt.R.inc(19950);position.set(Position.KEY_BATTERY, parser.nextDouble(0));

        __CLR4_5_2fbefbelwye66vt.R.inc(19951);return position;
    }finally{__CLR4_5_2fbefbelwye66vt.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fbefbelwye66vt.R.inc(19952);

        __CLR4_5_2fbefbelwye66vt.R.inc(19953);String sentence = (String) msg;

        __CLR4_5_2fbefbelwye66vt.R.inc(19954);DeviceSession deviceSession;

        __CLR4_5_2fbefbelwye66vt.R.inc(19955);if ((((!sentence.startsWith("$") && sentence.contains("$"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19956)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19957)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19958);int index = sentence.indexOf("$");
            __CLR4_5_2fbefbelwye66vt.R.inc(19959);String id = sentence.substring(0, index);
            __CLR4_5_2fbefbelwye66vt.R.inc(19960);if ((((id.endsWith(","))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19961)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19962)==0&false))) {{
                __CLR4_5_2fbefbelwye66vt.R.inc(19963);id = id.substring(0, id.length() - 1);
            } }else {__CLR4_5_2fbefbelwye66vt.R.inc(19964);if ((((id.endsWith("/"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19965)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19966)==0&false))) {{
                __CLR4_5_2fbefbelwye66vt.R.inc(19967);id = id.substring(id.indexOf('/') + 1, id.length() - 1);
            }
            }}__CLR4_5_2fbefbelwye66vt.R.inc(19968);deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2fbefbelwye66vt.R.inc(19969);sentence = sentence.substring(index);
        } }else {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19970);deviceSession = getDeviceSession(channel, remoteAddress);
        }

        }__CLR4_5_2fbefbelwye66vt.R.inc(19971);if ((((sentence.startsWith("$PGID"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19972)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19973)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19974);getDeviceSession(channel, remoteAddress, sentence.substring(6, sentence.length() - 3));
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(19975);if ((((sentence.startsWith("$PCPTI"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19976)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19977)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19978);getDeviceSession(channel, remoteAddress, sentence.substring(7, sentence.indexOf(",", 7)));
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(19979);if ((((sentence.startsWith("IMEI"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19980)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19981)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19982);getDeviceSession(channel, remoteAddress, sentence.substring(5, sentence.length()));
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(19983);if ((((sentence.startsWith("$GPFID"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19984)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19985)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19986);deviceSession = getDeviceSession(channel, remoteAddress, sentence.substring(7, sentence.length()));
            __CLR4_5_2fbefbelwye66vt.R.inc(19987);if ((((deviceSession != null && position != null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(19988)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19989)==0&false))) {{
                __CLR4_5_2fbefbelwye66vt.R.inc(19990);Position position = this.position;
                __CLR4_5_2fbefbelwye66vt.R.inc(19991);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_2fbefbelwye66vt.R.inc(19992);this.position = null;
                __CLR4_5_2fbefbelwye66vt.R.inc(19993);return position;
            }
        }} }else {__CLR4_5_2fbefbelwye66vt.R.inc(19994);if ((((sentence.matches("^[0-9A-F]+$"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19995)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(19996)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(19997);getDeviceSession(channel, remoteAddress, sentence);
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(19998);if ((((sentence.startsWith("$GPRMC"))&&(__CLR4_5_2fbefbelwye66vt.R.iget(19999)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(20000)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(20001);return decodeGprmc(deviceSession, sentence, remoteAddress, channel);
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(20002);if ((((sentence.startsWith("$GPGGA") && deviceSession != null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(20003)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(20004)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(20005);return decodeGpgga(deviceSession, sentence);
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(20006);if ((((sentence.startsWith("$GPRMA") && deviceSession != null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(20007)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(20008)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(20009);return decodeGprma(deviceSession, sentence);
        } }else {__CLR4_5_2fbefbelwye66vt.R.inc(20010);if ((((sentence.startsWith("$TRCCR") && deviceSession != null)&&(__CLR4_5_2fbefbelwye66vt.R.iget(20011)!=0|true))||(__CLR4_5_2fbefbelwye66vt.R.iget(20012)==0&false))) {{
            __CLR4_5_2fbefbelwye66vt.R.inc(20013);return decodeTrccr(deviceSession, sentence);
        }

        }}}}}}}}}__CLR4_5_2fbefbelwye66vt.R.inc(20014);return null;
    }finally{__CLR4_5_2fbefbelwye66vt.R.flushNeeded();}}

}
