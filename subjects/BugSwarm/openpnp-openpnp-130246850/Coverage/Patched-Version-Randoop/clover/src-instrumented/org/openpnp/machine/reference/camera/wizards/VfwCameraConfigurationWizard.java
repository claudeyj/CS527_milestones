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

import org.openpnp.machine.reference.camera.VfwCamera;
import org.openpnp.machine.reference.wizards.ReferenceCameraConfigurationWizard;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class VfwCameraConfigurationWizard extends ReferenceCameraConfigurationWizard {public static class __CLR4_5_28di8dilx1h74w4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,10879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final VfwCamera camera;

    private JPanel panelGeneral;
    private JComboBox comboBoxDriver;
    private JCheckBox chckbxShowVideoSource;
    private JCheckBox chckbxShowVideoFormat;
    private JCheckBox chckbxShowVideoDisplay;

    public VfwCameraConfigurationWizard(VfwCamera camera) {
        super(camera);__CLR4_5_28di8dilx1h74w4.R.inc(10855);try{__CLR4_5_28di8dilx1h74w4.R.inc(10854);

        __CLR4_5_28di8dilx1h74w4.R.inc(10856);this.camera = camera;

        __CLR4_5_28di8dilx1h74w4.R.inc(10857);panelGeneral = new JPanel();
        __CLR4_5_28di8dilx1h74w4.R.inc(10858);contentPanel.add(panelGeneral);
        __CLR4_5_28di8dilx1h74w4.R.inc(10859);panelGeneral.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_28di8dilx1h74w4.R.inc(10860);panelGeneral.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_28di8dilx1h74w4.R.inc(10861);JLabel lblDeviceId = new JLabel("Driver");
        __CLR4_5_28di8dilx1h74w4.R.inc(10862);panelGeneral.add(lblDeviceId, "2, 2, right, default");

        __CLR4_5_28di8dilx1h74w4.R.inc(10863);Object[] deviceIds = null;
        __CLR4_5_28di8dilx1h74w4.R.inc(10864);try {
            __CLR4_5_28di8dilx1h74w4.R.inc(10865);deviceIds = camera.getDrivers().toArray(new String[] {});
        }
        catch (Exception e) {
            // TODO:
        }

        __CLR4_5_28di8dilx1h74w4.R.inc(10866);comboBoxDriver = new JComboBox(deviceIds);
        __CLR4_5_28di8dilx1h74w4.R.inc(10867);panelGeneral.add(comboBoxDriver, "4, 2, left, default");

        __CLR4_5_28di8dilx1h74w4.R.inc(10868);chckbxShowVideoSource = new JCheckBox("Show Video Source Dialog?");
        __CLR4_5_28di8dilx1h74w4.R.inc(10869);panelGeneral.add(chckbxShowVideoSource, "2, 4, 3, 1");

        __CLR4_5_28di8dilx1h74w4.R.inc(10870);chckbxShowVideoFormat = new JCheckBox("Show Video Format Dialog?");
        __CLR4_5_28di8dilx1h74w4.R.inc(10871);panelGeneral.add(chckbxShowVideoFormat, "2, 6, 3, 1");

        __CLR4_5_28di8dilx1h74w4.R.inc(10872);chckbxShowVideoDisplay = new JCheckBox("Show Video Display Dialog?");
        __CLR4_5_28di8dilx1h74w4.R.inc(10873);panelGeneral.add(chckbxShowVideoDisplay, "2, 8, 3, 1");
    }finally{__CLR4_5_28di8dilx1h74w4.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_28di8dilx1h74w4.R.inc(10874);
        // The order of the properties is important. We want all the booleans
        // to be set before we set the driver because setting the driver
        // applies all the settings.
        __CLR4_5_28di8dilx1h74w4.R.inc(10875);addWrappedBinding(camera, "showVideoSourceDialog", chckbxShowVideoSource, "selected");
        __CLR4_5_28di8dilx1h74w4.R.inc(10876);addWrappedBinding(camera, "showVideoFormatDialog", chckbxShowVideoFormat, "selected");
        __CLR4_5_28di8dilx1h74w4.R.inc(10877);addWrappedBinding(camera, "showVideoDisplayDialog", chckbxShowVideoDisplay, "selected");
        __CLR4_5_28di8dilx1h74w4.R.inc(10878);addWrappedBinding(camera, "driver", comboBoxDriver, "selectedItem");
    }finally{__CLR4_5_28di8dilx1h74w4.R.flushNeeded();}}

}
