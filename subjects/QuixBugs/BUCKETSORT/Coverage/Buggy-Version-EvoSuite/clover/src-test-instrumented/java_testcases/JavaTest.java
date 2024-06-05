/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.BREADTH_FIRST_SEARCH;
import java_programs.DEPTH_FIRST_SEARCH;
import java_programs.DETECT_CYCLE;
import java_programs.MINIMUM_SPANNING_TREE;
import java_programs.Node;
import java_programs.REVERSE_LINKED_LIST;
import java_programs.SHORTEST_PATHS;
import java_programs.SHORTEST_PATH_LENGTHS;
import java_programs.WeightedEdge;

public class JavaTest {static class __CLR4_5_22oe2oelwzs9sfs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,3558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22oe2oelwzs9sfs.R.inc(3470);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3471);Node station1 = new Node("Westminster", new ArrayList<Node>());
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3472);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3473);Node station3 = new Node("Trafalgar Square",  new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3474);Node station4 = new Node("Canary Wharf",  new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3475);Node station5 = new Node("London Bridge",  new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3476);Node station6 = new Node("Tottenham Court Road",  new ArrayList<Node>(Arrays.asList(station5, station4)));

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3477);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1))&&(__CLR4_5_22oe2oelwzs9sfs.R.iget(3478)!=0|true))||(__CLR4_5_22oe2oelwzs9sfs.R.iget(3479)==0&false)))
            {__CLR4_5_22oe2oelwzs9sfs.R.inc(3480);System.out.println("Path Found!");
        }else
            {__CLR4_5_22oe2oelwzs9sfs.R.inc(3481);System.out.println("Path Not Found!");

        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3482);DEPTH_FIRST_SEARCH dfs = new DEPTH_FIRST_SEARCH();

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3483);if ((((dfs.depth_first_search(station6, station1))&&(__CLR4_5_22oe2oelwzs9sfs.R.iget(3484)!=0|true))||(__CLR4_5_22oe2oelwzs9sfs.R.iget(3485)==0&false)))
            {__CLR4_5_22oe2oelwzs9sfs.R.inc(3486);System.out.println("Path Found!");
        }else
            {__CLR4_5_22oe2oelwzs9sfs.R.inc(3487);System.out.println("Path Not Found!");

        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3488);Node node1 = new Node("1");
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3489);Node node2 = new Node("2", node1);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3490);Node node3 = new Node("3", node2);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3491);Node node4 = new Node("4", node3);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3492);Node node5 = new Node("5", node4);

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3493);Node result = REVERSE_LINKED_LIST.reverse_linked_list(node5);

        //TODO: handle a null pointer exception
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3494);if ((((result.getValue() == node1.getValue())&&(__CLR4_5_22oe2oelwzs9sfs.R.iget(3495)!=0|true))||(__CLR4_5_22oe2oelwzs9sfs.R.iget(3496)==0&false))) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3497);System.out.println("Reversed!");
        }

        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3498);while ((((result != null)&&(__CLR4_5_22oe2oelwzs9sfs.R.iget(3499)!=0|true))||(__CLR4_5_22oe2oelwzs9sfs.R.iget(3500)==0&false))) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3501);System.out.printf("%s ", result.getValue());
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3502);result = result.getSuccessor();
        }
        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3503);System.out.println();

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3504);node1.setSuccessor(node2);

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3505);if ((((DETECT_CYCLE.detect_cycle(node5))&&(__CLR4_5_22oe2oelwzs9sfs.R.iget(3506)!=0|true))||(__CLR4_5_22oe2oelwzs9sfs.R.iget(3507)==0&false))) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3508);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3509);System.out.println("Cycle not detected!");
        }

        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3510);WeightedEdge edge1 = new WeightedEdge(node1, node2, 10);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3511);WeightedEdge edge2 = new WeightedEdge(node2, node3, 15);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3512);WeightedEdge edge3 = new WeightedEdge(node3, node4, 10);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3513);WeightedEdge edge4 = new WeightedEdge(node1, node4, 10);

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3514);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge1, edge2, edge3, edge4));

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3515);Set<WeightedEdge> minspantree = new HashSet<>();
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3516);minspantree.addAll(MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph));

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3517);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3518);System.out.printf("u: %s, v: %s, weight: %d\n", edge.node1.getValue(), edge.node2.getValue(), edge.weight);
        }

        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3519);Node nodeA = new Node("A");
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3520);WeightedEdge edge_1 = new WeightedEdge(nodeA, new Node("B"), 3);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3521);WeightedEdge edge_2 = new WeightedEdge(nodeA, new Node("C"), 3);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3522);WeightedEdge edge_3 = new WeightedEdge(nodeA, new Node("F"), 5);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3523);WeightedEdge edge_4 = new WeightedEdge(new Node("C"), new Node("B"), -2);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3524);WeightedEdge edge_5 = new WeightedEdge(new Node("C"), new Node("D"), 7);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3525);WeightedEdge edge_6 = new WeightedEdge(new Node("C"), new Node("E"), 4);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3526);WeightedEdge edge_7 = new WeightedEdge(new Node("D"), new Node("E"), -5);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3527);WeightedEdge edge_8 = new WeightedEdge(new Node("E"), new Node("F"), -1);

        
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3528);List<WeightedEdge> graph1 = new ArrayList<>(Arrays.asList(edge_1, edge_2, edge_3, edge_4, edge_5, edge_6, edge_7, edge_8));

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3529);Map<String,Integer> weight_by_node = new HashMap<String,Integer>();
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3530);weight_by_node = SHORTEST_PATHS.shortest_paths(nodeA, graph1);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3531);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3532);System.out.printf("Node: %s, distance: %d\n", node, weight_by_node.get(node));
        }


        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3533);Map<List<String>, Integer> graph2 = new HashMap<>();
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3534);graph2.put(new ArrayList<String>(Arrays.asList("A","C")),3);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3535);graph2.put(new ArrayList<String>(Arrays.asList("A","F")),5);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3536);graph2.put(new ArrayList<String>(Arrays.asList("C","B")),-2);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3537);graph2.put(new ArrayList<String>(Arrays.asList("C","D")),7);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3538);graph2.put(new ArrayList<String>(Arrays.asList("C","E")),4);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3539);graph2.put(new ArrayList<String>(Arrays.asList("D","E")),-5);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3540);graph2.put(new ArrayList<String>(Arrays.asList("E","F")),-1);
       
        //Removed existed variable name path
        //SHORTEST_PATHS path = new SHORTEST_PATHS();
        
        //Removed existed variable name weight_by_node
        //Map<String,Integer> weight_by_node = new HashMap<String,Integer>();
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3541);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph2);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3542);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3543);System.out.printf("Node: %s, distance: %d\n", node, weight_by_node.get(node));
        }

        }__CLR4_5_22oe2oelwzs9sfs.R.inc(3544);Map<List<Integer>, Integer> graph3 = new HashMap<>();
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3545);graph3.put(new ArrayList<Integer>(Arrays.asList(1,3)),3);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3546);graph3.put(new ArrayList<Integer>(Arrays.asList(1,6)),5);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3547);graph3.put(new ArrayList<Integer>(Arrays.asList(3,2)),-2);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3548);graph3.put(new ArrayList<Integer>(Arrays.asList(3,4)),7);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3549);graph3.put(new ArrayList<Integer>(Arrays.asList(3,5)),4);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3550);graph3.put(new ArrayList<Integer>(Arrays.asList(4,5)),-5);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3551);graph3.put(new ArrayList<Integer>(Arrays.asList(5,6)),-1);

        __CLR4_5_22oe2oelwzs9sfs.R.inc(3552);Map<List<Integer>,Integer> length_by_path = new HashMap<>();
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3553);length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(6, graph3);
        __CLR4_5_22oe2oelwzs9sfs.R.inc(3554);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_22oe2oelwzs9sfs.R.inc(3555);for(Integer i : edge) {{
                __CLR4_5_22oe2oelwzs9sfs.R.inc(3556);System.out.printf(" Node: %d ", i);
            }
            }__CLR4_5_22oe2oelwzs9sfs.R.inc(3557);System.out.printf(" %d\n",  length_by_path.get(edge));
        }
    }}finally{__CLR4_5_22oe2oelwzs9sfs.R.flushNeeded();}}
}