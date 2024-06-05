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
import java.util.List;

import org.traccar.database.QueryExtended;
import org.traccar.database.QueryIgnore;

public class Device extends ExtendedModel {public static class __CLR4_5_24px4pxlwye3xz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,6171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String name;

    public String getName() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6117);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6118);return name;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6119);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6120);this.name = name;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private String uniqueId;

    public String getUniqueId() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6121);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6122);return uniqueId;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setUniqueId(String uniqueId) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6123);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6124);this.uniqueId = uniqueId;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public static final String STATUS_UNKNOWN = "unknown";
    public static final String STATUS_ONLINE = "online";
    public static final String STATUS_OFFLINE = "offline";

    private String status;

    @QueryIgnore
    public String getStatus() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6125);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6126);return (((status != null )&&(__CLR4_5_24px4pxlwye3xz4.R.iget(6127)!=0|true))||(__CLR4_5_24px4pxlwye3xz4.R.iget(6128)==0&false))? status : STATUS_OFFLINE;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setStatus(String status) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6129);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6130);this.status = status;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private Date lastUpdate;

    @QueryExtended
    public Date getLastUpdate() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6131);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6132);if ((((lastUpdate != null)&&(__CLR4_5_24px4pxlwye3xz4.R.iget(6133)!=0|true))||(__CLR4_5_24px4pxlwye3xz4.R.iget(6134)==0&false))) {{
            __CLR4_5_24px4pxlwye3xz4.R.inc(6135);return new Date(lastUpdate.getTime());
        } }else {{
            __CLR4_5_24px4pxlwye3xz4.R.inc(6136);return null;
        }
    }}finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setLastUpdate(Date lastUpdate) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6137);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6138);if ((((lastUpdate != null)&&(__CLR4_5_24px4pxlwye3xz4.R.iget(6139)!=0|true))||(__CLR4_5_24px4pxlwye3xz4.R.iget(6140)==0&false))) {{
            __CLR4_5_24px4pxlwye3xz4.R.inc(6141);this.lastUpdate = new Date(lastUpdate.getTime());
        } }else {{
            __CLR4_5_24px4pxlwye3xz4.R.inc(6142);this.lastUpdate = null;
        }
    }}finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private long positionId;

    @QueryIgnore
    public long getPositionId() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6143);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6144);return positionId;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setPositionId(long positionId) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6145);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6146);this.positionId = positionId;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private long groupId;

    public long getGroupId() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6147);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6148);return groupId;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setGroupId(long groupId) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6149);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6150);this.groupId = groupId;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private List<Long> geofenceIds;

    @QueryIgnore
    public List<Long> getGeofenceIds() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6151);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6152);return geofenceIds;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setGeofenceIds(List<Long> geofenceIds) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6153);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6154);this.geofenceIds = geofenceIds;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private String phone;

    public String getPhone() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6155);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6156);return phone;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setPhone(String phone) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6157);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6158);this.phone = phone;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private String model;

    public String getModel() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6159);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6160);return model;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setModel(String model) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6161);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6162);this.model = model;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private String contact;

    public String getContact() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6163);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6164);return contact;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setContact(String contact) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6165);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6166);this.contact = contact;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    private String category;

    public String getCategory() {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6167);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6168);return category;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

    public void setCategory(String category) {try{__CLR4_5_24px4pxlwye3xz4.R.inc(6169);
        __CLR4_5_24px4pxlwye3xz4.R.inc(6170);this.category = category;
    }finally{__CLR4_5_24px4pxlwye3xz4.R.flushNeeded();}}

}
