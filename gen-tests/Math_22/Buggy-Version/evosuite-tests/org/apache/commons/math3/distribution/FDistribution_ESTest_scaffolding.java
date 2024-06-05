/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 05 01:31:31 GMT 2024
 */

package org.apache.commons.math3.distribution;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FDistribution_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.distribution.FDistribution"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FDistribution_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.special.Gamma$1",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.analysis.solvers.BrentSolver",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.distribution.AbstractRealDistribution$1",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolver",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.distribution.RealDistribution",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.distribution.FDistribution",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.distribution.AbstractRealDistribution",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.random.RandomData",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.special.Beta",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.random.RandomDataGenerator",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.special.Beta$1",
      "org.apache.commons.math3.exception.NoBracketingException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FDistribution_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.distribution.AbstractRealDistribution",
      "org.apache.commons.math3.distribution.FDistribution",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.random.RandomDataGenerator",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.random.AbstractRandomGenerator",
      "org.apache.commons.math3.random.TestRandomGenerator",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.special.Beta",
      "org.apache.commons.math3.distribution.AbstractRealDistribution$1",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.BrentSolver",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.special.Beta$1",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.exception.NoBracketingException",
      "org.apache.commons.math3.random.RandomAdaptorTest$ConstantGenerator",
      "org.apache.commons.math3.random.RandomAdaptor"
    );
  }
}
