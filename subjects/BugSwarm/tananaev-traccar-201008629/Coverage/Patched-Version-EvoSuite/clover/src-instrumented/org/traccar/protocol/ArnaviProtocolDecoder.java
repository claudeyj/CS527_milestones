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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class ArnaviProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25ng5nglx1dz9jd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,7355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public ArnaviProtocolDecoder(ArnaviProtocol protocol) {
        super(protocol);__CLR4_5_25ng5nglx1dz9jd.R.inc(7325);try{__CLR4_5_25ng5nglx1dz9jd.R.inc(7324);
    }finally{__CLR4_5_25ng5nglx1dz9jd.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$AV,")
            .number("Vd,")                       // type
            .number("(d+),")                     // device id
            .number("(d+),")                     // index
            .number("(d+),")                     // power
            .number("(d+),")                     // battery
            .number("-?d+,")
            .expression("[01],")                 // movement
            .expression("([01]),")               // ignition
            .number("(d+),")                     // input
            .number("d+,d+,")                    // input 1
            .number("d+,d+,").optional()         // input 2
            .expression("[01],")                 // fix type
            .number("(d+),")                     // satellites
            .number("(dd)(dd)(dd),")             // time
            .number("(dd)(dd.d+)([NS]),")        // latitude
            .number("(ddd)(dd.d+)([EW]),")       // longitude
            .number("(d+.d+),")                  // speed
            .number("(d+.d+),")                  // course
            .number("(dd)(dd)(dd)")              // date
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25ng5nglx1dz9jd.R.inc(7326);

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7327);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7328);if ((((!parser.matches())&&(__CLR4_5_25ng5nglx1dz9jd.R.iget(7329)!=0|true))||(__CLR4_5_25ng5nglx1dz9jd.R.iget(7330)==0&false))) {{
            __CLR4_5_25ng5nglx1dz9jd.R.inc(7331);return null;
        }

        }__CLR4_5_25ng5nglx1dz9jd.R.inc(7332);Position position = new Position();
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7333);position.setProtocol(getProtocolName());

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7334);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7335);if ((((deviceSession == null)&&(__CLR4_5_25ng5nglx1dz9jd.R.iget(7336)!=0|true))||(__CLR4_5_25ng5nglx1dz9jd.R.iget(7337)==0&false))) {{
            __CLR4_5_25ng5nglx1dz9jd.R.inc(7338);return null;
        }
        }__CLR4_5_25ng5nglx1dz9jd.R.inc(7339);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7340);position.set(Position.KEY_INDEX, parser.nextInt());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7341);position.set(Position.KEY_POWER, parser.nextInt() * 0.01);
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7342);position.set(Position.KEY_BATTERY, parser.nextInt() * 0.01);
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7343);position.set(Position.KEY_IGNITION, parser.nextInt() == 1);
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7344);position.set(Position.KEY_INPUT, parser.nextInt());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7345);position.set(Position.KEY_SATELLITES, parser.nextInt());

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7346);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7347);position.setValid(true);
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7348);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7349);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7350);position.setSpeed(parser.nextDouble());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7351);position.setCourse(parser.nextDouble());

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7352);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_25ng5nglx1dz9jd.R.inc(7353);position.setTime(dateBuilder.getDate());

        __CLR4_5_25ng5nglx1dz9jd.R.inc(7354);return position;
    }finally{__CLR4_5_25ng5nglx1dz9jd.R.flushNeeded();}}

}
