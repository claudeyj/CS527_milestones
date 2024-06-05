/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *///Corrected package name from quixey to java_programs.extra;
//package quixey;
package java_programs.extra;
import java.util.*;
import java.io.*;
import java.awt.Point;
import static java.lang.Math.*;

//Corrected class from from NESTED_PARENS to NESTED_PARENS_orig
public class NESTED_PARENS_orig {public static class __CLR4_5_21bd1bdlwzsca93{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468396533L,8589935092L,1736,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_21bd1bdlwzsca93.R.inc(1705);
        __CLR4_5_21bd1bdlwzsca93.R.inc(1706);Scanner in = new Scanner(System.in);
        __CLR4_5_21bd1bdlwzsca93.R.inc(1707);CAS: while((((in.hasNext())&&(__CLR4_5_21bd1bdlwzsca93.R.iget(1708)!=0|true))||(__CLR4_5_21bd1bdlwzsca93.R.iget(1709)==0&false))) {{
            __CLR4_5_21bd1bdlwzsca93.R.inc(1710);String parens = in.next();
            __CLR4_5_21bd1bdlwzsca93.R.inc(1711);int depth = 0;
            __CLR4_5_21bd1bdlwzsca93.R.inc(1712);for(int i=0; (((i < parens.length())&&(__CLR4_5_21bd1bdlwzsca93.R.iget(1713)!=0|true))||(__CLR4_5_21bd1bdlwzsca93.R.iget(1714)==0&false)); i++) {{
                __CLR4_5_21bd1bdlwzsca93.R.inc(1715);if((((parens.charAt(i) == '(')&&(__CLR4_5_21bd1bdlwzsca93.R.iget(1716)!=0|true))||(__CLR4_5_21bd1bdlwzsca93.R.iget(1717)==0&false))) {{
                    __CLR4_5_21bd1bdlwzsca93.R.inc(1718);depth++;
                } }else {{
                    __CLR4_5_21bd1bdlwzsca93.R.inc(1719);depth--;
                    __CLR4_5_21bd1bdlwzsca93.R.inc(1720);if((((depth < 0)&&(__CLR4_5_21bd1bdlwzsca93.R.iget(1721)!=0|true))||(__CLR4_5_21bd1bdlwzsca93.R.iget(1722)==0&false))) {{
                        __CLR4_5_21bd1bdlwzsca93.R.inc(1723);System.out.println("0");
                        __CLR4_5_21bd1bdlwzsca93.R.inc(1724);continue CAS;
                    }
                }}
            }}
            }__CLR4_5_21bd1bdlwzsca93.R.inc(1725);System.out.println((((depth == 0 )&&(__CLR4_5_21bd1bdlwzsca93.R.iget(1726)!=0|true))||(__CLR4_5_21bd1bdlwzsca93.R.iget(1727)==0&false))? "1" : "0");
        }
    }}finally{__CLR4_5_21bd1bdlwzsca93.R.flushNeeded();}}

    public static <T> List<T> list() {try{__CLR4_5_21bd1bdlwzsca93.R.inc(1728); __CLR4_5_21bd1bdlwzsca93.R.inc(1729);return new ArrayList<T>(); }finally{__CLR4_5_21bd1bdlwzsca93.R.flushNeeded();}}
    public static <K,V> Map<K,V> map() {try{__CLR4_5_21bd1bdlwzsca93.R.inc(1730); __CLR4_5_21bd1bdlwzsca93.R.inc(1731);return new HashMap<K,V>(); }finally{__CLR4_5_21bd1bdlwzsca93.R.flushNeeded();}}
    public static int i(String s) {try{__CLR4_5_21bd1bdlwzsca93.R.inc(1732); __CLR4_5_21bd1bdlwzsca93.R.inc(1733);return Integer.parseInt(s); }finally{__CLR4_5_21bd1bdlwzsca93.R.flushNeeded();}}
    public static long l(String s) {try{__CLR4_5_21bd1bdlwzsca93.R.inc(1734); __CLR4_5_21bd1bdlwzsca93.R.inc(1735);return Long.parseLong(s); }finally{__CLR4_5_21bd1bdlwzsca93.R.flushNeeded();}}
}
