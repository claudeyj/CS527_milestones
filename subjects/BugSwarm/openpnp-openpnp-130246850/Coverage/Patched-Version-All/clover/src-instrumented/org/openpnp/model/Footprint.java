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

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

/**
 * A Footprint is a group of SMD pads along with length unit information. Footprints can be rendered
 * to a Shape for easy display using 2D primitives.
 */
public class Footprint {public static class __CLR4_5_2c52c52lx1h8mxl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,15795,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private LengthUnit units = LengthUnit.Millimeters;

    @ElementList(inline = true, required = false)
    private ArrayList<Pad> pads = new ArrayList<>();

    @Attribute(required = false)
    private double bodyWidth;

    @Attribute(required = false)
    private double bodyHeight;

    public Shape getShape() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15734);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15735);Path2D.Double shape = new Path2D.Double();
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15736);for (Pad pad : pads) {{
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15737);shape.append(pad.getShape(), false);
        }

        }__CLR4_5_2c52c52lx1h8mxl.R.inc(15738);Pad body = new Pad();
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15739);body.setWidth(bodyWidth);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15740);body.setHeight(bodyHeight);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15741);shape.append(body.getShape(), false);

        __CLR4_5_2c52c52lx1h8mxl.R.inc(15742);return shape;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public LengthUnit getUnits() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15743);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15744);return units;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public void setUnits(LengthUnit units) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15745);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15746);this.units = units;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public List<Pad> getPads() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15747);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15748);return pads;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public void removePad(Pad pad) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15749);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15750);pads.remove(pad);
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public void addPad(Pad pad) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15751);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15752);pads.add(pad);
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public double getBodyWidth() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15753);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15754);return bodyWidth;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public void setBodyWidth(double bodyWidth) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15755);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15756);this.bodyWidth = bodyWidth;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public double getBodyHeight() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15757);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15758);return bodyHeight;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

    public void setBodyHeight(double bodyHeight) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15759);
        __CLR4_5_2c52c52lx1h8mxl.R.inc(15760);this.bodyHeight = bodyHeight;
    }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}



    public static class Pad {
        @Attribute
        private String name;

        @Attribute
        private double x;

        @Attribute
        private double y;

        @Attribute
        private double width;

        @Attribute
        private double height;

        @Attribute(required = false)
        private double rotation = 0;

        /**
         * Roundness as a percentage of the width and height. 0 is square, 100 is round.
         */
        @Attribute(required = false)
        private double roundness = 0;

        public String getName() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15761);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15762);return name;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15763);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15764);this.name = name;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public double getX() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15765);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15766);return x;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setX(double x) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15767);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15768);this.x = x;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public double getY() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15769);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15770);return y;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setY(double y) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15771);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15772);this.y = y;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public double getWidth() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15773);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15774);return width;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setWidth(double width) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15775);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15776);this.width = width;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public double getHeight() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15777);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15778);return height;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setHeight(double height) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15779);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15780);this.height = height;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public double getRotation() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15781);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15782);return rotation;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setRotation(double rotation) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15783);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15784);this.rotation = rotation;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public double getRoundness() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15785);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15786);return roundness;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public void setRoundness(double roundness) {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15787);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15788);this.roundness = roundness;
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}

        public Shape getShape() {try{__CLR4_5_2c52c52lx1h8mxl.R.inc(15789);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15790);Shape shape = new RoundRectangle2D.Double(-width / 2, -height / 2, width, height,
                    width / 100.0 * roundness, height / 100.0 * roundness);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15791);AffineTransform tx = new AffineTransform();
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15792);tx.translate(x, -y);
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15793);tx.rotate(Math.toRadians(-rotation));
            __CLR4_5_2c52c52lx1h8mxl.R.inc(15794);return tx.createTransformedShape(shape);
        }finally{__CLR4_5_2c52c52lx1h8mxl.R.flushNeeded();}}
    }
}
