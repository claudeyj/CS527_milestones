/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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

public class LaipacProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2c1fc1flwye7g61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,15658,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public LaipacProtocolDecoder(LaipacProtocol protocol) {
        super(protocol);__CLR4_5_2c1fc1flwye7g61.R.inc(15604);try{__CLR4_5_2c1fc1flwye7g61.R.inc(15603);
    }finally{__CLR4_5_2c1fc1flwye7g61.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$AVRMC,")
            .expression("([^,]+),")              // identifier
            .number("(dd)(dd)(dd),")             // time (hhmmss)
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
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2c1fc1flwye7g61.R.inc(15605);

        __CLR4_5_2c1fc1flwye7g61.R.inc(15606);String sentence = (String) msg;

        __CLR4_5_2c1fc1flwye7g61.R.inc(15607);if ((((sentence.startsWith("$ECHK") && channel != null)&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15608)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15609)==0&false))) {{
            __CLR4_5_2c1fc1flwye7g61.R.inc(15610);channel.write(sentence + "\r\n"); // heartbeat
            __CLR4_5_2c1fc1flwye7g61.R.inc(15611);return null;
        }

        }__CLR4_5_2c1fc1flwye7g61.R.inc(15612);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2c1fc1flwye7g61.R.inc(15613);if ((((!parser.matches())&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15614)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15615)==0&false))) {{
            __CLR4_5_2c1fc1flwye7g61.R.inc(15616);return null;
        }

        }__CLR4_5_2c1fc1flwye7g61.R.inc(15617);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2c1fc1flwye7g61.R.inc(15618);if ((((deviceSession == null)&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15619)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15620)==0&false))) {{
            __CLR4_5_2c1fc1flwye7g61.R.inc(15621);return null;
        }

        }__CLR4_5_2c1fc1flwye7g61.R.inc(15622);Position position = new Position();
        __CLR4_5_2c1fc1flwye7g61.R.inc(15623);position.setProtocol(getProtocolName());
        __CLR4_5_2c1fc1flwye7g61.R.inc(15624);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2c1fc1flwye7g61.R.inc(15625);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2c1fc1flwye7g61.R.inc(15626);String status = parser.next();
        __CLR4_5_2c1fc1flwye7g61.R.inc(15627);position.setValid(status.toUpperCase().equals("A"));

        __CLR4_5_2c1fc1flwye7g61.R.inc(15628);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2c1fc1flwye7g61.R.inc(15629);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2c1fc1flwye7g61.R.inc(15630);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2c1fc1flwye7g61.R.inc(15631);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2c1fc1flwye7g61.R.inc(15632);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2c1fc1flwye7g61.R.inc(15633);position.setTime(dateBuilder.getDate());

        __CLR4_5_2c1fc1flwye7g61.R.inc(15634);String type = parser.next();
        __CLR4_5_2c1fc1flwye7g61.R.inc(15635);String checksum = parser.next();

        __CLR4_5_2c1fc1flwye7g61.R.inc(15636);if ((((channel != null)&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15637)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15638)==0&false))) {{

            __CLR4_5_2c1fc1flwye7g61.R.inc(15639);if ((((Character.isLowerCase(status.charAt(0)))&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15640)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15641)==0&false))) {{
                __CLR4_5_2c1fc1flwye7g61.R.inc(15642);String response = "$EAVACK," + type + "," + checksum;
                __CLR4_5_2c1fc1flwye7g61.R.inc(15643);response += Checksum.nmea(response);
                __CLR4_5_2c1fc1flwye7g61.R.inc(15644);channel.write(response);
            }

            }__CLR4_5_2c1fc1flwye7g61.R.inc(15645);if ((((type.equals("S") || type.equals("T"))&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15646)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15647)==0&false))) {{
                __CLR4_5_2c1fc1flwye7g61.R.inc(15648);channel.write("$AVCFG,00000000,t*21");
            } }else {__CLR4_5_2c1fc1flwye7g61.R.inc(15649);if ((((type.equals("3"))&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15650)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15651)==0&false))) {{
                __CLR4_5_2c1fc1flwye7g61.R.inc(15652);channel.write("$AVCFG,00000000,d*31");
            } }else {__CLR4_5_2c1fc1flwye7g61.R.inc(15653);if ((((type.equals("X") || type.equals("4"))&&(__CLR4_5_2c1fc1flwye7g61.R.iget(15654)!=0|true))||(__CLR4_5_2c1fc1flwye7g61.R.iget(15655)==0&false))) {{
                __CLR4_5_2c1fc1flwye7g61.R.inc(15656);channel.write("$AVCFG,00000000,x*2D");
            }

        }}}}

        }__CLR4_5_2c1fc1flwye7g61.R.inc(15657);return position;
    }finally{__CLR4_5_2c1fc1flwye7g61.R.flushNeeded();}}

}
