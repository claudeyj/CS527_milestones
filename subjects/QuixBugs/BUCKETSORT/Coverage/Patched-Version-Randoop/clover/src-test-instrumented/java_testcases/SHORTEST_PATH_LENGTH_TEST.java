/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.Node;
import java_programs.SHORTEST_PATH_LENGTH;

public class SHORTEST_PATH_LENGTH_TEST {static class __CLR4_5_22sq2sqlwzsd6yy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,3649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22sq2sqlwzsd6yy.R.inc(3626);

        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3627);Node node1 = new Node("1");
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3628);Node node5 = new Node("5");
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3629);Node node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node5)));
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3630);Node node3 = new Node("3", new ArrayList<Node>(Arrays.asList(node4)));
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3631);Node node2 = new Node("2", new ArrayList<Node>(Arrays.asList(node1, node3, node4)));
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3632);Node node0 = new Node("0", new ArrayList<Node>(Arrays.asList(node2, node5)));

        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3633);Map<List<Node>, Integer> length_by_edge = new HashMap<>();
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3634);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node0, node2)), 3);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3635);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node0, node5)), 10);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3636);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node2, node1)), 1);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3637);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node2, node3)), 2);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3638);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node2, node4)), 4);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3639);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node3, node4)), 1);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3640);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node4, node5)), 1);

        // Case 1: One path
        // Output: 4
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3641);int shortest_path_length = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node0, node1);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3642);System.out.println(shortest_path_length);

        // Case 2: Multiple path
        // Output: 7
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3643);int shortest_path_length2 = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node0, node5);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3644);System.out.println(shortest_path_length2);

        // Case 3: Start point is same as end point
        // Output: 0
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3645);int shortest_path_length3 = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node2, node2);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3646);System.out.println(shortest_path_length3);

        // Case 4: Unreachable path
        // Output: INT_MAX
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3647);int shortest_path_length4 = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node1, node5);
        __CLR4_5_22sq2sqlwzsd6yy.R.inc(3648);System.out.println(shortest_path_length4);


    }finally{__CLR4_5_22sq2sqlwzsd6yy.R.flushNeeded();}}
}