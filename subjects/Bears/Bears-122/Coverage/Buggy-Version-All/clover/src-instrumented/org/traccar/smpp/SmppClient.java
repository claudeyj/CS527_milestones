/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.smpp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.traccar.Context;
import org.traccar.helper.Log;

import com.cloudhopper.commons.charset.CharsetUtil;
import com.cloudhopper.smpp.SmppBindType;
import com.cloudhopper.smpp.SmppConstants;
import com.cloudhopper.smpp.SmppSession;
import com.cloudhopper.smpp.SmppSessionConfiguration;
import com.cloudhopper.smpp.impl.DefaultSmppClient;
import com.cloudhopper.smpp.impl.DefaultSmppSessionHandler;
import com.cloudhopper.smpp.pdu.SubmitSm;
import com.cloudhopper.smpp.pdu.SubmitSmResp;
import com.cloudhopper.smpp.type.Address;
import com.cloudhopper.smpp.type.RecoverablePduException;
import com.cloudhopper.smpp.type.SmppChannelException;
import com.cloudhopper.smpp.type.SmppTimeoutException;
import com.cloudhopper.smpp.type.UnrecoverablePduException;

@java.lang.SuppressWarnings({"fallthrough"}) public class SmppClient {public static class __CLR4_5_2j3ej3elwydzrgo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,24860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private SmppSessionConfiguration sessionConfig = new SmppSessionConfiguration();
    private SmppSession smppSession;
    private DefaultSmppSessionHandler sessionHandler = new ClientSmppSessionHandler(this);
    private ExecutorService executorService = Executors.newCachedThreadPool();
    private DefaultSmppClient clientBootstrap = new DefaultSmppClient(executorService, 1);

    private ScheduledExecutorService enquireLinkExecutor;
    private ScheduledFuture<?> enquireLinkTask;
    private Integer enquireLinkPeriod;
    private Integer enquireLinkTimeout;

    private ScheduledExecutorService reconnectionExecutor;
    private ScheduledFuture<?> reconnectionTask;
    private Integer reconnectionDelay;

    private String sourceAddress;
    private String commandSourceAddress;
    private int submitTimeout;
    private String notificationsCharsetName;
    private byte notificationsDataCoding;
    private String commandsCharsetName;
    private byte commandsDataCoding;

    private byte sourceTon;
    private byte sourceNpi;
    private byte commandSourceTon;
    private byte commandSourceNpi;

    private byte destTon;
    private byte destNpi;

    public SmppClient() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24746);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24747);sessionConfig.setName("Traccar.smppSession");
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24748);sessionConfig.setInterfaceVersion(
                (byte) Context.getConfig().getInteger("sms.smpp.version", SmppConstants.VERSION_3_4));
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24749);sessionConfig.setType(SmppBindType.TRANSCEIVER);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24750);sessionConfig.setHost(Context.getConfig().getString("sms.smpp.host", "localhost"));
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24751);sessionConfig.setPort(Context.getConfig().getInteger("sms.smpp.port", 2775));
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24752);sessionConfig.setSystemId(Context.getConfig().getString("sms.smpp.username", "user"));
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24753);sessionConfig.setPassword(Context.getConfig().getString("sms.smpp.password", "password"));
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24754);sessionConfig.getLoggingOptions().setLogBytes(false);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24755);sessionConfig.getLoggingOptions().setLogPdu(Context.getConfig().getBoolean("sms.smpp.logPdu"));

        __CLR4_5_2j3ej3elwydzrgo.R.inc(24756);sourceAddress = Context.getConfig().getString("sms.smpp.sourceAddress", "");
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24757);commandSourceAddress = Context.getConfig().getString("sms.smpp.commandSourceAddress", sourceAddress);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24758);submitTimeout = Context.getConfig().getInteger("sms.smpp.submitTimeout", 10000);

        __CLR4_5_2j3ej3elwydzrgo.R.inc(24759);notificationsCharsetName = Context.getConfig().getString("sms.smpp.notificationsCharset",
                CharsetUtil.NAME_UCS_2);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24760);notificationsDataCoding = (byte) Context.getConfig().getInteger("sms.smpp.notificationsDataCoding",
                SmppConstants.DATA_CODING_UCS2);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24761);commandsCharsetName = Context.getConfig().getString("sms.smpp.commandsCharset",
                CharsetUtil.NAME_GSM);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24762);commandsDataCoding = (byte) Context.getConfig().getInteger("sms.smpp.commandsDataCoding",
                SmppConstants.DATA_CODING_DEFAULT);


        __CLR4_5_2j3ej3elwydzrgo.R.inc(24763);sourceTon = (byte) Context.getConfig().getInteger("sms.smpp.sourceTon", SmppConstants.TON_ALPHANUMERIC);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24764);commandSourceTon = (byte) Context.getConfig().getInteger("sms.smpp.commandSourceTon", sourceTon);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24765);sourceNpi = (byte) Context.getConfig().getInteger("sms.smpp.sourceNpi", SmppConstants.NPI_UNKNOWN);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24766);commandSourceNpi = (byte) Context.getConfig().getInteger("sms.smpp.commandSourceNpi", sourceNpi);

        __CLR4_5_2j3ej3elwydzrgo.R.inc(24767);destTon = (byte) Context.getConfig().getInteger("sms.smpp.destTon", SmppConstants.TON_INTERNATIONAL);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24768);destNpi = (byte) Context.getConfig().getInteger("sms.smpp.destNpi", SmppConstants.NPI_E164);

        __CLR4_5_2j3ej3elwydzrgo.R.inc(24769);enquireLinkPeriod = Context.getConfig().getInteger("sms.smpp.enquireLinkPeriod", 60000);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24770);enquireLinkTimeout = Context.getConfig().getInteger("sms.smpp.enquireLinkTimeout", 10000);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24771);enquireLinkExecutor = Executors.newScheduledThreadPool(1, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24772);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24773);Thread thread = new Thread(runnable);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24774);String name = sessionConfig.getName();
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24775);thread.setName("EnquireLink-" + name);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24776);return thread;
            }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}
        });

        __CLR4_5_2j3ej3elwydzrgo.R.inc(24777);reconnectionDelay = Context.getConfig().getInteger("sms.smpp.reconnectionDelay", 10000);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24778);reconnectionExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24779);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24780);Thread thread = new Thread(runnable);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24781);String name = sessionConfig.getName();
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24782);thread.setName("Reconnection-" + name);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24783);return thread;
            }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}
        });

        __CLR4_5_2j3ej3elwydzrgo.R.inc(24784);scheduleReconnect();
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    public synchronized SmppSession getSession() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24785);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24786);return smppSession;
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    public String mapDataCodingToCharset(byte dataCoding) {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24787);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2j3ej3elwydzrgo.R.inc(24788);switch (dataCoding) {
            case SmppConstants.DATA_CODING_LATIN1:if (!__CLB4_5_2_bool0) {__CLR4_5_2j3ej3elwydzrgo.R.inc(24789);__CLB4_5_2_bool0=true;}
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24790);return CharsetUtil.NAME_ISO_8859_1;
            case SmppConstants.DATA_CODING_UCS2:if (!__CLB4_5_2_bool0) {__CLR4_5_2j3ej3elwydzrgo.R.inc(24791);__CLB4_5_2_bool0=true;}
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24792);return CharsetUtil.NAME_UCS_2;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2j3ej3elwydzrgo.R.inc(24793);__CLB4_5_2_bool0=true;}
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24794);return CharsetUtil.NAME_GSM;
        }
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    protected synchronized void reconnect() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24795);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24796);try {
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24797);disconnect();
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24798);smppSession = clientBootstrap.bind(sessionConfig, sessionHandler);
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24799);stopReconnectionkTask();
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24800);runEnquireLinkTask();
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24801);Log.info("SMPP session connected");
        } catch (SmppTimeoutException | SmppChannelException
                | UnrecoverablePduException | InterruptedException error) {
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24802);Log.warning("Unable to connect to SMPP server: ", error);
        }
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    public void scheduleReconnect() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24803);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24804);if ((((reconnectionTask == null || reconnectionTask.isDone())&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24805)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24806)==0&false))) {{
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24807);reconnectionTask = reconnectionExecutor.scheduleWithFixedDelay(
                    new ReconnectionTask(this),
                    reconnectionDelay, reconnectionDelay, TimeUnit.MILLISECONDS);
        }
    }}finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    private void stopReconnectionkTask() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24808);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24809);if ((((reconnectionTask != null)&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24810)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24811)==0&false))) {{
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24812);reconnectionTask.cancel(false);
        }
    }}finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    private void disconnect() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24813);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24814);stopEnquireLinkTask();
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24815);destroySession();
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    private void runEnquireLinkTask() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24816);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24817);enquireLinkTask = enquireLinkExecutor.scheduleWithFixedDelay(
                new EnquireLinkTask(this, enquireLinkTimeout),
                enquireLinkPeriod, enquireLinkPeriod, TimeUnit.MILLISECONDS);
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    private void stopEnquireLinkTask() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24818);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24819);if ((((enquireLinkTask != null)&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24820)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24821)==0&false))) {{
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24822);enquireLinkTask.cancel(true);
        }
    }}finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    private void destroySession() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24823);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24824);if ((((smppSession != null)&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24825)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24826)==0&false))) {{
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24827);Log.debug("Cleaning up SMPP session... ");
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24828);smppSession.destroy();
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24829);smppSession = null;
        }
    }}finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    public synchronized void sendMessageSync(String destAddress, String message, boolean command)
            throws RecoverablePduException, UnrecoverablePduException, SmppTimeoutException, SmppChannelException,
            InterruptedException, IllegalStateException {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24830);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24831);if ((((getSession() != null && getSession().isBound())&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24832)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24833)==0&false))) {{
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24834);SubmitSm submit = new SubmitSm();
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24835);byte[] textBytes;
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24836);textBytes = CharsetUtil.encode(message, (((command )&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24837)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24838)==0&false))? commandsCharsetName : notificationsCharsetName);
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24839);submit.setDataCoding((((command )&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24840)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24841)==0&false))? commandsDataCoding : notificationsDataCoding);
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24842);submit.setShortMessage(textBytes);
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24843);submit.setSourceAddress((((command )&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24844)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24845)==0&false))? new Address(commandSourceTon, commandSourceNpi, commandSourceAddress)
                    : new Address(sourceTon, sourceNpi, sourceAddress));
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24846);submit.setDestAddress(new Address(destTon, destNpi, destAddress));
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24847);SubmitSmResp submitResponce = getSession().submit(submit, submitTimeout);
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24848);if ((((submitResponce.getCommandStatus() == SmppConstants.STATUS_OK)&&(__CLR4_5_2j3ej3elwydzrgo.R.iget(24849)!=0|true))||(__CLR4_5_2j3ej3elwydzrgo.R.iget(24850)==0&false))) {{
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24851);Log.debug("SMS submitted, message id: " + submitResponce.getMessageId());
            } }else {{
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24852);throw new IllegalStateException(submitResponce.getResultMessage());
            }
        }} }else {{
            __CLR4_5_2j3ej3elwydzrgo.R.inc(24853);throw new SmppChannelException("SMPP session is not connected");
        }
    }}finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}

    public void sendMessageAsync(final String destAddress, final String message, final boolean command) {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24854);
        __CLR4_5_2j3ej3elwydzrgo.R.inc(24855);executorService.execute(new Runnable() {
            @Override
            public void run() {try{__CLR4_5_2j3ej3elwydzrgo.R.inc(24856);
                __CLR4_5_2j3ej3elwydzrgo.R.inc(24857);try {
                    __CLR4_5_2j3ej3elwydzrgo.R.inc(24858);sendMessageSync(destAddress, message, command);
                } catch (InterruptedException | RecoverablePduException | UnrecoverablePduException
                        | SmppTimeoutException | SmppChannelException | IllegalStateException error) {
                    __CLR4_5_2j3ej3elwydzrgo.R.inc(24859);Log.warning(error);
                }
            }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2j3ej3elwydzrgo.R.flushNeeded();}}
}
