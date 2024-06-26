/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import org.traccar.database.IdentityManager;
import org.traccar.model.Device;
import org.traccar.model.Position;

public class BaseTest {static class __CLR4_5_2jd2jd2lwye7ihf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,25118,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    static {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25094);
        __CLR4_5_2jd2jd2lwye7ihf.R.inc(25095);Context.init(new IdentityManager() {

            private Device createDevice() {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25096);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25097);Device device = new Device();
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25098);device.setId(1);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25099);device.setName("test");
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25100);device.setUniqueId("123456789012345");
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25101);return device;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

            @Override
            public Device getById(long id) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25102);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25103);return createDevice();
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

            @Override
            public Device getByUniqueId(String uniqueId) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25104);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25105);return createDevice();
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}
            
            @Override
            public Position getLastPosition(long deviceId) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25106);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25107);return null;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}
            
            @Override
            public boolean isLatestPosition(Position position) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25108);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25109);return true;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

            @Override
            public boolean lookupAttributeBoolean(
                    long deviceId, String attributeName, boolean defaultValue, boolean lookupConfig) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25110);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25111);return false;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

            @Override
            public String lookupAttributeString(
                    long deviceId, String attributeName, String defaultValue, boolean lookupConfig) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25112);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25113);return null;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

            @Override
            public int lookupAttributeInteger(
                    long deviceId, String attributeName, int defaultValue, boolean lookupConfig) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25114);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25115);return 0;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

            @Override
            public long lookupAttributeLong(
                    long deviceId, String attributeName, long defaultValue, boolean lookupConfig) {try{__CLR4_5_2jd2jd2lwye7ihf.R.inc(25116);
                __CLR4_5_2jd2jd2lwye7ihf.R.inc(25117);return 0;
            }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

        });
    }finally{__CLR4_5_2jd2jd2lwye7ihf.R.flushNeeded();}}

}
