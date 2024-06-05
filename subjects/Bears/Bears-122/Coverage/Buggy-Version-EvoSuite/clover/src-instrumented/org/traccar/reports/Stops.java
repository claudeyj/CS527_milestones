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

package org.traccar.reports;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.apache.poi.ss.util.WorkbookUtil;
import org.traccar.Context;
import org.traccar.model.Device;
import org.traccar.model.Group;
import org.traccar.reports.model.BaseReport;
import org.traccar.reports.model.DeviceReport;
import org.traccar.reports.model.StopReport;
import org.traccar.reports.model.TripsConfig;

public final class Stops {public static class __CLR4_5_2it2it2lwydwfce{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,24418,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Stops() {try{__CLR4_5_2it2it2lwydwfce.R.inc(24374);
    }finally{__CLR4_5_2it2it2lwydwfce.R.flushNeeded();}}

    private static Collection<StopReport> detectStops(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_2it2it2lwydwfce.R.inc(24375);
        __CLR4_5_2it2it2lwydwfce.R.inc(24376);double speedThreshold = Context.getConfig().getDouble("event.motion.speedThreshold", 0.01);

        __CLR4_5_2it2it2lwydwfce.R.inc(24377);TripsConfig tripsConfig = ReportUtils.initTripsConfig();

        __CLR4_5_2it2it2lwydwfce.R.inc(24378);boolean ignoreOdometer = Context.getDeviceManager()
                .lookupAttributeBoolean(deviceId, "report.ignoreOdometer", false, true);

        __CLR4_5_2it2it2lwydwfce.R.inc(24379);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig,
                ignoreOdometer, speedThreshold,
                Context.getDataManager().getPositions(deviceId, from, to), false);

        __CLR4_5_2it2it2lwydwfce.R.inc(24380);return (Collection<StopReport>) result;
    }finally{__CLR4_5_2it2it2lwydwfce.R.flushNeeded();}}

    public static Collection<StopReport> getObjects(
            long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Date from, Date to) throws SQLException {try{__CLR4_5_2it2it2lwydwfce.R.inc(24381);
        __CLR4_5_2it2it2lwydwfce.R.inc(24382);ReportUtils.checkPeriodLimit(from, to);
        __CLR4_5_2it2it2lwydwfce.R.inc(24383);ArrayList<StopReport> result = new ArrayList<>();
        __CLR4_5_2it2it2lwydwfce.R.inc(24384);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2it2it2lwydwfce.R.inc(24385);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2it2it2lwydwfce.R.inc(24386);result.addAll(detectStops(deviceId, from, to));
        }
        }__CLR4_5_2it2it2lwydwfce.R.inc(24387);return result;
    }finally{__CLR4_5_2it2it2lwydwfce.R.flushNeeded();}}

    public static void getExcel(
            OutputStream outputStream, long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Date from, Date to) throws SQLException, IOException {try{__CLR4_5_2it2it2lwydwfce.R.inc(24388);
        __CLR4_5_2it2it2lwydwfce.R.inc(24389);ReportUtils.checkPeriodLimit(from, to);
        __CLR4_5_2it2it2lwydwfce.R.inc(24390);ArrayList<DeviceReport> devicesStops = new ArrayList<>();
        __CLR4_5_2it2it2lwydwfce.R.inc(24391);ArrayList<String> sheetNames = new ArrayList<>();
        __CLR4_5_2it2it2lwydwfce.R.inc(24392);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2it2it2lwydwfce.R.inc(24393);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2it2it2lwydwfce.R.inc(24394);Collection<StopReport> stops = detectStops(deviceId, from, to);
            __CLR4_5_2it2it2lwydwfce.R.inc(24395);DeviceReport deviceStops = new DeviceReport();
            __CLR4_5_2it2it2lwydwfce.R.inc(24396);Device device = Context.getIdentityManager().getById(deviceId);
            __CLR4_5_2it2it2lwydwfce.R.inc(24397);deviceStops.setDeviceName(device.getName());
            __CLR4_5_2it2it2lwydwfce.R.inc(24398);sheetNames.add(WorkbookUtil.createSafeSheetName(deviceStops.getDeviceName()));
            __CLR4_5_2it2it2lwydwfce.R.inc(24399);if ((((device.getGroupId() != 0)&&(__CLR4_5_2it2it2lwydwfce.R.iget(24400)!=0|true))||(__CLR4_5_2it2it2lwydwfce.R.iget(24401)==0&false))) {{
                __CLR4_5_2it2it2lwydwfce.R.inc(24402);Group group = Context.getGroupsManager().getById(device.getGroupId());
                __CLR4_5_2it2it2lwydwfce.R.inc(24403);if ((((group != null)&&(__CLR4_5_2it2it2lwydwfce.R.iget(24404)!=0|true))||(__CLR4_5_2it2it2lwydwfce.R.iget(24405)==0&false))) {{
                    __CLR4_5_2it2it2lwydwfce.R.inc(24406);deviceStops.setGroupName(group.getName());
                }
            }}
            }__CLR4_5_2it2it2lwydwfce.R.inc(24407);deviceStops.setObjects(stops);
            __CLR4_5_2it2it2lwydwfce.R.inc(24408);devicesStops.add(deviceStops);
        }
        }__CLR4_5_2it2it2lwydwfce.R.inc(24409);String templatePath = Context.getConfig().getString("report.templatesPath",
                "templates/export/");
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2it2it2lwydwfce.R.inc(24410);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2it2it2lwydwfce.R.inc(24411);}};InputStream inputStream = new FileInputStream(templatePath + "/stops.xlsx")) {
            __CLR4_5_2it2it2lwydwfce.R.inc(24412);org.jxls.common.Context jxlsContext = ReportUtils.initializeContext(userId);
            __CLR4_5_2it2it2lwydwfce.R.inc(24413);jxlsContext.putVar("devices", devicesStops);
            __CLR4_5_2it2it2lwydwfce.R.inc(24414);jxlsContext.putVar("sheetNames", sheetNames);
            __CLR4_5_2it2it2lwydwfce.R.inc(24415);jxlsContext.putVar("from", from);
            __CLR4_5_2it2it2lwydwfce.R.inc(24416);jxlsContext.putVar("to", to);
            __CLR4_5_2it2it2lwydwfce.R.inc(24417);ReportUtils.processTemplateWithSheets(inputStream, outputStream, jxlsContext);
        }
    }finally{__CLR4_5_2it2it2lwydwfce.R.flushNeeded();}}

}
