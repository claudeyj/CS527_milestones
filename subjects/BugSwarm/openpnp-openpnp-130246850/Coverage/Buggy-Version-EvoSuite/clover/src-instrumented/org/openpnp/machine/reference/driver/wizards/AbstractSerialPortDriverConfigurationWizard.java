/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.driver.wizards;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.machine.reference.driver.AbstractSerialPortDriver;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class AbstractSerialPortDriverConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_29qa9qalx1h0c7o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,12671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final AbstractSerialPortDriver driver;
    private JComboBox comboBoxPort;
    private JComboBox comboBoxBaud;

    public AbstractSerialPortDriverConfigurationWizard(AbstractSerialPortDriver driver) {try{__CLR4_5_29qa9qalx1h0c7o.R.inc(12610);
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12611);this.driver = driver;

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12612);contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12613);JPanel panel = new JPanel();
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12614);contentPanel.add(panel);
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12615);panel.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12616);JLabel lblPortName = new JLabel("Port");
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12617);panel.add(lblPortName, "2, 2, right, default");

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12618);comboBoxPort = new JComboBox();
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12619);panel.add(comboBoxPort, "4, 2, fill, default");

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12620);JLabel lblBaudRate = new JLabel("Baud");
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12621);panel.add(lblBaudRate, "2, 4, right, default");

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12622);comboBoxBaud = new JComboBox();
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12623);panel.add(comboBoxBaud, "4, 4, fill, default");

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12624);comboBoxBaud.addItem(new Integer(110));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12625);comboBoxBaud.addItem(new Integer(300));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12626);comboBoxBaud.addItem(new Integer(600));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12627);comboBoxBaud.addItem(new Integer(1200));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12628);comboBoxBaud.addItem(new Integer(2400));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12629);comboBoxBaud.addItem(new Integer(4800));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12630);comboBoxBaud.addItem(new Integer(9600));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12631);comboBoxBaud.addItem(new Integer(14400));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12632);comboBoxBaud.addItem(new Integer(19200));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12633);comboBoxBaud.addItem(new Integer(38400));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12634);comboBoxBaud.addItem(new Integer(56000));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12635);comboBoxBaud.addItem(new Integer(57600));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12636);comboBoxBaud.addItem(new Integer(115200));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12637);comboBoxBaud.addItem(new Integer(128000));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12638);comboBoxBaud.addItem(new Integer(153600));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12639);comboBoxBaud.addItem(new Integer(230400));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12640);comboBoxBaud.addItem(new Integer(250000));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12641);comboBoxBaud.addItem(new Integer(256000));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12642);comboBoxBaud.addItem(new Integer(460800));
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12643);comboBoxBaud.addItem(new Integer(921600));

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12644);comboBoxPort.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {try{__CLR4_5_29qa9qalx1h0c7o.R.inc(12645);
                __CLR4_5_29qa9qalx1h0c7o.R.inc(12646);refreshPortList();
            }finally{__CLR4_5_29qa9qalx1h0c7o.R.flushNeeded();}}

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {try{__CLR4_5_29qa9qalx1h0c7o.R.inc(12647);}finally{__CLR4_5_29qa9qalx1h0c7o.R.flushNeeded();}}

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {try{__CLR4_5_29qa9qalx1h0c7o.R.inc(12648);}finally{__CLR4_5_29qa9qalx1h0c7o.R.flushNeeded();}}
        });

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12649);refreshPortList();
    }finally{__CLR4_5_29qa9qalx1h0c7o.R.flushNeeded();}}

    private void refreshPortList() {try{__CLR4_5_29qa9qalx1h0c7o.R.inc(12650);
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12651);if ((((driver != null)&&(__CLR4_5_29qa9qalx1h0c7o.R.iget(12652)!=0|true))||(__CLR4_5_29qa9qalx1h0c7o.R.iget(12653)==0&false))) {{
            __CLR4_5_29qa9qalx1h0c7o.R.inc(12654);comboBoxPort.removeAllItems();
            __CLR4_5_29qa9qalx1h0c7o.R.inc(12655);boolean exists = false;
            __CLR4_5_29qa9qalx1h0c7o.R.inc(12656);String[] portNames = driver.getPortNames();
            __CLR4_5_29qa9qalx1h0c7o.R.inc(12657);for (String portName : portNames) {{
                __CLR4_5_29qa9qalx1h0c7o.R.inc(12658);comboBoxPort.addItem(portName);
                __CLR4_5_29qa9qalx1h0c7o.R.inc(12659);if ((((portName.equals(driver.getPortName()))&&(__CLR4_5_29qa9qalx1h0c7o.R.iget(12660)!=0|true))||(__CLR4_5_29qa9qalx1h0c7o.R.iget(12661)==0&false))) {{
                    __CLR4_5_29qa9qalx1h0c7o.R.inc(12662);exists = true;
                }
            }}
            }__CLR4_5_29qa9qalx1h0c7o.R.inc(12663);if ((((!exists && driver.getPortName() != null)&&(__CLR4_5_29qa9qalx1h0c7o.R.iget(12664)!=0|true))||(__CLR4_5_29qa9qalx1h0c7o.R.iget(12665)==0&false))) {{
                __CLR4_5_29qa9qalx1h0c7o.R.inc(12666);comboBoxPort.addItem(driver.getPortName());
            }
        }}
    }}finally{__CLR4_5_29qa9qalx1h0c7o.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_29qa9qalx1h0c7o.R.inc(12667);
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12668);IntegerConverter integerConverter = new IntegerConverter();

        __CLR4_5_29qa9qalx1h0c7o.R.inc(12669);addWrappedBinding(driver, "portName", comboBoxPort, "selectedItem");
        __CLR4_5_29qa9qalx1h0c7o.R.inc(12670);addWrappedBinding(driver, "baud", comboBoxBaud, "selectedItem");
    }finally{__CLR4_5_29qa9qalx1h0c7o.R.flushNeeded();}}
}
