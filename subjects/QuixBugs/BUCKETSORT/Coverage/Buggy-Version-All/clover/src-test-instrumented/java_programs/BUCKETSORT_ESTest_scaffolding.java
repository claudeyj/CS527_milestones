/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 04 02:05:54 GMT 2024
 */

package java_programs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BUCKETSORT_ESTest_scaffolding {static class __CLR4_5_22k42k4lwzsbdz7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,3350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() {try{__CLR4_5_22k42k4lwzsbdz7.R.inc(3316); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3317);org.evosuite.runtime.RuntimeSettings.className = "java_programs.BUCKETSORT"; 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3318);org.evosuite.runtime.GuiSupport.initialize(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3319);org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3320);org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3321);org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3322);org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3323);org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3324);org.evosuite.runtime.classhandling.JDKClassResetter.init();
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3325);setSystemProperties();
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3326);initializeClasses();
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3327);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  }finally{__CLR4_5_22k42k4lwzsbdz7.R.flushNeeded();}} 

  @Before
  public void initTestCase(){try{__CLR4_5_22k42k4lwzsbdz7.R.inc(3328); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3329);threadStopper.storeCurrentThreads();
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3330);threadStopper.startRecordingTime();
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3331);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3332);org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3333);org.evosuite.runtime.GuiSupport.setHeadless(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3334);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3335);org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  }finally{__CLR4_5_22k42k4lwzsbdz7.R.flushNeeded();}} 

  @After
  public void doneWithTestCase(){try{__CLR4_5_22k42k4lwzsbdz7.R.inc(3336); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3337);threadStopper.killAndJoinClientThreads();
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3338);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3339);org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3340);resetClasses(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3341);org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3342);org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3343);org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  }finally{__CLR4_5_22k42k4lwzsbdz7.R.flushNeeded();}} 

  public static void setSystemProperties() {try{__CLR4_5_22k42k4lwzsbdz7.R.inc(3344);
 
    /*No java.lang.System property to set*/
  }finally{__CLR4_5_22k42k4lwzsbdz7.R.flushNeeded();}}

  private static void initializeClasses() {try{__CLR4_5_22k42k4lwzsbdz7.R.inc(3345);
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3346);org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BUCKETSORT_ESTest_scaffolding.class.getClassLoader() ,
      "java_programs.BUCKETSORT"
    );
  }finally{__CLR4_5_22k42k4lwzsbdz7.R.flushNeeded();}} 

  private static void resetClasses() {try{__CLR4_5_22k42k4lwzsbdz7.R.inc(3347);
    __CLR4_5_22k42k4lwzsbdz7.R.inc(3348);org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BUCKETSORT_ESTest_scaffolding.class.getClassLoader()); 

    __CLR4_5_22k42k4lwzsbdz7.R.inc(3349);org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "java_programs.BUCKETSORT"
    );
  }finally{__CLR4_5_22k42k4lwzsbdz7.R.flushNeeded();}}
}
