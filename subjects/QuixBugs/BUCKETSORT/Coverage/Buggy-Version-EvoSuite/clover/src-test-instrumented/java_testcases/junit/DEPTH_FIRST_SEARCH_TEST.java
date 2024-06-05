/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import java_programs.DEPTH_FIRST_SEARCH;
import java_programs.Node;

public class DEPTH_FIRST_SEARCH_TEST {static class __CLR4_5_2376376lwzs9swu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,4198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: Strongly connected graph Output: Path found!
     */
    @Test
    public void test1() {__CLR4_5_2376376lwzs9swu.R.globalSliceStart(getClass().getName(),4146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu376();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2376376lwzs9swu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2376376lwzs9swu.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DEPTH_FIRST_SEARCH_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu376(){try{__CLR4_5_2376376lwzs9swu.R.inc(4146);
        __CLR4_5_2376376lwzs9swu.R.inc(4147);Node station1 = new Node("Westminster");
        __CLR4_5_2376376lwzs9swu.R.inc(4148);Node station2 = new Node("Waterloo", new ArrayList<Node>(Arrays.asList(station1)));
        __CLR4_5_2376376lwzs9swu.R.inc(4149);Node station3 = new Node("Trafalgar Square", new ArrayList<Node>(Arrays.asList(station1, station2)));
        __CLR4_5_2376376lwzs9swu.R.inc(4150);Node station4 = new Node("Canary Wharf", new ArrayList<Node>(Arrays.asList(station2, station3)));
        __CLR4_5_2376376lwzs9swu.R.inc(4151);Node station5 = new Node("London Bridge", new ArrayList<Node>(Arrays.asList(station4, station3)));
        __CLR4_5_2376376lwzs9swu.R.inc(4152);Node station6 = new Node("Tottenham Court Road", new ArrayList<Node>(Arrays.asList(station5, station4)));

        __CLR4_5_2376376lwzs9swu.R.inc(4153);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(station6, station1);
        __CLR4_5_2376376lwzs9swu.R.inc(4154);String resultStr = "";
        __CLR4_5_2376376lwzs9swu.R.inc(4155);if ((((result)&&(__CLR4_5_2376376lwzs9swu.R.iget(4156)!=0|true))||(__CLR4_5_2376376lwzs9swu.R.iget(4157)==0&false))) {{
            __CLR4_5_2376376lwzs9swu.R.inc(4158);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2376376lwzs9swu.R.inc(4159);resultStr = "Path not found!";
        }
        }__CLR4_5_2376376lwzs9swu.R.inc(4160);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2376376lwzs9swu.R.flushNeeded();}}

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
    public void test2() {__CLR4_5_2376376lwzs9swu.R.globalSliceStart(getClass().getName(),4161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b37l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2376376lwzs9swu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2376376lwzs9swu.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DEPTH_FIRST_SEARCH_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b37l(){try{__CLR4_5_2376376lwzs9swu.R.inc(4161);

        __CLR4_5_2376376lwzs9swu.R.inc(4162);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodea, nodee);
        __CLR4_5_2376376lwzs9swu.R.inc(4163);String resultStr = "";
        __CLR4_5_2376376lwzs9swu.R.inc(4164);if ((((result)&&(__CLR4_5_2376376lwzs9swu.R.iget(4165)!=0|true))||(__CLR4_5_2376376lwzs9swu.R.iget(4166)==0&false))) {{
            __CLR4_5_2376376lwzs9swu.R.inc(4167);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2376376lwzs9swu.R.inc(4168);resultStr = "Path not found!";
        }
        }__CLR4_5_2376376lwzs9swu.R.inc(4169);assertEquals("Path found!", resultStr);
    }finally{__CLR4_5_2376376lwzs9swu.R.flushNeeded();}}

    /**
     * Case 3: Two unconnected nodes in graph Output: Path not found
     */
    @Test
    public void test3() {__CLR4_5_2376376lwzs9swu.R.globalSliceStart(getClass().getName(),4170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs37u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2376376lwzs9swu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2376376lwzs9swu.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DEPTH_FIRST_SEARCH_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs37u(){try{__CLR4_5_2376376lwzs9swu.R.inc(4170);
        __CLR4_5_2376376lwzs9swu.R.inc(4171);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodef, nodee);
        __CLR4_5_2376376lwzs9swu.R.inc(4172);String resultStr = "";
        __CLR4_5_2376376lwzs9swu.R.inc(4173);if ((((result)&&(__CLR4_5_2376376lwzs9swu.R.iget(4174)!=0|true))||(__CLR4_5_2376376lwzs9swu.R.iget(4175)==0&false))) {{
            __CLR4_5_2376376lwzs9swu.R.inc(4176);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2376376lwzs9swu.R.inc(4177);resultStr = "Path not found!";
        }
        }__CLR4_5_2376376lwzs9swu.R.inc(4178);assertEquals("Path not found!", resultStr);

    }finally{__CLR4_5_2376376lwzs9swu.R.flushNeeded();}}

    /**
     * Case 4: One node graph Output: Path found
     */
    @Test
    public void test4() {__CLR4_5_2376376lwzs9swu.R.globalSliceStart(getClass().getName(),4179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s9383();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2376376lwzs9swu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2376376lwzs9swu.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DEPTH_FIRST_SEARCH_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s9383(){try{__CLR4_5_2376376lwzs9swu.R.inc(4179);
        __CLR4_5_2376376lwzs9swu.R.inc(4180);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodef, nodef);
        __CLR4_5_2376376lwzs9swu.R.inc(4181);String resultStr = "";
        __CLR4_5_2376376lwzs9swu.R.inc(4182);if ((((result)&&(__CLR4_5_2376376lwzs9swu.R.iget(4183)!=0|true))||(__CLR4_5_2376376lwzs9swu.R.iget(4184)==0&false))) {{
            __CLR4_5_2376376lwzs9swu.R.inc(4185);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2376376lwzs9swu.R.inc(4186);resultStr = "Path not found!";
        }
        }__CLR4_5_2376376lwzs9swu.R.inc(4187);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2376376lwzs9swu.R.flushNeeded();}}

    /**
     * Case 5: Graph with cycles Output: Path not found
     */
    @Test
    public void test5() {__CLR4_5_2376376lwzs9swu.R.globalSliceStart(getClass().getName(),4188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq38c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2376376lwzs9swu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2376376lwzs9swu.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DEPTH_FIRST_SEARCH_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq38c(){try{__CLR4_5_2376376lwzs9swu.R.inc(4188);
        __CLR4_5_2376376lwzs9swu.R.inc(4189);nodee.setSuccessors(new ArrayList<Node>(Arrays.asList(nodea)));
        __CLR4_5_2376376lwzs9swu.R.inc(4190);Boolean result = DEPTH_FIRST_SEARCH.depth_first_search(nodea, nodef);
        __CLR4_5_2376376lwzs9swu.R.inc(4191);String resultStr = "";
        __CLR4_5_2376376lwzs9swu.R.inc(4192);if ((((result)&&(__CLR4_5_2376376lwzs9swu.R.iget(4193)!=0|true))||(__CLR4_5_2376376lwzs9swu.R.iget(4194)==0&false))) {{
            __CLR4_5_2376376lwzs9swu.R.inc(4195);resultStr = "Path found!";
        } }else {{
            __CLR4_5_2376376lwzs9swu.R.inc(4196);resultStr = "Path not found!";
        }
        }__CLR4_5_2376376lwzs9swu.R.inc(4197);assertEquals("Path found!", resultStr);

    }finally{__CLR4_5_2376376lwzs9swu.R.flushNeeded();}}

}
