/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Tlt2hProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2e2pe2plx1dwknv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,18281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tlt2hProtocolDecoder(Tlt2hProtocol protocol) {
        super(protocol);__CLR4_5_2e2pe2plx1dwknv.R.inc(18242);try{__CLR4_5_2e2pe2plx1dwknv.R.inc(18241);
    }finally{__CLR4_5_2e2pe2plx1dwknv.R.flushNeeded();}}

    private static final Pattern PATTERN_HEADER = new PatternBuilder()
            .number("#(d+)#")                    // imei
            .expression("[^#]*#")
            .number("d+#")
            .expression("([^#]+)#")              // status
            .number("d+")                        // number of records
            .compile();

    private static final Pattern PATTERN_POSITION = new PatternBuilder()
            .number("#(x+)?")                    // cell info
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).(d+),")        // time
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d+)(dd.d+),")              // longitude
            .number("([EW]),")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2e2pe2plx1dwknv.R.inc(18243);

        __CLR4_5_2e2pe2plx1dwknv.R.inc(18244);String sentence = (String) msg;
        __CLR4_5_2e2pe2plx1dwknv.R.inc(18245);sentence = sentence.trim();

        __CLR4_5_2e2pe2plx1dwknv.R.inc(18246);String header = sentence.substring(0, sentence.indexOf('\r'));
        __CLR4_5_2e2pe2plx1dwknv.R.inc(18247);Parser parser = new Parser(PATTERN_HEADER, header);
        __CLR4_5_2e2pe2plx1dwknv.R.inc(18248);if ((((!parser.matches())&&(__CLR4_5_2e2pe2plx1dwknv.R.iget(18249)!=0|true))||(__CLR4_5_2e2pe2plx1dwknv.R.iget(18250)==0&false))) {{
            __CLR4_5_2e2pe2plx1dwknv.R.inc(18251);return null;
        }

        }__CLR4_5_2e2pe2plx1dwknv.R.inc(18252);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2e2pe2plx1dwknv.R.inc(18253);if ((((deviceSession == null)&&(__CLR4_5_2e2pe2plx1dwknv.R.iget(18254)!=0|true))||(__CLR4_5_2e2pe2plx1dwknv.R.iget(18255)==0&false))) {{
            __CLR4_5_2e2pe2plx1dwknv.R.inc(18256);return null;
        }

        }__CLR4_5_2e2pe2plx1dwknv.R.inc(18257);String status = parser.next();

        __CLR4_5_2e2pe2plx1dwknv.R.inc(18258);String[] messages = sentence.substring(sentence.indexOf('\n') + 1).split("\r\n");
        __CLR4_5_2e2pe2plx1dwknv.R.inc(18259);List<Position> positions = new LinkedList<>();

        __CLR4_5_2e2pe2plx1dwknv.R.inc(18260);for (String message : messages) {{
            __CLR4_5_2e2pe2plx1dwknv.R.inc(18261);parser = new Parser(PATTERN_POSITION, message);
            __CLR4_5_2e2pe2plx1dwknv.R.inc(18262);if ((((parser.matches())&&(__CLR4_5_2e2pe2plx1dwknv.R.iget(18263)!=0|true))||(__CLR4_5_2e2pe2plx1dwknv.R.iget(18264)==0&false))) {{

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18265);Position position = new Position();
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18266);position.setProtocol(getProtocolName());
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18267);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18268);parser.next(); // base station info

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18269);DateBuilder dateBuilder = new DateBuilder()
                        .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18270);parser.next();

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18271);position.setValid(parser.next().equals("A"));
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18272);position.setLatitude(parser.nextCoordinate());
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18273);position.setLongitude(parser.nextCoordinate());
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18274);position.setSpeed(parser.nextDouble());
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18275);position.setCourse(parser.nextDouble());

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18276);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
                __CLR4_5_2e2pe2plx1dwknv.R.inc(18277);position.setTime(dateBuilder.getDate());

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18278);position.set(Position.KEY_STATUS, status);

                __CLR4_5_2e2pe2plx1dwknv.R.inc(18279);positions.add(position);
            }
        }}

        }__CLR4_5_2e2pe2plx1dwknv.R.inc(18280);return positions;
    }finally{__CLR4_5_2e2pe2plx1dwknv.R.flushNeeded();}}

}
