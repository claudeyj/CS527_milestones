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

import java.nio.charset.Charset;
import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class RitiProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26uf6uflx1e80nn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,8934,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public RitiProtocolDecoder(RitiProtocol protocol) {
        super(protocol);__CLR4_5_26uf6uflx1e80nn.R.inc(8872);try{__CLR4_5_26uf6uflx1e80nn.R.inc(8871);
    }finally{__CLR4_5_26uf6uflx1e80nn.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.?\\d*)?," +           // Speed
            "(\\d+\\.?\\d*)?," +           // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_26uf6uflx1e80nn.R.inc(8873);

        __CLR4_5_26uf6uflx1e80nn.R.inc(8874);ChannelBuffer buf = (ChannelBuffer) msg;

        // Create new position
        __CLR4_5_26uf6uflx1e80nn.R.inc(8875);Position position = new Position();
        __CLR4_5_26uf6uflx1e80nn.R.inc(8876);position.setProtocol(getProtocolName());

        __CLR4_5_26uf6uflx1e80nn.R.inc(8877);buf.skipBytes(2); // header

        // Get device id
        __CLR4_5_26uf6uflx1e80nn.R.inc(8878);if ((((!identify(String.valueOf(buf.readUnsignedShort()), channel))&&(__CLR4_5_26uf6uflx1e80nn.R.iget(8879)!=0|true))||(__CLR4_5_26uf6uflx1e80nn.R.iget(8880)==0&false))) {{
            __CLR4_5_26uf6uflx1e80nn.R.inc(8881);return null;
        }
        }__CLR4_5_26uf6uflx1e80nn.R.inc(8882);position.setDeviceId(getDeviceId());

        __CLR4_5_26uf6uflx1e80nn.R.inc(8883);position.set("mode", buf.readUnsignedByte());
        __CLR4_5_26uf6uflx1e80nn.R.inc(8884);position.set("command", buf.readUnsignedByte());
        __CLR4_5_26uf6uflx1e80nn.R.inc(8885);position.set(Event.KEY_POWER, buf.readUnsignedShort());
        
        __CLR4_5_26uf6uflx1e80nn.R.inc(8886);buf.skipBytes(5);
        __CLR4_5_26uf6uflx1e80nn.R.inc(8887);buf.readUnsignedShort();
        __CLR4_5_26uf6uflx1e80nn.R.inc(8888);buf.readUnsignedShort();
        
        __CLR4_5_26uf6uflx1e80nn.R.inc(8889);position.set("distance", buf.readUnsignedInt());
        __CLR4_5_26uf6uflx1e80nn.R.inc(8890);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
        
        // Parse GPRMC
        __CLR4_5_26uf6uflx1e80nn.R.inc(8891);Integer end = ChannelBufferTools.find(buf, buf.readerIndex(), buf.readerIndex() + 80, "*");
        __CLR4_5_26uf6uflx1e80nn.R.inc(8892);String gprmc = buf.toString(
                buf.readerIndex(), end - buf.readerIndex(), Charset.defaultCharset());
        __CLR4_5_26uf6uflx1e80nn.R.inc(8893);Matcher parser = pattern.matcher(gprmc);
        __CLR4_5_26uf6uflx1e80nn.R.inc(8894);if ((((!parser.matches())&&(__CLR4_5_26uf6uflx1e80nn.R.iget(8895)!=0|true))||(__CLR4_5_26uf6uflx1e80nn.R.iget(8896)==0&false))) {{
            __CLR4_5_26uf6uflx1e80nn.R.inc(8897);return null;
        }

        }__CLR4_5_26uf6uflx1e80nn.R.inc(8898);Integer index = 1;

        // Time
        __CLR4_5_26uf6uflx1e80nn.R.inc(8899);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8900);time.clear();
        __CLR4_5_26uf6uflx1e80nn.R.inc(8901);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8902);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8903);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_26uf6uflx1e80nn.R.inc(8904);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_26uf6uflx1e80nn.R.inc(8905);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8906);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26uf6uflx1e80nn.R.inc(8907);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26uf6uflx1e80nn.R.iget(8908)!=0|true))||(__CLR4_5_26uf6uflx1e80nn.R.iget(8909)==0&false))) {__CLR4_5_26uf6uflx1e80nn.R.inc(8910);latitude = -latitude;
        }__CLR4_5_26uf6uflx1e80nn.R.inc(8911);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_26uf6uflx1e80nn.R.inc(8912);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8913);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26uf6uflx1e80nn.R.inc(8914);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26uf6uflx1e80nn.R.iget(8915)!=0|true))||(__CLR4_5_26uf6uflx1e80nn.R.iget(8916)==0&false))) {__CLR4_5_26uf6uflx1e80nn.R.inc(8917);longitude = -longitude;
        }__CLR4_5_26uf6uflx1e80nn.R.inc(8918);position.setLongitude(longitude);

        // Speed
        __CLR4_5_26uf6uflx1e80nn.R.inc(8919);String speed = parser.group(index++);
        __CLR4_5_26uf6uflx1e80nn.R.inc(8920);if ((((speed != null)&&(__CLR4_5_26uf6uflx1e80nn.R.iget(8921)!=0|true))||(__CLR4_5_26uf6uflx1e80nn.R.iget(8922)==0&false))) {{
            __CLR4_5_26uf6uflx1e80nn.R.inc(8923);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_26uf6uflx1e80nn.R.inc(8924);String course = parser.group(index++);
        __CLR4_5_26uf6uflx1e80nn.R.inc(8925);if ((((course != null)&&(__CLR4_5_26uf6uflx1e80nn.R.iget(8926)!=0|true))||(__CLR4_5_26uf6uflx1e80nn.R.iget(8927)==0&false))) {{
            __CLR4_5_26uf6uflx1e80nn.R.inc(8928);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_26uf6uflx1e80nn.R.inc(8929);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8930);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_26uf6uflx1e80nn.R.inc(8931);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_26uf6uflx1e80nn.R.inc(8932);position.setTime(time.getTime());
        __CLR4_5_26uf6uflx1e80nn.R.inc(8933);return position;
    }finally{__CLR4_5_26uf6uflx1e80nn.R.flushNeeded();}}

}
