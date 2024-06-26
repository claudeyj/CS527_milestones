/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;

public class Threshold extends CvStage {public static class __CLR4_5_2gcwgcwlx1h5sxu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,21222,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private int threshold = 100;

    @Attribute
    private boolean auto = false;

    @Attribute
    private boolean invert = false;

    public int getThreshold() {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21200);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21201);return threshold;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}

    public void setThreshold(int threshold) {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21202);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21203);this.threshold = threshold;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}

    public boolean isAuto() {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21204);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21205);return auto;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}

    public void setAuto(boolean auto) {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21206);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21207);this.auto = auto;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}

    public boolean isInvert() {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21208);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21209);return invert;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}

    public void setInvert(boolean invert) {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21210);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21211);this.invert = invert;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2gcwgcwlx1h5sxu.R.inc(21212);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21213);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21214);int type = (((invert )&&(__CLR4_5_2gcwgcwlx1h5sxu.R.iget(21215)!=0|true))||(__CLR4_5_2gcwgcwlx1h5sxu.R.iget(21216)==0&false))? Imgproc.THRESH_BINARY_INV : Imgproc.THRESH_BINARY;
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21217);type |= (((auto )&&(__CLR4_5_2gcwgcwlx1h5sxu.R.iget(21218)!=0|true))||(__CLR4_5_2gcwgcwlx1h5sxu.R.iget(21219)==0&false))? Imgproc.THRESH_OTSU : 0;
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21220);Imgproc.threshold(mat, mat, threshold, 255, type);
        __CLR4_5_2gcwgcwlx1h5sxu.R.inc(21221);return null;
    }finally{__CLR4_5_2gcwgcwlx1h5sxu.R.flushNeeded();}}
}
