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

package org.openpnp.machine.reference.wizards;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.ConfigurationListener;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.machine.reference.ReferenceNozzleTip;
import org.openpnp.model.Configuration;
import org.openpnp.util.UiUtils;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.ui.CvPipelineEditor;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@java.lang.SuppressWarnings({"fallthrough"}) public class ReferenceNozzleTipConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2bmfbmflx1h5q4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,15232,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceNozzleTip nozzleTip;
    private JPanel panelChanger;
    private JLabel lblX_1;
    private JLabel lblY_1;
    private JLabel lblZ_1;
    private LocationButtonsPanel changerStartLocationButtonsPanel;
    private JLabel lblStartLocation;
    private JTextField textFieldChangerStartX;
    private JTextField textFieldChangerStartY;
    private JTextField textFieldChangerStartZ;
    private JLabel lblMiddleLocation;
    private JTextField textFieldChangerMidX;
    private JTextField textFieldChangerMidY;
    private JTextField textFieldChangerMidZ;
    private JLabel lblEndLocation;
    private JTextField textFieldChangerEndX;
    private JTextField textFieldChangerEndY;
    private JTextField textFieldChangerEndZ;
    private LocationButtonsPanel changerMidLocationButtonsPanel;
    private LocationButtonsPanel changerEndLocationButtonsPanel;
    private JPanel panelPackageCompat;
    private JCheckBox chckbxAllowIncompatiblePackages;
    private JScrollPane scrollPane;
    private JTable table;
    private PackagesTableModel tableModel;

    private Set<org.openpnp.model.Package> compatiblePackages = new HashSet<>();
    private JPanel panelCalibration;
    private JButton btnEditPipeline;
    private JButton btnCalibrate;

    public ReferenceNozzleTipConfigurationWizard(ReferenceNozzleTip nozzleTip) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15063);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15064);this.nozzleTip = nozzleTip;

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15065);panelPackageCompat = new JPanel();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15066);panelPackageCompat.setBorder(new TitledBorder(null, "Package Compatibility",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15067);contentPanel.add(panelPackageCompat);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15068);panelPackageCompat.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC,
                        ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("max(100dlu;min)"),}));

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15069);chckbxAllowIncompatiblePackages = new JCheckBox("Allow Incompatible Packages?");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15070);panelPackageCompat.add(chckbxAllowIncompatiblePackages, "2, 2");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15071);scrollPane = new JScrollPane();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15072);panelPackageCompat.add(scrollPane, "2, 4, fill, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15073);table = new AutoSelectTextTable(tableModel = new PackagesTableModel());
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15074);scrollPane.setViewportView(table);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15075);panelChanger = new JPanel();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15076);panelChanger.setBorder(new TitledBorder(null, "Nozzle Tip Changer", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15077);contentPanel.add(panelChanger);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15078);panelChanger.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15079);lblX_1 = new JLabel("X");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15080);panelChanger.add(lblX_1, "4, 2");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15081);lblY_1 = new JLabel("Y");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15082);panelChanger.add(lblY_1, "6, 2");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15083);lblZ_1 = new JLabel("Z");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15084);panelChanger.add(lblZ_1, "8, 2");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15085);lblStartLocation = new JLabel("Start Location");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15086);panelChanger.add(lblStartLocation, "2, 4, right, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15087);textFieldChangerStartX = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15088);panelChanger.add(textFieldChangerStartX, "4, 4, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15089);textFieldChangerStartX.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15090);textFieldChangerStartY = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15091);panelChanger.add(textFieldChangerStartY, "6, 4, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15092);textFieldChangerStartY.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15093);textFieldChangerStartZ = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15094);panelChanger.add(textFieldChangerStartZ, "8, 4, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15095);textFieldChangerStartZ.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15096);changerStartLocationButtonsPanel = new LocationButtonsPanel(textFieldChangerStartX,
                textFieldChangerStartY, textFieldChangerStartZ, (JTextField) null);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15097);changerStartLocationButtonsPanel.setShowPositionToolNoSafeZ(true);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15098);panelChanger.add(changerStartLocationButtonsPanel, "10, 4, fill, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15099);lblMiddleLocation = new JLabel("Middle Location");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15100);panelChanger.add(lblMiddleLocation, "2, 6, right, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15101);textFieldChangerMidX = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15102);panelChanger.add(textFieldChangerMidX, "4, 6, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15103);textFieldChangerMidX.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15104);textFieldChangerMidY = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15105);panelChanger.add(textFieldChangerMidY, "6, 6, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15106);textFieldChangerMidY.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15107);textFieldChangerMidZ = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15108);panelChanger.add(textFieldChangerMidZ, "8, 6, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15109);textFieldChangerMidZ.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15110);changerMidLocationButtonsPanel = new LocationButtonsPanel(textFieldChangerMidX,
                textFieldChangerMidY, textFieldChangerMidZ, (JTextField) null);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15111);changerMidLocationButtonsPanel.setShowPositionToolNoSafeZ(true);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15112);panelChanger.add(changerMidLocationButtonsPanel, "10, 6, fill, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15113);lblEndLocation = new JLabel("End Location");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15114);panelChanger.add(lblEndLocation, "2, 8, right, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15115);textFieldChangerEndX = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15116);panelChanger.add(textFieldChangerEndX, "4, 8, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15117);textFieldChangerEndX.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15118);textFieldChangerEndY = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15119);panelChanger.add(textFieldChangerEndY, "6, 8, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15120);textFieldChangerEndY.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15121);textFieldChangerEndZ = new JTextField();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15122);panelChanger.add(textFieldChangerEndZ, "8, 8, fill, default");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15123);textFieldChangerEndZ.setColumns(5);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15124);changerEndLocationButtonsPanel = new LocationButtonsPanel(textFieldChangerEndX,
                textFieldChangerEndY, textFieldChangerEndZ, (JTextField) null);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15125);changerEndLocationButtonsPanel.setShowPositionToolNoSafeZ(true);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15126);panelChanger.add(changerEndLocationButtonsPanel, "10, 8, fill, default");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15127);panelCalibration = new JPanel();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15128);panelCalibration.setBorder(new TitledBorder(null, "Calibration", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        // contentPanel.add(panelCalibration);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15129);panelCalibration
                .setLayout(
                        new FormLayout(new ColumnSpec[] {FormSpecs.DEFAULT_COLSPEC,},
                                new RowSpec[] {RowSpec.decode("23px"),
                                        FormSpecs.RELATED_GAP_ROWSPEC,
                                        FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15130);btnEditPipeline = new JButton("Edit Pipeline");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15131);btnEditPipeline.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15132);
                __CLR4_5_2bmfbmflx1h5q4t.R.inc(15133);UiUtils.messageBoxOnException(() -> {
                    __CLR4_5_2bmfbmflx1h5q4t.R.inc(15134);editCalibrationPipeline();
                });
            }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}
        });
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15135);panelCalibration.add(btnEditPipeline, "1, 1, left, top");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15136);btnCalibrate = new JButton("Calibrate");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15137);btnCalibrate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15138);
                __CLR4_5_2bmfbmflx1h5q4t.R.inc(15139);calibrate();
            }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}
        });
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15140);panelCalibration.add(btnCalibrate, "1, 3");
    }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

    private void editCalibrationPipeline() throws Exception {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15141);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15142);CvPipeline pipeline = nozzleTip.getCalibration().getCalibrationPipeline();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15143);CvPipelineEditor editor = new CvPipelineEditor(pipeline);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15144);JDialog dialog = new JDialog(MainFrame.mainFrame, "Calibration Pipeline");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15145);dialog.getContentPane().setLayout(new BorderLayout());
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15146);dialog.getContentPane().add(editor);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15147);dialog.setSize(1024, 768);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15148);dialog.setVisible(true);
    }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

    private void calibrate() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15149);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15150);UiUtils.submitUiMachineTask(() -> {
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15151);nozzleTip.getCalibration().calibrate(nozzleTip);
        });
    }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15152);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15153);LengthConverter lengthConverter = new LengthConverter();

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15154);addWrappedBinding(nozzleTip, "allowIncompatiblePackages", chckbxAllowIncompatiblePackages,
                "selected");

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15155);MutableLocationProxy changerStartLocation = new MutableLocationProxy();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15156);bind(UpdateStrategy.READ_WRITE, nozzleTip, "changerStartLocation", changerStartLocation,
                "location");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15157);addWrappedBinding(changerStartLocation, "lengthX", textFieldChangerStartX, "text",
                lengthConverter);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15158);addWrappedBinding(changerStartLocation, "lengthY", textFieldChangerStartY, "text",
                lengthConverter);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15159);addWrappedBinding(changerStartLocation, "lengthZ", textFieldChangerStartZ, "text",
                lengthConverter);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15160);MutableLocationProxy changerMidLocation = new MutableLocationProxy();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15161);bind(UpdateStrategy.READ_WRITE, nozzleTip, "changerMidLocation", changerMidLocation,
                "location");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15162);addWrappedBinding(changerMidLocation, "lengthX", textFieldChangerMidX, "text",
                lengthConverter);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15163);addWrappedBinding(changerMidLocation, "lengthY", textFieldChangerMidY, "text",
                lengthConverter);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15164);addWrappedBinding(changerMidLocation, "lengthZ", textFieldChangerMidZ, "text",
                lengthConverter);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15165);MutableLocationProxy changerEndLocation = new MutableLocationProxy();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15166);bind(UpdateStrategy.READ_WRITE, nozzleTip, "changerEndLocation", changerEndLocation,
                "location");
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15167);addWrappedBinding(changerEndLocation, "lengthX", textFieldChangerEndX, "text",
                lengthConverter);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15168);addWrappedBinding(changerEndLocation, "lengthY", textFieldChangerEndY, "text",
                lengthConverter);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15169);addWrappedBinding(changerEndLocation, "lengthZ", textFieldChangerEndZ, "text",
                lengthConverter);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15170);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerStartX);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15171);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerStartY);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15172);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerStartZ);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15173);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerMidX);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15174);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerMidY);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15175);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerMidZ);

        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15176);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerEndX);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15177);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerEndY);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15178);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldChangerEndZ);
    }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

    @Override
    protected void loadFromModel() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15179);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15180);compatiblePackages.clear();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15181);compatiblePackages.addAll(nozzleTip.getCompatiblePackages());
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15182);tableModel.refresh();
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15183);super.loadFromModel();
    }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

    @Override
    protected void saveToModel() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15184);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15185);nozzleTip.setCompatiblePackages(compatiblePackages);
        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15186);super.saveToModel();
    }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

    public class PackagesTableModel extends AbstractTableModel {
        private String[] columnNames = new String[] {"Package Id", "Compatible?"};
        private List<org.openpnp.model.Package> packages;

        public PackagesTableModel() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15187);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15188);Configuration.get().addListener(new ConfigurationListener.Adapter() {
                public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15189);
                    __CLR4_5_2bmfbmflx1h5q4t.R.inc(15190);refresh();
                }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        public void refresh() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15191);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15192);packages = new ArrayList<>(Configuration.get().getPackages());
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15193);fireTableDataChanged();
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        @Override
        public String getColumnName(int column) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15194);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15195);return columnNames[column];
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        public int getColumnCount() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15196);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15197);return columnNames.length;
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        public int getRowCount() {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15198);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15199);return ((((packages == null) )&&(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15200)!=0|true))||(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15201)==0&false))? 0 : packages.size();
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        public org.openpnp.model.Package getPackage(int index) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15202);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15203);return packages.get(index);
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15204);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15205);return columnIndex == 1;
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15206);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15207);try {
                __CLR4_5_2bmfbmflx1h5q4t.R.inc(15208);org.openpnp.model.Package pkg = packages.get(rowIndex);
                __CLR4_5_2bmfbmflx1h5q4t.R.inc(15209);if ((((columnIndex == 1)&&(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15210)!=0|true))||(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15211)==0&false))) {{
                    __CLR4_5_2bmfbmflx1h5q4t.R.inc(15212);if (((((Boolean) aValue)&&(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15213)!=0|true))||(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15214)==0&false))) {{
                        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15215);compatiblePackages.add(pkg);
                    }
                    }else {{
                        __CLR4_5_2bmfbmflx1h5q4t.R.inc(15216);compatiblePackages.remove(pkg);
                    }
                    }__CLR4_5_2bmfbmflx1h5q4t.R.inc(15217);notifyChange();
                }
            }}
            catch (Exception e) {
                // TODO: dialog, bad input
            }
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        @Override
        public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15218);
            __CLR4_5_2bmfbmflx1h5q4t.R.inc(15219);if ((((columnIndex == 1)&&(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15220)!=0|true))||(__CLR4_5_2bmfbmflx1h5q4t.R.iget(15221)==0&false))) {{
                __CLR4_5_2bmfbmflx1h5q4t.R.inc(15222);return Boolean.class;
            }
            }__CLR4_5_2bmfbmflx1h5q4t.R.inc(15223);return super.getColumnClass(columnIndex);
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}

        public Object getValueAt(int row, int col) {try{__CLR4_5_2bmfbmflx1h5q4t.R.inc(15224);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2bmfbmflx1h5q4t.R.inc(15225);switch (col) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmfbmflx1h5q4t.R.inc(15226);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bmfbmflx1h5q4t.R.inc(15227);return packages.get(row).getId();
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmfbmflx1h5q4t.R.inc(15228);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bmfbmflx1h5q4t.R.inc(15229);return compatiblePackages.contains(packages.get(row));
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmfbmflx1h5q4t.R.inc(15230);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bmfbmflx1h5q4t.R.inc(15231);return null;
            }
        }finally{__CLR4_5_2bmfbmflx1h5q4t.R.flushNeeded();}}
    }
}
