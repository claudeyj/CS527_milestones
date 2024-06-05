/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.database;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Attribute;
import org.traccar.model.Device;
import org.traccar.model.Driver;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.model.ManagedUser;
import org.traccar.model.Position;
import org.traccar.model.User;

public class DataManagerTest {static class __CLR4_5_2jkwjkwlwydylux{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,25407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void constructObjectQuery() {__CLR4_5_2jkwjkwlwydylux.R.globalSliceStart(getClass().getName(),25376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_258gr5zjkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jkwjkwlwydylux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jkwjkwlwydylux.R.globalSliceEnd(getClass().getName(),"org.traccar.database.DataManagerTest.constructObjectQuery",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_258gr5zjkw(){try{__CLR4_5_2jkwjkwlwydylux.R.inc(25376);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25377);Assert.assertEquals("SELECT * FROM users",
                DataManager.constructObjectQuery(DataManager.ACTION_SELECT_ALL, User.class, false));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25378);Assert.assertEquals("DELETE FROM groups WHERE id = :id",
                DataManager.constructObjectQuery(DataManager.ACTION_DELETE, Group.class, false));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25379);Assert.assertEquals("SELECT * FROM positions WHERE id = :id",
                DataManager.constructObjectQuery(DataManager.ACTION_SELECT, Position.class, false));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25380);String insertDevice = DataManager.constructObjectQuery(DataManager.ACTION_INSERT, Device.class, false);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25381);Assert.assertFalse(insertDevice.contains("class"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25382);Assert.assertFalse(insertDevice.contains("id"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25383);Assert.assertFalse(insertDevice.contains("status"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25384);Assert.assertFalse(insertDevice.contains("geofenceIds"));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25385);String updateDeviceStatus = DataManager.constructObjectQuery("update", Device.class, true);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25386);Assert.assertTrue(updateDeviceStatus.contains("lastUpdate"));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25387);String updateUser = DataManager.constructObjectQuery(DataManager.ACTION_UPDATE, User.class, false);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25388);Assert.assertFalse(updateUser.contains("class"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25389);Assert.assertFalse(updateUser.contains("password"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25390);Assert.assertFalse(updateUser.contains("salt"));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25391);String updateUserPassword = DataManager.constructObjectQuery(DataManager.ACTION_UPDATE, User.class, true);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25392);Assert.assertFalse(updateUserPassword.contains("name"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25393);Assert.assertTrue(updateUserPassword.contains("hashedPassword"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25394);Assert.assertTrue(updateUserPassword.contains("salt"));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25395);String insertPosition = DataManager.constructObjectQuery(DataManager.ACTION_INSERT, Position.class, false);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25396);Assert.assertFalse(insertPosition.contains("type"));
        __CLR4_5_2jkwjkwlwydylux.R.inc(25397);Assert.assertFalse(insertPosition.contains("outdated"));

    }finally{__CLR4_5_2jkwjkwlwydylux.R.flushNeeded();}}

    @Test
    public void constructPermissionsQuery() {__CLR4_5_2jkwjkwlwydylux.R.globalSliceStart(getClass().getName(),25398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yfakcijli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jkwjkwlwydylux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jkwjkwlwydylux.R.globalSliceEnd(getClass().getName(),"org.traccar.database.DataManagerTest.constructPermissionsQuery",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yfakcijli(){try{__CLR4_5_2jkwjkwlwydylux.R.inc(25398);
        __CLR4_5_2jkwjkwlwydylux.R.inc(25399);Assert.assertEquals("SELECT userId, deviceId FROM user_device",
                DataManager.constructPermissionQuery(DataManager.ACTION_SELECT_ALL, User.class, Device.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25400);Assert.assertEquals("SELECT userId, managedUserId FROM user_user",
                DataManager.constructPermissionQuery(DataManager.ACTION_SELECT_ALL, User.class, ManagedUser.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25401);Assert.assertEquals("SELECT deviceId, driverId FROM device_driver",
                DataManager.constructPermissionQuery(DataManager.ACTION_SELECT_ALL, Device.class, Driver.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25402);Assert.assertEquals("SELECT groupId, geofenceId FROM group_geofence",
                DataManager.constructPermissionQuery(DataManager.ACTION_SELECT_ALL, Group.class, Geofence.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25403);Assert.assertEquals("INSERT INTO user_device (userId, deviceId) VALUES (:userId, :deviceId)",
                DataManager.constructPermissionQuery(DataManager.ACTION_INSERT, User.class, Device.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25404);Assert.assertEquals("DELETE FROM user_user WHERE userId = :userId AND managedUserId = :managedUserId",
                DataManager.constructPermissionQuery(DataManager.ACTION_DELETE, User.class, ManagedUser.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25405);Assert.assertEquals("INSERT INTO device_geofence (deviceId, geofenceId) VALUES (:deviceId, :geofenceId)",
                DataManager.constructPermissionQuery(DataManager.ACTION_INSERT, Device.class, Geofence.class));

        __CLR4_5_2jkwjkwlwydylux.R.inc(25406);Assert.assertEquals("DELETE FROM group_attribute WHERE groupId = :groupId AND attributeId = :attributeId",
                DataManager.constructPermissionQuery(DataManager.ACTION_DELETE, Group.class, Attribute.class));

    }finally{__CLR4_5_2jkwjkwlwydylux.R.flushNeeded();}}

}
