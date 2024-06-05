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

import java.util.ArrayList;
import java.util.regex.Pattern;

public class PatternBuilder {public static class __CLR4_5_243w43wlx1dz8zk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,5366,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final ArrayList<String> fragments = new ArrayList<>();

    public PatternBuilder optional() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5324);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5325);return optional(1);
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder optional(int count) {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5326);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5327);fragments.add(fragments.size() - count, "(?:");
        __CLR4_5_243w43wlx1dz8zk.R.inc(5328);fragments.add(")?");
        __CLR4_5_243w43wlx1dz8zk.R.inc(5329);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder expression(String s) {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5330);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5331);s = s.replaceAll("\\|$", "\\\\|"); // special case for delimiter

        __CLR4_5_243w43wlx1dz8zk.R.inc(5332);fragments.add(s);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5333);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder text(String s) {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5334);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5335);fragments.add(s.replaceAll("([\\\\\\.\\[\\{\\(\\)\\*\\+\\?\\^\\$\\|])", "\\\\$1"));
        __CLR4_5_243w43wlx1dz8zk.R.inc(5336);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder number(String s) {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5337);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5338);s = s.replace("dddd", "d{4}").replace("ddd", "d{3}").replace("dd", "d{2}");
        __CLR4_5_243w43wlx1dz8zk.R.inc(5339);s = s.replace("xxxx", "x{4}").replace("xxx", "x{3}").replace("xx", "x{2}");

        __CLR4_5_243w43wlx1dz8zk.R.inc(5340);s = s.replace("d", "\\d").replace("x", "[0-9a-fA-F]").replaceAll("([\\.])", "\\\\$1");
        __CLR4_5_243w43wlx1dz8zk.R.inc(5341);s = s.replaceAll("\\|$", "\\\\|").replaceAll("^\\|", "\\\\|"); // special case for delimiter

        __CLR4_5_243w43wlx1dz8zk.R.inc(5342);fragments.add(s);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5343);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder any() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5344);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5345);fragments.add(".*?");
        __CLR4_5_243w43wlx1dz8zk.R.inc(5346);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder binary(String s) {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5347);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5348);fragments.add(s.replaceAll("(\\p{XDigit}{2})", "\\\\$1"));
        __CLR4_5_243w43wlx1dz8zk.R.inc(5349);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder or() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5350);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5351);fragments.add("|");
        __CLR4_5_243w43wlx1dz8zk.R.inc(5352);return this;
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder groupBegin() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5353);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5354);return expression("(?:");
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder groupEnd() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5355);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5356);return expression(")");
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public PatternBuilder groupEnd(String s) {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5357);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5358);return expression(")" + s);
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    public Pattern compile() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5359);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5360);return Pattern.compile(toString(), Pattern.DOTALL);
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_243w43wlx1dz8zk.R.inc(5361);
        __CLR4_5_243w43wlx1dz8zk.R.inc(5362);StringBuilder builder = new StringBuilder();
        __CLR4_5_243w43wlx1dz8zk.R.inc(5363);for (String fragment : fragments) {{
            __CLR4_5_243w43wlx1dz8zk.R.inc(5364);builder.append(fragment);
        }
        }__CLR4_5_243w43wlx1dz8zk.R.inc(5365);return builder.toString();
    }finally{__CLR4_5_243w43wlx1dz8zk.R.flushNeeded();}}

}
