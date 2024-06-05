/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2013 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.nio.charset.Charset;

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

public class Log {public static class __CLR4_5_21ft1ftlx1e4xk1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,1993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final String LOGGER_NAME = "traccar";

    private static final String STACK_PACKAGE = "org.traccar";
    private static final int STACK_LIMIT = 3;

    private static Logger logger = null;
    
    public static void setupLogger(Config config) throws IOException {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1865);

        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1866);Layout layout = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %5p: %m%n");

        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1867);Appender appender = new DailyRollingFileAppender(
                layout, config.getString("logger.file"), "'.'yyyyMMdd");

        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1868);LogManager.resetConfiguration();
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1869);LogManager.getRootLogger().addAppender(new NullAppender());
        
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1870);logger = Logger.getLogger(LOGGER_NAME);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1871);logger.addAppender(appender);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1872);logger.setLevel(Level.toLevel(config.getString("logger.level"), Level.ALL));

        // Workaround for "Bug 745866 - (EDG-45) Possible netty logging config problem"
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1873);InternalLoggerFactory.setDefaultFactory(new InternalLoggerFactory() {
            @Override
            public InternalLogger newInstance(String string) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1874);
                __CLR4_5_21ft1ftlx1e4xk1.R.inc(1875);return new NettyInternalLogger();
            }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}
        });

        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1876);Log.logSystemInfo();
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1877);Log.info("Version: " + Log.class.getPackage().getImplementationVersion());
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static Logger getLogger() {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1878);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1879);if ((((logger == null)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1880)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1881)==0&false))) {{
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1882);logger = Logger.getLogger(LOGGER_NAME);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1883);logger.setLevel(Level.OFF);
        }
        }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1884);return logger;
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}
    
    public static void logSystemInfo() {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1885);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1886);try {
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1887);OperatingSystemMXBean operatingSystemBean = ManagementFactory.getOperatingSystemMXBean();
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1888);Log.info("Operating system" +
                " name: " + operatingSystemBean.getName() +
                " version: " + operatingSystemBean.getVersion() +
                " architecture: " + operatingSystemBean.getArch());

            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1889);RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1890);Log.info("Java runtime" +
                " name: " + runtimeBean.getVmName() +
                " vendor: " + runtimeBean.getVmVendor() +
                " version: " + runtimeBean.getVmVersion());

            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1891);MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1892);Log.info("Memory limit" +
                " heap: " + memoryBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + "mb" +
                " non-heap: " + memoryBean.getNonHeapMemoryUsage().getMax() / (1024 * 1024) + "mb");

            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1893);Log.info("Character encoding: " +
                    System.getProperty("file.encoding") + " charset: " + Charset.defaultCharset());

        } catch (Exception error) {
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1894);Log.warning("Failed to get system info");
        }
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}
    
    public static void error(String msg) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1895);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1896);getLogger().error(msg);
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static void warning(String msg) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1897);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1898);getLogger().warn(msg);
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static void warning(Throwable exception) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1899);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1900);warning(null, exception);
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static void warning(String msg, Throwable exception) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1901);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1902);StringBuilder s = new StringBuilder();
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1903);if ((((msg != null)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1904)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1905)==0&false))) {{
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1906);s.append(msg);
        }
        }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1907);if ((((exception != null)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1908)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1909)==0&false))) {{
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1910);if ((((msg != null)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1911)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1912)==0&false))) {{
                __CLR4_5_21ft1ftlx1e4xk1.R.inc(1913);s.append(" - ");
            }
            }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1914);s.append(exceptionStack(exception));
        }
        }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1915);getLogger().warn(s.toString());
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static void info(String msg) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1916);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1917);getLogger().info(msg);
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static void debug(String msg) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1918);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1919);getLogger().debug(msg);
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    public static String exceptionStack(Throwable exception) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1920);
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1921);StringBuilder s = new StringBuilder();
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1922);String exceptionMsg = exception.getMessage();
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1923);if ((((exceptionMsg != null)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1924)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1925)==0&false))) {{
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1926);s.append(exceptionMsg);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1927);s.append(" - ");
        }
        }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1928);s.append(exception.getClass().getSimpleName());
        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1929);StackTraceElement[] stack = exception.getStackTrace();

        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1930);if ((((stack.length > 0)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1931)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1932)==0&false))) {{
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1933);int count = STACK_LIMIT;
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1934);boolean first = true;
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1935);boolean skip = false;
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1936);String file = "";
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1937);s.append(" (");
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1938);for (StackTraceElement element : stack) {{
                __CLR4_5_21ft1ftlx1e4xk1.R.inc(1939);if ((((count > 0 && element.getClassName().startsWith(STACK_PACKAGE))&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1940)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1941)==0&false))) {{
                    __CLR4_5_21ft1ftlx1e4xk1.R.inc(1942);if ((((!first)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1943)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1944)==0&false))) {{
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1945);s.append(" < ");
                    } }else {{
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1946);first = false;
                    }

                    }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1947);if ((((skip)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1948)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1949)==0&false))) {{
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1950);s.append("... < ");
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1951);skip = false;
                    }

                    }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1952);if ((((file.equals(element.getFileName()))&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1953)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1954)==0&false))) {{
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1955);s.append("*");
                    } }else {{
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1956);file = element.getFileName();
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1957);s.append(file.substring(0, file.length() - 5)); // remove ".java"
                        __CLR4_5_21ft1ftlx1e4xk1.R.inc(1958);count -= 1;
                    }
                    }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1959);s.append(":").append(element.getLineNumber());
                } }else {{
                    __CLR4_5_21ft1ftlx1e4xk1.R.inc(1960);skip = true;
                }
            }}
            }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1961);if ((((skip)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1962)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1963)==0&false))) {{
                __CLR4_5_21ft1ftlx1e4xk1.R.inc(1964);if ((((!first)&&(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1965)!=0|true))||(__CLR4_5_21ft1ftlx1e4xk1.R.iget(1966)==0&false))) {{
                    __CLR4_5_21ft1ftlx1e4xk1.R.inc(1967);s.append(" < ");
                }
                }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1968);s.append("...");
            }
            }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1969);s.append(")");
        }
        }__CLR4_5_21ft1ftlx1e4xk1.R.inc(1970);return s.toString();
    }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    /**
     * Netty logger implementation
     */
    private static class NettyInternalLogger extends AbstractInternalLogger {

        @Override
        public boolean isDebugEnabled() {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1971);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1972);return false;
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public boolean isInfoEnabled() {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1973);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1974);return false;
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public boolean isWarnEnabled() {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1975);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1976);return true;
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public boolean isErrorEnabled() {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1977);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1978);return true;
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void debug(String string) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1979);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1980);debug(string, null);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void debug(String string, Throwable thrwbl) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1981);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void info(String string) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1982);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1983);info(string, null);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void info(String string, Throwable thrwbl) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1984);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void warn(String string) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1985);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1986);warn(string, null);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void warn(String string, Throwable thrwbl) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1987);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1988);getLogger().warn("netty warning: " + string);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void error(String string) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1989);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1990);error(string, null);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

        @Override
        public void error(String string, Throwable thrwbl) {try{__CLR4_5_21ft1ftlx1e4xk1.R.inc(1991);
            __CLR4_5_21ft1ftlx1e4xk1.R.inc(1992);getLogger().error("netty error: " + string);
        }finally{__CLR4_5_21ft1ftlx1e4xk1.R.flushNeeded();}}

    }

}
