/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import org.junit.Test;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;

public class DistanceHandlerTest {static class __CLR4_5_2jdxjdxlwye7iig{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,25134,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCalculateDistance() throws Exception {__CLR4_5_2jdxjdxlwye7iig.R.globalSliceStart(getClass().getName(),25125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0xnw0jdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jdxjdxlwye7iig.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jdxjdxlwye7iig.R.globalSliceEnd(getClass().getName(),"org.traccar.DistanceHandlerTest.testCalculateDistance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0xnw0jdx() throws Exception{try{__CLR4_5_2jdxjdxlwye7iig.R.inc(25125);

        __CLR4_5_2jdxjdxlwye7iig.R.inc(25126);DistanceHandler distanceHandler = new DistanceHandler(false, 0, 0);

        __CLR4_5_2jdxjdxlwye7iig.R.inc(25127);Position position = distanceHandler.handlePosition(new Position());

        __CLR4_5_2jdxjdxlwye7iig.R.inc(25128);assertEquals(0.0, position.getAttributes().get(Position.KEY_DISTANCE));
        __CLR4_5_2jdxjdxlwye7iig.R.inc(25129);assertEquals(0.0, position.getAttributes().get(Position.KEY_TOTAL_DISTANCE));

        __CLR4_5_2jdxjdxlwye7iig.R.inc(25130);position.set(Position.KEY_DISTANCE, 100);

        __CLR4_5_2jdxjdxlwye7iig.R.inc(25131);position = distanceHandler.handlePosition(position);

        __CLR4_5_2jdxjdxlwye7iig.R.inc(25132);assertEquals(100.0, position.getAttributes().get(Position.KEY_DISTANCE));
        __CLR4_5_2jdxjdxlwye7iig.R.inc(25133);assertEquals(100.0, position.getAttributes().get(Position.KEY_TOTAL_DISTANCE));

    }finally{__CLR4_5_2jdxjdxlwye7iig.R.flushNeeded();}}

}
