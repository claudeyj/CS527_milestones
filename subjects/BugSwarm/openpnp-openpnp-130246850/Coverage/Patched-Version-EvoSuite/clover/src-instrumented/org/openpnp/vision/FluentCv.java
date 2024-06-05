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
public class FluentCv {public static class __CLR4_5_2f3jf3jlx1h5sa3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,19979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19567);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19568);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19569);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

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

        ColorCode(int code) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19570);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19571);this.code = code;
        }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

        public int getCode() {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19572);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19573);return code;
        }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}
    }

    private LinkedHashMap<String, Mat> stored = new LinkedHashMap<>();
    private Mat mat = new Mat();
    private Camera camera;

    public FluentCv toMat(BufferedImage img, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19574);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19575);Integer type = null;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19576);if ((((img.getType() == BufferedImage.TYPE_BYTE_GRAY)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19577)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19578)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19579);type = CvType.CV_8UC1;
        }
        }else {__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19580);if ((((img.getType() == BufferedImage.TYPE_3BYTE_BGR)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19581)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19582)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19583);type = CvType.CV_8UC3;
        }
        }else {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19584);img = convertBufferedImage(img, BufferedImage.TYPE_3BYTE_BGR);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19585);type = CvType.CV_8UC3;
        }
        }}__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19586);Mat mat = new Mat(img.getHeight(), img.getWidth(), type);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19587);mat.put(0, 0, ((DataBufferByte) img.getRaster().getDataBuffer()).getData());
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19588);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv toGray(String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19589);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19590);return convertColor(ColorCode.Bgr2Gray, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv toColor(String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19591);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19592);return convertColor(ColorCode.Gray2Bgr, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv convertColor(ColorCode code, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19593);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19594);return convertColor(code.getCode(), tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv convertColor(int code, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19595);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19596);Imgproc.cvtColor(mat, mat, code);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19597);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * Apply a threshold to the Mat. If the threshold value is 0 then the Otsu flag will be added
     * and the threshold value ignored. Otsu performs automatic determination of the threshold value
     * by sampling the image.
     * 
     * @param threshold
     * @param tag
     * @return
     */
    public FluentCv threshold(double threshold, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19598);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19599);return threshold(threshold, false, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv threshold(double threshold, boolean invert, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19600);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19601);int type = (((invert )&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19602)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19603)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19604);if ((((threshold == 0)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19605)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19606)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19607);type |= Imgproc.THRESH_OTSU;
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19608);Imgproc.threshold(mat, mat, threshold, 255, type);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19609);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv thresholdAdaptive(String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19610);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19611);return thresholdAdaptive(false, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv thresholdAdaptive(boolean invert, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19612);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19613);Imgproc.adaptiveThreshold(mat, mat, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C,
                (((invert )&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19614)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19615)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY, 3, 5);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19616);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv blurGaussian(int kernelSize, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19617);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19618);Imgproc.GaussianBlur(mat, mat, new Size(kernelSize, kernelSize), 0);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19619);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv blurMedian(int kernelSize, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19620);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19621);Imgproc.medianBlur(mat, mat, kernelSize);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19622);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv findCirclesHough(Length minDiameter, Length maxDiameter, Length minDistance,
            String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19623);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19624);checkCamera();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19625);return findCirclesHough((int) VisionUtils.toPixels(minDiameter, camera),
                (int) VisionUtils.toPixels(maxDiameter, camera),
                (int) VisionUtils.toPixels(minDistance, camera), tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv findCirclesHough(int minDiameter, int maxDiameter, int minDistance,
            String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19626);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19627);Mat circles = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19628);Imgproc.HoughCircles(mat, circles, Imgproc.CV_HOUGH_GRADIENT, 1, minDistance, 80, 10,
                minDiameter / 2, maxDiameter / 2);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19629);store(circles, tag);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19630);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv convertCirclesToPoints(List<Point> points) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19631);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19632);for (int i = 0; (((i < mat.cols())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19633)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19634)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19635);double[] circle = mat.get(0, i);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19636);double x = circle[0];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19637);double y = circle[1];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19638);points.add(new Point(x, y));
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19639);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv convertCirclesToLocations(List<Location> locations) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19640);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19641);checkCamera();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19642);Location unitsPerPixel =
                camera.getUnitsPerPixel().convertToUnits(camera.getLocation().getUnits());
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19643);double avgUnitsPerPixel = (unitsPerPixel.getX() + unitsPerPixel.getY()) / 2;

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19644);for (int i = 0; (((i < mat.cols())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19645)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19646)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19647);double[] circle = mat.get(0, i);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19648);double x = circle[0];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19649);double y = circle[1];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19650);double radius = circle[2];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19651);Location location = VisionUtils.getPixelLocation(camera, x, y);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19652);location = location.derive(null, null, null, radius * 2 * avgUnitsPerPixel);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19653);locations.add(location);
        }

        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19654);VisionUtils.sortLocationsByDistance(camera.getLocation(), locations);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19655);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

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
    public FluentCv drawCircles(String baseTag, Color color, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19656);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19657);Color centerColor = new HslColor(color).getComplementary();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19658);Mat mat = get(baseTag);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19659);if ((((mat == null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19660)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19661)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19662);mat = new Mat();
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19663);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19664)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19665)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19666);double[] circle = this.mat.get(0, i);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19667);double x = circle[0];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19668);double y = circle[1];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19669);double radius = circle[2];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19670);Core.circle(mat, new Point(x, y), (int) radius, colorToScalar(color), 2);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19671);Core.circle(mat, new Point(x, y), 1, colorToScalar(centerColor), 2);
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19672);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * Draw circles from the current Mat contained onto the Mat specified in baseTag using the color
     * red, optionally storing the results in tag. The current Mat is replaced with the Mat from
     * baseTag with the circles drawn on top of it.
     * 
     * @param baseTag
     * @param tag
     * @return
     */
    public FluentCv drawCircles(String baseTag, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19673);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19674);return drawCircles(baseTag, Color.red, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv recall(String tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19675);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19676);mat = get(tag);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19677);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv store(String tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19678);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19679);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public List<String> getStoredTags() {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19680);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19681);return new ArrayList<>(stored.keySet());
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv write(File file) throws Exception {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19682);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19683);ImageIO.write(toBufferedImage(), "PNG", file);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19684);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv read(File file, String... tag) throws Exception {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19685);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19686);return toMat(ImageIO.read(file), tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public BufferedImage toBufferedImage() {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19687);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19688);Integer type = null;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19689);if ((((mat.type() == CvType.CV_8UC1)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19690)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19691)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19692);type = BufferedImage.TYPE_BYTE_GRAY;
        }
        }else {__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19693);if ((((mat.type() == CvType.CV_8UC3)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19694)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19695)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19696);type = BufferedImage.TYPE_3BYTE_BGR;
        }
        }else {__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19697);if ((((mat.type() == CvType.CV_32F)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19698)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19699)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19700);type = BufferedImage.TYPE_BYTE_GRAY;
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19701);Mat tmp = new Mat();
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19702);mat.convertTo(tmp, CvType.CV_8UC1, 255);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19703);mat = tmp;
        }
        }}}__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19704);if ((((type == null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19705)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19706)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19707);throw new Error(String.format("Unsupported Mat: type %d, channels %d, depth %d",
                    mat.type(), mat.channels(), mat.depth()));
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19708);BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19709);mat.get(0, 0, ((DataBufferByte) image.getRaster().getDataBuffer()).getData());
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19710);return image;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv settleAndCapture(String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19711);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19712);checkCamera();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19713);return toMat(camera.settleAndCapture(), tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * Set a Camera that can be used for calculations that require a Camera Location or units per
     * pixel.
     * 
     * @param camera
     * @return
     */
    public FluentCv setCamera(Camera camera) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19714);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19715);this.camera = camera;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19716);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv filterCirclesByDistance(Length minDistance, Length maxDistance, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19717);

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19718);double minDistancePx = VisionUtils.toPixels(minDistance, camera);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19719);double maxDistancePx = VisionUtils.toPixels(maxDistance, camera);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19720);return filterCirclesByDistance(camera.getWidth() / 2, camera.getHeight() / 2, minDistancePx,
                maxDistancePx, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv filterCirclesByDistance(double originX, double originY, double minDistance,
            double maxDistance, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19721);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19722);List<float[]> results = new ArrayList<>();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19723);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19724)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19725)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19726);float[] circle = new float[3];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19727);this.mat.get(0, i, circle);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19728);float x = circle[0];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19729);float y = circle[1];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19730);float radius = circle[2];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19731);double distance = Math.sqrt(Math.pow(x - originX, 2) + Math.pow(y - originY, 2));
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19732);if ((((distance >= minDistance && distance <= maxDistance)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19733)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19734)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19735);results.add(new float[] {x, y, radius});
            }
        }}
        // It really seems like there must be a better way to do this, but after hours
        // and hours of trying I can't find one. How the hell do you append an element
        // of 3 channels to a Mat?!
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19736);Mat r = new Mat(1, results.size(), CvType.CV_32FC3);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19737);for (int i = 0; (((i < results.size())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19738)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19739)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19740);r.put(0, i, results.get(i));
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19741);return store(r, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv filterCirclesToLine(Length maxDistance, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19742);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19743);return filterCirclesToLine(VisionUtils.toPixels(maxDistance, camera), tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * Filter circles as returned from e.g. houghCircles to only those that are within maxDistance
     * of the best fitting line.
     * 
     * @param tag
     * @return
     */
    public FluentCv filterCirclesToLine(double maxDistance, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19744);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19745);if ((((this.mat.cols() < 2)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19746)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19747)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19748);return store(this.mat, tag);
        }

        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19749);List<Point> points = new ArrayList<>();
        // collect the circles into a list of points
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19750);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19751)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19752)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19753);float[] circle = new float[3];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19754);this.mat.get(0, i, circle);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19755);float x = circle[0];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19756);float y = circle[1];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19757);points.add(new Point(x, y));
        }

        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19758);Point[] line = Ransac.ransac(points, 100, maxDistance);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19759);Point a = line[0];
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19760);Point b = line[1];

        // filter the points by distance from the resulting line
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19761);List<float[]> results = new ArrayList<>();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19762);for (int i = 0; (((i < this.mat.cols())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19763)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19764)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19765);float[] circle = new float[3];
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19766);this.mat.get(0, i, circle);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19767);Point p = new Point(circle[0], circle[1]);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19768);if ((((pointToLineDistance(a, b, p) <= maxDistance)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19769)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19770)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19771);results.add(circle);
            }
        }}

        // It really seems like there must be a better way to do this, but after hours
        // and hours of trying I can't find one. How the hell do you append an element
        // of 3 channels to a Mat?!
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19772);Mat r = new Mat(1, results.size(), CvType.CV_32FC3);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19773);for (int i = 0; (((i < results.size())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19774)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19775)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19776);r.put(0, i, results.get(i));
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19777);return store(r, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public Mat mat() {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19778);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19779);return mat.clone();
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv mat(Mat mat, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19780);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19781);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * Calculate the absolute difference between the previously stored Mat called source1 and the
     * current Mat.
     * 
     * @param source1
     * @param tag
     */
    public FluentCv absDiff(String source1, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19782);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19783);Core.absdiff(get(source1), mat, mat);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19784);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv findEdgesCanny(double threshold1, double threshold2, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19785);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19786);Imgproc.Canny(mat, mat, threshold1, threshold2);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19787);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv findEdgesRobertsCross(String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19788);
        // Java interpretation of
        // https://www.scss.tcd.ie/publications/book-supplements/A-Practical-Introduction-to-Computer-Vision-with-OpenCV/Code/Edges.cpp
        // Note: Java API does not have abs. This appears to be doing the
        // same thing effectively, but I am not sure it's 100% the same
        // as Cri's version.
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19789);Mat kernel = Mat.eye(new Size(2, 2), CvType.CV_32FC1);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19790);kernel.put(0, 0, 0, 1, -1, 0);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19791);Mat roberts1 = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19792);Imgproc.filter2D(mat, roberts1, CvType.CV_32FC1, kernel);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19793);Core.convertScaleAbs(roberts1, roberts1);

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19794);kernel.put(0, 0, 1, 0, 0, -1);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19795);Mat roberts2 = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19796);Imgproc.filter2D(mat, roberts2, CvType.CV_32FC1, kernel);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19797);Core.convertScaleAbs(roberts2, roberts2);

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19798);Mat roberts = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19799);Core.add(roberts1, roberts2, roberts);

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19800);return store(roberts, tag);

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
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv findContours(List<MatOfPoint> contours, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19801);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19802);Mat hierarchy = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19803);Imgproc.findContours(mat, contours, hierarchy, Imgproc.RETR_LIST,
                Imgproc.CHAIN_APPROX_NONE);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19804);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv drawContours(List<MatOfPoint> contours, Color color, int thickness,
            String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19805);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19806);if ((((color == null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19807)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19808)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19809);for (int i = 0; (((i < contours.size())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19810)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19811)==0&false)); i++) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19812);Imgproc.drawContours(mat, contours, i, colorToScalar(indexedColor(i)), thickness);
            }
        }}
        }else {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19813);Imgproc.drawContours(mat, contours, -1, colorToScalar(color), thickness);
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19814);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv filterContoursByArea(List<MatOfPoint> contours, double areaMin,
            double areaMax) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19815);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19816);for (Iterator<MatOfPoint> i = contours.iterator(); (((i.hasNext())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19817)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19818)==0&false));) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19819);MatOfPoint contour = i.next();
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19820);double area = Imgproc.contourArea(contour);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19821);if ((((area < areaMin || area > areaMax)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19822)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19823)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19824);i.remove();
            }
        }}
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19825);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv drawRects(List<RotatedRect> rects, Color color, int thickness, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19826);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19827);for (int i = 0; (((i < rects.size())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19828)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19829)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19830);RotatedRect rect = rects.get(i);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19831);if ((((color == null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19832)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19833)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19834);drawRotatedRect(mat, rect, indexedColor(i), thickness);
            }
            }else {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19835);drawRotatedRect(mat, rect, color, thickness);
            }
        }}
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19836);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv getContourRects(List<MatOfPoint> contours, List<RotatedRect> rects) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19837);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19838);for (int i = 0; (((i < contours.size())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19839)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19840)==0&false)); i++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19841);MatOfPoint2f contour_ = new MatOfPoint2f();
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19842);contours.get(i).convertTo(contour_, CvType.CV_32FC2);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19843);if ((((contour_.empty())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19844)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19845)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19846);continue;
            }
            }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19847);RotatedRect rect = Imgproc.minAreaRect(contour_);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19848);rects.add(rect);
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19849);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv getContourMaxRects(List<MatOfPoint> contours, List<RotatedRect> rect) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19850);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19851);List<Point> contoursCombined = new ArrayList<>();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19852);for (MatOfPoint mp : contours) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19853);List<Point> points = new ArrayList<>();
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19854);Converters.Mat_to_vector_Point(mp, points);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19855);for (Point point : points) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19856);contoursCombined.add(point);
            }
        }}
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19857);contours.clear();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19858);MatOfPoint points = new MatOfPoint();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19859);points.fromList(contoursCombined);

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19860);return getContourRects(Collections.singletonList(points), rect);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv filterRectsByArea(List<RotatedRect> rects, double areaMin, double areaMax) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19861);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19862);for (Iterator<RotatedRect> i = rects.iterator(); (((i.hasNext())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19863)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19864)==0&false));) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19865);RotatedRect rect = i.next();
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19866);double area = rect.size.width * rect.size.height;
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19867);if ((((area < areaMin || area > areaMax)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19868)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19869)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19870);i.remove();
            }
        }}
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19871);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    private void checkCamera() {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19872);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19873);if ((((camera == null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19874)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19875)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19876);throw new Error(
                    "Call setCamera(Camera) before calling methods that rely on units per pixel.");
        }
    }}finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    private FluentCv store(Mat mat, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19877);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19878);this.mat = mat;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19879);if ((((tag != null && tag.length > 0)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19880)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19881)==0&false))) {{
            // Clone so that future writes to the pipeline Mat
            // don't overwrite our stored one.
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19882);mat = stored.get(tag[0]);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19883);if ((((mat != null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19884)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19885)==0&false))) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19886);mat.release();
            }
            }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19887);stored.put(tag[0], this.mat.clone());
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19888);return this;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public FluentCv floodFill(Point seedPoint, Color color, String... tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19889);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19890);Mat mask = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19891);Imgproc.floodFill(mat, mask, seedPoint, colorToScalar(color));
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19892);return store(mat, tag);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    private Mat get(String tag) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19893);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19894);Mat mat = stored.get(tag);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19895);if ((((mat == null)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19896)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19897)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19898);return null;
        }
        // Clone so that future writes to the pipeline Mat
        // don't overwrite our stored one.
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19899);return mat.clone();
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public static Scalar colorToScalar(Color color) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19900);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19901);return new Scalar(color.getBlue(), color.getGreen(), color.getRed(), 255);
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * Return a Color from an imaginary list of colors starting at index 0 and extending on to
     * Integer.MAX_VALUE. Can be used to pick a different color for each object in a list. Colors
     * are not guaranteed to be unique but successive colors will be significantly different from
     * each other.
     * 
     * @param i
     * @return
     */
    public static Color indexedColor(int i) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19902);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19903);float h = (i * 59) % 360;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19904);float s = Math.max((i * i) % 100, 80);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19905);float l = Math.max((i * i) % 100, 50);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19906);Color color = new HslColor(h, s, l).getRGB();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19907);return color;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    public static BufferedImage convertBufferedImage(BufferedImage src, int type) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19908);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19909);if ((((src.getType() == type)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19910)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19911)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19912);return src;
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19913);BufferedImage img = new BufferedImage(src.getWidth(), src.getHeight(), type);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19914);Graphics2D g2d = img.createGraphics();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19915);g2d.drawImage(src, 0, 0, null);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19916);g2d.dispose();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19917);return img;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    // From http://www.ahristov.com/tutorial/geometry-games/point-line-distance.html
    public static double pointToLineDistance(Point A, Point B, Point P) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19918);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19919);double normalLength = Math.sqrt((B.x - A.x) * (B.x - A.x) + (B.y - A.y) * (B.y - A.y));
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19920);return Math.abs((P.x - A.x) * (B.y - A.y) - (P.y - A.y) * (B.x - A.x)) / normalLength;
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

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
    public static void infiniteLine(Mat img, Point p1, Point p2, Color color) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19921);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19922);Point p = new Point(), q = new Point();
        // Check if the line is a vertical line because vertical lines don't
        // have slope
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19923);if ((((p1.x != p2.x)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19924)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19925)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19926);p.x = 0;
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19927);q.x = img.cols();
            // Slope equation (y1 - y2) / (x1 - x2)
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19928);float m = (float) ((p1.y - p2.y) / (p1.x - p2.x));
            // Line equation: y = mx + b
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19929);float b = (float) (p1.y - (m * p1.x));
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19930);p.y = m * p.x + b;
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19931);q.y = m * q.x + b;
        }
        }else {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19932);p.x = q.x = p2.x;
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19933);p.y = 0;
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19934);q.y = img.rows();
        }
        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19935);Core.line(img, p, q, colorToScalar(color));
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    // From: http://stackoverflow.com/questions/23327502/opencv-how-to-draw-minarearect-in-java
    public static void drawRotatedRect(Mat mat, RotatedRect rect, Color color, int thickness) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19936);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19937);Point points[] = new Point[4];
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19938);rect.points(points);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19939);Scalar color_ = colorToScalar(color);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19940);for (int j = 0; (((j < 4)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19941)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19942)==0&false)); ++j) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19943);Core.line(mat, points[j], points[(j + 1) % 4], color_, thickness);
        }
    }}finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    // From:
    // http://docs.opencv.org/doc/tutorials/highgui/video-input-psnr-ssim/video-input-psnr-ssim.html#image-similarity-psnr-and-ssim
    public static double calculatePsnr(Mat I1, Mat I2) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19944);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19945);Mat s1 = new Mat();
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19946);Core.absdiff(I1, I2, s1); // |I1 - I2|
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19947);s1.convertTo(s1, CvType.CV_32F); // cannot make a square on 8 bits
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19948);s1 = s1.mul(s1); // |I1 - I2|^2

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19949);Scalar s = Core.sumElems(s1); // sum elements per channel

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19950);double sse = s.val[0] + s.val[1] + s.val[2]; // sum channels

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19951);if ((((sse <= 1e-10)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19952)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19953)==0&false))) // for small values return zero
            {__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19954);return 0;
        }else {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19955);double mse = sse / (double) (I1.channels() * I1.total());
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19956);double psnr = 10.0 * Math.log10((255 * 255) / mse);
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19957);return psnr;
        }
    }}finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}

    /**
     * From FireSight: https://github.com/firepick1/FireSight/wiki/op-Sharpness
     * 
     * @param image
     * @return
     */
    public static double calculateSharpnessGRAS(Mat image) {try{__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19958);
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19959);int sum = 0;
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19960);Mat matGray = new Mat();

        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19961);if ((((image.channels() == 1)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19962)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19963)==0&false))) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19964);matGray = image;
        }
        }else {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19965);Imgproc.cvtColor(image, matGray, Imgproc.COLOR_BGR2GRAY);
        }

        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19966);byte[] b1 = new byte[1];
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19967);byte[] b2 = new byte[1];
        __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19968);for (int r = 0; (((r < matGray.rows())&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19969)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19970)==0&false)); r++) {{
            __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19971);for (int c = 0; (((c < matGray.cols() - 1)&&(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19972)!=0|true))||(__CLR4_5_2f3jf3jlx1h5sa3.R.iget(19973)==0&false)); c++) {{
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19974);matGray.get(r, c, b1);
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19975);matGray.get(r, c + 1, b2);
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19976);int df = (int) b1[0] - (int) b2[0];
                __CLR4_5_2f3jf3jlx1h5sa3.R.inc(19977);sum += df * df;
            }
        }}

        }__CLR4_5_2f3jf3jlx1h5sa3.R.inc(19978);return ((double) sum / matGray.rows() / (matGray.cols() - 1));
    }finally{__CLR4_5_2f3jf3jlx1h5sa3.R.flushNeeded();}}
}
