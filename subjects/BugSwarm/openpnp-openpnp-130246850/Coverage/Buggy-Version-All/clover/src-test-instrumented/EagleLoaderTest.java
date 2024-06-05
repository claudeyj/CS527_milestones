/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */
import org.junit.Assert;
import org.junit.Test;
import org.openpnp.model.eagle.EagleLoader;
import org.openpnp.model.eagle.xml.Board;
import org.openpnp.model.eagle.xml.Element;
import org.openpnp.model.eagle.xml.Instance;
import org.openpnp.model.eagle.xml.Schematic;



public class EagleLoaderTest {static class __CLR4_5_2gxsgxslx1h3e2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570440782L,8589935092L,21962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testLoadBoard() throws Exception {__CLR4_5_2gxsgxslx1h3e2u.R.globalSliceStart(getClass().getName(),21952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cikcwbgxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gxsgxslx1h3e2u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gxsgxslx1h3e2u.R.globalSliceEnd(getClass().getName(),"EagleLoaderTest.testLoadBoard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cikcwbgxs() throws Exception{try{__CLR4_5_2gxsgxslx1h3e2u.R.inc(21952);
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21953);EagleLoader loader =
                new EagleLoader(ClassLoader.getSystemResourceAsStream("samples/eagle/eagle.brd"));
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21954);Board board = loader.board;
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21955);Element r1 = board.getElements().getElement().get(0);
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21956);Assert.assertEquals(r1.getName(), "R1");
    }finally{__CLR4_5_2gxsgxslx1h3e2u.R.flushNeeded();}}

    @Test
    public void testLoadSchematic() throws Exception {__CLR4_5_2gxsgxslx1h3e2u.R.globalSliceStart(getClass().getName(),21957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kccif0gxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gxsgxslx1h3e2u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gxsgxslx1h3e2u.R.globalSliceEnd(getClass().getName(),"EagleLoaderTest.testLoadSchematic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kccif0gxx() throws Exception{try{__CLR4_5_2gxsgxslx1h3e2u.R.inc(21957);
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21958);EagleLoader loader =
                new EagleLoader(ClassLoader.getSystemResourceAsStream("samples/eagle/eagle.sch"));
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21959);Schematic sch = loader.schematic;
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21960);Instance r1 = sch.getSheets().getSheet().get(0).getInstances().getInstance().get(0);
        __CLR4_5_2gxsgxslx1h3e2u.R.inc(21961);Assert.assertEquals(r1.getPart(), "R1");
    }finally{__CLR4_5_2gxsgxslx1h3e2u.R.flushNeeded();}}
}
