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
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class AutoGradeProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_265c65clx1dvcqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,8004,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AutoGradeProtocolDecoder(AutoGradeProtocol protocol) {
        super(protocol);__CLR4_5_265c65clx1dvcqs.R.inc(7969);try{__CLR4_5_265c65clx1dvcqs.R.inc(7968);
    }finally{__CLR4_5_265c65clx1dvcqs.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("(")
            .number("d{12}")                     // index
            .number("(d{15})")                   // imei
            .number("(dd)(dd)(dd)")              // date
            .expression("([AV])")                // validity
            .number("(d+)(dd.d+)([NS])")         // latitude
            .number("(d+)(dd.d+)([EW])")         // longitude
            .number("([d.]{5})")                 // speed
            .number("(dd)(dd)(dd)")              // time
            .number("([d.]{6})")                 // course
            .expression("(.)")                   // status
            .number("A(xxxx)")
            .number("B(xxxx)")
            .number("C(xxxx)")
            .number("D(xxxx)")
            .number("E(xxxx)")
            .number("K(xxxx)")
            .number("L(xxxx)")
            .number("M(xxxx)")
            .number("N(xxxx)")
            .number("O(xxxx)")
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_265c65clx1dvcqs.R.inc(7970);

        __CLR4_5_265c65clx1dvcqs.R.inc(7971);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_265c65clx1dvcqs.R.inc(7972);if ((((!parser.matches())&&(__CLR4_5_265c65clx1dvcqs.R.iget(7973)!=0|true))||(__CLR4_5_265c65clx1dvcqs.R.iget(7974)==0&false))) {{
            __CLR4_5_265c65clx1dvcqs.R.inc(7975);return null;
        }

        }__CLR4_5_265c65clx1dvcqs.R.inc(7976);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_265c65clx1dvcqs.R.inc(7977);if ((((deviceSession == null)&&(__CLR4_5_265c65clx1dvcqs.R.iget(7978)!=0|true))||(__CLR4_5_265c65clx1dvcqs.R.iget(7979)==0&false))) {{
            __CLR4_5_265c65clx1dvcqs.R.inc(7980);return null;
        }

        }__CLR4_5_265c65clx1dvcqs.R.inc(7981);Position position = new Position();
        __CLR4_5_265c65clx1dvcqs.R.inc(7982);position.setProtocol(getProtocolName());
        __CLR4_5_265c65clx1dvcqs.R.inc(7983);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_265c65clx1dvcqs.R.inc(7984);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_265c65clx1dvcqs.R.inc(7985);position.setValid(parser.next().equals("A"));
        __CLR4_5_265c65clx1dvcqs.R.inc(7986);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_265c65clx1dvcqs.R.inc(7987);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_265c65clx1dvcqs.R.inc(7988);position.setSpeed(parser.nextDouble());

        __CLR4_5_265c65clx1dvcqs.R.inc(7989);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_265c65clx1dvcqs.R.inc(7990);position.setTime(dateBuilder.getDate());

        __CLR4_5_265c65clx1dvcqs.R.inc(7991);position.setCourse(parser.nextDouble());

        __CLR4_5_265c65clx1dvcqs.R.inc(7992);int status = parser.next().charAt(0);
        __CLR4_5_265c65clx1dvcqs.R.inc(7993);position.set(Position.KEY_STATUS, status);
        __CLR4_5_265c65clx1dvcqs.R.inc(7994);position.set(Position.KEY_IGNITION, BitUtil.check(status, 0));

        __CLR4_5_265c65clx1dvcqs.R.inc(7995);for (int i = 1; (((i <= 5)&&(__CLR4_5_265c65clx1dvcqs.R.iget(7996)!=0|true))||(__CLR4_5_265c65clx1dvcqs.R.iget(7997)==0&false)); i++) {{
            __CLR4_5_265c65clx1dvcqs.R.inc(7998);position.set(Position.PREFIX_ADC + i, parser.next());
        }

        }__CLR4_5_265c65clx1dvcqs.R.inc(7999);for (int i = 1; (((i <= 5)&&(__CLR4_5_265c65clx1dvcqs.R.iget(8000)!=0|true))||(__CLR4_5_265c65clx1dvcqs.R.iget(8001)==0&false)); i++) {{
            __CLR4_5_265c65clx1dvcqs.R.inc(8002);position.set("can" + i, parser.next());
        }

        }__CLR4_5_265c65clx1dvcqs.R.inc(8003);return position;
    }finally{__CLR4_5_265c65clx1dvcqs.R.flushNeeded();}}

}
