/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class HaicomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2b94b94lwye40fd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,14625,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public HaicomProtocolDecoder(HaicomProtocol protocol) {
        super(protocol);__CLR4_5_2b94b94lwye40fd.R.inc(14585);try{__CLR4_5_2b94b94lwye40fd.R.inc(14584);
    }finally{__CLR4_5_2b94b94lwye40fd.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$GPRS")
            .number("(d+),")                     // imei
            .expression("([^,]+),")              // version
            .number("(dd)(dd)(dd),")             // date (yymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d)")                       // flags
            .number("(dd)(d{5})")                // latitude
            .number("(ddd)(d{5}),")              // longitude
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // status
            .number("(d+)?,")                    // gprs counting value
            .number("(d+)?,")                    // gps power saving counting value
            .number("(d+),")                     // switch status
            .number("(d+)")                      // relay status
            .expression("(?:[LH]{2})?")          // power status
            .number("#V(d+)")                    // battery
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2b94b94lwye40fd.R.inc(14586);

        __CLR4_5_2b94b94lwye40fd.R.inc(14587);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2b94b94lwye40fd.R.inc(14588);if ((((!parser.matches())&&(__CLR4_5_2b94b94lwye40fd.R.iget(14589)!=0|true))||(__CLR4_5_2b94b94lwye40fd.R.iget(14590)==0&false))) {{
            __CLR4_5_2b94b94lwye40fd.R.inc(14591);return null;
        }

        }__CLR4_5_2b94b94lwye40fd.R.inc(14592);Position position = new Position();
        __CLR4_5_2b94b94lwye40fd.R.inc(14593);position.setProtocol(getProtocolName());

        __CLR4_5_2b94b94lwye40fd.R.inc(14594);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2b94b94lwye40fd.R.inc(14595);if ((((deviceSession == null)&&(__CLR4_5_2b94b94lwye40fd.R.iget(14596)!=0|true))||(__CLR4_5_2b94b94lwye40fd.R.iget(14597)==0&false))) {{
            __CLR4_5_2b94b94lwye40fd.R.inc(14598);return null;
        }
        }__CLR4_5_2b94b94lwye40fd.R.inc(14599);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2b94b94lwye40fd.R.inc(14600);position.set(Position.KEY_VERSION_FW, parser.next());

        __CLR4_5_2b94b94lwye40fd.R.inc(14601);position.setTime(parser.nextDateTime());

        __CLR4_5_2b94b94lwye40fd.R.inc(14602);int flags = parser.nextInt(0);

        __CLR4_5_2b94b94lwye40fd.R.inc(14603);position.setValid(BitUtil.check(flags, 0));

        __CLR4_5_2b94b94lwye40fd.R.inc(14604);double latitude = parser.nextDouble(0) + parser.nextDouble(0) / 60000;
        __CLR4_5_2b94b94lwye40fd.R.inc(14605);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2b94b94lwye40fd.R.iget(14606)!=0|true))||(__CLR4_5_2b94b94lwye40fd.R.iget(14607)==0&false))) {{
            __CLR4_5_2b94b94lwye40fd.R.inc(14608);position.setLatitude(latitude);
        } }else {{
            __CLR4_5_2b94b94lwye40fd.R.inc(14609);position.setLatitude(-latitude);
        }

        }__CLR4_5_2b94b94lwye40fd.R.inc(14610);double longitude = parser.nextDouble(0) + parser.nextDouble(0) / 60000;
        __CLR4_5_2b94b94lwye40fd.R.inc(14611);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2b94b94lwye40fd.R.iget(14612)!=0|true))||(__CLR4_5_2b94b94lwye40fd.R.iget(14613)==0&false))) {{
            __CLR4_5_2b94b94lwye40fd.R.inc(14614);position.setLongitude(longitude);
        } }else {{
            __CLR4_5_2b94b94lwye40fd.R.inc(14615);position.setLongitude(-longitude);
        }

        }__CLR4_5_2b94b94lwye40fd.R.inc(14616);position.setSpeed(parser.nextDouble(0) / 10);
        __CLR4_5_2b94b94lwye40fd.R.inc(14617);position.setCourse(parser.nextDouble(0) / 10);

        __CLR4_5_2b94b94lwye40fd.R.inc(14618);position.set(Position.KEY_STATUS, parser.next());
        __CLR4_5_2b94b94lwye40fd.R.inc(14619);position.set("gprsCount", parser.next());
        __CLR4_5_2b94b94lwye40fd.R.inc(14620);position.set("powersaveCountdown", parser.next());
        __CLR4_5_2b94b94lwye40fd.R.inc(14621);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_2b94b94lwye40fd.R.inc(14622);position.set(Position.KEY_OUTPUT, parser.next());
        __CLR4_5_2b94b94lwye40fd.R.inc(14623);position.set(Position.KEY_BATTERY, parser.nextDouble(0) * 0.1);

        __CLR4_5_2b94b94lwye40fd.R.inc(14624);return position;
    }finally{__CLR4_5_2b94b94lwye40fd.R.flushNeeded();}}

}
