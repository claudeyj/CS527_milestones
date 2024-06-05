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

public class Notification extends ExtendedModel {public static class __CLR4_5_24y24y2lwye62pg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,6430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long userId;

    public long getUserId() {try{__CLR4_5_24y24y2lwye62pg.R.inc(6410);
        __CLR4_5_24y24y2lwye62pg.R.inc(6411);return userId;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    public void setUserId(long userId) {try{__CLR4_5_24y24y2lwye62pg.R.inc(6412);
        __CLR4_5_24y24y2lwye62pg.R.inc(6413);this.userId = userId;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    private String type;

    public String getType() {try{__CLR4_5_24y24y2lwye62pg.R.inc(6414);
        __CLR4_5_24y24y2lwye62pg.R.inc(6415);return type;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_24y24y2lwye62pg.R.inc(6416);
        __CLR4_5_24y24y2lwye62pg.R.inc(6417);this.type = type;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    private boolean web;

    public boolean getWeb() {try{__CLR4_5_24y24y2lwye62pg.R.inc(6418);
        __CLR4_5_24y24y2lwye62pg.R.inc(6419);return web;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    public void setWeb(boolean web) {try{__CLR4_5_24y24y2lwye62pg.R.inc(6420);
        __CLR4_5_24y24y2lwye62pg.R.inc(6421);this.web = web;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    private boolean mail;

    public boolean getMail() {try{__CLR4_5_24y24y2lwye62pg.R.inc(6422);
        __CLR4_5_24y24y2lwye62pg.R.inc(6423);return mail;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    public void setMail(boolean mail) {try{__CLR4_5_24y24y2lwye62pg.R.inc(6424);
        __CLR4_5_24y24y2lwye62pg.R.inc(6425);this.mail = mail;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    private boolean sms;

    public boolean getSms() {try{__CLR4_5_24y24y2lwye62pg.R.inc(6426);
        __CLR4_5_24y24y2lwye62pg.R.inc(6427);return sms;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}

    public void setSms(boolean sms) {try{__CLR4_5_24y24y2lwye62pg.R.inc(6428);
        __CLR4_5_24y24y2lwye62pg.R.inc(6429);this.sms = sms;
    }finally{__CLR4_5_24y24y2lwye62pg.R.flushNeeded();}}
}
