/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton@traccar.org)
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
package org.traccar;

import org.traccar.helper.Log;

import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Locale;

public final class Main {public static class __CLR4_5_2v0v0lwydzhsu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,1139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long CLEAN_PERIOD = 24 * 60 * 60 * 1000;

    private Main() {try{__CLR4_5_2v0v0lwydzhsu.R.inc(1116);
    }finally{__CLR4_5_2v0v0lwydzhsu.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_5_2v0v0lwydzhsu.R.inc(1117);
        __CLR4_5_2v0v0lwydzhsu.R.inc(1118);Locale.setDefault(Locale.ENGLISH);

        __CLR4_5_2v0v0lwydzhsu.R.inc(1119);Context.init(args);
        __CLR4_5_2v0v0lwydzhsu.R.inc(1120);Log.info("Starting server...");

        __CLR4_5_2v0v0lwydzhsu.R.inc(1121);Context.getServerManager().start();
        __CLR4_5_2v0v0lwydzhsu.R.inc(1122);if ((((Context.getWebServer() != null)&&(__CLR4_5_2v0v0lwydzhsu.R.iget(1123)!=0|true))||(__CLR4_5_2v0v0lwydzhsu.R.iget(1124)==0&false))) {{
            __CLR4_5_2v0v0lwydzhsu.R.inc(1125);Context.getWebServer().start();
        }

        }__CLR4_5_2v0v0lwydzhsu.R.inc(1126);new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {try{__CLR4_5_2v0v0lwydzhsu.R.inc(1127);
                __CLR4_5_2v0v0lwydzhsu.R.inc(1128);try {
                    __CLR4_5_2v0v0lwydzhsu.R.inc(1129);Context.getDataManager().clearHistory();
                } catch (SQLException error) {
                    __CLR4_5_2v0v0lwydzhsu.R.inc(1130);Log.warning(error);
                }
            }finally{__CLR4_5_2v0v0lwydzhsu.R.flushNeeded();}}
        }, 0, CLEAN_PERIOD);

        __CLR4_5_2v0v0lwydzhsu.R.inc(1131);Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {try{__CLR4_5_2v0v0lwydzhsu.R.inc(1132);
                __CLR4_5_2v0v0lwydzhsu.R.inc(1133);Log.info("Shutting down server...");

                __CLR4_5_2v0v0lwydzhsu.R.inc(1134);if ((((Context.getWebServer() != null)&&(__CLR4_5_2v0v0lwydzhsu.R.iget(1135)!=0|true))||(__CLR4_5_2v0v0lwydzhsu.R.iget(1136)==0&false))) {{
                    __CLR4_5_2v0v0lwydzhsu.R.inc(1137);Context.getWebServer().stop();
                }
                }__CLR4_5_2v0v0lwydzhsu.R.inc(1138);Context.getServerManager().stop();
            }finally{__CLR4_5_2v0v0lwydzhsu.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2v0v0lwydzhsu.R.flushNeeded();}}

}
