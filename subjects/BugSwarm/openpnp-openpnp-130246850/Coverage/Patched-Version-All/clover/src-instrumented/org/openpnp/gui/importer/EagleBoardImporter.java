/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2015 Douglas Pearless <Douglas.Pearless@gmail.com>
 * 
 * This file is part of OpenPnP.
 * 
 * OpenPnP is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenPnP is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with OpenPnP. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.gui.importer;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder;

import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardPad;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Package;
import org.openpnp.model.Pad;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.model.Point;
import org.openpnp.model.eagle.EagleLoader;
import org.openpnp.model.eagle.xml.Element;
import org.openpnp.model.eagle.xml.Layer;
import org.openpnp.model.eagle.xml.Library;
import org.openpnp.model.eagle.xml.Param;
import org.openpnp.model.eagle.xml.Vertex;
import org.openpnp.util.Utils2D;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class EagleBoardImporter implements BoardImporter {public static class __CLR4_5_2477477lx1h8ih8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,5818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(EagleBoardImporter.class);

    private final static String NAME = "CadSoft EAGLE Board";
    private final static String DESCRIPTION =
            "Import files directly from EAGLE's <filename>.brd file.";

    private static Board board;
    private File boardFile;
    static private Double mil_to_mm = 0.0254;

    @Override
    public String getImporterName() {try{__CLR4_5_2477477lx1h8ih8.R.inc(5443);
        __CLR4_5_2477477lx1h8ih8.R.inc(5444);return NAME;
    }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

    @Override
    public String getImporterDescription() {try{__CLR4_5_2477477lx1h8ih8.R.inc(5445);
        __CLR4_5_2477477lx1h8ih8.R.inc(5446);return DESCRIPTION;
    }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

    @Override
    public Board importBoard(Frame parent) throws Exception {try{__CLR4_5_2477477lx1h8ih8.R.inc(5447);
        __CLR4_5_2477477lx1h8ih8.R.inc(5448);Dlg dlg = new Dlg(parent);
        __CLR4_5_2477477lx1h8ih8.R.inc(5449);dlg.setVisible(true);
        __CLR4_5_2477477lx1h8ih8.R.inc(5450);return board;
    }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

    private static List<Placement> parseFile(File file, Side side, boolean createMissingParts)
            throws Exception {try{__CLR4_5_2477477lx1h8ih8.R.inc(5451);

        __CLR4_5_2477477lx1h8ih8.R.inc(5452);String dimensionLayer = "";
        __CLR4_5_2477477lx1h8ih8.R.inc(5453);String topLayer = "";
        __CLR4_5_2477477lx1h8ih8.R.inc(5454);String bottomLayer = "";
        __CLR4_5_2477477lx1h8ih8.R.inc(5455);String tCreamLayer = "";
        __CLR4_5_2477477lx1h8ih8.R.inc(5456);String bCreamLayer = "";

        __CLR4_5_2477477lx1h8ih8.R.inc(5457);String mmMinCreamFrame_string;
        __CLR4_5_2477477lx1h8ih8.R.inc(5458);double mmMinCreamFrame_number = 0;
        __CLR4_5_2477477lx1h8ih8.R.inc(5459);String mmMaxCreamFrame_string;
        __CLR4_5_2477477lx1h8ih8.R.inc(5460);double mmMaxCreamFrame_number = 0;
        __CLR4_5_2477477lx1h8ih8.R.inc(5461);String libraryId = "";
        __CLR4_5_2477477lx1h8ih8.R.inc(5462);String packageId = "";
        __CLR4_5_2477477lx1h8ih8.R.inc(5463);Part part = null;

        __CLR4_5_2477477lx1h8ih8.R.inc(5464);List<BoardPad> pads = new ArrayList<>();

        __CLR4_5_2477477lx1h8ih8.R.inc(5465);ArrayList<Placement> placements = new ArrayList<>();
        // we don't use the 'side' parameter as we can read this from the .brd file
        // in the future we could use the side parameter to restrict this from only parsing one side
        // or the other or both

        __CLR4_5_2477477lx1h8ih8.R.inc(5466);EagleLoader boardToProcess = new EagleLoader(file);
        __CLR4_5_2477477lx1h8ih8.R.inc(5467);if ((((boardToProcess.board != null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5468)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5469)==0&false))) {{

            // first establish which is the Dimension, Top, Bottom, tCream and bCream layers in case
            // the board has non-standard layer numbering
            __CLR4_5_2477477lx1h8ih8.R.inc(5470);for (Layer layer : boardToProcess.layers.getLayer()) {{
                __CLR4_5_2477477lx1h8ih8.R.inc(5471);if ((((layer.getName().equalsIgnoreCase("Dimension"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5472)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5473)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5474);dimensionLayer = layer.getNumber();
                }
                }else {__CLR4_5_2477477lx1h8ih8.R.inc(5475);if ((((layer.getName().equalsIgnoreCase("Top"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5476)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5477)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5478);topLayer = layer.getNumber();
                }
                }else {__CLR4_5_2477477lx1h8ih8.R.inc(5479);if ((((layer.getName().equalsIgnoreCase("Bottom"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5480)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5481)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5482);bottomLayer = layer.getNumber();
                }
                }else {__CLR4_5_2477477lx1h8ih8.R.inc(5483);if ((((layer.getName().equalsIgnoreCase("tCream"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5484)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5485)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5486);tCreamLayer = layer.getNumber();
                }
                }else {__CLR4_5_2477477lx1h8ih8.R.inc(5487);if ((((layer.getName().equalsIgnoreCase("bCream"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5488)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5489)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5490);bCreamLayer = layer.getNumber();
                }
            }}}}}}

            // Now we want to establish the width of the board which we need to record
            }__CLR4_5_2477477lx1h8ih8.R.inc(5491);Double x_boundary = 0.0;
            __CLR4_5_2477477lx1h8ih8.R.inc(5492);for (Object e : boardToProcess.board.getPlain()
                    .getPolygonOrWireOrTextOrDimensionOrCircleOrRectangleOrFrameOrHole()) {{
                __CLR4_5_2477477lx1h8ih8.R.inc(5493);if ((((e instanceof org.openpnp.model.eagle.xml.Wire)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5494)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5495)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5496);if ((((((org.openpnp.model.eagle.xml.Wire) e).getLayer()
                            .equalsIgnoreCase(dimensionLayer))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5497)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5498)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5499);x_boundary = Math.max(x_boundary,
                                Double.parseDouble(((org.openpnp.model.eagle.xml.Wire) e).getX1()));
                        __CLR4_5_2477477lx1h8ih8.R.inc(5500);x_boundary = Math.max(x_boundary,
                                Double.parseDouble(((org.openpnp.model.eagle.xml.Wire) e).getX2()));
                    }
                }}
            }}
            }__CLR4_5_2477477lx1h8ih8.R.inc(5501);Point center = new Point(x_boundary / 2, 0); // note that we set x = maximum x point on
                                                         // the Y=0;

            // determine the parameters for the pads based on DesignRules
            __CLR4_5_2477477lx1h8ih8.R.inc(5502);for (Param params : boardToProcess.board.getDesignrules().getParam()) {{

                __CLR4_5_2477477lx1h8ih8.R.inc(5503);if ((((params.getName().compareToIgnoreCase("mlMinCreamFrame") == 0)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5504)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5505)==0&false))) {{ // found exact
                                                                                    // match when 0
                                                                                    // returned
                    __CLR4_5_2477477lx1h8ih8.R.inc(5506);mmMinCreamFrame_string = params.getValue().replaceAll("[A-Za-z ]", ""); // remove
                                                                                            // all
                                                                                            // letters,
                                                                                            // i.e.
                                                                                            // 0mil
                                                                                            // becomes
                                                                                            // 0
                    __CLR4_5_2477477lx1h8ih8.R.inc(5507);if ((((params.getValue().toUpperCase().endsWith("MIL"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5508)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5509)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5510);mmMinCreamFrame_number =
                                Double.parseDouble(mmMinCreamFrame_string) * mil_to_mm;
                    }
                    }else {__CLR4_5_2477477lx1h8ih8.R.inc(5511);if ((((params.getValue().toUpperCase().endsWith("MM"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5512)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5513)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5514);mmMinCreamFrame_number =
                                Double.parseDouble(mmMinCreamFrame_string) * mil_to_mm;
                    }
                    }else
                        {__CLR4_5_2477477lx1h8ih8.R.inc(5515);throw new Exception("mlMinCream must either be in mil or mm"); // Force the
                                                                                       // importer
                                                                                       // to abort,
                                                                                       // something
                                                                                       // is very
                                                                                       // wrong
                }}}
                }__CLR4_5_2477477lx1h8ih8.R.inc(5516);if ((((params.getName().compareToIgnoreCase("mlMaxCreamFrame") == 0)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5517)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5518)==0&false))) {{ // found exact
                                                                                    // match when 0
                                                                                    // returned
                    __CLR4_5_2477477lx1h8ih8.R.inc(5519);mmMaxCreamFrame_string = params.getValue().replaceAll("[A-Za-z ]", ""); // remove
                                                                                            // all
                                                                                            // letters,
                                                                                            // i.e.
                                                                                            // "0mil"
                                                                                            // becomes
                                                                                            // 0
                    __CLR4_5_2477477lx1h8ih8.R.inc(5520);if ((((params.getValue().toUpperCase().endsWith("MIL"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5521)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5522)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5523);mmMaxCreamFrame_number =
                                Double.parseDouble(mmMaxCreamFrame_string) * mil_to_mm;
                    }
                    }else {__CLR4_5_2477477lx1h8ih8.R.inc(5524);if ((((params.getValue().toUpperCase().endsWith("MM"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5525)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5526)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5527);mmMaxCreamFrame_number = Double.parseDouble(mmMaxCreamFrame_string);
                    }
                    }else
                        {__CLR4_5_2477477lx1h8ih8.R.inc(5528);throw new Exception("mlMaxCream must either be in mil or mm"); // Force the
                                                                                       // importer
                                                                                       // to abort,
                                                                                       // something
                                                                                       // is very
                                                                                       // wrong
                }}}
            }}
            // Now we know the min and max tolerance for the cream (aka solder paste)
            // which are mmMinCreamFrame_number and mmMaxCreamFrame_number and are in mm (converted
            // from mil as required)

            // Now we got through each of the parts
            }__CLR4_5_2477477lx1h8ih8.R.inc(5529);if ((((!boardToProcess.board.getElements().getElement().isEmpty())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5530)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5531)==0&false))) {{

                // Process each of the element items
                __CLR4_5_2477477lx1h8ih8.R.inc(5532);for (Element element : boardToProcess.board.getElements().getElement()) {{
                    // first we determine if the part is on the top layer or bottom layer

                    __CLR4_5_2477477lx1h8ih8.R.inc(5533);Side element_side;
                    __CLR4_5_2477477lx1h8ih8.R.inc(5534);String rot = element.getRot();
                    __CLR4_5_2477477lx1h8ih8.R.inc(5535);if ((((rot.toUpperCase().startsWith("M"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5536)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5537)==0&false)))
                        // The part is mirrored and therefore is on the bottom of the board
                        {__CLR4_5_2477477lx1h8ih8.R.inc(5538);element_side = Side.Bottom;
                    }else
                        {__CLR4_5_2477477lx1h8ih8.R.inc(5539);element_side = Side.Top;

                    // Now determine if we want to process this part based on which side of the
                    // board it is on

                    }__CLR4_5_2477477lx1h8ih8.R.inc(5540);if ((((side != null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5541)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5542)==0&false))) {{ // null means process both sides
                        __CLR4_5_2477477lx1h8ih8.R.inc(5543);if ((((side != element_side)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5544)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5545)==0&false)))
                            {__CLR4_5_2477477lx1h8ih8.R.inc(5546);continue; // exit this loop and process the next element
                    }}

                    }__CLR4_5_2477477lx1h8ih8.R.inc(5547);String rot_number = rot.replaceAll("[A-Za-z ]", ""); // remove all letters, i.e.
                                                                         // R180 becomes 180

                    __CLR4_5_2477477lx1h8ih8.R.inc(5548);Placement placement = new Placement(element.getName());
                    __CLR4_5_2477477lx1h8ih8.R.inc(5549);double rotation = Double.parseDouble(rot_number);
                    __CLR4_5_2477477lx1h8ih8.R.inc(5550);double x = Double.parseDouble(element.getX());
                    __CLR4_5_2477477lx1h8ih8.R.inc(5551);double y = Double.parseDouble(element.getY());
                    __CLR4_5_2477477lx1h8ih8.R.inc(5552);placement.setLocation(new Location(LengthUnit.Millimeters, x, y, 0, rotation));

                    // placement now contains where the package is on the PCB, we need to work out
                    // where the pads
                    // are relative to the 'placement'
                    __CLR4_5_2477477lx1h8ih8.R.inc(5553);Configuration cfg = Configuration.get();
                    __CLR4_5_2477477lx1h8ih8.R.inc(5554);if ((((cfg != null && createMissingParts)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5555)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5556)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5557);String value = element.getValue(); // Value
                        __CLR4_5_2477477lx1h8ih8.R.inc(5558);packageId = element.getPackage(); // Package
                        __CLR4_5_2477477lx1h8ih8.R.inc(5559);libraryId = element.getLibrary(); // Library that contains the package

                        __CLR4_5_2477477lx1h8ih8.R.inc(5560);String pkgId = libraryId + "-" + packageId;

                        __CLR4_5_2477477lx1h8ih8.R.inc(5561);String partId = libraryId + "-" + packageId;
                        __CLR4_5_2477477lx1h8ih8.R.inc(5562);if ((((value.trim().length() > 0)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5563)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5564)==0&false))) {{
                            __CLR4_5_2477477lx1h8ih8.R.inc(5565);partId += "-" + value;
                        }

                        }__CLR4_5_2477477lx1h8ih8.R.inc(5566);part = cfg.getPart(partId);
                        __CLR4_5_2477477lx1h8ih8.R.inc(5567);Package pkg = cfg.getPackage(pkgId);

                        __CLR4_5_2477477lx1h8ih8.R.inc(5568);if (((((part == null) || (pkg == null))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5569)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5570)==0&false))) {{

                            __CLR4_5_2477477lx1h8ih8.R.inc(5571);if ((((pkg == null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5572)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5573)==0&false))) {{
                                __CLR4_5_2477477lx1h8ih8.R.inc(5574);pkg = new Package(pkgId);
                                __CLR4_5_2477477lx1h8ih8.R.inc(5575);cfg.addPackage(pkg); // save the package in the configuration file
                                __CLR4_5_2477477lx1h8ih8.R.inc(5576);if ((((part != null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5577)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5578)==0&false))) {{
                                    __CLR4_5_2477477lx1h8ih8.R.inc(5579);cfg.removePart(part);// we have to remove the part so we can
                                                         // re-add it with the correct package &
                                                         // library
                                    __CLR4_5_2477477lx1h8ih8.R.inc(5580);part = null;
                                }

                            }}
                            }__CLR4_5_2477477lx1h8ih8.R.inc(5581);if ((((part == null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5582)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5583)==0&false))) {{
                                __CLR4_5_2477477lx1h8ih8.R.inc(5584);part = new Part(partId);
                                __CLR4_5_2477477lx1h8ih8.R.inc(5585);part.setPackage(pkg);
                                // TODO part.setLibrary(libraryId);
                                __CLR4_5_2477477lx1h8ih8.R.inc(5586);cfg.addPart(part); // save the package in the configuration file
                            }
                            }__CLR4_5_2477477lx1h8ih8.R.inc(5587);cfg.addPart(part);
                        }
                    }}
                    }__CLR4_5_2477477lx1h8ih8.R.inc(5588);placement.setPart(part);

                    // Now we have the part, we now need to add the SolderPastePad to the board
                    // Note, Eagle has the concept of minimum and max from the edge of the pad so we
                    // need to
                    // adjust the pad to be the size as the mid-point between the minimum and max
                    // in practice these are usually 0, which means we paste the entire pad

                    __CLR4_5_2477477lx1h8ih8.R.inc(5589);if ((((!boardToProcess.board.getLibraries().getLibrary().isEmpty())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5590)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5591)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5592);for (Library library : boardToProcess.board.getLibraries().getLibrary()) {{
                            __CLR4_5_2477477lx1h8ih8.R.inc(5593);if ((((library.getName().equalsIgnoreCase(libraryId))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5594)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5595)==0&false))) {{
                                // we have found the library, now to scan for the package we want
                                __CLR4_5_2477477lx1h8ih8.R.inc(5596);if ((((!library.getPackages().getPackage().isEmpty())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5597)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5598)==0&false))) {{

                                    __CLR4_5_2477477lx1h8ih8.R.inc(5599);ListIterator<org.openpnp.model.eagle.xml.Package> it =
                                            library.getPackages().getPackage().listIterator();

                                    __CLR4_5_2477477lx1h8ih8.R.inc(5600);while ((((it.hasNext())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5601)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5602)==0&false))) {{

                                        __CLR4_5_2477477lx1h8ih8.R.inc(5603);org.openpnp.model.eagle.xml.Package pak =
                                                (org.openpnp.model.eagle.xml.Package) it.next();
                                        __CLR4_5_2477477lx1h8ih8.R.inc(5604);if ((((pak.getName().equalsIgnoreCase(packageId))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5605)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5606)==0&false))) {{

                                            __CLR4_5_2477477lx1h8ih8.R.inc(5607);for (Object e : pak
                                                    .getPolygonOrWireOrTextOrDimensionOrCircleOrRectangleOrFrameOrHoleOrPadOrSmd()) {{
                                                __CLR4_5_2477477lx1h8ih8.R.inc(5608);if ((((e instanceof org.openpnp.model.eagle.xml.Smd)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5609)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5610)==0&false))) {{
                                                    // we have found the correct package in the
                                                    // correct library and we need to to add the pad
                                                    // to the boardPads

                                                    __CLR4_5_2477477lx1h8ih8.R.inc(5611);if ((((!((org.openpnp.model.eagle.xml.Smd) e)
                                                            .getCream().equalsIgnoreCase("No"))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5612)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5613)==0&false))) {{ // if
                                                                                                  // cream="no"
                                                                                                  // then
                                                                                                  // we
                                                                                                  // do
                                                                                                  // not
                                                                                                  // paste
                                                                                                  // this
                                                                                                  // pad

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5614);Pad.RoundRectangle pad =
                                                                new Pad.RoundRectangle();
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5615);pad.setUnits(LengthUnit.Millimeters);

                                                        // TODO check that these reduce the pad to
                                                        // the halfway between the minimum & maximum
                                                        // tolerances
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5616);pad.setHeight(Double.parseDouble(
                                                                ((org.openpnp.model.eagle.xml.Smd) e)
                                                                        .getDx())
                                                                - (mmMaxCreamFrame_number
                                                                        - mmMinCreamFrame_number)
                                                                        / 2);
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5617);pad.setWidth(Double.parseDouble(
                                                                ((org.openpnp.model.eagle.xml.Smd) e)
                                                                        .getDy())
                                                                - (mmMaxCreamFrame_number
                                                                        - mmMinCreamFrame_number)
                                                                        / 2);

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5618);pad.setRoundness(0);
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5619);pad.setRoundness(Double.parseDouble(
                                                                ((org.openpnp.model.eagle.xml.Smd) e)
                                                                        .getRoundness()));

                                                        // first find out how is the package defined
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5620);Double pad_rotation =
                                                                Double.parseDouble(rot_number);
                                                        // now rotate the pad by its own rotation
                                                        // relative to its origin and make sure we
                                                        // don't turn through 360 degrees
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5621);pad_rotation += Double.parseDouble(
                                                                ((org.openpnp.model.eagle.xml.Smd) e)
                                                                        .getRot().replaceAll(
                                                                                "[A-Za-z ]", ""))
                                                                % 360;

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5622);Point A = new Point(
                                                                Double.parseDouble(
                                                                        ((org.openpnp.model.eagle.xml.Smd) e)
                                                                                .getX())
                                                                        + x,
                                                                Double.parseDouble(
                                                                        ((org.openpnp.model.eagle.xml.Smd) e)
                                                                                .getY())
                                                                        + y);

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5623);Point part_center = new Point(x, y);

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5624);if ((((element_side == Side.Top)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5625)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5626)==0&false))) {{
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5627);if ((((rotation > 180)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5628)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5629)==0&false)))
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5630);A = Utils2D
                                                                        .rotateTranslateCenterPoint(
                                                                                A, rotation, 0, 0,
                                                                                part_center); // rotate
                                                                                              // the
                                                                                              // part-pin
                                                            }else
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5631);A = Utils2D
                                                                        .rotateTranslateCenterPoint(
                                                                                A, -rotation, 0, 0,
                                                                                part_center); // rotate
                                                                                              // the
                                                                                              // part-pin
                                                        }}
                                                        }else {__CLR4_5_2477477lx1h8ih8.R.inc(5632);if ((((element_side == Side.Bottom)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5633)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5634)==0&false))) {{
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5635);if ((((rotation > 180)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5636)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5637)==0&false)))
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5638);A = Utils2D
                                                                        .rotateTranslateCenterPoint(
                                                                                A, rotation, 0, 0,
                                                                                part_center); // rotate
                                                                                              // the
                                                                                              // part-pin
                                                            }else
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5639);A = Utils2D
                                                                        .rotateTranslateCenterPoint(
                                                                                A,
                                                                                -(180 - rotation),
                                                                                0, 0, part_center); // rotate
                                                                                                    // the
                                                                                                    // part-pin

                                                            // Mirror along the Y axis of the board
                                                            }__CLR4_5_2477477lx1h8ih8.R.inc(5640);if ((((A.getX() < center.getX())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5641)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5642)==0&false))) {{
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5643);Double offset =
                                                                        center.getX() - A.getX();
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5644);A.setX(center.getX() + offset); // mirror
                                                                                                // left
                                                                                                // to
                                                                                                // right
                                                                                                // across
                                                                                                // the
                                                                                                // centre
                                                                                                // of
                                                                                                // the
                                                                                                // board
                                                            }
                                                            }else {{
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5645);Double offset =
                                                                        A.getX() - center.getX();
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5646);A.setX(center.getX() - offset);
                                                            }
                                                            // Mirror along the X axis of the part's
                                                            // center line
                                                            }__CLR4_5_2477477lx1h8ih8.R.inc(5647);if ((((A.getY() < y)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5648)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5649)==0&false))) {{
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5650);Double offset = y - A.getY();
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5651);A.setY(y + offset); // mirror top to
                                                                                    // bottom across
                                                                                    // the centre of
                                                                                    // the part
                                                            }
                                                            }else {{
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5652);Double offset = A.getY() - y;
                                                                __CLR4_5_2477477lx1h8ih8.R.inc(5653);A.setY(y - offset); // mirror bottom
                                                                                    // to top across
                                                                                    // the centre of
                                                                                    // the part
                                                            }

                                                        }}

                                                        // TODO Need to write the logic for pad
                                                        // rotation
                                                        // A = Utils2D.rotateTranslateCenterPoint(A,
                                                        // pad_rotation,0,0,center);
                                                        //


                                                        }}__CLR4_5_2477477lx1h8ih8.R.inc(5654);BoardPad boardPad = new BoardPad(pad,
                                                                new Location(LengthUnit.Millimeters,
                                                                        A.getX(), A.getY(), 0,
                                                                        pad_rotation));

                                                        // TODO add support for Circle pads

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5655);boardPad.setName(element.getName() + "-"
                                                                + ((org.openpnp.model.eagle.xml.Smd) e)
                                                                        .getName());

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5656);if ((((((org.openpnp.model.eagle.xml.Smd) e)
                                                                .getLayer()
                                                                .equalsIgnoreCase(topLayer))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5657)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5658)==0&false))) {{ // is
                                                                                               // the
                                                                                               // pad
                                                                                               // on
                                                                                               // top
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5659);if ((((element_side == Side.Top)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5660)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5661)==0&false))) // part is
                                                                                          // on the
                                                                                          // top
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5662);boardPad.setSide(Side.Top); // pad
                                                                                            // is on
                                                                                            // the
                                                                                            // top
                                                            }else
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5663);boardPad.setSide(Side.Bottom); // part
                                                                                               // is
                                                                                               // on
                                                                                               // top,
                                                                                               // but
                                                                                               // pat
                                                                                               // is
                                                                                               // on
                                                                                               // the
                                                                                               // bottom
                                                        }}
                                                        }else {__CLR4_5_2477477lx1h8ih8.R.inc(5664);if ((((((org.openpnp.model.eagle.xml.Smd) e)
                                                                .getLayer()
                                                                .equalsIgnoreCase(bottomLayer))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5665)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5666)==0&false))) {{ // is
                                                                                                  // the
                                                                                                  // pad
                                                                                                  // on
                                                                                                  // the
                                                                                                  // bottom
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5667);if ((((element_side == Side.Top)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5668)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5669)==0&false))) // part is
                                                                                          // top
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5670);boardPad.setSide(Side.Bottom); // pad
                                                                                               // stays
                                                                                               // on
                                                                                               // the
                                                                                               // bottom
                                                            }else
                                                                {__CLR4_5_2477477lx1h8ih8.R.inc(5671);boardPad.setSide(Side.Top); // pad
                                                                                            // moves
                                                                                            // to
                                                                                            // the
                                                                                            // top
                                                        }}
                                                        }else
                                                            {__CLR4_5_2477477lx1h8ih8.R.inc(5672);logger.info("Warning: " + file
                                                                    + "contains a SMD pad that is not on a topLayer or bottomLayer");

                                                        // TODO figure out if it is possible for an
                                                        // SMD pad to have a drill, it appears not
                                                        // !!
                                                        // pad.setdrillDiameter(0);

                                                        // TODO later we need to associate a list of
                                                        // pads to a board.
                                                        }}__CLR4_5_2477477lx1h8ih8.R.inc(5673);pads.add(boardPad);

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5674);board.addSolderPastePad(boardPad); // This
                                                                                           // adds
                                                                                           // the
                                                                                           // pad to
                                                                                           // the
                                                                                           // SolderPaste
                                                    }
                                                }}
                                                }else {__CLR4_5_2477477lx1h8ih8.R.inc(5675);if ((((e instanceof org.openpnp.model.eagle.xml.Pad)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5676)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5677)==0&false))) {{

                                                    // TODO implement pasting for through hole pads

                                                }
                                                }else {__CLR4_5_2477477lx1h8ih8.R.inc(5678);if ((((e instanceof org.openpnp.model.eagle.xml.Polygon)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5679)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5680)==0&false))) {{
                                                    // We have a polygon is it on a tCream or bCream
                                                    // layer, otherwise ignore it
                                                    __CLR4_5_2477477lx1h8ih8.R.inc(5681);if ((((((org.openpnp.model.eagle.xml.Polygon) e)
                                                            .getLayer()
                                                            .equalsIgnoreCase(tCreamLayer)
                                                            || ((org.openpnp.model.eagle.xml.Polygon) e)
                                                                    .getLayer().equalsIgnoreCase(
                                                                            bCreamLayer))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5682)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5683)==0&false))) {{
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5684);logger.info("Warning: " + file
                                                                + " contains a Polygon pad - this functionality has been implmented as the smallest bounded rectangle and may over paste the area");
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5685);logger.info(
                                                                "Layer" + ((org.openpnp.model.eagle.xml.Polygon) e)
                                                                        .getLayer().toString());
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5686);Double vertex_x_min = 0.0;
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5687);Double vertex_x_max = 0.0;
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5688);Double vertex_y_min = 0.0;
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5689);Double vertex_y_max = 0.0;
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5690);ListIterator<org.openpnp.model.eagle.xml.Vertex> vertex_it =
                                                                ((org.openpnp.model.eagle.xml.Polygon) e)
                                                                        .getVertex().listIterator();
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5691);while ((((vertex_it.hasNext())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5692)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5693)==0&false))) {{
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5694);org.openpnp.model.eagle.xml.Vertex vertex =
                                                                    (Vertex) vertex_it.next();
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5695);vertex_x_min = Math.min(vertex_x_min,
                                                                    Double.parseDouble(
                                                                            vertex.getX()));
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5696);vertex_x_max = Math.max(vertex_x_max,
                                                                    Double.parseDouble(
                                                                            vertex.getX()));
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5697);vertex_y_min = Math.min(vertex_y_min,
                                                                    Double.parseDouble(
                                                                            vertex.getY()));
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5698);vertex_y_max = Math.max(vertex_y_max,
                                                                    Double.parseDouble(
                                                                            vertex.getY()));
                                                            __CLR4_5_2477477lx1h8ih8.R.inc(5699);logger.info("Vertex: X=" + vertex.getX()
                                                                    + " y=" + vertex.getY());
                                                        }
                                                        // TODO implement polygon pad in Pad.java
                                                        }__CLR4_5_2477477lx1h8ih8.R.inc(5700);Pad.RoundRectangle pad =
                                                                new Pad.RoundRectangle();
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5701);pad.setUnits(LengthUnit.Millimeters);
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5702);pad.setRoundness(0);
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5703);pad.setHeight(
                                                                (vertex_y_max - vertex_y_min));
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5704);pad.setWidth((vertex_x_max - vertex_x_min));

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5705);BoardPad boardPad = new BoardPad(pad,
                                                                new Location(LengthUnit.Millimeters,
                                                                        x + (vertex_x_max
                                                                                + vertex_x_min) / 2,
                                                                        y + (vertex_y_max
                                                                                + vertex_y_min) / 2,
                                                                        0, 0));
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5706);logger.info("Pad generated width is "
                                                                + pad.getWidth() + " height "
                                                                + pad.getHeight()
                                                                + " centered at x = "
                                                                + boardPad.getLocation().getX()
                                                                + " y = "
                                                                + boardPad.getLocation().getY());
                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5707);boardPad.setName(element.getName() + "-"
                                                                + "Polygon "); // Polygons are not
                                                                               // named so just name
                                                                               // it as "Polygon"

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5708);if ((((((org.openpnp.model.eagle.xml.Polygon) e)
                                                                .getLayer()
                                                                .equalsIgnoreCase(tCreamLayer))&&(__CLR4_5_2477477lx1h8ih8.R.iget(5709)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5710)==0&false)))
                                                            {__CLR4_5_2477477lx1h8ih8.R.inc(5711);boardPad.setSide(Side.Top);
                                                        }else
                                                            {__CLR4_5_2477477lx1h8ih8.R.inc(5712);boardPad.setSide(Side.Bottom);

                                                        }__CLR4_5_2477477lx1h8ih8.R.inc(5713);pads.add(boardPad);

                                                        __CLR4_5_2477477lx1h8ih8.R.inc(5714);board.addSolderPastePad(boardPad); // This
                                                                                           // adds
                                                                                           // the
                                                                                           // pad to
                                                                                           // the
                                                                                           // SolderPaste
                                                    }
                                                }}
                                            }}}}
                                        }}
                                    }}
                                }}
                            }}
                        }}
                    }}

                    }__CLR4_5_2477477lx1h8ih8.R.inc(5715);placement.setSide(element_side);
                    __CLR4_5_2477477lx1h8ih8.R.inc(5716);placements.add(placement);
                    __CLR4_5_2477477lx1h8ih8.R.inc(5717);board.addPlacement(placement); // this adds the placement to the Pick and Place
                                                   // list

                }
            }}
        }}
        }__CLR4_5_2477477lx1h8ih8.R.inc(5718);if ((((boardToProcess.library != null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5719)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5720)==0&false))) {{

        }
        }__CLR4_5_2477477lx1h8ih8.R.inc(5721);if ((((boardToProcess.schematic != null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5722)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5723)==0&false))) {{

        }

        }__CLR4_5_2477477lx1h8ih8.R.inc(5724);return placements;
    }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

    class Dlg extends JDialog {
        private JTextField textFieldBoardFile;
        private final Action browseBoardFileAction = new SwingAction();
        private final Action importAction = new SwingAction_2();
        private final Action cancelAction = new SwingAction_3();
        private JCheckBox chckbxCreateMissingParts;
        private JCheckBox chckbxImportTop;
        private JCheckBox chckbxImportBottom;

        public Dlg(Frame parent) {
            super(parent, DESCRIPTION, true);__CLR4_5_2477477lx1h8ih8.R.inc(5726);try{__CLR4_5_2477477lx1h8ih8.R.inc(5725);
            __CLR4_5_2477477lx1h8ih8.R.inc(5727);getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            __CLR4_5_2477477lx1h8ih8.R.inc(5728);JPanel panel = new JPanel();
            __CLR4_5_2477477lx1h8ih8.R.inc(5729);panel.setBorder(new TitledBorder(null, "Files", TitledBorder.LEADING, TitledBorder.TOP,
                    null, null));
            __CLR4_5_2477477lx1h8ih8.R.inc(5730);getContentPane().add(panel);
            __CLR4_5_2477477lx1h8ih8.R.inc(5731);panel.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                            FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_2477477lx1h8ih8.R.inc(5732);JLabel lblBoardFilebrd = new JLabel("Eagle PCB Board File (.brd)");
            __CLR4_5_2477477lx1h8ih8.R.inc(5733);panel.add(lblBoardFilebrd, "2, 2, right, default");

            __CLR4_5_2477477lx1h8ih8.R.inc(5734);textFieldBoardFile = new JTextField();
            __CLR4_5_2477477lx1h8ih8.R.inc(5735);panel.add(textFieldBoardFile, "4, 2, fill, default");
            __CLR4_5_2477477lx1h8ih8.R.inc(5736);textFieldBoardFile.setColumns(10);

            __CLR4_5_2477477lx1h8ih8.R.inc(5737);JButton btnBrowse = new JButton("Browse");
            __CLR4_5_2477477lx1h8ih8.R.inc(5738);btnBrowse.setAction(browseBoardFileAction);
            __CLR4_5_2477477lx1h8ih8.R.inc(5739);panel.add(btnBrowse, "6, 2");

            __CLR4_5_2477477lx1h8ih8.R.inc(5740);JPanel panel_1 = new JPanel();
            __CLR4_5_2477477lx1h8ih8.R.inc(5741);panel_1.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING,
                    TitledBorder.TOP, null, null));
            __CLR4_5_2477477lx1h8ih8.R.inc(5742);getContentPane().add(panel_1);
            __CLR4_5_2477477lx1h8ih8.R.inc(5743);panel_1.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_2477477lx1h8ih8.R.inc(5744);chckbxCreateMissingParts = new JCheckBox("Create Missing Parts");
            __CLR4_5_2477477lx1h8ih8.R.inc(5745);chckbxCreateMissingParts.setSelected(true);
            __CLR4_5_2477477lx1h8ih8.R.inc(5746);panel_1.add(chckbxCreateMissingParts, "2, 2");

            __CLR4_5_2477477lx1h8ih8.R.inc(5747);chckbxImportTop = new JCheckBox("Import Parts on the Top of the board");
            __CLR4_5_2477477lx1h8ih8.R.inc(5748);chckbxImportTop.setSelected(true);
            __CLR4_5_2477477lx1h8ih8.R.inc(5749);panel_1.add(chckbxImportTop, "2, 4");

            __CLR4_5_2477477lx1h8ih8.R.inc(5750);chckbxImportBottom = new JCheckBox("Import Parts on the Bottom of the board");
            __CLR4_5_2477477lx1h8ih8.R.inc(5751);chckbxImportBottom.setSelected(true);
            __CLR4_5_2477477lx1h8ih8.R.inc(5752);panel_1.add(chckbxImportBottom, "2, 6");

            __CLR4_5_2477477lx1h8ih8.R.inc(5753);JSeparator separator = new JSeparator();
            __CLR4_5_2477477lx1h8ih8.R.inc(5754);getContentPane().add(separator);

            __CLR4_5_2477477lx1h8ih8.R.inc(5755);JPanel panel_2 = new JPanel();
            __CLR4_5_2477477lx1h8ih8.R.inc(5756);FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
            __CLR4_5_2477477lx1h8ih8.R.inc(5757);flowLayout.setAlignment(FlowLayout.RIGHT);
            __CLR4_5_2477477lx1h8ih8.R.inc(5758);getContentPane().add(panel_2);

            __CLR4_5_2477477lx1h8ih8.R.inc(5759);JButton btnCancel = new JButton("Cancel");
            __CLR4_5_2477477lx1h8ih8.R.inc(5760);btnCancel.setAction(cancelAction);
            __CLR4_5_2477477lx1h8ih8.R.inc(5761);panel_2.add(btnCancel);

            __CLR4_5_2477477lx1h8ih8.R.inc(5762);JButton btnImport = new JButton("Import");
            __CLR4_5_2477477lx1h8ih8.R.inc(5763);btnImport.setAction(importAction);
            __CLR4_5_2477477lx1h8ih8.R.inc(5764);panel_2.add(btnImport);

            __CLR4_5_2477477lx1h8ih8.R.inc(5765);setSize(400, 400);
            __CLR4_5_2477477lx1h8ih8.R.inc(5766);setLocationRelativeTo(parent);

            __CLR4_5_2477477lx1h8ih8.R.inc(5767);JRootPane rootPane = getRootPane();
            __CLR4_5_2477477lx1h8ih8.R.inc(5768);KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
            __CLR4_5_2477477lx1h8ih8.R.inc(5769);InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            __CLR4_5_2477477lx1h8ih8.R.inc(5770);inputMap.put(stroke, "ESCAPE");
            __CLR4_5_2477477lx1h8ih8.R.inc(5771);rootPane.getActionMap().put("ESCAPE", cancelAction);
        }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

        private class SwingAction extends AbstractAction {
            public SwingAction() {try{__CLR4_5_2477477lx1h8ih8.R.inc(5772);
                __CLR4_5_2477477lx1h8ih8.R.inc(5773);putValue(NAME, "Browse");
                __CLR4_5_2477477lx1h8ih8.R.inc(5774);putValue(SHORT_DESCRIPTION, "Browse");
            }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2477477lx1h8ih8.R.inc(5775);
                __CLR4_5_2477477lx1h8ih8.R.inc(5776);FileDialog fileDialog = new FileDialog(Dlg.this);
                __CLR4_5_2477477lx1h8ih8.R.inc(5777);fileDialog.setFilenameFilter(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {try{__CLR4_5_2477477lx1h8ih8.R.inc(5778);
                        __CLR4_5_2477477lx1h8ih8.R.inc(5779);return name.toLowerCase().endsWith(".brd");
                    }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}
                });
                __CLR4_5_2477477lx1h8ih8.R.inc(5780);fileDialog.setVisible(true);
                __CLR4_5_2477477lx1h8ih8.R.inc(5781);if ((((fileDialog.getFile() == null)&&(__CLR4_5_2477477lx1h8ih8.R.iget(5782)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5783)==0&false))) {{
                    __CLR4_5_2477477lx1h8ih8.R.inc(5784);return;
                }
                }__CLR4_5_2477477lx1h8ih8.R.inc(5785);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_2477477lx1h8ih8.R.inc(5786);textFieldBoardFile.setText(file.getAbsolutePath());
            }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}
        }

        private class SwingAction_2 extends AbstractAction {
            public SwingAction_2() {try{__CLR4_5_2477477lx1h8ih8.R.inc(5787);
                __CLR4_5_2477477lx1h8ih8.R.inc(5788);putValue(NAME, "Import");
                __CLR4_5_2477477lx1h8ih8.R.inc(5789);putValue(SHORT_DESCRIPTION, "Import");
            }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2477477lx1h8ih8.R.inc(5790);
                __CLR4_5_2477477lx1h8ih8.R.inc(5791);boardFile = new File(textFieldBoardFile.getText());
                __CLR4_5_2477477lx1h8ih8.R.inc(5792);board = new Board();
                __CLR4_5_2477477lx1h8ih8.R.inc(5793);List<Placement> placements = new ArrayList<>();
                __CLR4_5_2477477lx1h8ih8.R.inc(5794);try {
                    __CLR4_5_2477477lx1h8ih8.R.inc(5795);if ((((boardFile.exists())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5796)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5797)==0&false))) {{
                        __CLR4_5_2477477lx1h8ih8.R.inc(5798);if ((((chckbxImportTop.isSelected() && chckbxImportBottom.isSelected())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5799)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5800)==0&false)))
                            {__CLR4_5_2477477lx1h8ih8.R.inc(5801);placements.addAll(parseFile(boardFile, null,
                                    chckbxCreateMissingParts.isSelected())); // both Top and Bottom
                                                                             // of the board
                        }else {__CLR4_5_2477477lx1h8ih8.R.inc(5802);if ((((chckbxImportTop.isSelected())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5803)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5804)==0&false)))
                            {__CLR4_5_2477477lx1h8ih8.R.inc(5805);placements.addAll(parseFile(boardFile, Side.Top,
                                    chckbxCreateMissingParts.isSelected())); // Just the Top side of
                                                                             // the board
                        }else {__CLR4_5_2477477lx1h8ih8.R.inc(5806);if ((((chckbxImportBottom.isSelected())&&(__CLR4_5_2477477lx1h8ih8.R.iget(5807)!=0|true))||(__CLR4_5_2477477lx1h8ih8.R.iget(5808)==0&false)))
                            {__CLR4_5_2477477lx1h8ih8.R.inc(5809);placements.addAll(parseFile(boardFile, Side.Bottom,
                                    chckbxCreateMissingParts.isSelected())); // Just the Bottom side
                                                                             // of the board
                    }}}}
                }}
                catch (Exception e1) {
                    __CLR4_5_2477477lx1h8ih8.R.inc(5810);MessageBoxes.errorBox(Dlg.this, "Import Error", e1);
                    __CLR4_5_2477477lx1h8ih8.R.inc(5811);return;
                }

                __CLR4_5_2477477lx1h8ih8.R.inc(5812);setVisible(false);
            }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}
        }

        private class SwingAction_3 extends AbstractAction {
            public SwingAction_3() {try{__CLR4_5_2477477lx1h8ih8.R.inc(5813);
                __CLR4_5_2477477lx1h8ih8.R.inc(5814);putValue(NAME, "Cancel");
                __CLR4_5_2477477lx1h8ih8.R.inc(5815);putValue(SHORT_DESCRIPTION, "Cancel");
            }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2477477lx1h8ih8.R.inc(5816);
                __CLR4_5_2477477lx1h8ih8.R.inc(5817);setVisible(false);
            }finally{__CLR4_5_2477477lx1h8ih8.R.flushNeeded();}}
        }
    }
}
