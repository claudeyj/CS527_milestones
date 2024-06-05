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

public class ProtocolTest extends BaseTest {static class __CLR4_5_2humhumlx1dvgm8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,23247,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Position position(String time, boolean valid, double lat, double lon) throws ParseException {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23134);

        __CLR4_5_2humhumlx1dvgm8.R.inc(23135);Position position = new Position();

        __CLR4_5_2humhumlx1dvgm8.R.inc(23136);if ((((time != null)&&(__CLR4_5_2humhumlx1dvgm8.R.iget(23137)!=0|true))||(__CLR4_5_2humhumlx1dvgm8.R.iget(23138)==0&false))) {{
            __CLR4_5_2humhumlx1dvgm8.R.inc(23139);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            __CLR4_5_2humhumlx1dvgm8.R.inc(23140);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2humhumlx1dvgm8.R.inc(23141);position.setTime(dateFormat.parse(time));
        }
        }__CLR4_5_2humhumlx1dvgm8.R.inc(23142);position.setValid(valid);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23143);position.setLatitude(lat);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23144);position.setLongitude(lon);

        __CLR4_5_2humhumlx1dvgm8.R.inc(23145);return position;
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    private String concatenateStrings(String... strings) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23146);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23147);StringBuilder builder = new StringBuilder();
        __CLR4_5_2humhumlx1dvgm8.R.inc(23148);for (String s : strings) {{
            __CLR4_5_2humhumlx1dvgm8.R.inc(23149);builder.append(s);
        }
        }__CLR4_5_2humhumlx1dvgm8.R.inc(23150);return builder.toString();
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected ChannelBuffer binary(String... data) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23151);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23152);return binary(ByteOrder.BIG_ENDIAN, data);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected ChannelBuffer binary(ByteOrder endianness, String... data) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23153);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23154);return ChannelBuffers.wrappedBuffer(
                endianness, DatatypeConverter.parseHexBinary(concatenateStrings(data)));
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected String text(String... data) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23155);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23156);return concatenateStrings(data);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected ChannelBuffer buffer(String... data) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23157);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23158);return ChannelBuffers.copiedBuffer(concatenateStrings(data), StandardCharsets.ISO_8859_1);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected DefaultHttpRequest request(String url) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23159);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23160);return request(HttpMethod.GET, url);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected DefaultHttpRequest request(HttpMethod method, String url) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23161);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23162);return new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, url);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected DefaultHttpRequest request(HttpMethod method, String url, ChannelBuffer data) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23163);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23164);DefaultHttpRequest request = new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, url);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23165);request.setContent(data);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23166);return request;
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyNotNull(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23167);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23168);Assert.assertNotNull(decoder.decode(null, null, object));
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyNothing(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23169);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23170);Assert.assertNull(decoder.decode(null, null, object));
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyAttributes(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23171);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23172);verifyDecodedPosition(decoder.decode(null, null, object), false, true, null);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyPosition(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23173);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23174);verifyDecodedPosition(decoder.decode(null, null, object), true, false, null);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyPosition(BaseProtocolDecoder decoder, Object object, Position position) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23175);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23176);verifyDecodedPosition(decoder.decode(null, null, object), true, false, position);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, Object object) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23177);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23178);verifyDecodedList(decoder.decode(null, null, object), true, null);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, boolean checkLocation, Object object) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23179);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23180);verifyDecodedList(decoder.decode(null, null, object), checkLocation, null);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyPositions(BaseProtocolDecoder decoder, Object object, Position position) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23181);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23182);verifyDecodedList(decoder.decode(null, null, object), true, position);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    private void verifyDecodedList(Object decodedObject, boolean checkLocation, Position expected) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23183);

        __CLR4_5_2humhumlx1dvgm8.R.inc(23184);Assert.assertNotNull("list is null", decodedObject);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23185);Assert.assertTrue("not a list", decodedObject instanceof List);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23186);Assert.assertFalse("list if empty", ((List) decodedObject).isEmpty());

        __CLR4_5_2humhumlx1dvgm8.R.inc(23187);for (Object item : (List) decodedObject) {{
            __CLR4_5_2humhumlx1dvgm8.R.inc(23188);verifyDecodedPosition(item, checkLocation, false, expected);
        }

    }}finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    private void verifyDecodedPosition(Object decodedObject, boolean checkLocation, boolean checkAttributes, Position expected) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23189);

        __CLR4_5_2humhumlx1dvgm8.R.inc(23190);Assert.assertNotNull("position is null", decodedObject);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23191);Assert.assertTrue("not a position", decodedObject instanceof Position);

        __CLR4_5_2humhumlx1dvgm8.R.inc(23192);Position position = (Position) decodedObject;

        __CLR4_5_2humhumlx1dvgm8.R.inc(23193);if ((((checkLocation)&&(__CLR4_5_2humhumlx1dvgm8.R.iget(23194)!=0|true))||(__CLR4_5_2humhumlx1dvgm8.R.iget(23195)==0&false))) {{

            __CLR4_5_2humhumlx1dvgm8.R.inc(23196);if ((((expected != null)&&(__CLR4_5_2humhumlx1dvgm8.R.iget(23197)!=0|true))||(__CLR4_5_2humhumlx1dvgm8.R.iget(23198)==0&false))) {{

                __CLR4_5_2humhumlx1dvgm8.R.inc(23199);if ((((expected.getFixTime() != null)&&(__CLR4_5_2humhumlx1dvgm8.R.iget(23200)!=0|true))||(__CLR4_5_2humhumlx1dvgm8.R.iget(23201)==0&false))) {{
                    __CLR4_5_2humhumlx1dvgm8.R.inc(23202);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    __CLR4_5_2humhumlx1dvgm8.R.inc(23203);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    __CLR4_5_2humhumlx1dvgm8.R.inc(23204);Assert.assertEquals("time", dateFormat.format(expected.getFixTime()), dateFormat.format(position.getFixTime()));
                }
                }__CLR4_5_2humhumlx1dvgm8.R.inc(23205);Assert.assertEquals("valid", expected.getValid(), position.getValid());
                __CLR4_5_2humhumlx1dvgm8.R.inc(23206);Assert.assertEquals("latitude", expected.getLatitude(), position.getLatitude(), 0.00001);
                __CLR4_5_2humhumlx1dvgm8.R.inc(23207);Assert.assertEquals("longitude", expected.getLongitude(), position.getLongitude(), 0.00001);

            } }else {{

                __CLR4_5_2humhumlx1dvgm8.R.inc(23208);Assert.assertNotNull(position.getFixTime());
                __CLR4_5_2humhumlx1dvgm8.R.inc(23209);Assert.assertTrue("year > 2000", position.getFixTime().after(new Date(946684800000L)));
                __CLR4_5_2humhumlx1dvgm8.R.inc(23210);Assert.assertTrue("time < +25 hours",
                        position.getFixTime().getTime() < System.currentTimeMillis() + 25 * 3600000);

                __CLR4_5_2humhumlx1dvgm8.R.inc(23211);Assert.assertTrue("latitude >= -90", position.getLatitude() >= -90);
                __CLR4_5_2humhumlx1dvgm8.R.inc(23212);Assert.assertTrue("latitude <= 90", position.getLatitude() <= 90);

                __CLR4_5_2humhumlx1dvgm8.R.inc(23213);Assert.assertTrue("longitude >= -180", position.getLongitude() >= -180);
                __CLR4_5_2humhumlx1dvgm8.R.inc(23214);Assert.assertTrue("longitude <= 180", position.getLongitude() <= 180);

            }

            }__CLR4_5_2humhumlx1dvgm8.R.inc(23215);Assert.assertTrue("altitude >= -12262", position.getAltitude() >= -12262);
            __CLR4_5_2humhumlx1dvgm8.R.inc(23216);Assert.assertTrue("altitude <= 18000", position.getAltitude() <= 18000);

            __CLR4_5_2humhumlx1dvgm8.R.inc(23217);Assert.assertTrue("speed >= 0", position.getSpeed() >= 0);
            __CLR4_5_2humhumlx1dvgm8.R.inc(23218);Assert.assertTrue("speed <= 869", position.getSpeed() <= 869);

            __CLR4_5_2humhumlx1dvgm8.R.inc(23219);Assert.assertTrue("course >= 0", position.getCourse() >= 0);
            __CLR4_5_2humhumlx1dvgm8.R.inc(23220);Assert.assertTrue("course <= 360", position.getCourse() <= 360);

            __CLR4_5_2humhumlx1dvgm8.R.inc(23221);Assert.assertNotNull("protocol is null", position.getProtocol());

        }

        }__CLR4_5_2humhumlx1dvgm8.R.inc(23222);Map<String, Object> attributes = position.getAttributes();

        __CLR4_5_2humhumlx1dvgm8.R.inc(23223);if ((((checkAttributes)&&(__CLR4_5_2humhumlx1dvgm8.R.iget(23224)!=0|true))||(__CLR4_5_2humhumlx1dvgm8.R.iget(23225)==0&false))) {{
            __CLR4_5_2humhumlx1dvgm8.R.inc(23226);Assert.assertFalse("no attributes", attributes.isEmpty());
        }

        }__CLR4_5_2humhumlx1dvgm8.R.inc(23227);if ((((position.getNetwork() != null && position.getNetwork().getCellTowers() != null)&&(__CLR4_5_2humhumlx1dvgm8.R.iget(23228)!=0|true))||(__CLR4_5_2humhumlx1dvgm8.R.iget(23229)==0&false))) {{
            __CLR4_5_2humhumlx1dvgm8.R.inc(23230);for (CellTower cellTower : position.getNetwork().getCellTowers()) {{
                __CLR4_5_2humhumlx1dvgm8.R.inc(23231);checkInteger(cellTower.getMobileCountryCode(), 0, 999);
                __CLR4_5_2humhumlx1dvgm8.R.inc(23232);checkInteger(cellTower.getMobileNetworkCode(), 0, 999);
                __CLR4_5_2humhumlx1dvgm8.R.inc(23233);checkInteger(cellTower.getLocationAreaCode(), 1, 65535);
                __CLR4_5_2humhumlx1dvgm8.R.inc(23234);checkInteger(cellTower.getCellId(), 0, 268435455);
            }
        }}

    }}finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    private void checkInteger(Object value, int min, int max) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23235);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23236);Assert.assertNotNull("value is null", value);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23237);Assert.assertTrue("not int or long", value instanceof Integer || value instanceof Long);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23238);long number = ((Number) value).longValue();
        __CLR4_5_2humhumlx1dvgm8.R.inc(23239);Assert.assertTrue("value too low", number >= min);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23240);Assert.assertTrue("value too high", number <= max);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    protected void verifyCommand(
            BaseProtocolEncoder encoder, Command command, ChannelBuffer expected) throws Exception {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23241);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23242);verifyDecodedCommand(encoder.encodeCommand(command), expected);
    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

    private void verifyDecodedCommand(Object decodedObject, ChannelBuffer expected) {try{__CLR4_5_2humhumlx1dvgm8.R.inc(23243);

        __CLR4_5_2humhumlx1dvgm8.R.inc(23244);Assert.assertNotNull("command is null", decodedObject);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23245);Assert.assertTrue("not a buffer", decodedObject instanceof ChannelBuffer);
        __CLR4_5_2humhumlx1dvgm8.R.inc(23246);Assert.assertEquals(ChannelBuffers.hexDump(expected), ChannelBuffers.hexDump((ChannelBuffer) decodedObject));

    }finally{__CLR4_5_2humhumlx1dvgm8.R.flushNeeded();}}

}
