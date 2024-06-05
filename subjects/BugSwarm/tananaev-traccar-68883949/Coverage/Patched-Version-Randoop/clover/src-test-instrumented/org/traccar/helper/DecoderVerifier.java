/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.helper;

import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class DecoderVerifier {public static class __CLR4_5_28me8melx1dp9ps{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564743050L,8589935092L,11209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static void verifyPosition(Position position) {try{__CLR4_5_28me8melx1dp9ps.R.inc(11174);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11175);assertNotNull(position.getDeviceId());
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11176);assertNotNull(position.getFixTime());
        __CLR4_5_28me8melx1dp9ps.R.inc(11177);assertTrue(position.getFixTime().after(new Date(946684800000L))); // 2000 year
        __CLR4_5_28me8melx1dp9ps.R.inc(11178);assertTrue(position.getFixTime().getTime() < new Date().getTime() + 3600000); // 1 hour from now

        __CLR4_5_28me8melx1dp9ps.R.inc(11179);assertNotNull(position.getValid());
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11180);assertNotNull(position.getLatitude());
        __CLR4_5_28me8melx1dp9ps.R.inc(11181);assertTrue(position.getLatitude() >= -90);
        __CLR4_5_28me8melx1dp9ps.R.inc(11182);assertTrue(position.getLatitude() <= 90);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11183);assertNotNull(position.getLongitude());
        __CLR4_5_28me8melx1dp9ps.R.inc(11184);assertTrue(position.getLongitude() >= -180);
        __CLR4_5_28me8melx1dp9ps.R.inc(11185);assertTrue(position.getLongitude() <= 180);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11186);assertNotNull(position.getAltitude());
        __CLR4_5_28me8melx1dp9ps.R.inc(11187);assertTrue(position.getAltitude() >= -12262);
        __CLR4_5_28me8melx1dp9ps.R.inc(11188);assertTrue(position.getAltitude() <= 18000);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11189);assertNotNull(position.getSpeed());
        __CLR4_5_28me8melx1dp9ps.R.inc(11190);assertTrue(position.getSpeed() >= 0);
        __CLR4_5_28me8melx1dp9ps.R.inc(11191);assertTrue(position.getSpeed() <= 869);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11192);assertNotNull(position.getCourse());
        __CLR4_5_28me8melx1dp9ps.R.inc(11193);assertTrue(position.getCourse() >= 0);
        __CLR4_5_28me8melx1dp9ps.R.inc(11194);assertTrue(position.getCourse() <= 360);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11195);assertNotNull(position.getOther());

    }finally{__CLR4_5_28me8melx1dp9ps.R.flushNeeded();}}

    public static void verify(Object object) {try{__CLR4_5_28me8melx1dp9ps.R.inc(11196);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11197);assertNotNull(object);
        
        __CLR4_5_28me8melx1dp9ps.R.inc(11198);if ((((object instanceof Position)&&(__CLR4_5_28me8melx1dp9ps.R.iget(11199)!=0|true))||(__CLR4_5_28me8melx1dp9ps.R.iget(11200)==0&false))) {{
            __CLR4_5_28me8melx1dp9ps.R.inc(11201);verifyPosition((Position) object);
        } }else {__CLR4_5_28me8melx1dp9ps.R.inc(11202);if ((((object instanceof List)&&(__CLR4_5_28me8melx1dp9ps.R.iget(11203)!=0|true))||(__CLR4_5_28me8melx1dp9ps.R.iget(11204)==0&false))) {{
            __CLR4_5_28me8melx1dp9ps.R.inc(11205);List<Position> positions = (List<Position>) object;
            
            __CLR4_5_28me8melx1dp9ps.R.inc(11206);assertFalse(positions.isEmpty());
            
            __CLR4_5_28me8melx1dp9ps.R.inc(11207);for (Position position : positions) {{
                __CLR4_5_28me8melx1dp9ps.R.inc(11208);verifyPosition(position);
            }
        }}
        
    }}}finally{__CLR4_5_28me8melx1dp9ps.R.flushNeeded();}}
    
}
