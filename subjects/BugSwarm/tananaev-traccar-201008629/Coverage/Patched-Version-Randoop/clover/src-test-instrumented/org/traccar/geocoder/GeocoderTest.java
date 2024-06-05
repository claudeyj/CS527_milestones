/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geocoder;

import org.junit.Assert;
import org.junit.Test;

public class GeocoderTest {static class __CLR4_5_2i3ui3ulx1e0k2t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565269350L,8589935092L,23514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean enable = false;

    @Test
    public void test() throws InterruptedException {__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceStart(getClass().getName(),23466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt3i3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3ui3ulx1e0k2t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt3i3u() throws InterruptedException{try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23466);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23467);if ((((enable)&&(__CLR4_5_2i3ui3ulx1e0k2t.R.iget(23468)!=0|true))||(__CLR4_5_2i3ui3ulx1e0k2t.R.iget(23469)==0&false))) {{
            __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23470);testGeocodeFarm();
        }
    }}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    private String address;

    private synchronized String waitAddress() {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23471);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23472);try {
            __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23473);wait(5000);
            __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23474);return address;
        } catch (InterruptedException e) {
            __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23475);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    private synchronized void setAddress(String address) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23476);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23477);this.address = address;
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23478);notifyAll();
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    public void testGoogle() throws InterruptedException {__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceStart(getClass().getName(),23479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uymkiai47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3ui3ulx1e0k2t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGoogle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uymkiai47() throws InterruptedException{try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23479);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23480);Geocoder geocoder = new GoogleGeocoder();

        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23481);geocoder.getAddress(new AddressFormat(), 37.4217550, -122.0846330, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23482);
                __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23483);setAddress(address);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23484);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}
        });
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23485);Assert.assertEquals("1600 Amphitheatre Pkwy, Mountain View, CA, US", waitAddress());
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    public void testNominatim() throws InterruptedException {__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceStart(getClass().getName(),23486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iaqxi5i4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3ui3ulx1e0k2t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testNominatim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iaqxi5i4e() throws InterruptedException{try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23486);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23487);Geocoder geocoder = new NominatimGeocoder();

        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23488);geocoder.getAddress(new AddressFormat(), 40.7337807, -73.9974401, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23489);
                __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23490);setAddress(address);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23491);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}
        });
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23492);Assert.assertEquals("35 West 9th Street, NYC, New York, US",  waitAddress());
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    public void testGisgraphy() throws InterruptedException {__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceStart(getClass().getName(),23493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o59bvzi4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3ui3ulx1e0k2t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGisgraphy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o59bvzi4l() throws InterruptedException{try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23493);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23494);Geocoder geocoder = new GisgraphyGeocoder();

        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23495);geocoder.getAddress(new AddressFormat(), 48.8530000, 2.3400000, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23496);
                __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23497);setAddress(address);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23498);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}
        });
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23499);Assert.assertEquals("Rue du Jardinet, Paris, FR",  waitAddress());
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    public void testOpenCage() throws InterruptedException {__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceStart(getClass().getName(),23500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24zmdwhi4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3ui3ulx1e0k2t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testOpenCage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24zmdwhi4s() throws InterruptedException{try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23500);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23501);Geocoder geocoder = new OpenCageGeocoder(
                "http://api.opencagedata.com/geocode/v1", "SECRET", 0);

        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23502);geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23503);
                __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23504);setAddress(address);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23505);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}
        });
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23506);Assert.assertEquals("Charleston Road, California, US",  waitAddress());
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

    public void testGeocodeFarm() throws InterruptedException {__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceStart(getClass().getName(),23507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m82qehi4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i3ui3ulx1e0k2t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i3ui3ulx1e0k2t.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGeocodeFarm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m82qehi4z() throws InterruptedException{try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23507);
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23508);Geocoder geocoder = new GeocodeFarmGeocoder(0);

        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23509);geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23510);
                __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23511);setAddress(address);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i3ui3ulx1e0k2t.R.inc(23512);
            }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}
        });
        __CLR4_5_2i3ui3ulx1e0k2t.R.inc(23513);Assert.assertEquals("Estrella Avenue, Arcadia, California, United States",  waitAddress());
    }finally{__CLR4_5_2i3ui3ulx1e0k2t.R.flushNeeded();}}

}
