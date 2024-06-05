/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.experiments;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

import org.openpnp.model.Board;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Point;
import org.openpnp.util.HslColor;
import org.openpnp.util.Utils2D;

public class BottomVisionTest extends JComponent {static class __CLR4_5_2flmflmlx1h1z0q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,20326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Random random = new Random(0xdeadbeef);
    
    Location boardLocation = new Location(LengthUnit.Millimeters, 500, 350, 0, 15);
    Location placementLocation = new Location(LengthUnit.Millimeters, 50, 50, 0, 20);
    Location bottomVisionOffsets = new Location(LengthUnit.Millimeters, 30, 30, 0, 10);
    Location nozzleLocation = calculateNozzlePosition(boardLocation, placementLocation, bottomVisionOffsets);
    
    int partSize = 50;

    public BottomVisionTest() {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20218);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20219);addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20220);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20221);Random r = new Random();
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20222);boardLocation = new Location(
                        LengthUnit.Millimeters, 
                        rand(200, 600),
                        rand(100, 500),
                        0,
                        rand(0, 90));
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20223);placementLocation = new Location(
                        LengthUnit.Millimeters, 
                        rand(10, 100),
                        rand(10, 100),
                        0,
                        rand(0, 90));
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20224);bottomVisionOffsets = new Location(
                        LengthUnit.Millimeters, 
                        rand(10, 100),
                        rand(10, 100),
                        0,
                        rand(0, 45));
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20225);nozzleLocation = calculateNozzlePosition(boardLocation, placementLocation, bottomVisionOffsets);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20226);repaint();
            }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
        });
        
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20227);addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20228);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20229);nozzleLocation = nozzleLocation.derive((double) e.getX(), (double) (getHeight() - e.getY()), 0d, null);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20230);System.out.println(nozzleLocation);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20231);repaint();
            }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
        });
        
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20232);addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20233);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20234);nozzleLocation = nozzleLocation.subtractWithRotation(new Location(LengthUnit.Millimeters, 0, 0, 0, e.getWheelRotation() * 0.1));
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20235);System.out.println(nozzleLocation);
                __CLR4_5_2flmflmlx1h1z0q.R.inc(20236);repaint();
            }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
    
    private static int rand(int min, int max) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20237);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20238);return random.nextInt(max) + min;
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}

    @Override
    protected void paintComponent(Graphics g) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20239);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20240);super.paintComponent(g);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20241);Graphics2D g2d = (Graphics2D) g;
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20242);AffineTransform tx = g2d.getTransform();

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20243);g2d.translate(0, getHeight());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20244);g2d.scale(1, -1);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20245);g2d.setColor(new Color(0.9f, 0.9f, 0.9f));
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20246);g2d.fillRect(0, 0, getWidth(), getHeight());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20247);g2d.setColor(new Color(0.8f, 0.8f, 0.8f));
        // draw horizontal lines
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20248);for (int y = 0; (((y < getHeight())&&(__CLR4_5_2flmflmlx1h1z0q.R.iget(20249)!=0|true))||(__CLR4_5_2flmflmlx1h1z0q.R.iget(20250)==0&false)); y += 10) {{
            __CLR4_5_2flmflmlx1h1z0q.R.inc(20251);g2d.drawLine(0, y, getWidth(), y);
        }
        // draw vertical lines
        }__CLR4_5_2flmflmlx1h1z0q.R.inc(20252);for (int x = 0; (((x < getWidth())&&(__CLR4_5_2flmflmlx1h1z0q.R.iget(20253)!=0|true))||(__CLR4_5_2flmflmlx1h1z0q.R.iget(20254)==0&false)); x += 10) {{
            __CLR4_5_2flmflmlx1h1z0q.R.inc(20255);g2d.drawLine(x, 0, x, getHeight());
        }

        }__CLR4_5_2flmflmlx1h1z0q.R.inc(20256);g2d.setStroke(new BasicStroke(2));

        // do work

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20257);drawBoard(g2d);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20258);drawNozzle(g2d, nozzleLocation, Color.orange);
        
        // end work

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20259);g2d.setTransform(tx);
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
    
    private static Location calculateNozzlePosition(Location boardLocation, Location placementLocation, Location bottomVisionOffsets) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20260);
        // The calculated global placement location
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20261);Location placementFinalLocation  = Utils2D.calculateBoardPlacementLocation(boardLocation, Board.Side.Top,
                0, placementLocation);

        // Rotate the point 0,0 using the bottom offsets as a center point by the angle that is
        // the difference between the bottom vision angle and the calculated global placement angle.
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20262);Location location = new Location(LengthUnit.Millimeters).rotateXyCenterPoint(
                bottomVisionOffsets, 
                placementFinalLocation.getRotation() - bottomVisionOffsets.getRotation());
        
        // Set the angle to the difference mentioned above, aligning the part to the same angle as
        // the placement.
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20263);location = location.derive(null, null, null, placementFinalLocation.getRotation() - bottomVisionOffsets.getRotation());
        
        // Add the placement final location to move our local coordinate into global space
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20264);location = location.add(placementFinalLocation);

        // Subtract the bottom vision offsets to move the part to the final location, instead of
        // the nozzle.
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20265);location = location.subtract(bottomVisionOffsets);
        
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20266);return location;
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
    
    private void drawBoard(Graphics2D g) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20267);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20268);AffineTransform tx = g.getTransform();

        // draw the board location
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20269);drawCrossHair(g, boardLocation, Color.green);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20270);g.translate(boardLocation.getX(), boardLocation.getY());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20271);g.rotate(Math.toRadians(boardLocation.getRotation()));

        // draw the placement location
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20272);drawCrossHair(g, placementLocation, Color.white);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20273);drawRectangle(g, placementLocation, partSize, partSize, Color.red);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20274);g.setTransform(tx);
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}

    private void drawNozzle(Graphics2D g, Location location, Color color) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20275);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20276);AffineTransform tx = g.getTransform();

        // draw the nozzle
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20277);drawCrossHair(g, location, color);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20278);drawCircle(g, location, partSize, color);

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20279);g.translate(location.getX(), location.getY());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20280);g.rotate(Math.toRadians(location.getRotation()));

        // draw the part
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20281);drawCrossHair(g, bottomVisionOffsets, new HslColor(color).getComplementary());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20282);drawRectangle(g, bottomVisionOffsets, partSize, partSize, new HslColor(color).getComplementary());

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20283);g.setTransform(tx);
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}

    private void drawCircle(Graphics2D g, Location location, double diameter, Color color) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20284);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20285);g.setColor(color);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20286);double x = location.getX();
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20287);double y = location.getY();
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20288);g.drawArc((int) (x - diameter / 2), (int) (y - diameter / 2), (int) diameter,
                (int) diameter, 0, 360);
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}

    private void drawCrossHair(Graphics2D g, Location location, Color color) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20289);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20290);int size = 20;
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20291);Point p1;
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20292);Point p2;
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20293);g.setColor(color);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20294);p1 = Utils2D.rotatePoint(new Point(-size, 0), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20295);p2 = Utils2D.rotatePoint(new Point(size, 0), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20296);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20297);p1 = Utils2D.rotatePoint(new Point(0, -size), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20298);p2 = Utils2D.rotatePoint(new Point(0, size), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20299);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20300);g.setColor(Color.red);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20301);p1 = Utils2D.rotatePoint(new Point(0, size), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20302);p2 = Utils2D.rotatePoint(new Point(0, 0), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20303);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}

    private void drawRectangle(Graphics2D g, Location location, double width, double height,
            Color color) {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20304);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20305);g.setColor(color);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20306);Point p1, p2;
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20307);p1 = Utils2D.rotatePoint(new Point(-width / 2, height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20308);p2 = Utils2D.rotatePoint(new Point(width / 2, height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20309);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20310);p1 = Utils2D.rotatePoint(new Point(width / 2, height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20311);p2 = Utils2D.rotatePoint(new Point(width / 2, -height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20312);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20313);p1 = Utils2D.rotatePoint(new Point(width / 2, -height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20314);p2 = Utils2D.rotatePoint(new Point(-width / 2, -height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20315);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));

        __CLR4_5_2flmflmlx1h1z0q.R.inc(20316);p1 = Utils2D.rotatePoint(new Point(-width / 2, -height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20317);p2 = Utils2D.rotatePoint(new Point(-width / 2, height / 2), location.getRotation());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20318);g.drawLine((int) (location.getX() + p1.getX()), (int) (location.getY() + p1.getY()),
                (int) (location.getX() + p2.getX()), (int) (location.getY() + p2.getY()));

    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_5_2flmflmlx1h1z0q.R.inc(20319);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20320);JFrame frame = new JFrame("Bottom Vision Test");
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20321);frame.setSize(1024, 768);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20322);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20323);frame.getContentPane().setLayout(new BorderLayout());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20324);frame.getContentPane().add(new BottomVisionTest());
        __CLR4_5_2flmflmlx1h1z0q.R.inc(20325);frame.setVisible(true);
    }finally{__CLR4_5_2flmflmlx1h1z0q.R.flushNeeded();}}
}
