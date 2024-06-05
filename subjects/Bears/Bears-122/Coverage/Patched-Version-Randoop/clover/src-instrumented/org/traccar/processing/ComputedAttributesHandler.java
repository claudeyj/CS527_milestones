/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
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
package org.traccar.processing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.JexlException;
import org.apache.commons.jexl2.MapContext;
import org.traccar.BaseDataHandler;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Attribute;
import org.traccar.model.Device;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class ComputedAttributesHandler extends BaseDataHandler {public static class __CLR4_5_25ee5eelwye62sw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,7059,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JexlEngine engine;

    private boolean mapDeviceAttributes;

    public ComputedAttributesHandler() {try{__CLR4_5_25ee5eelwye62sw.R.inc(6998);
        __CLR4_5_25ee5eelwye62sw.R.inc(6999);engine = new JexlEngine();
        __CLR4_5_25ee5eelwye62sw.R.inc(7000);engine.setStrict(true);
        __CLR4_5_25ee5eelwye62sw.R.inc(7001);if ((((Context.getConfig() != null)&&(__CLR4_5_25ee5eelwye62sw.R.iget(7002)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7003)==0&false))) {{
            __CLR4_5_25ee5eelwye62sw.R.inc(7004);mapDeviceAttributes = Context.getConfig().getBoolean("processing.computedAttributes.deviceAttributes");
        }
    }}finally{__CLR4_5_25ee5eelwye62sw.R.flushNeeded();}}

    private MapContext prepareContext(Position position) {try{__CLR4_5_25ee5eelwye62sw.R.inc(7005);
        __CLR4_5_25ee5eelwye62sw.R.inc(7006);MapContext result = new MapContext();
        __CLR4_5_25ee5eelwye62sw.R.inc(7007);if ((((mapDeviceAttributes)&&(__CLR4_5_25ee5eelwye62sw.R.iget(7008)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7009)==0&false))) {{
            __CLR4_5_25ee5eelwye62sw.R.inc(7010);Device device = Context.getIdentityManager().getById(position.getDeviceId());
            __CLR4_5_25ee5eelwye62sw.R.inc(7011);if ((((device != null)&&(__CLR4_5_25ee5eelwye62sw.R.iget(7012)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7013)==0&false))) {{
                __CLR4_5_25ee5eelwye62sw.R.inc(7014);for (Object key : device.getAttributes().keySet()) {{
                    __CLR4_5_25ee5eelwye62sw.R.inc(7015);result.set((String) key, device.getAttributes().get(key));
                }
            }}
        }}
        }__CLR4_5_25ee5eelwye62sw.R.inc(7016);Set<Method> methods = new HashSet<>(Arrays.asList(position.getClass().getMethods()));
        __CLR4_5_25ee5eelwye62sw.R.inc(7017);methods.removeAll(Arrays.asList(Object.class.getMethods()));
        __CLR4_5_25ee5eelwye62sw.R.inc(7018);for (Method method : methods) {{
            __CLR4_5_25ee5eelwye62sw.R.inc(7019);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_25ee5eelwye62sw.R.iget(7020)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7021)==0&false))) {{
                __CLR4_5_25ee5eelwye62sw.R.inc(7022);String name = Character.toLowerCase(method.getName().charAt(3)) + method.getName().substring(4);

                __CLR4_5_25ee5eelwye62sw.R.inc(7023);try {
                    __CLR4_5_25ee5eelwye62sw.R.inc(7024);if ((((!method.getReturnType().equals(Map.class))&&(__CLR4_5_25ee5eelwye62sw.R.iget(7025)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7026)==0&false))) {{
                        __CLR4_5_25ee5eelwye62sw.R.inc(7027);result.set(name, method.invoke(position));
                    } }else {{
                        __CLR4_5_25ee5eelwye62sw.R.inc(7028);for (Object key : ((Map) method.invoke(position)).keySet()) {{
                            __CLR4_5_25ee5eelwye62sw.R.inc(7029);result.set((String) key, ((Map) method.invoke(position)).get(key));
                        }
                    }}
                }} catch (IllegalAccessException | InvocationTargetException error) {
                    __CLR4_5_25ee5eelwye62sw.R.inc(7030);Log.warning(error);
                }
            }
        }}
        }__CLR4_5_25ee5eelwye62sw.R.inc(7031);return result;
    }finally{__CLR4_5_25ee5eelwye62sw.R.flushNeeded();}}

    public Object computeAttribute(Attribute attribute, Position position) throws JexlException {try{__CLR4_5_25ee5eelwye62sw.R.inc(7032);
        __CLR4_5_25ee5eelwye62sw.R.inc(7033);return engine.createExpression(attribute.getExpression()).evaluate(prepareContext(position));
    }finally{__CLR4_5_25ee5eelwye62sw.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_25ee5eelwye62sw.R.inc(7034);
        __CLR4_5_25ee5eelwye62sw.R.inc(7035);Collection<Attribute> attributes = Context.getAttributesManager().getItems(
                Context.getAttributesManager().getAllDeviceItems(position.getDeviceId()));
        __CLR4_5_25ee5eelwye62sw.R.inc(7036);for (Attribute attribute : attributes) {{
            __CLR4_5_25ee5eelwye62sw.R.inc(7037);if ((((attribute.getAttribute() != null)&&(__CLR4_5_25ee5eelwye62sw.R.iget(7038)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7039)==0&false))) {{
                __CLR4_5_25ee5eelwye62sw.R.inc(7040);Object result = null;
                __CLR4_5_25ee5eelwye62sw.R.inc(7041);try {
                    __CLR4_5_25ee5eelwye62sw.R.inc(7042);result = computeAttribute(attribute, position);
                } catch (JexlException error) {
                    __CLR4_5_25ee5eelwye62sw.R.inc(7043);Log.warning(error);
                }
                __CLR4_5_25ee5eelwye62sw.R.inc(7044);if ((((result != null)&&(__CLR4_5_25ee5eelwye62sw.R.iget(7045)!=0|true))||(__CLR4_5_25ee5eelwye62sw.R.iget(7046)==0&false))) {{
                    __CLR4_5_25ee5eelwye62sw.R.inc(7047);try {
                        boolean __CLB4_5_2_bool0=false;__CLR4_5_25ee5eelwye62sw.R.inc(7048);switch (attribute.getType()) {
                            case "number":if (!__CLB4_5_2_bool0) {__CLR4_5_25ee5eelwye62sw.R.inc(7049);__CLB4_5_2_bool0=true;}
                                __CLR4_5_25ee5eelwye62sw.R.inc(7050);position.getAttributes().put(attribute.getAttribute(), (Number) result);
                                __CLR4_5_25ee5eelwye62sw.R.inc(7051);break;
                            case "boolean":if (!__CLB4_5_2_bool0) {__CLR4_5_25ee5eelwye62sw.R.inc(7052);__CLB4_5_2_bool0=true;}
                                __CLR4_5_25ee5eelwye62sw.R.inc(7053);position.getAttributes().put(attribute.getAttribute(), (Boolean) result);
                                __CLR4_5_25ee5eelwye62sw.R.inc(7054);break;
                            default:if (!__CLB4_5_2_bool0) {__CLR4_5_25ee5eelwye62sw.R.inc(7055);__CLB4_5_2_bool0=true;}
                                __CLR4_5_25ee5eelwye62sw.R.inc(7056);position.getAttributes().put(attribute.getAttribute(), result.toString());
                        }
                    } catch (ClassCastException error) {
                        __CLR4_5_25ee5eelwye62sw.R.inc(7057);Log.warning(error);
                    }
                }
            }}
        }}
        }__CLR4_5_25ee5eelwye62sw.R.inc(7058);return position;
    }finally{__CLR4_5_25ee5eelwye62sw.R.flushNeeded();}}

}
