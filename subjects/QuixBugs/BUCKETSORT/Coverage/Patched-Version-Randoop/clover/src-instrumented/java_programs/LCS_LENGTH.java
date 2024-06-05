/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class LCS_LENGTH {public static class __CLR4_5_2ststlwzsd5d3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468437071L,8589935092L,1081,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Integer lcs_length(String s, String t) {try{__CLR4_5_2ststlwzsd5d3.R.inc(1037);
        // make a Counter
        // pair? no! just hashtable to a hashtable.. woo.. currying

        __CLR4_5_2ststlwzsd5d3.R.inc(1038);Map<Integer, Map<Integer,Integer>> dp = new HashMap<Integer,Map<Integer,Integer>>();

        // just set all the internal maps to 0
        __CLR4_5_2ststlwzsd5d3.R.inc(1039);for (int i=0; (((i < s.length())&&(__CLR4_5_2ststlwzsd5d3.R.iget(1040)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1041)==0&false)); i++) {{
            __CLR4_5_2ststlwzsd5d3.R.inc(1042);Map<Integer,Integer> initialize = new HashMap<Integer,Integer>();
            __CLR4_5_2ststlwzsd5d3.R.inc(1043);dp.put(i, initialize);
            __CLR4_5_2ststlwzsd5d3.R.inc(1044);for (int j=0; (((j < t.length())&&(__CLR4_5_2ststlwzsd5d3.R.iget(1045)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1046)==0&false)); j++) {{
                __CLR4_5_2ststlwzsd5d3.R.inc(1047);Map<Integer,Integer> internal_map = dp.get(i);
                __CLR4_5_2ststlwzsd5d3.R.inc(1048);internal_map.put(j,0);
                __CLR4_5_2ststlwzsd5d3.R.inc(1049);dp.put(i, internal_map);
            }
        }}

        // now the actual code
        }__CLR4_5_2ststlwzsd5d3.R.inc(1050);for (int i=0; (((i < s.length())&&(__CLR4_5_2ststlwzsd5d3.R.iget(1051)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1052)==0&false)); i++) {{
            __CLR4_5_2ststlwzsd5d3.R.inc(1053);for (int j=0; (((j < t.length())&&(__CLR4_5_2ststlwzsd5d3.R.iget(1054)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1055)==0&false)); j++) {{
                __CLR4_5_2ststlwzsd5d3.R.inc(1056);if ((((s.charAt(i) == t.charAt(j))&&(__CLR4_5_2ststlwzsd5d3.R.iget(1057)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1058)==0&false))) {{

                    __CLR4_5_2ststlwzsd5d3.R.inc(1059);if ((((dp.containsKey(i-1))&&(__CLR4_5_2ststlwzsd5d3.R.iget(1060)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1061)==0&false))) {{
                        __CLR4_5_2ststlwzsd5d3.R.inc(1062);Map<Integer, Integer> internal_map = dp.get(i);
                        __CLR4_5_2ststlwzsd5d3.R.inc(1063);int insert_value = dp.get(i-1).get(j) + 1;
                        __CLR4_5_2ststlwzsd5d3.R.inc(1064);internal_map.put(j, insert_value);
                        __CLR4_5_2ststlwzsd5d3.R.inc(1065);dp.put(i,internal_map);
                    } }else {{
                        __CLR4_5_2ststlwzsd5d3.R.inc(1066);Map<Integer, Integer> internal_map = dp.get(i);
                        __CLR4_5_2ststlwzsd5d3.R.inc(1067);internal_map.put(j,1);
                        __CLR4_5_2ststlwzsd5d3.R.inc(1068);dp.put(i,internal_map);
                    }
                }}
            }}
        }}

        }__CLR4_5_2ststlwzsd5d3.R.inc(1069);if ((((!dp.isEmpty())&&(__CLR4_5_2ststlwzsd5d3.R.iget(1070)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1071)==0&false))) {{
            __CLR4_5_2ststlwzsd5d3.R.inc(1072);List<Integer> ret_list = new ArrayList<Integer>();
            __CLR4_5_2ststlwzsd5d3.R.inc(1073);for (int i=0; (((i<s.length())&&(__CLR4_5_2ststlwzsd5d3.R.iget(1074)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1075)==0&false)); i++) {{
                __CLR4_5_2ststlwzsd5d3.R.inc(1076);ret_list.add((((!dp.get(i).isEmpty() )&&(__CLR4_5_2ststlwzsd5d3.R.iget(1077)!=0|true))||(__CLR4_5_2ststlwzsd5d3.R.iget(1078)==0&false))? Collections.max(dp.get(i).values()) : 0);
            }
            }__CLR4_5_2ststlwzsd5d3.R.inc(1079);return Collections.max(ret_list);
        } }else {{
            __CLR4_5_2ststlwzsd5d3.R.inc(1080);return 0;
        }
    }}finally{__CLR4_5_2ststlwzsd5d3.R.flushNeeded();}}
}
