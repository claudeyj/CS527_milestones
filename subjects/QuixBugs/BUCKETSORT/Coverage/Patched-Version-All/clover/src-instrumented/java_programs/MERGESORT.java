/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class MERGESORT {public static class __CLR4_5_2vlvllwzsdwkp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468473017L,8589935092L,1168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {try{__CLR4_5_2vlvllwzsdwkp.R.inc(1137);
    //System.out.println(String.valueOf(left));
    //System.out.println(String.valueOf(right));
    //System.out.println(String.valueOf(left.getClass()));
    //System.out.println(String.valueOf(left.get(0)));
    //System.out.println(String.valueOf(left.get(0).getClass()));
        __CLR4_5_2vlvllwzsdwkp.R.inc(1138);ArrayList<Integer> result = new ArrayList<Integer>(100);
        __CLR4_5_2vlvllwzsdwkp.R.inc(1139);int i = 0;
        __CLR4_5_2vlvllwzsdwkp.R.inc(1140);int j = 0;

        __CLR4_5_2vlvllwzsdwkp.R.inc(1141);while ((((i < left.size() && j < right.size())&&(__CLR4_5_2vlvllwzsdwkp.R.iget(1142)!=0|true))||(__CLR4_5_2vlvllwzsdwkp.R.iget(1143)==0&false))) {{
            __CLR4_5_2vlvllwzsdwkp.R.inc(1144);if ((((left.get(i) <= right.get(j))&&(__CLR4_5_2vlvllwzsdwkp.R.iget(1145)!=0|true))||(__CLR4_5_2vlvllwzsdwkp.R.iget(1146)==0&false))) {{
                __CLR4_5_2vlvllwzsdwkp.R.inc(1147);result.add(left.get(i));
                __CLR4_5_2vlvllwzsdwkp.R.inc(1148);i++;
            } }else {{
                __CLR4_5_2vlvllwzsdwkp.R.inc(1149);result.add(right.get(j));
                __CLR4_5_2vlvllwzsdwkp.R.inc(1150);j++;
            }
        }}
        }__CLR4_5_2vlvllwzsdwkp.R.inc(1151);result.addAll((((left.subList(i,left.size()).isEmpty() )&&(__CLR4_5_2vlvllwzsdwkp.R.iget(1152)!=0|true))||(__CLR4_5_2vlvllwzsdwkp.R.iget(1153)==0&false))? right.subList(j, right.size()) : left.subList(i, left.size()));
        __CLR4_5_2vlvllwzsdwkp.R.inc(1154);return result;
    }finally{__CLR4_5_2vlvllwzsdwkp.R.flushNeeded();}}

    public static ArrayList<Integer> mergesort(ArrayList<Integer> arr) {try{__CLR4_5_2vlvllwzsdwkp.R.inc(1155);
        __CLR4_5_2vlvllwzsdwkp.R.inc(1156);if ((((arr.size() == 0)&&(__CLR4_5_2vlvllwzsdwkp.R.iget(1157)!=0|true))||(__CLR4_5_2vlvllwzsdwkp.R.iget(1158)==0&false))) {{ // <= 1 in correct version
            __CLR4_5_2vlvllwzsdwkp.R.inc(1159);return arr;
        } }else {{
            __CLR4_5_2vlvllwzsdwkp.R.inc(1160);int middle = arr.size() / 2;
            __CLR4_5_2vlvllwzsdwkp.R.inc(1161);ArrayList<Integer> left = new ArrayList<Integer>(100);
            __CLR4_5_2vlvllwzsdwkp.R.inc(1162);left.addAll(arr.subList(0,middle));
            __CLR4_5_2vlvllwzsdwkp.R.inc(1163);left = mergesort(left);
            __CLR4_5_2vlvllwzsdwkp.R.inc(1164);ArrayList<Integer> right = new ArrayList<Integer>(100);
            __CLR4_5_2vlvllwzsdwkp.R.inc(1165);right.addAll(arr.subList(middle, arr.size()));
            __CLR4_5_2vlvllwzsdwkp.R.inc(1166);right = mergesort(right);

            __CLR4_5_2vlvllwzsdwkp.R.inc(1167);return merge(left, right);
        }
    }}finally{__CLR4_5_2vlvllwzsdwkp.R.flushNeeded();}}
}
