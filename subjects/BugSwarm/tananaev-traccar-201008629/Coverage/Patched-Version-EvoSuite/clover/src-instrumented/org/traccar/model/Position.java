/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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

public class Position extends Message {public static class __CLR4_5_24hr4hrlx1dz93h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,5906,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String KEY_ORIGINAL = "raw";
    public static final String KEY_INDEX = "index";
    public static final String KEY_HDOP = "hdop";
    public static final String KEY_SATELLITES = "sat";
    public static final String KEY_RSSI = "rssi";
    public static final String KEY_GPS = "gps";
    public static final String KEY_EVENT = "event";
    public static final String KEY_ALARM = "alarm";
    public static final String KEY_STATUS = "status";
    public static final String KEY_ODOMETER = "odometer"; // meters
    public static final String KEY_TRIP_ODOMETER = "tripOdometer";
    public static final String KEY_HOURS = "hours";
    public static final String KEY_INPUT = "input";
    public static final String KEY_OUTPUT = "output";
    public static final String KEY_POWER = "power";
    public static final String KEY_BATTERY = "battery";
    public static final String KEY_FUEL = "fuel";
    public static final String KEY_FUEL_CONSUMPTION = "fuelConsumption";
    public static final String KEY_RFID = "rfid";
    public static final String KEY_VERSION = "version";
    public static final String KEY_TYPE = "type";
    public static final String KEY_IGNITION = "ignition";
    public static final String KEY_FLAGS = "flags";
    public static final String KEY_CHARGE = "charge";
    public static final String KEY_IP = "ip";
    public static final String KEY_ARCHIVE = "archive";
    public static final String KEY_DISTANCE = "distance"; // meters
    public static final String KEY_TOTAL_DISTANCE = "totalDistance";
    public static final String KEY_RPM = "rpm";
    public static final String KEY_VIN = "vin";
    public static final String KEY_APPROXIMATE = "approximate";
    public static final String KEY_THROTTLE = "throttle";
    public static final String KEY_MOTION = "motion";
    public static final String KEY_ARMED = "armed";
    public static final String KEY_ACCURACY = "accuracy";
    public static final String KEY_GEOFENCE = "geofence";

    public static final String KEY_DTCS = "dtcs";
    public static final String KEY_OBD_SPEED = "obdSpeed";
    public static final String KEY_OBD_ODOMETER = "obdOdometer";

    public static final String KEY_RESULT = "result";

    // Starts with 1 not 0
    public static final String PREFIX_TEMP = "temp";
    public static final String PREFIX_ADC = "adc";
    public static final String PREFIX_IO = "io";
    public static final String PREFIX_COUNT = "count";

    public static final String ALARM_GENERAL = "general";
    public static final String ALARM_SOS = "sos";
    public static final String ALARM_VIBRATION = "vibration";
    public static final String ALARM_MOVEMENT = "movement";
    public static final String ALARM_LOW_SPEED = "lowspeed";
    public static final String ALARM_OVERSPEED = "overspeed";
    public static final String ALARM_FALL_DOWN = "fallDown";
    public static final String ALARM_LOW_BATTERY = "lowBattery";
    public static final String ALARM_FAULT = "fault";
    public static final String ALARM_POWER_OFF = "powerOff";
    public static final String ALARM_POWER_ON = "powerOn";
    public static final String ALARM_DOOR = "door";
    public static final String ALARM_GEOFENCE = "geofence";
    public static final String ALARM_GEOFENCE_ENTER = "geofenceEnter";
    public static final String ALARM_GEOFENCE_EXIT = "geofenceExit";
    public static final String ALARM_GPS_ANTENNA_CUT = "gpsAntennaCut";
    public static final String ALARM_ACCIDENT = "accident";
    public static final String ALARM_TOW = "tow";
    public static final String ALARM_ACCELETATION = "hardAcceleration";
    public static final String ALARM_BREAKING = "hardBreaking";
    public static final String ALARM_FATIGUE_DRIVING = "fatigueDriving";
    public static final String ALARM_POWER_CUT = "powerCut";
    public static final String ALARM_JAMMING = "jamming";
    public static final String ALARM_TEMPERATURE = "temperature";
    public static final String ALARM_PARKING = "parking";
    public static final String ALARM_SHOCK = "shock";
    public static final String ALARM_BONNET = "bonnet";
    public static final String ALARM_FOOT_BRAKE = "footBrake";
    public static final String ALARM_OIL_LEAK = "oilLeak";

    private String protocol;

    public String getProtocol() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5823);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5824);return protocol;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setProtocol(String protocol) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5825);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5826);this.protocol = protocol;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private Date serverTime;

    public Date getServerTime() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5827);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5828);if ((((serverTime != null)&&(__CLR4_5_24hr4hrlx1dz93h.R.iget(5829)!=0|true))||(__CLR4_5_24hr4hrlx1dz93h.R.iget(5830)==0&false))) {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5831);return new Date(serverTime.getTime());
        } }else {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5832);return null;
        }
    }}finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setServerTime(Date serverTime) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5833);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5834);if ((((serverTime != null)&&(__CLR4_5_24hr4hrlx1dz93h.R.iget(5835)!=0|true))||(__CLR4_5_24hr4hrlx1dz93h.R.iget(5836)==0&false))) {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5837);this.serverTime = new Date(serverTime.getTime());
        } }else {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5838);this.serverTime = null;
        }
    }}finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private Date deviceTime;

    public Date getDeviceTime() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5839);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5840);if ((((deviceTime != null)&&(__CLR4_5_24hr4hrlx1dz93h.R.iget(5841)!=0|true))||(__CLR4_5_24hr4hrlx1dz93h.R.iget(5842)==0&false))) {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5843);return new Date(deviceTime.getTime());
        } }else {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5844);return null;
        }
    }}finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setDeviceTime(Date deviceTime) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5845);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5846);if ((((deviceTime != null)&&(__CLR4_5_24hr4hrlx1dz93h.R.iget(5847)!=0|true))||(__CLR4_5_24hr4hrlx1dz93h.R.iget(5848)==0&false))) {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5849);this.deviceTime = new Date(deviceTime.getTime());
        } }else {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5850);this.deviceTime = null;
        }
    }}finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private Date fixTime;

    public Date getFixTime() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5851);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5852);if ((((fixTime != null)&&(__CLR4_5_24hr4hrlx1dz93h.R.iget(5853)!=0|true))||(__CLR4_5_24hr4hrlx1dz93h.R.iget(5854)==0&false))) {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5855);return new Date(fixTime.getTime());
        } }else {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5856);return null;
        }
    }}finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setFixTime(Date fixTime) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5857);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5858);if ((((fixTime != null)&&(__CLR4_5_24hr4hrlx1dz93h.R.iget(5859)!=0|true))||(__CLR4_5_24hr4hrlx1dz93h.R.iget(5860)==0&false))) {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5861);this.fixTime = new Date(fixTime.getTime());
        } }else {{
            __CLR4_5_24hr4hrlx1dz93h.R.inc(5862);this.fixTime = null;
        }
    }}finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setTime(Date time) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5863);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5864);setDeviceTime(time);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5865);setFixTime(time);
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private boolean outdated;

    public boolean getOutdated() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5866);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5867);return outdated;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setOutdated(boolean outdated) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5868);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5869);this.outdated = outdated;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private boolean valid;

    public boolean getValid() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5870);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5871);return valid;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setValid(boolean valid) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5872);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5873);this.valid = valid;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private double latitude;

    public double getLatitude() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5874);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5875);return latitude;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5876);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5877);this.latitude = latitude;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private double longitude;

    public double getLongitude() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5878);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5879);return longitude;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5880);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5881);this.longitude = longitude;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private double altitude;

    public double getAltitude() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5882);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5883);return altitude;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setAltitude(double altitude) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5884);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5885);this.altitude = altitude;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private double speed; // value in knots

    public double getSpeed() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5886);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5887);return speed;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setSpeed(double speed) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5888);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5889);this.speed = speed;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private double course;

    public double getCourse() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5890);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5891);return course;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setCourse(double course) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5892);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5893);this.course = course;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private String address;

    public String getAddress() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5894);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5895);return address;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setAddress(String address) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5896);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5897);this.address = address;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private double accuracy;

    public double getAccuracy() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5898);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5899);return accuracy;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setAccuracy(double accuracy) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5900);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5901);this.accuracy = accuracy;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    private Network network;

    public Network getNetwork() {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5902);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5903);return network;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

    public void setNetwork(Network network) {try{__CLR4_5_24hr4hrlx1dz93h.R.inc(5904);
        __CLR4_5_24hr4hrlx1dz93h.R.inc(5905);this.network = network;
    }finally{__CLR4_5_24hr4hrlx1dz93h.R.flushNeeded();}}

}
