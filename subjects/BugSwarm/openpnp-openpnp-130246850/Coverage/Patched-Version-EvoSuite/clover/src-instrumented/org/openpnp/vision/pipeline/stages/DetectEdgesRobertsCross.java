/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;

public class DetectEdgesRobertsCross extends CvStage {public static class __CLR4_5_2fy6fy6lx1h5spz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,20687,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2fy6fy6lx1h5spz.R.inc(20670);
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20671);Mat mat = pipeline.getWorkingImage();

        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20672);Mat kernel = Mat.eye(new Size(2, 2), CvType.CV_32FC1);
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20673);kernel.put(0, 0, 0, 1, -1, 0);
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20674);Mat roberts1 = new Mat();
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20675);Imgproc.filter2D(mat, roberts1, CvType.CV_32FC1, kernel);
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20676);Core.convertScaleAbs(roberts1, roberts1);

        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20677);kernel.put(0, 0, 1, 0, 0, -1);
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20678);Mat roberts2 = new Mat();
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20679);Imgproc.filter2D(mat, roberts2, CvType.CV_32FC1, kernel);
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20680);Core.convertScaleAbs(roberts2, roberts2);

        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20681);Mat roberts = new Mat();
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20682);Core.add(roberts1, roberts2, roberts);
        
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20683);kernel.release();
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20684);roberts1.release();
        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20685);roberts2.release();

        __CLR4_5_2fy6fy6lx1h5spz.R.inc(20686);return new Result(roberts);
    }finally{__CLR4_5_2fy6fy6lx1h5spz.R.flushNeeded();}}
}
