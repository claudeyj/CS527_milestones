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

package org.openpnp;

import org.openpnp.model.BoardLocation;
import org.openpnp.model.Job;
import org.openpnp.model.Placement;
import org.openpnp.spi.JobProcessor.JobError;
import org.openpnp.spi.JobProcessor.JobState;
import org.openpnp.spi.Nozzle;

/**
 * Allows an interested listener to receive events as the JobProcessor does it's work. Methods in
 * this interface are for passive observers.
 *
 */
public interface JobProcessorListener {public static class __CLR4_5_222lx1h1mjm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,11,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void jobLoaded(Job job);

    /**
     * Indicates that the state of the Job has changed. This is generally in response to one of the
     * Job control methods such as start(), pause(), resume(), or stop() being called.
     * 
     * @param state
     */
    public void jobStateChanged(JobState state);

    public void jobEncounteredError(JobError error, String description);

    /**
     * Fired when the JobProcessor has begun operations that include the given Placement.
     * 
     * @param board
     * @param placement
     */
    public void partProcessingStarted(BoardLocation board, Placement placement);

    /**
     * Fired when the JobProcessor has completed the pick operation for the given Placement.
     * 
     * @param board
     * @param placement
     */
    public void partPicked(BoardLocation board, Placement placement);

    public default void partPicked(BoardLocation board, Placement placement, Nozzle nozzle) {try{__CLR4_5_222lx1h1mjm.R.inc(2);
        
    }finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}
    
    /**
     * Fired when the JobProcessor has completed the place operation for the given Placement.
     * 
     * @param board
     * @param placement
     */
    public void partPlaced(BoardLocation board, Placement placement);

    /**
     * Fired when the JobProcessor has completed all operations regarding the given Placement.
     * 
     * @param board
     * @param placement
     */
    public void partProcessingCompleted(BoardLocation board, Placement placement);

    // TODO Maybe partProcessingFailed with a reason

    // TODO Add job progress information, especially after pre-processing
    // so that listeners can know the total placement count to be processed.

    /**
     * Fired when the JobProcessor is able to report detailed, human readable status information
     * about the Job's progress.
     * 
     * @param status
     */
    public void detailedStatusUpdated(String status);

    static public class Adapter implements JobProcessorListener {

        @Override
        public void jobLoaded(Job job) {try{__CLR4_5_222lx1h1mjm.R.inc(3);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void jobStateChanged(JobState state) {try{__CLR4_5_222lx1h1mjm.R.inc(4);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void jobEncounteredError(JobError error, String description) {try{__CLR4_5_222lx1h1mjm.R.inc(5);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void partProcessingStarted(BoardLocation board, Placement placement) {try{__CLR4_5_222lx1h1mjm.R.inc(6);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void partPicked(BoardLocation board, Placement placement) {try{__CLR4_5_222lx1h1mjm.R.inc(7);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void partPlaced(BoardLocation board, Placement placement) {try{__CLR4_5_222lx1h1mjm.R.inc(8);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void partProcessingCompleted(BoardLocation board, Placement placement) {try{__CLR4_5_222lx1h1mjm.R.inc(9);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}

        @Override
        public void detailedStatusUpdated(String status) {try{__CLR4_5_222lx1h1mjm.R.inc(10);}finally{__CLR4_5_222lx1h1mjm.R.flushNeeded();}}
    }
}
