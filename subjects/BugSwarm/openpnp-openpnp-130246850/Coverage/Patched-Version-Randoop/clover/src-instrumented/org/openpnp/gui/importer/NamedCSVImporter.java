/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

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
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Package;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Ostermiller.util.CSVParser;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;


@SuppressWarnings("serial")
public class NamedCSVImporter implements BoardImporter {public static class __CLR4_5_24qj4qjlx1h73f0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,6428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String NAME = "Named CSV";
    private final static String DESCRIPTION = "Import Named Comma Separated Values Files.";
    private static final Logger logger = LoggerFactory.getLogger(NamedCSVImporter.class);


    private Board board;
    private File topFile, bottomFile;

    @Override
    public String getImporterName() {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6139);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6140);return NAME;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

    @Override
    public String getImporterDescription() {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6141);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6142);return DESCRIPTION;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

    @Override
    public Board importBoard(Frame parent) throws Exception {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6143);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6144);Dlg dlg = new Dlg(parent);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6145);dlg.setVisible(true);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6146);return board;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}


    //////////////////////////////////////////////////////////
    /*
     * public class CSVParseDemo { public static void main(String[] args) throws IOException { if
     * (args.length < 1) { System.out.println("Usage: java CSVParseDemo <csv_file>"); return; }
     * 
     * CSVParser parser = new CSVParser(new FileReader(args[0]), CSVStrategy.DEFAULT); String[]
     * values = parser.getLine(); while (values != null) { printValues(parser.getLineNumber(),
     * values); values = parser.getLine(); } }
     * 
     * private static void printValues(int lineNumber, String[] as) { System.out.println("Line " +
     * lineNumber + " has " + as.length + " values:"); for (String s: as) { System.out.println("\t|"
     * + s + "|"); } System.out.println(); } }
     */
    //////////////////////////////////////////////////////////
    // if((str.indexOf("val")!=-1||str.indexOf("comment"))&&str.indexOf("val")!=-1&&str.indexOf("val")!=-1&&

    private static final String Refs[] =
            {"Designator", "designator", "Part", "part", "Component", "component", "RefDes", "Ref"};
    private static final String Vals[] = {"Value", "value", "Val", "val", "Comment", "comment"};
    private static final String Packs[] =
            {"Footprint", "footprint", "Package", "package", "Pattern", "pattern"};
    private static final String Xs[] = {"X", "x", "X (mm)", "x (mm)", "Ref X", "ref x", "PosX"};
    private static final String Ys[] = {"Y", "x", "Y (mm)", "x (mm)", "Ref Y", "ref x", "PosY"};
    private static final String Rots[] = {"Rotation", "rotation", "Rot", "rot", "Rotate"};
    private static final String TBs[] = {"Layer", "layer", "Side", "side", "TB", "tb"};
    //////////////////////////////////////////////////////////
    static private int Ref = -1, Val = -1, Pack = -1, X = -1, Y = -1, Rot = -1, TB = -1, Len = 0;
    static private char comma = ',';
    //////////////////////////////////////////////////////////

    private static int checkCSV(String str[], String val[]) {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6147);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6148);for (int i = 0; (((i < str.length)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6149)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6150)==0&false)); i++)
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6151);for (int j = 0; (((j < val.length)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6152)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6153)==0&false)); j++)
                {__CLR4_5_24qj4qjlx1h73f0.R.inc(6154);if ((((str[i].equals(val[j]))&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6155)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6156)==0&false))) {{
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6157);logger.trace("checkCSV: " + val[j] + " = " + j);
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6158);return j;
                }
        }}}__CLR4_5_24qj4qjlx1h73f0.R.inc(6159);return -1;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

    private static boolean checkCSV(String str[]) {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6160);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6161);for (int i = 0; (((i < str.length)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6162)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6163)==0&false)); i++)
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6164);logger.trace("checkCSV: " + i + " -> " + str[i]);
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6165);if ((Ref = checkCSV(Refs, str)) != -1 && (Val = checkCSV(Vals, str)) != -1
                && (Pack = checkCSV(Packs, str)) != -1 && (X = checkCSV(Xs, str)) != -1
                && (Y = checkCSV(Ys, str)) != -1 && (Rot = checkCSV(Rots, str)) != -1
                && (TB = checkCSV(TBs, str)) != -2) {{
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6168);Len = (((Ref <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6169)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6170)==0&false))? Len : Ref;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6171);Len = (((Val <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6172)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6173)==0&false))? Len : Val;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6174);Len = (((Pack <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6175)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6176)==0&false))? Len : Pack;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6177);Len = (((X <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6178)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6179)==0&false))? Len : X;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6180);Len = (((Y <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6181)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6182)==0&false))? Len : Y;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6183);Len = (((Rot <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6184)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6185)==0&false))? Len : Rot;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6186);Len = (((TB <= Len )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6187)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6188)==0&false))? Len : TB;
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6189);logger.trace("checkCSV: Len = " + Len);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6190);return true;
        }
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6191);logger.trace("checkCSV: Ref = " + Ref);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6192);logger.trace("checkCSV: Val = " + Val);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6193);logger.trace("checkCSV: Pack = " + Pack);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6194);logger.trace("checkCSV: X = " + X);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6195);logger.trace("checkCSV: Y = " + Y);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6196);logger.trace("checkCSV: Rot = " + Rot);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6197);logger.trace("checkCSV: TB = " + TB);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6198);Ref = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6199);Val = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6200);Pack = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6201);X = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6202);Y = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6203);Rot = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6204);TB = -1;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6205);Len = 0;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6206);return false;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

    private static boolean checkLine(String str) throws Exception {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6207);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6208);logger.trace("checkLine: " + str);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6209);int e = 0;
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6210);if ((((str.charAt(0) == '#')&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6211)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6212)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6213);str = str.substring(1);
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6214);if ((((str == null)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6215)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6216)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6217);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6218);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6219);if ((((str.indexOf("X") == -1 && str.indexOf("x") == -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6220)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6221)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6222);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6223);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6224);if ((((str.indexOf("Y") == -1 && str.indexOf("y") == -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6225)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6226)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6227);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6228);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6229);if ((((str.indexOf("Rot") == -1 && str.indexOf("rot") == -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6230)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6231)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6232);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6233);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6234);if ((((str.indexOf("val") == -1 && str.indexOf("Val") == -1 && str.indexOf("Comment") == -1
                && str.indexOf("comment") == -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6235)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6236)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6237);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6238);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6239);if ((((str.indexOf("ootprint") == -1 && str.indexOf("ackage") == -1
                && str.indexOf("attern") == -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6240)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6241)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6242);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6243);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6244);if ((((str.indexOf("Designator") == -1 && str.indexOf("designator") == -1
                && str.indexOf("Part") == -1 && str.indexOf("part") == -1
                && str.indexOf("Component") == -1 && str.indexOf("component") == -1
                && str.indexOf("RefDes") == -1 && str.indexOf("Ref") == -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6245)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6246)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6247);return false;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6248);logger.trace("checkLine: " + e++ + " ok");
        // seems to have data
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6249);String as[], at[][];
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6250);CSVParser csvParser = new CSVParser(new StringReader(str));
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6251);as = csvParser.getLine();
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6252);comma = ',';
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6253);logger.trace("checkLine: comma " + as.length);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6254);if ((((as.length >= 6 && checkCSV(as))&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6255)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6256)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6257);return true;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6258);logger.trace("checkLine: " + e++ + " ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6259);at = csvParser.parse(str, comma = '\t');
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6260);logger.trace("checkLine: tab " + as.length);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6261);if ((((at.length > 0 && at[0].length >= 6 && checkCSV(at[0]))&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6262)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6263)==0&false)))
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6264);return true;
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6265);logger.trace("checkLine: " + e++ + " ok");
        /*
         * at=csvParser.parse(str,comma=' '); logger.trace("checkLine: space "+as.length);
         * if(at.length>0&&at[0].length>=6&&checkCSV(at[0])) return true; logger.trace(
         * "checkLine: done "+ e++ +" ok");
         */
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6266);return false;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

    /*
     * CSVParser csvParser = new CSVParser( new FileInputStream("datei.csv") ); for ( String as[];
     * (as = csvParser.getLine()) != null; ) if(as.length<=Len) continue; else System.out.println(
     * csvParser.lastLineNumber() + " " + t );
     */
    //////////////////////////////////////////////////////////

    private static List<Placement> parseFile(File file, boolean createMissingParts)
            throws Exception {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6267);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6268);BufferedReader reader =
                new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6269);ArrayList<Placement> placements = new ArrayList<>();
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6270);String line;

        __CLR4_5_24qj4qjlx1h73f0.R.inc(6271);for (int i = 0; i++ < 10 && (line = reader.readLine()) != null;) {{
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6274);line = line.trim();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6275);if ((((line.length() == 0)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6276)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6277)==0&false)))
                {__CLR4_5_24qj4qjlx1h73f0.R.inc(6278);continue;
            }__CLR4_5_24qj4qjlx1h73f0.R.inc(6279);if ((((checkLine(line))&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6280)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6281)==0&false)))
                {__CLR4_5_24qj4qjlx1h73f0.R.inc(6282);break;
        }}


        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6283);if ((((Len == 0)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6284)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6285)==0&false))) {{
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6286);reader.close();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6287);throw new Exception("Unable to parse CSV File Names");
        }

        // CSVParser csvParser = new CSVParser(new FileInputStream(file));
        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6288);CSVParser csvParser = new CSVParser(reader, comma);
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6289);for (String as[]; (as = csvParser.getLine()) != null;)
            {__CLR4_5_24qj4qjlx1h73f0.R.inc(6292);if ((((as.length <= Len)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6293)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6294)==0&false)))
                {__CLR4_5_24qj4qjlx1h73f0.R.inc(6295);continue;
            }else {{

                __CLR4_5_24qj4qjlx1h73f0.R.inc(6296);logger.trace("CSV: " + as.length);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6297);for (int i = 0; (((i < as.length)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6298)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6299)==0&false)); i++)
                    {__CLR4_5_24qj4qjlx1h73f0.R.inc(6300);logger.trace("CSV(" + i + ") |" + as[i] + "|");
                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6301);logger.trace("");
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6302);double placementX = Double
                        .parseDouble(as[X].replace(",", ".").replace(" ", "").replace("mm", ""));
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6303);double placementY = Double
                        .parseDouble(as[Y].replace(",", ".").replace(" ", "").replace("mm", ""));
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6304);double placementRotation =
                        Double.parseDouble(as[Rot].replace(",", ".").replace(" ", ""));
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6305);while ((((placementRotation > 180.0)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6306)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6307)==0&false)))
                    {__CLR4_5_24qj4qjlx1h73f0.R.inc(6308);placementRotation -= 360.0;
                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6309);while ((((placementRotation < -180.0)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6310)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6311)==0&false)))
                    {__CLR4_5_24qj4qjlx1h73f0.R.inc(6312);placementRotation += 360.0;

                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6313);logger.trace("ok");

                __CLR4_5_24qj4qjlx1h73f0.R.inc(6314);Placement placement = new Placement(as[Ref]);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6315);placement.setLocation(new Location(LengthUnit.Millimeters, placementX, placementY,
                        0, placementRotation));
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6316);Configuration cfg = Configuration.get();
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6317);if ((((cfg != null && createMissingParts)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6318)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6319)==0&false))) {{
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6320);String partId = as[Pack] + "-" + as[Val];
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6321);Part part = cfg.getPart(partId);
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6322);if ((((part == null)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6323)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6324)==0&false))) {{
                        __CLR4_5_24qj4qjlx1h73f0.R.inc(6325);part = new Part(partId);
                        __CLR4_5_24qj4qjlx1h73f0.R.inc(6326);Package pkg = cfg.getPackage(as[Pack]);
                        __CLR4_5_24qj4qjlx1h73f0.R.inc(6327);if ((((pkg == null)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6328)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6329)==0&false))) {{
                            __CLR4_5_24qj4qjlx1h73f0.R.inc(6330);pkg = new Package(as[Pack]);
                            __CLR4_5_24qj4qjlx1h73f0.R.inc(6331);cfg.addPackage(pkg);
                        }
                        }__CLR4_5_24qj4qjlx1h73f0.R.inc(6332);part.setPackage(pkg);

                        __CLR4_5_24qj4qjlx1h73f0.R.inc(6333);cfg.addPart(part);
                    }
                    }__CLR4_5_24qj4qjlx1h73f0.R.inc(6334);placement.setPart(part);

                }

                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6335);char c = 0;
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6336);if ((((TB != -1)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6337)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6338)==0&false)))
                    {__CLR4_5_24qj4qjlx1h73f0.R.inc(6339);c = as[TB].charAt(0);
                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6340);placement.setSide((((c == 'B' || c == 'b' )&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6341)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6342)==0&false))? Side.Bottom : Side.Top);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6343);c = 0;
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6344);placements.add(placement);
            }
        }}__CLR4_5_24qj4qjlx1h73f0.R.inc(6345);logger.trace("ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6346);reader.close();
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6347);logger.trace("ok");
        __CLR4_5_24qj4qjlx1h73f0.R.inc(6348);return placements;
    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

    class Dlg extends JDialog {
        private JTextField textFieldTopFile;
        private final Action browseTopFileAction = new SwingAction();
        private final Action importAction = new SwingAction_2();
        private final Action cancelAction = new SwingAction_3();
        private JCheckBox chckbxCreateMissingParts;

        public Dlg(Frame parent) {
            super(parent, DESCRIPTION, true);__CLR4_5_24qj4qjlx1h73f0.R.inc(6350);try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6349);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6351);getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6352);JPanel panel = new JPanel();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6353);panel.setBorder(new TitledBorder(null, "Files", TitledBorder.LEADING, TitledBorder.TOP,
                    null, null));
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6354);getContentPane().add(panel);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6355);panel.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                            FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6356);JLabel lblTopFilemnt = new JLabel("Centeroid File (.csv)");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6357);panel.add(lblTopFilemnt, "2, 2, right, default");

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6358);textFieldTopFile = new JTextField();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6359);panel.add(textFieldTopFile, "4, 2, fill, default");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6360);textFieldTopFile.setColumns(10);

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6361);JButton btnBrowse = new JButton("Browse");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6362);btnBrowse.setAction(browseTopFileAction);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6363);panel.add(btnBrowse, "6, 2");

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6364);JPanel panel_1 = new JPanel();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6365);panel_1.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING,
                    TitledBorder.TOP, null, null));
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6366);getContentPane().add(panel_1);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6367);panel_1.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6368);chckbxCreateMissingParts = new JCheckBox("Create Missing Parts");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6369);chckbxCreateMissingParts.setSelected(true);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6370);panel_1.add(chckbxCreateMissingParts, "2, 2");

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6371);JSeparator separator = new JSeparator();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6372);getContentPane().add(separator);

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6373);JPanel panel_2 = new JPanel();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6374);FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6375);flowLayout.setAlignment(FlowLayout.RIGHT);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6376);getContentPane().add(panel_2);

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6377);JButton btnCancel = new JButton("Cancel");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6378);btnCancel.setAction(cancelAction);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6379);panel_2.add(btnCancel);

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6380);JButton btnImport = new JButton("Import");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6381);btnImport.setAction(importAction);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6382);panel_2.add(btnImport);

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6383);setSize(400, 400);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6384);setLocationRelativeTo(parent);

            __CLR4_5_24qj4qjlx1h73f0.R.inc(6385);JRootPane rootPane = getRootPane();
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6386);KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6387);InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6388);inputMap.put(stroke, "ESCAPE");
            __CLR4_5_24qj4qjlx1h73f0.R.inc(6389);rootPane.getActionMap().put("ESCAPE", cancelAction);
        }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

        private class SwingAction extends AbstractAction {
            public SwingAction() {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6390);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6391);putValue(NAME, "Browse");
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6392);putValue(SHORT_DESCRIPTION, "Browse");
            }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6393);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6394);FileDialog fileDialog = new FileDialog(Dlg.this);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6395);fileDialog.setFilenameFilter(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6396);
                        __CLR4_5_24qj4qjlx1h73f0.R.inc(6397);return false || name.toLowerCase().endsWith(".csv")
                                || name.toLowerCase().endsWith(".txt")
                                || name.toLowerCase().endsWith(".dat");
                    }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}
                });
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6398);fileDialog.setVisible(true);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6399);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6400)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6401)==0&false))) {{
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6402);return;
                }
                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6403);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6404);textFieldTopFile.setText(file.getAbsolutePath());
            }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}
        }



        private class SwingAction_2 extends AbstractAction {
            public SwingAction_2() {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6405);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6406);putValue(NAME, "Import");
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6407);putValue(SHORT_DESCRIPTION, "Import");
            }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6408);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6409);logger.debug("Parsing " + textFieldTopFile.getText() + " CSV FIle");
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6410);topFile = new File(textFieldTopFile.getText());
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6411);board = new Board();
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6412);List<Placement> placements = new ArrayList<>();
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6413);try {
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6414);if ((((topFile.exists())&&(__CLR4_5_24qj4qjlx1h73f0.R.iget(6415)!=0|true))||(__CLR4_5_24qj4qjlx1h73f0.R.iget(6416)==0&false))) {{
                        __CLR4_5_24qj4qjlx1h73f0.R.inc(6417);placements
                                .addAll(parseFile(topFile, chckbxCreateMissingParts.isSelected()));
                    }
                }}
                catch (Exception e1) {
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6418);MessageBoxes.errorBox(Dlg.this, "Import Error", e1);
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6419);return;
                }
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6420);for (Placement placement : placements) {{
                    __CLR4_5_24qj4qjlx1h73f0.R.inc(6421);board.addPlacement(placement);
                }
                }__CLR4_5_24qj4qjlx1h73f0.R.inc(6422);setVisible(false);
            }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}
        }

        private class SwingAction_3 extends AbstractAction {
            public SwingAction_3() {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6423);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6424);putValue(NAME, "Cancel");
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6425);putValue(SHORT_DESCRIPTION, "Cancel");
            }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24qj4qjlx1h73f0.R.inc(6426);
                __CLR4_5_24qj4qjlx1h73f0.R.inc(6427);setVisible(false);
            }finally{__CLR4_5_24qj4qjlx1h73f0.R.flushNeeded();}}
        }
    }
}
