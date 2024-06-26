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

public class RulerReticle extends CrosshairReticle {public static class __CLR4_5_2461461lx1h5lqr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,5443,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private LengthUnit units;
    private double unitsPerTick;

    public RulerReticle() {
        super();__CLR4_5_2461461lx1h5lqr.R.inc(5402);try{__CLR4_5_2461461lx1h5lqr.R.inc(5401);
        __CLR4_5_2461461lx1h5lqr.R.inc(5403);this.units = LengthUnit.Millimeters;
        __CLR4_5_2461461lx1h5lqr.R.inc(5404);this.unitsPerTick = 1;
        __CLR4_5_2461461lx1h5lqr.R.inc(5405);setColor(Color.red);
    }finally{__CLR4_5_2461461lx1h5lqr.R.flushNeeded();}}

    public LengthUnit getUnits() {try{__CLR4_5_2461461lx1h5lqr.R.inc(5406);
        __CLR4_5_2461461lx1h5lqr.R.inc(5407);return units;
    }finally{__CLR4_5_2461461lx1h5lqr.R.flushNeeded();}}

    public void setUnits(LengthUnit units) {try{__CLR4_5_2461461lx1h5lqr.R.inc(5408);
        __CLR4_5_2461461lx1h5lqr.R.inc(5409);this.units = units;
    }finally{__CLR4_5_2461461lx1h5lqr.R.flushNeeded();}}

    public double getUnitsPerTick() {try{__CLR4_5_2461461lx1h5lqr.R.inc(5410);
        __CLR4_5_2461461lx1h5lqr.R.inc(5411);return unitsPerTick;
    }finally{__CLR4_5_2461461lx1h5lqr.R.flushNeeded();}}

    public void setUnitsPerTick(double unitsPerTick) {try{__CLR4_5_2461461lx1h5lqr.R.inc(5412);
        __CLR4_5_2461461lx1h5lqr.R.inc(5413);this.unitsPerTick = unitsPerTick;
    }finally{__CLR4_5_2461461lx1h5lqr.R.flushNeeded();}}

    @Override
    public void draw(Graphics2D g2d, LengthUnit cameraUnitsPerPixelUnits,
            double cameraUnitsPerPixelX, double cameraUnitsPerPixelY, double viewPortCenterX,
            double viewPortCenterY, int viewPortWidth, int viewPortHeight, double rotation) {try{__CLR4_5_2461461lx1h5lqr.R.inc(5414);

        __CLR4_5_2461461lx1h5lqr.R.inc(5415);super.draw(g2d, cameraUnitsPerPixelUnits, cameraUnitsPerPixelX, cameraUnitsPerPixelY,
                viewPortCenterX, viewPortCenterY, viewPortWidth, viewPortHeight, rotation);

        __CLR4_5_2461461lx1h5lqr.R.inc(5416);g2d.setStroke(new BasicStroke(1f));
        __CLR4_5_2461461lx1h5lqr.R.inc(5417);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Calculate half the diagonal size of the viewport.
        __CLR4_5_2461461lx1h5lqr.R.inc(5418);int halfDiagonal =
                (int) (Math.sqrt(Math.pow(viewPortWidth, 2) + Math.pow(viewPortHeight, 2)) / 2.0);

        __CLR4_5_2461461lx1h5lqr.R.inc(5419);AffineTransform origTx = g2d.getTransform();

        __CLR4_5_2461461lx1h5lqr.R.inc(5420);g2d.translate(viewPortCenterX, viewPortCenterY);
        // AffineTransform rotates positive clockwise, so we invert the value.
        __CLR4_5_2461461lx1h5lqr.R.inc(5421);g2d.rotate(Math.toRadians(-rotation));

        __CLR4_5_2461461lx1h5lqr.R.inc(5422);double uppX = new Length(cameraUnitsPerPixelX, cameraUnitsPerPixelUnits)
                .convertToUnits(this.units).getValue();
        __CLR4_5_2461461lx1h5lqr.R.inc(5423);double uppY = new Length(cameraUnitsPerPixelY, cameraUnitsPerPixelUnits)
                .convertToUnits(this.units).getValue();
        __CLR4_5_2461461lx1h5lqr.R.inc(5424);double pixelsPerTickX = unitsPerTick / uppX;
        __CLR4_5_2461461lx1h5lqr.R.inc(5425);double pixelsPerTickY = unitsPerTick / uppY;
        __CLR4_5_2461461lx1h5lqr.R.inc(5426);int tickLength = 10;

        __CLR4_5_2461461lx1h5lqr.R.inc(5427);g2d.setColor(color);
        __CLR4_5_2461461lx1h5lqr.R.inc(5428);for (int i = 1; (((i < (halfDiagonal / pixelsPerTickX))&&(__CLR4_5_2461461lx1h5lqr.R.iget(5429)!=0|true))||(__CLR4_5_2461461lx1h5lqr.R.iget(5430)==0&false)); i++) {{
            __CLR4_5_2461461lx1h5lqr.R.inc(5431);int x = (int) (i * pixelsPerTickX);
            __CLR4_5_2461461lx1h5lqr.R.inc(5432);g2d.drawLine(x, -tickLength, x, tickLength);
            __CLR4_5_2461461lx1h5lqr.R.inc(5433);g2d.drawLine(-x, -tickLength, -x, tickLength);
        }

        }__CLR4_5_2461461lx1h5lqr.R.inc(5434);for (int i = 1; (((i < (halfDiagonal / pixelsPerTickY))&&(__CLR4_5_2461461lx1h5lqr.R.iget(5435)!=0|true))||(__CLR4_5_2461461lx1h5lqr.R.iget(5436)==0&false)); i++) {{
            __CLR4_5_2461461lx1h5lqr.R.inc(5437);int y = (int) (i * pixelsPerTickY);
            __CLR4_5_2461461lx1h5lqr.R.inc(5438);g2d.setColor(color);
            __CLR4_5_2461461lx1h5lqr.R.inc(5439);g2d.drawLine(-tickLength, y, tickLength, y);
            __CLR4_5_2461461lx1h5lqr.R.inc(5440);g2d.setColor(complimentaryColor);
            __CLR4_5_2461461lx1h5lqr.R.inc(5441);g2d.drawLine(-tickLength, -y, tickLength, -y);
        }
        }__CLR4_5_2461461lx1h5lqr.R.inc(5442);g2d.setTransform(origTx);
    }finally{__CLR4_5_2461461lx1h5lqr.R.flushNeeded();}}

}
