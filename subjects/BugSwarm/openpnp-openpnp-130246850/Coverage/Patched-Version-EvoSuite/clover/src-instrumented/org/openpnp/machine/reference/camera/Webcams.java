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

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openpnp.CameraListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.machine.reference.camera.wizards.WebcamConfigurationWizard;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamImageTransformer;
import com.github.sarxos.webcam.util.jh.JHGrayFilter;



/**
 * A Camera implementation based on the OpenCV FrameGrabbers.
 */
public class Webcams extends ReferenceCamera implements Runnable, WebcamImageTransformer {public static class __CLR4_5_287f87flx1h5o3g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,10745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Attribute(required = false)
    protected String deviceId = "###DEVICE###";

    @Attribute(required = false)
    private int preferredWidth = 0;
    @Attribute(required = false)
    private int preferredHeight = 0;

    protected Webcam webcam;
    private Thread thread;
    private boolean forceGray;
    private BufferedImage image;

    private static final JHGrayFilter GRAY = new JHGrayFilter();


    @Override
    public BufferedImage transform(BufferedImage image) {try{__CLR4_5_287f87flx1h5o3g.R.inc(10635);
        __CLR4_5_287f87flx1h5o3g.R.inc(10636);return GRAY.filter(image, null);
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public Webcams() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10637);

    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    @Override
    public synchronized BufferedImage capture() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10638);
        __CLR4_5_287f87flx1h5o3g.R.inc(10639);if ((((thread == null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10640)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10641)==0&false))) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10642);setDeviceId(deviceId);
        }
        }__CLR4_5_287f87flx1h5o3g.R.inc(10643);if ((((thread == null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10644)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10645)==0&false))) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10646);return null;
        }
        }__CLR4_5_287f87flx1h5o3g.R.inc(10647);try {
            __CLR4_5_287f87flx1h5o3g.R.inc(10648);BufferedImage img = webcam.getImage();
            __CLR4_5_287f87flx1h5o3g.R.inc(10649);return transformImage(img);
        }
        catch (Exception e) {
            __CLR4_5_287f87flx1h5o3g.R.inc(10650);return null;
        }
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    @Override
    public synchronized void startContinuousCapture(CameraListener listener, int maximumFps) {try{__CLR4_5_287f87flx1h5o3g.R.inc(10651);
        __CLR4_5_287f87flx1h5o3g.R.inc(10652);if ((((thread == null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10653)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10654)==0&false))) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10655);setDeviceId(deviceId);
        }
        }__CLR4_5_287f87flx1h5o3g.R.inc(10656);super.startContinuousCapture(listener, maximumFps);
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    private BufferedImage lastImage = null;
    private BufferedImage redImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);


    public void run() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10657);
        __CLR4_5_287f87flx1h5o3g.R.inc(10658);while ((((!Thread.interrupted())&&(__CLR4_5_287f87flx1h5o3g.R.iget(10659)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10660)==0&false))) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10661);try {
                __CLR4_5_287f87flx1h5o3g.R.inc(10662);BufferedImage image = capture();
                __CLR4_5_287f87flx1h5o3g.R.inc(10663);if ((((image == null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10664)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10665)==0&false))) {{
                    __CLR4_5_287f87flx1h5o3g.R.inc(10666);image = redImage;
                }
                }__CLR4_5_287f87flx1h5o3g.R.inc(10667);broadcastCapture(image);
            }
            catch (Exception e) {
                __CLR4_5_287f87flx1h5o3g.R.inc(10668);e.printStackTrace();
            }
            __CLR4_5_287f87flx1h5o3g.R.inc(10669);try {
                __CLR4_5_287f87flx1h5o3g.R.inc(10670);Thread.sleep(1000 / 30);
            }
            catch (InterruptedException e) {
                __CLR4_5_287f87flx1h5o3g.R.inc(10671);break;
            }
        }
    }}finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public String getDeviceId() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10672);
        __CLR4_5_287f87flx1h5o3g.R.inc(10673);return deviceId;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public synchronized void setDeviceId(String deviceId) {try{__CLR4_5_287f87flx1h5o3g.R.inc(10674);
        __CLR4_5_287f87flx1h5o3g.R.inc(10675);this.deviceId = deviceId;
        __CLR4_5_287f87flx1h5o3g.R.inc(10676);if ((((thread != null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10677)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10678)==0&false))) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10679);thread.interrupt();
            __CLR4_5_287f87flx1h5o3g.R.inc(10680);try {
                __CLR4_5_287f87flx1h5o3g.R.inc(10681);thread.join();
            }
            catch (Exception e) {
                __CLR4_5_287f87flx1h5o3g.R.inc(10682);e.printStackTrace();
            }
            __CLR4_5_287f87flx1h5o3g.R.inc(10683);thread = null;
            __CLR4_5_287f87flx1h5o3g.R.inc(10684);webcam.close();
        }
        }__CLR4_5_287f87flx1h5o3g.R.inc(10685);try {
            __CLR4_5_287f87flx1h5o3g.R.inc(10686);webcam = null;
            __CLR4_5_287f87flx1h5o3g.R.inc(10687);for (Webcam cam : Webcam.getWebcams()) {{
                __CLR4_5_287f87flx1h5o3g.R.inc(10688);if ((((cam.getName().equals(deviceId))&&(__CLR4_5_287f87flx1h5o3g.R.iget(10689)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10690)==0&false))) {{
                    __CLR4_5_287f87flx1h5o3g.R.inc(10691);webcam = cam;
                }
            }}
            }__CLR4_5_287f87flx1h5o3g.R.inc(10692);if ((((webcam == null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10693)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10694)==0&false))) {{
                __CLR4_5_287f87flx1h5o3g.R.inc(10695);return;
            }
            }__CLR4_5_287f87flx1h5o3g.R.inc(10696);if ((((preferredWidth != 0 && preferredHeight != 0)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10697)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10698)==0&false))) {{
                __CLR4_5_287f87flx1h5o3g.R.inc(10699);webcam.setViewSize(new Dimension(preferredWidth, preferredHeight));
            }
            }__CLR4_5_287f87flx1h5o3g.R.inc(10700);webcam.open();
            __CLR4_5_287f87flx1h5o3g.R.inc(10701);if ((((forceGray)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10702)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10703)==0&false))) {{
                __CLR4_5_287f87flx1h5o3g.R.inc(10704);webcam.setImageTransformer(this);
            }
        }}
        catch (Exception e) {
            __CLR4_5_287f87flx1h5o3g.R.inc(10705);e.printStackTrace();
            __CLR4_5_287f87flx1h5o3g.R.inc(10706);return;
        }
        __CLR4_5_287f87flx1h5o3g.R.inc(10707);thread = new Thread(this);
        __CLR4_5_287f87flx1h5o3g.R.inc(10708);thread.start();
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public void setForceGray(boolean val) {try{__CLR4_5_287f87flx1h5o3g.R.inc(10709);
        __CLR4_5_287f87flx1h5o3g.R.inc(10710);forceGray = val;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public boolean isForceGray() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10711);
        __CLR4_5_287f87flx1h5o3g.R.inc(10712);return forceGray;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public int getPreferredWidth() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10713);
        __CLR4_5_287f87flx1h5o3g.R.inc(10714);return preferredWidth;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public void setPreferredWidth(int preferredWidth) {try{__CLR4_5_287f87flx1h5o3g.R.inc(10715);
        __CLR4_5_287f87flx1h5o3g.R.inc(10716);this.preferredWidth = preferredWidth;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public int getPreferredHeight() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10717);
        __CLR4_5_287f87flx1h5o3g.R.inc(10718);return preferredHeight;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    public void setPreferredHeight(int preferredHeight) {try{__CLR4_5_287f87flx1h5o3g.R.inc(10719);
        __CLR4_5_287f87flx1h5o3g.R.inc(10720);this.preferredHeight = preferredHeight;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}


    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10721);
        __CLR4_5_287f87flx1h5o3g.R.inc(10722);return new WebcamConfigurationWizard(this);
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10723);
        __CLR4_5_287f87flx1h5o3g.R.inc(10724);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10725);
        // TODO Auto-generated method stub
        __CLR4_5_287f87flx1h5o3g.R.inc(10726);return null;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10727);
        __CLR4_5_287f87flx1h5o3g.R.inc(10728);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new CameraConfigurationWizard(this)),
                new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}


    public List<String> getDeviceIds() throws Exception {try{__CLR4_5_287f87flx1h5o3g.R.inc(10729);
        __CLR4_5_287f87flx1h5o3g.R.inc(10730);ArrayList<String> deviceIds = new ArrayList<>();
        __CLR4_5_287f87flx1h5o3g.R.inc(10731);for (Webcam cam : Webcam.getWebcams()) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10732);deviceIds.add(cam.getName());
        }
        }__CLR4_5_287f87flx1h5o3g.R.inc(10733);return deviceIds;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}


    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_287f87flx1h5o3g.R.inc(10734);
        // TODO Auto-generated method stub
        __CLR4_5_287f87flx1h5o3g.R.inc(10735);return null;
    }finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_287f87flx1h5o3g.R.inc(10736);
        __CLR4_5_287f87flx1h5o3g.R.inc(10737);super.close();
        __CLR4_5_287f87flx1h5o3g.R.inc(10738);if ((((thread != null)&&(__CLR4_5_287f87flx1h5o3g.R.iget(10739)!=0|true))||(__CLR4_5_287f87flx1h5o3g.R.iget(10740)==0&false))) {{
            __CLR4_5_287f87flx1h5o3g.R.inc(10741);thread.interrupt();
            __CLR4_5_287f87flx1h5o3g.R.inc(10742);try {
                __CLR4_5_287f87flx1h5o3g.R.inc(10743);thread.join();
            }
            catch (Exception e) {

            }
            __CLR4_5_287f87flx1h5o3g.R.inc(10744);webcam.close();
        }
    }}finally{__CLR4_5_287f87flx1h5o3g.R.flushNeeded();}}
}
