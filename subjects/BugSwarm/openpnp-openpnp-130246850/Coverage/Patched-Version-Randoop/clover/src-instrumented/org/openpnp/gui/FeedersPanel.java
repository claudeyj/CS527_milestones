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
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.prefs.Preferences;
import java.util.regex.PatternSyntaxException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;

import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.components.ClassSelectionDialog;
import org.openpnp.gui.support.ActionGroup;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.support.WizardContainer;
import org.openpnp.gui.tablemodel.FeedersTableModel;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.Nozzle;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class FeedersPanel extends JPanel implements WizardContainer {public static class __CLR4_5_2a7a7lx1h6xrk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(FeedersPanel.class);

    private final Configuration configuration;
    private final MainFrame mainFrame;

    private static final String PREF_DIVIDER_POSITION = "FeedersPanel.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;

    private JTable table;

    private FeedersTableModel tableModel;
    private TableRowSorter<FeedersTableModel> tableSorter;
    private JTextField searchTextField;
    private JPanel configurationPanel;

    private ActionGroup feederSelectedActionGroup;

    private Preferences prefs = Preferences.userNodeForPackage(FeedersPanel.class);

    public FeedersPanel(Configuration configuration, MainFrame mainFrame) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(367);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(368);this.configuration = configuration;
        __CLR4_5_2a7a7lx1h6xrk.R.inc(369);this.mainFrame = mainFrame;

        __CLR4_5_2a7a7lx1h6xrk.R.inc(370);setLayout(new BorderLayout(0, 0));
        __CLR4_5_2a7a7lx1h6xrk.R.inc(371);tableModel = new FeedersTableModel(configuration);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(372);JPanel panel = new JPanel();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(373);add(panel, BorderLayout.NORTH);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(374);panel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2a7a7lx1h6xrk.R.inc(375);JToolBar toolBar = new JToolBar();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(376);toolBar.setFloatable(false);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(377);panel.add(toolBar, BorderLayout.CENTER);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(378);JButton btnNewFeeder = new JButton(newFeederAction);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(379);btnNewFeeder.setHideActionText(true);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(380);toolBar.add(btnNewFeeder);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(381);JButton btnDeleteFeeder = new JButton(deleteFeederAction);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(382);btnDeleteFeeder.setHideActionText(true);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(383);toolBar.add(btnDeleteFeeder);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(384);toolBar.addSeparator();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(385);toolBar.add(feedFeederAction);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(386);toolBar.add(moveCameraToPickLocation);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(387);toolBar.add(moveToolToPickLocation);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(388);toolBar.add(pickFeederAction);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(389);JPanel panel_1 = new JPanel();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(390);panel.add(panel_1, BorderLayout.EAST);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(391);JLabel lblSearch = new JLabel("Search");
        __CLR4_5_2a7a7lx1h6xrk.R.inc(392);panel_1.add(lblSearch);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(393);searchTextField = new JTextField();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(394);searchTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(395);
                __CLR4_5_2a7a7lx1h6xrk.R.inc(396);search();
            }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

            @Override
            public void insertUpdate(DocumentEvent e) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(397);
                __CLR4_5_2a7a7lx1h6xrk.R.inc(398);search();
            }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

            @Override
            public void changedUpdate(DocumentEvent e) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(399);
                __CLR4_5_2a7a7lx1h6xrk.R.inc(400);search();
            }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
        });
        __CLR4_5_2a7a7lx1h6xrk.R.inc(401);panel_1.add(searchTextField);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(402);searchTextField.setColumns(15);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(403);table = new AutoSelectTextTable(tableModel);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(404);tableSorter = new TableRowSorter<>(tableModel);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(405);final JSplitPane splitPane = new JSplitPane();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(406);splitPane.setContinuousLayout(true);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(407);splitPane
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_2a7a7lx1h6xrk.R.inc(408);splitPane.addPropertyChangeListener("dividerLocation", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(409);
                __CLR4_5_2a7a7lx1h6xrk.R.inc(410);prefs.putInt(PREF_DIVIDER_POSITION, splitPane.getDividerLocation());
            }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
        });
        __CLR4_5_2a7a7lx1h6xrk.R.inc(411);add(splitPane, BorderLayout.CENTER);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(412);table.setRowSorter(tableSorter);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(413);table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(414);configurationPanel = new JPanel();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(415);configurationPanel.setBorder(new TitledBorder(null, "Configuration", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));

        __CLR4_5_2a7a7lx1h6xrk.R.inc(416);feederSelectedActionGroup = new ActionGroup(deleteFeederAction, feedFeederAction,
                pickFeederAction, moveCameraToPickLocation, moveToolToPickLocation);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(417);table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(418);
                __CLR4_5_2a7a7lx1h6xrk.R.inc(419);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(420)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(421)==0&false))) {{
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(422);return;
                }

                }__CLR4_5_2a7a7lx1h6xrk.R.inc(423);Feeder feeder = getSelectedFeeder();

                __CLR4_5_2a7a7lx1h6xrk.R.inc(424);feederSelectedActionGroup.setEnabled(feeder != null);

                __CLR4_5_2a7a7lx1h6xrk.R.inc(425);configurationPanel.removeAll();
                __CLR4_5_2a7a7lx1h6xrk.R.inc(426);if ((((feeder != null)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(427)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(428)==0&false))) {{
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(429);Wizard wizard = feeder.getConfigurationWizard();
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(430);if ((((wizard != null)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(431)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(432)==0&false))) {{
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(433);wizard.setWizardContainer(FeedersPanel.this);
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(434);JPanel panel = wizard.getWizardPanel();
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(435);configurationPanel.add(panel);
                    }
                }}
                }__CLR4_5_2a7a7lx1h6xrk.R.inc(436);revalidate();
                __CLR4_5_2a7a7lx1h6xrk.R.inc(437);repaint();
            }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
        });

        __CLR4_5_2a7a7lx1h6xrk.R.inc(438);feederSelectedActionGroup.setEnabled(false);

        __CLR4_5_2a7a7lx1h6xrk.R.inc(439);splitPane.setLeftComponent(new JScrollPane(table));
        __CLR4_5_2a7a7lx1h6xrk.R.inc(440);splitPane.setRightComponent(configurationPanel);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(441);configurationPanel.setLayout(new BorderLayout(0, 0));
    }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    /**
     * Activate the Feeders tab and show the Feeder for the specified Part. If none exists, prompt
     * the user to create a new one.
     * 
     * @param feeder
     */
    public void showFeederForPart(Part part) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(442);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(443);mainFrame.showTab("Feeders");

        __CLR4_5_2a7a7lx1h6xrk.R.inc(444);Feeder feeder = findFeeder(part);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(445);if ((((feeder == null)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(446)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(447)==0&false))) {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(448);newFeeder(part);
        }
        }else {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(449);table.getSelectionModel().clearSelection();
            __CLR4_5_2a7a7lx1h6xrk.R.inc(450);for (int i = 0; (((i < tableModel.getRowCount())&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(451)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(452)==0&false)); i++) {{
                __CLR4_5_2a7a7lx1h6xrk.R.inc(453);if ((((tableModel.getFeeder(i).getPart() == part)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(454)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(455)==0&false))) {{
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(456);table.getSelectionModel().setSelectionInterval(0, i);
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(457);break;
                }
            }}
        }}
    }}finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    private Feeder findFeeder(Part part) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(458);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(459);for (int i = 0; (((i < tableModel.getRowCount())&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(460)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(461)==0&false)); i++) {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(462);if ((((tableModel.getFeeder(i).getPart() == part)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(463)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(464)==0&false))) {{
                __CLR4_5_2a7a7lx1h6xrk.R.inc(465);return tableModel.getFeeder(i);
            }
        }}
        }__CLR4_5_2a7a7lx1h6xrk.R.inc(466);return null;
    }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    private Feeder getSelectedFeeder() {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(467);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(468);int index = table.getSelectedRow();

        __CLR4_5_2a7a7lx1h6xrk.R.inc(469);if ((((index == -1)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(470)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(471)==0&false))) {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(472);return null;
        }

        }__CLR4_5_2a7a7lx1h6xrk.R.inc(473);index = table.convertRowIndexToModel(index);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(474);return tableModel.getFeeder(index);
    }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    private void search() {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(475);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(476);RowFilter<FeedersTableModel, Object> rf = null;
        // If current expression doesn't parse, don't update.
        __CLR4_5_2a7a7lx1h6xrk.R.inc(477);try {
            __CLR4_5_2a7a7lx1h6xrk.R.inc(478);rf = RowFilter.regexFilter("(?i)" + searchTextField.getText().trim());
        }
        catch (PatternSyntaxException e) {
            __CLR4_5_2a7a7lx1h6xrk.R.inc(479);logger.warn("Search failed", e);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(480);return;
        }
        __CLR4_5_2a7a7lx1h6xrk.R.inc(481);tableSorter.setRowFilter(rf);
    }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    @Override
    public void wizardCompleted(Wizard wizard) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(482);
        // Repaint the table so that any changed fields get updated.
        __CLR4_5_2a7a7lx1h6xrk.R.inc(483);table.repaint();
    }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    @Override
    public void wizardCancelled(Wizard wizard) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(484);}finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    private void newFeeder(Part part) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(485);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(486);if ((((Configuration.get().getParts().size() == 0)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(487)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(488)==0&false))) {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(489);MessageBoxes.errorBox(getTopLevelAncestor(), "Error",
                    "There are currently no parts defined in the system. Please create at least one part before creating a feeder.");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(490);return;
        }

        }__CLR4_5_2a7a7lx1h6xrk.R.inc(491);String title;
        __CLR4_5_2a7a7lx1h6xrk.R.inc(492);if ((((part == null)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(493)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(494)==0&false))) {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(495);title = "Select Feeder...";
        }
        }else {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(496);title = "Select Feeder for " + part.getId() + "...";
        }
        }__CLR4_5_2a7a7lx1h6xrk.R.inc(497);ClassSelectionDialog<Feeder> dialog =
                new ClassSelectionDialog<>(JOptionPane.getFrameForComponent(FeedersPanel.this),
                        title, "Please select a Feeder implemention from the list below.",
                        configuration.getMachine().getCompatibleFeederClasses());
        __CLR4_5_2a7a7lx1h6xrk.R.inc(498);dialog.setVisible(true);
        __CLR4_5_2a7a7lx1h6xrk.R.inc(499);Class<? extends Feeder> feederClass = dialog.getSelectedClass();
        __CLR4_5_2a7a7lx1h6xrk.R.inc(500);if ((((feederClass == null)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(501)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(502)==0&false))) {{
            __CLR4_5_2a7a7lx1h6xrk.R.inc(503);return;
        }
        }__CLR4_5_2a7a7lx1h6xrk.R.inc(504);try {
            __CLR4_5_2a7a7lx1h6xrk.R.inc(505);Feeder feeder = feederClass.newInstance();

            __CLR4_5_2a7a7lx1h6xrk.R.inc(506);feeder.setPart((((part == null )&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(507)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(508)==0&false))? Configuration.get().getParts().get(0) : part);

            __CLR4_5_2a7a7lx1h6xrk.R.inc(509);configuration.getMachine().addFeeder(feeder);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(510);tableModel.refresh();
            __CLR4_5_2a7a7lx1h6xrk.R.inc(511);Helpers.selectLastTableRow(table);
        }
        catch (Exception e) {
            __CLR4_5_2a7a7lx1h6xrk.R.inc(512);MessageBoxes.errorBox(JOptionPane.getFrameForComponent(FeedersPanel.this),
                    "Feeder Error", e);
        }
    }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

    public Action newFeederAction = new AbstractAction() {
        {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(513);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(514);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(515);putValue(NAME, "New Feeder...");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(516);putValue(SHORT_DESCRIPTION, "Create a new feeder.");
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(517);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(518);newFeeder(null);
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
    };

    public Action deleteFeederAction = new AbstractAction() {
        {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(519);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(520);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(521);putValue(NAME, "Delete Feeder");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(522);putValue(SHORT_DESCRIPTION, "Delete the selected feeder.");
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(523);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(524);int ret = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "Are you sure you want to delete " + getSelectedFeeder().getName() + "?",
                    "Delete " + getSelectedFeeder().getName() + "?", JOptionPane.YES_NO_OPTION);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(525);if ((((ret == JOptionPane.YES_OPTION)&&(__CLR4_5_2a7a7lx1h6xrk.R.iget(526)!=0|true))||(__CLR4_5_2a7a7lx1h6xrk.R.iget(527)==0&false))) {{
                __CLR4_5_2a7a7lx1h6xrk.R.inc(528);configuration.getMachine().removeFeeder(getSelectedFeeder());
                __CLR4_5_2a7a7lx1h6xrk.R.inc(529);tableModel.refresh();
            }
        }}finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
    };

    public Action feedFeederAction = new AbstractAction() {
        {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(530);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(531);putValue(SMALL_ICON, Icons.feed);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(532);putValue(NAME, "Feed");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(533);putValue(SHORT_DESCRIPTION, "Command the selected feeder to perform a feed operation.");
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(534);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(535);new Thread() {
                public void run() {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(536);
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(537);Feeder feeder = getSelectedFeeder();
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(538);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();

                    __CLR4_5_2a7a7lx1h6xrk.R.inc(539);try {
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(540);nozzle.moveToSafeZ();
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(541);feeder.feed(nozzle);
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(542);Location pickLocation = feeder.getPickLocation();
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(543);MovableUtils.moveToLocationAtSafeZ(nozzle, pickLocation);
                    }
                    catch (Exception e) {
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(544);MessageBoxes.errorBox(FeedersPanel.this, "Feed Error", e);
                    }
                }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
            }.start();
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
    };

    public Action pickFeederAction = new AbstractAction() {
        {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(545);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(546);putValue(SMALL_ICON, Icons.load);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(547);putValue(NAME, "Pick");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(548);putValue(SHORT_DESCRIPTION, "Perform a feed and pick on the selected feeder.");
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(549);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(550);new Thread() {
                public void run() {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(551);
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(552);Feeder feeder = getSelectedFeeder();
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(553);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();

                    __CLR4_5_2a7a7lx1h6xrk.R.inc(554);try {
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(555);nozzle.moveToSafeZ();
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(556);feeder.feed(nozzle);
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(557);Location pickLocation = feeder.getPickLocation();
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(558);MovableUtils.moveToLocationAtSafeZ(nozzle, pickLocation);
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(559);nozzle.pick(feeder.getPart());
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(560);nozzle.moveToSafeZ();
                    }
                    catch (Exception e) {
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(561);MessageBoxes.errorBox(FeedersPanel.this, "Feed Error", e);
                    }
                }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
            }.start();
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
    };

    public Action moveCameraToPickLocation = new AbstractAction() {
        {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(562);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(563);putValue(SMALL_ICON, Icons.centerCamera);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(564);putValue(NAME, "Move Camera");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(565);putValue(SHORT_DESCRIPTION,
                    "Move the camera to the selected feeder's current pick location.");
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(566);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(567);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2a7a7lx1h6xrk.R.inc(568);Feeder feeder = getSelectedFeeder();
                __CLR4_5_2a7a7lx1h6xrk.R.inc(569);Camera camera = MainFrame.machineControlsPanel.getSelectedTool().getHead()
                        .getDefaultCamera();
                __CLR4_5_2a7a7lx1h6xrk.R.inc(570);Location pickLocation = feeder.getPickLocation();
                __CLR4_5_2a7a7lx1h6xrk.R.inc(571);MovableUtils.moveToLocationAtSafeZ(camera, pickLocation);
            });
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
    };

    public Action moveToolToPickLocation = new AbstractAction() {
        {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(572);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(573);putValue(SMALL_ICON, Icons.centerTool);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(574);putValue(NAME, "Move Tool");
            __CLR4_5_2a7a7lx1h6xrk.R.inc(575);putValue(SHORT_DESCRIPTION,
                    "Move the tool to the selected feeder's current pick location.");
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(576);
            __CLR4_5_2a7a7lx1h6xrk.R.inc(577);new Thread() {
                public void run() {try{__CLR4_5_2a7a7lx1h6xrk.R.inc(578);
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(579);Feeder feeder = getSelectedFeeder();
                    __CLR4_5_2a7a7lx1h6xrk.R.inc(580);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();

                    __CLR4_5_2a7a7lx1h6xrk.R.inc(581);try {
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(582);Location pickLocation = feeder.getPickLocation();
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(583);MovableUtils.moveToLocationAtSafeZ(nozzle, pickLocation);
                    }
                    catch (Exception e) {
                        __CLR4_5_2a7a7lx1h6xrk.R.inc(584);MessageBoxes.errorBox(FeedersPanel.this, "Movement Error", e);
                    }
                }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
            }.start();
        }finally{__CLR4_5_2a7a7lx1h6xrk.R.flushNeeded();}}
    };
}
