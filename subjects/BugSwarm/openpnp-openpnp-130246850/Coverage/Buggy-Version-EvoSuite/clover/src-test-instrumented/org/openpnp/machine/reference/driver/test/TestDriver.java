/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.driver.test;

import java.io.IOException;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceDriver;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.machine.reference.ReferencePasteDispenser;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDriver implements ReferenceDriver {static class __CLR4_5_2imjimjlx1h0hwt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570305446L,8589935092L,24218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(TestDriver.class);

    @Attribute(required = false)
    private String dummy;

    private Location location = new Location(LengthUnit.Millimeters, 0, 0, 0, 0);

    private ReferenceDriver delegate = new TestDriverDelegate();

    public void setDelegate(ReferenceDriver delegate) {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24139);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24140);this.delegate = delegate;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24141);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24142);return null;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24143);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24144);logger.debug("home()");
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24145);location = new Location(LengthUnit.Millimeters, 0, 0, 0, 0);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24146);delegate.home(head);
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24147);
        // Subtract the offsets from the incoming Location. This converts the
        // offset coordinates to driver / absolute coordinates.
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24148);location = location.subtract(hm.getHeadOffsets());

        // Convert the Location to millimeters, since that's the unit that
        // this driver works in natively.
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24149);location = location.convertToUnits(LengthUnit.Millimeters);

        // Get the current location of the Head that we'll move
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24150);Location hl = this.location;

        __CLR4_5_2imjimjlx1h0hwt.R.inc(24151);hl = hl.derive((((Double.isNaN(location.getX()) )&&(__CLR4_5_2imjimjlx1h0hwt.R.iget(24152)!=0|true))||(__CLR4_5_2imjimjlx1h0hwt.R.iget(24153)==0&false))? null : location.getX(),
                (((Double.isNaN(location.getY()) )&&(__CLR4_5_2imjimjlx1h0hwt.R.iget(24154)!=0|true))||(__CLR4_5_2imjimjlx1h0hwt.R.iget(24155)==0&false))? null : location.getY(),
                (((Double.isNaN(location.getZ()) )&&(__CLR4_5_2imjimjlx1h0hwt.R.iget(24156)!=0|true))||(__CLR4_5_2imjimjlx1h0hwt.R.iget(24157)==0&false))? null : location.getZ(),
                (((Double.isNaN(location.getRotation()) )&&(__CLR4_5_2imjimjlx1h0hwt.R.iget(24158)!=0|true))||(__CLR4_5_2imjimjlx1h0hwt.R.iget(24159)==0&false))? null : location.getRotation());

        __CLR4_5_2imjimjlx1h0hwt.R.inc(24160);if ((((!this.location.equals(hl))&&(__CLR4_5_2imjimjlx1h0hwt.R.iget(24161)!=0|true))||(__CLR4_5_2imjimjlx1h0hwt.R.iget(24162)==0&false))) {{
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24163);this.location = hl;

            __CLR4_5_2imjimjlx1h0hwt.R.inc(24164);logger.debug("moveTo({}, {}, {})", new Object[] {hm, this.location, speed});

            __CLR4_5_2imjimjlx1h0hwt.R.inc(24165);delegate.moveTo(hm, this.location, speed);
        }
    }}finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24166);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24167);return location;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24168);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24169);logger.debug("pick({} {})", nozzle, nozzle.getNozzleTip());
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24170);delegate.pick(nozzle);
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24171);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24172);logger.debug("place({} {})", nozzle, nozzle.getNozzleTip());
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24173);delegate.place(nozzle);
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24174);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24175);logger.debug("actuate({}, {})", actuator, on);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24176);delegate.actuate(actuator, on);
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24177);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24178);logger.debug("actuate({}, {})", actuator, value);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24179);delegate.actuate(actuator, value);
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void dispense(ReferencePasteDispenser dispenser, Location startLocation,
            Location endLocation, long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24180);}finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24181);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24182);logger.debug("setEnabled({})", enabled);
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24183);delegate.setEnabled(enabled);
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    public static class TestDriverDelegate implements ReferenceDriver {

        @Override
        public Wizard getConfigurationWizard() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24184);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24185);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void home(ReferenceHead head) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24186);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
                throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24187);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24188);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24189);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24190);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24191);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24192);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24193);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void dispense(ReferencePasteDispenser dispenser, Location startLocation,
                Location endLocation, long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24194);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24195);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public String getPropertySheetHolderTitle() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24196);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24197);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24198);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24199);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public PropertySheet[] getPropertySheets() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24200);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24201);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24202);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24203);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24204);
            // TODO Auto-generated method stub
            __CLR4_5_2imjimjlx1h0hwt.R.inc(24205);return null;
        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

        @Override
        public void close() throws IOException {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24206);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}
    }

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24207);
        // TODO Auto-generated method stub
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24208);return null;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24209);
        // TODO Auto-generated method stub
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24210);return null;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24211);
        // TODO Auto-generated method stub
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24212);return null;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24213);
        // TODO Auto-generated method stub
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24214);return null;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24215);
        // TODO Auto-generated method stub
        __CLR4_5_2imjimjlx1h0hwt.R.inc(24216);return null;
    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_2imjimjlx1h0hwt.R.inc(24217);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_2imjimjlx1h0hwt.R.flushNeeded();}}
}
