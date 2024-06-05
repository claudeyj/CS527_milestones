/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi.base;

import java.util.List;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.spi.PropertySheetHolder;

public class SimplePropertySheetHolder implements PropertySheetHolder {public static class __CLR4_5_2epwepwlx1h8ok0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,19092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected String title;
    protected PropertySheetHolder[] children;
    protected Icon icon;

    public SimplePropertySheetHolder(String title, List<? extends PropertySheetHolder> children) {
        this(title, children, null);__CLR4_5_2epwepwlx1h8ok0.R.inc(19077);try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19076);
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}

    public SimplePropertySheetHolder(String title, List<? extends PropertySheetHolder> children,
            Icon icon) {try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19078);
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19079);this.title = title;
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19080);this.children = children.toArray(new PropertySheetHolder[] {});
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19081);this.icon = icon;
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}

    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19082);
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19083);return title;
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19084);
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19085);return children;
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19086);
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19087);return null;
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19088);
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19089);return null;
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2epwepwlx1h8ok0.R.inc(19090);
        __CLR4_5_2epwepwlx1h8ok0.R.inc(19091);return icon;
    }finally{__CLR4_5_2epwepwlx1h8ok0.R.flushNeeded();}}
}
