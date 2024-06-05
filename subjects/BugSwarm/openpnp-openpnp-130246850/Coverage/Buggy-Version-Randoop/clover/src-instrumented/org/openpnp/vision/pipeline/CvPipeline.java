/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opencv.core.Mat;
import org.openpnp.model.Configuration;
import org.openpnp.spi.Camera;
import org.openpnp.vision.pipeline.CvStage.Result;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A CvPipeline performs computer vision operations on a working image by processing in series a
 * list of CvStage instances. Each CvStage instance can modify the working image and return a new
 * image along with data extracted from the image. After processing the image callers can get access
 * to the images and models from each stage.
 * 
 * CvPipeline is serializable using toXmlString and fromXmlString. This makes it easy to export
 * pipelines and exchange them with others.
 * 
 * This work takes inspiration from several existing projects:
 * 
 * FireSight by Karl Lew and \u0160imon Fojt\u016f: https://github.com/firepick1/FireSight
 * 
 * RoboRealm: http://www.roborealm.com/
 * 
 * TODO: Add measuring to image window.
 * 
 * TODO: Add info showing pixel coordinates when mouse is in image window.
 */
@Root
public class CvPipeline {public static class __CLR4_5_2fomfomlx1h1z1m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,20456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20326);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20327);nu.pattern.OpenCV.loadShared();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20328);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    private final static Logger logger = LoggerFactory.getLogger(CvPipeline.class);

    @ElementList
    private ArrayList<CvStage> stages = new ArrayList<>();

    private Map<CvStage, Result> results = new HashMap<CvStage, Result>();

    private Mat workingImage;

    private Camera camera;
    
    public CvPipeline() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20329);
        
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}
    
    public CvPipeline(String xmlPipeline) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20330);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20331);try {
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20332);fromXmlString(xmlPipeline);
        }
        catch (Exception e) {
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20333);throw new Error(e);
        }
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Add the given CvStage to the end of the pipeline using the given name. If name is null a
     * unique one will be generated and set on the stage.
     * 
     * @param name
     * @param stage
     */
    public void add(String name, CvStage stage) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20334);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20335);if ((((name == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20336)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20337)==0&false))) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20338);name = generateUniqueName();
        }
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20339);stage.setName(name);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20340);stages.add(stage);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Add the given CvStage to the end of the pipeline. If the stage does not have a name a unique
     * one will be generated and set on the stage.
     * 
     * @param stage
     */
    public void add(CvStage stage) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20341);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20342);add(stage.getName(), stage);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public void insert(String name, CvStage stage, int index) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20343);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20344);if ((((name == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20345)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20346)==0&false))) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20347);name = generateUniqueName();
        }
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20348);stage.setName(name);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20349);stages.add(index, stage);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public void insert(CvStage stage, int index) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20350);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20351);insert(stage.getName(), stage, index);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public void remove(String name) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20352);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20353);remove(getStage(name));
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public void remove(CvStage stage) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20354);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20355);stages.remove(stage);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public List<CvStage> getStages() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20356);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20357);return Collections.unmodifiableList(stages);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public CvStage getStage(String name) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20358);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20359);if ((((name == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20360)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20361)==0&false))) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20362);return null;
        }
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20363);for (CvStage stage : stages) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20364);if ((((stage.getName().equals(name))&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20365)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20366)==0&false))) {{
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20367);return stage;
            }
        }}
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20368);return null;
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Get the Result returned by the CvStage with the given name. May return null if the stage did
     * not return a result.
     * 
     * @param name
     * @return
     */
    public Result getResult(String name) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20369);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20370);if ((((name == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20371)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20372)==0&false))) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20373);return null;
        }
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20374);return getResult(getStage(name));
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Get the Result returned by give CvStage. May return null if the stage did not return a
     * result.
     * 
     * @param stage
     * @return
     */
    public Result getResult(CvStage stage) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20375);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20376);if ((((stage == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20377)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20378)==0&false))) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20379);return null;
        }
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20380);return results.get(stage);
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Get the current working image. Primarily intended to be called from CvStage implementations.
     * 
     * @return
     */
    public Mat getWorkingImage() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20381);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20382);return workingImage;
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public void setCamera(Camera camera) {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20383);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20384);this.camera = camera;
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public Camera getCamera() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20385);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20386);return camera;
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    public void process() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20387);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20388);release();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20389);for (CvStage stage : stages) {{
            // Process and time the stage and get the result.
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20390);long processingTimeNs = System.nanoTime();
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20391);Result result = null;
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20392);try {
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20393);if ((((!stage.isEnabled())&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20394)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20395)==0&false))) {{
                    __CLR4_5_2fomfomlx1h1z1m.R.inc(20396);throw new Exception("Stage not enabled.");
                }
                }__CLR4_5_2fomfomlx1h1z1m.R.inc(20397);result = stage.process(this);
            }
            catch (Exception e) {
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20398);result = new Result(null, e);
            }
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20399);processingTimeNs = System.nanoTime() - processingTimeNs;

            __CLR4_5_2fomfomlx1h1z1m.R.inc(20400);Mat image = null;
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20401);Object model = null;
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20402);if ((((result != null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20403)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20404)==0&false))) {{
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20405);image = result.image;
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20406);model = result.model;
            }

            // If the result image is null and there is a working image, replace the result image
            // replace the result image with a clone of the working image.
            }__CLR4_5_2fomfomlx1h1z1m.R.inc(20407);if ((((image == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20408)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20409)==0&false))) {{
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20410);if ((((workingImage != null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20411)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20412)==0&false))) {{
                    __CLR4_5_2fomfomlx1h1z1m.R.inc(20413);image = workingImage.clone();
                }
            }}
            // If the result image is not null:
            // Release the working image if the result image is different.
            // Replace the working image with the result image.
            // Clone the result image for storage.
            }else {{
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20414);if ((((workingImage != null && workingImage != image)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20415)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20416)==0&false))) {{
                    __CLR4_5_2fomfomlx1h1z1m.R.inc(20417);workingImage.release();
                }
                }__CLR4_5_2fomfomlx1h1z1m.R.inc(20418);workingImage = image;
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20419);image = image.clone();
            }

            }__CLR4_5_2fomfomlx1h1z1m.R.inc(20420);results.put(stage, new Result(image, model, processingTimeNs));
        }
    }}finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Release any temporary resources associated with the processing of the pipeline. Should be
     * called when the pipeline is no longer needed. This is primarily to release retained native
     * resources from OpenCV.
     */
    public void release() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20421);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20422);if ((((workingImage != null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20423)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20424)==0&false))) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20425);workingImage.release();
        }
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20426);for (Result result : results.values()) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20427);if ((((result.image != null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20428)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20429)==0&false))) {{
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20430);result.image.release();
            }
        }}
        }__CLR4_5_2fomfomlx1h1z1m.R.inc(20431);results.clear();
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Convert the pipeline to an XML string that can be read back in with #fromXmlString.
     * 
     * @return
     * @throws Exception
     */
    public String toXmlString() throws Exception {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20432);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20433);Serializer ser = Configuration.createSerializer();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20434);StringWriter sw = new StringWriter();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20435);ser.write(this, sw);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20436);return sw.toString();
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    /**
     * Parse the pipeline in the given String and replace the current pipeline with the results.
     * 
     * @param s
     * @throws Exception
     */
    public void fromXmlString(String s) throws Exception {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20437);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20438);release();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20439);Serializer ser = Configuration.createSerializer();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20440);StringReader sr = new StringReader(s);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20441);CvPipeline pipeline = ser.read(CvPipeline.class, sr);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20442);stages.clear();
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20443);for (CvStage stage : pipeline.getStages()) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20444);add(stage);
        }
    }}finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    private String generateUniqueName() {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20445);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20446);for (int i = 0;; i++) {{
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20447);String name = "" + i;
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20448);if ((((getStage(name) == null)&&(__CLR4_5_2fomfomlx1h1z1m.R.iget(20449)!=0|true))||(__CLR4_5_2fomfomlx1h1z1m.R.iget(20450)==0&false))) {{
                __CLR4_5_2fomfomlx1h1z1m.R.inc(20451);return name;
            }
        }}
    }}finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}

    @Override
    public CvPipeline clone() throws CloneNotSupportedException {try{__CLR4_5_2fomfomlx1h1z1m.R.inc(20452);
        __CLR4_5_2fomfomlx1h1z1m.R.inc(20453);try {
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20454);return new CvPipeline(toXmlString());
        }
        catch (Exception e) {
            __CLR4_5_2fomfomlx1h1z1m.R.inc(20455);throw new CloneNotSupportedException(e.getMessage());
        }
    }finally{__CLR4_5_2fomfomlx1h1z1m.R.flushNeeded();}}
}
