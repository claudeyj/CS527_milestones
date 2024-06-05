/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeitrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25jc5jclx1e8096{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,7308,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeitrackProtocolDecoder(MeitrackProtocol protocol) {
        super(protocol);__CLR4_5_25jc5jclx1e8096.R.inc(7177);try{__CLR4_5_25jc5jclx1e8096.R.inc(7176);
    }finally{__CLR4_5_25jc5jclx1e8096.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$\\$." +                         // Flag
            "\\d+," +                           // Length
            "(\\d+)," +                         // IMEI
            "\\p{XDigit}{3}," +                 // Command
            "(?:\\d+,)?" +
            "(\\d+)," +                         // Event
            "(-?\\d+\\.\\d+)," +                // Latitude
            "(-?\\d+\\.\\d+)," +                // Longitude
            "(\\d{2})(\\d{2})(\\d{2})" +        // Date (YYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +       // Time (HHMMSS)
            "([AV])," +                         // Validity
            "(\\d+)," +                         // Satellites
            "(\\d+)," +                         // GSM Signal
            "(\\d+\\.?\\d*)," +                 // Speed
            "(\\d+)," +                         // Course
            "(\\d+\\.?\\d*)," +                 // HDOP
            "(-?\\d+)," +                       // Altitude
            "(\\d+)," +                         // Odometer
            "(\\d+)," +                         // Runtime
            "(\\d+\\|\\d+\\|\\p{XDigit}+\\|\\p{XDigit}+)," + // Cell
            "(\\p{XDigit}+)," +                 // State
            "(\\p{XDigit}+)?\\|" +              // ADC1
            "(\\p{XDigit}+)?\\|" +              // ADC2
            "(\\p{XDigit}+)?\\|" +              // ADC3
            "(\\p{XDigit}+)\\|" +               // Battery
            "(\\p{XDigit}+)," +                 // Power
            "(?:([^,]+)?," +                    // Event Specific
            "[^,]*," +                          // Reserved
            "\\d*," +                           // Protocol
            "(\\p{XDigit}{4})?)?" +              // Fuel
            ".*\\*\\p{XDigit}{2}(?:\r\n)?");

    private Position decodeRegularMessage(Channel channel, ChannelBuffer buf) {try{__CLR4_5_25jc5jclx1e8096.R.inc(7178);

        // Parse message
        __CLR4_5_25jc5jclx1e8096.R.inc(7179);String sentence = buf.toString(Charset.defaultCharset());
        __CLR4_5_25jc5jclx1e8096.R.inc(7180);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_25jc5jclx1e8096.R.inc(7181);if ((((!parser.matches())&&(__CLR4_5_25jc5jclx1e8096.R.iget(7182)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7183)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7184);return null;
        }

        // Create new position
        }__CLR4_5_25jc5jclx1e8096.R.inc(7185);Position position = new Position();
        __CLR4_5_25jc5jclx1e8096.R.inc(7186);position.setProtocol(getProtocolName());

        __CLR4_5_25jc5jclx1e8096.R.inc(7187);Integer index = 1;

        // Identification
        __CLR4_5_25jc5jclx1e8096.R.inc(7188);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_25jc5jclx1e8096.R.iget(7189)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7190)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7191);return null;
        }
        }__CLR4_5_25jc5jclx1e8096.R.inc(7192);position.setDeviceId(getDeviceId());

        // Event
        __CLR4_5_25jc5jclx1e8096.R.inc(7193);int event = Integer.valueOf(parser.group(index++));
        __CLR4_5_25jc5jclx1e8096.R.inc(7194);position.set(Event.KEY_EVENT, event);

        // Coordinates
        __CLR4_5_25jc5jclx1e8096.R.inc(7195);position.setLatitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_25jc5jclx1e8096.R.inc(7196);position.setLongitude(Double.valueOf(parser.group(index++)));

        // Time
        __CLR4_5_25jc5jclx1e8096.R.inc(7197);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_25jc5jclx1e8096.R.inc(7198);time.clear();
        __CLR4_5_25jc5jclx1e8096.R.inc(7199);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_25jc5jclx1e8096.R.inc(7200);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_25jc5jclx1e8096.R.inc(7201);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_25jc5jclx1e8096.R.inc(7202);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_25jc5jclx1e8096.R.inc(7203);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_25jc5jclx1e8096.R.inc(7204);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_25jc5jclx1e8096.R.inc(7205);position.setTime(time.getTime());

        // Validity
        __CLR4_5_25jc5jclx1e8096.R.inc(7206);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Satellites
        __CLR4_5_25jc5jclx1e8096.R.inc(7207);position.set(Event.KEY_SATELLITES, parser.group(index++));

        // GSM Signal
        __CLR4_5_25jc5jclx1e8096.R.inc(7208);position.set(Event.KEY_GSM, parser.group(index++));

        // Speed
        __CLR4_5_25jc5jclx1e8096.R.inc(7209);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(parser.group(index++))));

        // Course
        __CLR4_5_25jc5jclx1e8096.R.inc(7210);position.setCourse(Double.valueOf(parser.group(index++)));

        // HDOP
        __CLR4_5_25jc5jclx1e8096.R.inc(7211);position.set(Event.KEY_HDOP, parser.group(index++));

        // Altitude
        __CLR4_5_25jc5jclx1e8096.R.inc(7212);position.setAltitude(Double.valueOf(parser.group(index++)));

        // Other
        __CLR4_5_25jc5jclx1e8096.R.inc(7213);position.set(Event.KEY_ODOMETER, parser.group(index++));
        __CLR4_5_25jc5jclx1e8096.R.inc(7214);position.set("runtime", parser.group(index++));
        __CLR4_5_25jc5jclx1e8096.R.inc(7215);position.set(Event.KEY_CELL, parser.group(index++));
        __CLR4_5_25jc5jclx1e8096.R.inc(7216);position.set(Event.KEY_STATUS, parser.group(index++));
        
        // ADC
        __CLR4_5_25jc5jclx1e8096.R.inc(7217);String adc1 = parser.group(index++);
        __CLR4_5_25jc5jclx1e8096.R.inc(7218);if ((((adc1 != null)&&(__CLR4_5_25jc5jclx1e8096.R.iget(7219)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7220)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7221);position.set(Event.PREFIX_ADC + 1, Integer.parseInt(adc1, 16));
        }
        }__CLR4_5_25jc5jclx1e8096.R.inc(7222);String adc2 = parser.group(index++);
        __CLR4_5_25jc5jclx1e8096.R.inc(7223);if ((((adc2 != null)&&(__CLR4_5_25jc5jclx1e8096.R.iget(7224)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7225)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7226);position.set(Event.PREFIX_ADC + 2, Integer.parseInt(adc2, 16));
        }
        }__CLR4_5_25jc5jclx1e8096.R.inc(7227);String adc3 = parser.group(index++);
        __CLR4_5_25jc5jclx1e8096.R.inc(7228);if ((((adc3 != null)&&(__CLR4_5_25jc5jclx1e8096.R.iget(7229)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7230)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7231);position.set(Event.PREFIX_ADC + 3, Integer.parseInt(adc3, 16));
        }
        }__CLR4_5_25jc5jclx1e8096.R.inc(7232);position.set(Event.KEY_BATTERY, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_25jc5jclx1e8096.R.inc(7233);position.set(Event.KEY_POWER, Integer.parseInt(parser.group(index++), 16));

        // Event specific
        __CLR4_5_25jc5jclx1e8096.R.inc(7234);String data = parser.group(index++);
        __CLR4_5_25jc5jclx1e8096.R.inc(7235);if ((((data != null && !data.isEmpty())&&(__CLR4_5_25jc5jclx1e8096.R.iget(7236)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7237)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_25jc5jclx1e8096.R.inc(7238);switch (event) {
                case 37:if (!__CLB4_5_2_bool0) {__CLR4_5_25jc5jclx1e8096.R.inc(7239);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25jc5jclx1e8096.R.inc(7240);position.set(Event.KEY_RFID, data);
                    __CLR4_5_25jc5jclx1e8096.R.inc(7241);break;
            }
        }

        // Fuel
        }__CLR4_5_25jc5jclx1e8096.R.inc(7242);String fuel = parser.group(index++);
        __CLR4_5_25jc5jclx1e8096.R.inc(7243);if ((((fuel != null)&&(__CLR4_5_25jc5jclx1e8096.R.iget(7244)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7245)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7246);position.set(Event.KEY_FUEL,
                    Integer.parseInt(fuel.substring(0, 2), 16) + Integer.parseInt(fuel.substring(2), 16) * 0.01);
        }

        }__CLR4_5_25jc5jclx1e8096.R.inc(7247);return position;
    }finally{__CLR4_5_25jc5jclx1e8096.R.flushNeeded();}}

    private List<Position> decodeBinaryMessage(Channel channel, ChannelBuffer buf) {try{__CLR4_5_25jc5jclx1e8096.R.inc(7248);
        __CLR4_5_25jc5jclx1e8096.R.inc(7249);List<Position> positions = new LinkedList<>();
        
        __CLR4_5_25jc5jclx1e8096.R.inc(7250);String flag = buf.toString(2, 1, Charset.defaultCharset());
        __CLR4_5_25jc5jclx1e8096.R.inc(7251);int index = ChannelBufferTools.find(buf, 0, buf.readableBytes(), ",");
        
        // Identification
        __CLR4_5_25jc5jclx1e8096.R.inc(7252);String imei = buf.toString(index + 1, 15, Charset.defaultCharset());
        __CLR4_5_25jc5jclx1e8096.R.inc(7253);if ((((!identify(imei, channel))&&(__CLR4_5_25jc5jclx1e8096.R.iget(7254)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7255)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7256);return null;
        }

        }__CLR4_5_25jc5jclx1e8096.R.inc(7257);buf.skipBytes(index + 1 + 15 + 1 + 3 + 1 + 2 + 2 + 4);
        
        __CLR4_5_25jc5jclx1e8096.R.inc(7258);while ((((buf.readableBytes() >= 0x34)&&(__CLR4_5_25jc5jclx1e8096.R.iget(7259)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7260)==0&false))) {{
            
            __CLR4_5_25jc5jclx1e8096.R.inc(7261);Position position = new Position();
            __CLR4_5_25jc5jclx1e8096.R.inc(7262);position.setProtocol(getProtocolName());
            __CLR4_5_25jc5jclx1e8096.R.inc(7263);position.setDeviceId(getDeviceId());
            
            // Event
            __CLR4_5_25jc5jclx1e8096.R.inc(7264);position.set(Event.KEY_EVENT, buf.readUnsignedByte());
            
            // Location
            __CLR4_5_25jc5jclx1e8096.R.inc(7265);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_25jc5jclx1e8096.R.inc(7266);position.setLongitude(buf.readInt() * 0.000001);
            
            // Time (946684800 - timestamp for 2000-01-01)
            __CLR4_5_25jc5jclx1e8096.R.inc(7267);position.setTime(new Date((946684800 + buf.readUnsignedInt()) * 1000));

            // Validity
            __CLR4_5_25jc5jclx1e8096.R.inc(7268);position.setValid(buf.readUnsignedByte() == 1);

            // Satellites
            __CLR4_5_25jc5jclx1e8096.R.inc(7269);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
            
            // GSM Signal
            __CLR4_5_25jc5jclx1e8096.R.inc(7270);position.set(Event.KEY_GSM, buf.readUnsignedByte());

            // Speed
            __CLR4_5_25jc5jclx1e8096.R.inc(7271);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            // Course
            __CLR4_5_25jc5jclx1e8096.R.inc(7272);position.setCourse(buf.readUnsignedShort());

            // HDOP
            __CLR4_5_25jc5jclx1e8096.R.inc(7273);position.set(Event.KEY_HDOP, buf.readUnsignedShort() * 0.1);

            // Altitude
            __CLR4_5_25jc5jclx1e8096.R.inc(7274);position.setAltitude(buf.readUnsignedShort());

            // Other
            __CLR4_5_25jc5jclx1e8096.R.inc(7275);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            __CLR4_5_25jc5jclx1e8096.R.inc(7276);position.set("runtime", buf.readUnsignedInt());
            __CLR4_5_25jc5jclx1e8096.R.inc(7277);position.set(Event.KEY_CELL,
                    buf.readUnsignedShort() + "|" + buf.readUnsignedShort() + "|" +
                    buf.readUnsignedShort() + "|" + buf.readUnsignedShort());
            __CLR4_5_25jc5jclx1e8096.R.inc(7278);position.set(Event.KEY_STATUS, buf.readUnsignedShort());
        
            // ADC
            __CLR4_5_25jc5jclx1e8096.R.inc(7279);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_25jc5jclx1e8096.R.inc(7280);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.01);
            __CLR4_5_25jc5jclx1e8096.R.inc(7281);position.set(Event.KEY_POWER, buf.readUnsignedShort());
            
            __CLR4_5_25jc5jclx1e8096.R.inc(7282);buf.readUnsignedInt(); // geo-fence
            __CLR4_5_25jc5jclx1e8096.R.inc(7283);positions.add(position);
        }
        
        // Delete recorded data
        }__CLR4_5_25jc5jclx1e8096.R.inc(7284);if ((((channel != null)&&(__CLR4_5_25jc5jclx1e8096.R.iget(7285)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7286)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7287);StringBuilder command = new StringBuilder("@@");
            __CLR4_5_25jc5jclx1e8096.R.inc(7288);command.append(flag).append(27 + positions.size() / 10).append(",");
            __CLR4_5_25jc5jclx1e8096.R.inc(7289);command.append(imei).append(",CCC,").append(positions.size()).append("*");
            __CLR4_5_25jc5jclx1e8096.R.inc(7290);int checksum = 0;
            __CLR4_5_25jc5jclx1e8096.R.inc(7291);for (int i = 0; (((i < command.length())&&(__CLR4_5_25jc5jclx1e8096.R.iget(7292)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7293)==0&false)); i += 1) {__CLR4_5_25jc5jclx1e8096.R.inc(7294);checksum += command.charAt(i);
            }__CLR4_5_25jc5jclx1e8096.R.inc(7295);command.append(String.format("%02x\r\n", checksum & 0xff).toUpperCase());
            __CLR4_5_25jc5jclx1e8096.R.inc(7296);channel.write(command.toString());
        }
        
        }__CLR4_5_25jc5jclx1e8096.R.inc(7297);return positions;
    }finally{__CLR4_5_25jc5jclx1e8096.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_25jc5jclx1e8096.R.inc(7298);
        
        __CLR4_5_25jc5jclx1e8096.R.inc(7299);ChannelBuffer buf = (ChannelBuffer) msg;
        
        // Find type
        __CLR4_5_25jc5jclx1e8096.R.inc(7300);Integer index = ChannelBufferTools.find(buf, 0, buf.readableBytes(), ",");
        __CLR4_5_25jc5jclx1e8096.R.inc(7301);index = ChannelBufferTools.find(buf, index + 1, buf.readableBytes(), ",");
        
        __CLR4_5_25jc5jclx1e8096.R.inc(7302);String type = buf.toString(index + 1, 3, Charset.defaultCharset());
        __CLR4_5_25jc5jclx1e8096.R.inc(7303);if ((((type.equals("CCC"))&&(__CLR4_5_25jc5jclx1e8096.R.iget(7304)!=0|true))||(__CLR4_5_25jc5jclx1e8096.R.iget(7305)==0&false))) {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7306);return decodeBinaryMessage(channel, buf);
        } }else {{
            __CLR4_5_25jc5jclx1e8096.R.inc(7307);return decodeRegularMessage(channel, buf);
        }
    }}finally{__CLR4_5_25jc5jclx1e8096.R.flushNeeded();}}

}
