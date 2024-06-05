/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java_programs.DETECT_CYCLE;
import java_programs.Node;

public class DETECT_CYCLE_TEST {static class __CLR4_5_238m38mlwzs9sx7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,4283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: 5-node list input with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test1() {__CLR4_5_238m38mlwzs9sx7.R.globalSliceStart(getClass().getName(),4198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu38m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_238m38mlwzs9sx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_238m38mlwzs9sx7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu38m(){try{__CLR4_5_238m38mlwzs9sx7.R.inc(4198);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4199);Node node1 = new Node("1");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4200);Node node2 = new Node("2", node1);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4201);Node node3 = new Node("3", node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4202);Node node4 = new Node("4", node3);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4203);Node node5 = new Node("5", node4);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4204);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4205);String resultStr = "";
        __CLR4_5_238m38mlwzs9sx7.R.inc(4206);if ((((result)&&(__CLR4_5_238m38mlwzs9sx7.R.iget(4207)!=0|true))||(__CLR4_5_238m38mlwzs9sx7.R.iget(4208)==0&false))) {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4209);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4210);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_238m38mlwzs9sx7.R.inc(4211);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_238m38mlwzs9sx7.R.flushNeeded();}}

    /**
     * Case 2: 5-node list input with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test2() {__CLR4_5_238m38mlwzs9sx7.R.globalSliceStart(getClass().getName(),4212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b390();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_238m38mlwzs9sx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_238m38mlwzs9sx7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b390(){try{__CLR4_5_238m38mlwzs9sx7.R.inc(4212);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4213);Node node1 = new Node("1");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4214);Node node2 = new Node("2", node1);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4215);Node node3 = new Node("3", node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4216);Node node4 = new Node("4", node3);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4217);Node node5 = new Node("5", node4);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4218);node1.setSuccessor(node5);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4219);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4220);String resultStr = "";
        __CLR4_5_238m38mlwzs9sx7.R.inc(4221);if ((((result)&&(__CLR4_5_238m38mlwzs9sx7.R.iget(4222)!=0|true))||(__CLR4_5_238m38mlwzs9sx7.R.iget(4223)==0&false))) {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4224);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4225);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_238m38mlwzs9sx7.R.inc(4226);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_238m38mlwzs9sx7.R.flushNeeded();}}

    /**
     * Case 3: 2-node list with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test3() {__CLR4_5_238m38mlwzs9sx7.R.globalSliceStart(getClass().getName(),4227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs39f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_238m38mlwzs9sx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_238m38mlwzs9sx7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs39f(){try{__CLR4_5_238m38mlwzs9sx7.R.inc(4227);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4228);Node node1 = new Node("1");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4229);Node node2 = new Node("2", node1);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4230);Node node3 = new Node("3", node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4231);Node node4 = new Node("4", node3);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4232);Node node5 = new Node("5", node4);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4233);node1.setSuccessor(node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4234);Boolean result = DETECT_CYCLE.detect_cycle(node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4235);String resultStr = "";
        __CLR4_5_238m38mlwzs9sx7.R.inc(4236);if ((((result)&&(__CLR4_5_238m38mlwzs9sx7.R.iget(4237)!=0|true))||(__CLR4_5_238m38mlwzs9sx7.R.iget(4238)==0&false))) {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4239);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4240);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_238m38mlwzs9sx7.R.inc(4241);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_238m38mlwzs9sx7.R.flushNeeded();}}

    /**
     * Case 4: 2-node list with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test4() {__CLR4_5_238m38mlwzs9sx7.R.globalSliceStart(getClass().getName(),4242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s939u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_238m38mlwzs9sx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_238m38mlwzs9sx7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s939u(){try{__CLR4_5_238m38mlwzs9sx7.R.inc(4242);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4243);Node node1 = new Node("1");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4244);Node node2 = new Node("2", node1);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4245);Node node3 = new Node("3", node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4246);Node node4 = new Node("4", node3);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4247);Node node5 = new Node("5", node4);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4248);Node node6 = new Node("6");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4249);Node node7 = new Node("7", node6);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4250);Boolean result = DETECT_CYCLE.detect_cycle(node7);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4251);String resultStr = "";
        __CLR4_5_238m38mlwzs9sx7.R.inc(4252);if ((((result)&&(__CLR4_5_238m38mlwzs9sx7.R.iget(4253)!=0|true))||(__CLR4_5_238m38mlwzs9sx7.R.iget(4254)==0&false))) {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4255);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4256);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_238m38mlwzs9sx7.R.inc(4257);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_238m38mlwzs9sx7.R.flushNeeded();}}

    /**
     * Case 5: 1-node list Expected Output: Cycle not detected!
     */

    @Test
    public void test5() {__CLR4_5_238m38mlwzs9sx7.R.globalSliceStart(getClass().getName(),4258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq3aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_238m38mlwzs9sx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_238m38mlwzs9sx7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq3aa(){try{__CLR4_5_238m38mlwzs9sx7.R.inc(4258);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4259);Node node = new Node("0");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4260);Boolean result = DETECT_CYCLE.detect_cycle(node);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4261);String resultStr = "";
        __CLR4_5_238m38mlwzs9sx7.R.inc(4262);if ((((result)&&(__CLR4_5_238m38mlwzs9sx7.R.iget(4263)!=0|true))||(__CLR4_5_238m38mlwzs9sx7.R.iget(4264)==0&false))) {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4265);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4266);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_238m38mlwzs9sx7.R.inc(4267);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_238m38mlwzs9sx7.R.flushNeeded();}}

    /**
     * Case 6: 5 nodes in total. the last 2 nodes form a cycle. input the first node
     */
    @Test
    public void test6() {__CLR4_5_238m38mlwzs9sx7.R.globalSliceStart(getClass().getName(),4268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d73ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_238m38mlwzs9sx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_238m38mlwzs9sx7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d73ak(){try{__CLR4_5_238m38mlwzs9sx7.R.inc(4268);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4269);Node node1 = new Node("1");
        __CLR4_5_238m38mlwzs9sx7.R.inc(4270);Node node2 = new Node("2", node1);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4271);Node node3 = new Node("3", node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4272);Node node4 = new Node("4", node3);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4273);Node node5 = new Node("5", node4);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4274);node1.setSuccessor(node2);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4275);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_238m38mlwzs9sx7.R.inc(4276);String resultStr = "";
        __CLR4_5_238m38mlwzs9sx7.R.inc(4277);if ((((result)&&(__CLR4_5_238m38mlwzs9sx7.R.iget(4278)!=0|true))||(__CLR4_5_238m38mlwzs9sx7.R.iget(4279)==0&false))) {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4280);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_238m38mlwzs9sx7.R.inc(4281);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_238m38mlwzs9sx7.R.inc(4282);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_238m38mlwzs9sx7.R.flushNeeded();}}

}
