/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.camera;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.Action;

import org.openpnp.CameraListener;
import org.openpnp.ConfigurationListener;
import org.openpnp.JobProcessorListener;
import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.gui.wizards.CameraConfigurationWizard;
import org.openpnp.machine.reference.ReferenceCamera;
import org.openpnp.machine.reference.wizards.ReferenceCameraConfigurationWizard;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Footprint;
import org.openpnp.model.Length;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.spi.Head;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Root
public class SimulatedUpCamera extends ReferenceCamera implements Runnable {public static class __CLR4_5_2820820lx1h1uqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,10548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(SimulatedUpCamera.class);

    protected int width = 640;

    protected int height = 480;

    protected int fps = 10;

    private Thread thread;

    private Map<Nozzle, Part> nozzleParts = new HashMap<>();
    
    private Location offsets = new Location(LengthUnit.Millimeters);

    public SimulatedUpCamera() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10440);
        __CLR4_5_2820820lx1h1uqj.R.inc(10441);setUnitsPerPixel(new Location(LengthUnit.Millimeters, 0.0234375D, 0.0234375D, 0, 0));
        __CLR4_5_2820820lx1h1uqj.R.inc(10442);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_2820820lx1h1uqj.R.inc(10443);
                __CLR4_5_2820820lx1h1uqj.R.inc(10444);for (JobProcessor jp : configuration.getMachine().getJobProcessors().values()) {{
                    __CLR4_5_2820820lx1h1uqj.R.inc(10445);jp.addListener(jobListener);
                }
            }}finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public BufferedImage capture() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10446);
        __CLR4_5_2820820lx1h1uqj.R.inc(10447);BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2820820lx1h1uqj.R.inc(10448);Graphics2D g = (Graphics2D) image.getGraphics();
        __CLR4_5_2820820lx1h1uqj.R.inc(10449);AffineTransform tx = g.getTransform();
        // invert the image in Y so that Y+ is up
        __CLR4_5_2820820lx1h1uqj.R.inc(10450);g.translate(0, height);
        __CLR4_5_2820820lx1h1uqj.R.inc(10451);g.scale(1, -1);
        __CLR4_5_2820820lx1h1uqj.R.inc(10452);g.translate(width / 2, height / 2);

        __CLR4_5_2820820lx1h1uqj.R.inc(10453);g.setColor(Color.black);
        __CLR4_5_2820820lx1h1uqj.R.inc(10454);g.fillRect(0, 0, width, height);

        // figure out our physical viewport size
        __CLR4_5_2820820lx1h1uqj.R.inc(10455);Location phySize = getUnitsPerPixel().convertToUnits(LengthUnit.Millimeters).multiply(width,
                height, 0, 0);
        __CLR4_5_2820820lx1h1uqj.R.inc(10456);double phyWidth = phySize.getX();
        __CLR4_5_2820820lx1h1uqj.R.inc(10457);double phyHeight = phySize.getY();

        // and bounds
        __CLR4_5_2820820lx1h1uqj.R.inc(10458);Location location = getLocation().convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_2820820lx1h1uqj.R.inc(10459);Rectangle2D.Double phyBounds = new Rectangle2D.Double(location.getX() - phyWidth / 2,
                location.getY() - phyHeight / 2, phyWidth, phyHeight);

        // determine if there are any nozzles within our bounds and if so render them
        __CLR4_5_2820820lx1h1uqj.R.inc(10460);for (Head head : Configuration.get().getMachine().getHeads()) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10461);for (Nozzle nozzle : head.getNozzles()) {{
                __CLR4_5_2820820lx1h1uqj.R.inc(10462);Location l = nozzle.getLocation().convertToUnits(LengthUnit.Millimeters);
                __CLR4_5_2820820lx1h1uqj.R.inc(10463);if ((((phyBounds.contains(l.getX(), l.getY()))&&(__CLR4_5_2820820lx1h1uqj.R.iget(10464)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10465)==0&false))) {{
                    __CLR4_5_2820820lx1h1uqj.R.inc(10466);drawNozzle(g, nozzle);
                }
            }}
        }}

        }__CLR4_5_2820820lx1h1uqj.R.inc(10467);g.setTransform(tx);
        __CLR4_5_2820820lx1h1uqj.R.inc(10468);g.dispose();
        __CLR4_5_2820820lx1h1uqj.R.inc(10469);return image;
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    private void drawNozzle(Graphics2D g, Nozzle nozzle) {try{__CLR4_5_2820820lx1h1uqj.R.inc(10470);
        // g.setColor(Color.white);
        // Location l = nozzle.getLocation().convertToUnits(LengthUnit.Millimeters);
        //
        // Location upp = getUnitsPerPixel().convertToUnits(LengthUnit.Millimeters);
        // Location scale =
        // new Location(LengthUnit.Millimeters, 1D / upp.getX(), 1D / upp.getY(), 0, 0);
        // l = l.multiply(scale);
        //
        // g.fillOval((int) (l.getX() - 20), (int) (l.getY() - 20), 40, 40);

        __CLR4_5_2820820lx1h1uqj.R.inc(10471);g.setStroke(new BasicStroke(1f));
        __CLR4_5_2820820lx1h1uqj.R.inc(10472);g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        __CLR4_5_2820820lx1h1uqj.R.inc(10473);g.setColor(Color.white);

        __CLR4_5_2820820lx1h1uqj.R.inc(10474);Part part = nozzleParts.get(nozzle);
        __CLR4_5_2820820lx1h1uqj.R.inc(10475);if ((((part == null)&&(__CLR4_5_2820820lx1h1uqj.R.iget(10476)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10477)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10478);return;
        }
        
        }__CLR4_5_2820820lx1h1uqj.R.inc(10479);org.openpnp.model.Package pkg = part.getPackage();
        __CLR4_5_2820820lx1h1uqj.R.inc(10480);Footprint footprint = pkg.getFootprint();
        __CLR4_5_2820820lx1h1uqj.R.inc(10481);if ((((footprint == null)&&(__CLR4_5_2820820lx1h1uqj.R.iget(10482)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10483)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10484);return;
        }

        }__CLR4_5_2820820lx1h1uqj.R.inc(10485);Shape shape = footprint.getShape();
        __CLR4_5_2820820lx1h1uqj.R.inc(10486);if ((((shape == null)&&(__CLR4_5_2820820lx1h1uqj.R.iget(10487)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10488)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10489);return;
        }

        }__CLR4_5_2820820lx1h1uqj.R.inc(10490);Location upp = getUnitsPerPixel().convertToUnits(LengthUnit.Millimeters);

        // Determine the scaling factor to go from Outline units to
        // Camera units.
        __CLR4_5_2820820lx1h1uqj.R.inc(10491);Length l = new Length(1, footprint.getUnits());
        __CLR4_5_2820820lx1h1uqj.R.inc(10492);l = l.convertToUnits(upp.getUnits());
        __CLR4_5_2820820lx1h1uqj.R.inc(10493);double unitScale = l.getValue();

        // Create a transform to scale the Shape by
        __CLR4_5_2820820lx1h1uqj.R.inc(10494);AffineTransform tx = new AffineTransform();

        // First we scale by units to convert the units and then we scale
        // by the camera X and Y units per pixels to get pixel locations.
        __CLR4_5_2820820lx1h1uqj.R.inc(10495);tx.scale(unitScale, unitScale);
        __CLR4_5_2820820lx1h1uqj.R.inc(10496);tx.scale(1.0 / upp.getX(), 1.0 / upp.getY());

        __CLR4_5_2820820lx1h1uqj.R.inc(10497);tx.translate(offsets.getX(), offsets.getY());
//      AffineTransform rotates positive clockwise, so we invert the value.
        __CLR4_5_2820820lx1h1uqj.R.inc(10498);tx.rotate(Math.toRadians(offsets.getRotation()));


        // Transform the Shape and draw it out.
        __CLR4_5_2820820lx1h1uqj.R.inc(10499);shape = tx.createTransformedShape(shape);
        __CLR4_5_2820820lx1h1uqj.R.inc(10500);g.fill(shape);
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public synchronized void startContinuousCapture(CameraListener listener, int maximumFps) {try{__CLR4_5_2820820lx1h1uqj.R.inc(10501);
        __CLR4_5_2820820lx1h1uqj.R.inc(10502);start();
        __CLR4_5_2820820lx1h1uqj.R.inc(10503);super.startContinuousCapture(listener, maximumFps);
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public synchronized void stopContinuousCapture(CameraListener listener) {try{__CLR4_5_2820820lx1h1uqj.R.inc(10504);
        __CLR4_5_2820820lx1h1uqj.R.inc(10505);super.stopContinuousCapture(listener);
        __CLR4_5_2820820lx1h1uqj.R.inc(10506);if ((((listeners.size() == 0)&&(__CLR4_5_2820820lx1h1uqj.R.iget(10507)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10508)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10509);stop();
        }
    }}finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    private synchronized void stop() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10510);
        __CLR4_5_2820820lx1h1uqj.R.inc(10511);if ((((thread != null && thread.isAlive())&&(__CLR4_5_2820820lx1h1uqj.R.iget(10512)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10513)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10514);thread.interrupt();
            __CLR4_5_2820820lx1h1uqj.R.inc(10515);try {
                __CLR4_5_2820820lx1h1uqj.R.inc(10516);thread.join();
            }
            catch (Exception e) {

            }
            __CLR4_5_2820820lx1h1uqj.R.inc(10517);thread = null;
        }
    }}finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    private synchronized void start() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10518);
        __CLR4_5_2820820lx1h1uqj.R.inc(10519);if ((((thread == null)&&(__CLR4_5_2820820lx1h1uqj.R.iget(10520)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10521)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10522);thread = new Thread(this);
            __CLR4_5_2820820lx1h1uqj.R.inc(10523);thread.start();
        }
    }}finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    public void run() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10524);
        __CLR4_5_2820820lx1h1uqj.R.inc(10525);while ((((!Thread.interrupted())&&(__CLR4_5_2820820lx1h1uqj.R.iget(10526)!=0|true))||(__CLR4_5_2820820lx1h1uqj.R.iget(10527)==0&false))) {{
            __CLR4_5_2820820lx1h1uqj.R.inc(10528);BufferedImage frame = capture();
            __CLR4_5_2820820lx1h1uqj.R.inc(10529);broadcastCapture(frame);
            __CLR4_5_2820820lx1h1uqj.R.inc(10530);try {
                __CLR4_5_2820820lx1h1uqj.R.inc(10531);Thread.sleep(1000 / fps);
            }
            catch (InterruptedException e) {
                __CLR4_5_2820820lx1h1uqj.R.inc(10532);return;
            }
        }
    }}finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10533);
        __CLR4_5_2820820lx1h1uqj.R.inc(10534);return new ReferenceCameraConfigurationWizard(this);
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10535);
        __CLR4_5_2820820lx1h1uqj.R.inc(10536);return getClass().getSimpleName() + " " + getName();
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10537);
        // TODO Auto-generated method stub
        __CLR4_5_2820820lx1h1uqj.R.inc(10538);return null;
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10539);
        __CLR4_5_2820820lx1h1uqj.R.inc(10540);return new PropertySheet[] {
                new PropertySheetWizardAdapter(new CameraConfigurationWizard(this)),
                new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2820820lx1h1uqj.R.inc(10541);
        // TODO Auto-generated method stub
        __CLR4_5_2820820lx1h1uqj.R.inc(10542);return null;
    }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}

    private JobProcessorListener jobListener = new JobProcessorListener.Adapter() {
        @Override
        public void partPicked(BoardLocation board, Placement placement, Nozzle nozzle) {try{__CLR4_5_2820820lx1h1uqj.R.inc(10543);
            __CLR4_5_2820820lx1h1uqj.R.inc(10544);nozzleParts.put(nozzle, placement.getPart());
            __CLR4_5_2820820lx1h1uqj.R.inc(10545);Random r = new Random();
            __CLR4_5_2820820lx1h1uqj.R.inc(10546);offsets = new Location(LengthUnit.Millimeters,
                    Math.random() * 2 - 1,
                    Math.random() * 2 - 1,
                    0, Math.random() * 30 - 15);
            __CLR4_5_2820820lx1h1uqj.R.inc(10547);System.out.println("Set offsets to " + offsets);
        }finally{__CLR4_5_2820820lx1h1uqj.R.flushNeeded();}}
    };
}
