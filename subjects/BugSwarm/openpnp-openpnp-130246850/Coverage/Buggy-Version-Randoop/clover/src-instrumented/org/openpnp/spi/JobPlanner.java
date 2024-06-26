/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi;

import java.util.Set;

import org.openpnp.model.BoardLocation;
import org.openpnp.model.Job;
import org.openpnp.model.Placement;


/**
 * The JobPlanner is responsible for planning the order in which Placements are processed and
 * determining which Head/Nozzle/NozzleTip/Feeder combination will be used for each Placement. It is
 * called each time a Head is ready for new work.
 */
public interface JobPlanner {public static class __CLR4_5_2eb8eb8lx1h1xvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,18555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Represents one solution from the planner for a particular Placement. Includes the Head,
     * Nozzle, NozzleTip and Feeder that should be used to service the Placement.
     */
    public static class PlacementSolution {
        public BoardLocation boardLocation;
        public Placement placement;
        public Head head;
        public Nozzle nozzle;
        public NozzleTip nozzleTip;
        public Feeder feeder;

        public PlacementSolution(Placement placement, BoardLocation boardLocation, Head head,
                Nozzle nozzle, NozzleTip nozzleTip, Feeder feeder) {try{__CLR4_5_2eb8eb8lx1h1xvn.R.inc(18548);
            __CLR4_5_2eb8eb8lx1h1xvn.R.inc(18549);this.placement = placement;
            __CLR4_5_2eb8eb8lx1h1xvn.R.inc(18550);this.boardLocation = boardLocation;
            __CLR4_5_2eb8eb8lx1h1xvn.R.inc(18551);this.head = head;
            __CLR4_5_2eb8eb8lx1h1xvn.R.inc(18552);this.nozzle = nozzle;
            __CLR4_5_2eb8eb8lx1h1xvn.R.inc(18553);this.nozzleTip = nozzleTip;
            __CLR4_5_2eb8eb8lx1h1xvn.R.inc(18554);this.feeder = feeder;
        }finally{__CLR4_5_2eb8eb8lx1h1xvn.R.flushNeeded();}}
    }

    public void setJob(Job job);

    /**
     * Gets a Set of the next available PlacementSolutions for the specified Head. The order in
     * which Heads service Placements can not be reliably determined, so it is important that this
     * method return PlacementSolutions for the specified Head using the state of the Job as it
     * stands now.
     * 
     * This method must be thread safe as it may be called by multiple threads for different Heads
     * simultaneously. This doesn't mean it necessarily needs to process concurrently - it can
     * simply be synchronized although concurrent processing is an option for more advanced
     * planners.
     * 
     * @param head
     * @return
     */
    Set<PlacementSolution> getNextPlacementSolutions(Head head);
}
