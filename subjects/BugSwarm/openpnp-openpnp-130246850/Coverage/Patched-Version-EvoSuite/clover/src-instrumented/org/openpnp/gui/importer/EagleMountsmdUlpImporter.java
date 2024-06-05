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
public class EagleMountsmdUlpImporter implements BoardImporter {public static class __CLR4_5_24hm4hmlx1h5lvm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,5978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String NAME = "EAGLE mountsmd.ulp";
    private final static String DESCRIPTION = "Import files generated by EAGLE's mountsmd.ulp.";

    private Board board;
    private File topFile, bottomFile;

    @Override
    public String getImporterName() {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5818);
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5819);return NAME;
    }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

    @Override
    public String getImporterDescription() {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5820);
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5821);return DESCRIPTION;
    }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

    @Override
    public Board importBoard(Frame parent) throws Exception {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5822);
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5823);Dlg dlg = new Dlg(parent);
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5824);dlg.setVisible(true);
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5825);return board;
    }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

    private static List<Placement> parseFile(File file, Side side, boolean createMissingParts)
            throws Exception {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5826);
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5827);BufferedReader reader =
                new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5828);ArrayList<Placement> placements = new ArrayList<>();
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5829);String line;
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5830);while ((line = reader.readLine()) != null) {{
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5833);line = line.trim();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5834);if ((((line.length() == 0)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5835)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5836)==0&false))) {{
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5837);continue;
            }

            // C1 41.91 34.93 180 0.1uF C0805
            // T10 21.59 14.22 90 SOT23-BEC
            // printf("%s %5.2f %5.2f %3.0f %s %s\n",
            }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5838);Pattern pattern = Pattern.compile(
                    "(\\S+)\\s+(-?\\d+\\.\\d+)\\s+(-?\\d+\\.\\d+)\\s+(-?\\d{1,3})\\s(.*)\\s(.*)");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5839);Matcher matcher = pattern.matcher(line);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5840);matcher.matches();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5841);Placement placement = new Placement(matcher.group(1));
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5842);placement.setLocation(new Location(LengthUnit.Millimeters,
                    Double.parseDouble(matcher.group(2)), Double.parseDouble(matcher.group(3)), 0,
                    Double.parseDouble(matcher.group(4))));
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5843);Configuration cfg = Configuration.get();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5844);if ((((cfg != null && createMissingParts)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5845)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5846)==0&false))) {{
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5847);String value = matcher.group(5);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5848);String packageId = matcher.group(6);

                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5849);String partId = packageId;
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5850);if ((((value.trim().length() > 0)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5851)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5852)==0&false))) {{
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5853);partId += "-" + value;
                }
                }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5854);Part part = cfg.getPart(partId);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5855);if ((((part == null)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5856)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5857)==0&false))) {{
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5858);part = new Part(partId);
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5859);Package pkg = cfg.getPackage(packageId);
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5860);if ((((pkg == null)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5861)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5862)==0&false))) {{
                        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5863);pkg = new Package(packageId);
                        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5864);cfg.addPackage(pkg);
                    }
                    }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5865);part.setPackage(pkg);

                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5866);cfg.addPart(part);
                }
                }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5867);placement.setPart(part);

            }

            }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5868);placement.setSide(side);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5869);placements.add(placement);
        }
        }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5870);reader.close();
        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5871);return placements;
    }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

    class Dlg extends JDialog {
        private JTextField textFieldTopFile;
        private JTextField textFieldBottomFile;
        private final Action browseTopFileAction = new SwingAction();
        private final Action browseBottomFileAction = new SwingAction_1();
        private final Action importAction = new SwingAction_2();
        private final Action cancelAction = new SwingAction_3();
        private JCheckBox chckbxCreateMissingParts;

        public Dlg(Frame parent) {
            super(parent, DESCRIPTION, true);__CLR4_5_24hm4hmlx1h5lvm.R.inc(5873);try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5872);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5874);getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5875);JPanel panel = new JPanel();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5876);panel.setBorder(new TitledBorder(null, "Files", TitledBorder.LEADING, TitledBorder.TOP,
                    null, null));
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5877);getContentPane().add(panel);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5878);panel.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                            FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5879);JLabel lblTopFilemnt = new JLabel("Top File (.mnt)");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5880);panel.add(lblTopFilemnt, "2, 2, right, default");

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5881);textFieldTopFile = new JTextField();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5882);panel.add(textFieldTopFile, "4, 2, fill, default");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5883);textFieldTopFile.setColumns(10);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5884);JButton btnBrowse = new JButton("Browse");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5885);btnBrowse.setAction(browseTopFileAction);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5886);panel.add(btnBrowse, "6, 2");

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5887);JLabel lblBottomFilemnb = new JLabel("Bottom File (.mnb)");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5888);panel.add(lblBottomFilemnb, "2, 4, right, default");

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5889);textFieldBottomFile = new JTextField();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5890);panel.add(textFieldBottomFile, "4, 4, fill, default");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5891);textFieldBottomFile.setColumns(10);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5892);JButton btnBrowse_1 = new JButton("Browse");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5893);btnBrowse_1.setAction(browseBottomFileAction);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5894);panel.add(btnBrowse_1, "6, 4");

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5895);JPanel panel_1 = new JPanel();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5896);panel_1.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING,
                    TitledBorder.TOP, null, null));
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5897);getContentPane().add(panel_1);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5898);panel_1.setLayout(new FormLayout(
                    new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                    new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5899);chckbxCreateMissingParts = new JCheckBox("Create Missing Parts");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5900);chckbxCreateMissingParts.setSelected(true);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5901);panel_1.add(chckbxCreateMissingParts, "2, 2");

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5902);JSeparator separator = new JSeparator();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5903);getContentPane().add(separator);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5904);JPanel panel_2 = new JPanel();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5905);FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5906);flowLayout.setAlignment(FlowLayout.RIGHT);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5907);getContentPane().add(panel_2);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5908);JButton btnCancel = new JButton("Cancel");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5909);btnCancel.setAction(cancelAction);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5910);panel_2.add(btnCancel);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5911);JButton btnImport = new JButton("Import");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5912);btnImport.setAction(importAction);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5913);panel_2.add(btnImport);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5914);setSize(400, 400);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5915);setLocationRelativeTo(parent);

            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5916);JRootPane rootPane = getRootPane();
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5917);KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5918);InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5919);inputMap.put(stroke, "ESCAPE");
            __CLR4_5_24hm4hmlx1h5lvm.R.inc(5920);rootPane.getActionMap().put("ESCAPE", cancelAction);
        }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

        private class SwingAction extends AbstractAction {
            public SwingAction() {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5921);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5922);putValue(NAME, "Browse");
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5923);putValue(SHORT_DESCRIPTION, "Browse");
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5924);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5925);FileDialog fileDialog = new FileDialog(Dlg.this);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5926);fileDialog.setFilenameFilter(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5927);
                        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5928);return name.toLowerCase().endsWith(".mnt");
                    }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}
                });
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5929);fileDialog.setVisible(true);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5930);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5931)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5932)==0&false))) {{
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5933);return;
                }
                }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5934);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5935);textFieldTopFile.setText(file.getAbsolutePath());
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}
        }

        private class SwingAction_1 extends AbstractAction {
            public SwingAction_1() {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5936);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5937);putValue(NAME, "Browse");
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5938);putValue(SHORT_DESCRIPTION, "Browse");
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5939);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5940);FileDialog fileDialog = new FileDialog(Dlg.this);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5941);fileDialog.setFilenameFilter(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5942);
                        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5943);return name.toLowerCase().endsWith(".mnb");
                    }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}
                });
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5944);fileDialog.setVisible(true);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5945);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5946)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5947)==0&false))) {{
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5948);return;
                }
                }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5949);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5950);textFieldBottomFile.setText(file.getAbsolutePath());
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}
        }

        private class SwingAction_2 extends AbstractAction {
            public SwingAction_2() {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5951);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5952);putValue(NAME, "Import");
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5953);putValue(SHORT_DESCRIPTION, "Import");
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5954);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5955);topFile = new File(textFieldTopFile.getText());
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5956);bottomFile = new File(textFieldBottomFile.getText());
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5957);board = new Board();
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5958);List<Placement> placements = new ArrayList<>();
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5959);try {
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5960);if ((((topFile.exists())&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5961)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5962)==0&false))) {{
                        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5963);placements.addAll(parseFile(topFile, Side.Top,
                                chckbxCreateMissingParts.isSelected()));
                    }
                    }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5964);if ((((bottomFile.exists())&&(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5965)!=0|true))||(__CLR4_5_24hm4hmlx1h5lvm.R.iget(5966)==0&false))) {{
                        __CLR4_5_24hm4hmlx1h5lvm.R.inc(5967);placements.addAll(parseFile(bottomFile, Side.Bottom,
                                chckbxCreateMissingParts.isSelected()));
                    }
                }}
                catch (Exception e1) {
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5968);MessageBoxes.errorBox(Dlg.this, "Import Error", e1);
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5969);return;
                }
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5970);for (Placement placement : placements) {{
                    __CLR4_5_24hm4hmlx1h5lvm.R.inc(5971);board.addPlacement(placement);
                }
                }__CLR4_5_24hm4hmlx1h5lvm.R.inc(5972);setVisible(false);
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}
        }

        private class SwingAction_3 extends AbstractAction {
            public SwingAction_3() {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5973);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5974);putValue(NAME, "Cancel");
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5975);putValue(SHORT_DESCRIPTION, "Cancel");
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}

            public void actionPerformed(ActionEvent e) {try{__CLR4_5_24hm4hmlx1h5lvm.R.inc(5976);
                __CLR4_5_24hm4hmlx1h5lvm.R.inc(5977);setVisible(false);
            }finally{__CLR4_5_24hm4hmlx1h5lvm.R.flushNeeded();}}
        }
    }
}
