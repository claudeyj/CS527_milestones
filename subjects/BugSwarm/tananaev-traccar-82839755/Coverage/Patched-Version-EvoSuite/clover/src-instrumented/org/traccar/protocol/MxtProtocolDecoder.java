/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.Date;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class MxtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25x85x8lx1e68s0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,7763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MxtProtocolDecoder(MxtProtocol protocol) {
        super(protocol);__CLR4_5_25x85x8lx1e68s0.R.inc(7677);try{__CLR4_5_25x85x8lx1e68s0.R.inc(7676);
    }finally{__CLR4_5_25x85x8lx1e68s0.R.flushNeeded();}}

    private static final int MSG_ACK = 0x02;
    private static final int MSG_NACK = 0x03;
    private static final int MSG_POSITION = 0x31;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_25x85x8lx1e68s0.R.inc(7678);

        __CLR4_5_25x85x8lx1e68s0.R.inc(7679);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25x85x8lx1e68s0.R.inc(7680);buf.readUnsignedByte(); // start
        __CLR4_5_25x85x8lx1e68s0.R.inc(7681);buf.readUnsignedByte(); // device descriptor
        __CLR4_5_25x85x8lx1e68s0.R.inc(7682);int type = buf.readUnsignedByte();

        __CLR4_5_25x85x8lx1e68s0.R.inc(7683);String id = String.valueOf(buf.readUnsignedInt());
        __CLR4_5_25x85x8lx1e68s0.R.inc(7684);if ((((!identify(id, channel))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7685)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7686)==0&false))) {{
            __CLR4_5_25x85x8lx1e68s0.R.inc(7687);return null;
        }

        }__CLR4_5_25x85x8lx1e68s0.R.inc(7688);if ((((type == MSG_POSITION)&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7689)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7690)==0&false))) {{

            __CLR4_5_25x85x8lx1e68s0.R.inc(7691);Position position = new Position();
            __CLR4_5_25x85x8lx1e68s0.R.inc(7692);position.setProtocol(getProtocolName());
            __CLR4_5_25x85x8lx1e68s0.R.inc(7693);position.setDeviceId(getDeviceId());

            __CLR4_5_25x85x8lx1e68s0.R.inc(7694);buf.readUnsignedByte(); // protocol
            __CLR4_5_25x85x8lx1e68s0.R.inc(7695);int infoGroups = buf.readUnsignedByte();

            __CLR4_5_25x85x8lx1e68s0.R.inc(7696);position.set(Event.KEY_INDEX, buf.readUnsignedShort());

            // Date and time
            __CLR4_5_25x85x8lx1e68s0.R.inc(7697);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_25x85x8lx1e68s0.R.inc(7698);time.clear();
            __CLR4_5_25x85x8lx1e68s0.R.inc(7699);time.set(Calendar.YEAR, 2000);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7700);time.set(Calendar.MONTH, 0);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7701);time.set(Calendar.DAY_OF_MONTH, 1);

            __CLR4_5_25x85x8lx1e68s0.R.inc(7702);long date = buf.readUnsignedInt();

            __CLR4_5_25x85x8lx1e68s0.R.inc(7703);long days = BitUtil.range(date, 6 + 6 + 5);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7704);long hours = BitUtil.range(date, 6 + 6, 5);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7705);long minutes = BitUtil.range(date, 6, 6);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7706);long seconds = BitUtil.range(date, 0, 6);

            __CLR4_5_25x85x8lx1e68s0.R.inc(7707);long millis = time.getTimeInMillis();
            __CLR4_5_25x85x8lx1e68s0.R.inc(7708);millis += (((days * 24 + hours) * 60 + minutes) * 60 + seconds) * 1000;

            __CLR4_5_25x85x8lx1e68s0.R.inc(7709);position.setTime(new Date(millis));

            // Location
            __CLR4_5_25x85x8lx1e68s0.R.inc(7710);position.setValid(true);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7711);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_25x85x8lx1e68s0.R.inc(7712);position.setLongitude(buf.readInt() / 1000000.0);

            __CLR4_5_25x85x8lx1e68s0.R.inc(7713);long flags = buf.readUnsignedInt();
            __CLR4_5_25x85x8lx1e68s0.R.inc(7714);position.set(Event.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_25x85x8lx1e68s0.R.inc(7715);position.set(Event.KEY_ALARM, BitUtil.check(flags, 1));
            __CLR4_5_25x85x8lx1e68s0.R.inc(7716);position.set(Event.KEY_INPUT, BitUtil.range(flags, 2, 5));
            __CLR4_5_25x85x8lx1e68s0.R.inc(7717);position.set(Event.KEY_OUTPUT, BitUtil.range(flags, 7, 3));
            __CLR4_5_25x85x8lx1e68s0.R.inc(7718);position.setCourse(BitUtil.range(flags, 10, 3) * 45);
            //position.setValid(BitUtil.check(flags, 15));
            __CLR4_5_25x85x8lx1e68s0.R.inc(7719);position.set(Event.KEY_CHARGE, BitUtil.check(flags, 20));

            __CLR4_5_25x85x8lx1e68s0.R.inc(7720);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            __CLR4_5_25x85x8lx1e68s0.R.inc(7721);int inputMask = buf.readUnsignedByte();
            
            __CLR4_5_25x85x8lx1e68s0.R.inc(7722);if ((((BitUtil.check(infoGroups, 0))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7723)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7724)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7725);buf.skipBytes(8); // waypoints
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7726);if ((((BitUtil.check(infoGroups, 1))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7727)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7728)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7729);buf.skipBytes(8); // wireless accessory
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7730);if ((((BitUtil.check(infoGroups, 2))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7731)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7732)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7733);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_25x85x8lx1e68s0.R.inc(7734);position.set(Event.KEY_HDOP, buf.readUnsignedByte());
                __CLR4_5_25x85x8lx1e68s0.R.inc(7735);buf.readUnsignedByte(); // GPS accuracy
                __CLR4_5_25x85x8lx1e68s0.R.inc(7736);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                __CLR4_5_25x85x8lx1e68s0.R.inc(7737);buf.readUnsignedShort(); // time since boot
                __CLR4_5_25x85x8lx1e68s0.R.inc(7738);buf.readUnsignedByte(); // input voltage
                __CLR4_5_25x85x8lx1e68s0.R.inc(7739);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7740);if ((((BitUtil.check(infoGroups, 3))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7741)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7742)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7743);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7744);if ((((BitUtil.check(infoGroups, 4))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7745)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7746)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7747);position.set("hours", buf.readUnsignedInt());
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7748);if ((((BitUtil.check(infoGroups, 5))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7749)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7750)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7751);buf.readUnsignedInt(); // reason
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7752);if ((((BitUtil.check(infoGroups, 6))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7753)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7754)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7755);position.set(Event.KEY_POWER, buf.readUnsignedShort() * 0.001);
                __CLR4_5_25x85x8lx1e68s0.R.inc(7756);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());
            }
            
            }__CLR4_5_25x85x8lx1e68s0.R.inc(7757);if ((((BitUtil.check(infoGroups, 7))&&(__CLR4_5_25x85x8lx1e68s0.R.iget(7758)!=0|true))||(__CLR4_5_25x85x8lx1e68s0.R.iget(7759)==0&false))) {{
                __CLR4_5_25x85x8lx1e68s0.R.inc(7760);position.set(Event.KEY_RFID, buf.readUnsignedInt());
            }

            }__CLR4_5_25x85x8lx1e68s0.R.inc(7761);return position;
        }

        }__CLR4_5_25x85x8lx1e68s0.R.inc(7762);return null;
    }finally{__CLR4_5_25x85x8lx1e68s0.R.flushNeeded();}}

}
