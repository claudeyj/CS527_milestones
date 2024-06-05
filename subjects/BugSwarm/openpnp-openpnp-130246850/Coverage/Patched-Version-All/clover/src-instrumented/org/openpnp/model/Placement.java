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
import org.simpleframework.xml.Version;
import org.simpleframework.xml.core.Commit;
import org.simpleframework.xml.core.Persist;


/**
 * A Placement describes a location on a Board where a Part will be placed, along with information
 * about how to place it.
 * 
 * @author jason
 */
public class Placement extends AbstractModelObject implements Identifiable {public static class __CLR4_5_2clmclmlx1h8nbo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,16382,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public enum Type {
        Place, Fiducial, Ignore
    }

    /**
     * History: 1.0: Initial revision. 1.1: Replaced Boolean place with Type type. Deprecated place.
     */
    @Version(revision = 1.1)
    private double version;

    @Attribute
    private String id;
    @Element
    private Location location;
    @Attribute
    private Side side = Side.Top;

    @Attribute(required = false)
    private String partId;

    @Deprecated
    @Attribute(required = false)
    private Boolean place;

    @Attribute
    private Type type;

    private Part part;

    @SuppressWarnings("unused")
    private Placement() {
        this(null);__CLR4_5_2clmclmlx1h8nbo.R.inc(16331);try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16330);
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public Placement(String id) {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16332);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16333);this.id = id;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16334);this.type = Type.Place;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16335);setLocation(new Location(LengthUnit.Millimeters));
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Persist
    private void persist() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16336);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16337);partId = ((((part == null )&&(__CLR4_5_2clmclmlx1h8nbo.R.iget(16338)!=0|true))||(__CLR4_5_2clmclmlx1h8nbo.R.iget(16339)==0&false))? null : part.getId());
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16340);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16341);setLocation(location);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16342);if ((((getPart() == null)&&(__CLR4_5_2clmclmlx1h8nbo.R.iget(16343)!=0|true))||(__CLR4_5_2clmclmlx1h8nbo.R.iget(16344)==0&false))) {{
            __CLR4_5_2clmclmlx1h8nbo.R.inc(16345);setPart(Configuration.get().getPart(partId));
        }

        }__CLR4_5_2clmclmlx1h8nbo.R.inc(16346);if ((((version == 1.0)&&(__CLR4_5_2clmclmlx1h8nbo.R.iget(16347)!=0|true))||(__CLR4_5_2clmclmlx1h8nbo.R.iget(16348)==0&false))) {{
            __CLR4_5_2clmclmlx1h8nbo.R.inc(16349);if ((((place != null && !place)&&(__CLR4_5_2clmclmlx1h8nbo.R.iget(16350)!=0|true))||(__CLR4_5_2clmclmlx1h8nbo.R.iget(16351)==0&false))) {{
                __CLR4_5_2clmclmlx1h8nbo.R.inc(16352);type = Type.Ignore;
            }
            }__CLR4_5_2clmclmlx1h8nbo.R.inc(16353);place = null;
        }
    }}finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public Part getPart() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16354);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16355);return part;
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public void setPart(Part part) {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16356);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16357);Part oldValue = this.part;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16358);this.part = part;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16359);firePropertyChange("part", oldValue, part);
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public String getId() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16360);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16361);return id;
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public Location getLocation() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16362);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16363);return location;
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public void setLocation(Location location) {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16364);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16365);Location oldValue = this.location;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16366);this.location = location;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16367);firePropertyChange("location", oldValue, location);
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public Side getSide() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16368);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16369);return side;
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public void setSide(Side side) {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16370);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16371);Object oldValue = this.side;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16372);this.side = side;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16373);firePropertyChange("side", oldValue, side);
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public Type getType() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16374);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16375);return type;
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    public void setType(Type type) {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16376);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16377);Object oldValue = this.type;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16378);this.type = type;
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16379);firePropertyChange("type", oldValue, type);
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2clmclmlx1h8nbo.R.inc(16380);
        __CLR4_5_2clmclmlx1h8nbo.R.inc(16381);return String.format("id %s, location %s, side %s, part %s, type %s", id, location, side,
                part, type);
    }finally{__CLR4_5_2clmclmlx1h8nbo.R.flushNeeded();}}
}
