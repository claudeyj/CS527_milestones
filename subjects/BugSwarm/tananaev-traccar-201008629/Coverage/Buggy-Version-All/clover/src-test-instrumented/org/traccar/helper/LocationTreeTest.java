/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.helper;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LocationTreeTest {static class __CLR4_5_2i5hi5hlx1dxrri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,23536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testLocationTree() {__CLR4_5_2i5hi5hlx1dxrri.R.globalSliceStart(getClass().getName(),23525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zh1yrwi5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i5hi5hlx1dxrri.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i5hi5hlx1dxrri.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.LocationTreeTest.testLocationTree",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zh1yrwi5h(){try{__CLR4_5_2i5hi5hlx1dxrri.R.inc(23525);

        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23526);List<LocationTree.Item> items = new ArrayList<>();
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23527);items.add(new LocationTree.Item(1, 1, "a"));
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23528);items.add(new LocationTree.Item(3, 2, "b"));
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23529);items.add(new LocationTree.Item(1, 3, "c"));
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23530);items.add(new LocationTree.Item(4, 3, "d"));

        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23531);LocationTree tree = new LocationTree(items);

        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23532);Assert.assertEquals("a", tree.findNearest(new LocationTree.Item(1f, 1f)).getData());
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23533);Assert.assertEquals("d", tree.findNearest(new LocationTree.Item(10f, 10f)).getData());
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23534);Assert.assertEquals("c", tree.findNearest(new LocationTree.Item(1f, 2.5f)).getData());
        __CLR4_5_2i5hi5hlx1dxrri.R.inc(23535);Assert.assertEquals("a", tree.findNearest(new LocationTree.Item(1.5f, 1.5f)).getData());

    }finally{__CLR4_5_2i5hi5hlx1dxrri.R.flushNeeded();}}

}
