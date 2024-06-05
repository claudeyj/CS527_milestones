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

import org.jxls.util.JxlsHelper;
import org.traccar.Context;
import org.traccar.model.Position;
import org.traccar.reports.model.SummaryReport;

public final class Summary {public static class __CLR4_5_2iu9iu9lwye4223{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,24464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Summary() {try{__CLR4_5_2iu9iu9lwye4223.R.inc(24417);
    }finally{__CLR4_5_2iu9iu9lwye4223.R.flushNeeded();}}

    private static SummaryReport calculateSummaryResult(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_2iu9iu9lwye4223.R.inc(24418);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24419);SummaryReport result = new SummaryReport();
        __CLR4_5_2iu9iu9lwye4223.R.inc(24420);result.setDeviceId(deviceId);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24421);result.setDeviceName(Context.getIdentityManager().getById(deviceId).getName());
        __CLR4_5_2iu9iu9lwye4223.R.inc(24422);Collection<Position> positions = Context.getDataManager().getPositions(deviceId, from, to);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24423);if ((((positions != null && !positions.isEmpty())&&(__CLR4_5_2iu9iu9lwye4223.R.iget(24424)!=0|true))||(__CLR4_5_2iu9iu9lwye4223.R.iget(24425)==0&false))) {{
            __CLR4_5_2iu9iu9lwye4223.R.inc(24426);Position firstPosition = null;
            __CLR4_5_2iu9iu9lwye4223.R.inc(24427);Position previousPosition = null;
            __CLR4_5_2iu9iu9lwye4223.R.inc(24428);double speedSum = 0;
            __CLR4_5_2iu9iu9lwye4223.R.inc(24429);for (Position position : positions) {{
                __CLR4_5_2iu9iu9lwye4223.R.inc(24430);if ((((firstPosition == null)&&(__CLR4_5_2iu9iu9lwye4223.R.iget(24431)!=0|true))||(__CLR4_5_2iu9iu9lwye4223.R.iget(24432)==0&false))) {{
                    __CLR4_5_2iu9iu9lwye4223.R.inc(24433);firstPosition = position;
                }
                }__CLR4_5_2iu9iu9lwye4223.R.inc(24434);if ((((previousPosition != null && position.getBoolean(Position.KEY_IGNITION)
                        && previousPosition.getBoolean(Position.KEY_IGNITION))&&(__CLR4_5_2iu9iu9lwye4223.R.iget(24435)!=0|true))||(__CLR4_5_2iu9iu9lwye4223.R.iget(24436)==0&false))) {{
                    __CLR4_5_2iu9iu9lwye4223.R.inc(24437);result.addEngineHours(position.getFixTime().getTime()
                            - previousPosition.getFixTime().getTime());
                }
                }__CLR4_5_2iu9iu9lwye4223.R.inc(24438);previousPosition = position;
                __CLR4_5_2iu9iu9lwye4223.R.inc(24439);speedSum += position.getSpeed();
                __CLR4_5_2iu9iu9lwye4223.R.inc(24440);result.setMaxSpeed(position.getSpeed());
            }
            }__CLR4_5_2iu9iu9lwye4223.R.inc(24441);boolean ignoreOdometer = Context.getDeviceManager()
                    .lookupAttributeBoolean(deviceId, "report.ignoreOdometer", false, true);
            __CLR4_5_2iu9iu9lwye4223.R.inc(24442);result.setDistance(ReportUtils.calculateDistance(firstPosition, previousPosition, !ignoreOdometer));
            __CLR4_5_2iu9iu9lwye4223.R.inc(24443);result.setAverageSpeed(speedSum / positions.size());
            __CLR4_5_2iu9iu9lwye4223.R.inc(24444);result.setSpentFuel(ReportUtils.calculateFuel(firstPosition, previousPosition));
        }
        }__CLR4_5_2iu9iu9lwye4223.R.inc(24445);return result;
    }finally{__CLR4_5_2iu9iu9lwye4223.R.flushNeeded();}}

    public static Collection<SummaryReport> getObjects(long userId, Collection<Long> deviceIds,
            Collection<Long> groupIds, Date from, Date to) throws SQLException {try{__CLR4_5_2iu9iu9lwye4223.R.inc(24446);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24447);ReportUtils.checkPeriodLimit(from, to);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24448);ArrayList<SummaryReport> result = new ArrayList<>();
        __CLR4_5_2iu9iu9lwye4223.R.inc(24449);for (long deviceId: ReportUtils.getDeviceList(deviceIds, groupIds)) {{
            __CLR4_5_2iu9iu9lwye4223.R.inc(24450);Context.getPermissionsManager().checkDevice(userId, deviceId);
            __CLR4_5_2iu9iu9lwye4223.R.inc(24451);result.add(calculateSummaryResult(deviceId, from, to));
        }
        }__CLR4_5_2iu9iu9lwye4223.R.inc(24452);return result;
    }finally{__CLR4_5_2iu9iu9lwye4223.R.flushNeeded();}}

    public static void getExcel(OutputStream outputStream,
            long userId, Collection<Long> deviceIds, Collection<Long> groupIds,
            Date from, Date to) throws SQLException, IOException {try{__CLR4_5_2iu9iu9lwye4223.R.inc(24453);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24454);ReportUtils.checkPeriodLimit(from, to);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24455);Collection<SummaryReport> summaries = getObjects(userId, deviceIds, groupIds, from, to);
        __CLR4_5_2iu9iu9lwye4223.R.inc(24456);String templatePath = Context.getConfig().getString("report.templatesPath",
                "templates/export/");
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2iu9iu9lwye4223.R.inc(24457);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2iu9iu9lwye4223.R.inc(24458);}};InputStream inputStream = new FileInputStream(templatePath + "/summary.xlsx")) {
            __CLR4_5_2iu9iu9lwye4223.R.inc(24459);org.jxls.common.Context jxlsContext = ReportUtils.initializeContext(userId);
            __CLR4_5_2iu9iu9lwye4223.R.inc(24460);jxlsContext.putVar("summaries", summaries);
            __CLR4_5_2iu9iu9lwye4223.R.inc(24461);jxlsContext.putVar("from", from);
            __CLR4_5_2iu9iu9lwye4223.R.inc(24462);jxlsContext.putVar("to", to);
            __CLR4_5_2iu9iu9lwye4223.R.inc(24463);JxlsHelper.getInstance().setUseFastFormulaProcessor(false)
                    .processTemplate(inputStream, outputStream, jxlsContext);
        }
    }finally{__CLR4_5_2iu9iu9lwye4223.R.flushNeeded();}}
}
