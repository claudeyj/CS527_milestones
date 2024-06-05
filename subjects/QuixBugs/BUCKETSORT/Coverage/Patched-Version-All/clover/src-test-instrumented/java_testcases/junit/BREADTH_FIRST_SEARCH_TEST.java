/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import java_programs.BREADTH_FIRST_SEARCH;
import java_programs.Node;

public class BREADTH_FIRST_SEARCH_TEST {static class __CLR4_5_2324324lwzsdy4w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468475478L,8589935092L,4035,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Strongly connected graph Output: Path found!
     */

    @Test
    public void test1() {__CLR4_5_2324324lwzsdy4w.R.globalSliceStart(getClass().getName(),3964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu324();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2324324lwzsdy4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2324324lwzsdy4w.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3964,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu324(){try{__CLR4_5_2324324lwzsdy4w.R.inc(3964);
        __CLR4_5_2324324lwzsdy4w.R.inc(3965);Node station1 = new Node("Westminster");
        __CLR4_5_2324324lwzsdy4w.R.inc(3966);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3967);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3968);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3969);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3970);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3971);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1);
        __CLR4_5_2324324lwzsdy4w.R.inc(3972);String resultStr = "";
        __CLR4_5_2324324lwzsdy4w.R.inc(3973);if ((((result)&&(__CLR4_5_2324324lwzsdy4w.R.iget(3974)!=0|true))||(__CLR4_5_2324324lwzsdy4w.R.iget(3975)==0&false))) {{
            __CLR4_5_2324324lwzsdy4w.R.inc(3976);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2324324lwzsdy4w.R.inc(3977);resultStr = "Path not found!";
        }

        }__CLR4_5_2324324lwzsdy4w.R.inc(3978);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2324324lwzsdy4w.R.flushNeeded();}}

    /**
     * Case 2: Branching graph Output: Path found!
     */
    @Test
    public void test2() {__CLR4_5_2324324lwzsdy4w.R.globalSliceStart(getClass().getName(),3979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b32j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2324324lwzsdy4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2324324lwzsdy4w.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b32j(){try{__CLR4_5_2324324lwzsdy4w.R.inc(3979);
        __CLR4_5_2324324lwzsdy4w.R.inc(3980);Node nodef = new Node("F");
        __CLR4_5_2324324lwzsdy4w.R.inc(3981);Node nodee = new Node("E");
        __CLR4_5_2324324lwzsdy4w.R.inc(3982);Node noded = new Node("D");
        __CLR4_5_2324324lwzsdy4w.R.inc(3983);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3984);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3985);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_2324324lwzsdy4w.R.inc(3986);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodea, nodee);
        __CLR4_5_2324324lwzsdy4w.R.inc(3987);String resultStr = "";
        __CLR4_5_2324324lwzsdy4w.R.inc(3988);if ((((result)&&(__CLR4_5_2324324lwzsdy4w.R.iget(3989)!=0|true))||(__CLR4_5_2324324lwzsdy4w.R.iget(3990)==0&false))) {{
            __CLR4_5_2324324lwzsdy4w.R.inc(3991);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2324324lwzsdy4w.R.inc(3992);resultStr = "Path not found!";
        }
        }__CLR4_5_2324324lwzsdy4w.R.inc(3993);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2324324lwzsdy4w.R.flushNeeded();}}

    /**
     * Case 3: Two unconnected nodes in graph Output: Path not found!
     */
    @Test
    public void test3() {__CLR4_5_2324324lwzsdy4w.R.globalSliceStart(getClass().getName(),3994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs32y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2324324lwzsdy4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2324324lwzsdy4w.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs32y(){try{__CLR4_5_2324324lwzsdy4w.R.inc(3994);
        __CLR4_5_2324324lwzsdy4w.R.inc(3995);Node nodef = new Node("F");
        __CLR4_5_2324324lwzsdy4w.R.inc(3996);Node nodee = new Node("E");
        __CLR4_5_2324324lwzsdy4w.R.inc(3997);Node noded = new Node("D");
        __CLR4_5_2324324lwzsdy4w.R.inc(3998);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_2324324lwzsdy4w.R.inc(3999);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_2324324lwzsdy4w.R.inc(4000);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_2324324lwzsdy4w.R.inc(4001);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodee);
        __CLR4_5_2324324lwzsdy4w.R.inc(4002);String resultStr = "";
        __CLR4_5_2324324lwzsdy4w.R.inc(4003);if ((((result)&&(__CLR4_5_2324324lwzsdy4w.R.iget(4004)!=0|true))||(__CLR4_5_2324324lwzsdy4w.R.iget(4005)==0&false))) {{
            __CLR4_5_2324324lwzsdy4w.R.inc(4006);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2324324lwzsdy4w.R.inc(4007);resultStr = "Path not found!";
        }
        }__CLR4_5_2324324lwzsdy4w.R.inc(4008);assertEquals("Path not found!", resultStr);
    }finally{__CLR4_5_2324324lwzsdy4w.R.flushNeeded();}}

    /**
     * Case 4: One node graph Output: Path found!
     */
    @Test
    public void test4() {__CLR4_5_2324324lwzsdy4w.R.globalSliceStart(getClass().getName(),4009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s933d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2324324lwzsdy4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2324324lwzsdy4w.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s933d(){try{__CLR4_5_2324324lwzsdy4w.R.inc(4009);
        __CLR4_5_2324324lwzsdy4w.R.inc(4010);ArrayList<Node> empty = new ArrayList<Node>();
        __CLR4_5_2324324lwzsdy4w.R.inc(4011);Node nodef = new Node("F");

        __CLR4_5_2324324lwzsdy4w.R.inc(4012);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodef);
        __CLR4_5_2324324lwzsdy4w.R.inc(4013);String resultStr = "";
        __CLR4_5_2324324lwzsdy4w.R.inc(4014);if ((((result)&&(__CLR4_5_2324324lwzsdy4w.R.iget(4015)!=0|true))||(__CLR4_5_2324324lwzsdy4w.R.iget(4016)==0&false))) {{
            __CLR4_5_2324324lwzsdy4w.R.inc(4017);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2324324lwzsdy4w.R.inc(4018);resultStr = "Path not found!";
        }
        }__CLR4_5_2324324lwzsdy4w.R.inc(4019);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2324324lwzsdy4w.R.flushNeeded();}}

    /**
     * Case 5: Graph with cycles Output: Path found!
     */

    @Test
    public void test5() {__CLR4_5_2324324lwzsdy4w.R.globalSliceStart(getClass().getName(),4020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq33o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2324324lwzsdy4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2324324lwzsdy4w.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BREADTH_FIRST_SEARCH_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq33o(){try{__CLR4_5_2324324lwzsdy4w.R.inc(4020);
        __CLR4_5_2324324lwzsdy4w.R.inc(4021);Node node1 = new Node("1");
        __CLR4_5_2324324lwzsdy4w.R.inc(4022);Node node2 = new Node("2");
        __CLR4_5_2324324lwzsdy4w.R.inc(4023);Node node3 = new Node("3");
        __CLR4_5_2324324lwzsdy4w.R.inc(4024);Node node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node1)));
        __CLR4_5_2324324lwzsdy4w.R.inc(4025);Node node5 = new Node("5", new ArrayList<Node>(Arrays.asList(node2)));
        __CLR4_5_2324324lwzsdy4w.R.inc(4026);Node node6 = new Node("6", new ArrayList<Node>(Arrays.asList(node5, node4, node3)));

        __CLR4_5_2324324lwzsdy4w.R.inc(4027);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(node6, node1);
        __CLR4_5_2324324lwzsdy4w.R.inc(4028);String resultStr = "";
        __CLR4_5_2324324lwzsdy4w.R.inc(4029);if ((((result)&&(__CLR4_5_2324324lwzsdy4w.R.iget(4030)!=0|true))||(__CLR4_5_2324324lwzsdy4w.R.iget(4031)==0&false))) {{
            __CLR4_5_2324324lwzsdy4w.R.inc(4032);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2324324lwzsdy4w.R.inc(4033);resultStr = "Path not found!";
        }
        }__CLR4_5_2324324lwzsdy4w.R.inc(4034);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2324324lwzsdy4w.R.flushNeeded();}}

}
