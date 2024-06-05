/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi.base;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.Icon;

import org.openpnp.CameraListener;
import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.Icons;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.VisionProvider;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public abstract class AbstractCamera implements Camera {public static class __CLR4_5_2ec6ec6lx1h0ez7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,18662,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    protected String id;

    @Attribute(required = false)
    protected String name;

    @Attribute
    protected Looking looking = Looking.Down;

    @Element
    protected Location unitsPerPixel = new Location(LengthUnit.Millimeters);

    @Element(required = false)
    protected VisionProvider visionProvider;

    @Attribute(required = false)
    protected long settleTimeMs = 250;

    protected Set<ListenerEntry> listeners = Collections.synchronizedSet(new HashSet<>());

    protected Head head;

    protected Integer width;

    protected Integer height;

    public AbstractCamera() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18582);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18583);this.id = Configuration.createId();
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18584);this.name = getClass().getSimpleName();
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18585);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18586);
                __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18587);if ((((visionProvider != null)&&(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18588)!=0|true))||(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18589)==0&false))) {{
                    __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18590);visionProvider.setCamera(AbstractCamera.this);
                }
            }}finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public String getId() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18591);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18592);return id;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18593);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18594);return name;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void setName(String name) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18595);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18596);this.name = name;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public Head getHead() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18597);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18598);return head;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void setHead(Head head) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18599);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18600);this.head = head;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public Location getUnitsPerPixel() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18601);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18602);return unitsPerPixel;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void setUnitsPerPixel(Location unitsPerPixel) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18603);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18604);this.unitsPerPixel = unitsPerPixel;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void setLooking(Looking looking) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18605);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18606);this.looking = looking;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public Looking getLooking() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18607);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18608);return looking;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void startContinuousCapture(CameraListener listener, int maximumFps) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18609);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18610);listeners.add(new ListenerEntry(listener, maximumFps));
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void stopContinuousCapture(CameraListener listener) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18611);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18612);listeners.remove(new ListenerEntry(listener, 0));
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void setVisionProvider(VisionProvider visionProvider) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18613);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18614);this.visionProvider = visionProvider;
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18615);visionProvider.setCamera(this);
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public VisionProvider getVisionProvider() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18616);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18617);return visionProvider;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    public BufferedImage settleAndCapture() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18618);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18619);try {
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18620);Thread.sleep(getSettleTimeMs());
        }
        catch (Exception e) {

        }
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18621);return capture();
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    protected void broadcastCapture(BufferedImage img) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18622);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18623);for (ListenerEntry listener : new ArrayList<>(listeners)) {{
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18624);if ((((listener.lastFrameSent < (System.currentTimeMillis()
                    - (1000 / listener.maximumFps)))&&(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18625)!=0|true))||(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18626)==0&false))) {{
                __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18627);listener.listener.frameReceived(img);
                __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18628);listener.lastFrameSent = System.currentTimeMillis();
            }
        }}
    }}finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public int getWidth() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18629);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18630);if ((((width == null)&&(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18631)!=0|true))||(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18632)==0&false))) {{
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18633);BufferedImage image = capture();
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18634);width = image.getWidth();
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18635);height = image.getHeight();
        }
        }__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18636);return width;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public int getHeight() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18637);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18638);if ((((width == null)&&(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18639)!=0|true))||(__CLR4_5_2ec6ec6lx1h0ez7.R.iget(18640)==0&false))) {{
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18641);BufferedImage image = capture();
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18642);width = image.getWidth();
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18643);height = image.getHeight();
        }
        }__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18644);return height;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    public long getSettleTimeMs() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18645);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18646);return settleTimeMs;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    public void setSettleTimeMs(long settleTimeMs) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18647);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18648);this.settleTimeMs = settleTimeMs;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18649);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18650);return Icons.captureCamera;
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}
    
    @Override
    public void moveTo(Location location) throws Exception {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18651);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18652);moveTo(location, getHead().getMachine().getSpeed());
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

    @Override
    public void moveToSafeZ() throws Exception {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18653);
        __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18654);moveToSafeZ(getHead().getMachine().getSpeed());
    }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}
    
    protected class ListenerEntry {
        public CameraListener listener;
        public int maximumFps;
        public long lastFrameSent;

        public ListenerEntry(CameraListener listener, int maximumFps) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18655);
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18656);this.listener = listener;
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18657);this.maximumFps = maximumFps;
        }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18658);
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18659);return listener.hashCode();
        }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_5_2ec6ec6lx1h0ez7.R.inc(18660);
            __CLR4_5_2ec6ec6lx1h0ez7.R.inc(18661);return obj.equals(listener);
        }finally{__CLR4_5_2ec6ec6lx1h0ez7.R.flushNeeded();}}
    }
}
