/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gl200BinaryProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2928928lwye3zmz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,12008,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gl200BinaryProtocolDecoder(Gl200Protocol protocol) {
        super(protocol);__CLR4_5_2928928lwye3zmz.R.inc(11745);try{__CLR4_5_2928928lwye3zmz.R.inc(11744);
    }finally{__CLR4_5_2928928lwye3zmz.R.flushNeeded();}}

    private Date decodeTime(ChannelBuffer buf) {try{__CLR4_5_2928928lwye3zmz.R.inc(11746);
        __CLR4_5_2928928lwye3zmz.R.inc(11747);DateBuilder dateBuilder = new DateBuilder()
                .setDate(buf.readUnsignedShort(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_2928928lwye3zmz.R.inc(11748);return dateBuilder.getDate();
    }finally{__CLR4_5_2928928lwye3zmz.R.flushNeeded();}}

    public static final int MSG_RSP_LCB = 3;
    public static final int MSG_RSP_GEO = 8;
    public static final int MSG_RSP_COMPRESSED = 100;

    private List<Position> decodeLocation(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2928928lwye3zmz.R.inc(11749);

        __CLR4_5_2928928lwye3zmz.R.inc(11750);List<Position> positions = new LinkedList<>();

        __CLR4_5_2928928lwye3zmz.R.inc(11751);int type = buf.readUnsignedByte();

        __CLR4_5_2928928lwye3zmz.R.inc(11752);buf.readUnsignedInt(); // mask
        __CLR4_5_2928928lwye3zmz.R.inc(11753);buf.readUnsignedShort(); // length
        __CLR4_5_2928928lwye3zmz.R.inc(11754);buf.readUnsignedByte(); // device type
        __CLR4_5_2928928lwye3zmz.R.inc(11755);buf.readUnsignedShort(); // protocol version
        __CLR4_5_2928928lwye3zmz.R.inc(11756);buf.readUnsignedShort(); // firmware version

        __CLR4_5_2928928lwye3zmz.R.inc(11757);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.format("%015d", buf.readLong()));
        __CLR4_5_2928928lwye3zmz.R.inc(11758);if ((((deviceSession == null)&&(__CLR4_5_2928928lwye3zmz.R.iget(11759)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11760)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11761);return null;
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11762);int battery = buf.readUnsignedByte();
        __CLR4_5_2928928lwye3zmz.R.inc(11763);int power = buf.readUnsignedShort();

        __CLR4_5_2928928lwye3zmz.R.inc(11764);if ((((type == MSG_RSP_GEO)&&(__CLR4_5_2928928lwye3zmz.R.iget(11765)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11766)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11767);buf.readUnsignedByte(); // reserved
            __CLR4_5_2928928lwye3zmz.R.inc(11768);buf.readUnsignedByte(); // reserved
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11769);buf.readUnsignedByte(); // motion status
        __CLR4_5_2928928lwye3zmz.R.inc(11770);int satellites = buf.readUnsignedByte();

        __CLR4_5_2928928lwye3zmz.R.inc(11771);if ((((type != MSG_RSP_COMPRESSED)&&(__CLR4_5_2928928lwye3zmz.R.iget(11772)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11773)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11774);buf.readUnsignedByte(); // index
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11775);if ((((type == MSG_RSP_LCB)&&(__CLR4_5_2928928lwye3zmz.R.iget(11776)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11777)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11778);buf.readUnsignedByte(); // phone length
            __CLR4_5_2928928lwye3zmz.R.inc(11779);for (int b = buf.readUnsignedByte();; b = buf.readUnsignedByte()) {{
                __CLR4_5_2928928lwye3zmz.R.inc(11780);if (((((b & 0xf) == 0xf || (b & 0xf0) == 0xf0)&&(__CLR4_5_2928928lwye3zmz.R.iget(11781)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11782)==0&false))) {{
                    __CLR4_5_2928928lwye3zmz.R.inc(11783);break;
                }
            }}
        }}

        }__CLR4_5_2928928lwye3zmz.R.inc(11784);if ((((type == MSG_RSP_COMPRESSED)&&(__CLR4_5_2928928lwye3zmz.R.iget(11785)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11786)==0&false))) {{

            __CLR4_5_2928928lwye3zmz.R.inc(11787);int count = buf.readUnsignedShort();

            __CLR4_5_2928928lwye3zmz.R.inc(11788);BitBuffer bits;
            __CLR4_5_2928928lwye3zmz.R.inc(11789);int speed = 0;
            __CLR4_5_2928928lwye3zmz.R.inc(11790);int heading = 0;
            __CLR4_5_2928928lwye3zmz.R.inc(11791);int latitude = 0;
            __CLR4_5_2928928lwye3zmz.R.inc(11792);int longitude = 0;
            __CLR4_5_2928928lwye3zmz.R.inc(11793);long time = 0;

            __CLR4_5_2928928lwye3zmz.R.inc(11794);for (int i = 0; (((i < count)&&(__CLR4_5_2928928lwye3zmz.R.iget(11795)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11796)==0&false)); i++) {{

                __CLR4_5_2928928lwye3zmz.R.inc(11797);if ((((time > 0)&&(__CLR4_5_2928928lwye3zmz.R.iget(11798)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11799)==0&false))) {{
                    __CLR4_5_2928928lwye3zmz.R.inc(11800);time += 1;
                }

                }__CLR4_5_2928928lwye3zmz.R.inc(11801);Position position = new Position();
                __CLR4_5_2928928lwye3zmz.R.inc(11802);position.setProtocol(getProtocolName());
                __CLR4_5_2928928lwye3zmz.R.inc(11803);position.setDeviceId(deviceSession.getDeviceId());

                boolean __CLB4_5_2_bool0=false;__CLR4_5_2928928lwye3zmz.R.inc(11804);switch (BitUtil.from(buf.getUnsignedByte(buf.readerIndex()), 8 - 2)) {
                    case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2928928lwye3zmz.R.inc(11805);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2928928lwye3zmz.R.inc(11806);bits = new BitBuffer(buf.readBytes(3));
                        __CLR4_5_2928928lwye3zmz.R.inc(11807);bits.readUnsigned(2); // point attribute
                        __CLR4_5_2928928lwye3zmz.R.inc(11808);bits.readUnsigned(1); // fix type
                        __CLR4_5_2928928lwye3zmz.R.inc(11809);speed = bits.readUnsigned(12);
                        __CLR4_5_2928928lwye3zmz.R.inc(11810);heading = bits.readUnsigned(9);
                        __CLR4_5_2928928lwye3zmz.R.inc(11811);longitude = buf.readInt();
                        __CLR4_5_2928928lwye3zmz.R.inc(11812);latitude = buf.readInt();
                        __CLR4_5_2928928lwye3zmz.R.inc(11813);if ((((time == 0)&&(__CLR4_5_2928928lwye3zmz.R.iget(11814)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11815)==0&false))) {{
                            __CLR4_5_2928928lwye3zmz.R.inc(11816);time = buf.readUnsignedInt();
                        }
                        }__CLR4_5_2928928lwye3zmz.R.inc(11817);break;
                    case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2928928lwye3zmz.R.inc(11818);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2928928lwye3zmz.R.inc(11819);bits = new BitBuffer(buf.readBytes(5));
                        __CLR4_5_2928928lwye3zmz.R.inc(11820);bits.readUnsigned(2); // point attribute
                        __CLR4_5_2928928lwye3zmz.R.inc(11821);bits.readUnsigned(1); // fix type
                        __CLR4_5_2928928lwye3zmz.R.inc(11822);speed += bits.readSigned(7);
                        __CLR4_5_2928928lwye3zmz.R.inc(11823);heading += bits.readSigned(7);
                        __CLR4_5_2928928lwye3zmz.R.inc(11824);longitude += bits.readSigned(12);
                        __CLR4_5_2928928lwye3zmz.R.inc(11825);latitude += bits.readSigned(11);
                        __CLR4_5_2928928lwye3zmz.R.inc(11826);break;
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_2928928lwye3zmz.R.inc(11827);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2928928lwye3zmz.R.inc(11828);buf.readUnsignedByte(); // invalid or same
                        __CLR4_5_2928928lwye3zmz.R.inc(11829);continue;
                }

                __CLR4_5_2928928lwye3zmz.R.inc(11830);position.setValid(true);
                __CLR4_5_2928928lwye3zmz.R.inc(11831);position.setTime(new Date(time * 1000));
                __CLR4_5_2928928lwye3zmz.R.inc(11832);position.setSpeed(UnitsConverter.knotsFromKph(speed * 0.1));
                __CLR4_5_2928928lwye3zmz.R.inc(11833);position.setCourse(heading);
                __CLR4_5_2928928lwye3zmz.R.inc(11834);position.setLongitude(longitude * 0.000001);
                __CLR4_5_2928928lwye3zmz.R.inc(11835);position.setLatitude(latitude * 0.000001);

                __CLR4_5_2928928lwye3zmz.R.inc(11836);positions.add(position);

            }

        }} }else {{

            __CLR4_5_2928928lwye3zmz.R.inc(11837);int count = buf.readUnsignedByte();

            __CLR4_5_2928928lwye3zmz.R.inc(11838);for (int i = 0; (((i < count)&&(__CLR4_5_2928928lwye3zmz.R.iget(11839)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11840)==0&false)); i++) {{

                __CLR4_5_2928928lwye3zmz.R.inc(11841);Position position = new Position();
                __CLR4_5_2928928lwye3zmz.R.inc(11842);position.setProtocol(getProtocolName());
                __CLR4_5_2928928lwye3zmz.R.inc(11843);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2928928lwye3zmz.R.inc(11844);position.set(Position.KEY_BATTERY_LEVEL, battery);
                __CLR4_5_2928928lwye3zmz.R.inc(11845);position.set(Position.KEY_POWER, power);
                __CLR4_5_2928928lwye3zmz.R.inc(11846);position.set(Position.KEY_SATELLITES, satellites);

                __CLR4_5_2928928lwye3zmz.R.inc(11847);int hdop = buf.readUnsignedByte();
                __CLR4_5_2928928lwye3zmz.R.inc(11848);position.setValid(hdop > 0);
                __CLR4_5_2928928lwye3zmz.R.inc(11849);position.set(Position.KEY_HDOP, hdop);

                __CLR4_5_2928928lwye3zmz.R.inc(11850);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedMedium() * 0.1));
                __CLR4_5_2928928lwye3zmz.R.inc(11851);position.setCourse(buf.readUnsignedShort());
                __CLR4_5_2928928lwye3zmz.R.inc(11852);position.setAltitude(buf.readShort());
                __CLR4_5_2928928lwye3zmz.R.inc(11853);position.setLongitude(buf.readInt() * 0.000001);
                __CLR4_5_2928928lwye3zmz.R.inc(11854);position.setLatitude(buf.readInt() * 0.000001);

                __CLR4_5_2928928lwye3zmz.R.inc(11855);position.setTime(decodeTime(buf));

                __CLR4_5_2928928lwye3zmz.R.inc(11856);position.setNetwork(new Network(CellTower.from(
                        buf.readUnsignedShort(), buf.readUnsignedShort(),
                        buf.readUnsignedShort(), buf.readUnsignedShort())));

                __CLR4_5_2928928lwye3zmz.R.inc(11857);buf.readUnsignedByte(); // reserved

                __CLR4_5_2928928lwye3zmz.R.inc(11858);positions.add(position);

            }

        }}

        }__CLR4_5_2928928lwye3zmz.R.inc(11859);return positions;
    }finally{__CLR4_5_2928928lwye3zmz.R.flushNeeded();}}

    public static final int MSG_EVT_BPL = 6;
    public static final int MSG_EVT_VGN = 45;
    public static final int MSG_EVT_VGF = 46;
    public static final int MSG_EVT_UPD = 15;
    public static final int MSG_EVT_IDF = 17;
    public static final int MSG_EVT_GSS = 21;
    public static final int MSG_EVT_GES = 26;
    public static final int MSG_EVT_GPJ = 31;
    public static final int MSG_EVT_RMD = 35;
    public static final int MSG_EVT_JDS = 33;
    public static final int MSG_EVT_CRA = 23;
    public static final int MSG_EVT_UPC = 34;

    private Position decodeEvent(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2928928lwye3zmz.R.inc(11860);

        __CLR4_5_2928928lwye3zmz.R.inc(11861);Position position = new Position();
        __CLR4_5_2928928lwye3zmz.R.inc(11862);position.setProtocol(getProtocolName());

        __CLR4_5_2928928lwye3zmz.R.inc(11863);int type = buf.readUnsignedByte();

        __CLR4_5_2928928lwye3zmz.R.inc(11864);buf.readUnsignedInt(); // mask
        __CLR4_5_2928928lwye3zmz.R.inc(11865);buf.readUnsignedShort(); // length
        __CLR4_5_2928928lwye3zmz.R.inc(11866);buf.readUnsignedByte(); // device type
        __CLR4_5_2928928lwye3zmz.R.inc(11867);buf.readUnsignedShort(); // protocol version

        __CLR4_5_2928928lwye3zmz.R.inc(11868);position.set(Position.KEY_VERSION_FW, String.valueOf(buf.readUnsignedShort()));

        __CLR4_5_2928928lwye3zmz.R.inc(11869);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.format("%015d", buf.readLong()));
        __CLR4_5_2928928lwye3zmz.R.inc(11870);if ((((deviceSession == null)&&(__CLR4_5_2928928lwye3zmz.R.iget(11871)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11872)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11873);return null;
        }
        }__CLR4_5_2928928lwye3zmz.R.inc(11874);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2928928lwye3zmz.R.inc(11875);position.set(Position.KEY_BATTERY_LEVEL, buf.readUnsignedByte());
        __CLR4_5_2928928lwye3zmz.R.inc(11876);position.set(Position.KEY_POWER, buf.readUnsignedShort());

        __CLR4_5_2928928lwye3zmz.R.inc(11877);buf.readUnsignedByte(); // motion status

        __CLR4_5_2928928lwye3zmz.R.inc(11878);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2928928lwye3zmz.R.inc(11879);switch (type) {
            case MSG_EVT_BPL:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11880);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11881);buf.readUnsignedShort(); // backup battery voltage
                __CLR4_5_2928928lwye3zmz.R.inc(11882);break;
            case MSG_EVT_VGN:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11883);__CLB4_5_2_bool1=true;}
            case MSG_EVT_VGF:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11884);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11885);buf.readUnsignedShort(); // reserved
                __CLR4_5_2928928lwye3zmz.R.inc(11886);buf.readUnsignedByte(); // report type
                __CLR4_5_2928928lwye3zmz.R.inc(11887);buf.readUnsignedInt(); // ignition duration
                __CLR4_5_2928928lwye3zmz.R.inc(11888);break;
            case MSG_EVT_UPD:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11889);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11890);buf.readUnsignedShort(); // code
                __CLR4_5_2928928lwye3zmz.R.inc(11891);buf.readUnsignedByte(); // retry
                __CLR4_5_2928928lwye3zmz.R.inc(11892);break;
            case MSG_EVT_IDF:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11893);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11894);buf.readUnsignedInt(); // idling duration
                __CLR4_5_2928928lwye3zmz.R.inc(11895);break;
            case MSG_EVT_GSS:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11896);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11897);buf.readUnsignedByte(); // gps signal status
                __CLR4_5_2928928lwye3zmz.R.inc(11898);buf.readUnsignedInt(); // reserved
                __CLR4_5_2928928lwye3zmz.R.inc(11899);break;
            case MSG_EVT_GES:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11900);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11901);buf.readUnsignedShort(); // trigger geo id
                __CLR4_5_2928928lwye3zmz.R.inc(11902);buf.readUnsignedByte(); // trigger geo enable
                __CLR4_5_2928928lwye3zmz.R.inc(11903);buf.readUnsignedByte(); // trigger mode
                __CLR4_5_2928928lwye3zmz.R.inc(11904);buf.readUnsignedInt(); // radius
                __CLR4_5_2928928lwye3zmz.R.inc(11905);buf.readUnsignedInt(); // check interval
                __CLR4_5_2928928lwye3zmz.R.inc(11906);break;
            case MSG_EVT_GPJ:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11907);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11908);buf.readUnsignedByte(); // cw jamming value
                __CLR4_5_2928928lwye3zmz.R.inc(11909);buf.readUnsignedByte(); // gps jamming state
                __CLR4_5_2928928lwye3zmz.R.inc(11910);break;
            case MSG_EVT_RMD:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11911);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11912);buf.readUnsignedByte(); // roaming state
                __CLR4_5_2928928lwye3zmz.R.inc(11913);break;
            case MSG_EVT_JDS:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11914);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11915);buf.readUnsignedByte(); // jamming state
                __CLR4_5_2928928lwye3zmz.R.inc(11916);break;
            case MSG_EVT_CRA:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11917);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11918);buf.readUnsignedByte(); // crash counter
                __CLR4_5_2928928lwye3zmz.R.inc(11919);break;
            case MSG_EVT_UPC:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11920);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11921);buf.readUnsignedByte(); // command id
                __CLR4_5_2928928lwye3zmz.R.inc(11922);buf.readUnsignedShort(); // result
                __CLR4_5_2928928lwye3zmz.R.inc(11923);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2928928lwye3zmz.R.inc(11924);__CLB4_5_2_bool1=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(11925);break;
        }

        __CLR4_5_2928928lwye3zmz.R.inc(11926);buf.readUnsignedByte(); // count

        __CLR4_5_2928928lwye3zmz.R.inc(11927);int hdop = buf.readUnsignedByte();
        __CLR4_5_2928928lwye3zmz.R.inc(11928);position.setValid(hdop > 0);
        __CLR4_5_2928928lwye3zmz.R.inc(11929);position.set(Position.KEY_HDOP, hdop);

        __CLR4_5_2928928lwye3zmz.R.inc(11930);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedMedium() * 0.1));
        __CLR4_5_2928928lwye3zmz.R.inc(11931);position.setCourse(buf.readUnsignedShort());
        __CLR4_5_2928928lwye3zmz.R.inc(11932);position.setAltitude(buf.readShort());
        __CLR4_5_2928928lwye3zmz.R.inc(11933);position.setLongitude(buf.readInt() * 0.000001);
        __CLR4_5_2928928lwye3zmz.R.inc(11934);position.setLatitude(buf.readInt() * 0.000001);

        __CLR4_5_2928928lwye3zmz.R.inc(11935);position.setTime(decodeTime(buf));

        __CLR4_5_2928928lwye3zmz.R.inc(11936);position.setNetwork(new Network(CellTower.from(
                buf.readUnsignedShort(), buf.readUnsignedShort(),
                buf.readUnsignedShort(), buf.readUnsignedShort())));

        __CLR4_5_2928928lwye3zmz.R.inc(11937);buf.readUnsignedByte(); // reserved

        __CLR4_5_2928928lwye3zmz.R.inc(11938);return position;
    }finally{__CLR4_5_2928928lwye3zmz.R.flushNeeded();}}

    public static final int MSG_INF_GPS = 2;
    public static final int MSG_INF_CID = 4;
    public static final int MSG_INF_CSQ = 5;
    public static final int MSG_INF_VER = 6;
    public static final int MSG_INF_BAT = 7;
    public static final int MSG_INF_TMZ = 9;
    public static final int MSG_INF_GIR = 10;

    private Position decodeInformation(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2928928lwye3zmz.R.inc(11939);

        __CLR4_5_2928928lwye3zmz.R.inc(11940);Position position = new Position();
        __CLR4_5_2928928lwye3zmz.R.inc(11941);position.setProtocol(getProtocolName());

        __CLR4_5_2928928lwye3zmz.R.inc(11942);int type = buf.readUnsignedByte();

        __CLR4_5_2928928lwye3zmz.R.inc(11943);buf.readUnsignedInt(); // mask
        __CLR4_5_2928928lwye3zmz.R.inc(11944);buf.readUnsignedShort(); // length

        __CLR4_5_2928928lwye3zmz.R.inc(11945);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.format("%015d", buf.readLong()));
        __CLR4_5_2928928lwye3zmz.R.inc(11946);if ((((deviceSession == null)&&(__CLR4_5_2928928lwye3zmz.R.iget(11947)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11948)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11949);return null;
        }
        }__CLR4_5_2928928lwye3zmz.R.inc(11950);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2928928lwye3zmz.R.inc(11951);buf.readUnsignedByte(); // device type
        __CLR4_5_2928928lwye3zmz.R.inc(11952);buf.readUnsignedShort(); // protocol version

        __CLR4_5_2928928lwye3zmz.R.inc(11953);position.set(Position.KEY_VERSION_FW, String.valueOf(buf.readUnsignedShort()));

        __CLR4_5_2928928lwye3zmz.R.inc(11954);if ((((type == MSG_INF_VER)&&(__CLR4_5_2928928lwye3zmz.R.iget(11955)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11956)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11957);buf.readUnsignedShort(); // hardware version
            __CLR4_5_2928928lwye3zmz.R.inc(11958);buf.readUnsignedShort(); // mcu version
            __CLR4_5_2928928lwye3zmz.R.inc(11959);buf.readUnsignedShort(); // reserved
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11960);buf.readUnsignedByte(); // motion status
        __CLR4_5_2928928lwye3zmz.R.inc(11961);buf.readUnsignedByte(); // reserved

        __CLR4_5_2928928lwye3zmz.R.inc(11962);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

        __CLR4_5_2928928lwye3zmz.R.inc(11963);buf.readUnsignedByte(); // mode
        __CLR4_5_2928928lwye3zmz.R.inc(11964);buf.skipBytes(7); // last fix time
        __CLR4_5_2928928lwye3zmz.R.inc(11965);buf.readUnsignedByte(); // reserved
        __CLR4_5_2928928lwye3zmz.R.inc(11966);buf.readUnsignedByte();
        __CLR4_5_2928928lwye3zmz.R.inc(11967);buf.readUnsignedShort(); // response report mask
        __CLR4_5_2928928lwye3zmz.R.inc(11968);buf.readUnsignedShort(); // ign interval
        __CLR4_5_2928928lwye3zmz.R.inc(11969);buf.readUnsignedShort(); // igf interval
        __CLR4_5_2928928lwye3zmz.R.inc(11970);buf.readUnsignedInt(); // reserved
        __CLR4_5_2928928lwye3zmz.R.inc(11971);buf.readUnsignedByte(); // reserved

        __CLR4_5_2928928lwye3zmz.R.inc(11972);if ((((type == MSG_INF_BAT)&&(__CLR4_5_2928928lwye3zmz.R.iget(11973)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11974)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11975);position.set(Position.KEY_CHARGE, buf.readUnsignedByte() != 0);
            __CLR4_5_2928928lwye3zmz.R.inc(11976);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
            __CLR4_5_2928928lwye3zmz.R.inc(11977);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
            __CLR4_5_2928928lwye3zmz.R.inc(11978);position.set(Position.KEY_BATTERY_LEVEL, buf.readUnsignedByte());
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11979);buf.skipBytes(10); // iccid

        __CLR4_5_2928928lwye3zmz.R.inc(11980);if ((((type == MSG_INF_CSQ)&&(__CLR4_5_2928928lwye3zmz.R.iget(11981)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11982)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11983);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
            __CLR4_5_2928928lwye3zmz.R.inc(11984);buf.readUnsignedByte();
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11985);buf.readUnsignedByte(); // time zone flags
        __CLR4_5_2928928lwye3zmz.R.inc(11986);buf.readUnsignedShort(); // time zone offset

        __CLR4_5_2928928lwye3zmz.R.inc(11987);if ((((type == MSG_INF_GIR)&&(__CLR4_5_2928928lwye3zmz.R.iget(11988)!=0|true))||(__CLR4_5_2928928lwye3zmz.R.iget(11989)==0&false))) {{
            __CLR4_5_2928928lwye3zmz.R.inc(11990);buf.readUnsignedByte(); // gir trigger
            __CLR4_5_2928928lwye3zmz.R.inc(11991);buf.readUnsignedByte(); // cell number
            __CLR4_5_2928928lwye3zmz.R.inc(11992);position.setNetwork(new Network(CellTower.from(
                    buf.readUnsignedShort(), buf.readUnsignedShort(),
                    buf.readUnsignedShort(), buf.readUnsignedShort())));
            __CLR4_5_2928928lwye3zmz.R.inc(11993);buf.readUnsignedByte(); // ta
            __CLR4_5_2928928lwye3zmz.R.inc(11994);buf.readUnsignedByte(); // rx level
        }

        }__CLR4_5_2928928lwye3zmz.R.inc(11995);getLastLocation(position, decodeTime(buf));

        __CLR4_5_2928928lwye3zmz.R.inc(11996);return position;
    }finally{__CLR4_5_2928928lwye3zmz.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2928928lwye3zmz.R.inc(11997);

        __CLR4_5_2928928lwye3zmz.R.inc(11998);ChannelBuffer buf = (ChannelBuffer) msg;

        boolean __CLB4_5_2_bool2=false;__CLR4_5_2928928lwye3zmz.R.inc(11999);switch (buf.readBytes(4).toString(StandardCharsets.US_ASCII)) {
            case "+RSP":if (!__CLB4_5_2_bool2) {__CLR4_5_2928928lwye3zmz.R.inc(12000);__CLB4_5_2_bool2=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(12001);return decodeLocation(channel, remoteAddress, buf);
            case "+INF":if (!__CLB4_5_2_bool2) {__CLR4_5_2928928lwye3zmz.R.inc(12002);__CLB4_5_2_bool2=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(12003);return decodeInformation(channel, remoteAddress, buf);
            case "+EVT":if (!__CLB4_5_2_bool2) {__CLR4_5_2928928lwye3zmz.R.inc(12004);__CLB4_5_2_bool2=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(12005);return decodeEvent(channel, remoteAddress, buf);
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2928928lwye3zmz.R.inc(12006);__CLB4_5_2_bool2=true;}
                __CLR4_5_2928928lwye3zmz.R.inc(12007);return null;
        }
    }finally{__CLR4_5_2928928lwye3zmz.R.flushNeeded();}}

}
