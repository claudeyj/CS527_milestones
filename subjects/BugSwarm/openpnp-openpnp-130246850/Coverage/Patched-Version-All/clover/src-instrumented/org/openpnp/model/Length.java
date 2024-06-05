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



public class Length {public static class __CLR4_5_2c7rc7rlx1h8n30{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,16036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public enum Field {
        X, Y, Z
    }

    @Attribute
    private double value;
    @Attribute
    private LengthUnit units;

    public Length() {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15831);

    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length(double value, LengthUnit units) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15832);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15833);this.value = value;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15834);this.units = units;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length add(Length length) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15835);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15836);length = length.convertToUnits(units);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15837);return new Length(value + length.getValue(), units);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length subtract(Length length) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15838);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15839);length = length.convertToUnits(units);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15840);return new Length(value - length.getValue(), units);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length multiply(Length length) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15841);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15842);length = length.convertToUnits(units);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15843);return new Length(value * length.getValue(), units);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length add(double d) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15844);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15845);return new Length(value + d, units);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length subtract(double d) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15846);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15847);return new Length(value - d, units);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length multiply(double d) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15848);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15849);return new Length(value * d, units);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public double getValue() {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15850);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15851);return value;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public void setValue(double value) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15852);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15853);this.value = value;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public LengthUnit getUnits() {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15854);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15855);return units;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public void setUnits(LengthUnit units) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15856);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15857);this.units = units;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public Length convertToUnits(LengthUnit units) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15858);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15859);if ((((this.units == units)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15860)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15861)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15862);return this;
        }
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15863);double mm = 0;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15864);if ((((this.units == LengthUnit.Millimeters)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15865)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15866)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15867);mm = value;
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15868);if ((((this.units == LengthUnit.Centimeters)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15869)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15870)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15871);mm = value * 10;
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15872);if ((((this.units == LengthUnit.Meters)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15873)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15874)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15875);mm = value * 1000;
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15876);if ((((this.units == LengthUnit.Inches)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15877)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15878)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15879);mm = value * 25.4;
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15880);if ((((this.units == LengthUnit.Feet)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15881)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15882)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15883);mm = value * 25.4 * 12;
        }
        }else {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15884);throw new Error("convertLength() unrecognized units " + this.units);
        }

        }}}}}__CLR4_5_2c7rc7rlx1h8n30.R.inc(15885);if ((((units == LengthUnit.Millimeters)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15886)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15887)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15888);return new Length(mm, units);
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15889);if ((((units == LengthUnit.Centimeters)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15890)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15891)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15892);return new Length(mm / 10, units);
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15893);if ((((units == LengthUnit.Meters)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15894)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15895)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15896);return new Length(mm / 1000, units);
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15897);if ((((units == LengthUnit.Inches)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15898)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15899)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15900);return new Length(mm * (1 / 25.4), units);
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15901);if ((((units == LengthUnit.Feet)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15902)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15903)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15904);return new Length(mm * (1 / 25.4) * 12, units);
        }
        }else {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15905);throw new Error("convertLength() unrecognized units " + units);
        }

    }}}}}}finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public static double convertToUnits(double value, LengthUnit fromUnits, LengthUnit toUnits) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15906);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15907);return new Length(value, fromUnits).convertToUnits(toUnits).getValue();
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public static Length parse(String s) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15908);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15909);return parse(s, false);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    /**
     * Takes a value in the format of a double followed by any number of spaces followed by the
     * shortName of a LengthUnit value and returns the value as a Length object. Returns null if the
     * value could not be parsed.
     */
    public static Length parse(String s, boolean requireUnits) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15910);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15911);if ((((s == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15912)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15913)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15914);return null;
        }

        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15915);s = s.trim();

        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15916);Length length = new Length(0, null);
        // find the index of the first character that is not a -, . or digit.
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15917);int startOfUnits = -1;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15918);for (int i = 0; (((i < s.length())&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15919)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15920)==0&false)); i++) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15921);char ch = s.charAt(i);
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15922);if ((((ch != '-' && ch != '.' && !Character.isDigit(ch))&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15923)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15924)==0&false))) {{
                __CLR4_5_2c7rc7rlx1h8n30.R.inc(15925);startOfUnits = i;
                __CLR4_5_2c7rc7rlx1h8n30.R.inc(15926);break;
            }
        }}

        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15927);String valueString = null;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15928);if ((((startOfUnits != -1)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15929)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15930)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15931);valueString = s.substring(0, startOfUnits);
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15932);String unitsString = s.substring(startOfUnits);
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15933);unitsString = unitsString.trim();
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15934);for (LengthUnit lengthUnit : LengthUnit.values()) {{
                __CLR4_5_2c7rc7rlx1h8n30.R.inc(15935);if ((((lengthUnit.getShortName().equalsIgnoreCase(unitsString))&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15936)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15937)==0&false))) {{
                    __CLR4_5_2c7rc7rlx1h8n30.R.inc(15938);length.setUnits(lengthUnit);
                    __CLR4_5_2c7rc7rlx1h8n30.R.inc(15939);break;
                }
            }}
        }}
        }else {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15940);valueString = s;
        }

        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15941);if ((((requireUnits && length.getUnits() == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15942)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15943)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15944);return null;
        }

        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15945);try {
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15946);double value = Double.parseDouble(valueString);
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15947);length.setValue(value);
        }
        catch (Exception e) {
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15948);return null;
        }

        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15949);return length;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15950);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15951);return String.format(Locale.US, "%2.3f%s", value, units.getShortName());
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    /**
     * Performs the same function as toString() but allows the caller to specify the format String
     * that is used. The format String should contain %f and %s in that order for value and
     * units.getShortName().
     * 
     * @param fmt
     * @return
     */
    public String toString(String fmt) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15952);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15953);if ((((fmt == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15954)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15955)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15956);return toString();
        }
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15957);return String.format(Locale.US, fmt, value, units.getShortName());
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15958);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15959);final int prime = 31;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15960);int result = 1;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15961);result = prime * result + (((((units == null) )&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15962)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15963)==0&false))? 0 : units.hashCode());
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15964);long temp;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15965);temp = Double.doubleToLongBits(value);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15966);result = prime * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15967);return result;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15968);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15969);if ((((this == obj)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15970)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15971)==0&false)))
            {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15972);return true;
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15973);if ((((obj == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15974)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15975)==0&false)))
            {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15976);return false;
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15977);if ((((getClass() != obj.getClass())&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15978)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15979)==0&false)))
            {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15980);return false;
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15981);Length other = (Length) obj;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15982);if ((((units != other.units)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15983)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15984)==0&false)))
            {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15985);return false;
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15986);if ((((Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15987)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15988)==0&false)))
            {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15989);return false;
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(15990);return true;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    public static Location setLocationField(Configuration configuration, Location location,
            Length length, Field field, boolean defaultToOldUnits) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(15991);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15992);Length oldLength = null;
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(15993);if ((((field == Field.X)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15994)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15995)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(15996);oldLength = location.getLengthX();
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(15997);if ((((field == Field.Y)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15998)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(15999)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16000);oldLength = location.getLengthY();
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(16001);if ((((field == Field.Z)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16002)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16003)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16004);oldLength = location.getLengthZ();
        }
        }}}__CLR4_5_2c7rc7rlx1h8n30.R.inc(16005);if ((((length.getUnits() == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16006)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16007)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16008);if ((((defaultToOldUnits)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16009)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16010)==0&false))) {{
                __CLR4_5_2c7rc7rlx1h8n30.R.inc(16011);length.setUnits(oldLength.getUnits());
            }
            }__CLR4_5_2c7rc7rlx1h8n30.R.inc(16012);if ((((length.getUnits() == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16013)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16014)==0&false))) {{
                __CLR4_5_2c7rc7rlx1h8n30.R.inc(16015);length.setUnits(configuration.getSystemUnits());
            }
        }}
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(16016);if ((((location.getUnits() == null)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16017)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16018)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16019);throw new Error("This can't happen!");
        }
        }else {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16020);location = location.convertToUnits(length.getUnits());
        }
        }__CLR4_5_2c7rc7rlx1h8n30.R.inc(16021);if ((((field == Field.X)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16022)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16023)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16024);location = location.derive(length.getValue(), null, null, null);
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(16025);if ((((field == Field.Y)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16026)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16027)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16028);location = location.derive(null, length.getValue(), null, null);
        }
        }else {__CLR4_5_2c7rc7rlx1h8n30.R.inc(16029);if ((((field == Field.Z)&&(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16030)!=0|true))||(__CLR4_5_2c7rc7rlx1h8n30.R.iget(16031)==0&false))) {{
            __CLR4_5_2c7rc7rlx1h8n30.R.inc(16032);location = location.derive(null, null, length.getValue(), null);
        }
        }}}__CLR4_5_2c7rc7rlx1h8n30.R.inc(16033);return location;
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

    /**
     * Sets the specified field on the passed Location object. Enforces application specific unit
     * conversion. If the new Length value does not have units set, this method will set the units
     * of the Length to the system default units. If the Location itself does not have units set,
     * the Location's units are set to the Length's units. Finally, if the Location's units have
     * changed, the entire Location is converted to the new units and the new object is returned.
     * 
     * @param configuration
     * @param location
     * @param length
     * @param field
     * @return
     */
    public static Location setLocationField(Configuration configuration, Location location,
            Length length, Field field) {try{__CLR4_5_2c7rc7rlx1h8n30.R.inc(16034);
        __CLR4_5_2c7rc7rlx1h8n30.R.inc(16035);return setLocationField(configuration, location, length, field, false);
    }finally{__CLR4_5_2c7rc7rlx1h8n30.R.flushNeeded();}}

}
