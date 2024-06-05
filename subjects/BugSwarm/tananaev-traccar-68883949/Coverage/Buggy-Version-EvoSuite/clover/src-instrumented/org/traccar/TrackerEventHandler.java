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

import java.util.List;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.timeout.IdleStateAwareChannelHandler;
import org.jboss.netty.handler.timeout.IdleStateEvent;
import org.traccar.helper.Log;
import org.traccar.model.Position;

@ChannelHandler.Sharable
public class TrackerEventHandler extends IdleStateAwareChannelHandler {public static class __CLR4_5_2eeeelx1dgze6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void processSinglePosition(Position position) {try{__CLR4_5_2eeeelx1dgze6.R.inc(518);
        __CLR4_5_2eeeelx1dgze6.R.inc(519);if ((((position == null)&&(__CLR4_5_2eeeelx1dgze6.R.iget(520)!=0|true))||(__CLR4_5_2eeeelx1dgze6.R.iget(521)==0&false))) {{
            __CLR4_5_2eeeelx1dgze6.R.inc(522);Log.info("processSinglePosition null message");
        } }else {{
            __CLR4_5_2eeeelx1dgze6.R.inc(523);StringBuilder s = new StringBuilder();
            __CLR4_5_2eeeelx1dgze6.R.inc(524);s.append("device: ").append(position.getDeviceId()).append(", ");
            __CLR4_5_2eeeelx1dgze6.R.inc(525);s.append("time: ").append(position.getFixTime()).append(", ");
            __CLR4_5_2eeeelx1dgze6.R.inc(526);s.append("lat: ").append(position.getLatitude()).append(", ");
            __CLR4_5_2eeeelx1dgze6.R.inc(527);s.append("lon: ").append(position.getLongitude());
            __CLR4_5_2eeeelx1dgze6.R.inc(528);Log.info(s.toString());
        }

        }__CLR4_5_2eeeelx1dgze6.R.inc(529);try {
            __CLR4_5_2eeeelx1dgze6.R.inc(530);Context.getDataManager().addPosition(position);
        } catch (Exception error) {
            __CLR4_5_2eeeelx1dgze6.R.inc(531);Log.warning(error);
        }
    }finally{__CLR4_5_2eeeelx1dgze6.R.flushNeeded();}}

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {try{__CLR4_5_2eeeelx1dgze6.R.inc(532);
        __CLR4_5_2eeeelx1dgze6.R.inc(533);Long id = null;
        __CLR4_5_2eeeelx1dgze6.R.inc(534);Position lastPostition = null;
        __CLR4_5_2eeeelx1dgze6.R.inc(535);if ((((e.getMessage() instanceof Position)&&(__CLR4_5_2eeeelx1dgze6.R.iget(536)!=0|true))||(__CLR4_5_2eeeelx1dgze6.R.iget(537)==0&false))) {{
            __CLR4_5_2eeeelx1dgze6.R.inc(538);processSinglePosition((Position) e.getMessage());
            __CLR4_5_2eeeelx1dgze6.R.inc(539);lastPostition = (Position) e.getMessage();
        } }else {__CLR4_5_2eeeelx1dgze6.R.inc(540);if ((((e.getMessage() instanceof List)&&(__CLR4_5_2eeeelx1dgze6.R.iget(541)!=0|true))||(__CLR4_5_2eeeelx1dgze6.R.iget(542)==0&false))) {{
            __CLR4_5_2eeeelx1dgze6.R.inc(543);List<Position> positions = (List<Position>) e.getMessage();
            __CLR4_5_2eeeelx1dgze6.R.inc(544);for (Position position : positions) {{
                __CLR4_5_2eeeelx1dgze6.R.inc(545);processSinglePosition(position);
                __CLR4_5_2eeeelx1dgze6.R.inc(546);lastPostition = position;
            }
        }}
        }}__CLR4_5_2eeeelx1dgze6.R.inc(547);if ((((lastPostition != null)&&(__CLR4_5_2eeeelx1dgze6.R.iget(548)!=0|true))||(__CLR4_5_2eeeelx1dgze6.R.iget(549)==0&false))) {{
            __CLR4_5_2eeeelx1dgze6.R.inc(550);try {
                __CLR4_5_2eeeelx1dgze6.R.inc(551);Context.getDataManager().updateLatestPosition(lastPostition);
                __CLR4_5_2eeeelx1dgze6.R.inc(552);Context.getConnectionManager().update(lastPostition);
            } catch (Exception error) {
                __CLR4_5_2eeeelx1dgze6.R.inc(553);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_2eeeelx1dgze6.R.flushNeeded();}}

    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {try{__CLR4_5_2eeeelx1dgze6.R.inc(554);
        __CLR4_5_2eeeelx1dgze6.R.inc(555);Log.info("Closing connection by disconnect");
        __CLR4_5_2eeeelx1dgze6.R.inc(556);e.getChannel().close();
    }finally{__CLR4_5_2eeeelx1dgze6.R.flushNeeded();}}

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {try{__CLR4_5_2eeeelx1dgze6.R.inc(557);
        __CLR4_5_2eeeelx1dgze6.R.inc(558);Log.info("Closing connection by exception");
        __CLR4_5_2eeeelx1dgze6.R.inc(559);e.getChannel().close();
    }finally{__CLR4_5_2eeeelx1dgze6.R.flushNeeded();}}

    @Override
    public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) {try{__CLR4_5_2eeeelx1dgze6.R.inc(560);
        __CLR4_5_2eeeelx1dgze6.R.inc(561);Log.info("Closing connection by timeout");
        __CLR4_5_2eeeelx1dgze6.R.inc(562);e.getChannel().close();
    }finally{__CLR4_5_2eeeelx1dgze6.R.flushNeeded();}}

}
