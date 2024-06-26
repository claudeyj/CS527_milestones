/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelUpstreamHandler;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.traccar.geocoder.AddressFormat;
import org.traccar.geocoder.Geocoder;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class GeocoderHandler implements ChannelUpstreamHandler {public static class __CLR4_5_2p4p4lx1e0ch6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,937,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Geocoder geocoder;
    private final boolean processInvalidPositions;
    private final AddressFormat addressFormat;

    public GeocoderHandler(Geocoder geocoder, boolean processInvalidPositions) {try{__CLR4_5_2p4p4lx1e0ch6.R.inc(904);
        __CLR4_5_2p4p4lx1e0ch6.R.inc(905);this.geocoder = geocoder;
        __CLR4_5_2p4p4lx1e0ch6.R.inc(906);this.processInvalidPositions = processInvalidPositions;

        __CLR4_5_2p4p4lx1e0ch6.R.inc(907);String formatString = Context.getConfig().getString("geocoder.format");
        __CLR4_5_2p4p4lx1e0ch6.R.inc(908);if ((((formatString != null)&&(__CLR4_5_2p4p4lx1e0ch6.R.iget(909)!=0|true))||(__CLR4_5_2p4p4lx1e0ch6.R.iget(910)==0&false))) {{
            __CLR4_5_2p4p4lx1e0ch6.R.inc(911);addressFormat = new AddressFormat(formatString);
        } }else {{
            __CLR4_5_2p4p4lx1e0ch6.R.inc(912);addressFormat = new AddressFormat();
        }
    }}finally{__CLR4_5_2p4p4lx1e0ch6.R.flushNeeded();}}

    @Override
    public void handleUpstream(final ChannelHandlerContext ctx, ChannelEvent evt) throws Exception {try{__CLR4_5_2p4p4lx1e0ch6.R.inc(913);
        __CLR4_5_2p4p4lx1e0ch6.R.inc(914);if ((((!(evt instanceof MessageEvent))&&(__CLR4_5_2p4p4lx1e0ch6.R.iget(915)!=0|true))||(__CLR4_5_2p4p4lx1e0ch6.R.iget(916)==0&false))) {{
            __CLR4_5_2p4p4lx1e0ch6.R.inc(917);ctx.sendUpstream(evt);
            __CLR4_5_2p4p4lx1e0ch6.R.inc(918);return;
        }

        }__CLR4_5_2p4p4lx1e0ch6.R.inc(919);final MessageEvent event = (MessageEvent) evt;
        __CLR4_5_2p4p4lx1e0ch6.R.inc(920);Object message = event.getMessage();
        __CLR4_5_2p4p4lx1e0ch6.R.inc(921);if ((((message instanceof Position)&&(__CLR4_5_2p4p4lx1e0ch6.R.iget(922)!=0|true))||(__CLR4_5_2p4p4lx1e0ch6.R.iget(923)==0&false))) {{
            __CLR4_5_2p4p4lx1e0ch6.R.inc(924);final Position position = (Position) message;
            __CLR4_5_2p4p4lx1e0ch6.R.inc(925);if ((((processInvalidPositions || position.getValid())&&(__CLR4_5_2p4p4lx1e0ch6.R.iget(926)!=0|true))||(__CLR4_5_2p4p4lx1e0ch6.R.iget(927)==0&false))) {{
                __CLR4_5_2p4p4lx1e0ch6.R.inc(928);geocoder.getAddress(addressFormat, position.getLatitude(), position.getLongitude(),
                        new Geocoder.ReverseGeocoderCallback() {
                    @Override
                    public void onSuccess(String address) {try{__CLR4_5_2p4p4lx1e0ch6.R.inc(929);
                        __CLR4_5_2p4p4lx1e0ch6.R.inc(930);position.setAddress(address);
                        __CLR4_5_2p4p4lx1e0ch6.R.inc(931);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2p4p4lx1e0ch6.R.flushNeeded();}}

                    @Override
                    public void onFailure(Throwable e) {try{__CLR4_5_2p4p4lx1e0ch6.R.inc(932);
                        __CLR4_5_2p4p4lx1e0ch6.R.inc(933);Log.warning("Geocoding failed", e);
                        __CLR4_5_2p4p4lx1e0ch6.R.inc(934);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2p4p4lx1e0ch6.R.flushNeeded();}}
                });
            } }else {{
                __CLR4_5_2p4p4lx1e0ch6.R.inc(935);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
            }
        }} }else {{
            __CLR4_5_2p4p4lx1e0ch6.R.inc(936);Channels.fireMessageReceived(ctx, message, event.getRemoteAddress());
        }
    }}finally{__CLR4_5_2p4p4lx1e0ch6.R.flushNeeded();}}

}
