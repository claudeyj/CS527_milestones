/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar.model;

import java.util.Date;

public class Event extends Message {public static class __CLR4_5_24s34s3lwydwb9n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,6225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Event(String type, long deviceId, long positionId) {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6195);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6196);this.setType(type);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6197);this.setDeviceId(deviceId);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6198);this.setPositionId(positionId);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6199);this.serverTime = new Date();
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    public Event(String type, long deviceId) {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6200);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6201);this.setType(type);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6202);this.setDeviceId(deviceId);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6203);this.serverTime = new Date();
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    public Event() {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6204);
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    public static final String ALL_EVENTS = "allEvents";

    public static final String TYPE_COMMAND_RESULT = "commandResult";

    public static final String TYPE_DEVICE_ONLINE = "deviceOnline";
    public static final String TYPE_DEVICE_UNKNOWN = "deviceUnknown";
    public static final String TYPE_DEVICE_OFFLINE = "deviceOffline";

    public static final String TYPE_DEVICE_MOVING = "deviceMoving";
    public static final String TYPE_DEVICE_STOPPED = "deviceStopped";

    public static final String TYPE_DEVICE_OVERSPEED = "deviceOverspeed";
    public static final String TYPE_DEVICE_FUEL_DROP = "deviceFuelDrop";

    public static final String TYPE_GEOFENCE_ENTER = "geofenceEnter";
    public static final String TYPE_GEOFENCE_EXIT = "geofenceExit";

    public static final String TYPE_ALARM = "alarm";

    public static final String TYPE_IGNITION_ON = "ignitionOn";
    public static final String TYPE_IGNITION_OFF = "ignitionOff";

    public static final String TYPE_MAINTENANCE = "maintenance";

    public static final String TYPE_TEXT_MESSAGE = "textMessage";

    public static final String TYPE_DRIVER_CHANGED = "driverChanged";

    private Date serverTime;

    public Date getServerTime() {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6205);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6206);if ((((serverTime != null)&&(__CLR4_5_24s34s3lwydwb9n.R.iget(6207)!=0|true))||(__CLR4_5_24s34s3lwydwb9n.R.iget(6208)==0&false))) {{
            __CLR4_5_24s34s3lwydwb9n.R.inc(6209);return new Date(serverTime.getTime());
        } }else {{
            __CLR4_5_24s34s3lwydwb9n.R.inc(6210);return null;
        }
    }}finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    public void setServerTime(Date serverTime) {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6211);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6212);if ((((serverTime != null)&&(__CLR4_5_24s34s3lwydwb9n.R.iget(6213)!=0|true))||(__CLR4_5_24s34s3lwydwb9n.R.iget(6214)==0&false))) {{
            __CLR4_5_24s34s3lwydwb9n.R.inc(6215);this.serverTime = new Date(serverTime.getTime());
        } }else {{
            __CLR4_5_24s34s3lwydwb9n.R.inc(6216);this.serverTime = null;
        }
    }}finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    private long positionId;

    public long getPositionId() {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6217);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6218);return positionId;
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    public void setPositionId(long positionId) {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6219);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6220);this.positionId = positionId;
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    private long geofenceId = 0;

    public long getGeofenceId() {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6221);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6222);return geofenceId;
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

    public void setGeofenceId(long geofenceId) {try{__CLR4_5_24s34s3lwydwb9n.R.inc(6223);
        __CLR4_5_24s34s3lwydwb9n.R.inc(6224);this.geofenceId = geofenceId;
    }finally{__CLR4_5_24s34s3lwydwb9n.R.flushNeeded();}}

}
