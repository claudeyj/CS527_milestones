/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.awt.Color;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.openpnp.util.HslColor;
import org.openpnp.vision.FluentCv;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.stages.convert.ColorConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.convert.Convert;

/**
 * Draws circles from a List<Circle> onto the working image. 
 */
public class DrawCircles extends CvStage {public static class __CLR4_5_2fymfymlx1h0gqu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,20723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Element(required = false)
    @Convert(ColorConverter.class)
    private Color color = null;

    @Element(required = false)
    @Convert(ColorConverter.class)
    private Color centerColor = null;

    @Attribute(required = false)
    private String circlesStageName = null;

    public Color getColor() {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20686);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20687);return color;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}

    public void setColor(Color color) {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20688);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20689);this.color = color;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}
    
    public Color getCenterColor() {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20690);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20691);return centerColor;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}

    public void setCenterColor(Color centerColor) {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20692);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20693);this.centerColor = centerColor;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}

    public String getCirclesStageName() {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20694);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20695);return circlesStageName;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}

    public void setCirclesStageName(String modelStageName) {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20696);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20697);this.circlesStageName = modelStageName;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2fymfymlx1h0gqu.R.inc(20698);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20699);if ((((circlesStageName == null)&&(__CLR4_5_2fymfymlx1h0gqu.R.iget(20700)!=0|true))||(__CLR4_5_2fymfymlx1h0gqu.R.iget(20701)==0&false))) {{
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20702);return null;
        }
        }__CLR4_5_2fymfymlx1h0gqu.R.inc(20703);Result result = pipeline.getResult(circlesStageName);
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20704);if ((((result == null || result.model == null)&&(__CLR4_5_2fymfymlx1h0gqu.R.iget(20705)!=0|true))||(__CLR4_5_2fymfymlx1h0gqu.R.iget(20706)==0&false))) {{
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20707);return null;
        }
        }__CLR4_5_2fymfymlx1h0gqu.R.inc(20708);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20709);List<Result.Circle> circles = (List<Result.Circle>) result.model;
        __CLR4_5_2fymfymlx1h0gqu.R.inc(20710);for (int i = 0; (((i < circles.size())&&(__CLR4_5_2fymfymlx1h0gqu.R.iget(20711)!=0|true))||(__CLR4_5_2fymfymlx1h0gqu.R.iget(20712)==0&false)); i++) {{
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20713);Result.Circle circle = circles.get(i);
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20714);Color color = (((this.color == null )&&(__CLR4_5_2fymfymlx1h0gqu.R.iget(20715)!=0|true))||(__CLR4_5_2fymfymlx1h0gqu.R.iget(20716)==0&false))? FluentCv.indexedColor(i) : this.color;
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20717);Color centerColor = (((this.centerColor == null )&&(__CLR4_5_2fymfymlx1h0gqu.R.iget(20718)!=0|true))||(__CLR4_5_2fymfymlx1h0gqu.R.iget(20719)==0&false))? new HslColor(color).getComplementary() : this.centerColor;
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20720);Core.circle(mat, new Point(circle.x, circle.y), (int) (circle.diameter / 2),
                    FluentCv.colorToScalar(color), 2);
            __CLR4_5_2fymfymlx1h0gqu.R.inc(20721);Core.circle(mat, new Point(circle.x, circle.y), 1, FluentCv.colorToScalar(centerColor),
                    2);
        }
        }__CLR4_5_2fymfymlx1h0gqu.R.inc(20722);return null;
    }finally{__CLR4_5_2fymfymlx1h0gqu.R.flushNeeded();}}
}
