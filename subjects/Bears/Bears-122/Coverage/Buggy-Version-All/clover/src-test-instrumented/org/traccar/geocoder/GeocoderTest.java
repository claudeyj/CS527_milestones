/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geocoder;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class GeocoderTest {static class __CLR4_5_2joojoolwydzsg4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,25557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Ignore
    @Test
    public void test() throws InterruptedException {__CLR4_5_2joojoolwydzsg4.R.globalSliceStart(getClass().getName(),25512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt3joo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2joojoolwydzsg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2joojoolwydzsg4.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt3joo() throws InterruptedException{try{__CLR4_5_2joojoolwydzsg4.R.inc(25512);
        __CLR4_5_2joojoolwydzsg4.R.inc(25513);testGoogle();
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    private String address;

    private synchronized String waitAddress() {try{__CLR4_5_2joojoolwydzsg4.R.inc(25514);
        __CLR4_5_2joojoolwydzsg4.R.inc(25515);try {
            __CLR4_5_2joojoolwydzsg4.R.inc(25516);wait(5000);
            __CLR4_5_2joojoolwydzsg4.R.inc(25517);return address;
        } catch (InterruptedException e) {
            __CLR4_5_2joojoolwydzsg4.R.inc(25518);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    private synchronized void setAddress(String address) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25519);
        __CLR4_5_2joojoolwydzsg4.R.inc(25520);this.address = address;
        __CLR4_5_2joojoolwydzsg4.R.inc(25521);notifyAll();
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    public void testGoogle() throws InterruptedException {__CLR4_5_2joojoolwydzsg4.R.globalSliceStart(getClass().getName(),25522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uymkiajoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2joojoolwydzsg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2joojoolwydzsg4.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGoogle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uymkiajoy() throws InterruptedException{try{__CLR4_5_2joojoolwydzsg4.R.inc(25522);
        __CLR4_5_2joojoolwydzsg4.R.inc(25523);Geocoder geocoder = new GoogleGeocoder(null, null, 0);

        __CLR4_5_2joojoolwydzsg4.R.inc(25524);geocoder.getAddress(new AddressFormat(), 31.776797, 35.211489, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25525);
                __CLR4_5_2joojoolwydzsg4.R.inc(25526);setAddress(address);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25527);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}
        });
        __CLR4_5_2joojoolwydzsg4.R.inc(25528);Assert.assertEquals("1 Ibn Shaprut St, Jerusalem, Jerusalem District, IL", waitAddress());
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    public void testNominatim() throws InterruptedException {__CLR4_5_2joojoolwydzsg4.R.globalSliceStart(getClass().getName(),25529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iaqxi5jp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2joojoolwydzsg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2joojoolwydzsg4.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testNominatim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iaqxi5jp5() throws InterruptedException{try{__CLR4_5_2joojoolwydzsg4.R.inc(25529);
        __CLR4_5_2joojoolwydzsg4.R.inc(25530);Geocoder geocoder = new NominatimGeocoder(null, null, null, 0);

        __CLR4_5_2joojoolwydzsg4.R.inc(25531);geocoder.getAddress(new AddressFormat(), 40.7337807, -73.9974401, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25532);
                __CLR4_5_2joojoolwydzsg4.R.inc(25533);setAddress(address);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25534);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}
        });
        __CLR4_5_2joojoolwydzsg4.R.inc(25535);Assert.assertEquals("35 West 9th Street, NYC, New York, US",  waitAddress());
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    public void testGisgraphy() throws InterruptedException {__CLR4_5_2joojoolwydzsg4.R.globalSliceStart(getClass().getName(),25536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o59bvzjpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2joojoolwydzsg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2joojoolwydzsg4.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGisgraphy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o59bvzjpc() throws InterruptedException{try{__CLR4_5_2joojoolwydzsg4.R.inc(25536);
        __CLR4_5_2joojoolwydzsg4.R.inc(25537);Geocoder geocoder = new GisgraphyGeocoder();

        __CLR4_5_2joojoolwydzsg4.R.inc(25538);geocoder.getAddress(new AddressFormat(), 48.8530000, 2.3400000, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25539);
                __CLR4_5_2joojoolwydzsg4.R.inc(25540);setAddress(address);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25541);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}
        });
        __CLR4_5_2joojoolwydzsg4.R.inc(25542);Assert.assertEquals("Rue du Jardinet, Paris, FR",  waitAddress());
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    public void testOpenCage() throws InterruptedException {__CLR4_5_2joojoolwydzsg4.R.globalSliceStart(getClass().getName(),25543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24zmdwhjpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2joojoolwydzsg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2joojoolwydzsg4.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testOpenCage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24zmdwhjpj() throws InterruptedException{try{__CLR4_5_2joojoolwydzsg4.R.inc(25543);
        __CLR4_5_2joojoolwydzsg4.R.inc(25544);Geocoder geocoder = new OpenCageGeocoder(
                "http://api.opencagedata.com/geocode/v1", "SECRET", 0);

        __CLR4_5_2joojoolwydzsg4.R.inc(25545);geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25546);
                __CLR4_5_2joojoolwydzsg4.R.inc(25547);setAddress(address);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25548);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}
        });
        __CLR4_5_2joojoolwydzsg4.R.inc(25549);Assert.assertEquals("Charleston Road, California, US",  waitAddress());
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

    public void testGeocodeFarm() throws InterruptedException {__CLR4_5_2joojoolwydzsg4.R.globalSliceStart(getClass().getName(),25550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m82qehjpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2joojoolwydzsg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2joojoolwydzsg4.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGeocodeFarm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m82qehjpq() throws InterruptedException{try{__CLR4_5_2joojoolwydzsg4.R.inc(25550);
        __CLR4_5_2joojoolwydzsg4.R.inc(25551);Geocoder geocoder = new GeocodeFarmGeocoder(null, null, 0);

        __CLR4_5_2joojoolwydzsg4.R.inc(25552);geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25553);
                __CLR4_5_2joojoolwydzsg4.R.inc(25554);setAddress(address);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2joojoolwydzsg4.R.inc(25555);
            }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}
        });
        __CLR4_5_2joojoolwydzsg4.R.inc(25556);Assert.assertEquals("Estrella Avenue, Arcadia, California, United States",  waitAddress());
    }finally{__CLR4_5_2joojoolwydzsg4.R.flushNeeded();}}

}
