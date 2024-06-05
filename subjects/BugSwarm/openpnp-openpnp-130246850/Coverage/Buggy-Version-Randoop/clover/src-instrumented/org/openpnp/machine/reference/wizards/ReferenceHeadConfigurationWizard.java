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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.support.ApplyResetBindingListener;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.gui.support.JBindings.WrappedBinding;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.support.WizardContainer;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.model.Configuration;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class ReferenceHeadConfigurationWizard extends JPanel implements Wizard {public static class __CLR4_5_2bdfbdflx1h1wka{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,14923,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceHead head;

    private JCheckBox chckbxSoftLimitsEnabled;
    private JTextField textFieldFeedRate;
    private JTextField textFieldPickDwell;
    private JTextField textFieldPlaceDwell;
    private JLabel lblNewLabel;
    private JLabel lblX;
    private JLabel lblY;
    private JLabel lblZ;
    private JLabel lblC;
    private JTextField textFieldSoftLimitsXMin;
    private JTextField textFieldSoftLimitsXMax;
    private JLabel lblMinimum;
    private JLabel lblMacimum;
    private JTextField textFieldSoftLimitsYMin;
    private JTextField textFieldSoftLimitsYMax;
    private JTextField textFieldSoftLimitsZMin;
    private JTextField textFieldSoftLimitsZMax;
    private JTextField textFieldSoftLimitsCMin;
    private JTextField textFieldSoftLimitsCMax;
    private JCheckBox chckbxVisionEnabled;
    private JLabel lblHomingDotDiameter;
    private JLabel lblNewLabel_1;
    private JTextField textFieldHomingDotDiameter;
    private JLabel lblX_1;
    private JLabel lblY_1;
    private JLabel lblZ_1;
    private JTextField textFieldHomingDotX;
    private JTextField textFieldHomingDotY;
    private JTextField textFieldHomingDotZ;
    private JButton btnSave;
    private JButton btnCancel;

    private WizardContainer wizardContainer;
    private JPanel panelGeneral;
    private JPanel panelSoftLimits;
    private JPanel panelHoming;
    private JPanel panelVision;
    private JPanel panelActions;
    private JLabel lblX_2;
    private JLabel lblY_2;
    private JLabel lblZ_2;
    private JLabel lblC_1;
    private JLabel lblHomeLocation;
    private JTextField textFieldHomeLocationX;
    private JTextField textFieldHomeLocationY;
    private JTextField textFieldHomeLocationZ;
    private JTextField textFieldHomeLocationC;
    private JScrollPane scrollPane;
    private JPanel panelMain;

    private List<WrappedBinding> wrappedBindings = new ArrayList<>();

    // TODO: Most of what this class did is deprecated and has been moved into
    // Nozzles, Actuators and Cameras. We may still want to do softlimits, but
    // these will likely move to the driver. Revisit this and see what is and
    // isn't needed.
    public ReferenceHeadConfigurationWizard(ReferenceHead head) {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14739);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14740);this.head = head;

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14741);setLayout(new BorderLayout(0, 0));

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14742);panelMain = new JPanel();

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14743);scrollPane = new JScrollPane(panelMain);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14744);scrollPane.getVerticalScrollBar()
                .setUnitIncrement(Configuration.get().getVerticalScrollUnitIncrement());
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14745);scrollPane.setBorder(null);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14746);panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14747);panelGeneral = new JPanel();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14748);panelMain.add(panelGeneral);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14749);panelGeneral.setBorder(new TitledBorder(null, "General", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14750);panelGeneral.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14751);label = new JLabel("Safe-Z");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14752);panelGeneral.add(label, "2, 2, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14753);textFieldSafeZ = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14754);textFieldSafeZ.setColumns(8);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14755);panelGeneral.add(textFieldSafeZ, "4, 2");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14756);JLabel lblFeedRate = new JLabel("Feed Rate (units/min)");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14757);panelGeneral.add(lblFeedRate, "6, 2, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14758);textFieldFeedRate = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14759);panelGeneral.add(textFieldFeedRate, "8, 2");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14760);textFieldFeedRate.setColumns(8);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14761);lblNewLabel = new JLabel("Pick Dwell (ms)");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14762);panelGeneral.add(lblNewLabel, "2, 4, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14763);textFieldPickDwell = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14764);panelGeneral.add(textFieldPickDwell, "4, 4");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14765);textFieldPickDwell.setColumns(8);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14766);JLabel lblPlaceDwell = new JLabel("Place Dwell (ms)");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14767);panelGeneral.add(lblPlaceDwell, "6, 4, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14768);textFieldPlaceDwell = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14769);panelGeneral.add(textFieldPlaceDwell, "8, 4");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14770);textFieldPlaceDwell.setColumns(8);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14771);panelSoftLimits = new JPanel();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14772);panelMain.add(panelSoftLimits);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14773);panelSoftLimits.setBorder(new TitledBorder(null, "Soft Limits", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14774);panelSoftLimits.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14775);chckbxSoftLimitsEnabled = new JCheckBox("Soft Limits Enabled?");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14776);panelSoftLimits.add(chckbxSoftLimitsEnabled, "2, 2, 5, 1");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14777);lblMinimum = new JLabel("Minimum");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14778);panelSoftLimits.add(lblMinimum, "4, 4");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14779);lblMacimum = new JLabel("Maximum");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14780);panelSoftLimits.add(lblMacimum, "6, 4");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14781);lblX = new JLabel("X");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14782);panelSoftLimits.add(lblX, "2, 6, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14783);textFieldSoftLimitsXMin = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14784);panelSoftLimits.add(textFieldSoftLimitsXMin, "4, 6");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14785);textFieldSoftLimitsXMin.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14786);textFieldSoftLimitsXMax = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14787);panelSoftLimits.add(textFieldSoftLimitsXMax, "6, 6");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14788);textFieldSoftLimitsXMax.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14789);lblY = new JLabel("Y");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14790);panelSoftLimits.add(lblY, "2, 8, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14791);textFieldSoftLimitsYMin = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14792);panelSoftLimits.add(textFieldSoftLimitsYMin, "4, 8");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14793);textFieldSoftLimitsYMin.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14794);textFieldSoftLimitsYMax = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14795);panelSoftLimits.add(textFieldSoftLimitsYMax, "6, 8");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14796);textFieldSoftLimitsYMax.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14797);lblZ = new JLabel("Z");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14798);panelSoftLimits.add(lblZ, "2, 10, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14799);textFieldSoftLimitsZMin = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14800);panelSoftLimits.add(textFieldSoftLimitsZMin, "4, 10");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14801);textFieldSoftLimitsZMin.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14802);textFieldSoftLimitsZMax = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14803);panelSoftLimits.add(textFieldSoftLimitsZMax, "6, 10");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14804);textFieldSoftLimitsZMax.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14805);lblC = new JLabel("C");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14806);panelSoftLimits.add(lblC, "2, 12, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14807);textFieldSoftLimitsCMin = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14808);panelSoftLimits.add(textFieldSoftLimitsCMin, "4, 12");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14809);textFieldSoftLimitsCMin.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14810);textFieldSoftLimitsCMax = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14811);panelSoftLimits.add(textFieldSoftLimitsCMax, "6, 12");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14812);textFieldSoftLimitsCMax.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14813);panelHoming = new JPanel();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14814);panelMain.add(panelHoming);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14815);panelHoming.setBorder(new TitledBorder(null, "Homing", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14816);panelHoming
                .setLayout(
                        new FormLayout(
                                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC,
                                        FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
                                        ColumnSpec.decode("default:grow"),
                                        FormSpecs.RELATED_GAP_COLSPEC,
                                        ColumnSpec.decode("default:grow"),
                                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec
                                                .decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14817);lblX_2 = new JLabel("X");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14818);panelHoming.add(lblX_2, "4, 2, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14819);lblY_2 = new JLabel("Y");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14820);panelHoming.add(lblY_2, "6, 2, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14821);lblZ_2 = new JLabel("Z");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14822);panelHoming.add(lblZ_2, "8, 2, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14823);lblC_1 = new JLabel("C");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14824);panelHoming.add(lblC_1, "10, 2, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14825);lblHomeLocation = new JLabel("Home Location");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14826);lblHomeLocation.setToolTipText(
                "Coordinates that will be applied when the machine is homed. This is position you want the DROs to show after homing.");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14827);panelHoming.add(lblHomeLocation, "2, 4, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14828);textFieldHomeLocationX = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14829);panelHoming.add(textFieldHomeLocationX, "4, 4, fill, default");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14830);textFieldHomeLocationX.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14831);textFieldHomeLocationY = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14832);panelHoming.add(textFieldHomeLocationY, "6, 4, fill, default");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14833);textFieldHomeLocationY.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14834);textFieldHomeLocationZ = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14835);panelHoming.add(textFieldHomeLocationZ, "8, 4, fill, default");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14836);textFieldHomeLocationZ.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14837);textFieldHomeLocationC = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14838);panelHoming.add(textFieldHomeLocationC, "10, 4, fill, default");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14839);textFieldHomeLocationC.setColumns(5);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14840);panelVision = new JPanel();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14841);panelMain.add(panelVision);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14842);panelVision.setBorder(new TitledBorder(null, "Vision", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14843);panelVision.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14844);chckbxVisionEnabled = new JCheckBox("Vision Enabled?");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14845);panelVision.add(chckbxVisionEnabled, "2, 2");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14846);lblX_1 = new JLabel("X");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14847);panelVision.add(lblX_1, "4, 4, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14848);lblY_1 = new JLabel("Y");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14849);panelVision.add(lblY_1, "6, 4, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14850);lblZ_1 = new JLabel("Z");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14851);panelVision.add(lblZ_1, "8, 4, center, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14852);lblNewLabel_1 = new JLabel("Homing Dot Location");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14853);lblNewLabel_1.setToolTipText(
                "The location of the homing dot in relation to the Home Location. When Vision is used for homing, this will be applied to the DROs after Vision Homing completes.");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14854);panelVision.add(lblNewLabel_1, "2, 6, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14855);textFieldHomingDotX = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14856);panelVision.add(textFieldHomingDotX, "4, 6");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14857);textFieldHomingDotX.setColumns(8);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14858);textFieldHomingDotY = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14859);panelVision.add(textFieldHomingDotY, "6, 6");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14860);textFieldHomingDotY.setColumns(8);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14861);textFieldHomingDotZ = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14862);panelVision.add(textFieldHomingDotZ, "8, 6");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14863);textFieldHomingDotZ.setColumns(8);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14864);lblHomingDotDiameter = new JLabel("Homing Dot Diameter (mm)");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14865);panelVision.add(lblHomingDotDiameter, "2, 8, right, default");

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14866);textFieldHomingDotDiameter = new JTextField();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14867);panelVision.add(textFieldHomingDotDiameter, "4, 8");
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14868);textFieldHomingDotDiameter.setColumns(5);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14869);add(scrollPane, BorderLayout.CENTER);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14870);panelActions = new JPanel();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14871);FlowLayout fl_panelActions = (FlowLayout) panelActions.getLayout();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14872);fl_panelActions.setAlignment(FlowLayout.RIGHT);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14873);add(panelActions, BorderLayout.SOUTH);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14874);btnCancel = new JButton(cancelAction);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14875);panelActions.add(btnCancel);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14876);btnSave = new JButton(saveAction);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14877);panelActions.add(btnSave);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14878);createBindings();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14879);loadFromModel();
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    private void createBindings() {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14880);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14881);LengthConverter lengthConverter = new LengthConverter();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14882);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14883);IntegerConverter integerConverter = new IntegerConverter();
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14884);ApplyResetBindingListener listener =
                new ApplyResetBindingListener(saveAction, cancelAction);
                // wrappedBindings.add(JBindings.bind(head, "safeZ", textFieldSafeZ, "text",
                // lengthConverter, listener));
                // wrappedBindings.add(JBindings.bind(head, "feedRate", textFieldFeedRate, "text",
                // lengthConverter, listener));
                // wrappedBindings.add(JBindings.bind(head, "pickDwellMilliseconds",
                // textFieldPickDwell, "text", integerConverter, listener));
                // wrappedBindings.add(JBindings.bind(head, "placeDwellMilliseconds",
                // textFieldPlaceDwell, "text", integerConverter, listener));

        // wrappedBindings.add(JBindings.bind(head, "softLimits.enabled", chckbxSoftLimitsEnabled,
        // "selected", listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.minimums.lengthX",
        // textFieldSoftLimitsXMin, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.maximums.lengthX",
        // textFieldSoftLimitsXMax, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.minimums.lengthY",
        // textFieldSoftLimitsYMin, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.maximums.lengthY",
        // textFieldSoftLimitsYMax, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.minimums.lengthZ",
        // textFieldSoftLimitsZMin, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.maximums.lengthZ",
        // textFieldSoftLimitsZMax, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.minimums.rotation",
        // textFieldSoftLimitsCMin, "text", doubleConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "softLimits.maximums.rotation",
        // textFieldSoftLimitsCMax, "text", doubleConverter, listener));

        // wrappedBindings.add(JBindings.bind(head, "homing.location.lengthX",
        // textFieldHomeLocationX, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.location.lengthY",
        // textFieldHomeLocationY, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.location.lengthZ",
        // textFieldHomeLocationZ, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.location.rotation",
        // textFieldHomeLocationC, "text", doubleConverter, listener));
        //
        // wrappedBindings.add(JBindings.bind(head, "homing.vision.enabled", chckbxVisionEnabled,
        // "selected", listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.vision.homingDotDiameter",
        // textFieldHomingDotDiameter, "text", doubleConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.vision.homingDotLocation.lengthX",
        // textFieldHomingDotX, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.vision.homingDotLocation.lengthY",
        // textFieldHomingDotY, "text", lengthConverter, listener));
        // wrappedBindings.add(JBindings.bind(head, "homing.vision.homingDotLocation.lengthZ",
        // textFieldHomingDotZ, "text", lengthConverter, listener));
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14885);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSafeZ);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14886);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldFeedRate);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14887);ComponentDecorators.decorateWithAutoSelect(textFieldPickDwell);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14888);ComponentDecorators.decorateWithAutoSelect(textFieldPlaceDwell);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14889);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSoftLimitsXMin);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14890);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSoftLimitsXMax);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14891);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSoftLimitsYMin);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14892);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSoftLimitsYMax);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14893);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSoftLimitsZMin);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14894);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSoftLimitsZMax);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14895);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldHomeLocationX);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14896);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldHomeLocationY);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14897);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldHomeLocationZ);

        __CLR4_5_2bdfbdflx1h1wka.R.inc(14898);ComponentDecorators.decorateWithAutoSelect(textFieldHomingDotDiameter);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14899);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldHomingDotX);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14900);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldHomingDotX);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14901);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldHomingDotX);
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    private void loadFromModel() {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14902);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14903);for (WrappedBinding wrappedBinding : wrappedBindings) {{
            __CLR4_5_2bdfbdflx1h1wka.R.inc(14904);wrappedBinding.reset();
        }
        }__CLR4_5_2bdfbdflx1h1wka.R.inc(14905);saveAction.setEnabled(false);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14906);cancelAction.setEnabled(false);
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    private void saveToModel() {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14907);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14908);for (WrappedBinding wrappedBinding : wrappedBindings) {{
            __CLR4_5_2bdfbdflx1h1wka.R.inc(14909);wrappedBinding.save();
        }
        }__CLR4_5_2bdfbdflx1h1wka.R.inc(14910);saveAction.setEnabled(false);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14911);cancelAction.setEnabled(false);
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    @Override
    public void setWizardContainer(WizardContainer wizardContainer) {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14912);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14913);this.wizardContainer = wizardContainer;
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    @Override
    public JPanel getWizardPanel() {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14914);
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14915);return this;
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    @Override
    public String getWizardName() {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14916);
        // TODO Auto-generated method stub
        __CLR4_5_2bdfbdflx1h1wka.R.inc(14917);return null;
    }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}

    private Action saveAction = new AbstractAction("Apply") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14918);
            __CLR4_5_2bdfbdflx1h1wka.R.inc(14919);saveToModel();
            __CLR4_5_2bdfbdflx1h1wka.R.inc(14920);wizardContainer.wizardCompleted(ReferenceHeadConfigurationWizard.this);
        }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}
    };

    private Action cancelAction = new AbstractAction("Reset") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2bdfbdflx1h1wka.R.inc(14921);
            __CLR4_5_2bdfbdflx1h1wka.R.inc(14922);loadFromModel();
        }finally{__CLR4_5_2bdfbdflx1h1wka.R.flushNeeded();}}
    };
    private JLabel label;
    private JTextField textFieldSafeZ;
}
