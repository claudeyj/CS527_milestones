/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.model;

import org.openpnp.model.Board.Side;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class BoardPad extends AbstractModelObject {public static class __CLR4_5_2bwjbwjlx1h8mwc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,15461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public enum Type {
        Paste, Ignore
    }

    @Attribute(required = false)
    private Type type = Type.Paste;

    @Attribute
    protected Side side = Side.Top;

    @Element
    protected Location location = new Location(LengthUnit.Millimeters);

    @Attribute(required = false)
    protected String name;

    @Element
    protected Pad pad;

    public BoardPad() {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15427);

    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public BoardPad(Pad pad, Location location) {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15428);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15429);setPad(pad);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15430);setLocation(location);
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public Location getLocation() {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15431);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15432);return location;
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public void setLocation(Location location) {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15433);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15434);Location oldValue = this.location;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15435);this.location = location;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15436);firePropertyChange("location", oldValue, location);
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public Side getSide() {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15437);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15438);return side;
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public void setSide(Side side) {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15439);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15440);Object oldValue = this.side;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15441);this.side = side;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15442);firePropertyChange("side", oldValue, side);
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public Type getType() {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15443);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15444);return type;
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public void setType(Type type) {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15445);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15446);Object oldValue = this.type;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15447);this.type = type;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15448);firePropertyChange("type", oldValue, type);
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15449);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15450);return name;
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15451);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15452);Object oldValue = this.name;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15453);this.name = name;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15454);firePropertyChange("name", oldValue, name);
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public Pad getPad() {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15455);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15456);return pad;
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}

    public void setPad(Pad pad) {try{__CLR4_5_2bwjbwjlx1h8mwc.R.inc(15457);
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15458);Object oldValue = pad;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15459);this.pad = pad;
        __CLR4_5_2bwjbwjlx1h8mwc.R.inc(15460);firePropertyChange("pad", oldValue, pad);
    }finally{__CLR4_5_2bwjbwjlx1h8mwc.R.flushNeeded();}}
}
