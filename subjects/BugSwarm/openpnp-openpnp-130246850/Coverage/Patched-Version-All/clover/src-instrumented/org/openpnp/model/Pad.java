/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.model;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

import org.simpleframework.xml.Attribute;

public abstract class Pad extends AbstractModelObject {public static class __CLR4_5_2cihcihlx1h8naw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,16282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    protected LengthUnit units = LengthUnit.Millimeters;

    public abstract Shape getShape();

    public abstract Pad convertToUnits(LengthUnit units);

    public LengthUnit getUnits() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16217);
        __CLR4_5_2cihcihlx1h8naw.R.inc(16218);return units;
    }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

    public void setUnits(LengthUnit units) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16219);
        __CLR4_5_2cihcihlx1h8naw.R.inc(16220);Object oldValue = units;
        __CLR4_5_2cihcihlx1h8naw.R.inc(16221);this.units = units;
        __CLR4_5_2cihcihlx1h8naw.R.inc(16222);firePropertyChange("units", oldValue, units);
    }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

    // TODO: Line doesn't really work as a shape, so I am removing it
    // until we really have a need for it at which point it can be revisited.
    // public static class Line extends Pad {
    // @Attribute
    // private double x1;
    //
    // @Attribute
    // private double y1;
    //
    // @Attribute
    // private double x2;
    //
    // @Attribute
    // private double y2;
    //
    // public double getX1() {
    // return x1;
    // }
    //
    // public void setX1(double x1) {
    // double oldValue = this.x1;
    // this.x1 = x1;
    // firePropertyChange("x1", oldValue, x1);
    // }
    //
    // public double getY1() {
    // return y1;
    // }
    //
    // public void setY1(double y1) {
    // double oldValue = this.y1;
    // this.y1 = y1;
    // firePropertyChange("y1", oldValue, y1);
    // }
    //
    // public double getX2() {
    // return x2;
    // }
    //
    // public void setX2(double x2) {
    // double oldValue = this.x2;
    // this.x2 = x2;
    // firePropertyChange("x2", oldValue, x2);
    // }
    //
    // public double getY2() {
    // return y2;
    // }
    //
    // public void setY2(double y2) {
    // double oldValue = this.y2;
    // this.y2 = y2;
    // firePropertyChange("y2", oldValue, y2);
    // }
    //
    // public Shape getShape() {
    // return new Line2D.Double(
    // x1,
    // y1,
    // x2,
    // y2);
    // }
    // }

    public static class Ellipse extends Pad {
        @Attribute
        private double width;

        @Attribute
        private double height;

        public double getWidth() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16223);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16224);return width;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public void setWidth(double width) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16225);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16226);double oldValue = this.width;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16227);this.width = width;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16228);firePropertyChange("width", oldValue, width);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public double getHeight() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16229);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16230);return height;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public void setHeight(double height) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16231);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16232);double oldValue = this.height;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16233);this.height = height;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16234);firePropertyChange("height", oldValue, height);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public Shape getShape() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16235);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16236);return new Ellipse2D.Double(-width / 2, -height / 2, width, height);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        @Override
        public Ellipse convertToUnits(LengthUnit units) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16237);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16238);Ellipse that = new Ellipse();
            __CLR4_5_2cihcihlx1h8naw.R.inc(16239);that.setUnits(units);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16240);that.setHeight(Length.convertToUnits(height, this.units, units));
            __CLR4_5_2cihcihlx1h8naw.R.inc(16241);that.setWidth(Length.convertToUnits(width, this.units, units));
            __CLR4_5_2cihcihlx1h8naw.R.inc(16242);return that;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}
    }


    public static class Circle extends Pad {
        @Attribute
        private double radius;

        public double getRadius() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16243);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16244);return radius;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public void setRadius(double radius) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16245);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16246);double oldValue = this.radius;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16247);this.radius = radius;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16248);firePropertyChange("radius", oldValue, radius);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public Shape getShape() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16249);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16250);return new Ellipse2D.Double(-radius, -radius, radius * 2, radius * 2);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        @Override
        public Circle convertToUnits(LengthUnit units) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16251);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16252);Circle that = new Circle();
            __CLR4_5_2cihcihlx1h8naw.R.inc(16253);that.setUnits(units);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16254);that.setRadius(Length.convertToUnits(radius, this.units, units));
            __CLR4_5_2cihcihlx1h8naw.R.inc(16255);return that;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}
    }

    public static class RoundRectangle extends Pad {
        @Attribute
        private double width;

        @Attribute
        private double height;

        @Attribute(required = false)
        private double roundness;

        public double getWidth() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16256);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16257);return width;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public void setWidth(double width) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16258);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16259);double oldValue = this.width;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16260);this.width = width;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16261);firePropertyChange("width", oldValue, width);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public double getHeight() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16262);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16263);return height;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public void setHeight(double height) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16264);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16265);double oldValue = this.height;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16266);this.height = height;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16267);firePropertyChange("height", oldValue, height);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public double getRoundness() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16268);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16269);return roundness;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public void setRoundness(double roundness) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16270);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16271);double oldValue = this.roundness;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16272);this.roundness = roundness;
            __CLR4_5_2cihcihlx1h8naw.R.inc(16273);firePropertyChange("roundness", oldValue, roundness);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        public Shape getShape() {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16274);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16275);return new RoundRectangle2D.Double(-width / 2, -height / 2, width, height,
                    width / 1.0 * roundness, height / 1.0 * roundness);
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}

        @Override
        public RoundRectangle convertToUnits(LengthUnit units) {try{__CLR4_5_2cihcihlx1h8naw.R.inc(16276);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16277);RoundRectangle that = new RoundRectangle();
            __CLR4_5_2cihcihlx1h8naw.R.inc(16278);that.setUnits(units);
            __CLR4_5_2cihcihlx1h8naw.R.inc(16279);that.setHeight(Length.convertToUnits(height, this.units, units));
            __CLR4_5_2cihcihlx1h8naw.R.inc(16280);that.setWidth(Length.convertToUnits(width, this.units, units));
            // don't convert roundness because it's a percentage
            __CLR4_5_2cihcihlx1h8naw.R.inc(16281);return that;
        }finally{__CLR4_5_2cihcihlx1h8naw.R.flushNeeded();}}
    }
}
