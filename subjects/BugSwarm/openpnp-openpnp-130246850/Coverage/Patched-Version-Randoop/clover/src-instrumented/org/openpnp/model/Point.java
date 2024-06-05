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

public class Point {public static class __CLR4_5_2cn2cn2lx1h77l5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,16430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    public double x;
    @Attribute
    public double y;

    public Point() {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16382);

    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    public Point(double x, double y) {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16383);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16384);this.x = x;
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16385);this.y = y;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    public double getX() {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16386);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16387);return x;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    public void setX(double x) {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16388);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16389);this.x = x;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    public double getY() {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16390);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16391);return y;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    public void setY(double y) {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16392);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16393);this.y = y;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    public Point subtract(Point p) {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16394);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16395);return new Point(x - p.x, y - p.y);
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16396);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16397);return String.format(Locale.US, "%f, %f", x, y);
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16398);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16399);final int prime = 31;
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16400);int result = 1;
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16401);long temp;
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16402);temp = Double.doubleToLongBits(x);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16403);result = prime * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16404);temp = Double.doubleToLongBits(y);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16405);result = prime * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16406);return result;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2cn2cn2lx1h77l5.R.inc(16407);
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16408);if ((((this == obj)&&(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16409)!=0|true))||(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16410)==0&false))) {{
            __CLR4_5_2cn2cn2lx1h77l5.R.inc(16411);return true;
        }
        }__CLR4_5_2cn2cn2lx1h77l5.R.inc(16412);if ((((obj == null)&&(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16413)!=0|true))||(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16414)==0&false))) {{
            __CLR4_5_2cn2cn2lx1h77l5.R.inc(16415);return false;
        }
        }__CLR4_5_2cn2cn2lx1h77l5.R.inc(16416);if ((((getClass() != obj.getClass())&&(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16417)!=0|true))||(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16418)==0&false))) {{
            __CLR4_5_2cn2cn2lx1h77l5.R.inc(16419);return false;
        }
        }__CLR4_5_2cn2cn2lx1h77l5.R.inc(16420);Point other = (Point) obj;
        __CLR4_5_2cn2cn2lx1h77l5.R.inc(16421);if ((((Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))&&(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16422)!=0|true))||(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16423)==0&false))) {{
            __CLR4_5_2cn2cn2lx1h77l5.R.inc(16424);return false;
        }
        }__CLR4_5_2cn2cn2lx1h77l5.R.inc(16425);if ((((Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))&&(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16426)!=0|true))||(__CLR4_5_2cn2cn2lx1h77l5.R.iget(16427)==0&false))) {{
            __CLR4_5_2cn2cn2lx1h77l5.R.inc(16428);return false;
        }
        }__CLR4_5_2cn2cn2lx1h77l5.R.inc(16429);return true;
    }finally{__CLR4_5_2cn2cn2lx1h77l5.R.flushNeeded();}}
}
