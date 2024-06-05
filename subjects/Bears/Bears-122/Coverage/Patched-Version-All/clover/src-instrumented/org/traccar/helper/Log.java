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

public final class Log {public static class __CLR4_5_248e48elwye7cog{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,5617,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Log() {try{__CLR4_5_248e48elwye7cog.R.inc(5486);
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private static final String LOGGER_NAME = "traccar";

    private static final String STACK_PACKAGE = "org.traccar";
    private static final int STACK_LIMIT = 3;

    private static Logger logger = null;

    public static String getAppVersion() {try{__CLR4_5_248e48elwye7cog.R.inc(5487);
        __CLR4_5_248e48elwye7cog.R.inc(5488);return Log.class.getPackage().getImplementationVersion();
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void setupLogger(Config config) throws IOException {try{__CLR4_5_248e48elwye7cog.R.inc(5489);

        __CLR4_5_248e48elwye7cog.R.inc(5490);Layout layout = new PatternLayout("%d{" + DATE_FORMAT + "} %5p: %m%n");

        __CLR4_5_248e48elwye7cog.R.inc(5491);Appender appender = new DailyRollingFileAppender(
                layout, config.getString("logger.file"), "'.'yyyyMMdd");

        __CLR4_5_248e48elwye7cog.R.inc(5492);LogManager.resetConfiguration();
        __CLR4_5_248e48elwye7cog.R.inc(5493);LogManager.getRootLogger().addAppender(new NullAppender());

        __CLR4_5_248e48elwye7cog.R.inc(5494);logger = Logger.getLogger(LOGGER_NAME);
        __CLR4_5_248e48elwye7cog.R.inc(5495);logger.addAppender(appender);
        __CLR4_5_248e48elwye7cog.R.inc(5496);logger.setLevel(Level.toLevel(config.getString("logger.level"), Level.ALL));

        // Workaround for "Bug 745866 - (EDG-45) Possible netty logging config problem"
        __CLR4_5_248e48elwye7cog.R.inc(5497);InternalLoggerFactory.setDefaultFactory(new InternalLoggerFactory() {
            @Override
            public InternalLogger newInstance(String string) {try{__CLR4_5_248e48elwye7cog.R.inc(5498);
                __CLR4_5_248e48elwye7cog.R.inc(5499);return new NettyInternalLogger();
            }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}
        });

        __CLR4_5_248e48elwye7cog.R.inc(5500);Log.logSystemInfo();
        __CLR4_5_248e48elwye7cog.R.inc(5501);Log.info("Version: " + getAppVersion());
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static Logger getLogger() {try{__CLR4_5_248e48elwye7cog.R.inc(5502);
        __CLR4_5_248e48elwye7cog.R.inc(5503);if ((((logger == null)&&(__CLR4_5_248e48elwye7cog.R.iget(5504)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5505)==0&false))) {{
            __CLR4_5_248e48elwye7cog.R.inc(5506);logger = Logger.getLogger(LOGGER_NAME);
            __CLR4_5_248e48elwye7cog.R.inc(5507);logger.setLevel(Level.OFF);
        }
        }__CLR4_5_248e48elwye7cog.R.inc(5508);return logger;
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void logSystemInfo() {try{__CLR4_5_248e48elwye7cog.R.inc(5509);
        __CLR4_5_248e48elwye7cog.R.inc(5510);try {
            __CLR4_5_248e48elwye7cog.R.inc(5511);OperatingSystemMXBean operatingSystemBean = ManagementFactory.getOperatingSystemMXBean();
            __CLR4_5_248e48elwye7cog.R.inc(5512);Log.info("Operating system"
                    + " name: " + operatingSystemBean.getName()
                    + " version: " + operatingSystemBean.getVersion()
                    + " architecture: " + operatingSystemBean.getArch());

            __CLR4_5_248e48elwye7cog.R.inc(5513);RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
            __CLR4_5_248e48elwye7cog.R.inc(5514);Log.info("Java runtime"
                    + " name: " + runtimeBean.getVmName()
                    + " vendor: " + runtimeBean.getVmVendor()
                    + " version: " + runtimeBean.getVmVersion());

            __CLR4_5_248e48elwye7cog.R.inc(5515);MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            __CLR4_5_248e48elwye7cog.R.inc(5516);Log.info("Memory limit"
                    + " heap: " + memoryBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + "mb"
                    + " non-heap: " + memoryBean.getNonHeapMemoryUsage().getMax() / (1024 * 1024) + "mb");

            __CLR4_5_248e48elwye7cog.R.inc(5517);Log.info("Character encoding: "
                    + System.getProperty("file.encoding") + " charset: " + Charset.defaultCharset());

        } catch (Exception error) {
            __CLR4_5_248e48elwye7cog.R.inc(5518);Log.warning("Failed to get system info");
        }
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void error(String msg) {try{__CLR4_5_248e48elwye7cog.R.inc(5519);
        __CLR4_5_248e48elwye7cog.R.inc(5520);getLogger().error(msg);
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void warning(String msg) {try{__CLR4_5_248e48elwye7cog.R.inc(5521);
        __CLR4_5_248e48elwye7cog.R.inc(5522);getLogger().warn(msg);
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void warning(Throwable exception) {try{__CLR4_5_248e48elwye7cog.R.inc(5523);
        __CLR4_5_248e48elwye7cog.R.inc(5524);warning(null, exception);
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void warning(String msg, Throwable exception) {try{__CLR4_5_248e48elwye7cog.R.inc(5525);
        __CLR4_5_248e48elwye7cog.R.inc(5526);StringBuilder s = new StringBuilder();
        __CLR4_5_248e48elwye7cog.R.inc(5527);if ((((msg != null)&&(__CLR4_5_248e48elwye7cog.R.iget(5528)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5529)==0&false))) {{
            __CLR4_5_248e48elwye7cog.R.inc(5530);s.append(msg);
        }
        }__CLR4_5_248e48elwye7cog.R.inc(5531);if ((((exception != null)&&(__CLR4_5_248e48elwye7cog.R.iget(5532)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5533)==0&false))) {{
            __CLR4_5_248e48elwye7cog.R.inc(5534);if ((((msg != null)&&(__CLR4_5_248e48elwye7cog.R.iget(5535)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5536)==0&false))) {{
                __CLR4_5_248e48elwye7cog.R.inc(5537);s.append(" - ");
            }
            }__CLR4_5_248e48elwye7cog.R.inc(5538);s.append(exceptionStack(exception));
        }
        }__CLR4_5_248e48elwye7cog.R.inc(5539);getLogger().warn(s.toString());
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void info(String msg) {try{__CLR4_5_248e48elwye7cog.R.inc(5540);
        __CLR4_5_248e48elwye7cog.R.inc(5541);getLogger().info(msg);
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static void debug(String msg) {try{__CLR4_5_248e48elwye7cog.R.inc(5542);
        __CLR4_5_248e48elwye7cog.R.inc(5543);getLogger().debug(msg);
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    public static String exceptionStack(Throwable exception) {try{__CLR4_5_248e48elwye7cog.R.inc(5544);
        __CLR4_5_248e48elwye7cog.R.inc(5545);StringBuilder s = new StringBuilder();
        __CLR4_5_248e48elwye7cog.R.inc(5546);String exceptionMsg = exception.getMessage();
        __CLR4_5_248e48elwye7cog.R.inc(5547);if ((((exceptionMsg != null)&&(__CLR4_5_248e48elwye7cog.R.iget(5548)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5549)==0&false))) {{
            __CLR4_5_248e48elwye7cog.R.inc(5550);s.append(exceptionMsg);
            __CLR4_5_248e48elwye7cog.R.inc(5551);s.append(" - ");
        }
        }__CLR4_5_248e48elwye7cog.R.inc(5552);s.append(exception.getClass().getSimpleName());
        __CLR4_5_248e48elwye7cog.R.inc(5553);StackTraceElement[] stack = exception.getStackTrace();

        __CLR4_5_248e48elwye7cog.R.inc(5554);if ((((stack.length > 0)&&(__CLR4_5_248e48elwye7cog.R.iget(5555)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5556)==0&false))) {{
            __CLR4_5_248e48elwye7cog.R.inc(5557);int count = STACK_LIMIT;
            __CLR4_5_248e48elwye7cog.R.inc(5558);boolean first = true;
            __CLR4_5_248e48elwye7cog.R.inc(5559);boolean skip = false;
            __CLR4_5_248e48elwye7cog.R.inc(5560);String file = "";
            __CLR4_5_248e48elwye7cog.R.inc(5561);s.append(" (");
            __CLR4_5_248e48elwye7cog.R.inc(5562);for (StackTraceElement element : stack) {{
                __CLR4_5_248e48elwye7cog.R.inc(5563);if ((((count > 0 && element.getClassName().startsWith(STACK_PACKAGE))&&(__CLR4_5_248e48elwye7cog.R.iget(5564)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5565)==0&false))) {{
                    __CLR4_5_248e48elwye7cog.R.inc(5566);if ((((!first)&&(__CLR4_5_248e48elwye7cog.R.iget(5567)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5568)==0&false))) {{
                        __CLR4_5_248e48elwye7cog.R.inc(5569);s.append(" < ");
                    } }else {{
                        __CLR4_5_248e48elwye7cog.R.inc(5570);first = false;
                    }

                    }__CLR4_5_248e48elwye7cog.R.inc(5571);if ((((skip)&&(__CLR4_5_248e48elwye7cog.R.iget(5572)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5573)==0&false))) {{
                        __CLR4_5_248e48elwye7cog.R.inc(5574);s.append("... < ");
                        __CLR4_5_248e48elwye7cog.R.inc(5575);skip = false;
                    }

                    }__CLR4_5_248e48elwye7cog.R.inc(5576);if ((((file.equals(element.getFileName()))&&(__CLR4_5_248e48elwye7cog.R.iget(5577)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5578)==0&false))) {{
                        __CLR4_5_248e48elwye7cog.R.inc(5579);s.append("*");
                    } }else {{
                        __CLR4_5_248e48elwye7cog.R.inc(5580);file = element.getFileName();
                        __CLR4_5_248e48elwye7cog.R.inc(5581);s.append(file.substring(0, file.length() - 5)); // remove ".java"
                        __CLR4_5_248e48elwye7cog.R.inc(5582);count -= 1;
                    }
                    }__CLR4_5_248e48elwye7cog.R.inc(5583);s.append(":").append(element.getLineNumber());
                } }else {{
                    __CLR4_5_248e48elwye7cog.R.inc(5584);skip = true;
                }
            }}
            }__CLR4_5_248e48elwye7cog.R.inc(5585);if ((((skip)&&(__CLR4_5_248e48elwye7cog.R.iget(5586)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5587)==0&false))) {{
                __CLR4_5_248e48elwye7cog.R.inc(5588);if ((((!first)&&(__CLR4_5_248e48elwye7cog.R.iget(5589)!=0|true))||(__CLR4_5_248e48elwye7cog.R.iget(5590)==0&false))) {{
                    __CLR4_5_248e48elwye7cog.R.inc(5591);s.append(" < ");
                }
                }__CLR4_5_248e48elwye7cog.R.inc(5592);s.append("...");
            }
            }__CLR4_5_248e48elwye7cog.R.inc(5593);s.append(")");
        }
        }__CLR4_5_248e48elwye7cog.R.inc(5594);return s.toString();
    }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    /**
     * Netty logger implementation
     */
    private static class NettyInternalLogger extends AbstractInternalLogger {

        @Override
        public boolean isDebugEnabled() {try{__CLR4_5_248e48elwye7cog.R.inc(5595);
            __CLR4_5_248e48elwye7cog.R.inc(5596);return false;
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public boolean isInfoEnabled() {try{__CLR4_5_248e48elwye7cog.R.inc(5597);
            __CLR4_5_248e48elwye7cog.R.inc(5598);return false;
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public boolean isWarnEnabled() {try{__CLR4_5_248e48elwye7cog.R.inc(5599);
            __CLR4_5_248e48elwye7cog.R.inc(5600);return true;
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public boolean isErrorEnabled() {try{__CLR4_5_248e48elwye7cog.R.inc(5601);
            __CLR4_5_248e48elwye7cog.R.inc(5602);return true;
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void debug(String string) {try{__CLR4_5_248e48elwye7cog.R.inc(5603);
            __CLR4_5_248e48elwye7cog.R.inc(5604);debug(string, null);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void debug(String string, Throwable thrwbl) {try{__CLR4_5_248e48elwye7cog.R.inc(5605);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void info(String string) {try{__CLR4_5_248e48elwye7cog.R.inc(5606);
            __CLR4_5_248e48elwye7cog.R.inc(5607);info(string, null);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void info(String string, Throwable thrwbl) {try{__CLR4_5_248e48elwye7cog.R.inc(5608);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void warn(String string) {try{__CLR4_5_248e48elwye7cog.R.inc(5609);
            __CLR4_5_248e48elwye7cog.R.inc(5610);warn(string, null);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void warn(String string, Throwable thrwbl) {try{__CLR4_5_248e48elwye7cog.R.inc(5611);
            __CLR4_5_248e48elwye7cog.R.inc(5612);getLogger().warn("netty warning: " + string);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void error(String string) {try{__CLR4_5_248e48elwye7cog.R.inc(5613);
            __CLR4_5_248e48elwye7cog.R.inc(5614);error(string, null);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

        @Override
        public void error(String string, Throwable thrwbl) {try{__CLR4_5_248e48elwye7cog.R.inc(5615);
            __CLR4_5_248e48elwye7cog.R.inc(5616);getLogger().error("netty error: " + string);
        }finally{__CLR4_5_248e48elwye7cog.R.flushNeeded();}}

    }

}
