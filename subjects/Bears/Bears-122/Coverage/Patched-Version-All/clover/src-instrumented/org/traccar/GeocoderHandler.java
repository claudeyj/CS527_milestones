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

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelUpstreamHandler;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.traccar.geocoder.AddressFormat;
import org.traccar.geocoder.Geocoder;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class GeocoderHandler implements ChannelUpstreamHandler {public static class __CLR4_5_2qmqmlwye78mj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,1003,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Geocoder geocoder;
    private final boolean processInvalidPositions;
    private final AddressFormat addressFormat;
    private final int geocoderReuseDistance;

    public GeocoderHandler(Geocoder geocoder, boolean processInvalidPositions) {try{__CLR4_5_2qmqmlwye78mj.R.inc(958);
        __CLR4_5_2qmqmlwye78mj.R.inc(959);this.geocoder = geocoder;
        __CLR4_5_2qmqmlwye78mj.R.inc(960);this.processInvalidPositions = processInvalidPositions;

        __CLR4_5_2qmqmlwye78mj.R.inc(961);String formatString = Context.getConfig().getString("geocoder.format");
        __CLR4_5_2qmqmlwye78mj.R.inc(962);if ((((formatString != null)&&(__CLR4_5_2qmqmlwye78mj.R.iget(963)!=0|true))||(__CLR4_5_2qmqmlwye78mj.R.iget(964)==0&false))) {{
            __CLR4_5_2qmqmlwye78mj.R.inc(965);addressFormat = new AddressFormat(formatString);
        } }else {{
            __CLR4_5_2qmqmlwye78mj.R.inc(966);addressFormat = new AddressFormat();
        }

        }__CLR4_5_2qmqmlwye78mj.R.inc(967);geocoderReuseDistance = Context.getConfig().getInteger("geocoder.reuseDistance", 0);
    }finally{__CLR4_5_2qmqmlwye78mj.R.flushNeeded();}}

    @Override
    public void handleUpstream(final ChannelHandlerContext ctx, ChannelEvent evt) throws Exception {try{__CLR4_5_2qmqmlwye78mj.R.inc(968);
        __CLR4_5_2qmqmlwye78mj.R.inc(969);if ((((!(evt instanceof MessageEvent))&&(__CLR4_5_2qmqmlwye78mj.R.iget(970)!=0|true))||(__CLR4_5_2qmqmlwye78mj.R.iget(971)==0&false))) {{
            __CLR4_5_2qmqmlwye78mj.R.inc(972);ctx.sendUpstream(evt);
            __CLR4_5_2qmqmlwye78mj.R.inc(973);return;
        }

        }__CLR4_5_2qmqmlwye78mj.R.inc(974);final MessageEvent event = (MessageEvent) evt;
        __CLR4_5_2qmqmlwye78mj.R.inc(975);Object message = event.getMessage();
        __CLR4_5_2qmqmlwye78mj.R.inc(976);if ((((message instanceof Position)&&(__CLR4_5_2qmqmlwye78mj.R.iget(977)!=0|true))||(__CLR4_5_2qmqmlwye78mj.R.iget(978)==0&false))) {{
            __CLR4_5_2qmqmlwye78mj.R.inc(979);final Position position = (Position) message;
            __CLR4_5_2qmqmlwye78mj.R.inc(980);if ((((processInvalidPositions || position.getValid())&&(__CLR4_5_2qmqmlwye78mj.R.iget(981)!=0|true))||(__CLR4_5_2qmqmlwye78mj.R.iget(982)==0&false))) {{
                __CLR4_5_2qmqmlwye78mj.R.inc(983);if ((((geocoderReuseDistance != 0)&&(__CLR4_5_2qmqmlwye78mj.R.iget(984)!=0|true))||(__CLR4_5_2qmqmlwye78mj.R.iget(985)==0&false))) {{
                    __CLR4_5_2qmqmlwye78mj.R.inc(986);Position lastPosition = Context.getIdentityManager().getLastPosition(position.getDeviceId());
                    __CLR4_5_2qmqmlwye78mj.R.inc(987);if ((((lastPosition != null && lastPosition.getAddress() != null
                            && position.getDouble(Position.KEY_DISTANCE) <= geocoderReuseDistance)&&(__CLR4_5_2qmqmlwye78mj.R.iget(988)!=0|true))||(__CLR4_5_2qmqmlwye78mj.R.iget(989)==0&false))) {{
                        __CLR4_5_2qmqmlwye78mj.R.inc(990);position.setAddress(lastPosition.getAddress());
                        __CLR4_5_2qmqmlwye78mj.R.inc(991);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                        __CLR4_5_2qmqmlwye78mj.R.inc(992);return;
                    }
                }}

                }__CLR4_5_2qmqmlwye78mj.R.inc(993);Context.getStatisticsManager().registerGeocoderRequest();

                __CLR4_5_2qmqmlwye78mj.R.inc(994);geocoder.getAddress(addressFormat, position.getLatitude(), position.getLongitude(),
                        new Geocoder.ReverseGeocoderCallback() {
                    @Override
                    public void onSuccess(String address) {try{__CLR4_5_2qmqmlwye78mj.R.inc(995);
                        __CLR4_5_2qmqmlwye78mj.R.inc(996);position.setAddress(address);
                        __CLR4_5_2qmqmlwye78mj.R.inc(997);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2qmqmlwye78mj.R.flushNeeded();}}

                    @Override
                    public void onFailure(Throwable e) {try{__CLR4_5_2qmqmlwye78mj.R.inc(998);
                        __CLR4_5_2qmqmlwye78mj.R.inc(999);Log.warning("Geocoding failed", e);
                        __CLR4_5_2qmqmlwye78mj.R.inc(1000);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2qmqmlwye78mj.R.flushNeeded();}}
                });
            } }else {{
                __CLR4_5_2qmqmlwye78mj.R.inc(1001);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
            }
        }} }else {{
            __CLR4_5_2qmqmlwye78mj.R.inc(1002);Channels.fireMessageReceived(ctx, message, event.getRemoteAddress());
        }
    }}finally{__CLR4_5_2qmqmlwye78mj.R.flushNeeded();}}

}
