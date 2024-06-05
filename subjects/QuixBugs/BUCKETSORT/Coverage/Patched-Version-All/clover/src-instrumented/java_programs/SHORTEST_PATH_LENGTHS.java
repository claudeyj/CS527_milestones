/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;
import java.lang.Math.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angela Chen
 */
public class SHORTEST_PATH_LENGTHS {static class __CLR4_5_214g14glwzsdwoj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468473017L,8589935092L,1492,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Define Infinite as a large enough value. This value will be used
    // for vertices not connected to each other
    final static int INF = 99999;
    public static Map<List<Integer>,Integer> shortest_path_lengths(int numNodes, Map<List<Integer>,Integer> length_by_edge) {try{__CLR4_5_214g14glwzsdwoj.R.inc(1456);
        __CLR4_5_214g14glwzsdwoj.R.inc(1457);Map<List<Integer>,Integer> length_by_path = new HashMap<>();
        __CLR4_5_214g14glwzsdwoj.R.inc(1458);for (int i = 0; (((i < numNodes)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1459)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1460)==0&false)); i++) {{
            __CLR4_5_214g14glwzsdwoj.R.inc(1461);for (int j =0; (((j < numNodes)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1462)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1463)==0&false)); j++) {{
                __CLR4_5_214g14glwzsdwoj.R.inc(1464);List<Integer> edge = new ArrayList<>(Arrays.asList(i,j));
                __CLR4_5_214g14glwzsdwoj.R.inc(1465);if ((((i == j)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1466)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1467)==0&false))) {{
                    __CLR4_5_214g14glwzsdwoj.R.inc(1468);length_by_path.put(edge, 0);
                }
                }else {__CLR4_5_214g14glwzsdwoj.R.inc(1469);if ((((length_by_edge.containsKey(edge) )&&(__CLR4_5_214g14glwzsdwoj.R.iget(1470)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1471)==0&false))) {{
                    __CLR4_5_214g14glwzsdwoj.R.inc(1472);length_by_path.put(edge, length_by_edge.get(edge));
                } }else {{
                    __CLR4_5_214g14glwzsdwoj.R.inc(1473);length_by_path.put(edge, INF);
                }
            }}}
        }}
        }__CLR4_5_214g14glwzsdwoj.R.inc(1474);for (int k = 0; (((k < numNodes)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1475)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1476)==0&false)); k++) {{
            __CLR4_5_214g14glwzsdwoj.R.inc(1477);for (int i = 0; (((i < numNodes)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1478)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1479)==0&false)); i++) {{
                __CLR4_5_214g14glwzsdwoj.R.inc(1480);for (int j = 0; (((j < numNodes)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1481)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1482)==0&false)); j++) {{
                    __CLR4_5_214g14glwzsdwoj.R.inc(1483);int update_length = Math.min(length_by_path.get(Arrays.asList(i,j)),
                                                 sumLengths(length_by_path.get(Arrays.asList(i,k)),
                                                            length_by_path.get(Arrays.asList(j,k))));
                    __CLR4_5_214g14glwzsdwoj.R.inc(1484);length_by_path.put(Arrays.asList(i,j), update_length);
                }
            }}
        }}
        }__CLR4_5_214g14glwzsdwoj.R.inc(1485);return length_by_path;
    }finally{__CLR4_5_214g14glwzsdwoj.R.flushNeeded();}}

    static private int sumLengths(int a, int b) {try{__CLR4_5_214g14glwzsdwoj.R.inc(1486);
        __CLR4_5_214g14glwzsdwoj.R.inc(1487);if((((a == INF || b == INF)&&(__CLR4_5_214g14glwzsdwoj.R.iget(1488)!=0|true))||(__CLR4_5_214g14glwzsdwoj.R.iget(1489)==0&false))) {{
            __CLR4_5_214g14glwzsdwoj.R.inc(1490);return INF;
        }
        }__CLR4_5_214g14glwzsdwoj.R.inc(1491);return a + b;
    }finally{__CLR4_5_214g14glwzsdwoj.R.flushNeeded();}}

}
