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

import com.fasterxml.jackson.annotation.JsonInclude;
import org.traccar.Context;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellTower {public static class __CLR4_5_24ok4oklwydwb5v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,6107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static CellTower from(int mcc, int mnc, int lac, long cid) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6068);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6069);CellTower cellTower = new CellTower();
        __CLR4_5_24ok4oklwydwb5v.R.inc(6070);cellTower.setMobileCountryCode(mcc);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6071);cellTower.setMobileNetworkCode(mnc);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6072);cellTower.setLocationAreaCode(lac);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6073);cellTower.setCellId(cid);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6074);return cellTower;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public static CellTower from(int mcc, int mnc, int lac, long cid, int rssi) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6075);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6076);CellTower cellTower = CellTower.from(mcc, mnc, lac, cid);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6077);cellTower.setSignalStrength(rssi);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6078);return cellTower;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public static CellTower fromLacCid(int lac, long cid) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6079);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6080);return from(
                Context.getConfig().getInteger("geolocation.mcc"),
                Context.getConfig().getInteger("geolocation.mnc"), lac, cid);
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public static CellTower fromCidLac(long cid, int lac) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6081);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6082);return fromLacCid(lac, cid);
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    private String radioType;

    public String getRadioType() {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6083);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6084);return radioType;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public void setRadioType(String radioType) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6085);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6086);this.radioType = radioType;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    private Long cellId;

    public Long getCellId() {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6087);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6088);return cellId;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public void setCellId(Long cellId) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6089);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6090);this.cellId = cellId;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    private Integer locationAreaCode;

    public Integer getLocationAreaCode() {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6091);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6092);return locationAreaCode;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public void setLocationAreaCode(Integer locationAreaCode) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6093);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6094);this.locationAreaCode = locationAreaCode;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    private Integer mobileCountryCode;

    public Integer getMobileCountryCode() {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6095);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6096);return mobileCountryCode;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public void setMobileCountryCode(Integer mobileCountryCode) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6097);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6098);this.mobileCountryCode = mobileCountryCode;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    private Integer mobileNetworkCode;

    public Integer getMobileNetworkCode() {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6099);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6100);return mobileNetworkCode;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public void setMobileNetworkCode(Integer mobileNetworkCode) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6101);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6102);this.mobileNetworkCode = mobileNetworkCode;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    private Integer signalStrength;

    public Integer getSignalStrength() {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6103);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6104);return signalStrength;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

    public void setSignalStrength(Integer signalStrength) {try{__CLR4_5_24ok4oklwydwb5v.R.inc(6105);
        __CLR4_5_24ok4oklwydwb5v.R.inc(6106);this.signalStrength = signalStrength;
    }finally{__CLR4_5_24ok4oklwydwb5v.R.flushNeeded();}}

}
