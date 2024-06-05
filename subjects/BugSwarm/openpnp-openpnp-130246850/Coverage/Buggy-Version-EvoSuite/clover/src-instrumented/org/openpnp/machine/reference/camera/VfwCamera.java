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
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.machine.reference.camera.wizards.VfwCameraConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.vonnieda.vfw.CaptureDevice;

public class VfwCamera extends ReferenceCamera implements Runnable {public static class __CLR4_5_2850850lx1h0b2h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,10635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute(required = false)
    private String driver;
    @Attribute(required = false)
    private boolean showVideoSourceDialog;
    @Attribute(required = false)
    private boolean showVideoFormatDialog;
    @Attribute(required = false)
    private boolean showVideoDisplayDialog;

    private CaptureDevice captureDevice;
    private int width, height;

    private BufferedImage lastImage;

    private Object captureLock = new Object();

    private Thread captureThread;

    public VfwCamera() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10548);
        __CLR4_5_2850850lx1h0b2h.R.inc(10549);Configuration.get().addListener(new ConfigurationListener.Adapter() {

            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_2850850lx1h0b2h.R.inc(10550);
                __CLR4_5_2850850lx1h0b2h.R.inc(10551);if ((((driver != null && driver.trim().length() != 0)&&(__CLR4_5_2850850lx1h0b2h.R.iget(10552)!=0|true))||(__CLR4_5_2850850lx1h0b2h.R.iget(10553)==0&false))) {{
                    __CLR4_5_2850850lx1h0b2h.R.inc(10554);setDriver(driver);
                }
            }}finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public String getDriver() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10555);
        __CLR4_5_2850850lx1h0b2h.R.inc(10556);return driver;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public void setDriver(String driver) {try{__CLR4_5_2850850lx1h0b2h.R.inc(10557);
        __CLR4_5_2850850lx1h0b2h.R.inc(10558);if ((((captureThread != null)&&(__CLR4_5_2850850lx1h0b2h.R.iget(10559)!=0|true))||(__CLR4_5_2850850lx1h0b2h.R.iget(10560)==0&false))) {{
            __CLR4_5_2850850lx1h0b2h.R.inc(10561);captureThread.interrupt();
            __CLR4_5_2850850lx1h0b2h.R.inc(10562);try {
                __CLR4_5_2850850lx1h0b2h.R.inc(10563);captureThread.join();
            }
            catch (Exception e) {
                __CLR4_5_2850850lx1h0b2h.R.inc(10564);e.printStackTrace();
            }
        }
        }__CLR4_5_2850850lx1h0b2h.R.inc(10565);this.driver = driver;
        __CLR4_5_2850850lx1h0b2h.R.inc(10566);captureThread = new Thread(this);
        __CLR4_5_2850850lx1h0b2h.R.inc(10567);captureThread.start();
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public boolean isShowVideoSourceDialog() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10568);
        __CLR4_5_2850850lx1h0b2h.R.inc(10569);return showVideoSourceDialog;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public void setShowVideoSourceDialog(boolean showVideoSourceDialog) {try{__CLR4_5_2850850lx1h0b2h.R.inc(10570);
        __CLR4_5_2850850lx1h0b2h.R.inc(10571);this.showVideoSourceDialog = showVideoSourceDialog;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public boolean isShowVideoFormatDialog() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10572);
        __CLR4_5_2850850lx1h0b2h.R.inc(10573);return showVideoFormatDialog;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public void setShowVideoFormatDialog(boolean showVideoFormatDialog) {try{__CLR4_5_2850850lx1h0b2h.R.inc(10574);
        __CLR4_5_2850850lx1h0b2h.R.inc(10575);this.showVideoFormatDialog = showVideoFormatDialog;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public boolean isShowVideoDisplayDialog() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10576);
        __CLR4_5_2850850lx1h0b2h.R.inc(10577);return showVideoDisplayDialog;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public void setShowVideoDisplayDialog(boolean showVideoDisplayDialog) {try{__CLR4_5_2850850lx1h0b2h.R.inc(10578);
        __CLR4_5_2850850lx1h0b2h.R.inc(10579);this.showVideoDisplayDialog = showVideoDisplayDialog;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public List<String> getDrivers() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10580);
        __CLR4_5_2850850lx1h0b2h.R.inc(10581);ArrayList<String> drivers = new ArrayList<>();
        __CLR4_5_2850850lx1h0b2h.R.inc(10582);try {
            __CLR4_5_2850850lx1h0b2h.R.inc(10583);for (String s : CaptureDevice.getCaptureDrivers()) {{
                __CLR4_5_2850850lx1h0b2h.R.inc(10584);drivers.add(s);
            }
        }}
        catch (UnsatisfiedLinkError e) {

        }
        __CLR4_5_2850850lx1h0b2h.R.inc(10585);return drivers;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    public void run() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10586);
        __CLR4_5_2850850lx1h0b2h.R.inc(10587);try {
            __CLR4_5_2850850lx1h0b2h.R.inc(10588);captureDevice = CaptureDevice.getCaptureDevice(driver);
        }
        catch (Exception e) {
            __CLR4_5_2850850lx1h0b2h.R.inc(10589);e.printStackTrace();
            __CLR4_5_2850850lx1h0b2h.R.inc(10590);return;
        }

        __CLR4_5_2850850lx1h0b2h.R.inc(10591);if ((((showVideoSourceDialog)&&(__CLR4_5_2850850lx1h0b2h.R.iget(10592)!=0|true))||(__CLR4_5_2850850lx1h0b2h.R.iget(10593)==0&false))) {{
            __CLR4_5_2850850lx1h0b2h.R.inc(10594);captureDevice.showVideoSourceDialog();
        }

        }__CLR4_5_2850850lx1h0b2h.R.inc(10595);if ((((showVideoFormatDialog)&&(__CLR4_5_2850850lx1h0b2h.R.iget(10596)!=0|true))||(__CLR4_5_2850850lx1h0b2h.R.iget(10597)==0&false))) {{
            __CLR4_5_2850850lx1h0b2h.R.inc(10598);captureDevice.showVideoFormatDialog();
        }

        }__CLR4_5_2850850lx1h0b2h.R.inc(10599);if ((((showVideoDisplayDialog)&&(__CLR4_5_2850850lx1h0b2h.R.iget(10600)!=0|true))||(__CLR4_5_2850850lx1h0b2h.R.iget(10601)==0&false))) {{
            __CLR4_5_2850850lx1h0b2h.R.inc(10602);captureDevice.showVideoDisplayDialog();
        }

        }__CLR4_5_2850850lx1h0b2h.R.inc(10603);width = (int) captureDevice.getVideoDimensions().getWidth();
        __CLR4_5_2850850lx1h0b2h.R.inc(10604);height = (int) captureDevice.getVideoDimensions().getHeight();

        __CLR4_5_2850850lx1h0b2h.R.inc(10605);while ((((!Thread.interrupted())&&(__CLR4_5_2850850lx1h0b2h.R.iget(10606)!=0|true))||(__CLR4_5_2850850lx1h0b2h.R.iget(10607)==0&false))) {{
            __CLR4_5_2850850lx1h0b2h.R.inc(10608);int[] captureData = captureDevice.captureFrame();
            __CLR4_5_2850850lx1h0b2h.R.inc(10609);BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
            __CLR4_5_2850850lx1h0b2h.R.inc(10610);image.setRGB(0, 0, width, height, captureData, 0, width);
            __CLR4_5_2850850lx1h0b2h.R.inc(10611);lastImage = transformImage(image);
            __CLR4_5_2850850lx1h0b2h.R.inc(10612);broadcastCapture(lastImage);
            __CLR4_5_2850850lx1h0b2h.R.inc(10613);synchronized (captureLock) {
                __CLR4_5_2850850lx1h0b2h.R.inc(10614);captureLock.notify();
            }
            __CLR4_5_2850850lx1h0b2h.R.inc(10615);try {
                __CLR4_5_2850850lx1h0b2h.R.inc(10616);Thread.sleep(1000 / 30);
            }
            catch (Exception e) {
            }
        }
    }}finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    @Override
    public BufferedImage capture() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10617);
        __CLR4_5_2850850lx1h0b2h.R.inc(10618);synchronized (captureLock) {
            __CLR4_5_2850850lx1h0b2h.R.inc(10619);try {
                __CLR4_5_2850850lx1h0b2h.R.inc(10620);captureLock.wait();
                __CLR4_5_2850850lx1h0b2h.R.inc(10621);BufferedImage image = lastImage;
                __CLR4_5_2850850lx1h0b2h.R.inc(10622);return image;
            }
            catch (Exception e) {
                __CLR4_5_2850850lx1h0b2h.R.inc(10623);e.printStackTrace();
                __CLR4_5_2850850lx1h0b2h.R.inc(10624);return null;
            }
        }
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10625);
        __CLR4_5_2850850lx1h0b2h.R.inc(10626);return new VfwCameraConfigurationWizard(this);
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10627);
        __CLR4_5_2850850lx1h0b2h.R.inc(10628);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10629);
        // TODO Auto-generated method stub
        __CLR4_5_2850850lx1h0b2h.R.inc(10630);return null;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10631);
        // TODO Auto-generated method stub
        __CLR4_5_2850850lx1h0b2h.R.inc(10632);return null;
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2850850lx1h0b2h.R.inc(10633);
        __CLR4_5_2850850lx1h0b2h.R.inc(10634);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new CameraConfigurationWizard(this)),
                new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2850850lx1h0b2h.R.flushNeeded();}}
}
