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
package org.traccar.helper;

import org.apache.log4j.Appender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.varia.NullAppender;
import org.jboss.netty.logging.AbstractInternalLogger;
import org.jboss.netty.logging.InternalLogger;
import org.jboss.netty.logging.InternalLoggerFactory;
import org.traccar.Config;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.nio.charset.Charset;

public final class Log {public static class __CLR4_5_23vl3vllx1e0fa5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,5156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Log() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5025);
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private static final String LOGGER_NAME = "traccar";

    private static final String STACK_PACKAGE = "org.traccar";
    private static final int STACK_LIMIT = 3;

    private static Logger logger = null;

    public static String getAppVersion() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5026);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5027);return Log.class.getPackage().getImplementationVersion();
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void setupLogger(Config config) throws IOException {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5028);

        __CLR4_5_23vl3vllx1e0fa5.R.inc(5029);Layout layout = new PatternLayout("%d{" + DATE_FORMAT + "} %5p: %m%n");

        __CLR4_5_23vl3vllx1e0fa5.R.inc(5030);Appender appender = new DailyRollingFileAppender(
                layout, config.getString("logger.file"), "'.'yyyyMMdd");

        __CLR4_5_23vl3vllx1e0fa5.R.inc(5031);LogManager.resetConfiguration();
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5032);LogManager.getRootLogger().addAppender(new NullAppender());

        __CLR4_5_23vl3vllx1e0fa5.R.inc(5033);logger = Logger.getLogger(LOGGER_NAME);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5034);logger.addAppender(appender);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5035);logger.setLevel(Level.toLevel(config.getString("logger.level"), Level.ALL));

        // Workaround for "Bug 745866 - (EDG-45) Possible netty logging config problem"
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5036);InternalLoggerFactory.setDefaultFactory(new InternalLoggerFactory() {
            @Override
            public InternalLogger newInstance(String string) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5037);
                __CLR4_5_23vl3vllx1e0fa5.R.inc(5038);return new NettyInternalLogger();
            }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}
        });

        __CLR4_5_23vl3vllx1e0fa5.R.inc(5039);Log.logSystemInfo();
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5040);Log.info("Version: " + getAppVersion());
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static Logger getLogger() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5041);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5042);if ((((logger == null)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5043)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5044)==0&false))) {{
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5045);logger = Logger.getLogger(LOGGER_NAME);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5046);logger.setLevel(Level.OFF);
        }
        }__CLR4_5_23vl3vllx1e0fa5.R.inc(5047);return logger;
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void logSystemInfo() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5048);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5049);try {
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5050);OperatingSystemMXBean operatingSystemBean = ManagementFactory.getOperatingSystemMXBean();
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5051);Log.info("Operating system"
                    + " name: " + operatingSystemBean.getName()
                    + " version: " + operatingSystemBean.getVersion()
                    + " architecture: " + operatingSystemBean.getArch());

            __CLR4_5_23vl3vllx1e0fa5.R.inc(5052);RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5053);Log.info("Java runtime"
                    + " name: " + runtimeBean.getVmName()
                    + " vendor: " + runtimeBean.getVmVendor()
                    + " version: " + runtimeBean.getVmVersion());

            __CLR4_5_23vl3vllx1e0fa5.R.inc(5054);MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5055);Log.info("Memory limit"
                    + " heap: " + memoryBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + "mb"
                    + " non-heap: " + memoryBean.getNonHeapMemoryUsage().getMax() / (1024 * 1024) + "mb");

            __CLR4_5_23vl3vllx1e0fa5.R.inc(5056);Log.info("Character encoding: "
                    + System.getProperty("file.encoding") + " charset: " + Charset.defaultCharset());

        } catch (Exception error) {
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5057);Log.warning("Failed to get system info");
        }
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void error(String msg) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5058);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5059);getLogger().error(msg);
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void warning(String msg) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5060);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5061);getLogger().warn(msg);
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void warning(Throwable exception) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5062);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5063);warning(null, exception);
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void warning(String msg, Throwable exception) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5064);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5065);StringBuilder s = new StringBuilder();
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5066);if ((((msg != null)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5067)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5068)==0&false))) {{
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5069);s.append(msg);
        }
        }__CLR4_5_23vl3vllx1e0fa5.R.inc(5070);if ((((exception != null)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5071)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5072)==0&false))) {{
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5073);if ((((msg != null)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5074)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5075)==0&false))) {{
                __CLR4_5_23vl3vllx1e0fa5.R.inc(5076);s.append(" - ");
            }
            }__CLR4_5_23vl3vllx1e0fa5.R.inc(5077);s.append(exceptionStack(exception));
        }
        }__CLR4_5_23vl3vllx1e0fa5.R.inc(5078);getLogger().warn(s.toString());
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void info(String msg) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5079);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5080);getLogger().info(msg);
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static void debug(String msg) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5081);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5082);getLogger().debug(msg);
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    public static String exceptionStack(Throwable exception) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5083);
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5084);StringBuilder s = new StringBuilder();
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5085);String exceptionMsg = exception.getMessage();
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5086);if ((((exceptionMsg != null)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5087)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5088)==0&false))) {{
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5089);s.append(exceptionMsg);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5090);s.append(" - ");
        }
        }__CLR4_5_23vl3vllx1e0fa5.R.inc(5091);s.append(exception.getClass().getSimpleName());
        __CLR4_5_23vl3vllx1e0fa5.R.inc(5092);StackTraceElement[] stack = exception.getStackTrace();

        __CLR4_5_23vl3vllx1e0fa5.R.inc(5093);if ((((stack.length > 0)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5094)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5095)==0&false))) {{
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5096);int count = STACK_LIMIT;
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5097);boolean first = true;
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5098);boolean skip = false;
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5099);String file = "";
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5100);s.append(" (");
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5101);for (StackTraceElement element : stack) {{
                __CLR4_5_23vl3vllx1e0fa5.R.inc(5102);if ((((count > 0 && element.getClassName().startsWith(STACK_PACKAGE))&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5103)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5104)==0&false))) {{
                    __CLR4_5_23vl3vllx1e0fa5.R.inc(5105);if ((((!first)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5106)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5107)==0&false))) {{
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5108);s.append(" < ");
                    } }else {{
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5109);first = false;
                    }

                    }__CLR4_5_23vl3vllx1e0fa5.R.inc(5110);if ((((skip)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5111)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5112)==0&false))) {{
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5113);s.append("... < ");
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5114);skip = false;
                    }

                    }__CLR4_5_23vl3vllx1e0fa5.R.inc(5115);if ((((file.equals(element.getFileName()))&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5116)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5117)==0&false))) {{
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5118);s.append("*");
                    } }else {{
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5119);file = element.getFileName();
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5120);s.append(file.substring(0, file.length() - 5)); // remove ".java"
                        __CLR4_5_23vl3vllx1e0fa5.R.inc(5121);count -= 1;
                    }
                    }__CLR4_5_23vl3vllx1e0fa5.R.inc(5122);s.append(":").append(element.getLineNumber());
                } }else {{
                    __CLR4_5_23vl3vllx1e0fa5.R.inc(5123);skip = true;
                }
            }}
            }__CLR4_5_23vl3vllx1e0fa5.R.inc(5124);if ((((skip)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5125)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5126)==0&false))) {{
                __CLR4_5_23vl3vllx1e0fa5.R.inc(5127);if ((((!first)&&(__CLR4_5_23vl3vllx1e0fa5.R.iget(5128)!=0|true))||(__CLR4_5_23vl3vllx1e0fa5.R.iget(5129)==0&false))) {{
                    __CLR4_5_23vl3vllx1e0fa5.R.inc(5130);s.append(" < ");
                }
                }__CLR4_5_23vl3vllx1e0fa5.R.inc(5131);s.append("...");
            }
            }__CLR4_5_23vl3vllx1e0fa5.R.inc(5132);s.append(")");
        }
        }__CLR4_5_23vl3vllx1e0fa5.R.inc(5133);return s.toString();
    }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    /**
     * Netty logger implementation
     */
    private static class NettyInternalLogger extends AbstractInternalLogger {

        @Override
        public boolean isDebugEnabled() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5134);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5135);return false;
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public boolean isInfoEnabled() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5136);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5137);return false;
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public boolean isWarnEnabled() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5138);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5139);return true;
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public boolean isErrorEnabled() {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5140);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5141);return true;
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void debug(String string) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5142);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5143);debug(string, null);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void debug(String string, Throwable thrwbl) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5144);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void info(String string) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5145);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5146);info(string, null);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void info(String string, Throwable thrwbl) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5147);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void warn(String string) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5148);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5149);warn(string, null);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void warn(String string, Throwable thrwbl) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5150);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5151);getLogger().warn("netty warning: " + string);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void error(String string) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5152);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5153);error(string, null);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

        @Override
        public void error(String string, Throwable thrwbl) {try{__CLR4_5_23vl3vllx1e0fa5.R.inc(5154);
            __CLR4_5_23vl3vllx1e0fa5.R.inc(5155);getLogger().error("netty error: " + string);
        }finally{__CLR4_5_23vl3vllx1e0fa5.R.flushNeeded();}}

    }

}
