/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.web;

import java.io.StringReader;
import java.text.ParseException;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.traccar.model.Factory;

public class JsonConverterTest {static class __CLR4_5_2bnkbnklx1e39st{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565395579L,8589935092L,15137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void primitiveConversion() throws ParseException {__CLR4_5_2bnkbnklx1e39st.R.globalSliceStart(getClass().getName(),15104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q3ybr8bnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bnkbnklx1e39st.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bnkbnklx1e39st.R.globalSliceEnd(getClass().getName(),"org.traccar.web.JsonConverterTest.primitiveConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q3ybr8bnk() throws ParseException{try{__CLR4_5_2bnkbnklx1e39st.R.inc(15104);

        __CLR4_5_2bnkbnklx1e39st.R.inc(15105);Primitives o = JsonConverter.objectFromJson(new StringReader(
                "{" +
                "\"boolean\": true, " +
                "\"int\": 42, " +
                "\"double\": 41.99, " +
                "\"string\": \"discworld\", " +
                "\"date\":\"2015-07-09T19:02:17.000Z\"" +
                "}"),
                new Primitives());

        __CLR4_5_2bnkbnklx1e39st.R.inc(15106);assertEquals(true, o.getBoolean());
        __CLR4_5_2bnkbnklx1e39st.R.inc(15107);assertEquals(42, o.getInt());
        __CLR4_5_2bnkbnklx1e39st.R.inc(15108);assertEquals(41.99, o.getDouble(), 0.001);
        __CLR4_5_2bnkbnklx1e39st.R.inc(15109);assertEquals("discworld", o.getString());
        __CLR4_5_2bnkbnklx1e39st.R.inc(15110);assertEquals(1436468537000L, o.getDate().getTime());

    }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}

    public static class Primitives implements Factory {
        
        @Override
        public Primitives create() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15111);
            __CLR4_5_2bnkbnklx1e39st.R.inc(15112);return new Primitives();
        }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}

        private boolean b;
        public boolean getBoolean() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15113); __CLR4_5_2bnkbnklx1e39st.R.inc(15114);return b; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        public void setBoolean(boolean b) {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15115); __CLR4_5_2bnkbnklx1e39st.R.inc(15116);this.b = b; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        
        private int i;
        public int getInt() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15117); __CLR4_5_2bnkbnklx1e39st.R.inc(15118);return i; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        public void setInt(int i) {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15119); __CLR4_5_2bnkbnklx1e39st.R.inc(15120);this.i = i; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        
        private long l;
        public long getLong() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15121); __CLR4_5_2bnkbnklx1e39st.R.inc(15122);return l; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        public void setLong(long l) {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15123); __CLR4_5_2bnkbnklx1e39st.R.inc(15124);this.l = l; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        
        private double d;
        public double getDouble() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15125); __CLR4_5_2bnkbnklx1e39st.R.inc(15126);return d; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        public void setDouble(double d) {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15127); __CLR4_5_2bnkbnklx1e39st.R.inc(15128);this.d = d; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        
        private String s;
        public String getString() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15129); __CLR4_5_2bnkbnklx1e39st.R.inc(15130);return s; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        public void setString(String s) {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15131); __CLR4_5_2bnkbnklx1e39st.R.inc(15132);this.s = s; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        
        private Date t;
        public Date getDate() {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15133); __CLR4_5_2bnkbnklx1e39st.R.inc(15134);return t; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}
        public void setDate(Date t) {try{__CLR4_5_2bnkbnklx1e39st.R.inc(15135); __CLR4_5_2bnkbnklx1e39st.R.inc(15136);this.t = t; }finally{__CLR4_5_2bnkbnklx1e39st.R.flushNeeded();}}

    }

}
