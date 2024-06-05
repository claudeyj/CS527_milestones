/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 05 02:18:31 GMT 2024
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AquilaProtocolDecoder_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.AquilaProtocolDecoder"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AquilaProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.traccar.database.ActiveDevice",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.traccar.model.Event",
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
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AquilaProtocolDecoder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.protocol.AquilaProtocolDecoder",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.AquilaProtocol",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
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
      "org.traccar.model.Command",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteTask",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteRequestQueue",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
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
      "org.traccar.protocol.Avl301Protocol",
      "org.jboss.netty.channel.ChannelState",
      "org.traccar.model.Event",
      "org.traccar.model.Position"
    );
  }
}
