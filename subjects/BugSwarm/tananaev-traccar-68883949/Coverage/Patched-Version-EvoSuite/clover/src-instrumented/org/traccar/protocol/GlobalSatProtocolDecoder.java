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

@java.lang.SuppressWarnings({"fallthrough"}) public class GlobalSatProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23jt3jtlx1do9gy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,4799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Default values
    private String format0 = "TSPRXAB27GHKLMnaicz*U!";
    private String format1 = "SARY*U!";

    public GlobalSatProtocolDecoder(GlobalSatProtocol protocol) {
        super(protocol);__CLR4_5_23jt3jtlx1do9gy.R.inc(4602);try{__CLR4_5_23jt3jtlx1do9gy.R.inc(4601);

        __CLR4_5_23jt3jtlx1do9gy.R.inc(4603);Properties properties = Context.getProps();
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4604);if ((((properties != null)&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4605)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4606)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4607);if ((((properties.containsKey(protocol + ".format0"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4608)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4609)==0&false))) {{
                __CLR4_5_23jt3jtlx1do9gy.R.inc(4610);format0 = properties.getProperty(protocol + ".format0");
            }
            }__CLR4_5_23jt3jtlx1do9gy.R.inc(4611);if ((((properties.containsKey(protocol + ".format1"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4612)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4613)==0&false))) {{
                __CLR4_5_23jt3jtlx1do9gy.R.inc(4614);format1 = properties.getProperty(protocol + ".format1");
            }
        }}
    }}finally{__CLR4_5_23jt3jtlx1do9gy.R.flushNeeded();}}

    public void setFormat0(String format) {try{__CLR4_5_23jt3jtlx1do9gy.R.inc(4615);
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4616);format0 = format;
    }finally{__CLR4_5_23jt3jtlx1do9gy.R.flushNeeded();}}

    public void setFormat1(String format) {try{__CLR4_5_23jt3jtlx1do9gy.R.inc(4617);
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4618);format1 = format;
    }finally{__CLR4_5_23jt3jtlx1do9gy.R.flushNeeded();}}

    private Position decodeOriginal(Channel channel, String sentence) {try{__CLR4_5_23jt3jtlx1do9gy.R.inc(4619);

        // Send acknowledgement
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4620);if ((((channel != null)&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4621)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4622)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4623);channel.write("ACK\r");
        }

        // Message type
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4624);String format;
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4625);if ((((sentence.startsWith("GSr"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4626)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4627)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4628);format = format0;
        } }else {__CLR4_5_23jt3jtlx1do9gy.R.inc(4629);if ((((sentence.startsWith("GSh"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4630)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4631)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4632);format = format1;
        } }else {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4633);return null;
        }

        // Check that message contains required parameters
        }}__CLR4_5_23jt3jtlx1do9gy.R.inc(4634);if ((((!format.contains("B") || !format.contains("S") ||
            !(format.contains("1") || format.contains("2") || format.contains("3")) ||
            !(format.contains("6") || format.contains("7") || format.contains("8")))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4635)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4636)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4637);return null;
        }

        // Tokenise
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4638);if ((((format.contains("*"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4639)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4640)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4641);format = format.substring(0, format.indexOf('*'));
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4642);sentence = sentence.substring(0, sentence.indexOf('*'));
        }
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4643);String[] values = sentence.split(",");

        // Parse data
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4644);Position position = new Position();
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4645);position.setProtocol(getProtocolName());

        __CLR4_5_23jt3jtlx1do9gy.R.inc(4646);for (int formatIndex = 0, valueIndex = 1; (((formatIndex < format.length() && valueIndex < values.length)&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4647)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4648)==0&false)); formatIndex++) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4649);String value = values[valueIndex];

            boolean __CLB4_5_2_bool0=false;__CLR4_5_23jt3jtlx1do9gy.R.inc(4650);switch(format.charAt(formatIndex)) {
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4651);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4652);if ((((!identify(value, channel))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4653)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4654)==0&false))) {{
                        __CLR4_5_23jt3jtlx1do9gy.R.inc(4655);return null;
                    }
                    }__CLR4_5_23jt3jtlx1do9gy.R.inc(4656);position.setDeviceId(getDeviceId());
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4657);break;
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4658);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4659);if ((((value.isEmpty())&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4660)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4661)==0&false))) {{
                        __CLR4_5_23jt3jtlx1do9gy.R.inc(4662);position.setValid(false);
                    } }else {{
                        __CLR4_5_23jt3jtlx1do9gy.R.inc(4663);position.setValid(Integer.valueOf(value) != 1);
                    }
                    }__CLR4_5_23jt3jtlx1do9gy.R.inc(4664);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4665);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4666);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4667);time.clear();
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4668);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(value.substring(0, 2)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4669);time.set(Calendar.MONTH, Integer.valueOf(value.substring(2, 4)) - 1);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4670);time.set(Calendar.YEAR, 2000 + Integer.valueOf(value.substring(4)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4671);value = values[++valueIndex];
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4672);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(value.substring(0, 2)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4673);time.set(Calendar.MINUTE, Integer.valueOf(value.substring(2, 4)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4674);time.set(Calendar.SECOND, Integer.valueOf(value.substring(4)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4675);position.setTime(time.getTime());
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4676);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4677);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4678);valueIndex += 1;
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4679);break;
                case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4680);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4681);double longitude = Double.valueOf(value.substring(1));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4682);if ((((value.charAt(0) == 'W')&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4683)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4684)==0&false))) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4685);longitude = -longitude;
                    }__CLR4_5_23jt3jtlx1do9gy.R.inc(4686);position.setLongitude(longitude);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4687);break;
                case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4688);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4689);longitude = Double.valueOf(value.substring(4)) / 60;
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4690);longitude += Integer.valueOf(value.substring(1, 4));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4691);if ((((value.charAt(0) == 'W')&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4692)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4693)==0&false))) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4694);longitude = -longitude;
                    }__CLR4_5_23jt3jtlx1do9gy.R.inc(4695);position.setLongitude(longitude);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4696);break;
                case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4697);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4698);position.setLongitude(Double.valueOf(value) * 0.000001);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4699);break;
                case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4700);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4701);double latitude = Double.valueOf(value.substring(1));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4702);if ((((value.charAt(0) == 'S')&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4703)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4704)==0&false))) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4705);latitude = -latitude;
                    }__CLR4_5_23jt3jtlx1do9gy.R.inc(4706);position.setLatitude(latitude);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4707);break;
                case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4708);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4709);latitude = Double.valueOf(value.substring(3)) / 60;
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4710);latitude += Integer.valueOf(value.substring(1, 3));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4711);if ((((value.charAt(0) == 'S')&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4712)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4713)==0&false))) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4714);latitude = -latitude;
                    }__CLR4_5_23jt3jtlx1do9gy.R.inc(4715);position.setLatitude(latitude);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4716);break;
                case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4717);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4718);position.setLatitude(Double.valueOf(value) * 0.000001);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4719);break;
                case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4720);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4721);position.setAltitude(Double.valueOf(value));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4722);break;
                case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4723);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4724);position.setSpeed(Double.valueOf(value));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4725);break;
                case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4726);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4727);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(value)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4728);break;
                case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4729);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4730);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(value)));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4731);break;
                case 'K':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4732);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4733);position.setCourse(Double.valueOf(value));
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4734);break;
                case 'N':if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4735);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4736);position.set(Event.KEY_BATTERY, value);
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4737);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4738);__CLB4_5_2_bool0=true;}
                    // Unsupported
                    __CLR4_5_23jt3jtlx1do9gy.R.inc(4739);break;
            }

            __CLR4_5_23jt3jtlx1do9gy.R.inc(4740);valueIndex += 1;
        }
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4741);return position;
    }finally{__CLR4_5_23jt3jtlx1do9gy.R.flushNeeded();}}
    
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
    
    private Position decodeAlternative(Channel channel, String sentence) {try{__CLR4_5_23jt3jtlx1do9gy.R.inc(4742);

        // Parse message
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4743);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4744);if ((((!parser.matches())&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4745)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4746)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4747);return null;
        }

        // Create new position
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4748);Position position = new Position();
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4749);position.setProtocol(getProtocolName());
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4750);Integer index = 1;

        // Identification
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4751);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4752)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4753)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4754);return null;
        }
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4755);position.setDeviceId(getDeviceId());

        // Validity
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4756);position.setValid(parser.group(index++).compareTo("1") != 0);
        
        // Time
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4757);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4758);time.clear();
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4759);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4760);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4761);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4762);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4763);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4764);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4765);position.setTime(time.getTime());

        // Longitude
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4766);String hemisphere = parser.group(index++);
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4767);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4768);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4769);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4770)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4771)==0&false))) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4772);longitude = -longitude;
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4773);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4774);hemisphere = parser.group(index++);
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4775);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4776);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4777);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4778)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4779)==0&false))) {__CLR4_5_23jt3jtlx1do9gy.R.inc(4780);latitude = -latitude;
        }__CLR4_5_23jt3jtlx1do9gy.R.inc(4781);position.setLatitude(latitude);

        // Altitude
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4782);position.setAltitude(Double.valueOf(parser.group(index++)));

        // Speed
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4783);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4784);position.setCourse(Double.valueOf(parser.group(index++)));

        // Satellites
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4785);position.set(Event.KEY_SATELLITES, Integer.valueOf(parser.group(index++)));

        // HDOP
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4786);position.set(Event.KEY_HDOP, parser.group(index++));
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4787);return position;
    }finally{__CLR4_5_23jt3jtlx1do9gy.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_23jt3jtlx1do9gy.R.inc(4788);

        __CLR4_5_23jt3jtlx1do9gy.R.inc(4789);String sentence = (String) msg;
        
        __CLR4_5_23jt3jtlx1do9gy.R.inc(4790);if ((((sentence.startsWith("GS"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4791)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4792)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4793);return decodeOriginal(channel, sentence);
        } }else {__CLR4_5_23jt3jtlx1do9gy.R.inc(4794);if ((((sentence.startsWith("$"))&&(__CLR4_5_23jt3jtlx1do9gy.R.iget(4795)!=0|true))||(__CLR4_5_23jt3jtlx1do9gy.R.iget(4796)==0&false))) {{
            __CLR4_5_23jt3jtlx1do9gy.R.inc(4797);return decodeAlternative(channel, sentence);
        }
        
        }}__CLR4_5_23jt3jtlx1do9gy.R.inc(4798);return null;
    }finally{__CLR4_5_23jt3jtlx1do9gy.R.flushNeeded();}}

}
