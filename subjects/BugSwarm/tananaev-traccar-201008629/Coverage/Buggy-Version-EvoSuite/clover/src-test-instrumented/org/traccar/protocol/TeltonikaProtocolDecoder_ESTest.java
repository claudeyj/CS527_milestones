/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file was automatically generated by EvoSuite
 * Wed Jun 05 04:39:10 GMT 2024
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
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.TeltonikaProtocol;
import org.traccar.protocol.TeltonikaProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TeltonikaProtocolDecoder_ESTest extends TeltonikaProtocolDecoder_ESTest_scaffolding {static class __CLR4_5_2jbgjbglx1dvh85{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,25055,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {__CLR4_5_2jbgjbglx1dvh85.R.globalSliceStart(getClass().getName(),25036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2156cmdjbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbgjbglx1dvh85.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbgjbglx1dvh85.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TeltonikaProtocolDecoder_ESTest.test0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2156cmdjbg() throws Throwable{try{__CLR4_5_2jbgjbglx1dvh85.R.inc(25036);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25037);TeltonikaProtocol teltonikaProtocol0 = new TeltonikaProtocol();
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25038);TeltonikaProtocolDecoder teltonikaProtocolDecoder0 = new TeltonikaProtocolDecoder(teltonikaProtocol0);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25039);Class<ChannelHandler> class0 = ChannelHandler.class;
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25040);InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("4aFcO'", 389);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25041);try { 
        __CLR4_5_2jbgjbglx1dvh85.R.inc(25042);teltonikaProtocolDecoder0.decode((Channel) null, inetSocketAddress0, class0);
        __CLR4_5_2jbgjbglx1dvh85.R.inc(25043);fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to org.jboss.netty.buffer.ChannelBuffer
         //
         __CLR4_5_2jbgjbglx1dvh85.R.inc(25044);verifyException("org.traccar.protocol.TeltonikaProtocolDecoder", e);
      }
  }finally{__CLR4_5_2jbgjbglx1dvh85.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {__CLR4_5_2jbgjbglx1dvh85.R.globalSliceStart(getClass().getName(),25045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beujbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbgjbglx1dvh85.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbgjbglx1dvh85.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TeltonikaProtocolDecoder_ESTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beujbp() throws Throwable{try{__CLR4_5_2jbgjbglx1dvh85.R.inc(25045);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25046);TeltonikaProtocolDecoder teltonikaProtocolDecoder0 = new TeltonikaProtocolDecoder((TeltonikaProtocol) null);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25047);DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25048);DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25049);LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25050);MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("operator", 7);
      __CLR4_5_2jbgjbglx1dvh85.R.inc(25051);try { 
        __CLR4_5_2jbgjbglx1dvh85.R.inc(25052);teltonikaProtocolDecoder0.decode(localServerChannel0, mockInetSocketAddress0, (Object) null);
        __CLR4_5_2jbgjbglx1dvh85.R.inc(25053);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_5_2jbgjbglx1dvh85.R.inc(25054);verifyException("org.traccar.protocol.TeltonikaProtocolDecoder", e);
      }
  }finally{__CLR4_5_2jbgjbglx1dvh85.R.flushNeeded();}}
}
