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

public class PatternBuilder {public static class __CLR4_5_24k94k9lwye62cr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,5955,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final ArrayList<String> fragments = new ArrayList<>();

    public PatternBuilder optional() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5913);
        __CLR4_5_24k94k9lwye62cr.R.inc(5914);return optional(1);
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder optional(int count) {try{__CLR4_5_24k94k9lwye62cr.R.inc(5915);
        __CLR4_5_24k94k9lwye62cr.R.inc(5916);fragments.add(fragments.size() - count, "(?:");
        __CLR4_5_24k94k9lwye62cr.R.inc(5917);fragments.add(")?");
        __CLR4_5_24k94k9lwye62cr.R.inc(5918);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder expression(String s) {try{__CLR4_5_24k94k9lwye62cr.R.inc(5919);
        __CLR4_5_24k94k9lwye62cr.R.inc(5920);s = s.replaceAll("\\|$", "\\\\|"); // special case for delimiter

        __CLR4_5_24k94k9lwye62cr.R.inc(5921);fragments.add(s);
        __CLR4_5_24k94k9lwye62cr.R.inc(5922);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder text(String s) {try{__CLR4_5_24k94k9lwye62cr.R.inc(5923);
        __CLR4_5_24k94k9lwye62cr.R.inc(5924);fragments.add(s.replaceAll("([\\\\\\.\\[\\{\\(\\)\\*\\+\\?\\^\\$\\|])", "\\\\$1"));
        __CLR4_5_24k94k9lwye62cr.R.inc(5925);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder number(String s) {try{__CLR4_5_24k94k9lwye62cr.R.inc(5926);
        __CLR4_5_24k94k9lwye62cr.R.inc(5927);s = s.replace("dddd", "d{4}").replace("ddd", "d{3}").replace("dd", "d{2}");
        __CLR4_5_24k94k9lwye62cr.R.inc(5928);s = s.replace("xxxx", "x{4}").replace("xxx", "x{3}").replace("xx", "x{2}");

        __CLR4_5_24k94k9lwye62cr.R.inc(5929);s = s.replace("d", "\\d").replace("x", "[0-9a-fA-F]").replaceAll("([\\.])", "\\\\$1");
        __CLR4_5_24k94k9lwye62cr.R.inc(5930);s = s.replaceAll("\\|$", "\\\\|").replaceAll("^\\|", "\\\\|"); // special case for delimiter

        __CLR4_5_24k94k9lwye62cr.R.inc(5931);fragments.add(s);
        __CLR4_5_24k94k9lwye62cr.R.inc(5932);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder any() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5933);
        __CLR4_5_24k94k9lwye62cr.R.inc(5934);fragments.add(".*?");
        __CLR4_5_24k94k9lwye62cr.R.inc(5935);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder binary(String s) {try{__CLR4_5_24k94k9lwye62cr.R.inc(5936);
        __CLR4_5_24k94k9lwye62cr.R.inc(5937);fragments.add(s.replaceAll("(\\p{XDigit}{2})", "\\\\$1"));
        __CLR4_5_24k94k9lwye62cr.R.inc(5938);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder or() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5939);
        __CLR4_5_24k94k9lwye62cr.R.inc(5940);fragments.add("|");
        __CLR4_5_24k94k9lwye62cr.R.inc(5941);return this;
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder groupBegin() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5942);
        __CLR4_5_24k94k9lwye62cr.R.inc(5943);return expression("(?:");
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder groupEnd() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5944);
        __CLR4_5_24k94k9lwye62cr.R.inc(5945);return expression(")");
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public PatternBuilder groupEnd(String s) {try{__CLR4_5_24k94k9lwye62cr.R.inc(5946);
        __CLR4_5_24k94k9lwye62cr.R.inc(5947);return expression(")" + s);
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    public Pattern compile() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5948);
        __CLR4_5_24k94k9lwye62cr.R.inc(5949);return Pattern.compile(toString(), Pattern.DOTALL);
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_24k94k9lwye62cr.R.inc(5950);
        __CLR4_5_24k94k9lwye62cr.R.inc(5951);StringBuilder builder = new StringBuilder();
        __CLR4_5_24k94k9lwye62cr.R.inc(5952);for (String fragment : fragments) {{
            __CLR4_5_24k94k9lwye62cr.R.inc(5953);builder.append(fragment);
        }
        }__CLR4_5_24k94k9lwye62cr.R.inc(5954);return builder.toString();
    }finally{__CLR4_5_24k94k9lwye62cr.R.flushNeeded();}}

}
