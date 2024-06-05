/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.model;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

public class Outline {public static class __CLR4_5_2ch9ch9lx1h0e09{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,16192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @ElementListUnion({
            @ElementList(entry = "ellipse", inline = true, required = false,
                    type = Outline.Ellipse.class),
            @ElementList(entry = "line", inline = true, required = false,
                    type = Outline.Line.class),
            @ElementList(entry = "circle", inline = true, required = false,
                    type = Outline.Circle.class)})
    private ArrayList<Outline.OutlineElement> elements = new ArrayList<>();

    @Attribute
    private LengthUnit units = LengthUnit.Millimeters;

    public Shape getShape() {try{__CLR4_5_2ch9ch9lx1h0e09.R.inc(16173);
        __CLR4_5_2ch9ch9lx1h0e09.R.inc(16174);if ((((elements.isEmpty())&&(__CLR4_5_2ch9ch9lx1h0e09.R.iget(16175)!=0|true))||(__CLR4_5_2ch9ch9lx1h0e09.R.iget(16176)==0&false))) {{
            __CLR4_5_2ch9ch9lx1h0e09.R.inc(16177);return null;
        }
        }__CLR4_5_2ch9ch9lx1h0e09.R.inc(16178);Path2D.Double shape = new Path2D.Double();
        __CLR4_5_2ch9ch9lx1h0e09.R.inc(16179);for (Outline.OutlineElement element : elements) {{
            __CLR4_5_2ch9ch9lx1h0e09.R.inc(16180);shape.append(element.getShape(), false);
        }

        }__CLR4_5_2ch9ch9lx1h0e09.R.inc(16181);return shape;
    }finally{__CLR4_5_2ch9ch9lx1h0e09.R.flushNeeded();}}

    public LengthUnit getUnits() {try{__CLR4_5_2ch9ch9lx1h0e09.R.inc(16182);
        __CLR4_5_2ch9ch9lx1h0e09.R.inc(16183);return units;
    }finally{__CLR4_5_2ch9ch9lx1h0e09.R.flushNeeded();}}

    public void setUnits(LengthUnit units) {try{__CLR4_5_2ch9ch9lx1h0e09.R.inc(16184);
        __CLR4_5_2ch9ch9lx1h0e09.R.inc(16185);this.units = units;
    }finally{__CLR4_5_2ch9ch9lx1h0e09.R.flushNeeded();}}

    public static interface OutlineElement {
        Shape getShape();
    }

    public static class Line implements Outline.OutlineElement {
        @Attribute
        private double x1;

        @Attribute
        private double y1;

        @Attribute
        private double x2;

        @Attribute
        private double y2;

        public Shape getShape() {try{__CLR4_5_2ch9ch9lx1h0e09.R.inc(16186);
            __CLR4_5_2ch9ch9lx1h0e09.R.inc(16187);return new Line2D.Double(x1, -y1, x2, -y2);
        }finally{__CLR4_5_2ch9ch9lx1h0e09.R.flushNeeded();}}
    }

    public static class Ellipse implements Outline.OutlineElement {
        @Attribute
        private double x;

        @Attribute
        private double y;

        @Attribute
        private double width;

        @Attribute
        private double height;

        public Shape getShape() {try{__CLR4_5_2ch9ch9lx1h0e09.R.inc(16188);
            __CLR4_5_2ch9ch9lx1h0e09.R.inc(16189);return new Ellipse2D.Double(x - (width / 2), y - (height / 2), width, height);
        }finally{__CLR4_5_2ch9ch9lx1h0e09.R.flushNeeded();}}
    }

    public static class Circle implements Outline.OutlineElement {
        @Attribute
        private double x;

        @Attribute
        private double y;

        @Attribute
        private double radius;

        public Shape getShape() {try{__CLR4_5_2ch9ch9lx1h0e09.R.inc(16190);
            __CLR4_5_2ch9ch9lx1h0e09.R.inc(16191);return new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2);
        }finally{__CLR4_5_2ch9ch9lx1h0e09.R.flushNeeded();}}
    }
}
