/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi.base;

import java.util.Collections;
import java.util.List;

import javax.swing.Icon;

import org.openpnp.model.Configuration;
import org.openpnp.spi.Actuator;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.Machine;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PasteDispenser;
import org.openpnp.util.IdentifiableList;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.core.Commit;

public abstract class AbstractHead implements Head {public static class __CLR4_5_2ef1ef1lx1h3bpy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,18768,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    protected String id;

    @Attribute(required = false)
    protected String name;

    @ElementList(required = false)
    protected IdentifiableList<Nozzle> nozzles = new IdentifiableList<>();

    @ElementList(required = false)
    protected IdentifiableList<Actuator> actuators = new IdentifiableList<>();

    @ElementList(required = false)
    protected IdentifiableList<Camera> cameras = new IdentifiableList<>();

    @ElementList(required = false)
    protected IdentifiableList<PasteDispenser> pasteDispensers = new IdentifiableList<>();

    protected Machine machine;

    public AbstractHead() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18685);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18686);this.id = Configuration.createId();
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18687);this.name = getClass().getSimpleName();
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18688);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18689);for (Nozzle nozzle : nozzles) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18690);nozzle.setHead(this);
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18691);for (Camera camera : cameras) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18692);camera.setHead(this);
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18693);for (Actuator actuator : actuators) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18694);actuator.setHead(this);
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18695);for (PasteDispenser pasteDispenser : pasteDispensers) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18696);pasteDispenser.setHead(this);
        }
    }}finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public String getId() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18697);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18698);return id;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public List<Nozzle> getNozzles() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18699);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18700);return Collections.unmodifiableList(nozzles);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Nozzle getNozzle(String id) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18701);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18702);return nozzles.get(id);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public List<Actuator> getActuators() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18703);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18704);return Collections.unmodifiableList(actuators);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Actuator getActuator(String id) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18705);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18706);return actuators.get(id);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Actuator getActuatorByName(String name) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18707);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18708);for (Actuator actuator : actuators) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18709);if ((((actuator.getName().equals(name))&&(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18710)!=0|true))||(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18711)==0&false))) {{
                __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18712);return actuator;
            }
        }}
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18713);return null;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public List<Camera> getCameras() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18714);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18715);return Collections.unmodifiableList(cameras);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Camera getCamera(String id) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18716);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18717);return cameras.get(id);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public void addCamera(Camera camera) throws Exception {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18718);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18719);cameras.add(camera);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public void removeCamera(Camera camera) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18720);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18721);cameras.remove(camera);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public void moveToSafeZ(double speed) throws Exception {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18722);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18723);for (Nozzle nozzle : nozzles) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18724);nozzle.moveToSafeZ(speed);
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18725);for (Camera camera : cameras) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18726);camera.moveToSafeZ(speed);
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18727);for (Actuator actuator : actuators) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18728);actuator.moveToSafeZ(speed);
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18729);for (PasteDispenser dispenser : pasteDispensers) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18730);dispenser.moveToSafeZ(speed);
        }
    }}finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18731);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18732);return name;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public void setName(String name) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18733);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18734);this.name = name;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public List<PasteDispenser> getPasteDispensers() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18735);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18736);return Collections.unmodifiableList(pasteDispensers);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public PasteDispenser getPasteDispenser(String id) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18737);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18738);return pasteDispensers.get(id);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18739);
        // TODO Auto-generated method stub
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18740);return null;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Camera getDefaultCamera() throws Exception {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18741);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18742);List<Camera> cameras = getCameras();
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18743);if ((((cameras == null || cameras.isEmpty())&&(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18744)!=0|true))||(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18745)==0&false))) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18746);throw new Exception("No default camera available on head " + getName());
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18747);return cameras.get(0);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Nozzle getDefaultNozzle() throws Exception {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18748);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18749);List<Nozzle> nozzles = getNozzles();
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18750);if ((((nozzles == null || nozzles.isEmpty())&&(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18751)!=0|true))||(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18752)==0&false))) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18753);throw new Exception("No default nozzle available on head " + getName());
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18754);return nozzles.get(0);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public PasteDispenser getDefaultPasteDispenser() throws Exception {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18755);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18756);List<PasteDispenser> dispensers = getPasteDispensers();
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18757);if ((((dispensers == null || dispensers.isEmpty())&&(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18758)!=0|true))||(__CLR4_5_2ef1ef1lx1h3bpy.R.iget(18759)==0&false))) {{
            __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18760);throw new Exception("No default paste dispenser available on head " + getName());
        }
        }__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18761);return dispensers.get(0);
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public Machine getMachine() {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18762);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18763);return machine;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public void setMachine(Machine machine) {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18764);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18765);this.machine = machine;
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}

    @Override
    public void moveToSafeZ() throws Exception {try{__CLR4_5_2ef1ef1lx1h3bpy.R.inc(18766);
        __CLR4_5_2ef1ef1lx1h3bpy.R.inc(18767);moveToSafeZ(getMachine().getSpeed());
    }finally{__CLR4_5_2ef1ef1lx1h3bpy.R.flushNeeded();}}
}
