/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.support;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icons {public static class __CLR4_5_25uj5ujlx1h1tp9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,7587,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Icon add = getIcon("/icons/file-add.svg");
    public static Icon delete = getIcon("/icons/file-remove.svg");
    public static Icon neww = getIcon("/icons/file-new.svg");
    public static Icon copy = getIcon("/icons/copy.svg");
    public static Icon paste = getIcon("/icons/paste.svg");

    public static Icon captureCamera = getIcon("/icons/capture-camera.svg");
    public static Icon captureTool = getIcon("/icons/capture-nozzle.svg");
    public static Icon capturePin = getIcon("/icons/capture-actuator.svg");

    public static Icon centerCamera = getIcon("/icons/position-camera.svg");
    public static Icon centerTool = getIcon("/icons/position-nozzle.svg");
    public static Icon centerToolNoSafeZ = getIcon("/icons/position-nozzle-no-safe-z.svg");
    public static Icon centerPin = getIcon("/icons/position-actuator.svg");

    public static Icon start = getIcon("/icons/control-start.svg");
    public static Icon pause = getIcon("/icons/control-pause.svg");
    public static Icon step = getIcon("/icons/control-next.svg");
    public static Icon stop = getIcon("/icons/control-stop.svg");

    public static Icon load = getIcon("/icons/nozzletip-load.svg");
    public static Icon unload = getIcon("/icons/nozzletip-unload.svg");

    public static Icon twoPointLocate = getIcon("/icons/board-two-placement-locate.svg");
    public static Icon fiducialCheck = getIcon("/icons/board-fiducial-locate.svg");

    public static Icon feed = getIcon("/icons/feeder-feed.svg");
    public static Icon showPart = getIcon("/icons/feeder-show-part-outline.svg");
    public static Icon editFeeder = getIcon("/icons/feeder-edit.svg");

    public static Icon partAlign = getIcon("/icons/part-align.svg");

    public static Icon arrowUp = getIcon("/icons/ic_arrow_upward_black_18px.svg");
    public static Icon arrowDown = getIcon("/icons/ic_arrow_downward_black_18px.svg");
    public static Icon arrowLeft = getIcon("/icons/ic_arrow_back_black_18px.svg");
    public static Icon arrowRight = getIcon("/icons/ic_arrow_forward_black_18px.svg");
    public static Icon home = getIcon("/icons/ic_home_black_18px.svg");
    public static Icon refresh = getIcon("/icons/ic_refresh_black_18px.svg");
    public static Icon rotateClockwise = getIcon("/icons/ic_rotate_clockwise_black_18px.svg");
    public static Icon rotateCounterclockwise =
            getIcon("/icons/ic_rotate_counterclockwise_black_18px.svg");
    public static Icon zero = getIcon("/icons/ic_exposure_zero_black_18px.svg");
    
    public static Icon navigateFirst = getIcon("/icons/ic_first_page_black_18px.svg");
    public static Icon navigateLast = getIcon("/icons/ic_last_page_black_18px.svg");
    public static Icon navigatePrevious = getIcon("/icons/ic_chevron_left_black_18px.svg");
    public static Icon navigateNext = getIcon("/icons/ic_chevron_right_black_18px.svg");

    public static Icon powerOn = getIcon("/icons/power_button_on.svg");
    public static Icon powerOff = getIcon("/icons/power_button_off.svg");
    
    public static Icon getIcon(String resourceName, int width, int height) {try{__CLR4_5_25uj5ujlx1h1tp9.R.inc(7579);
        __CLR4_5_25uj5ujlx1h1tp9.R.inc(7580);if ((((resourceName.endsWith(".svg"))&&(__CLR4_5_25uj5ujlx1h1tp9.R.iget(7581)!=0|true))||(__CLR4_5_25uj5ujlx1h1tp9.R.iget(7582)==0&false))) {{
            __CLR4_5_25uj5ujlx1h1tp9.R.inc(7583);return new SvgIcon(Icons.class.getResource(resourceName), width, height);
        }
        }else {{
            __CLR4_5_25uj5ujlx1h1tp9.R.inc(7584);return new ImageIcon(Icons.class.getResource(resourceName));
        }
    }}finally{__CLR4_5_25uj5ujlx1h1tp9.R.flushNeeded();}}

    public static Icon getIcon(String resourceName) {try{__CLR4_5_25uj5ujlx1h1tp9.R.inc(7585);
        __CLR4_5_25uj5ujlx1h1tp9.R.inc(7586);return getIcon(resourceName, 24, 24);
    }finally{__CLR4_5_25uj5ujlx1h1tp9.R.flushNeeded();}}
}
