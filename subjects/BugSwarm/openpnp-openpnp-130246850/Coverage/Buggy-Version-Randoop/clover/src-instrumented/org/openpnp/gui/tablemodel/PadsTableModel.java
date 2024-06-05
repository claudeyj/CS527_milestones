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

import java.util.Locale;

import javax.swing.table.AbstractTableModel;

import org.openpnp.gui.support.LengthCellValue;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardPad;
import org.openpnp.model.BoardPad.Type;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Location;

@java.lang.SuppressWarnings({"fallthrough"}) public class PadsTableModel extends AbstractTableModel {public static class __CLR4_5_26he6helx1h1u3k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,8474,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final Configuration configuration;

    private String[] columnNames = new String[] {"Name", "Side", "X", "Y", "\u00f8", "Type"};

    private Class[] columnTypes = new Class[] {String.class, Side.class, LengthCellValue.class,
            LengthCellValue.class, String.class, Type.class};

    private Board board;

    public PadsTableModel(Configuration configuration) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8402);
        __CLR4_5_26he6helx1h1u3k.R.inc(8403);this.configuration = configuration;
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    public void setBoard(Board board) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8404);
        __CLR4_5_26he6helx1h1u3k.R.inc(8405);this.board = board;
        __CLR4_5_26he6helx1h1u3k.R.inc(8406);fireTableDataChanged();
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8407);
        __CLR4_5_26he6helx1h1u3k.R.inc(8408);return columnNames[column];
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26he6helx1h1u3k.R.inc(8409);
        __CLR4_5_26he6helx1h1u3k.R.inc(8410);return columnNames.length;
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26he6helx1h1u3k.R.inc(8411);
        __CLR4_5_26he6helx1h1u3k.R.inc(8412);return ((((board == null) )&&(__CLR4_5_26he6helx1h1u3k.R.iget(8413)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8414)==0&false))? 0 : board.getSolderPastePads().size();
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8415);
        __CLR4_5_26he6helx1h1u3k.R.inc(8416);return true;
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8417);
        __CLR4_5_26he6helx1h1u3k.R.inc(8418);return columnTypes[columnIndex];
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8419);
        __CLR4_5_26he6helx1h1u3k.R.inc(8420);try {
            __CLR4_5_26he6helx1h1u3k.R.inc(8421);BoardPad pad = board.getSolderPastePads().get(rowIndex);
            __CLR4_5_26he6helx1h1u3k.R.inc(8422);if ((((columnIndex == 0)&&(__CLR4_5_26he6helx1h1u3k.R.iget(8423)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8424)==0&false))) {{
                __CLR4_5_26he6helx1h1u3k.R.inc(8425);pad.setName((String) aValue);
            }
            }else {__CLR4_5_26he6helx1h1u3k.R.inc(8426);if ((((columnIndex == 1)&&(__CLR4_5_26he6helx1h1u3k.R.iget(8427)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8428)==0&false))) {{
                __CLR4_5_26he6helx1h1u3k.R.inc(8429);pad.setSide((Side) aValue);
            }
            }else {__CLR4_5_26he6helx1h1u3k.R.inc(8430);if ((((columnIndex == 2)&&(__CLR4_5_26he6helx1h1u3k.R.iget(8431)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8432)==0&false))) {{
                __CLR4_5_26he6helx1h1u3k.R.inc(8433);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26he6helx1h1u3k.R.inc(8434);value.setDisplayNativeUnits(true);
                __CLR4_5_26he6helx1h1u3k.R.inc(8435);Length length = value.getLength();
                __CLR4_5_26he6helx1h1u3k.R.inc(8436);Location location = pad.getLocation();
                __CLR4_5_26he6helx1h1u3k.R.inc(8437);location = Length.setLocationField(configuration, location, length, Length.Field.X,
                        true);
                __CLR4_5_26he6helx1h1u3k.R.inc(8438);pad.setLocation(location);
            }
            }else {__CLR4_5_26he6helx1h1u3k.R.inc(8439);if ((((columnIndex == 3)&&(__CLR4_5_26he6helx1h1u3k.R.iget(8440)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8441)==0&false))) {{
                __CLR4_5_26he6helx1h1u3k.R.inc(8442);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26he6helx1h1u3k.R.inc(8443);value.setDisplayNativeUnits(true);
                __CLR4_5_26he6helx1h1u3k.R.inc(8444);Length length = value.getLength();
                __CLR4_5_26he6helx1h1u3k.R.inc(8445);Location location = pad.getLocation();
                __CLR4_5_26he6helx1h1u3k.R.inc(8446);location = Length.setLocationField(configuration, location, length, Length.Field.Y,
                        true);
                __CLR4_5_26he6helx1h1u3k.R.inc(8447);pad.setLocation(location);
            }
            }else {__CLR4_5_26he6helx1h1u3k.R.inc(8448);if ((((columnIndex == 4)&&(__CLR4_5_26he6helx1h1u3k.R.iget(8449)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8450)==0&false))) {{
                __CLR4_5_26he6helx1h1u3k.R.inc(8451);pad.setLocation(pad.getLocation().derive(null, null, null,
                        Double.parseDouble(aValue.toString())));
            }
            }else {__CLR4_5_26he6helx1h1u3k.R.inc(8452);if ((((columnIndex == 5)&&(__CLR4_5_26he6helx1h1u3k.R.iget(8453)!=0|true))||(__CLR4_5_26he6helx1h1u3k.R.iget(8454)==0&false))) {{
                __CLR4_5_26he6helx1h1u3k.R.inc(8455);pad.setType((Type) aValue);
            }
        }}}}}}}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26he6helx1h1u3k.R.inc(8456);
        __CLR4_5_26he6helx1h1u3k.R.inc(8457);BoardPad pad = board.getSolderPastePads().get(row);
        __CLR4_5_26he6helx1h1u3k.R.inc(8458);Location loc = pad.getLocation();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26he6helx1h1u3k.R.inc(8459);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8460);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8461);return pad.getName();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8462);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8463);return pad.getSide();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8464);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8465);return new LengthCellValue(loc.getLengthX(), true);
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8466);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8467);return new LengthCellValue(loc.getLengthY(), true);
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8468);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8469);return String.format(Locale.US, configuration.getLengthDisplayFormat(),
                        loc.getRotation());
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8470);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8471);return pad.getType();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26he6helx1h1u3k.R.inc(8472);__CLB4_5_2_bool0=true;}
                __CLR4_5_26he6helx1h1u3k.R.inc(8473);return null;
        }
    }finally{__CLR4_5_26he6helx1h1u3k.R.flushNeeded();}}
}
