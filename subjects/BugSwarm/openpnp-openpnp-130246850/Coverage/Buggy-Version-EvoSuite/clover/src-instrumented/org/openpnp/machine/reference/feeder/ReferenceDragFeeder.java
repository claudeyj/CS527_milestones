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

package org.openpnp.machine.reference.feeder;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceFeeder;
import org.openpnp.machine.reference.feeder.wizards.ReferenceDragFeederConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Rectangle;
import org.openpnp.spi.Actuator;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.VisionProvider;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Persist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Vision System Description
 * 
 * The Vision Operation is defined as moving the Camera to the defined Pick Location, performing a
 * template match against the Template Image bound by the Area of Interest and then storing the
 * offsets from the Pick Location to the matched image as Vision Offsets.
 * 
 * The feed operation consists of: 1. Apply the Vision Offsets to the Feed Start Location and Feed
 * End Location. 2. Feed the tape with the modified Locations. 3. Perform the Vision Operation. 4.
 * Apply the new Vision Offsets to the Pick Location and return the Pick Location for Picking.
 * 
 * This leaves the head directly above the Pick Location, which means that when the Feeder is then
 * commanded to pick the Part it only needs to move the distance of the Vision Offsets and do the
 * pick. The Vision Offsets are then used in the next feed operation to be sure to hit the tape at
 * the right position.
 */
public class ReferenceDragFeeder extends ReferenceFeeder {public static class __CLR4_5_2a1ka1klx1h0chu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,13194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ReferenceDragFeeder.class);

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    @Element
    protected Location feedStartLocation = new Location(LengthUnit.Millimeters);
    @Element
    protected Location feedEndLocation = new Location(LengthUnit.Millimeters);
    @Element(required = false)
    protected double feedSpeed = 1.0;
    @Attribute(required = false)
    protected String actuatorName;
    @Element(required = false)
    protected Vision vision = new Vision();

    protected Location pickLocation;

    /*
     * visionOffset contains the difference between where the part was expected to be and where it
     * is. Subtracting these offsets from the pickLocation produces the correct pick location.
     * Likewise, subtracting the offsets from the feedStart and feedEndLocations should produce the
     * correct feed locations.
     */
    protected Location visionOffset;

    @Override
    public Location getPickLocation() throws Exception {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13016);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13017);if ((((pickLocation == null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13018)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13019)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13020);pickLocation = location;
        }
        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13021);return pickLocation;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public void feed(Nozzle nozzle) throws Exception {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13022);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13023);logger.debug("feed({})", nozzle);

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13024);if ((((actuatorName == null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13025)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13026)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13027);throw new Exception("No actuator name set.");
        }


        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13028);Head head = nozzle.getHead();

        /*
         * TODO: We can optimize the feed process: If we are already higher than the Z we will move
         * to to index plus the height of the tape, we don't need to Safe Z first. There is also
         * probably no reason to Safe Z after extracting the pin since if the tool was going to hit
         * it would have already hit.
         */

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13029);Actuator actuator = head.getActuatorByName(actuatorName);

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13030);if ((((actuator == null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13031)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13032)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13033);throw new Exception(String.format("No Actuator found with name %s on feed Head %s",
                    actuatorName, head.getName()));
        }

        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13034);head.moveToSafeZ();

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13035);if ((((vision.isEnabled())&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13036)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13037)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13038);if ((((visionOffset == null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13039)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13040)==0&false))) {{
                // This is the first feed with vision, or the offset has
                // been invalidated for some reason. We need to get an offset,
                // complete the feed operation and then get a new offset
                // for the next operation. By front loading this we make sure
                // that all future calls can go directly to the feed operation
                // and skip checking the vision first.
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13041);logger.debug("First feed, running vision pre-flight.");

                __CLR4_5_2a1ka1klx1h0chu.R.inc(13042);visionOffset = getVisionOffsets(head, location);
            }
            }__CLR4_5_2a1ka1klx1h0chu.R.inc(13043);logger.debug("visionOffsets " + visionOffset);
        }

        // Now we have visionOffsets (if we're using them) so we
        // need to create a local, offset version of the feedStartLocation,
        // feedEndLocation and pickLocation. pickLocation will be saved
        // for the pick operation while feed start and end are used
        // here and then discarded.
        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13044);Location feedStartLocation = this.feedStartLocation;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13045);Location feedEndLocation = this.feedEndLocation;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13046);pickLocation = this.location;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13047);if ((((visionOffset != null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13048)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13049)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13050);feedStartLocation = feedStartLocation.subtract(visionOffset);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13051);feedEndLocation = feedEndLocation.subtract(visionOffset);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13052);pickLocation = pickLocation.subtract(visionOffset);
        }

        // Move the actuator to the feed start location.
        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13053);actuator.moveTo(feedStartLocation.derive(null, null, Double.NaN, Double.NaN));

        // extend the pin
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13054);actuator.actuate(true);

        // insert the pin
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13055);actuator.moveTo(feedStartLocation);

        // drag the tape
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13056);actuator.moveTo(feedEndLocation, feedSpeed * actuator.getHead().getMachine().getSpeed());

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13057);head.moveToSafeZ();

        // retract the pin
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13058);actuator.actuate(false);

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13059);if ((((vision.isEnabled())&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13060)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13061)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13062);visionOffset = getVisionOffsets(head, location);

            __CLR4_5_2a1ka1klx1h0chu.R.inc(13063);logger.debug("final visionOffsets " + visionOffset);
        }

        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13064);logger.debug("Modified pickLocation {}", pickLocation);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    // TODO: Throw an Exception if vision fails.
    private Location getVisionOffsets(Head head, Location pickLocation) throws Exception {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13065);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13066);logger.debug("getVisionOffsets({}, {})", head.getName(), pickLocation);
        // Find the Camera to be used for vision
        // TODO: Consider caching this
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13067);Camera camera = null;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13068);for (Camera c : head.getCameras()) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13069);if ((((c.getVisionProvider() != null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13070)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13071)==0&false))) {{
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13072);camera = c;
            }
        }}

        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13073);if ((((camera == null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13074)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13075)==0&false))) {{
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13076);throw new Exception("No vision capable camera found on head.");
        }

        }__CLR4_5_2a1ka1klx1h0chu.R.inc(13077);head.moveToSafeZ();

        // Position the camera over the pick location.
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13078);logger.debug("Move camera to pick location.");
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13079);camera.moveTo(pickLocation);

        // Move the camera to be in focus over the pick location.
        // head.moveTo(head.getX(), head.getY(), z, head.getC());

        // Settle the camera
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13080);Thread.sleep(camera.getSettleTimeMs());

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13081);VisionProvider visionProvider = camera.getVisionProvider();

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13082);Rectangle aoi = getVision().getAreaOfInterest();

        // Perform the template match
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13083);logger.debug("Perform template match.");
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13084);Point[] matchingPoints = visionProvider.locateTemplateMatches(aoi.getX(), aoi.getY(),
                aoi.getWidth(), aoi.getHeight(), 0, 0, vision.getTemplateImage());

        // Get the best match from the array
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13085);Point match = matchingPoints[0];

        // match now contains the position, in pixels, from the top left corner
        // of the image to the top left corner of the match. We are interested in
        // knowing how far from the center of the image the center of the match is.
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13086);BufferedImage image = camera.capture();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13087);double imageWidth = image.getWidth();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13088);double imageHeight = image.getHeight();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13089);double templateWidth = vision.getTemplateImage().getWidth();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13090);double templateHeight = vision.getTemplateImage().getHeight();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13091);double matchX = match.x;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13092);double matchY = match.y;

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13093);logger.debug("matchX {}, matchY {}", matchX, matchY);

        // Adjust the match x and y to be at the center of the match instead of
        // the top left corner.
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13094);matchX += (templateWidth / 2);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13095);matchY += (templateHeight / 2);

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13096);logger.debug("centered matchX {}, matchY {}", matchX, matchY);

        // Calculate the difference between the center of the image to the
        // center of the match.
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13097);double offsetX = (imageWidth / 2) - matchX;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13098);double offsetY = (imageHeight / 2) - matchY;

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13099);logger.debug("offsetX {}, offsetY {}", offsetX, offsetY);

        // Invert the Y offset because images count top to bottom and the Y
        // axis of the machine counts bottom to top.
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13100);offsetY *= -1;

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13101);logger.debug("negated offsetX {}, offsetY {}", offsetX, offsetY);

        // And convert pixels to units
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13102);Location unitsPerPixel = camera.getUnitsPerPixel();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13103);offsetX *= unitsPerPixel.getX();
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13104);offsetY *= unitsPerPixel.getY();

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13105);logger.debug("final, in camera units offsetX {}, offsetY {}", offsetX, offsetY);

        __CLR4_5_2a1ka1klx1h0chu.R.inc(13106);return new Location(unitsPerPixel.getUnits(), offsetX, offsetY, 0, 0);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13107);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13108);return String.format("ReferenceTapeFeeder id %s", id);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public Location getFeedStartLocation() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13109);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13110);return feedStartLocation;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void setFeedStartLocation(Location feedStartLocation) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13111);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13112);this.feedStartLocation = feedStartLocation;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public Location getFeedEndLocation() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13113);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13114);return feedEndLocation;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void setFeedEndLocation(Location feedEndLocation) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13115);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13116);this.feedEndLocation = feedEndLocation;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public Double getFeedSpeed() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13117);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13118);return feedSpeed;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void setFeedSpeed(Double feedSpeed) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13119);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13120);this.feedSpeed = feedSpeed;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public String getActuatorName() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13121);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13122);return actuatorName;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void setActuatorName(String actuatorName) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13123);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13124);String oldValue = this.actuatorName;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13125);this.actuatorName = actuatorName;
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13126);propertyChangeSupport.firePropertyChange("actuatorName", oldValue, actuatorName);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public Vision getVision() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13127);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13128);return vision;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void setVision(Vision vision) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13129);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13130);this.vision = vision;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void addPropertyChangeListener(PropertyChangeListener listener) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13131);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13132);propertyChangeSupport.addPropertyChangeListener(listener);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13133);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13134);propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void removePropertyChangeListener(PropertyChangeListener listener) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13135);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13136);propertyChangeSupport.removePropertyChangeListener(listener);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13137);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13138);propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13139);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13140);return new ReferenceDragFeederConfigurationWizard(this);
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13141);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13142);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13143);
        // TODO Auto-generated method stub
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13144);return null;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13145);
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13146);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13147);
        // TODO Auto-generated method stub
        __CLR4_5_2a1ka1klx1h0chu.R.inc(13148);return null;
    }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

    public static class Vision {
        @Attribute(required = false)
        private boolean enabled;
        @Attribute(required = false)
        private String templateImageName;
        @Element(required = false)
        private Rectangle areaOfInterest = new Rectangle();
        @Element(required = false)
        private Location templateImageTopLeft = new Location(LengthUnit.Millimeters);
        @Element(required = false)
        private Location templateImageBottomRight = new Location(LengthUnit.Millimeters);

        private BufferedImage templateImage;
        private boolean templateImageDirty;

        public Vision() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13149);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13150);Configuration.get().addListener(new ConfigurationListener.Adapter() {
                @Override
                public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13151);
                    __CLR4_5_2a1ka1klx1h0chu.R.inc(13152);if ((((templateImageName != null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13153)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13154)==0&false))) {{
                        __CLR4_5_2a1ka1klx1h0chu.R.inc(13155);File file = configuration.getResourceFile(Vision.this.getClass(),
                                templateImageName);
                        __CLR4_5_2a1ka1klx1h0chu.R.inc(13156);templateImage = ImageIO.read(file);
                    }
                }}finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        @SuppressWarnings("unused")
        @Persist
        private void persist() throws IOException {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13157);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13158);if ((((templateImageDirty)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13159)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13160)==0&false))) {{
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13161);File file = null;
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13162);if ((((templateImageName != null)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13163)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13164)==0&false))) {{
                    __CLR4_5_2a1ka1klx1h0chu.R.inc(13165);file = Configuration.get().getResourceFile(this.getClass(), templateImageName);
                }
                }else {{
                    __CLR4_5_2a1ka1klx1h0chu.R.inc(13166);file = Configuration.get().createResourceFile(this.getClass(), "tmpl_", ".png");
                    __CLR4_5_2a1ka1klx1h0chu.R.inc(13167);templateImageName = file.getName();
                }
                }__CLR4_5_2a1ka1klx1h0chu.R.inc(13168);ImageIO.write(templateImage, "png", file);
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13169);templateImageDirty = false;
            }
        }}finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public boolean isEnabled() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13170);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13171);return enabled;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public void setEnabled(boolean enabled) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13172);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13173);this.enabled = enabled;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public BufferedImage getTemplateImage() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13174);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13175);return templateImage;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public void setTemplateImage(BufferedImage templateImage) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13176);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13177);if ((((templateImage != this.templateImage)&&(__CLR4_5_2a1ka1klx1h0chu.R.iget(13178)!=0|true))||(__CLR4_5_2a1ka1klx1h0chu.R.iget(13179)==0&false))) {{
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13180);this.templateImage = templateImage;
                __CLR4_5_2a1ka1klx1h0chu.R.inc(13181);templateImageDirty = true;
            }
        }}finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public Rectangle getAreaOfInterest() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13182);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13183);return areaOfInterest;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public void setAreaOfInterest(Rectangle areaOfInterest) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13184);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13185);this.areaOfInterest = areaOfInterest;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public Location getTemplateImageTopLeft() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13186);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13187);return templateImageTopLeft;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public void setTemplateImageTopLeft(Location templateImageTopLeft) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13188);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13189);this.templateImageTopLeft = templateImageTopLeft;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public Location getTemplateImageBottomRight() {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13190);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13191);return templateImageBottomRight;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}

        public void setTemplateImageBottomRight(Location templateImageBottomRight) {try{__CLR4_5_2a1ka1klx1h0chu.R.inc(13192);
            __CLR4_5_2a1ka1klx1h0chu.R.inc(13193);this.templateImageBottomRight = templateImageBottomRight;
        }finally{__CLR4_5_2a1ka1klx1h0chu.R.flushNeeded();}}
    }
}
