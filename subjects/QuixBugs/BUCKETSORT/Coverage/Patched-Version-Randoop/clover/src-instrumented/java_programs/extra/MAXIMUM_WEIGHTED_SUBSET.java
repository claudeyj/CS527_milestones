/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *///Corrected package name from quixey to java_programs.extra;
//package quixey;
package java_programs.extra;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class MAXIMUM_WEIGHTED_SUBSET {public static class __CLR4_5_219l19llwzsd5mf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468437071L,8589935092L,1667,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int maxSubsetWeight(int[] weights, int bound) {try{__CLR4_5_219l19llwzsd5mf.R.inc(1641);
        __CLR4_5_219l19llwzsd5mf.R.inc(1642);if ((((weights.length == 0)&&(__CLR4_5_219l19llwzsd5mf.R.iget(1643)!=0|true))||(__CLR4_5_219l19llwzsd5mf.R.iget(1644)==0&false))) {{
            __CLR4_5_219l19llwzsd5mf.R.inc(1645);return 0;
        }
        }__CLR4_5_219l19llwzsd5mf.R.inc(1646);int[][] maxWeight = new int[weights.length][bound];
        __CLR4_5_219l19llwzsd5mf.R.inc(1647);for (int w = 0; (((w <= bound)&&(__CLR4_5_219l19llwzsd5mf.R.iget(1648)!=0|true))||(__CLR4_5_219l19llwzsd5mf.R.iget(1649)==0&false)); w++)
            {__CLR4_5_219l19llwzsd5mf.R.inc(1650);maxWeight[0][w] = (((weights[0] <= w )&&(__CLR4_5_219l19llwzsd5mf.R.iget(1651)!=0|true))||(__CLR4_5_219l19llwzsd5mf.R.iget(1652)==0&false))? weights[0] : 0;

        }__CLR4_5_219l19llwzsd5mf.R.inc(1653);for (int i = 1; (((i < weights.length)&&(__CLR4_5_219l19llwzsd5mf.R.iget(1654)!=0|true))||(__CLR4_5_219l19llwzsd5mf.R.iget(1655)==0&false)); i++) {{
            __CLR4_5_219l19llwzsd5mf.R.inc(1656);for (int w = 0; (((w <= bound)&&(__CLR4_5_219l19llwzsd5mf.R.iget(1657)!=0|true))||(__CLR4_5_219l19llwzsd5mf.R.iget(1658)==0&false)); w++) {{
                __CLR4_5_219l19llwzsd5mf.R.inc(1659);if ((((weights[i] > w)&&(__CLR4_5_219l19llwzsd5mf.R.iget(1660)!=0|true))||(__CLR4_5_219l19llwzsd5mf.R.iget(1661)==0&false))) {{
                    __CLR4_5_219l19llwzsd5mf.R.inc(1662);maxWeight[i][w] = maxWeight[i-1][w];
                } }else {{
                    __CLR4_5_219l19llwzsd5mf.R.inc(1663);int include = weights[i] + maxWeight[i-1][w - weights[i]];
                    __CLR4_5_219l19llwzsd5mf.R.inc(1664);int exclude = maxWeight[i-1][w];
                    __CLR4_5_219l19llwzsd5mf.R.inc(1665);maxWeight[i][w] = Math.max(include, exclude);
                }
            }}
        }}
        }__CLR4_5_219l19llwzsd5mf.R.inc(1666);return maxWeight[weights.length-1][bound];
    }finally{__CLR4_5_219l19llwzsd5mf.R.flushNeeded();}}
}
