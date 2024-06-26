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

package org.openpnp.gui.tablemodel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.openpnp.ConfigurationListener;
import org.openpnp.model.Configuration;
import org.openpnp.spi.Head;

@java.lang.SuppressWarnings({"fallthrough"}) public class HeadsTableModel extends AbstractTableModel {public static class __CLR4_5_26fm6fmlx1h5nht{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,8365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final private Configuration configuration;

    private String[] columnNames = new String[] {"Name", "Type"};
    private List<Head> heads;

    public HeadsTableModel(Configuration configuration) {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8338);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8339);this.configuration = configuration;
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8340);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8341);
                __CLR4_5_26fm6fmlx1h5nht.R.inc(8342);heads = new ArrayList<>(configuration.getMachine().getHeads());
                __CLR4_5_26fm6fmlx1h5nht.R.inc(8343);fireTableDataChanged();
            }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}
        });
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8344);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8345);return columnNames[column];
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8346);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8347);return columnNames.length;
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8348);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8349);return ((((heads == null) )&&(__CLR4_5_26fm6fmlx1h5nht.R.iget(8350)!=0|true))||(__CLR4_5_26fm6fmlx1h5nht.R.iget(8351)==0&false))? 0 : heads.size();
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}

    public Head getHead(int index) {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8352);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8353);return heads.get(index);
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8354);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8355);return false;
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26fm6fmlx1h5nht.R.inc(8356);
        __CLR4_5_26fm6fmlx1h5nht.R.inc(8357);Head head = heads.get(row);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26fm6fmlx1h5nht.R.inc(8358);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26fm6fmlx1h5nht.R.inc(8359);__CLB4_5_2_bool0=true;}
                __CLR4_5_26fm6fmlx1h5nht.R.inc(8360);return head.getName();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26fm6fmlx1h5nht.R.inc(8361);__CLB4_5_2_bool0=true;}
                __CLR4_5_26fm6fmlx1h5nht.R.inc(8362);return head.getClass().getSimpleName();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26fm6fmlx1h5nht.R.inc(8363);__CLB4_5_2_bool0=true;}
                __CLR4_5_26fm6fmlx1h5nht.R.inc(8364);return null;
        }
    }finally{__CLR4_5_26fm6fmlx1h5nht.R.flushNeeded();}}
}
