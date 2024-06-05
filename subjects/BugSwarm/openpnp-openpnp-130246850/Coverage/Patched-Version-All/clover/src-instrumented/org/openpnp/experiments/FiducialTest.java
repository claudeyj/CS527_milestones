/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * FiducialTest code provided by Cri S. Demonstrates round fiducial finding using contours.
 */

package org.openpnp.experiments;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class FiducialTest {static class __CLR4_5_21e1elx1h8ce6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,170,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static {try{__CLR4_5_21e1elx1h8ce6.R.inc(50);
        __CLR4_5_21e1elx1h8ce6.R.inc(51);nu.pattern.OpenCV.loadShared();
        __CLR4_5_21e1elx1h8ce6.R.inc(52);System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }finally{__CLR4_5_21e1elx1h8ce6.R.flushNeeded();}}

    public static void showResult(String name, Mat img) {try{__CLR4_5_21e1elx1h8ce6.R.inc(53);
        // Imgproc.resize(img, img, new Size(640, 480));
        __CLR4_5_21e1elx1h8ce6.R.inc(54);MatOfByte matOfByte = new MatOfByte();
        __CLR4_5_21e1elx1h8ce6.R.inc(55);Highgui.imencode(".jpg", img, matOfByte);
        __CLR4_5_21e1elx1h8ce6.R.inc(56);byte[] byteArray = matOfByte.toArray();
        __CLR4_5_21e1elx1h8ce6.R.inc(57);BufferedImage bufImage = null;
        __CLR4_5_21e1elx1h8ce6.R.inc(58);try {
            __CLR4_5_21e1elx1h8ce6.R.inc(59);InputStream in = new ByteArrayInputStream(byteArray);
            __CLR4_5_21e1elx1h8ce6.R.inc(60);bufImage = ImageIO.read(in);
            __CLR4_5_21e1elx1h8ce6.R.inc(61);final JFrame frame = new JFrame(name);
            __CLR4_5_21e1elx1h8ce6.R.inc(62);frame.getContentPane().add(new JLabel(new ImageIcon(bufImage)));
            __CLR4_5_21e1elx1h8ce6.R.inc(63);frame.pack();
            __CLR4_5_21e1elx1h8ce6.R.inc(64);frame.setVisible(true);
            // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            __CLR4_5_21e1elx1h8ce6.R.inc(65);frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT");
            __CLR4_5_21e1elx1h8ce6.R.inc(66);frame.getRootPane().getActionMap().put("EXIT", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {try{__CLR4_5_21e1elx1h8ce6.R.inc(67);
                    // frame.dispose();
                    __CLR4_5_21e1elx1h8ce6.R.inc(68);System.exit(0);
                }finally{__CLR4_5_21e1elx1h8ce6.R.flushNeeded();}}
            });
        }
        catch (Exception e) {
            __CLR4_5_21e1elx1h8ce6.R.inc(69);e.printStackTrace();
        }
    }finally{__CLR4_5_21e1elx1h8ce6.R.flushNeeded();}}

    public static void showResult(Mat img) {try{__CLR4_5_21e1elx1h8ce6.R.inc(70);
        __CLR4_5_21e1elx1h8ce6.R.inc(71);showResult("", img);
    }finally{__CLR4_5_21e1elx1h8ce6.R.flushNeeded();}}

    static private Mat dst;

    // triangle, square and diamont code removed
    static public Point fiducial(Mat gray, int min, int max) throws Exception {try{__CLR4_5_21e1elx1h8ce6.R.inc(72);
        __CLR4_5_21e1elx1h8ce6.R.inc(73);final List<MatOfPoint> contours = new ArrayList<>();
        // final List<Rect> box = new ArrayList<>();
        __CLR4_5_21e1elx1h8ce6.R.inc(74);final List<RotatedRect> box = new ArrayList<>();
        __CLR4_5_21e1elx1h8ce6.R.inc(75);final List<Double> dist = new ArrayList<>();
        __CLR4_5_21e1elx1h8ce6.R.inc(76);final Mat dummy = new Mat();
        // final Mat gray= OpenCvUtils.toMat(image,Highgui.IMREAD_GRAYSCALE);
        // prepare image
        __CLR4_5_21e1elx1h8ce6.R.inc(77);if ((((gray.empty())&&(__CLR4_5_21e1elx1h8ce6.R.iget(78)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(79)==0&false)))
            {__CLR4_5_21e1elx1h8ce6.R.inc(80);return null;
        }__CLR4_5_21e1elx1h8ce6.R.inc(81);final Point ret = new Point(gray.width() / 2, gray.height() / 2);
        __CLR4_5_21e1elx1h8ce6.R.inc(82);final Mat bw = new Mat();
        __CLR4_5_21e1elx1h8ce6.R.inc(83);Imgproc.GaussianBlur(gray, gray, new Size(7, 7), 0);
        __CLR4_5_21e1elx1h8ce6.R.inc(84);Imgproc.Canny(gray, bw, 0, 50, 5, false);
        __CLR4_5_21e1elx1h8ce6.R.inc(85);Imgproc.threshold(bw, bw, 100, 255, 0);
        __CLR4_5_21e1elx1h8ce6.R.inc(86);showResult("Canny", bw);
        // scan blobs
        __CLR4_5_21e1elx1h8ce6.R.inc(87);Imgproc.findContours(bw, contours, dummy, Imgproc.RETR_LIST, Imgproc.CHAIN_APPROX_SIMPLE);
        // get dimension, in java bit different

        __CLR4_5_21e1elx1h8ce6.R.inc(88);final MatOfPoint2f temp = new MatOfPoint2f();
        __CLR4_5_21e1elx1h8ce6.R.inc(89);for (int i = 0; (((i < contours.size())&&(__CLR4_5_21e1elx1h8ce6.R.iget(90)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(91)==0&false)); i++) {{
            __CLR4_5_21e1elx1h8ce6.R.inc(92);temp.fromList(contours.get(i).toList());
            __CLR4_5_21e1elx1h8ce6.R.inc(93);box.add(Imgproc.minAreaRect(temp));
        }

        // filter blob
        }__CLR4_5_21e1elx1h8ce6.R.inc(94);for (int i = contours.size(); (((i-- > 0)&&(__CLR4_5_21e1elx1h8ce6.R.iget(95)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(96)==0&false));) {{
            __CLR4_5_21e1elx1h8ce6.R.inc(97);double a, l, t, f, x, y;
            __CLR4_5_21e1elx1h8ce6.R.inc(98);temp.fromList(contours.get(i).toList());
            __CLR4_5_21e1elx1h8ce6.R.inc(99);f = box.get(i).size.width / box.get(i).size.height;
            __CLR4_5_21e1elx1h8ce6.R.inc(100);l = Imgproc.arcLength(temp, true);
            __CLR4_5_21e1elx1h8ce6.R.inc(101);a = Imgproc.contourArea(contours.get(i));
            __CLR4_5_21e1elx1h8ce6.R.inc(102);t = (a / (Math.PI * Math.pow(box.get(i).size.width / 2, 2)));
            __CLR4_5_21e1elx1h8ce6.R.inc(103);if ((((f <= 0.8 || f >= 1.2 || t >= 1.2 || t <= 0.8 || box.get(i).size.width < min
                    || box.get(i).size.width > max || a < 100.)&&(__CLR4_5_21e1elx1h8ce6.R.iget(104)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(105)==0&false))) {{
                __CLR4_5_21e1elx1h8ce6.R.inc(106);contours.remove(i);
                __CLR4_5_21e1elx1h8ce6.R.inc(107);continue;
            }

            }__CLR4_5_21e1elx1h8ce6.R.inc(108);final MatOfPoint2f approx = new MatOfPoint2f();
            __CLR4_5_21e1elx1h8ce6.R.inc(109);final MatOfPoint matrix = new MatOfPoint();
            __CLR4_5_21e1elx1h8ce6.R.inc(110);Imgproc.approxPolyDP(temp, approx, l * 0.02, true);
            __CLR4_5_21e1elx1h8ce6.R.inc(111);approx.convertTo(matrix, CvType.CV_32S); // in java different
            // matrix.fromList(temp.toList()); // gives lot of trouble

            __CLR4_5_21e1elx1h8ce6.R.inc(112);if ((((approx.toList().size() <= 6)&&(__CLR4_5_21e1elx1h8ce6.R.iget(113)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(114)==0&false))) // java thing
            {{
                __CLR4_5_21e1elx1h8ce6.R.inc(115);contours.remove(i);
                __CLR4_5_21e1elx1h8ce6.R.inc(116);continue;
            }
            }__CLR4_5_21e1elx1h8ce6.R.inc(117);if ((((!Imgproc.isContourConvex(matrix))&&(__CLR4_5_21e1elx1h8ce6.R.iget(118)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(119)==0&false))) {{
                __CLR4_5_21e1elx1h8ce6.R.inc(120);contours.remove(i);
                __CLR4_5_21e1elx1h8ce6.R.inc(121);continue;
            }

            }__CLR4_5_21e1elx1h8ce6.R.inc(122);x = (box.get(i).center.x - ret.x);
            __CLR4_5_21e1elx1h8ce6.R.inc(123);y = (box.get(i).center.y - ret.y);
            __CLR4_5_21e1elx1h8ce6.R.inc(124);dist.add(0, x * x + y * y); // in java different
        }
        // return blob
        }__CLR4_5_21e1elx1h8ce6.R.inc(125);if ((((contours.size() != 0)&&(__CLR4_5_21e1elx1h8ce6.R.iget(126)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(127)==0&false))) {{
            __CLR4_5_21e1elx1h8ce6.R.inc(128);int i = 0; // holds nearest blob
            __CLR4_5_21e1elx1h8ce6.R.inc(129);Rect r;
            // search nearest blob
            __CLR4_5_21e1elx1h8ce6.R.inc(130);for (int j = 1; (((j < contours.size())&&(__CLR4_5_21e1elx1h8ce6.R.iget(131)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(132)==0&false)); j++)
                {__CLR4_5_21e1elx1h8ce6.R.inc(133);if ((((dist.get(j) < dist.get(i))&&(__CLR4_5_21e1elx1h8ce6.R.iget(134)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(135)==0&false)))
                    {__CLR4_5_21e1elx1h8ce6.R.inc(136);i = j;
            }}__CLR4_5_21e1elx1h8ce6.R.inc(137);r = Imgproc.boundingRect(contours.get(i)); // java thing
            // >>>>>>>>>>> this is for debug output, not for function
            __CLR4_5_21e1elx1h8ce6.R.inc(138);Imgproc.drawContours(dst, contours, i, new Scalar(0, 0, 255), 2); // java
                                                                              // thing
            __CLR4_5_21e1elx1h8ce6.R.inc(139);Core.circle(dst, ret, 4, new Scalar(0, 255, 255), -1);
            __CLR4_5_21e1elx1h8ce6.R.inc(140);Core.circle(dst, new Point(r.x + r.width / 2, r.y + r.height / 2), 4,
                    new Scalar(0, 0, 255), -1);
            __CLR4_5_21e1elx1h8ce6.R.inc(141);showResult("found", dst);
            // <<<<<<<<<<< end of debug
            // do java problem, it don't have supixel resulution, as cv version
            __CLR4_5_21e1elx1h8ce6.R.inc(142);ret.x = r.x + r.width / 2 - ret.x;
            __CLR4_5_21e1elx1h8ce6.R.inc(143);ret.y = r.y + r.height / 2 - ret.y;
            __CLR4_5_21e1elx1h8ce6.R.inc(144);ret.y *= -1; // adj coord system
            __CLR4_5_21e1elx1h8ce6.R.inc(145);return ret;
        }
        // no blob found
        }__CLR4_5_21e1elx1h8ce6.R.inc(146);return null;
    }finally{__CLR4_5_21e1elx1h8ce6.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_5_21e1elx1h8ce6.R.inc(147);
        __CLR4_5_21e1elx1h8ce6.R.inc(148);int min = 0, max = 999999;
        __CLR4_5_21e1elx1h8ce6.R.inc(149);args = new String[] {"",
                "/Users/jason/.openpnp/org.openpnp.machine.reference.vision.OpenCvVisionProvider/camera_41173395697117969.png",
                "/Users/jason/Desktop/result.png"};
        __CLR4_5_21e1elx1h8ce6.R.inc(150);if ((((args.length > 2)&&(__CLR4_5_21e1elx1h8ce6.R.iget(151)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(152)==0&false)))
            {__CLR4_5_21e1elx1h8ce6.R.inc(153);;
        }else {{
            __CLR4_5_21e1elx1h8ce6.R.inc(154);System.out.println("Usage: <prg> <image> <result> [ <min-pixel> <max-pixel> ]");
            __CLR4_5_21e1elx1h8ce6.R.inc(155);return;
        }
        }__CLR4_5_21e1elx1h8ce6.R.inc(156);if ((((args.length > 4)&&(__CLR4_5_21e1elx1h8ce6.R.iget(157)!=0|true))||(__CLR4_5_21e1elx1h8ce6.R.iget(158)==0&false))) {{
            __CLR4_5_21e1elx1h8ce6.R.inc(159);min = Integer.valueOf(args[3]);
            __CLR4_5_21e1elx1h8ce6.R.inc(160);max = Integer.valueOf(args[4]);
        }
        // System.out.println("Usage: <prg> " + args[1]+" "+args[2]);
        }__CLR4_5_21e1elx1h8ce6.R.inc(161);Mat src = Highgui.imread(args[1], 0);
        __CLR4_5_21e1elx1h8ce6.R.inc(162);dst = Highgui.imread(args[1], 1);
        // showResult(dst);
        __CLR4_5_21e1elx1h8ce6.R.inc(163);Imgproc.cvtColor(src, dst, Imgproc.COLOR_GRAY2BGR);

        __CLR4_5_21e1elx1h8ce6.R.inc(164);Point p = fiducial(src, min, max);
        __CLR4_5_21e1elx1h8ce6.R.inc(165);try {
            __CLR4_5_21e1elx1h8ce6.R.inc(166);System.out.println("Point: " + p.x + " " + p.y);
            __CLR4_5_21e1elx1h8ce6.R.inc(167);Highgui.imwrite(args[2], dst);
            // showResult("dst",dst);
        }
        catch (Exception ex) {
            __CLR4_5_21e1elx1h8ce6.R.inc(168);;
        }

        __CLR4_5_21e1elx1h8ce6.R.inc(169);return;
    }finally{__CLR4_5_21e1elx1h8ce6.R.flushNeeded();}}

}
