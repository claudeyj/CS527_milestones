/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *///
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.23 at 08:50:01 AM PDT
//


package org.openpnp.model.eagle.xml;

import java.util.ArrayList;
import java.util.List;

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
@XmlType(name = "", propOrder = {"attribute", "variant"})
@XmlRootElement(name = "part")
public class Part {public static class __CLR4_5_2dpldpllx1h1xm7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,17809,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "library", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String library;
    @XmlAttribute(name = "deviceset", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deviceset;
    @XmlAttribute(name = "device", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String device;
    @XmlAttribute(name = "technology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String technology;
    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    protected List<Attribute> attribute;
    protected List<Variant> variant;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17769);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17770);return name;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17771);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17772);this.name = value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the library property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLibrary() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17773);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17774);return library;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Sets the value of the library property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLibrary(String value) {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17775);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17776);this.library = value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the deviceset property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeviceset() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17777);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17778);return deviceset;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Sets the value of the deviceset property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDeviceset(String value) {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17779);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17780);this.deviceset = value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the device property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDevice() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17781);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17782);return device;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Sets the value of the device property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDevice(String value) {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17783);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17784);this.device = value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the technology property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTechnology() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17785);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17786);if ((((technology == null)&&(__CLR4_5_2dpldpllx1h1xm7.R.iget(17787)!=0|true))||(__CLR4_5_2dpldpllx1h1xm7.R.iget(17788)==0&false))) {{
            __CLR4_5_2dpldpllx1h1xm7.R.inc(17789);return "";
        }
        }else {{
            __CLR4_5_2dpldpllx1h1xm7.R.inc(17790);return technology;
        }
    }}finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Sets the value of the technology property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTechnology(String value) {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17791);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17792);this.technology = value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the value property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValue() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17793);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17794);return value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setValue(String value) {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17795);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17796);this.value = value;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttribute() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17797);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17798);if ((((attribute == null)&&(__CLR4_5_2dpldpllx1h1xm7.R.iget(17799)!=0|true))||(__CLR4_5_2dpldpllx1h1xm7.R.iget(17800)==0&false))) {{
            __CLR4_5_2dpldpllx1h1xm7.R.inc(17801);attribute = new ArrayList<>();
        }
        }__CLR4_5_2dpldpllx1h1xm7.R.inc(17802);return this.attribute;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

    /**
     * Gets the value of the variant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the variant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Variant }
     * 
     * 
     */
    public List<Variant> getVariant() {try{__CLR4_5_2dpldpllx1h1xm7.R.inc(17803);
        __CLR4_5_2dpldpllx1h1xm7.R.inc(17804);if ((((variant == null)&&(__CLR4_5_2dpldpllx1h1xm7.R.iget(17805)!=0|true))||(__CLR4_5_2dpldpllx1h1xm7.R.iget(17806)==0&false))) {{
            __CLR4_5_2dpldpllx1h1xm7.R.inc(17807);variant = new ArrayList<>();
        }
        }__CLR4_5_2dpldpllx1h1xm7.R.inc(17808);return this.variant;
    }finally{__CLR4_5_2dpldpllx1h1xm7.R.flushNeeded();}}

}