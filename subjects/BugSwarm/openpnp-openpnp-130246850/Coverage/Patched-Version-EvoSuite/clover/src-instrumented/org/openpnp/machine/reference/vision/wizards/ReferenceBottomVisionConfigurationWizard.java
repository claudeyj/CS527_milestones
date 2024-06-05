/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.vision.wizards;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.openpnp.gui.MainFrame;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.machine.reference.vision.ReferenceBottomVision;
import org.openpnp.machine.reference.vision.ReferenceBottomVision.PartSettings;
import org.openpnp.util.UiUtils;
import org.openpnp.util.VisionUtils;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.ui.CvPipelineEditor;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class ReferenceBottomVisionConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2b3rb3rlx1h5pxi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,14441,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceBottomVision bottomVision;
    private JCheckBox enabledCheckbox;

    public ReferenceBottomVisionConfigurationWizard(ReferenceBottomVision bottomVision) {try{__CLR4_5_2b3rb3rlx1h5pxi.R.inc(14391);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14392);this.bottomVision = bottomVision;

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14393);JPanel panel = new JPanel();
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14394);panel.setBorder(new TitledBorder(null, "General", TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14395);contentPanel.add(panel);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14396);panel.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("right:default"),
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14397);JLabel lblEnabled = new JLabel("Enabled?");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14398);panel.add(lblEnabled, "2, 2");

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14399);enabledCheckbox = new JCheckBox("");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14400);panel.add(enabledCheckbox, "4, 2");

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14401);JLabel lblPipeline = new JLabel("Pipeline");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14402);panel.add(lblPipeline, "2, 4");

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14403);JButton editPipelineButton = new JButton("Edit");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14404);editPipelineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2b3rb3rlx1h5pxi.R.inc(14405);
                __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14406);UiUtils.messageBoxOnException(() -> {
                    __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14407);editPipeline();
                });
            }finally{__CLR4_5_2b3rb3rlx1h5pxi.R.flushNeeded();}}
        });
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14408);panel.add(editPipelineButton, "4, 4");

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14409);JButton btnResetToDefault = new JButton("Reset to Default");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14410);btnResetToDefault.addActionListener((e) -> {
            __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14411);int result = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "This will replace the current pipeline with the built in default pipeline. Are you sure?",
                    null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14412);if ((((result == JOptionPane.YES_OPTION)&&(__CLR4_5_2b3rb3rlx1h5pxi.R.iget(14413)!=0|true))||(__CLR4_5_2b3rb3rlx1h5pxi.R.iget(14414)==0&false))) {{
                __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14415);UiUtils.messageBoxOnException(() -> {
                    __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14416);bottomVision.setPipeline(ReferenceBottomVision.createDefaultPipeline());
                    __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14417);editPipeline();
                });
            }
        }});
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14418);panel.add(btnResetToDefault, "6, 4");

        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14419);JButton btnResetAllTo = new JButton("Reset All Parts");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14420);btnResetAllTo.addActionListener((e) -> {
            __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14421);int result = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "This will replace all custom part pipelines with the current pipeline. Are you sure?",
                    null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14422);if ((((result == JOptionPane.YES_OPTION)&&(__CLR4_5_2b3rb3rlx1h5pxi.R.iget(14423)!=0|true))||(__CLR4_5_2b3rb3rlx1h5pxi.R.iget(14424)==0&false))) {{
                __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14425);UiUtils.messageBoxOnException(() -> {
                    __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14426);for (PartSettings partSettings : bottomVision.getPartSettingsByPartId()
                            .values()) {{
                        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14427);partSettings.setPipeline(bottomVision.getPipeline().clone());
                    }
                    }__CLR4_5_2b3rb3rlx1h5pxi.R.inc(14428);MessageBoxes.errorBox(getTopLevelAncestor(), "Parts Reset",
                            "All custom part pipelines have been reset.");
                });
            }
        }});
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14429);panel.add(btnResetAllTo, "8, 4");
    }finally{__CLR4_5_2b3rb3rlx1h5pxi.R.flushNeeded();}}

    private void editPipeline() throws Exception {try{__CLR4_5_2b3rb3rlx1h5pxi.R.inc(14430);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14431);CvPipeline pipeline = bottomVision.getPipeline();
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14432);pipeline.setCamera(VisionUtils.getBottomVisionCamera());
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14433);CvPipelineEditor editor = new CvPipelineEditor(pipeline);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14434);JDialog dialog = new JDialog(MainFrame.mainFrame, "Bottom Vision Pipeline");
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14435);dialog.getContentPane().setLayout(new BorderLayout());
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14436);dialog.getContentPane().add(editor);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14437);dialog.setSize(1024, 768);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14438);dialog.setVisible(true);
    }finally{__CLR4_5_2b3rb3rlx1h5pxi.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2b3rb3rlx1h5pxi.R.inc(14439);
        __CLR4_5_2b3rb3rlx1h5pxi.R.inc(14440);addWrappedBinding(bottomVision, "enabled", enabledCheckbox, "selected");
    }finally{__CLR4_5_2b3rb3rlx1h5pxi.R.flushNeeded();}}
}
