/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference;

import java.util.ArrayList;

import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.wizards.ReferenceNozzleConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.NozzleTip;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.base.AbstractNozzle;
import org.openpnp.spi.base.SimplePropertySheetHolder;
import org.openpnp.util.MovableUtils;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferenceNozzle extends AbstractNozzle implements ReferenceHeadMountable {public static class __CLR4_5_27jv7jvlx1h74mw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,9932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ReferenceNozzle.class);

    @Element
    private Location headOffsets;

    @Attribute(required = false)
    private int pickDwellMilliseconds;

    @Attribute(required = false)
    private int placeDwellMilliseconds;

    @Attribute(required = false)
    private String currentNozzleTipId;

    @Attribute(required = false)
    private boolean changerEnabled = false;

    @Element(required = false)
    protected Length safeZ = new Length(0, LengthUnit.Millimeters);


    /**
     * If limitRotation is enabled the nozzle will reverse directions when commanded to rotate past
     * 180 degrees. So, 190 degrees becomes -170 and -190 becomes 170.
     */
    @Attribute(required = false)
    private boolean limitRotation = true;

    protected NozzleTip nozzleTip;

    protected ReferenceMachine machine;
    protected ReferenceDriver driver;

    public ReferenceNozzle() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9787);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9788);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9789);
                __CLR4_5_27jv7jvlx1h74mw.R.inc(9790);machine = (ReferenceMachine) configuration.getMachine();
                __CLR4_5_27jv7jvlx1h74mw.R.inc(9791);driver = machine.getDriver();
                __CLR4_5_27jv7jvlx1h74mw.R.inc(9792);nozzleTip = nozzleTips.get(currentNozzleTipId);
            }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}
        });
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public boolean isLimitRotation() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9793);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9794);return limitRotation;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public void setLimitRotation(boolean limitRotation) {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9795);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9796);this.limitRotation = limitRotation;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public int getPickDwellMilliseconds() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9797);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9798);return pickDwellMilliseconds;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public void setPickDwellMilliseconds(int pickDwellMilliseconds) {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9799);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9800);this.pickDwellMilliseconds = pickDwellMilliseconds;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public int getPlaceDwellMilliseconds() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9801);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9802);return placeDwellMilliseconds;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public void setPlaceDwellMilliseconds(int placeDwellMilliseconds) {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9803);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9804);this.placeDwellMilliseconds = placeDwellMilliseconds;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public Location getHeadOffsets() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9805);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9806);return headOffsets;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void setHeadOffsets(Location headOffsets) {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9807);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9808);this.headOffsets = headOffsets;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public NozzleTip getNozzleTip() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9809);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9810);return nozzleTip;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void pick(Part part) throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9811);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9812);logger.debug("{}.pick()", getName());
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9813);if ((((part == null)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9814)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9815)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9816);throw new Exception("Can't pick null part");
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9817);if ((((nozzleTip == null)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9818)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9819)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9820);throw new Exception("Can't pick, no nozzle tip loaded");
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9821);this.part = part;
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9822);driver.pick(this);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9823);machine.fireMachineHeadActivity(head);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9824);Thread.sleep(pickDwellMilliseconds);
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void place() throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9825);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9826);logger.debug("{}.place()", getName());
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9827);if ((((nozzleTip == null)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9828)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9829)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9830);throw new Exception("Can't place, no nozzle tip loaded");
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9831);driver.place(this);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9832);this.part = null;
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9833);machine.fireMachineHeadActivity(head);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9834);Thread.sleep(placeDwellMilliseconds);
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void moveTo(Location location, double speed) throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9835);
        // If there is a part on the nozzle we take the incoming speed value
        // to be a percentage of the part's speed instead of a percentage of
        // the max speed.
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9836);if ((((getPart() != null)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9837)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9838)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9839);speed = part.getSpeed() * speed;
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9840);logger.debug("{}.moveTo({}, {})", new Object[] {getName(), location, speed});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9841);if ((((limitRotation && !Double.isNaN(location.getRotation())
                && Math.abs(location.getRotation()) > 180)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9842)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9843)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9844);if ((((location.getRotation() < 0)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9845)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9846)==0&false))) {{
                __CLR4_5_27jv7jvlx1h74mw.R.inc(9847);location = location.derive(null, null, null, location.getRotation() + 360);
            }
            }else {{
                __CLR4_5_27jv7jvlx1h74mw.R.inc(9848);location = location.derive(null, null, null, location.getRotation() - 360);
            }
        }}
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9849);driver.moveTo(this, location, speed);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9850);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void moveToSafeZ(double speed) throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9851);
        // If there is a part on the nozzle we take the incoming speed value
        // to be a percentage of the part's speed instead of a percentage of
        // the max speed.
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9852);if ((((getPart() != null)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9853)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9854)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9855);speed = part.getSpeed() * speed;
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9856);logger.debug("{}.moveToSafeZ({})", new Object[] {getName(), speed});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9857);Length safeZ = this.safeZ.convertToUnits(getLocation().getUnits());
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9858);Location l = new Location(getLocation().getUnits(), Double.NaN, Double.NaN,
                safeZ.getValue(), Double.NaN);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9859);driver.moveTo(this, l, speed);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9860);machine.fireMachineHeadActivity(head);
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void loadNozzleTip(NozzleTip nozzleTip) throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9861);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9862);if ((((this.nozzleTip == nozzleTip)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9863)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9864)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9865);return;
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9866);if ((((!changerEnabled)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9867)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9868)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9869);throw new Exception("Can't load nozzle tip, nozzle tip changer is not enabled.");
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9870);unloadNozzleTip();
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9871);logger.debug("{}.loadNozzleTip({}): Start", new Object[] {getName(), nozzleTip.getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9872);ReferenceNozzleTip nt = (ReferenceNozzleTip) nozzleTip;
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9873);logger.debug("{}.loadNozzleTip({}): moveTo Start Location",
                new Object[] {getName(), nozzleTip.getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9874);MovableUtils.moveToLocationAtSafeZ(this, nt.getChangerStartLocation());
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9875);logger.debug("{}.loadNozzleTip({}): moveTo Mid Location",
                new Object[] {getName(), nozzleTip.getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9876);moveTo(nt.getChangerMidLocation(), 0.25);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9877);logger.debug("{}.loadNozzleTip({}): moveTo End Location",
                new Object[] {getName(), nozzleTip.getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9878);moveTo(nt.getChangerEndLocation(), 1.0);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9879);moveToSafeZ(1.0);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9880);logger.debug("{}.loadNozzleTip({}): Finished",
                new Object[] {getName(), nozzleTip.getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9881);this.nozzleTip = nozzleTip;
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9882);currentNozzleTipId = nozzleTip.getId();
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void unloadNozzleTip() throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9883);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9884);if ((((nozzleTip == null)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9885)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9886)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9887);return;
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9888);if ((((!changerEnabled)&&(__CLR4_5_27jv7jvlx1h74mw.R.iget(9889)!=0|true))||(__CLR4_5_27jv7jvlx1h74mw.R.iget(9890)==0&false))) {{
            __CLR4_5_27jv7jvlx1h74mw.R.inc(9891);throw new Exception("Can't unload nozzle tip, nozzle tip changer is not enabled.");
        }
        }__CLR4_5_27jv7jvlx1h74mw.R.inc(9892);logger.debug("{}.unloadNozzleTip(): Start", new Object[] {getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9893);ReferenceNozzleTip nt = (ReferenceNozzleTip) nozzleTip;
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9894);logger.debug("{}.unloadNozzleTip(): moveTo End Location", new Object[] {getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9895);MovableUtils.moveToLocationAtSafeZ(this, nt.getChangerEndLocation());
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9896);logger.debug("{}.unloadNozzleTip(): moveTo Mid Location", new Object[] {getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9897);moveTo(nt.getChangerMidLocation(), 1.0);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9898);logger.debug("{}.unloadNozzleTip(): moveTo Start Location", new Object[] {getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9899);moveTo(nt.getChangerStartLocation(), 0.25);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9900);moveToSafeZ(1.0);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9901);logger.debug("{}.unloadNozzleTip(): Finished", new Object[] {getName()});
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9902);nozzleTip = null;
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9903);currentNozzleTipId = null;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public Location getLocation() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9904);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9905);return driver.getLocation(this);
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public boolean isChangerEnabled() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9906);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9907);return changerEnabled;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public void setChangerEnabled(boolean changerEnabled) {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9908);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9909);this.changerEnabled = changerEnabled;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9910);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9911);return new ReferenceNozzleConfigurationWizard(this);
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9912);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9913);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9914);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9915);ArrayList<PropertySheetHolder> children = new ArrayList<>();
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9916);children.add(new SimplePropertySheetHolder("Nozzle Tips", getNozzleTips()));
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9917);return children.toArray(new PropertySheetHolder[] {});
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9918);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9919);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9920);
        // TODO Auto-generated method stub
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9921);return null;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9922);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9923);return getName();
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public Length getSafeZ() {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9924);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9925);return safeZ;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    public void setSafeZ(Length safeZ) {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9926);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9927);this.safeZ = safeZ;
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void moveTo(Location location) throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9928);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9929);moveTo(location, getHead().getMachine().getSpeed());
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}

    @Override
    public void moveToSafeZ() throws Exception {try{__CLR4_5_27jv7jvlx1h74mw.R.inc(9930);
        __CLR4_5_27jv7jvlx1h74mw.R.inc(9931);moveToSafeZ(getHead().getMachine().getSpeed());
    }finally{__CLR4_5_27jv7jvlx1h74mw.R.flushNeeded();}}
}
