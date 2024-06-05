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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Locale;

import javax.swing.JTextField;

import org.openpnp.model.Configuration;
import org.openpnp.model.Length;

public class ComponentDecorators {public static class __CLR4_5_23l03l0lx1h8hqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,4673,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Adds an auto selection decoration to the JTextField. Whenever the JTextField gains focus the
     * text in it will be selected.
     * 
     * @param textField
     */
    public static void decorateWithAutoSelect(JTextField textField) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4644);
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4645);textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent event) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4646);
                __CLR4_5_23l03l0lx1h8hqj.R.inc(4647);((JTextField) event.getComponent()).selectAll();
            }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}
        });
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4648);textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4649);
                __CLR4_5_23l03l0lx1h8hqj.R.inc(4650);((JTextField) event.getSource()).selectAll();
            }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}
        });
    }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}

    /**
     * Adds a length conversion decoration to the JTextField. When the JTextField loses focus or has
     * it's action triggered the text will be converted to a Length value in the system units and
     * then have it's text replaced with the value.
     * 
     * @param textField
     */
    public static void decorateWithLengthConversion(JTextField textField) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4651);
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4652);textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4653);
                __CLR4_5_23l03l0lx1h8hqj.R.inc(4654);convertLength(((JTextField) event.getSource()));
            }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}
        });
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4655);textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent event) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4656);
                __CLR4_5_23l03l0lx1h8hqj.R.inc(4657);convertLength(((JTextField) event.getSource()));
            }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}
        });
    }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}

    public static void decorateWithAutoSelectAndLengthConversion(JTextField textField) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4658);
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4659);decorateWithAutoSelect(textField);
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4660);decorateWithLengthConversion(textField);
    }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}

    private static void convertLength(JTextField textField) {try{__CLR4_5_23l03l0lx1h8hqj.R.inc(4661);
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4662);Length length = Length.parse(textField.getText(), false);
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4663);if ((((length == null)&&(__CLR4_5_23l03l0lx1h8hqj.R.iget(4664)!=0|true))||(__CLR4_5_23l03l0lx1h8hqj.R.iget(4665)==0&false))) {{
            __CLR4_5_23l03l0lx1h8hqj.R.inc(4666);return;
        }
        }__CLR4_5_23l03l0lx1h8hqj.R.inc(4667);if ((((length.getUnits() == null)&&(__CLR4_5_23l03l0lx1h8hqj.R.iget(4668)!=0|true))||(__CLR4_5_23l03l0lx1h8hqj.R.iget(4669)==0&false))) {{
            __CLR4_5_23l03l0lx1h8hqj.R.inc(4670);length.setUnits(Configuration.get().getSystemUnits());
        }
        }__CLR4_5_23l03l0lx1h8hqj.R.inc(4671);length = length.convertToUnits(Configuration.get().getSystemUnits());
        __CLR4_5_23l03l0lx1h8hqj.R.inc(4672);textField.setText(String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                length.getValue()));
    }finally{__CLR4_5_23l03l0lx1h8hqj.R.flushNeeded();}}
}
