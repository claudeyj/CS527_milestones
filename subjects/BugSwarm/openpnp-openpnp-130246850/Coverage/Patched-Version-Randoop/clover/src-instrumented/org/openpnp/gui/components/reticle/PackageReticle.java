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
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import org.openpnp.model.Footprint;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;

public class PackageReticle implements Reticle {public static class __CLR4_5_2452452lx1h72su{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,5401,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Color color;
    private org.openpnp.model.Package pkg;

    public PackageReticle(org.openpnp.model.Package pkg) {try{__CLR4_5_2452452lx1h72su.R.inc(5366);
        __CLR4_5_2452452lx1h72su.R.inc(5367);setPkg(pkg);
        __CLR4_5_2452452lx1h72su.R.inc(5368);setColor(Color.yellow);
    }finally{__CLR4_5_2452452lx1h72su.R.flushNeeded();}}

    public Color getColor() {try{__CLR4_5_2452452lx1h72su.R.inc(5369);
        __CLR4_5_2452452lx1h72su.R.inc(5370);return color;
    }finally{__CLR4_5_2452452lx1h72su.R.flushNeeded();}}

    public void setColor(Color color) {try{__CLR4_5_2452452lx1h72su.R.inc(5371);
        __CLR4_5_2452452lx1h72su.R.inc(5372);this.color = color;
    }finally{__CLR4_5_2452452lx1h72su.R.flushNeeded();}}

    public org.openpnp.model.Package getPkg() {try{__CLR4_5_2452452lx1h72su.R.inc(5373);
        __CLR4_5_2452452lx1h72su.R.inc(5374);return pkg;
    }finally{__CLR4_5_2452452lx1h72su.R.flushNeeded();}}

    public void setPkg(org.openpnp.model.Package pkg) {try{__CLR4_5_2452452lx1h72su.R.inc(5375);
        __CLR4_5_2452452lx1h72su.R.inc(5376);this.pkg = pkg;
    }finally{__CLR4_5_2452452lx1h72su.R.flushNeeded();}}

    @Override
    public void draw(Graphics2D g2d, LengthUnit cameraUnitsPerPixelUnits,
            double cameraUnitsPerPixelX, double cameraUnitsPerPixelY, double viewPortCenterX,
            double viewPortCenterY, int viewPortWidth, int viewPortHeight, double rotation) {try{__CLR4_5_2452452lx1h72su.R.inc(5377);

        __CLR4_5_2452452lx1h72su.R.inc(5378);g2d.setStroke(new BasicStroke(1f));
        __CLR4_5_2452452lx1h72su.R.inc(5379);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        __CLR4_5_2452452lx1h72su.R.inc(5380);g2d.setColor(color);


        __CLR4_5_2452452lx1h72su.R.inc(5381);Footprint footprint = pkg.getFootprint();
        __CLR4_5_2452452lx1h72su.R.inc(5382);if ((((footprint == null)&&(__CLR4_5_2452452lx1h72su.R.iget(5383)!=0|true))||(__CLR4_5_2452452lx1h72su.R.iget(5384)==0&false))) {{
            __CLR4_5_2452452lx1h72su.R.inc(5385);return;
        }
        }__CLR4_5_2452452lx1h72su.R.inc(5386);Shape shape = footprint.getShape();
        __CLR4_5_2452452lx1h72su.R.inc(5387);if ((((shape == null)&&(__CLR4_5_2452452lx1h72su.R.iget(5388)!=0|true))||(__CLR4_5_2452452lx1h72su.R.iget(5389)==0&false))) {{
            __CLR4_5_2452452lx1h72su.R.inc(5390);return;
        }
        // Determine the scaling factor to go from Outline units to
        // Camera units.
        }__CLR4_5_2452452lx1h72su.R.inc(5391);Length l = new Length(1, footprint.getUnits());
        __CLR4_5_2452452lx1h72su.R.inc(5392);l = l.convertToUnits(cameraUnitsPerPixelUnits);
        __CLR4_5_2452452lx1h72su.R.inc(5393);double unitScale = l.getValue();

        // Create a transform to scale the Shape by
        __CLR4_5_2452452lx1h72su.R.inc(5394);AffineTransform tx = new AffineTransform();

        __CLR4_5_2452452lx1h72su.R.inc(5395);tx.translate(viewPortCenterX, viewPortCenterY);
        // AffineTransform rotates positive clockwise, so we invert the value.
        __CLR4_5_2452452lx1h72su.R.inc(5396);tx.rotate(Math.toRadians(-rotation));

        // First we scale by units to convert the units and then we scale
        // by the camera X and Y units per pixels to get pixel locations.
        __CLR4_5_2452452lx1h72su.R.inc(5397);tx.scale(unitScale, unitScale);
        __CLR4_5_2452452lx1h72su.R.inc(5398);tx.scale(1.0 / cameraUnitsPerPixelX, 1.0 / cameraUnitsPerPixelY);

        // Transform the Shape and draw it out.
        __CLR4_5_2452452lx1h72su.R.inc(5399);shape = tx.createTransformedShape(shape);
        __CLR4_5_2452452lx1h72su.R.inc(5400);g2d.fill(shape);
    }finally{__CLR4_5_2452452lx1h72su.R.flushNeeded();}}
}
