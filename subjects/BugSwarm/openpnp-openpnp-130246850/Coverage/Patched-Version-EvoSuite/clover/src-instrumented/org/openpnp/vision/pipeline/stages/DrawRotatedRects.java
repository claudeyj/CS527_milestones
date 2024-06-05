/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.awt.Color;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.core.RotatedRect;
import org.openpnp.vision.FluentCv;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.stages.convert.ColorConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.convert.Convert;

/**
 * Draws RotatedRects from a stage's model. Input can be either a single RotatedRect or
 * a List<RotatedRect> 
 */
public class DrawRotatedRects extends CvStage {public static class __CLR4_5_2g1kg1klx1h5ssw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,20833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Element(required = false)
    @Convert(ColorConverter.class)
    private Color color = null;

    @Attribute(required = false)
    private String rotatedRectsStageName = null;
    
    @Attribute
    private int thickness = 1;

    public Color getColor() {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20792);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20793);return color;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}

    public void setColor(Color color) {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20794);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20795);this.color = color;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}
    
    public String getRotatedRectsStageName() {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20796);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20797);return rotatedRectsStageName;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}

    public void setRotatedRectsStageName(String rotatedRectsStageName) {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20798);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20799);this.rotatedRectsStageName = rotatedRectsStageName;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}

    public int getThickness() {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20800);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20801);return thickness;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}

    public void setThickness(int thickness) {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20802);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20803);this.thickness = thickness;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2g1kg1klx1h5ssw.R.inc(20804);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20805);if ((((rotatedRectsStageName == null)&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20806)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20807)==0&false))) {{
            __CLR4_5_2g1kg1klx1h5ssw.R.inc(20808);throw new Exception("rotatedRectsStageName must be specified.");
        }
        }__CLR4_5_2g1kg1klx1h5ssw.R.inc(20809);Result result = pipeline.getResult(rotatedRectsStageName);
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20810);if ((((result == null || result.model == null)&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20811)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20812)==0&false))) {{
            __CLR4_5_2g1kg1klx1h5ssw.R.inc(20813);return null;
        }
        }__CLR4_5_2g1kg1klx1h5ssw.R.inc(20814);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2g1kg1klx1h5ssw.R.inc(20815);if ((((result.model instanceof RotatedRect)&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20816)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20817)==0&false))) {{
            __CLR4_5_2g1kg1klx1h5ssw.R.inc(20818);FluentCv.drawRotatedRect(mat, ((RotatedRect) result.model), (((color == null )&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20819)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20820)==0&false))? FluentCv.indexedColor(0) : color, thickness);
        }
        }else {__CLR4_5_2g1kg1klx1h5ssw.R.inc(20821);if ((((result.model instanceof List<?>)&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20822)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20823)==0&false))) {{
            __CLR4_5_2g1kg1klx1h5ssw.R.inc(20824);List<RotatedRect> rects = (List<RotatedRect>) result.model;
            __CLR4_5_2g1kg1klx1h5ssw.R.inc(20825);for (int i = 0; (((i < rects.size())&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20826)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20827)==0&false)); i++) {{
                __CLR4_5_2g1kg1klx1h5ssw.R.inc(20828);RotatedRect rect = rects.get(i);
                __CLR4_5_2g1kg1klx1h5ssw.R.inc(20829);FluentCv.drawRotatedRect(mat, rect, (((color == null )&&(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20830)!=0|true))||(__CLR4_5_2g1kg1klx1h5ssw.R.iget(20831)==0&false))? FluentCv.indexedColor(i) : color, thickness);
            }
        }}
        }}__CLR4_5_2g1kg1klx1h5ssw.R.inc(20832);return null;
    }finally{__CLR4_5_2g1kg1klx1h5ssw.R.flushNeeded();}}
}
