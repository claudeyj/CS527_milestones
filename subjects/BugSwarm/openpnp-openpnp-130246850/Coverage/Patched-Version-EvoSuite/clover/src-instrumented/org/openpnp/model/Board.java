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

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.core.Commit;

/**
 * A Board describes the physical properties of a PCB and has a list of Placements that will be used
 * to specify pick and place operations.
 */
@Root(name = "openpnp-board")
public class Board extends AbstractModelObject implements PropertyChangeListener {public static class __CLR4_5_2bslbsllx1h5q5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,15383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public enum Side {
        Bottom, Top
    }

    @Attribute
    private String name;

    @Element(required = false)
    private Outline outline;

    @Element(required = false)
    private Location dimensions = new Location(LengthUnit.Millimeters);

    @ElementList(required = false)
    private ArrayList<Fiducial> fiducials = new ArrayList<>();

    @ElementList
    private ArrayList<Placement> placements = new ArrayList<>();

    @ElementList(required = false)
    private ArrayList<BoardPad> solderPastePads = new ArrayList<>();

    private transient File file;
    private transient boolean dirty;

    public Board() {
        this(null);__CLR4_5_2bslbsllx1h5q5i.R.inc(15286);try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15285);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public Board(File file) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15287);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15288);setFile(file);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15289);setOutline(new Outline());
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15290);addPropertyChangeListener(this);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15291);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15292);for (Placement placement : placements) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15293);placement.addPropertyChangeListener(this);
        }
        }__CLR4_5_2bslbsllx1h5q5i.R.inc(15294);for (BoardPad pad : solderPastePads) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15295);pad.addPropertyChangeListener(this);
        }
    }}finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public List<Fiducial> getFiducials() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15296);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15297);return Collections.unmodifiableList(fiducials);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public Location getDimensions() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15298);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15299);return dimensions;
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void setDimensions(Location location) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15300);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15301);Location oldValue = this.dimensions;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15302);this.dimensions = location;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15303);firePropertyChange("dimensions", oldValue, location);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void addFiducial(Fiducial fiducial) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15304);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15305);ArrayList<Fiducial> oldValue = fiducials;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15306);fiducials = new ArrayList<>(fiducials);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15307);fiducials.add(fiducial);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15308);firePropertyChange("fiducials", oldValue, fiducials);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void removeFiducial(Fiducial fiducial) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15309);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15310);ArrayList<Fiducial> oldValue = fiducials;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15311);fiducials = new ArrayList<>(fiducials);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15312);fiducials.remove(fiducial);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15313);firePropertyChange("fiducials", oldValue, fiducials);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public List<Placement> getPlacements() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15314);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15315);return Collections.unmodifiableList(placements);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void addPlacement(Placement placement) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15316);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15317);Object oldValue = placements;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15318);placements = new ArrayList<>(placements);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15319);placements.add(placement);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15320);firePropertyChange("placements", oldValue, placements);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15321);if ((((placement != null)&&(__CLR4_5_2bslbsllx1h5q5i.R.iget(15322)!=0|true))||(__CLR4_5_2bslbsllx1h5q5i.R.iget(15323)==0&false))) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15324);placement.addPropertyChangeListener(this);
        }
    }}finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void removePlacement(Placement placement) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15325);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15326);Object oldValue = placements;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15327);placements = new ArrayList<>(placements);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15328);placements.remove(placement);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15329);firePropertyChange("placements", oldValue, placements);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15330);if ((((placement != null)&&(__CLR4_5_2bslbsllx1h5q5i.R.iget(15331)!=0|true))||(__CLR4_5_2bslbsllx1h5q5i.R.iget(15332)==0&false))) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15333);placement.removePropertyChangeListener(this);
        }
    }}finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public List<BoardPad> getSolderPastePads() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15334);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15335);return Collections.unmodifiableList(solderPastePads);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void addSolderPastePad(BoardPad pad) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15336);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15337);Object oldValue = solderPastePads;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15338);solderPastePads = new ArrayList<>(solderPastePads);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15339);solderPastePads.add(pad);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15340);firePropertyChange("solderPastePads", oldValue, solderPastePads);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15341);if ((((pad != null)&&(__CLR4_5_2bslbsllx1h5q5i.R.iget(15342)!=0|true))||(__CLR4_5_2bslbsllx1h5q5i.R.iget(15343)==0&false))) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15344);pad.addPropertyChangeListener(this);
        }
    }}finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void removeSolderPastePad(BoardPad pad) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15345);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15346);Object oldValue = solderPastePads;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15347);solderPastePads = new ArrayList<>(solderPastePads);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15348);solderPastePads.remove(pad);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15349);firePropertyChange("solderPastePads", oldValue, solderPastePads);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15350);if ((((pad != null)&&(__CLR4_5_2bslbsllx1h5q5i.R.iget(15351)!=0|true))||(__CLR4_5_2bslbsllx1h5q5i.R.iget(15352)==0&false))) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15353);pad.removePropertyChangeListener(this);
        }
    }}finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}


    public Outline getOutline() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15354);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15355);return outline;
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void setOutline(Outline outline) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15356);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15357);Outline oldValue = this.outline;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15358);this.outline = outline;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15359);firePropertyChange("outline", oldValue, outline);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15360);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15361);return name;
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15362);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15363);Object oldValue = this.name;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15364);this.name = name;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15365);firePropertyChange("name", oldValue, name);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public File getFile() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15366);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15367);return file;
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    void setFile(File file) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15368);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15369);Object oldValue = this.file;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15370);this.file = file;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15371);firePropertyChange("file", oldValue, file);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public boolean isDirty() {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15372);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15373);return dirty;
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void setDirty(boolean dirty) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15374);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15375);boolean oldValue = this.dirty;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15376);this.dirty = dirty;
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15377);firePropertyChange("dirty", oldValue, dirty);
    }finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}

    public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_2bslbsllx1h5q5i.R.inc(15378);
        __CLR4_5_2bslbsllx1h5q5i.R.inc(15379);if ((((evt.getSource() != Board.this || !evt.getPropertyName().equals("dirty"))&&(__CLR4_5_2bslbsllx1h5q5i.R.iget(15380)!=0|true))||(__CLR4_5_2bslbsllx1h5q5i.R.iget(15381)==0&false))) {{
            __CLR4_5_2bslbsllx1h5q5i.R.inc(15382);setDirty(true);
        }
    }}finally{__CLR4_5_2bslbsllx1h5q5i.R.flushNeeded();}}
}