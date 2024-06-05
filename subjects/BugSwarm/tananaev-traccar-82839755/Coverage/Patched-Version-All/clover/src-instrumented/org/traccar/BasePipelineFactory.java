/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.InetSocketAddress;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelEvent;
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
import org.traccar.helper.Log;

public abstract class BasePipelineFactory implements ChannelPipelineFactory {public static class __CLR4_5_266lx1e7w0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,78,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final TrackerServer server;
    private final int resetDelay;

    private FilterHandler filterHandler;
    private DistanceHandler distanceHandler;
    private ReverseGeocoderHandler reverseGeocoderHandler;

    protected class OpenChannelHandler extends SimpleChannelHandler {

        private final TrackerServer server;

        public OpenChannelHandler(TrackerServer server) {try{__CLR4_5_266lx1e7w0h.R.inc(6);
            __CLR4_5_266lx1e7w0h.R.inc(7);this.server = server;
        }finally{__CLR4_5_266lx1e7w0h.R.flushNeeded();}}

        @Override
        public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {try{__CLR4_5_266lx1e7w0h.R.inc(8);
            __CLR4_5_266lx1e7w0h.R.inc(9);server.getChannelGroup().add(e.getChannel());
        }finally{__CLR4_5_266lx1e7w0h.R.flushNeeded();}}
    }

    protected class StandardLoggingHandler extends LoggingHandler {

        @Override
        public void log(ChannelEvent e) {try{__CLR4_5_266lx1e7w0h.R.inc(10);
            __CLR4_5_266lx1e7w0h.R.inc(11);if ((((e instanceof MessageEvent)&&(__CLR4_5_266lx1e7w0h.R.iget(12)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(13)==0&false))) {{
                __CLR4_5_266lx1e7w0h.R.inc(14);MessageEvent event = (MessageEvent) e;
                __CLR4_5_266lx1e7w0h.R.inc(15);StringBuilder msg = new StringBuilder();

                __CLR4_5_266lx1e7w0h.R.inc(16);msg.append("[").append(String.format("%08X", e.getChannel().getId())).append(": ");
                __CLR4_5_266lx1e7w0h.R.inc(17);msg.append(((InetSocketAddress) e.getChannel().getLocalAddress()).getPort());
                __CLR4_5_266lx1e7w0h.R.inc(18);msg.append(((((e instanceof DownstreamMessageEvent) )&&(__CLR4_5_266lx1e7w0h.R.iget(19)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(20)==0&false))? " > " : " < ");

                __CLR4_5_266lx1e7w0h.R.inc(21);msg.append(((InetSocketAddress) event.getRemoteAddress()).getAddress().getHostAddress()).append("]");

                // Append hex message
                __CLR4_5_266lx1e7w0h.R.inc(22);if ((((event.getMessage() instanceof ChannelBuffer)&&(__CLR4_5_266lx1e7w0h.R.iget(23)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(24)==0&false))) {{
                    __CLR4_5_266lx1e7w0h.R.inc(25);msg.append(" HEX: ");
                    __CLR4_5_266lx1e7w0h.R.inc(26);msg.append(ChannelBuffers.hexDump((ChannelBuffer) event.getMessage()));
                }

                }__CLR4_5_266lx1e7w0h.R.inc(27);Log.debug(msg.toString());
            }
        }}finally{__CLR4_5_266lx1e7w0h.R.flushNeeded();}}

    }

    public BasePipelineFactory(TrackerServer server, String protocol) {try{__CLR4_5_266lx1e7w0h.R.inc(28);
        __CLR4_5_266lx1e7w0h.R.inc(29);this.server = server;
        
        __CLR4_5_266lx1e7w0h.R.inc(30);resetDelay = Context.getConfig().getInteger(protocol + ".resetDelay", 0);

        __CLR4_5_266lx1e7w0h.R.inc(31);if ((((Context.getConfig().getBoolean("filter.enable"))&&(__CLR4_5_266lx1e7w0h.R.iget(32)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(33)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(34);filterHandler = new FilterHandler();
        }
        
        }__CLR4_5_266lx1e7w0h.R.inc(35);if ((((Context.getReverseGeocoder() != null)&&(__CLR4_5_266lx1e7w0h.R.iget(36)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(37)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(38);reverseGeocoderHandler = new ReverseGeocoderHandler(
                    Context.getReverseGeocoder(), Context.getConfig().getBoolean("geocode.processInvalidPositions"));
        }

        }__CLR4_5_266lx1e7w0h.R.inc(39);if ((((Context.getConfig().getBoolean("distance.enable"))&&(__CLR4_5_266lx1e7w0h.R.iget(40)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(41)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(42);distanceHandler = new DistanceHandler();
        }
    }}finally{__CLR4_5_266lx1e7w0h.R.flushNeeded();}}

    protected abstract void addSpecificHandlers(ChannelPipeline pipeline);

    @Override
    public ChannelPipeline getPipeline() {try{__CLR4_5_266lx1e7w0h.R.inc(43);
        __CLR4_5_266lx1e7w0h.R.inc(44);ChannelPipeline pipeline = Channels.pipeline();
        __CLR4_5_266lx1e7w0h.R.inc(45);if ((((resetDelay != 0)&&(__CLR4_5_266lx1e7w0h.R.iget(46)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(47)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(48);pipeline.addLast("idleHandler", new IdleStateHandler(GlobalTimer.getTimer(), resetDelay, 0, 0));
        }
        }__CLR4_5_266lx1e7w0h.R.inc(49);pipeline.addLast("openHandler", new OpenChannelHandler(server));
        __CLR4_5_266lx1e7w0h.R.inc(50);if ((((Context.isLoggerEnabled())&&(__CLR4_5_266lx1e7w0h.R.iget(51)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(52)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(53);pipeline.addLast("logger", new StandardLoggingHandler());
        }
        }__CLR4_5_266lx1e7w0h.R.inc(54);addSpecificHandlers(pipeline);
        __CLR4_5_266lx1e7w0h.R.inc(55);if ((((filterHandler != null)&&(__CLR4_5_266lx1e7w0h.R.iget(56)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(57)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(58);pipeline.addLast("filter", filterHandler);
        }
        }__CLR4_5_266lx1e7w0h.R.inc(59);if ((((distanceHandler != null)&&(__CLR4_5_266lx1e7w0h.R.iget(60)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(61)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(62);pipeline.addLast("distance", distanceHandler);
        }
        }__CLR4_5_266lx1e7w0h.R.inc(63);if ((((reverseGeocoderHandler != null)&&(__CLR4_5_266lx1e7w0h.R.iget(64)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(65)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(66);pipeline.addLast("geocoder", reverseGeocoderHandler);
        }
        }__CLR4_5_266lx1e7w0h.R.inc(67);pipeline.addLast("remoteAddress", new RemoteAddressHandler());
        __CLR4_5_266lx1e7w0h.R.inc(68);if ((((Context.getDataManager() != null)&&(__CLR4_5_266lx1e7w0h.R.iget(69)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(70)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(71);pipeline.addLast("dataHandler", new DefaultDataHandler());
        }
        }__CLR4_5_266lx1e7w0h.R.inc(72);if ((((Context.getConfig().getBoolean("forward.enable"))&&(__CLR4_5_266lx1e7w0h.R.iget(73)!=0|true))||(__CLR4_5_266lx1e7w0h.R.iget(74)==0&false))) {{
            __CLR4_5_266lx1e7w0h.R.inc(75);pipeline.addLast("webHandler", new WebDataHandler(Context.getConfig().getString("forward.url")));
        }
        }__CLR4_5_266lx1e7w0h.R.inc(76);pipeline.addLast("mainHandler", new MainEventHandler());
        __CLR4_5_266lx1e7w0h.R.inc(77);return pipeline;
    }finally{__CLR4_5_266lx1e7w0h.R.flushNeeded();}}

}
