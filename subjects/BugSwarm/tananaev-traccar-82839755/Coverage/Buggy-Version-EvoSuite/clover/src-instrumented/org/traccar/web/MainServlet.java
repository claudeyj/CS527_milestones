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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.traccar.Context;
import org.traccar.model.User;

@java.lang.SuppressWarnings({"fallthrough"}) public class MainServlet extends BaseServlet {public static class __CLR4_5_2985985lx1e38nr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,11996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_2985985lx1e38nr.R.inc(11957);
        
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2985985lx1e38nr.R.inc(11958);switch (command) {
            case "/session":if (!__CLB4_5_2_bool0) {__CLR4_5_2985985lx1e38nr.R.inc(11959);__CLB4_5_2_bool0=true;}
                __CLR4_5_2985985lx1e38nr.R.inc(11960);session(req, resp);
                __CLR4_5_2985985lx1e38nr.R.inc(11961);break;
            case "/login":if (!__CLB4_5_2_bool0) {__CLR4_5_2985985lx1e38nr.R.inc(11962);__CLB4_5_2_bool0=true;}
                __CLR4_5_2985985lx1e38nr.R.inc(11963);login(req, resp);
                __CLR4_5_2985985lx1e38nr.R.inc(11964);break;
            case "/logout":if (!__CLB4_5_2_bool0) {__CLR4_5_2985985lx1e38nr.R.inc(11965);__CLB4_5_2_bool0=true;}
                __CLR4_5_2985985lx1e38nr.R.inc(11966);logout(req, resp);
                __CLR4_5_2985985lx1e38nr.R.inc(11967);break;
            case "/register":if (!__CLB4_5_2_bool0) {__CLR4_5_2985985lx1e38nr.R.inc(11968);__CLB4_5_2_bool0=true;}
                __CLR4_5_2985985lx1e38nr.R.inc(11969);register(req, resp);
                __CLR4_5_2985985lx1e38nr.R.inc(11970);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2985985lx1e38nr.R.inc(11971);__CLB4_5_2_bool0=true;}
                __CLR4_5_2985985lx1e38nr.R.inc(11972);return false;
        }
        __CLR4_5_2985985lx1e38nr.R.inc(11973);return true;        
    }finally{__CLR4_5_2985985lx1e38nr.R.flushNeeded();}}

    private void session(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_2985985lx1e38nr.R.inc(11974);
        __CLR4_5_2985985lx1e38nr.R.inc(11975);Long userId = (Long) req.getSession().getAttribute(USER_KEY);
        __CLR4_5_2985985lx1e38nr.R.inc(11976);if ((((userId != null)&&(__CLR4_5_2985985lx1e38nr.R.iget(11977)!=0|true))||(__CLR4_5_2985985lx1e38nr.R.iget(11978)==0&false))) {{
            __CLR4_5_2985985lx1e38nr.R.inc(11979);sendResponse(resp.getWriter(), JsonConverter.objectToJson(
                    Context.getDataManager().getUser(userId)));
        } }else {{
            __CLR4_5_2985985lx1e38nr.R.inc(11980);sendResponse(resp.getWriter(), false);
        }
    }}finally{__CLR4_5_2985985lx1e38nr.R.flushNeeded();}}

    private void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_2985985lx1e38nr.R.inc(11981);
        __CLR4_5_2985985lx1e38nr.R.inc(11982);User user = Context.getDataManager().login(
                req.getParameter("email"), req.getParameter("password"));
        __CLR4_5_2985985lx1e38nr.R.inc(11983);if ((((user != null)&&(__CLR4_5_2985985lx1e38nr.R.iget(11984)!=0|true))||(__CLR4_5_2985985lx1e38nr.R.iget(11985)==0&false))) {{
            __CLR4_5_2985985lx1e38nr.R.inc(11986);req.getSession().setAttribute(USER_KEY, user.getId());
            __CLR4_5_2985985lx1e38nr.R.inc(11987);sendResponse(resp.getWriter(), JsonConverter.objectToJson(user));
        } }else {{
            __CLR4_5_2985985lx1e38nr.R.inc(11988);sendResponse(resp.getWriter(), false);
        }
    }}finally{__CLR4_5_2985985lx1e38nr.R.flushNeeded();}}

    private void logout(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_2985985lx1e38nr.R.inc(11989);
        __CLR4_5_2985985lx1e38nr.R.inc(11990);req.getSession().removeAttribute(USER_KEY);
        __CLR4_5_2985985lx1e38nr.R.inc(11991);sendResponse(resp.getWriter(), true);
    }finally{__CLR4_5_2985985lx1e38nr.R.flushNeeded();}}

    private void register(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_2985985lx1e38nr.R.inc(11992);
        __CLR4_5_2985985lx1e38nr.R.inc(11993);User user = JsonConverter.objectFromJson(req.getReader(), new User());
        __CLR4_5_2985985lx1e38nr.R.inc(11994);Context.getDataManager().addUser(user);
        __CLR4_5_2985985lx1e38nr.R.inc(11995);sendResponse(resp.getWriter(), true);
    }finally{__CLR4_5_2985985lx1e38nr.R.flushNeeded();}}

}
