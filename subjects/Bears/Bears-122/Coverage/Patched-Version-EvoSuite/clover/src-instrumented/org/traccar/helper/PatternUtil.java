/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class PatternUtil {public static class __CLR4_5_24lf4lflwye3xwc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,5980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PatternUtil() {try{__CLR4_5_24lf4lflwye3xwc.R.inc(5955);
    }finally{__CLR4_5_24lf4lflwye3xwc.R.flushNeeded();}}

    public static class MatchResult {
        private String patternMatch;
        private String patternTail;
        private String stringMatch;
        private String stringTail;

        public String getPatternMatch() {try{__CLR4_5_24lf4lflwye3xwc.R.inc(5956);
            __CLR4_5_24lf4lflwye3xwc.R.inc(5957);return patternMatch;
        }finally{__CLR4_5_24lf4lflwye3xwc.R.flushNeeded();}}

        public String getPatternTail() {try{__CLR4_5_24lf4lflwye3xwc.R.inc(5958);
            __CLR4_5_24lf4lflwye3xwc.R.inc(5959);return patternTail;
        }finally{__CLR4_5_24lf4lflwye3xwc.R.flushNeeded();}}

        public String getStringMatch() {try{__CLR4_5_24lf4lflwye3xwc.R.inc(5960);
            __CLR4_5_24lf4lflwye3xwc.R.inc(5961);return stringMatch;
        }finally{__CLR4_5_24lf4lflwye3xwc.R.flushNeeded();}}

        public String getStringTail() {try{__CLR4_5_24lf4lflwye3xwc.R.inc(5962);
            __CLR4_5_24lf4lflwye3xwc.R.inc(5963);return stringTail;
        }finally{__CLR4_5_24lf4lflwye3xwc.R.flushNeeded();}}
    }

    public static MatchResult checkPattern(String pattern, String input) {try{__CLR4_5_24lf4lflwye3xwc.R.inc(5964);

        __CLR4_5_24lf4lflwye3xwc.R.inc(5965);MatchResult result = new MatchResult();

        __CLR4_5_24lf4lflwye3xwc.R.inc(5966);for (int i = 0; (((i < pattern.length())&&(__CLR4_5_24lf4lflwye3xwc.R.iget(5967)!=0|true))||(__CLR4_5_24lf4lflwye3xwc.R.iget(5968)==0&false)); i++) {{
            __CLR4_5_24lf4lflwye3xwc.R.inc(5969);try {
                __CLR4_5_24lf4lflwye3xwc.R.inc(5970);Matcher matcher = Pattern.compile("(" + pattern.substring(0, i) + ").*").matcher(input);
                __CLR4_5_24lf4lflwye3xwc.R.inc(5971);if ((((matcher.matches())&&(__CLR4_5_24lf4lflwye3xwc.R.iget(5972)!=0|true))||(__CLR4_5_24lf4lflwye3xwc.R.iget(5973)==0&false))) {{
                    __CLR4_5_24lf4lflwye3xwc.R.inc(5974);result.patternMatch = pattern.substring(0, i);
                    __CLR4_5_24lf4lflwye3xwc.R.inc(5975);result.patternTail = pattern.substring(i);
                    __CLR4_5_24lf4lflwye3xwc.R.inc(5976);result.stringMatch = matcher.group(1);
                    __CLR4_5_24lf4lflwye3xwc.R.inc(5977);result.stringTail = input.substring(matcher.group(1).length());
                }
            }} catch (PatternSyntaxException error) {
                __CLR4_5_24lf4lflwye3xwc.R.inc(5978);Log.warning(error);
            }
        }

        }__CLR4_5_24lf4lflwye3xwc.R.inc(5979);return result;
    }finally{__CLR4_5_24lf4lflwye3xwc.R.flushNeeded();}}

}