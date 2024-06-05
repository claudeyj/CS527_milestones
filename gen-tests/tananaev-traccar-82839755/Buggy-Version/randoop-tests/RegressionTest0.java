import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext3, channelEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean15 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext16, channelEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext18, channelEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11, true);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel20);
        org.jboss.netty.channel.Channel channel23 = null;
        java.net.SocketAddress socketAddress24 = null;
        boolean boolean26 = aquilaProtocolDecoder1.identify("", channel23, socketAddress24, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext17, channelEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        boolean boolean13 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        java.net.SocketAddress socketAddress19 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        org.jboss.netty.channel.Channel channel23 = null;
        java.net.SocketAddress socketAddress24 = null;
        boolean boolean25 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24);
        boolean boolean26 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        java.net.SocketAddress socketAddress19 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        org.jboss.netty.channel.Channel channel23 = null;
        java.net.SocketAddress socketAddress24 = null;
        boolean boolean25 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel9 = null;
        boolean boolean10 = aquilaProtocolDecoder1.identify("hi!", channel9);
        long long11 = aquilaProtocolDecoder1.getDeviceId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        long long17 = aquilaProtocolDecoder1.getDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("hi!", channel13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        java.net.SocketAddress socketAddress19 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext22, channelEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext20, channelEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean15 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14);
        long long16 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel18 = null;
        boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        org.jboss.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel8, socketAddress9, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        java.net.SocketAddress socketAddress19 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel18, socketAddress19, true);
        org.jboss.netty.channel.Channel channel23 = null;
        java.net.SocketAddress socketAddress24 = null;
        boolean boolean26 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24, true);
        java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        java.net.SocketAddress socketAddress21 = null;
        boolean boolean22 = aquilaProtocolDecoder1.identify("", channel20, socketAddress21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        org.jboss.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel19, socketAddress20);
        boolean boolean22 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        org.jboss.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("hi!", channel19, socketAddress20);
        org.jboss.netty.channel.Channel channel23 = null;
        java.net.SocketAddress socketAddress24 = null;
        boolean boolean26 = aquilaProtocolDecoder1.identify("hi!", channel23, socketAddress24, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        long long13 = aquilaProtocolDecoder1.getDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel9 = null;
        boolean boolean10 = aquilaProtocolDecoder1.identify("hi!", channel9);
        org.jboss.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        boolean boolean15 = aquilaProtocolDecoder1.identify("hi!", channel12, socketAddress13, false);
        boolean boolean16 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        boolean boolean18 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        java.net.SocketAddress socketAddress21 = null;
        boolean boolean22 = aquilaProtocolDecoder1.identify("", channel20, socketAddress21);
        org.jboss.netty.channel.Channel channel24 = null;
        boolean boolean25 = aquilaProtocolDecoder1.identify("hi!", channel24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        org.jboss.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        boolean boolean22 = aquilaProtocolDecoder1.identify("", channel19, socketAddress20, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        long long12 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.jboss.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("", channel3, socketAddress4, false);
        boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel9 = null;
        boolean boolean10 = aquilaProtocolDecoder1.identify("hi!", channel9);
        org.jboss.netty.channel.Channel channel12 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("", channel12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        long long20 = aquilaProtocolDecoder1.getDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean13 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel20);
        long long22 = aquilaProtocolDecoder1.getDeviceId();
        long long23 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel25 = null;
        boolean boolean26 = aquilaProtocolDecoder1.identify("", channel25);
        org.jboss.netty.channel.Channel channel28 = null;
        java.net.SocketAddress socketAddress29 = null;
        boolean boolean31 = aquilaProtocolDecoder1.identify("", channel28, socketAddress29, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean6 = aquilaProtocolDecoder1.identify("hi!", channel4, socketAddress5);
        boolean boolean7 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        org.jboss.netty.channel.Channel channel19 = null;
        boolean boolean20 = aquilaProtocolDecoder1.identify("", channel19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        org.jboss.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("hi!", channel19, socketAddress20);
        long long22 = aquilaProtocolDecoder1.getDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14, false);
        org.jboss.netty.channel.Channel channel18 = null;
        java.net.SocketAddress socketAddress19 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("hi!", channel18, socketAddress19, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("", channel10, socketAddress11, true);
        boolean boolean14 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        java.net.SocketAddress socketAddress21 = null;
        boolean boolean23 = aquilaProtocolDecoder1.identify("hi!", channel20, socketAddress21, true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent25 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext24, channelEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel14 = null;
        boolean boolean15 = aquilaProtocolDecoder1.identify("hi!", channel14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        org.jboss.netty.channel.Channel channel18 = null;
        boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        org.jboss.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel19, socketAddress20);
        org.jboss.netty.channel.Channel channel23 = null;
        boolean boolean24 = aquilaProtocolDecoder1.identify("", channel23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        long long9 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            aquilaProtocolDecoder1.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean9 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean10 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean11 = aquilaProtocolDecoder1.hasDeviceId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean12 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10, true);
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel14, socketAddress15, false);
        boolean boolean18 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        java.net.SocketAddress socketAddress21 = null;
        boolean boolean23 = aquilaProtocolDecoder1.identify("hi!", channel20, socketAddress21, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("", channel16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        boolean boolean21 = aquilaProtocolDecoder1.identify("", channel20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        boolean boolean15 = aquilaProtocolDecoder1.identify("", channel13, socketAddress14);
        org.jboss.netty.channel.Channel channel17 = null;
        java.net.SocketAddress socketAddress18 = null;
        boolean boolean20 = aquilaProtocolDecoder1.identify("hi!", channel17, socketAddress18, false);
        org.jboss.netty.channel.Channel channel22 = null;
        java.net.SocketAddress socketAddress23 = null;
        boolean boolean24 = aquilaProtocolDecoder1.identify("hi!", channel22, socketAddress23);
        org.jboss.netty.channel.Channel channel26 = null;
        boolean boolean27 = aquilaProtocolDecoder1.identify("", channel26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        boolean boolean13 = aquilaProtocolDecoder1.identify("hi!", channel10, socketAddress11, true);
        org.jboss.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        boolean boolean17 = aquilaProtocolDecoder1.identify("hi!", channel15, socketAddress16);
        long long18 = aquilaProtocolDecoder1.getDeviceId();
        org.jboss.netty.channel.Channel channel20 = null;
        java.net.SocketAddress socketAddress21 = null;
        boolean boolean23 = aquilaProtocolDecoder1.identify("", channel20, socketAddress21, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean9 = aquilaProtocolDecoder1.hasDeviceId();
        boolean boolean10 = aquilaProtocolDecoder1.hasDeviceId();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        org.jboss.netty.channel.Channel channel13 = null;
        boolean boolean14 = aquilaProtocolDecoder1.identify("", channel13);
        org.jboss.netty.channel.Channel channel16 = null;
        java.net.SocketAddress socketAddress17 = null;
        boolean boolean19 = aquilaProtocolDecoder1.identify("hi!", channel16, socketAddress17, true);
        org.jboss.netty.channel.Channel channel21 = null;
        java.net.SocketAddress socketAddress22 = null;
        boolean boolean24 = aquilaProtocolDecoder1.identify("", channel21, socketAddress22, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        boolean boolean8 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        boolean boolean7 = aquilaProtocolDecoder1.identify("", channel4, socketAddress5, false);
        org.jboss.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        boolean boolean11 = aquilaProtocolDecoder1.identify("hi!", channel9, socketAddress10);
        boolean boolean12 = aquilaProtocolDecoder1.hasDeviceId();
        org.jboss.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        boolean boolean16 = aquilaProtocolDecoder1.identify("hi!", channel14, socketAddress15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

