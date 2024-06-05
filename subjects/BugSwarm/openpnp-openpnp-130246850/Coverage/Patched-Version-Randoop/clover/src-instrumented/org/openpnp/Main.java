/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is part of OpenPnP.
 * 
 * OpenPnP is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenPnP is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with OpenPnP. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.UIManager;

import org.apache.commons.io.FileUtils;
import org.openpnp.gui.MainFrame;
import org.openpnp.model.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Start with -Xdock:name=OpenPnP on Mac to make it prettier.
 * 
 * @author jason
 *
 */
public class Main {public static class __CLR4_5_2bblx1h6wg0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,50,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger logger;

    public static String getVersion() {try{__CLR4_5_2bblx1h6wg0.R.inc(11);
        __CLR4_5_2bblx1h6wg0.R.inc(12);String version = Main.class.getPackage().getImplementationVersion();
        __CLR4_5_2bblx1h6wg0.R.inc(13);if ((((version == null)&&(__CLR4_5_2bblx1h6wg0.R.iget(14)!=0|true))||(__CLR4_5_2bblx1h6wg0.R.iget(15)==0&false))) {{
            __CLR4_5_2bblx1h6wg0.R.inc(16);version = "INTERNAL BUILD";
        }
        }__CLR4_5_2bblx1h6wg0.R.inc(17);return version;
    }finally{__CLR4_5_2bblx1h6wg0.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_5_2bblx1h6wg0.R.inc(18);
        // http://developer.apple.com/library/mac/#documentation/Java/Conceptual/Java14Development/07-NativePlatformIntegration/NativePlatformIntegration.html#//apple_ref/doc/uid/TP40001909-212952-TPXREF134
        __CLR4_5_2bblx1h6wg0.R.inc(19);System.setProperty("apple.laf.useScreenMenuBar", "true");
        __CLR4_5_2bblx1h6wg0.R.inc(20);try {
            __CLR4_5_2bblx1h6wg0.R.inc(21);UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            __CLR4_5_2bblx1h6wg0.R.inc(22);throw new Error(e);
        }

        __CLR4_5_2bblx1h6wg0.R.inc(23);File configurationDirectory = new File(System.getProperty("user.home"));
        __CLR4_5_2bblx1h6wg0.R.inc(24);configurationDirectory = new File(configurationDirectory, ".openpnp");

        __CLR4_5_2bblx1h6wg0.R.inc(25);if ((((System.getProperty("configDir") != null)&&(__CLR4_5_2bblx1h6wg0.R.iget(26)!=0|true))||(__CLR4_5_2bblx1h6wg0.R.iget(27)==0&false))) {{
            __CLR4_5_2bblx1h6wg0.R.inc(28);configurationDirectory = new File(System.getProperty("configDir"));
        }

        // If the log4j.properties is not in the configuration directory, copy
        // the default over.
        }__CLR4_5_2bblx1h6wg0.R.inc(29);File log4jConfigurationFile = new File(configurationDirectory, "log4j.properties");
        __CLR4_5_2bblx1h6wg0.R.inc(30);if ((((!log4jConfigurationFile.exists())&&(__CLR4_5_2bblx1h6wg0.R.iget(31)!=0|true))||(__CLR4_5_2bblx1h6wg0.R.iget(32)==0&false))) {{
            __CLR4_5_2bblx1h6wg0.R.inc(33);try {
                __CLR4_5_2bblx1h6wg0.R.inc(34);FileUtils.copyURLToFile(ClassLoader.getSystemResource("log4j.properties"),
                        log4jConfigurationFile);
            }
            catch (Exception e) {
                __CLR4_5_2bblx1h6wg0.R.inc(35);e.printStackTrace();
            }
        }

        // Use the local configuration if it exists.
        }__CLR4_5_2bblx1h6wg0.R.inc(36);if ((((log4jConfigurationFile.exists())&&(__CLR4_5_2bblx1h6wg0.R.iget(37)!=0|true))||(__CLR4_5_2bblx1h6wg0.R.iget(38)==0&false))) {{
            __CLR4_5_2bblx1h6wg0.R.inc(39);System.setProperty("log4j.configuration", log4jConfigurationFile.toURI().toString());
        }

        // We don't create a logger until log4j has been configured or it tries
        // to configure itself.
        }__CLR4_5_2bblx1h6wg0.R.inc(40);logger = LoggerFactory.getLogger(Main.class);

        __CLR4_5_2bblx1h6wg0.R.inc(41);logger.debug(String.format("OpenPnP %s Started.", Main.getVersion()));

        __CLR4_5_2bblx1h6wg0.R.inc(42);Configuration.initialize(configurationDirectory);
        __CLR4_5_2bblx1h6wg0.R.inc(43);final Configuration configuration = Configuration.get();
        __CLR4_5_2bblx1h6wg0.R.inc(44);EventQueue.invokeLater(new Runnable() {
            public void run() {try{__CLR4_5_2bblx1h6wg0.R.inc(45);
                __CLR4_5_2bblx1h6wg0.R.inc(46);try {
                    __CLR4_5_2bblx1h6wg0.R.inc(47);MainFrame frame = new MainFrame(configuration);
                    __CLR4_5_2bblx1h6wg0.R.inc(48);frame.setVisible(true);
                }
                catch (Exception e) {
                    __CLR4_5_2bblx1h6wg0.R.inc(49);e.printStackTrace();
                }
            }finally{__CLR4_5_2bblx1h6wg0.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2bblx1h6wg0.R.flushNeeded();}}
}
