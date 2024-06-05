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
package org.traccar.geocode;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

/**
 * Available parameters:
 *
 * %p - postcode
 * %c - country
 * %s - state
 * %d - district
 * %t - settlement (town)
 * %r - street (road)
 * %h - house
 *
 */
public class AddressFormat extends Format {public static class __CLR4_5_210q10qlx1e7xny{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,1347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String format;

    public AddressFormat() {
        this("%h %r, %t, %s, %c");__CLR4_5_210q10qlx1e7xny.R.inc(1323);try{__CLR4_5_210q10qlx1e7xny.R.inc(1322);
    }finally{__CLR4_5_210q10qlx1e7xny.R.flushNeeded();}}

    public AddressFormat(String format) {try{__CLR4_5_210q10qlx1e7xny.R.inc(1324);
        __CLR4_5_210q10qlx1e7xny.R.inc(1325);this.format = format;
    }finally{__CLR4_5_210q10qlx1e7xny.R.flushNeeded();}}

    private static String replace(String s, String key, String value) {try{__CLR4_5_210q10qlx1e7xny.R.inc(1326);
        __CLR4_5_210q10qlx1e7xny.R.inc(1327);if ((((value != null)&&(__CLR4_5_210q10qlx1e7xny.R.iget(1328)!=0|true))||(__CLR4_5_210q10qlx1e7xny.R.iget(1329)==0&false))) {{
            __CLR4_5_210q10qlx1e7xny.R.inc(1330);s = s.replace(key, value);
        } }else {{
            __CLR4_5_210q10qlx1e7xny.R.inc(1331);s = s.replaceAll("[, ]*" + key, "");
        }
        }__CLR4_5_210q10qlx1e7xny.R.inc(1332);return s;
    }finally{__CLR4_5_210q10qlx1e7xny.R.flushNeeded();}}

    @Override
    public StringBuffer format(Object o, StringBuffer stringBuffer, FieldPosition fieldPosition) {try{__CLR4_5_210q10qlx1e7xny.R.inc(1333);
        __CLR4_5_210q10qlx1e7xny.R.inc(1334);Address address = (Address) o;
        __CLR4_5_210q10qlx1e7xny.R.inc(1335);String result = format;

        __CLR4_5_210q10qlx1e7xny.R.inc(1336);result = replace(result, "%p", address.getPostcode());
        __CLR4_5_210q10qlx1e7xny.R.inc(1337);result = replace(result, "%c", address.getCountry());
        __CLR4_5_210q10qlx1e7xny.R.inc(1338);result = replace(result, "%s", address.getState());
        __CLR4_5_210q10qlx1e7xny.R.inc(1339);result = replace(result, "%d", address.getDistrict());
        __CLR4_5_210q10qlx1e7xny.R.inc(1340);result = replace(result, "%t", address.getSettlement());
        __CLR4_5_210q10qlx1e7xny.R.inc(1341);result = replace(result, "%r", address.getStreet());
        __CLR4_5_210q10qlx1e7xny.R.inc(1342);result = replace(result, "%h", address.getHouse());

        __CLR4_5_210q10qlx1e7xny.R.inc(1343);result = result.replaceAll("^[, ]*", "");

        __CLR4_5_210q10qlx1e7xny.R.inc(1344);return stringBuffer.append(result);
    }finally{__CLR4_5_210q10qlx1e7xny.R.flushNeeded();}}

    @Override
    public Address parseObject(String s, ParsePosition parsePosition) {try{__CLR4_5_210q10qlx1e7xny.R.inc(1345);
        __CLR4_5_210q10qlx1e7xny.R.inc(1346);throw new UnsupportedOperationException();
    }finally{__CLR4_5_210q10qlx1e7xny.R.flushNeeded();}}

}
