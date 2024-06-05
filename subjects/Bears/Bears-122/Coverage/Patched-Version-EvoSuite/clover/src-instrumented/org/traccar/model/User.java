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

import org.traccar.database.QueryExtended;
import org.traccar.database.QueryIgnore;
import org.traccar.helper.Hashing;

import java.util.Date;
import java.util.TimeZone;

public class User extends ExtendedModel {public static class __CLR4_5_254k54klwye3y2k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,6761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String name;

    public String getName() {try{__CLR4_5_254k54klwye3y2k.R.inc(6644);
        __CLR4_5_254k54klwye3y2k.R.inc(6645);return name;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_254k54klwye3y2k.R.inc(6646);
        __CLR4_5_254k54klwye3y2k.R.inc(6647);this.name = name;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String email;

    public String getEmail() {try{__CLR4_5_254k54klwye3y2k.R.inc(6648);
        __CLR4_5_254k54klwye3y2k.R.inc(6649);return email;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setEmail(String email) {try{__CLR4_5_254k54klwye3y2k.R.inc(6650);
        __CLR4_5_254k54klwye3y2k.R.inc(6651);this.email = email;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String phone;

    public String getPhone() {try{__CLR4_5_254k54klwye3y2k.R.inc(6652);
        __CLR4_5_254k54klwye3y2k.R.inc(6653);return phone;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setPhone(String phone) {try{__CLR4_5_254k54klwye3y2k.R.inc(6654);
        __CLR4_5_254k54klwye3y2k.R.inc(6655);this.phone = phone;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private boolean readonly;

    public boolean getReadonly() {try{__CLR4_5_254k54klwye3y2k.R.inc(6656);
        __CLR4_5_254k54klwye3y2k.R.inc(6657);return readonly;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setReadonly(boolean readonly) {try{__CLR4_5_254k54klwye3y2k.R.inc(6658);
        __CLR4_5_254k54klwye3y2k.R.inc(6659);this.readonly = readonly;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private boolean admin;

    public boolean getAdmin() {try{__CLR4_5_254k54klwye3y2k.R.inc(6660);
        __CLR4_5_254k54klwye3y2k.R.inc(6661);return admin;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setAdmin(boolean admin) {try{__CLR4_5_254k54klwye3y2k.R.inc(6662);
        __CLR4_5_254k54klwye3y2k.R.inc(6663);this.admin = admin;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String map;

    public String getMap() {try{__CLR4_5_254k54klwye3y2k.R.inc(6664);
        __CLR4_5_254k54klwye3y2k.R.inc(6665);return map;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setMap(String map) {try{__CLR4_5_254k54klwye3y2k.R.inc(6666);
        __CLR4_5_254k54klwye3y2k.R.inc(6667);this.map = map;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String distanceUnit;

    public String getDistanceUnit() {try{__CLR4_5_254k54klwye3y2k.R.inc(6668);
        __CLR4_5_254k54klwye3y2k.R.inc(6669);return distanceUnit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setDistanceUnit(String distanceUnit) {try{__CLR4_5_254k54klwye3y2k.R.inc(6670);
        __CLR4_5_254k54klwye3y2k.R.inc(6671);this.distanceUnit = distanceUnit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String speedUnit;

    public String getSpeedUnit() {try{__CLR4_5_254k54klwye3y2k.R.inc(6672);
        __CLR4_5_254k54klwye3y2k.R.inc(6673);return speedUnit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setSpeedUnit(String speedUnit) {try{__CLR4_5_254k54klwye3y2k.R.inc(6674);
        __CLR4_5_254k54klwye3y2k.R.inc(6675);this.speedUnit = speedUnit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private double latitude;

    public double getLatitude() {try{__CLR4_5_254k54klwye3y2k.R.inc(6676);
        __CLR4_5_254k54klwye3y2k.R.inc(6677);return latitude;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_254k54klwye3y2k.R.inc(6678);
        __CLR4_5_254k54klwye3y2k.R.inc(6679);this.latitude = latitude;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private double longitude;

    public double getLongitude() {try{__CLR4_5_254k54klwye3y2k.R.inc(6680);
        __CLR4_5_254k54klwye3y2k.R.inc(6681);return longitude;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_254k54klwye3y2k.R.inc(6682);
        __CLR4_5_254k54klwye3y2k.R.inc(6683);this.longitude = longitude;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private int zoom;

    public int getZoom() {try{__CLR4_5_254k54klwye3y2k.R.inc(6684);
        __CLR4_5_254k54klwye3y2k.R.inc(6685);return zoom;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setZoom(int zoom) {try{__CLR4_5_254k54klwye3y2k.R.inc(6686);
        __CLR4_5_254k54klwye3y2k.R.inc(6687);this.zoom = zoom;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private boolean twelveHourFormat;

    public boolean getTwelveHourFormat() {try{__CLR4_5_254k54klwye3y2k.R.inc(6688);
        __CLR4_5_254k54klwye3y2k.R.inc(6689);return twelveHourFormat;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setTwelveHourFormat(boolean twelveHourFormat) {try{__CLR4_5_254k54klwye3y2k.R.inc(6690);
        __CLR4_5_254k54klwye3y2k.R.inc(6691);this.twelveHourFormat = twelveHourFormat;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String coordinateFormat;

    public String getCoordinateFormat() {try{__CLR4_5_254k54klwye3y2k.R.inc(6692);
        __CLR4_5_254k54klwye3y2k.R.inc(6693);return coordinateFormat;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setCoordinateFormat(String coordinateFormat) {try{__CLR4_5_254k54klwye3y2k.R.inc(6694);
        __CLR4_5_254k54klwye3y2k.R.inc(6695);this.coordinateFormat = coordinateFormat;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private boolean disabled;

    public boolean getDisabled() {try{__CLR4_5_254k54klwye3y2k.R.inc(6696);
        __CLR4_5_254k54klwye3y2k.R.inc(6697);return disabled;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setDisabled(boolean disabled) {try{__CLR4_5_254k54klwye3y2k.R.inc(6698);
        __CLR4_5_254k54klwye3y2k.R.inc(6699);this.disabled = disabled;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private Date expirationTime;

    public Date getExpirationTime() {try{__CLR4_5_254k54klwye3y2k.R.inc(6700);
        __CLR4_5_254k54klwye3y2k.R.inc(6701);if ((((expirationTime != null)&&(__CLR4_5_254k54klwye3y2k.R.iget(6702)!=0|true))||(__CLR4_5_254k54klwye3y2k.R.iget(6703)==0&false))) {{
            __CLR4_5_254k54klwye3y2k.R.inc(6704);return new Date(expirationTime.getTime());
        } }else {{
            __CLR4_5_254k54klwye3y2k.R.inc(6705);return null;
        }
    }}finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setExpirationTime(Date expirationTime) {try{__CLR4_5_254k54klwye3y2k.R.inc(6706);
        __CLR4_5_254k54klwye3y2k.R.inc(6707);if ((((expirationTime != null)&&(__CLR4_5_254k54klwye3y2k.R.iget(6708)!=0|true))||(__CLR4_5_254k54klwye3y2k.R.iget(6709)==0&false))) {{
            __CLR4_5_254k54klwye3y2k.R.inc(6710);this.expirationTime = new Date(expirationTime.getTime());
        } }else {{
            __CLR4_5_254k54klwye3y2k.R.inc(6711);this.expirationTime = null;
        }
    }}finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private int deviceLimit;

    public int getDeviceLimit() {try{__CLR4_5_254k54klwye3y2k.R.inc(6712);
        __CLR4_5_254k54klwye3y2k.R.inc(6713);return deviceLimit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setDeviceLimit(int deviceLimit) {try{__CLR4_5_254k54klwye3y2k.R.inc(6714);
        __CLR4_5_254k54klwye3y2k.R.inc(6715);this.deviceLimit = deviceLimit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private int userLimit;

    public int getUserLimit() {try{__CLR4_5_254k54klwye3y2k.R.inc(6716);
        __CLR4_5_254k54klwye3y2k.R.inc(6717);return userLimit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setUserLimit(int userLimit) {try{__CLR4_5_254k54klwye3y2k.R.inc(6718);
        __CLR4_5_254k54klwye3y2k.R.inc(6719);this.userLimit = userLimit;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private boolean deviceReadonly;

    public boolean getDeviceReadonly() {try{__CLR4_5_254k54klwye3y2k.R.inc(6720);
        __CLR4_5_254k54klwye3y2k.R.inc(6721);return deviceReadonly;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setDeviceReadonly(boolean deviceReadonly) {try{__CLR4_5_254k54klwye3y2k.R.inc(6722);
        __CLR4_5_254k54klwye3y2k.R.inc(6723);this.deviceReadonly = deviceReadonly;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String token;

    public String getToken() {try{__CLR4_5_254k54klwye3y2k.R.inc(6724);
        __CLR4_5_254k54klwye3y2k.R.inc(6725);return token;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setToken(String token) {try{__CLR4_5_254k54klwye3y2k.R.inc(6726);
        __CLR4_5_254k54klwye3y2k.R.inc(6727);if ((((token != null && !token.isEmpty())&&(__CLR4_5_254k54klwye3y2k.R.iget(6728)!=0|true))||(__CLR4_5_254k54klwye3y2k.R.iget(6729)==0&false))) {{
            __CLR4_5_254k54klwye3y2k.R.inc(6730);if ((((!token.matches("^[a-zA-Z0-9]{16,}$"))&&(__CLR4_5_254k54klwye3y2k.R.iget(6731)!=0|true))||(__CLR4_5_254k54klwye3y2k.R.iget(6732)==0&false))) {{
                __CLR4_5_254k54klwye3y2k.R.inc(6733);throw new IllegalArgumentException("Illegal token");
            }
            }__CLR4_5_254k54klwye3y2k.R.inc(6734);this.token = token;
        } }else {{
            __CLR4_5_254k54klwye3y2k.R.inc(6735);this.token = null;
        }
    }}finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    @QueryIgnore
    public String getPassword() {try{__CLR4_5_254k54klwye3y2k.R.inc(6736);
        __CLR4_5_254k54klwye3y2k.R.inc(6737);return null;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setPassword(String password) {try{__CLR4_5_254k54klwye3y2k.R.inc(6738);
        __CLR4_5_254k54klwye3y2k.R.inc(6739);if ((((password != null && !password.isEmpty())&&(__CLR4_5_254k54klwye3y2k.R.iget(6740)!=0|true))||(__CLR4_5_254k54klwye3y2k.R.iget(6741)==0&false))) {{
            __CLR4_5_254k54klwye3y2k.R.inc(6742);Hashing.HashingResult hashingResult = Hashing.createHash(password);
            __CLR4_5_254k54klwye3y2k.R.inc(6743);hashedPassword = hashingResult.getHash();
            __CLR4_5_254k54klwye3y2k.R.inc(6744);salt = hashingResult.getSalt();
        }
    }}finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String hashedPassword;

    @JsonIgnore
    @QueryExtended
    public String getHashedPassword() {try{__CLR4_5_254k54klwye3y2k.R.inc(6745);
        __CLR4_5_254k54klwye3y2k.R.inc(6746);return hashedPassword;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setHashedPassword(String hashedPassword) {try{__CLR4_5_254k54klwye3y2k.R.inc(6747);
        __CLR4_5_254k54klwye3y2k.R.inc(6748);this.hashedPassword = hashedPassword;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String salt;

    @JsonIgnore
    @QueryExtended
    public String getSalt() {try{__CLR4_5_254k54klwye3y2k.R.inc(6749);
        __CLR4_5_254k54klwye3y2k.R.inc(6750);return salt;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public void setSalt(String salt) {try{__CLR4_5_254k54klwye3y2k.R.inc(6751);
        __CLR4_5_254k54klwye3y2k.R.inc(6752);this.salt = salt;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public boolean isPasswordValid(String password) {try{__CLR4_5_254k54klwye3y2k.R.inc(6753);
        __CLR4_5_254k54klwye3y2k.R.inc(6754);return Hashing.validatePassword(password, hashedPassword, salt);
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    private String timezone;

    public void setTimezone(String timezone) {try{__CLR4_5_254k54klwye3y2k.R.inc(6755);
        __CLR4_5_254k54klwye3y2k.R.inc(6756);this.timezone = (((timezone != null )&&(__CLR4_5_254k54klwye3y2k.R.iget(6757)!=0|true))||(__CLR4_5_254k54klwye3y2k.R.iget(6758)==0&false))? TimeZone.getTimeZone(timezone).getID() : null;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}

    public String getTimezone() {try{__CLR4_5_254k54klwye3y2k.R.inc(6759);
        __CLR4_5_254k54klwye3y2k.R.inc(6760);return timezone;
    }finally{__CLR4_5_254k54klwye3y2k.R.flushNeeded();}}
}
