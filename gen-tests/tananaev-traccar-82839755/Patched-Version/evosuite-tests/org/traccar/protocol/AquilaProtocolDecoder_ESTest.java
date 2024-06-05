/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 05 02:20:58 GMT 2024
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.AquilaProtocol;
import org.traccar.protocol.AquilaProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AquilaProtocolDecoder_ESTest extends AquilaProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AquilaProtocol aquilaProtocol0 = new AquilaProtocol();
      AquilaProtocolDecoder aquilaProtocolDecoder0 = new AquilaProtocolDecoder(aquilaProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 3395);
      try { 
        aquilaProtocolDecoder0.decode(localChannel0, inetSocketAddress0, defaultChannelPipeline0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jboss.netty.channel.DefaultChannelPipeline cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.AquilaProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AquilaProtocol aquilaProtocol0 = new AquilaProtocol();
      AquilaProtocolDecoder aquilaProtocolDecoder0 = new AquilaProtocolDecoder(aquilaProtocol0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("<zzb')!Z", 3067);
      Object object0 = aquilaProtocolDecoder0.decode((Channel) null, mockInetSocketAddress0, "<zzb')!Z");
      assertNull(object0);
  }
}