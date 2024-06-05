/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision;

import java.util.ArrayList;
import java.util.List;

import org.opencv.calib3d.Calib3d;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfPoint3f;
import org.opencv.core.Point3;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.imgproc.Imgproc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Performs OpenCV based lens calibration based on the techniques described in:
 * http://opencv-java-tutorials.readthedocs.org/en/latest/09-camera-calibration.html
 * http://docs.opencv.org/2.4/doc/tutorials/calib3d/camera_calibration/camera_calibration.html
 * https://github.com/Itseez/opencv/blob/master/samples/cpp/tutorial_code/calib3d/camera_calibration
 * /camera_calibration.cpp
 * 
 * FishEye model code is included but unfinished. This code cannot be finished until we are using
 * OpenCV 3.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class LensCalibration {public static class __CLR4_5_2feyfeylx1h0g1k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,20117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected final static Logger logger = LoggerFactory.getLogger(LensCalibration.class);

    static {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(19978);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19979);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19980);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public enum Pattern {
        Chessboard, CirclesGrid, AsymmetricCirclesGrid
    };

    public enum LensModel {
        Pinhole, Fisheye
    }

    final private LensModel lensModel;
    final private Pattern pattern;
    final private Size patternSize;
    final private double objectSize;
    final private MatOfPoint3f objectPoints;
    final private long applyDelayMs;

    private List<Mat> imagePointsList = new ArrayList<>();
    private List<Mat> objectPointsList = new ArrayList<>();
    private Size imageSize;
    private Mat cameraMatrix;
    private Mat distortionCoefficients;
    private long lastApplyMs;

    public LensCalibration(LensModel lensModel, Pattern pattern, int patternWidth,
            int patternHeight, double objectSize, long applyDelayMs) {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(19981);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19982);if ((((lensModel == LensModel.Fisheye)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(19983)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(19984)==0&false))) {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(19985);throw new Error(lensModel + " LensModel not yet supported. OpenCV 3+ needed.");
        }
        }__CLR4_5_2feyfeylx1h0g1k.R.inc(19986);this.lensModel = lensModel;
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19987);this.pattern = pattern;
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19988);this.patternSize = new Size(patternWidth, patternHeight);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19989);this.objectSize = objectSize;
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19990);this.applyDelayMs = applyDelayMs;
        // We only need to calculate this once, so we do it ahead of time
        // and then add it to the list with each processed image.
        __CLR4_5_2feyfeylx1h0g1k.R.inc(19991);objectPoints = calculateObjectPoints();
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}
    
    public void close() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(19992);
    	__CLR4_5_2feyfeylx1h0g1k.R.inc(19993);if ((((cameraMatrix != null)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(19994)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(19995)==0&false))) {{
    		__CLR4_5_2feyfeylx1h0g1k.R.inc(19996);cameraMatrix.release();
    	}
    	}__CLR4_5_2feyfeylx1h0g1k.R.inc(19997);if ((((distortionCoefficients != null)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(19998)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(19999)==0&false))) {{
    		__CLR4_5_2feyfeylx1h0g1k.R.inc(20000);distortionCoefficients.release();
    	}
    	
    	}__CLR4_5_2feyfeylx1h0g1k.R.inc(20001);objectPoints.release();
    	__CLR4_5_2feyfeylx1h0g1k.R.inc(20002);for (Mat imagePoints : imagePointsList) {{
    		__CLR4_5_2feyfeylx1h0g1k.R.inc(20003);imagePoints.release();
    	}
    }}finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public Mat apply(Mat mat) {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20004);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20005);if ((((imageSize == null)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20006)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20007)==0&false))) {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20008);imageSize = mat.size();
        }

        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20009);MatOfPoint2f imagePoints = findImagePoints(mat);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20010);if ((((imagePoints == null)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20011)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20012)==0&false))) {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20013);return null;
        }

        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20014);Calib3d.drawChessboardCorners(mat, patternSize, imagePoints, true);

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20015);if ((((System.currentTimeMillis() - lastApplyMs > applyDelayMs)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20016)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20017)==0&false))) {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20018);objectPointsList.add(objectPoints);
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20019);imagePointsList.add(imagePoints);
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20020);lastApplyMs = System.currentTimeMillis();
        }

        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20021);return mat;
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public boolean calibrate() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20022);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20023);Mat cameraMatrix;
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20024);Mat distortionCoefficients;

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20025);cameraMatrix = Mat.eye(3, 3, CvType.CV_64F);

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20026);if ((((lensModel == LensModel.Fisheye)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20027)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20028)==0&false))) {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20029);distortionCoefficients = Mat.zeros(4, 1, CvType.CV_64F);
        }
        }else {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20030);distortionCoefficients = Mat.zeros(8, 1, CvType.CV_64F);
        }

        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20031);List<Mat> rvecs = new ArrayList<>();
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20032);List<Mat> tvecs = new ArrayList<>();

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20033);double rms;

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20034);if ((((lensModel == LensModel.Fisheye)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20035)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20036)==0&false))) {{
            // TODO:
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20037);throw new Error(lensModel + " LensModel not yet supported. OpenCV 3+ needed.");
            // Mat _rvecs, _tvecs;
            // rms = fisheye::calibrate(objectPoints, imagePoints, imageSize, cameraMatrix,
            // distCoeffs, _rvecs,
            // _tvecs, s.flag);
            //
            // rvecs.reserve(_rvecs.rows);
            // tvecs.reserve(_tvecs.rows);
            // for(int i = 0; i < int(objectPoints.size()); i++){
            // rvecs.push_back(_rvecs.row(i));
            // tvecs.push_back(_tvecs.row(i));
            // }
        }
        }else {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20038);rms = Calib3d.calibrateCamera(objectPointsList, imagePointsList, imageSize,
                    cameraMatrix, distortionCoefficients, rvecs, tvecs);
        }

        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20039);for (Mat rvec : rvecs) {{
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20040);rvec.release();
        }
        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20041);rvecs.clear();
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20042);for (Mat tvec : tvecs) {{
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20043);tvec.release();
        }
        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20044);tvecs.clear();
        
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20045);boolean ok = Core.checkRange(cameraMatrix) && Core.checkRange(distortionCoefficients);

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20046);logger.info("calibrate() ok {}, rms {}", ok, rms);

        __CLR4_5_2feyfeylx1h0g1k.R.inc(20047);if ((((ok)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20048)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20049)==0&false))) {{
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20050);this.cameraMatrix = cameraMatrix;
            __CLR4_5_2feyfeylx1h0g1k.R.inc(20051);this.distortionCoefficients = distortionCoefficients;
        } }else {{
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20052);cameraMatrix.release();
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20053);distortionCoefficients.release();
        }

        }__CLR4_5_2feyfeylx1h0g1k.R.inc(20054);return ok;
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public int getPatternFoundCount() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20055);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20056);return imagePointsList.size();
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public boolean isCalibrated() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20057);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20058);return cameraMatrix != null && distortionCoefficients != null;
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public Mat getCameraMatrix() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20059);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20060);return cameraMatrix;
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    public Mat getDistortionCoefficients() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20061);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20062);return distortionCoefficients;
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    private MatOfPoint2f findImagePoints(Mat mat) {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20063);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20064);MatOfPoint2f imagePoints = new MatOfPoint2f();
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20065);boolean found = false;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2feyfeylx1h0g1k.R.inc(20066);switch (pattern) {
            case Chessboard:if (!__CLB4_5_2_bool0) {__CLR4_5_2feyfeylx1h0g1k.R.inc(20067);__CLB4_5_2_bool0=true;}
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20068);int chessBoardFlags =
                        Calib3d.CALIB_CB_ADAPTIVE_THRESH | Calib3d.CALIB_CB_NORMALIZE_IMAGE;
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20069);if ((((lensModel != LensModel.Fisheye)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20070)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20071)==0&false))) {{
                    // fast check erroneously fails with high distortions like fisheye
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20072);chessBoardFlags |= Calib3d.CALIB_CB_FAST_CHECK;
                }
                }__CLR4_5_2feyfeylx1h0g1k.R.inc(20073);found = Calib3d.findChessboardCorners(mat, patternSize, imagePoints,
                        chessBoardFlags);
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20074);if ((((found)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20075)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20076)==0&false))) {{
                    // improve the found corners' coordinate accuracy for chessboard
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20077);Mat matGray = new Mat();
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20078);Imgproc.cvtColor(mat, matGray, Imgproc.COLOR_BGR2GRAY);
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20079);Imgproc.cornerSubPix(matGray, imagePoints, new Size(11, 11), new Size(-1, -1),
                            new TermCriteria(TermCriteria.EPS + TermCriteria.COUNT, 30, 0.1));
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20080);matGray.release();
                }
                }__CLR4_5_2feyfeylx1h0g1k.R.inc(20081);break;
            case CirclesGrid:if (!__CLB4_5_2_bool0) {__CLR4_5_2feyfeylx1h0g1k.R.inc(20082);__CLB4_5_2_bool0=true;}
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20083);found = Calib3d.findCirclesGridDefault(mat, patternSize, imagePoints);
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20084);break;
            case AsymmetricCirclesGrid:if (!__CLB4_5_2_bool0) {__CLR4_5_2feyfeylx1h0g1k.R.inc(20085);__CLB4_5_2_bool0=true;}
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20086);found = Calib3d.findCirclesGridDefault(mat, patternSize, imagePoints,
                        Calib3d.CALIB_CB_ASYMMETRIC_GRID);
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20087);break;
        }
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20088);if ((((found)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20089)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20090)==0&false))) {{
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20091);return imagePoints;
        } }else {{
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20092);imagePoints.release();
        	__CLR4_5_2feyfeylx1h0g1k.R.inc(20093);return null;
        }
    }}finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}

    private MatOfPoint3f calculateObjectPoints() {try{__CLR4_5_2feyfeylx1h0g1k.R.inc(20094);
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20095);MatOfPoint3f obj = new MatOfPoint3f();

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2feyfeylx1h0g1k.R.inc(20096);switch (pattern) {
            case Chessboard:if (!__CLB4_5_2_bool1) {__CLR4_5_2feyfeylx1h0g1k.R.inc(20097);__CLB4_5_2_bool1=true;}
            case CirclesGrid:if (!__CLB4_5_2_bool1) {__CLR4_5_2feyfeylx1h0g1k.R.inc(20098);__CLB4_5_2_bool1=true;}
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20099);for (int i = 0; (((i < patternSize.height)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20100)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20101)==0&false)); ++i) {{
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20102);for (int j = 0; (((j < patternSize.width)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20103)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20104)==0&false)); ++j) {{
                        __CLR4_5_2feyfeylx1h0g1k.R.inc(20105);obj.push_back(
                                new MatOfPoint3f(new Point3(j * objectSize, i * objectSize, 0)));
                    }
                }}
                }__CLR4_5_2feyfeylx1h0g1k.R.inc(20106);break;
            case AsymmetricCirclesGrid:if (!__CLB4_5_2_bool1) {__CLR4_5_2feyfeylx1h0g1k.R.inc(20107);__CLB4_5_2_bool1=true;}
                __CLR4_5_2feyfeylx1h0g1k.R.inc(20108);for (int i = 0; (((i < patternSize.height)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20109)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20110)==0&false)); i++) {{
                    __CLR4_5_2feyfeylx1h0g1k.R.inc(20111);for (int j = 0; (((j < patternSize.width)&&(__CLR4_5_2feyfeylx1h0g1k.R.iget(20112)!=0|true))||(__CLR4_5_2feyfeylx1h0g1k.R.iget(20113)==0&false)); j++) {{
                        __CLR4_5_2feyfeylx1h0g1k.R.inc(20114);obj.push_back(new MatOfPoint3f(
                                new Point3((2 * j + i % 2) * objectSize, i * objectSize, 0)));
                    }
                }}
                }__CLR4_5_2feyfeylx1h0g1k.R.inc(20115);break;
        }
        __CLR4_5_2feyfeylx1h0g1k.R.inc(20116);return obj;
    }finally{__CLR4_5_2feyfeylx1h0g1k.R.flushNeeded();}}
}
