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

package org.openpnp.gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.prefs.Preferences;
import java.util.regex.PatternSyntaxException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.components.ClassSelectionDialog;
import org.openpnp.gui.support.HeadCellValue;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.support.WizardContainer;
import org.openpnp.gui.tablemodel.CamerasTableModel;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.vision.OpenCvVisionProvider;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Camera.Looking;
import org.openpnp.spi.Head;
import org.openpnp.spi.VisionProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class CamerasPanel extends JPanel implements WizardContainer {public static class __CLR4_5_25l5llx1h8cmu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(CamerasPanel.class);

    private static final String PREF_DIVIDER_POSITION = "CamerasPanel.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;

    private final Frame frame;
    private final Configuration configuration;

    private JTable table;

    private CamerasTableModel tableModel;
    private TableRowSorter<CamerasTableModel> tableSorter;
    private JTextField searchTextField;
    private JComboBox headsComboBox;

    private Preferences prefs = Preferences.userNodeForPackage(CamerasPanel.class);

    public CamerasPanel(Frame frame, Configuration configuration) {try{__CLR4_5_25l5llx1h8cmu.R.inc(201);
        __CLR4_5_25l5llx1h8cmu.R.inc(202);this.frame = frame;
        __CLR4_5_25l5llx1h8cmu.R.inc(203);this.configuration = configuration;

        __CLR4_5_25l5llx1h8cmu.R.inc(204);setLayout(new BorderLayout(0, 0));
        __CLR4_5_25l5llx1h8cmu.R.inc(205);tableModel = new CamerasTableModel(configuration);

        __CLR4_5_25l5llx1h8cmu.R.inc(206);JPanel panel = new JPanel();
        __CLR4_5_25l5llx1h8cmu.R.inc(207);add(panel, BorderLayout.NORTH);
        __CLR4_5_25l5llx1h8cmu.R.inc(208);panel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_25l5llx1h8cmu.R.inc(209);JToolBar toolBar = new JToolBar();
        __CLR4_5_25l5llx1h8cmu.R.inc(210);toolBar.setFloatable(false);
        __CLR4_5_25l5llx1h8cmu.R.inc(211);panel.add(toolBar, BorderLayout.CENTER);

        __CLR4_5_25l5llx1h8cmu.R.inc(212);JButton btnNewCamera = new JButton(newCameraAction);
        __CLR4_5_25l5llx1h8cmu.R.inc(213);btnNewCamera.setHideActionText(true);
        __CLR4_5_25l5llx1h8cmu.R.inc(214);toolBar.add(btnNewCamera);

        __CLR4_5_25l5llx1h8cmu.R.inc(215);JButton btnDeleteCamera = new JButton(deleteCameraAction);
        __CLR4_5_25l5llx1h8cmu.R.inc(216);btnDeleteCamera.setHideActionText(true);
        __CLR4_5_25l5llx1h8cmu.R.inc(217);toolBar.add(btnDeleteCamera);

        __CLR4_5_25l5llx1h8cmu.R.inc(218);JPanel panel_1 = new JPanel();
        __CLR4_5_25l5llx1h8cmu.R.inc(219);panel.add(panel_1, BorderLayout.EAST);

        __CLR4_5_25l5llx1h8cmu.R.inc(220);JLabel lblSearch = new JLabel("Search");
        __CLR4_5_25l5llx1h8cmu.R.inc(221);panel_1.add(lblSearch);

        __CLR4_5_25l5llx1h8cmu.R.inc(222);searchTextField = new JTextField();
        __CLR4_5_25l5llx1h8cmu.R.inc(223);searchTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {try{__CLR4_5_25l5llx1h8cmu.R.inc(224);
                __CLR4_5_25l5llx1h8cmu.R.inc(225);search();
            }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

            @Override
            public void insertUpdate(DocumentEvent e) {try{__CLR4_5_25l5llx1h8cmu.R.inc(226);
                __CLR4_5_25l5llx1h8cmu.R.inc(227);search();
            }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

            @Override
            public void changedUpdate(DocumentEvent e) {try{__CLR4_5_25l5llx1h8cmu.R.inc(228);
                __CLR4_5_25l5llx1h8cmu.R.inc(229);search();
            }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}
        });
        __CLR4_5_25l5llx1h8cmu.R.inc(230);panel_1.add(searchTextField);
        __CLR4_5_25l5llx1h8cmu.R.inc(231);searchTextField.setColumns(15);

        __CLR4_5_25l5llx1h8cmu.R.inc(232);JComboBox lookingComboBox = new JComboBox(Looking.values());
        __CLR4_5_25l5llx1h8cmu.R.inc(233);headsComboBox = new JComboBox();

        __CLR4_5_25l5llx1h8cmu.R.inc(234);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_25l5llx1h8cmu.R.inc(235);tableSorter = new TableRowSorter<>(tableModel);
        __CLR4_5_25l5llx1h8cmu.R.inc(236);table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(lookingComboBox));
        __CLR4_5_25l5llx1h8cmu.R.inc(237);table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(headsComboBox));

        __CLR4_5_25l5llx1h8cmu.R.inc(238);final JSplitPane splitPane = new JSplitPane();
        __CLR4_5_25l5llx1h8cmu.R.inc(239);splitPane.setContinuousLayout(true);
        __CLR4_5_25l5llx1h8cmu.R.inc(240);splitPane
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_25l5llx1h8cmu.R.inc(241);splitPane.addPropertyChangeListener("dividerLocation", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_25l5llx1h8cmu.R.inc(242);
                __CLR4_5_25l5llx1h8cmu.R.inc(243);prefs.putInt(PREF_DIVIDER_POSITION, splitPane.getDividerLocation());
            }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}
        });



        __CLR4_5_25l5llx1h8cmu.R.inc(244);add(splitPane, BorderLayout.CENTER);
        __CLR4_5_25l5llx1h8cmu.R.inc(245);splitPane.setLeftComponent(new JScrollPane(table));
        __CLR4_5_25l5llx1h8cmu.R.inc(246);table.setRowSorter(tableSorter);
        __CLR4_5_25l5llx1h8cmu.R.inc(247);table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        __CLR4_5_25l5llx1h8cmu.R.inc(248);JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_25l5llx1h8cmu.R.inc(249);splitPane.setRightComponent(tabbedPane);

        __CLR4_5_25l5llx1h8cmu.R.inc(250);generalConfigPanel = new JPanel();
        __CLR4_5_25l5llx1h8cmu.R.inc(251);tabbedPane.addTab("General Configuration", null, generalConfigPanel, null);
        __CLR4_5_25l5llx1h8cmu.R.inc(252);generalConfigPanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_25l5llx1h8cmu.R.inc(253);cameraSpecificConfigPanel = new JPanel();
        __CLR4_5_25l5llx1h8cmu.R.inc(254);tabbedPane.addTab("Camera Specific", null, cameraSpecificConfigPanel, null);
        __CLR4_5_25l5llx1h8cmu.R.inc(255);cameraSpecificConfigPanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_25l5llx1h8cmu.R.inc(256);visionProviderConfigPanel = new JPanel();
        __CLR4_5_25l5llx1h8cmu.R.inc(257);tabbedPane.addTab("Vision Provider", null, visionProviderConfigPanel, null);
        __CLR4_5_25l5llx1h8cmu.R.inc(258);visionProviderConfigPanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_25l5llx1h8cmu.R.inc(259);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_25l5llx1h8cmu.R.inc(260);
                __CLR4_5_25l5llx1h8cmu.R.inc(261);if ((((e.getValueIsAdjusting())&&(__CLR4_5_25l5llx1h8cmu.R.iget(262)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(263)==0&false))) {{
                    __CLR4_5_25l5llx1h8cmu.R.inc(264);return;
                }
                }__CLR4_5_25l5llx1h8cmu.R.inc(265);int index = table.getSelectedRow();

                __CLR4_5_25l5llx1h8cmu.R.inc(266);generalConfigPanel.removeAll();
                __CLR4_5_25l5llx1h8cmu.R.inc(267);cameraSpecificConfigPanel.removeAll();
                __CLR4_5_25l5llx1h8cmu.R.inc(268);visionProviderConfigPanel.removeAll();

                __CLR4_5_25l5llx1h8cmu.R.inc(269);if ((((index != -1)&&(__CLR4_5_25l5llx1h8cmu.R.iget(270)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(271)==0&false))) {{
                    __CLR4_5_25l5llx1h8cmu.R.inc(272);index = table.convertRowIndexToModel(index);
                    __CLR4_5_25l5llx1h8cmu.R.inc(273);Camera camera = tableModel.getCamera(index);
                    __CLR4_5_25l5llx1h8cmu.R.inc(274);Wizard generalConfigWizard = new CameraConfigurationWizard(camera);
                    __CLR4_5_25l5llx1h8cmu.R.inc(275);if ((((generalConfigWizard != null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(276)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(277)==0&false))) {{
                        __CLR4_5_25l5llx1h8cmu.R.inc(278);generalConfigWizard.setWizardContainer(CamerasPanel.this);
                        __CLR4_5_25l5llx1h8cmu.R.inc(279);JPanel panel = generalConfigWizard.getWizardPanel();
                        __CLR4_5_25l5llx1h8cmu.R.inc(280);generalConfigPanel.add(panel);
                    }

                    }__CLR4_5_25l5llx1h8cmu.R.inc(281);Wizard cameraSpecificConfigWizard = camera.getConfigurationWizard();
                    __CLR4_5_25l5llx1h8cmu.R.inc(282);if ((((cameraSpecificConfigWizard != null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(283)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(284)==0&false))) {{
                        __CLR4_5_25l5llx1h8cmu.R.inc(285);cameraSpecificConfigWizard.setWizardContainer(CamerasPanel.this);
                        __CLR4_5_25l5llx1h8cmu.R.inc(286);JPanel panel = cameraSpecificConfigWizard.getWizardPanel();
                        __CLR4_5_25l5llx1h8cmu.R.inc(287);cameraSpecificConfigPanel.add(panel);
                    }

                    }__CLR4_5_25l5llx1h8cmu.R.inc(288);VisionProvider visionProvider = camera.getVisionProvider();
                    __CLR4_5_25l5llx1h8cmu.R.inc(289);if ((((visionProvider != null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(290)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(291)==0&false))) {{
                        __CLR4_5_25l5llx1h8cmu.R.inc(292);Wizard visionProviderConfigWizard = visionProvider.getConfigurationWizard();
                        __CLR4_5_25l5llx1h8cmu.R.inc(293);if ((((visionProviderConfigWizard != null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(294)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(295)==0&false))) {{
                            __CLR4_5_25l5llx1h8cmu.R.inc(296);visionProviderConfigWizard.setWizardContainer(CamerasPanel.this);
                            __CLR4_5_25l5llx1h8cmu.R.inc(297);JPanel panel = visionProviderConfigWizard.getWizardPanel();
                            __CLR4_5_25l5llx1h8cmu.R.inc(298);visionProviderConfigPanel.add(panel);
                        }
                    }}
                }}

                }__CLR4_5_25l5llx1h8cmu.R.inc(299);revalidate();
                __CLR4_5_25l5llx1h8cmu.R.inc(300);repaint();
            }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}
        });

        __CLR4_5_25l5llx1h8cmu.R.inc(301);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_25l5llx1h8cmu.R.inc(302);
                __CLR4_5_25l5llx1h8cmu.R.inc(303);headsComboBox.removeAllItems();
                __CLR4_5_25l5llx1h8cmu.R.inc(304);headsComboBox.addItem(new HeadCellValue((Head) null));
                __CLR4_5_25l5llx1h8cmu.R.inc(305);for (Head head : configuration.getMachine().getHeads()) {{
                    __CLR4_5_25l5llx1h8cmu.R.inc(306);headsComboBox.addItem(new HeadCellValue(head));
                }
            }}finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}
        });
    }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

    private Camera getSelectedCamera() {try{__CLR4_5_25l5llx1h8cmu.R.inc(307);
        __CLR4_5_25l5llx1h8cmu.R.inc(308);int index = table.getSelectedRow();

        __CLR4_5_25l5llx1h8cmu.R.inc(309);if ((((index == -1)&&(__CLR4_5_25l5llx1h8cmu.R.iget(310)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(311)==0&false))) {{
            __CLR4_5_25l5llx1h8cmu.R.inc(312);return null;
        }

        }__CLR4_5_25l5llx1h8cmu.R.inc(313);index = table.convertRowIndexToModel(index);
        __CLR4_5_25l5llx1h8cmu.R.inc(314);return tableModel.getCamera(index);
    }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

    private void search() {try{__CLR4_5_25l5llx1h8cmu.R.inc(315);
        __CLR4_5_25l5llx1h8cmu.R.inc(316);RowFilter<CamerasTableModel, Object> rf = null;
        // If current expression doesn't parse, don't update.
        __CLR4_5_25l5llx1h8cmu.R.inc(317);try {
            __CLR4_5_25l5llx1h8cmu.R.inc(318);rf = RowFilter.regexFilter("(?i)" + searchTextField.getText().trim());
        }
        catch (PatternSyntaxException e) {
            __CLR4_5_25l5llx1h8cmu.R.inc(319);logger.warn("Search failed", e);
            __CLR4_5_25l5llx1h8cmu.R.inc(320);return;
        }
        __CLR4_5_25l5llx1h8cmu.R.inc(321);tableSorter.setRowFilter(rf);
    }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

    @Override
    public void wizardCompleted(Wizard wizard) {try{__CLR4_5_25l5llx1h8cmu.R.inc(322);}finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

    @Override
    public void wizardCancelled(Wizard wizard) {try{__CLR4_5_25l5llx1h8cmu.R.inc(323);}finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

    public Action newCameraAction = new AbstractAction() {
        {try{__CLR4_5_25l5llx1h8cmu.R.inc(324);
            __CLR4_5_25l5llx1h8cmu.R.inc(325);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_25l5llx1h8cmu.R.inc(326);putValue(NAME, "New Camera...");
            __CLR4_5_25l5llx1h8cmu.R.inc(327);putValue(SHORT_DESCRIPTION, "Create a new camera.");
        }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_25l5llx1h8cmu.R.inc(328);
            __CLR4_5_25l5llx1h8cmu.R.inc(329);ClassSelectionDialog<Camera> dialog = new ClassSelectionDialog<>(
                    JOptionPane.getFrameForComponent(CamerasPanel.this), "Select Camera...",
                    "Please select a Camera implemention from the list below.",
                    configuration.getMachine().getCompatibleCameraClasses());
            __CLR4_5_25l5llx1h8cmu.R.inc(330);dialog.setVisible(true);
            __CLR4_5_25l5llx1h8cmu.R.inc(331);Class<? extends Camera> cameraClass = dialog.getSelectedClass();
            __CLR4_5_25l5llx1h8cmu.R.inc(332);if ((((cameraClass == null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(333)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(334)==0&false))) {{
                __CLR4_5_25l5llx1h8cmu.R.inc(335);return;
            }
            }__CLR4_5_25l5llx1h8cmu.R.inc(336);try {
                __CLR4_5_25l5llx1h8cmu.R.inc(337);Camera camera = cameraClass.newInstance();

                __CLR4_5_25l5llx1h8cmu.R.inc(338);camera.setUnitsPerPixel(new Location(Configuration.get().getSystemUnits()));
                __CLR4_5_25l5llx1h8cmu.R.inc(339);try {
                    __CLR4_5_25l5llx1h8cmu.R.inc(340);if ((((camera.getVisionProvider() == null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(341)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(342)==0&false))) {{
                        __CLR4_5_25l5llx1h8cmu.R.inc(343);camera.setVisionProvider(new OpenCvVisionProvider());
                    }
                }}
                catch (Exception e) {
                    __CLR4_5_25l5llx1h8cmu.R.inc(344);logger.debug("Couldn't set default vision provider. Meh.");
                }


                __CLR4_5_25l5llx1h8cmu.R.inc(345);configuration.getMachine().addCamera(camera);

                __CLR4_5_25l5llx1h8cmu.R.inc(346);MainFrame.cameraPanel.addCamera(camera);
                __CLR4_5_25l5llx1h8cmu.R.inc(347);tableModel.refresh();
                __CLR4_5_25l5llx1h8cmu.R.inc(348);Helpers.selectLastTableRow(table);
            }
            catch (Exception e) {
                __CLR4_5_25l5llx1h8cmu.R.inc(349);MessageBoxes.errorBox(JOptionPane.getFrameForComponent(CamerasPanel.this),
                        "Camera Error", e);
            }
        }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}
    };

    public Action deleteCameraAction = new AbstractAction("Delete Camera") {
        {try{__CLR4_5_25l5llx1h8cmu.R.inc(350);
            __CLR4_5_25l5llx1h8cmu.R.inc(351);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_25l5llx1h8cmu.R.inc(352);putValue(NAME, "Delete Camera");
            __CLR4_5_25l5llx1h8cmu.R.inc(353);putValue(SHORT_DESCRIPTION, "Delete the currently selected camera.");
        }finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_25l5llx1h8cmu.R.inc(354);
            __CLR4_5_25l5llx1h8cmu.R.inc(355);Camera camera = getSelectedCamera();
            __CLR4_5_25l5llx1h8cmu.R.inc(356);int ret = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "Are you sure you want to delete " + camera.getName() + "?",
                    "Delete " + camera.getName() + "?", JOptionPane.YES_NO_OPTION);
            __CLR4_5_25l5llx1h8cmu.R.inc(357);if ((((ret == JOptionPane.YES_OPTION)&&(__CLR4_5_25l5llx1h8cmu.R.iget(358)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(359)==0&false))) {{
                __CLR4_5_25l5llx1h8cmu.R.inc(360);if ((((camera.getHead() != null)&&(__CLR4_5_25l5llx1h8cmu.R.iget(361)!=0|true))||(__CLR4_5_25l5llx1h8cmu.R.iget(362)==0&false))) {{
                    __CLR4_5_25l5llx1h8cmu.R.inc(363);camera.getHead().removeCamera(camera);
                }
                }else {{
                    __CLR4_5_25l5llx1h8cmu.R.inc(364);configuration.getMachine().removeCamera(camera);
                }
                }__CLR4_5_25l5llx1h8cmu.R.inc(365);tableModel.refresh();
                __CLR4_5_25l5llx1h8cmu.R.inc(366);MessageBoxes.errorBox(getTopLevelAncestor(), "Restart Required", camera.getName()
                        + " has been removed. Please restart OpenPnP for the changes to take effect.");
            }
        }}finally{__CLR4_5_25l5llx1h8cmu.R.flushNeeded();}}
    };


    private JPanel generalConfigPanel;
    private JPanel cameraSpecificConfigPanel;
    private JPanel visionProviderConfigPanel;
}
