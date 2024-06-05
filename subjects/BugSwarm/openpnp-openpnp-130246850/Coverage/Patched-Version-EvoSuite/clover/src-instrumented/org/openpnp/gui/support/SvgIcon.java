/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * SVGIcon.java
 *
 * A Swing Icon that draws an SVG image.
 *
 * Cameron McCormack <cam (at) mcc.id.au>
 *
 * Permission is hereby granted to use, copy, modify and distribte this code for any purpose,
 * without fee.
 *
 * Initial version: April 21, 2005
 */

package org.openpnp.gui.support;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.GrayFilter;
import javax.swing.Icon;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;


/**
 * A Swing Icon that draws an SVG image.
 *
 * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a>
 */
public class SvgIcon implements Icon {public static class __CLR4_5_265c65clx1h5nen{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,8005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The BufferedImage generated from the SVG document.
     */
    protected BufferedImage bufferedImage;

    protected Image bufferedImageDisabled;

    /**
     * The width of the rendered image.
     */
    protected int width;

    /**
     * The height of the rendered image.
     */
    protected int height;

    /**
     * Create a new SVGIcon object.
     * 
     * @param uri The URI to read the SVG document from.
     */
    public SvgIcon(URL url, int width, int height) {try{__CLR4_5_265c65clx1h5nen.R.inc(7968);
        __CLR4_5_265c65clx1h5nen.R.inc(7969);try {
            __CLR4_5_265c65clx1h5nen.R.inc(7970);generateBufferedImage(new TranscoderInput(url.toString()), width, height);
        }
        catch (Exception e) {
            __CLR4_5_265c65clx1h5nen.R.inc(7971);e.printStackTrace();
        }
    }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

    /**
     * Create a new SVGIcon object.
     * 
     * @param uri The URI to read the SVG document from.
     */
    public SvgIcon(URL url) {
        this(url, 24, 24);__CLR4_5_265c65clx1h5nen.R.inc(7973);try{__CLR4_5_265c65clx1h5nen.R.inc(7972);
    }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

    /**
     * Generate the BufferedImage.
     */
    protected void generateBufferedImage(TranscoderInput in, int w, int h)
            throws TranscoderException {try{__CLR4_5_265c65clx1h5nen.R.inc(7974);
        __CLR4_5_265c65clx1h5nen.R.inc(7975);BufferedImageTranscoder t = new BufferedImageTranscoder();
        __CLR4_5_265c65clx1h5nen.R.inc(7976);if ((((w != 0 && h != 0)&&(__CLR4_5_265c65clx1h5nen.R.iget(7977)!=0|true))||(__CLR4_5_265c65clx1h5nen.R.iget(7978)==0&false))) {{
            __CLR4_5_265c65clx1h5nen.R.inc(7979);t.setDimensions(w, h);
        }
        }__CLR4_5_265c65clx1h5nen.R.inc(7980);t.transcode(in, null);
        __CLR4_5_265c65clx1h5nen.R.inc(7981);bufferedImage = t.getBufferedImage();
        __CLR4_5_265c65clx1h5nen.R.inc(7982);bufferedImageDisabled = GrayFilter.createDisabledImage(bufferedImage);
        __CLR4_5_265c65clx1h5nen.R.inc(7983);width = bufferedImage.getWidth();
        __CLR4_5_265c65clx1h5nen.R.inc(7984);height = bufferedImage.getHeight();
    }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

    // Icon //////////////////////////////////////////////////////////////////

    /**
     * Returns the icon's width.
     */
    public int getIconWidth() {try{__CLR4_5_265c65clx1h5nen.R.inc(7985);
        __CLR4_5_265c65clx1h5nen.R.inc(7986);return width;
    }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

    /**
     * Returns the icon's height.
     */
    public int getIconHeight() {try{__CLR4_5_265c65clx1h5nen.R.inc(7987);
        __CLR4_5_265c65clx1h5nen.R.inc(7988);return height;
    }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

    /**
     * Draw the icon at the specified location.
     */
    public void paintIcon(Component c, Graphics g, int x, int y) {try{__CLR4_5_265c65clx1h5nen.R.inc(7989);
        __CLR4_5_265c65clx1h5nen.R.inc(7990);Image image = bufferedImage;
        __CLR4_5_265c65clx1h5nen.R.inc(7991);if ((((c != null && !c.isEnabled())&&(__CLR4_5_265c65clx1h5nen.R.iget(7992)!=0|true))||(__CLR4_5_265c65clx1h5nen.R.iget(7993)==0&false))) {{
            __CLR4_5_265c65clx1h5nen.R.inc(7994);image = bufferedImageDisabled;
        }
        }__CLR4_5_265c65clx1h5nen.R.inc(7995);g.drawImage(image, x, y, null);
    }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

    /**
     * A transcoder that generates a BufferedImage.
     */
    protected class BufferedImageTranscoder extends ImageTranscoder {

        /**
         * The BufferedImage generated from the SVG document.
         */
        protected BufferedImage bufferedImage;

        /**
         * Creates a new ARGB image with the specified dimension.
         * 
         * @param width the image width in pixels
         * @param height the image height in pixels
         */
        public BufferedImage createImage(int width, int height) {try{__CLR4_5_265c65clx1h5nen.R.inc(7996);
            __CLR4_5_265c65clx1h5nen.R.inc(7997);return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

        /**
         * Writes the specified image to the specified output.
         * 
         * @param img the image to write
         * @param output the output where to store the image
         * @param TranscoderException if an error occured while storing the image
         */
        public void writeImage(BufferedImage img, TranscoderOutput output)
                throws TranscoderException {try{__CLR4_5_265c65clx1h5nen.R.inc(7998);
            __CLR4_5_265c65clx1h5nen.R.inc(7999);bufferedImage = img;
        }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

        /**
         * Returns the BufferedImage generated from the SVG document.
         */
        public BufferedImage getBufferedImage() {try{__CLR4_5_265c65clx1h5nen.R.inc(8000);
            __CLR4_5_265c65clx1h5nen.R.inc(8001);return bufferedImage;
        }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}

        /**
         * Set the dimensions to be used for the image.
         */
        public void setDimensions(int w, int h) {try{__CLR4_5_265c65clx1h5nen.R.inc(8002);
            __CLR4_5_265c65clx1h5nen.R.inc(8003);hints.put(KEY_WIDTH, new Float(w));
            __CLR4_5_265c65clx1h5nen.R.inc(8004);hints.put(KEY_HEIGHT, new Float(h));
        }finally{__CLR4_5_265c65clx1h5nen.R.flushNeeded();}}
    }
}
