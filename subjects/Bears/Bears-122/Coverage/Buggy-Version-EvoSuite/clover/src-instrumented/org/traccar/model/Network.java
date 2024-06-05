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

import java.util.ArrayList;
import java.util.Collection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Network {public static class __CLR4_5_24wv4wvlwydwbcr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,6410,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Network() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6367);
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public Network(CellTower cellTower) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6368);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6369);addCellTower(cellTower);
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private Integer homeMobileCountryCode;

    public Integer getHomeMobileCountryCode() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6370);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6371);return homeMobileCountryCode;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setHomeMobileCountryCode(Integer homeMobileCountryCode) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6372);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6373);this.homeMobileCountryCode = homeMobileCountryCode;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private Integer homeMobileNetworkCode;

    public Integer getHomeMobileNetworkCode() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6374);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6375);return homeMobileNetworkCode;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setHomeMobileNetworkCode(Integer homeMobileNetworkCode) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6376);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6377);this.homeMobileNetworkCode = homeMobileNetworkCode;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private String radioType = "gsm";

    public String getRadioType() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6378);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6379);return radioType;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setRadioType(String radioType) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6380);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6381);this.radioType = radioType;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private String carrier;

    public String getCarrier() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6382);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6383);return carrier;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setCarrier(String carrier) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6384);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6385);this.carrier = carrier;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private Boolean considerIp = false;

    public Boolean getConsiderIp() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6386);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6387);return considerIp;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setConsiderIp(Boolean considerIp) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6388);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6389);this.considerIp = considerIp;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private Collection<CellTower> cellTowers;

    public Collection<CellTower> getCellTowers() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6390);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6391);return cellTowers;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setCellTowers(Collection<CellTower> cellTowers) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6392);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6393);this.cellTowers = cellTowers;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void addCellTower(CellTower cellTower) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6394);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6395);if ((((cellTowers == null)&&(__CLR4_5_24wv4wvlwydwbcr.R.iget(6396)!=0|true))||(__CLR4_5_24wv4wvlwydwbcr.R.iget(6397)==0&false))) {{
            __CLR4_5_24wv4wvlwydwbcr.R.inc(6398);cellTowers = new ArrayList<>();
        }
        }__CLR4_5_24wv4wvlwydwbcr.R.inc(6399);cellTowers.add(cellTower);
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    private Collection<WifiAccessPoint> wifiAccessPoints;

    public Collection<WifiAccessPoint> getWifiAccessPoints() {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6400);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6401);return wifiAccessPoints;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void setWifiAccessPoints(Collection<WifiAccessPoint> wifiAccessPoints) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6402);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6403);this.wifiAccessPoints = wifiAccessPoints;
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

    public void addWifiAccessPoint(WifiAccessPoint wifiAccessPoint) {try{__CLR4_5_24wv4wvlwydwbcr.R.inc(6404);
        __CLR4_5_24wv4wvlwydwbcr.R.inc(6405);if ((((wifiAccessPoints == null)&&(__CLR4_5_24wv4wvlwydwbcr.R.iget(6406)!=0|true))||(__CLR4_5_24wv4wvlwydwbcr.R.iget(6407)==0&false))) {{
            __CLR4_5_24wv4wvlwydwbcr.R.inc(6408);wifiAccessPoints = new ArrayList<>();
        }
        }__CLR4_5_24wv4wvlwydwbcr.R.inc(6409);wifiAccessPoints.add(wifiAccessPoint);
    }finally{__CLR4_5_24wv4wvlwydwbcr.R.flushNeeded();}}

}
