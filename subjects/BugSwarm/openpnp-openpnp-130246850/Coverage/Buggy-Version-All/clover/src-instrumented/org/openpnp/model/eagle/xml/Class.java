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
@XmlType(name = "", propOrder = {"clearance"})
@XmlRootElement(name = "class")
public class Class {public static class __CLR4_5_2cuccuclx1h3amp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,16674,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "number", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String number;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "drill")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String drill;
    protected List<Clearance> clearance;

    /**
     * Gets the value of the number property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumber() {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16644);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16645);return number;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Sets the value of the number property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumber(String value) {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16646);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16647);this.number = value;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16648);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16649);return name;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16650);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16651);this.name = value;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Gets the value of the width property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWidth() {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16652);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16653);if ((((width == null)&&(__CLR4_5_2cuccuclx1h3amp.R.iget(16654)!=0|true))||(__CLR4_5_2cuccuclx1h3amp.R.iget(16655)==0&false))) {{
            __CLR4_5_2cuccuclx1h3amp.R.inc(16656);return "0";
        }
        }else {{
            __CLR4_5_2cuccuclx1h3amp.R.inc(16657);return width;
        }
    }}finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Sets the value of the width property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setWidth(String value) {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16658);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16659);this.width = value;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Gets the value of the drill property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDrill() {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16660);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16661);if ((((drill == null)&&(__CLR4_5_2cuccuclx1h3amp.R.iget(16662)!=0|true))||(__CLR4_5_2cuccuclx1h3amp.R.iget(16663)==0&false))) {{
            __CLR4_5_2cuccuclx1h3amp.R.inc(16664);return "0";
        }
        }else {{
            __CLR4_5_2cuccuclx1h3amp.R.inc(16665);return drill;
        }
    }}finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Sets the value of the drill property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDrill(String value) {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16666);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16667);this.drill = value;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

    /**
     * Gets the value of the clearance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the clearance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getClearance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Clearance }
     * 
     * 
     */
    public List<Clearance> getClearance() {try{__CLR4_5_2cuccuclx1h3amp.R.inc(16668);
        __CLR4_5_2cuccuclx1h3amp.R.inc(16669);if ((((clearance == null)&&(__CLR4_5_2cuccuclx1h3amp.R.iget(16670)!=0|true))||(__CLR4_5_2cuccuclx1h3amp.R.iget(16671)==0&false))) {{
            __CLR4_5_2cuccuclx1h3amp.R.inc(16672);clearance = new ArrayList<>();
        }
        }__CLR4_5_2cuccuclx1h3amp.R.inc(16673);return this.clearance;
    }finally{__CLR4_5_2cuccuclx1h3amp.R.flushNeeded();}}

}
