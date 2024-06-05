/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class AtrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25uf5uflx1dvcpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,7756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MIN_DATA_LENGTH = 40;

    private boolean longDate;
    private boolean custom;
    private String form;

    public AtrackProtocolDecoder(AtrackProtocol protocol) {
        super(protocol);__CLR4_5_25uf5uflx1dvcpg.R.inc(7576);try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7575);

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7577);longDate = Context.getConfig().getBoolean(getProtocolName() + ".longDate");

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7578);custom = Context.getConfig().getBoolean(getProtocolName() + ".custom");
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7579);form = Context.getConfig().getString(getProtocolName() + ".form");
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7580);if ((((form != null)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7581)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7582)==0&false))) {{
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7583);custom = true;
        }
    }}finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

    public void setLongDate(boolean longDate) {try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7584);
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7585);this.longDate = longDate;
    }finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

    public void setCustom(boolean custom) {try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7586);
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7587);this.custom = custom;
    }finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

    private static void sendResponse(Channel channel, SocketAddress remoteAddress, long rawId, int index) {try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7588);
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7589);if ((((channel != null)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7590)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7591)==0&false))) {{
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7592);ChannelBuffer response = ChannelBuffers.directBuffer(12);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7593);response.writeShort(0xfe02);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7594);response.writeLong(rawId);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7595);response.writeShort(index);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7596);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

    private static String readString(ChannelBuffer buf) {try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7597);
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7598);String result = null;
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7599);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) 0);
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7600);if ((((index > buf.readerIndex())&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7601)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7602)==0&false))) {{
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7603);result = buf.readBytes(index - buf.readerIndex()).toString(StandardCharsets.US_ASCII);
        }
        }__CLR4_5_25uf5uflx1dvcpg.R.inc(7604);buf.readByte();
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7605);return result;
    }finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

    private void readCustomData(Position position, ChannelBuffer buf, String form) {try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7606);
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7607);String[] keys = form.substring(1).split("%");
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7608);for (String key : keys) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_25uf5uflx1dvcpg.R.inc(7609);switch (key) {
                case "SA":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7610);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7611);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7612);break;
                case "MV":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7613);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7614);position.set(Position.KEY_POWER, buf.readUnsignedShort());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7615);break;
                case "BV":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7616);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7617);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7618);break;
                case "GQ":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7619);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7620);buf.readUnsignedByte(); // rssi
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7621);break;
                case "CE":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7622);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7623);buf.readUnsignedInt(); // cid
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7624);break;
                case "LC":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7625);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7626);buf.readUnsignedShort(); // lac
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7627);break;
                case "CN":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7628);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7629);buf.readUnsignedInt(); // mcc + mnc
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7630);break;
                case "RL":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7631);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7632);buf.readUnsignedByte(); // rxlev
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7633);break;
                case "PC":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7634);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7635);buf.readUnsignedInt(); // pulse count
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7636);break;
                case "AT":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7637);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7638);position.setAltitude(buf.readUnsignedInt());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7639);break;
                case "RP":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7640);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7641);position.set(Position.KEY_RPM, buf.readUnsignedShort());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7642);break;
                case "GS":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7643);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7644);buf.readUnsignedByte(); // gsm status
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7645);break;
                case "DT":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7646);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7647);position.set(Position.KEY_ARCHIVE, buf.readUnsignedByte() == 1);
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7648);break;
                case "VN":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7649);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7650);position.set(Position.KEY_VIN, readString(buf));
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7651);break;
                case "MF":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7652);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7653);buf.readUnsignedShort(); // mass air flow rate
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7654);break;
                case "EL":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7655);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7656);buf.readUnsignedByte(); // engine load
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7657);break;
                case "TR":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7658);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7659);position.set(Position.KEY_THROTTLE, buf.readUnsignedByte());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7660);break;
                case "ET":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7661);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7662);buf.readUnsignedShort(); // engine coolant temp
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7663);break;
                case "FL":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7664);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7665);position.set(Position.KEY_FUEL, buf.readUnsignedByte());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7666);break;
                case "ML":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7667);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7668);buf.readUnsignedByte(); // mil status
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7669);break;
                case "FC":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7670);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7671);buf.readUnsignedInt(); // fuel used
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7672);break;
                case "CI":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7673);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7674);readString(buf); // format string
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7675);break;
                case "AV1":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7676);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7677);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7678);break;
                case "NC":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7679);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7680);readString(buf); // gsm neighbor cell info
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7681);break;
                case "SM":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7682);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7683);buf.readUnsignedShort(); // max speed between reports
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7684);break;
                case "GL":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7685);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7686);readString(buf); // google link
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7687);break;
                case "MA":if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7688);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7689);readString(buf); // mac address
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7690);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_25uf5uflx1dvcpg.R.inc(7691);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7692);break;
            }
        }
    }}finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25uf5uflx1dvcpg.R.inc(7693);

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7694);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7695);if ((((buf.getUnsignedShort(buf.readerIndex()) == 0xfe02)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7696)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7697)==0&false))) {{
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7698);if ((((channel != null)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7699)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7700)==0&false))) {{
                __CLR4_5_25uf5uflx1dvcpg.R.inc(7701);channel.write(buf, remoteAddress); // keep-alive message
            }
            }__CLR4_5_25uf5uflx1dvcpg.R.inc(7702);return null;
        }

        }__CLR4_5_25uf5uflx1dvcpg.R.inc(7703);buf.skipBytes(2); // prefix
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7704);buf.readUnsignedShort(); // checksum
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7705);buf.readUnsignedShort(); // length
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7706);int index = buf.readUnsignedShort();

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7707);long id = buf.readLong();
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7708);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(id));
        __CLR4_5_25uf5uflx1dvcpg.R.inc(7709);if ((((deviceSession == null)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7710)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7711)==0&false))) {{
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7712);return null;
        }

        }__CLR4_5_25uf5uflx1dvcpg.R.inc(7713);sendResponse(channel, remoteAddress, id, index);

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7714);List<Position> positions = new LinkedList<>();

        __CLR4_5_25uf5uflx1dvcpg.R.inc(7715);while ((((buf.readableBytes() >= MIN_DATA_LENGTH)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7716)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7717)==0&false))) {{

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7718);Position position = new Position();
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7719);position.setProtocol(getProtocolName());
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7720);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7721);if ((((longDate)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7722)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7723)==0&false))) {{

                __CLR4_5_25uf5uflx1dvcpg.R.inc(7724);DateBuilder dateBuilder = new DateBuilder()
                        .setDate(buf.readUnsignedShort(), buf.readUnsignedByte(), buf.readUnsignedByte())
                        .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
                __CLR4_5_25uf5uflx1dvcpg.R.inc(7725);position.setTime(dateBuilder.getDate());

                __CLR4_5_25uf5uflx1dvcpg.R.inc(7726);buf.skipBytes(7 + 7);


            } }else {{

                __CLR4_5_25uf5uflx1dvcpg.R.inc(7727);position.setFixTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_25uf5uflx1dvcpg.R.inc(7728);position.setDeviceTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_25uf5uflx1dvcpg.R.inc(7729);buf.readUnsignedInt(); // send time
            }

            }__CLR4_5_25uf5uflx1dvcpg.R.inc(7730);position.setValid(true);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7731);position.setLongitude(buf.readInt() * 0.000001);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7732);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7733);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7734);position.set(Position.KEY_TYPE, buf.readUnsignedByte());
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7735);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 100);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7736);position.set(Position.KEY_HDOP, buf.readUnsignedShort() * 0.1);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7737);position.set(Position.KEY_INPUT, buf.readUnsignedByte());

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7738);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7739);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7740);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort() * 0.001);

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7741);position.set("driver", readString(buf));

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7742);position.set(Position.PREFIX_TEMP + 1, buf.readShort() * 0.1);
            __CLR4_5_25uf5uflx1dvcpg.R.inc(7743);position.set(Position.PREFIX_TEMP + 2, buf.readShort() * 0.1);

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7744);position.set("message", readString(buf));

            __CLR4_5_25uf5uflx1dvcpg.R.inc(7745);if ((((custom)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7746)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7747)==0&false))) {{
                __CLR4_5_25uf5uflx1dvcpg.R.inc(7748);String form = this.form;
                __CLR4_5_25uf5uflx1dvcpg.R.inc(7749);if ((((form == null)&&(__CLR4_5_25uf5uflx1dvcpg.R.iget(7750)!=0|true))||(__CLR4_5_25uf5uflx1dvcpg.R.iget(7751)==0&false))) {{
                    __CLR4_5_25uf5uflx1dvcpg.R.inc(7752);form = readString(buf).substring("%CI".length());
                }
                }__CLR4_5_25uf5uflx1dvcpg.R.inc(7753);readCustomData(position, buf, form);
            }

            }__CLR4_5_25uf5uflx1dvcpg.R.inc(7754);positions.add(position);

        }

        }__CLR4_5_25uf5uflx1dvcpg.R.inc(7755);return positions;
    }finally{__CLR4_5_25uf5uflx1dvcpg.R.flushNeeded();}}

}
