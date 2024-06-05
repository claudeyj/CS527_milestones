/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import java_programs.TOPOLOGICAL_ORDERING;
import java_programs.Node;

public class TOPOLOGICAL_ORDERING_TEST {static class __CLR4_5_23z13z1lwzsd847{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,5222,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Wikipedia graph Output: 5 7 3 11 8 10 2 9
     */
    @Test
    public void test1() {__CLR4_5_23z13z1lwzsd847.R.globalSliceStart(getClass().getName(),5149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu3z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23z13z1lwzsd847.R.rethrow($CLV_t2$);}finally{__CLR4_5_23z13z1lwzsd847.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TOPOLOGICAL_ORDERING_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu3z1(){try{__CLR4_5_23z13z1lwzsd847.R.inc(5149);
        __CLR4_5_23z13z1lwzsd847.R.inc(5150);Node five = new Node("5");
        __CLR4_5_23z13z1lwzsd847.R.inc(5151);Node seven = new Node("7");
        __CLR4_5_23z13z1lwzsd847.R.inc(5152);Node three = new Node("3");
        __CLR4_5_23z13z1lwzsd847.R.inc(5153);Node eleven = new Node("11");
        __CLR4_5_23z13z1lwzsd847.R.inc(5154);Node eight = new Node("8");
        __CLR4_5_23z13z1lwzsd847.R.inc(5155);Node two = new Node("2");
        __CLR4_5_23z13z1lwzsd847.R.inc(5156);Node nine = new Node("9");
        __CLR4_5_23z13z1lwzsd847.R.inc(5157);Node ten = new Node("10");

        __CLR4_5_23z13z1lwzsd847.R.inc(5158);five.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5159);seven.setSuccessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5160);three.setSuccessors(new ArrayList<Node>(Arrays.asList(eight, ten)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5161);eleven.setPredecessors(new ArrayList<Node>(Arrays.asList(five, seven)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5162);eleven.setSuccessors(new ArrayList<Node>(Arrays.asList(two, nine, ten)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5163);eight.setPredecessors(new ArrayList<Node>(Arrays.asList(seven, three)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5164);eight.setSuccessors(new ArrayList<Node>(Arrays.asList(nine)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5165);two.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5166);nine.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, eight)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5167);ten.setPredecessors(new ArrayList<Node>(Arrays.asList(eleven, three)));

        __CLR4_5_23z13z1lwzsd847.R.inc(5168);new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten));

        __CLR4_5_23z13z1lwzsd847.R.inc(5169);ArrayList<Node> results = TOPOLOGICAL_ORDERING.topological_ordering(
                new ArrayList<Node>(Arrays.asList(five, seven, three, eleven, eight, two, nine, ten)));

        __CLR4_5_23z13z1lwzsd847.R.inc(5170);String resultStr = "";
        __CLR4_5_23z13z1lwzsd847.R.inc(5171);for (Node node : results) {{
            __CLR4_5_23z13z1lwzsd847.R.inc(5172);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_23z13z1lwzsd847.R.inc(5173);assertEquals("5 7 3 11 8 10 2 9 ", resultStr);

    }finally{__CLR4_5_23z13z1lwzsd847.R.flushNeeded();}}

/**
 * 	 Case 2: GeekforGeeks example
 *
 */
    @Test
    public void test2() {__CLR4_5_23z13z1lwzsd847.R.globalSliceStart(getClass().getName(),5174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b3zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23z13z1lwzsd847.R.rethrow($CLV_t2$);}finally{__CLR4_5_23z13z1lwzsd847.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TOPOLOGICAL_ORDERING_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b3zq(){try{__CLR4_5_23z13z1lwzsd847.R.inc(5174);
        __CLR4_5_23z13z1lwzsd847.R.inc(5175);Node five = new Node("5");
        __CLR4_5_23z13z1lwzsd847.R.inc(5176);Node zero = new Node("0");
        __CLR4_5_23z13z1lwzsd847.R.inc(5177);Node four = new Node("4");
        __CLR4_5_23z13z1lwzsd847.R.inc(5178);Node one = new Node("1");
        __CLR4_5_23z13z1lwzsd847.R.inc(5179);Node two = new Node("2");
        __CLR4_5_23z13z1lwzsd847.R.inc(5180);Node three = new Node("3");

        __CLR4_5_23z13z1lwzsd847.R.inc(5181);five.setSuccessors(new ArrayList<Node>(Arrays.asList(two, zero)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5182);four.setSuccessors(new ArrayList<Node>(Arrays.asList(zero, one)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5183);two.setPredecessors(new ArrayList<Node>(Arrays.asList(five)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5184);two.setSuccessors(new ArrayList<Node>(Arrays.asList(three)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5185);zero.setPredecessors(new ArrayList<Node>(Arrays.asList(five, four)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5186);one.setPredecessors(new ArrayList<Node>(Arrays.asList(four, three)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5187);three.setPredecessors(new ArrayList<Node>(Arrays.asList(two)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5188);three.setSuccessors(new ArrayList<Node>(Arrays.asList(one)));

        __CLR4_5_23z13z1lwzsd847.R.inc(5189);ArrayList<Node> results = TOPOLOGICAL_ORDERING
                .topological_ordering(new ArrayList<Node>(Arrays.asList(zero, one, two, three, four, five)));

        __CLR4_5_23z13z1lwzsd847.R.inc(5190);String resultStr = "";
        __CLR4_5_23z13z1lwzsd847.R.inc(5191);for (Node node : results) {{
            __CLR4_5_23z13z1lwzsd847.R.inc(5192);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_23z13z1lwzsd847.R.inc(5193);assertEquals("4 5 0 2 3 1 ", resultStr);
    }finally{__CLR4_5_23z13z1lwzsd847.R.flushNeeded();}}

    /*
     *  Case 3: Cooking with InteractivePython
     */

    @Test
    public void test3() {__CLR4_5_23z13z1lwzsd847.R.globalSliceStart(getClass().getName(),5194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs40a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23z13z1lwzsd847.R.rethrow($CLV_t2$);}finally{__CLR4_5_23z13z1lwzsd847.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TOPOLOGICAL_ORDERING_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs40a(){try{__CLR4_5_23z13z1lwzsd847.R.inc(5194);
        __CLR4_5_23z13z1lwzsd847.R.inc(5195);Node milk = new Node("3/4 cup milk");
        __CLR4_5_23z13z1lwzsd847.R.inc(5196);Node egg = new Node("1 egg");
        __CLR4_5_23z13z1lwzsd847.R.inc(5197);Node oil = new Node("1 Tbl oil");
        __CLR4_5_23z13z1lwzsd847.R.inc(5198);Node mix = new Node ("1 cup mix");
        __CLR4_5_23z13z1lwzsd847.R.inc(5199);Node syrup = new Node("heat syrup");
        __CLR4_5_23z13z1lwzsd847.R.inc(5200);Node griddle = new Node("heat griddle");
        __CLR4_5_23z13z1lwzsd847.R.inc(5201);Node pour = new Node("pour 1/4 cup");
        __CLR4_5_23z13z1lwzsd847.R.inc(5202);Node turn = new Node("turn when bubbly");
        __CLR4_5_23z13z1lwzsd847.R.inc(5203);Node eat = new Node("eat");

        __CLR4_5_23z13z1lwzsd847.R.inc(5204);milk.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5205);egg.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5206);oil.setSuccessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5207);mix.setPredecessors(new ArrayList<Node>(Arrays.asList(milk, egg, oil)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5208);mix.setSuccessors(new ArrayList<Node>(Arrays.asList(syrup, pour)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5209);griddle.setSuccessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5210);pour.setPredecessors(new ArrayList<Node>(Arrays.asList(mix, griddle)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5211);pour.setSuccessors(new ArrayList<Node>(Arrays.asList(turn)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5212);turn.setPredecessors(new ArrayList<Node>(Arrays.asList(pour)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5213);turn.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5214);syrup.setPredecessors(new ArrayList<Node>(Arrays.asList(mix)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5215);syrup.setSuccessors(new ArrayList<Node>(Arrays.asList(eat)));
        __CLR4_5_23z13z1lwzsd847.R.inc(5216);eat.setPredecessors(new ArrayList<Node>(Arrays.asList(syrup, turn)));

        __CLR4_5_23z13z1lwzsd847.R.inc(5217);ArrayList<Node> results = TOPOLOGICAL_ORDERING.topological_ordering(new ArrayList<Node>(Arrays.asList(milk, egg, oil, mix, syrup, griddle, pour, turn, eat)));

        __CLR4_5_23z13z1lwzsd847.R.inc(5218);String resultStr = "";
        __CLR4_5_23z13z1lwzsd847.R.inc(5219);for (Node node : results) {{
            __CLR4_5_23z13z1lwzsd847.R.inc(5220);resultStr += node.getValue() + " ";
        }
        }__CLR4_5_23z13z1lwzsd847.R.inc(5221);assertEquals("3/4 cup milk 1 egg 1 Tbl oil heat griddle 1 cup mix pour 1/4 cup heat syrup turn when bubbly eat ", resultStr);
    }finally{__CLR4_5_23z13z1lwzsd847.R.flushNeeded();}}

}
