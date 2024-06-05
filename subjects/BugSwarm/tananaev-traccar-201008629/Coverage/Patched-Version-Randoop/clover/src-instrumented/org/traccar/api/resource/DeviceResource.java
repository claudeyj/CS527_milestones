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
import org.traccar.model.Device;
import org.traccar.model.DeviceTotalDistance;

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

@Path("devices")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DeviceResource extends BaseResource {public static class __CLR4_5_218l18llx1e0d57{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,1659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @GET
    public Collection<Device> get(
            @QueryParam("all") boolean all, @QueryParam("userId") long userId) throws SQLException {try{__CLR4_5_218l18llx1e0d57.R.inc(1605);
        __CLR4_5_218l18llx1e0d57.R.inc(1606);if ((((all)&&(__CLR4_5_218l18llx1e0d57.R.iget(1607)!=0|true))||(__CLR4_5_218l18llx1e0d57.R.iget(1608)==0&false))) {{
            __CLR4_5_218l18llx1e0d57.R.inc(1609);if ((((Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_218l18llx1e0d57.R.iget(1610)!=0|true))||(__CLR4_5_218l18llx1e0d57.R.iget(1611)==0&false))) {{
                __CLR4_5_218l18llx1e0d57.R.inc(1612);return Context.getDeviceManager().getAllDevices();
            } }else {{
                __CLR4_5_218l18llx1e0d57.R.inc(1613);Context.getPermissionsManager().checkManager(getUserId());
                __CLR4_5_218l18llx1e0d57.R.inc(1614);return Context.getDeviceManager().getManagedDevices(getUserId());
            }
        }} }else {{
            __CLR4_5_218l18llx1e0d57.R.inc(1615);if ((((userId == 0)&&(__CLR4_5_218l18llx1e0d57.R.iget(1616)!=0|true))||(__CLR4_5_218l18llx1e0d57.R.iget(1617)==0&false))) {{
                __CLR4_5_218l18llx1e0d57.R.inc(1618);userId = getUserId();
            }
            }__CLR4_5_218l18llx1e0d57.R.inc(1619);Context.getPermissionsManager().checkUser(getUserId(), userId);
            __CLR4_5_218l18llx1e0d57.R.inc(1620);return Context.getDeviceManager().getDevices(userId);
        }
    }}finally{__CLR4_5_218l18llx1e0d57.R.flushNeeded();}}

    @POST
    public Response add(Device entity) throws SQLException {try{__CLR4_5_218l18llx1e0d57.R.inc(1621);
        __CLR4_5_218l18llx1e0d57.R.inc(1622);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1623);Context.getPermissionsManager().checkDeviceReadonly(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1624);Context.getPermissionsManager().checkDeviceLimit(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1625);Context.getDeviceManager().addDevice(entity);
        __CLR4_5_218l18llx1e0d57.R.inc(1626);Context.getDataManager().linkDevice(getUserId(), entity.getId());
        __CLR4_5_218l18llx1e0d57.R.inc(1627);Context.getPermissionsManager().refreshPermissions();
        __CLR4_5_218l18llx1e0d57.R.inc(1628);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_218l18llx1e0d57.R.iget(1629)!=0|true))||(__CLR4_5_218l18llx1e0d57.R.iget(1630)==0&false))) {{
            __CLR4_5_218l18llx1e0d57.R.inc(1631);Context.getGeofenceManager().refresh();
        }
        }__CLR4_5_218l18llx1e0d57.R.inc(1632);return Response.ok(entity).build();
    }finally{__CLR4_5_218l18llx1e0d57.R.flushNeeded();}}

    @Path("{id}")
    @PUT
    public Response update(Device entity) throws SQLException {try{__CLR4_5_218l18llx1e0d57.R.inc(1633);
        __CLR4_5_218l18llx1e0d57.R.inc(1634);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1635);Context.getPermissionsManager().checkDeviceReadonly(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1636);Context.getPermissionsManager().checkDevice(getUserId(), entity.getId());
        __CLR4_5_218l18llx1e0d57.R.inc(1637);Context.getDeviceManager().updateDevice(entity);
        __CLR4_5_218l18llx1e0d57.R.inc(1638);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_218l18llx1e0d57.R.iget(1639)!=0|true))||(__CLR4_5_218l18llx1e0d57.R.iget(1640)==0&false))) {{
            __CLR4_5_218l18llx1e0d57.R.inc(1641);Context.getGeofenceManager().refresh();
        }
        }__CLR4_5_218l18llx1e0d57.R.inc(1642);return Response.ok(entity).build();
    }finally{__CLR4_5_218l18llx1e0d57.R.flushNeeded();}}

    @Path("{id}")
    @DELETE
    public Response remove(@PathParam("id") long id) throws SQLException {try{__CLR4_5_218l18llx1e0d57.R.inc(1643);
        __CLR4_5_218l18llx1e0d57.R.inc(1644);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1645);Context.getPermissionsManager().checkDeviceReadonly(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1646);Context.getPermissionsManager().checkDevice(getUserId(), id);
        __CLR4_5_218l18llx1e0d57.R.inc(1647);Context.getDeviceManager().removeDevice(id);
        __CLR4_5_218l18llx1e0d57.R.inc(1648);Context.getPermissionsManager().refreshPermissions();
        __CLR4_5_218l18llx1e0d57.R.inc(1649);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_218l18llx1e0d57.R.iget(1650)!=0|true))||(__CLR4_5_218l18llx1e0d57.R.iget(1651)==0&false))) {{
            __CLR4_5_218l18llx1e0d57.R.inc(1652);Context.getGeofenceManager().refresh();
        }
        }__CLR4_5_218l18llx1e0d57.R.inc(1653);Context.getAliasesManager().removeDevice(id);
        __CLR4_5_218l18llx1e0d57.R.inc(1654);return Response.noContent().build();
    }finally{__CLR4_5_218l18llx1e0d57.R.flushNeeded();}}

    @Path("{id}/distance")
    @PUT
    public Response updateTotalDistance(DeviceTotalDistance entity) throws SQLException {try{__CLR4_5_218l18llx1e0d57.R.inc(1655);
        __CLR4_5_218l18llx1e0d57.R.inc(1656);Context.getPermissionsManager().checkAdmin(getUserId());
        __CLR4_5_218l18llx1e0d57.R.inc(1657);Context.getDeviceManager().resetTotalDistance(entity);
        __CLR4_5_218l18llx1e0d57.R.inc(1658);return Response.noContent().build();
    }finally{__CLR4_5_218l18llx1e0d57.R.flushNeeded();}}

}
