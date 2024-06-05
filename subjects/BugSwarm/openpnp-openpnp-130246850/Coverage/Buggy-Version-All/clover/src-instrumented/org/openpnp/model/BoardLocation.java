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

package org.openpnp.model;

import org.openpnp.model.Board.Side;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Commit;

public class BoardLocation extends AbstractModelObject {public static class __CLR4_5_2bvabvalx1h39x9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,15426,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Element
    private Location location;
    @Attribute
    private Side side = Side.Top;
    private Board board;

    @Attribute
    private String boardFile;

    @Attribute(required = false)
    private boolean checkFiducials;

    @Attribute(required = false)
    private boolean enabled = true;

    BoardLocation() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15382);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15383);setLocation(new Location(LengthUnit.Millimeters));
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public BoardLocation(Board board) {
        this();__CLR4_5_2bvabvalx1h39x9.R.inc(15385);try{__CLR4_5_2bvabvalx1h39x9.R.inc(15384);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15386);setBoard(board);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15387);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15388);setLocation(location);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15389);setBoard(board);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public Location getLocation() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15390);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15391);return location;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public void setLocation(Location location) {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15392);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15393);Location oldValue = this.location;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15394);this.location = location;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15395);firePropertyChange("location", oldValue, location);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public Side getSide() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15396);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15397);return side;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public void setSide(Side side) {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15398);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15399);Object oldValue = this.side;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15400);this.side = side;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15401);firePropertyChange("side", oldValue, side);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public Board getBoard() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15402);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15403);return board;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public void setBoard(Board board) {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15404);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15405);Board oldValue = this.board;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15406);this.board = board;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15407);firePropertyChange("board", oldValue, board);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    String getBoardFile() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15408);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15409);return boardFile;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    void setBoardFile(String boardFile) {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15410);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15411);this.boardFile = boardFile;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public boolean isCheckFiducials() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15412);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15413);return checkFiducials;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public void setCheckFiducials(boolean checkFiducials) {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15414);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15415);boolean oldValue = this.checkFiducials;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15416);this.checkFiducials = checkFiducials;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15417);firePropertyChange("checkFiducials", oldValue, checkFiducials);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public boolean isEnabled() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15418);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15419);return enabled;
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    public void setEnabled(boolean enabled) {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15420);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15421);boolean oldValue = this.enabled;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15422);this.enabled = enabled;
        __CLR4_5_2bvabvalx1h39x9.R.inc(15423);firePropertyChange("enabled", oldValue, enabled);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2bvabvalx1h39x9.R.inc(15424);
        __CLR4_5_2bvabvalx1h39x9.R.inc(15425);return String.format("board (%s), location (%s), side (%s)", boardFile, location, side);
    }finally{__CLR4_5_2bvabvalx1h39x9.R.flushNeeded();}}
}
