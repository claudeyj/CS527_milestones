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

// Implemented Codes
// -------------------
// G0 -> G1
// G1 - Coordinated Movement X Y Z E
// G2 - CW ARC
// G3 - CCW ARC
// G4 - Dwell S<seconds> or P<milliseconds>
// G28 - Home all Axis
// G90 - Use Absolute Coordinates
// G91 - Use Relative Coordinates
// G92 - Set current position to cordinates given

// RepRap M Codes
// M104 - Set extruder target temp
// M105 - Read current temp
// M106 - Fan on
// M107 - Fan off
// M109 - Wait for extruder current temp to reach target temp.
// M114 - Display current position

// Custom M Codes
// M20 - List SD card
// M21 - Init SD card
// M22 - Release SD card
// M23 - Select SD file (M23 filename.g)
// M24 - Start/resume SD print
// M25 - Pause SD print
// M26 - Set SD position in bytes (M26 S12345)
// M27 - Report SD print status
// M28 - Start SD write (M28 filename.g)
// M29 - Stop SD write
// - <filename> - Delete file on sd card
// M42 - Set output on free pins, on a non pwm pin (over pin 13 on an arduino mega) use S255 to turn
// it on and S0 to turn it off. Use P to decide the pin (M42 P23 S255) would turn pin 23 on
// M80 - Turn on Power Supply
// M81 - Turn off Power Supply
// M82 - Set E codes absolute (default)
// M83 - Set E codes relative while in Absolute Coordinates (G90) mode
// M84 - Disable steppers until next move,
// or use S<seconds> to specify an inactivity timeout, after which the steppers will be disabled. S0
// to disable the timeout.
// M85 - Set inactivity shutdown timer with parameter S<seconds>. To disable set zero (default)
// M92 - Set axis_steps_per_unit - same syntax as G92
// M93 - Send axis_steps_per_unit
// M115 - Capabilities string
// M119 - Show Endstopper State
// M140 - Set bed target temp
// M190 - Wait for bed current temp to reach target temp.
// M201 - Set maximum acceleration in units/s^2 for print moves (M201 X1000 Y1000)
// M202 - Set maximum feedrate that your machine can sustain (M203 X200 Y200 Z300 E10000) in mm/sec
// M203 - Set temperture monitor to Sx
// M204 - Set default acceleration: S normal moves T filament only moves (M204 S3000 T7000) in
// mm/sec^2
// M205 - advanced settings: minimum travel speed S=while printing T=travel only, X=maximum xy jerk,
// Z=maximum Z jerk
// M206 - set additional homing offset

// M220 - set speed factor override percentage S=factor in percent
// M221 - set extruder multiply factor S100 --> original Extrude Speed

// M301 - Set PID parameters P I and D
// M303 - PID relay autotune S<temperature> sets the target temperature. (default target temperature
// = 150C)

// M400 - Finish all moves

// M500 - stores paramters in EEPROM
// M501 - reads parameters from EEPROM (if you need to reset them after you changed them
// temporarily).
// M502 - reverts to the default "factory settings". You still need to store them in EEPROM
// afterwards if you want to.
// M503 - Print settings

// Debug feature / Testing the PID for Hotend
// M601 - Show Temp jitter from Extruder (min / max value from Hotend Temperature while printing)
// M602 - Reset Temp jitter from Extruder (min / max val) --> Don't use it while Printing
// M603 - Show Free Ram

public class SprinterDriver extends AbstractSerialPortDriver implements Runnable {public static class __CLR4_5_29f59f5lx1h8ld9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,12403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * @Attribute(required=false) private int vacpumpPin;
     * 
     * @Attribute(required=false) private boolean invertVacpump;
     * 
     */
    private static final Logger logger = LoggerFactory.getLogger(SprinterDriver.class);
    // private static final double minimumRequiredVersion = 0.75;

    @Attribute(required = false)
    private int vacuumPin = 31;

    @Attribute(required = false)
    private boolean invertVacuum;

    @Attribute(required = false)
    private int actuatorPin = 33;

    @Attribute(required = false)
    private boolean invertActuator;

    @Attribute(required = false)
    private boolean homeX;

    @Attribute(required = false)
    private boolean homeY;

    @Attribute(required = false)
    private boolean homeZ;

    @Attribute(required = false)
    private boolean homeC;

    @Attribute(required = false)
    private double feedRateMmPerMinute = 5000;

    private double x, y, z, c;
    private Thread readerThread;
    private boolean disconnectRequested;
    private Object commandLock = new Object();
    private boolean connected;
    // private double connectedVersion;
    private Queue<String> responseQueue = new ConcurrentLinkedQueue<>();

    public SprinterDriver() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12209);}finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12210);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12211);if ((((homeX || homeY || homeZ || homeC)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12212)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12213)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12214);sendCommand(String.format("G28 %s %s %s %s", (((homeX )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12215)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12216)==0&false))? "X" : "", (((homeY )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12217)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12218)==0&false))? "Y" : "",
                    (((homeZ )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12219)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12220)==0&false))? "Z" : "", (((homeC )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12221)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12222)==0&false))? "E" : ""));
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12223);dwell();
        }
        }else {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12224);throw new Exception(
                    "No homing axes defined. See the homeX, homeY, homeZ and homeC parameters.");
        }
        // Reset all axes to 0. This is required so that the Head and Driver
        // stay in sync.
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12225);sendCommand("G92 X0 Y0 Z0 E0");
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12226);x = y = z = c = 0;
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12227);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12228);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12229);location = location.convertToUnits(LengthUnit.Millimeters);

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12230);double x = location.getX();
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12231);double y = location.getY();
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12232);double z = location.getZ();
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12233);double c = location.getRotation();

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12234);StringBuffer sb = new StringBuffer();
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12235);if ((((!Double.isNaN(x) && x != this.x)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12236)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12237)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12238);sb.append(String.format(Locale.US, "X%2.4f ", x));
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12239);if ((((!Double.isNaN(y) && y != this.y)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12240)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12241)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12242);sb.append(String.format(Locale.US, "Y%2.4f ", y));
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12243);if ((((!Double.isNaN(z) && z != this.z)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12244)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12245)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12246);sb.append(String.format(Locale.US, "Z%2.4f ", z));
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12247);if ((((!Double.isNaN(c) && c != this.c)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12248)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12249)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12250);sb.append(String.format(Locale.US, "E%2.4f ", c));
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12251);if ((((sb.length() > 0)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12252)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12253)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12254);sb.append(String.format(Locale.US, "F%2.4f ", feedRateMmPerMinute * speed));
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12255);sendCommand("G1" + sb.toString());
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12256);dwell();
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12257);if ((((!Double.isNaN(x))&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12258)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12259)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12260);this.x = x;
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12261);if ((((!Double.isNaN(y))&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12262)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12263)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12264);this.y = y;
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12265);if ((((!Double.isNaN(z))&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12266)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12267)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12268);this.z = z;
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12269);if ((((!Double.isNaN(c))&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12270)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12271)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12272);this.c = c;
        }
    }}finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12273);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12274);return new Location(LengthUnit.Millimeters, x, y, z, c).add(hm.getHeadOffsets());
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12275);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12276);sendCommand(String.format("M42 P%d S%d", vacuumPin, (((invertVacuum )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12277)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12278)==0&false))? 0 : 255));
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12279);dwell();
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12280);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12281);sendCommand(String.format("M42 P%d S%d", vacuumPin, (((invertVacuum )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12282)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12283)==0&false))? 255 : 0));
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12284);dwell();
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12285);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12286);if ((((actuator == null || actuator.getIndex() == 0)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12287)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12288)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12289);sendCommand(String.format("M42 P%d S%d", actuatorPin, (((on ^ invertActuator )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12290)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12291)==0&false))? 255 : 0));
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12292);dwell();
        }
    }}finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12293);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12294);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12295);if ((((enabled && !connected)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12296)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12297)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12298);connect();
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12299);if ((((connected)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12300)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12301)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12302);sendCommand(String.format("M84 %s", (((enabled )&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12303)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12304)==0&false))? "T" : ""));
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12305);place(null);
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12306);actuate(null, false);
        }
    }}finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    public synchronized void connect() throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12307);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12308);super.connect();

        /**
         * Connection process notes:
         * 
         * On some platforms, as soon as we open the serial port it will reset Sprinter and we'll
         * start getting some data. On others, Sprinter may already be running and we will get
         * nothing on connect.
         */

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12309);List<String> responses;
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12310);synchronized (commandLock) {
            // Start the reader thread with the commandLock held. This will
            // keep the thread from quickly parsing any responses messages
            // and notifying before we get a chance to wait.
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12311);readerThread = new Thread(this);
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12312);readerThread.start();
            // Wait up to 3 seconds for Sprinter to say Hi
            // If we get anything at this point it will have been the settings
            // dump that is sent after reset.
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12313);responses = sendCommand(null, 3000);
        }

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12314);processConnectionResponses(responses);

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12315);for (int i = 0; (((i < 5 && !connected)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12316)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12317)==0&false)); i++) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12318);responses = sendCommand("M115", 5000);
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12319);processConnectionResponses(responses);
        }

        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12320);if ((((!connected)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12321)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12322)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12323);throw new Exception(
                    // String.format("Unable to receive connection response from Sprinter. Check
                    // your port and baud rate, and that you are running at least version %f of
                    // Sprinter",
                    // minimumRequiredVersion));
                    String.format(
                            "Unable to receive connection response from Sprinter. Check your port and baud rate, and that you are running the latest version of Sprinter."));
        }

        // TODO: Version Info
        // if (connectedVersion < minimumRequiredVersion) {
        // throw new Error(String.format("This driver requires Sprinter version %.2f or higher. You
        // are running version %.2f", minimumRequiredVersion, connectedVersion));
        // }

        // We are connected to at least the minimum required version now
        // So perform some setup

        // Turn off the stepper drivers
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12324);setEnabled(false);

        // Reset all axes to 0, in case the firmware was not reset on
        // connect.
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12325);sendCommand("G92 X0 Y0 Z0 E0");
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    private void processConnectionResponses(List<String> responses) {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12326);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12327);for (String response : responses) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12328);if ((((response.startsWith("FIRMWARE_NAME:") || response.equals("Sprinter"))&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12329)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12330)==0&false))) {{
                // String[] versionComponents = response.split(" ");
                // connectedVersion = Double.parseDouble(versionComponents[2]);
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12331);connected = true;
                // logger.debug(String.format("Connected to Sprinter Version: %.2f",
                // connectedVersion));
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12332);logger.debug(String.format("Connected to Sprinter."));
            }
        }}
    }}finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12333);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12334);disconnectRequested = true;
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12335);connected = false;

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12336);try {
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12337);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12338)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12339)==0&false))) {{
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12340);readerThread.join();
            }
        }}
        catch (Exception e) {
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12341);logger.error("disconnect()", e);
        }

        __CLR4_5_29f59f5lx1h8ld9.R.inc(12342);try {
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12343);super.disconnect();
        }
        catch (Exception e) {
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12344);logger.error("disconnect()", e);
        }
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12345);disconnectRequested = false;
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    protected List<String> sendCommand(String command) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12346);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12347);return sendCommand(command, -1);
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    private List<String> sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12348);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12349);synchronized (commandLock) {
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12350);if ((((command != null)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12351)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12352)==0&false))) {{
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12353);logger.debug("> " + command);
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12354);output.write(command.getBytes());
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12355);output.write("\n".getBytes());
            }
            }__CLR4_5_29f59f5lx1h8ld9.R.inc(12356);long t = System.currentTimeMillis();
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12357);if ((((timeout == -1)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12358)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12359)==0&false))) {{
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12360);commandLock.wait();
            }
            }else {{
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12361);commandLock.wait(timeout);
            }
            }__CLR4_5_29f59f5lx1h8ld9.R.inc(12362);logger.debug("Waited {} ms for command to return.", (System.currentTimeMillis() - t));
        }
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12363);List<String> responses = drainResponseQueue();
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12364);return responses;
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    public void run() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12365);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12366);while ((((!disconnectRequested)&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12367)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12368)==0&false))) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12369);String line;
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12370);try {
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12371);line = readLine().trim();
            }
            catch (TimeoutException ex) {
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12372);continue;
            }
            catch (IOException e) {
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12373);logger.error("Read error", e);
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12374);return;
            }
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12375);line = line.trim();
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12376);logger.debug("< " + line);
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12377);responseQueue.offer(line);
            // We have a special case of accepting "start" when we are not
            // connected because Sprinter does not send an "ok" when it starts
            // up.
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12378);if ((((line.equals("ok") || line.startsWith("error: ")
                    || (!connected && line.equals("start")))&&(__CLR4_5_29f59f5lx1h8ld9.R.iget(12379)!=0|true))||(__CLR4_5_29f59f5lx1h8ld9.R.iget(12380)==0&false))) {{
                // This is the end of processing for a command
                __CLR4_5_29f59f5lx1h8ld9.R.inc(12381);synchronized (commandLock) {
                    __CLR4_5_29f59f5lx1h8ld9.R.inc(12382);commandLock.notify();
                }
            }
        }}
    }}finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    /**
     * Causes Sprinter to block until all commands are complete.
     * 
     * @throws Exception
     */
    protected void dwell() throws Exception {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12383);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12384);sendCommand("M400");
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    private List<String> drainResponseQueue() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12385);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12386);List<String> responses = new ArrayList<>();
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12387);String response;
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12388);while ((response = responseQueue.poll()) != null) {{
            __CLR4_5_29f59f5lx1h8ld9.R.inc(12391);responses.add(response);
        }
        }__CLR4_5_29f59f5lx1h8ld9.R.inc(12392);return responses;
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12393);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12394);return new AbstractSerialPortDriverConfigurationWizard(this);
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12395);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12396);return getClass().getSimpleName();
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12397);
        // TODO Auto-generated method stub
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12398);return null;
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12399);
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12400);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_29f59f5lx1h8ld9.R.inc(12401);
        // TODO Auto-generated method stub
        __CLR4_5_29f59f5lx1h8ld9.R.inc(12402);return null;
    }finally{__CLR4_5_29f59f5lx1h8ld9.R.flushNeeded();}}
}
