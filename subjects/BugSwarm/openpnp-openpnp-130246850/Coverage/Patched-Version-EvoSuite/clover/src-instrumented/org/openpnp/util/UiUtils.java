/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.Consumer;

import javax.swing.SwingUtilities;

import org.openpnp.gui.MainFrame;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.model.Configuration;

import com.google.common.util.concurrent.FutureCallback;

public class UiUtils {public static class __CLR4_5_2ezyezylx1h5s0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,19459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Functional interface for a Runnable that can throw an Exception but returns no value. Splits
     * the difference between Runnable and Callable.
     */
    public interface Thrunnable {
        public void thrun() throws Exception;
    }

    /**
     * Shortcut for submitMachineTask(Callable) which uses a Thrunnable instead. This allows for
     * simple tasks that may throw an Exception but return nothing.
     * 
     * @param thrunnable
     * @return
     */
    public static Future<Void> submitUiMachineTask(final Thrunnable thrunnable) {try{__CLR4_5_2ezyezylx1h5s0h.R.inc(19438);
        __CLR4_5_2ezyezylx1h5s0h.R.inc(19439);return submitUiMachineTask(() -> {
            __CLR4_5_2ezyezylx1h5s0h.R.inc(19440);thrunnable.thrun();
            __CLR4_5_2ezyezylx1h5s0h.R.inc(19441);return null;
        });
    }finally{__CLR4_5_2ezyezylx1h5s0h.R.flushNeeded();}}

    /**
     * Wrapper for submitMachineTask(Callable, Consumer, Consumer) which ignores the return value in
     * onSuccess and shows a MessageBox when an Exception is thrown. Handy for simple tasks that
     * don't care about the return value but want to notify the user in case of failure. Ideal for
     * running Machine tasks from ActionListeners.
     * 
     * @param callable
     * @return
     */
    public static <T> Future<T> submitUiMachineTask(final Callable<T> callable) {try{__CLR4_5_2ezyezylx1h5s0h.R.inc(19442);
        __CLR4_5_2ezyezylx1h5s0h.R.inc(19443);return submitUiMachineTask(callable, (result) -> {
        } , (t) -> {
            __CLR4_5_2ezyezylx1h5s0h.R.inc(19444);MessageBoxes.errorBox(MainFrame.mainFrame, "Error", t);
        });
    }finally{__CLR4_5_2ezyezylx1h5s0h.R.flushNeeded();}}

    /**
     * Functional version of Machine.submit which guarantees that the the onSuccess and onFailure
     * handlers will be run on the Swing event thread.
     * 
     * @param callable
     * @param onSuccess
     * @param onFailure
     * @return
     */
    public static <T> Future<T> submitUiMachineTask(final Callable<T> callable,
            final Consumer<T> onSuccess, final Consumer<Throwable> onFailure) {try{__CLR4_5_2ezyezylx1h5s0h.R.inc(19445);
        __CLR4_5_2ezyezylx1h5s0h.R.inc(19446);return Configuration.get().getMachine().submit(callable, new FutureCallback<T>() {
            @Override
            public void onSuccess(T result) {try{__CLR4_5_2ezyezylx1h5s0h.R.inc(19447);
                __CLR4_5_2ezyezylx1h5s0h.R.inc(19448);try {
                    __CLR4_5_2ezyezylx1h5s0h.R.inc(19449);SwingUtilities.invokeAndWait(() -> onSuccess.accept(result));
                }
                catch (Exception e) {
                    __CLR4_5_2ezyezylx1h5s0h.R.inc(19450);e.printStackTrace();
                }
            }finally{__CLR4_5_2ezyezylx1h5s0h.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable t) {try{__CLR4_5_2ezyezylx1h5s0h.R.inc(19451);
                __CLR4_5_2ezyezylx1h5s0h.R.inc(19452);try {
                    __CLR4_5_2ezyezylx1h5s0h.R.inc(19453);SwingUtilities.invokeAndWait(() -> onFailure.accept(t));
                }
                catch (Exception e) {
                    __CLR4_5_2ezyezylx1h5s0h.R.inc(19454);e.printStackTrace();
                }
            }finally{__CLR4_5_2ezyezylx1h5s0h.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2ezyezylx1h5s0h.R.flushNeeded();}}

    /**
     * Functional wrapper for actions that may throw an Exception. Presents an error box to the user
     * with the Exception contents if one is thrown. Basically saves like 5 lines of boilerplate in
     * actions.
     * 
     * @param thrunnable
     */
    public static void messageBoxOnException(Thrunnable thrunnable) {try{__CLR4_5_2ezyezylx1h5s0h.R.inc(19455);
        __CLR4_5_2ezyezylx1h5s0h.R.inc(19456);try {
            __CLR4_5_2ezyezylx1h5s0h.R.inc(19457);thrunnable.thrun();
        }
        catch (Exception e) {
            __CLR4_5_2ezyezylx1h5s0h.R.inc(19458);MessageBoxes.errorBox(MainFrame.mainFrame, "Error", e);
        }
    }finally{__CLR4_5_2ezyezylx1h5s0h.R.flushNeeded();}}
}
