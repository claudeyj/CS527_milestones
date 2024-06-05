/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.handler.codec.string.StringEncoder;
import org.traccar.database.ActiveDevice;
import org.traccar.model.Command;

import javax.xml.bind.DatatypeConverter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class BaseProtocol implements Protocol {public static class __CLR4_5_25e5elwydzgx1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,244,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String name;
    private final Set<String> supportedDataCommands = new HashSet<>();
    private final Set<String> supportedTextCommands = new HashSet<>();

    private StringProtocolEncoder textCommandEncoder = null;

    public BaseProtocol(String name) {try{__CLR4_5_25e5elwydzgx1.R.inc(194);
        __CLR4_5_25e5elwydzgx1.R.inc(195);this.name = name;
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_25e5elwydzgx1.R.inc(196);
        __CLR4_5_25e5elwydzgx1.R.inc(197);return name;
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    public void setSupportedDataCommands(String... commands) {try{__CLR4_5_25e5elwydzgx1.R.inc(198);
        __CLR4_5_25e5elwydzgx1.R.inc(199);supportedDataCommands.addAll(Arrays.asList(commands));
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    public void setSupportedTextCommands(String... commands) {try{__CLR4_5_25e5elwydzgx1.R.inc(200);
        __CLR4_5_25e5elwydzgx1.R.inc(201);supportedTextCommands.addAll(Arrays.asList(commands));
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    public void setSupportedCommands(String... commands) {try{__CLR4_5_25e5elwydzgx1.R.inc(202);
        __CLR4_5_25e5elwydzgx1.R.inc(203);supportedDataCommands.addAll(Arrays.asList(commands));
        __CLR4_5_25e5elwydzgx1.R.inc(204);supportedTextCommands.addAll(Arrays.asList(commands));
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    @Override
    public Collection<String> getSupportedDataCommands() {try{__CLR4_5_25e5elwydzgx1.R.inc(205);
        __CLR4_5_25e5elwydzgx1.R.inc(206);Set<String> commands = new HashSet<>(supportedDataCommands);
        __CLR4_5_25e5elwydzgx1.R.inc(207);commands.add(Command.TYPE_CUSTOM);
        __CLR4_5_25e5elwydzgx1.R.inc(208);return commands;
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    @Override
    public Collection<String> getSupportedTextCommands() {try{__CLR4_5_25e5elwydzgx1.R.inc(209);
        __CLR4_5_25e5elwydzgx1.R.inc(210);Set<String> commands = new HashSet<>(supportedTextCommands);
        __CLR4_5_25e5elwydzgx1.R.inc(211);commands.add(Command.TYPE_CUSTOM);
        __CLR4_5_25e5elwydzgx1.R.inc(212);return commands;
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    @Override
    public void sendDataCommand(ActiveDevice activeDevice, Command command) {try{__CLR4_5_25e5elwydzgx1.R.inc(213);
        __CLR4_5_25e5elwydzgx1.R.inc(214);if ((((supportedDataCommands.contains(command.getType()))&&(__CLR4_5_25e5elwydzgx1.R.iget(215)!=0|true))||(__CLR4_5_25e5elwydzgx1.R.iget(216)==0&false))) {{
            __CLR4_5_25e5elwydzgx1.R.inc(217);activeDevice.write(command);
        } }else {__CLR4_5_25e5elwydzgx1.R.inc(218);if ((((command.getType().equals(Command.TYPE_CUSTOM))&&(__CLR4_5_25e5elwydzgx1.R.iget(219)!=0|true))||(__CLR4_5_25e5elwydzgx1.R.iget(220)==0&false))) {{
            __CLR4_5_25e5elwydzgx1.R.inc(221);String data = command.getString(Command.KEY_DATA);
            __CLR4_5_25e5elwydzgx1.R.inc(222);if ((((activeDevice.getChannel().getPipeline().get(StringEncoder.class) != null)&&(__CLR4_5_25e5elwydzgx1.R.iget(223)!=0|true))||(__CLR4_5_25e5elwydzgx1.R.iget(224)==0&false))) {{
                __CLR4_5_25e5elwydzgx1.R.inc(225);activeDevice.write(data);
            } }else {{
                __CLR4_5_25e5elwydzgx1.R.inc(226);activeDevice.write(ChannelBuffers.wrappedBuffer(DatatypeConverter.parseHexBinary(data)));
            }
        }} }else {{
            __CLR4_5_25e5elwydzgx1.R.inc(227);throw new RuntimeException("Command " + command.getType() + " is not supported in protocol " + getName());
        }
    }}}finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    public void setTextCommandEncoder(StringProtocolEncoder textCommandEncoder) {try{__CLR4_5_25e5elwydzgx1.R.inc(228);
        __CLR4_5_25e5elwydzgx1.R.inc(229);this.textCommandEncoder = textCommandEncoder;
    }finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

    @Override
    public void sendTextCommand(String destAddress, Command command) throws Exception {try{__CLR4_5_25e5elwydzgx1.R.inc(230);
        __CLR4_5_25e5elwydzgx1.R.inc(231);if ((((Context.getSmppManager() != null)&&(__CLR4_5_25e5elwydzgx1.R.iget(232)!=0|true))||(__CLR4_5_25e5elwydzgx1.R.iget(233)==0&false))) {{
            __CLR4_5_25e5elwydzgx1.R.inc(234);if ((((command.getType().equals(Command.TYPE_CUSTOM))&&(__CLR4_5_25e5elwydzgx1.R.iget(235)!=0|true))||(__CLR4_5_25e5elwydzgx1.R.iget(236)==0&false))) {{
                __CLR4_5_25e5elwydzgx1.R.inc(237);Context.getSmppManager().sendMessageSync(destAddress, command.getString(Command.KEY_DATA), true);
            } }else {__CLR4_5_25e5elwydzgx1.R.inc(238);if ((((supportedTextCommands.contains(command.getType()) && textCommandEncoder != null)&&(__CLR4_5_25e5elwydzgx1.R.iget(239)!=0|true))||(__CLR4_5_25e5elwydzgx1.R.iget(240)==0&false))) {{
                __CLR4_5_25e5elwydzgx1.R.inc(241);Context.getSmppManager().sendMessageSync(destAddress,
                        (String) textCommandEncoder.encodeCommand(command), true);
            } }else {{
                __CLR4_5_25e5elwydzgx1.R.inc(242);throw new RuntimeException(
                        "Command " + command.getType() + " is not supported in protocol " + getName());
            }
        }}} }else {{
            __CLR4_5_25e5elwydzgx1.R.inc(243);throw new RuntimeException("SMPP client is not enabled");
        }
    }}finally{__CLR4_5_25e5elwydzgx1.R.flushNeeded();}}

}
