/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.model.eagle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;

import org.openpnp.model.eagle.xml.Board;
import org.openpnp.model.eagle.xml.Drawing;
import org.openpnp.model.eagle.xml.Eagle;
import org.openpnp.model.eagle.xml.Layers;
import org.openpnp.model.eagle.xml.Library;
import org.openpnp.model.eagle.xml.Package;
import org.openpnp.model.eagle.xml.Packages;
import org.openpnp.model.eagle.xml.Schematic;
import org.openpnp.model.eagle.xml.Smd;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class EagleLoader {public static class __CLR4_5_2cozcozlx1h3ae7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,16492,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String FEATURE_NAMESPACES = "http://xml.org/sax/features/namespaces";
    private static final String FEATURE_NAMESPACE_PREFIXES =
            "http://xml.org/sax/features/namespace-prefixes";
    public Layers layers;
    public Eagle eagle; // TODO remove eagle as this is not strictly required as we peel out the
                        // underlying parts, this is the superset
    public Board board;
    public Library library;
    public Schematic schematic;

    public EagleLoader(File file) throws Exception {
        this(new FileInputStream(file));__CLR4_5_2cozcozlx1h3ae7.R.inc(16452);try{__CLR4_5_2cozcozlx1h3ae7.R.inc(16451);
    }finally{__CLR4_5_2cozcozlx1h3ae7.R.flushNeeded();}}

    public EagleLoader(InputStream in) throws Exception {try{__CLR4_5_2cozcozlx1h3ae7.R.inc(16453);

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16454);String packageName = "org.openpnp.model.eagle.xml";

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16455);JAXBContext ctx = JAXBContext.newInstance(packageName);
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16456);Unmarshaller unmarshaller = ctx.createUnmarshaller();

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16457);XMLReader xmlreader = XMLReaderFactory.createXMLReader();
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16458);xmlreader.setFeature(FEATURE_NAMESPACES, true);
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16459);xmlreader.setFeature(FEATURE_NAMESPACE_PREFIXES, true);
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16460);xmlreader.setEntityResolver(new EntityResolver() {
            public InputSource resolveEntity(String publicId, String systemId)
                    throws SAXException, IOException {try{__CLR4_5_2cozcozlx1h3ae7.R.inc(16461);
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16462);InputSource input =
                        new InputSource(ClassLoader.getSystemResourceAsStream("eagle.dtd"));
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16463);input.setPublicId(publicId);
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16464);input.setSystemId(systemId);
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16465);return input;
            }finally{__CLR4_5_2cozcozlx1h3ae7.R.flushNeeded();}}
        });

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16466);InputSource input = new InputSource(in);
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16467);Source source = new SAXSource(xmlreader, input);

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16468);eagle = (Eagle) unmarshaller.unmarshal(source); // TODO change later to Eagle eagle =
                                                        // (Eagle) unmarshaller.unmarshal(source);
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16469);Drawing drawing = (Drawing) eagle.getCompatibilityOrDrawing().get(0);

        // Now see what we have
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16470);try {
            __CLR4_5_2cozcozlx1h3ae7.R.inc(16471);layers = (Layers) drawing.getLayers();
            // Now we need to extract the details
        }
        catch (Exception e) {
            // There were no Layers in the input file
        }

        // Now see what we have
        __CLR4_5_2cozcozlx1h3ae7.R.inc(16472);try {
            __CLR4_5_2cozcozlx1h3ae7.R.inc(16473);board = (Board) drawing.getLibraryOrSchematicOrBoard().get(0);
            // Now we need to extract the details
        }
        catch (Exception e) {
            // There were no Boards in the input file
        }

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16474);try {
            __CLR4_5_2cozcozlx1h3ae7.R.inc(16475);schematic = (Schematic) drawing.getLibraryOrSchematicOrBoard().get(0);
        }
        catch (Exception e) {
            // There were no Schematics in the input file
        }

        __CLR4_5_2cozcozlx1h3ae7.R.inc(16476);try {
            __CLR4_5_2cozcozlx1h3ae7.R.inc(16477);library = (Library) drawing.getLibraryOrSchematicOrBoard().get(0);

            __CLR4_5_2cozcozlx1h3ae7.R.inc(16478);Packages packages = library.getPackages();

            __CLR4_5_2cozcozlx1h3ae7.R.inc(16479);System.out.println("<openpnp-packages>");

            __CLR4_5_2cozcozlx1h3ae7.R.inc(16480);for (Package pkg : packages.getPackage()) {{
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16481);System.out.println(String.format("<package id=\"%s\" name=\"%s\">", pkg.getName(),
                        pkg.getName()));
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16482);System.out.println(String.format("<footprint units=\"Millimeters\">"));
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16483);for (Object o : pkg
                        .getPolygonOrWireOrTextOrDimensionOrCircleOrRectangleOrFrameOrHoleOrPadOrSmd()) {{
                    __CLR4_5_2cozcozlx1h3ae7.R.inc(16484);if ((((o instanceof Smd)&&(__CLR4_5_2cozcozlx1h3ae7.R.iget(16485)!=0|true))||(__CLR4_5_2cozcozlx1h3ae7.R.iget(16486)==0&false))) {{
                        __CLR4_5_2cozcozlx1h3ae7.R.inc(16487);Smd smd = (Smd) o;
                        __CLR4_5_2cozcozlx1h3ae7.R.inc(16488);System.out.println(
                                String.format("<pad x=\"%s\" y=\"%s\" width=\"%s\" height=\"%s\"/>",
                                        smd.getX(), smd.getY(), smd.getDx(), smd.getDy()));
                    }
                }}
                }__CLR4_5_2cozcozlx1h3ae7.R.inc(16489);System.out.println(String.format("</footprint>"));
                __CLR4_5_2cozcozlx1h3ae7.R.inc(16490);System.out.println("</package>");
            }

            }__CLR4_5_2cozcozlx1h3ae7.R.inc(16491);System.out.println("</openpnp-packages>");
        }
        catch (Exception e) {
            // There were no Libraries in the input file
        }
    }finally{__CLR4_5_2cozcozlx1h3ae7.R.flushNeeded();}}
}
