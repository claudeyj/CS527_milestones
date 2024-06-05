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

public class DetectorHandler extends SimpleChannelHandler {public static class __CLR4_5_25b5blx1di36y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private List<TrackerServer> serverList;
    
    private boolean showFailed;

    DetectorHandler(List<TrackerServer> serverList) {try{__CLR4_5_25b5blx1di36y.R.inc(191);
        __CLR4_5_25b5blx1di36y.R.inc(192);this.serverList = serverList;
    }finally{__CLR4_5_25b5blx1di36y.R.flushNeeded();}}

    public void checkPipeline(String protocol, ChannelPipeline pipeline, ChannelBuffer buf) throws Exception {try{__CLR4_5_25b5blx1di36y.R.inc(193);
        __CLR4_5_25b5blx1di36y.R.inc(194);Object tmp = buf.duplicate();

        // Frame decoder
        __CLR4_5_25b5blx1di36y.R.inc(195);FrameDecoder frameDecoder = (FrameDecoder) pipeline.get("frameDecoder");
        __CLR4_5_25b5blx1di36y.R.inc(196);if ((((frameDecoder != null)&&(__CLR4_5_25b5blx1di36y.R.iget(197)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(198)==0&false))) {{
            __CLR4_5_25b5blx1di36y.R.inc(199);try {
                __CLR4_5_25b5blx1di36y.R.inc(200);Method method = frameDecoder.getClass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, ChannelBuffer.class);
                __CLR4_5_25b5blx1di36y.R.inc(201);method.setAccessible(true);
                __CLR4_5_25b5blx1di36y.R.inc(202);tmp = method.invoke(frameDecoder, null, null, tmp);
            } catch (NoSuchMethodException error) {
                __CLR4_5_25b5blx1di36y.R.inc(203);Method method = frameDecoder.getClass().getSuperclass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, ChannelBuffer.class);
                __CLR4_5_25b5blx1di36y.R.inc(204);method.setAccessible(true);
                __CLR4_5_25b5blx1di36y.R.inc(205);tmp = method.invoke(frameDecoder, null, null, tmp);
            }
        }

        // String decoder
        }__CLR4_5_25b5blx1di36y.R.inc(206);if ((((pipeline.get("stringDecoder") != null)&&(__CLR4_5_25b5blx1di36y.R.iget(207)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(208)==0&false))) {{
            __CLR4_5_25b5blx1di36y.R.inc(209);StringDecoder stringDecoder = new StringDecoder();
            __CLR4_5_25b5blx1di36y.R.inc(210);if ((((tmp != null)&&(__CLR4_5_25b5blx1di36y.R.iget(211)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(212)==0&false))) {{
                __CLR4_5_25b5blx1di36y.R.inc(213);try {
                    __CLR4_5_25b5blx1di36y.R.inc(214);Method method = stringDecoder.getClass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, Object.class);
                    __CLR4_5_25b5blx1di36y.R.inc(215);method.setAccessible(true);
                    __CLR4_5_25b5blx1di36y.R.inc(216);tmp = method.invoke(stringDecoder, null, null, tmp);
                } catch (NoSuchMethodException error) {
                    __CLR4_5_25b5blx1di36y.R.inc(217);Method method = stringDecoder.getClass().getSuperclass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, Object.class);
                    __CLR4_5_25b5blx1di36y.R.inc(218);method.setAccessible(true);
                    __CLR4_5_25b5blx1di36y.R.inc(219);tmp = method.invoke(stringDecoder, null, null, tmp);
                }
            }
        }}

        // Protocol decoder
        }__CLR4_5_25b5blx1di36y.R.inc(220);BaseProtocolDecoder protocolDecoder = (BaseProtocolDecoder) pipeline.get("objectDecoder");
        __CLR4_5_25b5blx1di36y.R.inc(221);if ((((tmp != null)&&(__CLR4_5_25b5blx1di36y.R.iget(222)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(223)==0&false))) {{
            __CLR4_5_25b5blx1di36y.R.inc(224);try {
                __CLR4_5_25b5blx1di36y.R.inc(225);Method method = protocolDecoder.getClass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, SocketAddress.class, Object.class);
                __CLR4_5_25b5blx1di36y.R.inc(226);method.setAccessible(true);
                __CLR4_5_25b5blx1di36y.R.inc(227);tmp = method.invoke(protocolDecoder, null, null, null, tmp);
            } catch (NoSuchMethodException error) {
                __CLR4_5_25b5blx1di36y.R.inc(228);Method method = protocolDecoder.getClass().getSuperclass().getDeclaredMethod("decode", ChannelHandlerContext.class, Channel.class, SocketAddress.class, Object.class);
                __CLR4_5_25b5blx1di36y.R.inc(229);method.setAccessible(true);
                __CLR4_5_25b5blx1di36y.R.inc(230);tmp = method.invoke(protocolDecoder, null, null, null, tmp);
            }
        }

        }__CLR4_5_25b5blx1di36y.R.inc(231);if ((((tmp != null)&&(__CLR4_5_25b5blx1di36y.R.iget(232)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(233)==0&false))) {{
            __CLR4_5_25b5blx1di36y.R.inc(234);Log.info("Protocol " + protocol + " possible match");
        } }else {__CLR4_5_25b5blx1di36y.R.inc(235);if ((((showFailed)&&(__CLR4_5_25b5blx1di36y.R.iget(236)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(237)==0&false))) {{
            __CLR4_5_25b5blx1di36y.R.inc(238);Log.info("Protocol " + protocol + " no match");
        }
    }}}finally{__CLR4_5_25b5blx1di36y.R.flushNeeded();}}

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {try{__CLR4_5_25b5blx1di36y.R.inc(239);

        __CLR4_5_25b5blx1di36y.R.inc(240);if ((((e.getMessage() instanceof ChannelBuffer)&&(__CLR4_5_25b5blx1di36y.R.iget(241)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(242)==0&false))) {{
            __CLR4_5_25b5blx1di36y.R.inc(243);ChannelBuffer buf = (ChannelBuffer) e.getMessage();

            __CLR4_5_25b5blx1di36y.R.inc(244);for (TrackerServer server : serverList) {{
                __CLR4_5_25b5blx1di36y.R.inc(245);try {
                    __CLR4_5_25b5blx1di36y.R.inc(246);if ((((!server.getProtocol().equals("detector"))&&(__CLR4_5_25b5blx1di36y.R.iget(247)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(248)==0&false))) {{
                        __CLR4_5_25b5blx1di36y.R.inc(249);checkPipeline(server.getProtocol(), server.getPipelineFactory().getPipeline(), buf);
                    }
                }} catch(Exception error) {
                    __CLR4_5_25b5blx1di36y.R.inc(250);if ((((showFailed)&&(__CLR4_5_25b5blx1di36y.R.iget(251)!=0|true))||(__CLR4_5_25b5blx1di36y.R.iget(252)==0&false))) {{
                        __CLR4_5_25b5blx1di36y.R.inc(253);Log.info("Protocol " + server.getProtocol() + " error");
                    }
                }}
            }
        }}
    }}finally{__CLR4_5_25b5blx1di36y.R.flushNeeded();}}

}
