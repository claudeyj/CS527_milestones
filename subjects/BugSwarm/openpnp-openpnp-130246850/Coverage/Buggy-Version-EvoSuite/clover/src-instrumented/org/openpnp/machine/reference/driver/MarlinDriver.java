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

package org.openpnp.machine.reference.driver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Action;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.machine.reference.driver.wizards.AbstractSerialPortDriverConfigurationWizard;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarlinDriver extends AbstractSerialPortDriver implements Runnable {public static class __CLR4_5_291y91ylx1h0bp4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,11923,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(MarlinDriver.class);
    private static final long minimumRequiredBuildNumber = 20140822;

    @Attribute(required = false)
    protected double feedRateMmPerMinute = 5000;

    @Element(required = false)
    protected String pickGcode = "M106 S255";

    @Element(required = false)
    protected String placeGcode = "M107";

    @Element(required = false)
    protected String actuatorOnGcode = "M8";

    @Element(required = false)
    protected String actuatorOffGcode = "M9";

    @Element(required = false)
    protected String enableGcode = "M17";

    @Element(required = false)
    protected String disableGcode = "M18";


    protected double x, y, z, c;
    private Thread readerThread;
    private boolean disconnectRequested;
    private Object commandLock = new Object();
    private boolean connected;
    private long connectedBuildNumber;
    private Queue<String> responseQueue = new ConcurrentLinkedQueue<>();

    public MarlinDriver() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11734);}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11735);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11736);if ((((actuator.getIndex() == 0)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11737)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11738)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11739);sendCommand((((on )&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11740)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11741)==0&false))? actuatorOnGcode : actuatorOffGcode);
            __CLR4_5_291y91ylx1h0bp4.R.inc(11742);dwell();
        }
    }}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}



    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11743);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11744);sendCommand("G28");
        __CLR4_5_291y91ylx1h0bp4.R.inc(11745);getCurrentPosition();
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11746);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11747);return new Location(LengthUnit.Millimeters, x, y, z, c).add(hm.getHeadOffsets());
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11748);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11749);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11750);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_291y91ylx1h0bp4.R.inc(11751);location = location.convertToUnits(LengthUnit.Millimeters);

        __CLR4_5_291y91ylx1h0bp4.R.inc(11752);double x = location.getX();
        __CLR4_5_291y91ylx1h0bp4.R.inc(11753);double y = location.getY();
        __CLR4_5_291y91ylx1h0bp4.R.inc(11754);double z = location.getZ();
        __CLR4_5_291y91ylx1h0bp4.R.inc(11755);double c = location.getRotation();

        __CLR4_5_291y91ylx1h0bp4.R.inc(11756);StringBuffer sb = new StringBuffer();
        __CLR4_5_291y91ylx1h0bp4.R.inc(11757);if ((((!Double.isNaN(x) && x != this.x)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11758)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11759)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11760);sb.append(String.format(Locale.US, "X%2.2f ", x));
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11761);if ((((!Double.isNaN(y) && y != this.y)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11762)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11763)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11764);sb.append(String.format(Locale.US, "Y%2.2f ", y));
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11765);if ((((!Double.isNaN(z) && z != this.z)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11766)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11767)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11768);sb.append(String.format(Locale.US, "Z%2.2f ", z));
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11769);if ((((!Double.isNaN(c) && c != this.c)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11770)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11771)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11772);sb.append(String.format(Locale.US, "E%2.2f ", c));
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11773);if ((((sb.length() > 0)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11774)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11775)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11776);sb.append(String.format(Locale.US, "F%2.2f", feedRateMmPerMinute));
            __CLR4_5_291y91ylx1h0bp4.R.inc(11777);sendCommand("G1 " + sb.toString());
            __CLR4_5_291y91ylx1h0bp4.R.inc(11778);dwell();
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11779);if ((((!Double.isNaN(x))&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11780)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11781)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11782);this.x = x;
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11783);if ((((!Double.isNaN(y))&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11784)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11785)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11786);this.y = y;
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11787);if ((((!Double.isNaN(z))&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11788)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11789)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11790);this.z = z;
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11791);if ((((!Double.isNaN(c))&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11792)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11793)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11794);this.c = c;
        }
    }}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11795);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11796);if ((((enabled && !connected)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11797)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11798)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11799);connect();
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11800);if ((((connected)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11801)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11802)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11803);sendCommand((((enabled )&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11804)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11805)==0&false))? enableGcode : disableGcode);
        }
    }}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11806);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11807);sendCommand(pickGcode);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11808);dwell();
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11809);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11810);sendCommand(placeGcode);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11811);dwell();
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    public synchronized void connect() throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11812);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11813);super.connect();

        /**
         * Connection process notes:
         * 
         * On some platforms, as soon as we open the serial port it will reset Grbl and we'll start
         * getting some data. On others, Grbl may already be running and we will get nothing on
         * connect.
         */

        __CLR4_5_291y91ylx1h0bp4.R.inc(11814);List<String> responses;
        __CLR4_5_291y91ylx1h0bp4.R.inc(11815);synchronized (commandLock) {
            // Start the reader thread with the commandLock held. This will
            // keep the thread from quickly parsing any responses messages
            // and notifying before we get a change to wait.
            __CLR4_5_291y91ylx1h0bp4.R.inc(11816);readerThread = new Thread(this);
            __CLR4_5_291y91ylx1h0bp4.R.inc(11817);readerThread.start();
            // Wait up to 3 seconds for Grbl to say Hi
            // If we get anything at this point it will have been the settings
            // dump that is sent after reset.
            __CLR4_5_291y91ylx1h0bp4.R.inc(11818);responses = sendCommand(null, 3000);
        }

        __CLR4_5_291y91ylx1h0bp4.R.inc(11819);processConnectionResponses(responses);

        __CLR4_5_291y91ylx1h0bp4.R.inc(11820);for (int i = 0; (((i < 5 && !connected)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11821)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11822)==0&false)); i++) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11823);responses = sendCommand("M115", 5000);
            __CLR4_5_291y91ylx1h0bp4.R.inc(11824);processConnectionResponses(responses);
        }

        }__CLR4_5_291y91ylx1h0bp4.R.inc(11825);if ((((!connected)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11826)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11827)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11828);throw new Exception(String.format(
                    "Unable to receive connection response from Grbl. Check your port and baud rate, and that you are running at least build %d of Grbl",
                    minimumRequiredBuildNumber));
        }

        // if (connectedBuildNumber < minimumRequiredBuildNumber) {
        // throw new Error(String.format("This driver requires Grbl build %d or higher. You are
        // running build %d", minimumRequiredBuildNumber, connectedBuildNumber));
        // }

        // We are connected to at least the minimum required version now
        // So perform some setup

        // Turn off the stepper drivers
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11829);setEnabled(false);

        __CLR4_5_291y91ylx1h0bp4.R.inc(11830);sendCommand("G21");
        __CLR4_5_291y91ylx1h0bp4.R.inc(11831);sendCommand("G90");
        __CLR4_5_291y91ylx1h0bp4.R.inc(11832);sendCommand("M82");
        __CLR4_5_291y91ylx1h0bp4.R.inc(11833);sendCommand("M84 S0");
        __CLR4_5_291y91ylx1h0bp4.R.inc(11834);getCurrentPosition();
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    protected void getCurrentPosition() throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11835);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11836);List<String> responses = sendCommand("M114");
        __CLR4_5_291y91ylx1h0bp4.R.inc(11837);for (String response : responses) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11838);if ((((response.startsWith("X:"))&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11839)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11840)==0&false))) {{
                __CLR4_5_291y91ylx1h0bp4.R.inc(11841);String[] comps = response.split(" ");
                __CLR4_5_291y91ylx1h0bp4.R.inc(11842);x = Double.parseDouble(comps[0].split(":")[1]);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11843);y = Double.parseDouble(comps[1].split(":")[1]);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11844);z = Double.parseDouble(comps[2].split(":")[1]);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11845);c = Double.parseDouble(comps[3].split(":")[1]);
            }
        }}
    }}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    private void processConnectionResponses(List<String> responses) {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11846);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11847);for (String response : responses) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11848);Matcher matcher = Pattern.compile(".*Marlin.*").matcher(response);
            __CLR4_5_291y91ylx1h0bp4.R.inc(11849);if ((((matcher.matches())&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11850)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11851)==0&false))) {{
                // String majorVersion = matcher.group(1);
                // String minorVersion = matcher.group(2);
                // String buildNumber = matcher.group(3);
                // connectedBuildNumber = Long.parseLong(buildNumber);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11852);connected = true;
                // logger.debug(String.format("Connected to Grbl Version %s.%s, build: %d",
                // majorVersion, minorVersion, connectedBuildNumber));
                __CLR4_5_291y91ylx1h0bp4.R.inc(11853);logger.debug(String.format("Connected to Marlin"));
            }
        }}
    }}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11854);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11855);disconnectRequested = true;
        __CLR4_5_291y91ylx1h0bp4.R.inc(11856);connected = false;

        __CLR4_5_291y91ylx1h0bp4.R.inc(11857);try {
            __CLR4_5_291y91ylx1h0bp4.R.inc(11858);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11859)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11860)==0&false))) {{
                __CLR4_5_291y91ylx1h0bp4.R.inc(11861);readerThread.join();
            }
        }}
        catch (Exception e) {
            __CLR4_5_291y91ylx1h0bp4.R.inc(11862);logger.error("disconnect()", e);
        }

        __CLR4_5_291y91ylx1h0bp4.R.inc(11863);try {
            __CLR4_5_291y91ylx1h0bp4.R.inc(11864);super.disconnect();
        }
        catch (Exception e) {
            __CLR4_5_291y91ylx1h0bp4.R.inc(11865);logger.error("disconnect()", e);
        }
        __CLR4_5_291y91ylx1h0bp4.R.inc(11866);disconnectRequested = false;
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    protected List<String> sendCommand(String command) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11867);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11868);return sendCommand(command, -1);
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    protected List<String> sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11869);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11870);synchronized (commandLock) {
            __CLR4_5_291y91ylx1h0bp4.R.inc(11871);if ((((command != null)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11872)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11873)==0&false))) {{
                __CLR4_5_291y91ylx1h0bp4.R.inc(11874);logger.debug("sendCommand({}, {})", command, timeout);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11875);logger.debug(">> " + command);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11876);output.write(command.getBytes());
                __CLR4_5_291y91ylx1h0bp4.R.inc(11877);output.write("\n".getBytes());
            }
            }__CLR4_5_291y91ylx1h0bp4.R.inc(11878);if ((((timeout == -1)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11879)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11880)==0&false))) {{
                __CLR4_5_291y91ylx1h0bp4.R.inc(11881);commandLock.wait();
            }
            }else {{
                __CLR4_5_291y91ylx1h0bp4.R.inc(11882);commandLock.wait(timeout);
            }
        }}
        __CLR4_5_291y91ylx1h0bp4.R.inc(11883);List<String> responses = drainResponseQueue();
        __CLR4_5_291y91ylx1h0bp4.R.inc(11884);return responses;
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    public void run() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11885);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11886);while ((((!disconnectRequested)&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11887)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11888)==0&false))) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11889);String line;
            __CLR4_5_291y91ylx1h0bp4.R.inc(11890);try {
                __CLR4_5_291y91ylx1h0bp4.R.inc(11891);line = readLine().trim();
            }
            catch (TimeoutException ex) {
                __CLR4_5_291y91ylx1h0bp4.R.inc(11892);continue;
            }
            catch (IOException e) {
                __CLR4_5_291y91ylx1h0bp4.R.inc(11893);logger.error("Read error", e);
                __CLR4_5_291y91ylx1h0bp4.R.inc(11894);return;
            }
            __CLR4_5_291y91ylx1h0bp4.R.inc(11895);line = line.trim();
            __CLR4_5_291y91ylx1h0bp4.R.inc(11896);logger.debug("<< " + line);
            __CLR4_5_291y91ylx1h0bp4.R.inc(11897);responseQueue.offer(line);
            __CLR4_5_291y91ylx1h0bp4.R.inc(11898);if ((((line.equals("ok") || line.startsWith("error: "))&&(__CLR4_5_291y91ylx1h0bp4.R.iget(11899)!=0|true))||(__CLR4_5_291y91ylx1h0bp4.R.iget(11900)==0&false))) {{
                // This is the end of processing for a command
                __CLR4_5_291y91ylx1h0bp4.R.inc(11901);synchronized (commandLock) {
                    __CLR4_5_291y91ylx1h0bp4.R.inc(11902);commandLock.notify();
                }
            }
        }}
    }}finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    /**
     * Causes Grbl to block until all commands are complete.
     * 
     * @throws Exception
     */
    protected void dwell() throws Exception {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11903);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11904);sendCommand("G4 P0");
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    private List<String> drainResponseQueue() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11905);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11906);List<String> responses = new ArrayList<>();
        __CLR4_5_291y91ylx1h0bp4.R.inc(11907);String response;
        __CLR4_5_291y91ylx1h0bp4.R.inc(11908);while ((response = responseQueue.poll()) != null) {{
            __CLR4_5_291y91ylx1h0bp4.R.inc(11911);responses.add(response);
        }
        }__CLR4_5_291y91ylx1h0bp4.R.inc(11912);return responses;
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11913);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11914);return new AbstractSerialPortDriverConfigurationWizard(this);
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11915);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11916);return getClass().getSimpleName();
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11917);
        // TODO Auto-generated method stub
        __CLR4_5_291y91ylx1h0bp4.R.inc(11918);return null;
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11919);
        // TODO Auto-generated method stub
        __CLR4_5_291y91ylx1h0bp4.R.inc(11920);return null;
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_291y91ylx1h0bp4.R.inc(11921);
        __CLR4_5_291y91ylx1h0bp4.R.inc(11922);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_291y91ylx1h0bp4.R.flushNeeded();}}
}
