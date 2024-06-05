/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.io.File;
import java.util.prefs.Preferences;

import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.stages.ImageRead;

@SuppressWarnings("serial")
public class StandaloneEditor extends JFrame {public static class __CLR4_5_2gplgpllx1h3dge{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,21751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JTextField textField;
    private File directory;
    private CvPipelineEditor editor;
    private DefaultListModel<String> listModel;

    public StandaloneEditor() {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21657);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21658);CvPipeline pipeline = new CvPipeline();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21659);pipeline.add(new ImageRead());
        __CLR4_5_2gplgpllx1h3dge.R.inc(21660);setTitle("CvPipelineEditor");
        __CLR4_5_2gplgpllx1h3dge.R.inc(21661);setSize(1328, 1022);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21662);setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21663);getContentPane().setLayout(new BorderLayout());

        __CLR4_5_2gplgpllx1h3dge.R.inc(21664);JSplitPane splitPane = new JSplitPane();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21665);splitPane.setContinuousLayout(true);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21666);getContentPane().add(splitPane, BorderLayout.CENTER);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21667);editor = new CvPipelineEditor(pipeline);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21668);splitPane.setRightComponent(editor);

        __CLR4_5_2gplgpllx1h3dge.R.inc(21669);JPanel panel = new JPanel();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21670);splitPane.setLeftComponent(panel);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21671);panel.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gplgpllx1h3dge.R.inc(21672);JScrollPane scrollPane = new JScrollPane();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21673);panel.add(scrollPane, BorderLayout.CENTER);

        __CLR4_5_2gplgpllx1h3dge.R.inc(21674);listModel = new DefaultListModel<>();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21675);JList<String> list = new JList<>(listModel);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21676);scrollPane.setViewportView(list);

        __CLR4_5_2gplgpllx1h3dge.R.inc(21677);JPanel panel_1 = new JPanel();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21678);panel.add(panel_1, BorderLayout.NORTH);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21679);panel_1.setLayout(new BorderLayout(0, 0));

        __CLR4_5_2gplgpllx1h3dge.R.inc(21680);textField = new JTextField();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21681);panel_1.add(textField);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21682);textField.setColumns(10);

        __CLR4_5_2gplgpllx1h3dge.R.inc(21683);textField.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21684);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21685);setInputDirectory(new File(textField.getText()));
            }finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}
        });

        __CLR4_5_2gplgpllx1h3dge.R.inc(21686);JButton browseDirectoryButton = new JButton(new AbstractAction("...") {
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21687);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21688);JFileChooser j = new JFileChooser();
                __CLR4_5_2gplgpllx1h3dge.R.inc(21689);j.setSelectedFile(directory);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21690);j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21691);j.setMultiSelectionEnabled(false);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21692);if ((((j.showOpenDialog(StandaloneEditor.this) == JFileChooser.APPROVE_OPTION)&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21693)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21694)==0&false))) {{
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21695);File directory = j.getSelectedFile();
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21696);setInputDirectory(directory);
                }
            }}finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}
        });

        __CLR4_5_2gplgpllx1h3dge.R.inc(21697);panel_1.add(browseDirectoryButton, BorderLayout.EAST);

        __CLR4_5_2gplgpllx1h3dge.R.inc(21698);list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21699);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21700);if ((((e.getValueIsAdjusting())&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21701)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21702)==0&false))) {{
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21703);return;
                }
                }__CLR4_5_2gplgpllx1h3dge.R.inc(21704);String filename = list.getSelectedValue();
                __CLR4_5_2gplgpllx1h3dge.R.inc(21705);if ((((filename == null)&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21706)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21707)==0&false))) {{
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21708);return;
                }
                }__CLR4_5_2gplgpllx1h3dge.R.inc(21709);File file = new File(directory, filename);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21710);if ((((pipeline.getStages().isEmpty())&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21711)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21712)==0&false))) {{
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21713);return;
                }
                }__CLR4_5_2gplgpllx1h3dge.R.inc(21714);CvStage stage = pipeline.getStages().get(0);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21715);if ((((stage instanceof ImageRead)&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21716)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21717)==0&false))) {{
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21718);ImageRead imageRead = (ImageRead) stage;
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21719);imageRead.setFile(file);
                    __CLR4_5_2gplgpllx1h3dge.R.inc(21720);editor.process();
                }
            }}finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}
        });

        __CLR4_5_2gplgpllx1h3dge.R.inc(21721);addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21722);
                __CLR4_5_2gplgpllx1h3dge.R.inc(21723);splitPane.setDividerLocation(0.20);
            }finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}
        });


        __CLR4_5_2gplgpllx1h3dge.R.inc(21724);String defaultInputDirectoryPath =
                Preferences.userNodeForPackage(getClass()).get("inputDirectory", null);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21725);if ((((defaultInputDirectoryPath != null)&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21726)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21727)==0&false))) {{
            __CLR4_5_2gplgpllx1h3dge.R.inc(21728);File defaultInputDirectory = new File(defaultInputDirectoryPath);
            __CLR4_5_2gplgpllx1h3dge.R.inc(21729);if ((((defaultInputDirectory.exists())&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21730)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21731)==0&false))) {{
                __CLR4_5_2gplgpllx1h3dge.R.inc(21732);setInputDirectory(defaultInputDirectory);
            }
        }}

        }__CLR4_5_2gplgpllx1h3dge.R.inc(21733);setVisible(true);
    }finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}

    private void setInputDirectory(File inputDirectory) {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21734);
        __CLR4_5_2gplgpllx1h3dge.R.inc(21735);textField.setText(inputDirectory.getAbsolutePath());
        __CLR4_5_2gplgpllx1h3dge.R.inc(21736);directory = new File(textField.getText());
        __CLR4_5_2gplgpllx1h3dge.R.inc(21737);listModel.clear();
        __CLR4_5_2gplgpllx1h3dge.R.inc(21738);for (File file : directory.listFiles()) {{
            __CLR4_5_2gplgpllx1h3dge.R.inc(21739);if ((((!file.isFile())&&(__CLR4_5_2gplgpllx1h3dge.R.iget(21740)!=0|true))||(__CLR4_5_2gplgpllx1h3dge.R.iget(21741)==0&false))) {{
                __CLR4_5_2gplgpllx1h3dge.R.inc(21742);continue;
            }
            }__CLR4_5_2gplgpllx1h3dge.R.inc(21743);listModel.addElement(file.getName());
        }
        }__CLR4_5_2gplgpllx1h3dge.R.inc(21744);Preferences.userNodeForPackage(getClass()).put("inputDirectory",
                inputDirectory.getAbsolutePath());
    }finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}


    public static void main(String[] args) throws Exception {try{__CLR4_5_2gplgpllx1h3dge.R.inc(21745);
        // http://developer.apple.com/library/mac/#documentation/Java/Conceptual/Java14Development/07-NativePlatformIntegration/NativePlatformIntegration.html#//apple_ref/doc/uid/TP40001909-212952-TPXREF134
        __CLR4_5_2gplgpllx1h3dge.R.inc(21746);System.setProperty("apple.laf.useScreenMenuBar", "true");
        __CLR4_5_2gplgpllx1h3dge.R.inc(21747);try {
            __CLR4_5_2gplgpllx1h3dge.R.inc(21748);UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            __CLR4_5_2gplgpllx1h3dge.R.inc(21749);throw new Error(e);
        }
        __CLR4_5_2gplgpllx1h3dge.R.inc(21750);new StandaloneEditor();
    }finally{__CLR4_5_2gplgpllx1h3dge.R.flushNeeded();}}
}
