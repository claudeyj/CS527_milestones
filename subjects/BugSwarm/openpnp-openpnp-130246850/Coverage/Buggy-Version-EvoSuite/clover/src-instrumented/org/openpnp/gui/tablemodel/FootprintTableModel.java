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
import org.openpnp.model.Configuration;
import org.openpnp.model.Footprint;
import org.openpnp.model.Footprint.Pad;
import org.openpnp.model.Length;

@java.lang.SuppressWarnings({"fallthrough"}) public class FootprintTableModel extends AbstractTableModel {public static class __CLR4_5_26cv6cvlx1h0ae2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,8338,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String[] columnNames =
            new String[] {"Name", "X", "Y", "Width", "Height", "\u00f8", "% Round"};

    private Class[] columnTypes =
            new Class[] {String.class, LengthCellValue.class, LengthCellValue.class,
                    LengthCellValue.class, LengthCellValue.class, String.class, String.class};

    final private Footprint footprint;

    public FootprintTableModel(Footprint footprint) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8239);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8240);this.footprint = footprint;
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    public Pad getPad(int index) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8241);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8242);return footprint.getPads().get(index);
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8243);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8244);return columnNames[column];
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8245);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8246);return columnNames.length;
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8247);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8248);if ((((footprint == null)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8249)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8250)==0&false))) {{
            __CLR4_5_26cv6cvlx1h0ae2.R.inc(8251);return 0;
        }
        }__CLR4_5_26cv6cvlx1h0ae2.R.inc(8252);return footprint.getPads().size();
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8253);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8254);return true;
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8255);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8256);return columnTypes[columnIndex];
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8257);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8258);try {
            __CLR4_5_26cv6cvlx1h0ae2.R.inc(8259);Pad pad = footprint.getPads().get(rowIndex);
            __CLR4_5_26cv6cvlx1h0ae2.R.inc(8260);if ((((columnIndex == 0)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8261)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8262)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8263);pad.setName((String) aValue);
            }
            }else {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8264);if ((((columnIndex == 1)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8265)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8266)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8267);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8268);Length length = value.getLength();
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8269);if ((((length.getUnits() == null)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8270)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8271)==0&false))) {{
                    __CLR4_5_26cv6cvlx1h0ae2.R.inc(8272);length.setUnits(footprint.getUnits());
                }
                }__CLR4_5_26cv6cvlx1h0ae2.R.inc(8273);length = length.convertToUnits(footprint.getUnits());
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8274);pad.setX(length.getValue());
            }
            }else {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8275);if ((((columnIndex == 2)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8276)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8277)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8278);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8279);Length length = value.getLength();
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8280);if ((((length.getUnits() == null)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8281)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8282)==0&false))) {{
                    __CLR4_5_26cv6cvlx1h0ae2.R.inc(8283);length.setUnits(footprint.getUnits());
                }
                }__CLR4_5_26cv6cvlx1h0ae2.R.inc(8284);length = length.convertToUnits(footprint.getUnits());
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8285);pad.setY(length.getValue());
            }
            }else {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8286);if ((((columnIndex == 3)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8287)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8288)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8289);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8290);Length length = value.getLength();
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8291);if ((((length.getUnits() == null)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8292)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8293)==0&false))) {{
                    __CLR4_5_26cv6cvlx1h0ae2.R.inc(8294);length.setUnits(footprint.getUnits());
                }
                }__CLR4_5_26cv6cvlx1h0ae2.R.inc(8295);length = length.convertToUnits(footprint.getUnits());
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8296);pad.setWidth(length.getValue());
            }
            }else {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8297);if ((((columnIndex == 4)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8298)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8299)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8300);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8301);Length length = value.getLength();
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8302);if ((((length.getUnits() == null)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8303)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8304)==0&false))) {{
                    __CLR4_5_26cv6cvlx1h0ae2.R.inc(8305);length.setUnits(footprint.getUnits());
                }
                }__CLR4_5_26cv6cvlx1h0ae2.R.inc(8306);length = length.convertToUnits(footprint.getUnits());
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8307);pad.setHeight(length.getValue());
            }
            }else {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8308);if ((((columnIndex == 5)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8309)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8310)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8311);pad.setRotation(Double.parseDouble(aValue.toString()));
            }
            }else {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8312);if ((((columnIndex == 6)&&(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8313)!=0|true))||(__CLR4_5_26cv6cvlx1h0ae2.R.iget(8314)==0&false))) {{
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8315);double val = Double.parseDouble(aValue.toString());
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8316);val = Math.max(val, 0);
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8317);val = Math.min(val, 100);
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8318);pad.setRoundness(val);
            }
        }}}}}}}}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_26cv6cvlx1h0ae2.R.inc(8319);
        __CLR4_5_26cv6cvlx1h0ae2.R.inc(8320);Pad pad = footprint.getPads().get(row);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_26cv6cvlx1h0ae2.R.inc(8321);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8322);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8323);return pad.getName();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8324);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8325);return new LengthCellValue(new Length(pad.getX(), footprint.getUnits()), true);
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8326);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8327);return new LengthCellValue(new Length(pad.getY(), footprint.getUnits()), true);
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8328);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8329);return new LengthCellValue(new Length(pad.getWidth(), footprint.getUnits()), true);
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8330);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8331);return new LengthCellValue(new Length(pad.getHeight(), footprint.getUnits()), true);
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8332);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8333);return String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                        pad.getRotation());
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8334);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8335);return String.format(Locale.US, Configuration.get().getLengthDisplayFormat(),
                        pad.getRoundness());
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26cv6cvlx1h0ae2.R.inc(8336);__CLB4_5_2_bool0=true;}
                __CLR4_5_26cv6cvlx1h0ae2.R.inc(8337);return null;
        }
    }finally{__CLR4_5_26cv6cvlx1h0ae2.R.flushNeeded();}}
}
