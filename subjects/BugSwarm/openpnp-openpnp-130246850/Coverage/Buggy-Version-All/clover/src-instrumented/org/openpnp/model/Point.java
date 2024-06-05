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

public class Point {public static class __CLR4_5_2cn1cn1lx1h3adh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,16429,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    public double x;
    @Attribute
    public double y;

    public Point() {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16381);

    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    public Point(double x, double y) {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16382);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16383);this.x = x;
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16384);this.y = y;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    public double getX() {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16385);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16386);return x;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    public void setX(double x) {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16387);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16388);this.x = x;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    public double getY() {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16389);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16390);return y;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    public void setY(double y) {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16391);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16392);this.y = y;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    public Point subtract(Point p) {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16393);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16394);return new Point(x - p.x, y - p.y);
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16395);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16396);return String.format(Locale.US, "%f, %f", x, y);
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16397);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16398);final int prime = 31;
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16399);int result = 1;
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16400);long temp;
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16401);temp = Double.doubleToLongBits(x);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16402);result = prime * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16403);temp = Double.doubleToLongBits(y);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16404);result = prime * result + (int) (temp ^ (temp >>> 32));
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16405);return result;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2cn1cn1lx1h3adh.R.inc(16406);
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16407);if ((((this == obj)&&(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16408)!=0|true))||(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16409)==0&false))) {{
            __CLR4_5_2cn1cn1lx1h3adh.R.inc(16410);return true;
        }
        }__CLR4_5_2cn1cn1lx1h3adh.R.inc(16411);if ((((obj == null)&&(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16412)!=0|true))||(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16413)==0&false))) {{
            __CLR4_5_2cn1cn1lx1h3adh.R.inc(16414);return false;
        }
        }__CLR4_5_2cn1cn1lx1h3adh.R.inc(16415);if ((((getClass() != obj.getClass())&&(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16416)!=0|true))||(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16417)==0&false))) {{
            __CLR4_5_2cn1cn1lx1h3adh.R.inc(16418);return false;
        }
        }__CLR4_5_2cn1cn1lx1h3adh.R.inc(16419);Point other = (Point) obj;
        __CLR4_5_2cn1cn1lx1h3adh.R.inc(16420);if ((((Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))&&(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16421)!=0|true))||(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16422)==0&false))) {{
            __CLR4_5_2cn1cn1lx1h3adh.R.inc(16423);return false;
        }
        }__CLR4_5_2cn1cn1lx1h3adh.R.inc(16424);if ((((Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))&&(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16425)!=0|true))||(__CLR4_5_2cn1cn1lx1h3adh.R.iget(16426)==0&false))) {{
            __CLR4_5_2cn1cn1lx1h3adh.R.inc(16427);return false;
        }
        }__CLR4_5_2cn1cn1lx1h3adh.R.inc(16428);return true;
    }finally{__CLR4_5_2cn1cn1lx1h3adh.R.flushNeeded();}}
}
