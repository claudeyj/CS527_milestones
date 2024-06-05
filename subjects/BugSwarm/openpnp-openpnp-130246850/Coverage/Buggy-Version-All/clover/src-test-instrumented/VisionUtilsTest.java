/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.Icon;

import org.junit.Assert;
import org.junit.Test;
import org.openpnp.CameraListener;
import org.openpnp.gui.support.Wizard;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.VisionProvider;
import org.openpnp.util.VisionUtils;


public class VisionUtilsTest {static class __CLR4_5_2iktiktlx1h3ecd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570440782L,8589935092L,24139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testOffsets() {__CLR4_5_2iktiktlx1h3ecd.R.globalSliceStart(getClass().getName(),24077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vnk8npikt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iktiktlx1h3ecd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iktiktlx1h3ecd.R.globalSliceEnd(getClass().getName(),"VisionUtilsTest.testOffsets",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vnk8npikt(){try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24077);
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24078);Camera camera = new TestCamera();
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24079);Location location = camera.getLocation();
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24080);Assert.assertEquals(location, new Location(LengthUnit.Millimeters, 0, 0, 0, 0));
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24081);Assert.assertEquals(camera.getWidth(), 640);
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24082);Assert.assertEquals(camera.getHeight(), 480);
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24083);Location pixelOffsets = VisionUtils.getPixelCenterOffsets(camera, 100, 100);
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24084);Assert.assertEquals(pixelOffsets, new Location(LengthUnit.Millimeters, -220, 140, 0, 0));
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24085);Location pixelLocation = VisionUtils.getPixelLocation(camera, 100, 100);
        __CLR4_5_2iktiktlx1h3ecd.R.inc(24086);Assert.assertEquals(pixelLocation, new Location(LengthUnit.Millimeters, -220, 140, 0, 0));
    }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

    static class TestCamera implements Camera {
        protected Head head;

        @Override
        public String getId() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24087);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24088);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Head getHead() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24089);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24090);return head;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void setHead(Head head) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24091);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24092);this.head = head;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void moveTo(Location location, double speed) throws Exception {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24093);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void moveToSafeZ(double speed) throws Exception {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24094);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Location getLocation() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24095);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24096);return new Location(LengthUnit.Millimeters, 0, 0, 0, 0);
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Wizard getConfigurationWizard() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24097);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24098);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public String getPropertySheetHolderTitle() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24099);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24100);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24101);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24102);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public PropertySheet[] getPropertySheets() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24103);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24104);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24105);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24106);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public String getName() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24107);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24108);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void setName(String name) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24109);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Looking getLooking() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24110);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24111);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void setLooking(Looking looking) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24112);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Location getUnitsPerPixel() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24113);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24114);return new Location(LengthUnit.Millimeters, 1, 1, 0, 0);
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void setUnitsPerPixel(Location unitsPerPixel) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24115);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public BufferedImage capture() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24116);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24117);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void startContinuousCapture(CameraListener listener, int maximumFps) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24118);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void stopContinuousCapture(CameraListener listener) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24119);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void setVisionProvider(VisionProvider visionProvider) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24120);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public VisionProvider getVisionProvider() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24121);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24122);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public int getWidth() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24123);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24124);return 640;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public int getHeight() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24125);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24126);return 480;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24127);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24128);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void close() throws IOException {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24129);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public BufferedImage settleAndCapture() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24130);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24131);return null;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public long getSettleTimeMs() {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24132);
            // TODO Auto-generated method stub
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24133);return 0;
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void setSettleTimeMs(long settleTimeMs) {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24134);
            // TODO Auto-generated method stub

        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void moveTo(Location location) throws Exception {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24135);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24136);moveTo(location, getHead().getMachine().getSpeed());
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}

        @Override
        public void moveToSafeZ() throws Exception {try{__CLR4_5_2iktiktlx1h3ecd.R.inc(24137);
            __CLR4_5_2iktiktlx1h3ecd.R.inc(24138);moveToSafeZ(getHead().getMachine().getSpeed());
        }finally{__CLR4_5_2iktiktlx1h3ecd.R.flushNeeded();}}
    }
}
