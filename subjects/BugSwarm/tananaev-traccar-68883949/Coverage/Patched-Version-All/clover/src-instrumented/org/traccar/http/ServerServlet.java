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
package org.traccar.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.traccar.Context;
import org.traccar.model.Server;

public class ServerServlet extends BaseServlet {public static class __CLR4_5_21o61o6lx1dsl03{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,2184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_21o61o6lx1dsl03.R.inc(2166);
        __CLR4_5_21o61o6lx1dsl03.R.inc(2167);if ((((command.equals("/get"))&&(__CLR4_5_21o61o6lx1dsl03.R.iget(2168)!=0|true))||(__CLR4_5_21o61o6lx1dsl03.R.iget(2169)==0&false))) {{
            __CLR4_5_21o61o6lx1dsl03.R.inc(2170);get(req, resp);
        } }else {__CLR4_5_21o61o6lx1dsl03.R.inc(2171);if ((((command.equals("/update"))&&(__CLR4_5_21o61o6lx1dsl03.R.iget(2172)!=0|true))||(__CLR4_5_21o61o6lx1dsl03.R.iget(2173)==0&false))) {{
            __CLR4_5_21o61o6lx1dsl03.R.inc(2174);update(req, resp);
        } }else {{
            __CLR4_5_21o61o6lx1dsl03.R.inc(2175);return false;
        }
        }}__CLR4_5_21o61o6lx1dsl03.R.inc(2176);return true;
    }finally{__CLR4_5_21o61o6lx1dsl03.R.flushNeeded();}}
    
    private void get(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_21o61o6lx1dsl03.R.inc(2177);
        __CLR4_5_21o61o6lx1dsl03.R.inc(2178);sendResponse(resp.getWriter(), JsonConverter.objectToJson(
                    Context.getDataManager().getServer()));
    }finally{__CLR4_5_21o61o6lx1dsl03.R.flushNeeded();}}
    
    private void update(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_21o61o6lx1dsl03.R.inc(2179);
        __CLR4_5_21o61o6lx1dsl03.R.inc(2180);Server server = JsonConverter.objectFromJson(req.getReader(), new Server());
        __CLR4_5_21o61o6lx1dsl03.R.inc(2181);Context.getPermissionsManager().checkAdmin(getUserId(req));
        __CLR4_5_21o61o6lx1dsl03.R.inc(2182);Context.getDataManager().updateServer(server);
        __CLR4_5_21o61o6lx1dsl03.R.inc(2183);sendResponse(resp.getWriter(), true);
    }finally{__CLR4_5_21o61o6lx1dsl03.R.flushNeeded();}}

}
