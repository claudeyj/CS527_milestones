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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
        propOrder = {"description", "plain", "moduleinsts", "instances", "busses", "nets"})
@XmlRootElement(name = "sheet")
public class Sheet {public static class __CLR4_5_2dyrdyrlx1h3bcl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,18123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Description description;
    protected Plain plain;
    protected Moduleinsts moduleinsts;
    protected Instances instances;
    protected Busses busses;
    protected Nets nets;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18099);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18100);return description;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18101);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18102);this.description = value;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Gets the value of the plain property.
     * 
     * @return possible object is {@link Plain }
     * 
     */
    public Plain getPlain() {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18103);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18104);return plain;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Sets the value of the plain property.
     * 
     * @param value allowed object is {@link Plain }
     * 
     */
    public void setPlain(Plain value) {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18105);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18106);this.plain = value;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Gets the value of the moduleinsts property.
     * 
     * @return possible object is {@link Moduleinsts }
     * 
     */
    public Moduleinsts getModuleinsts() {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18107);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18108);return moduleinsts;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Sets the value of the moduleinsts property.
     * 
     * @param value allowed object is {@link Moduleinsts }
     * 
     */
    public void setModuleinsts(Moduleinsts value) {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18109);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18110);this.moduleinsts = value;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Gets the value of the instances property.
     * 
     * @return possible object is {@link Instances }
     * 
     */
    public Instances getInstances() {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18111);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18112);return instances;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Sets the value of the instances property.
     * 
     * @param value allowed object is {@link Instances }
     * 
     */
    public void setInstances(Instances value) {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18113);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18114);this.instances = value;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Gets the value of the busses property.
     * 
     * @return possible object is {@link Busses }
     * 
     */
    public Busses getBusses() {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18115);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18116);return busses;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Sets the value of the busses property.
     * 
     * @param value allowed object is {@link Busses }
     * 
     */
    public void setBusses(Busses value) {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18117);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18118);this.busses = value;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Gets the value of the nets property.
     * 
     * @return possible object is {@link Nets }
     * 
     */
    public Nets getNets() {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18119);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18120);return nets;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

    /**
     * Sets the value of the nets property.
     * 
     * @param value allowed object is {@link Nets }
     * 
     */
    public void setNets(Nets value) {try{__CLR4_5_2dyrdyrlx1h3bcl.R.inc(18121);
        __CLR4_5_2dyrdyrlx1h3bcl.R.inc(18122);this.nets = value;
    }finally{__CLR4_5_2dyrdyrlx1h3bcl.R.flushNeeded();}}

}
