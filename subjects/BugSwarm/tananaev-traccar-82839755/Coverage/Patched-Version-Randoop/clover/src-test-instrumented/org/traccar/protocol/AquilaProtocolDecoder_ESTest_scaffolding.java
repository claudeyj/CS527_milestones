/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 05 02:20:58 GMT 2024
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AquilaProtocolDecoder_ESTest_scaffolding {static class __CLR4_5_2azqazqlx1e77y2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565580367L,8589935092L,14280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() {try{__CLR4_5_2azqazqlx1e77y2.R.inc(14246); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14247);org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.AquilaProtocolDecoder"; 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14248);org.evosuite.runtime.GuiSupport.initialize(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14249);org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14250);org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14251);org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14252);org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14253);org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14254);org.evosuite.runtime.classhandling.JDKClassResetter.init();
    __CLR4_5_2azqazqlx1e77y2.R.inc(14255);setSystemProperties();
    __CLR4_5_2azqazqlx1e77y2.R.inc(14256);initializeClasses();
    __CLR4_5_2azqazqlx1e77y2.R.inc(14257);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  }finally{__CLR4_5_2azqazqlx1e77y2.R.flushNeeded();}} 

  @Before
  public void initTestCase(){try{__CLR4_5_2azqazqlx1e77y2.R.inc(14258); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14259);threadStopper.storeCurrentThreads();
    __CLR4_5_2azqazqlx1e77y2.R.inc(14260);threadStopper.startRecordingTime();
    __CLR4_5_2azqazqlx1e77y2.R.inc(14261);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14262);org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14263);org.evosuite.runtime.GuiSupport.setHeadless(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14264);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14265);org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  }finally{__CLR4_5_2azqazqlx1e77y2.R.flushNeeded();}} 

  @After
  public void doneWithTestCase(){try{__CLR4_5_2azqazqlx1e77y2.R.inc(14266); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14267);threadStopper.killAndJoinClientThreads();
    __CLR4_5_2azqazqlx1e77y2.R.inc(14268);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14269);org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14270);resetClasses(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14271);org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14272);org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    __CLR4_5_2azqazqlx1e77y2.R.inc(14273);org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  }finally{__CLR4_5_2azqazqlx1e77y2.R.flushNeeded();}} 

  public static void setSystemProperties() {try{__CLR4_5_2azqazqlx1e77y2.R.inc(14274);
 
    /*No java.lang.System property to set*/
  }finally{__CLR4_5_2azqazqlx1e77y2.R.flushNeeded();}}

  private static void initializeClasses() {try{__CLR4_5_2azqazqlx1e77y2.R.inc(14275);
    __CLR4_5_2azqazqlx1e77y2.R.inc(14276);org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AquilaProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.traccar.database.ActiveDevice",
      "org.traccar.model.Event",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.traccar.BaseProtocol",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.traccar.protocol.AquilaProtocol",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.traccar.protocol.AquilaProtocolDecoder",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.ServerChannel",
      "org.traccar.model.Position",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.Channel",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.logging.JdkLogger",
      "org.traccar.model.Factory",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.traccar.Protocol",
      "org.jboss.netty.channel.local.LocalClientChannelFactory",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.ChannelFactory"
    );
  }finally{__CLR4_5_2azqazqlx1e77y2.R.flushNeeded();}} 

  private static void resetClasses() {try{__CLR4_5_2azqazqlx1e77y2.R.inc(14277);
    __CLR4_5_2azqazqlx1e77y2.R.inc(14278);org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AquilaProtocolDecoder_ESTest_scaffolding.class.getClassLoader()); 

    __CLR4_5_2azqazqlx1e77y2.R.inc(14279);org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.protocol.AquilaProtocolDecoder",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.AquilaProtocol",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.traccar.TrackerServer",
      "org.traccar.protocol.AquilaProtocol$1",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.jboss.netty.channel.Channels$1",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "com.ning.http.client.AsyncHttpClient",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "com.ning.http.util.MiscUtils",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "com.ning.http.client.ProxyServerSelector$1",
      "com.ning.http.client.ProxyServerSelector",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "org.traccar.Context",
      "org.traccar.protocol.HaicomProtocol",
      "org.traccar.helper.Log",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.traccar.model.Command",
      "org.traccar.model.Event",
      "org.traccar.model.Position"
    );
  }finally{__CLR4_5_2azqazqlx1e77y2.R.flushNeeded();}}
}
