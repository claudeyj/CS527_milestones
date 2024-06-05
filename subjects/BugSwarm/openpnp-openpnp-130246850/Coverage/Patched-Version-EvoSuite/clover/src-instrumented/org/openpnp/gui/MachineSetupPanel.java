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
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.prefs.Preferences;

import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.support.WizardContainer;
import org.openpnp.model.Configuration;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.PropertySheetHolder.PropertySheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class MachineSetupPanel extends JPanel implements WizardContainer {public static class __CLR4_5_21tf1tflx1h5jge{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,2477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(MachineSetupPanel.class);

    private static final String PREF_DIVIDER_POSITION = "MachineSetupPanel.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;

    private JTextField searchTextField;

    private Preferences prefs = Preferences.userNodeForPackage(MachineSetupPanel.class);
    private JTree tree;
    private JTabbedPane tabbedPane;
    private JToolBar toolBar;

    public MachineSetupPanel() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2355);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2356);setLayout(new BorderLayout(0, 0));

        __CLR4_5_21tf1tflx1h5jge.R.inc(2357);JPanel panel = new JPanel();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2358);add(panel, BorderLayout.NORTH);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2359);panel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_21tf1tflx1h5jge.R.inc(2360);toolBar = new JToolBar();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2361);toolBar.setFloatable(false);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2362);panel.add(toolBar, BorderLayout.CENTER);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2363);JPanel panel_1 = new JPanel();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2364);panel.add(panel_1, BorderLayout.EAST);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2365);JLabel lblSearch = new JLabel("Search");
        __CLR4_5_21tf1tflx1h5jge.R.inc(2366);panel_1.add(lblSearch);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2367);searchTextField = new JTextField();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2368);searchTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2369);
                __CLR4_5_21tf1tflx1h5jge.R.inc(2370);search();
            }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

            @Override
            public void insertUpdate(DocumentEvent e) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2371);
                __CLR4_5_21tf1tflx1h5jge.R.inc(2372);search();
            }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

            @Override
            public void changedUpdate(DocumentEvent e) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2373);
                __CLR4_5_21tf1tflx1h5jge.R.inc(2374);search();
            }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}
        });
        __CLR4_5_21tf1tflx1h5jge.R.inc(2375);panel_1.add(searchTextField);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2376);searchTextField.setColumns(15);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2377);final JSplitPane splitPane = new JSplitPane();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2378);splitPane.setContinuousLayout(true);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2379);splitPane
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_21tf1tflx1h5jge.R.inc(2380);splitPane.addPropertyChangeListener("dividerLocation", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2381);
                __CLR4_5_21tf1tflx1h5jge.R.inc(2382);prefs.putInt(PREF_DIVIDER_POSITION, splitPane.getDividerLocation());
            }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}
        });
        __CLR4_5_21tf1tflx1h5jge.R.inc(2383);add(splitPane, BorderLayout.CENTER);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2384);JScrollPane scrollPane = new JScrollPane();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2385);splitPane.setLeftComponent(scrollPane);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2386);tree = new JTree();
        __CLR4_5_21tf1tflx1h5jge.R.inc(2387);tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2388);tree.setCellRenderer(treeCellRenderer);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2389);scrollPane.setViewportView(tree);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2390);tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_21tf1tflx1h5jge.R.inc(2391);splitPane.setRightComponent(tabbedPane);

        __CLR4_5_21tf1tflx1h5jge.R.inc(2392);tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2393);
                __CLR4_5_21tf1tflx1h5jge.R.inc(2394);tabbedPane.removeAll();
                __CLR4_5_21tf1tflx1h5jge.R.inc(2395);toolBar.removeAll();

                __CLR4_5_21tf1tflx1h5jge.R.inc(2396);TreePath path = tree.getSelectionPath();
                __CLR4_5_21tf1tflx1h5jge.R.inc(2397);for (Object o : path.getPath()) {{
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2398);PropertySheetHolderTreeNode node = (PropertySheetHolderTreeNode) o;
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2399);Action[] actions = node.obj.getPropertySheetHolderActions();
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2400);if ((((actions != null)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2401)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2402)==0&false))) {{
                        __CLR4_5_21tf1tflx1h5jge.R.inc(2403);if ((((toolBar.getComponentCount() > 0)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2404)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2405)==0&false))) {{
                            __CLR4_5_21tf1tflx1h5jge.R.inc(2406);toolBar.addSeparator();
                        }
                        }__CLR4_5_21tf1tflx1h5jge.R.inc(2407);for (Action action : actions) {{
                            __CLR4_5_21tf1tflx1h5jge.R.inc(2408);toolBar.add(action);
                        }
                    }}
                }}

                }__CLR4_5_21tf1tflx1h5jge.R.inc(2409);PropertySheetHolderTreeNode node =
                        (PropertySheetHolderTreeNode) path.getLastPathComponent();
                __CLR4_5_21tf1tflx1h5jge.R.inc(2410);if ((((node != null)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2411)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2412)==0&false))) {{
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2413);PropertySheet[] propertySheets = node.obj.getPropertySheets();
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2414);if ((((propertySheets != null)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2415)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2416)==0&false))) {{
                        __CLR4_5_21tf1tflx1h5jge.R.inc(2417);for (PropertySheet propertySheet : propertySheets) {{
                            __CLR4_5_21tf1tflx1h5jge.R.inc(2418);String title = propertySheet.getPropertySheetTitle();
                            __CLR4_5_21tf1tflx1h5jge.R.inc(2419);JPanel panel = propertySheet.getPropertySheetPanel();
                            __CLR4_5_21tf1tflx1h5jge.R.inc(2420);if ((((title == null)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2421)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2422)==0&false))) {{
                                __CLR4_5_21tf1tflx1h5jge.R.inc(2423);title = "Untitled";
                            }
                            }__CLR4_5_21tf1tflx1h5jge.R.inc(2424);if ((((panel != null)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2425)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2426)==0&false))) {{
                                __CLR4_5_21tf1tflx1h5jge.R.inc(2427);tabbedPane.add(title, panel);
                            }
                        }}
                    }}
                }}

                }__CLR4_5_21tf1tflx1h5jge.R.inc(2428);revalidate();
                __CLR4_5_21tf1tflx1h5jge.R.inc(2429);repaint();
            }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}
        });

        __CLR4_5_21tf1tflx1h5jge.R.inc(2430);Configuration.get().addListener(new ConfigurationListener() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2431);}finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

            @Override
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2432);
                __CLR4_5_21tf1tflx1h5jge.R.inc(2433);tree.setModel(new DefaultTreeModel(
                        new PropertySheetHolderTreeNode(Configuration.get().getMachine(), null)));
                __CLR4_5_21tf1tflx1h5jge.R.inc(2434);for (int i = 0; (((i < tree.getRowCount())&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2435)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2436)==0&false)); i++) {{
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2437);tree.expandRow(i);
                }
            }}finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}
        });
    }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

    private void search() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2438);}finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

    @Override
    public void wizardCompleted(Wizard wizard) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2439);}finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

    @Override
    public void wizardCancelled(Wizard wizard) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2440);}finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

    public class PropertySheetHolderTreeNode implements TreeNode {
        private final PropertySheetHolder obj;
        private final TreeNode parent;
        private final ArrayList<PropertySheetHolderTreeNode> children = new ArrayList<>();

        public PropertySheetHolderTreeNode(PropertySheetHolder obj, TreeNode parent) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2441);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2442);this.obj = obj;
            __CLR4_5_21tf1tflx1h5jge.R.inc(2443);this.parent = parent;
            __CLR4_5_21tf1tflx1h5jge.R.inc(2444);PropertySheetHolder[] children = obj.getChildPropertySheetHolders();
            __CLR4_5_21tf1tflx1h5jge.R.inc(2445);if ((((children != null)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2446)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2447)==0&false))) {{
                __CLR4_5_21tf1tflx1h5jge.R.inc(2448);for (PropertySheetHolder child : children) {{
                    __CLR4_5_21tf1tflx1h5jge.R.inc(2449);this.children.add(new PropertySheetHolderTreeNode(child, this));
                }
            }}
        }}finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        public PropertySheetHolder getPropertySheetHolder() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2450);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2451);return obj;
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public TreeNode getChildAt(int childIndex) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2452);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2453);return children.get(childIndex);
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public int getChildCount() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2454);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2455);return children.size();
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public TreeNode getParent() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2456);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2457);return parent;
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public int getIndex(TreeNode node) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2458);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2459);return children.indexOf(node);
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public boolean getAllowsChildren() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2460);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2461);return children.size() > 0;
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public boolean isLeaf() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2462);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2463);return children.size() < 1;
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public Enumeration children() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2464);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2465);return Collections.enumeration(children);
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2466);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2467);return obj.getPropertySheetHolderTitle();
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}
    }

    private TreeCellRenderer treeCellRenderer = new DefaultTreeCellRenderer() {
        // http://stackoverflow.com/questions/20691946/set-icon-to-each-node-in-jtree
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected,
                boolean expanded, boolean leaf, int row, boolean hasFocus) {try{__CLR4_5_21tf1tflx1h5jge.R.inc(2468);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2469);super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row,
                    hasFocus);
            __CLR4_5_21tf1tflx1h5jge.R.inc(2470);if ((((value instanceof PropertySheetHolderTreeNode)&&(__CLR4_5_21tf1tflx1h5jge.R.iget(2471)!=0|true))||(__CLR4_5_21tf1tflx1h5jge.R.iget(2472)==0&false))) {{
                __CLR4_5_21tf1tflx1h5jge.R.inc(2473);PropertySheetHolderTreeNode node = (PropertySheetHolderTreeNode) value;
                __CLR4_5_21tf1tflx1h5jge.R.inc(2474);PropertySheetHolder psh = node.getPropertySheetHolder();
                __CLR4_5_21tf1tflx1h5jge.R.inc(2475);setIcon(psh.getPropertySheetHolderIcon());
            }
            }__CLR4_5_21tf1tflx1h5jge.R.inc(2476);return this;
        }finally{__CLR4_5_21tf1tflx1h5jge.R.flushNeeded();}}
    };
}
