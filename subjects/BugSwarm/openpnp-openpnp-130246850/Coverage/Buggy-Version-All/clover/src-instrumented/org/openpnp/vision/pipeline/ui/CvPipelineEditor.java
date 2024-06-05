/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.awt.BorderLayout;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.stages.BlurGaussian;
import org.openpnp.vision.pipeline.stages.BlurMedian;
import org.openpnp.vision.pipeline.stages.BottomVisionCriS;
import org.openpnp.vision.pipeline.stages.ConvertColor;
import org.openpnp.vision.pipeline.stages.DetectCirclesHough;
import org.openpnp.vision.pipeline.stages.DetectEdgesCanny;
import org.openpnp.vision.pipeline.stages.DetectEdgesRobertsCross;
import org.openpnp.vision.pipeline.stages.DrawCircles;
import org.openpnp.vision.pipeline.stages.DrawContours;
import org.openpnp.vision.pipeline.stages.DrawKeyPoints;
import org.openpnp.vision.pipeline.stages.DrawRotatedRects;
import org.openpnp.vision.pipeline.stages.DrawTemplateMatches;
import org.openpnp.vision.pipeline.stages.FilterContours;
import org.openpnp.vision.pipeline.stages.FindContours;
import org.openpnp.vision.pipeline.stages.ImageCapture;
import org.openpnp.vision.pipeline.stages.ImageRead;
import org.openpnp.vision.pipeline.stages.ImageRecall;
import org.openpnp.vision.pipeline.stages.ImageWrite;
import org.openpnp.vision.pipeline.stages.ImageWriteDebug;
import org.openpnp.vision.pipeline.stages.MaskCircle;
import org.openpnp.vision.pipeline.stages.MaskHsv;
import org.openpnp.vision.pipeline.stages.MatchTemplate;
import org.openpnp.vision.pipeline.stages.MinAreaRect;
import org.openpnp.vision.pipeline.stages.Normalize;
import org.openpnp.vision.pipeline.stages.ReadModelProperty;
import org.openpnp.vision.pipeline.stages.SetColor;
import org.openpnp.vision.pipeline.stages.Threshold;

/**
 * A JPanel based component for editing a CvPipeline. Allows the user to add and remove stages,
 * modify properties of each stage, see the image and model results from each stage and export and
 * import the pipeline from the clipboard.
 * 
 * The static method #registerStageClass can be used to register a CvStage implementation with this
 * component, allowing the user to select the implementation from the list when creating a new
 * stage.
 * 
 * The core CvStage classes are automatically registered during startup.
 */
@SuppressWarnings("serial")
public class CvPipelineEditor extends JPanel {public static class __CLR4_5_2gdsgdslx1h3da2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,21286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21232);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21233);stageClasses = new HashSet<>();
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21234);registerStageClass(BlurMedian.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21235);registerStageClass(BlurGaussian.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21236);registerStageClass(BottomVisionCriS.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21237);registerStageClass(ConvertColor.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21238);registerStageClass(DetectCirclesHough.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21239);registerStageClass(DetectEdgesCanny.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21240);registerStageClass(DetectEdgesRobertsCross.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21241);registerStageClass(DrawCircles.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21242);registerStageClass(DrawContours.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21243);registerStageClass(DrawKeyPoints.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21244);registerStageClass(DrawRotatedRects.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21245);registerStageClass(DrawTemplateMatches.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21246);registerStageClass(FilterContours.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21247);registerStageClass(FindContours.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21248);registerStageClass(ImageCapture.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21249);registerStageClass(ImageRead.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21250);registerStageClass(ImageRecall.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21251);registerStageClass(ImageWrite.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21252);registerStageClass(ImageWriteDebug.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21253);registerStageClass(MaskCircle.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21254);registerStageClass(MaskHsv.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21255);registerStageClass(MatchTemplate.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21256);registerStageClass(MinAreaRect.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21257);registerStageClass(Normalize.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21258);registerStageClass(ReadModelProperty.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21259);registerStageClass(SetColor.class);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21260);registerStageClass(Threshold.class);
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}

    private final static Set<Class<? extends CvStage>> stageClasses;

    private final CvPipeline pipeline;
    private PipelinePanel pipelinePanel;
    private ResultsPanel resultsPanel;

    public CvPipelineEditor(CvPipeline pipeline) {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21261);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21262);this.pipeline = pipeline;

        __CLR4_5_2gdsgdslx1h3da2.R.inc(21263);setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gdsgdslx1h3da2.R.inc(21264);JSplitPane inputAndOutputSplitPane = new JSplitPane();
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21265);inputAndOutputSplitPane.setContinuousLayout(true);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21266);add(inputAndOutputSplitPane, BorderLayout.CENTER);

        __CLR4_5_2gdsgdslx1h3da2.R.inc(21267);pipelinePanel = new PipelinePanel(this);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21268);inputAndOutputSplitPane.setLeftComponent(pipelinePanel);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21269);resultsPanel = new ResultsPanel(this);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21270);inputAndOutputSplitPane.setRightComponent(resultsPanel);

        __CLR4_5_2gdsgdslx1h3da2.R.inc(21271);addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21272);
                __CLR4_5_2gdsgdslx1h3da2.R.inc(21273);inputAndOutputSplitPane.setDividerLocation(0.25);
            }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}
        });

        __CLR4_5_2gdsgdslx1h3da2.R.inc(21274);process();
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}

    public CvPipeline getPipeline() {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21275);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21276);return pipeline;
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}

    public void process() {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21277);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21278);getPipeline().process();
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21279);resultsPanel.refresh();
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}

    public void stageSelected(CvStage stage) {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21280);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21281);resultsPanel.setSelectedStage(stage);
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}

    public static Set<Class<? extends CvStage>> getStageClasses() {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21282);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21283);return Collections.unmodifiableSet(stageClasses);
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}

    public static void registerStageClass(Class<? extends CvStage> cls) {try{__CLR4_5_2gdsgdslx1h3da2.R.inc(21284);
        __CLR4_5_2gdsgdslx1h3da2.R.inc(21285);stageClasses.add(cls);
    }finally{__CLR4_5_2gdsgdslx1h3da2.R.flushNeeded();}}
}
