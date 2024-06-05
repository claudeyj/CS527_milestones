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
import org.traccar.model.User;

public abstract class BaseServlet extends HttpServlet {public static class __CLR4_5_21gl1gllx1do7ue{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,1931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public static final String USER_KEY = "user";
    
    @Override
    protected final void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {try{__CLR4_5_21gl1gllx1do7ue.R.inc(1893);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1894);String command = req.getPathInfo();
        __CLR4_5_21gl1gllx1do7ue.R.inc(1895);try {
            __CLR4_5_21gl1gllx1do7ue.R.inc(1896);if ((((command == null || !handle(command, req, resp))&&(__CLR4_5_21gl1gllx1do7ue.R.iget(1897)!=0|true))||(__CLR4_5_21gl1gllx1do7ue.R.iget(1898)==0&false))) {{
                __CLR4_5_21gl1gllx1do7ue.R.inc(1899);resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        }} catch (Exception error) {
            __CLR4_5_21gl1gllx1do7ue.R.inc(1900);sendResponse(resp.getWriter(), error);
        }
    }finally{__CLR4_5_21gl1gllx1do7ue.R.flushNeeded();}}
    
    protected abstract boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception;
    
    public long getUserId(HttpServletRequest req) {try{__CLR4_5_21gl1gllx1do7ue.R.inc(1901);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1902);User user = (User) req.getSession().getAttribute(USER_KEY);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1903);if ((((user == null)&&(__CLR4_5_21gl1gllx1do7ue.R.iget(1904)!=0|true))||(__CLR4_5_21gl1gllx1do7ue.R.iget(1905)==0&false))) {{
            __CLR4_5_21gl1gllx1do7ue.R.inc(1906);throw new AccessControlException("User not logged in");
        }
        }__CLR4_5_21gl1gllx1do7ue.R.inc(1907);return user.getId();
    }finally{__CLR4_5_21gl1gllx1do7ue.R.flushNeeded();}}
    
    public void securityCheck(boolean check) throws SecurityException {try{__CLR4_5_21gl1gllx1do7ue.R.inc(1908);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1909);if ((((!check)&&(__CLR4_5_21gl1gllx1do7ue.R.iget(1910)!=0|true))||(__CLR4_5_21gl1gllx1do7ue.R.iget(1911)==0&false))) {{
            __CLR4_5_21gl1gllx1do7ue.R.inc(1912);throw new SecurityException("Access denied");
        }
    }}finally{__CLR4_5_21gl1gllx1do7ue.R.flushNeeded();}}
    
    public void sendResponse(Writer writer, boolean success) throws IOException {try{__CLR4_5_21gl1gllx1do7ue.R.inc(1913);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1914);JsonObjectBuilder result = Json.createObjectBuilder();
        __CLR4_5_21gl1gllx1do7ue.R.inc(1915);result.add("success", success);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1916);writer.write(result.build().toString());
    }finally{__CLR4_5_21gl1gllx1do7ue.R.flushNeeded();}}
    
    public void sendResponse(Writer writer, JsonStructure json) throws IOException {try{__CLR4_5_21gl1gllx1do7ue.R.inc(1917);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1918);JsonObjectBuilder result = Json.createObjectBuilder();
        __CLR4_5_21gl1gllx1do7ue.R.inc(1919);result.add("success", true);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1920);result.add("data", json);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1921);writer.write(result.build().toString());
    }finally{__CLR4_5_21gl1gllx1do7ue.R.flushNeeded();}}
    
    public void sendResponse(Writer writer, Exception error) throws IOException {try{__CLR4_5_21gl1gllx1do7ue.R.inc(1922);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1923);JsonObjectBuilder result = Json.createObjectBuilder();
        __CLR4_5_21gl1gllx1do7ue.R.inc(1924);result.add("success", false);
        __CLR4_5_21gl1gllx1do7ue.R.inc(1925);if ((((error.getMessage() != null)&&(__CLR4_5_21gl1gllx1do7ue.R.iget(1926)!=0|true))||(__CLR4_5_21gl1gllx1do7ue.R.iget(1927)==0&false))) {{
            __CLR4_5_21gl1gllx1do7ue.R.inc(1928);result.add("error", error.getMessage());
        } }else {{
            __CLR4_5_21gl1gllx1do7ue.R.inc(1929);result.add("error", error.getClass().getSimpleName());
        }
        }__CLR4_5_21gl1gllx1do7ue.R.inc(1930);writer.write(result.build().toString());
    }finally{__CLR4_5_21gl1gllx1do7ue.R.flushNeeded();}}
    
}
