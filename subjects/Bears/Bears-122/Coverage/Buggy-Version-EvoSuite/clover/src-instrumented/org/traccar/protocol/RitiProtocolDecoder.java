/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class RitiProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2el5el5lwydwejd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,18942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public RitiProtocolDecoder(RitiProtocol protocol) {
        super(protocol);__CLR4_5_2el5el5lwydwejd.R.inc(18906);try{__CLR4_5_2el5el5lwydwejd.R.inc(18905);
    }finally{__CLR4_5_2el5el5lwydwejd.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2el5el5lwydwejd.R.inc(18907);

        __CLR4_5_2el5el5lwydwejd.R.inc(18908);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2el5el5lwydwejd.R.inc(18909);buf.skipBytes(2); // header

        __CLR4_5_2el5el5lwydwejd.R.inc(18910);Position position = new Position();
        __CLR4_5_2el5el5lwydwejd.R.inc(18911);position.setProtocol(getProtocolName());

        __CLR4_5_2el5el5lwydwejd.R.inc(18912);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(buf.readUnsignedShort()));
        __CLR4_5_2el5el5lwydwejd.R.inc(18913);if ((((deviceSession == null)&&(__CLR4_5_2el5el5lwydwejd.R.iget(18914)!=0|true))||(__CLR4_5_2el5el5lwydwejd.R.iget(18915)==0&false))) {{
            __CLR4_5_2el5el5lwydwejd.R.inc(18916);return null;
        }
        }__CLR4_5_2el5el5lwydwejd.R.inc(18917);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2el5el5lwydwejd.R.inc(18918);position.set("mode", buf.readUnsignedByte());
        __CLR4_5_2el5el5lwydwejd.R.inc(18919);position.set(Position.KEY_COMMAND, buf.readUnsignedByte());
        __CLR4_5_2el5el5lwydwejd.R.inc(18920);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2el5el5lwydwejd.R.inc(18921);buf.skipBytes(5);  // status
        __CLR4_5_2el5el5lwydwejd.R.inc(18922);buf.readUnsignedShort();  // idleCount
        __CLR4_5_2el5el5lwydwejd.R.inc(18923);buf.readUnsignedShort();  // idleTime in seconds

        __CLR4_5_2el5el5lwydwejd.R.inc(18924);position.set(Position.KEY_DISTANCE, buf.readUnsignedInt());
        __CLR4_5_2el5el5lwydwejd.R.inc(18925);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedInt());

        // Parse GPRMC
        __CLR4_5_2el5el5lwydwejd.R.inc(18926);int end = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '*');
        __CLR4_5_2el5el5lwydwejd.R.inc(18927);String gprmc = buf.toString(buf.readerIndex(), end - buf.readerIndex(), StandardCharsets.US_ASCII);
        __CLR4_5_2el5el5lwydwejd.R.inc(18928);Parser parser = new Parser(PATTERN, gprmc);
        __CLR4_5_2el5el5lwydwejd.R.inc(18929);if ((((!parser.matches())&&(__CLR4_5_2el5el5lwydwejd.R.iget(18930)!=0|true))||(__CLR4_5_2el5el5lwydwejd.R.iget(18931)==0&false))) {{
            __CLR4_5_2el5el5lwydwejd.R.inc(18932);return null;
        }

        }__CLR4_5_2el5el5lwydwejd.R.inc(18933);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2el5el5lwydwejd.R.inc(18934);position.setValid(parser.next().equals("A"));
        __CLR4_5_2el5el5lwydwejd.R.inc(18935);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2el5el5lwydwejd.R.inc(18936);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2el5el5lwydwejd.R.inc(18937);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2el5el5lwydwejd.R.inc(18938);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2el5el5lwydwejd.R.inc(18939);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2el5el5lwydwejd.R.inc(18940);position.setTime(dateBuilder.getDate());

        __CLR4_5_2el5el5lwydwejd.R.inc(18941);return position;
    }finally{__CLR4_5_2el5el5lwydwejd.R.flushNeeded();}}

}
