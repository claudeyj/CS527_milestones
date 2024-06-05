/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GpsmtaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_249i49ilx1e75hv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,5560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GpsmtaProtocolDecoder(GpsmtaProtocol protocol) {
        super(protocol);__CLR4_5_249i49ilx1e75hv.R.inc(5527);try{__CLR4_5_249i49ilx1e75hv.R.inc(5526);
    }finally{__CLR4_5_249i49ilx1e75hv.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(\\d+) " +                         // UID
            "(\\d+) " +                         // Time
            "(\\d+\\.\\d+) " +                  // Latitude
            "(\\d+\\.\\d+) " +                  // Longitude
            "(\\d+) " +                         // Speed
            "(\\d+) " +                         // Course
            "(\\d+) " +                         // Accuracy
            "(\\d+) " +                         // Altitude
            "(\\d+) " +                         // Flags
            "(\\d+) " +                         // Battery
            "(\\d+) " +                         // Temperature
            "(\\d).*");                         // Changing status

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_249i49ilx1e75hv.R.inc(5528);

        __CLR4_5_249i49ilx1e75hv.R.inc(5529);String sentence = (String) msg;

        __CLR4_5_249i49ilx1e75hv.R.inc(5530);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_249i49ilx1e75hv.R.inc(5531);if ((((!parser.matches())&&(__CLR4_5_249i49ilx1e75hv.R.iget(5532)!=0|true))||(__CLR4_5_249i49ilx1e75hv.R.iget(5533)==0&false))) {{
            __CLR4_5_249i49ilx1e75hv.R.inc(5534);return null;
        }

        }__CLR4_5_249i49ilx1e75hv.R.inc(5535);Position position = new Position();
        __CLR4_5_249i49ilx1e75hv.R.inc(5536);position.setProtocol(getProtocolName());

        __CLR4_5_249i49ilx1e75hv.R.inc(5537);Integer index = 1;

        __CLR4_5_249i49ilx1e75hv.R.inc(5538);if ((((!identify(parser.group(index++), channel, remoteAddress))&&(__CLR4_5_249i49ilx1e75hv.R.iget(5539)!=0|true))||(__CLR4_5_249i49ilx1e75hv.R.iget(5540)==0&false))) {{
            __CLR4_5_249i49ilx1e75hv.R.inc(5541);return null;
        }
        }__CLR4_5_249i49ilx1e75hv.R.inc(5542);position.setDeviceId(getDeviceId());

        __CLR4_5_249i49ilx1e75hv.R.inc(5543);String time = parser.group(index++);
        __CLR4_5_249i49ilx1e75hv.R.inc(5544);position.setTime(new Date(Long.parseLong(time) * 1000));

        __CLR4_5_249i49ilx1e75hv.R.inc(5545);position.setLatitude(Double.parseDouble(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5546);position.setLongitude(Double.parseDouble(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5547);position.setSpeed(Integer.parseInt(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5548);position.setCourse(Integer.parseInt(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5549);index++; // accuracy
        __CLR4_5_249i49ilx1e75hv.R.inc(5550);position.setAltitude(Integer.parseInt(parser.group(index++)));

        __CLR4_5_249i49ilx1e75hv.R.inc(5551);position.set(Event.KEY_STATUS, Integer.parseInt(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5552);position.set(Event.KEY_BATTERY, Integer.parseInt(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5553);position.set(Event.PREFIX_TEMP + 1, Integer.parseInt(parser.group(index++)));
        __CLR4_5_249i49ilx1e75hv.R.inc(5554);position.set(Event.KEY_CHARGE, Integer.parseInt(parser.group(index++)) == 1);

        __CLR4_5_249i49ilx1e75hv.R.inc(5555);if ((((channel != null)&&(__CLR4_5_249i49ilx1e75hv.R.iget(5556)!=0|true))||(__CLR4_5_249i49ilx1e75hv.R.iget(5557)==0&false))) {{
            __CLR4_5_249i49ilx1e75hv.R.inc(5558);channel.write(time, remoteAddress);
        }

        }__CLR4_5_249i49ilx1e75hv.R.inc(5559);return position;
    }finally{__CLR4_5_249i49ilx1e75hv.R.flushNeeded();}}

}
