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

import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class M2mProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24zf4zflx1e68dm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,6534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public M2mProtocolDecoder(M2mProtocol protocol) {
        super(protocol);__CLR4_5_24zf4zflx1e68dm.R.inc(6460);try{__CLR4_5_24zf4zflx1e68dm.R.inc(6459);
    }finally{__CLR4_5_24zf4zflx1e68dm.R.flushNeeded();}}
    
    private boolean firstPacket = true;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_24zf4zflx1e68dm.R.inc(6461);

        __CLR4_5_24zf4zflx1e68dm.R.inc(6462);ChannelBuffer buf = (ChannelBuffer) msg;

        // Remove offset
        __CLR4_5_24zf4zflx1e68dm.R.inc(6463);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6464)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6465)==0&false)); i++) {{
            __CLR4_5_24zf4zflx1e68dm.R.inc(6466);int b = buf.getByte(i);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6467);if ((((b != 0x0b)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6468)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6469)==0&false))) {{
                __CLR4_5_24zf4zflx1e68dm.R.inc(6470);buf.setByte(i, b - 0x20);
            }
        }}

        }__CLR4_5_24zf4zflx1e68dm.R.inc(6471);if ((((firstPacket)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6472)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6473)==0&false))) {{
            
            __CLR4_5_24zf4zflx1e68dm.R.inc(6474);firstPacket = false;

            // Read IMEI
            __CLR4_5_24zf4zflx1e68dm.R.inc(6475);StringBuilder imei = new StringBuilder();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6476);for (int i = 0; (((i < 8)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6477)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6478)==0&false)); i++) {{
                __CLR4_5_24zf4zflx1e68dm.R.inc(6479);int b = buf.readByte();
                __CLR4_5_24zf4zflx1e68dm.R.inc(6480);if ((((i != 0)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6481)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6482)==0&false))) {{
                    __CLR4_5_24zf4zflx1e68dm.R.inc(6483);imei.append(b / 10);
                }
                }__CLR4_5_24zf4zflx1e68dm.R.inc(6484);imei.append(b % 10);
            }

            // Identification
            }__CLR4_5_24zf4zflx1e68dm.R.inc(6485);identify(imei.toString(), channel);

        } }else {__CLR4_5_24zf4zflx1e68dm.R.inc(6486);if ((((hasDeviceId())&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6487)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6488)==0&false))) {{
            
            // Create new position
            __CLR4_5_24zf4zflx1e68dm.R.inc(6489);Position position = new Position();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6490);position.setProtocol(getProtocolName());
            __CLR4_5_24zf4zflx1e68dm.R.inc(6491);position.setDeviceId(getDeviceId());

            // Date and time
            __CLR4_5_24zf4zflx1e68dm.R.inc(6492);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_24zf4zflx1e68dm.R.inc(6493);time.clear();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6494);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte() & 0x3f);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6495);time.set(Calendar.MONTH, (buf.readUnsignedByte() & 0x3f) - 1);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6496);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_24zf4zflx1e68dm.R.inc(6497);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte() & 0x3f);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6498);time.set(Calendar.MINUTE, buf.readUnsignedByte() & 0x7f);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6499);time.set(Calendar.SECOND, buf.readUnsignedByte() & 0x7f);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6500);position.setTime(time.getTime());
            
            // Location
            __CLR4_5_24zf4zflx1e68dm.R.inc(6501);int degrees = buf.readUnsignedByte();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6502);double latitude = buf.readUnsignedByte();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6503);latitude += buf.readUnsignedByte() / 100.0;
            __CLR4_5_24zf4zflx1e68dm.R.inc(6504);latitude += buf.readUnsignedByte() / 10000.0;
            __CLR4_5_24zf4zflx1e68dm.R.inc(6505);latitude /= 60;
            __CLR4_5_24zf4zflx1e68dm.R.inc(6506);latitude += degrees;

            __CLR4_5_24zf4zflx1e68dm.R.inc(6507);int b = buf.readUnsignedByte();

            __CLR4_5_24zf4zflx1e68dm.R.inc(6508);degrees = (b & 0x7f) * 100 + buf.readUnsignedByte();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6509);double longitude = buf.readUnsignedByte();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6510);longitude += buf.readUnsignedByte() / 100.0;
            __CLR4_5_24zf4zflx1e68dm.R.inc(6511);longitude += buf.readUnsignedByte() / 10000.0;
            __CLR4_5_24zf4zflx1e68dm.R.inc(6512);longitude /= 60;
            __CLR4_5_24zf4zflx1e68dm.R.inc(6513);longitude += degrees;
            
            __CLR4_5_24zf4zflx1e68dm.R.inc(6514);if (((((b & 0x80) != 0)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6515)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6516)==0&false))) {{
                __CLR4_5_24zf4zflx1e68dm.R.inc(6517);longitude = -longitude;
            }
            }__CLR4_5_24zf4zflx1e68dm.R.inc(6518);if (((((b & 0x40) != 0)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6519)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6520)==0&false))) {{
                __CLR4_5_24zf4zflx1e68dm.R.inc(6521);latitude = -latitude;
            }
            
            }__CLR4_5_24zf4zflx1e68dm.R.inc(6522);position.setLatitude(latitude);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6523);position.setLongitude(longitude);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6524);position.setSpeed(buf.readUnsignedByte());

            // Satellites
            __CLR4_5_24zf4zflx1e68dm.R.inc(6525);int satellites = buf.readUnsignedByte();
            __CLR4_5_24zf4zflx1e68dm.R.inc(6526);if ((((satellites == 0)&&(__CLR4_5_24zf4zflx1e68dm.R.iget(6527)!=0|true))||(__CLR4_5_24zf4zflx1e68dm.R.iget(6528)==0&false))) {{
                __CLR4_5_24zf4zflx1e68dm.R.inc(6529);return null; // cell information
            }
            }__CLR4_5_24zf4zflx1e68dm.R.inc(6530);position.set(Event.KEY_SATELLITES, satellites);
            __CLR4_5_24zf4zflx1e68dm.R.inc(6531);position.setValid(true);

            // TODO decode everything else
            __CLR4_5_24zf4zflx1e68dm.R.inc(6532);return position;

        }

        }}__CLR4_5_24zf4zflx1e68dm.R.inc(6533);return null;
    }finally{__CLR4_5_24zf4zflx1e68dm.R.flushNeeded();}}

}
