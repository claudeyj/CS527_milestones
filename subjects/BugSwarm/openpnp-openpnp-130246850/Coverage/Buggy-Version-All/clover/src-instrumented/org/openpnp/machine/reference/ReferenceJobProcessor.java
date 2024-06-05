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

import java.util.Set;

import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.wizards.ReferenceJobProcessorConfigurationWizard;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.planner.SimpleJobPlanner;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.FiducialLocator;
import org.openpnp.spi.Head;
import org.openpnp.spi.JobPlanner;
import org.openpnp.spi.JobPlanner.PlacementSolution;
import org.openpnp.spi.Machine;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.NozzleTip;
import org.openpnp.spi.base.AbstractJobProcessor;
import org.openpnp.util.Utils2D;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Commit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Rewrite this as a FSM where each place we would normally check if
// job should continue is just a state.
// TODO Safe Z should be a Job property, and the user should be able to set it during job setup to
// be as low as
// possible to make things faster.
public class ReferenceJobProcessor extends AbstractJobProcessor {public static class __CLR4_5_277j77jlx1h36zs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,9702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(ReferenceJobProcessor.class);

    /**
     * History:
     * 
     * Note: Can't actually use the @Version annotation because of a bug in SimpleXML. See
     * http://sourceforge.net/p/simple/mailman/message/27887562/
     * 
     * 1.0: Initial revision. 1.1: Added jobPlanner, which is moved here from AbstractMachine.
     */

    @Attribute(required = false)
    private boolean demoMode;

    @Element(required = false)
    private JobPlanner jobPlanner;

    public ReferenceJobProcessor() {try{__CLR4_5_277j77jlx1h36zs.R.inc(9343);}finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_277j77jlx1h36zs.R.inc(9344);
        __CLR4_5_277j77jlx1h36zs.R.inc(9345);if ((((jobPlanner == null)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9346)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9347)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9348);jobPlanner = new SimpleJobPlanner();
        }
    }}finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    @Override
    public void run() {try{__CLR4_5_277j77jlx1h36zs.R.inc(9349);
        __CLR4_5_277j77jlx1h36zs.R.inc(9350);if ((((demoMode)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9351)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9352)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9353);runDemo();
            __CLR4_5_277j77jlx1h36zs.R.inc(9354);return;
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9355);state = JobState.Running;
        __CLR4_5_277j77jlx1h36zs.R.inc(9356);fireJobStateChanged();

        __CLR4_5_277j77jlx1h36zs.R.inc(9357);Machine machine = Configuration.get().getMachine();

        __CLR4_5_277j77jlx1h36zs.R.inc(9358);preProcessJob(machine);

        __CLR4_5_277j77jlx1h36zs.R.inc(9359);for (Head head : machine.getHeads()) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9360);fireDetailedStatusUpdated(String.format("Move head %s to Safe-Z.", head.getName()));

            __CLR4_5_277j77jlx1h36zs.R.inc(9361);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9362)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9363)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9364);return;
            }

            }__CLR4_5_277j77jlx1h36zs.R.inc(9365);try {
                __CLR4_5_277j77jlx1h36zs.R.inc(9366);head.moveToSafeZ();
            }
            catch (Exception e) {
                __CLR4_5_277j77jlx1h36zs.R.inc(9367);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                __CLR4_5_277j77jlx1h36zs.R.inc(9368);return;
            }
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9369);fireDetailedStatusUpdated(String.format("Check fiducials."));

        __CLR4_5_277j77jlx1h36zs.R.inc(9370);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9371)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9372)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9373);return;
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9374);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9375);checkFiducials();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9376);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9377);return;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9378);Head head = machine.getHeads().get(0);

        __CLR4_5_277j77jlx1h36zs.R.inc(9379);jobPlanner.setJob(job);

        __CLR4_5_277j77jlx1h36zs.R.inc(9380);Set<PlacementSolution> solutions;
        __CLR4_5_277j77jlx1h36zs.R.inc(9381);while ((solutions = jobPlanner.getNextPlacementSolutions(head)) != null) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9384);for (PlacementSolution solution : solutions) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9385);BoardLocation bl = solution.boardLocation;
                __CLR4_5_277j77jlx1h36zs.R.inc(9386);Part part = solution.placement.getPart();
                __CLR4_5_277j77jlx1h36zs.R.inc(9387);Feeder feeder = solution.feeder;
                __CLR4_5_277j77jlx1h36zs.R.inc(9388);Placement placement = solution.placement;
                __CLR4_5_277j77jlx1h36zs.R.inc(9389);Nozzle nozzle = solution.nozzle;
                __CLR4_5_277j77jlx1h36zs.R.inc(9390);NozzleTip nozzleTip = solution.nozzleTip;

                __CLR4_5_277j77jlx1h36zs.R.inc(9391);firePartProcessingStarted(solution.boardLocation, solution.placement);

                __CLR4_5_277j77jlx1h36zs.R.inc(9392);if ((((!changeNozzleTip(nozzle, nozzleTip))&&(__CLR4_5_277j77jlx1h36zs.R.iget(9393)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9394)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9395);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9396);if ((((!nozzle.getNozzleTip().canHandle(part))&&(__CLR4_5_277j77jlx1h36zs.R.iget(9397)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9398)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9399);fireJobEncounteredError(JobError.PickError,
                            "Selected nozzle tip is not compatible with part");
                    __CLR4_5_277j77jlx1h36zs.R.inc(9400);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9401);if ((((!pick(nozzle, feeder, bl, placement))&&(__CLR4_5_277j77jlx1h36zs.R.iget(9402)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9403)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9404);return;
                }
            }}

            // TODO: a lot of the event fires are broken
            }__CLR4_5_277j77jlx1h36zs.R.inc(9405);for (PlacementSolution solution : solutions) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9406);Nozzle nozzle = solution.nozzle;
                __CLR4_5_277j77jlx1h36zs.R.inc(9407);BoardLocation bl = solution.boardLocation;
                __CLR4_5_277j77jlx1h36zs.R.inc(9408);Placement placement = solution.placement;
                __CLR4_5_277j77jlx1h36zs.R.inc(9409);Part part = placement.getPart();

                __CLR4_5_277j77jlx1h36zs.R.inc(9410);Location bottomVisionOffsets = null;
                __CLR4_5_277j77jlx1h36zs.R.inc(9411);try {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9412);bottomVisionOffsets = machine.getPartAlignment().findOffsets(part, nozzle);
                }
                catch (Exception e) {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9413);e.printStackTrace();
                }

                __CLR4_5_277j77jlx1h36zs.R.inc(9414);Location placementLocation =
                        Utils2D.calculateBoardPlacementLocation(bl, placement.getLocation());

                __CLR4_5_277j77jlx1h36zs.R.inc(9415);if ((((bottomVisionOffsets != null)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9416)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9417)==0&false))) {{
                    // Rotate the point 0,0 using the bottom offsets as a center point by the angle
                    // that is
                    // the difference between the bottom vision angle and the calculated global
                    // placement angle.
                    __CLR4_5_277j77jlx1h36zs.R.inc(9418);Location location = new Location(LengthUnit.Millimeters).rotateXyCenterPoint(
                            bottomVisionOffsets,
                            placementLocation.getRotation() - bottomVisionOffsets.getRotation());

                    // Set the angle to the difference mentioned above, aligning the part to the
                    // same angle as
                    // the placement.
                    __CLR4_5_277j77jlx1h36zs.R.inc(9419);location = location.derive(null, null, null,
                            placementLocation.getRotation() - bottomVisionOffsets.getRotation());

                    // Add the placement final location to move our local coordinate into global
                    // space
                    __CLR4_5_277j77jlx1h36zs.R.inc(9420);location = location.add(placementLocation);

                    // Subtract the bottom vision offsets to move the part to the final location,
                    // instead of
                    // the nozzle.
                    __CLR4_5_277j77jlx1h36zs.R.inc(9421);location = location.subtract(bottomVisionOffsets);

                    __CLR4_5_277j77jlx1h36zs.R.inc(9422);placementLocation = location;
                }

                // Update the placementLocation with the proper Z value. This is
                // the distance to the top of the board plus the height of
                // the part.
                }__CLR4_5_277j77jlx1h36zs.R.inc(9423);Location boardLocation =
                        bl.getLocation().convertToUnits(placementLocation.getUnits());
                __CLR4_5_277j77jlx1h36zs.R.inc(9424);double partHeight =
                        part.getHeight().convertToUnits(placementLocation.getUnits()).getValue();
                __CLR4_5_277j77jlx1h36zs.R.inc(9425);placementLocation = placementLocation.derive(null, null,
                        boardLocation.getZ() + partHeight, null);

                __CLR4_5_277j77jlx1h36zs.R.inc(9426);if ((((!place(nozzle, bl, placementLocation, placement))&&(__CLR4_5_277j77jlx1h36zs.R.iget(9427)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9428)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9429);return;
                }
            }}
        }}

        }__CLR4_5_277j77jlx1h36zs.R.inc(9430);fireDetailedStatusUpdated("Job complete.");

        __CLR4_5_277j77jlx1h36zs.R.inc(9431);state = JobState.Stopped;
        __CLR4_5_277j77jlx1h36zs.R.inc(9432);fireJobStateChanged();
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    // TODO: This needs to be it's own class and the job processor needs to
    // be more abstract. Then we can have job processors that process
    // job types like demo, pnp, solder, etc.
    private void runDemo() {try{__CLR4_5_277j77jlx1h36zs.R.inc(9433);
        __CLR4_5_277j77jlx1h36zs.R.inc(9434);state = JobState.Running;
        __CLR4_5_277j77jlx1h36zs.R.inc(9435);fireJobStateChanged();

        __CLR4_5_277j77jlx1h36zs.R.inc(9436);Machine machine = Configuration.get().getMachine();

        __CLR4_5_277j77jlx1h36zs.R.inc(9437);preProcessJob(machine);

        __CLR4_5_277j77jlx1h36zs.R.inc(9438);for (Head head : machine.getHeads()) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9439);fireDetailedStatusUpdated(String.format("Move head %s to Safe-Z.", head.getName()));

            __CLR4_5_277j77jlx1h36zs.R.inc(9440);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9441)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9442)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9443);return;
            }

            }__CLR4_5_277j77jlx1h36zs.R.inc(9444);try {
                __CLR4_5_277j77jlx1h36zs.R.inc(9445);head.moveToSafeZ();
            }
            catch (Exception e) {
                __CLR4_5_277j77jlx1h36zs.R.inc(9446);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                __CLR4_5_277j77jlx1h36zs.R.inc(9447);return;
            }
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9448);fireDetailedStatusUpdated(String.format("Check fiducials."));

        __CLR4_5_277j77jlx1h36zs.R.inc(9449);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9450)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9451)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9452);return;
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9453);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9454);checkFiducials();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9455);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9456);return;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9457);Head head;
        __CLR4_5_277j77jlx1h36zs.R.inc(9458);Camera camera;

        __CLR4_5_277j77jlx1h36zs.R.inc(9459);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9460);head = machine.getDefaultHead();
            __CLR4_5_277j77jlx1h36zs.R.inc(9461);camera = head.getDefaultCamera();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9462);fireJobEncounteredError(JobError.HeadError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9463);return;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9464);jobPlanner.setJob(job);

        __CLR4_5_277j77jlx1h36zs.R.inc(9465);Set<PlacementSolution> solutions;
        __CLR4_5_277j77jlx1h36zs.R.inc(9466);while ((solutions = jobPlanner.getNextPlacementSolutions(head)) != null) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9469);for (PlacementSolution solution : solutions) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9470);Feeder feeder = solution.feeder;

                __CLR4_5_277j77jlx1h36zs.R.inc(9471);firePartProcessingStarted(solution.boardLocation, solution.placement);

                __CLR4_5_277j77jlx1h36zs.R.inc(9472);try {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9473);fireDetailedStatusUpdated(String.format(
                            "Move to pick location, safe Z at (%s).", feeder.getPickLocation()));
                }
                catch (Exception e) {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9474);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                    __CLR4_5_277j77jlx1h36zs.R.inc(9475);return;
                }

                __CLR4_5_277j77jlx1h36zs.R.inc(9476);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9477)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9478)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9479);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9480);try {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9481);camera.moveTo(feeder.getPickLocation().derive(null, null, Double.NaN, null));
                    __CLR4_5_277j77jlx1h36zs.R.inc(9482);Thread.sleep(750);
                }
                catch (Exception e) {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9483);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                    __CLR4_5_277j77jlx1h36zs.R.inc(9484);return;
                }
            }

            // TODO: a lot of the event fires are broken
            }__CLR4_5_277j77jlx1h36zs.R.inc(9485);for (PlacementSolution solution : solutions) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9486);BoardLocation bl = solution.boardLocation;
                __CLR4_5_277j77jlx1h36zs.R.inc(9487);Placement placement = solution.placement;

                __CLR4_5_277j77jlx1h36zs.R.inc(9488);Location placementLocation = placement.getLocation();
                __CLR4_5_277j77jlx1h36zs.R.inc(9489);placementLocation = Utils2D.calculateBoardPlacementLocation(bl, placementLocation);

                __CLR4_5_277j77jlx1h36zs.R.inc(9490);fireDetailedStatusUpdated(String
                        .format("Move to placement location, safe Z at (%s).", placementLocation));

                __CLR4_5_277j77jlx1h36zs.R.inc(9491);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9492)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9493)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9494);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9495);try {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9496);camera.moveTo(placementLocation.derive(null, null, Double.NaN, null));
                    __CLR4_5_277j77jlx1h36zs.R.inc(9497);Thread.sleep(750);
                }
                catch (Exception e) {
                    __CLR4_5_277j77jlx1h36zs.R.inc(9498);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
                    __CLR4_5_277j77jlx1h36zs.R.inc(9499);return;
                }
            }
        }}

        }__CLR4_5_277j77jlx1h36zs.R.inc(9500);fireDetailedStatusUpdated("Job complete.");

        __CLR4_5_277j77jlx1h36zs.R.inc(9501);state = JobState.Stopped;
        __CLR4_5_277j77jlx1h36zs.R.inc(9502);fireJobStateChanged();
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    // TODO: Should not bail if there are no fids on the board. Figure out
    // the UI for that.
    protected void checkFiducials() throws Exception {try{__CLR4_5_277j77jlx1h36zs.R.inc(9503);
        __CLR4_5_277j77jlx1h36zs.R.inc(9504);FiducialLocator locator = Configuration.get().getMachine().getFiducialLocator();
        __CLR4_5_277j77jlx1h36zs.R.inc(9505);for (BoardLocation boardLocation : job.getBoardLocations()) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9506);if ((((!boardLocation.isEnabled())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9507)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9508)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9509);continue;
            }
            }__CLR4_5_277j77jlx1h36zs.R.inc(9510);if ((((!boardLocation.isCheckFiducials())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9511)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9512)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9513);continue;
            }
            }__CLR4_5_277j77jlx1h36zs.R.inc(9514);Location location = locator.locateBoard(boardLocation);
            __CLR4_5_277j77jlx1h36zs.R.inc(9515);boardLocation.setLocation(location);
        }
    }}finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    protected boolean changeNozzleTip(Nozzle nozzle, NozzleTip nozzleTip) {try{__CLR4_5_277j77jlx1h36zs.R.inc(9516);
        // NozzleTip Changer
        __CLR4_5_277j77jlx1h36zs.R.inc(9517);if ((((nozzle.getNozzleTip() != nozzleTip)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9518)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9519)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9520);fireDetailedStatusUpdated(
                    String.format("Unload nozzle tip from nozzle %s.", nozzle.getName()));

            __CLR4_5_277j77jlx1h36zs.R.inc(9521);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9522)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9523)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9524);return false;
            }

            }__CLR4_5_277j77jlx1h36zs.R.inc(9525);try {
                __CLR4_5_277j77jlx1h36zs.R.inc(9526);nozzle.unloadNozzleTip();
            }
            catch (Exception e) {
                __CLR4_5_277j77jlx1h36zs.R.inc(9527);fireJobEncounteredError(JobError.PickError, e.getMessage());
                __CLR4_5_277j77jlx1h36zs.R.inc(9528);return false;
            }

            __CLR4_5_277j77jlx1h36zs.R.inc(9529);fireDetailedStatusUpdated(String.format("Load nozzle tip %s into nozzle %s.",
                    nozzleTip.getName(), nozzle.getName()));

            __CLR4_5_277j77jlx1h36zs.R.inc(9530);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9531)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9532)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9533);return false;
            }

            }__CLR4_5_277j77jlx1h36zs.R.inc(9534);try {
                __CLR4_5_277j77jlx1h36zs.R.inc(9535);nozzle.loadNozzleTip(nozzleTip);
            }
            catch (Exception e) {
                __CLR4_5_277j77jlx1h36zs.R.inc(9536);fireJobEncounteredError(JobError.PickError, e.getMessage());
                __CLR4_5_277j77jlx1h36zs.R.inc(9537);return false;
            }

            __CLR4_5_277j77jlx1h36zs.R.inc(9538);if ((((nozzle.getNozzleTip() != nozzleTip)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9539)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9540)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9541);fireJobEncounteredError(JobError.PickError, "Failed to load correct nozzle tip");
                __CLR4_5_277j77jlx1h36zs.R.inc(9542);return false;
            }
        }}
        }__CLR4_5_277j77jlx1h36zs.R.inc(9543);return true;
        // End NozzleTip Changer
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    protected boolean pick(Nozzle nozzle, Feeder feeder, BoardLocation bl, Placement placement) {try{__CLR4_5_277j77jlx1h36zs.R.inc(9544);
        __CLR4_5_277j77jlx1h36zs.R.inc(9545);fireDetailedStatusUpdated(String.format("Move nozzle %s to Safe-Z at (%s).",
                nozzle.getName(), nozzle.getLocation()));

        __CLR4_5_277j77jlx1h36zs.R.inc(9546);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9547)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9548)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9549);return false;
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9550);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9551);nozzle.moveToSafeZ();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9552);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9553);return false;
        }

        // TODO: Need to be able to see the thing that caused an error, but we also want to see what
        // is about to happen when paused. Figure it out.
        __CLR4_5_277j77jlx1h36zs.R.inc(9554);fireDetailedStatusUpdated(
                String.format("Request part feed from feeder %s.", feeder.getName()));

        __CLR4_5_277j77jlx1h36zs.R.inc(9555);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9556)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9557)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9558);return false;
        }

        // Request that the Feeder feeds the part
        }__CLR4_5_277j77jlx1h36zs.R.inc(9559);while (true) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9560);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9561)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9562)==0&false))) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9563);return false;
            }
            }__CLR4_5_277j77jlx1h36zs.R.inc(9564);try {
                __CLR4_5_277j77jlx1h36zs.R.inc(9565);feeder.feed(nozzle);
                __CLR4_5_277j77jlx1h36zs.R.inc(9566);break;
            }
            catch (Exception e) {
                __CLR4_5_277j77jlx1h36zs.R.inc(9567);fireJobEncounteredError(JobError.FeederError, e.getMessage());
            }
        }

        // Now that the Feeder has done it's feed operation we can get
        // the pick location from it.
        }__CLR4_5_277j77jlx1h36zs.R.inc(9568);Location pickLocation;
        __CLR4_5_277j77jlx1h36zs.R.inc(9569);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9570);pickLocation = feeder.getPickLocation();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9571);fireJobEncounteredError(JobError.FeederError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9572);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9573);fireDetailedStatusUpdated(String.format("Move to safe Z at (%s).", nozzle.getLocation()));

        __CLR4_5_277j77jlx1h36zs.R.inc(9574);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9575)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9576)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9577);return false;
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9578);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9579);nozzle.moveToSafeZ();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9580);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9581);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9582);fireDetailedStatusUpdated(
                String.format("Move to pick location, safe Z at (%s).", pickLocation));

        __CLR4_5_277j77jlx1h36zs.R.inc(9583);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9584)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9585)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9586);return false;
        }

        // Move the Nozzle to the pick Location at safe Z
        }__CLR4_5_277j77jlx1h36zs.R.inc(9587);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9588);nozzle.moveTo(pickLocation.derive(null, null, Double.NaN, null));
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9589);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9590);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9591);fireDetailedStatusUpdated(String.format("Move to pick location Z at (%s).", pickLocation));

        __CLR4_5_277j77jlx1h36zs.R.inc(9592);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9593)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9594)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9595);return false;
        }

        // Move the Nozzle to the pick Location
        }__CLR4_5_277j77jlx1h36zs.R.inc(9596);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9597);nozzle.moveTo(pickLocation);
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9598);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9599);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9600);fireDetailedStatusUpdated(String.format("Request part pick at (%s).", pickLocation));

        __CLR4_5_277j77jlx1h36zs.R.inc(9601);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9602)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9603)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9604);return false;
        }

        // Pick the part
        }__CLR4_5_277j77jlx1h36zs.R.inc(9605);try {
            // TODO design a way for the head/feeder to indicate that the part
            // failed to pick, use the delegate to notify and potentially retry
            // We now have the delegate for this, just need to use it and
            // implement the logic for it's potential responses
            __CLR4_5_277j77jlx1h36zs.R.inc(9606);nozzle.pick(placement.getPart());
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9607);fireJobEncounteredError(JobError.PickError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9608);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9609);firePartPicked(bl, placement);
        __CLR4_5_277j77jlx1h36zs.R.inc(9610);firePartPicked(bl, placement, nozzle);

        __CLR4_5_277j77jlx1h36zs.R.inc(9611);fireDetailedStatusUpdated(String.format("Move to safe Z at (%s).", nozzle.getLocation()));

        __CLR4_5_277j77jlx1h36zs.R.inc(9612);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9613)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9614)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9615);return false;
        }

        }__CLR4_5_277j77jlx1h36zs.R.inc(9616);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9617);nozzle.moveToSafeZ();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9618);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9619);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9620);return true;
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    protected boolean place(Nozzle nozzle, BoardLocation bl, Location placementLocation,
            Placement placement) {try{__CLR4_5_277j77jlx1h36zs.R.inc(9621);
        __CLR4_5_277j77jlx1h36zs.R.inc(9622);fireDetailedStatusUpdated(
                String.format("Move to placement location, safe Z at (%s).", placementLocation));

        __CLR4_5_277j77jlx1h36zs.R.inc(9623);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9624)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9625)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9626);return false;
        }

        // Move the nozzle to the placement Location at safe Z
        }__CLR4_5_277j77jlx1h36zs.R.inc(9627);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9628);nozzle.moveToSafeZ();
            __CLR4_5_277j77jlx1h36zs.R.inc(9629);nozzle.moveTo(placementLocation.derive(null, null, Double.NaN, null));
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9630);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9631);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9632);fireDetailedStatusUpdated(
                String.format("Move to placement location Z at (%s).", placementLocation));

        __CLR4_5_277j77jlx1h36zs.R.inc(9633);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9634)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9635)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9636);return false;
        }

        // Lower the nozzle.
        }__CLR4_5_277j77jlx1h36zs.R.inc(9637);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9638);nozzle.moveTo(placementLocation);
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9639);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9640);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9641);fireDetailedStatusUpdated(
                String.format("Request part place. at (X %2.3f, Y %2.3f, Z %2.3f, C %2.3f).",
                        placementLocation.getX(), placementLocation.getY(),
                        placementLocation.getZ(), placementLocation.getRotation()));

        __CLR4_5_277j77jlx1h36zs.R.inc(9642);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9643)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9644)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9645);return false;
        }

        // Place the part
        }__CLR4_5_277j77jlx1h36zs.R.inc(9646);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9647);nozzle.place();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9648);fireJobEncounteredError(JobError.PlaceError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9649);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9650);firePartPlaced(bl, placement);

        __CLR4_5_277j77jlx1h36zs.R.inc(9651);fireDetailedStatusUpdated(String.format("Move to safe Z at (%s).", nozzle.getLocation()));

        __CLR4_5_277j77jlx1h36zs.R.inc(9652);if ((((!shouldJobProcessingContinue())&&(__CLR4_5_277j77jlx1h36zs.R.iget(9653)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9654)==0&false))) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9655);return false;
        }

        // Return to Safe-Z above the board.
        }__CLR4_5_277j77jlx1h36zs.R.inc(9656);try {
            __CLR4_5_277j77jlx1h36zs.R.inc(9657);nozzle.moveToSafeZ();
        }
        catch (Exception e) {
            __CLR4_5_277j77jlx1h36zs.R.inc(9658);fireJobEncounteredError(JobError.MachineMovementError, e.getMessage());
            __CLR4_5_277j77jlx1h36zs.R.inc(9659);return false;
        }

        __CLR4_5_277j77jlx1h36zs.R.inc(9660);firePartProcessingComplete(bl, placement);

        __CLR4_5_277j77jlx1h36zs.R.inc(9661);return true;
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    /*
     * Pre-process the Job. We will: Look for setup errors. Look for missing parts. Look for missing
     * feeders. Look for feeders that cannot feed the number of parts that will be needed. Calculate
     * the base Safe-Z for the job. Calculate the number of parts that need to be placed. Calculate
     * the total distance that will need to be traveled. Calculate the total time it should take to
     * place the job.
     * 
     * Time calculation is tough unless we also ask the feeders to simulate their work. Otherwise we
     * can just calculate the total distance * the feed rate to get close. This doesn't include
     * acceleration and such.
     * 
     * The base Safe-Z is the maximum of: Highest placement location. Highest pick location.
     */
    protected void preProcessJob(Machine machine) {try{__CLR4_5_277j77jlx1h36zs.R.inc(9662);
        __CLR4_5_277j77jlx1h36zs.R.inc(9663);Head head = machine.getHeads().get(0);

        __CLR4_5_277j77jlx1h36zs.R.inc(9664);jobPlanner.setJob(job);

        __CLR4_5_277j77jlx1h36zs.R.inc(9665);Set<PlacementSolution> solutions;
        __CLR4_5_277j77jlx1h36zs.R.inc(9666);while ((solutions = jobPlanner.getNextPlacementSolutions(head)) != null) {{
            __CLR4_5_277j77jlx1h36zs.R.inc(9669);for (PlacementSolution solution : solutions) {{
                __CLR4_5_277j77jlx1h36zs.R.inc(9670);BoardLocation bl = solution.boardLocation;
                __CLR4_5_277j77jlx1h36zs.R.inc(9671);Part part = solution.placement.getPart();
                __CLR4_5_277j77jlx1h36zs.R.inc(9672);Feeder feeder = solution.feeder;
                __CLR4_5_277j77jlx1h36zs.R.inc(9673);Placement placement = solution.placement;
                __CLR4_5_277j77jlx1h36zs.R.inc(9674);Nozzle nozzle = solution.nozzle;
                __CLR4_5_277j77jlx1h36zs.R.inc(9675);NozzleTip nozzleTip = solution.nozzleTip;

                __CLR4_5_277j77jlx1h36zs.R.inc(9676);if ((((part == null)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9677)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9678)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9679);fireJobEncounteredError(JobError.PartError,
                            String.format("Part not found for Board %s, Placement %s",
                                    bl.getBoard().getName(), placement.getId()));
                    __CLR4_5_277j77jlx1h36zs.R.inc(9680);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9681);if ((((nozzle == null)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9682)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9683)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9684);fireJobEncounteredError(JobError.HeadError,
                            "No Nozzle available to service Placement " + placement);
                    __CLR4_5_277j77jlx1h36zs.R.inc(9685);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9686);if ((((feeder == null)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9687)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9688)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9689);fireJobEncounteredError(JobError.FeederError,
                            "No viable Feeders found for Part " + part.getId());
                    __CLR4_5_277j77jlx1h36zs.R.inc(9690);return;
                }

                }__CLR4_5_277j77jlx1h36zs.R.inc(9691);if ((((nozzleTip == null)&&(__CLR4_5_277j77jlx1h36zs.R.iget(9692)!=0|true))||(__CLR4_5_277j77jlx1h36zs.R.iget(9693)==0&false))) {{
                    __CLR4_5_277j77jlx1h36zs.R.inc(9694);fireJobEncounteredError(JobError.HeadError,
                            "No viable NozzleTips found for Part / Feeder " + part.getId());
                    __CLR4_5_277j77jlx1h36zs.R.inc(9695);return;
                }

            }}
        }}
    }}finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    public boolean isDemoMode() {try{__CLR4_5_277j77jlx1h36zs.R.inc(9696);
        __CLR4_5_277j77jlx1h36zs.R.inc(9697);return demoMode;
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    public void setDemoMode(boolean demoMode) {try{__CLR4_5_277j77jlx1h36zs.R.inc(9698);
        __CLR4_5_277j77jlx1h36zs.R.inc(9699);this.demoMode = demoMode;
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_277j77jlx1h36zs.R.inc(9700);
        __CLR4_5_277j77jlx1h36zs.R.inc(9701);return new ReferenceJobProcessorConfigurationWizard(this);
    }finally{__CLR4_5_277j77jlx1h36zs.R.flushNeeded();}}
}
