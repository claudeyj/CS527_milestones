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
import java.util.Locale;
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
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * TODO: Consider adding some type of heartbeat to the firmware. TODO: The whole movement wait lock
 * thing has to go. See if we can do a P4 type command like the other drivers to wait for movement
 * to complete. Disabled axes don't send status reports, so movement wait lock never happens.
 * Probably short moves also won't.
 */
public class TinygDriver extends AbstractSerialPortDriver implements Runnable {public static class __CLR4_5_29kj9kjlx1h1viy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,12610,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(TinygDriver.class);
    private static final double minimumRequiredVersion = 0.95;

    @Attribute(required = false)
    private double feedRateMmPerMinute = 5000;
    @Element(required = false)
    private Location homeLocation = new Location(LengthUnit.Millimeters);

    private double x, y, z, c;
    private Thread readerThread;
    private boolean disconnectRequested;
    private Object commandLock = new Object();
    private Object movementWaitLock = new Object();
    private JsonObject lastResponse;
    private boolean connected;
    private double connectedVersion;
    private JsonParser parser = new JsonParser();

    public TinygDriver() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12403);}finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public synchronized void connect() throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12404);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12405);super.connect();

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12406);readerThread = new Thread(this);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12407);readerThread.start();

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12408);for (int i = 0; (((i < 10 && !connected)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12409)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12410)==0&false)); i++) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12411);try {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12412);JsonObject response = sendCommand("{\"fv\":\"\"}", 500);
                // {"r":{"fv":0.950,"f":[1,0,10,2853]}}
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12413);connectedVersion = response.get("r").getAsJsonObject().get("fv").getAsDouble();
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12414);connected = true;
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12415);response = sendCommand("{\"qv\":0}", 500);
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12416);break;
            }
            catch (Exception e) {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12417);logger.debug("Firmware version check failed", e);
            }
        }

        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12418);if ((((!connected)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12419)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12420)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12421);throw new Exception(String.format(
                    "Unable to receive connection response from TinyG. Check your port and baud rate, and that you are running at least version %f of TinyG",
                    minimumRequiredVersion));
        }

        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12422);if ((((connectedVersion < minimumRequiredVersion)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12423)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12424)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12425);throw new Exception(String.format(
                    "This driver requires TinyG version %.2f or higher. You are running version %.2f",
                    minimumRequiredVersion, connectedVersion));
        }

        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12426);logger.debug(String.format("Connected to TinyG Version: %.2f", connectedVersion));

        // We are connected to at least the minimum required version now
        // So perform some setup

        // Turn off the stepper drivers
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12427);setEnabled(false);

        // Make sure we're in millimeter mode
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12428);sendCommand("G21");

        // Make sure we are in absolute mode
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12429);sendCommand("G90");

        // Reset all axes to 0, in case the firmware was not reset on
        // connect.
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12430);sendCommand(String.format(Locale.US, "G92 X0 Y0 Z0 A0"));
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12431);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12432);if ((((enabled && !connected)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12433)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12434)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12435);connect();
        }
        // sendCommand("$1000=" + (enabled ? "1" : "0"));
    }}finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12436);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12437);synchronized (movementWaitLock) {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12438);JsonObject response = sendCommand("G28.2 X0 Y0 Z0 A0");
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12439);if ((((getResponseStatusCode(response) == 0)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12440)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12441)==0&false))) {{
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12442);waitForMovementComplete();
            }
        }}

        // TODO: This homeLocation really needs to be Head specific.
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12443);Location homeLocation = this.homeLocation.convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12444);sendCommand(String.format(Locale.US, "G92 X%2.2f Y%2.2f Z%2.2f A%2.2f", homeLocation.getX(),
                homeLocation.getY(), homeLocation.getZ(), homeLocation.getRotation()));

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12445);x = homeLocation.getX();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12446);y = homeLocation.getY();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12447);z = homeLocation.getZ();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12448);c = homeLocation.getRotation();
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12449);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12450);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12451);location = location.convertToUnits(LengthUnit.Millimeters);

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12452);double x = location.getX();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12453);double y = location.getY();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12454);double z = location.getZ();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12455);double c = location.getRotation();

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12456);StringBuffer sb = new StringBuffer();
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12457);if ((((!Double.isNaN(x) && x != this.x)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12458)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12459)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12460);sb.append(String.format(Locale.US, "X%2.2f ", x));
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12461);if ((((!Double.isNaN(y) && y != this.y)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12462)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12463)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12464);sb.append(String.format(Locale.US, "Y%2.2f ", y));
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12465);if ((((!Double.isNaN(z) && z != this.z)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12466)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12467)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12468);sb.append(String.format(Locale.US, "Z%2.2f ", z));
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12469);if ((((!Double.isNaN(c) && c != this.c)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12470)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12471)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12472);sb.append(String.format(Locale.US, "A%2.2f ", c));
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12473);if ((((sb.length() > 0)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12474)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12475)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12476);sb.append(String.format(Locale.US, "F%2.2f", feedRateMmPerMinute * speed));
            // TODO: Move this type of op into it's own method
            // sendCommandAndWaitForMovementComplete()
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12477);synchronized (movementWaitLock) {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12478);JsonObject response = sendCommand("G1 " + sb.toString());
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12479);if ((((getResponseStatusCode(response) == 0)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12480)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12481)==0&false))) {{
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12482);waitForMovementComplete();
                }
            }}
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12483);if ((((!Double.isNaN(x))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12484)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12485)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12486);this.x = x;
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12487);if ((((!Double.isNaN(y))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12488)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12489)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12490);this.y = y;
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12491);if ((((!Double.isNaN(z))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12492)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12493)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12494);this.z = z;
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12495);if ((((!Double.isNaN(c))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12496)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12497)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12498);this.c = c;
        }
    }}finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12499);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12500);sendCommand("M4");
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12501);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12502);sendCommand("M5");
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12503);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12504);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12505);if ((((actuator.getIndex() == 0)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12506)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12507)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12508);sendCommand((((on )&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12509)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12510)==0&false))? "M8" : "M9");
        }
    }}finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12511);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12512);return new Location(LengthUnit.Millimeters, x, y, z, c).add(hm.getHeadOffsets());
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    private int getResponseStatusCode(JsonObject o) {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12513);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12514);return o.get("f").getAsJsonArray().get(1).getAsInt();
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12515);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12516);disconnectRequested = true;
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12517);connected = false;

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12518);try {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12519);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12520)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12521)==0&false))) {{
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12522);readerThread.join();
            }
        }}
        catch (Exception e) {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12523);logger.error("disconnect()", e);
        }

        __CLR4_5_29kj9kjlx1h1viy.R.inc(12524);try {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12525);super.disconnect();
        }
        catch (Exception e) {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12526);logger.error("disconnect()", e);
        }
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12527);disconnectRequested = false;
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    public JsonObject sendCommand(String command) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12528);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12529);return sendCommand(command, -1);
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    public synchronized JsonObject sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12530);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12531);JsonObject response;
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12532);synchronized (commandLock) {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12533);lastResponse = null;
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12534);if ((((command != null)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12535)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12536)==0&false))) {{
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12537);logger.debug("sendCommand({}, {})", command, timeout);
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12538);output.write(command.getBytes());
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12539);output.write("\n".getBytes());
            }
            }__CLR4_5_29kj9kjlx1h1viy.R.inc(12540);if ((((timeout == -1)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12541)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12542)==0&false))) {{
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12543);commandLock.wait();
            }
            }else {{
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12544);commandLock.wait(timeout);
            }
            }__CLR4_5_29kj9kjlx1h1viy.R.inc(12545);response = lastResponse;
        }
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12546);if ((((response == null)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12547)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12548)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12549);throw new Exception("Command did not return a response");
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12550);int responseStatusCode = getResponseStatusCode(response);
        // TODO: Checking for 60 here (no movement) is a hack, but it gets the
        // job done for now. Later we should make it up to the sending command
        // to determine what to accept and what to fail.
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12551);if ((((responseStatusCode != 0 && responseStatusCode != 60)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12552)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12553)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12554);throw new Exception("Command failed. Status code: " + responseStatusCode);
        }
        }__CLR4_5_29kj9kjlx1h1viy.R.inc(12555);return response;
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    public void run() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12556);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12557);while ((((!disconnectRequested)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12558)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12559)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12560);String line;
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12561);try {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12562);line = readLine().trim();
            }
            catch (TimeoutException ex) {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12563);continue;
            }
            catch (IOException e) {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12564);logger.error("Read error", e);
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12565);return;
            }
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12566);line = line.trim();
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12567);logger.trace(line);
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12568);try {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12569);JsonObject o = (JsonObject) parser.parse(line);
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12570);if ((((o.has("sr"))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12571)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12572)==0&false))) {{
                    // this is an async status report
                    // {"sr":{"posx":0.000,"vel":7.75,"stat":3}}
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12573);processStatusReport(o.get("sr").getAsJsonObject());
                }
                }else {__CLR4_5_29kj9kjlx1h1viy.R.inc(12574);if ((((o.has("r"))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12575)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12576)==0&false))) {{
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12577);lastResponse = o;
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12578);synchronized (commandLock) {
                        __CLR4_5_29kj9kjlx1h1viy.R.inc(12579);commandLock.notifyAll();
                    }
                }
                }else {__CLR4_5_29kj9kjlx1h1viy.R.inc(12580);if ((((o.has("er"))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12581)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12582)==0&false))) {{
                    // this is an error / shutdown, handle it somehow
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12583);logger.error(o.toString());
                }
                }else {{
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12584);logger.error("Unknown JSON response: " + o);
                }
            }}}}
            catch (JsonSyntaxException e) {
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12585);logger.debug("Received invalid JSON syntax", e);
                // TODO: notify somehow
            }
        }
    }}finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    private void processStatusReport(JsonObject o) {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12586);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12587);if ((((o.has("stat"))&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12588)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12589)==0&false))) {{
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12590);int stat = o.get("stat").getAsInt();
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12591);if ((((stat == 3)&&(__CLR4_5_29kj9kjlx1h1viy.R.iget(12592)!=0|true))||(__CLR4_5_29kj9kjlx1h1viy.R.iget(12593)==0&false))) {{
                __CLR4_5_29kj9kjlx1h1viy.R.inc(12594);synchronized (movementWaitLock) {
                    __CLR4_5_29kj9kjlx1h1viy.R.inc(12595);movementWaitLock.notifyAll();
                }
            }
        }}
    }}finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    // TODO: If no movement is happening this will never return. We may want to
    // have it issue a status report request now and then so it doesn't sit
    // forever.
    private void waitForMovementComplete() throws Exception {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12596);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12597);synchronized (movementWaitLock) {
            __CLR4_5_29kj9kjlx1h1viy.R.inc(12598);movementWaitLock.wait();
        }
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    private void getStatusCodeDetails(int statusCode) {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12599);
        // 0 | TG_OK | universal OK code (function completed successfully)
        // 1 | TG_ERROR | generic error return (EPERM)
        // 2 | TG_EAGAIN | function would block here (call again)
        // 3 | TG_NOOP | function had no-operation
        // 4 | TG_COMPLETE | operation is complete
        // 5 | TG_TERMINATE | operation terminated (gracefully)
        // 6 | TG_RESET | operation was hard reset (sig kill)
        // 7 | TG_EOL | function returned end-of-line or end-of-message
        // 8 | TG_EOF | function returned end-of-file
        // 9 | TG_FILE_NOT_OPEN
        // 10 | TG_FILE_SIZE_EXCEEDED
        // 11 | TG_NO_SUCH_DEVICE
        // 12 | TG_BUFFER_EMPTY
        // 13 | TG_BUFFER_FULL
        // 14 | TG_BUFFER_FULL_FATAL
        // 15 | TG_INITIALIZING | initializing - not ready for use
        // 16-19 | TG_ERROR_16 - TG_ERROR_19 | reserved
        // 20 | TG_INTERNAL_ERROR | unrecoverable internal error
        // 21 | TG_INTERNAL_RANGE_ERROR | number range error other than by user
        // input
        // 22 | TG_FLOATING_POINT_ERROR | number conversion error
        // 23 | TG_DIVIDE_BY_ZERO
        // 24 | TG_INVALID_ADDRESS
        // 25 | TG_READ_ONLY_ADDRESS
        // 26 | TG_INIT_FAIL | Initialization failure
        // 27 | TG_SHUTDOWN | System shutdown occurred
        // 28 | TG_MEMORY_CORRUPTION | Memory corruption detected
        // 29-39 | TG_ERROR_26 - TG_ERROR_39 | reserved
        // 40 | TG_UNRECOGNIZED_COMMAND | parser didn't recognize the command
        // 41 | TG_EXPECTED_COMMAND_LETTER | malformed line to parser
        // 42 | TG_BAD_NUMBER_FORMAT | number format error
        // 43 | TG_INPUT_EXCEEDS_MAX_LENGTH | input string is too long
        // 44 | TG_INPUT_VALUE_TOO_SMALL | value is under minimum for this
        // parameter
        // 45 | TG_INPUT_VALUE_TOO_LARGE | value is over maximum for this
        // parameter
        // 46 | TG_INPUT_VALUE_RANGE_ERROR | input error: value is out-of-range
        // for this parameter
        // 47 | TG_INPUT_VALUE_UNSUPPORTED | input error: value is not supported
        // for this parameter
        // 48 | TG_JSON_SYNTAX_ERROR | JSON string is not well formed
        // 49 | TG_JSON_TOO_MANY_PAIRS | JSON string or has too many name:value
        // pairs
        // 50 | TG_JSON_TOO_LONG | JSON output string too long for output buffer
        // 51 | TG_NO_BUFFER_SPACE | Buffer pool is full and cannot perform this
        // operation
        // 52 - 59 | TG_ERROR_51 - TG_ERROR_59 | reserved
        // 60 | TG_ZERO_LENGTH_MOVE | move is zero length
        // 61 | TG_GCODE_BLOCK_SKIPPED | block was skipped - usually because it
        // was is too short
        // 62 | TG_GCODE_INPUT_ERROR | general error for gcode input
        // 63 | TG_GCODE_FEEDRATE_ERROR | no feedrate specified
        // 64 | TG_GCODE_AXIS_WORD_MISSING | command requires at least one axis
        // present
        // 65 | TG_MODAL_GROUP_VIOLATION | gcode modal group error
        // 66 | TG_HOMING_CYCLE_FAILED | homing cycle did not complete
        // 67 | TG_MAX_TRAVEL_EXCEEDED
        // 68 | TG_MAX_SPINDLE_SPEED_EXCEEDED
        // 69 | TG_ARC_SPECIFICATION_ERROR | arc specification error
        // 70-79 | TG_ERROR_70 - TG_ERROR_79 | reserved
        // 80-99 | Expansion | Expansion ranges
        // 100-119 | Expansion |
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12600);
        // TODO Auto-generated method stub
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12601);return new AbstractSerialPortDriverConfigurationWizard(this);
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12602);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12603);return getClass().getSimpleName();
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12604);
        // TODO Auto-generated method stub
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12605);return null;
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12606);
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12607);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_29kj9kjlx1h1viy.R.inc(12608);
        // TODO Auto-generated method stub
        __CLR4_5_29kj9kjlx1h1viy.R.inc(12609);return null;
    }finally{__CLR4_5_29kj9kjlx1h1viy.R.flushNeeded();}}
}
