/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.helper;

/* 
 * Password Hashing With PBKDF2 (http://crackstation.net/hashing-security.htm).
 * Copyright (c) 2013, Taylor Hornby
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, 
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation 
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */

import java.security.SecureRandom;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/*
 * PBKDF2 salted password hashing.
 * Author: havoc AT defuse.ca
 * www: http://crackstation.net/hashing-security.htm
 */
public class PasswordHash {public static class __CLR4_5_21bx1bxlx1dh175{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,1780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String PBKDF2_ALGORITHM = "PBKDF2WithHmacSHA1";

    // The following constants may be changed without breaking existing hashes.
    public static final int SALT_BYTE_SIZE = 24;
    public static final int HASH_BYTE_SIZE = 24;
    public static final int PBKDF2_ITERATIONS = 1000;

    public static final int ITERATION_INDEX = 0;
    public static final int SALT_INDEX = 1;
    public static final int PBKDF2_INDEX = 2;

    public static class HashingResult {

        public final Integer iterations;
        public final String hash;
        public final String salt;

        public HashingResult(Integer iterations, String hash, String salt) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1725);
            __CLR4_5_21bx1bxlx1dh175.R.inc(1726);this.hash = hash;
            __CLR4_5_21bx1bxlx1dh175.R.inc(1727);this.salt = salt;
            __CLR4_5_21bx1bxlx1dh175.R.inc(1728);this.iterations = iterations;
        }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}
    }

    /**
     * Returns a salted PBKDF2 hash of the password.
     * 
     * @param password
     *            the password to hash
     * @return a salted PBKDF2 hash of the password
     */
    public static HashingResult createHash(String password) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1729);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1730);return createHash(password.toCharArray());
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Returns a salted PBKDF2 hash of the password.
     * 
     * @param password
     *            the password to hash
     * @return a salted PBKDF2 hash of the password
     */
    public static HashingResult createHash(char[] password) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1731);
        // Generate a random salt
        __CLR4_5_21bx1bxlx1dh175.R.inc(1732);SecureRandom random = new SecureRandom();
        __CLR4_5_21bx1bxlx1dh175.R.inc(1733);byte[] salt = new byte[SALT_BYTE_SIZE];
        __CLR4_5_21bx1bxlx1dh175.R.inc(1734);random.nextBytes(salt);

        // Hash the password
        __CLR4_5_21bx1bxlx1dh175.R.inc(1735);byte[] hash = pbkdf2(password, salt, PBKDF2_ITERATIONS, HASH_BYTE_SIZE);

        __CLR4_5_21bx1bxlx1dh175.R.inc(1736);return new HashingResult(PBKDF2_ITERATIONS, toHex(hash), toHex(salt));
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Validates a password using a hash.
     * 
     * @param password
     *            the password to check
     * @param correctHash
     *            the hash of the valid password
     * @return true if the password is correct, false if not
     */
    public static boolean validatePassword(String password, String correctHash)
            throws NoSuchAlgorithmException, InvalidKeySpecException {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1737);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1738);return validatePassword(password.toCharArray(), correctHash);
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Validates a password using a hash.
     * 
     * @param password
     *            the password to check
     * @param correctHash
     *            the hash of the valid password
     * @return true if the password is correct, false if not
     */
    public static boolean validatePassword(char[] password, String correctHash)
            throws NoSuchAlgorithmException, InvalidKeySpecException {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1739);
        // Decode the hash into its parameters
        __CLR4_5_21bx1bxlx1dh175.R.inc(1740);String[] params = correctHash.split(":");
        __CLR4_5_21bx1bxlx1dh175.R.inc(1741);int iterations = Integer.parseInt(params[ITERATION_INDEX]);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1742);return validatePassword(password, iterations, params[SALT_INDEX], params[PBKDF2_INDEX]);
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    public static boolean validatePassword(char[] password, int iterations,
            String saltHex, String hashHex) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1743);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1744);byte[] salt = fromHex(saltHex);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1745);byte[] hash = fromHex(hashHex);
        // Compute the hash of the provided password, using the same salt,
        // iteration count, and hash length
        __CLR4_5_21bx1bxlx1dh175.R.inc(1746);byte[] testHash = pbkdf2(password, salt, iterations, hash.length);
        // Compare the hashes in constant time. The password is correct if
        // both hashes match.
        __CLR4_5_21bx1bxlx1dh175.R.inc(1747);return slowEquals(hash, testHash);
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    
    
    
    public static boolean slowEquals(String hash1, String hash2) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1748);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1749);return slowEquals(fromHex(hash1), fromHex(hash2));
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Compares two byte arrays in length-constant time. This comparison method
     * is used so that password hashes cannot be extracted from an on-line
     * system using a timing attack and then attacked off-line.
     * 
     * @param a
     *            the first byte array
     * @param b
     *            the second byte array
     * @return true if both byte arrays are the same, false if not
     */
    private static boolean slowEquals(byte[] a, byte[] b) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1750);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1751);int diff = a.length ^ b.length;
        __CLR4_5_21bx1bxlx1dh175.R.inc(1752);for (int i = 0; (((i < a.length && i < b.length)&&(__CLR4_5_21bx1bxlx1dh175.R.iget(1753)!=0|true))||(__CLR4_5_21bx1bxlx1dh175.R.iget(1754)==0&false)); i++)
            {__CLR4_5_21bx1bxlx1dh175.R.inc(1755);diff |= a[i] ^ b[i];
        }__CLR4_5_21bx1bxlx1dh175.R.inc(1756);return diff == 0;
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Computes the PBKDF2 hash of a password.
     * 
     * @param password
     *            the password to hash.
     * @param salt
     *            the salt
     * @param iterations
     *            the iteration count (slowness factor)
     * @param bytes
     *            the length of the hash to compute in bytes
     * @return the PBDKF2 hash of the password
     */
    private static byte[] pbkdf2(char[] password, byte[] salt, int iterations,
            int bytes) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1757);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1758);try {
            __CLR4_5_21bx1bxlx1dh175.R.inc(1759);PBEKeySpec spec = new PBEKeySpec(password, salt, iterations,
                    bytes * 8);
            __CLR4_5_21bx1bxlx1dh175.R.inc(1760);SecretKeyFactory skf = SecretKeyFactory
                    .getInstance(PBKDF2_ALGORITHM);
            __CLR4_5_21bx1bxlx1dh175.R.inc(1761);return skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException e) {
            __CLR4_5_21bx1bxlx1dh175.R.inc(1762);throw new RuntimeException(e);
        } catch (InvalidKeySpecException e) {
            __CLR4_5_21bx1bxlx1dh175.R.inc(1763);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Converts a string of hexadecimal characters into a byte array.
     * 
     * @param hex
     *            the hex string
     * @return the hex string decoded into a byte array
     */
    private static byte[] fromHex(String hex) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1764);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1765);byte[] binary = new byte[hex.length() / 2];
        __CLR4_5_21bx1bxlx1dh175.R.inc(1766);for (int i = 0; (((i < binary.length)&&(__CLR4_5_21bx1bxlx1dh175.R.iget(1767)!=0|true))||(__CLR4_5_21bx1bxlx1dh175.R.iget(1768)==0&false)); i++) {{
            __CLR4_5_21bx1bxlx1dh175.R.inc(1769);binary[i] = (byte) Integer.parseInt(
                    hex.substring(2 * i, 2 * i + 2), 16);
        }
        }__CLR4_5_21bx1bxlx1dh175.R.inc(1770);return binary;
    }finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    /**
     * Converts a byte array into a hexadecimal string.
     * 
     * @param array
     *            the byte array to convert
     * @return a length*2 character string encoding the byte array
     */
    private static String toHex(byte[] array) {try{__CLR4_5_21bx1bxlx1dh175.R.inc(1771);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1772);BigInteger bi = new BigInteger(1, array);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1773);String hex = bi.toString(16);
        __CLR4_5_21bx1bxlx1dh175.R.inc(1774);int paddingLength = (array.length * 2) - hex.length();
        __CLR4_5_21bx1bxlx1dh175.R.inc(1775);if ((((paddingLength > 0)&&(__CLR4_5_21bx1bxlx1dh175.R.iget(1776)!=0|true))||(__CLR4_5_21bx1bxlx1dh175.R.iget(1777)==0&false)))
            {__CLR4_5_21bx1bxlx1dh175.R.inc(1778);return String.format("%0" + paddingLength + "d", 0) + hex;
        }else
            {__CLR4_5_21bx1bxlx1dh175.R.inc(1779);return hex;
    }}finally{__CLR4_5_21bx1bxlx1dh175.R.flushNeeded();}}

    

}