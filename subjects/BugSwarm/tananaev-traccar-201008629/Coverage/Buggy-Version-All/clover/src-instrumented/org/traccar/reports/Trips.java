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

public final class Trips {public static class __CLR4_5_2g30g30lx1dxqo8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,20997,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Trips() {try{__CLR4_5_2g30g30lx1dxqo8.R.inc(20844);
    }finally{__CLR4_5_2g30g30lx1dxqo8.R.flushNeeded();}}

    private static TripReport calculateTrip(
            ArrayList<Position> positions, int startIndex, int endIndex, boolean ignoreOdometer) {try{__CLR4_5_2g30g30lx1dxqo8.R.inc(20845);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20846);Position startTrip = positions.get(startIndex);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20847);Position endTrip = positions.get(endIndex);

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20848);double speedMax = 0.0;
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20849);double speedSum = 0.0;
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20850);for (int i = startIndex; (((i <= endIndex)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20851)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20852)==0&false)); i++) {{
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20853);double speed = positions.get(i).getSpeed();
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20854);speedSum += speed;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20855);if ((((speed > speedMax)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20856)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20857)==0&false))) {{
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20858);speedMax = speed;
            }
        }}

        }__CLR4_5_2g30g30lx1dxqo8.R.inc(20859);TripReport trip = new TripReport();

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20860);long tripDuration = endTrip.getFixTime().getTime() - positions.get(startIndex).getFixTime().getTime();
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20861);long deviceId = startTrip.getDeviceId();
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20862);trip.setDeviceId(deviceId);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20863);trip.setDeviceName(Context.getIdentityManager().getDeviceById(deviceId).getName());

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20864);trip.setStartPositionId(startTrip.getId());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20865);trip.setStartLat(startTrip.getLatitude());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20866);trip.setStartLon(startTrip.getLongitude());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20867);trip.setStartTime(startTrip.getFixTime());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20868);trip.setStartAddress(startTrip.getAddress());

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20869);trip.setEndPositionId(endTrip.getId());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20870);trip.setEndLat(endTrip.getLatitude());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20871);trip.setEndLon(endTrip.getLongitude());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20872);trip.setEndTime(endTrip.getFixTime());
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20873);trip.setEndAddress(endTrip.getAddress());

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20874);trip.setDistance(ReportUtils.calculateDistance(startTrip, endTrip, !ignoreOdometer));
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20875);trip.setDuration(tripDuration);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20876);trip.setAverageSpeed(speedSum / (endIndex - startIndex));
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20877);trip.setMaxSpeed(speedMax);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20878);trip.setSpentFuel(ReportUtils.calculateFuel(startTrip, endTrip));

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20879);return trip;
    }finally{__CLR4_5_2g30g30lx1dxqo8.R.flushNeeded();}}

    protected static Collection<TripReport> detectTrips(
            double speedThreshold, double minimalTripDistance,
            long minimalTripDuration, long minimalParkingDuration, boolean greedyParking, boolean ignoreOdometer,
            Collection<Position> positionCollection) {try{__CLR4_5_2g30g30lx1dxqo8.R.inc(20880);

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20881);Collection<TripReport> result = new ArrayList<>();

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20882);ArrayList<Position> positions = new ArrayList<>(positionCollection);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20883);if ((((positions != null && !positions.isEmpty())&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20884)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20885)==0&false))) {{
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20886);int previousStartParkingIndex = 0;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20887);int startParkingIndex = -1;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20888);int previousEndParkingIndex = 0;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20889);int endParkingIndex = 0;

            __CLR4_5_2g30g30lx1dxqo8.R.inc(20890);boolean isMoving = false;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20891);boolean isLast = false;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20892);boolean skipped = false;
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20893);boolean tripFiltered = false;

            __CLR4_5_2g30g30lx1dxqo8.R.inc(20894);for (int i = 0; (((i < positions.size())&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20895)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20896)==0&false)); i++) {{
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20897);isMoving = positions.get(i).getSpeed() > speedThreshold;
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20898);isLast = i == positions.size() - 1;

                __CLR4_5_2g30g30lx1dxqo8.R.inc(20899);if (((((isMoving || isLast) && startParkingIndex != -1)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20900)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20901)==0&false))) {{
                    __CLR4_5_2g30g30lx1dxqo8.R.inc(20902);if ((((!skipped || previousEndParkingIndex == 0)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20903)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20904)==0&false))) {{
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20905);previousEndParkingIndex = endParkingIndex;
                    }
                    }__CLR4_5_2g30g30lx1dxqo8.R.inc(20906);endParkingIndex = i;
                }
                }__CLR4_5_2g30g30lx1dxqo8.R.inc(20907);if ((((!isMoving && startParkingIndex == -1)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20908)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20909)==0&false))) {{
                    __CLR4_5_2g30g30lx1dxqo8.R.inc(20910);if ((((greedyParking)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20911)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20912)==0&false))) {{
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20913);long tripDuration = positions.get(i).getFixTime().getTime()
                                - positions.get(endParkingIndex).getFixTime().getTime();
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20914);double tripDistance = ReportUtils.calculateDistance(positions.get(endParkingIndex),
                                positions.get(i), false);
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20915);tripFiltered = tripDuration < minimalTripDuration && tripDistance < minimalTripDistance;
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20916);if ((((tripFiltered)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20917)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20918)==0&false))) {{
                            __CLR4_5_2g30g30lx1dxqo8.R.inc(20919);startParkingIndex = previousStartParkingIndex;
                            __CLR4_5_2g30g30lx1dxqo8.R.inc(20920);endParkingIndex = previousEndParkingIndex;
                            __CLR4_5_2g30g30lx1dxqo8.R.inc(20921);tripFiltered = false;
                        } }else {{
                            __CLR4_5_2g30g30lx1dxqo8.R.inc(20922);previousStartParkingIndex = i;
                            __CLR4_5_2g30g30lx1dxqo8.R.inc(20923);startParkingIndex = i;
                        }
                    }} }else {{
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20924);long tripDuration = positions.get(i).getFixTime().getTime()
                                - positions.get(previousEndParkingIndex).getFixTime().getTime();
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20925);double tripDistance = ReportUtils.calculateDistance(positions.get(previousEndParkingIndex),
                                positions.get(i), false);
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20926);tripFiltered = tripDuration < minimalTripDuration && tripDistance < minimalTripDistance;
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20927);startParkingIndex = i;
                    }
                }}
                }__CLR4_5_2g30g30lx1dxqo8.R.inc(20928);if ((((startParkingIndex != -1 && (endParkingIndex > startParkingIndex || isLast))&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20929)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20930)==0&false))) {{
                    __CLR4_5_2g30g30lx1dxqo8.R.inc(20931);long parkingDuration = positions.get(endParkingIndex).getFixTime().getTime()
                            - positions.get(startParkingIndex).getFixTime().getTime();
                    __CLR4_5_2g30g30lx1dxqo8.R.inc(20932);if (((((parkingDuration >= minimalParkingDuration || isLast)
                            && previousEndParkingIndex < startParkingIndex)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20933)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20934)==0&false))) {{
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20935);if ((((!tripFiltered)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20936)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20937)==0&false))) {{
                            __CLR4_5_2g30g30lx1dxqo8.R.inc(20938);result.add(calculateTrip(
                                    positions, previousEndParkingIndex, startParkingIndex, ignoreOdometer));
                        }
                        }__CLR4_5_2g30g30lx1dxqo8.R.inc(20939);previousEndParkingIndex = endParkingIndex;
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20940);skipped = false;
                    } }else {{
                        __CLR4_5_2g30g30lx1dxqo8.R.inc(20941);skipped = true;
                    }
                    }__CLR4_5_2g30g30lx1dxqo8.R.inc(20942);startParkingIndex = -1;
                }
            }}
        }}

        }__CLR4_5_2g30g30lx1dxqo8.R.inc(20943);return result;
    }finally{__CLR4_5_2g30g30lx1dxqo8.R.flushNeeded();}}

    private static Collection<TripReport> detectTrips(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_2g30g30lx1dxqo8.R.inc(20944);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20945);double speedThreshold = Context.getConfig().getDouble("event.motion.speedThreshold", 0.01);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20946);long minimalTripDuration = Context.getConfig().getLong("report.trip.minimalTripDuration", 300) * 1000;
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20947);double minimalTripDistance = Context.getConfig().getLong("report.trip.minimalTripDistance", 500);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20948);long minimalParkingDuration = Context.getConfig().getLong("report.trip.minimalParkingDuration", 300) * 1000;
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20949);boolean greedyParking = Context.getConfig().getBoolean("report.trip.greedyParking");

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20950);boolean ignoreOdometer = Context.getDeviceManager()
                .lookupAttributeBoolean(deviceId, "report.ignoreOdometer", false, true);

        __CLR4_5_2g30g30lx1dxqo8.R.inc(20951);return detectTrips(
                speedThreshold, minimalTripDistance, minimalTripDuration,
                minimalParkingDuration, greedyParking, ignoreOdometer,
                Context.getDataManager().getPositions(deviceId, from, to));
    }finally{__CLR4_5_2g30g30lx1dxqo8.R.flushNeeded();}}

    public static Collection<TripReport> getObjects(long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Date from, Date to) throws SQLException {try{__CLR4_5_2g30g30lx1dxqo8.R.inc(20952);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20953);ArrayList<TripReport> result = new ArrayList<>();
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20954);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20955);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20956);result.addAll(detectTrips(deviceId, from, to));
        }
        }__CLR4_5_2g30g30lx1dxqo8.R.inc(20957);return result;
    }finally{__CLR4_5_2g30g30lx1dxqo8.R.flushNeeded();}}

    public static void getExcel(OutputStream outputStream,
            long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            DateTime from, DateTime to) throws SQLException, IOException {try{__CLR4_5_2g30g30lx1dxqo8.R.inc(20958);
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20959);ArrayList<DeviceReport> devicesTrips = new ArrayList<>();
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20960);ArrayList<String> sheetNames = new ArrayList<>();
        __CLR4_5_2g30g30lx1dxqo8.R.inc(20961);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20962);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20963);Collection<TripReport> trips = detectTrips(deviceId, from.toDate(), to.toDate());
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20964);DeviceReport deviceTrips = new DeviceReport();
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20965);Device device = Context.getIdentityManager().getDeviceById(deviceId);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20966);deviceTrips.setDeviceName(device.getName());
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20967);sheetNames.add(deviceTrips.getDeviceName());
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20968);if ((((device.getGroupId() != 0)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20969)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20970)==0&false))) {{
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20971);Group group = Context.getDeviceManager().getGroupById(device.getGroupId());
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20972);if ((((group != null)&&(__CLR4_5_2g30g30lx1dxqo8.R.iget(20973)!=0|true))||(__CLR4_5_2g30g30lx1dxqo8.R.iget(20974)==0&false))) {{
                    __CLR4_5_2g30g30lx1dxqo8.R.inc(20975);deviceTrips.setGroupName(group.getName());
                }
            }}
            }__CLR4_5_2g30g30lx1dxqo8.R.inc(20976);deviceTrips.setObjects(trips);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20977);devicesTrips.add(deviceTrips);
        }
        }__CLR4_5_2g30g30lx1dxqo8.R.inc(20978);String templatePath = Context.getConfig().getString("report.templatesPath",
                "templates/export/");
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2g30g30lx1dxqo8.R.inc(20979);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2g30g30lx1dxqo8.R.inc(20980);}};InputStream inputStream = new FileInputStream(templatePath + "/trips.xlsx")) {
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20981);org.jxls.common.Context jxlsContext = PoiTransformer.createInitialContext();
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20982);jxlsContext.putVar("devices", devicesTrips);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20983);jxlsContext.putVar("sheetNames", sheetNames);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20984);jxlsContext.putVar("from", from);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20985);jxlsContext.putVar("to", to);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20986);jxlsContext.putVar("distanceUnit", ReportUtils.getDistanceUnit(userId));
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20987);jxlsContext.putVar("speedUnit", ReportUtils.getSpeedUnit(userId));
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20988);jxlsContext.putVar("timezone", from.getZone());
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20989);Transformer transformer = TransformerFactory.createTransformer(inputStream, outputStream);
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20990);List<Area> xlsAreas = new XlsCommentAreaBuilder(transformer).build();
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20991);for (Area xlsArea : xlsAreas) {{
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20992);xlsArea.applyAt(new CellRef(xlsArea.getStartCellRef().getCellName()), jxlsContext);
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20993);xlsArea.setFormulaProcessor(new StandardFormulaProcessor());
                __CLR4_5_2g30g30lx1dxqo8.R.inc(20994);xlsArea.processFormulas();
            }
            }__CLR4_5_2g30g30lx1dxqo8.R.inc(20995);transformer.deleteSheet(xlsAreas.get(0).getStartCellRef().getSheetName());
            __CLR4_5_2g30g30lx1dxqo8.R.inc(20996);transformer.write();
        }
    }finally{__CLR4_5_2g30g30lx1dxqo8.R.flushNeeded();}}

}
