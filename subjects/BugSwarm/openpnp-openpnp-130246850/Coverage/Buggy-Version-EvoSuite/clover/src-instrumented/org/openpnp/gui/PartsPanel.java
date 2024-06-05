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

package org.openpnp.gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.prefs.Preferences;
import java.util.regex.PatternSyntaxException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;

import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.support.ActionGroup;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.IdentifiableListCellRenderer;
import org.openpnp.gui.support.IdentifiableTableCellRenderer;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.PackagesComboBoxModel;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.support.WizardContainer;
import org.openpnp.gui.tablemodel.PartsTableModel;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PartAlignment;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class PartsPanel extends JPanel implements WizardContainer {public static class __CLR4_5_229v29vlx1h077l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,3097,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(PartsPanel.class);

    private static final String PREF_DIVIDER_POSITION = "PartsPanel.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;
    private Preferences prefs = Preferences.userNodeForPackage(PartsPanel.class);

    final private Configuration configuration;
    final private Frame frame;

    private PartsTableModel tableModel;
    private TableRowSorter<PartsTableModel> tableSorter;
    private JTextField searchTextField;
    private JTable table;
    private ActionGroup rowSelectedActionGroup;

    public PartsPanel(Configuration configuration, Frame frame) {try{__CLR4_5_229v29vlx1h077l.R.inc(2947);
        __CLR4_5_229v29vlx1h077l.R.inc(2948);this.configuration = configuration;
        __CLR4_5_229v29vlx1h077l.R.inc(2949);this.frame = frame;

        __CLR4_5_229v29vlx1h077l.R.inc(2950);rowSelectedActionGroup = new ActionGroup(deletePartAction, pickPartAction);

        __CLR4_5_229v29vlx1h077l.R.inc(2951);setLayout(new BorderLayout(0, 0));
        __CLR4_5_229v29vlx1h077l.R.inc(2952);tableModel = new PartsTableModel();
        __CLR4_5_229v29vlx1h077l.R.inc(2953);tableSorter = new TableRowSorter<>(tableModel);

        __CLR4_5_229v29vlx1h077l.R.inc(2954);JPanel toolbarAndSearch = new JPanel();
        __CLR4_5_229v29vlx1h077l.R.inc(2955);add(toolbarAndSearch, BorderLayout.NORTH);
        __CLR4_5_229v29vlx1h077l.R.inc(2956);toolbarAndSearch.setLayout(new BorderLayout(0, 0));

        __CLR4_5_229v29vlx1h077l.R.inc(2957);JToolBar toolBar = new JToolBar();
        __CLR4_5_229v29vlx1h077l.R.inc(2958);toolBar.setFloatable(false);
        __CLR4_5_229v29vlx1h077l.R.inc(2959);toolbarAndSearch.add(toolBar);

        __CLR4_5_229v29vlx1h077l.R.inc(2960);JPanel panel_1 = new JPanel();
        __CLR4_5_229v29vlx1h077l.R.inc(2961);toolbarAndSearch.add(panel_1, BorderLayout.EAST);

        __CLR4_5_229v29vlx1h077l.R.inc(2962);JLabel lblSearch = new JLabel("Search");
        __CLR4_5_229v29vlx1h077l.R.inc(2963);panel_1.add(lblSearch);

        __CLR4_5_229v29vlx1h077l.R.inc(2964);searchTextField = new JTextField();
        __CLR4_5_229v29vlx1h077l.R.inc(2965);searchTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {try{__CLR4_5_229v29vlx1h077l.R.inc(2966);
                __CLR4_5_229v29vlx1h077l.R.inc(2967);search();
            }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

            @Override
            public void insertUpdate(DocumentEvent e) {try{__CLR4_5_229v29vlx1h077l.R.inc(2968);
                __CLR4_5_229v29vlx1h077l.R.inc(2969);search();
            }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

            @Override
            public void changedUpdate(DocumentEvent e) {try{__CLR4_5_229v29vlx1h077l.R.inc(2970);
                __CLR4_5_229v29vlx1h077l.R.inc(2971);search();
            }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
        });
        __CLR4_5_229v29vlx1h077l.R.inc(2972);panel_1.add(searchTextField);
        __CLR4_5_229v29vlx1h077l.R.inc(2973);searchTextField.setColumns(15);

        __CLR4_5_229v29vlx1h077l.R.inc(2974);JComboBox packagesCombo = new JComboBox(new PackagesComboBoxModel());
        __CLR4_5_229v29vlx1h077l.R.inc(2975);packagesCombo.setRenderer(new IdentifiableListCellRenderer<org.openpnp.model.Package>());

        __CLR4_5_229v29vlx1h077l.R.inc(2976);JSplitPane splitPane = new JSplitPane();
        __CLR4_5_229v29vlx1h077l.R.inc(2977);splitPane.setContinuousLayout(true);
        __CLR4_5_229v29vlx1h077l.R.inc(2978);splitPane
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_229v29vlx1h077l.R.inc(2979);splitPane.addPropertyChangeListener("dividerLocation", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_229v29vlx1h077l.R.inc(2980);
                __CLR4_5_229v29vlx1h077l.R.inc(2981);prefs.putInt(PREF_DIVIDER_POSITION, splitPane.getDividerLocation());
            }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
        });
        __CLR4_5_229v29vlx1h077l.R.inc(2982);add(splitPane, BorderLayout.CENTER);

        __CLR4_5_229v29vlx1h077l.R.inc(2983);JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_229v29vlx1h077l.R.inc(2984);JPanel alignmentPanel = new JPanel();
        __CLR4_5_229v29vlx1h077l.R.inc(2985);alignmentPanel.setLayout(new BorderLayout());
        __CLR4_5_229v29vlx1h077l.R.inc(2986);tabbedPane.add("Alignment", new JScrollPane(alignmentPanel));

        __CLR4_5_229v29vlx1h077l.R.inc(2987);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_229v29vlx1h077l.R.inc(2988);table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        __CLR4_5_229v29vlx1h077l.R.inc(2989);table.setDefaultEditor(org.openpnp.model.Package.class,
                new DefaultCellEditor(packagesCombo));
        __CLR4_5_229v29vlx1h077l.R.inc(2990);table.setDefaultRenderer(org.openpnp.model.Package.class,
                new IdentifiableTableCellRenderer<org.openpnp.model.Package>());

        __CLR4_5_229v29vlx1h077l.R.inc(2991);table.setRowSorter(tableSorter);

        __CLR4_5_229v29vlx1h077l.R.inc(2992);splitPane.setLeftComponent(new JScrollPane(table));
        __CLR4_5_229v29vlx1h077l.R.inc(2993);splitPane.setRightComponent(tabbedPane);

        __CLR4_5_229v29vlx1h077l.R.inc(2994);JButton btnNewPart = toolBar.add(newPartAction);
        __CLR4_5_229v29vlx1h077l.R.inc(2995);btnNewPart.setToolTipText("");
        __CLR4_5_229v29vlx1h077l.R.inc(2996);JButton btnDeletePart = toolBar.add(deletePartAction);
        __CLR4_5_229v29vlx1h077l.R.inc(2997);btnDeletePart.setToolTipText("");
        __CLR4_5_229v29vlx1h077l.R.inc(2998);toolBar.addSeparator();
        __CLR4_5_229v29vlx1h077l.R.inc(2999);JButton btnAlign = toolBar.add(pickPartAction);

        __CLR4_5_229v29vlx1h077l.R.inc(3000);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_229v29vlx1h077l.R.inc(3001);
                __CLR4_5_229v29vlx1h077l.R.inc(3002);if ((((e.getValueIsAdjusting())&&(__CLR4_5_229v29vlx1h077l.R.iget(3003)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3004)==0&false))) {{
                    __CLR4_5_229v29vlx1h077l.R.inc(3005);return;
                }
                }__CLR4_5_229v29vlx1h077l.R.inc(3006);Part part = getSelectedPart();

                __CLR4_5_229v29vlx1h077l.R.inc(3007);rowSelectedActionGroup.setEnabled(part != null);

                __CLR4_5_229v29vlx1h077l.R.inc(3008);alignmentPanel.removeAll();

                __CLR4_5_229v29vlx1h077l.R.inc(3009);if ((((part != null)&&(__CLR4_5_229v29vlx1h077l.R.iget(3010)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3011)==0&false))) {{
                    __CLR4_5_229v29vlx1h077l.R.inc(3012);PartAlignment partAlignment =
                            Configuration.get().getMachine().getPartAlignment();
                    __CLR4_5_229v29vlx1h077l.R.inc(3013);Wizard wizard = partAlignment.getPartConfigurationWizard(part);
                    __CLR4_5_229v29vlx1h077l.R.inc(3014);if ((((wizard != null)&&(__CLR4_5_229v29vlx1h077l.R.iget(3015)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3016)==0&false))) {{
                        __CLR4_5_229v29vlx1h077l.R.inc(3017);wizard.setWizardContainer(PartsPanel.this);
                        __CLR4_5_229v29vlx1h077l.R.inc(3018);alignmentPanel.add(wizard.getWizardPanel());
                    }
                }}

                }__CLR4_5_229v29vlx1h077l.R.inc(3019);revalidate();
                __CLR4_5_229v29vlx1h077l.R.inc(3020);repaint();
            }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
        });

        __CLR4_5_229v29vlx1h077l.R.inc(3021);rowSelectedActionGroup.setEnabled(false);
    }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

    private Part getSelectedPart() {try{__CLR4_5_229v29vlx1h077l.R.inc(3022);
        __CLR4_5_229v29vlx1h077l.R.inc(3023);int index = table.getSelectedRow();
        __CLR4_5_229v29vlx1h077l.R.inc(3024);if ((((index == -1)&&(__CLR4_5_229v29vlx1h077l.R.iget(3025)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3026)==0&false))) {{
            __CLR4_5_229v29vlx1h077l.R.inc(3027);return null;
        }
        }__CLR4_5_229v29vlx1h077l.R.inc(3028);index = table.convertRowIndexToModel(index);
        __CLR4_5_229v29vlx1h077l.R.inc(3029);return tableModel.getPart(index);
    }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

    private void search() {try{__CLR4_5_229v29vlx1h077l.R.inc(3030);
        __CLR4_5_229v29vlx1h077l.R.inc(3031);RowFilter<PartsTableModel, Object> rf = null;
        // If current expression doesn't parse, don't update.
        __CLR4_5_229v29vlx1h077l.R.inc(3032);try {
            __CLR4_5_229v29vlx1h077l.R.inc(3033);rf = RowFilter.regexFilter("(?i)" + searchTextField.getText().trim());
        }
        catch (PatternSyntaxException e) {
            __CLR4_5_229v29vlx1h077l.R.inc(3034);logger.warn("Search failed", e);
            __CLR4_5_229v29vlx1h077l.R.inc(3035);return;
        }
        __CLR4_5_229v29vlx1h077l.R.inc(3036);tableSorter.setRowFilter(rf);
    }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

    public final Action newPartAction = new AbstractAction() {
        {try{__CLR4_5_229v29vlx1h077l.R.inc(3037);
            __CLR4_5_229v29vlx1h077l.R.inc(3038);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_229v29vlx1h077l.R.inc(3039);putValue(NAME, "New Part...");
            __CLR4_5_229v29vlx1h077l.R.inc(3040);putValue(SHORT_DESCRIPTION, "Create a new part, specifying it's ID.");
        }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_229v29vlx1h077l.R.inc(3041);
            __CLR4_5_229v29vlx1h077l.R.inc(3042);if ((((Configuration.get().getPackages().size() == 0)&&(__CLR4_5_229v29vlx1h077l.R.iget(3043)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3044)==0&false))) {{
                __CLR4_5_229v29vlx1h077l.R.inc(3045);MessageBoxes.errorBox(getTopLevelAncestor(), "Error",
                        "There are currently no packages defined in the system. Please create at least one package before creating a part.");
                __CLR4_5_229v29vlx1h077l.R.inc(3046);return;
            }

            }__CLR4_5_229v29vlx1h077l.R.inc(3047);String id;
            __CLR4_5_229v29vlx1h077l.R.inc(3048);while ((id = JOptionPane.showInputDialog(frame,
                    "Please enter an ID for the new part.")) != null) {{
                __CLR4_5_229v29vlx1h077l.R.inc(3051);if ((((configuration.getPart(id) != null)&&(__CLR4_5_229v29vlx1h077l.R.iget(3052)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3053)==0&false))) {{
                    __CLR4_5_229v29vlx1h077l.R.inc(3054);MessageBoxes.errorBox(frame, "Error", "Part ID " + id + " already exists.");
                    __CLR4_5_229v29vlx1h077l.R.inc(3055);continue;
                }
                }__CLR4_5_229v29vlx1h077l.R.inc(3056);Part part = new Part(id);

                __CLR4_5_229v29vlx1h077l.R.inc(3057);part.setPackage(Configuration.get().getPackages().get(0));

                __CLR4_5_229v29vlx1h077l.R.inc(3058);configuration.addPart(part);
                __CLR4_5_229v29vlx1h077l.R.inc(3059);tableModel.fireTableDataChanged();
                __CLR4_5_229v29vlx1h077l.R.inc(3060);Helpers.selectLastTableRow(table);
                __CLR4_5_229v29vlx1h077l.R.inc(3061);break;
            }
        }}finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
    };

    public final Action deletePartAction = new AbstractAction() {
        {try{__CLR4_5_229v29vlx1h077l.R.inc(3062);
            __CLR4_5_229v29vlx1h077l.R.inc(3063);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_229v29vlx1h077l.R.inc(3064);putValue(NAME, "Delete Part");
            __CLR4_5_229v29vlx1h077l.R.inc(3065);putValue(SHORT_DESCRIPTION, "Delete the currently selected part.");
        }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_229v29vlx1h077l.R.inc(3066);
            __CLR4_5_229v29vlx1h077l.R.inc(3067);int ret = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "Are you sure you want to delete " + getSelectedPart().getId() + "?",
                    "Delete " + getSelectedPart().getId() + "?", JOptionPane.YES_NO_OPTION);
            __CLR4_5_229v29vlx1h077l.R.inc(3068);if ((((ret == JOptionPane.YES_OPTION)&&(__CLR4_5_229v29vlx1h077l.R.iget(3069)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3070)==0&false))) {{
                __CLR4_5_229v29vlx1h077l.R.inc(3071);Configuration.get().removePart(getSelectedPart());
            }
        }}finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
    };

    public final Action pickPartAction = new AbstractAction() {
        {try{__CLR4_5_229v29vlx1h077l.R.inc(3072);
            __CLR4_5_229v29vlx1h077l.R.inc(3073);putValue(SMALL_ICON, Icons.load);
            __CLR4_5_229v29vlx1h077l.R.inc(3074);putValue(NAME, "Pick Part");
            __CLR4_5_229v29vlx1h077l.R.inc(3075);putValue(SHORT_DESCRIPTION, "Pick the selected part from the first available feeder.");
        }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_229v29vlx1h077l.R.inc(3076);
            __CLR4_5_229v29vlx1h077l.R.inc(3077);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_229v29vlx1h077l.R.inc(3078);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();
                __CLR4_5_229v29vlx1h077l.R.inc(3079);Part part = getSelectedPart();
                __CLR4_5_229v29vlx1h077l.R.inc(3080);Feeder feeder = null;
                // find a feeder to feed
                __CLR4_5_229v29vlx1h077l.R.inc(3081);for (Feeder f : Configuration.get().getMachine().getFeeders()) {{
                    __CLR4_5_229v29vlx1h077l.R.inc(3082);if ((((f.isEnabled() && f.getPart().equals(part))&&(__CLR4_5_229v29vlx1h077l.R.iget(3083)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3084)==0&false))) {{
                        __CLR4_5_229v29vlx1h077l.R.inc(3085);feeder = f;
                    }
                }}
                }__CLR4_5_229v29vlx1h077l.R.inc(3086);if ((((feeder == null)&&(__CLR4_5_229v29vlx1h077l.R.iget(3087)!=0|true))||(__CLR4_5_229v29vlx1h077l.R.iget(3088)==0&false))) {{
                    __CLR4_5_229v29vlx1h077l.R.inc(3089);throw new Exception("No valid feeder found for " + part.getId());
                }
                // feed the chosen feeder
                }__CLR4_5_229v29vlx1h077l.R.inc(3090);feeder.feed(nozzle);
                // pick the part
                __CLR4_5_229v29vlx1h077l.R.inc(3091);Location pickLocation = feeder.getPickLocation();
                __CLR4_5_229v29vlx1h077l.R.inc(3092);MovableUtils.moveToLocationAtSafeZ(nozzle, pickLocation);
                __CLR4_5_229v29vlx1h077l.R.inc(3093);nozzle.pick(part);
                __CLR4_5_229v29vlx1h077l.R.inc(3094);nozzle.moveToSafeZ();
            });
        }finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
    };

    @Override
    public void wizardCompleted(Wizard wizard) {try{__CLR4_5_229v29vlx1h077l.R.inc(3095);}finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}

    @Override
    public void wizardCancelled(Wizard wizard) {try{__CLR4_5_229v29vlx1h077l.R.inc(3096);}finally{__CLR4_5_229v29vlx1h077l.R.flushNeeded();}}
}
