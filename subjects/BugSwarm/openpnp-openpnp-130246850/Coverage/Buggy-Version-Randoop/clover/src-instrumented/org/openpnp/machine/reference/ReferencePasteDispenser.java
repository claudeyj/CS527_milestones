/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference;

import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.wizards.ReferencePasteDispenserConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.base.AbstractPasteDispenser;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferencePasteDispenser extends AbstractPasteDispenser
        implements ReferenceHeadMountable {public static class __CLR4_5_27sd7sdlx1h1ung{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,10139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ReferencePasteDispenser.class);

    @Element
    private Location headOffsets;

    @Element(required = false)
    protected Length safeZ = new Length(0, LengthUnit.Millimeters);

    protected ReferenceMachine machine;
    protected ReferenceDriver driver;

    public ReferencePasteDispenser() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10093);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10094);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10095);
                __CLR4_5_27sd7sdlx1h1ung.R.inc(10096);machine = (ReferenceMachine) configuration.getMachine();
                __CLR4_5_27sd7sdlx1h1ung.R.inc(10097);driver = machine.getDriver();
            }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}
        });
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public Location getHeadOffsets() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10098);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10099);return headOffsets;
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public void setHeadOffsets(Location headOffsets) {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10100);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10101);this.headOffsets = headOffsets;
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public void dispense(Location startLocation, Location endLocation,
            long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10102);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10103);logger.debug("{}.dispense()", getName());
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10104);Thread.sleep(dispenseTimeMilliseconds);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10105);driver.dispense(this, startLocation, endLocation, dispenseTimeMilliseconds);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10106);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public void moveTo(Location location, double speed) throws Exception {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10107);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10108);logger.debug("{}.moveTo({}, {})", new Object[] {getName(), location, speed});
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10109);driver.moveTo(this, location, speed);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10110);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public void moveToSafeZ(double speed) throws Exception {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10111);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10112);logger.debug("{}.moveToSafeZ({})", new Object[] {getName(), speed});
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10113);Length safeZ = this.safeZ.convertToUnits(getLocation().getUnits());
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10114);Location l = new Location(getLocation().getUnits(), Double.NaN, Double.NaN,
                safeZ.getValue(), Double.NaN);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10115);driver.moveTo(this, l, speed);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10116);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public Location getLocation() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10117);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10118);return driver.getLocation(this);
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10119);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10120);return new ReferencePasteDispenserConfigurationWizard(this);
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10121);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10122);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10123);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10124);return null;
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10125);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10126);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10127);
        // TODO Auto-generated method stub
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10128);return null;
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10129);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10130);return getName();
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    public Length getSafeZ() {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10131);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10132);return safeZ;
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    public void setSafeZ(Length safeZ) {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10133);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10134);this.safeZ = safeZ;
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public void moveTo(Location location) throws Exception {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10135);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10136);moveTo(location, getHead().getMachine().getSpeed());
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}

    @Override
    public void moveToSafeZ() throws Exception {try{__CLR4_5_27sd7sdlx1h1ung.R.inc(10137);
        __CLR4_5_27sd7sdlx1h1ung.R.inc(10138);moveToSafeZ(getHead().getMachine().getSpeed());
    }finally{__CLR4_5_27sd7sdlx1h1ung.R.flushNeeded();}}
}
