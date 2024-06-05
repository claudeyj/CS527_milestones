/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.database;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Device;
import org.traccar.model.Group;

import java.util.ArrayList;
import java.util.Collection;

public class GroupTreeTest {static class __CLR4_5_2jlqjlqlwye68fn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,25437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Group createGroup(long id, String name, long parent) {try{__CLR4_5_2jlqjlqlwye68fn.R.inc(25406);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25407);Group group = new Group();
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25408);group.setId(id);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25409);group.setName(name);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25410);group.setGroupId(parent);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25411);return group;
    }finally{__CLR4_5_2jlqjlqlwye68fn.R.flushNeeded();}}

    private static Device createDevice(long id, String name, long parent) {try{__CLR4_5_2jlqjlqlwye68fn.R.inc(25412);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25413);Device device = new Device();
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25414);device.setId(id);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25415);device.setName(name);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25416);device.setGroupId(parent);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25417);return device;
    }finally{__CLR4_5_2jlqjlqlwye68fn.R.flushNeeded();}}

    @Test
    public void testGetDescendants() {__CLR4_5_2jlqjlqlwye68fn.R.globalSliceStart(getClass().getName(),25418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7wxyfjm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jlqjlqlwye68fn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jlqjlqlwye68fn.R.globalSliceEnd(getClass().getName(),"org.traccar.database.GroupTreeTest.testGetDescendants",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7wxyfjm2(){try{__CLR4_5_2jlqjlqlwye68fn.R.inc(25418);
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25419);Collection<Group> groups = new ArrayList<>();
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25420);groups.add(createGroup(1, "First", 0));
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25421);groups.add(createGroup(2, "Second", 1));
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25422);groups.add(createGroup(3, "Third", 2));
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25423);groups.add(createGroup(4, "Fourth", 2));
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25424);groups.add(createGroup(5, "Fifth", 4));

        __CLR4_5_2jlqjlqlwye68fn.R.inc(25425);Collection<Device> devices = new ArrayList<>();
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25426);devices.add(createDevice(1, "One", 3));
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25427);devices.add(createDevice(2, "Two", 5));
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25428);devices.add(createDevice(3, "One", 5));

        __CLR4_5_2jlqjlqlwye68fn.R.inc(25429);GroupTree groupTree = new GroupTree(groups, devices);

        __CLR4_5_2jlqjlqlwye68fn.R.inc(25430);Assert.assertEquals(4, groupTree.getGroups(1).size());
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25431);Assert.assertEquals(3, groupTree.getGroups(2).size());
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25432);Assert.assertEquals(0, groupTree.getGroups(3).size());
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25433);Assert.assertEquals(1, groupTree.getGroups(4).size());

        __CLR4_5_2jlqjlqlwye68fn.R.inc(25434);Assert.assertEquals(3, groupTree.getDevices(1).size());
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25435);Assert.assertEquals(1, groupTree.getDevices(3).size());
        __CLR4_5_2jlqjlqlwye68fn.R.inc(25436);Assert.assertEquals(2, groupTree.getDevices(4).size());
    }finally{__CLR4_5_2jlqjlqlwye68fn.R.flushNeeded();}}

}
