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
@XmlRootElement(name = "grid")
public class Grid {public static class __CLR4_5_2d8bd8blx1h5r0s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,17195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "distance")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String distance;
    @XmlAttribute(name = "unitdist")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unitdist;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "multiple")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String multiple;
    @XmlAttribute(name = "display")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String display;
    @XmlAttribute(name = "altdistance")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String altdistance;
    @XmlAttribute(name = "altunitdist")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String altunitdist;
    @XmlAttribute(name = "altunit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String altunit;

    /**
     * Gets the value of the distance property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDistance() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17147);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17148);return distance;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the distance property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDistance(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17149);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17150);this.distance = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the unitdist property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUnitdist() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17151);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17152);return unitdist;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the unitdist property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUnitdist(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17153);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17154);this.unitdist = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the unit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUnit() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17155);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17156);return unit;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the unit property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUnit(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17157);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17158);this.unit = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the style property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStyle() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17159);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17160);if ((((style == null)&&(__CLR4_5_2d8bd8blx1h5r0s.R.iget(17161)!=0|true))||(__CLR4_5_2d8bd8blx1h5r0s.R.iget(17162)==0&false))) {{
            __CLR4_5_2d8bd8blx1h5r0s.R.inc(17163);return "lines";
        }
        }else {{
            __CLR4_5_2d8bd8blx1h5r0s.R.inc(17164);return style;
        }
    }}finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the style property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStyle(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17165);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17166);this.style = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the multiple property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMultiple() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17167);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17168);if ((((multiple == null)&&(__CLR4_5_2d8bd8blx1h5r0s.R.iget(17169)!=0|true))||(__CLR4_5_2d8bd8blx1h5r0s.R.iget(17170)==0&false))) {{
            __CLR4_5_2d8bd8blx1h5r0s.R.inc(17171);return "1";
        }
        }else {{
            __CLR4_5_2d8bd8blx1h5r0s.R.inc(17172);return multiple;
        }
    }}finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the multiple property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMultiple(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17173);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17174);this.multiple = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the display property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDisplay() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17175);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17176);if ((((display == null)&&(__CLR4_5_2d8bd8blx1h5r0s.R.iget(17177)!=0|true))||(__CLR4_5_2d8bd8blx1h5r0s.R.iget(17178)==0&false))) {{
            __CLR4_5_2d8bd8blx1h5r0s.R.inc(17179);return "no";
        }
        }else {{
            __CLR4_5_2d8bd8blx1h5r0s.R.inc(17180);return display;
        }
    }}finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the display property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDisplay(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17181);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17182);this.display = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the altdistance property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAltdistance() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17183);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17184);return altdistance;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the altdistance property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAltdistance(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17185);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17186);this.altdistance = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the altunitdist property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAltunitdist() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17187);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17188);return altunitdist;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the altunitdist property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAltunitdist(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17189);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17190);this.altunitdist = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Gets the value of the altunit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAltunit() {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17191);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17192);return altunit;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

    /**
     * Sets the value of the altunit property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAltunit(String value) {try{__CLR4_5_2d8bd8blx1h5r0s.R.inc(17193);
        __CLR4_5_2d8bd8blx1h5r0s.R.inc(17194);this.altunit = value;
    }finally{__CLR4_5_2d8bd8blx1h5r0s.R.flushNeeded();}}

}
