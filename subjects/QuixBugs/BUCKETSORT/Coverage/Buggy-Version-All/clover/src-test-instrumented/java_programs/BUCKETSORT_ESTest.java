/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 02:05:54 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java_programs.BUCKETSORT;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BUCKETSORT_ESTest extends BUCKETSORT_ESTest_scaffolding {static class __CLR4_5_22j02j0lwzsbdwz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,3316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2156cmd2j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2156cmd2j0() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3276);
      // Undeclared exception!
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3277);try { 
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3278);BUCKETSORT.bucketsort((ArrayList<Integer>) null, 1);
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3279);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_5_22j02j0lwzsbdwz.R.inc(3280);verifyException("java_programs.BUCKETSORT", e);
      }
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu2j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu2j5() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3281);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3282);ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3283);Integer integer0 = new Integer(1341);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3284);arrayList0.add(integer0);
      // Undeclared exception!
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3285);try { 
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3286);BUCKETSORT.bucketsort(arrayList0, 1341);
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3287);fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1341, Size: 1341
         //
         __CLR4_5_22j02j0lwzsbdwz.R.inc(3288);verifyException("java.util.ArrayList", e);
      }
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b2jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b2jd() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3289);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3290);ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3291);try { 
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3292);BUCKETSORT.bucketsort(arrayList0, (-389));
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3293);fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // List length = -389
         //
         __CLR4_5_22j02j0lwzsbdwz.R.inc(3294);verifyException("java.util.Collections", e);
      }
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs2jj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs2jj() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3295);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3296);ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3297);Integer integer0 = new Integer((-1899));
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3298);arrayList0.add(integer0);
      // Undeclared exception!
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3299);try { 
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3300);BUCKETSORT.bucketsort(arrayList0, 303);
        __CLR4_5_22j02j0lwzsbdwz.R.inc(3301);fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s92jq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s92jq() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3302);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3303);ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3304);Integer integer0 = new Integer(1);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3305);arrayList0.add(integer0);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3306);ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 1585);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3307);assertFalse(arrayList1.contains(1));
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3308);assertFalse(arrayList1.isEmpty());
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq2jx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq2jx() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3309);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3310);ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3311);ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 1585);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3312);assertNotSame(arrayList1, arrayList0);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3313);assertEquals(0, arrayList1.size());
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {__CLR4_5_22j02j0lwzsbdwz.R.globalSliceStart(getClass().getName(),3314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d72k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22j02j0lwzsbdwz.R.rethrow($CLV_t2$);}finally{__CLR4_5_22j02j0lwzsbdwz.R.globalSliceEnd(getClass().getName(),"java_programs.BUCKETSORT_ESTest.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d72k2() throws Throwable{try{__CLR4_5_22j02j0lwzsbdwz.R.inc(3314);
      __CLR4_5_22j02j0lwzsbdwz.R.inc(3315);BUCKETSORT bUCKETSORT0 = new BUCKETSORT();
  }finally{__CLR4_5_22j02j0lwzsbdwz.R.flushNeeded();}}
}