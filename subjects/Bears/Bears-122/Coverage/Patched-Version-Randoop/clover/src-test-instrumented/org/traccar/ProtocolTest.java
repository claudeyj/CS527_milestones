/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.handler.codec.http.DefaultHttpRequest;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.junit.Assert;
import org.traccar.model.CellTower;
import org.traccar.model.Command;
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

public class ProtocolTest extends BaseTest {static class __CLR4_5_2jfajfalwye68e9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,25358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Position position(String time, boolean valid, double lat, double lon) throws ParseException {try{__CLR4_5_2jfajfalwye68e9.R.inc(25174);

        __CLR4_5_2jfajfalwye68e9.R.inc(25175);Position position = new Position();

        __CLR4_5_2jfajfalwye68e9.R.inc(25176);if ((((time != null)&&(__CLR4_5_2jfajfalwye68e9.R.iget(25177)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25178)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25179);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            __CLR4_5_2jfajfalwye68e9.R.inc(25180);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2jfajfalwye68e9.R.inc(25181);position.setTime(dateFormat.parse(time));
        }
        }__CLR4_5_2jfajfalwye68e9.R.inc(25182);position.setValid(valid);
        __CLR4_5_2jfajfalwye68e9.R.inc(25183);position.setLatitude(lat);
        __CLR4_5_2jfajfalwye68e9.R.inc(25184);position.setLongitude(lon);

        __CLR4_5_2jfajfalwye68e9.R.inc(25185);return position;
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    private String concatenateStrings(String... strings) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25186);
        __CLR4_5_2jfajfalwye68e9.R.inc(25187);StringBuilder builder = new StringBuilder();
        __CLR4_5_2jfajfalwye68e9.R.inc(25188);for (String s : strings) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25189);builder.append(s);
        }
        }__CLR4_5_2jfajfalwye68e9.R.inc(25190);return builder.toString();
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected ChannelBuffer binary(String... data) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25191);
        __CLR4_5_2jfajfalwye68e9.R.inc(25192);return binary(ByteOrder.BIG_ENDIAN, data);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected ChannelBuffer binary(ByteOrder endianness, String... data) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25193);
        __CLR4_5_2jfajfalwye68e9.R.inc(25194);return ChannelBuffers.wrappedBuffer(
                endianness, DatatypeConverter.parseHexBinary(concatenateStrings(data)));
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected String text(String... data) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25195);
        __CLR4_5_2jfajfalwye68e9.R.inc(25196);return concatenateStrings(data);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected ChannelBuffer buffer(String... data) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25197);
        __CLR4_5_2jfajfalwye68e9.R.inc(25198);return ChannelBuffers.copiedBuffer(concatenateStrings(data), StandardCharsets.ISO_8859_1);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected DefaultHttpRequest request(String url) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25199);
        __CLR4_5_2jfajfalwye68e9.R.inc(25200);return request(HttpMethod.GET, url);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected DefaultHttpRequest request(HttpMethod method, String url) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25201);
        __CLR4_5_2jfajfalwye68e9.R.inc(25202);return new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, url);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected DefaultHttpRequest request(HttpMethod method, String url, ChannelBuffer data) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25203);
        __CLR4_5_2jfajfalwye68e9.R.inc(25204);DefaultHttpRequest request = new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, url);
        __CLR4_5_2jfajfalwye68e9.R.inc(25205);request.setContent(data);
        __CLR4_5_2jfajfalwye68e9.R.inc(25206);return request;
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyNotNull(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25207);
        __CLR4_5_2jfajfalwye68e9.R.inc(25208);Assert.assertNotNull(decoder.decode(null, null, object));
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyNull(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25209);
        __CLR4_5_2jfajfalwye68e9.R.inc(25210);Assert.assertNull(decoder.decode(null, null, object));
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyAttribute(BaseProtocolDecoder decoder, Object object, String key, Object expected) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25211);
        __CLR4_5_2jfajfalwye68e9.R.inc(25212);Assert.assertEquals(expected, ((Position) decoder.decode(null, null, object)).getAttributes().get(key));
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyAttributes(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25213);
        __CLR4_5_2jfajfalwye68e9.R.inc(25214);verifyDecodedPosition(decoder.decode(null, null, object), false, true, null);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyPosition(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25215);
        __CLR4_5_2jfajfalwye68e9.R.inc(25216);verifyDecodedPosition(decoder.decode(null, null, object), true, false, null);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyPosition(BaseProtocolDecoder decoder, Object object, Position position) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25217);
        __CLR4_5_2jfajfalwye68e9.R.inc(25218);verifyDecodedPosition(decoder.decode(null, null, object), true, false, position);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25219);
        __CLR4_5_2jfajfalwye68e9.R.inc(25220);verifyDecodedList(decoder.decode(null, null, object), true, null);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, boolean checkLocation, Object object) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25221);
        __CLR4_5_2jfajfalwye68e9.R.inc(25222);verifyDecodedList(decoder.decode(null, null, object), checkLocation, null);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, Object object, Position position) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25223);
        __CLR4_5_2jfajfalwye68e9.R.inc(25224);verifyDecodedList(decoder.decode(null, null, object), true, position);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    private void verifyDecodedList(Object decodedObject, boolean checkLocation, Position expected) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25225);

        __CLR4_5_2jfajfalwye68e9.R.inc(25226);Assert.assertNotNull("list is null", decodedObject);
        __CLR4_5_2jfajfalwye68e9.R.inc(25227);Assert.assertTrue("not a list", decodedObject instanceof List);
        __CLR4_5_2jfajfalwye68e9.R.inc(25228);Assert.assertFalse("list is empty", ((List) decodedObject).isEmpty());

        __CLR4_5_2jfajfalwye68e9.R.inc(25229);for (Object item : (List) decodedObject) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25230);verifyDecodedPosition(item, checkLocation, false, expected);
        }

    }}finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    private void verifyDecodedPosition(Object decodedObject, boolean checkLocation, boolean checkAttributes, Position expected) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25231);

        __CLR4_5_2jfajfalwye68e9.R.inc(25232);Assert.assertNotNull("position is null", decodedObject);
        __CLR4_5_2jfajfalwye68e9.R.inc(25233);Assert.assertTrue("not a position", decodedObject instanceof Position);

        __CLR4_5_2jfajfalwye68e9.R.inc(25234);Position position = (Position) decodedObject;

        __CLR4_5_2jfajfalwye68e9.R.inc(25235);if ((((checkLocation)&&(__CLR4_5_2jfajfalwye68e9.R.iget(25236)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25237)==0&false))) {{

            __CLR4_5_2jfajfalwye68e9.R.inc(25238);if ((((expected != null)&&(__CLR4_5_2jfajfalwye68e9.R.iget(25239)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25240)==0&false))) {{

                __CLR4_5_2jfajfalwye68e9.R.inc(25241);if ((((expected.getFixTime() != null)&&(__CLR4_5_2jfajfalwye68e9.R.iget(25242)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25243)==0&false))) {{
                    __CLR4_5_2jfajfalwye68e9.R.inc(25244);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    __CLR4_5_2jfajfalwye68e9.R.inc(25245);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_2jfajfalwye68e9.R.inc(25246);Assert.assertEquals("time", dateFormat.format(expected.getFixTime()), dateFormat.format(position.getFixTime()));
                }
                }__CLR4_5_2jfajfalwye68e9.R.inc(25247);Assert.assertEquals("valid", expected.getValid(), position.getValid());
                __CLR4_5_2jfajfalwye68e9.R.inc(25248);Assert.assertEquals("latitude", expected.getLatitude(), position.getLatitude(), 0.00001);
                __CLR4_5_2jfajfalwye68e9.R.inc(25249);Assert.assertEquals("longitude", expected.getLongitude(), position.getLongitude(), 0.00001);

            } }else {{

                __CLR4_5_2jfajfalwye68e9.R.inc(25250);Assert.assertNotNull(position.getFixTime());
                __CLR4_5_2jfajfalwye68e9.R.inc(25251);Assert.assertTrue("year > 1999", position.getFixTime().after(new Date(915148800000L)));
                __CLR4_5_2jfajfalwye68e9.R.inc(25252);Assert.assertTrue("time < +25 hours",
                        position.getFixTime().getTime() < System.currentTimeMillis() + 25 * 3600000);

                __CLR4_5_2jfajfalwye68e9.R.inc(25253);Assert.assertTrue("latitude >= -90", position.getLatitude() >= -90);
                __CLR4_5_2jfajfalwye68e9.R.inc(25254);Assert.assertTrue("latitude <= 90", position.getLatitude() <= 90);

                __CLR4_5_2jfajfalwye68e9.R.inc(25255);Assert.assertTrue("longitude >= -180", position.getLongitude() >= -180);
                __CLR4_5_2jfajfalwye68e9.R.inc(25256);Assert.assertTrue("longitude <= 180", position.getLongitude() <= 180);

            }

            }__CLR4_5_2jfajfalwye68e9.R.inc(25257);Assert.assertTrue("altitude >= -12262", position.getAltitude() >= -12262);
            __CLR4_5_2jfajfalwye68e9.R.inc(25258);Assert.assertTrue("altitude <= 18000", position.getAltitude() <= 18000);

            __CLR4_5_2jfajfalwye68e9.R.inc(25259);Assert.assertTrue("speed >= 0", position.getSpeed() >= 0);
            __CLR4_5_2jfajfalwye68e9.R.inc(25260);Assert.assertTrue("speed <= 869", position.getSpeed() <= 869);

            __CLR4_5_2jfajfalwye68e9.R.inc(25261);Assert.assertTrue("course >= 0", position.getCourse() >= 0);
            __CLR4_5_2jfajfalwye68e9.R.inc(25262);Assert.assertTrue("course <= 360", position.getCourse() <= 360);

            __CLR4_5_2jfajfalwye68e9.R.inc(25263);Assert.assertNotNull("protocol is null", position.getProtocol());

        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25264);Map<String, Object> attributes = position.getAttributes();

        __CLR4_5_2jfajfalwye68e9.R.inc(25265);if ((((checkAttributes)&&(__CLR4_5_2jfajfalwye68e9.R.iget(25266)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25267)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25268);Assert.assertFalse("no attributes", attributes.isEmpty());
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25269);if ((((attributes.containsKey(Position.KEY_INDEX))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25270)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25271)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25272);Assert.assertTrue(attributes.get(Position.KEY_INDEX) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25273);if ((((attributes.containsKey(Position.KEY_HDOP))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25274)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25275)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25276);Assert.assertTrue(attributes.get(Position.KEY_HDOP) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25277);if ((((attributes.containsKey(Position.KEY_VDOP))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25278)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25279)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25280);Assert.assertTrue(attributes.get(Position.KEY_VDOP) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25281);if ((((attributes.containsKey(Position.KEY_PDOP))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25282)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25283)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25284);Assert.assertTrue(attributes.get(Position.KEY_PDOP) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25285);if ((((attributes.containsKey(Position.KEY_SATELLITES))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25286)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25287)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25288);Assert.assertTrue(attributes.get(Position.KEY_SATELLITES) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25289);if ((((attributes.containsKey(Position.KEY_SATELLITES_VISIBLE))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25290)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25291)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25292);Assert.assertTrue(attributes.get(Position.KEY_SATELLITES_VISIBLE) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25293);if ((((attributes.containsKey(Position.KEY_RSSI))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25294)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25295)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25296);Assert.assertTrue(attributes.get(Position.KEY_RSSI) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25297);if ((((attributes.containsKey(Position.KEY_ODOMETER))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25298)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25299)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25300);Assert.assertTrue(attributes.get(Position.KEY_ODOMETER) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25301);if ((((attributes.containsKey(Position.KEY_RPM))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25302)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25303)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25304);Assert.assertTrue(attributes.get(Position.KEY_RPM) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25305);if ((((attributes.containsKey(Position.KEY_FUEL_LEVEL))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25306)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25307)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25308);Assert.assertTrue(attributes.get(Position.KEY_FUEL_LEVEL) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25309);if ((((attributes.containsKey(Position.KEY_POWER))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25310)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25311)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25312);Assert.assertTrue(attributes.get(Position.KEY_POWER) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25313);if ((((attributes.containsKey(Position.KEY_BATTERY))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25314)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25315)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25316);Assert.assertTrue(attributes.get(Position.KEY_BATTERY) instanceof Number);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25317);if ((((attributes.containsKey(Position.KEY_BATTERY_LEVEL))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25318)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25319)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25320);int batteryLevel = ((Number) attributes.get(Position.KEY_BATTERY_LEVEL)).intValue();
            __CLR4_5_2jfajfalwye68e9.R.inc(25321);Assert.assertTrue(batteryLevel <= 100 && batteryLevel >= 0);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25322);if ((((attributes.containsKey(Position.KEY_CHARGE))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25323)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25324)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25325);Assert.assertTrue(attributes.get(Position.KEY_CHARGE) instanceof Boolean);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25326);if ((((attributes.containsKey(Position.KEY_MOTION))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25327)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25328)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25329);Assert.assertTrue(attributes.get(Position.KEY_MOTION) instanceof Boolean);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25330);if ((((attributes.containsKey(Position.KEY_ARCHIVE))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25331)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25332)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25333);Assert.assertTrue(attributes.get(Position.KEY_ARCHIVE) instanceof Boolean);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25334);if ((((attributes.containsKey(Position.KEY_DRIVER_UNIQUE_ID))&&(__CLR4_5_2jfajfalwye68e9.R.iget(25335)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25336)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25337);Assert.assertTrue(attributes.get(Position.KEY_DRIVER_UNIQUE_ID) instanceof String);
        }

        }__CLR4_5_2jfajfalwye68e9.R.inc(25338);if ((((position.getNetwork() != null && position.getNetwork().getCellTowers() != null)&&(__CLR4_5_2jfajfalwye68e9.R.iget(25339)!=0|true))||(__CLR4_5_2jfajfalwye68e9.R.iget(25340)==0&false))) {{
            __CLR4_5_2jfajfalwye68e9.R.inc(25341);for (CellTower cellTower : position.getNetwork().getCellTowers()) {{
                __CLR4_5_2jfajfalwye68e9.R.inc(25342);checkInteger(cellTower.getMobileCountryCode(), 0, 999);
                __CLR4_5_2jfajfalwye68e9.R.inc(25343);checkInteger(cellTower.getMobileNetworkCode(), 0, 999);
                __CLR4_5_2jfajfalwye68e9.R.inc(25344);checkInteger(cellTower.getLocationAreaCode(), 1, 65535);
                __CLR4_5_2jfajfalwye68e9.R.inc(25345);checkInteger(cellTower.getCellId(), 0, 268435455);
            }
        }}

    }}finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    private void checkInteger(Object value, int min, int max) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25346);
        __CLR4_5_2jfajfalwye68e9.R.inc(25347);Assert.assertNotNull("value is null", value);
        __CLR4_5_2jfajfalwye68e9.R.inc(25348);Assert.assertTrue("not int or long", value instanceof Integer || value instanceof Long);
        __CLR4_5_2jfajfalwye68e9.R.inc(25349);long number = ((Number) value).longValue();
        __CLR4_5_2jfajfalwye68e9.R.inc(25350);Assert.assertTrue("value too low", number >= min);
        __CLR4_5_2jfajfalwye68e9.R.inc(25351);Assert.assertTrue("value too high", number <= max);
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyCommand(
            BaseProtocolEncoder encoder, Command command, ChannelBuffer expected) throws Exception {try{__CLR4_5_2jfajfalwye68e9.R.inc(25352);
        __CLR4_5_2jfajfalwye68e9.R.inc(25353);verifyFrame(expected, encoder.encodeCommand(command));
    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

    protected void verifyFrame(ChannelBuffer expected, Object object) {try{__CLR4_5_2jfajfalwye68e9.R.inc(25354);

        __CLR4_5_2jfajfalwye68e9.R.inc(25355);Assert.assertNotNull("buffer is null", object);
        __CLR4_5_2jfajfalwye68e9.R.inc(25356);Assert.assertTrue("not a buffer", object instanceof ChannelBuffer);
        __CLR4_5_2jfajfalwye68e9.R.inc(25357);Assert.assertEquals(ChannelBuffers.hexDump(expected), ChannelBuffers.hexDump((ChannelBuffer) object));

    }finally{__CLR4_5_2jfajfalwye68e9.R.flushNeeded();}}

}
