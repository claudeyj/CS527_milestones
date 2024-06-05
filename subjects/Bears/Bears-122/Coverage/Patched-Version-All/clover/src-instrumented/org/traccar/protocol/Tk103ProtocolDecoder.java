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
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Tk103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2g3ug3ulwye7h4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,21053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk103ProtocolDecoder(Tk103Protocol protocol) {
        super(protocol);__CLR4_5_2g3ug3ulwye7h4h.R.inc(20875);try{__CLR4_5_2g3ug3ulwye7h4h.R.inc(20874);
    }finally{__CLR4_5_2g3ug3ulwye7h4h.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(d+)(,)?")                  // device id
            .expression("(.{4}),?")              // command
            .number("(d*)")
            .number("(dd)(dd)(dd),?")            // date (mmddyy if comma-delimited, otherwise yyddmm)
            .expression("([AV]),?")              // validity
            .number("(d+)(dd.d+)")               // latitude
            .expression("([NS]),?")
            .number("(d+)(dd.d+)")               // longitude
            .expression("([EW]),?")
            .number("(d+.d)(?:d*,)?")            // speed
            .number("(dd)(dd)(dd),?")            // time (hhmmss)
            .number("(d+.?d{1,2}),?")            // course
            .number("(?:([01]{8})|(x{8}))?,?")   // state
            .number("(?:L(x+))?")                // odometer
            .any()
            .number("([+-]ddd.d)?")              // temperature
            .text(")").optional()
            .compile();

    private static final Pattern PATTERN_BATTERY = new PatternBuilder()
            .number("(d+),")                     // device id
            .text("ZC20,")
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("d+,")                       // battery level
            .number("(d+),")                     // battery voltage
            .number("(d+),")                     // power voltage
            .number("d+")                        // installed
            .compile();

    private static final Pattern PATTERN_NETWORK = new PatternBuilder()
            .number("(d{12})")                   // device id
            .text("BZ00,")
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(x+),")                     // lac
            .number("(x+),")                     // cid
            .any()
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2g3ug3ulwye7h4h.R.inc(20876);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2g3ug3ulwye7h4h.R.inc(20877);switch (value) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20878);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20879);return Position.ALARM_ACCIDENT;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20880);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20881);return Position.ALARM_SOS;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20882);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20883);return Position.ALARM_VIBRATION;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20884);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20885);return Position.ALARM_LOW_SPEED;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20886);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20887);return Position.ALARM_OVERSPEED;
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20888);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20889);return Position.ALARM_GEOFENCE_EXIT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20890);__CLB4_5_2_bool0=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20891);return null;
        }
    }finally{__CLR4_5_2g3ug3ulwye7h4h.R.flushNeeded();}}

    private void decodeType(Position position, String type, String data) {try{__CLR4_5_2g3ug3ulwye7h4h.R.inc(20892);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2g3ug3ulwye7h4h.R.inc(20893);switch (type) {
            case "BO01":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20894);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20895);position.set(Position.KEY_ALARM, decodeAlarm(data.charAt(0) - '0'));
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20896);break;
            case "ZC11":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20897);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20898);position.set(Position.KEY_ALARM, Position.ALARM_MOVEMENT);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20899);break;
            case "ZC12":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20900);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20901);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20902);break;
            case "ZC13":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20903);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20904);position.set(Position.KEY_ALARM, Position.ALARM_POWER_CUT);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20905);break;
            case "ZC15":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20906);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20907);position.set(Position.KEY_IGNITION, true);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20908);break;
            case "ZC16":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20909);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20910);position.set(Position.KEY_IGNITION, false);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20911);break;
            case "ZC17":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20912);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20913);position.set(Position.KEY_ALARM, Position.ALARM_REMOVING);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20914);break;
            case "ZC25":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20915);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20916);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20917);break;
            case "ZC26":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20918);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20919);position.set(Position.KEY_ALARM, Position.ALARM_TAMPERING);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20920);break;
            case "ZC27":if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20921);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20922);position.set(Position.KEY_ALARM, Position.ALARM_LOW_POWER);
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20923);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20924);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20925);break;
        }
    }finally{__CLR4_5_2g3ug3ulwye7h4h.R.flushNeeded();}}

    private Position decodeBattery(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2g3ug3ulwye7h4h.R.inc(20926);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20927);Parser parser = new Parser(PATTERN_BATTERY, sentence);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20928);if ((((!parser.matches())&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20929)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20930)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20931);return null;
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20932);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20933);if ((((deviceSession == null)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20934)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20935)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20936);return null;
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20937);Position position = new Position();
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20938);position.setProtocol(getProtocolName());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20939);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20940);getLastLocation(position, parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20941);int battery = parser.nextInt(0);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20942);if ((((battery != 65535)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20943)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20944)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20945);position.set(Position.KEY_BATTERY, battery * 0.01);
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20946);int power = parser.nextInt(0);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20947);if ((((power != 65535)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20948)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20949)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20950);position.set(Position.KEY_POWER, power * 0.1);
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20951);return position;
    }finally{__CLR4_5_2g3ug3ulwye7h4h.R.flushNeeded();}}

    private Position decodeNetwork(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2g3ug3ulwye7h4h.R.inc(20952);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20953);Parser parser = new Parser(PATTERN_NETWORK, sentence);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20954);if ((((!parser.matches())&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20955)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20956)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20957);return null;
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20958);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20959);if ((((deviceSession == null)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20960)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20961)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20962);return null;
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20963);Position position = new Position();
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20964);position.setProtocol(getProtocolName());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20965);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20966);getLastLocation(position, null);

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20967);position.setNetwork(new Network(CellTower.from(
                parser.nextInt(0), parser.nextInt(0), parser.nextHexInt(0), parser.nextHexInt(0))));

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20968);return position;
    }finally{__CLR4_5_2g3ug3ulwye7h4h.R.flushNeeded();}}
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2g3ug3ulwye7h4h.R.inc(20969);

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20970);String sentence = (String) msg;

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20971);int beginIndex = sentence.indexOf('(');
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20972);if ((((beginIndex != -1)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20973)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20974)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20975);sentence = sentence.substring(beginIndex + 1);
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20976);if ((((channel != null)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20977)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20978)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20979);String id = sentence.substring(0, 12);
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20980);String type = sentence.substring(12, 16);
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20981);if ((((type.equals("BP00"))&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20982)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20983)==0&false))) {{
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20984);channel.write("(" + id + "AP01HSO)");
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20985);return null;
            } }else {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20986);if ((((type.equals("BP05"))&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20987)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20988)==0&false))) {{
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(20989);channel.write("(" + id + "AP05)");
            }
        }}}

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(20990);if ((((sentence.contains("ZC20"))&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20991)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20992)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20993);return decodeBattery(channel, remoteAddress, sentence);
        } }else {__CLR4_5_2g3ug3ulwye7h4h.R.inc(20994);if ((((sentence.contains("BZ00"))&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20995)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(20996)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(20997);return decodeNetwork(channel, remoteAddress, sentence);
        }

        }}__CLR4_5_2g3ug3ulwye7h4h.R.inc(20998);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(20999);if ((((!parser.matches())&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21000)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21001)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21002);return null;
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(21003);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21004);if ((((deviceSession == null)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21005)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21006)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21007);return null;
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(21008);Position position = new Position();
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21009);position.setProtocol(getProtocolName());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21010);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21011);boolean alternative = parser.next() != null;

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21012);decodeType(position, parser.next(), parser.next());

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21013);DateBuilder dateBuilder = new DateBuilder();
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21014);if ((((alternative)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21015)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21016)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21017);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        } }else {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21018);dateBuilder.setDate(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(21019);position.setValid(parser.next().equals("A"));
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21020);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21021);position.setLongitude(parser.nextCoordinate());

        boolean __CLB4_5_2_bool2=false;__CLR4_5_2g3ug3ulwye7h4h.R.inc(21022);switch (Context.getConfig().getString(getProtocolName() + ".speed", "kmh")) {
            case "kn":if (!__CLB4_5_2_bool2) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(21023);__CLB4_5_2_bool2=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(21024);position.setSpeed(parser.nextDouble(0));
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(21025);break;
            case "mph":if (!__CLB4_5_2_bool2) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(21026);__CLB4_5_2_bool2=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(21027);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble(0)));
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(21028);break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2g3ug3ulwye7h4h.R.inc(21029);__CLB4_5_2_bool2=true;}
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(21030);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
                __CLR4_5_2g3ug3ulwye7h4h.R.inc(21031);break;
        }

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21032);dateBuilder.setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21033);position.setTime(dateBuilder.getDate());

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21034);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21035);String status = parser.next();
        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21036);if ((((status != null)&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21037)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21038)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21039);position.set(Position.KEY_STATUS, status); // binary status

            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21040);int value = Integer.parseInt(new StringBuilder(status).reverse().toString(), 2);
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21041);position.set(Position.KEY_CHARGE, !BitUtil.check(value, 0));
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21042);position.set(Position.KEY_IGNITION, BitUtil.check(value, 1));
        }
        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(21043);position.set(Position.KEY_STATUS, parser.next()); // hex status

        __CLR4_5_2g3ug3ulwye7h4h.R.inc(21044);if ((((parser.hasNext())&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21045)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21046)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21047);position.set(Position.KEY_ODOMETER, parser.nextLong(16, 0));
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(21048);if ((((parser.hasNext())&&(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21049)!=0|true))||(__CLR4_5_2g3ug3ulwye7h4h.R.iget(21050)==0&false))) {{
            __CLR4_5_2g3ug3ulwye7h4h.R.inc(21051);position.set(Position.PREFIX_TEMP + 1, parser.nextDouble(0));
        }

        }__CLR4_5_2g3ug3ulwye7h4h.R.inc(21052);return position;
    }finally{__CLR4_5_2g3ug3ulwye7h4h.R.flushNeeded();}}

}
