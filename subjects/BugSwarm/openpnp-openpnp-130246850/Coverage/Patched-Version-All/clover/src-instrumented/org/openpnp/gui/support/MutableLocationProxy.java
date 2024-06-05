/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.support;

import org.openpnp.model.AbstractModelObject;
import org.openpnp.model.Length;
import org.openpnp.model.Location;

/**
 * A proxy class that allows bindings to mutate a Location field by field by replacing the bound
 * Location whenever a field is changed.
 */
public class MutableLocationProxy extends AbstractModelObject {public static class __CLR4_5_25zm5zmlx1h8joj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,7818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Location location;

    public Location getLocation() {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7762);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7763);return location;
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public void setLocation(Location location) {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7764);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7765);this.location = location;
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7766);firePropertyChange("location", null, getLocation());
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public void setLengthX(Length l) {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7767);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7768);if ((((l.getUnits() != location.getUnits())&&(__CLR4_5_25zm5zmlx1h8joj.R.iget(7769)!=0|true))||(__CLR4_5_25zm5zmlx1h8joj.R.iget(7770)==0&false))) {{
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7771);location = location.convertToUnits(l.getUnits());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7772);location = location.derive(l.getValue(), null, null, null);
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7773);firePropertyChange("lengthX", null, getLengthX());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7774);firePropertyChange("lengthY", null, getLengthY());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7775);firePropertyChange("lengthZ", null, getLengthZ());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7776);firePropertyChange("location", null, getLocation());
        }
        }else {{
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7777);location = location.derive(l.getValue(), null, null, null);
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7778);firePropertyChange("lengthX", null, getLengthX());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7779);firePropertyChange("location", null, getLocation());
        }
    }}finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public void setLengthY(Length l) {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7780);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7781);if ((((l.getUnits() != location.getUnits())&&(__CLR4_5_25zm5zmlx1h8joj.R.iget(7782)!=0|true))||(__CLR4_5_25zm5zmlx1h8joj.R.iget(7783)==0&false))) {{
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7784);location = location.convertToUnits(l.getUnits());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7785);location = location.derive(null, l.getValue(), null, null);
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7786);firePropertyChange("lengthX", null, getLengthX());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7787);firePropertyChange("lengthY", null, getLengthY());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7788);firePropertyChange("lengthZ", null, getLengthZ());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7789);firePropertyChange("location", null, getLocation());
        }
        }else {{
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7790);location = location.derive(null, l.getValue(), null, null);
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7791);firePropertyChange("lengthY", null, getLengthY());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7792);firePropertyChange("location", null, getLocation());
        }
    }}finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public void setLengthZ(Length l) {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7793);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7794);if ((((l.getUnits() != location.getUnits())&&(__CLR4_5_25zm5zmlx1h8joj.R.iget(7795)!=0|true))||(__CLR4_5_25zm5zmlx1h8joj.R.iget(7796)==0&false))) {{
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7797);location = location.convertToUnits(l.getUnits());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7798);location = location.derive(null, null, l.getValue(), null);
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7799);firePropertyChange("lengthX", null, getLengthX());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7800);firePropertyChange("lengthY", null, getLengthY());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7801);firePropertyChange("lengthZ", null, getLengthZ());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7802);firePropertyChange("location", null, getLocation());
        }
        }else {{
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7803);location = location.derive(null, null, l.getValue(), null);
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7804);firePropertyChange("lengthZ", null, getLengthY());
            __CLR4_5_25zm5zmlx1h8joj.R.inc(7805);firePropertyChange("location", null, getLocation());
        }
    }}finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public double getRotation() {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7806);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7807);return location.getRotation();
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public void setRotation(double rotation) {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7808);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7809);location = location.derive(null, null, null, rotation);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7810);firePropertyChange("rotation", null, getRotation());
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7811);firePropertyChange("location", null, getLocation());
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public Length getLengthX() {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7812);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7813);return location.getLengthX();
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public Length getLengthY() {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7814);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7815);return location.getLengthY();
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}

    public Length getLengthZ() {try{__CLR4_5_25zm5zmlx1h8joj.R.inc(7816);
        __CLR4_5_25zm5zmlx1h8joj.R.inc(7817);return location.getLengthZ();
    }finally{__CLR4_5_25zm5zmlx1h8joj.R.flushNeeded();}}
}

