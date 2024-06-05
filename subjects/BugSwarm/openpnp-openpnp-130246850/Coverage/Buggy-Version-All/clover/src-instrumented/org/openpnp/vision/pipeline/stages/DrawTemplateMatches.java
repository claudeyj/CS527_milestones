/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.awt.Color;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.openpnp.vision.FluentCv;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.CvStage.Result.TemplateMatch;
import org.openpnp.vision.pipeline.stages.convert.ColorConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.convert.Convert;

/**
 * Draws TemplatesMatches contained in a List<TemplateMatch> by referencing a previous stage's model data.
 */
public class DrawTemplateMatches extends CvStage {public static class __CLR4_5_2g2og2olx1h3d70{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,20868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Element(required = false)
    @Convert(ColorConverter.class)
    private Color color = null;

    @Attribute(required = false)
    private String templateMatchesStageName = null;

    public Color getColor() {try{__CLR4_5_2g2og2olx1h3d70.R.inc(20832);
        __CLR4_5_2g2og2olx1h3d70.R.inc(20833);return color;
    }finally{__CLR4_5_2g2og2olx1h3d70.R.flushNeeded();}}

    public void setColor(Color color) {try{__CLR4_5_2g2og2olx1h3d70.R.inc(20834);
        __CLR4_5_2g2og2olx1h3d70.R.inc(20835);this.color = color;
    }finally{__CLR4_5_2g2og2olx1h3d70.R.flushNeeded();}}

    public String getTemplateMatchesStageName() {try{__CLR4_5_2g2og2olx1h3d70.R.inc(20836);
        __CLR4_5_2g2og2olx1h3d70.R.inc(20837);return templateMatchesStageName;
    }finally{__CLR4_5_2g2og2olx1h3d70.R.flushNeeded();}}

    public void setTemplateMatchesStageName(String templateMatchesStageName) {try{__CLR4_5_2g2og2olx1h3d70.R.inc(20838);
        __CLR4_5_2g2og2olx1h3d70.R.inc(20839);this.templateMatchesStageName = templateMatchesStageName;
    }finally{__CLR4_5_2g2og2olx1h3d70.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2g2og2olx1h3d70.R.inc(20840);
        __CLR4_5_2g2og2olx1h3d70.R.inc(20841);if ((((templateMatchesStageName == null)&&(__CLR4_5_2g2og2olx1h3d70.R.iget(20842)!=0|true))||(__CLR4_5_2g2og2olx1h3d70.R.iget(20843)==0&false))) {{
            __CLR4_5_2g2og2olx1h3d70.R.inc(20844);return null;
        }
        }__CLR4_5_2g2og2olx1h3d70.R.inc(20845);Result result = pipeline.getResult(templateMatchesStageName);
        __CLR4_5_2g2og2olx1h3d70.R.inc(20846);if ((((result == null || result.model == null)&&(__CLR4_5_2g2og2olx1h3d70.R.iget(20847)!=0|true))||(__CLR4_5_2g2og2olx1h3d70.R.iget(20848)==0&false))) {{
            __CLR4_5_2g2og2olx1h3d70.R.inc(20849);return null;
        }
        }__CLR4_5_2g2og2olx1h3d70.R.inc(20850);Mat mat = pipeline.getWorkingImage();

        __CLR4_5_2g2og2olx1h3d70.R.inc(20851);List<TemplateMatch> matches = (List<TemplateMatch>) result.model;
        __CLR4_5_2g2og2olx1h3d70.R.inc(20852);for (int i = 0; (((i < matches.size())&&(__CLR4_5_2g2og2olx1h3d70.R.iget(20853)!=0|true))||(__CLR4_5_2g2og2olx1h3d70.R.iget(20854)==0&false)); i++) {{
            __CLR4_5_2g2og2olx1h3d70.R.inc(20855);TemplateMatch match = matches.get(i);
            __CLR4_5_2g2og2olx1h3d70.R.inc(20856);double x = match.x;
            __CLR4_5_2g2og2olx1h3d70.R.inc(20857);double y = match.y;
            __CLR4_5_2g2og2olx1h3d70.R.inc(20858);double score = match.score;
            __CLR4_5_2g2og2olx1h3d70.R.inc(20859);double width = match.width;
            __CLR4_5_2g2og2olx1h3d70.R.inc(20860);double height = match.height;
            __CLR4_5_2g2og2olx1h3d70.R.inc(20861);Color color_ = (((this.color == null )&&(__CLR4_5_2g2og2olx1h3d70.R.iget(20862)!=0|true))||(__CLR4_5_2g2og2olx1h3d70.R.iget(20863)==0&false))? FluentCv.indexedColor(i) : this.color;
            __CLR4_5_2g2og2olx1h3d70.R.inc(20864);Scalar color = FluentCv.colorToScalar(color_);
            __CLR4_5_2g2og2olx1h3d70.R.inc(20865);Core.rectangle(mat, new org.opencv.core.Point(x, y),
                    new org.opencv.core.Point(x + width, y + height), color);
            __CLR4_5_2g2og2olx1h3d70.R.inc(20866);Core.putText(mat, "" + score, new org.opencv.core.Point(x + width, y + height),
                    Core.FONT_HERSHEY_PLAIN, 1.0, color);
        }

        }__CLR4_5_2g2og2olx1h3d70.R.inc(20867);return null;
    }finally{__CLR4_5_2g2og2olx1h3d70.R.flushNeeded();}}
}
