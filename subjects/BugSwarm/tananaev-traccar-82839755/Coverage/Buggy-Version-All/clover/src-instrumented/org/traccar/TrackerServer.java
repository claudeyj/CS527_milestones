/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.nio.ByteOrder;
import org.jboss.netty.bootstrap.Bootstrap;
import org.jboss.netty.bootstrap.ConnectionlessBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.channel.group.ChannelGroupFuture;
import org.jboss.netty.channel.group.DefaultChannelGroup;

/**
 * Tracker server
 */
public abstract class TrackerServer {public static class __CLR4_5_2hehelx1e4w3f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,684,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Bootstrap bootstrap;
    private final String protocol;

    public String getProtocol() {try{__CLR4_5_2hehelx1e4w3f.R.inc(626);
        __CLR4_5_2hehelx1e4w3f.R.inc(627);return protocol;
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    public TrackerServer(Bootstrap bootstrap, String protocol) {try{__CLR4_5_2hehelx1e4w3f.R.inc(628);
        __CLR4_5_2hehelx1e4w3f.R.inc(629);this.bootstrap = bootstrap;
        __CLR4_5_2hehelx1e4w3f.R.inc(630);this.protocol = protocol;

        // Set appropriate channel factory
        __CLR4_5_2hehelx1e4w3f.R.inc(631);if ((((bootstrap instanceof ServerBootstrap)&&(__CLR4_5_2hehelx1e4w3f.R.iget(632)!=0|true))||(__CLR4_5_2hehelx1e4w3f.R.iget(633)==0&false))) {{
            __CLR4_5_2hehelx1e4w3f.R.inc(634);bootstrap.setFactory(GlobalChannelFactory.getFactory());
        } }else {__CLR4_5_2hehelx1e4w3f.R.inc(635);if ((((bootstrap instanceof ConnectionlessBootstrap)&&(__CLR4_5_2hehelx1e4w3f.R.iget(636)!=0|true))||(__CLR4_5_2hehelx1e4w3f.R.iget(637)==0&false))) {{
            __CLR4_5_2hehelx1e4w3f.R.inc(638);bootstrap.setFactory(GlobalChannelFactory.getDatagramFactory());
        }

        }}__CLR4_5_2hehelx1e4w3f.R.inc(639);address = Context.getConfig().getString(protocol + ".address");
        __CLR4_5_2hehelx1e4w3f.R.inc(640);port = Context.getConfig().getInteger(protocol + ".port");

        __CLR4_5_2hehelx1e4w3f.R.inc(641);bootstrap.setPipelineFactory(new BasePipelineFactory(this, protocol) {
            @Override
            protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2hehelx1e4w3f.R.inc(642);
                __CLR4_5_2hehelx1e4w3f.R.inc(643);TrackerServer.this.addSpecificHandlers(pipeline);
            }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    protected abstract void addSpecificHandlers(ChannelPipeline pipeline);

    /**
     * Server port
     */
    private Integer port;

    public Integer getPort() {try{__CLR4_5_2hehelx1e4w3f.R.inc(644);
        __CLR4_5_2hehelx1e4w3f.R.inc(645);return port;
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    public void setPort(Integer port) {try{__CLR4_5_2hehelx1e4w3f.R.inc(646);
        __CLR4_5_2hehelx1e4w3f.R.inc(647);this.port = port;
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    /**
     * Server listening interface
     */
    private String address;

    public String getAddress() {try{__CLR4_5_2hehelx1e4w3f.R.inc(648);
        __CLR4_5_2hehelx1e4w3f.R.inc(649);return address;
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    public void setAddress(String address) {try{__CLR4_5_2hehelx1e4w3f.R.inc(650);
        __CLR4_5_2hehelx1e4w3f.R.inc(651);this.address = address;
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    /**
     * Set endianness
     */
    public void setEndianness(ByteOrder byteOrder) {try{__CLR4_5_2hehelx1e4w3f.R.inc(652);
        __CLR4_5_2hehelx1e4w3f.R.inc(653);bootstrap.setOption("bufferFactory", new HeapChannelBufferFactory(byteOrder));
        __CLR4_5_2hehelx1e4w3f.R.inc(654);bootstrap.setOption("child.bufferFactory", new HeapChannelBufferFactory(byteOrder));
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    /**
     * Opened channels
     */
    private final ChannelGroup allChannels = new DefaultChannelGroup();

    public ChannelGroup getChannelGroup() {try{__CLR4_5_2hehelx1e4w3f.R.inc(655);
        __CLR4_5_2hehelx1e4w3f.R.inc(656);return allChannels;
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    public void setPipelineFactory(ChannelPipelineFactory pipelineFactory) {try{__CLR4_5_2hehelx1e4w3f.R.inc(657);
        __CLR4_5_2hehelx1e4w3f.R.inc(658);bootstrap.setPipelineFactory(pipelineFactory);
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    public ChannelPipelineFactory getPipelineFactory() {try{__CLR4_5_2hehelx1e4w3f.R.inc(659);
        __CLR4_5_2hehelx1e4w3f.R.inc(660);return bootstrap.getPipelineFactory();
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    /**
     * Start server
     */
    public void start() {try{__CLR4_5_2hehelx1e4w3f.R.inc(661);
        __CLR4_5_2hehelx1e4w3f.R.inc(662);InetSocketAddress endpoint;
        __CLR4_5_2hehelx1e4w3f.R.inc(663);if ((((address == null)&&(__CLR4_5_2hehelx1e4w3f.R.iget(664)!=0|true))||(__CLR4_5_2hehelx1e4w3f.R.iget(665)==0&false))) {{
            __CLR4_5_2hehelx1e4w3f.R.inc(666);endpoint = new InetSocketAddress(port);
        } }else {{
            __CLR4_5_2hehelx1e4w3f.R.inc(667);endpoint = new InetSocketAddress(address, port);
        }

        }__CLR4_5_2hehelx1e4w3f.R.inc(668);Channel channel = null;
        __CLR4_5_2hehelx1e4w3f.R.inc(669);if ((((bootstrap instanceof ServerBootstrap)&&(__CLR4_5_2hehelx1e4w3f.R.iget(670)!=0|true))||(__CLR4_5_2hehelx1e4w3f.R.iget(671)==0&false))) {{
            __CLR4_5_2hehelx1e4w3f.R.inc(672);channel = ((ServerBootstrap) bootstrap).bind(endpoint);
        } }else {__CLR4_5_2hehelx1e4w3f.R.inc(673);if ((((bootstrap instanceof ConnectionlessBootstrap)&&(__CLR4_5_2hehelx1e4w3f.R.iget(674)!=0|true))||(__CLR4_5_2hehelx1e4w3f.R.iget(675)==0&false))) {{
            __CLR4_5_2hehelx1e4w3f.R.inc(676);channel = ((ConnectionlessBootstrap) bootstrap).bind(endpoint);
        }

        }}__CLR4_5_2hehelx1e4w3f.R.inc(677);if ((((channel != null)&&(__CLR4_5_2hehelx1e4w3f.R.iget(678)!=0|true))||(__CLR4_5_2hehelx1e4w3f.R.iget(679)==0&false))) {{
            __CLR4_5_2hehelx1e4w3f.R.inc(680);getChannelGroup().add(channel);
        }
    }}finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

    /**
     * Stop server
     */
    public void stop() {try{__CLR4_5_2hehelx1e4w3f.R.inc(681);
        __CLR4_5_2hehelx1e4w3f.R.inc(682);ChannelGroupFuture future = getChannelGroup().close();
        __CLR4_5_2hehelx1e4w3f.R.inc(683);future.awaitUninterruptibly();
    }finally{__CLR4_5_2hehelx1e4w3f.R.flushNeeded();}}

}
