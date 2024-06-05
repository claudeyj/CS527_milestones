/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.openbuilds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.swing.Action;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.machine.reference.driver.AbstractSerialPortDriver;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenBuildsDriver extends AbstractSerialPortDriver implements Runnable {public static class __CLR4_5_26qa6qalx1h8k8w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,9058,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(OpenBuildsDriver.class);

    @Attribute(required = false)
    protected double feedRateMmPerMinute = 5000;

    @Attribute(required = false)
    private double zCamRadius = 24;

    @Attribute(required = false)
    private double zCamWheelRadius = 9.5;

    @Attribute(required = false)
    private double zGap = 2;

    @Attribute(required = false)
    private boolean homeZ = false;

    protected double x, y, zA, c, c2;
    private Thread readerThread;
    private boolean disconnectRequested;
    private Object commandLock = new Object();
    private boolean connected;
    private LinkedBlockingQueue<String> responseQueue = new LinkedBlockingQueue<>();
    private boolean n1Picked, n2Picked;

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8722);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8723);if ((((enabled && !connected)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8724)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8725)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8726);connect();
        }
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8727);if ((((connected)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8728)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8729)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8730);if ((((enabled)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8731)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8732)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8733);n1Vacuum(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8734);n1Exhaust(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8735);n2Vacuum(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8736);n2Exhaust(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8737);led(true);
            }
            }else {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8738);sendCommand("M84");
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8739);n1Vacuum(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8740);n1Exhaust(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8741);n2Vacuum(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8742);n2Exhaust(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8743);led(false);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8744);pump(false);

            }
        }}
    }}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8745);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8746);if ((((homeZ)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8747)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8748)==0&false))) {{
            // Home Z
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8749);sendCommand("G28 Z0", 10 * 1000);
            // Move Z to 0
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8750);sendCommand("G0 Z0");
        }
        }else {{
            // We "home" Z by turning off the steppers, allowing the
            // spring to pull the nozzle back up to home.
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8751);sendCommand("M84");
            // And call that zero
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8752);sendCommand("G92 Z0");
            // And wait a tick just to let things settle down
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8753);Thread.sleep(250);
        }
        // Home X and Y
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8754);sendCommand("G28 X0 Y0", 60 * 1000);
        // Zero out the two "extruders"
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8755);sendCommand("T1");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8756);sendCommand("G92 E0");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8757);sendCommand("T0");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8758);sendCommand("G92 E0");
        // Update position
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8759);getCurrentPosition();
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}


    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8760);
        // if (actuator.getIndex() == 0) {
        // sendCommand(on ? actuatorOnGcode : actuatorOffGcode);
        // dwell();
        // }
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}



    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8761);}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}


    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8762);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8763);if ((((hm instanceof ReferenceNozzle)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8764)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8765)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8766);ReferenceNozzle nozzle = (ReferenceNozzle) hm;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8767);double z = Math.sin(Math.toRadians(this.zA)) * zCamRadius;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8768);if ((((((ReferenceNozzle) hm).getName().equals("N2"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8769)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8770)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8771);z = -z;
            }
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8772);z += zCamWheelRadius + zGap;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8773);int tool = ((((nozzle == null || nozzle.getName().equals("N1")) )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8774)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8775)==0&false))? 0 : 1;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8776);return new Location(LengthUnit.Millimeters, x, y, z, (((tool == 0 )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8777)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8778)==0&false))? c : c2)
                    .add(hm.getHeadOffsets());
        }
        }else {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8779);return new Location(LengthUnit.Millimeters, x, y, zA, c).add(hm.getHeadOffsets());
        }
    }}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8780);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8781);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8782);location = location.convertToUnits(LengthUnit.Millimeters);

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8783);double x = location.getX();
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8784);double y = location.getY();
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8785);double z = location.getZ();
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8786);double c = location.getRotation();

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8787);ReferenceNozzle nozzle = null;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8788);if ((((hm instanceof ReferenceNozzle)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8789)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8790)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8791);nozzle = (ReferenceNozzle) hm;
        }

        /*
         * Only move Z if it's a Nozzle.
         */
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8792);if ((((nozzle == null)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8793)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8794)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8795);z = Double.NaN;
        }

        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8796);StringBuffer sb = new StringBuffer();
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8797);if ((((!Double.isNaN(x) && x != this.x)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8798)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8799)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8800);sb.append(String.format(Locale.US, "X%2.2f ", x));
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8801);this.x = x;
        }
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8802);if ((((!Double.isNaN(y) && y != this.y)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8803)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8804)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8805);sb.append(String.format(Locale.US, "Y%2.2f ", y));
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8806);this.y = y;
        }
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8807);int tool = ((((nozzle == null || nozzle.getName().equals("N1")) )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8808)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8809)==0&false))? 0 : 1;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8810);if ((((!Double.isNaN(c) && c != ((((tool == 0 )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8811)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8812)==0&false))? this.c : this.c2))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8813)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8814)==0&false))) {{
            // If there is an E move we need to set the tool before
            // performing any commands otherwise we may move the wrong tool.
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8815);sendCommand(String.format(Locale.US, "T%d", tool));
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8816);if ((((sb.length() == 0)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8817)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8818)==0&false))) {{
                // If the move won't contain an X or Y component but will
                // have an E component we need to send the E component as a
                // solo move because Smoothie won't move only E and Z at
                // the same time.
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8819);sendCommand(String.format(Locale.US, "G0 E%2.2f F%2.2f", c, feedRateMmPerMinute * speed));
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8820);dwell();
            }
            }else {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8821);sb.append(String.format(Locale.US, "E%2.2f ", c));
            }
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8822);if ((((tool == 0)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8823)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8824)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8825);this.c = c;
            }
            }else {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8826);this.c2 = c;
            }
        }}

        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8827);if ((((!Double.isNaN(z))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8828)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8829)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8830);double a = Math.toDegrees(Math.asin((z - zCamWheelRadius - zGap) / zCamRadius));
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8831);logger.debug("nozzle {} {} {}", new Object[] {z, zCamRadius, a});
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8832);if ((((nozzle.getName().equals("N2"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8833)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8834)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8835);a = -a;
            }
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8836);if ((((a != this.zA)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8837)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8838)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8839);sb.append(String.format(Locale.US, "Z%2.2f ", a));
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8840);this.zA = a;
            }
        }}

        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8841);if ((((sb.length() > 0)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8842)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8843)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8844);sb.append(String.format(Locale.US, "F%2.2f", feedRateMmPerMinute * speed));
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8845);sendCommand("G0 " + sb.toString());
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8846);dwell();
        }
    }}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8847);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8848);if ((((((ReferenceNozzle) nozzle).getName().equals("N1"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8849)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8850)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8851);pump(true);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8852);n1Exhaust(false);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8853);n1Vacuum(true);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8854);n1Picked = true;
        }
        }else {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8855);pump(true);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8856);n2Exhaust(false);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8857);n2Vacuum(true);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8858);n2Picked = true;
        }
    }}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8859);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8860);if ((((((ReferenceNozzle) nozzle).getName().equals("N1"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8861)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8862)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8863);n1Picked = false;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8864);if ((((!n1Picked && !n2Picked)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8865)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8866)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8867);pump(false);
            }
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8868);n1Vacuum(false);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8869);n1Exhaust(true);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8870);Thread.sleep(500);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8871);n1Exhaust(false);
        }
        }else {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8872);n2Picked = false;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8873);if ((((!n1Picked && !n2Picked)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8874)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8875)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8876);pump(false);
            }
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8877);n2Vacuum(false);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8878);n2Exhaust(true);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8879);Thread.sleep(500);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8880);n2Exhaust(false);
        }
    }}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    public synchronized void connect() throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8881);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8882);super.connect();

        /**
         * Connection process notes:
         * 
         * On some platforms, as soon as we open the serial port it will reset the controller and
         * we'll start getting some data. On others, it may already be running and we will get
         * nothing on connect.
         */

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8883);connected = false;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8884);List<String> responses;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8885);readerThread = new Thread(this);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8886);readerThread.start();

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8887);try {
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8888);do {{
                // Consume any buffered incoming data, including startup messages
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8889);responses = sendCommand(null, 200);
            } }while ((((!responses.isEmpty())&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8890)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8891)==0&false)));
        }
        catch (Exception e) {
            // ignore timeouts
        }


        // Send a request to force Smoothie to respond and clear any buffers.
        // On my machine, at least, this causes Smoothie to re-send it's
        // startup message and I can't figure out why, but this works
        // around it.
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8892);responses = sendCommand("M114", 5000);
        // Continue to read responses until we get the one that is the
        // result of the M114 command. When we see that we're connected.
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8893);long t = System.currentTimeMillis();
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8894);while ((((System.currentTimeMillis() - t < 5000)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8895)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8896)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8897);for (String response : responses) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8898);if ((((response.contains("X:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8899)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8900)==0&false))) {{
                    __CLR4_5_26qa6qalx1h8k8w.R.inc(8901);connected = true;
                    __CLR4_5_26qa6qalx1h8k8w.R.inc(8902);break;
                }
            }}
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8903);if ((((connected)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8904)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8905)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8906);break;
            }
            }__CLR4_5_26qa6qalx1h8k8w.R.inc(8907);responses = sendCommand(null, 200);
        }

        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8908);if ((((!connected)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8909)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8910)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8911);throw new Exception(String.format(
                    "Unable to receive connection response. Check your port and baud rate"));
        }

        // We are connected to at least the minimum required version now
        // So perform some setup

        // Turn off the stepper drivers
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8912);setEnabled(false);

        // Set mm coordinate mode
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8913);sendCommand("G21");
        // Set absolute positioning mode
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8914);sendCommand("G90");
        // Set absolute mode for extruder
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8915);sendCommand("M82");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8916);getCurrentPosition();
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    protected void getCurrentPosition() throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8917);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8918);List<String> responses;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8919);sendCommand("T0");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8920);responses = sendCommand("M114");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8921);for (String response : responses) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8922);if ((((response.contains("X:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8923)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8924)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8925);String[] comps = response.split(" ");
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8926);for (String comp : comps) {{
                    __CLR4_5_26qa6qalx1h8k8w.R.inc(8927);if ((((comp.startsWith("X:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8928)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8929)==0&false))) {{
                        __CLR4_5_26qa6qalx1h8k8w.R.inc(8930);x = Double.parseDouble(comp.split(":")[1]);
                    }
                    }else {__CLR4_5_26qa6qalx1h8k8w.R.inc(8931);if ((((comp.startsWith("Y:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8932)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8933)==0&false))) {{
                        __CLR4_5_26qa6qalx1h8k8w.R.inc(8934);y = Double.parseDouble(comp.split(":")[1]);
                    }
                    }else {__CLR4_5_26qa6qalx1h8k8w.R.inc(8935);if ((((comp.startsWith("Z:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8936)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8937)==0&false))) {{
                        __CLR4_5_26qa6qalx1h8k8w.R.inc(8938);zA = Double.parseDouble(comp.split(":")[1]);
                    }
                    }else {__CLR4_5_26qa6qalx1h8k8w.R.inc(8939);if ((((comp.startsWith("E:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8940)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8941)==0&false))) {{
                        __CLR4_5_26qa6qalx1h8k8w.R.inc(8942);c = Double.parseDouble(comp.split(":")[1]);
                    }
                }}}}}
            }}
        }}
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8943);sendCommand("T1");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8944);responses = sendCommand("M114");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8945);for (String response : responses) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8946);if ((((response.contains("X:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8947)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8948)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8949);String[] comps = response.split(" ");
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8950);for (String comp : comps) {{
                    __CLR4_5_26qa6qalx1h8k8w.R.inc(8951);if ((((comp.startsWith("E:"))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8952)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8953)==0&false))) {{
                        __CLR4_5_26qa6qalx1h8k8w.R.inc(8954);c2 = Double.parseDouble(comp.split(":")[1]);
                    }
                }}
            }}
        }}
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8955);sendCommand("T0");
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8956);logger.debug("Current Position is {}, {}, {}, {}, {}", new Object[] {x, y, zA, c, c2});
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8957);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8958);disconnectRequested = true;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8959);connected = false;

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8960);try {
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8961);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8962)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8963)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8964);readerThread.join();
            }
        }}
        catch (Exception e) {
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8965);logger.error("disconnect()", e);
        }

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8966);try {
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8967);super.disconnect();
        }
        catch (Exception e) {
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8968);logger.error("disconnect()", e);
        }
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8969);disconnectRequested = false;
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    protected List<String> sendCommand(String command) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8970);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8971);return sendCommand(command, 5000);
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    protected List<String> sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8972);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8973);List<String> responses = new ArrayList<>();

        // Read any responses that might be queued up so that when we wait
        // for a response to a command we actually wait for the one we expect.
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8974);responseQueue.drainTo(responses);

        // Send the command, if one was specified
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8975);if ((((command != null)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8976)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8977)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8978);logger.debug("sendCommand({}, {})", command, timeout);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8979);logger.debug(">> " + command);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8980);output.write(command.getBytes());
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8981);output.write("\n".getBytes());
        }

        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8982);String response = null;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8983);if ((((timeout == -1)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8984)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8985)==0&false))) {{
            // Wait forever for a response to return from the reader.
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8986);response = responseQueue.take();
        }
        }else {{
            // Wait up to timeout milliseconds for a response to return from
            // the reader.
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8987);response = responseQueue.poll(timeout, TimeUnit.MILLISECONDS);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(8988);if ((((response == null)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8989)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8990)==0&false))) {{
                __CLR4_5_26qa6qalx1h8k8w.R.inc(8991);throw new Exception("Timeout waiting for response to " + command);
            }
        }}
        // And if we got one, add it to the list of responses we'll return.
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(8992);responses.add(response);

        // Read any additional responses that came in after the initial one.
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8993);responseQueue.drainTo(responses);

        __CLR4_5_26qa6qalx1h8k8w.R.inc(8994);logger.debug("{} => {}", command, responses);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8995);return responses;
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    public void run() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(8996);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(8997);while ((((!disconnectRequested)&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(8998)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(8999)==0&false))) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9000);String line;
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9001);try {
                __CLR4_5_26qa6qalx1h8k8w.R.inc(9002);line = readLine().trim();
            }
            catch (TimeoutException ex) {
                __CLR4_5_26qa6qalx1h8k8w.R.inc(9003);continue;
            }
            catch (IOException e) {
                __CLR4_5_26qa6qalx1h8k8w.R.inc(9004);logger.error("Read error", e);
                __CLR4_5_26qa6qalx1h8k8w.R.inc(9005);return;
            }
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9006);line = line.trim();
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9007);logger.debug("<< " + line);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9008);responseQueue.offer(line);
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9009);if ((((line.startsWith("ok") || line.startsWith("error: "))&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9010)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9011)==0&false))) {{
                // This is the end of processing for a command
                __CLR4_5_26qa6qalx1h8k8w.R.inc(9012);synchronized (commandLock) {
                    __CLR4_5_26qa6qalx1h8k8w.R.inc(9013);commandLock.notify();
                }
            }
        }}
    }}finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    /**
     * Block until all movement is complete.
     * 
     * @throws Exception
     */
    protected void dwell() throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9014);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9015);sendCommand("M400");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private List<String> drainResponseQueue() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9016);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9017);List<String> responses = new ArrayList<>();
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9018);String response;
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9019);while ((response = responseQueue.poll()) != null) {{
            __CLR4_5_26qa6qalx1h8k8w.R.inc(9022);responses.add(response);
        }
        }__CLR4_5_26qa6qalx1h8k8w.R.inc(9023);return responses;
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9024);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9025);return getClass().getSimpleName();
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9026);
        // TODO Auto-generated method stub
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9027);return null;
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9028);
        // TODO Auto-generated method stub
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9029);return null;
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9030);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9031);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9032);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9033);return new OpenBuildsDriverWizard(this);
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private void n1Vacuum(boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9034);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9035);sendCommand((((on )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9036)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9037)==0&false))? "M800" : "M801");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private void n1Exhaust(boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9038);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9039);sendCommand((((on )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9040)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9041)==0&false))? "M802" : "M803");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private void n2Vacuum(boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9042);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9043);sendCommand((((on )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9044)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9045)==0&false))? "M804" : "M805");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private void n2Exhaust(boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9046);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9047);sendCommand((((on )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9048)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9049)==0&false))? "M806" : "M807");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private void pump(boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9050);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9051);sendCommand((((on )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9052)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9053)==0&false))? "M808" : "M809");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}

    private void led(boolean on) throws Exception {try{__CLR4_5_26qa6qalx1h8k8w.R.inc(9054);
        __CLR4_5_26qa6qalx1h8k8w.R.inc(9055);sendCommand((((on )&&(__CLR4_5_26qa6qalx1h8k8w.R.iget(9056)!=0|true))||(__CLR4_5_26qa6qalx1h8k8w.R.iget(9057)==0&false))? "M810" : "M811");
    }finally{__CLR4_5_26qa6qalx1h8k8w.R.flushNeeded();}}
}
