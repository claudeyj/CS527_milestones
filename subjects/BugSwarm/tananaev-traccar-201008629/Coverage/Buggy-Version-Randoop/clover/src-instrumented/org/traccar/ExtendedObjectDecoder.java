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
package org.traccar;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelUpstreamHandler;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.traccar.model.Position;

import javax.xml.bind.DatatypeConverter;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

public abstract class ExtendedObjectDecoder implements ChannelUpstreamHandler {public static class __CLR4_5_2k9k9lx1dwdyl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,775,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void saveOriginal(Object decodedMessage, Object originalMessage) {try{__CLR4_5_2k9k9lx1dwdyl.R.inc(729);
        __CLR4_5_2k9k9lx1dwdyl.R.inc(730);if ((((Context.getConfig().getBoolean("database.saveOriginal") && decodedMessage instanceof Position)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(731)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(732)==0&false))) {{
            __CLR4_5_2k9k9lx1dwdyl.R.inc(733);Position position = (Position) decodedMessage;
            __CLR4_5_2k9k9lx1dwdyl.R.inc(734);if ((((originalMessage instanceof ChannelBuffer)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(735)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(736)==0&false))) {{
                __CLR4_5_2k9k9lx1dwdyl.R.inc(737);ChannelBuffer buf = (ChannelBuffer) originalMessage;
                __CLR4_5_2k9k9lx1dwdyl.R.inc(738);position.set(Position.KEY_ORIGINAL, ChannelBuffers.hexDump(buf, 0, buf.writerIndex()));
            } }else {__CLR4_5_2k9k9lx1dwdyl.R.inc(739);if ((((originalMessage instanceof String)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(740)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(741)==0&false))) {{
                __CLR4_5_2k9k9lx1dwdyl.R.inc(742);position.set(Position.KEY_ORIGINAL, DatatypeConverter.printHexBinary(
                                ((String) originalMessage).getBytes(StandardCharsets.US_ASCII)));
            }
        }}}
    }}finally{__CLR4_5_2k9k9lx1dwdyl.R.flushNeeded();}}

    @Override
    public void handleUpstream(
            ChannelHandlerContext ctx, ChannelEvent evt) throws Exception {try{__CLR4_5_2k9k9lx1dwdyl.R.inc(743);
        __CLR4_5_2k9k9lx1dwdyl.R.inc(744);if ((((!(evt instanceof MessageEvent))&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(745)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(746)==0&false))) {{
            __CLR4_5_2k9k9lx1dwdyl.R.inc(747);ctx.sendUpstream(evt);
            __CLR4_5_2k9k9lx1dwdyl.R.inc(748);return;
        }

        }__CLR4_5_2k9k9lx1dwdyl.R.inc(749);MessageEvent e = (MessageEvent) evt;
        __CLR4_5_2k9k9lx1dwdyl.R.inc(750);Object originalMessage = e.getMessage();
        __CLR4_5_2k9k9lx1dwdyl.R.inc(751);Object decodedMessage = decode(e.getChannel(), e.getRemoteAddress(), originalMessage);
        __CLR4_5_2k9k9lx1dwdyl.R.inc(752);onMessageEvent(e.getChannel(), e.getRemoteAddress(), originalMessage, decodedMessage);
        __CLR4_5_2k9k9lx1dwdyl.R.inc(753);if ((((originalMessage == decodedMessage)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(754)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(755)==0&false))) {{
            __CLR4_5_2k9k9lx1dwdyl.R.inc(756);ctx.sendUpstream(evt);
        } }else {{
            __CLR4_5_2k9k9lx1dwdyl.R.inc(757);if ((((decodedMessage == null)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(758)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(759)==0&false))) {{
                __CLR4_5_2k9k9lx1dwdyl.R.inc(760);decodedMessage = handleEmptyMessage(e.getChannel(), e.getRemoteAddress(), originalMessage);
            }
            }__CLR4_5_2k9k9lx1dwdyl.R.inc(761);if ((((decodedMessage != null)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(762)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(763)==0&false))) {{
                __CLR4_5_2k9k9lx1dwdyl.R.inc(764);if ((((decodedMessage instanceof Collection)&&(__CLR4_5_2k9k9lx1dwdyl.R.iget(765)!=0|true))||(__CLR4_5_2k9k9lx1dwdyl.R.iget(766)==0&false))) {{
                    __CLR4_5_2k9k9lx1dwdyl.R.inc(767);for (Object o : (Collection) decodedMessage) {{
                        __CLR4_5_2k9k9lx1dwdyl.R.inc(768);saveOriginal(o, originalMessage);
                        __CLR4_5_2k9k9lx1dwdyl.R.inc(769);Channels.fireMessageReceived(ctx, o, e.getRemoteAddress());
                    }
                }} }else {{
                    __CLR4_5_2k9k9lx1dwdyl.R.inc(770);saveOriginal(decodedMessage, originalMessage);
                    __CLR4_5_2k9k9lx1dwdyl.R.inc(771);Channels.fireMessageReceived(ctx, decodedMessage, e.getRemoteAddress());
                }
            }}
        }}
    }}finally{__CLR4_5_2k9k9lx1dwdyl.R.flushNeeded();}}

    protected void onMessageEvent(
            Channel channel, SocketAddress remoteAddress, Object originalMessage, Object decodedMessage) {try{__CLR4_5_2k9k9lx1dwdyl.R.inc(772);
    }finally{__CLR4_5_2k9k9lx1dwdyl.R.flushNeeded();}}

    protected Object handleEmptyMessage(Channel channel, SocketAddress remoteAddress, Object msg) {try{__CLR4_5_2k9k9lx1dwdyl.R.inc(773);
        __CLR4_5_2k9k9lx1dwdyl.R.inc(774);return null;
    }finally{__CLR4_5_2k9k9lx1dwdyl.R.flushNeeded();}}

    protected abstract Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception;

}
