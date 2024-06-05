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
package org.traccar.web;

import org.traccar.helper.Log;

import java.io.IOException;
import java.io.Writer;
import java.security.AccessControlException;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonStructure;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet {public static class __CLR4_5_292b92blx1e69rt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,11785,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public static final String USER_KEY = "user";
    
    @Override
    protected final void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {try{__CLR4_5_292b92blx1e69rt.R.inc(11747);
        __CLR4_5_292b92blx1e69rt.R.inc(11748);String command = req.getPathInfo();
        __CLR4_5_292b92blx1e69rt.R.inc(11749);if ((((command == null)&&(__CLR4_5_292b92blx1e69rt.R.iget(11750)!=0|true))||(__CLR4_5_292b92blx1e69rt.R.iget(11751)==0&false))) {{
            __CLR4_5_292b92blx1e69rt.R.inc(11752);command = "";
        }
        }__CLR4_5_292b92blx1e69rt.R.inc(11753);try {
            __CLR4_5_292b92blx1e69rt.R.inc(11754);resp.setContentType("application/json");
            __CLR4_5_292b92blx1e69rt.R.inc(11755);resp.setCharacterEncoding("UTF-8");
            __CLR4_5_292b92blx1e69rt.R.inc(11756);resp.setHeader("Access-Control-Allow-Origin", "*");
            __CLR4_5_292b92blx1e69rt.R.inc(11757);resp.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            __CLR4_5_292b92blx1e69rt.R.inc(11758);resp.setHeader("Access-Control-Allow-Methods", "GET, POST");
            __CLR4_5_292b92blx1e69rt.R.inc(11759);if ((((!handle(command, req, resp))&&(__CLR4_5_292b92blx1e69rt.R.iget(11760)!=0|true))||(__CLR4_5_292b92blx1e69rt.R.iget(11761)==0&false))) {{
                __CLR4_5_292b92blx1e69rt.R.inc(11762);resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        }} catch (Exception error) {
            __CLR4_5_292b92blx1e69rt.R.inc(11763);sendResponse(resp.getWriter(), error);
        }
    }finally{__CLR4_5_292b92blx1e69rt.R.flushNeeded();}}
    
    protected abstract boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception;
    
    public long getUserId(HttpServletRequest req) {try{__CLR4_5_292b92blx1e69rt.R.inc(11764);
        __CLR4_5_292b92blx1e69rt.R.inc(11765);Long userId = (Long) req.getSession().getAttribute(USER_KEY);
        __CLR4_5_292b92blx1e69rt.R.inc(11766);if ((((userId == null)&&(__CLR4_5_292b92blx1e69rt.R.iget(11767)!=0|true))||(__CLR4_5_292b92blx1e69rt.R.iget(11768)==0&false))) {{
            __CLR4_5_292b92blx1e69rt.R.inc(11769);throw new AccessControlException("User not logged in");
        }
        }__CLR4_5_292b92blx1e69rt.R.inc(11770);return userId;
    }finally{__CLR4_5_292b92blx1e69rt.R.flushNeeded();}}
    
    public void sendResponse(Writer writer, boolean success) throws IOException {try{__CLR4_5_292b92blx1e69rt.R.inc(11771);
        __CLR4_5_292b92blx1e69rt.R.inc(11772);JsonObjectBuilder result = Json.createObjectBuilder();
        __CLR4_5_292b92blx1e69rt.R.inc(11773);result.add("success", success);
        __CLR4_5_292b92blx1e69rt.R.inc(11774);writer.write(result.build().toString());
    }finally{__CLR4_5_292b92blx1e69rt.R.flushNeeded();}}
    
    public void sendResponse(Writer writer, JsonStructure json) throws IOException {try{__CLR4_5_292b92blx1e69rt.R.inc(11775);
        __CLR4_5_292b92blx1e69rt.R.inc(11776);JsonObjectBuilder result = Json.createObjectBuilder();
        __CLR4_5_292b92blx1e69rt.R.inc(11777);result.add("success", true);
        __CLR4_5_292b92blx1e69rt.R.inc(11778);result.add("data", json);
        __CLR4_5_292b92blx1e69rt.R.inc(11779);writer.write(result.build().toString());
    }finally{__CLR4_5_292b92blx1e69rt.R.flushNeeded();}}
    
    public void sendResponse(Writer writer, Exception error) throws IOException {try{__CLR4_5_292b92blx1e69rt.R.inc(11780);
        __CLR4_5_292b92blx1e69rt.R.inc(11781);JsonObjectBuilder result = Json.createObjectBuilder();
        __CLR4_5_292b92blx1e69rt.R.inc(11782);result.add("success", false);
        __CLR4_5_292b92blx1e69rt.R.inc(11783);result.add("error", Log.exceptionStack(error));
        __CLR4_5_292b92blx1e69rt.R.inc(11784);writer.write(result.build().toString());
    }finally{__CLR4_5_292b92blx1e69rt.R.flushNeeded();}}
    
}
