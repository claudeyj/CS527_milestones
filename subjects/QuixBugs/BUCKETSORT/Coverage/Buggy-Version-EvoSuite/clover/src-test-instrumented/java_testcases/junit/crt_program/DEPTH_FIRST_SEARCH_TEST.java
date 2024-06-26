/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import correct_java_programs.DEPTH_FIRST_SEARCH;
import java_programs.Node;

public class DEPTH_FIRST_SEARCH_TEST {static class __CLR4_5_2487487lwzs9tos{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,5531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Strongly connected graph Output: Path found!
     */
    @Test
    public void test1() {__CLR4_5_2487487lwzs9tos.R.globalSliceStart(getClass().getName(),5479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu487();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2487487lwzs9tos.R.rethrow($CLV_t2$);}finally{__CLR4_5_2487487lwzs9tos.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DEPTH_FIRST_SEARCH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu487(){try{__CLR4_5_2487487lwzs9tos.R.inc(5479);
        __CLR4_5_2487487lwzs9tos.R.inc(5480);Node station1 = new Node("Westminster");
        __CLR4_5_2487487lwzs9tos.R.inc(5481);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_2487487lwzs9tos.R.inc(5482);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_2487487lwzs9tos.R.inc(5483);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_2487487lwzs9tos.R.inc(5484);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_2487487lwzs9tos.R.inc(5485);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));

        __CLR4_5_2487487lwzs9tos.R.inc(5486);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(station6, station1);
        __CLR4_5_2487487lwzs9tos.R.inc(5487);String resultStr = "";
        __CLR4_5_2487487lwzs9tos.R.inc(5488);if ((((result)&&(__CLR4_5_2487487lwzs9tos.R.iget(5489)!=0|true))||(__CLR4_5_2487487lwzs9tos.R.iget(5490)==0&false))) {{
            __CLR4_5_2487487lwzs9tos.R.inc(5491);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2487487lwzs9tos.R.inc(5492);resultStr = "Path not found!";
        }
        }__CLR4_5_2487487lwzs9tos.R.inc(5493);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2487487lwzs9tos.R.flushNeeded();}}

    // For following tests
    Node nodef = new Node("F");
    Node nodee = new Node("E");
    Node noded = new Node("D");
    Node nodec = new Node("C", new ArrayList<Node>(Arrays.asList(nodef)));
    Node nodeb = new Node("B", new ArrayList<Node>(Arrays.asList(nodee)));
    Node nodea = new Node("A", new ArrayList<Node>(Arrays.asList(nodeb, nodec, noded)));

    /**
     * Case 2: Branching graph Output: Path found!
     */
    @Test
    public void test2() {__CLR4_5_2487487lwzs9tos.R.globalSliceStart(getClass().getName(),5494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b48m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2487487lwzs9tos.R.rethrow($CLV_t2$);}finally{__CLR4_5_2487487lwzs9tos.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DEPTH_FIRST_SEARCH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b48m(){try{__CLR4_5_2487487lwzs9tos.R.inc(5494);

        __CLR4_5_2487487lwzs9tos.R.inc(5495);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodea, nodee);
        __CLR4_5_2487487lwzs9tos.R.inc(5496);String resultStr = "";
        __CLR4_5_2487487lwzs9tos.R.inc(5497);if ((((result)&&(__CLR4_5_2487487lwzs9tos.R.iget(5498)!=0|true))||(__CLR4_5_2487487lwzs9tos.R.iget(5499)==0&false))) {{
            __CLR4_5_2487487lwzs9tos.R.inc(5500);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2487487lwzs9tos.R.inc(5501);resultStr = "Path not found!";
        }
        }__CLR4_5_2487487lwzs9tos.R.inc(5502);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2487487lwzs9tos.R.flushNeeded();}}

    /**
     * Case 3: Two unconnected nodes in graph Output: Path not found
     */
    @Test
    public void test3() {__CLR4_5_2487487lwzs9tos.R.globalSliceStart(getClass().getName(),5503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs48v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2487487lwzs9tos.R.rethrow($CLV_t2$);}finally{__CLR4_5_2487487lwzs9tos.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DEPTH_FIRST_SEARCH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs48v(){try{__CLR4_5_2487487lwzs9tos.R.inc(5503);
        __CLR4_5_2487487lwzs9tos.R.inc(5504);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodef, nodee);
        __CLR4_5_2487487lwzs9tos.R.inc(5505);String resultStr = "";
        __CLR4_5_2487487lwzs9tos.R.inc(5506);if ((((result)&&(__CLR4_5_2487487lwzs9tos.R.iget(5507)!=0|true))||(__CLR4_5_2487487lwzs9tos.R.iget(5508)==0&false))) {{
            __CLR4_5_2487487lwzs9tos.R.inc(5509);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2487487lwzs9tos.R.inc(5510);resultStr = "Path not found!";
        }
        }__CLR4_5_2487487lwzs9tos.R.inc(5511);assertEquals("Path not found!", resultStr);

    }finally{__CLR4_5_2487487lwzs9tos.R.flushNeeded();}}

    /**
     * Case 4: One node graph Output: Path found
     */
    @Test
    public void test4() {__CLR4_5_2487487lwzs9tos.R.globalSliceStart(getClass().getName(),5512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s9494();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2487487lwzs9tos.R.rethrow($CLV_t2$);}finally{__CLR4_5_2487487lwzs9tos.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DEPTH_FIRST_SEARCH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s9494(){try{__CLR4_5_2487487lwzs9tos.R.inc(5512);
        __CLR4_5_2487487lwzs9tos.R.inc(5513);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodef, nodef);
        __CLR4_5_2487487lwzs9tos.R.inc(5514);String resultStr = "";
        __CLR4_5_2487487lwzs9tos.R.inc(5515);if ((((result)&&(__CLR4_5_2487487lwzs9tos.R.iget(5516)!=0|true))||(__CLR4_5_2487487lwzs9tos.R.iget(5517)==0&false))) {{
            __CLR4_5_2487487lwzs9tos.R.inc(5518);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2487487lwzs9tos.R.inc(5519);resultStr = "Path not found!";
        }
        }__CLR4_5_2487487lwzs9tos.R.inc(5520);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2487487lwzs9tos.R.flushNeeded();}}

    /**
     * Case 5: Graph with cycles Output: Path not found
     */
    @Test
    public void test5() {__CLR4_5_2487487lwzs9tos.R.globalSliceStart(getClass().getName(),5521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq49d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2487487lwzs9tos.R.rethrow($CLV_t2$);}finally{__CLR4_5_2487487lwzs9tos.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DEPTH_FIRST_SEARCH_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5521,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq49d(){try{__CLR4_5_2487487lwzs9tos.R.inc(5521);
        __CLR4_5_2487487lwzs9tos.R.inc(5522);nodee.setSuccessors(new ArrayList<Node>(Arrays.asList(nodea)));
        __CLR4_5_2487487lwzs9tos.R.inc(5523);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodea, nodef);
        __CLR4_5_2487487lwzs9tos.R.inc(5524);String resultStr = "";
        __CLR4_5_2487487lwzs9tos.R.inc(5525);if ((((result)&&(__CLR4_5_2487487lwzs9tos.R.iget(5526)!=0|true))||(__CLR4_5_2487487lwzs9tos.R.iget(5527)==0&false))) {{
            __CLR4_5_2487487lwzs9tos.R.inc(5528);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2487487lwzs9tos.R.inc(5529);resultStr = "Path not found!";
        }
        }__CLR4_5_2487487lwzs9tos.R.inc(5530);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2487487lwzs9tos.R.flushNeeded();}}

}
