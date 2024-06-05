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
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.machine.reference.camera.wizards.LtiCivilCameraConfigurationWizard;
import org.openpnp.model.Configuration;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;

import com.lti.civil.CaptureDeviceInfo;
import com.lti.civil.CaptureException;
import com.lti.civil.CaptureObserver;
import com.lti.civil.CaptureStream;
import com.lti.civil.CaptureSystem;
import com.lti.civil.CaptureSystemFactory;
import com.lti.civil.DefaultCaptureSystemFactorySingleton;
import com.lti.civil.Image;
import com.lti.civil.VideoFormat;
import com.lti.civil.awt.AWTImageConverter;

@Deprecated
public class LtiCivilCamera extends ReferenceCamera implements CaptureObserver {public static class __CLR4_5_27x67x6lx1h5o0y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,10332,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CaptureSystemFactory captureSystemFactory;
    private CaptureSystem captureSystem;
    private CaptureStream captureStream;
    private VideoFormat videoFormat;

    @Attribute(required = false)
    private String deviceId;
    @Attribute(required = false)
    private boolean forceGrayscale;

    private int width, height;

    private BufferedImage lastImage;

    private Object captureLock = new Object();

    public LtiCivilCamera() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10266);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10267);Configuration.get().addListener(new ConfigurationListener.Adapter() {

            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10268);
                __CLR4_5_27x67x6lx1h5o0y.R.inc(10269);captureSystemFactory = DefaultCaptureSystemFactorySingleton.instance();
                __CLR4_5_27x67x6lx1h5o0y.R.inc(10270);captureSystem = captureSystemFactory.createCaptureSystem();

                __CLR4_5_27x67x6lx1h5o0y.R.inc(10271);if ((((deviceId != null && deviceId.trim().length() != 0)&&(__CLR4_5_27x67x6lx1h5o0y.R.iget(10272)!=0|true))||(__CLR4_5_27x67x6lx1h5o0y.R.iget(10273)==0&false))) {{
                    __CLR4_5_27x67x6lx1h5o0y.R.inc(10274);setDeviceId(deviceId);
                }
            }}finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}
        });
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    public void setDeviceId(String deviceId) throws Exception {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10275);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10276);if ((((captureStream != null)&&(__CLR4_5_27x67x6lx1h5o0y.R.iget(10277)!=0|true))||(__CLR4_5_27x67x6lx1h5o0y.R.iget(10278)==0&false))) {{
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10279);captureStream.stop();
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10280);captureStream.dispose();
        }
        }__CLR4_5_27x67x6lx1h5o0y.R.inc(10281);captureStream = captureSystem.openCaptureDeviceStream(deviceId);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10282);videoFormat = captureStream.getVideoFormat();
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10283);width = videoFormat.getWidth();
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10284);height = videoFormat.getHeight();
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10285);captureStream.setObserver(this);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10286);captureStream.start();
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10287);this.deviceId = deviceId;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    public String getDeviceId() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10288);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10289);return deviceId;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    public boolean isForceGrayscale() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10290);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10291);return forceGrayscale;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    public void setForceGrayscale(boolean forceGrayscale) {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10292);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10293);this.forceGrayscale = forceGrayscale;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    public List<String> getDeviceIds() throws Exception {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10294);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10295);ArrayList<String> deviceIds = new ArrayList<>();
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10296);for (CaptureDeviceInfo captureDeviceInfo : (List<CaptureDeviceInfo>) captureSystem
                .getCaptureDeviceInfoList()) {{
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10297);deviceIds.add(captureDeviceInfo.getDeviceID());
        }
        }__CLR4_5_27x67x6lx1h5o0y.R.inc(10298);return deviceIds;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public void onError(CaptureStream captureStream, CaptureException captureException) {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10299);}finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public void onNewImage(CaptureStream captureStream, Image newImage) {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10300);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10301);BufferedImage bImage = AWTImageConverter.toBufferedImage(newImage);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10302);if ((((forceGrayscale)&&(__CLR4_5_27x67x6lx1h5o0y.R.iget(10303)!=0|true))||(__CLR4_5_27x67x6lx1h5o0y.R.iget(10304)==0&false))) {{
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10305);BufferedImage grayImage =
                    new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10306);Graphics g = grayImage.getGraphics();
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10307);g.drawImage(bImage, 0, 0, null);
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10308);g.dispose();
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10309);lastImage = grayImage;
        }
        }else {{
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10310);lastImage = bImage;
        }
        }__CLR4_5_27x67x6lx1h5o0y.R.inc(10311);lastImage = transformImage(lastImage);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10312);broadcastCapture(lastImage);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10313);synchronized (captureLock) {
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10314);captureLock.notify();
        }
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public BufferedImage capture() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10315);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10316);synchronized (captureLock) {
            __CLR4_5_27x67x6lx1h5o0y.R.inc(10317);try {
                __CLR4_5_27x67x6lx1h5o0y.R.inc(10318);captureLock.wait();
                __CLR4_5_27x67x6lx1h5o0y.R.inc(10319);BufferedImage image = lastImage;
                __CLR4_5_27x67x6lx1h5o0y.R.inc(10320);return image;
            }
            catch (Exception e) {
                __CLR4_5_27x67x6lx1h5o0y.R.inc(10321);return null;
            }
        }
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10322);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10323);return new LtiCivilCameraConfigurationWizard(this);
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10324);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10325);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10326);
        // TODO Auto-generated method stub
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10327);return null;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10328);
        // TODO Auto-generated method stub
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10329);return null;
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27x67x6lx1h5o0y.R.inc(10330);
        __CLR4_5_27x67x6lx1h5o0y.R.inc(10331);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new CameraConfigurationWizard(this)),
                new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27x67x6lx1h5o0y.R.flushNeeded();}}
}
