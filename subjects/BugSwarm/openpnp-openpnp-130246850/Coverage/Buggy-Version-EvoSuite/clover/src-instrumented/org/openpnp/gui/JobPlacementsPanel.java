/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import org.openpnp.gui.support.ActionGroup;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.IdentifiableListCellRenderer;
import org.openpnp.gui.support.IdentifiableTableCellRenderer;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.PartsComboBoxModel;
import org.openpnp.gui.tablemodel.PlacementsTableModel;
import org.openpnp.gui.tablemodel.PlacementsTableModel.Status;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.model.Placement.Type;
import org.openpnp.spi.Camera;
import org.openpnp.spi.HeadMountable;
import org.openpnp.spi.Nozzle;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.openpnp.util.Utils2D;

public class JobPlacementsPanel extends JPanel {public static class __CLR4_5_2152152lx1h05nk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,1758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JTable table;
    private PlacementsTableModel tableModel;
    private ActionGroup boardLocationSelectionActionGroup;
    private ActionGroup singleSelectionActionGroup;
    private ActionGroup multiSelectionActionGroup;
    private ActionGroup captureAndPositionActionGroup;
    private BoardLocation boardLocation;

    private static Color typeColorIgnore = new Color(252, 255, 157);
    private static Color typeColorFiducial = new Color(157, 188, 255);
    private static Color typeColorPlace = new Color(157, 255, 168);
    private static Color statusColorWarning = new Color(252, 255, 157);
    private static Color statusColorReady = new Color(157, 255, 168);
    private static Color statusColorError = new Color(255, 157, 157);

    public JobPlacementsPanel(JobPanel jobPanel) {try{__CLR4_5_2152152lx1h05nk.R.inc(1478);
        __CLR4_5_2152152lx1h05nk.R.inc(1479);Configuration configuration = Configuration.get();

        __CLR4_5_2152152lx1h05nk.R.inc(1480);boardLocationSelectionActionGroup = new ActionGroup(newAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1481);boardLocationSelectionActionGroup.setEnabled(false);

        __CLR4_5_2152152lx1h05nk.R.inc(1482);singleSelectionActionGroup =
                new ActionGroup(removeAction, editPlacementFeederAction, setTypeAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1483);singleSelectionActionGroup.setEnabled(false);

        __CLR4_5_2152152lx1h05nk.R.inc(1484);multiSelectionActionGroup = new ActionGroup(removeAction, setTypeAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1485);multiSelectionActionGroup.setEnabled(false);

        __CLR4_5_2152152lx1h05nk.R.inc(1486);captureAndPositionActionGroup =
                new ActionGroup(captureCameraPlacementLocation, captureToolPlacementLocation,
                        moveCameraToPlacementLocation, moveToolToPlacementLocation);
        __CLR4_5_2152152lx1h05nk.R.inc(1487);captureAndPositionActionGroup.setEnabled(false);

        __CLR4_5_2152152lx1h05nk.R.inc(1488);JComboBox<PartsComboBoxModel> partsComboBox = new JComboBox(new PartsComboBoxModel());
        __CLR4_5_2152152lx1h05nk.R.inc(1489);partsComboBox.setRenderer(new IdentifiableListCellRenderer<Part>());
        __CLR4_5_2152152lx1h05nk.R.inc(1490);JComboBox<Side> sidesComboBox = new JComboBox(Side.values());
        __CLR4_5_2152152lx1h05nk.R.inc(1491);JComboBox<Type> typesComboBox = new JComboBox(Type.values());

        __CLR4_5_2152152lx1h05nk.R.inc(1492);setLayout(new BorderLayout(0, 0));
        __CLR4_5_2152152lx1h05nk.R.inc(1493);JToolBar toolBarPlacements = new JToolBar();
        __CLR4_5_2152152lx1h05nk.R.inc(1494);add(toolBarPlacements, BorderLayout.NORTH);

        __CLR4_5_2152152lx1h05nk.R.inc(1495);toolBarPlacements.setFloatable(false);
        __CLR4_5_2152152lx1h05nk.R.inc(1496);JButton btnNewPlacement = new JButton(newAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1497);btnNewPlacement.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1498);toolBarPlacements.add(btnNewPlacement);
        __CLR4_5_2152152lx1h05nk.R.inc(1499);JButton btnRemovePlacement = new JButton(removeAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1500);btnRemovePlacement.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1501);toolBarPlacements.add(btnRemovePlacement);
        __CLR4_5_2152152lx1h05nk.R.inc(1502);toolBarPlacements.addSeparator();
        __CLR4_5_2152152lx1h05nk.R.inc(1503);JButton btnCaptureCameraPlacementLocation = new JButton(captureCameraPlacementLocation);
        __CLR4_5_2152152lx1h05nk.R.inc(1504);btnCaptureCameraPlacementLocation.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1505);toolBarPlacements.add(btnCaptureCameraPlacementLocation);

        __CLR4_5_2152152lx1h05nk.R.inc(1506);JButton btnCaptureToolPlacementLocation = new JButton(captureToolPlacementLocation);
        __CLR4_5_2152152lx1h05nk.R.inc(1507);btnCaptureToolPlacementLocation.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1508);toolBarPlacements.add(btnCaptureToolPlacementLocation);

        __CLR4_5_2152152lx1h05nk.R.inc(1509);JButton btnPositionCameraPositionLocation = new JButton(moveCameraToPlacementLocation);
        __CLR4_5_2152152lx1h05nk.R.inc(1510);btnPositionCameraPositionLocation.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1511);toolBarPlacements.add(btnPositionCameraPositionLocation);

        __CLR4_5_2152152lx1h05nk.R.inc(1512);JButton btnPositionToolPositionLocation = new JButton(moveToolToPlacementLocation);
        __CLR4_5_2152152lx1h05nk.R.inc(1513);btnPositionToolPositionLocation.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1514);toolBarPlacements.add(btnPositionToolPositionLocation);

        __CLR4_5_2152152lx1h05nk.R.inc(1515);toolBarPlacements.addSeparator();

        __CLR4_5_2152152lx1h05nk.R.inc(1516);JButton btnEditFeeder = new JButton(editPlacementFeederAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1517);btnEditFeeder.setHideActionText(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1518);toolBarPlacements.add(btnEditFeeder);

        __CLR4_5_2152152lx1h05nk.R.inc(1519);tableModel = new PlacementsTableModel(configuration);

        __CLR4_5_2152152lx1h05nk.R.inc(1520);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_2152152lx1h05nk.R.inc(1521);table.setAutoCreateRowSorter(true);
        __CLR4_5_2152152lx1h05nk.R.inc(1522);table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        __CLR4_5_2152152lx1h05nk.R.inc(1523);table.setDefaultEditor(Side.class, new DefaultCellEditor(sidesComboBox));
        __CLR4_5_2152152lx1h05nk.R.inc(1524);table.setDefaultEditor(Part.class, new DefaultCellEditor(partsComboBox));
        __CLR4_5_2152152lx1h05nk.R.inc(1525);table.setDefaultEditor(Type.class, new DefaultCellEditor(typesComboBox));
        __CLR4_5_2152152lx1h05nk.R.inc(1526);table.setDefaultRenderer(Part.class, new IdentifiableTableCellRenderer<Part>());
        __CLR4_5_2152152lx1h05nk.R.inc(1527);table.setDefaultRenderer(PlacementsTableModel.Status.class, new StatusRenderer());
        __CLR4_5_2152152lx1h05nk.R.inc(1528);table.setDefaultRenderer(Placement.Type.class, new TypeRenderer());
        __CLR4_5_2152152lx1h05nk.R.inc(1529);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2152152lx1h05nk.R.inc(1530);
                __CLR4_5_2152152lx1h05nk.R.inc(1531);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2152152lx1h05nk.R.iget(1532)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1533)==0&false))) {{
                    __CLR4_5_2152152lx1h05nk.R.inc(1534);return;
                }

                }__CLR4_5_2152152lx1h05nk.R.inc(1535);if ((((getSelections().size() > 1)&&(__CLR4_5_2152152lx1h05nk.R.iget(1536)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1537)==0&false))) {{
                    // multi select
                    __CLR4_5_2152152lx1h05nk.R.inc(1538);singleSelectionActionGroup.setEnabled(false);
                    __CLR4_5_2152152lx1h05nk.R.inc(1539);captureAndPositionActionGroup.setEnabled(false);
                    __CLR4_5_2152152lx1h05nk.R.inc(1540);multiSelectionActionGroup.setEnabled(true);
                }
                }else {{
                    // single select, or no select
                    __CLR4_5_2152152lx1h05nk.R.inc(1541);multiSelectionActionGroup.setEnabled(false);
                    __CLR4_5_2152152lx1h05nk.R.inc(1542);singleSelectionActionGroup.setEnabled(getSelection() != null);
                    __CLR4_5_2152152lx1h05nk.R.inc(1543);captureAndPositionActionGroup.setEnabled(getSelection() != null
                            && getSelection().getSide() == boardLocation.getSide());
                }
            }}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
        });
        __CLR4_5_2152152lx1h05nk.R.inc(1544);table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {try{__CLR4_5_2152152lx1h05nk.R.inc(1545);
                __CLR4_5_2152152lx1h05nk.R.inc(1546);if ((((mouseEvent.getClickCount() != 2)&&(__CLR4_5_2152152lx1h05nk.R.iget(1547)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1548)==0&false))) {{
                    __CLR4_5_2152152lx1h05nk.R.inc(1549);return;
                }
                }__CLR4_5_2152152lx1h05nk.R.inc(1550);int row = table.rowAtPoint(new Point(mouseEvent.getX(), mouseEvent.getY()));
                __CLR4_5_2152152lx1h05nk.R.inc(1551);int col = table.columnAtPoint(new Point(mouseEvent.getX(), mouseEvent.getY()));
                __CLR4_5_2152152lx1h05nk.R.inc(1552);if ((((tableModel.getColumnClass(col) == Status.class)&&(__CLR4_5_2152152lx1h05nk.R.iget(1553)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1554)==0&false))) {{
                    __CLR4_5_2152152lx1h05nk.R.inc(1555);Status status = (Status) tableModel.getValueAt(row, col);
                    // TODO: This is some sample code for handling the user
                    // wishing to do something with the status. Not using it
                    // right now but leaving it here for the future.
                    __CLR4_5_2152152lx1h05nk.R.inc(1556);System.out.println(status);
                }
            }}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
        });
        __CLR4_5_2152152lx1h05nk.R.inc(1557);table.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {try{__CLR4_5_2152152lx1h05nk.R.inc(1558);
                __CLR4_5_2152152lx1h05nk.R.inc(1559);if ((((e.getKeyChar() == ' ')&&(__CLR4_5_2152152lx1h05nk.R.iget(1560)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1561)==0&false))) {{
                    __CLR4_5_2152152lx1h05nk.R.inc(1562);Placement placement = getSelection();
                    __CLR4_5_2152152lx1h05nk.R.inc(1563);placement.setType((((placement.getType() == Type.Place )&&(__CLR4_5_2152152lx1h05nk.R.iget(1564)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1565)==0&false))? Type.Ignore : Type.Place);
                    __CLR4_5_2152152lx1h05nk.R.inc(1566);tableModel.fireTableRowsUpdated(table.getSelectedRow(), table.getSelectedRow());
                }
                }else {{
                    __CLR4_5_2152152lx1h05nk.R.inc(1567);super.keyTyped(e);
                }
            }}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
        });

        __CLR4_5_2152152lx1h05nk.R.inc(1568);JPopupMenu popupMenu = new JPopupMenu();

        __CLR4_5_2152152lx1h05nk.R.inc(1569);JMenu setTypeMenu = new JMenu(setTypeAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1570);for (Placement.Type type : Placement.Type.values()) {{
            __CLR4_5_2152152lx1h05nk.R.inc(1571);setTypeMenu.add(new SetTypeAction(type));
        }
        }__CLR4_5_2152152lx1h05nk.R.inc(1572);popupMenu.add(setTypeMenu);

        __CLR4_5_2152152lx1h05nk.R.inc(1573);JMenu setSideMenu = new JMenu(setSideAction);
        __CLR4_5_2152152lx1h05nk.R.inc(1574);for (Board.Side side : Board.Side.values()) {{
            __CLR4_5_2152152lx1h05nk.R.inc(1575);setSideMenu.add(new SetSideAction(side));
        }
        }__CLR4_5_2152152lx1h05nk.R.inc(1576);popupMenu.add(setSideMenu);

        __CLR4_5_2152152lx1h05nk.R.inc(1577);table.setComponentPopupMenu(popupMenu);

        __CLR4_5_2152152lx1h05nk.R.inc(1578);JScrollPane scrollPane = new JScrollPane(table);
        __CLR4_5_2152152lx1h05nk.R.inc(1579);add(scrollPane, BorderLayout.CENTER);
    }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

    public void setBoardLocation(BoardLocation boardLocation) {try{__CLR4_5_2152152lx1h05nk.R.inc(1580);
        __CLR4_5_2152152lx1h05nk.R.inc(1581);this.boardLocation = boardLocation;
        __CLR4_5_2152152lx1h05nk.R.inc(1582);if ((((boardLocation == null)&&(__CLR4_5_2152152lx1h05nk.R.iget(1583)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1584)==0&false))) {{
            __CLR4_5_2152152lx1h05nk.R.inc(1585);tableModel.setBoard(null);
            __CLR4_5_2152152lx1h05nk.R.inc(1586);boardLocationSelectionActionGroup.setEnabled(false);
        }
        }else {{
            __CLR4_5_2152152lx1h05nk.R.inc(1587);tableModel.setBoard(boardLocation.getBoard());
            __CLR4_5_2152152lx1h05nk.R.inc(1588);boardLocationSelectionActionGroup.setEnabled(true);
        }
    }}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

    public Placement getSelection() {try{__CLR4_5_2152152lx1h05nk.R.inc(1589);
        __CLR4_5_2152152lx1h05nk.R.inc(1590);List<Placement> selectedPlacements = getSelections();
        __CLR4_5_2152152lx1h05nk.R.inc(1591);if ((((selectedPlacements.isEmpty())&&(__CLR4_5_2152152lx1h05nk.R.iget(1592)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1593)==0&false))) {{
            __CLR4_5_2152152lx1h05nk.R.inc(1594);return null;
        }
        }__CLR4_5_2152152lx1h05nk.R.inc(1595);return selectedPlacements.get(0);
    }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

    public List<Placement> getSelections() {try{__CLR4_5_2152152lx1h05nk.R.inc(1596);
        __CLR4_5_2152152lx1h05nk.R.inc(1597);ArrayList<Placement> placements = new ArrayList<>();
        __CLR4_5_2152152lx1h05nk.R.inc(1598);if ((((boardLocation == null)&&(__CLR4_5_2152152lx1h05nk.R.iget(1599)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1600)==0&false))) {{
            __CLR4_5_2152152lx1h05nk.R.inc(1601);return placements;
        }
        }__CLR4_5_2152152lx1h05nk.R.inc(1602);int[] selectedRows = table.getSelectedRows();
        __CLR4_5_2152152lx1h05nk.R.inc(1603);for (int selectedRow : selectedRows) {{
            __CLR4_5_2152152lx1h05nk.R.inc(1604);selectedRow = table.convertRowIndexToModel(selectedRow);
            __CLR4_5_2152152lx1h05nk.R.inc(1605);placements.add(boardLocation.getBoard().getPlacements().get(selectedRow));
        }
        }__CLR4_5_2152152lx1h05nk.R.inc(1606);return placements;
    }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

    public final Action newAction = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1607);
            __CLR4_5_2152152lx1h05nk.R.inc(1608);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_2152152lx1h05nk.R.inc(1609);putValue(NAME, "New Placement");
            __CLR4_5_2152152lx1h05nk.R.inc(1610);putValue(SHORT_DESCRIPTION, "Create a new placement and add it to the board.");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1611);
            __CLR4_5_2152152lx1h05nk.R.inc(1612);if ((((Configuration.get().getParts().size() == 0)&&(__CLR4_5_2152152lx1h05nk.R.iget(1613)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1614)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1615);MessageBoxes.errorBox(getTopLevelAncestor(), "Error",
                        "There are currently no parts defined in the system. Please create at least one part before creating a placement.");
                __CLR4_5_2152152lx1h05nk.R.inc(1616);return;
            }

            }__CLR4_5_2152152lx1h05nk.R.inc(1617);String id = JOptionPane.showInputDialog(getTopLevelAncestor(),
                    "Please enter an ID for the new placement.");
            __CLR4_5_2152152lx1h05nk.R.inc(1618);if ((((id == null)&&(__CLR4_5_2152152lx1h05nk.R.iget(1619)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1620)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1621);return;
            }
            // TODO: Make sure it's unique.
            }__CLR4_5_2152152lx1h05nk.R.inc(1622);Placement placement = new Placement(id);

            __CLR4_5_2152152lx1h05nk.R.inc(1623);placement.setPart(Configuration.get().getParts().get(0));
            __CLR4_5_2152152lx1h05nk.R.inc(1624);placement.setLocation(new Location(Configuration.get().getSystemUnits()));

            __CLR4_5_2152152lx1h05nk.R.inc(1625);boardLocation.getBoard().addPlacement(placement);
            __CLR4_5_2152152lx1h05nk.R.inc(1626);tableModel.fireTableDataChanged();
            __CLR4_5_2152152lx1h05nk.R.inc(1627);Helpers.selectLastTableRow(table);
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action removeAction = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1628);
            __CLR4_5_2152152lx1h05nk.R.inc(1629);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_2152152lx1h05nk.R.inc(1630);putValue(NAME, "Remove Placement(s)");
            __CLR4_5_2152152lx1h05nk.R.inc(1631);putValue(SHORT_DESCRIPTION, "Remove the currently selected placement(s).");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1632);
            __CLR4_5_2152152lx1h05nk.R.inc(1633);for (Placement placement : getSelections()) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1634);boardLocation.getBoard().removePlacement(placement);
            }
            }__CLR4_5_2152152lx1h05nk.R.inc(1635);tableModel.fireTableDataChanged();
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action moveCameraToPlacementLocation = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1636);
            __CLR4_5_2152152lx1h05nk.R.inc(1637);putValue(SMALL_ICON, Icons.centerCamera);
            __CLR4_5_2152152lx1h05nk.R.inc(1638);putValue(NAME, "Move Camera To Placement Location");
            __CLR4_5_2152152lx1h05nk.R.inc(1639);putValue(SHORT_DESCRIPTION, "Position the camera at the placement's location.");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1640);
            __CLR4_5_2152152lx1h05nk.R.inc(1641);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2152152lx1h05nk.R.inc(1642);Location location = Utils2D.calculateBoardPlacementLocation(boardLocation,
                        getSelection().getLocation());

                __CLR4_5_2152152lx1h05nk.R.inc(1643);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2152152lx1h05nk.R.inc(1644);MovableUtils.moveToLocationAtSafeZ(camera, location);
            });
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action moveToolToPlacementLocation = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1645);
            __CLR4_5_2152152lx1h05nk.R.inc(1646);putValue(SMALL_ICON, Icons.centerTool);
            __CLR4_5_2152152lx1h05nk.R.inc(1647);putValue(NAME, "Move Tool To Placement Location");
            __CLR4_5_2152152lx1h05nk.R.inc(1648);putValue(SHORT_DESCRIPTION, "Position the tool at the placement's location.");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1649);
            __CLR4_5_2152152lx1h05nk.R.inc(1650);Location location = Utils2D.calculateBoardPlacementLocation(boardLocation,
                    getSelection().getLocation());

            __CLR4_5_2152152lx1h05nk.R.inc(1651);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();
            __CLR4_5_2152152lx1h05nk.R.inc(1652);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2152152lx1h05nk.R.inc(1653);MovableUtils.moveToLocationAtSafeZ(nozzle, location);
            });
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action captureCameraPlacementLocation = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1654);
            __CLR4_5_2152152lx1h05nk.R.inc(1655);putValue(SMALL_ICON, Icons.captureCamera);
            __CLR4_5_2152152lx1h05nk.R.inc(1656);putValue(NAME, "Capture Camera Placement Location");
            __CLR4_5_2152152lx1h05nk.R.inc(1657);putValue(SHORT_DESCRIPTION,
                    "Set the placement's location to the camera's current position.");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1658);
            __CLR4_5_2152152lx1h05nk.R.inc(1659);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2152152lx1h05nk.R.inc(1660);HeadMountable tool = MainFrame.machineControlsPanel.getSelectedTool();
                __CLR4_5_2152152lx1h05nk.R.inc(1661);Camera camera = tool.getHead().getDefaultCamera();
                __CLR4_5_2152152lx1h05nk.R.inc(1662);Location placementLocation = Utils2D.calculateBoardPlacementLocationInverse(
                        boardLocation, camera.getLocation());
                __CLR4_5_2152152lx1h05nk.R.inc(1663);getSelection().setLocation(placementLocation);
                __CLR4_5_2152152lx1h05nk.R.inc(1664);table.repaint();
            });
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action captureToolPlacementLocation = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1665);
            __CLR4_5_2152152lx1h05nk.R.inc(1666);putValue(SMALL_ICON, Icons.captureTool);
            __CLR4_5_2152152lx1h05nk.R.inc(1667);putValue(NAME, "Capture Tool Placement Location");
            __CLR4_5_2152152lx1h05nk.R.inc(1668);putValue(SHORT_DESCRIPTION,
                    "Set the placement's location to the tool's current position.");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1669);
            __CLR4_5_2152152lx1h05nk.R.inc(1670);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();
            __CLR4_5_2152152lx1h05nk.R.inc(1671);Location placementLocation = Utils2D
                    .calculateBoardPlacementLocationInverse(boardLocation, nozzle.getLocation());
            __CLR4_5_2152152lx1h05nk.R.inc(1672);getSelection().setLocation(placementLocation);
            __CLR4_5_2152152lx1h05nk.R.inc(1673);table.repaint();
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action editPlacementFeederAction = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1674);
            __CLR4_5_2152152lx1h05nk.R.inc(1675);putValue(SMALL_ICON, Icons.editFeeder);
            __CLR4_5_2152152lx1h05nk.R.inc(1676);putValue(NAME, "Edit Placement Feeder");
            __CLR4_5_2152152lx1h05nk.R.inc(1677);putValue(SHORT_DESCRIPTION, "Edit the placement's associated feeder definition.");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1678);
            __CLR4_5_2152152lx1h05nk.R.inc(1679);Placement placement = getSelection();
            __CLR4_5_2152152lx1h05nk.R.inc(1680);MainFrame.feedersPanel.showFeederForPart(placement.getPart());
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action setTypeAction = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1681);
            __CLR4_5_2152152lx1h05nk.R.inc(1682);putValue(NAME, "Set Type");
            __CLR4_5_2152152lx1h05nk.R.inc(1683);putValue(SHORT_DESCRIPTION, "Set placement type(s) to...");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1684);}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    class SetTypeAction extends AbstractAction {
        final Placement.Type type;

        public SetTypeAction(Placement.Type type) {try{__CLR4_5_2152152lx1h05nk.R.inc(1685);
            __CLR4_5_2152152lx1h05nk.R.inc(1686);this.type = type;
            __CLR4_5_2152152lx1h05nk.R.inc(1687);putValue(NAME, type.toString());
            __CLR4_5_2152152lx1h05nk.R.inc(1688);putValue(SHORT_DESCRIPTION, "Set placement type(s) to " + type.toString());
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1689);
            __CLR4_5_2152152lx1h05nk.R.inc(1690);for (Placement placement : getSelections()) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1691);placement.setType(type);
            }
        }}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    public final Action setSideAction = new AbstractAction() {
        {try{__CLR4_5_2152152lx1h05nk.R.inc(1692);
            __CLR4_5_2152152lx1h05nk.R.inc(1693);putValue(NAME, "Set Side");
            __CLR4_5_2152152lx1h05nk.R.inc(1694);putValue(SHORT_DESCRIPTION, "Set placement side(s) to...");
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1695);}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    class SetSideAction extends AbstractAction {
        final Board.Side side;

        public SetSideAction(Board.Side side) {try{__CLR4_5_2152152lx1h05nk.R.inc(1696);
            __CLR4_5_2152152lx1h05nk.R.inc(1697);this.side = side;
            __CLR4_5_2152152lx1h05nk.R.inc(1698);putValue(NAME, side.toString());
            __CLR4_5_2152152lx1h05nk.R.inc(1699);putValue(SHORT_DESCRIPTION, "Set placement side(s) to " + side.toString());
        }finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2152152lx1h05nk.R.inc(1700);
            __CLR4_5_2152152lx1h05nk.R.inc(1701);for (Placement placement : getSelections()) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1702);placement.setSide(side);
            }
        }}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    };

    static class TypeRenderer extends DefaultTableCellRenderer {
        public void setValue(Object value) {try{__CLR4_5_2152152lx1h05nk.R.inc(1703);
            __CLR4_5_2152152lx1h05nk.R.inc(1704);Type type = (Type) value;
            __CLR4_5_2152152lx1h05nk.R.inc(1705);setText(type.name());
            __CLR4_5_2152152lx1h05nk.R.inc(1706);if ((((type == Type.Fiducial)&&(__CLR4_5_2152152lx1h05nk.R.iget(1707)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1708)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1709);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1710);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1711);setBackground(typeColorFiducial);
            }
            }else {__CLR4_5_2152152lx1h05nk.R.inc(1712);if ((((type == Type.Ignore)&&(__CLR4_5_2152152lx1h05nk.R.iget(1713)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1714)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1715);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1716);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1717);setBackground(typeColorIgnore);
            }
            }else {__CLR4_5_2152152lx1h05nk.R.inc(1718);if ((((type == Type.Place)&&(__CLR4_5_2152152lx1h05nk.R.iget(1719)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1720)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1721);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1722);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1723);setBackground(typeColorPlace);
            }
        }}}}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    }

    static class StatusRenderer extends DefaultTableCellRenderer {
        public void setValue(Object value) {try{__CLR4_5_2152152lx1h05nk.R.inc(1724);
            __CLR4_5_2152152lx1h05nk.R.inc(1725);Status status = (Status) value;
            __CLR4_5_2152152lx1h05nk.R.inc(1726);if ((((status == Status.Ready)&&(__CLR4_5_2152152lx1h05nk.R.iget(1727)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1728)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1729);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1730);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1731);setBackground(statusColorReady);
                __CLR4_5_2152152lx1h05nk.R.inc(1732);setText("Ready");
            }
            }else {__CLR4_5_2152152lx1h05nk.R.inc(1733);if ((((status == Status.MissingFeeder)&&(__CLR4_5_2152152lx1h05nk.R.iget(1734)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1735)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1736);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1737);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1738);setBackground(statusColorError);
                __CLR4_5_2152152lx1h05nk.R.inc(1739);setText("Missing Feeder");
            }
            }else {__CLR4_5_2152152lx1h05nk.R.inc(1740);if ((((status == Status.ZeroPartHeight)&&(__CLR4_5_2152152lx1h05nk.R.iget(1741)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1742)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1743);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1744);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1745);setBackground(statusColorWarning);
                __CLR4_5_2152152lx1h05nk.R.inc(1746);setText("Part Height");
            }
            }else {__CLR4_5_2152152lx1h05nk.R.inc(1747);if ((((status == Status.MissingPart)&&(__CLR4_5_2152152lx1h05nk.R.iget(1748)!=0|true))||(__CLR4_5_2152152lx1h05nk.R.iget(1749)==0&false))) {{
                __CLR4_5_2152152lx1h05nk.R.inc(1750);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1751);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1752);setBackground(statusColorError);
                __CLR4_5_2152152lx1h05nk.R.inc(1753);setText("Missing Part");
            }
            }else {{
                __CLR4_5_2152152lx1h05nk.R.inc(1754);setBorder(new LineBorder(getBackground()));
                __CLR4_5_2152152lx1h05nk.R.inc(1755);setForeground(Color.black);
                __CLR4_5_2152152lx1h05nk.R.inc(1756);setBackground(statusColorError);
                __CLR4_5_2152152lx1h05nk.R.inc(1757);setText(status.toString());
            }
        }}}}}finally{__CLR4_5_2152152lx1h05nk.R.flushNeeded();}}
    }
}
