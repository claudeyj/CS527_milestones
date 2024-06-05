/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import org.opencv.core.Mat;
import org.simpleframework.xml.Attribute;

/**
 * Base class for a stage in a CvPipeline. A CvStage has a unique name within a pipeline and is able
 * to perform computer vision operations reuslting in either a modified working image or a new image
 * and optional model data extracted from the image.
 */
public abstract class CvStage {public static class __CLR4_5_2fs8fs8lx1h1z27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,20532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private String name;

    @Attribute(required = false)
    private boolean enabled = true;

    /**
     * Perform an operation in a pipeline. Typical implementations will call
     * CvPipeline#getWorkingImage(), perform some type of operation on the image and will return a
     * Result containing a modified image and model data about features found in the image.
     *
     * If the stage only modifies the working image, it is sufficient to just return null, and this
     * will typically be the most common case.
     * 
     * @param pipeline
     * @return Null or a Result object containing an optional image and optional model. If the
     *         return value is null the pipeline will store a copy of the working image as the
     *         result for this stage. Otherwise it will set the working image to the result image
     *         and store the result image.
     * @throws Exception
     */
    public abstract Result process(CvPipeline pipeline) throws Exception;

    public String getName() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20456);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20457);return name;
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20458);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20459);this.name = name;
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public boolean isEnabled() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20460);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20461);return enabled;
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public void setEnabled(boolean enabled) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20462);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20463);this.enabled = enabled;
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public String getCategory() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20464);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20465);try {
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20466);Stage a = getClass().getAnnotation(Stage.class);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20467);return a.category();
        }
        catch (Exception e) {
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20468);return null;
        }
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public String getDescription() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20469);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20470);try {
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20471);Stage a = getClass().getAnnotation(Stage.class);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20472);return a.description();
        }
        catch (Exception e) {
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20473);return null;
        }
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public String getDescription(String propertyName) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20474);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20475);try {
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20476);Property a = getClass().getDeclaredField(propertyName).getAnnotation(Property.class);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20477);return a.description();
        }
        catch (Exception e) {
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20478);return null;
        }
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

    public BeanInfo getBeanInfo() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20479);
        __CLR4_5_2fs8fs8lx1h1z27.R.inc(20480);return new CvStageBeanInfo();
    }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}
    
    public class CvStageBeanInfo implements BeanInfo {
        private final BeanInfo beanInfo;

        public CvStageBeanInfo() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20481);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20482);try {
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20483);beanInfo = Introspector.getBeanInfo(CvStage.this.getClass(), CvStage.class);
            }
            catch (Exception e) {
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20484);throw new Error(e);
            }
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public BeanDescriptor getBeanDescriptor() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20485);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20486);BeanDescriptor bd = beanInfo.getBeanDescriptor();
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20487);if ((((bd == null)&&(__CLR4_5_2fs8fs8lx1h1z27.R.iget(20488)!=0|true))||(__CLR4_5_2fs8fs8lx1h1z27.R.iget(20489)==0&false))) {{
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20490);bd = new BeanDescriptor(CvStage.this.getClass());
            }
            }__CLR4_5_2fs8fs8lx1h1z27.R.inc(20491);bd.setShortDescription(CvStage.this.getDescription());
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20492);return bd;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public EventSetDescriptor[] getEventSetDescriptors() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20493);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20494);return null;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public int getDefaultEventIndex() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20495);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20496);return 0;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public PropertyDescriptor[] getPropertyDescriptors() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20497);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20498);PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20499);for (PropertyDescriptor pd : pds) {{
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20500);pd.setShortDescription(CvStage.this.getDescription(pd.getName()));
            }
            }__CLR4_5_2fs8fs8lx1h1z27.R.inc(20501);return pds;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public int getDefaultPropertyIndex() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20502);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20503);return 0;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public MethodDescriptor[] getMethodDescriptors() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20504);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20505);return null;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public BeanInfo[] getAdditionalBeanInfo() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20506);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20507);return null;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        @Override
        public Image getIcon(int iconKind) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20508);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20509);return null;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}
    }

    public static class Result {
        final public Mat image;
        final public Object model;
        final public long processingTimeNs;

        public Result(Mat image, Object model, long processingTimeNs) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20510);
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20511);this.image = image;
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20512);this.model = model;
            __CLR4_5_2fs8fs8lx1h1z27.R.inc(20513);this.processingTimeNs = processingTimeNs;
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        public Result(Mat image, Object model) {
            this(image, model, 0);__CLR4_5_2fs8fs8lx1h1z27.R.inc(20515);try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20514);
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        public Result(Mat image) {
            this(image, null, 0);__CLR4_5_2fs8fs8lx1h1z27.R.inc(20517);try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20516);
        }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

        public static class Circle {
            public double x;
            public double y;
            public double diameter;

            public Circle(double x, double y, double diameter) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20518);
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20519);this.x = x;
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20520);this.y = y;
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20521);this.diameter = diameter;
            }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20522);
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20523);return "Circle [x=" + x + ", y=" + y + ", diameter=" + diameter + "]";
            }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}
        }

        public static class TemplateMatch {
            public double x;
            public double y;
            public double width;
            public double height;
            public double score;

            public TemplateMatch(double x, double y, double width, double height, double score) {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20524);
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20525);this.x = x;
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20526);this.y = y;
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20527);this.width = width;
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20528);this.height = height;
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20529);this.score = score;
            }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2fs8fs8lx1h1z27.R.inc(20530);
                __CLR4_5_2fs8fs8lx1h1z27.R.inc(20531);return "TemplateMatch [x=" + x + ", y=" + y + ", width=" + width + ", height="
                        + height + ", score=" + score + "]";
            }finally{__CLR4_5_2fs8fs8lx1h1z27.R.flushNeeded();}}
        }
    }
}
