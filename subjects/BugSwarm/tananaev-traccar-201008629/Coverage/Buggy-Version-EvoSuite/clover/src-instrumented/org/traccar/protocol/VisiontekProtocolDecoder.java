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

public class VisiontekProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2f9of9olx1dvfdx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,19843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public VisiontekProtocolDecoder(VisiontekProtocol protocol) {
        super(protocol);__CLR4_5_2f9of9olx1dvfdx.R.inc(19789);try{__CLR4_5_2f9of9olx1dvfdx.R.inc(19788);
    }finally{__CLR4_5_2f9of9olx1dvfdx.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$1,")
            .expression("([^,]+),")              // identifier
            .number("(d+),").optional()          // imei
            .number("(dd),(dd),(dd),")           // date
            .number("(dd),(dd),(dd),")           // time
            .groupBegin()
            .number("(dd)(dd).?(d+)([NS]),")     // latitude
            .number("(ddd)(dd).?(d+)([EW]),")    // longitude
            .or()
            .number("(dd.d+)([NS]),")            // latitude
            .number("(ddd.d+)([EW]),")           // longitude
            .groupEnd()
            .number("(d+.?d+),")                 // speed
            .number("(d+),")                     // course
            .groupBegin()
            .number("(d+),")                     // altitude
            .number("(d+),")                     // satellites
            .number("(d+),")                     // odometer
            .number("([01]),")                   // ignition
            .number("([01]),")                   // input 1
            .number("([01]),")                   // input 2
            .number("([01]),")                   // immobilizer
            .number("([01]),")                   // external battery status
            .number("(d+),")                     // gsm
            .or()
            .number("(d+.d),")                   // hdop
            .number("(d+),")                     // altitude
            .number("(d+),")                     // odometer
            .number("([01],[01],[01],[01]),")    // input
            .number("([01],[01],[01],[01]),")    // output
            .number("(d+.?d*),")                 // adc 1
            .number("(d+.?d*),")                 // adc 2
            .groupEnd("?")
            .any()
            .expression("([AV])")                // validity
            .number(",(d{10})").optional()       // rfid
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2f9of9olx1dvfdx.R.inc(19790);

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19791);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2f9of9olx1dvfdx.R.inc(19792);if ((((!parser.matches())&&(__CLR4_5_2f9of9olx1dvfdx.R.iget(19793)!=0|true))||(__CLR4_5_2f9of9olx1dvfdx.R.iget(19794)==0&false))) {{
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19795);return null;
        }

        }__CLR4_5_2f9of9olx1dvfdx.R.inc(19796);Position position = new Position();
        __CLR4_5_2f9of9olx1dvfdx.R.inc(19797);position.setProtocol(getProtocolName());

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19798);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next(), parser.next());
        __CLR4_5_2f9of9olx1dvfdx.R.inc(19799);if ((((deviceSession == null)&&(__CLR4_5_2f9of9olx1dvfdx.R.iget(19800)!=0|true))||(__CLR4_5_2f9of9olx1dvfdx.R.iget(19801)==0&false))) {{
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19802);return null;
        }
        }__CLR4_5_2f9of9olx1dvfdx.R.inc(19803);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19804);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2f9of9olx1dvfdx.R.inc(19805);position.setTime(dateBuilder.getDate());

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19806);if ((((parser.hasNext(8))&&(__CLR4_5_2f9of9olx1dvfdx.R.iget(19807)!=0|true))||(__CLR4_5_2f9of9olx1dvfdx.R.iget(19808)==0&false))) {{
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19809);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN_HEM));
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19810);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN_HEM));
        }
        }__CLR4_5_2f9of9olx1dvfdx.R.inc(19811);if ((((parser.hasNext(4))&&(__CLR4_5_2f9of9olx1dvfdx.R.iget(19812)!=0|true))||(__CLR4_5_2f9of9olx1dvfdx.R.iget(19813)==0&false))) {{
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19814);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19815);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
        }

        }__CLR4_5_2f9of9olx1dvfdx.R.inc(19816);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(
                parser.next().replace(".", "")) / 10));

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19817);position.setCourse(parser.nextDouble());

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19818);if ((((parser.hasNext(9))&&(__CLR4_5_2f9of9olx1dvfdx.R.iget(19819)!=0|true))||(__CLR4_5_2f9of9olx1dvfdx.R.iget(19820)==0&false))) {{
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19821);position.setAltitude(parser.nextDouble());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19822);position.set(Position.KEY_SATELLITES, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19823);position.set(Position.KEY_ODOMETER, parser.nextInt() * 1000);
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19824);position.set(Position.KEY_IGNITION, parser.next().equals("1"));
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19825);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19826);position.set(Position.PREFIX_IO + 2, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19827);position.set("immobilizer", parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19828);position.set(Position.KEY_POWER, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19829);position.set(Position.KEY_RSSI, parser.next());
        }

        }__CLR4_5_2f9of9olx1dvfdx.R.inc(19830);if ((((parser.hasNext(7))&&(__CLR4_5_2f9of9olx1dvfdx.R.iget(19831)!=0|true))||(__CLR4_5_2f9of9olx1dvfdx.R.iget(19832)==0&false))) {{
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19833);position.set(Position.KEY_HDOP, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19834);position.setAltitude(parser.nextDouble());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19835);position.set(Position.KEY_ODOMETER, parser.nextInt() * 1000);
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19836);position.set(Position.KEY_INPUT, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19837);position.set(Position.KEY_OUTPUT, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19838);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2f9of9olx1dvfdx.R.inc(19839);position.set(Position.PREFIX_ADC + 2, parser.next());
        }

        }__CLR4_5_2f9of9olx1dvfdx.R.inc(19840);position.setValid(parser.next().equals("A"));

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19841);position.set(Position.KEY_RFID, parser.next());

        __CLR4_5_2f9of9olx1dvfdx.R.inc(19842);return position;
    }finally{__CLR4_5_2f9of9olx1dvfdx.R.flushNeeded();}}

}
