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
@XmlType(name = "", propOrder = {"description", "libraries", "attributes", "variantdefs", "classes",
        "modules", "parts", "sheets", "errors"})
@XmlRootElement(name = "schematic")
public class Schematic {public static class __CLR4_5_2dwwdwwlx1h784j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,18076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "xreflabel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xreflabel;
    @XmlAttribute(name = "xrefpart")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xrefpart;
    protected Description description;
    protected Libraries libraries;
    protected Attributes attributes;
    protected Variantdefs variantdefs;
    protected Classes classes;
    protected Modules modules;
    protected Parts parts;
    protected Sheets sheets;
    protected Errors errors;

    /**
     * Gets the value of the xreflabel property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getXreflabel() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18032);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18033);return xreflabel;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the xreflabel property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setXreflabel(String value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18034);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18035);this.xreflabel = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the xrefpart property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getXrefpart() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18036);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18037);return xrefpart;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the xrefpart property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setXrefpart(String value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18038);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18039);this.xrefpart = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18040);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18041);return description;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18042);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18043);this.description = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the libraries property.
     * 
     * @return possible object is {@link Libraries }
     * 
     */
    public Libraries getLibraries() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18044);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18045);return libraries;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the libraries property.
     * 
     * @param value allowed object is {@link Libraries }
     * 
     */
    public void setLibraries(Libraries value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18046);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18047);this.libraries = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the attributes property.
     * 
     * @return possible object is {@link Attributes }
     * 
     */
    public Attributes getAttributes() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18048);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18049);return attributes;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the attributes property.
     * 
     * @param value allowed object is {@link Attributes }
     * 
     */
    public void setAttributes(Attributes value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18050);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18051);this.attributes = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the variantdefs property.
     * 
     * @return possible object is {@link Variantdefs }
     * 
     */
    public Variantdefs getVariantdefs() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18052);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18053);return variantdefs;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the variantdefs property.
     * 
     * @param value allowed object is {@link Variantdefs }
     * 
     */
    public void setVariantdefs(Variantdefs value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18054);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18055);this.variantdefs = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the classes property.
     * 
     * @return possible object is {@link Classes }
     * 
     */
    public Classes getClasses() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18056);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18057);return classes;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the classes property.
     * 
     * @param value allowed object is {@link Classes }
     * 
     */
    public void setClasses(Classes value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18058);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18059);this.classes = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the modules property.
     * 
     * @return possible object is {@link Modules }
     * 
     */
    public Modules getModules() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18060);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18061);return modules;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the modules property.
     * 
     * @param value allowed object is {@link Modules }
     * 
     */
    public void setModules(Modules value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18062);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18063);this.modules = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the parts property.
     * 
     * @return possible object is {@link Parts }
     * 
     */
    public Parts getParts() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18064);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18065);return parts;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the parts property.
     * 
     * @param value allowed object is {@link Parts }
     * 
     */
    public void setParts(Parts value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18066);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18067);this.parts = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the sheets property.
     * 
     * @return possible object is {@link Sheets }
     * 
     */
    public Sheets getSheets() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18068);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18069);return sheets;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the sheets property.
     * 
     * @param value allowed object is {@link Sheets }
     * 
     */
    public void setSheets(Sheets value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18070);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18071);this.sheets = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Gets the value of the errors property.
     * 
     * @return possible object is {@link Errors }
     * 
     */
    public Errors getErrors() {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18072);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18073);return errors;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

    /**
     * Sets the value of the errors property.
     * 
     * @param value allowed object is {@link Errors }
     * 
     */
    public void setErrors(Errors value) {try{__CLR4_5_2dwwdwwlx1h784j.R.inc(18074);
        __CLR4_5_2dwwdwwlx1h784j.R.inc(18075);this.errors = value;
    }finally{__CLR4_5_2dwwdwwlx1h784j.R.flushNeeded();}}

}
