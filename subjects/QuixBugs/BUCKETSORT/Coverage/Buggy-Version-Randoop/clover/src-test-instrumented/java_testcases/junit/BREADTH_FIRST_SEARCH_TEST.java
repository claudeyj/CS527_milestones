/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import java_programs.BREADTH_FIRST_SEARCH;
import java_programs.Node;

public class BREADTH_FIRST_SEARCH_TEST {static class __CLR4_5_234j34jlwzsan52{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,4122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Strongly connected graph Output: Path found!
     */

    @Test
    public void test1() {__CLR4_5_234j34jlwzsan52.R.globalSliceStart(getClass().getName(),4051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu34j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_234j34jlwzsan52.R.rethrow($CLV_t2$);}finally{__CLR4_5_234j34jlwzsan52.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu34j(){try{__CLR4_5_234j34jlwzsan52.R.inc(4051);
        __CLR4_5_234j34jlwzsan52.R.inc(4052);Node station1 = new Node("Westminster");
        __CLR4_5_234j34jlwzsan52.R.inc(4053);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_234j34jlwzsan52.R.inc(4054);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_234j34jlwzsan52.R.inc(4055);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_234j34jlwzsan52.R.inc(4056);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_234j34jlwzsan52.R.inc(4057);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));
        __CLR4_5_234j34jlwzsan52.R.inc(4058);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1);
        __CLR4_5_234j34jlwzsan52.R.inc(4059);String resultStr = "";
        __CLR4_5_234j34jlwzsan52.R.inc(4060);if ((((result)&&(__CLR4_5_234j34jlwzsan52.R.iget(4061)!=0|true))||(__CLR4_5_234j34jlwzsan52.R.iget(4062)==0&false))) {{
            __CLR4_5_234j34jlwzsan52.R.inc(4063);resultStr = "Path found!";
        } }else {{
            __CLR4_5_234j34jlwzsan52.R.inc(4064);resultStr = "Path not found!";
        }

        }__CLR4_5_234j34jlwzsan52.R.inc(4065);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_234j34jlwzsan52.R.flushNeeded();}}

    /**
     * Case 2: Branching graph Output: Path found!
     */
    @Test
    public void test2() {__CLR4_5_234j34jlwzsan52.R.globalSliceStart(getClass().getName(),4066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b34y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_234j34jlwzsan52.R.rethrow($CLV_t2$);}finally{__CLR4_5_234j34jlwzsan52.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b34y(){try{__CLR4_5_234j34jlwzsan52.R.inc(4066);
        __CLR4_5_234j34jlwzsan52.R.inc(4067);Node nodef = new Node("F");
        __CLR4_5_234j34jlwzsan52.R.inc(4068);Node nodee = new Node("E");
        __CLR4_5_234j34jlwzsan52.R.inc(4069);Node noded = new Node("D");
        __CLR4_5_234j34jlwzsan52.R.inc(4070);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_234j34jlwzsan52.R.inc(4071);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_234j34jlwzsan52.R.inc(4072);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_234j34jlwzsan52.R.inc(4073);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodea, nodee);
        __CLR4_5_234j34jlwzsan52.R.inc(4074);String resultStr = "";
        __CLR4_5_234j34jlwzsan52.R.inc(4075);if ((((result)&&(__CLR4_5_234j34jlwzsan52.R.iget(4076)!=0|true))||(__CLR4_5_234j34jlwzsan52.R.iget(4077)==0&false))) {{
            __CLR4_5_234j34jlwzsan52.R.inc(4078);resultStr = "Path found!";
        } }else {{
            __CLR4_5_234j34jlwzsan52.R.inc(4079);resultStr = "Path not found!";
        }
        }__CLR4_5_234j34jlwzsan52.R.inc(4080);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_234j34jlwzsan52.R.flushNeeded();}}

    /**
     * Case 3: Two unconnected nodes in graph Output: Path not found!
     */
    @Test
    public void test3() {__CLR4_5_234j34jlwzsan52.R.globalSliceStart(getClass().getName(),4081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs35d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_234j34jlwzsan52.R.rethrow($CLV_t2$);}finally{__CLR4_5_234j34jlwzsan52.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs35d(){try{__CLR4_5_234j34jlwzsan52.R.inc(4081);
        __CLR4_5_234j34jlwzsan52.R.inc(4082);Node nodef = new Node("F");
        __CLR4_5_234j34jlwzsan52.R.inc(4083);Node nodee = new Node("E");
        __CLR4_5_234j34jlwzsan52.R.inc(4084);Node noded = new Node("D");
        __CLR4_5_234j34jlwzsan52.R.inc(4085);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_234j34jlwzsan52.R.inc(4086);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_234j34jlwzsan52.R.inc(4087);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_234j34jlwzsan52.R.inc(4088);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodee);
        __CLR4_5_234j34jlwzsan52.R.inc(4089);String resultStr = "";
        __CLR4_5_234j34jlwzsan52.R.inc(4090);if ((((result)&&(__CLR4_5_234j34jlwzsan52.R.iget(4091)!=0|true))||(__CLR4_5_234j34jlwzsan52.R.iget(4092)==0&false))) {{
            __CLR4_5_234j34jlwzsan52.R.inc(4093);resultStr = "Path found!";
        } }else {{
            __CLR4_5_234j34jlwzsan52.R.inc(4094);resultStr = "Path not found!";
        }
        }__CLR4_5_234j34jlwzsan52.R.inc(4095);assertEquals("Path not found!", resultStr);
    }finally{__CLR4_5_234j34jlwzsan52.R.flushNeeded();}}

    /**
     * Case 4: One node graph Output: Path found!
     */
    @Test
    public void test4() {__CLR4_5_234j34jlwzsan52.R.globalSliceStart(getClass().getName(),4096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s935s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_234j34jlwzsan52.R.rethrow($CLV_t2$);}finally{__CLR4_5_234j34jlwzsan52.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s935s(){try{__CLR4_5_234j34jlwzsan52.R.inc(4096);
        __CLR4_5_234j34jlwzsan52.R.inc(4097);ArrayList<Node> empty = new ArrayList<Node>();
        __CLR4_5_234j34jlwzsan52.R.inc(4098);Node nodef = new Node("F");

        __CLR4_5_234j34jlwzsan52.R.inc(4099);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodef);
        __CLR4_5_234j34jlwzsan52.R.inc(4100);String resultStr = "";
        __CLR4_5_234j34jlwzsan52.R.inc(4101);if ((((result)&&(__CLR4_5_234j34jlwzsan52.R.iget(4102)!=0|true))||(__CLR4_5_234j34jlwzsan52.R.iget(4103)==0&false))) {{
            __CLR4_5_234j34jlwzsan52.R.inc(4104);resultStr = "Path found!";
        } }else {{
            __CLR4_5_234j34jlwzsan52.R.inc(4105);resultStr = "Path not found!";
        }
        }__CLR4_5_234j34jlwzsan52.R.inc(4106);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_234j34jlwzsan52.R.flushNeeded();}}

    /**
     * Case 5: Graph with cycles Output: Path found!
     */

    @Test
    public void test5() {__CLR4_5_234j34jlwzsan52.R.globalSliceStart(getClass().getName(),4107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq363();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_234j34jlwzsan52.R.rethrow($CLV_t2$);}finally{__CLR4_5_234j34jlwzsan52.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4107,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq363(){try{__CLR4_5_234j34jlwzsan52.R.inc(4107);
        __CLR4_5_234j34jlwzsan52.R.inc(4108);Node node1 = new Node("1");
        __CLR4_5_234j34jlwzsan52.R.inc(4109);Node node2 = new Node("2");
        __CLR4_5_234j34jlwzsan52.R.inc(4110);Node node3 = new Node("3");
        __CLR4_5_234j34jlwzsan52.R.inc(4111);Node node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node1)));
        __CLR4_5_234j34jlwzsan52.R.inc(4112);Node node5 = new Node("5", new ArrayList<Node>(Arrays.asList(node2)));
        __CLR4_5_234j34jlwzsan52.R.inc(4113);Node node6 = new Node("6", new ArrayList<Node>(Arrays.asList(node5, node4, node3)));

        __CLR4_5_234j34jlwzsan52.R.inc(4114);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(node6, node1);
        __CLR4_5_234j34jlwzsan52.R.inc(4115);String resultStr = "";
        __CLR4_5_234j34jlwzsan52.R.inc(4116);if ((((result)&&(__CLR4_5_234j34jlwzsan52.R.iget(4117)!=0|true))||(__CLR4_5_234j34jlwzsan52.R.iget(4118)==0&false))) {{
            __CLR4_5_234j34jlwzsan52.R.inc(4119);resultStr = "Path found!";
        } }else {{
            __CLR4_5_234j34jlwzsan52.R.inc(4120);resultStr = "Path not found!";
        }
        }__CLR4_5_234j34jlwzsan52.R.inc(4121);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_234j34jlwzsan52.R.flushNeeded();}}

}
