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
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.Length;
import org.openpnp.model.Location;

@java.lang.SuppressWarnings({"fallthrough"}) public class BoardLocationsTableModel extends AbstractTableModel {public static class __CLR4_5_266d66dlx1h1tzg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,8117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Configuration configuration;

    private String[] columnNames = new String[] {"Board", "Width", "Height", "Side", "X", "Y", "Z",
            "\u00f8", "Enabled?", "Check Fids?"};

    private Class[] columnTypes = new Class[] {String.class, LengthCellValue.class,
            LengthCellValue.class, Side.class, LengthCellValue.class, LengthCellValue.class,
            LengthCellValue.class, String.class, Boolean.class, Boolean.class};

    private Job job;

    public BoardLocationsTableModel(Configuration configuration) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8005);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8006);this.configuration = configuration;
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    public void setJob(Job job) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8007);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8008);this.job = job;
        __CLR4_5_266d66dlx1h1tzg.R.inc(8009);fireTableDataChanged();
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    public Job getJob() {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8010);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8011);return job;
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8012);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8013);return columnNames[column];
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    public int getColumnCount() {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8014);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8015);return columnNames.length;
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    public int getRowCount() {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8016);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8017);if ((((job == null)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8018)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8019)==0&false))) {{
            __CLR4_5_266d66dlx1h1tzg.R.inc(8020);return 0;
        }
        }__CLR4_5_266d66dlx1h1tzg.R.inc(8021);return job.getBoardLocations().size();
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8022);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8023);return columnTypes[columnIndex];
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8024);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8025);return (columnIndex != 0);
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8026);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8027);try {
            __CLR4_5_266d66dlx1h1tzg.R.inc(8028);BoardLocation boardLocation = job.getBoardLocations().get(rowIndex);
            __CLR4_5_266d66dlx1h1tzg.R.inc(8029);if ((((columnIndex == 0)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8030)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8031)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8032);boardLocation.getBoard().setName((String) aValue);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8033);if ((((columnIndex == 1)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8034)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8035)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8036);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_266d66dlx1h1tzg.R.inc(8037);Length length = value.getLength();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8038);Location location = boardLocation.getBoard().getDimensions();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8039);location = Length.setLocationField(configuration, location, length, Length.Field.X);
                __CLR4_5_266d66dlx1h1tzg.R.inc(8040);boardLocation.getBoard().setDimensions(location);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8041);if ((((columnIndex == 2)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8042)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8043)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8044);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_266d66dlx1h1tzg.R.inc(8045);Length length = value.getLength();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8046);Location location = boardLocation.getBoard().getDimensions();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8047);location = Length.setLocationField(configuration, location, length, Length.Field.Y);
                __CLR4_5_266d66dlx1h1tzg.R.inc(8048);boardLocation.getBoard().setDimensions(location);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8049);if ((((columnIndex == 3)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8050)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8051)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8052);boardLocation.setSide((Side) aValue);
                __CLR4_5_266d66dlx1h1tzg.R.inc(8053);fireTableCellUpdated(rowIndex, columnIndex);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8054);if ((((columnIndex == 4)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8055)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8056)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8057);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_266d66dlx1h1tzg.R.inc(8058);Length length = value.getLength();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8059);Location location = boardLocation.getLocation();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8060);location = Length.setLocationField(configuration, location, length, Length.Field.X);
                __CLR4_5_266d66dlx1h1tzg.R.inc(8061);boardLocation.setLocation(location);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8062);if ((((columnIndex == 5)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8063)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8064)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8065);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_266d66dlx1h1tzg.R.inc(8066);Length length = value.getLength();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8067);Location location = boardLocation.getLocation();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8068);location = Length.setLocationField(configuration, location, length, Length.Field.Y);
                __CLR4_5_266d66dlx1h1tzg.R.inc(8069);boardLocation.setLocation(location);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8070);if ((((columnIndex == 6)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8071)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8072)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8073);LengthCellValue value = (LengthCellValue) aValue;
                __CLR4_5_266d66dlx1h1tzg.R.inc(8074);Length length = value.getLength();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8075);Location location = boardLocation.getLocation();
                __CLR4_5_266d66dlx1h1tzg.R.inc(8076);location = Length.setLocationField(configuration, location, length, Length.Field.Z);
                __CLR4_5_266d66dlx1h1tzg.R.inc(8077);boardLocation.setLocation(location);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8078);if ((((columnIndex == 7)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8079)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8080)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8081);boardLocation.setLocation(boardLocation.getLocation().derive(null, null, null,
                        Double.parseDouble(aValue.toString())));
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8082);if ((((columnIndex == 8)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8083)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8084)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8085);boardLocation.setEnabled((Boolean) aValue);
            }
            }else {__CLR4_5_266d66dlx1h1tzg.R.inc(8086);if ((((columnIndex == 9)&&(__CLR4_5_266d66dlx1h1tzg.R.iget(8087)!=0|true))||(__CLR4_5_266d66dlx1h1tzg.R.iget(8088)==0&false))) {{
                __CLR4_5_266d66dlx1h1tzg.R.inc(8089);boardLocation.setCheckFiducials((Boolean) aValue);
            }
        }}}}}}}}}}}
        catch (Exception e) {
            // TODO: dialog, bad input
        }
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}

    public Object getValueAt(int row, int col) {try{__CLR4_5_266d66dlx1h1tzg.R.inc(8090);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8091);BoardLocation boardLocation = job.getBoardLocations().get(row);
        __CLR4_5_266d66dlx1h1tzg.R.inc(8092);Location loc = boardLocation.getLocation();
        __CLR4_5_266d66dlx1h1tzg.R.inc(8093);Location dim = boardLocation.getBoard().getDimensions();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_266d66dlx1h1tzg.R.inc(8094);switch (col) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8095);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8096);return boardLocation.getBoard().getName();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8097);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8098);return new LengthCellValue(dim.getLengthX());
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8099);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8100);return new LengthCellValue(dim.getLengthY());
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8101);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8102);return boardLocation.getSide();
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8103);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8104);return new LengthCellValue(loc.getLengthX());
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8105);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8106);return new LengthCellValue(loc.getLengthY());
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8107);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8108);return new LengthCellValue(loc.getLengthZ());
            case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8109);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8110);return String.format(Locale.US, configuration.getLengthDisplayFormat(),
                        loc.getRotation(), "");
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8111);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8112);return boardLocation.isEnabled();
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8113);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8114);return boardLocation.isCheckFiducials();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_266d66dlx1h1tzg.R.inc(8115);__CLB4_5_2_bool0=true;}
                __CLR4_5_266d66dlx1h1tzg.R.inc(8116);return null;
        }
    }finally{__CLR4_5_266d66dlx1h1tzg.R.flushNeeded();}}
}
