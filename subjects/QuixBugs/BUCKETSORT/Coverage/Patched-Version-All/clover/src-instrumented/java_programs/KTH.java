/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;
/*

 */
public class KTH {public static class __CLR4_5_2s4s4lwzsdwie{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468473017L,8589935092L,1037,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Integer kth(ArrayList<Integer> arr, int k) {try{__CLR4_5_2s4s4lwzsdwie.R.inc(1012);
        __CLR4_5_2s4s4lwzsdwie.R.inc(1013);int pivot = arr.get(0);
        __CLR4_5_2s4s4lwzsdwie.R.inc(1014);ArrayList<Integer> below, above;
        __CLR4_5_2s4s4lwzsdwie.R.inc(1015);below = new ArrayList<Integer>(arr.size());
        __CLR4_5_2s4s4lwzsdwie.R.inc(1016);above = new ArrayList<Integer>(arr.size());
        __CLR4_5_2s4s4lwzsdwie.R.inc(1017);for (Integer x : arr) {{
            __CLR4_5_2s4s4lwzsdwie.R.inc(1018);if ((((x < pivot)&&(__CLR4_5_2s4s4lwzsdwie.R.iget(1019)!=0|true))||(__CLR4_5_2s4s4lwzsdwie.R.iget(1020)==0&false))) {{
                __CLR4_5_2s4s4lwzsdwie.R.inc(1021);below.add(x);
            } }else {__CLR4_5_2s4s4lwzsdwie.R.inc(1022);if ((((x > pivot)&&(__CLR4_5_2s4s4lwzsdwie.R.iget(1023)!=0|true))||(__CLR4_5_2s4s4lwzsdwie.R.iget(1024)==0&false))) {{
                __CLR4_5_2s4s4lwzsdwie.R.inc(1025);above.add(x);
            }
        }}}

        }__CLR4_5_2s4s4lwzsdwie.R.inc(1026);int num_less = below.size();
        __CLR4_5_2s4s4lwzsdwie.R.inc(1027);int num_lessoreq = arr.size() - above.size();
        __CLR4_5_2s4s4lwzsdwie.R.inc(1028);if ((((k < num_less)&&(__CLR4_5_2s4s4lwzsdwie.R.iget(1029)!=0|true))||(__CLR4_5_2s4s4lwzsdwie.R.iget(1030)==0&false))) {{
            __CLR4_5_2s4s4lwzsdwie.R.inc(1031);return kth(below, k);
        } }else {__CLR4_5_2s4s4lwzsdwie.R.inc(1032);if ((((k >= num_lessoreq)&&(__CLR4_5_2s4s4lwzsdwie.R.iget(1033)!=0|true))||(__CLR4_5_2s4s4lwzsdwie.R.iget(1034)==0&false))) {{
            __CLR4_5_2s4s4lwzsdwie.R.inc(1035);return kth(above, k);
        } }else {{
            __CLR4_5_2s4s4lwzsdwie.R.inc(1036);return pivot;
        }
    }}}finally{__CLR4_5_2s4s4lwzsdwie.R.flushNeeded();}}
}
