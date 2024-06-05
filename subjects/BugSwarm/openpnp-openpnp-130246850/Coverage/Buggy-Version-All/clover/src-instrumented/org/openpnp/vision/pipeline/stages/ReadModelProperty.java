/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.lang.reflect.Method;

import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;

import com.l2fprod.common.beans.BeanUtils;

/**
 * Get an object from a previous stage's model by querying the named property. The resulting
 * object is stored as this stage's model. 
 */
public class ReadModelProperty extends CvStage {public static class __CLR4_5_2gbxgbxlx1h3d9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,21187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private String modelStageName;
    
    @Attribute
    private String propertyName;
    
    public String getModelStageName() {try{__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21165);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21166);return modelStageName;
    }finally{__CLR4_5_2gbxgbxlx1h3d9b.R.flushNeeded();}}

    public void setModelStageName(String modelStageName) {try{__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21167);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21168);this.modelStageName = modelStageName;
    }finally{__CLR4_5_2gbxgbxlx1h3d9b.R.flushNeeded();}}

    public String getPropertyName() {try{__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21169);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21170);return propertyName;
    }finally{__CLR4_5_2gbxgbxlx1h3d9b.R.flushNeeded();}}

    public void setPropertyName(String propertyName) {try{__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21171);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21172);this.propertyName = propertyName;
    }finally{__CLR4_5_2gbxgbxlx1h3d9b.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21173);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21174);if ((((modelStageName == null)&&(__CLR4_5_2gbxgbxlx1h3d9b.R.iget(21175)!=0|true))||(__CLR4_5_2gbxgbxlx1h3d9b.R.iget(21176)==0&false))) {{
            __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21177);throw new Exception("modelStageName is required.");
        }
        
        }__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21178);if ((((propertyName == null)&&(__CLR4_5_2gbxgbxlx1h3d9b.R.iget(21179)!=0|true))||(__CLR4_5_2gbxgbxlx1h3d9b.R.iget(21180)==0&false))) {{
            __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21181);throw new Exception("propertyName is required.");
        }
        
        }__CLR4_5_2gbxgbxlx1h3d9b.R.inc(21182);Result result = pipeline.getResult(modelStageName);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21183);Object model = result.model;

        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21184);Method method = BeanUtils.getReadMethod(model.getClass(), propertyName);
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21185);Object value = method.invoke(model);
        
        __CLR4_5_2gbxgbxlx1h3d9b.R.inc(21186);return new Result(null, value);
    }finally{__CLR4_5_2gbxgbxlx1h3d9b.R.flushNeeded();}}
}
