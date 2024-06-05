/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java_programs.Node;
import java_programs.REVERSE_LINKED_LIST;

public class REVERSE_LINKED_LIST_TEST {static class __CLR4_5_23rh3rhlwzsccfb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,4904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /*
     * Case 1: 5-node list input
     * Expected Output: 1 2 3 4 5
     */
    @Test
    public void test1() {__CLR4_5_23rh3rhlwzsccfb.R.globalSliceStart(getClass().getName(),4877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu3rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23rh3rhlwzsccfb.R.rethrow($CLV_t2$);}finally{__CLR4_5_23rh3rhlwzsccfb.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.REVERSE_LINKED_LIST_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4877,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu3rh(){try{__CLR4_5_23rh3rhlwzsccfb.R.inc(4877);
        __CLR4_5_23rh3rhlwzsccfb.R.inc(4878);try {
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4879);Node node1 = new Node("1");
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4880);Node node2 = new Node("2", node1);
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4881);Node node3 = new Node("3", node2);
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4882);Node node4 = new Node("4", node3);
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4883);Node node5 = new Node("5", node4);

            __CLR4_5_23rh3rhlwzsccfb.R.inc(4884);Node actual = REVERSE_LINKED_LIST.reverse_linked_list(node5);
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4885);String outputStr = "";
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4886);while((((actual!=null)&&(__CLR4_5_23rh3rhlwzsccfb.R.iget(4887)!=0|true))||(__CLR4_5_23rh3rhlwzsccfb.R.iget(4888)==0&false))) {{
                __CLR4_5_23rh3rhlwzsccfb.R.inc(4889);outputStr+=actual.getValue();
                __CLR4_5_23rh3rhlwzsccfb.R.inc(4890);actual = actual.getSuccessor();
            }
            }__CLR4_5_23rh3rhlwzsccfb.R.inc(4891);assertEquals("12345", outputStr);
        } catch (IllegalArgumentException e) {
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4892);throw new IllegalArgumentException("Arguments are illegal!");
        }
    }finally{__CLR4_5_23rh3rhlwzsccfb.R.flushNeeded();}}

    /*
     * Case 2: 1-node list input
     * Expected Output: 0
     */
    @Test
    public void test2() {__CLR4_5_23rh3rhlwzsccfb.R.globalSliceStart(getClass().getName(),4893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b3rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23rh3rhlwzsccfb.R.rethrow($CLV_t2$);}finally{__CLR4_5_23rh3rhlwzsccfb.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.REVERSE_LINKED_LIST_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b3rx(){try{__CLR4_5_23rh3rhlwzsccfb.R.inc(4893);
        __CLR4_5_23rh3rhlwzsccfb.R.inc(4894);try {
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4895);Node node = new Node("0");
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4896);Node actual = REVERSE_LINKED_LIST.reverse_linked_list(node);
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4897);assertEquals("0", actual.getValue());
        } catch (IllegalArgumentException e) {
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4898);throw new IllegalArgumentException("Arguments are illegal!");
        }
    }finally{__CLR4_5_23rh3rhlwzsccfb.R.flushNeeded();}}


    /*
     * Case 3: null input
     * Expected Output: null
     */

    @Test
    public void test3() {__CLR4_5_23rh3rhlwzsccfb.R.globalSliceStart(getClass().getName(),4899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs3s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23rh3rhlwzsccfb.R.rethrow($CLV_t2$);}finally{__CLR4_5_23rh3rhlwzsccfb.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.REVERSE_LINKED_LIST_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs3s3(){try{__CLR4_5_23rh3rhlwzsccfb.R.inc(4899);
        __CLR4_5_23rh3rhlwzsccfb.R.inc(4900);try {
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4901);Node actual = REVERSE_LINKED_LIST.reverse_linked_list(null);
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4902);assertEquals(null, actual);
        } catch (IllegalArgumentException e) {
            __CLR4_5_23rh3rhlwzsccfb.R.inc(4903);throw new IllegalArgumentException("Arguments are illegal!");
        }
    }finally{__CLR4_5_23rh3rhlwzsccfb.R.flushNeeded();}}

}
