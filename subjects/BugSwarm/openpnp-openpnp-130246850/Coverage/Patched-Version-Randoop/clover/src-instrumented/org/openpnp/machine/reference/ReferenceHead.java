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

import java.util.ArrayList;

import javax.swing.Action;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.model.Configuration;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.base.AbstractHead;
import org.openpnp.spi.base.SimplePropertySheetHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferenceHead extends AbstractHead {public static class __CLR4_5_276q76qlx1h74j8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,9343,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected final static Logger logger = LoggerFactory.getLogger(ReferenceHead.class);

    protected ReferenceMachine machine;
    protected ReferenceDriver driver;

    public ReferenceHead() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9314);
        __CLR4_5_276q76qlx1h74j8.R.inc(9315);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_276q76qlx1h74j8.R.inc(9316);
                __CLR4_5_276q76qlx1h74j8.R.inc(9317);machine = (ReferenceMachine) configuration.getMachine();
                __CLR4_5_276q76qlx1h74j8.R.inc(9318);driver = machine.getDriver();
            }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}
        });
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public void home() throws Exception {try{__CLR4_5_276q76qlx1h74j8.R.inc(9319);
        __CLR4_5_276q76qlx1h74j8.R.inc(9320);logger.debug("{}.home()", getName());
        __CLR4_5_276q76qlx1h74j8.R.inc(9321);driver.home(this);
        __CLR4_5_276q76qlx1h74j8.R.inc(9322);machine.fireMachineHeadActivity(this);
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9323);
        // This Wizard is out of date and none of it currently works.
        // return new ReferenceHeadConfigurationWizard(this);
        __CLR4_5_276q76qlx1h74j8.R.inc(9324);return null;
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9325);
        __CLR4_5_276q76qlx1h74j8.R.inc(9326);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9327);
        __CLR4_5_276q76qlx1h74j8.R.inc(9328);ArrayList<PropertySheetHolder> children = new ArrayList<>();
        __CLR4_5_276q76qlx1h74j8.R.inc(9329);children.add(new SimplePropertySheetHolder("Nozzles", getNozzles()));
        __CLR4_5_276q76qlx1h74j8.R.inc(9330);children.add(new SimplePropertySheetHolder("Cameras", getCameras()));
        __CLR4_5_276q76qlx1h74j8.R.inc(9331);children.add(new SimplePropertySheetHolder("Actuators", getActuators()));
        __CLR4_5_276q76qlx1h74j8.R.inc(9332);children.add(new SimplePropertySheetHolder("Paste Dispensers", getPasteDispensers()));
        __CLR4_5_276q76qlx1h74j8.R.inc(9333);return children.toArray(new PropertySheetHolder[] {});
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9334);
        __CLR4_5_276q76qlx1h74j8.R.inc(9335);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9336);
        // TODO Auto-generated method stub
        __CLR4_5_276q76qlx1h74j8.R.inc(9337);return null;
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public void moveToSafeZ(double speed) throws Exception {try{__CLR4_5_276q76qlx1h74j8.R.inc(9338);
        __CLR4_5_276q76qlx1h74j8.R.inc(9339);logger.debug("{}.moveToSafeZ({})", getName(), speed);
        __CLR4_5_276q76qlx1h74j8.R.inc(9340);super.moveToSafeZ(speed);
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_276q76qlx1h74j8.R.inc(9341);
        __CLR4_5_276q76qlx1h74j8.R.inc(9342);return getName();
    }finally{__CLR4_5_276q76qlx1h74j8.R.flushNeeded();}}
}
