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

package org.openpnp.gui.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import org.openpnp.CameraListener;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.reticle.Reticle;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Nozzle;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.openpnp.util.XmlSerialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"serial","fallthrough"})
public class CameraView extends JComponent implements CameraListener {public static class __CLR4_5_22j92j9lx1h07wu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,4068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(CameraView.class);

    private static final String PREF_RETICLE = "CamerView.reticle";

    private static final String DEFAULT_RETICLE_KEY = "DEFAULT_RETICLE_KEY";

    private final static int HANDLE_DIAMETER = 8;

    private enum HandlePosition {
        NW, N, NE, E, SE, S, SW, W
    }

    private enum SelectionMode {
        Resizing, Moving, Creating
    }

    /**
     * The Camera we are viewing.
     */
    private Camera camera;

    /**
     * The last frame received, reported by the Camera.
     */
    private BufferedImage lastFrame;

    /**
     * The maximum frames per second that we'll display.
     */
    private int maximumFps;

    private LinkedHashMap<Object, Reticle> reticles = new LinkedHashMap<>();

    private JPopupMenu popupMenu;

    /**
     * The last width and height of the component that we painted for. If the width or height is
     * different from these values at the start of paint we'll recalculate all the scaling data.
     */
    private double lastWidth, lastHeight;

    /**
     * The last width and height of the image that we painted for. If the width or height is
     * different from these values at the start of paint we'll recalculate all the scaling data.
     */
    private double lastSourceWidth, lastSourceHeight;

    private Location lastUnitsPerPixel;

    /**
     * The width and height of the image after it has been scaled to fit the bounds of the
     * component.
     */
    private int scaledWidth, scaledHeight;

    /**
     * The ratio of scaled width and height to unscaled width and height. scaledWidth * scaleRatioX
     * = sourceWidth. scaleRatioX = sourceWidth / scaledWidth
     */
    private double scaleRatioX, scaleRatioY;

    /**
     * The Camera's units per pixel scaled at the same ratio as the image. That is, each pixel in
     * the scaled image is scaledUnitsPerPixelX wide and scaledUnitsPerPixelY high.
     */
    private double scaledUnitsPerPixelX, scaledUnitsPerPixelY;

    /**
     * The top left position within the component at which the scaled image can be drawn for it to
     * be centered.
     */
    private int imageX, imageY;

    private boolean selectionEnabled;
    /**
     * Rectangle describing the bounds of the selection in image coordinates.
     */
    private Rectangle selection;
    /**
     * The scaled version of the selection Rectangle. Rescaled any time the component's size is
     * changed.
     */
    private Rectangle selectionScaled;
    private SelectionMode selectionMode;
    private HandlePosition selectionActiveHandle;
    private int selectionStartX, selectionStartY;
    private float selectionFlashOpacity;
    private float selectionDashPhase;
    private static float[] selectionDashProfile = new float[] {6f, 6f};
    // 11 is the sum of the dash lengths minus 1.
    private static float selectionDashPhaseStart = 11f;

    private CameraViewSelectionTextDelegate selectionTextDelegate;

    private ScheduledExecutorService scheduledExecutor;

    private Preferences prefs = Preferences.userNodeForPackage(CameraView.class);

    private String text;

    private boolean showImageInfo;

    private List<CameraViewActionListener> actionListeners = new ArrayList<>();

    private CameraViewFilter cameraViewFilter;

    private long flashStartTimeMs;
    private long flashLengthMs = 250;
    
    private boolean showName = false;

    public CameraView() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3285);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3286);setBackground(Color.black);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3287);setOpaque(true);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3288);String reticlePref = prefs.get(PREF_RETICLE, null);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3289);try {
            __CLR4_5_22j92j9lx1h07wu.R.inc(3290);Reticle reticle = (Reticle) XmlSerialize.deserialize(reticlePref);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3291);setDefaultReticle(reticle);
        }
        catch (Exception e) {
            // logger.warn("Warning: Unable to load Reticle preference");
        }

        __CLR4_5_22j92j9lx1h07wu.R.inc(3292);popupMenu = new CameraViewPopupMenu(this);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3293);addMouseListener(mouseListener);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3294);addMouseMotionListener(mouseMotionListener);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3295);addComponentListener(componentListener);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3296);scheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        // TODO: Cancel this when it's not being used instead of spinning,
        // or maybe create a real thread and wait().
        __CLR4_5_22j92j9lx1h07wu.R.inc(3297);scheduledExecutor.scheduleAtFixedRate(new Runnable() {
            public void run() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3298);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3299);if ((((selectionEnabled && selection != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3300)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3301)==0&false))) {{
                    // Adjust the dash phase so the line marches on the next
                    // paint
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3302);selectionDashPhase -= 1f;
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3303);if ((((selectionDashPhase < 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3304)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3305)==0&false))) {{
                        __CLR4_5_22j92j9lx1h07wu.R.inc(3306);selectionDashPhase = selectionDashPhaseStart;
                    }
                    }__CLR4_5_22j92j9lx1h07wu.R.inc(3307);repaint();
                }
            }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
        }, 0, 50, TimeUnit.MILLISECONDS);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public CameraView(int maximumFps) {
        this();__CLR4_5_22j92j9lx1h07wu.R.inc(3309);try{__CLR4_5_22j92j9lx1h07wu.R.inc(3308);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3310);setMaximumFps(maximumFps);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void addActionListener(CameraViewActionListener listener) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3311);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3312);if ((((!actionListeners.contains(listener))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3313)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3314)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3315);actionListeners.add(listener);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public boolean removeActionListener(CameraViewActionListener listener) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3316);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3317);return actionListeners.remove(listener);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setMaximumFps(int maximumFps) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3318);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3319);this.maximumFps = maximumFps;
        // turn off capture for the camera we are replacing, if any
        __CLR4_5_22j92j9lx1h07wu.R.inc(3320);if ((((this.camera != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3321)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3322)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3323);this.camera.stopContinuousCapture(this);
        }
        // turn on capture for the new camera
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3324);if ((((this.camera != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3325)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3326)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3327);this.camera.startContinuousCapture(this, maximumFps);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public int getMaximumFps() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3328);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3329);return maximumFps;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setCamera(Camera camera) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3330);
        // turn off capture for the camera we are replacing, if any
        __CLR4_5_22j92j9lx1h07wu.R.inc(3331);if ((((this.camera != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3332)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3333)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3334);this.camera.stopContinuousCapture(this);
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3335);this.camera = camera;
        // turn on capture for the new camera
        __CLR4_5_22j92j9lx1h07wu.R.inc(3336);if ((((this.camera != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3337)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3338)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3339);this.camera.startContinuousCapture(this, maximumFps);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public Camera getCamera() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3340);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3341);return camera;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
    
    public void setShowName(boolean showName) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3342);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3343);this.showName = showName;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
    
    public boolean isShowName() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3344);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3345);return this.showName;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setDefaultReticle(Reticle reticle) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3346);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3347);setReticle(DEFAULT_RETICLE_KEY, reticle);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3348);prefs.put(PREF_RETICLE, XmlSerialize.serialize(reticle));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3349);try {
            __CLR4_5_22j92j9lx1h07wu.R.inc(3350);prefs.flush();
        }
        catch (Exception e) {

        }
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public Reticle getDefaultReticle() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3351);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3352);return reticles.get(DEFAULT_RETICLE_KEY);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setReticle(Object key, Reticle reticle) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3353);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3354);if ((((reticle == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3355)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3356)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3357);removeReticle(key);
        }
        }else {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3358);reticles.put(key, reticle);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public Reticle getReticle(Object key) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3359);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3360);return reticles.get(key);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public Reticle removeReticle(Object key) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3361);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3362);return reticles.remove(key);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public CameraViewSelectionTextDelegate getSelectionTextDelegate() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3363);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3364);return selectionTextDelegate;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setSelectionTextDelegate(CameraViewSelectionTextDelegate selectionTextDelegate) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3365);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3366);this.selectionTextDelegate = selectionTextDelegate;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public String getText() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3367);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3368);return text;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setText(String text) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3369);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3370);this.text = text;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Causes a short flash in the CameraView to get the user's attention.
     */
    public void flash() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3371);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3372);flashStartTimeMs = System.currentTimeMillis();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3373);scheduledExecutor.scheduleAtFixedRate(new Runnable() {
            public void run() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3374);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3375);if ((((System.currentTimeMillis() - flashStartTimeMs < flashLengthMs)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3376)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3377)==0&false))) {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3378);repaint();
                }
                }else {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3379);flashStartTimeMs = 0;
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3380);throw new RuntimeException();
                }
            }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
        }, 0, 30, TimeUnit.MILLISECONDS);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setCameraViewFilter(CameraViewFilter cameraViewFilter) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3381);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3382);this.cameraViewFilter = cameraViewFilter;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void showFilteredImage(final BufferedImage filteredImage, final long milliseconds) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3383);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3384);showFilteredImage(filteredImage, null, milliseconds);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Show image instead of the camera image for milliseconds. After milliseconds elapses the view
     * goes back to showing the camera image. The image should be the same width and height as the
     * camera image otherwise the behavior is undefined. This function is intended to be used to
     * briefly show the result of image processing. This is a shortcut to
     * setCameraViewFilter(CameraViewFilter) which simply removes itself after the specified time.
     * 
     * In addition to showing the given image, if the text parameters is not null the text
     * will be shown during the timeout using setText().
     * 
     * @param image
     * @param text
     * @param millseconds
     */
    public void showFilteredImage(BufferedImage filteredImage, String text, long milliseconds) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3385);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3386);if ((((text != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3387)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3388)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3389);setText(text);
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3390);setCameraViewFilter(new CameraViewFilter() {
            long t = System.currentTimeMillis();

            @Override
            public BufferedImage filterCameraImage(Camera camera, BufferedImage image) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3391);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3392);if (((((System.currentTimeMillis() - t) < milliseconds)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3393)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3394)==0&false))) {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3395);return filteredImage;
                }
                }else {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3396);if ((((text != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3397)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3398)==0&false))) {{
                        __CLR4_5_22j92j9lx1h07wu.R.inc(3399);setText(null);
                    }
                    }__CLR4_5_22j92j9lx1h07wu.R.inc(3400);setCameraViewFilter(null);
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3401);return image;
                }
            }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
        });
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public BufferedImage captureSelectionImage() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3402);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3403);if ((((selection == null || lastFrame == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3404)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3405)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3406);return null;
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3407);selectionFlashOpacity = 1.0f;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3408);ScheduledFuture future = scheduledExecutor.scheduleAtFixedRate(new Runnable() {
            public void run() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3409);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3410);if ((((selectionFlashOpacity > 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3411)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3412)==0&false))) {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3413);selectionFlashOpacity -= 0.07;
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3414);selectionFlashOpacity = Math.max(0, selectionFlashOpacity);
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3415);repaint();
                }
                }else {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3416);throw new RuntimeException();
                }
            }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
        }, 0, 30, TimeUnit.MILLISECONDS);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3417);int sx = selection.x;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3418);int sy = selection.y;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3419);int sw = selection.width;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3420);int sh = selection.height;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3421);BufferedImage image = new BufferedImage(sw, sh, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3422);Graphics g = image.getGraphics();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3423);g.drawImage(lastFrame, 0, 0, sw, sh, sx, sy, sx + sw, sy + sh, null);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3424);g.dispose();

        __CLR4_5_22j92j9lx1h07wu.R.inc(3425);while ((((!future.isDone())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3426)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3427)==0&false))){__CLR4_5_22j92j9lx1h07wu.R.inc(3428);;

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3429);return image;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public Rectangle getSelection() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3430);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3431);return selection;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    @Override
    public void frameReceived(BufferedImage img) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3432);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3433);if ((((cameraViewFilter != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3434)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3435)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3436);img = cameraViewFilter.filterCameraImage(camera, img);
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3437);BufferedImage oldFrame = lastFrame;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3438);lastFrame = img;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3439);if ((((oldFrame == null
                || (oldFrame.getWidth() != img.getWidth() || oldFrame.getHeight() != img.getHeight()
                        || camera.getUnitsPerPixel() != lastUnitsPerPixel))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3440)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3441)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3442);calculateScalingData();
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3443);repaint();
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Calculates a bunch of scaling data that we cache to speed up painting. This is recalculated
     * when the size of the component or the size of the source changes. This method is
     * synchronized, along with paintComponent() so that the updates to the cached data are atomic.
     */
    private synchronized void calculateScalingData() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3444);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3445);BufferedImage image = lastFrame;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3446);if ((((image == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3447)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3448)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3449);return;
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3450);Insets ins = getInsets();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3451);int width = getWidth() - ins.left - ins.right;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3452);int height = getHeight() - ins.top - ins.bottom;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3453);double destWidth = width, destHeight = height;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3454);lastWidth = width;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3455);lastHeight = height;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3456);lastSourceWidth = image.getWidth();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3457);lastSourceHeight = image.getHeight();

        __CLR4_5_22j92j9lx1h07wu.R.inc(3458);double heightRatio = lastSourceHeight / destHeight;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3459);double widthRatio = lastSourceWidth / destWidth;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3460);if ((((heightRatio > widthRatio)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3461)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3462)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3463);double aspectRatio = lastSourceWidth / lastSourceHeight;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3464);scaledHeight = (int) destHeight;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3465);scaledWidth = (int) (scaledHeight * aspectRatio);
        }
        }else {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3466);double aspectRatio = lastSourceHeight / lastSourceWidth;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3467);scaledWidth = (int) destWidth;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3468);scaledHeight = (int) (scaledWidth * aspectRatio);
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3469);imageX = ins.left + (width / 2) - (scaledWidth / 2);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3470);imageY = ins.top + (height / 2) - (scaledHeight / 2);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3471);scaleRatioX = lastSourceWidth / (double) scaledWidth;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3472);scaleRatioY = lastSourceHeight / (double) scaledHeight;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3473);lastUnitsPerPixel = camera.getUnitsPerPixel();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3474);scaledUnitsPerPixelX = lastUnitsPerPixel.getX() * scaleRatioX;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3475);scaledUnitsPerPixelY = lastUnitsPerPixel.getY() * scaleRatioY;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3476);if ((((selectionEnabled && selection != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3477)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3478)==0&false))) {{
            // setSelection() handles updating the scaled rectangle
            __CLR4_5_22j92j9lx1h07wu.R.inc(3479);setSelection(selection);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    @Override
    protected synchronized void paintComponent(Graphics g) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3480);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3481);super.paintComponent(g);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3482);BufferedImage image = lastFrame;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3483);Insets ins = getInsets();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3484);int width = getWidth() - ins.left - ins.right;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3485);int height = getHeight() - ins.top - ins.bottom;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3486);Graphics2D g2d = (Graphics2D) g;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3487);g.setColor(getBackground());
        __CLR4_5_22j92j9lx1h07wu.R.inc(3488);g2d.fillRect(ins.left, ins.top, width, height);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3489);if ((((image != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3490)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3491)==0&false))) {{
            // Only render if there is a valid image.
            __CLR4_5_22j92j9lx1h07wu.R.inc(3492);g2d.drawImage(lastFrame, imageX, imageY, scaledWidth, scaledHeight, null);

            __CLR4_5_22j92j9lx1h07wu.R.inc(3493);double c = camera.getLocation().getRotation();

            __CLR4_5_22j92j9lx1h07wu.R.inc(3494);for (Reticle reticle : reticles.values()) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3495);reticle.draw(g2d, camera.getUnitsPerPixel().getUnits(), scaledUnitsPerPixelX,
                        scaledUnitsPerPixelY, ins.left + (width / 2), ins.top + (height / 2),
                        scaledWidth, scaledHeight, c);
            }

            }__CLR4_5_22j92j9lx1h07wu.R.inc(3496);if ((((text != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3497)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3498)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3499);drawTextOverlay(g2d, 10, 10, text);
            }
            
            }__CLR4_5_22j92j9lx1h07wu.R.inc(3500);if ((((showName)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3501)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3502)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3503);Dimension dim = measureTextOverlay(g2d, camera.getName());
                __CLR4_5_22j92j9lx1h07wu.R.inc(3504);drawTextOverlay(g2d, 10, height - dim.height - 10, camera.getName());
            }

            }__CLR4_5_22j92j9lx1h07wu.R.inc(3505);if ((((showImageInfo && text == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3506)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3507)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3508);drawImageInfo(g2d, 10, 10, image);
            }

            }__CLR4_5_22j92j9lx1h07wu.R.inc(3509);if ((((selectionEnabled && selection != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3510)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3511)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3512);paintSelection(g2d);
            }
        }}
        }else {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3513);g.setColor(Color.red);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3514);g.drawLine(ins.left, ins.top, ins.right, ins.bottom);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3515);g.drawLine(ins.right, ins.top, ins.left, ins.bottom);
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3516);if ((((flashStartTimeMs > 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3517)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3518)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3519);long timeLeft = flashLengthMs - (System.currentTimeMillis() - flashStartTimeMs);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3520);float alpha = (1f / flashLengthMs) * timeLeft;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3521);alpha = Math.min(alpha, 1);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3522);alpha = Math.max(alpha, 0);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3523);g2d.setColor(new Color(1f, 1f, 1f, alpha));
            __CLR4_5_22j92j9lx1h07wu.R.inc(3524);g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private void paintSelection(Graphics2D g2d) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3525);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3526);int rx = selectionScaled.x;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3527);int ry = selectionScaled.y;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3528);int rw = selectionScaled.width;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3529);int rh = selectionScaled.height;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3530);int rx2 = rx + rw;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3531);int ry2 = ry + rh;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3532);int rxc = rx + rw / 2;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3533);int ryc = ry + rh / 2;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3534);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Draw the dashed rectangle, black background, white dashes
        __CLR4_5_22j92j9lx1h07wu.R.inc(3535);g2d.setColor(Color.black);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3536);g2d.setStroke(new BasicStroke(1f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3537);g2d.drawRect(rx, ry, rw, rh);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3538);g2d.setColor(Color.white);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3539);g2d.setStroke(new BasicStroke(1f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
                selectionDashProfile, selectionDashPhase));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3540);g2d.drawRect(rx, ry, rw, rh);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3541);if ((((selectionMode != SelectionMode.Creating)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3542)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3543)==0&false))) {{
            // If we're not drawing a whole new rectangle, draw the
            // handles for the existing one.
            __CLR4_5_22j92j9lx1h07wu.R.inc(3544);drawHandle(g2d, rx, ry);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3545);drawHandle(g2d, rx2, ry);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3546);drawHandle(g2d, rx, ry2);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3547);drawHandle(g2d, rx2, ry2);

            __CLR4_5_22j92j9lx1h07wu.R.inc(3548);drawHandle(g2d, rxc, ry);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3549);drawHandle(g2d, rx2, ryc);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3550);drawHandle(g2d, rxc, ry2);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3551);drawHandle(g2d, rx, ryc);
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3552);if ((((selectionTextDelegate != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3553)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3554)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3555);String text = selectionTextDelegate.getSelectionText(this);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3556);if ((((text != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3557)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3558)==0&false))) {{
                // TODO: Be awesome like Apple and move the overlay inside
                // the rect if it goes past the edge of the window
                __CLR4_5_22j92j9lx1h07wu.R.inc(3559);drawTextOverlay(g2d, (int) (rx + rw + 6), (int) (ry + rh + 6), text);
            }
        }}

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3560);if ((((selectionFlashOpacity > 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3561)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3562)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3563);g2d.setColor(new Color(1.0f, 1.0f, 1.0f, selectionFlashOpacity));
            __CLR4_5_22j92j9lx1h07wu.R.inc(3564);g2d.fillRect(rx, ry, rw, rh);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Draws a standard handle centered on the given x and y position.
     * 
     * @param g2d
     * @param x
     * @param y
     */
    private static void drawHandle(Graphics2D g2d, int x, int y) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3565);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3566);g2d.setStroke(new BasicStroke(1f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3567);g2d.setColor(new Color(153, 153, 187));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3568);g2d.fillArc(x - HANDLE_DIAMETER / 2, y - HANDLE_DIAMETER / 2, HANDLE_DIAMETER,
                HANDLE_DIAMETER, 0, 360);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3569);g2d.setColor(Color.white);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3570);g2d.drawArc(x - HANDLE_DIAMETER / 2, y - HANDLE_DIAMETER / 2, HANDLE_DIAMETER,
                HANDLE_DIAMETER, 0, 360);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Gets the HandlePosition, if any, at the given x and y. Returns null if there is not a handle
     * at that position.
     * 
     * @param x
     * @param y
     * @return
     */
    private HandlePosition getSelectionHandleAtPosition(int x, int y) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3571);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3572);if ((((selection == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3573)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3574)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3575);return null;
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3576);int rx = selectionScaled.x;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3577);int ry = selectionScaled.y;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3578);int rw = selectionScaled.width;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3579);int rh = selectionScaled.height;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3580);int rx2 = rx + rw;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3581);int ry2 = ry + rh;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3582);int rxc = rx + rw / 2;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3583);int ryc = ry + rh / 2;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3584);if ((((isWithinHandle(x, y, rx, ry))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3585)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3586)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3587);return HandlePosition.NW;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3588);if ((((isWithinHandle(x, y, rx2, ry))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3589)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3590)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3591);return HandlePosition.NE;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3592);if ((((isWithinHandle(x, y, rx, ry2))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3593)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3594)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3595);return HandlePosition.SW;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3596);if ((((isWithinHandle(x, y, rx2, ry2))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3597)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3598)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3599);return HandlePosition.SE;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3600);if ((((isWithinHandle(x, y, rxc, ry))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3601)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3602)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3603);return HandlePosition.N;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3604);if ((((isWithinHandle(x, y, rx2, ryc))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3605)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3606)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3607);return HandlePosition.E;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3608);if ((((isWithinHandle(x, y, rxc, ry2))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3609)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3610)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3611);return HandlePosition.S;
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3612);if ((((isWithinHandle(x, y, rx, ryc))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3613)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3614)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3615);return HandlePosition.W;
        }
        }}}}}}}}__CLR4_5_22j92j9lx1h07wu.R.inc(3616);return null;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * A specialization of isWithin() that uses uses the bounding box of a handle.
     * 
     * @param x
     * @param y
     * @param handleX
     * @param handleY
     * @return
     */
    private static boolean isWithinHandle(int x, int y, int handleX, int handleY) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3617);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3618);return isWithin(x, y, handleX - 4, handleY - 4, 8, 8);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private static boolean isWithin(int pointX, int pointY, int boundsX, int boundsY,
            int boundsWidth, int boundsHeight) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3619);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3620);return pointX >= boundsX && pointX <= (boundsX + boundsWidth) && pointY >= boundsY
                && pointY <= (boundsY + boundsHeight);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private static Rectangle normalizeRectangle(Rectangle r) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3621);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3622);return normalizeRectangle(r.x, r.y, r.width, r.height);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Builds a rectangle with the given parameters. If the width or height is negative the
     * corresponding x or y value is modified and the width or height is made positive.
     * 
     * @param x
     * @param y
     * @param width
     * @param height
     * @return
     */
    private static Rectangle normalizeRectangle(int x, int y, int width, int height) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3623);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3624);if ((((width < 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3625)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3626)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3627);width *= -1;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3628);x -= width;
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3629);if ((((height < 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3630)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3631)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3632);height *= -1;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3633);y -= height;
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3634);return new Rectangle(x, y, width, height);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Draws text in a nice bubble at the given position. Newline characters in the text cause line
     * breaks.
     * 
     * @param g2d
     * @param topLeftX
     * @param topLeftY
     * @param text
     */
    private static void drawTextOverlay(Graphics2D g2d, int topLeftX, int topLeftY, String text) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3635);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3636);Insets insets = new Insets(10, 10, 10, 10);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3637);int interLineSpacing = 4;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3638);int cornerRadius = 8;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3639);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3640);g2d.setStroke(new BasicStroke(1.0f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3641);g2d.setFont(g2d.getFont().deriveFont(12.0f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3642);String[] lines = text.split("\n");
        __CLR4_5_22j92j9lx1h07wu.R.inc(3643);List<TextLayout> textLayouts = new ArrayList<>();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3644);int textWidth = 0, textHeight = 0;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3645);for (String line : lines) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3646);TextLayout textLayout = new TextLayout(line, g2d.getFont(), g2d.getFontRenderContext());
            __CLR4_5_22j92j9lx1h07wu.R.inc(3647);textWidth = (int) Math.max(textWidth, textLayout.getBounds().getWidth());
            __CLR4_5_22j92j9lx1h07wu.R.inc(3648);textHeight += (int) textLayout.getBounds().getHeight() + interLineSpacing;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3649);textLayouts.add(textLayout);
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3650);textHeight -= interLineSpacing;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3651);g2d.setColor(new Color(0, 0, 0, 0.75f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3652);g2d.fillRoundRect(topLeftX, topLeftY, textWidth + insets.left + insets.right,
                textHeight + insets.top + insets.bottom, cornerRadius, cornerRadius);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3653);g2d.setColor(Color.white);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3654);g2d.drawRoundRect(topLeftX, topLeftY, textWidth + insets.left + insets.right,
                textHeight + insets.top + insets.bottom, cornerRadius, cornerRadius);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3655);int yPen = topLeftY + insets.top;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3656);for (TextLayout textLayout : textLayouts) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3657);yPen += textLayout.getBounds().getHeight();
            __CLR4_5_22j92j9lx1h07wu.R.inc(3658);textLayout.draw(g2d, topLeftX + insets.left, yPen);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3659);yPen += interLineSpacing;
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
    
    private static Dimension measureTextOverlay(Graphics2D g2d, String text) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3660);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3661);Insets insets = new Insets(10, 10, 10, 10);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3662);int interLineSpacing = 4;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3663);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3664);g2d.setStroke(new BasicStroke(1.0f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3665);g2d.setFont(g2d.getFont().deriveFont(12.0f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3666);String[] lines = text.split("\n");
        __CLR4_5_22j92j9lx1h07wu.R.inc(3667);List<TextLayout> textLayouts = new ArrayList<>();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3668);int textWidth = 0, textHeight = 0;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3669);for (String line : lines) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3670);TextLayout textLayout = new TextLayout(line, g2d.getFont(), g2d.getFontRenderContext());
            __CLR4_5_22j92j9lx1h07wu.R.inc(3671);textWidth = (int) Math.max(textWidth, textLayout.getBounds().getWidth());
            __CLR4_5_22j92j9lx1h07wu.R.inc(3672);textHeight += (int) textLayout.getBounds().getHeight() + interLineSpacing;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3673);textLayouts.add(textLayout);
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3674);textHeight -= interLineSpacing;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3675);return new Dimension(textWidth + insets.left + insets.right, textHeight + insets.top + insets.bottom);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private static void drawImageInfo(Graphics2D g2d, int topLeftX, int topLeftY,
            BufferedImage image) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3676);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3677);if ((((image == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3678)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3679)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3680);return;
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3681);String text = String.format("Resolution: %d x %d\nHistogram:", image.getWidth(),
                image.getHeight());
        __CLR4_5_22j92j9lx1h07wu.R.inc(3682);Insets insets = new Insets(10, 10, 10, 10);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3683);int interLineSpacing = 4;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3684);int cornerRadius = 8;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3685);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3686);g2d.setStroke(new BasicStroke(1.0f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3687);g2d.setFont(g2d.getFont().deriveFont(12.0f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3688);String[] lines = text.split("\n");
        __CLR4_5_22j92j9lx1h07wu.R.inc(3689);List<TextLayout> textLayouts = new ArrayList<>();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3690);int textWidth = 0, textHeight = 0;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3691);for (String line : lines) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3692);TextLayout textLayout = new TextLayout(line, g2d.getFont(), g2d.getFontRenderContext());
            __CLR4_5_22j92j9lx1h07wu.R.inc(3693);textWidth = (int) Math.max(textWidth, textLayout.getBounds().getWidth());
            __CLR4_5_22j92j9lx1h07wu.R.inc(3694);textHeight += (int) textLayout.getBounds().getHeight() + interLineSpacing;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3695);textLayouts.add(textLayout);
        }
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3696);textHeight -= interLineSpacing;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3697);int histogramHeight = 50 + 2;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3698);int histogramWidth = 255 + 2;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3699);int width = Math.max(textWidth, histogramWidth);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3700);int height = textHeight + histogramHeight;

        __CLR4_5_22j92j9lx1h07wu.R.inc(3701);g2d.setColor(new Color(0, 0, 0, 0.75f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3702);g2d.fillRoundRect(topLeftX, topLeftY, width + insets.left + insets.right,
                height + insets.top + insets.bottom, cornerRadius, cornerRadius);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3703);g2d.setColor(Color.white);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3704);g2d.drawRoundRect(topLeftX, topLeftY, width + insets.left + insets.right,
                height + insets.top + insets.bottom, cornerRadius, cornerRadius);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3705);int yPen = topLeftY + insets.top;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3706);for (TextLayout textLayout : textLayouts) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3707);yPen += textLayout.getBounds().getHeight();
            __CLR4_5_22j92j9lx1h07wu.R.inc(3708);textLayout.draw(g2d, topLeftX + insets.left, yPen);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3709);yPen += interLineSpacing;
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3710);g2d.setColor(new Color(1, 1, 1, 0.20f));
        __CLR4_5_22j92j9lx1h07wu.R.inc(3711);g2d.fillRect(topLeftX + insets.left, yPen, histogramWidth, histogramHeight);

        // Calculate the histogram
        __CLR4_5_22j92j9lx1h07wu.R.inc(3712);long[][] histogram = new long[3][256];
        __CLR4_5_22j92j9lx1h07wu.R.inc(3713);for (int y = 0; (((y < image.getHeight())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3714)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3715)==0&false)); y++) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3716);for (int x = 0; (((x < image.getWidth())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3717)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3718)==0&false)); x++) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3719);int rgb = image.getRGB(x, y);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3720);int r = (rgb >> 16) & 0xff;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3721);int g = (rgb >> 8) & 0xff;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3722);int b = (rgb >> 0) & 0xff;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3723);histogram[0][r]++;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3724);histogram[1][g]++;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3725);histogram[2][b]++;
            }
        }}
        // find the highest value in the histogram
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3726);long maxVal = 0;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3727);for (int channel = 0; (((channel < 3)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3728)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3729)==0&false)); channel++) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3730);for (int bucket = 0; (((bucket < 256)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3731)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3732)==0&false)); bucket++) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3733);maxVal = Math.max(maxVal, histogram[channel][bucket]);
            }
        }}
        // and scale it to 50 pixels tall
        }__CLR4_5_22j92j9lx1h07wu.R.inc(3734);double scale = 50.0 / maxVal;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3735);Color[] colors = new Color[] {Color.red, Color.green, Color.blue};
        __CLR4_5_22j92j9lx1h07wu.R.inc(3736);for (int channel = 0; (((channel < 3)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3737)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3738)==0&false)); channel++) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3739);g2d.setColor(colors[channel]);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3740);for (int bucket = 0; (((bucket < 256)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3741)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3742)==0&false)); bucket++) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3743);int value = (int) (histogram[channel][bucket] * scale);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3744);g2d.drawLine(topLeftX + insets.left + 1 + bucket, yPen + 1 + 50 - value,
                        topLeftX + insets.left + 1 + bucket, yPen + 1 + 50 - value);
            }
        }}
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Changes the HandlePosition to it's inverse if the given rectangle has a negative width,
     * height or both.
     * 
     * @param r
     */
    private static HandlePosition getOpposingHandle(Rectangle r, HandlePosition handlePosition) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3745);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3746);if ((((r.getWidth() < 0 && r.getHeight() < 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3747)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3748)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3749);if ((((handlePosition == HandlePosition.NW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3750)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3751)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3752);return HandlePosition.SE;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3753);if ((((handlePosition == HandlePosition.NE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3754)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3755)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3756);return HandlePosition.SW;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3757);if ((((handlePosition == HandlePosition.SE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3758)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3759)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3760);return HandlePosition.NW;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3761);if ((((handlePosition == HandlePosition.SW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3762)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3763)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3764);return HandlePosition.NE;
            }
        }}}}}
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3765);if ((((r.getWidth() < 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3766)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3767)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3768);if ((((handlePosition == HandlePosition.NW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3769)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3770)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3771);return HandlePosition.NE;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3772);if ((((handlePosition == HandlePosition.NE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3773)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3774)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3775);return HandlePosition.NW;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3776);if ((((handlePosition == HandlePosition.SE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3777)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3778)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3779);return HandlePosition.SW;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3780);if ((((handlePosition == HandlePosition.SW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3781)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3782)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3783);return HandlePosition.SE;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3784);if ((((handlePosition == HandlePosition.E)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3785)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3786)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3787);return HandlePosition.W;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3788);if ((((handlePosition == HandlePosition.W)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3789)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3790)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3791);return HandlePosition.E;
            }
        }}}}}}}
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3792);if ((((r.getHeight() < 0)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3793)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3794)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3795);if ((((handlePosition == HandlePosition.SW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3796)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3797)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3798);return HandlePosition.NW;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3799);if ((((handlePosition == HandlePosition.SE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3800)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3801)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3802);return HandlePosition.NE;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3803);if ((((handlePosition == HandlePosition.NW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3804)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3805)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3806);return HandlePosition.SW;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3807);if ((((handlePosition == HandlePosition.NE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3808)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3809)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3810);return HandlePosition.SE;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3811);if ((((handlePosition == HandlePosition.S)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3812)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3813)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3814);return HandlePosition.N;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3815);if ((((handlePosition == HandlePosition.N)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3816)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3817)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3818);return HandlePosition.S;
            }
        }}}}}}}
        }}}__CLR4_5_22j92j9lx1h07wu.R.inc(3819);return handlePosition;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Set the selection rectangle in image coordinates.
     * 
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public void setSelection(int x, int y, int width, int height) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3820);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3821);setSelection(new Rectangle(x, y, width, height));
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Set the selection rectangle in image coordinates.
     * 
     * @param r
     */
    public void setSelection(Rectangle r) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3822);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3823);if ((((r == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3824)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3825)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3826);selection = null;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3827);selectionMode = null;
        }
        }else {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3828);selectionActiveHandle = getOpposingHandle(r, selectionActiveHandle);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3829);selection = normalizeRectangle(r);

            __CLR4_5_22j92j9lx1h07wu.R.inc(3830);int rx = (int) (imageX + selection.x / scaleRatioX);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3831);int ry = (int) (imageY + selection.y / scaleRatioY);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3832);int rw = (int) (selection.width / scaleRatioX);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3833);int rh = (int) (selection.height / scaleRatioY);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3834);selectionScaled = new Rectangle(rx, ry, rw, rh);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Set the selection rectangle in component coordinates. Updates the selection property with the
     * properly scaled coordinates.
     * 
     * @param x
     * @param y
     * @param width
     * @param height
     */
    private void setScaledSelection(int x, int y, int width, int height) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3835);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3836);selectionScaled = new Rectangle(x, y, width, height);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3837);selectionActiveHandle = getOpposingHandle(selectionScaled, selectionActiveHandle);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3838);selectionScaled = normalizeRectangle(selectionScaled);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3839);int rx = (int) ((x - imageX) * scaleRatioX);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3840);int ry = (int) ((y - imageY) * scaleRatioY);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3841);int rw = (int) (width * scaleRatioX);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3842);int rh = (int) (height * scaleRatioY);

        __CLR4_5_22j92j9lx1h07wu.R.inc(3843);selection = new Rectangle(rx, ry, rw, rh);
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public boolean isSelectionEnabled() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3844);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3845);return selectionEnabled;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setSelectionEnabled(boolean selectionEnabled) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3846);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3847);this.selectionEnabled = selectionEnabled;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public boolean isShowImageInfo() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3848);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3849);return showImageInfo;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public void setShowImageInfo(boolean showImageInfo) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3850);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3851);this.showImageInfo = showImageInfo;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    public static Cursor getCursorForHandlePosition(HandlePosition handlePosition) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3852);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_22j92j9lx1h07wu.R.inc(3853);switch (handlePosition) {
            case NW:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3854);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3855);return Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR);
            case N:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3856);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3857);return Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR);
            case NE:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3858);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3859);return Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR);
            case E:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3860);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3861);return Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR);
            case SE:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3862);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3863);return Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR);
            case S:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3864);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3865);return Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR);
            case SW:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3866);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3867);return Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR);
            case W:if (!__CLB4_5_2_bool0) {__CLR4_5_22j92j9lx1h07wu.R.inc(3868);__CLB4_5_2_bool0=true;}
                __CLR4_5_22j92j9lx1h07wu.R.inc(3869);return Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR);
        }
        __CLR4_5_22j92j9lx1h07wu.R.inc(3870);return null;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Updates the Cursor to reflect the current state of the component.
     */
    private void updateCursor() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3871);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3872);if ((((selectionEnabled)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3873)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3874)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3875);if ((((selectionMode == SelectionMode.Moving)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3876)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3877)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3878);setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3879);if ((((selectionMode == SelectionMode.Resizing)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3880)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3881)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3882);setCursor(getCursorForHandlePosition(selectionActiveHandle));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3883);if ((((selectionMode == null && selection != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3884)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3885)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3886);int x = getMousePosition().x;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3887);int y = getMousePosition().y;

                __CLR4_5_22j92j9lx1h07wu.R.inc(3888);HandlePosition handlePosition = getSelectionHandleAtPosition(x, y);
                __CLR4_5_22j92j9lx1h07wu.R.inc(3889);if ((((handlePosition != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3890)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3891)==0&false))) {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3892);setCursor(getCursorForHandlePosition(handlePosition));
                }
                }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3893);if ((((selectionScaled.contains(x, y))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3894)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3895)==0&false))) {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3896);setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                }
                }else {{
                    __CLR4_5_22j92j9lx1h07wu.R.inc(3897);setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
                }
            }}}
            }else {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3898);setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }}}}
        }else {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3899);setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    /**
     * Capture the current image (unscaled, unmodified) and write it to disk.
     */
    private void captureSnapshot() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3900);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3901);try {
            __CLR4_5_22j92j9lx1h07wu.R.inc(3902);flash();
            __CLR4_5_22j92j9lx1h07wu.R.inc(3903);File dir = new File(Configuration.get().getConfigurationDirectory(), "snapshots");
            __CLR4_5_22j92j9lx1h07wu.R.inc(3904);dir.mkdirs();
            __CLR4_5_22j92j9lx1h07wu.R.inc(3905);DateFormat df = new SimpleDateFormat("YYYY-MM-dd_HH.mm.ss.SSS");
            __CLR4_5_22j92j9lx1h07wu.R.inc(3906);File file = new File(dir, camera.getName() + "_" + df.format(new Date()) + ".png");
            __CLR4_5_22j92j9lx1h07wu.R.inc(3907);ImageIO.write(lastFrame, "png", file);
        }
        catch (Exception e1) {
            __CLR4_5_22j92j9lx1h07wu.R.inc(3908);e1.printStackTrace();
        }
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private void fireActionEvent(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3909);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3910);if ((((actionListeners.isEmpty())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3911)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3912)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3913);return;
        }

        }__CLR4_5_22j92j9lx1h07wu.R.inc(3914);int x = e.getX();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3915);int y = e.getY();

        // Find the difference in X and Y from the center of the image
        // to the mouse click.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3916);double offsetX = (scaledWidth / 2.0D) - (x - imageX);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3917);double offsetY = (scaledHeight / 2.0D) - (y - imageY);

        // Invert the X so that the offsets represent a bottom left to
        // top right coordinate system.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3918);offsetX = -offsetX;

        // Scale the offsets by the units per pixel for the camera.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3919);offsetX *= scaledUnitsPerPixelX;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3920);offsetY *= scaledUnitsPerPixelY;

        // The offsets now represent the distance to move the camera
        // in the Camera's units per pixel's units.

        // Create a location in the Camera's units per pixel's units
        // and with the values of the offsets.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3921);Location offsets = camera.getUnitsPerPixel().derive(offsetX, offsetY, 0.0, 0.0);
        // Add the offsets to the Camera's position.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3922);Location location = camera.getLocation().add(offsets);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3923);CameraViewActionEvent action =
                new CameraViewActionEvent(CameraView.this, e.getX(), e.getY(),
                        e.getX() * scaledUnitsPerPixelX, e.getY() * scaledUnitsPerPixelY, location);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3924);for (CameraViewActionListener listener : new ArrayList<>(actionListeners)) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3925);listener.actionPerformed(action);
        }
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private void moveToClick(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3926);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3927);int x = e.getX();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3928);int y = e.getY();

        // Find the difference in X and Y from the center of the image
        // to the mouse click.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3929);double offsetX = (scaledWidth / 2.0D) - (x - imageX);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3930);double offsetY = (scaledHeight / 2.0D) - (y - imageY) + 1;

        // Invert the X so that the offsets represent a bottom left to
        // top right coordinate system.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3931);offsetX = -offsetX;

        // Scale the offsets by the units per pixel for the camera.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3932);offsetX *= scaledUnitsPerPixelX;
        __CLR4_5_22j92j9lx1h07wu.R.inc(3933);offsetY *= scaledUnitsPerPixelY;

        // The offsets now represent the distance to move the camera
        // in the Camera's units per pixel's units.

        // Create a location in the Camera's units per pixel's units
        // and with the values of the offsets.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3934);Location offsets = camera.getUnitsPerPixel().derive(offsetX, offsetY, 0.0, 0.0);
        // Add the offsets to the Camera's position.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3935);Location location = camera.getLocation().add(offsets);
        // And move there.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3936);UiUtils.submitUiMachineTask(() -> {
            __CLR4_5_22j92j9lx1h07wu.R.inc(3937);if ((((camera.getHead() == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3938)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3939)==0&false))) {{
                // move the nozzle to the camera
                __CLR4_5_22j92j9lx1h07wu.R.inc(3940);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();
                __CLR4_5_22j92j9lx1h07wu.R.inc(3941);MovableUtils.moveToLocationAtSafeZ(nozzle, location);
            }
            }else {{
                // move the camera to the location
                __CLR4_5_22j92j9lx1h07wu.R.inc(3942);MovableUtils.moveToLocationAtSafeZ(camera, location);
            }
        }});
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private void beginSelection(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3943);
        // If we're not doing anything currently, we can start
        // a new operation.
        __CLR4_5_22j92j9lx1h07wu.R.inc(3944);if ((((selectionMode == null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3945)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3946)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3947);int x = e.getX();
            __CLR4_5_22j92j9lx1h07wu.R.inc(3948);int y = e.getY();

            // See if there is a handle under the cursor.
            __CLR4_5_22j92j9lx1h07wu.R.inc(3949);HandlePosition handlePosition = getSelectionHandleAtPosition(x, y);
            __CLR4_5_22j92j9lx1h07wu.R.inc(3950);if ((((handlePosition != null)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3951)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3952)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3953);selectionMode = SelectionMode.Resizing;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3954);selectionActiveHandle = handlePosition;
            }
            // If not, perhaps they want to move the rectangle
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3955);if ((((selection != null && selectionScaled.contains(x, y))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3956)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3957)==0&false))) {{

                __CLR4_5_22j92j9lx1h07wu.R.inc(3958);selectionMode = SelectionMode.Moving;
                // Store the distance between the rectangle's origin and
                // where they started moving it from.
                __CLR4_5_22j92j9lx1h07wu.R.inc(3959);selectionStartX = x - selectionScaled.x;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3960);selectionStartY = y - selectionScaled.y;
            }
            // If not those, it's time to create a rectangle
            }else {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3961);selectionMode = SelectionMode.Creating;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3962);selectionStartX = x;
                __CLR4_5_22j92j9lx1h07wu.R.inc(3963);selectionStartY = y;
            }
        }}}
    }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private void continueSelection(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(3964);
        __CLR4_5_22j92j9lx1h07wu.R.inc(3965);int x = e.getX();
        __CLR4_5_22j92j9lx1h07wu.R.inc(3966);int y = e.getY();

        __CLR4_5_22j92j9lx1h07wu.R.inc(3967);if ((((selectionMode == SelectionMode.Resizing)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3968)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3969)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(3970);int rx = selectionScaled.x;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3971);int ry = selectionScaled.y;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3972);int rw = selectionScaled.width;
            __CLR4_5_22j92j9lx1h07wu.R.inc(3973);int rh = selectionScaled.height;

            __CLR4_5_22j92j9lx1h07wu.R.inc(3974);if ((((selectionActiveHandle == HandlePosition.NW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3975)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3976)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3977);setScaledSelection(x, y, (rw - (x - rx)), (rh - (y - ry)));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3978);if ((((selectionActiveHandle == HandlePosition.NE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3979)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3980)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3981);setScaledSelection(rx, y, x - rx, (rh - (y - ry)));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3982);if ((((selectionActiveHandle == HandlePosition.N)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3983)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3984)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3985);setScaledSelection(rx, y, rw, (rh - (y - ry)));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3986);if ((((selectionActiveHandle == HandlePosition.E)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3987)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3988)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3989);setScaledSelection(rx, ry, rw + (x - (rx + rw)), rh);
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3990);if ((((selectionActiveHandle == HandlePosition.SE)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3991)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3992)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3993);setScaledSelection(rx, ry, rw + (x - (rx + rw)), rh + (y - (ry + rh)));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3994);if ((((selectionActiveHandle == HandlePosition.S)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3995)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(3996)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(3997);setScaledSelection(rx, ry, rw, rh + (y - (ry + rh)));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(3998);if ((((selectionActiveHandle == HandlePosition.SW)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(3999)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4000)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4001);setScaledSelection(x, ry, (rw - (x - rx)), rh + (y - (ry + rh)));
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(4002);if ((((selectionActiveHandle == HandlePosition.W)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4003)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4004)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4005);setScaledSelection(x, ry, (rw - (x - rx)), rh);
            }
        }}}}}}}}}
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(4006);if ((((selectionMode == SelectionMode.Moving)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4007)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4008)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(4009);setScaledSelection(x - selectionStartX, y - selectionStartY, selectionScaled.width,
                    selectionScaled.height);
        }
        }else {__CLR4_5_22j92j9lx1h07wu.R.inc(4010);if ((((selectionMode == SelectionMode.Creating)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4011)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4012)==0&false))) {{
            __CLR4_5_22j92j9lx1h07wu.R.inc(4013);int sx = selectionStartX;
            __CLR4_5_22j92j9lx1h07wu.R.inc(4014);int sy = selectionStartY;
            __CLR4_5_22j92j9lx1h07wu.R.inc(4015);int w = x - sx;
            __CLR4_5_22j92j9lx1h07wu.R.inc(4016);int h = y - sy;
            __CLR4_5_22j92j9lx1h07wu.R.inc(4017);setScaledSelection(sx, sy, w, h);
        }
        }}}__CLR4_5_22j92j9lx1h07wu.R.inc(4018);updateCursor();
        __CLR4_5_22j92j9lx1h07wu.R.inc(4019);repaint();
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private void endSelection() {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4020);
        __CLR4_5_22j92j9lx1h07wu.R.inc(4021);selectionMode = null;
        __CLR4_5_22j92j9lx1h07wu.R.inc(4022);selectionActiveHandle = null;
    }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

    private MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4023);
            __CLR4_5_22j92j9lx1h07wu.R.inc(4024);if ((((e.isPopupTrigger() || e.isShiftDown() || SwingUtilities.isRightMouseButton(e))&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4025)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4026)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4027);return;
            }
            // double click captures an image from the camera and writes it to disk.
            }__CLR4_5_22j92j9lx1h07wu.R.inc(4028);if ((((e.getClickCount() == 2)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4029)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4030)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4031);captureSnapshot();
            }
            }else {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4032);fireActionEvent(e);
            }
        }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

        @Override
        public void mousePressed(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4033);
            __CLR4_5_22j92j9lx1h07wu.R.inc(4034);if ((((e.isPopupTrigger())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4035)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4036)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4037);popupMenu.show(e.getComponent(), e.getX(), e.getY());
                __CLR4_5_22j92j9lx1h07wu.R.inc(4038);return;
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(4039);if ((((e.isShiftDown())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4040)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4041)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4042);moveToClick(e);
            }
            }else {__CLR4_5_22j92j9lx1h07wu.R.inc(4043);if ((((selectionEnabled)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4044)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4045)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4046);beginSelection(e);
            }
        }}}}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

        @Override
        public void mouseReleased(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4047);
            __CLR4_5_22j92j9lx1h07wu.R.inc(4048);if ((((e.isPopupTrigger())&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4049)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4050)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4051);popupMenu.show(e.getComponent(), e.getX(), e.getY());
                __CLR4_5_22j92j9lx1h07wu.R.inc(4052);return;
            }
            }else {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4053);endSelection();
            }
        }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
    };

    private MouseMotionListener mouseMotionListener = new MouseMotionAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4054);
            __CLR4_5_22j92j9lx1h07wu.R.inc(4055);updateCursor();
        }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}

        @Override
        public void mouseDragged(MouseEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4056);
            __CLR4_5_22j92j9lx1h07wu.R.inc(4057);if ((((selectionEnabled)&&(__CLR4_5_22j92j9lx1h07wu.R.iget(4058)!=0|true))||(__CLR4_5_22j92j9lx1h07wu.R.iget(4059)==0&false))) {{
                __CLR4_5_22j92j9lx1h07wu.R.inc(4060);continueSelection(e);
            }
        }}finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
    };

    private ComponentListener componentListener = new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4061);
            __CLR4_5_22j92j9lx1h07wu.R.inc(4062);calculateScalingData();
        }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
    };

    public CameraViewSelectionTextDelegate pixelsAndUnitsTextSelectionDelegate =
            new CameraViewSelectionTextDelegate() {
                @Override
                public String getSelectionText(CameraView cameraView) {try{__CLR4_5_22j92j9lx1h07wu.R.inc(4063);
                    __CLR4_5_22j92j9lx1h07wu.R.inc(4064);double widthInUnits = selection.width * camera.getUnitsPerPixel().getX();
                    __CLR4_5_22j92j9lx1h07wu.R.inc(4065);double heightInUnits = selection.height * camera.getUnitsPerPixel().getY();

                    __CLR4_5_22j92j9lx1h07wu.R.inc(4066);String text = String.format(Locale.US, "%dpx, %dpx\n%2.3f%s, %2.3f%s",
                            (int) selection.getWidth(), (int) selection.getHeight(), widthInUnits,
                            camera.getUnitsPerPixel().getUnits().getShortName(), heightInUnits,
                            camera.getUnitsPerPixel().getUnits().getShortName());
                    __CLR4_5_22j92j9lx1h07wu.R.inc(4067);return text;
                }finally{__CLR4_5_22j92j9lx1h07wu.R.flushNeeded();}}
            };
}
