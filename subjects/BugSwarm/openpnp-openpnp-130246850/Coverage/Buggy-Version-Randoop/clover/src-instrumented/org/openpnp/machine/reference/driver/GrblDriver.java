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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO: Consider adding some type of heartbeat to the firmware.
 */
public class GrblDriver extends AbstractSerialPortDriver implements Runnable {public static class __CLR4_5_28r08r0lx1h1v6o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,11523,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(GrblDriver.class);
    private static final long minimumRequiredBuildNumber = 20140822;

    @Attribute(required = false)
    private double feedRateMmPerMinute = 5000;


    private double x, y, z, c;
    private Thread readerThread;
    private boolean disconnectRequested;
    private Object commandLock = new Object();
    private boolean connected;
    private long connectedBuildNumber;
    private Queue<String> responseQueue = new ConcurrentLinkedQueue<>();

    public GrblDriver() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11340);}finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11341);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11342);if ((((actuator.getIndex() == 0)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11343)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11344)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11345);sendCommand((((on )&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11346)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11347)==0&false))? "M8" : "M9");
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11348);dwell();
        }
    }}finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}



    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11349);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11350);sendCommand("G28");
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11351);x = y = z = c = 0;
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11352);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11353);return new Location(LengthUnit.Millimeters, x, y, z, c).add(hm.getHeadOffsets());
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11354);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11355);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11356);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11357);location = location.convertToUnits(LengthUnit.Millimeters);

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11358);double x = location.getX();
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11359);double y = location.getY();
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11360);double z = location.getZ();
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11361);double c = location.getRotation();

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11362);StringBuffer sb = new StringBuffer();
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11363);if ((((!Double.isNaN(x) && x != this.x)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11364)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11365)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11366);sb.append(String.format(Locale.US, "X%2.2f ", x));
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11367);if ((((!Double.isNaN(y) && y != this.y)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11368)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11369)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11370);sb.append(String.format(Locale.US, "Y%2.2f ", y));
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11371);if ((((!Double.isNaN(z) && z != this.z)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11372)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11373)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11374);sb.append(String.format(Locale.US, "Z%2.2f ", z));
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11375);if ((((!Double.isNaN(c) && c != this.c)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11376)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11377)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11378);sb.append(String.format(Locale.US, "C%2.2f ", c));
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11379);if ((((sb.length() > 0)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11380)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11381)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11382);sb.append(String.format(Locale.US, "F%2.2f", feedRateMmPerMinute));
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11383);sendCommand("G1 " + sb.toString());
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11384);dwell();
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11385);if ((((!Double.isNaN(x))&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11386)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11387)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11388);this.x = x;
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11389);if ((((!Double.isNaN(y))&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11390)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11391)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11392);this.y = y;
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11393);if ((((!Double.isNaN(z))&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11394)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11395)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11396);this.z = z;
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11397);if ((((!Double.isNaN(c))&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11398)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11399)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11400);this.c = c;
        }
    }}finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11401);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11402);if ((((enabled && !connected)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11403)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11404)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11405);connect();
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11406);if ((((connected)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11407)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11408)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11409);if ((((enabled)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11410)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11411)==0&false))) {{
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11412);sendCommand("$X");
            }
        }}
    }}finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11413);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11414);sendCommand("M4");
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11415);dwell();
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11416);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11417);sendCommand("M5");
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11418);dwell();
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    public synchronized void connect() throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11419);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11420);super.connect();

        /**
         * Connection process notes:
         * 
         * On some platforms, as soon as we open the serial port it will reset Grbl and we'll start
         * getting some data. On others, Grbl may already be running and we will get nothing on
         * connect.
         */

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11421);List<String> responses;
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11422);synchronized (commandLock) {
            // Start the reader thread with the commandLock held. This will
            // keep the thread from quickly parsing any responses messages
            // and notifying before we get a change to wait.
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11423);readerThread = new Thread(this);
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11424);readerThread.start();
            // Wait up to 3 seconds for Grbl to say Hi
            // If we get anything at this point it will have been the settings
            // dump that is sent after reset.
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11425);responses = sendCommand(null, 3000);
        }

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11426);processConnectionResponses(responses);

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11427);for (int i = 0; (((i < 5 && !connected)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11428)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11429)==0&false)); i++) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11430);responses = sendCommand("$I", 5000);
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11431);processConnectionResponses(responses);
        }

        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11432);if ((((!connected)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11433)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11434)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11435);throw new Exception(String.format(
                    "Unable to receive connection response from Grbl. Check your port and baud rate, and that you are running at least build %d of Grbl",
                    minimumRequiredBuildNumber));
        }

        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11436);if ((((connectedBuildNumber < minimumRequiredBuildNumber)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11437)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11438)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11439);throw new Exception(String.format(
                    "This driver requires Grbl build %d or higher. You are running build %d",
                    minimumRequiredBuildNumber, connectedBuildNumber));
        }

        // We are connected to at least the minimum required version now
        // So perform some setup

        // Turn off the stepper drivers
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11440);setEnabled(false);

        // Reset all axes to 0, in case the firmware was not reset on
        // connect.
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11441);sendCommand("G92 X0 Y0 Z0 C0");
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    private void processConnectionResponses(List<String> responses) {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11442);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11443);for (String response : responses) {{
            // Expect something like: [0.9g.20140905:]
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11444);Matcher matcher =
                    Pattern.compile("\\[(\\w*)\\.(\\w*)\\.(\\d{8})\\:\\]").matcher(response);
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11445);if ((((matcher.matches())&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11446)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11447)==0&false))) {{
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11448);String majorVersion = matcher.group(1);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11449);String minorVersion = matcher.group(2);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11450);String buildNumber = matcher.group(3);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11451);connectedBuildNumber = Long.parseLong(buildNumber);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11452);connected = true;
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11453);logger.debug(String.format("Connected to Grbl Version %s.%s, build: %d",
                        majorVersion, minorVersion, connectedBuildNumber));
            }
        }}
    }}finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11454);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11455);disconnectRequested = true;
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11456);connected = false;

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11457);try {
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11458);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11459)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11460)==0&false))) {{
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11461);readerThread.join();
            }
        }}
        catch (Exception e) {
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11462);logger.error("disconnect()", e);
        }

        __CLR4_5_28r08r0lx1h1v6o.R.inc(11463);try {
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11464);super.disconnect();
        }
        catch (Exception e) {
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11465);logger.error("disconnect()", e);
        }
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11466);disconnectRequested = false;
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    private List<String> sendCommand(String command) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11467);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11468);return sendCommand(command, -1);
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    private List<String> sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11469);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11470);synchronized (commandLock) {
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11471);if ((((command != null)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11472)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11473)==0&false))) {{
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11474);logger.debug("sendCommand({}, {})", command, timeout);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11475);logger.debug(">> " + command);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11476);output.write(command.getBytes());
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11477);output.write("\n".getBytes());
            }
            }__CLR4_5_28r08r0lx1h1v6o.R.inc(11478);if ((((timeout == -1)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11479)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11480)==0&false))) {{
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11481);commandLock.wait();
            }
            }else {{
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11482);commandLock.wait(timeout);
            }
        }}
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11483);List<String> responses = drainResponseQueue();
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11484);return responses;
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    public void run() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11485);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11486);while ((((!disconnectRequested)&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11487)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11488)==0&false))) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11489);String line;
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11490);try {
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11491);line = readLine().trim();
            }
            catch (TimeoutException ex) {
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11492);continue;
            }
            catch (IOException e) {
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11493);logger.error("Read error", e);
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11494);return;
            }
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11495);line = line.trim();
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11496);logger.debug("<< " + line);
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11497);responseQueue.offer(line);
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11498);if ((((line.equals("ok") || line.startsWith("error: "))&&(__CLR4_5_28r08r0lx1h1v6o.R.iget(11499)!=0|true))||(__CLR4_5_28r08r0lx1h1v6o.R.iget(11500)==0&false))) {{
                // This is the end of processing for a command
                __CLR4_5_28r08r0lx1h1v6o.R.inc(11501);synchronized (commandLock) {
                    __CLR4_5_28r08r0lx1h1v6o.R.inc(11502);commandLock.notify();
                }
            }
        }}
    }}finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    /**
     * Causes Grbl to block until all commands are complete.
     * 
     * @throws Exception
     */
    private void dwell() throws Exception {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11503);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11504);sendCommand("G4 P0");
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    private List<String> drainResponseQueue() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11505);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11506);List<String> responses = new ArrayList<>();
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11507);String response;
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11508);while ((response = responseQueue.poll()) != null) {{
            __CLR4_5_28r08r0lx1h1v6o.R.inc(11511);responses.add(response);
        }
        }__CLR4_5_28r08r0lx1h1v6o.R.inc(11512);return responses;
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11513);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11514);return new AbstractSerialPortDriverConfigurationWizard(this);
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11515);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11516);return getClass().getSimpleName();
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11517);
        // TODO Auto-generated method stub
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11518);return null;
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11519);
        // TODO Auto-generated method stub
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11520);return null;
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_28r08r0lx1h1v6o.R.inc(11521);
        __CLR4_5_28r08r0lx1h1v6o.R.inc(11522);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_28r08r0lx1h1v6o.R.flushNeeded();}}
}
