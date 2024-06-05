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

import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class GlobalSatProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23rm3rmlx1e7zhw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,5070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String format0;
    private String format1;

    public GlobalSatProtocolDecoder(GlobalSatProtocol protocol) {
        super(protocol);__CLR4_5_23rm3rmlx1e7zhw.R.inc(4883);try{__CLR4_5_23rm3rmlx1e7zhw.R.inc(4882);
        
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4884);format0 = Context.getConfig().getString(getProtocolName() + ".format0", "TSPRXAB27GHKLMnaicz*U!");
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4885);format1 = Context.getConfig().getString(getProtocolName() + ".format1", "SARY*U!");
    }finally{__CLR4_5_23rm3rmlx1e7zhw.R.flushNeeded();}}

    public void setFormat0(String format) {try{__CLR4_5_23rm3rmlx1e7zhw.R.inc(4886);
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4887);format0 = format;
    }finally{__CLR4_5_23rm3rmlx1e7zhw.R.flushNeeded();}}

    public void setFormat1(String format) {try{__CLR4_5_23rm3rmlx1e7zhw.R.inc(4888);
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4889);format1 = format;
    }finally{__CLR4_5_23rm3rmlx1e7zhw.R.flushNeeded();}}

    private Position decodeOriginal(Channel channel, String sentence) {try{__CLR4_5_23rm3rmlx1e7zhw.R.inc(4890);

        // Send acknowledgement
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4891);if ((((channel != null)&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4892)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4893)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4894);channel.write("ACK\r");
        }

        // Message type
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4895);String format;
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4896);if ((((sentence.startsWith("GSr"))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4897)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4898)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4899);format = format0;
        } }else {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4900);if ((((sentence.startsWith("GSh"))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4901)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4902)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4903);format = format1;
        } }else {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4904);return null;
        }

        // Check that message contains required parameters
        }}__CLR4_5_23rm3rmlx1e7zhw.R.inc(4905);if ((((!format.contains("B") || !format.contains("S") ||
            !(format.contains("1") || format.contains("2") || format.contains("3")) ||
            !(format.contains("6") || format.contains("7") || format.contains("8")))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4906)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4907)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4908);return null;
        }

        // Tokenise
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4909);if ((((format.contains("*"))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4910)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4911)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4912);format = format.substring(0, format.indexOf('*'));
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4913);sentence = sentence.substring(0, sentence.indexOf('*'));
        }
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4914);String[] values = sentence.split(",");

        // Parse data
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4915);Position position = new Position();
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4916);position.setProtocol(getProtocolName());

        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4917);for (int formatIndex = 0, valueIndex = 1; (((formatIndex < format.length() && valueIndex < values.length)&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4918)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4919)==0&false)); formatIndex++) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(4920);String value = values[valueIndex];

            boolean __CLB4_5_2_bool0=false;__CLR4_5_23rm3rmlx1e7zhw.R.inc(4921);switch(format.charAt(formatIndex)) {
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4922);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4923);if ((((!identify(value, channel))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4924)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4925)==0&false))) {{
                        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4926);return null;
                    }
                    }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4927);position.setDeviceId(getDeviceId());
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4928);break;
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4929);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4930);if ((((value.isEmpty())&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4931)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4932)==0&false))) {{
                        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4933);position.setValid(false);
                    } }else {{
                        __CLR4_5_23rm3rmlx1e7zhw.R.inc(4934);position.setValid(Integer.valueOf(value) != 1);
                    }
                    }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4935);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4936);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4937);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4938);time.clear();
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4939);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(value.substring(0, 2)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4940);time.set(Calendar.MONTH, Integer.valueOf(value.substring(2, 4)) - 1);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4941);time.set(Calendar.YEAR, 2000 + Integer.valueOf(value.substring(4)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4942);value = values[++valueIndex];
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4943);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(value.substring(0, 2)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4944);time.set(Calendar.MINUTE, Integer.valueOf(value.substring(2, 4)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4945);time.set(Calendar.SECOND, Integer.valueOf(value.substring(4)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4946);position.setTime(time.getTime());
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4947);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4948);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4949);valueIndex += 1;
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4950);break;
                case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4951);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4952);double longitude = Double.valueOf(value.substring(1));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4953);if ((((value.charAt(0) == 'W')&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4954)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4955)==0&false))) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4956);longitude = -longitude;
                    }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4957);position.setLongitude(longitude);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4958);break;
                case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4959);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4960);longitude = Double.valueOf(value.substring(4)) / 60;
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4961);longitude += Integer.valueOf(value.substring(1, 4));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4962);if ((((value.charAt(0) == 'W')&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4963)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4964)==0&false))) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4965);longitude = -longitude;
                    }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4966);position.setLongitude(longitude);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4967);break;
                case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4968);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4969);position.setLongitude(Double.valueOf(value) * 0.000001);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4970);break;
                case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4971);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4972);double latitude = Double.valueOf(value.substring(1));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4973);if ((((value.charAt(0) == 'S')&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4974)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4975)==0&false))) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4976);latitude = -latitude;
                    }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4977);position.setLatitude(latitude);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4978);break;
                case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4979);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4980);latitude = Double.valueOf(value.substring(3)) / 60;
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4981);latitude += Integer.valueOf(value.substring(1, 3));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4982);if ((((value.charAt(0) == 'S')&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4983)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(4984)==0&false))) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4985);latitude = -latitude;
                    }__CLR4_5_23rm3rmlx1e7zhw.R.inc(4986);position.setLatitude(latitude);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4987);break;
                case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4988);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4989);position.setLatitude(Double.valueOf(value) * 0.000001);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4990);break;
                case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4991);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4992);position.setAltitude(Double.valueOf(value));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4993);break;
                case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4994);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4995);position.setSpeed(Double.valueOf(value));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4996);break;
                case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(4997);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4998);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(value)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(4999);break;
                case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5000);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5001);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(value)));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5002);break;
                case 'K':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5003);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5004);position.setCourse(Double.valueOf(value));
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5005);break;
                case 'N':if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5006);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5007);position.set(Event.KEY_BATTERY, value);
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5008);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5009);__CLB4_5_2_bool0=true;}
                    // Unsupported
                    __CLR4_5_23rm3rmlx1e7zhw.R.inc(5010);break;
            }

            __CLR4_5_23rm3rmlx1e7zhw.R.inc(5011);valueIndex += 1;
        }
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(5012);return position;
    }finally{__CLR4_5_23rm3rmlx1e7zhw.R.flushNeeded();}}
    
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
    
    private Position decodeAlternative(Channel channel, String sentence) {try{__CLR4_5_23rm3rmlx1e7zhw.R.inc(5013);

        // Parse message
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5014);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5015);if ((((!parser.matches())&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5016)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5017)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(5018);return null;
        }

        // Create new position
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(5019);Position position = new Position();
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5020);position.setProtocol(getProtocolName());
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5021);Integer index = 1;

        // Identification
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5022);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5023)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5024)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(5025);return null;
        }
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(5026);position.setDeviceId(getDeviceId());

        // Validity
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5027);position.setValid(parser.group(index++).compareTo("1") != 0);
        
        // Time
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5028);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5029);time.clear();
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5030);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5031);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5032);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5033);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5034);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5035);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5036);position.setTime(time.getTime());

        // Longitude
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5037);String hemisphere = parser.group(index++);
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5038);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5039);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5040);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5041)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5042)==0&false))) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5043);longitude = -longitude;
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(5044);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5045);hemisphere = parser.group(index++);
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5046);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5047);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5048);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5049)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5050)==0&false))) {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5051);latitude = -latitude;
        }__CLR4_5_23rm3rmlx1e7zhw.R.inc(5052);position.setLatitude(latitude);

        // Altitude
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5053);position.setAltitude(Double.valueOf(parser.group(index++)));

        // Speed
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5054);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5055);position.setCourse(Double.valueOf(parser.group(index++)));

        // Satellites
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5056);position.set(Event.KEY_SATELLITES, Integer.valueOf(parser.group(index++)));

        // HDOP
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5057);position.set(Event.KEY_HDOP, parser.group(index++));
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5058);return position;
    }finally{__CLR4_5_23rm3rmlx1e7zhw.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23rm3rmlx1e7zhw.R.inc(5059);

        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5060);String sentence = (String) msg;
        
        __CLR4_5_23rm3rmlx1e7zhw.R.inc(5061);if ((((sentence.startsWith("GS"))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5062)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5063)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(5064);return decodeOriginal(channel, sentence);
        } }else {__CLR4_5_23rm3rmlx1e7zhw.R.inc(5065);if ((((sentence.startsWith("$"))&&(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5066)!=0|true))||(__CLR4_5_23rm3rmlx1e7zhw.R.iget(5067)==0&false))) {{
            __CLR4_5_23rm3rmlx1e7zhw.R.inc(5068);return decodeAlternative(channel, sentence);
        }
        
        }}__CLR4_5_23rm3rmlx1e7zhw.R.inc(5069);return null;
    }finally{__CLR4_5_23rm3rmlx1e7zhw.R.flushNeeded();}}

}
