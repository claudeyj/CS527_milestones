/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geocoder;

import org.junit.Assert;
import org.junit.Test;

public class AddressFormatTest {static class __CLR4_5_2jo7jo7lwydylvp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,25512,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void test(Address address, String format, String expected) {try{__CLR4_5_2jo7jo7lwydylvp.R.inc(25495);
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25496);Assert.assertEquals(expected, new AddressFormat(format).format(address));
    }finally{__CLR4_5_2jo7jo7lwydylvp.R.flushNeeded();}}

    @Test
    public void testFormat() {__CLR4_5_2jo7jo7lwydylvp.R.globalSliceStart(getClass().getName(),25497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ezuswjo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jo7jo7lwydylvp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jo7jo7lwydylvp.R.globalSliceEnd(getClass().getName(),"org.traccar.geocoder.AddressFormatTest.testFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ezuswjo9(){try{__CLR4_5_2jo7jo7lwydylvp.R.inc(25497);

        __CLR4_5_2jo7jo7lwydylvp.R.inc(25498);Address address = new Address();
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25499);address.setCountry("NZ");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25500);address.setSettlement("Auckland");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25501);address.setStreet("Queen St");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25502);address.setHouse("1A");

        __CLR4_5_2jo7jo7lwydylvp.R.inc(25503);test(address, "%h %r %t %d %s %c %p", "1A Queen St Auckland NZ");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25504);test(address, "%h %r %t", "1A Queen St Auckland");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25505);test(address, "%h %r, %t", "1A Queen St, Auckland");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25506);test(address, "%h %r, %t %p", "1A Queen St, Auckland");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25507);test(address, "%t %d %c", "Auckland NZ");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25508);test(address, "%t, %d, %c", "Auckland, NZ");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25509);test(address, "%d %c", "NZ");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25510);test(address, "%d, %c", "NZ");
        __CLR4_5_2jo7jo7lwydylvp.R.inc(25511);test(address, "%p", "");
    }finally{__CLR4_5_2jo7jo7lwydylvp.R.flushNeeded();}}

}
