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

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.machine.reference.camera.OpenCvCamera;
import org.openpnp.machine.reference.wizards.ReferenceCameraConfigurationWizard;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class OpenCvCameraConfigurationWizard extends ReferenceCameraConfigurationWizard {public static class __CLR4_5_28c48c4lx1h1usq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,10854,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final OpenCvCamera camera;

    private JPanel panelGeneral;

    public OpenCvCameraConfigurationWizard(OpenCvCamera camera) {
        super(camera);__CLR4_5_28c48c4lx1h1usq.R.inc(10805);try{__CLR4_5_28c48c4lx1h1usq.R.inc(10804);

        __CLR4_5_28c48c4lx1h1usq.R.inc(10806);this.camera = camera;

        __CLR4_5_28c48c4lx1h1usq.R.inc(10807);panelGeneral = new JPanel();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10808);contentPanel.add(panelGeneral);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10809);panelGeneral.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_28c48c4lx1h1usq.R.inc(10810);panelGeneral.setLayout(new FormLayout(new ColumnSpec[] {
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,},
            new RowSpec[] {
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_28c48c4lx1h1usq.R.inc(10811);JLabel lblDeviceId = new JLabel("Device Index");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10812);panelGeneral.add(lblDeviceId, "2, 2, right, default");

        __CLR4_5_28c48c4lx1h1usq.R.inc(10813);comboBoxDeviceIndex = new JComboBox();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10814);for (int i = 0; (((i < 10)&&(__CLR4_5_28c48c4lx1h1usq.R.iget(10815)!=0|true))||(__CLR4_5_28c48c4lx1h1usq.R.iget(10816)==0&false)); i++) {{
            __CLR4_5_28c48c4lx1h1usq.R.inc(10817);comboBoxDeviceIndex.addItem(new Integer(i));
        }
        }__CLR4_5_28c48c4lx1h1usq.R.inc(10818);panelGeneral.add(comboBoxDeviceIndex, "4, 2, left, default");
        
        __CLR4_5_28c48c4lx1h1usq.R.inc(10819);lblFps = new JLabel("FPS");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10820);panelGeneral.add(lblFps, "2, 4, right, default");
        
        __CLR4_5_28c48c4lx1h1usq.R.inc(10821);fpsTextField = new JTextField();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10822);panelGeneral.add(fpsTextField, "4, 4");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10823);fpsTextField.setColumns(10);

        __CLR4_5_28c48c4lx1h1usq.R.inc(10824);lblPreferredWidth = new JLabel("Preferred Width");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10825);panelGeneral.add(lblPreferredWidth, "2, 6, right, default");

        __CLR4_5_28c48c4lx1h1usq.R.inc(10826);textFieldPreferredWidth = new JTextField();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10827);panelGeneral.add(textFieldPreferredWidth, "4, 6, fill, default");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10828);textFieldPreferredWidth.setColumns(10);

        __CLR4_5_28c48c4lx1h1usq.R.inc(10829);lbluseFor = new JLabel("(Use 0 for native resolution)");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10830);panelGeneral.add(lbluseFor, "6, 6");

        __CLR4_5_28c48c4lx1h1usq.R.inc(10831);lblPreferredHeight = new JLabel("Preferred Height");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10832);panelGeneral.add(lblPreferredHeight, "2, 8, right, default");

        __CLR4_5_28c48c4lx1h1usq.R.inc(10833);textFieldPreferredHeight = new JTextField();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10834);panelGeneral.add(textFieldPreferredHeight, "4, 8, fill, default");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10835);textFieldPreferredHeight.setColumns(10);

        __CLR4_5_28c48c4lx1h1usq.R.inc(10836);lbluseFor_1 = new JLabel("(Use 0 for native resolution)");
        __CLR4_5_28c48c4lx1h1usq.R.inc(10837);panelGeneral.add(lbluseFor_1, "6, 8");
    }finally{__CLR4_5_28c48c4lx1h1usq.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_28c48c4lx1h1usq.R.inc(10838);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10839);IntegerConverter intConverter = new IntegerConverter();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10840);super.createBindings();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10841);addWrappedBinding(camera, "preferredWidth", textFieldPreferredWidth, "text", intConverter);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10842);addWrappedBinding(camera, "preferredHeight", textFieldPreferredHeight, "text",
                intConverter);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10843);addWrappedBinding(camera, "fps", fpsTextField, "text", intConverter);
        // Should always be last so that it doesn't trigger multiple camera reloads.
        __CLR4_5_28c48c4lx1h1usq.R.inc(10844);addWrappedBinding(camera, "deviceIndex", comboBoxDeviceIndex, "selectedItem");

        __CLR4_5_28c48c4lx1h1usq.R.inc(10845);ComponentDecorators.decorateWithAutoSelect(textFieldPreferredWidth);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10846);ComponentDecorators.decorateWithAutoSelect(textFieldPreferredHeight);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10847);ComponentDecorators.decorateWithAutoSelect(fpsTextField);
    }finally{__CLR4_5_28c48c4lx1h1usq.R.flushNeeded();}}

    @Override
    protected void saveToModel() {try{__CLR4_5_28c48c4lx1h1usq.R.inc(10848);
        __CLR4_5_28c48c4lx1h1usq.R.inc(10849);super.saveToModel();
        __CLR4_5_28c48c4lx1h1usq.R.inc(10850);if ((((camera.isDirty())&&(__CLR4_5_28c48c4lx1h1usq.R.iget(10851)!=0|true))||(__CLR4_5_28c48c4lx1h1usq.R.iget(10852)==0&false))) {{
            __CLR4_5_28c48c4lx1h1usq.R.inc(10853);camera.setDeviceIndex(camera.getDeviceIndex());
        }
    }}finally{__CLR4_5_28c48c4lx1h1usq.R.flushNeeded();}}

    private JComboBox comboBoxDeviceIndex;
    private JLabel lblPreferredWidth;
    private JLabel lblPreferredHeight;
    private JTextField textFieldPreferredWidth;
    private JTextField textFieldPreferredHeight;
    private JLabel lbluseFor;
    private JLabel lbluseFor_1;
    private JLabel lblFps;
    private JTextField fpsTextField;
}
