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
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.Crc;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeiligaoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25c85c8lx1e808a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,7150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeiligaoProtocolDecoder(MeiligaoProtocol protocol) {
        super(protocol);__CLR4_5_25c85c8lx1e808a.R.inc(6921);try{__CLR4_5_25c85c8lx1e808a.R.inc(6920);
    }finally{__CLR4_5_25c85c8lx1e808a.R.flushNeeded();}}

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

    private static final Pattern rfidPattern = Pattern.compile(
            "\\|(\\d{2})(\\d{2})(\\d{2})," +    // Time (HHMMSS)
            "(\\d{2})(\\d{2})(\\d{2})," +       // Date (DDMMYY)
            "(\\d+)(\\d{2}\\.\\d+)," +          // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Longitude (DDDMM.MMMM)
            "([EW])");

    private static final int MSG_HEARTBEAT = 0x0001;
    private static final int MSG_SERVER = 0x0002;
    private static final int MSG_LOGIN = 0x5000;
    private static final int MSG_LOGIN_RESPONSE = 0x4000;
    
    private static final int MSG_POSITION = 0x9955;
    private static final int MSG_POSITION_LOGGED = 0x9016;
    private static final int MSG_ALARM = 0x9999;

    private static final int MSG_RFID = 0x9966;
    
    private String getImei(ChannelBuffer buf) {try{__CLR4_5_25c85c8lx1e808a.R.inc(6922);
        __CLR4_5_25c85c8lx1e808a.R.inc(6923);String id = "";

        __CLR4_5_25c85c8lx1e808a.R.inc(6924);for (int i = 0; (((i < 7)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6925)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6926)==0&false)); i++) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(6927);int b = buf.readUnsignedByte();

            // First digit
            __CLR4_5_25c85c8lx1e808a.R.inc(6928);int d1 = (b & 0xf0) >> 4;
            __CLR4_5_25c85c8lx1e808a.R.inc(6929);if ((((d1 == 0xf)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6930)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6931)==0&false))) {__CLR4_5_25c85c8lx1e808a.R.inc(6932);break;
            }__CLR4_5_25c85c8lx1e808a.R.inc(6933);id += d1;

            // Second digit
            __CLR4_5_25c85c8lx1e808a.R.inc(6934);int d2 = (b & 0x0f);
            __CLR4_5_25c85c8lx1e808a.R.inc(6935);if ((((d2 == 0xf)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6936)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6937)==0&false))) {__CLR4_5_25c85c8lx1e808a.R.inc(6938);break;
            }__CLR4_5_25c85c8lx1e808a.R.inc(6939);id += d2;
        }

        }__CLR4_5_25c85c8lx1e808a.R.inc(6940);if ((((id.length() == 14)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6941)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6942)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(6943);id += Crc.luhnChecksum(Long.valueOf(id)); // IMEI checksum
        }
        }__CLR4_5_25c85c8lx1e808a.R.inc(6944);if ((((id.length() > 15)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6945)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6946)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(6947);id = id.substring(0, 15);
        }
        }__CLR4_5_25c85c8lx1e808a.R.inc(6948);return id;
    }finally{__CLR4_5_25c85c8lx1e808a.R.flushNeeded();}}
    
    private static void sendResponse(
            Channel channel, ChannelBuffer id, int type, ChannelBuffer msg) {try{__CLR4_5_25c85c8lx1e808a.R.inc(6949);
        
        __CLR4_5_25c85c8lx1e808a.R.inc(6950);if ((((channel != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6951)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6952)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(6953);ChannelBuffer buf = ChannelBuffers.buffer(
                    2 + 2 + id.readableBytes() + 2 + msg.readableBytes() + 2 + 2);
            
            __CLR4_5_25c85c8lx1e808a.R.inc(6954);buf.writeByte('@');
            __CLR4_5_25c85c8lx1e808a.R.inc(6955);buf.writeByte('@');
            __CLR4_5_25c85c8lx1e808a.R.inc(6956);buf.writeShort(buf.capacity());
            __CLR4_5_25c85c8lx1e808a.R.inc(6957);buf.writeBytes(id);
            __CLR4_5_25c85c8lx1e808a.R.inc(6958);buf.writeShort(type);
            __CLR4_5_25c85c8lx1e808a.R.inc(6959);buf.writeBytes(msg);
            __CLR4_5_25c85c8lx1e808a.R.inc(6960);buf.writeShort(Crc.crc16X25Ccitt(buf.toByteBuffer()));
            __CLR4_5_25c85c8lx1e808a.R.inc(6961);buf.writeByte('\r');
            __CLR4_5_25c85c8lx1e808a.R.inc(6962);buf.writeByte('\n');

            __CLR4_5_25c85c8lx1e808a.R.inc(6963);channel.write(buf);
        }
    }}finally{__CLR4_5_25c85c8lx1e808a.R.flushNeeded();}}
    
    private String getMeiligaoServer(Channel channel) {try{__CLR4_5_25c85c8lx1e808a.R.inc(6964);
        __CLR4_5_25c85c8lx1e808a.R.inc(6965);String server = Context.getConfig().getString(getProtocolName() + ".server");
        __CLR4_5_25c85c8lx1e808a.R.inc(6966);if ((((server == null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6967)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6968)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(6969);InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();
            __CLR4_5_25c85c8lx1e808a.R.inc(6970);server = address.getAddress().getHostAddress() + ":" + address.getPort();
        }
        }__CLR4_5_25c85c8lx1e808a.R.inc(6971);return server;
    }finally{__CLR4_5_25c85c8lx1e808a.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_25c85c8lx1e808a.R.inc(6972);
        
        __CLR4_5_25c85c8lx1e808a.R.inc(6973);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_25c85c8lx1e808a.R.inc(6974);buf.skipBytes(2); // header
        __CLR4_5_25c85c8lx1e808a.R.inc(6975);buf.readShort(); // length
        __CLR4_5_25c85c8lx1e808a.R.inc(6976);ChannelBuffer id = buf.readBytes(7);
        __CLR4_5_25c85c8lx1e808a.R.inc(6977);int command = buf.readUnsignedShort();
        __CLR4_5_25c85c8lx1e808a.R.inc(6978);ChannelBuffer response;
        
        boolean __CLB4_5_2_bool0=false;__CLR4_5_25c85c8lx1e808a.R.inc(6979);switch (command) {
            case MSG_LOGIN:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(6980);__CLB4_5_2_bool0=true;}
                __CLR4_5_25c85c8lx1e808a.R.inc(6981);if ((((channel != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6982)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6983)==0&false))) {{
                    __CLR4_5_25c85c8lx1e808a.R.inc(6984);response = ChannelBuffers.wrappedBuffer(new byte[] {0x01});
                    __CLR4_5_25c85c8lx1e808a.R.inc(6985);sendResponse(channel, id, MSG_LOGIN_RESPONSE, response);
                }
                }__CLR4_5_25c85c8lx1e808a.R.inc(6986);return null;
            case MSG_HEARTBEAT:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(6987);__CLB4_5_2_bool0=true;}
                __CLR4_5_25c85c8lx1e808a.R.inc(6988);if ((((channel != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6989)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6990)==0&false))) {{
                    __CLR4_5_25c85c8lx1e808a.R.inc(6991);response = ChannelBuffers.wrappedBuffer(new byte[] {0x01});
                    __CLR4_5_25c85c8lx1e808a.R.inc(6992);sendResponse(channel, id, MSG_HEARTBEAT, response);
                }
                }__CLR4_5_25c85c8lx1e808a.R.inc(6993);return null;
            case MSG_SERVER:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(6994);__CLB4_5_2_bool0=true;}
                __CLR4_5_25c85c8lx1e808a.R.inc(6995);if ((((channel != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(6996)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(6997)==0&false))) {{
                    __CLR4_5_25c85c8lx1e808a.R.inc(6998);response = ChannelBuffers.copiedBuffer(
                            getMeiligaoServer(channel), Charset.defaultCharset());
                    __CLR4_5_25c85c8lx1e808a.R.inc(6999);sendResponse(channel, id, MSG_SERVER, response);
                }
                }__CLR4_5_25c85c8lx1e808a.R.inc(7000);return null;
            case MSG_POSITION:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(7001);__CLB4_5_2_bool0=true;}
            case MSG_POSITION_LOGGED:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(7002);__CLB4_5_2_bool0=true;}
            case MSG_ALARM:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(7003);__CLB4_5_2_bool0=true;}
            case MSG_RFID:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(7004);__CLB4_5_2_bool0=true;}
                __CLR4_5_25c85c8lx1e808a.R.inc(7005);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_25c85c8lx1e808a.R.inc(7006);__CLB4_5_2_bool0=true;}
                __CLR4_5_25c85c8lx1e808a.R.inc(7007);return null;
        }

        // Create new position
        __CLR4_5_25c85c8lx1e808a.R.inc(7008);Position position = new Position();
        __CLR4_5_25c85c8lx1e808a.R.inc(7009);position.setProtocol(getProtocolName());

        // Custom data
        __CLR4_5_25c85c8lx1e808a.R.inc(7010);if ((((command == MSG_ALARM)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7011)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7012)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(7013);position.set(Event.KEY_ALARM, buf.readUnsignedByte());
        } }else {__CLR4_5_25c85c8lx1e808a.R.inc(7014);if ((((command == MSG_POSITION_LOGGED)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7015)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7016)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(7017);buf.skipBytes(6);
        }

        // Get device by id
        }}__CLR4_5_25c85c8lx1e808a.R.inc(7018);if ((((!identify(getImei(id), channel))&&(__CLR4_5_25c85c8lx1e808a.R.iget(7019)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7020)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(7021);return null;
        }
        }__CLR4_5_25c85c8lx1e808a.R.inc(7022);position.setDeviceId(getDeviceId());

        // RFID
        __CLR4_5_25c85c8lx1e808a.R.inc(7023);if ((((command == MSG_RFID)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7024)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7025)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(7026);for (int i = 0; (((i < 15)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7027)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7028)==0&false)); i++) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7029);long rfid = buf.readUnsignedInt();
                __CLR4_5_25c85c8lx1e808a.R.inc(7030);if ((((rfid != 0)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7031)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7032)==0&false))) {{
                    __CLR4_5_25c85c8lx1e808a.R.inc(7033);String card = String.format("%010d", rfid);
                    __CLR4_5_25c85c8lx1e808a.R.inc(7034);position.set("card" + (i + 1), card);
                    __CLR4_5_25c85c8lx1e808a.R.inc(7035);position.set(Event.KEY_RFID, card);
                }
            }}
        }}

        // Parse message
        }__CLR4_5_25c85c8lx1e808a.R.inc(7036);String sentence = buf.toString(buf.readerIndex(), buf.readableBytes() - 4, Charset.defaultCharset());
        __CLR4_5_25c85c8lx1e808a.R.inc(7037);Matcher parser = ((((command == MSG_RFID )&&(__CLR4_5_25c85c8lx1e808a.R.iget(7038)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7039)==0&false))? rfidPattern : pattern).matcher(sentence);
        __CLR4_5_25c85c8lx1e808a.R.inc(7040);if ((((!parser.matches())&&(__CLR4_5_25c85c8lx1e808a.R.iget(7041)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7042)==0&false))) {{
            __CLR4_5_25c85c8lx1e808a.R.inc(7043);return null;
        }
        }__CLR4_5_25c85c8lx1e808a.R.inc(7044);Integer index = 1;

        __CLR4_5_25c85c8lx1e808a.R.inc(7045);if ((((command == MSG_RFID)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7046)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7047)==0&false))) {{

            // Time and date
            __CLR4_5_25c85c8lx1e808a.R.inc(7048);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_25c85c8lx1e808a.R.inc(7049);time.clear();
            __CLR4_5_25c85c8lx1e808a.R.inc(7050);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7051);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7052);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7053);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7054);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_25c85c8lx1e808a.R.inc(7055);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7056);position.setTime(time.getTime());

            // Latitude
            __CLR4_5_25c85c8lx1e808a.R.inc(7057);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_25c85c8lx1e808a.R.inc(7058);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_25c85c8lx1e808a.R.inc(7059);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7060)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7061)==0&false))) {__CLR4_5_25c85c8lx1e808a.R.inc(7062);latitude = -latitude;
            }__CLR4_5_25c85c8lx1e808a.R.inc(7063);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_25c85c8lx1e808a.R.inc(7064);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_25c85c8lx1e808a.R.inc(7065);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_25c85c8lx1e808a.R.inc(7066);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7067)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7068)==0&false))) {__CLR4_5_25c85c8lx1e808a.R.inc(7069);longitude = -longitude;
            }__CLR4_5_25c85c8lx1e808a.R.inc(7070);position.setLongitude(longitude);

        } }else {{

            // Time
            __CLR4_5_25c85c8lx1e808a.R.inc(7071);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_25c85c8lx1e808a.R.inc(7072);time.clear();
            __CLR4_5_25c85c8lx1e808a.R.inc(7073);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7074);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7075);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7076);String mseconds = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7077);if ((((mseconds != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7078)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7079)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7080);time.set(Calendar.MILLISECOND, Integer.valueOf(mseconds));
            }

            // Validity
            }__CLR4_5_25c85c8lx1e808a.R.inc(7081);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_25c85c8lx1e808a.R.inc(7082);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_25c85c8lx1e808a.R.inc(7083);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_25c85c8lx1e808a.R.inc(7084);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7085)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7086)==0&false))) {__CLR4_5_25c85c8lx1e808a.R.inc(7087);latitude = -latitude;
            }__CLR4_5_25c85c8lx1e808a.R.inc(7088);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_25c85c8lx1e808a.R.inc(7089);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_25c85c8lx1e808a.R.inc(7090);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_25c85c8lx1e808a.R.inc(7091);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7092)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7093)==0&false))) {__CLR4_5_25c85c8lx1e808a.R.inc(7094);longitude = -longitude;
            }__CLR4_5_25c85c8lx1e808a.R.inc(7095);position.setLongitude(longitude);

            // Speed
            __CLR4_5_25c85c8lx1e808a.R.inc(7096);String speed = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7097);if ((((speed != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7098)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7099)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7100);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_25c85c8lx1e808a.R.inc(7101);String course = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7102);if ((((course != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7103)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7104)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7105);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_25c85c8lx1e808a.R.inc(7106);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7107);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_25c85c8lx1e808a.R.inc(7108);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_25c85c8lx1e808a.R.inc(7109);position.setTime(time.getTime());

            // HDOP
            __CLR4_5_25c85c8lx1e808a.R.inc(7110);position.set(Event.KEY_HDOP, parser.group(index++));

            // Altitude
            __CLR4_5_25c85c8lx1e808a.R.inc(7111);String altitude = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7112);if ((((altitude != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7113)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7114)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7115);position.setAltitude(Double.valueOf(altitude));
            }

            // State
            }__CLR4_5_25c85c8lx1e808a.R.inc(7116);String state = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7117);if ((((state != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7118)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7119)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7120);position.set(Event.KEY_STATUS, state);
            }

            // ADC
            }__CLR4_5_25c85c8lx1e808a.R.inc(7121);for (int i = 1; (((i <= 8)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7122)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7123)==0&false)); i++) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7124);String adc = parser.group(index++);
                __CLR4_5_25c85c8lx1e808a.R.inc(7125);if ((((adc != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7126)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7127)==0&false))) {{
                    __CLR4_5_25c85c8lx1e808a.R.inc(7128);position.set(Event.PREFIX_ADC + i, Integer.parseInt(adc, 16));
                }
            }}

            // Cell identifier
            }__CLR4_5_25c85c8lx1e808a.R.inc(7129);position.set(Event.KEY_CELL, parser.group(index++));

            // GSM signal
            __CLR4_5_25c85c8lx1e808a.R.inc(7130);String gsm = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7131);if ((((gsm != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7132)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7133)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7134);position.set(Event.KEY_GSM, Integer.parseInt(gsm, 16));
            }

            // Odometer
            }__CLR4_5_25c85c8lx1e808a.R.inc(7135);String odometer = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7136);if ((((odometer == null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7137)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7138)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7139);odometer = parser.group(index++);
            }
            }__CLR4_5_25c85c8lx1e808a.R.inc(7140);if ((((odometer != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7141)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7142)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7143);position.set(Event.KEY_ODOMETER, Integer.parseInt(odometer, 16));
            }

            // RFID
            }__CLR4_5_25c85c8lx1e808a.R.inc(7144);String rfid = parser.group(index++);
            __CLR4_5_25c85c8lx1e808a.R.inc(7145);if ((((rfid != null)&&(__CLR4_5_25c85c8lx1e808a.R.iget(7146)!=0|true))||(__CLR4_5_25c85c8lx1e808a.R.iget(7147)==0&false))) {{
                __CLR4_5_25c85c8lx1e808a.R.inc(7148);position.set(Event.KEY_RFID, Integer.parseInt(rfid, 16));
            }

        }}

        }__CLR4_5_25c85c8lx1e808a.R.inc(7149);return position;
    }finally{__CLR4_5_25c85c8lx1e808a.R.flushNeeded();}}

}
