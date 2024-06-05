/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.traccar.BaseProtocolEncoder;
import org.traccar.helper.Checksum;
import org.traccar.helper.Log;
import org.traccar.model.Command;

@java.lang.SuppressWarnings({"fallthrough"}) public class CityeasyProtocolEncoder extends BaseProtocolEncoder {public static class __CLR4_5_280m80mlwye7e8x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,10426,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ChannelBuffer encodeContent(int type, ChannelBuffer content) {try{__CLR4_5_280m80mlwye7e8x.R.inc(10390);

        __CLR4_5_280m80mlwye7e8x.R.inc(10391);ChannelBuffer buf = ChannelBuffers.dynamicBuffer();

        __CLR4_5_280m80mlwye7e8x.R.inc(10392);buf.writeByte('S');
        __CLR4_5_280m80mlwye7e8x.R.inc(10393);buf.writeByte('S');
        __CLR4_5_280m80mlwye7e8x.R.inc(10394);buf.writeShort(2 + 2 + 2 + content.readableBytes() + 4 + 2 + 2);
        __CLR4_5_280m80mlwye7e8x.R.inc(10395);buf.writeShort(type);
        __CLR4_5_280m80mlwye7e8x.R.inc(10396);buf.writeBytes(content);
        __CLR4_5_280m80mlwye7e8x.R.inc(10397);buf.writeInt(0x0B);
        __CLR4_5_280m80mlwye7e8x.R.inc(10398);buf.writeShort(Checksum.crc16(Checksum.CRC16_KERMIT, buf.toByteBuffer()));
        __CLR4_5_280m80mlwye7e8x.R.inc(10399);buf.writeByte('\r');
        __CLR4_5_280m80mlwye7e8x.R.inc(10400);buf.writeByte('\n');

        __CLR4_5_280m80mlwye7e8x.R.inc(10401);return buf;
    }finally{__CLR4_5_280m80mlwye7e8x.R.flushNeeded();}}

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_280m80mlwye7e8x.R.inc(10402);

        __CLR4_5_280m80mlwye7e8x.R.inc(10403);ChannelBuffer content = ChannelBuffers.dynamicBuffer();

        boolean __CLB4_5_2_bool0=false;__CLR4_5_280m80mlwye7e8x.R.inc(10404);switch (command.getType()) {
            case Command.TYPE_POSITION_SINGLE:if (!__CLB4_5_2_bool0) {__CLR4_5_280m80mlwye7e8x.R.inc(10405);__CLB4_5_2_bool0=true;}
                __CLR4_5_280m80mlwye7e8x.R.inc(10406);return encodeContent(CityeasyProtocolDecoder.MSG_LOCATION_REQUEST, content);
            case Command.TYPE_POSITION_PERIODIC:if (!__CLB4_5_2_bool0) {__CLR4_5_280m80mlwye7e8x.R.inc(10407);__CLB4_5_2_bool0=true;}
                __CLR4_5_280m80mlwye7e8x.R.inc(10408);content.writeShort(command.getInteger(Command.KEY_FREQUENCY));
                __CLR4_5_280m80mlwye7e8x.R.inc(10409);return encodeContent(CityeasyProtocolDecoder.MSG_LOCATION_INTERVAL, content);
            case Command.TYPE_POSITION_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_280m80mlwye7e8x.R.inc(10410);__CLB4_5_2_bool0=true;}
                __CLR4_5_280m80mlwye7e8x.R.inc(10411);content.writeShort(0);
                __CLR4_5_280m80mlwye7e8x.R.inc(10412);return encodeContent(CityeasyProtocolDecoder.MSG_LOCATION_INTERVAL, content);
            case Command.TYPE_SET_TIMEZONE:if (!__CLB4_5_2_bool0) {__CLR4_5_280m80mlwye7e8x.R.inc(10413);__CLB4_5_2_bool0=true;}
                __CLR4_5_280m80mlwye7e8x.R.inc(10414);int timezone = command.getInteger(Command.KEY_TIMEZONE);
                __CLR4_5_280m80mlwye7e8x.R.inc(10415);if ((((timezone < 0)&&(__CLR4_5_280m80mlwye7e8x.R.iget(10416)!=0|true))||(__CLR4_5_280m80mlwye7e8x.R.iget(10417)==0&false))) {{
                    __CLR4_5_280m80mlwye7e8x.R.inc(10418);content.writeByte(1);
                } }else {{
                    __CLR4_5_280m80mlwye7e8x.R.inc(10419);content.writeByte(0);
                }
                }__CLR4_5_280m80mlwye7e8x.R.inc(10420);content.writeShort(Math.abs(timezone) / 60);
                __CLR4_5_280m80mlwye7e8x.R.inc(10421);return encodeContent(CityeasyProtocolDecoder.MSG_TIMEZONE, content);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_280m80mlwye7e8x.R.inc(10422);__CLB4_5_2_bool0=true;}
                __CLR4_5_280m80mlwye7e8x.R.inc(10423);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_280m80mlwye7e8x.R.inc(10424);break;
        }

        __CLR4_5_280m80mlwye7e8x.R.inc(10425);return null;
    }finally{__CLR4_5_280m80mlwye7e8x.R.flushNeeded();}}

}
