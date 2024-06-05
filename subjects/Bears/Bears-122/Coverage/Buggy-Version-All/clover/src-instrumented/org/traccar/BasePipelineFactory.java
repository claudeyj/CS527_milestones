/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.DownstreamMessageEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.handler.logging.LoggingHandler;
import org.jboss.netty.handler.timeout.IdleStateHandler;
import org.traccar.events.CommandResultEventHandler;
import org.traccar.events.DriverEventHandler;
import org.traccar.events.FuelDropEventHandler;
import org.traccar.events.GeofenceEventHandler;
import org.traccar.events.IgnitionEventHandler;
import org.traccar.events.MaintenanceEventHandler;
import org.traccar.events.MotionEventHandler;
import org.traccar.events.OverspeedEventHandler;
import org.traccar.events.AlertEventHandler;
import org.traccar.helper.Log;
import org.traccar.processing.ComputedAttributesHandler;
import org.traccar.processing.CopyAttributesHandler;

import java.net.InetSocketAddress;

public abstract class BasePipelineFactory implements ChannelPipelineFactory {public static class __CLR4_5_2ddlwydzgq9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final TrackerServer server;
    private int timeout;

    private FilterHandler filterHandler;
    private DistanceHandler distanceHandler;
    private MotionHandler motionHandler;
    private GeocoderHandler geocoderHandler;
    private GeolocationHandler geolocationHandler;
    private HemisphereHandler hemisphereHandler;
    private CopyAttributesHandler copyAttributesHandler;
    private ComputedAttributesHandler computedAttributesHandler;

    private CommandResultEventHandler commandResultEventHandler;
    private OverspeedEventHandler overspeedEventHandler;
    private FuelDropEventHandler fuelDropEventHandler;
    private MotionEventHandler motionEventHandler;
    private GeofenceEventHandler geofenceEventHandler;
    private AlertEventHandler alertEventHandler;
    private IgnitionEventHandler ignitionEventHandler;
    private MaintenanceEventHandler maintenanceEventHandler;
    private DriverEventHandler driverEventHandler;

    private static final class OpenChannelHandler extends SimpleChannelHandler {

        private final TrackerServer server;

        private OpenChannelHandler(TrackerServer server) {try{__CLR4_5_2ddlwydzgq9.R.inc(13);
            __CLR4_5_2ddlwydzgq9.R.inc(14);this.server = server;
        }finally{__CLR4_5_2ddlwydzgq9.R.flushNeeded();}}

        @Override
        public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {try{__CLR4_5_2ddlwydzgq9.R.inc(15);
            __CLR4_5_2ddlwydzgq9.R.inc(16);server.getChannelGroup().add(e.getChannel());
        }finally{__CLR4_5_2ddlwydzgq9.R.flushNeeded();}}
    }

    private static class StandardLoggingHandler extends LoggingHandler {

        @Override
        public void log(ChannelEvent e) {try{__CLR4_5_2ddlwydzgq9.R.inc(17);
            __CLR4_5_2ddlwydzgq9.R.inc(18);if ((((e instanceof MessageEvent)&&(__CLR4_5_2ddlwydzgq9.R.iget(19)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(20)==0&false))) {{
                __CLR4_5_2ddlwydzgq9.R.inc(21);MessageEvent event = (MessageEvent) e;
                __CLR4_5_2ddlwydzgq9.R.inc(22);StringBuilder msg = new StringBuilder();

                __CLR4_5_2ddlwydzgq9.R.inc(23);msg.append("[").append(String.format("%08X", e.getChannel().getId())).append(": ");
                __CLR4_5_2ddlwydzgq9.R.inc(24);msg.append(((InetSocketAddress) e.getChannel().getLocalAddress()).getPort());
                __CLR4_5_2ddlwydzgq9.R.inc(25);if ((((e instanceof DownstreamMessageEvent)&&(__CLR4_5_2ddlwydzgq9.R.iget(26)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(27)==0&false))) {{
                    __CLR4_5_2ddlwydzgq9.R.inc(28);msg.append(" > ");
                } }else {{
                    __CLR4_5_2ddlwydzgq9.R.inc(29);msg.append(" < ");
                }

                }__CLR4_5_2ddlwydzgq9.R.inc(30);if ((((event.getRemoteAddress() != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(31)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(32)==0&false))) {{
                    __CLR4_5_2ddlwydzgq9.R.inc(33);msg.append(((InetSocketAddress) event.getRemoteAddress()).getHostString());
                } }else {{
                    __CLR4_5_2ddlwydzgq9.R.inc(34);msg.append("null");
                }
                }__CLR4_5_2ddlwydzgq9.R.inc(35);msg.append("]");

                __CLR4_5_2ddlwydzgq9.R.inc(36);if ((((event.getMessage() instanceof ChannelBuffer)&&(__CLR4_5_2ddlwydzgq9.R.iget(37)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(38)==0&false))) {{
                    __CLR4_5_2ddlwydzgq9.R.inc(39);msg.append(" HEX: ");
                    __CLR4_5_2ddlwydzgq9.R.inc(40);msg.append(ChannelBuffers.hexDump((ChannelBuffer) event.getMessage()));
                }

                }__CLR4_5_2ddlwydzgq9.R.inc(41);Log.debug(msg.toString());
            }
        }}finally{__CLR4_5_2ddlwydzgq9.R.flushNeeded();}}

    }

    public BasePipelineFactory(TrackerServer server, String protocol) {try{__CLR4_5_2ddlwydzgq9.R.inc(42);
        __CLR4_5_2ddlwydzgq9.R.inc(43);this.server = server;

        __CLR4_5_2ddlwydzgq9.R.inc(44);timeout = Context.getConfig().getInteger(protocol + ".timeout");
        __CLR4_5_2ddlwydzgq9.R.inc(45);if ((((timeout == 0)&&(__CLR4_5_2ddlwydzgq9.R.iget(46)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(47)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(48);timeout = Context.getConfig().getInteger(protocol + ".resetDelay"); // temporary
            __CLR4_5_2ddlwydzgq9.R.inc(49);if ((((timeout == 0)&&(__CLR4_5_2ddlwydzgq9.R.iget(50)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(51)==0&false))) {{
                __CLR4_5_2ddlwydzgq9.R.inc(52);timeout = Context.getConfig().getInteger("server.timeout");
            }
        }}

        }__CLR4_5_2ddlwydzgq9.R.inc(53);distanceHandler = new DistanceHandler(
                Context.getConfig().getBoolean("coordinates.filter"),
                Context.getConfig().getInteger("coordinates.minError"),
                Context.getConfig().getInteger("coordinates.maxError"));

        __CLR4_5_2ddlwydzgq9.R.inc(54);if ((((Context.getConfig().getBoolean("filter.enable"))&&(__CLR4_5_2ddlwydzgq9.R.iget(55)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(56)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(57);filterHandler = new FilterHandler();
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(58);if ((((Context.getGeocoder() != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(59)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(60)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(61);geocoderHandler = new GeocoderHandler(
                    Context.getGeocoder(),
                    Context.getConfig().getBoolean("geocoder.processInvalidPositions"));
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(62);if ((((Context.getGeolocationProvider() != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(63)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(64)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(65);geolocationHandler = new GeolocationHandler(
                    Context.getGeolocationProvider(),
                    Context.getConfig().getBoolean("geolocation.processInvalidPositions"));
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(66);motionHandler = new MotionHandler(Context.getConfig().getDouble("event.motion.speedThreshold", 0.01));

        __CLR4_5_2ddlwydzgq9.R.inc(67);if ((((Context.getConfig().hasKey("location.latitudeHemisphere")
                || Context.getConfig().hasKey("location.longitudeHemisphere"))&&(__CLR4_5_2ddlwydzgq9.R.iget(68)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(69)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(70);hemisphereHandler = new HemisphereHandler();
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(71);if ((((Context.getConfig().getBoolean("processing.copyAttributes.enable"))&&(__CLR4_5_2ddlwydzgq9.R.iget(72)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(73)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(74);copyAttributesHandler = new CopyAttributesHandler();
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(75);if ((((Context.getConfig().getBoolean("processing.computedAttributes.enable"))&&(__CLR4_5_2ddlwydzgq9.R.iget(76)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(77)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(78);computedAttributesHandler = new ComputedAttributesHandler();
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(79);if ((((Context.getConfig().getBoolean("event.enable"))&&(__CLR4_5_2ddlwydzgq9.R.iget(80)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(81)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(82);commandResultEventHandler = new CommandResultEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(83);overspeedEventHandler = new OverspeedEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(84);fuelDropEventHandler = new FuelDropEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(85);motionEventHandler = new MotionEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(86);geofenceEventHandler = new GeofenceEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(87);alertEventHandler = new AlertEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(88);ignitionEventHandler = new IgnitionEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(89);maintenanceEventHandler = new MaintenanceEventHandler();
            __CLR4_5_2ddlwydzgq9.R.inc(90);driverEventHandler = new DriverEventHandler();
        }
    }}finally{__CLR4_5_2ddlwydzgq9.R.flushNeeded();}}

    protected abstract void addSpecificHandlers(ChannelPipeline pipeline);

    @Override
    public ChannelPipeline getPipeline() {try{__CLR4_5_2ddlwydzgq9.R.inc(91);
        __CLR4_5_2ddlwydzgq9.R.inc(92);ChannelPipeline pipeline = Channels.pipeline();
        __CLR4_5_2ddlwydzgq9.R.inc(93);if ((((timeout > 0 && !server.isConnectionless())&&(__CLR4_5_2ddlwydzgq9.R.iget(94)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(95)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(96);pipeline.addLast("idleHandler", new IdleStateHandler(GlobalTimer.getTimer(), timeout, 0, 0));
        }
        }__CLR4_5_2ddlwydzgq9.R.inc(97);pipeline.addLast("openHandler", new OpenChannelHandler(server));
        __CLR4_5_2ddlwydzgq9.R.inc(98);if ((((Context.isLoggerEnabled())&&(__CLR4_5_2ddlwydzgq9.R.iget(99)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(100)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(101);pipeline.addLast("logger", new StandardLoggingHandler());
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(102);addSpecificHandlers(pipeline);

        __CLR4_5_2ddlwydzgq9.R.inc(103);if ((((geolocationHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(104)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(105)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(106);pipeline.addLast("location", geolocationHandler);
        }
        }__CLR4_5_2ddlwydzgq9.R.inc(107);if ((((hemisphereHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(108)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(109)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(110);pipeline.addLast("hemisphere", hemisphereHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(111);if ((((distanceHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(112)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(113)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(114);pipeline.addLast("distance", distanceHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(115);pipeline.addLast("remoteAddress", new RemoteAddressHandler());

        __CLR4_5_2ddlwydzgq9.R.inc(116);addDynamicHandlers(pipeline);

        __CLR4_5_2ddlwydzgq9.R.inc(117);if ((((filterHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(118)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(119)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(120);pipeline.addLast("filter", filterHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(121);if ((((geocoderHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(122)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(123)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(124);pipeline.addLast("geocoder", geocoderHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(125);if ((((motionHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(126)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(127)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(128);pipeline.addLast("motion", motionHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(129);if ((((copyAttributesHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(130)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(131)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(132);pipeline.addLast("copyAttributes", copyAttributesHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(133);if ((((computedAttributesHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(134)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(135)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(136);pipeline.addLast("computedAttributes", computedAttributesHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(137);if ((((Context.getDataManager() != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(138)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(139)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(140);pipeline.addLast("dataHandler", new DefaultDataHandler());
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(141);if ((((Context.getConfig().getBoolean("forward.enable"))&&(__CLR4_5_2ddlwydzgq9.R.iget(142)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(143)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(144);pipeline.addLast("webHandler", new WebDataHandler(Context.getConfig().getString("forward.url")));
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(145);if ((((commandResultEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(146)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(147)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(148);pipeline.addLast("CommandResultEventHandler", commandResultEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(149);if ((((overspeedEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(150)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(151)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(152);pipeline.addLast("OverspeedEventHandler", overspeedEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(153);if ((((fuelDropEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(154)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(155)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(156);pipeline.addLast("FuelDropEventHandler", fuelDropEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(157);if ((((motionEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(158)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(159)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(160);pipeline.addLast("MotionEventHandler", motionEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(161);if ((((geofenceEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(162)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(163)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(164);pipeline.addLast("GeofenceEventHandler", geofenceEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(165);if ((((alertEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(166)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(167)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(168);pipeline.addLast("AlertEventHandler", alertEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(169);if ((((ignitionEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(170)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(171)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(172);pipeline.addLast("IgnitionEventHandler", ignitionEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(173);if ((((maintenanceEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(174)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(175)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(176);pipeline.addLast("MaintenanceEventHandler", maintenanceEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(177);if ((((driverEventHandler != null)&&(__CLR4_5_2ddlwydzgq9.R.iget(178)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(179)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(180);pipeline.addLast("DriverEventHandler", driverEventHandler);
        }

        }__CLR4_5_2ddlwydzgq9.R.inc(181);pipeline.addLast("mainHandler", new MainEventHandler());
        __CLR4_5_2ddlwydzgq9.R.inc(182);return pipeline;
    }finally{__CLR4_5_2ddlwydzgq9.R.flushNeeded();}}

    private void addDynamicHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2ddlwydzgq9.R.inc(183);
        __CLR4_5_2ddlwydzgq9.R.inc(184);if ((((Context.getConfig().hasKey("extra.handlers"))&&(__CLR4_5_2ddlwydzgq9.R.iget(185)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(186)==0&false))) {{
            __CLR4_5_2ddlwydzgq9.R.inc(187);String[] handlers = Context.getConfig().getString("extra.handlers").split(",");
            __CLR4_5_2ddlwydzgq9.R.inc(188);for (int i = 0; (((i < handlers.length)&&(__CLR4_5_2ddlwydzgq9.R.iget(189)!=0|true))||(__CLR4_5_2ddlwydzgq9.R.iget(190)==0&false)); i++) {{
                __CLR4_5_2ddlwydzgq9.R.inc(191);try {
                    __CLR4_5_2ddlwydzgq9.R.inc(192);pipeline.addLast("extraHandler." + i, (ChannelHandler) Class.forName(handlers[i]).newInstance());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException error) {
                    __CLR4_5_2ddlwydzgq9.R.inc(193);Log.warning(error);
                }
            }
        }}
    }}finally{__CLR4_5_2ddlwydzgq9.R.flushNeeded();}}
}
