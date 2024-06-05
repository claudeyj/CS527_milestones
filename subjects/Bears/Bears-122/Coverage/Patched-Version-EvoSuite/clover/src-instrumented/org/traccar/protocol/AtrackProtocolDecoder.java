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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class AtrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26m66m6lwye3yoi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,8805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MIN_DATA_LENGTH = 40;

    private boolean longDate;
    private boolean custom;
    private String form;

    private final Map<Integer, String> alarmMap = new HashMap<>();

    public AtrackProtocolDecoder(AtrackProtocol protocol) {
        super(protocol);__CLR4_5_26m66m6lwye3yoi.R.inc(8575);try{__CLR4_5_26m66m6lwye3yoi.R.inc(8574);

        __CLR4_5_26m66m6lwye3yoi.R.inc(8576);longDate = Context.getConfig().getBoolean(getProtocolName() + ".longDate");

        __CLR4_5_26m66m6lwye3yoi.R.inc(8577);custom = Context.getConfig().getBoolean(getProtocolName() + ".custom");
        __CLR4_5_26m66m6lwye3yoi.R.inc(8578);form = Context.getConfig().getString(getProtocolName() + ".form");
        __CLR4_5_26m66m6lwye3yoi.R.inc(8579);if ((((form != null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8580)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8581)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8582);custom = true;
        }

        }__CLR4_5_26m66m6lwye3yoi.R.inc(8583);for (String pair : Context.getConfig().getString(getProtocolName() + ".alarmMap", "").split(",")) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8584);if ((((!pair.isEmpty())&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8585)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8586)==0&false))) {{
                __CLR4_5_26m66m6lwye3yoi.R.inc(8587);alarmMap.put(
                        Integer.parseInt(pair.substring(0, pair.indexOf('='))), pair.substring(pair.indexOf('=') + 1));
            }
        }}
    }}finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    public void setLongDate(boolean longDate) {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8588);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8589);this.longDate = longDate;
    }finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    public void setCustom(boolean custom) {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8590);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8591);this.custom = custom;
    }finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    private static void sendResponse(Channel channel, SocketAddress remoteAddress, long rawId, int index) {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8592);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8593);if ((((channel != null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8594)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8595)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8596);ChannelBuffer response = ChannelBuffers.directBuffer(12);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8597);response.writeShort(0xfe02);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8598);response.writeLong(rawId);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8599);response.writeShort(index);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8600);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    private static String readString(ChannelBuffer buf) {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8601);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8602);String result = null;
        __CLR4_5_26m66m6lwye3yoi.R.inc(8603);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) 0);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8604);if ((((index > buf.readerIndex())&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8605)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8606)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8607);result = buf.readBytes(index - buf.readerIndex()).toString(StandardCharsets.US_ASCII);
        }
        }__CLR4_5_26m66m6lwye3yoi.R.inc(8608);buf.readByte();
        __CLR4_5_26m66m6lwye3yoi.R.inc(8609);return result;
    }finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    private void readCustomData(Position position, ChannelBuffer buf, String form) {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8610);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8611);CellTower cellTower = new CellTower();
        __CLR4_5_26m66m6lwye3yoi.R.inc(8612);String[] keys = form.substring(1).split("%");
        __CLR4_5_26m66m6lwye3yoi.R.inc(8613);for (String key : keys) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_26m66m6lwye3yoi.R.inc(8614);switch (key) {
                case "SA":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8615);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8616);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8617);break;
                case "MV":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8618);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8619);position.set(Position.KEY_POWER, buf.readUnsignedShort());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8620);break;
                case "BV":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8621);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8622);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8623);break;
                case "GQ":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8624);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8625);cellTower.setSignalStrength((int) buf.readUnsignedByte());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8626);break;
                case "CE":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8627);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8628);cellTower.setCellId(buf.readUnsignedInt());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8629);break;
                case "LC":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8630);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8631);cellTower.setLocationAreaCode(buf.readUnsignedShort());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8632);break;
                case "CN":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8633);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8634);int combinedMobileCodes = (int) (buf.readUnsignedInt() % 100000); // cccnn
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8635);cellTower.setMobileCountryCode(combinedMobileCodes / 100);
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8636);cellTower.setMobileNetworkCode(combinedMobileCodes % 100);
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8637);break;
                case "RL":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8638);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8639);buf.readUnsignedByte(); // rxlev
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8640);break;
                case "PC":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8641);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8642);position.set(Position.PREFIX_COUNT + 1, buf.readUnsignedInt());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8643);break;
                case "AT":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8644);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8645);position.setAltitude(buf.readUnsignedInt());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8646);break;
                case "RP":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8647);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8648);position.set(Position.KEY_RPM, buf.readUnsignedShort());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8649);break;
                case "GS":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8650);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8651);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8652);break;
                case "DT":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8653);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8654);position.set(Position.KEY_ARCHIVE, buf.readUnsignedByte() == 1);
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8655);break;
                case "VN":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8656);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8657);position.set(Position.KEY_VIN, readString(buf));
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8658);break;
                case "MF":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8659);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8660);buf.readUnsignedShort(); // mass air flow rate
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8661);break;
                case "EL":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8662);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8663);buf.readUnsignedByte(); // engine load
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8664);break;
                case "TR":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8665);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8666);position.set(Position.KEY_THROTTLE, buf.readUnsignedByte());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8667);break;
                case "ET":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8668);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8669);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedShort());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8670);break;
                case "FL":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8671);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8672);position.set(Position.KEY_FUEL_LEVEL, buf.readUnsignedByte());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8673);break;
                case "ML":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8674);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8675);buf.readUnsignedByte(); // mil status
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8676);break;
                case "FC":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8677);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8678);position.set(Position.KEY_FUEL_CONSUMPTION, buf.readUnsignedInt());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8679);break;
                case "CI":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8680);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8681);readString(buf); // format string
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8682);break;
                case "AV1":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8683);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8684);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8685);break;
                case "NC":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8686);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8687);readString(buf); // gsm neighbor cell info
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8688);break;
                case "SM":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8689);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8690);buf.readUnsignedShort(); // max speed between reports
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8691);break;
                case "GL":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8692);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8693);readString(buf); // google link
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8694);break;
                case "MA":if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8695);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8696);readString(buf); // mac address
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8697);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_26m66m6lwye3yoi.R.inc(8698);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8699);break;
            }
        }

        }__CLR4_5_26m66m6lwye3yoi.R.inc(8700);if ((((cellTower.getMobileCountryCode() != null
            && cellTower.getMobileNetworkCode() != null
            && cellTower.getCellId() != null
            && cellTower.getLocationAreaCode() != null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8701)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8702)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8703);position.setNetwork(new Network(cellTower));
        } }else {__CLR4_5_26m66m6lwye3yoi.R.inc(8704);if ((((cellTower.getSignalStrength() != null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8705)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8706)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8707);position.set(Position.KEY_RSSI, cellTower.getSignalStrength());
        }
    }}}finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    private static final Pattern PATTERN_INFO = new PatternBuilder()
            .text("$INFO=")
            .number("(d+),")                     // unit id
            .expression("([^,]+),")              // model
            .expression("([^,]+),")              // firmware version
            .number("d+,")                       // imei
            .number("d+,")                       // imsi
            .number("d+,")                       // sim card id
            .number("(d+),")                     // power
            .number("(d+),")                     // battery
            .number("(d+),")                     // satellites
            .number("d+,")                       // gsm status
            .number("(d+),")                     // rssi
            .number("d+,")                       // connection status
            .number("d+")                        // antenna status
            .any()
            .compile();

    private Position decodeString(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8708);
        __CLR4_5_26m66m6lwye3yoi.R.inc(8709);Position position = new Position();
        __CLR4_5_26m66m6lwye3yoi.R.inc(8710);position.setProtocol(getProtocolName());

        __CLR4_5_26m66m6lwye3yoi.R.inc(8711);getLastLocation(position, null);

        __CLR4_5_26m66m6lwye3yoi.R.inc(8712);DeviceSession deviceSession;

        __CLR4_5_26m66m6lwye3yoi.R.inc(8713);if ((((sentence.startsWith("$INFO"))&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8714)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8715)==0&false))) {{

            __CLR4_5_26m66m6lwye3yoi.R.inc(8716);Parser parser = new Parser(PATTERN_INFO, sentence);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8717);if ((((!parser.matches())&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8718)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8719)==0&false))) {{
                __CLR4_5_26m66m6lwye3yoi.R.inc(8720);return null;
            }

            }__CLR4_5_26m66m6lwye3yoi.R.inc(8721);deviceSession = getDeviceSession(channel, remoteAddress, parser.next());

            __CLR4_5_26m66m6lwye3yoi.R.inc(8722);position.set("model", parser.next());
            __CLR4_5_26m66m6lwye3yoi.R.inc(8723);position.set(Position.KEY_VERSION_FW, parser.next());
            __CLR4_5_26m66m6lwye3yoi.R.inc(8724);position.set(Position.KEY_POWER, parser.nextInt() * 0.1);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8725);position.set(Position.KEY_BATTERY, parser.nextInt() * 0.1);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8726);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_26m66m6lwye3yoi.R.inc(8727);position.set(Position.KEY_RSSI, parser.nextInt());

        } }else {{

            __CLR4_5_26m66m6lwye3yoi.R.inc(8728);deviceSession = getDeviceSession(channel, remoteAddress);

            __CLR4_5_26m66m6lwye3yoi.R.inc(8729);position.set(Position.KEY_RESULT, sentence);

        }

        }__CLR4_5_26m66m6lwye3yoi.R.inc(8730);if ((((deviceSession == null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8731)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8732)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8733);return null;
        } }else {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8734);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_26m66m6lwye3yoi.R.inc(8735);return position;
        }
    }}finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26m66m6lwye3yoi.R.inc(8736);

        __CLR4_5_26m66m6lwye3yoi.R.inc(8737);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26m66m6lwye3yoi.R.inc(8738);if ((((buf.getUnsignedShort(buf.readerIndex()) == 0xfe02)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8739)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8740)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8741);if ((((channel != null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8742)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8743)==0&false))) {{
                __CLR4_5_26m66m6lwye3yoi.R.inc(8744);channel.write(buf, remoteAddress); // keep-alive message
            }
            }__CLR4_5_26m66m6lwye3yoi.R.inc(8745);return null;
        } }else {__CLR4_5_26m66m6lwye3yoi.R.inc(8746);if ((((buf.getByte(buf.readerIndex()) == '$')&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8747)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8748)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8749);return decodeString(channel, remoteAddress, buf.toString(StandardCharsets.US_ASCII).trim());
        }

        }}__CLR4_5_26m66m6lwye3yoi.R.inc(8750);buf.skipBytes(2); // prefix
        __CLR4_5_26m66m6lwye3yoi.R.inc(8751);buf.readUnsignedShort(); // checksum
        __CLR4_5_26m66m6lwye3yoi.R.inc(8752);buf.readUnsignedShort(); // length
        __CLR4_5_26m66m6lwye3yoi.R.inc(8753);int index = buf.readUnsignedShort();

        __CLR4_5_26m66m6lwye3yoi.R.inc(8754);long id = buf.readLong();
        __CLR4_5_26m66m6lwye3yoi.R.inc(8755);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(id));
        __CLR4_5_26m66m6lwye3yoi.R.inc(8756);if ((((deviceSession == null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8757)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8758)==0&false))) {{
            __CLR4_5_26m66m6lwye3yoi.R.inc(8759);return null;
        }

        }__CLR4_5_26m66m6lwye3yoi.R.inc(8760);sendResponse(channel, remoteAddress, id, index);

        __CLR4_5_26m66m6lwye3yoi.R.inc(8761);List<Position> positions = new LinkedList<>();

        __CLR4_5_26m66m6lwye3yoi.R.inc(8762);while ((((buf.readableBytes() >= MIN_DATA_LENGTH)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8763)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8764)==0&false))) {{

            __CLR4_5_26m66m6lwye3yoi.R.inc(8765);Position position = new Position();
            __CLR4_5_26m66m6lwye3yoi.R.inc(8766);position.setProtocol(getProtocolName());
            __CLR4_5_26m66m6lwye3yoi.R.inc(8767);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_26m66m6lwye3yoi.R.inc(8768);if ((((longDate)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8769)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8770)==0&false))) {{

                __CLR4_5_26m66m6lwye3yoi.R.inc(8771);DateBuilder dateBuilder = new DateBuilder()
                        .setDate(buf.readUnsignedShort(), buf.readUnsignedByte(), buf.readUnsignedByte())
                        .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
                __CLR4_5_26m66m6lwye3yoi.R.inc(8772);position.setTime(dateBuilder.getDate());

                __CLR4_5_26m66m6lwye3yoi.R.inc(8773);buf.skipBytes(7 + 7);


            } }else {{

                __CLR4_5_26m66m6lwye3yoi.R.inc(8774);position.setFixTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_26m66m6lwye3yoi.R.inc(8775);position.setDeviceTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_26m66m6lwye3yoi.R.inc(8776);buf.readUnsignedInt(); // send time
            }

            }__CLR4_5_26m66m6lwye3yoi.R.inc(8777);position.setValid(true);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8778);position.setLongitude(buf.readInt() * 0.000001);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8779);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8780);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_26m66m6lwye3yoi.R.inc(8781);int type = buf.readUnsignedByte();
            __CLR4_5_26m66m6lwye3yoi.R.inc(8782);position.set(Position.KEY_TYPE, type);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8783);position.set(Position.KEY_ALARM, alarmMap.get(type));

            __CLR4_5_26m66m6lwye3yoi.R.inc(8784);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 100);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8785);position.set(Position.KEY_HDOP, buf.readUnsignedShort() * 0.1);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8786);position.set(Position.KEY_INPUT, buf.readUnsignedByte());

            __CLR4_5_26m66m6lwye3yoi.R.inc(8787);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            __CLR4_5_26m66m6lwye3yoi.R.inc(8788);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());
            __CLR4_5_26m66m6lwye3yoi.R.inc(8789);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort() * 0.001);

            __CLR4_5_26m66m6lwye3yoi.R.inc(8790);position.set(Position.KEY_DRIVER_UNIQUE_ID, readString(buf));

            __CLR4_5_26m66m6lwye3yoi.R.inc(8791);position.set(Position.PREFIX_TEMP + 1, buf.readShort() * 0.1);
            __CLR4_5_26m66m6lwye3yoi.R.inc(8792);position.set(Position.PREFIX_TEMP + 2, buf.readShort() * 0.1);

            __CLR4_5_26m66m6lwye3yoi.R.inc(8793);position.set("message", readString(buf));

            __CLR4_5_26m66m6lwye3yoi.R.inc(8794);if ((((custom)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8795)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8796)==0&false))) {{
                __CLR4_5_26m66m6lwye3yoi.R.inc(8797);String form = this.form;
                __CLR4_5_26m66m6lwye3yoi.R.inc(8798);if ((((form == null)&&(__CLR4_5_26m66m6lwye3yoi.R.iget(8799)!=0|true))||(__CLR4_5_26m66m6lwye3yoi.R.iget(8800)==0&false))) {{
                    __CLR4_5_26m66m6lwye3yoi.R.inc(8801);form = readString(buf).substring("%CI".length());
                }
                }__CLR4_5_26m66m6lwye3yoi.R.inc(8802);readCustomData(position, buf, form);
            }

            }__CLR4_5_26m66m6lwye3yoi.R.inc(8803);positions.add(position);

        }

        }__CLR4_5_26m66m6lwye3yoi.R.inc(8804);return positions;
    }finally{__CLR4_5_26m66m6lwye3yoi.R.flushNeeded();}}

}
