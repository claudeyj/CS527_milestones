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
import org.openpnp.model.Part;
import org.openpnp.spi.Feeder;

@java.lang.SuppressWarnings({"fallthrough"}) public class FeedersTableModel extends AbstractTableModel {public static class __CLR4_5_26bd6bdlx1h1u09{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,8239,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final private Configuration configuration;

    private String[] columnNames = new String[] {"Name", "Type", "Part", "Enabled"};
    private List<Feeder> feeders;

    public FeedersTableModel(Configuration configuration) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8185);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8186);this.configuration = configuration;
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8187);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8188);
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8189);refresh();
            }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}
        });
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    public void refresh() {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8190);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8191);feeders = new ArrayList<>(configuration.getMachine().getFeeders());
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8192);fireTableDataChanged();
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8193);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8194);return columnNames[column];
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8195);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8196);return columnNames.length;
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8197);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8198);return ((((feeders == null) )&&(__CLR4_5_26bd6bdlx1h1u09.R.iget(8199)!=0|true))||(__CLR4_5_26bd6bdlx1h1u09.R.iget(8200)==0&false))? 0 : feeders.size();
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    public Feeder getFeeder(int index) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8201);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8202);return feeders.get(index);
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8203);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8204);return columnIndex == 0 || columnIndex == 3;
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8205);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8206);try {
            __CLR4_5_26bd6bdlx1h1u09.R.inc(8207);Feeder feeder = feeders.get(rowIndex);
            __CLR4_5_26bd6bdlx1h1u09.R.inc(8208);if ((((columnIndex == 0)&&(__CLR4_5_26bd6bdlx1h1u09.R.iget(8209)!=0|true))||(__CLR4_5_26bd6bdlx1h1u09.R.iget(8210)==0&false))) {{
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8211);feeder.setName((String) aValue);
            }
            }else {__CLR4_5_26bd6bdlx1h1u09.R.inc(8212);if ((((columnIndex == 3)&&(__CLR4_5_26bd6bdlx1h1u09.R.iget(8213)!=0|true))||(__CLR4_5_26bd6bdlx1h1u09.R.iget(8214)==0&false))) {{
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8215);feeder.setEnabled((Boolean) aValue);
            }
        }}}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8216);
        __CLR4_5_26bd6bdlx1h1u09.R.inc(8217);if ((((columnIndex == 3)&&(__CLR4_5_26bd6bdlx1h1u09.R.iget(8218)!=0|true))||(__CLR4_5_26bd6bdlx1h1u09.R.iget(8219)==0&false))) {{
            __CLR4_5_26bd6bdlx1h1u09.R.inc(8220);return Boolean.class;
        }
        }__CLR4_5_26bd6bdlx1h1u09.R.inc(8221);return super.getColumnClass(columnIndex);
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26bd6bdlx1h1u09.R.inc(8222);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26bd6bdlx1h1u09.R.inc(8223);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26bd6bdlx1h1u09.R.inc(8224);__CLB4_5_2_bool0=true;}
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8225);return feeders.get(row).getName();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26bd6bdlx1h1u09.R.inc(8226);__CLB4_5_2_bool0=true;}
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8227);return feeders.get(row).getClass().getSimpleName();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_26bd6bdlx1h1u09.R.inc(8228);__CLB4_5_2_bool0=true;} {
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8229);Part part = feeders.get(row).getPart();
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8230);if ((((part == null)&&(__CLR4_5_26bd6bdlx1h1u09.R.iget(8231)!=0|true))||(__CLR4_5_26bd6bdlx1h1u09.R.iget(8232)==0&false))) {{
                    __CLR4_5_26bd6bdlx1h1u09.R.inc(8233);return null;
                }
                }__CLR4_5_26bd6bdlx1h1u09.R.inc(8234);return part.getId();
            }
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_26bd6bdlx1h1u09.R.inc(8235);__CLB4_5_2_bool0=true;}
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8236);return feeders.get(row).isEnabled();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26bd6bdlx1h1u09.R.inc(8237);__CLB4_5_2_bool0=true;}
                __CLR4_5_26bd6bdlx1h1u09.R.inc(8238);return null;
        }
    }finally{__CLR4_5_26bd6bdlx1h1u09.R.flushNeeded();}}
}
