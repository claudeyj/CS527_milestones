/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.components;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import org.openpnp.CameraListener;
import org.openpnp.ConfigurationListener;
import org.openpnp.JobProcessorListener;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Head;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.Machine;
import org.openpnp.spi.MachineListener;
import org.openpnp.spi.Nozzle;
import org.openpnp.util.UiUtils;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;

@SuppressWarnings("serial")
// TODO: Click drag jog should take into account which head item you drag from so you can
// choose to use nozzle, camera, etc.
public class FxNavigationView extends JFXPanel {public static class __CLR4_5_23lt3ltlx1h34th{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,4825,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Location machineExtentsBottomLeft = new Location(LengthUnit.Millimeters, 0, 0, 0, 0);
    Location machineExtentsTopRight = new Location(LengthUnit.Millimeters, 300, 300, 0, 0);

    // TODO: Don't add anymore specifics here, make a Head Group instead.
    Map<Camera, CameraImageView> cameraImageViews = new HashMap<>();
    Map<Nozzle, Rectangle> nozzleRects = new HashMap<>();

    Scene scene;
    Pane root;
    Group machine;
    Group bed;
    Group boards;
    Line jogTargetLine;

    Scale zoomTx = new Scale(1, 1, 0, 0);
    Translate viewTx = new Translate(100, 100);

    public FxNavigationView() {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4673);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4674);Platform.runLater(new Runnable() {
            @Override
            public void run() {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4675);
                __CLR4_5_23lt3ltlx1h34th.R.inc(4676);setScene(createScene());
                __CLR4_5_23lt3ltlx1h34th.R.inc(4677);Configuration.get().addListener(configurationListener);
            }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
        });
    }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

    private Scene createScene() {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4678);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4679);root = new Pane();
        // Flip Y so the coordinate system is that of OpenPnP
        __CLR4_5_23lt3ltlx1h34th.R.inc(4680);root.setScaleY(-1);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4681);scene = new Scene(root, Color.BLACK);

        __CLR4_5_23lt3ltlx1h34th.R.inc(4682);machine = new Group();
        __CLR4_5_23lt3ltlx1h34th.R.inc(4683);machine.getTransforms().add(zoomTx);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4684);machine.getTransforms().add(viewTx);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4685);root.getChildren().add(machine);

        __CLR4_5_23lt3ltlx1h34th.R.inc(4686);bed = new Group();
        __CLR4_5_23lt3ltlx1h34th.R.inc(4687);Rectangle bedRect =
                new Rectangle(machineExtentsBottomLeft.getX(), machineExtentsBottomLeft.getY(),
                        machineExtentsTopRight.getX(), machineExtentsTopRight.getY());
        __CLR4_5_23lt3ltlx1h34th.R.inc(4688);bedRect.setFill(Color.rgb(97, 98, 100));
        __CLR4_5_23lt3ltlx1h34th.R.inc(4689);bed.getChildren().add(bedRect);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4690);machine.getChildren().add(bed);

        __CLR4_5_23lt3ltlx1h34th.R.inc(4691);boards = new Group();
        __CLR4_5_23lt3ltlx1h34th.R.inc(4692);bed.getChildren().add(boards);

        __CLR4_5_23lt3ltlx1h34th.R.inc(4693);scene.setOnScroll(zoomHandler);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4694);scene.setOnDragDetected(jogDragStartHandler);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4695);scene.setOnMouseDragged(jogDragHandler);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4696);scene.setOnMouseDragReleased(jogDragEndHandler);

        __CLR4_5_23lt3ltlx1h34th.R.inc(4697);return scene;
    }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

    Camera getCamera() {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4698);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4699);return Configuration.get().getMachine().getHeads().get(0).getCameras().get(0);
    }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

    EventHandler<MouseEvent> jogDragStartHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4700);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4701);scene.startFullDrag();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4702);Camera camera = getCamera();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4703);Location location = camera.getLocation().convertToUnits(LengthUnit.Millimeters);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4704);Point2D start = machine.localToScene(location.getX(), location.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4705);start = root.sceneToLocal(start);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4706);Point2D end = root.sceneToLocal(e.getX(), e.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4707);jogTargetLine = new Line(start.getX(), start.getY(), end.getX(), end.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4708);jogTargetLine.setStroke(Color.WHITE);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4709);root.getChildren().add(jogTargetLine);
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    EventHandler<MouseEvent> jogDragHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4710);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4711);if ((((jogTargetLine == null)&&(__CLR4_5_23lt3ltlx1h34th.R.iget(4712)!=0|true))||(__CLR4_5_23lt3ltlx1h34th.R.iget(4713)==0&false))) {{
                __CLR4_5_23lt3ltlx1h34th.R.inc(4714);return;
            }
            }__CLR4_5_23lt3ltlx1h34th.R.inc(4715);Point2D end = root.sceneToLocal(e.getX(), e.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4716);jogTargetLine.setEndX(end.getX());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4717);jogTargetLine.setEndY(end.getY());
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    EventHandler<MouseEvent> jogDragEndHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4718);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4719);root.getChildren().remove(jogTargetLine);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4720);final Camera camera = getCamera();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4721);Point2D point = machine.sceneToLocal(e.getX(), e.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4722);final Location location =
                    camera.getLocation().derive(point.getX(), point.getY(), null, null);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4723);UiUtils.submitUiMachineTask(() -> {
                __CLR4_5_23lt3ltlx1h34th.R.inc(4724);camera.moveTo(location);
            });
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    EventHandler<ScrollEvent> zoomHandler = new EventHandler<ScrollEvent>() {
        @Override
        public void handle(final ScrollEvent e) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4725);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4726);e.consume();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4727);Point2D before = machine.sceneToLocal(e.getX(), e.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4728);double scale = zoomTx.getX();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4729);scale += (e.getDeltaY() * scale * 0.001);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4730);scale = Math.max(scale, 0.1);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4731);zoomTx.setX(scale);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4732);zoomTx.setY(scale);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4733);Point2D after = machine.sceneToLocal(e.getX(), e.getY());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4734);Point2D delta = after.subtract(before);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4735);viewTx.setX(viewTx.getX() + delta.getX());
            __CLR4_5_23lt3ltlx1h34th.R.inc(4736);viewTx.setY(viewTx.getY() + delta.getY());
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    JobProcessorListener jobProcessorListener = new JobProcessorListener.Adapter() {
        @Override
        public void jobLoaded(final Job job) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4737);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4738);Platform.runLater(new Runnable() {
                public void run() {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4739);
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4740);boards.getChildren().clear();
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4741);for (BoardLocation boardLocation : job.getBoardLocations()) {{
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4742);Location location =
                                boardLocation.getLocation().convertToUnits(LengthUnit.Millimeters);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4743);Group board = new Group();
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4744);Location dims = boardLocation.getBoard().getDimensions()
                                .convertToUnits(LengthUnit.Millimeters);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4745);double width = Math.max(dims.getX(), 10);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4746);double height = Math.max(dims.getY(), 10);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4747);board.getChildren().add(new Rectangle(width, height, Color.GREEN));
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4748);board.setTranslateX(location.getX() - width / 2);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4749);board.setTranslateY(location.getY() - height / 2);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4750);boards.getChildren().add(board);
                    }
                }}finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
            });
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    ConfigurationListener configurationListener = new ConfigurationListener.Adapter() {
        @Override
        public void configurationComplete(Configuration configuration) throws Exception {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4751);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4752);final Machine machine = configuration.getMachine();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4753);machine.addListener(machineListener);
            // TODO: This doesn't really work in the new JobProcessor world
            // because the JobProcessor gets swapped out when changing tabs.
            // Need to figure out how to reference the current one and
            // maintain listeners across switches.
            __CLR4_5_23lt3ltlx1h34th.R.inc(4754);for (JobProcessor jobProcessor : machine.getJobProcessors().values()) {{
                __CLR4_5_23lt3ltlx1h34th.R.inc(4755);jobProcessor.addListener(jobProcessorListener);
            }
            }__CLR4_5_23lt3ltlx1h34th.R.inc(4756);Platform.runLater(new Runnable() {
                public void run() {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4757);
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4758);for (Camera camera : machine.getCameras()) {{
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4759);CameraImageView view = new CameraImageView(camera);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4760);cameraImageViews.put(camera, view);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4761);FxNavigationView.this.machine.getChildren().add(view);
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4762);updateCameraLocation(camera);
                    }
                    }__CLR4_5_23lt3ltlx1h34th.R.inc(4763);for (Head head : machine.getHeads()) {{
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4764);for (Camera camera : head.getCameras()) {{
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4765);CameraImageView view = new CameraImageView(camera);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4766);cameraImageViews.put(camera, view);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4767);FxNavigationView.this.machine.getChildren().add(view);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4768);updateCameraLocation(camera);
                        }
                        }__CLR4_5_23lt3ltlx1h34th.R.inc(4769);for (Nozzle nozzle : head.getNozzles()) {{
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4770);Rectangle view = new Rectangle(6, 6);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4771);view.setStroke(Color.RED);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4772);view.setFill(null);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4773);view.setArcHeight(1);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4774);view.setArcWidth(1);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4775);nozzleRects.put(nozzle, view);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4776);FxNavigationView.this.machine.getChildren().add(view);
                            __CLR4_5_23lt3ltlx1h34th.R.inc(4777);updateNozzleLocation(nozzle);
                        }
                    }}
                }}finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
            });
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    MachineListener machineListener = new MachineListener.Adapter() {
        @Override
        public void machineHeadActivity(Machine machine, Head head) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4778);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4779);if ((((head == null)&&(__CLR4_5_23lt3ltlx1h34th.R.iget(4780)!=0|true))||(__CLR4_5_23lt3ltlx1h34th.R.iget(4781)==0&false))) {{
                __CLR4_5_23lt3ltlx1h34th.R.inc(4782);return;
            }
            // Reposition anything that might have moved.
            }__CLR4_5_23lt3ltlx1h34th.R.inc(4783);Platform.runLater(() -> {
                __CLR4_5_23lt3ltlx1h34th.R.inc(4784);for (Camera camera : head.getCameras()) {{
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4785);updateCameraLocation(camera);
                }
                }__CLR4_5_23lt3ltlx1h34th.R.inc(4786);for (Nozzle nozzle : head.getNozzles()) {{
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4787);updateNozzleLocation(nozzle);
                }
            }});
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

        @Override
        public void machineEnabled(Machine machine) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4788);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4789);Platform.runLater(() -> {
                __CLR4_5_23lt3ltlx1h34th.R.inc(4790);for (Camera camera : machine.getCameras()) {{
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4791);updateCameraLocation(camera);
                }
                }__CLR4_5_23lt3ltlx1h34th.R.inc(4792);for (Head head : machine.getHeads()) {{
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4793);for (Camera camera : head.getCameras()) {{
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4794);updateCameraLocation(camera);
                    }
                    }__CLR4_5_23lt3ltlx1h34th.R.inc(4795);for (Nozzle nozzle : head.getNozzles()) {{
                        __CLR4_5_23lt3ltlx1h34th.R.inc(4796);updateNozzleLocation(nozzle);
                    }
                }}
            }});
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    };

    private void updateCameraLocation(Camera camera) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4797);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4798);Location location = camera.getLocation().convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4799);CameraImageView view = cameraImageViews.get(camera);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4800);view.setX(location.getX());
        __CLR4_5_23lt3ltlx1h34th.R.inc(4801);view.setY(location.getY());
    }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

    private void updateNozzleLocation(Nozzle nozzle) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4802);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4803);Location location = nozzle.getLocation().convertToUnits(LengthUnit.Millimeters);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4804);Rectangle view = nozzleRects.get(nozzle);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4805);view.setX(location.getX() - view.getWidth() / 2);
        __CLR4_5_23lt3ltlx1h34th.R.inc(4806);view.setY(location.getY() - view.getHeight() / 2);
    }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

    class CameraImageView extends ImageView implements CameraListener {
        final Camera camera;

        public CameraImageView(Camera camera) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4807);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4808);this.camera = camera;
            __CLR4_5_23lt3ltlx1h34th.R.inc(4809);Location unitsPerPixel =
                    camera.getUnitsPerPixel().convertToUnits(LengthUnit.Millimeters);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4810);double width = unitsPerPixel.getX() * camera.getWidth();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4811);double height = unitsPerPixel.getY() * camera.getHeight();
            __CLR4_5_23lt3ltlx1h34th.R.inc(4812);setFitWidth(width);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4813);setFitHeight(height);
            // Images are flipped with respect to display coordinates, so
            // flip em back.
            __CLR4_5_23lt3ltlx1h34th.R.inc(4814);setScaleY(-1);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4815);setTranslateX(-width / 2);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4816);setTranslateY(-height / 2);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4817);setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4818);
                    __CLR4_5_23lt3ltlx1h34th.R.inc(4819);setOpacity((((getOpacity() == 1 )&&(__CLR4_5_23lt3ltlx1h34th.R.iget(4820)!=0|true))||(__CLR4_5_23lt3ltlx1h34th.R.iget(4821)==0&false))? 0.25 : 1);
                }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
            });
            __CLR4_5_23lt3ltlx1h34th.R.inc(4822);camera.startContinuousCapture(this, 10);
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}

        public void frameReceived(BufferedImage img) {try{__CLR4_5_23lt3ltlx1h34th.R.inc(4823);
            __CLR4_5_23lt3ltlx1h34th.R.inc(4824);setImage(SwingFXUtils.toFXImage(img, null));
        }finally{__CLR4_5_23lt3ltlx1h34th.R.flushNeeded();}}
    }
}
