/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.socket.DatagramChannel;
import org.jboss.netty.handler.timeout.IdleStateAwareChannelHandler;
import org.jboss.netty.handler.timeout.IdleStateEvent;
import org.traccar.helper.Log;
import org.traccar.model.Position;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainEventHandler extends IdleStateAwareChannelHandler {public static class __CLR4_5_2vnvnlwye3uki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,1192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Set<String> connectionlessProtocols = new HashSet<>();

    public MainEventHandler() {try{__CLR4_5_2vnvnlwye3uki.R.inc(1139);
        __CLR4_5_2vnvnlwye3uki.R.inc(1140);String connectionlessProtocolList = Context.getConfig().getString("status.ignoreOffline");
        __CLR4_5_2vnvnlwye3uki.R.inc(1141);if ((((connectionlessProtocolList != null)&&(__CLR4_5_2vnvnlwye3uki.R.iget(1142)!=0|true))||(__CLR4_5_2vnvnlwye3uki.R.iget(1143)==0&false))) {{
            __CLR4_5_2vnvnlwye3uki.R.inc(1144);connectionlessProtocols.addAll(Arrays.asList(connectionlessProtocolList.split(",")));
        }
    }}finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1145);

        __CLR4_5_2vnvnlwye3uki.R.inc(1146);if ((((e.getMessage() != null && e.getMessage() instanceof Position)&&(__CLR4_5_2vnvnlwye3uki.R.iget(1147)!=0|true))||(__CLR4_5_2vnvnlwye3uki.R.iget(1148)==0&false))) {{

            __CLR4_5_2vnvnlwye3uki.R.inc(1149);Position position = (Position) e.getMessage();
            __CLR4_5_2vnvnlwye3uki.R.inc(1150);try {
                __CLR4_5_2vnvnlwye3uki.R.inc(1151);Context.getDeviceManager().updateLatestPosition(position);
            } catch (SQLException error) {
                __CLR4_5_2vnvnlwye3uki.R.inc(1152);Log.warning(error);
            }

            __CLR4_5_2vnvnlwye3uki.R.inc(1153);String uniqueId = Context.getIdentityManager().getById(position.getDeviceId()).getUniqueId();

            // Log position
            __CLR4_5_2vnvnlwye3uki.R.inc(1154);StringBuilder s = new StringBuilder();
            __CLR4_5_2vnvnlwye3uki.R.inc(1155);s.append(formatChannel(e.getChannel())).append(" ");
            __CLR4_5_2vnvnlwye3uki.R.inc(1156);s.append("id: ").append(uniqueId).append(", ");
            __CLR4_5_2vnvnlwye3uki.R.inc(1157);s.append("time: ").append(
                    new SimpleDateFormat(Log.DATE_FORMAT).format(position.getFixTime())).append(", ");
            __CLR4_5_2vnvnlwye3uki.R.inc(1158);s.append("lat: ").append(String.format("%.5f", position.getLatitude())).append(", ");
            __CLR4_5_2vnvnlwye3uki.R.inc(1159);s.append("lon: ").append(String.format("%.5f", position.getLongitude())).append(", ");
            __CLR4_5_2vnvnlwye3uki.R.inc(1160);s.append("speed: ").append(String.format("%.1f", position.getSpeed())).append(", ");
            __CLR4_5_2vnvnlwye3uki.R.inc(1161);s.append("course: ").append(String.format("%.1f", position.getCourse()));
            __CLR4_5_2vnvnlwye3uki.R.inc(1162);Object cmdResult = position.getAttributes().get(Position.KEY_RESULT);
            __CLR4_5_2vnvnlwye3uki.R.inc(1163);if ((((cmdResult != null)&&(__CLR4_5_2vnvnlwye3uki.R.iget(1164)!=0|true))||(__CLR4_5_2vnvnlwye3uki.R.iget(1165)==0&false))) {{
                __CLR4_5_2vnvnlwye3uki.R.inc(1166);s.append(", result: ").append(cmdResult);
            }
            }__CLR4_5_2vnvnlwye3uki.R.inc(1167);Log.info(s.toString());

            __CLR4_5_2vnvnlwye3uki.R.inc(1168);Context.getStatisticsManager().registerMessageStored(position.getDeviceId());
        }
    }}finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    private static String formatChannel(Channel channel) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1169);
        __CLR4_5_2vnvnlwye3uki.R.inc(1170);return String.format("[%08X]", channel.getId());
    }finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1171);
        __CLR4_5_2vnvnlwye3uki.R.inc(1172);Log.info(formatChannel(e.getChannel()) + " connected");
    }finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1173);
        __CLR4_5_2vnvnlwye3uki.R.inc(1174);Log.info(formatChannel(e.getChannel()) + " disconnected");
        __CLR4_5_2vnvnlwye3uki.R.inc(1175);closeChannel(e.getChannel());

        __CLR4_5_2vnvnlwye3uki.R.inc(1176);BaseProtocolDecoder protocolDecoder = (BaseProtocolDecoder) ctx.getPipeline().get("objectDecoder");
        __CLR4_5_2vnvnlwye3uki.R.inc(1177);if ((((ctx.getPipeline().get("httpDecoder") == null
                && !connectionlessProtocols.contains(protocolDecoder.getProtocolName()))&&(__CLR4_5_2vnvnlwye3uki.R.iget(1178)!=0|true))||(__CLR4_5_2vnvnlwye3uki.R.iget(1179)==0&false))) {{
            __CLR4_5_2vnvnlwye3uki.R.inc(1180);Context.getConnectionManager().removeActiveDevice(e.getChannel());
        }
    }}finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1181);
        __CLR4_5_2vnvnlwye3uki.R.inc(1182);Log.warning(formatChannel(e.getChannel()) + " error", e.getCause());
        __CLR4_5_2vnvnlwye3uki.R.inc(1183);closeChannel(e.getChannel());
    }finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    @Override
    public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1184);
        __CLR4_5_2vnvnlwye3uki.R.inc(1185);Log.info(formatChannel(e.getChannel()) + " timed out");
        __CLR4_5_2vnvnlwye3uki.R.inc(1186);closeChannel(e.getChannel());
    }finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

    private void closeChannel(Channel channel) {try{__CLR4_5_2vnvnlwye3uki.R.inc(1187);
        __CLR4_5_2vnvnlwye3uki.R.inc(1188);if ((((!(channel instanceof DatagramChannel))&&(__CLR4_5_2vnvnlwye3uki.R.iget(1189)!=0|true))||(__CLR4_5_2vnvnlwye3uki.R.iget(1190)==0&false))) {{
            __CLR4_5_2vnvnlwye3uki.R.inc(1191);channel.close();
        }
    }}finally{__CLR4_5_2vnvnlwye3uki.R.flushNeeded();}}

}
