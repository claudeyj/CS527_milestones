/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import correct_java_programs.BREADTH_FIRST_SEARCH;
import java_programs.Node;

public class BREADTH_FIRST_SEARCH_TEST {static class __CLR4_5_2435435lwzsd86x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,5368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Strongly connected graph Output: Path found!
     */

    @Test
    public void test1() {__CLR4_5_2435435lwzsd86x.R.globalSliceStart(getClass().getName(),5297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu435();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2435435lwzsd86x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2435435lwzsd86x.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu435(){try{__CLR4_5_2435435lwzsd86x.R.inc(5297);
        __CLR4_5_2435435lwzsd86x.R.inc(5298);Node station1 = new Node("Westminster");
        __CLR4_5_2435435lwzsd86x.R.inc(5299);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_2435435lwzsd86x.R.inc(5300);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_2435435lwzsd86x.R.inc(5301);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_2435435lwzsd86x.R.inc(5302);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_2435435lwzsd86x.R.inc(5303);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));
        __CLR4_5_2435435lwzsd86x.R.inc(5304);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(station6, station1);
        __CLR4_5_2435435lwzsd86x.R.inc(5305);String resultStr = "";
        __CLR4_5_2435435lwzsd86x.R.inc(5306);if ((((result)&&(__CLR4_5_2435435lwzsd86x.R.iget(5307)!=0|true))||(__CLR4_5_2435435lwzsd86x.R.iget(5308)==0&false))) {{
            __CLR4_5_2435435lwzsd86x.R.inc(5309);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2435435lwzsd86x.R.inc(5310);resultStr = "Path not found!";
        }

        }__CLR4_5_2435435lwzsd86x.R.inc(5311);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2435435lwzsd86x.R.flushNeeded();}}

    /**
     * Case 2: Branching graph Output: Path found!
     */
    @Test
    public void test2() {__CLR4_5_2435435lwzsd86x.R.globalSliceStart(getClass().getName(),5312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b43k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2435435lwzsd86x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2435435lwzsd86x.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b43k(){try{__CLR4_5_2435435lwzsd86x.R.inc(5312);
        __CLR4_5_2435435lwzsd86x.R.inc(5313);Node nodef = new Node("F");
        __CLR4_5_2435435lwzsd86x.R.inc(5314);Node nodee = new Node("E");
        __CLR4_5_2435435lwzsd86x.R.inc(5315);Node noded = new Node("D");
        __CLR4_5_2435435lwzsd86x.R.inc(5316);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_2435435lwzsd86x.R.inc(5317);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_2435435lwzsd86x.R.inc(5318);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_2435435lwzsd86x.R.inc(5319);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodea, nodee);
        __CLR4_5_2435435lwzsd86x.R.inc(5320);String resultStr = "";
        __CLR4_5_2435435lwzsd86x.R.inc(5321);if ((((result)&&(__CLR4_5_2435435lwzsd86x.R.iget(5322)!=0|true))||(__CLR4_5_2435435lwzsd86x.R.iget(5323)==0&false))) {{
            __CLR4_5_2435435lwzsd86x.R.inc(5324);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2435435lwzsd86x.R.inc(5325);resultStr = "Path not found!";
        }
        }__CLR4_5_2435435lwzsd86x.R.inc(5326);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2435435lwzsd86x.R.flushNeeded();}}

    /**
     * Case 3: Two unconnected nodes in graph Output: Path not found!
     */
    @Test
    public void test3() {__CLR4_5_2435435lwzsd86x.R.globalSliceStart(getClass().getName(),5327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs43z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2435435lwzsd86x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2435435lwzsd86x.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs43z(){try{__CLR4_5_2435435lwzsd86x.R.inc(5327);
        __CLR4_5_2435435lwzsd86x.R.inc(5328);Node nodef = new Node("F");
        __CLR4_5_2435435lwzsd86x.R.inc(5329);Node nodee = new Node("E");
        __CLR4_5_2435435lwzsd86x.R.inc(5330);Node noded = new Node("D");
        __CLR4_5_2435435lwzsd86x.R.inc(5331);Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
        __CLR4_5_2435435lwzsd86x.R.inc(5332);Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
        __CLR4_5_2435435lwzsd86x.R.inc(5333);Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

        __CLR4_5_2435435lwzsd86x.R.inc(5334);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodee);
        __CLR4_5_2435435lwzsd86x.R.inc(5335);String resultStr = "";
        __CLR4_5_2435435lwzsd86x.R.inc(5336);if ((((result)&&(__CLR4_5_2435435lwzsd86x.R.iget(5337)!=0|true))||(__CLR4_5_2435435lwzsd86x.R.iget(5338)==0&false))) {{
            __CLR4_5_2435435lwzsd86x.R.inc(5339);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2435435lwzsd86x.R.inc(5340);resultStr = "Path not found!";
        }
        }__CLR4_5_2435435lwzsd86x.R.inc(5341);assertEquals("Path not found!", resultStr);
    }finally{__CLR4_5_2435435lwzsd86x.R.flushNeeded();}}

    /**
     * Case 4: One node graph Output: Path found!
     */
    @Test
    public void test4() {__CLR4_5_2435435lwzsd86x.R.globalSliceStart(getClass().getName(),5342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s944e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2435435lwzsd86x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2435435lwzsd86x.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s944e(){try{__CLR4_5_2435435lwzsd86x.R.inc(5342);
        __CLR4_5_2435435lwzsd86x.R.inc(5343);ArrayList<Node> empty = new ArrayList<Node>();
        __CLR4_5_2435435lwzsd86x.R.inc(5344);Node nodef = new Node("F");

        __CLR4_5_2435435lwzsd86x.R.inc(5345);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(nodef, nodef);
        __CLR4_5_2435435lwzsd86x.R.inc(5346);String resultStr = "";
        __CLR4_5_2435435lwzsd86x.R.inc(5347);if ((((result)&&(__CLR4_5_2435435lwzsd86x.R.iget(5348)!=0|true))||(__CLR4_5_2435435lwzsd86x.R.iget(5349)==0&false))) {{
            __CLR4_5_2435435lwzsd86x.R.inc(5350);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2435435lwzsd86x.R.inc(5351);resultStr = "Path not found!";
        }
        }__CLR4_5_2435435lwzsd86x.R.inc(5352);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2435435lwzsd86x.R.flushNeeded();}}

    /**
     * Case 5: Graph with cycles Output: Path found!
     */

    @Test
    public void test5() {__CLR4_5_2435435lwzsd86x.R.globalSliceStart(getClass().getName(),5353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq44p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2435435lwzsd86x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2435435lwzsd86x.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BREADTH_FIRST_SEARCH_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq44p(){try{__CLR4_5_2435435lwzsd86x.R.inc(5353);
        __CLR4_5_2435435lwzsd86x.R.inc(5354);Node node1 = new Node("1");
        __CLR4_5_2435435lwzsd86x.R.inc(5355);Node node2 = new Node("2");
        __CLR4_5_2435435lwzsd86x.R.inc(5356);Node node3 = new Node("3");
        __CLR4_5_2435435lwzsd86x.R.inc(5357);Node node4 = new Node("4", new ArrayList<Node>(Arrays.asList(node1)));
        __CLR4_5_2435435lwzsd86x.R.inc(5358);Node node5 = new Node("5", new ArrayList<Node>(Arrays.asList(node2)));
        __CLR4_5_2435435lwzsd86x.R.inc(5359);Node node6 = new Node("6", new ArrayList<Node>(Arrays.asList(node5, node4, node3)));

        __CLR4_5_2435435lwzsd86x.R.inc(5360);Boolean result = BREADTH_FIRST_SEARCH.breadth_first_search(node6, node1);
        __CLR4_5_2435435lwzsd86x.R.inc(5361);String resultStr = "";
        __CLR4_5_2435435lwzsd86x.R.inc(5362);if ((((result)&&(__CLR4_5_2435435lwzsd86x.R.iget(5363)!=0|true))||(__CLR4_5_2435435lwzsd86x.R.iget(5364)==0&false))) {{
            __CLR4_5_2435435lwzsd86x.R.inc(5365);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2435435lwzsd86x.R.inc(5366);resultStr = "Path not found!";
        }
        }__CLR4_5_2435435lwzsd86x.R.inc(5367);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2435435lwzsd86x.R.flushNeeded();}}

}
