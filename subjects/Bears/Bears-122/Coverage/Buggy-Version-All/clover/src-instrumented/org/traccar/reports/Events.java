/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
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
package org.traccar.reports;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.util.WorkbookUtil;
import org.traccar.Context;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.reports.model.DeviceReport;

public final class Events {public static class __CLR4_5_2ij4ij4lwydzr8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,24088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Events() {try{__CLR4_5_2ij4ij4lwydzr8m.R.inc(24016);
    }finally{__CLR4_5_2ij4ij4lwydzr8m.R.flushNeeded();}}

    public static Collection<Event> getObjects(long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Collection<String> types, Date from, Date to) throws SQLException {try{__CLR4_5_2ij4ij4lwydzr8m.R.inc(24017);
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24018);ReportUtils.checkPeriodLimit(from, to);
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24019);ArrayList<Event> result = new ArrayList<>();
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24020);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24021);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24022);Collection<Event> events = Context.getDataManager().getEvents(deviceId, from, to);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24023);boolean all = types.isEmpty() || types.contains(Event.ALL_EVENTS);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24024);for (Event event : events) {{
                __CLR4_5_2ij4ij4lwydzr8m.R.inc(24025);if ((((all || types.contains(event.getType()))&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24026)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24027)==0&false))) {{
                    __CLR4_5_2ij4ij4lwydzr8m.R.inc(24028);long geofenceId = event.getGeofenceId();
                    __CLR4_5_2ij4ij4lwydzr8m.R.inc(24029);if ((((geofenceId == 0 || Context.getGeofenceManager().checkItemPermission(userId, geofenceId))&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24030)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24031)==0&false))) {{
                       __CLR4_5_2ij4ij4lwydzr8m.R.inc(24032);result.add(event);
                    }
                }}
            }}
        }}
        }__CLR4_5_2ij4ij4lwydzr8m.R.inc(24033);return result;
    }finally{__CLR4_5_2ij4ij4lwydzr8m.R.flushNeeded();}}

    public static void getExcel(OutputStream outputStream,
            long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Collection<String> types, Date from, Date to) throws SQLException, IOException {try{__CLR4_5_2ij4ij4lwydzr8m.R.inc(24034);
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24035);ReportUtils.checkPeriodLimit(from, to);
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24036);ArrayList<DeviceReport> devicesEvents = new ArrayList<>();
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24037);ArrayList<String> sheetNames = new ArrayList<>();
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24038);HashMap<Long, String> geofenceNames = new HashMap<>();
        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24039);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24040);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24041);Collection<Event> events = Context.getDataManager().getEvents(deviceId, from, to);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24042);boolean all = types.isEmpty() || types.contains(Event.ALL_EVENTS);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24043);for (Iterator<Event> iterator = events.iterator(); (((iterator.hasNext())&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24044)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24045)==0&false));) {{
                __CLR4_5_2ij4ij4lwydzr8m.R.inc(24046);Event event = iterator.next();
                __CLR4_5_2ij4ij4lwydzr8m.R.inc(24047);if ((((all || types.contains(event.getType()))&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24048)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24049)==0&false))) {{
                    __CLR4_5_2ij4ij4lwydzr8m.R.inc(24050);long geofenceId = event.getGeofenceId();
                    __CLR4_5_2ij4ij4lwydzr8m.R.inc(24051);if ((((geofenceId != 0)&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24052)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24053)==0&false))) {{
                        __CLR4_5_2ij4ij4lwydzr8m.R.inc(24054);if ((((Context.getGeofenceManager().checkItemPermission(userId, geofenceId))&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24055)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24056)==0&false))) {{
                            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24057);Geofence geofence = (Geofence) Context.getGeofenceManager().getById(geofenceId);
                            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24058);if ((((geofence != null)&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24059)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24060)==0&false))) {{
                                __CLR4_5_2ij4ij4lwydzr8m.R.inc(24061);geofenceNames.put(geofenceId, geofence.getName());
                            }
                        }} }else {{
                            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24062);iterator.remove();
                        }
                    }}
                }} }else {{
                    __CLR4_5_2ij4ij4lwydzr8m.R.inc(24063);iterator.remove();
                }
            }}
            }__CLR4_5_2ij4ij4lwydzr8m.R.inc(24064);DeviceReport deviceEvents = new DeviceReport();
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24065);Device device = Context.getIdentityManager().getById(deviceId);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24066);deviceEvents.setDeviceName(device.getName());
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24067);sheetNames.add(WorkbookUtil.createSafeSheetName(deviceEvents.getDeviceName()));
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24068);if ((((device.getGroupId() != 0)&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24069)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24070)==0&false))) {{
                __CLR4_5_2ij4ij4lwydzr8m.R.inc(24071);Group group = Context.getGroupsManager().getById(device.getGroupId());
                __CLR4_5_2ij4ij4lwydzr8m.R.inc(24072);if ((((group != null)&&(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24073)!=0|true))||(__CLR4_5_2ij4ij4lwydzr8m.R.iget(24074)==0&false))) {{
                    __CLR4_5_2ij4ij4lwydzr8m.R.inc(24075);deviceEvents.setGroupName(group.getName());
                }
            }}
            }__CLR4_5_2ij4ij4lwydzr8m.R.inc(24076);deviceEvents.setObjects(events);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24077);devicesEvents.add(deviceEvents);
        }
        }__CLR4_5_2ij4ij4lwydzr8m.R.inc(24078);String templatePath = Context.getConfig().getString("report.templatesPath",
                "templates/export/");
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2ij4ij4lwydzr8m.R.inc(24079);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2ij4ij4lwydzr8m.R.inc(24080);}};InputStream inputStream = new FileInputStream(templatePath + "/events.xlsx")) {
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24081);org.jxls.common.Context jxlsContext = ReportUtils.initializeContext(userId);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24082);jxlsContext.putVar("devices", devicesEvents);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24083);jxlsContext.putVar("sheetNames", sheetNames);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24084);jxlsContext.putVar("geofenceNames", geofenceNames);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24085);jxlsContext.putVar("from", from);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24086);jxlsContext.putVar("to", to);
            __CLR4_5_2ij4ij4lwydzr8m.R.inc(24087);ReportUtils.processTemplateWithSheets(inputStream, outputStream, jxlsContext);
        }
    }finally{__CLR4_5_2ij4ij4lwydzr8m.R.flushNeeded();}}
}
