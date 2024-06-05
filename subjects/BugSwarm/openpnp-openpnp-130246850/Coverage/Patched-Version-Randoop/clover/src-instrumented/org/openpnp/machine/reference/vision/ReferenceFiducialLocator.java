/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.vision;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.model.Board;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Footprint;
import org.openpnp.model.Length;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.model.Placement.Type;
import org.openpnp.spi.Camera;
import org.openpnp.spi.FiducialLocator;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.VisionProvider;
import org.openpnp.spi.VisionProvider.TemplateMatch;
import org.openpnp.util.IdentifiableList;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.Utils2D;
import org.simpleframework.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implements an algorithm for finding a set of fiducials on a board and returning the correct
 * orientation for the board.
 */
@Root
public class ReferenceFiducialLocator implements FiducialLocator {public static class __CLR4_5_2azaazalx1h76wd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,14386,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(ReferenceFiducialLocator.class);

    public Location locateBoard(BoardLocation boardLocation) throws Exception {try{__CLR4_5_2azaazalx1h76wd.R.inc(14230);
        // Find the fids in the board
        __CLR4_5_2azaazalx1h76wd.R.inc(14231);IdentifiableList<Placement> fiducials = getFiducials(boardLocation);

        __CLR4_5_2azaazalx1h76wd.R.inc(14232);if ((((fiducials.size() < 2)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14233)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14234)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14235);throw new Exception(String.format(
                    "The board side contains only %d placements marked as fiducials, but at least 2 are required.",
                    fiducials.size()));
        }

        // Find the two that are most distant from each other
        }__CLR4_5_2azaazalx1h76wd.R.inc(14236);List<Placement> mostDistant = getMostDistantPlacements(fiducials);

        __CLR4_5_2azaazalx1h76wd.R.inc(14237);Placement placementA = mostDistant.get(0);
        __CLR4_5_2azaazalx1h76wd.R.inc(14238);Placement placementB = mostDistant.get(1);

        __CLR4_5_2azaazalx1h76wd.R.inc(14239);logger.debug("Chose {} and {}", placementA.getId(), placementB.getId());

        // Run the fiducial check on each and get their actual locations
        __CLR4_5_2azaazalx1h76wd.R.inc(14240);Location actualLocationA = getFiducialLocation(boardLocation, placementA);
        __CLR4_5_2azaazalx1h76wd.R.inc(14241);if ((((actualLocationA == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14242)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14243)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14244);throw new Exception("Unable to locate first fiducial.");
        }
        }__CLR4_5_2azaazalx1h76wd.R.inc(14245);Location actualLocationB = getFiducialLocation(boardLocation, placementB);
        __CLR4_5_2azaazalx1h76wd.R.inc(14246);if ((((actualLocationB == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14247)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14248)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14249);throw new Exception("Unable to locate second fiducial.");
        }

        // Calculate the linear distance between the ideal points and the
        // located points. If they differ by more than a few percent we
        // probably made a mistake.
        }__CLR4_5_2azaazalx1h76wd.R.inc(14250);double fidDistance =
                Math.abs(placementA.getLocation().getLinearDistanceTo(placementB.getLocation()));
        __CLR4_5_2azaazalx1h76wd.R.inc(14251);double visionDistance = Math.abs(actualLocationA.getLinearDistanceTo(actualLocationB));
        __CLR4_5_2azaazalx1h76wd.R.inc(14252);if ((((Math.abs(fidDistance - visionDistance) > fidDistance * 0.01)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14253)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14254)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14255);throw new Exception("Located fiducials are more than 1% away from expected.");
        }

        // Calculate the angle and offset from the results
        }__CLR4_5_2azaazalx1h76wd.R.inc(14256);Location idealLocationA =
                Utils2D.calculateBoardPlacementLocation(boardLocation, placementA.getLocation());
        __CLR4_5_2azaazalx1h76wd.R.inc(14257);Location idealLocationB =
                Utils2D.calculateBoardPlacementLocation(boardLocation, placementB.getLocation());
        __CLR4_5_2azaazalx1h76wd.R.inc(14258);Location location = Utils2D.calculateAngleAndOffset2(idealLocationA, idealLocationB,
                actualLocationA, actualLocationB);

        __CLR4_5_2azaazalx1h76wd.R.inc(14259);location = boardLocation.getLocation().addWithRotation(location);
        __CLR4_5_2azaazalx1h76wd.R.inc(14260);location = location.derive(null, null,
                boardLocation.getLocation().convertToUnits(location.getUnits()).getZ(), null);

        __CLR4_5_2azaazalx1h76wd.R.inc(14261);return location;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    public static Location getFiducialLocation(Footprint footprint, Camera camera)
            throws Exception {try{__CLR4_5_2azaazalx1h76wd.R.inc(14262);
        // Create the template
        __CLR4_5_2azaazalx1h76wd.R.inc(14263);BufferedImage template = createTemplate(camera.getUnitsPerPixel(), footprint);

        // Wait for camera to settle
        __CLR4_5_2azaazalx1h76wd.R.inc(14264);Thread.sleep(camera.getSettleTimeMs());
        // Perform vision operation
        __CLR4_5_2azaazalx1h76wd.R.inc(14265);return getBestTemplateMatch(camera, template);
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    /**
     * Given a placement containing a fiducial, attempt to find the fiducial using the vision
     * system. The function first moves the camera to the ideal location of the fiducial based on
     * the board location. It then performs a template match against a template generated from the
     * fiducial's footprint. These steps are performed thrice to "home in" on the fiducial. Finally,
     * the location is returned. If the fiducial was not able to be located with any degree of
     * certainty the function returns null.
     * 
     * @param fid
     * @return
     * @throws Exception
     */
    private static Location getFiducialLocation(BoardLocation boardLocation, Placement fid)
            throws Exception {try{__CLR4_5_2azaazalx1h76wd.R.inc(14266);
        __CLR4_5_2azaazalx1h76wd.R.inc(14267);Camera camera = Configuration.get().getMachine().getDefaultHead().getDefaultCamera();

        __CLR4_5_2azaazalx1h76wd.R.inc(14268);logger.debug("Locating {}", fid.getId());

        __CLR4_5_2azaazalx1h76wd.R.inc(14269);Part part = fid.getPart();
        __CLR4_5_2azaazalx1h76wd.R.inc(14270);if ((((part == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14271)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14272)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14273);throw new Exception(
                    String.format("Fiducial %s does not have a valid part assigned.", fid.getId()));
        }

        }__CLR4_5_2azaazalx1h76wd.R.inc(14274);org.openpnp.model.Package pkg = part.getPackage();
        __CLR4_5_2azaazalx1h76wd.R.inc(14275);if ((((pkg == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14276)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14277)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14278);throw new Exception(
                    String.format("Part %s does not have a valid package assigned.", part.getId()));
        }

        }__CLR4_5_2azaazalx1h76wd.R.inc(14279);Footprint footprint = pkg.getFootprint();
        __CLR4_5_2azaazalx1h76wd.R.inc(14280);if ((((footprint == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14281)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14282)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14283);throw new Exception(String.format(
                    "Package %s does not have a valid footprint. See https://github.com/openpnp/openpnp/wiki/Fiducials",
                    pkg.getId()));
        }

        }__CLR4_5_2azaazalx1h76wd.R.inc(14284);if ((((footprint.getShape() == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14285)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14286)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14287);throw new Exception(String.format(
                    "Package %s has an invalid or empty footprint.  See https://github.com/openpnp/openpnp/wiki/Fiducials",
                    pkg.getId()));
        }

        // Create the template
        }__CLR4_5_2azaazalx1h76wd.R.inc(14288);BufferedImage template = createTemplate(camera.getUnitsPerPixel(),
                fid.getPart().getPackage().getFootprint());

        // Move to where we expect to find the fid
        __CLR4_5_2azaazalx1h76wd.R.inc(14289);Location location =
                Utils2D.calculateBoardPlacementLocation(boardLocation, fid.getLocation());
        __CLR4_5_2azaazalx1h76wd.R.inc(14290);logger.debug("Looking for {} at {}", fid.getId(), location);
        __CLR4_5_2azaazalx1h76wd.R.inc(14291);MovableUtils.moveToLocationAtSafeZ(camera, location);


        __CLR4_5_2azaazalx1h76wd.R.inc(14292);for (int i = 0; (((i < 3)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14293)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14294)==0&false)); i++) {{
            // Wait for camera to settle
            __CLR4_5_2azaazalx1h76wd.R.inc(14295);Thread.sleep(camera.getSettleTimeMs());
            // Perform vision operation
            __CLR4_5_2azaazalx1h76wd.R.inc(14296);location = getBestTemplateMatch(camera, template);
            __CLR4_5_2azaazalx1h76wd.R.inc(14297);if ((((location == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14298)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14299)==0&false))) {{
                __CLR4_5_2azaazalx1h76wd.R.inc(14300);logger.debug("No matches found!");
                __CLR4_5_2azaazalx1h76wd.R.inc(14301);return null;
            }
            }__CLR4_5_2azaazalx1h76wd.R.inc(14302);logger.debug("{} located at {}", fid.getId(), location);
            // Move to where we actually found the fid
            __CLR4_5_2azaazalx1h76wd.R.inc(14303);camera.moveTo(location);
        }

        }__CLR4_5_2azaazalx1h76wd.R.inc(14304);return location;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    private static Location getBestTemplateMatch(final Camera camera, BufferedImage template)
            throws Exception {try{__CLR4_5_2azaazalx1h76wd.R.inc(14305);
        __CLR4_5_2azaazalx1h76wd.R.inc(14306);VisionProvider visionProvider = camera.getVisionProvider();

        __CLR4_5_2azaazalx1h76wd.R.inc(14307);List<TemplateMatch> matches = visionProvider.getTemplateMatches(template);

        __CLR4_5_2azaazalx1h76wd.R.inc(14308);if ((((matches.isEmpty())&&(__CLR4_5_2azaazalx1h76wd.R.iget(14309)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14310)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14311);return null;
        }

        // getTemplateMatches returns results in order of score, but we're
        // more interested in the result closest to the expected location
        }__CLR4_5_2azaazalx1h76wd.R.inc(14312);Collections.sort(matches, new Comparator<TemplateMatch>() {
            @Override
            public int compare(TemplateMatch o1, TemplateMatch o2) {try{__CLR4_5_2azaazalx1h76wd.R.inc(14313);
                __CLR4_5_2azaazalx1h76wd.R.inc(14314);double d1 = o1.location.getLinearDistanceTo(camera.getLocation());
                __CLR4_5_2azaazalx1h76wd.R.inc(14315);double d2 = o2.location.getLinearDistanceTo(camera.getLocation());
                __CLR4_5_2azaazalx1h76wd.R.inc(14316);return Double.compare(d1, d2);
            }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}
        });

        __CLR4_5_2azaazalx1h76wd.R.inc(14317);return matches.get(0).location;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    /**
     * Create a template image based on a Placement's footprint. The image will be scaled to match
     * the dimensions of the current camera.
     * 
     * @param fid
     * @return
     */
    private static BufferedImage createTemplate(Location unitsPerPixel, Footprint footprint)
            throws Exception {try{__CLR4_5_2azaazalx1h76wd.R.inc(14318);
        __CLR4_5_2azaazalx1h76wd.R.inc(14319);Shape shape = footprint.getShape();

        __CLR4_5_2azaazalx1h76wd.R.inc(14320);if ((((shape == null)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14321)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14322)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14323);throw new Exception(
                    "Invalid footprint found, unable to create template for fiducial match.");
        }

        // Determine the scaling factor to go from Outline units to
        // Camera units.
        }__CLR4_5_2azaazalx1h76wd.R.inc(14324);Length l = new Length(1, footprint.getUnits());
        __CLR4_5_2azaazalx1h76wd.R.inc(14325);l = l.convertToUnits(unitsPerPixel.getUnits());
        __CLR4_5_2azaazalx1h76wd.R.inc(14326);double unitScale = l.getValue();

        // Create a transform to scale the Shape by
        __CLR4_5_2azaazalx1h76wd.R.inc(14327);AffineTransform tx = new AffineTransform();

        // First we scale by units to convert the units and then we scale
        // by the camera X and Y units per pixels to get pixel locations.
        __CLR4_5_2azaazalx1h76wd.R.inc(14328);tx.scale(unitScale, unitScale);
        __CLR4_5_2azaazalx1h76wd.R.inc(14329);tx.scale(1.0 / unitsPerPixel.getX(), 1.0 / unitsPerPixel.getY());

        // Transform the Shape and draw it out.
        __CLR4_5_2azaazalx1h76wd.R.inc(14330);shape = tx.createTransformedShape(shape);

        __CLR4_5_2azaazalx1h76wd.R.inc(14331);Rectangle2D bounds = shape.getBounds2D();

        // Make the image 50% bigger than the shape. This gives better
        // recognition performance because it allows some border around the edges.
        __CLR4_5_2azaazalx1h76wd.R.inc(14332);double width = bounds.getWidth() * 1.5;
        __CLR4_5_2azaazalx1h76wd.R.inc(14333);double height = bounds.getHeight() * 1.5;
        __CLR4_5_2azaazalx1h76wd.R.inc(14334);BufferedImage template =
                new BufferedImage((int) width, (int) height, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2azaazalx1h76wd.R.inc(14335);Graphics2D g2d = (Graphics2D) template.getGraphics();

        __CLR4_5_2azaazalx1h76wd.R.inc(14336);g2d.setStroke(new BasicStroke(1f));
        __CLR4_5_2azaazalx1h76wd.R.inc(14337);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        __CLR4_5_2azaazalx1h76wd.R.inc(14338);g2d.setColor(Color.white);
        // center the drawing
        __CLR4_5_2azaazalx1h76wd.R.inc(14339);g2d.translate(width / 2, height / 2);
        __CLR4_5_2azaazalx1h76wd.R.inc(14340);g2d.fill(shape);

        __CLR4_5_2azaazalx1h76wd.R.inc(14341);g2d.dispose();

        __CLR4_5_2azaazalx1h76wd.R.inc(14342);return template;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    /**
     * Given a List of Placements, find the two that are the most distant from each other.
     * 
     * @param fiducials
     * @return
     */
    private static List<Placement> getMostDistantPlacements(List<Placement> fiducials) {try{__CLR4_5_2azaazalx1h76wd.R.inc(14343);
        __CLR4_5_2azaazalx1h76wd.R.inc(14344);if ((((fiducials.size() < 2)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14345)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14346)==0&false))) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14347);return null;
        }
        }__CLR4_5_2azaazalx1h76wd.R.inc(14348);Placement maxA = null, maxB = null;
        __CLR4_5_2azaazalx1h76wd.R.inc(14349);double max = 0;
        __CLR4_5_2azaazalx1h76wd.R.inc(14350);for (Placement a : fiducials) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14351);for (Placement b : fiducials) {{
                __CLR4_5_2azaazalx1h76wd.R.inc(14352);if ((((a == b)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14353)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14354)==0&false))) {{
                    __CLR4_5_2azaazalx1h76wd.R.inc(14355);continue;
                }
                }__CLR4_5_2azaazalx1h76wd.R.inc(14356);double d = Math.abs(a.getLocation().getLinearDistanceTo(b.getLocation()));
                __CLR4_5_2azaazalx1h76wd.R.inc(14357);if ((((d > max)&&(__CLR4_5_2azaazalx1h76wd.R.iget(14358)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14359)==0&false))) {{
                    __CLR4_5_2azaazalx1h76wd.R.inc(14360);maxA = a;
                    __CLR4_5_2azaazalx1h76wd.R.inc(14361);maxB = b;
                    __CLR4_5_2azaazalx1h76wd.R.inc(14362);max = d;
                }
            }}
        }}
        }__CLR4_5_2azaazalx1h76wd.R.inc(14363);ArrayList<Placement> results = new ArrayList<>();
        __CLR4_5_2azaazalx1h76wd.R.inc(14364);results.add(maxA);
        __CLR4_5_2azaazalx1h76wd.R.inc(14365);results.add(maxB);
        __CLR4_5_2azaazalx1h76wd.R.inc(14366);return results;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    private static IdentifiableList<Placement> getFiducials(BoardLocation boardLocation) {try{__CLR4_5_2azaazalx1h76wd.R.inc(14367);
        __CLR4_5_2azaazalx1h76wd.R.inc(14368);Board board = boardLocation.getBoard();
        __CLR4_5_2azaazalx1h76wd.R.inc(14369);IdentifiableList<Placement> fiducials = new IdentifiableList<>();
        __CLR4_5_2azaazalx1h76wd.R.inc(14370);for (Placement placement : board.getPlacements()) {{
            __CLR4_5_2azaazalx1h76wd.R.inc(14371);if ((((placement.getType() == Type.Fiducial
                    && placement.getSide() == boardLocation.getSide())&&(__CLR4_5_2azaazalx1h76wd.R.iget(14372)!=0|true))||(__CLR4_5_2azaazalx1h76wd.R.iget(14373)==0&false))) {{
                __CLR4_5_2azaazalx1h76wd.R.inc(14374);fiducials.add(placement);
            }
        }}
        }__CLR4_5_2azaazalx1h76wd.R.inc(14375);return fiducials;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2azaazalx1h76wd.R.inc(14376);
        __CLR4_5_2azaazalx1h76wd.R.inc(14377);return "Fiducal Locator";
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2azaazalx1h76wd.R.inc(14378);
        // TODO Auto-generated method stub
        __CLR4_5_2azaazalx1h76wd.R.inc(14379);return null;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2azaazalx1h76wd.R.inc(14380);
        // TODO Auto-generated method stub
        __CLR4_5_2azaazalx1h76wd.R.inc(14381);return null;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2azaazalx1h76wd.R.inc(14382);
        // TODO Auto-generated method stub
        __CLR4_5_2azaazalx1h76wd.R.inc(14383);return null;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2azaazalx1h76wd.R.inc(14384);
        // TODO Auto-generated method stub
        __CLR4_5_2azaazalx1h76wd.R.inc(14385);return null;
    }finally{__CLR4_5_2azaazalx1h76wd.R.flushNeeded();}}
}
