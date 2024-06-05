/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.helper;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

public class Hashing {public static class __CLR4_5_21f41f4lx1e3557{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,1865,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final int ITERATIONS = 1000;
    public static final int SALT_SIZE = 24;
    public static final int HASH_SIZE = 24;

    public static class HashingResult {

        public final String hash;
        public final String salt;

        public HashingResult(String hash, String salt) {try{__CLR4_5_21f41f4lx1e3557.R.inc(1840);
            __CLR4_5_21f41f4lx1e3557.R.inc(1841);this.hash = hash;
            __CLR4_5_21f41f4lx1e3557.R.inc(1842);this.salt = salt;
        }finally{__CLR4_5_21f41f4lx1e3557.R.flushNeeded();}}
    }

    private static byte[] function(char[] password, byte[] salt) {try{__CLR4_5_21f41f4lx1e3557.R.inc(1843);
        __CLR4_5_21f41f4lx1e3557.R.inc(1844);try {
            __CLR4_5_21f41f4lx1e3557.R.inc(1845);PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, HASH_SIZE * Byte.SIZE);
            __CLR4_5_21f41f4lx1e3557.R.inc(1846);SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            __CLR4_5_21f41f4lx1e3557.R.inc(1847);return factory.generateSecret(spec).getEncoded();
        } catch (GeneralSecurityException error) {
            __CLR4_5_21f41f4lx1e3557.R.inc(1848);throw new SecurityException(error);
        }
    }finally{__CLR4_5_21f41f4lx1e3557.R.flushNeeded();}}

    private static final SecureRandom random = new SecureRandom();

    public static HashingResult createHash(String password) {try{__CLR4_5_21f41f4lx1e3557.R.inc(1849);
        __CLR4_5_21f41f4lx1e3557.R.inc(1850);byte[] salt = new byte[SALT_SIZE]; __CLR4_5_21f41f4lx1e3557.R.inc(1851);random.nextBytes(salt);
        __CLR4_5_21f41f4lx1e3557.R.inc(1852);byte[] hash = function(password.toCharArray(), salt);
        __CLR4_5_21f41f4lx1e3557.R.inc(1853);return new HashingResult(
                ChannelBufferTools.convertByteArray(hash),
                ChannelBufferTools.convertByteArray(salt));
    }finally{__CLR4_5_21f41f4lx1e3557.R.flushNeeded();}}

    public static boolean validatePassword(String password, String hashHex, String saltHex) {try{__CLR4_5_21f41f4lx1e3557.R.inc(1854);
        __CLR4_5_21f41f4lx1e3557.R.inc(1855);byte[] hash = ChannelBufferTools.convertHexString(hashHex);
        __CLR4_5_21f41f4lx1e3557.R.inc(1856);byte[] salt = ChannelBufferTools.convertHexString(saltHex);
        __CLR4_5_21f41f4lx1e3557.R.inc(1857);return slowEquals(hash, function(password.toCharArray(), salt));
    }finally{__CLR4_5_21f41f4lx1e3557.R.flushNeeded();}}

    /**
     * Compares two byte arrays in length-constant time. This comparison method
     * is used so that password hashes cannot be extracted from an on-line
     * system using a timing attack and then attacked off-line.
     */
    private static boolean slowEquals(byte[] a, byte[] b) {try{__CLR4_5_21f41f4lx1e3557.R.inc(1858);
        __CLR4_5_21f41f4lx1e3557.R.inc(1859);int diff = a.length ^ b.length;
        __CLR4_5_21f41f4lx1e3557.R.inc(1860);for (int i = 0; (((i < a.length && i < b.length)&&(__CLR4_5_21f41f4lx1e3557.R.iget(1861)!=0|true))||(__CLR4_5_21f41f4lx1e3557.R.iget(1862)==0&false)); i++) {{
            __CLR4_5_21f41f4lx1e3557.R.inc(1863);diff |= a[i] ^ b[i];
        }
        }__CLR4_5_21f41f4lx1e3557.R.inc(1864);return diff == 0;
    }finally{__CLR4_5_21f41f4lx1e3557.R.flushNeeded();}}

}
