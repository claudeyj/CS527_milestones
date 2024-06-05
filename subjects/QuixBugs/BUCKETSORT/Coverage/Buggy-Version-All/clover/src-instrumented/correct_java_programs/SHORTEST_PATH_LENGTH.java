/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package correct_java_programs;
import java.util.*;

import java_programs.Node;

/**
 *
 * @author Angela Chen
 */

public class SHORTEST_PATH_LENGTH {static class __CLR4_5_2gegelwzsbbye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468353630L,8589935092L,628,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int shortest_path_length(Map<List<Node>, Integer> length_by_edge, Node startnode, Node goalnode) {try{__CLR4_5_2gegelwzsbbye.R.inc(590);
        __CLR4_5_2gegelwzsbbye.R.inc(591);int n = length_by_edge.size();
        // the shortest distance from source to each node
        __CLR4_5_2gegelwzsbbye.R.inc(592);Map<Node, Integer> unvisitedNodes = new HashMap<>();
        __CLR4_5_2gegelwzsbbye.R.inc(593);Set<Node> visitedNodes = new HashSet<>();

        __CLR4_5_2gegelwzsbbye.R.inc(594);unvisitedNodes.put(startnode, 0);

        __CLR4_5_2gegelwzsbbye.R.inc(595);while ((((!unvisitedNodes.isEmpty())&&(__CLR4_5_2gegelwzsbbye.R.iget(596)!=0|true))||(__CLR4_5_2gegelwzsbbye.R.iget(597)==0&false))) {{
            __CLR4_5_2gegelwzsbbye.R.inc(598);Node node = getNodeWithMinDistance(unvisitedNodes);
            __CLR4_5_2gegelwzsbbye.R.inc(599);int distance = unvisitedNodes.get(node);
            __CLR4_5_2gegelwzsbbye.R.inc(600);unvisitedNodes.remove(node);

            __CLR4_5_2gegelwzsbbye.R.inc(601);if ((((node.getValue() == goalnode.getValue())&&(__CLR4_5_2gegelwzsbbye.R.iget(602)!=0|true))||(__CLR4_5_2gegelwzsbbye.R.iget(603)==0&false))) {{
                __CLR4_5_2gegelwzsbbye.R.inc(604);return distance;
            }
            }__CLR4_5_2gegelwzsbbye.R.inc(605);visitedNodes.add(node);

            __CLR4_5_2gegelwzsbbye.R.inc(606);for (Node nextnode : node.getSuccessors()) {{
                __CLR4_5_2gegelwzsbbye.R.inc(607);if ((((visitedNodes.contains(nextnode))&&(__CLR4_5_2gegelwzsbbye.R.iget(608)!=0|true))||(__CLR4_5_2gegelwzsbbye.R.iget(609)==0&false))) {{
                    __CLR4_5_2gegelwzsbbye.R.inc(610);continue;
                }

                }__CLR4_5_2gegelwzsbbye.R.inc(611);if ((((unvisitedNodes.get(nextnode) == null)&&(__CLR4_5_2gegelwzsbbye.R.iget(612)!=0|true))||(__CLR4_5_2gegelwzsbbye.R.iget(613)==0&false))) {{
                    __CLR4_5_2gegelwzsbbye.R.inc(614);unvisitedNodes.put(nextnode, Integer.MAX_VALUE);
                }

                }__CLR4_5_2gegelwzsbbye.R.inc(615);unvisitedNodes.put(nextnode, Math.min(unvisitedNodes.get(nextnode),
                        distance + length_by_edge.get(Arrays.asList(node, nextnode))));
            }
        }}

        }__CLR4_5_2gegelwzsbbye.R.inc(616);return Integer.MAX_VALUE;
    }finally{__CLR4_5_2gegelwzsbbye.R.flushNeeded();}}

    public static Node getNodeWithMinDistance(Map<Node,Integer> list) {try{__CLR4_5_2gegelwzsbbye.R.inc(617);
        __CLR4_5_2gegelwzsbbye.R.inc(618);Node minNode = null;
        __CLR4_5_2gegelwzsbbye.R.inc(619);int minDistance = Integer.MAX_VALUE;
        __CLR4_5_2gegelwzsbbye.R.inc(620);for (Node node : list.keySet()) {{
            __CLR4_5_2gegelwzsbbye.R.inc(621);int distance = list.get(node);
            __CLR4_5_2gegelwzsbbye.R.inc(622);if ((((distance < minDistance)&&(__CLR4_5_2gegelwzsbbye.R.iget(623)!=0|true))||(__CLR4_5_2gegelwzsbbye.R.iget(624)==0&false))) {{
                __CLR4_5_2gegelwzsbbye.R.inc(625);minDistance = distance;
                __CLR4_5_2gegelwzsbbye.R.inc(626);minNode = node;
            }
        }}
        }__CLR4_5_2gegelwzsbbye.R.inc(627);return minNode;
    }finally{__CLR4_5_2gegelwzsbbye.R.flushNeeded();}}
}