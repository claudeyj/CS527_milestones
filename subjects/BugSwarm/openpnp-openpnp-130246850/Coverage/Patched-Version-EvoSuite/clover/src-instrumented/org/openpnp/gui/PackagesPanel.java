/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is package of OpenPnP.
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
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.prefs.Preferences;
import java.util.regex.PatternSyntaxException;

import javax.swing.AbstractAction;
import javax.swing.Action;
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
import org.openpnp.gui.components.CameraView;
import org.openpnp.gui.support.ActionGroup;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.tablemodel.PackagesTableModel;
import org.openpnp.model.Configuration;
import org.openpnp.model.Package;
import org.openpnp.model.Part;
import org.openpnp.spi.Camera;
import org.simpleframework.xml.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class PackagesPanel extends JPanel {public static class __CLR4_5_225c25clx1h5jx9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,2947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(PackagesPanel.class);

    private static final String PREF_DIVIDER_POSITION = "PackagesPanel.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;
    private Preferences prefs = Preferences.userNodeForPackage(PackagesPanel.class);

    final private Configuration configuration;
    final private Frame frame;

    private PackagesTableModel tableModel;
    private TableRowSorter<PackagesTableModel> tableSorter;
    private JTextField searchTextField;
    private JTable table;
    private ActionGroup rowSelectedActionGroup;

    public PackagesPanel(Configuration configuration, Frame frame) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2784);
        __CLR4_5_225c25clx1h5jx9.R.inc(2785);this.configuration = configuration;
        __CLR4_5_225c25clx1h5jx9.R.inc(2786);this.frame = frame;

        __CLR4_5_225c25clx1h5jx9.R.inc(2787);setLayout(new BorderLayout(0, 0));
        __CLR4_5_225c25clx1h5jx9.R.inc(2788);tableModel = new PackagesTableModel(configuration);
        __CLR4_5_225c25clx1h5jx9.R.inc(2789);tableSorter = new TableRowSorter<>(tableModel);

        __CLR4_5_225c25clx1h5jx9.R.inc(2790);JPanel toolbarAndSearch = new JPanel();
        __CLR4_5_225c25clx1h5jx9.R.inc(2791);add(toolbarAndSearch, BorderLayout.NORTH);
        __CLR4_5_225c25clx1h5jx9.R.inc(2792);toolbarAndSearch.setLayout(new BorderLayout(0, 0));

        __CLR4_5_225c25clx1h5jx9.R.inc(2793);JToolBar toolBar = new JToolBar();
        __CLR4_5_225c25clx1h5jx9.R.inc(2794);toolBar.setFloatable(false);
        __CLR4_5_225c25clx1h5jx9.R.inc(2795);toolbarAndSearch.add(toolBar);

        __CLR4_5_225c25clx1h5jx9.R.inc(2796);JPanel panel_1 = new JPanel();
        __CLR4_5_225c25clx1h5jx9.R.inc(2797);toolbarAndSearch.add(panel_1, BorderLayout.EAST);

        __CLR4_5_225c25clx1h5jx9.R.inc(2798);JLabel lblSearch = new JLabel("Search");
        __CLR4_5_225c25clx1h5jx9.R.inc(2799);panel_1.add(lblSearch);

        __CLR4_5_225c25clx1h5jx9.R.inc(2800);searchTextField = new JTextField();
        __CLR4_5_225c25clx1h5jx9.R.inc(2801);searchTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2802);
                __CLR4_5_225c25clx1h5jx9.R.inc(2803);search();
            }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

            @Override
            public void insertUpdate(DocumentEvent e) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2804);
                __CLR4_5_225c25clx1h5jx9.R.inc(2805);search();
            }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

            @Override
            public void changedUpdate(DocumentEvent e) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2806);
                __CLR4_5_225c25clx1h5jx9.R.inc(2807);search();
            }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
        });
        __CLR4_5_225c25clx1h5jx9.R.inc(2808);panel_1.add(searchTextField);
        __CLR4_5_225c25clx1h5jx9.R.inc(2809);searchTextField.setColumns(15);

        __CLR4_5_225c25clx1h5jx9.R.inc(2810);JSplitPane splitPane = new JSplitPane();
        __CLR4_5_225c25clx1h5jx9.R.inc(2811);splitPane.setContinuousLayout(true);
        __CLR4_5_225c25clx1h5jx9.R.inc(2812);splitPane
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_225c25clx1h5jx9.R.inc(2813);splitPane.addPropertyChangeListener("dividerLocation", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2814);
                __CLR4_5_225c25clx1h5jx9.R.inc(2815);prefs.putInt(PREF_DIVIDER_POSITION, splitPane.getDividerLocation());
            }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
        });
        __CLR4_5_225c25clx1h5jx9.R.inc(2816);add(splitPane, BorderLayout.CENTER);

        __CLR4_5_225c25clx1h5jx9.R.inc(2817);JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_225c25clx1h5jx9.R.inc(2818);JPanel footprintPanel = new JPanel();
        __CLR4_5_225c25clx1h5jx9.R.inc(2819);footprintPanel.setLayout(new BorderLayout());
        __CLR4_5_225c25clx1h5jx9.R.inc(2820);tabbedPane.add("Footprint", new JScrollPane(footprintPanel));


        __CLR4_5_225c25clx1h5jx9.R.inc(2821);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_225c25clx1h5jx9.R.inc(2822);table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        __CLR4_5_225c25clx1h5jx9.R.inc(2823);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2824);
                __CLR4_5_225c25clx1h5jx9.R.inc(2825);if ((((e.getValueIsAdjusting())&&(__CLR4_5_225c25clx1h5jx9.R.iget(2826)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2827)==0&false))) {{
                    __CLR4_5_225c25clx1h5jx9.R.inc(2828);return;
                }

                }__CLR4_5_225c25clx1h5jx9.R.inc(2829);Package pkg = getSelectedPackage();

                __CLR4_5_225c25clx1h5jx9.R.inc(2830);rowSelectedActionGroup.setEnabled(pkg != null);

                __CLR4_5_225c25clx1h5jx9.R.inc(2831);footprintPanel.removeAll();

                __CLR4_5_225c25clx1h5jx9.R.inc(2832);if ((((pkg != null)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2833)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2834)==0&false))) {{
                    __CLR4_5_225c25clx1h5jx9.R.inc(2835);footprintPanel.add(new FootprintPanel(pkg.getFootprint()), BorderLayout.CENTER);
                }

                }__CLR4_5_225c25clx1h5jx9.R.inc(2836);revalidate();
                __CLR4_5_225c25clx1h5jx9.R.inc(2837);repaint();
            }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
        });

        __CLR4_5_225c25clx1h5jx9.R.inc(2838);table.setRowSorter(tableSorter);

        __CLR4_5_225c25clx1h5jx9.R.inc(2839);splitPane.setLeftComponent(new JScrollPane(table));
        __CLR4_5_225c25clx1h5jx9.R.inc(2840);splitPane.setRightComponent(tabbedPane);

        __CLR4_5_225c25clx1h5jx9.R.inc(2841);rowSelectedActionGroup = new ActionGroup(deletePackageAction, copyPackageToClipboardAction);
        __CLR4_5_225c25clx1h5jx9.R.inc(2842);rowSelectedActionGroup.setEnabled(false);

        __CLR4_5_225c25clx1h5jx9.R.inc(2843);toolBar.add(newPackageAction);
        __CLR4_5_225c25clx1h5jx9.R.inc(2844);toolBar.add(deletePackageAction);
        __CLR4_5_225c25clx1h5jx9.R.inc(2845);toolBar.addSeparator();
        __CLR4_5_225c25clx1h5jx9.R.inc(2846);toolBar.add(copyPackageToClipboardAction);
        __CLR4_5_225c25clx1h5jx9.R.inc(2847);toolBar.add(pastePackageToClipboardAction);

        __CLR4_5_225c25clx1h5jx9.R.inc(2848);addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2849);
                __CLR4_5_225c25clx1h5jx9.R.inc(2850);try {
                    __CLR4_5_225c25clx1h5jx9.R.inc(2851);Camera camera =
                            Configuration.get().getMachine().getDefaultHead().getDefaultCamera();
                    __CLR4_5_225c25clx1h5jx9.R.inc(2852);CameraView cameraView = MainFrame.cameraPanel.getCameraView(camera);
                    __CLR4_5_225c25clx1h5jx9.R.inc(2853);if ((((cameraView == null)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2854)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2855)==0&false))) {{
                        __CLR4_5_225c25clx1h5jx9.R.inc(2856);return;
                    }
                    }__CLR4_5_225c25clx1h5jx9.R.inc(2857);cameraView.removeReticle(FootprintPanel.class.getName());
                }
                catch (Exception e1) {
                }
            }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
        });
    }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

    private Package getSelectedPackage() {try{__CLR4_5_225c25clx1h5jx9.R.inc(2858);
        __CLR4_5_225c25clx1h5jx9.R.inc(2859);int index = table.getSelectedRow();
        __CLR4_5_225c25clx1h5jx9.R.inc(2860);if ((((index == -1)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2861)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2862)==0&false))) {{
            __CLR4_5_225c25clx1h5jx9.R.inc(2863);return null;
        }
        }__CLR4_5_225c25clx1h5jx9.R.inc(2864);index = table.convertRowIndexToModel(index);
        __CLR4_5_225c25clx1h5jx9.R.inc(2865);return tableModel.getPackage(index);
    }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

    private void search() {try{__CLR4_5_225c25clx1h5jx9.R.inc(2866);
        __CLR4_5_225c25clx1h5jx9.R.inc(2867);RowFilter<PackagesTableModel, Object> rf = null;
        // If current expression doesn't parse, don't update.
        __CLR4_5_225c25clx1h5jx9.R.inc(2868);try {
            __CLR4_5_225c25clx1h5jx9.R.inc(2869);rf = RowFilter.regexFilter("(?i)" + searchTextField.getText().trim());
        }
        catch (PatternSyntaxException e) {
            __CLR4_5_225c25clx1h5jx9.R.inc(2870);logger.warn("Search failed", e);
            __CLR4_5_225c25clx1h5jx9.R.inc(2871);return;
        }
        __CLR4_5_225c25clx1h5jx9.R.inc(2872);tableSorter.setRowFilter(rf);
    }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

    public final Action newPackageAction = new AbstractAction() {
        {try{__CLR4_5_225c25clx1h5jx9.R.inc(2873);
            __CLR4_5_225c25clx1h5jx9.R.inc(2874);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_225c25clx1h5jx9.R.inc(2875);putValue(NAME, "New Package...");
            __CLR4_5_225c25clx1h5jx9.R.inc(2876);putValue(SHORT_DESCRIPTION, "Create a new package, specifying it's ID.");
        }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2877);
            __CLR4_5_225c25clx1h5jx9.R.inc(2878);String id;
            __CLR4_5_225c25clx1h5jx9.R.inc(2879);while ((id = JOptionPane.showInputDialog(frame,
                    "Please enter an ID for the new package.")) != null) {{
                __CLR4_5_225c25clx1h5jx9.R.inc(2882);if ((((configuration.getPackage(id) != null)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2883)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2884)==0&false))) {{
                    __CLR4_5_225c25clx1h5jx9.R.inc(2885);MessageBoxes.errorBox(frame, "Error", "Package ID " + id + " already exists.");
                    __CLR4_5_225c25clx1h5jx9.R.inc(2886);continue;
                }
                }__CLR4_5_225c25clx1h5jx9.R.inc(2887);Package this_package = new Package(id);

                __CLR4_5_225c25clx1h5jx9.R.inc(2888);configuration.addPackage(this_package);
                __CLR4_5_225c25clx1h5jx9.R.inc(2889);tableModel.fireTableDataChanged();
                __CLR4_5_225c25clx1h5jx9.R.inc(2890);Helpers.selectLastTableRow(table);
                __CLR4_5_225c25clx1h5jx9.R.inc(2891);break;
            }
        }}finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
    };

    public final Action deletePackageAction = new AbstractAction() {
        {try{__CLR4_5_225c25clx1h5jx9.R.inc(2892);
            __CLR4_5_225c25clx1h5jx9.R.inc(2893);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_225c25clx1h5jx9.R.inc(2894);putValue(NAME, "Delete Package");
            __CLR4_5_225c25clx1h5jx9.R.inc(2895);putValue(SHORT_DESCRIPTION, "Delete the currently selected package.");
        }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2896);
            // Check to make sure there are no parts using this package.
            __CLR4_5_225c25clx1h5jx9.R.inc(2897);for (Part part : Configuration.get().getParts()) {{
                __CLR4_5_225c25clx1h5jx9.R.inc(2898);if ((((part.getPackage() == getSelectedPackage())&&(__CLR4_5_225c25clx1h5jx9.R.iget(2899)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2900)==0&false))) {{
                    __CLR4_5_225c25clx1h5jx9.R.inc(2901);MessageBoxes.errorBox(getTopLevelAncestor(), "Error",
                            getSelectedPackage().getId() + " cannot be deleted. It is used by "
                                    + part.getId());
                    __CLR4_5_225c25clx1h5jx9.R.inc(2902);return;
                }
            }}
            }__CLR4_5_225c25clx1h5jx9.R.inc(2903);int ret = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "Are you sure you want to delete " + getSelectedPackage().getId() + "?",
                    "Delete " + getSelectedPackage().getId() + "?", JOptionPane.YES_NO_OPTION);
            __CLR4_5_225c25clx1h5jx9.R.inc(2904);if ((((ret == JOptionPane.YES_OPTION)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2905)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2906)==0&false))) {{
                __CLR4_5_225c25clx1h5jx9.R.inc(2907);Configuration.get().removePackage(getSelectedPackage());
            }
        }}finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
    };

    public final Action copyPackageToClipboardAction = new AbstractAction() {
        {try{__CLR4_5_225c25clx1h5jx9.R.inc(2908);
            __CLR4_5_225c25clx1h5jx9.R.inc(2909);putValue(SMALL_ICON, Icons.copy);
            __CLR4_5_225c25clx1h5jx9.R.inc(2910);putValue(NAME, "Copy Package to Clipboard");
            __CLR4_5_225c25clx1h5jx9.R.inc(2911);putValue(SHORT_DESCRIPTION,
                    "Copy the currently selected package to the clipboard in text format.");
        }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2912);
            __CLR4_5_225c25clx1h5jx9.R.inc(2913);Package pkg = getSelectedPackage();
            __CLR4_5_225c25clx1h5jx9.R.inc(2914);if ((((pkg == null)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2915)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2916)==0&false))) {{
                __CLR4_5_225c25clx1h5jx9.R.inc(2917);return;
            }
            }__CLR4_5_225c25clx1h5jx9.R.inc(2918);try {
                __CLR4_5_225c25clx1h5jx9.R.inc(2919);Serializer s = Configuration.get().createSerializer();
                __CLR4_5_225c25clx1h5jx9.R.inc(2920);StringWriter w = new StringWriter();
                __CLR4_5_225c25clx1h5jx9.R.inc(2921);s.write(pkg, w);
                __CLR4_5_225c25clx1h5jx9.R.inc(2922);StringSelection stringSelection = new StringSelection(w.toString());
                __CLR4_5_225c25clx1h5jx9.R.inc(2923);Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                __CLR4_5_225c25clx1h5jx9.R.inc(2924);clipboard.setContents(stringSelection, null);
            }
            catch (Exception e) {
                __CLR4_5_225c25clx1h5jx9.R.inc(2925);MessageBoxes.errorBox(getTopLevelAncestor(), "Copy Failed", e);
            }
        }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
    };

    public final Action pastePackageToClipboardAction = new AbstractAction() {
        {try{__CLR4_5_225c25clx1h5jx9.R.inc(2926);
            __CLR4_5_225c25clx1h5jx9.R.inc(2927);putValue(SMALL_ICON, Icons.paste);
            __CLR4_5_225c25clx1h5jx9.R.inc(2928);putValue(NAME, "Create Package from Clipboard");
            __CLR4_5_225c25clx1h5jx9.R.inc(2929);putValue(SHORT_DESCRIPTION, "Create a new package from a definition on the clipboard.");
        }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_225c25clx1h5jx9.R.inc(2930);
            __CLR4_5_225c25clx1h5jx9.R.inc(2931);try {
                __CLR4_5_225c25clx1h5jx9.R.inc(2932);Serializer ser = Configuration.get().createSerializer();
                __CLR4_5_225c25clx1h5jx9.R.inc(2933);Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                __CLR4_5_225c25clx1h5jx9.R.inc(2934);String s = (String) clipboard.getData(DataFlavor.stringFlavor);
                __CLR4_5_225c25clx1h5jx9.R.inc(2935);StringReader r = new StringReader(s);
                __CLR4_5_225c25clx1h5jx9.R.inc(2936);Package pkg = ser.read(Package.class, s);
                __CLR4_5_225c25clx1h5jx9.R.inc(2937);for (int i = 0;; i++) {{
                    __CLR4_5_225c25clx1h5jx9.R.inc(2938);if ((((Configuration.get().getPackage(pkg.getId() + "-" + i) == null)&&(__CLR4_5_225c25clx1h5jx9.R.iget(2939)!=0|true))||(__CLR4_5_225c25clx1h5jx9.R.iget(2940)==0&false))) {{
                        __CLR4_5_225c25clx1h5jx9.R.inc(2941);pkg.setId(pkg.getId() + "-" + i);
                        __CLR4_5_225c25clx1h5jx9.R.inc(2942);Configuration.get().addPackage(pkg);
                        __CLR4_5_225c25clx1h5jx9.R.inc(2943);break;
                    }
                }}
                }__CLR4_5_225c25clx1h5jx9.R.inc(2944);tableModel.fireTableDataChanged();
                __CLR4_5_225c25clx1h5jx9.R.inc(2945);Helpers.selectLastTableRow(table);
            }
            catch (Exception e) {
                __CLR4_5_225c25clx1h5jx9.R.inc(2946);MessageBoxes.errorBox(getTopLevelAncestor(), "Paste Failed", e);
            }
        }finally{__CLR4_5_225c25clx1h5jx9.R.flushNeeded();}}
    };
}
