/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.api;

import java.sql.SQLException;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.traccar.Context;
import org.traccar.database.BaseObjectManager;
import org.traccar.database.ExtendedObjectManager;
import org.traccar.database.ManagableObjects;
import org.traccar.database.SimpleObjectManager;
import org.traccar.model.BaseModel;
import org.traccar.model.Device;
import org.traccar.model.Group;
import org.traccar.model.User;

public abstract class BaseObjectResource<T extends BaseModel> extends BaseResource {public static class __CLR4_5_213r13rlwye79md{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,1527,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Class<T> baseClass;

    public BaseObjectResource(Class<T> baseClass) {try{__CLR4_5_213r13rlwye79md.R.inc(1431);
        __CLR4_5_213r13rlwye79md.R.inc(1432);this.baseClass = baseClass;
    }finally{__CLR4_5_213r13rlwye79md.R.flushNeeded();}}

    protected final Class<T> getBaseClass() {try{__CLR4_5_213r13rlwye79md.R.inc(1433);
        __CLR4_5_213r13rlwye79md.R.inc(1434);return baseClass;
    }finally{__CLR4_5_213r13rlwye79md.R.flushNeeded();}}

    protected final Set<Long> getSimpleManagerItems(BaseObjectManager<T> manager, boolean all,  long userId) {try{__CLR4_5_213r13rlwye79md.R.inc(1435);
        __CLR4_5_213r13rlwye79md.R.inc(1436);Set<Long> result = null;
        __CLR4_5_213r13rlwye79md.R.inc(1437);if ((((all)&&(__CLR4_5_213r13rlwye79md.R.iget(1438)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1439)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1440);if ((((Context.getPermissionsManager().isAdmin(getUserId()))&&(__CLR4_5_213r13rlwye79md.R.iget(1441)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1442)==0&false))) {{
                __CLR4_5_213r13rlwye79md.R.inc(1443);result = manager.getAllItems();
            } }else {{
                __CLR4_5_213r13rlwye79md.R.inc(1444);Context.getPermissionsManager().checkManager(getUserId());
                __CLR4_5_213r13rlwye79md.R.inc(1445);result = ((ManagableObjects) manager).getManagedItems(getUserId());
            }
        }} }else {{
            __CLR4_5_213r13rlwye79md.R.inc(1446);if ((((userId == 0)&&(__CLR4_5_213r13rlwye79md.R.iget(1447)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1448)==0&false))) {{
                __CLR4_5_213r13rlwye79md.R.inc(1449);userId = getUserId();
            }
            }__CLR4_5_213r13rlwye79md.R.inc(1450);Context.getPermissionsManager().checkUser(getUserId(), userId);
            __CLR4_5_213r13rlwye79md.R.inc(1451);result = ((ManagableObjects) manager).getUserItems(userId);
        }
        }__CLR4_5_213r13rlwye79md.R.inc(1452);return result;
    }finally{__CLR4_5_213r13rlwye79md.R.flushNeeded();}}

    @POST
    public Response add(T entity) throws SQLException {try{__CLR4_5_213r13rlwye79md.R.inc(1453);
        __CLR4_5_213r13rlwye79md.R.inc(1454);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_213r13rlwye79md.R.inc(1455);if ((((baseClass.equals(Device.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1456)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1457)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1458);Context.getPermissionsManager().checkDeviceReadonly(getUserId());
            __CLR4_5_213r13rlwye79md.R.inc(1459);Context.getPermissionsManager().checkDeviceLimit(getUserId());
        }

        }__CLR4_5_213r13rlwye79md.R.inc(1460);BaseObjectManager<T> manager = Context.getManager(baseClass);
        __CLR4_5_213r13rlwye79md.R.inc(1461);manager.addItem(entity);

        __CLR4_5_213r13rlwye79md.R.inc(1462);Context.getDataManager().linkObject(User.class, getUserId(), baseClass, entity.getId(), true);

        __CLR4_5_213r13rlwye79md.R.inc(1463);if ((((manager instanceof SimpleObjectManager)&&(__CLR4_5_213r13rlwye79md.R.iget(1464)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1465)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1466);((SimpleObjectManager<T>) manager).refreshUserItems();
        } }else {__CLR4_5_213r13rlwye79md.R.inc(1467);if ((((baseClass.equals(Group.class) || baseClass.equals(Device.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1468)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1469)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1470);Context.getPermissionsManager().refreshDeviceAndGroupPermissions();
            __CLR4_5_213r13rlwye79md.R.inc(1471);Context.getPermissionsManager().refreshAllExtendedPermissions();
        }
        }}__CLR4_5_213r13rlwye79md.R.inc(1472);return Response.ok(entity).build();
    }finally{__CLR4_5_213r13rlwye79md.R.flushNeeded();}}

    @Path("{id}")
    @PUT
    public Response update(T entity) throws SQLException {try{__CLR4_5_213r13rlwye79md.R.inc(1473);
        __CLR4_5_213r13rlwye79md.R.inc(1474);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_213r13rlwye79md.R.inc(1475);if ((((baseClass.equals(Device.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1476)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1477)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1478);Context.getPermissionsManager().checkDeviceReadonly(getUserId());
        } }else {__CLR4_5_213r13rlwye79md.R.inc(1479);if ((((baseClass.equals(User.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1480)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1481)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1482);User before = Context.getPermissionsManager().getUser(entity.getId());
            __CLR4_5_213r13rlwye79md.R.inc(1483);Context.getPermissionsManager().checkUserUpdate(getUserId(), before, (User) entity);
        }
        }}__CLR4_5_213r13rlwye79md.R.inc(1484);Context.getPermissionsManager().checkPermission(baseClass, getUserId(), entity.getId());

        __CLR4_5_213r13rlwye79md.R.inc(1485);Context.getManager(baseClass).updateItem(entity);

        __CLR4_5_213r13rlwye79md.R.inc(1486);if ((((baseClass.equals(Group.class) || baseClass.equals(Device.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1487)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1488)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1489);Context.getPermissionsManager().refreshDeviceAndGroupPermissions();
            __CLR4_5_213r13rlwye79md.R.inc(1490);Context.getPermissionsManager().refreshAllExtendedPermissions();
        } }else {__CLR4_5_213r13rlwye79md.R.inc(1491);if ((((baseClass.equals(User.class) && Context.getNotificationManager() != null)&&(__CLR4_5_213r13rlwye79md.R.iget(1492)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1493)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1494);Context.getNotificationManager().refresh();
        }
        }}__CLR4_5_213r13rlwye79md.R.inc(1495);return Response.ok(entity).build();
    }finally{__CLR4_5_213r13rlwye79md.R.flushNeeded();}}

    @Path("{id}")
    @DELETE
    public Response remove(@PathParam("id") long id) throws SQLException {try{__CLR4_5_213r13rlwye79md.R.inc(1496);
        __CLR4_5_213r13rlwye79md.R.inc(1497);Context.getPermissionsManager().checkReadonly(getUserId());
        __CLR4_5_213r13rlwye79md.R.inc(1498);if ((((baseClass.equals(Device.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1499)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1500)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1501);Context.getPermissionsManager().checkDeviceReadonly(getUserId());
        }
        }__CLR4_5_213r13rlwye79md.R.inc(1502);Context.getPermissionsManager().checkPermission(baseClass, getUserId(), id);

        __CLR4_5_213r13rlwye79md.R.inc(1503);BaseObjectManager<T> manager = Context.getManager(baseClass);
        __CLR4_5_213r13rlwye79md.R.inc(1504);manager.removeItem(id);

        __CLR4_5_213r13rlwye79md.R.inc(1505);if ((((manager instanceof SimpleObjectManager)&&(__CLR4_5_213r13rlwye79md.R.iget(1506)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1507)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1508);((SimpleObjectManager<T>) manager).refreshUserItems();
            __CLR4_5_213r13rlwye79md.R.inc(1509);if ((((manager instanceof ExtendedObjectManager)&&(__CLR4_5_213r13rlwye79md.R.iget(1510)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1511)==0&false))) {{
                __CLR4_5_213r13rlwye79md.R.inc(1512);((ExtendedObjectManager<T>) manager).refreshExtendedPermissions();
            }
        }}
        }__CLR4_5_213r13rlwye79md.R.inc(1513);if ((((baseClass.equals(Group.class) || baseClass.equals(Device.class) || baseClass.equals(User.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1514)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1515)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1516);Context.getPermissionsManager().refreshDeviceAndGroupPermissions();
            __CLR4_5_213r13rlwye79md.R.inc(1517);if ((((baseClass.equals(User.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1518)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1519)==0&false))) {{
                __CLR4_5_213r13rlwye79md.R.inc(1520);Context.getPermissionsManager().refreshAllUsersPermissions();
            } }else {{
                __CLR4_5_213r13rlwye79md.R.inc(1521);Context.getPermissionsManager().refreshAllExtendedPermissions();
            }
        }}
        // Next should be removed with Attribute Aliases
        }__CLR4_5_213r13rlwye79md.R.inc(1522);if ((((baseClass.equals(Device.class))&&(__CLR4_5_213r13rlwye79md.R.iget(1523)!=0|true))||(__CLR4_5_213r13rlwye79md.R.iget(1524)==0&false))) {{
            __CLR4_5_213r13rlwye79md.R.inc(1525);Context.getAliasesManager().removeDevice(id);
        }
        }__CLR4_5_213r13rlwye79md.R.inc(1526);return Response.noContent().build();
    }finally{__CLR4_5_213r13rlwye79md.R.flushNeeded();}}

}
