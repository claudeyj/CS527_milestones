/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import correct_java_programs.TOPOLOGICAL_ORDERING;
import java_programs.Node;

public class TOPOLOGICAL_ORDERING_TEST {static class __CLR4_5_252h52hlwzsaocs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,6642,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Wikipedia graph Output: 5 7 3 11 8 10 2 9
     */
    @Test
    public void test1() {__CLR4_5_252h52hlwzsaocs.R.globalSliceStart(getClass().getName(),6569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu52h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_252h52hlwzsaocs.R.rethrow($CLV_t2$);}finally{__CLR4_5_252h52hlwzsaocs.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TOPOLOGICAL_ORDERING_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu52h(){try{__CLR4_5_252h52hlwzsaocs.R.inc(6569);
        __CLR4_5_252h52hlwzsaocs.R.inc(6570);Node five = new Node("5");
        __CLR4_5_252h52hlwzsaocs.R.inc(6571);Node seven = new Node("7");
        __CLR4_5_252h52hlwzsaocs.R.inc(6572);Node three = new Node("3");
        __CLR4_5_252h52hlwzsaocs.R.inc(6573);Node eleven = new Node("11");
        __CLR4_5_252h52hlwzsaocs.R.inc(6574);Node eight = new Node("8");
        __CLR4_5_252h52hlwzsaocs.R.inc(6575);Node two = new Node("2");
        __CLR4_5_252h52hlwzsaocs.R.inc(6576);Node nine = new Node("9");
        __CLR4_5_252h52hlwzsaocs.R.inc(6577);Node ten = new Node("10");

        __CLR4_5_252h52hlwzsaocs.R.inc(6578);five.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6579);seven.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6580);three.setSuccessors(new ArrayList<Node>(Arrays.asList(eight, ten)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6581);eleven.setPredecessors(new ArrayList<Node>(Arrays.asList(five, seven)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6582);eleven.setSuccessors(new ArrayList<Node>(Arrays.asList(two, nine, ten)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6583);eight.setPredecessors(new ArrayList<Node>(Arrays.asList(seven, three)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6584);eight.setSuccessors(new ArrayList<Node>(Arrays.asList(nine)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6585);two.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6586);nine.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6587);ten.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, three)));

        __CLR4_5_252h52hlwzsaocs.R.inc(6588);new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten));

        __CLR4_5_252h52hlwzsaocs.R.inc(6589);ArrayList<Node> results = TOPOLOGICAL_ORDERING.topological_ordering(
                new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten)));

        __CLR4_5_252h52hlwzsaocs.R.inc(6590);String resultStr = "";
        __CLR4_5_252h52hlwzsaocs.R.inc(6591);for (Node node : results) {{
            __CLR4_5_252h52hlwzsaocs.R.inc(6592);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_252h52hlwzsaocs.R.inc(6593);assertEquals("5 7 3 11 8 10 2 9 ", resultStr);

    }finally{__CLR4_5_252h52hlwzsaocs.R.flushNeeded();}}

/**
 * 	 Case 2: GeekforGeeks example
 *
 */
    @Test
    public void test2() {__CLR4_5_252h52hlwzsaocs.R.globalSliceStart(getClass().getName(),6594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b536();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_252h52hlwzsaocs.R.rethrow($CLV_t2$);}finally{__CLR4_5_252h52hlwzsaocs.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TOPOLOGICAL_ORDERING_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b536(){try{__CLR4_5_252h52hlwzsaocs.R.inc(6594);
        __CLR4_5_252h52hlwzsaocs.R.inc(6595);Node five = new Node("5");
        __CLR4_5_252h52hlwzsaocs.R.inc(6596);Node zero = new Node("0");
        __CLR4_5_252h52hlwzsaocs.R.inc(6597);Node four = new Node("4");
        __CLR4_5_252h52hlwzsaocs.R.inc(6598);Node one = new Node("1");
        __CLR4_5_252h52hlwzsaocs.R.inc(6599);Node two = new Node("2");
        __CLR4_5_252h52hlwzsaocs.R.inc(6600);Node three = new Node("3");

        __CLR4_5_252h52hlwzsaocs.R.inc(6601);five.setSuccessors(new ArrayList<Node>(Arrays.asList(two, zero)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6602);four.setSuccessors(new ArrayList<Node>(Arrays.asList(zero, one)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6603);two.setPredecessors(new ArrayList<Node>(Arrays.asList(five)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6604);two.setSuccessors(new ArrayList<Node>(Arrays.asList(three)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6605);zero.setPredecessors(new ArrayList<Node>(Arrays.asList(five, four)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6606);one.setPredecessors(new ArrayList<Node>(Arrays.asList(four, three)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6607);three.setPredecessors(new ArrayList<Node>(Arrays.asList(two)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6608);three.setSuccessors(new ArrayList<Node>(Arrays.asList(one)));

        __CLR4_5_252h52hlwzsaocs.R.inc(6609);ArrayList<Node> results = TOPOLOGICAL_ORDERING
                .topological_ordering(new ArrayList<Node>(Arrays.asList(zero, one, two, three, four, five)));

        __CLR4_5_252h52hlwzsaocs.R.inc(6610);String resultStr = "";
        __CLR4_5_252h52hlwzsaocs.R.inc(6611);for (Node node : results) {{
            __CLR4_5_252h52hlwzsaocs.R.inc(6612);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_252h52hlwzsaocs.R.inc(6613);assertEquals("4 5 0 2 3 1 ", resultStr);
    }finally{__CLR4_5_252h52hlwzsaocs.R.flushNeeded();}}

    /*
     *  Case 3: Cooking with InteractivePython
     */

    @Test
    public void test3() {__CLR4_5_252h52hlwzsaocs.R.globalSliceStart(getClass().getName(),6614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs53q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_252h52hlwzsaocs.R.rethrow($CLV_t2$);}finally{__CLR4_5_252h52hlwzsaocs.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TOPOLOGICAL_ORDERING_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs53q(){try{__CLR4_5_252h52hlwzsaocs.R.inc(6614);
        __CLR4_5_252h52hlwzsaocs.R.inc(6615);Node milk = new Node("3/4 cup milk");
        __CLR4_5_252h52hlwzsaocs.R.inc(6616);Node egg = new Node("1 egg");
        __CLR4_5_252h52hlwzsaocs.R.inc(6617);Node oil = new Node("1 Tbl oil");
        __CLR4_5_252h52hlwzsaocs.R.inc(6618);Node mix = new Node ("1 cup mix");
        __CLR4_5_252h52hlwzsaocs.R.inc(6619);Node syrup = new Node("heat syrup");
        __CLR4_5_252h52hlwzsaocs.R.inc(6620);Node griddle = new Node("heat griddle");
        __CLR4_5_252h52hlwzsaocs.R.inc(6621);Node pour = new Node("pour 1/4 cup");
        __CLR4_5_252h52hlwzsaocs.R.inc(6622);Node turn = new Node("turn when bubbly");
        __CLR4_5_252h52hlwzsaocs.R.inc(6623);Node eat = new Node("eat");

        __CLR4_5_252h52hlwzsaocs.R.inc(6624);milk.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6625);egg.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6626);oil.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6627);mix.setPredecessors(new ArrayList<Node>(Arrays.asList(milk, egg, oil)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6628);mix.setSuccessors(new ArrayList<Node>(Arrays.asList(syrup, pour)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6629);griddle.setSuccessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6630);pour.setPredecessors(new ArrayList<Node>(Arrays.asList(mix, griddle)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6631);pour.setSuccessors(new ArrayList<Node>(Arrays.asList(turn)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6632);turn.setPredecessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6633);turn.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6634);syrup.setPredecessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6635);syrup.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_252h52hlwzsaocs.R.inc(6636);eat.setPredecessors(new ArrayList<Node>(Arrays.asList(syrup, turn)));

        __CLR4_5_252h52hlwzsaocs.R.inc(6637);ArrayList<Node> results = TOPOLOGICAL_ORDERING.topological_ordering(new ArrayList<Node>(Arrays.asList(milk, egg, oil, mix, syrup, griddle, pour, turn, eat)));

        __CLR4_5_252h52hlwzsaocs.R.inc(6638);String resultStr = "";
        __CLR4_5_252h52hlwzsaocs.R.inc(6639);for (Node node : results) {{
            __CLR4_5_252h52hlwzsaocs.R.inc(6640);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_252h52hlwzsaocs.R.inc(6641);assertEquals("3/4 cup milk 1 egg 1 Tbl oil heat griddle 1 cup mix pour 1/4 cup heat syrup turn when bubbly eat ", resultStr);
    }finally{__CLR4_5_252h52hlwzsaocs.R.flushNeeded();}}

}
