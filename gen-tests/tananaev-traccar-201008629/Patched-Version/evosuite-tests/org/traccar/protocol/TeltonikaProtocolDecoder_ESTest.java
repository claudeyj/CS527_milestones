/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 05 04:42:18 GMT 2024
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.TeltonikaProtocol;
import org.traccar.protocol.TeltonikaProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TeltonikaProtocolDecoder_ESTest extends TeltonikaProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TeltonikaProtocol teltonikaProtocol0 = new TeltonikaProtocol();
      TeltonikaProtocolDecoder teltonikaProtocolDecoder0 = new TeltonikaProtocolDecoder(teltonikaProtocol0);
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(709);
      try { 
        teltonikaProtocolDecoder0.decode(localServerChannel0, mockInetSocketAddress0, localServerChannel0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jboss.netty.channel.local.DefaultLocalServerChannel cannot be cast to org.jboss.netty.buffer.ChannelBuffer
         //
         verifyException("org.traccar.protocol.TeltonikaProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TeltonikaProtocol teltonikaProtocol0 = new TeltonikaProtocol();
      TeltonikaProtocolDecoder teltonikaProtocolDecoder0 = new TeltonikaProtocolDecoder(teltonikaProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("!", 0);
      try { 
        teltonikaProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.TeltonikaProtocolDecoder", e);
      }
  }
}