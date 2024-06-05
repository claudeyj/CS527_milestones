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

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.components.CameraPanel;
import org.openpnp.gui.support.Icons;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.gui.support.NozzleItem;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.HeadMountable;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.Machine;
import org.openpnp.spi.MachineListener;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PasteDispenser;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class MachineControlsPanel extends JPanel {public static class __CLR4_5_21la1lalx1h5jb0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,2355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final JFrame frame;
    private final CameraPanel cameraPanel;
    private final Configuration configuration;

    private Nozzle selectedNozzle;

    private JTextField textFieldX;
    private JTextField textFieldY;
    private JTextField textFieldC;
    private JTextField textFieldZ;
    private JComboBox comboBoxNozzles;


    private Color startColor = Color.green;
    private Color stopColor = new Color(178, 34, 34);
    private Color droNormalColor = new Color(0xBDFFBE);
    private Color droEditingColor = new Color(0xF0F0A1);
    private Color droWarningColor = new Color(0xFF5C5C);
    private Color droSavedColor = new Color(0x90cce0);

    private JogControlsPanel jogControlsPanel;

    private volatile double savedX = Double.NaN, savedY = Double.NaN, savedZ = Double.NaN,
            savedC = Double.NaN;

    /**
     * Create the panel.
     */
    public MachineControlsPanel(Configuration configuration, JFrame frame,
            CameraPanel cameraPanel) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2062);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2063);this.frame = frame;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2064);this.cameraPanel = cameraPanel;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2065);this.configuration = configuration;

        __CLR4_5_21la1lalx1h5jb0.R.inc(2066);jogControlsPanel = new JogControlsPanel(configuration, this, frame);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2067);createUi();

        __CLR4_5_21la1lalx1h5jb0.R.inc(2068);configuration.addListener(configurationListener);
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public void setSelectedNozzle(Nozzle nozzle) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2069);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2070);selectedNozzle = nozzle;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2071);comboBoxNozzles.setSelectedItem(selectedNozzle);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2072);updateDros();
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public Nozzle getSelectedNozzle() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2073);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2074);return selectedNozzle;
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public PasteDispenser getSelectedPasteDispenser() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2075);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2076);try {
            // TODO: We don't actually have a way to select a dispenser yet, so
            // until we do we just return the first one.
            __CLR4_5_21la1lalx1h5jb0.R.inc(2077);return Configuration.get().getMachine().getDefaultHead().getDefaultPasteDispenser();
        }
        catch (Exception e) {
            __CLR4_5_21la1lalx1h5jb0.R.inc(2078);return null;
        }
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    /**
     * Returns the selected Nozzle or PasteDispenser depending on which type of Job is selected.
     * 
     * @return
     */
    public HeadMountable getSelectedTool() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2079);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2080);JobProcessor.Type jobProcessorType = MainFrame.jobPanel.getSelectedJobProcessorType();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2081);if ((((jobProcessorType == JobProcessor.Type.PickAndPlace)&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2082)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2083)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2084);return getSelectedNozzle();
        }
        }else {__CLR4_5_21la1lalx1h5jb0.R.inc(2085);if ((((jobProcessorType == JobProcessor.Type.SolderPaste)&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2086)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2087)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2088);return getSelectedPasteDispenser();
        }
        }else {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2089);throw new Error("Unknown tool type: " + jobProcessorType);
        }
    }}}finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public JogControlsPanel getJogControlsPanel() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2090);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2091);return jogControlsPanel;
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2092);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2093);super.setEnabled(enabled);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2094);homeAction.setEnabled(enabled);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2095);jogControlsPanel.setEnabled(enabled);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2096);targetCameraAction.setEnabled(enabled);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2097);targetToolAction.setEnabled(enabled);
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public Location getCurrentLocation() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2098);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2099);if ((((selectedNozzle == null)&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2100)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2101)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2102);return null;
        }

        }__CLR4_5_21la1lalx1h5jb0.R.inc(2103);Location l = selectedNozzle.getLocation();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2104);l = l.convertToUnits(configuration.getSystemUnits());

        __CLR4_5_21la1lalx1h5jb0.R.inc(2105);return l;
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public void updateDros() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2106);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2107);Location l = getCurrentLocation();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2108);if ((((l == null)&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2109)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2110)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2111);return;
        }

        }__CLR4_5_21la1lalx1h5jb0.R.inc(2112);double x, y, z, c;

        __CLR4_5_21la1lalx1h5jb0.R.inc(2113);x = l.getX();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2114);y = l.getY();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2115);z = l.getZ();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2116);c = l.getRotation();

        __CLR4_5_21la1lalx1h5jb0.R.inc(2117);double savedX = this.savedX;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2118);if ((((!Double.isNaN(savedX))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2119)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2120)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2121);x -= savedX;
        }

        }__CLR4_5_21la1lalx1h5jb0.R.inc(2122);double savedY = this.savedY;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2123);if ((((!Double.isNaN(savedY))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2124)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2125)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2126);y -= savedY;
        }

        }__CLR4_5_21la1lalx1h5jb0.R.inc(2127);double savedZ = this.savedZ;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2128);if ((((!Double.isNaN(savedZ))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2129)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2130)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2131);z -= savedZ;
        }

        }__CLR4_5_21la1lalx1h5jb0.R.inc(2132);double savedC = this.savedC;
        __CLR4_5_21la1lalx1h5jb0.R.inc(2133);if ((((!Double.isNaN(savedC))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2134)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2135)==0&false))) {{
            __CLR4_5_21la1lalx1h5jb0.R.inc(2136);c -= savedC;
        }

        }__CLR4_5_21la1lalx1h5jb0.R.inc(2137);textFieldX.setText(String.format(Locale.US, configuration.getLengthDisplayFormat(), x));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2138);textFieldY.setText(String.format(Locale.US, configuration.getLengthDisplayFormat(), y));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2139);textFieldZ.setText(String.format(Locale.US, configuration.getLengthDisplayFormat(), z));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2140);textFieldC.setText(String.format(Locale.US, configuration.getLengthDisplayFormat(), c));
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    private void createUi() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2141);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2142);setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        __CLR4_5_21la1lalx1h5jb0.R.inc(2143);ButtonGroup buttonGroup = new ButtonGroup();

        __CLR4_5_21la1lalx1h5jb0.R.inc(2144);JPanel panel = new JPanel();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2145);add(panel);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2146);panel.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC,
                        ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_21la1lalx1h5jb0.R.inc(2147);comboBoxNozzles = new JComboBox();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2148);comboBoxNozzles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2149);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2150);setSelectedNozzle(((NozzleItem) comboBoxNozzles.getSelectedItem()).getNozzle());
            }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
        });
        __CLR4_5_21la1lalx1h5jb0.R.inc(2151);panel.add(comboBoxNozzles, "2, 2, fill, default");

        __CLR4_5_21la1lalx1h5jb0.R.inc(2152);JPanel panelDrosParent = new JPanel();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2153);add(panelDrosParent);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2154);panelDrosParent.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        __CLR4_5_21la1lalx1h5jb0.R.inc(2155);JPanel panelDros = new JPanel();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2156);panelDrosParent.add(panelDros);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2157);panelDros.setLayout(new BoxLayout(panelDros, BoxLayout.Y_AXIS));

        __CLR4_5_21la1lalx1h5jb0.R.inc(2158);JPanel panelDrosFirstLine = new JPanel();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2159);panelDros.add(panelDrosFirstLine);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2160);panelDrosFirstLine.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        __CLR4_5_21la1lalx1h5jb0.R.inc(2161);JLabel lblX = new JLabel("X");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2162);lblX.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2163);panelDrosFirstLine.add(lblX);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2164);textFieldX = new JTextField();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2165);textFieldX.setEditable(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2166);textFieldX.setFocusTraversalKeysEnabled(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2167);textFieldX.setSelectionColor(droEditingColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2168);textFieldX.setDisabledTextColor(Color.BLACK);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2169);textFieldX.setBackground(droNormalColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2170);textFieldX.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2171);textFieldX.setText("0000.0000");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2172);textFieldX.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2173);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2174);if ((((SwingUtilities.isRightMouseButton(e))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2175)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2176)==0&false))) {{
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2177);savedX = Double.NaN;
                }
                }__CLR4_5_21la1lalx1h5jb0.R.inc(2178);saveXAction.actionPerformed(null);
            }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
        });
        __CLR4_5_21la1lalx1h5jb0.R.inc(2179);panelDrosFirstLine.add(textFieldX);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2180);textFieldX.setColumns(6);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2181);Component horizontalStrut = Box.createHorizontalStrut(15);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2182);panelDrosFirstLine.add(horizontalStrut);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2183);JLabel lblY = new JLabel("Y");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2184);lblY.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2185);panelDrosFirstLine.add(lblY);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2186);textFieldY = new JTextField();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2187);textFieldY.setEditable(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2188);textFieldY.setFocusTraversalKeysEnabled(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2189);textFieldY.setSelectionColor(droEditingColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2190);textFieldY.setDisabledTextColor(Color.BLACK);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2191);textFieldY.setBackground(droNormalColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2192);textFieldY.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2193);textFieldY.setText("0000.0000");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2194);textFieldY.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2195);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2196);if ((((SwingUtilities.isRightMouseButton(e))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2197)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2198)==0&false))) {{
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2199);savedY = Double.NaN;
                }
                }__CLR4_5_21la1lalx1h5jb0.R.inc(2200);saveYAction.actionPerformed(null);
            }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
        });
        __CLR4_5_21la1lalx1h5jb0.R.inc(2201);panelDrosFirstLine.add(textFieldY);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2202);textFieldY.setColumns(6);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2203);JButton btnTargetTool = new JButton(targetToolAction);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2204);panelDrosFirstLine.add(btnTargetTool);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2205);btnTargetTool.setToolTipText("Position the tool at the camera's current location.");

        __CLR4_5_21la1lalx1h5jb0.R.inc(2206);JPanel panelDrosSecondLine = new JPanel();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2207);panelDros.add(panelDrosSecondLine);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2208);panelDrosSecondLine.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        __CLR4_5_21la1lalx1h5jb0.R.inc(2209);JLabel lblC = new JLabel("C");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2210);lblC.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2211);panelDrosSecondLine.add(lblC);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2212);textFieldC = new JTextField();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2213);textFieldC.setEditable(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2214);textFieldC.setFocusTraversalKeysEnabled(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2215);textFieldC.setSelectionColor(droEditingColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2216);textFieldC.setDisabledTextColor(Color.BLACK);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2217);textFieldC.setBackground(droNormalColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2218);textFieldC.setText("0000.0000");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2219);textFieldC.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2220);textFieldC.setColumns(6);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2221);textFieldC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2222);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2223);if ((((SwingUtilities.isRightMouseButton(e))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2224)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2225)==0&false))) {{
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2226);savedC = Double.NaN;
                }
                }__CLR4_5_21la1lalx1h5jb0.R.inc(2227);saveCAction.actionPerformed(null);
            }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
        });
        __CLR4_5_21la1lalx1h5jb0.R.inc(2228);panelDrosSecondLine.add(textFieldC);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2229);Component horizontalStrut_1 = Box.createHorizontalStrut(15);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2230);panelDrosSecondLine.add(horizontalStrut_1);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2231);JLabel lblZ = new JLabel("Z");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2232);lblZ.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2233);panelDrosSecondLine.add(lblZ);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2234);textFieldZ = new JTextField();
        __CLR4_5_21la1lalx1h5jb0.R.inc(2235);textFieldZ.setEditable(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2236);textFieldZ.setFocusTraversalKeysEnabled(false);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2237);textFieldZ.setSelectionColor(droEditingColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2238);textFieldZ.setDisabledTextColor(Color.BLACK);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2239);textFieldZ.setBackground(droNormalColor);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2240);textFieldZ.setText("0000.0000");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2241);textFieldZ.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        __CLR4_5_21la1lalx1h5jb0.R.inc(2242);textFieldZ.setColumns(6);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2243);textFieldZ.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2244);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2245);if ((((SwingUtilities.isRightMouseButton(e))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2246)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2247)==0&false))) {{
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2248);savedZ = Double.NaN;
                }
                }__CLR4_5_21la1lalx1h5jb0.R.inc(2249);saveZAction.actionPerformed(null);
            }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
        });
        __CLR4_5_21la1lalx1h5jb0.R.inc(2250);panelDrosSecondLine.add(textFieldZ);

        __CLR4_5_21la1lalx1h5jb0.R.inc(2251);JButton btnTargetCamera = new JButton(targetCameraAction);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2252);panelDrosSecondLine.add(btnTargetCamera);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2253);btnTargetCamera.setToolTipText("Position the camera at the tool's current location.");

        __CLR4_5_21la1lalx1h5jb0.R.inc(2254);add(jogControlsPanel);
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    public Action startStopMachineAction = new AbstractAction("Stop", Icons.powerOn) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2255);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2256);setEnabled(false);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2257);new Thread(() -> {
                __CLR4_5_21la1lalx1h5jb0.R.inc(2258);Machine machine = Configuration.get().getMachine();
                __CLR4_5_21la1lalx1h5jb0.R.inc(2259);boolean enable = !machine.isEnabled();
                __CLR4_5_21la1lalx1h5jb0.R.inc(2260);try {
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2261);Configuration.get().getMachine().setEnabled(enable);
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2262);setEnabled(true);
                }
                catch (Exception t) {
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2263);MessageBoxes.errorBox(MachineControlsPanel.this, "Enable Failure",
                            t.getMessage());
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2264);setEnabled(true);
                }
            }).start();
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action homeAction = new AbstractAction("Home", Icons.home) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2265);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2266);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_21la1lalx1h5jb0.R.inc(2267);selectedNozzle.getHead().home();
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action targetToolAction = new AbstractAction(null, Icons.centerTool) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2268);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2269);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_21la1lalx1h5jb0.R.inc(2270);HeadMountable tool = getSelectedTool();
                __CLR4_5_21la1lalx1h5jb0.R.inc(2271);Camera camera = tool.getHead().getDefaultCamera();
                __CLR4_5_21la1lalx1h5jb0.R.inc(2272);MovableUtils.moveToLocationAtSafeZ(tool, camera.getLocation());
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action targetCameraAction = new AbstractAction(null, Icons.centerCamera) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2273);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2274);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_21la1lalx1h5jb0.R.inc(2275);HeadMountable tool = getSelectedTool();
                __CLR4_5_21la1lalx1h5jb0.R.inc(2276);Camera camera = tool.getHead().getDefaultCamera();
                __CLR4_5_21la1lalx1h5jb0.R.inc(2277);MovableUtils.moveToLocationAtSafeZ(camera, tool.getLocation());
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action saveXAction = new AbstractAction(null) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2278);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2279);if ((((Double.isNaN(savedX))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2280)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2281)==0&false))) {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2282);textFieldX.setBackground(droSavedColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2283);savedX = getCurrentLocation().getX();
            }
            }else {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2284);textFieldX.setBackground(droNormalColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2285);savedX = Double.NaN;
            }
            }__CLR4_5_21la1lalx1h5jb0.R.inc(2286);EventQueue.invokeLater(new Runnable() {
                public void run() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2287);
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2288);updateDros();
                }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action saveYAction = new AbstractAction(null) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2289);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2290);if ((((Double.isNaN(savedY))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2291)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2292)==0&false))) {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2293);textFieldY.setBackground(droSavedColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2294);savedY = getCurrentLocation().getY();
            }
            }else {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2295);textFieldY.setBackground(droNormalColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2296);savedY = Double.NaN;
            }
            }__CLR4_5_21la1lalx1h5jb0.R.inc(2297);EventQueue.invokeLater(new Runnable() {
                public void run() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2298);
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2299);updateDros();
                }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action saveZAction = new AbstractAction(null) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2300);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2301);if ((((Double.isNaN(savedZ))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2302)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2303)==0&false))) {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2304);textFieldZ.setBackground(droSavedColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2305);savedZ = getCurrentLocation().getZ();
            }
            }else {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2306);textFieldZ.setBackground(droNormalColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2307);savedZ = Double.NaN;
            }
            }__CLR4_5_21la1lalx1h5jb0.R.inc(2308);EventQueue.invokeLater(new Runnable() {
                public void run() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2309);
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2310);updateDros();
                }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action saveCAction = new AbstractAction(null) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2311);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2312);if ((((Double.isNaN(savedC))&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2313)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2314)==0&false))) {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2315);textFieldC.setBackground(droSavedColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2316);savedC = getCurrentLocation().getRotation();
            }
            }else {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2317);textFieldC.setBackground(droNormalColor);
                __CLR4_5_21la1lalx1h5jb0.R.inc(2318);savedC = Double.NaN;
            }
            }__CLR4_5_21la1lalx1h5jb0.R.inc(2319);EventQueue.invokeLater(new Runnable() {
                public void run() {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2320);
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2321);updateDros();
                }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
            });
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    private void updateStartStopButton(boolean enabled) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2322);
        __CLR4_5_21la1lalx1h5jb0.R.inc(2323);startStopMachineAction.putValue(Action.NAME, (((enabled )&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2324)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2325)==0&false))? "Stop" : "Start");
        __CLR4_5_21la1lalx1h5jb0.R.inc(2326);startStopMachineAction.putValue(Action.SMALL_ICON,
                (((enabled )&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2327)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2328)==0&false))? Icons.powerOff : Icons.powerOn);
    }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

    private MachineListener machineListener = new MachineListener.Adapter() {
        @Override
        public void machineHeadActivity(Machine machine, Head head) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2329);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2330);EventQueue.invokeLater(() -> updateDros());
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

        @Override
        public void machineEnabled(Machine machine) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2331);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2332);updateStartStopButton(machine.isEnabled());
            __CLR4_5_21la1lalx1h5jb0.R.inc(2333);setEnabled(true);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2334);EventQueue.invokeLater(() -> updateDros());
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

        @Override
        public void machineEnableFailed(Machine machine, String reason) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2335);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2336);updateStartStopButton(machine.isEnabled());
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

        @Override
        public void machineDisabled(Machine machine, String reason) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2337);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2338);updateStartStopButton(machine.isEnabled());
            __CLR4_5_21la1lalx1h5jb0.R.inc(2339);setEnabled(false);
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}

        @Override
        public void machineDisableFailed(Machine machine, String reason) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2340);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2341);updateStartStopButton(machine.isEnabled());
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };

    private ConfigurationListener configurationListener = new ConfigurationListener.Adapter() {
        @Override
        public void configurationComplete(Configuration configuration) {try{__CLR4_5_21la1lalx1h5jb0.R.inc(2342);
            __CLR4_5_21la1lalx1h5jb0.R.inc(2343);Machine machine = configuration.getMachine();
            __CLR4_5_21la1lalx1h5jb0.R.inc(2344);if ((((machine != null)&&(__CLR4_5_21la1lalx1h5jb0.R.iget(2345)!=0|true))||(__CLR4_5_21la1lalx1h5jb0.R.iget(2346)==0&false))) {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2347);machine.removeListener(machineListener);
            }

            }__CLR4_5_21la1lalx1h5jb0.R.inc(2348);for (Head head : machine.getHeads()) {{
                __CLR4_5_21la1lalx1h5jb0.R.inc(2349);for (Nozzle nozzle : head.getNozzles()) {{
                    __CLR4_5_21la1lalx1h5jb0.R.inc(2350);comboBoxNozzles.addItem(new NozzleItem(nozzle));
                }
            }}
            }__CLR4_5_21la1lalx1h5jb0.R.inc(2351);setSelectedNozzle(((NozzleItem) comboBoxNozzles.getItemAt(0)).getNozzle());

            __CLR4_5_21la1lalx1h5jb0.R.inc(2352);machine.addListener(machineListener);

            __CLR4_5_21la1lalx1h5jb0.R.inc(2353);updateStartStopButton(machine.isEnabled());

            __CLR4_5_21la1lalx1h5jb0.R.inc(2354);setEnabled(machine.isEnabled());
        }finally{__CLR4_5_21la1lalx1h5jb0.R.flushNeeded();}}
    };
}
