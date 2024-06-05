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

package org.openpnp.machine.reference.feeder;



import javax.swing.Action;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceFeeder;
import org.openpnp.machine.reference.feeder.wizards.ReferenceTrayFeederConfigurationWizard;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Implementation of Feeder that indexes based on an offset. This allows a tray of parts to be
 * picked from without moving any tape. Can handle trays of arbitrary X and Y count.
 */
public class ReferenceTrayFeeder extends ReferenceFeeder {public static class __CLR4_5_2aazaazlx1h75r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,13407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(ReferenceTrayFeeder.class);

    @Attribute
    private int trayCountX = 1;
    @Attribute
    private int trayCountY = 1;
    @Element
    private Location offsets = new Location(LengthUnit.Millimeters);
    @Attribute
    private int feedCount = 0;

    private Location pickLocation;

    @Override
    public Location getPickLocation() throws Exception {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13355);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13356);if ((((pickLocation == null)&&(__CLR4_5_2aazaazlx1h75r7.R.iget(13357)!=0|true))||(__CLR4_5_2aazaazlx1h75r7.R.iget(13358)==0&false))) {{
            __CLR4_5_2aazaazlx1h75r7.R.inc(13359);pickLocation = location;
        }
        }__CLR4_5_2aazaazlx1h75r7.R.inc(13360);logger.debug("{}.getPickLocation => {}", getName(), pickLocation);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13361);return pickLocation;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public void feed(Nozzle nozzle) throws Exception {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13362);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13363);logger.debug("{}.feed({})", getName(), nozzle);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13364);int partX, partY;

        __CLR4_5_2aazaazlx1h75r7.R.inc(13365);if ((((feedCount >= (trayCountX * trayCountY))&&(__CLR4_5_2aazaazlx1h75r7.R.iget(13366)!=0|true))||(__CLR4_5_2aazaazlx1h75r7.R.iget(13367)==0&false))) {{
            __CLR4_5_2aazaazlx1h75r7.R.inc(13368);throw new Exception(String.format("Tray empty on feeder %s.", getName()));
        }

        }__CLR4_5_2aazaazlx1h75r7.R.inc(13369);if ((((trayCountX >= trayCountY)&&(__CLR4_5_2aazaazlx1h75r7.R.iget(13370)!=0|true))||(__CLR4_5_2aazaazlx1h75r7.R.iget(13371)==0&false))) {{
            // X major axis.
            __CLR4_5_2aazaazlx1h75r7.R.inc(13372);partX = feedCount / trayCountY;
            __CLR4_5_2aazaazlx1h75r7.R.inc(13373);partY = feedCount % trayCountY;
        }
        }else {{
            // Y major axis.
            __CLR4_5_2aazaazlx1h75r7.R.inc(13374);partX = feedCount % trayCountX;
            __CLR4_5_2aazaazlx1h75r7.R.inc(13375);partY = feedCount / trayCountX;
        }

        // Multiply the offsets by the X/Y part indexes to get the total offsets
        // and then add the pickLocation to offset the final value.
        // and then add them to the location to get the final pickLocation.
        }__CLR4_5_2aazaazlx1h75r7.R.inc(13376);pickLocation = location.add(offsets.multiply(partX, partY, 0.0, 0.0));

        __CLR4_5_2aazaazlx1h75r7.R.inc(13377);logger.debug(String.format("Feeding part # %d, x %d, y %d, xPos %f, yPos %f, rPos %f",
                feedCount, partX, partY, pickLocation.getX(), pickLocation.getY(),
                pickLocation.getRotation()));

        __CLR4_5_2aazaazlx1h75r7.R.inc(13378);feedCount++;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public int getTrayCountX() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13379);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13380);return trayCountX;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public void setTrayCountX(int trayCountX) {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13381);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13382);this.trayCountX = trayCountX;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public int getTrayCountY() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13383);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13384);return trayCountY;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public void setTrayCountY(int trayCountY) {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13385);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13386);this.trayCountY = trayCountY;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public Location getOffsets() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13387);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13388);return offsets;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public void setOffsets(Location offsets) {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13389);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13390);this.offsets = offsets;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public int getFeedCount() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13391);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13392);return feedCount;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    public void setFeedCount(int feedCount) {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13393);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13394);this.feedCount = feedCount;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13395);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13396);return getName();
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13397);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13398);return new ReferenceTrayFeederConfigurationWizard(this);
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13399);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13400);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13401);
        // TODO Auto-generated method stub
        __CLR4_5_2aazaazlx1h75r7.R.inc(13402);return null;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13403);
        __CLR4_5_2aazaazlx1h75r7.R.inc(13404);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2aazaazlx1h75r7.R.inc(13405);
        // TODO Auto-generated method stub
        __CLR4_5_2aazaazlx1h75r7.R.inc(13406);return null;
    }finally{__CLR4_5_2aazaazlx1h75r7.R.flushNeeded();}}
}
