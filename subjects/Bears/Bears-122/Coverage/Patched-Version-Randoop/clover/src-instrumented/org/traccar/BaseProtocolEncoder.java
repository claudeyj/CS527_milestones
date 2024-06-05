/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;
import org.traccar.helper.Log;
import org.traccar.model.Command;
import org.traccar.model.Device;

public abstract class BaseProtocolEncoder extends OneToOneEncoder {public static class __CLR4_5_2bhbhlwye5yil{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,444,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected String getUniqueId(long deviceId) {try{__CLR4_5_2bhbhlwye5yil.R.inc(413);
        __CLR4_5_2bhbhlwye5yil.R.inc(414);return Context.getIdentityManager().getById(deviceId).getUniqueId();
    }finally{__CLR4_5_2bhbhlwye5yil.R.flushNeeded();}}

    protected void initDevicePassword(Command command, String defaultPassword) {try{__CLR4_5_2bhbhlwye5yil.R.inc(415);
        __CLR4_5_2bhbhlwye5yil.R.inc(416);if ((((!command.getAttributes().containsKey(Command.KEY_DEVICE_PASSWORD))&&(__CLR4_5_2bhbhlwye5yil.R.iget(417)!=0|true))||(__CLR4_5_2bhbhlwye5yil.R.iget(418)==0&false))) {{
            __CLR4_5_2bhbhlwye5yil.R.inc(419);Device device = Context.getIdentityManager().getById(command.getDeviceId());
            __CLR4_5_2bhbhlwye5yil.R.inc(420);String password = device.getString(Command.KEY_DEVICE_PASSWORD);
            __CLR4_5_2bhbhlwye5yil.R.inc(421);if ((((password != null)&&(__CLR4_5_2bhbhlwye5yil.R.iget(422)!=0|true))||(__CLR4_5_2bhbhlwye5yil.R.iget(423)==0&false))) {{
                __CLR4_5_2bhbhlwye5yil.R.inc(424);command.set(Command.KEY_DEVICE_PASSWORD, password);
            } }else {{
                __CLR4_5_2bhbhlwye5yil.R.inc(425);command.set(Command.KEY_DEVICE_PASSWORD, defaultPassword);
            }
        }}
    }}finally{__CLR4_5_2bhbhlwye5yil.R.flushNeeded();}}

    @Override
    protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {try{__CLR4_5_2bhbhlwye5yil.R.inc(426);

        __CLR4_5_2bhbhlwye5yil.R.inc(427);if ((((msg instanceof Command)&&(__CLR4_5_2bhbhlwye5yil.R.iget(428)!=0|true))||(__CLR4_5_2bhbhlwye5yil.R.iget(429)==0&false))) {{
            __CLR4_5_2bhbhlwye5yil.R.inc(430);Command command = (Command) msg;
            __CLR4_5_2bhbhlwye5yil.R.inc(431);Object encodedCommand = encodeCommand(command);

            // Log command
            __CLR4_5_2bhbhlwye5yil.R.inc(432);StringBuilder s = new StringBuilder();
            __CLR4_5_2bhbhlwye5yil.R.inc(433);s.append(String.format("[%08X] ", channel.getId()));
            __CLR4_5_2bhbhlwye5yil.R.inc(434);s.append("id: ").append(getUniqueId(command.getDeviceId())).append(", ");
            __CLR4_5_2bhbhlwye5yil.R.inc(435);s.append("command type: ").append(command.getType()).append(" ");
            __CLR4_5_2bhbhlwye5yil.R.inc(436);if ((((encodedCommand != null)&&(__CLR4_5_2bhbhlwye5yil.R.iget(437)!=0|true))||(__CLR4_5_2bhbhlwye5yil.R.iget(438)==0&false))) {{
                __CLR4_5_2bhbhlwye5yil.R.inc(439);s.append("sent");
            } }else {{
                __CLR4_5_2bhbhlwye5yil.R.inc(440);s.append("not sent");
            }
            }__CLR4_5_2bhbhlwye5yil.R.inc(441);Log.info(s.toString());

            __CLR4_5_2bhbhlwye5yil.R.inc(442);return encodedCommand;
        }

        }__CLR4_5_2bhbhlwye5yil.R.inc(443);return msg;
    }finally{__CLR4_5_2bhbhlwye5yil.R.flushNeeded();}}

    protected abstract Object encodeCommand(Command command);

}
