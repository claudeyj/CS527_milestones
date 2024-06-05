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

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.openpnp.ConfigurationListener;
import org.openpnp.JobProcessorListener;
import org.openpnp.gui.components.CameraPanel;
import org.openpnp.gui.components.FxNavigationView;
import org.openpnp.gui.importer.BoardImporter;
import org.openpnp.gui.importer.EagleBoardImporter;
import org.openpnp.gui.importer.EagleMountsmdUlpImporter;
import org.openpnp.gui.importer.KicadPosImporter;
import org.openpnp.gui.importer.NamedCSVImporter;
import org.openpnp.gui.importer.SolderPasteGerberImporter;
import org.openpnp.gui.support.HeadCellValue;
import org.openpnp.gui.support.LengthCellValue;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.OSXAdapter;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.spi.JobProcessor;

/**
 * The main window of the application.
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {public static class __CLR4_5_21wt1wtlx1h06yq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,2784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String PREF_WINDOW_X = "MainFrame.windowX";
    private static final int PREF_WINDOW_X_DEF = 0;
    private static final String PREF_WINDOW_Y = "MainFrame.windowY";
    private static final int PREF_WINDOW_Y_DEF = 0;
    private static final String PREF_WINDOW_WIDTH = "MainFrame.windowWidth";
    private static final int PREF_WINDOW_WIDTH_DEF = 1024;
    private static final String PREF_WINDOW_HEIGHT = "MainFrame.windowHeight";
    private static final int PREF_WINDOW_HEIGHT_DEF = 768;
    private static final String PREF_DIVIDER_POSITION = "MainFrame.dividerPosition";
    private static final int PREF_DIVIDER_POSITION_DEF = -1;

    /*
     * TODO define accelerators and mnemonics
     * openJobMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
     * Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
     */
    private final Configuration configuration;

    // TODO: Really should switch to some kind of DI model, but this will do
    // for now.
    public static MainFrame mainFrame;
    public static MachineControlsPanel machineControlsPanel;
    public static PartsPanel partsPanel;
    public static PackagesPanel packagesPanel;
    public static FeedersPanel feedersPanel;
    public static JobPanel jobPanel;
    public static CamerasPanel camerasPanel;
    public static CameraPanel cameraPanel;
    public static MachineSetupPanel machineSetupPanel;
    public static Component navigationPanel;

    private JPanel contentPane;
    private JLabel lblStatus;
    private JTabbedPane panelBottom;
    private JSplitPane splitPaneTopBottom;
    private TitledBorder panelInstructionsBorder;

    private Preferences prefs = Preferences.userNodeForPackage(MainFrame.class);

    private ActionListener instructionsCancelActionListener;
    private ActionListener instructionsProceedActionListener;

    private JMenu mnImport;

    public MainFrame(Configuration configuration) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2477);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2478);mainFrame = this;
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2479);this.configuration = configuration;
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2480);LengthCellValue.setConfiguration(configuration);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2481);HeadCellValue.setConfiguration(configuration);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2482);setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Get handlers for Mac application menu in place.
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2483);boolean macOsXMenus = registerForMacOSXEvents();

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2484);addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2485);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2486);quit();
            }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
        });

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2487);if ((((prefs.getInt(PREF_WINDOW_WIDTH, 50) < 50)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2488)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2489)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2490);prefs.putInt(PREF_WINDOW_WIDTH, PREF_WINDOW_WIDTH_DEF);
        }

        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2491);if ((((prefs.getInt(PREF_WINDOW_HEIGHT, 50) < 50)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2492)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2493)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2494);prefs.putInt(PREF_WINDOW_HEIGHT, PREF_WINDOW_HEIGHT_DEF);
        }

        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2495);setBounds(prefs.getInt(PREF_WINDOW_X, PREF_WINDOW_X_DEF),
                prefs.getInt(PREF_WINDOW_Y, PREF_WINDOW_Y_DEF),
                prefs.getInt(PREF_WINDOW_WIDTH, PREF_WINDOW_WIDTH_DEF),
                prefs.getInt(PREF_WINDOW_HEIGHT, PREF_WINDOW_HEIGHT_DEF));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2496);jobPanel = new JobPanel(configuration, this, machineControlsPanel);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2497);partsPanel = new PartsPanel(configuration, this);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2498);packagesPanel = new PackagesPanel(configuration, this);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2499);feedersPanel = new FeedersPanel(configuration, this);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2500);camerasPanel = new CamerasPanel(this, configuration);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2501);machineSetupPanel = new MachineSetupPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2502);cameraPanel = new CameraPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2503);machineControlsPanel = new MachineControlsPanel(configuration, this, cameraPanel);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2504);JMenuBar menuBar = new JMenuBar();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2505);setJMenuBar(menuBar);

        // File
        //////////////////////////////////////////////////////////////////////
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2506);JMenu mnFile = new JMenu("File");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2507);menuBar.add(mnFile);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2508);mnFile.add(new JMenuItem(jobPanel.newJobAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2509);mnFile.add(new JMenuItem(jobPanel.openJobAction));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2510);mnFile.add(jobPanel.mnOpenRecent);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2511);mnFile.addSeparator();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2512);mnFile.add(new JMenuItem(jobPanel.saveJobAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2513);mnFile.add(new JMenuItem(jobPanel.saveJobAsAction));


        // File -> Import
        //////////////////////////////////////////////////////////////////////
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2514);mnFile.addSeparator();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2515);mnImport = new JMenu("Import Board");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2516);mnFile.add(mnImport);


        __CLR4_5_21wt1wtlx1h06yq.R.inc(2517);if ((((!macOsXMenus)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2518)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2519)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2520);mnFile.addSeparator();
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2521);mnFile.add(new JMenuItem(quitAction));
        }

        // Edit
        //////////////////////////////////////////////////////////////////////
        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2522);JMenu mnEdit = new JMenu("Edit");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2523);menuBar.add(mnEdit);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2524);mnEdit.add(new JMenuItem(jobPanel.newBoardAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2525);mnEdit.add(new JMenuItem(jobPanel.addBoardAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2526);mnEdit.add(new JMenuItem(jobPanel.removeBoardAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2527);mnEdit.addSeparator();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2528);mnEdit.add(new JMenuItem(jobPanel.captureToolBoardLocationAction));

        // View
        //////////////////////////////////////////////////////////////////////
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2529);JMenu mnView = new JMenu("View");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2530);menuBar.add(mnView);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2531);ButtonGroup buttonGroup = new ButtonGroup();

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2532);JMenu mnUnits = new JMenu("System Units");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2533);mnView.add(mnUnits);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2534);JMenuItem menuItem;
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2535);menuItem = new JCheckBoxMenuItem(inchesUnitSelected);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2536);buttonGroup.add(menuItem);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2537);if ((((configuration.getSystemUnits() == LengthUnit.Inches)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2538)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2539)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2540);menuItem.setSelected(true);
        }
        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2541);mnUnits.add(menuItem);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2542);menuItem = new JCheckBoxMenuItem(millimetersUnitSelected);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2543);buttonGroup.add(menuItem);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2544);if ((((configuration.getSystemUnits() == LengthUnit.Millimeters)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2545)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2546)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2547);menuItem.setSelected(true);
        }
        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2548);mnUnits.add(menuItem);

        // Job Control
        //////////////////////////////////////////////////////////////////////
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2549);JMenu mnJob = new JMenu("Job Control");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2550);menuBar.add(mnJob);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2551);mnJob.add(new JMenuItem(jobPanel.startPauseResumeJobAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2552);mnJob.add(new JMenuItem(jobPanel.stepJobAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2553);mnJob.add(new JMenuItem(jobPanel.stopJobAction));

        // Machine
        //////////////////////////////////////////////////////////////////////
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2554);JMenu mnCommands = new JMenu("Machine");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2555);menuBar.add(mnCommands);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2556);mnCommands.add(new JMenuItem(machineControlsPanel.homeAction));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2557);mnCommands.addSeparator();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2558);mnCommands.add(new JMenuItem(machineControlsPanel.startStopMachineAction));

        // Help
        /////////////////////////////////////////////////////////////////////
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2559);if ((((!macOsXMenus)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2560)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2561)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2562);JMenu mnHelp = new JMenu("Help");
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2563);menuBar.add(mnHelp);

            __CLR4_5_21wt1wtlx1h06yq.R.inc(2564);mnHelp.add(new JMenuItem(aboutAction));
        }

        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2565);contentPane = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2566);contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2567);setContentPane(contentPane);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2568);contentPane.setLayout(new BorderLayout(0, 0));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2569);splitPaneTopBottom = new JSplitPane();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2570);splitPaneTopBottom.setBorder(null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2571);splitPaneTopBottom.setOrientation(JSplitPane.VERTICAL_SPLIT);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2572);splitPaneTopBottom.setContinuousLayout(true);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2573);contentPane.add(splitPaneTopBottom, BorderLayout.CENTER);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2574);JPanel panelTop = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2575);splitPaneTopBottom.setLeftComponent(panelTop);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2576);panelTop.setLayout(new BorderLayout(0, 0));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2577);JPanel panelLeftColumn = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2578);panelTop.add(panelLeftColumn, BorderLayout.WEST);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2579);FlowLayout flowLayout = (FlowLayout) panelLeftColumn.getLayout();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2580);flowLayout.setVgap(0);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2581);flowLayout.setHgap(0);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2582);JPanel panel = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2583);panelLeftColumn.add(panel);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2584);panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2585);machineControlsPanel.setBorder(new TitledBorder(null, "Machine Controls",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2586);panel.add(machineControlsPanel);

        // Add global hotkeys for the arrow keys
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2587);final Map<KeyStroke, Action> hotkeyActionMap = new HashMap<>();

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2588);int mask = KeyEvent.CTRL_DOWN_MASK;

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2589);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, mask),
                machineControlsPanel.getJogControlsPanel().yPlusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2590);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, mask),
                machineControlsPanel.getJogControlsPanel().yMinusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2591);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, mask),
                machineControlsPanel.getJogControlsPanel().xMinusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2592);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, mask),
                machineControlsPanel.getJogControlsPanel().xPlusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2593);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_QUOTE, mask),
                machineControlsPanel.getJogControlsPanel().zPlusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2594);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, mask),
                machineControlsPanel.getJogControlsPanel().zMinusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2595);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, mask),
                machineControlsPanel.getJogControlsPanel().cPlusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2596);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, mask),
                machineControlsPanel.getJogControlsPanel().cMinusAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2597);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, mask),
                machineControlsPanel.getJogControlsPanel().lowerIncrementAction);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2598);hotkeyActionMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, mask),
                machineControlsPanel.getJogControlsPanel().raiseIncrementAction);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2599);Toolkit.getDefaultToolkit().getSystemEventQueue().push(new EventQueue() {
            @Override
            protected void dispatchEvent(AWTEvent event) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2600);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2601);if ((((event instanceof KeyEvent)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2602)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2603)==0&false))) {{
                    __CLR4_5_21wt1wtlx1h06yq.R.inc(2604);KeyStroke ks = KeyStroke.getKeyStrokeForEvent((KeyEvent) event);
                    __CLR4_5_21wt1wtlx1h06yq.R.inc(2605);Action action = hotkeyActionMap.get(ks);
                    __CLR4_5_21wt1wtlx1h06yq.R.inc(2606);if ((((action != null && action.isEnabled())&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2607)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2608)==0&false))) {{
                        __CLR4_5_21wt1wtlx1h06yq.R.inc(2609);action.actionPerformed(null);
                        __CLR4_5_21wt1wtlx1h06yq.R.inc(2610);return;
                    }
                }}
                }__CLR4_5_21wt1wtlx1h06yq.R.inc(2611);super.dispatchEvent(event);
            }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
        });

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2612);JPanel panelCameraAndInstructions = new JPanel(new BorderLayout());

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2613);panelTop.add(panelCameraAndInstructions, BorderLayout.CENTER);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2614);panelInstructions = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2615);panelInstructions.setVisible(false);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2616);panelInstructions.setBorder(panelInstructionsBorder = new TitledBorder(null, "Instructions",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2617);panelCameraAndInstructions.add(panelInstructions, BorderLayout.SOUTH);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2618);panelInstructions.setLayout(new BorderLayout(0, 0));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2619);panelInstructionActions = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2620);panelInstructionActions.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2621);panelInstructions.add(panelInstructionActions, BorderLayout.EAST);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2622);panelInstructionActions.setLayout(new BorderLayout(0, 0));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2623);panel_2 = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2624);FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2625);flowLayout_2.setVgap(0);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2626);flowLayout_2.setHgap(0);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2627);panelInstructionActions.add(panel_2, BorderLayout.SOUTH);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2628);btnInstructionsCancel = new JButton("Cancel");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2629);btnInstructionsCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2630);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2631);if ((((instructionsCancelActionListener != null)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2632)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2633)==0&false))) {{
                    __CLR4_5_21wt1wtlx1h06yq.R.inc(2634);instructionsCancelActionListener.actionPerformed(arg0);
                }
            }}finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
        });
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2635);panel_2.add(btnInstructionsCancel);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2636);btnInstructionsNext = new JButton("Next");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2637);btnInstructionsNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2638);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2639);if ((((instructionsProceedActionListener != null)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2640)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2641)==0&false))) {{
                    __CLR4_5_21wt1wtlx1h06yq.R.inc(2642);instructionsProceedActionListener.actionPerformed(arg0);
                }
            }}finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
        });
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2643);panel_2.add(btnInstructionsNext);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2644);panel_1 = new JPanel();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2645);panelInstructions.add(panel_1, BorderLayout.CENTER);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2646);panel_1.setLayout(new BorderLayout(0, 0));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2647);lblInstructions = new JTextPane();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2648);lblInstructions.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2649);lblInstructions.setBackground(UIManager.getColor("Panel.background"));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2650);lblInstructions.setContentType("text/html");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2651);lblInstructions.setEditable(false);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2652);panel_1.add(lblInstructions);


        __CLR4_5_21wt1wtlx1h06yq.R.inc(2653);cameraPanel.setBorder(new TitledBorder(null, "Cameras", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2654);if ((((System.getProperty("enableNav", null) != null)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2655)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2656)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2657);navigationPanel = new FxNavigationView();
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2658);camerasAndNavTabbedPane = new JTabbedPane(JTabbedPane.TOP);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2659);camerasAndNavTabbedPane.addTab("Cameras", null, cameraPanel, null);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2660);camerasAndNavTabbedPane.addTab("Navigation", null, navigationPanel, null);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2661);panelCameraAndInstructions.add(camerasAndNavTabbedPane, BorderLayout.CENTER);
        }
        }else {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2662);panelCameraAndInstructions.add(cameraPanel, BorderLayout.CENTER);
        }

        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2663);panelBottom = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2664);splitPaneTopBottom.setRightComponent(panelBottom);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2665);lblStatus = new JLabel(" ");
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2666);lblStatus.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2667);contentPane.add(lblStatus, BorderLayout.SOUTH);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2668);splitPaneTopBottom
                .setDividerLocation(prefs.getInt(PREF_DIVIDER_POSITION, PREF_DIVIDER_POSITION_DEF));
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2669);splitPaneTopBottom.addPropertyChangeListener("dividerLocation",
                new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent evt) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2670);
                        __CLR4_5_21wt1wtlx1h06yq.R.inc(2671);prefs.putInt(PREF_DIVIDER_POSITION,
                                splitPaneTopBottom.getDividerLocation());
                    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
                });

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2672);panelBottom.addTab("Job", null, jobPanel, null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2673);panelBottom.addTab("Parts", null, partsPanel, null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2674);panelBottom.addTab("Packages", null, packagesPanel, null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2675);panelBottom.addTab("Feeders", null, feedersPanel, null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2676);panelBottom.addTab("Cameras", null, camerasPanel, null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2677);panelBottom.addTab("Machine Setup", null, machineSetupPanel, null);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2678);registerBoardImporters();

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2679);addComponentListener(componentListener);

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2680);try {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2681);configuration.load();
        }
        catch (Exception e) {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2682);e.printStackTrace();
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2683);MessageBoxes.errorBox(this, "Configuration Load Error",
                    "There was a problem loading the configuration. The reason was:<br/><br/>"
                            + e.getMessage() + "<br/><br/>"
                            + "Please check your configuration files and try again. They are located at: "
                            + configuration.getConfigurationDirectory().getAbsolutePath()
                            + "<br/><br/>"
                            + "If you would like to start with a fresh configuration, just delete the entire directory at the location above.<br/><br/>"
                            + "OpenPnP will now exit.");
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2684);System.exit(1);
        }

        __CLR4_5_21wt1wtlx1h06yq.R.inc(2685);configuration.addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2686);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2687);for (JobProcessor jobProcessor : configuration.getMachine().getJobProcessors()
                        .values()) {{
                    __CLR4_5_21wt1wtlx1h06yq.R.inc(2688);jobProcessor.addListener(jobProcessorListener);
                }
            }}finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
        });
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    private void registerBoardImporters() {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2689);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2690);registerBoardImporter(EagleBoardImporter.class);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2691);registerBoardImporter(EagleMountsmdUlpImporter.class);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2692);registerBoardImporter(KicadPosImporter.class);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2693);registerBoardImporter(NamedCSVImporter.class);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2694);registerBoardImporter(SolderPasteGerberImporter.class);
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    /**
     * Register a BoardImporter with the system, causing it to gain a menu location in the
     * File->Import menu.
     * 
     * @param importer
     */
    public void registerBoardImporter(final Class<? extends BoardImporter> boardImporterClass) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2695);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2696);final BoardImporter boardImporter;
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2697);try {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2698);boardImporter = boardImporterClass.newInstance();
        }
        catch (Exception e) {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2699);throw new Error(e);
        }
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2700);JMenuItem menuItem = new JMenuItem(new AbstractAction() {
            {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2701);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2702);putValue(NAME, boardImporter.getImporterName());
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2703);putValue(SHORT_DESCRIPTION, boardImporter.getImporterDescription());
            }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2704);
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2705);jobPanel.importBoard(boardImporterClass);
            }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
        });
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2706);mnImport.add(menuItem);
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    public void showInstructions(String title, String instructions, boolean showCancelButton,
            boolean showProceedButton, String proceedButtonText,
            ActionListener cancelActionListener, ActionListener proceedActionListener) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2707);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2708);panelInstructionsBorder.setTitle(title);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2709);lblInstructions.setText(instructions);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2710);btnInstructionsCancel.setVisible(showCancelButton);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2711);btnInstructionsNext.setVisible(showProceedButton);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2712);btnInstructionsNext.setText(proceedButtonText);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2713);instructionsCancelActionListener = cancelActionListener;
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2714);instructionsProceedActionListener = proceedActionListener;
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2715);panelInstructions.setVisible(true);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2716);doLayout();
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2717);panelInstructions.repaint();
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    public void hideInstructions() {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2718);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2719);panelInstructions.setVisible(false);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2720);doLayout();
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    public boolean registerForMacOSXEvents() {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2721);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2722);if (((((System.getProperty("os.name").toLowerCase().startsWith("mac os x")))&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2723)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2724)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2725);try {
                // Generate and register the OSXAdapter, passing it a hash of
                // all the methods we wish to
                // use as delegates for various
                // com.apple.eawt.ApplicationListener methods
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2726);OSXAdapter.setQuitHandler(this,
                        getClass().getDeclaredMethod("quit", (Class[]) null));
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2727);OSXAdapter.setAboutHandler(this,
                        getClass().getDeclaredMethod("about", (Class[]) null));
                // OSXAdapter.setPreferencesHandler(this, getClass()
                // .getDeclaredMethod("preferences", (Class[]) null));
                // OSXAdapter.setFileHandler(
                // this,
                // getClass().getDeclaredMethod("loadImageFile",
                // new Class[] { String.class }));
            }
            catch (Exception e) {
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2728);System.err.println("Error while loading the OSXAdapter:");
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2729);e.printStackTrace();
            }
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2730);return true;
        }
        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2731);return false;
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    public void about() {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2732);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2733);AboutDialog dialog = new AboutDialog(this);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2734);dialog.setSize(350, 350);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2735);dialog.setLocationRelativeTo(null);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2736);dialog.setVisible(true);
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    public boolean quit() {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2737);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2738);try {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2739);Preferences.userRoot().flush();
        }
        catch (Exception e) {

        }

        // Save the configuration
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2740);try {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2741);configuration.save();
        }
        catch (Exception e) {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2742);String message = "There was a problem saving the configuration. The reason was:\n\n"
                    + e.getMessage() + "\n\nDo you want to quit without saving?";
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2743);message = message.replaceAll("\n", "<br/>");
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2744);message = message.replaceAll("\r", "");
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2745);message = "<html><body width=\"400\">" + message + "</body></html>";
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2746);int result = JOptionPane.showConfirmDialog(this, message, "Configuration Save Error",
                    JOptionPane.YES_NO_OPTION);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2747);if ((((result != JOptionPane.YES_OPTION)&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2748)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2749)==0&false))) {{
                __CLR4_5_21wt1wtlx1h06yq.R.inc(2750);return false;
            }
        }}
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2751);if ((((!jobPanel.checkForModifications())&&(__CLR4_5_21wt1wtlx1h06yq.R.iget(2752)!=0|true))||(__CLR4_5_21wt1wtlx1h06yq.R.iget(2753)==0&false))) {{
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2754);return false;
        }
        // Attempt to stop the machine on quit
        }__CLR4_5_21wt1wtlx1h06yq.R.inc(2755);try {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2756);configuration.getMachine().setEnabled(false);
        }
        catch (Exception e) {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2757);e.printStackTrace();
        }
        // Attempt to stop the machine on quit
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2758);try {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2759);configuration.getMachine().close();
        }
        catch (Exception e) {
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2760);e.printStackTrace();
        }
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2761);System.exit(0);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2762);return true;
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    public void showTab(String title) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2763);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2764);int index = panelBottom.indexOfTab(title);
        __CLR4_5_21wt1wtlx1h06yq.R.inc(2765);panelBottom.setSelectedIndex(index);
    }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

    private JobProcessorListener jobProcessorListener = new JobProcessorListener.Adapter() {
        @Override
        public void detailedStatusUpdated(String status) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2766);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2767);lblStatus.setText(status);
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
    };

    private ComponentListener componentListener = new ComponentAdapter() {
        @Override
        public void componentMoved(ComponentEvent e) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2768);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2769);prefs.putInt(PREF_WINDOW_X, getLocation().x);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2770);prefs.putInt(PREF_WINDOW_Y, getLocation().y);
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}

        @Override
        public void componentResized(ComponentEvent e) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2771);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2772);prefs.putInt(PREF_WINDOW_WIDTH, getSize().width);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2773);prefs.putInt(PREF_WINDOW_HEIGHT, getSize().height);
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
    };

    private Action inchesUnitSelected = new AbstractAction(LengthUnit.Inches.name()) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2774);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2775);configuration.setSystemUnits(LengthUnit.Inches);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2776);MessageBoxes.errorBox(MainFrame.this, "Notice",
                    "Please restart OpenPnP for the changes to take effect.");
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
    };

    private Action millimetersUnitSelected = new AbstractAction(LengthUnit.Millimeters.name()) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2777);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2778);configuration.setSystemUnits(LengthUnit.Millimeters);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2779);MessageBoxes.errorBox(MainFrame.this, "Notice",
                    "Please restart OpenPnP for the changes to take effect.");
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
    };

    private Action quitAction = new AbstractAction("Exit") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2780);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2781);quit();
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
    };

    private Action aboutAction = new AbstractAction("About") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21wt1wtlx1h06yq.R.inc(2782);
            __CLR4_5_21wt1wtlx1h06yq.R.inc(2783);about();
        }finally{__CLR4_5_21wt1wtlx1h06yq.R.flushNeeded();}}
    };

    private JPanel panelInstructions;
    private JPanel panelInstructionActions;
    private JPanel panel_1;
    private JButton btnInstructionsNext;
    private JButton btnInstructionsCancel;
    private JTextPane lblInstructions;
    private JPanel panel_2;
    private JTabbedPane camerasAndNavTabbedPane;
    private JPanel panel_3;
}
