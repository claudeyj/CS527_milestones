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
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.reticle.FootprintReticle;
import org.openpnp.gui.components.reticle.Reticle;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.tablemodel.FootprintTableModel;
import org.openpnp.model.Configuration;
import org.openpnp.model.Footprint;
import org.openpnp.model.Footprint.Pad;
import org.openpnp.model.LengthUnit;
import org.openpnp.spi.Camera;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class FootprintPanel extends JPanel {public static class __CLR4_5_2g9g9lx1h30xd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(FootprintPanel.class);

    private FootprintTableModel tableModel;
    private JTable table;

    final private Footprint footprint;

    public FootprintPanel(Footprint footprint) {try{__CLR4_5_2g9g9lx1h30xd.R.inc(585);
        __CLR4_5_2g9g9lx1h30xd.R.inc(586);this.footprint = footprint;

        __CLR4_5_2g9g9lx1h30xd.R.inc(587);setLayout(new BorderLayout(0, 0));
        __CLR4_5_2g9g9lx1h30xd.R.inc(588);tableModel = new FootprintTableModel(footprint);

        __CLR4_5_2g9g9lx1h30xd.R.inc(589);deleteAction.setEnabled(false);

        __CLR4_5_2g9g9lx1h30xd.R.inc(590);JPanel propertiesPanel = new JPanel();
        __CLR4_5_2g9g9lx1h30xd.R.inc(591);add(propertiesPanel, BorderLayout.NORTH);
        __CLR4_5_2g9g9lx1h30xd.R.inc(592);propertiesPanel.setBorder(
                new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Settings",
                        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_2g9g9lx1h30xd.R.inc(593);propertiesPanel.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2g9g9lx1h30xd.R.inc(594);JLabel lblUnits = new JLabel("Units");
        __CLR4_5_2g9g9lx1h30xd.R.inc(595);propertiesPanel.add(lblUnits, "2, 2, right, default");

        __CLR4_5_2g9g9lx1h30xd.R.inc(596);unitsCombo = new JComboBox(LengthUnit.values());
        __CLR4_5_2g9g9lx1h30xd.R.inc(597);propertiesPanel.add(unitsCombo, "4, 2, left, default");

        __CLR4_5_2g9g9lx1h30xd.R.inc(598);JLabel lblBodyWidth = new JLabel("Body Width");
        __CLR4_5_2g9g9lx1h30xd.R.inc(599);propertiesPanel.add(lblBodyWidth, "2, 4, right, default");

        __CLR4_5_2g9g9lx1h30xd.R.inc(600);bodyWidthTf = new JTextField();
        __CLR4_5_2g9g9lx1h30xd.R.inc(601);propertiesPanel.add(bodyWidthTf, "4, 4, left, default");
        __CLR4_5_2g9g9lx1h30xd.R.inc(602);bodyWidthTf.setColumns(10);

        __CLR4_5_2g9g9lx1h30xd.R.inc(603);JLabel lblBodyHeight = new JLabel("Body Height");
        __CLR4_5_2g9g9lx1h30xd.R.inc(604);propertiesPanel.add(lblBodyHeight, "2, 6, right, default");

        __CLR4_5_2g9g9lx1h30xd.R.inc(605);bodyHeightTf = new JTextField();
        __CLR4_5_2g9g9lx1h30xd.R.inc(606);propertiesPanel.add(bodyHeightTf, "4, 6, left, default");
        __CLR4_5_2g9g9lx1h30xd.R.inc(607);bodyHeightTf.setColumns(10);

        __CLR4_5_2g9g9lx1h30xd.R.inc(608);JPanel tablePanel = new JPanel();
        __CLR4_5_2g9g9lx1h30xd.R.inc(609);add(tablePanel, BorderLayout.CENTER);
        __CLR4_5_2g9g9lx1h30xd.R.inc(610);tablePanel.setBorder(
                new TitledBorder(null, "Pads", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        __CLR4_5_2g9g9lx1h30xd.R.inc(611);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_2g9g9lx1h30xd.R.inc(612);table.setAutoCreateRowSorter(true);
        __CLR4_5_2g9g9lx1h30xd.R.inc(613);table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        __CLR4_5_2g9g9lx1h30xd.R.inc(614);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2g9g9lx1h30xd.R.inc(615);
                __CLR4_5_2g9g9lx1h30xd.R.inc(616);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2g9g9lx1h30xd.R.iget(617)!=0|true))||(__CLR4_5_2g9g9lx1h30xd.R.iget(618)==0&false))) {{
                    __CLR4_5_2g9g9lx1h30xd.R.inc(619);return;
                }

                }__CLR4_5_2g9g9lx1h30xd.R.inc(620);Pad pad = getSelectedPad();

                __CLR4_5_2g9g9lx1h30xd.R.inc(621);deleteAction.setEnabled(pad != null);
            }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}
        });
        __CLR4_5_2g9g9lx1h30xd.R.inc(622);tablePanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2g9g9lx1h30xd.R.inc(623);JPanel toolbarPanel = new JPanel();
        __CLR4_5_2g9g9lx1h30xd.R.inc(624);tablePanel.add(toolbarPanel, BorderLayout.NORTH);
        __CLR4_5_2g9g9lx1h30xd.R.inc(625);toolbarPanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2g9g9lx1h30xd.R.inc(626);JToolBar toolBar = new JToolBar();
        __CLR4_5_2g9g9lx1h30xd.R.inc(627);toolBar.setFloatable(false);
        __CLR4_5_2g9g9lx1h30xd.R.inc(628);toolbarPanel.add(toolBar);

        __CLR4_5_2g9g9lx1h30xd.R.inc(629);JButton btnNew = toolBar.add(newAction);
        __CLR4_5_2g9g9lx1h30xd.R.inc(630);JButton btnDelete = toolBar.add(deleteAction);


        __CLR4_5_2g9g9lx1h30xd.R.inc(631);JScrollPane tableScrollPane = new JScrollPane(table);
        __CLR4_5_2g9g9lx1h30xd.R.inc(632);tableScrollPane.setPreferredSize(new Dimension(454, 100));
        __CLR4_5_2g9g9lx1h30xd.R.inc(633);tablePanel.add(tableScrollPane);

        __CLR4_5_2g9g9lx1h30xd.R.inc(634);showReticle();
        __CLR4_5_2g9g9lx1h30xd.R.inc(635);initDataBindings();
    }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}

    protected void initDataBindings() {try{__CLR4_5_2g9g9lx1h30xd.R.inc(636);
        __CLR4_5_2g9g9lx1h30xd.R.inc(637);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());

        __CLR4_5_2g9g9lx1h30xd.R.inc(638);BeanProperty<Footprint, LengthUnit> footprintBeanProperty = BeanProperty.create("units");
        __CLR4_5_2g9g9lx1h30xd.R.inc(639);BeanProperty<JComboBox, Object> jComboBoxBeanProperty = BeanProperty.create("selectedItem");
        __CLR4_5_2g9g9lx1h30xd.R.inc(640);AutoBinding<Footprint, LengthUnit, JComboBox, Object> autoBinding =
                Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, footprint,
                        footprintBeanProperty, unitsCombo, jComboBoxBeanProperty);
        __CLR4_5_2g9g9lx1h30xd.R.inc(641);autoBinding.bind();
        //
        __CLR4_5_2g9g9lx1h30xd.R.inc(642);BeanProperty<Footprint, Double> footprintBeanProperty_1 = BeanProperty.create("bodyWidth");
        __CLR4_5_2g9g9lx1h30xd.R.inc(643);BeanProperty<JTextField, String> jTextFieldBeanProperty = BeanProperty.create("text");
        __CLR4_5_2g9g9lx1h30xd.R.inc(644);AutoBinding<Footprint, Double, JTextField, String> autoBinding_1 =
                Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, footprint,
                        footprintBeanProperty_1, bodyWidthTf, jTextFieldBeanProperty);
        __CLR4_5_2g9g9lx1h30xd.R.inc(645);autoBinding_1.setConverter(doubleConverter);
        __CLR4_5_2g9g9lx1h30xd.R.inc(646);autoBinding_1.bind();
        //
        __CLR4_5_2g9g9lx1h30xd.R.inc(647);BeanProperty<Footprint, Double> footprintBeanProperty_2 = BeanProperty.create("bodyHeight");
        __CLR4_5_2g9g9lx1h30xd.R.inc(648);BeanProperty<JTextField, String> jTextFieldBeanProperty_1 = BeanProperty.create("text");
        __CLR4_5_2g9g9lx1h30xd.R.inc(649);AutoBinding<Footprint, Double, JTextField, String> autoBinding_2 =
                Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, footprint,
                        footprintBeanProperty_2, bodyHeightTf, jTextFieldBeanProperty_1);
        __CLR4_5_2g9g9lx1h30xd.R.inc(650);autoBinding_2.setConverter(doubleConverter);
        __CLR4_5_2g9g9lx1h30xd.R.inc(651);autoBinding_2.bind();

        __CLR4_5_2g9g9lx1h30xd.R.inc(652);ComponentDecorators.decorateWithAutoSelect(bodyWidthTf);
        __CLR4_5_2g9g9lx1h30xd.R.inc(653);ComponentDecorators.decorateWithAutoSelect(bodyHeightTf);
    }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}

    private void showReticle() {try{__CLR4_5_2g9g9lx1h30xd.R.inc(654);
        __CLR4_5_2g9g9lx1h30xd.R.inc(655);try {
            __CLR4_5_2g9g9lx1h30xd.R.inc(656);Camera camera = Configuration.get().getMachine().getDefaultHead().getDefaultCamera();
            __CLR4_5_2g9g9lx1h30xd.R.inc(657);CameraView cameraView = MainFrame.cameraPanel.getCameraView(camera);
            __CLR4_5_2g9g9lx1h30xd.R.inc(658);if ((((cameraView == null)&&(__CLR4_5_2g9g9lx1h30xd.R.iget(659)!=0|true))||(__CLR4_5_2g9g9lx1h30xd.R.iget(660)==0&false))) {{
                __CLR4_5_2g9g9lx1h30xd.R.inc(661);return;
            }
            }__CLR4_5_2g9g9lx1h30xd.R.inc(662);cameraView.removeReticle(FootprintPanel.class.getName());
            __CLR4_5_2g9g9lx1h30xd.R.inc(663);Reticle reticle = new FootprintReticle(footprint);
            __CLR4_5_2g9g9lx1h30xd.R.inc(664);cameraView.setReticle(FootprintPanel.class.getName(), reticle);
        }
        catch (Exception e) {
            __CLR4_5_2g9g9lx1h30xd.R.inc(665);e.printStackTrace();
        }
    }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}

    private Pad getSelectedPad() {try{__CLR4_5_2g9g9lx1h30xd.R.inc(666);
        __CLR4_5_2g9g9lx1h30xd.R.inc(667);int index = table.getSelectedRow();
        __CLR4_5_2g9g9lx1h30xd.R.inc(668);if ((((index == -1)&&(__CLR4_5_2g9g9lx1h30xd.R.iget(669)!=0|true))||(__CLR4_5_2g9g9lx1h30xd.R.iget(670)==0&false))) {{
            __CLR4_5_2g9g9lx1h30xd.R.inc(671);return null;
        }
        }__CLR4_5_2g9g9lx1h30xd.R.inc(672);index = table.convertRowIndexToModel(index);
        __CLR4_5_2g9g9lx1h30xd.R.inc(673);return tableModel.getPad(index);
    }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}

    public final Action newAction = new AbstractAction() {
        {try{__CLR4_5_2g9g9lx1h30xd.R.inc(674);
            __CLR4_5_2g9g9lx1h30xd.R.inc(675);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_2g9g9lx1h30xd.R.inc(676);putValue(NAME, "New Part...");
            __CLR4_5_2g9g9lx1h30xd.R.inc(677);putValue(SHORT_DESCRIPTION, "Create a new part, specifying it's ID.");
        }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2g9g9lx1h30xd.R.inc(678);
            __CLR4_5_2g9g9lx1h30xd.R.inc(679);String name;
            __CLR4_5_2g9g9lx1h30xd.R.inc(680);while ((name = JOptionPane.showInputDialog(getTopLevelAncestor(),
                    "Please enter a name for the new pad.")) != null) {{
                __CLR4_5_2g9g9lx1h30xd.R.inc(683);Pad pad = new Pad();
                __CLR4_5_2g9g9lx1h30xd.R.inc(684);pad.setName(name);
                __CLR4_5_2g9g9lx1h30xd.R.inc(685);footprint.addPad(pad);
                __CLR4_5_2g9g9lx1h30xd.R.inc(686);tableModel.fireTableDataChanged();
                __CLR4_5_2g9g9lx1h30xd.R.inc(687);Helpers.selectLastTableRow(table);
                __CLR4_5_2g9g9lx1h30xd.R.inc(688);break;
            }
        }}finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}
    };

    public final Action deleteAction = new AbstractAction() {
        {try{__CLR4_5_2g9g9lx1h30xd.R.inc(689);
            __CLR4_5_2g9g9lx1h30xd.R.inc(690);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_2g9g9lx1h30xd.R.inc(691);putValue(NAME, "Delete Part");
            __CLR4_5_2g9g9lx1h30xd.R.inc(692);putValue(SHORT_DESCRIPTION, "Delete the currently selected part.");
        }finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2g9g9lx1h30xd.R.inc(693);
            __CLR4_5_2g9g9lx1h30xd.R.inc(694);int ret = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "Are you sure you want to delete " + getSelectedPad().getName() + "?",
                    "Delete " + getSelectedPad().getName() + "?", JOptionPane.YES_NO_OPTION);
            __CLR4_5_2g9g9lx1h30xd.R.inc(695);if ((((ret == JOptionPane.YES_OPTION)&&(__CLR4_5_2g9g9lx1h30xd.R.iget(696)!=0|true))||(__CLR4_5_2g9g9lx1h30xd.R.iget(697)==0&false))) {{
                __CLR4_5_2g9g9lx1h30xd.R.inc(698);footprint.removePad(getSelectedPad());
            }
        }}finally{__CLR4_5_2g9g9lx1h30xd.R.flushNeeded();}}
    };
    private JTextField bodyWidthTf;
    private JTextField bodyHeightTf;
    private JComboBox unitsCombo;
}
