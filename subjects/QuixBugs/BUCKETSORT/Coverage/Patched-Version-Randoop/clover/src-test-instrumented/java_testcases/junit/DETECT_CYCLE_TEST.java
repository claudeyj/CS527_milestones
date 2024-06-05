/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java_programs.DETECT_CYCLE;
import java_programs.Node;

public class DETECT_CYCLE_TEST {static class __CLR4_5_2367367lwzsd7ef{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,4196,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Case 1: 5-node list input with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test1() {__CLR4_5_2367367lwzsd7ef.R.globalSliceStart(getClass().getName(),4111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu367();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2367367lwzsd7ef.R.rethrow($CLV_t2$);}finally{__CLR4_5_2367367lwzsd7ef.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu367(){try{__CLR4_5_2367367lwzsd7ef.R.inc(4111);
        __CLR4_5_2367367lwzsd7ef.R.inc(4112);Node node1 = new Node("1");
        __CLR4_5_2367367lwzsd7ef.R.inc(4113);Node node2 = new Node("2", node1);
        __CLR4_5_2367367lwzsd7ef.R.inc(4114);Node node3 = new Node("3", node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4115);Node node4 = new Node("4", node3);
        __CLR4_5_2367367lwzsd7ef.R.inc(4116);Node node5 = new Node("5", node4);
        __CLR4_5_2367367lwzsd7ef.R.inc(4117);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_2367367lwzsd7ef.R.inc(4118);String resultStr = "";
        __CLR4_5_2367367lwzsd7ef.R.inc(4119);if ((((result)&&(__CLR4_5_2367367lwzsd7ef.R.iget(4120)!=0|true))||(__CLR4_5_2367367lwzsd7ef.R.iget(4121)==0&false))) {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4122);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4123);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2367367lwzsd7ef.R.inc(4124);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_2367367lwzsd7ef.R.flushNeeded();}}

    /**
     * Case 2: 5-node list input with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test2() {__CLR4_5_2367367lwzsd7ef.R.globalSliceStart(getClass().getName(),4125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b36l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2367367lwzsd7ef.R.rethrow($CLV_t2$);}finally{__CLR4_5_2367367lwzsd7ef.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b36l(){try{__CLR4_5_2367367lwzsd7ef.R.inc(4125);
        __CLR4_5_2367367lwzsd7ef.R.inc(4126);Node node1 = new Node("1");
        __CLR4_5_2367367lwzsd7ef.R.inc(4127);Node node2 = new Node("2", node1);
        __CLR4_5_2367367lwzsd7ef.R.inc(4128);Node node3 = new Node("3", node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4129);Node node4 = new Node("4", node3);
        __CLR4_5_2367367lwzsd7ef.R.inc(4130);Node node5 = new Node("5", node4);
        __CLR4_5_2367367lwzsd7ef.R.inc(4131);node1.setSuccessor(node5);
        __CLR4_5_2367367lwzsd7ef.R.inc(4132);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_2367367lwzsd7ef.R.inc(4133);String resultStr = "";
        __CLR4_5_2367367lwzsd7ef.R.inc(4134);if ((((result)&&(__CLR4_5_2367367lwzsd7ef.R.iget(4135)!=0|true))||(__CLR4_5_2367367lwzsd7ef.R.iget(4136)==0&false))) {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4137);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4138);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2367367lwzsd7ef.R.inc(4139);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_2367367lwzsd7ef.R.flushNeeded();}}

    /**
     * Case 3: 2-node list with cycle Expected Output: Cycle detected!
     */

    @Test
    public void test3() {__CLR4_5_2367367lwzsd7ef.R.globalSliceStart(getClass().getName(),4140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs370();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2367367lwzsd7ef.R.rethrow($CLV_t2$);}finally{__CLR4_5_2367367lwzsd7ef.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs370(){try{__CLR4_5_2367367lwzsd7ef.R.inc(4140);
        __CLR4_5_2367367lwzsd7ef.R.inc(4141);Node node1 = new Node("1");
        __CLR4_5_2367367lwzsd7ef.R.inc(4142);Node node2 = new Node("2", node1);
        __CLR4_5_2367367lwzsd7ef.R.inc(4143);Node node3 = new Node("3", node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4144);Node node4 = new Node("4", node3);
        __CLR4_5_2367367lwzsd7ef.R.inc(4145);Node node5 = new Node("5", node4);
        __CLR4_5_2367367lwzsd7ef.R.inc(4146);node1.setSuccessor(node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4147);Boolean result = DETECT_CYCLE.detect_cycle(node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4148);String resultStr = "";
        __CLR4_5_2367367lwzsd7ef.R.inc(4149);if ((((result)&&(__CLR4_5_2367367lwzsd7ef.R.iget(4150)!=0|true))||(__CLR4_5_2367367lwzsd7ef.R.iget(4151)==0&false))) {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4152);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4153);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2367367lwzsd7ef.R.inc(4154);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_2367367lwzsd7ef.R.flushNeeded();}}

    /**
     * Case 4: 2-node list with no cycle Expected Output: Cycle not detected!
     */

    @Test
    public void test4() {__CLR4_5_2367367lwzsd7ef.R.globalSliceStart(getClass().getName(),4155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s937f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2367367lwzsd7ef.R.rethrow($CLV_t2$);}finally{__CLR4_5_2367367lwzsd7ef.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s937f(){try{__CLR4_5_2367367lwzsd7ef.R.inc(4155);
        __CLR4_5_2367367lwzsd7ef.R.inc(4156);Node node1 = new Node("1");
        __CLR4_5_2367367lwzsd7ef.R.inc(4157);Node node2 = new Node("2", node1);
        __CLR4_5_2367367lwzsd7ef.R.inc(4158);Node node3 = new Node("3", node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4159);Node node4 = new Node("4", node3);
        __CLR4_5_2367367lwzsd7ef.R.inc(4160);Node node5 = new Node("5", node4);
        __CLR4_5_2367367lwzsd7ef.R.inc(4161);Node node6 = new Node("6");
        __CLR4_5_2367367lwzsd7ef.R.inc(4162);Node node7 = new Node("7", node6);
        __CLR4_5_2367367lwzsd7ef.R.inc(4163);Boolean result = DETECT_CYCLE.detect_cycle(node7);
        __CLR4_5_2367367lwzsd7ef.R.inc(4164);String resultStr = "";
        __CLR4_5_2367367lwzsd7ef.R.inc(4165);if ((((result)&&(__CLR4_5_2367367lwzsd7ef.R.iget(4166)!=0|true))||(__CLR4_5_2367367lwzsd7ef.R.iget(4167)==0&false))) {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4168);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4169);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2367367lwzsd7ef.R.inc(4170);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_2367367lwzsd7ef.R.flushNeeded();}}

    /**
     * Case 5: 1-node list Expected Output: Cycle not detected!
     */

    @Test
    public void test5() {__CLR4_5_2367367lwzsd7ef.R.globalSliceStart(getClass().getName(),4171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq37v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2367367lwzsd7ef.R.rethrow($CLV_t2$);}finally{__CLR4_5_2367367lwzsd7ef.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq37v(){try{__CLR4_5_2367367lwzsd7ef.R.inc(4171);
        __CLR4_5_2367367lwzsd7ef.R.inc(4172);Node node = new Node("0");
        __CLR4_5_2367367lwzsd7ef.R.inc(4173);Boolean result = DETECT_CYCLE.detect_cycle(node);
        __CLR4_5_2367367lwzsd7ef.R.inc(4174);String resultStr = "";
        __CLR4_5_2367367lwzsd7ef.R.inc(4175);if ((((result)&&(__CLR4_5_2367367lwzsd7ef.R.iget(4176)!=0|true))||(__CLR4_5_2367367lwzsd7ef.R.iget(4177)==0&false))) {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4178);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4179);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2367367lwzsd7ef.R.inc(4180);assertEquals("Cycle not detected!", resultStr);
    }finally{__CLR4_5_2367367lwzsd7ef.R.flushNeeded();}}

    /**
     * Case 6: 5 nodes in total. the last 2 nodes form a cycle. input the first node
     */
    @Test
    public void test6() {__CLR4_5_2367367lwzsd7ef.R.globalSliceStart(getClass().getName(),4181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d7385();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2367367lwzsd7ef.R.rethrow($CLV_t2$);}finally{__CLR4_5_2367367lwzsd7ef.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.DETECT_CYCLE_TEST.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d7385(){try{__CLR4_5_2367367lwzsd7ef.R.inc(4181);
        __CLR4_5_2367367lwzsd7ef.R.inc(4182);Node node1 = new Node("1");
        __CLR4_5_2367367lwzsd7ef.R.inc(4183);Node node2 = new Node("2", node1);
        __CLR4_5_2367367lwzsd7ef.R.inc(4184);Node node3 = new Node("3", node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4185);Node node4 = new Node("4", node3);
        __CLR4_5_2367367lwzsd7ef.R.inc(4186);Node node5 = new Node("5", node4);
        __CLR4_5_2367367lwzsd7ef.R.inc(4187);node1.setSuccessor(node2);
        __CLR4_5_2367367lwzsd7ef.R.inc(4188);Boolean result = DETECT_CYCLE.detect_cycle(node5);
        __CLR4_5_2367367lwzsd7ef.R.inc(4189);String resultStr = "";
        __CLR4_5_2367367lwzsd7ef.R.inc(4190);if ((((result)&&(__CLR4_5_2367367lwzsd7ef.R.iget(4191)!=0|true))||(__CLR4_5_2367367lwzsd7ef.R.iget(4192)==0&false))) {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4193);resultStr = "Cycle detected!";
        } }else {{
            __CLR4_5_2367367lwzsd7ef.R.inc(4194);resultStr = "Cycle not detected!";
        }
        }__CLR4_5_2367367lwzsd7ef.R.inc(4195);assertEquals("Cycle detected!", resultStr);
    }finally{__CLR4_5_2367367lwzsd7ef.R.flushNeeded();}}

}
