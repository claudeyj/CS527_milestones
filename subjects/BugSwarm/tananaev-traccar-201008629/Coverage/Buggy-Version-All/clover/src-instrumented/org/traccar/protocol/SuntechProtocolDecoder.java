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

public class SuntechProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2d3id3ilx1dxppu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,17075,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int protocolType;

    public SuntechProtocolDecoder(SuntechProtocol protocol) {
        super(protocol);__CLR4_5_2d3id3ilx1dxppu.R.inc(16975);try{__CLR4_5_2d3id3ilx1dxppu.R.inc(16974);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(16976);protocolType = Context.getConfig().getInteger(getProtocolName() + ".protocolType");
    }finally{__CLR4_5_2d3id3ilx1dxppu.R.flushNeeded();}}

    public void setProtocolType(int protocolType) {try{__CLR4_5_2d3id3ilx1dxppu.R.inc(16977);
        __CLR4_5_2d3id3ilx1dxppu.R.inc(16978);this.protocolType = protocolType;
    }finally{__CLR4_5_2d3id3ilx1dxppu.R.flushNeeded();}}

    private Position decode9(
            Channel channel, SocketAddress remoteAddress, String[] values) throws ParseException {try{__CLR4_5_2d3id3ilx1dxppu.R.inc(16979);
        __CLR4_5_2d3id3ilx1dxppu.R.inc(16980);int index = 1;

        __CLR4_5_2d3id3ilx1dxppu.R.inc(16981);String type = values[index++];

        __CLR4_5_2d3id3ilx1dxppu.R.inc(16982);if ((((!type.equals("Location") && !type.equals("Emergency") && !type.equals("Alert"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(16983)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(16984)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(16985);return null;
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(16986);Position position = new Position();
        __CLR4_5_2d3id3ilx1dxppu.R.inc(16987);position.setProtocol(getProtocolName());

        __CLR4_5_2d3id3ilx1dxppu.R.inc(16988);if ((((type.equals("Emergency") || type.equals("Alert"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(16989)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(16990)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(16991);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(16992);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, values[index++]);
        __CLR4_5_2d3id3ilx1dxppu.R.inc(16993);if ((((deviceSession == null)&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(16994)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(16995)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(16996);return null;
        }
        }__CLR4_5_2d3id3ilx1dxppu.R.inc(16997);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2d3id3ilx1dxppu.R.inc(16998);position.set(Position.KEY_VERSION, values[index++]);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(16999);DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17000);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17001);position.setTime(dateFormat.parse(values[index++] + values[index++]));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17002);if ((((protocolType == 1)&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17003)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17004)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17005);index += 1; // cell
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17006);position.setLatitude(Double.parseDouble(values[index++]));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17007);position.setLongitude(Double.parseDouble(values[index++]));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17008);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(values[index++])));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17009);position.setCourse(Double.parseDouble(values[index++]));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17010);position.setValid(values[index++].equals("1"));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17011);if ((((protocolType == 1)&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17012)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17013)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17014);position.set(Position.KEY_ODOMETER, Integer.parseInt(values[index]));
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17015);return position;
    }finally{__CLR4_5_2d3id3ilx1dxppu.R.flushNeeded();}}

    private Position decode23(
            Channel channel, SocketAddress remoteAddress, String protocol, String[] values) throws ParseException {try{__CLR4_5_2d3id3ilx1dxppu.R.inc(17016);
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17017);int index = 0;

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17018);String type = values[index++].substring(5);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17019);if ((((!type.equals("STT") && !type.equals("EMG") && !type.equals("EVT") && !type.equals("ALT"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17020)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17021)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17022);return null;
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17023);Position position = new Position();
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17024);position.setProtocol(getProtocolName());

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17025);if ((((type.equals("EMG") || type.equals("ALT"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17026)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17027)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17028);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17029);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, values[index++]);
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17030);if ((((deviceSession == null)&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17031)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17032)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17033);return null;
        }
        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17034);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17035);if ((((protocol.equals("ST300"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17036)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17037)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17038);index += 1; // model
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17039);position.set(Position.KEY_VERSION, values[index++]);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17040);DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17041);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17042);position.setTime(dateFormat.parse(values[index++] + values[index++]));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17043);index += 1; // cell

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17044);position.setLatitude(Double.parseDouble(values[index++]));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17045);position.setLongitude(Double.parseDouble(values[index++]));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17046);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(values[index++])));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17047);position.setCourse(Double.parseDouble(values[index++]));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17048);position.set(Position.KEY_SATELLITES, Integer.parseInt(values[index++]));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17049);position.setValid(values[index++].equals("1"));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17050);position.set(Position.KEY_ODOMETER, Integer.parseInt(values[index++]));
        __CLR4_5_2d3id3ilx1dxppu.R.inc(17051);position.set(Position.KEY_POWER, Double.parseDouble(values[index++]));

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17052);position.set(Position.PREFIX_IO + 1, values[index++]);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17053);index += 1; // mode

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17054);if ((((type.equals("STT"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17055)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17056)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17057);position.set(Position.KEY_INDEX, Integer.parseInt(values[index++]));
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17058);if ((((index < values.length)&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17059)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17060)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17061);position.set(Position.KEY_HOURS, Integer.parseInt(values[index++]));
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17062);if ((((index < values.length)&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17063)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17064)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17065);position.set(Position.KEY_BATTERY, Double.parseDouble(values[index]));
        }

        }__CLR4_5_2d3id3ilx1dxppu.R.inc(17066);return position;
    }finally{__CLR4_5_2d3id3ilx1dxppu.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2d3id3ilx1dxppu.R.inc(17067);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17068);String[] values = ((String) msg).split(";");

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17069);String protocol = values[0].substring(0, 5);

        __CLR4_5_2d3id3ilx1dxppu.R.inc(17070);if ((((protocol.equals("ST910"))&&(__CLR4_5_2d3id3ilx1dxppu.R.iget(17071)!=0|true))||(__CLR4_5_2d3id3ilx1dxppu.R.iget(17072)==0&false))) {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17073);return decode9(channel, remoteAddress, values);
        } }else {{
            __CLR4_5_2d3id3ilx1dxppu.R.inc(17074);return decode23(channel, remoteAddress, protocol, values);
        }
    }}finally{__CLR4_5_2d3id3ilx1dxppu.R.flushNeeded();}}

}
