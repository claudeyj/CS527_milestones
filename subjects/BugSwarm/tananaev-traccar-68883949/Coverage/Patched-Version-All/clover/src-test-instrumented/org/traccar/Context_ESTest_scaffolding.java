/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jun 03 04:27:50 GMT 2024
 */

package org.traccar;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Context_ESTest_scaffolding {static class __CLR4_5_28jo8jolx1dsoqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564902470L,8589935092L,11110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() {try{__CLR4_5_28jo8jolx1dsoqf.R.inc(11076); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11077);org.evosuite.runtime.RuntimeSettings.className = "org.traccar.Context"; 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11078);org.evosuite.runtime.GuiSupport.initialize(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11079);org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11080);org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11081);org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11082);org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11083);org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11084);org.evosuite.runtime.classhandling.JDKClassResetter.init();
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11085);setSystemProperties();
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11086);initializeClasses();
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11087);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  }finally{__CLR4_5_28jo8jolx1dsoqf.R.flushNeeded();}} 

  @Before
  public void initTestCase(){try{__CLR4_5_28jo8jolx1dsoqf.R.inc(11088); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11089);threadStopper.storeCurrentThreads();
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11090);threadStopper.startRecordingTime();
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11091);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11092);org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11093);org.evosuite.runtime.GuiSupport.setHeadless(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11094);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11095);org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  }finally{__CLR4_5_28jo8jolx1dsoqf.R.flushNeeded();}} 

  @After
  public void doneWithTestCase(){try{__CLR4_5_28jo8jolx1dsoqf.R.inc(11096); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11097);threadStopper.killAndJoinClientThreads();
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11098);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11099);org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11100);resetClasses(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11101);org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11102);org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11103);org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  }finally{__CLR4_5_28jo8jolx1dsoqf.R.flushNeeded();}} 

  public static void setSystemProperties() {try{__CLR4_5_28jo8jolx1dsoqf.R.inc(11104);
 
    /*No java.lang.System property to set*/
  }finally{__CLR4_5_28jo8jolx1dsoqf.R.flushNeeded();}}

  private static void initializeClasses() {try{__CLR4_5_28jo8jolx1dsoqf.R.inc(11105);
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11106);org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Context_ESTest_scaffolding.class.getClassLoader() ,
      "com.mchange.v2.cfg.BasicPropertiesConfigSource",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$ReplacedThreadInterruptor",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$ErrorLogger",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "com.mchange.v2.cfg.PropertiesConfigSource",
      "com.mchange.v2.log.FallbackMLog",
      "com.mchange.v2.cfg.MLogConfigSource",
      "org.traccar.database.ConnectionManager$DataCacheListener",
      "org.apache.log4j.Level",
      "com.mchange.v2.coalesce.CoalescerFactory",
      "com.mchange.v2.log.MLogClasses",
      "com.mchange.v2.c3p0.impl.PoolBackedDataSourceBase",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ResourceItselfInUseLockFetcher",
      "com.mchange.v2.cfg.MConfig$PathsKey",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner",
      "org.traccar.database.PermissionsManager",
      "com.mchange.v2.c3p0.AbstractConnectionTester",
      "com.mchange.v2.util.DoubleWeakHashMap$UserKeySet",
      "com.mchange.v2.cfg.DelayedLogItem",
      "com.mchange.v1.util.ArrayUtils",
      "com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask$1",
      "com.mchange.v2.log.jdk14logging.ForwardingLogger",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean",
      "org.eclipse.jetty.webapp.WebAppClassLoader$Context",
      "com.mchange.v2.log.MLevel",
      "com.mchange.v2.c3p0.impl.C3P0ImplUtils",
      "org.apache.log4j.Layout",
      "com.mchange.v2.c3p0.stmt.GooGooStatementCache",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$2",
      "org.eclipse.jetty.server.Handler",
      "org.eclipse.jetty.util.component.Destroyable",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$1PooledConnectionResourcePoolManager",
      "com.mchange.v2.ser.UnsupportedVersionException",
      "com.mchange.v2.beans.BeansUtils",
      "com.mchange.v2.resourcepool.BasicResourcePool$5",
      "com.mchange.v2.c3p0.impl.AuthMaskingProperties",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigFinder",
      "com.mchange.v2.c3p0.impl.WrapperConnectionPoolDataSourceBase",
      "com.mchange.v2.resourcepool.CannotAcquireResourceException",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$InfoLogger",
      "org.apache.log4j.Hierarchy",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$PoolThread",
      "org.traccar.Context",
      "org.traccar.database.DataManager",
      "org.traccar.model.User",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ThrowableHolderPool",
      "com.mchange.v2.cfg.DelayedLogItem$Level",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$1",
      "com.mchange.v2.cfg.MultiPropertiesConfig",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "com.mchange.v1.cachedstore.CachedStoreException",
      "org.eclipse.jetty.util.component.Dumpable",
      "com.mchange.v2.util.DoubleWeakHashMap",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ConnectionEventListenerImpl",
      "com.mchange.v2.resourcepool.BasicResourcePool$CheckIdleResourcesTask",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource",
      "com.mchange.v1.cachedstore.CachedStore$Manager",
      "com.mchange.v1.identicator.Identicator",
      "org.traccar.Protocol",
      "org.apache.log4j.helpers.OptionConverter",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$3",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$C3P0PooledConnectionNestedLockLockFetcher",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$2",
      "org.eclipse.jetty.util.component.AggregateLifeCycle",
      "org.traccar.database.ActiveDevice",
      "org.apache.log4j.or.ObjectRenderer",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$1",
      "org.traccar.helper.Log$1",
      "com.mchange.v2.resourcepool.NoGoodResourcesException",
      "com.mchange.v2.cfg.PropertiesConfig",
      "org.traccar.geocode.AddressFormat",
      "com.mchange.v1.identicator.IdentityHashCodeIdenticator",
      "com.mchange.v2.coalesce.WeakCcCoalescer",
      "com.mchange.v2.log.MLogger",
      "org.apache.log4j.Category",
      "com.mchange.v2.c3p0.cfg.NamedScope",
      "com.mchange.v2.encounter.EncounterCounter",
      "com.mchange.v1.cachedstore.NoCleanupCachedStore",
      "com.mchange.v2.c3p0.ConnectionTester",
      "com.mchange.v2.c3p0.cfg.C3P0Config",
      "com.mchange.v2.coalesce.Coalescer",
      "com.mchange.v2.management.ManagementUtils$2",
      "com.mchange.v2.resourcepool.ResourcePool",
      "com.mchange.v2.management.ManagementUtils$1",
      "com.mchange.v2.c3p0.cfg.DefaultC3P0ConfigFinder",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$OffLogger",
      "com.mchange.v1.util.ClosableResource",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource",
      "com.mchange.v1.identicator.IdHashKey",
      "com.mchange.v2.encounter.EncounterUtils",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPoolManager",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "com.mchange.v2.coalesce.CoalesceChecker",
      "com.mchange.v2.log.NameTransformer",
      "com.mchange.v2.encounter.GenericEncounterCounter",
      "com.mchange.v2.resourcepool.BasicResourcePoolFactory",
      "com.mchange.v2.util.DoubleWeakHashMap$WKey",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$QuerylessTestRunner",
      "org.traccar.model.Server",
      "org.traccar.database.ConnectionManager",
      "com.mchange.v2.c3p0.stmt.DoubleMaxStatementCache",
      "org.jboss.netty.bootstrap.ConnectionlessBootstrap",
      "com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase",
      "com.mchange.v2.c3p0.impl.AbstractIdentityTokenized",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.mchange.v2.c3p0.management.ManagementCoordinator",
      "org.apache.log4j.Priority",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$MaxIndividualTaskTimeEnforcer",
      "com.mchange.v2.c3p0.FullQueryConnectionTester",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "com.mchange.v1.identicator.IdWeakHashMap",
      "org.apache.log4j.LogManager",
      "com.mchange.v2.uid.UidUtils",
      "com.mchange.v2.naming.ReferenceIndirector",
      "org.eclipse.jetty.servlet.ServletContextHandler",
      "com.mchange.v2.log.slf4j.Slf4jMLog",
      "com.mchange.v1.cachedstore.CachedStoreFactory",
      "com.mchange.v1.identicator.WeakIdHashKey$Ref",
      "org.traccar.model.Event",
      "com.mchange.v2.c3p0.management.C3P0RegistryManager",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.mchange.v1.identicator.IdMap",
      "org.apache.log4j.or.RendererMap",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$LevelLogger",
      "org.traccar.database.QueryBuilder",
      "com.mchange.v2.async.AsynchronousRunner",
      "com.mchange.v2.cfg.PropertiesConfigSource$Parse",
      "com.mchange.v2.resourcepool.ResourcePoolException",
      "com.mchange.v2.coalesce.CoalesceIdenticator",
      "com.mchange.v2.naming.JavaBeanReferenceMaker",
      "com.mchange.v2.async.RunnableQueue",
      "com.mchange.v1.lang.BooleanUtils",
      "org.eclipse.jetty.server.HandlerContainer",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$DeadlockDetector",
      "org.traccar.model.Device",
      "com.mchange.v2.log.MLogConfig",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "com.mchange.v2.c3p0.UnifiedConnectionTester",
      "com.mchange.v2.c3p0.PooledDataSource",
      "org.apache.log4j.CategoryKey",
      "com.mchange.v2.c3p0.DriverManagerDataSource",
      "com.mchange.v2.util.ResourceClosedException",
      "com.mchange.v2.c3p0.stmt.GlobalMaxOnlyStatementCache",
      "com.mchange.v2.resourcepool.BasicResourcePool$CullTask",
      "org.traccar.helper.Log",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigUtils",
      "org.traccar.http.WebServer",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigXmlUtils",
      "com.mchange.v1.identicator.WeakIdHashKey",
      "com.mchange.v2.resourcepool.ResourcePool$Manager",
      "org.apache.log4j.helpers.Loader",
      "com.mchange.v2.cfg.ConfigUtils",
      "com.mchange.v2.c3p0.ComboPooledDataSource",
      "com.mchange.v2.ser.Indirector",
      "com.mchange.v2.log.MLogInitializationException",
      "org.eclipse.jetty.server.Server$Graceful",
      "com.mchange.lang.PotentiallySecondaryException",
      "org.traccar.geocode.ReverseGeocoder",
      "com.mchange.v2.log.MLog",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$TraceLogger",
      "org.apache.log4j.spi.RootLogger",
      "com.mchange.v2.lang.ObjectUtils",
      "org.jboss.netty.channel.Channel",
      "org.apache.log4j.spi.RendererSupport",
      "com.mchange.v2.c3p0.management.ActiveManagementCoordinator",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource$1",
      "com.mchange.v1.lang.Synchronizer$1",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource$1",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig$SystemPropertiesConfigSource",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean$1",
      "com.mchange.v2.coalesce.AbstractWeakCoalescer",
      "com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask",
      "org.eclipse.jetty.webapp.WebAppContext",
      "org.eclipse.jetty.util.Attributes",
      "com.mchange.v2.cfg.MConfig$CSManager",
      "org.eclipse.jetty.util.component.LifeCycle",
      "com.mchange.v2.c3p0.impl.C3P0Defaults",
      "com.mchange.v1.cachedstore.CachedStoreUtils",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$DebugLogger",
      "org.traccar.ServerManager",
      "com.mchange.v2.c3p0.management.C3P0RegistryManagerMBean",
      "com.mchange.v2.c3p0.impl.IdentityTokenized",
      "org.apache.log4j.Logger",
      "com.mchange.v2.c3p0.DriverManagerDataSource$1",
      "com.mchange.v2.encounter.EncounterUtils$1",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "com.mchange.v2.resourcepool.ResourcePoolFactory",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$InUseLockFetcher",
      "org.apache.log4j.helpers.LogLog",
      "com.mchange.v2.lang.Coerce",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$WarnLogger",
      "com.mchange.v2.ser.IndirectlySerialized",
      "com.mchange.v2.encounter.AbstractEncounterCounter",
      "com.mchange.v2.management.ManagementUtils",
      "com.mchange.v2.util.DoubleWeakHashMap$WVal",
      "com.mchange.v2.util.DoubleWeakHashMap$CheckKeyHolder",
      "org.apache.log4j.spi.RepositorySelector",
      "com.mchange.v1.cachedstore.CachedStore",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger",
      "com.mchange.v2.resourcepool.BasicResourcePool",
      "com.mchange.v1.cachedstore.WritableCachedStore",
      "org.apache.log4j.or.DefaultRenderer",
      "com.mchange.v2.c3p0.impl.DbAuth",
      "com.mchange.v2.c3p0.impl.IdentityTokenizedCoalesceChecker",
      "com.mchange.v2.log.MLog$1",
      "com.mchange.v2.resourcepool.TimeoutException",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "com.mchange.v2.c3p0.ConnectionCustomizer",
      "com.mchange.v2.naming.ReferenceMaker",
      "com.mchange.v2.c3p0.stmt.PerConnectionMaxOnlyStatementCache",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.apache.log4j.Appender",
      "com.mchange.lang.PotentiallySecondary",
      "com.mchange.v1.lang.Synchronizer",
      "org.traccar.model.Position",
      "com.mchange.v2.c3p0.C3P0Registry",
      "com.mchange.v1.cachedstore.TweakableCachedStore",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "com.mchange.v2.c3p0.QueryConnectionTester",
      "com.mchange.v2.c3p0.impl.IdentityTokenResolvable",
      "org.traccar.model.Factory",
      "com.mchange.v2.cfg.MConfig",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPoolManager$1ContextClassLoaderPoolsInitThread",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner$1"
    );
  }finally{__CLR4_5_28jo8jolx1dsoqf.R.flushNeeded();}} 

  private static void resetClasses() {try{__CLR4_5_28jo8jolx1dsoqf.R.inc(11107);
    __CLR4_5_28jo8jolx1dsoqf.R.inc(11108);org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Context_ESTest_scaffolding.class.getClassLoader()); 

    __CLR4_5_28jo8jolx1dsoqf.R.inc(11109);org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.Context",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.traccar.helper.Log",
      "org.traccar.database.DataManager",
      "com.mchange.v2.c3p0.impl.AbstractIdentityTokenized",
      "com.mchange.v2.c3p0.impl.IdentityTokenResolvable",
      "com.mchange.v2.log.MLogConfig",
      "com.mchange.v2.cfg.MLogConfigSource",
      "com.mchange.v2.cfg.ConfigUtils",
      "com.mchange.v2.cfg.DelayedLogItem",
      "com.mchange.v2.cfg.DelayedLogItem$Level",
      "com.mchange.v2.cfg.MultiPropertiesConfig",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig",
      "com.mchange.v2.cfg.BasicPropertiesConfigSource",
      "com.mchange.v2.cfg.PropertiesConfigSource$Parse",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig$SystemPropertiesConfigSource",
      "com.mchange.v2.log.MLogClasses",
      "com.mchange.v2.log.MLevel",
      "com.mchange.v2.log.slf4j.Slf4jMLog",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$TraceLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$DebugLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$InfoLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$WarnLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$ErrorLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$OffLogger",
      "com.mchange.v2.log.MLog$1",
      "com.mchange.v2.log.MLog",
      "com.mchange.v2.naming.JavaBeanReferenceMaker",
      "com.mchange.v2.naming.ReferenceIndirector",
      "com.mchange.v2.c3p0.impl.PoolBackedDataSourceBase",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource",
      "com.mchange.v2.c3p0.ComboPooledDataSource",
      "com.mchange.v2.c3p0.impl.C3P0Defaults",
      "com.mchange.v2.cfg.MConfig$CSManager",
      "com.mchange.v1.cachedstore.CachedStoreFactory",
      "com.mchange.v1.cachedstore.NoCleanupCachedStore",
      "com.mchange.v1.cachedstore.CachedStoreUtils",
      "com.mchange.v1.lang.Synchronizer",
      "com.mchange.v1.lang.Synchronizer$1",
      "com.mchange.v2.cfg.MConfig",
      "com.mchange.v2.cfg.MConfig$PathsKey",
      "com.mchange.v1.util.ArrayUtils",
      "com.mchange.v2.lang.ObjectUtils",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigXmlUtils",
      "com.mchange.v2.c3p0.cfg.DefaultC3P0ConfigFinder",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigUtils",
      "com.mchange.v2.lang.Coerce",
      "com.mchange.v2.c3p0.cfg.NamedScope",
      "com.mchange.v2.c3p0.cfg.C3P0Config",
      "com.mchange.v2.c3p0.impl.DbAuth",
      "com.mchange.v2.log.jdk14logging.ForwardingLogger",
      "com.mchange.v1.identicator.IdentityHashCodeIdenticator",
      "com.mchange.v2.encounter.EncounterUtils",
      "com.mchange.v2.encounter.AbstractEncounterCounter",
      "com.mchange.v2.encounter.GenericEncounterCounter",
      "com.mchange.v1.identicator.IdMap",
      "com.mchange.v1.identicator.IdWeakHashMap",
      "com.mchange.v2.encounter.EncounterUtils$1",
      "com.mchange.v2.uid.UidUtils",
      "com.mchange.v2.c3p0.impl.C3P0ImplUtils",
      "com.mchange.v1.identicator.IdHashKey",
      "com.mchange.v1.identicator.WeakIdHashKey",
      "com.mchange.v1.identicator.WeakIdHashKey$Ref",
      "com.mchange.v2.c3p0.impl.IdentityTokenizedCoalesceChecker",
      "com.mchange.v2.coalesce.CoalescerFactory",
      "com.mchange.v2.coalesce.AbstractWeakCoalescer",
      "com.mchange.v2.coalesce.WeakCcCoalescer",
      "com.mchange.v2.coalesce.CoalesceIdenticator",
      "com.mchange.v2.util.DoubleWeakHashMap",
      "com.mchange.v2.util.DoubleWeakHashMap$CheckKeyHolder",
      "com.mchange.v2.c3p0.AbstractConnectionTester",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$1",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$2",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$3",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner$1",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester",
      "com.mchange.v2.c3p0.management.ActiveManagementCoordinator",
      "com.mchange.v2.c3p0.C3P0Registry",
      "com.mchange.v2.c3p0.management.C3P0RegistryManager",
      "com.mchange.v2.util.DoubleWeakHashMap$UserKeySet",
      "com.mchange.v2.util.DoubleWeakHashMap$WKey",
      "com.mchange.v2.util.DoubleWeakHashMap$WVal",
      "com.mchange.v2.management.ManagementUtils$1",
      "com.mchange.v2.management.ManagementUtils$2",
      "com.mchange.v2.management.ManagementUtils",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean$1",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource$1",
      "com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase",
      "org.h2.Driver",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "org.postgresql.core.Logger",
      "org.postgresql.Driver",
      "com.mchange.v2.c3p0.DriverManagerDataSource",
      "com.mchange.v1.lang.BooleanUtils",
      "com.mchange.v2.c3p0.impl.AuthMaskingProperties",
      "com.mchange.v2.c3p0.DriverManagerDataSource$1",
      "com.mchange.v2.c3p0.impl.WrapperConnectionPoolDataSourceBase",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource$1",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$1",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$2",
      "org.traccar.database.ConnectionManager",
      "org.traccar.database.PermissionsManager",
      "org.apache.log4j.CategoryKey",
      "org.traccar.database.QueryBuilder",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPoolManager",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$DeadlockDetector",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$PoolThread",
      "com.mchange.v2.resourcepool.ResourcePoolFactory",
      "com.mchange.v2.resourcepool.BasicResourcePoolFactory",
      "com.mchange.v2.beans.BeansUtils",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ResourceItselfInUseLockFetcher",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$C3P0PooledConnectionNestedLockLockFetcher",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ConnectionEventListenerImpl",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ThrowableHolderPool",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$1PooledConnectionResourcePoolManager",
      "com.mchange.v2.resourcepool.BasicResourcePool",
      "com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask",
      "org.traccar.model.Server",
      "com.mchange.v2.resourcepool.BasicResourcePool$5"
    );
  }finally{__CLR4_5_28jo8jolx1dsoqf.R.flushNeeded();}}
}
