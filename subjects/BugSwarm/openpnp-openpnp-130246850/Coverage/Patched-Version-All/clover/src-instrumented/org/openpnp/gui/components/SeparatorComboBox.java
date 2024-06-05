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

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;

/**
 * Class that allows you to add a JSeparator to the ComboBoxModel.
 *
 * The separator is rendered as a horizontal line. Using the Up/Down arrow keys will cause the combo
 * box selection to skip over the separator. If you attempt to select the separator with the mouse,
 * the selection will be ignored and the drop down will remain open.
 */
@SuppressWarnings("serial")
public class SeparatorComboBox extends JComboBox implements KeyListener {public static class __CLR4_5_2401401lx1h8i2a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,5239,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Track key presses and releases

    private boolean released = true;

    // Track when the separator has been selected
    private boolean separatorSelected = false;

    /**
     * Standard constructor. See JComboBox API for details
     */
    public SeparatorComboBox() {
        super();__CLR4_5_2401401lx1h8i2a.R.inc(5186);try{__CLR4_5_2401401lx1h8i2a.R.inc(5185);
        __CLR4_5_2401401lx1h8i2a.R.inc(5187);init();
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    /**
     * Standard constructor. See JComboBox API for details
     */
    public SeparatorComboBox(ComboBoxModel model) {
        super(model);__CLR4_5_2401401lx1h8i2a.R.inc(5189);try{__CLR4_5_2401401lx1h8i2a.R.inc(5188);
        __CLR4_5_2401401lx1h8i2a.R.inc(5190);init();
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    /**
     * Standard constructor. See JComboBox API for details
     */
    public SeparatorComboBox(Object[] items) {
        super(items);__CLR4_5_2401401lx1h8i2a.R.inc(5192);try{__CLR4_5_2401401lx1h8i2a.R.inc(5191);
        __CLR4_5_2401401lx1h8i2a.R.inc(5193);init();
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    /**
     * Standard constructor. See JComboBox API for details
     */
    public SeparatorComboBox(Vector<?> items) {
        super(items);__CLR4_5_2401401lx1h8i2a.R.inc(5195);try{__CLR4_5_2401401lx1h8i2a.R.inc(5194);
        __CLR4_5_2401401lx1h8i2a.R.inc(5196);init();
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    private void init() {try{__CLR4_5_2401401lx1h8i2a.R.inc(5197);
        __CLR4_5_2401401lx1h8i2a.R.inc(5198);setRenderer(new SeparatorRenderer());
        __CLR4_5_2401401lx1h8i2a.R.inc(5199);addKeyListener(this);
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    /**
     * Prevent selection of the separator by keyboard or mouse
     */
    @Override
    public void setSelectedIndex(int index) {try{__CLR4_5_2401401lx1h8i2a.R.inc(5200);
        __CLR4_5_2401401lx1h8i2a.R.inc(5201);Object value = getItemAt(index);

        // Attempting to select a separator

        __CLR4_5_2401401lx1h8i2a.R.inc(5202);if ((((value instanceof JSeparator)&&(__CLR4_5_2401401lx1h8i2a.R.iget(5203)!=0|true))||(__CLR4_5_2401401lx1h8i2a.R.iget(5204)==0&false))) {{
            // If no keys have been pressed then we must be using the mouse.
            // Prevent selection of the Separator when using the mouse

            __CLR4_5_2401401lx1h8i2a.R.inc(5205);if ((((released)&&(__CLR4_5_2401401lx1h8i2a.R.iget(5206)!=0|true))||(__CLR4_5_2401401lx1h8i2a.R.iget(5207)==0&false))) {{
                __CLR4_5_2401401lx1h8i2a.R.inc(5208);separatorSelected = true;
                __CLR4_5_2401401lx1h8i2a.R.inc(5209);return;
            }

            // Skip over the Separator when using the Up/Down keys

            }__CLR4_5_2401401lx1h8i2a.R.inc(5210);int current = getSelectedIndex();
            __CLR4_5_2401401lx1h8i2a.R.inc(5211);index += ((((index > current) )&&(__CLR4_5_2401401lx1h8i2a.R.iget(5212)!=0|true))||(__CLR4_5_2401401lx1h8i2a.R.iget(5213)==0&false))? 1 : -1;

            __CLR4_5_2401401lx1h8i2a.R.inc(5214);if ((((index == -1 || index >= dataModel.getSize())&&(__CLR4_5_2401401lx1h8i2a.R.iget(5215)!=0|true))||(__CLR4_5_2401401lx1h8i2a.R.iget(5216)==0&false)))
                {__CLR4_5_2401401lx1h8i2a.R.inc(5217);return;
        }}

        }__CLR4_5_2401401lx1h8i2a.R.inc(5218);super.setSelectedIndex(index);
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    /**
     * Prevent closing of the popup when attempting to select the separator with the mouse.
     */
    @Override
    public void setPopupVisible(boolean visible) {try{__CLR4_5_2401401lx1h8i2a.R.inc(5219);
        // Keep the popup open when the separator was clicked on

        __CLR4_5_2401401lx1h8i2a.R.inc(5220);if ((((separatorSelected)&&(__CLR4_5_2401401lx1h8i2a.R.iget(5221)!=0|true))||(__CLR4_5_2401401lx1h8i2a.R.iget(5222)==0&false))) {{
            __CLR4_5_2401401lx1h8i2a.R.inc(5223);separatorSelected = false;
            __CLR4_5_2401401lx1h8i2a.R.inc(5224);return;
        }

        }__CLR4_5_2401401lx1h8i2a.R.inc(5225);super.setPopupVisible(visible);
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    //
    // Implement the KeyListener interface
    //
    public void keyPressed(KeyEvent e) {try{__CLR4_5_2401401lx1h8i2a.R.inc(5226);
        __CLR4_5_2401401lx1h8i2a.R.inc(5227);released = false;
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    public void keyReleased(KeyEvent e) {try{__CLR4_5_2401401lx1h8i2a.R.inc(5228);
        __CLR4_5_2401401lx1h8i2a.R.inc(5229);released = true;
    }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    public void keyTyped(KeyEvent e) {try{__CLR4_5_2401401lx1h8i2a.R.inc(5230);}finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

    /**
     * Class to render the JSeparator compenent
     */
    class SeparatorRenderer implements ListCellRenderer {
        private ListCellRenderer renderer;

        public SeparatorRenderer() {try{__CLR4_5_2401401lx1h8i2a.R.inc(5231);
            __CLR4_5_2401401lx1h8i2a.R.inc(5232);renderer = new JComboBox().getRenderer();
        }finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}

        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {try{__CLR4_5_2401401lx1h8i2a.R.inc(5233);
            __CLR4_5_2401401lx1h8i2a.R.inc(5234);if ((((value instanceof JSeparator)&&(__CLR4_5_2401401lx1h8i2a.R.iget(5235)!=0|true))||(__CLR4_5_2401401lx1h8i2a.R.iget(5236)==0&false))) {{
                __CLR4_5_2401401lx1h8i2a.R.inc(5237);return (JSeparator) value;
            }
            }else {{
                __CLR4_5_2401401lx1h8i2a.R.inc(5238);return renderer.getListCellRendererComponent(list, value, index, isSelected,
                        cellHasFocus);
            }
        }}finally{__CLR4_5_2401401lx1h8i2a.R.flushNeeded();}}
    }
}
