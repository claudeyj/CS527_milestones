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
@XmlType(name = "", propOrder = {"connects", "technologies"})
@XmlRootElement(name = "device")
public class Device {public static class __CLR4_5_2cy0cy0lx1h1x7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,16796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "package")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String _package;
    protected Connects connects;
    protected Technologies technologies;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16776);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16777);if ((((name == null)&&(__CLR4_5_2cy0cy0lx1h1x7f.R.iget(16778)!=0|true))||(__CLR4_5_2cy0cy0lx1h1x7f.R.iget(16779)==0&false))) {{
            __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16780);return "";
        }
        }else {{
            __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16781);return name;
        }
    }}finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16782);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16783);this.name = value;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Gets the value of the package property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPackage() {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16784);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16785);return _package;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Sets the value of the package property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPackage(String value) {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16786);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16787);this._package = value;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Gets the value of the connects property.
     * 
     * @return possible object is {@link Connects }
     * 
     */
    public Connects getConnects() {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16788);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16789);return connects;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Sets the value of the connects property.
     * 
     * @param value allowed object is {@link Connects }
     * 
     */
    public void setConnects(Connects value) {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16790);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16791);this.connects = value;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Gets the value of the technologies property.
     * 
     * @return possible object is {@link Technologies }
     * 
     */
    public Technologies getTechnologies() {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16792);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16793);return technologies;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

    /**
     * Sets the value of the technologies property.
     * 
     * @param value allowed object is {@link Technologies }
     * 
     */
    public void setTechnologies(Technologies value) {try{__CLR4_5_2cy0cy0lx1h1x7f.R.inc(16794);
        __CLR4_5_2cy0cy0lx1h1x7f.R.inc(16795);this.technologies = value;
    }finally{__CLR4_5_2cy0cy0lx1h1x7f.R.flushNeeded();}}

}
