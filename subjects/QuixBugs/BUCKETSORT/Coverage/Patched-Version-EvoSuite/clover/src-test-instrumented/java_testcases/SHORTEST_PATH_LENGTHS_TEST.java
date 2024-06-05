/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.SHORTEST_PATH_LENGTHS;

public class SHORTEST_PATH_LENGTHS_TEST {static class __CLR4_5_22rl2rllwzscbi6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,3626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22rl2rllwzscbi6.R.inc(3585);
        // Case 1: Basic graph input.
        __CLR4_5_22rl2rllwzscbi6.R.inc(3586);Map<List<Integer>, Integer> graph = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3587);graph.put(new ArrayList<Integer>(Arrays.asList(0, 2)), 3);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3588);graph.put(new ArrayList<Integer>(Arrays.asList(0, 5)), 5);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3589);graph.put(new ArrayList<Integer>(Arrays.asList(2, 1)), -2);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3590);graph.put(new ArrayList<Integer>(Arrays.asList(2, 3)), 7);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3591);graph.put(new ArrayList<Integer>(Arrays.asList(2, 4)), 4);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3592);graph.put(new ArrayList<Integer>(Arrays.asList(3, 4)), -5);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3593);graph.put(new ArrayList<Integer>(Arrays.asList(4, 5)), -1);

        __CLR4_5_22rl2rllwzscbi6.R.inc(3594);Map<List<Integer>, Integer> length_by_path = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3595);length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(6, graph);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3596);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_22rl2rllwzscbi6.R.inc(3597);System.out.printf("((%d, %d), %d) ", edge.get(0), edge.get(1), length_by_path.get(edge));
        }
        }__CLR4_5_22rl2rllwzscbi6.R.inc(3598);System.out.println();

        // Case 2: Linear graph input.
        __CLR4_5_22rl2rllwzscbi6.R.inc(3599);Map<List<Integer>, Integer> graph2 = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3600);graph2.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3601);graph2.put(new ArrayList<Integer>(Arrays.asList(1, 2)), 5);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3602);graph2.put(new ArrayList<Integer>(Arrays.asList(2, 3)), -2);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3603);graph2.put(new ArrayList<Integer>(Arrays.asList(3, 4)), 7);

        __CLR4_5_22rl2rllwzscbi6.R.inc(3604);Map<List<Integer>, Integer> length_by_path2 = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3605);length_by_path2 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(5, graph2);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3606);for (List<Integer> edge : length_by_path2.keySet()) {{
            __CLR4_5_22rl2rllwzscbi6.R.inc(3607);System.out.printf("((%d, %d), %d) ", edge.get(0), edge.get(1), length_by_path2.get(edge));
        }
        }__CLR4_5_22rl2rllwzscbi6.R.inc(3608);System.out.println();

        // Case 3: Disconnected graphs input.
        __CLR4_5_22rl2rllwzscbi6.R.inc(3609);Map<List<Integer>, Integer> graph3 = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3610);graph3.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3611);graph3.put(new ArrayList<Integer>(Arrays.asList(2, 3)), 5);

        __CLR4_5_22rl2rllwzscbi6.R.inc(3612);Map<List<Integer>, Integer> length_by_path3 = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3613);length_by_path3 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(4, graph3);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3614);for (List<Integer> edge : length_by_path3.keySet()) {{
            __CLR4_5_22rl2rllwzscbi6.R.inc(3615);System.out.printf("((%d, %d), %d) ", edge.get(0), edge.get(1), length_by_path3.get(edge));
        }
        }__CLR4_5_22rl2rllwzscbi6.R.inc(3616);System.out.println();

        // Case 4: Strongly connected graph input.
        __CLR4_5_22rl2rllwzscbi6.R.inc(3617);Map<List<Integer>, Integer> graph4 = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3618);graph4.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3619);graph4.put(new ArrayList<Integer>(Arrays.asList(1, 2)), 5);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3620);graph4.put(new ArrayList<Integer>(Arrays.asList(2, 0)), -1);

        __CLR4_5_22rl2rllwzscbi6.R.inc(3621);Map<List<Integer>, Integer> length_by_path4 = new HashMap<>();
        __CLR4_5_22rl2rllwzscbi6.R.inc(3622);length_by_path4 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(3, graph4);
        __CLR4_5_22rl2rllwzscbi6.R.inc(3623);for (List<Integer> edge : length_by_path4.keySet()) {{
            __CLR4_5_22rl2rllwzscbi6.R.inc(3624);System.out.printf("((%d, %d), %d) ", edge.get(0), edge.get(1), length_by_path4.get(edge));
        }
        }__CLR4_5_22rl2rllwzscbi6.R.inc(3625);System.out.println();

    }finally{__CLR4_5_22rl2rllwzscbi6.R.flushNeeded();}}
}