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

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Locale;

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
import org.openpnp.spi.Head;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimulatorDriver implements ReferenceDriver {public static class __CLR4_5_29bk9bklx1h8lbp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,12209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(SimulatorDriver.class);

    @Attribute(required = false)
    private double feedRateMmPerMinute;

    private HashMap<Head, Location> headLocations = new HashMap<>();

    private boolean enabled;

    private Socket socket;
    private DataInputStream in;
    private PrintStream out;

    public SimulatorDriver() throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12080);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12081);connect();
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    /**
     * Gets the Location object being tracked for a specific Head. This is the absolute coordinates
     * of a virtual Head on the machine.
     * 
     * @param head
     * @return
     */
    protected Location getHeadLocation(Head head) {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12082);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12083);Location l = headLocations.get(head);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12084);if ((((l == null)&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12085)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12086)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12087);l = new Location(LengthUnit.Millimeters, 0, 0, 0, 0);
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12088);setHeadLocation(head, l);
        }
        }__CLR4_5_29bk9bklx1h8lbp.R.inc(12089);return l;
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    protected void setHeadLocation(Head head, Location l) {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12090);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12091);headLocations.put(head, l);
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12092);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12093);logger.debug("home()");
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12094);checkEnabled();
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12095);send("h");
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12096);setHeadLocation(head, getHeadLocation(head).derive(0.0, 0.0, 0.0, 0.0));
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    /**
     * Return the Location of a specific ReferenceHeadMountable on the machine. We get the
     * coordinates for the Head the object is attached to, and then we add the offsets assigned to
     * the object to make the coordinates correct for that object.
     */
    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12097);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12098);return getHeadLocation(hm.getHead()).add(hm.getHeadOffsets());
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    /**
     * Commands the driver to move the given ReferenceHeadMountable to the specified Location at the
     * given speed. Please see the comments for this method in the code for some important
     * considerations when writing your own driver.
     */
    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12099);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12100);logger.debug("moveTo({}, {}, {})", new Object[] {hm, location, speed});
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12101);checkEnabled();

        // Subtract the offsets from the incoming Location. This converts the
        // offset coordinates to driver / absolute coordinates.
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12102);location = location.subtract(hm.getHeadOffsets());

        // Convert the Location to millimeters, since that's the unit that
        // this driver works in natively.
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12103);location = location.convertToUnits(LengthUnit.Millimeters);

        // Get the current location of the Head that we'll move
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12104);Location hl = getHeadLocation(hm.getHead());

        __CLR4_5_29bk9bklx1h8lbp.R.inc(12105);String movable;
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12106);if ((((hm.toString().equals("N1"))&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12107)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12108)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12109);movable = "Nozzle1";
        }
        }else {__CLR4_5_29bk9bklx1h8lbp.R.inc(12110);if ((((hm.toString().equals("N2"))&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12111)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12112)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12113);movable = "Nozzle2";
        }
        }else {__CLR4_5_29bk9bklx1h8lbp.R.inc(12114);if ((((hm.toString().contains("Camera"))&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12115)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12116)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12117);movable = "Camera";
        }
        }else {__CLR4_5_29bk9bklx1h8lbp.R.inc(12118);if ((((hm.toString().equals("A1"))&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12119)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12120)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12121);movable = "Actuator";
        }
        }else {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12122);throw new Exception("Don't know what " + hm.toString() + " is.");
        }

        }}}}__CLR4_5_29bk9bklx1h8lbp.R.inc(12123);send(String.format(Locale.US, "m,%s,%f,%f,%f,%f", movable, location.getX(), location.getY(),
                location.getZ(), location.getRotation()));

        // Now that movement is complete, update the stored Location to the new
        // Location, unless the incoming Location specified an axis with a value
        // of NaN. NaN is interpreted to mean "Don't move this axis" so we don't
        // update the value, either.

        __CLR4_5_29bk9bklx1h8lbp.R.inc(12124);hl = hl.derive((((Double.isNaN(location.getX()) )&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12125)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12126)==0&false))? null : location.getX(),
                (((Double.isNaN(location.getY()) )&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12127)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12128)==0&false))? null : location.getY(),
                (((Double.isNaN(location.getZ()) )&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12129)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12130)==0&false))? null : location.getZ(),
                (((Double.isNaN(location.getRotation()) )&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12131)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12132)==0&false))? null : location.getRotation());

        __CLR4_5_29bk9bklx1h8lbp.R.inc(12133);setHeadLocation(hm.getHead(), hl);
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12134);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12135);logger.debug("pick({})", nozzle);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12136);checkEnabled();
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12137);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12138)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12139)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12140);Thread.sleep(500);
        }
    }}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12141);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12142);logger.debug("place({})", nozzle);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12143);checkEnabled();
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12144);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12145)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12146)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12147);Thread.sleep(500);
        }
    }}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12148);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12149);logger.debug("actuate({}, {})", actuator, value);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12150);checkEnabled();
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12151);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12152)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12153)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12154);Thread.sleep(500);
        }
    }}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12155);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12156);logger.debug("actuate({}, {})", actuator, on);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12157);checkEnabled();
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12158);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12159)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12160)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12161);Thread.sleep(500);
        }
    }}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void dispense(ReferencePasteDispenser dispenser, Location startLocation,
            Location endLocation, long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12162);}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12163);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12164);logger.debug("setEnabled({})", enabled);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12165);this.enabled = enabled;
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    private void checkEnabled() throws Exception {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12166);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12167);if ((((!enabled)&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12168)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12169)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12170);throw new Exception("Driver is not yet enabled!");
        }
    }}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    // TODO: This reconnect stuff totally doesn't work
    private void connect() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12171);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12172);if ((((socket == null || !socket.isConnected())&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12173)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12174)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12175);System.out.println("Connecting to simulator...");
        }
        }__CLR4_5_29bk9bklx1h8lbp.R.inc(12176);while ((((socket == null || !socket.isConnected())&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12177)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12178)==0&false))) {{
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12179);try {
                __CLR4_5_29bk9bklx1h8lbp.R.inc(12180);socket = new Socket("localhost", 9037);
                __CLR4_5_29bk9bklx1h8lbp.R.inc(12181);in = new DataInputStream(socket.getInputStream());
                __CLR4_5_29bk9bklx1h8lbp.R.inc(12182);out = new PrintStream(socket.getOutputStream());
                __CLR4_5_29bk9bklx1h8lbp.R.inc(12183);System.out.println("Connected!");
            }
            catch (Exception e) {
                __CLR4_5_29bk9bklx1h8lbp.R.inc(12184);e.printStackTrace();
            }
        }
    }}finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    private void send(String s) {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12185);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12186);try {
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12187);connect();
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12188);out.print(s);
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12189);out.print("\n");
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12190);String line = in.readLine();
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12191);if ((((!line.trim().equals("ok"))&&(__CLR4_5_29bk9bklx1h8lbp.R.iget(12192)!=0|true))||(__CLR4_5_29bk9bklx1h8lbp.R.iget(12193)==0&false))) {{
                __CLR4_5_29bk9bklx1h8lbp.R.inc(12194);throw new Exception("Didn't expect: " + line);
            }
        }}
        catch (Exception e) {
            __CLR4_5_29bk9bklx1h8lbp.R.inc(12195);e.printStackTrace();
        }
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12196);
        // TODO Auto-generated method stub
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12197);return null;
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12198);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12199);return getClass().getSimpleName();
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12200);
        // TODO Auto-generated method stub
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12201);return null;
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12202);
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12203);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12204);
        // TODO Auto-generated method stub
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12205);return null;
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12206);
        // TODO Auto-generated method stub
        __CLR4_5_29bk9bklx1h8lbp.R.inc(12207);return null;
    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_29bk9bklx1h8lbp.R.inc(12208);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_29bk9bklx1h8lbp.R.flushNeeded();}}
}
