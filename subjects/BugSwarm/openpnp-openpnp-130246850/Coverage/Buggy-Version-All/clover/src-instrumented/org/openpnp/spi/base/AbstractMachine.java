/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.Icon;

import org.openpnp.machine.reference.vision.ReferenceBottomVision;
import org.openpnp.machine.reference.vision.ReferenceFiducialLocator;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Actuator;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.FiducialLocator;
import org.openpnp.spi.Head;
import org.openpnp.spi.JobPlanner;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.JobProcessor.Type;
import org.openpnp.spi.Machine;
import org.openpnp.spi.MachineListener;
import org.openpnp.spi.PartAlignment;
import org.openpnp.util.IdentifiableList;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.core.Commit;

import com.google.common.util.concurrent.FutureCallback;

public abstract class AbstractMachine implements Machine {public static class __CLR4_5_2ekrekrlx1h3br7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,19030,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * History:
     * 
     * Note: Can't actually use the @Version annotation because of a bug in SimpleXML. See
     * http://sourceforge.net/p/simple/mailman/message/27887562/
     * 
     * 1.0: Initial revision. 1.1: Added jobProcessors Map and deprecated JobProcesor and
     * JobPlanner.
     */

    @ElementList
    protected IdentifiableList<Head> heads = new IdentifiableList<>();

    @ElementList(required = false)
    protected IdentifiableList<Feeder> feeders = new IdentifiableList<>();

    @ElementList(required = false)
    protected IdentifiableList<Camera> cameras = new IdentifiableList<>();

    @ElementList(required = false)
    protected IdentifiableList<Actuator> actuators = new IdentifiableList<>();

    @Deprecated
    @Element(required = false)
    protected JobPlanner jobPlanner;

    @Deprecated
    @Element(required = false)
    protected JobProcessor jobProcessor;

    @ElementMap(entry = "jobProcessor", key = "type", attribute = true, inline = false,
            required = false)
    protected Map<JobProcessor.Type, JobProcessor> jobProcessors = new HashMap<>();

    @Element(required = false)
    protected PartAlignment partAlignment = new ReferenceBottomVision();

    @Element(required = false)
    protected FiducialLocator fiducialLocator = new ReferenceFiducialLocator();

    @Element(required = false)
    protected Location discardLocation = new Location(LengthUnit.Millimeters);

    @Attribute(required = false)
    protected double speed = 1.0D;

    protected Set<MachineListener> listeners = Collections.synchronizedSet(new HashSet<>());

    protected ThreadPoolExecutor executor;

    protected AbstractMachine() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18891);}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Commit
    private void commit() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18892);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18893);for (Head head : heads) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18894);head.setMachine(this);
        }
        }__CLR4_5_2ekrekrlx1h3br7.R.inc(18895);if ((((jobProcessors.isEmpty())&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18896)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18897)==0&false))) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18898);jobProcessors.put(JobProcessor.Type.PickAndPlace, jobProcessor);
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18899);jobProcessor = null;
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18900);jobPlanner = null;
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public List<Head> getHeads() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18901);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18902);return Collections.unmodifiableList(heads);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Head getHead(String id) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18903);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18904);return heads.get(id);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public List<Feeder> getFeeders() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18905);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18906);return Collections.unmodifiableList(feeders);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Feeder getFeeder(String id) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18907);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18908);return feeders.get(id);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public List<Camera> getCameras() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18909);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18910);return Collections.unmodifiableList(cameras);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Camera getCamera(String id) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18911);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18912);return cameras.get(id);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public List<Actuator> getActuators() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18913);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18914);return Collections.unmodifiableList(actuators);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Actuator getActuator(String id) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18915);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18916);return actuators.get(id);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Actuator getActuatorByName(String name) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18917);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18918);for (Actuator actuator : actuators) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18919);if ((((actuator.getName().equals(name))&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18920)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18921)==0&false))) {{
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18922);return actuator;
            }
        }}
        }__CLR4_5_2ekrekrlx1h3br7.R.inc(18923);return null;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void home() throws Exception {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18924);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18925);for (Head head : heads) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18926);head.home();
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void addListener(MachineListener listener) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18927);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18928);listeners.add(listener);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void removeListener(MachineListener listener) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18929);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18930);listeners.remove(listener);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void addFeeder(Feeder feeder) throws Exception {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18931);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18932);feeders.add(feeder);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void removeFeeder(Feeder feeder) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18933);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18934);feeders.remove(feeder);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void addCamera(Camera camera) throws Exception {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18935);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18936);cameras.add(camera);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void removeCamera(Camera camera) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18937);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18938);cameras.remove(camera);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Map<Type, JobProcessor> getJobProcessors() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18939);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18940);return Collections.unmodifiableMap(jobProcessors);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void fireMachineHeadActivity(Head head) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18941);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18942);for (MachineListener listener : listeners) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18943);listener.machineHeadActivity(this, head);
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void fireMachineEnabled() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18944);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18945);for (MachineListener listener : listeners) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18946);listener.machineEnabled(this);
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void fireMachineEnableFailed(String reason) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18947);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18948);for (MachineListener listener : listeners) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18949);listener.machineEnableFailed(this, reason);
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void fireMachineDisabled(String reason) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18950);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18951);for (MachineListener listener : listeners) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18952);listener.machineDisabled(this, reason);
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void fireMachineDisableFailed(String reason) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18953);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18954);for (MachineListener listener : listeners) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18955);listener.machineDisableFailed(this, reason);
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void fireMachineBusy(boolean busy) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18956);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18957);for (MachineListener listener : listeners) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18958);listener.machineBusy(this, busy);
        }
    }}finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18959);
        // TODO Auto-generated method stub
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18960);return null;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Future<Object> submit(Runnable runnable) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18961);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18962);return submit(Executors.callable(runnable));
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public <T> Future<T> submit(Callable<T> callable) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18963);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18964);return submit(callable, null);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public <T> Future<T> submit(final Callable<T> callable, final FutureCallback<T> callback) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18965);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18966);return submit(callable, callback, false);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public <T> Future<T> submit(final Callable<T> callable, final FutureCallback<T> callback,
            final boolean ignoreEnabled) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18967);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(18968);synchronized (this) {
            __CLR4_5_2ekrekrlx1h3br7.R.inc(18969);if ((((executor == null || executor.isShutdown())&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18970)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18971)==0&false))) {{
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18972);executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>());
            }
        }}

        __CLR4_5_2ekrekrlx1h3br7.R.inc(18973);Callable<T> wrapper = new Callable<T>() {
            public T call() throws Exception {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(18974);
                // TODO: lock driver

                // Notify listeners that the machine is now busy
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18975);fireMachineBusy(true);

                // Call the task, storing the result and exception if any
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18976);T result = null;
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18977);Exception exception = null;
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18978);try {
                    __CLR4_5_2ekrekrlx1h3br7.R.inc(18979);if ((((!ignoreEnabled && !isEnabled())&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18980)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18981)==0&false))) {{
                        __CLR4_5_2ekrekrlx1h3br7.R.inc(18982);throw new Exception("Machine has not been started.");
                    }
                    }__CLR4_5_2ekrekrlx1h3br7.R.inc(18983);result = callable.call();
                }
                catch (Exception e) {
                    __CLR4_5_2ekrekrlx1h3br7.R.inc(18984);exception = e;
                }

                // If a callback was supplied, call it with the results
                __CLR4_5_2ekrekrlx1h3br7.R.inc(18985);if ((((callback != null)&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18986)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18987)==0&false))) {{
                    __CLR4_5_2ekrekrlx1h3br7.R.inc(18988);if ((((exception != null)&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18989)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18990)==0&false))) {{
                        __CLR4_5_2ekrekrlx1h3br7.R.inc(18991);callback.onFailure(exception);
                    }
                    }else {{
                        __CLR4_5_2ekrekrlx1h3br7.R.inc(18992);callback.onSuccess(result);
                    }
                }}

                // If there was an error cancel all pending tasks.
                }__CLR4_5_2ekrekrlx1h3br7.R.inc(18993);if ((((exception != null)&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18994)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18995)==0&false))) {{
                    __CLR4_5_2ekrekrlx1h3br7.R.inc(18996);executor.shutdownNow();
                }

                // TODO: unlock driver

                // If no more tasks are scheduled notify listeners that
                // the machine is no longer busy
                }__CLR4_5_2ekrekrlx1h3br7.R.inc(18997);if ((((executor.getQueue().isEmpty())&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(18998)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(18999)==0&false))) {{
                    __CLR4_5_2ekrekrlx1h3br7.R.inc(19000);fireMachineBusy(false);
                }

                // Finally, fulfill the Future by either throwing the
                // exception or returning the result.
                }__CLR4_5_2ekrekrlx1h3br7.R.inc(19001);if ((((exception != null)&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(19002)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(19003)==0&false))) {{
                    __CLR4_5_2ekrekrlx1h3br7.R.inc(19004);throw exception;
                }
                }__CLR4_5_2ekrekrlx1h3br7.R.inc(19005);return result;
            }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}
        };

        __CLR4_5_2ekrekrlx1h3br7.R.inc(19006);return executor.submit(wrapper);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public Head getDefaultHead() throws Exception {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19007);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19008);List<Head> heads = getHeads();
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19009);if ((((heads == null || heads.isEmpty())&&(__CLR4_5_2ekrekrlx1h3br7.R.iget(19010)!=0|true))||(__CLR4_5_2ekrekrlx1h3br7.R.iget(19011)==0&false))) {{
            __CLR4_5_2ekrekrlx1h3br7.R.inc(19012);throw new Exception("No default head available.");
        }
        }__CLR4_5_2ekrekrlx1h3br7.R.inc(19013);return heads.get(0);
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public PartAlignment getPartAlignment() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19014);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19015);return partAlignment;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void setPartAlignment(PartAlignment partAlignment) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19016);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19017);this.partAlignment = partAlignment;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public FiducialLocator getFiducialLocator() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19018);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19019);return fiducialLocator;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void setFiducialLocator(FiducialLocator fiducialLocator) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19020);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19021);this.fiducialLocator = fiducialLocator;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public Location getDiscardLocation() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19022);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19023);return discardLocation;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    public void setDiscardLocation(Location discardLocation) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19024);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19025);this.discardLocation = discardLocation;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public void setSpeed(double speed) {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19026);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19027);this.speed = speed;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}

    @Override
    public double getSpeed() {try{__CLR4_5_2ekrekrlx1h3br7.R.inc(19028);
        __CLR4_5_2ekrekrlx1h3br7.R.inc(19029);return speed;
    }finally{__CLR4_5_2ekrekrlx1h3br7.R.flushNeeded();}}
}
