/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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

import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Parser {public static class __CLR4_5_24dx4dxlwydzkz1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,5913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int position;
    private final Matcher matcher;

    public Parser(Pattern pattern, String input) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5685);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5686);matcher = pattern.matcher(input);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public boolean matches() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5687);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5688);position = 1;
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5689);return matcher.matches();
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public boolean find() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5690);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5691);position = 1;
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5692);return matcher.find();
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public void skip(int number) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5693);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5694);position += number;
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public boolean hasNext() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5695);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5696);return hasNext(1);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public boolean hasNext(int number) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5697);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5698);String value = matcher.group(position);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5699);if ((((value != null && !value.isEmpty())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5700)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5701)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5702);return true;
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5703);position += number;
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5704);return false;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public String next() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5705);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5706);return matcher.group(position++);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public Integer nextInt() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5707);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5708);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5709)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5710)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5711);return Integer.parseInt(next());
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5712);return null;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public int nextInt(int defaultValue) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5713);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5714);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5715)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5716)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5717);return Integer.parseInt(next());
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5718);return defaultValue;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public Integer nextHexInt() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5719);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5720);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5721)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5722)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5723);return Integer.parseInt(next(), 16);
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5724);return null;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public int nextHexInt(int defaultValue) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5725);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5726);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5727)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5728)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5729);return Integer.parseInt(next(), 16);
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5730);return defaultValue;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public Integer nextBinInt() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5731);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5732);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5733)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5734)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5735);return Integer.parseInt(next(), 2);
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5736);return null;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public int nextBinInt(int defaultValue) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5737);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5738);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5739)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5740)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5741);return Integer.parseInt(next(), 2);
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5742);return defaultValue;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public long nextLong(long defaultValue) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5743);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5744);return nextLong(10, defaultValue);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public long nextLong(int radix, long defaultValue) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5745);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5746);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5747)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5748)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5749);return Long.parseLong(next(), radix);
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5750);return defaultValue;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public Double nextDouble() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5751);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5752);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5753)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5754)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5755);return Double.parseDouble(next());
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5756);return null;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public double nextDouble(double defaultValue) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5757);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5758);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5759)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5760)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5761);return Double.parseDouble(next());
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5762);return defaultValue;
        }
    }}finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

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

    public double nextCoordinate(CoordinateFormat format) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5763);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5764);double coordinate;
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5765);String hemisphere = null;

        boolean __CLB4_5_2_bool0=false;__CLR4_5_24dx4dxlwydzkz1.R.inc(5766);switch (format) {
            case DEG_DEG:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5767);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5768);coordinate = Double.parseDouble(next() + '.' + next());
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5769);break;
            case DEG_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5770);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5771);coordinate = nextDouble(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5772);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5773);break;
            case DEG_MIN_MIN:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5774);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5775);coordinate = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5776);coordinate += Double.parseDouble(next() + '.' + next()) / 60;
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5777);break;
            case DEG_MIN_MIN_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5778);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5779);coordinate = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5780);coordinate += Double.parseDouble(next() + '.' + next()) / 60;
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5781);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5782);break;
            case HEM_DEG:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5783);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5784);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5785);coordinate = nextDouble(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5786);break;
            case HEM_DEG_MIN:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5787);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5788);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5789);coordinate = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5790);coordinate += nextDouble(0) / 60;
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5791);break;
            case HEM_DEG_MIN_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5792);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5793);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5794);coordinate = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5795);coordinate += nextDouble(0) / 60;
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5796);if ((((hasNext())&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5797)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5798)==0&false))) {{
                    __CLR4_5_24dx4dxlwydzkz1.R.inc(5799);hemisphere = next();
                }
                }__CLR4_5_24dx4dxlwydzkz1.R.inc(5800);break;
            case HEM_DEG_MIN_MIN:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5801);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5802);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5803);coordinate = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5804);coordinate += Double.parseDouble(next() + '.' + next()) / 60;
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5805);break;
            case DEG_MIN_HEM:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5806);__CLB4_5_2_bool0=true;}
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5807);__CLB4_5_2_bool0=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5808);coordinate = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5809);coordinate += nextDouble(0) / 60;
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5810);hemisphere = next();
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5811);break;
        }

        __CLR4_5_24dx4dxlwydzkz1.R.inc(5812);if ((((hemisphere != null && (hemisphere.equals("S") || hemisphere.equals("W") || hemisphere.equals("-")))&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5813)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5814)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5815);coordinate = -Math.abs(coordinate);
        }

        }__CLR4_5_24dx4dxlwydzkz1.R.inc(5816);return coordinate;
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public double nextCoordinate() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5817);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5818);return nextCoordinate(CoordinateFormat.DEG_MIN_HEM);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public enum DateTimeFormat {
        HMS,
        SMH,
        HMS_YMD,
        HMS_DMY,
        SMH_YMD,
        SMH_DMY,
        DMY_HMS,
        DMY_HMSS,
        YMD_HMS,
        YMD_HMSS,
    }

    public Date nextDateTime(DateTimeFormat format, String timeZone) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5819);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5820);int year = 0, month = 0, day = 0;
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5821);int hour = 0, minute = 0, second = 0, millisecond = 0;

        boolean __CLB4_5_2_bool1=false;__CLR4_5_24dx4dxlwydzkz1.R.inc(5822);switch (format) {
            case HMS:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5823);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5824);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5825);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5826);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5827);break;
            case SMH:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5828);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5829);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5830);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5831);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5832);break;
            case HMS_YMD:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5833);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5834);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5835);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5836);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5837);year = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5838);month = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5839);day = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5840);break;
            case HMS_DMY:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5841);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5842);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5843);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5844);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5845);day = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5846);month = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5847);year = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5848);break;
            case SMH_YMD:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5849);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5850);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5851);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5852);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5853);year = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5854);month = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5855);day = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5856);break;
            case SMH_DMY:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5857);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5858);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5859);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5860);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5861);day = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5862);month = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5863);year = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5864);break;
            case DMY_HMS:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5865);__CLB4_5_2_bool1=true;}
            case DMY_HMSS:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5866);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5867);day = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5868);month = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5869);year = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5870);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5871);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5872);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5873);break;
            case YMD_HMS:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5874);__CLB4_5_2_bool1=true;}
            case YMD_HMSS:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5875);__CLB4_5_2_bool1=true;}
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_24dx4dxlwydzkz1.R.inc(5876);__CLB4_5_2_bool1=true;}
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5877);year = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5878);month = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5879);day = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5880);hour = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5881);minute = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5882);second = nextInt(0);
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5883);break;
        }

        __CLR4_5_24dx4dxlwydzkz1.R.inc(5884);if ((((format == DateTimeFormat.YMD_HMSS || format == DateTimeFormat.DMY_HMSS)&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5885)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5886)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5887);millisecond = nextInt(0); // (ddd)
        }

        }__CLR4_5_24dx4dxlwydzkz1.R.inc(5888);if ((((year >= 0 && year < 100)&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5889)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5890)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5891);year += 2000;
        }

        }__CLR4_5_24dx4dxlwydzkz1.R.inc(5892);DateBuilder dateBuilder;
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5893);if ((((format != DateTimeFormat.HMS && format != DateTimeFormat.SMH)&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5894)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5895)==0&false))) {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5896);if ((((timeZone != null)&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5897)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5898)==0&false))) {{
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5899);dateBuilder = new DateBuilder(TimeZone.getTimeZone(timeZone));
            } }else {{
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5900);dateBuilder = new DateBuilder();
            }
            }__CLR4_5_24dx4dxlwydzkz1.R.inc(5901);dateBuilder.setDate(year, month, day);
        } }else {{
            __CLR4_5_24dx4dxlwydzkz1.R.inc(5902);if ((((timeZone != null)&&(__CLR4_5_24dx4dxlwydzkz1.R.iget(5903)!=0|true))||(__CLR4_5_24dx4dxlwydzkz1.R.iget(5904)==0&false))) {{
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5905);dateBuilder = new DateBuilder(new Date(), TimeZone.getTimeZone(timeZone));
            } }else {{
                __CLR4_5_24dx4dxlwydzkz1.R.inc(5906);dateBuilder = new DateBuilder(new Date());
            }
        }}

        }__CLR4_5_24dx4dxlwydzkz1.R.inc(5907);dateBuilder.setTime(hour, minute, second, millisecond);

        __CLR4_5_24dx4dxlwydzkz1.R.inc(5908);return dateBuilder.getDate();
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public Date nextDateTime(DateTimeFormat format) {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5909);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5910);return nextDateTime(format, null);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

    public Date nextDateTime() {try{__CLR4_5_24dx4dxlwydzkz1.R.inc(5911);
        __CLR4_5_24dx4dxlwydzkz1.R.inc(5912);return nextDateTime(DateTimeFormat.YMD_HMS, null);
    }finally{__CLR4_5_24dx4dxlwydzkz1.R.flushNeeded();}}

}
