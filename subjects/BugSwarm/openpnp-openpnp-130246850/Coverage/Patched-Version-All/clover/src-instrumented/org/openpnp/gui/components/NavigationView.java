/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.components;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import org.openpnp.CameraListener;
import org.openpnp.ConfigurationListener;
import org.openpnp.JobProcessorListener;
import org.openpnp.gui.MainFrame;
import org.openpnp.model.Board;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.BoardPad;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Pad;
import org.openpnp.model.Placement;
import org.openpnp.spi.Actuator;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.Head;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.JobProcessor.JobError;
import org.openpnp.spi.JobProcessor.JobState;
import org.openpnp.spi.Machine;
import org.openpnp.spi.MachineListener;
import org.openpnp.spi.Nozzle;
import org.openpnp.util.HslColor;
import org.openpnp.util.ImageUtils;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.openpnp.util.Utils2D;

/**
 * User interaction with this component: Single click interacts with the object under the cursor.
 * Camera dims. Drag jogs camera on release.
 * 
 */
public class NavigationView extends JComponent implements JobProcessorListener, MachineListener,
        MouseWheelListener, MouseListener, KeyListener, MouseMotionListener {public static class __CLR4_5_23tj3tjlx1h8hyj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,5185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Location machineExtentsBottomLeft = new Location(LengthUnit.Millimeters, 0, 0, 0, 0);
    private Location machineExtentsTopRight = new Location(LengthUnit.Millimeters, 400, 400, 0, 0);

    // MUST always be in mm, if something sets it it should be converted first.
    private Location lookingAt = new Location(LengthUnit.Millimeters, 0, 0, 1, 0);

    // Determine the base scale. This is the scaling factor needed to fit
    // the entire machine in the window.
    // TODO: It would simplify things if we just calculate this once and
    // set it as Z on lookingAt during startup. There's no reason to
    // recalculate it every time since we only actually set it once.
    // double bedWidth = machineExtents.getX();
    // double bedHeight = machineExtents.getY();
    // double xScale = width / bedWidth;
    // double yScale = height / bedHeight;
    // double baseScale = Math.min(xScale, yScale);
    // double scale = baseScale * lookingAt.getZ();

    private double cameraOpacity = 1;
    private Point dragStart = null;
    private Point dragEnd = null;
    private Paint backgroundPaint = new Color(97, 98, 100);
    private Paint bedPaint = createNoisyPaint(new Color(37, 37, 37));
    private Paint boardPaint = new Color(29, 115, 25);
    private Paint padPaint = new Color(168, 139, 9);
    static BufferedImage noiseImage;

    private static Paint createNoisyPaint(Color color) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(4951);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4952);if ((((noiseImage == null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(4953)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(4954)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(4955);try {
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(4956);noiseImage = ImageIO.read(ClassLoader.getSystemResource("noise-texture.png"));
            }
            catch (Exception e) {
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(4957);return null;
            }
        }
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(4958);int width = noiseImage.getWidth();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4959);int height = noiseImage.getHeight();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4960);BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4961);Graphics2D g = image.createGraphics();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4962);g.setColor(color);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4963);g.fillRect(0, 0, width, height);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4964);g.drawImage(noiseImage, 0, 0, null);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4965);g.dispose();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4966);return new TexturePaint(image, new Rectangle2D.Double(0, 0, width, height));
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}


    /**
     * Contains the AffineTransform that was last used to render the component. This is used
     * elsewhere to convert component coordinates back to machine coordinates.
     */
    private AffineTransform transform;

    private HashMap<Camera, BufferedImage> cameraImages = new HashMap<>();

    public NavigationView() {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(4967);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4968);addMouseWheelListener(this);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4969);addMouseListener(this);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4970);addKeyListener(this);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4971);addMouseMotionListener(this);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4972);Configuration.get().addListener(new ConfigurationListener() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(4973);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

            @Override
            public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(4974);
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(4975);Machine machine = configuration.getMachine();
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(4976);machine.addListener(NavigationView.this);
                // TODO: This doesn't really work in the new JobProcessor world
                // because the JobProcessor gets swapped out when changing tabs.
                // Need to figure out how to reference the current one and
                // maintain listeners across switches.
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(4977);for (JobProcessor jobProcessor : machine.getJobProcessors().values()) {{
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(4978);jobProcessor.addListener(NavigationView.this);
                }
                }__CLR4_5_23tj3tjlx1h8hyj.R.inc(4979);for (Camera camera : machine.getCameras()) {{
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(4980);camera.startContinuousCapture(new NavCameraListener(camera), 24);
                }
                }__CLR4_5_23tj3tjlx1h8hyj.R.inc(4981);for (Head head : machine.getHeads()) {{
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(4982);for (Camera camera : head.getCameras()) {{
                        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4983);camera.startContinuousCapture(new NavCameraListener(camera), 24);
                    }
                }}
            }}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}
        });
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    private void updateTransform() {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(4984);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4985);AffineTransform transform = new AffineTransform();

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4986);int width = getWidth();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4987);int height = getHeight();

        // Center the drawing
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4988);transform.translate(width / 2, height / 2);

        // Scale the drawing to the zoom level
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4989);transform.scale(lookingAt.getZ(), lookingAt.getZ());

        // Move to the lookingAt position
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4990);transform.translate(-lookingAt.getX(), lookingAt.getY());

        // Flip the drawing in Y so that our coordinate system matches that
        // of the machine.
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4991);transform.scale(1, -1);

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4992);this.transform = transform;
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    protected void paintComponent(Graphics g) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(4993);
        // Create a new Graphics so we don't break the original.
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4994);Graphics2D g2d = (Graphics2D) g.create();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4995);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the background
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4996);g2d.setPaint(backgroundPaint);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4997);g2d.fillRect(0, 0, getWidth(), getHeight());

        // All rendering is done in mm, where 1mm = 1px. Any Locations that
        // are used for rendering must first be converted to mm.

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4998);updateTransform();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(4999);g2d.transform(transform);

        // Draw the bed
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5000);g2d.setPaint(bedPaint);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5001);g2d.fillRect((int) machineExtentsBottomLeft.getX(), (int) machineExtentsBottomLeft.getY(),
                (int) (machineExtentsTopRight.getX() - machineExtentsBottomLeft.getX()),
                (int) (machineExtentsTopRight.getY() - machineExtentsBottomLeft.getY()));
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5002);g2d.setColor(Color.black);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5003);g2d.drawRect((int) machineExtentsBottomLeft.getX(), (int) machineExtentsBottomLeft.getY(),
                (int) (machineExtentsTopRight.getX() - machineExtentsBottomLeft.getX()),
                (int) (machineExtentsTopRight.getY() - machineExtentsBottomLeft.getY()));


        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5004);Machine machine = Configuration.get().getMachine();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5005);JobProcessor jobProcessor = MainFrame.jobPanel.getJobProcessor();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5006);Job job = jobProcessor.getJob();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5007);if ((((job != null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5008)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5009)==0&false))) {{
            // Draw the boards
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5010);for (BoardLocation boardLocation : job.getBoardLocations()) {{
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5011);Location location =
                        boardLocation.getLocation().convertToUnits(LengthUnit.Millimeters);

                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5012);AffineTransform tx = g2d.getTransform();
                // g2d.translate(location.getX(), location.getY());
                // g2d.rotate(location.getRotation());
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5013);Board board = boardLocation.getBoard();

                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5014);Shape outline = board.getOutline().getShape();
                // TODO: Generate bounds outline if null
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5015);if ((((outline != null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5016)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5017)==0&false))) {{
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5018);g2d.setPaint(boardPaint);
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5019);g2d.fill(outline);
                }

                // Draw the pads on the boards
                }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5020);g2d.setPaint(padPaint);
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5021);for (BoardPad boardPad : board.getSolderPastePads()) {{
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5022);Location padLocation =
                            boardPad.getLocation().convertToUnits(LengthUnit.Millimeters);
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5023);Pad pad = boardPad.getPad().convertToUnits(LengthUnit.Millimeters);
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5024);Shape shape = pad.getShape();
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5025);AffineTransform shapeTx = new AffineTransform();
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5026);shapeTx.translate(padLocation.getX(), padLocation.getY());
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5027);shape = shapeTx.createTransformedShape(shape);
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5028);g2d.fill(shape);
                }

                // Draw the placements on the boards
                }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5029);for (Placement placement : boardLocation.getBoard().getPlacements()) {{
                    __CLR4_5_23tj3tjlx1h8hyj.R.inc(5030);if ((((placement.getSide() != boardLocation.getSide())&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5031)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5032)==0&false))) {{
                        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5033);continue;
                    }
                    }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5034);Location placementLocation =
                            Utils2D.calculateBoardPlacementLocation(boardLocation, placement.getLocation());
                    // paintCrosshair(g2d, placementLocation, Color.orange);
                }

                }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5035);g2d.setTransform(tx);
            }
        }}

        // Draw the feeders
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5036);for (Feeder feeder : machine.getFeeders()) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5037);try {
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5038);Location location = feeder.getPickLocation();
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5039);paintCrosshair(g2d, location, Color.white);
            }
            catch (Exception e) {

            }
        }

        // Draw fixed cameras
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5040);for (Camera camera : machine.getCameras()) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5041);paintCamera(g2d, camera);
        }

        // Draw the head
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5042);for (Head head : machine.getHeads()) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5043);for (Nozzle nozzle : head.getNozzles()) {{
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5044);Location location = nozzle.getLocation();
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5045);paintCrosshair(g2d, location, Color.red);
            }

            }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5046);for (Camera camera : head.getCameras()) {{
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5047);paintCamera(g2d, camera);
            }

            }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5048);for (Actuator actuator : head.getActuators()) {{
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5049);Location location = actuator.getLocation();
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5050);paintCrosshair(g2d, location, Color.yellow);
            }
        }}

        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5051);paintDragVector(g2d);

        // Dispose of the Graphics we created.
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5052);g2d.dispose();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    private void paintDragVector(Graphics2D g2d) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5053);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5054);if ((((dragStart == null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5055)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5056)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5057);return;
        }
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5058);Camera camera = Configuration.get().getMachine().getHeads().get(0).getCameras().get(0);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5059);Location start = camera.getLocation().convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5060);Location end = getPixelLocation(dragEnd.getX(), dragEnd.getY());
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5061);g2d.setColor(Color.yellow);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5062);g2d.drawLine((int) start.getX(), (int) start.getY(), (int) end.getX(), (int) end.getY());
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    private void paintCamera(Graphics2D g2d, Camera camera) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5063);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5064);Location location = camera.getLocation();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5065);location = location.convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5066);BufferedImage img = cameraImages.get(camera);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5067);if ((((img == null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5068)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5069)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5070);return;
        }

        // we need to scale the image so that 1 pixel = 1mm
        // and it needs to be centered on the location
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5071);double width = camera.getWidth();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5072);double height = camera.getHeight();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5073);Location upp = camera.getUnitsPerPixel().convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5074);double scaledWidth = width * upp.getX();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5075);double scaledHeight = height * upp.getY();

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5076);int dx1 = (int) (location.getX() - (scaledWidth / 2));
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5077);int dy1 = (int) (location.getY() + (scaledHeight / 2));
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5078);int dx2 = (int) (location.getX() + (scaledWidth / 2));
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5079);int dy2 = (int) (location.getY() - (scaledHeight / 2));

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5080);int sx1 = 0;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5081);int sy1 = 0;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5082);int sx2 = (int) width;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5083);int sy2 = (int) height;

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5084);if ((((cameraOpacity != 1)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5085)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5086)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5087);if ((((img.getType() != BufferedImage.TYPE_INT_ARGB)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5088)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5089)==0&false))) {{
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5090);img = ImageUtils.convertBufferedImage(img, BufferedImage.TYPE_INT_ARGB);
            }
            // We're going to mess with the composite, so we create a new
            // context to draw with and dispose it when we're done.
            }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5091);Graphics2D g = (Graphics2D) g2d.create();
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5092);g.setComposite(
                    AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) cameraOpacity));
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5093);g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5094);g.dispose();
        }
        }else {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5095);g2d.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
        }
    }}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    private void paintCrosshair(Graphics2D g2d, Location location, Color color) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5096);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5097);Color color2 = new HslColor(color).getComplementary();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5098);location = location.convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5099);int x = (int) location.getX();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5100);int y = (int) location.getY();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5101);g2d.setColor(color);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5102);g2d.drawLine(x - 3, y, x + 3, y);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5103);g2d.drawLine(x, y - 3, x, y);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5104);g2d.setColor(color2);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5105);g2d.drawLine(x, y, x, y + 3);
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    private Location getPixelLocation(double x, double y) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5106);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5107);Point2D point = new Point2D.Double(x, y);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5108);try {
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5109);transform.inverseTransform(point, point);
        }
        catch (Exception e) {
        }
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5110);return lookingAt.derive(point.getX(), point.getY(), null, null);
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5111);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5112);double minimumScale = 0.1;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5113);double scaleIncrement = 0.01;

        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5114);double scale = lookingAt.getZ();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5115);scale += -e.getWheelRotation() * scale * scaleIncrement;

        // limit the scale to 10% so that it doesn't just turn into a dot
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5116);scale = Math.max(scale, minimumScale);

        // Get the offsets from lookingAt to where the mouse was when the
        // scroll event happened
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5117);Location location1 = getPixelLocation(e.getX(), e.getY());

        // Update the scale
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5118);lookingAt = lookingAt.derive(null, null, scale, null);

        // And the transform
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5119);updateTransform();

        // Get the newly scaled location
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5120);Location location2 = getPixelLocation(e.getX(), e.getY());

        // Get the delta between the two locations.
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5121);Location delta = location2.subtract(location1);

        // Reset Z and C since we don't want to mess with them
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5122);delta = delta.derive(null, null, 0.0, 0.0);

        // And offset lookingAt by the delta
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5123);lookingAt = lookingAt.subtract(delta);

        // If the user hit the minimum scale, center the table.
        // This helps them find it if it gets lost.
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5124);if ((((scale == minimumScale)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5125)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5126)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5127);lookingAt = new Location(LengthUnit.Millimeters, 0, 0, minimumScale, 0);
        }

        // Repaint will update the transform and we're ready to go.
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5128);repaint();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseClicked(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5129);
        // find component that was clicked
        // do something with it

        // for now just pretend they clicked a camera and toggle camera dim
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5130);if ((((cameraOpacity == 1)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5131)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5132)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5133);cameraOpacity = 0.25;
        }
        }else {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5134);cameraOpacity = 1;
        }
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5135);repaint();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mousePressed(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5136);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseReleased(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5137);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5138);if ((((dragStart != null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5139)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5140)==0&false))) {{
            // jog
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5141);Camera camera = Configuration.get().getMachine().getHeads().get(0).getCameras().get(0);
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5142);Location clickLocation = getPixelLocation(e.getX(), e.getY())
                    .convertToUnits(camera.getLocation().getUnits());
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5143);Location location = camera.getLocation().derive(clickLocation.getX(),
                    clickLocation.getY(), null, null);
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5144);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_23tj3tjlx1h8hyj.R.inc(5145);MovableUtils.moveToLocationAtSafeZ(camera, location);
            });
        }
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5146);dragStart = null;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5147);dragEnd = null;
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseEntered(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5148);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseExited(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5149);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5150);dragStart = null;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5151);dragEnd = null;
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5152);repaint();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseDragged(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5153);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5154);if ((((dragStart == null)&&(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5155)!=0|true))||(__CLR4_5_23tj3tjlx1h8hyj.R.iget(5156)==0&false))) {{
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5157);dragStart = e.getPoint();
        }
        }__CLR4_5_23tj3tjlx1h8hyj.R.inc(5158);dragEnd = e.getPoint();
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5159);repaint();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void mouseMoved(MouseEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5160);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void keyTyped(KeyEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5161);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void keyPressed(KeyEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5162);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void keyReleased(KeyEvent e) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5163);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void jobLoaded(Job job) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5164);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5165);repaint();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void jobStateChanged(JobState state) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5166);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void jobEncounteredError(JobError error, String description) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5167);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void partProcessingStarted(BoardLocation board, Placement placement) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5168);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void partPicked(BoardLocation board, Placement placement) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5169);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void partPlaced(BoardLocation board, Placement placement) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5170);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void partProcessingCompleted(BoardLocation board, Placement placement) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5171);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void detailedStatusUpdated(String status) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5172);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void machineHeadActivity(Machine machine, Head head) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5173);
        __CLR4_5_23tj3tjlx1h8hyj.R.inc(5174);repaint();
    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void machineEnabled(Machine machine) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5175);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void machineEnableFailed(Machine machine, String reason) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5176);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void machineDisabled(Machine machine, String reason) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5177);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

    @Override
    public void machineDisableFailed(Machine machine, String reason) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5178);}finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}


    @Override
    public void machineBusy(Machine machine, boolean busy) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5179);
        // TODO Auto-generated method stub

    }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}


    class NavCameraListener implements CameraListener {
        private final Camera camera;

        public NavCameraListener(Camera camera) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5180);
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5181);this.camera = camera;
        }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}

        @Override
        public void frameReceived(BufferedImage img) {try{__CLR4_5_23tj3tjlx1h8hyj.R.inc(5182);
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5183);cameraImages.put(camera, img);
            __CLR4_5_23tj3tjlx1h8hyj.R.inc(5184);repaint();
        }finally{__CLR4_5_23tj3tjlx1h8hyj.R.flushNeeded();}}
    }
}
