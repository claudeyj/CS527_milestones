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

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelUpstreamHandler;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.traccar.helper.Log;
import org.traccar.geolocation.GeolocationProvider;
import org.traccar.model.Position;

public class GeolocationHandler implements ChannelUpstreamHandler {public static class __CLR4_5_2q1q1lx1e0cj7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final GeolocationProvider geolocationProvider;
    private final boolean processInvalidPositions;

    public GeolocationHandler(GeolocationProvider geolocationProvider, boolean processInvalidPositions) {try{__CLR4_5_2q1q1lx1e0cj7.R.inc(937);
        __CLR4_5_2q1q1lx1e0cj7.R.inc(938);this.geolocationProvider = geolocationProvider;
        __CLR4_5_2q1q1lx1e0cj7.R.inc(939);this.processInvalidPositions = processInvalidPositions;
    }finally{__CLR4_5_2q1q1lx1e0cj7.R.flushNeeded();}}

    @Override
    public void handleUpstream(final ChannelHandlerContext ctx, ChannelEvent evt) throws Exception {try{__CLR4_5_2q1q1lx1e0cj7.R.inc(940);
        __CLR4_5_2q1q1lx1e0cj7.R.inc(941);if ((((!(evt instanceof MessageEvent))&&(__CLR4_5_2q1q1lx1e0cj7.R.iget(942)!=0|true))||(__CLR4_5_2q1q1lx1e0cj7.R.iget(943)==0&false))) {{
            __CLR4_5_2q1q1lx1e0cj7.R.inc(944);ctx.sendUpstream(evt);
            __CLR4_5_2q1q1lx1e0cj7.R.inc(945);return;
        }

        }__CLR4_5_2q1q1lx1e0cj7.R.inc(946);final MessageEvent event = (MessageEvent) evt;
        __CLR4_5_2q1q1lx1e0cj7.R.inc(947);Object message = event.getMessage();
        __CLR4_5_2q1q1lx1e0cj7.R.inc(948);if ((((message instanceof Position)&&(__CLR4_5_2q1q1lx1e0cj7.R.iget(949)!=0|true))||(__CLR4_5_2q1q1lx1e0cj7.R.iget(950)==0&false))) {{
            __CLR4_5_2q1q1lx1e0cj7.R.inc(951);final Position position = (Position) message;
            __CLR4_5_2q1q1lx1e0cj7.R.inc(952);if (((((position.getOutdated() || processInvalidPositions && !position.getValid())
                    && position.getNetwork() != null)&&(__CLR4_5_2q1q1lx1e0cj7.R.iget(953)!=0|true))||(__CLR4_5_2q1q1lx1e0cj7.R.iget(954)==0&false))) {{
                __CLR4_5_2q1q1lx1e0cj7.R.inc(955);geolocationProvider.getLocation(position.getNetwork(),
                        new GeolocationProvider.LocationProviderCallback() {
                    @Override
                    public void onSuccess(double latitude, double longitude, double accuracy) {try{__CLR4_5_2q1q1lx1e0cj7.R.inc(956);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(957);position.set(Position.KEY_APPROXIMATE, true);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(958);position.setValid(true);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(959);position.setFixTime(position.getDeviceTime());
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(960);position.setLatitude(latitude);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(961);position.setLongitude(longitude);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(962);position.setAccuracy(accuracy);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(963);position.setAltitude(0);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(964);position.setSpeed(0);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(965);position.setCourse(0);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(966);position.set(Position.KEY_RSSI, 0);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(967);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2q1q1lx1e0cj7.R.flushNeeded();}}

                    @Override
                    public void onFailure(Throwable e) {try{__CLR4_5_2q1q1lx1e0cj7.R.inc(968);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(969);Log.warning(e);
                        __CLR4_5_2q1q1lx1e0cj7.R.inc(970);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
                    }finally{__CLR4_5_2q1q1lx1e0cj7.R.flushNeeded();}}
                });
            } }else {{
                __CLR4_5_2q1q1lx1e0cj7.R.inc(971);Channels.fireMessageReceived(ctx, position, event.getRemoteAddress());
            }
        }} }else {{
            __CLR4_5_2q1q1lx1e0cj7.R.inc(972);Channels.fireMessageReceived(ctx, message, event.getRemoteAddress());
        }
    }}finally{__CLR4_5_2q1q1lx1e0cj7.R.flushNeeded();}}

}
