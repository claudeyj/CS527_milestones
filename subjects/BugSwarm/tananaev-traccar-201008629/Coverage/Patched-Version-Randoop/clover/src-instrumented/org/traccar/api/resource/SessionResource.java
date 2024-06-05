/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
package org.traccar.api.resource;

import org.traccar.Context;
import org.traccar.api.BaseResource;
import org.traccar.model.User;

import javax.annotation.security.PermitAll;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("session")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class SessionResource extends BaseResource {public static class __CLR4_5_21gg1gglx1e0dab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,1944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String USER_ID_KEY = "userId";
    public static final String USER_COOKIE_KEY = "user";
    public static final String PASS_COOKIE_KEY = "password";

    @javax.ws.rs.core.Context
    private HttpServletRequest request;

    @PermitAll
    @GET
    public User get(@QueryParam("token") String token) throws SQLException {try{__CLR4_5_21gg1gglx1e0dab.R.inc(1888);
        __CLR4_5_21gg1gglx1e0dab.R.inc(1889);Long userId = (Long) request.getSession().getAttribute(USER_ID_KEY);
        __CLR4_5_21gg1gglx1e0dab.R.inc(1890);if ((((userId == null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1891)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1892)==0&false))) {{
            __CLR4_5_21gg1gglx1e0dab.R.inc(1893);Cookie[] cookies = request.getCookies();
            __CLR4_5_21gg1gglx1e0dab.R.inc(1894);String email = null, password = null;
            __CLR4_5_21gg1gglx1e0dab.R.inc(1895);if ((((cookies != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1896)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1897)==0&false))) {{
                __CLR4_5_21gg1gglx1e0dab.R.inc(1898);for (int i = 0; (((i < cookies.length)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1899)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1900)==0&false)); i++) {{
                    __CLR4_5_21gg1gglx1e0dab.R.inc(1901);if ((((cookies[i].getName().equals(USER_COOKIE_KEY))&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1902)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1903)==0&false))) {{
                        __CLR4_5_21gg1gglx1e0dab.R.inc(1904);email = cookies[i].getValue();
                    }
                    }__CLR4_5_21gg1gglx1e0dab.R.inc(1905);if ((((cookies[i].getName().equals(PASS_COOKIE_KEY))&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1906)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1907)==0&false))) {{
                        __CLR4_5_21gg1gglx1e0dab.R.inc(1908);password = cookies[i].getValue();
                    }
                }}
            }}
            }__CLR4_5_21gg1gglx1e0dab.R.inc(1909);if ((((email != null && password != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1910)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1911)==0&false))) {{
                __CLR4_5_21gg1gglx1e0dab.R.inc(1912);User user = Context.getPermissionsManager().login(email, password);
                __CLR4_5_21gg1gglx1e0dab.R.inc(1913);if ((((user != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1914)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1915)==0&false))) {{
                    __CLR4_5_21gg1gglx1e0dab.R.inc(1916);userId = user.getId();
                    __CLR4_5_21gg1gglx1e0dab.R.inc(1917);request.getSession().setAttribute(USER_ID_KEY, userId);
                }
            }} }else {__CLR4_5_21gg1gglx1e0dab.R.inc(1918);if ((((token != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1919)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1920)==0&false))) {{
                __CLR4_5_21gg1gglx1e0dab.R.inc(1921);User user = Context.getPermissionsManager().getUserByToken(token);
                __CLR4_5_21gg1gglx1e0dab.R.inc(1922);if ((((user != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1923)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1924)==0&false))) {{
                    __CLR4_5_21gg1gglx1e0dab.R.inc(1925);userId = user.getId();
                    __CLR4_5_21gg1gglx1e0dab.R.inc(1926);request.getSession().setAttribute(USER_ID_KEY, userId);
                }
            }}
        }}}

        }__CLR4_5_21gg1gglx1e0dab.R.inc(1927);if ((((userId != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1928)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1929)==0&false))) {{
            __CLR4_5_21gg1gglx1e0dab.R.inc(1930);Context.getPermissionsManager().checkUserEnabled(userId);
            __CLR4_5_21gg1gglx1e0dab.R.inc(1931);return Context.getPermissionsManager().getUser(userId);
        } }else {{
            __CLR4_5_21gg1gglx1e0dab.R.inc(1932);throw new WebApplicationException(Response.status(Response.Status.NOT_FOUND).build());
        }
    }}finally{__CLR4_5_21gg1gglx1e0dab.R.flushNeeded();}}

    @PermitAll
    @POST
    public User add(
            @FormParam("email") String email, @FormParam("password") String password) throws SQLException {try{__CLR4_5_21gg1gglx1e0dab.R.inc(1933);
        __CLR4_5_21gg1gglx1e0dab.R.inc(1934);User user = Context.getPermissionsManager().login(email, password);
        __CLR4_5_21gg1gglx1e0dab.R.inc(1935);if ((((user != null)&&(__CLR4_5_21gg1gglx1e0dab.R.iget(1936)!=0|true))||(__CLR4_5_21gg1gglx1e0dab.R.iget(1937)==0&false))) {{
            __CLR4_5_21gg1gglx1e0dab.R.inc(1938);request.getSession().setAttribute(USER_ID_KEY, user.getId());
            __CLR4_5_21gg1gglx1e0dab.R.inc(1939);return user;
        } }else {{
            __CLR4_5_21gg1gglx1e0dab.R.inc(1940);throw new WebApplicationException(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }}finally{__CLR4_5_21gg1gglx1e0dab.R.flushNeeded();}}

    @DELETE
    public Response remove() {try{__CLR4_5_21gg1gglx1e0dab.R.inc(1941);
        __CLR4_5_21gg1gglx1e0dab.R.inc(1942);request.getSession().removeAttribute(USER_ID_KEY);
        __CLR4_5_21gg1gglx1e0dab.R.inc(1943);return Response.noContent().build();
    }finally{__CLR4_5_21gg1gglx1e0dab.R.flushNeeded();}}

}
