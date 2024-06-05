/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;

/**
 * Finds circles in the working image and stores the results as a List<Circle> on the model. 
 */
public class DetectCirclesHough extends CvStage {public static class __CLR4_5_2fwqfwqlx1h3d11{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,20657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private int minDistance = 10;

    @Attribute
    private int minDiameter = 10;

    @Attribute
    private int maxDiameter = 100;

    /**
     * Inverse ratio of the accumulator resolution to the image resolution. For example, if dp=1 ,
     * the accumulator has the same resolution as the input image. If dp=2 , the accumulator has
     * half as big width and height.
     */
    @Attribute
    private double dp = 1;

    /**
     * First method-specific parameter. In case of CV_HOUGH_GRADIENT , it is the higher threshold of
     * the two passed to the Canny() edge detector (the lower one is twice smaller).
     */
    @Attribute
    private double param1 = 80;

    /**
     * Second method-specific parameter. In case of CV_HOUGH_GRADIENT , it is the accumulator
     * threshold for the circle centers at the detection stage. The smaller it is, the more false
     * circles may be detected. Circles, corresponding to the larger accumulator values, will be
     * returned first.
     */
    @Attribute
    private double param2 = 10;

    public int getMinDistance() {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20618);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20619);return minDistance;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public void setMinDistance(int minDistance) {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20620);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20621);this.minDistance = minDistance;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public int getMinDiameter() {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20622);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20623);return minDiameter;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public void setMinDiameter(int minDiameter) {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20624);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20625);this.minDiameter = minDiameter;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public int getMaxDiameter() {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20626);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20627);return maxDiameter;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public void setMaxDiameter(int maxDiameter) {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20628);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20629);this.maxDiameter = maxDiameter;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public double getDp() {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20630);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20631);return dp;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public void setDp(double dp) {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20632);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20633);this.dp = dp;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public double getParam1() {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20634);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20635);return param1;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public void setParam1(double param1) {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20636);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20637);this.param1 = param1;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public double getParam2() {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20638);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20639);return param2;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    public void setParam2(double param2) {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20640);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20641);this.param2 = param2;
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2fwqfwqlx1h3d11.R.inc(20642);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20643);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20644);Mat output = new Mat();
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20645);Imgproc.HoughCircles(mat, output, Imgproc.CV_HOUGH_GRADIENT, dp, minDistance, param1,
                param2, minDiameter / 2, maxDiameter / 2);
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20646);List<Result.Circle> circles = new ArrayList<>();
        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20647);for (int i = 0; (((i < output.cols())&&(__CLR4_5_2fwqfwqlx1h3d11.R.iget(20648)!=0|true))||(__CLR4_5_2fwqfwqlx1h3d11.R.iget(20649)==0&false)); i++) {{
            __CLR4_5_2fwqfwqlx1h3d11.R.inc(20650);double[] circle = output.get(0, i);
            __CLR4_5_2fwqfwqlx1h3d11.R.inc(20651);double x = circle[0];
            __CLR4_5_2fwqfwqlx1h3d11.R.inc(20652);double y = circle[1];
            __CLR4_5_2fwqfwqlx1h3d11.R.inc(20653);double radius = circle[2];
            __CLR4_5_2fwqfwqlx1h3d11.R.inc(20654);circles.add(new Result.Circle(x, y, radius * 2.0));
        }
        }__CLR4_5_2fwqfwqlx1h3d11.R.inc(20655);output.release();

        __CLR4_5_2fwqfwqlx1h3d11.R.inc(20656);return new Result(null, circles);
    }finally{__CLR4_5_2fwqfwqlx1h3d11.R.flushNeeded();}}
}
