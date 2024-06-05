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
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.openpnp.ConfigurationListener;
import org.openpnp.JobProcessorDelegate;
import org.openpnp.JobProcessorListener;
import org.openpnp.gui.components.AutoSelectTextTable;
import org.openpnp.gui.importer.BoardImporter;
import org.openpnp.gui.processes.TwoPlacementBoardLocationProcess;
import org.openpnp.gui.support.ActionGroup;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.tablemodel.BoardLocationsTableModel;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.BoardPad;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.HeadMountable;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.JobProcessor.JobError;
import org.openpnp.spi.JobProcessor.JobState;
import org.openpnp.spi.JobProcessor.PickRetryAction;
import org.openpnp.spi.Machine;
import org.openpnp.spi.MachineListener;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class JobPanel extends JPanel {public static class __CLR4_5_2jfjflx1h5hof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,1288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(JobPanel.class);

    final private Configuration configuration;
    final private MainFrame frame;
    final private MachineControlsPanel machineControlsPanel;

    private static final String PREF_DIVIDER_POSITION = "JobPanel.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;

    private static final String UNTITLED_JOB_FILENAME = "Untitled.job.xml";

    private static final String PREF_RECENT_FILES = "JobPanel.recentFiles";
    private static final int PREF_RECENT_FILES_MAX = 10;

    private JobProcessor jobProcessor;

    private BoardLocationsTableModel boardLocationsTableModel;
    private JTable boardLocationsTable;
    private JSplitPane splitPane;

    private ActionGroup jobSaveActionGroup;
    private ActionGroup boardLocationSelectionActionGroup;

    private Preferences prefs = Preferences.userNodeForPackage(JobPanel.class);

    public JMenu mnOpenRecent;

    private List<File> recentJobs = new ArrayList<>();

    private final JobPlacementsPanel jobPlacementsPanel;
    private final JobPastePanel jobPastePanel;

    private JTabbedPane tabbedPane;

    public JobPanel(Configuration configuration, MainFrame frame,
            MachineControlsPanel machineControlsPanel) {try{__CLR4_5_2jfjflx1h5hof.R.inc(699);
        __CLR4_5_2jfjflx1h5hof.R.inc(700);this.configuration = configuration;
        __CLR4_5_2jfjflx1h5hof.R.inc(701);this.frame = frame;
        __CLR4_5_2jfjflx1h5hof.R.inc(702);this.machineControlsPanel = machineControlsPanel;

        __CLR4_5_2jfjflx1h5hof.R.inc(703);jobSaveActionGroup = new ActionGroup(saveJobAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(704);jobSaveActionGroup.setEnabled(false);

        __CLR4_5_2jfjflx1h5hof.R.inc(705);boardLocationSelectionActionGroup = new ActionGroup(removeBoardAction,
                captureCameraBoardLocationAction, captureToolBoardLocationAction,
                moveCameraToBoardLocationAction, moveToolToBoardLocationAction,
                twoPointLocateBoardLocationAction, fiducialCheckAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(706);boardLocationSelectionActionGroup.setEnabled(false);

        __CLR4_5_2jfjflx1h5hof.R.inc(707);boardLocationsTableModel = new BoardLocationsTableModel(configuration);

        // Suppress because adding the type specifiers breaks WindowBuilder.
        __CLR4_5_2jfjflx1h5hof.R.inc(708);@SuppressWarnings("rawtypes")
        JComboBox sidesComboBox = new JComboBox(Side.values());

        __CLR4_5_2jfjflx1h5hof.R.inc(709);boardLocationsTable = new AutoSelectTextTable(boardLocationsTableModel);
        __CLR4_5_2jfjflx1h5hof.R.inc(710);boardLocationsTable.setAutoCreateRowSorter(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(711);boardLocationsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        __CLR4_5_2jfjflx1h5hof.R.inc(712);boardLocationsTable.setDefaultEditor(Side.class, new DefaultCellEditor(sidesComboBox));

        __CLR4_5_2jfjflx1h5hof.R.inc(713);boardLocationsTable.getSelectionModel()
                .addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2jfjflx1h5hof.R.inc(714);
                        __CLR4_5_2jfjflx1h5hof.R.inc(715);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2jfjflx1h5hof.R.iget(716)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(717)==0&false))) {{
                            __CLR4_5_2jfjflx1h5hof.R.inc(718);return;
                        }
                        }__CLR4_5_2jfjflx1h5hof.R.inc(719);BoardLocation boardLocation = getSelectedBoardLocation();
                        __CLR4_5_2jfjflx1h5hof.R.inc(720);boardLocationSelectionActionGroup.setEnabled(boardLocation != null);
                        __CLR4_5_2jfjflx1h5hof.R.inc(721);jobPlacementsPanel.setBoardLocation(boardLocation);
                        __CLR4_5_2jfjflx1h5hof.R.inc(722);jobPastePanel.setBoardLocation(boardLocation);
                    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
                });

        __CLR4_5_2jfjflx1h5hof.R.inc(723);setLayout(new BorderLayout(0, 0));

        __CLR4_5_2jfjflx1h5hof.R.inc(724);splitPane = new JSplitPane();
        __CLR4_5_2jfjflx1h5hof.R.inc(725);splitPane.setBorder(null);
        __CLR4_5_2jfjflx1h5hof.R.inc(726);splitPane.setContinuousLayout(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(727);splitPane
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_2jfjflx1h5hof.R.inc(728);splitPane.addPropertyChangeListener("dividerLocation", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_2jfjflx1h5hof.R.inc(729);
                __CLR4_5_2jfjflx1h5hof.R.inc(730);prefs.putInt(PREF_DIVIDER_POSITION, splitPane.getDividerLocation());
            }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
        });

        __CLR4_5_2jfjflx1h5hof.R.inc(731);JPanel pnlBoards = new JPanel();
        __CLR4_5_2jfjflx1h5hof.R.inc(732);pnlBoards.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
                "Boards", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        __CLR4_5_2jfjflx1h5hof.R.inc(733);pnlBoards.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2jfjflx1h5hof.R.inc(734);JToolBar toolBarBoards = new JToolBar();
        __CLR4_5_2jfjflx1h5hof.R.inc(735);toolBarBoards.setFloatable(false);
        __CLR4_5_2jfjflx1h5hof.R.inc(736);pnlBoards.add(toolBarBoards, BorderLayout.NORTH);

        __CLR4_5_2jfjflx1h5hof.R.inc(737);JButton btnStartPauseResumeJob = new JButton(startPauseResumeJobAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(738);btnStartPauseResumeJob.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(739);toolBarBoards.add(btnStartPauseResumeJob);
        __CLR4_5_2jfjflx1h5hof.R.inc(740);JButton btnStepJob = new JButton(stepJobAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(741);btnStepJob.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(742);toolBarBoards.add(btnStepJob);
        __CLR4_5_2jfjflx1h5hof.R.inc(743);JButton btnStopJob = new JButton(stopJobAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(744);btnStopJob.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(745);toolBarBoards.add(btnStopJob);
        __CLR4_5_2jfjflx1h5hof.R.inc(746);toolBarBoards.addSeparator();
        __CLR4_5_2jfjflx1h5hof.R.inc(747);JButton btnNewBoard = new JButton(newBoardAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(748);btnNewBoard.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(749);toolBarBoards.add(btnNewBoard);
        __CLR4_5_2jfjflx1h5hof.R.inc(750);JButton btnAddBoard = new JButton(addBoardAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(751);btnAddBoard.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(752);toolBarBoards.add(btnAddBoard);
        __CLR4_5_2jfjflx1h5hof.R.inc(753);JButton btnRemoveBoard = new JButton(removeBoardAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(754);btnRemoveBoard.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(755);toolBarBoards.add(btnRemoveBoard);
        __CLR4_5_2jfjflx1h5hof.R.inc(756);toolBarBoards.addSeparator();
        __CLR4_5_2jfjflx1h5hof.R.inc(757);JButton btnCaptureCameraBoardLocation = new JButton(captureCameraBoardLocationAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(758);btnCaptureCameraBoardLocation.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(759);toolBarBoards.add(btnCaptureCameraBoardLocation);

        __CLR4_5_2jfjflx1h5hof.R.inc(760);JButton btnCaptureToolBoardLocation = new JButton(captureToolBoardLocationAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(761);btnCaptureToolBoardLocation.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(762);toolBarBoards.add(btnCaptureToolBoardLocation);

        __CLR4_5_2jfjflx1h5hof.R.inc(763);JButton btnPositionCameraBoardLocation = new JButton(moveCameraToBoardLocationAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(764);btnPositionCameraBoardLocation.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(765);toolBarBoards.add(btnPositionCameraBoardLocation);

        __CLR4_5_2jfjflx1h5hof.R.inc(766);JButton btnPositionToolBoardLocation = new JButton(moveToolToBoardLocationAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(767);btnPositionToolBoardLocation.setHideActionText(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(768);toolBarBoards.add(btnPositionToolBoardLocation);
        __CLR4_5_2jfjflx1h5hof.R.inc(769);toolBarBoards.addSeparator();

        __CLR4_5_2jfjflx1h5hof.R.inc(770);JButton btnTwoPointBoardLocation = new JButton(twoPointLocateBoardLocationAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(771);toolBarBoards.add(btnTwoPointBoardLocation);
        __CLR4_5_2jfjflx1h5hof.R.inc(772);btnTwoPointBoardLocation.setHideActionText(true);

        __CLR4_5_2jfjflx1h5hof.R.inc(773);JButton btnFiducialCheck = new JButton(fiducialCheckAction);
        __CLR4_5_2jfjflx1h5hof.R.inc(774);toolBarBoards.add(btnFiducialCheck);
        __CLR4_5_2jfjflx1h5hof.R.inc(775);btnFiducialCheck.setHideActionText(true);

        __CLR4_5_2jfjflx1h5hof.R.inc(776);pnlBoards.add(new JScrollPane(boardLocationsTable));
        __CLR4_5_2jfjflx1h5hof.R.inc(777);JPanel pnlRight = new JPanel();
        __CLR4_5_2jfjflx1h5hof.R.inc(778);pnlRight.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2jfjflx1h5hof.R.inc(779);splitPane.setLeftComponent(pnlBoards);
        __CLR4_5_2jfjflx1h5hof.R.inc(780);splitPane.setRightComponent(pnlRight);

        __CLR4_5_2jfjflx1h5hof.R.inc(781);tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_2jfjflx1h5hof.R.inc(782);pnlRight.add(tabbedPane, BorderLayout.CENTER);

        __CLR4_5_2jfjflx1h5hof.R.inc(783);tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {try{__CLR4_5_2jfjflx1h5hof.R.inc(784);
                __CLR4_5_2jfjflx1h5hof.R.inc(785);Machine machine = Configuration.get().getMachine();
                __CLR4_5_2jfjflx1h5hof.R.inc(786);JobProcessor.Type type = getSelectedJobProcessorType();
                __CLR4_5_2jfjflx1h5hof.R.inc(787);setJobProcessor(machine.getJobProcessors().get(type));
            }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
        });

        __CLR4_5_2jfjflx1h5hof.R.inc(788);jobPastePanel = new JobPastePanel(this);
        __CLR4_5_2jfjflx1h5hof.R.inc(789);jobPlacementsPanel = new JobPlacementsPanel(this);

        __CLR4_5_2jfjflx1h5hof.R.inc(790);add(splitPane);

        __CLR4_5_2jfjflx1h5hof.R.inc(791);mnOpenRecent = new JMenu("Open Recent Job...");
        __CLR4_5_2jfjflx1h5hof.R.inc(792);loadRecentJobs();

        __CLR4_5_2jfjflx1h5hof.R.inc(793);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_2jfjflx1h5hof.R.inc(794);
                __CLR4_5_2jfjflx1h5hof.R.inc(795);Machine machine = configuration.getMachine();

                __CLR4_5_2jfjflx1h5hof.R.inc(796);machine.addListener(machineListener);

                __CLR4_5_2jfjflx1h5hof.R.inc(797);for (JobProcessor jobProcessor : machine.getJobProcessors().values()) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(798);jobProcessor.addListener(jobProcessorListener);
                    __CLR4_5_2jfjflx1h5hof.R.inc(799);jobProcessor.setDelegate(jobProcessorDelegate);
                }

                }__CLR4_5_2jfjflx1h5hof.R.inc(800);if ((((machine.getJobProcessors().get(JobProcessor.Type.PickAndPlace) != null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(801)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(802)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(803);tabbedPane.addTab("Pick and Place", null, jobPlacementsPanel, null);
                    // Creating the tab should fire off the selection event, setting
                    // the JobProcessor but this fails on some Linux based systems,
                    // so here we detect if it failed and force setting it.
                    __CLR4_5_2jfjflx1h5hof.R.inc(804);if ((((jobProcessor == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(805)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(806)==0&false))) {{
                        __CLR4_5_2jfjflx1h5hof.R.inc(807);setJobProcessor(
                                machine.getJobProcessors().get(JobProcessor.Type.PickAndPlace));
                    }
                }}
                }__CLR4_5_2jfjflx1h5hof.R.inc(808);if ((((machine.getJobProcessors().get(JobProcessor.Type.SolderPaste) != null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(809)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(810)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(811);tabbedPane.addTab("Solder Paste", null, jobPastePanel, null);
                    // Creating the tab should fire off the selection event, setting
                    // the JobProcessor but this fails on some Linux based systems,
                    // so here we detect if it failed and force setting it.
                    __CLR4_5_2jfjflx1h5hof.R.inc(812);if ((((jobProcessor == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(813)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(814)==0&false))) {{
                        __CLR4_5_2jfjflx1h5hof.R.inc(815);setJobProcessor(
                                machine.getJobProcessors().get(JobProcessor.Type.SolderPaste));
                    }
                }}

                // Create an empty Job if one is not loaded
                }__CLR4_5_2jfjflx1h5hof.R.inc(816);if ((((jobProcessor.getJob() == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(817)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(818)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(819);Job job = new Job();
                    __CLR4_5_2jfjflx1h5hof.R.inc(820);jobProcessor.load(job);
                }
            }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public JobProcessor.Type getSelectedJobProcessorType() {try{__CLR4_5_2jfjflx1h5hof.R.inc(821);
        __CLR4_5_2jfjflx1h5hof.R.inc(822);String activeTabTitle = tabbedPane.getTitleAt(tabbedPane.getSelectedIndex());
        __CLR4_5_2jfjflx1h5hof.R.inc(823);if ((((activeTabTitle.equals("Solder Paste"))&&(__CLR4_5_2jfjflx1h5hof.R.iget(824)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(825)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(826);return JobProcessor.Type.SolderPaste;
        }
        }else {__CLR4_5_2jfjflx1h5hof.R.inc(827);if ((((activeTabTitle.equals("Pick and Place"))&&(__CLR4_5_2jfjflx1h5hof.R.iget(828)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(829)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(830);return JobProcessor.Type.PickAndPlace;
        }
        }else {{
            __CLR4_5_2jfjflx1h5hof.R.inc(831);throw new Error("Unknown job tab title: " + activeTabTitle);
        }
    }}}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    /**
     * Unregister the listener and delegate for the JobProcessor, set the new JobProcessor and add
     * the listener and delegate back. If a job was previously loaded into the JobProcessor, load it
     * into the new one.
     * 
     * The sequencing of making this work is a bit complex. When the app is starting the following
     * happens: 1. The UI is created and shown. At this time no JobProcessor is set. 2. The
     * Configuration is loaded and the completion listener is called. 3. The Configuration listener
     * checks which JobProcessors are registered and adds tabs for each. 4. The first tab that is
     * added causes a selection event to happen, which fires a ChangeEvent on the ChangeListener
     * above. 5. The ChangeListener checks which tab was selected and calls this method with the
     * appropriate JobProcessor.
     * 
     * @param jobProcessor
     */
    private void setJobProcessor(JobProcessor jobProcessor) {try{__CLR4_5_2jfjflx1h5hof.R.inc(832);
        __CLR4_5_2jfjflx1h5hof.R.inc(833);Job job = null;
        __CLR4_5_2jfjflx1h5hof.R.inc(834);if ((((this.jobProcessor != null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(835)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(836)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(837);job = this.jobProcessor.getJob();
            __CLR4_5_2jfjflx1h5hof.R.inc(838);if ((((this.jobProcessor.getState() != null
                    && this.jobProcessor.getState() != JobProcessor.JobState.Stopped)&&(__CLR4_5_2jfjflx1h5hof.R.iget(839)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(840)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(841);throw new AssertionError("this.jobProcessor.getState() "
                        + this.jobProcessor.getState() + " != JobProcessor.JobState.Stopped");
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(842);this.jobProcessor.removeListener(jobProcessorListener);
            __CLR4_5_2jfjflx1h5hof.R.inc(843);this.jobProcessor.setDelegate(null);
        }
        }__CLR4_5_2jfjflx1h5hof.R.inc(844);this.jobProcessor = jobProcessor;
        __CLR4_5_2jfjflx1h5hof.R.inc(845);jobProcessor.addListener(jobProcessorListener);
        __CLR4_5_2jfjflx1h5hof.R.inc(846);jobProcessor.setDelegate(jobProcessorDelegate);
        __CLR4_5_2jfjflx1h5hof.R.inc(847);if ((((job != null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(848)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(849)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(850);jobProcessor.load(job);
        }
    }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public JobProcessor getJobProcessor() {try{__CLR4_5_2jfjflx1h5hof.R.inc(851);
        __CLR4_5_2jfjflx1h5hof.R.inc(852);return jobProcessor;
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public JobPlacementsPanel getJobPlacementsPanel() {try{__CLR4_5_2jfjflx1h5hof.R.inc(853);
        __CLR4_5_2jfjflx1h5hof.R.inc(854);return jobPlacementsPanel;
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private void updateRecentJobsMenu() {try{__CLR4_5_2jfjflx1h5hof.R.inc(855);
        __CLR4_5_2jfjflx1h5hof.R.inc(856);mnOpenRecent.removeAll();
        __CLR4_5_2jfjflx1h5hof.R.inc(857);for (File file : recentJobs) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(858);mnOpenRecent.add(new OpenRecentJobAction(file));
        }
    }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private void loadRecentJobs() {try{__CLR4_5_2jfjflx1h5hof.R.inc(859);
        __CLR4_5_2jfjflx1h5hof.R.inc(860);recentJobs.clear();
        __CLR4_5_2jfjflx1h5hof.R.inc(861);for (int i = 0; (((i < PREF_RECENT_FILES_MAX)&&(__CLR4_5_2jfjflx1h5hof.R.iget(862)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(863)==0&false)); i++) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(864);String path = prefs.get(PREF_RECENT_FILES + "_" + i, null);
            __CLR4_5_2jfjflx1h5hof.R.inc(865);if ((((path != null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(866)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(867)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(868);File file = new File(path);
                __CLR4_5_2jfjflx1h5hof.R.inc(869);recentJobs.add(file);
            }
        }}
        }__CLR4_5_2jfjflx1h5hof.R.inc(870);updateRecentJobsMenu();
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private void saveRecentJobs() {try{__CLR4_5_2jfjflx1h5hof.R.inc(871);
        // blow away all the existing values
        __CLR4_5_2jfjflx1h5hof.R.inc(872);for (int i = 0; (((i < PREF_RECENT_FILES_MAX)&&(__CLR4_5_2jfjflx1h5hof.R.iget(873)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(874)==0&false)); i++) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(875);prefs.remove(PREF_RECENT_FILES + "_" + i);
        }
        // update with what we have now
        }__CLR4_5_2jfjflx1h5hof.R.inc(876);for (int i = 0; (((i < recentJobs.size())&&(__CLR4_5_2jfjflx1h5hof.R.iget(877)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(878)==0&false)); i++) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(879);prefs.put(PREF_RECENT_FILES + "_" + i, recentJobs.get(i).getAbsolutePath());
        }
        }__CLR4_5_2jfjflx1h5hof.R.inc(880);updateRecentJobsMenu();
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private void addRecentJob(File file) {try{__CLR4_5_2jfjflx1h5hof.R.inc(881);
        __CLR4_5_2jfjflx1h5hof.R.inc(882);while ((((recentJobs.contains(file))&&(__CLR4_5_2jfjflx1h5hof.R.iget(883)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(884)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(885);recentJobs.remove(file);
        }
        // add to top
        }__CLR4_5_2jfjflx1h5hof.R.inc(886);recentJobs.add(0, file);
        // limit length
        __CLR4_5_2jfjflx1h5hof.R.inc(887);while ((((recentJobs.size() > PREF_RECENT_FILES_MAX)&&(__CLR4_5_2jfjflx1h5hof.R.iget(888)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(889)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(890);recentJobs.remove(recentJobs.size() - 1);
        }
        }__CLR4_5_2jfjflx1h5hof.R.inc(891);saveRecentJobs();
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public void refreshSelectedBoardRow() {try{__CLR4_5_2jfjflx1h5hof.R.inc(892);
        __CLR4_5_2jfjflx1h5hof.R.inc(893);boardLocationsTableModel.fireTableRowsUpdated(boardLocationsTable.getSelectedRow(),
                boardLocationsTable.getSelectedRow());
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public BoardLocation getSelectedBoardLocation() {try{__CLR4_5_2jfjflx1h5hof.R.inc(894);
        __CLR4_5_2jfjflx1h5hof.R.inc(895);int index = boardLocationsTable.getSelectedRow();
        __CLR4_5_2jfjflx1h5hof.R.inc(896);if ((((index == -1)&&(__CLR4_5_2jfjflx1h5hof.R.iget(897)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(898)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(899);return null;
        }
        }else {{
            __CLR4_5_2jfjflx1h5hof.R.inc(900);index = boardLocationsTable.convertRowIndexToModel(index);
            __CLR4_5_2jfjflx1h5hof.R.inc(901);return JobPanel.this.jobProcessor.getJob().getBoardLocations().get(index);
        }
    }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    /**
     * Checks if there are any modifications that need to be saved. Prompts the user if there are.
     * Returns true if it's okay to exit.
     * 
     * @return
     */
    public boolean checkForModifications() {try{__CLR4_5_2jfjflx1h5hof.R.inc(902);
        __CLR4_5_2jfjflx1h5hof.R.inc(903);if ((((!checkForBoardModifications())&&(__CLR4_5_2jfjflx1h5hof.R.iget(904)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(905)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(906);return false;
        }
        }__CLR4_5_2jfjflx1h5hof.R.inc(907);if ((((!checkForJobModifications())&&(__CLR4_5_2jfjflx1h5hof.R.iget(908)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(909)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(910);return false;
        }
        }__CLR4_5_2jfjflx1h5hof.R.inc(911);return true;
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private boolean checkForJobModifications() {try{__CLR4_5_2jfjflx1h5hof.R.inc(912);
        __CLR4_5_2jfjflx1h5hof.R.inc(913);if ((((jobProcessor.getJob().isDirty())&&(__CLR4_5_2jfjflx1h5hof.R.iget(914)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(915)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(916);Job job = jobProcessor.getJob();
            __CLR4_5_2jfjflx1h5hof.R.inc(917);String name = ((((job.getFile() == null )&&(__CLR4_5_2jfjflx1h5hof.R.iget(918)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(919)==0&false))? UNTITLED_JOB_FILENAME : job.getFile().getName());
            __CLR4_5_2jfjflx1h5hof.R.inc(920);int result = JOptionPane.showConfirmDialog(frame,
                    "Do you want to save your changes to " + name + "?" + "\n"
                            + "If you don't save, your changes will be lost.",
                    "Save " + name + "?", JOptionPane.YES_NO_CANCEL_OPTION);
            __CLR4_5_2jfjflx1h5hof.R.inc(921);if ((((result == JOptionPane.YES_OPTION)&&(__CLR4_5_2jfjflx1h5hof.R.iget(922)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(923)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(924);return saveJob();
            }
            }else {__CLR4_5_2jfjflx1h5hof.R.inc(925);if ((((result == JOptionPane.CANCEL_OPTION)&&(__CLR4_5_2jfjflx1h5hof.R.iget(926)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(927)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(928);return false;
            }
        }}}
        }__CLR4_5_2jfjflx1h5hof.R.inc(929);return true;
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private boolean checkForBoardModifications() {try{__CLR4_5_2jfjflx1h5hof.R.inc(930);
        __CLR4_5_2jfjflx1h5hof.R.inc(931);for (Board board : configuration.getBoards()) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(932);if ((((board.isDirty())&&(__CLR4_5_2jfjflx1h5hof.R.iget(933)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(934)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(935);int result = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                        "Do you want to save your changes to " + board.getFile().getName() + "?"
                                + "\n" + "If you don't save, your changes will be lost.",
                        "Save " + board.getFile().getName() + "?",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                __CLR4_5_2jfjflx1h5hof.R.inc(936);if ((((result == JOptionPane.YES_OPTION)&&(__CLR4_5_2jfjflx1h5hof.R.iget(937)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(938)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(939);try {
                        __CLR4_5_2jfjflx1h5hof.R.inc(940);configuration.saveBoard(board);
                    }
                    catch (Exception e) {
                        __CLR4_5_2jfjflx1h5hof.R.inc(941);MessageBoxes.errorBox(getTopLevelAncestor(), "Board Save Error",
                                e.getMessage());
                        __CLR4_5_2jfjflx1h5hof.R.inc(942);return false;
                    }
                }
                }else {__CLR4_5_2jfjflx1h5hof.R.inc(943);if ((((result == JOptionPane.CANCEL_OPTION)&&(__CLR4_5_2jfjflx1h5hof.R.iget(944)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(945)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(946);return false;
                }
            }}}
        }}
        }__CLR4_5_2jfjflx1h5hof.R.inc(947);return true;
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private boolean saveJob() {try{__CLR4_5_2jfjflx1h5hof.R.inc(948);
        __CLR4_5_2jfjflx1h5hof.R.inc(949);if ((((jobProcessor.getJob().getFile() == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(950)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(951)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(952);return saveJobAs();
        }
        }else {{
            __CLR4_5_2jfjflx1h5hof.R.inc(953);try {
                __CLR4_5_2jfjflx1h5hof.R.inc(954);File file = jobProcessor.getJob().getFile();
                __CLR4_5_2jfjflx1h5hof.R.inc(955);configuration.saveJob(jobProcessor.getJob(), file);
                __CLR4_5_2jfjflx1h5hof.R.inc(956);addRecentJob(file);
                __CLR4_5_2jfjflx1h5hof.R.inc(957);return true;
            }
            catch (Exception e) {
                __CLR4_5_2jfjflx1h5hof.R.inc(958);MessageBoxes.errorBox(frame, "Job Save Error", e.getMessage());
                __CLR4_5_2jfjflx1h5hof.R.inc(959);return false;
            }
        }
    }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private boolean saveJobAs() {try{__CLR4_5_2jfjflx1h5hof.R.inc(960);
        __CLR4_5_2jfjflx1h5hof.R.inc(961);FileDialog fileDialog = new FileDialog(frame, "Save Job As...", FileDialog.SAVE);
        __CLR4_5_2jfjflx1h5hof.R.inc(962);fileDialog.setFilenameFilter(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {try{__CLR4_5_2jfjflx1h5hof.R.inc(963);
                __CLR4_5_2jfjflx1h5hof.R.inc(964);return name.toLowerCase().endsWith(".job.xml");
            }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
        });
        __CLR4_5_2jfjflx1h5hof.R.inc(965);fileDialog.setVisible(true);
        __CLR4_5_2jfjflx1h5hof.R.inc(966);try {
            __CLR4_5_2jfjflx1h5hof.R.inc(967);String filename = fileDialog.getFile();
            __CLR4_5_2jfjflx1h5hof.R.inc(968);if ((((filename == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(969)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(970)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(971);return false;
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(972);if ((((!filename.toLowerCase().endsWith(".job.xml"))&&(__CLR4_5_2jfjflx1h5hof.R.iget(973)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(974)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(975);filename = filename + ".job.xml";
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(976);File file = new File(new File(fileDialog.getDirectory()), filename);
            __CLR4_5_2jfjflx1h5hof.R.inc(977);if ((((file.exists())&&(__CLR4_5_2jfjflx1h5hof.R.iget(978)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(979)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(980);int ret = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                        file.getName() + " already exists. Do you want to replace it?",
                        "Replace file?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                __CLR4_5_2jfjflx1h5hof.R.inc(981);if ((((ret != JOptionPane.YES_OPTION)&&(__CLR4_5_2jfjflx1h5hof.R.iget(982)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(983)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(984);return false;
                }
            }}
            }__CLR4_5_2jfjflx1h5hof.R.inc(985);configuration.saveJob(jobProcessor.getJob(), file);
            __CLR4_5_2jfjflx1h5hof.R.inc(986);addRecentJob(file);
            __CLR4_5_2jfjflx1h5hof.R.inc(987);return true;
        }
        catch (Exception e) {
            __CLR4_5_2jfjflx1h5hof.R.inc(988);MessageBoxes.errorBox(frame, "Job Save Error", e.getMessage());
            __CLR4_5_2jfjflx1h5hof.R.inc(989);return false;
        }
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    /**
     * Updates the Job controls based on the Job state and the Machine's readiness.
     */
    private void updateJobActions() {try{__CLR4_5_2jfjflx1h5hof.R.inc(990);
        __CLR4_5_2jfjflx1h5hof.R.inc(991);JobState state = jobProcessor.getState();
        __CLR4_5_2jfjflx1h5hof.R.inc(992);if ((((state == JobState.Stopped)&&(__CLR4_5_2jfjflx1h5hof.R.iget(993)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(994)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(995);startPauseResumeJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(996);startPauseResumeJobAction.putValue(AbstractAction.NAME, "Start");
            __CLR4_5_2jfjflx1h5hof.R.inc(997);startPauseResumeJobAction.putValue(AbstractAction.SMALL_ICON, Icons.start);
            __CLR4_5_2jfjflx1h5hof.R.inc(998);startPauseResumeJobAction.putValue(AbstractAction.SHORT_DESCRIPTION,
                    "Start processing the job.");
            __CLR4_5_2jfjflx1h5hof.R.inc(999);stopJobAction.setEnabled(false);
            __CLR4_5_2jfjflx1h5hof.R.inc(1000);stepJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1001);tabbedPane.setEnabled(true);
        }
        }else {__CLR4_5_2jfjflx1h5hof.R.inc(1002);if ((((state == JobState.Running)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1003)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1004)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(1005);startPauseResumeJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1006);startPauseResumeJobAction.putValue(AbstractAction.NAME, "Pause");
            __CLR4_5_2jfjflx1h5hof.R.inc(1007);startPauseResumeJobAction.putValue(AbstractAction.SMALL_ICON, Icons.pause);
            __CLR4_5_2jfjflx1h5hof.R.inc(1008);startPauseResumeJobAction.putValue(AbstractAction.SHORT_DESCRIPTION,
                    "Pause processing of the job.");
            __CLR4_5_2jfjflx1h5hof.R.inc(1009);stopJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1010);stepJobAction.setEnabled(false);
            __CLR4_5_2jfjflx1h5hof.R.inc(1011);tabbedPane.setEnabled(false);
        }
        }else {__CLR4_5_2jfjflx1h5hof.R.inc(1012);if ((((state == JobState.Paused)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1013)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1014)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(1015);startPauseResumeJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1016);startPauseResumeJobAction.putValue(AbstractAction.NAME, "Resume");
            __CLR4_5_2jfjflx1h5hof.R.inc(1017);startPauseResumeJobAction.putValue(AbstractAction.SMALL_ICON, Icons.start);
            __CLR4_5_2jfjflx1h5hof.R.inc(1018);startPauseResumeJobAction.putValue(AbstractAction.SHORT_DESCRIPTION,
                    "Resume processing of the job.");
            __CLR4_5_2jfjflx1h5hof.R.inc(1019);stopJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1020);stepJobAction.setEnabled(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1021);tabbedPane.setEnabled(false);
        }

        // We allow the above to run first so that all state is represented
        // correctly even if the machine is disabled.
        }}}__CLR4_5_2jfjflx1h5hof.R.inc(1022);if ((((!configuration.getMachine().isEnabled())&&(__CLR4_5_2jfjflx1h5hof.R.iget(1023)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1024)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(1025);startPauseResumeJobAction.setEnabled(false);
            __CLR4_5_2jfjflx1h5hof.R.inc(1026);stopJobAction.setEnabled(false);
            __CLR4_5_2jfjflx1h5hof.R.inc(1027);stepJobAction.setEnabled(false);
        }
    }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    private void updateTitle() {try{__CLR4_5_2jfjflx1h5hof.R.inc(1028);
        __CLR4_5_2jfjflx1h5hof.R.inc(1029);Job job = jobProcessor.getJob();
        __CLR4_5_2jfjflx1h5hof.R.inc(1030);String title = String.format("OpenPnP - %s%s", (((job.isDirty() )&&(__CLR4_5_2jfjflx1h5hof.R.iget(1031)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1032)==0&false))? "*" : "",
                ((((job.getFile() == null )&&(__CLR4_5_2jfjflx1h5hof.R.iget(1033)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1034)==0&false))? UNTITLED_JOB_FILENAME : job.getFile().getName()));
        __CLR4_5_2jfjflx1h5hof.R.inc(1035);frame.setTitle(title);
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public void importBoard(Class<? extends BoardImporter> boardImporterClass) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1036);
        __CLR4_5_2jfjflx1h5hof.R.inc(1037);if ((((getSelectedBoardLocation() == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1038)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1039)==0&false))) {{
            __CLR4_5_2jfjflx1h5hof.R.inc(1040);MessageBoxes.errorBox(getTopLevelAncestor(), "Import Failed",
                    "Please select a board in the Jobs tab to import into.");
            __CLR4_5_2jfjflx1h5hof.R.inc(1041);return;
        }

        }__CLR4_5_2jfjflx1h5hof.R.inc(1042);BoardImporter boardImporter;
        __CLR4_5_2jfjflx1h5hof.R.inc(1043);try {
            __CLR4_5_2jfjflx1h5hof.R.inc(1044);boardImporter = boardImporterClass.newInstance();
        }
        catch (Exception e) {
            __CLR4_5_2jfjflx1h5hof.R.inc(1045);MessageBoxes.errorBox(getTopLevelAncestor(), "Import Failed", e);
            __CLR4_5_2jfjflx1h5hof.R.inc(1046);return;
        }

        __CLR4_5_2jfjflx1h5hof.R.inc(1047);try {
            __CLR4_5_2jfjflx1h5hof.R.inc(1048);Board importedBoard = boardImporter.importBoard((Frame) getTopLevelAncestor());
            __CLR4_5_2jfjflx1h5hof.R.inc(1049);if ((((importedBoard != null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1050)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1051)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1052);Board existingBoard = getSelectedBoardLocation().getBoard();
                __CLR4_5_2jfjflx1h5hof.R.inc(1053);for (Placement placement : importedBoard.getPlacements()) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(1054);existingBoard.addPlacement(placement);
                }
                }__CLR4_5_2jfjflx1h5hof.R.inc(1055);for (BoardPad pad : importedBoard.getSolderPastePads()) {{
                    // TODO: This is a temporary hack until we redesign the importer
                    // interface to be more intuitive. The Gerber importer tends
                    // to return everything in Inches, so this is a method to
                    // try to get it closer to what the user expects to see.
                    __CLR4_5_2jfjflx1h5hof.R.inc(1056);pad.setLocation(pad.getLocation()
                            .convertToUnits(getSelectedBoardLocation().getLocation().getUnits()));
                    __CLR4_5_2jfjflx1h5hof.R.inc(1057);existingBoard.addSolderPastePad(pad);
                }
                }__CLR4_5_2jfjflx1h5hof.R.inc(1058);jobPlacementsPanel.setBoardLocation(getSelectedBoardLocation());
                __CLR4_5_2jfjflx1h5hof.R.inc(1059);jobPastePanel.setBoardLocation(getSelectedBoardLocation());
            }
        }}
        catch (Exception e) {
            __CLR4_5_2jfjflx1h5hof.R.inc(1060);MessageBoxes.errorBox(getTopLevelAncestor(), "Import Failed", e);
        }
    }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

    public final Action openJobAction = new AbstractAction("Open Job...") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1061);
            __CLR4_5_2jfjflx1h5hof.R.inc(1062);if ((((!checkForModifications())&&(__CLR4_5_2jfjflx1h5hof.R.iget(1063)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1064)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1065);return;
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(1066);FileDialog fileDialog = new FileDialog(frame);
            __CLR4_5_2jfjflx1h5hof.R.inc(1067);fileDialog.setFilenameFilter(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1068);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1069);return name.toLowerCase().endsWith(".job.xml");
                }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
            });
            __CLR4_5_2jfjflx1h5hof.R.inc(1070);fileDialog.setVisible(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1071);try {
                __CLR4_5_2jfjflx1h5hof.R.inc(1072);if ((((fileDialog.getFile() == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1073)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1074)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(1075);return;
                }
                }__CLR4_5_2jfjflx1h5hof.R.inc(1076);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());
                __CLR4_5_2jfjflx1h5hof.R.inc(1077);Job job = configuration.loadJob(file);
                __CLR4_5_2jfjflx1h5hof.R.inc(1078);jobProcessor.load(job);
                __CLR4_5_2jfjflx1h5hof.R.inc(1079);addRecentJob(file);
            }
            catch (Exception e) {
                __CLR4_5_2jfjflx1h5hof.R.inc(1080);e.printStackTrace();
                __CLR4_5_2jfjflx1h5hof.R.inc(1081);MessageBoxes.errorBox(frame, "Job Load Error", e.getMessage());
            }
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action newJobAction = new AbstractAction("New Job") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1082);
            __CLR4_5_2jfjflx1h5hof.R.inc(1083);if ((((!checkForModifications())&&(__CLR4_5_2jfjflx1h5hof.R.iget(1084)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1085)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1086);return;
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(1087);jobProcessor.load(new Job());
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action saveJobAction = new AbstractAction("Save Job") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1088);
            __CLR4_5_2jfjflx1h5hof.R.inc(1089);saveJob();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action saveJobAsAction = new AbstractAction("Save Job As...") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1090);
            __CLR4_5_2jfjflx1h5hof.R.inc(1091);saveJobAs();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action startPauseResumeJobAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1092);
            __CLR4_5_2jfjflx1h5hof.R.inc(1093);putValue(SMALL_ICON, Icons.start);
            __CLR4_5_2jfjflx1h5hof.R.inc(1094);putValue(NAME, "Start");
            __CLR4_5_2jfjflx1h5hof.R.inc(1095);putValue(SHORT_DESCRIPTION, "Start processing the job.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1096);
            __CLR4_5_2jfjflx1h5hof.R.inc(1097);JobState state = jobProcessor.getState();
            __CLR4_5_2jfjflx1h5hof.R.inc(1098);if ((((state == JobState.Stopped)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1099)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1100)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1101);try {
                    __CLR4_5_2jfjflx1h5hof.R.inc(1102);jobProcessor.start();
                }
                catch (Exception e) {
                    __CLR4_5_2jfjflx1h5hof.R.inc(1103);MessageBoxes.errorBox(frame, "Job Start Error", e.getMessage());
                }
            }
            }else {__CLR4_5_2jfjflx1h5hof.R.inc(1104);if ((((state == JobState.Paused)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1105)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1106)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1107);jobProcessor.resume();
            }
            }else {__CLR4_5_2jfjflx1h5hof.R.inc(1108);if ((((state == JobState.Running)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1109)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1110)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1111);jobProcessor.pause();
            }
        }}}}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action stepJobAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1112);
            __CLR4_5_2jfjflx1h5hof.R.inc(1113);putValue(SMALL_ICON, Icons.step);
            __CLR4_5_2jfjflx1h5hof.R.inc(1114);putValue(NAME, "Step");
            __CLR4_5_2jfjflx1h5hof.R.inc(1115);putValue(SHORT_DESCRIPTION, "Process one step of the job and pause.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1116);
            __CLR4_5_2jfjflx1h5hof.R.inc(1117);try {
                __CLR4_5_2jfjflx1h5hof.R.inc(1118);jobProcessor.step();
            }
            catch (Exception e) {
                __CLR4_5_2jfjflx1h5hof.R.inc(1119);MessageBoxes.errorBox(frame, "Job Step Failed", e.getMessage());
            }
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action stopJobAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1120);
            __CLR4_5_2jfjflx1h5hof.R.inc(1121);putValue(SMALL_ICON, Icons.stop);
            __CLR4_5_2jfjflx1h5hof.R.inc(1122);putValue(NAME, "Stop");
            __CLR4_5_2jfjflx1h5hof.R.inc(1123);putValue(SHORT_DESCRIPTION, "Stop processing the job.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1124);
            __CLR4_5_2jfjflx1h5hof.R.inc(1125);jobProcessor.stop();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action newBoardAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1126);
            __CLR4_5_2jfjflx1h5hof.R.inc(1127);putValue(SMALL_ICON, Icons.neww);
            __CLR4_5_2jfjflx1h5hof.R.inc(1128);putValue(NAME, "New Board...");
            __CLR4_5_2jfjflx1h5hof.R.inc(1129);putValue(SHORT_DESCRIPTION, "Create a new board and add it to the job.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1130);
            __CLR4_5_2jfjflx1h5hof.R.inc(1131);FileDialog fileDialog = new FileDialog(frame, "Save New Board As...", FileDialog.SAVE);
            __CLR4_5_2jfjflx1h5hof.R.inc(1132);fileDialog.setFilenameFilter(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1133);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1134);return name.toLowerCase().endsWith(".board.xml");
                }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
            });
            __CLR4_5_2jfjflx1h5hof.R.inc(1135);fileDialog.setVisible(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1136);try {
                __CLR4_5_2jfjflx1h5hof.R.inc(1137);String filename = fileDialog.getFile();
                __CLR4_5_2jfjflx1h5hof.R.inc(1138);if ((((filename == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1139)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1140)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(1141);return;
                }
                }__CLR4_5_2jfjflx1h5hof.R.inc(1142);if ((((!filename.toLowerCase().endsWith(".board.xml"))&&(__CLR4_5_2jfjflx1h5hof.R.iget(1143)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1144)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(1145);filename = filename + ".board.xml";
                }
                }__CLR4_5_2jfjflx1h5hof.R.inc(1146);File file = new File(new File(fileDialog.getDirectory()), filename);

                __CLR4_5_2jfjflx1h5hof.R.inc(1147);Board board = configuration.getBoard(file);
                __CLR4_5_2jfjflx1h5hof.R.inc(1148);BoardLocation boardLocation = new BoardLocation(board);
                __CLR4_5_2jfjflx1h5hof.R.inc(1149);jobProcessor.getJob().addBoardLocation(boardLocation);
                __CLR4_5_2jfjflx1h5hof.R.inc(1150);boardLocationsTableModel.fireTableDataChanged();

                __CLR4_5_2jfjflx1h5hof.R.inc(1151);Helpers.selectLastTableRow(boardLocationsTable);
            }
            catch (Exception e) {
                __CLR4_5_2jfjflx1h5hof.R.inc(1152);e.printStackTrace();
                __CLR4_5_2jfjflx1h5hof.R.inc(1153);MessageBoxes.errorBox(frame, "Unable to create new board", e.getMessage());
            }
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action addBoardAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1154);
            __CLR4_5_2jfjflx1h5hof.R.inc(1155);putValue(SMALL_ICON, Icons.add);
            __CLR4_5_2jfjflx1h5hof.R.inc(1156);putValue(NAME, "Add Board...");
            __CLR4_5_2jfjflx1h5hof.R.inc(1157);putValue(SHORT_DESCRIPTION, "Add an existing board to the job.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1158);
            __CLR4_5_2jfjflx1h5hof.R.inc(1159);FileDialog fileDialog = new FileDialog(frame);
            __CLR4_5_2jfjflx1h5hof.R.inc(1160);fileDialog.setFilenameFilter(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1161);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1162);return name.toLowerCase().endsWith(".board.xml");
                }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
            });
            __CLR4_5_2jfjflx1h5hof.R.inc(1163);fileDialog.setVisible(true);
            __CLR4_5_2jfjflx1h5hof.R.inc(1164);try {
                __CLR4_5_2jfjflx1h5hof.R.inc(1165);if ((((fileDialog.getFile() == null)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1166)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1167)==0&false))) {{
                    __CLR4_5_2jfjflx1h5hof.R.inc(1168);return;
                }
                }__CLR4_5_2jfjflx1h5hof.R.inc(1169);File file = new File(new File(fileDialog.getDirectory()), fileDialog.getFile());

                __CLR4_5_2jfjflx1h5hof.R.inc(1170);Board board = configuration.getBoard(file);
                __CLR4_5_2jfjflx1h5hof.R.inc(1171);BoardLocation boardLocation = new BoardLocation(board);
                __CLR4_5_2jfjflx1h5hof.R.inc(1172);jobProcessor.getJob().addBoardLocation(boardLocation);
                // TODO: Move to a list property listener.
                __CLR4_5_2jfjflx1h5hof.R.inc(1173);boardLocationsTableModel.fireTableDataChanged();

                __CLR4_5_2jfjflx1h5hof.R.inc(1174);Helpers.selectLastTableRow(boardLocationsTable);
            }
            catch (Exception e) {
                __CLR4_5_2jfjflx1h5hof.R.inc(1175);e.printStackTrace();
                __CLR4_5_2jfjflx1h5hof.R.inc(1176);MessageBoxes.errorBox(frame, "Board load failed", e.getMessage());
            }
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action removeBoardAction = new AbstractAction("Remove Board") {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1177);
            __CLR4_5_2jfjflx1h5hof.R.inc(1178);putValue(SMALL_ICON, Icons.delete);
            __CLR4_5_2jfjflx1h5hof.R.inc(1179);putValue(NAME, "Remove Board");
            __CLR4_5_2jfjflx1h5hof.R.inc(1180);putValue(SHORT_DESCRIPTION, "Remove the selected board from the job.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1181);
            __CLR4_5_2jfjflx1h5hof.R.inc(1182);int index = boardLocationsTable.getSelectedRow();
            __CLR4_5_2jfjflx1h5hof.R.inc(1183);if ((((index != -1)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1184)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1185)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1186);index = boardLocationsTable.convertRowIndexToModel(index);
                __CLR4_5_2jfjflx1h5hof.R.inc(1187);BoardLocation boardLocation =
                        JobPanel.this.jobProcessor.getJob().getBoardLocations().get(index);
                __CLR4_5_2jfjflx1h5hof.R.inc(1188);JobPanel.this.jobProcessor.getJob().removeBoardLocation(boardLocation);
                __CLR4_5_2jfjflx1h5hof.R.inc(1189);boardLocationsTableModel.fireTableDataChanged();
            }
        }}finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action captureCameraBoardLocationAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1190);
            __CLR4_5_2jfjflx1h5hof.R.inc(1191);putValue(SMALL_ICON, Icons.captureCamera);
            __CLR4_5_2jfjflx1h5hof.R.inc(1192);putValue(NAME, "Capture Camera Location");
            __CLR4_5_2jfjflx1h5hof.R.inc(1193);putValue(SHORT_DESCRIPTION,
                    "Set the board's location to the camera's current position.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1194);
            __CLR4_5_2jfjflx1h5hof.R.inc(1195);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2jfjflx1h5hof.R.inc(1196);HeadMountable tool = MainFrame.machineControlsPanel.getSelectedTool();
                __CLR4_5_2jfjflx1h5hof.R.inc(1197);Camera camera = tool.getHead().getDefaultCamera();
                __CLR4_5_2jfjflx1h5hof.R.inc(1198);double z = getSelectedBoardLocation().getLocation().getZ();
                __CLR4_5_2jfjflx1h5hof.R.inc(1199);getSelectedBoardLocation()
                        .setLocation(camera.getLocation().derive(null, null, z, null));
                __CLR4_5_2jfjflx1h5hof.R.inc(1200);boardLocationsTableModel.fireTableRowsUpdated(boardLocationsTable.getSelectedRow(),
                        boardLocationsTable.getSelectedRow());
            });
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action captureToolBoardLocationAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1201);
            __CLR4_5_2jfjflx1h5hof.R.inc(1202);putValue(SMALL_ICON, Icons.captureTool);
            __CLR4_5_2jfjflx1h5hof.R.inc(1203);putValue(NAME, "Capture Tool Location");
            __CLR4_5_2jfjflx1h5hof.R.inc(1204);putValue(SHORT_DESCRIPTION, "Set the board's location to the tool's current position.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1205);
            __CLR4_5_2jfjflx1h5hof.R.inc(1206);HeadMountable tool = MainFrame.machineControlsPanel.getSelectedTool();
            __CLR4_5_2jfjflx1h5hof.R.inc(1207);double z = getSelectedBoardLocation().getLocation().getZ();
            __CLR4_5_2jfjflx1h5hof.R.inc(1208);getSelectedBoardLocation().setLocation(tool.getLocation().derive(null, null, z, null));
            __CLR4_5_2jfjflx1h5hof.R.inc(1209);boardLocationsTableModel.fireTableRowsUpdated(boardLocationsTable.getSelectedRow(),
                    boardLocationsTable.getSelectedRow());
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action moveCameraToBoardLocationAction =
            new AbstractAction("Move Camera To Board Location") {
                {try{__CLR4_5_2jfjflx1h5hof.R.inc(1210);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1211);putValue(SMALL_ICON, Icons.centerCamera);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1212);putValue(NAME, "Move Camera To Board Location");
                    __CLR4_5_2jfjflx1h5hof.R.inc(1213);putValue(SHORT_DESCRIPTION, "Position the camera at the board's location.");
                }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1214);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1215);UiUtils.submitUiMachineTask(() -> {
                        __CLR4_5_2jfjflx1h5hof.R.inc(1216);HeadMountable tool = MainFrame.machineControlsPanel.getSelectedTool();
                        __CLR4_5_2jfjflx1h5hof.R.inc(1217);Camera camera = tool.getHead().getDefaultCamera();
                        __CLR4_5_2jfjflx1h5hof.R.inc(1218);MainFrame.cameraPanel.ensureCameraVisible(camera);
                        __CLR4_5_2jfjflx1h5hof.R.inc(1219);Location location = getSelectedBoardLocation().getLocation();
                        __CLR4_5_2jfjflx1h5hof.R.inc(1220);MovableUtils.moveToLocationAtSafeZ(camera, location);
                    });
                }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
            };

    public final Action moveToolToBoardLocationAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1221);
            __CLR4_5_2jfjflx1h5hof.R.inc(1222);putValue(SMALL_ICON, Icons.centerTool);
            __CLR4_5_2jfjflx1h5hof.R.inc(1223);putValue(NAME, "Move Tool To Board Location");
            __CLR4_5_2jfjflx1h5hof.R.inc(1224);putValue(SHORT_DESCRIPTION, "Position the tool at the board's location.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1225);
            __CLR4_5_2jfjflx1h5hof.R.inc(1226);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2jfjflx1h5hof.R.inc(1227);HeadMountable tool = MainFrame.machineControlsPanel.getSelectedTool();
                __CLR4_5_2jfjflx1h5hof.R.inc(1228);Location location = getSelectedBoardLocation().getLocation();
                __CLR4_5_2jfjflx1h5hof.R.inc(1229);MovableUtils.moveToLocationAtSafeZ(tool, location);
            });
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action twoPointLocateBoardLocationAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1230);
            __CLR4_5_2jfjflx1h5hof.R.inc(1231);putValue(SMALL_ICON, Icons.twoPointLocate);
            __CLR4_5_2jfjflx1h5hof.R.inc(1232);putValue(NAME, "Two Point Board Location");
            __CLR4_5_2jfjflx1h5hof.R.inc(1233);putValue(SHORT_DESCRIPTION,
                    "Set the board's location and rotation using two placements.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1234);
            __CLR4_5_2jfjflx1h5hof.R.inc(1235);UiUtils.messageBoxOnException(() -> {
                __CLR4_5_2jfjflx1h5hof.R.inc(1236);new TwoPlacementBoardLocationProcess(frame, JobPanel.this);
            });
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public final Action fiducialCheckAction = new AbstractAction() {
        {try{__CLR4_5_2jfjflx1h5hof.R.inc(1237);
            __CLR4_5_2jfjflx1h5hof.R.inc(1238);putValue(SMALL_ICON, Icons.fiducialCheck);
            __CLR4_5_2jfjflx1h5hof.R.inc(1239);putValue(NAME, "Fiducial Check");
            __CLR4_5_2jfjflx1h5hof.R.inc(1240);putValue(SHORT_DESCRIPTION,
                    "Perform a fiducial check for the board and update it's location and rotation.");
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1241);
            __CLR4_5_2jfjflx1h5hof.R.inc(1242);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2jfjflx1h5hof.R.inc(1243);Location location = Configuration.get().getMachine().getFiducialLocator()
                        .locateBoard(getSelectedBoardLocation());
                __CLR4_5_2jfjflx1h5hof.R.inc(1244);getSelectedBoardLocation().setLocation(location);
                __CLR4_5_2jfjflx1h5hof.R.inc(1245);refreshSelectedBoardRow();
                __CLR4_5_2jfjflx1h5hof.R.inc(1246);HeadMountable tool = MainFrame.machineControlsPanel.getSelectedTool();
                __CLR4_5_2jfjflx1h5hof.R.inc(1247);Camera camera = tool.getHead().getDefaultCamera();
                __CLR4_5_2jfjflx1h5hof.R.inc(1248);MainFrame.cameraPanel.ensureCameraVisible(camera);
                __CLR4_5_2jfjflx1h5hof.R.inc(1249);MovableUtils.moveToLocationAtSafeZ(camera, location);
            });
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    public class OpenRecentJobAction extends AbstractAction {
        private final File file;

        public OpenRecentJobAction(File file) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1250);
            __CLR4_5_2jfjflx1h5hof.R.inc(1251);this.file = file;
            __CLR4_5_2jfjflx1h5hof.R.inc(1252);putValue(NAME, file.getName());
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1253);
            __CLR4_5_2jfjflx1h5hof.R.inc(1254);if ((((!checkForModifications())&&(__CLR4_5_2jfjflx1h5hof.R.iget(1255)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1256)==0&false))) {{
                __CLR4_5_2jfjflx1h5hof.R.inc(1257);return;
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(1258);try {
                __CLR4_5_2jfjflx1h5hof.R.inc(1259);Job job = configuration.loadJob(file);
                __CLR4_5_2jfjflx1h5hof.R.inc(1260);jobProcessor.load(job);
                __CLR4_5_2jfjflx1h5hof.R.inc(1261);addRecentJob(file);
            }
            catch (Exception e) {
                __CLR4_5_2jfjflx1h5hof.R.inc(1262);e.printStackTrace();
                __CLR4_5_2jfjflx1h5hof.R.inc(1263);MessageBoxes.errorBox(frame, "Job Load Error", e.getMessage());
            }
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    }

    private final JobProcessorListener jobProcessorListener = new JobProcessorListener.Adapter() {
        @Override
        public void jobStateChanged(JobState state) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1264);
            __CLR4_5_2jfjflx1h5hof.R.inc(1265);updateJobActions();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void jobLoaded(Job job) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1266);
            __CLR4_5_2jfjflx1h5hof.R.inc(1267);if ((((boardLocationsTableModel.getJob() != job)&&(__CLR4_5_2jfjflx1h5hof.R.iget(1268)!=0|true))||(__CLR4_5_2jfjflx1h5hof.R.iget(1269)==0&false))) {{
                // If the same job is being loaded there is no reason to reset
                // the table, so skip it. This allows us to leave the same
                // row selected in the case of switching job processors and
                // tabs.
                __CLR4_5_2jfjflx1h5hof.R.inc(1270);boardLocationsTableModel.setJob(job);
            }
            }__CLR4_5_2jfjflx1h5hof.R.inc(1271);job.addPropertyChangeListener("dirty", titlePropertyChangeListener);
            __CLR4_5_2jfjflx1h5hof.R.inc(1272);job.addPropertyChangeListener("file", titlePropertyChangeListener);
            __CLR4_5_2jfjflx1h5hof.R.inc(1273);updateTitle();
            __CLR4_5_2jfjflx1h5hof.R.inc(1274);updateJobActions();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void jobEncounteredError(JobError error, String description) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1275);
            __CLR4_5_2jfjflx1h5hof.R.inc(1276);MessageBoxes.errorBox(frame, error.toString(),
                    description + "\n\nThe job will be paused.");
            // TODO: Implement a way to retry, abort, etc.
            __CLR4_5_2jfjflx1h5hof.R.inc(1277);jobProcessor.pause();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    private final JobProcessorDelegate jobProcessorDelegate = new JobProcessorDelegate() {
        @Override
        public PickRetryAction partPickFailed(BoardLocation board, Part part, Feeder feeder) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1278);
            __CLR4_5_2jfjflx1h5hof.R.inc(1279);return PickRetryAction.SkipAndContinue;
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    private final MachineListener machineListener = new MachineListener.Adapter() {
        @Override
        public void machineEnabled(Machine machine) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1280);
            __CLR4_5_2jfjflx1h5hof.R.inc(1281);updateJobActions();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}

        @Override
        public void machineDisabled(Machine machine, String reason) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1282);
            __CLR4_5_2jfjflx1h5hof.R.inc(1283);updateJobActions();
            __CLR4_5_2jfjflx1h5hof.R.inc(1284);jobProcessor.stop();
        }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
    };

    private final PropertyChangeListener titlePropertyChangeListener =
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_2jfjflx1h5hof.R.inc(1285);
                    __CLR4_5_2jfjflx1h5hof.R.inc(1286);updateTitle();
                    __CLR4_5_2jfjflx1h5hof.R.inc(1287);jobSaveActionGroup.setEnabled(jobProcessor.getJob().isDirty());
                }finally{__CLR4_5_2jfjflx1h5hof.R.flushNeeded();}}
            };
}
