/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_programs;
import java.util.*;

public class Node {public static class __CLR4_5_2yoyolwzsca1s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468396533L,8589935092L,1282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String value;
    private ArrayList<Node> successors;
    private ArrayList<Node> predecessors;
    private Node successor;

    public Node() {try{__CLR4_5_2yoyolwzsca1s.R.inc(1248);
        __CLR4_5_2yoyolwzsca1s.R.inc(1249);this.successor = null;
        __CLR4_5_2yoyolwzsca1s.R.inc(1250);this.successors = new ArrayList<Node>();
        __CLR4_5_2yoyolwzsca1s.R.inc(1251);this.predecessors = new ArrayList<Node>();
        __CLR4_5_2yoyolwzsca1s.R.inc(1252);this.value = null;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public Node(String value) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1253);
        __CLR4_5_2yoyolwzsca1s.R.inc(1254);this.value = value;
        __CLR4_5_2yoyolwzsca1s.R.inc(1255);this.successor = null;
        __CLR4_5_2yoyolwzsca1s.R.inc(1256);this.successors = new ArrayList<>();
        __CLR4_5_2yoyolwzsca1s.R.inc(1257);this.predecessors = new ArrayList<>();
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public Node(String value, Node successor) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1258);
        __CLR4_5_2yoyolwzsca1s.R.inc(1259);this.value = value;
        __CLR4_5_2yoyolwzsca1s.R.inc(1260);this.successor = successor;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public Node(String value, ArrayList<Node> successors) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1261);
        __CLR4_5_2yoyolwzsca1s.R.inc(1262);this.value = value;
        __CLR4_5_2yoyolwzsca1s.R.inc(1263);this.successors = successors;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public Node(String value, ArrayList<Node> predecessors, ArrayList<Node> successors) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1264);
        __CLR4_5_2yoyolwzsca1s.R.inc(1265);this.value = value;
        __CLR4_5_2yoyolwzsca1s.R.inc(1266);this.predecessors = predecessors;
        __CLR4_5_2yoyolwzsca1s.R.inc(1267);this.successors = successors;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public String getValue() {try{__CLR4_5_2yoyolwzsca1s.R.inc(1268);
        __CLR4_5_2yoyolwzsca1s.R.inc(1269);return value;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public void setSuccessor(Node successor) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1270);
        __CLR4_5_2yoyolwzsca1s.R.inc(1271);this.successor = successor;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public void setSuccessors(ArrayList<Node> successors) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1272);
        __CLR4_5_2yoyolwzsca1s.R.inc(1273);this.successors = successors;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public void setPredecessors(ArrayList<Node> predecessors) {try{__CLR4_5_2yoyolwzsca1s.R.inc(1274);
        __CLR4_5_2yoyolwzsca1s.R.inc(1275);this.predecessors = predecessors;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public Node getSuccessor() {try{__CLR4_5_2yoyolwzsca1s.R.inc(1276);
        __CLR4_5_2yoyolwzsca1s.R.inc(1277);return successor;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}

    public ArrayList<Node> getSuccessors() {try{__CLR4_5_2yoyolwzsca1s.R.inc(1278);
        __CLR4_5_2yoyolwzsca1s.R.inc(1279);return successors;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}
    public ArrayList<Node> getPredecessors() {try{__CLR4_5_2yoyolwzsca1s.R.inc(1280);
        __CLR4_5_2yoyolwzsca1s.R.inc(1281);return predecessors;
    }finally{__CLR4_5_2yoyolwzsca1s.R.flushNeeded();}}
}
