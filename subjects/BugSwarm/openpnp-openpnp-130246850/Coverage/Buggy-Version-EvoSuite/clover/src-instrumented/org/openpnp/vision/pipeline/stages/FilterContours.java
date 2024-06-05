/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.MatOfPoint;
import org.opencv.imgproc.Imgproc;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;

/**
 * Draws circles from a List<Circle> onto the working image. 
 */
public class FilterContours extends CvStage {public static class __CLR4_5_2g3og3olx1h0gsi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,20903,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute(required = false)
    private String contoursStageName = null;
    
    @Attribute
    private double minArea = -1;
    
    @Attribute
    private double maxArea = -1;
    
    public String getContoursStageName() {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20868);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20869);return contoursStageName;
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}

    public void setContoursStageName(String contoursStageName) {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20870);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20871);this.contoursStageName = contoursStageName;
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}

    public double getMinArea() {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20872);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20873);return minArea;
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}

    public void setMinArea(double minArea) {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20874);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20875);this.minArea = minArea;
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}

    public double getMaxArea() {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20876);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20877);return maxArea;
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}

    public void setMaxArea(double maxArea) {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20878);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20879);this.maxArea = maxArea;
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2g3og3olx1h0gsi.R.inc(20880);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20881);if ((((contoursStageName == null)&&(__CLR4_5_2g3og3olx1h0gsi.R.iget(20882)!=0|true))||(__CLR4_5_2g3og3olx1h0gsi.R.iget(20883)==0&false))) {{
            __CLR4_5_2g3og3olx1h0gsi.R.inc(20884);return null;
        }
        }__CLR4_5_2g3og3olx1h0gsi.R.inc(20885);Result result = pipeline.getResult(contoursStageName);
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20886);if ((((result == null || result.model == null)&&(__CLR4_5_2g3og3olx1h0gsi.R.iget(20887)!=0|true))||(__CLR4_5_2g3og3olx1h0gsi.R.iget(20888)==0&false))) {{
            __CLR4_5_2g3og3olx1h0gsi.R.inc(20889);return null;
        }
        }__CLR4_5_2g3og3olx1h0gsi.R.inc(20890);List<MatOfPoint> contours = (List<MatOfPoint>) result.model;
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20891);List<MatOfPoint> results = new ArrayList<MatOfPoint>();
        __CLR4_5_2g3og3olx1h0gsi.R.inc(20892);for (MatOfPoint contour : contours) {{
            __CLR4_5_2g3og3olx1h0gsi.R.inc(20893);double area = Imgproc.contourArea(contour);
            __CLR4_5_2g3og3olx1h0gsi.R.inc(20894);if ((((area >= ((((minArea == -1 )&&(__CLR4_5_2g3og3olx1h0gsi.R.iget(20895)!=0|true))||(__CLR4_5_2g3og3olx1h0gsi.R.iget(20896)==0&false))? Double.MIN_VALUE : minArea) && area <= ((((maxArea == -1 )&&(__CLR4_5_2g3og3olx1h0gsi.R.iget(20897)!=0|true))||(__CLR4_5_2g3og3olx1h0gsi.R.iget(20898)==0&false))? Double.MAX_VALUE : maxArea))&&(__CLR4_5_2g3og3olx1h0gsi.R.iget(20899)!=0|true))||(__CLR4_5_2g3og3olx1h0gsi.R.iget(20900)==0&false))) {{
                __CLR4_5_2g3og3olx1h0gsi.R.inc(20901);results.add(contour);
            }
        }}
        }__CLR4_5_2g3og3olx1h0gsi.R.inc(20902);return new Result(null, results);
    }finally{__CLR4_5_2g3og3olx1h0gsi.R.flushNeeded();}}
}
