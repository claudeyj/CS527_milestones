/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.MINIMUM_SPANNING_TREE;
import java_programs.Node;
import java_programs.WeightedEdge;

/**
 * Driver to test minimum spanning tree.
 */
public class MINIMUM_SPANNING_TREE_TEST {static class __CLR4_5_22qu2qulwzsbe4f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,3600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22qu2qulwzsbe4f.R.inc(3558);
        // Initialize nodes.
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3559);Node node1 = new Node("1");
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3560);Node node2 = new Node("2");
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3561);Node node3 = new Node("3");
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3562);Node node4 = new Node("4");
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3563);Node node5 = new Node("5");
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3564);Node node6 = new Node("6");

        // Case 1: Simple tree input.
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3565);WeightedEdge edge11 = new WeightedEdge(node1, node2, 10);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3566);WeightedEdge edge12 = new WeightedEdge(node2, node3, 15);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3567);WeightedEdge edge13 = new WeightedEdge(node3, node4, 10);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3568);WeightedEdge edge14 = new WeightedEdge(node1, node4, 10);

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3569);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge11, edge12, edge13, edge14));

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3570);Set<WeightedEdge> minspantree = new HashSet<>();
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3571);minspantree.addAll(MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph));

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3572);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_22qu2qulwzsbe4f.R.inc(3573);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(), edge.weight);
        }
        }__CLR4_5_22qu2qulwzsbe4f.R.inc(3574);System.out.println();

        // Case 2: Strongly connected tree input.
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3575);WeightedEdge edge21 = new WeightedEdge(node1, node2, 6);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3576);WeightedEdge edge22 = new WeightedEdge(node1, node3, 1);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3577);WeightedEdge edge23 = new WeightedEdge(node1, node4, 5);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3578);WeightedEdge edge24 = new WeightedEdge(node2, node3, 5);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3579);WeightedEdge edge25 = new WeightedEdge(node2, node5, 3);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3580);WeightedEdge edge26 = new WeightedEdge(node3, node4, 5);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3581);WeightedEdge edge27 = new WeightedEdge(node3, node5, 6);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3582);WeightedEdge edge28 = new WeightedEdge(node3, node6, 4);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3583);WeightedEdge edge29 = new WeightedEdge(node4, node6, 2);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3584);WeightedEdge edge210 = new WeightedEdge(node5, node6, 6);

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3585);List<WeightedEdge> graph2 = new ArrayList<>(
                Arrays.asList(edge21, edge22, edge23, edge24, edge25, edge26, edge27, edge28, edge29, edge210));

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3586);Set<WeightedEdge> minspantree2 = new HashSet<>();
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3587);minspantree2.addAll(MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph2));

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3588);for (WeightedEdge edge : minspantree2) {{
            __CLR4_5_22qu2qulwzsbe4f.R.inc(3589);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(), edge.weight);
        }
        }__CLR4_5_22qu2qulwzsbe4f.R.inc(3590);System.out.println();
        // Case 3: Minimum spanning tree input.
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3591);WeightedEdge edge31 = new WeightedEdge(node1, node2, 6);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3592);WeightedEdge edge32 = new WeightedEdge(node1, node3, 1);
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3593);WeightedEdge edge33 = new WeightedEdge(node2, node4, 2);

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3594);List<WeightedEdge> graph3 = new ArrayList<>(
                Arrays.asList(edge31, edge32, edge33));

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3595);Set<WeightedEdge> minspantree3 = new HashSet<>();
        __CLR4_5_22qu2qulwzsbe4f.R.inc(3596);minspantree3.addAll(MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph3));

        __CLR4_5_22qu2qulwzsbe4f.R.inc(3597);for (WeightedEdge edge : minspantree3) {{
            __CLR4_5_22qu2qulwzsbe4f.R.inc(3598);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(), edge.weight);
        }
        }__CLR4_5_22qu2qulwzsbe4f.R.inc(3599);System.out.println();
    }finally{__CLR4_5_22qu2qulwzsbe4f.R.flushNeeded();}}
}