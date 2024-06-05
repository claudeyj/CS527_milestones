/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


/**
 * Methods to format the output from the subject programs.
 *
 * @author Matias Martinez
 *
 */
public class QuixFixOracleHelper {public static class __CLR4_5_24rk4rklwzsd8hc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,6210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static String format(Object out, boolean cutDecimal) {try{__CLR4_5_24rk4rklwzsd8hc.R.inc(6176);
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6177);Object jsonOutObtained = transformToString(out, cutDecimal);
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6178);String obtained = removeSymbols(jsonOutObtained.toString());
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6179);return obtained;
    }finally{__CLR4_5_24rk4rklwzsd8hc.R.flushNeeded();}}

    public static String removeSymbols(String r) {try{__CLR4_5_24rk4rklwzsd8hc.R.inc(6180);

        __CLR4_5_24rk4rklwzsd8hc.R.inc(6181);r = r.replaceAll("\\(", "[").replaceAll("\\)", "]").replace(" ", "").replaceAll("\"", "");
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6182);return r;
    }finally{__CLR4_5_24rk4rklwzsd8hc.R.flushNeeded();}}

    public static String transformToString(Object out, boolean mustRemoveDecimal) {try{__CLR4_5_24rk4rklwzsd8hc.R.inc(6183);
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6184);if ((((out instanceof Iterable)&&(__CLR4_5_24rk4rklwzsd8hc.R.iget(6185)!=0|true))||(__CLR4_5_24rk4rklwzsd8hc.R.iget(6186)==0&false))) {{
            __CLR4_5_24rk4rklwzsd8hc.R.inc(6187);String r = "[";
            __CLR4_5_24rk4rklwzsd8hc.R.inc(6188);for (Object o : (Iterable) out) {{
                __CLR4_5_24rk4rklwzsd8hc.R.inc(6189);r += transformToString(o, mustRemoveDecimal) + ",";
            }
            }__CLR4_5_24rk4rklwzsd8hc.R.inc(6190);if ((((r.length() >= 2)&&(__CLR4_5_24rk4rklwzsd8hc.R.iget(6191)!=0|true))||(__CLR4_5_24rk4rklwzsd8hc.R.iget(6192)==0&false))) {{
                __CLR4_5_24rk4rklwzsd8hc.R.inc(6193);r = r.trim().substring(0, r.length() - 1);
            }

            }__CLR4_5_24rk4rklwzsd8hc.R.inc(6194);return r + "]";
        } }else {{
            __CLR4_5_24rk4rklwzsd8hc.R.inc(6195);String s = "";
            __CLR4_5_24rk4rklwzsd8hc.R.inc(6196);if ((((out instanceof String && !isInteger(out.toString()))&&(__CLR4_5_24rk4rklwzsd8hc.R.iget(6197)!=0|true))||(__CLR4_5_24rk4rklwzsd8hc.R.iget(6198)==0&false)))
                {__CLR4_5_24rk4rklwzsd8hc.R.inc(6199);s += out.toString();
            }else {{
                __CLR4_5_24rk4rklwzsd8hc.R.inc(6200);s = ((((mustRemoveDecimal && out.toString().endsWith(".0")
                        )&&(__CLR4_5_24rk4rklwzsd8hc.R.iget(6201)!=0|true))||(__CLR4_5_24rk4rklwzsd8hc.R.iget(6202)==0&false))? out.toString().substring(0, out.toString().length() - 2) : out.toString());
            }
            }__CLR4_5_24rk4rklwzsd8hc.R.inc(6203);return s;
        }

    }}finally{__CLR4_5_24rk4rklwzsd8hc.R.flushNeeded();}}

    public static boolean isInteger(String s) {try{__CLR4_5_24rk4rklwzsd8hc.R.inc(6204);
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6205);boolean isValidInteger = false;
        __CLR4_5_24rk4rklwzsd8hc.R.inc(6206);try {
            __CLR4_5_24rk4rklwzsd8hc.R.inc(6207);Integer.parseInt(s);
            __CLR4_5_24rk4rklwzsd8hc.R.inc(6208);isValidInteger = true;
        } catch (NumberFormatException ex) {
        }

        __CLR4_5_24rk4rklwzsd8hc.R.inc(6209);return isValidInteger;
    }finally{__CLR4_5_24rk4rklwzsd8hc.R.flushNeeded();}}
}
