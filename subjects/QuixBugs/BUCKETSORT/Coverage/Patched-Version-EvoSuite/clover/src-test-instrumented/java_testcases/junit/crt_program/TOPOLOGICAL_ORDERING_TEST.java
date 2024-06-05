/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import correct_java_programs.TOPOLOGICAL_ORDERING;
import java_programs.Node;

public class TOPOLOGICAL_ORDERING_TEST {static class __CLR4_5_2502502lwzscdjd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,6555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Wikipedia graph Output: 5 7 3 11 8 10 2 9
     */
    @Test
    public void test1() {__CLR4_5_2502502lwzscdjd.R.globalSliceStart(getClass().getName(),6482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu502();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2502502lwzscdjd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2502502lwzscdjd.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TOPOLOGICAL_ORDERING_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu502(){try{__CLR4_5_2502502lwzscdjd.R.inc(6482);
        __CLR4_5_2502502lwzscdjd.R.inc(6483);Node five = new Node("5");
        __CLR4_5_2502502lwzscdjd.R.inc(6484);Node seven = new Node("7");
        __CLR4_5_2502502lwzscdjd.R.inc(6485);Node three = new Node("3");
        __CLR4_5_2502502lwzscdjd.R.inc(6486);Node eleven = new Node("11");
        __CLR4_5_2502502lwzscdjd.R.inc(6487);Node eight = new Node("8");
        __CLR4_5_2502502lwzscdjd.R.inc(6488);Node two = new Node("2");
        __CLR4_5_2502502lwzscdjd.R.inc(6489);Node nine = new Node("9");
        __CLR4_5_2502502lwzscdjd.R.inc(6490);Node ten = new Node("10");

        __CLR4_5_2502502lwzscdjd.R.inc(6491);five.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_2502502lwzscdjd.R.inc(6492);seven.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_2502502lwzscdjd.R.inc(6493);three.setSuccessors(new ArrayList<Node>(Arrays.asList(eight, ten)));
        __CLR4_5_2502502lwzscdjd.R.inc(6494);eleven.setPredecessors(new ArrayList<Node>(Arrays.asList(five, seven)));
        __CLR4_5_2502502lwzscdjd.R.inc(6495);eleven.setSuccessors(new ArrayList<Node>(Arrays.asList(two, nine, ten)));
        __CLR4_5_2502502lwzscdjd.R.inc(6496);eight.setPredecessors(new ArrayList<Node>(Arrays.asList(seven, three)));
        __CLR4_5_2502502lwzscdjd.R.inc(6497);eight.setSuccessors(new ArrayList<Node>(Arrays.asList(nine)));
        __CLR4_5_2502502lwzscdjd.R.inc(6498);two.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_2502502lwzscdjd.R.inc(6499);nine.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_2502502lwzscdjd.R.inc(6500);ten.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, three)));

        __CLR4_5_2502502lwzscdjd.R.inc(6501);new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten));

        __CLR4_5_2502502lwzscdjd.R.inc(6502);ArrayList<Node> results = TOPOLOGICAL_ORDERING.topological_ordering(
                new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten)));

        __CLR4_5_2502502lwzscdjd.R.inc(6503);String resultStr = "";
        __CLR4_5_2502502lwzscdjd.R.inc(6504);for (Node node : results) {{
            __CLR4_5_2502502lwzscdjd.R.inc(6505);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_2502502lwzscdjd.R.inc(6506);assertEquals("5 7 3 11 8 10 2 9 ", resultStr);

    }finally{__CLR4_5_2502502lwzscdjd.R.flushNeeded();}}

/**
 * 	 Case 2: GeekforGeeks example
 *
 */
    @Test
    public void test2() {__CLR4_5_2502502lwzscdjd.R.globalSliceStart(getClass().getName(),6507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b50r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2502502lwzscdjd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2502502lwzscdjd.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TOPOLOGICAL_ORDERING_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b50r(){try{__CLR4_5_2502502lwzscdjd.R.inc(6507);
        __CLR4_5_2502502lwzscdjd.R.inc(6508);Node five = new Node("5");
        __CLR4_5_2502502lwzscdjd.R.inc(6509);Node zero = new Node("0");
        __CLR4_5_2502502lwzscdjd.R.inc(6510);Node four = new Node("4");
        __CLR4_5_2502502lwzscdjd.R.inc(6511);Node one = new Node("1");
        __CLR4_5_2502502lwzscdjd.R.inc(6512);Node two = new Node("2");
        __CLR4_5_2502502lwzscdjd.R.inc(6513);Node three = new Node("3");

        __CLR4_5_2502502lwzscdjd.R.inc(6514);five.setSuccessors(new ArrayList<Node>(Arrays.asList(two, zero)));
        __CLR4_5_2502502lwzscdjd.R.inc(6515);four.setSuccessors(new ArrayList<Node>(Arrays.asList(zero, one)));
        __CLR4_5_2502502lwzscdjd.R.inc(6516);two.setPredecessors(new ArrayList<Node>(Arrays.asList(five)));
        __CLR4_5_2502502lwzscdjd.R.inc(6517);two.setSuccessors(new ArrayList<Node>(Arrays.asList(three)));
        __CLR4_5_2502502lwzscdjd.R.inc(6518);zero.setPredecessors(new ArrayList<Node>(Arrays.asList(five, four)));
        __CLR4_5_2502502lwzscdjd.R.inc(6519);one.setPredecessors(new ArrayList<Node>(Arrays.asList(four, three)));
        __CLR4_5_2502502lwzscdjd.R.inc(6520);three.setPredecessors(new ArrayList<Node>(Arrays.asList(two)));
        __CLR4_5_2502502lwzscdjd.R.inc(6521);three.setSuccessors(new ArrayList<Node>(Arrays.asList(one)));

        __CLR4_5_2502502lwzscdjd.R.inc(6522);ArrayList<Node> results = TOPOLOGICAL_ORDERING
                .topological_ordering(new ArrayList<Node>(Arrays.asList(zero, one, two, three, four, five)));

        __CLR4_5_2502502lwzscdjd.R.inc(6523);String resultStr = "";
        __CLR4_5_2502502lwzscdjd.R.inc(6524);for (Node node : results) {{
            __CLR4_5_2502502lwzscdjd.R.inc(6525);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_2502502lwzscdjd.R.inc(6526);assertEquals("4 5 0 2 3 1 ", resultStr);
    }finally{__CLR4_5_2502502lwzscdjd.R.flushNeeded();}}

    /*
     *  Case 3: Cooking with InteractivePython
     */

    @Test
    public void test3() {__CLR4_5_2502502lwzscdjd.R.globalSliceStart(getClass().getName(),6527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs51b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2502502lwzscdjd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2502502lwzscdjd.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TOPOLOGICAL_ORDERING_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs51b(){try{__CLR4_5_2502502lwzscdjd.R.inc(6527);
        __CLR4_5_2502502lwzscdjd.R.inc(6528);Node milk = new Node("3/4 cup milk");
        __CLR4_5_2502502lwzscdjd.R.inc(6529);Node egg = new Node("1 egg");
        __CLR4_5_2502502lwzscdjd.R.inc(6530);Node oil = new Node("1 Tbl oil");
        __CLR4_5_2502502lwzscdjd.R.inc(6531);Node mix = new Node ("1 cup mix");
        __CLR4_5_2502502lwzscdjd.R.inc(6532);Node syrup = new Node("heat syrup");
        __CLR4_5_2502502lwzscdjd.R.inc(6533);Node griddle = new Node("heat griddle");
        __CLR4_5_2502502lwzscdjd.R.inc(6534);Node pour = new Node("pour 1/4 cup");
        __CLR4_5_2502502lwzscdjd.R.inc(6535);Node turn = new Node("turn when bubbly");
        __CLR4_5_2502502lwzscdjd.R.inc(6536);Node eat = new Node("eat");

        __CLR4_5_2502502lwzscdjd.R.inc(6537);milk.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_2502502lwzscdjd.R.inc(6538);egg.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_2502502lwzscdjd.R.inc(6539);oil.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_2502502lwzscdjd.R.inc(6540);mix.setPredecessors(new ArrayList<Node>(Arrays.asList(milk, egg, oil)));
        __CLR4_5_2502502lwzscdjd.R.inc(6541);mix.setSuccessors(new ArrayList<Node>(Arrays.asList(syrup, pour)));
        __CLR4_5_2502502lwzscdjd.R.inc(6542);griddle.setSuccessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_2502502lwzscdjd.R.inc(6543);pour.setPredecessors(new ArrayList<Node>(Arrays.asList(mix, griddle)));
        __CLR4_5_2502502lwzscdjd.R.inc(6544);pour.setSuccessors(new ArrayList<Node>(Arrays.asList(turn)));
        __CLR4_5_2502502lwzscdjd.R.inc(6545);turn.setPredecessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_2502502lwzscdjd.R.inc(6546);turn.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_2502502lwzscdjd.R.inc(6547);syrup.setPredecessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_2502502lwzscdjd.R.inc(6548);syrup.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_2502502lwzscdjd.R.inc(6549);eat.setPredecessors(new ArrayList<Node>(Arrays.asList(syrup, turn)));

        __CLR4_5_2502502lwzscdjd.R.inc(6550);ArrayList<Node> results = TOPOLOGICAL_ORDERING.topological_ordering(new ArrayList<Node>(Arrays.asList(milk, egg, oil, mix, syrup, griddle, pour, turn, eat)));

        __CLR4_5_2502502lwzscdjd.R.inc(6551);String resultStr = "";
        __CLR4_5_2502502lwzscdjd.R.inc(6552);for (Node node : results) {{
            __CLR4_5_2502502lwzscdjd.R.inc(6553);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_2502502lwzscdjd.R.inc(6554);assertEquals("3/4 cup milk 1 egg 1 Tbl oil heat griddle 1 cup mix pour 1/4 cup heat syrup turn when bubbly eat ", resultStr);
    }finally{__CLR4_5_2502502lwzscdjd.R.flushNeeded();}}

}
