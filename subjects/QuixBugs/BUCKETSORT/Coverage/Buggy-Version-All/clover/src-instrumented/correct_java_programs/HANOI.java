/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class HANOI {public static class __CLR4_5_23z3zlwzsbbkn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468353630L,8589935092L,172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // default start=1, end=3
    public static List<Pair<Integer,Integer>> hanoi(int height, int start, int end) {try{__CLR4_5_23z3zlwzsbbkn.R.inc(143);
        __CLR4_5_23z3zlwzsbbkn.R.inc(144);ArrayList<Pair<Integer,Integer>> steps = new ArrayList<Pair<Integer,Integer>>();

        __CLR4_5_23z3zlwzsbbkn.R.inc(145);if ((((height > 0)&&(__CLR4_5_23z3zlwzsbbkn.R.iget(146)!=0|true))||(__CLR4_5_23z3zlwzsbbkn.R.iget(147)==0&false))) {{
            __CLR4_5_23z3zlwzsbbkn.R.inc(148);PriorityQueue<Integer> crap_set = new PriorityQueue<Integer>();
            __CLR4_5_23z3zlwzsbbkn.R.inc(149);crap_set.add(1);
            __CLR4_5_23z3zlwzsbbkn.R.inc(150);crap_set.add(2);
            __CLR4_5_23z3zlwzsbbkn.R.inc(151);crap_set.add(3);
            __CLR4_5_23z3zlwzsbbkn.R.inc(152);crap_set.remove(start);
            __CLR4_5_23z3zlwzsbbkn.R.inc(153);crap_set.remove(end);
            __CLR4_5_23z3zlwzsbbkn.R.inc(154);int helper = crap_set.poll();
            __CLR4_5_23z3zlwzsbbkn.R.inc(155);steps.addAll(hanoi(height-1, start, helper));
            __CLR4_5_23z3zlwzsbbkn.R.inc(156);steps.add(new Pair<Integer,Integer>(start, end));
            __CLR4_5_23z3zlwzsbbkn.R.inc(157);steps.addAll(hanoi(height-1, helper, end));
        }

        }__CLR4_5_23z3zlwzsbbkn.R.inc(158);return steps;
    }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}


    public static class Pair<F, S> {
        private F first; //first member of pair
        private S second; //second member of pair

        public Pair(F first, S second) {try{__CLR4_5_23z3zlwzsbbkn.R.inc(159);
            __CLR4_5_23z3zlwzsbbkn.R.inc(160);this.first = first;
            __CLR4_5_23z3zlwzsbbkn.R.inc(161);this.second = second;
        }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}

        public void setFirst(F first) {try{__CLR4_5_23z3zlwzsbbkn.R.inc(162);
            __CLR4_5_23z3zlwzsbbkn.R.inc(163);this.first = first;
        }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}

        public void setSecond(S second) {try{__CLR4_5_23z3zlwzsbbkn.R.inc(164);
            __CLR4_5_23z3zlwzsbbkn.R.inc(165);this.second = second;
        }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}

        public F getFirst() {try{__CLR4_5_23z3zlwzsbbkn.R.inc(166);
            __CLR4_5_23z3zlwzsbbkn.R.inc(167);return first;
        }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}

        public S getSecond() {try{__CLR4_5_23z3zlwzsbbkn.R.inc(168);
            __CLR4_5_23z3zlwzsbbkn.R.inc(169);return second;
        }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_23z3zlwzsbbkn.R.inc(170);
            __CLR4_5_23z3zlwzsbbkn.R.inc(171);return "(" + String.valueOf(first) + ", " + String.valueOf(second) + ")";
        }finally{__CLR4_5_23z3zlwzsbbkn.R.flushNeeded();}}
    }
}
