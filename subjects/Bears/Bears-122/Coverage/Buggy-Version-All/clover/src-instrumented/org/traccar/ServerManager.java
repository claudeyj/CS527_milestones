/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
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

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ServerManager {public static class __CLR4_5_2xkxklwydzhvz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,1259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final List<TrackerServer> serverList = new LinkedList<>();
    private final Map<String, BaseProtocol> protocolList = new ConcurrentHashMap<>();

    public ServerManager() throws Exception {try{__CLR4_5_2xkxklwydzhvz.R.inc(1208);

        __CLR4_5_2xkxklwydzhvz.R.inc(1209);List<String> names = new LinkedList<>();
        __CLR4_5_2xkxklwydzhvz.R.inc(1210);String packageName = "org.traccar.protocol";
        __CLR4_5_2xkxklwydzhvz.R.inc(1211);String packagePath = packageName.replace('.', '/');
        __CLR4_5_2xkxklwydzhvz.R.inc(1212);URL packageUrl = Thread.currentThread().getContextClassLoader().getResource(packagePath);

        __CLR4_5_2xkxklwydzhvz.R.inc(1213);if ((((packageUrl.getProtocol().equals("jar"))&&(__CLR4_5_2xkxklwydzhvz.R.iget(1214)!=0|true))||(__CLR4_5_2xkxklwydzhvz.R.iget(1215)==0&false))) {{
            __CLR4_5_2xkxklwydzhvz.R.inc(1216);String jarFileName = URLDecoder.decode(packageUrl.getFile(), StandardCharsets.UTF_8.name());
            class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2xkxklwydzhvz.R.inc(1217);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2xkxklwydzhvz.R.inc(1218);}};JarFile jf = new JarFile(jarFileName.substring(5, jarFileName.indexOf("!")))) {
                __CLR4_5_2xkxklwydzhvz.R.inc(1219);Enumeration<JarEntry> jarEntries = jf.entries();
                __CLR4_5_2xkxklwydzhvz.R.inc(1220);while ((((jarEntries.hasMoreElements())&&(__CLR4_5_2xkxklwydzhvz.R.iget(1221)!=0|true))||(__CLR4_5_2xkxklwydzhvz.R.iget(1222)==0&false))) {{
                    __CLR4_5_2xkxklwydzhvz.R.inc(1223);String entryName = jarEntries.nextElement().getName();
                    __CLR4_5_2xkxklwydzhvz.R.inc(1224);if ((((entryName.startsWith(packagePath) && entryName.length() > packagePath.length() + 5)&&(__CLR4_5_2xkxklwydzhvz.R.iget(1225)!=0|true))||(__CLR4_5_2xkxklwydzhvz.R.iget(1226)==0&false))) {{
                        __CLR4_5_2xkxklwydzhvz.R.inc(1227);names.add(entryName.substring(packagePath.length() + 1, entryName.lastIndexOf('.')));
                    }
                }}
            }}
        } }else {{
            __CLR4_5_2xkxklwydzhvz.R.inc(1228);File folder = new File(new URI(packageUrl.toString()));
            __CLR4_5_2xkxklwydzhvz.R.inc(1229);File[] files = folder.listFiles();
            __CLR4_5_2xkxklwydzhvz.R.inc(1230);if ((((files != null)&&(__CLR4_5_2xkxklwydzhvz.R.iget(1231)!=0|true))||(__CLR4_5_2xkxklwydzhvz.R.iget(1232)==0&false))) {{
                __CLR4_5_2xkxklwydzhvz.R.inc(1233);for (File actual: files) {{
                    __CLR4_5_2xkxklwydzhvz.R.inc(1234);String entryName = actual.getName();
                    __CLR4_5_2xkxklwydzhvz.R.inc(1235);names.add(entryName.substring(0, entryName.lastIndexOf('.')));
                }
            }}
        }}

        }__CLR4_5_2xkxklwydzhvz.R.inc(1236);for (String name : names) {{
            __CLR4_5_2xkxklwydzhvz.R.inc(1237);Class protocolClass = Class.forName(packageName + '.' + name);
            __CLR4_5_2xkxklwydzhvz.R.inc(1238);if ((((BaseProtocol.class.isAssignableFrom(protocolClass))&&(__CLR4_5_2xkxklwydzhvz.R.iget(1239)!=0|true))||(__CLR4_5_2xkxklwydzhvz.R.iget(1240)==0&false))) {{
                __CLR4_5_2xkxklwydzhvz.R.inc(1241);BaseProtocol baseProtocol = (BaseProtocol) protocolClass.newInstance();
                __CLR4_5_2xkxklwydzhvz.R.inc(1242);initProtocolServer(baseProtocol);
                __CLR4_5_2xkxklwydzhvz.R.inc(1243);protocolList.put(baseProtocol.getName(), baseProtocol);
            }
        }}
    }}finally{__CLR4_5_2xkxklwydzhvz.R.flushNeeded();}}

    public BaseProtocol getProtocol(String name) {try{__CLR4_5_2xkxklwydzhvz.R.inc(1244);
        __CLR4_5_2xkxklwydzhvz.R.inc(1245);return protocolList.get(name);
    }finally{__CLR4_5_2xkxklwydzhvz.R.flushNeeded();}}

    public void start() {try{__CLR4_5_2xkxklwydzhvz.R.inc(1246);
        __CLR4_5_2xkxklwydzhvz.R.inc(1247);for (TrackerServer server: serverList) {{
            __CLR4_5_2xkxklwydzhvz.R.inc(1248);server.start();
        }
    }}finally{__CLR4_5_2xkxklwydzhvz.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_2xkxklwydzhvz.R.inc(1249);
        __CLR4_5_2xkxklwydzhvz.R.inc(1250);for (TrackerServer server: serverList) {{
            __CLR4_5_2xkxklwydzhvz.R.inc(1251);server.stop();
        }

        // Release resources
        }__CLR4_5_2xkxklwydzhvz.R.inc(1252);GlobalChannelFactory.release();
        __CLR4_5_2xkxklwydzhvz.R.inc(1253);GlobalTimer.release();
    }finally{__CLR4_5_2xkxklwydzhvz.R.flushNeeded();}}

    private void initProtocolServer(final Protocol protocol) {try{__CLR4_5_2xkxklwydzhvz.R.inc(1254);
        __CLR4_5_2xkxklwydzhvz.R.inc(1255);if ((((Context.getConfig().hasKey(protocol.getName() + ".port"))&&(__CLR4_5_2xkxklwydzhvz.R.iget(1256)!=0|true))||(__CLR4_5_2xkxklwydzhvz.R.iget(1257)==0&false))) {{
            __CLR4_5_2xkxklwydzhvz.R.inc(1258);protocol.initTrackerServers(serverList);
        }
    }}finally{__CLR4_5_2xkxklwydzhvz.R.flushNeeded();}}

}
