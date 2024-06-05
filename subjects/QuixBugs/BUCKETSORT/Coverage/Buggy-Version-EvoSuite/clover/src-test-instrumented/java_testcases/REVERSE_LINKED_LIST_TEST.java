/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases;
import java.util.*;

import java_programs.Node;
import java_programs.REVERSE_LINKED_LIST;

/**
 * Driver to test revers linked list.
 */
public class REVERSE_LINKED_LIST_TEST {static class __CLR4_5_22s02s0lwzs9sh8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,3643,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_22s02s0lwzs9sh8.R.inc(3600);
        // Case 1: 5-node list input
        // Expected Good Output: Reversed!  1 2 3 4 5
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3601);Node node1 = new Node("1");
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3602);Node node2 = new Node("2", node1);
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3603);Node node3 = new Node("3", node2);
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3604);Node node4 = new Node("4", node3);
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3605);Node node5 = new Node("5", node4);

        __CLR4_5_22s02s0lwzs9sh8.R.inc(3606);Node result = REVERSE_LINKED_LIST.reverse_linked_list(node5);

        __CLR4_5_22s02s0lwzs9sh8.R.inc(3607);if ((((result.getValue() == node1.getValue())&&(__CLR4_5_22s02s0lwzs9sh8.R.iget(3608)!=0|true))||(__CLR4_5_22s02s0lwzs9sh8.R.iget(3609)==0&false))) {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3610);System.out.printf("Reversed! ");
        } }else {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3611);System.out.printf("Not Reversed! ");
        }
        }__CLR4_5_22s02s0lwzs9sh8.R.inc(3612);while ((((result != null)&&(__CLR4_5_22s02s0lwzs9sh8.R.iget(3613)!=0|true))||(__CLR4_5_22s02s0lwzs9sh8.R.iget(3614)==0&false))) {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3615);System.out.printf("%s ", result.getValue());
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3616);result = result.getSuccessor();
        }
        }__CLR4_5_22s02s0lwzs9sh8.R.inc(3617);System.out.println();

        // Case 2: 1-node list input
        // Expected Output: Reversed!  0
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3618);Node node = new Node("0");
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3619);result = REVERSE_LINKED_LIST.reverse_linked_list(node);

        __CLR4_5_22s02s0lwzs9sh8.R.inc(3620);if ((((result.getValue() == node.getValue())&&(__CLR4_5_22s02s0lwzs9sh8.R.iget(3621)!=0|true))||(__CLR4_5_22s02s0lwzs9sh8.R.iget(3622)==0&false))) {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3623);System.out.printf("Reversed! ");
        } }else {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3624);System.out.printf("Not Reversed! ");
        }
        }__CLR4_5_22s02s0lwzs9sh8.R.inc(3625);while ((((result != null)&&(__CLR4_5_22s02s0lwzs9sh8.R.iget(3626)!=0|true))||(__CLR4_5_22s02s0lwzs9sh8.R.iget(3627)==0&false))) {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3628);System.out.printf("%s ", result.getValue());
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3629);result = result.getSuccessor();
        }
        }__CLR4_5_22s02s0lwzs9sh8.R.inc(3630);System.out.println();

        // Case 3: None input
        // Expected Output: None
        __CLR4_5_22s02s0lwzs9sh8.R.inc(3631);result = REVERSE_LINKED_LIST.reverse_linked_list(null);

        __CLR4_5_22s02s0lwzs9sh8.R.inc(3632);if ((((result == null)&&(__CLR4_5_22s02s0lwzs9sh8.R.iget(3633)!=0|true))||(__CLR4_5_22s02s0lwzs9sh8.R.iget(3634)==0&false))) {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3635);System.out.printf("Reversed! ");
        } }else {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3636);System.out.printf("Not Reversed! ");
        }
        }__CLR4_5_22s02s0lwzs9sh8.R.inc(3637);while ((((result != null)&&(__CLR4_5_22s02s0lwzs9sh8.R.iget(3638)!=0|true))||(__CLR4_5_22s02s0lwzs9sh8.R.iget(3639)==0&false))) {{
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3640);System.out.printf("%s ", result.getValue());
            __CLR4_5_22s02s0lwzs9sh8.R.inc(3641);result = result.getSuccessor();
        }
        }__CLR4_5_22s02s0lwzs9sh8.R.inc(3642);System.out.println();

    }finally{__CLR4_5_22s02s0lwzs9sh8.R.flushNeeded();}}
}