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

import org.traccar.events.TextMessageEventHandler;
import org.traccar.helper.Log;

import com.cloudhopper.commons.charset.CharsetUtil;
import com.cloudhopper.smpp.SmppConstants;
import com.cloudhopper.smpp.impl.DefaultSmppSessionHandler;
import com.cloudhopper.smpp.pdu.DeliverSm;
import com.cloudhopper.smpp.pdu.PduRequest;
import com.cloudhopper.smpp.pdu.PduResponse;

public class ClientSmppSessionHandler extends DefaultSmppSessionHandler {public static class __CLR4_5_2j25j25lwydyl0f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,24728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private SmppClient smppClient;

    public ClientSmppSessionHandler(SmppClient smppClient) {try{__CLR4_5_2j25j25lwydyl0f.R.inc(24701);
        __CLR4_5_2j25j25lwydyl0f.R.inc(24702);this.smppClient = smppClient;
    }finally{__CLR4_5_2j25j25lwydyl0f.R.flushNeeded();}}

    @Override
    public void firePduRequestExpired(PduRequest pduRequest) {try{__CLR4_5_2j25j25lwydyl0f.R.inc(24703);
        __CLR4_5_2j25j25lwydyl0f.R.inc(24704);Log.warning("PDU request expired: " + pduRequest);
    }finally{__CLR4_5_2j25j25lwydyl0f.R.flushNeeded();}}

    @Override
    public PduResponse firePduRequestReceived(PduRequest request) {try{__CLR4_5_2j25j25lwydyl0f.R.inc(24705);
        __CLR4_5_2j25j25lwydyl0f.R.inc(24706);PduResponse response = null;
        __CLR4_5_2j25j25lwydyl0f.R.inc(24707);try {
            __CLR4_5_2j25j25lwydyl0f.R.inc(24708);if ((((request instanceof DeliverSm)&&(__CLR4_5_2j25j25lwydyl0f.R.iget(24709)!=0|true))||(__CLR4_5_2j25j25lwydyl0f.R.iget(24710)==0&false))) {{
                __CLR4_5_2j25j25lwydyl0f.R.inc(24711);if ((((request.getOptionalParameters() != null)&&(__CLR4_5_2j25j25lwydyl0f.R.iget(24712)!=0|true))||(__CLR4_5_2j25j25lwydyl0f.R.iget(24713)==0&false))) {{
                    __CLR4_5_2j25j25lwydyl0f.R.inc(24714);Log.debug("SMS Message Delivered: "
                            + request.getOptionalParameter(SmppConstants.TAG_RECEIPTED_MSG_ID).getValueAsString()
                            + ", State: "
                            + request.getOptionalParameter(SmppConstants.TAG_MSG_STATE).getValueAsByte());
                } }else {{
                    __CLR4_5_2j25j25lwydyl0f.R.inc(24715);String sourceAddress = ((DeliverSm) request).getSourceAddress().getAddress();
                    __CLR4_5_2j25j25lwydyl0f.R.inc(24716);String message = CharsetUtil.decode(((DeliverSm) request).getShortMessage(),
                            smppClient.mapDataCodingToCharset(((DeliverSm) request).getDataCoding()));
                    __CLR4_5_2j25j25lwydyl0f.R.inc(24717);Log.debug("SMS Message Received: " + message.trim() + ", Source Address: " + sourceAddress);
                    __CLR4_5_2j25j25lwydyl0f.R.inc(24718);TextMessageEventHandler.handleTextMessage(sourceAddress, message);
                }
            }}
            }__CLR4_5_2j25j25lwydyl0f.R.inc(24719);response = request.createResponse();
        } catch (Throwable error) {
            __CLR4_5_2j25j25lwydyl0f.R.inc(24720);Log.warning(error);
            __CLR4_5_2j25j25lwydyl0f.R.inc(24721);response = request.createResponse();
            __CLR4_5_2j25j25lwydyl0f.R.inc(24722);response.setResultMessage(error.getMessage());
            __CLR4_5_2j25j25lwydyl0f.R.inc(24723);response.setCommandStatus(SmppConstants.STATUS_UNKNOWNERR);
        }
        __CLR4_5_2j25j25lwydyl0f.R.inc(24724);return response;
    }finally{__CLR4_5_2j25j25lwydyl0f.R.flushNeeded();}}

    @Override
    public void fireChannelUnexpectedlyClosed() {try{__CLR4_5_2j25j25lwydyl0f.R.inc(24725);
        __CLR4_5_2j25j25lwydyl0f.R.inc(24726);Log.warning("SMPP session channel unexpectedly closed");
        __CLR4_5_2j25j25lwydyl0f.R.inc(24727);smppClient.scheduleReconnect();
    }finally{__CLR4_5_2j25j25lwydyl0f.R.flushNeeded();}}
}
