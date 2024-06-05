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

import org.traccar.Context;
import org.traccar.api.resource.SessionResource;
import org.traccar.helper.Log;
import org.traccar.model.User;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.bind.DatatypeConverter;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

public class SecurityRequestFilter implements ContainerRequestFilter {public static class __CLR4_5_218b18blwye3uzy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,1648,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    public static final String BASIC_REALM = "Basic realm=\"api\"";
    public static final String X_REQUESTED_WITH = "X-Requested-With";
    public static final String XML_HTTP_REQUEST = "XMLHttpRequest";

    public static String[] decodeBasicAuth(String auth) {try{__CLR4_5_218b18blwye3uzy.R.inc(1595);
        __CLR4_5_218b18blwye3uzy.R.inc(1596);auth = auth.replaceFirst("[B|b]asic ", "");
        __CLR4_5_218b18blwye3uzy.R.inc(1597);byte[] decodedBytes = DatatypeConverter.parseBase64Binary(auth);
        __CLR4_5_218b18blwye3uzy.R.inc(1598);if ((((decodedBytes != null && decodedBytes.length > 0)&&(__CLR4_5_218b18blwye3uzy.R.iget(1599)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1600)==0&false))) {{
            __CLR4_5_218b18blwye3uzy.R.inc(1601);return new String(decodedBytes, StandardCharsets.US_ASCII).split(":", 2);
        }
        }__CLR4_5_218b18blwye3uzy.R.inc(1602);return null;
    }finally{__CLR4_5_218b18blwye3uzy.R.flushNeeded();}}

    @javax.ws.rs.core.Context
    private HttpServletRequest request;

    @javax.ws.rs.core.Context
    private ResourceInfo resourceInfo;

    @Override
    public void filter(ContainerRequestContext requestContext) {try{__CLR4_5_218b18blwye3uzy.R.inc(1603);

        __CLR4_5_218b18blwye3uzy.R.inc(1604);if ((((requestContext.getMethod().equals("OPTIONS"))&&(__CLR4_5_218b18blwye3uzy.R.iget(1605)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1606)==0&false))) {{
            __CLR4_5_218b18blwye3uzy.R.inc(1607);return;
        }

        }__CLR4_5_218b18blwye3uzy.R.inc(1608);SecurityContext securityContext = null;

        __CLR4_5_218b18blwye3uzy.R.inc(1609);try {

            __CLR4_5_218b18blwye3uzy.R.inc(1610);String authHeader = requestContext.getHeaderString(AUTHORIZATION_HEADER);
            __CLR4_5_218b18blwye3uzy.R.inc(1611);if ((((authHeader != null)&&(__CLR4_5_218b18blwye3uzy.R.iget(1612)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1613)==0&false))) {{

                __CLR4_5_218b18blwye3uzy.R.inc(1614);try {
                    __CLR4_5_218b18blwye3uzy.R.inc(1615);String[] auth = decodeBasicAuth(authHeader);
                    __CLR4_5_218b18blwye3uzy.R.inc(1616);User user = Context.getPermissionsManager().login(auth[0], auth[1]);
                    __CLR4_5_218b18blwye3uzy.R.inc(1617);if ((((user != null)&&(__CLR4_5_218b18blwye3uzy.R.iget(1618)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1619)==0&false))) {{
                        __CLR4_5_218b18blwye3uzy.R.inc(1620);Context.getStatisticsManager().registerRequest(user.getId());
                        __CLR4_5_218b18blwye3uzy.R.inc(1621);securityContext = new UserSecurityContext(new UserPrincipal(user.getId()));
                    }
                }} catch (SQLException e) {
                    __CLR4_5_218b18blwye3uzy.R.inc(1622);throw new WebApplicationException(e);
                }

            } }else {__CLR4_5_218b18blwye3uzy.R.inc(1623);if ((((request.getSession() != null)&&(__CLR4_5_218b18blwye3uzy.R.iget(1624)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1625)==0&false))) {{

                __CLR4_5_218b18blwye3uzy.R.inc(1626);Long userId = (Long) request.getSession().getAttribute(SessionResource.USER_ID_KEY);
                __CLR4_5_218b18blwye3uzy.R.inc(1627);if ((((userId != null)&&(__CLR4_5_218b18blwye3uzy.R.iget(1628)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1629)==0&false))) {{
                    __CLR4_5_218b18blwye3uzy.R.inc(1630);Context.getPermissionsManager().checkUserEnabled(userId);
                    __CLR4_5_218b18blwye3uzy.R.inc(1631);Context.getStatisticsManager().registerRequest(userId);
                    __CLR4_5_218b18blwye3uzy.R.inc(1632);securityContext = new UserSecurityContext(new UserPrincipal(userId));
                }

            }}

        }}} catch (SecurityException e) {
            __CLR4_5_218b18blwye3uzy.R.inc(1633);Log.warning(e);
        }

        __CLR4_5_218b18blwye3uzy.R.inc(1634);if ((((securityContext != null)&&(__CLR4_5_218b18blwye3uzy.R.iget(1635)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1636)==0&false))) {{
            __CLR4_5_218b18blwye3uzy.R.inc(1637);requestContext.setSecurityContext(securityContext);
        } }else {{
            __CLR4_5_218b18blwye3uzy.R.inc(1638);Method method = resourceInfo.getResourceMethod();
            __CLR4_5_218b18blwye3uzy.R.inc(1639);if ((((!method.isAnnotationPresent(PermitAll.class))&&(__CLR4_5_218b18blwye3uzy.R.iget(1640)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1641)==0&false))) {{
                __CLR4_5_218b18blwye3uzy.R.inc(1642);Response.ResponseBuilder responseBuilder = Response.status(Response.Status.UNAUTHORIZED);
                __CLR4_5_218b18blwye3uzy.R.inc(1643);if ((((!XML_HTTP_REQUEST.equals(request.getHeader(X_REQUESTED_WITH)))&&(__CLR4_5_218b18blwye3uzy.R.iget(1644)!=0|true))||(__CLR4_5_218b18blwye3uzy.R.iget(1645)==0&false))) {{
                    __CLR4_5_218b18blwye3uzy.R.inc(1646);responseBuilder.header(WWW_AUTHENTICATE, BASIC_REALM);
                }
                }__CLR4_5_218b18blwye3uzy.R.inc(1647);throw new WebApplicationException(responseBuilder.build());
            }
        }}

    }}finally{__CLR4_5_218b18blwye3uzy.R.flushNeeded();}}

}
