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

package org.openpnp.gui.wizards;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.Locale;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.LongConverter;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.model.Configuration;
import org.openpnp.spi.Camera;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class CameraConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_26o36o3lx1h1u5s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,8722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Camera camera;
    private JPanel panelUpp;
    private JButton btnMeasure;
    private JButton btnCancelMeasure;
    private JLabel lblUppInstructions;

    public CameraConfigurationWizard(Camera camera) {try{__CLR4_5_26o36o3lx1h1u5s.R.inc(8643);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8644);this.camera = camera;

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8645);panelUpp = new JPanel();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8646);contentPanel.add(panelUpp);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8647);panelUpp.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Units Per Pixel", TitledBorder.LEADING, TitledBorder.TOP, null,
                new Color(0, 0, 0)));
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8648);panelUpp.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8649);lblWidth = new JLabel("Width");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8650);panelUpp.add(lblWidth, "2, 2");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8651);lblHeight = new JLabel("Height");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8652);panelUpp.add(lblHeight, "4, 2");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8653);lblX = new JLabel("X");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8654);panelUpp.add(lblX, "6, 2");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8655);lblY = new JLabel("Y");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8656);panelUpp.add(lblY, "8, 2");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8657);textFieldWidth = new JTextField();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8658);textFieldWidth.setText("1");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8659);panelUpp.add(textFieldWidth, "2, 4");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8660);textFieldWidth.setColumns(8);

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8661);textFieldHeight = new JTextField();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8662);textFieldHeight.setText("1");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8663);panelUpp.add(textFieldHeight, "4, 4");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8664);textFieldHeight.setColumns(8);

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8665);textFieldUppX = new JTextField();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8666);textFieldUppX.setColumns(8);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8667);panelUpp.add(textFieldUppX, "6, 4, fill, default");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8668);textFieldUppY = new JTextField();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8669);textFieldUppY.setColumns(8);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8670);panelUpp.add(textFieldUppY, "8, 4, fill, default");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8671);btnMeasure = new JButton("Measure");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8672);btnMeasure.setAction(measureAction);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8673);panelUpp.add(btnMeasure, "10, 4");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8674);btnCancelMeasure = new JButton("Cancel");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8675);btnCancelMeasure.setAction(cancelMeasureAction);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8676);panelUpp.add(btnCancelMeasure, "12, 4");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8677);lblUppInstructions = new JLabel(
                "<html>\n<ol>\n<li>Place an object with a known width and height on the table. Graphing paper is a good, easy choice for this.\n<li>Enter the width and height of the object into the Width and Height fields.\n<li>Jog the camera to where it is centered over the object and in focus.\n<li>Press Measure and use the camera selection rectangle to measure the object. Press Confirm when finished.\n<li>The calculated units per pixel values will be inserted into the X and Y fields.\n</ol>\n</html>");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8678);panelUpp.add(lblUppInstructions, "2, 6, 10, 1, default, fill");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8679);panelVision = new JPanel();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8680);panelVision.setBorder(new TitledBorder(null, "Vision", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8681);contentPanel.add(panelVision);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8682);panelVision.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8683);lblSettleTimems = new JLabel("Settle Time (ms)");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8684);panelVision.add(lblSettleTimems, "2, 2, right, default");

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8685);textFieldSettleTime = new JTextField();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8686);panelVision.add(textFieldSettleTime, "4, 2, fill, default");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8687);textFieldSettleTime.setColumns(10);
    }finally{__CLR4_5_26o36o3lx1h1u5s.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_26o36o3lx1h1u5s.R.inc(8688);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8689);LengthConverter lengthConverter = new LengthConverter();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8690);LongConverter longConverter = new LongConverter();

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8691);MutableLocationProxy unitsPerPixel = new MutableLocationProxy();
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8692);bind(UpdateStrategy.READ_WRITE, camera, "unitsPerPixel", unitsPerPixel, "location");
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8693);addWrappedBinding(unitsPerPixel, "lengthX", textFieldUppX, "text", lengthConverter);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8694);addWrappedBinding(unitsPerPixel, "lengthY", textFieldUppY, "text", lengthConverter);

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8695);addWrappedBinding(camera, "settleTimeMs", textFieldSettleTime, "text", longConverter);

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8696);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldUppX);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8697);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldUppY);

        __CLR4_5_26o36o3lx1h1u5s.R.inc(8698);ComponentDecorators.decorateWithAutoSelect(textFieldWidth);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8699);ComponentDecorators.decorateWithAutoSelect(textFieldHeight);
        __CLR4_5_26o36o3lx1h1u5s.R.inc(8700);ComponentDecorators.decorateWithAutoSelect(textFieldSettleTime);
    }finally{__CLR4_5_26o36o3lx1h1u5s.R.flushNeeded();}}

    private Action measureAction = new AbstractAction("Measure") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_26o36o3lx1h1u5s.R.inc(8701);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8702);btnMeasure.setAction(confirmMeasureAction);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8703);cancelMeasureAction.setEnabled(true);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8704);CameraView cameraView = MainFrame.cameraPanel.setSelectedCamera(camera);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8705);cameraView.setSelectionEnabled(true);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8706);cameraView.setSelection(0, 0, 100, 100);
        }finally{__CLR4_5_26o36o3lx1h1u5s.R.flushNeeded();}}
    };

    private Action confirmMeasureAction = new AbstractAction("Confirm") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_26o36o3lx1h1u5s.R.inc(8707);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8708);btnMeasure.setAction(measureAction);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8709);cancelMeasureAction.setEnabled(false);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8710);CameraView cameraView = MainFrame.cameraPanel.getCameraView(camera);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8711);cameraView.setSelectionEnabled(false);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8712);Rectangle selection = cameraView.getSelection();
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8713);double width = Double.parseDouble(textFieldWidth.getText());
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8714);double height = Double.parseDouble(textFieldHeight.getText());
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8715);textFieldUppX.setText(String.format(Locale.US,
                    Configuration.get().getLengthDisplayFormat(), (width / selection.width)));
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8716);textFieldUppY.setText(String.format(Locale.US,
                    Configuration.get().getLengthDisplayFormat(), (height / selection.height)));
        }finally{__CLR4_5_26o36o3lx1h1u5s.R.flushNeeded();}}
    };

    private Action cancelMeasureAction = new AbstractAction("Cancel") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_26o36o3lx1h1u5s.R.inc(8717);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8718);btnMeasure.setAction(measureAction);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8719);cancelMeasureAction.setEnabled(false);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8720);CameraView cameraView = MainFrame.cameraPanel.getCameraView(camera);
            __CLR4_5_26o36o3lx1h1u5s.R.inc(8721);cameraView.setSelectionEnabled(false);
        }finally{__CLR4_5_26o36o3lx1h1u5s.R.flushNeeded();}}
    };
    private JTextField textFieldWidth;
    private JTextField textFieldHeight;
    private JTextField textFieldUppX;
    private JTextField textFieldUppY;
    private JLabel lblWidth;
    private JLabel lblHeight;
    private JLabel lblX;
    private JLabel lblY;
    private JPanel panelVision;
    private JLabel lblSettleTimems;
    private JTextField textFieldSettleTime;
}
