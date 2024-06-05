/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.components.ClassSelectionDialog;
import org.openpnp.gui.support.ActionGroup;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.tablemodel.PadsTableModel;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.BoardPad;
import org.openpnp.model.BoardPad.Type;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.model.Pad;
import org.openpnp.spi.Camera;
import org.openpnp.spi.PasteDispenser;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.openpnp.util.Utils2D;

public class JobPastePanel extends JPanel {public static class __CLR4_5_2zszslx1h31sj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,1478,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JTable table;
    private PadsTableModel tableModel;
    private ActionGroup boardLocationSelectionActionGroup;
    private ActionGroup singleSelectionActionGroup;
    private ActionGroup multiSelectionActionGroup;
    private ActionGroup captureAndPositionActionGroup;
    private BoardLocation boardLocation;

    private static Color typeColorIgnore = new Color(252, 255, 157);
    private static Color typeColorPaste = new Color(157, 255, 168);

    public JobPastePanel(JobPanel jobPanel) {try{__CLR4_5_2zszslx1h31sj.R.inc(1288);
        __CLR4_5_2zszslx1h31sj.R.inc(1289);Configuration configuration = Configuration.get();

        __CLR4_5_2zszslx1h31sj.R.inc(1290);boardLocationSelectionActionGroup = new ActionGroup(newAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1291);boardLocationSelectionActionGroup.setEnabled(false);

        __CLR4_5_2zszslx1h31sj.R.inc(1292);singleSelectionActionGroup = new ActionGroup(removeAction, setTypeAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1293);singleSelectionActionGroup.setEnabled(false);

        __CLR4_5_2zszslx1h31sj.R.inc(1294);multiSelectionActionGroup = new ActionGroup(removeAction, setTypeAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1295);multiSelectionActionGroup.setEnabled(false);

        __CLR4_5_2zszslx1h31sj.R.inc(1296);captureAndPositionActionGroup =
                new ActionGroup(moveCameraToPadLocation, moveToolToPadLocation);
        __CLR4_5_2zszslx1h31sj.R.inc(1297);captureAndPositionActionGroup.setEnabled(false);

        __CLR4_5_2zszslx1h31sj.R.inc(1298);JComboBox<Side> sidesComboBox = new JComboBox(Side.values());
        __CLR4_5_2zszslx1h31sj.R.inc(1299);JComboBox<Type> typesComboBox = new JComboBox(Type.values());

        __CLR4_5_2zszslx1h31sj.R.inc(1300);setLayout(new BorderLayout(0, 0));
        __CLR4_5_2zszslx1h31sj.R.inc(1301);JToolBar toolBar = new JToolBar();
        __CLR4_5_2zszslx1h31sj.R.inc(1302);add(toolBar, BorderLayout.NORTH);

        __CLR4_5_2zszslx1h31sj.R.inc(1303);toolBar.setFloatable(false);
        __CLR4_5_2zszslx1h31sj.R.inc(1304);JButton btnNewPad = new JButton(newAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1305);btnNewPad.setHideActionText(true);
        __CLR4_5_2zszslx1h31sj.R.inc(1306);toolBar.add(btnNewPad);
        __CLR4_5_2zszslx1h31sj.R.inc(1307);JButton btnRemovePad = new JButton(removeAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1308);btnRemovePad.setHideActionText(true);
        __CLR4_5_2zszslx1h31sj.R.inc(1309);toolBar.add(btnRemovePad);
        __CLR4_5_2zszslx1h31sj.R.inc(1310);toolBar.addSeparator();


        __CLR4_5_2zszslx1h31sj.R.inc(1311);JButton btnPositionCameraPositionLocation = new JButton(moveCameraToPadLocation);
        __CLR4_5_2zszslx1h31sj.R.inc(1312);btnPositionCameraPositionLocation.setHideActionText(true);
        __CLR4_5_2zszslx1h31sj.R.inc(1313);toolBar.add(btnPositionCameraPositionLocation);

        __CLR4_5_2zszslx1h31sj.R.inc(1314);JButton btnPositionToolPositionLocation = new JButton(moveToolToPadLocation);
        __CLR4_5_2zszslx1h31sj.R.inc(1315);btnPositionToolPositionLocation.setHideActionText(true);
        __CLR4_5_2zszslx1h31sj.R.inc(1316);toolBar.add(btnPositionToolPositionLocation);

        __CLR4_5_2zszslx1h31sj.R.inc(1317);toolBar.addSeparator();

        __CLR4_5_2zszslx1h31sj.R.inc(1318);tableModel = new PadsTableModel(configuration);

        __CLR4_5_2zszslx1h31sj.R.inc(1319);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_2zszslx1h31sj.R.inc(1320);table.setAutoCreateRowSorter(true);
        __CLR4_5_2zszslx1h31sj.R.inc(1321);table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        __CLR4_5_2zszslx1h31sj.R.inc(1322);table.setDefaultEditor(Side.class, new DefaultCellEditor(sidesComboBox));

        __CLR4_5_2zszslx1h31sj.R.inc(1323);table.setDefaultRenderer(Type.class, new TypeRenderer());
        __CLR4_5_2zszslx1h31sj.R.inc(1324);table.setDefaultEditor(Type.class, new DefaultCellEditor(typesComboBox));

        __CLR4_5_2zszslx1h31sj.R.inc(1325);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2zszslx1h31sj.R.inc(1326);
                __CLR4_5_2zszslx1h31sj.R.inc(1327);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2zszslx1h31sj.R.iget(1328)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1329)==0&false))) {{
                    __CLR4_5_2zszslx1h31sj.R.inc(1330);return;
                }

                }__CLR4_5_2zszslx1h31sj.R.inc(1331);if ((((getSelections().size() > 1)&&(__CLR4_5_2zszslx1h31sj.R.iget(1332)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1333)==0&false))) {{
                    // multi select
                    __CLR4_5_2zszslx1h31sj.R.inc(1334);singleSelectionActionGroup.setEnabled(false);
                    __CLR4_5_2zszslx1h31sj.R.inc(1335);captureAndPositionActionGroup.setEnabled(false);
                    __CLR4_5_2zszslx1h31sj.R.inc(1336);multiSelectionActionGroup.setEnabled(true);
                }
                }else {{
                    // single select, or no select
                    __CLR4_5_2zszslx1h31sj.R.inc(1337);multiSelectionActionGroup.setEnabled(false);
                    __CLR4_5_2zszslx1h31sj.R.inc(1338);singleSelectionActionGroup.setEnabled(getSelection() != null);
                    __CLR4_5_2zszslx1h31sj.R.inc(1339);captureAndPositionActionGroup.setEnabled(getSelection() != null
                            && getSelection().getSide() == boardLocation.getSide());
                }
            }}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
        });
        __CLR4_5_2zszslx1h31sj.R.inc(1340);table.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {try{__CLR4_5_2zszslx1h31sj.R.inc(1341);
                __CLR4_5_2zszslx1h31sj.R.inc(1342);if ((((e.getKeyChar() == ' ')&&(__CLR4_5_2zszslx1h31sj.R.iget(1343)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1344)==0&false))) {{
                    __CLR4_5_2zszslx1h31sj.R.inc(1345);BoardPad pad = getSelection();
                    __CLR4_5_2zszslx1h31sj.R.inc(1346);pad.setType((((pad.getType() == Type.Paste )&&(__CLR4_5_2zszslx1h31sj.R.iget(1347)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1348)==0&false))? Type.Ignore : Type.Paste);
                    __CLR4_5_2zszslx1h31sj.R.inc(1349);tableModel.fireTableRowsUpdated(table.getSelectedRow(), table.getSelectedRow());
                }
                }else {{
                    __CLR4_5_2zszslx1h31sj.R.inc(1350);super.keyTyped(e);
                }
            }}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
        });

        __CLR4_5_2zszslx1h31sj.R.inc(1351);JPopupMenu popupMenu = new JPopupMenu();

        __CLR4_5_2zszslx1h31sj.R.inc(1352);JMenu setTypeMenu = new JMenu(setTypeAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1353);for (BoardPad.Type type : BoardPad.Type.values()) {{
            __CLR4_5_2zszslx1h31sj.R.inc(1354);setTypeMenu.add(new SetTypeAction(type));
        }
        }__CLR4_5_2zszslx1h31sj.R.inc(1355);popupMenu.add(setTypeMenu);

        __CLR4_5_2zszslx1h31sj.R.inc(1356);JMenu setSideMenu = new JMenu(setSideAction);
        __CLR4_5_2zszslx1h31sj.R.inc(1357);for (Board.Side side : Board.Side.values()) {{
            __CLR4_5_2zszslx1h31sj.R.inc(1358);setSideMenu.add(new SetSideAction(side));
        }
        }__CLR4_5_2zszslx1h31sj.R.inc(1359);popupMenu.add(setSideMenu);

        __CLR4_5_2zszslx1h31sj.R.inc(1360);table.setComponentPopupMenu(popupMenu);

        __CLR4_5_2zszslx1h31sj.R.inc(1361);JScrollPane scrollPane = new JScrollPane(table);
        __CLR4_5_2zszslx1h31sj.R.inc(1362);add(scrollPane, BorderLayout.CENTER);
    }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

    public void setBoardLocation(BoardLocation boardLocation) {try{__CLR4_5_2zszslx1h31sj.R.inc(1363);
        __CLR4_5_2zszslx1h31sj.R.inc(1364);this.boardLocation = boardLocation;
        __CLR4_5_2zszslx1h31sj.R.inc(1365);if ((((boardLocation == null)&&(__CLR4_5_2zszslx1h31sj.R.iget(1366)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1367)==0&false))) {{
            __CLR4_5_2zszslx1h31sj.R.inc(1368);tableModel.setBoard(null);
            __CLR4_5_2zszslx1h31sj.R.inc(1369);boardLocationSelectionActionGroup.setEnabled(false);
        }
        }else {{
            __CLR4_5_2zszslx1h31sj.R.inc(1370);tableModel.setBoard(boardLocation.getBoard());
            __CLR4_5_2zszslx1h31sj.R.inc(1371);boardLocationSelectionActionGroup.setEnabled(true);
        }
    }}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

    public BoardPad getSelection() {try{__CLR4_5_2zszslx1h31sj.R.inc(1372);
        __CLR4_5_2zszslx1h31sj.R.inc(1373);List<BoardPad> selectedPads = getSelections();
        __CLR4_5_2zszslx1h31sj.R.inc(1374);if ((((selectedPads.isEmpty())&&(__CLR4_5_2zszslx1h31sj.R.iget(1375)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1376)==0&false))) {{
            __CLR4_5_2zszslx1h31sj.R.inc(1377);return null;
        }
        }__CLR4_5_2zszslx1h31sj.R.inc(1378);return selectedPads.get(0);
    }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

    public List<BoardPad> getSelections() {try{__CLR4_5_2zszslx1h31sj.R.inc(1379);
        __CLR4_5_2zszslx1h31sj.R.inc(1380);ArrayList<BoardPad> rows = new ArrayList<>();
        __CLR4_5_2zszslx1h31sj.R.inc(1381);if ((((boardLocation == null)&&(__CLR4_5_2zszslx1h31sj.R.iget(1382)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1383)==0&false))) {{
            __CLR4_5_2zszslx1h31sj.R.inc(1384);return rows;
        }
        }__CLR4_5_2zszslx1h31sj.R.inc(1385);int[] selectedRows = table.getSelectedRows();
        __CLR4_5_2zszslx1h31sj.R.inc(1386);for (int selectedRow : selectedRows) {{
            __CLR4_5_2zszslx1h31sj.R.inc(1387);selectedRow = table.convertRowIndexToModel(selectedRow);
            __CLR4_5_2zszslx1h31sj.R.inc(1388);rows.add(boardLocation.getBoard().getSolderPastePads().get(selectedRow));
        }
        }__CLR4_5_2zszslx1h31sj.R.inc(1389);return rows;
    }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

    public final Action newAction = new AbstractAction() {
        {try{__CLR4_5_2zszslx1h31sj.R.inc(1390);
            __CLR4_5_2zszslx1h31sj.R.inc(1391);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_2zszslx1h31sj.R.inc(1392);putValue(NAME, "New Pad");
            __CLR4_5_2zszslx1h31sj.R.inc(1393);putValue(SHORT_DESCRIPTION, "Create a new pad and add it to the board.");
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1394);
            __CLR4_5_2zszslx1h31sj.R.inc(1395);List<Class<? extends Pad>> padClasses = new ArrayList<>();
            __CLR4_5_2zszslx1h31sj.R.inc(1396);padClasses.add(Pad.RoundRectangle.class);
            __CLR4_5_2zszslx1h31sj.R.inc(1397);padClasses.add(Pad.Circle.class);
            __CLR4_5_2zszslx1h31sj.R.inc(1398);padClasses.add(Pad.Ellipse.class);
            // See note on Pad.Line
            // padClasses.add(Pad.Line.class);
            __CLR4_5_2zszslx1h31sj.R.inc(1399);ClassSelectionDialog<Pad> dialog = new ClassSelectionDialog<>(
                    JOptionPane.getFrameForComponent(JobPastePanel.this), "Select Pad...",
                    "Please select a pad type from the list below.", padClasses);
            __CLR4_5_2zszslx1h31sj.R.inc(1400);dialog.setVisible(true);
            __CLR4_5_2zszslx1h31sj.R.inc(1401);Class<? extends Pad> padClass = dialog.getSelectedClass();
            __CLR4_5_2zszslx1h31sj.R.inc(1402);if ((((padClass == null)&&(__CLR4_5_2zszslx1h31sj.R.iget(1403)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1404)==0&false))) {{
                __CLR4_5_2zszslx1h31sj.R.inc(1405);return;
            }
            }__CLR4_5_2zszslx1h31sj.R.inc(1406);try {
                __CLR4_5_2zszslx1h31sj.R.inc(1407);Pad pad = padClass.newInstance();
                __CLR4_5_2zszslx1h31sj.R.inc(1408);BoardPad boardPad = new BoardPad();
                __CLR4_5_2zszslx1h31sj.R.inc(1409);boardPad.setLocation(new Location(Configuration.get().getSystemUnits()));
                __CLR4_5_2zszslx1h31sj.R.inc(1410);boardPad.setPad(pad);

                __CLR4_5_2zszslx1h31sj.R.inc(1411);boardLocation.getBoard().addSolderPastePad(boardPad);
                __CLR4_5_2zszslx1h31sj.R.inc(1412);tableModel.fireTableDataChanged();
                __CLR4_5_2zszslx1h31sj.R.inc(1413);Helpers.selectLastTableRow(table);
            }
            catch (Exception e) {
                __CLR4_5_2zszslx1h31sj.R.inc(1414);MessageBoxes.errorBox(JOptionPane.getFrameForComponent(JobPastePanel.this),
                        "Pad Error", e);
            }
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    public final Action removeAction = new AbstractAction() {
        {try{__CLR4_5_2zszslx1h31sj.R.inc(1415);
            __CLR4_5_2zszslx1h31sj.R.inc(1416);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_2zszslx1h31sj.R.inc(1417);putValue(NAME, "Remove Pad");
            __CLR4_5_2zszslx1h31sj.R.inc(1418);putValue(SHORT_DESCRIPTION, "Remove the currently selected pad.");
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1419);
            __CLR4_5_2zszslx1h31sj.R.inc(1420);for (BoardPad pad : getSelections()) {{
                __CLR4_5_2zszslx1h31sj.R.inc(1421);boardLocation.getBoard().removeSolderPastePad(pad);
            }
            }__CLR4_5_2zszslx1h31sj.R.inc(1422);tableModel.fireTableDataChanged();
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    public final Action moveCameraToPadLocation = new AbstractAction() {
        {try{__CLR4_5_2zszslx1h31sj.R.inc(1423);
            __CLR4_5_2zszslx1h31sj.R.inc(1424);putValue(SMALL_ICON, Icons.centerCamera);
            __CLR4_5_2zszslx1h31sj.R.inc(1425);putValue(NAME, "Move Camera To Pad Location");
            __CLR4_5_2zszslx1h31sj.R.inc(1426);putValue(SHORT_DESCRIPTION, "Position the camera at the pad's location.");
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1427);
            __CLR4_5_2zszslx1h31sj.R.inc(1428);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2zszslx1h31sj.R.inc(1429);Location location = Utils2D.calculateBoardPlacementLocation(boardLocation,
                        getSelection().getLocation());

                __CLR4_5_2zszslx1h31sj.R.inc(1430);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2zszslx1h31sj.R.inc(1431);MovableUtils.moveToLocationAtSafeZ(camera, location);
            });
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    public final Action moveToolToPadLocation = new AbstractAction() {
        {try{__CLR4_5_2zszslx1h31sj.R.inc(1432);
            __CLR4_5_2zszslx1h31sj.R.inc(1433);putValue(SMALL_ICON, Icons.centerTool);
            __CLR4_5_2zszslx1h31sj.R.inc(1434);putValue(NAME, "Move Tool To Pad Location");
            __CLR4_5_2zszslx1h31sj.R.inc(1435);putValue(SHORT_DESCRIPTION, "Position the tool at the pad's location.");
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1436);
            __CLR4_5_2zszslx1h31sj.R.inc(1437);Location location = Utils2D.calculateBoardPlacementLocation(boardLocation,
                    getSelection().getLocation());

            __CLR4_5_2zszslx1h31sj.R.inc(1438);PasteDispenser dispenser = MainFrame.machineControlsPanel.getSelectedPasteDispenser();
            __CLR4_5_2zszslx1h31sj.R.inc(1439);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2zszslx1h31sj.R.inc(1440);MovableUtils.moveToLocationAtSafeZ(dispenser, location);
            });
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    public final Action setTypeAction = new AbstractAction() {
        {try{__CLR4_5_2zszslx1h31sj.R.inc(1441);
            __CLR4_5_2zszslx1h31sj.R.inc(1442);putValue(NAME, "Set Type");
            __CLR4_5_2zszslx1h31sj.R.inc(1443);putValue(SHORT_DESCRIPTION, "Set pad type(s) to...");
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1444);}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    class SetTypeAction extends AbstractAction {
        final BoardPad.Type type;

        public SetTypeAction(BoardPad.Type type) {try{__CLR4_5_2zszslx1h31sj.R.inc(1445);
            __CLR4_5_2zszslx1h31sj.R.inc(1446);this.type = type;
            __CLR4_5_2zszslx1h31sj.R.inc(1447);putValue(NAME, type.toString());
            __CLR4_5_2zszslx1h31sj.R.inc(1448);putValue(SHORT_DESCRIPTION, "Set pad type(s) to " + type.toString());
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1449);
            __CLR4_5_2zszslx1h31sj.R.inc(1450);for (BoardPad pad : getSelections()) {{
                __CLR4_5_2zszslx1h31sj.R.inc(1451);pad.setType(type);
            }
        }}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    public final Action setSideAction = new AbstractAction() {
        {try{__CLR4_5_2zszslx1h31sj.R.inc(1452);
            __CLR4_5_2zszslx1h31sj.R.inc(1453);putValue(NAME, "Set Side");
            __CLR4_5_2zszslx1h31sj.R.inc(1454);putValue(SHORT_DESCRIPTION, "Set pad side(s) to...");
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1455);}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    class SetSideAction extends AbstractAction {
        final Board.Side side;

        public SetSideAction(Board.Side side) {try{__CLR4_5_2zszslx1h31sj.R.inc(1456);
            __CLR4_5_2zszslx1h31sj.R.inc(1457);this.side = side;
            __CLR4_5_2zszslx1h31sj.R.inc(1458);putValue(NAME, side.toString());
            __CLR4_5_2zszslx1h31sj.R.inc(1459);putValue(SHORT_DESCRIPTION, "Set pad side(s) to " + side.toString());
        }finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2zszslx1h31sj.R.inc(1460);
            __CLR4_5_2zszslx1h31sj.R.inc(1461);for (BoardPad pad : getSelections()) {{
                __CLR4_5_2zszslx1h31sj.R.inc(1462);pad.setSide(side);
            }
        }}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    };

    static class TypeRenderer extends DefaultTableCellRenderer {
        public void setValue(Object value) {try{__CLR4_5_2zszslx1h31sj.R.inc(1463);
            __CLR4_5_2zszslx1h31sj.R.inc(1464);Type type = (Type) value;
            __CLR4_5_2zszslx1h31sj.R.inc(1465);setText(type.name());
            __CLR4_5_2zszslx1h31sj.R.inc(1466);if ((((type == Type.Paste)&&(__CLR4_5_2zszslx1h31sj.R.iget(1467)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1468)==0&false))) {{
                __CLR4_5_2zszslx1h31sj.R.inc(1469);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2zszslx1h31sj.R.inc(1470);setForeground(Color.black);
                __CLR4_5_2zszslx1h31sj.R.inc(1471);setBackground(typeColorPaste);
            }
            }else {__CLR4_5_2zszslx1h31sj.R.inc(1472);if ((((type == Type.Ignore)&&(__CLR4_5_2zszslx1h31sj.R.iget(1473)!=0|true))||(__CLR4_5_2zszslx1h31sj.R.iget(1474)==0&false))) {{
                __CLR4_5_2zszslx1h31sj.R.inc(1475);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2zszslx1h31sj.R.inc(1476);setForeground(Color.black);
                __CLR4_5_2zszslx1h31sj.R.inc(1477);setBackground(typeColorIgnore);
            }
        }}}finally{__CLR4_5_2zszslx1h31sj.R.flushNeeded();}}
    }
}
