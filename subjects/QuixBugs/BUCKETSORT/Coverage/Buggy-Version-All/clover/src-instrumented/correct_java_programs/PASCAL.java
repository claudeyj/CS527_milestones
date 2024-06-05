/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class PASCAL {public static class __CLR4_5_2cvcvlwzsbbul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468353630L,8589935092L,489,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<ArrayList<Integer>> pascal(int n) {try{__CLR4_5_2cvcvlwzsbbul.R.inc(463);
        __CLR4_5_2cvcvlwzsbbul.R.inc(464);ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
        __CLR4_5_2cvcvlwzsbbul.R.inc(465);ArrayList<Integer> init = new ArrayList<Integer>();
        __CLR4_5_2cvcvlwzsbbul.R.inc(466);init.add(1);
        __CLR4_5_2cvcvlwzsbbul.R.inc(467);rows.add(init);

        __CLR4_5_2cvcvlwzsbbul.R.inc(468);for (int r=1; (((r<n)&&(__CLR4_5_2cvcvlwzsbbul.R.iget(469)!=0|true))||(__CLR4_5_2cvcvlwzsbbul.R.iget(470)==0&false)); r++) {{
            __CLR4_5_2cvcvlwzsbbul.R.inc(471);ArrayList<Integer> row = new ArrayList<Integer>();
            __CLR4_5_2cvcvlwzsbbul.R.inc(472);for (int c=0; (((c<r+1)&&(__CLR4_5_2cvcvlwzsbbul.R.iget(473)!=0|true))||(__CLR4_5_2cvcvlwzsbbul.R.iget(474)==0&false)); c++) {{
                __CLR4_5_2cvcvlwzsbbul.R.inc(475);int upleft, upright;
                __CLR4_5_2cvcvlwzsbbul.R.inc(476);if ((((c > 0)&&(__CLR4_5_2cvcvlwzsbbul.R.iget(477)!=0|true))||(__CLR4_5_2cvcvlwzsbbul.R.iget(478)==0&false))) {{
                    __CLR4_5_2cvcvlwzsbbul.R.inc(479);upleft = rows.get(r-1).get(c-1);
                } }else {{
                    __CLR4_5_2cvcvlwzsbbul.R.inc(480);upleft = 0;
                }
                }__CLR4_5_2cvcvlwzsbbul.R.inc(481);if ((((c < r)&&(__CLR4_5_2cvcvlwzsbbul.R.iget(482)!=0|true))||(__CLR4_5_2cvcvlwzsbbul.R.iget(483)==0&false))) {{
                    __CLR4_5_2cvcvlwzsbbul.R.inc(484);upright = rows.get(r-1).get(c);
                } }else {{
                    __CLR4_5_2cvcvlwzsbbul.R.inc(485);upright = 0;
                }
                }__CLR4_5_2cvcvlwzsbbul.R.inc(486);row.add(upleft+upright);
            }
            }__CLR4_5_2cvcvlwzsbbul.R.inc(487);rows.add(row);
        }

        }__CLR4_5_2cvcvlwzsbbul.R.inc(488);return rows;
    }finally{__CLR4_5_2cvcvlwzsbbul.R.flushNeeded();}}
}
