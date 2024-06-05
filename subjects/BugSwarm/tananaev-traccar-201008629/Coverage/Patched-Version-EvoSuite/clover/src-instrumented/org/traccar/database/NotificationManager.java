/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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

public class NotificationManager {public static class __CLR4_5_22ax2axlx1dz7c6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,3110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private final Map<Long, Set<Notification>> userNotifications = new HashMap<>();

    private final ReadWriteLock notificationsLock = new ReentrantReadWriteLock();

    public NotificationManager(DataManager dataManager) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(2985);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(2986);this.dataManager = dataManager;
        __CLR4_5_22ax2axlx1dz7c6.R.inc(2987);refresh();
    }finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public void updateEvent(Event event, Position position) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(2988);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(2989);try {
            __CLR4_5_22ax2axlx1dz7c6.R.inc(2990);dataManager.addEvent(event);
        } catch (SQLException error) {
            __CLR4_5_22ax2axlx1dz7c6.R.inc(2991);Log.warning(error);
        }

        __CLR4_5_22ax2axlx1dz7c6.R.inc(2992);Set<Long> users = Context.getPermissionsManager().getDeviceUsers(event.getDeviceId());
        __CLR4_5_22ax2axlx1dz7c6.R.inc(2993);for (long userId : users) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(2994);if ((((event.getGeofenceId() == 0 || Context.getGeofenceManager() != null
                    && Context.getGeofenceManager().checkGeofence(userId, event.getGeofenceId()))&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(2995)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(2996)==0&false))) {{
                __CLR4_5_22ax2axlx1dz7c6.R.inc(2997);Notification notification = getUserNotificationByType(userId, event.getType());
                __CLR4_5_22ax2axlx1dz7c6.R.inc(2998);if ((((notification != null)&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(2999)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3000)==0&false))) {{
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3001);if ((((notification.getWeb())&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3002)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3003)==0&false))) {{
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3004);Context.getConnectionManager().updateEvent(userId, event);
                    }
                    }__CLR4_5_22ax2axlx1dz7c6.R.inc(3005);if ((((notification.getMail())&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3006)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3007)==0&false))) {{
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3008);NotificationMail.sendMailAsync(userId, event, position);
                    }
                }}
            }}
        }}
        }__CLR4_5_22ax2axlx1dz7c6.R.inc(3009);if ((((Context.getEventForwarder() != null)&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3010)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3011)==0&false))) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3012);Context.getEventForwarder().forwardEvent(event, position);
        }
    }}finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public void updateEvents(Collection<Event> events, Position position) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3013);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3014);for (Event event : events) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3015);updateEvent(event, position);
        }
    }}finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    private Set<Notification> getUserNotificationsUnsafe(long userId) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3016);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3017);if ((((!userNotifications.containsKey(userId))&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3018)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3019)==0&false))) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3020);userNotifications.put(userId, new HashSet<Notification>());
        }
        }__CLR4_5_22ax2axlx1dz7c6.R.inc(3021);return userNotifications.get(userId);
    }finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public Set<Notification> getUserNotifications(long userId) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3022);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3023);notificationsLock.readLock().lock();
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3024);try {
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3025);return getUserNotificationsUnsafe(userId);
        } finally {
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3026);notificationsLock.readLock().unlock();
        }
    }finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public final void refresh() {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3027);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3028);if ((((dataManager != null)&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3029)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3030)==0&false))) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3031);try {
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3032);notificationsLock.writeLock().lock();
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3033);try {
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3034);userNotifications.clear();
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3035);for (Notification notification : dataManager.getNotifications()) {{
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3036);getUserNotificationsUnsafe(notification.getUserId()).add(notification);
                    }
                }} finally {
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3037);notificationsLock.writeLock().unlock();
                }
            } catch (SQLException error) {
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3038);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public Notification getUserNotificationByType(long userId, String type) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3039);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3040);notificationsLock.readLock().lock();
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3041);try {
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3042);for (Notification notification : getUserNotificationsUnsafe(userId)) {{
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3043);if ((((notification.getType().equals(type))&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3044)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3045)==0&false))) {{
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3046);return notification;
                }
            }}
        }} finally {
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3047);notificationsLock.readLock().unlock();
        }
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3048);return null;
    }finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public void updateNotification(Notification notification) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3049);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3050);Notification cachedNotification = getUserNotificationByType(notification.getUserId(), notification.getType());
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3051);if ((((cachedNotification != null)&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3052)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3053)==0&false))) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3054);if ((((cachedNotification.getWeb() != notification.getWeb()
                    || cachedNotification.getMail() != notification.getMail())&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3055)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3056)==0&false))) {{
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3057);if ((((!notification.getWeb() && !notification.getMail())&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3058)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3059)==0&false))) {{
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3060);try {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3061);dataManager.removeNotification(cachedNotification);
                    } catch (SQLException error) {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3062);Log.warning(error);
                    }
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3063);notificationsLock.writeLock().lock();
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3064);try {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3065);getUserNotificationsUnsafe(notification.getUserId()).remove(cachedNotification);
                    } finally {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3066);notificationsLock.writeLock().unlock();
                    }
                } }else {{
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3067);notificationsLock.writeLock().lock();
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3068);try {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3069);cachedNotification.setWeb(notification.getWeb());
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3070);cachedNotification.setMail(notification.getMail());
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3071);cachedNotification.setAttributes(notification.getAttributes());
                    } finally {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3072);notificationsLock.writeLock().unlock();
                    }
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3073);try {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3074);dataManager.updateNotification(cachedNotification);
                    } catch (SQLException error) {
                        __CLR4_5_22ax2axlx1dz7c6.R.inc(3075);Log.warning(error);
                    }
                }
            }} }else {{
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3076);notification.setId(cachedNotification.getId());
            }
        }} }else {__CLR4_5_22ax2axlx1dz7c6.R.inc(3077);if ((((notification.getWeb() || notification.getMail())&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3078)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3079)==0&false))) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3080);try {
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3081);dataManager.addNotification(notification);
            } catch (SQLException error) {
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3082);Log.warning(error);
            }
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3083);notificationsLock.writeLock().lock();
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3084);try {
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3085);getUserNotificationsUnsafe(notification.getUserId()).add(notification);
            } finally {
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3086);notificationsLock.writeLock().unlock();
            }
        }
    }}}finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public Set<Notification> getAllNotifications() {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3087);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3088);Set<Notification> notifications = new HashSet<>();
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3089);long id = 1;
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3090);Field[] fields = Event.class.getDeclaredFields();
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3091);for (Field field : fields) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3092);if ((((Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("TYPE_"))&&(__CLR4_5_22ax2axlx1dz7c6.R.iget(3093)!=0|true))||(__CLR4_5_22ax2axlx1dz7c6.R.iget(3094)==0&false))) {{
                __CLR4_5_22ax2axlx1dz7c6.R.inc(3095);try {
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3096);Notification notification = new Notification();
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3097);notification.setType(field.get(null).toString());
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3098);notification.setId(id++);
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3099);notifications.add(notification);
                } catch (IllegalArgumentException | IllegalAccessException error) {
                    __CLR4_5_22ax2axlx1dz7c6.R.inc(3100);Log.warning(error);
                }
            }
        }}
        }__CLR4_5_22ax2axlx1dz7c6.R.inc(3101);return notifications;
    }finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

    public Collection<Notification> getAllUserNotifications(long userId) {try{__CLR4_5_22ax2axlx1dz7c6.R.inc(3102);
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3103);Map<String, Notification> notifications = new HashMap<>();
        __CLR4_5_22ax2axlx1dz7c6.R.inc(3104);for (Notification notification : getAllNotifications()) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3105);notification.setUserId(userId);
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3106);notifications.put(notification.getType(), notification);
        }
        }__CLR4_5_22ax2axlx1dz7c6.R.inc(3107);for (Notification notification : getUserNotifications(userId)) {{
            __CLR4_5_22ax2axlx1dz7c6.R.inc(3108);notifications.put(notification.getType(), notification);
        }
        }__CLR4_5_22ax2axlx1dz7c6.R.inc(3109);return notifications.values();
    }finally{__CLR4_5_22ax2axlx1dz7c6.R.flushNeeded();}}

}
