/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi.base;

import javax.swing.Icon;

import org.openpnp.ConfigurationListener;
import org.openpnp.gui.support.Icons;
import org.openpnp.model.AbstractModelObject;
import org.openpnp.model.Configuration;
import org.openpnp.model.Part;
import org.openpnp.spi.Feeder;
import org.simpleframework.xml.Attribute;

public abstract class AbstractFeeder extends AbstractModelObject implements Feeder {public static class __CLR4_5_2eefeeflx1h8ohk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,18686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    protected String id;

    @Attribute(required = false)
    protected String name;

    @Attribute
    protected boolean enabled;

    @Attribute
    protected String partId;

    protected Part part;

    public AbstractFeeder() {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18663);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18664);this.id = Configuration.createId();
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18665);this.name = getClass().getSimpleName();
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18666);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18667);
                __CLR4_5_2eefeeflx1h8ohk.R.inc(18668);part = configuration.getPart(partId);
            }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public String getId() {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18669);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18670);return id;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public boolean isEnabled() {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18671);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18672);return enabled;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public void setEnabled(boolean enabled) {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18673);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18674);this.enabled = enabled;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public void setPart(Part part) {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18675);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18676);this.part = part;
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18677);this.partId = part.getId();
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public Part getPart() {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18678);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18679);return part;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18680);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18681);return name;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public void setName(String name) {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18682);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18683);this.name = name;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_2eefeeflx1h8ohk.R.inc(18684);
        __CLR4_5_2eefeeflx1h8ohk.R.inc(18685);return Icons.editFeeder;
    }finally{__CLR4_5_2eefeeflx1h8ohk.R.flushNeeded();}}
}
