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
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeitrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2532532lx1dp81i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,6722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeitrackProtocolDecoder(MeitrackProtocol protocol) {
        super(protocol);__CLR4_5_2532532lx1dp81i.R.inc(6591);try{__CLR4_5_2532532lx1dp81i.R.inc(6590);
    }finally{__CLR4_5_2532532lx1dp81i.R.flushNeeded();}}

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

    private Position decodeRegularMessage(Channel channel, ChannelBuffer buf) {try{__CLR4_5_2532532lx1dp81i.R.inc(6592);

        // Parse message
        __CLR4_5_2532532lx1dp81i.R.inc(6593);String sentence = buf.toString(Charset.defaultCharset());
        __CLR4_5_2532532lx1dp81i.R.inc(6594);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_2532532lx1dp81i.R.inc(6595);if ((((!parser.matches())&&(__CLR4_5_2532532lx1dp81i.R.iget(6596)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6597)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6598);return null;
        }

        // Create new position
        }__CLR4_5_2532532lx1dp81i.R.inc(6599);Position position = new Position();
        __CLR4_5_2532532lx1dp81i.R.inc(6600);position.setProtocol(getProtocolName());

        __CLR4_5_2532532lx1dp81i.R.inc(6601);Integer index = 1;

        // Identification
        __CLR4_5_2532532lx1dp81i.R.inc(6602);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_2532532lx1dp81i.R.iget(6603)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6604)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6605);return null;
        }
        }__CLR4_5_2532532lx1dp81i.R.inc(6606);position.setDeviceId(getDeviceId());

        // Event
        __CLR4_5_2532532lx1dp81i.R.inc(6607);int event = Integer.valueOf(parser.group(index++));
        __CLR4_5_2532532lx1dp81i.R.inc(6608);position.set(Event.KEY_EVENT, event);

        // Coordinates
        __CLR4_5_2532532lx1dp81i.R.inc(6609);position.setLatitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_2532532lx1dp81i.R.inc(6610);position.setLongitude(Double.valueOf(parser.group(index++)));

        // Time
        __CLR4_5_2532532lx1dp81i.R.inc(6611);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2532532lx1dp81i.R.inc(6612);time.clear();
        __CLR4_5_2532532lx1dp81i.R.inc(6613);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2532532lx1dp81i.R.inc(6614);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2532532lx1dp81i.R.inc(6615);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2532532lx1dp81i.R.inc(6616);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2532532lx1dp81i.R.inc(6617);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2532532lx1dp81i.R.inc(6618);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2532532lx1dp81i.R.inc(6619);position.setTime(time.getTime());

        // Validity
        __CLR4_5_2532532lx1dp81i.R.inc(6620);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Satellites
        __CLR4_5_2532532lx1dp81i.R.inc(6621);position.set(Event.KEY_SATELLITES, parser.group(index++));

        // GSM Signal
        __CLR4_5_2532532lx1dp81i.R.inc(6622);position.set(Event.KEY_GSM, parser.group(index++));

        // Speed
        __CLR4_5_2532532lx1dp81i.R.inc(6623);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(parser.group(index++))));

        // Course
        __CLR4_5_2532532lx1dp81i.R.inc(6624);position.setCourse(Double.valueOf(parser.group(index++)));

        // HDOP
        __CLR4_5_2532532lx1dp81i.R.inc(6625);position.set(Event.KEY_HDOP, parser.group(index++));

        // Altitude
        __CLR4_5_2532532lx1dp81i.R.inc(6626);position.setAltitude(Double.valueOf(parser.group(index++)));

        // Other
        __CLR4_5_2532532lx1dp81i.R.inc(6627);position.set(Event.KEY_ODOMETER, parser.group(index++));
        __CLR4_5_2532532lx1dp81i.R.inc(6628);position.set("runtime", parser.group(index++));
        __CLR4_5_2532532lx1dp81i.R.inc(6629);position.set(Event.KEY_CELL, parser.group(index++));
        __CLR4_5_2532532lx1dp81i.R.inc(6630);position.set(Event.KEY_STATUS, parser.group(index++));
        
        // ADC
        __CLR4_5_2532532lx1dp81i.R.inc(6631);String adc1 = parser.group(index++);
        __CLR4_5_2532532lx1dp81i.R.inc(6632);if ((((adc1 != null)&&(__CLR4_5_2532532lx1dp81i.R.iget(6633)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6634)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6635);position.set(Event.PREFIX_ADC + 1, Integer.parseInt(adc1, 16));
        }
        }__CLR4_5_2532532lx1dp81i.R.inc(6636);String adc2 = parser.group(index++);
        __CLR4_5_2532532lx1dp81i.R.inc(6637);if ((((adc2 != null)&&(__CLR4_5_2532532lx1dp81i.R.iget(6638)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6639)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6640);position.set(Event.PREFIX_ADC + 2, Integer.parseInt(adc2, 16));
        }
        }__CLR4_5_2532532lx1dp81i.R.inc(6641);String adc3 = parser.group(index++);
        __CLR4_5_2532532lx1dp81i.R.inc(6642);if ((((adc3 != null)&&(__CLR4_5_2532532lx1dp81i.R.iget(6643)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6644)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6645);position.set(Event.PREFIX_ADC + 3, Integer.parseInt(adc3, 16));
        }
        }__CLR4_5_2532532lx1dp81i.R.inc(6646);position.set(Event.KEY_BATTERY, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_2532532lx1dp81i.R.inc(6647);position.set(Event.KEY_POWER, Integer.parseInt(parser.group(index++), 16));

        // Event specific
        __CLR4_5_2532532lx1dp81i.R.inc(6648);String data = parser.group(index++);
        __CLR4_5_2532532lx1dp81i.R.inc(6649);if ((((data != null && !data.isEmpty())&&(__CLR4_5_2532532lx1dp81i.R.iget(6650)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6651)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2532532lx1dp81i.R.inc(6652);switch (event) {
                case 37:if (!__CLB4_5_2_bool0) {__CLR4_5_2532532lx1dp81i.R.inc(6653);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2532532lx1dp81i.R.inc(6654);position.set(Event.KEY_RFID, data);
                    __CLR4_5_2532532lx1dp81i.R.inc(6655);break;
            }
        }

        // Fuel
        }__CLR4_5_2532532lx1dp81i.R.inc(6656);String fuel = parser.group(index++);
        __CLR4_5_2532532lx1dp81i.R.inc(6657);if ((((fuel != null)&&(__CLR4_5_2532532lx1dp81i.R.iget(6658)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6659)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6660);position.set(Event.KEY_FUEL,
                    Integer.parseInt(fuel.substring(0, 2), 16) + Integer.parseInt(fuel.substring(2), 16) * 0.01);
        }

        }__CLR4_5_2532532lx1dp81i.R.inc(6661);return position;
    }finally{__CLR4_5_2532532lx1dp81i.R.flushNeeded();}}

    private List<Position> decodeBinaryMessage(Channel channel, ChannelBuffer buf) {try{__CLR4_5_2532532lx1dp81i.R.inc(6662);
        __CLR4_5_2532532lx1dp81i.R.inc(6663);List<Position> positions = new LinkedList<Position>();
        
        __CLR4_5_2532532lx1dp81i.R.inc(6664);String flag = buf.toString(2, 1, Charset.defaultCharset());
        __CLR4_5_2532532lx1dp81i.R.inc(6665);int index = ChannelBufferTools.find(buf, 0, buf.readableBytes(), ",");
        
        // Identification
        __CLR4_5_2532532lx1dp81i.R.inc(6666);String imei = buf.toString(index + 1, 15, Charset.defaultCharset());
        __CLR4_5_2532532lx1dp81i.R.inc(6667);if ((((!identify(imei, channel))&&(__CLR4_5_2532532lx1dp81i.R.iget(6668)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6669)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6670);return null;
        }

        }__CLR4_5_2532532lx1dp81i.R.inc(6671);buf.skipBytes(index + 1 + 15 + 1 + 3 + 1 + 2 + 2 + 4);
        
        __CLR4_5_2532532lx1dp81i.R.inc(6672);while ((((buf.readableBytes() >= 0x34)&&(__CLR4_5_2532532lx1dp81i.R.iget(6673)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6674)==0&false))) {{
            
            __CLR4_5_2532532lx1dp81i.R.inc(6675);Position position = new Position();
            __CLR4_5_2532532lx1dp81i.R.inc(6676);position.setProtocol(getProtocolName());
            __CLR4_5_2532532lx1dp81i.R.inc(6677);position.setDeviceId(getDeviceId());
            
            // Event
            __CLR4_5_2532532lx1dp81i.R.inc(6678);position.set(Event.KEY_EVENT, buf.readUnsignedByte());
            
            // Location
            __CLR4_5_2532532lx1dp81i.R.inc(6679);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_2532532lx1dp81i.R.inc(6680);position.setLongitude(buf.readInt() * 0.000001);
            
            // Time (946684800 - timestamp for 2000-01-01)
            __CLR4_5_2532532lx1dp81i.R.inc(6681);position.setTime(new Date((946684800 + buf.readUnsignedInt()) * 1000));

            // Validity
            __CLR4_5_2532532lx1dp81i.R.inc(6682);position.setValid(buf.readUnsignedByte() == 1);

            // Satellites
            __CLR4_5_2532532lx1dp81i.R.inc(6683);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
            
            // GSM Signal
            __CLR4_5_2532532lx1dp81i.R.inc(6684);position.set(Event.KEY_GSM, buf.readUnsignedByte());

            // Speed
            __CLR4_5_2532532lx1dp81i.R.inc(6685);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            // Course
            __CLR4_5_2532532lx1dp81i.R.inc(6686);position.setCourse(buf.readUnsignedShort());

            // HDOP
            __CLR4_5_2532532lx1dp81i.R.inc(6687);position.set(Event.KEY_HDOP, buf.readUnsignedShort() * 0.1);

            // Altitude
            __CLR4_5_2532532lx1dp81i.R.inc(6688);position.setAltitude(buf.readUnsignedShort());

            // Other
            __CLR4_5_2532532lx1dp81i.R.inc(6689);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            __CLR4_5_2532532lx1dp81i.R.inc(6690);position.set("runtime", buf.readUnsignedInt());
            __CLR4_5_2532532lx1dp81i.R.inc(6691);position.set(Event.KEY_CELL,
                    buf.readUnsignedShort() + "|" + buf.readUnsignedShort() + "|" +
                    buf.readUnsignedShort() + "|" + buf.readUnsignedShort());
            __CLR4_5_2532532lx1dp81i.R.inc(6692);position.set(Event.KEY_STATUS, buf.readUnsignedShort());
        
            // ADC
            __CLR4_5_2532532lx1dp81i.R.inc(6693);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2532532lx1dp81i.R.inc(6694);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.01);
            __CLR4_5_2532532lx1dp81i.R.inc(6695);position.set(Event.KEY_POWER, buf.readUnsignedShort());
            
            __CLR4_5_2532532lx1dp81i.R.inc(6696);buf.readUnsignedInt(); // geo-fence
            __CLR4_5_2532532lx1dp81i.R.inc(6697);positions.add(position);
        }
        
        // Delete recorded data
        }__CLR4_5_2532532lx1dp81i.R.inc(6698);if ((((channel != null)&&(__CLR4_5_2532532lx1dp81i.R.iget(6699)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6700)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6701);StringBuilder command = new StringBuilder("@@");
            __CLR4_5_2532532lx1dp81i.R.inc(6702);command.append(flag).append(27 + positions.size() / 10).append(",");
            __CLR4_5_2532532lx1dp81i.R.inc(6703);command.append(imei).append(",CCC,").append(positions.size()).append("*");
            __CLR4_5_2532532lx1dp81i.R.inc(6704);int checksum = 0;
            __CLR4_5_2532532lx1dp81i.R.inc(6705);for (int i = 0; (((i < command.length())&&(__CLR4_5_2532532lx1dp81i.R.iget(6706)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6707)==0&false)); i += 1) {__CLR4_5_2532532lx1dp81i.R.inc(6708);checksum += command.charAt(i);
            }__CLR4_5_2532532lx1dp81i.R.inc(6709);command.append(String.format("%02x\r\n", checksum & 0xff).toUpperCase());
            __CLR4_5_2532532lx1dp81i.R.inc(6710);channel.write(command.toString());
        }
        
        }__CLR4_5_2532532lx1dp81i.R.inc(6711);return positions;
    }finally{__CLR4_5_2532532lx1dp81i.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2532532lx1dp81i.R.inc(6712);
        
        __CLR4_5_2532532lx1dp81i.R.inc(6713);ChannelBuffer buf = (ChannelBuffer) msg;
        
        // Find type
        __CLR4_5_2532532lx1dp81i.R.inc(6714);Integer index = ChannelBufferTools.find(buf, 0, buf.readableBytes(), ",");
        __CLR4_5_2532532lx1dp81i.R.inc(6715);index = ChannelBufferTools.find(buf, index + 1, buf.readableBytes(), ",");
        
        __CLR4_5_2532532lx1dp81i.R.inc(6716);String type = buf.toString(index + 1, 3, Charset.defaultCharset());
        __CLR4_5_2532532lx1dp81i.R.inc(6717);if ((((type.equals("CCC"))&&(__CLR4_5_2532532lx1dp81i.R.iget(6718)!=0|true))||(__CLR4_5_2532532lx1dp81i.R.iget(6719)==0&false))) {{
            __CLR4_5_2532532lx1dp81i.R.inc(6720);return decodeBinaryMessage(channel, buf);
        } }else {{
            __CLR4_5_2532532lx1dp81i.R.inc(6721);return decodeRegularMessage(channel, buf);
        }
    }}finally{__CLR4_5_2532532lx1dp81i.R.flushNeeded();}}

}
