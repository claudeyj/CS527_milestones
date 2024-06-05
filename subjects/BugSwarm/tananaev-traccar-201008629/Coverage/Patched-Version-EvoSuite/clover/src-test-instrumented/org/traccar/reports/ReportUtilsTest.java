/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.reports;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;

public class ReportUtilsTest {static class __CLR4_5_2jsdjsdlx1dzees{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,25666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCalculateDistance() {__CLR4_5_2jsdjsdlx1dzees.R.globalSliceStart(getClass().getName(),25645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0xnw0jsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jsdjsdlx1dzees.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jsdjsdlx1dzees.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testCalculateDistance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0xnw0jsd(){try{__CLR4_5_2jsdjsdlx1dzees.R.inc(25645);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25646);Position startPosition = new Position();
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25647);startPosition.set(Position.KEY_TOTAL_DISTANCE, 500.0);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25648);Position endPosition = new Position();
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25649);endPosition.set(Position.KEY_TOTAL_DISTANCE, 700.0);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25650);Assert.assertEquals(ReportUtils.calculateDistance(startPosition, endPosition), 200.0, 10);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25651);startPosition.set(Position.KEY_ODOMETER, 50000);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25652);endPosition.set(Position.KEY_ODOMETER, 51000);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25653);Assert.assertEquals(ReportUtils.calculateDistance(startPosition, endPosition), 1000.0, 10);
    }finally{__CLR4_5_2jsdjsdlx1dzees.R.flushNeeded();}}

    @Test
    public void testCalculateSpentFuel() {__CLR4_5_2jsdjsdlx1dzees.R.globalSliceStart(getClass().getName(),25654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvgah5jsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jsdjsdlx1dzees.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jsdjsdlx1dzees.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testCalculateSpentFuel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvgah5jsm(){try{__CLR4_5_2jsdjsdlx1dzees.R.inc(25654);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25655);Position startPosition = new Position();
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25656);Position endPosition = new Position();
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25657);Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), "-");
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25658);startPosition.setProtocol("meitrack");
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25659);startPosition.set(Position.KEY_FUEL, 0.07);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25660);endPosition.set(Position.KEY_FUEL, 0.05);
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25661);Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), "0.02 %");
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25662);startPosition.setProtocol("galileo");
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25663);Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), "0.02 %");
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25664);startPosition.setProtocol("noran");
        __CLR4_5_2jsdjsdlx1dzees.R.inc(25665);Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), "0.02 %");
    }finally{__CLR4_5_2jsdjsdlx1dzees.R.flushNeeded();}}

}
