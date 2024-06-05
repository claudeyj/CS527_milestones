/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Log;
import org.traccar.geolocation.GeolocationProvider;
import org.traccar.model.Position;

public class GeolocationHandler implements ChannelUpstreamHandler {public static class __CLR4_5_2rvrvlwydw83u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,1040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final GeolocationProvider geolocationProvider;
    private final boolean processInvalidPositions;

    public GeolocationHandler(GeolocationProvider geolocationProvider, boolean processInvalidPositions) {try{__CLR4_5_2rvrvlwydw83u.R.inc(1003);
        __CLR4_5_2rvrvlwydw83u.R.inc(1004);this.geolocationProvider = geolocationProvider;
        __CLR4_5_2rvrvlwydw83u.R.inc(1005);this.processInvalidPositions = processInvalidPositions;
    }finally{__CLR4_5_2rvrvlwydw83u.R.flushNeeded();}}

    @Override
    public void handleUpstream(final ChannelHandlerContext ctx, ChannelEvent evt) throws Exception {try{__CLR4_5_2rvrvlwydw83u.R.inc(1006);
        __CLR4_5_2rvrvlwydw83u.R.inc(1007);if ((((!(evt instanceof MessageEvent))&&(__CLR4_5_2rvrvlwydw83u.R.iget(1008)!=0|true))||(__CLR4_5_2rvrvlwydw83u.R.iget(1009)==0&false))) {{
            __CLR4_5_2rvrvlwydw83u.R.inc(1010);ctx.sendUpstream(evt);
            __CLR4_5_2rvrvlwydw83u.R.inc(1011);return;
        }

        }__CLR4_5_2rvrvlwydw83u.R.inc(1012);final MessageEvent event = (MessageEvent) evt;
        __CLR4_5_2rvrvlwydw83u.R.inc(1013);Object message = event.getMessage();
        __CLR4_5_2rvrvlwydw83u.R.inc(1014);if ((((message instanceof Position)&&(__CLR4_5_2rvrvlwydw83u.R.iget(1015)!=0|true))||(__CLR4_5_2rvrvlwydw83u.R.iget(1016)==0&false))) {{
            __CLR4_5_2rvrvlwydw83u.R.inc(1017);final Position position = (Position) message;
            __CLR4_5_2rvrvlwydw83u.R.inc(1018);if (((((position.getOutdated() || processInvalidPositions && !position.getValid())
                    && position.getNetwork() != null)&&(__CLR4_5_2rvrvlwydw83u.R.iget(1019)!=0|true))||(__CLR4_5_2rvrvlwydw83u.R.iget(1020)==0&false))) {{
                __CLR4_5_2rvrvlwydw83u.R.inc(1021);Context.getStatisticsManager().registerGeolocationRequest();

                __CLR4_5_2rvrvlwydw83u.R.inc(1022);geolocationProvider.getLocation(position.getNetwork(),
                        new GeolocationProvider.LocationProviderCallback() {
                    @Override
                    public void onSuccess(double latitude, double longitude, double accuracy) {try{__CLR4_5_2rvrvlwydw83u.R.inc(1023);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1024);position.set(Position.KEY_APPROXIMATE, true);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1025);position.setValid(true);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1026);position.setFixTime(position.getDeviceTime());
                        __CLR4_5_2rvrvlwydw83u.R.inc(1027);position.setLatitude(latitude);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1028);position.setLongitude(longitude);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1029);position.setAccuracy(accuracy);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1030);position.setAltitude(0);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1031);position.setSpeed(0);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1032);position.setCourse(0);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1033);position.set(Position.KEY_RSSI, 0);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1034);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2rvrvlwydw83u.R.flushNeeded();}}

                    @Override
                    public void onFailure(Throwable e) {try{__CLR4_5_2rvrvlwydw83u.R.inc(1035);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1036);Log.warning(e);
                        __CLR4_5_2rvrvlwydw83u.R.inc(1037);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2rvrvlwydw83u.R.flushNeeded();}}
                });
            } }else {{
                __CLR4_5_2rvrvlwydw83u.R.inc(1038);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
            }
        }} }else {{
            __CLR4_5_2rvrvlwydw83u.R.inc(1039);Channels.fireMessageReceived(ctx, message, event.getRemoteAddress());
        }
    }}finally{__CLR4_5_2rvrvlwydw83u.R.flushNeeded();}}

}
