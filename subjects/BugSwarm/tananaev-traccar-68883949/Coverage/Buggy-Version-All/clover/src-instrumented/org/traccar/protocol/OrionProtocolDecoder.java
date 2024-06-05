/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class OrionProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25y95y9lx1dlpk0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,7774,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OrionProtocolDecoder(OrionProtocol protocol) {
        super(protocol);__CLR4_5_25y95y9lx1dlpk0.R.inc(7714);try{__CLR4_5_25y95y9lx1dlpk0.R.inc(7713);
    }finally{__CLR4_5_25y95y9lx1dlpk0.R.flushNeeded();}}
    
    private static final int TYPE_USERLOG = 0;
    private static final int TYPE_SYSLOG = 3;

    private static void sendResponse(Channel channel, ChannelBuffer buf) {try{__CLR4_5_25y95y9lx1dlpk0.R.inc(7715);
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7716);if ((((channel != null)&&(__CLR4_5_25y95y9lx1dlpk0.R.iget(7717)!=0|true))||(__CLR4_5_25y95y9lx1dlpk0.R.iget(7718)==0&false))) {{
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7719);ChannelBuffer response = ChannelBuffers.directBuffer(4);
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7720);response.writeByte('*');
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7721);response.writeShort(buf.getUnsignedShort(buf.writerIndex() - 2));
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7722);response.writeByte(buf.getUnsignedByte(buf.writerIndex() - 3));
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7723);channel.write(response);
        }
    }}finally{__CLR4_5_25y95y9lx1dlpk0.R.flushNeeded();}}
    
    private static double convertCoordinate(int value) {try{__CLR4_5_25y95y9lx1dlpk0.R.inc(7724);
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7725);double degrees = value / 1000000;
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7726);double minutes = (value % 1000000) / 10000.0;
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7727);return degrees + minutes / 60;
    }finally{__CLR4_5_25y95y9lx1dlpk0.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_25y95y9lx1dlpk0.R.inc(7728);

        __CLR4_5_25y95y9lx1dlpk0.R.inc(7729);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7730);buf.skipBytes(2); // header
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7731);int type = buf.readUnsignedByte() & 0x0f;
        
        __CLR4_5_25y95y9lx1dlpk0.R.inc(7732);if ((((type == TYPE_USERLOG)&&(__CLR4_5_25y95y9lx1dlpk0.R.iget(7733)!=0|true))||(__CLR4_5_25y95y9lx1dlpk0.R.iget(7734)==0&false))) {{
            
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7735);int header = buf.readUnsignedByte();
            
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7736);if (((((header & 0x40) != 0)&&(__CLR4_5_25y95y9lx1dlpk0.R.iget(7737)!=0|true))||(__CLR4_5_25y95y9lx1dlpk0.R.iget(7738)==0&false))) {{
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7739);sendResponse(channel, buf);
            }

            }__CLR4_5_25y95y9lx1dlpk0.R.inc(7740);if ((((!identify(String.valueOf(buf.readUnsignedInt()), channel))&&(__CLR4_5_25y95y9lx1dlpk0.R.iget(7741)!=0|true))||(__CLR4_5_25y95y9lx1dlpk0.R.iget(7742)==0&false))) {{
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7743);return null;
            }

            }__CLR4_5_25y95y9lx1dlpk0.R.inc(7744);List<Position> positions = new LinkedList<Position>();
            
            __CLR4_5_25y95y9lx1dlpk0.R.inc(7745);for (int i = 0; (((i < (header & 0x0f))&&(__CLR4_5_25y95y9lx1dlpk0.R.iget(7746)!=0|true))||(__CLR4_5_25y95y9lx1dlpk0.R.iget(7747)==0&false)); i++) {{
                
                // Create new position
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7748);Position position = new Position();
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7749);position.setDeviceId(getDeviceId());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7750);position.setProtocol(getProtocolName());
                
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7751);position.set(Event.KEY_EVENT, buf.readUnsignedByte());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7752);buf.readUnsignedByte(); // length
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7753);position.set(Event.KEY_FLAGS, buf.readUnsignedShort());

                // Location
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7754);position.setLatitude(convertCoordinate(buf.readInt()));
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7755);position.setLongitude(convertCoordinate(buf.readInt()));
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7756);position.setAltitude(buf.readShort()/ 10.0);
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7757);position.setCourse(buf.readUnsignedShort());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7758);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                
                // Date and time
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7759);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7760);time.clear();
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7761);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7762);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7763);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7764);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7765);time.set(Calendar.MINUTE, buf.readUnsignedByte());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7766);time.set(Calendar.SECOND, buf.readUnsignedByte());
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7767);position.setTime(time.getTime());
                
                // Accuracy
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7768);int satellites = buf.readUnsignedByte();
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7769);position.set(Event.KEY_SATELLITES, satellites);
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7770);position.setValid(satellites >= 3);
                __CLR4_5_25y95y9lx1dlpk0.R.inc(7771);positions.add(position);
            }
            
            }__CLR4_5_25y95y9lx1dlpk0.R.inc(7772);return positions;
        }

        }__CLR4_5_25y95y9lx1dlpk0.R.inc(7773);return null;
    }finally{__CLR4_5_25y95y9lx1dlpk0.R.flushNeeded();}}

}
