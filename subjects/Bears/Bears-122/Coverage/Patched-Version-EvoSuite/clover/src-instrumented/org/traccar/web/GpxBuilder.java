/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.web;

import java.util.Collection;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

public class GpxBuilder {public static class __CLR4_5_2ja0ja0lwye428e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,24998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private StringBuilder builder = new StringBuilder();
    private static final String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>"
            + "<gpx xmlns=\"http://www.topografix.com/GPX/1/1\" creator=\"Traccar\" version=\"1.1\" "
            + "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
            + "xsi:schemaLocation=\"http://www.topografix.com/GPX/1/1 "
            + "http://www.topografix.com/GPX/1/1/gpx.xsd\"><trk>\n";
    private static final String NAME = "<name>%1$s</name><trkseg>%n";
    private static final String POINT = "<trkpt lat=\"%1$f\" lon=\"%2$f\">"
            + "<time>%3$s</time>"
            + "<geoidheight>%4$f</geoidheight>"
            + "<course>%5$f</course>"
            + "<speed>%6$f</speed>"
            + "</trkpt>%n";
    private static final String FOOTER = "</trkseg></trk></gpx>";

    private static final DateTimeFormatter DATE_FORMAT = ISODateTimeFormat.dateTime();

    public GpxBuilder() {try{__CLR4_5_2ja0ja0lwye428e.R.inc(24984);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24985);builder.append(HEADER);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24986);builder.append("<trkseg>\n");
    }finally{__CLR4_5_2ja0ja0lwye428e.R.flushNeeded();}}

    public GpxBuilder(String name) {try{__CLR4_5_2ja0ja0lwye428e.R.inc(24987);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24988);builder.append(HEADER);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24989);builder.append(String.format(NAME, name));
    }finally{__CLR4_5_2ja0ja0lwye428e.R.flushNeeded();}}

    public void addPosition(Position position) {try{__CLR4_5_2ja0ja0lwye428e.R.inc(24990);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24991);builder.append(String.format(POINT, position.getLatitude(), position.getLongitude(),
                DATE_FORMAT.print(new DateTime(position.getFixTime())), position.getAltitude(),
                position.getCourse(), UnitsConverter.mpsFromKnots(position.getSpeed())));
    }finally{__CLR4_5_2ja0ja0lwye428e.R.flushNeeded();}}

    public void addPositions(Collection<Position> positions) {try{__CLR4_5_2ja0ja0lwye428e.R.inc(24992);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24993);for (Position position : positions) {{
            __CLR4_5_2ja0ja0lwye428e.R.inc(24994);addPosition(position);
        }
    }}finally{__CLR4_5_2ja0ja0lwye428e.R.flushNeeded();}}

    public String build() {try{__CLR4_5_2ja0ja0lwye428e.R.inc(24995);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24996);builder.append(FOOTER);
        __CLR4_5_2ja0ja0lwye428e.R.inc(24997);return builder.toString();
    }finally{__CLR4_5_2ja0ja0lwye428e.R.flushNeeded();}}

}
