/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.stages;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.openpnp.vision.pipeline.CvStage.Result.TemplateMatch;
import org.simpleframework.xml.Attribute;

/**
 * OpenCV based image template matching with local maxima detection improvements from FireSight:
 * https://github.com/firepick1/FireSight. Scans the working image for matches of a template image
 * and returns a list of matches.
 */
public class MatchTemplate extends CvStage {public static class __CLR4_5_2g8hg8hlx1h1zay{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,21135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Name of a prior stage to load the template image from.
     */
    @Attribute
    private String templateStageName;

    /**
     * If maxVal is below this value, then no matches will be reported. Default is 0.7.
     */
    @Attribute
    private double threshold = 0.7f;

    /**
     * Normalized recognition threshold in the interval [0,1]. Used to determine best match of
     * candidates. For CV_TM_CCOEFF, CV_TM_CCOEFF_NORMED, CV_TM_CCORR, and CV_TM_CCORR_NORMED
     * methods, this is a minimum threshold for positive recognition; for all other methods, it is a
     * maximum threshold. Default is 0.85.
     */
    @Attribute
    private double corr = 0.85f;

    public String getTemplateStageName() {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21041);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21042);return templateStageName;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    public void setTemplateStageName(String templateStageName) {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21043);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21044);this.templateStageName = templateStageName;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    public double getThreshold() {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21045);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21046);return threshold;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    public void setThreshold(double threshold) {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21047);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21048);this.threshold = threshold;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    public double getCorr() {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21049);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21050);return corr;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    public void setCorr(double corr) {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21051);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21052);this.corr = corr;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    @Override
    public Result process(CvPipeline pipeline) throws Exception {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21053);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21054);if ((((templateStageName == null)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21055)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21056)==0&false))) {{
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21057);return null;
        }

        }__CLR4_5_2g8hg8hlx1h1zay.R.inc(21058);Mat mat = pipeline.getWorkingImage();
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21059);Mat template = pipeline.getResult(templateStageName).image;
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21060);Mat result = new Mat();

        // TODO: externalize type
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21061);Imgproc.matchTemplate(mat, template, result, Imgproc.TM_CCOEFF_NORMED);

        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21062);MinMaxLocResult mmr = Core.minMaxLoc(result);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21063);double maxVal = mmr.maxVal;

        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21064);double rangeMin = Math.max(threshold, corr * maxVal);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21065);double rangeMax = maxVal;


        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21066);List<TemplateMatch> matches = new ArrayList<>();
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21067);for (Point point : matMaxima(result, rangeMin, rangeMax)) {{
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21068);int x = point.x;
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21069);int y = point.y;
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21070);TemplateMatch match = new TemplateMatch(x, y, template.cols(), template.rows(),
                    result.get(y, x)[0] / maxVal);
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21071);matches.add(match);
        }

        }__CLR4_5_2g8hg8hlx1h1zay.R.inc(21072);Collections.sort(matches, new Comparator<TemplateMatch>() {
            @Override
            public int compare(TemplateMatch o1, TemplateMatch o2) {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21073);
                __CLR4_5_2g8hg8hlx1h1zay.R.inc(21074);return ((Double) o2.score).compareTo(o1.score);
            }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}
        });


        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21075);return new Result(result, matches);
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

    enum MinMaxState {
        BEFORE_INFLECTION, AFTER_INFLECTION
    }

    static List<Point> matMaxima(Mat mat, double rangeMin, double rangeMax) {try{__CLR4_5_2g8hg8hlx1h1zay.R.inc(21076);
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21077);List<Point> locations = new ArrayList<>();

        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21078);int rEnd = mat.rows() - 1;
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21079);int cEnd = mat.cols() - 1;

        // CHECK EACH ROW MAXIMA FOR LOCAL 2D MAXIMA
        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21080);for (int r = 0; (((r <= rEnd)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21081)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21082)==0&false)); r++) {{
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21083);MinMaxState state = MinMaxState.BEFORE_INFLECTION;
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21084);double curVal = mat.get(r, 0)[0];
            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21085);for (int c = 1; (((c <= cEnd)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21086)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21087)==0&false)); c++) {{
                __CLR4_5_2g8hg8hlx1h1zay.R.inc(21088);double val = mat.get(r, c)[0];

                __CLR4_5_2g8hg8hlx1h1zay.R.inc(21089);if ((((val == curVal)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21090)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21091)==0&false))) {{
                    __CLR4_5_2g8hg8hlx1h1zay.R.inc(21092);continue;
                }
                }else {__CLR4_5_2g8hg8hlx1h1zay.R.inc(21093);if ((((curVal < val)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21094)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21095)==0&false))) {{
                    __CLR4_5_2g8hg8hlx1h1zay.R.inc(21096);if ((((state == MinMaxState.BEFORE_INFLECTION)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21097)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21098)==0&false))) {{
                        // n/a
                    }
                    }else {{
                        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21099);state = MinMaxState.BEFORE_INFLECTION;
                    }
                }}
                }else {{ // curVal > val
                    __CLR4_5_2g8hg8hlx1h1zay.R.inc(21100);if ((((state == MinMaxState.BEFORE_INFLECTION)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21101)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21102)==0&false))) {{
                        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21103);if ((((rangeMin <= curVal && curVal <= rangeMax)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21104)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21105)==0&false))) {{ // ROW
                                                                        // MAXIMA
                            __CLR4_5_2g8hg8hlx1h1zay.R.inc(21106);if ((((0 < r && (mat.get(r - 1, c - 1)[0] >= curVal
                                    || mat.get(r - 1, c)[0] >= curVal))&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21107)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21108)==0&false))) {{
                                // cout << "reject:r-1 " << r << "," << c-1 <<
                                // endl;
                                // - x x
                                // - - -
                                // - - -
                            }
                            }else {__CLR4_5_2g8hg8hlx1h1zay.R.inc(21109);if ((((r < rEnd && (mat.get(r + 1, c - 1)[0] > curVal
                                    || mat.get(r + 1, c)[0] > curVal))&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21110)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21111)==0&false))) {{
                                // cout << "reject:r+1 " << r << "," << c-1 <<
                                // endl;
                                // - - -
                                // - - -
                                // - x x
                            }
                            }else {__CLR4_5_2g8hg8hlx1h1zay.R.inc(21112);if ((((1 < c && (0 < r && mat.get(r - 1, c - 2)[0] >= curVal
                                    || mat.get(r, c - 2)[0] > curVal
                                    || r < rEnd && mat.get(r + 1, c - 2)[0] > curVal))&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21113)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21114)==0&false))) {{
                                // cout << "reject:c-2 " << r << "," << c-1 <<
                                // endl;
                                // x - -
                                // x - -
                                // x - -
                            }
                            }else {{
                                __CLR4_5_2g8hg8hlx1h1zay.R.inc(21115);locations.add(new Point(c - 1, r));
                            }
                        }}}}
                        }__CLR4_5_2g8hg8hlx1h1zay.R.inc(21116);state = MinMaxState.AFTER_INFLECTION;
                    }
                    }else {{
                        // n/a
                    }
                }}

                }}__CLR4_5_2g8hg8hlx1h1zay.R.inc(21117);curVal = val;
            }

            // PROCESS END OF ROW
            }__CLR4_5_2g8hg8hlx1h1zay.R.inc(21118);if ((((state == MinMaxState.BEFORE_INFLECTION)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21119)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21120)==0&false))) {{
                __CLR4_5_2g8hg8hlx1h1zay.R.inc(21121);if ((((rangeMin <= curVal && curVal <= rangeMax)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21122)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21123)==0&false))) {{ // ROW MAXIMA
                    __CLR4_5_2g8hg8hlx1h1zay.R.inc(21124);if ((((0 < r && (mat.get(r - 1, cEnd - 1)[0] >= curVal
                            || mat.get(r - 1, cEnd)[0] >= curVal))&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21125)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21126)==0&false))) {{
                        // cout << "rejectEnd:r-1 " << r << "," << cEnd-1 <<
                        // endl;
                        // - x x
                        // - - -
                        // - - -
                    }
                    }else {__CLR4_5_2g8hg8hlx1h1zay.R.inc(21127);if ((((r < rEnd && (mat.get(r + 1, cEnd - 1)[0] > curVal
                            || mat.get(r + 1, cEnd)[0] > curVal))&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21128)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21129)==0&false))) {{
                        // cout << "rejectEnd:r+1 " << r << "," << cEnd-1 <<
                        // endl;
                        // - - -
                        // - - -
                        // - x x
                    }
                    }else {__CLR4_5_2g8hg8hlx1h1zay.R.inc(21130);if ((((1 < r && mat.get(r - 1, cEnd - 2)[0] >= curVal
                            || mat.get(r, cEnd - 2)[0] > curVal
                            || r < rEnd && mat.get(r + 1, cEnd - 2)[0] > curVal)&&(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21131)!=0|true))||(__CLR4_5_2g8hg8hlx1h1zay.R.iget(21132)==0&false))) {{
                        // cout << "rejectEnd:cEnd-2 " << r << "," << cEnd-1 <<
                        // endl;
                        // x - -
                        // x - -
                        // x - -
                    }
                    }else {{
                        __CLR4_5_2g8hg8hlx1h1zay.R.inc(21133);locations.add(new Point(cEnd, r));
                    }
                }}}}
            }}
        }}

        }__CLR4_5_2g8hg8hlx1h1zay.R.inc(21134);return locations;
    }finally{__CLR4_5_2g8hg8hlx1h1zay.R.flushNeeded();}}

}
