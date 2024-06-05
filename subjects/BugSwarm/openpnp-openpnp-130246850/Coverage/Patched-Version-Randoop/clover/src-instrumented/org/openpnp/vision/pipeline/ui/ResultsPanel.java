/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import org.opencv.core.Mat;
import org.openpnp.gui.support.Icons;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.CvStage.Result;

public class ResultsPanel extends JPanel {public static class __CLR4_5_2gkegkelx1h79um{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,21613,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final CvPipelineEditor editor;

    private CvStage selectedStage;
    private Robot robot;

    public ResultsPanel(CvPipelineEditor editor) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21470);
        __CLR4_5_2gkegkelx1h79um.R.inc(21471);this.editor = editor;
        
        __CLR4_5_2gkegkelx1h79um.R.inc(21472);try {
            __CLR4_5_2gkegkelx1h79um.R.inc(21473);robot = new Robot();
        }
        catch (Exception e) {
            
        }

        __CLR4_5_2gkegkelx1h79um.R.inc(21474);JSplitPane splitPane = new JSplitPane();
        __CLR4_5_2gkegkelx1h79um.R.inc(21475);splitPane.setContinuousLayout(true);
        __CLR4_5_2gkegkelx1h79um.R.inc(21476);splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);

        __CLR4_5_2gkegkelx1h79um.R.inc(21477);setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gkegkelx1h79um.R.inc(21478);JPanel headerPanel = new JPanel();
        __CLR4_5_2gkegkelx1h79um.R.inc(21479);add(headerPanel, BorderLayout.NORTH);
        __CLR4_5_2gkegkelx1h79um.R.inc(21480);headerPanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gkegkelx1h79um.R.inc(21481);resultStageNameLabel = new JLabel("New label");
        __CLR4_5_2gkegkelx1h79um.R.inc(21482);headerPanel.add(resultStageNameLabel, BorderLayout.NORTH);
        __CLR4_5_2gkegkelx1h79um.R.inc(21483);resultStageNameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        __CLR4_5_2gkegkelx1h79um.R.inc(21484);JPanel panel = new JPanel();
        __CLR4_5_2gkegkelx1h79um.R.inc(21485);headerPanel.add(panel, BorderLayout.SOUTH);

        __CLR4_5_2gkegkelx1h79um.R.inc(21486);JToolBar toolBar = new JToolBar();
        __CLR4_5_2gkegkelx1h79um.R.inc(21487);panel.add(toolBar);

        __CLR4_5_2gkegkelx1h79um.R.inc(21488);JButton firstResultButton = new JButton(firstResultAction);
        __CLR4_5_2gkegkelx1h79um.R.inc(21489);firstResultButton.setHideActionText(true);
        __CLR4_5_2gkegkelx1h79um.R.inc(21490);toolBar.add(firstResultButton);

        __CLR4_5_2gkegkelx1h79um.R.inc(21491);JButton previousResultButton = new JButton(previousResultAction);
        __CLR4_5_2gkegkelx1h79um.R.inc(21492);previousResultButton.setHideActionText(true);
        __CLR4_5_2gkegkelx1h79um.R.inc(21493);toolBar.add(previousResultButton);

        __CLR4_5_2gkegkelx1h79um.R.inc(21494);JButton nextResultButton = new JButton(nextResultAction);
        __CLR4_5_2gkegkelx1h79um.R.inc(21495);toolBar.add(nextResultButton);

        __CLR4_5_2gkegkelx1h79um.R.inc(21496);JButton lastResultButton = new JButton(lastResultAction);
        __CLR4_5_2gkegkelx1h79um.R.inc(21497);lastResultButton.setHideActionText(true);
        __CLR4_5_2gkegkelx1h79um.R.inc(21498);toolBar.add(lastResultButton);

        __CLR4_5_2gkegkelx1h79um.R.inc(21499);JPanel modelPanel = new JPanel();
        __CLR4_5_2gkegkelx1h79um.R.inc(21500);modelPanel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gkegkelx1h79um.R.inc(21501);modelTextPane = new JTextPane();
        __CLR4_5_2gkegkelx1h79um.R.inc(21502);modelPanel.add(new JScrollPane(modelTextPane));

        __CLR4_5_2gkegkelx1h79um.R.inc(21503);add(splitPane, BorderLayout.CENTER);
        __CLR4_5_2gkegkelx1h79um.R.inc(21504);splitPane.setRightComponent(modelPanel);
        __CLR4_5_2gkegkelx1h79um.R.inc(21505);splitPane.setDividerLocation(200);

        __CLR4_5_2gkegkelx1h79um.R.inc(21506);JPanel panel_1 = new JPanel();
        __CLR4_5_2gkegkelx1h79um.R.inc(21507);panel_1.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gkegkelx1h79um.R.inc(21508);matView = new MatView();
        __CLR4_5_2gkegkelx1h79um.R.inc(21509);panel_1.add(matView, BorderLayout.CENTER);
        __CLR4_5_2gkegkelx1h79um.R.inc(21510);splitPane.setLeftComponent(panel_1);

        __CLR4_5_2gkegkelx1h79um.R.inc(21511);JLabel matStatusLabel = new JLabel("New label");
        __CLR4_5_2gkegkelx1h79um.R.inc(21512);panel_1.add(matStatusLabel, BorderLayout.SOUTH);
        
        __CLR4_5_2gkegkelx1h79um.R.inc(21513);matView.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21514);
                __CLR4_5_2gkegkelx1h79um.R.inc(21515);Color color = robot.getPixelColor(e.getXOnScreen(), e.getYOnScreen());
                __CLR4_5_2gkegkelx1h79um.R.inc(21516);float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
                __CLR4_5_2gkegkelx1h79um.R.inc(21517);matStatusLabel.setText(String.format("RGB: %03d, %03d, %03d HSB: %03d, %03d, %03d",
                        color.getRed(),
                        color.getGreen(),
                        color.getBlue(),
                        (int) (255.0 * hsb[0]),
                        (int) (255.0 * hsb[1]),
                        (int) (255.0 * hsb[2])));
            }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}
        });

        __CLR4_5_2gkegkelx1h79um.R.inc(21518);addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21519);
                __CLR4_5_2gkegkelx1h79um.R.inc(21520);splitPane.setDividerLocation(0.8);
            }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

    public void refresh() {try{__CLR4_5_2gkegkelx1h79um.R.inc(21521);
        __CLR4_5_2gkegkelx1h79um.R.inc(21522);List<CvStage> stages = editor.getPipeline().getStages();
        // If there are no stages we can't have anything selected, so clear it.
        __CLR4_5_2gkegkelx1h79um.R.inc(21523);if ((((stages.isEmpty())&&(__CLR4_5_2gkegkelx1h79um.R.iget(21524)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21525)==0&false))) {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21526);selectedStage = null;
        }
        // Otherwise if nothing is selected or if the previously selected stage is no longer in the
        // pipeline replace the selection with the first stage.
        }else {__CLR4_5_2gkegkelx1h79um.R.inc(21527);if ((((selectedStage == null || !stages.contains(selectedStage))&&(__CLR4_5_2gkegkelx1h79um.R.iget(21528)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21529)==0&false))) {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21530);selectedStage = stages.get(0);
        }
        }}__CLR4_5_2gkegkelx1h79um.R.inc(21531);updateAllEverything();
    }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

    public void setSelectedStage(CvStage stage) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21532);
        __CLR4_5_2gkegkelx1h79um.R.inc(21533);this.selectedStage = stage;
        __CLR4_5_2gkegkelx1h79um.R.inc(21534);updateAllEverything();
    }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

    private void updateAllEverything() {try{__CLR4_5_2gkegkelx1h79um.R.inc(21535);
        __CLR4_5_2gkegkelx1h79um.R.inc(21536);List<CvStage> stages = editor.getPipeline().getStages();

        __CLR4_5_2gkegkelx1h79um.R.inc(21537);Result result = null;
        __CLR4_5_2gkegkelx1h79um.R.inc(21538);Mat image = null;
        __CLR4_5_2gkegkelx1h79um.R.inc(21539);Object model = null;
        __CLR4_5_2gkegkelx1h79um.R.inc(21540);if ((((selectedStage != null)&&(__CLR4_5_2gkegkelx1h79um.R.iget(21541)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21542)==0&false))) {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21543);result = editor.getPipeline().getResult(selectedStage);
            __CLR4_5_2gkegkelx1h79um.R.inc(21544);if ((((result != null)&&(__CLR4_5_2gkegkelx1h79um.R.iget(21545)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21546)==0&false))) {{
                __CLR4_5_2gkegkelx1h79um.R.inc(21547);image = result.image;
                __CLR4_5_2gkegkelx1h79um.R.inc(21548);model = result.model;
            }
        }}

        }__CLR4_5_2gkegkelx1h79um.R.inc(21549);if ((((model instanceof List)&&(__CLR4_5_2gkegkelx1h79um.R.iget(21550)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21551)==0&false))) {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21552);String s = "";
            __CLR4_5_2gkegkelx1h79um.R.inc(21553);for (Object o : ((List) model)) {{
                __CLR4_5_2gkegkelx1h79um.R.inc(21554);if ((((o != null)&&(__CLR4_5_2gkegkelx1h79um.R.iget(21555)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21556)==0&false))) {{
                    __CLR4_5_2gkegkelx1h79um.R.inc(21557);s += o.toString();
                }
                }__CLR4_5_2gkegkelx1h79um.R.inc(21558);s += "\n";
            }
            }__CLR4_5_2gkegkelx1h79um.R.inc(21559);modelTextPane.setText(s);
        }
        }else {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21560);modelTextPane.setText((((model == null )&&(__CLR4_5_2gkegkelx1h79um.R.iget(21561)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21562)==0&false))? "" : model.toString());
        }
        }__CLR4_5_2gkegkelx1h79um.R.inc(21563);matView.setMat(image);
        __CLR4_5_2gkegkelx1h79um.R.inc(21564);resultStageNameLabel.setText((((result == null || selectedStage == null )&&(__CLR4_5_2gkegkelx1h79um.R.iget(21565)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21566)==0&false))? ""
                : (selectedStage.getName() + " (" + (result.processingTimeNs / 1000000.0)
                        + " ms)"));

        __CLR4_5_2gkegkelx1h79um.R.inc(21567);if ((((selectedStage == null)&&(__CLR4_5_2gkegkelx1h79um.R.iget(21568)!=0|true))||(__CLR4_5_2gkegkelx1h79um.R.iget(21569)==0&false))) {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21570);firstResultAction.setEnabled(false);
            __CLR4_5_2gkegkelx1h79um.R.inc(21571);previousResultAction.setEnabled(false);
            __CLR4_5_2gkegkelx1h79um.R.inc(21572);nextResultAction.setEnabled(false);
            __CLR4_5_2gkegkelx1h79um.R.inc(21573);lastResultAction.setEnabled(false);
        }
        }else {{
            __CLR4_5_2gkegkelx1h79um.R.inc(21574);int index = stages.indexOf(selectedStage);
            __CLR4_5_2gkegkelx1h79um.R.inc(21575);firstResultAction.setEnabled(index > 0);
            __CLR4_5_2gkegkelx1h79um.R.inc(21576);previousResultAction.setEnabled(index > 0);
            __CLR4_5_2gkegkelx1h79um.R.inc(21577);nextResultAction.setEnabled(index < stages.size() - 1);
            __CLR4_5_2gkegkelx1h79um.R.inc(21578);lastResultAction.setEnabled(index < stages.size() - 1);
        }
    }}finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

    public final Action firstResultAction = new AbstractAction() {
        {try{__CLR4_5_2gkegkelx1h79um.R.inc(21579);
            __CLR4_5_2gkegkelx1h79um.R.inc(21580);putValue(SMALL_ICON, Icons.navigateFirst);
            __CLR4_5_2gkegkelx1h79um.R.inc(21581);putValue(NAME, "");
            __CLR4_5_2gkegkelx1h79um.R.inc(21582);putValue(SHORT_DESCRIPTION, "");
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21583);
            __CLR4_5_2gkegkelx1h79um.R.inc(21584);List<CvStage> stages = editor.getPipeline().getStages();
            __CLR4_5_2gkegkelx1h79um.R.inc(21585);selectedStage = stages.get(0);
            __CLR4_5_2gkegkelx1h79um.R.inc(21586);updateAllEverything();
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}
    };

    public final Action previousResultAction = new AbstractAction() {
        {try{__CLR4_5_2gkegkelx1h79um.R.inc(21587);
            __CLR4_5_2gkegkelx1h79um.R.inc(21588);putValue(SMALL_ICON, Icons.navigatePrevious);
            __CLR4_5_2gkegkelx1h79um.R.inc(21589);putValue(NAME, "");
            __CLR4_5_2gkegkelx1h79um.R.inc(21590);putValue(SHORT_DESCRIPTION, "");
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21591);
            __CLR4_5_2gkegkelx1h79um.R.inc(21592);List<CvStage> stages = editor.getPipeline().getStages();
            __CLR4_5_2gkegkelx1h79um.R.inc(21593);int index = stages.indexOf(selectedStage);
            __CLR4_5_2gkegkelx1h79um.R.inc(21594);selectedStage = stages.get(index - 1);
            __CLR4_5_2gkegkelx1h79um.R.inc(21595);updateAllEverything();
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}
    };

    public final Action nextResultAction = new AbstractAction() {
        {try{__CLR4_5_2gkegkelx1h79um.R.inc(21596);
            __CLR4_5_2gkegkelx1h79um.R.inc(21597);putValue(SMALL_ICON, Icons.navigateNext);
            __CLR4_5_2gkegkelx1h79um.R.inc(21598);putValue(NAME, "");
            __CLR4_5_2gkegkelx1h79um.R.inc(21599);putValue(SHORT_DESCRIPTION, "");
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21600);
            __CLR4_5_2gkegkelx1h79um.R.inc(21601);List<CvStage> stages = editor.getPipeline().getStages();
            __CLR4_5_2gkegkelx1h79um.R.inc(21602);int index = stages.indexOf(selectedStage);
            __CLR4_5_2gkegkelx1h79um.R.inc(21603);selectedStage = stages.get(index + 1);
            __CLR4_5_2gkegkelx1h79um.R.inc(21604);updateAllEverything();
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}
    };

    public final Action lastResultAction = new AbstractAction() {
        {try{__CLR4_5_2gkegkelx1h79um.R.inc(21605);
            __CLR4_5_2gkegkelx1h79um.R.inc(21606);putValue(SMALL_ICON, Icons.navigateLast);
            __CLR4_5_2gkegkelx1h79um.R.inc(21607);putValue(NAME, "");
            __CLR4_5_2gkegkelx1h79um.R.inc(21608);putValue(SHORT_DESCRIPTION, "");
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_2gkegkelx1h79um.R.inc(21609);
            __CLR4_5_2gkegkelx1h79um.R.inc(21610);List<CvStage> stages = editor.getPipeline().getStages();
            __CLR4_5_2gkegkelx1h79um.R.inc(21611);selectedStage = stages.get(stages.size() - 1);
            __CLR4_5_2gkegkelx1h79um.R.inc(21612);updateAllEverything();
        }finally{__CLR4_5_2gkegkelx1h79um.R.flushNeeded();}}
    };
    private JTextPane modelTextPane;
    private JLabel resultStageNameLabel;
    private MatView matView;
}
