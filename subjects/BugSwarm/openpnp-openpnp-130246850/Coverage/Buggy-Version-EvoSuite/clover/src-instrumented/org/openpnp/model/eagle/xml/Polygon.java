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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"vertex"})
@XmlRootElement(name = "polygon")
public class Polygon {public static class __CLR4_5_2dtndtnlx1h0eo7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,17969,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "layer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "spacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String spacing;
    @XmlAttribute(name = "pour")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pour;
    @XmlAttribute(name = "isolate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isolate;
    @XmlAttribute(name = "orphans")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orphans;
    @XmlAttribute(name = "thermals")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String thermals;
    @XmlAttribute(name = "rank")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rank;
    protected List<Vertex> vertex;

    /**
     * Gets the value of the width property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWidth() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17915);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17916);return width;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the width property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setWidth(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17917);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17918);this.width = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the layer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLayer() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17919);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17920);return layer;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the layer property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLayer(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17921);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17922);this.layer = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the spacing property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSpacing() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17923);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17924);return spacing;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the spacing property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSpacing(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17925);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17926);this.spacing = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the pour property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPour() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17927);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17928);if ((((pour == null)&&(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17929)!=0|true))||(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17930)==0&false))) {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17931);return "solid";
        }
        }else {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17932);return pour;
        }
    }}finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the pour property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPour(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17933);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17934);this.pour = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the isolate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIsolate() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17935);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17936);return isolate;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the isolate property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIsolate(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17937);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17938);this.isolate = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the orphans property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrphans() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17939);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17940);if ((((orphans == null)&&(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17941)!=0|true))||(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17942)==0&false))) {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17943);return "no";
        }
        }else {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17944);return orphans;
        }
    }}finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the orphans property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOrphans(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17945);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17946);this.orphans = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the thermals property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getThermals() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17947);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17948);if ((((thermals == null)&&(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17949)!=0|true))||(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17950)==0&false))) {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17951);return "yes";
        }
        }else {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17952);return thermals;
        }
    }}finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the thermals property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setThermals(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17953);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17954);this.thermals = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the rank property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRank() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17955);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17956);if ((((rank == null)&&(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17957)!=0|true))||(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17958)==0&false))) {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17959);return "0";
        }
        }else {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17960);return rank;
        }
    }}finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Sets the value of the rank property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRank(String value) {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17961);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17962);this.rank = value;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

    /**
     * Gets the value of the vertex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the vertex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVertex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Vertex }
     * 
     * 
     */
    public List<Vertex> getVertex() {try{__CLR4_5_2dtndtnlx1h0eo7.R.inc(17963);
        __CLR4_5_2dtndtnlx1h0eo7.R.inc(17964);if ((((vertex == null)&&(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17965)!=0|true))||(__CLR4_5_2dtndtnlx1h0eo7.R.iget(17966)==0&false))) {{
            __CLR4_5_2dtndtnlx1h0eo7.R.inc(17967);vertex = new ArrayList<>();
        }
        }__CLR4_5_2dtndtnlx1h0eo7.R.inc(17968);return this.vertex;
    }finally{__CLR4_5_2dtndtnlx1h0eo7.R.flushNeeded();}}

}