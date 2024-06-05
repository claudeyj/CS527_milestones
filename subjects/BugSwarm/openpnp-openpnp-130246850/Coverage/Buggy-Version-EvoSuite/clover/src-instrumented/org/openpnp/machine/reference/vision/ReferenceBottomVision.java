/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.vision;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Action;
import javax.swing.Icon;

import org.apache.commons.io.IOUtils;
import org.opencv.core.RotatedRect;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.vision.wizards.ReferenceBottomVisionConfigurationWizard;
import org.openpnp.machine.reference.vision.wizards.ReferenceBottomVisionPartConfigurationWizard;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PartAlignment;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.OpenCvUtils;
import org.openpnp.util.VisionUtils;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage.Result;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferenceBottomVision implements PartAlignment {public static class __CLR4_5_2awqawqlx1h0dc5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,14229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(ReferenceBottomVision.class);

    @Element(required = false)
    protected CvPipeline pipeline = createDefaultPipeline();



    @Attribute(required = false)
    protected boolean enabled = false;

    @ElementMap(required = false)
    protected Map<String, PartSettings> partSettingsByPartId = new HashMap<>();

    @Override
    public Location findOffsets(Part part, Nozzle nozzle) throws Exception {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14138);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14139);PartSettings partSettings = getPartSettings(part);

        __CLR4_5_2awqawqlx1h0dc5.R.inc(14140);if ((((!isEnabled() || !partSettings.isEnabled())&&(__CLR4_5_2awqawqlx1h0dc5.R.iget(14141)!=0|true))||(__CLR4_5_2awqawqlx1h0dc5.R.iget(14142)==0&false))) {{
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14143);return new Location(LengthUnit.Millimeters);
        }

        }__CLR4_5_2awqawqlx1h0dc5.R.inc(14144);Camera camera = VisionUtils.getBottomVisionCamera();

        // Create a location that is the Camera's X, Y, it's Z + part height
        // and a rotation of 0.
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14145);Location startLocation = camera.getLocation();
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14146);Length partHeight = part.getHeight();
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14147);Location partHeightLocation =
                new Location(partHeight.getUnits(), 0, 0, partHeight.getValue(), 0);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14148);startLocation = startLocation.add(partHeightLocation).derive(null, null, null, 0d);

        __CLR4_5_2awqawqlx1h0dc5.R.inc(14149);MovableUtils.moveToLocationAtSafeZ(nozzle, startLocation);

        __CLR4_5_2awqawqlx1h0dc5.R.inc(14150);CvPipeline pipeline = partSettings.getPipeline();

        __CLR4_5_2awqawqlx1h0dc5.R.inc(14151);pipeline.setCamera(camera);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14152);pipeline.process();

        __CLR4_5_2awqawqlx1h0dc5.R.inc(14153);Result result = pipeline.getResult("result");
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14154);if ((((!(result.model instanceof RotatedRect))&&(__CLR4_5_2awqawqlx1h0dc5.R.iget(14155)!=0|true))||(__CLR4_5_2awqawqlx1h0dc5.R.iget(14156)==0&false))) {{
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14157);throw new Exception("Bottom vision alignment failed for part " + part.getId()
                    + " on nozzle " + nozzle.getName() + ". No result found.");
        }
        }__CLR4_5_2awqawqlx1h0dc5.R.inc(14158);RotatedRect rect = (RotatedRect) result.model;
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14159);logger.debug("Result rect {}", rect);

        // Create the offsets object. This is the physical distance from
        // the center of the camera to the located part.
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14160);Location offsets = VisionUtils.getPixelCenterOffsets(camera, rect.center.x, rect.center.y);

        // We assume that the part is never picked more than 45\u00ba rotated
        // so if OpenCV tells us it's rotated more than 45\u00ba we correct
        // it. This seems to happen quite a bit when the angle of rotation
        // is close to 0.
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14161);double angle = rect.angle;
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14162);if ((((Math.abs(angle) > 45)&&(__CLR4_5_2awqawqlx1h0dc5.R.iget(14163)!=0|true))||(__CLR4_5_2awqawqlx1h0dc5.R.iget(14164)==0&false))) {{
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14165);if ((((angle < 0)&&(__CLR4_5_2awqawqlx1h0dc5.R.iget(14166)!=0|true))||(__CLR4_5_2awqawqlx1h0dc5.R.iget(14167)==0&false))) {{
                __CLR4_5_2awqawqlx1h0dc5.R.inc(14168);angle += 90;
            }
            }else {{
                __CLR4_5_2awqawqlx1h0dc5.R.inc(14169);angle -= 90;
            }
        }}

        // Set the angle on the offsets.
        }__CLR4_5_2awqawqlx1h0dc5.R.inc(14170);offsets = offsets.derive(null, null, null, -angle);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14171);logger.debug("Final offsets {}", offsets);

        __CLR4_5_2awqawqlx1h0dc5.R.inc(14172);CameraView cameraView = MainFrame.mainFrame.cameraPanel.getCameraView(camera);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14173);String s = rect.size.toString() + " " + rect.angle + "\u00b0";
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14174);cameraView.showFilteredImage(OpenCvUtils.toBufferedImage(pipeline.getWorkingImage()), s,
                1500);


        __CLR4_5_2awqawqlx1h0dc5.R.inc(14175);return offsets;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public static CvPipeline createDefaultPipeline() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14176);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14177);try {
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14178);String xml = IOUtils.toString(ReferenceBottomVision.class
                    .getResource("ReferenceBottomVision-DefaultPipeline.xml"));
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14179);return new CvPipeline(xml);
        }
        catch (Exception e) {
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14180);throw new Error(e);
        }
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public CvPipeline getPipeline() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14181);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14182);return pipeline;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public void setPipeline(CvPipeline pipeline) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14183);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14184);this.pipeline = pipeline;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public boolean isEnabled() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14185);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14186);return enabled;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public void setEnabled(boolean enabled) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14187);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14188);this.enabled = enabled;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14189);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14190);return "Bottom Vision";
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14191);
        // TODO Auto-generated method stub
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14192);return null;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14193);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14194);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new ReferenceBottomVisionConfigurationWizard(this))};
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14195);
        // TODO Auto-generated method stub
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14196);return null;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14197);
        // TODO Auto-generated method stub
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14198);return null;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public PartSettings getPartSettings(Part part) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14199);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14200);PartSettings partSettings = this.partSettingsByPartId.get(part.getId());
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14201);if ((((partSettings == null)&&(__CLR4_5_2awqawqlx1h0dc5.R.iget(14202)!=0|true))||(__CLR4_5_2awqawqlx1h0dc5.R.iget(14203)==0&false))) {{
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14204);partSettings = new PartSettings(this);
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14205);this.partSettingsByPartId.put(part.getId(), partSettings);
        }
        }__CLR4_5_2awqawqlx1h0dc5.R.inc(14206);return partSettings;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    public Map<String, PartSettings> getPartSettingsByPartId() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14207);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14208);return partSettingsByPartId;
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Override
    public Wizard getPartConfigurationWizard(Part part) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14209);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14210);PartSettings partSettings = getPartSettings(part);
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14211);try {
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14212);partSettings.getPipeline().setCamera(VisionUtils.getBottomVisionCamera());
        }
        catch (Exception e) {
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14213);e.printStackTrace();
        }
        __CLR4_5_2awqawqlx1h0dc5.R.inc(14214);return new ReferenceBottomVisionPartConfigurationWizard(this, part);
    }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

    @Root
    public static class PartSettings {
        @Attribute
        protected boolean enabled;

        @Element
        protected CvPipeline pipeline;

        public PartSettings() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14215);

        }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

        public PartSettings(ReferenceBottomVision bottomVision) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14216);
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14217);setEnabled(bottomVision.isEnabled());
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14218);try {
                __CLR4_5_2awqawqlx1h0dc5.R.inc(14219);setPipeline(bottomVision.getPipeline().clone());
            }
            catch (Exception e) {
                __CLR4_5_2awqawqlx1h0dc5.R.inc(14220);throw new Error(e);
            }
        }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

        public boolean isEnabled() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14221);
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14222);return enabled;
        }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

        public void setEnabled(boolean enabled) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14223);
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14224);this.enabled = enabled;
        }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

        public CvPipeline getPipeline() {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14225);
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14226);return pipeline;
        }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}

        public void setPipeline(CvPipeline pipeline) {try{__CLR4_5_2awqawqlx1h0dc5.R.inc(14227);
            __CLR4_5_2awqawqlx1h0dc5.R.inc(14228);this.pipeline = pipeline;
        }finally{__CLR4_5_2awqawqlx1h0dc5.R.flushNeeded();}}
    }
}
