/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.io.File;

import org.opencv.highgui.Highgui;
import org.openpnp.model.Configuration;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Save the working image as an image file in the debug directory using the specified prefix and
 * suffix. The suffix should be a file extension (including the period).
 */
public class ImageWriteDebug extends CvStage {public static class __CLR4_5_2g6ng6nlx1h3d7s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,20991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ImageWriteDebug.class);

    @Attribute
    private String prefix = "debug";

    @Attribute
    private String suffix = ".png";

    public String getPrefix() {try{__CLR4_5_2g6ng6nlx1h3d7s.R.inc(20975);
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20976);return prefix;
    }finally{__CLR4_5_2g6ng6nlx1h3d7s.R.flushNeeded();}}

    public void setPrefix(String prefix) {try{__CLR4_5_2g6ng6nlx1h3d7s.R.inc(20977);
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20978);this.prefix = prefix;
    }finally{__CLR4_5_2g6ng6nlx1h3d7s.R.flushNeeded();}}

    public String getSuffix() {try{__CLR4_5_2g6ng6nlx1h3d7s.R.inc(20979);
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20980);return suffix;
    }finally{__CLR4_5_2g6ng6nlx1h3d7s.R.flushNeeded();}}

    public void setSuffix(String suffix) {try{__CLR4_5_2g6ng6nlx1h3d7s.R.inc(20981);
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20982);this.suffix = suffix;
    }finally{__CLR4_5_2g6ng6nlx1h3d7s.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2g6ng6nlx1h3d7s.R.inc(20983);
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20984);if ((((!logger.isDebugEnabled())&&(__CLR4_5_2g6ng6nlx1h3d7s.R.iget(20985)!=0|true))||(__CLR4_5_2g6ng6nlx1h3d7s.R.iget(20986)==0&false))) {{
            __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20987);return null;
        }
        }__CLR4_5_2g6ng6nlx1h3d7s.R.inc(20988);File file = Configuration.get().createResourceFile(getClass(), prefix, suffix);
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20989);Highgui.imwrite(file.getAbsolutePath(), pipeline.getWorkingImage());
        __CLR4_5_2g6ng6nlx1h3d7s.R.inc(20990);return null;
    }finally{__CLR4_5_2g6ng6nlx1h3d7s.R.flushNeeded();}}
}
