/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 05 04:39:10 GMT 2024
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TeltonikaProtocolDecoder_ESTest_scaffolding {static class __CLR4_5_2jbzjbzlx1dwn6x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,25089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() {try{__CLR4_5_2jbzjbzlx1dwn6x.R.inc(25055); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25056);org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.TeltonikaProtocolDecoder"; 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25057);org.evosuite.runtime.GuiSupport.initialize(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25058);org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25059);org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25060);org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25061);org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25062);org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25063);org.evosuite.runtime.classhandling.JDKClassResetter.init();
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25064);setSystemProperties();
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25065);initializeClasses();
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25066);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  }finally{__CLR4_5_2jbzjbzlx1dwn6x.R.flushNeeded();}} 

  @Before
  public void initTestCase(){try{__CLR4_5_2jbzjbzlx1dwn6x.R.inc(25067); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25068);threadStopper.storeCurrentThreads();
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25069);threadStopper.startRecordingTime();
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25070);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25071);org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25072);org.evosuite.runtime.GuiSupport.setHeadless(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25073);org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25074);org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  }finally{__CLR4_5_2jbzjbzlx1dwn6x.R.flushNeeded();}} 

  @After
  public void doneWithTestCase(){try{__CLR4_5_2jbzjbzlx1dwn6x.R.inc(25075); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25076);threadStopper.killAndJoinClientThreads();
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25077);org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25078);org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25079);resetClasses(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25080);org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25081);org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25082);org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  }finally{__CLR4_5_2jbzjbzlx1dwn6x.R.flushNeeded();}} 

  public static void setSystemProperties() {try{__CLR4_5_2jbzjbzlx1dwn6x.R.inc(25083);
 
    /*No java.lang.System property to set*/
  }finally{__CLR4_5_2jbzjbzlx1dwn6x.R.flushNeeded();}}

  private static void initializeClasses() {try{__CLR4_5_2jbzjbzlx1dwn6x.R.inc(25084);
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25085);org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TeltonikaProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.channel.local.LocalServerChannelFactory",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.traccar.database.ActiveDevice",
      "org.traccar.BaseProtocol",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.channel.group.ChannelGroupFuture",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.group.ChannelGroup",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.traccar.DeviceSession",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.jboss.netty.logging.InternalLogger",
      "org.traccar.model.Message",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.socket.DatagramChannel",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.traccar.model.Position",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.bootstrap.ConnectionlessBootstrap",
      "org.traccar.model.Extensible",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.ServerChannelFactory",
      "org.jboss.netty.channel.Channel",
      "org.traccar.protocol.TeltonikaProtocolDecoder",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.logging.JdkLogger",
      "org.traccar.protocol.TeltonikaProtocol",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.traccar.Protocol",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.ChannelFactory"
    );
  }finally{__CLR4_5_2jbzjbzlx1dwn6x.R.flushNeeded();}} 

  private static void resetClasses() {try{__CLR4_5_2jbzjbzlx1dwn6x.R.inc(25086);
    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25087);org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TeltonikaProtocolDecoder_ESTest_scaffolding.class.getClassLoader()); 

    __CLR4_5_2jbzjbzlx1dwn6x.R.inc(25088);org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.protocol.TeltonikaProtocolDecoder",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.EmptyChannelBuffer",
      "org.jboss.netty.buffer.ChannelBuffers",
      "com.ning.http.client.AsyncHttpClient",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "com.ning.http.util.MiscUtils",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "com.ning.http.client.ProxyServerSelector$1",
      "com.ning.http.client.ProxyServerSelector",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
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
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "org.traccar.Context",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.TeltonikaProtocol",
      "org.traccar.TrackerServer",
      "org.traccar.protocol.TeltonikaProtocol$1",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.traccar.database.ActiveDevice",
      "org.traccar.model.Extensible",
      "org.traccar.model.Message",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.traccar.Config",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "org.traccar.model.Position",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.local.LocalServerChannelSink$1",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture$1",
      "org.traccar.model.Device",
      "org.jboss.netty.channel.ChannelState"
    );
  }finally{__CLR4_5_2jbzjbzlx1dwn6x.R.flushNeeded();}}
}
