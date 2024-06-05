/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi.base;

import java.util.HashSet;
import java.util.Set;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.JobProcessorDelegate;
import org.openpnp.JobProcessorListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Job;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PropertySheetHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractJobProcessor implements JobProcessor, Runnable {public static class __CLR4_5_2ehdehdlx1h5rjb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,18892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(AbstractJobProcessor.class);

    protected Job job;
    protected Set<JobProcessorListener> listeners = new HashSet<>();
    protected JobProcessorDelegate delegate = new DefaultJobProcessorDelegate();
    protected JobState state;
    protected Thread thread;
    protected Object runLock = new Object();
    private boolean pauseAtNextStep;

    @Override
    public void setDelegate(JobProcessorDelegate delegate) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18769);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18770);if ((((delegate == null)&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18771)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18772)==0&false))) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18773);this.delegate = new DefaultJobProcessorDelegate();
        }
        }else {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18774);this.delegate = delegate;
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void addListener(JobProcessorListener listener) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18775);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18776);listeners.add(listener);
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void removeListener(JobProcessorListener listener) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18777);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18778);listeners.remove(listener);
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public Job getJob() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18779);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18780);return job;
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public JobState getState() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18781);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18782);return state;
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    // TODO: Change this, and most of the other properties on here to bound
    // properties.
    @Override
    public void load(Job job) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18783);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18784);stop();
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18785);this.job = job;

        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18786);fireJobLoaded();
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void start() throws Exception {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18787);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18788);logger.debug("start()");
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18789);if ((((state != JobState.Stopped)&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18790)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18791)==0&false))) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18792);throw new Exception("Invalid state. Cannot start new job while state is " + state);
        }
        }__CLR4_5_2ehdehdlx1h5rjb.R.inc(18793);if ((((thread != null && thread.isAlive())&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18794)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18795)==0&false))) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18796);throw new Exception("Previous Job has not yet finished.");
        }
        }__CLR4_5_2ehdehdlx1h5rjb.R.inc(18797);thread = new Thread(this);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18798);thread.start();
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void pause() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18799);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18800);logger.debug("pause()");
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18801);state = JobState.Paused;
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18802);fireJobStateChanged();
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void step() throws Exception {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18803);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18804);logger.debug("step()");
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18805);if ((((state == JobState.Stopped)&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18806)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18807)==0&false))) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18808);pauseAtNextStep = true;
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18809);start();
        }
        }else {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18810);pauseAtNextStep = true;
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18811);resume();
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void resume() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18812);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18813);logger.debug("resume()");
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18814);state = JobState.Running;
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18815);fireJobStateChanged();
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18816);synchronized (runLock) {
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18817);runLock.notifyAll();
        }
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public void stop() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18818);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18819);logger.debug("stop()");
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18820);state = JobState.Stopped;
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18821);fireJobStateChanged();
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18822);synchronized (runLock) {
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18823);runLock.notifyAll();
        }
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    /**
     * Checks if the Job has been Paused or Stopped. If it has been Paused this method blocks until
     * the Job is Resumed. If the Job has been Stopped it returns false and the loop should break.
     */
    protected boolean shouldJobProcessingContinue() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18824);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18825);if ((((pauseAtNextStep)&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18826)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18827)==0&false))) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18828);pauseAtNextStep = false;
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18829);pause();
        }
        }__CLR4_5_2ehdehdlx1h5rjb.R.inc(18830);while (true) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18831);if ((((state == JobState.Stopped)&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18832)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18833)==0&false))) {{
                __CLR4_5_2ehdehdlx1h5rjb.R.inc(18834);return false;
            }
            }else {__CLR4_5_2ehdehdlx1h5rjb.R.inc(18835);if ((((state == JobState.Paused)&&(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18836)!=0|true))||(__CLR4_5_2ehdehdlx1h5rjb.R.iget(18837)==0&false))) {{
                __CLR4_5_2ehdehdlx1h5rjb.R.inc(18838);synchronized (runLock) {
                    __CLR4_5_2ehdehdlx1h5rjb.R.inc(18839);try {
                        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18840);runLock.wait();
                    }
                    catch (InterruptedException ie) {
                        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18841);throw new Error(ie);
                    }
                }
            }
            }else {{
                __CLR4_5_2ehdehdlx1h5rjb.R.inc(18842);break;
            }
        }}}
        }__CLR4_5_2ehdehdlx1h5rjb.R.inc(18843);return true;
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void fireJobEncounteredError(JobError error, String description) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18844);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18845);logger.debug("fireJobEncounteredError({}, {})", error, description);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18846);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18847);listener.jobEncounteredError(error, description);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    private void fireJobLoaded() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18848);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18849);logger.debug("fireJobLoaded()");
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18850);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18851);listener.jobLoaded(job);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void fireJobStateChanged() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18852);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18853);logger.debug("fireJobStateChanged({})", state);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18854);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18855);listener.jobStateChanged(state);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void firePartProcessingStarted(BoardLocation board, Placement placement) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18856);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18857);logger.debug("firePartProcessingStarted({}, {})", board, placement);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18858);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18859);listener.partProcessingStarted(board, placement);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void firePartPicked(BoardLocation board, Placement placement) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18860);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18861);logger.debug("firePartPicked({}, {})", board, placement);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18862);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18863);listener.partPicked(board, placement);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void firePartPicked(BoardLocation board, Placement placement, Nozzle nozzle) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18864);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18865);logger.debug("firePartPicked({}, {}, {})", new Object[] { board, placement, nozzle });
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18866);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18867);listener.partPicked(board, placement, nozzle);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void firePartPlaced(BoardLocation board, Placement placement) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18868);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18869);logger.debug("firePartPlaced({}, {})", board, placement);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18870);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18871);listener.partPlaced(board, placement);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void firePartProcessingComplete(BoardLocation board, Placement placement) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18872);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18873);logger.debug("firePartProcessingComplete({}, {})", board, placement);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18874);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18875);listener.partProcessingCompleted(board, placement);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    protected void fireDetailedStatusUpdated(String status) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18876);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18877);logger.debug("fireDetailedStatusUpdated({})", status);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18878);for (JobProcessorListener listener : listeners) {{
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18879);listener.detailedStatusUpdated(status);
        }
    }}finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}


    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18880);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18881);return getClass().getSimpleName();
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18882);
        // TODO Auto-generated method stub
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18883);return null;
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18884);
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18885);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18886);
        // TODO Auto-generated method stub
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18887);return null;
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18888);
        // TODO Auto-generated method stub
        __CLR4_5_2ehdehdlx1h5rjb.R.inc(18889);return null;
    }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}



    class DefaultJobProcessorDelegate implements JobProcessorDelegate {
        @Override
        public PickRetryAction partPickFailed(BoardLocation board, Part part, Feeder feeder) {try{__CLR4_5_2ehdehdlx1h5rjb.R.inc(18890);
            __CLR4_5_2ehdehdlx1h5rjb.R.inc(18891);return PickRetryAction.SkipAndContinue;
        }finally{__CLR4_5_2ehdehdlx1h5rjb.R.flushNeeded();}}
    }
}
