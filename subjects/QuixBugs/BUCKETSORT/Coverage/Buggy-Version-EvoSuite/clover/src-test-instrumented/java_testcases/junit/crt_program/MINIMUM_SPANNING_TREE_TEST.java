/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import correct_java_programs.MINIMUM_SPANNING_TREE;
import java_programs.Node;
import java_programs.WeightedEdge;

public class MINIMUM_SPANNING_TREE_TEST {static class __CLR4_5_24na4nalwzs9tu7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,6092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Initialize nodes.
    Node node1 = new Node("1");
    Node node2 = new Node("2");
    Node node3 = new Node("3");
    Node node4 = new Node("4");
    Node node5 = new Node("5");
    Node node6 = new Node("6");

    /*
     * Case 1: Simple tree input. expected output: (1, 2) (3, 4) (1, 4)
     */
    @org.junit.Test(timeout = 3000)
    public void test1() {__CLR4_5_24na4nalwzs9tu7.R.globalSliceStart(getClass().getName(),6022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu4na();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24na4nalwzs9tu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_24na4nalwzs9tu7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.MINIMUM_SPANNING_TREE_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu4na(){try{__CLR4_5_24na4nalwzs9tu7.R.inc(6022);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6023);WeightedEdge edge11 = new WeightedEdge(node1, node2, 10);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6024);WeightedEdge edge12 = new WeightedEdge(node2, node3, 15);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6025);WeightedEdge edge13 = new WeightedEdge(node3, node4, 10);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6026);WeightedEdge edge14 = new WeightedEdge(node1, node4, 10);

        __CLR4_5_24na4nalwzs9tu7.R.inc(6027);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge11, edge12, edge13, edge14));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6028);Set<WeightedEdge> minspantree = MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph);

        // set expected edge node set
        __CLR4_5_24na4nalwzs9tu7.R.inc(6029);Set<WeightedEdge> expectedSet = new HashSet<WeightedEdge>();
        __CLR4_5_24na4nalwzs9tu7.R.inc(6030);expectedSet.add(new WeightedEdge(node1, node2, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6031);expectedSet.add(new WeightedEdge(node3, node4, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6032);expectedSet.add(new WeightedEdge(node1, node4, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6033);assertEquals(true, compareWeightedEdgeSet(expectedSet, minspantree));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6034);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_24na4nalwzs9tu7.R.inc(6035);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(),
                    edge.weight);
            __CLR4_5_24na4nalwzs9tu7.R.inc(6036);System.out.println("");
        }
    }}finally{__CLR4_5_24na4nalwzs9tu7.R.flushNeeded();}}


    /*
     * Case 2: Strongly connected tree input. expected output: (1, 3) (4, 6) (2, 3) (3, 6) (2, 5)
     */
    @org.junit.Test(timeout = 3000)
    public void test2() {__CLR4_5_24na4nalwzs9tu7.R.globalSliceStart(getClass().getName(),6037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b4np();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24na4nalwzs9tu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_24na4nalwzs9tu7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.MINIMUM_SPANNING_TREE_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b4np(){try{__CLR4_5_24na4nalwzs9tu7.R.inc(6037);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6038);WeightedEdge edge21 = new WeightedEdge(node1, node2, 6);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6039);WeightedEdge edge22 = new WeightedEdge(node1, node3, 1);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6040);WeightedEdge edge23 = new WeightedEdge(node1, node4, 5);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6041);WeightedEdge edge24 = new WeightedEdge(node2, node3, 5);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6042);WeightedEdge edge25 = new WeightedEdge(node2, node5, 3);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6043);WeightedEdge edge26 = new WeightedEdge(node3, node4, 5);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6044);WeightedEdge edge27 = new WeightedEdge(node3, node5, 6);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6045);WeightedEdge edge28 = new WeightedEdge(node3, node6, 4);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6046);WeightedEdge edge29 = new WeightedEdge(node4, node6, 2);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6047);WeightedEdge edge210 = new WeightedEdge(node5, node6, 6);

        __CLR4_5_24na4nalwzs9tu7.R.inc(6048);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge21, edge22, edge23, edge24,
                edge25, edge26, edge27, edge28, edge29, edge210));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6049);Set<WeightedEdge> minspantree = MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph);

        // (1, 3) (4, 6) (2, 3) (3, 6) (2, 5)
        __CLR4_5_24na4nalwzs9tu7.R.inc(6050);Set<WeightedEdge> expectedSet = new HashSet<WeightedEdge>();
        __CLR4_5_24na4nalwzs9tu7.R.inc(6051);expectedSet.add(new WeightedEdge(node1, node3, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6052);expectedSet.add(new WeightedEdge(node4, node6, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6053);expectedSet.add(new WeightedEdge(node2, node3, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6054);expectedSet.add(new WeightedEdge(node3, node6, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6055);expectedSet.add(new WeightedEdge(node2, node5, 0));

        __CLR4_5_24na4nalwzs9tu7.R.inc(6056);assertEquals(true, compareWeightedEdgeSet(expectedSet, minspantree));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6057);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_24na4nalwzs9tu7.R.inc(6058);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(),
                    edge.weight);
            __CLR4_5_24na4nalwzs9tu7.R.inc(6059);System.out.println("");
        }
    }}finally{__CLR4_5_24na4nalwzs9tu7.R.flushNeeded();}}

    /*
     * Case 3: Minimum spanning tree input. expected output: (1, 2) (1, 3) (2, 4)
     */
    @org.junit.Test(timeout = 3000)
    public void test3() {__CLR4_5_24na4nalwzs9tu7.R.globalSliceStart(getClass().getName(),6060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs4oc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24na4nalwzs9tu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_24na4nalwzs9tu7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.MINIMUM_SPANNING_TREE_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs4oc(){try{__CLR4_5_24na4nalwzs9tu7.R.inc(6060);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6061);WeightedEdge edge31 = new WeightedEdge(node1, node2, 6);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6062);WeightedEdge edge32 = new WeightedEdge(node1, node3, 1);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6063);WeightedEdge edge33 = new WeightedEdge(node2, node4, 2);

        __CLR4_5_24na4nalwzs9tu7.R.inc(6064);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge31, edge32, edge33));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6065);Set<WeightedEdge> minspantree = MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph);

        __CLR4_5_24na4nalwzs9tu7.R.inc(6066);Set<WeightedEdge> expectedSet = new HashSet<WeightedEdge>();
        __CLR4_5_24na4nalwzs9tu7.R.inc(6067);expectedSet.add(new WeightedEdge(node1, node2, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6068);expectedSet.add(new WeightedEdge(node1, node3, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6069);expectedSet.add(new WeightedEdge(node2, node4, 0));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6070);assertEquals(true, compareWeightedEdgeSet(expectedSet, minspantree));
        __CLR4_5_24na4nalwzs9tu7.R.inc(6071);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_24na4nalwzs9tu7.R.inc(6072);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(),
                    edge.weight);
            __CLR4_5_24na4nalwzs9tu7.R.inc(6073);System.out.println("");
        }
    }}finally{__CLR4_5_24na4nalwzs9tu7.R.flushNeeded();}}

    private boolean compareWeightedEdgeSet(Set<WeightedEdge> expectedSet,
            Set<WeightedEdge> minspantree) {try{__CLR4_5_24na4nalwzs9tu7.R.inc(6074);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6075);if ((((expectedSet.size() == minspantree.size())&&(__CLR4_5_24na4nalwzs9tu7.R.iget(6076)!=0|true))||(__CLR4_5_24na4nalwzs9tu7.R.iget(6077)==0&false))) {{
            __CLR4_5_24na4nalwzs9tu7.R.inc(6078);for (WeightedEdge expect : expectedSet) {{
                __CLR4_5_24na4nalwzs9tu7.R.inc(6079);if ((((!setContainWE(minspantree, expect))&&(__CLR4_5_24na4nalwzs9tu7.R.iget(6080)!=0|true))||(__CLR4_5_24na4nalwzs9tu7.R.iget(6081)==0&false))) {{
                    __CLR4_5_24na4nalwzs9tu7.R.inc(6082);return false;
                }
            }}
            }__CLR4_5_24na4nalwzs9tu7.R.inc(6083);return true;
        } }else {{
            __CLR4_5_24na4nalwzs9tu7.R.inc(6084);return false;
        }
    }}finally{__CLR4_5_24na4nalwzs9tu7.R.flushNeeded();}}

    private boolean setContainWE(Set<WeightedEdge> minspantree, WeightedEdge expect) {try{__CLR4_5_24na4nalwzs9tu7.R.inc(6085);
        __CLR4_5_24na4nalwzs9tu7.R.inc(6086);for (WeightedEdge we : minspantree) {{
            __CLR4_5_24na4nalwzs9tu7.R.inc(6087);if ((((we.node1.getValue().equals(expect.node1.getValue())
                    && we.node1.getValue().equals(expect.node1.getValue()))&&(__CLR4_5_24na4nalwzs9tu7.R.iget(6088)!=0|true))||(__CLR4_5_24na4nalwzs9tu7.R.iget(6089)==0&false))) {{
                __CLR4_5_24na4nalwzs9tu7.R.inc(6090);return true;
            }
        }}
        }__CLR4_5_24na4nalwzs9tu7.R.inc(6091);return false;
    }finally{__CLR4_5_24na4nalwzs9tu7.R.flushNeeded();}}

}
