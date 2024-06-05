/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.BREADTH_FIRST_SEARCH;
import java_programs.Node;

public class BREADTH_FIRST_SEARCH_TEST {static class __CLR4_5_22in2inlwzscbe5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,3308,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22in2inlwzscbe5.R.inc(3263);
        // Case 1: Strongly connected graph
        // Output: Path found!
        __CLR4_5_22in2inlwzscbe5.R.inc(3264);Node station1 = new Node("Westminster");
        __CLR4_5_22in2inlwzscbe5.R.inc(3265);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3266);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3267);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3268);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3269);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));

        __CLR4_5_22in2inlwzscbe5.R.inc(3270);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1))&&(__CLR4_5_22in2inlwzscbe5.R.iget(3271)!=0|true))||(__CLR4_5_22in2inlwzscbe5.R.iget(3272)==0&false)))
            {__CLR4_5_22in2inlwzscbe5.R.inc(3273);System.out.println("Path Found!");
        }else
            {__CLR4_5_22in2inlwzscbe5.R.inc(3274);System.out.println("Path Not Found!");

        // Case 2: Branching graph
        // Output: Path found!
        }__CLR4_5_22in2inlwzscbe5.R.inc(3275);Node nodef = new Node("F");
        __CLR4_5_22in2inlwzscbe5.R.inc(3276);Node nodee = new Node("E");
        __CLR4_5_22in2inlwzscbe5.R.inc(3277);Node noded = new Node("D");
        __CLR4_5_22in2inlwzscbe5.R.inc(3278);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3279);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3280);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_22in2inlwzscbe5.R.inc(3281);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(nodea, nodee))&&(__CLR4_5_22in2inlwzscbe5.R.iget(3282)!=0|true))||(__CLR4_5_22in2inlwzscbe5.R.iget(3283)==0&false)))
            {__CLR4_5_22in2inlwzscbe5.R.inc(3284);System.out.println("Path Found!");
        }else
            {__CLR4_5_22in2inlwzscbe5.R.inc(3285);System.out.println("Path Not Found!");

        // Case 3: Two unconnected nodes in graph
        // Output: Path not found!
        }__CLR4_5_22in2inlwzscbe5.R.inc(3286);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodee))&&(__CLR4_5_22in2inlwzscbe5.R.iget(3287)!=0|true))||(__CLR4_5_22in2inlwzscbe5.R.iget(3288)==0&false)))
            {__CLR4_5_22in2inlwzscbe5.R.inc(3289);System.out.println("Path Found!");
        }else
            {__CLR4_5_22in2inlwzscbe5.R.inc(3290);System.out.println("Path Not Found!");

        // Case 4: One node graph
        // Output: Path found!
        }__CLR4_5_22in2inlwzscbe5.R.inc(3291);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodef))&&(__CLR4_5_22in2inlwzscbe5.R.iget(3292)!=0|true))||(__CLR4_5_22in2inlwzscbe5.R.iget(3293)==0&false)))
            {__CLR4_5_22in2inlwzscbe5.R.inc(3294);System.out.println("Path Found!");
        }else
            {__CLR4_5_22in2inlwzscbe5.R.inc(3295);System.out.println("Path Not Found!");

        }__CLR4_5_22in2inlwzscbe5.R.inc(3296);Node node1 = new Node("1");
        __CLR4_5_22in2inlwzscbe5.R.inc(3297);Node node2 = new Node("2");
        __CLR4_5_22in2inlwzscbe5.R.inc(3298);Node node3 = new Node("3");
        __CLR4_5_22in2inlwzscbe5.R.inc(3299);Node node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node1)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3300);Node node5 = new Node("5", new ArrayList<Node>(Arrays.asList(node2)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3301);Node node6 = new Node("6", new ArrayList<Node>(Arrays.asList(node5, node4, node3)));
        //Case 5: Graph with cycle
        // Output: Path found!
        __CLR4_5_22in2inlwzscbe5.R.inc(3302);node2.setSuccessors(new ArrayList<Node>(Arrays.asList(node6)));
        __CLR4_5_22in2inlwzscbe5.R.inc(3303);if ((((BREADTH_FIRST_SEARCH.breadth_first_search(node6, node1))&&(__CLR4_5_22in2inlwzscbe5.R.iget(3304)!=0|true))||(__CLR4_5_22in2inlwzscbe5.R.iget(3305)==0&false)))
            {__CLR4_5_22in2inlwzscbe5.R.inc(3306);System.out.println("Path Found!");
        }else
            {__CLR4_5_22in2inlwzscbe5.R.inc(3307);System.out.println("Path Not Found!");
    }}finally{__CLR4_5_22in2inlwzscbe5.R.flushNeeded();}}
}
