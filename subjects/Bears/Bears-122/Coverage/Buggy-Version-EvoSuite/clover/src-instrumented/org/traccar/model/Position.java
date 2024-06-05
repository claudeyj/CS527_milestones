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

import org.traccar.database.QueryIgnore;

public class Position extends Message {public static class __CLR4_5_24z24z2lwydwbdf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,6531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String KEY_ORIGINAL = "raw";
    public static final String KEY_INDEX = "index";
    public static final String KEY_HDOP = "hdop";
    public static final String KEY_VDOP = "vdop";
    public static final String KEY_PDOP = "pdop";
    public static final String KEY_SATELLITES = "sat"; // in use
    public static final String KEY_SATELLITES_VISIBLE = "satVisible";
    public static final String KEY_RSSI = "rssi";
    public static final String KEY_GPS = "gps";
    public static final String KEY_EVENT = "event";
    public static final String KEY_ALARM = "alarm";
    public static final String KEY_STATUS = "status";
    public static final String KEY_ODOMETER = "odometer"; // meters
    public static final String KEY_ODOMETER_SERVICE = "serviceOdometer"; // meters
    public static final String KEY_ODOMETER_TRIP = "tripOdometer"; // meters
    public static final String KEY_HOURS = "hours";
    public static final String KEY_INPUT = "input";
    public static final String KEY_OUTPUT = "output";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_VIDEO = "video";
    public static final String KEY_AUDIO = "audio";

    // The units for the below four KEYs currently vary.
    // The preferred units of measure are specified in the comment for each.
    public static final String KEY_POWER = "power"; // volts
    public static final String KEY_BATTERY = "battery"; // volts
    public static final String KEY_BATTERY_LEVEL = "batteryLevel"; // percentage
    public static final String KEY_FUEL_LEVEL = "fuel"; // liters
    public static final String KEY_FUEL_CONSUMPTION = "fuelConsumption"; // liters/hour

    public static final String KEY_VERSION_FW = "versionFw";
    public static final String KEY_VERSION_HW = "versionHw";
    public static final String KEY_TYPE = "type";
    public static final String KEY_IGNITION = "ignition";
    public static final String KEY_FLAGS = "flags";
    public static final String KEY_CHARGE = "charge";
    public static final String KEY_IP = "ip";
    public static final String KEY_ARCHIVE = "archive";
    public static final String KEY_DISTANCE = "distance"; // meters
    public static final String KEY_TOTAL_DISTANCE = "totalDistance"; // meters
    public static final String KEY_RPM = "rpm";
    public static final String KEY_VIN = "vin";
    public static final String KEY_APPROXIMATE = "approximate";
    public static final String KEY_THROTTLE = "throttle";
    public static final String KEY_MOTION = "motion";
    public static final String KEY_ARMED = "armed";
    public static final String KEY_GEOFENCE = "geofence";
    public static final String KEY_ACCELERATION = "acceleration";
    public static final String KEY_DEVICE_TEMP = "deviceTemp"; // celsius
    public static final String KEY_COOLANT_TEMP = "coolantTemp"; // celsius
    public static final String KEY_ENGINE_LOAD = "engineLoad";
    public static final String KEY_OPERATOR = "operator";
    public static final String KEY_COMMAND = "command";
    public static final String KEY_BLOCKED = "blocked";

    public static final String KEY_DTCS = "dtcs";
    public static final String KEY_OBD_SPEED = "obdSpeed"; // knots
    public static final String KEY_OBD_ODOMETER = "obdOdometer"; // meters

    public static final String KEY_RESULT = "result";

    public static final String KEY_DRIVER_UNIQUE_ID = "driverUniqueId";

    // Start with 1 not 0
    public static final String PREFIX_TEMP = "temp";
    public static final String PREFIX_ADC = "adc";
    public static final String PREFIX_IO = "io";
    public static final String PREFIX_COUNT = "count";
    public static final String PREFIX_IN = "in";
    public static final String PREFIX_OUT = "out";

    public static final String ALARM_GENERAL = "general";
    public static final String ALARM_SOS = "sos";
    public static final String ALARM_VIBRATION = "vibration";
    public static final String ALARM_MOVEMENT = "movement";
    public static final String ALARM_LOW_SPEED = "lowspeed";
    public static final String ALARM_OVERSPEED = "overspeed";
    public static final String ALARM_FALL_DOWN = "fallDown";
    public static final String ALARM_LOW_POWER = "lowPower";
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
    public static final String ALARM_ACCELERATION = "hardAcceleration";
    public static final String ALARM_BREAKING = "hardBreaking";
    public static final String ALARM_CORNERING = "hardCornering";
    public static final String ALARM_FATIGUE_DRIVING = "fatigueDriving";
    public static final String ALARM_POWER_CUT = "powerCut";
    public static final String ALARM_POWER_RESTORED = "powerRestored";
    public static final String ALARM_JAMMING = "jamming";
    public static final String ALARM_TEMPERATURE = "temperature";
    public static final String ALARM_PARKING = "parking";
    public static final String ALARM_SHOCK = "shock";
    public static final String ALARM_BONNET = "bonnet";
    public static final String ALARM_FOOT_BRAKE = "footBrake";
    public static final String ALARM_OIL_LEAK = "oilLeak";
    public static final String ALARM_TAMPERING = "tampering";
    public static final String ALARM_REMOVING = "removing";

    private String protocol;

    public String getProtocol() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6446);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6447);return protocol;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setProtocol(String protocol) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6448);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6449);this.protocol = protocol;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private Date serverTime;

    public Date getServerTime() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6450);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6451);if ((((serverTime != null)&&(__CLR4_5_24z24z2lwydwbdf.R.iget(6452)!=0|true))||(__CLR4_5_24z24z2lwydwbdf.R.iget(6453)==0&false))) {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6454);return new Date(serverTime.getTime());
        } }else {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6455);return null;
        }
    }}finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setServerTime(Date serverTime) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6456);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6457);if ((((serverTime != null)&&(__CLR4_5_24z24z2lwydwbdf.R.iget(6458)!=0|true))||(__CLR4_5_24z24z2lwydwbdf.R.iget(6459)==0&false))) {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6460);this.serverTime = new Date(serverTime.getTime());
        } }else {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6461);this.serverTime = null;
        }
    }}finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private Date deviceTime;

    public Date getDeviceTime() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6462);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6463);if ((((deviceTime != null)&&(__CLR4_5_24z24z2lwydwbdf.R.iget(6464)!=0|true))||(__CLR4_5_24z24z2lwydwbdf.R.iget(6465)==0&false))) {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6466);return new Date(deviceTime.getTime());
        } }else {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6467);return null;
        }
    }}finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setDeviceTime(Date deviceTime) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6468);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6469);if ((((deviceTime != null)&&(__CLR4_5_24z24z2lwydwbdf.R.iget(6470)!=0|true))||(__CLR4_5_24z24z2lwydwbdf.R.iget(6471)==0&false))) {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6472);this.deviceTime = new Date(deviceTime.getTime());
        } }else {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6473);this.deviceTime = null;
        }
    }}finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private Date fixTime;

    public Date getFixTime() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6474);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6475);if ((((fixTime != null)&&(__CLR4_5_24z24z2lwydwbdf.R.iget(6476)!=0|true))||(__CLR4_5_24z24z2lwydwbdf.R.iget(6477)==0&false))) {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6478);return new Date(fixTime.getTime());
        } }else {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6479);return null;
        }
    }}finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setFixTime(Date fixTime) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6480);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6481);if ((((fixTime != null)&&(__CLR4_5_24z24z2lwydwbdf.R.iget(6482)!=0|true))||(__CLR4_5_24z24z2lwydwbdf.R.iget(6483)==0&false))) {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6484);this.fixTime = new Date(fixTime.getTime());
        } }else {{
            __CLR4_5_24z24z2lwydwbdf.R.inc(6485);this.fixTime = null;
        }
    }}finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setTime(Date time) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6486);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6487);setDeviceTime(time);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6488);setFixTime(time);
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private boolean outdated;

    @QueryIgnore
    public boolean getOutdated() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6489);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6490);return outdated;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setOutdated(boolean outdated) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6491);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6492);this.outdated = outdated;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private boolean valid;

    public boolean getValid() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6493);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6494);return valid;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setValid(boolean valid) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6495);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6496);this.valid = valid;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private double latitude;

    public double getLatitude() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6497);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6498);return latitude;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6499);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6500);this.latitude = latitude;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private double longitude;

    public double getLongitude() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6501);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6502);return longitude;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6503);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6504);this.longitude = longitude;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private double altitude; // value in meters

    public double getAltitude() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6505);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6506);return altitude;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setAltitude(double altitude) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6507);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6508);this.altitude = altitude;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private double speed; // value in knots

    public double getSpeed() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6509);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6510);return speed;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setSpeed(double speed) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6511);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6512);this.speed = speed;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private double course;

    public double getCourse() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6513);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6514);return course;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setCourse(double course) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6515);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6516);this.course = course;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private String address;

    public String getAddress() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6517);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6518);return address;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setAddress(String address) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6519);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6520);this.address = address;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private double accuracy;

    public double getAccuracy() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6521);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6522);return accuracy;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setAccuracy(double accuracy) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6523);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6524);this.accuracy = accuracy;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    private Network network;

    public Network getNetwork() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6525);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6526);return network;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    public void setNetwork(Network network) {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6527);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6528);this.network = network;
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

    @Override
    @QueryIgnore
    public String getType() {try{__CLR4_5_24z24z2lwydwbdf.R.inc(6529);
        __CLR4_5_24z24z2lwydwbdf.R.inc(6530);return super.getType();
    }finally{__CLR4_5_24z24z2lwydwbdf.R.flushNeeded();}}

}
