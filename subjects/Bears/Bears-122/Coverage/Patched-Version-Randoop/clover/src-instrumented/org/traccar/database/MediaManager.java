/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.database;

import org.jboss.netty.buffer.ChannelBuffer;
import org.traccar.Config;
import org.traccar.helper.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MediaManager {public static class __CLR4_5_22da2dalwye60g1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,3096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String path;

    public MediaManager(Config config) {try{__CLR4_5_22da2dalwye60g1.R.inc(3070);
        __CLR4_5_22da2dalwye60g1.R.inc(3071);path = config.getString("media.path");
    }finally{__CLR4_5_22da2dalwye60g1.R.flushNeeded();}}

    private File createFile(String uniqueId, String name) throws IOException {try{__CLR4_5_22da2dalwye60g1.R.inc(3072);
        __CLR4_5_22da2dalwye60g1.R.inc(3073);Path filePath = Paths.get(path, uniqueId, name);
        __CLR4_5_22da2dalwye60g1.R.inc(3074);Path directoryPath = filePath.getParent();
        __CLR4_5_22da2dalwye60g1.R.inc(3075);if ((((directoryPath != null)&&(__CLR4_5_22da2dalwye60g1.R.iget(3076)!=0|true))||(__CLR4_5_22da2dalwye60g1.R.iget(3077)==0&false))) {{
            __CLR4_5_22da2dalwye60g1.R.inc(3078);Files.createDirectories(directoryPath);
        }
        }__CLR4_5_22da2dalwye60g1.R.inc(3079);return filePath.toFile();
    }finally{__CLR4_5_22da2dalwye60g1.R.flushNeeded();}}

    public String writeFile(String uniqueId, ChannelBuffer buf, String extension) {try{__CLR4_5_22da2dalwye60g1.R.inc(3080);
        __CLR4_5_22da2dalwye60g1.R.inc(3081);int size = buf.readableBytes();
        __CLR4_5_22da2dalwye60g1.R.inc(3082);String name = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + "." + extension;
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_22da2dalwye60g1.R.inc(3083);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_22da2dalwye60g1.R.inc(3084);}};FileOutputStream output = new FileOutputStream(createFile(uniqueId, name));
                __CLR4_5_2$AC0 __CLR$ACI1=new __CLR4_5_2$AC0(){{__CLR4_5_22da2dalwye60g1.R.inc(3085);}};FileChannel fileChannel = output.getChannel()) {
            __CLR4_5_22da2dalwye60g1.R.inc(3086);ByteBuffer byteBuffer = buf.toByteBuffer();
            __CLR4_5_22da2dalwye60g1.R.inc(3087);int written = 0;
            __CLR4_5_22da2dalwye60g1.R.inc(3088);while ((((written < size)&&(__CLR4_5_22da2dalwye60g1.R.iget(3089)!=0|true))||(__CLR4_5_22da2dalwye60g1.R.iget(3090)==0&false))) {{
                __CLR4_5_22da2dalwye60g1.R.inc(3091);written += fileChannel.write(byteBuffer);
            }
            }__CLR4_5_22da2dalwye60g1.R.inc(3092);fileChannel.force(false);
            __CLR4_5_22da2dalwye60g1.R.inc(3093);return name;
        } catch (IOException e) {
            __CLR4_5_22da2dalwye60g1.R.inc(3094);Log.warning(e);
        }
        __CLR4_5_22da2dalwye60g1.R.inc(3095);return null;
    }finally{__CLR4_5_22da2dalwye60g1.R.flushNeeded();}}

}
