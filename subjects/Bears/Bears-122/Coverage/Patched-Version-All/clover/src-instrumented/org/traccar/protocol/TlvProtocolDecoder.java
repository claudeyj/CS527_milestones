/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@java.lang.SuppressWarnings({"fallthrough"}) public class TlvProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gaygaylwye7h61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,21186,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TlvProtocolDecoder(TlvProtocol protocol) {
        super(protocol);__CLR4_5_2gaygaylwye7h61.R.inc(21131);try{__CLR4_5_2gaygaylwye7h61.R.inc(21130);
    }finally{__CLR4_5_2gaygaylwye7h61.R.flushNeeded();}}

    private void sendResponse(Channel channel, String type, String... arguments) {try{__CLR4_5_2gaygaylwye7h61.R.inc(21132);
        __CLR4_5_2gaygaylwye7h61.R.inc(21133);if ((((channel != null)&&(__CLR4_5_2gaygaylwye7h61.R.iget(21134)!=0|true))||(__CLR4_5_2gaygaylwye7h61.R.iget(21135)==0&false))) {{
            __CLR4_5_2gaygaylwye7h61.R.inc(21136);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2gaygaylwye7h61.R.inc(21137);response.writeBytes(ChannelBuffers.copiedBuffer(type, StandardCharsets.US_ASCII));
            __CLR4_5_2gaygaylwye7h61.R.inc(21138);for (String argument : arguments) {{
                __CLR4_5_2gaygaylwye7h61.R.inc(21139);response.writeByte(argument.length());
                __CLR4_5_2gaygaylwye7h61.R.inc(21140);response.writeBytes(ChannelBuffers.copiedBuffer(argument, StandardCharsets.US_ASCII));
            }
            }__CLR4_5_2gaygaylwye7h61.R.inc(21141);response.writeByte(0);
            __CLR4_5_2gaygaylwye7h61.R.inc(21142);channel.write(response);
        }
    }}finally{__CLR4_5_2gaygaylwye7h61.R.flushNeeded();}}

    private String readArgument(ChannelBuffer buf) {try{__CLR4_5_2gaygaylwye7h61.R.inc(21143);
        __CLR4_5_2gaygaylwye7h61.R.inc(21144);return buf.readBytes(buf.readUnsignedByte()).toString(StandardCharsets.US_ASCII);
    }finally{__CLR4_5_2gaygaylwye7h61.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gaygaylwye7h61.R.inc(21145);

        __CLR4_5_2gaygaylwye7h61.R.inc(21146);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2gaygaylwye7h61.R.inc(21147);String type = buf.readBytes(2).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2gaygaylwye7h61.R.inc(21148);if ((((channel != null)&&(__CLR4_5_2gaygaylwye7h61.R.iget(21149)!=0|true))||(__CLR4_5_2gaygaylwye7h61.R.iget(21150)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2gaygaylwye7h61.R.inc(21151);switch (type) {
                case "0A":if (!__CLB4_5_2_bool0) {__CLR4_5_2gaygaylwye7h61.R.inc(21152);__CLB4_5_2_bool0=true;}
                case "0C":if (!__CLB4_5_2_bool0) {__CLR4_5_2gaygaylwye7h61.R.inc(21153);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gaygaylwye7h61.R.inc(21154);sendResponse(channel, type);
                    __CLR4_5_2gaygaylwye7h61.R.inc(21155);break;
                case "0B":if (!__CLB4_5_2_bool0) {__CLR4_5_2gaygaylwye7h61.R.inc(21156);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gaygaylwye7h61.R.inc(21157);sendResponse(channel, type, "1482202689", "10", "20", "15");
                    __CLR4_5_2gaygaylwye7h61.R.inc(21158);break;
                case "0E":if (!__CLB4_5_2_bool0) {__CLR4_5_2gaygaylwye7h61.R.inc(21159);__CLB4_5_2_bool0=true;}
                case "0F":if (!__CLB4_5_2_bool0) {__CLR4_5_2gaygaylwye7h61.R.inc(21160);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gaygaylwye7h61.R.inc(21161);sendResponse(channel, type, "30", "Unknown");
                    __CLR4_5_2gaygaylwye7h61.R.inc(21162);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2gaygaylwye7h61.R.inc(21163);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gaygaylwye7h61.R.inc(21164);break;
            }
        }

        }__CLR4_5_2gaygaylwye7h61.R.inc(21165);if ((((type.equals("0E"))&&(__CLR4_5_2gaygaylwye7h61.R.iget(21166)!=0|true))||(__CLR4_5_2gaygaylwye7h61.R.iget(21167)==0&false))) {{

            __CLR4_5_2gaygaylwye7h61.R.inc(21168);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, readArgument(buf));
            __CLR4_5_2gaygaylwye7h61.R.inc(21169);if ((((deviceSession == null)&&(__CLR4_5_2gaygaylwye7h61.R.iget(21170)!=0|true))||(__CLR4_5_2gaygaylwye7h61.R.iget(21171)==0&false))) {{
                __CLR4_5_2gaygaylwye7h61.R.inc(21172);return null;
            }

            }__CLR4_5_2gaygaylwye7h61.R.inc(21173);Position position = new Position();
            __CLR4_5_2gaygaylwye7h61.R.inc(21174);position.setProtocol(getProtocolName());
            __CLR4_5_2gaygaylwye7h61.R.inc(21175);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2gaygaylwye7h61.R.inc(21176);position.setValid(true);
            __CLR4_5_2gaygaylwye7h61.R.inc(21177);position.setTime(new Date(Long.parseLong(readArgument(buf)) * 1000));

            __CLR4_5_2gaygaylwye7h61.R.inc(21178);readArgument(buf); // location identifier

            __CLR4_5_2gaygaylwye7h61.R.inc(21179);position.setLongitude(Double.parseDouble(readArgument(buf)));
            __CLR4_5_2gaygaylwye7h61.R.inc(21180);position.setLatitude(Double.parseDouble(readArgument(buf)));
            __CLR4_5_2gaygaylwye7h61.R.inc(21181);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(readArgument(buf))));
            __CLR4_5_2gaygaylwye7h61.R.inc(21182);position.setCourse(Double.parseDouble(readArgument(buf)));

            __CLR4_5_2gaygaylwye7h61.R.inc(21183);position.set(Position.KEY_SATELLITES, Integer.parseInt(readArgument(buf)));

            __CLR4_5_2gaygaylwye7h61.R.inc(21184);return position;

        }

        }__CLR4_5_2gaygaylwye7h61.R.inc(21185);return null;
    }finally{__CLR4_5_2gaygaylwye7h61.R.flushNeeded();}}

}
