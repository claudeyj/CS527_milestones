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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.core.Commit;

/**
 * A Job specifies a list of one or more BoardLocations.
 */
@Root(name = "openpnp-job")
public class Job extends AbstractModelObject implements PropertyChangeListener {public static class __CLR4_5_2c6qc6qlx1h3a2j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,15830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @ElementList
    private ArrayList<BoardLocation> boardLocations = new ArrayList<>();

    private transient File file;
    private transient boolean dirty;

    public Job() {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15794);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15795);addPropertyChangeListener(this);
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15796);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15797);for (BoardLocation boardLocation : boardLocations) {{
            __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15798);boardLocation.addPropertyChangeListener(this);
        }
    }}finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public List<BoardLocation> getBoardLocations() {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15799);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15800);return Collections.unmodifiableList(boardLocations);
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public void addBoardLocation(BoardLocation boardLocation) {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15801);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15802);Object oldValue = boardLocations;
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15803);boardLocations = new ArrayList<>(boardLocations);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15804);boardLocations.add(boardLocation);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15805);firePropertyChange("boardLocations", oldValue, boardLocations);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15806);boardLocation.addPropertyChangeListener(this);
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public void removeBoardLocation(BoardLocation boardLocation) {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15807);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15808);Object oldValue = boardLocations;
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15809);boardLocations = new ArrayList<>(boardLocations);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15810);boardLocations.remove(boardLocation);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15811);firePropertyChange("boardLocations", oldValue, boardLocations);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15812);boardLocation.removePropertyChangeListener(this);
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public File getFile() {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15813);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15814);return file;
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public void setFile(File file) {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15815);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15816);Object oldValue = this.file;
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15817);this.file = file;
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15818);firePropertyChange("file", oldValue, file);
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public boolean isDirty() {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15819);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15820);return dirty;
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public void setDirty(boolean dirty) {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15821);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15822);boolean oldValue = this.dirty;
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15823);this.dirty = dirty;
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15824);firePropertyChange("dirty", oldValue, dirty);
    }finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}

    public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_2c6qc6qlx1h3a2j.R.inc(15825);
        __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15826);if ((((evt.getSource() != Job.this || !evt.getPropertyName().equals("dirty"))&&(__CLR4_5_2c6qc6qlx1h3a2j.R.iget(15827)!=0|true))||(__CLR4_5_2c6qc6qlx1h3a2j.R.iget(15828)==0&false))) {{
            __CLR4_5_2c6qc6qlx1h3a2j.R.inc(15829);setDirty(true);
        }
    }}finally{__CLR4_5_2c6qc6qlx1h3a2j.R.flushNeeded();}}
}
