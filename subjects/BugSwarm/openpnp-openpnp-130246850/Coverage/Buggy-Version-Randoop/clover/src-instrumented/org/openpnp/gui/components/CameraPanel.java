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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.prefs.Preferences;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.CameraItem;
import org.openpnp.model.Configuration;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;

/**
 * Shows a square grid of cameras or a blown up image from a single camera.
 */
@SuppressWarnings("serial")
public class CameraPanel extends JPanel {public static class __CLR4_5_22fw2fwlx1h1r92{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,3285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static int maximumFps = 15;
    private static final String SHOW_NONE_ITEM = "Show None";
    private static final String SHOW_ALL_ITEM = "Show All";

    private Map<Camera, CameraView> cameraViews = new LinkedHashMap<>();

    private JComboBox camerasCombo;
    private JPanel camerasPanel;

    private CameraView selectedCameraView;


    private static final String PREF_SELECTED_CAMERA_VIEW = "JobPanel.dividerPosition";
    private Preferences prefs = Preferences.userNodeForPackage(CameraPanel.class);

    public CameraPanel() {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3164);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3165);createUi();
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3166);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3167);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3168);for (Head head : Configuration.get().getMachine().getHeads()) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3169);for (Camera camera : head.getCameras()) {{
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3170);addCamera(camera);
                    }
                }}
                }__CLR4_5_22fw2fwlx1h1r92.R.inc(3171);for (Camera camera : configuration.getMachine().getCameras()) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3172);addCamera(camera);
                }

                }__CLR4_5_22fw2fwlx1h1r92.R.inc(3173);String selectedCameraView = prefs.get(PREF_SELECTED_CAMERA_VIEW, null);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3174);if ((((selectedCameraView != null)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3175)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3176)==0&false))) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3177);for (int i = 0; (((i < camerasCombo.getItemCount())&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3178)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3179)==0&false)); i++) {{
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3180);Object o = camerasCombo.getItemAt(i);
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3181);if ((((o.toString().equals(selectedCameraView))&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3182)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3183)==0&false))) {{
                            __CLR4_5_22fw2fwlx1h1r92.R.inc(3184);camerasCombo.setSelectedItem(o);
                        }
                    }}
                }}
                }__CLR4_5_22fw2fwlx1h1r92.R.inc(3185);camerasCombo.addActionListener((event) -> {
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3186);try {
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3187);prefs.put(PREF_SELECTED_CAMERA_VIEW,
                                camerasCombo.getSelectedItem().toString());
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3188);prefs.flush();
                    }
                    catch (Exception e) {
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3189);e.printStackTrace();
                    }
                });
            }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}
        });
    }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}

    public void addCamera(Camera camera) {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3190);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3191);CameraView cameraView = new CameraView(maximumFps / Math.max(cameraViews.size(), 1));
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3192);cameraView.setCamera(camera);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3193);cameraViews.put(camera, cameraView);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3194);camerasCombo.addItem(new CameraItem(camera));
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3195);if ((((cameraViews.size() == 1)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3196)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3197)==0&false))) {{
            // First camera being added, so select it
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3198);camerasCombo.setSelectedIndex(1);
        }
        }else {__CLR4_5_22fw2fwlx1h1r92.R.inc(3199);if ((((cameraViews.size() == 2)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3200)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3201)==0&false))) {{
            // Otherwise this is the second camera so mix in the
            // show all item.
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3202);camerasCombo.insertItemAt(SHOW_ALL_ITEM, 1);
        }
    }}}finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}

    private void createUi() {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3203);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3204);camerasPanel = new JPanel();

        __CLR4_5_22fw2fwlx1h1r92.R.inc(3205);camerasCombo = new JComboBox();
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3206);camerasCombo.addActionListener(cameraSelectedAction);

        __CLR4_5_22fw2fwlx1h1r92.R.inc(3207);setLayout(new BorderLayout());

        __CLR4_5_22fw2fwlx1h1r92.R.inc(3208);camerasCombo.addItem(SHOW_NONE_ITEM);

        __CLR4_5_22fw2fwlx1h1r92.R.inc(3209);add(camerasCombo, BorderLayout.NORTH);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3210);add(camerasPanel);
    }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}

    /**
     * Make sure the given Camera is visible in the UI. If All Cameras is selected we do nothing,
     * otherwise we select the specified Camera.
     * 
     * @param camera
     * @return
     */
    public void ensureCameraVisible(Camera camera) {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3211);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3212);if ((((camerasCombo.getSelectedItem().equals(SHOW_ALL_ITEM))&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3213)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3214)==0&false))) {{
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3215);return;
        }
        }__CLR4_5_22fw2fwlx1h1r92.R.inc(3216);setSelectedCamera(camera);
    }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}

    public CameraView setSelectedCamera(Camera camera) {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3217);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3218);if ((((selectedCameraView != null && selectedCameraView.getCamera() == camera)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3219)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3220)==0&false))) {{
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3221);return selectedCameraView;
        }
        }__CLR4_5_22fw2fwlx1h1r92.R.inc(3222);for (int i = 0; (((i < camerasCombo.getItemCount())&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3223)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3224)==0&false)); i++) {{
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3225);Object o = camerasCombo.getItemAt(i);
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3226);if ((((o instanceof CameraItem)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3227)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3228)==0&false))) {{
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3229);Camera c = ((CameraItem) o).getCamera();
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3230);if ((((c == camera)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3231)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3232)==0&false))) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3233);camerasCombo.setSelectedIndex(i);
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3234);return selectedCameraView;
                }
            }}
        }}
        }__CLR4_5_22fw2fwlx1h1r92.R.inc(3235);return null;
    }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}

    public CameraView getCameraView(Camera camera) {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3236);
        __CLR4_5_22fw2fwlx1h1r92.R.inc(3237);return cameraViews.get(camera);
    }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}

    private AbstractAction cameraSelectedAction = new AbstractAction("") {
        @Override
        public void actionPerformed(ActionEvent ev) {try{__CLR4_5_22fw2fwlx1h1r92.R.inc(3238);
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3239);selectedCameraView = null;
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3240);camerasPanel.removeAll();
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3241);if ((((camerasCombo.getSelectedItem().equals(SHOW_NONE_ITEM))&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3242)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3243)==0&false))) {{
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3244);camerasPanel.setLayout(new BorderLayout());
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3245);JPanel panel = new JPanel();
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3246);panel.setBackground(Color.black);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3247);camerasPanel.add(panel);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3248);selectedCameraView = null;
            }
            }else {__CLR4_5_22fw2fwlx1h1r92.R.inc(3249);if ((((camerasCombo.getSelectedItem().equals(SHOW_ALL_ITEM))&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3250)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3251)==0&false))) {{
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3252);int columns = (int) Math.ceil(Math.sqrt(cameraViews.size()));
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3253);if ((((columns == 0)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3254)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3255)==0&false))) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3256);columns = 1;
                }
                }__CLR4_5_22fw2fwlx1h1r92.R.inc(3257);camerasPanel.setLayout(new GridLayout(0, columns, 1, 1));
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3258);for (CameraView cameraView : cameraViews.values()) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3259);cameraView.setMaximumFps(maximumFps / Math.max(cameraViews.size(), 1));
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3260);cameraView.setShowName(true);
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3261);camerasPanel.add(cameraView);
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3262);if ((((cameraViews.size() == 1)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3263)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3264)==0&false))) {{
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3265);selectedCameraView = cameraView;
                    }
                }}
                }__CLR4_5_22fw2fwlx1h1r92.R.inc(3266);if ((((cameraViews.size() > 2)&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3267)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3268)==0&false))) {{
                    __CLR4_5_22fw2fwlx1h1r92.R.inc(3269);for (int i = 0; (((i < (columns * columns) - cameraViews.size())&&(__CLR4_5_22fw2fwlx1h1r92.R.iget(3270)!=0|true))||(__CLR4_5_22fw2fwlx1h1r92.R.iget(3271)==0&false)); i++) {{
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3272);JPanel panel = new JPanel();
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3273);panel.setBackground(Color.black);
                        __CLR4_5_22fw2fwlx1h1r92.R.inc(3274);camerasPanel.add(panel);
                    }
                }}
                }__CLR4_5_22fw2fwlx1h1r92.R.inc(3275);selectedCameraView = null;
            }
            }else {{
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3276);camerasPanel.setLayout(new BorderLayout());
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3277);Camera camera = ((CameraItem) camerasCombo.getSelectedItem()).getCamera();
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3278);CameraView cameraView = getCameraView(camera);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3279);cameraView.setMaximumFps(maximumFps);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3280);cameraView.setShowName(false);
                __CLR4_5_22fw2fwlx1h1r92.R.inc(3281);camerasPanel.add(cameraView);

                __CLR4_5_22fw2fwlx1h1r92.R.inc(3282);selectedCameraView = cameraView;
            }
            }}__CLR4_5_22fw2fwlx1h1r92.R.inc(3283);revalidate();
            __CLR4_5_22fw2fwlx1h1r92.R.inc(3284);repaint();
        }finally{__CLR4_5_22fw2fwlx1h1r92.R.flushNeeded();}}
    };
}
