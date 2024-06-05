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

import java.net.SocketAddress;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.helper.Parser.CoordinateFormat;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

public class IdplProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bk6bk6lwye7g18{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,15024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IdplProtocolDecoder(Protocol protocol) {
        super(protocol);__CLR4_5_2bk6bk6lwye7g18.R.inc(14983);try{__CLR4_5_2bk6bk6lwye7g18.R.inc(14982);
    }finally{__CLR4_5_2bk6bk6lwye7g18.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*ID")                         // start of frame
            .number("(d+),")                     // command code
            .number("(d+),")                     // imei
            .number("(dd)(dd)(dd),")             // current date (ddmmyy)
            .number("(dd)(dd)(dd),")             // current time (hhmmss)
            .expression("([A|V]),")              // gps fix
            .number("(dd)(dd).?(d+),([NS]),")    // latitude
            .number("(ddd)(dd).?(d+),([EW]),")   // longitude
            .number("(d{1,3}.dd),")              // speed
            .number("(d{1,3}.dd),")              // course
            .number("(d{1,2}),")                 // sats
            .number("(d{1,3}),")                 // gsm signal strength
            .expression("([A|N|S]),")            // vehicle status
            .expression("([0|1]),")              // main power status
            .number("(d.dd),")                   // internal battery voltage
            .expression("([0|1]),")              // sos alert
            .expression("([0|1]),")              // body tamper
            .expression("([0|1])([0|1]),")       // ac status + ign status
            .expression("([0|1|2]),")            // output1 status
            .number("(d{1,3}),")                 // adc1
            .number("(d{1,3}),")                 // adc2
            .expression("([0-9A-Z]{3}),")        // software version
            .expression("([L|R]),")              // message type
            .number("(x{4})#")                   // crc
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bk6bk6lwye7g18.R.inc(14984);

        __CLR4_5_2bk6bk6lwye7g18.R.inc(14985);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2bk6bk6lwye7g18.R.inc(14986);if ((((!parser.matches())&&(__CLR4_5_2bk6bk6lwye7g18.R.iget(14987)!=0|true))||(__CLR4_5_2bk6bk6lwye7g18.R.iget(14988)==0&false))) {{
            __CLR4_5_2bk6bk6lwye7g18.R.inc(14989);return null;
        }

        }__CLR4_5_2bk6bk6lwye7g18.R.inc(14990);Position position = new Position();
        __CLR4_5_2bk6bk6lwye7g18.R.inc(14991);position.setProtocol(getProtocolName());

        __CLR4_5_2bk6bk6lwye7g18.R.inc(14992);position.set(Position.KEY_TYPE, parser.nextInt(0));

        __CLR4_5_2bk6bk6lwye7g18.R.inc(14993);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2bk6bk6lwye7g18.R.inc(14994);if ((((deviceSession == null)&&(__CLR4_5_2bk6bk6lwye7g18.R.iget(14995)!=0|true))||(__CLR4_5_2bk6bk6lwye7g18.R.iget(14996)==0&false))) {{
            __CLR4_5_2bk6bk6lwye7g18.R.inc(14997);return null;
        }
        }__CLR4_5_2bk6bk6lwye7g18.R.inc(14998);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bk6bk6lwye7g18.R.inc(14999);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2bk6bk6lwye7g18.R.inc(15000);position.setValid(parser.next().equals("A"));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15001);position.setLatitude(parser.nextCoordinate(CoordinateFormat.DEG_MIN_MIN_HEM));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15002);position.setLongitude(parser.nextCoordinate(CoordinateFormat.DEG_MIN_MIN_HEM));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15003);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15004);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2bk6bk6lwye7g18.R.inc(15005);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15006);position.set(Position.KEY_RSSI, parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15007);position.set("vehicleStatus", parser.next());
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15008);position.set(Position.KEY_POWER, parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15009);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15010);if ((((parser.nextInt(0) == 1)&&(__CLR4_5_2bk6bk6lwye7g18.R.iget(15011)!=0|true))||(__CLR4_5_2bk6bk6lwye7g18.R.iget(15012)==0&false))) {{
            __CLR4_5_2bk6bk6lwye7g18.R.inc(15013);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        }
        }__CLR4_5_2bk6bk6lwye7g18.R.inc(15014);parser.nextInt(0); // body tamper
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15015);position.set("acStatus", parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15016);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15017);position.set(Position.KEY_OUTPUT, parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15018);position.set(Position.PREFIX_ADC + 1, parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15019);position.set(Position.PREFIX_ADC + 2, parser.nextInt(0));
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15020);position.set(Position.KEY_VERSION_FW, parser.next());
        __CLR4_5_2bk6bk6lwye7g18.R.inc(15021);position.set(Position.KEY_ARCHIVE, parser.next().equals("R"));

        __CLR4_5_2bk6bk6lwye7g18.R.inc(15022);parser.next(); // checksum

        __CLR4_5_2bk6bk6lwye7g18.R.inc(15023);return position;
    }finally{__CLR4_5_2bk6bk6lwye7g18.R.flushNeeded();}}

}
