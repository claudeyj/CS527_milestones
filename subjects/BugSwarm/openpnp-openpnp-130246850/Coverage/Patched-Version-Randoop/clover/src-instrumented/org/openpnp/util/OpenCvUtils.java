/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.util;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenCvUtils {public static class __CLR4_5_2ev2ev2lx1h78vr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,19386,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(OpenCvUtils.class);

    static {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19262);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19263);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19264);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    /**
     * TODO: This probably doesn't work right on submats. Need to test and fix.
     * 
     * @param m
     * @return
     */
    public static BufferedImage toBufferedImage(Mat m) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19265);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19266);Integer type = null;
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19267);if ((((m.type() == CvType.CV_8UC1)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19268)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19269)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19270);type = BufferedImage.TYPE_BYTE_GRAY;
        }
        }else {__CLR4_5_2ev2ev2lx1h78vr.R.inc(19271);if ((((m.type() == CvType.CV_8UC3)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19272)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19273)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19274);type = BufferedImage.TYPE_3BYTE_BGR;
        }
        }else {__CLR4_5_2ev2ev2lx1h78vr.R.inc(19275);if ((((m.type() == CvType.CV_32F)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19276)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19277)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19278);type = BufferedImage.TYPE_BYTE_GRAY;
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19279);Mat tmp = new Mat();
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19280);m.convertTo(tmp, CvType.CV_8UC1, 255);
            // Copy the results into the original Mat and release our temp copy so that when
            // the caller releases the original Mat there is no memory leak.
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19281);tmp.copyTo(m);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19282);tmp.release();
        }
        }}}__CLR4_5_2ev2ev2lx1h78vr.R.inc(19283);if ((((type == null)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19284)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19285)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19286);throw new Error(String.format("Unsupported Mat: type %d, channels %d, depth %d",
                    m.type(), m.channels(), m.depth()));
        }
        }__CLR4_5_2ev2ev2lx1h78vr.R.inc(19287);BufferedImage image = new BufferedImage(m.cols(), m.rows(), type);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19288);m.get(0, 0, ((DataBufferByte) image.getRaster().getDataBuffer()).getData());
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19289);return image;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    public static Mat toMat(BufferedImage img) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19290);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19291);Integer type = null;
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19292);if ((((img.getType() == BufferedImage.TYPE_BYTE_GRAY)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19293)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19294)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19295);type = CvType.CV_8UC1;
        }
        }else {__CLR4_5_2ev2ev2lx1h78vr.R.inc(19296);if ((((img.getType() == BufferedImage.TYPE_3BYTE_BGR)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19297)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19298)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19299);type = CvType.CV_8UC3;
        }
        }else {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19300);img = ImageUtils.convertBufferedImage(img, BufferedImage.TYPE_3BYTE_BGR);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19301);type = CvType.CV_8UC3;
        }
        }}__CLR4_5_2ev2ev2lx1h78vr.R.inc(19302);Mat mat = new Mat(img.getHeight(), img.getWidth(), type);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19303);mat.put(0, 0, ((DataBufferByte) img.getRaster().getDataBuffer()).getData());
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19304);return mat;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    /**
     * Finds circles of the given min and maxDiameter, no less than minDistance apart by capturing
     * an image from the given Camera. Results are returned as a List of Location where X and Y
     * represent the center of the circle, Z is that of the Camera and rotation is the diameter of
     * the circle found. Results are returned sorted by distance from the Camera Location in
     * ascending order.
     * 
     * @param camera
     * @param minDiameter
     * @param maxDiameter
     * @param minDistance
     * @return
     * @throws Exception
     */
    public static List<Location> houghCircles(Camera camera, Length minDiameter, Length maxDiameter,
            Length minDistance) throws Exception {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19305);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19306);logger.debug("houghCircles({}, {}, {}, {})",
                new Object[] {camera.getName(), minDiameter, maxDiameter, minDistance});

        // convert inputs to the same units
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19307);Location unitsPerPixel = camera.getUnitsPerPixel();
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19308);minDiameter = minDiameter.convertToUnits(unitsPerPixel.getUnits());
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19309);maxDiameter = maxDiameter.convertToUnits(unitsPerPixel.getUnits());
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19310);minDistance = minDistance.convertToUnits(unitsPerPixel.getUnits());

        // we average the units per pixel because circles can't be ovals
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19311);double avgUnitsPerPixel = (unitsPerPixel.getX() + unitsPerPixel.getY()) / 2;

        // convert it all to pixels
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19312);double minDiameterPixels = minDiameter.getValue() / avgUnitsPerPixel;
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19313);double maxDiameterPixels = maxDiameter.getValue() / avgUnitsPerPixel;
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19314);double minDistancePixels = minDistance.getValue() / avgUnitsPerPixel;

        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19315);BufferedImage image = camera.capture();
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19316);Mat mat = toMat(image);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19317);Mat circles = houghCircles(mat, minDiameterPixels, maxDiameterPixels, minDistancePixels);

        // convert the results into Locations
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19318);List<Location> locations = new ArrayList<>();
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19319);for (int i = 0; (((i < circles.cols())&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19320)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19321)==0&false)); i++) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19322);double[] circle = circles.get(0, i);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19323);double x = circle[0];
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19324);double y = circle[1];
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19325);double radius = circle[2];
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19326);Location location = VisionUtils.getPixelLocation(camera, x, y);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19327);location = location.derive(null, null, null, radius * 2 * avgUnitsPerPixel);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19328);locations.add(location);
        }

        // sort by distance from center
        }__CLR4_5_2ev2ev2lx1h78vr.R.inc(19329);locations = VisionUtils.sortLocationsByDistance(camera.getLocation(), locations);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19330);return locations;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    public static Mat houghCircles(Mat mat, double minDiameter, double maxDiameter,
            double minDistance) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19331);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19332);logger.debug("houghCircles(Mat, {}, {}, {})",
                new Object[] {minDiameter, maxDiameter, minDistance});

        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19333);saveDebugImage("houghCircles_in", mat);

        // save a copy of the image for debugging
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19334);Mat debug = mat.clone();

        // hough requires grayscale images
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19335);mat = toGray(mat);

        // and prefers a blurred image
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19336);mat = gaussianBlur(mat, 9);

        // run the houghcircles algorithm
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19337);Mat circles = new Mat();
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19338);Imgproc.HoughCircles(mat, circles, Imgproc.CV_HOUGH_GRADIENT, 1, minDistance, 80, 10,
                (int) (minDiameter / 2), (int) (maxDiameter / 2));

        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19339);if ((((logger.isDebugEnabled())&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19340)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19341)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19342);drawCircles(debug, circles);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19343);saveDebugImage("houghCircles_debug", debug);
        }

        }__CLR4_5_2ev2ev2lx1h78vr.R.inc(19344);saveDebugImage("houghCircles_out", mat);

        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19345);return circles;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    /**
     * Convert the given Mat to grayscale. Conversion is done in place and if the Mat is already
     * grayscale nothing is done.
     * 
     * @param mat
     * @return
     */
    public static Mat toGray(Mat mat) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19346);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19347);if ((((mat.channels() == 1)&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19348)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19349)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19350);return mat;
        }
        }__CLR4_5_2ev2ev2lx1h78vr.R.inc(19351);Imgproc.cvtColor(mat, mat, Imgproc.COLOR_BGR2GRAY);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19352);return mat;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    /**
     * Perform an in place gaussian blur on the given Mat with a kernel of size kernel x kernel.
     * 
     * @param mat
     * @param kernel
     * @return
     */
    public static Mat gaussianBlur(Mat mat, int kernel) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19353);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19354);Imgproc.GaussianBlur(mat, mat, new Size(kernel, kernel), 0);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19355);return mat;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    public static Mat drawCircles(Mat mat, Mat circles) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19356);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19357);for (int i = 0; (((i < circles.cols())&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19358)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19359)==0&false)); i++) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19360);double[] circle = circles.get(0, i);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19361);double x = circle[0];
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19362);double y = circle[1];
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19363);double radius = circle[2];
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19364);Core.circle(mat, new Point(x, y), (int) radius, new Scalar(0, 0, 255, 255), 2);
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19365);Core.circle(mat, new Point(x, y), 1, new Scalar(0, 255, 0, 255), 2);
        }
        }__CLR4_5_2ev2ev2lx1h78vr.R.inc(19366);return mat;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    public static Mat thresholdAdaptive(Mat mat, boolean invert) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19367);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19368);Imgproc.adaptiveThreshold(mat, mat, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C,
                (((invert )&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19369)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19370)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY, 3, 5);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19371);return mat;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    public static Mat thresholdOtsu(Mat mat, boolean invert) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19372);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19373);Imgproc.threshold(mat, mat, 0, 255,
                ((((invert )&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19374)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19375)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY) | Imgproc.THRESH_OTSU);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19376);return mat;
    }finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}

    public static void saveDebugImage(String name, Mat mat) {try{__CLR4_5_2ev2ev2lx1h78vr.R.inc(19377);
        __CLR4_5_2ev2ev2lx1h78vr.R.inc(19378);if ((((logger.isDebugEnabled())&&(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19379)!=0|true))||(__CLR4_5_2ev2ev2lx1h78vr.R.iget(19380)==0&false))) {{
            __CLR4_5_2ev2ev2lx1h78vr.R.inc(19381);try {
                __CLR4_5_2ev2ev2lx1h78vr.R.inc(19382);BufferedImage debugImage = OpenCvUtils.toBufferedImage(mat);
                __CLR4_5_2ev2ev2lx1h78vr.R.inc(19383);File file = Configuration.get().createResourceFile(OpenCvUtils.class, name + "_",
                        ".png");
                __CLR4_5_2ev2ev2lx1h78vr.R.inc(19384);ImageIO.write(debugImage, "PNG", file);
            }
            catch (Exception e) {
                __CLR4_5_2ev2ev2lx1h78vr.R.inc(19385);e.printStackTrace();
            }
        }
    }}finally{__CLR4_5_2ev2ev2lx1h78vr.R.flushNeeded();}}
}
