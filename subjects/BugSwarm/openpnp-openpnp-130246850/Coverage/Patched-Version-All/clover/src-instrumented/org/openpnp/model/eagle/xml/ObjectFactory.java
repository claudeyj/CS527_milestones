/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *///
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.23 at 08:50:01 AM PDT
//


package org.openpnp.model.eagle.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the org.openpnp.model.eagle package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {public static class __CLR4_5_2dihdihlx1h8o1w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,17678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes
     * for package: org.openpnp.model.eagle
     * 
     */
    public ObjectFactory() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17513);}finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Busses }
     * 
     */
    public Busses createBusses() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17514);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17515);return new Busses();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Bus }
     * 
     */
    public Bus createBus() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17516);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17517);return new Bus();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Junction }
     * 
     */
    public Junction createJunction() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17518);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17519);return new Junction();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17520);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17521);return new Symbol();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17522);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17523);return new Description();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17524);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17525);return new Polygon();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Wire }
     * 
     */
    public Wire createWire() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17526);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17527);return new Wire();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17528);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17529);return new Text();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Dimension }
     * 
     */
    public Dimension createDimension() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17530);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17531);return new Dimension();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Pin }
     * 
     */
    public Pin createPin() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17532);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17533);return new Pin();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17534);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17535);return new Circle();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17536);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17537);return new Rectangle();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Frame }
     * 
     */
    public Frame createFrame() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17538);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17539);return new Frame();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17540);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17541);return new Segment();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Instance }
     * 
     */
    public Instance createInstance() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17542);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17543);return new Instance();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17544);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17545);return new Attribute();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Vertex }
     * 
     */
    public Vertex createVertex() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17546);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17547);return new Vertex();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Variantdefs }
     * 
     */
    public Variantdefs createVariantdefs() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17548);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17549);return new Variantdefs();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Variantdef }
     * 
     */
    public Variantdef createVariantdef() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17550);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17551);return new Variantdef();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Via }
     * 
     */
    public Via createVia() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17552);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17553);return new Via();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Setting }
     * 
     */
    public Setting createSetting() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17554);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17555);return new Setting();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Pad }
     * 
     */
    public Pad createPad() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17556);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17557);return new Pad();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Approved }
     * 
     */
    public Approved createApproved() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17558);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17559);return new Approved();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Connects }
     * 
     */
    public Connects createConnects() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17560);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17561);return new Connects();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Connect }
     * 
     */
    public Connect createConnect() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17562);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17563);return new Connect();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Plain }
     * 
     */
    public Plain createPlain() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17564);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17565);return new Plain();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Hole }
     * 
     */
    public Hole createHole() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17566);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17567);return new Hole();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Pinref }
     * 
     */
    public Pinref createPinref() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17568);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17569);return new Pinref();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Portref }
     * 
     */
    public Portref createPortref() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17570);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17571);return new Portref();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17572);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17573);return new Label();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Drawing }
     * 
     */
    public Drawing createDrawing() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17574);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17575);return new Drawing();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17576);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17577);return new Settings();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Grid }
     * 
     */
    public Grid createGrid() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17578);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17579);return new Grid();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Layers }
     * 
     */
    public Layers createLayers() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17580);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17581);return new Layers();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17582);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17583);return new Library();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Schematic }
     * 
     */
    public Schematic createSchematic() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17584);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17585);return new Schematic();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Board }
     * 
     */
    public Board createBoard() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17586);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17587);return new Board();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Layer }
     * 
     */
    public Layer createLayer() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17588);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17589);return new Layer();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Variant }
     * 
     */
    public Variant createVariant() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17590);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17591);return new Variant();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Moduleinst }
     * 
     */
    public Moduleinst createModuleinst() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17592);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17593);return new Moduleinst();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Net }
     * 
     */
    public Net createNet() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17594);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17595);return new Net();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Signal }
     * 
     */
    public Signal createSignal() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17596);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17597);return new Signal();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Contactref }
     * 
     */
    public Contactref createContactref() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17598);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17599);return new Contactref();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17600);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17601);return new Element();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17602);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17603);return new Package();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Smd }
     * 
     */
    public Smd createSmd() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17604);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17605);return new Smd();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Devices }
     * 
     */
    public Devices createDevices() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17606);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17607);return new Devices();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17608);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17609);return new Device();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Pass }
     * 
     */
    public Pass createPass() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17610);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17611);return new Pass();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17612);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17613);return new Param();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Module }
     * 
     */
    public Module createModule() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17614);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17615);return new Module();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Ports }
     * 
     */
    public Ports createPorts() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17616);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17617);return new Ports();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Parts }
     * 
     */
    public Parts createParts() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17618);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17619);return new Parts();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Sheets }
     * 
     */
    public Sheets createSheets() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17620);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17621);return new Sheets();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Libraries }
     * 
     */
    public Libraries createLibraries() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17622);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17623);return new Libraries();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17624);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17625);return new Attributes();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Classes }
     * 
     */
    public Classes createClasses() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17626);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17627);return new Classes();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Modules }
     * 
     */
    public Modules createModules() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17628);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17629);return new Modules();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17630);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17631);return new Errors();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Packages }
     * 
     */
    public Packages createPackages() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17632);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17633);return new Packages();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Technologies }
     * 
     */
    public Technologies createTechnologies() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17634);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17635);return new Technologies();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Technology }
     * 
     */
    public Technology createTechnology() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17636);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17637);return new Technology();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Signals }
     * 
     */
    public Signals createSignals() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17638);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17639);return new Signals();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Port }
     * 
     */
    public Port createPort() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17640);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17641);return new Port();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Eagle }
     * 
     */
    public Eagle createEagle() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17642);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17643);return new Eagle();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Compatibility }
     * 
     */
    public Compatibility createCompatibility() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17644);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17645);return new Compatibility();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Part }
     * 
     */
    public Part createPart() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17646);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17647);return new Part();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Devicesets }
     * 
     */
    public Devicesets createDevicesets() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17648);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17649);return new Devicesets();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Deviceset }
     * 
     */
    public Deviceset createDeviceset() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17650);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17651);return new Deviceset();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17652);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17653);return new Note();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Designrules }
     * 
     */
    public Designrules createDesignrules() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17654);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17655);return new Designrules();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Instances }
     * 
     */
    public Instances createInstances() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17656);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17657);return new Instances();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Nets }
     * 
     */
    public Nets createNets() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17658);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17659);return new Nets();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Class }
     * 
     */
    public Class createClass() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17660);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17661);return new Class();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Gates }
     * 
     */
    public Gates createGates() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17662);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17663);return new Gates();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Symbols }
     * 
     */
    public Symbols createSymbols() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17664);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17665);return new Symbols();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Gate }
     * 
     */
    public Gate createGate() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17666);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17667);return new Gate();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Sheet }
     * 
     */
    public Sheet createSheet() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17668);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17669);return new Sheet();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Moduleinsts }
     * 
     */
    public Moduleinsts createModuleinsts() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17670);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17671);return new Moduleinsts();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Clearance }
     * 
     */
    public Clearance createClearance() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17672);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17673);return new Clearance();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Autorouter }
     * 
     */
    public Autorouter createAutorouter() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17674);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17675);return new Autorouter();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

    /**
     * Create an instance of {@link Elements }
     * 
     */
    public Elements createElements() {try{__CLR4_5_2dihdihlx1h8o1w.R.inc(17676);
        __CLR4_5_2dihdihlx1h8o1w.R.inc(17677);return new Elements();
    }finally{__CLR4_5_2dihdihlx1h8o1w.R.flushNeeded();}}

}
