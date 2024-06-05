/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is part of OpenPnP.
 * 
 * OpenPnP is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenPnP is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with OpenPnP. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.model;

import org.openpnp.ConfigurationListener;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.core.Persist;

/**
 * A Part is a single part that can be picked and placed. It has a graphical outline, is retrieved
 * from one or more Feeders and is placed at a Placement as part of a Job. Parts can be used across
 * many boards and should generally represent a single part in the real world.
 */
public class Part extends AbstractModelObject implements Identifiable {public static class __CLR4_5_2ckackalx1h5qio{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570536038L,8589935092L,16330,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Attribute
    private String id;
    @Attribute(required = false)
    private String name;

    @Attribute
    private LengthUnit heightUnits = LengthUnit.Millimeters;
    @Attribute
    private double height;

    private Package packag;

    @Attribute
    private String packageId;

    @Attribute(required = false)
    private double speed = 1.0;


    @SuppressWarnings("unused")
    private Part() {
        this(null);__CLR4_5_2ckackalx1h5qio.R.inc(16283);try{__CLR4_5_2ckackalx1h5qio.R.inc(16282);
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public Part(String id) {try{__CLR4_5_2ckackalx1h5qio.R.inc(16284);
        __CLR4_5_2ckackalx1h5qio.R.inc(16285);this.id = id;
        __CLR4_5_2ckackalx1h5qio.R.inc(16286);Configuration.get().addListener(new ConfigurationListener.Adapter() {
            @Override
            public void configurationLoaded(Configuration configuration) throws Exception {try{__CLR4_5_2ckackalx1h5qio.R.inc(16287);
                __CLR4_5_2ckackalx1h5qio.R.inc(16288);if ((((getPackage() == null)&&(__CLR4_5_2ckackalx1h5qio.R.iget(16289)!=0|true))||(__CLR4_5_2ckackalx1h5qio.R.iget(16290)==0&false))) {{
                    __CLR4_5_2ckackalx1h5qio.R.inc(16291);setPackage(configuration.getPackage(packageId));
                }
            }}finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    @Persist
    private void persist() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16292);
        __CLR4_5_2ckackalx1h5qio.R.inc(16293);packageId = ((((packag == null )&&(__CLR4_5_2ckackalx1h5qio.R.iget(16294)!=0|true))||(__CLR4_5_2ckackalx1h5qio.R.iget(16295)==0&false))? null : packag.getId());
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    @Override
    public String getId() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16296);
        __CLR4_5_2ckackalx1h5qio.R.inc(16297);return id;
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16298);
        __CLR4_5_2ckackalx1h5qio.R.inc(16299);return name;
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_2ckackalx1h5qio.R.inc(16300);
        __CLR4_5_2ckackalx1h5qio.R.inc(16301);Object oldValue = this.name;
        __CLR4_5_2ckackalx1h5qio.R.inc(16302);this.name = name;
        __CLR4_5_2ckackalx1h5qio.R.inc(16303);firePropertyChange("name", oldValue, name);
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public double getSpeed() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16304);
        __CLR4_5_2ckackalx1h5qio.R.inc(16305);return speed;
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public void setSpeed(double speed) {try{__CLR4_5_2ckackalx1h5qio.R.inc(16306);
        __CLR4_5_2ckackalx1h5qio.R.inc(16307);Object oldValue = this.speed;
        __CLR4_5_2ckackalx1h5qio.R.inc(16308);this.speed = speed;
        __CLR4_5_2ckackalx1h5qio.R.inc(16309);firePropertyChange("speed", oldValue, speed);
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public Length getHeight() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16310);
        __CLR4_5_2ckackalx1h5qio.R.inc(16311);return new Length(height, heightUnits);
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public void setHeight(Length height) {try{__CLR4_5_2ckackalx1h5qio.R.inc(16312);
        __CLR4_5_2ckackalx1h5qio.R.inc(16313);Object oldValue = getHeight();
        __CLR4_5_2ckackalx1h5qio.R.inc(16314);if ((((height == null)&&(__CLR4_5_2ckackalx1h5qio.R.iget(16315)!=0|true))||(__CLR4_5_2ckackalx1h5qio.R.iget(16316)==0&false))) {{
            __CLR4_5_2ckackalx1h5qio.R.inc(16317);this.height = 0;
            __CLR4_5_2ckackalx1h5qio.R.inc(16318);this.heightUnits = null;
        }
        }else {{
            __CLR4_5_2ckackalx1h5qio.R.inc(16319);this.height = height.getValue();
            __CLR4_5_2ckackalx1h5qio.R.inc(16320);this.heightUnits = height.getUnits();
        }
        }__CLR4_5_2ckackalx1h5qio.R.inc(16321);firePropertyChange("height", oldValue, getHeight());
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public Package getPackage() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16322);
        __CLR4_5_2ckackalx1h5qio.R.inc(16323);return packag;
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    public void setPackage(Package packag) {try{__CLR4_5_2ckackalx1h5qio.R.inc(16324);
        __CLR4_5_2ckackalx1h5qio.R.inc(16325);Object oldValue = this.packag;
        __CLR4_5_2ckackalx1h5qio.R.inc(16326);this.packag = packag;
        __CLR4_5_2ckackalx1h5qio.R.inc(16327);firePropertyChange("package", oldValue, packag);
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ckackalx1h5qio.R.inc(16328);
        __CLR4_5_2ckackalx1h5qio.R.inc(16329);return String.format("id %s, name %s, heightUnits %s, height %f, packageId (%s)", id, name,
                heightUnits, height, packageId);
    }finally{__CLR4_5_2ckackalx1h5qio.R.flushNeeded();}}
}
