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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"contactrefOrPolygonOrWireOrVia"})
@XmlRootElement(name = "signal")
public class Signal {public static class __CLR4_5_2dzmdzmlx1h8o6c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,18156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "airwireshidden")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String airwireshidden;
    @XmlElements({@XmlElement(name = "contactref", type = Contactref.class),
            @XmlElement(name = "polygon", type = Polygon.class),
            @XmlElement(name = "wire", type = Wire.class),
            @XmlElement(name = "via", type = Via.class)})
    protected List<Object> contactrefOrPolygonOrWireOrVia;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18130);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18131);return name;
    }finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18132);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18133);this.name = value;
    }finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

    /**
     * Gets the value of the clazz property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClazz() {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18134);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18135);if ((((clazz == null)&&(__CLR4_5_2dzmdzmlx1h8o6c.R.iget(18136)!=0|true))||(__CLR4_5_2dzmdzmlx1h8o6c.R.iget(18137)==0&false))) {{
            __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18138);return "0";
        }
        }else {{
            __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18139);return clazz;
        }
    }}finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

    /**
     * Sets the value of the clazz property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setClazz(String value) {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18140);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18141);this.clazz = value;
    }finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

    /**
     * Gets the value of the airwireshidden property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAirwireshidden() {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18142);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18143);if ((((airwireshidden == null)&&(__CLR4_5_2dzmdzmlx1h8o6c.R.iget(18144)!=0|true))||(__CLR4_5_2dzmdzmlx1h8o6c.R.iget(18145)==0&false))) {{
            __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18146);return "no";
        }
        }else {{
            __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18147);return airwireshidden;
        }
    }}finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

    /**
     * Sets the value of the airwireshidden property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAirwireshidden(String value) {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18148);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18149);this.airwireshidden = value;
    }finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

    /**
     * Gets the value of the contactrefOrPolygonOrWireOrVia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the contactrefOrPolygonOrWireOrVia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContactrefOrPolygonOrWireOrVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Contactref } {@link Polygon }
     * {@link Wire } {@link Via }
     * 
     * 
     */
    public List<Object> getContactrefOrPolygonOrWireOrVia() {try{__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18150);
        __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18151);if ((((contactrefOrPolygonOrWireOrVia == null)&&(__CLR4_5_2dzmdzmlx1h8o6c.R.iget(18152)!=0|true))||(__CLR4_5_2dzmdzmlx1h8o6c.R.iget(18153)==0&false))) {{
            __CLR4_5_2dzmdzmlx1h8o6c.R.inc(18154);contactrefOrPolygonOrWireOrVia = new ArrayList<>();
        }
        }__CLR4_5_2dzmdzmlx1h8o6c.R.inc(18155);return this.contactrefOrPolygonOrWireOrVia;
    }finally{__CLR4_5_2dzmdzmlx1h8o6c.R.flushNeeded();}}

}
