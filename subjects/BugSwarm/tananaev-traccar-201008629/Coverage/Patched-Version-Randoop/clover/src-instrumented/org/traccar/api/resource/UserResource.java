/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource extends BaseResource {public static class __CLR4_5_21ig1iglx1e0db7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,2025,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @GET
    public Collection<User> get(@QueryParam("userId") long userId) throws SQLException {try{__CLR4_5_21ig1iglx1e0db7.R.inc(1960);
        __CLR4_5_21ig1iglx1e0db7.R.inc(1961);if ((((Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1962)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1963)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(1964);if ((((userId != 0)&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1965)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1966)==0&false))) {{
                __CLR4_5_21ig1iglx1e0db7.R.inc(1967);return Context.getPermissionsManager().getUsers(userId);
            } }else {{
                __CLR4_5_21ig1iglx1e0db7.R.inc(1968);return Context.getPermissionsManager().getAllUsers();
            }
        }} }else {__CLR4_5_21ig1iglx1e0db7.R.inc(1969);if ((((Context.getPermissionsManager().isManager(getUserId()))&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1970)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1971)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(1972);return Context.getPermissionsManager().getManagedUsers(getUserId());
        } }else {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(1973);throw new SecurityException("Admin or manager access required");
        }
    }}}finally{__CLR4_5_21ig1iglx1e0db7.R.flushNeeded();}}

    @PermitAll
    @POST
    public Response add(User entity) throws SQLException {try{__CLR4_5_21ig1iglx1e0db7.R.inc(1974);
        __CLR4_5_21ig1iglx1e0db7.R.inc(1975);if ((((!Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1976)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1977)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(1978);Context.getPermissionsManager().checkUserUpdate(getUserId(), new User(), entity);
            __CLR4_5_21ig1iglx1e0db7.R.inc(1979);if ((((Context.getPermissionsManager().isManager(getUserId()))&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1980)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1981)==0&false))) {{
                __CLR4_5_21ig1iglx1e0db7.R.inc(1982);Context.getPermissionsManager().checkUserLimit(getUserId());
            } }else {{
                __CLR4_5_21ig1iglx1e0db7.R.inc(1983);Context.getPermissionsManager().checkRegistration(getUserId());
                __CLR4_5_21ig1iglx1e0db7.R.inc(1984);entity.setDeviceLimit(Context.getConfig().getInteger("users.defaultDeviceLimit", -1));
                __CLR4_5_21ig1iglx1e0db7.R.inc(1985);int expirationDays = Context.getConfig().getInteger("users.defaultExpirationDays");
                __CLR4_5_21ig1iglx1e0db7.R.inc(1986);if ((((expirationDays > 0)&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1987)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1988)==0&false))) {{
                    __CLR4_5_21ig1iglx1e0db7.R.inc(1989);entity.setExpirationTime(
                        new Date(System.currentTimeMillis() + (long) expirationDays * 24 * 3600 * 1000));
                }
            }}
        }}
        }__CLR4_5_21ig1iglx1e0db7.R.inc(1990);Context.getPermissionsManager().addUser(entity);
        __CLR4_5_21ig1iglx1e0db7.R.inc(1991);if ((((Context.getPermissionsManager().isManager(getUserId()))&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1992)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1993)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(1994);Context.getDataManager().linkUser(getUserId(), entity.getId());
        }
        }__CLR4_5_21ig1iglx1e0db7.R.inc(1995);Context.getPermissionsManager().refreshUserPermissions();
        __CLR4_5_21ig1iglx1e0db7.R.inc(1996);if ((((Context.getNotificationManager() != null)&&(__CLR4_5_21ig1iglx1e0db7.R.iget(1997)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(1998)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(1999);Context.getNotificationManager().refresh();
        }
        }__CLR4_5_21ig1iglx1e0db7.R.inc(2000);return Response.ok(entity).build();
    }finally{__CLR4_5_21ig1iglx1e0db7.R.flushNeeded();}}

    @Path("{id}")
    @PUT
    public Response update(User entity) throws SQLException {try{__CLR4_5_21ig1iglx1e0db7.R.inc(2001);
        __CLR4_5_21ig1iglx1e0db7.R.inc(2002);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21ig1iglx1e0db7.R.inc(2003);User before = Context.getPermissionsManager().getUser(entity.getId());
        __CLR4_5_21ig1iglx1e0db7.R.inc(2004);Context.getPermissionsManager().checkUser(getUserId(), entity.getId());
        __CLR4_5_21ig1iglx1e0db7.R.inc(2005);Context.getPermissionsManager().checkUserUpdate(getUserId(), before, entity);
        __CLR4_5_21ig1iglx1e0db7.R.inc(2006);Context.getPermissionsManager().updateUser(entity);
        __CLR4_5_21ig1iglx1e0db7.R.inc(2007);if ((((Context.getNotificationManager() != null)&&(__CLR4_5_21ig1iglx1e0db7.R.iget(2008)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(2009)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(2010);Context.getNotificationManager().refresh();
        }
        }__CLR4_5_21ig1iglx1e0db7.R.inc(2011);return Response.ok(entity).build();
    }finally{__CLR4_5_21ig1iglx1e0db7.R.flushNeeded();}}

    @Path("{id}")
    @DELETE
    public Response remove(@PathParam("id") long id) throws SQLException {try{__CLR4_5_21ig1iglx1e0db7.R.inc(2012);
        __CLR4_5_21ig1iglx1e0db7.R.inc(2013);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21ig1iglx1e0db7.R.inc(2014);Context.getPermissionsManager().checkUser(getUserId(), id);
        __CLR4_5_21ig1iglx1e0db7.R.inc(2015);Context.getPermissionsManager().removeUser(id);
        __CLR4_5_21ig1iglx1e0db7.R.inc(2016);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_21ig1iglx1e0db7.R.iget(2017)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(2018)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(2019);Context.getGeofenceManager().refreshUserGeofences();
        }
        }__CLR4_5_21ig1iglx1e0db7.R.inc(2020);if ((((Context.getNotificationManager() != null)&&(__CLR4_5_21ig1iglx1e0db7.R.iget(2021)!=0|true))||(__CLR4_5_21ig1iglx1e0db7.R.iget(2022)==0&false))) {{
            __CLR4_5_21ig1iglx1e0db7.R.inc(2023);Context.getNotificationManager().refresh();
        }
        }__CLR4_5_21ig1iglx1e0db7.R.inc(2024);return Response.noContent().build();
    }finally{__CLR4_5_21ig1iglx1e0db7.R.flushNeeded();}}

}
