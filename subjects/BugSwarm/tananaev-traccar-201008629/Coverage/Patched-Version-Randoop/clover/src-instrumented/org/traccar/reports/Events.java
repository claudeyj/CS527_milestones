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
import java.util.List;

import org.joda.time.DateTime;
import org.jxls.area.Area;
import org.jxls.builder.xls.XlsCommentAreaBuilder;
import org.jxls.common.CellRef;
import org.jxls.formula.StandardFormulaProcessor;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.TransformerFactory;
import org.traccar.Context;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.reports.model.DeviceReport;

public final class Events {public static class __CLR4_5_2fwffwflx1e0j0y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,20688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Events() {try{__CLR4_5_2fwffwflx1e0j0y.R.inc(20607);
    }finally{__CLR4_5_2fwffwflx1e0j0y.R.flushNeeded();}}

    public static Collection<Event> getObjects(long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Collection<String> types, Date from, Date to) throws SQLException {try{__CLR4_5_2fwffwflx1e0j0y.R.inc(20608);
        __CLR4_5_2fwffwflx1e0j0y.R.inc(20609);ArrayList<Event> result = new ArrayList<>();
        __CLR4_5_2fwffwflx1e0j0y.R.inc(20610);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20611);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20612);Collection<Event> events = Context.getDataManager().getEvents(deviceId, from, to);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20613);boolean all = types.isEmpty() || types.contains(Event.ALL_EVENTS);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20614);for (Event event : events) {{
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20615);if ((((all || types.contains(event.getType()))&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20616)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20617)==0&false))) {{
                    __CLR4_5_2fwffwflx1e0j0y.R.inc(20618);long geofenceId = event.getGeofenceId();
                    __CLR4_5_2fwffwflx1e0j0y.R.inc(20619);if ((((geofenceId == 0 || Context.getGeofenceManager().checkGeofence(userId, geofenceId))&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20620)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20621)==0&false))) {{
                       __CLR4_5_2fwffwflx1e0j0y.R.inc(20622);result.add(event);
                    }
                }}
            }}
        }}
        }__CLR4_5_2fwffwflx1e0j0y.R.inc(20623);return result;
    }finally{__CLR4_5_2fwffwflx1e0j0y.R.flushNeeded();}}

    public static void getExcel(OutputStream outputStream,
            long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Collection<String> types, DateTime from, DateTime to) throws SQLException, IOException {try{__CLR4_5_2fwffwflx1e0j0y.R.inc(20624);
        __CLR4_5_2fwffwflx1e0j0y.R.inc(20625);ArrayList<DeviceReport> devicesEvents = new ArrayList<>();
        __CLR4_5_2fwffwflx1e0j0y.R.inc(20626);ArrayList<String> sheetNames = new ArrayList<>();
        __CLR4_5_2fwffwflx1e0j0y.R.inc(20627);HashMap<Long, String> geofenceNames = new HashMap<>();
        __CLR4_5_2fwffwflx1e0j0y.R.inc(20628);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20629);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20630);Collection<Event> events = Context.getDataManager().getEvents(deviceId, from.toDate(), to.toDate());
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20631);boolean all = types.isEmpty() || types.contains(Event.ALL_EVENTS);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20632);for (Iterator<Event> iterator = events.iterator(); (((iterator.hasNext())&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20633)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20634)==0&false));) {{
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20635);Event event = iterator.next();
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20636);if ((((all || types.contains(event.getType()))&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20637)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20638)==0&false))) {{
                    __CLR4_5_2fwffwflx1e0j0y.R.inc(20639);long geofenceId = event.getGeofenceId();
                    __CLR4_5_2fwffwflx1e0j0y.R.inc(20640);if ((((geofenceId != 0)&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20641)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20642)==0&false))) {{
                        __CLR4_5_2fwffwflx1e0j0y.R.inc(20643);if ((((Context.getGeofenceManager().checkGeofence(userId, geofenceId))&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20644)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20645)==0&false))) {{
                            __CLR4_5_2fwffwflx1e0j0y.R.inc(20646);Geofence geofence = Context.getGeofenceManager().getGeofence(geofenceId);
                            __CLR4_5_2fwffwflx1e0j0y.R.inc(20647);if ((((geofence != null)&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20648)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20649)==0&false))) {{
                                __CLR4_5_2fwffwflx1e0j0y.R.inc(20650);geofenceNames.put(geofenceId, geofence.getName());
                            }
                        }} }else {{
                            __CLR4_5_2fwffwflx1e0j0y.R.inc(20651);iterator.remove();
                        }
                    }}
                }} }else {{
                    __CLR4_5_2fwffwflx1e0j0y.R.inc(20652);iterator.remove();
                }
            }}
            }__CLR4_5_2fwffwflx1e0j0y.R.inc(20653);DeviceReport deviceEvents = new DeviceReport();
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20654);Device device = Context.getIdentityManager().getDeviceById(deviceId);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20655);deviceEvents.setDeviceName(device.getName());
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20656);sheetNames.add(deviceEvents.getDeviceName());
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20657);if ((((device.getGroupId() != 0)&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20658)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20659)==0&false))) {{
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20660);Group group = Context.getDeviceManager().getGroupById(device.getGroupId());
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20661);if ((((group != null)&&(__CLR4_5_2fwffwflx1e0j0y.R.iget(20662)!=0|true))||(__CLR4_5_2fwffwflx1e0j0y.R.iget(20663)==0&false))) {{
                    __CLR4_5_2fwffwflx1e0j0y.R.inc(20664);deviceEvents.setGroupName(group.getName());
                }
            }}
            }__CLR4_5_2fwffwflx1e0j0y.R.inc(20665);deviceEvents.setObjects(events);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20666);devicesEvents.add(deviceEvents);
        }
        }__CLR4_5_2fwffwflx1e0j0y.R.inc(20667);String templatePath = Context.getConfig().getString("report.templatesPath",
                "templates/export/");
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2fwffwflx1e0j0y.R.inc(20668);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2fwffwflx1e0j0y.R.inc(20669);}};InputStream inputStream = new FileInputStream(templatePath + "/events.xlsx")) {
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20670);org.jxls.common.Context jxlsContext = PoiTransformer.createInitialContext();
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20671);jxlsContext.putVar("devices", devicesEvents);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20672);jxlsContext.putVar("sheetNames", sheetNames);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20673);jxlsContext.putVar("geofenceNames", geofenceNames);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20674);jxlsContext.putVar("from", from);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20675);jxlsContext.putVar("to", to);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20676);jxlsContext.putVar("distanceUnit", ReportUtils.getDistanceUnit(userId));
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20677);jxlsContext.putVar("speedUnit", ReportUtils.getSpeedUnit(userId));
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20678);jxlsContext.putVar("timezone", from.getZone());
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20679);jxlsContext.putVar("bracketsRegex", "[\\{\\}\"]");
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20680);Transformer transformer = TransformerFactory.createTransformer(inputStream, outputStream);
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20681);List<Area> xlsAreas = new XlsCommentAreaBuilder(transformer).build();
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20682);for (Area xlsArea : xlsAreas) {{
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20683);xlsArea.applyAt(new CellRef(xlsArea.getStartCellRef().getCellName()), jxlsContext);
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20684);xlsArea.setFormulaProcessor(new StandardFormulaProcessor());
                __CLR4_5_2fwffwflx1e0j0y.R.inc(20685);xlsArea.processFormulas();
            }
            }__CLR4_5_2fwffwflx1e0j0y.R.inc(20686);transformer.deleteSheet(xlsAreas.get(0).getStartCellRef().getSheetName());
            __CLR4_5_2fwffwflx1e0j0y.R.inc(20687);transformer.write();
        }
    }finally{__CLR4_5_2fwffwflx1e0j0y.R.flushNeeded();}}
}
