/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.DETECT_CYCLE;
import java_programs.Node;


/**
 * Driver for testing DETECT_CYCLE class
 */
public class DETECT_CYCLE_TEST {static class __CLR4_5_22kz2kzlwzscbf0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,3383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22kz2kzlwzscbf0.R.inc(3347);
        // Case 1: 5-node list input with no cycle
        // Expected Output: Cycle not detected!
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3348);Node node1 = new Node("1");
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3349);Node node2 = new Node("2", node1);
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3350);Node node3 = new Node("3", node2);
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3351);Node node4 = new Node("4", node3);
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3352);Node node5 = new Node("5", node4);

        __CLR4_5_22kz2kzlwzscbf0.R.inc(3353);if ((((DETECT_CYCLE.detect_cycle(node5))&&(__CLR4_5_22kz2kzlwzscbf0.R.iget(3354)!=0|true))||(__CLR4_5_22kz2kzlwzscbf0.R.iget(3355)==0&false))) {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3356);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3357);System.out.println("Cycle not detected!");
        }

        // Case 2: 5-node list input with cycle
        // Expected Output: Cycle detected!
        }__CLR4_5_22kz2kzlwzscbf0.R.inc(3358);node1.setSuccessor(node5);

        __CLR4_5_22kz2kzlwzscbf0.R.inc(3359);if ((((DETECT_CYCLE.detect_cycle(node5))&&(__CLR4_5_22kz2kzlwzscbf0.R.iget(3360)!=0|true))||(__CLR4_5_22kz2kzlwzscbf0.R.iget(3361)==0&false))) {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3362);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3363);System.out.println("Cycle not detected!");
        }

        // Case 3: 2-node list with cycle
        //  Expected Output: Cycle detected!
        }__CLR4_5_22kz2kzlwzscbf0.R.inc(3364);node1.setSuccessor(node2);
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3365);if ((((DETECT_CYCLE.detect_cycle(node2))&&(__CLR4_5_22kz2kzlwzscbf0.R.iget(3366)!=0|true))||(__CLR4_5_22kz2kzlwzscbf0.R.iget(3367)==0&false))) {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3368);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3369);System.out.println("Cycle not detected!");
        }

        // Case 4: 2-node list with no cycle
        //  Expected Output: Cycle not detected!
        }__CLR4_5_22kz2kzlwzscbf0.R.inc(3370);Node node6 = new Node("6");
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3371);Node node7 = new Node("7", node6);
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3372);if ((((DETECT_CYCLE.detect_cycle(node7))&&(__CLR4_5_22kz2kzlwzscbf0.R.iget(3373)!=0|true))||(__CLR4_5_22kz2kzlwzscbf0.R.iget(3374)==0&false))) {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3375);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3376);System.out.println("Cycle not detected!");
        }

        // Case 5: 1-node list
        // Expected Output: Cycle not detected!
        }__CLR4_5_22kz2kzlwzscbf0.R.inc(3377);Node node = new Node("0");
        __CLR4_5_22kz2kzlwzscbf0.R.inc(3378);if ((((DETECT_CYCLE.detect_cycle(node))&&(__CLR4_5_22kz2kzlwzscbf0.R.iget(3379)!=0|true))||(__CLR4_5_22kz2kzlwzscbf0.R.iget(3380)==0&false))) {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3381);System.out.println("Cycle detected!");
        } }else {{
            __CLR4_5_22kz2kzlwzscbf0.R.inc(3382);System.out.println("Cycle not detected!");
        }
    }}finally{__CLR4_5_22kz2kzlwzscbf0.R.flushNeeded();}}
}