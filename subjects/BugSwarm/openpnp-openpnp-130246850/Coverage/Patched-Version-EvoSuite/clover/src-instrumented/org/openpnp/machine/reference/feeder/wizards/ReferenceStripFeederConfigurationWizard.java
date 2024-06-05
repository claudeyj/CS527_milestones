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
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.components.CameraViewActionEvent;
import org.openpnp.gui.components.CameraViewActionListener;
import org.openpnp.gui.components.CameraViewFilter;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.IdentifiableListCellRenderer;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.gui.support.PartsComboBoxModel;
import org.openpnp.machine.reference.feeder.ReferenceStripFeeder;
import org.openpnp.machine.reference.feeder.ReferenceStripFeeder.TapeType;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.Camera;
import org.openpnp.util.VisionUtils;
import org.openpnp.vision.FluentCv;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class ReferenceStripFeederConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2akyakylx1h5pr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,13931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceStripFeeder feeder;

    private JPanel panelPart;

    private JComboBox comboBoxPart;

    private JTextField textFieldFeedStartX;
    private JTextField textFieldFeedStartY;
    private JTextField textFieldFeedStartZ;
    private JTextField textFieldFeedEndX;
    private JTextField textFieldFeedEndY;
    private JTextField textFieldFeedEndZ;
    private JTextField textFieldTapeWidth;
    private JLabel lblPartPitch;
    private JTextField textFieldPartPitch;
    private JPanel panelTapeSettings;
    private JPanel panelLocations;
    private LocationButtonsPanel locationButtonsPanelFeedStart;
    private LocationButtonsPanel locationButtonsPanelFeedEnd;
    private JLabel lblFeedCount;
    private JTextField textFieldFeedCount;
    private JButton btnResetFeedCount;
    private JLabel lblTapeType;
    private JComboBox comboBoxTapeType;
    private JLabel lblRotationInTape;
    private JTextField textFieldLocationRotation;
    private JButton btnAutoSetup;

    private Location firstPartLocation;
    private Location secondPartLocation;
    private List<Location> part1HoleLocations;
    private Camera autoSetupCamera;


    public ReferenceStripFeederConfigurationWizard(ReferenceStripFeeder feeder) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13714);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13715);this.feeder = feeder;

        __CLR4_5_2akyakylx1h5pr6.R.inc(13716);panelPart = new JPanel();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13717);panelPart.setBorder(
                new TitledBorder(null, "Part", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        __CLR4_5_2akyakylx1h5pr6.R.inc(13718);contentPanel.add(panelPart);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13719);panelPart.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2akyakylx1h5pr6.R.inc(13720);comboBoxPart = new JComboBox();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13721);try {
            __CLR4_5_2akyakylx1h5pr6.R.inc(13722);comboBoxPart.setModel(new PartsComboBoxModel());
        }
        catch (Throwable t) {
            // Swallow this error. This happens during parsing in
            // in WindowBuilder but doesn't happen during normal run.
        }
        __CLR4_5_2akyakylx1h5pr6.R.inc(13723);comboBoxPart.setRenderer(new IdentifiableListCellRenderer<Part>());
        __CLR4_5_2akyakylx1h5pr6.R.inc(13724);panelPart.add(comboBoxPart, "2, 2, 3, 1, left, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13725);lblRotationInTape = new JLabel("Rotation In Tape");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13726);panelPart.add(lblRotationInTape, "2, 4, left, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13727);textFieldLocationRotation = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13728);panelPart.add(textFieldLocationRotation, "4, 4, fill, default");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13729);textFieldLocationRotation.setColumns(4);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13730);panelTapeSettings = new JPanel();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13731);contentPanel.add(panelTapeSettings);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13732);panelTapeSettings.setBorder(new TitledBorder(
                new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tape Settings",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_2akyakylx1h5pr6.R.inc(13733);panelTapeSettings.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2akyakylx1h5pr6.R.inc(13734);btnAutoSetup = new JButton(autoSetup);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13735);panelTapeSettings.add(btnAutoSetup, "2, 2, 11, 1");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13736);lblTapeType = new JLabel("Tape Type");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13737);panelTapeSettings.add(lblTapeType, "2, 4, right, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13738);comboBoxTapeType = new JComboBox(TapeType.values());
        __CLR4_5_2akyakylx1h5pr6.R.inc(13739);panelTapeSettings.add(comboBoxTapeType, "4, 4, fill, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13740);JLabel lblTapeWidth = new JLabel("Tape Width");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13741);panelTapeSettings.add(lblTapeWidth, "8, 4, right, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13742);textFieldTapeWidth = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13743);panelTapeSettings.add(textFieldTapeWidth, "10, 4");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13744);textFieldTapeWidth.setColumns(5);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13745);lblPartPitch = new JLabel("Part Pitch");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13746);panelTapeSettings.add(lblPartPitch, "2, 6, right, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13747);textFieldPartPitch = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13748);panelTapeSettings.add(textFieldPartPitch, "4, 6");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13749);textFieldPartPitch.setColumns(5);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13750);lblFeedCount = new JLabel("Feed Count");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13751);panelTapeSettings.add(lblFeedCount, "8, 6, right, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13752);textFieldFeedCount = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13753);panelTapeSettings.add(textFieldFeedCount, "10, 6");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13754);textFieldFeedCount.setColumns(10);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13755);btnResetFeedCount = new JButton(new AbstractAction("Reset") {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13756);
                __CLR4_5_2akyakylx1h5pr6.R.inc(13757);textFieldFeedCount.setText("0");
                __CLR4_5_2akyakylx1h5pr6.R.inc(13758);applyAction.actionPerformed(e);
            }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
        });
        __CLR4_5_2akyakylx1h5pr6.R.inc(13759);panelTapeSettings.add(btnResetFeedCount, "12, 6");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13760);lblUseVision = new JLabel("Use Vision?");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13761);panelTapeSettings.add(lblUseVision, "2, 8");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13762);chckbxUseVision = new JCheckBox("");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13763);panelTapeSettings.add(chckbxUseVision, "4, 8");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13764);panelLocations = new JPanel();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13765);contentPanel.add(panelLocations);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13766);panelLocations.setBorder(new TitledBorder(null, "Locations", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2akyakylx1h5pr6.R.inc(13767);panelLocations.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("left:default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2akyakylx1h5pr6.R.inc(13768);JLabel lblX = new JLabel("X");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13769);panelLocations.add(lblX, "4, 2");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13770);JLabel lblY = new JLabel("Y");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13771);panelLocations.add(lblY, "6, 2");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13772);JLabel lblZ_1 = new JLabel("Z");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13773);panelLocations.add(lblZ_1, "8, 2");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13774);JLabel lblFeedStartLocation = new JLabel("Reference Hole Location");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13775);lblFeedStartLocation.setToolTipText(
                "The location of the first tape hole past the first part in the direction of more parts.");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13776);panelLocations.add(lblFeedStartLocation, "2, 4, right, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13777);textFieldFeedStartX = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13778);panelLocations.add(textFieldFeedStartX, "4, 4");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13779);textFieldFeedStartX.setColumns(8);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13780);textFieldFeedStartY = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13781);panelLocations.add(textFieldFeedStartY, "6, 4");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13782);textFieldFeedStartY.setColumns(8);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13783);textFieldFeedStartZ = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13784);panelLocations.add(textFieldFeedStartZ, "8, 4");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13785);textFieldFeedStartZ.setColumns(8);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13786);locationButtonsPanelFeedStart = new LocationButtonsPanel(textFieldFeedStartX,
                textFieldFeedStartY, textFieldFeedStartZ, null);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13787);panelLocations.add(locationButtonsPanelFeedStart, "10, 4");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13788);JLabel lblFeedEndLocation = new JLabel("Next Hole Location");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13789);lblFeedEndLocation.setToolTipText(
                "The location of another hole after the reference hole. This can be any hole along the tape as long as it's past the reference hole.");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13790);panelLocations.add(lblFeedEndLocation, "2, 6, right, default");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13791);textFieldFeedEndX = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13792);panelLocations.add(textFieldFeedEndX, "4, 6");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13793);textFieldFeedEndX.setColumns(8);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13794);textFieldFeedEndY = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13795);panelLocations.add(textFieldFeedEndY, "6, 6");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13796);textFieldFeedEndY.setColumns(8);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13797);textFieldFeedEndZ = new JTextField();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13798);panelLocations.add(textFieldFeedEndZ, "8, 6");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13799);textFieldFeedEndZ.setColumns(8);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13800);locationButtonsPanelFeedEnd = new LocationButtonsPanel(textFieldFeedEndX, textFieldFeedEndY,
                textFieldFeedEndZ, null);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13801);panelLocations.add(locationButtonsPanelFeedEnd, "10, 6");
    }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13802);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13803);LengthConverter lengthConverter = new LengthConverter();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13804);IntegerConverter intConverter = new IntegerConverter();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13805);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());

        __CLR4_5_2akyakylx1h5pr6.R.inc(13806);MutableLocationProxy location = new MutableLocationProxy();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13807);bind(UpdateStrategy.READ_WRITE, feeder, "location", location, "location");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13808);addWrappedBinding(location, "rotation", textFieldLocationRotation, "text", doubleConverter);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13809);addWrappedBinding(feeder, "part", comboBoxPart, "selectedItem");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13810);addWrappedBinding(feeder, "tapeType", comboBoxTapeType, "selectedItem");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13811);addWrappedBinding(feeder, "tapeWidth", textFieldTapeWidth, "text", lengthConverter);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13812);addWrappedBinding(feeder, "partPitch", textFieldPartPitch, "text", lengthConverter);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13813);addWrappedBinding(feeder, "feedCount", textFieldFeedCount, "text", intConverter);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13814);MutableLocationProxy feedStartLocation = new MutableLocationProxy();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13815);bind(UpdateStrategy.READ_WRITE, feeder, "referenceHoleLocation", feedStartLocation,
                "location");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13816);addWrappedBinding(feedStartLocation, "lengthX", textFieldFeedStartX, "text",
                lengthConverter);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13817);addWrappedBinding(feedStartLocation, "lengthY", textFieldFeedStartY, "text",
                lengthConverter);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13818);addWrappedBinding(feedStartLocation, "lengthZ", textFieldFeedStartZ, "text",
                lengthConverter);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13819);MutableLocationProxy feedEndLocation = new MutableLocationProxy();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13820);bind(UpdateStrategy.READ_WRITE, feeder, "lastHoleLocation", feedEndLocation, "location");
        __CLR4_5_2akyakylx1h5pr6.R.inc(13821);addWrappedBinding(feedEndLocation, "lengthX", textFieldFeedEndX, "text", lengthConverter);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13822);addWrappedBinding(feedEndLocation, "lengthY", textFieldFeedEndY, "text", lengthConverter);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13823);addWrappedBinding(feedEndLocation, "lengthZ", textFieldFeedEndZ, "text", lengthConverter);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13824);addWrappedBinding(feeder, "visionEnabled", chckbxUseVision, "selected");

        __CLR4_5_2akyakylx1h5pr6.R.inc(13825);ComponentDecorators.decorateWithAutoSelect(textFieldLocationRotation);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13826);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldTapeWidth);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13827);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldPartPitch);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13828);ComponentDecorators.decorateWithAutoSelect(textFieldFeedCount);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13829);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedStartX);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13830);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedStartY);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13831);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedStartZ);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13832);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedEndX);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13833);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedEndY);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13834);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedEndZ);
    }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

    private Action autoSetup = new AbstractAction("Auto Setup") {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13835);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13836);try {
                __CLR4_5_2akyakylx1h5pr6.R.inc(13837);autoSetupCamera =
                        Configuration.get().getMachine().getDefaultHead().getDefaultCamera();
            }
            catch (Exception ex) {
                __CLR4_5_2akyakylx1h5pr6.R.inc(13838);MessageBoxes.errorBox(getTopLevelAncestor(), "Auto Setup Failure", ex);
                __CLR4_5_2akyakylx1h5pr6.R.inc(13839);return;
            }

            __CLR4_5_2akyakylx1h5pr6.R.inc(13840);btnAutoSetup.setAction(autoSetupCancel);

            __CLR4_5_2akyakylx1h5pr6.R.inc(13841);CameraView cameraView = MainFrame.cameraPanel.getCameraView(autoSetupCamera);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13842);cameraView.addActionListener(autoSetupPart1Clicked);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13843);cameraView.setText("Click on the center of the first part in the tape.");
            __CLR4_5_2akyakylx1h5pr6.R.inc(13844);cameraView.flash();

            __CLR4_5_2akyakylx1h5pr6.R.inc(13845);final boolean showDetails = (e.getModifiers() & ActionEvent.ALT_MASK) != 0;

            __CLR4_5_2akyakylx1h5pr6.R.inc(13846);cameraView.setCameraViewFilter(new CameraViewFilter() {
                @Override
                public BufferedImage filterCameraImage(Camera camera, BufferedImage image) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13847);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13848);return showHoles(camera, image, showDetails);
                }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
    };

    private Action autoSetupCancel = new AbstractAction("Cancel Auto Setup") {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13849);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13850);btnAutoSetup.setAction(autoSetup);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13851);CameraView cameraView = MainFrame.cameraPanel.getCameraView(autoSetupCamera);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13852);cameraView.setText(null);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13853);cameraView.setCameraViewFilter(null);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13854);cameraView.removeActionListener(autoSetupPart1Clicked);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13855);cameraView.removeActionListener(autoSetupPart2Clicked);
        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
    };

    private CameraViewActionListener autoSetupPart1Clicked = new CameraViewActionListener() {
        @Override
        public void actionPerformed(final CameraViewActionEvent action) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13856);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13857);firstPartLocation = action.getLocation();
            __CLR4_5_2akyakylx1h5pr6.R.inc(13858);final CameraView cameraView = MainFrame.cameraPanel.getCameraView(autoSetupCamera);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13859);cameraView.removeActionListener(this);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13860);Configuration.get().getMachine().submit(new Callable<Void>() {
                public Void call() throws Exception {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13861);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13862);cameraView.setText("Checking first part...");
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13863);autoSetupCamera.moveTo(action.getLocation());
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13864);part1HoleLocations = findHoles(autoSetupCamera);

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13865);cameraView.setText("Now click on the center of the second part in the tape.");
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13866);cameraView.flash();

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13867);cameraView.addActionListener(autoSetupPart2Clicked);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13868);return null;
                }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
            }, new FutureCallback<Void>() {
                @Override
                public void onSuccess(Void result) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13869);}finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

                @Override
                public void onFailure(final Throwable t) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13870);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13871);SwingUtilities.invokeLater(new Runnable() {
                        public void run() {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13872);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13873);autoSetupCancel.actionPerformed(null);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13874);MessageBoxes.errorBox(getTopLevelAncestor(), "Auto Setup Failure", t);
                        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
                    });
                }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
    };

    private CameraViewActionListener autoSetupPart2Clicked = new CameraViewActionListener() {
        @Override
        public void actionPerformed(final CameraViewActionEvent action) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13875);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13876);secondPartLocation = action.getLocation();
            __CLR4_5_2akyakylx1h5pr6.R.inc(13877);final CameraView cameraView = MainFrame.cameraPanel.getCameraView(autoSetupCamera);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13878);cameraView.removeActionListener(this);
            __CLR4_5_2akyakylx1h5pr6.R.inc(13879);Configuration.get().getMachine().submit(new Callable<Void>() {
                public Void call() throws Exception {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13880);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13881);cameraView.setText("Checking second part...");
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13882);autoSetupCamera.moveTo(action.getLocation());
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13883);List<Location> part2HoleLocations = findHoles(autoSetupCamera);

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13884);List<Location> referenceHoles =
                            deriveReferenceHoles(part1HoleLocations, part2HoleLocations);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13885);final Location referenceHole1 = referenceHoles.get(0);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13886);final Location referenceHole2 = referenceHoles.get(1);

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13887);feeder.setReferenceHoleLocation(referenceHole1);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13888);feeder.setLastHoleLocation(referenceHole2);

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13889);Length partPitch = firstPartLocation.getLinearLengthTo(secondPartLocation);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13890);partPitch.setValue(2 * (Math.round(partPitch.getValue() / 2)));

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13891);final Length partPitch_ = partPitch;
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13892);SwingUtilities.invokeLater(new Runnable() {
                        public void run() {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13893);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13894);Helpers.copyLocationIntoTextFields(referenceHole1, textFieldFeedStartX,
                                    textFieldFeedStartY, textFieldFeedStartZ);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13895);Helpers.copyLocationIntoTextFields(referenceHole2, textFieldFeedEndX,
                                    textFieldFeedEndY, textFieldFeedEndZ);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13896);textFieldPartPitch.setText(partPitch_.getValue() + "");
                        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
                    });

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13897);feeder.setFeedCount(1);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13898);autoSetupCamera.moveTo(feeder.getPickLocation());
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13899);feeder.setFeedCount(0);

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13900);cameraView.setText("Setup complete!");
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13901);Thread.sleep(1500);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13902);cameraView.setText(null);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13903);cameraView.setCameraViewFilter(null);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13904);btnAutoSetup.setAction(autoSetup);

                    __CLR4_5_2akyakylx1h5pr6.R.inc(13905);return null;
                }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
            }, new FutureCallback<Void>() {
                @Override
                public void onSuccess(Void result) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13906);}finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

                @Override
                public void onFailure(final Throwable t) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13907);
                    __CLR4_5_2akyakylx1h5pr6.R.inc(13908);SwingUtilities.invokeLater(new Runnable() {
                        public void run() {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13909);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13910);autoSetupCancel.actionPerformed(null);
                            __CLR4_5_2akyakylx1h5pr6.R.inc(13911);MessageBoxes.errorBox(getTopLevelAncestor(), "Auto Setup Failure", t);
                        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
                    });
                }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}
    };

    private List<Location> findHoles(Camera camera) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13912);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13913);List<Location> holeLocations = new ArrayList<>();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13914);new FluentCv().setCamera(camera).settleAndCapture().toGray()
                .blurGaussian(feeder.getHoleBlurKernelSize())
                .findCirclesHough(feeder.getHoleDiameterMin(), feeder.getHoleDiameterMax(),
                        feeder.getHolePitchMin())
                .filterCirclesByDistance(feeder.getHoleDistanceMin(), feeder.getHoleDistanceMax())
                .filterCirclesToLine(feeder.getHoleLineDistanceMax())
                .convertCirclesToLocations(holeLocations);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13915);return holeLocations;
    }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

    /**
     * Show candidate holes in the image. Red are any holes that are found. Blue is holes that
     * passed the distance check but failed the line check. Green passed all checks and are good.
     * 
     * @param camera
     * @param image
     * @return
     */
    private BufferedImage showHoles(Camera camera, BufferedImage image, boolean showDetails) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13916);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13917);if ((((showDetails)&&(__CLR4_5_2akyakylx1h5pr6.R.iget(13918)!=0|true))||(__CLR4_5_2akyakylx1h5pr6.R.iget(13919)==0&false))) {{
            __CLR4_5_2akyakylx1h5pr6.R.inc(13920);return new FluentCv().setCamera(camera).toMat(image, "original").toGray()
                    .blurGaussian(feeder.getHoleBlurKernelSize())
                    .findCirclesHough(feeder.getHoleDiameterMin(), feeder.getHoleDiameterMax(),
                            feeder.getHolePitchMin(), "houghUnfiltered")
                    .drawCircles("original", Color.red, "unfiltered").recall("houghUnfiltered")
                    .filterCirclesByDistance(feeder.getHoleDistanceMin(),
                            feeder.getHoleDistanceMax(), "houghDistanceFiltered")
                    .drawCircles("unfiltered", Color.blue, "distanceFiltered")
                    .recall("houghDistanceFiltered")
                    .filterCirclesToLine(feeder.getHoleLineDistanceMax())
                    .drawCircles("distanceFiltered", Color.green).toBufferedImage();
        }
        }else {{
            __CLR4_5_2akyakylx1h5pr6.R.inc(13921);return new FluentCv().setCamera(camera).toMat(image, "original").toGray()
                    .blurGaussian(feeder.getHoleBlurKernelSize())
                    .findCirclesHough(feeder.getHoleDiameterMin(), feeder.getHoleDiameterMax(),
                            feeder.getHolePitchMin())
                    .filterCirclesByDistance(feeder.getHoleDistanceMin(),
                            feeder.getHoleDistanceMax())
                    .filterCirclesToLine(feeder.getHoleLineDistanceMax())
                    .drawCircles("original", Color.green).toBufferedImage();
        }
    }}finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

    private List<Location> deriveReferenceHoles(List<Location> part1HoleLocations,
            List<Location> part2HoleLocations) {try{__CLR4_5_2akyakylx1h5pr6.R.inc(13922);
        // We are only interested in the pair of holes closest to each part
        __CLR4_5_2akyakylx1h5pr6.R.inc(13923);part1HoleLocations = part1HoleLocations.subList(0, Math.min(2, part1HoleLocations.size()));
        __CLR4_5_2akyakylx1h5pr6.R.inc(13924);part2HoleLocations = part2HoleLocations.subList(0, Math.min(2, part2HoleLocations.size()));

        // Part 1's reference hole is the one closest to either of part 2's holes.
        __CLR4_5_2akyakylx1h5pr6.R.inc(13925);Location part1ReferenceHole = VisionUtils
                .sortLocationsByDistance(part2HoleLocations.get(0), part1HoleLocations).get(0);
        // Part 2's reference hole is the one farthest from part 1's reference hole.
        __CLR4_5_2akyakylx1h5pr6.R.inc(13926);Location part2ReferenceHole = Lists
                .reverse(
                        VisionUtils.sortLocationsByDistance(part1ReferenceHole, part2HoleLocations))
                .get(0);

        __CLR4_5_2akyakylx1h5pr6.R.inc(13927);List<Location> referenceHoles = new ArrayList<>();
        __CLR4_5_2akyakylx1h5pr6.R.inc(13928);referenceHoles.add(part1ReferenceHole);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13929);referenceHoles.add(part2ReferenceHole);
        __CLR4_5_2akyakylx1h5pr6.R.inc(13930);return referenceHoles;
    }finally{__CLR4_5_2akyakylx1h5pr6.R.flushNeeded();}}

    private JCheckBox chckbxUseVision;
    private JLabel lblUseVision;
}
