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
import org.traccar.model.Group;
import org.traccar.model.Position;
import org.traccar.reports.model.DeviceReport;
import org.traccar.reports.model.TripReport;

public final class Trips {public static class __CLR4_5_2g2wg2wlx1dzcpd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,20993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Trips() {try{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20840);
    }finally{__CLR4_5_2g2wg2wlx1dzcpd.R.flushNeeded();}}

    private static TripReport calculateTrip(
            ArrayList<Position> positions, int startIndex, int endIndex, boolean ignoreOdometer) {try{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20841);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20842);Position startTrip = positions.get(startIndex);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20843);Position endTrip = positions.get(endIndex);

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20844);double speedMax = 0.0;
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20845);double speedSum = 0.0;
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20846);for (int i = startIndex; (((i <= endIndex)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20847)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20848)==0&false)); i++) {{
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20849);double speed = positions.get(i).getSpeed();
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20850);speedSum += speed;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20851);if ((((speed > speedMax)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20852)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20853)==0&false))) {{
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20854);speedMax = speed;
            }
        }}

        }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20855);TripReport trip = new TripReport();

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20856);long tripDuration = endTrip.getFixTime().getTime() - positions.get(startIndex).getFixTime().getTime();
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20857);long deviceId = startTrip.getDeviceId();
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20858);trip.setDeviceId(deviceId);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20859);trip.setDeviceName(Context.getIdentityManager().getDeviceById(deviceId).getName());

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20860);trip.setStartPositionId(startTrip.getId());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20861);trip.setStartLat(startTrip.getLatitude());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20862);trip.setStartLon(startTrip.getLongitude());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20863);trip.setStartTime(startTrip.getFixTime());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20864);trip.setStartAddress(startTrip.getAddress());

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20865);trip.setEndPositionId(endTrip.getId());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20866);trip.setEndLat(endTrip.getLatitude());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20867);trip.setEndLon(endTrip.getLongitude());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20868);trip.setEndTime(endTrip.getFixTime());
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20869);trip.setEndAddress(endTrip.getAddress());

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20870);trip.setDistance(ReportUtils.calculateDistance(startTrip, endTrip, !ignoreOdometer));
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20871);trip.setDuration(tripDuration);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20872);trip.setAverageSpeed(speedSum / (endIndex - startIndex));
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20873);trip.setMaxSpeed(speedMax);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20874);trip.setSpentFuel(ReportUtils.calculateFuel(startTrip, endTrip));

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20875);return trip;
    }finally{__CLR4_5_2g2wg2wlx1dzcpd.R.flushNeeded();}}

    protected static Collection<TripReport> detectTrips(
            double speedThreshold, double minimalTripDistance,
            long minimalTripDuration, long minimalParkingDuration, boolean greedyParking, boolean ignoreOdometer,
            Collection<Position> positionCollection) {try{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20876);

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20877);Collection<TripReport> result = new ArrayList<>();

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20878);ArrayList<Position> positions = new ArrayList<>(positionCollection);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20879);if ((((positions != null && !positions.isEmpty())&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20880)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20881)==0&false))) {{
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20882);int previousStartParkingIndex = 0;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20883);int startParkingIndex = -1;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20884);int previousEndParkingIndex = 0;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20885);int endParkingIndex = 0;

            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20886);boolean isMoving = false;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20887);boolean isLast = false;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20888);boolean skipped = false;
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20889);boolean tripFiltered = false;

            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20890);for (int i = 0; (((i < positions.size())&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20891)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20892)==0&false)); i++) {{
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20893);isMoving = positions.get(i).getSpeed() > speedThreshold;
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20894);isLast = i == positions.size() - 1;

                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20895);if (((((isMoving || isLast) && startParkingIndex != -1)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20896)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20897)==0&false))) {{
                    __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20898);if ((((!skipped || previousEndParkingIndex == 0)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20899)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20900)==0&false))) {{
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20901);previousEndParkingIndex = endParkingIndex;
                    }
                    }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20902);endParkingIndex = i;
                }
                }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20903);if ((((!isMoving && startParkingIndex == -1)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20904)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20905)==0&false))) {{
                    __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20906);if ((((greedyParking)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20907)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20908)==0&false))) {{
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20909);long tripDuration = positions.get(i).getFixTime().getTime()
                                - positions.get(endParkingIndex).getFixTime().getTime();
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20910);double tripDistance = ReportUtils.calculateDistance(positions.get(endParkingIndex),
                                positions.get(i), false);
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20911);tripFiltered = tripDuration < minimalTripDuration && tripDistance < minimalTripDistance;
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20912);if ((((tripFiltered)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20913)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20914)==0&false))) {{
                            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20915);startParkingIndex = previousStartParkingIndex;
                            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20916);endParkingIndex = previousEndParkingIndex;
                            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20917);tripFiltered = false;
                        } }else {{
                            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20918);previousStartParkingIndex = i;
                            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20919);startParkingIndex = i;
                        }
                    }} }else {{
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20920);long tripDuration = positions.get(i).getFixTime().getTime()
                                - positions.get(previousEndParkingIndex).getFixTime().getTime();
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20921);double tripDistance = ReportUtils.calculateDistance(positions.get(previousEndParkingIndex),
                                positions.get(i), false);
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20922);tripFiltered = tripDuration < minimalTripDuration && tripDistance < minimalTripDistance;
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20923);startParkingIndex = i;
                    }
                }}
                }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20924);if ((((startParkingIndex != -1 && (endParkingIndex > startParkingIndex || isLast))&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20925)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20926)==0&false))) {{
                    __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20927);long parkingDuration = positions.get(endParkingIndex).getFixTime().getTime()
                            - positions.get(startParkingIndex).getFixTime().getTime();
                    __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20928);if (((((parkingDuration >= minimalParkingDuration || isLast)
                            && previousEndParkingIndex < startParkingIndex)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20929)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20930)==0&false))) {{
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20931);if ((((!tripFiltered)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20932)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20933)==0&false))) {{
                            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20934);result.add(calculateTrip(
                                    positions, previousEndParkingIndex, startParkingIndex, ignoreOdometer));
                        }
                        }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20935);previousEndParkingIndex = endParkingIndex;
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20936);skipped = false;
                    } }else {{
                        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20937);skipped = true;
                    }
                    }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20938);startParkingIndex = -1;
                }
            }}
        }}

        }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20939);return result;
    }finally{__CLR4_5_2g2wg2wlx1dzcpd.R.flushNeeded();}}

    private static Collection<TripReport> detectTrips(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20940);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20941);double speedThreshold = Context.getConfig().getDouble("event.motion.speedThreshold", 0.01);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20942);long minimalTripDuration = Context.getConfig().getLong("report.trip.minimalTripDuration", 300) * 1000;
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20943);double minimalTripDistance = Context.getConfig().getLong("report.trip.minimalTripDistance", 500);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20944);long minimalParkingDuration = Context.getConfig().getLong("report.trip.minimalParkingDuration", 300) * 1000;
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20945);boolean greedyParking = Context.getConfig().getBoolean("report.trip.greedyParking");

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20946);boolean ignoreOdometer = Context.getDeviceManager()
                .lookupAttributeBoolean(deviceId, "report.ignoreOdometer", false, true);

        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20947);return detectTrips(
                speedThreshold, minimalTripDistance, minimalTripDuration,
                minimalParkingDuration, greedyParking, ignoreOdometer,
                Context.getDataManager().getPositions(deviceId, from, to));
    }finally{__CLR4_5_2g2wg2wlx1dzcpd.R.flushNeeded();}}

    public static Collection<TripReport> getObjects(long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Date from, Date to) throws SQLException {try{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20948);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20949);ArrayList<TripReport> result = new ArrayList<>();
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20950);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20951);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20952);result.addAll(detectTrips(deviceId, from, to));
        }
        }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20953);return result;
    }finally{__CLR4_5_2g2wg2wlx1dzcpd.R.flushNeeded();}}

    public static void getExcel(OutputStream outputStream,
            long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            DateTime from, DateTime to) throws SQLException, IOException {try{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20954);
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20955);ArrayList<DeviceReport> devicesTrips = new ArrayList<>();
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20956);ArrayList<String> sheetNames = new ArrayList<>();
        __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20957);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20958);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20959);Collection<TripReport> trips = detectTrips(deviceId, from.toDate(), to.toDate());
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20960);DeviceReport deviceTrips = new DeviceReport();
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20961);Device device = Context.getIdentityManager().getDeviceById(deviceId);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20962);deviceTrips.setDeviceName(device.getName());
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20963);sheetNames.add(deviceTrips.getDeviceName());
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20964);if ((((device.getGroupId() != 0)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20965)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20966)==0&false))) {{
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20967);Group group = Context.getDeviceManager().getGroupById(device.getGroupId());
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20968);if ((((group != null)&&(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20969)!=0|true))||(__CLR4_5_2g2wg2wlx1dzcpd.R.iget(20970)==0&false))) {{
                    __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20971);deviceTrips.setGroupName(group.getName());
                }
            }}
            }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20972);deviceTrips.setObjects(trips);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20973);devicesTrips.add(deviceTrips);
        }
        }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20974);String templatePath = Context.getConfig().getString("report.templatesPath",
                "templates/export/");
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20975);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20976);}};InputStream inputStream = new FileInputStream(templatePath + "/trips.xlsx")) {
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20977);org.jxls.common.Context jxlsContext = PoiTransformer.createInitialContext();
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20978);jxlsContext.putVar("devices", devicesTrips);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20979);jxlsContext.putVar("sheetNames", sheetNames);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20980);jxlsContext.putVar("from", from);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20981);jxlsContext.putVar("to", to);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20982);jxlsContext.putVar("distanceUnit", ReportUtils.getDistanceUnit(userId));
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20983);jxlsContext.putVar("speedUnit", ReportUtils.getSpeedUnit(userId));
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20984);jxlsContext.putVar("timezone", from.getZone());
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20985);Transformer transformer = TransformerFactory.createTransformer(inputStream, outputStream);
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20986);List<Area> xlsAreas = new XlsCommentAreaBuilder(transformer).build();
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20987);for (Area xlsArea : xlsAreas) {{
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20988);xlsArea.applyAt(new CellRef(xlsArea.getStartCellRef().getCellName()), jxlsContext);
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20989);xlsArea.setFormulaProcessor(new StandardFormulaProcessor());
                __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20990);xlsArea.processFormulas();
            }
            }__CLR4_5_2g2wg2wlx1dzcpd.R.inc(20991);transformer.deleteSheet(xlsAreas.get(0).getStartCellRef().getSheetName());
            __CLR4_5_2g2wg2wlx1dzcpd.R.inc(20992);transformer.write();
        }
    }finally{__CLR4_5_2g2wg2wlx1dzcpd.R.flushNeeded();}}

}
