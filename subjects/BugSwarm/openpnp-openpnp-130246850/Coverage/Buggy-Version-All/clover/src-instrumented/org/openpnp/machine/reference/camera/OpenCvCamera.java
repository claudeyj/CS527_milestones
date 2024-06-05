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

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.Action;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.openpnp.CameraListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.machine.reference.camera.wizards.OpenCvCameraConfigurationWizard;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.util.OpenCvUtils;
import org.simpleframework.xml.Attribute;

/**
 * A Camera implementation based on the OpenCV FrameGrabbers.
 */
public class OpenCvCamera extends ReferenceCamera implements Runnable {public static class __CLR4_5_27z07z0lx1h376y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,10440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_27z07z0lx1h376y.R.inc(10332);
        __CLR4_5_27z07z0lx1h376y.R.inc(10333);nu.pattern.OpenCV.loadShared();
        __CLR4_5_27z07z0lx1h376y.R.inc(10334);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Attribute(name = "deviceIndex", required = true)
    private int deviceIndex = 0;

    @Attribute(required = false)
    private int preferredWidth;
    @Attribute(required = false)
    private int preferredHeight;
    @Attribute(required = false)
    private int fps = 24;

    private VideoCapture fg = new VideoCapture();
    private Thread thread;
    private boolean dirty = false;

    public OpenCvCamera() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10335);}finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public synchronized BufferedImage capture() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10336);
        __CLR4_5_27z07z0lx1h376y.R.inc(10337);if ((((thread == null)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10338)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10339)==0&false))) {{
            __CLR4_5_27z07z0lx1h376y.R.inc(10340);setDeviceIndex(deviceIndex);
        }
        }__CLR4_5_27z07z0lx1h376y.R.inc(10341);Mat mat = new Mat();
        __CLR4_5_27z07z0lx1h376y.R.inc(10342);try {
            __CLR4_5_27z07z0lx1h376y.R.inc(10343);if ((((!fg.read(mat))&&(__CLR4_5_27z07z0lx1h376y.R.iget(10344)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10345)==0&false))) {{
                __CLR4_5_27z07z0lx1h376y.R.inc(10346);return null;
            }
            }__CLR4_5_27z07z0lx1h376y.R.inc(10347);BufferedImage img = OpenCvUtils.toBufferedImage(mat);
            __CLR4_5_27z07z0lx1h376y.R.inc(10348);return transformImage(img);
        }
        catch (Exception e) {
            __CLR4_5_27z07z0lx1h376y.R.inc(10349);return null;
        }
        finally {
            __CLR4_5_27z07z0lx1h376y.R.inc(10350);mat.release();
        }
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public synchronized void startContinuousCapture(CameraListener listener, int maximumFps) {try{__CLR4_5_27z07z0lx1h376y.R.inc(10351);
        __CLR4_5_27z07z0lx1h376y.R.inc(10352);if ((((thread == null)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10353)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10354)==0&false))) {{
            __CLR4_5_27z07z0lx1h376y.R.inc(10355);setDeviceIndex(deviceIndex);
        }
        }__CLR4_5_27z07z0lx1h376y.R.inc(10356);super.startContinuousCapture(listener, maximumFps);
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public void run() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10357);
        __CLR4_5_27z07z0lx1h376y.R.inc(10358);while ((((!Thread.interrupted())&&(__CLR4_5_27z07z0lx1h376y.R.iget(10359)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10360)==0&false))) {{
            __CLR4_5_27z07z0lx1h376y.R.inc(10361);try {
                __CLR4_5_27z07z0lx1h376y.R.inc(10362);BufferedImage image = capture();
                __CLR4_5_27z07z0lx1h376y.R.inc(10363);if ((((image != null)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10364)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10365)==0&false))) {{
                    __CLR4_5_27z07z0lx1h376y.R.inc(10366);broadcastCapture(image);
                }
            }}
            catch (Exception e) {
                __CLR4_5_27z07z0lx1h376y.R.inc(10367);e.printStackTrace();
            }
            __CLR4_5_27z07z0lx1h376y.R.inc(10368);try {
                __CLR4_5_27z07z0lx1h376y.R.inc(10369);Thread.sleep(1000 / fps);
            }
            catch (InterruptedException e) {
                __CLR4_5_27z07z0lx1h376y.R.inc(10370);break;
            }
        }
    }}finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public int getDeviceIndex() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10371);
        __CLR4_5_27z07z0lx1h376y.R.inc(10372);return deviceIndex;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public synchronized void setDeviceIndex(int deviceIndex) {try{__CLR4_5_27z07z0lx1h376y.R.inc(10373);
        __CLR4_5_27z07z0lx1h376y.R.inc(10374);this.deviceIndex = deviceIndex;
        __CLR4_5_27z07z0lx1h376y.R.inc(10375);if ((((thread != null)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10376)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10377)==0&false))) {{
            __CLR4_5_27z07z0lx1h376y.R.inc(10378);thread.interrupt();
            __CLR4_5_27z07z0lx1h376y.R.inc(10379);try {
                __CLR4_5_27z07z0lx1h376y.R.inc(10380);thread.join();
            }
            catch (Exception e) {
                __CLR4_5_27z07z0lx1h376y.R.inc(10381);e.printStackTrace();
            }
            __CLR4_5_27z07z0lx1h376y.R.inc(10382);thread = null;
        }
        }__CLR4_5_27z07z0lx1h376y.R.inc(10383);try {
            __CLR4_5_27z07z0lx1h376y.R.inc(10384);setDirty(false);
            __CLR4_5_27z07z0lx1h376y.R.inc(10385);width = null;
            __CLR4_5_27z07z0lx1h376y.R.inc(10386);height = null;
            __CLR4_5_27z07z0lx1h376y.R.inc(10387);fg.open(deviceIndex);
            __CLR4_5_27z07z0lx1h376y.R.inc(10388);if ((((preferredWidth != 0)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10389)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10390)==0&false))) {{
                __CLR4_5_27z07z0lx1h376y.R.inc(10391);fg.set(Highgui.CV_CAP_PROP_FRAME_WIDTH, preferredWidth);
            }
            }__CLR4_5_27z07z0lx1h376y.R.inc(10392);if ((((preferredHeight != 0)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10393)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10394)==0&false))) {{
                __CLR4_5_27z07z0lx1h376y.R.inc(10395);fg.set(Highgui.CV_CAP_PROP_FRAME_HEIGHT, preferredHeight);
            }
        }}
        catch (Exception e) {
            __CLR4_5_27z07z0lx1h376y.R.inc(10396);e.printStackTrace();
            __CLR4_5_27z07z0lx1h376y.R.inc(10397);return;
        }
        __CLR4_5_27z07z0lx1h376y.R.inc(10398);thread = new Thread(this);
        __CLR4_5_27z07z0lx1h376y.R.inc(10399);thread.start();
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public int getPreferredWidth() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10400);
        __CLR4_5_27z07z0lx1h376y.R.inc(10401);return preferredWidth;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public void setPreferredWidth(int preferredWidth) {try{__CLR4_5_27z07z0lx1h376y.R.inc(10402);
        __CLR4_5_27z07z0lx1h376y.R.inc(10403);this.preferredWidth = preferredWidth;
        __CLR4_5_27z07z0lx1h376y.R.inc(10404);setDirty(true);
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public int getPreferredHeight() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10405);
        __CLR4_5_27z07z0lx1h376y.R.inc(10406);return preferredHeight;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public void setPreferredHeight(int preferredHeight) {try{__CLR4_5_27z07z0lx1h376y.R.inc(10407);
        __CLR4_5_27z07z0lx1h376y.R.inc(10408);this.preferredHeight = preferredHeight;
        __CLR4_5_27z07z0lx1h376y.R.inc(10409);setDirty(true);
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}
    
    public int getFps() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10410);
        __CLR4_5_27z07z0lx1h376y.R.inc(10411);return fps;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public void setFps(int fps) {try{__CLR4_5_27z07z0lx1h376y.R.inc(10412);
        __CLR4_5_27z07z0lx1h376y.R.inc(10413);this.fps = fps;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public boolean isDirty() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10414);
        __CLR4_5_27z07z0lx1h376y.R.inc(10415);return dirty;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    public void setDirty(boolean dirty) {try{__CLR4_5_27z07z0lx1h376y.R.inc(10416);
        __CLR4_5_27z07z0lx1h376y.R.inc(10417);this.dirty = dirty;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10418);
        __CLR4_5_27z07z0lx1h376y.R.inc(10419);return new OpenCvCameraConfigurationWizard(this);
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10420);
        __CLR4_5_27z07z0lx1h376y.R.inc(10421);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10422);
        // TODO Auto-generated method stub
        __CLR4_5_27z07z0lx1h376y.R.inc(10423);return null;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10424);
        __CLR4_5_27z07z0lx1h376y.R.inc(10425);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new CameraConfigurationWizard(this)),
                new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27z07z0lx1h376y.R.inc(10426);
        // TODO Auto-generated method stub
        __CLR4_5_27z07z0lx1h376y.R.inc(10427);return null;
    }finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_27z07z0lx1h376y.R.inc(10428);
        __CLR4_5_27z07z0lx1h376y.R.inc(10429);super.close();
        __CLR4_5_27z07z0lx1h376y.R.inc(10430);if ((((thread != null)&&(__CLR4_5_27z07z0lx1h376y.R.iget(10431)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10432)==0&false))) {{
            __CLR4_5_27z07z0lx1h376y.R.inc(10433);thread.interrupt();
            __CLR4_5_27z07z0lx1h376y.R.inc(10434);try {
                __CLR4_5_27z07z0lx1h376y.R.inc(10435);thread.join();
            }
            catch (Exception e) {

            }
        }
        }__CLR4_5_27z07z0lx1h376y.R.inc(10436);if ((((fg.isOpened())&&(__CLR4_5_27z07z0lx1h376y.R.iget(10437)!=0|true))||(__CLR4_5_27z07z0lx1h376y.R.iget(10438)==0&false))) {{
            __CLR4_5_27z07z0lx1h376y.R.inc(10439);fg.release();
        }
    }}finally{__CLR4_5_27z07z0lx1h376y.R.flushNeeded();}}
}
