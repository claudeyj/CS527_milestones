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
import java.util.HashMap;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceDriver;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceMachine;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.machine.reference.ReferencePasteDispenser;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Head;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An example of the simplest possible driver that can support multiple heads. This driver maintains
 * a set of coordinates for each Head that it is asked to handle and simply logs all commands sent
 * to it.
 */
public class NullDriver implements ReferenceDriver {public static class __CLR4_5_2977977lx1h37ru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,12080,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(NullDriver.class);

    @Attribute(required = false)
    private double feedRateMmPerMinute = 5000;

    private HashMap<Head, Location> headLocations = new HashMap<>();

    private boolean enabled;

    /**
     * Gets the Location object being tracked for a specific Head. This is the absolute coordinates
     * of a virtual Head on the machine.
     * 
     * @param head
     * @return
     */
    protected Location getHeadLocation(Head head) {try{__CLR4_5_2977977lx1h37ru.R.inc(11923);
        __CLR4_5_2977977lx1h37ru.R.inc(11924);Location l = headLocations.get(head);
        __CLR4_5_2977977lx1h37ru.R.inc(11925);if ((((l == null)&&(__CLR4_5_2977977lx1h37ru.R.iget(11926)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11927)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(11928);l = new Location(LengthUnit.Millimeters, 0, 0, 0, 0);
            __CLR4_5_2977977lx1h37ru.R.inc(11929);setHeadLocation(head, l);
        }
        }__CLR4_5_2977977lx1h37ru.R.inc(11930);return l;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    protected void setHeadLocation(Head head, Location l) {try{__CLR4_5_2977977lx1h37ru.R.inc(11931);
        __CLR4_5_2977977lx1h37ru.R.inc(11932);headLocations.put(head, l);
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(11933);
        __CLR4_5_2977977lx1h37ru.R.inc(11934);logger.debug("home()");
        __CLR4_5_2977977lx1h37ru.R.inc(11935);checkEnabled();
        __CLR4_5_2977977lx1h37ru.R.inc(11936);setHeadLocation(head, getHeadLocation(head).derive(0.0, 0.0, 0.0, 0.0));
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    /**
     * Return the Location of a specific ReferenceHeadMountable on the machine. We get the
     * coordinates for the Head the object is attached to, and then we add the offsets assigned to
     * the object to make the coordinates correct for that object.
     */
    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_2977977lx1h37ru.R.inc(11937);
        __CLR4_5_2977977lx1h37ru.R.inc(11938);return getHeadLocation(hm.getHead()).add(hm.getHeadOffsets());
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    /**
     * Commands the driver to move the given ReferenceHeadMountable to the specified Location at the
     * given speed. Please see the comments for this method in the code for some important
     * considerations when writing your own driver.
     */
    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(11939);
        __CLR4_5_2977977lx1h37ru.R.inc(11940);logger.debug("moveTo({}, {}, {})", new Object[] {hm, location, speed});
        __CLR4_5_2977977lx1h37ru.R.inc(11941);checkEnabled();

        // Subtract the offsets from the incoming Location. This converts the
        // offset coordinates to driver / absolute coordinates.
        __CLR4_5_2977977lx1h37ru.R.inc(11942);location = location.subtract(hm.getHeadOffsets());

        // Convert the Location to millimeters, since that's the unit that
        // this driver works in natively.
        __CLR4_5_2977977lx1h37ru.R.inc(11943);location = location.convertToUnits(LengthUnit.Millimeters);

        // Get the current location of the Head that we'll move
        __CLR4_5_2977977lx1h37ru.R.inc(11944);Location hl = getHeadLocation(hm.getHead());

        __CLR4_5_2977977lx1h37ru.R.inc(11945);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_2977977lx1h37ru.R.iget(11946)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11947)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(11948);simulateMovement(hm, location, hl, speed);
        }

        // Now that movement is complete, update the stored Location to the new
        // Location, unless the incoming Location specified an axis with a value
        // of NaN. NaN is interpreted to mean "Don't move this axis" so we don't
        // update the value, either.

        }__CLR4_5_2977977lx1h37ru.R.inc(11949);hl = hl.derive((((Double.isNaN(location.getX()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11950)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11951)==0&false))? null : location.getX(),
                (((Double.isNaN(location.getY()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11952)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11953)==0&false))? null : location.getY(),
                (((Double.isNaN(location.getZ()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11954)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11955)==0&false))? null : location.getZ(),
                (((Double.isNaN(location.getRotation()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11956)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11957)==0&false))? null : location.getRotation());

        __CLR4_5_2977977lx1h37ru.R.inc(11958);setHeadLocation(hm.getHead(), hl);
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    /**
     * Simulates true machine movement, which takes time, by tracing the required movement lines
     * over a period of time based on the input speed.
     * 
     * @param hm
     * @param location
     * @param hl
     * @param speed
     * @throws Exception
     */
    protected void simulateMovement(ReferenceHeadMountable hm, Location location, Location hl,
            double speed) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(11959);
        __CLR4_5_2977977lx1h37ru.R.inc(11960);double x = hl.getX();
        __CLR4_5_2977977lx1h37ru.R.inc(11961);double y = hl.getY();
        __CLR4_5_2977977lx1h37ru.R.inc(11962);double z = hl.getZ();
        __CLR4_5_2977977lx1h37ru.R.inc(11963);double c = hl.getRotation();

        __CLR4_5_2977977lx1h37ru.R.inc(11964);double x1 = x;
        __CLR4_5_2977977lx1h37ru.R.inc(11965);double y1 = y;
        __CLR4_5_2977977lx1h37ru.R.inc(11966);double z1 = z;
        __CLR4_5_2977977lx1h37ru.R.inc(11967);double c1 = c;
        __CLR4_5_2977977lx1h37ru.R.inc(11968);double x2 = (((Double.isNaN(location.getX()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11969)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11970)==0&false))? x : location.getX();
        __CLR4_5_2977977lx1h37ru.R.inc(11971);double y2 = (((Double.isNaN(location.getY()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11972)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11973)==0&false))? y : location.getY();
        __CLR4_5_2977977lx1h37ru.R.inc(11974);double z2 = (((Double.isNaN(location.getZ()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11975)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11976)==0&false))? z : location.getZ();
        __CLR4_5_2977977lx1h37ru.R.inc(11977);double c2 = (((Double.isNaN(location.getRotation()) )&&(__CLR4_5_2977977lx1h37ru.R.iget(11978)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11979)==0&false))? c : location.getRotation();

        __CLR4_5_2977977lx1h37ru.R.inc(11980);c2 = c2 % 360.0;

        // Calculate the linear distance to travel in each axis.
        __CLR4_5_2977977lx1h37ru.R.inc(11981);double vx = x2 - x1;
        __CLR4_5_2977977lx1h37ru.R.inc(11982);double vy = y2 - y1;
        __CLR4_5_2977977lx1h37ru.R.inc(11983);double vz = z2 - z1;
        __CLR4_5_2977977lx1h37ru.R.inc(11984);double vc = c2 - c1;

        // Calculate the linear distance to travel in each plane XY, Z and C.
        __CLR4_5_2977977lx1h37ru.R.inc(11985);double pxy = Math.sqrt(vx * vx + vy * vy);
        __CLR4_5_2977977lx1h37ru.R.inc(11986);double pz = Math.abs(vz);
        __CLR4_5_2977977lx1h37ru.R.inc(11987);double pc = Math.abs(vc);

        // Distance moved in each plane so far.
        __CLR4_5_2977977lx1h37ru.R.inc(11988);double dxy = 0, dz = 0, dc = 0;

        // The distance that we'll move each loop.
        __CLR4_5_2977977lx1h37ru.R.inc(11989);double distancePerTick = (feedRateMmPerMinute * speed) / 60.0 / 10.0;
        __CLR4_5_2977977lx1h37ru.R.inc(11990);double distancePerTickC = distancePerTick * 10;

        __CLR4_5_2977977lx1h37ru.R.inc(11991);while ((((dxy < pxy || dz < pz || dc < pc)&&(__CLR4_5_2977977lx1h37ru.R.iget(11992)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11993)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(11994);if ((((dxy < pxy)&&(__CLR4_5_2977977lx1h37ru.R.iget(11995)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(11996)==0&false))) {{
                __CLR4_5_2977977lx1h37ru.R.inc(11997);x = x1 + (vx / pxy * dxy);
                __CLR4_5_2977977lx1h37ru.R.inc(11998);y = y1 + (vy / pxy * dxy);
            }
            }else {{
                __CLR4_5_2977977lx1h37ru.R.inc(11999);x = x2;
                __CLR4_5_2977977lx1h37ru.R.inc(12000);y = y2;
            }
            }__CLR4_5_2977977lx1h37ru.R.inc(12001);if ((((dz < pz)&&(__CLR4_5_2977977lx1h37ru.R.iget(12002)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12003)==0&false))) {{
                __CLR4_5_2977977lx1h37ru.R.inc(12004);z = z1 + dz * ((((vz < 0 )&&(__CLR4_5_2977977lx1h37ru.R.iget(12005)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12006)==0&false))? -1 : 1);
            }
            }else {{
                __CLR4_5_2977977lx1h37ru.R.inc(12007);z = z2;
            }
            }__CLR4_5_2977977lx1h37ru.R.inc(12008);if ((((dc < pc)&&(__CLR4_5_2977977lx1h37ru.R.iget(12009)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12010)==0&false))) {{
                __CLR4_5_2977977lx1h37ru.R.inc(12011);c = c1 + dc * ((((vc < 0 )&&(__CLR4_5_2977977lx1h37ru.R.iget(12012)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12013)==0&false))? -1 : 1);
            }
            }else {{
                __CLR4_5_2977977lx1h37ru.R.inc(12014);c = c2;
            }

            }__CLR4_5_2977977lx1h37ru.R.inc(12015);hl = hl.derive(x, y, z, c);
            __CLR4_5_2977977lx1h37ru.R.inc(12016);setHeadLocation(hm.getHead(), hl);

            // Provide live updates to the Machine as the move progresses.
            __CLR4_5_2977977lx1h37ru.R.inc(12017);((ReferenceMachine) Configuration.get().getMachine())
                    .fireMachineHeadActivity(hm.getHead());

            __CLR4_5_2977977lx1h37ru.R.inc(12018);try {
                __CLR4_5_2977977lx1h37ru.R.inc(12019);Thread.sleep(100);
            }
            catch (Exception e) {

            }

            __CLR4_5_2977977lx1h37ru.R.inc(12020);dxy = Math.min(pxy, dxy + distancePerTick);
            __CLR4_5_2977977lx1h37ru.R.inc(12021);dz = Math.min(pz, dz + distancePerTick);
            __CLR4_5_2977977lx1h37ru.R.inc(12022);dc = Math.min(pc, dc + distancePerTickC);
        }
    }}finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12023);
        __CLR4_5_2977977lx1h37ru.R.inc(12024);logger.debug("pick({})", nozzle);
        __CLR4_5_2977977lx1h37ru.R.inc(12025);checkEnabled();
        __CLR4_5_2977977lx1h37ru.R.inc(12026);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_2977977lx1h37ru.R.iget(12027)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12028)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(12029);Thread.sleep(500);
        }
    }}finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12030);
        __CLR4_5_2977977lx1h37ru.R.inc(12031);logger.debug("place({})", nozzle);
        __CLR4_5_2977977lx1h37ru.R.inc(12032);checkEnabled();
        __CLR4_5_2977977lx1h37ru.R.inc(12033);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_2977977lx1h37ru.R.iget(12034)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12035)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(12036);Thread.sleep(500);
        }
    }}finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12037);
        __CLR4_5_2977977lx1h37ru.R.inc(12038);logger.debug("actuate({}, {})", actuator, value);
        __CLR4_5_2977977lx1h37ru.R.inc(12039);checkEnabled();
        __CLR4_5_2977977lx1h37ru.R.inc(12040);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_2977977lx1h37ru.R.iget(12041)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12042)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(12043);Thread.sleep(500);
        }
    }}finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12044);
        __CLR4_5_2977977lx1h37ru.R.inc(12045);logger.debug("actuate({}, {})", actuator, on);
        __CLR4_5_2977977lx1h37ru.R.inc(12046);checkEnabled();
        __CLR4_5_2977977lx1h37ru.R.inc(12047);if ((((feedRateMmPerMinute > 0)&&(__CLR4_5_2977977lx1h37ru.R.iget(12048)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12049)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(12050);Thread.sleep(500);
        }
    }}finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void dispense(ReferencePasteDispenser dispenser, Location startLocation,
            Location endLocation, long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12051);
        __CLR4_5_2977977lx1h37ru.R.inc(12052);logger.debug("dispense({}, {}, {}, {})",
                new Object[] {dispenser, startLocation, endLocation, dispenseTimeMilliseconds});
        __CLR4_5_2977977lx1h37ru.R.inc(12053);checkEnabled();
        __CLR4_5_2977977lx1h37ru.R.inc(12054);Thread.sleep(dispenseTimeMilliseconds);
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12055);
        __CLR4_5_2977977lx1h37ru.R.inc(12056);logger.debug("setEnabled({})", enabled);
        __CLR4_5_2977977lx1h37ru.R.inc(12057);this.enabled = enabled;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2977977lx1h37ru.R.inc(12058);
        // TODO Auto-generated method stub
        __CLR4_5_2977977lx1h37ru.R.inc(12059);return null;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2977977lx1h37ru.R.inc(12060);
        __CLR4_5_2977977lx1h37ru.R.inc(12061);return getClass().getSimpleName();
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2977977lx1h37ru.R.inc(12062);
        // TODO Auto-generated method stub
        __CLR4_5_2977977lx1h37ru.R.inc(12063);return null;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2977977lx1h37ru.R.inc(12064);
        __CLR4_5_2977977lx1h37ru.R.inc(12065);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2977977lx1h37ru.R.inc(12066);
        // TODO Auto-generated method stub
        __CLR4_5_2977977lx1h37ru.R.inc(12067);return null;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2977977lx1h37ru.R.inc(12068);
        // TODO Auto-generated method stub
        __CLR4_5_2977977lx1h37ru.R.inc(12069);return null;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    private void checkEnabled() throws Exception {try{__CLR4_5_2977977lx1h37ru.R.inc(12070);
        __CLR4_5_2977977lx1h37ru.R.inc(12071);if ((((!enabled)&&(__CLR4_5_2977977lx1h37ru.R.iget(12072)!=0|true))||(__CLR4_5_2977977lx1h37ru.R.iget(12073)==0&false))) {{
            __CLR4_5_2977977lx1h37ru.R.inc(12074);throw new Exception("Driver is not yet enabled!");
        }
    }}finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    public double getFeedRateMmPerMinute() {try{__CLR4_5_2977977lx1h37ru.R.inc(12075);
        __CLR4_5_2977977lx1h37ru.R.inc(12076);return feedRateMmPerMinute;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    public void setFeedRateMmPerMinute(double feedRateMmPerMinute) {try{__CLR4_5_2977977lx1h37ru.R.inc(12077);
        __CLR4_5_2977977lx1h37ru.R.inc(12078);this.feedRateMmPerMinute = feedRateMmPerMinute;
    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_2977977lx1h37ru.R.inc(12079);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_2977977lx1h37ru.R.flushNeeded();}}
}
