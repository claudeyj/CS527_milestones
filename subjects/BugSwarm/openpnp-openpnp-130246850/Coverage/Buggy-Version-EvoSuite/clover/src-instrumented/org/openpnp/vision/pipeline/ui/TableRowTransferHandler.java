/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.vision.pipeline.ui;

import java.awt.Cursor;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSource;

import javax.activation.ActivationDataFlavor;
import javax.activation.DataHandler;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.TransferHandler;

/**
 * Handles drag & drop row reordering
 * 
 * From: http://stackoverflow.com/questions/638807/how-do-i-drag-and-drop-a-row-in-a-jtable
 */
public class TableRowTransferHandler extends TransferHandler {public static class __CLR4_5_2gs7gs7lx1h0gz5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,21794,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final DataFlavor localObjectFlavor = new ActivationDataFlavor(Integer.class,
            "application/x-java-Integer;class=java.lang.Integer", "Integer Row Index");
    private JTable table = null;

    public TableRowTransferHandler(JTable table) {try{__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21751);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21752);this.table = table;
    }finally{__CLR4_5_2gs7gs7lx1h0gz5.R.flushNeeded();}}

    @Override
    protected Transferable createTransferable(JComponent c) {try{__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21753);
        assert ((((c == table))&&(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21754)!=0|true))||(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21755)==0&false));
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21756);return new DataHandler(new Integer(table.getSelectedRow()),
                localObjectFlavor.getMimeType());
    }finally{__CLR4_5_2gs7gs7lx1h0gz5.R.flushNeeded();}}

    @Override
    public boolean canImport(TransferHandler.TransferSupport info) {try{__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21757);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21758);boolean b = info.getComponent() == table && info.isDrop()
                && info.isDataFlavorSupported(localObjectFlavor);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21759);table.setCursor((((b )&&(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21760)!=0|true))||(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21761)==0&false))? DragSource.DefaultMoveDrop : DragSource.DefaultMoveNoDrop);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21762);return b;
    }finally{__CLR4_5_2gs7gs7lx1h0gz5.R.flushNeeded();}}

    @Override
    public int getSourceActions(JComponent c) {try{__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21763);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21764);return TransferHandler.COPY_OR_MOVE;
    }finally{__CLR4_5_2gs7gs7lx1h0gz5.R.flushNeeded();}}

    @Override
    public boolean importData(TransferHandler.TransferSupport info) {try{__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21765);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21766);JTable target = (JTable) info.getComponent();
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21767);JTable.DropLocation dl = (JTable.DropLocation) info.getDropLocation();
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21768);int index = dl.getRow();
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21769);int max = table.getModel().getRowCount();
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21770);if ((((index < 0 || index > max)&&(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21771)!=0|true))||(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21772)==0&false)))
            {__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21773);index = max;
        }__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21774);target.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21775);try {
            __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21776);Integer rowFrom = (Integer) info.getTransferable().getTransferData(localObjectFlavor);
            __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21777);if ((((rowFrom != -1 && rowFrom != index)&&(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21778)!=0|true))||(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21779)==0&false))) {{
                __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21780);((Reorderable) table.getModel()).reorder(rowFrom, index);
                __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21781);if ((((index > rowFrom)&&(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21782)!=0|true))||(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21783)==0&false)))
                    {__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21784);index--;
                }__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21785);target.getSelectionModel().addSelectionInterval(index, index);
                __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21786);return true;
            }
        }}
        catch (Exception e) {
            __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21787);e.printStackTrace();
        }
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21788);return false;
    }finally{__CLR4_5_2gs7gs7lx1h0gz5.R.flushNeeded();}}

    @Override
    protected void exportDone(JComponent c, Transferable t, int act) {try{__CLR4_5_2gs7gs7lx1h0gz5.R.inc(21789);
        __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21790);if (((((act == TransferHandler.MOVE) || (act == TransferHandler.NONE))&&(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21791)!=0|true))||(__CLR4_5_2gs7gs7lx1h0gz5.R.iget(21792)==0&false))) {{
            __CLR4_5_2gs7gs7lx1h0gz5.R.inc(21793);table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }}finally{__CLR4_5_2gs7gs7lx1h0gz5.R.flushNeeded();}}

}
