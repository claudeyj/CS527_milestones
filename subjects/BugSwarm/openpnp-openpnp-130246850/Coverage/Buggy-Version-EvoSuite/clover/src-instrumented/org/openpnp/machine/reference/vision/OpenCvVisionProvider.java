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

package org.openpnp.machine.reference.vision;



import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.imageio.ImageIO;

import org.opencv.core.Core;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.vision.wizards.OpenCvVisionProviderConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.spi.Camera;
import org.openpnp.spi.VisionProvider;
import org.openpnp.util.ImageUtils;
import org.openpnp.util.OpenCvUtils;
import org.openpnp.util.VisionUtils;
import org.simpleframework.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Root
public class OpenCvVisionProvider implements VisionProvider {public static class __CLR4_5_2asoasolx1h0dbh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,14138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(OpenCvVisionProvider.class);

    static {try{__CLR4_5_2asoasolx1h0dbh.R.inc(13992);
        __CLR4_5_2asoasolx1h0dbh.R.inc(13993);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2asoasolx1h0dbh.R.inc(13994);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    protected Camera camera;

    @Override
    public void setCamera(Camera camera) {try{__CLR4_5_2asoasolx1h0dbh.R.inc(13995);
        __CLR4_5_2asoasolx1h0dbh.R.inc(13996);this.camera = camera;
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2asoasolx1h0dbh.R.inc(13997);
        __CLR4_5_2asoasolx1h0dbh.R.inc(13998);return new OpenCvVisionProviderConfigurationWizard(this);
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    protected Mat getCameraImage() {try{__CLR4_5_2asoasolx1h0dbh.R.inc(13999);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14000);BufferedImage image_ = camera.capture();
        __CLR4_5_2asoasolx1h0dbh.R.inc(14001);Mat image = OpenCvUtils.toMat(image_);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14002);return image;
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    /**
     * Attempt to find matches of the given template within the current camera frame. Matches are
     * returned as TemplateMatch objects which contain a Location in Camera coordinates. The results
     * are sorted best score to worst score.
     * 
     * @param template
     * @return
     */
    public List<TemplateMatch> getTemplateMatches(BufferedImage template) {try{__CLR4_5_2asoasolx1h0dbh.R.inc(14003);
        // TODO: ROI
        __CLR4_5_2asoasolx1h0dbh.R.inc(14004);BufferedImage image = camera.capture();

        // Convert the camera image and template image to the same type. This
        // is required by the cvMatchTemplate call.
        __CLR4_5_2asoasolx1h0dbh.R.inc(14005);template = ImageUtils.convertBufferedImage(template, BufferedImage.TYPE_BYTE_GRAY);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14006);image = ImageUtils.convertBufferedImage(image, BufferedImage.TYPE_BYTE_GRAY);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14007);Mat templateMat = OpenCvUtils.toMat(template);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14008);Mat imageMat = OpenCvUtils.toMat(image);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14009);Mat resultMat = new Mat();

        __CLR4_5_2asoasolx1h0dbh.R.inc(14010);Imgproc.matchTemplate(imageMat, templateMat, resultMat, Imgproc.TM_CCOEFF_NORMED);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14011);Mat debugMat = null;
        __CLR4_5_2asoasolx1h0dbh.R.inc(14012);if ((((logger.isDebugEnabled())&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14013)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14014)==0&false))) {{
            __CLR4_5_2asoasolx1h0dbh.R.inc(14015);debugMat = imageMat.clone();
        }

        }__CLR4_5_2asoasolx1h0dbh.R.inc(14016);MinMaxLocResult mmr = Core.minMaxLoc(resultMat);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14017);double maxVal = mmr.maxVal;

        // TODO: Externalize?
        __CLR4_5_2asoasolx1h0dbh.R.inc(14018);double threshold = 0.7f;
        __CLR4_5_2asoasolx1h0dbh.R.inc(14019);double corr = 0.85f;

        __CLR4_5_2asoasolx1h0dbh.R.inc(14020);double rangeMin = Math.max(threshold, corr * maxVal);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14021);double rangeMax = maxVal;

        __CLR4_5_2asoasolx1h0dbh.R.inc(14022);List<TemplateMatch> matches = new ArrayList<>();
        __CLR4_5_2asoasolx1h0dbh.R.inc(14023);for (Point point : matMaxima(resultMat, rangeMin, rangeMax)) {{
            __CLR4_5_2asoasolx1h0dbh.R.inc(14024);TemplateMatch match = new TemplateMatch();
            __CLR4_5_2asoasolx1h0dbh.R.inc(14025);int x = point.x;
            __CLR4_5_2asoasolx1h0dbh.R.inc(14026);int y = point.y;
            __CLR4_5_2asoasolx1h0dbh.R.inc(14027);match.score = resultMat.get(y, x)[0] / maxVal;

            __CLR4_5_2asoasolx1h0dbh.R.inc(14028);if ((((logger.isDebugEnabled())&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14029)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14030)==0&false))) {{
                __CLR4_5_2asoasolx1h0dbh.R.inc(14031);Core.rectangle(debugMat, new org.opencv.core.Point(x, y),
                        new org.opencv.core.Point(x + templateMat.cols(), y + templateMat.rows()),
                        new Scalar(255));
                __CLR4_5_2asoasolx1h0dbh.R.inc(14032);Core.putText(debugMat, "" + match.score,
                        new org.opencv.core.Point(x + templateMat.cols(), y + templateMat.rows()),
                        Core.FONT_HERSHEY_PLAIN, 1.0, new Scalar(255));
            }

            }__CLR4_5_2asoasolx1h0dbh.R.inc(14033);match.location = VisionUtils.getPixelLocation(camera, x + (templateMat.cols() / 2),
                    y + (templateMat.rows() / 2));
            __CLR4_5_2asoasolx1h0dbh.R.inc(14034);matches.add(match);
        }

        }__CLR4_5_2asoasolx1h0dbh.R.inc(14035);Collections.sort(matches, new Comparator<TemplateMatch>() {
            @Override
            public int compare(TemplateMatch o1, TemplateMatch o2) {try{__CLR4_5_2asoasolx1h0dbh.R.inc(14036);
                __CLR4_5_2asoasolx1h0dbh.R.inc(14037);return ((Double) o2.score).compareTo(o1.score);
            }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}
        });

        __CLR4_5_2asoasolx1h0dbh.R.inc(14038);long t = System.currentTimeMillis();
        __CLR4_5_2asoasolx1h0dbh.R.inc(14039);saveDebugImage(t + "_0_template", templateMat);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14040);saveDebugImage(t + "_1_camera", imageMat);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14041);saveDebugImage(t + "_2_result", resultMat);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14042);saveDebugImage(t + "_3_debug", debugMat);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14043);return matches;
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    @Override
    public Point[] locateTemplateMatches(int roiX, int roiY, int roiWidth, int roiHeight, int coiX,
            int coiY, BufferedImage templateImage_) throws Exception {try{__CLR4_5_2asoasolx1h0dbh.R.inc(14044);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14045);BufferedImage cameraImage_ = camera.capture();

        // Convert the camera image and template image to the same type. This
        // is required by the cvMatchTemplate call.
        __CLR4_5_2asoasolx1h0dbh.R.inc(14046);templateImage_ =
                ImageUtils.convertBufferedImage(templateImage_, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14047);cameraImage_ = ImageUtils.convertBufferedImage(cameraImage_, BufferedImage.TYPE_INT_ARGB);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14048);Mat templateImage = OpenCvUtils.toMat(templateImage_);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14049);Mat cameraImage = OpenCvUtils.toMat(cameraImage_);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14050);Mat roiImage = new Mat(cameraImage, new Rect(roiX, roiY, roiWidth, roiHeight));

        // http://stackoverflow.com/questions/17001083/opencv-template-matching-example-in-android
        __CLR4_5_2asoasolx1h0dbh.R.inc(14051);Mat resultImage = new Mat(roiImage.cols() - templateImage.cols() + 1,
                roiImage.rows() - templateImage.rows() + 1, CvType.CV_32FC1);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14052);Imgproc.matchTemplate(roiImage, templateImage, resultImage, Imgproc.TM_CCOEFF);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14053);MinMaxLocResult mmr = Core.minMaxLoc(resultImage);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14054);org.opencv.core.Point matchLoc = mmr.maxLoc;
        __CLR4_5_2asoasolx1h0dbh.R.inc(14055);double matchValue = mmr.maxVal;

        // TODO: Figure out certainty and how to filter on it.

        __CLR4_5_2asoasolx1h0dbh.R.inc(14056);logger.debug(String.format("locateTemplateMatches certainty %f at %f, %f", matchValue,
                matchLoc.x, matchLoc.y));
        __CLR4_5_2asoasolx1h0dbh.R.inc(14057);locateTemplateMatchesDebug(roiImage, templateImage, matchLoc);

        __CLR4_5_2asoasolx1h0dbh.R.inc(14058);return new Point[] {new Point(((int) matchLoc.x) + roiX, ((int) matchLoc.y) + roiY)};
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    protected void saveDebugImage(String name, Mat mat) {try{__CLR4_5_2asoasolx1h0dbh.R.inc(14059);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14060);if ((((logger.isDebugEnabled())&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14061)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14062)==0&false))) {{
            __CLR4_5_2asoasolx1h0dbh.R.inc(14063);try {
                __CLR4_5_2asoasolx1h0dbh.R.inc(14064);BufferedImage debugImage = OpenCvUtils.toBufferedImage(mat);
                __CLR4_5_2asoasolx1h0dbh.R.inc(14065);File file = Configuration.get().createResourceFile(OpenCvVisionProvider.class,
                        name + "_", ".png");
                __CLR4_5_2asoasolx1h0dbh.R.inc(14066);ImageIO.write(debugImage, "PNG", file);
            }
            catch (Exception e) {
                __CLR4_5_2asoasolx1h0dbh.R.inc(14067);e.printStackTrace();
            }
        }
    }}finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    private void locateTemplateMatchesDebug(Mat roiImage, Mat templateImage,
            org.opencv.core.Point matchLoc) {try{__CLR4_5_2asoasolx1h0dbh.R.inc(14068);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14069);if ((((logger.isDebugEnabled())&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14070)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14071)==0&false))) {{
            __CLR4_5_2asoasolx1h0dbh.R.inc(14072);try {
                __CLR4_5_2asoasolx1h0dbh.R.inc(14073);Core.rectangle(roiImage, matchLoc,
                        new org.opencv.core.Point(matchLoc.x + templateImage.cols(),
                                matchLoc.y + templateImage.rows()),
                        new Scalar(0, 255, 0));

                __CLR4_5_2asoasolx1h0dbh.R.inc(14074);BufferedImage debugImage = OpenCvUtils.toBufferedImage(roiImage);
                __CLR4_5_2asoasolx1h0dbh.R.inc(14075);File file = Configuration.get().createResourceFile(OpenCvVisionProvider.class,
                        "debug_", ".png");
                __CLR4_5_2asoasolx1h0dbh.R.inc(14076);ImageIO.write(debugImage, "PNG", file);
                __CLR4_5_2asoasolx1h0dbh.R.inc(14077);logger.debug("Debug image filename {}", file);
            }
            catch (Exception e) {
                __CLR4_5_2asoasolx1h0dbh.R.inc(14078);e.printStackTrace();
            }
        }
    }}finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}

    enum MinMaxState {
        BEFORE_INFLECTION,
        AFTER_INFLECTION
    }

    static List<Point> matMaxima(Mat mat, double rangeMin, double rangeMax) {try{__CLR4_5_2asoasolx1h0dbh.R.inc(14079);
        __CLR4_5_2asoasolx1h0dbh.R.inc(14080);List<Point> locations = new ArrayList<>();

        __CLR4_5_2asoasolx1h0dbh.R.inc(14081);int rEnd = mat.rows() - 1;
        __CLR4_5_2asoasolx1h0dbh.R.inc(14082);int cEnd = mat.cols() - 1;

        // CHECK EACH ROW MAXIMA FOR LOCAL 2D MAXIMA
        __CLR4_5_2asoasolx1h0dbh.R.inc(14083);for (int r = 0; (((r <= rEnd)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14084)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14085)==0&false)); r++) {{
            __CLR4_5_2asoasolx1h0dbh.R.inc(14086);MinMaxState state = MinMaxState.BEFORE_INFLECTION;
            __CLR4_5_2asoasolx1h0dbh.R.inc(14087);double curVal = mat.get(r, 0)[0];
            __CLR4_5_2asoasolx1h0dbh.R.inc(14088);for (int c = 1; (((c <= cEnd)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14089)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14090)==0&false)); c++) {{
                __CLR4_5_2asoasolx1h0dbh.R.inc(14091);double val = mat.get(r, c)[0];

                __CLR4_5_2asoasolx1h0dbh.R.inc(14092);if ((((val == curVal)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14093)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14094)==0&false))) {{
                    __CLR4_5_2asoasolx1h0dbh.R.inc(14095);continue;
                }
                }else {__CLR4_5_2asoasolx1h0dbh.R.inc(14096);if ((((curVal < val)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14097)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14098)==0&false))) {{
                    __CLR4_5_2asoasolx1h0dbh.R.inc(14099);if ((((state == MinMaxState.BEFORE_INFLECTION)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14100)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14101)==0&false))) {{
                        // n/a
                    }
                    }else {{
                        __CLR4_5_2asoasolx1h0dbh.R.inc(14102);state = MinMaxState.BEFORE_INFLECTION;
                    }
                }}
                }else {{ // curVal > val
                    __CLR4_5_2asoasolx1h0dbh.R.inc(14103);if ((((state == MinMaxState.BEFORE_INFLECTION)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14104)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14105)==0&false))) {{
                        __CLR4_5_2asoasolx1h0dbh.R.inc(14106);if ((((rangeMin <= curVal && curVal <= rangeMax)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14107)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14108)==0&false))) {{ // ROW
                                                                        // MAXIMA
                            __CLR4_5_2asoasolx1h0dbh.R.inc(14109);if ((((0 < r && (mat.get(r - 1, c - 1)[0] >= curVal
                                    || mat.get(r - 1, c)[0] >= curVal))&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14110)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14111)==0&false))) {{
                                // cout << "reject:r-1 " << r << "," << c-1 <<
                                // endl;
                                // - x x
                                // - - -
                                // - - -
                            }
                            }else {__CLR4_5_2asoasolx1h0dbh.R.inc(14112);if ((((r < rEnd && (mat.get(r + 1, c - 1)[0] > curVal
                                    || mat.get(r + 1, c)[0] > curVal))&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14113)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14114)==0&false))) {{
                                // cout << "reject:r+1 " << r << "," << c-1 <<
                                // endl;
                                // - - -
                                // - - -
                                // - x x
                            }
                            }else {__CLR4_5_2asoasolx1h0dbh.R.inc(14115);if ((((1 < c && (0 < r && mat.get(r - 1, c - 2)[0] >= curVal
                                    || mat.get(r, c - 2)[0] > curVal
                                    || r < rEnd && mat.get(r + 1, c - 2)[0] > curVal))&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14116)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14117)==0&false))) {{
                                // cout << "reject:c-2 " << r << "," << c-1 <<
                                // endl;
                                // x - -
                                // x - -
                                // x - -
                            }
                            }else {{
                                __CLR4_5_2asoasolx1h0dbh.R.inc(14118);locations.add(new Point(c - 1, r));
                            }
                        }}}}
                        }__CLR4_5_2asoasolx1h0dbh.R.inc(14119);state = MinMaxState.AFTER_INFLECTION;
                    }
                    }else {{
                        // n/a
                    }
                }}

                }}__CLR4_5_2asoasolx1h0dbh.R.inc(14120);curVal = val;
            }

            // PROCESS END OF ROW
            }__CLR4_5_2asoasolx1h0dbh.R.inc(14121);if ((((state == MinMaxState.BEFORE_INFLECTION)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14122)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14123)==0&false))) {{
                __CLR4_5_2asoasolx1h0dbh.R.inc(14124);if ((((rangeMin <= curVal && curVal <= rangeMax)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14125)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14126)==0&false))) {{ // ROW MAXIMA
                    __CLR4_5_2asoasolx1h0dbh.R.inc(14127);if ((((0 < r && (mat.get(r - 1, cEnd - 1)[0] >= curVal
                            || mat.get(r - 1, cEnd)[0] >= curVal))&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14128)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14129)==0&false))) {{
                        // cout << "rejectEnd:r-1 " << r << "," << cEnd-1 <<
                        // endl;
                        // - x x
                        // - - -
                        // - - -
                    }
                    }else {__CLR4_5_2asoasolx1h0dbh.R.inc(14130);if ((((r < rEnd && (mat.get(r + 1, cEnd - 1)[0] > curVal
                            || mat.get(r + 1, cEnd)[0] > curVal))&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14131)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14132)==0&false))) {{
                        // cout << "rejectEnd:r+1 " << r << "," << cEnd-1 <<
                        // endl;
                        // - - -
                        // - - -
                        // - x x
                    }
                    }else {__CLR4_5_2asoasolx1h0dbh.R.inc(14133);if ((((1 < r && mat.get(r - 1, cEnd - 2)[0] >= curVal
                            || mat.get(r, cEnd - 2)[0] > curVal
                            || r < rEnd && mat.get(r + 1, cEnd - 2)[0] > curVal)&&(__CLR4_5_2asoasolx1h0dbh.R.iget(14134)!=0|true))||(__CLR4_5_2asoasolx1h0dbh.R.iget(14135)==0&false))) {{
                        // cout << "rejectEnd:cEnd-2 " << r << "," << cEnd-1 <<
                        // endl;
                        // x - -
                        // x - -
                        // x - -
                    }
                    }else {{
                        __CLR4_5_2asoasolx1h0dbh.R.inc(14136);locations.add(new Point(cEnd, r));
                    }
                }}}}
            }}
        }}

        }__CLR4_5_2asoasolx1h0dbh.R.inc(14137);return locations;
    }finally{__CLR4_5_2asoasolx1h0dbh.R.flushNeeded();}}
}
