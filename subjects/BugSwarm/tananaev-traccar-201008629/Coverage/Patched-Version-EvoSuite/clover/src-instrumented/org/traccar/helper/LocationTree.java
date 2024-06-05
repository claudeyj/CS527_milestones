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
package org.traccar.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LocationTree {public static class __CLR4_5_23ts3tslx1dz8w6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,5025,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class Item {

        private Item left, right;
        private float x, y;
        private String data;

        public Item(float x, float y) {
            this(x, y, null);__CLR4_5_23ts3tslx1dz8w6.R.inc(4961);try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4960);
        }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

        public Item(float x, float y, String data) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4962);
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4963);this.x = x;
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4964);this.y = y;
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4965);this.data = data;
        }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

        public String getData() {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4966);
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4967);return data;
        }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

        private float squaredDistance(Item item) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4968);
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4969);return (x - item.x) * (x - item.x) + (y - item.y) * (y - item.y);
        }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

        private float axisSquaredDistance(Item item, int axis) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4970);
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4971);if ((((axis == 0)&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(4972)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(4973)==0&false))) {{
                __CLR4_5_23ts3tslx1dz8w6.R.inc(4974);return (x - item.x) * (x - item.x);
            } }else {{
                __CLR4_5_23ts3tslx1dz8w6.R.inc(4975);return (y - item.y) * (y - item.y);
            }
        }}finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

    }

    private Item root;

    private ArrayList<Comparator<Item>> comparators = new ArrayList<>();

    public LocationTree(List<Item> items) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4976);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4977);comparators.add(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4978);
                __CLR4_5_23ts3tslx1dz8w6.R.inc(4979);return Float.compare(o1.x, o2.x);
            }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}
        });
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4980);comparators.add(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4981);
                __CLR4_5_23ts3tslx1dz8w6.R.inc(4982);return Float.compare(o1.y, o2.y);
            }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}
        });
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4983);root = createTree(items, 0);
    }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

    private Item createTree(List<Item> items, int depth) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4984);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4985);if ((((items.isEmpty())&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(4986)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(4987)==0&false))) {{
            __CLR4_5_23ts3tslx1dz8w6.R.inc(4988);return null;
        }
        }__CLR4_5_23ts3tslx1dz8w6.R.inc(4989);Collections.sort(items, comparators.get(depth % 2));
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4990);int currentIndex = items.size() / 2;
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4991);Item median = items.get(currentIndex);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4992);median.left = createTree(new ArrayList<>(items.subList(0, currentIndex)), depth + 1);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4993);median.right = createTree(new ArrayList<>(items.subList(currentIndex + 1, items.size())), depth + 1);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4994);return median;
    }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

    public Item findNearest(Item search) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4995);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4996);return findNearest(root, search, 0);
    }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

    private Item findNearest(Item current, Item search, int depth) {try{__CLR4_5_23ts3tslx1dz8w6.R.inc(4997);
        __CLR4_5_23ts3tslx1dz8w6.R.inc(4998);int direction = comparators.get(depth % 2).compare(search, current);

        __CLR4_5_23ts3tslx1dz8w6.R.inc(4999);Item next, other;
        __CLR4_5_23ts3tslx1dz8w6.R.inc(5000);if ((((direction < 0)&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(5001)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(5002)==0&false))) {{
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5003);next = current.left;
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5004);other = current.right;
        } }else {{
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5005);next = current.right;
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5006);other = current.left;
        }

        }__CLR4_5_23ts3tslx1dz8w6.R.inc(5007);Item best = current;
        __CLR4_5_23ts3tslx1dz8w6.R.inc(5008);if ((((next != null)&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(5009)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(5010)==0&false))) {{
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5011);best = findNearest(next, search, depth + 1);
        }

        }__CLR4_5_23ts3tslx1dz8w6.R.inc(5012);if ((((current.squaredDistance(search) < best.squaredDistance(search))&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(5013)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(5014)==0&false))) {{
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5015);best = current;
        }
        }__CLR4_5_23ts3tslx1dz8w6.R.inc(5016);if ((((other != null && current.axisSquaredDistance(search, depth % 2) < best.squaredDistance(search))&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(5017)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(5018)==0&false))) {{
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5019);Item possibleBest = findNearest(other, search, depth + 1);
            __CLR4_5_23ts3tslx1dz8w6.R.inc(5020);if ((((possibleBest.squaredDistance(search) < best.squaredDistance(search))&&(__CLR4_5_23ts3tslx1dz8w6.R.iget(5021)!=0|true))||(__CLR4_5_23ts3tslx1dz8w6.R.iget(5022)==0&false))) {{
                __CLR4_5_23ts3tslx1dz8w6.R.inc(5023);best = possibleBest;
            }
        }}

        }__CLR4_5_23ts3tslx1dz8w6.R.inc(5024);return best;
    }finally{__CLR4_5_23ts3tslx1dz8w6.R.flushNeeded();}}

}
