/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.bootstrap.ConnectionlessBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.handler.codec.string.StringEncoder;
import org.traccar.BaseProtocol;
import org.traccar.TrackerServer;
import org.traccar.model.Command;

import java.nio.ByteOrder;
import java.util.List;

public class MeitrackProtocol extends BaseProtocol {public static class __CLR4_5_2cmvcmvlwye40ub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,16394,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeitrackProtocol() {
        super("meitrack");__CLR4_5_2cmvcmvlwye40ub.R.inc(16376);try{__CLR4_5_2cmvcmvlwye40ub.R.inc(16375);
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16377);setSupportedDataCommands(
                Command.TYPE_POSITION_SINGLE,
                Command.TYPE_ENGINE_STOP,
                Command.TYPE_ENGINE_RESUME,
                Command.TYPE_ALARM_ARM,
                Command.TYPE_ALARM_DISARM,
                Command.TYPE_REQUEST_PHOTO,
                Command.TYPE_SEND_SMS);
    }finally{__CLR4_5_2cmvcmvlwye40ub.R.flushNeeded();}}

    @Override
    public void initTrackerServers(List<TrackerServer> serverList) {try{__CLR4_5_2cmvcmvlwye40ub.R.inc(16378);
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16379);TrackerServer server = new TrackerServer(new ServerBootstrap(), getName()) {
            @Override
            protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2cmvcmvlwye40ub.R.inc(16380);
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16381);pipeline.addLast("frameDecoder", new MeitrackFrameDecoder());
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16382);pipeline.addLast("stringEncoder", new StringEncoder());
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16383);pipeline.addLast("objectEncoder", new MeitrackProtocolEncoder());
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16384);pipeline.addLast("objectDecoder", new MeitrackProtocolDecoder(MeitrackProtocol.this));
            }finally{__CLR4_5_2cmvcmvlwye40ub.R.flushNeeded();}}
        };
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16385);server.setEndianness(ByteOrder.LITTLE_ENDIAN);
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16386);serverList.add(server);
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16387);server = new TrackerServer(new ConnectionlessBootstrap(), getName()) {
            @Override
            protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2cmvcmvlwye40ub.R.inc(16388);
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16389);pipeline.addLast("stringEncoder", new StringEncoder());
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16390);pipeline.addLast("objectEncoder", new MeitrackProtocolEncoder());
                __CLR4_5_2cmvcmvlwye40ub.R.inc(16391);pipeline.addLast("objectDecoder", new MeitrackProtocolDecoder(MeitrackProtocol.this));
            }finally{__CLR4_5_2cmvcmvlwye40ub.R.flushNeeded();}}
        };
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16392);server.setEndianness(ByteOrder.LITTLE_ENDIAN);
        __CLR4_5_2cmvcmvlwye40ub.R.inc(16393);serverList.add(server);
    }finally{__CLR4_5_2cmvcmvlwye40ub.R.flushNeeded();}}

}
