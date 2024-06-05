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

package org.openpnp.machine.reference.feeder.wizards;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.DoubleConverter;
import org.openpnp.gui.support.IdentifiableListCellRenderer;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.gui.support.PartsComboBoxModel;
import org.openpnp.machine.reference.ReferenceFeeder;
import org.openpnp.model.Configuration;
import org.openpnp.model.Part;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
/**
 * TODO: This should become it's own property sheet which the feeders can include.
 */
public abstract class AbstractReferenceFeederConfigurationWizard
        extends AbstractConfigurationWizard {public static class __CLR4_5_2acsacslx1h5pc7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,13480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceFeeder feeder;
    private final boolean includePickLocation;

    private JPanel panelLocation;
    private JLabel lblX_1;
    private JLabel lblY_1;
    private JLabel lblZ;
    private JLabel lblRotation;
    private JTextField textFieldLocationX;
    private JTextField textFieldLocationY;
    private JTextField textFieldLocationZ;
    private JTextField textFieldLocationC;
    private JPanel panelPart;

    private JComboBox comboBoxPart;
    private LocationButtonsPanel locationButtonsPanel;

    public AbstractReferenceFeederConfigurationWizard(ReferenceFeeder feeder) {
        this(feeder, true);__CLR4_5_2acsacslx1h5pc7.R.inc(13421);try{__CLR4_5_2acsacslx1h5pc7.R.inc(13420);
    }finally{__CLR4_5_2acsacslx1h5pc7.R.flushNeeded();}}

    public AbstractReferenceFeederConfigurationWizard(ReferenceFeeder feeder,
            boolean includePickLocation) {try{__CLR4_5_2acsacslx1h5pc7.R.inc(13422);
        __CLR4_5_2acsacslx1h5pc7.R.inc(13423);this.feeder = feeder;
        __CLR4_5_2acsacslx1h5pc7.R.inc(13424);this.includePickLocation = includePickLocation;

        __CLR4_5_2acsacslx1h5pc7.R.inc(13425);panelPart = new JPanel();
        __CLR4_5_2acsacslx1h5pc7.R.inc(13426);panelPart.setBorder(
                new TitledBorder(null, "Part", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        __CLR4_5_2acsacslx1h5pc7.R.inc(13427);contentPanel.add(panelPart);
        __CLR4_5_2acsacslx1h5pc7.R.inc(13428);panelPart.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2acsacslx1h5pc7.R.inc(13429);comboBoxPart = new JComboBox();
        __CLR4_5_2acsacslx1h5pc7.R.inc(13430);try {
            __CLR4_5_2acsacslx1h5pc7.R.inc(13431);comboBoxPart.setModel(new PartsComboBoxModel());
        }
        catch (Throwable t) {
            // Swallow this error. This happens during parsing in
            // in WindowBuilder but doesn't happen during normal run.
        }
        __CLR4_5_2acsacslx1h5pc7.R.inc(13432);comboBoxPart.setRenderer(new IdentifiableListCellRenderer<Part>());
        __CLR4_5_2acsacslx1h5pc7.R.inc(13433);panelPart.add(comboBoxPart, "2, 2, left, default");

        __CLR4_5_2acsacslx1h5pc7.R.inc(13434);if ((((includePickLocation)&&(__CLR4_5_2acsacslx1h5pc7.R.iget(13435)!=0|true))||(__CLR4_5_2acsacslx1h5pc7.R.iget(13436)==0&false))) {{
            __CLR4_5_2acsacslx1h5pc7.R.inc(13437);panelLocation = new JPanel();
            __CLR4_5_2acsacslx1h5pc7.R.inc(13438);panelLocation.setBorder(new TitledBorder(
                    new EtchedBorder(EtchedBorder.LOWERED, null, null), "Pick Location",
                    TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
            __CLR4_5_2acsacslx1h5pc7.R.inc(13439);contentPanel.add(panelLocation);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13440);panelLocation
                    .setLayout(new FormLayout(
                            new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC,
                                    ColumnSpec.decode("default:grow"),
                                    FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec
                                            .decode("default:grow"),
                                    FormSpecs.RELATED_GAP_COLSPEC,
                                    ColumnSpec.decode("default:grow"),
                                    FormSpecs.RELATED_GAP_COLSPEC,
                                    ColumnSpec.decode("default:grow"),
                                    FormSpecs.RELATED_GAP_COLSPEC,
                                    ColumnSpec.decode("left:default:grow"),},
                            new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                                    FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_2acsacslx1h5pc7.R.inc(13441);lblX_1 = new JLabel("X");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13442);panelLocation.add(lblX_1, "2, 2");

            __CLR4_5_2acsacslx1h5pc7.R.inc(13443);lblY_1 = new JLabel("Y");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13444);panelLocation.add(lblY_1, "4, 2");

            __CLR4_5_2acsacslx1h5pc7.R.inc(13445);lblZ = new JLabel("Z");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13446);panelLocation.add(lblZ, "6, 2");

            __CLR4_5_2acsacslx1h5pc7.R.inc(13447);lblRotation = new JLabel("Rotation");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13448);panelLocation.add(lblRotation, "8, 2");

            __CLR4_5_2acsacslx1h5pc7.R.inc(13449);textFieldLocationX = new JTextField();
            __CLR4_5_2acsacslx1h5pc7.R.inc(13450);panelLocation.add(textFieldLocationX, "2, 4");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13451);textFieldLocationX.setColumns(8);

            __CLR4_5_2acsacslx1h5pc7.R.inc(13452);textFieldLocationY = new JTextField();
            __CLR4_5_2acsacslx1h5pc7.R.inc(13453);panelLocation.add(textFieldLocationY, "4, 4");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13454);textFieldLocationY.setColumns(8);

            __CLR4_5_2acsacslx1h5pc7.R.inc(13455);textFieldLocationZ = new JTextField();
            __CLR4_5_2acsacslx1h5pc7.R.inc(13456);panelLocation.add(textFieldLocationZ, "6, 4");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13457);textFieldLocationZ.setColumns(8);

            __CLR4_5_2acsacslx1h5pc7.R.inc(13458);textFieldLocationC = new JTextField();
            __CLR4_5_2acsacslx1h5pc7.R.inc(13459);panelLocation.add(textFieldLocationC, "8, 4");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13460);textFieldLocationC.setColumns(8);

            __CLR4_5_2acsacslx1h5pc7.R.inc(13461);locationButtonsPanel = new LocationButtonsPanel(textFieldLocationX, textFieldLocationY,
                    textFieldLocationZ, textFieldLocationC);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13462);panelLocation.add(locationButtonsPanel, "10, 4");
        }
    }}finally{__CLR4_5_2acsacslx1h5pc7.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2acsacslx1h5pc7.R.inc(13463);
        __CLR4_5_2acsacslx1h5pc7.R.inc(13464);LengthConverter lengthConverter = new LengthConverter();
        __CLR4_5_2acsacslx1h5pc7.R.inc(13465);DoubleConverter doubleConverter =
                new DoubleConverter(Configuration.get().getLengthDisplayFormat());

        __CLR4_5_2acsacslx1h5pc7.R.inc(13466);addWrappedBinding(feeder, "part", comboBoxPart, "selectedItem");

        __CLR4_5_2acsacslx1h5pc7.R.inc(13467);if ((((includePickLocation)&&(__CLR4_5_2acsacslx1h5pc7.R.iget(13468)!=0|true))||(__CLR4_5_2acsacslx1h5pc7.R.iget(13469)==0&false))) {{
            __CLR4_5_2acsacslx1h5pc7.R.inc(13470);MutableLocationProxy location = new MutableLocationProxy();
            __CLR4_5_2acsacslx1h5pc7.R.inc(13471);bind(UpdateStrategy.READ_WRITE, feeder, "location", location, "location");
            __CLR4_5_2acsacslx1h5pc7.R.inc(13472);addWrappedBinding(location, "lengthX", textFieldLocationX, "text", lengthConverter);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13473);addWrappedBinding(location, "lengthY", textFieldLocationY, "text", lengthConverter);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13474);addWrappedBinding(location, "lengthZ", textFieldLocationZ, "text", lengthConverter);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13475);addWrappedBinding(location, "rotation", textFieldLocationC, "text", doubleConverter);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13476);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationX);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13477);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationY);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13478);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldLocationZ);
            __CLR4_5_2acsacslx1h5pc7.R.inc(13479);ComponentDecorators.decorateWithAutoSelect(textFieldLocationC);
        }
    }}finally{__CLR4_5_2acsacslx1h5pc7.R.flushNeeded();}}
}
