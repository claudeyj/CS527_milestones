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

package org.openpnp.gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.openpnp.gui.MainFrame;
import org.openpnp.gui.support.Helpers;
import org.openpnp.gui.support.Icons;
import org.openpnp.model.Configuration;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.spi.Actuator;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.HeadMountable;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;

/**
 * A JPanel of 4 small buttons that assist in setting locations. The buttons are Capture Camera
 * Coordinates, Capture Tool Coordinates, Move Camera to Coordinates and Move Tool to Coordinates.
 * If the actuatorId property is set, this causes the component to use the specified Actuator in
 * place of the tool.
 */
@SuppressWarnings("serial")
public class LocationButtonsPanel extends JPanel {public static class __CLR4_5_23q13q1lx1h72fc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,4951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JTextField textFieldX, textFieldY, textFieldZ, textFieldC;
    private String actuatorName;

    private JButton buttonCenterTool;
    private JButton buttonCaptureCamera;
    private JButton buttonCaptureTool;

    public LocationButtonsPanel(JTextField textFieldX, JTextField textFieldY, JTextField textFieldZ,
            JTextField textFieldC) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4825);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4826);FlowLayout flowLayout = (FlowLayout) getLayout();
        __CLR4_5_23q13q1lx1h72fc.R.inc(4827);flowLayout.setVgap(0);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4828);flowLayout.setHgap(2);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4829);this.textFieldX = textFieldX;
        __CLR4_5_23q13q1lx1h72fc.R.inc(4830);this.textFieldY = textFieldY;
        __CLR4_5_23q13q1lx1h72fc.R.inc(4831);this.textFieldZ = textFieldZ;
        __CLR4_5_23q13q1lx1h72fc.R.inc(4832);this.textFieldC = textFieldC;

        __CLR4_5_23q13q1lx1h72fc.R.inc(4833);buttonCaptureCamera = new JButton(captureCameraCoordinatesAction);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4834);buttonCaptureCamera.setHideActionText(true);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4835);add(buttonCaptureCamera);

        __CLR4_5_23q13q1lx1h72fc.R.inc(4836);buttonCaptureTool = new JButton(captureToolCoordinatesAction);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4837);buttonCaptureTool.setHideActionText(true);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4838);add(buttonCaptureTool);

        __CLR4_5_23q13q1lx1h72fc.R.inc(4839);JButton buttonCenterCamera = new JButton(positionCameraAction);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4840);buttonCenterCamera.setHideActionText(true);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4841);add(buttonCenterCamera);

        __CLR4_5_23q13q1lx1h72fc.R.inc(4842);buttonCenterTool = new JButton(positionToolAction);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4843);buttonCenterTool.setHideActionText(true);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4844);add(buttonCenterTool);

        __CLR4_5_23q13q1lx1h72fc.R.inc(4845);buttonCenterToolNoSafeZ = new JButton(positionToolNoSafeZAction);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4846);buttonCenterToolNoSafeZ.setHideActionText(true);

        __CLR4_5_23q13q1lx1h72fc.R.inc(4847);setActuatorName(null);
    }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    public void setShowPositionToolNoSafeZ(boolean b) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4848);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4849);if ((((b)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4850)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4851)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4852);add(buttonCenterToolNoSafeZ);
        }
        }else {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4853);remove(buttonCenterToolNoSafeZ);
        }
    }}finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    public void setActuatorName(String actuatorName) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4854);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4855);this.actuatorName = actuatorName;
        __CLR4_5_23q13q1lx1h72fc.R.inc(4856);if ((((actuatorName == null || actuatorName.trim().length() == 0)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4857)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4858)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4859);buttonCaptureTool.setAction(captureToolCoordinatesAction);
            __CLR4_5_23q13q1lx1h72fc.R.inc(4860);buttonCenterTool.setAction(positionToolAction);
        }
        }else {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4861);buttonCaptureTool.setAction(captureActuatorCoordinatesAction);
            __CLR4_5_23q13q1lx1h72fc.R.inc(4862);buttonCenterTool.setAction(positionActuatorAction);
        }
    }}finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    public String getActuatorName() {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4863);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4864);return actuatorName;
    }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    public HeadMountable getTool() throws Exception {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4865);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4866);return MainFrame.machineControlsPanel.getSelectedNozzle();
    }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    public Camera getCamera() throws Exception {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4867);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4868);return getTool().getHead().getDefaultCamera();
    }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    /**
     * Get the Actuator with the name provided by setActuatorName() that is on the same Head as the
     * tool from getTool().
     * 
     * @return
     * @throws Exception
     */
    public Actuator getActuator() throws Exception {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4869);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4870);if ((((actuatorName == null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4871)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4872)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4873);return null;
        }
        }__CLR4_5_23q13q1lx1h72fc.R.inc(4874);HeadMountable tool = getTool();
        __CLR4_5_23q13q1lx1h72fc.R.inc(4875);Head head = tool.getHead();
        __CLR4_5_23q13q1lx1h72fc.R.inc(4876);Actuator actuator = head.getActuator(actuatorName);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4877);if ((((actuator == null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4878)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4879)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4880);throw new Exception(String.format("No Actuator with name %s on Head %s", actuatorName,
                    head.getName()));
        }
        }__CLR4_5_23q13q1lx1h72fc.R.inc(4881);return actuator;
    }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    private Location getParsedLocation() {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4882);
        __CLR4_5_23q13q1lx1h72fc.R.inc(4883);double x = 0, y = 0, z = 0, rotation = 0;
        __CLR4_5_23q13q1lx1h72fc.R.inc(4884);if ((((textFieldX != null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4885)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4886)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4887);x = Length.parse(textFieldX.getText()).getValue();
        }
        }__CLR4_5_23q13q1lx1h72fc.R.inc(4888);if ((((textFieldY != null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4889)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4890)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4891);y = Length.parse(textFieldY.getText()).getValue();
        }
        }__CLR4_5_23q13q1lx1h72fc.R.inc(4892);if ((((textFieldZ != null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4893)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4894)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4895);z = Length.parse(textFieldZ.getText()).getValue();
        }
        }__CLR4_5_23q13q1lx1h72fc.R.inc(4896);if ((((textFieldC != null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4897)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4898)==0&false))) {{
            __CLR4_5_23q13q1lx1h72fc.R.inc(4899);rotation = Double.parseDouble(textFieldC.getText());
        }
        }__CLR4_5_23q13q1lx1h72fc.R.inc(4900);return new Location(Configuration.get().getSystemUnits(), x, y, z, rotation);
    }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

    private Action captureCameraCoordinatesAction =
            new AbstractAction("Get Camera Coordinates", Icons.captureCamera) {
                {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4901);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4902);putValue(Action.SHORT_DESCRIPTION,
                            "Capture the location that the camera is centered on.");
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4903);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4904);UiUtils.messageBoxOnException(() -> {
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4905);Location l = getCamera().getLocation();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4906);Helpers.copyLocationIntoTextFields(l, textFieldX, textFieldY, null,
                                textFieldC);
                    });
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
            };

    private Action captureToolCoordinatesAction =
            new AbstractAction("Get Tool Coordinates", Icons.captureTool) {
                {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4907);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4908);putValue(Action.SHORT_DESCRIPTION,
                            "Capture the location that the tool is centered on.");
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4909);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4910);UiUtils.messageBoxOnException(() -> {
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4911);Location l = getTool().getLocation();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4912);Helpers.copyLocationIntoTextFields(l, textFieldX, textFieldY, textFieldZ,
                                textFieldC);
                    });
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
            };

    private Action captureActuatorCoordinatesAction =
            new AbstractAction("Get Actuator Coordinates", Icons.capturePin) {
                {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4913);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4914);putValue(Action.SHORT_DESCRIPTION,
                            "Capture the location that the actuator is centered on.");
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4915);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4916);UiUtils.messageBoxOnException(() -> {
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4917);Actuator actuator = getActuator();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4918);if ((((actuator == null)&&(__CLR4_5_23q13q1lx1h72fc.R.iget(4919)!=0|true))||(__CLR4_5_23q13q1lx1h72fc.R.iget(4920)==0&false))) {{
                            __CLR4_5_23q13q1lx1h72fc.R.inc(4921);return;
                        }
                        }__CLR4_5_23q13q1lx1h72fc.R.inc(4922);Helpers.copyLocationIntoTextFields(actuator.getLocation(), textFieldX,
                                textFieldY, textFieldZ, textFieldC);
                    });

                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
            };

    private Action positionCameraAction =
            new AbstractAction("Position Camera", Icons.centerCamera) {
                {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4923);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4924);putValue(Action.SHORT_DESCRIPTION,
                            "Position the camera over the center of the location.");
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4925);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4926);UiUtils.submitUiMachineTask(() -> {
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4927);Camera camera = getCamera();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4928);Location location = getParsedLocation();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4929);MovableUtils.moveToLocationAtSafeZ(camera, location);
                    });
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
            };

    private Action positionToolAction = new AbstractAction("Position Tool", Icons.centerTool) {
        {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4930);
            __CLR4_5_23q13q1lx1h72fc.R.inc(4931);putValue(Action.SHORT_DESCRIPTION,
                    "Position the tool over the center of the location.");
        }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4932);
            __CLR4_5_23q13q1lx1h72fc.R.inc(4933);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_23q13q1lx1h72fc.R.inc(4934);HeadMountable tool = getTool();
                __CLR4_5_23q13q1lx1h72fc.R.inc(4935);Location location = getParsedLocation();
                __CLR4_5_23q13q1lx1h72fc.R.inc(4936);MovableUtils.moveToLocationAtSafeZ(tool, location);
            });
        }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
    };

    private Action positionToolNoSafeZAction =
            new AbstractAction("Position Tool (Without Safe Z)", Icons.centerToolNoSafeZ) {
                {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4937);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4938);putValue(Action.SHORT_DESCRIPTION,
                            "Position the tool over the center of the location without first moving to Safe Z.");
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4939);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4940);UiUtils.submitUiMachineTask(() -> {
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4941);HeadMountable tool = getTool();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4942);Location location = getParsedLocation();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4943);tool.moveTo(location);
                    });
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
            };

    private Action positionActuatorAction =
            new AbstractAction("Position Actuator", Icons.centerPin) {
                {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4944);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4945);putValue(Action.SHORT_DESCRIPTION,
                            "Position the actuator over the center of the location.");
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}

                @Override
                public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_23q13q1lx1h72fc.R.inc(4946);
                    __CLR4_5_23q13q1lx1h72fc.R.inc(4947);UiUtils.submitUiMachineTask(() -> {
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4948);Actuator actuator = getActuator();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4949);Location location = getParsedLocation();
                        __CLR4_5_23q13q1lx1h72fc.R.inc(4950);MovableUtils.moveToLocationAtSafeZ(actuator, location);
                    });
                }finally{__CLR4_5_23q13q1lx1h72fc.R.flushNeeded();}}
            };
    private JButton buttonCenterToolNoSafeZ;
}
