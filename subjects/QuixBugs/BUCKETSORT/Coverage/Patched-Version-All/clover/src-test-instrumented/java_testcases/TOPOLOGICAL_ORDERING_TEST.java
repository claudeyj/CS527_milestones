/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.Node;
import java_programs.TOPOLOGICAL_ORDERING;


/**
 * Driver for testing TOPOLOGICAL_ORDERING class
 */
public class TOPOLOGICAL_ORDERING_TEST {static class __CLR4_5_22td2tdlwzsdxw1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468475478L,8589935092L,3719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22td2tdlwzsdxw1.R.inc(3649);
        // Case 1: Wikipedia graph
        // Expected Output: 5 7 3 11 8 10 2 9
        
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3650);Node five = new Node("5");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3651);Node seven = new Node("7");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3652);Node three = new Node("3");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3653);Node eleven = new Node("11");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3654);Node eight = new Node("8");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3655);Node two = new Node("2");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3656);Node nine = new Node("9");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3657);Node ten = new Node("10");

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3658);five.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3659);seven.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3660);three.setSuccessors(new ArrayList<Node>(Arrays.asList(eight, ten)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3661);eleven.setPredecessors(new ArrayList<Node>(Arrays.asList(five, seven)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3662);eleven.setSuccessors(new ArrayList<Node>(Arrays.asList(two, nine, ten)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3663);eight.setPredecessors(new ArrayList<Node>(Arrays.asList(seven, three)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3664);eight.setSuccessors(new ArrayList<Node>(Arrays.asList(nine)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3665);two.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3666);nine.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3667);ten.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, three)));

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3668);ArrayList<Node> output = TOPOLOGICAL_ORDERING.topological_ordering(new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3669);ArrayList<String> string_output = new ArrayList<String>();
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3670);for (Node node : output) {{
            __CLR4_5_22td2tdlwzsdxw1.R.inc(3671);string_output.add(node.getValue());
        }
        }__CLR4_5_22td2tdlwzsdxw1.R.inc(3672);System.out.println(string_output);


        // Case 2: GeekforGeeks example
        // Output: 4 5 0 2 3 1

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3673);five = new Node("5");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3674);Node zero = new Node("0");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3675);Node four = new Node("4");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3676);Node one = new Node("1");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3677);two = new Node("2");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3678);three = new Node("3");

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3679);five.setSuccessors(new ArrayList<Node>(Arrays.asList(two, zero)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3680);four.setSuccessors(new ArrayList<Node>(Arrays.asList(zero, one)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3681);two.setPredecessors(new ArrayList<Node>(Arrays.asList(five)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3682);two.setSuccessors(new ArrayList<Node>(Arrays.asList(three)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3683);zero.setPredecessors(new ArrayList<Node>(Arrays.asList(five, four)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3684);one.setPredecessors(new ArrayList<Node>(Arrays.asList(four, three)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3685);three.setPredecessors(new ArrayList<Node>(Arrays.asList(two)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3686);three.setSuccessors(new ArrayList<Node>(Arrays.asList(one)));

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3687);output = TOPOLOGICAL_ORDERING.topological_ordering(new ArrayList<Node>(Arrays.asList(zero, one, two, three, four, five)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3688);string_output = new ArrayList<String>();
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3689);for (Node node : output) {{
            __CLR4_5_22td2tdlwzsdxw1.R.inc(3690);string_output.add(node.getValue());
        }
        }__CLR4_5_22td2tdlwzsdxw1.R.inc(3691);System.out.println(string_output);


        // Case 3: Cooking with InteractivePython
        // Output:
        
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3692);Node milk = new Node("3/4 cup milk");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3693);Node egg = new Node("1 egg");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3694);Node oil = new Node("1 Tbl oil");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3695);Node mix = new Node ("1 cup mix");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3696);Node syrup = new Node("heat syrup");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3697);Node griddle = new Node("heat griddle");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3698);Node pour = new Node("pour 1/4 cup");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3699);Node turn = new Node("turn when bubbly");
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3700);Node eat = new Node("eat");

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3701);milk.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3702);egg.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3703);oil.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3704);mix.setPredecessors(new ArrayList<Node>(Arrays.asList(milk, egg, oil)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3705);mix.setSuccessors(new ArrayList<Node>(Arrays.asList(syrup, pour)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3706);griddle.setSuccessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3707);pour.setPredecessors(new ArrayList<Node>(Arrays.asList(mix, griddle)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3708);pour.setSuccessors(new ArrayList<Node>(Arrays.asList(turn)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3709);turn.setPredecessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3710);turn.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3711);syrup.setPredecessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3712);syrup.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3713);eat.setPredecessors(new ArrayList<Node>(Arrays.asList(syrup, turn)));

        __CLR4_5_22td2tdlwzsdxw1.R.inc(3714);output = TOPOLOGICAL_ORDERING.topological_ordering(new ArrayList<Node>(Arrays.asList(milk, egg, oil, mix, syrup, griddle, pour, turn, eat)));
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3715);string_output = new ArrayList<String>();
        __CLR4_5_22td2tdlwzsdxw1.R.inc(3716);for (Node node : output) {{
            __CLR4_5_22td2tdlwzsdxw1.R.inc(3717);string_output.add(node.getValue());
        }
        }__CLR4_5_22td2tdlwzsdxw1.R.inc(3718);System.out.println(string_output);
    }finally{__CLR4_5_22td2tdlwzsdxw1.R.flushNeeded();}}
}
