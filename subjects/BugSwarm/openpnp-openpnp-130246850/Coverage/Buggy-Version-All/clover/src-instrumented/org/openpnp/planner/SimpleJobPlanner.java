/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.planner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.model.Placement.Type;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.Head;
import org.openpnp.spi.Machine;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.NozzleTip;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleJobPlanner extends AbstractJobPlanner {public static class __CLR4_5_2e91e91lx1h3blh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,18548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(SimpleJobPlanner.class);

    @SuppressWarnings("unused")
    @Attribute(required = false)
    private String placeHolder;

    protected Set<PlacementSolution> solutions = new LinkedHashSet<>();

    @Override
    public void setJob(Job job) {try{__CLR4_5_2e91e91lx1h3blh.R.inc(18469);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18470);super.setJob(job);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18471);solutions.clear();
        __CLR4_5_2e91e91lx1h3blh.R.inc(18472);for (BoardLocation boardLocation : job.getBoardLocations()) {{
            __CLR4_5_2e91e91lx1h3blh.R.inc(18473);if ((((!boardLocation.isEnabled())&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18474)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18475)==0&false))) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18476);continue;
            }

            }__CLR4_5_2e91e91lx1h3blh.R.inc(18477);for (Placement placement : boardLocation.getBoard().getPlacements()) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18478);if ((((placement.getType() != Type.Place)&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18479)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18480)==0&false))) {{
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18481);continue;
                }

                }__CLR4_5_2e91e91lx1h3blh.R.inc(18482);if ((((placement.getSide() != boardLocation.getSide())&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18483)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18484)==0&false))) {{
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18485);continue;
                }

                }__CLR4_5_2e91e91lx1h3blh.R.inc(18486);solutions.add(
                        new PlacementSolution(placement, boardLocation, null, null, null, null));
            }
        }}

        }__CLR4_5_2e91e91lx1h3blh.R.inc(18487);logger.debug("Planned {} solutions", solutions.size());
    }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}

    /**
     * For N nozzles, create a list of every possible remaining solutions along with a weight.
     * Weight is a cost of 0 or more with things like a nozzle change increasing the weight. Once
     * all solutions are identified. Sort each list by weight and take the N lowest weighted
     * solutions that do not conflict with each other.
     *
     * TODO: Is there a situation where the order in which we take the weighted solutions from their
     * lists would cause successive nozzles to have to use less optimal solutions? I feel like this
     * is a possible issue but I haven't been able to come up with an example case.
     */
    @Override
    public synchronized Set<PlacementSolution> getNextPlacementSolutions(Head head) {try{__CLR4_5_2e91e91lx1h3blh.R.inc(18488);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18489);Set<PlacementSolution> results = new LinkedHashSet<>();
        __CLR4_5_2e91e91lx1h3blh.R.inc(18490);Machine machine = Configuration.get().getMachine();
        __CLR4_5_2e91e91lx1h3blh.R.inc(18491);for (Nozzle nozzle : head.getNozzles()) {{
            __CLR4_5_2e91e91lx1h3blh.R.inc(18492);for (WeightedPlacementSolution solution : getWeightedSolutions(machine, nozzle)) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18493);if ((((solutions.contains(solution.originalSolution))&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18494)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18495)==0&false))) {{
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18496);results.add((PlacementSolution) solution);
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18497);solutions.remove(solution.originalSolution);
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18498);break;
                }
            }}
        }}
        // If no solutions were found but there are still placements remaining
        // in the job then we failed to either find a nozzletip or feeder
        // for a placement. We return the solutions as they are, which includes
        // nulls for feeder and nozzle.
        // TODO: It would be better if we filled in what we *could* find
        // so that the processor will give the user the correct error.
        // Or we could just throw the error here.
        }__CLR4_5_2e91e91lx1h3blh.R.inc(18499);if ((((results.size() == 0 && solutions.size() > 0)&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18500)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18501)==0&false))) {{
            __CLR4_5_2e91e91lx1h3blh.R.inc(18502);return solutions;
        }
        }__CLR4_5_2e91e91lx1h3blh.R.inc(18503);return (((results.size() > 0 )&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18504)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18505)==0&false))? results : null;
    }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}

    protected List<WeightedPlacementSolution> getWeightedSolutions(Machine machine, Nozzle nozzle) {try{__CLR4_5_2e91e91lx1h3blh.R.inc(18506);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18507);List<WeightedPlacementSolution> weightedSolutions = new ArrayList<>();
        __CLR4_5_2e91e91lx1h3blh.R.inc(18508);for (PlacementSolution solution : solutions) {{
            __CLR4_5_2e91e91lx1h3blh.R.inc(18509);Part part = solution.placement.getPart();
            __CLR4_5_2e91e91lx1h3blh.R.inc(18510);if ((((part == null)&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18511)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18512)==0&false))) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18513);continue;
            }
            }__CLR4_5_2e91e91lx1h3blh.R.inc(18514);Set<NozzleTip> compatibleNozzleTips = getCompatibleNozzleTips(nozzle, part);
            __CLR4_5_2e91e91lx1h3blh.R.inc(18515);Set<Feeder> compatibleFeeders = getCompatibleFeeders(machine, nozzle, part);
            __CLR4_5_2e91e91lx1h3blh.R.inc(18516);for (NozzleTip nozzleTip : compatibleNozzleTips) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18517);for (Feeder feeder : compatibleFeeders) {{
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18518);WeightedPlacementSolution weightedSolution = new WeightedPlacementSolution(
                            solution.placement, solution.boardLocation, nozzle.getHead(), nozzle,
                            nozzleTip, feeder);
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18519);weightedSolution.weight = 1;
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18520);weightedSolution.originalSolution = solution;
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18521);if ((((nozzle.getNozzleTip() != nozzleTip)&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18522)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18523)==0&false))) {{
                        __CLR4_5_2e91e91lx1h3blh.R.inc(18524);weightedSolution.weight++;
                    }
                    }__CLR4_5_2e91e91lx1h3blh.R.inc(18525);weightedSolutions.add(weightedSolution);
                }
            }}
        }}
        }__CLR4_5_2e91e91lx1h3blh.R.inc(18526);Collections.sort(weightedSolutions, weightComparator);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18527);return weightedSolutions;
    }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}

    private static Set<NozzleTip> getCompatibleNozzleTips(Nozzle nozzle, Part part) {try{__CLR4_5_2e91e91lx1h3blh.R.inc(18528);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18529);Set<NozzleTip> nozzleTips = new HashSet<>();
        __CLR4_5_2e91e91lx1h3blh.R.inc(18530);for (NozzleTip nozzleTip : nozzle.getNozzleTips()) {{
            __CLR4_5_2e91e91lx1h3blh.R.inc(18531);if ((((nozzleTip.canHandle(part))&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18532)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18533)==0&false))) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18534);nozzleTips.add(nozzleTip);
            }
        }}
        }__CLR4_5_2e91e91lx1h3blh.R.inc(18535);return nozzleTips;
    }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}

    private static Set<Feeder> getCompatibleFeeders(Machine machine, Nozzle nozzle, Part part) {try{__CLR4_5_2e91e91lx1h3blh.R.inc(18536);
        __CLR4_5_2e91e91lx1h3blh.R.inc(18537);Set<Feeder> feeders = new HashSet<>();
        __CLR4_5_2e91e91lx1h3blh.R.inc(18538);for (Feeder feeder : machine.getFeeders()) {{
            __CLR4_5_2e91e91lx1h3blh.R.inc(18539);if ((((feeder.getPart() == part && feeder.isEnabled())&&(__CLR4_5_2e91e91lx1h3blh.R.iget(18540)!=0|true))||(__CLR4_5_2e91e91lx1h3blh.R.iget(18541)==0&false))) {{
                __CLR4_5_2e91e91lx1h3blh.R.inc(18542);feeders.add(feeder);
            }
        }}
        }__CLR4_5_2e91e91lx1h3blh.R.inc(18543);return feeders;
    }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}

    static Comparator<WeightedPlacementSolution> weightComparator =
            new Comparator<WeightedPlacementSolution>() {
                @Override
                public int compare(WeightedPlacementSolution o1, WeightedPlacementSolution o2) {try{__CLR4_5_2e91e91lx1h3blh.R.inc(18544);
                    __CLR4_5_2e91e91lx1h3blh.R.inc(18545);return Double.compare(o1.weight, o2.weight);
                }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}
            };

    static class WeightedPlacementSolution extends PlacementSolution {
        public double weight;
        public PlacementSolution originalSolution;

        public WeightedPlacementSolution(Placement placement, BoardLocation boardLocation,
                Head head, Nozzle nozzle, NozzleTip nozzleTip, Feeder feeder) {
            super(placement, boardLocation, head, nozzle, nozzleTip, feeder);__CLR4_5_2e91e91lx1h3blh.R.inc(18547);try{__CLR4_5_2e91e91lx1h3blh.R.inc(18546);
        }finally{__CLR4_5_2e91e91lx1h3blh.R.flushNeeded();}}
    }
}
