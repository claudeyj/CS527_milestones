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
import org.openpnp.machine.reference.vision.ReferenceBottomVision;
import org.openpnp.machine.reference.vision.ReferenceBottomVision.PartSettings;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.spi.Nozzle;
import org.openpnp.util.UiUtils;
import org.openpnp.util.VisionUtils;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.ui.CvPipelineEditor;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class ReferenceBottomVisionPartConfigurationWizard extends AbstractConfigurationWizard {public static class __CLR4_5_2b54b54lx1h39t8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,14504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final ReferenceBottomVision bottomVision;
    private final Part part;
    private final PartSettings partSettings;

    private JCheckBox enabledCheckbox;
    private JCheckBox chckbxCenterAfterTest;

    public ReferenceBottomVisionPartConfigurationWizard(ReferenceBottomVision bottomVision,
            Part part) {try{__CLR4_5_2b54b54lx1h39t8.R.inc(14440);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14441);this.bottomVision = bottomVision;
        __CLR4_5_2b54b54lx1h39t8.R.inc(14442);this.part = part;
        __CLR4_5_2b54b54lx1h39t8.R.inc(14443);this.partSettings = bottomVision.getPartSettings(part);

        __CLR4_5_2b54b54lx1h39t8.R.inc(14444);JPanel panel = new JPanel();
        __CLR4_5_2b54b54lx1h39t8.R.inc(14445);panel.setBorder(new TitledBorder(null, "General", TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        __CLR4_5_2b54b54lx1h39t8.R.inc(14446);contentPanel.add(panel);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14447);panel.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("right:default"),
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_2b54b54lx1h39t8.R.inc(14448);JLabel lblEnabled = new JLabel("Enabled?");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14449);panel.add(lblEnabled, "2, 2");

        __CLR4_5_2b54b54lx1h39t8.R.inc(14450);enabledCheckbox = new JCheckBox("");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14451);panel.add(enabledCheckbox, "4, 2");

        __CLR4_5_2b54b54lx1h39t8.R.inc(14452);JButton btnTestAlighment = new JButton("Test Alignment");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14453);btnTestAlighment.addActionListener((e) -> {
            __CLR4_5_2b54b54lx1h39t8.R.inc(14454);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_2b54b54lx1h39t8.R.inc(14455);testAlignment();
            });
        });

        __CLR4_5_2b54b54lx1h39t8.R.inc(14456);JLabel lblTest = new JLabel("Test");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14457);panel.add(lblTest, "2, 4");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14458);panel.add(btnTestAlighment, "4, 4");

        __CLR4_5_2b54b54lx1h39t8.R.inc(14459);chckbxCenterAfterTest = new JCheckBox("Center After Test");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14460);chckbxCenterAfterTest.setSelected(true);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14461);panel.add(chckbxCenterAfterTest, "6, 4");

        __CLR4_5_2b54b54lx1h39t8.R.inc(14462);JLabel lblPipeline = new JLabel("Pipeline");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14463);panel.add(lblPipeline, "2, 6");

        __CLR4_5_2b54b54lx1h39t8.R.inc(14464);JButton editPipelineButton = new JButton("Edit");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14465);editPipelineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2b54b54lx1h39t8.R.inc(14466);
                __CLR4_5_2b54b54lx1h39t8.R.inc(14467);UiUtils.messageBoxOnException(() -> {
                    __CLR4_5_2b54b54lx1h39t8.R.inc(14468);editPipeline();
                });
            }finally{__CLR4_5_2b54b54lx1h39t8.R.flushNeeded();}}
        });
        __CLR4_5_2b54b54lx1h39t8.R.inc(14469);panel.add(editPipelineButton, "4, 6");

        __CLR4_5_2b54b54lx1h39t8.R.inc(14470);JButton btnLoadDefault = new JButton("Reset to Default");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14471);btnLoadDefault.addActionListener((e) -> {
            __CLR4_5_2b54b54lx1h39t8.R.inc(14472);int result = JOptionPane.showConfirmDialog(getTopLevelAncestor(),
                    "This will replace the current part pipeline with the default pipeline. Are you sure?",
                    null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            __CLR4_5_2b54b54lx1h39t8.R.inc(14473);if ((((result == JOptionPane.YES_OPTION)&&(__CLR4_5_2b54b54lx1h39t8.R.iget(14474)!=0|true))||(__CLR4_5_2b54b54lx1h39t8.R.iget(14475)==0&false))) {{
                __CLR4_5_2b54b54lx1h39t8.R.inc(14476);UiUtils.messageBoxOnException(() -> {
                    __CLR4_5_2b54b54lx1h39t8.R.inc(14477);partSettings.setPipeline(bottomVision.getPipeline().clone());
                    __CLR4_5_2b54b54lx1h39t8.R.inc(14478);editPipeline();
                });
            }
        }});
        __CLR4_5_2b54b54lx1h39t8.R.inc(14479);panel.add(btnLoadDefault, "6, 6");
    }finally{__CLR4_5_2b54b54lx1h39t8.R.flushNeeded();}}

    private void testAlignment() throws Exception {try{__CLR4_5_2b54b54lx1h39t8.R.inc(14480);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14481);Nozzle nozzle = MainFrame.machineControlsPanel.getSelectedNozzle();

        // perform the alignment
        __CLR4_5_2b54b54lx1h39t8.R.inc(14482);Location offsets = bottomVision.findOffsets(part, nozzle);

        __CLR4_5_2b54b54lx1h39t8.R.inc(14483);if ((((!chckbxCenterAfterTest.isSelected())&&(__CLR4_5_2b54b54lx1h39t8.R.iget(14484)!=0|true))||(__CLR4_5_2b54b54lx1h39t8.R.iget(14485)==0&false))) {{
            __CLR4_5_2b54b54lx1h39t8.R.inc(14486);return;
        }

        // position the part over camera center
        }__CLR4_5_2b54b54lx1h39t8.R.inc(14487);Location cameraLocation = VisionUtils.getBottomVisionCamera().getLocation();

        // Rotate the point 0,0 using the bottom offsets as a center point by the angle
        // that is
        // the difference between the bottom vision angle and the calculated global
        // placement angle.
        __CLR4_5_2b54b54lx1h39t8.R.inc(14488);Location location = new Location(LengthUnit.Millimeters).rotateXyCenterPoint(offsets,
                cameraLocation.getRotation() - offsets.getRotation());

        // Set the angle to the difference mentioned above, aligning the part to the
        // same angle as
        // the placement.
        __CLR4_5_2b54b54lx1h39t8.R.inc(14489);location = location.derive(null, null, null,
                cameraLocation.getRotation() - offsets.getRotation());

        // Add the placement final location to move our local coordinate into global
        // space
        __CLR4_5_2b54b54lx1h39t8.R.inc(14490);location = location.add(cameraLocation);

        // Subtract the bottom vision offsets to move the part to the final location,
        // instead of
        // the nozzle.
        __CLR4_5_2b54b54lx1h39t8.R.inc(14491);location = location.subtract(offsets);

        __CLR4_5_2b54b54lx1h39t8.R.inc(14492);nozzle.moveTo(location);
    }finally{__CLR4_5_2b54b54lx1h39t8.R.flushNeeded();}}

    private void editPipeline() throws Exception {try{__CLR4_5_2b54b54lx1h39t8.R.inc(14493);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14494);CvPipeline pipeline = partSettings.getPipeline();
        __CLR4_5_2b54b54lx1h39t8.R.inc(14495);pipeline.setCamera(VisionUtils.getBottomVisionCamera());
        __CLR4_5_2b54b54lx1h39t8.R.inc(14496);CvPipelineEditor editor = new CvPipelineEditor(pipeline);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14497);JDialog dialog = new JDialog(MainFrame.mainFrame, "Bottom Vision Pipeline");
        __CLR4_5_2b54b54lx1h39t8.R.inc(14498);dialog.getContentPane().setLayout(new BorderLayout());
        __CLR4_5_2b54b54lx1h39t8.R.inc(14499);dialog.getContentPane().add(editor);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14500);dialog.setSize(1024, 768);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14501);dialog.setVisible(true);
    }finally{__CLR4_5_2b54b54lx1h39t8.R.flushNeeded();}}

    @Override
    public void createBindings() {try{__CLR4_5_2b54b54lx1h39t8.R.inc(14502);
        __CLR4_5_2b54b54lx1h39t8.R.inc(14503);addWrappedBinding(partSettings, "enabled", enabledCheckbox, "selected");
    }finally{__CLR4_5_2b54b54lx1h39t8.R.flushNeeded();}}
}
