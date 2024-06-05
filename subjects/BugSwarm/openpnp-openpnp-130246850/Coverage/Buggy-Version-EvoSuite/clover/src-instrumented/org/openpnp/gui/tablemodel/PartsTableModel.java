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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.openpnp.gui.support.LengthCellValue;
import org.openpnp.gui.support.PercentConverter;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Package;
import org.openpnp.model.Part;

@SuppressWarnings({"serial","fallthrough"})
public class PartsTableModel extends AbstractTableModel implements PropertyChangeListener {public static class __CLR4_5_26je6jelx1h0ag4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,8543,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String[] columnNames =
            new String[] {"Id", "Description", "Height", "Package", "Speed %"};
    private Class[] columnTypes = new Class[] {String.class, String.class, LengthCellValue.class,
            Package.class, String.class};
    private List<Part> parts;
    private PercentConverter percentConverter = new PercentConverter();

    public PartsTableModel() {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8474);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8475);Configuration.get().addPropertyChangeListener("parts", this);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8476);parts = new ArrayList<>(Configuration.get().getParts());
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8477);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8478);return columnNames[column];
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8479);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8480);return columnNames.length;
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8481);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8482);return ((((parts == null) )&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8483)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8484)==0&false))? 0 : parts.size();
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8485);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8486);return columnTypes[columnIndex];
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8487);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8488);return columnIndex != 0;
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    public Part getPart(int index) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8489);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8490);return parts.get(index);
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8491);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8492);try {
            __CLR4_5_26je6jelx1h0ag4.R.inc(8493);Part part = parts.get(rowIndex);
            __CLR4_5_26je6jelx1h0ag4.R.inc(8494);if ((((columnIndex == 1)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8495)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8496)==0&false))) {{
                __CLR4_5_26je6jelx1h0ag4.R.inc(8497);part.setName((String) aValue);
            }
            }else {__CLR4_5_26je6jelx1h0ag4.R.inc(8498);if ((((columnIndex == 2)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8499)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8500)==0&false))) {{
                __CLR4_5_26je6jelx1h0ag4.R.inc(8501);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26je6jelx1h0ag4.R.inc(8502);value.setDisplayNativeUnits(true);
                __CLR4_5_26je6jelx1h0ag4.R.inc(8503);Length length = value.getLength();
                __CLR4_5_26je6jelx1h0ag4.R.inc(8504);Length oldLength = part.getHeight();
                __CLR4_5_26je6jelx1h0ag4.R.inc(8505);if ((((length.getUnits() == null)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8506)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8507)==0&false))) {{
                    __CLR4_5_26je6jelx1h0ag4.R.inc(8508);if ((((oldLength != null)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8509)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8510)==0&false))) {{
                        __CLR4_5_26je6jelx1h0ag4.R.inc(8511);length.setUnits(oldLength.getUnits());
                    }
                    }__CLR4_5_26je6jelx1h0ag4.R.inc(8512);if ((((length.getUnits() == null)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8513)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8514)==0&false))) {{
                        __CLR4_5_26je6jelx1h0ag4.R.inc(8515);length.setUnits(Configuration.get().getSystemUnits());
                    }
                }}
                }__CLR4_5_26je6jelx1h0ag4.R.inc(8516);part.setHeight(length);
            }
            }else {__CLR4_5_26je6jelx1h0ag4.R.inc(8517);if ((((columnIndex == 3)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8518)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8519)==0&false))) {{
                __CLR4_5_26je6jelx1h0ag4.R.inc(8520);part.setPackage((Package) aValue);
            }
            }else {__CLR4_5_26je6jelx1h0ag4.R.inc(8521);if ((((columnIndex == 4)&&(__CLR4_5_26je6jelx1h0ag4.R.iget(8522)!=0|true))||(__CLR4_5_26je6jelx1h0ag4.R.iget(8523)==0&false))) {{
                __CLR4_5_26je6jelx1h0ag4.R.inc(8524);part.setSpeed(percentConverter.convertReverse(aValue.toString()));
            }
        }}}}}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8525);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8526);Part part = parts.get(row);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26je6jelx1h0ag4.R.inc(8527);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26je6jelx1h0ag4.R.inc(8528);__CLB4_5_2_bool0=true;}
                __CLR4_5_26je6jelx1h0ag4.R.inc(8529);return part.getId();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26je6jelx1h0ag4.R.inc(8530);__CLB4_5_2_bool0=true;}
                __CLR4_5_26je6jelx1h0ag4.R.inc(8531);return part.getName();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_26je6jelx1h0ag4.R.inc(8532);__CLB4_5_2_bool0=true;}
                __CLR4_5_26je6jelx1h0ag4.R.inc(8533);return new LengthCellValue(part.getHeight(), true);
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_26je6jelx1h0ag4.R.inc(8534);__CLB4_5_2_bool0=true;}
                __CLR4_5_26je6jelx1h0ag4.R.inc(8535);return part.getPackage();
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_26je6jelx1h0ag4.R.inc(8536);__CLB4_5_2_bool0=true;}
                __CLR4_5_26je6jelx1h0ag4.R.inc(8537);return percentConverter.convertForward(part.getSpeed());
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26je6jelx1h0ag4.R.inc(8538);__CLB4_5_2_bool0=true;}
                __CLR4_5_26je6jelx1h0ag4.R.inc(8539);return null;
        }
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}

    @Override
    public void propertyChange(PropertyChangeEvent arg0) {try{__CLR4_5_26je6jelx1h0ag4.R.inc(8540);
        __CLR4_5_26je6jelx1h0ag4.R.inc(8541);parts = new ArrayList<>(Configuration.get().getParts());
        __CLR4_5_26je6jelx1h0ag4.R.inc(8542);fireTableDataChanged();
    }finally{__CLR4_5_26je6jelx1h0ag4.R.flushNeeded();}}
}
