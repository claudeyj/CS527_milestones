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
@XmlType(name = "", propOrder = {"description", "plain", "libraries", "attributes", "variantdefs",
        "classes", "designrules", "autorouter", "elements", "signals", "errors"})
@XmlRootElement(name = "board")
public class Board {public static class __CLR4_5_2cs4cs4lx1h1x5w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,16608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Description description;
    protected Plain plain;
    protected Libraries libraries;
    protected Attributes attributes;
    protected Variantdefs variantdefs;
    protected Classes classes;
    protected Designrules designrules;
    protected Autorouter autorouter;
    protected Elements elements;
    protected Signals signals;
    protected Errors errors;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16564);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16565);return description;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16566);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16567);this.description = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the plain property.
     * 
     * @return possible object is {@link Plain }
     * 
     */
    public Plain getPlain() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16568);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16569);return plain;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the plain property.
     * 
     * @param value allowed object is {@link Plain }
     * 
     */
    public void setPlain(Plain value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16570);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16571);this.plain = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the libraries property.
     * 
     * @return possible object is {@link Libraries }
     * 
     */
    public Libraries getLibraries() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16572);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16573);return libraries;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the libraries property.
     * 
     * @param value allowed object is {@link Libraries }
     * 
     */
    public void setLibraries(Libraries value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16574);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16575);this.libraries = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the attributes property.
     * 
     * @return possible object is {@link Attributes }
     * 
     */
    public Attributes getAttributes() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16576);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16577);return attributes;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the attributes property.
     * 
     * @param value allowed object is {@link Attributes }
     * 
     */
    public void setAttributes(Attributes value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16578);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16579);this.attributes = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the variantdefs property.
     * 
     * @return possible object is {@link Variantdefs }
     * 
     */
    public Variantdefs getVariantdefs() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16580);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16581);return variantdefs;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the variantdefs property.
     * 
     * @param value allowed object is {@link Variantdefs }
     * 
     */
    public void setVariantdefs(Variantdefs value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16582);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16583);this.variantdefs = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the classes property.
     * 
     * @return possible object is {@link Classes }
     * 
     */
    public Classes getClasses() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16584);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16585);return classes;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the classes property.
     * 
     * @param value allowed object is {@link Classes }
     * 
     */
    public void setClasses(Classes value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16586);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16587);this.classes = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the designrules property.
     * 
     * @return possible object is {@link Designrules }
     * 
     */
    public Designrules getDesignrules() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16588);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16589);return designrules;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the designrules property.
     * 
     * @param value allowed object is {@link Designrules }
     * 
     */
    public void setDesignrules(Designrules value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16590);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16591);this.designrules = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the autorouter property.
     * 
     * @return possible object is {@link Autorouter }
     * 
     */
    public Autorouter getAutorouter() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16592);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16593);return autorouter;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the autorouter property.
     * 
     * @param value allowed object is {@link Autorouter }
     * 
     */
    public void setAutorouter(Autorouter value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16594);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16595);this.autorouter = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the elements property.
     * 
     * @return possible object is {@link Elements }
     * 
     */
    public Elements getElements() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16596);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16597);return elements;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the elements property.
     * 
     * @param value allowed object is {@link Elements }
     * 
     */
    public void setElements(Elements value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16598);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16599);this.elements = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the signals property.
     * 
     * @return possible object is {@link Signals }
     * 
     */
    public Signals getSignals() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16600);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16601);return signals;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the signals property.
     * 
     * @param value allowed object is {@link Signals }
     * 
     */
    public void setSignals(Signals value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16602);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16603);this.signals = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Gets the value of the errors property.
     * 
     * @return possible object is {@link Errors }
     * 
     */
    public Errors getErrors() {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16604);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16605);return errors;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

    /**
     * Sets the value of the errors property.
     * 
     * @param value allowed object is {@link Errors }
     * 
     */
    public void setErrors(Errors value) {try{__CLR4_5_2cs4cs4lx1h1x5w.R.inc(16606);
        __CLR4_5_2cs4cs4lx1h1x5w.R.inc(16607);this.errors = value;
    }finally{__CLR4_5_2cs4cs4lx1h1x5w.R.flushNeeded();}}

}
