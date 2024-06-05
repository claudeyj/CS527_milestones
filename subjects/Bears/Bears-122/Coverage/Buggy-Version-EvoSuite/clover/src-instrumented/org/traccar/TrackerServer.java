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

import java.net.InetSocketAddress;
import java.nio.ByteOrder;

public abstract class TrackerServer {public static class __CLR4_5_2zgzglwydw8h5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,1336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Bootstrap bootstrap;
    private final String protocol;

    public boolean isConnectionless() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1276);
        __CLR4_5_2zgzglwydw8h5.R.inc(1277);return bootstrap instanceof ConnectionlessBootstrap;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public String getProtocol() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1278);
        __CLR4_5_2zgzglwydw8h5.R.inc(1279);return protocol;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public TrackerServer(Bootstrap bootstrap, String protocol) {try{__CLR4_5_2zgzglwydw8h5.R.inc(1280);
        __CLR4_5_2zgzglwydw8h5.R.inc(1281);this.bootstrap = bootstrap;
        __CLR4_5_2zgzglwydw8h5.R.inc(1282);this.protocol = protocol;

        __CLR4_5_2zgzglwydw8h5.R.inc(1283);if ((((bootstrap instanceof ServerBootstrap)&&(__CLR4_5_2zgzglwydw8h5.R.iget(1284)!=0|true))||(__CLR4_5_2zgzglwydw8h5.R.iget(1285)==0&false))) {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1286);bootstrap.setFactory(GlobalChannelFactory.getFactory());
        } }else {__CLR4_5_2zgzglwydw8h5.R.inc(1287);if ((((bootstrap instanceof ConnectionlessBootstrap)&&(__CLR4_5_2zgzglwydw8h5.R.iget(1288)!=0|true))||(__CLR4_5_2zgzglwydw8h5.R.iget(1289)==0&false))) {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1290);bootstrap.setFactory(GlobalChannelFactory.getDatagramFactory());
        }

        }}__CLR4_5_2zgzglwydw8h5.R.inc(1291);address = Context.getConfig().getString(protocol + ".address");
        __CLR4_5_2zgzglwydw8h5.R.inc(1292);port = Context.getConfig().getInteger(protocol + ".port");

        __CLR4_5_2zgzglwydw8h5.R.inc(1293);bootstrap.setPipelineFactory(new BasePipelineFactory(this, protocol) {
            @Override
            protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2zgzglwydw8h5.R.inc(1294);
                __CLR4_5_2zgzglwydw8h5.R.inc(1295);TrackerServer.this.addSpecificHandlers(pipeline);
            }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    protected abstract void addSpecificHandlers(ChannelPipeline pipeline);

    private int port;

    public int getPort() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1296);
        __CLR4_5_2zgzglwydw8h5.R.inc(1297);return port;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public void setPort(int port) {try{__CLR4_5_2zgzglwydw8h5.R.inc(1298);
        __CLR4_5_2zgzglwydw8h5.R.inc(1299);this.port = port;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    private String address;

    public String getAddress() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1300);
        __CLR4_5_2zgzglwydw8h5.R.inc(1301);return address;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public void setAddress(String address) {try{__CLR4_5_2zgzglwydw8h5.R.inc(1302);
        __CLR4_5_2zgzglwydw8h5.R.inc(1303);this.address = address;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public void setEndianness(ByteOrder byteOrder) {try{__CLR4_5_2zgzglwydw8h5.R.inc(1304);
        __CLR4_5_2zgzglwydw8h5.R.inc(1305);bootstrap.setOption("bufferFactory", new HeapChannelBufferFactory(byteOrder));
        __CLR4_5_2zgzglwydw8h5.R.inc(1306);bootstrap.setOption("child.bufferFactory", new HeapChannelBufferFactory(byteOrder));
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    private final ChannelGroup allChannels = new DefaultChannelGroup();

    public ChannelGroup getChannelGroup() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1307);
        __CLR4_5_2zgzglwydw8h5.R.inc(1308);return allChannels;
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public void setPipelineFactory(ChannelPipelineFactory pipelineFactory) {try{__CLR4_5_2zgzglwydw8h5.R.inc(1309);
        __CLR4_5_2zgzglwydw8h5.R.inc(1310);bootstrap.setPipelineFactory(pipelineFactory);
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public ChannelPipelineFactory getPipelineFactory() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1311);
        __CLR4_5_2zgzglwydw8h5.R.inc(1312);return bootstrap.getPipelineFactory();
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public void start() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1313);
        __CLR4_5_2zgzglwydw8h5.R.inc(1314);InetSocketAddress endpoint;
        __CLR4_5_2zgzglwydw8h5.R.inc(1315);if ((((address == null)&&(__CLR4_5_2zgzglwydw8h5.R.iget(1316)!=0|true))||(__CLR4_5_2zgzglwydw8h5.R.iget(1317)==0&false))) {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1318);endpoint = new InetSocketAddress(port);
        } }else {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1319);endpoint = new InetSocketAddress(address, port);
        }

        }__CLR4_5_2zgzglwydw8h5.R.inc(1320);Channel channel = null;
        __CLR4_5_2zgzglwydw8h5.R.inc(1321);if ((((bootstrap instanceof ServerBootstrap)&&(__CLR4_5_2zgzglwydw8h5.R.iget(1322)!=0|true))||(__CLR4_5_2zgzglwydw8h5.R.iget(1323)==0&false))) {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1324);channel = ((ServerBootstrap) bootstrap).bind(endpoint);
        } }else {__CLR4_5_2zgzglwydw8h5.R.inc(1325);if ((((bootstrap instanceof ConnectionlessBootstrap)&&(__CLR4_5_2zgzglwydw8h5.R.iget(1326)!=0|true))||(__CLR4_5_2zgzglwydw8h5.R.iget(1327)==0&false))) {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1328);channel = ((ConnectionlessBootstrap) bootstrap).bind(endpoint);
        }

        }}__CLR4_5_2zgzglwydw8h5.R.inc(1329);if ((((channel != null)&&(__CLR4_5_2zgzglwydw8h5.R.iget(1330)!=0|true))||(__CLR4_5_2zgzglwydw8h5.R.iget(1331)==0&false))) {{
            __CLR4_5_2zgzglwydw8h5.R.inc(1332);getChannelGroup().add(channel);
        }
    }}finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_2zgzglwydw8h5.R.inc(1333);
        __CLR4_5_2zgzglwydw8h5.R.inc(1334);ChannelGroupFuture future = getChannelGroup().close();
        __CLR4_5_2zgzglwydw8h5.R.inc(1335);future.awaitUninterruptibly();
    }finally{__CLR4_5_2zgzglwydw8h5.R.flushNeeded();}}

}
