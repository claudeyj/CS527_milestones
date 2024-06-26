/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package correct_java_programs;
import java.util.*;

import java_programs.Node;
import java_programs.WeightedEdge;
/**
 * Minimum spanning tree
 */
public class MINIMUM_SPANNING_TREE {public static class __CLR4_5_2ananlwzs9qfn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468279358L,8589935092L,410,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Set<WeightedEdge> minimum_spanning_tree(List<WeightedEdge> weightedEdges) {try{__CLR4_5_2ananlwzs9qfn.R.inc(383);
        __CLR4_5_2ananlwzs9qfn.R.inc(384);Map<Node,Set<Node>> groupByNode = new HashMap<>();
        __CLR4_5_2ananlwzs9qfn.R.inc(385);Set<WeightedEdge> minSpanningTree = new HashSet<>();

        __CLR4_5_2ananlwzs9qfn.R.inc(386);Collections.sort(weightedEdges);

        __CLR4_5_2ananlwzs9qfn.R.inc(387);for (WeightedEdge edge : weightedEdges) {{
            __CLR4_5_2ananlwzs9qfn.R.inc(388);Node vertex_u = edge.node1;
            __CLR4_5_2ananlwzs9qfn.R.inc(389);Node vertex_v = edge.node2;
            //System.out.printf("u: %s, v: %s weight: %d\n", vertex_u.getValue(), vertex_v.getValue(), edge.weight);
            __CLR4_5_2ananlwzs9qfn.R.inc(390);if ((((!groupByNode.containsKey(vertex_u))&&(__CLR4_5_2ananlwzs9qfn.R.iget(391)!=0|true))||(__CLR4_5_2ananlwzs9qfn.R.iget(392)==0&false))){{
                __CLR4_5_2ananlwzs9qfn.R.inc(393);groupByNode.put(vertex_u, new HashSet<>(Arrays.asList(vertex_u)));
            }
            }__CLR4_5_2ananlwzs9qfn.R.inc(394);if ((((!groupByNode.containsKey(vertex_v))&&(__CLR4_5_2ananlwzs9qfn.R.iget(395)!=0|true))||(__CLR4_5_2ananlwzs9qfn.R.iget(396)==0&false))){{
                __CLR4_5_2ananlwzs9qfn.R.inc(397);groupByNode.put(vertex_v, new HashSet<>(Arrays.asList(vertex_v)));
            }

            }__CLR4_5_2ananlwzs9qfn.R.inc(398);if ((((groupByNode.get(vertex_u) != groupByNode.get(vertex_v))&&(__CLR4_5_2ananlwzs9qfn.R.iget(399)!=0|true))||(__CLR4_5_2ananlwzs9qfn.R.iget(400)==0&false))) {{
                __CLR4_5_2ananlwzs9qfn.R.inc(401);minSpanningTree.add(edge);
                __CLR4_5_2ananlwzs9qfn.R.inc(402);groupByNode = update(groupByNode, vertex_u, vertex_v);
                __CLR4_5_2ananlwzs9qfn.R.inc(403);for (Node node : groupByNode.get(vertex_v)) {{
                    __CLR4_5_2ananlwzs9qfn.R.inc(404);groupByNode.put(node,  groupByNode.get(vertex_u));
                }
            }}
        }}
        }__CLR4_5_2ananlwzs9qfn.R.inc(405);return minSpanningTree;
    }finally{__CLR4_5_2ananlwzs9qfn.R.flushNeeded();}}

    public static Map<Node,Set<Node>> update(Map<Node,Set<Node>> groupByNode, Node vertex_u, Node vertex_v) {try{__CLR4_5_2ananlwzs9qfn.R.inc(406);
        __CLR4_5_2ananlwzs9qfn.R.inc(407);Set<Node> vertex_u_span = groupByNode.get(vertex_u);
        __CLR4_5_2ananlwzs9qfn.R.inc(408);vertex_u_span.addAll(groupByNode.get(vertex_v));

        __CLR4_5_2ananlwzs9qfn.R.inc(409);return groupByNode;
    }finally{__CLR4_5_2ananlwzs9qfn.R.flushNeeded();}}
}
