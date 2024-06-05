/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geocoder;

import org.junit.Assert;
import org.junit.Test;

public class GeocoderTest {static class __CLR4_5_2i0gi0glx1dwmki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,23392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean enable = false;

    @Test
    public void test() throws InterruptedException {__CLR4_5_2i0gi0glx1dwmki.R.globalSliceStart(getClass().getName(),23344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt3i0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i0gi0glx1dwmki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i0gi0glx1dwmki.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt3i0g() throws InterruptedException{try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23344);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23345);if ((((enable)&&(__CLR4_5_2i0gi0glx1dwmki.R.iget(23346)!=0|true))||(__CLR4_5_2i0gi0glx1dwmki.R.iget(23347)==0&false))) {{
            __CLR4_5_2i0gi0glx1dwmki.R.inc(23348);testGeocodeFarm();
        }
    }}finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    private String address;

    private synchronized String waitAddress() {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23349);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23350);try {
            __CLR4_5_2i0gi0glx1dwmki.R.inc(23351);wait(5000);
            __CLR4_5_2i0gi0glx1dwmki.R.inc(23352);return address;
        } catch (InterruptedException e) {
            __CLR4_5_2i0gi0glx1dwmki.R.inc(23353);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    private synchronized void setAddress(String address) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23354);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23355);this.address = address;
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23356);notifyAll();
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    public void testGoogle() throws InterruptedException {__CLR4_5_2i0gi0glx1dwmki.R.globalSliceStart(getClass().getName(),23357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uymkiai0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i0gi0glx1dwmki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i0gi0glx1dwmki.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGoogle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uymkiai0t() throws InterruptedException{try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23357);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23358);Geocoder geocoder = new GoogleGeocoder();

        __CLR4_5_2i0gi0glx1dwmki.R.inc(23359);geocoder.getAddress(new AddressFormat(), 37.4217550, -122.0846330, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23360);
                __CLR4_5_2i0gi0glx1dwmki.R.inc(23361);setAddress(address);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23362);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}
        });
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23363);Assert.assertEquals("1600 Amphitheatre Pkwy, Mountain View, CA, US", waitAddress());
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    public void testNominatim() throws InterruptedException {__CLR4_5_2i0gi0glx1dwmki.R.globalSliceStart(getClass().getName(),23364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iaqxi5i10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i0gi0glx1dwmki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i0gi0glx1dwmki.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testNominatim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23364,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iaqxi5i10() throws InterruptedException{try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23364);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23365);Geocoder geocoder = new NominatimGeocoder();

        __CLR4_5_2i0gi0glx1dwmki.R.inc(23366);geocoder.getAddress(new AddressFormat(), 40.7337807, -73.9974401, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23367);
                __CLR4_5_2i0gi0glx1dwmki.R.inc(23368);setAddress(address);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23369);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}
        });
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23370);Assert.assertEquals("35 West 9th Street, NYC, New York, US",  waitAddress());
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    public void testGisgraphy() throws InterruptedException {__CLR4_5_2i0gi0glx1dwmki.R.globalSliceStart(getClass().getName(),23371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o59bvzi17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i0gi0glx1dwmki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i0gi0glx1dwmki.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGisgraphy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o59bvzi17() throws InterruptedException{try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23371);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23372);Geocoder geocoder = new GisgraphyGeocoder();

        __CLR4_5_2i0gi0glx1dwmki.R.inc(23373);geocoder.getAddress(new AddressFormat(), 48.8530000, 2.3400000, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23374);
                __CLR4_5_2i0gi0glx1dwmki.R.inc(23375);setAddress(address);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23376);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}
        });
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23377);Assert.assertEquals("Rue du Jardinet, Paris, FR",  waitAddress());
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    public void testOpenCage() throws InterruptedException {__CLR4_5_2i0gi0glx1dwmki.R.globalSliceStart(getClass().getName(),23378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24zmdwhi1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i0gi0glx1dwmki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i0gi0glx1dwmki.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testOpenCage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24zmdwhi1e() throws InterruptedException{try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23378);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23379);Geocoder geocoder = new OpenCageGeocoder(
                "http://api.opencagedata.com/geocode/v1", "SECRET", 0);

        __CLR4_5_2i0gi0glx1dwmki.R.inc(23380);geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23381);
                __CLR4_5_2i0gi0glx1dwmki.R.inc(23382);setAddress(address);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23383);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}
        });
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23384);Assert.assertEquals("Charleston Road, California, US",  waitAddress());
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

    public void testGeocodeFarm() throws InterruptedException {__CLR4_5_2i0gi0glx1dwmki.R.globalSliceStart(getClass().getName(),23385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m82qehi1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i0gi0glx1dwmki.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i0gi0glx1dwmki.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.GeocoderTest.testGeocodeFarm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m82qehi1l() throws InterruptedException{try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23385);
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23386);Geocoder geocoder = new GeocodeFarmGeocoder(0);

        __CLR4_5_2i0gi0glx1dwmki.R.inc(23387);geocoder.getAddress(new AddressFormat(), 34.116302, -118.051519, new Geocoder.ReverseGeocoderCallback() {
            @Override
            public void onSuccess(String address) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23388);
                __CLR4_5_2i0gi0glx1dwmki.R.inc(23389);setAddress(address);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

            @Override
            public void onFailure(Throwable e) {try{__CLR4_5_2i0gi0glx1dwmki.R.inc(23390);
            }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}
        });
        __CLR4_5_2i0gi0glx1dwmki.R.inc(23391);Assert.assertEquals("Estrella Avenue, Arcadia, California, United States",  waitAddress());
    }finally{__CLR4_5_2i0gi0glx1dwmki.R.flushNeeded();}}

}
