/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Date;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.BitUtil;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class UlbotechProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28fr8frlx1e45ig{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,10984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long timeZone;

    public UlbotechProtocolDecoder(UlbotechProtocol protocol) {
        super(protocol);__CLR4_5_28fr8frlx1e45ig.R.inc(10936);try{__CLR4_5_28fr8frlx1e45ig.R.inc(10935);
        __CLR4_5_28fr8frlx1e45ig.R.inc(10937);timeZone = Context.getConfig().getInteger(getProtocolName() + ".timezone", 0);
    }finally{__CLR4_5_28fr8frlx1e45ig.R.flushNeeded();}}

    private static final short DATA_GPS = 0x01;
    private static final short DATA_LBS = 0x02;
    private static final short DATA_STATUS = 0x03;
    private static final short DATA_ODOMETER = 0x04;
    private static final short DATA_ADC = 0x05;
    private static final short DATA_GEOFENCE = 0x06;
    private static final short DATA_OBD2 = 0x07;
    private static final short DATA_FUEL = 0x08;
    private static final short DATA_OBD2_ALARM = 0x09;
    private static final short DATA_HARSH_DRIVER = 0x0A;
    private static final short DATA_CANBUS = 0x0B;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28fr8frlx1e45ig.R.inc(10938);

        __CLR4_5_28fr8frlx1e45ig.R.inc(10939);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_28fr8frlx1e45ig.R.inc(10940);buf.readByte(); // header
        __CLR4_5_28fr8frlx1e45ig.R.inc(10941);buf.readUnsignedByte(); // version
        __CLR4_5_28fr8frlx1e45ig.R.inc(10942);buf.readUnsignedByte(); // type

        // Create new position
        __CLR4_5_28fr8frlx1e45ig.R.inc(10943);Position position = new Position();
        __CLR4_5_28fr8frlx1e45ig.R.inc(10944);position.setProtocol(getProtocolName());

        // Get device id
        __CLR4_5_28fr8frlx1e45ig.R.inc(10945);String imei = ChannelBufferTools.readHexString(buf, 16).substring(1);
        __CLR4_5_28fr8frlx1e45ig.R.inc(10946);if ((((!identify(imei, channel))&&(__CLR4_5_28fr8frlx1e45ig.R.iget(10947)!=0|true))||(__CLR4_5_28fr8frlx1e45ig.R.iget(10948)==0&false))) {{
            __CLR4_5_28fr8frlx1e45ig.R.inc(10949);return null;
        }
        }__CLR4_5_28fr8frlx1e45ig.R.inc(10950);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_28fr8frlx1e45ig.R.inc(10951);long seconds = buf.readUnsignedInt() & 0x7fffffffl;
        __CLR4_5_28fr8frlx1e45ig.R.inc(10952);seconds += 946684800l; // 2000-01-01 00:00
        __CLR4_5_28fr8frlx1e45ig.R.inc(10953);seconds -= timeZone;
        __CLR4_5_28fr8frlx1e45ig.R.inc(10954);position.setTime(new Date(seconds * 1000));
        
        __CLR4_5_28fr8frlx1e45ig.R.inc(10955);boolean hasLocation = false;

        __CLR4_5_28fr8frlx1e45ig.R.inc(10956);while ((((buf.readableBytes() > 3)&&(__CLR4_5_28fr8frlx1e45ig.R.iget(10957)!=0|true))||(__CLR4_5_28fr8frlx1e45ig.R.iget(10958)==0&false))) {{

            __CLR4_5_28fr8frlx1e45ig.R.inc(10959);short type = buf.readUnsignedByte();
            __CLR4_5_28fr8frlx1e45ig.R.inc(10960);short length = buf.readUnsignedByte();

            boolean __CLB4_5_2_bool0=false;__CLR4_5_28fr8frlx1e45ig.R.inc(10961);switch (type) {

                case DATA_GPS:if (!__CLB4_5_2_bool0) {__CLR4_5_28fr8frlx1e45ig.R.inc(10962);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10963);hasLocation = true;
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10964);position.setValid(true);
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10965);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10966);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10967);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10968);position.setCourse(buf.readUnsignedShort());
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10969);position.set(Event.KEY_HDOP, buf.readUnsignedShort());
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10970);break;

                case DATA_STATUS:if (!__CLB4_5_2_bool0) {__CLR4_5_28fr8frlx1e45ig.R.inc(10971);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10972);int status = buf.readUnsignedShort();
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10973);position.set(Event.KEY_IGNITION, BitUtil.check(status, 6));

                    __CLR4_5_28fr8frlx1e45ig.R.inc(10974);buf.readUnsignedShort(); // alarm
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10975);break;

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_28fr8frlx1e45ig.R.inc(10976);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10977);buf.skipBytes(length);
                    __CLR4_5_28fr8frlx1e45ig.R.inc(10978);break;
            }
        }

        }__CLR4_5_28fr8frlx1e45ig.R.inc(10979);if ((((hasLocation)&&(__CLR4_5_28fr8frlx1e45ig.R.iget(10980)!=0|true))||(__CLR4_5_28fr8frlx1e45ig.R.iget(10981)==0&false))) {{
            __CLR4_5_28fr8frlx1e45ig.R.inc(10982);return position;
        }
        }__CLR4_5_28fr8frlx1e45ig.R.inc(10983);return null;
    }finally{__CLR4_5_28fr8frlx1e45ig.R.flushNeeded();}}

}
