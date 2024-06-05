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

package org.openpnp.gui.components.reticle;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;

import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;

public class FiducialReticle extends CrosshairReticle {public static class __CLR4_5_2424424lx1h5lox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,5314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public enum Shape {
        Circle, Square
    }

    private Shape shape;
    private boolean filled;
    private LengthUnit units;
    private double size;

    public FiducialReticle() {
        super();__CLR4_5_2424424lx1h5lox.R.inc(5261);try{__CLR4_5_2424424lx1h5lox.R.inc(5260);
        __CLR4_5_2424424lx1h5lox.R.inc(5262);this.shape = Shape.Circle;
        __CLR4_5_2424424lx1h5lox.R.inc(5263);this.filled = false;
        __CLR4_5_2424424lx1h5lox.R.inc(5264);this.units = LengthUnit.Millimeters;
        __CLR4_5_2424424lx1h5lox.R.inc(5265);this.size = 1;
        __CLR4_5_2424424lx1h5lox.R.inc(5266);setColor(Color.red);
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public Shape getShape() {try{__CLR4_5_2424424lx1h5lox.R.inc(5267);
        __CLR4_5_2424424lx1h5lox.R.inc(5268);return shape;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public void setShape(Shape shape) {try{__CLR4_5_2424424lx1h5lox.R.inc(5269);
        __CLR4_5_2424424lx1h5lox.R.inc(5270);this.shape = shape;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public boolean isFilled() {try{__CLR4_5_2424424lx1h5lox.R.inc(5271);
        __CLR4_5_2424424lx1h5lox.R.inc(5272);return filled;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public void setFilled(boolean filled) {try{__CLR4_5_2424424lx1h5lox.R.inc(5273);
        __CLR4_5_2424424lx1h5lox.R.inc(5274);this.filled = filled;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public LengthUnit getUnits() {try{__CLR4_5_2424424lx1h5lox.R.inc(5275);
        __CLR4_5_2424424lx1h5lox.R.inc(5276);return units;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public void setUnits(LengthUnit units) {try{__CLR4_5_2424424lx1h5lox.R.inc(5277);
        __CLR4_5_2424424lx1h5lox.R.inc(5278);this.units = units;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public double getSize() {try{__CLR4_5_2424424lx1h5lox.R.inc(5279);
        __CLR4_5_2424424lx1h5lox.R.inc(5280);return size;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    public void setSize(double size) {try{__CLR4_5_2424424lx1h5lox.R.inc(5281);
        __CLR4_5_2424424lx1h5lox.R.inc(5282);this.size = size;
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

    @Override
    public void draw(Graphics2D g2d, LengthUnit cameraUnitsPerPixelUnits,
            double cameraUnitsPerPixelX, double cameraUnitsPerPixelY, double viewPortCenterX,
            double viewPortCenterY, int viewPortWidth, int viewPortHeight, double rotation) {try{__CLR4_5_2424424lx1h5lox.R.inc(5283);

        __CLR4_5_2424424lx1h5lox.R.inc(5284);super.draw(g2d, cameraUnitsPerPixelUnits, cameraUnitsPerPixelX, cameraUnitsPerPixelY,
                viewPortCenterX, viewPortCenterY, viewPortWidth, viewPortHeight, rotation);

        __CLR4_5_2424424lx1h5lox.R.inc(5285);g2d.setColor(color);
        __CLR4_5_2424424lx1h5lox.R.inc(5286);g2d.setStroke(new BasicStroke(1f));
        __CLR4_5_2424424lx1h5lox.R.inc(5287);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        __CLR4_5_2424424lx1h5lox.R.inc(5288);AffineTransform origTx = g2d.getTransform();

        __CLR4_5_2424424lx1h5lox.R.inc(5289);g2d.translate(viewPortCenterX, viewPortCenterY);
        // AffineTransform rotates positive clockwise, so we invert the value.
        __CLR4_5_2424424lx1h5lox.R.inc(5290);g2d.rotate(Math.toRadians(-rotation));

        __CLR4_5_2424424lx1h5lox.R.inc(5291);double pixelsPerUnitX = 1.0 / new Length(cameraUnitsPerPixelX, cameraUnitsPerPixelUnits)
                .convertToUnits(this.units).getValue();
        __CLR4_5_2424424lx1h5lox.R.inc(5292);double pixelsPerUnitY = 1.0 / new Length(cameraUnitsPerPixelY, cameraUnitsPerPixelUnits)
                .convertToUnits(this.units).getValue();

        __CLR4_5_2424424lx1h5lox.R.inc(5293);int width = (int) (size * pixelsPerUnitX);
        __CLR4_5_2424424lx1h5lox.R.inc(5294);int height = (int) (size * pixelsPerUnitY);
        __CLR4_5_2424424lx1h5lox.R.inc(5295);int x = (int) -(width / 2);
        __CLR4_5_2424424lx1h5lox.R.inc(5296);int y = (int) -(height / 2);

        __CLR4_5_2424424lx1h5lox.R.inc(5297);if ((((shape == Shape.Circle)&&(__CLR4_5_2424424lx1h5lox.R.iget(5298)!=0|true))||(__CLR4_5_2424424lx1h5lox.R.iget(5299)==0&false))) {{
            __CLR4_5_2424424lx1h5lox.R.inc(5300);if ((((filled)&&(__CLR4_5_2424424lx1h5lox.R.iget(5301)!=0|true))||(__CLR4_5_2424424lx1h5lox.R.iget(5302)==0&false))) {{
                __CLR4_5_2424424lx1h5lox.R.inc(5303);g2d.fillArc(x, y, width, height, 0, 360);
            }
            }else {{
                __CLR4_5_2424424lx1h5lox.R.inc(5304);g2d.drawArc(x, y, width, height, 0, 360);
            }
        }}
        }else {__CLR4_5_2424424lx1h5lox.R.inc(5305);if ((((shape == Shape.Square)&&(__CLR4_5_2424424lx1h5lox.R.iget(5306)!=0|true))||(__CLR4_5_2424424lx1h5lox.R.iget(5307)==0&false))) {{
            __CLR4_5_2424424lx1h5lox.R.inc(5308);if ((((filled)&&(__CLR4_5_2424424lx1h5lox.R.iget(5309)!=0|true))||(__CLR4_5_2424424lx1h5lox.R.iget(5310)==0&false))) {{
                __CLR4_5_2424424lx1h5lox.R.inc(5311);g2d.fillRect(x, y, width, height);
            }
            }else {{
                __CLR4_5_2424424lx1h5lox.R.inc(5312);g2d.drawRect(x, y, width, height);
            }
        }}

        }}__CLR4_5_2424424lx1h5lox.R.inc(5313);g2d.setTransform(origTx);
    }finally{__CLR4_5_2424424lx1h5lox.R.flushNeeded();}}

}
