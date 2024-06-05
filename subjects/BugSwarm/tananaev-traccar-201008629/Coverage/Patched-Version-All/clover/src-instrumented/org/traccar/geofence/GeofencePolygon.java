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

public class GeofencePolygon extends GeofenceGeometry {public static class __CLR4_5_23eg3eglx1e1ihv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,4517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GeofencePolygon() {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4408);
    }finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

    public GeofencePolygon(String wkt) throws ParseException {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4409);
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4410);fromWkt(wkt);
    }finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

    private ArrayList<Coordinate> coordinates;

    private double[] constant;
    private double[] multiple;

    private boolean needNormalize = false;

    private void precalc() {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4411);
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4412);if ((((coordinates == null)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4413)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4414)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4415);return;
        }

        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4416);int polyCorners = coordinates.size();
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4417);int i;
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4418);int j = polyCorners - 1;

        __CLR4_5_23eg3eglx1e1ihv.R.inc(4419);if ((((constant != null)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4420)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4421)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4422);constant = null;
        }
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4423);if ((((multiple != null)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4424)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4425)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4426);multiple = null;
        }

        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4427);constant = new double[polyCorners];
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4428);multiple = new double[polyCorners];

        __CLR4_5_23eg3eglx1e1ihv.R.inc(4429);boolean hasNegative = false;
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4430);boolean hasPositive = false;
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4431);for (i = 0; (((i < polyCorners)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4432)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4433)==0&false)); i++) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4434);if ((((coordinates.get(i).getLon() > 90)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4435)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4436)==0&false))) {{
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4437);hasPositive = true;
            } }else {__CLR4_5_23eg3eglx1e1ihv.R.inc(4438);if ((((coordinates.get(i).getLon() < -90)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4439)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4440)==0&false))) {{
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4441);hasNegative = true;
            }
        }}}
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4442);needNormalize = hasPositive && hasNegative;

        __CLR4_5_23eg3eglx1e1ihv.R.inc(4443);for (i = 0; (((i < polyCorners)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4444)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4445)==0&false)); j = i++) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4446);if ((((normalizeLon(coordinates.get(j).getLon()) == normalizeLon(coordinates.get(i).getLon()))&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4447)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4448)==0&false))) {{
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4449);constant[i] = coordinates.get(i).getLat();
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4450);multiple[i] = 0;
            } }else {{
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4451);constant[i] = coordinates.get(i).getLat()
                        - (normalizeLon(coordinates.get(i).getLon()) * coordinates.get(j).getLat())
                        / (normalizeLon(coordinates.get(j).getLon()) - normalizeLon(coordinates.get(i).getLon()))
                        + (normalizeLon(coordinates.get(i).getLon()) * coordinates.get(i).getLat())
                        / (normalizeLon(coordinates.get(j).getLon()) - normalizeLon(coordinates.get(i).getLon()));
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4452);multiple[i] = (coordinates.get(j).getLat() - coordinates.get(i).getLat())
                        / (normalizeLon(coordinates.get(j).getLon()) - normalizeLon(coordinates.get(i).getLon()));
            }
        }}
    }}finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

    private double normalizeLon(double lon) {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4453);
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4454);if ((((needNormalize && lon < -90)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4455)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4456)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4457);return lon + 360;
        }
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4458);return lon;
    }finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

    @Override
    public boolean containsPoint(double latitude, double longitude) {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4459);

        __CLR4_5_23eg3eglx1e1ihv.R.inc(4460);int polyCorners = coordinates.size();
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4461);int i;
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4462);int j = polyCorners - 1;
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4463);double longitudeNorm = normalizeLon(longitude);
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4464);boolean oddNodes = false;

        __CLR4_5_23eg3eglx1e1ihv.R.inc(4465);for (i = 0; (((i < polyCorners)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4466)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4467)==0&false)); j = i++) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4468);if ((((normalizeLon(coordinates.get(i).getLon()) < longitudeNorm
                    && normalizeLon(coordinates.get(j).getLon()) >= longitudeNorm
                    || normalizeLon(coordinates.get(j).getLon()) < longitudeNorm
                    && normalizeLon(coordinates.get(i).getLon()) >= longitudeNorm)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4469)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4470)==0&false))) {{
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4471);oddNodes ^= longitudeNorm * multiple[i] + constant[i] < latitude;
            }
        }}
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4472);return oddNodes;
    }finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

    @Override
    public String toWkt() {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4473);
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4474);StringBuilder buf = new StringBuilder();
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4475);buf.append("POLYGON ((");
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4476);for (Coordinate coordinate : coordinates) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4477);buf.append(String.valueOf(coordinate.getLat()));
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4478);buf.append(" ");
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4479);buf.append(String.valueOf(coordinate.getLon()));
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4480);buf.append(", ");
        }
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4481);return buf.substring(0, buf.length() - 2) + "))";
    }finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

    @Override
    public void fromWkt(String wkt) throws ParseException {try{__CLR4_5_23eg3eglx1e1ihv.R.inc(4482);
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4483);if ((((coordinates == null)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4484)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4485)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4486);coordinates = new ArrayList<>();
        } }else {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4487);coordinates.clear();
        }

        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4488);if ((((!wkt.startsWith("POLYGON"))&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4489)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4490)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4491);throw new ParseException("Mismatch geometry type", 0);
        }
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4492);String content = wkt.substring(wkt.indexOf("((") + 2, wkt.indexOf("))"));
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4493);if ((((content.isEmpty())&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4494)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4495)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4496);throw new ParseException("No content", 0);
        }
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4497);String[] commaTokens = content.split(",");
        __CLR4_5_23eg3eglx1e1ihv.R.inc(4498);if ((((commaTokens.length < 3)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4499)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4500)==0&false))) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4501);throw new ParseException("Not valid content", 0);
        }

        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4502);for (String commaToken : commaTokens) {{
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4503);String[] tokens = commaToken.trim().split("\\s");
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4504);if ((((tokens.length != 2)&&(__CLR4_5_23eg3eglx1e1ihv.R.iget(4505)!=0|true))||(__CLR4_5_23eg3eglx1e1ihv.R.iget(4506)==0&false))) {{
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4507);throw new ParseException("Here must be two coordinates: " + commaToken, 0);
            }
            }__CLR4_5_23eg3eglx1e1ihv.R.inc(4508);Coordinate coordinate = new Coordinate();
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4509);try {
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4510);coordinate.setLat(Double.parseDouble(tokens[0]));
            } catch (NumberFormatException e) {
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4511);throw new ParseException(tokens[0] + " is not a double", 0);
            }
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4512);try {
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4513);coordinate.setLon(Double.parseDouble(tokens[1]));
            } catch (NumberFormatException e) {
                __CLR4_5_23eg3eglx1e1ihv.R.inc(4514);throw new ParseException(tokens[1] + " is not a double", 0);
            }
            __CLR4_5_23eg3eglx1e1ihv.R.inc(4515);coordinates.add(coordinate);
        }
        }__CLR4_5_23eg3eglx1e1ihv.R.inc(4516);precalc();
    }finally{__CLR4_5_23eg3eglx1e1ihv.R.flushNeeded();}}

}
