/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.driver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceDriver;
import org.openpnp.machine.reference.ReferenceHead;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.model.Identifiable;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Named;
import org.openpnp.spi.Nozzle;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.base.SimplePropertySheetHolder;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GcodeDriver extends AbstractSerialPortDriver implements Runnable {public static class __CLR4_5_28jl8jllx1h5ocv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,11340,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(GcodeDriver.class);

    @Attribute(required = false)
    protected LengthUnit units = LengthUnit.Millimeters;

    @Attribute(required = false)
    protected int maxFeedRate = 1000;

    @Attribute(required = false)
    protected int connectWaitTimeMilliseconds = 0;
    
    @Element(required = false)
    protected Location homeLocation = new Location(units, 0, 0, 0, 0);

    @Element(required = false)
    protected String commandConfirmRegex = null;

    @Element(required = false)
    protected String connectCommand = null;

    @Element(required = false)
    protected String enableCommand = null;

    @Element(required = false)
    protected String disableCommand = null;

    @Element(required = false)
    protected String homeCommand = null;

    /**
     * This command has special handling for the X, Y, Z and Rotation variables. If the move does
     * not change one of these variables that variable is replaced with the empty string, removing
     * it from the command. This allows Gcode to be sent containing only the components that are
     * being used which is important for some controllers when moving an "extruder" for the C axis.
     * The end result is that if a move contains only a change in the C axis only the C axis value
     * will be sent.
     */
    @Element(required = false)
    protected String moveToCommand = null;

    @Element(required = false)
    protected String pickCommand = null;

    @Element(required = false)
    protected String placeCommand = null;

    @Element(required = false)
    protected String actuateBooleanCommand = null;

    @Element(required = false)
    protected String actuateDoubleCommand = null;

    @ElementList(required = false)
    protected List<ReferenceDriver> subDrivers = new ArrayList<>();

    protected double x, y, z, c;
    private Thread readerThread;
    private boolean disconnectRequested;
    private boolean connected;
    private LinkedBlockingQueue<String> responseQueue = new LinkedBlockingQueue<>();

    public synchronized void connect() throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11073);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11074);super.connect();

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11075);connected = false;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11076);readerThread = new Thread(this);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11077);readerThread.start();

        // Wait a bit while the controller starts up
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11078);Thread.sleep(connectWaitTimeMilliseconds);

        // Consume any startup messages
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11079);try {
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11080);while ((((!sendCommand(null, 250).isEmpty())&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11081)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11082)==0&false))){__CLR4_5_28jl8jllx1h5ocv.R.inc(11083);;
        }}
        catch (Exception e) {

        }

        // Disable the machine
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11084);setEnabled(false);

        // Send startup Gcode
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11085);sendGcode(connectCommand);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11086);connected = true;
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11087);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11088);if ((((enabled && !connected)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11089)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11090)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11091);connect();
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11092);if ((((connected)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11093)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11094)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11095);if ((((enabled)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11096)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11097)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11098);sendGcode(enableCommand);
            }
            }else {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11099);sendGcode(disableCommand);
            }
        }}

        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11100);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11101);driver.setEnabled(enabled);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void home(ReferenceHead head) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11102);
        // Home is sent with an infinite timeout since it's tough to tell how long it will
        // take.
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11103);String command = homeCommand;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11104);command = substituteVariable(command, "Id", head.getId());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11105);command = substituteVariable(command, "Name", head.getName());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11106);sendGcode(command, -1);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11107);x = homeLocation.getX();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11108);y = homeLocation.getY();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11109);z = homeLocation.getZ();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11110);c = homeLocation.getRotation();
        
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11111);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11112);driver.home(head);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public Location getLocation(ReferenceHeadMountable hm) {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11113);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11114);Location location = new Location(units, x, y, z, c).add(hm.getHeadOffsets());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11115);if ((((!(hm instanceof Nozzle))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11116)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11117)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11118);location = location.derive(null, null, 0d, null);
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11119);return location;
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
            throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11120);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11121);location = location.convertToUnits(units);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11122);location = location.subtract(hm.getHeadOffsets());

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11123);double x = location.getX();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11124);double y = location.getY();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11125);double z = location.getZ();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11126);double c = location.getRotation();

        // Only move Z if it's the Nozzle.
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11127);if ((((!(hm instanceof Nozzle))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11128)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11129)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11130);z = Double.NaN;
        }

        // Handle NaNs, which means don't move this axis for this move.
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11131);if ((((Double.isNaN(x))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11132)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11133)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11134);x = this.x;
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11135);if ((((Double.isNaN(y))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11136)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11137)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11138);y = this.y;
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11139);if ((((Double.isNaN(z))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11140)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11141)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11142);z = this.z;
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11143);if ((((Double.isNaN(c))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11144)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11145)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11146);c = this.c;
        }

        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11147);if ((((this.x != x || this.y != y || this.z != z || this.c != c)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11148)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11149)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11150);String command = moveToCommand;
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11151);if ((((hm instanceof Identifiable)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11152)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11153)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11154);command = substituteVariable(command, "Id", ((Identifiable) hm).getId());
            }
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11155);if ((((hm instanceof Named)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11156)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11157)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11158);command = substituteVariable(command, "Name", ((Named) hm).getName());
            }
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11159);command = substituteVariable(command, "X", (((x == this.x )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11160)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11161)==0&false))? null : x);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11162);command = substituteVariable(command, "Y", (((y == this.y )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11163)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11164)==0&false))? null : y);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11165);command = substituteVariable(command, "Z", (((z == this.z )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11166)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11167)==0&false))? null : z);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11168);command = substituteVariable(command, "Rotation", (((c == this.c )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11169)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11170)==0&false))? null : c);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11171);command = substituteVariable(command, "FeedRate", maxFeedRate * speed);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11172);sendGcode(command);
        }

        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11173);this.x = x;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11174);this.y = y;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11175);this.z = z;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11176);this.c = c;

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11177);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11178);driver.moveTo(hm, location, speed);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11179);
    	__CLR4_5_28jl8jllx1h5ocv.R.inc(11180);String command = pickCommand;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11181);command = substituteVariable(command, "Id", nozzle.getId());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11182);command = substituteVariable(command, "Name", nozzle.getName());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11183);sendGcode(command);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11184);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11185);driver.pick(nozzle);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11186);
    	__CLR4_5_28jl8jllx1h5ocv.R.inc(11187);String command = placeCommand;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11188);command = substituteVariable(command, "Id", nozzle.getId());
    	__CLR4_5_28jl8jllx1h5ocv.R.inc(11189);command = substituteVariable(command, "Name", nozzle.getName());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11190);sendGcode(command);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11191);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11192);driver.place(nozzle);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}


    @Override
    public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11193);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11194);String command = actuateBooleanCommand;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11195);command = substituteVariable(command, "Id", actuator.getId());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11196);command = substituteVariable(command, "Name", actuator.getName());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11197);command = substituteVariable(command, "Index", actuator.getIndex());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11198);command = substituteVariable(command, "BooleanValue", on);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11199);command = substituteVariable(command, "True", (((on )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11200)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11201)==0&false))? on : null);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11202);command = substituteVariable(command, "False", (((on )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11203)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11204)==0&false))? null : on);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11205);sendGcode(command);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11206);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11207);driver.actuate(actuator, on);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11208);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11209);String command = actuateDoubleCommand;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11210);command = substituteVariable(command, "Id", actuator.getId());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11211);command = substituteVariable(command, "Name", actuator.getName());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11212);command = substituteVariable(command, "Index", actuator.getIndex());
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11213);command = substituteVariable(command, "DoubleValue", value);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11214);command = substituteVariable(command, "IntegerValue", (int) value);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11215);sendGcode(command);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11216);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11217);driver.actuate(actuator, value);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    public synchronized void disconnect() {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11218);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11219);disconnectRequested = true;
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11220);connected = false;

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11221);try {
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11222);if ((((readerThread != null && readerThread.isAlive())&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11223)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11224)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11225);readerThread.join();
            }
        }}
        catch (Exception e) {
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11226);logger.error("disconnect()", e);
        }

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11227);try {
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11228);super.disconnect();
        }
        catch (Exception e) {
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11229);logger.error("disconnect()", e);
        }
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11230);disconnectRequested = false;
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11231);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11232);super.close();

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11233);for (ReferenceDriver driver : subDrivers) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11234);driver.close();
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    protected List<String> sendGcode(String gCode) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11235);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11236);return sendGcode(gCode, 5000);
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    protected List<String> sendGcode(String gCode, long timeout) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11237);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11238);if ((((gCode == null)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11239)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11240)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11241);return new ArrayList<>();
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11242);List<String> responses = new ArrayList<>();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11243);for (String command : gCode.split("\n")) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11244);command = command.trim();
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11245);if ((((command.length() == 0)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11246)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11247)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11248);continue;
            }
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11249);responses.addAll(sendCommand(command, timeout));
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11250);return responses;
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    protected List<String> sendCommand(String command) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11251);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11252);return sendCommand(command, 5000);
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    protected List<String> sendCommand(String command, long timeout) throws Exception {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11253);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11254);List<String> responses = new ArrayList<>();

        // Read any responses that might be queued up so that when we wait
        // for a response to a command we actually wait for the one we expect.
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11255);responseQueue.drainTo(responses);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11256);logger.debug("sendCommand({}, {})...", command, timeout);

        // Send the command, if one was specified
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11257);if ((((command != null)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11258)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11259)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11260);logger.trace(">> " + command);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11261);output.write(command.getBytes());
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11262);output.write("\n".getBytes());
        }

        // Collect responses till we find one with the confirmation or we timeout. Return
        // the collected responses.
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11263);if ((((timeout == -1)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11264)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11265)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11266);timeout = Long.MAX_VALUE;
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11267);long t = System.currentTimeMillis();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11268);boolean found = false;
        // Loop until we've timed out
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11269);while ((((System.currentTimeMillis() - t < timeout)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11270)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11271)==0&false))) {{
            // Wait to see if a response came in. We wait up until the number of millis remaining
            // in the timeout.
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11272);String response =
                    responseQueue.poll(timeout - (System.currentTimeMillis() - t), TimeUnit.MILLISECONDS);
            // If no response yet, try again.
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11273);if ((((response == null)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11274)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11275)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11276);continue;
            }
            // Store the response that was received
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11277);responses.add(response);
            // If the response is an ok or error we're done
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11278);if ((((response.matches(commandConfirmRegex))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11279)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11280)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11281);found = true;
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11282);break;
            }
        }}
        // If a command was specified and no confirmation was found it's a timeout error.
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11283);if ((((command != null && !found)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11284)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11285)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11286);throw new Exception("Timeout waiting for response to " + command);
        }

        // Read any additional responses that came in after the initial one.
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11287);responseQueue.drainTo(responses);

        __CLR4_5_28jl8jllx1h5ocv.R.inc(11288);logger.debug("sendCommand({}, {}) => {}", new Object[] {command, (((timeout == Long.MAX_VALUE )&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11289)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11290)==0&false))? -1 : timeout, responses});
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11291);return responses;
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    public void run() {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11292);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11293);while ((((!disconnectRequested)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11294)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11295)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11296);String line;
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11297);try {
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11298);line = readLine().trim();
            }
            catch (TimeoutException ex) {
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11299);continue;
            }
            catch (IOException e) {
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11300);logger.error("Read error", e);
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11301);return;
            }
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11302);line = line.trim();
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11303);logger.trace("<< " + line);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11304);responseQueue.offer(line);
        }
    }}finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    /**
     * Find matches of variables in the format {Name:Format} and replace them with the specified
     * value formatted using String.format with the specified Format. Format is optional and
     * defaults to %s. A null value replaces the variable with "".
     */
    static protected String substituteVariable(String command, String name, Object value) {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11305);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11306);if ((((command == null)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11307)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11308)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11309);return command;
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11310);StringBuffer sb = new StringBuffer();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11311);Matcher matcher = Pattern.compile("\\{(\\w+)(?::(.+?))?\\}").matcher(command);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11312);while ((((matcher.find())&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11313)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11314)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11315);String n = matcher.group(1);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11316);if ((((!n.equals(name))&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11317)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11318)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11319);continue;
            }
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11320);String format = matcher.group(2);
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11321);if ((((format == null)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11322)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11323)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11324);format = "%s";
            }
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11325);String v = "";
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11326);if ((((value != null)&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11327)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11328)==0&false))) {{
                __CLR4_5_28jl8jllx1h5ocv.R.inc(11329);v = String.format((Locale) null, format, value);
            }
            }__CLR4_5_28jl8jllx1h5ocv.R.inc(11330);matcher.appendReplacement(sb, v);
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11331);matcher.appendTail(sb);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11332);return sb.toString();
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_28jl8jllx1h5ocv.R.inc(11333);
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11334);ArrayList<PropertySheetHolder> children = new ArrayList<>();
        __CLR4_5_28jl8jllx1h5ocv.R.inc(11335);if ((((!subDrivers.isEmpty())&&(__CLR4_5_28jl8jllx1h5ocv.R.iget(11336)!=0|true))||(__CLR4_5_28jl8jllx1h5ocv.R.iget(11337)==0&false))) {{
            __CLR4_5_28jl8jllx1h5ocv.R.inc(11338);children.add(new SimplePropertySheetHolder("Sub-Drivers", subDrivers));
        }
        }__CLR4_5_28jl8jllx1h5ocv.R.inc(11339);return children.toArray(new PropertySheetHolder[] {});
    }finally{__CLR4_5_28jl8jllx1h5ocv.R.flushNeeded();}}
}
