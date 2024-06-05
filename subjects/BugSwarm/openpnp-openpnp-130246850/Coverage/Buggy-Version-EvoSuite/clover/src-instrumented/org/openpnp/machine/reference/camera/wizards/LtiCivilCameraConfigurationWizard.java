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

package org.openpnp.machine.reference.camera.wizards;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.openpnp.machine.reference.camera.LtiCivilCamera;
import org.openpnp.machine.reference.wizards.ReferenceCameraConfigurationWizard;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class LtiCivilCameraConfigurationWizard extends ReferenceCameraConfigurationWizard {public static class __CLR4_5_28bk8bklx1h0b45{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,10804,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final LtiCivilCamera camera;

    private JPanel panelGeneral;
    private JComboBox comboBoxDeviceId;
    private JCheckBox chckbxForceGrayscale;

    public LtiCivilCameraConfigurationWizard(LtiCivilCamera camera) {
        super(camera);__CLR4_5_28bk8bklx1h0b45.R.inc(10785);try{__CLR4_5_28bk8bklx1h0b45.R.inc(10784);

        __CLR4_5_28bk8bklx1h0b45.R.inc(10786);this.camera = camera;

        __CLR4_5_28bk8bklx1h0b45.R.inc(10787);panelGeneral = new JPanel();
        __CLR4_5_28bk8bklx1h0b45.R.inc(10788);contentPanel.add(panelGeneral);
        __CLR4_5_28bk8bklx1h0b45.R.inc(10789);panelGeneral.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_28bk8bklx1h0b45.R.inc(10790);panelGeneral.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_28bk8bklx1h0b45.R.inc(10791);JLabel lblDeviceId = new JLabel("Device ID");
        __CLR4_5_28bk8bklx1h0b45.R.inc(10792);panelGeneral.add(lblDeviceId, "2, 2, right, default");

        __CLR4_5_28bk8bklx1h0b45.R.inc(10793);Object[] deviceIds = null;
        __CLR4_5_28bk8bklx1h0b45.R.inc(10794);try {
            __CLR4_5_28bk8bklx1h0b45.R.inc(10795);deviceIds = camera.getDeviceIds().toArray(new String[] {});
        }
        catch (Exception e) {
            // TODO:
        }
        __CLR4_5_28bk8bklx1h0b45.R.inc(10796);comboBoxDeviceId = new JComboBox(deviceIds);
        __CLR4_5_28bk8bklx1h0b45.R.inc(10797);panelGeneral.add(comboBoxDeviceId, "4, 2, left, default");

        __CLR4_5_28bk8bklx1h0b45.R.inc(10798);chckbxForceGrayscale = new JCheckBox("Force Grayscale?");
        __CLR4_5_28bk8bklx1h0b45.R.inc(10799);panelGeneral.add(chckbxForceGrayscale, "2, 4, 3, 1");
    }finally{__CLR4_5_28bk8bklx1h0b45.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_28bk8bklx1h0b45.R.inc(10800);
        __CLR4_5_28bk8bklx1h0b45.R.inc(10801);super.createBindings();
        // The order of the properties is important. We want all the booleans
        // to be set before we set the driver because setting the driver
        // applies all the settings.
        __CLR4_5_28bk8bklx1h0b45.R.inc(10802);addWrappedBinding(camera, "forceGrayscale", chckbxForceGrayscale, "selected");
        __CLR4_5_28bk8bklx1h0b45.R.inc(10803);addWrappedBinding(camera, "deviceId", comboBoxDeviceId, "selectedItem");
    }finally{__CLR4_5_28bk8bklx1h0b45.R.flushNeeded();}}

}
