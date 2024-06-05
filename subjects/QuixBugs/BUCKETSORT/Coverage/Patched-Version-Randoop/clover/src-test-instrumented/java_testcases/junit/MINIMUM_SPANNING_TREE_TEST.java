/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import java_programs.MINIMUM_SPANNING_TREE;
import java_programs.Node;
import java_programs.WeightedEdge;

public class MINIMUM_SPANNING_TREE_TEST {static class __CLR4_5_23ju3julwzsd7qr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,4672,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public void test1() {__CLR4_5_23ju3julwzsd7qr.R.globalSliceStart(getClass().getName(),4602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu3ju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ju3julwzsd7qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ju3julwzsd7qr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.MINIMUM_SPANNING_TREE_TEST.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu3ju(){try{__CLR4_5_23ju3julwzsd7qr.R.inc(4602);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4603);WeightedEdge edge11 = new WeightedEdge(node1, node2, 10);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4604);WeightedEdge edge12 = new WeightedEdge(node2, node3, 15);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4605);WeightedEdge edge13 = new WeightedEdge(node3, node4, 10);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4606);WeightedEdge edge14 = new WeightedEdge(node1, node4, 10);

        __CLR4_5_23ju3julwzsd7qr.R.inc(4607);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge11, edge12, edge13, edge14));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4608);Set<WeightedEdge> minspantree = MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph);

        // set expected edge node set
        __CLR4_5_23ju3julwzsd7qr.R.inc(4609);Set<WeightedEdge> expectedSet = new HashSet<WeightedEdge>();
        __CLR4_5_23ju3julwzsd7qr.R.inc(4610);expectedSet.add(new WeightedEdge(node1, node2, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4611);expectedSet.add(new WeightedEdge(node3, node4, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4612);expectedSet.add(new WeightedEdge(node1, node4, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4613);assertEquals(true, compareWeightedEdgeSet(expectedSet, minspantree));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4614);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_23ju3julwzsd7qr.R.inc(4615);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(),
                    edge.weight);
            __CLR4_5_23ju3julwzsd7qr.R.inc(4616);System.out.println("");
        }
    }}finally{__CLR4_5_23ju3julwzsd7qr.R.flushNeeded();}}


    /*
     * Case 2: Strongly connected tree input. expected output: (1, 3) (4, 6) (2, 3) (3, 6) (2, 5)
     */
    @org.junit.Test(timeout = 3000)
    public void test2() {__CLR4_5_23ju3julwzsd7qr.R.globalSliceStart(getClass().getName(),4617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b3k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ju3julwzsd7qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ju3julwzsd7qr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.MINIMUM_SPANNING_TREE_TEST.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b3k9(){try{__CLR4_5_23ju3julwzsd7qr.R.inc(4617);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4618);WeightedEdge edge21 = new WeightedEdge(node1, node2, 6);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4619);WeightedEdge edge22 = new WeightedEdge(node1, node3, 1);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4620);WeightedEdge edge23 = new WeightedEdge(node1, node4, 5);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4621);WeightedEdge edge24 = new WeightedEdge(node2, node3, 5);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4622);WeightedEdge edge25 = new WeightedEdge(node2, node5, 3);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4623);WeightedEdge edge26 = new WeightedEdge(node3, node4, 5);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4624);WeightedEdge edge27 = new WeightedEdge(node3, node5, 6);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4625);WeightedEdge edge28 = new WeightedEdge(node3, node6, 4);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4626);WeightedEdge edge29 = new WeightedEdge(node4, node6, 2);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4627);WeightedEdge edge210 = new WeightedEdge(node5, node6, 6);

        __CLR4_5_23ju3julwzsd7qr.R.inc(4628);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge21, edge22, edge23, edge24,
                edge25, edge26, edge27, edge28, edge29, edge210));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4629);Set<WeightedEdge> minspantree = MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph);

        // (1, 3) (4, 6) (2, 3) (3, 6) (2, 5)
        __CLR4_5_23ju3julwzsd7qr.R.inc(4630);Set<WeightedEdge> expectedSet = new HashSet<WeightedEdge>();
        __CLR4_5_23ju3julwzsd7qr.R.inc(4631);expectedSet.add(new WeightedEdge(node1, node3, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4632);expectedSet.add(new WeightedEdge(node4, node6, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4633);expectedSet.add(new WeightedEdge(node2, node3, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4634);expectedSet.add(new WeightedEdge(node3, node6, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4635);expectedSet.add(new WeightedEdge(node2, node5, 0));

        __CLR4_5_23ju3julwzsd7qr.R.inc(4636);assertEquals(true, compareWeightedEdgeSet(expectedSet, minspantree));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4637);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_23ju3julwzsd7qr.R.inc(4638);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(),
                    edge.weight);
            __CLR4_5_23ju3julwzsd7qr.R.inc(4639);System.out.println("");
        }
    }}finally{__CLR4_5_23ju3julwzsd7qr.R.flushNeeded();}}

    /*
     * Case 3: Minimum spanning tree input. expected output: (1, 2) (1, 3) (2, 4)
     */
    @org.junit.Test(timeout = 3000)
    public void test3() {__CLR4_5_23ju3julwzsd7qr.R.globalSliceStart(getClass().getName(),4640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs3kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ju3julwzsd7qr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ju3julwzsd7qr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.MINIMUM_SPANNING_TREE_TEST.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs3kw(){try{__CLR4_5_23ju3julwzsd7qr.R.inc(4640);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4641);WeightedEdge edge31 = new WeightedEdge(node1, node2, 6);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4642);WeightedEdge edge32 = new WeightedEdge(node1, node3, 1);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4643);WeightedEdge edge33 = new WeightedEdge(node2, node4, 2);

        __CLR4_5_23ju3julwzsd7qr.R.inc(4644);List<WeightedEdge> graph = new ArrayList<>(Arrays.asList(edge31, edge32, edge33));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4645);Set<WeightedEdge> minspantree = MINIMUM_SPANNING_TREE.minimum_spanning_tree(graph);

        __CLR4_5_23ju3julwzsd7qr.R.inc(4646);Set<WeightedEdge> expectedSet = new HashSet<WeightedEdge>();
        __CLR4_5_23ju3julwzsd7qr.R.inc(4647);expectedSet.add(new WeightedEdge(node1, node2, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4648);expectedSet.add(new WeightedEdge(node1, node3, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4649);expectedSet.add(new WeightedEdge(node2, node4, 0));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4650);assertEquals(true, compareWeightedEdgeSet(expectedSet, minspantree));
        __CLR4_5_23ju3julwzsd7qr.R.inc(4651);for (WeightedEdge edge : minspantree) {{
            __CLR4_5_23ju3julwzsd7qr.R.inc(4652);System.out.printf("(%s, %s) ", edge.node1.getValue(), edge.node2.getValue(),
                    edge.weight);
            __CLR4_5_23ju3julwzsd7qr.R.inc(4653);System.out.println("");
        }
    }}finally{__CLR4_5_23ju3julwzsd7qr.R.flushNeeded();}}

    private boolean compareWeightedEdgeSet(Set<WeightedEdge> expectedSet,
            Set<WeightedEdge> minspantree) {try{__CLR4_5_23ju3julwzsd7qr.R.inc(4654);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4655);if ((((expectedSet.size() == minspantree.size())&&(__CLR4_5_23ju3julwzsd7qr.R.iget(4656)!=0|true))||(__CLR4_5_23ju3julwzsd7qr.R.iget(4657)==0&false))) {{
            __CLR4_5_23ju3julwzsd7qr.R.inc(4658);for (WeightedEdge expect : expectedSet) {{
                __CLR4_5_23ju3julwzsd7qr.R.inc(4659);if ((((!setContainWE(minspantree, expect))&&(__CLR4_5_23ju3julwzsd7qr.R.iget(4660)!=0|true))||(__CLR4_5_23ju3julwzsd7qr.R.iget(4661)==0&false))) {{
                    __CLR4_5_23ju3julwzsd7qr.R.inc(4662);return false;
                }
            }}
            }__CLR4_5_23ju3julwzsd7qr.R.inc(4663);return true;
        } }else {{
            __CLR4_5_23ju3julwzsd7qr.R.inc(4664);return false;
        }
    }}finally{__CLR4_5_23ju3julwzsd7qr.R.flushNeeded();}}

    private boolean setContainWE(Set<WeightedEdge> minspantree, WeightedEdge expect) {try{__CLR4_5_23ju3julwzsd7qr.R.inc(4665);
        __CLR4_5_23ju3julwzsd7qr.R.inc(4666);for (WeightedEdge we : minspantree) {{
            __CLR4_5_23ju3julwzsd7qr.R.inc(4667);if ((((we.node1.getValue().equals(expect.node1.getValue())
                    && we.node1.getValue().equals(expect.node1.getValue()))&&(__CLR4_5_23ju3julwzsd7qr.R.iget(4668)!=0|true))||(__CLR4_5_23ju3julwzsd7qr.R.iget(4669)==0&false))) {{
                __CLR4_5_23ju3julwzsd7qr.R.inc(4670);return true;
            }
        }}
        }__CLR4_5_23ju3julwzsd7qr.R.inc(4671);return false;
    }finally{__CLR4_5_23ju3julwzsd7qr.R.flushNeeded();}}

}
