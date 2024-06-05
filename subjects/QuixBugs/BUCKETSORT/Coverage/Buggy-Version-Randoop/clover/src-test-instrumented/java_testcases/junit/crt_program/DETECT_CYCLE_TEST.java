/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import correct_java_programs.DETECT_CYCLE;
import java_programs.Node;

public class DETECT_CYCLE_TEST {static class __CLR4_5_249n49nlwzsao0t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,5616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: 5-node list input with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test1() {__CLR4_5_249n49nlwzsao0t.R.globalSliceStart(getClass().getName(),5531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu49n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_249n49nlwzsao0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_249n49nlwzsao0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5531,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu49n(){try{__CLR4_5_249n49nlwzsao0t.R.inc(5531);
        __CLR4_5_249n49nlwzsao0t.R.inc(5532);Node node1 = new Node("1");
        __CLR4_5_249n49nlwzsao0t.R.inc(5533);Node node2 = new Node("2", node1);
        __CLR4_5_249n49nlwzsao0t.R.inc(5534);Node node3 = new Node("3", node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5535);Node node4 = new Node("4", node3);
        __CLR4_5_249n49nlwzsao0t.R.inc(5536);Node node5 = new Node("5", node4);
        __CLR4_5_249n49nlwzsao0t.R.inc(5537);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_249n49nlwzsao0t.R.inc(5538);String resultStr = "";
        __CLR4_5_249n49nlwzsao0t.R.inc(5539);if ((((result)&&(__CLR4_5_249n49nlwzsao0t.R.iget(5540)!=0|true))||(__CLR4_5_249n49nlwzsao0t.R.iget(5541)==0&false))) {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5542);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5543);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_249n49nlwzsao0t.R.inc(5544);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_249n49nlwzsao0t.R.flushNeeded();}}

    /**
     * Case 2: 5-node list input with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test2() {__CLR4_5_249n49nlwzsao0t.R.globalSliceStart(getClass().getName(),5545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b4a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_249n49nlwzsao0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_249n49nlwzsao0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b4a1(){try{__CLR4_5_249n49nlwzsao0t.R.inc(5545);
        __CLR4_5_249n49nlwzsao0t.R.inc(5546);Node node1 = new Node("1");
        __CLR4_5_249n49nlwzsao0t.R.inc(5547);Node node2 = new Node("2", node1);
        __CLR4_5_249n49nlwzsao0t.R.inc(5548);Node node3 = new Node("3", node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5549);Node node4 = new Node("4", node3);
        __CLR4_5_249n49nlwzsao0t.R.inc(5550);Node node5 = new Node("5", node4);
        __CLR4_5_249n49nlwzsao0t.R.inc(5551);node1.setSuccessor(node5);
        __CLR4_5_249n49nlwzsao0t.R.inc(5552);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_249n49nlwzsao0t.R.inc(5553);String resultStr = "";
        __CLR4_5_249n49nlwzsao0t.R.inc(5554);if ((((result)&&(__CLR4_5_249n49nlwzsao0t.R.iget(5555)!=0|true))||(__CLR4_5_249n49nlwzsao0t.R.iget(5556)==0&false))) {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5557);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5558);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_249n49nlwzsao0t.R.inc(5559);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_249n49nlwzsao0t.R.flushNeeded();}}

    /**
     * Case 3: 2-node list with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test3() {__CLR4_5_249n49nlwzsao0t.R.globalSliceStart(getClass().getName(),5560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs4ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_249n49nlwzsao0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_249n49nlwzsao0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs4ag(){try{__CLR4_5_249n49nlwzsao0t.R.inc(5560);
        __CLR4_5_249n49nlwzsao0t.R.inc(5561);Node node1 = new Node("1");
        __CLR4_5_249n49nlwzsao0t.R.inc(5562);Node node2 = new Node("2", node1);
        __CLR4_5_249n49nlwzsao0t.R.inc(5563);Node node3 = new Node("3", node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5564);Node node4 = new Node("4", node3);
        __CLR4_5_249n49nlwzsao0t.R.inc(5565);Node node5 = new Node("5", node4);
        __CLR4_5_249n49nlwzsao0t.R.inc(5566);node1.setSuccessor(node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5567);Boolean result = DETECT_CYCLE.detect_cycle(node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5568);String resultStr = "";
        __CLR4_5_249n49nlwzsao0t.R.inc(5569);if ((((result)&&(__CLR4_5_249n49nlwzsao0t.R.iget(5570)!=0|true))||(__CLR4_5_249n49nlwzsao0t.R.iget(5571)==0&false))) {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5572);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5573);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_249n49nlwzsao0t.R.inc(5574);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_249n49nlwzsao0t.R.flushNeeded();}}

    /**
     * Case 4: 2-node list with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test4() {__CLR4_5_249n49nlwzsao0t.R.globalSliceStart(getClass().getName(),5575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s94av();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_249n49nlwzsao0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_249n49nlwzsao0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s94av(){try{__CLR4_5_249n49nlwzsao0t.R.inc(5575);
        __CLR4_5_249n49nlwzsao0t.R.inc(5576);Node node1 = new Node("1");
        __CLR4_5_249n49nlwzsao0t.R.inc(5577);Node node2 = new Node("2", node1);
        __CLR4_5_249n49nlwzsao0t.R.inc(5578);Node node3 = new Node("3", node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5579);Node node4 = new Node("4", node3);
        __CLR4_5_249n49nlwzsao0t.R.inc(5580);Node node5 = new Node("5", node4);
        __CLR4_5_249n49nlwzsao0t.R.inc(5581);Node node6 = new Node("6");
        __CLR4_5_249n49nlwzsao0t.R.inc(5582);Node node7 = new Node("7", node6);
        __CLR4_5_249n49nlwzsao0t.R.inc(5583);Boolean result = DETECT_CYCLE.detect_cycle(node7);
        __CLR4_5_249n49nlwzsao0t.R.inc(5584);String resultStr = "";
        __CLR4_5_249n49nlwzsao0t.R.inc(5585);if ((((result)&&(__CLR4_5_249n49nlwzsao0t.R.iget(5586)!=0|true))||(__CLR4_5_249n49nlwzsao0t.R.iget(5587)==0&false))) {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5588);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5589);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_249n49nlwzsao0t.R.inc(5590);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_249n49nlwzsao0t.R.flushNeeded();}}

    /**
     * Case 5: 1-node list Expected Output: Cycle not detected!
     */

    @Test
    public void test5() {__CLR4_5_249n49nlwzsao0t.R.globalSliceStart(getClass().getName(),5591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq4bb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_249n49nlwzsao0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_249n49nlwzsao0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq4bb(){try{__CLR4_5_249n49nlwzsao0t.R.inc(5591);
        __CLR4_5_249n49nlwzsao0t.R.inc(5592);Node node = new Node("0");
        __CLR4_5_249n49nlwzsao0t.R.inc(5593);Boolean result = DETECT_CYCLE.detect_cycle(node);
        __CLR4_5_249n49nlwzsao0t.R.inc(5594);String resultStr = "";
        __CLR4_5_249n49nlwzsao0t.R.inc(5595);if ((((result)&&(__CLR4_5_249n49nlwzsao0t.R.iget(5596)!=0|true))||(__CLR4_5_249n49nlwzsao0t.R.iget(5597)==0&false))) {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5598);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5599);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_249n49nlwzsao0t.R.inc(5600);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_249n49nlwzsao0t.R.flushNeeded();}}

    /**
     * Case 6: 5 nodes in total. the last 2 nodes form a cycle. input the first node
     */
    @Test
    public void test6() {__CLR4_5_249n49nlwzsao0t.R.globalSliceStart(getClass().getName(),5601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d74bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_249n49nlwzsao0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_249n49nlwzsao0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.DETECT_CYCLE_TEST.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d74bl(){try{__CLR4_5_249n49nlwzsao0t.R.inc(5601);
        __CLR4_5_249n49nlwzsao0t.R.inc(5602);Node node1 = new Node("1");
        __CLR4_5_249n49nlwzsao0t.R.inc(5603);Node node2 = new Node("2", node1);
        __CLR4_5_249n49nlwzsao0t.R.inc(5604);Node node3 = new Node("3", node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5605);Node node4 = new Node("4", node3);
        __CLR4_5_249n49nlwzsao0t.R.inc(5606);Node node5 = new Node("5", node4);
        __CLR4_5_249n49nlwzsao0t.R.inc(5607);node1.setSuccessor(node2);
        __CLR4_5_249n49nlwzsao0t.R.inc(5608);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_249n49nlwzsao0t.R.inc(5609);String resultStr = "";
        __CLR4_5_249n49nlwzsao0t.R.inc(5610);if ((((result)&&(__CLR4_5_249n49nlwzsao0t.R.iget(5611)!=0|true))||(__CLR4_5_249n49nlwzsao0t.R.iget(5612)==0&false))) {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5613);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_249n49nlwzsao0t.R.inc(5614);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_249n49nlwzsao0t.R.inc(5615);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_249n49nlwzsao0t.R.flushNeeded();}}
}
