/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.driver.wizards;

import java.util.Locale;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.border.TitledBorder;

import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.machine.reference.driver.TinygDriver;

import com.google.gson.JsonObject;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class TinygDriverConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_29rz9rzlx1h1vlc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,12996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final TinygDriver driver;
    private JTextField m1StepAngle;
    private JTextField m2StepAngle;
    private JTextField m3StepAngle;
    private JTextField m4StepAngle;
    private JTextField m1TravelPerRev;
    private JTextField m2TravelPerRev;
    private JTextField m3TravelPerRev;
    private JTextField m4TravelPerRev;
    private JTextField xVelMax;
    private JTextField yVelMax;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField xFeedMax;
    private JTextField yFeedMax;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField xJerkMax;
    private JTextField yJerkMax;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JCheckBox m1PowerMgmt;
    private JCheckBox m2PowerMgmt;
    private JCheckBox m3PowerMgmt;
    private JCheckBox m4PowerMgmt;
    private JCheckBox m1RevPol;
    private JCheckBox m2RevPol;
    private JCheckBox m3RevPol;
    private JCheckBox m4RevPol;

    public TinygDriverConfigurationWizard(TinygDriver driver) {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12671);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12672);this.driver = driver;

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12673);contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12674);JPanel panelGeneral = new JPanel();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12675);panelGeneral.setBorder(new TitledBorder(null, "General Settings", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12676);contentPanel.add(panelGeneral);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12677);panelGeneral.setLayout(new FormLayout(new ColumnSpec[] {}, new RowSpec[] {}));

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12678);JPanel panelMotors = new JPanel();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12679);panelMotors.setBorder(new TitledBorder(null, "Motors", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12680);contentPanel.add(panelMotors);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12681);panelMotors
                .setLayout(
                        new FormLayout(
                                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC,
                                        FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
                                        ColumnSpec.decode("default:grow"),
                                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec
                                                .decode("default:grow"),
                                FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                                FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                        new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12682);JLabel label = new JLabel("1");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12683);panelMotors.add(label, "4, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12684);JLabel label_1 = new JLabel("2");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12685);panelMotors.add(label_1, "6, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12686);JLabel label_2 = new JLabel("3");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12687);panelMotors.add(label_2, "8, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12688);JLabel label_3 = new JLabel("4");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12689);panelMotors.add(label_3, "10, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12690);JLabel lblAxis = new JLabel("Axis");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12691);panelMotors.add(lblAxis, "2, 4, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12692);JSpinner m1Axis = new JSpinner();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12693);panelMotors.add(m1Axis, "4, 4");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12694);JSpinner m2Axis = new JSpinner();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12695);panelMotors.add(m2Axis, "6, 4");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12696);JSpinner m3Axis = new JSpinner();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12697);panelMotors.add(m3Axis, "8, 4");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12698);JSpinner m4Axis = new JSpinner();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12699);panelMotors.add(m4Axis, "10, 4");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12700);JLabel lblStepAngle = new JLabel("Step Angle");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12701);panelMotors.add(lblStepAngle, "2, 6, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12702);m1StepAngle = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12703);m1StepAngle.setText("1.8");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12704);panelMotors.add(m1StepAngle, "4, 6");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12705);m1StepAngle.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12706);m2StepAngle = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12707);m2StepAngle.setText("1.8");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12708);panelMotors.add(m2StepAngle, "6, 6");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12709);m2StepAngle.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12710);m3StepAngle = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12711);m3StepAngle.setText("1.8");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12712);panelMotors.add(m3StepAngle, "8, 6");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12713);m3StepAngle.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12714);m4StepAngle = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12715);m4StepAngle.setText("1.8");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12716);panelMotors.add(m4StepAngle, "10, 6");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12717);m4StepAngle.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12718);JLabel lblTravelPerRev = new JLabel("Travel Per Rev.");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12719);panelMotors.add(lblTravelPerRev, "2, 8, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12720);m1TravelPerRev = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12721);panelMotors.add(m1TravelPerRev, "4, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12722);m1TravelPerRev.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12723);m2TravelPerRev = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12724);panelMotors.add(m2TravelPerRev, "6, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12725);m2TravelPerRev.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12726);m3TravelPerRev = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12727);panelMotors.add(m3TravelPerRev, "8, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12728);m3TravelPerRev.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12729);m4TravelPerRev = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12730);panelMotors.add(m4TravelPerRev, "10, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12731);m4TravelPerRev.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12732);JLabel lblMicrosteps = new JLabel("Microsteps");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12733);panelMotors.add(lblMicrosteps, "2, 10, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12734);JSpinner m1Microsteps = new JSpinner(new SpinnerListModel(
                new Object[] {(Integer) 1, (Integer) 2, (Integer) 4, (Integer) 8}));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12735);panelMotors.add(m1Microsteps, "4, 10");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12736);JSpinner m2Microsteps = new JSpinner(new SpinnerListModel(
                new Object[] {(Integer) 1, (Integer) 2, (Integer) 4, (Integer) 8}));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12737);panelMotors.add(m2Microsteps, "6, 10");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12738);JSpinner m3Microsteps = new JSpinner(new SpinnerListModel(
                new Object[] {(Integer) 1, (Integer) 2, (Integer) 4, (Integer) 8}));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12739);panelMotors.add(m3Microsteps, "8, 10");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12740);JSpinner m4Microsteps = new JSpinner(new SpinnerListModel(
                new Object[] {(Integer) 1, (Integer) 2, (Integer) 4, (Integer) 8}));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12741);panelMotors.add(m4Microsteps, "10, 10");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12742);JLabel lblPolarity = new JLabel("Reverse Polarity");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12743);panelMotors.add(lblPolarity, "2, 12, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12744);m1RevPol = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12745);panelMotors.add(m1RevPol, "4, 12");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12746);m2RevPol = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12747);panelMotors.add(m2RevPol, "6, 12");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12748);m3RevPol = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12749);panelMotors.add(m3RevPol, "8, 12");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12750);m4RevPol = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12751);panelMotors.add(m4RevPol, "10, 12");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12752);JLabel lblPowerManagement = new JLabel("Power Management");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12753);panelMotors.add(lblPowerManagement, "2, 14");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12754);m1PowerMgmt = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12755);panelMotors.add(m1PowerMgmt, "4, 14");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12756);m2PowerMgmt = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12757);panelMotors.add(m2PowerMgmt, "6, 14");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12758);m3PowerMgmt = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12759);panelMotors.add(m3PowerMgmt, "8, 14");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12760);m4PowerMgmt = new JCheckBox("");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12761);panelMotors.add(m4PowerMgmt, "10, 14");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12762);JPanel panelAxes = new JPanel();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12763);panelAxes.setBorder(
                new TitledBorder(null, "Axes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12764);contentPanel.add(panelAxes);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12765);panelAxes.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12766);JLabel lblX = new JLabel("X");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12767);panelAxes.add(lblX, "4, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12768);JLabel lblY = new JLabel("Y");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12769);panelAxes.add(lblY, "6, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12770);JLabel lblZ = new JLabel("Z");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12771);panelAxes.add(lblZ, "8, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12772);JLabel lblA = new JLabel("A");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12773);panelAxes.add(lblA, "10, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12774);JLabel lblB = new JLabel("B");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12775);panelAxes.add(lblB, "12, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12776);JLabel lblC = new JLabel("C");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12777);panelAxes.add(lblC, "14, 2");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12778);JLabel lblAxisMode = new JLabel("Axis Mode");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12779);panelAxes.add(lblAxisMode, "2, 4, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12780);JComboBox xAxisMode = new JComboBox();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12781);panelAxes.add(xAxisMode, "4, 4, fill, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12782);JComboBox yAxisMode = new JComboBox();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12783);panelAxes.add(yAxisMode, "6, 4, fill, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12784);JComboBox comboBox_10 = new JComboBox();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12785);panelAxes.add(comboBox_10, "8, 4, fill, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12786);JComboBox comboBox_11 = new JComboBox();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12787);panelAxes.add(comboBox_11, "10, 4, fill, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12788);JComboBox comboBox_12 = new JComboBox();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12789);panelAxes.add(comboBox_12, "12, 4, fill, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12790);JComboBox comboBox_13 = new JComboBox();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12791);panelAxes.add(comboBox_13, "14, 4, fill, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12792);JLabel lblVelocityMax = new JLabel("Velocity Max.");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12793);panelAxes.add(lblVelocityMax, "2, 6, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12794);xVelMax = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12795);panelAxes.add(xVelMax, "4, 6, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12796);xVelMax.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12797);yVelMax = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12798);panelAxes.add(yVelMax, "6, 6, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12799);yVelMax.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12800);textField_10 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12801);panelAxes.add(textField_10, "8, 6, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12802);textField_10.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12803);textField_11 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12804);panelAxes.add(textField_11, "10, 6, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12805);textField_11.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12806);textField_12 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12807);panelAxes.add(textField_12, "12, 6, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12808);textField_12.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12809);textField_13 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12810);panelAxes.add(textField_13, "14, 6, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12811);textField_13.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12812);JLabel lblFeedrateMax = new JLabel("Feedrate Max.");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12813);panelAxes.add(lblFeedrateMax, "2, 8, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12814);xFeedMax = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12815);panelAxes.add(xFeedMax, "4, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12816);xFeedMax.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12817);yFeedMax = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12818);panelAxes.add(yFeedMax, "6, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12819);yFeedMax.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12820);textField_16 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12821);panelAxes.add(textField_16, "8, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12822);textField_16.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12823);textField_17 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12824);panelAxes.add(textField_17, "10, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12825);textField_17.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12826);textField_18 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12827);panelAxes.add(textField_18, "12, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12828);textField_18.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12829);textField_19 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12830);panelAxes.add(textField_19, "14, 8, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12831);textField_19.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12832);JLabel lblJerkMax = new JLabel("Jerk Max.");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12833);panelAxes.add(lblJerkMax, "2, 10, right, default");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12834);xJerkMax = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12835);panelAxes.add(xJerkMax, "4, 10, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12836);xJerkMax.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12837);yJerkMax = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12838);panelAxes.add(yJerkMax, "6, 10, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12839);yJerkMax.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12840);textField_22 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12841);panelAxes.add(textField_22, "8, 10, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12842);textField_22.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12843);textField_23 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12844);panelAxes.add(textField_23, "10, 10, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12845);textField_23.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12846);textField_24 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12847);panelAxes.add(textField_24, "12, 10, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12848);textField_24.setColumns(10);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12849);textField_25 = new JTextField();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12850);panelAxes.add(textField_25, "14, 10, fill, default");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12851);textField_25.setColumns(10);
    }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12852);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12853);IntegerConverter integerConverter = new IntegerConverter();
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12854);DoubleConverter doubleConverter = new DoubleConverter("%f");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12855);ConfigProxy configProxy = new ConfigProxy();

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12856);addWrappedBinding(configProxy, "stepAngleM1", m1StepAngle, "text", doubleConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12857);addWrappedBinding(configProxy, "stepAngleM2", m2StepAngle, "text", doubleConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12858);addWrappedBinding(configProxy, "stepAngleM3", m3StepAngle, "text", doubleConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12859);addWrappedBinding(configProxy, "stepAngleM4", m4StepAngle, "text", doubleConverter);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12860);addWrappedBinding(configProxy, "travelPerRevM1", m1TravelPerRev, "text", doubleConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12861);addWrappedBinding(configProxy, "travelPerRevM2", m2TravelPerRev, "text", doubleConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12862);addWrappedBinding(configProxy, "travelPerRevM3", m3TravelPerRev, "text", doubleConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12863);addWrappedBinding(configProxy, "travelPerRevM4", m4TravelPerRev, "text", doubleConverter);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12864);addWrappedBinding(configProxy, "polarityReversedM1", m1RevPol, "selected");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12865);addWrappedBinding(configProxy, "polarityReversedM2", m2RevPol, "selected");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12866);addWrappedBinding(configProxy, "polarityReversedM3", m3RevPol, "selected");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12867);addWrappedBinding(configProxy, "polarityReversedM4", m4RevPol, "selected");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12868);addWrappedBinding(configProxy, "powerMgmtM1", m1PowerMgmt, "selected");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12869);addWrappedBinding(configProxy, "powerMgmtM2", m2PowerMgmt, "selected");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12870);addWrappedBinding(configProxy, "powerMgmtM3", m3PowerMgmt, "selected");
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12871);addWrappedBinding(configProxy, "powerMgmtM4", m4PowerMgmt, "selected");

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12872);addWrappedBinding(configProxy, "velMaxX", xVelMax, "text", integerConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12873);addWrappedBinding(configProxy, "velMaxY", yVelMax, "text", integerConverter);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12874);addWrappedBinding(configProxy, "feedMaxX", xFeedMax, "text", integerConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12875);addWrappedBinding(configProxy, "feedMaxY", yFeedMax, "text", integerConverter);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12876);addWrappedBinding(configProxy, "jerkMaxX", xJerkMax, "text", integerConverter);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12877);addWrappedBinding(configProxy, "jerkMaxY", yJerkMax, "text", integerConverter);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12878);ComponentDecorators.decorateWithAutoSelect(m1StepAngle);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12879);ComponentDecorators.decorateWithAutoSelect(m2StepAngle);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12880);ComponentDecorators.decorateWithAutoSelect(m3StepAngle);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12881);ComponentDecorators.decorateWithAutoSelect(m4StepAngle);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12882);ComponentDecorators.decorateWithAutoSelect(m1TravelPerRev);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12883);ComponentDecorators.decorateWithAutoSelect(m2TravelPerRev);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12884);ComponentDecorators.decorateWithAutoSelect(m3TravelPerRev);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12885);ComponentDecorators.decorateWithAutoSelect(m4TravelPerRev);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12886);ComponentDecorators.decorateWithAutoSelect(xVelMax);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12887);ComponentDecorators.decorateWithAutoSelect(yVelMax);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12888);ComponentDecorators.decorateWithAutoSelect(xFeedMax);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12889);ComponentDecorators.decorateWithAutoSelect(yFeedMax);

        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12890);ComponentDecorators.decorateWithAutoSelect(xJerkMax);
        __CLR4_5_29rz9rzlx1h1vlc.R.inc(12891);ComponentDecorators.decorateWithAutoSelect(yJerkMax);
    }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}


    public class ConfigProxy {
        // [1ma] m1 map to axis 0 [0=X,1=Y,2=Z...]
        // [1sa] m1 step angle 1.800 deg
        // [1tr] m1 travel per revolution 1.250 mm
        // [1mi] m1 microsteps 8 [1,2,4,8]
        // [1po] m1 polarity 0 [0=normal,1=reverse]
        // [1pm] m1 power management 1 [0=off,1=on]
        // tinyg [mm] ok>

        // [xam] x axis mode 1 [standard]
        // [xvm] x velocity maximum 5000.000 mm/min
        // [xfr] x feedrate maximum 5000.000 mm/min
        // [xtm] x travel maximum 150.000 mm
        // [xjm] x jerk maximum 20000000 mm/min^3
        // [xjh] x jerk homing 20000000 mm/min^3
        // [xjd] x junction deviation 0.0500 mm (larger is faster)
        // [xsn] x switch min 1 [0=off,1=homing,2=limit,3=limit+homing]
        // [xsx] x switch max 0 [0=off,1=homing,2=limit,3=limit+homing]
        // [xsv] x search velocity 500.000 mm/min
        // [xlv] x latch velocity 100.000 mm/min
        // [xlb] x latch backoff 2.000 mm
        // [xzb] x zero backoff 1.000 mm
        // tinyg [mm] ok>


        public double getStepAngleM1() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12892);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12893);return getConfigDouble("1sa");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setStepAngleM1(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12894);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12895);setConfigDouble("1sa", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public double getStepAngleM2() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12896);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12897);return getConfigDouble("2sa");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setStepAngleM2(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12898);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12899);setConfigDouble("2sa", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public double getStepAngleM3() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12900);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12901);return getConfigDouble("3sa");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setStepAngleM3(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12902);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12903);setConfigDouble("3sa", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public double getStepAngleM4() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12904);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12905);return getConfigDouble("4sa");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setStepAngleM4(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12906);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12907);setConfigDouble("4sa", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        public double getTravelPerRevM1() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12908);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12909);return getConfigDouble("1tr");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setTravelPerRevM1(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12910);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12911);setConfigDouble("1tr", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public double getTravelPerRevM2() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12912);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12913);return getConfigDouble("2tr");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setTravelPerRevM2(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12914);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12915);setConfigDouble("2tr", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public double getTravelPerRevM3() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12916);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12917);return getConfigDouble("3tr");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setTravelPerRevM3(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12918);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12919);setConfigDouble("3tr", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public double getTravelPerRevM4() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12920);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12921);return getConfigDouble("4tr");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setTravelPerRevM4(double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12922);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12923);setConfigDouble("4tr", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        public boolean getPolarityReversedM1() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12924);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12925);return getConfigBoolean("1po");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPolarityReversedM1(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12926);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12927);setConfigBoolean("1po", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public boolean getPolarityReversedM2() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12928);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12929);return getConfigBoolean("2po");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPolarityReversedM2(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12930);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12931);setConfigBoolean("2po", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public boolean getPolarityReversedM3() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12932);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12933);return getConfigBoolean("3po");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPolarityReversedM3(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12934);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12935);setConfigBoolean("3po", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public boolean getPolarityReversedM4() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12936);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12937);return getConfigBoolean("4po");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPolarityReversedM4(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12938);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12939);setConfigBoolean("4po", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        public boolean getPowerMgmtM1() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12940);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12941);return getConfigBoolean("1pm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPowerMgmtM1(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12942);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12943);setConfigBoolean("1pm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public boolean getPowerMgmtM2() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12944);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12945);return getConfigBoolean("2pm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPowerMgmtM2(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12946);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12947);setConfigBoolean("2pm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public boolean getPowerMgmtM3() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12948);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12949);return getConfigBoolean("3pm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPowerMgmtM3(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12950);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12951);setConfigBoolean("3pm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public boolean getPowerMgmtM4() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12952);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12953);return getConfigBoolean("4pm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setPowerMgmtM4(boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12954);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12955);setConfigBoolean("4pm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        public int getVelMaxX() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12956);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12957);return getConfigInt("xvm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setVelMaxX(int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12958);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12959);setConfigInt("xvm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public int getVelMaxY() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12960);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12961);return getConfigInt("yvm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setVelMaxY(int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12962);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12963);setConfigInt("yvm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        public int getFeedMaxX() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12964);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12965);return getConfigInt("xfr");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setFeedMaxX(int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12966);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12967);setConfigInt("xfr", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public int getFeedMaxY() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12968);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12969);return getConfigInt("yfr");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setFeedMaxY(int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12970);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12971);setConfigInt("yfr", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        public int getJerkMaxX() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12972);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12973);return getConfigInt("xjm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setJerkMaxX(int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12974);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12975);setConfigInt("xjm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public int getJerkMaxY() throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12976);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12977);return getConfigInt("yjm");
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        public void setJerkMaxY(int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12978);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12979);setConfigInt("yjm", v);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}



        // TODO: Check for response errors in these methods.
        private int getConfigInt(String name) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12980);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12981);JsonObject o = driver.sendCommand(String.format(Locale.US, "{\"%s\":\"\"}", name));
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12982);return o.get(name).getAsInt();
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        private void setConfigInt(String name, int v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12983);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12984);JsonObject o = driver.sendCommand(String.format(Locale.US, "{\"%s\":%d}", name, v));
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        private double getConfigDouble(String name) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12985);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12986);JsonObject o = driver.sendCommand(String.format(Locale.US, "{\"%s\":\"\"}", name));
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12987);return o.get(name).getAsDouble();
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        private void setConfigDouble(String name, double v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12988);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12989);JsonObject o = driver.sendCommand(String.format(Locale.US, "{\"%s\":%f}", name, v));
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        private boolean getConfigBoolean(String name) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12990);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12991);return getConfigInt(name) == 1;
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}

        private void setConfigBoolean(String name, boolean v) throws Exception {try{__CLR4_5_29rz9rzlx1h1vlc.R.inc(12992);
            __CLR4_5_29rz9rzlx1h1vlc.R.inc(12993);setConfigInt(name, (((v )&&(__CLR4_5_29rz9rzlx1h1vlc.R.iget(12994)!=0|true))||(__CLR4_5_29rz9rzlx1h1vlc.R.iget(12995)==0&false))? 1 : 0);
        }finally{__CLR4_5_29rz9rzlx1h1vlc.R.flushNeeded();}}
    }
}
