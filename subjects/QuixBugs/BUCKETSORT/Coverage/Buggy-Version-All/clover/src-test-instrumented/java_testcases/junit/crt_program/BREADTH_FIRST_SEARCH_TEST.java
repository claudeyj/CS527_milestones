/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import correct_java_programs.BREADTH_FIRST_SEARCH;
import java_programs.Node;

public class BREADTH_FIRST_SEARCH_TEST {static class __CLR4_5_245k45klwzsbfsg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,5455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Strongly connected graph Output: Path found!
     */

    @Test
    public void test1() {__CLR4_5_245k45klwzsbfsg.R.globalSliceStart(getClass().getName(),5384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu45k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_245k45klwzsbfsg.R.rethrow($CLV_t2$);}finally{__CLR4_5_245k45klwzsbfsg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu45k(){try{__CLR4_5_245k45klwzsbfsg.R.inc(5384);
        __CLR4_5_245k45klwzsbfsg.R.inc(5385);Node station1 = new Node("Westminster");
        __CLR4_5_245k45klwzsbfsg.R.inc(5386);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5387);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5388);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5389);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5390);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5391);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1);
        __CLR4_5_245k45klwzsbfsg.R.inc(5392);String resultStr = "";
        __CLR4_5_245k45klwzsbfsg.R.inc(5393);if ((((result)&&(__CLR4_5_245k45klwzsbfsg.R.iget(5394)!=0|true))||(__CLR4_5_245k45klwzsbfsg.R.iget(5395)==0&false))) {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5396);resultStr = "Path found!";
        } }else {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5397);resultStr = "Path not found!";
        }

        }__CLR4_5_245k45klwzsbfsg.R.inc(5398);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_245k45klwzsbfsg.R.flushNeeded();}}

    /**
     * Case 2: Branching graph Output: Path found!
     */
    @Test
    public void test2() {__CLR4_5_245k45klwzsbfsg.R.globalSliceStart(getClass().getName(),5399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b45z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_245k45klwzsbfsg.R.rethrow($CLV_t2$);}finally{__CLR4_5_245k45klwzsbfsg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b45z(){try{__CLR4_5_245k45klwzsbfsg.R.inc(5399);
        __CLR4_5_245k45klwzsbfsg.R.inc(5400);Node nodef = new Node("F");
        __CLR4_5_245k45klwzsbfsg.R.inc(5401);Node nodee = new Node("E");
        __CLR4_5_245k45klwzsbfsg.R.inc(5402);Node noded = new Node("D");
        __CLR4_5_245k45klwzsbfsg.R.inc(5403);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5404);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5405);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_245k45klwzsbfsg.R.inc(5406);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodea, nodee);
        __CLR4_5_245k45klwzsbfsg.R.inc(5407);String resultStr = "";
        __CLR4_5_245k45klwzsbfsg.R.inc(5408);if ((((result)&&(__CLR4_5_245k45klwzsbfsg.R.iget(5409)!=0|true))||(__CLR4_5_245k45klwzsbfsg.R.iget(5410)==0&false))) {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5411);resultStr = "Path found!";
        } }else {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5412);resultStr = "Path not found!";
        }
        }__CLR4_5_245k45klwzsbfsg.R.inc(5413);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_245k45klwzsbfsg.R.flushNeeded();}}

    /**
     * Case 3: Two unconnected nodes in graph Output: Path not found!
     */
    @Test
    public void test3() {__CLR4_5_245k45klwzsbfsg.R.globalSliceStart(getClass().getName(),5414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs46e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_245k45klwzsbfsg.R.rethrow($CLV_t2$);}finally{__CLR4_5_245k45klwzsbfsg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs46e(){try{__CLR4_5_245k45klwzsbfsg.R.inc(5414);
        __CLR4_5_245k45klwzsbfsg.R.inc(5415);Node nodef = new Node("F");
        __CLR4_5_245k45klwzsbfsg.R.inc(5416);Node nodee = new Node("E");
        __CLR4_5_245k45klwzsbfsg.R.inc(5417);Node noded = new Node("D");
        __CLR4_5_245k45klwzsbfsg.R.inc(5418);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5419);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5420);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_245k45klwzsbfsg.R.inc(5421);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodee);
        __CLR4_5_245k45klwzsbfsg.R.inc(5422);String resultStr = "";
        __CLR4_5_245k45klwzsbfsg.R.inc(5423);if ((((result)&&(__CLR4_5_245k45klwzsbfsg.R.iget(5424)!=0|true))||(__CLR4_5_245k45klwzsbfsg.R.iget(5425)==0&false))) {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5426);resultStr = "Path found!";
        } }else {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5427);resultStr = "Path not found!";
        }
        }__CLR4_5_245k45klwzsbfsg.R.inc(5428);assertEquals("Path not found!", resultStr);
    }finally{__CLR4_5_245k45klwzsbfsg.R.flushNeeded();}}

    /**
     * Case 4: One node graph Output: Path found!
     */
    @Test
    public void test4() {__CLR4_5_245k45klwzsbfsg.R.globalSliceStart(getClass().getName(),5429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s946t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_245k45klwzsbfsg.R.rethrow($CLV_t2$);}finally{__CLR4_5_245k45klwzsbfsg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5429,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s946t(){try{__CLR4_5_245k45klwzsbfsg.R.inc(5429);
        __CLR4_5_245k45klwzsbfsg.R.inc(5430);ArrayList<Node> empty = new ArrayList<Node>();
        __CLR4_5_245k45klwzsbfsg.R.inc(5431);Node nodef = new Node("F");

        __CLR4_5_245k45klwzsbfsg.R.inc(5432);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodef);
        __CLR4_5_245k45klwzsbfsg.R.inc(5433);String resultStr = "";
        __CLR4_5_245k45klwzsbfsg.R.inc(5434);if ((((result)&&(__CLR4_5_245k45klwzsbfsg.R.iget(5435)!=0|true))||(__CLR4_5_245k45klwzsbfsg.R.iget(5436)==0&false))) {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5437);resultStr = "Path found!";
        } }else {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5438);resultStr = "Path not found!";
        }
        }__CLR4_5_245k45klwzsbfsg.R.inc(5439);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_245k45klwzsbfsg.R.flushNeeded();}}

    /**
     * Case 5: Graph with cycles Output: Path found!
     */

    @Test
    public void test5() {__CLR4_5_245k45klwzsbfsg.R.globalSliceStart(getClass().getName(),5440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq474();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_245k45klwzsbfsg.R.rethrow($CLV_t2$);}finally{__CLR4_5_245k45klwzsbfsg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq474(){try{__CLR4_5_245k45klwzsbfsg.R.inc(5440);
        __CLR4_5_245k45klwzsbfsg.R.inc(5441);Node node1 = new Node("1");
        __CLR4_5_245k45klwzsbfsg.R.inc(5442);Node node2 = new Node("2");
        __CLR4_5_245k45klwzsbfsg.R.inc(5443);Node node3 = new Node("3");
        __CLR4_5_245k45klwzsbfsg.R.inc(5444);Node node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node1)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5445);Node node5 = new Node("5", new ArrayList<Node>(Arrays.asList(node2)));
        __CLR4_5_245k45klwzsbfsg.R.inc(5446);Node node6 = new Node("6", new ArrayList<Node>(Arrays.asList(node5, node4, node3)));

        __CLR4_5_245k45klwzsbfsg.R.inc(5447);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(node6, node1);
        __CLR4_5_245k45klwzsbfsg.R.inc(5448);String resultStr = "";
        __CLR4_5_245k45klwzsbfsg.R.inc(5449);if ((((result)&&(__CLR4_5_245k45klwzsbfsg.R.iget(5450)!=0|true))||(__CLR4_5_245k45klwzsbfsg.R.iget(5451)==0&false))) {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5452);resultStr = "Path found!";
        } }else {{
            __CLR4_5_245k45klwzsbfsg.R.inc(5453);resultStr = "Path not found!";
        }
        }__CLR4_5_245k45klwzsbfsg.R.inc(5454);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_245k45klwzsbfsg.R.flushNeeded();}}

}
