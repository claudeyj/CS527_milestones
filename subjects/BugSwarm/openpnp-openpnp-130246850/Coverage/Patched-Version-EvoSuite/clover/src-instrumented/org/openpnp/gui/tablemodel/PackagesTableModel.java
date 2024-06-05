/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is package of OpenPnP.
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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.openpnp.model.Configuration;
import org.openpnp.model.Package;
// import org.openpnp.model.Package;

@SuppressWarnings({"serial","fallthrough"})
public class PackagesTableModel extends AbstractTableModel implements PropertyChangeListener {public static class __CLR4_5_26gd6gdlx1h5nif{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,8402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final private Configuration configuration;

    private String[] columnNames = new String[] {"Id", "Description"};
    private Class[] columnTypes = new Class[] {String.class, String.class,};
    private List<Package> packages;

    public PackagesTableModel(Configuration configuration) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8365);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8366);this.configuration = configuration;
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8367);configuration.addPropertyChangeListener("packages", this);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8368);packages = new ArrayList<>(configuration.getPackages());

    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8369);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8370);return columnNames[column];
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8371);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8372);return columnNames.length;
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8373);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8374);return ((((packages == null) )&&(__CLR4_5_26gd6gdlx1h5nif.R.iget(8375)!=0|true))||(__CLR4_5_26gd6gdlx1h5nif.R.iget(8376)==0&false))? 0 : packages.size();
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8377);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8378);return columnTypes[columnIndex];
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8379);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8380);return columnIndex == 1;
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    public Package getPackage(int index) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8381);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8382);return packages.get(index);
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8383);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8384);try {
            __CLR4_5_26gd6gdlx1h5nif.R.inc(8385);Package this_package = packages.get(rowIndex);
            __CLR4_5_26gd6gdlx1h5nif.R.inc(8386);if ((((columnIndex == 1)&&(__CLR4_5_26gd6gdlx1h5nif.R.iget(8387)!=0|true))||(__CLR4_5_26gd6gdlx1h5nif.R.iget(8388)==0&false))) {{
                __CLR4_5_26gd6gdlx1h5nif.R.inc(8389);this_package.setDescription((String) aValue);
            }
        }}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8390);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8391);Package this_package = packages.get(row);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26gd6gdlx1h5nif.R.inc(8392);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26gd6gdlx1h5nif.R.inc(8393);__CLB4_5_2_bool0=true;}
                __CLR4_5_26gd6gdlx1h5nif.R.inc(8394);return this_package.getId();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26gd6gdlx1h5nif.R.inc(8395);__CLB4_5_2_bool0=true;}
                __CLR4_5_26gd6gdlx1h5nif.R.inc(8396);return this_package.getDescription();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26gd6gdlx1h5nif.R.inc(8397);__CLB4_5_2_bool0=true;}
                __CLR4_5_26gd6gdlx1h5nif.R.inc(8398);return null;
        }
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}

    @Override
    public void propertyChange(PropertyChangeEvent arg0) {try{__CLR4_5_26gd6gdlx1h5nif.R.inc(8399);
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8400);packages = new ArrayList<>(configuration.getPackages());
        __CLR4_5_26gd6gdlx1h5nif.R.inc(8401);fireTableDataChanged();
    }finally{__CLR4_5_26gd6gdlx1h5nif.R.flushNeeded();}}
}
