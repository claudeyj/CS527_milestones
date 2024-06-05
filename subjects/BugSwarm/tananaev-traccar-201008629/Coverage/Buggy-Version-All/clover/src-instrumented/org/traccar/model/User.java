/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.traccar.helper.Hashing;

import java.util.Date;

public class User extends Extensible {public static class __CLR4_5_24mh4mhlx1dxmvw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,6100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String name;

    public String getName() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(5993);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(5994);return name;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(5995);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(5996);this.name = name;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String email;

    public String getEmail() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(5997);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(5998);return email;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setEmail(String email) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(5999);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6000);this.email = email;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private boolean readonly;

    public boolean getReadonly() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6001);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6002);return readonly;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setReadonly(boolean readonly) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6003);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6004);this.readonly = readonly;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private boolean admin;

    public boolean getAdmin() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6005);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6006);return admin;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setAdmin(boolean admin) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6007);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6008);this.admin = admin;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String map;

    public String getMap() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6009);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6010);return map;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setMap(String map) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6011);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6012);this.map = map;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String distanceUnit;

    public String getDistanceUnit() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6013);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6014);return distanceUnit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setDistanceUnit(String distanceUnit) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6015);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6016);this.distanceUnit = distanceUnit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String speedUnit;

    public String getSpeedUnit() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6017);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6018);return speedUnit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setSpeedUnit(String speedUnit) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6019);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6020);this.speedUnit = speedUnit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private double latitude;

    public double getLatitude() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6021);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6022);return latitude;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6023);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6024);this.latitude = latitude;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private double longitude;

    public double getLongitude() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6025);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6026);return longitude;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6027);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6028);this.longitude = longitude;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private int zoom;

    public int getZoom() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6029);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6030);return zoom;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setZoom(int zoom) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6031);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6032);this.zoom = zoom;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private boolean twelveHourFormat;

    public boolean getTwelveHourFormat() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6033);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6034);return twelveHourFormat;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setTwelveHourFormat(boolean twelveHourFormat) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6035);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6036);this.twelveHourFormat = twelveHourFormat;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String coordinateFormat;

    public String getCoordinateFormat() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6037);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6038);return coordinateFormat;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setCoordinateFormat(String coordinateFormat) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6039);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6040);this.coordinateFormat = coordinateFormat;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private boolean disabled;

    public boolean getDisabled() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6041);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6042);return disabled;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setDisabled(boolean disabled) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6043);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6044);this.disabled = disabled;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private Date expirationTime;

    public Date getExpirationTime() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6045);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6046);if ((((expirationTime != null)&&(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6047)!=0|true))||(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6048)==0&false))) {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6049);return new Date(expirationTime.getTime());
        } }else {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6050);return null;
        }
    }}finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setExpirationTime(Date expirationTime) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6051);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6052);if ((((expirationTime != null)&&(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6053)!=0|true))||(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6054)==0&false))) {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6055);this.expirationTime = new Date(expirationTime.getTime());
        } }else {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6056);this.expirationTime = null;
        }
    }}finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private int deviceLimit;

    public int getDeviceLimit() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6057);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6058);return deviceLimit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setDeviceLimit(int deviceLimit) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6059);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6060);this.deviceLimit = deviceLimit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private int userLimit;

    public int getUserLimit() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6061);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6062);return userLimit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setUserLimit(int userLimit) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6063);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6064);this.userLimit = userLimit;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private boolean deviceReadonly;

    public boolean getDeviceReadonly() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6065);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6066);return deviceReadonly;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setDeviceReadonly(boolean deviceReadonly) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6067);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6068);this.deviceReadonly = deviceReadonly;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String token;

    public String getToken() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6069);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6070);return token;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setToken(String token) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6071);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6072);if ((((token != null && !token.isEmpty())&&(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6073)!=0|true))||(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6074)==0&false))) {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6075);if ((((!token.matches("^[a-zA-Z0-9]{16,}$"))&&(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6076)!=0|true))||(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6077)==0&false))) {{
                __CLR4_5_24mh4mhlx1dxmvw.R.inc(6078);throw new IllegalArgumentException("Illegal token");
            }
            }__CLR4_5_24mh4mhlx1dxmvw.R.inc(6079);this.token = token;
        } }else {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6080);this.token = null;
        }
    }}finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public String getPassword() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6081);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6082);return null;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setPassword(String password) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6083);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6084);if ((((password != null && !password.isEmpty())&&(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6085)!=0|true))||(__CLR4_5_24mh4mhlx1dxmvw.R.iget(6086)==0&false))) {{
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6087);Hashing.HashingResult hashingResult = Hashing.createHash(password);
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6088);hashedPassword = hashingResult.getHash();
            __CLR4_5_24mh4mhlx1dxmvw.R.inc(6089);salt = hashingResult.getSalt();
        }
    }}finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String hashedPassword;

    @JsonIgnore
    public String getHashedPassword() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6090);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6091);return hashedPassword;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setHashedPassword(String hashedPassword) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6092);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6093);this.hashedPassword = hashedPassword;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    private String salt;

    @JsonIgnore
    public String getSalt() {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6094);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6095);return salt;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public void setSalt(String salt) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6096);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6097);this.salt = salt;
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

    public boolean isPasswordValid(String password) {try{__CLR4_5_24mh4mhlx1dxmvw.R.inc(6098);
        __CLR4_5_24mh4mhlx1dxmvw.R.inc(6099);return Hashing.validatePassword(password, hashedPassword, salt);
    }finally{__CLR4_5_24mh4mhlx1dxmvw.R.flushNeeded();}}

}
