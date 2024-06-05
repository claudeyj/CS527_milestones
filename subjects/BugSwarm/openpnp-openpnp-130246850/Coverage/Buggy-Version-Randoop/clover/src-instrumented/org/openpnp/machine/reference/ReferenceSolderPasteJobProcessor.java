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

import org.openpnp.gui.support.Wizard;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.BoardPad;
import org.openpnp.model.Configuration;
import org.openpnp.model.Location;
import org.openpnp.spi.Head;
import org.openpnp.spi.Machine;
import org.openpnp.spi.PasteDispenser;
import org.openpnp.spi.base.AbstractJobProcessor;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.Utils2D;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferenceSolderPasteJobProcessor extends AbstractJobProcessor {public static class __CLR4_5_27tn7tnlx1h1unr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,10189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger =
            LoggerFactory.getLogger(ReferenceSolderPasteJobProcessor.class);

    @Attribute(required = false)
    private String dummy;

    public ReferenceSolderPasteJobProcessor() {try{__CLR4_5_27tn7tnlx1h1unr.R.inc(10139);}finally{__CLR4_5_27tn7tnlx1h1unr.R.flushNeeded();}}

    @Override
    public void run() {try{__CLR4_5_27tn7tnlx1h1unr.R.inc(10140);
        __CLR4_5_27tn7tnlx1h1unr.R.inc(10141);state = JobState.Running;
        __CLR4_5_27tn7tnlx1h1unr.R.inc(10142);fireJobStateChanged();

        __CLR4_5_27tn7tnlx1h1unr.R.inc(10143);Machine machine = Configuration.get().getMachine();

        __CLR4_5_27tn7tnlx1h1unr.R.inc(10144);for (Head head : machine.getHeads()) {{
            __CLR4_5_27tn7tnlx1h1unr.R.inc(10145);fireDetailedStatusUpdated(String.format("Move head %s to Safe-Z.", head.getName()));

            __CLR4_5_27tn7tnlx1h1unr.R.inc(10146);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_27tn7tnlx1h1unr.R.iget(10147)!=0|true))||(__CLR4_5_27tn7tnlx1h1unr.R.iget(10148)==0&false))) {{
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10149);return;
            }

            }__CLR4_5_27tn7tnlx1h1unr.R.inc(10150);try {
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10151);head.moveToSafeZ();
            }
            catch (Exception e) {
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10152);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10153);return;
            }
        }

        }__CLR4_5_27tn7tnlx1h1unr.R.inc(10154);Head head = machine.getHeads().get(0);
        __CLR4_5_27tn7tnlx1h1unr.R.inc(10155);PasteDispenser dispenser = head.getPasteDispensers().get(0);

        __CLR4_5_27tn7tnlx1h1unr.R.inc(10156);for (BoardLocation boardLocation : job.getBoardLocations()) {{
            __CLR4_5_27tn7tnlx1h1unr.R.inc(10157);if ((((!boardLocation.isEnabled())&&(__CLR4_5_27tn7tnlx1h1unr.R.iget(10158)!=0|true))||(__CLR4_5_27tn7tnlx1h1unr.R.iget(10159)==0&false))) {{
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10160);continue;
            }
            }__CLR4_5_27tn7tnlx1h1unr.R.inc(10161);for (BoardPad pad : boardLocation.getBoard().getSolderPastePads()) {{
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10162);if ((((pad.getSide() != boardLocation.getSide())&&(__CLR4_5_27tn7tnlx1h1unr.R.iget(10163)!=0|true))||(__CLR4_5_27tn7tnlx1h1unr.R.iget(10164)==0&false))) {{
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10165);continue;
                }
                }__CLR4_5_27tn7tnlx1h1unr.R.inc(10166);Location location = pad.getLocation();
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10167);location = Utils2D.calculateBoardPlacementLocation(boardLocation, location);

                __CLR4_5_27tn7tnlx1h1unr.R.inc(10168);fireDetailedStatusUpdated(
                        String.format("Move to pad location, safe Z at (%s).", location));
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10169);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_27tn7tnlx1h1unr.R.iget(10170)!=0|true))||(__CLR4_5_27tn7tnlx1h1unr.R.iget(10171)==0&false))) {{
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10172);return;
                }
                }__CLR4_5_27tn7tnlx1h1unr.R.inc(10173);try {
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10174);MovableUtils.moveToLocationAtSafeZ(dispenser, location);
                }
                catch (Exception e) {
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10175);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                }

                __CLR4_5_27tn7tnlx1h1unr.R.inc(10176);fireDetailedStatusUpdated(String.format("Dispense.", location));
                __CLR4_5_27tn7tnlx1h1unr.R.inc(10177);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_27tn7tnlx1h1unr.R.iget(10178)!=0|true))||(__CLR4_5_27tn7tnlx1h1unr.R.iget(10179)==0&false))) {{
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10180);return;
                }
                }__CLR4_5_27tn7tnlx1h1unr.R.inc(10181);try {
                    // TODO: The startLocation, endLocation and time will
                    // eventually come from an algorithm that uses the Pad's
                    // physical properties, but until we have that we just
                    // send junk data and let the driver interpret it.
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10182);dispenser.dispense(null, null, 0);
                }
                catch (Exception e) {
                    __CLR4_5_27tn7tnlx1h1unr.R.inc(10183);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                }
            }
        }}

        }__CLR4_5_27tn7tnlx1h1unr.R.inc(10184);fireDetailedStatusUpdated("Job complete.");

        __CLR4_5_27tn7tnlx1h1unr.R.inc(10185);state = JobState.Stopped;
        __CLR4_5_27tn7tnlx1h1unr.R.inc(10186);fireJobStateChanged();
    }finally{__CLR4_5_27tn7tnlx1h1unr.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_27tn7tnlx1h1unr.R.inc(10187);
        __CLR4_5_27tn7tnlx1h1unr.R.inc(10188);return null;
    }finally{__CLR4_5_27tn7tnlx1h1unr.R.flushNeeded();}}
}
