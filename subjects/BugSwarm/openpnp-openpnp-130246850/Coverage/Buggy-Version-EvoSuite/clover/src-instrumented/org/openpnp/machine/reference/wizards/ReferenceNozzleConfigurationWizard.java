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

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.machine.reference.ReferenceNozzle;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class ReferenceNozzleConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2bkybkylx1h0djy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,15062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceNozzle nozzle;

    private JTextField locationX;
    private JTextField locationY;
    private JTextField locationZ;
    private JPanel panelOffsets;
    private JPanel panelChanger;
    private JCheckBox chckbxChangerEnabled;
    private JCheckBox chckbxLimitRotationTo;
    private JTextField textFieldSafeZ;

    public ReferenceNozzleConfigurationWizard(ReferenceNozzle nozzle) {try{__CLR4_5_2bkybkylx1h0djy.R.inc(15010);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15011);this.nozzle = nozzle;

        __CLR4_5_2bkybkylx1h0djy.R.inc(15012);panelOffsets = new JPanel();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15013);panelOffsets.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Offsets", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_2bkybkylx1h0djy.R.inc(15014);panelOffsets.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bkybkylx1h0djy.R.inc(15015);JLabel lblX = new JLabel("X");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15016);panelOffsets.add(lblX, "2, 2");

        __CLR4_5_2bkybkylx1h0djy.R.inc(15017);JLabel lblY = new JLabel("Y");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15018);panelOffsets.add(lblY, "4, 2");

        __CLR4_5_2bkybkylx1h0djy.R.inc(15019);JLabel lblZ = new JLabel("Z");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15020);panelOffsets.add(lblZ, "6, 2");

        __CLR4_5_2bkybkylx1h0djy.R.inc(15021);locationX = new JTextField();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15022);panelOffsets.add(locationX, "2, 4");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15023);locationX.setColumns(5);

        __CLR4_5_2bkybkylx1h0djy.R.inc(15024);locationY = new JTextField();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15025);panelOffsets.add(locationY, "4, 4");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15026);locationY.setColumns(5);

        __CLR4_5_2bkybkylx1h0djy.R.inc(15027);locationZ = new JTextField();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15028);panelOffsets.add(locationZ, "6, 4");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15029);locationZ.setColumns(5);

        __CLR4_5_2bkybkylx1h0djy.R.inc(15030);contentPanel.add(panelOffsets);

        __CLR4_5_2bkybkylx1h0djy.R.inc(15031);JPanel panelSafeZ = new JPanel();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15032);panelSafeZ.setBorder(new TitledBorder(null, "Safe Z", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_2bkybkylx1h0djy.R.inc(15033);contentPanel.add(panelSafeZ);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15034);panelSafeZ.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bkybkylx1h0djy.R.inc(15035);JLabel lblSafeZ = new JLabel("Safe Z");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15036);panelSafeZ.add(lblSafeZ, "2, 2, right, default");

        __CLR4_5_2bkybkylx1h0djy.R.inc(15037);textFieldSafeZ = new JTextField();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15038);panelSafeZ.add(textFieldSafeZ, "4, 2, fill, default");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15039);textFieldSafeZ.setColumns(10);


        __CLR4_5_2bkybkylx1h0djy.R.inc(15040);panelChanger = new JPanel();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15041);panelChanger.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Settings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_2bkybkylx1h0djy.R.inc(15042);contentPanel.add(panelChanger);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15043);panelChanger
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
                                FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2bkybkylx1h0djy.R.inc(15044);chckbxChangerEnabled = new JCheckBox("Changer Enabled?");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15045);panelChanger.add(chckbxChangerEnabled, "2, 2");

        __CLR4_5_2bkybkylx1h0djy.R.inc(15046);chckbxLimitRotationTo = new JCheckBox("Limit Rotation to 180\u00ba");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15047);panelChanger.add(chckbxLimitRotationTo, "2, 4");


    }finally{__CLR4_5_2bkybkylx1h0djy.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2bkybkylx1h0djy.R.inc(15048);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15049);LengthConverter lengthConverter = new LengthConverter();

        __CLR4_5_2bkybkylx1h0djy.R.inc(15050);MutableLocationProxy headOffsets = new MutableLocationProxy();
        __CLR4_5_2bkybkylx1h0djy.R.inc(15051);bind(UpdateStrategy.READ_WRITE, nozzle, "headOffsets", headOffsets, "location");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15052);addWrappedBinding(headOffsets, "lengthX", locationX, "text", lengthConverter);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15053);addWrappedBinding(headOffsets, "lengthY", locationY, "text", lengthConverter);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15054);addWrappedBinding(headOffsets, "lengthZ", locationZ, "text", lengthConverter);

        __CLR4_5_2bkybkylx1h0djy.R.inc(15055);addWrappedBinding(nozzle, "changerEnabled", chckbxChangerEnabled, "selected");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15056);addWrappedBinding(nozzle, "limitRotation", chckbxLimitRotationTo, "selected");
        __CLR4_5_2bkybkylx1h0djy.R.inc(15057);addWrappedBinding(nozzle, "safeZ", textFieldSafeZ, "text", lengthConverter);

        __CLR4_5_2bkybkylx1h0djy.R.inc(15058);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(locationX);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15059);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(locationY);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15060);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(locationZ);
        __CLR4_5_2bkybkylx1h0djy.R.inc(15061);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldSafeZ);
    }finally{__CLR4_5_2bkybkylx1h0djy.R.flushNeeded();}}
}
