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
package org.traccar.model;

import java.util.Date;

public class Statistics extends ExtendedModel {public static class __CLR4_5_2538538lwye7czf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,6644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Date captureTime;

    public Date getCaptureTime() {try{__CLR4_5_2538538lwye7czf.R.inc(6596);
        __CLR4_5_2538538lwye7czf.R.inc(6597);if ((((captureTime != null)&&(__CLR4_5_2538538lwye7czf.R.iget(6598)!=0|true))||(__CLR4_5_2538538lwye7czf.R.iget(6599)==0&false))) {{
            __CLR4_5_2538538lwye7czf.R.inc(6600);return new Date(captureTime.getTime());
        } }else {{
            __CLR4_5_2538538lwye7czf.R.inc(6601);return null;
        }
    }}finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setCaptureTime(Date captureTime) {try{__CLR4_5_2538538lwye7czf.R.inc(6602);
        __CLR4_5_2538538lwye7czf.R.inc(6603);if ((((captureTime != null)&&(__CLR4_5_2538538lwye7czf.R.iget(6604)!=0|true))||(__CLR4_5_2538538lwye7czf.R.iget(6605)==0&false))) {{
            __CLR4_5_2538538lwye7czf.R.inc(6606);this.captureTime = new Date(captureTime.getTime());
        } }else {{
            __CLR4_5_2538538lwye7czf.R.inc(6607);this.captureTime = null;
        }
    }}finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int activeUsers;

    public int getActiveUsers() {try{__CLR4_5_2538538lwye7czf.R.inc(6608);
        __CLR4_5_2538538lwye7czf.R.inc(6609);return activeUsers;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setActiveUsers(int activeUsers) {try{__CLR4_5_2538538lwye7czf.R.inc(6610);
        __CLR4_5_2538538lwye7czf.R.inc(6611);this.activeUsers = activeUsers;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int activeDevices;

    public int getActiveDevices() {try{__CLR4_5_2538538lwye7czf.R.inc(6612);
        __CLR4_5_2538538lwye7czf.R.inc(6613);return activeDevices;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setActiveDevices(int activeDevices) {try{__CLR4_5_2538538lwye7czf.R.inc(6614);
        __CLR4_5_2538538lwye7czf.R.inc(6615);this.activeDevices = activeDevices;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int requests;

    public int getRequests() {try{__CLR4_5_2538538lwye7czf.R.inc(6616);
        __CLR4_5_2538538lwye7czf.R.inc(6617);return requests;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setRequests(int requests) {try{__CLR4_5_2538538lwye7czf.R.inc(6618);
        __CLR4_5_2538538lwye7czf.R.inc(6619);this.requests = requests;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int messagesReceived;

    public int getMessagesReceived() {try{__CLR4_5_2538538lwye7czf.R.inc(6620);
        __CLR4_5_2538538lwye7czf.R.inc(6621);return messagesReceived;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setMessagesReceived(int messagesReceived) {try{__CLR4_5_2538538lwye7czf.R.inc(6622);
        __CLR4_5_2538538lwye7czf.R.inc(6623);this.messagesReceived = messagesReceived;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int messagesStored;

    public int getMessagesStored() {try{__CLR4_5_2538538lwye7czf.R.inc(6624);
        __CLR4_5_2538538lwye7czf.R.inc(6625);return messagesStored;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setMessagesStored(int messagesStored) {try{__CLR4_5_2538538lwye7czf.R.inc(6626);
        __CLR4_5_2538538lwye7czf.R.inc(6627);this.messagesStored = messagesStored;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int mailSent;

    public int getMailSent() {try{__CLR4_5_2538538lwye7czf.R.inc(6628);
        __CLR4_5_2538538lwye7czf.R.inc(6629);return mailSent;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setMailSent(int mailSent) {try{__CLR4_5_2538538lwye7czf.R.inc(6630);
        __CLR4_5_2538538lwye7czf.R.inc(6631);this.mailSent = mailSent;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int smsSent;

    public int getSmsSent() {try{__CLR4_5_2538538lwye7czf.R.inc(6632);
        __CLR4_5_2538538lwye7czf.R.inc(6633);return smsSent;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setSmsSent(int smsSent) {try{__CLR4_5_2538538lwye7czf.R.inc(6634);
        __CLR4_5_2538538lwye7czf.R.inc(6635);this.smsSent = smsSent;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int geocoderRequests;

    public int getGeocoderRequests() {try{__CLR4_5_2538538lwye7czf.R.inc(6636);
        __CLR4_5_2538538lwye7czf.R.inc(6637);return geocoderRequests;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setGeocoderRequests(int geocoderRequests) {try{__CLR4_5_2538538lwye7czf.R.inc(6638);
        __CLR4_5_2538538lwye7czf.R.inc(6639);this.geocoderRequests = geocoderRequests;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    private int geolocationRequests;

    public int getGeolocationRequests() {try{__CLR4_5_2538538lwye7czf.R.inc(6640);
        __CLR4_5_2538538lwye7czf.R.inc(6641);return geolocationRequests;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

    public void setGeolocationRequests(int geolocationRequests) {try{__CLR4_5_2538538lwye7czf.R.inc(6642);
        __CLR4_5_2538538lwye7czf.R.inc(6643);this.geolocationRequests = geolocationRequests;
    }finally{__CLR4_5_2538538lwye7czf.R.flushNeeded();}}

}
