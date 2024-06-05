/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;

public class TOPOLOGICAL_ORDERING {public static class __CLR4_5_217i17ilwzsd5l2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468437071L,8589935092L,1585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<Node> topological_ordering (List<Node> directedGraph) {try{__CLR4_5_217i17ilwzsd5l2.R.inc(1566);
        __CLR4_5_217i17ilwzsd5l2.R.inc(1567);ArrayList<Node> orderedNodes = new ArrayList<Node>();
        __CLR4_5_217i17ilwzsd5l2.R.inc(1568);for (Node node : directedGraph) {{
            __CLR4_5_217i17ilwzsd5l2.R.inc(1569);if ((((node.getPredecessors().isEmpty())&&(__CLR4_5_217i17ilwzsd5l2.R.iget(1570)!=0|true))||(__CLR4_5_217i17ilwzsd5l2.R.iget(1571)==0&false))) {{
                __CLR4_5_217i17ilwzsd5l2.R.inc(1572);orderedNodes.add(node);
            }
        }}

        }__CLR4_5_217i17ilwzsd5l2.R.inc(1573);int listSize = orderedNodes.size();
        __CLR4_5_217i17ilwzsd5l2.R.inc(1574);for (int i = 0; (((i < listSize)&&(__CLR4_5_217i17ilwzsd5l2.R.iget(1575)!=0|true))||(__CLR4_5_217i17ilwzsd5l2.R.iget(1576)==0&false)); i++) {{
            __CLR4_5_217i17ilwzsd5l2.R.inc(1577);Node node = orderedNodes.get(i);
            __CLR4_5_217i17ilwzsd5l2.R.inc(1578);for (Node nextNode : node.getSuccessors()) {{
                __CLR4_5_217i17ilwzsd5l2.R.inc(1579);if ((((orderedNodes.containsAll(nextNode.getSuccessors()) && !orderedNodes.contains(nextNode))&&(__CLR4_5_217i17ilwzsd5l2.R.iget(1580)!=0|true))||(__CLR4_5_217i17ilwzsd5l2.R.iget(1581)==0&false))) {{
                    __CLR4_5_217i17ilwzsd5l2.R.inc(1582);orderedNodes.add(nextNode);
                    __CLR4_5_217i17ilwzsd5l2.R.inc(1583);listSize++;
                }
            }}
        }}
        }__CLR4_5_217i17ilwzsd5l2.R.inc(1584);return orderedNodes;
    }finally{__CLR4_5_217i17ilwzsd5l2.R.flushNeeded();}}
}
