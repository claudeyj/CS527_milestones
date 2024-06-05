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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
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

public class Tk102ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2g1mg1mlwye672c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,20857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk102ProtocolDecoder(Tk102Protocol protocol) {
        super(protocol);__CLR4_5_2g1mg1mlwye672c.R.inc(20795);try{__CLR4_5_2g1mg1mlwye672c.R.inc(20794);
    }finally{__CLR4_5_2g1mg1mlwye672c.R.flushNeeded();}}

    public static final int MSG_LOGIN_REQUEST = 0x80;
    public static final int MSG_LOGIN_REQUEST_2 = 0x21;
    public static final int MSG_LOGIN_RESPONSE = 0x00;
    public static final int MSG_HEARTBEAT_REQUEST = 0xF0;
    public static final int MSG_HEARTBEAT_RESPONSE = 0xFF;
    public static final int MSG_REPORT_ONCE = 0x90;
    public static final int MSG_REPORT_INTERVAL = 0x93;

    public static final int MODE_GPRS = 0x30;
    public static final int MODE_GPRS_SMS = 0x33;

    private static final Pattern PATTERN = new PatternBuilder()
            .text("(")
            .expression("[A-Z]+")
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .expression("([AV])")                // validity
            .number("(dd)(dd.dddd)([NS])")       // latitude
            .number("(ddd)(dd.dddd)([EW])")      // longitude
            .number("(ddd.ddd)")                 // speed
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .text(")")
            .compile();

    private void sendResponse(Channel channel, int type, ChannelBuffer dataSequence, ChannelBuffer content) {try{__CLR4_5_2g1mg1mlwye672c.R.inc(20796);
        __CLR4_5_2g1mg1mlwye672c.R.inc(20797);if ((((channel != null)&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20798)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20799)==0&false))) {{
            __CLR4_5_2g1mg1mlwye672c.R.inc(20800);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2g1mg1mlwye672c.R.inc(20801);response.writeByte('[');
            __CLR4_5_2g1mg1mlwye672c.R.inc(20802);response.writeByte(type);
            __CLR4_5_2g1mg1mlwye672c.R.inc(20803);response.writeBytes(dataSequence);
            __CLR4_5_2g1mg1mlwye672c.R.inc(20804);response.writeByte(content.readableBytes());
            __CLR4_5_2g1mg1mlwye672c.R.inc(20805);response.writeBytes(content);
            __CLR4_5_2g1mg1mlwye672c.R.inc(20806);response.writeByte(']');
            __CLR4_5_2g1mg1mlwye672c.R.inc(20807);channel.write(response);
        }
    }}finally{__CLR4_5_2g1mg1mlwye672c.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2g1mg1mlwye672c.R.inc(20808);

        __CLR4_5_2g1mg1mlwye672c.R.inc(20809);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2g1mg1mlwye672c.R.inc(20810);buf.skipBytes(1); // header
        __CLR4_5_2g1mg1mlwye672c.R.inc(20811);int type = buf.readUnsignedByte();
        __CLR4_5_2g1mg1mlwye672c.R.inc(20812);ChannelBuffer dataSequence = buf.readBytes(10);
        __CLR4_5_2g1mg1mlwye672c.R.inc(20813);int length = buf.readUnsignedByte();

        __CLR4_5_2g1mg1mlwye672c.R.inc(20814);if ((((type == MSG_LOGIN_REQUEST || type == MSG_LOGIN_REQUEST_2)&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20815)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20816)==0&false))) {{

            __CLR4_5_2g1mg1mlwye672c.R.inc(20817);ChannelBuffer data = buf.readBytes(length);

            __CLR4_5_2g1mg1mlwye672c.R.inc(20818);String id;
            __CLR4_5_2g1mg1mlwye672c.R.inc(20819);if ((((type == MSG_LOGIN_REQUEST)&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20820)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20821)==0&false))) {{
                __CLR4_5_2g1mg1mlwye672c.R.inc(20822);id =  data.toString(StandardCharsets.US_ASCII);
            } }else {{
                __CLR4_5_2g1mg1mlwye672c.R.inc(20823);id = data.copy(1, 15).toString(StandardCharsets.US_ASCII);
            }

            }__CLR4_5_2g1mg1mlwye672c.R.inc(20824);if ((((getDeviceSession(channel, remoteAddress, id) != null)&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20825)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20826)==0&false))) {{
                __CLR4_5_2g1mg1mlwye672c.R.inc(20827);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2g1mg1mlwye672c.R.inc(20828);response.writeByte(MODE_GPRS);
                __CLR4_5_2g1mg1mlwye672c.R.inc(20829);response.writeBytes(data);
                __CLR4_5_2g1mg1mlwye672c.R.inc(20830);sendResponse(channel, MSG_LOGIN_RESPONSE, dataSequence, response);
            }

        }} }else {__CLR4_5_2g1mg1mlwye672c.R.inc(20831);if ((((type == MSG_HEARTBEAT_REQUEST)&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20832)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20833)==0&false))) {{

            __CLR4_5_2g1mg1mlwye672c.R.inc(20834);sendResponse(channel, MSG_HEARTBEAT_RESPONSE, dataSequence, buf.readBytes(length));

        } }else {{

            __CLR4_5_2g1mg1mlwye672c.R.inc(20835);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2g1mg1mlwye672c.R.inc(20836);if ((((deviceSession == null)&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20837)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20838)==0&false))) {{
                __CLR4_5_2g1mg1mlwye672c.R.inc(20839);return null;
            }

            }__CLR4_5_2g1mg1mlwye672c.R.inc(20840);Parser parser = new Parser(PATTERN, buf.readBytes(length).toString(StandardCharsets.US_ASCII));
            __CLR4_5_2g1mg1mlwye672c.R.inc(20841);if ((((!parser.matches())&&(__CLR4_5_2g1mg1mlwye672c.R.iget(20842)!=0|true))||(__CLR4_5_2g1mg1mlwye672c.R.iget(20843)==0&false))) {{
                __CLR4_5_2g1mg1mlwye672c.R.inc(20844);return null;
            }

            }__CLR4_5_2g1mg1mlwye672c.R.inc(20845);Position position = new Position();
            __CLR4_5_2g1mg1mlwye672c.R.inc(20846);position.setProtocol(getProtocolName());
            __CLR4_5_2g1mg1mlwye672c.R.inc(20847);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2g1mg1mlwye672c.R.inc(20848);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

            __CLR4_5_2g1mg1mlwye672c.R.inc(20849);position.setValid(parser.next().equals("A"));
            __CLR4_5_2g1mg1mlwye672c.R.inc(20850);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2g1mg1mlwye672c.R.inc(20851);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2g1mg1mlwye672c.R.inc(20852);position.setSpeed(parser.nextDouble(0));

            __CLR4_5_2g1mg1mlwye672c.R.inc(20853);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_2g1mg1mlwye672c.R.inc(20854);position.setTime(dateBuilder.getDate());

            __CLR4_5_2g1mg1mlwye672c.R.inc(20855);return position;

        }

        }}__CLR4_5_2g1mg1mlwye672c.R.inc(20856);return null;
    }finally{__CLR4_5_2g1mg1mlwye672c.R.flushNeeded();}}

}
