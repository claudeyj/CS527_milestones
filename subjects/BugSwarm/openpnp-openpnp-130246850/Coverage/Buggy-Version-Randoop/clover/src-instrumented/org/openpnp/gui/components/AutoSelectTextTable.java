/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.components;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;

/**
 * From http://tips4java.wordpress.com/2008/10/20/table-select-all-editor/
 * 
 * The RXTable provides some extensions to the default JTable
 *
 * 1) Select All editing - when a text related cell is placed in editing mode the text is selected.
 * Controlled by invoking a "setSelectAll..." method.
 *
 * 2) reorderColumns - static convenience method for reodering table columns
 */
@SuppressWarnings("serial")
public class AutoSelectTextTable extends JTable {public static class __CLR4_5_22e12e1lx1h1r5t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,3164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private boolean isSelectAllForMouseEvent = true;
    private boolean isSelectAllForActionEvent = true;
    private boolean isSelectAllForKeyEvent = true;

    //
    // Constructors
    //
    /**
     * Constructs a default <code>RXTable</code> that is initialized with a default data model, a
     * default column model, and a default selection model.
     */
    public AutoSelectTextTable() {
        this(null, null, null);__CLR4_5_22e12e1lx1h1r5t.R.inc(3098);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3097);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /**
     * Constructs a <code>RXTable</code> that is initialized with <code>dm</code> as the data model,
     * a default column model, and a default selection model.
     *
     * @param dm the data model for the table
     */
    public AutoSelectTextTable(TableModel dm) {
        this(dm, null, null);__CLR4_5_22e12e1lx1h1r5t.R.inc(3100);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3099);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /**
     * Constructs a <code>RXTable</code> that is initialized with <code>dm</code> as the data model,
     * <code>cm</code> as the column model, and a default selection model.
     *
     * @param dm the data model for the table
     * @param cm the column model for the table
     */
    public AutoSelectTextTable(TableModel dm, TableColumnModel cm) {
        this(dm, cm, null);__CLR4_5_22e12e1lx1h1r5t.R.inc(3102);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3101);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /**
     * Constructs a <code>RXTable</code> that is initialized with <code>dm</code> as the data model,
     * <code>cm</code> as the column model, and <code>sm</code> as the selection model. If any of
     * the parameters are <code>null</code> this method will initialize the table with the
     * corresponding default model. The <code>autoCreateColumnsFromModel</code> flag is set to false
     * if <code>cm</code> is non-null, otherwise it is set to true and the column model is populated
     * with suitable <code>TableColumns</code> for the columns in <code>dm</code>.
     *
     * @param dm the data model for the table
     * @param cm the column model for the table
     * @param sm the row selection model for the table
     */
    public AutoSelectTextTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
        super(dm, cm, sm);__CLR4_5_22e12e1lx1h1r5t.R.inc(3104);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3103);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /**
     * Constructs a <code>RXTable</code> with <code>numRows</code> and <code>numColumns</code> of
     * empty cells using <code>DefaultTableModel</code>. The columns will have names of the form
     * "A", "B", "C", etc.
     *
     * @param numRows the number of rows the table holds
     * @param numColumns the number of columns the table holds
     */
    public AutoSelectTextTable(int numRows, int numColumns) {
        this(new DefaultTableModel(numRows, numColumns));__CLR4_5_22e12e1lx1h1r5t.R.inc(3106);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3105);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /**
     * Constructs a <code>RXTable</code> to display the values in the <code>Vector</code> of
     * <code>Vectors</code>, <code>rowData</code>, with column names, <code>columnNames</code>. The
     * <code>Vectors</code> contained in <code>rowData</code> should contain the values for that
     * row. In other words, the value of the cell at row 1, column 5 can be obtained with the
     * following code:
     * <p>
     * 
     * <pre>
     * ((Vector) rowData.elementAt(1)).elementAt(5);
     * </pre>
     * <p>
     * 
     * @param rowData the data for the new table
     * @param columnNames names of each column
     */
    public AutoSelectTextTable(Vector rowData, Vector columnNames) {
        this(new DefaultTableModel(rowData, columnNames));__CLR4_5_22e12e1lx1h1r5t.R.inc(3108);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3107);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /**
     * Constructs a <code>RXTable</code> to display the values in the two dimensional array,
     * <code>rowData</code>, with column names, <code>columnNames</code>. <code>rowData</code> is an
     * array of rows, so the value of the cell at row 1, column 5 can be obtained with the following
     * code:
     * <p>
     * 
     * <pre>
     *  rowData[1][5];
     * </pre>
     * <p>
     * All rows must be of the same length as <code>columnNames</code>.
     * <p>
     * 
     * @param rowData the data for the new table
     * @param columnNames names of each column
     */
    public AutoSelectTextTable(final Object[][] rowData, final Object[] columnNames) {
        super(rowData, columnNames);__CLR4_5_22e12e1lx1h1r5t.R.inc(3110);try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3109);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    //
    // Overridden methods
    //
    /*
     * Override to provide Select All editing functionality
     */
    public boolean editCellAt(int row, int column, EventObject e) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3111);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3112);boolean result = super.editCellAt(row, column, e);

        __CLR4_5_22e12e1lx1h1r5t.R.inc(3113);if ((((isSelectAllForMouseEvent || isSelectAllForActionEvent || isSelectAllForKeyEvent)&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3114)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3115)==0&false))) {{
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3116);selectAll(e);
        }

        }__CLR4_5_22e12e1lx1h1r5t.R.inc(3117);return result;
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /*
     * Select the text when editing on a text related cell is started
     */
    private void selectAll(EventObject e) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3118);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3119);final Component editor = getEditorComponent();

        __CLR4_5_22e12e1lx1h1r5t.R.inc(3120);if ((((editor == null || !(editor instanceof JTextComponent))&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3121)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3122)==0&false)))
            {__CLR4_5_22e12e1lx1h1r5t.R.inc(3123);return;

        }__CLR4_5_22e12e1lx1h1r5t.R.inc(3124);if ((((e == null)&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3125)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3126)==0&false))) {{
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3127);((JTextComponent) editor).selectAll();
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3128);return;
        }

        // Typing in the cell was used to activate the editor

        }__CLR4_5_22e12e1lx1h1r5t.R.inc(3129);if ((((e instanceof KeyEvent && isSelectAllForKeyEvent)&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3130)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3131)==0&false))) {{
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3132);((JTextComponent) editor).selectAll();
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3133);return;
        }

        // F2 was used to activate the editor

        }__CLR4_5_22e12e1lx1h1r5t.R.inc(3134);if ((((e instanceof ActionEvent && isSelectAllForActionEvent)&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3135)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3136)==0&false))) {{
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3137);((JTextComponent) editor).selectAll();
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3138);return;
        }

        // A mouse click was used to activate the editor.
        // Generally this is a double click and the second mouse click is
        // passed to the editor which would remove the text selection unless
        // we use the invokeLater()

        }__CLR4_5_22e12e1lx1h1r5t.R.inc(3139);if ((((e instanceof MouseEvent && isSelectAllForMouseEvent)&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3140)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3141)==0&false))) {{
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3142);SwingUtilities.invokeLater(new Runnable() {
                public void run() {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3143);
                    __CLR4_5_22e12e1lx1h1r5t.R.inc(3144);((JTextComponent) editor).selectAll();
                }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}
            });
        }
    }}finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    //
    // Newly added methods
    //
    /*
     * Sets the Select All property for for all event types
     */
    public void setSelectAllForEdit(boolean isSelectAllForEdit) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3145);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3146);setSelectAllForMouseEvent(isSelectAllForEdit);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3147);setSelectAllForActionEvent(isSelectAllForEdit);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3148);setSelectAllForKeyEvent(isSelectAllForEdit);
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /*
     * Set the Select All property when editing is invoked by the mouse
     */
    public void setSelectAllForMouseEvent(boolean isSelectAllForMouseEvent) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3149);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3150);this.isSelectAllForMouseEvent = isSelectAllForMouseEvent;
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /*
     * Set the Select All property when editing is invoked by the "F2" key
     */
    public void setSelectAllForActionEvent(boolean isSelectAllForActionEvent) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3151);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3152);this.isSelectAllForActionEvent = isSelectAllForActionEvent;
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    /*
     * Set the Select All property when editing is invoked by typing directly into the cell
     */
    public void setSelectAllForKeyEvent(boolean isSelectAllForKeyEvent) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3153);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3154);this.isSelectAllForKeyEvent = isSelectAllForKeyEvent;
    }finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}

    // public void changeSelection(final int row, final int column, boolean toggle, boolean extend)
    // {
    // super.changeSelection(row, column, toggle, extend);
    // editCellAt(row, column);
    // transferFocus();
    // }

    //
    // Static, convenience methods
    //
    /**
     * Convenience method to order the table columns of a table. The columns are ordered based on
     * the column names specified in the array. If the column name is not found then no column is
     * moved. This means you can specify a null value to preserve the current order of a given
     * column.
     *
     * @param table the table containing the columns to be sorted
     * @param columnNames an array containing the column names in the order they should be displayed
     */
    public static void reorderColumns(JTable table, Object... columnNames) {try{__CLR4_5_22e12e1lx1h1r5t.R.inc(3155);
        __CLR4_5_22e12e1lx1h1r5t.R.inc(3156);TableColumnModel model = table.getColumnModel();

        __CLR4_5_22e12e1lx1h1r5t.R.inc(3157);for (int newIndex = 0; (((newIndex < columnNames.length)&&(__CLR4_5_22e12e1lx1h1r5t.R.iget(3158)!=0|true))||(__CLR4_5_22e12e1lx1h1r5t.R.iget(3159)==0&false)); newIndex++) {{
            __CLR4_5_22e12e1lx1h1r5t.R.inc(3160);try {
                __CLR4_5_22e12e1lx1h1r5t.R.inc(3161);Object columnName = columnNames[newIndex];
                __CLR4_5_22e12e1lx1h1r5t.R.inc(3162);int index = model.getColumnIndex(columnName);
                __CLR4_5_22e12e1lx1h1r5t.R.inc(3163);model.moveColumn(index, newIndex);
            }
            catch (IllegalArgumentException e) {
            }
        }
    }}finally{__CLR4_5_22e12e1lx1h1r5t.R.flushNeeded();}}
} // End of Class RXTable
