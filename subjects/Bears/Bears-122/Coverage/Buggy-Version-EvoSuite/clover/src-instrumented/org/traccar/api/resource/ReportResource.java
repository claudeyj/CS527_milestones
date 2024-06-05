/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.api.resource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.traccar.api.BaseResource;
import org.traccar.helper.DateUtil;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.reports.Events;
import org.traccar.reports.Summary;
import org.traccar.reports.Trips;
import org.traccar.reports.model.StopReport;
import org.traccar.reports.model.SummaryReport;
import org.traccar.reports.model.TripReport;
import org.traccar.reports.Route;
import org.traccar.reports.Stops;

@Path("reports")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReportResource extends BaseResource {public static class __CLR4_5_21fr1frlwydw8v6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,1893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    private static final String CONTENT_DISPOSITION_VALUE_XLSX = "attachment; filename=report.xlsx";

    @Path("route")
    @GET
    public Collection<Position> getRoute(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1863);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1864);return Route.getObjects(getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("route")
    @GET
    @Produces(XLSX)
    public Response getRouteExcel(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException, IOException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1865);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1866);ByteArrayOutputStream stream = new ByteArrayOutputStream();
        __CLR4_5_21fr1frlwydw8v6.R.inc(1867);Route.getExcel(stream, getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));

        __CLR4_5_21fr1frlwydw8v6.R.inc(1868);return Response.ok(stream.toByteArray())
                .header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_XLSX).build();
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("events")
    @GET
    public Collection<Event> getEvents(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("type") final List<String> types,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1869);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1870);return Events.getObjects(getUserId(), deviceIds, groupIds, types,
                DateUtil.parseDate(from), DateUtil.parseDate(to));
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("events")
    @GET
    @Produces(XLSX)
    public Response getEventsExcel(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("type") final List<String> types,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException, IOException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1871);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1872);ByteArrayOutputStream stream = new ByteArrayOutputStream();
        __CLR4_5_21fr1frlwydw8v6.R.inc(1873);Events.getExcel(stream, getUserId(), deviceIds, groupIds, types,
                DateUtil.parseDate(from), DateUtil.parseDate(to));

        __CLR4_5_21fr1frlwydw8v6.R.inc(1874);return Response.ok(stream.toByteArray())
                .header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_XLSX).build();
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("summary")
    @GET
    public Collection<SummaryReport> getSummary(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1875);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1876);return Summary.getObjects(getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("summary")
    @GET
    @Produces(XLSX)
    public Response getSummaryExcel(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException, IOException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1877);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1878);ByteArrayOutputStream stream = new ByteArrayOutputStream();
        __CLR4_5_21fr1frlwydw8v6.R.inc(1879);Summary.getExcel(stream, getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));

        __CLR4_5_21fr1frlwydw8v6.R.inc(1880);return Response.ok(stream.toByteArray())
                .header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_XLSX).build();
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("trips")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TripReport> getTrips(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1881);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1882);return Trips.getObjects(getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("trips")
    @GET
    @Produces(XLSX)
    public Response getTripsExcel(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException, IOException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1883);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1884);ByteArrayOutputStream stream = new ByteArrayOutputStream();
        __CLR4_5_21fr1frlwydw8v6.R.inc(1885);Trips.getExcel(stream, getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));

        __CLR4_5_21fr1frlwydw8v6.R.inc(1886);return Response.ok(stream.toByteArray())
                .header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_XLSX).build();
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("stops")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<StopReport> getStops(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1887);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1888);return Stops.getObjects(getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}

    @Path("stops")
    @GET
    @Produces(XLSX)
    public Response getStopsExcel(
            @QueryParam("deviceId") final List<Long> deviceIds, @QueryParam("groupId") final List<Long> groupIds,
            @QueryParam("from") String from, @QueryParam("to") String to) throws SQLException, IOException {try{__CLR4_5_21fr1frlwydw8v6.R.inc(1889);
        __CLR4_5_21fr1frlwydw8v6.R.inc(1890);ByteArrayOutputStream stream = new ByteArrayOutputStream();
        __CLR4_5_21fr1frlwydw8v6.R.inc(1891);Stops.getExcel(stream, getUserId(), deviceIds, groupIds,
                DateUtil.parseDate(from), DateUtil.parseDate(to));

        __CLR4_5_21fr1frlwydw8v6.R.inc(1892);return Response.ok(stream.toByteArray())
                .header(HttpHeaders.CONTENT_DISPOSITION, CONTENT_DISPOSITION_VALUE_XLSX).build();
    }finally{__CLR4_5_21fr1frlwydw8v6.R.flushNeeded();}}


}
