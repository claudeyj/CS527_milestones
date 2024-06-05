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
import org.jboss.netty.channel.*;
import org.jboss.netty.handler.logging.LoggingHandler;
import org.jboss.netty.handler.timeout.IdleStateHandler;
import org.traccar.helper.Log;

public abstract class BasePipelineFactory implements ChannelPipelineFactory {public static class __CLR4_5_200lx1di2o4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,67,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final TrackerServer server;
    private FilterHandler filterHandler;
    private Integer resetDelay;
    private Boolean processInvalidPositions;

    protected class OpenChannelHandler extends SimpleChannelHandler {

        private final TrackerServer server;

        public OpenChannelHandler(TrackerServer server) {try{__CLR4_5_200lx1di2o4.R.inc(0);
            __CLR4_5_200lx1di2o4.R.inc(1);this.server = server;
        }finally{__CLR4_5_200lx1di2o4.R.flushNeeded();}}

        @Override
        public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {try{__CLR4_5_200lx1di2o4.R.inc(2);
            __CLR4_5_200lx1di2o4.R.inc(3);server.getChannelGroup().add(e.getChannel());
        }finally{__CLR4_5_200lx1di2o4.R.flushNeeded();}}
    }

    /**
     * Logging using global logger
     */
    protected class StandardLoggingHandler extends LoggingHandler {

        @Override
        public void log(ChannelEvent e) {try{__CLR4_5_200lx1di2o4.R.inc(4);
            __CLR4_5_200lx1di2o4.R.inc(5);if ((((e instanceof MessageEvent)&&(__CLR4_5_200lx1di2o4.R.iget(6)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(7)==0&false))) {{
                __CLR4_5_200lx1di2o4.R.inc(8);MessageEvent event = (MessageEvent) e;
                __CLR4_5_200lx1di2o4.R.inc(9);StringBuilder msg = new StringBuilder();

                __CLR4_5_200lx1di2o4.R.inc(10);msg.append("[").append(String.format("%08X", e.getChannel().getId())).append(": ");
                __CLR4_5_200lx1di2o4.R.inc(11);msg.append(((InetSocketAddress) e.getChannel().getLocalAddress()).getPort());
                __CLR4_5_200lx1di2o4.R.inc(12);msg.append(((((e instanceof DownstreamMessageEvent) )&&(__CLR4_5_200lx1di2o4.R.iget(13)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(14)==0&false))? " -> " : " <- ");

                __CLR4_5_200lx1di2o4.R.inc(15);msg.append(((InetSocketAddress) event.getRemoteAddress()).getAddress().getHostAddress()).append("]");

                // Append hex message
                __CLR4_5_200lx1di2o4.R.inc(16);if ((((event.getMessage() instanceof ChannelBuffer)&&(__CLR4_5_200lx1di2o4.R.iget(17)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(18)==0&false))) {{
                    __CLR4_5_200lx1di2o4.R.inc(19);msg.append(" - HEX: ");
                    __CLR4_5_200lx1di2o4.R.inc(20);msg.append(ChannelBuffers.hexDump((ChannelBuffer) event.getMessage()));
                }

                }__CLR4_5_200lx1di2o4.R.inc(21);Log.debug(msg.toString());
            } }else {__CLR4_5_200lx1di2o4.R.inc(22);if ((((e instanceof ExceptionEvent)&&(__CLR4_5_200lx1di2o4.R.iget(23)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(24)==0&false))) {{
                __CLR4_5_200lx1di2o4.R.inc(25);ExceptionEvent event = (ExceptionEvent) e;
                __CLR4_5_200lx1di2o4.R.inc(26);Log.warning(event.getCause());
            }
        }}}finally{__CLR4_5_200lx1di2o4.R.flushNeeded();}}

    }

    public BasePipelineFactory(TrackerServer server, String protocol) {try{__CLR4_5_200lx1di2o4.R.inc(27);
        __CLR4_5_200lx1di2o4.R.inc(28);this.server = server;

        __CLR4_5_200lx1di2o4.R.inc(29);String resetDelayProperty = Context.getProps().getProperty(protocol + ".resetDelay");
        __CLR4_5_200lx1di2o4.R.inc(30);if ((((resetDelayProperty != null)&&(__CLR4_5_200lx1di2o4.R.iget(31)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(32)==0&false))) {{
            __CLR4_5_200lx1di2o4.R.inc(33);resetDelay = Integer.valueOf(resetDelayProperty);
        }

        }__CLR4_5_200lx1di2o4.R.inc(34);String enableFilter = Context.getProps().getProperty("filter.enable");
        __CLR4_5_200lx1di2o4.R.inc(35);if ((((enableFilter != null && Boolean.valueOf(enableFilter))&&(__CLR4_5_200lx1di2o4.R.iget(36)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(37)==0&false))) {{
            __CLR4_5_200lx1di2o4.R.inc(38);filterHandler = new FilterHandler();
        }

        }__CLR4_5_200lx1di2o4.R.inc(39);if ((((Context.getReverseGeocoder() != null)&&(__CLR4_5_200lx1di2o4.R.iget(40)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(41)==0&false))) {{
            // Default behavior is to process invalid positions (i.e., the "null" case)
            __CLR4_5_200lx1di2o4.R.inc(42);String invalidPositions = Context.getProps().getProperty("geocode.processInvalidPositions");
            __CLR4_5_200lx1di2o4.R.inc(43);processInvalidPositions = (invalidPositions == null || Boolean.valueOf(invalidPositions));
        }
    }}finally{__CLR4_5_200lx1di2o4.R.flushNeeded();}}

    protected abstract void addSpecificHandlers(ChannelPipeline pipeline);

    @Override
    public ChannelPipeline getPipeline() {try{__CLR4_5_200lx1di2o4.R.inc(44);
        __CLR4_5_200lx1di2o4.R.inc(45);ChannelPipeline pipeline = Channels.pipeline();
        __CLR4_5_200lx1di2o4.R.inc(46);if ((((resetDelay != null)&&(__CLR4_5_200lx1di2o4.R.iget(47)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(48)==0&false))) {{
            __CLR4_5_200lx1di2o4.R.inc(49);pipeline.addLast("idleHandler", new IdleStateHandler(GlobalTimer.getTimer(), resetDelay, 0, 0));
        }
        }__CLR4_5_200lx1di2o4.R.inc(50);pipeline.addLast("openHandler", new OpenChannelHandler(server));
        __CLR4_5_200lx1di2o4.R.inc(51);if ((((Context.isLoggerEnabled())&&(__CLR4_5_200lx1di2o4.R.iget(52)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(53)==0&false))) {{
            __CLR4_5_200lx1di2o4.R.inc(54);pipeline.addLast("logger", new StandardLoggingHandler());
        }
        }__CLR4_5_200lx1di2o4.R.inc(55);addSpecificHandlers(pipeline);
        __CLR4_5_200lx1di2o4.R.inc(56);if ((((filterHandler != null)&&(__CLR4_5_200lx1di2o4.R.iget(57)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(58)==0&false))) {{
            __CLR4_5_200lx1di2o4.R.inc(59);pipeline.addLast("filter", filterHandler);
        }
        }__CLR4_5_200lx1di2o4.R.inc(60);if ((((Context.getReverseGeocoder() != null)&&(__CLR4_5_200lx1di2o4.R.iget(61)!=0|true))||(__CLR4_5_200lx1di2o4.R.iget(62)==0&false))) {{
            __CLR4_5_200lx1di2o4.R.inc(63);pipeline.addLast("geocoder", new ReverseGeocoderHandler(Context.getReverseGeocoder(), processInvalidPositions));
        }
        }__CLR4_5_200lx1di2o4.R.inc(64);pipeline.addLast("remoteAddress", new RemoteAddressHandler());
        __CLR4_5_200lx1di2o4.R.inc(65);pipeline.addLast("handler", new TrackerEventHandler());
        __CLR4_5_200lx1di2o4.R.inc(66);return pipeline;
    }finally{__CLR4_5_200lx1di2o4.R.flushNeeded();}}

}
