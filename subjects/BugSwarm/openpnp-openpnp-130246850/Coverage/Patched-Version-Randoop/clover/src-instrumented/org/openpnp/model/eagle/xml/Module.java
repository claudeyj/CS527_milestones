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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"description", "ports", "variantdefs", "parts", "sheets"})
@XmlRootElement(name = "module")
public class Module {public static class __CLR4_5_2dejdejlx1h780g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,17411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "prefix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prefix;
    @XmlAttribute(name = "dx", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dx;
    @XmlAttribute(name = "dy", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dy;
    protected Description description;
    protected Ports ports;
    protected Variantdefs variantdefs;
    protected Parts parts;
    protected Sheets sheets;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17371);
        __CLR4_5_2dejdejlx1h780g.R.inc(17372);return name;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17373);
        __CLR4_5_2dejdejlx1h780g.R.inc(17374);this.name = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the prefix property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPrefix() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17375);
        __CLR4_5_2dejdejlx1h780g.R.inc(17376);if ((((prefix == null)&&(__CLR4_5_2dejdejlx1h780g.R.iget(17377)!=0|true))||(__CLR4_5_2dejdejlx1h780g.R.iget(17378)==0&false))) {{
            __CLR4_5_2dejdejlx1h780g.R.inc(17379);return "";
        }
        }else {{
            __CLR4_5_2dejdejlx1h780g.R.inc(17380);return prefix;
        }
    }}finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the prefix property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPrefix(String value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17381);
        __CLR4_5_2dejdejlx1h780g.R.inc(17382);this.prefix = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the dx property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDx() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17383);
        __CLR4_5_2dejdejlx1h780g.R.inc(17384);return dx;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the dx property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDx(String value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17385);
        __CLR4_5_2dejdejlx1h780g.R.inc(17386);this.dx = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the dy property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDy() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17387);
        __CLR4_5_2dejdejlx1h780g.R.inc(17388);return dy;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the dy property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDy(String value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17389);
        __CLR4_5_2dejdejlx1h780g.R.inc(17390);this.dy = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17391);
        __CLR4_5_2dejdejlx1h780g.R.inc(17392);return description;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17393);
        __CLR4_5_2dejdejlx1h780g.R.inc(17394);this.description = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the ports property.
     * 
     * @return possible object is {@link Ports }
     * 
     */
    public Ports getPorts() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17395);
        __CLR4_5_2dejdejlx1h780g.R.inc(17396);return ports;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the ports property.
     * 
     * @param value allowed object is {@link Ports }
     * 
     */
    public void setPorts(Ports value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17397);
        __CLR4_5_2dejdejlx1h780g.R.inc(17398);this.ports = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the variantdefs property.
     * 
     * @return possible object is {@link Variantdefs }
     * 
     */
    public Variantdefs getVariantdefs() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17399);
        __CLR4_5_2dejdejlx1h780g.R.inc(17400);return variantdefs;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the variantdefs property.
     * 
     * @param value allowed object is {@link Variantdefs }
     * 
     */
    public void setVariantdefs(Variantdefs value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17401);
        __CLR4_5_2dejdejlx1h780g.R.inc(17402);this.variantdefs = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the parts property.
     * 
     * @return possible object is {@link Parts }
     * 
     */
    public Parts getParts() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17403);
        __CLR4_5_2dejdejlx1h780g.R.inc(17404);return parts;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the parts property.
     * 
     * @param value allowed object is {@link Parts }
     * 
     */
    public void setParts(Parts value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17405);
        __CLR4_5_2dejdejlx1h780g.R.inc(17406);this.parts = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Gets the value of the sheets property.
     * 
     * @return possible object is {@link Sheets }
     * 
     */
    public Sheets getSheets() {try{__CLR4_5_2dejdejlx1h780g.R.inc(17407);
        __CLR4_5_2dejdejlx1h780g.R.inc(17408);return sheets;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

    /**
     * Sets the value of the sheets property.
     * 
     * @param value allowed object is {@link Sheets }
     * 
     */
    public void setSheets(Sheets value) {try{__CLR4_5_2dejdejlx1h780g.R.inc(17409);
        __CLR4_5_2dejdejlx1h780g.R.inc(17410);this.sheets = value;
    }finally{__CLR4_5_2dejdejlx1h780g.R.flushNeeded();}}

}