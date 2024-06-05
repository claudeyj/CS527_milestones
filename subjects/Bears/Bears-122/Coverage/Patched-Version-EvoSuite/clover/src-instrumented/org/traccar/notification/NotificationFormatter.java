/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.notification;

import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.tools.generic.DateTool;
import org.apache.velocity.tools.generic.NumberTool;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.model.User;
import org.traccar.reports.ReportUtils;

public final class NotificationFormatter {public static class __CLR4_5_259u59ulwye3y34{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,6879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private NotificationFormatter() {try{__CLR4_5_259u59ulwye3y34.R.inc(6834);
    }finally{__CLR4_5_259u59ulwye3y34.R.flushNeeded();}}

    public static VelocityContext prepareContext(long userId, Event event, Position position) {try{__CLR4_5_259u59ulwye3y34.R.inc(6835);
        __CLR4_5_259u59ulwye3y34.R.inc(6836);User user = Context.getPermissionsManager().getUser(userId);
        __CLR4_5_259u59ulwye3y34.R.inc(6837);Device device = Context.getIdentityManager().getById(event.getDeviceId());

        __CLR4_5_259u59ulwye3y34.R.inc(6838);VelocityContext velocityContext = new VelocityContext();
        __CLR4_5_259u59ulwye3y34.R.inc(6839);velocityContext.put("user", user);
        __CLR4_5_259u59ulwye3y34.R.inc(6840);velocityContext.put("device", device);
        __CLR4_5_259u59ulwye3y34.R.inc(6841);velocityContext.put("event", event);
        __CLR4_5_259u59ulwye3y34.R.inc(6842);if ((((position != null)&&(__CLR4_5_259u59ulwye3y34.R.iget(6843)!=0|true))||(__CLR4_5_259u59ulwye3y34.R.iget(6844)==0&false))) {{
            __CLR4_5_259u59ulwye3y34.R.inc(6845);velocityContext.put("position", position);
            __CLR4_5_259u59ulwye3y34.R.inc(6846);velocityContext.put("speedUnits", ReportUtils.getSpeedUnit(userId));
        }
        }__CLR4_5_259u59ulwye3y34.R.inc(6847);if ((((event.getGeofenceId() != 0)&&(__CLR4_5_259u59ulwye3y34.R.iget(6848)!=0|true))||(__CLR4_5_259u59ulwye3y34.R.iget(6849)==0&false))) {{
            __CLR4_5_259u59ulwye3y34.R.inc(6850);velocityContext.put("geofence", Context.getGeofenceManager().getById(event.getGeofenceId()));
        }
        }__CLR4_5_259u59ulwye3y34.R.inc(6851);String driverUniqueId = event.getString(Position.KEY_DRIVER_UNIQUE_ID);
        __CLR4_5_259u59ulwye3y34.R.inc(6852);if ((((driverUniqueId != null)&&(__CLR4_5_259u59ulwye3y34.R.iget(6853)!=0|true))||(__CLR4_5_259u59ulwye3y34.R.iget(6854)==0&false))) {{
            __CLR4_5_259u59ulwye3y34.R.inc(6855);velocityContext.put("driver", Context.getDriversManager().getDriverByUniqueId(driverUniqueId));
        }
        }__CLR4_5_259u59ulwye3y34.R.inc(6856);velocityContext.put("webUrl", Context.getVelocityEngine().getProperty("web.url"));
        __CLR4_5_259u59ulwye3y34.R.inc(6857);velocityContext.put("dateTool", new DateTool());
        __CLR4_5_259u59ulwye3y34.R.inc(6858);velocityContext.put("numberTool", new NumberTool());
        __CLR4_5_259u59ulwye3y34.R.inc(6859);velocityContext.put("timezone", ReportUtils.getTimezone(userId));
        __CLR4_5_259u59ulwye3y34.R.inc(6860);velocityContext.put("locale", Locale.getDefault());
        __CLR4_5_259u59ulwye3y34.R.inc(6861);return velocityContext;
    }finally{__CLR4_5_259u59ulwye3y34.R.flushNeeded();}}

    public static Template getTemplate(Event event, String path) {try{__CLR4_5_259u59ulwye3y34.R.inc(6862);
        __CLR4_5_259u59ulwye3y34.R.inc(6863);Template template;
        __CLR4_5_259u59ulwye3y34.R.inc(6864);try {
            __CLR4_5_259u59ulwye3y34.R.inc(6865);template = Context.getVelocityEngine().getTemplate(path + event.getType() + ".vm",
                    StandardCharsets.UTF_8.name());
        } catch (ResourceNotFoundException error) {
            __CLR4_5_259u59ulwye3y34.R.inc(6866);Log.warning(error);
            __CLR4_5_259u59ulwye3y34.R.inc(6867);template = Context.getVelocityEngine().getTemplate(path + "unknown.vm",
                    StandardCharsets.UTF_8.name());
        }
        __CLR4_5_259u59ulwye3y34.R.inc(6868);return template;
    }finally{__CLR4_5_259u59ulwye3y34.R.flushNeeded();}}

    public static MailMessage formatMailMessage(long userId, Event event, Position position) {try{__CLR4_5_259u59ulwye3y34.R.inc(6869);
        __CLR4_5_259u59ulwye3y34.R.inc(6870);VelocityContext velocityContext = prepareContext(userId, event, position);
        __CLR4_5_259u59ulwye3y34.R.inc(6871);StringWriter writer = new StringWriter();
        __CLR4_5_259u59ulwye3y34.R.inc(6872);getTemplate(event, Context.getConfig().getString("mail.templatesPath", "mail") + "/")
                .merge(velocityContext, writer);
        __CLR4_5_259u59ulwye3y34.R.inc(6873);return new MailMessage((String) velocityContext.get("subject"), writer.toString());
    }finally{__CLR4_5_259u59ulwye3y34.R.flushNeeded();}}

    public static String formatSmsMessage(long userId, Event event, Position position) {try{__CLR4_5_259u59ulwye3y34.R.inc(6874);
        __CLR4_5_259u59ulwye3y34.R.inc(6875);VelocityContext velocityContext = prepareContext(userId, event, position);
        __CLR4_5_259u59ulwye3y34.R.inc(6876);StringWriter writer = new StringWriter();
        __CLR4_5_259u59ulwye3y34.R.inc(6877);getTemplate(event, Context.getConfig().getString("sms.templatesPath", "sms") + "/")
                .merge(velocityContext, writer);
        __CLR4_5_259u59ulwye3y34.R.inc(6878);return writer.toString();
    }finally{__CLR4_5_259u59ulwye3y34.R.flushNeeded();}}
}
