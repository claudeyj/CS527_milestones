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
@XmlRootElement(name = "pin")
public class Pin {public static class __CLR4_5_2drhdrhlx1h0enq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,17897,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "visible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visible;
    @XmlAttribute(name = "length")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String length;
    @XmlAttribute(name = "direction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;
    @XmlAttribute(name = "function")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String function;
    @XmlAttribute(name = "swaplevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String swaplevel;
    @XmlAttribute(name = "rot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rot;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17837);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17838);return name;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17839);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17840);this.name = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the x property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getX() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17841);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17842);return x;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the x property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setX(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17843);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17844);this.x = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the y property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getY() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17845);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17846);return y;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the y property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setY(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17847);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17848);this.y = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the visible property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVisible() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17849);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17850);if ((((visible == null)&&(__CLR4_5_2drhdrhlx1h0enq.R.iget(17851)!=0|true))||(__CLR4_5_2drhdrhlx1h0enq.R.iget(17852)==0&false))) {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17853);return "both";
        }
        }else {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17854);return visible;
        }
    }}finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the visible property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setVisible(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17855);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17856);this.visible = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the length property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLength() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17857);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17858);if ((((length == null)&&(__CLR4_5_2drhdrhlx1h0enq.R.iget(17859)!=0|true))||(__CLR4_5_2drhdrhlx1h0enq.R.iget(17860)==0&false))) {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17861);return "long";
        }
        }else {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17862);return length;
        }
    }}finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the length property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLength(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17863);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17864);this.length = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the direction property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDirection() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17865);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17866);if ((((direction == null)&&(__CLR4_5_2drhdrhlx1h0enq.R.iget(17867)!=0|true))||(__CLR4_5_2drhdrhlx1h0enq.R.iget(17868)==0&false))) {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17869);return "io";
        }
        }else {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17870);return direction;
        }
    }}finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the direction property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDirection(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17871);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17872);this.direction = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the function property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFunction() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17873);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17874);if ((((function == null)&&(__CLR4_5_2drhdrhlx1h0enq.R.iget(17875)!=0|true))||(__CLR4_5_2drhdrhlx1h0enq.R.iget(17876)==0&false))) {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17877);return "none";
        }
        }else {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17878);return function;
        }
    }}finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the function property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFunction(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17879);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17880);this.function = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the swaplevel property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSwaplevel() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17881);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17882);if ((((swaplevel == null)&&(__CLR4_5_2drhdrhlx1h0enq.R.iget(17883)!=0|true))||(__CLR4_5_2drhdrhlx1h0enq.R.iget(17884)==0&false))) {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17885);return "0";
        }
        }else {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17886);return swaplevel;
        }
    }}finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the swaplevel property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSwaplevel(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17887);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17888);this.swaplevel = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Gets the value of the rot property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRot() {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17889);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17890);if ((((rot == null)&&(__CLR4_5_2drhdrhlx1h0enq.R.iget(17891)!=0|true))||(__CLR4_5_2drhdrhlx1h0enq.R.iget(17892)==0&false))) {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17893);return "R0";
        }
        }else {{
            __CLR4_5_2drhdrhlx1h0enq.R.inc(17894);return rot;
        }
    }}finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

    /**
     * Sets the value of the rot property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRot(String value) {try{__CLR4_5_2drhdrhlx1h0enq.R.inc(17895);
        __CLR4_5_2drhdrhlx1h0enq.R.inc(17896);this.rot = value;
    }finally{__CLR4_5_2drhdrhlx1h0enq.R.flushNeeded();}}

}
