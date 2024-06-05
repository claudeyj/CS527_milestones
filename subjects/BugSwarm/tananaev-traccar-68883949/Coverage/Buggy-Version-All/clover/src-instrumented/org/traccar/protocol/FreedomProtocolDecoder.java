/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;

public class FreedomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_239t39tlx1dlocr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,4285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FreedomProtocolDecoder(FreedomProtocol protocol) {
        super(protocol);__CLR4_5_239t39tlx1dlocr.R.inc(4242);try{__CLR4_5_239t39tlx1dlocr.R.inc(4241);
    }finally{__CLR4_5_239t39tlx1dlocr.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "IMEI," +
            "(\\d+)," +                           // IMEI
            "(\\d{4}).(\\d{2}).(\\d{2}), " +      // Date
            "(\\d{2}):(\\d{2}):(\\d{2}), " +      // Time
            "([NS]), Lat:(\\d{2})(\\d+.\\d+), " + // Latitude
            "([EW]), Lon:(\\d{3})(\\d+.\\d+), " + // Longitude
            "Spd:(\\d+.\\d+)" +                   // Speed
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_239t39tlx1dlocr.R.inc(4243);

        // Parse message
        __CLR4_5_239t39tlx1dlocr.R.inc(4244);Matcher parser = pattern.matcher((String) msg);
        __CLR4_5_239t39tlx1dlocr.R.inc(4245);if ((((!parser.matches())&&(__CLR4_5_239t39tlx1dlocr.R.iget(4246)!=0|true))||(__CLR4_5_239t39tlx1dlocr.R.iget(4247)==0&false))) {{
            __CLR4_5_239t39tlx1dlocr.R.inc(4248);return null;
        }

        // Create new position
        }__CLR4_5_239t39tlx1dlocr.R.inc(4249);Position position = new Position();
        __CLR4_5_239t39tlx1dlocr.R.inc(4250);position.setProtocol(getProtocolName());
        __CLR4_5_239t39tlx1dlocr.R.inc(4251);Integer index = 1;

        // Identification
        __CLR4_5_239t39tlx1dlocr.R.inc(4252);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_239t39tlx1dlocr.R.iget(4253)!=0|true))||(__CLR4_5_239t39tlx1dlocr.R.iget(4254)==0&false))) {{
            __CLR4_5_239t39tlx1dlocr.R.inc(4255);return null;
        }
        }__CLR4_5_239t39tlx1dlocr.R.inc(4256);position.setDeviceId(getDeviceId());

        // Validity
        __CLR4_5_239t39tlx1dlocr.R.inc(4257);position.setValid(true);

        // Time
        __CLR4_5_239t39tlx1dlocr.R.inc(4258);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_239t39tlx1dlocr.R.inc(4259);time.clear();
        __CLR4_5_239t39tlx1dlocr.R.inc(4260);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
        __CLR4_5_239t39tlx1dlocr.R.inc(4261);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_239t39tlx1dlocr.R.inc(4262);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_239t39tlx1dlocr.R.inc(4263);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_239t39tlx1dlocr.R.inc(4264);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_239t39tlx1dlocr.R.inc(4265);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_239t39tlx1dlocr.R.inc(4266);position.setTime(time.getTime());

        // Latitude
        __CLR4_5_239t39tlx1dlocr.R.inc(4267);String hemisphere = parser.group(index++);
        __CLR4_5_239t39tlx1dlocr.R.inc(4268);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_239t39tlx1dlocr.R.inc(4269);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_239t39tlx1dlocr.R.inc(4270);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_239t39tlx1dlocr.R.iget(4271)!=0|true))||(__CLR4_5_239t39tlx1dlocr.R.iget(4272)==0&false))) {__CLR4_5_239t39tlx1dlocr.R.inc(4273);latitude = -latitude;
        }__CLR4_5_239t39tlx1dlocr.R.inc(4274);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_239t39tlx1dlocr.R.inc(4275);hemisphere = parser.group(index++);
        __CLR4_5_239t39tlx1dlocr.R.inc(4276);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_239t39tlx1dlocr.R.inc(4277);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_239t39tlx1dlocr.R.inc(4278);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_239t39tlx1dlocr.R.iget(4279)!=0|true))||(__CLR4_5_239t39tlx1dlocr.R.iget(4280)==0&false))) {__CLR4_5_239t39tlx1dlocr.R.inc(4281);longitude = -longitude;
        }__CLR4_5_239t39tlx1dlocr.R.inc(4282);position.setLongitude(longitude);

        // Speed
        __CLR4_5_239t39tlx1dlocr.R.inc(4283);position.setSpeed(Double.valueOf(parser.group(index++)));
        __CLR4_5_239t39tlx1dlocr.R.inc(4284);return position;
    }finally{__CLR4_5_239t39tlx1dlocr.R.flushNeeded();}}

}
