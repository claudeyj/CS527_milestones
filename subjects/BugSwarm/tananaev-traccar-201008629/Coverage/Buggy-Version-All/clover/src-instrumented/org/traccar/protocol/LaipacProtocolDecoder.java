/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class LaipacProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2aaiaailx1dxp3c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,13394,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public LaipacProtocolDecoder(LaipacProtocol protocol) {
        super(protocol);__CLR4_5_2aaiaailx1dxp3c.R.inc(13339);try{__CLR4_5_2aaiaailx1dxp3c.R.inc(13338);
    }finally{__CLR4_5_2aaiaailx1dxp3c.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$AVRMC,")
            .expression("([^,]+),")              // identifier
            .number("(dd)(dd)(dd),")             // time
            .expression("([AVRPavrp]),")         // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .number("([EW]),")
            .number("(d+.d+),")                  // speed
            .number("(d+.d+),")                  // course
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .expression("(.),")                  // type
            .expression("[^*]+").text("*")
            .number("(xx)")                      // checksum
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2aaiaailx1dxp3c.R.inc(13340);

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13341);String sentence = (String) msg;

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13342);if ((((sentence.startsWith("$ECHK") && channel != null)&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13343)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13344)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13345);channel.write(sentence + "\r\n"); // heartbeat
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13346);return null;
        }

        }__CLR4_5_2aaiaailx1dxp3c.R.inc(13347);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13348);if ((((!parser.matches())&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13349)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13350)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13351);return null;
        }

        }__CLR4_5_2aaiaailx1dxp3c.R.inc(13352);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13353);if ((((deviceSession == null)&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13354)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13355)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13356);return null;
        }

        }__CLR4_5_2aaiaailx1dxp3c.R.inc(13357);Position position = new Position();
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13358);position.setProtocol(getProtocolName());
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13359);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13360);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13361);String status = parser.next();
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13362);position.setValid(status.toUpperCase().equals("A"));

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13363);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13364);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13365);position.setSpeed(parser.nextDouble());
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13366);position.setCourse(parser.nextDouble());

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13367);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13368);position.setTime(dateBuilder.getDate());

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13369);String type = parser.next();
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13370);String checksum = parser.next();
        __CLR4_5_2aaiaailx1dxp3c.R.inc(13371);String response = null;

        __CLR4_5_2aaiaailx1dxp3c.R.inc(13372);if ((((type.equals("0") && Character.isLowerCase(status.charAt(0)))&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13373)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13374)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13375);response = "$EAVACK,0," + checksum;
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13376);response += Checksum.nmea(response);
        } }else {__CLR4_5_2aaiaailx1dxp3c.R.inc(13377);if ((((type.equals("S") || type.equals("T"))&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13378)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13379)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13380);response = "$AVCFG,00000000,t*21";
        } }else {__CLR4_5_2aaiaailx1dxp3c.R.inc(13381);if ((((type.equals("3"))&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13382)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13383)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13384);response = "$AVCFG,00000000,d*31";
        } }else {__CLR4_5_2aaiaailx1dxp3c.R.inc(13385);if ((((type.equals("X") || type.equals("4"))&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13386)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13387)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13388);response = "$AVCFG,00000000,x*2D";
        }

        }}}}__CLR4_5_2aaiaailx1dxp3c.R.inc(13389);if ((((response != null && channel != null)&&(__CLR4_5_2aaiaailx1dxp3c.R.iget(13390)!=0|true))||(__CLR4_5_2aaiaailx1dxp3c.R.iget(13391)==0&false))) {{
            __CLR4_5_2aaiaailx1dxp3c.R.inc(13392);channel.write(response + "\r\n");
        }

        }__CLR4_5_2aaiaailx1dxp3c.R.inc(13393);return position;
    }finally{__CLR4_5_2aaiaailx1dxp3c.R.flushNeeded();}}

}
