/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;
//import com.google.guava.Lists;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class NEXT_PERMUTATION {public static class __CLR4_5_2xvxvlwzsd5gs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468437071L,8589935092L,1248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<Integer> next_permutation(ArrayList<Integer> perm) {try{__CLR4_5_2xvxvlwzsd5gs.R.inc(1219);
        __CLR4_5_2xvxvlwzsd5gs.R.inc(1220);for (int i=perm.size()-2; (((i!=-1)&&(__CLR4_5_2xvxvlwzsd5gs.R.iget(1221)!=0|true))||(__CLR4_5_2xvxvlwzsd5gs.R.iget(1222)==0&false)); i--) {{
            __CLR4_5_2xvxvlwzsd5gs.R.inc(1223);if ((((perm.get(i) < perm.get(i+1))&&(__CLR4_5_2xvxvlwzsd5gs.R.iget(1224)!=0|true))||(__CLR4_5_2xvxvlwzsd5gs.R.iget(1225)==0&false))) {{
                __CLR4_5_2xvxvlwzsd5gs.R.inc(1226);for (int j=perm.size()-1; (((j!=i)&&(__CLR4_5_2xvxvlwzsd5gs.R.iget(1227)!=0|true))||(__CLR4_5_2xvxvlwzsd5gs.R.iget(1228)==0&false)); j--) {{
                    __CLR4_5_2xvxvlwzsd5gs.R.inc(1229);if ((((perm.get(j) < perm.get(i))&&(__CLR4_5_2xvxvlwzsd5gs.R.iget(1230)!=0|true))||(__CLR4_5_2xvxvlwzsd5gs.R.iget(1231)==0&false))) {{
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1232);ArrayList<Integer> next_perm = perm;
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1233);int temp_j = perm.get(j);
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1234);int temp_i = perm.get(i);
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1235);next_perm.set(i,temp_j);
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1236);next_perm.set(j,temp_i);

                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1237);ArrayList<Integer> reversed = new ArrayList<Integer>(100);
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1238);for (int k=next_perm.size()-1; (((k!=i)&&(__CLR4_5_2xvxvlwzsd5gs.R.iget(1239)!=0|true))||(__CLR4_5_2xvxvlwzsd5gs.R.iget(1240)==0&false)); k--) {{
                            __CLR4_5_2xvxvlwzsd5gs.R.inc(1241);reversed.add(next_perm.get(k));
                        }

                        }__CLR4_5_2xvxvlwzsd5gs.R.inc(1242);int q = i + 1;
                        __CLR4_5_2xvxvlwzsd5gs.R.inc(1243);for (Integer replace : reversed) {{
                            __CLR4_5_2xvxvlwzsd5gs.R.inc(1244);next_perm.set(q, replace);
                            __CLR4_5_2xvxvlwzsd5gs.R.inc(1245);q++;
                        }

                        }__CLR4_5_2xvxvlwzsd5gs.R.inc(1246);return next_perm;
                    }
                }}
            }}
        }}

        }__CLR4_5_2xvxvlwzsd5gs.R.inc(1247);return new ArrayList<Integer>();
    }finally{__CLR4_5_2xvxvlwzsd5gs.R.flushNeeded();}}
}
