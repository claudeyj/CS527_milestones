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

package org.openpnp.machine.reference;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.imgproc.Imgproc;
import org.openpnp.ConfigurationListener;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.base.AbstractCamera;
import org.openpnp.util.OpenCvUtils;
import org.openpnp.vision.LensCalibration;
import org.openpnp.vision.LensCalibration.LensModel;
import org.openpnp.vision.LensCalibration.Pattern;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Commit;
import org.simpleframework.xml.core.Persist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ReferenceCamera extends AbstractCamera implements ReferenceHeadMountable {public static class __CLR4_5_2712712lx1h0anc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,9310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_2712712lx1h0anc.R.inc(9110);
        __CLR4_5_2712712lx1h0anc.R.inc(9111);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2712712lx1h0anc.R.inc(9112);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    protected final static Logger logger = LoggerFactory.getLogger(ReferenceCamera.class);

    @Element(required = false)
    private Location headOffsets = new Location(LengthUnit.Millimeters);

    @Attribute(required = false)
    protected double rotation = 0;

    @Attribute(required = false)
    protected boolean flipX = false;

    @Attribute(required = false)
    protected boolean flipY = false;

    @Element(required = false)
    protected Length safeZ = new Length(0, LengthUnit.Millimeters);

    @Attribute(required = false)
    protected int offsetX = 0;

    @Attribute(required = false)
    protected int offsetY = 0;

    @Attribute(required = false)
    protected int cropWidth = 0;

    @Attribute(required = false)
    protected int cropHeight = 0;

    @Element(required = false)
    private LensCalibrationParams calibration = new LensCalibrationParams();

    private boolean calibrating;
    private CalibrationCallback calibrationCallback;
    private int calibrationCountGoal = 25;

    private Mat undistortionMap1;
    private Mat undistortionMap2;

    protected ReferenceMachine machine;
    protected ReferenceDriver driver;


    private LensCalibration lensCalibration;

    public ReferenceCamera() {try{__CLR4_5_2712712lx1h0anc.R.inc(9113);
        __CLR4_5_2712712lx1h0anc.R.inc(9114);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_2712712lx1h0anc.R.inc(9115);
                __CLR4_5_2712712lx1h0anc.R.inc(9116);machine = (ReferenceMachine) configuration.getMachine();
                __CLR4_5_2712712lx1h0anc.R.inc(9117);driver = machine.getDriver();
            }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    @Override
    public Location getHeadOffsets() {try{__CLR4_5_2712712lx1h0anc.R.inc(9118);
        __CLR4_5_2712712lx1h0anc.R.inc(9119);return headOffsets;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    @Override
    public void setHeadOffsets(Location headOffsets) {try{__CLR4_5_2712712lx1h0anc.R.inc(9120);
        __CLR4_5_2712712lx1h0anc.R.inc(9121);this.headOffsets = headOffsets;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    @Override
    public void moveTo(Location location, double speed) throws Exception {try{__CLR4_5_2712712lx1h0anc.R.inc(9122);
        __CLR4_5_2712712lx1h0anc.R.inc(9123);logger.debug("moveTo({}, {})", new Object[] {location, speed});
        __CLR4_5_2712712lx1h0anc.R.inc(9124);driver.moveTo(this, location, speed);
        __CLR4_5_2712712lx1h0anc.R.inc(9125);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    @Override
    public void moveToSafeZ(double speed) throws Exception {try{__CLR4_5_2712712lx1h0anc.R.inc(9126);
        __CLR4_5_2712712lx1h0anc.R.inc(9127);logger.debug("{}.moveToSafeZ({})", new Object[] {getName(), speed});
        __CLR4_5_2712712lx1h0anc.R.inc(9128);Length safeZ = this.safeZ.convertToUnits(getLocation().getUnits());
        __CLR4_5_2712712lx1h0anc.R.inc(9129);Location l = new Location(getLocation().getUnits(), Double.NaN, Double.NaN,
                safeZ.getValue(), Double.NaN);
        __CLR4_5_2712712lx1h0anc.R.inc(9130);driver.moveTo(this, l, speed);
        __CLR4_5_2712712lx1h0anc.R.inc(9131);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public double getRotation() {try{__CLR4_5_2712712lx1h0anc.R.inc(9132);
        __CLR4_5_2712712lx1h0anc.R.inc(9133);return rotation;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setRotation(double rotation) {try{__CLR4_5_2712712lx1h0anc.R.inc(9134);
        __CLR4_5_2712712lx1h0anc.R.inc(9135);this.rotation = rotation;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public boolean isFlipX() {try{__CLR4_5_2712712lx1h0anc.R.inc(9136);
        __CLR4_5_2712712lx1h0anc.R.inc(9137);return flipX;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setFlipX(boolean flipX) {try{__CLR4_5_2712712lx1h0anc.R.inc(9138);
        __CLR4_5_2712712lx1h0anc.R.inc(9139);this.flipX = flipX;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public boolean isFlipY() {try{__CLR4_5_2712712lx1h0anc.R.inc(9140);
        __CLR4_5_2712712lx1h0anc.R.inc(9141);return flipY;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setFlipY(boolean flipY) {try{__CLR4_5_2712712lx1h0anc.R.inc(9142);
        __CLR4_5_2712712lx1h0anc.R.inc(9143);this.flipY = flipY;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public int getOffsetX() {try{__CLR4_5_2712712lx1h0anc.R.inc(9144);
        __CLR4_5_2712712lx1h0anc.R.inc(9145);return offsetX;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setOffsetX(int offsetX) {try{__CLR4_5_2712712lx1h0anc.R.inc(9146);
        __CLR4_5_2712712lx1h0anc.R.inc(9147);this.offsetX = offsetX;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public int getOffsetY() {try{__CLR4_5_2712712lx1h0anc.R.inc(9148);
        __CLR4_5_2712712lx1h0anc.R.inc(9149);return offsetY;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setOffsetY(int offsetY) {try{__CLR4_5_2712712lx1h0anc.R.inc(9150);
        __CLR4_5_2712712lx1h0anc.R.inc(9151);this.offsetY = offsetY;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}
    
    public int getCropWidth() {try{__CLR4_5_2712712lx1h0anc.R.inc(9152);
        __CLR4_5_2712712lx1h0anc.R.inc(9153);return cropWidth;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setCropWidth(int cropWidth) {try{__CLR4_5_2712712lx1h0anc.R.inc(9154);
        __CLR4_5_2712712lx1h0anc.R.inc(9155);this.cropWidth = cropWidth;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public int getCropHeight() {try{__CLR4_5_2712712lx1h0anc.R.inc(9156);
        __CLR4_5_2712712lx1h0anc.R.inc(9157);return cropHeight;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setCropHeight(int cropHeight) {try{__CLR4_5_2712712lx1h0anc.R.inc(9158);
        __CLR4_5_2712712lx1h0anc.R.inc(9159);this.cropHeight = cropHeight;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    protected BufferedImage transformImage(BufferedImage image) {try{__CLR4_5_2712712lx1h0anc.R.inc(9160);
        __CLR4_5_2712712lx1h0anc.R.inc(9161);Mat mat = OpenCvUtils.toMat(image);
        
        __CLR4_5_2712712lx1h0anc.R.inc(9162);mat = crop(mat);

        __CLR4_5_2712712lx1h0anc.R.inc(9163);mat = calibrate(mat);

        __CLR4_5_2712712lx1h0anc.R.inc(9164);mat = undistort(mat);

        // apply affine transformations
        __CLR4_5_2712712lx1h0anc.R.inc(9165);mat = rotate(mat, rotation);

        __CLR4_5_2712712lx1h0anc.R.inc(9166);mat = offset(mat, offsetX, offsetY);

        __CLR4_5_2712712lx1h0anc.R.inc(9167);if ((((flipX || flipY)&&(__CLR4_5_2712712lx1h0anc.R.iget(9168)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9169)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9170);int flipCode;
            __CLR4_5_2712712lx1h0anc.R.inc(9171);if ((((flipX && flipY)&&(__CLR4_5_2712712lx1h0anc.R.iget(9172)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9173)==0&false))) {{
                __CLR4_5_2712712lx1h0anc.R.inc(9174);flipCode = -1;
            }
            }else {{
                __CLR4_5_2712712lx1h0anc.R.inc(9175);flipCode = (((flipX )&&(__CLR4_5_2712712lx1h0anc.R.iget(9176)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9177)==0&false))? 0 : 1;
            }
            }__CLR4_5_2712712lx1h0anc.R.inc(9178);Core.flip(mat, mat, flipCode);
        }
        
        }__CLR4_5_2712712lx1h0anc.R.inc(9179);image = OpenCvUtils.toBufferedImage(mat);
        __CLR4_5_2712712lx1h0anc.R.inc(9180);mat.release();
        __CLR4_5_2712712lx1h0anc.R.inc(9181);return image;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}
    
    private Mat crop(Mat mat) {try{__CLR4_5_2712712lx1h0anc.R.inc(9182);
        __CLR4_5_2712712lx1h0anc.R.inc(9183);if ((((cropWidth != 0 || cropHeight != 0)&&(__CLR4_5_2712712lx1h0anc.R.iget(9184)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9185)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9186);Rect roi = new Rect(
                    (int) ((mat.size().width / 2) - (cropWidth / 2)),
                    (int) ((mat.size().height / 2) - (cropHeight / 2)),
                    cropWidth,
                    cropHeight);
            __CLR4_5_2712712lx1h0anc.R.inc(9187);Mat tmp = new Mat(mat, roi);
            __CLR4_5_2712712lx1h0anc.R.inc(9188);tmp.copyTo(mat);
            __CLR4_5_2712712lx1h0anc.R.inc(9189);tmp.release();
        }
        }__CLR4_5_2712712lx1h0anc.R.inc(9190);return mat;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    private Mat rotate(Mat mat, double rotation) {try{__CLR4_5_2712712lx1h0anc.R.inc(9191);
        __CLR4_5_2712712lx1h0anc.R.inc(9192);if ((((rotation == 0D)&&(__CLR4_5_2712712lx1h0anc.R.iget(9193)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9194)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9195);return mat;
        }

        // See:
        // http://stackoverflow.com/questions/22041699/rotate-an-image-without-cropping-in-opencv-in-c
        }__CLR4_5_2712712lx1h0anc.R.inc(9196);Point center = new Point(mat.width() / 2D, mat.height() / 2D);
        __CLR4_5_2712712lx1h0anc.R.inc(9197);Mat mapMatrix = Imgproc.getRotationMatrix2D(center, rotation, 1.0);

        // determine bounding rectangle
        __CLR4_5_2712712lx1h0anc.R.inc(9198);Rect bbox = new RotatedRect(center, mat.size(), rotation).boundingRect();
        // adjust transformation matrix
        __CLR4_5_2712712lx1h0anc.R.inc(9199);double[] cx = mapMatrix.get(0, 2);
        __CLR4_5_2712712lx1h0anc.R.inc(9200);double[] cy = mapMatrix.get(1, 2);
        __CLR4_5_2712712lx1h0anc.R.inc(9201);cx[0] += bbox.width / 2D - center.x;
        __CLR4_5_2712712lx1h0anc.R.inc(9202);cy[0] += bbox.height / 2D - center.y;
        __CLR4_5_2712712lx1h0anc.R.inc(9203);mapMatrix.put(0, 2, cx);
        __CLR4_5_2712712lx1h0anc.R.inc(9204);mapMatrix.put(1, 2, cy);

        __CLR4_5_2712712lx1h0anc.R.inc(9205);Mat dst = new Mat(bbox.width, bbox.height, mat.type());
        __CLR4_5_2712712lx1h0anc.R.inc(9206);Imgproc.warpAffine(mat, dst, mapMatrix, bbox.size(), Imgproc.INTER_LINEAR);
        __CLR4_5_2712712lx1h0anc.R.inc(9207);mat.release();

        __CLR4_5_2712712lx1h0anc.R.inc(9208);mapMatrix.release();

        __CLR4_5_2712712lx1h0anc.R.inc(9209);return dst;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    private Mat offset(Mat mat, int offsetX, int offsetY) {try{__CLR4_5_2712712lx1h0anc.R.inc(9210);
        __CLR4_5_2712712lx1h0anc.R.inc(9211);if ((((offsetX == 0D && offsetY == 0D)&&(__CLR4_5_2712712lx1h0anc.R.iget(9212)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9213)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9214);return mat;
        }

        }__CLR4_5_2712712lx1h0anc.R.inc(9215);Mat mapMatrix = new Mat(2, 3, CvType.CV_32F) {
            {try{__CLR4_5_2712712lx1h0anc.R.inc(9216);
                __CLR4_5_2712712lx1h0anc.R.inc(9217);put(0, 0, 1, 0, offsetX);
                __CLR4_5_2712712lx1h0anc.R.inc(9218);put(1, 0, 0, 1, offsetY);
            }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}
        };

        __CLR4_5_2712712lx1h0anc.R.inc(9219);Mat dst = mat.clone();
        __CLR4_5_2712712lx1h0anc.R.inc(9220);Imgproc.warpAffine(mat, dst, mapMatrix, mat.size(), Imgproc.INTER_LINEAR);
        __CLR4_5_2712712lx1h0anc.R.inc(9221);mat.release();

        __CLR4_5_2712712lx1h0anc.R.inc(9222);mapMatrix.release();

        __CLR4_5_2712712lx1h0anc.R.inc(9223);return dst;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    private Mat undistort(Mat mat) {try{__CLR4_5_2712712lx1h0anc.R.inc(9224);
        __CLR4_5_2712712lx1h0anc.R.inc(9225);if ((((!calibration.isEnabled())&&(__CLR4_5_2712712lx1h0anc.R.iget(9226)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9227)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9228);return mat;
        }

        }__CLR4_5_2712712lx1h0anc.R.inc(9229);if ((((undistortionMap1 == null || undistortionMap2 == null)&&(__CLR4_5_2712712lx1h0anc.R.iget(9230)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9231)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9232);undistortionMap1 = new Mat();
            __CLR4_5_2712712lx1h0anc.R.inc(9233);undistortionMap2 = new Mat();
            __CLR4_5_2712712lx1h0anc.R.inc(9234);Mat rectification = Mat.eye(3, 3, CvType.CV_32F);
            __CLR4_5_2712712lx1h0anc.R.inc(9235);Imgproc.initUndistortRectifyMap(calibration.getCameraMatrixMat(),
                    calibration.getDistortionCoefficientsMat(), rectification,
                    calibration.getCameraMatrixMat(), mat.size(), CvType.CV_32FC1, undistortionMap1,
                    undistortionMap2);
            __CLR4_5_2712712lx1h0anc.R.inc(9236);rectification.release();
        }

        }__CLR4_5_2712712lx1h0anc.R.inc(9237);Mat dst = mat.clone();
        __CLR4_5_2712712lx1h0anc.R.inc(9238);Imgproc.remap(mat, dst, undistortionMap1, undistortionMap2, Imgproc.INTER_LINEAR);
        __CLR4_5_2712712lx1h0anc.R.inc(9239);mat.release();

        __CLR4_5_2712712lx1h0anc.R.inc(9240);return dst;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    private Mat calibrate(Mat mat) {try{__CLR4_5_2712712lx1h0anc.R.inc(9241);
        __CLR4_5_2712712lx1h0anc.R.inc(9242);if ((((!calibrating)&&(__CLR4_5_2712712lx1h0anc.R.iget(9243)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9244)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9245);return mat;
        }

        }__CLR4_5_2712712lx1h0anc.R.inc(9246);int count = lensCalibration.getPatternFoundCount();

        __CLR4_5_2712712lx1h0anc.R.inc(9247);Mat appliedMat = lensCalibration.apply(mat);
        __CLR4_5_2712712lx1h0anc.R.inc(9248);if ((((appliedMat == null)&&(__CLR4_5_2712712lx1h0anc.R.iget(9249)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9250)==0&false))) {{
            // nothing was found in the image
            __CLR4_5_2712712lx1h0anc.R.inc(9251);return mat;
        }

        }__CLR4_5_2712712lx1h0anc.R.inc(9252);if ((((count != lensCalibration.getPatternFoundCount())&&(__CLR4_5_2712712lx1h0anc.R.iget(9253)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9254)==0&false))) {{
            // a new image was counted, so let the caller know
            __CLR4_5_2712712lx1h0anc.R.inc(9255);if ((((lensCalibration.getPatternFoundCount() == calibrationCountGoal)&&(__CLR4_5_2712712lx1h0anc.R.iget(9256)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9257)==0&false))) {{
                __CLR4_5_2712712lx1h0anc.R.inc(9258);calibrationCallback.callback(lensCalibration.getPatternFoundCount(),
                        calibrationCountGoal, true);
                __CLR4_5_2712712lx1h0anc.R.inc(9259);lensCalibration.calibrate();
                __CLR4_5_2712712lx1h0anc.R.inc(9260);calibration.setCameraMatrixMat(lensCalibration.getCameraMatrix());
                __CLR4_5_2712712lx1h0anc.R.inc(9261);calibration
                        .setDistortionCoefficientsMat(lensCalibration.getDistortionCoefficients());
                __CLR4_5_2712712lx1h0anc.R.inc(9262);calibration.setEnabled(true);

                __CLR4_5_2712712lx1h0anc.R.inc(9263);lensCalibration.close();
                __CLR4_5_2712712lx1h0anc.R.inc(9264);lensCalibration = null;
                __CLR4_5_2712712lx1h0anc.R.inc(9265);calibrating = false;
            }
            }else {{
                __CLR4_5_2712712lx1h0anc.R.inc(9266);calibrationCallback.callback(lensCalibration.getPatternFoundCount(),
                        calibrationCountGoal, false);
            }
        }}

        }__CLR4_5_2712712lx1h0anc.R.inc(9267);return appliedMat;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void startCalibration(CalibrationCallback callback) {try{__CLR4_5_2712712lx1h0anc.R.inc(9268);
        __CLR4_5_2712712lx1h0anc.R.inc(9269);this.calibrationCallback = callback;
        __CLR4_5_2712712lx1h0anc.R.inc(9270);calibration.setEnabled(false);
        __CLR4_5_2712712lx1h0anc.R.inc(9271);lensCalibration = new LensCalibration(LensModel.Pinhole, Pattern.AsymmetricCirclesGrid, 4,
                11, 15, 750);
        __CLR4_5_2712712lx1h0anc.R.inc(9272);calibrating = true;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void cancelCalibration() {try{__CLR4_5_2712712lx1h0anc.R.inc(9273);
        __CLR4_5_2712712lx1h0anc.R.inc(9274);if ((((calibrating)&&(__CLR4_5_2712712lx1h0anc.R.iget(9275)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9276)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9277);lensCalibration.close();
        }
        }__CLR4_5_2712712lx1h0anc.R.inc(9278);calibrating = false;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public LensCalibrationParams getCalibration() {try{__CLR4_5_2712712lx1h0anc.R.inc(9279);
        __CLR4_5_2712712lx1h0anc.R.inc(9280);return calibration;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    @Override
    public Location getLocation() {try{__CLR4_5_2712712lx1h0anc.R.inc(9281);
        // If this is a fixed camera we just treat the head offsets as it's
        // table location.
        __CLR4_5_2712712lx1h0anc.R.inc(9282);if ((((getHead() == null)&&(__CLR4_5_2712712lx1h0anc.R.iget(9283)!=0|true))||(__CLR4_5_2712712lx1h0anc.R.iget(9284)==0&false))) {{
            __CLR4_5_2712712lx1h0anc.R.inc(9285);return getHeadOffsets();
        }
        }__CLR4_5_2712712lx1h0anc.R.inc(9286);return driver.getLocation(this);
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public Length getSafeZ() {try{__CLR4_5_2712712lx1h0anc.R.inc(9287);
        __CLR4_5_2712712lx1h0anc.R.inc(9288);return safeZ;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public void setSafeZ(Length safeZ) {try{__CLR4_5_2712712lx1h0anc.R.inc(9289);
        __CLR4_5_2712712lx1h0anc.R.inc(9290);this.safeZ = safeZ;
    }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_2712712lx1h0anc.R.inc(9291);}finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

    public interface CalibrationCallback {
        public void callback(int progressCurrent, int progressMax, boolean complete);
    }

    public static class LensCalibrationParams {
        @Attribute(required = false)
        private boolean enabled = false;

        @Element(name = "cameraMatrix", required = false)
        private double[] cameraMatrixArr = new double[9];

        @Element(name = "distortionCoefficients", required = false)
        private double[] distortionCoefficientsArr = new double[5];

        private Mat cameraMatrix = new Mat(3, 3, CvType.CV_64FC1);
        private Mat distortionCoefficients = new Mat(5, 1, CvType.CV_64FC1);

        @Commit
        private void commit() {try{__CLR4_5_2712712lx1h0anc.R.inc(9292);
            __CLR4_5_2712712lx1h0anc.R.inc(9293);cameraMatrix.put(0, 0, cameraMatrixArr);
            __CLR4_5_2712712lx1h0anc.R.inc(9294);distortionCoefficients.put(0, 0, distortionCoefficientsArr);
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        @Persist
        private void persist() {try{__CLR4_5_2712712lx1h0anc.R.inc(9295);
            __CLR4_5_2712712lx1h0anc.R.inc(9296);cameraMatrix.get(0, 0, cameraMatrixArr);
            __CLR4_5_2712712lx1h0anc.R.inc(9297);distortionCoefficients.get(0, 0, distortionCoefficientsArr);
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        public boolean isEnabled() {try{__CLR4_5_2712712lx1h0anc.R.inc(9298);
            __CLR4_5_2712712lx1h0anc.R.inc(9299);return enabled;
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        public void setEnabled(boolean enabled) {try{__CLR4_5_2712712lx1h0anc.R.inc(9300);
            __CLR4_5_2712712lx1h0anc.R.inc(9301);this.enabled = enabled;
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        public Mat getCameraMatrixMat() {try{__CLR4_5_2712712lx1h0anc.R.inc(9302);
            __CLR4_5_2712712lx1h0anc.R.inc(9303);return cameraMatrix;
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        public void setCameraMatrixMat(Mat cameraMatrix) {try{__CLR4_5_2712712lx1h0anc.R.inc(9304);
            __CLR4_5_2712712lx1h0anc.R.inc(9305);this.cameraMatrix = cameraMatrix.clone();
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        public Mat getDistortionCoefficientsMat() {try{__CLR4_5_2712712lx1h0anc.R.inc(9306);
            __CLR4_5_2712712lx1h0anc.R.inc(9307);return distortionCoefficients;
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}

        public void setDistortionCoefficientsMat(Mat distortionCoefficients) {try{__CLR4_5_2712712lx1h0anc.R.inc(9308);
            __CLR4_5_2712712lx1h0anc.R.inc(9309);this.distortionCoefficients = distortionCoefficients.clone();
        }finally{__CLR4_5_2712712lx1h0anc.R.flushNeeded();}}
    }
}
