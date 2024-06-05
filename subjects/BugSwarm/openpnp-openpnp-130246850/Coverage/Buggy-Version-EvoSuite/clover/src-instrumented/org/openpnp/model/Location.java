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

import java.util.Locale;

import org.simpleframework.xml.Attribute;

/**
 * A Location is a an immutable 3D point in X, Y, Z space with a rotation component. The rotation is
 * applied about the Z axis.
 */
public class Location {public static class __CLR4_5_2cdmcdmlx1h0dz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,16166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * The fields on this class would be final in a perfect world, but that doesn't work correctly
     * with the XML serialization.
     */

    @Attribute
    private LengthUnit units;
    @Attribute(required = false)
    private double x;
    @Attribute(required = false)
    private double y;
    @Attribute(required = false)
    private double z;
    @Attribute(required = false)
    private double rotation;

    /**
     * Only used by XML serialization.
     */
    @SuppressWarnings("unused")
    private Location() {
        this(null);__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16043);try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16042);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Location(LengthUnit units) {
        this(units, 0, 0, 0, 0);__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16045);try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16044);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Location(LengthUnit units, double x, double y, double z, double rotation) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16046);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16047);this.units = units;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16048);this.x = x;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16049);this.y = y;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16050);this.z = z;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16051);this.rotation = rotation;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public double getX() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16052);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16053);return x;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public double getY() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16054);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16055);return y;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public double getZ() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16056);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16057);return z;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public double getRotation() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16058);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16059);return rotation;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public LengthUnit getUnits() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16060);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16061);return units;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Location convertToUnits(LengthUnit units) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16062);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16063);Location location =
                new Location(units, new Length(x, this.units).convertToUnits(units).getValue(),
                        new Length(y, this.units).convertToUnits(units).getValue(),
                        new Length(z, this.units).convertToUnits(units).getValue(), rotation);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16064);return location;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Length getLinearLengthTo(Location location) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16065);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16066);double distance = getLinearDistanceTo(location);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16067);return new Length(distance, getUnits());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns the distance between this Location and the specified Location in the units of this
     * Location.
     * 
     * @param location
     * @return
     */
    public double getLinearDistanceTo(Location location) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16068);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16069);location = location.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16070);return getLinearDistanceTo(location.getX(), location.getY());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public double getLinearDistanceTo(double x, double y) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16071);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16072);return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public double getXyzDistanceTo(Location location) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16073);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16074);location = location.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16075);return (Math.sqrt(Math.pow(this.x - location.getX(), 2)
                + Math.pow(this.y - location.getY(), 2) + Math.pow(this.z - location.getZ(), 2)));
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Length getLengthX() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16076);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16077);return new Length(x, units);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Length getLengthY() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16078);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16079);return new Length(y, units);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Length getLengthZ() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16080);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16081);return new Length(z, units);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with the given Location's X, Y, and Z components subtracted from this
     * Location's X, Y, and Z components. Rotation is left unchanged.
     * 
     * @param l
     * @return
     */
    public Location subtract(Location l) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16082);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16083);l = l.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16084);return new Location(l.getUnits(), x - l.getX(), y - l.getY(), z - l.getZ(), getRotation());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Same as {@link Location#subtract(Location)} but also subtracts rotation.
     * 
     * @param l
     * @return
     */
    public Location subtractWithRotation(Location l) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16085);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16086);l = l.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16087);return new Location(l.getUnits(), x - l.getX(), y - l.getY(), z - l.getZ(),
                rotation - l.getRotation());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with the given Location's X, Y, and Z components added to this
     * Location's X, Y, and Z components. Rotation is left unchanged.
     * 
     * @param l
     * @return
     */
    public Location add(Location l) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16088);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16089);l = l.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16090);return new Location(l.getUnits(), x + l.getX(), y + l.getY(), z + l.getZ(), rotation);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with the given Location's X, Y, and Z components added to this
     * Location's X, Y, and Z components. Rotation is left unchanged.
     * 
     * @param l
     * @return
     */
    public Location addWithRotation(Location l) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16091);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16092);l = l.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16093);return new Location(l.getUnits(), x + l.getX(), y + l.getY(), z + l.getZ(),
                rotation + l.getRotation());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with the given Location's X, Y and Z components multiplied by this
     * Location's X, Y and Z components. Rotation is left unchanged.
     * 
     * @param l
     * @return
     */
    public Location multiply(Location l) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16094);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16095);l = l.convertToUnits(getUnits());
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16096);return new Location(l.getUnits(), x * l.getX(), y * l.getY(), z * l.getZ(), getRotation());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location based on this Location with values multiplied by the specified values.
     * Units are the same as this Location.
     * 
     * @param x
     * @param y
     * @param z
     * @param rotation
     * @return
     */
    public Location multiply(double x, double y, double z, double rotation) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16097);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16098);return new Location(getUnits(), x * getX(), y * getY(), z * getZ(),
                rotation * getRotation());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with the same units as this one and with any of fields specified as
     * true inverted from the values of this one. Specifically, if one of the x, y, z or rotation
     * fields are specified true in the method call, that field will be multipled by -1 in the
     * returned Location.
     * 
     * @param x
     * @param y
     * @param z
     * @param rotation
     * @return
     */
    public Location invert(boolean x, boolean y, boolean z, boolean rotation) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16099);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16100);return new Location(getUnits(), getX() * ((((x )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16101)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16102)==0&false))? -1 : 1), getY() * ((((y )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16103)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16104)==0&false))? -1 : 1),
                getZ() * ((((z )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16105)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16106)==0&false))? -1 : 1), getRotation() * ((((rotation )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16107)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16108)==0&false))? -1 : 1));
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with the same units as this one but with values updated to the passed
     * in values. A caveat is that if a specified value is null, the new Location will contain the
     * value from this object instead of the new value.
     * 
     * This is intended as a utility method, useful for creating new Locations based on existing
     * ones with one or more values changed.
     * 
     * @param x
     * @param y
     * @param z
     * @param rotation
     * @return
     */
    public Location derive(Double x, Double y, Double z, Double rotation) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16109);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16110);return new Location(units, (((x == null )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16111)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16112)==0&false))? this.x : x, (((y == null )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16113)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16114)==0&false))? this.y : y,
                (((z == null )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16115)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16116)==0&false))? this.z : z, (((rotation == null )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16117)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16118)==0&false))? this.rotation : rotation);
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Returns a new Location with this Location's X and Y rotated by angle. Z and Rotation are
     * unchanged.
     * 
     * @param angle
     * @return
     */
    public Location rotateXy(double angle) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16119);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16120);if ((((angle == 0.0)&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16121)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16122)==0&false))) {{
            __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16123);return this;
        }
        }__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16124);while ((((angle < 180.)&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16125)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16126)==0&false))) {{
            __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16127);angle += 360;
        }
        }__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16128);while ((((angle > 180.)&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16129)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16130)==0&false))) {{
            __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16131);angle -= 360;
        }
        }__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16132);angle = Math.toRadians(angle);

        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16133);return new Location(getUnits(), getX() * Math.cos(angle) - getY() * Math.sin(angle),
                getX() * Math.sin(angle) + getY() * Math.cos(angle), getZ(), getRotation());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}
    
    public Location rotateXyCenterPoint(Location center, double angle) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16134);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16135);Location location = this.subtract(center);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16136);location = location.rotateXy(angle);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16137);location = location.add(center);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16138);return location;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16139);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16140);return String.format(Locale.US, "(%f, %f, %f, %f %s)", x, y, z, rotation,
                units.getShortName());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    public Point getXyPoint() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16141);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16142);return new Point(getX(), getY());
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    /**
     * Performs a unit agnostic equality check. If the Object being tested is a Location in a
     * different unit, it is first converted to the units of this Location and then each value field
     * is compared.
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16143);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16144);if ((((!(obj instanceof Location))&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16145)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16146)==0&false))) {{
            __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16147);return false;
        }
        }__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16148);Location that = (Location) obj;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16149);that = that.convertToUnits(this.units);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16150);return this.units == that.units && this.x == that.x && this.y == that.y && this.z == that.z
                && this.rotation == that.rotation;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2cdmcdmlx1h0dz4.R.inc(16151);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16152);int result;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16153);long temp;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16154);result = (((this.units != null )&&(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16155)!=0|true))||(__CLR4_5_2cdmcdmlx1h0dz4.R.iget(16156)==0&false))? this.units.hashCode() : 0;
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16157);temp = Double.doubleToLongBits(this.x);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16158);result = 31 * result + (int) (temp ^ temp >>> 32);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16159);temp = Double.doubleToLongBits(this.y);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16160);result = 31 * result + (int) (temp ^ temp >>> 32);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16161);temp = Double.doubleToLongBits(this.z);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16162);result = 31 * result + (int) (temp ^ temp >>> 32);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16163);temp = Double.doubleToLongBits(this.rotation);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16164);result = 31 * result + (int) (temp ^ temp >>> 32);
        __CLR4_5_2cdmcdmlx1h0dz4.R.inc(16165);return result;
    }finally{__CLR4_5_2cdmcdmlx1h0dz4.R.flushNeeded();}}
}
