/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.jboss.netty.channel.*;
import org.jboss.netty.handler.codec.frame.FrameDecoder;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.traccar.helper.Log;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.List;

public class DetectorHandler extends SimpleChannelHandler {public static class __CLR4_5_27i7ilx1e7whm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,333,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final List<TrackerServer> serverList;
    
    private boolean showFailed;

    DetectorHandler(List<TrackerServer> serverList) {try{__CLR4_5_27i7ilx1e7whm.R.inc(270);
        __CLR4_5_27i7ilx1e7whm.R.inc(271);this.serverList = serverList;
    }finally{__CLR4_5_27i7ilx1e7whm.R.flushNeeded();}}

    public void checkPipeline(String protocol, ChannelPipeline pipeline, ChannelBuffer buf) throws Exception {try{__CLR4_5_27i7ilx1e7whm.R.inc(272);
        __CLR4_5_27i7ilx1e7whm.R.inc(273);Object tmp = buf.duplicate();

        // Frame decoder
        __CLR4_5_27i7ilx1e7whm.R.inc(274);FrameDecoder frameDecoder = (FrameDecoder) pipeline.get("frameDecoder");
        __CLR4_5_27i7ilx1e7whm.R.inc(275);if ((((frameDecoder != null)&&(__CLR4_5_27i7ilx1e7whm.R.iget(276)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(277)==0&false))) {{
            __CLR4_5_27i7ilx1e7whm.R.inc(278);try {
                __CLR4_5_27i7ilx1e7whm.R.inc(279);Method method = frameDecoder.getClass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, ChannelBuffer.class);
                __CLR4_5_27i7ilx1e7whm.R.inc(280);method.setAccessible(true);
                __CLR4_5_27i7ilx1e7whm.R.inc(281);tmp = method.invoke(frameDecoder, null, null, tmp);
            } catch (NoSuchMethodException error) {
                __CLR4_5_27i7ilx1e7whm.R.inc(282);Method method = frameDecoder.getClass().getSuperclass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, ChannelBuffer.class);
                __CLR4_5_27i7ilx1e7whm.R.inc(283);method.setAccessible(true);
                __CLR4_5_27i7ilx1e7whm.R.inc(284);tmp = method.invoke(frameDecoder, null, null, tmp);
            }
        }

        // String decoder
        }__CLR4_5_27i7ilx1e7whm.R.inc(285);if ((((pipeline.get("stringDecoder") != null)&&(__CLR4_5_27i7ilx1e7whm.R.iget(286)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(287)==0&false))) {{
            __CLR4_5_27i7ilx1e7whm.R.inc(288);StringDecoder stringDecoder = new StringDecoder();
            __CLR4_5_27i7ilx1e7whm.R.inc(289);if ((((tmp != null)&&(__CLR4_5_27i7ilx1e7whm.R.iget(290)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(291)==0&false))) {{
                __CLR4_5_27i7ilx1e7whm.R.inc(292);try {
                    __CLR4_5_27i7ilx1e7whm.R.inc(293);Method method = stringDecoder.getClass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, Object.class);
                    __CLR4_5_27i7ilx1e7whm.R.inc(294);method.setAccessible(true);
                    __CLR4_5_27i7ilx1e7whm.R.inc(295);tmp = method.invoke(stringDecoder, null, null, tmp);
                } catch (NoSuchMethodException error) {
                    __CLR4_5_27i7ilx1e7whm.R.inc(296);Method method = stringDecoder.getClass().getSuperclass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, Object.class);
                    __CLR4_5_27i7ilx1e7whm.R.inc(297);method.setAccessible(true);
                    __CLR4_5_27i7ilx1e7whm.R.inc(298);tmp = method.invoke(stringDecoder, null, null, tmp);
                }
            }
        }}

        // Protocol decoder
        }__CLR4_5_27i7ilx1e7whm.R.inc(299);BaseProtocolDecoder protocolDecoder = (BaseProtocolDecoder) pipeline.get("objectDecoder");
        __CLR4_5_27i7ilx1e7whm.R.inc(300);if ((((tmp != null)&&(__CLR4_5_27i7ilx1e7whm.R.iget(301)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(302)==0&false))) {{
            __CLR4_5_27i7ilx1e7whm.R.inc(303);try {
                __CLR4_5_27i7ilx1e7whm.R.inc(304);Method method = protocolDecoder.getClass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, SocketAddress.class, Object.class);
                __CLR4_5_27i7ilx1e7whm.R.inc(305);method.setAccessible(true);
                __CLR4_5_27i7ilx1e7whm.R.inc(306);tmp = method.invoke(protocolDecoder, null, null, null, tmp);
            } catch (NoSuchMethodException error) {
                __CLR4_5_27i7ilx1e7whm.R.inc(307);Method method = protocolDecoder.getClass().getSuperclass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, SocketAddress.class, Object.class);
                __CLR4_5_27i7ilx1e7whm.R.inc(308);method.setAccessible(true);
                __CLR4_5_27i7ilx1e7whm.R.inc(309);tmp = method.invoke(protocolDecoder, null, null, null, tmp);
            }
        }

        }__CLR4_5_27i7ilx1e7whm.R.inc(310);if ((((tmp != null)&&(__CLR4_5_27i7ilx1e7whm.R.iget(311)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(312)==0&false))) {{
            __CLR4_5_27i7ilx1e7whm.R.inc(313);Log.info("Protocol " + protocol + " possible match");
        } }else {__CLR4_5_27i7ilx1e7whm.R.inc(314);if ((((showFailed)&&(__CLR4_5_27i7ilx1e7whm.R.iget(315)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(316)==0&false))) {{
            __CLR4_5_27i7ilx1e7whm.R.inc(317);Log.info("Protocol " + protocol + " no match");
        }
    }}}finally{__CLR4_5_27i7ilx1e7whm.R.flushNeeded();}}

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {try{__CLR4_5_27i7ilx1e7whm.R.inc(318);

        __CLR4_5_27i7ilx1e7whm.R.inc(319);if ((((e.getMessage() instanceof ChannelBuffer)&&(__CLR4_5_27i7ilx1e7whm.R.iget(320)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(321)==0&false))) {{
            __CLR4_5_27i7ilx1e7whm.R.inc(322);ChannelBuffer buf = (ChannelBuffer) e.getMessage();

            __CLR4_5_27i7ilx1e7whm.R.inc(323);for (TrackerServer server : serverList) {{
                __CLR4_5_27i7ilx1e7whm.R.inc(324);try {
                    __CLR4_5_27i7ilx1e7whm.R.inc(325);if ((((!server.getProtocol().equals("detector"))&&(__CLR4_5_27i7ilx1e7whm.R.iget(326)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(327)==0&false))) {{
                        __CLR4_5_27i7ilx1e7whm.R.inc(328);checkPipeline(server.getProtocol(), server.getPipelineFactory().getPipeline(), buf);
                    }
                }} catch(Exception error) {
                    __CLR4_5_27i7ilx1e7whm.R.inc(329);if ((((showFailed)&&(__CLR4_5_27i7ilx1e7whm.R.iget(330)!=0|true))||(__CLR4_5_27i7ilx1e7whm.R.iget(331)==0&false))) {{
                        __CLR4_5_27i7ilx1e7whm.R.inc(332);Log.info("Protocol " + server.getProtocol() + " error");
                    }
                }}
            }
        }}
    }}finally{__CLR4_5_27i7ilx1e7whm.R.flushNeeded();}}

}
