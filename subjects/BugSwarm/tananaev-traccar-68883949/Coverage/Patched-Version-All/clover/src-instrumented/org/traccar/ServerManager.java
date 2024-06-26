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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.jboss.netty.bootstrap.ConnectionlessBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;

public class ServerManager {public static class __CLR4_5_2d7d7lx1dsjcm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final List<TrackerServer> serverList = new LinkedList<TrackerServer>();

    public void init() throws Exception {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(475);

        __CLR4_5_2d7d7lx1dsjcm.R.inc(476);ClassLoader cl = ServerManager.class.getClassLoader();
        __CLR4_5_2d7d7lx1dsjcm.R.inc(477);String pack = "org/traccar/protocol";
        __CLR4_5_2d7d7lx1dsjcm.R.inc(478);String dottedPackage = pack.replaceAll("[/]", ".");

        __CLR4_5_2d7d7lx1dsjcm.R.inc(479);BufferedReader reader = new BufferedReader(new InputStreamReader(cl.getResourceAsStream(pack)));
        __CLR4_5_2d7d7lx1dsjcm.R.inc(480);String line = null;
        __CLR4_5_2d7d7lx1dsjcm.R.inc(481);while ((line = reader.readLine()) != null) {{
            __CLR4_5_2d7d7lx1dsjcm.R.inc(484);if ((((line.endsWith(".class"))&&(__CLR4_5_2d7d7lx1dsjcm.R.iget(485)!=0|true))||(__CLR4_5_2d7d7lx1dsjcm.R.iget(486)==0&false))) {{
                __CLR4_5_2d7d7lx1dsjcm.R.inc(487);Class protocolClass = Class.forName(dottedPackage + "." + line.substring(0, line.lastIndexOf('.')));
                __CLR4_5_2d7d7lx1dsjcm.R.inc(488);if ((((BaseProtocol.class.isAssignableFrom(protocolClass))&&(__CLR4_5_2d7d7lx1dsjcm.R.iget(489)!=0|true))||(__CLR4_5_2d7d7lx1dsjcm.R.iget(490)==0&false))) {{
                    __CLR4_5_2d7d7lx1dsjcm.R.inc(491);initProtocolServer((BaseProtocol) protocolClass.newInstance());
                }
            }}
        }}

        }__CLR4_5_2d7d7lx1dsjcm.R.inc(492);initProtocolDetector();
    }finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}

    public void start() {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(493);
        __CLR4_5_2d7d7lx1dsjcm.R.inc(494);for (Object server: serverList) {{
            __CLR4_5_2d7d7lx1dsjcm.R.inc(495);((TrackerServer) server).start();
        }
    }}finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(496);
        __CLR4_5_2d7d7lx1dsjcm.R.inc(497);for (Object server: serverList) {{
            __CLR4_5_2d7d7lx1dsjcm.R.inc(498);((TrackerServer) server).stop();
        }

        // Release resources
        }__CLR4_5_2d7d7lx1dsjcm.R.inc(499);GlobalChannelFactory.release();
        __CLR4_5_2d7d7lx1dsjcm.R.inc(500);GlobalTimer.release();
    }finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}

    private boolean isProtocolEnabled(String protocol) {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(501);
        __CLR4_5_2d7d7lx1dsjcm.R.inc(502);return Context.getProps().containsKey(protocol + ".port");
    }finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}

    private void initProtocolDetector() throws SQLException {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(503);
        __CLR4_5_2d7d7lx1dsjcm.R.inc(504);String protocol = "detector";
        __CLR4_5_2d7d7lx1dsjcm.R.inc(505);if ((((isProtocolEnabled(protocol))&&(__CLR4_5_2d7d7lx1dsjcm.R.iget(506)!=0|true))||(__CLR4_5_2d7d7lx1dsjcm.R.iget(507)==0&false))) {{
            __CLR4_5_2d7d7lx1dsjcm.R.inc(508);serverList.add(new TrackerServer(new ServerBootstrap(), protocol) {
                @Override
                protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(509);
                    __CLR4_5_2d7d7lx1dsjcm.R.inc(510);pipeline.addLast("detectorHandler", new DetectorHandler(serverList));
                }finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}
            });
            __CLR4_5_2d7d7lx1dsjcm.R.inc(511);serverList.add(new TrackerServer(new ConnectionlessBootstrap(), protocol) {
                @Override
                protected void addSpecificHandlers(ChannelPipeline pipeline) {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(512);
                    __CLR4_5_2d7d7lx1dsjcm.R.inc(513);pipeline.addLast("detectorHandler", new DetectorHandler(serverList));
                }finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}
            });
        }
    }}finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}

    private void initProtocolServer(final Protocol protocol) throws SQLException {try{__CLR4_5_2d7d7lx1dsjcm.R.inc(514);
        __CLR4_5_2d7d7lx1dsjcm.R.inc(515);if ((((isProtocolEnabled(protocol.getName()))&&(__CLR4_5_2d7d7lx1dsjcm.R.iget(516)!=0|true))||(__CLR4_5_2d7d7lx1dsjcm.R.iget(517)==0&false))) {{
            __CLR4_5_2d7d7lx1dsjcm.R.inc(518);protocol.initTrackerServers(serverList);
        }
    }}finally{__CLR4_5_2d7d7lx1dsjcm.R.flushNeeded();}}

}
