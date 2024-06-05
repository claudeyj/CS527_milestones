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
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class TzoneProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28bp8bplx1e811s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,10899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TzoneProtocolDecoder(TzoneProtocol protocol) {
        super(protocol);__CLR4_5_28bp8bplx1e811s.R.inc(10790);try{__CLR4_5_28bp8bplx1e811s.R.inc(10789);
    }finally{__CLR4_5_28bp8bplx1e811s.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28bp8bplx1e811s.R.inc(10791);

        __CLR4_5_28bp8bplx1e811s.R.inc(10792);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_28bp8bplx1e811s.R.inc(10793);buf.skipBytes(2); // header
        __CLR4_5_28bp8bplx1e811s.R.inc(10794);buf.readUnsignedShort(); // length
        __CLR4_5_28bp8bplx1e811s.R.inc(10795);if ((((buf.readUnsignedShort() != 0x2424)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10796)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10797)==0&false))) {{
            __CLR4_5_28bp8bplx1e811s.R.inc(10798);return null;
        }
        }__CLR4_5_28bp8bplx1e811s.R.inc(10799);buf.readUnsignedShort(); // model
        __CLR4_5_28bp8bplx1e811s.R.inc(10800);buf.readUnsignedInt(); // firmware
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10801);String imei = ChannelBufferTools.readHexString(buf, 16).substring(1);
        __CLR4_5_28bp8bplx1e811s.R.inc(10802);if ((((!identify(imei, channel))&&(__CLR4_5_28bp8bplx1e811s.R.iget(10803)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10804)==0&false))) {{
            __CLR4_5_28bp8bplx1e811s.R.inc(10805);return null;
        }
        
        }__CLR4_5_28bp8bplx1e811s.R.inc(10806);buf.skipBytes(6); // device time

        __CLR4_5_28bp8bplx1e811s.R.inc(10807);Position position = new Position();
        __CLR4_5_28bp8bplx1e811s.R.inc(10808);position.setProtocol(getProtocolName());
        __CLR4_5_28bp8bplx1e811s.R.inc(10809);position.setDeviceId(getDeviceId());
        
        // GPS info

        __CLR4_5_28bp8bplx1e811s.R.inc(10810);int blockLength = buf.readUnsignedShort();
        __CLR4_5_28bp8bplx1e811s.R.inc(10811);int blockEnd = buf.readerIndex() + blockLength;
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10812);if ((((blockLength == 0)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10813)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10814)==0&false))) {{
            __CLR4_5_28bp8bplx1e811s.R.inc(10815);return null;
        }
        
        }__CLR4_5_28bp8bplx1e811s.R.inc(10816);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10817);double lat = buf.readUnsignedInt() / 600000.0;
        __CLR4_5_28bp8bplx1e811s.R.inc(10818);double lon = buf.readUnsignedInt() / 600000.0;
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10819);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28bp8bplx1e811s.R.inc(10820);time.clear();
        __CLR4_5_28bp8bplx1e811s.R.inc(10821);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
        __CLR4_5_28bp8bplx1e811s.R.inc(10822);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
        __CLR4_5_28bp8bplx1e811s.R.inc(10823);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
        __CLR4_5_28bp8bplx1e811s.R.inc(10824);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
        __CLR4_5_28bp8bplx1e811s.R.inc(10825);time.set(Calendar.MINUTE, buf.readUnsignedByte());
        __CLR4_5_28bp8bplx1e811s.R.inc(10826);time.set(Calendar.SECOND, buf.readUnsignedByte());
        __CLR4_5_28bp8bplx1e811s.R.inc(10827);position.setTime(time.getTime());
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10828);position.setSpeed(buf.readUnsignedShort() * 0.01);
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10829);position.set(Event.KEY_ODOMETER, buf.readUnsignedMedium());
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10830);int flags = buf.readUnsignedShort();
        __CLR4_5_28bp8bplx1e811s.R.inc(10831);position.setCourse(BitUtil.range(flags, 0, 9));
        __CLR4_5_28bp8bplx1e811s.R.inc(10832);position.setLatitude((((BitUtil.check(flags, 10) )&&(__CLR4_5_28bp8bplx1e811s.R.iget(10833)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10834)==0&false))? lat : -lat);
        __CLR4_5_28bp8bplx1e811s.R.inc(10835);position.setLongitude((((BitUtil.check(flags, 9) )&&(__CLR4_5_28bp8bplx1e811s.R.iget(10836)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10837)==0&false))? -lon : lon);
        __CLR4_5_28bp8bplx1e811s.R.inc(10838);position.setValid(BitUtil.check(flags, 11));
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10839);buf.readerIndex(blockEnd);
        
        // LBS info
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10840);blockLength = buf.readUnsignedShort();
        __CLR4_5_28bp8bplx1e811s.R.inc(10841);blockEnd = buf.readerIndex() + blockLength;
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10842);if ((((blockLength > 0)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10843)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10844)==0&false))) {{
            
            __CLR4_5_28bp8bplx1e811s.R.inc(10845);position.set(Event.KEY_LAC, buf.readUnsignedShort());
            __CLR4_5_28bp8bplx1e811s.R.inc(10846);position.set(Event.KEY_CELL, buf.readUnsignedShort());
        
        }
        
        }__CLR4_5_28bp8bplx1e811s.R.inc(10847);buf.readerIndex(blockEnd);
        
        // Status info
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10848);blockLength = buf.readUnsignedShort();
        __CLR4_5_28bp8bplx1e811s.R.inc(10849);blockEnd = buf.readerIndex() + blockLength;
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10850);if ((((blockLength > 0)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10851)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10852)==0&false))) {{
            
            __CLR4_5_28bp8bplx1e811s.R.inc(10853);position.set(Event.KEY_ALARM, buf.readUnsignedByte());
            __CLR4_5_28bp8bplx1e811s.R.inc(10854);buf.readUnsignedByte(); // terminal info
            __CLR4_5_28bp8bplx1e811s.R.inc(10855);position.set(Event.PREFIX_IO + 1, buf.readUnsignedShort());
            __CLR4_5_28bp8bplx1e811s.R.inc(10856);position.set(Event.KEY_GSM, buf.readUnsignedByte());
            __CLR4_5_28bp8bplx1e811s.R.inc(10857);buf.readUnsignedByte(); // GSM status
            __CLR4_5_28bp8bplx1e811s.R.inc(10858);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());
            __CLR4_5_28bp8bplx1e811s.R.inc(10859);position.set(Event.KEY_POWER, buf.readUnsignedShort());
            __CLR4_5_28bp8bplx1e811s.R.inc(10860);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_28bp8bplx1e811s.R.inc(10861);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_28bp8bplx1e811s.R.inc(10862);position.set(Event.PREFIX_TEMP + 1, buf.readUnsignedShort());
            
        }
        
        }__CLR4_5_28bp8bplx1e811s.R.inc(10863);buf.readerIndex(blockEnd);
        
        // Cards
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10864);int index = 1;
        __CLR4_5_28bp8bplx1e811s.R.inc(10865);for (int i = 0; (((i < 4)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10866)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10867)==0&false)); i++) {{
            
            __CLR4_5_28bp8bplx1e811s.R.inc(10868);blockLength = buf.readUnsignedShort();
            __CLR4_5_28bp8bplx1e811s.R.inc(10869);blockEnd = buf.readerIndex() + blockLength;
            
            __CLR4_5_28bp8bplx1e811s.R.inc(10870);if ((((blockLength > 0)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10871)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10872)==0&false))) {{
                
                __CLR4_5_28bp8bplx1e811s.R.inc(10873);int count = buf.readUnsignedByte();
                __CLR4_5_28bp8bplx1e811s.R.inc(10874);for (int j = 0; (((j < count)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10875)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10876)==0&false)); j++) {{

                    __CLR4_5_28bp8bplx1e811s.R.inc(10877);int length = buf.readUnsignedByte();
                
                    __CLR4_5_28bp8bplx1e811s.R.inc(10878);boolean odd = length % 2 != 0;

                    __CLR4_5_28bp8bplx1e811s.R.inc(10879);String num = ChannelBufferTools.readHexString(buf, (((odd )&&(__CLR4_5_28bp8bplx1e811s.R.iget(10880)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10881)==0&false))? length + 1 : length);

                    __CLR4_5_28bp8bplx1e811s.R.inc(10882);if ((((odd)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10883)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10884)==0&false))) {{
                        __CLR4_5_28bp8bplx1e811s.R.inc(10885);num = num.substring(1);
                    }

                    }__CLR4_5_28bp8bplx1e811s.R.inc(10886);position.set("card" + index, num);
                    
                }
            }}
            
            }__CLR4_5_28bp8bplx1e811s.R.inc(10887);buf.readerIndex(blockEnd);
            
        }
        
        // Temperature
        
        }__CLR4_5_28bp8bplx1e811s.R.inc(10888);buf.skipBytes(buf.readUnsignedShort());
        
        // Lock
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10889);buf.skipBytes(buf.readUnsignedShort());

        // Passengers
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10890);blockLength = buf.readUnsignedShort();
        __CLR4_5_28bp8bplx1e811s.R.inc(10891);blockEnd = buf.readerIndex() + blockLength;
        
        __CLR4_5_28bp8bplx1e811s.R.inc(10892);if ((((blockLength > 0)&&(__CLR4_5_28bp8bplx1e811s.R.iget(10893)!=0|true))||(__CLR4_5_28bp8bplx1e811s.R.iget(10894)==0&false))) {{
            
            __CLR4_5_28bp8bplx1e811s.R.inc(10895);position.set("passengers-on", buf.readUnsignedMedium());
            __CLR4_5_28bp8bplx1e811s.R.inc(10896);position.set("passengers-off", buf.readUnsignedMedium());
            
        }
        
        }__CLR4_5_28bp8bplx1e811s.R.inc(10897);buf.readerIndex(blockEnd);

        __CLR4_5_28bp8bplx1e811s.R.inc(10898);return position;
    }finally{__CLR4_5_28bp8bplx1e811s.R.flushNeeded();}}

}
