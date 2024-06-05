/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.importer.rs274x;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openpnp.model.BoardPad;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Pad;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple RS-274X parser. Not intended to be a general parser, but implements only OpenPnP
 * specific functionality.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Rs274xParser {public static class __CLR4_5_251k51klx1h5ms9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,7284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(Rs274xParser.class);

    enum LevelPolarity {
        Dark, Clear
    }

    enum InterpolationMode {
        Linear, Clockwise, CounterClockwise
    }

    private BufferedReader reader;

    // Context
    private LengthUnit unit;
    private Aperture currentAperture;
    private Point2D.Double currentPoint;
    private LevelPolarity levelPolarity;
    private InterpolationMode interpolationMode;
    private boolean multiQuadrantMode;
    private boolean regionMode;
    private int coordinateFormatIntegerLength;
    private int coordinateFormatDecimalLength;
    private boolean coordinateFormatTrailingZeroOmission;
    private boolean coordinateFormatIncremental;
    private Map<Integer, Aperture> apertures = new HashMap<>();
    /**
     * Maps Aperture indexes to a count to aid in generation of pad names.
     */
    private Map<Integer, Integer> apertureUseCounts = new HashMap<>();

    private boolean stopped;
    private int lineNumber;
    private ParseStatistics parseStatistics;
    private boolean regionStarted;

    private List<BoardPad> pads;

    public Rs274xParser() {try{__CLR4_5_251k51klx1h5ms9.R.inc(6536);
        __CLR4_5_251k51klx1h5ms9.R.inc(6537);reset();
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Parse the given File for solder paste pads.
     * 
     * @see #parseSolderPastePads(Reader)
     * @param file
     * @return
     * @throws Exception
     */
    public List<BoardPad> parseSolderPastePads(File file) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6538);
        __CLR4_5_251k51klx1h5ms9.R.inc(6539);logger.info("Parsing " + file);
        __CLR4_5_251k51klx1h5ms9.R.inc(6540);return parseSolderPastePads(new FileReader(file));
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Parse the input from the Reader extracting individual pads to be used for solder paste
     * application. It is expected that the input is is an RS-274X Gerber solder paste layer.
     * 
     * Currently this code only parses out single flashes of rectangular, circular and oblong
     * apertures. Ideas for future versions include rendering the entire file and uses blob
     * detection and contour finding to create polygon pads.
     * 
     * Another option is to consider each operation it's own element/shape. This is how gerbv seems
     * to do it.
     * 
     * @param reader
     * @return
     * @throws Exception
     */
    public List<BoardPad> parseSolderPastePads(Reader reader) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6541);
        __CLR4_5_251k51klx1h5ms9.R.inc(6542);reset();

        __CLR4_5_251k51klx1h5ms9.R.inc(6543);this.reader = new BufferedReader(reader);

        __CLR4_5_251k51klx1h5ms9.R.inc(6544);try {
            __CLR4_5_251k51klx1h5ms9.R.inc(6545);while ((((!stopped)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6546)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6547)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(6548);readCommand();
            }
        }}
        catch (Exception e) {
            __CLR4_5_251k51klx1h5ms9.R.inc(6549);parseStatistics.errored = true;
            __CLR4_5_251k51klx1h5ms9.R.inc(6550);error("Uncaught error: " + e.getMessage());
        }

        __CLR4_5_251k51klx1h5ms9.R.inc(6551);return pads;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readCommand() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6552);
        __CLR4_5_251k51klx1h5ms9.R.inc(6553);if ((((peek() == '%')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6554)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6555)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6556);readExtendedCodeCommand();
        }
        }else {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6557);readFunctionCodeCommand();
        }
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readFunctionCodeCommand() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6558);
        // a command is either a D, G, M or coordinate data
        // followed by a D.
        // X, Y
        // TODO: Make sure this becomes the current point.
        __CLR4_5_251k51klx1h5ms9.R.inc(6559);Point2D.Double coordinate = new Point2D.Double(currentPoint.getX(), currentPoint.getY());
        // I, J
        __CLR4_5_251k51klx1h5ms9.R.inc(6560);Point2D.Double arcCoordinate = new Point2D.Double(0, 0);
        __CLR4_5_251k51klx1h5ms9.R.inc(6561);while ((((!stopped)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6562)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6563)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6564);int ch = read();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_251k51klx1h5ms9.R.inc(6565);switch (ch) {
                case '*':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6566);__CLB4_5_2_bool0=true;} {
                    // Empty block or end of block that was not terminated
                    // from a previous read.
                    __CLR4_5_251k51klx1h5ms9.R.inc(6567);return;
                }
                case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6568);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6569);readDcode(coordinate, arcCoordinate);
                    __CLR4_5_251k51klx1h5ms9.R.inc(6570);return;
                }
                case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6571);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6572);readGcode();
                    __CLR4_5_251k51klx1h5ms9.R.inc(6573);return;
                }
                case 'M':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6574);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6575);readMcode();
                    __CLR4_5_251k51klx1h5ms9.R.inc(6576);return;
                }
                    // TODO: See 7.2 Coordinate Data without Operation Code
                case 'X':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6577);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6578);coordinate.x = readCoordinateValue();
                    __CLR4_5_251k51klx1h5ms9.R.inc(6579);break;
                }
                case 'Y':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6580);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6581);coordinate.y = readCoordinateValue();
                    __CLR4_5_251k51klx1h5ms9.R.inc(6582);break;
                }
                case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6583);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6584);arcCoordinate.x = readCoordinateValue();
                    __CLR4_5_251k51klx1h5ms9.R.inc(6585);break;
                }
                case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6586);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6587);arcCoordinate.y = readCoordinateValue();
                    __CLR4_5_251k51klx1h5ms9.R.inc(6588);break;
                }
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_251k51klx1h5ms9.R.inc(6589);__CLB4_5_2_bool0=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6590);error("Unknown function code " + ((char) ch));
                }
            }
        }
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    // G54D06
    private void readGcode() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6591);
        __CLR4_5_251k51klx1h5ms9.R.inc(6592);int code = readInteger();
        boolean __CLB4_5_2_bool1=false;__CLR4_5_251k51klx1h5ms9.R.inc(6593);switch (code) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6594);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6595);interpolationMode = InterpolationMode.Linear;
                __CLR4_5_251k51klx1h5ms9.R.inc(6596);break;
            }
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6597);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6598);interpolationMode = InterpolationMode.Clockwise;
                __CLR4_5_251k51klx1h5ms9.R.inc(6599);break;
            }
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6600);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6601);interpolationMode = InterpolationMode.CounterClockwise;
                __CLR4_5_251k51klx1h5ms9.R.inc(6602);break;
            }
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6603);__CLB4_5_2_bool1=true;} {
                // comment, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6604);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6605);break;
            }
            case 36:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6606);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6607);enableRegionMode();
                __CLR4_5_251k51klx1h5ms9.R.inc(6608);break;
            }
            case 37:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6609);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6610);disableRegionMode();
                __CLR4_5_251k51klx1h5ms9.R.inc(6611);break;
            }
            case 54:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6612);__CLB4_5_2_bool1=true;} {
                // deprecated, prepare to select aperture
                __CLR4_5_251k51klx1h5ms9.R.inc(6613);break;
            }
            case 55:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6614);__CLB4_5_2_bool1=true;} {
                // deprecated, prepare for flash
                __CLR4_5_251k51klx1h5ms9.R.inc(6615);break;
            }
            case 70:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6616);__CLB4_5_2_bool1=true;} {
                // deprecated, unit inch
                __CLR4_5_251k51klx1h5ms9.R.inc(6617);unit = LengthUnit.Inches;
                __CLR4_5_251k51klx1h5ms9.R.inc(6618);break;
            }
            case 71:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6619);__CLB4_5_2_bool1=true;} {
                // deprecated, unit mm
                __CLR4_5_251k51klx1h5ms9.R.inc(6620);unit = LengthUnit.Millimeters;
                __CLR4_5_251k51klx1h5ms9.R.inc(6621);break;
            }
            case 74:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6622);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6623);multiQuadrantMode = false;
                __CLR4_5_251k51klx1h5ms9.R.inc(6624);break;
            }
            case 75:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6625);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6626);multiQuadrantMode = true;
                __CLR4_5_251k51klx1h5ms9.R.inc(6627);break;
            }
            case 90:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6628);__CLB4_5_2_bool1=true;} {
                // deprecated, absolute coordinate mode
                __CLR4_5_251k51klx1h5ms9.R.inc(6629);coordinateFormatIncremental = false;
                __CLR4_5_251k51klx1h5ms9.R.inc(6630);break;
            }
            case 91:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6631);__CLB4_5_2_bool1=true;} {
                // deprecated, incremental coordinate mode
                __CLR4_5_251k51klx1h5ms9.R.inc(6632);coordinateFormatIncremental = true;
                __CLR4_5_251k51klx1h5ms9.R.inc(6633);break;
            }
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_251k51klx1h5ms9.R.inc(6634);__CLB4_5_2_bool1=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6635);warn("Unknown G code " + code);
            }
        }
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readDcode(Point2D.Double coordinate, Point2D.Double arcCoordinate)
            throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6636);
        __CLR4_5_251k51klx1h5ms9.R.inc(6637);int code = readInteger();
        boolean __CLB4_5_2_bool2=false;__CLR4_5_251k51klx1h5ms9.R.inc(6638);switch (code) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_251k51klx1h5ms9.R.inc(6639);__CLB4_5_2_bool2=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6640);performD01(coordinate, arcCoordinate);
                __CLR4_5_251k51klx1h5ms9.R.inc(6641);break;
            }
            case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_251k51klx1h5ms9.R.inc(6642);__CLB4_5_2_bool2=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6643);performD02(coordinate);
                __CLR4_5_251k51klx1h5ms9.R.inc(6644);break;
            }
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_251k51klx1h5ms9.R.inc(6645);__CLB4_5_2_bool2=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6646);performD03(coordinate);
                __CLR4_5_251k51klx1h5ms9.R.inc(6647);break;
            }
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_251k51klx1h5ms9.R.inc(6648);__CLB4_5_2_bool2=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6649);if ((((code < 10)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6650)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6651)==0&false))) {{
                    __CLR4_5_251k51klx1h5ms9.R.inc(6652);error("Unknown reserved D code " + code);
                }
                // anything else is an aperture code, so look up the aperture
                // and set it as the current
                }__CLR4_5_251k51klx1h5ms9.R.inc(6653);currentAperture = apertures.get(code);
                __CLR4_5_251k51klx1h5ms9.R.inc(6654);if ((((currentAperture == null)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6655)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6656)==0&false))) {{
                    __CLR4_5_251k51klx1h5ms9.R.inc(6657);warn("Unknown aperture " + code);
                }
            }}
        }
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readMcode() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6658);
        __CLR4_5_251k51klx1h5ms9.R.inc(6659);int code = readInteger();
        boolean __CLB4_5_2_bool3=false;__CLR4_5_251k51klx1h5ms9.R.inc(6660);switch (code) {
            case 0:if (!__CLB4_5_2_bool3) {__CLR4_5_251k51klx1h5ms9.R.inc(6661);__CLB4_5_2_bool3=true;} {
                // deprecated version of stop command
                __CLR4_5_251k51klx1h5ms9.R.inc(6662);stopped = true;
                __CLR4_5_251k51klx1h5ms9.R.inc(6663);break;
            }
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_251k51klx1h5ms9.R.inc(6664);__CLB4_5_2_bool3=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6665);stopped = true;
                __CLR4_5_251k51klx1h5ms9.R.inc(6666);break;
            }
            case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_251k51klx1h5ms9.R.inc(6667);__CLB4_5_2_bool3=true;} {
                // deprecated, does nothing
                __CLR4_5_251k51klx1h5ms9.R.inc(6668);break;
            }
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_251k51klx1h5ms9.R.inc(6669);__CLB4_5_2_bool3=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6670);warn("Unknown M code " + code);
            }
        }
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Linear or circular interpolation. If in region mode, add a line or arc to the current
     * contour. Otherwise draw a line or arc.
     * 
     * @param coordinate
     * @param arcCoordinate
     * @throws Exception
     */
    private void performD01(Point2D.Double coordinate, Point2D.Double arcCoordinate)
            throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6671);
        __CLR4_5_251k51klx1h5ms9.R.inc(6672);if ((((interpolationMode == null)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6673)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6674)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6675);error("Interpolation most must be set before using D02");
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6676);if ((((regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6677)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6678)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6679);if ((((interpolationMode == InterpolationMode.Linear)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6680)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6681)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(6682);addRegionLine(coordinate);
            }
            }else {{
                __CLR4_5_251k51klx1h5ms9.R.inc(6683);addRegionArc(coordinate, arcCoordinate);
            }
        }}
        }else {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6684);if ((((interpolationMode == InterpolationMode.Linear)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6685)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6686)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(6687);parseStatistics.lineCount++;
                __CLR4_5_251k51klx1h5ms9.R.inc(6688);warn("Linear interpolation not yet supported");
            }
            }else {{
                __CLR4_5_251k51klx1h5ms9.R.inc(6689);parseStatistics.arcCount++;
                __CLR4_5_251k51klx1h5ms9.R.inc(6690);warn("Circular interpolation not yet supported");
            }
        }}
        }__CLR4_5_251k51klx1h5ms9.R.inc(6691);currentPoint = coordinate;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Move / set the current coordinate. Additionally, in region mode end the current contour.
     * 
     * @param coordinate
     * @throws Exception
     */
    private void performD02(Point2D.Double coordinate) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6692);
        __CLR4_5_251k51klx1h5ms9.R.inc(6693);if ((((interpolationMode == null)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6694)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6695)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6696);error("Interpolation mode must be set before using D02");
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6697);if ((((regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6698)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6699)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6700);closeRegion();
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6701);currentPoint = coordinate;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Flash the current aperture at the given coordinate.
     * 
     * @param coordinate
     * @throws Exception
     */
    private void performD03(Point2D.Double coordinate) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6702);
        __CLR4_5_251k51klx1h5ms9.R.inc(6703);if ((((currentAperture == null)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6704)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6705)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6706);error("Can't flash, no current aperture");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6707);if ((((regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6708)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6709)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6710);error("Can't flash in region mode");
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6711);parseStatistics.flashCount++;

        __CLR4_5_251k51klx1h5ms9.R.inc(6712);Integer counter = apertureUseCounts.get(currentAperture.getIndex());
        __CLR4_5_251k51klx1h5ms9.R.inc(6713);if ((((counter == null)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6714)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6715)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6716);counter = 0;
        }
        }else {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6717);counter++;
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6718);apertureUseCounts.put(currentAperture.getIndex(), counter);

        __CLR4_5_251k51klx1h5ms9.R.inc(6719);BoardPad pad = currentAperture.createPad(unit, coordinate);
        __CLR4_5_251k51klx1h5ms9.R.inc(6720);pad.setName(String.format("D%02d-%03d", currentAperture.getIndex(), counter++));
        __CLR4_5_251k51klx1h5ms9.R.inc(6721);pads.add(pad);
        __CLR4_5_251k51klx1h5ms9.R.inc(6722);parseStatistics.padCount++;

        __CLR4_5_251k51klx1h5ms9.R.inc(6723);currentPoint = coordinate;

        __CLR4_5_251k51klx1h5ms9.R.inc(6724);parseStatistics.flashPerformedCount++;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void enableRegionMode() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6725);
        __CLR4_5_251k51klx1h5ms9.R.inc(6726);if ((((regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6727)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6728)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6729);error("Can't start region mode when already in region mode");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6730);regionMode = true;
        __CLR4_5_251k51klx1h5ms9.R.inc(6731);regionStarted = false;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void addRegionLine(Point2D.Double coordinate) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6732);
        __CLR4_5_251k51klx1h5ms9.R.inc(6733);if ((((!regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6734)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6735)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6736);error("Can't add region line outside of region mode");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6737);if ((((!regionStarted)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6738)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6739)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6740);regionStarted = true;
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6741);parseStatistics.regionLineCount++;
        __CLR4_5_251k51klx1h5ms9.R.inc(6742);warn("Linear interpolation in region mode not yet supported");
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void addRegionArc(Point2D.Double coordinate, Point2D.Double arcCoordinate)
            throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6743);
        __CLR4_5_251k51klx1h5ms9.R.inc(6744);if ((((!regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6745)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6746)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6747);error("Can't add region arc outside of region mode");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6748);if ((((!regionStarted)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6749)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6750)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6751);regionStarted = true;
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6752);parseStatistics.regionArcCount++;
        __CLR4_5_251k51klx1h5ms9.R.inc(6753);warn("Circular interpolation in region mode not yet supported");
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void closeRegion() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6754);
        __CLR4_5_251k51klx1h5ms9.R.inc(6755);if ((((!regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6756)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6757)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6758);error("Can't end region when not in region mode");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6759);if ((((regionStarted)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6760)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6761)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6762);regionStarted = false;
            __CLR4_5_251k51klx1h5ms9.R.inc(6763);parseStatistics.regionCount++;
        }
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void disableRegionMode() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6764);
        __CLR4_5_251k51klx1h5ms9.R.inc(6765);if ((((!regionMode)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6766)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6767)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6768);error("Can't exit region mode, not in region mode");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6769);closeRegion();
        __CLR4_5_251k51klx1h5ms9.R.inc(6770);regionMode = false;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readExtendedCodeCommand() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6771);
        __CLR4_5_251k51klx1h5ms9.R.inc(6772);if ((((read() != '%')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6773)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6774)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6775);error("Expected start of extended code command");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6776);String code = "" + ((char) read()) + ((char) read());
        boolean __CLB4_5_2_bool4=false;__CLR4_5_251k51klx1h5ms9.R.inc(6777);switch (code) {
            case "FS":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6778);__CLB4_5_2_bool4=true;} {
                // Sets the \u2018Coordinate format\u2019 graphics state parameter. See 4.9.
                // These commands are mandatory and must be used only once, in the header of a file.
                // Example: FSLAX24Y24
                __CLR4_5_251k51klx1h5ms9.R.inc(6779);readCoordinateFormat();
                __CLR4_5_251k51klx1h5ms9.R.inc(6780);break;
            }
            case "MO":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6781);__CLB4_5_2_bool4=true;} {
                // Sets the \u2018Unit\u2019 graphics state parameter. See 4.10.
                __CLR4_5_251k51klx1h5ms9.R.inc(6782);readUnit();
                __CLR4_5_251k51klx1h5ms9.R.inc(6783);break;
            }
            case "AD":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6784);__CLB4_5_2_bool4=true;} {
                // Assigns a D code number to an aperture definition. See 4.11.
                // These commands can be used multiple times. It is recommended to put them in
                // header of a file.
                __CLR4_5_251k51klx1h5ms9.R.inc(6785);readApertureDefinition();
                __CLR4_5_251k51klx1h5ms9.R.inc(6786);break;
            }
            case "AM":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6787);__CLB4_5_2_bool4=true;} {
                // Defines macro apertures which can be referenced from the AD command. See 4.12.
                // TODO: We just ignore them for now.
                __CLR4_5_251k51klx1h5ms9.R.inc(6788);while ((((peek() != '%')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6789)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6790)==0&false))) {{
                    __CLR4_5_251k51klx1h5ms9.R.inc(6791);readUntil('*');
                    __CLR4_5_251k51klx1h5ms9.R.inc(6792);read();
                }
                }__CLR4_5_251k51klx1h5ms9.R.inc(6793);break;
            }
            case "SR":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6794);__CLB4_5_2_bool4=true;} {
                // Sets the \u2018Step and Repeat\u2019 graphics state parameter. See 4.13.
                // These commands can be used multiple times over the whole file.
                __CLR4_5_251k51klx1h5ms9.R.inc(6795);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6796);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6797);break;
            }
            case "LP":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6798);__CLB4_5_2_bool4=true;} {
                // Starts a new level and sets the \u2018Level polarity\u2019 graphics state parameter. See
                // 4.14.
                __CLR4_5_251k51klx1h5ms9.R.inc(6799);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6800);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6801);break;
            }
            case "AS":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6802);__CLB4_5_2_bool4=true;} {
                // Deprecated axis select, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6803);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6804);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6805);break;
            }
            case "IN":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6806);__CLB4_5_2_bool4=true;} {
                // Deprecated image name, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6807);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6808);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6809);break;
            }
            case "IP":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6810);__CLB4_5_2_bool4=true;} {
                // Deprecated image polarity, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6811);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6812);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6813);break;
            }
            case "IR":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6814);__CLB4_5_2_bool4=true;} {
                // Deprecated image rotation, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6815);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6816);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6817);break;
            }
            case "LN":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6818);__CLB4_5_2_bool4=true;} {
                // Deprecated level name, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6819);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6820);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6821);break;
            }
            case "MI":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6822);__CLB4_5_2_bool4=true;} {
                // Deprecated mirror image, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6823);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6824);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6825);break;
            }
            case "OF":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6826);__CLB4_5_2_bool4=true;} {
                // Deprecated offset, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6827);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6828);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6829);break;
            }
            case "SF":if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6830);__CLB4_5_2_bool4=true;} {
                // Deprecated scale factor, ignore
                __CLR4_5_251k51klx1h5ms9.R.inc(6831);readUntil('*');
                __CLR4_5_251k51klx1h5ms9.R.inc(6832);read();
                __CLR4_5_251k51klx1h5ms9.R.inc(6833);break;
            }
            default:if (!__CLB4_5_2_bool4) {__CLR4_5_251k51klx1h5ms9.R.inc(6834);__CLB4_5_2_bool4=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6835);warn("Unknown extended command code " + code);
                __CLR4_5_251k51klx1h5ms9.R.inc(6836);while ((((peek() != '%')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6837)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6838)==0&false))) {{
                    __CLR4_5_251k51klx1h5ms9.R.inc(6839);read();
                }
            }}
        }
        __CLR4_5_251k51klx1h5ms9.R.inc(6840);if ((((read() != '%')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6841)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6842)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6843);error("Expected end of extended code command");
        }
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readApertureDefinition() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6844);
        __CLR4_5_251k51klx1h5ms9.R.inc(6845);int ch;
        __CLR4_5_251k51klx1h5ms9.R.inc(6846);if ((((read() != 'D')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6847)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6848)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6849);error("Expected aperture D code");
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6850);int code = readInteger();
        __CLR4_5_251k51klx1h5ms9.R.inc(6851);int type = read();
        __CLR4_5_251k51klx1h5ms9.R.inc(6852);Aperture aperture = null;
        boolean __CLB4_5_2_bool5=false;__CLR4_5_251k51klx1h5ms9.R.inc(6853);switch (type) {
            case 'R':if (!__CLB4_5_2_bool5) {__CLR4_5_251k51klx1h5ms9.R.inc(6854);__CLB4_5_2_bool5=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6855);aperture = readRectangleApertureDefinition(code);
                __CLR4_5_251k51klx1h5ms9.R.inc(6856);break;
            }
            case 'C':if (!__CLB4_5_2_bool5) {__CLR4_5_251k51klx1h5ms9.R.inc(6857);__CLB4_5_2_bool5=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6858);aperture = readCircleApertureDefinition(code);
                __CLR4_5_251k51klx1h5ms9.R.inc(6859);break;
            }
            case 'O':if (!__CLB4_5_2_bool5) {__CLR4_5_251k51klx1h5ms9.R.inc(6860);__CLB4_5_2_bool5=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6861);aperture = readObroundApertureDefinition(code);
                __CLR4_5_251k51klx1h5ms9.R.inc(6862);break;
            }
            case 'P':if (!__CLB4_5_2_bool5) {__CLR4_5_251k51klx1h5ms9.R.inc(6863);__CLB4_5_2_bool5=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6864);aperture = readPolygonApertureDefinition(code);
                __CLR4_5_251k51klx1h5ms9.R.inc(6865);break;
            }
            default:if (!__CLB4_5_2_bool5) {__CLR4_5_251k51klx1h5ms9.R.inc(6866);__CLB4_5_2_bool5=true;} {
                __CLR4_5_251k51klx1h5ms9.R.inc(6867);error(String.format("Unhandled aperture definition type %c, code %d", ((char) type),
                        code));
            }
        }
        __CLR4_5_251k51klx1h5ms9.R.inc(6868);apertures.put(code, aperture);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private Aperture readRectangleApertureDefinition(int index) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6869);
        __CLR4_5_251k51klx1h5ms9.R.inc(6870);if ((((read() != ',')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6871)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6872)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6873);error("Expected , in rectangle aperture definition");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6874);double width = readDecimal();
        __CLR4_5_251k51klx1h5ms9.R.inc(6875);if ((((read() != 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6876)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6877)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6878);error("Expected X in rectangle aperture definition");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6879);double height = readDecimal();
        __CLR4_5_251k51klx1h5ms9.R.inc(6880);Double holeDiameter = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(6881);if ((((peek() == 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6882)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6883)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6884);read();
            __CLR4_5_251k51klx1h5ms9.R.inc(6885);holeDiameter = readDecimal();
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6886);if ((((read() != '*')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6887)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6888)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6889);error("Expected end of data block");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6890);return new RectangleAperture(index, width, height, holeDiameter);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private Aperture readCircleApertureDefinition(int index) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6891);
        __CLR4_5_251k51klx1h5ms9.R.inc(6892);if ((((read() != ',')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6893)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6894)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6895);error("Expected , in circle aperture definition");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6896);double diameter = readDecimal();
        __CLR4_5_251k51klx1h5ms9.R.inc(6897);Double holeDiameter = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(6898);if ((((peek() == 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6899)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6900)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6901);read();
            __CLR4_5_251k51klx1h5ms9.R.inc(6902);holeDiameter = readDecimal();
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6903);if ((((read() != '*')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6904)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6905)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6906);error("Expected end of data block");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6907);return new CircleAperture(index, diameter, holeDiameter);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private Aperture readObroundApertureDefinition(int index) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6908);
        __CLR4_5_251k51klx1h5ms9.R.inc(6909);if ((((read() != ',')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6910)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6911)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6912);error("Expected , in obround aperture definition");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6913);double width = readDecimal();
        __CLR4_5_251k51klx1h5ms9.R.inc(6914);if ((((read() != 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6915)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6916)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6917);error("Expected X in obround aperture definition");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6918);double height = readDecimal();
        __CLR4_5_251k51klx1h5ms9.R.inc(6919);Double holeDiameter = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(6920);if ((((peek() == 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6921)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6922)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6923);read();
            __CLR4_5_251k51klx1h5ms9.R.inc(6924);holeDiameter = readDecimal();
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6925);if ((((read() != '*')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6926)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6927)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6928);error("Expected end of data block");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6929);return new ObroundAperture(index, width, height, holeDiameter);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private Aperture readPolygonApertureDefinition(int index) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6930);
        __CLR4_5_251k51klx1h5ms9.R.inc(6931);if ((((read() != ',')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6932)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6933)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6934);error("Expected , in circle aperture definition");
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6935);double diameter = readDecimal();

        __CLR4_5_251k51klx1h5ms9.R.inc(6936);if ((((read() != 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6937)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6938)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6939);error("Expected X in polygon aperture definition");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6940);int numberOfVertices = readInteger();

        __CLR4_5_251k51klx1h5ms9.R.inc(6941);Double rotation = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(6942);if ((((peek() == 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6943)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6944)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6945);read();
            __CLR4_5_251k51klx1h5ms9.R.inc(6946);rotation = readDecimal();
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6947);Double holeDiameter = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(6948);if ((((peek() == 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6949)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6950)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6951);read();
            __CLR4_5_251k51klx1h5ms9.R.inc(6952);holeDiameter = readDecimal();
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6953);if ((((read() != '*')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6954)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6955)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6956);error("Expected end of data block");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6957);return new PolygonAperture(index, diameter, numberOfVertices, rotation, holeDiameter);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readUnit() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6958);
        __CLR4_5_251k51klx1h5ms9.R.inc(6959);String unitCode = readString(2);
        __CLR4_5_251k51klx1h5ms9.R.inc(6960);if ((((unitCode.equals("MM"))&&(__CLR4_5_251k51klx1h5ms9.R.iget(6961)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6962)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6963);unit = LengthUnit.Millimeters;
        }
        }else {__CLR4_5_251k51klx1h5ms9.R.inc(6964);if ((((unitCode.equals("IN"))&&(__CLR4_5_251k51klx1h5ms9.R.iget(6965)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6966)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6967);unit = LengthUnit.Inches;
        }
        }else {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6968);error("Unknown unit code " + unitCode);
        }

        }}__CLR4_5_251k51klx1h5ms9.R.inc(6969);if ((((read() != '*')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6970)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6971)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6972);error("Expected end of data block");
        }
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void readCoordinateFormat() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(6973);
        __CLR4_5_251k51klx1h5ms9.R.inc(6974);int ch;

        __CLR4_5_251k51klx1h5ms9.R.inc(6975);while (((("LTAI".indexOf((char) peek()) != -1)&&(__CLR4_5_251k51klx1h5ms9.R.iget(6976)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6977)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6978);ch = read();
            boolean __CLB4_5_2_bool6=false;__CLR4_5_251k51klx1h5ms9.R.inc(6979);switch (ch) {
                case 'L':if (!__CLB4_5_2_bool6) {__CLR4_5_251k51klx1h5ms9.R.inc(6980);__CLB4_5_2_bool6=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6981);coordinateFormatTrailingZeroOmission = false;
                    __CLR4_5_251k51klx1h5ms9.R.inc(6982);break;
                }
                case 'T':if (!__CLB4_5_2_bool6) {__CLR4_5_251k51klx1h5ms9.R.inc(6983);__CLB4_5_2_bool6=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6984);coordinateFormatTrailingZeroOmission = true;
                    __CLR4_5_251k51klx1h5ms9.R.inc(6985);break;
                }
                case 'A':if (!__CLB4_5_2_bool6) {__CLR4_5_251k51klx1h5ms9.R.inc(6986);__CLB4_5_2_bool6=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6987);coordinateFormatIncremental = false;
                    __CLR4_5_251k51klx1h5ms9.R.inc(6988);break;
                }
                case 'I':if (!__CLB4_5_2_bool6) {__CLR4_5_251k51klx1h5ms9.R.inc(6989);__CLB4_5_2_bool6=true;} {
                    __CLR4_5_251k51klx1h5ms9.R.inc(6990);coordinateFormatIncremental = true;
                    __CLR4_5_251k51klx1h5ms9.R.inc(6991);break;
                }
            }
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(6992);int xI, xD, yI, yD;

        __CLR4_5_251k51klx1h5ms9.R.inc(6993);ch = read();
        __CLR4_5_251k51klx1h5ms9.R.inc(6994);if ((((ch != 'X')&&(__CLR4_5_251k51klx1h5ms9.R.iget(6995)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(6996)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(6997);error("Expected X coordinate format");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(6998);xI = read() - '0';
        __CLR4_5_251k51klx1h5ms9.R.inc(6999);if ((((xI < 0 || xI > 6)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7000)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7001)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7002);warn("Invalid coordinate format, X integer part {}, should be >= 0 && <= 6", xI);
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7003);xD = read() - '0';
        __CLR4_5_251k51klx1h5ms9.R.inc(7004);if ((((xD < 4 || xD > 6)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7005)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7006)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7007);warn("Invalid coordinate format, X decimal part {}, should be >= 4 && <= 6", xD);
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(7008);ch = read();
        __CLR4_5_251k51klx1h5ms9.R.inc(7009);if ((((ch != 'Y')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7010)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7011)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7012);error("Expected Y coordinate format");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7013);yI = read() - '0';
        __CLR4_5_251k51klx1h5ms9.R.inc(7014);if ((((yI < 0 || yI > 6)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7015)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7016)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7017);warn("Invalid coordinate format, Y integer part {}, should be >= 0 && <= 6", yI);
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7018);yD = read() - '0';
        __CLR4_5_251k51klx1h5ms9.R.inc(7019);if ((((yD < 4 || yD > 6)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7020)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7021)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7022);warn("Invalid coordinate format, Y decimal part {}, should be >= 4 && <= 6", yD);
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(7023);if ((((xI != yI || xD != yD)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7024)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7025)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7026);error(String.format("Coordinate format X does not match Y: %d.%d != %d.%d", xI, xD, yI,
                    yD));
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(7027);coordinateFormatIntegerLength = xI;
        __CLR4_5_251k51klx1h5ms9.R.inc(7028);coordinateFormatDecimalLength = xD;

        __CLR4_5_251k51klx1h5ms9.R.inc(7029);if ((((read() != '*')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7030)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7031)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7032);error("Expected end of data block");
        }
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private String readUntil(int ch) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7033);
        __CLR4_5_251k51klx1h5ms9.R.inc(7034);StringBuffer sb = new StringBuffer();
        __CLR4_5_251k51klx1h5ms9.R.inc(7035);while ((((peek() != ch)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7036)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7037)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7038);sb.append((char) read());
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7039);return sb.toString();
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private String readString(int length) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7040);
        __CLR4_5_251k51klx1h5ms9.R.inc(7041);StringBuffer sb = new StringBuffer();
        __CLR4_5_251k51klx1h5ms9.R.inc(7042);for (int i = 0; (((i < length)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7043)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7044)==0&false)); i++) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7045);sb.append((char) read());
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7046);return sb.toString();
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private double readDecimal() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7047);
        __CLR4_5_251k51klx1h5ms9.R.inc(7048);boolean negative = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7049);int ch = peek();
        __CLR4_5_251k51klx1h5ms9.R.inc(7050);if ((((ch == '-')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7051)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7052)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7053);negative = true;
            __CLR4_5_251k51klx1h5ms9.R.inc(7054);read();
        }
        }else {__CLR4_5_251k51klx1h5ms9.R.inc(7055);if ((((ch == '+')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7056)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7057)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7058);read();
        }
        }}__CLR4_5_251k51klx1h5ms9.R.inc(7059);StringBuffer sb = new StringBuffer();
        __CLR4_5_251k51klx1h5ms9.R.inc(7060);String allowed = "0123456789.";
        __CLR4_5_251k51klx1h5ms9.R.inc(7061);while ((((allowed.indexOf(peek()) != -1)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7062)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7063)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7064);sb.append((char) read());
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7065);return ((((negative )&&(__CLR4_5_251k51klx1h5ms9.R.iget(7066)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7067)==0&false))? -1 : 1) * Double.parseDouble(sb.toString());
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private int readInteger() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7068);
        __CLR4_5_251k51klx1h5ms9.R.inc(7069);boolean negative = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7070);int ch = peek();
        __CLR4_5_251k51klx1h5ms9.R.inc(7071);if ((((ch == '-')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7072)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7073)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7074);negative = true;
            __CLR4_5_251k51klx1h5ms9.R.inc(7075);read();
        }
        }else {__CLR4_5_251k51klx1h5ms9.R.inc(7076);if ((((ch == '+')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7077)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7078)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7079);read();
        }
        }}__CLR4_5_251k51klx1h5ms9.R.inc(7080);StringBuffer sb = new StringBuffer();
        __CLR4_5_251k51klx1h5ms9.R.inc(7081);String allowed = "0123456789";
        __CLR4_5_251k51klx1h5ms9.R.inc(7082);while ((((allowed.indexOf(peek()) != -1)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7083)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7084)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7085);sb.append((char) read());
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7086);return ((((negative )&&(__CLR4_5_251k51klx1h5ms9.R.iget(7087)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7088)==0&false))? -1 : 1) * Integer.parseInt(sb.toString());
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private double readCoordinateValue() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7089);
        __CLR4_5_251k51klx1h5ms9.R.inc(7090);if ((((coordinateFormatIncremental)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7091)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7092)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7093);error("Incremental coordinate format not supported");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7094);if ((((coordinateFormatTrailingZeroOmission)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7095)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7096)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7097);error("Trailing zero omission not supported");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7098);if ((((coordinateFormatIntegerLength == -1 || coordinateFormatDecimalLength == -1)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7099)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7100)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7101);error("Coordinate format not specified.");
        }
        // Read the value as an integer first, since this will read until it hits
        // something that isn't an integer character, then pad it out and then
        // break up the components.
        }__CLR4_5_251k51klx1h5ms9.R.inc(7102);int value = readInteger();
        __CLR4_5_251k51klx1h5ms9.R.inc(7103);String sValue = Integer.toString(Math.abs(value));
        __CLR4_5_251k51klx1h5ms9.R.inc(7104);while ((((sValue.length() < coordinateFormatIntegerLength + coordinateFormatDecimalLength)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7105)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7106)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7107);sValue = "0" + sValue;
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7108);String integerPart = sValue.substring(0, coordinateFormatIntegerLength);
        __CLR4_5_251k51klx1h5ms9.R.inc(7109);String decimalPart = sValue.substring(coordinateFormatIntegerLength,
                coordinateFormatIntegerLength + coordinateFormatDecimalLength - 1);
        __CLR4_5_251k51klx1h5ms9.R.inc(7110);return ((((value < 0 )&&(__CLR4_5_251k51klx1h5ms9.R.iget(7111)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7112)==0&false))? -1 : 1) * Double.parseDouble(integerPart + "." + decimalPart);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Read the next character in the stream, skipping any \r or \n that precede it.
     * 
     * @return
     * @throws Exception
     */
    private int read() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7113);
        __CLR4_5_251k51klx1h5ms9.R.inc(7114);skipCrLf();
        __CLR4_5_251k51klx1h5ms9.R.inc(7115);int ch = reader.read();
        __CLR4_5_251k51klx1h5ms9.R.inc(7116);if ((((ch == -1)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7117)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7118)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7119);error("Unexpected end of stream");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7120);return ch;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Peek at the next character in the stream, skipping any \r or \n that precede it.
     * 
     * @return
     * @throws Exception
     */
    private int peek() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7121);
        __CLR4_5_251k51klx1h5ms9.R.inc(7122);skipCrLf();
        __CLR4_5_251k51klx1h5ms9.R.inc(7123);return _peek();
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Consume any number of \r or \n, stopping when another character is found.
     * 
     * @throws Exception
     */
    private void skipCrLf() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7124);
        __CLR4_5_251k51klx1h5ms9.R.inc(7125);while (true) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7126);int ch = _peek();
            __CLR4_5_251k51klx1h5ms9.R.inc(7127);if ((((ch == '\n')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7128)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7129)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(7130);lineNumber++;
                __CLR4_5_251k51klx1h5ms9.R.inc(7131);reader.read();
            }
            }else {__CLR4_5_251k51klx1h5ms9.R.inc(7132);if ((((ch == '\r')&&(__CLR4_5_251k51klx1h5ms9.R.iget(7133)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7134)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(7135);reader.read();
            }
            }else {{
                __CLR4_5_251k51klx1h5ms9.R.inc(7136);return;
            }
        }}}
    }}finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    /**
     * Return the next character in the reader without consuming it.
     * 
     * @return
     * @throws Exception
     */
    private int _peek() throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7137);
        __CLR4_5_251k51klx1h5ms9.R.inc(7138);reader.mark(1);
        __CLR4_5_251k51klx1h5ms9.R.inc(7139);int ch = reader.read();
        __CLR4_5_251k51klx1h5ms9.R.inc(7140);if ((((ch == -1)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7141)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7142)==0&false))) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7143);error("Unexpected end of stream");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7144);reader.reset();
        __CLR4_5_251k51klx1h5ms9.R.inc(7145);return ch;
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7146);
        __CLR4_5_251k51klx1h5ms9.R.inc(7147);unit = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(7148);currentAperture = null;
        __CLR4_5_251k51klx1h5ms9.R.inc(7149);currentPoint = new Point2D.Double(0, 0);
        __CLR4_5_251k51klx1h5ms9.R.inc(7150);levelPolarity = LevelPolarity.Dark;
        /*
         * This is non-standard, but expected by Eagle, at least. The standard says that
         * interpolation mode is undefined at the start of the file but Eagle does not appear to
         * send a G01 at any point before it starts sending D01s.
         */
        __CLR4_5_251k51klx1h5ms9.R.inc(7151);interpolationMode = InterpolationMode.Linear;
        __CLR4_5_251k51klx1h5ms9.R.inc(7152);stopped = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7153);regionMode = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7154);coordinateFormatIntegerLength = -1;
        __CLR4_5_251k51klx1h5ms9.R.inc(7155);coordinateFormatDecimalLength = -1;
        __CLR4_5_251k51klx1h5ms9.R.inc(7156);coordinateFormatTrailingZeroOmission = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7157);coordinateFormatIncremental = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7158);apertures = new HashMap<>();
        __CLR4_5_251k51klx1h5ms9.R.inc(7159);lineNumber = 1;
        __CLR4_5_251k51klx1h5ms9.R.inc(7160);pads = new ArrayList<>();
        __CLR4_5_251k51klx1h5ms9.R.inc(7161);regionStarted = false;
        __CLR4_5_251k51klx1h5ms9.R.inc(7162);apertureUseCounts = new HashMap<>();

        __CLR4_5_251k51klx1h5ms9.R.inc(7163);parseStatistics = new ParseStatistics();
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void warn(String s) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7164);
        __CLR4_5_251k51klx1h5ms9.R.inc(7165);logger.warn("WARNING: " + lineNumber + ": " + s);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void warn(String fmt, Object o1) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7166);
        __CLR4_5_251k51klx1h5ms9.R.inc(7167);logger.warn("WARNING: " + lineNumber + ": " + fmt, o1);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void warn(String fmt, Object o1, Object o2) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7168);
        __CLR4_5_251k51klx1h5ms9.R.inc(7169);logger.warn("WARNING: " + lineNumber + ": " + fmt, o1, o2);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void warn(String fmt, Object[] o) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7170);
        __CLR4_5_251k51klx1h5ms9.R.inc(7171);logger.warn("WARNING: " + lineNumber + ": " + fmt, o);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    private void error(String s) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7172);
        __CLR4_5_251k51klx1h5ms9.R.inc(7173);throw new Exception("ERROR: " + lineNumber + ": " + s);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_5_251k51klx1h5ms9.R.inc(7174);
        __CLR4_5_251k51klx1h5ms9.R.inc(7175);HashMap<File, ParseStatistics> results = new HashMap<>();
        __CLR4_5_251k51klx1h5ms9.R.inc(7176);File[] files = new File("/Users/jason/Desktop/paste_tests").listFiles();
        __CLR4_5_251k51klx1h5ms9.R.inc(7177);for (File file : files) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7178);if ((((file.isDirectory())&&(__CLR4_5_251k51klx1h5ms9.R.iget(7179)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7180)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(7181);continue;
            }
            }__CLR4_5_251k51klx1h5ms9.R.inc(7182);if ((((file.getName().equals(".DS_Store"))&&(__CLR4_5_251k51klx1h5ms9.R.iget(7183)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7184)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(7185);continue;
            }
            }__CLR4_5_251k51klx1h5ms9.R.inc(7186);Rs274xParser parser = new Rs274xParser();
            __CLR4_5_251k51klx1h5ms9.R.inc(7187);try {
                __CLR4_5_251k51klx1h5ms9.R.inc(7188);parser.parseSolderPastePads(file);
            }
            catch (Exception e) {
                __CLR4_5_251k51klx1h5ms9.R.inc(7189);System.out.println(file.getName() + " " + e.getMessage());
            }
            __CLR4_5_251k51klx1h5ms9.R.inc(7190);results.put(file, parser.parseStatistics);
        }

        }__CLR4_5_251k51klx1h5ms9.R.inc(7191);ParseStatistics total = new ParseStatistics();
        __CLR4_5_251k51klx1h5ms9.R.inc(7192);logger.info("");
        __CLR4_5_251k51klx1h5ms9.R.inc(7193);logger.info("");
        __CLR4_5_251k51klx1h5ms9.R.inc(7194);ArrayList<File> sortedFiles = new ArrayList<>(results.keySet());
        __CLR4_5_251k51klx1h5ms9.R.inc(7195);Collections.sort(sortedFiles, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7196);
                __CLR4_5_251k51klx1h5ms9.R.inc(7197);return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
        });
        __CLR4_5_251k51klx1h5ms9.R.inc(7198);for (File file : sortedFiles) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7199);ParseStatistics stats = results.get(file);
            __CLR4_5_251k51klx1h5ms9.R.inc(7200);total.add(stats);__CLR4_5_251k51klx1h5ms9.R.inc(7201);;
            __CLR4_5_251k51klx1h5ms9.R.inc(7202);logger.info(String.format("%-32s: %s", file.getName(), stats.toString()));
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7203);String totalLine = String.format("%-32s: %s", "TOTALS", total.toString());
        __CLR4_5_251k51klx1h5ms9.R.inc(7204);StringBuffer sb = new StringBuffer();
        __CLR4_5_251k51klx1h5ms9.R.inc(7205);for (int i = 0; (((i < totalLine.length())&&(__CLR4_5_251k51klx1h5ms9.R.iget(7206)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7207)==0&false)); i++) {{
            __CLR4_5_251k51klx1h5ms9.R.inc(7208);sb.append("-");
        }
        }__CLR4_5_251k51klx1h5ms9.R.inc(7209);logger.info(sb.toString());
        __CLR4_5_251k51klx1h5ms9.R.inc(7210);logger.info(totalLine);
    }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

    static abstract class Aperture {
        final protected int index;

        public Aperture(int index) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7211);
            __CLR4_5_251k51klx1h5ms9.R.inc(7212);this.index = index;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        public int getIndex() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7213);
            __CLR4_5_251k51klx1h5ms9.R.inc(7214);return index;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        public abstract BoardPad createPad(LengthUnit unit, Point2D.Double coordinate);
    }

    static abstract class StandardAperture extends Aperture {
        public StandardAperture(int index) {
            super(index);__CLR4_5_251k51klx1h5ms9.R.inc(7216);try{__CLR4_5_251k51klx1h5ms9.R.inc(7215);
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }

    static class RectangleAperture extends StandardAperture {
        public double width;
        public double height;
        public Double holeDiameter;

        public RectangleAperture(int index, double width, double height, Double holeDiameter) {
            super(index);__CLR4_5_251k51klx1h5ms9.R.inc(7218);try{__CLR4_5_251k51klx1h5ms9.R.inc(7217);
            __CLR4_5_251k51klx1h5ms9.R.inc(7219);this.width = width;
            __CLR4_5_251k51klx1h5ms9.R.inc(7220);this.height = height;
            __CLR4_5_251k51klx1h5ms9.R.inc(7221);this.holeDiameter = holeDiameter;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        public BoardPad createPad(LengthUnit unit, Point2D.Double coordinate) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7222);
            __CLR4_5_251k51klx1h5ms9.R.inc(7223);Pad.RoundRectangle pad = new Pad.RoundRectangle();
            __CLR4_5_251k51klx1h5ms9.R.inc(7224);pad.setUnits(unit);
            __CLR4_5_251k51klx1h5ms9.R.inc(7225);pad.setWidth(width);
            __CLR4_5_251k51klx1h5ms9.R.inc(7226);pad.setHeight(height);
            __CLR4_5_251k51klx1h5ms9.R.inc(7227);pad.setRoundness(0);
            __CLR4_5_251k51klx1h5ms9.R.inc(7228);BoardPad boardPad =
                    new BoardPad(pad, new Location(unit, coordinate.x, coordinate.y, 0, 0));
            __CLR4_5_251k51klx1h5ms9.R.inc(7229);return boardPad;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7230);
            __CLR4_5_251k51klx1h5ms9.R.inc(7231);return "RectangleAperture [width=" + width + ", height=" + height + ", holeDiameter="
                    + holeDiameter + "]";
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }

    static class CircleAperture extends StandardAperture {
        public double diameter;
        public Double holeDiameter;

        public CircleAperture(int index, double diameter, Double holeDiameter) {
            super(index);__CLR4_5_251k51klx1h5ms9.R.inc(7233);try{__CLR4_5_251k51klx1h5ms9.R.inc(7232);
            __CLR4_5_251k51klx1h5ms9.R.inc(7234);this.diameter = diameter;
            __CLR4_5_251k51klx1h5ms9.R.inc(7235);this.holeDiameter = holeDiameter;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        public BoardPad createPad(LengthUnit unit, Point2D.Double coordinate) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7236);
            __CLR4_5_251k51klx1h5ms9.R.inc(7237);Pad.Circle pad = new Pad.Circle();
            __CLR4_5_251k51klx1h5ms9.R.inc(7238);pad.setRadius(diameter / 2);
            __CLR4_5_251k51klx1h5ms9.R.inc(7239);pad.setUnits(unit);
            __CLR4_5_251k51klx1h5ms9.R.inc(7240);BoardPad boardPad =
                    new BoardPad(pad, new Location(unit, coordinate.x, coordinate.y, 0, 0));
            __CLR4_5_251k51klx1h5ms9.R.inc(7241);return boardPad;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7242);
            __CLR4_5_251k51klx1h5ms9.R.inc(7243);return "CircleAperture [diameter=" + diameter + ", holeDiameter=" + holeDiameter + "]";
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }

    static class ObroundAperture extends RectangleAperture {
        public ObroundAperture(int index, double width, double height, Double holeDiameter) {
            super(index, width, height, holeDiameter);__CLR4_5_251k51klx1h5ms9.R.inc(7245);try{__CLR4_5_251k51klx1h5ms9.R.inc(7244);
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7246);
            __CLR4_5_251k51klx1h5ms9.R.inc(7247);return "ObroundAperture [width=" + width + ", height=" + height + ", holeDiameter="
                    + holeDiameter + "]";
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }

    static class PolygonAperture extends CircleAperture {
        public int numberOfVertices;
        public Double rotation;

        public PolygonAperture(int index, double diameter, int numberOfVertices, Double rotation,
                Double holeDiameter) {
            super(index, diameter, holeDiameter);__CLR4_5_251k51klx1h5ms9.R.inc(7249);try{__CLR4_5_251k51klx1h5ms9.R.inc(7248);
            __CLR4_5_251k51klx1h5ms9.R.inc(7250);this.numberOfVertices = numberOfVertices;
            __CLR4_5_251k51klx1h5ms9.R.inc(7251);this.rotation = rotation;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7252);
            __CLR4_5_251k51klx1h5ms9.R.inc(7253);return "PolygonAperture [numberOfVertices=" + numberOfVertices + ", rotation="
                    + rotation + ", diameter=" + diameter + ", holeDiameter=" + holeDiameter + "]";
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }

    static class MacroAperture extends Aperture {
        public MacroAperture(int index) {
            super(index);__CLR4_5_251k51klx1h5ms9.R.inc(7255);try{__CLR4_5_251k51klx1h5ms9.R.inc(7254);
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        @Override
        public BoardPad createPad(LengthUnit unit, java.awt.geom.Point2D.Double coordinate) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7256);
            __CLR4_5_251k51klx1h5ms9.R.inc(7257);return null;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }

    static class ParseStatistics {
        public int lineCount;
        public int linePerformedCount;

        public int arcCount;
        public int arcPerformedCount;

        public int regionLineCount;
        public int regionLinePerformedCount;

        public int regionArcCount;
        public int regionArcPerformedCount;

        public int regionCount;
        public int regionPerformedCount;

        public int flashCount;
        public int flashPerformedCount;

        public int padCount;

        public boolean errored;

        public double percent(double count, double total) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7258);
            __CLR4_5_251k51klx1h5ms9.R.inc(7259);if ((((total == 0)&&(__CLR4_5_251k51klx1h5ms9.R.iget(7260)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7261)==0&false))) {{
                __CLR4_5_251k51klx1h5ms9.R.inc(7262);return 100;
            }
            }__CLR4_5_251k51klx1h5ms9.R.inc(7263);return (count / total) * 100;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        public void add(ParseStatistics p) {try{__CLR4_5_251k51klx1h5ms9.R.inc(7264);
            __CLR4_5_251k51klx1h5ms9.R.inc(7265);lineCount += p.lineCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7266);linePerformedCount += p.linePerformedCount;

            __CLR4_5_251k51klx1h5ms9.R.inc(7267);arcCount += p.arcCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7268);arcPerformedCount += p.arcPerformedCount;

            __CLR4_5_251k51klx1h5ms9.R.inc(7269);regionLineCount += p.regionLineCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7270);regionLinePerformedCount += p.regionLinePerformedCount;

            __CLR4_5_251k51klx1h5ms9.R.inc(7271);regionArcCount += p.regionArcCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7272);regionArcPerformedCount += p.regionArcPerformedCount;

            __CLR4_5_251k51klx1h5ms9.R.inc(7273);regionCount += p.regionCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7274);regionPerformedCount += p.regionPerformedCount;

            __CLR4_5_251k51klx1h5ms9.R.inc(7275);flashCount += p.flashCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7276);flashPerformedCount += p.flashPerformedCount;

            __CLR4_5_251k51klx1h5ms9.R.inc(7277);padCount += p.padCount;
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_251k51klx1h5ms9.R.inc(7278);
            __CLR4_5_251k51klx1h5ms9.R.inc(7279);int total = flashCount + regionCount + lineCount + arcCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7280);int totalPerformed = flashPerformedCount + regionPerformedCount + linePerformedCount
                    + arcPerformedCount;
            __CLR4_5_251k51klx1h5ms9.R.inc(7281);return String.format(
                    "%s Total %3.0f%% (%4d/%4d), Flash %3.0f%% (%4d/%4d), Line %3.0f%% (%4d/%4d), Arc %3.0f%% (%4d/%4d), Region %3.0f%% (%4d/%4d), Region line %3.0f%% (%4d/%4d), Region Arc %3.0f%% (%4d/%4d), Pads %4d",
                    (((errored )&&(__CLR4_5_251k51klx1h5ms9.R.iget(7282)!=0|true))||(__CLR4_5_251k51klx1h5ms9.R.iget(7283)==0&false))? "FAIL" : "PASS", percent(totalPerformed, total), totalPerformed,
                    total, percent(flashPerformedCount, flashCount), flashPerformedCount,
                    flashCount, percent(linePerformedCount, lineCount), linePerformedCount,
                    lineCount, percent(arcPerformedCount, arcCount), arcPerformedCount, arcCount,
                    percent(regionPerformedCount, regionCount), regionPerformedCount, regionCount,
                    percent(regionLinePerformedCount, regionLineCount), regionLinePerformedCount,
                    regionLineCount, percent(regionArcPerformedCount, regionArcCount),
                    regionArcPerformedCount, regionArcCount, padCount);
        }finally{__CLR4_5_251k51klx1h5ms9.R.flushNeeded();}}
    }
}
