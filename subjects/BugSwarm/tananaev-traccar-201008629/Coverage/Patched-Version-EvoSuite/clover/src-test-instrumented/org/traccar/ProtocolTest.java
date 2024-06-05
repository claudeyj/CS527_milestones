/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.handler.codec.http.DefaultHttpRequest;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.junit.Assert;
import org.traccar.database.IdentityManager;
import org.traccar.model.CellTower;
import org.traccar.model.Command;
import org.traccar.model.Device;
import org.traccar.model.Position;

import javax.xml.bind.DatatypeConverter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class ProtocolTest extends BaseTest {static class __CLR4_5_2hy0hy0lx1dzdps{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,23369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Position position(String time, boolean valid, double lat, double lon) throws ParseException {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23256);

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23257);Position position = new Position();

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23258);if ((((time != null)&&(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23259)!=0|true))||(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23260)==0&false))) {{
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23261);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23262);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23263);position.setTime(dateFormat.parse(time));
        }
        }__CLR4_5_2hy0hy0lx1dzdps.R.inc(23264);position.setValid(valid);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23265);position.setLatitude(lat);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23266);position.setLongitude(lon);

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23267);return position;
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    private String concatenateStrings(String... strings) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23268);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23269);StringBuilder builder = new StringBuilder();
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23270);for (String s : strings) {{
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23271);builder.append(s);
        }
        }__CLR4_5_2hy0hy0lx1dzdps.R.inc(23272);return builder.toString();
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected ChannelBuffer binary(String... data) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23273);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23274);return binary(ByteOrder.BIG_ENDIAN, data);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected ChannelBuffer binary(ByteOrder endianness, String... data) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23275);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23276);return ChannelBuffers.wrappedBuffer(
                endianness, DatatypeConverter.parseHexBinary(concatenateStrings(data)));
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected String text(String... data) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23277);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23278);return concatenateStrings(data);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected ChannelBuffer buffer(String... data) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23279);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23280);return ChannelBuffers.copiedBuffer(concatenateStrings(data), StandardCharsets.ISO_8859_1);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected DefaultHttpRequest request(String url) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23281);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23282);return request(HttpMethod.GET, url);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected DefaultHttpRequest request(HttpMethod method, String url) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23283);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23284);return new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, url);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected DefaultHttpRequest request(HttpMethod method, String url, ChannelBuffer data) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23285);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23286);DefaultHttpRequest request = new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, url);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23287);request.setContent(data);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23288);return request;
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyNotNull(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23289);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23290);Assert.assertNotNull(decoder.decode(null, null, object));
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyNothing(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23291);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23292);Assert.assertNull(decoder.decode(null, null, object));
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyAttributes(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23293);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23294);verifyDecodedPosition(decoder.decode(null, null, object), false, true, null);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyPosition(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23295);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23296);verifyDecodedPosition(decoder.decode(null, null, object), true, false, null);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyPosition(BaseProtocolDecoder decoder, Object object, Position position) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23297);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23298);verifyDecodedPosition(decoder.decode(null, null, object), true, false, position);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23299);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23300);verifyDecodedList(decoder.decode(null, null, object), true, null);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, boolean checkLocation, Object object) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23301);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23302);verifyDecodedList(decoder.decode(null, null, object), checkLocation, null);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, Object object, Position position) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23303);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23304);verifyDecodedList(decoder.decode(null, null, object), true, position);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    private void verifyDecodedList(Object decodedObject, boolean checkLocation, Position expected) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23305);

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23306);Assert.assertNotNull("list is null", decodedObject);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23307);Assert.assertTrue("not a list", decodedObject instanceof List);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23308);Assert.assertFalse("list if empty", ((List) decodedObject).isEmpty());

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23309);for (Object item : (List) decodedObject) {{
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23310);verifyDecodedPosition(item, checkLocation, false, expected);
        }

    }}finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    private void verifyDecodedPosition(Object decodedObject, boolean checkLocation, boolean checkAttributes, Position expected) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23311);

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23312);Assert.assertNotNull("position is null", decodedObject);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23313);Assert.assertTrue("not a position", decodedObject instanceof Position);

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23314);Position position = (Position) decodedObject;

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23315);if ((((checkLocation)&&(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23316)!=0|true))||(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23317)==0&false))) {{

            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23318);if ((((expected != null)&&(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23319)!=0|true))||(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23320)==0&false))) {{

                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23321);if ((((expected.getFixTime() != null)&&(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23322)!=0|true))||(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23323)==0&false))) {{
                    __CLR4_5_2hy0hy0lx1dzdps.R.inc(23324);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    __CLR4_5_2hy0hy0lx1dzdps.R.inc(23325);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_2hy0hy0lx1dzdps.R.inc(23326);Assert.assertEquals("time", dateFormat.format(expected.getFixTime()), dateFormat.format(position.getFixTime()));
                }
                }__CLR4_5_2hy0hy0lx1dzdps.R.inc(23327);Assert.assertEquals("valid", expected.getValid(), position.getValid());
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23328);Assert.assertEquals("latitude", expected.getLatitude(), position.getLatitude(), 0.00001);
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23329);Assert.assertEquals("longitude", expected.getLongitude(), position.getLongitude(), 0.00001);

            } }else {{

                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23330);Assert.assertNotNull(position.getFixTime());
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23331);Assert.assertTrue("year > 2000", position.getFixTime().after(new Date(946684800000L)));
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23332);Assert.assertTrue("time < +25 hours",
                        position.getFixTime().getTime() < System.currentTimeMillis() + 25 * 3600000);

                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23333);Assert.assertTrue("latitude >= -90", position.getLatitude() >= -90);
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23334);Assert.assertTrue("latitude <= 90", position.getLatitude() <= 90);

                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23335);Assert.assertTrue("longitude >= -180", position.getLongitude() >= -180);
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23336);Assert.assertTrue("longitude <= 180", position.getLongitude() <= 180);

            }

            }__CLR4_5_2hy0hy0lx1dzdps.R.inc(23337);Assert.assertTrue("altitude >= -12262", position.getAltitude() >= -12262);
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23338);Assert.assertTrue("altitude <= 18000", position.getAltitude() <= 18000);

            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23339);Assert.assertTrue("speed >= 0", position.getSpeed() >= 0);
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23340);Assert.assertTrue("speed <= 869", position.getSpeed() <= 869);

            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23341);Assert.assertTrue("course >= 0", position.getCourse() >= 0);
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23342);Assert.assertTrue("course <= 360", position.getCourse() <= 360);

            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23343);Assert.assertNotNull("protocol is null", position.getProtocol());

        }

        }__CLR4_5_2hy0hy0lx1dzdps.R.inc(23344);Map<String, Object> attributes = position.getAttributes();

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23345);if ((((checkAttributes)&&(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23346)!=0|true))||(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23347)==0&false))) {{
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23348);Assert.assertFalse("no attributes", attributes.isEmpty());
        }

        }__CLR4_5_2hy0hy0lx1dzdps.R.inc(23349);if ((((position.getNetwork() != null && position.getNetwork().getCellTowers() != null)&&(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23350)!=0|true))||(__CLR4_5_2hy0hy0lx1dzdps.R.iget(23351)==0&false))) {{
            __CLR4_5_2hy0hy0lx1dzdps.R.inc(23352);for (CellTower cellTower : position.getNetwork().getCellTowers()) {{
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23353);checkInteger(cellTower.getMobileCountryCode(), 0, 999);
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23354);checkInteger(cellTower.getMobileNetworkCode(), 0, 999);
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23355);checkInteger(cellTower.getLocationAreaCode(), 1, 65535);
                __CLR4_5_2hy0hy0lx1dzdps.R.inc(23356);checkInteger(cellTower.getCellId(), 0, 268435455);
            }
        }}

    }}finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    private void checkInteger(Object value, int min, int max) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23357);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23358);Assert.assertNotNull("value is null", value);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23359);Assert.assertTrue("not int or long", value instanceof Integer || value instanceof Long);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23360);long number = ((Number) value).longValue();
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23361);Assert.assertTrue("value too low", number >= min);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23362);Assert.assertTrue("value too high", number <= max);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    protected void verifyCommand(
            BaseProtocolEncoder encoder, Command command, ChannelBuffer expected) throws Exception {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23363);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23364);verifyDecodedCommand(encoder.encodeCommand(command), expected);
    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

    private void verifyDecodedCommand(Object decodedObject, ChannelBuffer expected) {try{__CLR4_5_2hy0hy0lx1dzdps.R.inc(23365);

        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23366);Assert.assertNotNull("command is null", decodedObject);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23367);Assert.assertTrue("not a buffer", decodedObject instanceof ChannelBuffer);
        __CLR4_5_2hy0hy0lx1dzdps.R.inc(23368);Assert.assertEquals(ChannelBuffers.hexDump(expected), ChannelBuffers.hexDump((ChannelBuffer) decodedObject));

    }finally{__CLR4_5_2hy0hy0lx1dzdps.R.flushNeeded();}}

}
