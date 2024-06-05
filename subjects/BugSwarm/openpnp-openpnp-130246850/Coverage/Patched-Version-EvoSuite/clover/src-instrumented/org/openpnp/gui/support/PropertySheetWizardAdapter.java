/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.support;

import javax.swing.JPanel;

import org.openpnp.spi.PropertySheetHolder.PropertySheet;

public class PropertySheetWizardAdapter implements PropertySheet, WizardContainer {public static class __CLR4_5_264r64rlx1h5ne9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,7968,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Wizard wizard;
    private final String title;

    public PropertySheetWizardAdapter(Wizard wizard) {
        this(wizard, (((wizard == null )&&(__CLR4_5_264r64rlx1h5ne9.R.iget(7948)!=0|true))||(__CLR4_5_264r64rlx1h5ne9.R.iget(7949)==0&false))? null : wizard.getWizardName());__CLR4_5_264r64rlx1h5ne9.R.inc(7950);try{__CLR4_5_264r64rlx1h5ne9.R.inc(7947);
    }finally{__CLR4_5_264r64rlx1h5ne9.R.flushNeeded();}}

    public PropertySheetWizardAdapter(Wizard wizard, String title) {try{__CLR4_5_264r64rlx1h5ne9.R.inc(7951);
        __CLR4_5_264r64rlx1h5ne9.R.inc(7952);this.wizard = wizard;
        __CLR4_5_264r64rlx1h5ne9.R.inc(7953);this.title = title;
        __CLR4_5_264r64rlx1h5ne9.R.inc(7954);if ((((wizard != null)&&(__CLR4_5_264r64rlx1h5ne9.R.iget(7955)!=0|true))||(__CLR4_5_264r64rlx1h5ne9.R.iget(7956)==0&false))) {{
            __CLR4_5_264r64rlx1h5ne9.R.inc(7957);wizard.setWizardContainer(this);
        }
    }}finally{__CLR4_5_264r64rlx1h5ne9.R.flushNeeded();}}

    @Override
    public String getPropertySheetTitle() {try{__CLR4_5_264r64rlx1h5ne9.R.inc(7958);
        __CLR4_5_264r64rlx1h5ne9.R.inc(7959);return title;
    }finally{__CLR4_5_264r64rlx1h5ne9.R.flushNeeded();}}

    @Override
    public JPanel getPropertySheetPanel() {try{__CLR4_5_264r64rlx1h5ne9.R.inc(7960);
        __CLR4_5_264r64rlx1h5ne9.R.inc(7961);return (((wizard == null )&&(__CLR4_5_264r64rlx1h5ne9.R.iget(7962)!=0|true))||(__CLR4_5_264r64rlx1h5ne9.R.iget(7963)==0&false))? null : wizard.getWizardPanel();
    }finally{__CLR4_5_264r64rlx1h5ne9.R.flushNeeded();}}

    @Override
    public void wizardCompleted(Wizard wizard) {try{__CLR4_5_264r64rlx1h5ne9.R.inc(7964);
        // TODO: Why did I put this here? Need to re-internalize how this was
        // all supposed to work.
        __CLR4_5_264r64rlx1h5ne9.R.inc(7965);System.out.println("Don't call wizardCompleted");
    }finally{__CLR4_5_264r64rlx1h5ne9.R.flushNeeded();}}

    @Override
    public void wizardCancelled(Wizard wizard) {try{__CLR4_5_264r64rlx1h5ne9.R.inc(7966);
        // TODO: Why did I put this here? Need to re-internalize how this was
        // all supposed to work.
        __CLR4_5_264r64rlx1h5ne9.R.inc(7967);System.out.println("Don't call wizardCancelled");
    }finally{__CLR4_5_264r64rlx1h5ne9.R.flushNeeded();}}
}
