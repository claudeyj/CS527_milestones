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

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.support.IntegerConverter;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.machine.reference.feeder.ReferenceTrayFeeder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class ReferenceTrayFeederConfigurationWizard
        extends AbstractReferenceFeederConfigurationWizard {public static class __CLR4_5_2aqyaqylx1h39p8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,13989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceTrayFeeder feeder;

    private JTextField textFieldOffsetsX;
    private JTextField textFieldOffsetsY;
    private JTextField textFieldTrayCountX;
    private JTextField textFieldTrayCountY;
    private JTextField textFieldFeedCount;

    public ReferenceTrayFeederConfigurationWizard(ReferenceTrayFeeder feeder) {
        super(feeder);__CLR4_5_2aqyaqylx1h39p8.R.inc(13931);try{__CLR4_5_2aqyaqylx1h39p8.R.inc(13930);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13932);this.feeder = feeder;

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13933);JPanel panelFields = new JPanel();

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13934);panelFields.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13935);JLabel lblX = new JLabel("X");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13936);panelFields.add(lblX, "4, 2");

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13937);JLabel lblY = new JLabel("Y");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13938);panelFields.add(lblY, "6, 2");

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13939);JLabel lblFeedStartLocation = new JLabel("Offsets");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13940);panelFields.add(lblFeedStartLocation, "2, 4, right, default");

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13941);textFieldOffsetsX = new JTextField();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13942);panelFields.add(textFieldOffsetsX, "4, 4, fill, default");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13943);textFieldOffsetsX.setColumns(10);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13944);textFieldOffsetsY = new JTextField();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13945);panelFields.add(textFieldOffsetsY, "6, 4, fill, default");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13946);textFieldOffsetsY.setColumns(10);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13947);JLabel lblTrayCount = new JLabel("Tray Count");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13948);panelFields.add(lblTrayCount, "2, 6, right, default");

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13949);textFieldTrayCountX = new JTextField();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13950);panelFields.add(textFieldTrayCountX, "4, 6, fill, default");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13951);textFieldTrayCountX.setColumns(10);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13952);textFieldTrayCountY = new JTextField();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13953);panelFields.add(textFieldTrayCountY, "6, 6, fill, default");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13954);textFieldTrayCountY.setColumns(10);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13955);JSeparator separator = new JSeparator();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13956);panelFields.add(separator, "4, 8, 3, 1");

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13957);JLabel lblFeedCount = new JLabel("Feed Count");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13958);panelFields.add(lblFeedCount, "2, 10, right, default");

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13959);textFieldFeedCount = new JTextField();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13960);panelFields.add(textFieldFeedCount, "4, 10, fill, default");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13961);textFieldFeedCount.setColumns(10);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13962);contentPanel.add(panelFields);
    }finally{__CLR4_5_2aqyaqylx1h39p8.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2aqyaqylx1h39p8.R.inc(13963);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13964);super.createBindings();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13965);LengthConverter lengthConverter = new LengthConverter();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13966);IntegerConverter integerConverter = new IntegerConverter();


        __CLR4_5_2aqyaqylx1h39p8.R.inc(13967);MutableLocationProxy offsets = new MutableLocationProxy();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13968);bind(UpdateStrategy.READ_WRITE, feeder, "offsets", offsets, "location");
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13969);addWrappedBinding(offsets, "lengthX", textFieldOffsetsX, "text", lengthConverter);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13970);addWrappedBinding(offsets, "lengthY", textFieldOffsetsY, "text", lengthConverter);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13971);addWrappedBinding(feeder, "trayCountX", textFieldTrayCountX, "text", integerConverter);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13972);addWrappedBinding(feeder, "trayCountY", textFieldTrayCountY, "text", integerConverter);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13973);addWrappedBinding(feeder, "feedCount", textFieldFeedCount, "text", integerConverter);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13974);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldOffsetsX);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13975);ComponentDecorators.decorateWithAutoSelectAndLengthConversion(textFieldOffsetsY);

        __CLR4_5_2aqyaqylx1h39p8.R.inc(13976);ComponentDecorators.decorateWithAutoSelect(textFieldTrayCountX);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13977);ComponentDecorators.decorateWithAutoSelect(textFieldTrayCountY);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13978);ComponentDecorators.decorateWithAutoSelect(textFieldFeedCount);
    }finally{__CLR4_5_2aqyaqylx1h39p8.R.flushNeeded();}}

    @Override
    protected void saveToModel() {try{__CLR4_5_2aqyaqylx1h39p8.R.inc(13979);
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13980);super.saveToModel();
        __CLR4_5_2aqyaqylx1h39p8.R.inc(13981);if ((((feeder.getOffsets().getX() == 0 && feeder.getTrayCountX() > 1)&&(__CLR4_5_2aqyaqylx1h39p8.R.iget(13982)!=0|true))||(__CLR4_5_2aqyaqylx1h39p8.R.iget(13983)==0&false))) {{
            __CLR4_5_2aqyaqylx1h39p8.R.inc(13984);MessageBoxes.errorBox(this, "Error",
                    "X offset must be greater than 0 if X tray count is greater than 1 or feed failure will occur.");
        }
        }__CLR4_5_2aqyaqylx1h39p8.R.inc(13985);if ((((feeder.getOffsets().getY() == 0 && feeder.getTrayCountY() > 1)&&(__CLR4_5_2aqyaqylx1h39p8.R.iget(13986)!=0|true))||(__CLR4_5_2aqyaqylx1h39p8.R.iget(13987)==0&false))) {{
            __CLR4_5_2aqyaqylx1h39p8.R.inc(13988);MessageBoxes.errorBox(this, "Error",
                    "Y offset must be greater than 0 if Y tray count is greater than 1 or feed failure will occur.");
        }
    }}finally{__CLR4_5_2aqyaqylx1h39p8.R.flushNeeded();}}
}
