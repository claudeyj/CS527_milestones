/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class SuntechProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2f5rf5rlwydyker{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,19755,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int protocolType;
    private boolean hbm;

    public SuntechProtocolDecoder(SuntechProtocol protocol) {
        super(protocol);__CLR4_5_2f5rf5rlwydyker.R.inc(19648);try{__CLR4_5_2f5rf5rlwydyker.R.inc(19647);

        __CLR4_5_2f5rf5rlwydyker.R.inc(19649);protocolType = Context.getConfig().getInteger(getProtocolName() + ".protocolType");
        __CLR4_5_2f5rf5rlwydyker.R.inc(19650);hbm = Context.getConfig().getBoolean(getProtocolName() + ".hbm");
    }finally{__CLR4_5_2f5rf5rlwydyker.R.flushNeeded();}}

    public void setProtocolType(int protocolType) {try{__CLR4_5_2f5rf5rlwydyker.R.inc(19651);
        __CLR4_5_2f5rf5rlwydyker.R.inc(19652);this.protocolType = protocolType;
    }finally{__CLR4_5_2f5rf5rlwydyker.R.flushNeeded();}}

    private Position decode9(
            Channel channel, SocketAddress remoteAddress, String[] values) throws ParseException {try{__CLR4_5_2f5rf5rlwydyker.R.inc(19653);
        __CLR4_5_2f5rf5rlwydyker.R.inc(19654);int index = 1;

        __CLR4_5_2f5rf5rlwydyker.R.inc(19655);String type = values[index++];

        __CLR4_5_2f5rf5rlwydyker.R.inc(19656);if ((((!type.equals("Location") && !type.equals("Emergency") && !type.equals("Alert"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19657)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19658)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19659);return null;
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19660);Position position = new Position();
        __CLR4_5_2f5rf5rlwydyker.R.inc(19661);position.setProtocol(getProtocolName());

        __CLR4_5_2f5rf5rlwydyker.R.inc(19662);if ((((type.equals("Emergency") || type.equals("Alert"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19663)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19664)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19665);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19666);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, values[index++]);
        __CLR4_5_2f5rf5rlwydyker.R.inc(19667);if ((((deviceSession == null)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19668)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19669)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19670);return null;
        }
        }__CLR4_5_2f5rf5rlwydyker.R.inc(19671);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2f5rf5rlwydyker.R.inc(19672);if ((((!type.equals("Alert") || protocolType == 0)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19673)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19674)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19675);position.set(Position.KEY_VERSION_FW, values[index++]);
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19676);DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        __CLR4_5_2f5rf5rlwydyker.R.inc(19677);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19678);position.setTime(dateFormat.parse(values[index++] + values[index++]));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19679);if ((((protocolType == 1)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19680)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19681)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19682);index += 1; // cell
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19683);position.setLatitude(Double.parseDouble(values[index++]));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19684);position.setLongitude(Double.parseDouble(values[index++]));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19685);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(values[index++])));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19686);position.setCourse(Double.parseDouble(values[index++]));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19687);position.setValid(values[index++].equals("1"));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19688);if ((((protocolType == 1)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19689)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19690)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19691);position.set(Position.KEY_ODOMETER, Integer.parseInt(values[index]));
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19692);return position;
    }finally{__CLR4_5_2f5rf5rlwydyker.R.flushNeeded();}}

    private Position decode23(
            Channel channel, SocketAddress remoteAddress, String protocol, String[] values) throws ParseException {try{__CLR4_5_2f5rf5rlwydyker.R.inc(19693);
        __CLR4_5_2f5rf5rlwydyker.R.inc(19694);int index = 0;

        __CLR4_5_2f5rf5rlwydyker.R.inc(19695);String type = values[index++].substring(5);

        __CLR4_5_2f5rf5rlwydyker.R.inc(19696);if ((((!type.equals("STT") && !type.equals("EMG") && !type.equals("EVT") && !type.equals("ALT"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19697)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19698)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19699);return null;
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19700);Position position = new Position();
        __CLR4_5_2f5rf5rlwydyker.R.inc(19701);position.setProtocol(getProtocolName());

        __CLR4_5_2f5rf5rlwydyker.R.inc(19702);if ((((type.equals("EMG") || type.equals("ALT"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19703)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19704)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19705);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19706);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, values[index++]);
        __CLR4_5_2f5rf5rlwydyker.R.inc(19707);if ((((deviceSession == null)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19708)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19709)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19710);return null;
        }
        }__CLR4_5_2f5rf5rlwydyker.R.inc(19711);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2f5rf5rlwydyker.R.inc(19712);if ((((protocol.equals("ST300"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19713)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19714)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19715);index += 1; // model
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19716);position.set(Position.KEY_VERSION_FW, values[index++]);

        __CLR4_5_2f5rf5rlwydyker.R.inc(19717);DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        __CLR4_5_2f5rf5rlwydyker.R.inc(19718);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19719);position.setTime(dateFormat.parse(values[index++] + values[index++]));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19720);index += 1; // cell

        __CLR4_5_2f5rf5rlwydyker.R.inc(19721);position.setLatitude(Double.parseDouble(values[index++]));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19722);position.setLongitude(Double.parseDouble(values[index++]));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19723);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(values[index++])));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19724);position.setCourse(Double.parseDouble(values[index++]));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19725);position.set(Position.KEY_SATELLITES, Integer.parseInt(values[index++]));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19726);position.setValid(values[index++].equals("1"));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19727);position.set(Position.KEY_ODOMETER, Integer.parseInt(values[index++]));
        __CLR4_5_2f5rf5rlwydyker.R.inc(19728);position.set(Position.KEY_POWER, Double.parseDouble(values[index++]));

        __CLR4_5_2f5rf5rlwydyker.R.inc(19729);position.set(Position.PREFIX_IO + 1, values[index++]);

        __CLR4_5_2f5rf5rlwydyker.R.inc(19730);index += 1; // mode

        __CLR4_5_2f5rf5rlwydyker.R.inc(19731);if ((((type.equals("STT"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19732)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19733)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19734);position.set(Position.KEY_INDEX, Integer.parseInt(values[index++]));
        }

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19735);if ((((hbm)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19736)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19737)==0&false))) {{

            __CLR4_5_2f5rf5rlwydyker.R.inc(19738);if ((((index < values.length)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19739)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19740)==0&false))) {{
                __CLR4_5_2f5rf5rlwydyker.R.inc(19741);position.set(Position.KEY_HOURS, Integer.parseInt(values[index++]));
            }

            }__CLR4_5_2f5rf5rlwydyker.R.inc(19742);if ((((index < values.length)&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19743)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19744)==0&false))) {{
                __CLR4_5_2f5rf5rlwydyker.R.inc(19745);position.set(Position.KEY_BATTERY, Double.parseDouble(values[index]));
            }

        }}

        }__CLR4_5_2f5rf5rlwydyker.R.inc(19746);return position;
    }finally{__CLR4_5_2f5rf5rlwydyker.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2f5rf5rlwydyker.R.inc(19747);

        __CLR4_5_2f5rf5rlwydyker.R.inc(19748);String[] values = ((String) msg).split(";");

        __CLR4_5_2f5rf5rlwydyker.R.inc(19749);String protocol = values[0].substring(0, 5);

        __CLR4_5_2f5rf5rlwydyker.R.inc(19750);if ((((protocol.equals("ST910"))&&(__CLR4_5_2f5rf5rlwydyker.R.iget(19751)!=0|true))||(__CLR4_5_2f5rf5rlwydyker.R.iget(19752)==0&false))) {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19753);return decode9(channel, remoteAddress, values);
        } }else {{
            __CLR4_5_2f5rf5rlwydyker.R.inc(19754);return decode23(channel, remoteAddress, protocol, values);
        }
    }}finally{__CLR4_5_2f5rf5rlwydyker.R.flushNeeded();}}

}
