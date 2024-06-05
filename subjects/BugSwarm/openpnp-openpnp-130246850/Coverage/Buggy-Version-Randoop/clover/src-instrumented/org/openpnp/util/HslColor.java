/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.util;

import java.awt.Color;

/**
 * The HSLColor class provides methods to manipulate HSL (Hue, Saturation Luminance) values to
 * create a corresponding Color object using the RGB ColorSpace.
 *
 * The HUE is the color, the Saturation is the purity of the color (with respect to grey) and
 * Luminance is the brightness of the color (with respect to black and white)
 *
 * The Hue is specified as an angel between 0 - 360 degrees where red is 0, green is 120 and blue is
 * 240. In between you have the colors of the rainbow. Saturation is specified as a percentage
 * between 0 - 100 where 100 is fully saturated and 0 approaches gray. Luminance is specified as a
 * percentage between 0 - 100 where 0 is black and 100 is white.
 *
 * In particular the HSL color space makes it easier change the Tone or Shade of a color by
 * adjusting the luminance value.
 */
public class HslColor {public static class __CLR4_5_2eqbeqblx1h1y1y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,19237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Color rgb;
    private float[] hsl;
    private float alpha;

    /**
     * Create a HSLColor object using an RGB Color object.
     *
     * @param rgb the RGB Color object
     */
    public HslColor(Color rgb) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19091);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19092);this.rgb = rgb;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19093);hsl = fromRGB(rgb);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19094);alpha = rgb.getAlpha() / 255.0f;
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a HSLColor object using individual HSL values and a default alpha value of 1.0.
     *
     * @param h is the Hue value in degrees between 0 - 360
     * @param s is the Saturation percentage between 0 - 100
     * @param l is the Lumanance percentage between 0 - 100
     */
    public HslColor(float h, float s, float l) {
        this(h, s, l, 1.0f);__CLR4_5_2eqbeqblx1h1y1y.R.inc(19096);try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19095);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a HSLColor object using individual HSL values.
     *
     * @param h the Hue value in degrees between 0 - 360
     * @param s the Saturation percentage between 0 - 100
     * @param l the Lumanance percentage between 0 - 100
     * @param alpha the alpha value between 0 - 1
     */
    public HslColor(float h, float s, float l, float alpha) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19097);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19098);hsl = new float[] {h, s, l};
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19099);this.alpha = alpha;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19100);rgb = toRGB(hsl, alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a HSLColor object using an an array containing the individual HSL values and with a
     * default alpha value of 1.
     *
     * @param hsl array containing HSL values
     */
    public HslColor(float[] hsl) {
        this(hsl, 1.0f);__CLR4_5_2eqbeqblx1h1y1y.R.inc(19102);try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19101);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a HSLColor object using an an array containing the individual HSL values.
     *
     * @param hsl array containing HSL values
     * @param alpha the alpha value between 0 - 1
     */
    public HslColor(float[] hsl, float alpha) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19103);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19104);this.hsl = hsl;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19105);this.alpha = alpha;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19106);rgb = toRGB(hsl, alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a RGB Color object based on this HSLColor with a different Hue value. The degrees
     * specified is an absolute value.
     *
     * @param degrees - the Hue value between 0 - 360
     * @return the RGB Color object
     */
    public Color adjustHue(float degrees) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19107);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19108);return toRGB(degrees, hsl[1], hsl[2], alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a RGB Color object based on this HSLColor with a different Luminance value. The
     * percent specified is an absolute value.
     *
     * @param percent - the Luminance value between 0 - 100
     * @return the RGB Color object
     */
    public Color adjustLuminance(float percent) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19109);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19110);return toRGB(hsl[0], hsl[1], percent, alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a RGB Color object based on this HSLColor with a different Saturation value. The
     * percent specified is an absolute value.
     *
     * @param percent - the Saturation value between 0 - 100
     * @return the RGB Color object
     */
    public Color adjustSaturation(float percent) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19111);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19112);return toRGB(hsl[0], percent, hsl[2], alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a RGB Color object based on this HSLColor with a different Shade. Changing the shade
     * will return a darker color. The percent specified is a relative value.
     *
     * @param percent - the value between 0 - 100
     * @return the RGB Color object
     */
    public Color adjustShade(float percent) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19113);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19114);float multiplier = (100.0f - percent) / 100.0f;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19115);float l = Math.max(0.0f, hsl[2] * multiplier);

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19116);return toRGB(hsl[0], hsl[1], l, alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a RGB Color object based on this HSLColor with a different Tone. Changing the tone
     * will return a lighter color. The percent specified is a relative value.
     *
     * @param percent - the value between 0 - 100
     * @return the RGB Color object
     */
    public Color adjustTone(float percent) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19117);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19118);float multiplier = (100.0f + percent) / 100.0f;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19119);float l = Math.min(100.0f, hsl[2] * multiplier);

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19120);return toRGB(hsl[0], hsl[1], l, alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Get the Alpha value.
     *
     * @return the Alpha value.
     */
    public float getAlpha() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19121);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19122);return alpha;
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Create a RGB Color object that is the complementary color of this HSLColor. This is a
     * convenience method. The complementary color is determined by adding 180 degrees to the Hue
     * value.
     * 
     * @return the RGB Color object
     */
    public Color getComplementary() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19123);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19124);float hue = (hsl[0] + 180.0f) % 360.0f;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19125);return toRGB(hue, hsl[1], hsl[2]);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Get the Hue value.
     *
     * @return the Hue value.
     */
    public float getHue() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19126);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19127);return hsl[0];
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Get the HSL values.
     *
     * @return the HSL values.
     */
    public float[] getHSL() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19128);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19129);return hsl;
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Get the Luminance value.
     *
     * @return the Luminance value.
     */
    public float getLuminance() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19130);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19131);return hsl[2];
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Get the RGB Color object represented by this HDLColor.
     *
     * @return the RGB Color object.
     */
    public Color getRGB() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19132);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19133);return rgb;
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Get the Saturation value.
     *
     * @return the Saturation value.
     */
    public float getSaturation() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19134);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19135);return hsl[1];
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19136);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19137);String toString =
                "HSLColor[h=" + hsl[0] + ",s=" + hsl[1] + ",l=" + hsl[2] + ",alpha=" + alpha + "]";

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19138);return toString;
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Convert a RGB Color to it corresponding HSL values.
     *
     * @return an array containing the 3 HSL values.
     */
    public static float[] fromRGB(Color color) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19139);
        // Get RGB values in the range 0 - 1

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19140);float[] rgb = color.getRGBColorComponents(null);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19141);float r = rgb[0];
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19142);float g = rgb[1];
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19143);float b = rgb[2];

        // Minimum and Maximum RGB values are used in the HSL calculations

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19144);float min = Math.min(r, Math.min(g, b));
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19145);float max = Math.max(r, Math.max(g, b));

        // Calculate the Hue

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19146);float h = 0;

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19147);if ((((max == min)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19148)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19149)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19150);h = 0;
        }else {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19151);if ((((max == r)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19152)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19153)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19154);h = ((60 * (g - b) / (max - min)) + 360) % 360;
        }else {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19155);if ((((max == g)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19156)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19157)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19158);h = (60 * (b - r) / (max - min)) + 120;
        }else {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19159);if ((((max == b)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19160)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19161)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19162);h = (60 * (r - g) / (max - min)) + 240;

        // Calculate the Luminance

        }}}}__CLR4_5_2eqbeqblx1h1y1y.R.inc(19163);float l = (max + min) / 2;

        // Calculate the Saturation

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19164);float s = 0;

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19165);if ((((max == min)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19166)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19167)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19168);s = 0;
        }else {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19169);if ((((l <= .5f)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19170)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19171)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19172);s = (max - min) / (max + min);
        }else
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19173);s = (max - min) / (2 - max - min);

        }}__CLR4_5_2eqbeqblx1h1y1y.R.inc(19174);return new float[] {h, s * 100, l * 100};
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Convert HSL values to a RGB Color with a default alpha value of 1. H (Hue) is specified as
     * degrees in the range 0 - 360. S (Saturation) is specified as a percentage in the range 1 -
     * 100. L (Lumanance) is specified as a percentage in the range 1 - 100.
     *
     * @param hsl an array containing the 3 HSL values
     *
     * @returns the RGB Color object
     */
    public static Color toRGB(float[] hsl) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19175);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19176);return toRGB(hsl, 1.0f);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Convert HSL values to a RGB Color. H (Hue) is specified as degrees in the range 0 - 360. S
     * (Saturation) is specified as a percentage in the range 1 - 100. L (Lumanance) is specified as
     * a percentage in the range 1 - 100.
     *
     * @param hsl an array containing the 3 HSL values
     * @param alpha the alpha value between 0 - 1
     *
     * @returns the RGB Color object
     */
    public static Color toRGB(float[] hsl, float alpha) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19177);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19178);return toRGB(hsl[0], hsl[1], hsl[2], alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Convert HSL values to a RGB Color with a default alpha value of 1.
     *
     * @param h Hue is specified as degrees in the range 0 - 360.
     * @param s Saturation is specified as a percentage in the range 1 - 100.
     * @param l Lumanance is specified as a percentage in the range 1 - 100.
     *
     * @returns the RGB Color object
     */
    public static Color toRGB(float h, float s, float l) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19179);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19180);return toRGB(h, s, l, 1.0f);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    /**
     * Convert HSL values to a RGB Color.
     *
     * @param h Hue is specified as degrees in the range 0 - 360.
     * @param s Saturation is specified as a percentage in the range 1 - 100.
     * @param l Lumanance is specified as a percentage in the range 1 - 100.
     * @param alpha the alpha value between 0 - 1
     *
     * @returns the RGB Color object
     */
    public static Color toRGB(float h, float s, float l, float alpha) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19181);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19182);if ((((s < 0.0f || s > 100.0f)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19183)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19184)==0&false))) {{
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19185);String message = "Color parameter outside of expected range - Saturation";
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19186);throw new IllegalArgumentException(message);
        }

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19187);if ((((l < 0.0f || l > 100.0f)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19188)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19189)==0&false))) {{
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19190);String message = "Color parameter outside of expected range - Luminance";
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19191);throw new IllegalArgumentException(message);
        }

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19192);if ((((alpha < 0.0f || alpha > 1.0f)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19193)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19194)==0&false))) {{
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19195);String message = "Color parameter outside of expected range - Alpha";
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19196);throw new IllegalArgumentException(message);
        }

        // Formula needs all values between 0 - 1.

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19197);h = h % 360.0f;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19198);h /= 360f;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19199);s /= 100f;
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19200);l /= 100f;

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19201);float q = 0;

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19202);if ((((l < 0.5)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19203)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19204)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19205);q = l * (1 + s);
        }else
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19206);q = (l + s) - (s * l);

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19207);float p = 2 * l - q;

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19208);float r = Math.max(0, HueToRGB(p, q, h + (1.0f / 3.0f)));
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19209);float g = Math.max(0, HueToRGB(p, q, h));
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19210);float b = Math.max(0, HueToRGB(p, q, h - (1.0f / 3.0f)));

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19211);r = Math.min(r, 1.0f);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19212);g = Math.min(g, 1.0f);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19213);b = Math.min(b, 1.0f);

        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19214);return new Color(r, g, b, alpha);
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}

    private static float HueToRGB(float p, float q, float h) {try{__CLR4_5_2eqbeqblx1h1y1y.R.inc(19215);
        __CLR4_5_2eqbeqblx1h1y1y.R.inc(19216);if ((((h < 0)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19217)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19218)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19219);h += 1;

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19220);if ((((h > 1)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19221)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19222)==0&false)))
            {__CLR4_5_2eqbeqblx1h1y1y.R.inc(19223);h -= 1;

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19224);if ((((6 * h < 1)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19225)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19226)==0&false))) {{
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19227);return p + ((q - p) * 6 * h);
        }

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19228);if ((((2 * h < 1)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19229)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19230)==0&false))) {{
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19231);return q;
        }

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19232);if ((((3 * h < 2)&&(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19233)!=0|true))||(__CLR4_5_2eqbeqblx1h1y1y.R.iget(19234)==0&false))) {{
            __CLR4_5_2eqbeqblx1h1y1y.R.inc(19235);return p + ((q - p) * 6 * ((2.0f / 3.0f) - h));
        }

        }__CLR4_5_2eqbeqblx1h1y1y.R.inc(19236);return p;
    }finally{__CLR4_5_2eqbeqblx1h1y1y.R.flushNeeded();}}
}
