/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;

/**
 *
 * @author Angela Chen
 */

public class SHORTEST_PATH_LENGTH {static class __CLR4_5_213e13elwzsdwo3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468473017L,8589935092L,1456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int shortest_path_length(Map<List<Node>, Integer> length_by_edge, Node startnode, Node goalnode) {try{__CLR4_5_213e13elwzsdwo3.R.inc(1418);
        __CLR4_5_213e13elwzsdwo3.R.inc(1419);int n = length_by_edge.size();
        // the shortest distance from source to each node
        __CLR4_5_213e13elwzsdwo3.R.inc(1420);Map<Node, Integer> unvisitedNodes = new HashMap<>();
        __CLR4_5_213e13elwzsdwo3.R.inc(1421);Set<Node> visitedNodes = new HashSet<>();

        __CLR4_5_213e13elwzsdwo3.R.inc(1422);unvisitedNodes.put(startnode, 0);

        __CLR4_5_213e13elwzsdwo3.R.inc(1423);while ((((!unvisitedNodes.isEmpty())&&(__CLR4_5_213e13elwzsdwo3.R.iget(1424)!=0|true))||(__CLR4_5_213e13elwzsdwo3.R.iget(1425)==0&false))) {{
            __CLR4_5_213e13elwzsdwo3.R.inc(1426);Node node = getNodeWithMinDistance(unvisitedNodes);
            __CLR4_5_213e13elwzsdwo3.R.inc(1427);int distance = unvisitedNodes.get(node);
            __CLR4_5_213e13elwzsdwo3.R.inc(1428);unvisitedNodes.remove(node);

            __CLR4_5_213e13elwzsdwo3.R.inc(1429);if ((((node.getValue() == goalnode.getValue())&&(__CLR4_5_213e13elwzsdwo3.R.iget(1430)!=0|true))||(__CLR4_5_213e13elwzsdwo3.R.iget(1431)==0&false))) {{
                __CLR4_5_213e13elwzsdwo3.R.inc(1432);return distance;
            }
            }__CLR4_5_213e13elwzsdwo3.R.inc(1433);visitedNodes.add(node);

            __CLR4_5_213e13elwzsdwo3.R.inc(1434);for (Node nextnode : node.getSuccessors()) {{
                __CLR4_5_213e13elwzsdwo3.R.inc(1435);if ((((visitedNodes.contains(nextnode))&&(__CLR4_5_213e13elwzsdwo3.R.iget(1436)!=0|true))||(__CLR4_5_213e13elwzsdwo3.R.iget(1437)==0&false))) {{
                    __CLR4_5_213e13elwzsdwo3.R.inc(1438);continue;
                }

                }__CLR4_5_213e13elwzsdwo3.R.inc(1439);if ((((unvisitedNodes.get(nextnode) == null)&&(__CLR4_5_213e13elwzsdwo3.R.iget(1440)!=0|true))||(__CLR4_5_213e13elwzsdwo3.R.iget(1441)==0&false))) {{
                    __CLR4_5_213e13elwzsdwo3.R.inc(1442);unvisitedNodes.put(nextnode, Integer.MAX_VALUE);
                }

                }__CLR4_5_213e13elwzsdwo3.R.inc(1443);unvisitedNodes.put(nextnode, Math.min(unvisitedNodes.get(nextnode),
                        unvisitedNodes.get(nextnode) + length_by_edge.get(Arrays.asList(node, nextnode))));
            }
        }}

        }__CLR4_5_213e13elwzsdwo3.R.inc(1444);return Integer.MAX_VALUE;
    }finally{__CLR4_5_213e13elwzsdwo3.R.flushNeeded();}}

    public static Node getNodeWithMinDistance(Map<Node,Integer> list) {try{__CLR4_5_213e13elwzsdwo3.R.inc(1445);
        __CLR4_5_213e13elwzsdwo3.R.inc(1446);Node minNode = null;
        __CLR4_5_213e13elwzsdwo3.R.inc(1447);int minDistance = Integer.MAX_VALUE;
        __CLR4_5_213e13elwzsdwo3.R.inc(1448);for (Node node : list.keySet()) {{
            __CLR4_5_213e13elwzsdwo3.R.inc(1449);int distance = list.get(node);
            __CLR4_5_213e13elwzsdwo3.R.inc(1450);if ((((distance < minDistance)&&(__CLR4_5_213e13elwzsdwo3.R.iget(1451)!=0|true))||(__CLR4_5_213e13elwzsdwo3.R.iget(1452)==0&false))) {{
                __CLR4_5_213e13elwzsdwo3.R.inc(1453);minDistance = distance;
                __CLR4_5_213e13elwzsdwo3.R.inc(1454);minNode = node;
            }
        }}
        }__CLR4_5_213e13elwzsdwo3.R.inc(1455);return minNode;
    }finally{__CLR4_5_213e13elwzsdwo3.R.flushNeeded();}}
}