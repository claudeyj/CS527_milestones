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
@XmlRootElement(name = "pad")
public class Pad {public static class __CLR4_5_2dnldnllx1h0emt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,17761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "drill", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String drill;
    @XmlAttribute(name = "diameter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String diameter;
    @XmlAttribute(name = "shape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shape;
    @XmlAttribute(name = "rot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rot;
    @XmlAttribute(name = "stop")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stop;
    @XmlAttribute(name = "thermals")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String thermals;
    @XmlAttribute(name = "first")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String first;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17697);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17698);return name;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17699);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17700);this.name = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the x property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17701);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17702);return x;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the x property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17703);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17704);this.x = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the y property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17705);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17706);return y;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the y property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17707);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17708);this.y = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the drill property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDrill() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17709);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17710);return drill;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the drill property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDrill(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17711);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17712);this.drill = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the diameter property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDiameter() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17713);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17714);if ((((diameter == null)&&(__CLR4_5_2dnldnllx1h0emt.R.iget(17715)!=0|true))||(__CLR4_5_2dnldnllx1h0emt.R.iget(17716)==0&false))) {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17717);return "0";
        }
        }else {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17718);return diameter;
        }
    }}finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the diameter property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDiameter(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17719);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17720);this.diameter = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the shape property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getShape() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17721);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17722);if ((((shape == null)&&(__CLR4_5_2dnldnllx1h0emt.R.iget(17723)!=0|true))||(__CLR4_5_2dnldnllx1h0emt.R.iget(17724)==0&false))) {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17725);return "round";
        }
        }else {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17726);return shape;
        }
    }}finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the shape property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setShape(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17727);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17728);this.shape = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the rot property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRot() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17729);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17730);if ((((rot == null)&&(__CLR4_5_2dnldnllx1h0emt.R.iget(17731)!=0|true))||(__CLR4_5_2dnldnllx1h0emt.R.iget(17732)==0&false))) {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17733);return "R0";
        }
        }else {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17734);return rot;
        }
    }}finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the rot property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRot(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17735);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17736);this.rot = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the stop property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStop() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17737);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17738);if ((((stop == null)&&(__CLR4_5_2dnldnllx1h0emt.R.iget(17739)!=0|true))||(__CLR4_5_2dnldnllx1h0emt.R.iget(17740)==0&false))) {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17741);return "yes";
        }
        }else {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17742);return stop;
        }
    }}finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the stop property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStop(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17743);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17744);this.stop = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the thermals property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getThermals() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17745);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17746);if ((((thermals == null)&&(__CLR4_5_2dnldnllx1h0emt.R.iget(17747)!=0|true))||(__CLR4_5_2dnldnllx1h0emt.R.iget(17748)==0&false))) {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17749);return "yes";
        }
        }else {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17750);return thermals;
        }
    }}finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the thermals property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setThermals(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17751);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17752);this.thermals = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Gets the value of the first property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFirst() {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17753);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17754);if ((((first == null)&&(__CLR4_5_2dnldnllx1h0emt.R.iget(17755)!=0|true))||(__CLR4_5_2dnldnllx1h0emt.R.iget(17756)==0&false))) {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17757);return "no";
        }
        }else {{
            __CLR4_5_2dnldnllx1h0emt.R.inc(17758);return first;
        }
    }}finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

    /**
     * Sets the value of the first property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFirst(String value) {try{__CLR4_5_2dnldnllx1h0emt.R.inc(17759);
        __CLR4_5_2dnldnllx1h0emt.R.inc(17760);this.first = value;
    }finally{__CLR4_5_2dnldnllx1h0emt.R.flushNeeded();}}

}
