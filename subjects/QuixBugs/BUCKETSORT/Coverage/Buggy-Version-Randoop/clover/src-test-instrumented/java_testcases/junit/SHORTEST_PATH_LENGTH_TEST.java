/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import java_programs.SHORTEST_PATH_LENGTH;
import java_programs.Node;

public class SHORTEST_PATH_LENGTH_TEST {static class __CLR4_5_23xp3xplwzsans4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,5127,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static Map<List<Node>, Integer> length_by_edge = new HashMap<List<Node>, Integer>();
    static Node node1;
    static Node node2;
    static Node node3;
    static Node node4;
    static Node node5;
    static Node node0;

    static {try{__CLR4_5_23xp3xplwzsans4.R.inc(5101);
        __CLR4_5_23xp3xplwzsans4.R.inc(5102);node1 = new Node("1");
        __CLR4_5_23xp3xplwzsans4.R.inc(5103);node5 = new Node("5");
        __CLR4_5_23xp3xplwzsans4.R.inc(5104);node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node5)));
        __CLR4_5_23xp3xplwzsans4.R.inc(5105);node3 = new Node("3", new ArrayList<Node>(Arrays.asList(node4)));
        __CLR4_5_23xp3xplwzsans4.R.inc(5106);node2 = new Node("2", new ArrayList<Node>(Arrays.asList(node1, node3, node4)));
        __CLR4_5_23xp3xplwzsans4.R.inc(5107);node0 = new Node("0", new ArrayList<Node>(Arrays.asList(node2, node5)));
        __CLR4_5_23xp3xplwzsans4.R.inc(5108);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node0, node2)), 3);
        __CLR4_5_23xp3xplwzsans4.R.inc(5109);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node0, node5)), 10);
        __CLR4_5_23xp3xplwzsans4.R.inc(5110);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node2, node1)), 1);
        __CLR4_5_23xp3xplwzsans4.R.inc(5111);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node2, node3)), 2);
        __CLR4_5_23xp3xplwzsans4.R.inc(5112);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node2, node4)), 4);
        __CLR4_5_23xp3xplwzsans4.R.inc(5113);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node3, node4)), 1);
        __CLR4_5_23xp3xplwzsans4.R.inc(5114);length_by_edge.put(new ArrayList<Node>(Arrays.asList(node4, node5)), 1);

    }finally{__CLR4_5_23xp3xplwzsans4.R.flushNeeded();}}

    /**
     * Case 1: One path Output: 4
     */
    @Test
    public void test1() {__CLR4_5_23xp3xplwzsans4.R.globalSliceStart(getClass().getName(),5115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu3y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23xp3xplwzsans4.R.rethrow($CLV_t2$);}finally{__CLR4_5_23xp3xplwzsans4.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHORTEST_PATH_LENGTH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu3y3(){try{__CLR4_5_23xp3xplwzsans4.R.inc(5115);
        __CLR4_5_23xp3xplwzsans4.R.inc(5116);int result = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node0, node1);



        __CLR4_5_23xp3xplwzsans4.R.inc(5117);assertEquals(4, result);
    }finally{__CLR4_5_23xp3xplwzsans4.R.flushNeeded();}}

    /**
     * Case 2: Multiple path Output: 7
     */
    @Test
    public void test2() {__CLR4_5_23xp3xplwzsans4.R.globalSliceStart(getClass().getName(),5118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b3y6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23xp3xplwzsans4.R.rethrow($CLV_t2$);}finally{__CLR4_5_23xp3xplwzsans4.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHORTEST_PATH_LENGTH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b3y6(){try{__CLR4_5_23xp3xplwzsans4.R.inc(5118);
        __CLR4_5_23xp3xplwzsans4.R.inc(5119);int result = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node0, node5);
        __CLR4_5_23xp3xplwzsans4.R.inc(5120);assertEquals(7, result);
    }finally{__CLR4_5_23xp3xplwzsans4.R.flushNeeded();}}

    /**
     * Case 3: Start point is same as end point Output: 0
     */
    @Test
    public void test3() {__CLR4_5_23xp3xplwzsans4.R.globalSliceStart(getClass().getName(),5121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs3y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23xp3xplwzsans4.R.rethrow($CLV_t2$);}finally{__CLR4_5_23xp3xplwzsans4.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHORTEST_PATH_LENGTH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs3y9(){try{__CLR4_5_23xp3xplwzsans4.R.inc(5121);
        __CLR4_5_23xp3xplwzsans4.R.inc(5122);int result = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node2, node2);
        __CLR4_5_23xp3xplwzsans4.R.inc(5123);assertEquals(0, result);
    }finally{__CLR4_5_23xp3xplwzsans4.R.flushNeeded();}}

    /**
     * Case 4: Unreachable path Output: INT_MAX
     */
    @Test
    public void test4() {__CLR4_5_23xp3xplwzsans4.R.globalSliceStart(getClass().getName(),5124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s93yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23xp3xplwzsans4.R.rethrow($CLV_t2$);}finally{__CLR4_5_23xp3xplwzsans4.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHORTEST_PATH_LENGTH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s93yc(){try{__CLR4_5_23xp3xplwzsans4.R.inc(5124);
        __CLR4_5_23xp3xplwzsans4.R.inc(5125);int result = SHORTEST_PATH_LENGTH.shortest_path_length(length_by_edge, node1, node5);
        __CLR4_5_23xp3xplwzsans4.R.inc(5126);assertEquals(2147483647, result);
    }finally{__CLR4_5_23xp3xplwzsans4.R.flushNeeded();}}

}
