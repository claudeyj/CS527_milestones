/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {static class __CLR4_5_2jcljcllwye6897{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,25094,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {__CLR4_5_2jcljcllwye6897.R.globalSliceStart(getClass().getName(),25077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beujcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jcljcllwye6897.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jcljcllwye6897.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beujcl() throws Throwable{try{__CLR4_5_2jcljcllwye6897.R.inc(25077);
        __CLR4_5_2jcljcllwye6897.R.inc(25078);if ((((debug)&&(__CLR4_5_2jcljcllwye6897.R.iget(25079)!=0|true))||(__CLR4_5_2jcljcllwye6897.R.iget(25080)==0&false)))
            {__CLR4_5_2jcljcllwye6897.R.inc(25081);System.out.format("%n%s%n", "RegressionTest0.test1");
        }__CLR4_5_2jcljcllwye6897.R.inc(25082);org.traccar.protocol.Gl200Protocol gl200Protocol0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_5_2jcljcllwye6897.R.inc(25083);try {
            __CLR4_5_2jcljcllwye6897.R.inc(25084);org.traccar.protocol.Gl200TextProtocolDecoder gl200TextProtocolDecoder1 = new org.traccar.protocol.Gl200TextProtocolDecoder(gl200Protocol0);
            __CLR4_5_2jcljcllwye6897.R.inc(25085);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }finally{__CLR4_5_2jcljcllwye6897.R.flushNeeded();}}

    @Test
    public void test2() throws Throwable {__CLR4_5_2jcljcllwye6897.R.globalSliceStart(getClass().getName(),25086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7bjcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jcljcllwye6897.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jcljcllwye6897.R.globalSliceEnd(getClass().getName(),"RegressionTest0.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7bjcu() throws Throwable{try{__CLR4_5_2jcljcllwye6897.R.inc(25086);
        __CLR4_5_2jcljcllwye6897.R.inc(25087);if ((((debug)&&(__CLR4_5_2jcljcllwye6897.R.iget(25088)!=0|true))||(__CLR4_5_2jcljcllwye6897.R.iget(25089)==0&false)))
            {__CLR4_5_2jcljcllwye6897.R.inc(25090);System.out.format("%n%s%n", "RegressionTest0.test2");
        }__CLR4_5_2jcljcllwye6897.R.inc(25091);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_5_2jcljcllwye6897.R.inc(25092);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_5_2jcljcllwye6897.R.inc(25093);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_5_2jcljcllwye6897.R.flushNeeded();}}
}

