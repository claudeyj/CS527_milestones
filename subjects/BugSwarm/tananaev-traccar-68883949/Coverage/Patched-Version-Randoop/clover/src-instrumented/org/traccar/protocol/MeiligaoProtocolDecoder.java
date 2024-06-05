/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.Crc;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeiligaoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24x94x9lx1dp7zv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,6565,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeiligaoProtocolDecoder(MeiligaoProtocol protocol) {
        super(protocol);__CLR4_5_24x94x9lx1dp7zv.R.inc(6382);try{__CLR4_5_24x94x9lx1dp7zv.R.inc(6381);
    }finally{__CLR4_5_24x94x9lx1dp7zv.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(\\d{2})(\\d{2})(\\d{2})\\.?(\\d+)?," + // Time (HHMMSS.SSS)
            "([AV])," +                         // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +          // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.?\\d*)?," +                // Speed
            "(\\d+\\.?\\d*)?," +                // Course
            "(\\d{2})(\\d{2})(\\d{2})" +        // Date (DDMMYY)
            "[^\\|]*" +
            "(?:\\|(\\d+\\.\\d+)?" +            // HDOP
            "\\|(-?\\d+\\.?\\d*)?" +            // Altitude
            "\\|(\\p{XDigit}{4})?" +            // State
            "(?:\\|(\\p{XDigit}{4}),(\\p{XDigit}{4})" + // ADC
            "(?:,(\\p{XDigit}{4}),(\\p{XDigit}{4}),(\\p{XDigit}{4}),(\\p{XDigit}{4}),(\\p{XDigit}{4}),(\\p{XDigit}{4}))?" +
            "(?:\\|" +
            "(?:(\\p{XDigit}{16})" +            // Cell
            "\\|(\\p{XDigit}{2})" +             // GSM
            "\\|(\\p{XDigit}{8})|" +            // Odometer
            "(\\p{XDigit}{9})" +                // Odometer
            "(?:\\|(\\p{XDigit}{5,}))?)?)?)?)?" + // RFID
            ".*");
    
    private static final int MSG_HEARTBEAT = 0x0001;
    private static final int MSG_SERVER = 0x0002;
    private static final int MSG_LOGIN = 0x5000;
    private static final int MSG_LOGIN_RESPONSE = 0x4000;
    
    private static final int MSG_POSITION = 0x9955;
    private static final int MSG_POSITION_LOGGED = 0x9016;
    private static final int MSG_ALARM = 0x9999;
    
    private String getImei(ChannelBuffer buf) {try{__CLR4_5_24x94x9lx1dp7zv.R.inc(6383);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6384);String id = "";

        __CLR4_5_24x94x9lx1dp7zv.R.inc(6385);for (int i = 0; (((i < 7)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6386)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6387)==0&false)); i++) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6388);int b = buf.readUnsignedByte();

            // First digit
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6389);int d1 = (b & 0xf0) >> 4;
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6390);if ((((d1 == 0xf)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6391)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6392)==0&false))) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6393);break;
            }__CLR4_5_24x94x9lx1dp7zv.R.inc(6394);id += d1;

            // Second digit
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6395);int d2 = (b & 0x0f);
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6396);if ((((d2 == 0xf)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6397)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6398)==0&false))) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6399);break;
            }__CLR4_5_24x94x9lx1dp7zv.R.inc(6400);id += d2;
        }

        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6401);if ((((id.length() == 14)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6402)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6403)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6404);id += Crc.luhnChecksum(id); // IMEI checksum
        }
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6405);return id;
    }finally{__CLR4_5_24x94x9lx1dp7zv.R.flushNeeded();}}
    
    private static void sendResponse(
            Channel channel, ChannelBuffer id, int type, ChannelBuffer msg) {try{__CLR4_5_24x94x9lx1dp7zv.R.inc(6406);
        
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6407);if ((((channel != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6408)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6409)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6410);ChannelBuffer buf = ChannelBuffers.buffer(
                    2 + 2 + id.readableBytes() + 2 + msg.readableBytes() + 2 + 2);
            
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6411);buf.writeByte('@');
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6412);buf.writeByte('@');
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6413);buf.writeShort(buf.capacity());
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6414);buf.writeBytes(id);
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6415);buf.writeShort(type);
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6416);buf.writeBytes(msg);
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6417);buf.writeShort(Crc.crc16X25Ccitt(buf.toByteBuffer()));
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6418);buf.writeByte('\r');
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6419);buf.writeByte('\n');

            __CLR4_5_24x94x9lx1dp7zv.R.inc(6420);channel.write(buf);
        }
    }}finally{__CLR4_5_24x94x9lx1dp7zv.R.flushNeeded();}}
    
    private String getMeiligaoServer(Channel channel) {try{__CLR4_5_24x94x9lx1dp7zv.R.inc(6421);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6422);Properties p = Context.getProps();
        
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6423);if ((((p != null && p.containsKey(getProtocolName() + ".server"))&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6424)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6425)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6426);return p.getProperty(getProtocolName() + ".server");
        } }else {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6427);InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6428);return address.getAddress().getHostAddress() + ":" + address.getPort();
        }
    }}finally{__CLR4_5_24x94x9lx1dp7zv.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24x94x9lx1dp7zv.R.inc(6429);
        
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6430);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6431);buf.skipBytes(2); // header
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6432);buf.readShort(); // length
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6433);ChannelBuffer id = buf.readBytes(7);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6434);int command = buf.readUnsignedShort();
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6435);ChannelBuffer response;
        
        boolean __CLB4_5_2_bool0=false;__CLR4_5_24x94x9lx1dp7zv.R.inc(6436);switch (command) {
            case MSG_LOGIN:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6437);__CLB4_5_2_bool0=true;}
                __CLR4_5_24x94x9lx1dp7zv.R.inc(6438);if ((((channel != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6439)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6440)==0&false))) {{
                    __CLR4_5_24x94x9lx1dp7zv.R.inc(6441);response = ChannelBuffers.wrappedBuffer(new byte[] {0x01});
                    __CLR4_5_24x94x9lx1dp7zv.R.inc(6442);sendResponse(channel, id, MSG_LOGIN_RESPONSE, response);
                }
                }__CLR4_5_24x94x9lx1dp7zv.R.inc(6443);return null;
            case MSG_HEARTBEAT:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6444);__CLB4_5_2_bool0=true;}
                __CLR4_5_24x94x9lx1dp7zv.R.inc(6445);if ((((channel != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6446)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6447)==0&false))) {{
                    __CLR4_5_24x94x9lx1dp7zv.R.inc(6448);response = ChannelBuffers.wrappedBuffer(new byte[] {0x01});
                    __CLR4_5_24x94x9lx1dp7zv.R.inc(6449);sendResponse(channel, id, MSG_HEARTBEAT, response);
                }
                }__CLR4_5_24x94x9lx1dp7zv.R.inc(6450);return null;
            case MSG_SERVER:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6451);__CLB4_5_2_bool0=true;}
                __CLR4_5_24x94x9lx1dp7zv.R.inc(6452);if ((((channel != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6453)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6454)==0&false))) {{
                    __CLR4_5_24x94x9lx1dp7zv.R.inc(6455);response = ChannelBuffers.copiedBuffer(
                            getMeiligaoServer(channel), Charset.defaultCharset());
                    __CLR4_5_24x94x9lx1dp7zv.R.inc(6456);sendResponse(channel, id, MSG_SERVER, response);
                }
                }__CLR4_5_24x94x9lx1dp7zv.R.inc(6457);return null;
            case MSG_POSITION:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6458);__CLB4_5_2_bool0=true;}
            case MSG_POSITION_LOGGED:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6459);__CLB4_5_2_bool0=true;}
            case MSG_ALARM:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6460);__CLB4_5_2_bool0=true;}
                __CLR4_5_24x94x9lx1dp7zv.R.inc(6461);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6462);__CLB4_5_2_bool0=true;}
                __CLR4_5_24x94x9lx1dp7zv.R.inc(6463);return null;
        }

        // Create new position
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6464);Position position = new Position();
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6465);position.setProtocol(getProtocolName());

        // Custom data
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6466);if ((((command == MSG_ALARM)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6467)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6468)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6469);position.set(Event.KEY_ALARM, buf.readUnsignedByte());
        } }else {__CLR4_5_24x94x9lx1dp7zv.R.inc(6470);if ((((command == MSG_POSITION_LOGGED)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6471)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6472)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6473);buf.skipBytes(6);
        }

        // Get device by id
        }}__CLR4_5_24x94x9lx1dp7zv.R.inc(6474);if ((((!identify(getImei(id), channel))&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6475)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6476)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6477);return null;
        }
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6478);position.setDeviceId(getDeviceId());

        // Parse message
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6479);String sentence = buf.toString(
                buf.readerIndex(), buf.readableBytes() - 4, Charset.defaultCharset());
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6480);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6481);if ((((!parser.matches())&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6482)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6483)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6484);return null;
        }

        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6485);Integer index = 1;

        // Time
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6486);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6487);time.clear();
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6488);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6489);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6490);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6491);String mseconds = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6492);if ((((mseconds != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6493)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6494)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6495);time.set(Calendar.MILLISECOND, Integer.valueOf(mseconds));
        }

        // Validity
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6496);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6497);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6498);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6499);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6500)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6501)==0&false))) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6502);latitude = -latitude;
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6503);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6504);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6505);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6506);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6507)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6508)==0&false))) {__CLR4_5_24x94x9lx1dp7zv.R.inc(6509);longitude = -longitude;
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6510);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6511);String speed = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6512);if ((((speed != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6513)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6514)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6515);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6516);String course = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6517);if ((((course != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6518)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6519)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6520);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6521);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6522);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6523);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6524);position.setTime(time.getTime());

        // HDOP
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6525);position.set(Event.KEY_HDOP, parser.group(index++));

        // Altitude
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6526);String altitude = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6527);if ((((altitude != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6528)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6529)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6530);position.setAltitude(Double.valueOf(altitude));
        }

        // State
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6531);String state = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6532);if ((((state != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6533)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6534)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6535);position.set(Event.KEY_STATUS, state);
        }

        // ADC
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6536);for (int i = 1; (((i <= 8)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6537)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6538)==0&false)); i++) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6539);String adc = parser.group(index++);
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6540);if ((((adc != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6541)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6542)==0&false))) {{
                __CLR4_5_24x94x9lx1dp7zv.R.inc(6543);position.set(Event.PREFIX_ADC + i, Integer.parseInt(adc, 16));
            }
        }}

        // Cell identifier
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6544);position.set(Event.KEY_CELL, parser.group(index++));

        // GSM signal
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6545);String gsm = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6546);if ((((gsm != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6547)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6548)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6549);position.set(Event.KEY_GSM, Integer.parseInt(gsm, 16));
        }

        // Odometer
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6550);String odometer = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6551);if ((((odometer == null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6552)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6553)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6554);odometer = parser.group(index++);
        }
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6555);if ((((odometer != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6556)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6557)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6558);position.set(Event.KEY_ODOMETER, Integer.parseInt(odometer, 16));
        }
        
        // RFID
        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6559);String rfid = parser.group(index++);
        __CLR4_5_24x94x9lx1dp7zv.R.inc(6560);if ((((rfid != null)&&(__CLR4_5_24x94x9lx1dp7zv.R.iget(6561)!=0|true))||(__CLR4_5_24x94x9lx1dp7zv.R.iget(6562)==0&false))) {{
            __CLR4_5_24x94x9lx1dp7zv.R.inc(6563);position.set(Event.KEY_RFID, Integer.parseInt(rfid, 16));
        }

        }__CLR4_5_24x94x9lx1dp7zv.R.inc(6564);return position;
    }finally{__CLR4_5_24x94x9lx1dp7zv.R.flushNeeded();}}

}
