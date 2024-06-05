/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar.geofence;

import java.text.ParseException;
import java.util.ArrayList;

public class GeofencePolygon extends GeofenceGeometry {public static class __CLR4_5_23qf3qflwydwac3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,4948,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GeofencePolygon() {try{__CLR4_5_23qf3qflwydwac3.R.inc(4839);
    }finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

    public GeofencePolygon(String wkt) throws ParseException {try{__CLR4_5_23qf3qflwydwac3.R.inc(4840);
        __CLR4_5_23qf3qflwydwac3.R.inc(4841);fromWkt(wkt);
    }finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

    private ArrayList<Coordinate> coordinates;

    private double[] constant;
    private double[] multiple;

    private boolean needNormalize = false;

    private void precalc() {try{__CLR4_5_23qf3qflwydwac3.R.inc(4842);
        __CLR4_5_23qf3qflwydwac3.R.inc(4843);if ((((coordinates == null)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4844)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4845)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4846);return;
        }

        }__CLR4_5_23qf3qflwydwac3.R.inc(4847);int polyCorners = coordinates.size();
        __CLR4_5_23qf3qflwydwac3.R.inc(4848);int i;
        __CLR4_5_23qf3qflwydwac3.R.inc(4849);int j = polyCorners - 1;

        __CLR4_5_23qf3qflwydwac3.R.inc(4850);if ((((constant != null)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4851)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4852)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4853);constant = null;
        }
        }__CLR4_5_23qf3qflwydwac3.R.inc(4854);if ((((multiple != null)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4855)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4856)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4857);multiple = null;
        }

        }__CLR4_5_23qf3qflwydwac3.R.inc(4858);constant = new double[polyCorners];
        __CLR4_5_23qf3qflwydwac3.R.inc(4859);multiple = new double[polyCorners];

        __CLR4_5_23qf3qflwydwac3.R.inc(4860);boolean hasNegative = false;
        __CLR4_5_23qf3qflwydwac3.R.inc(4861);boolean hasPositive = false;
        __CLR4_5_23qf3qflwydwac3.R.inc(4862);for (i = 0; (((i < polyCorners)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4863)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4864)==0&false)); i++) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4865);if ((((coordinates.get(i).getLon() > 90)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4866)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4867)==0&false))) {{
                __CLR4_5_23qf3qflwydwac3.R.inc(4868);hasPositive = true;
            } }else {__CLR4_5_23qf3qflwydwac3.R.inc(4869);if ((((coordinates.get(i).getLon() < -90)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4870)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4871)==0&false))) {{
                __CLR4_5_23qf3qflwydwac3.R.inc(4872);hasNegative = true;
            }
        }}}
        }__CLR4_5_23qf3qflwydwac3.R.inc(4873);needNormalize = hasPositive && hasNegative;

        __CLR4_5_23qf3qflwydwac3.R.inc(4874);for (i = 0; (((i < polyCorners)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4875)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4876)==0&false)); j = i++) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4877);if ((((normalizeLon(coordinates.get(j).getLon()) == normalizeLon(coordinates.get(i).getLon()))&&(__CLR4_5_23qf3qflwydwac3.R.iget(4878)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4879)==0&false))) {{
                __CLR4_5_23qf3qflwydwac3.R.inc(4880);constant[i] = coordinates.get(i).getLat();
                __CLR4_5_23qf3qflwydwac3.R.inc(4881);multiple[i] = 0;
            } }else {{
                __CLR4_5_23qf3qflwydwac3.R.inc(4882);constant[i] = coordinates.get(i).getLat()
                        - (normalizeLon(coordinates.get(i).getLon()) * coordinates.get(j).getLat())
                        / (normalizeLon(coordinates.get(j).getLon()) - normalizeLon(coordinates.get(i).getLon()))
                        + (normalizeLon(coordinates.get(i).getLon()) * coordinates.get(i).getLat())
                        / (normalizeLon(coordinates.get(j).getLon()) - normalizeLon(coordinates.get(i).getLon()));
                __CLR4_5_23qf3qflwydwac3.R.inc(4883);multiple[i] = (coordinates.get(j).getLat() - coordinates.get(i).getLat())
                        / (normalizeLon(coordinates.get(j).getLon()) - normalizeLon(coordinates.get(i).getLon()));
            }
        }}
    }}finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

    private double normalizeLon(double lon) {try{__CLR4_5_23qf3qflwydwac3.R.inc(4884);
        __CLR4_5_23qf3qflwydwac3.R.inc(4885);if ((((needNormalize && lon < -90)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4886)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4887)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4888);return lon + 360;
        }
        }__CLR4_5_23qf3qflwydwac3.R.inc(4889);return lon;
    }finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

    @Override
    public boolean containsPoint(double latitude, double longitude) {try{__CLR4_5_23qf3qflwydwac3.R.inc(4890);

        __CLR4_5_23qf3qflwydwac3.R.inc(4891);int polyCorners = coordinates.size();
        __CLR4_5_23qf3qflwydwac3.R.inc(4892);int i;
        __CLR4_5_23qf3qflwydwac3.R.inc(4893);int j = polyCorners - 1;
        __CLR4_5_23qf3qflwydwac3.R.inc(4894);double longitudeNorm = normalizeLon(longitude);
        __CLR4_5_23qf3qflwydwac3.R.inc(4895);boolean oddNodes = false;

        __CLR4_5_23qf3qflwydwac3.R.inc(4896);for (i = 0; (((i < polyCorners)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4897)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4898)==0&false)); j = i++) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4899);if ((((normalizeLon(coordinates.get(i).getLon()) < longitudeNorm
                    && normalizeLon(coordinates.get(j).getLon()) >= longitudeNorm
                    || normalizeLon(coordinates.get(j).getLon()) < longitudeNorm
                    && normalizeLon(coordinates.get(i).getLon()) >= longitudeNorm)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4900)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4901)==0&false))) {{
                __CLR4_5_23qf3qflwydwac3.R.inc(4902);oddNodes ^= longitudeNorm * multiple[i] + constant[i] < latitude;
            }
        }}
        }__CLR4_5_23qf3qflwydwac3.R.inc(4903);return oddNodes;
    }finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

    @Override
    public String toWkt() {try{__CLR4_5_23qf3qflwydwac3.R.inc(4904);
        __CLR4_5_23qf3qflwydwac3.R.inc(4905);StringBuilder buf = new StringBuilder();
        __CLR4_5_23qf3qflwydwac3.R.inc(4906);buf.append("POLYGON ((");
        __CLR4_5_23qf3qflwydwac3.R.inc(4907);for (Coordinate coordinate : coordinates) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4908);buf.append(String.valueOf(coordinate.getLat()));
            __CLR4_5_23qf3qflwydwac3.R.inc(4909);buf.append(" ");
            __CLR4_5_23qf3qflwydwac3.R.inc(4910);buf.append(String.valueOf(coordinate.getLon()));
            __CLR4_5_23qf3qflwydwac3.R.inc(4911);buf.append(", ");
        }
        }__CLR4_5_23qf3qflwydwac3.R.inc(4912);return buf.substring(0, buf.length() - 2) + "))";
    }finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

    @Override
    public void fromWkt(String wkt) throws ParseException {try{__CLR4_5_23qf3qflwydwac3.R.inc(4913);
        __CLR4_5_23qf3qflwydwac3.R.inc(4914);if ((((coordinates == null)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4915)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4916)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4917);coordinates = new ArrayList<>();
        } }else {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4918);coordinates.clear();
        }

        }__CLR4_5_23qf3qflwydwac3.R.inc(4919);if ((((!wkt.startsWith("POLYGON"))&&(__CLR4_5_23qf3qflwydwac3.R.iget(4920)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4921)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4922);throw new ParseException("Mismatch geometry type", 0);
        }
        }__CLR4_5_23qf3qflwydwac3.R.inc(4923);String content = wkt.substring(wkt.indexOf("((") + 2, wkt.indexOf("))"));
        __CLR4_5_23qf3qflwydwac3.R.inc(4924);if ((((content.isEmpty())&&(__CLR4_5_23qf3qflwydwac3.R.iget(4925)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4926)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4927);throw new ParseException("No content", 0);
        }
        }__CLR4_5_23qf3qflwydwac3.R.inc(4928);String[] commaTokens = content.split(",");
        __CLR4_5_23qf3qflwydwac3.R.inc(4929);if ((((commaTokens.length < 3)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4930)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4931)==0&false))) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4932);throw new ParseException("Not valid content", 0);
        }

        }__CLR4_5_23qf3qflwydwac3.R.inc(4933);for (String commaToken : commaTokens) {{
            __CLR4_5_23qf3qflwydwac3.R.inc(4934);String[] tokens = commaToken.trim().split("\\s");
            __CLR4_5_23qf3qflwydwac3.R.inc(4935);if ((((tokens.length != 2)&&(__CLR4_5_23qf3qflwydwac3.R.iget(4936)!=0|true))||(__CLR4_5_23qf3qflwydwac3.R.iget(4937)==0&false))) {{
                __CLR4_5_23qf3qflwydwac3.R.inc(4938);throw new ParseException("Here must be two coordinates: " + commaToken, 0);
            }
            }__CLR4_5_23qf3qflwydwac3.R.inc(4939);Coordinate coordinate = new Coordinate();
            __CLR4_5_23qf3qflwydwac3.R.inc(4940);try {
                __CLR4_5_23qf3qflwydwac3.R.inc(4941);coordinate.setLat(Double.parseDouble(tokens[0]));
            } catch (NumberFormatException e) {
                __CLR4_5_23qf3qflwydwac3.R.inc(4942);throw new ParseException(tokens[0] + " is not a double", 0);
            }
            __CLR4_5_23qf3qflwydwac3.R.inc(4943);try {
                __CLR4_5_23qf3qflwydwac3.R.inc(4944);coordinate.setLon(Double.parseDouble(tokens[1]));
            } catch (NumberFormatException e) {
                __CLR4_5_23qf3qflwydwac3.R.inc(4945);throw new ParseException(tokens[1] + " is not a double", 0);
            }
            __CLR4_5_23qf3qflwydwac3.R.inc(4946);coordinates.add(coordinate);
        }
        }__CLR4_5_23qf3qflwydwac3.R.inc(4947);precalc();
    }finally{__CLR4_5_23qf3qflwydwac3.R.flushNeeded();}}

}
