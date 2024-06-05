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
import org.traccar.database.GeofenceManager;
import org.traccar.model.Geofence;

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
import java.util.HashSet;
import java.util.Set;

@Path("geofences")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GeofenceResource extends BaseResource {public static class __CLR4_5_21ap1aplx1dxkem{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,1731,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @GET
    public Collection<Geofence> get(
            @QueryParam("all") boolean all, @QueryParam("userId") long userId, @QueryParam("groupId") long groupId,
            @QueryParam("deviceId") long deviceId, @QueryParam("refresh") boolean refresh) throws SQLException {try{__CLR4_5_21ap1aplx1dxkem.R.inc(1681);

        __CLR4_5_21ap1aplx1dxkem.R.inc(1682);GeofenceManager geofenceManager = Context.getGeofenceManager();
        __CLR4_5_21ap1aplx1dxkem.R.inc(1683);if ((((refresh)&&(__CLR4_5_21ap1aplx1dxkem.R.iget(1684)!=0|true))||(__CLR4_5_21ap1aplx1dxkem.R.iget(1685)==0&false))) {{
            __CLR4_5_21ap1aplx1dxkem.R.inc(1686);geofenceManager.refreshGeofences();
        }

        }__CLR4_5_21ap1aplx1dxkem.R.inc(1687);Set<Long> result = new HashSet<>();
        __CLR4_5_21ap1aplx1dxkem.R.inc(1688);if ((((all)&&(__CLR4_5_21ap1aplx1dxkem.R.iget(1689)!=0|true))||(__CLR4_5_21ap1aplx1dxkem.R.iget(1690)==0&false))) {{
            __CLR4_5_21ap1aplx1dxkem.R.inc(1691);if ((((Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_21ap1aplx1dxkem.R.iget(1692)!=0|true))||(__CLR4_5_21ap1aplx1dxkem.R.iget(1693)==0&false))) {{
                __CLR4_5_21ap1aplx1dxkem.R.inc(1694);result.addAll(geofenceManager.getAllGeofencesIds());
            } }else {{
                __CLR4_5_21ap1aplx1dxkem.R.inc(1695);Context.getPermissionsManager().checkManager(getUserId());
                __CLR4_5_21ap1aplx1dxkem.R.inc(1696);result.addAll(geofenceManager.getManagedGeofencesIds(getUserId()));
            }
        }} }else {{
            __CLR4_5_21ap1aplx1dxkem.R.inc(1697);if ((((userId == 0)&&(__CLR4_5_21ap1aplx1dxkem.R.iget(1698)!=0|true))||(__CLR4_5_21ap1aplx1dxkem.R.iget(1699)==0&false))) {{
                __CLR4_5_21ap1aplx1dxkem.R.inc(1700);userId = getUserId();
            }
            }__CLR4_5_21ap1aplx1dxkem.R.inc(1701);Context.getPermissionsManager().checkUser(getUserId(), userId);
            __CLR4_5_21ap1aplx1dxkem.R.inc(1702);result.addAll(geofenceManager.getUserGeofencesIds(userId));
        }

        }__CLR4_5_21ap1aplx1dxkem.R.inc(1703);if ((((groupId != 0)&&(__CLR4_5_21ap1aplx1dxkem.R.iget(1704)!=0|true))||(__CLR4_5_21ap1aplx1dxkem.R.iget(1705)==0&false))) {{
            __CLR4_5_21ap1aplx1dxkem.R.inc(1706);Context.getPermissionsManager().checkGroup(getUserId(), groupId);
            __CLR4_5_21ap1aplx1dxkem.R.inc(1707);result.retainAll(geofenceManager.getGroupGeofencesIds(groupId));
        }

        }__CLR4_5_21ap1aplx1dxkem.R.inc(1708);if ((((deviceId != 0)&&(__CLR4_5_21ap1aplx1dxkem.R.iget(1709)!=0|true))||(__CLR4_5_21ap1aplx1dxkem.R.iget(1710)==0&false))) {{
            __CLR4_5_21ap1aplx1dxkem.R.inc(1711);Context.getPermissionsManager().checkDevice(getUserId(), deviceId);
            __CLR4_5_21ap1aplx1dxkem.R.inc(1712);result.retainAll(geofenceManager.getDeviceGeofencesIds(deviceId));
        }
        }__CLR4_5_21ap1aplx1dxkem.R.inc(1713);return geofenceManager.getGeofences(result);

    }finally{__CLR4_5_21ap1aplx1dxkem.R.flushNeeded();}}

    @POST
    public Response add(Geofence entity) throws SQLException {try{__CLR4_5_21ap1aplx1dxkem.R.inc(1714);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1715);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21ap1aplx1dxkem.R.inc(1716);Context.getDataManager().addGeofence(entity);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1717);Context.getDataManager().linkGeofence(getUserId(), entity.getId());
        __CLR4_5_21ap1aplx1dxkem.R.inc(1718);Context.getGeofenceManager().refreshGeofences();
        __CLR4_5_21ap1aplx1dxkem.R.inc(1719);return Response.ok(entity).build();
    }finally{__CLR4_5_21ap1aplx1dxkem.R.flushNeeded();}}

    @Path("{id}")
    @PUT
    public Response update(Geofence entity) throws SQLException {try{__CLR4_5_21ap1aplx1dxkem.R.inc(1720);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1721);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21ap1aplx1dxkem.R.inc(1722);Context.getPermissionsManager().checkGeofence(getUserId(), entity.getId());
        __CLR4_5_21ap1aplx1dxkem.R.inc(1723);Context.getGeofenceManager().updateGeofence(entity);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1724);return Response.ok(entity).build();
    }finally{__CLR4_5_21ap1aplx1dxkem.R.flushNeeded();}}

    @Path("{id}")
    @DELETE
    public Response remove(@PathParam("id") long id) throws SQLException {try{__CLR4_5_21ap1aplx1dxkem.R.inc(1725);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1726);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21ap1aplx1dxkem.R.inc(1727);Context.getPermissionsManager().checkGeofence(getUserId(), id);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1728);Context.getDataManager().removeGeofence(id);
        __CLR4_5_21ap1aplx1dxkem.R.inc(1729);Context.getGeofenceManager().refreshGeofences();
        __CLR4_5_21ap1aplx1dxkem.R.inc(1730);return Response.noContent().build();
    }finally{__CLR4_5_21ap1aplx1dxkem.R.flushNeeded();}}

}
