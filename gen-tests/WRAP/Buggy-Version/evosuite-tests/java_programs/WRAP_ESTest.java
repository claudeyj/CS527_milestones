/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 05 03:36:39 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java_programs.WRAP;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WRAP_ESTest extends WRAP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap("", (-1296));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap((String) null, 2360);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      WRAP.wrap(" ", 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<String> arrayList0 = WRAP.wrap("dByl1_6ZilT", 1);
      assertEquals(10, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<String> arrayList0 = WRAP.wrap("abc", 272);
      assertFalse(arrayList0.contains("abc"));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[7];
      WRAP.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WRAP wRAP0 = new WRAP();
  }
}