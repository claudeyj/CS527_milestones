/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.socket.DatagramChannel;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.sql.SQLException;

public abstract class BaseProtocolDecoder extends ExtendedObjectDecoder {public static class __CLR4_5_26262lx1dz5jz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Protocol protocol;

    public long addUnknownDevice(String uniqueId) {try{__CLR4_5_26262lx1dz5jz.R.inc(218);
        __CLR4_5_26262lx1dz5jz.R.inc(219);Device device = new Device();
        __CLR4_5_26262lx1dz5jz.R.inc(220);device.setName(uniqueId);
        __CLR4_5_26262lx1dz5jz.R.inc(221);device.setUniqueId(uniqueId);
        __CLR4_5_26262lx1dz5jz.R.inc(222);device.setCategory(Context.getConfig().getString("database.registerUnknown.defaultCategory"));

        __CLR4_5_26262lx1dz5jz.R.inc(223);long defaultGroupId = Context.getConfig().getLong("database.registerUnknown.defaultGroupId");
        __CLR4_5_26262lx1dz5jz.R.inc(224);if ((((defaultGroupId != 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(225)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(226)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(227);device.setGroupId(defaultGroupId);
        }

        }__CLR4_5_26262lx1dz5jz.R.inc(228);try {
            __CLR4_5_26262lx1dz5jz.R.inc(229);Context.getDeviceManager().addDevice(device);
            __CLR4_5_26262lx1dz5jz.R.inc(230);Log.info("Automatically registered device " + uniqueId);
            __CLR4_5_26262lx1dz5jz.R.inc(231);return device.getId();
        } catch (SQLException e) {
            __CLR4_5_26262lx1dz5jz.R.inc(232);Log.warning(e);
            __CLR4_5_26262lx1dz5jz.R.inc(233);return 0;
        }
    }finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    public String getProtocolName() {try{__CLR4_5_26262lx1dz5jz.R.inc(234);
        __CLR4_5_26262lx1dz5jz.R.inc(235);return protocol.getName();
    }finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    private DeviceSession channelDeviceSession; // connection-based protocols
    private Map<SocketAddress, DeviceSession> addressDeviceSessions = new HashMap<>(); // connectionless protocols

    private long findDeviceId(SocketAddress remoteAddress, String... uniqueIds) {try{__CLR4_5_26262lx1dz5jz.R.inc(236);
        __CLR4_5_26262lx1dz5jz.R.inc(237);long deviceId = 0;
        __CLR4_5_26262lx1dz5jz.R.inc(238);if ((((uniqueIds.length > 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(239)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(240)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(241);try {
                __CLR4_5_26262lx1dz5jz.R.inc(242);for (String uniqueId : uniqueIds) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(243);if ((((uniqueId != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(244)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(245)==0&false))) {{
                        __CLR4_5_26262lx1dz5jz.R.inc(246);Device device = Context.getIdentityManager().getDeviceByUniqueId(uniqueId);
                        __CLR4_5_26262lx1dz5jz.R.inc(247);if ((((device != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(248)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(249)==0&false))) {{
                            __CLR4_5_26262lx1dz5jz.R.inc(250);deviceId = device.getId();
                            __CLR4_5_26262lx1dz5jz.R.inc(251);break;
                        }
                    }}
                }}
            }} catch (Exception e) {
                __CLR4_5_26262lx1dz5jz.R.inc(252);Log.warning(e);
            }
            __CLR4_5_26262lx1dz5jz.R.inc(253);if ((((deviceId == 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(254)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(255)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(256);if ((((Context.getConfig().getBoolean("database.registerUnknown"))&&(__CLR4_5_26262lx1dz5jz.R.iget(257)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(258)==0&false))) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(259);return addUnknownDevice(uniqueIds[0]);
                }

                }__CLR4_5_26262lx1dz5jz.R.inc(260);StringBuilder message = new StringBuilder("Unknown device -");
                __CLR4_5_26262lx1dz5jz.R.inc(261);for (String uniqueId : uniqueIds) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(262);message.append(" ").append(uniqueId);
                }
                }__CLR4_5_26262lx1dz5jz.R.inc(263);if ((((remoteAddress != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(264)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(265)==0&false))) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(266);message.append(" (").append(((InetSocketAddress) remoteAddress).getHostString()).append(")");
                }
                }__CLR4_5_26262lx1dz5jz.R.inc(267);Log.warning(message.toString());
            }
        }}
        }__CLR4_5_26262lx1dz5jz.R.inc(268);return deviceId;
    }finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    public DeviceSession getDeviceSession(Channel channel, SocketAddress remoteAddress, String... uniqueIds) {try{__CLR4_5_26262lx1dz5jz.R.inc(269);
        __CLR4_5_26262lx1dz5jz.R.inc(270);if ((((Context.getConfig().getBoolean("decoder.ignoreSessionCache"))&&(__CLR4_5_26262lx1dz5jz.R.iget(271)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(272)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(273);long deviceId = findDeviceId(remoteAddress, uniqueIds);
            __CLR4_5_26262lx1dz5jz.R.inc(274);if ((((deviceId != 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(275)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(276)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(277);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(278)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(279)==0&false))) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(280);Context.getConnectionManager().addActiveDevice(deviceId, protocol, channel, remoteAddress);
                }
                }__CLR4_5_26262lx1dz5jz.R.inc(281);return new DeviceSession(deviceId);
            } }else {{
                __CLR4_5_26262lx1dz5jz.R.inc(282);return null;
            }
        }}
        }__CLR4_5_26262lx1dz5jz.R.inc(283);if ((((channel instanceof DatagramChannel)&&(__CLR4_5_26262lx1dz5jz.R.iget(284)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(285)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(286);long deviceId = findDeviceId(remoteAddress, uniqueIds);
            __CLR4_5_26262lx1dz5jz.R.inc(287);DeviceSession deviceSession = addressDeviceSessions.get(remoteAddress);
            __CLR4_5_26262lx1dz5jz.R.inc(288);if ((((deviceSession != null && (deviceSession.getDeviceId() == deviceId || uniqueIds.length == 0))&&(__CLR4_5_26262lx1dz5jz.R.iget(289)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(290)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(291);return deviceSession;
            } }else {__CLR4_5_26262lx1dz5jz.R.inc(292);if ((((deviceId != 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(293)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(294)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(295);deviceSession = new DeviceSession(deviceId);
                __CLR4_5_26262lx1dz5jz.R.inc(296);addressDeviceSessions.put(remoteAddress, deviceSession);
                __CLR4_5_26262lx1dz5jz.R.inc(297);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(298)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(299)==0&false))) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(300);Context.getConnectionManager().addActiveDevice(deviceId, protocol, channel, remoteAddress);
                }
                }__CLR4_5_26262lx1dz5jz.R.inc(301);return deviceSession;
            } }else {{
                __CLR4_5_26262lx1dz5jz.R.inc(302);return null;
            }
        }}} }else {{
            __CLR4_5_26262lx1dz5jz.R.inc(303);if ((((channelDeviceSession == null)&&(__CLR4_5_26262lx1dz5jz.R.iget(304)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(305)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(306);long deviceId = findDeviceId(remoteAddress, uniqueIds);
                __CLR4_5_26262lx1dz5jz.R.inc(307);if ((((deviceId != 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(308)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(309)==0&false))) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(310);channelDeviceSession = new DeviceSession(deviceId);
                    __CLR4_5_26262lx1dz5jz.R.inc(311);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(312)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(313)==0&false))) {{
                        __CLR4_5_26262lx1dz5jz.R.inc(314);Context.getConnectionManager().addActiveDevice(deviceId, protocol, channel, remoteAddress);
                    }
                }}
            }}
            }__CLR4_5_26262lx1dz5jz.R.inc(315);return channelDeviceSession;
        }
    }}finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    public BaseProtocolDecoder(Protocol protocol) {try{__CLR4_5_26262lx1dz5jz.R.inc(316);
        __CLR4_5_26262lx1dz5jz.R.inc(317);this.protocol = protocol;
    }finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    public void getLastLocation(Position position, Date deviceTime) {try{__CLR4_5_26262lx1dz5jz.R.inc(318);
        __CLR4_5_26262lx1dz5jz.R.inc(319);if ((((position.getDeviceId() != 0)&&(__CLR4_5_26262lx1dz5jz.R.iget(320)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(321)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(322);position.setOutdated(true);

            __CLR4_5_26262lx1dz5jz.R.inc(323);Position last = Context.getIdentityManager().getLastPosition(position.getDeviceId());
            __CLR4_5_26262lx1dz5jz.R.inc(324);if ((((last != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(325)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(326)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(327);position.setFixTime(last.getFixTime());
                __CLR4_5_26262lx1dz5jz.R.inc(328);position.setValid(last.getValid());
                __CLR4_5_26262lx1dz5jz.R.inc(329);position.setLatitude(last.getLatitude());
                __CLR4_5_26262lx1dz5jz.R.inc(330);position.setLongitude(last.getLongitude());
                __CLR4_5_26262lx1dz5jz.R.inc(331);position.setAltitude(last.getAltitude());
                __CLR4_5_26262lx1dz5jz.R.inc(332);position.setSpeed(last.getSpeed());
                __CLR4_5_26262lx1dz5jz.R.inc(333);position.setCourse(last.getCourse());
            } }else {{
                __CLR4_5_26262lx1dz5jz.R.inc(334);position.setFixTime(new Date(0));
            }

            }__CLR4_5_26262lx1dz5jz.R.inc(335);if ((((deviceTime != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(336)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(337)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(338);position.setDeviceTime(deviceTime);
            } }else {{
                __CLR4_5_26262lx1dz5jz.R.inc(339);position.setDeviceTime(new Date());
            }
        }}
    }}finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    @Override
    protected void onMessageEvent(
            Channel channel, SocketAddress remoteAddress, Object originalMessage, Object decodedMessage) {try{__CLR4_5_26262lx1dz5jz.R.inc(340);
        __CLR4_5_26262lx1dz5jz.R.inc(341);if ((((Context.getStatisticsManager() != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(342)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(343)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(344);Context.getStatisticsManager().registerMessageReceived();
        }
        }__CLR4_5_26262lx1dz5jz.R.inc(345);Position position = null;
        __CLR4_5_26262lx1dz5jz.R.inc(346);if ((((decodedMessage != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(347)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(348)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(349);if ((((decodedMessage instanceof Position)&&(__CLR4_5_26262lx1dz5jz.R.iget(350)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(351)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(352);position = (Position) decodedMessage;
            } }else {__CLR4_5_26262lx1dz5jz.R.inc(353);if ((((decodedMessage instanceof Collection)&&(__CLR4_5_26262lx1dz5jz.R.iget(354)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(355)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(356);Collection positions = (Collection) decodedMessage;
                __CLR4_5_26262lx1dz5jz.R.inc(357);if ((((!positions.isEmpty())&&(__CLR4_5_26262lx1dz5jz.R.iget(358)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(359)==0&false))) {{
                    __CLR4_5_26262lx1dz5jz.R.inc(360);position = (Position) positions.iterator().next();
                }
            }}
        }}}
        }__CLR4_5_26262lx1dz5jz.R.inc(361);if ((((position != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(362)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(363)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(364);Context.getConnectionManager().updateDevice(
                    position.getDeviceId(), Device.STATUS_ONLINE, new Date());
        } }else {{
            __CLR4_5_26262lx1dz5jz.R.inc(365);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_26262lx1dz5jz.R.inc(366);if ((((deviceSession != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(367)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(368)==0&false))) {{
                __CLR4_5_26262lx1dz5jz.R.inc(369);Context.getConnectionManager().updateDevice(
                        deviceSession.getDeviceId(), Device.STATUS_ONLINE, new Date());
            }
        }}
    }}finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

    @Override
    protected Object handleEmptyMessage(Channel channel, SocketAddress remoteAddress, Object msg) {try{__CLR4_5_26262lx1dz5jz.R.inc(370);
        __CLR4_5_26262lx1dz5jz.R.inc(371);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_26262lx1dz5jz.R.inc(372);if ((((Context.getConfig().getBoolean("database.saveEmpty") && deviceSession != null)&&(__CLR4_5_26262lx1dz5jz.R.iget(373)!=0|true))||(__CLR4_5_26262lx1dz5jz.R.iget(374)==0&false))) {{
            __CLR4_5_26262lx1dz5jz.R.inc(375);Position position = new Position();
            __CLR4_5_26262lx1dz5jz.R.inc(376);position.setProtocol(getProtocolName());
            __CLR4_5_26262lx1dz5jz.R.inc(377);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_26262lx1dz5jz.R.inc(378);getLastLocation(position, null);
            __CLR4_5_26262lx1dz5jz.R.inc(379);return position;
        } }else {{
            __CLR4_5_26262lx1dz5jz.R.inc(380);return null;
        }
    }}finally{__CLR4_5_26262lx1dz5jz.R.flushNeeded();}}

}
