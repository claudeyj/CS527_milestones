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

package org.openpnp.machine.reference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Action;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.camera.ImageCamera;
import org.openpnp.machine.reference.camera.LtiCivilCamera;
import org.openpnp.machine.reference.camera.OpenCvCamera;
import org.openpnp.machine.reference.camera.SimulatedUpCamera;
import org.openpnp.machine.reference.camera.VfwCamera;
import org.openpnp.machine.reference.camera.Webcams;
import org.openpnp.machine.reference.driver.NullDriver;
import org.openpnp.machine.reference.feeder.ReferenceAutoFeeder;
import org.openpnp.machine.reference.feeder.ReferenceDragFeeder;
import org.openpnp.machine.reference.feeder.ReferenceStripFeeder;
import org.openpnp.machine.reference.feeder.ReferenceTrayFeeder;
import org.openpnp.machine.reference.feeder.ReferenceTubeFeeder;
import org.openpnp.machine.reference.wizards.ReferenceMachineConfigurationWizard;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.Head;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.base.AbstractMachine;
import org.openpnp.spi.base.SimplePropertySheetHolder;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferenceMachine extends AbstractMachine {public static class __CLR4_5_27hi7hilx1h8kje{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,9787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger logger = LoggerFactory.getLogger(ReferenceMachine.class);

    @Element(required = false)
    private ReferenceDriver driver = new NullDriver();

    private boolean enabled;

    private List<Class<? extends Feeder>> registeredFeederClasses = new ArrayList<>();

    public ReferenceDriver getDriver() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9702);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9703);return driver;
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    public void setDriver(ReferenceDriver driver) throws Exception {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9704);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9705);if ((((driver != this.driver)&&(__CLR4_5_27hi7hilx1h8kje.R.iget(9706)!=0|true))||(__CLR4_5_27hi7hilx1h8kje.R.iget(9707)==0&false))) {{
            __CLR4_5_27hi7hilx1h8kje.R.inc(9708);setEnabled(false);
            __CLR4_5_27hi7hilx1h8kje.R.inc(9709);close();
        }
        }__CLR4_5_27hi7hilx1h8kje.R.inc(9710);this.driver = driver;
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public boolean isEnabled() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9711);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9712);return enabled;
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9713);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9714);logger.debug("setEnabled({})", enabled);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9715);if ((((enabled)&&(__CLR4_5_27hi7hilx1h8kje.R.iget(9716)!=0|true))||(__CLR4_5_27hi7hilx1h8kje.R.iget(9717)==0&false))) {{
            __CLR4_5_27hi7hilx1h8kje.R.inc(9718);try {
                __CLR4_5_27hi7hilx1h8kje.R.inc(9719);driver.setEnabled(true);
                __CLR4_5_27hi7hilx1h8kje.R.inc(9720);this.enabled = true;
            }
            catch (Exception e) {
                __CLR4_5_27hi7hilx1h8kje.R.inc(9721);fireMachineEnableFailed(e.getMessage());
                __CLR4_5_27hi7hilx1h8kje.R.inc(9722);throw e;
            }
            __CLR4_5_27hi7hilx1h8kje.R.inc(9723);fireMachineEnabled();
        }
        }else {{
            __CLR4_5_27hi7hilx1h8kje.R.inc(9724);try {
                __CLR4_5_27hi7hilx1h8kje.R.inc(9725);driver.setEnabled(false);
                __CLR4_5_27hi7hilx1h8kje.R.inc(9726);this.enabled = false;
            }
            catch (Exception e) {
                __CLR4_5_27hi7hilx1h8kje.R.inc(9727);fireMachineDisableFailed(e.getMessage());
                __CLR4_5_27hi7hilx1h8kje.R.inc(9728);throw e;
            }
            __CLR4_5_27hi7hilx1h8kje.R.inc(9729);fireMachineDisabled("User requested stop.");
        }
    }}finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9730);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9731);return new ReferenceMachineConfigurationWizard(this);
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9732);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9733);return getClass().getSimpleName();
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9734);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9735);ArrayList<PropertySheetHolder> children = new ArrayList<>();
        __CLR4_5_27hi7hilx1h8kje.R.inc(9736);children.add(new SimplePropertySheetHolder("Feeders", getFeeders()));
        __CLR4_5_27hi7hilx1h8kje.R.inc(9737);children.add(new SimplePropertySheetHolder("Heads", getHeads()));
        __CLR4_5_27hi7hilx1h8kje.R.inc(9738);children.add(new SimplePropertySheetHolder("Cameras", getCameras()));
        __CLR4_5_27hi7hilx1h8kje.R.inc(9739);children.add(new SimplePropertySheetHolder("Actuators", getActuators()));
        __CLR4_5_27hi7hilx1h8kje.R.inc(9740);children.add(
                new SimplePropertySheetHolder("Driver", Collections.singletonList(getDriver())));
        __CLR4_5_27hi7hilx1h8kje.R.inc(9741);children.add(new SimplePropertySheetHolder("Job Processors",
                new ArrayList<>(jobProcessors.values())));
        
        __CLR4_5_27hi7hilx1h8kje.R.inc(9742);List<PropertySheetHolder> vision = new ArrayList<>();
        __CLR4_5_27hi7hilx1h8kje.R.inc(9743);vision.add(getPartAlignment());
        __CLR4_5_27hi7hilx1h8kje.R.inc(9744);vision.add(getFiducialLocator());
        __CLR4_5_27hi7hilx1h8kje.R.inc(9745);children.add(new SimplePropertySheetHolder("Vision", vision));
        __CLR4_5_27hi7hilx1h8kje.R.inc(9746);return children.toArray(new PropertySheetHolder[] {});
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9747);
        // TODO Auto-generated method stub
        __CLR4_5_27hi7hilx1h8kje.R.inc(9748);return null;
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9749);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9750);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    public void registerFeederClass(Class<? extends Feeder> cls) {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9751);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9752);registeredFeederClasses.add(cls);
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public List<Class<? extends Feeder>> getCompatibleFeederClasses() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9753);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9754);List<Class<? extends Feeder>> l = new ArrayList<>();
        __CLR4_5_27hi7hilx1h8kje.R.inc(9755);l.add(ReferenceStripFeeder.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9756);l.add(ReferenceTrayFeeder.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9757);l.add(ReferenceDragFeeder.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9758);l.add(ReferenceTubeFeeder.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9759);l.add(ReferenceAutoFeeder.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9760);l.addAll(registeredFeederClasses);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9761);return l;
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public List<Class<? extends Camera>> getCompatibleCameraClasses() {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9762);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9763);List<Class<? extends Camera>> l = new ArrayList<>();
        __CLR4_5_27hi7hilx1h8kje.R.inc(9764);l.add(Webcams.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9765);l.add(LtiCivilCamera.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9766);l.add(VfwCamera.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9767);l.add(OpenCvCamera.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9768);l.add(ImageCamera.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9769);l.add(SimulatedUpCamera.class);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9770);return l;
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public void home() throws Exception {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9771);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9772);logger.debug("home");
        __CLR4_5_27hi7hilx1h8kje.R.inc(9773);super.home();
    }finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_27hi7hilx1h8kje.R.inc(9774);
        __CLR4_5_27hi7hilx1h8kje.R.inc(9775);try {
            __CLR4_5_27hi7hilx1h8kje.R.inc(9776);driver.close();
        }
        catch (Exception e) {
            __CLR4_5_27hi7hilx1h8kje.R.inc(9777);e.printStackTrace();
        }
        __CLR4_5_27hi7hilx1h8kje.R.inc(9778);for (Camera camera : getCameras()) {{
            __CLR4_5_27hi7hilx1h8kje.R.inc(9779);try {
                __CLR4_5_27hi7hilx1h8kje.R.inc(9780);camera.close();
            }
            catch (Exception e) {
                __CLR4_5_27hi7hilx1h8kje.R.inc(9781);e.printStackTrace();
            }
        }
        }__CLR4_5_27hi7hilx1h8kje.R.inc(9782);for (Head head : getHeads()) {{
            __CLR4_5_27hi7hilx1h8kje.R.inc(9783);for (Camera camera : head.getCameras()) {{
                __CLR4_5_27hi7hilx1h8kje.R.inc(9784);try {
                    __CLR4_5_27hi7hilx1h8kje.R.inc(9785);camera.close();
                }
                catch (Exception e) {
                    __CLR4_5_27hi7hilx1h8kje.R.inc(9786);e.printStackTrace();
                }
            }
        }}
    }}finally{__CLR4_5_27hi7hilx1h8kje.R.flushNeeded();}}
}
