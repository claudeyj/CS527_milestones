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
import org.traccar.helper.BitBuffer;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class AisProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25iy5iylwye7d56{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,7233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AisProtocolDecoder(AisProtocol protocol) {
        super(protocol);__CLR4_5_25iy5iylwye7d56.R.inc(7163);try{__CLR4_5_25iy5iylwye7d56.R.inc(7162);
    }finally{__CLR4_5_25iy5iylwye7d56.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("!AIVDM,")
            .number("(d+),")                     // count
            .number("(d+),")                     // index
            .number("(d+)?,")                    // id
            .expression(".,")                    // radio channel
            .expression("([^,]+),")              // payload
            .any()
            .compile();

    private Position decodePayload(Channel channel, SocketAddress remoteAddress, BitBuffer buf) {try{__CLR4_5_25iy5iylwye7d56.R.inc(7164);

        __CLR4_5_25iy5iylwye7d56.R.inc(7165);int type = buf.readUnsigned(6);
        __CLR4_5_25iy5iylwye7d56.R.inc(7166);if ((((type == 1 || type == 2 || type == 3 || type == 18)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7167)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7168)==0&false))) {{

            __CLR4_5_25iy5iylwye7d56.R.inc(7169);buf.readUnsigned(2);
            __CLR4_5_25iy5iylwye7d56.R.inc(7170);int mmsi = buf.readUnsigned(30);

            __CLR4_5_25iy5iylwye7d56.R.inc(7171);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(mmsi));
            __CLR4_5_25iy5iylwye7d56.R.inc(7172);if ((((deviceSession == null)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7173)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7174)==0&false))) {{
                __CLR4_5_25iy5iylwye7d56.R.inc(7175);return null;
            }

            }__CLR4_5_25iy5iylwye7d56.R.inc(7176);Position position = new Position();
            __CLR4_5_25iy5iylwye7d56.R.inc(7177);position.setProtocol(getProtocolName());
            __CLR4_5_25iy5iylwye7d56.R.inc(7178);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_25iy5iylwye7d56.R.inc(7179);position.setTime(new Date());

            __CLR4_5_25iy5iylwye7d56.R.inc(7180);if ((((type == 18)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7181)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7182)==0&false))) {{
                __CLR4_5_25iy5iylwye7d56.R.inc(7183);buf.readUnsigned(8); // reserved
            } }else {{
                __CLR4_5_25iy5iylwye7d56.R.inc(7184);position.set(Position.KEY_STATUS, buf.readUnsigned(4));
                __CLR4_5_25iy5iylwye7d56.R.inc(7185);position.set("turn", buf.readSigned(8));
            }

            }__CLR4_5_25iy5iylwye7d56.R.inc(7186);position.setSpeed(buf.readUnsigned(10) * 0.1);
            __CLR4_5_25iy5iylwye7d56.R.inc(7187);position.setValid(buf.readUnsigned(1) != 0);
            __CLR4_5_25iy5iylwye7d56.R.inc(7188);position.setLongitude(buf.readSigned(28) * 0.0001 / 60.0);
            __CLR4_5_25iy5iylwye7d56.R.inc(7189);position.setLatitude(buf.readSigned(27) * 0.0001 / 60.0);
            __CLR4_5_25iy5iylwye7d56.R.inc(7190);position.setCourse(buf.readUnsigned(12) * 0.1);

            __CLR4_5_25iy5iylwye7d56.R.inc(7191);position.set("heading", buf.readUnsigned(9));

            __CLR4_5_25iy5iylwye7d56.R.inc(7192);return position;

        }

        }__CLR4_5_25iy5iylwye7d56.R.inc(7193);return null;
    }finally{__CLR4_5_25iy5iylwye7d56.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25iy5iylwye7d56.R.inc(7194);

        __CLR4_5_25iy5iylwye7d56.R.inc(7195);String[] sentences = ((String) msg).split("\\r\\n");

        __CLR4_5_25iy5iylwye7d56.R.inc(7196);List<Position> positions = new ArrayList<>();
        __CLR4_5_25iy5iylwye7d56.R.inc(7197);Map<Integer, BitBuffer> buffers = new HashMap<>();

        __CLR4_5_25iy5iylwye7d56.R.inc(7198);for (String sentence : sentences) {{
            __CLR4_5_25iy5iylwye7d56.R.inc(7199);if ((((!sentence.isEmpty())&&(__CLR4_5_25iy5iylwye7d56.R.iget(7200)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7201)==0&false))) {{
                __CLR4_5_25iy5iylwye7d56.R.inc(7202);Parser parser = new Parser(PATTERN, sentence);
                __CLR4_5_25iy5iylwye7d56.R.inc(7203);if ((((parser.matches())&&(__CLR4_5_25iy5iylwye7d56.R.iget(7204)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7205)==0&false))) {{

                    __CLR4_5_25iy5iylwye7d56.R.inc(7206);int count = parser.nextInt(0);
                    __CLR4_5_25iy5iylwye7d56.R.inc(7207);int index = parser.nextInt(0);
                    __CLR4_5_25iy5iylwye7d56.R.inc(7208);int id = parser.nextInt(0);

                    __CLR4_5_25iy5iylwye7d56.R.inc(7209);Position position = null;

                    __CLR4_5_25iy5iylwye7d56.R.inc(7210);if ((((count == 1)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7211)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7212)==0&false))) {{
                        __CLR4_5_25iy5iylwye7d56.R.inc(7213);BitBuffer bits = new BitBuffer();
                        __CLR4_5_25iy5iylwye7d56.R.inc(7214);bits.writeEncoded(parser.next().getBytes(StandardCharsets.US_ASCII));
                        __CLR4_5_25iy5iylwye7d56.R.inc(7215);position = decodePayload(channel, remoteAddress, bits);
                    } }else {{
                        __CLR4_5_25iy5iylwye7d56.R.inc(7216);BitBuffer bits = buffers.get(id);
                        __CLR4_5_25iy5iylwye7d56.R.inc(7217);if ((((bits == null)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7218)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7219)==0&false))) {{
                            __CLR4_5_25iy5iylwye7d56.R.inc(7220);bits = new BitBuffer();
                            __CLR4_5_25iy5iylwye7d56.R.inc(7221);buffers.put(id, bits);
                        }
                        }__CLR4_5_25iy5iylwye7d56.R.inc(7222);bits.writeEncoded(parser.next().getBytes(StandardCharsets.US_ASCII));
                        __CLR4_5_25iy5iylwye7d56.R.inc(7223);if ((((count == index)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7224)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7225)==0&false))) {{
                            __CLR4_5_25iy5iylwye7d56.R.inc(7226);position = decodePayload(channel, remoteAddress, bits);
                            __CLR4_5_25iy5iylwye7d56.R.inc(7227);buffers.remove(id);
                        }
                    }}

                    }__CLR4_5_25iy5iylwye7d56.R.inc(7228);if ((((position != null)&&(__CLR4_5_25iy5iylwye7d56.R.iget(7229)!=0|true))||(__CLR4_5_25iy5iylwye7d56.R.iget(7230)==0&false))) {{
                        __CLR4_5_25iy5iylwye7d56.R.inc(7231);positions.add(position);
                    }

                }}
            }}
        }}

        }__CLR4_5_25iy5iylwye7d56.R.inc(7232);return positions;
    }finally{__CLR4_5_25iy5iylwye7d56.R.flushNeeded();}}

}
