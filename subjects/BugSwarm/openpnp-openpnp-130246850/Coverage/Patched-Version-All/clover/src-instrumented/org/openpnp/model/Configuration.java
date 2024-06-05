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

package org.openpnp.model;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.prefs.Preferences;

import org.apache.commons.io.FileUtils;
import org.openpnp.ConfigurationListener;
import org.openpnp.spi.Machine;
import org.openpnp.util.ResourceUtils;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.HyphenStyle;
import org.simpleframework.xml.stream.Style;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Configuration extends AbstractModelObject {public static class __CLR4_5_2bxhbxhlx1h8mx8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,15734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);

    private static Configuration instance;

    private static final String PREF_UNITS = "Configuration.units";
    private static final String PREF_UNITS_DEF = "Millimeters";

    private static final String PREF_LENGTH_DISPLAY_FORMAT = "Configuration.lengthDisplayFormat";
    private static final String PREF_LENGTH_DISPLAY_FORMAT_DEF = "%.3f";

    private static final String PREF_LENGTH_DISPLAY_FORMAT_WITH_UNITS =
            "Configuration.lengthDisplayFormatWithUnits";
    private static final String PREF_LENGTH_DISPLAY_FORMAT_WITH_UNITS_DEF = "%.3f%s";

    private static final String PREF_VERTICAL_SCROLL_UNIT_INCREMENT =
            "Configuration.verticalScrollUnitIncrement";
    private static final int PREF_VERTICAL_SCROLL_UNIT_INCREMENT_DEF = 16;

    private LinkedHashMap<String, Package> packages = new LinkedHashMap<>();
    private LinkedHashMap<String, Part> parts = new LinkedHashMap<>();
    private Machine machine;
    private LinkedHashMap<File, Board> boards = new LinkedHashMap<>();
    private boolean loaded;
    private Set<ConfigurationListener> listeners = Collections.synchronizedSet(new HashSet<>());
    private File configurationDirectory;
    private Preferences prefs;

    public static Configuration get() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15461);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15462);if ((((instance == null)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15463)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15464)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15465);throw new Error("Configuration instance not yet initialized.");
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15466);return instance;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public static synchronized void initialize(File configurationDirectory) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15467);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15468);instance = new Configuration(configurationDirectory);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15469);instance.setLengthDisplayFormatWithUnits(PREF_LENGTH_DISPLAY_FORMAT_WITH_UNITS_DEF);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private Configuration(File configurationDirectory) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15470);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15471);this.configurationDirectory = configurationDirectory;
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15472);this.prefs = Preferences.userNodeForPackage(Configuration.class);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public File getConfigurationDirectory() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15473);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15474);return configurationDirectory;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public LengthUnit getSystemUnits() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15475);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15476);return LengthUnit.valueOf(prefs.get(PREF_UNITS, PREF_UNITS_DEF));
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void setSystemUnits(LengthUnit lengthUnit) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15477);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15478);prefs.put(PREF_UNITS, lengthUnit.name());
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public String getLengthDisplayFormat() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15479);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15480);return prefs.get(PREF_LENGTH_DISPLAY_FORMAT, PREF_LENGTH_DISPLAY_FORMAT_DEF);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void setLengthDisplayFormat(String format) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15481);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15482);prefs.put(PREF_LENGTH_DISPLAY_FORMAT, format);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public String getLengthDisplayFormatWithUnits() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15483);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15484);return prefs.get(PREF_LENGTH_DISPLAY_FORMAT_WITH_UNITS,
                PREF_LENGTH_DISPLAY_FORMAT_WITH_UNITS_DEF);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void setLengthDisplayFormatWithUnits(String format) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15485);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15486);prefs.put(PREF_LENGTH_DISPLAY_FORMAT_WITH_UNITS, format);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public int getVerticalScrollUnitIncrement() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15487);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15488);return prefs.getInt(PREF_VERTICAL_SCROLL_UNIT_INCREMENT,
                PREF_VERTICAL_SCROLL_UNIT_INCREMENT_DEF);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void setVerticalScrollUnitIncrement(int verticalScrollUnitIncrement) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15489);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15490);prefs.putInt(PREF_VERTICAL_SCROLL_UNIT_INCREMENT, PREF_VERTICAL_SCROLL_UNIT_INCREMENT_DEF);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    /**
     * Gets a File reference for the resources directory belonging to the given class. The directory
     * is guaranteed to exist.
     * 
     * @param forClass
     * @return
     * @throws IOException
     */
    public File getResourceDirectory(Class forClass) throws IOException {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15491);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15492);File directory = new File(configurationDirectory, forClass.getCanonicalName());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15493);if ((((!directory.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15494)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15495)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15496);directory.mkdirs();
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15497);return directory;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    /**
     * Gets a File reference for the named file within the configuration directory. forClass is used
     * to uniquely identify the file and keep it separate from other classes' files.
     * 
     * @param forClass
     * @param name
     * @return
     */
    public File getResourceFile(Class forClass, String name) throws IOException {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15498);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15499);return new File(getResourceDirectory(forClass), name);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    /**
     * Creates a new file with a unique name within the configuration directory. forClass is used to
     * uniquely identify the file within the application and a unique name is generated within that
     * namespace. suffix is appended to the unique part of the filename. The result of calling
     * File.getName() on the returned file can be used to load the same file in the future by
     * calling getResourceFile(). This method uses File.createTemporaryFile() and so the rules for
     * that method must be followed when calling this one.
     * 
     * @param forClass
     * @param suffix
     * @return
     * @throws IOException
     */
    public File createResourceFile(Class forClass, String prefix, String suffix)
            throws IOException {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15500);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15501);File directory = new File(configurationDirectory, forClass.getCanonicalName());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15502);if ((((!directory.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15503)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15504)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15505);directory.mkdirs();
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15506);File file = File.createTempFile(prefix, suffix, directory);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15507);return file;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void addListener(ConfigurationListener listener) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15508);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15509);listeners.add(listener);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15510);if ((((loaded)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15511)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15512)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15513);try {
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15514);listener.configurationLoaded(this);
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15515);listener.configurationComplete(this);
            }
            catch (Exception e) {
                // TODO: Need to find a way to raise this to the GUI
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15516);throw new Error(e);
            }
        }
    }}finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void removeListener(ConfigurationListener listener) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15517);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15518);listeners.remove(listener);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public synchronized void load() throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15519);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15520);boolean forceSave = false;
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15521);boolean overrideUserConfig = Boolean.getBoolean("overrideUserConfig");

        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15522);try {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15523);File file = new File(configurationDirectory, "packages.xml");
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15524);if ((((overrideUserConfig || !file.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15525)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15526)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15527);logger.info("No packages.xml found in configuration directory, loading defaults.");
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15528);file = File.createTempFile("packages", "xml");
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15529);FileUtils.copyURLToFile(ClassLoader.getSystemResource("config/packages.xml"), file);
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15530);forceSave = true;
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15531);loadPackages(file);
        }
        catch (Exception e) {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15532);String message = e.getMessage();
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15533);if ((((e.getCause() != null && e.getCause().getMessage() != null)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15534)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15535)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15536);message = e.getCause().getMessage();
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15537);throw new Exception("Error while reading packages.xml (" + message + ")", e);
        }


        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15538);try {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15539);File file = new File(configurationDirectory, "parts.xml");
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15540);if ((((overrideUserConfig || !file.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15541)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15542)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15543);logger.info("No parts.xml found in configuration directory, loading defaults.");
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15544);file = File.createTempFile("parts", "xml");
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15545);FileUtils.copyURLToFile(ClassLoader.getSystemResource("config/parts.xml"), file);
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15546);forceSave = true;
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15547);loadParts(file);
        }
        catch (Exception e) {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15548);String message = e.getMessage();
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15549);if ((((e.getCause() != null && e.getCause().getMessage() != null)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15550)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15551)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15552);message = e.getCause().getMessage();
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15553);throw new Exception("Error while reading parts.xml (" + message + ")", e);
        }


        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15554);try {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15555);File file = new File(configurationDirectory, "machine.xml");
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15556);if ((((overrideUserConfig || !file.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15557)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15558)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15559);logger.info("No machine.xml found in configuration directory, loading defaults.");
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15560);file = File.createTempFile("machine", "xml");
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15561);FileUtils.copyURLToFile(ClassLoader.getSystemResource("config/machine.xml"), file);
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15562);forceSave = true;
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15563);loadMachine(file);
        }
        catch (Exception e) {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15564);String message = e.getMessage();
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15565);if ((((e.getCause() != null && e.getCause().getMessage() != null)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15566)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15567)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15568);message = e.getCause().getMessage();
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15569);throw new Exception("Error while reading machine.xml (" + message + ")", e);
        }

        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15570);loaded = true;

        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15571);for (ConfigurationListener listener : listeners) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15572);listener.configurationLoaded(this);
        }

        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15573);if ((((forceSave)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15574)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15575)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15576);logger.info("Defaults were loaded. Saving to configuration directory.");
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15577);configurationDirectory.mkdirs();
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15578);save();
        }

        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15579);for (ConfigurationListener listener : listeners) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15580);listener.configurationComplete(this);
        }
    }}finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public synchronized void save() throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15581);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15582);try {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15583);saveMachine(new File(configurationDirectory, "machine.xml"));
        }
        catch (Exception e) {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15584);throw new Exception("Error while saving machine.xml (" + e.getMessage() + ")", e);
        }
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15585);try {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15586);savePackages(new File(configurationDirectory, "packages.xml"));
        }
        catch (Exception e) {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15587);throw new Exception("Error while saving packages.xml (" + e.getMessage() + ")", e);
        }
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15588);try {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15589);saveParts(new File(configurationDirectory, "parts.xml"));
        }
        catch (Exception e) {
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15590);throw new Exception("Error while saving parts.xml (" + e.getMessage() + ")", e);
        }
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public Package getPackage(String id) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15591);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15592);if ((((id == null)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15593)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15594)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15595);return null;
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15596);return packages.get(id.toUpperCase());
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public List<Package> getPackages() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15597);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15598);return Collections.unmodifiableList(new ArrayList<>(packages.values()));
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void addPackage(Package pkg) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15599);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15600);if ((((null == pkg.getId())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15601)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15602)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15603);throw new Error("Package with null Id cannot be added to Configuration.");
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15604);packages.put(pkg.getId().toUpperCase(), pkg);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15605);firePropertyChange("packages", null, packages);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void removePackage(Package pkg) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15606);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15607);packages.remove(pkg.getId());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15608);firePropertyChange("packages", null, packages);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public Part getPart(String id) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15609);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15610);if ((((id == null)&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15611)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15612)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15613);return null;
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15614);return parts.get(id.toUpperCase());
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public List<Part> getParts() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15615);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15616);return Collections.unmodifiableList(new ArrayList<>(parts.values()));
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void addPart(Part part) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15617);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15618);if ((((null == part.getId())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15619)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15620)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15621);throw new Error("Part with null Id cannot be added to Configuration.");
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15622);parts.put(part.getId().toUpperCase(), part);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15623);firePropertyChange("parts", null, parts);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void removePart(Part part) {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15624);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15625);parts.remove(part.getId());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15626);firePropertyChange("parts", null, parts);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public List<Board> getBoards() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15627);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15628);return Collections.unmodifiableList(new ArrayList<>(boards.values()));
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public Machine getMachine() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15629);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15630);return machine;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public Board getBoard(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15631);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15632);if ((((!file.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15633)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15634)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15635);Board board = new Board(file);
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15636);board.setName(file.getName());
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15637);Serializer serializer = createSerializer();
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15638);serializer.write(board, file);
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15639);file = file.getCanonicalFile();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15640);if ((((boards.containsKey(file))&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15641)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15642)==0&false))) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15643);return boards.get(file);
        }
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15644);Board board = loadBoard(file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15645);boards.put(file, board);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15646);firePropertyChange("boards", null, boards);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15647);return board;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private void loadMachine(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15648);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15649);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15650);MachineConfigurationHolder holder = serializer.read(MachineConfigurationHolder.class, file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15651);machine = holder.machine;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private void saveMachine(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15652);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15653);MachineConfigurationHolder holder = new MachineConfigurationHolder();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15654);holder.machine = machine;
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15655);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15656);serializer.write(holder, new ByteArrayOutputStream());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15657);serializer.write(holder, file);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private void loadPackages(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15658);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15659);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15660);PackagesConfigurationHolder holder =
                serializer.read(PackagesConfigurationHolder.class, file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15661);for (Package pkg : holder.packages) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15662);addPackage(pkg);
        }
    }}finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private void savePackages(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15663);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15664);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15665);PackagesConfigurationHolder holder = new PackagesConfigurationHolder();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15666);holder.packages = new ArrayList<>(packages.values());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15667);serializer.write(holder, new ByteArrayOutputStream());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15668);serializer.write(holder, file);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private void loadParts(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15669);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15670);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15671);PartsConfigurationHolder holder = serializer.read(PartsConfigurationHolder.class, file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15672);for (Part part : holder.parts) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15673);addPart(part);
        }
    }}finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private void saveParts(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15674);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15675);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15676);PartsConfigurationHolder holder = new PartsConfigurationHolder();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15677);holder.parts = new ArrayList<>(parts.values());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15678);serializer.write(holder, new ByteArrayOutputStream());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15679);serializer.write(holder, file);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public Job loadJob(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15680);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15681);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15682);Job job = serializer.read(Job.class, file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15683);job.setFile(file);

        // Once the Job is loaded we need to resolve any Boards that it
        // references.
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15684);for (BoardLocation boardLocation : job.getBoardLocations()) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15685);String boardFilename = boardLocation.getBoardFile();
            // First see if we can find the board at the given filename
            // If the filename is not absolute this will be relative
            // to the working directory
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15686);File boardFile = new File(boardFilename);
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15687);if ((((!boardFile.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15688)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15689)==0&false))) {{
                // If that fails, see if we can find it relative to the
                // directory the job was in
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15690);boardFile = new File(file.getParentFile(), boardFilename);
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15691);if ((((!boardFile.exists())&&(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15692)!=0|true))||(__CLR4_5_2bxhbxhlx1h8mx8.R.iget(15693)==0&false))) {{
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15694);throw new Exception("Board file not found: " + boardFilename);
            }
            }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15695);Board board = getBoard(boardFile);
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15696);boardLocation.setBoard(board);
        }

        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15697);job.setDirty(false);

        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15698);return job;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void saveJob(Job job, File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15699);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15700);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15701);Set<Board> boards = new HashSet<>();
        // Fix the paths to any boards in the Job
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15702);for (BoardLocation boardLocation : job.getBoardLocations()) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15703);Board board = boardLocation.getBoard();
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15704);boards.add(board);
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15705);try {
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15706);String relativePath = ResourceUtils.getRelativePath(
                        board.getFile().getAbsolutePath(), file.getAbsolutePath(), File.separator);
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15707);boardLocation.setBoardFile(relativePath);
            }
            catch (ResourceUtils.PathResolutionException ex) {
                __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15708);boardLocation.setBoardFile(board.getFile().getAbsolutePath());
            }
        }
        // Save any boards in the job
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15709);for (Board board : boards) {{
            __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15710);saveBoard(board);
        }
        // Save the job
        }__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15711);serializer.write(job, new ByteArrayOutputStream());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15712);serializer.write(job, file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15713);job.setFile(file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15714);job.setDirty(false);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public void saveBoard(Board board) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15715);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15716);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15717);serializer.write(board, new ByteArrayOutputStream());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15718);serializer.write(board, board.getFile());
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15719);board.setDirty(false);
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    private Board loadBoard(File file) throws Exception {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15720);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15721);Serializer serializer = createSerializer();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15722);Board board = serializer.read(Board.class, file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15723);board.setFile(file);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15724);board.setDirty(false);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15725);return board;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public static Serializer createSerializer() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15726);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15727);Style style = new HyphenStyle();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15728);Format format = new Format(style);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15729);AnnotationStrategy strategy = new AnnotationStrategy();
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15730);Serializer serializer = new Persister(strategy, format);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15731);return serializer;
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    public static String createId() {try{__CLR4_5_2bxhbxhlx1h8mx8.R.inc(15732);
        __CLR4_5_2bxhbxhlx1h8mx8.R.inc(15733);return UUID.randomUUID().toString();
    }finally{__CLR4_5_2bxhbxhlx1h8mx8.R.flushNeeded();}}

    /**
     * Used to provide a fixed root for the Machine when serializing.
     */
    @Root(name = "openpnp-machine")
    public static class MachineConfigurationHolder {
        @Element
        private Machine machine;
    }

    /**
     * Used to provide a fixed root for the Packages when serializing.
     */
    @Root(name = "openpnp-packages")
    public static class PackagesConfigurationHolder {
        @ElementList(inline = true, entry = "package", required = false)
        private ArrayList<Package> packages = new ArrayList<>();
    }

    /**
     * Used to provide a fixed root for the Parts when serializing.
     */
    @Root(name = "openpnp-parts")
    public static class PartsConfigurationHolder {
        @ElementList(inline = true, entry = "part", required = false)
        private ArrayList<Part> parts = new ArrayList<>();
    }
}
