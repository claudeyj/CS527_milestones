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
package org.traccar.api;

import org.jboss.netty.handler.codec.http.HttpHeaders;
import org.traccar.Context;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

public class CorsResponseFilter implements ContainerResponseFilter {public static class __CLR4_5_216m16mlwye79mt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,1560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String ORIGIN_ALL = "*";
    private static final String HEADERS_ALL = "origin, content-type, accept, authorization";
    private static final String METHODS_ALL = "GET, POST, PUT, DELETE, OPTIONS";

    @Override
    public void filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException {try{__CLR4_5_216m16mlwye79mt.R.inc(1534);
        __CLR4_5_216m16mlwye79mt.R.inc(1535);if ((((!response.getHeaders().containsKey(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_HEADERS))&&(__CLR4_5_216m16mlwye79mt.R.iget(1536)!=0|true))||(__CLR4_5_216m16mlwye79mt.R.iget(1537)==0&false))) {{
            __CLR4_5_216m16mlwye79mt.R.inc(1538);response.getHeaders().add(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_HEADERS, HEADERS_ALL);
        }

        }__CLR4_5_216m16mlwye79mt.R.inc(1539);if ((((!response.getHeaders().containsKey(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_CREDENTIALS))&&(__CLR4_5_216m16mlwye79mt.R.iget(1540)!=0|true))||(__CLR4_5_216m16mlwye79mt.R.iget(1541)==0&false))) {{
            __CLR4_5_216m16mlwye79mt.R.inc(1542);response.getHeaders().add(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_CREDENTIALS, true);
        }

        }__CLR4_5_216m16mlwye79mt.R.inc(1543);if ((((!response.getHeaders().containsKey(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_METHODS))&&(__CLR4_5_216m16mlwye79mt.R.iget(1544)!=0|true))||(__CLR4_5_216m16mlwye79mt.R.iget(1545)==0&false))) {{
            __CLR4_5_216m16mlwye79mt.R.inc(1546);response.getHeaders().add(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_METHODS, METHODS_ALL);
        }

        }__CLR4_5_216m16mlwye79mt.R.inc(1547);if ((((!response.getHeaders().containsKey(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN))&&(__CLR4_5_216m16mlwye79mt.R.iget(1548)!=0|true))||(__CLR4_5_216m16mlwye79mt.R.iget(1549)==0&false))) {{
            __CLR4_5_216m16mlwye79mt.R.inc(1550);String origin = request.getHeaderString(HttpHeaders.Names.ORIGIN);
            __CLR4_5_216m16mlwye79mt.R.inc(1551);String allowed = Context.getConfig().getString("web.origin");

            __CLR4_5_216m16mlwye79mt.R.inc(1552);if ((((origin == null)&&(__CLR4_5_216m16mlwye79mt.R.iget(1553)!=0|true))||(__CLR4_5_216m16mlwye79mt.R.iget(1554)==0&false))) {{
                __CLR4_5_216m16mlwye79mt.R.inc(1555);response.getHeaders().add(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN, ORIGIN_ALL);
            } }else {__CLR4_5_216m16mlwye79mt.R.inc(1556);if ((((allowed == null || allowed.equals(ORIGIN_ALL) || allowed.contains(origin))&&(__CLR4_5_216m16mlwye79mt.R.iget(1557)!=0|true))||(__CLR4_5_216m16mlwye79mt.R.iget(1558)==0&false))) {{
                __CLR4_5_216m16mlwye79mt.R.inc(1559);response.getHeaders().add(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN, origin);
            }
        }}}
    }}finally{__CLR4_5_216m16mlwye79mt.R.flushNeeded();}}

}
