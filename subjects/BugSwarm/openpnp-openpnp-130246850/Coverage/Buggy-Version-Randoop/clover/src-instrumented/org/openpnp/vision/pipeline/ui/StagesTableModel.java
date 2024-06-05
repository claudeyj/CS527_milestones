/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;

@SuppressWarnings({"serial","fallthrough"})
public class StagesTableModel extends AbstractTableModel implements Reorderable {public static class __CLR4_5_2gocgoclx1h1zgz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,21657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static String[] columnNames = {"Enabled", "Name", "Stage"};

    private static Class<?>[] columnClasses = {Boolean.class, String.class, String.class};

    private final List<CvStage> stages;
    private final CvPipeline pipeline;

    public StagesTableModel(CvPipeline pipeline) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21612);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21613);this.pipeline = pipeline;
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21614);this.stages = pipeline.getStages();
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    public void refresh() {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21615);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21616);fireTableDataChanged();
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public void reorder(int fromIndex, int toIndex) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21617);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21618);CvStage stage = getStage(fromIndex);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21619);pipeline.remove(stage);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21620);if ((((fromIndex < toIndex)&&(__CLR4_5_2gocgoclx1h1zgz.R.iget(21621)!=0|true))||(__CLR4_5_2gocgoclx1h1zgz.R.iget(21622)==0&false))) {{
            __CLR4_5_2gocgoclx1h1zgz.R.inc(21623);toIndex--;
        }
        }__CLR4_5_2gocgoclx1h1zgz.R.inc(21624);pipeline.insert(stage, toIndex);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21625);refresh();
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    public CvStage getStage(int rowIndex) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21626);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21627);return stages.get(rowIndex);
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21628);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21629);return columnIndex == 0 || columnIndex == 1;
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21630);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21631);CvStage stage = getStage(rowIndex);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2gocgoclx1h1zgz.R.inc(21632);switch (columnIndex) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2gocgoclx1h1zgz.R.inc(21633);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21634);return stage.isEnabled();
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2gocgoclx1h1zgz.R.inc(21635);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21636);return stage.getName();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2gocgoclx1h1zgz.R.inc(21637);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21638);return stage.getClass().getSimpleName();
        }
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21639);return null;
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21640);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21641);CvStage stage = getStage(rowIndex);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2gocgoclx1h1zgz.R.inc(21642);switch (columnIndex) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_2gocgoclx1h1zgz.R.inc(21643);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21644);stage.setEnabled((Boolean) aValue);
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21645);break;
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2gocgoclx1h1zgz.R.inc(21646);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21647);stage.setName(aValue.toString());
                __CLR4_5_2gocgoclx1h1zgz.R.inc(21648);break;
        }
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public int getRowCount() {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21649);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21650);return stages.size();
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public int getColumnCount() {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21651);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21652);return columnNames.length;
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public String getColumnName(int column) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21653);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21654);return columnNames[column];
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}

    @Override
    public Class<?> getColumnClass(int columnIndex) {try{__CLR4_5_2gocgoclx1h1zgz.R.inc(21655);
        __CLR4_5_2gocgoclx1h1zgz.R.inc(21656);return columnClasses[columnIndex];
    }finally{__CLR4_5_2gocgoclx1h1zgz.R.flushNeeded();}}
}
