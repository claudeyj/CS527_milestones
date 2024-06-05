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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class GnxProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28d88d8lx1dzalk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,10885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GnxProtocolDecoder(GnxProtocol protocol) {
        super(protocol);__CLR4_5_28d88d8lx1dzalk.R.inc(10845);try{__CLR4_5_28d88d8lx1dzalk.R.inc(10844);
    }finally{__CLR4_5_28d88d8lx1dzalk.R.flushNeeded();}}

    private static final Pattern PATTERN_LOCATION = new PatternBuilder()
            .number("(d+),")                     // imei
            .number("d+,")                       // length
            .expression("([01]),")               // history
            .number("(dd)(dd)(dd),")             // device time
            .number("(dd)(dd)(dd),")             // device date
            .number("(dd)(dd)(dd),")             // fix time
            .number("(dd)(dd)(dd),")             // fix date
            .number("(d),")                      // valid
            .number("(dd.d+),")                  // latitude
            .expression("([NS]),")
            .number("(ddd.d+),")                 // longitude
            .expression("([EW]),")
            .compile();

    private static final Pattern PATTERN_MIF = new PatternBuilder()
            .text("$GNX_MIF,")
            .expression(PATTERN_LOCATION.pattern())
            .expression("[01],")                 // valid card
            .expression("([^,]+),")              // rfid
            .any()
            .compile();

    private static final Pattern PATTERN_OTHER = new PatternBuilder()
            .text("$GNX_")
            .expression("...,")
            .expression(PATTERN_LOCATION.pattern())
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28d88d8lx1dzalk.R.inc(10846);

        __CLR4_5_28d88d8lx1dzalk.R.inc(10847);String sentence = (String) msg;
        __CLR4_5_28d88d8lx1dzalk.R.inc(10848);String type = sentence.substring(5, 8);

        __CLR4_5_28d88d8lx1dzalk.R.inc(10849);Pattern pattern;
        __CLR4_5_28d88d8lx1dzalk.R.inc(10850);if ((((type.equals("MIF"))&&(__CLR4_5_28d88d8lx1dzalk.R.iget(10851)!=0|true))||(__CLR4_5_28d88d8lx1dzalk.R.iget(10852)==0&false))) {{
            __CLR4_5_28d88d8lx1dzalk.R.inc(10853);pattern = PATTERN_MIF;
        } }else {{
            __CLR4_5_28d88d8lx1dzalk.R.inc(10854);pattern = PATTERN_OTHER;
        }

        }__CLR4_5_28d88d8lx1dzalk.R.inc(10855);Parser parser = new Parser(pattern, sentence);
        __CLR4_5_28d88d8lx1dzalk.R.inc(10856);if ((((!parser.matches())&&(__CLR4_5_28d88d8lx1dzalk.R.iget(10857)!=0|true))||(__CLR4_5_28d88d8lx1dzalk.R.iget(10858)==0&false))) {{
            __CLR4_5_28d88d8lx1dzalk.R.inc(10859);return null;
        }

        }__CLR4_5_28d88d8lx1dzalk.R.inc(10860);Position position = new Position();
        __CLR4_5_28d88d8lx1dzalk.R.inc(10861);position.setProtocol(getProtocolName());

        __CLR4_5_28d88d8lx1dzalk.R.inc(10862);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_28d88d8lx1dzalk.R.inc(10863);if ((((deviceSession == null)&&(__CLR4_5_28d88d8lx1dzalk.R.iget(10864)!=0|true))||(__CLR4_5_28d88d8lx1dzalk.R.iget(10865)==0&false))) {{
            __CLR4_5_28d88d8lx1dzalk.R.inc(10866);return null;
        }
        }__CLR4_5_28d88d8lx1dzalk.R.inc(10867);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_28d88d8lx1dzalk.R.inc(10868);if ((((parser.nextInt() == 1)&&(__CLR4_5_28d88d8lx1dzalk.R.iget(10869)!=0|true))||(__CLR4_5_28d88d8lx1dzalk.R.iget(10870)==0&false))) {{
            __CLR4_5_28d88d8lx1dzalk.R.inc(10871);position.set(Position.KEY_ARCHIVE, true);
        }

        }__CLR4_5_28d88d8lx1dzalk.R.inc(10872);DateBuilder dateBuilder;

        __CLR4_5_28d88d8lx1dzalk.R.inc(10873);dateBuilder = new DateBuilder(TimeZone.getTimeZone("GMT+5:30"))
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_28d88d8lx1dzalk.R.inc(10874);position.setDeviceTime(dateBuilder.getDate());

        __CLR4_5_28d88d8lx1dzalk.R.inc(10875);dateBuilder = new DateBuilder(TimeZone.getTimeZone("GMT+5:30"))
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_28d88d8lx1dzalk.R.inc(10876);position.setFixTime(dateBuilder.getDate());

        __CLR4_5_28d88d8lx1dzalk.R.inc(10877);position.setValid(parser.nextInt() != 0);

        __CLR4_5_28d88d8lx1dzalk.R.inc(10878);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
        __CLR4_5_28d88d8lx1dzalk.R.inc(10879);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));

        __CLR4_5_28d88d8lx1dzalk.R.inc(10880);if ((((type.equals("MIF"))&&(__CLR4_5_28d88d8lx1dzalk.R.iget(10881)!=0|true))||(__CLR4_5_28d88d8lx1dzalk.R.iget(10882)==0&false))) {{
            __CLR4_5_28d88d8lx1dzalk.R.inc(10883);position.set(Position.KEY_RFID, parser.next());
        }

        }__CLR4_5_28d88d8lx1dzalk.R.inc(10884);return position;
    }finally{__CLR4_5_28d88d8lx1dzalk.R.flushNeeded();}}

}