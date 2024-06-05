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
 * Changelog: 03/10/2012 Ami: Add rotate using center point
 */

package org.openpnp.util;

import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Location;
import org.openpnp.model.Point;


public class Utils2D {public static class __CLR4_5_2f0jf0jlx1h8ozs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,19528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Point rotateTranslateScalePoint(Point point, double c, double x, double y,
            double scaleX, double scaleY) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19459);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19460);point = rotatePoint(point, c);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19461);point = translatePoint(point, x, y);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19462);point = scalePoint(point, scaleX, scaleY);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19463);return point;
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    public static Point rotateTranslateCenterPoint(Point point, double c, double x, double y,
            Point center) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19464);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19465);point = translatePoint(point, center.getX() * -1, center.getY() * -1);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19466);point = rotatePoint(point, c);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19467);point = translatePoint(point, center.getX(), center.getY());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19468);point = translatePoint(point, x, y);

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19469);return point;
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    public static Point translatePoint(Point point, double x, double y) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19470);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19471);return new Point(point.getX() + x, point.getY() + y);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    /**
     * Rotation is counter-clockwise for positive angles.
     * 
     * @param point
     * @param c
     * @return
     */
    public static Point rotatePoint(Point point, double c) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19472);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19473);double x = point.getX();
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19474);double y = point.getY();

        // convert degrees to radians
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19475);c = Math.toRadians(c);

        // rotate the points
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19476);double xn = x * Math.cos(c) - y * Math.sin(c);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19477);double yn = x * Math.sin(c) + y * Math.cos(c);

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19478);x = xn;
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19479);y = yn;

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19480);return new Point(x, y);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    public static Point scalePoint(Point point, double scaleX, double scaleY) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19481);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19482);return new Point(point.getX() * scaleX, point.getY() * scaleY);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    public static Location calculateBoardPlacementLocation(BoardLocation bl,
            Location placementLocation) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19483);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19484);return calculateBoardPlacementLocation(bl.getLocation(), bl.getSide(),
                bl.getBoard().getDimensions().getX(), placementLocation);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    public static Location calculateBoardPlacementLocation(Location boardLocation, Side side,
            double offset, Location placementLocation) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19485);
        // We will work in the units of the placementLocation, so convert
        // anything that isn't in those units to it.
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19486);boardLocation = boardLocation.convertToUnits(placementLocation.getUnits());

        // If we are placing the bottom of the board we need to invert
        // the placement location.
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19487);if ((((side == Side.Bottom)&&(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19488)!=0|true))||(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19489)==0&false))) {{
            __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19490);placementLocation = placementLocation.invert(true, false, false, false)
                    .add(new Location(placementLocation.getUnits(), offset, 0.0, 0.0, 0.0));
        }

        // Rotate and translate the point into the same coordinate space
        // as the board
        }__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19491);placementLocation = placementLocation.rotateXy(boardLocation.getRotation())
                .addWithRotation(boardLocation);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19492);return placementLocation;
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}


    public static Location calculateBoardPlacementLocationInverse(BoardLocation boardLocation,
            Location placementLocation) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19493);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19494);return calculateBoardPlacementLocationInverse(boardLocation.getLocation(),
                boardLocation.getSide(), boardLocation.getBoard().getDimensions().getX(),
                placementLocation);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    public static Location calculateBoardPlacementLocationInverse(Location boardLocation, Side side,
            double offset, Location placementLocation) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19495);
        // inverse steps of calculateBoardPlacementLocation
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19496);boardLocation = boardLocation.convertToUnits(placementLocation.getUnits());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19497);placementLocation = placementLocation.subtractWithRotation(boardLocation)
                .rotateXy(-boardLocation.getRotation());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19498);if ((((side == Side.Bottom)&&(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19499)!=0|true))||(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19500)==0&false))) {{
            __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19501);placementLocation = placementLocation.invert(true, false, false, false)
                    .add(new Location(placementLocation.getUnits(), offset, 0.0, 0.0, 0.0));
        }
        }__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19502);return placementLocation;
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    /**
     * Given two "ideal" unrotated and unoffset Locations and two matching "actual" Locations that
     * have been offset and rotated, calculate the angle of rotation and offset between them.
     * 
     * Angle is the difference between the angles between the two ideal Locations and the two actual
     * Locations.
     * 
     * Offset is the difference between one of the ideal Locations having been rotated by Angle and
     * the matching actual Location.
     * 
     * @deprecated (2016/01/30) Please see calculateAngleAndOffset2. This function is no longer used
     *             in the core codebase, but it's being left here in case other users have
     *             incorporated it into their changes. It may be removed in the future.
     * 
     * @param idealA
     * @param idealB
     * @param actualA
     * @param actualB
     * @return
     */
    public static Location calculateAngleAndOffset(Location idealA, Location idealB,
            Location actualA, Location actualB) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19503);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19504);idealB = idealB.convertToUnits(idealA.getUnits());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19505);actualA = actualA.convertToUnits(idealA.getUnits());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19506);actualB = actualB.convertToUnits(idealA.getUnits());

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19507);double angle = Math.toDegrees(
                Math.atan2(actualA.getY() - actualB.getY(), actualA.getX() - actualB.getX())
                        - Math.atan2(idealA.getY() - idealB.getY(), idealA.getX() - idealB.getX()));

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19508);Location idealARotated = idealA.rotateXy(angle);

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19509);Location offset = actualA.subtract(idealARotated);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19510);while ((((angle < -180.)&&(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19511)!=0|true))||(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19512)==0&false))) {{
            __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19513);angle += 360;
        }
        }__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19514);while ((((angle > 180.)&&(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19515)!=0|true))||(__CLR4_5_2f0jf0jlx1h8ozs.R.iget(19516)==0&false))) {{
            __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19517);angle -= 360;
        }

        }__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19518);return new Location(idealA.getUnits(), offset.getX(), offset.getY(), 0, angle);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}

    /**
     * Given two "ideal" Locations and two matching "actual" Locations calculate the difference in
     * rotation and offset between them.
     * 
     * Angle is the difference in angle between the line through the two ideal Locations and the
     * line through the two actual locations.
     * 
     * Offset is the difference in position of the first ideal and first actual Location.
     * 
     * This function differs from calculateAngleAndOffset in that it expects the ideal and actual
     * locations to be close to each other, and instead of returning the total offset and angle this
     * function only returns the difference between the ideal and actual.
     * 
     * This function is intended to be used with the fiducial checker and has been tested with it.
     * The function above used to be used for the fidicual checker but did not handle bottom
     * coordinates correctly and it's still not clear why.
     * 
     * @param idealA
     * @param idealB
     * @param actualA
     * @param actualB
     * @return
     */
    public static Location calculateAngleAndOffset2(Location idealA, Location idealB,
            Location actualA, Location actualB) {try{__CLR4_5_2f0jf0jlx1h8ozs.R.inc(19519);
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19520);idealB = idealB.convertToUnits(idealA.getUnits());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19521);actualA = actualA.convertToUnits(idealA.getUnits());
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19522);actualB = actualB.convertToUnits(idealA.getUnits());

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19523);double idealAngle = Math.toDegrees(
                Math.atan2(idealB.getY() - idealA.getY(), idealB.getX() - idealA.getX()));
        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19524);double actualAngle = Math.toDegrees(
                Math.atan2(actualB.getY() - actualA.getY(), actualB.getX() - actualA.getX()));

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19525);double angle = actualAngle - idealAngle;

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19526);Location offset = actualA.subtract(idealA);

        __CLR4_5_2f0jf0jlx1h8ozs.R.inc(19527);return new Location(idealA.getUnits(), offset.getX(), offset.getY(), 0, angle);
    }finally{__CLR4_5_2f0jf0jlx1h8ozs.R.flushNeeded();}}
}
