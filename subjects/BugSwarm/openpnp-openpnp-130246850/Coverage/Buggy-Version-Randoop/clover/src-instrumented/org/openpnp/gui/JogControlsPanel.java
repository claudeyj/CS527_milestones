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

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.Icons;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Actuator;
import org.openpnp.spi.Head;
import org.openpnp.spi.Machine;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PasteDispenser;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

/**
 * Contains controls, DROs and status for the machine. Controls: C right / left, X + / -, Y + / -, Z
 * + / -, stop, pause, slider for jog increment DROs: X, Y, Z, C Radio buttons to select mm or inch.
 * 
 * @author jason
 */
public class JogControlsPanel extends JPanel {public static class __CLR4_5_21cu1culx1h1q00{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,2062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final MachineControlsPanel machineControlsPanel;
    private final Frame frame;
    private final Configuration configuration;
    private JPanel panelActuators;
    private JPanel panelDispensers;
    private JSlider sliderIncrements;

    /**
     * Create the panel.
     */
    public JogControlsPanel(Configuration configuration, MachineControlsPanel machineControlsPanel,
            Frame frame) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1758);
        __CLR4_5_21cu1culx1h1q00.R.inc(1759);this.machineControlsPanel = machineControlsPanel;
        __CLR4_5_21cu1culx1h1q00.R.inc(1760);this.frame = frame;
        __CLR4_5_21cu1culx1h1q00.R.inc(1761);this.configuration = configuration;

        __CLR4_5_21cu1culx1h1q00.R.inc(1762);createUi();

        __CLR4_5_21cu1culx1h1q00.R.inc(1763);configuration.addListener(configurationListener);
    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1764);
        __CLR4_5_21cu1culx1h1q00.R.inc(1765);super.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1766);xPlusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1767);xMinusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1768);yPlusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1769);yMinusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1770);zPlusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1771);zMinusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1772);cPlusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1773);cMinusAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1774);discardAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1775);safezAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1776);xyZeroAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1777);zZeroAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1778);cZeroAction.setEnabled(enabled);
        __CLR4_5_21cu1culx1h1q00.R.inc(1779);for (Component c : panelActuators.getComponents()) {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1780);c.setEnabled(enabled);
        }
        }__CLR4_5_21cu1culx1h1q00.R.inc(1781);for (Component c : panelDispensers.getComponents()) {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1782);c.setEnabled(enabled);
        }
    }}finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    private void setUnits(LengthUnit units) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1783);
        __CLR4_5_21cu1culx1h1q00.R.inc(1784);if ((((units == LengthUnit.Millimeters)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1785)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1786)==0&false))) {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1787);Hashtable<Integer, JLabel> incrementsLabels = new Hashtable<>();
            __CLR4_5_21cu1culx1h1q00.R.inc(1788);incrementsLabels.put(1, new JLabel("0.01 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1789);incrementsLabels.put(2, new JLabel("0.1 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1790);incrementsLabels.put(3, new JLabel("1.0 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1791);incrementsLabels.put(4, new JLabel("10 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1792);incrementsLabels.put(5, new JLabel("100 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1793);sliderIncrements.setLabelTable(incrementsLabels);
        }
        }else {__CLR4_5_21cu1culx1h1q00.R.inc(1794);if ((((units == LengthUnit.Inches)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1795)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1796)==0&false))) {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1797);Hashtable<Integer, JLabel> incrementsLabels = new Hashtable<>();
            __CLR4_5_21cu1culx1h1q00.R.inc(1798);incrementsLabels.put(1, new JLabel("0.001 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1799);incrementsLabels.put(2, new JLabel("0.01 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1800);incrementsLabels.put(3, new JLabel("0.1 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1801);incrementsLabels.put(4, new JLabel("1.0 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1802);incrementsLabels.put(5, new JLabel("10.0 " + units.getShortName()));
            __CLR4_5_21cu1culx1h1q00.R.inc(1803);sliderIncrements.setLabelTable(incrementsLabels);
        }
        }else {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1804);throw new Error("setUnits() not implemented for " + units);
        }
        }}__CLR4_5_21cu1culx1h1q00.R.inc(1805);machineControlsPanel.updateDros();
    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    public double getJogIncrement() {try{__CLR4_5_21cu1culx1h1q00.R.inc(1806);
        __CLR4_5_21cu1culx1h1q00.R.inc(1807);if ((((configuration.getSystemUnits() == LengthUnit.Millimeters)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1808)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1809)==0&false))) {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1810);return 0.01 * Math.pow(10, sliderIncrements.getValue() - 1);
        }
        }else {__CLR4_5_21cu1culx1h1q00.R.inc(1811);if ((((configuration.getSystemUnits() == LengthUnit.Inches)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1812)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1813)==0&false))) {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1814);return 0.001 * Math.pow(10, sliderIncrements.getValue() - 1);
        }
        }else {{
            __CLR4_5_21cu1culx1h1q00.R.inc(1815);throw new Error(
                    "getJogIncrement() not implemented for " + configuration.getSystemUnits());
        }
    }}}finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    private void jog(final int x, final int y, final int z, final int c) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1816);
        __CLR4_5_21cu1culx1h1q00.R.inc(1817);UiUtils.submitUiMachineTask(() -> {
            __CLR4_5_21cu1culx1h1q00.R.inc(1818);Location l = machineControlsPanel.getSelectedNozzle().getLocation()
                    .convertToUnits(Configuration.get().getSystemUnits());
            __CLR4_5_21cu1culx1h1q00.R.inc(1819);double xPos = l.getX();
            __CLR4_5_21cu1culx1h1q00.R.inc(1820);double yPos = l.getY();
            __CLR4_5_21cu1culx1h1q00.R.inc(1821);double zPos = l.getZ();
            __CLR4_5_21cu1culx1h1q00.R.inc(1822);double cPos = l.getRotation();

            __CLR4_5_21cu1culx1h1q00.R.inc(1823);double jogIncrement =
                    new Length(getJogIncrement(), configuration.getSystemUnits()).getValue();

            __CLR4_5_21cu1culx1h1q00.R.inc(1824);if ((((x > 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1825)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1826)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1827);xPos += jogIncrement;
            }
            }else {__CLR4_5_21cu1culx1h1q00.R.inc(1828);if ((((x < 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1829)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1830)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1831);xPos -= jogIncrement;
            }

            }}__CLR4_5_21cu1culx1h1q00.R.inc(1832);if ((((y > 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1833)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1834)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1835);yPos += jogIncrement;
            }
            }else {__CLR4_5_21cu1culx1h1q00.R.inc(1836);if ((((y < 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1837)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1838)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1839);yPos -= jogIncrement;
            }

            }}__CLR4_5_21cu1culx1h1q00.R.inc(1840);if ((((z > 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1841)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1842)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1843);zPos += jogIncrement;
            }
            }else {__CLR4_5_21cu1culx1h1q00.R.inc(1844);if ((((z < 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1845)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1846)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1847);zPos -= jogIncrement;
            }

            }}__CLR4_5_21cu1culx1h1q00.R.inc(1848);if ((((c > 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1849)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1850)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1851);cPos += jogIncrement;
            }
            }else {__CLR4_5_21cu1culx1h1q00.R.inc(1852);if ((((c < 0)&&(__CLR4_5_21cu1culx1h1q00.R.iget(1853)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1854)==0&false))) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(1855);cPos -= jogIncrement;
            }

            }}__CLR4_5_21cu1culx1h1q00.R.inc(1856);machineControlsPanel.getSelectedNozzle()
                    .moveTo(new Location(l.getUnits(), xPos, yPos, zPos, cPos));
        });
    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    private void zero(boolean xy, boolean z, boolean c) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1857);
        __CLR4_5_21cu1culx1h1q00.R.inc(1858);UiUtils.submitUiMachineTask(() -> {
            __CLR4_5_21cu1culx1h1q00.R.inc(1859);Location l = machineControlsPanel.getSelectedNozzle().getLocation()
                    .convertToUnits(Configuration.get().getSystemUnits());
            __CLR4_5_21cu1culx1h1q00.R.inc(1860);l = l.derive((((xy )&&(__CLR4_5_21cu1culx1h1q00.R.iget(1861)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1862)==0&false))? 0d : null, (((xy )&&(__CLR4_5_21cu1culx1h1q00.R.iget(1863)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1864)==0&false))? 0d : null, (((z )&&(__CLR4_5_21cu1culx1h1q00.R.iget(1865)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1866)==0&false))? 0d : null, (((c )&&(__CLR4_5_21cu1culx1h1q00.R.iget(1867)!=0|true))||(__CLR4_5_21cu1culx1h1q00.R.iget(1868)==0&false))? 0d : null);
            __CLR4_5_21cu1culx1h1q00.R.inc(1869);machineControlsPanel.getSelectedNozzle().moveTo(l);
        });
    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    private void createUi() {try{__CLR4_5_21cu1culx1h1q00.R.inc(1870);
        __CLR4_5_21cu1culx1h1q00.R.inc(1871);setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        __CLR4_5_21cu1culx1h1q00.R.inc(1872);JPanel panel = new JPanel();
        __CLR4_5_21cu1culx1h1q00.R.inc(1873);add(panel);
        __CLR4_5_21cu1culx1h1q00.R.inc(1874);panel.setBorder(null);

        __CLR4_5_21cu1culx1h1q00.R.inc(1875);JPanel panelControls = new JPanel();
        __CLR4_5_21cu1culx1h1q00.R.inc(1876);panel.add(panelControls);
        __CLR4_5_21cu1culx1h1q00.R.inc(1877);panelControls.setLayout(new FormLayout(
                new ColumnSpec[] {FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
                        FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),},
                new RowSpec[] {FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
                        FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,}));

        __CLR4_5_21cu1culx1h1q00.R.inc(1878);JButton homeButton = new JButton(machineControlsPanel.homeAction);
        // We set this Icon explicitly as a WindowBuilder helper. WindowBuilder can't find the
        // homeAction referenced above so the icon doesn't render in the viewer. We set it here
        // so the dialog looks right while editing.
        __CLR4_5_21cu1culx1h1q00.R.inc(1879);homeButton.setIcon(Icons.home);
        __CLR4_5_21cu1culx1h1q00.R.inc(1880);homeButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1881);panelControls.add(homeButton, "2, 2");

        __CLR4_5_21cu1culx1h1q00.R.inc(1882);JLabel lblXy = new JLabel("X/Y");
        __CLR4_5_21cu1culx1h1q00.R.inc(1883);lblXy.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
        __CLR4_5_21cu1culx1h1q00.R.inc(1884);lblXy.setHorizontalAlignment(SwingConstants.CENTER);
        __CLR4_5_21cu1culx1h1q00.R.inc(1885);panelControls.add(lblXy, "8, 2, fill, default");

        __CLR4_5_21cu1culx1h1q00.R.inc(1886);JLabel lblZ = new JLabel("Z");
        __CLR4_5_21cu1culx1h1q00.R.inc(1887);lblZ.setHorizontalAlignment(SwingConstants.CENTER);
        __CLR4_5_21cu1culx1h1q00.R.inc(1888);lblZ.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
        __CLR4_5_21cu1culx1h1q00.R.inc(1889);panelControls.add(lblZ, "14, 2");

        __CLR4_5_21cu1culx1h1q00.R.inc(1890);JLabel lblDistance = new JLabel("Distance");
        __CLR4_5_21cu1culx1h1q00.R.inc(1891);lblDistance.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        __CLR4_5_21cu1culx1h1q00.R.inc(1892);panelControls.add(lblDistance, "18, 2, center, center");

        __CLR4_5_21cu1culx1h1q00.R.inc(1893);JLabel lblSpeed = new JLabel("Speed %");
        __CLR4_5_21cu1culx1h1q00.R.inc(1894);lblSpeed.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        __CLR4_5_21cu1culx1h1q00.R.inc(1895);panelControls.add(lblSpeed, "20, 2, center, center");

        __CLR4_5_21cu1culx1h1q00.R.inc(1896);sliderIncrements = new JSlider();
        __CLR4_5_21cu1culx1h1q00.R.inc(1897);panelControls.add(sliderIncrements, "18, 3, 1, 10");
        __CLR4_5_21cu1culx1h1q00.R.inc(1898);sliderIncrements.setOrientation(SwingConstants.VERTICAL);
        __CLR4_5_21cu1culx1h1q00.R.inc(1899);sliderIncrements.setMajorTickSpacing(1);
        __CLR4_5_21cu1culx1h1q00.R.inc(1900);sliderIncrements.setValue(1);
        __CLR4_5_21cu1culx1h1q00.R.inc(1901);sliderIncrements.setSnapToTicks(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1902);sliderIncrements.setPaintLabels(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1903);sliderIncrements.setMinimum(1);
        __CLR4_5_21cu1culx1h1q00.R.inc(1904);sliderIncrements.setMaximum(5);

        __CLR4_5_21cu1culx1h1q00.R.inc(1905);JButton yPlusButton = new JButton(yPlusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1906);yPlusButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1907);panelControls.add(yPlusButton, "8, 4");

        __CLR4_5_21cu1culx1h1q00.R.inc(1908);JButton zUpButton = new JButton(zPlusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1909);zUpButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1910);panelControls.add(zUpButton, "14, 4");

        __CLR4_5_21cu1culx1h1q00.R.inc(1911);speedSlider = new JSlider();
        __CLR4_5_21cu1culx1h1q00.R.inc(1912);speedSlider.setValue(100);
        __CLR4_5_21cu1culx1h1q00.R.inc(1913);speedSlider.setPaintTicks(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1914);speedSlider.setMinorTickSpacing(1);
        __CLR4_5_21cu1culx1h1q00.R.inc(1915);speedSlider.setMajorTickSpacing(25);
        __CLR4_5_21cu1culx1h1q00.R.inc(1916);speedSlider.setSnapToTicks(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1917);speedSlider.setPaintLabels(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1918);speedSlider.setOrientation(SwingConstants.VERTICAL);
        __CLR4_5_21cu1culx1h1q00.R.inc(1919);panelControls.add(speedSlider, "20, 4, 1, 9");
        __CLR4_5_21cu1culx1h1q00.R.inc(1920);speedSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1921);
                __CLR4_5_21cu1culx1h1q00.R.inc(1922);Configuration.get().getMachine().setSpeed(speedSlider.getValue() * 0.01);
            }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
        });

        __CLR4_5_21cu1culx1h1q00.R.inc(1923);JButton buttonStartStop = new JButton(machineControlsPanel.startStopMachineAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1924);buttonStartStop.setIcon(Icons.powerOn);
        __CLR4_5_21cu1culx1h1q00.R.inc(1925);panelControls.add(buttonStartStop, "2, 6");
        __CLR4_5_21cu1culx1h1q00.R.inc(1926);buttonStartStop.setHideActionText(true);

        __CLR4_5_21cu1culx1h1q00.R.inc(1927);JButton xMinusButton = new JButton(xMinusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1928);xMinusButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1929);panelControls.add(xMinusButton, "6, 6");

        __CLR4_5_21cu1culx1h1q00.R.inc(1930);JButton homeXyButton = new JButton(xyZeroAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1931);homeXyButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1932);panelControls.add(homeXyButton, "8, 6");

        __CLR4_5_21cu1culx1h1q00.R.inc(1933);JButton xPlusButton = new JButton(xPlusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1934);xPlusButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1935);panelControls.add(xPlusButton, "10, 6");

        __CLR4_5_21cu1culx1h1q00.R.inc(1936);JButton homeZButton = new JButton(zZeroAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1937);homeZButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1938);panelControls.add(homeZButton, "14, 6");

        __CLR4_5_21cu1culx1h1q00.R.inc(1939);JButton yMinusButton = new JButton(yMinusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1940);yMinusButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1941);panelControls.add(yMinusButton, "8, 8");

        __CLR4_5_21cu1culx1h1q00.R.inc(1942);JButton zDownButton = new JButton(zMinusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1943);zDownButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1944);panelControls.add(zDownButton, "14, 8");

        __CLR4_5_21cu1culx1h1q00.R.inc(1945);JLabel lblC = new JLabel("C");
        __CLR4_5_21cu1culx1h1q00.R.inc(1946);lblC.setHorizontalAlignment(SwingConstants.CENTER);
        __CLR4_5_21cu1culx1h1q00.R.inc(1947);lblC.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
        __CLR4_5_21cu1culx1h1q00.R.inc(1948);panelControls.add(lblC, "4, 12");

        __CLR4_5_21cu1culx1h1q00.R.inc(1949);JButton counterclockwiseButton = new JButton(cPlusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1950);counterclockwiseButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1951);panelControls.add(counterclockwiseButton, "6, 12");

        __CLR4_5_21cu1culx1h1q00.R.inc(1952);JButton homeCButton = new JButton(cZeroAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1953);homeCButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1954);panelControls.add(homeCButton, "8, 12");

        __CLR4_5_21cu1culx1h1q00.R.inc(1955);JButton clockwiseButton = new JButton(cMinusAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1956);clockwiseButton.setHideActionText(true);
        __CLR4_5_21cu1culx1h1q00.R.inc(1957);panelControls.add(clockwiseButton, "10, 12");

        __CLR4_5_21cu1culx1h1q00.R.inc(1958);JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        __CLR4_5_21cu1culx1h1q00.R.inc(1959);add(tabbedPane);

        __CLR4_5_21cu1culx1h1q00.R.inc(1960);JPanel panelSpecial = new JPanel();
        __CLR4_5_21cu1culx1h1q00.R.inc(1961);tabbedPane.addTab("Special Commands", null, panelSpecial, null);
        __CLR4_5_21cu1culx1h1q00.R.inc(1962);FlowLayout flowLayout_1 = (FlowLayout) panelSpecial.getLayout();
        __CLR4_5_21cu1culx1h1q00.R.inc(1963);flowLayout_1.setAlignment(FlowLayout.LEFT);

        __CLR4_5_21cu1culx1h1q00.R.inc(1964);panelActuators = new JPanel();
        __CLR4_5_21cu1culx1h1q00.R.inc(1965);tabbedPane.addTab("Actuators", null, panelActuators, null);
        __CLR4_5_21cu1culx1h1q00.R.inc(1966);FlowLayout fl_panelActuators = (FlowLayout) panelActuators.getLayout();
        __CLR4_5_21cu1culx1h1q00.R.inc(1967);fl_panelActuators.setAlignment(FlowLayout.LEFT);

        __CLR4_5_21cu1culx1h1q00.R.inc(1968);JButton btnSafeZ = new JButton(safezAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1969);panelSpecial.add(btnSafeZ);

        __CLR4_5_21cu1culx1h1q00.R.inc(1970);JButton btnDiscard = new JButton(discardAction);
        __CLR4_5_21cu1culx1h1q00.R.inc(1971);panelSpecial.add(btnDiscard);

        __CLR4_5_21cu1culx1h1q00.R.inc(1972);panelDispensers = new JPanel();
        __CLR4_5_21cu1culx1h1q00.R.inc(1973);FlowLayout flowLayout = (FlowLayout) panelDispensers.getLayout();
        __CLR4_5_21cu1culx1h1q00.R.inc(1974);flowLayout.setAlignment(FlowLayout.LEFT);
        __CLR4_5_21cu1culx1h1q00.R.inc(1975);tabbedPane.addTab("Paste Dispensers", null, panelDispensers, null);

        __CLR4_5_21cu1culx1h1q00.R.inc(1976);setFocusTraversalPolicy(focusPolicy);
        __CLR4_5_21cu1culx1h1q00.R.inc(1977);setFocusTraversalPolicyProvider(true);
    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    private FocusTraversalPolicy focusPolicy = new FocusTraversalPolicy() {
        @Override
        public Component getComponentAfter(Container aContainer, Component aComponent) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1978);
            __CLR4_5_21cu1culx1h1q00.R.inc(1979);return sliderIncrements;
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

        @Override
        public Component getComponentBefore(Container aContainer, Component aComponent) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1980);
            __CLR4_5_21cu1culx1h1q00.R.inc(1981);return sliderIncrements;
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

        @Override
        public Component getDefaultComponent(Container aContainer) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1982);
            __CLR4_5_21cu1culx1h1q00.R.inc(1983);return sliderIncrements;
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

        @Override
        public Component getFirstComponent(Container aContainer) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1984);
            __CLR4_5_21cu1culx1h1q00.R.inc(1985);return sliderIncrements;
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

        @Override
        public Component getInitialComponent(Window window) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1986);
            __CLR4_5_21cu1culx1h1q00.R.inc(1987);return sliderIncrements;
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

        @Override
        public Component getLastComponent(Container aContainer) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1988);
            __CLR4_5_21cu1culx1h1q00.R.inc(1989);return sliderIncrements;
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    public double getSpeed() {try{__CLR4_5_21cu1culx1h1q00.R.inc(1990);
        __CLR4_5_21cu1culx1h1q00.R.inc(1991);return speedSlider.getValue() * 0.01D;
    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}

    @SuppressWarnings("serial")
    public Action yPlusAction = new AbstractAction("Y+", Icons.arrowUp) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1992);
            __CLR4_5_21cu1culx1h1q00.R.inc(1993);jog(0, 1, 0, 0);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action yMinusAction = new AbstractAction("Y-", Icons.arrowDown) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1994);
            __CLR4_5_21cu1culx1h1q00.R.inc(1995);jog(0, -1, 0, 0);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action xPlusAction = new AbstractAction("X+", Icons.arrowRight) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1996);
            __CLR4_5_21cu1culx1h1q00.R.inc(1997);jog(1, 0, 0, 0);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action xMinusAction = new AbstractAction("X-", Icons.arrowLeft) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(1998);
            __CLR4_5_21cu1culx1h1q00.R.inc(1999);jog(-1, 0, 0, 0);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action zPlusAction = new AbstractAction("Z+", Icons.arrowUp) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2000);
            __CLR4_5_21cu1culx1h1q00.R.inc(2001);jog(0, 0, 1, 0);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action zMinusAction = new AbstractAction("Z-", Icons.arrowDown) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2002);
            __CLR4_5_21cu1culx1h1q00.R.inc(2003);jog(0, 0, -1, 0);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action cPlusAction = new AbstractAction("C+", Icons.rotateCounterclockwise) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2004);
            __CLR4_5_21cu1culx1h1q00.R.inc(2005);jog(0, 0, 0, 1);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action cMinusAction = new AbstractAction("C-", Icons.rotateClockwise) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2006);
            __CLR4_5_21cu1culx1h1q00.R.inc(2007);jog(0, 0, 0, -1);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action xyZeroAction = new AbstractAction("Zero XY", Icons.zero) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2008);
            __CLR4_5_21cu1culx1h1q00.R.inc(2009);zero(true, false, false);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action zZeroAction = new AbstractAction("Zero Z", Icons.zero) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2010);
            __CLR4_5_21cu1culx1h1q00.R.inc(2011);zero(false, true, false);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action cZeroAction = new AbstractAction("Zero C", Icons.zero) {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2012);
            __CLR4_5_21cu1culx1h1q00.R.inc(2013);zero(false, false, true);
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action safezAction = new AbstractAction("Head Safe Z") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2014);
            __CLR4_5_21cu1culx1h1q00.R.inc(2015);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_21cu1culx1h1q00.R.inc(2016);Configuration.get().getMachine().getDefaultHead().moveToSafeZ();
            });
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action discardAction = new AbstractAction("Discard") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2017);
            __CLR4_5_21cu1culx1h1q00.R.inc(2018);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_21cu1culx1h1q00.R.inc(2019);Nozzle nozzle = machineControlsPanel.getSelectedNozzle();
                // move to the discard location
                __CLR4_5_21cu1culx1h1q00.R.inc(2020);MovableUtils.moveToLocationAtSafeZ(nozzle,
                        Configuration.get().getMachine().getDiscardLocation());
                // discard the part
                __CLR4_5_21cu1culx1h1q00.R.inc(2021);nozzle.place();
                __CLR4_5_21cu1culx1h1q00.R.inc(2022);nozzle.moveToSafeZ();
            });
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action raiseIncrementAction = new AbstractAction("Raise Jog Increment") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2023);
            __CLR4_5_21cu1culx1h1q00.R.inc(2024);sliderIncrements.setValue(
                    Math.min(sliderIncrements.getMaximum(), sliderIncrements.getValue() + 1));
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    @SuppressWarnings("serial")
    public Action lowerIncrementAction = new AbstractAction("Lower Jog Increment") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2025);
            __CLR4_5_21cu1culx1h1q00.R.inc(2026);sliderIncrements.setValue(
                    Math.max(sliderIncrements.getMinimum(), sliderIncrements.getValue() - 1));
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };

    private ConfigurationListener configurationListener = new ConfigurationListener.Adapter() {
        @Override
        public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_21cu1culx1h1q00.R.inc(2027);
            __CLR4_5_21cu1culx1h1q00.R.inc(2028);setUnits(configuration.getSystemUnits());
            __CLR4_5_21cu1culx1h1q00.R.inc(2029);speedSlider.setValue((int) (configuration.getMachine().getSpeed() * 100));

            __CLR4_5_21cu1culx1h1q00.R.inc(2030);panelActuators.removeAll();

            __CLR4_5_21cu1culx1h1q00.R.inc(2031);Machine machine = Configuration.get().getMachine();

            __CLR4_5_21cu1culx1h1q00.R.inc(2032);for (Actuator actuator : machine.getActuators()) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(2033);final Actuator actuator_f = actuator;
                __CLR4_5_21cu1culx1h1q00.R.inc(2034);final JToggleButton actuatorButton = new JToggleButton(actuator_f.getName());
                __CLR4_5_21cu1culx1h1q00.R.inc(2035);actuatorButton.setFocusable(false);
                __CLR4_5_21cu1culx1h1q00.R.inc(2036);actuatorButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2037);
                        __CLR4_5_21cu1culx1h1q00.R.inc(2038);final boolean state = actuatorButton.isSelected();
                        __CLR4_5_21cu1culx1h1q00.R.inc(2039);UiUtils.submitUiMachineTask(() -> {
                            __CLR4_5_21cu1culx1h1q00.R.inc(2040);actuator_f.actuate(state);
                        });
                    }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
                });
                __CLR4_5_21cu1culx1h1q00.R.inc(2041);panelActuators.add(actuatorButton);
            }
            }__CLR4_5_21cu1culx1h1q00.R.inc(2042);for (final Head head : machine.getHeads()) {{
                __CLR4_5_21cu1culx1h1q00.R.inc(2043);for (Actuator actuator : head.getActuators()) {{
                    __CLR4_5_21cu1culx1h1q00.R.inc(2044);final Actuator actuator_f = actuator;
                    __CLR4_5_21cu1culx1h1q00.R.inc(2045);final JToggleButton actuatorButton =
                            new JToggleButton(head.getName() + ":" + actuator_f.getName());
                    __CLR4_5_21cu1culx1h1q00.R.inc(2046);actuatorButton.setFocusable(false);
                    __CLR4_5_21cu1culx1h1q00.R.inc(2047);actuatorButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2048);
                            __CLR4_5_21cu1culx1h1q00.R.inc(2049);final boolean state = actuatorButton.isSelected();
                            __CLR4_5_21cu1culx1h1q00.R.inc(2050);UiUtils.submitUiMachineTask(() -> {
                                __CLR4_5_21cu1culx1h1q00.R.inc(2051);actuator_f.actuate(state);
                            });
                        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
                    });
                    __CLR4_5_21cu1culx1h1q00.R.inc(2052);panelActuators.add(actuatorButton);
                }
                }__CLR4_5_21cu1culx1h1q00.R.inc(2053);for (final PasteDispenser dispenser : head.getPasteDispensers()) {{
                    __CLR4_5_21cu1culx1h1q00.R.inc(2054);final JButton dispenserButton =
                            new JButton(head.getName() + ":" + dispenser.getName());
                    __CLR4_5_21cu1culx1h1q00.R.inc(2055);dispenserButton.setFocusable(false);
                    __CLR4_5_21cu1culx1h1q00.R.inc(2056);dispenserButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {try{__CLR4_5_21cu1culx1h1q00.R.inc(2057);
                            __CLR4_5_21cu1culx1h1q00.R.inc(2058);UiUtils.submitUiMachineTask(() -> {
                                __CLR4_5_21cu1culx1h1q00.R.inc(2059);dispenser.dispense(null, null, 250);
                            });
                        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
                    });
                    __CLR4_5_21cu1culx1h1q00.R.inc(2060);panelDispensers.add(dispenserButton);
                }
            }}

            }__CLR4_5_21cu1culx1h1q00.R.inc(2061);setEnabled(machineControlsPanel.isEnabled());
        }finally{__CLR4_5_21cu1culx1h1q00.R.flushNeeded();}}
    };
    private JSlider speedSlider;
}
