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
@XmlType(name = "")
@XmlRootElement(name = "rectangle")
public class Rectangle {public static class __CLR4_5_2dw3dw3lx1h3bbr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,18031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    @XmlAttribute(name = "layer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "rot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rot;

    /**
     * Gets the value of the x1 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX1() {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18003);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18004);return x1;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Sets the value of the x1 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX1(String value) {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18005);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18006);this.x1 = value;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Gets the value of the y1 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY1() {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18007);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18008);return y1;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Sets the value of the y1 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY1(String value) {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18009);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18010);this.y1 = value;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Gets the value of the x2 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX2() {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18011);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18012);return x2;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Sets the value of the x2 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX2(String value) {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18013);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18014);this.x2 = value;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Gets the value of the y2 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY2() {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18015);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18016);return y2;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Sets the value of the y2 property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY2(String value) {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18017);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18018);this.y2 = value;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Gets the value of the layer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLayer() {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18019);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18020);return layer;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Sets the value of the layer property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLayer(String value) {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18021);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18022);this.layer = value;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Gets the value of the rot property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRot() {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18023);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18024);if ((((rot == null)&&(__CLR4_5_2dw3dw3lx1h3bbr.R.iget(18025)!=0|true))||(__CLR4_5_2dw3dw3lx1h3bbr.R.iget(18026)==0&false))) {{
            __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18027);return "R0";
        }
        }else {{
            __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18028);return rot;
        }
    }}finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

    /**
     * Sets the value of the rot property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRot(String value) {try{__CLR4_5_2dw3dw3lx1h3bbr.R.inc(18029);
        __CLR4_5_2dw3dw3lx1h3bbr.R.inc(18030);this.rot = value;
    }finally{__CLR4_5_2dw3dw3lx1h3bbr.R.flushNeeded();}}

}
