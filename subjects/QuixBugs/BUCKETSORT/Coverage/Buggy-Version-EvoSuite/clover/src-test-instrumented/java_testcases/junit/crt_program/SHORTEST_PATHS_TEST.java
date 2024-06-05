/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import correct_java_programs.SHORTEST_PATHS;

public class SHORTEST_PATHS_TEST {static class __CLR4_5_24w64w6lwzs9tx2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,6384,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * Case 1: All vertex is reachable from starting vertex Output: ('A', 0) ('B',
     * 1) ('C', 3) ('D', 10) ('E', 5) ('F', 4)
     */
    @Test
    public void test1() {__CLR4_5_24w64w6lwzs9tx2.R.globalSliceStart(getClass().getName(),6342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu4w6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24w64w6lwzs9tx2.R.rethrow($CLV_t2$);}finally{__CLR4_5_24w64w6lwzs9tx2.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATHS_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu4w6(){try{__CLR4_5_24w64w6lwzs9tx2.R.inc(6342);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6343);Map<List<String>, Integer> graph = new HashMap<>();
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6344);graph.put(new ArrayList<String>(Arrays.asList("A", "C")), 3);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6345);graph.put(new ArrayList<String>(Arrays.asList("A", "F")), 5);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6346);graph.put(new ArrayList<String>(Arrays.asList("C", "B")), -2);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6347);graph.put(new ArrayList<String>(Arrays.asList("C", "D")), 7);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6348);graph.put(new ArrayList<String>(Arrays.asList("C", "E")), 4);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6349);graph.put(new ArrayList<String>(Arrays.asList("D", "E")), -5);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6350);graph.put(new ArrayList<String>(Arrays.asList("E", "F")), -1);

        __CLR4_5_24w64w6lwzs9tx2.R.inc(6351);Map<String, Integer> weight_by_node = new HashMap<String, Integer>();
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6352);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6353);String resultStr = "";
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6354);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_24w64w6lwzs9tx2.R.inc(6355);resultStr += "("+node+","+weight_by_node.get(node)+")";
        }
         }__CLR4_5_24w64w6lwzs9tx2.R.inc(6356);assertEquals("(A,0)(B,1)(C,3)(D,10)(E,5)(F,4)",resultStr);
    }finally{__CLR4_5_24w64w6lwzs9tx2.R.flushNeeded();}}

    /**
     * Case 2: Graph with one path Output: ('A', 0) ('B', 1) ('C', 3) ('D', 6) ('E',
     * 5) ('F', 9)
     */
    @Test
    public void test2() {__CLR4_5_24w64w6lwzs9tx2.R.globalSliceStart(getClass().getName(),6357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b4wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24w64w6lwzs9tx2.R.rethrow($CLV_t2$);}finally{__CLR4_5_24w64w6lwzs9tx2.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATHS_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b4wl(){try{__CLR4_5_24w64w6lwzs9tx2.R.inc(6357);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6358);Map<List<String>, Integer> graph2 = new HashMap<>();
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6359);graph2.put(new ArrayList<String>(Arrays.asList("A", "B")), 1);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6360);graph2.put(new ArrayList<String>(Arrays.asList("B", "C")), 2);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6361);graph2.put(new ArrayList<String>(Arrays.asList("C", "D")), 3);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6362);graph2.put(new ArrayList<String>(Arrays.asList("D", "E")), -1);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6363);graph2.put(new ArrayList<String>(Arrays.asList("E", "F")), 4);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6364);Map<String, Integer> weight_by_node = new HashMap<String, Integer>();
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6365);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph2);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6366);String resultStr = "";
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6367);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_24w64w6lwzs9tx2.R.inc(6368);resultStr += "("+node+","+weight_by_node.get(node)+")";
        }
         }__CLR4_5_24w64w6lwzs9tx2.R.inc(6369);assertEquals("(A,0)(B,1)(C,3)(D,6)(E,5)(F,9)",resultStr);
    }finally{__CLR4_5_24w64w6lwzs9tx2.R.flushNeeded();}}

    /**
     * Case 3: Graph with cycle
     * Output: {'A': 0, 'C': 3, 'B': 1, 'E': 5, 'D': 6, 'F': 9}
     */
    @Test
    public void test3() {__CLR4_5_24w64w6lwzs9tx2.R.globalSliceStart(getClass().getName(),6370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs4wy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24w64w6lwzs9tx2.R.rethrow($CLV_t2$);}finally{__CLR4_5_24w64w6lwzs9tx2.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATHS_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs4wy(){try{__CLR4_5_24w64w6lwzs9tx2.R.inc(6370);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6371);Map<List<String>, Integer> graph2 = new HashMap<>();
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6372);graph2.put(new ArrayList<String>(Arrays.asList("A", "B")), 1);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6373);graph2.put(new ArrayList<String>(Arrays.asList("B", "C")), 2);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6374);graph2.put(new ArrayList<String>(Arrays.asList("C", "D")), 3);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6375);graph2.put(new ArrayList<String>(Arrays.asList("D", "E")), -1);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6376);graph2.put(new ArrayList<String>(Arrays.asList("E", "F")), 4);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6377);graph2.put(new ArrayList<String>(Arrays.asList("E", "D")), 1);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6378);Map<String, Integer> weight_by_node = new HashMap<String, Integer>();
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6379);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph2);
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6380);String resultStr = "";
        __CLR4_5_24w64w6lwzs9tx2.R.inc(6381);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_24w64w6lwzs9tx2.R.inc(6382);resultStr += "("+node+","+weight_by_node.get(node)+")";
        }
         }__CLR4_5_24w64w6lwzs9tx2.R.inc(6383);assertEquals("(A,0)(B,1)(C,3)(D,6)(E,5)(F,9)",resultStr);

    }finally{__CLR4_5_24w64w6lwzs9tx2.R.flushNeeded();}}

}
