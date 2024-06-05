/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
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
package org.traccar.events;

import java.util.Collection;
import java.util.Collections;

import org.traccar.BaseEventHandler;
import org.traccar.Context;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class IgnitionEventHandler extends BaseEventHandler {public static class __CLR4_5_22xw2xwlx1e1i38{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,3841,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Collection<Event> analyzePosition(Position position) {try{__CLR4_5_22xw2xwlx1e1i38.R.inc(3812);
        __CLR4_5_22xw2xwlx1e1i38.R.inc(3813);Device device = Context.getIdentityManager().getDeviceById(position.getDeviceId());
        __CLR4_5_22xw2xwlx1e1i38.R.inc(3814);if ((((device == null)&&(__CLR4_5_22xw2xwlx1e1i38.R.iget(3815)!=0|true))||(__CLR4_5_22xw2xwlx1e1i38.R.iget(3816)==0&false))) {{
            __CLR4_5_22xw2xwlx1e1i38.R.inc(3817);return null;
        }
        }__CLR4_5_22xw2xwlx1e1i38.R.inc(3818);if ((((!Context.getIdentityManager().isLatestPosition(position) || !position.getValid())&&(__CLR4_5_22xw2xwlx1e1i38.R.iget(3819)!=0|true))||(__CLR4_5_22xw2xwlx1e1i38.R.iget(3820)==0&false))) {{
            __CLR4_5_22xw2xwlx1e1i38.R.inc(3821);return null;
        }

        }__CLR4_5_22xw2xwlx1e1i38.R.inc(3822);Collection<Event> result = null;

        __CLR4_5_22xw2xwlx1e1i38.R.inc(3823);if ((((position.getAttributes().containsKey(Position.KEY_IGNITION))&&(__CLR4_5_22xw2xwlx1e1i38.R.iget(3824)!=0|true))||(__CLR4_5_22xw2xwlx1e1i38.R.iget(3825)==0&false))) {{
            __CLR4_5_22xw2xwlx1e1i38.R.inc(3826);boolean ignition = position.getBoolean(Position.KEY_IGNITION);

            __CLR4_5_22xw2xwlx1e1i38.R.inc(3827);Position lastPosition = Context.getIdentityManager().getLastPosition(position.getDeviceId());
            __CLR4_5_22xw2xwlx1e1i38.R.inc(3828);if ((((lastPosition != null && lastPosition.getAttributes().containsKey(Position.KEY_IGNITION))&&(__CLR4_5_22xw2xwlx1e1i38.R.iget(3829)!=0|true))||(__CLR4_5_22xw2xwlx1e1i38.R.iget(3830)==0&false))) {{
                __CLR4_5_22xw2xwlx1e1i38.R.inc(3831);boolean oldIgnition = lastPosition.getBoolean(Position.KEY_IGNITION);

                __CLR4_5_22xw2xwlx1e1i38.R.inc(3832);if ((((ignition && !oldIgnition)&&(__CLR4_5_22xw2xwlx1e1i38.R.iget(3833)!=0|true))||(__CLR4_5_22xw2xwlx1e1i38.R.iget(3834)==0&false))) {{
                    __CLR4_5_22xw2xwlx1e1i38.R.inc(3835);result = Collections.singleton(
                            new Event(Event.TYPE_IGNITION_ON, position.getDeviceId(), position.getId()));
                } }else {__CLR4_5_22xw2xwlx1e1i38.R.inc(3836);if ((((!ignition && oldIgnition)&&(__CLR4_5_22xw2xwlx1e1i38.R.iget(3837)!=0|true))||(__CLR4_5_22xw2xwlx1e1i38.R.iget(3838)==0&false))) {{
                    __CLR4_5_22xw2xwlx1e1i38.R.inc(3839);result = Collections.singleton(
                            new Event(Event.TYPE_IGNITION_OFF, position.getDeviceId(), position.getId()));
                }
            }}}
        }}
        }__CLR4_5_22xw2xwlx1e1i38.R.inc(3840);return result;
    }finally{__CLR4_5_22xw2xwlx1e1i38.R.flushNeeded();}}

}
