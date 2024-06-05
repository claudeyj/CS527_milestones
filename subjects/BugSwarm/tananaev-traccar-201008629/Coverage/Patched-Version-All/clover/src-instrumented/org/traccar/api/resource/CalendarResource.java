/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 - 2017 Andrey Kunitsyn (andrey@traccar.org)
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
import java.util.Collection;

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

import org.traccar.Context;
import org.traccar.api.BaseResource;
import org.traccar.model.Calendar;

@Path("calendars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CalendarResource extends BaseResource {public static class __CLR4_5_216c16clx1e1gxh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,1556,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @GET
    public Collection<Calendar> get(
            @QueryParam("all") boolean all, @QueryParam("userId") long userId) throws SQLException {try{__CLR4_5_216c16clx1e1gxh.R.inc(1524);

        __CLR4_5_216c16clx1e1gxh.R.inc(1525);if ((((all)&&(__CLR4_5_216c16clx1e1gxh.R.iget(1526)!=0|true))||(__CLR4_5_216c16clx1e1gxh.R.iget(1527)==0&false))) {{
            __CLR4_5_216c16clx1e1gxh.R.inc(1528);if ((((Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_216c16clx1e1gxh.R.iget(1529)!=0|true))||(__CLR4_5_216c16clx1e1gxh.R.iget(1530)==0&false))) {{
                __CLR4_5_216c16clx1e1gxh.R.inc(1531);return Context.getCalendarManager().getAllCalendars();
            } }else {{
                __CLR4_5_216c16clx1e1gxh.R.inc(1532);Context.getPermissionsManager().checkManager(getUserId());
                __CLR4_5_216c16clx1e1gxh.R.inc(1533);return Context.getCalendarManager().getManagedCalendars(getUserId());
            }
        }} }else {{
            __CLR4_5_216c16clx1e1gxh.R.inc(1534);if ((((userId == 0)&&(__CLR4_5_216c16clx1e1gxh.R.iget(1535)!=0|true))||(__CLR4_5_216c16clx1e1gxh.R.iget(1536)==0&false))) {{
                __CLR4_5_216c16clx1e1gxh.R.inc(1537);userId = getUserId();
            }
            }__CLR4_5_216c16clx1e1gxh.R.inc(1538);Context.getPermissionsManager().checkUser(getUserId(), userId);
            __CLR4_5_216c16clx1e1gxh.R.inc(1539);return Context.getCalendarManager().getUserCalendars(userId);
        }
    }}finally{__CLR4_5_216c16clx1e1gxh.R.flushNeeded();}}

    @POST
    public Response add(Calendar entity) throws SQLException {try{__CLR4_5_216c16clx1e1gxh.R.inc(1540);
        __CLR4_5_216c16clx1e1gxh.R.inc(1541);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_216c16clx1e1gxh.R.inc(1542);Context.getCalendarManager().addCalendar(entity);
        __CLR4_5_216c16clx1e1gxh.R.inc(1543);Context.getDataManager().linkCalendar(getUserId(), entity.getId());
        __CLR4_5_216c16clx1e1gxh.R.inc(1544);Context.getCalendarManager().refreshUserCalendars();
        __CLR4_5_216c16clx1e1gxh.R.inc(1545);return Response.ok(entity).build();
    }finally{__CLR4_5_216c16clx1e1gxh.R.flushNeeded();}}

    @Path("{id}")
    @PUT
    public Response update(Calendar entity) throws SQLException {try{__CLR4_5_216c16clx1e1gxh.R.inc(1546);
        __CLR4_5_216c16clx1e1gxh.R.inc(1547);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_216c16clx1e1gxh.R.inc(1548);Context.getPermissionsManager().checkCalendar(getUserId(), entity.getId());
        __CLR4_5_216c16clx1e1gxh.R.inc(1549);Context.getCalendarManager().updateCalendar(entity);
        __CLR4_5_216c16clx1e1gxh.R.inc(1550);return Response.ok(entity).build();
    }finally{__CLR4_5_216c16clx1e1gxh.R.flushNeeded();}}

    @Path("{id}")
    @DELETE
    public Response remove(@PathParam("id") long id) throws SQLException {try{__CLR4_5_216c16clx1e1gxh.R.inc(1551);
        __CLR4_5_216c16clx1e1gxh.R.inc(1552);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_216c16clx1e1gxh.R.inc(1553);Context.getPermissionsManager().checkCalendar(getUserId(), id);
        __CLR4_5_216c16clx1e1gxh.R.inc(1554);Context.getCalendarManager().removeCalendar(id);
        __CLR4_5_216c16clx1e1gxh.R.inc(1555);return Response.noContent().build();
    }finally{__CLR4_5_216c16clx1e1gxh.R.flushNeeded();}}
}
