/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class FlextrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27jx7jxlx1dxo27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,9846,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FlextrackProtocolDecoder(FlextrackProtocol protocol) {
        super(protocol);__CLR4_5_27jx7jxlx1dxo27.R.inc(9790);try{__CLR4_5_27jx7jxlx1dxo27.R.inc(9789);
    }finally{__CLR4_5_27jx7jxlx1dxo27.R.flushNeeded();}}

    private static final Pattern PATTERN_LOGON = new PatternBuilder()
            .number("(-?d+),")                   // index
            .text("LOGON,")
            .number("(d+),")                     // node id
            .number("(d+)")                      // iccid
            .compile();

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(-?d+),")                   // index
            .text("UNITSTAT,")
            .number("(dddd)(dd)(dd),")           // date
            .number("(dd)(dd)(dd),")             // time
            .number("d+,")                       // node id
            .number("([NS])(d+).(d+.d+),")       // latitude
            .number("([EW])(d+).(d+.d+),")       // longitude
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // satellites
            .number("(d+),")                     // battery
            .number("(-?d+),")                   // gsm
            .number("(x+),")                     // state
            .number("(ddd)")                     // mcc
            .number("(dd),")                     // mnc
            .number("(-?d+),")                   // altitude
            .number("(d+),")                     // hdop
            .number("(x+),")                     // cell
            .number("d+,")                       // gps fix time
            .number("(x+),")                     // lac
            .number("(d+)")                      // odometer
            .compile();

    private void sendAcknowledgement(Channel channel, String index) {try{__CLR4_5_27jx7jxlx1dxo27.R.inc(9791);
        __CLR4_5_27jx7jxlx1dxo27.R.inc(9792);if ((((channel != null)&&(__CLR4_5_27jx7jxlx1dxo27.R.iget(9793)!=0|true))||(__CLR4_5_27jx7jxlx1dxo27.R.iget(9794)==0&false))) {{
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9795);channel.write(index + ",ACK\r");
        }
    }}finally{__CLR4_5_27jx7jxlx1dxo27.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27jx7jxlx1dxo27.R.inc(9796);

        __CLR4_5_27jx7jxlx1dxo27.R.inc(9797);String sentence = (String) msg;

        __CLR4_5_27jx7jxlx1dxo27.R.inc(9798);if ((((sentence.contains("LOGON"))&&(__CLR4_5_27jx7jxlx1dxo27.R.iget(9799)!=0|true))||(__CLR4_5_27jx7jxlx1dxo27.R.iget(9800)==0&false))) {{

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9801);Parser parser = new Parser(PATTERN_LOGON, sentence);
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9802);if ((((!parser.matches())&&(__CLR4_5_27jx7jxlx1dxo27.R.iget(9803)!=0|true))||(__CLR4_5_27jx7jxlx1dxo27.R.iget(9804)==0&false))) {{
                __CLR4_5_27jx7jxlx1dxo27.R.inc(9805);return null;
            }

            }__CLR4_5_27jx7jxlx1dxo27.R.inc(9806);sendAcknowledgement(channel, parser.next());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9807);String id = parser.next();
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9808);String iccid = parser.next();

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9809);getDeviceSession(channel, remoteAddress, iccid, id);

        } }else {__CLR4_5_27jx7jxlx1dxo27.R.inc(9810);if ((((sentence.contains("UNITSTAT"))&&(__CLR4_5_27jx7jxlx1dxo27.R.iget(9811)!=0|true))||(__CLR4_5_27jx7jxlx1dxo27.R.iget(9812)==0&false))) {{

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9813);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9814);if ((((deviceSession == null)&&(__CLR4_5_27jx7jxlx1dxo27.R.iget(9815)!=0|true))||(__CLR4_5_27jx7jxlx1dxo27.R.iget(9816)==0&false))) {{
                __CLR4_5_27jx7jxlx1dxo27.R.inc(9817);return null;
            }

            }__CLR4_5_27jx7jxlx1dxo27.R.inc(9818);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9819);if ((((!parser.matches())&&(__CLR4_5_27jx7jxlx1dxo27.R.iget(9820)!=0|true))||(__CLR4_5_27jx7jxlx1dxo27.R.iget(9821)==0&false))) {{
                __CLR4_5_27jx7jxlx1dxo27.R.inc(9822);return null;
            }

            }__CLR4_5_27jx7jxlx1dxo27.R.inc(9823);Position position = new Position();
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9824);position.setProtocol(getProtocolName());
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9825);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9826);sendAcknowledgement(channel, parser.next());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9827);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9828);position.setTime(dateBuilder.getDate());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9829);position.setValid(true);
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9830);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9831);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9832);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextInt()));
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9833);position.setCourse(parser.nextInt());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9834);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9835);position.set(Position.KEY_BATTERY, parser.nextInt());
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9836);position.set(Position.KEY_RSSI, parser.nextInt());
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9837);position.set(Position.KEY_STATUS, parser.nextInt(16));

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9838);int mcc = parser.nextInt();
            __CLR4_5_27jx7jxlx1dxo27.R.inc(9839);int mnc = parser.nextInt();

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9840);position.setAltitude(parser.nextInt());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9841);position.set(Position.KEY_HDOP, parser.nextInt() * 0.1);

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9842);position.setNetwork(new Network(CellTower.from(mcc, mnc, parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9843);position.set(Position.KEY_ODOMETER, parser.nextInt());

            __CLR4_5_27jx7jxlx1dxo27.R.inc(9844);return position;
        }

        }}__CLR4_5_27jx7jxlx1dxo27.R.inc(9845);return null;
    }finally{__CLR4_5_27jx7jxlx1dxo27.R.flushNeeded();}}

}