/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton.tananaev@gmail.com)
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
package org.traccar.protocol;

import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class OsmAndProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2606606lx1dlpki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,7856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public OsmAndProtocolDecoder(OsmAndProtocol protocol) {
        super(protocol);__CLR4_5_2606606lx1dlpki.R.inc(7783);try{__CLR4_5_2606606lx1dlpki.R.inc(7782);
    }finally{__CLR4_5_2606606lx1dlpki.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2606606lx1dlpki.R.inc(7784);
        
        __CLR4_5_2606606lx1dlpki.R.inc(7785);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2606606lx1dlpki.R.inc(7786);QueryStringDecoder decoder = new QueryStringDecoder(request.getUri());
        __CLR4_5_2606606lx1dlpki.R.inc(7787);Map<String, List<String>> params = decoder.getParameters();
        __CLR4_5_2606606lx1dlpki.R.inc(7788);if ((((params.isEmpty())&&(__CLR4_5_2606606lx1dlpki.R.iget(7789)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7790)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7791);decoder = new QueryStringDecoder(
                    request.getContent().toString(Charset.defaultCharset()), false);
            __CLR4_5_2606606lx1dlpki.R.inc(7792);params = decoder.getParameters();
        }

        // Create new position
        }__CLR4_5_2606606lx1dlpki.R.inc(7793);Position position = new Position();
        __CLR4_5_2606606lx1dlpki.R.inc(7794);position.setProtocol(getProtocolName());

        // Identification
        __CLR4_5_2606606lx1dlpki.R.inc(7795);String id = params.get((((params.containsKey("id") )&&(__CLR4_5_2606606lx1dlpki.R.iget(7796)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7797)==0&false))? "id" : "deviceid").get(0);
        __CLR4_5_2606606lx1dlpki.R.inc(7798);if ((((!identify(id, channel))&&(__CLR4_5_2606606lx1dlpki.R.iget(7799)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7800)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7801);return null;
        }
        }__CLR4_5_2606606lx1dlpki.R.inc(7802);position.setDeviceId(getDeviceId());

        // Decode position
        __CLR4_5_2606606lx1dlpki.R.inc(7803);position.setValid(true);
        __CLR4_5_2606606lx1dlpki.R.inc(7804);if ((((params.containsKey("timestamp"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7805)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7806)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7807);try {
                __CLR4_5_2606606lx1dlpki.R.inc(7808);position.setTime(new Date(Long.valueOf(params.get("timestamp").get(0)) * 1000));
            } catch (NumberFormatException error) {
                __CLR4_5_2606606lx1dlpki.R.inc(7809);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                __CLR4_5_2606606lx1dlpki.R.inc(7810);position.setTime(dateFormat.parse(params.get("timestamp").get(0)));
            }
        } }else {{
            __CLR4_5_2606606lx1dlpki.R.inc(7811);position.setTime(new Date());
        }
        }__CLR4_5_2606606lx1dlpki.R.inc(7812);position.setLatitude(Double.valueOf(params.get("lat").get(0)));
        __CLR4_5_2606606lx1dlpki.R.inc(7813);position.setLongitude(Double.valueOf(params.get("lon").get(0)));

        // Optional parameters
        __CLR4_5_2606606lx1dlpki.R.inc(7814);if ((((params.containsKey("speed"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7815)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7816)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7817);position.setSpeed(Double.valueOf(params.get("speed").get(0)));
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7818);if ((((params.containsKey("bearing"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7819)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7820)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7821);position.setCourse(Double.valueOf(params.get("bearing").get(0)));
        } }else {__CLR4_5_2606606lx1dlpki.R.inc(7822);if ((((params.containsKey("heading"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7823)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7824)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7825);position.setCourse(Double.valueOf(params.get("heading").get(0)));
        }

        }}__CLR4_5_2606606lx1dlpki.R.inc(7826);if ((((params.containsKey("altitude"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7827)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7828)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7829);position.setAltitude(Double.valueOf(params.get("altitude").get(0)));
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7830);if ((((params.containsKey("hdop"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7831)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7832)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7833);position.set(Event.KEY_HDOP, params.get("hdop").get(0));
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7834);if ((((params.containsKey("vacc"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7835)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7836)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7837);position.set("vacc", params.get("vacc").get(0));
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7838);if ((((params.containsKey("hacc"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7839)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7840)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7841);position.set("hacc", params.get("hacc").get(0));
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7842);if ((((params.containsKey("batt"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7843)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7844)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7845);position.set(Event.KEY_BATTERY, params.get("batt").get(0));
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7846);if ((((params.containsKey("desc"))&&(__CLR4_5_2606606lx1dlpki.R.iget(7847)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7848)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7849);position.set("description", params.get("desc").get(0));
        }

        // Send response
        }__CLR4_5_2606606lx1dlpki.R.inc(7850);if ((((channel != null)&&(__CLR4_5_2606606lx1dlpki.R.iget(7851)!=0|true))||(__CLR4_5_2606606lx1dlpki.R.iget(7852)==0&false))) {{
            __CLR4_5_2606606lx1dlpki.R.inc(7853);HttpResponse response = new DefaultHttpResponse(
                    HttpVersion.HTTP_1_1, HttpResponseStatus.OK);
            __CLR4_5_2606606lx1dlpki.R.inc(7854);channel.write(response).addListener(ChannelFutureListener.CLOSE);
        }

        }__CLR4_5_2606606lx1dlpki.R.inc(7855);return position;
    }finally{__CLR4_5_2606606lx1dlpki.R.flushNeeded();}}

}
