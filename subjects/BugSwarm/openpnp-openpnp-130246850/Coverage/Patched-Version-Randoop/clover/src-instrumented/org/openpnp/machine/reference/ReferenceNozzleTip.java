/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.AbstractAction;
import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.wizards.ReferenceNozzleTipConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.NozzleTip;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.base.AbstractNozzleTip;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.OpenCvUtils;
import org.openpnp.util.UiUtils;
import org.openpnp.util.VisionUtils;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage.Result;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferenceNozzleTip extends AbstractNozzleTip {public static class __CLR4_5_27nw7nwlx1h74o9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,10093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ReferenceNozzleTip.class);

    @ElementList(required = false, entry = "id")
    private Set<String> compatiblePackageIds = new HashSet<>();

    @Attribute(required = false)
    private boolean allowIncompatiblePackages;

    @Element(required = false)
    private Location changerStartLocation = new Location(LengthUnit.Millimeters);
    @Element(required = false)
    private Location changerMidLocation = new Location(LengthUnit.Millimeters);
    @Element(required = false)
    private Location changerEndLocation = new Location(LengthUnit.Millimeters);
    @Element(required = false)
    private Calibration calibration = new Calibration();

    private Set<org.openpnp.model.Package> compatiblePackages = new HashSet<>();

    public ReferenceNozzleTip() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9932);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9933);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9934);
                __CLR4_5_27nw7nwlx1h74o9.R.inc(9935);for (String id : compatiblePackageIds) {{
                    __CLR4_5_27nw7nwlx1h74o9.R.inc(9936);org.openpnp.model.Package pkg = configuration.getPackage(id);
                    __CLR4_5_27nw7nwlx1h74o9.R.inc(9937);if ((((pkg == null)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(9938)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(9939)==0&false))) {{
                        __CLR4_5_27nw7nwlx1h74o9.R.inc(9940);continue;
                    }
                    }__CLR4_5_27nw7nwlx1h74o9.R.inc(9941);compatiblePackages.add(pkg);
                }
            }}finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}
        });
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public boolean canHandle(Part part) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9942);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9943);boolean result =
                allowIncompatiblePackages || compatiblePackages.contains(part.getPackage());
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9944);logger.debug("{}.canHandle({}) => {}", new Object[] {getName(), part.getId(), result});
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9945);return result;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public Set<org.openpnp.model.Package> getCompatiblePackages() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9946);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9947);return new HashSet<>(compatiblePackages);
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public void setCompatiblePackages(Set<org.openpnp.model.Package> compatiblePackages) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9948);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9949);this.compatiblePackages.clear();
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9950);this.compatiblePackages.addAll(compatiblePackages);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9951);compatiblePackageIds.clear();
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9952);for (org.openpnp.model.Package pkg : compatiblePackages) {{
            __CLR4_5_27nw7nwlx1h74o9.R.inc(9953);compatiblePackageIds.add(pkg.getId());
        }
    }}finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9954);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9955);return getName();
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9956);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9957);return new ReferenceNozzleTipConfigurationWizard(this);
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9958);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9959);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9960);
        // TODO Auto-generated method stub
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9961);return null;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9962);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9963);return new Action[] {unloadAction, loadAction};
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9964);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9965);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public boolean isAllowIncompatiblePackages() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9966);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9967);return allowIncompatiblePackages;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public void setAllowIncompatiblePackages(boolean allowIncompatiblePackages) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9968);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9969);this.allowIncompatiblePackages = allowIncompatiblePackages;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public Location getChangerStartLocation() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9970);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9971);return changerStartLocation;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public void setChangerStartLocation(Location changerStartLocation) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9972);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9973);this.changerStartLocation = changerStartLocation;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public Location getChangerMidLocation() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9974);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9975);return changerMidLocation;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public void setChangerMidLocation(Location changerMidLocation) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9976);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9977);this.changerMidLocation = changerMidLocation;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public Location getChangerEndLocation() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9978);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9979);return changerEndLocation;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public void setChangerEndLocation(Location changerEndLocation) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9980);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9981);this.changerEndLocation = changerEndLocation;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    private Nozzle getParentNozzle() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9982);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9983);for (Head head : Configuration.get().getMachine().getHeads()) {{
            __CLR4_5_27nw7nwlx1h74o9.R.inc(9984);for (Nozzle nozzle : head.getNozzles()) {{
                __CLR4_5_27nw7nwlx1h74o9.R.inc(9985);for (NozzleTip nozzleTip : nozzle.getNozzleTips()) {{
                    __CLR4_5_27nw7nwlx1h74o9.R.inc(9986);if ((((nozzleTip == this)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(9987)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(9988)==0&false))) {{
                        __CLR4_5_27nw7nwlx1h74o9.R.inc(9989);return nozzle;
                    }
                }}
            }}
        }}
        }__CLR4_5_27nw7nwlx1h74o9.R.inc(9990);return null;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public Calibration getCalibration() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9991);
        __CLR4_5_27nw7nwlx1h74o9.R.inc(9992);return calibration;
    }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

    public Action loadAction = new AbstractAction("Load") {
        {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9993);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(9994);putValue(SMALL_ICON, Icons.load);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(9995);putValue(NAME, "Load");
            __CLR4_5_27nw7nwlx1h74o9.R.inc(9996);putValue(SHORT_DESCRIPTION, "Load the currently selected nozzle tip.");
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        @Override
        public void actionPerformed(final ActionEvent arg0) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(9997);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(9998);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_27nw7nwlx1h74o9.R.inc(9999);getParentNozzle().loadNozzleTip(ReferenceNozzleTip.this);
            });
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}
    };

    public Action unloadAction = new AbstractAction("Unoad") {
        {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10000);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10001);putValue(SMALL_ICON, Icons.unload);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10002);putValue(NAME, "Unload");
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10003);putValue(SHORT_DESCRIPTION, "Unoad the currently loaded nozzle tip.");
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        @Override
        public void actionPerformed(final ActionEvent arg0) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10004);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10005);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10006);getParentNozzle().unloadNozzleTip();
            });
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}
    };

    @Root
    public static class Calibration {
        public static class CalibrationOffset {
            final Location offset;
            final double angle;

            public CalibrationOffset(Location offset, double angle) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10007);
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10008);this.offset = offset;
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10009);this.angle = angle;
            }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10010);
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10011);return angle + " " + offset;
            }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}
        }

        @Element(required = false)
        private CvPipeline calibrationPipeline = new CvPipeline();

        @Attribute(required = false)
        double angleIncrement = 30;

        List<CalibrationOffset> offsets;

        public void calibrate(ReferenceNozzleTip nozzleTip) throws Exception {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10012);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10013);this.offsets = null;

            __CLR4_5_27nw7nwlx1h74o9.R.inc(10014);Nozzle nozzle = nozzleTip.getParentNozzle();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10015);Camera camera = VisionUtils.getBottomVisionCamera();

            // Move to the camera with an angle of 0.
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10016);Location location = camera.getLocation();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10017);location = location.derive(null, null, null, 0d);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10018);MovableUtils.moveToLocationAtSafeZ(nozzle, location);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10019);for (int i = 0; (((i < 3)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10020)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10021)==0&false)); i++) {{
                // Locate the nozzle offsets.
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10022);Location offset = findCircle();

                // Subtract the offsets and move to that position to center the nozzle.
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10023);location = location.subtract(offset);
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10024);nozzle.moveTo(location);
            }
            // This is our baseline location and should have the nozzle well centered over the
            // camera.
            }__CLR4_5_27nw7nwlx1h74o9.R.inc(10025);Location startLocation = location;

            // Now we rotate the nozzle 360 degrees at calibration.angleIncrement steps, find the
            // nozzle using the camera and record the offsets.
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10026);List<CalibrationOffset> offsets = new ArrayList<>();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10027);for (double i = 0; (((i < 360)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10028)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10029)==0&false)); i += angleIncrement) {{
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10030);location = startLocation.derive(null, null, null, i);
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10031);nozzle.moveTo(location);
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10032);Location offset = findCircle();
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10033);offsets.add(new CalibrationOffset(offset, i));
            }

            // The nozzle tip is now calibrated and calibration.getCalibratedLocation() can be
            // used.
            }__CLR4_5_27nw7nwlx1h74o9.R.inc(10034);this.offsets = offsets;

            // TESTS
            // for (double i = 0; i <= 360; i += 15) {
            // nozzle.moveTo(
            // startLocation.add(new Location(LengthUnit.Millimeters, 10, 10, 0, 0)));
            // nozzle.moveTo(startLocation.derive(null, null, null, i));
            // Thread.sleep(1000);
            //
            // nozzle.moveTo(
            // startLocation.add(new Location(LengthUnit.Millimeters, 10, 10, 0, 0)));
            // nozzle.moveTo(getCalibratedLocation(startLocation.derive(null, null, null, i)));
            // Thread.sleep(1000);
            // }
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        public Location findCircle() throws Exception {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10035);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10036);Camera camera = VisionUtils.getBottomVisionCamera();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10037);calibrationPipeline.setCamera(camera);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10038);calibrationPipeline.process();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10039);List<Result.Circle> circles =
                    (List<Result.Circle>) calibrationPipeline.getResult("result").model;
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10040);List<Location> locations = circles.stream().map(circle -> {
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10041);return VisionUtils.getPixelCenterOffsets(camera, circle.x, circle.y);
            }).sorted((a, b) -> {
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10042);double a1 = a.getLinearDistanceTo(new Location(LengthUnit.Millimeters, 0, 0, 0, 0));
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10043);double b1 = b.getLinearDistanceTo(new Location(LengthUnit.Millimeters, 0, 0, 0, 0));
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10044);return Double.compare(a1, b1);
            }).collect(Collectors.toList());
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10045);Location location = locations.get(0);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10046);MainFrame.mainFrame.cameraPanel.getCameraView(camera).showFilteredImage(
                    OpenCvUtils.toBufferedImage(calibrationPipeline.getWorkingImage()), 250);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10047);return location;
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        /**
         * Find the two closest offsets to the angle being requested. The offsets start at angle 0
         * and go to angle 360 - angleIncrement in angleIncrement steps.
         */
        public List<CalibrationOffset> getOffsetPairForAngle(double angle) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10048);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10049);CalibrationOffset a = null, b = null;
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10050);if ((((angle >= offsets.get(offsets.size() - 1).angle)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10051)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10052)==0&false))) {{
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10053);return Arrays.asList(offsets.get(offsets.size() - 1), offsets.get(0));
            }
            }__CLR4_5_27nw7nwlx1h74o9.R.inc(10054);for (int i = 0; (((i < offsets.size())&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10055)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10056)==0&false)); i++) {{
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10057);if ((((angle < offsets.get(i + 1).angle)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10058)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10059)==0&false))) {{
                    __CLR4_5_27nw7nwlx1h74o9.R.inc(10060);a = offsets.get(i);
                    __CLR4_5_27nw7nwlx1h74o9.R.inc(10061);b = offsets.get(i + 1);
                    __CLR4_5_27nw7nwlx1h74o9.R.inc(10062);break;
                }
            }}
            }__CLR4_5_27nw7nwlx1h74o9.R.inc(10063);return Arrays.asList(a, b);
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        public Location getCalibratedLocation(Location location) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10064);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10065);double angle = location.getRotation();
            // Make sure the angle is between 0 and 360.
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10066);while ((((angle < 0)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10067)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10068)==0&false))) {{
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10069);angle += 360;
            }
            }__CLR4_5_27nw7nwlx1h74o9.R.inc(10070);while ((((angle > 360)&&(__CLR4_5_27nw7nwlx1h74o9.R.iget(10071)!=0|true))||(__CLR4_5_27nw7nwlx1h74o9.R.iget(10072)==0&false))) {{
                __CLR4_5_27nw7nwlx1h74o9.R.inc(10073);angle -= 360;
            }
            }__CLR4_5_27nw7nwlx1h74o9.R.inc(10074);List<CalibrationOffset> offsets = getOffsetPairForAngle(angle);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10075);CalibrationOffset a = offsets.get(0);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10076);CalibrationOffset b = offsets.get(1);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10077);Location offsetA = a.offset.convertToUnits(location.getUnits());
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10078);Location offsetB = b.offset.convertToUnits(location.getUnits());

            __CLR4_5_27nw7nwlx1h74o9.R.inc(10079);double ratio = (angle - a.angle) / (b.angle - a.angle);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10080);double deltaX = offsetB.getX() - offsetA.getX();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10081);double deltaY = offsetB.getY() - offsetA.getY();
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10082);double offsetX = offsetA.getX() + (deltaX * ratio);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10083);double offsetY = offsetA.getY() + (deltaY * ratio);

            __CLR4_5_27nw7nwlx1h74o9.R.inc(10084);location = location.subtract(new Location(location.getUnits(), offsetX, offsetY, 0, 0));
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10085);return location;
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        public boolean isCalibrated() {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10086);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10087);return offsets != null && !offsets.isEmpty();
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        public CvPipeline getCalibrationPipeline() throws Exception {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10088);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10089);calibrationPipeline.setCamera(VisionUtils.getBottomVisionCamera());
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10090);return calibrationPipeline;
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}

        public void setCalibrationPipeline(CvPipeline calibrationPipeline) {try{__CLR4_5_27nw7nwlx1h74o9.R.inc(10091);
            __CLR4_5_27nw7nwlx1h74o9.R.inc(10092);this.calibrationPipeline = calibrationPipeline;
        }finally{__CLR4_5_27nw7nwlx1h74o9.R.flushNeeded();}}
    }
}
