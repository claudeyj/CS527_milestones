/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Group;

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

@Path("groups")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GroupResource extends BaseResource {public static class __CLR4_5_21d31d3lx1dv9vf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,1812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @GET
    public Collection<Group> get(
            @QueryParam("all") boolean all, @QueryParam("userId") long userId) throws SQLException {try{__CLR4_5_21d31d3lx1dv9vf.R.inc(1767);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1768);if ((((all)&&(__CLR4_5_21d31d3lx1dv9vf.R.iget(1769)!=0|true))||(__CLR4_5_21d31d3lx1dv9vf.R.iget(1770)==0&false))) {{
            __CLR4_5_21d31d3lx1dv9vf.R.inc(1771);if ((((Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_21d31d3lx1dv9vf.R.iget(1772)!=0|true))||(__CLR4_5_21d31d3lx1dv9vf.R.iget(1773)==0&false))) {{
                __CLR4_5_21d31d3lx1dv9vf.R.inc(1774);return Context.getDeviceManager().getAllGroups();
            } }else {{
                __CLR4_5_21d31d3lx1dv9vf.R.inc(1775);Context.getPermissionsManager().checkManager(getUserId());
                __CLR4_5_21d31d3lx1dv9vf.R.inc(1776);return Context.getDeviceManager().getManagedGroups(getUserId());
            }
        }} }else {{
            __CLR4_5_21d31d3lx1dv9vf.R.inc(1777);if ((((userId == 0)&&(__CLR4_5_21d31d3lx1dv9vf.R.iget(1778)!=0|true))||(__CLR4_5_21d31d3lx1dv9vf.R.iget(1779)==0&false))) {{
                __CLR4_5_21d31d3lx1dv9vf.R.inc(1780);userId = getUserId();
            }
            }__CLR4_5_21d31d3lx1dv9vf.R.inc(1781);Context.getPermissionsManager().checkUser(getUserId(), userId);
            __CLR4_5_21d31d3lx1dv9vf.R.inc(1782);return Context.getDeviceManager().getGroups(userId);
        }
    }}finally{__CLR4_5_21d31d3lx1dv9vf.R.flushNeeded();}}

    @POST
    public Response add(Group entity) throws SQLException {try{__CLR4_5_21d31d3lx1dv9vf.R.inc(1783);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1784);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1785);Context.getDeviceManager().addGroup(entity);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1786);Context.getDataManager().linkGroup(getUserId(), entity.getId());
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1787);Context.getPermissionsManager().refreshPermissions();
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1788);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_21d31d3lx1dv9vf.R.iget(1789)!=0|true))||(__CLR4_5_21d31d3lx1dv9vf.R.iget(1790)==0&false))) {{
            __CLR4_5_21d31d3lx1dv9vf.R.inc(1791);Context.getGeofenceManager().refresh();
        }
        }__CLR4_5_21d31d3lx1dv9vf.R.inc(1792);return Response.ok(entity).build();
    }finally{__CLR4_5_21d31d3lx1dv9vf.R.flushNeeded();}}

    @Path("{id}")
    @PUT
    public Response update(Group entity) throws SQLException {try{__CLR4_5_21d31d3lx1dv9vf.R.inc(1793);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1794);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1795);Context.getPermissionsManager().checkGroup(getUserId(), entity.getId());
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1796);Context.getDeviceManager().updateGroup(entity);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1797);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_21d31d3lx1dv9vf.R.iget(1798)!=0|true))||(__CLR4_5_21d31d3lx1dv9vf.R.iget(1799)==0&false))) {{
            __CLR4_5_21d31d3lx1dv9vf.R.inc(1800);Context.getGeofenceManager().refresh();
        }
        }__CLR4_5_21d31d3lx1dv9vf.R.inc(1801);return Response.ok(entity).build();
    }finally{__CLR4_5_21d31d3lx1dv9vf.R.flushNeeded();}}

    @Path("{id}")
    @DELETE
    public Response remove(@PathParam("id") long id) throws SQLException {try{__CLR4_5_21d31d3lx1dv9vf.R.inc(1802);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1803);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1804);Context.getPermissionsManager().checkGroup(getUserId(), id);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1805);Context.getDeviceManager().removeGroup(id);
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1806);Context.getPermissionsManager().refreshPermissions();
        __CLR4_5_21d31d3lx1dv9vf.R.inc(1807);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_21d31d3lx1dv9vf.R.iget(1808)!=0|true))||(__CLR4_5_21d31d3lx1dv9vf.R.iget(1809)==0&false))) {{
            __CLR4_5_21d31d3lx1dv9vf.R.inc(1810);Context.getGeofenceManager().refresh();
        }
        }__CLR4_5_21d31d3lx1dv9vf.R.inc(1811);return Response.noContent().build();
    }finally{__CLR4_5_21d31d3lx1dv9vf.R.flushNeeded();}}

}
