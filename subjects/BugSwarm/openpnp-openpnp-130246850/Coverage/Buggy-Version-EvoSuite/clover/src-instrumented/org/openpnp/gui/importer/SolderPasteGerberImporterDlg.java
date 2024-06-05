/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.importer;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder;

import org.openpnp.gui.importer.rs274x.Rs274xParser;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardPad;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

class SolderPasteGerberImporterDlg extends JDialog {public static class __CLR4_5_24ys4yslx1h09oi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,6536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final SolderPasteGerberImporter solderPasteGerberImporter;
    private JTextField textFieldTopFile;
    private JTextField textFieldBottomFile;
    private final Action browseTopFileAction = new SwingAction();
    private final Action browseBottomFileAction = new SwingAction_1();
    private final Action importAction = new SwingAction_2();
    private final Action cancelAction = new SwingAction_3();

    public SolderPasteGerberImporterDlg(SolderPasteGerberImporter solderPasteGerberImporter,
            Frame parent) {
        super(parent, SolderPasteGerberImporter.DESCRIPTION, true);__CLR4_5_24ys4yslx1h09oi.R.inc(6437);try{__CLR4_5_24ys4yslx1h09oi.R.inc(6436);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6438);this.solderPasteGerberImporter = solderPasteGerberImporter;
        __CLR4_5_24ys4yslx1h09oi.R.inc(6439);getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        __CLR4_5_24ys4yslx1h09oi.R.inc(6440);JPanel panel = new JPanel();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6441);panel.setBorder(new TitledBorder(null, "Files", TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        __CLR4_5_24ys4yslx1h09oi.R.inc(6442);getContentPane().add(panel);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6443);panel.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_24ys4yslx1h09oi.R.inc(6444);JLabel lblTopFilemnt = new JLabel("Top Paste Gerber");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6445);panel.add(lblTopFilemnt, "2, 2, right, default");

        __CLR4_5_24ys4yslx1h09oi.R.inc(6446);textFieldTopFile = new JTextField();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6447);panel.add(textFieldTopFile, "4, 2, fill, default");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6448);textFieldTopFile.setColumns(10);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6449);JButton btnBrowse = new JButton("Browse");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6450);btnBrowse.setAction(browseTopFileAction);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6451);panel.add(btnBrowse, "6, 2");

        __CLR4_5_24ys4yslx1h09oi.R.inc(6452);JLabel lblBottomFilemnb = new JLabel("Bottom Paste Gerber");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6453);panel.add(lblBottomFilemnb, "2, 4, right, default");

        __CLR4_5_24ys4yslx1h09oi.R.inc(6454);textFieldBottomFile = new JTextField();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6455);panel.add(textFieldBottomFile, "4, 4, fill, default");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6456);textFieldBottomFile.setColumns(10);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6457);JButton btnBrowse_1 = new JButton("Browse");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6458);btnBrowse_1.setAction(browseBottomFileAction);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6459);panel.add(btnBrowse_1, "6, 4");

        __CLR4_5_24ys4yslx1h09oi.R.inc(6460);JSeparator separator = new JSeparator();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6461);getContentPane().add(separator);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6462);JPanel panel_2 = new JPanel();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6463);FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6464);flowLayout.setAlignment(FlowLayout.RIGHT);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6465);getContentPane().add(panel_2);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6466);JButton btnCancel = new JButton("Cancel");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6467);btnCancel.setAction(cancelAction);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6468);panel_2.add(btnCancel);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6469);JButton btnImport = new JButton("Import");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6470);btnImport.setAction(importAction);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6471);panel_2.add(btnImport);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6472);setSize(400, 400);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6473);setLocationRelativeTo(parent);

        __CLR4_5_24ys4yslx1h09oi.R.inc(6474);JRootPane rootPane = getRootPane();
        __CLR4_5_24ys4yslx1h09oi.R.inc(6475);KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6476);InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        __CLR4_5_24ys4yslx1h09oi.R.inc(6477);inputMap.put(stroke, "ESCAPE");
        __CLR4_5_24ys4yslx1h09oi.R.inc(6478);rootPane.getActionMap().put("ESCAPE", cancelAction);
    }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}

    private class SwingAction extends AbstractAction {
        public SwingAction() {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6479);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6480);putValue(NAME, "Browse");
            __CLR4_5_24ys4yslx1h09oi.R.inc(6481);putValue(SHORT_DESCRIPTION, "Browse");
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}

        public void actionPerformed(ActionEvent e) {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6482);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6483);FileDialog fileDialog = new FileDialog(SolderPasteGerberImporterDlg.this);
            // fileDialog.setFilenameFilter(new FilenameFilter() {
            // @Override
            // public boolean accept(File dir, String name) {
            // return name.toLowerCase().endsWith(".mnt");
            // }
            // });
            __CLR4_5_24ys4yslx1h09oi.R.inc(6484);fileDialog.setVisible(true);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6485);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24ys4yslx1h09oi.R.iget(6486)!=0|true))||(__CLR4_5_24ys4yslx1h09oi.R.iget(6487)==0&false))) {{
                __CLR4_5_24ys4yslx1h09oi.R.inc(6488);return;
            }
            }__CLR4_5_24ys4yslx1h09oi.R.inc(6489);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
            __CLR4_5_24ys4yslx1h09oi.R.inc(6490);textFieldTopFile.setText(file.getAbsolutePath());
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}
    }

    private class SwingAction_1 extends AbstractAction {
        public SwingAction_1() {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6491);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6492);putValue(NAME, "Browse");
            __CLR4_5_24ys4yslx1h09oi.R.inc(6493);putValue(SHORT_DESCRIPTION, "Browse");
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}

        public void actionPerformed(ActionEvent e) {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6494);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6495);FileDialog fileDialog = new FileDialog(SolderPasteGerberImporterDlg.this);
            // fileDialog.setFilenameFilter(new FilenameFilter() {
            // @Override
            // public boolean accept(File dir, String name) {
            // return name.toLowerCase().endsWith(".mnb");
            // }
            // });
            __CLR4_5_24ys4yslx1h09oi.R.inc(6496);fileDialog.setVisible(true);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6497);if ((((fileDialog.getFile() == null)&&(__CLR4_5_24ys4yslx1h09oi.R.iget(6498)!=0|true))||(__CLR4_5_24ys4yslx1h09oi.R.iget(6499)==0&false))) {{
                __CLR4_5_24ys4yslx1h09oi.R.inc(6500);return;
            }
            }__CLR4_5_24ys4yslx1h09oi.R.inc(6501);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
            __CLR4_5_24ys4yslx1h09oi.R.inc(6502);textFieldBottomFile.setText(file.getAbsolutePath());
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}
    }

    private class SwingAction_2 extends AbstractAction {
        public SwingAction_2() {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6503);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6504);putValue(NAME, "Import");
            __CLR4_5_24ys4yslx1h09oi.R.inc(6505);putValue(SHORT_DESCRIPTION, "Import");
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}

        public void actionPerformed(ActionEvent e) {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6506);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6507);SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.topFile =
                    new File(textFieldTopFile.getText());
            __CLR4_5_24ys4yslx1h09oi.R.inc(6508);SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.bottomFile =
                    new File(textFieldBottomFile.getText());
            __CLR4_5_24ys4yslx1h09oi.R.inc(6509);SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.board = new Board();
            __CLR4_5_24ys4yslx1h09oi.R.inc(6510);List<BoardPad> pads = new ArrayList<>();
            __CLR4_5_24ys4yslx1h09oi.R.inc(6511);try {
                __CLR4_5_24ys4yslx1h09oi.R.inc(6512);if ((((SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.topFile.exists())&&(__CLR4_5_24ys4yslx1h09oi.R.iget(6513)!=0|true))||(__CLR4_5_24ys4yslx1h09oi.R.iget(6514)==0&false))) {{
                    __CLR4_5_24ys4yslx1h09oi.R.inc(6515);List<BoardPad> topPads = new Rs274xParser().parseSolderPastePads(
                            SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.topFile);
                    __CLR4_5_24ys4yslx1h09oi.R.inc(6516);for (BoardPad pad : topPads) {{
                        __CLR4_5_24ys4yslx1h09oi.R.inc(6517);pad.setSide(Side.Top);
                    }
                    }__CLR4_5_24ys4yslx1h09oi.R.inc(6518);pads.addAll(topPads);
                }
                }__CLR4_5_24ys4yslx1h09oi.R.inc(6519);if ((((SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.bottomFile
                        .exists())&&(__CLR4_5_24ys4yslx1h09oi.R.iget(6520)!=0|true))||(__CLR4_5_24ys4yslx1h09oi.R.iget(6521)==0&false))) {{
                    __CLR4_5_24ys4yslx1h09oi.R.inc(6522);List<BoardPad> bottomPads = new Rs274xParser().parseSolderPastePads(
                            SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.bottomFile);
                    __CLR4_5_24ys4yslx1h09oi.R.inc(6523);for (BoardPad pad : bottomPads) {{
                        __CLR4_5_24ys4yslx1h09oi.R.inc(6524);pad.setSide(Side.Bottom);
                    }
                    }__CLR4_5_24ys4yslx1h09oi.R.inc(6525);pads.addAll(bottomPads);
                }
            }}
            catch (Exception e1) {
                __CLR4_5_24ys4yslx1h09oi.R.inc(6526);MessageBoxes.errorBox(SolderPasteGerberImporterDlg.this, "Import Error", e1);
                __CLR4_5_24ys4yslx1h09oi.R.inc(6527);return;
            }
            __CLR4_5_24ys4yslx1h09oi.R.inc(6528);for (BoardPad pad : pads) {{
                __CLR4_5_24ys4yslx1h09oi.R.inc(6529);SolderPasteGerberImporterDlg.this.solderPasteGerberImporter.board
                        .addSolderPastePad(pad);
            }
            }__CLR4_5_24ys4yslx1h09oi.R.inc(6530);setVisible(false);
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}
    }

    private class SwingAction_3 extends AbstractAction {
        public SwingAction_3() {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6531);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6532);putValue(NAME, "Cancel");
            __CLR4_5_24ys4yslx1h09oi.R.inc(6533);putValue(SHORT_DESCRIPTION, "Cancel");
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}

        public void actionPerformed(ActionEvent e) {try{__CLR4_5_24ys4yslx1h09oi.R.inc(6534);
            __CLR4_5_24ys4yslx1h09oi.R.inc(6535);setVisible(false);
        }finally{__CLR4_5_24ys4yslx1h09oi.R.flushNeeded();}}
    }
}
