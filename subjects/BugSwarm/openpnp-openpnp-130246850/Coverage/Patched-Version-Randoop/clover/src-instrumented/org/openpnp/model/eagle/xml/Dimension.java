/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *///
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.23 at 08:50:01 AM PDT
//


package org.openpnp.model.eagle.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "dimension")
public class Dimension {public static class __CLR4_5_2cztcztlx1h77uj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,16941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "x1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x1;
    @XmlAttribute(name = "y1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y1;
    @XmlAttribute(name = "x2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x2;
    @XmlAttribute(name = "y2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y2;
    @XmlAttribute(name = "x3", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x3;
    @XmlAttribute(name = "y3", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y3;
    @XmlAttribute(name = "layer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "dtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dtype;
    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "extwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extwidth;
    @XmlAttribute(name = "extlength")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extlength;
    @XmlAttribute(name = "extoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extoffset;
    @XmlAttribute(name = "textsize", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String textsize;
    @XmlAttribute(name = "textratio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String textratio;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "precision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String precision;
    @XmlAttribute(name = "visible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visible;

    /**
     * Gets the value of the x1 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX1() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16841);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16842);return x1;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the x1 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX1(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16843);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16844);this.x1 = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the y1 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY1() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16845);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16846);return y1;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the y1 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY1(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16847);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16848);this.y1 = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the x2 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX2() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16849);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16850);return x2;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the x2 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX2(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16851);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16852);this.x2 = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the y2 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY2() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16853);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16854);return y2;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the y2 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY2(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16855);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16856);this.y2 = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the x3 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX3() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16857);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16858);return x3;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the x3 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX3(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16859);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16860);this.x3 = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the y3 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY3() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16861);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16862);return y3;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the y3 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY3(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16863);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16864);this.y3 = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the layer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLayer() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16865);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16866);return layer;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the layer property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLayer(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16867);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16868);this.layer = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the dtype property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDtype() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16869);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16870);if ((((dtype == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16871)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16872)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16873);return "parallel";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16874);return dtype;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the dtype property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDtype(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16875);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16876);this.dtype = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the width property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWidth() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16877);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16878);return width;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the width property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setWidth(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16879);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16880);this.width = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the extwidth property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getExtwidth() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16881);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16882);if ((((extwidth == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16883)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16884)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16885);return "0";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16886);return extwidth;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the extwidth property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setExtwidth(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16887);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16888);this.extwidth = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the extlength property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getExtlength() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16889);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16890);if ((((extlength == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16891)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16892)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16893);return "0";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16894);return extlength;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the extlength property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setExtlength(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16895);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16896);this.extlength = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the extoffset property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getExtoffset() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16897);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16898);if ((((extoffset == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16899)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16900)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16901);return "0";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16902);return extoffset;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the extoffset property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setExtoffset(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16903);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16904);this.extoffset = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the textsize property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTextsize() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16905);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16906);return textsize;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the textsize property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTextsize(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16907);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16908);this.textsize = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the textratio property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTextratio() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16909);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16910);if ((((textratio == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16911)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16912)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16913);return "8";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16914);return textratio;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the textratio property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTextratio(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16915);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16916);this.textratio = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the unit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUnit() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16917);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16918);if ((((unit == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16919)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16920)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16921);return "mm";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16922);return unit;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the unit property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUnit(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16923);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16924);this.unit = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the precision property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPrecision() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16925);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16926);if ((((precision == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16927)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16928)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16929);return "2";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16930);return precision;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the precision property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPrecision(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16931);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16932);this.precision = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Gets the value of the visible property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVisible() {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16933);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16934);if ((((visible == null)&&(__CLR4_5_2cztcztlx1h77uj.R.iget(16935)!=0|true))||(__CLR4_5_2cztcztlx1h77uj.R.iget(16936)==0&false))) {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16937);return "no";
        }
        }else {{
            __CLR4_5_2cztcztlx1h77uj.R.inc(16938);return visible;
        }
    }}finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

    /**
     * Sets the value of the visible property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setVisible(String value) {try{__CLR4_5_2cztcztlx1h77uj.R.inc(16939);
        __CLR4_5_2cztcztlx1h77uj.R.inc(16940);this.visible = value;
    }finally{__CLR4_5_2cztcztlx1h77uj.R.flushNeeded();}}

}
