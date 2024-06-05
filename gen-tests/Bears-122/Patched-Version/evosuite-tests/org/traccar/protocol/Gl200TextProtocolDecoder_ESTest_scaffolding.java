/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jun 03 03:06:42 GMT 2024
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Gl200TextProtocolDecoder_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.Gl200TextProtocolDecoder"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Gl200TextProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.traccar.BaseProtocol",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$TreeNode",
      "com.ning.http.client.providers.netty.channel.ChannelManager$7",
      "com.ning.http.client.providers.netty.channel.ChannelManager$8",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.traccar.database.BaseObjectManager",
      "org.traccar.StringProtocolEncoder",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "org.jboss.netty.channel.ChannelFutureListener",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$NettyWebSocketFactory",
      "org.traccar.database.UsersManager",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.traccar.Config",
      "org.traccar.model.BaseModel",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Fun",
      "org.traccar.model.Device",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.socket.nio.BossPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Segment",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.socket.Worker",
      "org.jboss.netty.channel.group.ChannelGroup",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.traccar.geocoder.Geocoder",
      "org.jboss.netty.channel.socket.nio.Boss",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$SendBuffer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.traccar.database.AttributesManager",
      "com.ning.http.client.listenable.AbstractListenableFuture",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "org.traccar.database.GroupsManager",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.channel.socket.nio.NioSelector",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.protocol.Gl200Protocol",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "org.traccar.database.CalendarManager",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ValuesView",
      "org.traccar.Context",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelHandler",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.util.Timeout",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "org.traccar.database.ExtendedObjectManager",
      "com.ning.http.client.providers.netty.handler.ConnectionStrategy",
      "org.jboss.netty.channel.Channel",
      "com.ning.http.client.ProxyServerSelector$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.channel.AbstractChannel",
      "com.ning.http.client.filter.FilterException",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "org.jboss.netty.logging.JdkLogger",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.traccar.Protocol",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider$1",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.traccar.database.ActiveDevice",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.traccar.helper.PatternBuilder",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.jboss.netty.channel.group.ChannelGroupFuture",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CollectionView",
      "org.traccar.database.DeviceManager",
      "org.jboss.netty.channel.socket.nio.WorkerPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$TreeBin",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.traccar.model.ExtendedModel",
      "org.jboss.netty.channel.ConnectTimeoutException",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "com.ning.http.util.MiscUtils",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.Channels",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.HttpResponseBodyPart",
      "com.ning.http.client.SSLEngineFactory",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.traccar.database.GeofenceManager",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "com.ning.http.client.providers.netty.response.NettyResponseHeaders",
      "org.traccar.protocol.Gl200TextProtocolDecoder",
      "com.ning.http.client.ProxyServerSelector",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ForwardingNode",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "com.ning.http.client.providers.jdk.JDKFuture",
      "com.ning.http.client.AsyncHttpProvider",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.database.DriversManager",
      "org.traccar.database.IdentityManager",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CounterCell",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ReservationNode",
      "org.jboss.netty.util.Timer",
      "org.jboss.netty.channel.socket.SocketChannel",
      "com.ning.http.client.AsyncHandler",
      "org.jboss.netty.logging.InternalLogger",
      "com.ning.http.client.providers.netty.response.NettyResponseStatus",
      "com.ning.http.client.providers.netty.Callback",
      "com.ning.http.client.providers.netty.response.NettyResponseBodyPart",
      "org.traccar.model.Message",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "com.ning.http.client.HttpResponseHeaders",
      "com.ning.http.client.providers.netty.channel.pool.ChannelPool",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.traccar.database.ManagableObjects",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Node",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.channel.socket.nio.NioSelectorPool",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.Channels$1",
      "com.ning.http.client.providers.netty.request.body.NettyBody",
      "com.ning.http.client.AsyncHttpClient",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "com.ning.http.client.ListenableFuture",
      "org.jboss.netty.util.TimerTask",
      "org.jboss.netty.bootstrap.ConnectionlessBootstrap",
      "org.traccar.geolocation.GeolocationProvider",
      "com.ning.http.client.providers.netty.handler.WebSocketProtocol",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$KeySetView",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "com.ning.http.client.HttpResponseStatus",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "com.ning.http.client.AsyncHttpProviderConfig",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.traccar.database.SimpleObjectManager",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$EntrySetView",
      "com.ning.http.client.providers.jdk.JDKDelegateFuture",
      "org.jboss.netty.channel.MessageEvent",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.ChannelFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Gl200TextProtocolDecoder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.helper.PatternBuilder",
      "org.traccar.protocol.Gl200TextProtocolDecoder",
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
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.Gl200Protocol",
      "org.traccar.TrackerServer",
      "org.traccar.protocol.Gl200Protocol$1",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.traccar.model.BaseModel",
      "org.traccar.model.ExtendedModel",
      "org.traccar.model.Message",
      "org.traccar.model.Command",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.StringProtocolEncoder",
      "org.traccar.protocol.WialonProtocolEncoder"
    );
  }
}
