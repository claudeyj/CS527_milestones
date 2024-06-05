/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is part of OpenPnP.
 * 
 * OpenPnP is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenPnP is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with OpenPnP. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.machine.reference.camera;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeSupport;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Action;

import org.openpnp.CameraListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.machine.reference.camera.wizards.ImageCameraConfigurationWizard;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Commit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageCamera extends ReferenceCamera implements Runnable {public static class __CLR4_5_27v17v1lx1h3755{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,10266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ImageCamera.class);

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    @Attribute(required = false)
    private int fps = 24;

    @Element
    private String sourceUri = "classpath://samples/pnp-test/pnp-test.png";

    @Attribute(required = false)
    private int width = 640;

    @Attribute(required = false)
    private int height = 480;

    private BufferedImage source;

    private Thread thread;

    public ImageCamera() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10189);
        __CLR4_5_27v17v1lx1h3755.R.inc(10190);unitsPerPixel = new Location(LengthUnit.Inches, 0.04233, 0.04233, 0, 0);
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() throws Exception {try{__CLR4_5_27v17v1lx1h3755.R.inc(10191);
        __CLR4_5_27v17v1lx1h3755.R.inc(10192);setSourceUri(sourceUri);
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public synchronized void startContinuousCapture(CameraListener listener, int maximumFps) {try{__CLR4_5_27v17v1lx1h3755.R.inc(10193);
        __CLR4_5_27v17v1lx1h3755.R.inc(10194);start();
        __CLR4_5_27v17v1lx1h3755.R.inc(10195);super.startContinuousCapture(listener, maximumFps);
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public synchronized void stopContinuousCapture(CameraListener listener) {try{__CLR4_5_27v17v1lx1h3755.R.inc(10196);
        __CLR4_5_27v17v1lx1h3755.R.inc(10197);super.stopContinuousCapture(listener);
        __CLR4_5_27v17v1lx1h3755.R.inc(10198);if ((((listeners.size() == 0)&&(__CLR4_5_27v17v1lx1h3755.R.iget(10199)!=0|true))||(__CLR4_5_27v17v1lx1h3755.R.iget(10200)==0&false))) {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10201);stop();
        }
    }}finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    private synchronized void stop() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10202);
        __CLR4_5_27v17v1lx1h3755.R.inc(10203);if ((((thread != null && thread.isAlive())&&(__CLR4_5_27v17v1lx1h3755.R.iget(10204)!=0|true))||(__CLR4_5_27v17v1lx1h3755.R.iget(10205)==0&false))) {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10206);thread.interrupt();
            __CLR4_5_27v17v1lx1h3755.R.inc(10207);try {
                __CLR4_5_27v17v1lx1h3755.R.inc(10208);thread.join();
            }
            catch (Exception e) {

            }
            __CLR4_5_27v17v1lx1h3755.R.inc(10209);thread = null;
        }
    }}finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    private synchronized void start() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10210);
        __CLR4_5_27v17v1lx1h3755.R.inc(10211);if ((((thread == null)&&(__CLR4_5_27v17v1lx1h3755.R.iget(10212)!=0|true))||(__CLR4_5_27v17v1lx1h3755.R.iget(10213)==0&false))) {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10214);thread = new Thread(this);
            __CLR4_5_27v17v1lx1h3755.R.inc(10215);thread.start();
        }
    }}finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    public String getSourceUri() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10216);
        __CLR4_5_27v17v1lx1h3755.R.inc(10217);return sourceUri;
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    public void setSourceUri(String sourceUri) throws Exception {try{__CLR4_5_27v17v1lx1h3755.R.inc(10218);
        __CLR4_5_27v17v1lx1h3755.R.inc(10219);String oldValue = this.sourceUri;
        __CLR4_5_27v17v1lx1h3755.R.inc(10220);this.sourceUri = sourceUri;
        __CLR4_5_27v17v1lx1h3755.R.inc(10221);pcs.firePropertyChange("sourceUri", oldValue, sourceUri);
        __CLR4_5_27v17v1lx1h3755.R.inc(10222);initialize();
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public synchronized BufferedImage capture() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10223);
        /*
         * Create a buffer that we will render the center tile and it's surrounding tiles to.
         */
        __CLR4_5_27v17v1lx1h3755.R.inc(10224);BufferedImage frame = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        __CLR4_5_27v17v1lx1h3755.R.inc(10225);Graphics gFrame = frame.getGraphics();

        __CLR4_5_27v17v1lx1h3755.R.inc(10226);Location location = getLocation();
        __CLR4_5_27v17v1lx1h3755.R.inc(10227);double locationX = location.getX();
        __CLR4_5_27v17v1lx1h3755.R.inc(10228);double locationY = location.getY();

        __CLR4_5_27v17v1lx1h3755.R.inc(10229);double pixelX = locationX / getUnitsPerPixel().getX();
        __CLR4_5_27v17v1lx1h3755.R.inc(10230);double pixelY = locationY / getUnitsPerPixel().getY();

        __CLR4_5_27v17v1lx1h3755.R.inc(10231);int dx1 = (int) (pixelX - (width / 2));
        __CLR4_5_27v17v1lx1h3755.R.inc(10232);int dy1 = (int) (source.getHeight() - (pixelY + (height / 2)));

        __CLR4_5_27v17v1lx1h3755.R.inc(10233);gFrame.drawImage(source, 0, 0, width - 1, height - 1, dx1, dy1, dx1 + width - 1,
                dy1 + height - 1, null);

        __CLR4_5_27v17v1lx1h3755.R.inc(10234);gFrame.dispose();

        __CLR4_5_27v17v1lx1h3755.R.inc(10235);return transformImage(frame);
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    private synchronized void initialize() throws Exception {try{__CLR4_5_27v17v1lx1h3755.R.inc(10236);
        __CLR4_5_27v17v1lx1h3755.R.inc(10237);stop();

        __CLR4_5_27v17v1lx1h3755.R.inc(10238);if ((((sourceUri.startsWith("classpath://"))&&(__CLR4_5_27v17v1lx1h3755.R.iget(10239)!=0|true))||(__CLR4_5_27v17v1lx1h3755.R.iget(10240)==0&false))) {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10241);source = ImageIO.read(getClass().getClassLoader()
                    .getResourceAsStream(sourceUri.substring("classpath://".length())));
        }
        }else {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10242);source = ImageIO.read(new URL(sourceUri));
        }

        }__CLR4_5_27v17v1lx1h3755.R.inc(10243);if ((((listeners.size() > 0)&&(__CLR4_5_27v17v1lx1h3755.R.iget(10244)!=0|true))||(__CLR4_5_27v17v1lx1h3755.R.iget(10245)==0&false))) {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10246);start();
        }
    }}finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}


    public void run() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10247);
        __CLR4_5_27v17v1lx1h3755.R.inc(10248);while ((((!Thread.interrupted())&&(__CLR4_5_27v17v1lx1h3755.R.iget(10249)!=0|true))||(__CLR4_5_27v17v1lx1h3755.R.iget(10250)==0&false))) {{
            __CLR4_5_27v17v1lx1h3755.R.inc(10251);BufferedImage frame = capture();
            __CLR4_5_27v17v1lx1h3755.R.inc(10252);broadcastCapture(frame);
            __CLR4_5_27v17v1lx1h3755.R.inc(10253);try {
                __CLR4_5_27v17v1lx1h3755.R.inc(10254);Thread.sleep(1000 / fps);
            }
            catch (InterruptedException e) {
                __CLR4_5_27v17v1lx1h3755.R.inc(10255);return;
            }
        }
    }}finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10256);
        __CLR4_5_27v17v1lx1h3755.R.inc(10257);return new ImageCameraConfigurationWizard(this);
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10258);
        __CLR4_5_27v17v1lx1h3755.R.inc(10259);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10260);
        // TODO Auto-generated method stub
        __CLR4_5_27v17v1lx1h3755.R.inc(10261);return null;
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10262);
        __CLR4_5_27v17v1lx1h3755.R.inc(10263);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new CameraConfigurationWizard(this)),
                new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27v17v1lx1h3755.R.inc(10264);
        // TODO Auto-generated method stub
        __CLR4_5_27v17v1lx1h3755.R.inc(10265);return null;
    }finally{__CLR4_5_27v17v1lx1h3755.R.flushNeeded();}}
}
