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

package org.openpnp.gui.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class ClassSelectionDialog<T> extends JDialog {public static class __CLR4_5_23jc3jclx1h724q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,4644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Class<? extends T> selectedClass;
    private JList list;

    public ClassSelectionDialog(Frame parent, String title, String description,
            List<Class<? extends T>> classes) {
        super(parent, title, true);__CLR4_5_23jc3jclx1h724q.R.inc(4585);try{__CLR4_5_23jc3jclx1h724q.R.inc(4584);

        __CLR4_5_23jc3jclx1h724q.R.inc(4586);JPanel panel = new JPanel();
        __CLR4_5_23jc3jclx1h724q.R.inc(4587);panel.setBorder(new EmptyBorder(8, 8, 4, 8));
        __CLR4_5_23jc3jclx1h724q.R.inc(4588);getContentPane().add(panel, BorderLayout.CENTER);
        __CLR4_5_23jc3jclx1h724q.R.inc(4589);panel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_23jc3jclx1h724q.R.inc(4590);JPanel panelActions = new JPanel();
        __CLR4_5_23jc3jclx1h724q.R.inc(4591);panel.add(panelActions, BorderLayout.SOUTH);
        __CLR4_5_23jc3jclx1h724q.R.inc(4592);panelActions.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        __CLR4_5_23jc3jclx1h724q.R.inc(4593);JButton btnCancel = new JButton(cancelAction);
        __CLR4_5_23jc3jclx1h724q.R.inc(4594);panelActions.add(btnCancel);

        __CLR4_5_23jc3jclx1h724q.R.inc(4595);JButton btnSelect = new JButton(selectAction);
        __CLR4_5_23jc3jclx1h724q.R.inc(4596);panelActions.add(btnSelect);

        __CLR4_5_23jc3jclx1h724q.R.inc(4597);JLabel lblDescription =
                new JLabel("Please select an implemention class from the list.");
        __CLR4_5_23jc3jclx1h724q.R.inc(4598);lblDescription.setBorder(new EmptyBorder(4, 4, 8, 4));
        __CLR4_5_23jc3jclx1h724q.R.inc(4599);panel.add(lblDescription, BorderLayout.NORTH);
        __CLR4_5_23jc3jclx1h724q.R.inc(4600);lblDescription.setHorizontalAlignment(SwingConstants.LEFT);

        __CLR4_5_23jc3jclx1h724q.R.inc(4601);lblDescription.setText(description);
        __CLR4_5_23jc3jclx1h724q.R.inc(4602);list = new JList();
        __CLR4_5_23jc3jclx1h724q.R.inc(4603);list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {try{__CLR4_5_23jc3jclx1h724q.R.inc(4604);
                __CLR4_5_23jc3jclx1h724q.R.inc(4605);if ((((e.getClickCount() == 2)&&(__CLR4_5_23jc3jclx1h724q.R.iget(4606)!=0|true))||(__CLR4_5_23jc3jclx1h724q.R.iget(4607)==0&false))) {{
                    __CLR4_5_23jc3jclx1h724q.R.inc(4608);selectAction.actionPerformed(null);
                }
            }}finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}
        });
        __CLR4_5_23jc3jclx1h724q.R.inc(4609);list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        __CLR4_5_23jc3jclx1h724q.R.inc(4610);list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        __CLR4_5_23jc3jclx1h724q.R.inc(4611);panel.add(new JScrollPane(list), BorderLayout.CENTER);
        // setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        __CLR4_5_23jc3jclx1h724q.R.inc(4612);setSize(400, 400);
        __CLR4_5_23jc3jclx1h724q.R.inc(4613);setLocationRelativeTo(parent);

        __CLR4_5_23jc3jclx1h724q.R.inc(4614);DefaultListModel listModel = new DefaultListModel();
        __CLR4_5_23jc3jclx1h724q.R.inc(4615);list.setModel(listModel);
        __CLR4_5_23jc3jclx1h724q.R.inc(4616);for (Class<? extends T> clz : classes) {{
            __CLR4_5_23jc3jclx1h724q.R.inc(4617);listModel.addElement(new ClassListItem<>(clz));
        }

        }__CLR4_5_23jc3jclx1h724q.R.inc(4618);list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_23jc3jclx1h724q.R.inc(4619);
                __CLR4_5_23jc3jclx1h724q.R.inc(4620);if ((((e.getValueIsAdjusting())&&(__CLR4_5_23jc3jclx1h724q.R.iget(4621)!=0|true))||(__CLR4_5_23jc3jclx1h724q.R.iget(4622)==0&false))) {{
                    __CLR4_5_23jc3jclx1h724q.R.inc(4623);return;
                }
                }__CLR4_5_23jc3jclx1h724q.R.inc(4624);selectAction.setEnabled(ClassSelectionDialog.this.list.getSelectedValue() != null);
            }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}
        });

        __CLR4_5_23jc3jclx1h724q.R.inc(4625);JRootPane rootPane = getRootPane();
        __CLR4_5_23jc3jclx1h724q.R.inc(4626);KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        __CLR4_5_23jc3jclx1h724q.R.inc(4627);InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        __CLR4_5_23jc3jclx1h724q.R.inc(4628);inputMap.put(stroke, "ESCAPE");
        __CLR4_5_23jc3jclx1h724q.R.inc(4629);rootPane.getActionMap().put("ESCAPE", cancelAction);

        __CLR4_5_23jc3jclx1h724q.R.inc(4630);selectAction.setEnabled(false);
    }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}

    private final Action selectAction = new AbstractAction("Accept") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23jc3jclx1h724q.R.inc(4631);
            __CLR4_5_23jc3jclx1h724q.R.inc(4632);selectedClass = ((ClassListItem<T>) list.getSelectedValue()).getTheClass();
            __CLR4_5_23jc3jclx1h724q.R.inc(4633);setVisible(false);
        }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}
    };

    private final Action cancelAction = new AbstractAction("Cancel") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23jc3jclx1h724q.R.inc(4634);
            __CLR4_5_23jc3jclx1h724q.R.inc(4635);setVisible(false);
        }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}
    };

    public Class<? extends T> getSelectedClass() {try{__CLR4_5_23jc3jclx1h724q.R.inc(4636);
        __CLR4_5_23jc3jclx1h724q.R.inc(4637);return selectedClass;
    }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}

    private class ClassListItem<T1> {
        private Class<? extends T1> clz;

        public ClassListItem(Class<? extends T1> clz) {try{__CLR4_5_23jc3jclx1h724q.R.inc(4638);
            __CLR4_5_23jc3jclx1h724q.R.inc(4639);this.clz = clz;
        }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_23jc3jclx1h724q.R.inc(4640);
            __CLR4_5_23jc3jclx1h724q.R.inc(4641);return clz.getSimpleName();
        }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}

        public Class<? extends T1> getTheClass() {try{__CLR4_5_23jc3jclx1h724q.R.inc(4642);
            __CLR4_5_23jc3jclx1h724q.R.inc(4643);return clz;
        }finally{__CLR4_5_23jc3jclx1h724q.R.flushNeeded();}}
    }
}
