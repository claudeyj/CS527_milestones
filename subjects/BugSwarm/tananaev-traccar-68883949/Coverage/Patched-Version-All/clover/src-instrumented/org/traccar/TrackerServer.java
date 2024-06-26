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
public abstract class TrackerServer {public static class __CLR4_5_2fofolx1dsjdn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Bootstrap bootstrap;
    private final String protocol;

    public String getProtocol() {try{__CLR4_5_2fofolx1dsjdn.R.inc(564);
        __CLR4_5_2fofolx1dsjdn.R.inc(565);return protocol;
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    public TrackerServer(Bootstrap bootstrap, String protocol) {try{__CLR4_5_2fofolx1dsjdn.R.inc(566);
        __CLR4_5_2fofolx1dsjdn.R.inc(567);this.bootstrap = bootstrap;
        __CLR4_5_2fofolx1dsjdn.R.inc(568);this.protocol = protocol;

        // Set appropriate channel factory
        __CLR4_5_2fofolx1dsjdn.R.inc(569);if ((((bootstrap instanceof ServerBootstrap)&&(__CLR4_5_2fofolx1dsjdn.R.iget(570)!=0|true))||(__CLR4_5_2fofolx1dsjdn.R.iget(571)==0&false))) {{
            __CLR4_5_2fofolx1dsjdn.R.inc(572);bootstrap.setFactory(GlobalChannelFactory.getFactory());
        } }else {__CLR4_5_2fofolx1dsjdn.R.inc(573);if ((((bootstrap instanceof ConnectionlessBootstrap)&&(__CLR4_5_2fofolx1dsjdn.R.iget(574)!=0|true))||(__CLR4_5_2fofolx1dsjdn.R.iget(575)==0&false))) {{
            __CLR4_5_2fofolx1dsjdn.R.inc(576);bootstrap.setFactory(GlobalChannelFactory.getDatagramFactory());
        }

        }}__CLR4_5_2fofolx1dsjdn.R.inc(577);address = Context.getProps().getProperty(protocol + ".address");
        __CLR4_5_2fofolx1dsjdn.R.inc(578);String portProperty = Context.getProps().getProperty(protocol + ".port");
        __CLR4_5_2fofolx1dsjdn.R.inc(579);port = Integer.valueOf(portProperty);

        __CLR4_5_2fofolx1dsjdn.R.inc(580);bootstrap.setPipelineFactory(new BasePipelineFactory(this, protocol) {
            @Override
            protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2fofolx1dsjdn.R.inc(581);
                __CLR4_5_2fofolx1dsjdn.R.inc(582);TrackerServer.this.addSpecificHandlers(pipeline);
            }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    protected abstract void addSpecificHandlers(ChannelPipeline pipeline);

    /**
     * Server port
     */
    private Integer port;

    public Integer getPort() {try{__CLR4_5_2fofolx1dsjdn.R.inc(583);
        __CLR4_5_2fofolx1dsjdn.R.inc(584);return port;
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    public void setPort(Integer port) {try{__CLR4_5_2fofolx1dsjdn.R.inc(585);
        __CLR4_5_2fofolx1dsjdn.R.inc(586);this.port = port;
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    /**
     * Server listening interface
     */
    private String address;

    public String getAddress() {try{__CLR4_5_2fofolx1dsjdn.R.inc(587);
        __CLR4_5_2fofolx1dsjdn.R.inc(588);return address;
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    public void setAddress(String address) {try{__CLR4_5_2fofolx1dsjdn.R.inc(589);
        __CLR4_5_2fofolx1dsjdn.R.inc(590);this.address = address;
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    /**
     * Set endianness
     */
    public void setEndianness(ByteOrder byteOrder) {try{__CLR4_5_2fofolx1dsjdn.R.inc(591);
        __CLR4_5_2fofolx1dsjdn.R.inc(592);bootstrap.setOption("bufferFactory", new HeapChannelBufferFactory(byteOrder));
        __CLR4_5_2fofolx1dsjdn.R.inc(593);bootstrap.setOption("child.bufferFactory", new HeapChannelBufferFactory(byteOrder));
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    /**
     * Opened channels
     */
    private final ChannelGroup allChannels = new DefaultChannelGroup();

    public ChannelGroup getChannelGroup() {try{__CLR4_5_2fofolx1dsjdn.R.inc(594);
        __CLR4_5_2fofolx1dsjdn.R.inc(595);return allChannels;
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    public void setPipelineFactory(ChannelPipelineFactory pipelineFactory) {try{__CLR4_5_2fofolx1dsjdn.R.inc(596);
        __CLR4_5_2fofolx1dsjdn.R.inc(597);bootstrap.setPipelineFactory(pipelineFactory);
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    public ChannelPipelineFactory getPipelineFactory() {try{__CLR4_5_2fofolx1dsjdn.R.inc(598);
        __CLR4_5_2fofolx1dsjdn.R.inc(599);return bootstrap.getPipelineFactory();
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    /**
     * Start server
     */
    public void start() {try{__CLR4_5_2fofolx1dsjdn.R.inc(600);
        __CLR4_5_2fofolx1dsjdn.R.inc(601);InetSocketAddress endpoint;
        __CLR4_5_2fofolx1dsjdn.R.inc(602);if ((((address == null)&&(__CLR4_5_2fofolx1dsjdn.R.iget(603)!=0|true))||(__CLR4_5_2fofolx1dsjdn.R.iget(604)==0&false))) {{
            __CLR4_5_2fofolx1dsjdn.R.inc(605);endpoint = new InetSocketAddress(port);
        } }else {{
            __CLR4_5_2fofolx1dsjdn.R.inc(606);endpoint = new InetSocketAddress(address, port);
        }

        }__CLR4_5_2fofolx1dsjdn.R.inc(607);Channel channel = null;
        __CLR4_5_2fofolx1dsjdn.R.inc(608);if ((((bootstrap instanceof ServerBootstrap)&&(__CLR4_5_2fofolx1dsjdn.R.iget(609)!=0|true))||(__CLR4_5_2fofolx1dsjdn.R.iget(610)==0&false))) {{
            __CLR4_5_2fofolx1dsjdn.R.inc(611);channel = ((ServerBootstrap) bootstrap).bind(endpoint);
        } }else {__CLR4_5_2fofolx1dsjdn.R.inc(612);if ((((bootstrap instanceof ConnectionlessBootstrap)&&(__CLR4_5_2fofolx1dsjdn.R.iget(613)!=0|true))||(__CLR4_5_2fofolx1dsjdn.R.iget(614)==0&false))) {{
            __CLR4_5_2fofolx1dsjdn.R.inc(615);channel = ((ConnectionlessBootstrap) bootstrap).bind(endpoint);
        }

        }}__CLR4_5_2fofolx1dsjdn.R.inc(616);if ((((channel != null)&&(__CLR4_5_2fofolx1dsjdn.R.iget(617)!=0|true))||(__CLR4_5_2fofolx1dsjdn.R.iget(618)==0&false))) {{
            __CLR4_5_2fofolx1dsjdn.R.inc(619);getChannelGroup().add(channel);
        }
    }}finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

    /**
     * Stop server
     */
    public void stop() {try{__CLR4_5_2fofolx1dsjdn.R.inc(620);
        __CLR4_5_2fofolx1dsjdn.R.inc(621);ChannelGroupFuture future = getChannelGroup().close();
        __CLR4_5_2fofolx1dsjdn.R.inc(622);future.awaitUninterruptibly();
    }finally{__CLR4_5_2fofolx1dsjdn.R.flushNeeded();}}

}
