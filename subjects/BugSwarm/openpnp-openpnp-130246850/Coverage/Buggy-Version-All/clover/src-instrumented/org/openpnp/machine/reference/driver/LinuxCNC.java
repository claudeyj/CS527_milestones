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
 *
 * Ami: Driver for LinuxCNC. Created 28/09/2012. Setup in machine.xml This is quick-n-dirty driver,
 * it works but lots of setup gui are not done. I'm relying on linuxCNC to do the hardware setup
 * (homing etc) and just when it's ready to run, then the OpenPNP can take over.
 */

/*
 * Below is a slightly edited E-mail from Ami on the OpenPNP mail list dated 27May2013 that
 * describes how to bring up the LinuxCNC driver:
 *
 * Step1: Run emc2 until it's configured well. Step2. Put emc2 in MDI mode (F5) (it won't respond to
 * external gcode if in jog mode) Step3: Run the remote shell (emcrsh)
 *
 * You're using ubuntu 10.04, so I guess it's the older version called emc2. The newer version is
 * called linuxcnc.
 *
 * Open a terminal window, You must go to the folder where you have the config of your cnc, for
 * example: /emc2/configs/mycnc/ There must be a file named emc.nml overthere.
 *
 * Then on the terminal window, type : emcrsh.
 *
 * This is the program that opens the port so we can control emc2 from a distance. (There is a way
 * to do this automatically, in mycnc.ini file but for starting up it's better to do it manually)
 *
 * Step4: in openpnp: on machine.xml you must have something like this:
 *
 * <driver class="org.openpnp.machine.reference.driver.LinuxCNC" server-ip="192.168.1.6"
 * port="5007"/>
 *
 * Port 5007 is the default used by linuxcnc. server-ip is the address of the machine where emc2 is
 * running. It doesn't have to be on the same machine where openpnp runs.
 *
 * Step5: Run openpnp, it should connect to the emc2, in emcrsh window it sould show :
 * "Connected to x"
 */

package org.openpnp.machine.reference.driver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceDriver;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.machine.reference.ReferencePasteDispenser;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO: Consider adding some type of heartbeat to the firmware.
 */
public class LinuxCNC implements ReferenceDriver, Runnable {public static class __CLR4_5_28w38w3lx1h37lz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,11734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(LinuxCNC.class);
    private static final double minimumRequiredVersion = 0.81;

    @Attribute(required = false)
    private String serverIp = "127.0.0.1";
    @Attribute(required = false)
    private int port = 502;
    @Attribute(required = false)
    private double feedRateMmPerMinute;

    private double x, y, z, c;
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Thread readerThread;
    private boolean disconnectRequested;
    private Object commandLock = new Object();
    private boolean connected;
    private double connectedVersion;
    private Queue<String> responseQueue = new ConcurrentLinkedQueue<>();
    private final static int CONNECT_TIMOUT = 5; // 5 second time-out for
                                                 // connection

    private static Scanner in;
    private static PrintWriter out;

    public LinuxCNC() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11523);}finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11524);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11525);sendCommand("set mdi G0 Z-20"); // SafeZ
        __CLR4_5_28w38w3lx1h37lz.R.inc(11526);sendCommand("set mdi G0 X0 Y0");
        __CLR4_5_28w38w3lx1h37lz.R.inc(11527);sendCommand("set mdi G1 F200 Z0");
        __CLR4_5_28w38w3lx1h37lz.R.inc(11528);x = y = z = c = 0;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}



    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11529);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11530);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_28w38w3lx1h37lz.R.inc(11531);location = location.convertToUnits(LengthUnit.Millimeters);

        __CLR4_5_28w38w3lx1h37lz.R.inc(11532);double x = location.getX();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11533);double y = location.getY();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11534);double z = location.getZ();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11535);double c = location.getRotation();

        __CLR4_5_28w38w3lx1h37lz.R.inc(11536);StringBuffer sb = new StringBuffer();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11537);if ((((!Double.isNaN(x) && x != this.x)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11538)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11539)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11540);sb.append(String.format(Locale.US, "X%2.2f ", x));
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11541);if ((((!Double.isNaN(y) && y != this.y)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11542)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11543)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11544);sb.append(String.format(Locale.US, "Y%2.2f ", y));
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11545);if ((((!Double.isNaN(z) && z != this.z)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11546)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11547)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11548);sb.append(String.format(Locale.US, "Z%2.2f ", z));
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11549);if ((((!Double.isNaN(c) && c != this.c)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11550)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11551)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11552);sb.append(String.format(Locale.US, "A%2.2f ", c));
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11553);if ((((sb.length() > 0)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11554)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11555)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11556);sb.append(String.format(Locale.US, "F%2.2f", feedRateMmPerMinute * speed));
            __CLR4_5_28w38w3lx1h37lz.R.inc(11557);sendCommand("set mdi G1 " + sb.toString());
            __CLR4_5_28w38w3lx1h37lz.R.inc(11558);dwell();
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11559);if ((((!Double.isNaN(x))&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11560)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11561)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11562);this.x = x;
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11563);if ((((!Double.isNaN(y))&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11564)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11565)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11566);this.y = y;
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11567);if ((((!Double.isNaN(z))&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11568)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11569)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11570);this.z = z;
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11571);if ((((!Double.isNaN(c))&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11572)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11573)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11574);this.c = c;
        }
    }}finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}



    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11575);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11576);return new Location(LengthUnit.Millimeters, x, y, z, c).add(hm.getHeadOffsets());
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}



    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11577);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11578);sendCommand("set mdi m3 s100");
        __CLR4_5_28w38w3lx1h37lz.R.inc(11579);dwell();
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}



    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11580);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11581);sendCommand("set mdi m5");
        __CLR4_5_28w38w3lx1h37lz.R.inc(11582);dwell();
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}



    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11583);
        // if (index == 0) {
        // sendCommand(on ? "M8" : "M9");
        // dwell();
        // }
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}



    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11584);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11585);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11586);if ((((enabled && !connected)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11587)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11588)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11589);connect(serverIp, port);
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11590);if ((((connected)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11591)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11592)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11593);sendCommand("set machine " + ((((enabled )&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11594)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11595)==0&false))? "on" : "off"));
        }
    }}finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    public synchronized void connect(String serverIp, int port) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11596);
        // disconnect();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11597);logger.debug("connect({}, {})", serverIp, port);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11598);SocketAddress sa = new InetSocketAddress(serverIp, port);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11599);socket = new Socket();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11600);socket.connect(sa, CONNECT_TIMOUT * 1000);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11601);input = socket.getInputStream();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11602);output = socket.getOutputStream();

        __CLR4_5_28w38w3lx1h37lz.R.inc(11603);List<String> responses;
        __CLR4_5_28w38w3lx1h37lz.R.inc(11604);synchronized (commandLock) {
            // Start the reader thread with the commandLock held. This will
            // keep the thread from quickly parsing any responses messages
            // and notifying before we get a change to wait.
            __CLR4_5_28w38w3lx1h37lz.R.inc(11605);readerThread = new Thread(this);
            __CLR4_5_28w38w3lx1h37lz.R.inc(11606);readerThread.start();
            // Wait up to 3 seconds for Grbl to say Hi
            // If we get anything at this point it will have been the settings
            // dump that is sent after reset.
            // responses = sendCommand(null, 3000);
        }
        __CLR4_5_28w38w3lx1h37lz.R.inc(11607);connected = true;

        __CLR4_5_28w38w3lx1h37lz.R.inc(11608);responses = sendCommand("hello EMC x 1.1");
        __CLR4_5_28w38w3lx1h37lz.R.inc(11609);responses.addAll(sendCommand("set enable EMCTOO"));

        __CLR4_5_28w38w3lx1h37lz.R.inc(11610);responses.addAll(sendCommand("set estop off"));
        __CLR4_5_28w38w3lx1h37lz.R.inc(11611);responses.addAll(sendCommand("set mode mdi"));

        // set_wait done -- will respond after the commanded move is completed
        // The default behavior is to respond when received which causes
        // OpenPnP to spit out gcode full-bore.
        __CLR4_5_28w38w3lx1h37lz.R.inc(11612);responses.addAll(sendCommand("set set_wait done"));
        __CLR4_5_28w38w3lx1h37lz.R.inc(11613);responses.addAll(sendCommand("set echo off"));
        // verbose on -- all commands will be replied with ACK or NAK
        // This will be used later to determine the return status.
        __CLR4_5_28w38w3lx1h37lz.R.inc(11614);responses.addAll(sendCommand("set verbose on"));

        __CLR4_5_28w38w3lx1h37lz.R.inc(11615);processConnectionResponses(responses);

        __CLR4_5_28w38w3lx1h37lz.R.inc(11616);if ((((!connected)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11617)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11618)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11619);throw new Exception(
                    "Unable to receive connection response from LinuxCNC ver 1.1. Check your server ip and port in machine.xml");
        }

        }__CLR4_5_28w38w3lx1h37lz.R.inc(11620);if ((((!connected)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11621)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11622)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11623);throw new Exception(String.format(
                    "Unable to receive connection response from LinuxCNC. Check your server ip and port in machine.xml and that you are running at least version %f of LinuxCNCrsh",
                    minimumRequiredVersion));
        }

        }__CLR4_5_28w38w3lx1h37lz.R.inc(11624);if ((((connectedVersion < minimumRequiredVersion)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11625)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11626)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11627);throw new Exception(String.format(
                    "This driver requires LinuxCNCrsh version %.2f or higher. You are running version %.2f",
                    minimumRequiredVersion, connectedVersion));
        }

        // We are connected to at least the minimum required version now
        // So perform some setup

        // Turn off the stepper drivers
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11628);setEnabled(false);

        // Force into miillmeter mode:
        __CLR4_5_28w38w3lx1h37lz.R.inc(11629);sendCommand("set mdi G21");

        // Reset all axes to 0, in case the firmware was not reset on
        // connect.
        __CLR4_5_28w38w3lx1h37lz.R.inc(11630);sendCommand("set mdi G92 X0 Y0 Z0 A0");
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    private void processConnectionResponses(List<String> responses) {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11631);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11632);for (String response : responses) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11633);if ((((response.startsWith("HELLO ACK EMCNETSVR 1.1"))&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11634)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11635)==0&false))) {{

                __CLR4_5_28w38w3lx1h37lz.R.inc(11636);connectedVersion = 1.1;
                __CLR4_5_28w38w3lx1h37lz.R.inc(11637);connected = true;
                __CLR4_5_28w38w3lx1h37lz.R.inc(11638);logger.debug(
                        String.format("Connected to LinuxCNCrsh Version: %.2f", connectedVersion));
            }
        }}
    }}finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11639);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11640);disconnectRequested = true;
        __CLR4_5_28w38w3lx1h37lz.R.inc(11641);connected = false;

        __CLR4_5_28w38w3lx1h37lz.R.inc(11642);try {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11643);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11644)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11645)==0&false))) {{
                __CLR4_5_28w38w3lx1h37lz.R.inc(11646);readerThread.join();
            }
            }__CLR4_5_28w38w3lx1h37lz.R.inc(11647);input.close();
            __CLR4_5_28w38w3lx1h37lz.R.inc(11648);output.close();

            __CLR4_5_28w38w3lx1h37lz.R.inc(11649);socket.close();
        }
        catch (Exception e) {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11650);logger.error("disconnect()", e);
        }

        __CLR4_5_28w38w3lx1h37lz.R.inc(11651);disconnectRequested = false;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    private List<String> sendCommand(String command) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11652);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11653);return sendCommand(command, -1);
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    private List<String> sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11654);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11655);synchronized (commandLock) {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11656);if ((((command != null)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11657)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11658)==0&false))) {{
                __CLR4_5_28w38w3lx1h37lz.R.inc(11659);logger.debug("sendCommand({}, {})", command, timeout);
                __CLR4_5_28w38w3lx1h37lz.R.inc(11660);output.write(command.getBytes());
                __CLR4_5_28w38w3lx1h37lz.R.inc(11661);output.write("\r\n".getBytes());

            }
            }__CLR4_5_28w38w3lx1h37lz.R.inc(11662);if ((((timeout == -1)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11663)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11664)==0&false))) {{
                __CLR4_5_28w38w3lx1h37lz.R.inc(11665);commandLock.wait();
            }
            }else {{
                __CLR4_5_28w38w3lx1h37lz.R.inc(11666);commandLock.wait(timeout);
            }
        }}
        __CLR4_5_28w38w3lx1h37lz.R.inc(11667);List<String> responses = drainResponseQueue();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11668);return responses;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    public void run() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11669);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11670);while ((((!disconnectRequested)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11671)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11672)==0&false))) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11673);String line = readLine().trim();
            __CLR4_5_28w38w3lx1h37lz.R.inc(11674);logger.debug(line);
            __CLR4_5_28w38w3lx1h37lz.R.inc(11675);responseQueue.offer(line);
            __CLR4_5_28w38w3lx1h37lz.R.inc(11676);synchronized (commandLock) {
                __CLR4_5_28w38w3lx1h37lz.R.inc(11677);commandLock.notify();

            }
        }
    }}finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    /**
     * Causes Grbl to block until all commands are complete.
     * 
     * @throws Exception
     */
    private void dwell() throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11678);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11679);sendCommand("set mdi G4 P0");
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    private List<String> drainResponseQueue() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11680);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11681);List<String> responses = new ArrayList<>();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11682);String response;
        __CLR4_5_28w38w3lx1h37lz.R.inc(11683);while ((response = responseQueue.poll()) != null) {{
            __CLR4_5_28w38w3lx1h37lz.R.inc(11686);responses.add(response);
        }
        }__CLR4_5_28w38w3lx1h37lz.R.inc(11687);return responses;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    private String readLine() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11688);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11689);StringBuffer line = new StringBuffer();
        __CLR4_5_28w38w3lx1h37lz.R.inc(11690);try {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11691);while (true) {{
                __CLR4_5_28w38w3lx1h37lz.R.inc(11692);int ch = readChar();
                __CLR4_5_28w38w3lx1h37lz.R.inc(11693);if ((((ch == -1)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11694)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11695)==0&false))) {{
                    __CLR4_5_28w38w3lx1h37lz.R.inc(11696);return null;
                }
                }else {__CLR4_5_28w38w3lx1h37lz.R.inc(11697);if ((((ch == '\n' || ch == '\r')&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11698)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11699)==0&false))) {{
                    __CLR4_5_28w38w3lx1h37lz.R.inc(11700);if ((((line.length() > 0)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11701)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11702)==0&false))) {{
                        __CLR4_5_28w38w3lx1h37lz.R.inc(11703);return line.toString();
                    }
                }}
                }else {{
                    __CLR4_5_28w38w3lx1h37lz.R.inc(11704);line.append((char) ch);
                }
            }}}
        }}
        catch (Exception e) {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11705);logger.error("readLine()", e);
        }
        __CLR4_5_28w38w3lx1h37lz.R.inc(11706);return null;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    private int readChar() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11707);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11708);try {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11709);int ch = -1;
            __CLR4_5_28w38w3lx1h37lz.R.inc(11710);while ((((ch == -1 && !disconnectRequested)&&(__CLR4_5_28w38w3lx1h37lz.R.iget(11711)!=0|true))||(__CLR4_5_28w38w3lx1h37lz.R.iget(11712)==0&false))) {{
                __CLR4_5_28w38w3lx1h37lz.R.inc(11713);ch = input.read();
            }
            }__CLR4_5_28w38w3lx1h37lz.R.inc(11714);return ch;
        }
        catch (Exception e) {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11715);logger.error("readChar()", e);
            __CLR4_5_28w38w3lx1h37lz.R.inc(11716);return -1;
        }
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11717);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11718);try {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11719);disconnect();
        }
        catch (Exception e) {
            __CLR4_5_28w38w3lx1h37lz.R.inc(11720);throw new IOException(e);
        }
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11721);
        // TODO Auto-generated method stub
        __CLR4_5_28w38w3lx1h37lz.R.inc(11722);return null;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11723);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11724);return getClass().getSimpleName();
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11725);
        // TODO Auto-generated method stub
        __CLR4_5_28w38w3lx1h37lz.R.inc(11726);return null;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11727);
        __CLR4_5_28w38w3lx1h37lz.R.inc(11728);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11729);
        // TODO Auto-generated method stub
        __CLR4_5_28w38w3lx1h37lz.R.inc(11730);return null;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11731);
        // TODO Auto-generated method stub
        __CLR4_5_28w38w3lx1h37lz.R.inc(11732);return null;
    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}

    @Override
    public void dispense(ReferencePasteDispenser dispenser, Location startLocation,
            Location endLocation, long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_28w38w3lx1h37lz.R.inc(11733);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_28w38w3lx1h37lz.R.flushNeeded();}}
}
