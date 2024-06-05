/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class GlobalSatProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23js3jslx1dh3od{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,4798,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Default values
    private String format0 = "TSPRXAB27GHKLMnaicz*U!";
    private String format1 = "SARY*U!";

    public GlobalSatProtocolDecoder(GlobalSatProtocol protocol) {
        super(protocol);__CLR4_5_23js3jslx1dh3od.R.inc(4601);try{__CLR4_5_23js3jslx1dh3od.R.inc(4600);

        __CLR4_5_23js3jslx1dh3od.R.inc(4602);Properties properties = Context.getProps();
        __CLR4_5_23js3jslx1dh3od.R.inc(4603);if ((((properties != null)&&(__CLR4_5_23js3jslx1dh3od.R.iget(4604)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4605)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4606);if ((((properties.containsKey(protocol + ".format0"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4607)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4608)==0&false))) {{
                __CLR4_5_23js3jslx1dh3od.R.inc(4609);format0 = properties.getProperty(protocol + ".format0");
            }
            }__CLR4_5_23js3jslx1dh3od.R.inc(4610);if ((((properties.containsKey(protocol + ".format1"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4611)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4612)==0&false))) {{
                __CLR4_5_23js3jslx1dh3od.R.inc(4613);format1 = properties.getProperty(protocol + ".format1");
            }
        }}
    }}finally{__CLR4_5_23js3jslx1dh3od.R.flushNeeded();}}

    public void setFormat0(String format) {try{__CLR4_5_23js3jslx1dh3od.R.inc(4614);
        __CLR4_5_23js3jslx1dh3od.R.inc(4615);format0 = format;
    }finally{__CLR4_5_23js3jslx1dh3od.R.flushNeeded();}}

    public void setFormat1(String format) {try{__CLR4_5_23js3jslx1dh3od.R.inc(4616);
        __CLR4_5_23js3jslx1dh3od.R.inc(4617);format1 = format;
    }finally{__CLR4_5_23js3jslx1dh3od.R.flushNeeded();}}

    private Position decodeOriginal(Channel channel, String sentence) {try{__CLR4_5_23js3jslx1dh3od.R.inc(4618);

        // Send acknowledgement
        __CLR4_5_23js3jslx1dh3od.R.inc(4619);if ((((channel != null)&&(__CLR4_5_23js3jslx1dh3od.R.iget(4620)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4621)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4622);channel.write("ACK\r");
        }

        // Message type
        }__CLR4_5_23js3jslx1dh3od.R.inc(4623);String format;
        __CLR4_5_23js3jslx1dh3od.R.inc(4624);if ((((sentence.startsWith("GSr"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4625)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4626)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4627);format = format0;
        } }else {__CLR4_5_23js3jslx1dh3od.R.inc(4628);if ((((sentence.startsWith("GSh"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4629)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4630)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4631);format = format1;
        } }else {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4632);return null;
        }

        // Check that message contains required parameters
        }}__CLR4_5_23js3jslx1dh3od.R.inc(4633);if ((((!format.contains("B") || !format.contains("S") ||
            !(format.contains("1") || format.contains("2") || format.contains("3")) ||
            !(format.contains("6") || format.contains("7") || format.contains("8")))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4634)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4635)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4636);return null;
        }

        // Tokenise
        }__CLR4_5_23js3jslx1dh3od.R.inc(4637);if ((((format.contains("*"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4638)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4639)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4640);format = format.substring(0, format.indexOf('*'));
            __CLR4_5_23js3jslx1dh3od.R.inc(4641);sentence = sentence.substring(0, sentence.indexOf('*'));
        }
        }__CLR4_5_23js3jslx1dh3od.R.inc(4642);String[] values = sentence.split(",");

        // Parse data
        __CLR4_5_23js3jslx1dh3od.R.inc(4643);Position position = new Position();
        __CLR4_5_23js3jslx1dh3od.R.inc(4644);position.setProtocol(getProtocolName());

        __CLR4_5_23js3jslx1dh3od.R.inc(4645);for (int formatIndex = 0, valueIndex = 1; (((formatIndex < format.length() && valueIndex < values.length)&&(__CLR4_5_23js3jslx1dh3od.R.iget(4646)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4647)==0&false)); formatIndex++) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4648);String value = values[valueIndex];

            boolean __CLB4_5_2_bool0=false;__CLR4_5_23js3jslx1dh3od.R.inc(4649);switch(format.charAt(formatIndex)) {
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4650);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4651);if ((((!identify(value, channel))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4652)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4653)==0&false))) {{
                        __CLR4_5_23js3jslx1dh3od.R.inc(4654);return null;
                    }
                    }__CLR4_5_23js3jslx1dh3od.R.inc(4655);position.setDeviceId(getDeviceId());
                    __CLR4_5_23js3jslx1dh3od.R.inc(4656);break;
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4657);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4658);if ((((value.isEmpty())&&(__CLR4_5_23js3jslx1dh3od.R.iget(4659)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4660)==0&false))) {{
                        __CLR4_5_23js3jslx1dh3od.R.inc(4661);position.setValid(false);
                    } }else {{
                        __CLR4_5_23js3jslx1dh3od.R.inc(4662);position.setValid(Integer.valueOf(value) != 1);
                    }
                    }__CLR4_5_23js3jslx1dh3od.R.inc(4663);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4664);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4665);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4666);time.clear();
                    __CLR4_5_23js3jslx1dh3od.R.inc(4667);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(value.substring(0, 2)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4668);time.set(Calendar.MONTH, Integer.valueOf(value.substring(2, 4)) - 1);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4669);time.set(Calendar.YEAR, 2000 + Integer.valueOf(value.substring(4)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4670);value = values[++valueIndex];
                    __CLR4_5_23js3jslx1dh3od.R.inc(4671);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(value.substring(0, 2)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4672);time.set(Calendar.MINUTE, Integer.valueOf(value.substring(2, 4)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4673);time.set(Calendar.SECOND, Integer.valueOf(value.substring(4)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4674);position.setTime(time.getTime());
                    __CLR4_5_23js3jslx1dh3od.R.inc(4675);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4676);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4677);valueIndex += 1;
                    __CLR4_5_23js3jslx1dh3od.R.inc(4678);break;
                case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4679);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4680);double longitude = Double.valueOf(value.substring(1));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4681);if ((((value.charAt(0) == 'W')&&(__CLR4_5_23js3jslx1dh3od.R.iget(4682)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4683)==0&false))) {__CLR4_5_23js3jslx1dh3od.R.inc(4684);longitude = -longitude;
                    }__CLR4_5_23js3jslx1dh3od.R.inc(4685);position.setLongitude(longitude);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4686);break;
                case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4687);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4688);longitude = Double.valueOf(value.substring(4)) / 60;
                    __CLR4_5_23js3jslx1dh3od.R.inc(4689);longitude += Integer.valueOf(value.substring(1, 4));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4690);if ((((value.charAt(0) == 'W')&&(__CLR4_5_23js3jslx1dh3od.R.iget(4691)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4692)==0&false))) {__CLR4_5_23js3jslx1dh3od.R.inc(4693);longitude = -longitude;
                    }__CLR4_5_23js3jslx1dh3od.R.inc(4694);position.setLongitude(longitude);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4695);break;
                case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4696);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4697);position.setLongitude(Double.valueOf(value) * 0.000001);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4698);break;
                case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4699);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4700);double latitude = Double.valueOf(value.substring(1));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4701);if ((((value.charAt(0) == 'S')&&(__CLR4_5_23js3jslx1dh3od.R.iget(4702)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4703)==0&false))) {__CLR4_5_23js3jslx1dh3od.R.inc(4704);latitude = -latitude;
                    }__CLR4_5_23js3jslx1dh3od.R.inc(4705);position.setLatitude(latitude);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4706);break;
                case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4707);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4708);latitude = Double.valueOf(value.substring(3)) / 60;
                    __CLR4_5_23js3jslx1dh3od.R.inc(4709);latitude += Integer.valueOf(value.substring(1, 3));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4710);if ((((value.charAt(0) == 'S')&&(__CLR4_5_23js3jslx1dh3od.R.iget(4711)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4712)==0&false))) {__CLR4_5_23js3jslx1dh3od.R.inc(4713);latitude = -latitude;
                    }__CLR4_5_23js3jslx1dh3od.R.inc(4714);position.setLatitude(latitude);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4715);break;
                case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4716);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4717);position.setLatitude(Double.valueOf(value) * 0.000001);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4718);break;
                case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4719);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4720);position.setAltitude(Double.valueOf(value));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4721);break;
                case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4722);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4723);position.setSpeed(Double.valueOf(value));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4724);break;
                case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4725);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4726);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(value)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4727);break;
                case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4728);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4729);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(value)));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4730);break;
                case 'K':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4731);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4732);position.setCourse(Double.valueOf(value));
                    __CLR4_5_23js3jslx1dh3od.R.inc(4733);break;
                case 'N':if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4734);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23js3jslx1dh3od.R.inc(4735);position.set(Event.KEY_BATTERY, value);
                    __CLR4_5_23js3jslx1dh3od.R.inc(4736);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_23js3jslx1dh3od.R.inc(4737);__CLB4_5_2_bool0=true;}
                    // Unsupported
                    __CLR4_5_23js3jslx1dh3od.R.inc(4738);break;
            }

            __CLR4_5_23js3jslx1dh3od.R.inc(4739);valueIndex += 1;
        }
        }__CLR4_5_23js3jslx1dh3od.R.inc(4740);return position;
    }finally{__CLR4_5_23js3jslx1dh3od.R.flushNeeded();}}
    
    private static final Pattern pattern = Pattern.compile(
            "\\$" +
            "(\\d+)," +                    // IMEI
            "\\d+," +                      // mode
            "(\\d)," +                     // Fix
            "(\\d{2})(\\d{2})(\\d{2})," +  // Date (DDMMYY)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "([EW])" +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([NS])" +
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "(\\d+\\.?\\d*)," +            // Altitude
            "(\\d+\\.?\\d*)," +            // Speed
            "(\\d+\\.?\\d*)," +            // Course
            "(\\d+)," +                    // Satellites
            "(\\d+\\.?\\d*)");             // HDOP
    
    private Position decodeAlternative(Channel channel, String sentence) {try{__CLR4_5_23js3jslx1dh3od.R.inc(4741);

        // Parse message
        __CLR4_5_23js3jslx1dh3od.R.inc(4742);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_23js3jslx1dh3od.R.inc(4743);if ((((!parser.matches())&&(__CLR4_5_23js3jslx1dh3od.R.iget(4744)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4745)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4746);return null;
        }

        // Create new position
        }__CLR4_5_23js3jslx1dh3od.R.inc(4747);Position position = new Position();
        __CLR4_5_23js3jslx1dh3od.R.inc(4748);position.setProtocol(getProtocolName());
        __CLR4_5_23js3jslx1dh3od.R.inc(4749);Integer index = 1;

        // Identification
        __CLR4_5_23js3jslx1dh3od.R.inc(4750);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4751)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4752)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4753);return null;
        }
        }__CLR4_5_23js3jslx1dh3od.R.inc(4754);position.setDeviceId(getDeviceId());

        // Validity
        __CLR4_5_23js3jslx1dh3od.R.inc(4755);position.setValid(parser.group(index++).compareTo("1") != 0);
        
        // Time
        __CLR4_5_23js3jslx1dh3od.R.inc(4756);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23js3jslx1dh3od.R.inc(4757);time.clear();
        __CLR4_5_23js3jslx1dh3od.R.inc(4758);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23js3jslx1dh3od.R.inc(4759);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23js3jslx1dh3od.R.inc(4760);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_23js3jslx1dh3od.R.inc(4761);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23js3jslx1dh3od.R.inc(4762);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23js3jslx1dh3od.R.inc(4763);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23js3jslx1dh3od.R.inc(4764);position.setTime(time.getTime());

        // Longitude
        __CLR4_5_23js3jslx1dh3od.R.inc(4765);String hemisphere = parser.group(index++);
        __CLR4_5_23js3jslx1dh3od.R.inc(4766);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23js3jslx1dh3od.R.inc(4767);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23js3jslx1dh3od.R.inc(4768);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_23js3jslx1dh3od.R.iget(4769)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4770)==0&false))) {__CLR4_5_23js3jslx1dh3od.R.inc(4771);longitude = -longitude;
        }__CLR4_5_23js3jslx1dh3od.R.inc(4772);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_23js3jslx1dh3od.R.inc(4773);hemisphere = parser.group(index++);
        __CLR4_5_23js3jslx1dh3od.R.inc(4774);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23js3jslx1dh3od.R.inc(4775);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23js3jslx1dh3od.R.inc(4776);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_23js3jslx1dh3od.R.iget(4777)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4778)==0&false))) {__CLR4_5_23js3jslx1dh3od.R.inc(4779);latitude = -latitude;
        }__CLR4_5_23js3jslx1dh3od.R.inc(4780);position.setLatitude(latitude);

        // Altitude
        __CLR4_5_23js3jslx1dh3od.R.inc(4781);position.setAltitude(Double.valueOf(parser.group(index++)));

        // Speed
        __CLR4_5_23js3jslx1dh3od.R.inc(4782);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_23js3jslx1dh3od.R.inc(4783);position.setCourse(Double.valueOf(parser.group(index++)));

        // Satellites
        __CLR4_5_23js3jslx1dh3od.R.inc(4784);position.set(Event.KEY_SATELLITES, Integer.valueOf(parser.group(index++)));

        // HDOP
        __CLR4_5_23js3jslx1dh3od.R.inc(4785);position.set(Event.KEY_HDOP, parser.group(index++));
        __CLR4_5_23js3jslx1dh3od.R.inc(4786);return position;
    }finally{__CLR4_5_23js3jslx1dh3od.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_23js3jslx1dh3od.R.inc(4787);

        __CLR4_5_23js3jslx1dh3od.R.inc(4788);String sentence = (String) msg;
        
        __CLR4_5_23js3jslx1dh3od.R.inc(4789);if ((((sentence.startsWith("GS"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4790)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4791)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4792);return decodeOriginal(channel, sentence);
        } }else {__CLR4_5_23js3jslx1dh3od.R.inc(4793);if ((((sentence.startsWith("$"))&&(__CLR4_5_23js3jslx1dh3od.R.iget(4794)!=0|true))||(__CLR4_5_23js3jslx1dh3od.R.iget(4795)==0&false))) {{
            __CLR4_5_23js3jslx1dh3od.R.inc(4796);return decodeAlternative(channel, sentence);
        }
        
        }}__CLR4_5_23js3jslx1dh3od.R.inc(4797);return null;
    }finally{__CLR4_5_23js3jslx1dh3od.R.flushNeeded();}}

}
