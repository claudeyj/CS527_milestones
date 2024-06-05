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

package org.openpnp.gui.support;

import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

import javax.swing.JTable;
import javax.swing.JTextField;

import org.jdesktop.beansbinding.BeanProperty;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;

public class Helpers {public static class __CLR4_5_25te5telx1h8jiq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,7579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void copyLocationIntoTextFields(Location l, JTextField x, JTextField y,
            JTextField z) {try{__CLR4_5_25te5telx1h8jiq.R.inc(7538);
        __CLR4_5_25te5telx1h8jiq.R.inc(7539);copyLocationIntoTextFields(l, x, y, z, null);
    }finally{__CLR4_5_25te5telx1h8jiq.R.flushNeeded();}}

    public static void copyLocationIntoTextFields(Location l, JTextField x, JTextField y,
            JTextField z, JTextField rotation) {try{__CLR4_5_25te5telx1h8jiq.R.inc(7540);
        __CLR4_5_25te5telx1h8jiq.R.inc(7541);if ((((x != null)&&(__CLR4_5_25te5telx1h8jiq.R.iget(7542)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7543)==0&false))) {{
            __CLR4_5_25te5telx1h8jiq.R.inc(7544);x.setText(String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                    l.getLengthX().getValue()));
        }
        }__CLR4_5_25te5telx1h8jiq.R.inc(7545);if ((((y != null)&&(__CLR4_5_25te5telx1h8jiq.R.iget(7546)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7547)==0&false))) {{
            __CLR4_5_25te5telx1h8jiq.R.inc(7548);y.setText(String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                    l.getLengthY().getValue()));
        }
        }__CLR4_5_25te5telx1h8jiq.R.inc(7549);if ((((z != null)&&(__CLR4_5_25te5telx1h8jiq.R.iget(7550)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7551)==0&false))) {{
            __CLR4_5_25te5telx1h8jiq.R.inc(7552);z.setText(String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                    l.getLengthZ().getValue()));
        }
        }__CLR4_5_25te5telx1h8jiq.R.inc(7553);if ((((rotation != null)&&(__CLR4_5_25te5telx1h8jiq.R.iget(7554)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7555)==0&false))) {{
            __CLR4_5_25te5telx1h8jiq.R.inc(7556);rotation.setText(String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                    l.getRotation()));
        }
    }}finally{__CLR4_5_25te5telx1h8jiq.R.flushNeeded();}}

    /**
     * Select the last row in a table. Handy for selecting a row that was just added.
     * 
     * @param table
     */
    public static void selectLastTableRow(JTable table) {try{__CLR4_5_25te5telx1h8jiq.R.inc(7557);
        __CLR4_5_25te5telx1h8jiq.R.inc(7558);table.clearSelection();
        __CLR4_5_25te5telx1h8jiq.R.inc(7559);int index = table.getRowCount() - 1;
        __CLR4_5_25te5telx1h8jiq.R.inc(7560);index = table.convertRowIndexToView(index);
        __CLR4_5_25te5telx1h8jiq.R.inc(7561);table.addRowSelectionInterval(index, index);
    }finally{__CLR4_5_25te5telx1h8jiq.R.flushNeeded();}}

    /**
     * Create a unique name consisting of the prefix and an integer. The name is guaranteed to be
     * unique within the properties of the given Collection using the given propertyName.
     * 
     * @param prefix
     * @param existingObjects Objects against which to compare the property identified by
     *        propertyName against for the unique name.
     * @param propertyName The name of a String property.
     */
    public static String createUniqueName(String prefix, Collection existingObjects,
            String propertyName) {try{__CLR4_5_25te5telx1h8jiq.R.inc(7562);
        __CLR4_5_25te5telx1h8jiq.R.inc(7563);HashSet<String> names = new HashSet<>();
        __CLR4_5_25te5telx1h8jiq.R.inc(7564);BeanProperty<Object, String> property = BeanProperty.create(propertyName);
        __CLR4_5_25te5telx1h8jiq.R.inc(7565);for (Object o : existingObjects) {{
            __CLR4_5_25te5telx1h8jiq.R.inc(7566);if ((((o != null)&&(__CLR4_5_25te5telx1h8jiq.R.iget(7567)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7568)==0&false))) {{
                __CLR4_5_25te5telx1h8jiq.R.inc(7569);names.add(property.getValue(o));
            }
        }}
        }__CLR4_5_25te5telx1h8jiq.R.inc(7570);for (int i = 1; (((i < Integer.MAX_VALUE)&&(__CLR4_5_25te5telx1h8jiq.R.iget(7571)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7572)==0&false)); i++) {{
            __CLR4_5_25te5telx1h8jiq.R.inc(7573);String name = prefix + i;
            __CLR4_5_25te5telx1h8jiq.R.inc(7574);if ((((!names.contains(name))&&(__CLR4_5_25te5telx1h8jiq.R.iget(7575)!=0|true))||(__CLR4_5_25te5telx1h8jiq.R.iget(7576)==0&false))) {{
                __CLR4_5_25te5telx1h8jiq.R.inc(7577);return name;
            }
        }}

        }__CLR4_5_25te5telx1h8jiq.R.inc(7578);return null;
    }finally{__CLR4_5_25te5telx1h8jiq.R.flushNeeded();}}
}
