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
package org.traccar.api.resource;

import org.traccar.Context;
import org.traccar.api.BaseResource;
import org.traccar.helper.DateUtil;
import org.traccar.model.Position;
import org.traccar.web.CsvBuilder;
import org.traccar.web.GpxBuilder;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Path("positions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PositionResource extends BaseResource {public static class __CLR4_5_21ev1evlx1dxkfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,1858,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TEXT_CSV = "text/csv";
    public static final String CONTENT_DISPOSITION_VALUE_CSV = "attachment; filename=positions.csv";
    public static final String GPX = "application/gpx+xml";
    public static final String CONTENT_DISPOSITION_VALUE_GPX = "attachment; filename=positions.gpx";

    @GET
    public Collection<Position> getJson(
            @QueryParam("deviceId") long deviceId, @QueryParam("id") List<Long> positionIds,
            @QueryParam("from") String from, @QueryParam("to") String to)
            throws SQLException {try{__CLR4_5_21ev1evlx1dxkfo.R.inc(1831);
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1832);if ((((!positionIds.isEmpty())&&(__CLR4_5_21ev1evlx1dxkfo.R.iget(1833)!=0|true))||(__CLR4_5_21ev1evlx1dxkfo.R.iget(1834)==0&false))) {{
            __CLR4_5_21ev1evlx1dxkfo.R.inc(1835);ArrayList<Position> positions = new ArrayList<>();
            __CLR4_5_21ev1evlx1dxkfo.R.inc(1836);for (Long positionId : positionIds) {{
                __CLR4_5_21ev1evlx1dxkfo.R.inc(1837);Position position = Context.getDataManager().getPosition(positionId);
                __CLR4_5_21ev1evlx1dxkfo.R.inc(1838);Context.getPermissionsManager().checkDevice(getUserId(), position.getDeviceId());
                __CLR4_5_21ev1evlx1dxkfo.R.inc(1839);positions.add(position);
            }
            }__CLR4_5_21ev1evlx1dxkfo.R.inc(1840);return positions;
        } }else {__CLR4_5_21ev1evlx1dxkfo.R.inc(1841);if ((((deviceId == 0)&&(__CLR4_5_21ev1evlx1dxkfo.R.iget(1842)!=0|true))||(__CLR4_5_21ev1evlx1dxkfo.R.iget(1843)==0&false))) {{
            __CLR4_5_21ev1evlx1dxkfo.R.inc(1844);return Context.getDeviceManager().getInitialState(getUserId());
        } }else {{
            __CLR4_5_21ev1evlx1dxkfo.R.inc(1845);Context.getPermissionsManager().checkDevice(getUserId(), deviceId);
            __CLR4_5_21ev1evlx1dxkfo.R.inc(1846);return Context.getDataManager().getPositions(
                    deviceId, DateUtil.parseDate(from), DateUtil.parseDate(to));
        }
    }}}finally{__CLR4_5_21ev1evlx1dxkfo.R.flushNeeded();}}

    @GET
    @Produces(TEXT_CSV)
    public Response getCsv(
            @QueryParam("deviceId") long deviceId, @QueryParam("from") String from, @QueryParam("to") String to)
            throws SQLException {try{__CLR4_5_21ev1evlx1dxkfo.R.inc(1847);
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1848);Context.getPermissionsManager().checkDevice(getUserId(), deviceId);
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1849);CsvBuilder csv = new CsvBuilder();
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1850);csv.addHeaderLine(new Position());
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1851);csv.addArray(Context.getDataManager().getPositions(
                deviceId, DateUtil.parseDate(from), DateUtil.parseDate(to)));
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1852);return Response.ok(csv.build()).header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_CSV).build();
    }finally{__CLR4_5_21ev1evlx1dxkfo.R.flushNeeded();}}

    @GET
    @Produces(GPX)
    public Response getGpx(
            @QueryParam("deviceId") long deviceId, @QueryParam("from") String from, @QueryParam("to") String to)
            throws SQLException {try{__CLR4_5_21ev1evlx1dxkfo.R.inc(1853);
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1854);Context.getPermissionsManager().checkDevice(getUserId(), deviceId);
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1855);GpxBuilder gpx = new GpxBuilder(Context.getIdentityManager().getDeviceById(deviceId).getName());
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1856);gpx.addPositions(Context.getDataManager().getPositions(
                deviceId, DateUtil.parseDate(from), DateUtil.parseDate(to)));
        __CLR4_5_21ev1evlx1dxkfo.R.inc(1857);return Response.ok(gpx.build()).header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_GPX).build();
    }finally{__CLR4_5_21ev1evlx1dxkfo.R.flushNeeded();}}

}
