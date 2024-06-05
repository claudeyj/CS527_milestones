/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import org.openpnp.gui.components.ClassSelectionDialog;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.vision.pipeline.CvStage;

import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheetPanel;

public class PipelinePanel extends JPanel {public static class __CLR4_5_2ggbggblx1h79tr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,21470,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final CvPipelineEditor editor;

    private JTable stagesTable;
    private StagesTableModel stagesTableModel;
    private PropertySheetPanel propertySheetPanel;

    public PipelinePanel(CvPipelineEditor editor) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21323);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21324);this.editor = editor;

        __CLR4_5_2ggbggblx1h79tr.R.inc(21325);propertySheetPanel = new PropertySheetPanel();

        __CLR4_5_2ggbggblx1h79tr.R.inc(21326);setLayout(new BorderLayout(0, 0));

        __CLR4_5_2ggbggblx1h79tr.R.inc(21327);JSplitPane splitPane = new JSplitPane();
        __CLR4_5_2ggbggblx1h79tr.R.inc(21328);add(splitPane, BorderLayout.CENTER);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21329);splitPane.setContinuousLayout(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21330);splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21331);JToolBar toolbar = new JToolBar();
        __CLR4_5_2ggbggblx1h79tr.R.inc(21332);add(toolbar, BorderLayout.NORTH);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21333);JButton refreshButton = new JButton(refreshAction);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21334);refreshButton.setHideActionText(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21335);toolbar.add(refreshButton);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21336);JButton btnAdd = new JButton(newStageAction);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21337);btnAdd.setHideActionText(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21338);toolbar.add(btnAdd);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21339);JButton btnRemove = new JButton(deleteStageAction);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21340);btnRemove.setHideActionText(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21341);toolbar.add(btnRemove);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21342);toolbar.addSeparator();

        __CLR4_5_2ggbggblx1h79tr.R.inc(21343);JButton copyButton = new JButton(copyAction);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21344);copyButton.setHideActionText(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21345);toolbar.add(copyButton);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21346);JButton pasteButton = new JButton(pasteAction);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21347);pasteButton.setHideActionText(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21348);toolbar.add(pasteButton);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21349);stagesTable = new JTable(stagesTableModel = new StagesTableModel(editor.getPipeline()));
        __CLR4_5_2ggbggblx1h79tr.R.inc(21350);stagesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21351);stagesTable.setDragEnabled(true);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21352);stagesTable.setDropMode(DropMode.INSERT_ROWS);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21353);stagesTable.setTransferHandler(new TableRowTransferHandler(stagesTable));
        __CLR4_5_2ggbggblx1h79tr.R.inc(21354);stagesTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21355);stagesTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21356);stagesTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21357);JScrollPane scrollPane = new JScrollPane(stagesTable);

        __CLR4_5_2ggbggblx1h79tr.R.inc(21358);splitPane.setRightComponent(propertySheetPanel);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21359);splitPane.setLeftComponent(scrollPane);

        // Listen for changes to the selection of the table and update the properties for the
        // selected stage.
        __CLR4_5_2ggbggblx1h79tr.R.inc(21360);stagesTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21361);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21362);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21363)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21364)==0&false))) {{
                    __CLR4_5_2ggbggblx1h79tr.R.inc(21365);return;
                }
                }__CLR4_5_2ggbggblx1h79tr.R.inc(21366);CvStage stage = getSelectedStage();
                __CLR4_5_2ggbggblx1h79tr.R.inc(21367);editor.stageSelected(stage);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21368);if ((((stage == null)&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21369)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21370)==0&false))) {{
                    __CLR4_5_2ggbggblx1h79tr.R.inc(21371);propertySheetPanel.setProperties(new Property[] {});
                }
                }else {{
                    __CLR4_5_2ggbggblx1h79tr.R.inc(21372);try {
                        __CLR4_5_2ggbggblx1h79tr.R.inc(21373);propertySheetPanel.setBeanInfo(stage.getBeanInfo());
                        __CLR4_5_2ggbggblx1h79tr.R.inc(21374);propertySheetPanel.readFromObject(stage);
                    }
                    catch (Exception ex) {
                        __CLR4_5_2ggbggblx1h79tr.R.inc(21375);ex.printStackTrace();
                    }
                }
            }}finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
        });

        // Listen for changes to the structure of the table (adding or removing rows) and process
        // the pipeline to update the results.
        __CLR4_5_2ggbggblx1h79tr.R.inc(21376);stagesTable.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21377);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21378);editor.process();
            }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
        });

        // Listen for editing events in the stages table and process the pipeline to update the
        // results.
        __CLR4_5_2ggbggblx1h79tr.R.inc(21379);stagesTable.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21380);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21381);if (((("tableCellEditor".equals(e.getPropertyName()))&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21382)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21383)==0&false))) {{
                    __CLR4_5_2ggbggblx1h79tr.R.inc(21384);if ((((!propertySheetPanel.getTable().isEditing())&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21385)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21386)==0&false))) {{
                        // editing has ended for a cell, save the values
                        __CLR4_5_2ggbggblx1h79tr.R.inc(21387);editor.process();
                    }
                }}
            }}finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
        });

        // Set the divider location after it's added to the view
        __CLR4_5_2ggbggblx1h79tr.R.inc(21388);addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21389);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21390);splitPane.setDividerLocation(0.5);
            }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
        });

        // Listen for editing events in the properties and process the pipeline to update the
        // results.
        __CLR4_5_2ggbggblx1h79tr.R.inc(21391);propertySheetPanel.getTable().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21392);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21393);if (((("tableCellEditor".equals(e.getPropertyName()))&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21394)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21395)==0&false))) {{
                    __CLR4_5_2ggbggblx1h79tr.R.inc(21396);if ((((!propertySheetPanel.getTable().isEditing())&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21397)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21398)==0&false))) {{
                        // editing has ended for a cell, save the values
                        __CLR4_5_2ggbggblx1h79tr.R.inc(21399);propertySheetPanel.writeToObject(getSelectedStage());
                        __CLR4_5_2ggbggblx1h79tr.R.inc(21400);editor.process();
                    }
                }}
            }}finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

    public CvStage getSelectedStage() {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21401);
        __CLR4_5_2ggbggblx1h79tr.R.inc(21402);int index = stagesTable.getSelectedRow();
        __CLR4_5_2ggbggblx1h79tr.R.inc(21403);if ((((index == -1)&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21404)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21405)==0&false))) {{
            __CLR4_5_2ggbggblx1h79tr.R.inc(21406);return null;
        }
        }else {{
            __CLR4_5_2ggbggblx1h79tr.R.inc(21407);index = stagesTable.convertRowIndexToModel(index);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21408);return stagesTableModel.getStage(index);
        }
    }}finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

    public Action newStageAction = new AbstractAction() {
        {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21409);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21410);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21411);putValue(NAME, "New Stage...");
            __CLR4_5_2ggbggblx1h79tr.R.inc(21412);putValue(SHORT_DESCRIPTION, "Create a new stage.");
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21413);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21414);List<Class<? extends CvStage>> stageClasses = new ArrayList<>(editor.getStageClasses());
            __CLR4_5_2ggbggblx1h79tr.R.inc(21415);stageClasses.sort(new Comparator<Class<? extends CvStage>>() {
                @Override
                public int compare(Class<? extends CvStage> o1, Class<? extends CvStage> o2) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21416);
                    __CLR4_5_2ggbggblx1h79tr.R.inc(21417);return o1.getSimpleName().toLowerCase()
                            .compareTo(o2.getSimpleName().toLowerCase());
                }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
            });
            __CLR4_5_2ggbggblx1h79tr.R.inc(21418);ClassSelectionDialog<CvStage> dialog = new ClassSelectionDialog<>(
                    JOptionPane.getFrameForComponent(PipelinePanel.this), "New Stage",
                    "Please select a stage implemention from the list below.", stageClasses);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21419);dialog.setVisible(true);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21420);Class<? extends CvStage> stageClass = dialog.getSelectedClass();
            __CLR4_5_2ggbggblx1h79tr.R.inc(21421);if ((((stageClass == null)&&(__CLR4_5_2ggbggblx1h79tr.R.iget(21422)!=0|true))||(__CLR4_5_2ggbggblx1h79tr.R.iget(21423)==0&false))) {{
                __CLR4_5_2ggbggblx1h79tr.R.inc(21424);return;
            }
            }__CLR4_5_2ggbggblx1h79tr.R.inc(21425);try {
                __CLR4_5_2ggbggblx1h79tr.R.inc(21426);CvStage stage = stageClass.newInstance();
                __CLR4_5_2ggbggblx1h79tr.R.inc(21427);editor.getPipeline().add(stage);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21428);stagesTableModel.refresh();
                __CLR4_5_2ggbggblx1h79tr.R.inc(21429);Helpers.selectLastTableRow(stagesTable);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21430);editor.process();
            }
            catch (Exception e) {
                __CLR4_5_2ggbggblx1h79tr.R.inc(21431);MessageBoxes.errorBox(JOptionPane.getFrameForComponent(PipelinePanel.this), "Error",
                        e);
            }
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
    };

    public Action deleteStageAction = new AbstractAction() {
        {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21432);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21433);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21434);putValue(NAME, "Delete Stage...");
            __CLR4_5_2ggbggblx1h79tr.R.inc(21435);putValue(SHORT_DESCRIPTION, "Delete the selected stage.");
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21436);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21437);CvStage stage = getSelectedStage();
            __CLR4_5_2ggbggblx1h79tr.R.inc(21438);editor.getPipeline().remove(stage);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21439);stagesTableModel.refresh();
            __CLR4_5_2ggbggblx1h79tr.R.inc(21440);editor.process();
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
    };

    public final Action copyAction = new AbstractAction() {
        {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21441);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21442);putValue(SMALL_ICON, Icons.copy);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21443);putValue(NAME, "Copy Pipeline to Clipboard");
            __CLR4_5_2ggbggblx1h79tr.R.inc(21444);putValue(SHORT_DESCRIPTION, "Copy the pipeline to the clipboard in text format.");
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21445);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21446);try {
                __CLR4_5_2ggbggblx1h79tr.R.inc(21447);StringSelection stringSelection =
                        new StringSelection(editor.getPipeline().toXmlString());
                __CLR4_5_2ggbggblx1h79tr.R.inc(21448);Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                __CLR4_5_2ggbggblx1h79tr.R.inc(21449);clipboard.setContents(stringSelection, null);
            }
            catch (Exception e) {
                __CLR4_5_2ggbggblx1h79tr.R.inc(21450);MessageBoxes.errorBox(getTopLevelAncestor(), "Copy Failed", e);
            }
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
    };

    public final Action pasteAction = new AbstractAction() {
        {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21451);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21452);putValue(SMALL_ICON, Icons.paste);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21453);putValue(NAME, "Create Pipeline from Clipboard");
            __CLR4_5_2ggbggblx1h79tr.R.inc(21454);putValue(SHORT_DESCRIPTION,
                    "Create a new pipeline from a definition on the clipboard.");
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21455);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21456);try {
                __CLR4_5_2ggbggblx1h79tr.R.inc(21457);Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                __CLR4_5_2ggbggblx1h79tr.R.inc(21458);String s = (String) clipboard.getData(DataFlavor.stringFlavor);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21459);editor.getPipeline().fromXmlString(s);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21460);stagesTableModel.refresh();
                __CLR4_5_2ggbggblx1h79tr.R.inc(21461);Helpers.selectLastTableRow(stagesTable);
                __CLR4_5_2ggbggblx1h79tr.R.inc(21462);editor.process();
            }
            catch (Exception e) {
                __CLR4_5_2ggbggblx1h79tr.R.inc(21463);MessageBoxes.errorBox(getTopLevelAncestor(), "Paste Failed", e);
            }
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
    };

    public final Action refreshAction = new AbstractAction() {
        {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21464);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21465);putValue(SMALL_ICON, Icons.refresh);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21466);putValue(NAME, "");
            __CLR4_5_2ggbggblx1h79tr.R.inc(21467);putValue(SHORT_DESCRIPTION, "");
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2ggbggblx1h79tr.R.inc(21468);
            __CLR4_5_2ggbggblx1h79tr.R.inc(21469);editor.process();
        }finally{__CLR4_5_2ggbggblx1h79tr.R.flushNeeded();}}
    };
}
