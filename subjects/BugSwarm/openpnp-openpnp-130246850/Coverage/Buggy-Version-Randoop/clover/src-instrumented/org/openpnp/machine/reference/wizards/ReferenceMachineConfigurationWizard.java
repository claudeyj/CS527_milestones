/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.wizards;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.machine.openbuilds.OpenBuildsDriver;
import org.openpnp.machine.reference.ReferenceDriver;
import org.openpnp.machine.reference.ReferenceMachine;
import org.openpnp.machine.reference.driver.GcodeDriver;
import org.openpnp.machine.reference.driver.GrblDriver;
import org.openpnp.machine.reference.driver.LinuxCNC;
import org.openpnp.machine.reference.driver.MarlinDriver;
import org.openpnp.machine.reference.driver.NullDriver;
import org.openpnp.machine.reference.driver.SimulatorDriver;
import org.openpnp.machine.reference.driver.SprinterDriver;
import org.openpnp.machine.reference.driver.TinygDriver;
import org.openpnp.model.Configuration;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class ReferenceMachineConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2bitbitlx1h1wla{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,15010,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    final private ReferenceMachine machine;
    private JComboBox comboBoxDriver;
    private String driverClassName;
    private JTextField discardXTf;
    private JTextField discardYTf;
    private JTextField discardZTf;
    private JTextField discardCTf;

    public ReferenceMachineConfigurationWizard(ReferenceMachine machine) {try{__CLR4_5_2bitbitlx1h1wla.R.inc(14933);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14934);this.machine = machine;

        __CLR4_5_2bitbitlx1h1wla.R.inc(14935);JPanel panelGeneral = new JPanel();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14936);contentPanel.add(panelGeneral);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14937);panelGeneral.setBorder(new TitledBorder(null, "General", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bitbitlx1h1wla.R.inc(14938);panelGeneral.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));
        __CLR4_5_2bitbitlx1h1wla.R.inc(14939);JLabel lblDriver = new JLabel("Driver");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14940);panelGeneral.add(lblDriver, "2, 2");

        __CLR4_5_2bitbitlx1h1wla.R.inc(14941);comboBoxDriver = new JComboBox();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14942);panelGeneral.add(comboBoxDriver, "4, 2");

        __CLR4_5_2bitbitlx1h1wla.R.inc(14943);comboBoxDriver.addItem(NullDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14944);comboBoxDriver.addItem(GcodeDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14945);comboBoxDriver.addItem(GrblDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14946);comboBoxDriver.addItem(LinuxCNC.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14947);comboBoxDriver.addItem(MarlinDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14948);comboBoxDriver.addItem(SimulatorDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14949);comboBoxDriver.addItem(SprinterDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14950);comboBoxDriver.addItem(TinygDriver.class.getCanonicalName());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14951);comboBoxDriver.addItem(OpenBuildsDriver.class.getCanonicalName());

        __CLR4_5_2bitbitlx1h1wla.R.inc(14952);JPanel panelLocations = new JPanel();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14953);panelLocations.setBorder(new TitledBorder(null, "Locations", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bitbitlx1h1wla.R.inc(14954);contentPanel.add(panelLocations);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14955);panelLocations.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bitbitlx1h1wla.R.inc(14956);JLabel lblX = new JLabel("X");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14957);panelLocations.add(lblX, "4, 2");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14958);lblX.setHorizontalAlignment(SwingConstants.CENTER);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14959);JLabel lblY = new JLabel("Y");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14960);panelLocations.add(lblY, "6, 2");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14961);lblY.setHorizontalAlignment(SwingConstants.CENTER);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14962);JLabel lblZ = new JLabel("Z");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14963);panelLocations.add(lblZ, "8, 2");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14964);lblZ.setHorizontalAlignment(SwingConstants.CENTER);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14965);JLabel lblRotation = new JLabel("Rotation");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14966);panelLocations.add(lblRotation, "10, 2");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14967);lblRotation.setHorizontalAlignment(SwingConstants.CENTER);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14968);JLabel lblDiscardPoint = new JLabel("Discard Location");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14969);panelLocations.add(lblDiscardPoint, "2, 4");

        __CLR4_5_2bitbitlx1h1wla.R.inc(14970);discardXTf = new JTextField();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14971);panelLocations.add(discardXTf, "4, 4");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14972);discardXTf.setColumns(5);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14973);discardYTf = new JTextField();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14974);panelLocations.add(discardYTf, "6, 4");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14975);discardYTf.setColumns(5);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14976);discardZTf = new JTextField();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14977);panelLocations.add(discardZTf, "8, 4");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14978);discardZTf.setColumns(5);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14979);discardCTf = new JTextField();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14980);panelLocations.add(discardCTf, "10, 4");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14981);discardCTf.setColumns(5);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14982);LocationButtonsPanel locationButtonsPanel =
                new LocationButtonsPanel(discardXTf, discardYTf, discardZTf, discardCTf);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14983);panelLocations.add(locationButtonsPanel, "12, 4");

        __CLR4_5_2bitbitlx1h1wla.R.inc(14984);this.driverClassName = machine.getDriver().getClass().getCanonicalName();
    }finally{__CLR4_5_2bitbitlx1h1wla.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2bitbitlx1h1wla.R.inc(14985);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14986);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());
        __CLR4_5_2bitbitlx1h1wla.R.inc(14987);LengthConverter lengthConverter = new LengthConverter();

        __CLR4_5_2bitbitlx1h1wla.R.inc(14988);addWrappedBinding(this, "driverClassName", comboBoxDriver, "selectedItem");

        __CLR4_5_2bitbitlx1h1wla.R.inc(14989);MutableLocationProxy discardLocation = new MutableLocationProxy();
        __CLR4_5_2bitbitlx1h1wla.R.inc(14990);bind(UpdateStrategy.READ_WRITE, machine, "discardLocation", discardLocation, "location");
        __CLR4_5_2bitbitlx1h1wla.R.inc(14991);addWrappedBinding(discardLocation, "lengthX", discardXTf, "text", lengthConverter);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14992);addWrappedBinding(discardLocation, "lengthY", discardYTf, "text", lengthConverter);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14993);addWrappedBinding(discardLocation, "lengthZ", discardZTf, "text", lengthConverter);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14994);addWrappedBinding(discardLocation, "rotation", discardCTf, "text", doubleConverter);

        __CLR4_5_2bitbitlx1h1wla.R.inc(14995);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(discardXTf);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14996);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(discardYTf);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14997);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(discardZTf);
        __CLR4_5_2bitbitlx1h1wla.R.inc(14998);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(discardCTf);
    }finally{__CLR4_5_2bitbitlx1h1wla.R.flushNeeded();}}

    public String getDriverClassName() {try{__CLR4_5_2bitbitlx1h1wla.R.inc(14999);
        __CLR4_5_2bitbitlx1h1wla.R.inc(15000);return driverClassName;
    }finally{__CLR4_5_2bitbitlx1h1wla.R.flushNeeded();}}

    public void setDriverClassName(String driverClassName) throws Exception {try{__CLR4_5_2bitbitlx1h1wla.R.inc(15001);
        __CLR4_5_2bitbitlx1h1wla.R.inc(15002);if ((((machine.getDriver().getClass().getCanonicalName().equals(driverClassName))&&(__CLR4_5_2bitbitlx1h1wla.R.iget(15003)!=0|true))||(__CLR4_5_2bitbitlx1h1wla.R.iget(15004)==0&false))) {{
            __CLR4_5_2bitbitlx1h1wla.R.inc(15005);return;
        }
        }__CLR4_5_2bitbitlx1h1wla.R.inc(15006);ReferenceDriver driver = (ReferenceDriver) Class.forName(driverClassName).newInstance();
        __CLR4_5_2bitbitlx1h1wla.R.inc(15007);machine.setDriver(driver);
        __CLR4_5_2bitbitlx1h1wla.R.inc(15008);this.driverClassName = driverClassName;
        __CLR4_5_2bitbitlx1h1wla.R.inc(15009);MessageBoxes.errorBox(getTopLevelAncestor(), "Restart Required",
                "Please restart OpenPnP for the changes to take effect.");
    }finally{__CLR4_5_2bitbitlx1h1wla.R.flushNeeded();}}
}
