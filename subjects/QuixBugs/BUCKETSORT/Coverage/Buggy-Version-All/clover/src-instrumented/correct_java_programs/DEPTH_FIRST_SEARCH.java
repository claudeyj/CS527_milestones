/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package correct_java_programs;
import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java_programs.Node;

/**
 *
 * @author derricklin
 */
public class DEPTH_FIRST_SEARCH {public static class __CLR4_5_21111lwzsbb4q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468353630L,8589935092L,58,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean depth_first_search(Node startnode, Node goalnode) {try{__CLR4_5_21111lwzsbb4q.R.inc(37);
        __CLR4_5_21111lwzsbb4q.R.inc(38);Set<Node> nodesvisited = new HashSet<>();
        class Search {
            boolean search(Node node) {try{__CLR4_5_21111lwzsbb4q.R.inc(39);
                __CLR4_5_21111lwzsbb4q.R.inc(40);if ((((nodesvisited.contains(node))&&(__CLR4_5_21111lwzsbb4q.R.iget(41)!=0|true))||(__CLR4_5_21111lwzsbb4q.R.iget(42)==0&false))) {{
                    __CLR4_5_21111lwzsbb4q.R.inc(43);return false;
                } }else {__CLR4_5_21111lwzsbb4q.R.inc(44);if ((((node == goalnode)&&(__CLR4_5_21111lwzsbb4q.R.iget(45)!=0|true))||(__CLR4_5_21111lwzsbb4q.R.iget(46)==0&false))) {{
                    __CLR4_5_21111lwzsbb4q.R.inc(47);return true;
                } }else {{
                        __CLR4_5_21111lwzsbb4q.R.inc(48);nodesvisited.add(node);
                    __CLR4_5_21111lwzsbb4q.R.inc(49);for (Node successornodes : node.getSuccessors()) {{
                        __CLR4_5_21111lwzsbb4q.R.inc(50);if ((((search(successornodes))&&(__CLR4_5_21111lwzsbb4q.R.iget(51)!=0|true))||(__CLR4_5_21111lwzsbb4q.R.iget(52)==0&false))) {{ __CLR4_5_21111lwzsbb4q.R.inc(53);return true; }
                    }}
                }}
                }}__CLR4_5_21111lwzsbb4q.R.inc(54);return false;
            }finally{__CLR4_5_21111lwzsbb4q.R.flushNeeded();}}
        }__CLR4_5_21111lwzsbb4q.R.inc(55);;

        __CLR4_5_21111lwzsbb4q.R.inc(56);Search s = new Search();
        __CLR4_5_21111lwzsbb4q.R.inc(57);return s.search(startnode);
    }finally{__CLR4_5_21111lwzsbb4q.R.flushNeeded();}}

}
