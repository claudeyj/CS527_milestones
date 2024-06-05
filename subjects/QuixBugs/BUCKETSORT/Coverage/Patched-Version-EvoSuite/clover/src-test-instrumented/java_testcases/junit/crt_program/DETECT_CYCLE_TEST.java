/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import correct_java_programs.DETECT_CYCLE;
import java_programs.Node;

public class DETECT_CYCLE_TEST {static class __CLR4_5_2478478lwzsccxh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,5529,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: 5-node list input with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test1() {__CLR4_5_2478478lwzsccxh.R.globalSliceStart(getClass().getName(),5444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu478();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2478478lwzsccxh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2478478lwzsccxh.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu478(){try{__CLR4_5_2478478lwzsccxh.R.inc(5444);
        __CLR4_5_2478478lwzsccxh.R.inc(5445);Node node1 = new Node("1");
        __CLR4_5_2478478lwzsccxh.R.inc(5446);Node node2 = new Node("2", node1);
        __CLR4_5_2478478lwzsccxh.R.inc(5447);Node node3 = new Node("3", node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5448);Node node4 = new Node("4", node3);
        __CLR4_5_2478478lwzsccxh.R.inc(5449);Node node5 = new Node("5", node4);
        __CLR4_5_2478478lwzsccxh.R.inc(5450);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_2478478lwzsccxh.R.inc(5451);String resultStr = "";
        __CLR4_5_2478478lwzsccxh.R.inc(5452);if ((((result)&&(__CLR4_5_2478478lwzsccxh.R.iget(5453)!=0|true))||(__CLR4_5_2478478lwzsccxh.R.iget(5454)==0&false))) {{
            __CLR4_5_2478478lwzsccxh.R.inc(5455);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2478478lwzsccxh.R.inc(5456);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2478478lwzsccxh.R.inc(5457);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_2478478lwzsccxh.R.flushNeeded();}}

    /**
     * Case 2: 5-node list input with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test2() {__CLR4_5_2478478lwzsccxh.R.globalSliceStart(getClass().getName(),5458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b47m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2478478lwzsccxh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2478478lwzsccxh.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b47m(){try{__CLR4_5_2478478lwzsccxh.R.inc(5458);
        __CLR4_5_2478478lwzsccxh.R.inc(5459);Node node1 = new Node("1");
        __CLR4_5_2478478lwzsccxh.R.inc(5460);Node node2 = new Node("2", node1);
        __CLR4_5_2478478lwzsccxh.R.inc(5461);Node node3 = new Node("3", node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5462);Node node4 = new Node("4", node3);
        __CLR4_5_2478478lwzsccxh.R.inc(5463);Node node5 = new Node("5", node4);
        __CLR4_5_2478478lwzsccxh.R.inc(5464);node1.setSuccessor(node5);
        __CLR4_5_2478478lwzsccxh.R.inc(5465);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_2478478lwzsccxh.R.inc(5466);String resultStr = "";
        __CLR4_5_2478478lwzsccxh.R.inc(5467);if ((((result)&&(__CLR4_5_2478478lwzsccxh.R.iget(5468)!=0|true))||(__CLR4_5_2478478lwzsccxh.R.iget(5469)==0&false))) {{
            __CLR4_5_2478478lwzsccxh.R.inc(5470);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2478478lwzsccxh.R.inc(5471);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2478478lwzsccxh.R.inc(5472);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_2478478lwzsccxh.R.flushNeeded();}}

    /**
     * Case 3: 2-node list with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test3() {__CLR4_5_2478478lwzsccxh.R.globalSliceStart(getClass().getName(),5473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs481();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2478478lwzsccxh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2478478lwzsccxh.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs481(){try{__CLR4_5_2478478lwzsccxh.R.inc(5473);
        __CLR4_5_2478478lwzsccxh.R.inc(5474);Node node1 = new Node("1");
        __CLR4_5_2478478lwzsccxh.R.inc(5475);Node node2 = new Node("2", node1);
        __CLR4_5_2478478lwzsccxh.R.inc(5476);Node node3 = new Node("3", node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5477);Node node4 = new Node("4", node3);
        __CLR4_5_2478478lwzsccxh.R.inc(5478);Node node5 = new Node("5", node4);
        __CLR4_5_2478478lwzsccxh.R.inc(5479);node1.setSuccessor(node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5480);Boolean result = DETECT_CYCLE.detect_cycle(node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5481);String resultStr = "";
        __CLR4_5_2478478lwzsccxh.R.inc(5482);if ((((result)&&(__CLR4_5_2478478lwzsccxh.R.iget(5483)!=0|true))||(__CLR4_5_2478478lwzsccxh.R.iget(5484)==0&false))) {{
            __CLR4_5_2478478lwzsccxh.R.inc(5485);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2478478lwzsccxh.R.inc(5486);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2478478lwzsccxh.R.inc(5487);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_2478478lwzsccxh.R.flushNeeded();}}

    /**
     * Case 4: 2-node list with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test4() {__CLR4_5_2478478lwzsccxh.R.globalSliceStart(getClass().getName(),5488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s948g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2478478lwzsccxh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2478478lwzsccxh.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s948g(){try{__CLR4_5_2478478lwzsccxh.R.inc(5488);
        __CLR4_5_2478478lwzsccxh.R.inc(5489);Node node1 = new Node("1");
        __CLR4_5_2478478lwzsccxh.R.inc(5490);Node node2 = new Node("2", node1);
        __CLR4_5_2478478lwzsccxh.R.inc(5491);Node node3 = new Node("3", node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5492);Node node4 = new Node("4", node3);
        __CLR4_5_2478478lwzsccxh.R.inc(5493);Node node5 = new Node("5", node4);
        __CLR4_5_2478478lwzsccxh.R.inc(5494);Node node6 = new Node("6");
        __CLR4_5_2478478lwzsccxh.R.inc(5495);Node node7 = new Node("7", node6);
        __CLR4_5_2478478lwzsccxh.R.inc(5496);Boolean result = DETECT_CYCLE.detect_cycle(node7);
        __CLR4_5_2478478lwzsccxh.R.inc(5497);String resultStr = "";
        __CLR4_5_2478478lwzsccxh.R.inc(5498);if ((((result)&&(__CLR4_5_2478478lwzsccxh.R.iget(5499)!=0|true))||(__CLR4_5_2478478lwzsccxh.R.iget(5500)==0&false))) {{
            __CLR4_5_2478478lwzsccxh.R.inc(5501);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2478478lwzsccxh.R.inc(5502);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2478478lwzsccxh.R.inc(5503);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_2478478lwzsccxh.R.flushNeeded();}}

    /**
     * Case 5: 1-node list Expected Output: Cycle not detected!
     */

    @Test
    public void test5() {__CLR4_5_2478478lwzsccxh.R.globalSliceStart(getClass().getName(),5504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq48w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2478478lwzsccxh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2478478lwzsccxh.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq48w(){try{__CLR4_5_2478478lwzsccxh.R.inc(5504);
        __CLR4_5_2478478lwzsccxh.R.inc(5505);Node node = new Node("0");
        __CLR4_5_2478478lwzsccxh.R.inc(5506);Boolean result = DETECT_CYCLE.detect_cycle(node);
        __CLR4_5_2478478lwzsccxh.R.inc(5507);String resultStr = "";
        __CLR4_5_2478478lwzsccxh.R.inc(5508);if ((((result)&&(__CLR4_5_2478478lwzsccxh.R.iget(5509)!=0|true))||(__CLR4_5_2478478lwzsccxh.R.iget(5510)==0&false))) {{
            __CLR4_5_2478478lwzsccxh.R.inc(5511);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2478478lwzsccxh.R.inc(5512);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2478478lwzsccxh.R.inc(5513);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_2478478lwzsccxh.R.flushNeeded();}}

    /**
     * Case 6: 5 nodes in total. the last 2 nodes form a cycle. input the first node
     */
    @Test
    public void test6() {__CLR4_5_2478478lwzsccxh.R.globalSliceStart(getClass().getName(),5514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d7496();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2478478lwzsccxh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2478478lwzsccxh.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d7496(){try{__CLR4_5_2478478lwzsccxh.R.inc(5514);
        __CLR4_5_2478478lwzsccxh.R.inc(5515);Node node1 = new Node("1");
        __CLR4_5_2478478lwzsccxh.R.inc(5516);Node node2 = new Node("2", node1);
        __CLR4_5_2478478lwzsccxh.R.inc(5517);Node node3 = new Node("3", node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5518);Node node4 = new Node("4", node3);
        __CLR4_5_2478478lwzsccxh.R.inc(5519);Node node5 = new Node("5", node4);
        __CLR4_5_2478478lwzsccxh.R.inc(5520);node1.setSuccessor(node2);
        __CLR4_5_2478478lwzsccxh.R.inc(5521);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_2478478lwzsccxh.R.inc(5522);String resultStr = "";
        __CLR4_5_2478478lwzsccxh.R.inc(5523);if ((((result)&&(__CLR4_5_2478478lwzsccxh.R.iget(5524)!=0|true))||(__CLR4_5_2478478lwzsccxh.R.iget(5525)==0&false))) {{
            __CLR4_5_2478478lwzsccxh.R.inc(5526);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2478478lwzsccxh.R.inc(5527);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2478478lwzsccxh.R.inc(5528);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_2478478lwzsccxh.R.flushNeeded();}}
}
