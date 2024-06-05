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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Parser {public static class __CLR4_5_2414414lx1e1j2s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,5324,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int position;
    private Matcher matcher;

    public Parser(Pattern pattern, String input) {try{__CLR4_5_2414414lx1e1j2s.R.inc(5224);
        __CLR4_5_2414414lx1e1j2s.R.inc(5225);matcher = pattern.matcher(input);
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public boolean matches() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5226);
        __CLR4_5_2414414lx1e1j2s.R.inc(5227);position = 1;
        __CLR4_5_2414414lx1e1j2s.R.inc(5228);return matcher.matches();
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public boolean find() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5229);
        __CLR4_5_2414414lx1e1j2s.R.inc(5230);position = 1;
        __CLR4_5_2414414lx1e1j2s.R.inc(5231);return matcher.find();
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public void skip(int number) {try{__CLR4_5_2414414lx1e1j2s.R.inc(5232);
        __CLR4_5_2414414lx1e1j2s.R.inc(5233);position += number;
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public boolean hasNext() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5234);
        __CLR4_5_2414414lx1e1j2s.R.inc(5235);return hasNext(1);
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public boolean hasNext(int number) {try{__CLR4_5_2414414lx1e1j2s.R.inc(5236);
        __CLR4_5_2414414lx1e1j2s.R.inc(5237);String value = matcher.group(position);
        __CLR4_5_2414414lx1e1j2s.R.inc(5238);if ((((value != null && !value.isEmpty())&&(__CLR4_5_2414414lx1e1j2s.R.iget(5239)!=0|true))||(__CLR4_5_2414414lx1e1j2s.R.iget(5240)==0&false))) {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5241);return true;
        } }else {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5242);position += number;
            __CLR4_5_2414414lx1e1j2s.R.inc(5243);return false;
        }
    }}finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public String next() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5244);
        __CLR4_5_2414414lx1e1j2s.R.inc(5245);return matcher.group(position++);
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public int nextInt() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5246);
        __CLR4_5_2414414lx1e1j2s.R.inc(5247);return nextInt(10);
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public int nextInt(int radix) {try{__CLR4_5_2414414lx1e1j2s.R.inc(5248);
        __CLR4_5_2414414lx1e1j2s.R.inc(5249);if ((((hasNext())&&(__CLR4_5_2414414lx1e1j2s.R.iget(5250)!=0|true))||(__CLR4_5_2414414lx1e1j2s.R.iget(5251)==0&false))) {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5252);return Integer.parseInt(next(), radix);
        } }else {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5253);return 0;
        }
    }}finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public long nextLong() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5254);
        __CLR4_5_2414414lx1e1j2s.R.inc(5255);return nextLong(10);
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public long nextLong(int radix) {try{__CLR4_5_2414414lx1e1j2s.R.inc(5256);
        __CLR4_5_2414414lx1e1j2s.R.inc(5257);if ((((hasNext())&&(__CLR4_5_2414414lx1e1j2s.R.iget(5258)!=0|true))||(__CLR4_5_2414414lx1e1j2s.R.iget(5259)==0&false))) {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5260);return Long.parseLong(next(), radix);
        } }else {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5261);return 0;
        }
    }}finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public double nextDouble() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5262);
        __CLR4_5_2414414lx1e1j2s.R.inc(5263);if ((((hasNext())&&(__CLR4_5_2414414lx1e1j2s.R.iget(5264)!=0|true))||(__CLR4_5_2414414lx1e1j2s.R.iget(5265)==0&false))) {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5266);return Double.parseDouble(next());
        } }else {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5267);return 0.0;
        }
    }}finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public enum CoordinateFormat {
        DEG_DEG,
        DEG_HEM,
        DEG_MIN_MIN,
        DEG_MIN_HEM,
        DEG_MIN_MIN_HEM,
        HEM_DEG_MIN_MIN,
        HEM_DEG,
        HEM_DEG_MIN,
        HEM_DEG_MIN_HEM
    }

    public double nextCoordinate(CoordinateFormat format) {try{__CLR4_5_2414414lx1e1j2s.R.inc(5268);
        __CLR4_5_2414414lx1e1j2s.R.inc(5269);double coordinate;
        __CLR4_5_2414414lx1e1j2s.R.inc(5270);String hemisphere = null;

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2414414lx1e1j2s.R.inc(5271);switch (format) {
            case DEG_DEG:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5272);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5273);coordinate = Double.parseDouble(next() + '.' + next());
                __CLR4_5_2414414lx1e1j2s.R.inc(5274);break;
            case DEG_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5275);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5276);coordinate = nextDouble();
                __CLR4_5_2414414lx1e1j2s.R.inc(5277);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5278);break;
            case DEG_MIN_MIN:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5279);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5280);coordinate = nextInt();
                __CLR4_5_2414414lx1e1j2s.R.inc(5281);coordinate += Double.parseDouble(next() + '.' + next()) / 60;
                __CLR4_5_2414414lx1e1j2s.R.inc(5282);break;
            case DEG_MIN_MIN_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5283);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5284);coordinate = nextInt();
                __CLR4_5_2414414lx1e1j2s.R.inc(5285);coordinate += Double.parseDouble(next() + '.' + next()) / 60;
                __CLR4_5_2414414lx1e1j2s.R.inc(5286);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5287);break;
            case HEM_DEG:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5288);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5289);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5290);coordinate = nextDouble();
                __CLR4_5_2414414lx1e1j2s.R.inc(5291);break;
            case HEM_DEG_MIN:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5292);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5293);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5294);coordinate = nextInt();
                __CLR4_5_2414414lx1e1j2s.R.inc(5295);coordinate += nextDouble() / 60;
                __CLR4_5_2414414lx1e1j2s.R.inc(5296);break;
            case HEM_DEG_MIN_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5297);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5298);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5299);coordinate = nextInt();
                __CLR4_5_2414414lx1e1j2s.R.inc(5300);coordinate += nextDouble() / 60;
                __CLR4_5_2414414lx1e1j2s.R.inc(5301);if ((((hasNext())&&(__CLR4_5_2414414lx1e1j2s.R.iget(5302)!=0|true))||(__CLR4_5_2414414lx1e1j2s.R.iget(5303)==0&false))) {{
                    __CLR4_5_2414414lx1e1j2s.R.inc(5304);hemisphere = next();
                }
                }__CLR4_5_2414414lx1e1j2s.R.inc(5305);break;
            case HEM_DEG_MIN_MIN:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5306);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5307);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5308);coordinate = nextInt();
                __CLR4_5_2414414lx1e1j2s.R.inc(5309);coordinate += Double.parseDouble(next() + '.' + next()) / 60;
                __CLR4_5_2414414lx1e1j2s.R.inc(5310);break;
            case DEG_MIN_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5311);__CLB4_5_2_bool0=true;}
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2414414lx1e1j2s.R.inc(5312);__CLB4_5_2_bool0=true;}
                __CLR4_5_2414414lx1e1j2s.R.inc(5313);coordinate = nextInt();
                __CLR4_5_2414414lx1e1j2s.R.inc(5314);coordinate += nextDouble() / 60;
                __CLR4_5_2414414lx1e1j2s.R.inc(5315);hemisphere = next();
                __CLR4_5_2414414lx1e1j2s.R.inc(5316);break;
        }

        __CLR4_5_2414414lx1e1j2s.R.inc(5317);if ((((hemisphere != null && (hemisphere.equals("S") || hemisphere.equals("W") || hemisphere.equals("-")))&&(__CLR4_5_2414414lx1e1j2s.R.iget(5318)!=0|true))||(__CLR4_5_2414414lx1e1j2s.R.iget(5319)==0&false))) {{
            __CLR4_5_2414414lx1e1j2s.R.inc(5320);coordinate = -Math.abs(coordinate);
        }

        }__CLR4_5_2414414lx1e1j2s.R.inc(5321);return coordinate;
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

    public double nextCoordinate() {try{__CLR4_5_2414414lx1e1j2s.R.inc(5322);
        __CLR4_5_2414414lx1e1j2s.R.inc(5323);return nextCoordinate(CoordinateFormat.DEG_MIN_HEM);
    }finally{__CLR4_5_2414414lx1e1j2s.R.flushNeeded();}}

}
