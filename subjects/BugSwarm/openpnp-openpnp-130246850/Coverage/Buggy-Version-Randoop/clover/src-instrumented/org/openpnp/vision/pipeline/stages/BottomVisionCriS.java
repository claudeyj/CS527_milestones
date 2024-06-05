/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.RotatedRect;
import org.opencv.imgproc.Imgproc;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;


/*
<cv-pipeline>
<stages>
   <cv-stage class="org.openpnp.vision.pipeline.stages.ImageRead" name="0" enabled="true" file="/Users/jason/Projects/openpnp/private/Pictures/Vision Tests/OpenPnP-Bottom_Vision_Test_Images-2016-03-17/13_r45.png"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.MaskCircle" name="4" enabled="true" diameter="550"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.ConvertColor" name="5" enabled="true" conversion="Bgr2HsvFull"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.MaskHsv" name="6" enabled="true" hue-min="40" hue-max="130" saturation-min="0" saturation-max="255" value-min="0" value-max="255"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.ConvertColor" name="7" enabled="true" conversion="Hsv2BgrFull"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.ConvertColor" name="2" enabled="true" conversion="Bgr2Gray"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.Threshold" name="9" enabled="true" threshold="240" auto="false" invert="false"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.BottomVisionCriS" name="1" enabled="true" threshold="240"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.ImageRecall" name="8" enabled="true" image-stage-name="0"/>
   <cv-stage class="org.openpnp.vision.pipeline.stages.DrawRotatedRects" name="3" enabled="true" rotated-rects-stage-name="1" thickness="1">
      <color r="255" g="0" b="102" a="255"/>
   </cv-stage>
</stages>
</cv-pipeline>
*/

public class BottomVisionCriS extends CvStage {public static class __CLR4_5_2fusfuslx1h1z3e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,20610,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    int threshold = 240;
    
    public int getThreshold() {try{__CLR4_5_2fusfuslx1h1z3e.R.inc(20548);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20549);return threshold;
    }finally{__CLR4_5_2fusfuslx1h1z3e.R.flushNeeded();}}

    public void setThreshold(int threshold) {try{__CLR4_5_2fusfuslx1h1z3e.R.inc(20550);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20551);this.threshold = threshold;
    }finally{__CLR4_5_2fusfuslx1h1z3e.R.flushNeeded();}}

    private static RotatedRect getRotatedRect(MatOfPoint contour) {try{__CLR4_5_2fusfuslx1h1z3e.R.inc(20552);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20553);if ((((contour == null)&&(__CLR4_5_2fusfuslx1h1z3e.R.iget(20554)!=0|true))||(__CLR4_5_2fusfuslx1h1z3e.R.iget(20555)==0&false)))
            {__CLR4_5_2fusfuslx1h1z3e.R.inc(20556);return null;
        }__CLR4_5_2fusfuslx1h1z3e.R.inc(20557);MatOfPoint2f contour_ = new MatOfPoint2f();
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20558);contour.convertTo(contour_, CvType.CV_32FC1);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20559);return Imgproc.minAreaRect(contour_);
    }finally{__CLR4_5_2fusfuslx1h1z3e.R.flushNeeded();}}

    private static List<MatOfPoint> joinContours(List<MatOfPoint> contours) {try{__CLR4_5_2fusfuslx1h1z3e.R.inc(20560);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20561);List<MatOfPoint> ret = new ArrayList<>();
        // filter it
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20562);List<MatOfPoint> contours2 = new ArrayList<>(contours);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20563);for (MatOfPoint contour : contours) {{
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20564);RotatedRect rotatedRect = getRotatedRect(contour);
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20565);double area = rotatedRect.size.area();
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20566);if ((((area <= 5.0)&&(__CLR4_5_2fusfuslx1h1z3e.R.iget(20567)!=0|true))||(__CLR4_5_2fusfuslx1h1z3e.R.iget(20568)==0&false))) {{
                __CLR4_5_2fusfuslx1h1z3e.R.inc(20569);contours2.remove(contour);
            }
        }}
        }__CLR4_5_2fusfuslx1h1z3e.R.inc(20570);contours = contours2;

        __CLR4_5_2fusfuslx1h1z3e.R.inc(20571);final ArrayList<Point> temp = new ArrayList<>();
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20572);for (MatOfPoint contour : contours) {{
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20573);temp.addAll(((MatOfPoint) contour).toList());
        }

        }__CLR4_5_2fusfuslx1h1z3e.R.inc(20574);contours.clear();
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20575);if ((((temp.size() != 0)&&(__CLR4_5_2fusfuslx1h1z3e.R.iget(20576)!=0|true))||(__CLR4_5_2fusfuslx1h1z3e.R.iget(20577)==0&false))) {{
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20578);MatOfPoint mat = new MatOfPoint();
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20579);mat.fromList(temp);
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20580);contours.add(mat);
        }
        }__CLR4_5_2fusfuslx1h1z3e.R.inc(20581);return contours;
    }finally{__CLR4_5_2fusfuslx1h1z3e.R.flushNeeded();}}

    static public Mat rotate(Mat img, double angle) {try{__CLR4_5_2fusfuslx1h1z3e.R.inc(20582);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20583);double radians = Math.toRadians(angle);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20584);Point center = new Point(img.size().width / 2, img.size().height / 2);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20585);Mat rotImage = Imgproc.getRotationMatrix2D(center, angle, 1.0);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20586);Imgproc.warpAffine(img, img, rotImage, img.size(),
                Imgproc.INTER_LINEAR + Imgproc.CV_WARP_FILL_OUTLIERS);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20587);return img;
    }finally{__CLR4_5_2fusfuslx1h1z3e.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2fusfuslx1h1z3e.R.inc(20588);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20589);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20590);Mat tmp = new Mat();
        // Do OpenCV magic
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20591);List<MatOfPoint> contours = new ArrayList<>();
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20592);RotatedRect rot = null;
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20593);double ang;
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20594);Imgproc.threshold(mat, tmp, threshold, 255, 0);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20595);Imgproc.findContours(tmp.clone(), contours, new Mat(), Imgproc.RETR_EXTERNAL,
                Imgproc.CHAIN_APPROX_SIMPLE);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20596);if ((((contours.size() == 0)&&(__CLR4_5_2fusfuslx1h1z3e.R.iget(20597)!=0|true))||(__CLR4_5_2fusfuslx1h1z3e.R.iget(20598)==0&false))) {{
            __CLR4_5_2fusfuslx1h1z3e.R.inc(20599);return new Result(mat, contours);
        }
        // join, get angle,
        }__CLR4_5_2fusfuslx1h1z3e.R.inc(20600);contours = joinContours(contours);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20601);rot = getRotatedRect(contours.get(0));
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20602);ang = rot.angle % 45;
        // roate and repeat match, get center
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20603);tmp = rotate(tmp, -ang);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20604);contours.clear();
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20605);Imgproc.findContours(tmp.clone(), contours, new Mat(), Imgproc.RETR_EXTERNAL,
                Imgproc.CHAIN_APPROX_SIMPLE);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20606);contours = joinContours(contours);
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20607);rot = getRotatedRect(contours.get(0));
        
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20608);rot.angle = ang;
        __CLR4_5_2fusfuslx1h1z3e.R.inc(20609);return new Result(mat, rot);
    }finally{__CLR4_5_2fusfuslx1h1z3e.R.flushNeeded();}}

}
