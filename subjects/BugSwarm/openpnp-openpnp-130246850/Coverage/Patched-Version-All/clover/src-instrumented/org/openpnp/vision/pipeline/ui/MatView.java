/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

import org.opencv.core.Mat;
import org.openpnp.util.OpenCvUtils;

public class MatView extends JComponent {public static class __CLR4_5_2gfbgfblx1h8q17{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,21323,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private BufferedImage image;

    public MatView() {try{__CLR4_5_2gfbgfblx1h8q17.R.inc(21287);
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21288);setBackground(Color.black);
    }finally{__CLR4_5_2gfbgfblx1h8q17.R.flushNeeded();}}

    public void setMat(Mat mat) {try{__CLR4_5_2gfbgfblx1h8q17.R.inc(21289);
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21290);if ((((mat == null || mat.empty())&&(__CLR4_5_2gfbgfblx1h8q17.R.iget(21291)!=0|true))||(__CLR4_5_2gfbgfblx1h8q17.R.iget(21292)==0&false))) {{
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21293);image = null;
        }
        }else {{
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21294);image = OpenCvUtils.toBufferedImage(mat);
        }
        }__CLR4_5_2gfbgfblx1h8q17.R.inc(21295);repaint();
    }finally{__CLR4_5_2gfbgfblx1h8q17.R.flushNeeded();}}

    @Override
    protected void paintComponent(Graphics g) {try{__CLR4_5_2gfbgfblx1h8q17.R.inc(21296);
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21297);super.paintComponent(g);
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21298);if ((((image == null)&&(__CLR4_5_2gfbgfblx1h8q17.R.iget(21299)!=0|true))||(__CLR4_5_2gfbgfblx1h8q17.R.iget(21300)==0&false))) {{
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21301);return;
        }

        }__CLR4_5_2gfbgfblx1h8q17.R.inc(21302);Insets ins = getInsets();
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21303);double sourceWidth = image.getWidth();
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21304);double sourceHeight = image.getHeight();
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21305);double destWidth = getWidth() - ins.left - ins.right;
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21306);double destHeight = getHeight() - ins.top - ins.bottom;

        /**
         * We want to fit both axes in the given destWidth and destHeight while maintaining the
         * aspect ratio. If the frame is smaller in either or both axes than the original will need
         * to be scaled to fill the space as completely as possible while still maintaining the
         * aspect ratio. 1. Determine the source size of the image: sourceWidth, sourceHeight. 2.
         * Determine the max size each axis can be: destWidth, destHeight. 3. Calculate how much
         * each axis needs to be scaled to fit. 4. Use the larger of the two and scale the opposite
         * axis by the aspect ratio + the scaling ratio.
         */

        __CLR4_5_2gfbgfblx1h8q17.R.inc(21307);double widthRatio = sourceWidth / destWidth;
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21308);double heightRatio = sourceHeight / destHeight;

        __CLR4_5_2gfbgfblx1h8q17.R.inc(21309);double scaledHeight, scaledWidth;

        __CLR4_5_2gfbgfblx1h8q17.R.inc(21310);if ((((heightRatio > widthRatio)&&(__CLR4_5_2gfbgfblx1h8q17.R.iget(21311)!=0|true))||(__CLR4_5_2gfbgfblx1h8q17.R.iget(21312)==0&false))) {{
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21313);double aspectRatio = sourceWidth / sourceHeight;
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21314);scaledHeight = destHeight;
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21315);scaledWidth = (scaledHeight * aspectRatio);
        }
        }else {{
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21316);double aspectRatio = sourceHeight / sourceWidth;
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21317);scaledWidth = destWidth;
            __CLR4_5_2gfbgfblx1h8q17.R.inc(21318);scaledHeight = (scaledWidth * aspectRatio);
        }

        }__CLR4_5_2gfbgfblx1h8q17.R.inc(21319);int imageX = (int) (ins.left + (destWidth / 2) - (scaledWidth / 2));
        __CLR4_5_2gfbgfblx1h8q17.R.inc(21320);int imageY = (int) (ins.top + (destHeight / 2) - (scaledHeight / 2));

        __CLR4_5_2gfbgfblx1h8q17.R.inc(21321);Graphics2D g2d = (Graphics2D) g;

        __CLR4_5_2gfbgfblx1h8q17.R.inc(21322);g2d.drawImage(image, imageX, imageY, (int) scaledWidth, (int) scaledHeight, null);
    }finally{__CLR4_5_2gfbgfblx1h8q17.R.flushNeeded();}}
}
