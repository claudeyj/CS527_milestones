/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package correct_java_programs;
import java.util.*;
import java.util.function.BinaryOperator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class RPN_EVAL {public static class __CLR4_5_2fhfhlwzsc8vw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468396533L,8589935092L,577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Double rpn_eval(ArrayList tokens) {try{__CLR4_5_2fhfhlwzsc8vw.R.inc(557);
        __CLR4_5_2fhfhlwzsc8vw.R.inc(558);Map<String, BinaryOperator<Double>> op = new HashMap<String, BinaryOperator<Double>>();
        __CLR4_5_2fhfhlwzsc8vw.R.inc(559);op.put("+", (a, b) -> a + b);
        __CLR4_5_2fhfhlwzsc8vw.R.inc(560);op.put("-", (a, b) -> a - b);
        __CLR4_5_2fhfhlwzsc8vw.R.inc(561);op.put("*", (a, b) -> a * b);
        __CLR4_5_2fhfhlwzsc8vw.R.inc(562);op.put("/", (a, b) -> a / b);


        __CLR4_5_2fhfhlwzsc8vw.R.inc(563);Stack stack = new Stack();

        __CLR4_5_2fhfhlwzsc8vw.R.inc(564);for (Object token : tokens) {{
            __CLR4_5_2fhfhlwzsc8vw.R.inc(565);if ((((Double.class.isInstance(token))&&(__CLR4_5_2fhfhlwzsc8vw.R.iget(566)!=0|true))||(__CLR4_5_2fhfhlwzsc8vw.R.iget(567)==0&false))) {{
                __CLR4_5_2fhfhlwzsc8vw.R.inc(568);stack.push((Double) token);
            } }else {{
                __CLR4_5_2fhfhlwzsc8vw.R.inc(569);token = (String) token;
                __CLR4_5_2fhfhlwzsc8vw.R.inc(570);Double a = (Double) stack.pop();
                __CLR4_5_2fhfhlwzsc8vw.R.inc(571);Double b = (Double) stack.pop();
                __CLR4_5_2fhfhlwzsc8vw.R.inc(572);Double c = 0.0;
                __CLR4_5_2fhfhlwzsc8vw.R.inc(573);BinaryOperator<Double> bin_op = op.get(token);
                __CLR4_5_2fhfhlwzsc8vw.R.inc(574);c = bin_op.apply(b,a);
                __CLR4_5_2fhfhlwzsc8vw.R.inc(575);stack.push(c);
            }
        }}

        }__CLR4_5_2fhfhlwzsc8vw.R.inc(576);return (Double) stack.pop();
    }finally{__CLR4_5_2fhfhlwzsc8vw.R.flushNeeded();}}
}