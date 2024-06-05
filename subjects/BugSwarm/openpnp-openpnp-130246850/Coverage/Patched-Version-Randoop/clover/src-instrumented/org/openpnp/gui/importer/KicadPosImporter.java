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
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class KicadPosImporter implements BoardImporter {public static class __CLR4_5_24m24m2lx1h736m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,6139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String NAME = "KiCAD .pos";
    private final static String DESCRIPTION = "Import KiCAD .pos Files.";

    private Board board;
    private File topFile, bottomFile;

    @Override
    public String getImporterName() {try{__CLR4_5_24m24m2lx1h736m.R.inc(5978);
        __CLR4_5_24m24m2lx1h736m.R.inc(5979);return NAME;
    }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

    @Override
    public String getImporterDescription() {try{__CLR4_5_24m24m2lx1h736m.R.inc(5980);
        __CLR4_5_24m24m2lx1h736m.R.inc(5981);return DESCRIPTION;
    }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

    @Override
    public Board importBoard(Frame parent) throws Exception {try{__CLR4_5_24m24m2lx1h736m.R.inc(5982);
        __CLR4_5_24m24m2lx1h736m.R.inc(5983);Dlg dlg = new Dlg(parent);
        __CLR4_5_24m24m2lx1h736m.R.inc(5984);dlg.setVisible(true);
        __CLR4_5_24m24m2lx1h736m.R.inc(5985);return board;
    }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

    private static List<Placement> parseFile(File file, Side side, boolean createMissingParts)
            throws Exception {try{__CLR4_5_24m24m2lx1h736m.R.inc(5986);
        __CLR4_5_24m24m2lx1h736m.R.inc(5987);BufferedReader reader =
                new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        __CLR4_5_24m24m2lx1h736m.R.inc(5988);ArrayList<Placement> placements = new ArrayList<>();
        __CLR4_5_24m24m2lx1h736m.R.inc(5989);String line;

        // See:
        // http://bazaar.launchpad.net/~kicad-product-committers/kicad/product/view/head:/pcbnew/exporters/gen_modules_placefile.cpp
        // ### Module positions - created on Tue 25 Mar 2014 03:42:43 PM PDT ###
        // ### Printed by Pcbnew version pcbnew (2014-01-24 BZR 4632)-product
        // ## Unit = mm, Angle = deg.
        // ## Side : F.Cu
        // # Ref Val Package PosX PosY Rot Side
        // C1 100u Capacitors_SMD:c 128.9050 -52.0700 0.0 F.Cu
        // C2 100u Capacitors_SMD:c 93.3450 -77.4700 180.0 F.Cu
        // C3 100u Capacitors_SMD:c 67.9450 -77.4700 180.0 F.Cu

        __CLR4_5_24m24m2lx1h736m.R.inc(5990);Pattern pattern = Pattern.compile(
                "(\\S+)\\s+(.*?)\\s+(.*?)\\s+(-?\\d+\\.\\d+)\\s+(-?\\d+\\.\\d+)\\s+(-?\\d+\\.\\d+)\\s(.*?)");

        __CLR4_5_24m24m2lx1h736m.R.inc(5991);while ((line = reader.readLine()) != null) {{
            __CLR4_5_24m24m2lx1h736m.R.inc(5994);line = line.trim();
            __CLR4_5_24m24m2lx1h736m.R.inc(5995);if ((((line.length() == 0 || line.charAt(0) == '#')&&(__CLR4_5_24m24m2lx1h736m.R.iget(5996)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(5997)==0&false))) {{
                __CLR4_5_24m24m2lx1h736m.R.inc(5998);continue;
            }



            }__CLR4_5_24m24m2lx1h736m.R.inc(5999);Matcher matcher = pattern.matcher(line);
            __CLR4_5_24m24m2lx1h736m.R.inc(6000);matcher.matches();

            __CLR4_5_24m24m2lx1h736m.R.inc(6001);String placementId = matcher.group(1);
            __CLR4_5_24m24m2lx1h736m.R.inc(6002);String partValue = matcher.group(2);
            __CLR4_5_24m24m2lx1h736m.R.inc(6003);String pkgName = matcher.group(3);
            __CLR4_5_24m24m2lx1h736m.R.inc(6004);double placementX = Double.parseDouble(matcher.group(4));
            __CLR4_5_24m24m2lx1h736m.R.inc(6005);double placementY = Double.parseDouble(matcher.group(5));
            __CLR4_5_24m24m2lx1h736m.R.inc(6006);double placementRotation = Double.parseDouble(matcher.group(6));
            __CLR4_5_24m24m2lx1h736m.R.inc(6007);String placementLayer = matcher.group(7);

            __CLR4_5_24m24m2lx1h736m.R.inc(6008);Placement placement = new Placement(placementId);
            __CLR4_5_24m24m2lx1h736m.R.inc(6009);placement.setLocation(new Location(LengthUnit.Millimeters, placementX, placementY, 0,
                    placementRotation));
            __CLR4_5_24m24m2lx1h736m.R.inc(6010);Configuration cfg = Configuration.get();
            __CLR4_5_24m24m2lx1h736m.R.inc(6011);if ((((cfg != null && createMissingParts)&&(__CLR4_5_24m24m2lx1h736m.R.iget(6012)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6013)==0&false))) {{
                __CLR4_5_24m24m2lx1h736m.R.inc(6014);String partId = pkgName + "-" + partValue;
                __CLR4_5_24m24m2lx1h736m.R.inc(6015);Part part = cfg.getPart(partId);
                __CLR4_5_24m24m2lx1h736m.R.inc(6016);if ((((part == null)&&(__CLR4_5_24m24m2lx1h736m.R.iget(6017)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6018)==0&false))) {{
                    __CLR4_5_24m24m2lx1h736m.R.inc(6019);part = new Part(partId);
                    __CLR4_5_24m24m2lx1h736m.R.inc(6020);Package pkg = cfg.getPackage(pkgName);
                    __CLR4_5_24m24m2lx1h736m.R.inc(6021);if ((((pkg == null)&&(__CLR4_5_24m24m2lx1h736m.R.iget(6022)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6023)==0&false))) {{
                        __CLR4_5_24m24m2lx1h736m.R.inc(6024);pkg = new Package(pkgName);
                        __CLR4_5_24m24m2lx1h736m.R.inc(6025);cfg.addPackage(pkg);
                    }
                    }__CLR4_5_24m24m2lx1h736m.R.inc(6026);part.setPackage(pkg);

                    __CLR4_5_24m24m2lx1h736m.R.inc(6027);cfg.addPart(part);
                }
                }__CLR4_5_24m24m2lx1h736m.R.inc(6028);placement.setPart(part);

            }

            }__CLR4_5_24m24m2lx1h736m.R.inc(6029);placement.setSide(side);
            __CLR4_5_24m24m2lx1h736m.R.inc(6030);placements.add(placement);
        }
        }__CLR4_5_24m24m2lx1h736m.R.inc(6031);reader.close();
        __CLR4_5_24m24m2lx1h736m.R.inc(6032);return placements;
    }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

    class Dlg extends JDialog {
        private JTextField textFieldTopFile;
        private JTextField textFieldBottomFile;
        private final Action browseTopFileAction = new SwingAction();
        private final Action browseBottomFileAction = new SwingAction_1();
        private final Action importAction = new SwingAction_2();
        private final Action cancelAction = new SwingAction_3();
        private JCheckBox chckbxCreateMissingParts;

        public Dlg(Frame parent) {
            super(parent, DESCRIPTION, true);__CLR4_5_24m24m2lx1h736m.R.inc(6034);try{__CLR4_5_24m24m2lx1h736m.R.inc(6033);
            __CLR4_5_24m24m2lx1h736m.R.inc(6035);getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            __CLR4_5_24m24m2lx1h736m.R.inc(6036);JPanel panel = new JPanel();
            __CLR4_5_24m24m2lx1h736m.R.inc(6037);panel.setBorder(new TitledBorder(null, "Files", TitledBorder.LEADING, TitledBorder.TOP,
                    null, null));
            __CLR4_5_24m24m2lx1h736m.R.inc(6038);getContentPane().add(panel);
            __CLR4_5_24m24m2lx1h736m.R.inc(6039);panel.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                            FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_24m24m2lx1h736m.R.inc(6040);JLabel lblTopFilemnt = new JLabel("Top File (.pos)");
            __CLR4_5_24m24m2lx1h736m.R.inc(6041);panel.add(lblTopFilemnt, "2, 2, right, default");

            __CLR4_5_24m24m2lx1h736m.R.inc(6042);textFieldTopFile = new JTextField();
            __CLR4_5_24m24m2lx1h736m.R.inc(6043);panel.add(textFieldTopFile, "4, 2, fill, default");
            __CLR4_5_24m24m2lx1h736m.R.inc(6044);textFieldTopFile.setColumns(10);

            __CLR4_5_24m24m2lx1h736m.R.inc(6045);JButton btnBrowse = new JButton("Browse");
            __CLR4_5_24m24m2lx1h736m.R.inc(6046);btnBrowse.setAction(browseTopFileAction);
            __CLR4_5_24m24m2lx1h736m.R.inc(6047);panel.add(btnBrowse, "6, 2");

            __CLR4_5_24m24m2lx1h736m.R.inc(6048);JLabel lblBottomFilemnb = new JLabel("Bottom File (.pos)");
            __CLR4_5_24m24m2lx1h736m.R.inc(6049);panel.add(lblBottomFilemnb, "2, 4, right, default");

            __CLR4_5_24m24m2lx1h736m.R.inc(6050);textFieldBottomFile = new JTextField();
            __CLR4_5_24m24m2lx1h736m.R.inc(6051);panel.add(textFieldBottomFile, "4, 4, fill, default");
            __CLR4_5_24m24m2lx1h736m.R.inc(6052);textFieldBottomFile.setColumns(10);

            __CLR4_5_24m24m2lx1h736m.R.inc(6053);JButton btnBrowse_1 = new JButton("Browse");
            __CLR4_5_24m24m2lx1h736m.R.inc(6054);btnBrowse_1.setAction(browseBottomFileAction);
            __CLR4_5_24m24m2lx1h736m.R.inc(6055);panel.add(btnBrowse_1, "6, 4");

            __CLR4_5_24m24m2lx1h736m.R.inc(6056);JPanel panel_1 = new JPanel();
            __CLR4_5_24m24m2lx1h736m.R.inc(6057);panel_1.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING,
                    TitledBorder.TOP, null, null));
            __CLR4_5_24m24m2lx1h736m.R.inc(6058);getContentPane().add(panel_1);
            __CLR4_5_24m24m2lx1h736m.R.inc(6059);panel_1.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_24m24m2lx1h736m.R.inc(6060);chckbxCreateMissingParts = new JCheckBox("Create Missing Parts");
            __CLR4_5_24m24m2lx1h736m.R.inc(6061);chckbxCreateMissingParts.setSelected(true);
            __CLR4_5_24m24m2lx1h736m.R.inc(6062);panel_1.add(chckbxCreateMissingParts, "2, 2");

            __CLR4_5_24m24m2lx1h736m.R.inc(6063);JSeparator separator = new JSeparator();
            __CLR4_5_24m24m2lx1h736m.R.inc(6064);getContentPane().add(separator);

            __CLR4_5_24m24m2lx1h736m.R.inc(6065);JPanel panel_2 = new JPanel();
            __CLR4_5_24m24m2lx1h736m.R.inc(6066);FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
            __CLR4_5_24m24m2lx1h736m.R.inc(6067);flowLayout.setAlignment(FlowLayout.RIGHT);
            __CLR4_5_24m24m2lx1h736m.R.inc(6068);getContentPane().add(panel_2);

            __CLR4_5_24m24m2lx1h736m.R.inc(6069);JButton btnCancel = new JButton("Cancel");
            __CLR4_5_24m24m2lx1h736m.R.inc(6070);btnCancel.setAction(cancelAction);
            __CLR4_5_24m24m2lx1h736m.R.inc(6071);panel_2.add(btnCancel);

            __CLR4_5_24m24m2lx1h736m.R.inc(6072);JButton btnImport = new JButton("Import");
            __CLR4_5_24m24m2lx1h736m.R.inc(6073);btnImport.setAction(importAction);
            __CLR4_5_24m24m2lx1h736m.R.inc(6074);panel_2.add(btnImport);

            __CLR4_5_24m24m2lx1h736m.R.inc(6075);setSize(400, 400);
            __CLR4_5_24m24m2lx1h736m.R.inc(6076);setLocationRelativeTo(parent);

            __CLR4_5_24m24m2lx1h736m.R.inc(6077);JRootPane rootPane = getRootPane();
            __CLR4_5_24m24m2lx1h736m.R.inc(6078);KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
            __CLR4_5_24m24m2lx1h736m.R.inc(6079);InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            __CLR4_5_24m24m2lx1h736m.R.inc(6080);inputMap.put(stroke, "ESCAPE");
            __CLR4_5_24m24m2lx1h736m.R.inc(6081);rootPane.getActionMap().put("ESCAPE", cancelAction);
        }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

        private class SwingAction extends AbstractAction {
            public SwingAction() {try{__CLR4_5_24m24m2lx1h736m.R.inc(6082);
                __CLR4_5_24m24m2lx1h736m.R.inc(6083);putValue(NAME, "Browse");
                __CLR4_5_24m24m2lx1h736m.R.inc(6084);putValue(SHORT_DESCRIPTION, "Browse");
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24m24m2lx1h736m.R.inc(6085);
                __CLR4_5_24m24m2lx1h736m.R.inc(6086);FileDialog fileDialog = new FileDialog(Dlg.this);
                __CLR4_5_24m24m2lx1h736m.R.inc(6087);fileDialog.setFilenameFilter(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {try{__CLR4_5_24m24m2lx1h736m.R.inc(6088);
                        __CLR4_5_24m24m2lx1h736m.R.inc(6089);return name.toLowerCase().endsWith(".pos");
                    }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}
                });
                __CLR4_5_24m24m2lx1h736m.R.inc(6090);fileDialog.setVisible(true);
                __CLR4_5_24m24m2lx1h736m.R.inc(6091);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24m24m2lx1h736m.R.iget(6092)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6093)==0&false))) {{
                    __CLR4_5_24m24m2lx1h736m.R.inc(6094);return;
                }
                }__CLR4_5_24m24m2lx1h736m.R.inc(6095);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_24m24m2lx1h736m.R.inc(6096);textFieldTopFile.setText(file.getAbsolutePath());
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}
        }

        private class SwingAction_1 extends AbstractAction {
            public SwingAction_1() {try{__CLR4_5_24m24m2lx1h736m.R.inc(6097);
                __CLR4_5_24m24m2lx1h736m.R.inc(6098);putValue(NAME, "Browse");
                __CLR4_5_24m24m2lx1h736m.R.inc(6099);putValue(SHORT_DESCRIPTION, "Browse");
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24m24m2lx1h736m.R.inc(6100);
                __CLR4_5_24m24m2lx1h736m.R.inc(6101);FileDialog fileDialog = new FileDialog(Dlg.this);
                __CLR4_5_24m24m2lx1h736m.R.inc(6102);fileDialog.setFilenameFilter(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {try{__CLR4_5_24m24m2lx1h736m.R.inc(6103);
                        __CLR4_5_24m24m2lx1h736m.R.inc(6104);return name.toLowerCase().endsWith(".pos");
                    }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}
                });
                __CLR4_5_24m24m2lx1h736m.R.inc(6105);fileDialog.setVisible(true);
                __CLR4_5_24m24m2lx1h736m.R.inc(6106);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24m24m2lx1h736m.R.iget(6107)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6108)==0&false))) {{
                    __CLR4_5_24m24m2lx1h736m.R.inc(6109);return;
                }
                }__CLR4_5_24m24m2lx1h736m.R.inc(6110);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_24m24m2lx1h736m.R.inc(6111);textFieldBottomFile.setText(file.getAbsolutePath());
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}
        }

        private class SwingAction_2 extends AbstractAction {
            public SwingAction_2() {try{__CLR4_5_24m24m2lx1h736m.R.inc(6112);
                __CLR4_5_24m24m2lx1h736m.R.inc(6113);putValue(NAME, "Import");
                __CLR4_5_24m24m2lx1h736m.R.inc(6114);putValue(SHORT_DESCRIPTION, "Import");
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24m24m2lx1h736m.R.inc(6115);
                __CLR4_5_24m24m2lx1h736m.R.inc(6116);topFile = new File(textFieldTopFile.getText());
                __CLR4_5_24m24m2lx1h736m.R.inc(6117);bottomFile = new File(textFieldBottomFile.getText());
                __CLR4_5_24m24m2lx1h736m.R.inc(6118);board = new Board();
                __CLR4_5_24m24m2lx1h736m.R.inc(6119);List<Placement> placements = new ArrayList<>();
                __CLR4_5_24m24m2lx1h736m.R.inc(6120);try {
                    __CLR4_5_24m24m2lx1h736m.R.inc(6121);if ((((topFile.exists())&&(__CLR4_5_24m24m2lx1h736m.R.iget(6122)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6123)==0&false))) {{
                        __CLR4_5_24m24m2lx1h736m.R.inc(6124);placements.addAll(parseFile(topFile, Side.Top,
                                chckbxCreateMissingParts.isSelected()));
                    }
                    }__CLR4_5_24m24m2lx1h736m.R.inc(6125);if ((((bottomFile.exists())&&(__CLR4_5_24m24m2lx1h736m.R.iget(6126)!=0|true))||(__CLR4_5_24m24m2lx1h736m.R.iget(6127)==0&false))) {{
                        __CLR4_5_24m24m2lx1h736m.R.inc(6128);placements.addAll(parseFile(bottomFile, Side.Bottom,
                                chckbxCreateMissingParts.isSelected()));
                    }
                }}
                catch (Exception e1) {
                    __CLR4_5_24m24m2lx1h736m.R.inc(6129);MessageBoxes.errorBox(Dlg.this, "Import Error", e1);
                    __CLR4_5_24m24m2lx1h736m.R.inc(6130);return;
                }
                __CLR4_5_24m24m2lx1h736m.R.inc(6131);for (Placement placement : placements) {{
                    __CLR4_5_24m24m2lx1h736m.R.inc(6132);board.addPlacement(placement);
                }
                }__CLR4_5_24m24m2lx1h736m.R.inc(6133);setVisible(false);
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}
        }

        private class SwingAction_3 extends AbstractAction {
            public SwingAction_3() {try{__CLR4_5_24m24m2lx1h736m.R.inc(6134);
                __CLR4_5_24m24m2lx1h736m.R.inc(6135);putValue(NAME, "Cancel");
                __CLR4_5_24m24m2lx1h736m.R.inc(6136);putValue(SHORT_DESCRIPTION, "Cancel");
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24m24m2lx1h736m.R.inc(6137);
                __CLR4_5_24m24m2lx1h736m.R.inc(6138);setVisible(false);
            }finally{__CLR4_5_24m24m2lx1h736m.R.flushNeeded();}}
        }
    }
}
