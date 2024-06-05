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
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.model.Placement.Type;
import org.openpnp.spi.Feeder;

@java.lang.SuppressWarnings({"fallthrough"}) public class PlacementsTableModel extends AbstractTableModel {public static class __CLR4_5_26lb6lblx1h5njz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,8643,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final Configuration configuration;

    private String[] columnNames =
            new String[] {"Id", "Part", "Side", "X", "Y", "\u00f8", "Type", "Status"};

    private Class[] columnTypes = new Class[] {String.class, Part.class, Side.class,
            LengthCellValue.class, LengthCellValue.class, String.class, Type.class, Status.class};

    public enum Status {
        Ready, MissingPart, MissingFeeder, ZeroPartHeight
    }

    private Board board;

    public PlacementsTableModel(Configuration configuration) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8543);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8544);this.configuration = configuration;
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    public void setBoard(Board board) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8545);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8546);this.board = board;
        __CLR4_5_26lb6lblx1h5njz.R.inc(8547);fireTableDataChanged();
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8548);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8549);return columnNames[column];
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8550);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8551);return columnNames.length;
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8552);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8553);return ((((board == null) )&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8554)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8555)==0&false))? 0 : board.getPlacements().size();
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8556);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8557);return columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4
                || columnIndex == 5 || columnIndex == 6;
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8558);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8559);return columnTypes[columnIndex];
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8560);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8561);try {
            __CLR4_5_26lb6lblx1h5njz.R.inc(8562);Placement placement = board.getPlacements().get(rowIndex);
            __CLR4_5_26lb6lblx1h5njz.R.inc(8563);if ((((columnIndex == 1)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8564)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8565)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8566);placement.setPart((Part) aValue);
            }
            }else {__CLR4_5_26lb6lblx1h5njz.R.inc(8567);if ((((columnIndex == 2)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8568)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8569)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8570);placement.setSide((Side) aValue);
            }
            }else {__CLR4_5_26lb6lblx1h5njz.R.inc(8571);if ((((columnIndex == 3)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8572)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8573)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8574);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26lb6lblx1h5njz.R.inc(8575);value.setDisplayNativeUnits(true);
                __CLR4_5_26lb6lblx1h5njz.R.inc(8576);Length length = value.getLength();
                __CLR4_5_26lb6lblx1h5njz.R.inc(8577);Location location = placement.getLocation();
                __CLR4_5_26lb6lblx1h5njz.R.inc(8578);location = Length.setLocationField(configuration, location, length, Length.Field.X,
                        true);
                __CLR4_5_26lb6lblx1h5njz.R.inc(8579);placement.setLocation(location);
            }
            }else {__CLR4_5_26lb6lblx1h5njz.R.inc(8580);if ((((columnIndex == 4)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8581)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8582)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8583);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26lb6lblx1h5njz.R.inc(8584);value.setDisplayNativeUnits(true);
                __CLR4_5_26lb6lblx1h5njz.R.inc(8585);Length length = value.getLength();
                __CLR4_5_26lb6lblx1h5njz.R.inc(8586);Location location = placement.getLocation();
                __CLR4_5_26lb6lblx1h5njz.R.inc(8587);location = Length.setLocationField(configuration, location, length, Length.Field.Y,
                        true);
                __CLR4_5_26lb6lblx1h5njz.R.inc(8588);placement.setLocation(location);
            }
            }else {__CLR4_5_26lb6lblx1h5njz.R.inc(8589);if ((((columnIndex == 5)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8590)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8591)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8592);placement.setLocation(placement.getLocation().derive(null, null, null,
                        Double.parseDouble(aValue.toString())));
            }
            }else {__CLR4_5_26lb6lblx1h5njz.R.inc(8593);if ((((columnIndex == 6)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8594)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8595)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8596);placement.setType((Type) aValue);
            }
        }}}}}}}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    // TODO: Ideally this would all come from the JobPlanner, but this is a
    // good start for now.
    private Status getPlacementStatus(Placement placement) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8597);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8598);if ((((placement.getPart() == null)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8599)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8600)==0&false))) {{
            __CLR4_5_26lb6lblx1h5njz.R.inc(8601);return Status.MissingPart;
        }
        }__CLR4_5_26lb6lblx1h5njz.R.inc(8602);if ((((placement.getType() == Placement.Type.Place)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8603)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8604)==0&false))) {{
            __CLR4_5_26lb6lblx1h5njz.R.inc(8605);boolean found = false;
            __CLR4_5_26lb6lblx1h5njz.R.inc(8606);for (Feeder feeder : Configuration.get().getMachine().getFeeders()) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8607);if ((((feeder.getPart() == placement.getPart() && feeder.isEnabled())&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8608)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8609)==0&false))) {{
                    __CLR4_5_26lb6lblx1h5njz.R.inc(8610);found = true;
                    __CLR4_5_26lb6lblx1h5njz.R.inc(8611);break;
                }
            }}
            }__CLR4_5_26lb6lblx1h5njz.R.inc(8612);if ((((!found)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8613)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8614)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8615);return Status.MissingFeeder;
            }

            }__CLR4_5_26lb6lblx1h5njz.R.inc(8616);if ((((placement.getPart().getHeight().getValue() == 0)&&(__CLR4_5_26lb6lblx1h5njz.R.iget(8617)!=0|true))||(__CLR4_5_26lb6lblx1h5njz.R.iget(8618)==0&false))) {{
                __CLR4_5_26lb6lblx1h5njz.R.inc(8619);return Status.ZeroPartHeight;
            }
        }}
        }__CLR4_5_26lb6lblx1h5njz.R.inc(8620);return Status.Ready;
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26lb6lblx1h5njz.R.inc(8621);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8622);Placement placement = board.getPlacements().get(row);
        __CLR4_5_26lb6lblx1h5njz.R.inc(8623);Location loc = placement.getLocation();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26lb6lblx1h5njz.R.inc(8624);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8625);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8626);return placement.getId();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8627);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8628);return placement.getPart();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8629);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8630);return placement.getSide();
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8631);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8632);return new LengthCellValue(loc.getLengthX(), true);
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8633);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8634);return new LengthCellValue(loc.getLengthY(), true);
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8635);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8636);return String.format(Locale.US, configuration.getLengthDisplayFormat(),
                        loc.getRotation());
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8637);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8638);return placement.getType();
            case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8639);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8640);return getPlacementStatus(placement);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26lb6lblx1h5njz.R.inc(8641);__CLB4_5_2_bool0=true;}
                __CLR4_5_26lb6lblx1h5njz.R.inc(8642);return null;
        }
    }finally{__CLR4_5_26lb6lblx1h5njz.R.flushNeeded();}}
}
