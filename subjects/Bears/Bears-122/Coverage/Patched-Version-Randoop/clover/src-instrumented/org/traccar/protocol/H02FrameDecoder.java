/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

@java.lang.SuppressWarnings({"fallthrough"}) public class H02FrameDecoder extends FrameDecoder {public static class __CLR4_5_2b08b08lwye65vs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,14312,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MESSAGE_SHORT = 32;
    private static final int MESSAGE_LONG = 45;

    private int messageLength;

    public H02FrameDecoder(int messageLength) {try{__CLR4_5_2b08b08lwye65vs.R.inc(14264);
        __CLR4_5_2b08b08lwye65vs.R.inc(14265);this.messageLength = messageLength;
    }finally{__CLR4_5_2b08b08lwye65vs.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, ChannelBuffer buf) throws Exception {try{__CLR4_5_2b08b08lwye65vs.R.inc(14266);

        __CLR4_5_2b08b08lwye65vs.R.inc(14267);char marker = (char) buf.getByte(buf.readerIndex());

        __CLR4_5_2b08b08lwye65vs.R.inc(14268);while ((((marker != '*' && marker != '$' && marker != 'X' && buf.readableBytes() > 0)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14269)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14270)==0&false))) {{
            __CLR4_5_2b08b08lwye65vs.R.inc(14271);buf.skipBytes(1);
            __CLR4_5_2b08b08lwye65vs.R.inc(14272);if ((((buf.readableBytes() > 0)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14273)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14274)==0&false))) {{
                __CLR4_5_2b08b08lwye65vs.R.inc(14275);marker = (char) buf.getByte(buf.readerIndex());
            }
        }}

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2b08b08lwye65vs.R.inc(14276);switch (marker) {
            case '*':if (!__CLB4_5_2_bool0) {__CLR4_5_2b08b08lwye65vs.R.inc(14277);__CLB4_5_2_bool0=true;}

                // Return text message
                __CLR4_5_2b08b08lwye65vs.R.inc(14278);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '#');
                __CLR4_5_2b08b08lwye65vs.R.inc(14279);if ((((index != -1)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14280)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14281)==0&false))) {{
                    __CLR4_5_2b08b08lwye65vs.R.inc(14282);ChannelBuffer result = buf.readBytes(index + 1 - buf.readerIndex());
                    __CLR4_5_2b08b08lwye65vs.R.inc(14283);while ((((buf.readable()
                            && (buf.getByte(buf.readerIndex()) == '\r' || buf.getByte(buf.readerIndex()) == '\n'))&&(__CLR4_5_2b08b08lwye65vs.R.iget(14284)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14285)==0&false))) {{
                        __CLR4_5_2b08b08lwye65vs.R.inc(14286);buf.readByte(); // skip new line
                    }
                    }__CLR4_5_2b08b08lwye65vs.R.inc(14287);return result;
                }

                }__CLR4_5_2b08b08lwye65vs.R.inc(14288);break;

            case '$':if (!__CLB4_5_2_bool0) {__CLR4_5_2b08b08lwye65vs.R.inc(14289);__CLB4_5_2_bool0=true;}

                __CLR4_5_2b08b08lwye65vs.R.inc(14290);if ((((messageLength == 0)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14291)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14292)==0&false))) {{
                    __CLR4_5_2b08b08lwye65vs.R.inc(14293);if ((((buf.readableBytes() == MESSAGE_LONG)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14294)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14295)==0&false))) {{
                        __CLR4_5_2b08b08lwye65vs.R.inc(14296);messageLength = MESSAGE_LONG;
                    } }else {{
                        __CLR4_5_2b08b08lwye65vs.R.inc(14297);messageLength = MESSAGE_SHORT;
                    }
                }}

                }__CLR4_5_2b08b08lwye65vs.R.inc(14298);if ((((buf.readableBytes() >= messageLength)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14299)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14300)==0&false))) {{
                    __CLR4_5_2b08b08lwye65vs.R.inc(14301);return buf.readBytes(messageLength);
                }

                }__CLR4_5_2b08b08lwye65vs.R.inc(14302);break;

            case 'X':if (!__CLB4_5_2_bool0) {__CLR4_5_2b08b08lwye65vs.R.inc(14303);__CLB4_5_2_bool0=true;}

                __CLR4_5_2b08b08lwye65vs.R.inc(14304);if ((((buf.readableBytes() >= MESSAGE_SHORT)&&(__CLR4_5_2b08b08lwye65vs.R.iget(14305)!=0|true))||(__CLR4_5_2b08b08lwye65vs.R.iget(14306)==0&false))) {{
                    __CLR4_5_2b08b08lwye65vs.R.inc(14307);return buf.readBytes(MESSAGE_SHORT);
                }

                }__CLR4_5_2b08b08lwye65vs.R.inc(14308);break;

            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2b08b08lwye65vs.R.inc(14309);__CLB4_5_2_bool0=true;}

                __CLR4_5_2b08b08lwye65vs.R.inc(14310);return null;
        }

        __CLR4_5_2b08b08lwye65vs.R.inc(14311);return null;
    }finally{__CLR4_5_2b08b08lwye65vs.R.flushNeeded();}}

}
