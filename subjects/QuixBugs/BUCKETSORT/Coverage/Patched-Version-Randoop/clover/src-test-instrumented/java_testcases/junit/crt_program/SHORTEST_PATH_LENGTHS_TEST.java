/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import correct_java_programs.SHORTEST_PATH_LENGTHS;


public class SHORTEST_PATH_LENGTHS_TEST {static class __CLR4_5_24ux4uxlwzsd8i8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,6347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Case 1: Basic graph input.
    @Test
    public void test1() {__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceStart(getClass().getName(),6297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu4ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ux4uxlwzsd8i8.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATH_LENGTHS_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu4ux(){try{__CLR4_5_24ux4uxlwzsd8i8.R.inc(6297);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6298);Map<List<Integer>, Integer> graph = new HashMap<>();
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6299);graph.put(new ArrayList<Integer>(Arrays.asList(0, 2)), 3);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6300);graph.put(new ArrayList<Integer>(Arrays.asList(0, 5)), 5);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6301);graph.put(new ArrayList<Integer>(Arrays.asList(2, 1)), -2);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6302);graph.put(new ArrayList<Integer>(Arrays.asList(2, 3)), 7);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6303);graph.put(new ArrayList<Integer>(Arrays.asList(2, 4)), 4);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6304);graph.put(new ArrayList<Integer>(Arrays.asList(3, 4)), -5);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6305);graph.put(new ArrayList<Integer>(Arrays.asList(4, 5)), -1);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6306);Map<List<Integer>, Integer> length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(6, graph);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6307);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_24ux4uxlwzsd8i8.R.inc(6308);if((((edge.get(0)==3&&edge.get(1)==3)&&(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6309)!=0|true))||(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6310)==0&false))) {{
                //Correct (3,3) 0  and bad (3,3) -10
                __CLR4_5_24ux4uxlwzsd8i8.R.inc(6311);assertEquals((Integer)0,length_by_path.get(edge));
            }
        }}

    }}finally{__CLR4_5_24ux4uxlwzsd8i8.R.flushNeeded();}}

    // Case 2: Linear graph input.
    @Test
    public void test2() {__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceStart(getClass().getName(),6312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b4vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ux4uxlwzsd8i8.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATH_LENGTHS_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b4vc(){try{__CLR4_5_24ux4uxlwzsd8i8.R.inc(6312);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6313);Map<List<Integer>, Integer> graph2 = new HashMap<>();
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6314);graph2.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6315);graph2.put(new ArrayList<Integer>(Arrays.asList(1, 2)), 5);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6316);graph2.put(new ArrayList<Integer>(Arrays.asList(2, 3)), -2);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6317);graph2.put(new ArrayList<Integer>(Arrays.asList(3, 4)), 7);

        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6318);Map<List<Integer>, Integer> length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(5, graph2);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6319);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_24ux4uxlwzsd8i8.R.inc(6320);if((((edge.get(0)==1&&edge.get(1)==4)&&(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6321)!=0|true))||(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6322)==0&false))) {{
                //Correct (1,4) 10  and bad (1,4) inf
                __CLR4_5_24ux4uxlwzsd8i8.R.inc(6323);assertEquals((Integer)10,length_by_path.get(edge));
            }
        }}
    }}finally{__CLR4_5_24ux4uxlwzsd8i8.R.flushNeeded();}}

    // Case 3: Disconnected graphs input.
    @Test
    public void test3() {__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceStart(getClass().getName(),6324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs4vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ux4uxlwzsd8i8.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATH_LENGTHS_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs4vo(){try{__CLR4_5_24ux4uxlwzsd8i8.R.inc(6324);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6325);Map<List<Integer>, Integer> graph3 = new HashMap<>();
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6326);graph3.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6327);graph3.put(new ArrayList<Integer>(Arrays.asList(2, 3)), 5);

        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6328);Map<List<Integer>, Integer> length_by_path = new HashMap<>();
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6329);length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(4, graph3);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6330);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_24ux4uxlwzsd8i8.R.inc(6331);if((((edge.get(0)==1&&edge.get(1)==0)&&(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6332)!=0|true))||(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6333)==0&false))) {{
                //Correct (1,0) inf  and bad (1,0) 3
                __CLR4_5_24ux4uxlwzsd8i8.R.inc(6334);assertEquals((Integer)99999,length_by_path.get(edge));
            }
        }}
    }}finally{__CLR4_5_24ux4uxlwzsd8i8.R.flushNeeded();}}

    @Test
    // Case 4: Strongly connected graph input.
    public void test4s() {__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceStart(getClass().getName(),6335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htdseg4vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ux4uxlwzsd8i8.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ux4uxlwzsd8i8.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SHORTEST_PATH_LENGTHS_TEST.test4s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htdseg4vz(){try{__CLR4_5_24ux4uxlwzsd8i8.R.inc(6335);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6336);Map<List<Integer>, Integer> graph4 = new HashMap<>();
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6337);graph4.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6338);graph4.put(new ArrayList<Integer>(Arrays.asList(1, 2)), 5);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6339);graph4.put(new ArrayList<Integer>(Arrays.asList(2, 0)), -1);

        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6340);Map<List<Integer>, Integer> length_by_path = new HashMap<>();
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6341);length_by_path = SHORTEST_PATH_LENGTHS.shortest_path_lengths(3, graph4);
        __CLR4_5_24ux4uxlwzsd8i8.R.inc(6342);for (List<Integer> edge : length_by_path.keySet()) {{
            __CLR4_5_24ux4uxlwzsd8i8.R.inc(6343);if((((edge.get(0)==2&&edge.get(1)==1)&&(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6344)!=0|true))||(__CLR4_5_24ux4uxlwzsd8i8.R.iget(6345)==0&false))) {{
                //Correct (2,1) 2  and bad (2,1) 1
                __CLR4_5_24ux4uxlwzsd8i8.R.inc(6346);assertEquals((Integer)2,length_by_path.get(edge));
            }
        }}
    }}finally{__CLR4_5_24ux4uxlwzsd8i8.R.flushNeeded();}}

}
