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
import org.jboss.netty.handler.codec.http.HttpRequestDecoder;
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

public abstract class BaseProtocolDecoder extends ExtendedObjectDecoder {public static class __CLR4_5_26s6slwye3twb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Protocol protocol;

    public long addUnknownDevice(String uniqueId) {try{__CLR4_5_26s6slwye3twb.R.inc(244);
        __CLR4_5_26s6slwye3twb.R.inc(245);Device device = new Device();
        __CLR4_5_26s6slwye3twb.R.inc(246);device.setName(uniqueId);
        __CLR4_5_26s6slwye3twb.R.inc(247);device.setUniqueId(uniqueId);
        __CLR4_5_26s6slwye3twb.R.inc(248);device.setCategory(Context.getConfig().getString("database.registerUnknown.defaultCategory"));

        __CLR4_5_26s6slwye3twb.R.inc(249);long defaultGroupId = Context.getConfig().getLong("database.registerUnknown.defaultGroupId");
        __CLR4_5_26s6slwye3twb.R.inc(250);if ((((defaultGroupId != 0)&&(__CLR4_5_26s6slwye3twb.R.iget(251)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(252)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(253);device.setGroupId(defaultGroupId);
        }

        }__CLR4_5_26s6slwye3twb.R.inc(254);try {
            __CLR4_5_26s6slwye3twb.R.inc(255);Context.getDeviceManager().addItem(device);

            __CLR4_5_26s6slwye3twb.R.inc(256);Log.info("Automatically registered device " + uniqueId);

            __CLR4_5_26s6slwye3twb.R.inc(257);if ((((defaultGroupId != 0)&&(__CLR4_5_26s6slwye3twb.R.iget(258)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(259)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(260);Context.getPermissionsManager().refreshDeviceAndGroupPermissions();
                __CLR4_5_26s6slwye3twb.R.inc(261);Context.getPermissionsManager().refreshAllExtendedPermissions();
            }

            }__CLR4_5_26s6slwye3twb.R.inc(262);return device.getId();
        } catch (SQLException e) {
            __CLR4_5_26s6slwye3twb.R.inc(263);Log.warning(e);
            __CLR4_5_26s6slwye3twb.R.inc(264);return 0;
        }
    }finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    public String getProtocolName() {try{__CLR4_5_26s6slwye3twb.R.inc(265);
        __CLR4_5_26s6slwye3twb.R.inc(266);return protocol.getName();
    }finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    private DeviceSession channelDeviceSession; // connection-based protocols
    private Map<SocketAddress, DeviceSession> addressDeviceSessions = new HashMap<>(); // connectionless protocols

    private long findDeviceId(SocketAddress remoteAddress, String... uniqueIds) {try{__CLR4_5_26s6slwye3twb.R.inc(267);
        __CLR4_5_26s6slwye3twb.R.inc(268);long deviceId = 0;
        __CLR4_5_26s6slwye3twb.R.inc(269);if ((((uniqueIds.length > 0)&&(__CLR4_5_26s6slwye3twb.R.iget(270)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(271)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(272);try {
                __CLR4_5_26s6slwye3twb.R.inc(273);for (String uniqueId : uniqueIds) {{
                    __CLR4_5_26s6slwye3twb.R.inc(274);if ((((uniqueId != null)&&(__CLR4_5_26s6slwye3twb.R.iget(275)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(276)==0&false))) {{
                        __CLR4_5_26s6slwye3twb.R.inc(277);Device device = Context.getIdentityManager().getByUniqueId(uniqueId);
                        __CLR4_5_26s6slwye3twb.R.inc(278);if ((((device != null)&&(__CLR4_5_26s6slwye3twb.R.iget(279)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(280)==0&false))) {{
                            __CLR4_5_26s6slwye3twb.R.inc(281);deviceId = device.getId();
                            __CLR4_5_26s6slwye3twb.R.inc(282);break;
                        }
                    }}
                }}
            }} catch (Exception e) {
                __CLR4_5_26s6slwye3twb.R.inc(283);Log.warning(e);
            }
            __CLR4_5_26s6slwye3twb.R.inc(284);if ((((deviceId == 0)&&(__CLR4_5_26s6slwye3twb.R.iget(285)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(286)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(287);if ((((Context.getConfig().getBoolean("database.registerUnknown"))&&(__CLR4_5_26s6slwye3twb.R.iget(288)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(289)==0&false))) {{
                    __CLR4_5_26s6slwye3twb.R.inc(290);return addUnknownDevice(uniqueIds[0]);
                }

                }__CLR4_5_26s6slwye3twb.R.inc(291);StringBuilder message = new StringBuilder("Unknown device -");
                __CLR4_5_26s6slwye3twb.R.inc(292);for (String uniqueId : uniqueIds) {{
                    __CLR4_5_26s6slwye3twb.R.inc(293);message.append(" ").append(uniqueId);
                }
                }__CLR4_5_26s6slwye3twb.R.inc(294);if ((((remoteAddress != null)&&(__CLR4_5_26s6slwye3twb.R.iget(295)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(296)==0&false))) {{
                    __CLR4_5_26s6slwye3twb.R.inc(297);message.append(" (").append(((InetSocketAddress) remoteAddress).getHostString()).append(")");
                }
                }__CLR4_5_26s6slwye3twb.R.inc(298);Log.warning(message.toString());
            }
        }}
        }__CLR4_5_26s6slwye3twb.R.inc(299);return deviceId;
    }finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    public DeviceSession getDeviceSession(Channel channel, SocketAddress remoteAddress, String... uniqueIds) {try{__CLR4_5_26s6slwye3twb.R.inc(300);
        __CLR4_5_26s6slwye3twb.R.inc(301);if ((((channel != null && channel.getPipeline().get(HttpRequestDecoder.class) != null
                || Context.getConfig().getBoolean("decoder.ignoreSessionCache"))&&(__CLR4_5_26s6slwye3twb.R.iget(302)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(303)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(304);long deviceId = findDeviceId(remoteAddress, uniqueIds);
            __CLR4_5_26s6slwye3twb.R.inc(305);if ((((deviceId != 0)&&(__CLR4_5_26s6slwye3twb.R.iget(306)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(307)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(308);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_26s6slwye3twb.R.iget(309)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(310)==0&false))) {{
                    __CLR4_5_26s6slwye3twb.R.inc(311);Context.getConnectionManager().addActiveDevice(deviceId, protocol, channel, remoteAddress);
                }
                }__CLR4_5_26s6slwye3twb.R.inc(312);return new DeviceSession(deviceId);
            } }else {{
                __CLR4_5_26s6slwye3twb.R.inc(313);return null;
            }
        }}
        }__CLR4_5_26s6slwye3twb.R.inc(314);if ((((channel instanceof DatagramChannel)&&(__CLR4_5_26s6slwye3twb.R.iget(315)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(316)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(317);long deviceId = findDeviceId(remoteAddress, uniqueIds);
            __CLR4_5_26s6slwye3twb.R.inc(318);DeviceSession deviceSession = addressDeviceSessions.get(remoteAddress);
            __CLR4_5_26s6slwye3twb.R.inc(319);if ((((deviceSession != null && (deviceSession.getDeviceId() == deviceId || uniqueIds.length == 0))&&(__CLR4_5_26s6slwye3twb.R.iget(320)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(321)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(322);return deviceSession;
            } }else {__CLR4_5_26s6slwye3twb.R.inc(323);if ((((deviceId != 0)&&(__CLR4_5_26s6slwye3twb.R.iget(324)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(325)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(326);deviceSession = new DeviceSession(deviceId);
                __CLR4_5_26s6slwye3twb.R.inc(327);addressDeviceSessions.put(remoteAddress, deviceSession);
                __CLR4_5_26s6slwye3twb.R.inc(328);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_26s6slwye3twb.R.iget(329)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(330)==0&false))) {{
                    __CLR4_5_26s6slwye3twb.R.inc(331);Context.getConnectionManager().addActiveDevice(deviceId, protocol, channel, remoteAddress);
                }
                }__CLR4_5_26s6slwye3twb.R.inc(332);return deviceSession;
            } }else {{
                __CLR4_5_26s6slwye3twb.R.inc(333);return null;
            }
        }}} }else {{
            __CLR4_5_26s6slwye3twb.R.inc(334);if ((((channelDeviceSession == null)&&(__CLR4_5_26s6slwye3twb.R.iget(335)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(336)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(337);long deviceId = findDeviceId(remoteAddress, uniqueIds);
                __CLR4_5_26s6slwye3twb.R.inc(338);if ((((deviceId != 0)&&(__CLR4_5_26s6slwye3twb.R.iget(339)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(340)==0&false))) {{
                    __CLR4_5_26s6slwye3twb.R.inc(341);channelDeviceSession = new DeviceSession(deviceId);
                    __CLR4_5_26s6slwye3twb.R.inc(342);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_26s6slwye3twb.R.iget(343)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(344)==0&false))) {{
                        __CLR4_5_26s6slwye3twb.R.inc(345);Context.getConnectionManager().addActiveDevice(deviceId, protocol, channel, remoteAddress);
                    }
                }}
            }}
            }__CLR4_5_26s6slwye3twb.R.inc(346);return channelDeviceSession;
        }
    }}finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    public BaseProtocolDecoder(Protocol protocol) {try{__CLR4_5_26s6slwye3twb.R.inc(347);
        __CLR4_5_26s6slwye3twb.R.inc(348);this.protocol = protocol;
    }finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    public void getLastLocation(Position position, Date deviceTime) {try{__CLR4_5_26s6slwye3twb.R.inc(349);
        __CLR4_5_26s6slwye3twb.R.inc(350);if ((((position.getDeviceId() != 0)&&(__CLR4_5_26s6slwye3twb.R.iget(351)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(352)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(353);position.setOutdated(true);

            __CLR4_5_26s6slwye3twb.R.inc(354);Position last = Context.getIdentityManager().getLastPosition(position.getDeviceId());
            __CLR4_5_26s6slwye3twb.R.inc(355);if ((((last != null)&&(__CLR4_5_26s6slwye3twb.R.iget(356)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(357)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(358);position.setFixTime(last.getFixTime());
                __CLR4_5_26s6slwye3twb.R.inc(359);position.setValid(last.getValid());
                __CLR4_5_26s6slwye3twb.R.inc(360);position.setLatitude(last.getLatitude());
                __CLR4_5_26s6slwye3twb.R.inc(361);position.setLongitude(last.getLongitude());
                __CLR4_5_26s6slwye3twb.R.inc(362);position.setAltitude(last.getAltitude());
                __CLR4_5_26s6slwye3twb.R.inc(363);position.setSpeed(last.getSpeed());
                __CLR4_5_26s6slwye3twb.R.inc(364);position.setCourse(last.getCourse());
                __CLR4_5_26s6slwye3twb.R.inc(365);position.setAccuracy(last.getAccuracy());
            } }else {{
                __CLR4_5_26s6slwye3twb.R.inc(366);position.setFixTime(new Date(0));
            }

            }__CLR4_5_26s6slwye3twb.R.inc(367);if ((((deviceTime != null)&&(__CLR4_5_26s6slwye3twb.R.iget(368)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(369)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(370);position.setDeviceTime(deviceTime);
            } }else {{
                __CLR4_5_26s6slwye3twb.R.inc(371);position.setDeviceTime(new Date());
            }
        }}
    }}finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    @Override
    protected void onMessageEvent(
            Channel channel, SocketAddress remoteAddress, Object originalMessage, Object decodedMessage) {try{__CLR4_5_26s6slwye3twb.R.inc(372);
        __CLR4_5_26s6slwye3twb.R.inc(373);if ((((Context.getStatisticsManager() != null)&&(__CLR4_5_26s6slwye3twb.R.iget(374)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(375)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(376);Context.getStatisticsManager().registerMessageReceived();
        }
        }__CLR4_5_26s6slwye3twb.R.inc(377);Position position = null;
        __CLR4_5_26s6slwye3twb.R.inc(378);if ((((decodedMessage != null)&&(__CLR4_5_26s6slwye3twb.R.iget(379)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(380)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(381);if ((((decodedMessage instanceof Position)&&(__CLR4_5_26s6slwye3twb.R.iget(382)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(383)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(384);position = (Position) decodedMessage;
            } }else {__CLR4_5_26s6slwye3twb.R.inc(385);if ((((decodedMessage instanceof Collection)&&(__CLR4_5_26s6slwye3twb.R.iget(386)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(387)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(388);Collection positions = (Collection) decodedMessage;
                __CLR4_5_26s6slwye3twb.R.inc(389);if ((((!positions.isEmpty())&&(__CLR4_5_26s6slwye3twb.R.iget(390)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(391)==0&false))) {{
                    __CLR4_5_26s6slwye3twb.R.inc(392);position = (Position) positions.iterator().next();
                }
            }}
        }}}
        }__CLR4_5_26s6slwye3twb.R.inc(393);if ((((position != null)&&(__CLR4_5_26s6slwye3twb.R.iget(394)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(395)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(396);Context.getConnectionManager().updateDevice(
                    position.getDeviceId(), Device.STATUS_ONLINE, new Date());
        } }else {{
            __CLR4_5_26s6slwye3twb.R.inc(397);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_26s6slwye3twb.R.inc(398);if ((((deviceSession != null)&&(__CLR4_5_26s6slwye3twb.R.iget(399)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(400)==0&false))) {{
                __CLR4_5_26s6slwye3twb.R.inc(401);Context.getConnectionManager().updateDevice(
                        deviceSession.getDeviceId(), Device.STATUS_ONLINE, new Date());
            }
        }}
    }}finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

    @Override
    protected Object handleEmptyMessage(Channel channel, SocketAddress remoteAddress, Object msg) {try{__CLR4_5_26s6slwye3twb.R.inc(402);
        __CLR4_5_26s6slwye3twb.R.inc(403);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_26s6slwye3twb.R.inc(404);if ((((Context.getConfig().getBoolean("database.saveEmpty") && deviceSession != null)&&(__CLR4_5_26s6slwye3twb.R.iget(405)!=0|true))||(__CLR4_5_26s6slwye3twb.R.iget(406)==0&false))) {{
            __CLR4_5_26s6slwye3twb.R.inc(407);Position position = new Position();
            __CLR4_5_26s6slwye3twb.R.inc(408);position.setProtocol(getProtocolName());
            __CLR4_5_26s6slwye3twb.R.inc(409);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_26s6slwye3twb.R.inc(410);getLastLocation(position, null);
            __CLR4_5_26s6slwye3twb.R.inc(411);return position;
        } }else {{
            __CLR4_5_26s6slwye3twb.R.inc(412);return null;
        }
    }}finally{__CLR4_5_26s6slwye3twb.R.flushNeeded();}}

}
