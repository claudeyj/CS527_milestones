/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geolocation;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.BaseTest;
import org.traccar.model.CellTower;
import org.traccar.model.Network;

public class GeolocationProviderTest extends BaseTest {static class __CLR4_5_2i3fi3flx1dwmkx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,23466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean enable = false;

    @Test
    public void test() throws Exception {__CLR4_5_2i3fi3flx1dwmkx.R.globalSliceStart(getClass().getName(),23451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt3i3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3fi3flx1dwmkx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3fi3flx1dwmkx.R.globalSliceEnd(getClass().getName(),"org.traccar.geolocation.GeolocationProviderTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt3i3f() throws Exception{try{__CLR4_5_2i3fi3flx1dwmkx.R.inc(23451);
        __CLR4_5_2i3fi3flx1dwmkx.R.inc(23452);if ((((enable)&&(__CLR4_5_2i3fi3flx1dwmkx.R.iget(23453)!=0|true))||(__CLR4_5_2i3fi3flx1dwmkx.R.iget(23454)==0&false))) {{
            __CLR4_5_2i3fi3flx1dwmkx.R.inc(23455);testLocationProvider();
        }
    }}finally{__CLR4_5_2i3fi3flx1dwmkx.R.flushNeeded();}}

    public void testLocationProvider() throws Exception {__CLR4_5_2i3fi3flx1dwmkx.R.globalSliceStart(getClass().getName(),23456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iew62ni3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3fi3flx1dwmkx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3fi3flx1dwmkx.R.globalSliceEnd(getClass().getName(),"org.traccar.geolocation.GeolocationProviderTest.testLocationProvider",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iew62ni3k() throws Exception{try{__CLR4_5_2i3fi3flx1dwmkx.R.inc(23456);
        __CLR4_5_2i3fi3flx1dwmkx.R.inc(23457);MozillaGeolocationProvider provider = new MozillaGeolocationProvider();

        __CLR4_5_2i3fi3flx1dwmkx.R.inc(23458);Network network = new Network(CellTower.from(208, 1, 2, 1234567));

        __CLR4_5_2i3fi3flx1dwmkx.R.inc(23459);provider.getLocation(network, new GeolocationProvider.LocationProviderCallback() {
            @Override
            public void onSuccess(double latitude, double longitude, double accuracy) {try{__CLR4_5_2i3fi3flx1dwmkx.R.inc(23460);
                __CLR4_5_2i3fi3flx1dwmkx.R.inc(23461);Assert.assertEquals(60.07254, latitude, 0.00001);
                __CLR4_5_2i3fi3flx1dwmkx.R.inc(23462);Assert.assertEquals(30.30996, longitude, 0.00001);
            }finally{__CLR4_5_2i3fi3flx1dwmkx.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i3fi3flx1dwmkx.R.inc(23463);
                __CLR4_5_2i3fi3flx1dwmkx.R.inc(23464);Assert.fail();
            }finally{__CLR4_5_2i3fi3flx1dwmkx.R.flushNeeded();}}
        });

        __CLR4_5_2i3fi3flx1dwmkx.R.inc(23465);Thread.sleep(Long.MAX_VALUE);
    }finally{__CLR4_5_2i3fi3flx1dwmkx.R.flushNeeded();}}

}
