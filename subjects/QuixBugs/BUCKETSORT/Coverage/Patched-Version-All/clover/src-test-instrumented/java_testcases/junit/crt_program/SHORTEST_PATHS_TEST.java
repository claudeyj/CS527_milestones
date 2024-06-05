/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import correct_java_programs.SHORTEST_PATHS;

public class SHORTEST_PATHS_TEST {static class __CLR4_5_24tr4trlwzsdzbx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468475478L,8589935092L,6297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * Case 1: All vertex is reachable from starting vertex Output: ('A', 0) ('B',
     * 1) ('C', 3) ('D', 10) ('E', 5) ('F', 4)
     */
    @Test
    public void test1() {__CLR4_5_24tr4trlwzsdzbx.R.globalSliceStart(getClass().getName(),6255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu4tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24tr4trlwzsdzbx.R.rethrow($CLV_t2$);}finally{__CLR4_5_24tr4trlwzsdzbx.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATHS_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu4tr(){try{__CLR4_5_24tr4trlwzsdzbx.R.inc(6255);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6256);Map<List<String>, Integer> graph = new HashMap<>();
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6257);graph.put(new ArrayList<String>(Arrays.asList("A", "C")), 3);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6258);graph.put(new ArrayList<String>(Arrays.asList("A", "F")), 5);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6259);graph.put(new ArrayList<String>(Arrays.asList("C", "B")), -2);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6260);graph.put(new ArrayList<String>(Arrays.asList("C", "D")), 7);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6261);graph.put(new ArrayList<String>(Arrays.asList("C", "E")), 4);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6262);graph.put(new ArrayList<String>(Arrays.asList("D", "E")), -5);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6263);graph.put(new ArrayList<String>(Arrays.asList("E", "F")), -1);

        __CLR4_5_24tr4trlwzsdzbx.R.inc(6264);Map<String, Integer> weight_by_node = new HashMap<String, Integer>();
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6265);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6266);String resultStr = "";
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6267);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_24tr4trlwzsdzbx.R.inc(6268);resultStr += "("+node+","+weight_by_node.get(node)+")";
        }
         }__CLR4_5_24tr4trlwzsdzbx.R.inc(6269);assertEquals("(A,0)(B,1)(C,3)(D,10)(E,5)(F,4)",resultStr);
    }finally{__CLR4_5_24tr4trlwzsdzbx.R.flushNeeded();}}

    /**
     * Case 2: Graph with one path Output: ('A', 0) ('B', 1) ('C', 3) ('D', 6) ('E',
     * 5) ('F', 9)
     */
    @Test
    public void test2() {__CLR4_5_24tr4trlwzsdzbx.R.globalSliceStart(getClass().getName(),6270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b4u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24tr4trlwzsdzbx.R.rethrow($CLV_t2$);}finally{__CLR4_5_24tr4trlwzsdzbx.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATHS_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b4u6(){try{__CLR4_5_24tr4trlwzsdzbx.R.inc(6270);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6271);Map<List<String>, Integer> graph2 = new HashMap<>();
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6272);graph2.put(new ArrayList<String>(Arrays.asList("A", "B")), 1);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6273);graph2.put(new ArrayList<String>(Arrays.asList("B", "C")), 2);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6274);graph2.put(new ArrayList<String>(Arrays.asList("C", "D")), 3);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6275);graph2.put(new ArrayList<String>(Arrays.asList("D", "E")), -1);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6276);graph2.put(new ArrayList<String>(Arrays.asList("E", "F")), 4);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6277);Map<String, Integer> weight_by_node = new HashMap<String, Integer>();
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6278);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph2);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6279);String resultStr = "";
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6280);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_24tr4trlwzsdzbx.R.inc(6281);resultStr += "("+node+","+weight_by_node.get(node)+")";
        }
         }__CLR4_5_24tr4trlwzsdzbx.R.inc(6282);assertEquals("(A,0)(B,1)(C,3)(D,6)(E,5)(F,9)",resultStr);
    }finally{__CLR4_5_24tr4trlwzsdzbx.R.flushNeeded();}}

    /**
     * Case 3: Graph with cycle
     * Output: {'A': 0, 'C': 3, 'B': 1, 'E': 5, 'D': 6, 'F': 9}
     */
    @Test
    public void test3() {__CLR4_5_24tr4trlwzsdzbx.R.globalSliceStart(getClass().getName(),6283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs4uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24tr4trlwzsdzbx.R.rethrow($CLV_t2$);}finally{__CLR4_5_24tr4trlwzsdzbx.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATHS_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs4uj(){try{__CLR4_5_24tr4trlwzsdzbx.R.inc(6283);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6284);Map<List<String>, Integer> graph2 = new HashMap<>();
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6285);graph2.put(new ArrayList<String>(Arrays.asList("A", "B")), 1);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6286);graph2.put(new ArrayList<String>(Arrays.asList("B", "C")), 2);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6287);graph2.put(new ArrayList<String>(Arrays.asList("C", "D")), 3);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6288);graph2.put(new ArrayList<String>(Arrays.asList("D", "E")), -1);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6289);graph2.put(new ArrayList<String>(Arrays.asList("E", "F")), 4);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6290);graph2.put(new ArrayList<String>(Arrays.asList("E", "D")), 1);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6291);Map<String, Integer> weight_by_node = new HashMap<String, Integer>();
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6292);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph2);
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6293);String resultStr = "";
        __CLR4_5_24tr4trlwzsdzbx.R.inc(6294);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_24tr4trlwzsdzbx.R.inc(6295);resultStr += "("+node+","+weight_by_node.get(node)+")";
        }
         }__CLR4_5_24tr4trlwzsdzbx.R.inc(6296);assertEquals("(A,0)(B,1)(C,3)(D,6)(E,5)(F,9)",resultStr);

    }finally{__CLR4_5_24tr4trlwzsdzbx.R.flushNeeded();}}

}