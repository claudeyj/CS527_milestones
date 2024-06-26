/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.opencv.core.Point;

public class Ransac {public static class __CLR4_5_2fitfitlx1h3cvi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,20218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * http://users.utcluj.ro/~igiosan/Resources/PRS/L1/lab_01e.pdf
     * http://cs.gmu.edu/~kosecka/cs682/lect-fitting.pdf
     * http://introcs.cs.princeton.edu/java/36inheritance/LeastSquares.java.html
     */
    public static Point[] ransac(List<Point> points, int maxIterations, double threshold) {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20117);
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20118);Point bestA = null, bestB = null;
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20119);int bestInliers = 0;
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20120);for (int i = 0; (((i < maxIterations)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20121)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20122)==0&false)); i++) {{
            // take a random sample of two points
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20123);Collections.shuffle(points);
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20124);Point a = points.get(0);
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20125);Point b = points.get(1);
            // find the inliers
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20126);int inliers = 0;
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20127);for (Point p : points) {{
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20128);double distance = FluentCv.pointToLineDistance(a, b, p);
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20129);if ((((distance <= threshold)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20130)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20131)==0&false))) {{
                    __CLR4_5_2fitfitlx1h3cvi.R.inc(20132);inliers++;
                }
            }}
            }__CLR4_5_2fitfitlx1h3cvi.R.inc(20133);if ((((inliers > bestInliers)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20134)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20135)==0&false))) {{
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20136);bestA = a;
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20137);bestB = b;
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20138);bestInliers = inliers;
            }
        }}
        }__CLR4_5_2fitfitlx1h3cvi.R.inc(20139);return new Point[] {bestA, bestB};
    }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}

    // TODO: This currently seems to give much worse results than ransac. Figure out why.
    public static List<RansacLine> multiRansac(List<Point> points, int maxIterations,
            double threshold) {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20140);
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20141);Random random = new Random();
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20142);Set<RansacLine> lines = new HashSet<>();
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20143);for (int i = 0; (((i < maxIterations)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20144)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20145)==0&false)); i++) {{
            // take a random sample of two points
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20146);Point a = points.get(random.nextInt(points.size()));
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20147);Point b = points.get(random.nextInt(points.size()));
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20148);RansacLine line = new RansacLine(a, b, 0);
            // if we have already processed this pair, skip it
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20149);if ((((lines.contains(line))&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20150)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20151)==0&false))) {{
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20152);continue;
            }
            // add the result
            }__CLR4_5_2fitfitlx1h3cvi.R.inc(20153);lines.add(line);
            // find the inliers
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20154);for (Point p : points) {{
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20155);double distance = FluentCv.pointToLineDistance(a, b, p);
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20156);if ((((distance <= threshold)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20157)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20158)==0&false))) {{
                    __CLR4_5_2fitfitlx1h3cvi.R.inc(20159);line.inliers++;
                }
            }}
        }}
        }__CLR4_5_2fitfitlx1h3cvi.R.inc(20160);List<RansacLine> results = new ArrayList<>(lines);
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20161);Collections.sort(results, new Comparator<RansacLine>() {
            @Override
            public int compare(RansacLine o1, RansacLine o2) {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20162);
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20163);return o2.inliers - o1.inliers;
            }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}
        });
        __CLR4_5_2fitfitlx1h3cvi.R.inc(20164);return results;
    }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}

    public static class RansacLine {
        public Point a;
        public Point b;
        public transient int inliers;

        public RansacLine(Point a, Point b, int inliers) {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20165);
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20166);this.a = a;
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20167);this.b = b;
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20168);this.inliers = inliers;
        }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20169);
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20170);final int prime = 31;
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20171);int result = 1;
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20172);result = prime * result + (((((a == null) )&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20173)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20174)==0&false))? 0 : a.hashCode());
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20175);result = prime * result + (((((b == null) )&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20176)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20177)==0&false))? 0 : b.hashCode());
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20178);return result;
        }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20179);
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20180);if ((((this == obj)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20181)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20182)==0&false)))
                {__CLR4_5_2fitfitlx1h3cvi.R.inc(20183);return true;
            }__CLR4_5_2fitfitlx1h3cvi.R.inc(20184);if ((((obj == null)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20185)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20186)==0&false)))
                {__CLR4_5_2fitfitlx1h3cvi.R.inc(20187);return false;
            }__CLR4_5_2fitfitlx1h3cvi.R.inc(20188);if ((((getClass() != obj.getClass())&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20189)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20190)==0&false)))
                {__CLR4_5_2fitfitlx1h3cvi.R.inc(20191);return false;
            }__CLR4_5_2fitfitlx1h3cvi.R.inc(20192);RansacLine other = (RansacLine) obj;
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20193);if ((((a == null)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20194)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20195)==0&false))) {{
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20196);if ((((other.a != null)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20197)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20198)==0&false)))
                    {__CLR4_5_2fitfitlx1h3cvi.R.inc(20199);return false;
            }}
            }else {__CLR4_5_2fitfitlx1h3cvi.R.inc(20200);if ((((!a.equals(other.a))&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20201)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20202)==0&false)))
                {__CLR4_5_2fitfitlx1h3cvi.R.inc(20203);return false;
            }}__CLR4_5_2fitfitlx1h3cvi.R.inc(20204);if ((((b == null)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20205)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20206)==0&false))) {{
                __CLR4_5_2fitfitlx1h3cvi.R.inc(20207);if ((((other.b != null)&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20208)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20209)==0&false)))
                    {__CLR4_5_2fitfitlx1h3cvi.R.inc(20210);return false;
            }}
            }else {__CLR4_5_2fitfitlx1h3cvi.R.inc(20211);if ((((!b.equals(other.b))&&(__CLR4_5_2fitfitlx1h3cvi.R.iget(20212)!=0|true))||(__CLR4_5_2fitfitlx1h3cvi.R.iget(20213)==0&false)))
                {__CLR4_5_2fitfitlx1h3cvi.R.inc(20214);return false;
            }}__CLR4_5_2fitfitlx1h3cvi.R.inc(20215);return true;
        }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2fitfitlx1h3cvi.R.inc(20216);
            __CLR4_5_2fitfitlx1h3cvi.R.inc(20217);return "RansacLine [a=" + a + ", b=" + b + ", inliers=" + inliers + "]";
        }finally{__CLR4_5_2fitfitlx1h3cvi.R.flushNeeded();}}
    }
}
