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

public class JavaTest {static class __CLR4_5_22lz2lzlwzscbg3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,3471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22lz2lzlwzscbg3.R.inc(3383);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3384);Node station1 = new Node("Westminster", new ArrayList<Node>());
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3385);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3386);Node station3 = new Node("Trafalgar Square",  new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3387);Node station4 = new Node("Canary Wharf",  new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3388);Node station5 = new Node("London Bridge",  new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3389);Node station6 = new Node("Tottenham Court Road",  new ArrayList<Node>(Arrays.asList(station5, station4)));

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3390);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1))&&(__CLR4_5_22lz2lzlwzscbg3.R.iget(3391)!=0|true))||(__CLR4_5_22lz2lzlwzscbg3.R.iget(3392)==0&false)))
            {__CLR4_5_22lz2lzlwzscbg3.R.inc(3393);System.out.println("Path Found!");
        }else
            {__CLR4_5_22lz2lzlwzscbg3.R.inc(3394);System.out.println("Path Not Found!");

        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3395);DEPTH_FIRST_SEARCH dfs = new DEPTH_FIRST_SEARCH();

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3396);if ((((dfs.depth_first_search(station6, station1))&&(__CLR4_5_22lz2lzlwzscbg3.R.iget(3397)!=0|true))||(__CLR4_5_22lz2lzlwzscbg3.R.iget(3398)==0&false)))
            {__CLR4_5_22lz2lzlwzscbg3.R.inc(3399);System.out.println("Path Found!");
        }else
            {__CLR4_5_22lz2lzlwzscbg3.R.inc(3400);System.out.println("Path Not Found!");

        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3401);Node node1 = new Node("1");
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3402);Node node2 = new Node("2", node1);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3403);Node node3 = new Node("3", node2);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3404);Node node4 = new Node("4", node3);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3405);Node node5 = new Node("5", node4);

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3406);Node result = REVERSE_LINKED_LIST.reverse_linked_list(node5);

        //TODO: handle a null pointer exception
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3407);if ((((result.getValue() == node1.getValue())&&(__CLR4_5_22lz2lzlwzscbg3.R.iget(3408)!=0|true))||(__CLR4_5_22lz2lzlwzscbg3.R.iget(3409)==0&false))) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3410);System.out.println("Reversed!");
        }

        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3411);while ((((result != null)&&(__CLR4_5_22lz2lzlwzscbg3.R.iget(3412)!=0|true))||(__CLR4_5_22lz2lzlwzscbg3.R.iget(3413)==0&false))) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3414);System.out.printf("%s ", result.getValue());
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3415);result = result.getSuccessor();
        }
        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3416);System.out.println();

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3417);node1.setSuccessor(node2);

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3418);if ((((DETECT_CYCLE.detect_cycle(node5))&&(__CLR4_5_22lz2lzlwzscbg3.R.iget(3419)!=0|true))||(__CLR4_5_22lz2lzlwzscbg3.R.iget(3420)==0&false))) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3421);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3422);System.out.println("Cycle not detected!");
        }

        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3423);WeightedEdge edge1 = new WeightedEdge(node1, node2, 10);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3424);WeightedEdge edge2 = new WeightedEdge(node2, node3, 15);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3425);WeightedEdge edge3 = new WeightedEdge(node3, node4, 10);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3426);WeightedEdge edge4 = new WeightedEdge(node1, node4, 10);

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3427);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge1, edge2, edge3, edge4));

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3428);Set<WeightedEdge> minspantree = new HashSet<>();
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3429);minspantree.addAll(MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph));

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3430);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3431);System.out.printf("u: %s, v: %s, weight: %d\n", edge.node1.getValue(), edge.node2.getValue(), edge.weight);
        }

        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3432);Node nodeA = new Node("A");
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3433);WeightedEdge edge_1 = new WeightedEdge(nodeA, new Node("B"), 3);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3434);WeightedEdge edge_2 = new WeightedEdge(nodeA, new Node("C"), 3);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3435);WeightedEdge edge_3 = new WeightedEdge(nodeA, new Node("F"), 5);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3436);WeightedEdge edge_4 = new WeightedEdge(new Node("C"), new Node("B"), -2);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3437);WeightedEdge edge_5 = new WeightedEdge(new Node("C"), new Node("D"), 7);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3438);WeightedEdge edge_6 = new WeightedEdge(new Node("C"), new Node("E"), 4);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3439);WeightedEdge edge_7 = new WeightedEdge(new Node("D"), new Node("E"), -5);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3440);WeightedEdge edge_8 = new WeightedEdge(new Node("E"), new Node("F"), -1);

        
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3441);List<WeightedEdge> graph1 = new ArrayList<>(Arrays.asList(edge_1, edge_2, edge_3, edge_4, edge_5, edge_6, edge_7, edge_8));

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3442);Map<String,Integer> weight_by_node = new HashMap<String,Integer>();
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3443);weight_by_node = SHORTEST_PATHS.shortest_paths(nodeA, graph1);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3444);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3445);System.out.printf("Node: %s, distance: %d\n", node, weight_by_node.get(node));
        }


        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3446);Map<List<String>, Integer> graph2 = new HashMap<>();
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3447);graph2.put(new ArrayList<String>(Arrays.asList("A","C")),3);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3448);graph2.put(new ArrayList<String>(Arrays.asList("A","F")),5);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3449);graph2.put(new ArrayList<String>(Arrays.asList("C","B")),-2);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3450);graph2.put(new ArrayList<String>(Arrays.asList("C","D")),7);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3451);graph2.put(new ArrayList<String>(Arrays.asList("C","E")),4);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3452);graph2.put(new ArrayList<String>(Arrays.asList("D","E")),-5);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3453);graph2.put(new ArrayList<String>(Arrays.asList("E","F")),-1);
       
        //Removed existed variable name path
        //SHORTEST_PATHS path = new SHORTEST_PATHS();
        
        //Removed existed variable name weight_by_node
        //Map<String,Integer> weight_by_node = new HashMap<String,Integer>();
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3454);weight_by_node = SHORTEST_PATHS.shortest_paths("A", graph2);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3455);for (String node : weight_by_node.keySet()) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3456);System.out.printf("Node: %s, distance: %d\n", node, weight_by_node.get(node));
        }

        }__CLR4_5_22lz2lzlwzscbg3.R.inc(3457);Map<List<Integer>, Integer> graph3 = new HashMap<>();
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3458);graph3.put(new ArrayList<Integer>(Arrays.asList(1,3)),3);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3459);graph3.put(new ArrayList<Integer>(Arrays.asList(1,6)),5);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3460);graph3.put(new ArrayList<Integer>(Arrays.asList(3,2)),-2);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3461);graph3.put(new ArrayList<Integer>(Arrays.asList(3,4)),7);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3462);graph3.put(new ArrayList<Integer>(Arrays.asList(3,5)),4);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3463);graph3.put(new ArrayList<Integer>(Arrays.asList(4,5)),-5);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3464);graph3.put(new ArrayList<Integer>(Arrays.asList(5,6)),-1);

        __CLR4_5_22lz2lzlwzscbg3.R.inc(3465);Map<List<Integer>,Integer> length_by_path = new HashMap<>();
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3466);length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(6, graph3);
        __CLR4_5_22lz2lzlwzscbg3.R.inc(3467);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_22lz2lzlwzscbg3.R.inc(3468);for(Integer i : edge) {{
                __CLR4_5_22lz2lzlwzscbg3.R.inc(3469);System.out.printf(" Node: %d ", i);
            }
            }__CLR4_5_22lz2lzlwzscbg3.R.inc(3470);System.out.printf(" %d\n",  length_by_path.get(edge));
        }
    }}finally{__CLR4_5_22lz2lzlwzscbg3.R.flushNeeded();}}
}