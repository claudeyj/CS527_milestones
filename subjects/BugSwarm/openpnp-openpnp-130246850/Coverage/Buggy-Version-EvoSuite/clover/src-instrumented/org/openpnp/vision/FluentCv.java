/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2015 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is part of OpenPnP.
 * 
 * You may use this file under either the GPLv3 License or the MIT License at your preference.
 * Functions in OpenPnP that this file rely on are also available under these terms. See the two
 * licenses below.
 * 
 * GPLv3 License Terms -------------------
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
 * 
 * MIT License Terms -----------------
 * 
 * The MIT License (MIT)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.openpnp.vision;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import javax.imageio.ImageIO;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.utils.Converters;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.util.HslColor;
import org.openpnp.util.VisionUtils;

/**
 * A fluent API for some of the most commonly used OpenCV primitives. Successive operations modify a
 * running Mat. By specifying a tag on an operation the result of the operation will be stored and
 * can be recalled back into the current Mat.
 * 
 * Heavily influenced by FireSight by Karl Lew https://github.com/firepick1/FireSight
 * 
 * In the spirit of FireSight, this code is licensed differently from the rest of OpenPnP. Please
 * see the license header above.
 * 
 * WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING This API is still under heavy
 * development and is likely to change significantly in the near future.
 * 
 * TODO: Rethink operations that return or process data points versus images. Perhaps these should
 * require a tag to work with and leave the image unchanged.
 * 
 * There is a bit of a divergence right now between how things like contours and rotated rects are
 * handled versus circles. Circles already have a Mat representation that we can kind of coerce
 * along the pipeline where contours do not (List<MatOfPoint>). We need to pick one of the methods
 * and stick with it, doing translation where needed.
 * 
 * Keeping things in Mat does give the benefit of not moving too much memory between OpenCv and
 * Java.
 */
public class FluentCv {public static class __CLR4_5_2f3if3ilx1h0fx0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,19978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19566);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19567);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19568);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public enum ColorCode {
        Bgr2Gray(Imgproc.COLOR_BGR2GRAY),
        Rgb2Gray(Imgproc.COLOR_RGB2GRAY),
        Gray2Bgr(Imgproc.COLOR_GRAY2BGR),
        Gray2Rgb(Imgproc.COLOR_GRAY2RGB),
        Bgr2Hls(Imgproc.COLOR_BGR2HLS),
        Hls2Bgr(Imgproc.COLOR_HLS2BGR),
        Bgr2HlsFull(Imgproc.COLOR_BGR2HLS_FULL),
        Hls2BgrFull(Imgproc.COLOR_HLS2BGR_FULL),
        Bgr2Hsv(Imgproc.COLOR_BGR2HSV),
        Hsv2Bgr(Imgproc.COLOR_HSV2BGR),
        Bgr2HsvFull(Imgproc.COLOR_BGR2HSV_FULL),
        Hsv2BgrFull(Imgproc.COLOR_HSV2BGR_FULL);

        private int code;

        ColorCode(int code) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19569);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19570);this.code = code;
        }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

        public int getCode() {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19571);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19572);return code;
        }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}
    }

    private LinkedHashMap<String, Mat> stored = new LinkedHashMap<>();
    private Mat mat = new Mat();
    private Camera camera;

    public FluentCv toMat(BufferedImage img, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19573);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19574);Integer type = null;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19575);if ((((img.getType() == BufferedImage.TYPE_BYTE_GRAY)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19576)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19577)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19578);type = CvType.CV_8UC1;
        }
        }else {__CLR4_5_2f3if3ilx1h0fx0.R.inc(19579);if ((((img.getType() == BufferedImage.TYPE_3BYTE_BGR)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19580)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19581)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19582);type = CvType.CV_8UC3;
        }
        }else {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19583);img = convertBufferedImage(img, BufferedImage.TYPE_3BYTE_BGR);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19584);type = CvType.CV_8UC3;
        }
        }}__CLR4_5_2f3if3ilx1h0fx0.R.inc(19585);Mat mat = new Mat(img.getHeight(), img.getWidth(), type);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19586);mat.put(0, 0, ((DataBufferByte) img.getRaster().getDataBuffer()).getData());
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19587);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv toGray(String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19588);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19589);return convertColor(ColorCode.Bgr2Gray, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv toColor(String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19590);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19591);return convertColor(ColorCode.Gray2Bgr, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv convertColor(ColorCode code, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19592);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19593);return convertColor(code.getCode(), tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv convertColor(int code, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19594);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19595);Imgproc.cvtColor(mat, mat, code);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19596);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Apply a threshold to the Mat. If the threshold value is 0 then the Otsu flag will be added
     * and the threshold value ignored. Otsu performs automatic determination of the threshold value
     * by sampling the image.
     * 
     * @param threshold
     * @param tag
     * @return
     */
    public FluentCv threshold(double threshold, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19597);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19598);return threshold(threshold, false, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv threshold(double threshold, boolean invert, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19599);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19600);int type = (((invert )&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19601)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19602)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19603);if ((((threshold == 0)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19604)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19605)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19606);type |= Imgproc.THRESH_OTSU;
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19607);Imgproc.threshold(mat, mat, threshold, 255, type);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19608);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv thresholdAdaptive(String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19609);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19610);return thresholdAdaptive(false, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv thresholdAdaptive(boolean invert, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19611);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19612);Imgproc.adaptiveThreshold(mat, mat, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C,
                (((invert )&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19613)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19614)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY, 3, 5);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19615);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv blurGaussian(int kernelSize, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19616);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19617);Imgproc.GaussianBlur(mat, mat, new Size(kernelSize, kernelSize), 0);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19618);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv blurMedian(int kernelSize, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19619);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19620);Imgproc.medianBlur(mat, mat, kernelSize);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19621);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv findCirclesHough(Length minDiameter, Length maxDiameter, Length minDistance,
            String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19622);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19623);checkCamera();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19624);return findCirclesHough((int) VisionUtils.toPixels(minDiameter, camera),
                (int) VisionUtils.toPixels(maxDiameter, camera),
                (int) VisionUtils.toPixels(minDistance, camera), tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv findCirclesHough(int minDiameter, int maxDiameter, int minDistance,
            String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19625);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19626);Mat circles = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19627);Imgproc.HoughCircles(mat, circles, Imgproc.CV_HOUGH_GRADIENT, 1, minDistance, 80, 10,
                minDiameter / 2, maxDiameter / 2);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19628);store(circles, tag);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19629);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv convertCirclesToPoints(List<Point> points) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19630);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19631);for (int i = 0; (((i < mat.cols())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19632)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19633)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19634);double[] circle = mat.get(0, i);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19635);double x = circle[0];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19636);double y = circle[1];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19637);points.add(new Point(x, y));
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19638);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv convertCirclesToLocations(List<Location> locations) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19639);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19640);checkCamera();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19641);Location unitsPerPixel =
                camera.getUnitsPerPixel().convertToUnits(camera.getLocation().getUnits());
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19642);double avgUnitsPerPixel = (unitsPerPixel.getX() + unitsPerPixel.getY()) / 2;

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19643);for (int i = 0; (((i < mat.cols())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19644)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19645)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19646);double[] circle = mat.get(0, i);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19647);double x = circle[0];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19648);double y = circle[1];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19649);double radius = circle[2];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19650);Location location = VisionUtils.getPixelLocation(camera, x, y);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19651);location = location.derive(null, null, null, radius * 2 * avgUnitsPerPixel);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19652);locations.add(location);
        }

        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19653);VisionUtils.sortLocationsByDistance(camera.getLocation(), locations);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19654);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Draw circles from the current Mat contained onto the Mat specified in baseTag using the
     * specified color, optionally storing the results in tag. The current Mat is replaced with the
     * Mat from baseTag with the circles drawn on top of it.
     * 
     * @param baseTag
     * @param color
     * @param tag
     * @return
     */
    public FluentCv drawCircles(String baseTag, Color color, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19655);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19656);Color centerColor = new HslColor(color).getComplementary();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19657);Mat mat = get(baseTag);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19658);if ((((mat == null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19659)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19660)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19661);mat = new Mat();
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19662);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19663)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19664)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19665);double[] circle = this.mat.get(0, i);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19666);double x = circle[0];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19667);double y = circle[1];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19668);double radius = circle[2];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19669);Core.circle(mat, new Point(x, y), (int) radius, colorToScalar(color), 2);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19670);Core.circle(mat, new Point(x, y), 1, colorToScalar(centerColor), 2);
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19671);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Draw circles from the current Mat contained onto the Mat specified in baseTag using the color
     * red, optionally storing the results in tag. The current Mat is replaced with the Mat from
     * baseTag with the circles drawn on top of it.
     * 
     * @param baseTag
     * @param tag
     * @return
     */
    public FluentCv drawCircles(String baseTag, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19672);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19673);return drawCircles(baseTag, Color.red, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv recall(String tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19674);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19675);mat = get(tag);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19676);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv store(String tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19677);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19678);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public List<String> getStoredTags() {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19679);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19680);return new ArrayList<>(stored.keySet());
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv write(File file) throws Exception {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19681);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19682);ImageIO.write(toBufferedImage(), "PNG", file);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19683);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv read(File file, String... tag) throws Exception {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19684);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19685);return toMat(ImageIO.read(file), tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public BufferedImage toBufferedImage() {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19686);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19687);Integer type = null;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19688);if ((((mat.type() == CvType.CV_8UC1)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19689)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19690)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19691);type = BufferedImage.TYPE_BYTE_GRAY;
        }
        }else {__CLR4_5_2f3if3ilx1h0fx0.R.inc(19692);if ((((mat.type() == CvType.CV_8UC3)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19693)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19694)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19695);type = BufferedImage.TYPE_3BYTE_BGR;
        }
        }else {__CLR4_5_2f3if3ilx1h0fx0.R.inc(19696);if ((((mat.type() == CvType.CV_32F)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19697)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19698)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19699);type = BufferedImage.TYPE_BYTE_GRAY;
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19700);Mat tmp = new Mat();
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19701);mat.convertTo(tmp, CvType.CV_8UC1, 255);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19702);mat = tmp;
        }
        }}}__CLR4_5_2f3if3ilx1h0fx0.R.inc(19703);if ((((type == null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19704)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19705)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19706);throw new Error(String.format("Unsupported Mat: type %d, channels %d, depth %d",
                    mat.type(), mat.channels(), mat.depth()));
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19707);BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19708);mat.get(0, 0, ((DataBufferByte) image.getRaster().getDataBuffer()).getData());
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19709);return image;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv settleAndCapture(String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19710);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19711);checkCamera();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19712);return toMat(camera.settleAndCapture(), tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Set a Camera that can be used for calculations that require a Camera Location or units per
     * pixel.
     * 
     * @param camera
     * @return
     */
    public FluentCv setCamera(Camera camera) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19713);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19714);this.camera = camera;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19715);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv filterCirclesByDistance(Length minDistance, Length maxDistance, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19716);

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19717);double minDistancePx = VisionUtils.toPixels(minDistance, camera);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19718);double maxDistancePx = VisionUtils.toPixels(maxDistance, camera);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19719);return filterCirclesByDistance(camera.getWidth() / 2, camera.getHeight() / 2, minDistancePx,
                maxDistancePx, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv filterCirclesByDistance(double originX, double originY, double minDistance,
            double maxDistance, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19720);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19721);List<float[]> results = new ArrayList<>();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19722);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19723)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19724)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19725);float[] circle = new float[3];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19726);this.mat.get(0, i, circle);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19727);float x = circle[0];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19728);float y = circle[1];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19729);float radius = circle[2];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19730);double distance = Math.sqrt(Math.pow(x - originX, 2) + Math.pow(y - originY, 2));
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19731);if ((((distance >= minDistance && distance <= maxDistance)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19732)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19733)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19734);results.add(new float[] {x, y, radius});
            }
        }}
        // It really seems like there must be a better way to do this, but after hours
        // and hours of trying I can't find one. How the hell do you append an element
        // of 3 channels to a Mat?!
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19735);Mat r = new Mat(1, results.size(), CvType.CV_32FC3);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19736);for (int i = 0; (((i < results.size())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19737)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19738)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19739);r.put(0, i, results.get(i));
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19740);return store(r, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv filterCirclesToLine(Length maxDistance, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19741);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19742);return filterCirclesToLine(VisionUtils.toPixels(maxDistance, camera), tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Filter circles as returned from e.g. houghCircles to only those that are within maxDistance
     * of the best fitting line.
     * 
     * @param tag
     * @return
     */
    public FluentCv filterCirclesToLine(double maxDistance, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19743);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19744);if ((((this.mat.cols() < 2)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19745)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19746)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19747);return store(this.mat, tag);
        }

        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19748);List<Point> points = new ArrayList<>();
        // collect the circles into a list of points
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19749);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19750)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19751)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19752);float[] circle = new float[3];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19753);this.mat.get(0, i, circle);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19754);float x = circle[0];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19755);float y = circle[1];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19756);points.add(new Point(x, y));
        }

        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19757);Point[] line = Ransac.ransac(points, 100, maxDistance);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19758);Point a = line[0];
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19759);Point b = line[1];

        // filter the points by distance from the resulting line
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19760);List<float[]> results = new ArrayList<>();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19761);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19762)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19763)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19764);float[] circle = new float[3];
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19765);this.mat.get(0, i, circle);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19766);Point p = new Point(circle[0], circle[1]);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19767);if ((((pointToLineDistance(a, b, p) <= maxDistance)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19768)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19769)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19770);results.add(circle);
            }
        }}

        // It really seems like there must be a better way to do this, but after hours
        // and hours of trying I can't find one. How the hell do you append an element
        // of 3 channels to a Mat?!
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19771);Mat r = new Mat(1, results.size(), CvType.CV_32FC3);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19772);for (int i = 0; (((i < results.size())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19773)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19774)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19775);r.put(0, i, results.get(i));
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19776);return store(r, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public Mat mat() {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19777);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19778);return mat.clone();
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv mat(Mat mat, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19779);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19780);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Calculate the absolute difference between the previously stored Mat called source1 and the
     * current Mat.
     * 
     * @param source1
     * @param tag
     */
    public FluentCv absDiff(String source1, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19781);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19782);Core.absdiff(get(source1), mat, mat);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19783);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv findEdgesCanny(double threshold1, double threshold2, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19784);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19785);Imgproc.Canny(mat, mat, threshold1, threshold2);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19786);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv findEdgesRobertsCross(String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19787);
        // Java interpretation of
        // https://www.scss.tcd.ie/publications/book-supplements/A-Practical-Introduction-to-Computer-Vision-with-OpenCV/Code/Edges.cpp
        // Note: Java API does not have abs. This appears to be doing the
        // same thing effectively, but I am not sure it's 100% the same
        // as Cri's version.
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19788);Mat kernel = Mat.eye(new Size(2, 2), CvType.CV_32FC1);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19789);kernel.put(0, 0, 0, 1, -1, 0);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19790);Mat roberts1 = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19791);Imgproc.filter2D(mat, roberts1, CvType.CV_32FC1, kernel);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19792);Core.convertScaleAbs(roberts1, roberts1);

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19793);kernel.put(0, 0, 1, 0, 0, -1);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19794);Mat roberts2 = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19795);Imgproc.filter2D(mat, roberts2, CvType.CV_32FC1, kernel);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19796);Core.convertScaleAbs(roberts2, roberts2);

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19797);Mat roberts = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19798);Core.add(roberts1, roberts2, roberts);

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19799);return store(roberts, tag);

        // // Java interpretation of Cri S's C version.
        // // This is very slow, my fault, not his. Probably due to all the
        // // array accesses.
        // int ptr1[] = { 0, 0, 0, 0 };
        // int indexx[] = { 0, 1, 1, 0 };
        // int indexy[] = { 0, 0, 1, 1 };
        // for (int y = 0; y < mat.rows() - 1; y++) {
        // for (int x = 0; x < mat.cols() - 1; x++) {
        // int temp = 0, temp1 = 0;
        // for (int i = 0; i < 4; i++) {
        // ptr1[i] = (int) mat.get(y + indexy[i], x + indexx[i])[0]; // // ptr1[i] = *(ptr + (y +
        // indexy[i]) * gray->widthStep + x + indexx[i]);
        // }
        // temp = Math.abs(ptr1[0] - ptr1[2]);
        // temp1 = Math.abs(ptr1[1] - ptr1[3]);
        // temp = (temp > temp1 ? temp : temp1);
        // temp = (int) Math.sqrt((float) (temp * temp) + (float) (temp1 * temp1));
        // mat.put(y, x, temp); // *(ptr + y * gray->widthStep + x) = temp;
        // }
        // }
        // return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv findContours(List<MatOfPoint> contours, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19800);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19801);Mat hierarchy = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19802);Imgproc.findContours(mat, contours, hierarchy, Imgproc.RETR_LIST,
                Imgproc.CHAIN_APPROX_NONE);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19803);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv drawContours(List<MatOfPoint> contours, Color color, int thickness,
            String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19804);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19805);if ((((color == null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19806)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19807)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19808);for (int i = 0; (((i < contours.size())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19809)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19810)==0&false)); i++) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19811);Imgproc.drawContours(mat, contours, i, colorToScalar(indexedColor(i)), thickness);
            }
        }}
        }else {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19812);Imgproc.drawContours(mat, contours, -1, colorToScalar(color), thickness);
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19813);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv filterContoursByArea(List<MatOfPoint> contours, double areaMin,
            double areaMax) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19814);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19815);for (Iterator<MatOfPoint> i = contours.iterator(); (((i.hasNext())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19816)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19817)==0&false));) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19818);MatOfPoint contour = i.next();
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19819);double area = Imgproc.contourArea(contour);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19820);if ((((area < areaMin || area > areaMax)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19821)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19822)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19823);i.remove();
            }
        }}
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19824);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv drawRects(List<RotatedRect> rects, Color color, int thickness, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19825);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19826);for (int i = 0; (((i < rects.size())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19827)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19828)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19829);RotatedRect rect = rects.get(i);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19830);if ((((color == null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19831)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19832)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19833);drawRotatedRect(mat, rect, indexedColor(i), thickness);
            }
            }else {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19834);drawRotatedRect(mat, rect, color, thickness);
            }
        }}
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19835);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv getContourRects(List<MatOfPoint> contours, List<RotatedRect> rects) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19836);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19837);for (int i = 0; (((i < contours.size())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19838)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19839)==0&false)); i++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19840);MatOfPoint2f contour_ = new MatOfPoint2f();
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19841);contours.get(i).convertTo(contour_, CvType.CV_32FC2);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19842);if ((((contour_.empty())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19843)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19844)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19845);continue;
            }
            }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19846);RotatedRect rect = Imgproc.minAreaRect(contour_);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19847);rects.add(rect);
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19848);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv getContourMaxRects(List<MatOfPoint> contours, List<RotatedRect> rect) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19849);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19850);List<Point> contoursCombined = new ArrayList<>();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19851);for (MatOfPoint mp : contours) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19852);List<Point> points = new ArrayList<>();
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19853);Converters.Mat_to_vector_Point(mp, points);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19854);for (Point point : points) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19855);contoursCombined.add(point);
            }
        }}
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19856);contours.clear();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19857);MatOfPoint points = new MatOfPoint();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19858);points.fromList(contoursCombined);

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19859);return getContourRects(Collections.singletonList(points), rect);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv filterRectsByArea(List<RotatedRect> rects, double areaMin, double areaMax) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19860);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19861);for (Iterator<RotatedRect> i = rects.iterator(); (((i.hasNext())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19862)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19863)==0&false));) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19864);RotatedRect rect = i.next();
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19865);double area = rect.size.width * rect.size.height;
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19866);if ((((area < areaMin || area > areaMax)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19867)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19868)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19869);i.remove();
            }
        }}
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19870);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    private void checkCamera() {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19871);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19872);if ((((camera == null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19873)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19874)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19875);throw new Error(
                    "Call setCamera(Camera) before calling methods that rely on units per pixel.");
        }
    }}finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    private FluentCv store(Mat mat, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19876);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19877);this.mat = mat;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19878);if ((((tag != null && tag.length > 0)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19879)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19880)==0&false))) {{
            // Clone so that future writes to the pipeline Mat
            // don't overwrite our stored one.
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19881);mat = stored.get(tag[0]);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19882);if ((((mat != null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19883)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19884)==0&false))) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19885);mat.release();
            }
            }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19886);stored.put(tag[0], this.mat.clone());
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19887);return this;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public FluentCv floodFill(Point seedPoint, Color color, String... tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19888);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19889);Mat mask = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19890);Imgproc.floodFill(mat, mask, seedPoint, colorToScalar(color));
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19891);return store(mat, tag);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    private Mat get(String tag) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19892);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19893);Mat mat = stored.get(tag);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19894);if ((((mat == null)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19895)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19896)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19897);return null;
        }
        // Clone so that future writes to the pipeline Mat
        // don't overwrite our stored one.
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19898);return mat.clone();
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public static Scalar colorToScalar(Color color) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19899);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19900);return new Scalar(color.getBlue(), color.getGreen(), color.getRed(), 255);
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Return a Color from an imaginary list of colors starting at index 0 and extending on to
     * Integer.MAX_VALUE. Can be used to pick a different color for each object in a list. Colors
     * are not guaranteed to be unique but successive colors will be significantly different from
     * each other.
     * 
     * @param i
     * @return
     */
    public static Color indexedColor(int i) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19901);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19902);float h = (i * 59) % 360;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19903);float s = Math.max((i * i) % 100, 80);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19904);float l = Math.max((i * i) % 100, 50);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19905);Color color = new HslColor(h, s, l).getRGB();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19906);return color;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    public static BufferedImage convertBufferedImage(BufferedImage src, int type) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19907);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19908);if ((((src.getType() == type)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19909)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19910)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19911);return src;
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19912);BufferedImage img = new BufferedImage(src.getWidth(), src.getHeight(), type);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19913);Graphics2D g2d = img.createGraphics();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19914);g2d.drawImage(src, 0, 0, null);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19915);g2d.dispose();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19916);return img;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    // From http://www.ahristov.com/tutorial/geometry-games/point-line-distance.html
    public static double pointToLineDistance(Point A, Point B, Point P) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19917);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19918);double normalLength = Math.sqrt((B.x - A.x) * (B.x - A.x) + (B.y - A.y) * (B.y - A.y));
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19919);return Math.abs((P.x - A.x) * (B.y - A.y) - (P.y - A.y) * (B.x - A.x)) / normalLength;
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * Draw the infinite line defined by the two points to the extents of the image instead of just
     * between the two points. From:
     * http://stackoverflow.com/questions/13160722/how-to-draw-line-not-line-segment-opencv-2-4-2
     * 
     * @param img
     * @param p1
     * @param p2
     * @param color
     */
    public static void infiniteLine(Mat img, Point p1, Point p2, Color color) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19920);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19921);Point p = new Point(), q = new Point();
        // Check if the line is a vertical line because vertical lines don't
        // have slope
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19922);if ((((p1.x != p2.x)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19923)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19924)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19925);p.x = 0;
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19926);q.x = img.cols();
            // Slope equation (y1 - y2) / (x1 - x2)
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19927);float m = (float) ((p1.y - p2.y) / (p1.x - p2.x));
            // Line equation: y = mx + b
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19928);float b = (float) (p1.y - (m * p1.x));
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19929);p.y = m * p.x + b;
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19930);q.y = m * q.x + b;
        }
        }else {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19931);p.x = q.x = p2.x;
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19932);p.y = 0;
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19933);q.y = img.rows();
        }
        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19934);Core.line(img, p, q, colorToScalar(color));
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    // From: http://stackoverflow.com/questions/23327502/opencv-how-to-draw-minarearect-in-java
    public static void drawRotatedRect(Mat mat, RotatedRect rect, Color color, int thickness) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19935);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19936);Point points[] = new Point[4];
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19937);rect.points(points);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19938);Scalar color_ = colorToScalar(color);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19939);for (int j = 0; (((j < 4)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19940)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19941)==0&false)); ++j) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19942);Core.line(mat, points[j], points[(j + 1) % 4], color_, thickness);
        }
    }}finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    // From:
    // http://docs.opencv.org/doc/tutorials/highgui/video-input-psnr-ssim/video-input-psnr-ssim.html#image-similarity-psnr-and-ssim
    public static double calculatePsnr(Mat I1, Mat I2) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19943);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19944);Mat s1 = new Mat();
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19945);Core.absdiff(I1, I2, s1); // |I1 - I2|
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19946);s1.convertTo(s1, CvType.CV_32F); // cannot make a square on 8 bits
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19947);s1 = s1.mul(s1); // |I1 - I2|^2

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19948);Scalar s = Core.sumElems(s1); // sum elements per channel

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19949);double sse = s.val[0] + s.val[1] + s.val[2]; // sum channels

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19950);if ((((sse <= 1e-10)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19951)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19952)==0&false))) // for small values return zero
            {__CLR4_5_2f3if3ilx1h0fx0.R.inc(19953);return 0;
        }else {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19954);double mse = sse / (double) (I1.channels() * I1.total());
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19955);double psnr = 10.0 * Math.log10((255 * 255) / mse);
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19956);return psnr;
        }
    }}finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}

    /**
     * From FireSight: https://github.com/firepick1/FireSight/wiki/op-Sharpness
     * 
     * @param image
     * @return
     */
    public static double calculateSharpnessGRAS(Mat image) {try{__CLR4_5_2f3if3ilx1h0fx0.R.inc(19957);
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19958);int sum = 0;
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19959);Mat matGray = new Mat();

        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19960);if ((((image.channels() == 1)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19961)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19962)==0&false))) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19963);matGray = image;
        }
        }else {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19964);Imgproc.cvtColor(image, matGray, Imgproc.COLOR_BGR2GRAY);
        }

        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19965);byte[] b1 = new byte[1];
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19966);byte[] b2 = new byte[1];
        __CLR4_5_2f3if3ilx1h0fx0.R.inc(19967);for (int r = 0; (((r < matGray.rows())&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19968)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19969)==0&false)); r++) {{
            __CLR4_5_2f3if3ilx1h0fx0.R.inc(19970);for (int c = 0; (((c < matGray.cols() - 1)&&(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19971)!=0|true))||(__CLR4_5_2f3if3ilx1h0fx0.R.iget(19972)==0&false)); c++) {{
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19973);matGray.get(r, c, b1);
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19974);matGray.get(r, c + 1, b2);
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19975);int df = (int) b1[0] - (int) b2[0];
                __CLR4_5_2f3if3ilx1h0fx0.R.inc(19976);sum += df * df;
            }
        }}

        }__CLR4_5_2f3if3ilx1h0fx0.R.inc(19977);return ((double) sum / matGray.rows() / (matGray.cols() - 1));
    }finally{__CLR4_5_2f3if3ilx1h0fx0.R.flushNeeded();}}
}
