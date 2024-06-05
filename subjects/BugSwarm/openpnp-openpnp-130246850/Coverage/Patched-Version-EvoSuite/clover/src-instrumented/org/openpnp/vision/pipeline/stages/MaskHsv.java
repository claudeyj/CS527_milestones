/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.awt.Color;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.openpnp.vision.FluentCv;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;

/**
 * Remove color from an image based on the HSV color space. Pixels that fall between (hueMin,
 * saturationMin, valueMin) and (hueMax, saturationMax, valueMax) are set to black in the output
 * image.
 * 
 * This stage expects the input to be in HSV_FULL format, so you should do a ConvertColor
 * with Bgr2HsvFull before this stage and ConvertColor Hsv2BgrFull after. These are not applied
 * internally as to not complicate the use of multiple instances of this stage in series.
 * 
 * Note that this stage can be used with any 3 channel, 8 bit per channel color space. The order
 * of the filtered channels is hue, saturation, value, but you can use these ranges for other
 * channels.
 */
public class MaskHsv extends CvStage {public static class __CLR4_5_2g7jg7jlx1h5sv3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,21042,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private int hueMin = 31;

    @Attribute
    private int hueMax = 116;

    @Attribute
    private int saturationMin = 0;

    @Attribute
    private int saturationMax = 255;

    @Attribute
    private int valueMin = 0;

    @Attribute
    private int valueMax = 255;

    public int getHueMin() {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21007);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21008);return hueMin;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public void setHueMin(int hueMin) {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21009);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21010);this.hueMin = hueMin;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public int getHueMax() {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21011);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21012);return hueMax;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public void setHueMax(int hueMax) {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21013);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21014);this.hueMax = hueMax;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public int getSaturationMin() {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21015);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21016);return saturationMin;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public void setSaturationMin(int saturationMin) {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21017);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21018);this.saturationMin = saturationMin;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public int getSaturationMax() {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21019);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21020);return saturationMax;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public void setSaturationMax(int saturationMax) {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21021);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21022);this.saturationMax = saturationMax;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public int getValueMin() {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21023);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21024);return valueMin;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public void setValueMin(int valueMin) {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21025);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21026);this.valueMin = valueMin;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public int getValueMax() {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21027);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21028);return valueMax;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    public void setValueMax(int valueMax) {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21029);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21030);this.valueMax = valueMax;
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2g7jg7jlx1h5sv3.R.inc(21031);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21032);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21033);Mat mask = mat.clone();
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21034);Mat masked = mat.clone();
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21035);Scalar color = FluentCv.colorToScalar(Color.black);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21036);mask.setTo(color);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21037);masked.setTo(color);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21038);Core.inRange(mat, new Scalar(hueMin, saturationMin, valueMin), new Scalar(hueMax, saturationMax, valueMax), mask);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21039);Core.bitwise_not(mask, mask);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21040);mat.copyTo(masked, mask);
        __CLR4_5_2g7jg7jlx1h5sv3.R.inc(21041);return new Result(masked);
    }finally{__CLR4_5_2g7jg7jlx1h5sv3.R.flushNeeded();}}
}
