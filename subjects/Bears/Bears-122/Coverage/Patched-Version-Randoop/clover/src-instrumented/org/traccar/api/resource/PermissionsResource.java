/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
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

import java.sql.SQLException;
import java.util.LinkedHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.traccar.Context;
import org.traccar.api.BaseResource;
import org.traccar.model.Device;
import org.traccar.model.Permission;
import org.traccar.model.User;

@Path("permissions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PermissionsResource  extends BaseResource {public static class __CLR4_5_21eb1eblwye5zwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,1836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void checkPermission(Permission permission, boolean link) {try{__CLR4_5_21eb1eblwye5zwm.R.inc(1811);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1812);if ((((!link && permission.getOwnerClass().equals(User.class)
                && permission.getPropertyClass().equals(Device.class))&&(__CLR4_5_21eb1eblwye5zwm.R.iget(1813)!=0|true))||(__CLR4_5_21eb1eblwye5zwm.R.iget(1814)==0&false))) {{
            __CLR4_5_21eb1eblwye5zwm.R.inc(1815);if ((((getUserId() != permission.getOwnerId())&&(__CLR4_5_21eb1eblwye5zwm.R.iget(1816)!=0|true))||(__CLR4_5_21eb1eblwye5zwm.R.iget(1817)==0&false))) {{
                __CLR4_5_21eb1eblwye5zwm.R.inc(1818);Context.getPermissionsManager().checkUser(getUserId(), permission.getOwnerId());
            } }else {{
                __CLR4_5_21eb1eblwye5zwm.R.inc(1819);Context.getPermissionsManager().checkAdmin(getUserId());
            }
        }} }else {{
            __CLR4_5_21eb1eblwye5zwm.R.inc(1820);Context.getPermissionsManager().checkPermission(
                    permission.getOwnerClass(), getUserId(), permission.getOwnerId());
        }
        }__CLR4_5_21eb1eblwye5zwm.R.inc(1821);Context.getPermissionsManager().checkPermission(
                permission.getPropertyClass(), getUserId(), permission.getPropertyId());
    }finally{__CLR4_5_21eb1eblwye5zwm.R.flushNeeded();}}

    @POST
    public Response add(LinkedHashMap<String, Long> entity) throws SQLException, ClassNotFoundException {try{__CLR4_5_21eb1eblwye5zwm.R.inc(1822);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1823);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21eb1eblwye5zwm.R.inc(1824);Permission permission = new Permission(entity);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1825);checkPermission(permission, true);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1826);Context.getDataManager().linkObject(permission.getOwnerClass(), permission.getOwnerId(),
                permission.getPropertyClass(), permission.getPropertyId(), true);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1827);Context.getPermissionsManager().refreshPermissions(permission);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1828);return Response.noContent().build();
    }finally{__CLR4_5_21eb1eblwye5zwm.R.flushNeeded();}}

    @DELETE
    public Response remove(LinkedHashMap<String, Long> entity) throws SQLException, ClassNotFoundException {try{__CLR4_5_21eb1eblwye5zwm.R.inc(1829);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1830);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_21eb1eblwye5zwm.R.inc(1831);Permission permission = new Permission(entity);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1832);checkPermission(permission, false);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1833);Context.getDataManager().linkObject(permission.getOwnerClass(), permission.getOwnerId(),
                permission.getPropertyClass(), permission.getPropertyId(), false);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1834);Context.getPermissionsManager().refreshPermissions(permission);
        __CLR4_5_21eb1eblwye5zwm.R.inc(1835);return Response.noContent().build();
    }finally{__CLR4_5_21eb1eblwye5zwm.R.flushNeeded();}}

}
