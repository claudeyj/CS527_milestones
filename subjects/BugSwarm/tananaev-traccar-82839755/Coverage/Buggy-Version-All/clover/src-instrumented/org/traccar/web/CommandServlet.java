/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.web;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.traccar.Context;
import org.traccar.database.ActiveDevice;
import org.traccar.model.Command;

@java.lang.SuppressWarnings({"fallthrough"}) public class CommandServlet extends BaseServlet {public static class __CLR4_5_293d93dlx1e5108{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,11814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_293d93dlx1e5108.R.inc(11785);
        
        boolean __CLB4_5_2_bool0=false;__CLR4_5_293d93dlx1e5108.R.inc(11786);switch (command) {
            case "/send":if (!__CLB4_5_2_bool0) {__CLR4_5_293d93dlx1e5108.R.inc(11787);__CLB4_5_2_bool0=true;}
                __CLR4_5_293d93dlx1e5108.R.inc(11788);send(req, resp);
                __CLR4_5_293d93dlx1e5108.R.inc(11789);return true;
            case "/raw":if (!__CLB4_5_2_bool0) {__CLR4_5_293d93dlx1e5108.R.inc(11790);__CLB4_5_2_bool0=true;}
                __CLR4_5_293d93dlx1e5108.R.inc(11791);raw(req, resp);
                __CLR4_5_293d93dlx1e5108.R.inc(11792);return true;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_293d93dlx1e5108.R.inc(11793);__CLB4_5_2_bool0=true;}
                __CLR4_5_293d93dlx1e5108.R.inc(11794);return false;
        }
    }finally{__CLR4_5_293d93dlx1e5108.R.flushNeeded();}}

    public ActiveDevice getActiveDevice(long deviceId) {try{__CLR4_5_293d93dlx1e5108.R.inc(11795);
        __CLR4_5_293d93dlx1e5108.R.inc(11796);ActiveDevice activeDevice = Context.getConnectionManager().getActiveDevice(deviceId);
        __CLR4_5_293d93dlx1e5108.R.inc(11797);if ((((activeDevice == null)&&(__CLR4_5_293d93dlx1e5108.R.iget(11798)!=0|true))||(__CLR4_5_293d93dlx1e5108.R.iget(11799)==0&false))) {{
            __CLR4_5_293d93dlx1e5108.R.inc(11800);throw new RuntimeException("The device is not registered on the server");
        }
        }__CLR4_5_293d93dlx1e5108.R.inc(11801);return activeDevice;
    }finally{__CLR4_5_293d93dlx1e5108.R.flushNeeded();}}

    private void send(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_293d93dlx1e5108.R.inc(11802);

        __CLR4_5_293d93dlx1e5108.R.inc(11803);Command command = JsonConverter.objectFromJson(req.getReader(), new Command());
        __CLR4_5_293d93dlx1e5108.R.inc(11804);Context.getPermissionsManager().checkDevice(getUserId(req), command.getDeviceId());
        __CLR4_5_293d93dlx1e5108.R.inc(11805);getActiveDevice(command.getDeviceId()).sendCommand(command);
        __CLR4_5_293d93dlx1e5108.R.inc(11806);sendResponse(resp.getWriter(), true);
    }finally{__CLR4_5_293d93dlx1e5108.R.flushNeeded();}}

    private void raw(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_293d93dlx1e5108.R.inc(11807);

        __CLR4_5_293d93dlx1e5108.R.inc(11808);JsonObject json = Json.createReader(req.getReader()).readObject();
        __CLR4_5_293d93dlx1e5108.R.inc(11809);long deviceId = json.getJsonNumber("deviceId").longValue();
        __CLR4_5_293d93dlx1e5108.R.inc(11810);String command = json.getString("command");
        __CLR4_5_293d93dlx1e5108.R.inc(11811);Context.getPermissionsManager().checkDevice(getUserId(req), deviceId);
        __CLR4_5_293d93dlx1e5108.R.inc(11812);getActiveDevice(deviceId).write(command);
        __CLR4_5_293d93dlx1e5108.R.inc(11813);sendResponse(resp.getWriter(), true);
    }finally{__CLR4_5_293d93dlx1e5108.R.flushNeeded();}}
}
