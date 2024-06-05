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
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.openpnp.Main;

@SuppressWarnings("serial")
public class AboutDialog extends JDialog {public static class __CLR4_5_24q4qlx1h03pq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final JPanel contentPanel = new JPanel();

    public AboutDialog(Frame frame) {
        super(frame, true);__CLR4_5_24q4qlx1h03pq.R.inc(171);try{__CLR4_5_24q4qlx1h03pq.R.inc(170);
        __CLR4_5_24q4qlx1h03pq.R.inc(172);setTitle("About OpenPnP");
        __CLR4_5_24q4qlx1h03pq.R.inc(173);setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        __CLR4_5_24q4qlx1h03pq.R.inc(174);setBounds(100, 100, 347, 360);
        __CLR4_5_24q4qlx1h03pq.R.inc(175);getContentPane().setLayout(new BorderLayout());
        __CLR4_5_24q4qlx1h03pq.R.inc(176);contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        __CLR4_5_24q4qlx1h03pq.R.inc(177);getContentPane().add(contentPanel, BorderLayout.CENTER);
        __CLR4_5_24q4qlx1h03pq.R.inc(178);contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        __CLR4_5_24q4qlx1h03pq.R.inc(179);JLabel lblOpenpnp = new JLabel("OpenPnP");
        __CLR4_5_24q4qlx1h03pq.R.inc(180);lblOpenpnp.setAlignmentX(Component.CENTER_ALIGNMENT);
        __CLR4_5_24q4qlx1h03pq.R.inc(181);lblOpenpnp.setFont(new Font("Lucida Grande", Font.BOLD, 32));
        __CLR4_5_24q4qlx1h03pq.R.inc(182);contentPanel.add(lblOpenpnp);
        __CLR4_5_24q4qlx1h03pq.R.inc(183);JLabel lblCopyright = new JLabel("Copyright \u00a9 2011, 2012, 2013 Jason von Nieda");
        __CLR4_5_24q4qlx1h03pq.R.inc(184);lblCopyright.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        __CLR4_5_24q4qlx1h03pq.R.inc(185);lblCopyright.setAlignmentX(Component.CENTER_ALIGNMENT);
        __CLR4_5_24q4qlx1h03pq.R.inc(186);contentPanel.add(lblCopyright);
        __CLR4_5_24q4qlx1h03pq.R.inc(187);JLabel lblVersion = new JLabel("Version: " + Main.getVersion());
        __CLR4_5_24q4qlx1h03pq.R.inc(188);lblVersion.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        __CLR4_5_24q4qlx1h03pq.R.inc(189);lblVersion.setAlignmentX(Component.CENTER_ALIGNMENT);
        __CLR4_5_24q4qlx1h03pq.R.inc(190);contentPanel.add(lblVersion);
        __CLR4_5_24q4qlx1h03pq.R.inc(191);JPanel buttonPane = new JPanel();
        __CLR4_5_24q4qlx1h03pq.R.inc(192);buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        __CLR4_5_24q4qlx1h03pq.R.inc(193);getContentPane().add(buttonPane, BorderLayout.SOUTH);
        __CLR4_5_24q4qlx1h03pq.R.inc(194);JButton okButton = new JButton("OK");
        __CLR4_5_24q4qlx1h03pq.R.inc(195);okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_24q4qlx1h03pq.R.inc(196);
                __CLR4_5_24q4qlx1h03pq.R.inc(197);setVisible(false);
            }finally{__CLR4_5_24q4qlx1h03pq.R.flushNeeded();}}
        });
        __CLR4_5_24q4qlx1h03pq.R.inc(198);okButton.setActionCommand("OK");
        __CLR4_5_24q4qlx1h03pq.R.inc(199);buttonPane.add(okButton);
        __CLR4_5_24q4qlx1h03pq.R.inc(200);getRootPane().setDefaultButton(okButton);
    }finally{__CLR4_5_24q4qlx1h03pq.R.flushNeeded();}}
}
