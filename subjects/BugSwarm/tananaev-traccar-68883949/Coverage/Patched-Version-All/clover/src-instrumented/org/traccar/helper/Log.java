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
import java.util.Properties;
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

public class Log {public static class __CLR4_5_218l18llx1dsksm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,1726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final String LOGGER_NAME = "traccar";

    private static final String STACK_PACKAGE = "org.traccar";
    private static final int STACK_LIMIT = 3;

    private static Logger logger = null;
    
    public static void setupLogger(Properties properties) throws IOException {try{__CLR4_5_218l18llx1dsksm.R.inc(1605);

        __CLR4_5_218l18llx1dsksm.R.inc(1606);Layout layout = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %5p: %m%n");

        __CLR4_5_218l18llx1dsksm.R.inc(1607);Appender appender = new DailyRollingFileAppender(
                layout, properties.getProperty("logger.file"), "'.'yyyyMMdd");

        __CLR4_5_218l18llx1dsksm.R.inc(1608);LogManager.resetConfiguration();
        __CLR4_5_218l18llx1dsksm.R.inc(1609);LogManager.getRootLogger().addAppender(new NullAppender());
        
        __CLR4_5_218l18llx1dsksm.R.inc(1610);logger = Logger.getLogger(LOGGER_NAME);
        __CLR4_5_218l18llx1dsksm.R.inc(1611);logger.addAppender(appender);
        __CLR4_5_218l18llx1dsksm.R.inc(1612);logger.setLevel(Level.toLevel(properties.getProperty("logger.level"), Level.ALL));

        // Workaround for "Bug 745866 - (EDG-45) Possible netty logging config problem"
        __CLR4_5_218l18llx1dsksm.R.inc(1613);InternalLoggerFactory.setDefaultFactory(new InternalLoggerFactory() {
            @Override
            public InternalLogger newInstance(String string) {try{__CLR4_5_218l18llx1dsksm.R.inc(1614);
                __CLR4_5_218l18llx1dsksm.R.inc(1615);return new NettyInternalLogger();
            }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}
        });
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static Logger getLogger() {try{__CLR4_5_218l18llx1dsksm.R.inc(1616);
        __CLR4_5_218l18llx1dsksm.R.inc(1617);if ((((logger == null)&&(__CLR4_5_218l18llx1dsksm.R.iget(1618)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1619)==0&false))) {{
            __CLR4_5_218l18llx1dsksm.R.inc(1620);logger = Logger.getLogger(LOGGER_NAME);
            __CLR4_5_218l18llx1dsksm.R.inc(1621);logger.setLevel(Level.OFF);
        }
        }__CLR4_5_218l18llx1dsksm.R.inc(1622);return logger;
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}
    
    public static void logSystemInfo() {try{__CLR4_5_218l18llx1dsksm.R.inc(1623);
        __CLR4_5_218l18llx1dsksm.R.inc(1624);try {
            __CLR4_5_218l18llx1dsksm.R.inc(1625);OperatingSystemMXBean operatingSystemBean = ManagementFactory.getOperatingSystemMXBean();
            __CLR4_5_218l18llx1dsksm.R.inc(1626);Log.info("Operating System" +
                " name: " + operatingSystemBean.getName() +
                " version: " + operatingSystemBean.getVersion() +
                " architecture: " + operatingSystemBean.getArch());

            __CLR4_5_218l18llx1dsksm.R.inc(1627);RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
            __CLR4_5_218l18llx1dsksm.R.inc(1628);Log.info("Java Runtime" +
                " name: " + runtimeBean.getVmName() +
                " vendor: " + runtimeBean.getVmVendor() +
                " version: " + runtimeBean.getVmVersion());

            __CLR4_5_218l18llx1dsksm.R.inc(1629);MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            __CLR4_5_218l18llx1dsksm.R.inc(1630);Log.info("Memory Limit" +
                " heap: " + memoryBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + "mb" +
                " non-heap: " + memoryBean.getNonHeapMemoryUsage().getMax() / (1024 * 1024) + "mb");
        } catch (Exception e) {
            __CLR4_5_218l18llx1dsksm.R.inc(1631);Log.warning("Failed to get system info");
        }
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}
    
    public static void error(String msg) {try{__CLR4_5_218l18llx1dsksm.R.inc(1632);
        __CLR4_5_218l18llx1dsksm.R.inc(1633);getLogger().error(msg);
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static void warning(String msg) {try{__CLR4_5_218l18llx1dsksm.R.inc(1634);
        __CLR4_5_218l18llx1dsksm.R.inc(1635);getLogger().warn(msg);
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static void warning(Throwable exception) {try{__CLR4_5_218l18llx1dsksm.R.inc(1636);
        __CLR4_5_218l18llx1dsksm.R.inc(1637);warning(null, exception);
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static void warning(String msg, Throwable exception) {try{__CLR4_5_218l18llx1dsksm.R.inc(1638);
        __CLR4_5_218l18llx1dsksm.R.inc(1639);StringBuilder s = new StringBuilder();
        __CLR4_5_218l18llx1dsksm.R.inc(1640);if ((((msg != null)&&(__CLR4_5_218l18llx1dsksm.R.iget(1641)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1642)==0&false))) {{
            __CLR4_5_218l18llx1dsksm.R.inc(1643);s.append(msg);
        }
        }__CLR4_5_218l18llx1dsksm.R.inc(1644);if ((((exception != null)&&(__CLR4_5_218l18llx1dsksm.R.iget(1645)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1646)==0&false))) {{
            __CLR4_5_218l18llx1dsksm.R.inc(1647);if ((((msg != null)&&(__CLR4_5_218l18llx1dsksm.R.iget(1648)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1649)==0&false))) {{
                __CLR4_5_218l18llx1dsksm.R.inc(1650);s.append(" - ");
            }
            }__CLR4_5_218l18llx1dsksm.R.inc(1651);s.append(exceptionStack(exception));
        }
        }__CLR4_5_218l18llx1dsksm.R.inc(1652);getLogger().warn(s.toString());
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static void info(String msg) {try{__CLR4_5_218l18llx1dsksm.R.inc(1653);
        __CLR4_5_218l18llx1dsksm.R.inc(1654);getLogger().info(msg);
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static void debug(String msg) {try{__CLR4_5_218l18llx1dsksm.R.inc(1655);
        __CLR4_5_218l18llx1dsksm.R.inc(1656);getLogger().debug(msg);
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    public static String exceptionStack(Throwable exception) {try{__CLR4_5_218l18llx1dsksm.R.inc(1657);
        __CLR4_5_218l18llx1dsksm.R.inc(1658);StringBuilder s = new StringBuilder();
        __CLR4_5_218l18llx1dsksm.R.inc(1659);String exceptionMsg = exception.getMessage();
        __CLR4_5_218l18llx1dsksm.R.inc(1660);if ((((exceptionMsg != null)&&(__CLR4_5_218l18llx1dsksm.R.iget(1661)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1662)==0&false))) {{
            __CLR4_5_218l18llx1dsksm.R.inc(1663);s.append(exceptionMsg);
            __CLR4_5_218l18llx1dsksm.R.inc(1664);s.append(" - ");
        }
        }__CLR4_5_218l18llx1dsksm.R.inc(1665);s.append(exception.getClass().getSimpleName());
        __CLR4_5_218l18llx1dsksm.R.inc(1666);StackTraceElement[] stack = exception.getStackTrace();

        __CLR4_5_218l18llx1dsksm.R.inc(1667);if ((((stack.length > 0)&&(__CLR4_5_218l18llx1dsksm.R.iget(1668)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1669)==0&false))) {{
            __CLR4_5_218l18llx1dsksm.R.inc(1670);int count = STACK_LIMIT;
            __CLR4_5_218l18llx1dsksm.R.inc(1671);boolean first = true;
            __CLR4_5_218l18llx1dsksm.R.inc(1672);boolean skip = false;
            __CLR4_5_218l18llx1dsksm.R.inc(1673);String file = "";
            __CLR4_5_218l18llx1dsksm.R.inc(1674);s.append(" (");
            __CLR4_5_218l18llx1dsksm.R.inc(1675);for (StackTraceElement element : stack) {{
                __CLR4_5_218l18llx1dsksm.R.inc(1676);if ((((count > 0 && element.getClassName().startsWith(STACK_PACKAGE))&&(__CLR4_5_218l18llx1dsksm.R.iget(1677)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1678)==0&false))) {{
                    __CLR4_5_218l18llx1dsksm.R.inc(1679);if ((((!first)&&(__CLR4_5_218l18llx1dsksm.R.iget(1680)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1681)==0&false))) {{
                        __CLR4_5_218l18llx1dsksm.R.inc(1682);s.append(" < ");
                    } }else {{
                        __CLR4_5_218l18llx1dsksm.R.inc(1683);first = false;
                    }

                    }__CLR4_5_218l18llx1dsksm.R.inc(1684);if ((((skip)&&(__CLR4_5_218l18llx1dsksm.R.iget(1685)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1686)==0&false))) {{
                        __CLR4_5_218l18llx1dsksm.R.inc(1687);s.append("... < ");
                        __CLR4_5_218l18llx1dsksm.R.inc(1688);skip = false;
                    }

                    }__CLR4_5_218l18llx1dsksm.R.inc(1689);if ((((file.equals(element.getFileName()))&&(__CLR4_5_218l18llx1dsksm.R.iget(1690)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1691)==0&false))) {{
                        __CLR4_5_218l18llx1dsksm.R.inc(1692);s.append("*:");
                    } }else {{
                        __CLR4_5_218l18llx1dsksm.R.inc(1693);file = element.getFileName();
                        __CLR4_5_218l18llx1dsksm.R.inc(1694);s.append(file).append(":");
                        __CLR4_5_218l18llx1dsksm.R.inc(1695);count -= 1;
                    }
                    }__CLR4_5_218l18llx1dsksm.R.inc(1696);s.append(element.getLineNumber());
                } }else {{
                    __CLR4_5_218l18llx1dsksm.R.inc(1697);skip = true;
                }
            }}
            }__CLR4_5_218l18llx1dsksm.R.inc(1698);if ((((skip)&&(__CLR4_5_218l18llx1dsksm.R.iget(1699)!=0|true))||(__CLR4_5_218l18llx1dsksm.R.iget(1700)==0&false))) {{
                __CLR4_5_218l18llx1dsksm.R.inc(1701);s.append(" < ...");
            }
            }__CLR4_5_218l18llx1dsksm.R.inc(1702);s.append(")");
        }
        }__CLR4_5_218l18llx1dsksm.R.inc(1703);return s.toString();
    }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    /**
     * Netty logger implementation
     */
    private static class NettyInternalLogger extends AbstractInternalLogger {

        @Override
        public boolean isDebugEnabled() {try{__CLR4_5_218l18llx1dsksm.R.inc(1704);
            __CLR4_5_218l18llx1dsksm.R.inc(1705);return false;
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public boolean isInfoEnabled() {try{__CLR4_5_218l18llx1dsksm.R.inc(1706);
            __CLR4_5_218l18llx1dsksm.R.inc(1707);return false;
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public boolean isWarnEnabled() {try{__CLR4_5_218l18llx1dsksm.R.inc(1708);
            __CLR4_5_218l18llx1dsksm.R.inc(1709);return true;
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public boolean isErrorEnabled() {try{__CLR4_5_218l18llx1dsksm.R.inc(1710);
            __CLR4_5_218l18llx1dsksm.R.inc(1711);return true;
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void debug(String string) {try{__CLR4_5_218l18llx1dsksm.R.inc(1712);
            __CLR4_5_218l18llx1dsksm.R.inc(1713);debug(string, null);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void debug(String string, Throwable thrwbl) {try{__CLR4_5_218l18llx1dsksm.R.inc(1714);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void info(String string) {try{__CLR4_5_218l18llx1dsksm.R.inc(1715);
            __CLR4_5_218l18llx1dsksm.R.inc(1716);info(string, null);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void info(String string, Throwable thrwbl) {try{__CLR4_5_218l18llx1dsksm.R.inc(1717);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void warn(String string) {try{__CLR4_5_218l18llx1dsksm.R.inc(1718);
            __CLR4_5_218l18llx1dsksm.R.inc(1719);warn(string, null);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void warn(String string, Throwable thrwbl) {try{__CLR4_5_218l18llx1dsksm.R.inc(1720);
            __CLR4_5_218l18llx1dsksm.R.inc(1721);getLogger().warn("netty warning: " + string);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void error(String string) {try{__CLR4_5_218l18llx1dsksm.R.inc(1722);
            __CLR4_5_218l18llx1dsksm.R.inc(1723);error(string, null);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

        @Override
        public void error(String string, Throwable thrwbl) {try{__CLR4_5_218l18llx1dsksm.R.inc(1724);
            __CLR4_5_218l18llx1dsksm.R.inc(1725);getLogger().error("netty error: " + string);
        }finally{__CLR4_5_218l18llx1dsksm.R.flushNeeded();}}

    }

}
