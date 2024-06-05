/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 13:36:11 GMT 2024
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodecInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodecInputStream_ESTest extends BaseNCodecInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base64_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Base32 base32_0 = new Base32(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(mockFileInputStream0, base32_0, false);
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base64_0, false);
      byte[] byteArray0 = new byte[2];
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Base32 base32_0 = new Base32((byte) (-63));
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(bufferedInputStream0, base32_0, true);
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base32 base32_0 = new Base32((-1214), byteArray0, false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, true);
      baseNCodecInputStream0.read();
      int int0 = baseNCodecInputStream0.read();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base64_0, false);
      byte[] byteArray0 = new byte[2];
      int int0 = baseNCodecInputStream0.read(byteArray0, 1, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base32_0, false);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 1, 1435);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base32_0, false);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 64, 64);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base32_0, false);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 0, (int) (byte) (-6));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base64_0, false);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, (-486), 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read((byte[]) null, 64, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Base32 base32_0 = new Base32(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(mockFileInputStream0, base32_0, false);
      boolean boolean0 = baseNCodecInputStream0.markSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base64_0, false);
      int int0 = baseNCodecInputStream0.read();
      assertEquals((-1), int0);
  }
}
