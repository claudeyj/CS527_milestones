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



import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openpnp.gui.MainFrame;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceFeeder;
import org.openpnp.machine.reference.feeder.wizards.ReferenceStripFeederConfigurationWizard;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Point;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.Utils2D;
import org.openpnp.vision.FluentCv;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Implementation of Feeder that indexes through a strip of cut tape. This is a specialization of
 * the tray feeder that knows specifics about tape so that vision capabilities can be added.
 */

/**
 * SMD tape standard info from http://www.liteplacer.com/setup-tape-positions-2/
 * 
 * holes 1.5mm
 * 
 * hole pitch 4mm
 * 
 * first part center to reference hole linear is 2mm
 * 
 * tape width is multiple of 4mm
 * 
 * part pitch is multiple of 4mm except for 0402 and smaller, where it is 2mm
 * 
 * hole to part lateral is tape width / 2 - 0.5mm
 */
public class ReferenceStripFeeder extends ReferenceFeeder {public static class __CLR4_5_2a6ia6ilx1h8lwc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,13355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ReferenceStripFeeder.class);

    public enum TapeType {
        WhitePaper("White Paper"),
        BlackPlastic("Black Plastic"),
        ClearPlastic("Clear Plastic");

        private String name;

        TapeType(String name) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13194);
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13195);this.name = name;
        }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13196);
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13197);return name;
        }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}
    }

    @Element(required = false)
    private Location referenceHoleLocation = new Location(LengthUnit.Millimeters);

    @Element(required = false)
    private Location lastHoleLocation = new Location(LengthUnit.Millimeters);

    @Element(required = false)
    private Length partPitch = new Length(4, LengthUnit.Millimeters);

    @Element(required = false)
    private Length tapeWidth = new Length(8, LengthUnit.Millimeters);

    @Attribute(required = false)
    private TapeType tapeType = TapeType.WhitePaper;

    @Attribute(required = false)
    private boolean visionEnabled = true;

    @Attribute
    private int feedCount = 0;

    private Length holeDiameter = new Length(1.5, LengthUnit.Millimeters);

    private Length holePitch = new Length(4, LengthUnit.Millimeters);

    private Length referenceHoleToPartLinear = new Length(2, LengthUnit.Millimeters);

    private Location visionOffsets;
    private Location visionLocation;

    public Length getHoleDiameterMin() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13198);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13199);return getHoleDiameter().multiply(0.9);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHoleDiameterMax() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13200);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13201);return getHoleDiameter().multiply(1.1);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHolePitchMin() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13202);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13203);return getHolePitch().multiply(0.9);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHoleDistanceMin() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13204);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13205);return getTapeWidth().multiply(0.25);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHoleDistanceMax() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13206);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13207);return getTapeWidth().multiply(1.5);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHoleLineDistanceMax() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13208);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13209);return new Length(0.5, LengthUnit.Millimeters);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public int getHoleBlurKernelSize() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13210);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13211);return 9;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public Location getPickLocation() throws Exception {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13212);
        // Find the location of the part linearly along the tape
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13213);Location[] lineLocations = getIdealLineLocations();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13214);Location l = getPointAlongLine(lineLocations[0], lineLocations[1],
                new Length((feedCount - 1) * partPitch.getValue(), partPitch.getUnits()));
        // Create the offsets that are required to go from a reference hole
        // to the part in the tape
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13215);Length x = getHoleToPartLateral().convertToUnits(l.getUnits());
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13216);Length y = referenceHoleToPartLinear.convertToUnits(l.getUnits());
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13217);Point p = new Point(x.getValue(), y.getValue());
        // Determine the angle that the tape is at
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13218);double angle = getAngleFromPoint(lineLocations[0], lineLocations[1]);
        // Rotate the part offsets by the angle to move it into the right
        // coordinate space
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13219);p = Utils2D.rotatePoint(p, angle);
        // And add the offset to the location we calculated previously
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13220);l = l.add(new Location(l.getUnits(), p.x, p.y, 0, 0));
        // Add in the angle of the tape plus the angle of the part in the tape
        // so that the part is picked at the right angle
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13221);l = l.derive(null, null, null, angle + getLocation().getRotation());
        // and if vision was performed, add the offsets
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13222);if ((((visionEnabled && visionOffsets != null)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13223)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13224)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13225);l = l.add(visionOffsets);
        }
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13226);return l;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Location[] getIdealLineLocations() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13227);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13228);if ((((visionLocation == null)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13229)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13230)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13231);return new Location[] {referenceHoleLocation, lastHoleLocation};
        }
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13232);double d1 = referenceHoleLocation.getLinearLengthTo(lastHoleLocation)
                .convertToUnits(LengthUnit.Millimeters).getValue();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13233);double d2 = referenceHoleLocation.getLinearLengthTo(visionLocation)
                .convertToUnits(LengthUnit.Millimeters).getValue();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13234);if ((((d2 > d1)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13235)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13236)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13237);return new Location[] {referenceHoleLocation, visionLocation};
        }
        }else {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13238);return new Location[] {referenceHoleLocation, lastHoleLocation};
        }
    }}finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void feed(Nozzle nozzle) throws Exception {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13239);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13240);setFeedCount(getFeedCount() + 1);

        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13241);updateVisionOffsets(nozzle);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    private void updateVisionOffsets(Nozzle nozzle) throws Exception {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13242);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13243);if ((((!visionEnabled)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13244)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13245)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13246);return;
        }
        // go to where we expect to find the next reference hole
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13247);Camera camera = nozzle.getHead().getDefaultCamera();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13248);Location expectedLocation = null;
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13249);Location[] lineLocations = getIdealLineLocations();

        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13250);if ((((partPitch.convertToUnits(LengthUnit.Millimeters).getValue() < 4)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13251)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13252)==0&false))) {{
            // For tapes with a part pitch < 4 we need to check each hole
            // twice since there are two parts per reference hole.
            // Note the use of holePitch here and partPitch in the
            // alternate case below.
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13253);expectedLocation = getPointAlongLine(lineLocations[0], lineLocations[1],
                    holePitch.multiply((feedCount - 1) / 2));
        }
        }else {{
            // For tapes with a part pitch >= 4 there is always a reference
            // hole 2mm from a part so we just multiply by the part pitch
            // skipping over holes that are not reference holes.
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13254);expectedLocation = getPointAlongLine(lineLocations[0], lineLocations[1],
                    partPitch.multiply(feedCount - 1));
        }
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13255);MovableUtils.moveToLocationAtSafeZ(camera, expectedLocation);
        // and look for the hole
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13256);Location actualLocation = findClosestHole(camera);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13257);if ((((actualLocation == null)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13258)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13259)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13260);throw new Exception(
                    "Feeder " + getName() + ": Unable to locate reference hole. End of strip?");
        }
        // make sure it's not too far away
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13261);Length distance = actualLocation.getLinearLengthTo(expectedLocation)
                .convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13262);if ((((distance.getValue() > 2)&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13263)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13264)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13265);throw new Exception(
                    "Feeder " + getName() + ": Unable to locate reference hole. End of strip?");
        }
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13266);visionOffsets = actualLocation.subtract(expectedLocation).derive(null, null, 0d, 0d);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13267);visionLocation = actualLocation;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    private Location findClosestHole(Camera camera) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13268);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13269);List<Location> holeLocations = new ArrayList<>();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13270);BufferedImage image = new FluentCv().setCamera(camera).settleAndCapture("original").toGray()
                .blurGaussian(getHoleBlurKernelSize())
                .findCirclesHough(getHoleDiameterMin(), getHoleDiameterMax(), getHolePitchMin(),
                        "circles")
                .convertCirclesToLocations(holeLocations).drawCircles("original").toBufferedImage();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13271);if ((((holeLocations.isEmpty())&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13272)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13273)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13274);return null;
        }
        }__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13275);try {
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13276);MainFrame.cameraPanel.getCameraView(camera).showFilteredImage(image, 500);
        }
        catch (Exception e) {
            // if we aren't running in the UI this will fail, and that's okay
        }
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13277);return holeLocations.get(0);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    private Length getHoleToPartLateral() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13278);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13279);Length tapeWidth = this.tapeWidth.convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13280);return new Length(tapeWidth.getValue() / 2 - 0.5, LengthUnit.Millimeters);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    static public Location getPointAlongLine(Location a, Location b, Length distance) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13281);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13282);Point vab = b.subtract(a).getXyPoint();
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13283);double lab = a.getLinearDistanceTo(b);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13284);Point vu = new Point(vab.x / lab, vab.y / lab);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13285);vu = new Point(vu.x * distance.getValue(), vu.y * distance.getValue());
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13286);return a.add(new Location(a.getUnits(), vu.x, vu.y, 0, 0));
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    // Stolen from StackOverflow
    static public double getAngleFromPoint(Location firstPoint, Location secondPoint) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13287);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13288);double angle = 0.0;
        // above 0 to 180 degrees
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13289);if (((((secondPoint.getX() > firstPoint.getX()))&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13290)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13291)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13292);angle = (Math.atan2((secondPoint.getX() - firstPoint.getX()),
                    (firstPoint.getY() - secondPoint.getY())) * 180 / Math.PI);
        }
        // above 180 degrees to 360/0
        }else {__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13293);if (((((secondPoint.getX() <= firstPoint.getX()))&&(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13294)!=0|true))||(__CLR4_5_2a6ia6ilx1h8lwc.R.iget(13295)==0&false))) {{
            __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13296);angle = 360 - (Math.atan2((firstPoint.getX() - secondPoint.getX()),
                    (firstPoint.getY() - secondPoint.getY())) * 180 / Math.PI);
        }
        }}__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13297);return angle;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public TapeType getTapeType() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13298);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13299);return tapeType;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setTapeType(TapeType tapeType) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13300);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13301);this.tapeType = tapeType;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Location getReferenceHoleLocation() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13302);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13303);return referenceHoleLocation;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setReferenceHoleLocation(Location referenceHoleLocation) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13304);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13305);this.referenceHoleLocation = referenceHoleLocation;
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13306);visionLocation = null;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Location getLastHoleLocation() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13307);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13308);return lastHoleLocation;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setLastHoleLocation(Location lastHoleLocation) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13309);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13310);this.lastHoleLocation = lastHoleLocation;
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13311);visionLocation = null;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHoleDiameter() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13312);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13313);return holeDiameter;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setHoleDiameter(Length holeDiameter) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13314);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13315);this.holeDiameter = holeDiameter;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getHolePitch() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13316);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13317);return holePitch;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setHolePitch(Length holePitch) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13318);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13319);this.holePitch = holePitch;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getPartPitch() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13320);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13321);return partPitch;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setPartPitch(Length partPitch) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13322);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13323);this.partPitch = partPitch;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getTapeWidth() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13324);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13325);return tapeWidth;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setTapeWidth(Length tapeWidth) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13326);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13327);this.tapeWidth = tapeWidth;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public int getFeedCount() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13328);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13329);return feedCount;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setFeedCount(int feedCount) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13330);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13331);int oldValue = this.feedCount;
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13332);this.feedCount = feedCount;
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13333);this.visionOffsets = null;
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13334);firePropertyChange("feedCount", oldValue, feedCount);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public Length getReferenceHoleToPartLinear() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13335);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13336);return referenceHoleToPartLinear;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setReferenceHoleToPartLinear(Length referenceHoleToPartLinear) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13337);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13338);this.referenceHoleToPartLinear = referenceHoleToPartLinear;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public boolean isVisionEnabled() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13339);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13340);return visionEnabled;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    public void setVisionEnabled(boolean visionEnabled) {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13341);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13342);this.visionEnabled = visionEnabled;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13343);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13344);return getName();
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13345);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13346);return new ReferenceStripFeederConfigurationWizard(this);
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13347);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13348);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13349);
        // TODO Auto-generated method stub
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13350);return null;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13351);
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13352);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2a6ia6ilx1h8lwc.R.inc(13353);
        // TODO Auto-generated method stub
        __CLR4_5_2a6ia6ilx1h8lwc.R.inc(13354);return null;
    }finally{__CLR4_5_2a6ia6ilx1h8lwc.R.flushNeeded();}}
}

// this code left here in case we want to use it in the future. it is for
// calculating how many parts there are based on the first and last reference hole.
//// figure out how many parts there should be by taking the delta
//// between the two holes and dividing it by part pitch
// double holeToHoleDistance = lastHoleLocation.getLinearDistanceTo(referenceHoleLocation);
//// take the ceil of the distance to account for any minor offset from
//// center of the hole
// holeToHoleDistance = Math.ceil(holeToHoleDistance);
// double partPitch = this.partPitch.convertToUnits(lastHoleLocation.getUnits()).getValue();
//// And floor the part count because you can't have a partial part.
// double partCount = Math.floor(holeToHoleDistance / partPitch);
//
//// if (feedCount > partCount) {
//// throw new Exception(String.format("No more parts available in feeder %s", getName()));
//// }
//
