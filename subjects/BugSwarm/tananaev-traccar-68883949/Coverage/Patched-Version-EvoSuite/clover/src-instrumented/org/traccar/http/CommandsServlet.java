/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.http;

import org.traccar.Context;
import org.traccar.database.ActiveDevice;
import org.traccar.command.CommandType;
import org.traccar.command.GpsCommand;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandsServlet extends BaseServlet {public static class __CLR4_5_21hn1hnlx1do7up{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,1963,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_21hn1hnlx1do7up.R.inc(1931);
        __CLR4_5_21hn1hnlx1do7up.R.inc(1932);if ((((command.equals("/send"))&&(__CLR4_5_21hn1hnlx1do7up.R.iget(1933)!=0|true))||(__CLR4_5_21hn1hnlx1do7up.R.iget(1934)==0&false))) {{
            __CLR4_5_21hn1hnlx1do7up.R.inc(1935);send(req, resp);
        }
        }else {__CLR4_5_21hn1hnlx1do7up.R.inc(1936);if ((((command.equals("/raw"))&&(__CLR4_5_21hn1hnlx1do7up.R.iget(1937)!=0|true))||(__CLR4_5_21hn1hnlx1do7up.R.iget(1938)==0&false))) {{
            __CLR4_5_21hn1hnlx1do7up.R.inc(1939);sendRawCommand(req, resp);
        }
        }else {{
            __CLR4_5_21hn1hnlx1do7up.R.inc(1940);return false;
        }
        }}__CLR4_5_21hn1hnlx1do7up.R.inc(1941);return true;
    }finally{__CLR4_5_21hn1hnlx1do7up.R.flushNeeded();}}

    private void send(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_21hn1hnlx1do7up.R.inc(1942);
        __CLR4_5_21hn1hnlx1do7up.R.inc(1943);GpsCommand command = JsonConverter.<GpsCommand>enumObjectFromJson(req.getReader(), new EnumFactory(CommandType.class, "type"));

        __CLR4_5_21hn1hnlx1do7up.R.inc(1944);String uniqueId = command.getUniqueId();

        __CLR4_5_21hn1hnlx1do7up.R.inc(1945);ActiveDevice activeDevice = Context.getConnectionManager().getActiveDevice(uniqueId);
        __CLR4_5_21hn1hnlx1do7up.R.inc(1946);if((((activeDevice == null)&&(__CLR4_5_21hn1hnlx1do7up.R.iget(1947)!=0|true))||(__CLR4_5_21hn1hnlx1do7up.R.iget(1948)==0&false))) {{
            __CLR4_5_21hn1hnlx1do7up.R.inc(1949);throw new RuntimeException("The device has not yet registered to the server");
        }

        }__CLR4_5_21hn1hnlx1do7up.R.inc(1950);activeDevice.sendCommand(command);

        __CLR4_5_21hn1hnlx1do7up.R.inc(1951);sendResponse(resp.getWriter(), JsonConverter.objectToJson(new Object()));
    }finally{__CLR4_5_21hn1hnlx1do7up.R.flushNeeded();}}

    private void sendRawCommand(HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_21hn1hnlx1do7up.R.inc(1952);
        __CLR4_5_21hn1hnlx1do7up.R.inc(1953);JsonObject json = Json.createReader(req.getReader()).readObject();
        __CLR4_5_21hn1hnlx1do7up.R.inc(1954);String uniqueId = json.getString("uniqueId");

        __CLR4_5_21hn1hnlx1do7up.R.inc(1955);ActiveDevice activeDevice = Context.getConnectionManager().getActiveDevice(uniqueId);
        __CLR4_5_21hn1hnlx1do7up.R.inc(1956);if((((activeDevice == null)&&(__CLR4_5_21hn1hnlx1do7up.R.iget(1957)!=0|true))||(__CLR4_5_21hn1hnlx1do7up.R.iget(1958)==0&false))) {{
            __CLR4_5_21hn1hnlx1do7up.R.inc(1959);throw new RuntimeException("The device has not yet registered to the server");
        }

        }__CLR4_5_21hn1hnlx1do7up.R.inc(1960);String command = json.getString("command");
        __CLR4_5_21hn1hnlx1do7up.R.inc(1961);activeDevice.write(command);

        __CLR4_5_21hn1hnlx1do7up.R.inc(1962);sendResponse(resp.getWriter(), JsonConverter.objectToJson(new Object()));
    }finally{__CLR4_5_21hn1hnlx1do7up.R.flushNeeded();}}
}
