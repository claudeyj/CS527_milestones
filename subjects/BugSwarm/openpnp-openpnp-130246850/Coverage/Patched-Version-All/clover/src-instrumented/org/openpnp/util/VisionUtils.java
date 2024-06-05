/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;

public class VisionUtils {public static class __CLR4_5_2f2gf2glx1h8p0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,19558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Given pixel coordinates within the frame of the Camera's image, get the offsets from Camera
     * center to the coordinates in Camera space and units. The resulting value is the distance the
     * Camera can be moved to be centered over the pixel coordinates.
     * 
     * Example: If the x, y coordinates describe a position above and to the left of the center of
     * the camera the offsets will be -,+.
     * 
     * If the coordinates position are below and to the right of center the offsets will be +, -.
     * 
     * Calling camera.getLocation().add(getPixelCenterOffsets(...) will give you the location of x,
     * y with respect to the center of the camera.
     * 
     * @param camera
     * @param x
     * @param y
     * @return
     */
    public static Location getPixelCenterOffsets(Camera camera, double x, double y) {try{__CLR4_5_2f2gf2glx1h8p0h.R.inc(19528);
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19529);double imageWidth = camera.getWidth();
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19530);double imageHeight = camera.getHeight();

        // Calculate the difference between the center of the image to the
        // center of the match.
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19531);double offsetX = x - (imageWidth / 2);
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19532);double offsetY = (imageHeight / 2) - y;

        // And convert pixels to units
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19533);Location unitsPerPixel = camera.getUnitsPerPixel();
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19534);offsetX *= unitsPerPixel.getX();
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19535);offsetY *= unitsPerPixel.getY();

        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19536);return new Location(camera.getUnitsPerPixel().getUnits(), offsetX, offsetY, 0, 0);
    }finally{__CLR4_5_2f2gf2glx1h8p0h.R.flushNeeded();}}

    /**
     * Get the Location of a set of pixel coordinates referenced to the center of the given camera.
     * This is a helper method that simply adds the offsets from
     * {@link VisionUtils#getPixelCenterOffsets(Camera, double, double)} to the Camera's current
     * location.
     * 
     * @param camera
     * @param x
     * @param y
     * @return
     */
    public static Location getPixelLocation(Camera camera, double x, double y) {try{__CLR4_5_2f2gf2glx1h8p0h.R.inc(19537);
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19538);return camera.getLocation().add(getPixelCenterOffsets(camera, x, y));
    }finally{__CLR4_5_2f2gf2glx1h8p0h.R.flushNeeded();}}

    public static List<Location> sortLocationsByDistance(final Location origin,
            List<Location> locations) {try{__CLR4_5_2f2gf2glx1h8p0h.R.inc(19539);
        // sort the results by distance from center ascending
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19540);Collections.sort(locations, new Comparator<Location>() {
            public int compare(Location o1, Location o2) {try{__CLR4_5_2f2gf2glx1h8p0h.R.inc(19541);
                __CLR4_5_2f2gf2glx1h8p0h.R.inc(19542);Double o1d = origin.getLinearDistanceTo(o1);
                __CLR4_5_2f2gf2glx1h8p0h.R.inc(19543);Double o2d = origin.getLinearDistanceTo(o2);
                __CLR4_5_2f2gf2glx1h8p0h.R.inc(19544);return o1d.compareTo(o2d);
            }finally{__CLR4_5_2f2gf2glx1h8p0h.R.flushNeeded();}}
        });
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19545);return locations;
    }finally{__CLR4_5_2f2gf2glx1h8p0h.R.flushNeeded();}}
    
    public static Camera getBottomVisionCamera() throws Exception {try{__CLR4_5_2f2gf2glx1h8p0h.R.inc(19546);
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19547);for (Camera camera : Configuration.get().getMachine().getCameras()) {{
            __CLR4_5_2f2gf2glx1h8p0h.R.inc(19548);if ((((camera.getLooking() == Camera.Looking.Up)&&(__CLR4_5_2f2gf2glx1h8p0h.R.iget(19549)!=0|true))||(__CLR4_5_2f2gf2glx1h8p0h.R.iget(19550)==0&false))) {{
                __CLR4_5_2f2gf2glx1h8p0h.R.inc(19551);return camera;
            }
        }}
        }__CLR4_5_2f2gf2glx1h8p0h.R.inc(19552);throw new Exception("No up-looking camera found on the machine to use for bottom vision.");
    }finally{__CLR4_5_2f2gf2glx1h8p0h.R.flushNeeded();}}
    
    public static double toPixels(Length length, Camera camera) {try{__CLR4_5_2f2gf2glx1h8p0h.R.inc(19553);
        // convert inputs to the same units
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19554);Location unitsPerPixel = camera.getUnitsPerPixel();
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19555);length = length.convertToUnits(unitsPerPixel.getUnits());

        // we average the units per pixel because circles can't be ovals
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19556);double avgUnitsPerPixel = (unitsPerPixel.getX() + unitsPerPixel.getY()) / 2;

        // convert it all to pixels
        __CLR4_5_2f2gf2glx1h8p0h.R.inc(19557);return length.getValue() / avgUnitsPerPixel;
    }finally{__CLR4_5_2f2gf2glx1h8p0h.R.flushNeeded();}}
}
