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

package org.openpnp.machine.reference.feeder.wizards;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.BufferedImageIconConverter;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.gui.support.PercentConverter;
import org.openpnp.machine.reference.feeder.ReferenceDragFeeder;
import org.openpnp.model.Configuration;
import org.openpnp.spi.Camera;
import org.openpnp.util.UiUtils;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class ReferenceDragFeederConfigurationWizard
        extends AbstractReferenceFeederConfigurationWizard {public static class __CLR4_5_2aeiaeilx1h1vxt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,13713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceDragFeeder feeder;

    private JTextField textFieldFeedStartX;
    private JTextField textFieldFeedStartY;
    private JTextField textFieldFeedStartZ;
    private JTextField textFieldFeedEndX;
    private JTextField textFieldFeedEndY;
    private JTextField textFieldFeedEndZ;
    private JTextField textFieldFeedRate;
    private JLabel lblActuatorId;
    private JTextField textFieldActuatorId;
    private JPanel panelGeneral;
    private JPanel panelVision;
    private JPanel panelLocations;
    private JCheckBox chckbxVisionEnabled;
    private JPanel panelVisionEnabled;
    private JPanel panelTemplate;
    private JLabel labelTemplateImage;
    private JButton btnChangeTemplateImage;
    private JSeparator separator;
    private JPanel panelVisionTemplateAndAoe;
    private JPanel panelAoE;
    private JLabel lblX_1;
    private JLabel lblY_1;
    private JTextField textFieldAoiX;
    private JTextField textFieldAoiY;
    private JTextField textFieldAoiWidth;
    private JTextField textFieldAoiHeight;
    private LocationButtonsPanel locationButtonsPanelFeedStart;
    private LocationButtonsPanel locationButtonsPanelFeedEnd;
    private JLabel lblWidth;
    private JLabel lblHeight;
    private JButton btnChangeAoi;
    private JButton btnCancelChangeAoi;
    private JPanel panel;
    private JButton btnCancelChangeTemplateImage;

    public ReferenceDragFeederConfigurationWizard(ReferenceDragFeeder feeder) {
        super(feeder);__CLR4_5_2aeiaeilx1h1vxt.R.inc(13483);try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13482);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13484);this.feeder = feeder;

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13485);JPanel panelFields = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13486);panelFields.setLayout(new BoxLayout(panelFields, BoxLayout.Y_AXIS));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13487);panelGeneral = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13488);panelGeneral.setBorder(new TitledBorder(null, "General Settings", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13489);panelFields.add(panelGeneral);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13490);panelGeneral.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13491);JLabel lblFeedRate = new JLabel("Feed Speed %");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13492);panelGeneral.add(lblFeedRate, "2, 2");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13493);textFieldFeedRate = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13494);panelGeneral.add(textFieldFeedRate, "4, 2");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13495);textFieldFeedRate.setColumns(5);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13496);lblActuatorId = new JLabel("Actuator Name");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13497);panelGeneral.add(lblActuatorId, "2, 4, right, default");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13498);textFieldActuatorId = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13499);panelGeneral.add(textFieldActuatorId, "4, 4");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13500);textFieldActuatorId.setColumns(5);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13501);panelLocations = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13502);panelFields.add(panelLocations);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13503);panelLocations.setBorder(new TitledBorder(null, "Locations", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13504);panelLocations.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("left:default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13505);JLabel lblX = new JLabel("X");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13506);panelLocations.add(lblX, "4, 4");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13507);JLabel lblY = new JLabel("Y");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13508);panelLocations.add(lblY, "6, 4");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13509);JLabel lblZ = new JLabel("Z");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13510);panelLocations.add(lblZ, "8, 4");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13511);JLabel lblFeedStartLocation = new JLabel("Feed Start Location");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13512);panelLocations.add(lblFeedStartLocation, "2, 6, right, default");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13513);textFieldFeedStartX = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13514);panelLocations.add(textFieldFeedStartX, "4, 6");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13515);textFieldFeedStartX.setColumns(8);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13516);textFieldFeedStartY = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13517);panelLocations.add(textFieldFeedStartY, "6, 6");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13518);textFieldFeedStartY.setColumns(8);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13519);textFieldFeedStartZ = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13520);panelLocations.add(textFieldFeedStartZ, "8, 6");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13521);textFieldFeedStartZ.setColumns(8);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13522);locationButtonsPanelFeedStart = new LocationButtonsPanel(textFieldFeedStartX,
                textFieldFeedStartY, textFieldFeedStartZ, null);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13523);panelLocations.add(locationButtonsPanelFeedStart, "10, 6");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13524);JLabel lblFeedEndLocation = new JLabel("Feed End Location");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13525);panelLocations.add(lblFeedEndLocation, "2, 8, right, default");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13526);textFieldFeedEndX = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13527);panelLocations.add(textFieldFeedEndX, "4, 8");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13528);textFieldFeedEndX.setColumns(8);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13529);textFieldFeedEndY = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13530);panelLocations.add(textFieldFeedEndY, "6, 8");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13531);textFieldFeedEndY.setColumns(8);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13532);textFieldFeedEndZ = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13533);panelLocations.add(textFieldFeedEndZ, "8, 8");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13534);textFieldFeedEndZ.setColumns(8);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13535);locationButtonsPanelFeedEnd = new LocationButtonsPanel(textFieldFeedEndX, textFieldFeedEndY,
                textFieldFeedEndZ, null);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13536);panelLocations.add(locationButtonsPanelFeedEnd, "10, 8");
        //
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13537);panelVision = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13538);panelVision.setBorder(new TitledBorder(null, "Vision", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13539);panelFields.add(panelVision);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13540);panelVision.setLayout(new BoxLayout(panelVision, BoxLayout.Y_AXIS));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13541);panelVisionEnabled = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13542);FlowLayout fl_panelVisionEnabled = (FlowLayout) panelVisionEnabled.getLayout();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13543);fl_panelVisionEnabled.setAlignment(FlowLayout.LEFT);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13544);panelVision.add(panelVisionEnabled);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13545);chckbxVisionEnabled = new JCheckBox("Vision Enabled?");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13546);panelVisionEnabled.add(chckbxVisionEnabled);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13547);separator = new JSeparator();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13548);panelVision.add(separator);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13549);panelVisionTemplateAndAoe = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13550);panelVision.add(panelVisionTemplateAndAoe);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13551);panelVisionTemplateAndAoe.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13552);panelTemplate = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13553);panelTemplate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Template Image", TitledBorder.LEADING, TitledBorder.TOP, null,
                new Color(0, 0, 0)));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13554);panelVisionTemplateAndAoe.add(panelTemplate, "2, 2, center, fill");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13555);panelTemplate.setLayout(new BoxLayout(panelTemplate, BoxLayout.Y_AXIS));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13556);labelTemplateImage = new JLabel("");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13557);labelTemplateImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13558);panelTemplate.add(labelTemplateImage);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13559);labelTemplateImage.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13560);labelTemplateImage.setMinimumSize(new Dimension(150, 150));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13561);labelTemplateImage.setMaximumSize(new Dimension(150, 150));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13562);labelTemplateImage.setHorizontalAlignment(SwingConstants.CENTER);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13563);labelTemplateImage.setSize(new Dimension(150, 150));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13564);labelTemplateImage.setPreferredSize(new Dimension(150, 150));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13565);panel = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13566);panelTemplate.add(panel);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13567);btnChangeTemplateImage = new JButton(selectTemplateImageAction);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13568);panel.add(btnChangeTemplateImage);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13569);btnChangeTemplateImage.setAlignmentX(Component.CENTER_ALIGNMENT);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13570);btnCancelChangeTemplateImage = new JButton(cancelSelectTemplateImageAction);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13571);panel.add(btnCancelChangeTemplateImage);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13572);panelAoE = new JPanel();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13573);panelAoE.setBorder(new TitledBorder(null, "Area of Interest", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13574);panelVisionTemplateAndAoe.add(panelAoE, "4, 2, fill, fill");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13575);panelAoE.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13576);lblX_1 = new JLabel("X");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13577);panelAoE.add(lblX_1, "2, 2");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13578);lblY_1 = new JLabel("Y");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13579);panelAoE.add(lblY_1, "4, 2");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13580);lblWidth = new JLabel("Width");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13581);panelAoE.add(lblWidth, "6, 2");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13582);lblHeight = new JLabel("Height");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13583);panelAoE.add(lblHeight, "8, 2");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13584);textFieldAoiX = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13585);panelAoE.add(textFieldAoiX, "2, 4, fill, default");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13586);textFieldAoiX.setColumns(5);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13587);textFieldAoiY = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13588);panelAoE.add(textFieldAoiY, "4, 4, fill, default");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13589);textFieldAoiY.setColumns(5);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13590);textFieldAoiWidth = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13591);panelAoE.add(textFieldAoiWidth, "6, 4, fill, default");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13592);textFieldAoiWidth.setColumns(5);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13593);textFieldAoiHeight = new JTextField();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13594);panelAoE.add(textFieldAoiHeight, "8, 4, fill, default");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13595);textFieldAoiHeight.setColumns(5);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13596);btnChangeAoi = new JButton("Change");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13597);btnChangeAoi.setAction(selectAoiAction);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13598);panelAoE.add(btnChangeAoi, "10, 4");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13599);btnCancelChangeAoi = new JButton("Cancel");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13600);btnCancelChangeAoi.setAction(cancelSelectAoiAction);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13601);panelAoE.add(btnCancelChangeAoi, "12, 4");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13602);cancelSelectTemplateImageAction.setEnabled(false);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13603);cancelSelectAoiAction.setEnabled(false);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13604);contentPanel.add(panelFields);
    }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13605);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13606);super.createBindings();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13607);LengthConverter lengthConverter = new LengthConverter();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13608);IntegerConverter intConverter = new IntegerConverter();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13609);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13610);BufferedImageIconConverter imageConverter = new BufferedImageIconConverter();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13611);PercentConverter percentConverter = new PercentConverter();

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13612);addWrappedBinding(feeder, "feedSpeed", textFieldFeedRate, "text", percentConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13613);addWrappedBinding(feeder, "actuatorName", textFieldActuatorId, "text");

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13614);MutableLocationProxy feedStartLocation = new MutableLocationProxy();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13615);bind(UpdateStrategy.READ_WRITE, feeder, "feedStartLocation", feedStartLocation, "location");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13616);addWrappedBinding(feedStartLocation, "lengthX", textFieldFeedStartX, "text",
                lengthConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13617);addWrappedBinding(feedStartLocation, "lengthY", textFieldFeedStartY, "text",
                lengthConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13618);addWrappedBinding(feedStartLocation, "lengthZ", textFieldFeedStartZ, "text",
                lengthConverter);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13619);MutableLocationProxy feedEndLocation = new MutableLocationProxy();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13620);bind(UpdateStrategy.READ_WRITE, feeder, "feedEndLocation", feedEndLocation, "location");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13621);addWrappedBinding(feedEndLocation, "lengthX", textFieldFeedEndX, "text", lengthConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13622);addWrappedBinding(feedEndLocation, "lengthY", textFieldFeedEndY, "text", lengthConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13623);addWrappedBinding(feedEndLocation, "lengthZ", textFieldFeedEndZ, "text", lengthConverter);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13624);addWrappedBinding(feeder, "vision.enabled", chckbxVisionEnabled, "selected");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13625);addWrappedBinding(feeder, "vision.templateImage", labelTemplateImage, "icon",
                imageConverter);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13626);addWrappedBinding(feeder, "vision.areaOfInterest.x", textFieldAoiX, "text", intConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13627);addWrappedBinding(feeder, "vision.areaOfInterest.y", textFieldAoiY, "text", intConverter);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13628);addWrappedBinding(feeder, "vision.areaOfInterest.width", textFieldAoiWidth, "text",
                intConverter);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13629);addWrappedBinding(feeder, "vision.areaOfInterest.height", textFieldAoiHeight, "text",
                intConverter);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13630);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedRate);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13631);ComponentDecorators.decorateWithAutoSelect(textFieldActuatorId);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13632);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedStartX);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13633);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedStartY);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13634);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedStartZ);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13635);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedEndX);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13636);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedEndY);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13637);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedEndZ);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13638);ComponentDecorators.decorateWithAutoSelect(textFieldAoiX);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13639);ComponentDecorators.decorateWithAutoSelect(textFieldAoiY);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13640);ComponentDecorators.decorateWithAutoSelect(textFieldAoiWidth);
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13641);ComponentDecorators.decorateWithAutoSelect(textFieldAoiHeight);

        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13642);BeanProperty actuatorIdProperty = BeanProperty.create("actuatorId");
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13643);Bindings.createAutoBinding(UpdateStrategy.READ, feeder, actuatorIdProperty,
                locationButtonsPanelFeedStart, actuatorIdProperty).bind();
        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13644);Bindings.createAutoBinding(UpdateStrategy.READ, feeder, actuatorIdProperty,
                locationButtonsPanelFeedEnd, actuatorIdProperty).bind();
    }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}

    @SuppressWarnings("serial")
    private Action selectTemplateImageAction = new AbstractAction("Select") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13645);
            __CLR4_5_2aeiaeilx1h1vxt.R.inc(13646);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13647);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13648);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13649);cameraView.setSelectionEnabled(true);
                // org.openpnp.model.Rectangle r =
                // feeder.getVision().getTemplateImageCoordinates();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13650);org.openpnp.model.Rectangle r = null;
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13651);if ((((r == null || r.getWidth() == 0 || r.getHeight() == 0)&&(__CLR4_5_2aeiaeilx1h1vxt.R.iget(13652)!=0|true))||(__CLR4_5_2aeiaeilx1h1vxt.R.iget(13653)==0&false))) {{
                    __CLR4_5_2aeiaeilx1h1vxt.R.inc(13654);cameraView.setSelection(0, 0, 100, 100);
                }
                }else {{
                    // cameraView.setSelection(r.getLeft(), r.getTop(),
                    // r.getWidth(), r.getHeight());
                }
                }__CLR4_5_2aeiaeilx1h1vxt.R.inc(13655);btnChangeTemplateImage.setAction(confirmSelectTemplateImageAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13656);cancelSelectTemplateImageAction.setEnabled(true);
            });
        }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    private Action confirmSelectTemplateImageAction = new AbstractAction("Confirm") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13657);
            __CLR4_5_2aeiaeilx1h1vxt.R.inc(13658);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13659);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13660);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13661);BufferedImage image = cameraView.captureSelectionImage();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13662);if ((((image == null)&&(__CLR4_5_2aeiaeilx1h1vxt.R.iget(13663)!=0|true))||(__CLR4_5_2aeiaeilx1h1vxt.R.iget(13664)==0&false))) {{
                    __CLR4_5_2aeiaeilx1h1vxt.R.inc(13665);MessageBoxes.errorBox(ReferenceDragFeederConfigurationWizard.this,
                            "No Image Selected",
                            "Please select an area of the camera image using the mouse.");
                }
                }else {{
                    __CLR4_5_2aeiaeilx1h1vxt.R.inc(13666);labelTemplateImage.setIcon(new ImageIcon(image));
                }
                }__CLR4_5_2aeiaeilx1h1vxt.R.inc(13667);cameraView.setSelectionEnabled(false);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13668);btnChangeTemplateImage.setAction(selectTemplateImageAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13669);cancelSelectTemplateImageAction.setEnabled(false);
            });
        }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    private Action cancelSelectTemplateImageAction = new AbstractAction("Cancel") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13670);
            __CLR4_5_2aeiaeilx1h1vxt.R.inc(13671);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13672);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13673);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13674);btnChangeTemplateImage.setAction(selectTemplateImageAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13675);cancelSelectTemplateImageAction.setEnabled(false);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13676);cameraView.setSelectionEnabled(false);
            });
        }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    private Action selectAoiAction = new AbstractAction("Select") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13677);
            __CLR4_5_2aeiaeilx1h1vxt.R.inc(13678);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13679);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13680);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13681);btnChangeAoi.setAction(confirmSelectAoiAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13682);cancelSelectAoiAction.setEnabled(true);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13683);cameraView.setSelectionEnabled(true);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13684);org.openpnp.model.Rectangle r = feeder.getVision().getAreaOfInterest();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13685);if ((((r == null || r.getWidth() == 0 || r.getHeight() == 0)&&(__CLR4_5_2aeiaeilx1h1vxt.R.iget(13686)!=0|true))||(__CLR4_5_2aeiaeilx1h1vxt.R.iget(13687)==0&false))) {{
                    __CLR4_5_2aeiaeilx1h1vxt.R.inc(13688);cameraView.setSelection(0, 0, 100, 100);
                }
                }else {{
                    __CLR4_5_2aeiaeilx1h1vxt.R.inc(13689);cameraView.setSelection(r.getX(), r.getY(), r.getWidth(), r.getHeight());
                }
            }});
        }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    private Action confirmSelectAoiAction = new AbstractAction("Confirm") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13690);
            __CLR4_5_2aeiaeilx1h1vxt.R.inc(13691);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13692);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13693);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13694);btnChangeAoi.setAction(selectAoiAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13695);cancelSelectAoiAction.setEnabled(false);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13696);cameraView.setSelectionEnabled(false);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13697);final Rectangle rect = cameraView.getSelection();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13698);SwingUtilities.invokeLater(new Runnable() {
                    public void run() {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13699);
                        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13700);textFieldAoiX.setText(Integer.toString(rect.x));
                        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13701);textFieldAoiY.setText(Integer.toString(rect.y));
                        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13702);textFieldAoiWidth.setText(Integer.toString(rect.width));
                        __CLR4_5_2aeiaeilx1h1vxt.R.inc(13703);textFieldAoiHeight.setText(Integer.toString(rect.height));
                    }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
                });
            });
        }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    private Action cancelSelectAoiAction = new AbstractAction("Cancel") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2aeiaeilx1h1vxt.R.inc(13704);
            __CLR4_5_2aeiaeilx1h1vxt.R.inc(13705);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13706);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13707);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);

                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13708);btnChangeAoi.setAction(selectAoiAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13709);cancelSelectAoiAction.setEnabled(false);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13710);btnChangeAoi.setAction(selectAoiAction);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13711);cancelSelectAoiAction.setEnabled(false);
                __CLR4_5_2aeiaeilx1h1vxt.R.inc(13712);cameraView.setSelectionEnabled(false);
            });
        }finally{__CLR4_5_2aeiaeilx1h1vxt.R.flushNeeded();}}
    };
}
