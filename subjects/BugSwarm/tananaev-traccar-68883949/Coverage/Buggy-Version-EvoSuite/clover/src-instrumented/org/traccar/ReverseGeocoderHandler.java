/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;
import org.traccar.geocode.AddressFormat;
import org.traccar.geocode.ReverseGeocoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class ReverseGeocoderHandler extends OneToOneDecoder {public static class __CLR4_5_2cgcglx1dgzcq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,474,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final ReverseGeocoder geocoder;
    private final boolean processInvalidPositions;
    private final AddressFormat addressFormat;

    public ReverseGeocoderHandler(ReverseGeocoder geocoder, boolean processInvalidPositions ) {try{__CLR4_5_2cgcglx1dgzcq.R.inc(448);
        __CLR4_5_2cgcglx1dgzcq.R.inc(449);this.geocoder = geocoder;
        __CLR4_5_2cgcglx1dgzcq.R.inc(450);this.processInvalidPositions = processInvalidPositions;
        __CLR4_5_2cgcglx1dgzcq.R.inc(451);addressFormat = new AddressFormat();
    }finally{__CLR4_5_2cgcglx1dgzcq.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2cgcglx1dgzcq.R.inc(452);
        
        __CLR4_5_2cgcglx1dgzcq.R.inc(453);if ((((geocoder != null)&&(__CLR4_5_2cgcglx1dgzcq.R.iget(454)!=0|true))||(__CLR4_5_2cgcglx1dgzcq.R.iget(455)==0&false))) {{
            __CLR4_5_2cgcglx1dgzcq.R.inc(456);if ((((msg instanceof Position)&&(__CLR4_5_2cgcglx1dgzcq.R.iget(457)!=0|true))||(__CLR4_5_2cgcglx1dgzcq.R.iget(458)==0&false))) {{
                __CLR4_5_2cgcglx1dgzcq.R.inc(459);Position position = (Position) msg;
                
                __CLR4_5_2cgcglx1dgzcq.R.inc(460);if ((((processInvalidPositions || position.getValid())&&(__CLR4_5_2cgcglx1dgzcq.R.iget(461)!=0|true))||(__CLR4_5_2cgcglx1dgzcq.R.iget(462)==0&false))) {{
                    __CLR4_5_2cgcglx1dgzcq.R.inc(463);position.setAddress(geocoder.getAddress(
                            addressFormat, position.getLatitude(), position.getLongitude()));
                }
            }} }else {__CLR4_5_2cgcglx1dgzcq.R.inc(464);if ((((msg instanceof List)&&(__CLR4_5_2cgcglx1dgzcq.R.iget(465)!=0|true))||(__CLR4_5_2cgcglx1dgzcq.R.iget(466)==0&false))) {{
                __CLR4_5_2cgcglx1dgzcq.R.inc(467);List<Position> positions = (List<Position>) msg;
                __CLR4_5_2cgcglx1dgzcq.R.inc(468);for (Position position : positions) {{
                    __CLR4_5_2cgcglx1dgzcq.R.inc(469);if ((((processInvalidPositions || position.getValid())&&(__CLR4_5_2cgcglx1dgzcq.R.iget(470)!=0|true))||(__CLR4_5_2cgcglx1dgzcq.R.iget(471)==0&false))) {{
                        __CLR4_5_2cgcglx1dgzcq.R.inc(472);position.setAddress(geocoder.getAddress(
                                addressFormat, position.getLatitude(), position.getLongitude()));
                    }
                }}
            }}
        }}}

        }__CLR4_5_2cgcglx1dgzcq.R.inc(473);return msg;
    }finally{__CLR4_5_2cgcglx1dgzcq.R.flushNeeded();}}

}
