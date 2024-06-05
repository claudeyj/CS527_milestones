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
package org.traccar.reports;

import org.apache.velocity.tools.generic.DateTool;
import org.apache.velocity.tools.generic.NumberTool;
import org.jxls.area.Area;
import org.jxls.builder.xls.XlsCommentAreaBuilder;
import org.jxls.common.CellRef;
import org.jxls.formula.StandardFormulaProcessor;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.TransformerFactory;
import org.traccar.Context;
import org.traccar.model.Driver;
import org.traccar.model.Position;
import org.traccar.reports.model.BaseReport;
import org.traccar.reports.model.StopReport;
import org.traccar.reports.model.TripReport;
import org.traccar.reports.model.TripsConfig;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class ReportUtils {public static class __CLR4_5_2il3il3lwye67gn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,24335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ReportUtils() {try{__CLR4_5_2il3il3lwye67gn.R.inc(24087);
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static void checkPeriodLimit(Date from, Date to) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24088);
        __CLR4_5_2il3il3lwye67gn.R.inc(24089);long limit = Context.getConfig().getLong("report.periodLimit") * 1000;
        __CLR4_5_2il3il3lwye67gn.R.inc(24090);if ((((limit > 0 && to.getTime() - from.getTime() > limit)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24091)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24092)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24093);throw new IllegalArgumentException("Time period exceeds the limit");
        }
    }}finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static String getDistanceUnit(long userId) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24094);
        __CLR4_5_2il3il3lwye67gn.R.inc(24095);return (String) Context.getPermissionsManager().lookupPreference(userId, "distanceUnit", "km");
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static String getSpeedUnit(long userId) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24096);
        __CLR4_5_2il3il3lwye67gn.R.inc(24097);return (String) Context.getPermissionsManager().lookupPreference(userId, "speedUnit", "kn");
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static TimeZone getTimezone(long userId) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24098);
        __CLR4_5_2il3il3lwye67gn.R.inc(24099);String timezone = (String) Context.getPermissionsManager().lookupPreference(userId, "timezone", null);
        __CLR4_5_2il3il3lwye67gn.R.inc(24100);return (((timezone != null )&&(__CLR4_5_2il3il3lwye67gn.R.iget(24101)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24102)==0&false))? TimeZone.getTimeZone(timezone) : TimeZone.getDefault();
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static Collection<Long> getDeviceList(Collection<Long> deviceIds, Collection<Long> groupIds) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24103);
        __CLR4_5_2il3il3lwye67gn.R.inc(24104);Collection<Long> result = new ArrayList<>();
        __CLR4_5_2il3il3lwye67gn.R.inc(24105);result.addAll(deviceIds);
        __CLR4_5_2il3il3lwye67gn.R.inc(24106);for (long groupId : groupIds) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24107);result.addAll(Context.getPermissionsManager().getGroupDevices(groupId));
        }
        }__CLR4_5_2il3il3lwye67gn.R.inc(24108);return result;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static double calculateDistance(Position firstPosition, Position lastPosition) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24109);
        __CLR4_5_2il3il3lwye67gn.R.inc(24110);return calculateDistance(firstPosition, lastPosition, true);
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static double calculateDistance(Position firstPosition, Position lastPosition, boolean useOdometer) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24111);
        __CLR4_5_2il3il3lwye67gn.R.inc(24112);double distance = 0.0;
        __CLR4_5_2il3il3lwye67gn.R.inc(24113);double firstOdometer = firstPosition.getDouble(Position.KEY_ODOMETER);
        __CLR4_5_2il3il3lwye67gn.R.inc(24114);double lastOdometer = lastPosition.getDouble(Position.KEY_ODOMETER);

        __CLR4_5_2il3il3lwye67gn.R.inc(24115);if ((((useOdometer && (firstOdometer != 0.0 || lastOdometer != 0.0))&&(__CLR4_5_2il3il3lwye67gn.R.iget(24116)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24117)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24118);distance = lastOdometer - firstOdometer;
        } }else {__CLR4_5_2il3il3lwye67gn.R.inc(24119);if ((((firstPosition.getAttributes().containsKey(Position.KEY_TOTAL_DISTANCE)
                && lastPosition.getAttributes().containsKey(Position.KEY_TOTAL_DISTANCE))&&(__CLR4_5_2il3il3lwye67gn.R.iget(24120)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24121)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24122);distance = lastPosition.getDouble(Position.KEY_TOTAL_DISTANCE)
                    - firstPosition.getDouble(Position.KEY_TOTAL_DISTANCE);
        }
        }}__CLR4_5_2il3il3lwye67gn.R.inc(24123);return distance;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static double calculateFuel(Position firstPosition, Position lastPosition) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24124);

        __CLR4_5_2il3il3lwye67gn.R.inc(24125);if ((((firstPosition.getAttributes().get(Position.KEY_FUEL_LEVEL) != null
                && lastPosition.getAttributes().get(Position.KEY_FUEL_LEVEL) != null)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24126)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24127)==0&false))) {{

            __CLR4_5_2il3il3lwye67gn.R.inc(24128);BigDecimal value = new BigDecimal(firstPosition.getDouble(Position.KEY_FUEL_LEVEL)
                    - lastPosition.getDouble(Position.KEY_FUEL_LEVEL));
            __CLR4_5_2il3il3lwye67gn.R.inc(24129);return value.setScale(1, RoundingMode.HALF_EVEN).doubleValue();
        }
        }__CLR4_5_2il3il3lwye67gn.R.inc(24130);return 0;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static String findDriver(Position firstPosition, Position lastPosition) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24131);
        __CLR4_5_2il3il3lwye67gn.R.inc(24132);if ((((firstPosition.getAttributes().containsKey(Position.KEY_DRIVER_UNIQUE_ID))&&(__CLR4_5_2il3il3lwye67gn.R.iget(24133)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24134)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24135);return firstPosition.getString(Position.KEY_DRIVER_UNIQUE_ID);
        } }else {__CLR4_5_2il3il3lwye67gn.R.inc(24136);if ((((lastPosition.getAttributes().containsKey(Position.KEY_DRIVER_UNIQUE_ID))&&(__CLR4_5_2il3il3lwye67gn.R.iget(24137)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24138)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24139);return lastPosition.getString(Position.KEY_DRIVER_UNIQUE_ID);
        }
        }}__CLR4_5_2il3il3lwye67gn.R.inc(24140);return null;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static String findDriverName(String driverUniqueId) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24141);
        __CLR4_5_2il3il3lwye67gn.R.inc(24142);if ((((driverUniqueId != null && Context.getDriversManager() != null)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24143)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24144)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24145);Driver driver = Context.getDriversManager().getDriverByUniqueId(driverUniqueId);
            __CLR4_5_2il3il3lwye67gn.R.inc(24146);if ((((driver != null)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24147)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24148)==0&false))) {{
                __CLR4_5_2il3il3lwye67gn.R.inc(24149);return driver.getName();
            }
        }}
        }__CLR4_5_2il3il3lwye67gn.R.inc(24150);return null;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static org.jxls.common.Context initializeContext(long userId) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24151);
        __CLR4_5_2il3il3lwye67gn.R.inc(24152);org.jxls.common.Context jxlsContext = PoiTransformer.createInitialContext();
        __CLR4_5_2il3il3lwye67gn.R.inc(24153);jxlsContext.putVar("distanceUnit", getDistanceUnit(userId));
        __CLR4_5_2il3il3lwye67gn.R.inc(24154);jxlsContext.putVar("speedUnit", getSpeedUnit(userId));
        __CLR4_5_2il3il3lwye67gn.R.inc(24155);jxlsContext.putVar("webUrl", Context.getVelocityEngine().getProperty("web.url"));
        __CLR4_5_2il3il3lwye67gn.R.inc(24156);jxlsContext.putVar("dateTool", new DateTool());
        __CLR4_5_2il3il3lwye67gn.R.inc(24157);jxlsContext.putVar("numberTool", new NumberTool());
        __CLR4_5_2il3il3lwye67gn.R.inc(24158);jxlsContext.putVar("timezone", getTimezone(userId));
        __CLR4_5_2il3il3lwye67gn.R.inc(24159);jxlsContext.putVar("locale", Locale.getDefault());
        __CLR4_5_2il3il3lwye67gn.R.inc(24160);jxlsContext.putVar("bracketsRegex", "[\\{\\}\"]");
        __CLR4_5_2il3il3lwye67gn.R.inc(24161);return jxlsContext;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static void processTemplateWithSheets(InputStream templateStream, OutputStream targetStream,
            org.jxls.common.Context jxlsContext) throws IOException {try{__CLR4_5_2il3il3lwye67gn.R.inc(24162);
        __CLR4_5_2il3il3lwye67gn.R.inc(24163);Transformer transformer = TransformerFactory.createTransformer(templateStream, targetStream);
        __CLR4_5_2il3il3lwye67gn.R.inc(24164);List<Area> xlsAreas = new XlsCommentAreaBuilder(transformer).build();
        __CLR4_5_2il3il3lwye67gn.R.inc(24165);for (Area xlsArea : xlsAreas) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24166);xlsArea.applyAt(new CellRef(xlsArea.getStartCellRef().getCellName()), jxlsContext);
            __CLR4_5_2il3il3lwye67gn.R.inc(24167);xlsArea.setFormulaProcessor(new StandardFormulaProcessor());
            __CLR4_5_2il3il3lwye67gn.R.inc(24168);xlsArea.processFormulas();
        }
        }__CLR4_5_2il3il3lwye67gn.R.inc(24169);transformer.deleteSheet(xlsAreas.get(0).getStartCellRef().getSheetName());
        __CLR4_5_2il3il3lwye67gn.R.inc(24170);transformer.write();
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static TripsConfig initTripsConfig() {try{__CLR4_5_2il3il3lwye67gn.R.inc(24171);
        __CLR4_5_2il3il3lwye67gn.R.inc(24172);return new TripsConfig(
                Context.getConfig().getLong("report.trip.minimalTripDistance", 500),
                Context.getConfig().getLong("report.trip.minimalTripDuration", 300) * 1000,
                Context.getConfig().getLong("report.trip.minimalParkingDuration", 300) * 1000,
                Context.getConfig().getBoolean("report.trip.greedyParking"),
                Context.getConfig().getLong("report.trip.minimalNoDataDuration", 3600) * 1000);
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    private static TripReport calculateTrip(
            ArrayList<Position> positions, int startIndex, int endIndex, boolean ignoreOdometer) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24173);
        __CLR4_5_2il3il3lwye67gn.R.inc(24174);Position startTrip = positions.get(startIndex);
        __CLR4_5_2il3il3lwye67gn.R.inc(24175);Position endTrip = positions.get(endIndex);

        __CLR4_5_2il3il3lwye67gn.R.inc(24176);double speedMax = 0.0;
        __CLR4_5_2il3il3lwye67gn.R.inc(24177);double speedSum = 0.0;
        __CLR4_5_2il3il3lwye67gn.R.inc(24178);for (int i = startIndex; (((i <= endIndex)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24179)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24180)==0&false)); i++) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24181);double speed = positions.get(i).getSpeed();
            __CLR4_5_2il3il3lwye67gn.R.inc(24182);speedSum += speed;
            __CLR4_5_2il3il3lwye67gn.R.inc(24183);if ((((speed > speedMax)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24184)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24185)==0&false))) {{
                __CLR4_5_2il3il3lwye67gn.R.inc(24186);speedMax = speed;
            }
        }}

        }__CLR4_5_2il3il3lwye67gn.R.inc(24187);TripReport trip = new TripReport();

        __CLR4_5_2il3il3lwye67gn.R.inc(24188);long tripDuration = endTrip.getFixTime().getTime() - startTrip.getFixTime().getTime();
        __CLR4_5_2il3il3lwye67gn.R.inc(24189);long deviceId = startTrip.getDeviceId();
        __CLR4_5_2il3il3lwye67gn.R.inc(24190);trip.setDeviceId(deviceId);
        __CLR4_5_2il3il3lwye67gn.R.inc(24191);trip.setDeviceName(Context.getIdentityManager().getById(deviceId).getName());

        __CLR4_5_2il3il3lwye67gn.R.inc(24192);trip.setStartPositionId(startTrip.getId());
        __CLR4_5_2il3il3lwye67gn.R.inc(24193);trip.setStartLat(startTrip.getLatitude());
        __CLR4_5_2il3il3lwye67gn.R.inc(24194);trip.setStartLon(startTrip.getLongitude());
        __CLR4_5_2il3il3lwye67gn.R.inc(24195);trip.setStartTime(startTrip.getFixTime());
        __CLR4_5_2il3il3lwye67gn.R.inc(24196);trip.setStartAddress(startTrip.getAddress());

        __CLR4_5_2il3il3lwye67gn.R.inc(24197);trip.setEndPositionId(endTrip.getId());
        __CLR4_5_2il3il3lwye67gn.R.inc(24198);trip.setEndLat(endTrip.getLatitude());
        __CLR4_5_2il3il3lwye67gn.R.inc(24199);trip.setEndLon(endTrip.getLongitude());
        __CLR4_5_2il3il3lwye67gn.R.inc(24200);trip.setEndTime(endTrip.getFixTime());
        __CLR4_5_2il3il3lwye67gn.R.inc(24201);trip.setEndAddress(endTrip.getAddress());

        __CLR4_5_2il3il3lwye67gn.R.inc(24202);trip.setDistance(calculateDistance(startTrip, endTrip, !ignoreOdometer));
        __CLR4_5_2il3il3lwye67gn.R.inc(24203);trip.setDuration(tripDuration);
        __CLR4_5_2il3il3lwye67gn.R.inc(24204);trip.setAverageSpeed(speedSum / (endIndex - startIndex));
        __CLR4_5_2il3il3lwye67gn.R.inc(24205);trip.setMaxSpeed(speedMax);
        __CLR4_5_2il3il3lwye67gn.R.inc(24206);trip.setSpentFuel(calculateFuel(startTrip, endTrip));

        __CLR4_5_2il3il3lwye67gn.R.inc(24207);trip.setDriverUniqueId(findDriver(startTrip, endTrip));
        __CLR4_5_2il3il3lwye67gn.R.inc(24208);trip.setDriverName(findDriverName(trip.getDriverUniqueId()));

        __CLR4_5_2il3il3lwye67gn.R.inc(24209);return trip;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    private static StopReport calculateStop(ArrayList<Position> positions, int startIndex, int endIndex) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24210);
        __CLR4_5_2il3il3lwye67gn.R.inc(24211);Position startStop = positions.get(startIndex);
        __CLR4_5_2il3il3lwye67gn.R.inc(24212);Position endStop = positions.get(endIndex);

        __CLR4_5_2il3il3lwye67gn.R.inc(24213);StopReport stop = new StopReport();

        __CLR4_5_2il3il3lwye67gn.R.inc(24214);long deviceId = startStop.getDeviceId();
        __CLR4_5_2il3il3lwye67gn.R.inc(24215);stop.setDeviceId(deviceId);
        __CLR4_5_2il3il3lwye67gn.R.inc(24216);stop.setDeviceName(Context.getIdentityManager().getById(deviceId).getName());

        __CLR4_5_2il3il3lwye67gn.R.inc(24217);stop.setPositionId(startStop.getId());
        __CLR4_5_2il3il3lwye67gn.R.inc(24218);stop.setLatitude(startStop.getLatitude());
        __CLR4_5_2il3il3lwye67gn.R.inc(24219);stop.setLongitude(startStop.getLongitude());
        __CLR4_5_2il3il3lwye67gn.R.inc(24220);stop.setStartTime(startStop.getFixTime());
        __CLR4_5_2il3il3lwye67gn.R.inc(24221);stop.setAddress(startStop.getAddress());
        __CLR4_5_2il3il3lwye67gn.R.inc(24222);stop.setEndTime(endStop.getFixTime());

        __CLR4_5_2il3il3lwye67gn.R.inc(24223);long stopDuration = endStop.getFixTime().getTime() - startStop.getFixTime().getTime();
        __CLR4_5_2il3il3lwye67gn.R.inc(24224);stop.setDuration(stopDuration);
        __CLR4_5_2il3il3lwye67gn.R.inc(24225);stop.setSpentFuel(calculateFuel(startStop, endStop));

        __CLR4_5_2il3il3lwye67gn.R.inc(24226);long engineHours = 0;
        __CLR4_5_2il3il3lwye67gn.R.inc(24227);for (int i = startIndex + 1; (((i <= endIndex)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24228)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24229)==0&false)); i++) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24230);if ((((positions.get(i).getBoolean(Position.KEY_IGNITION)
                    && positions.get(i - 1).getBoolean(Position.KEY_IGNITION))&&(__CLR4_5_2il3il3lwye67gn.R.iget(24231)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24232)==0&false))) {{
                __CLR4_5_2il3il3lwye67gn.R.inc(24233);engineHours += positions.get(i).getFixTime().getTime() - positions.get(i - 1).getFixTime().getTime();
            }
        }}
        }__CLR4_5_2il3il3lwye67gn.R.inc(24234);stop.setEngineHours(engineHours);

        __CLR4_5_2il3il3lwye67gn.R.inc(24235);return stop;

    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    private static boolean isMoving(ArrayList<Position> positions, int index,
            TripsConfig tripsConfig, double speedThreshold) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24236);
        __CLR4_5_2il3il3lwye67gn.R.inc(24237);if ((((tripsConfig.getMinimalNoDataDuration() > 0 && index < positions.size() - 1
                && positions.get(index + 1).getFixTime().getTime() - positions.get(index).getFixTime().getTime()
                >= tripsConfig.getMinimalNoDataDuration())&&(__CLR4_5_2il3il3lwye67gn.R.iget(24238)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24239)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24240);return false;
        }
        }__CLR4_5_2il3il3lwye67gn.R.inc(24241);if ((((positions.get(index).getAttributes().containsKey(Position.KEY_MOTION)
                && positions.get(index).getAttributes().get(Position.KEY_MOTION) instanceof Boolean)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24242)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24243)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24244);return positions.get(index).getBoolean(Position.KEY_MOTION);
        } }else {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24245);return positions.get(index).getSpeed() > speedThreshold;
        }
    }}finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}

    public static Collection<BaseReport> detectTripsAndStops(TripsConfig tripsConfig, boolean ignoreOdometer,
            double speedThreshold, Collection<Position> positionCollection, boolean trips) {try{__CLR4_5_2il3il3lwye67gn.R.inc(24246);

        __CLR4_5_2il3il3lwye67gn.R.inc(24247);Collection<BaseReport> result = new ArrayList<>();

        __CLR4_5_2il3il3lwye67gn.R.inc(24248);ArrayList<Position> positions = new ArrayList<>(positionCollection);
        __CLR4_5_2il3il3lwye67gn.R.inc(24249);if ((((positions != null && !positions.isEmpty())&&(__CLR4_5_2il3il3lwye67gn.R.iget(24250)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24251)==0&false))) {{
            __CLR4_5_2il3il3lwye67gn.R.inc(24252);int previousStartParkingIndex = 0;
            __CLR4_5_2il3il3lwye67gn.R.inc(24253);int startParkingIndex = -1;
            __CLR4_5_2il3il3lwye67gn.R.inc(24254);int previousEndParkingIndex = 0;
            __CLR4_5_2il3il3lwye67gn.R.inc(24255);int endParkingIndex = 0;

            __CLR4_5_2il3il3lwye67gn.R.inc(24256);boolean isMoving = false;
            __CLR4_5_2il3il3lwye67gn.R.inc(24257);boolean isLast = false;
            __CLR4_5_2il3il3lwye67gn.R.inc(24258);boolean skipped = false;
            __CLR4_5_2il3il3lwye67gn.R.inc(24259);boolean tripFiltered = false;

            __CLR4_5_2il3il3lwye67gn.R.inc(24260);for (int i = 0; (((i < positions.size())&&(__CLR4_5_2il3il3lwye67gn.R.iget(24261)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24262)==0&false)); i++) {{
                __CLR4_5_2il3il3lwye67gn.R.inc(24263);isMoving = isMoving(positions, i, tripsConfig, speedThreshold);
                __CLR4_5_2il3il3lwye67gn.R.inc(24264);isLast = i == positions.size() - 1;

                __CLR4_5_2il3il3lwye67gn.R.inc(24265);if (((((isMoving || isLast) && startParkingIndex != -1)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24266)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24267)==0&false))) {{
                    __CLR4_5_2il3il3lwye67gn.R.inc(24268);if ((((!skipped || previousEndParkingIndex == 0)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24269)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24270)==0&false))) {{
                        __CLR4_5_2il3il3lwye67gn.R.inc(24271);previousEndParkingIndex = endParkingIndex;
                    }
                    }__CLR4_5_2il3il3lwye67gn.R.inc(24272);endParkingIndex = i;
                }
                }__CLR4_5_2il3il3lwye67gn.R.inc(24273);if ((((!isMoving && startParkingIndex == -1)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24274)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24275)==0&false))) {{
                    __CLR4_5_2il3il3lwye67gn.R.inc(24276);if ((((tripsConfig.getGreedyParking())&&(__CLR4_5_2il3il3lwye67gn.R.iget(24277)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24278)==0&false))) {{
                        __CLR4_5_2il3il3lwye67gn.R.inc(24279);long tripDuration = positions.get(i).getFixTime().getTime()
                                - positions.get(endParkingIndex).getFixTime().getTime();
                        __CLR4_5_2il3il3lwye67gn.R.inc(24280);double tripDistance = ReportUtils.calculateDistance(positions.get(endParkingIndex),
                                positions.get(i), false);
                        __CLR4_5_2il3il3lwye67gn.R.inc(24281);tripFiltered = tripDuration < tripsConfig.getMinimalTripDuration()
                                && tripDistance < tripsConfig.getMinimalTripDistance();
                        __CLR4_5_2il3il3lwye67gn.R.inc(24282);if ((((tripFiltered)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24283)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24284)==0&false))) {{
                            __CLR4_5_2il3il3lwye67gn.R.inc(24285);startParkingIndex = previousStartParkingIndex;
                            __CLR4_5_2il3il3lwye67gn.R.inc(24286);endParkingIndex = previousEndParkingIndex;
                            __CLR4_5_2il3il3lwye67gn.R.inc(24287);tripFiltered = false;
                        } }else {{
                            __CLR4_5_2il3il3lwye67gn.R.inc(24288);previousStartParkingIndex = i;
                            __CLR4_5_2il3il3lwye67gn.R.inc(24289);startParkingIndex = i;
                        }
                    }} }else {{
                        __CLR4_5_2il3il3lwye67gn.R.inc(24290);long tripDuration = positions.get(i).getFixTime().getTime()
                                - positions.get(previousEndParkingIndex).getFixTime().getTime();
                        __CLR4_5_2il3il3lwye67gn.R.inc(24291);double tripDistance = ReportUtils.calculateDistance(positions.get(previousEndParkingIndex),
                                positions.get(i), false);
                        __CLR4_5_2il3il3lwye67gn.R.inc(24292);tripFiltered = tripDuration < tripsConfig.getMinimalTripDuration()
                                && tripDistance < tripsConfig.getMinimalTripDistance();
                        __CLR4_5_2il3il3lwye67gn.R.inc(24293);startParkingIndex = i;
                    }
                }}
                }__CLR4_5_2il3il3lwye67gn.R.inc(24294);if ((((startParkingIndex != -1 && (endParkingIndex > startParkingIndex || isLast))&&(__CLR4_5_2il3il3lwye67gn.R.iget(24295)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24296)==0&false))) {{
                    __CLR4_5_2il3il3lwye67gn.R.inc(24297);long parkingDuration = positions.get(endParkingIndex).getFixTime().getTime()
                            - positions.get(startParkingIndex).getFixTime().getTime();
                    __CLR4_5_2il3il3lwye67gn.R.inc(24298);if (((((parkingDuration >= tripsConfig.getMinimalParkingDuration() || isLast)
                            && previousEndParkingIndex < startParkingIndex)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24299)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24300)==0&false))) {{
                        __CLR4_5_2il3il3lwye67gn.R.inc(24301);if ((((!tripFiltered)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24302)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24303)==0&false))) {{
                            __CLR4_5_2il3il3lwye67gn.R.inc(24304);if ((((trips)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24305)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24306)==0&false))) {{
                                __CLR4_5_2il3il3lwye67gn.R.inc(24307);result.add(calculateTrip(
                                        positions, previousEndParkingIndex, startParkingIndex, ignoreOdometer));
                            } }else {{
                                __CLR4_5_2il3il3lwye67gn.R.inc(24308);if ((((result.isEmpty() && previousEndParkingIndex > previousStartParkingIndex)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24309)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24310)==0&false))) {{
                                    __CLR4_5_2il3il3lwye67gn.R.inc(24311);long previousParkingDuration = positions.get(previousEndParkingIndex)
                                            .getFixTime().getTime() - positions.get(previousStartParkingIndex)
                                            .getFixTime().getTime();
                                    __CLR4_5_2il3il3lwye67gn.R.inc(24312);if ((((previousParkingDuration >= tripsConfig.getMinimalParkingDuration())&&(__CLR4_5_2il3il3lwye67gn.R.iget(24313)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24314)==0&false))) {{
                                        __CLR4_5_2il3il3lwye67gn.R.inc(24315);result.add(calculateStop(positions, previousStartParkingIndex,
                                                previousEndParkingIndex));
                                    }
                                }}
                                }__CLR4_5_2il3il3lwye67gn.R.inc(24316);result.add(calculateStop(positions, startParkingIndex, (((isLast )&&(__CLR4_5_2il3il3lwye67gn.R.iget(24317)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24318)==0&false))? i : endParkingIndex));
                            }
                        }}
                        }__CLR4_5_2il3il3lwye67gn.R.inc(24319);previousEndParkingIndex = endParkingIndex;
                        __CLR4_5_2il3il3lwye67gn.R.inc(24320);skipped = false;
                    } }else {{
                        __CLR4_5_2il3il3lwye67gn.R.inc(24321);skipped = true;
                    }
                    }__CLR4_5_2il3il3lwye67gn.R.inc(24322);startParkingIndex = -1;
                }
            }}
            }__CLR4_5_2il3il3lwye67gn.R.inc(24323);if ((((result.isEmpty() && !trips)&&(__CLR4_5_2il3il3lwye67gn.R.iget(24324)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24325)==0&false))) {{
                __CLR4_5_2il3il3lwye67gn.R.inc(24326);int end = (((isMoving && !tripsConfig.getGreedyParking()
                        )&&(__CLR4_5_2il3il3lwye67gn.R.iget(24327)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24328)==0&false))? Math.max(endParkingIndex, previousEndParkingIndex) : positions.size() - 1;
                __CLR4_5_2il3il3lwye67gn.R.inc(24329);long parkingDuration = positions.get(end).getFixTime().getTime()
                        - positions.get(previousStartParkingIndex).getFixTime().getTime();
                __CLR4_5_2il3il3lwye67gn.R.inc(24330);if ((((parkingDuration >= tripsConfig.getMinimalParkingDuration())&&(__CLR4_5_2il3il3lwye67gn.R.iget(24331)!=0|true))||(__CLR4_5_2il3il3lwye67gn.R.iget(24332)==0&false))) {{
                    __CLR4_5_2il3il3lwye67gn.R.inc(24333);result.add(calculateStop(positions, previousStartParkingIndex, end));
                }
            }}
        }}

        }__CLR4_5_2il3il3lwye67gn.R.inc(24334);return result;
    }finally{__CLR4_5_2il3il3lwye67gn.R.flushNeeded();}}
}
