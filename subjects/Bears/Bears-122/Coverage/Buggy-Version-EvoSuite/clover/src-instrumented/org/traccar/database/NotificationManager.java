/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.database;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Event;
import org.traccar.model.Notification;
import org.traccar.model.Position;
import org.traccar.notification.NotificationMail;
import org.traccar.notification.NotificationSms;

public class NotificationManager {public static class __CLR4_5_22e02e0lwydw9ir{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,3226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private final Map<Long, Set<Notification>> userNotifications = new HashMap<>();

    private final ReadWriteLock notificationsLock = new ReentrantReadWriteLock();

    public NotificationManager(DataManager dataManager) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3096);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3097);this.dataManager = dataManager;
        __CLR4_5_22e02e0lwydw9ir.R.inc(3098);refresh();
    }finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public void updateEvent(Event event, Position position) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3099);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3100);try {
            __CLR4_5_22e02e0lwydw9ir.R.inc(3101);dataManager.addObject(event);
        } catch (SQLException error) {
            __CLR4_5_22e02e0lwydw9ir.R.inc(3102);Log.warning(error);
        }

        __CLR4_5_22e02e0lwydw9ir.R.inc(3103);Set<Long> users = Context.getPermissionsManager().getDeviceUsers(event.getDeviceId());
        __CLR4_5_22e02e0lwydw9ir.R.inc(3104);for (long userId : users) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3105);if ((((event.getGeofenceId() == 0 || Context.getGeofenceManager() != null
                    && Context.getGeofenceManager().checkItemPermission(userId, event.getGeofenceId()))&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3106)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3107)==0&false))) {{
                __CLR4_5_22e02e0lwydw9ir.R.inc(3108);Notification notification = getUserNotificationByType(userId, event.getType());
                __CLR4_5_22e02e0lwydw9ir.R.inc(3109);if ((((notification != null)&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3110)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3111)==0&false))) {{
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3112);if ((((notification.getWeb())&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3113)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3114)==0&false))) {{
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3115);Context.getConnectionManager().updateEvent(userId, event);
                    }
                    }__CLR4_5_22e02e0lwydw9ir.R.inc(3116);if ((((notification.getMail())&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3117)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3118)==0&false))) {{
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3119);NotificationMail.sendMailAsync(userId, event, position);
                    }
                    }__CLR4_5_22e02e0lwydw9ir.R.inc(3120);if ((((notification.getSms())&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3121)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3122)==0&false))) {{
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3123);NotificationSms.sendSmsAsync(userId, event, position);
                    }
                }}
            }}
        }}
        }__CLR4_5_22e02e0lwydw9ir.R.inc(3124);if ((((Context.getEventForwarder() != null)&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3125)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3126)==0&false))) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3127);Context.getEventForwarder().forwardEvent(event, position);
        }
    }}finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public void updateEvents(Collection<Event> events, Position position) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3128);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3129);for (Event event : events) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3130);updateEvent(event, position);
        }
    }}finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    private Set<Notification> getUserNotificationsUnsafe(long userId) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3131);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3132);if ((((!userNotifications.containsKey(userId))&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3133)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3134)==0&false))) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3135);userNotifications.put(userId, new HashSet<Notification>());
        }
        }__CLR4_5_22e02e0lwydw9ir.R.inc(3136);return userNotifications.get(userId);
    }finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public Set<Notification> getUserNotifications(long userId) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3137);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3138);notificationsLock.readLock().lock();
        __CLR4_5_22e02e0lwydw9ir.R.inc(3139);try {
            __CLR4_5_22e02e0lwydw9ir.R.inc(3140);return getUserNotificationsUnsafe(userId);
        } finally {
            __CLR4_5_22e02e0lwydw9ir.R.inc(3141);notificationsLock.readLock().unlock();
        }
    }finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public final void refresh() {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3142);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3143);if ((((dataManager != null)&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3144)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3145)==0&false))) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3146);try {
                __CLR4_5_22e02e0lwydw9ir.R.inc(3147);notificationsLock.writeLock().lock();
                __CLR4_5_22e02e0lwydw9ir.R.inc(3148);try {
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3149);userNotifications.clear();
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3150);for (Notification notification : dataManager.getObjects(Notification.class)) {{
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3151);getUserNotificationsUnsafe(notification.getUserId()).add(notification);
                    }
                }} finally {
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3152);notificationsLock.writeLock().unlock();
                }
            } catch (SQLException error) {
                __CLR4_5_22e02e0lwydw9ir.R.inc(3153);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public Notification getUserNotificationByType(long userId, String type) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3154);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3155);notificationsLock.readLock().lock();
        __CLR4_5_22e02e0lwydw9ir.R.inc(3156);try {
            __CLR4_5_22e02e0lwydw9ir.R.inc(3157);for (Notification notification : getUserNotificationsUnsafe(userId)) {{
                __CLR4_5_22e02e0lwydw9ir.R.inc(3158);if ((((notification.getType().equals(type))&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3159)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3160)==0&false))) {{
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3161);return notification;
                }
            }}
        }} finally {
            __CLR4_5_22e02e0lwydw9ir.R.inc(3162);notificationsLock.readLock().unlock();
        }
        __CLR4_5_22e02e0lwydw9ir.R.inc(3163);return null;
    }finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public void updateNotification(Notification notification) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3164);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3165);Notification cachedNotification = getUserNotificationByType(notification.getUserId(), notification.getType());
        __CLR4_5_22e02e0lwydw9ir.R.inc(3166);if ((((cachedNotification != null)&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3167)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3168)==0&false))) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3169);if ((((cachedNotification.getWeb() != notification.getWeb()
                    || cachedNotification.getMail() != notification.getMail()
                    || cachedNotification.getSms() != notification.getSms())&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3170)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3171)==0&false))) {{
                __CLR4_5_22e02e0lwydw9ir.R.inc(3172);if ((((!notification.getWeb() && !notification.getMail() && !notification.getSms())&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3173)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3174)==0&false))) {{
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3175);try {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3176);dataManager.removeObject(Notification.class, cachedNotification.getId());
                    } catch (SQLException error) {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3177);Log.warning(error);
                    }
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3178);notificationsLock.writeLock().lock();
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3179);try {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3180);getUserNotificationsUnsafe(notification.getUserId()).remove(cachedNotification);
                    } finally {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3181);notificationsLock.writeLock().unlock();
                    }
                } }else {{
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3182);notificationsLock.writeLock().lock();
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3183);try {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3184);cachedNotification.setWeb(notification.getWeb());
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3185);cachedNotification.setMail(notification.getMail());
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3186);cachedNotification.setSms(notification.getSms());
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3187);cachedNotification.setAttributes(notification.getAttributes());
                    } finally {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3188);notificationsLock.writeLock().unlock();
                    }
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3189);try {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3190);dataManager.updateObject(cachedNotification);
                    } catch (SQLException error) {
                        __CLR4_5_22e02e0lwydw9ir.R.inc(3191);Log.warning(error);
                    }
                }
            }} }else {{
                __CLR4_5_22e02e0lwydw9ir.R.inc(3192);notification.setId(cachedNotification.getId());
            }
        }} }else {__CLR4_5_22e02e0lwydw9ir.R.inc(3193);if ((((notification.getWeb() || notification.getMail() || notification.getSms())&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3194)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3195)==0&false))) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3196);try {
                __CLR4_5_22e02e0lwydw9ir.R.inc(3197);dataManager.addObject(notification);
            } catch (SQLException error) {
                __CLR4_5_22e02e0lwydw9ir.R.inc(3198);Log.warning(error);
            }
            __CLR4_5_22e02e0lwydw9ir.R.inc(3199);notificationsLock.writeLock().lock();
            __CLR4_5_22e02e0lwydw9ir.R.inc(3200);try {
                __CLR4_5_22e02e0lwydw9ir.R.inc(3201);getUserNotificationsUnsafe(notification.getUserId()).add(notification);
            } finally {
                __CLR4_5_22e02e0lwydw9ir.R.inc(3202);notificationsLock.writeLock().unlock();
            }
        }
    }}}finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public Set<Notification> getAllNotifications() {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3203);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3204);Set<Notification> notifications = new HashSet<>();
        __CLR4_5_22e02e0lwydw9ir.R.inc(3205);long id = 1;
        __CLR4_5_22e02e0lwydw9ir.R.inc(3206);Field[] fields = Event.class.getDeclaredFields();
        __CLR4_5_22e02e0lwydw9ir.R.inc(3207);for (Field field : fields) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3208);if ((((Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("TYPE_"))&&(__CLR4_5_22e02e0lwydw9ir.R.iget(3209)!=0|true))||(__CLR4_5_22e02e0lwydw9ir.R.iget(3210)==0&false))) {{
                __CLR4_5_22e02e0lwydw9ir.R.inc(3211);try {
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3212);Notification notification = new Notification();
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3213);notification.setType(field.get(null).toString());
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3214);notification.setId(id++);
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3215);notifications.add(notification);
                } catch (IllegalArgumentException | IllegalAccessException error) {
                    __CLR4_5_22e02e0lwydw9ir.R.inc(3216);Log.warning(error);
                }
            }
        }}
        }__CLR4_5_22e02e0lwydw9ir.R.inc(3217);return notifications;
    }finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

    public Collection<Notification> getAllUserNotifications(long userId) {try{__CLR4_5_22e02e0lwydw9ir.R.inc(3218);
        __CLR4_5_22e02e0lwydw9ir.R.inc(3219);Map<String, Notification> notifications = new HashMap<>();
        __CLR4_5_22e02e0lwydw9ir.R.inc(3220);for (Notification notification : getAllNotifications()) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3221);notification.setUserId(userId);
            __CLR4_5_22e02e0lwydw9ir.R.inc(3222);notifications.put(notification.getType(), notification);
        }
        }__CLR4_5_22e02e0lwydw9ir.R.inc(3223);for (Notification notification : getUserNotifications(userId)) {{
            __CLR4_5_22e02e0lwydw9ir.R.inc(3224);notifications.put(notification.getType(), notification);
        }
        }__CLR4_5_22e02e0lwydw9ir.R.inc(3225);return notifications.values();
    }finally{__CLR4_5_22e02e0lwydw9ir.R.flushNeeded();}}

}
