/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 05 06:45:02 GMT 2024
 */

package org.openpnp.machine.reference.feeder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.openpnp.machine.reference.feeder.ReferenceStripFeeder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ReferenceStripFeeder_ESTest extends ReferenceStripFeeder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReferenceStripFeeder.TapeType referenceStripFeeder_TapeType0 = ReferenceStripFeeder.TapeType.BlackPlastic;
      String string0 = referenceStripFeeder_TapeType0.toString();
      assertEquals("Black Plastic", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReferenceStripFeeder referenceStripFeeder0 = null;
      try {
        referenceStripFeeder0 = new ReferenceStripFeeder();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Configuration instance not yet initialized.
         //
         verifyException("org.openpnp.model.Configuration", e);
      }
  }
}