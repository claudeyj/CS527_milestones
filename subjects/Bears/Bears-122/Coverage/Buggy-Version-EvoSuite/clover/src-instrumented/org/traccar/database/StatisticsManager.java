/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.database;

import com.ning.http.client.Request;
import com.ning.http.client.RequestBuilder;
import org.joda.time.format.ISODateTimeFormat;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Statistics;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class StatisticsManager {public static class __CLR4_5_231r31rlwydw9v7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,4016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int SPLIT_MODE = Calendar.DAY_OF_MONTH;

    private int lastUpdate = Calendar.getInstance().get(SPLIT_MODE);

    private Set<Long> users = new HashSet<>();
    private Set<Long> devices = new HashSet<>();

    private int requests;
    private int messagesReceived;
    private int messagesStored;
    private int mailSent;
    private int smsSent;
    private int geocoderRequests;
    private int geolocationRequests;

    private void checkSplit() {try{__CLR4_5_231r31rlwydw9v7.R.inc(3951);
        __CLR4_5_231r31rlwydw9v7.R.inc(3952);int currentUpdate = Calendar.getInstance().get(SPLIT_MODE);
        __CLR4_5_231r31rlwydw9v7.R.inc(3953);if ((((lastUpdate != currentUpdate)&&(__CLR4_5_231r31rlwydw9v7.R.iget(3954)!=0|true))||(__CLR4_5_231r31rlwydw9v7.R.iget(3955)==0&false))) {{
            __CLR4_5_231r31rlwydw9v7.R.inc(3956);Statistics statistics = new Statistics();
            __CLR4_5_231r31rlwydw9v7.R.inc(3957);statistics.setCaptureTime(new Date());
            __CLR4_5_231r31rlwydw9v7.R.inc(3958);statistics.setActiveUsers(users.size());
            __CLR4_5_231r31rlwydw9v7.R.inc(3959);statistics.setActiveDevices(devices.size());
            __CLR4_5_231r31rlwydw9v7.R.inc(3960);statistics.setRequests(requests);
            __CLR4_5_231r31rlwydw9v7.R.inc(3961);statistics.setMessagesReceived(messagesReceived);
            __CLR4_5_231r31rlwydw9v7.R.inc(3962);statistics.setMessagesStored(messagesStored);
            __CLR4_5_231r31rlwydw9v7.R.inc(3963);statistics.setMailSent(mailSent);
            __CLR4_5_231r31rlwydw9v7.R.inc(3964);statistics.setSmsSent(smsSent);
            __CLR4_5_231r31rlwydw9v7.R.inc(3965);statistics.setGeocoderRequests(geocoderRequests);
            __CLR4_5_231r31rlwydw9v7.R.inc(3966);statistics.setGeolocationRequests(geolocationRequests);

            __CLR4_5_231r31rlwydw9v7.R.inc(3967);try {
                __CLR4_5_231r31rlwydw9v7.R.inc(3968);Context.getDataManager().addObject(statistics);
            } catch (SQLException e) {
                __CLR4_5_231r31rlwydw9v7.R.inc(3969);Log.warning(e);
            }

            __CLR4_5_231r31rlwydw9v7.R.inc(3970);String url = Context.getConfig().getString("server.statistics");
            __CLR4_5_231r31rlwydw9v7.R.inc(3971);if ((((url != null)&&(__CLR4_5_231r31rlwydw9v7.R.iget(3972)!=0|true))||(__CLR4_5_231r31rlwydw9v7.R.iget(3973)==0&false))) {{
                __CLR4_5_231r31rlwydw9v7.R.inc(3974);String time = ISODateTimeFormat.dateTime().print(statistics.getCaptureTime().getTime());
                __CLR4_5_231r31rlwydw9v7.R.inc(3975);Request request = new RequestBuilder("POST")
                        .setUrl(url)
                        .addHeader("Content-Type", "application/x-www-form-urlencoded")
                        .addFormParam("version", Log.getAppVersion())
                        .addFormParam("captureTime", time)
                        .addFormParam("activeUsers", String.valueOf(statistics.getActiveUsers()))
                        .addFormParam("activeDevices", String.valueOf(statistics.getActiveDevices()))
                        .addFormParam("requests", String.valueOf(statistics.getRequests()))
                        .addFormParam("messagesReceived", String.valueOf(statistics.getMessagesReceived()))
                        .addFormParam("messagesStored", String.valueOf(statistics.getMessagesStored()))
                        .addFormParam("mailSent", String.valueOf(statistics.getMailSent()))
                        .addFormParam("smsSent", String.valueOf(statistics.getSmsSent()))
                        .addFormParam("geocoderRequests", String.valueOf(statistics.getGeocoderRequests()))
                        .addFormParam("geolocationRequests", String.valueOf(statistics.getGeolocationRequests()))
                        .build();
                __CLR4_5_231r31rlwydw9v7.R.inc(3976);Context.getAsyncHttpClient().prepareRequest(request).execute();
            }

            }__CLR4_5_231r31rlwydw9v7.R.inc(3977);users.clear();
            __CLR4_5_231r31rlwydw9v7.R.inc(3978);devices.clear();
            __CLR4_5_231r31rlwydw9v7.R.inc(3979);requests = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3980);messagesReceived = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3981);messagesStored = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3982);mailSent = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3983);smsSent = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3984);geocoderRequests = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3985);geolocationRequests = 0;
            __CLR4_5_231r31rlwydw9v7.R.inc(3986);lastUpdate = currentUpdate;
        }
    }}finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerRequest(long userId) {try{__CLR4_5_231r31rlwydw9v7.R.inc(3987);
        __CLR4_5_231r31rlwydw9v7.R.inc(3988);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(3989);requests += 1;
        __CLR4_5_231r31rlwydw9v7.R.inc(3990);if ((((userId != 0)&&(__CLR4_5_231r31rlwydw9v7.R.iget(3991)!=0|true))||(__CLR4_5_231r31rlwydw9v7.R.iget(3992)==0&false))) {{
            __CLR4_5_231r31rlwydw9v7.R.inc(3993);users.add(userId);
        }
    }}finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerMessageReceived() {try{__CLR4_5_231r31rlwydw9v7.R.inc(3994);
        __CLR4_5_231r31rlwydw9v7.R.inc(3995);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(3996);messagesReceived += 1;
    }finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerMessageStored(long deviceId) {try{__CLR4_5_231r31rlwydw9v7.R.inc(3997);
        __CLR4_5_231r31rlwydw9v7.R.inc(3998);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(3999);messagesStored += 1;
        __CLR4_5_231r31rlwydw9v7.R.inc(4000);if ((((deviceId != 0)&&(__CLR4_5_231r31rlwydw9v7.R.iget(4001)!=0|true))||(__CLR4_5_231r31rlwydw9v7.R.iget(4002)==0&false))) {{
            __CLR4_5_231r31rlwydw9v7.R.inc(4003);devices.add(deviceId);
        }
    }}finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerMail() {try{__CLR4_5_231r31rlwydw9v7.R.inc(4004);
        __CLR4_5_231r31rlwydw9v7.R.inc(4005);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(4006);mailSent += 1;
    }finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerSms() {try{__CLR4_5_231r31rlwydw9v7.R.inc(4007);
        __CLR4_5_231r31rlwydw9v7.R.inc(4008);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(4009);smsSent += 1;
    }finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerGeocoderRequest() {try{__CLR4_5_231r31rlwydw9v7.R.inc(4010);
        __CLR4_5_231r31rlwydw9v7.R.inc(4011);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(4012);geocoderRequests += 1;
    }finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

    public synchronized void registerGeolocationRequest() {try{__CLR4_5_231r31rlwydw9v7.R.inc(4013);
        __CLR4_5_231r31rlwydw9v7.R.inc(4014);checkSplit();
        __CLR4_5_231r31rlwydw9v7.R.inc(4015);geolocationRequests += 1;
    }finally{__CLR4_5_231r31rlwydw9v7.R.flushNeeded();}}

}
