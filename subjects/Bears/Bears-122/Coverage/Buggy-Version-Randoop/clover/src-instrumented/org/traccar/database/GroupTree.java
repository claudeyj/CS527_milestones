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

import org.traccar.model.Device;
import org.traccar.model.Group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupTree {public static class __CLR4_5_229n29nlwydyf1c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,3022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class TreeNode {

        private Group group;
        private Device device;
        private Collection<TreeNode> children = new HashSet<>();

        TreeNode(Group group) {try{__CLR4_5_229n29nlwydyf1c.R.inc(2939);
            __CLR4_5_229n29nlwydyf1c.R.inc(2940);this.group = group;
        }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        TreeNode(Device device) {try{__CLR4_5_229n29nlwydyf1c.R.inc(2941);
            __CLR4_5_229n29nlwydyf1c.R.inc(2942);this.device = device;
        }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_229n29nlwydyf1c.R.inc(2943);
            __CLR4_5_229n29nlwydyf1c.R.inc(2944);if ((((group != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2945)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2946)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2947);return (int) group.getId();
            } }else {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2948);return (int) device.getId();
            }
        }}finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_5_229n29nlwydyf1c.R.inc(2949);
            __CLR4_5_229n29nlwydyf1c.R.inc(2950);if ((((!(obj instanceof TreeNode))&&(__CLR4_5_229n29nlwydyf1c.R.iget(2951)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2952)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2953);return false;
            }
            }__CLR4_5_229n29nlwydyf1c.R.inc(2954);TreeNode other = (TreeNode) obj;
            __CLR4_5_229n29nlwydyf1c.R.inc(2955);if ((((other == this)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2956)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2957)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2958);return true;
            }
            }__CLR4_5_229n29nlwydyf1c.R.inc(2959);if ((((group != null && other.group != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2960)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2961)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2962);return group.getId() == other.group.getId();
            } }else {__CLR4_5_229n29nlwydyf1c.R.inc(2963);if ((((device != null && other.device != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2964)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2965)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2966);return device.getId() == other.device.getId();
            }
            }}__CLR4_5_229n29nlwydyf1c.R.inc(2967);return false;
        }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        public Group getGroup() {try{__CLR4_5_229n29nlwydyf1c.R.inc(2968);
            __CLR4_5_229n29nlwydyf1c.R.inc(2969);return group;
        }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        public Device getDevice() {try{__CLR4_5_229n29nlwydyf1c.R.inc(2970);
            __CLR4_5_229n29nlwydyf1c.R.inc(2971);return device;
        }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        public void setParent(TreeNode parent) {try{__CLR4_5_229n29nlwydyf1c.R.inc(2972);
            __CLR4_5_229n29nlwydyf1c.R.inc(2973);if ((((parent != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2974)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2975)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2976);parent.children.add(this);
            }
        }}finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

        public Collection<TreeNode> getChildren() {try{__CLR4_5_229n29nlwydyf1c.R.inc(2977);
            __CLR4_5_229n29nlwydyf1c.R.inc(2978);return children;
        }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

    }

    private final Map<Long, TreeNode> groupMap = new HashMap<>();

    public GroupTree(Collection<Group> groups, Collection<Device> devices) {try{__CLR4_5_229n29nlwydyf1c.R.inc(2979);

        __CLR4_5_229n29nlwydyf1c.R.inc(2980);for (Group group : groups) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(2981);groupMap.put(group.getId(), new TreeNode(group));
        }

        }__CLR4_5_229n29nlwydyf1c.R.inc(2982);for (TreeNode node : groupMap.values()) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(2983);if ((((node.getGroup().getGroupId() != 0)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2984)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2985)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2986);node.setParent(groupMap.get(node.getGroup().getGroupId()));
            }
        }}

        }__CLR4_5_229n29nlwydyf1c.R.inc(2987);Map<Long, TreeNode> deviceMap = new HashMap<>();

        __CLR4_5_229n29nlwydyf1c.R.inc(2988);for (Device device : devices) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(2989);deviceMap.put(device.getId(), new TreeNode(device));
        }

        }__CLR4_5_229n29nlwydyf1c.R.inc(2990);for (TreeNode node : deviceMap.values()) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(2991);if ((((node.getDevice().getGroupId() != 0)&&(__CLR4_5_229n29nlwydyf1c.R.iget(2992)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(2993)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(2994);node.setParent(groupMap.get(node.getDevice().getGroupId()));
            }
        }}

    }}finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

    public Collection<Group> getGroups(long groupId) {try{__CLR4_5_229n29nlwydyf1c.R.inc(2995);
        __CLR4_5_229n29nlwydyf1c.R.inc(2996);Set<TreeNode> results = new HashSet<>();
        __CLR4_5_229n29nlwydyf1c.R.inc(2997);getNodes(results, groupMap.get(groupId));
        __CLR4_5_229n29nlwydyf1c.R.inc(2998);Collection<Group> groups = new ArrayList<>();
        __CLR4_5_229n29nlwydyf1c.R.inc(2999);for (TreeNode node : results) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(3000);if ((((node.getGroup() != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(3001)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(3002)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(3003);groups.add(node.getGroup());
            }
        }}
        }__CLR4_5_229n29nlwydyf1c.R.inc(3004);return groups;
    }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

    public Collection<Device> getDevices(long groupId) {try{__CLR4_5_229n29nlwydyf1c.R.inc(3005);
        __CLR4_5_229n29nlwydyf1c.R.inc(3006);Set<TreeNode> results = new HashSet<>();
        __CLR4_5_229n29nlwydyf1c.R.inc(3007);getNodes(results, groupMap.get(groupId));
        __CLR4_5_229n29nlwydyf1c.R.inc(3008);Collection<Device> devices = new ArrayList<>();
        __CLR4_5_229n29nlwydyf1c.R.inc(3009);for (TreeNode node : results) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(3010);if ((((node.getDevice() != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(3011)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(3012)==0&false))) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(3013);devices.add(node.getDevice());
            }
        }}
        }__CLR4_5_229n29nlwydyf1c.R.inc(3014);return devices;
    }finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

    private void getNodes(Set<TreeNode> results, TreeNode node) {try{__CLR4_5_229n29nlwydyf1c.R.inc(3015);
        __CLR4_5_229n29nlwydyf1c.R.inc(3016);if ((((node != null)&&(__CLR4_5_229n29nlwydyf1c.R.iget(3017)!=0|true))||(__CLR4_5_229n29nlwydyf1c.R.iget(3018)==0&false))) {{
            __CLR4_5_229n29nlwydyf1c.R.inc(3019);for (TreeNode child : node.getChildren()) {{
                __CLR4_5_229n29nlwydyf1c.R.inc(3020);results.add(child);
                __CLR4_5_229n29nlwydyf1c.R.inc(3021);getNodes(results, child);
            }
        }}
    }}finally{__CLR4_5_229n29nlwydyf1c.R.flushNeeded();}}

}
