/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.http;

import org.junit.Test;
import org.traccar.http.JsonConverter;
import org.traccar.model.Factory;

import java.io.Reader;
import java.io.StringReader;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JsonConverterTest {static class __CLR4_5_28nl8nllx1dh646{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564364996L,8589935092L,11280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private <T extends Factory> T convert(String jsonString, T prototype) throws ParseException {try{__CLR4_5_28nl8nllx1dh646.R.inc(11217);
        __CLR4_5_28nl8nllx1dh646.R.inc(11218);Reader r = new StringReader(
                jsonString);

        __CLR4_5_28nl8nllx1dh646.R.inc(11219);return JsonConverter.objectFromJson(r, prototype);
    }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

    @Test
    public void primitiveConversion() throws ParseException {__CLR4_5_28nl8nllx1dh646.R.globalSliceStart(getClass().getName(),11220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q3ybr88no();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28nl8nllx1dh646.R.rethrow($CLV_t2$);}finally{__CLR4_5_28nl8nllx1dh646.R.globalSliceEnd(getClass().getName(),"org.traccar.http.JsonConverterTest.primitiveConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q3ybr88no() throws ParseException{try{__CLR4_5_28nl8nllx1dh646.R.inc(11220);

        __CLR4_5_28nl8nllx1dh646.R.inc(11221);AllPrimitives o = convert("{" +
                        "\"aBoolean\": true, " +
                        "\"anInt\": 42, " +
                        "\"aDouble\": 41.99, " +
                        "\"aString\": \"discworld\", " +
                        "\"aDate\":\"2015-07-09T19:02:17\"" +
                        "}",
                new AllPrimitives());

        __CLR4_5_28nl8nllx1dh646.R.inc(11222);assertEquals(true, o.getaBoolean());
        __CLR4_5_28nl8nllx1dh646.R.inc(11223);assertEquals(42, o.getAnInt());
        __CLR4_5_28nl8nllx1dh646.R.inc(11224);assertEquals(41.99, o.getaDouble(), 0.001);
        __CLR4_5_28nl8nllx1dh646.R.inc(11225);assertEquals("discworld", o.getaString());

        __CLR4_5_28nl8nllx1dh646.R.inc(11226);Calendar c = Calendar.getInstance();
        __CLR4_5_28nl8nllx1dh646.R.inc(11227);c.setTime(o.getaDate());
        __CLR4_5_28nl8nllx1dh646.R.inc(11228);assertEquals(2015, c.get(Calendar.YEAR));
        __CLR4_5_28nl8nllx1dh646.R.inc(11229);assertEquals(Calendar.JULY, c.get(Calendar.MONTH));
        __CLR4_5_28nl8nllx1dh646.R.inc(11230);assertEquals(9, c.get(Calendar.DAY_OF_MONTH));
        __CLR4_5_28nl8nllx1dh646.R.inc(11231);assertEquals(19, c.get(Calendar.HOUR_OF_DAY));
        __CLR4_5_28nl8nllx1dh646.R.inc(11232);assertEquals(2, c.get(Calendar.MINUTE));
        __CLR4_5_28nl8nllx1dh646.R.inc(11233);assertEquals(17, c.get(Calendar.SECOND));
    }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

    public static class AllPrimitives implements Factory {

        private boolean aBoolean;
        private int anInt;
        private double aDouble;
        private String aString;
        private Date aDate;


        @Override
        public Object create() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11234);
            __CLR4_5_28nl8nllx1dh646.R.inc(11235);return new AllPrimitives();
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public boolean getaBoolean() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11236);
            __CLR4_5_28nl8nllx1dh646.R.inc(11237);return aBoolean;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setaBoolean(boolean aBoolean) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11238);
            __CLR4_5_28nl8nllx1dh646.R.inc(11239);this.aBoolean = aBoolean;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public int getAnInt() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11240);
            __CLR4_5_28nl8nllx1dh646.R.inc(11241);return anInt;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setAnInt(int anInt) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11242);
            __CLR4_5_28nl8nllx1dh646.R.inc(11243);this.anInt = anInt;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public double getaDouble() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11244);
            __CLR4_5_28nl8nllx1dh646.R.inc(11245);return aDouble;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setaDouble(double aDouble) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11246);
            __CLR4_5_28nl8nllx1dh646.R.inc(11247);this.aDouble = aDouble;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public String getaString() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11248);
            __CLR4_5_28nl8nllx1dh646.R.inc(11249);return aString;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setaString(String aString) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11250);
            __CLR4_5_28nl8nllx1dh646.R.inc(11251);this.aString = aString;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public Date getaDate() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11252);
            __CLR4_5_28nl8nllx1dh646.R.inc(11253);return aDate;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setaDate(Date aDate) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11254);
            __CLR4_5_28nl8nllx1dh646.R.inc(11255);this.aDate = aDate;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}
    }


    @Test
    public void enumConversion() throws ParseException {__CLR4_5_28nl8nllx1dh646.R.globalSliceStart(getClass().getName(),11256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2czqqu68oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28nl8nllx1dh646.R.rethrow($CLV_t2$);}finally{__CLR4_5_28nl8nllx1dh646.R.globalSliceEnd(getClass().getName(),"org.traccar.http.JsonConverterTest.enumConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2czqqu68oo() throws ParseException{try{__CLR4_5_28nl8nllx1dh646.R.inc(11256);
        __CLR4_5_28nl8nllx1dh646.R.inc(11257);ObjectWithEnum o = convert("{\"anEnum\": \"VALUE2\"}", new ObjectWithEnum());
        __CLR4_5_28nl8nllx1dh646.R.inc(11258);assertEquals(TestEnum.VALUE2, o.getAnEnum());
    }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}


    public enum TestEnum {
        VALUE1, VALUE2
    }

    public static class ObjectWithEnum implements Factory {
        private TestEnum anEnum;

        public TestEnum getAnEnum() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11259);
            __CLR4_5_28nl8nllx1dh646.R.inc(11260);return anEnum;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setAnEnum(TestEnum anEnum) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11261);
            __CLR4_5_28nl8nllx1dh646.R.inc(11262);this.anEnum = anEnum;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        @Override
        public Object create() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11263);
            __CLR4_5_28nl8nllx1dh646.R.inc(11264);return new ObjectWithEnum();
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}
    }


    @Test
    public void nestedObjectsConversion() throws ParseException {__CLR4_5_28nl8nllx1dh646.R.globalSliceStart(getClass().getName(),11265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28yly4m8ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28nl8nllx1dh646.R.rethrow($CLV_t2$);}finally{__CLR4_5_28nl8nllx1dh646.R.globalSliceEnd(getClass().getName(),"org.traccar.http.JsonConverterTest.nestedObjectsConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28yly4m8ox() throws ParseException{try{__CLR4_5_28nl8nllx1dh646.R.inc(11265);
        __CLR4_5_28nl8nllx1dh646.R.inc(11266);NestedObjects o = convert("{\"name\": \"Rincewind\", \"nestedObject\": {\"anEnum\":\"VALUE1\"}}", new NestedObjects());
        __CLR4_5_28nl8nllx1dh646.R.inc(11267);assertEquals("Rincewind", o.getName());
        __CLR4_5_28nl8nllx1dh646.R.inc(11268);assertNotNull("The nested object should be populated", o.getNestedObject());
        __CLR4_5_28nl8nllx1dh646.R.inc(11269);assertEquals(TestEnum.VALUE1, o.getNestedObject().getAnEnum());
    }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

    public static class NestedObjects implements Factory {

        private String name;
        private ObjectWithEnum nestedObject;

        public String getName() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11270);
            __CLR4_5_28nl8nllx1dh646.R.inc(11271);return name;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11272);
            __CLR4_5_28nl8nllx1dh646.R.inc(11273);this.name = name;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public ObjectWithEnum getNestedObject() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11274);
            __CLR4_5_28nl8nllx1dh646.R.inc(11275);return nestedObject;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        public void setNestedObject(ObjectWithEnum nestedObject) {try{__CLR4_5_28nl8nllx1dh646.R.inc(11276);
            __CLR4_5_28nl8nllx1dh646.R.inc(11277);this.nestedObject = nestedObject;
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}

        @Override
        public Object create() {try{__CLR4_5_28nl8nllx1dh646.R.inc(11278);
            __CLR4_5_28nl8nllx1dh646.R.inc(11279);return new NestedObjects();
        }finally{__CLR4_5_28nl8nllx1dh646.R.flushNeeded();}}
    }
}
