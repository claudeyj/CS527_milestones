/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.wizards;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.model.Configuration;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class ReferenceCameraConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2b8lb8llx1h0dhr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,14739,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceCamera referenceCamera;

    private JTextField textFieldOffX;
    private JTextField textFieldOffY;
    private JTextField textFieldOffZ;
    private JPanel panelOffsets;
    private JPanel panelGeneral;
    private JLabel lblRotation;
    private JTextField textFieldRotation;
    private JPanel panelLocation;
    private JLabel lblX;
    private JLabel lblY;
    private JLabel lblZ;
    private JLabel lblRotation_1;
    private JTextField textFieldLocationX;
    private JTextField textFieldLocationY;
    private JTextField textFieldLocationZ;
    private JTextField textFieldLocationRotation;
    private LocationButtonsPanel locationButtonsPanel;
    private JCheckBox chckbxFlipX;
    private JLabel lblFlipX;
    private JLabel lblFlipY;
    private JCheckBox checkBoxFlipY;
    private JTextField textFieldSafeZ;
    private JLabel lblOffsetX;
    private JLabel lblOffsetY;
    private JTextField textFieldOffsetX;
    private JTextField textFieldOffsetY;
    private JPanel panelLensCalibration;
    private JLabel lblApplyCalibration;
    private JCheckBox calibrationEnabledChk;


    public ReferenceCameraConfigurationWizard(ReferenceCamera referenceCamera) {try{__CLR4_5_2b8lb8llx1h0dhr.R.inc(14565);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14566);this.referenceCamera = referenceCamera;

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14567);panelOffsets = new JPanel();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14568);contentPanel.add(panelOffsets);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14569);panelOffsets.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Offsets", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14570);panelOffsets.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14571);JLabel olblX = new JLabel("X");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14572);panelOffsets.add(olblX, "2, 2");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14573);JLabel olblY = new JLabel("Y");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14574);panelOffsets.add(olblY, "4, 2");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14575);JLabel olblZ = new JLabel("Z");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14576);panelOffsets.add(olblZ, "6, 2");


        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14577);textFieldOffX = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14578);panelOffsets.add(textFieldOffX, "2, 4");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14579);textFieldOffX.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14580);textFieldOffY = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14581);panelOffsets.add(textFieldOffY, "4, 4");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14582);textFieldOffY.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14583);textFieldOffZ = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14584);panelOffsets.add(textFieldOffZ, "6, 4");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14585);textFieldOffZ.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14586);JPanel panelSafeZ = new JPanel();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14587);panelSafeZ.setBorder(new TitledBorder(null, "Safe Z", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14588);contentPanel.add(panelSafeZ);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14589);panelSafeZ.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14590);JLabel lblSafeZ = new JLabel("Safe Z");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14591);panelSafeZ.add(lblSafeZ, "2, 2, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14592);textFieldSafeZ = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14593);panelSafeZ.add(textFieldSafeZ, "4, 2, fill, default");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14594);textFieldSafeZ.setColumns(10);


        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14595);panelGeneral = new JPanel();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14596);panelGeneral.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Transformation", TitledBorder.LEADING, TitledBorder.TOP, null,
                new Color(0, 0, 0)));
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14597);contentPanel.add(panelGeneral);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14598);panelGeneral.setLayout(new FormLayout(new ColumnSpec[] {
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                ColumnSpec.decode("default:grow"),},
            new RowSpec[] {
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14599);lblRotation = new JLabel("Rotation");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14600);panelGeneral.add(lblRotation, "2, 2, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14601);textFieldRotation = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14602);panelGeneral.add(textFieldRotation, "4, 2");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14603);textFieldRotation.setColumns(10);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14604);lblOffsetX = new JLabel("Offset X");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14605);panelGeneral.add(lblOffsetX, "2, 4, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14606);textFieldOffsetX = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14607);panelGeneral.add(textFieldOffsetX, "4, 4");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14608);textFieldOffsetX.setColumns(10);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14609);lblOffsetY = new JLabel("Offset Y");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14610);panelGeneral.add(lblOffsetY, "2, 6, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14611);textFieldOffsetY = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14612);panelGeneral.add(textFieldOffsetY, "4, 6");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14613);textFieldOffsetY.setColumns(10);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14614);lblFlipX = new JLabel("Flip Vertical");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14615);panelGeneral.add(lblFlipX, "2, 8, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14616);chckbxFlipX = new JCheckBox("");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14617);panelGeneral.add(chckbxFlipX, "4, 8");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14618);lblFlipY = new JLabel("Flip Horizontal");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14619);panelGeneral.add(lblFlipY, "2, 10, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14620);checkBoxFlipY = new JCheckBox("");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14621);panelGeneral.add(checkBoxFlipY, "4, 10");
        
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14622);lblCropX = new JLabel("Crop Width");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14623);panelGeneral.add(lblCropX, "2, 12, right, default");
        
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14624);cropWidthTextField = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14625);panelGeneral.add(cropWidthTextField, "4, 12");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14626);cropWidthTextField.setColumns(10);
        
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14627);lblNewLabel = new JLabel("(Use 0 for no crop)");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14628);panelGeneral.add(lblNewLabel, "5, 12");
        
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14629);lblCropHeight = new JLabel("Crop Height");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14630);panelGeneral.add(lblCropHeight, "2, 14, right, default");
        
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14631);cropHeightTextField = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14632);panelGeneral.add(cropHeightTextField, "4, 14");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14633);cropHeightTextField.setColumns(10);
        
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14634);lblNewLabel_1 = new JLabel("(Use 0 for no crop)");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14635);panelGeneral.add(lblNewLabel_1, "5, 14");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14636);panelLocation = new JPanel();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14637);panelLocation.setBorder(new TitledBorder(null, "Location", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14638);contentPanel.add(panelLocation);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14639);panelLocation.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),}));

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14640);lblX = new JLabel("X");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14641);panelLocation.add(lblX, "2, 2");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14642);lblY = new JLabel("Y");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14643);panelLocation.add(lblY, "4, 2");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14644);lblZ = new JLabel("Z");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14645);panelLocation.add(lblZ, "6, 2");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14646);lblRotation_1 = new JLabel("Rotation");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14647);panelLocation.add(lblRotation_1, "8, 2");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14648);textFieldLocationX = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14649);panelLocation.add(textFieldLocationX, "2, 4, fill, default");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14650);textFieldLocationX.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14651);textFieldLocationY = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14652);panelLocation.add(textFieldLocationY, "4, 4, fill, default");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14653);textFieldLocationY.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14654);textFieldLocationZ = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14655);panelLocation.add(textFieldLocationZ, "6, 4, fill, default");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14656);textFieldLocationZ.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14657);textFieldLocationRotation = new JTextField();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14658);panelLocation.add(textFieldLocationRotation, "8, 4, fill, default");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14659);textFieldLocationRotation.setColumns(8);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14660);panelLensCalibration = new JPanel();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14661);panelLensCalibration.setBorder(new TitledBorder(null, "Lens Calibration",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14662);contentPanel.add(panelLensCalibration);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14663);panelLensCalibration.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14664);startLensCalibrationBtn = new JButton(startCalibration);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14665);panelLensCalibration.add(startLensCalibrationBtn, "2, 2, 3, 1");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14666);lblApplyCalibration = new JLabel("Apply Calibration?");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14667);panelLensCalibration.add(lblApplyCalibration, "2, 4, right, default");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14668);calibrationEnabledChk = new JCheckBox("");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14669);panelLensCalibration.add(calibrationEnabledChk, "4, 4");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14670);try {
            // Causes WindowBuilder to fail, so just throw away the error.
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14671);if ((((referenceCamera.getHead() == null)&&(__CLR4_5_2b8lb8llx1h0dhr.R.iget(14672)!=0|true))||(__CLR4_5_2b8lb8llx1h0dhr.R.iget(14673)==0&false))) {{
                __CLR4_5_2b8lb8llx1h0dhr.R.inc(14674);locationButtonsPanel = new LocationButtonsPanel(textFieldLocationX,
                        textFieldLocationY, textFieldLocationZ, textFieldLocationRotation);
                __CLR4_5_2b8lb8llx1h0dhr.R.inc(14675);panelLocation.add(locationButtonsPanel, "10, 4, fill, fill");
                __CLR4_5_2b8lb8llx1h0dhr.R.inc(14676);panelOffsets.setVisible(false);
            }
            }else {{
                __CLR4_5_2b8lb8llx1h0dhr.R.inc(14677);panelLocation.setVisible(false);
            }
        }}
        catch (Exception e) {

        }
    }finally{__CLR4_5_2b8lb8llx1h0dhr.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2b8lb8llx1h0dhr.R.inc(14678);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14679);IntegerConverter intConverter = new IntegerConverter();
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14680);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14681);LengthConverter lengthConverter = new LengthConverter();

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14682);if ((((referenceCamera.getHead() == null)&&(__CLR4_5_2b8lb8llx1h0dhr.R.iget(14683)!=0|true))||(__CLR4_5_2b8lb8llx1h0dhr.R.iget(14684)==0&false))) {{
            // fixed camera
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14685);MutableLocationProxy headOffsets = new MutableLocationProxy();
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14686);bind(UpdateStrategy.READ_WRITE, referenceCamera, "headOffsets", headOffsets,
                    "location");
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14687);addWrappedBinding(headOffsets, "lengthX", textFieldLocationX, "text", lengthConverter);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14688);addWrappedBinding(headOffsets, "lengthY", textFieldLocationY, "text", lengthConverter);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14689);addWrappedBinding(headOffsets, "lengthZ", textFieldLocationZ, "text", lengthConverter);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14690);addWrappedBinding(headOffsets, "rotation", textFieldLocationRotation, "text",
                    doubleConverter);
        }
        }else {{
            // moving camera
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14691);MutableLocationProxy headOffsets = new MutableLocationProxy();
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14692);bind(UpdateStrategy.READ_WRITE, referenceCamera, "headOffsets", headOffsets,
                    "location");
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14693);addWrappedBinding(headOffsets, "lengthX", textFieldOffX, "text", lengthConverter);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14694);addWrappedBinding(headOffsets, "lengthY", textFieldOffY, "text", lengthConverter);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14695);addWrappedBinding(headOffsets, "lengthZ", textFieldOffZ, "text", lengthConverter);
        }

        }__CLR4_5_2b8lb8llx1h0dhr.R.inc(14696);addWrappedBinding(referenceCamera, "rotation", textFieldRotation, "text", doubleConverter);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14697);addWrappedBinding(referenceCamera, "offsetX", textFieldOffsetX, "text", intConverter);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14698);addWrappedBinding(referenceCamera, "offsetY", textFieldOffsetY, "text", intConverter);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14699);addWrappedBinding(referenceCamera, "flipX", chckbxFlipX, "selected");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14700);addWrappedBinding(referenceCamera, "flipY", checkBoxFlipY, "selected");
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14701);addWrappedBinding(referenceCamera, "safeZ", textFieldSafeZ, "text", lengthConverter);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14702);addWrappedBinding(referenceCamera, "cropWidth", cropWidthTextField, "text", intConverter);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14703);addWrappedBinding(referenceCamera, "cropHeight", cropHeightTextField, "text", intConverter);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14704);bind(UpdateStrategy.READ_WRITE, referenceCamera.getCalibration(), "enabled",
                calibrationEnabledChk, "selected");
        // addWrappedBinding(referenceCamera.getCalibration(), "enabled", calibrationEnabledChk,
        // "selected");

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14705);ComponentDecorators.decorateWithAutoSelect(textFieldRotation);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14706);ComponentDecorators.decorateWithAutoSelect(textFieldOffsetX);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14707);ComponentDecorators.decorateWithAutoSelect(textFieldOffsetY);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14708);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldOffX);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14709);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldOffY);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14710);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldOffZ);

        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14711);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationX);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14712);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationY);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14713);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationZ);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14714);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationRotation);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14715);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSafeZ);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14716);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(cropWidthTextField);
        __CLR4_5_2b8lb8llx1h0dhr.R.inc(14717);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(cropHeightTextField);
    }finally{__CLR4_5_2b8lb8llx1h0dhr.R.flushNeeded();}}

    private Action startCalibration = new AbstractAction("Start Lens Calibration") {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_2b8lb8llx1h0dhr.R.inc(14718);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14719);MainFrame.cameraPanel.setSelectedCamera(referenceCamera);

            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14720);startLensCalibrationBtn.setAction(cancelCalibration);

            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14721);CameraView cameraView = MainFrame.cameraPanel.getCameraView(referenceCamera);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14722);String message =
                    "Go to https://github.com/openpnp/openpnp/wiki/Camera-Lens-Calibration for detailed instructions.\n"
                            + "When you have your calibration card ready, hold it in front of the camera so that the entire card is visible.\n"
                            + "Each time the screen flashes an image is captured. After the flash you should move the card to a new orientation.";
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14723);cameraView.setText(message);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14724);cameraView.flash();

            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14725);referenceCamera.startCalibration((progressCurrent, progressMax, finished) -> {
                __CLR4_5_2b8lb8llx1h0dhr.R.inc(14726);if ((((finished)&&(__CLR4_5_2b8lb8llx1h0dhr.R.iget(14727)!=0|true))||(__CLR4_5_2b8lb8llx1h0dhr.R.iget(14728)==0&false))) {{
                    __CLR4_5_2b8lb8llx1h0dhr.R.inc(14729);cameraView.setText(null);
                    __CLR4_5_2b8lb8llx1h0dhr.R.inc(14730);startLensCalibrationBtn.setAction(startCalibration);
                }
                }else {{
                    __CLR4_5_2b8lb8llx1h0dhr.R.inc(14731);cameraView.setText(String.format(
                            "Captured %d of %d.\nMove the card to a new position and angle each time the screen flashes.",
                            progressCurrent, progressMax));
                }
                }__CLR4_5_2b8lb8llx1h0dhr.R.inc(14732);cameraView.flash();
            });
        }finally{__CLR4_5_2b8lb8llx1h0dhr.R.flushNeeded();}}
    };

    private Action cancelCalibration = new AbstractAction("Cancel Lens Calibration") {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_2b8lb8llx1h0dhr.R.inc(14733);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14734);startLensCalibrationBtn.setAction(startCalibration);

            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14735);referenceCamera.cancelCalibration();

            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14736);CameraView cameraView = MainFrame.cameraPanel.getCameraView(referenceCamera);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14737);cameraView.setText(null);
            __CLR4_5_2b8lb8llx1h0dhr.R.inc(14738);cameraView.flash();
        }finally{__CLR4_5_2b8lb8llx1h0dhr.R.flushNeeded();}}
    };
    private JButton startLensCalibrationBtn;
    private JLabel lblCropX;
    private JLabel lblCropHeight;
    private JTextField cropWidthTextField;
    private JTextField cropHeightTextField;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
}
