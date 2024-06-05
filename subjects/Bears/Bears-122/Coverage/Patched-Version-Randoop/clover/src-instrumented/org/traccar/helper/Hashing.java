/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
import javax.xml.bind.DatatypeConverter;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

public final class Hashing {public static class __CLR4_5_245o45olwye627l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,5421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final int ITERATIONS = 1000;
    public static final int SALT_SIZE = 24;
    public static final int HASH_SIZE = 24;

    private static SecretKeyFactory factory;
    static {try{__CLR4_5_245o45olwye627l.R.inc(5388);
        __CLR4_5_245o45olwye627l.R.inc(5389);try {
            __CLR4_5_245o45olwye627l.R.inc(5390);factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        } catch (NoSuchAlgorithmException e) {
            __CLR4_5_245o45olwye627l.R.inc(5391);e.printStackTrace();
        }
    }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

    public static class HashingResult {

        private final String hash;
        private final String salt;

        public HashingResult(String hash, String salt) {try{__CLR4_5_245o45olwye627l.R.inc(5392);
            __CLR4_5_245o45olwye627l.R.inc(5393);this.hash = hash;
            __CLR4_5_245o45olwye627l.R.inc(5394);this.salt = salt;
        }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

        public String getHash() {try{__CLR4_5_245o45olwye627l.R.inc(5395);
            __CLR4_5_245o45olwye627l.R.inc(5396);return hash;
        }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

        public String getSalt() {try{__CLR4_5_245o45olwye627l.R.inc(5397);
            __CLR4_5_245o45olwye627l.R.inc(5398);return salt;
        }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}
    }

    private Hashing() {try{__CLR4_5_245o45olwye627l.R.inc(5399);
    }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

    private static byte[] function(char[] password, byte[] salt) {try{__CLR4_5_245o45olwye627l.R.inc(5400);
        __CLR4_5_245o45olwye627l.R.inc(5401);try {
            __CLR4_5_245o45olwye627l.R.inc(5402);PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, HASH_SIZE * Byte.SIZE);
            __CLR4_5_245o45olwye627l.R.inc(5403);return factory.generateSecret(spec).getEncoded();
        } catch (InvalidKeySpecException e) {
            __CLR4_5_245o45olwye627l.R.inc(5404);throw new SecurityException(e);
        }
    }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

    private static final SecureRandom RANDOM = new SecureRandom();

    public static HashingResult createHash(String password) {try{__CLR4_5_245o45olwye627l.R.inc(5405);
        __CLR4_5_245o45olwye627l.R.inc(5406);byte[] salt = new byte[SALT_SIZE];
        __CLR4_5_245o45olwye627l.R.inc(5407);RANDOM.nextBytes(salt);
        __CLR4_5_245o45olwye627l.R.inc(5408);byte[] hash = function(password.toCharArray(), salt);
        __CLR4_5_245o45olwye627l.R.inc(5409);return new HashingResult(
                DatatypeConverter.printHexBinary(hash),
                DatatypeConverter.printHexBinary(salt));
    }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

    public static boolean validatePassword(String password, String hashHex, String saltHex) {try{__CLR4_5_245o45olwye627l.R.inc(5410);
        __CLR4_5_245o45olwye627l.R.inc(5411);byte[] hash = DatatypeConverter.parseHexBinary(hashHex);
        __CLR4_5_245o45olwye627l.R.inc(5412);byte[] salt = DatatypeConverter.parseHexBinary(saltHex);
        __CLR4_5_245o45olwye627l.R.inc(5413);return slowEquals(hash, function(password.toCharArray(), salt));
    }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

    /**
     * Compares two byte arrays in length-constant time. This comparison method
     * is used so that password hashes cannot be extracted from an on-line
     * system using a timing attack and then attacked off-line.
     */
    private static boolean slowEquals(byte[] a, byte[] b) {try{__CLR4_5_245o45olwye627l.R.inc(5414);
        __CLR4_5_245o45olwye627l.R.inc(5415);int diff = a.length ^ b.length;
        __CLR4_5_245o45olwye627l.R.inc(5416);for (int i = 0; (((i < a.length && i < b.length)&&(__CLR4_5_245o45olwye627l.R.iget(5417)!=0|true))||(__CLR4_5_245o45olwye627l.R.iget(5418)==0&false)); i++) {{
            __CLR4_5_245o45olwye627l.R.inc(5419);diff |= a[i] ^ b[i];
        }
        }__CLR4_5_245o45olwye627l.R.inc(5420);return diff == 0;
    }finally{__CLR4_5_245o45olwye627l.R.flushNeeded();}}

}
