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

package org.openpnp.gui.support;

import java.awt.Component;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageBoxes {public static class __CLR4_5_25yn5ynlx1h0a1w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570286733L,8589935092L,7762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(MessageBoxes.class);

    public static void errorBox(Component parent, String title, Throwable cause) {try{__CLR4_5_25yn5ynlx1h0a1w.R.inc(7727);
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7728);String message = null;
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7729);if ((((cause != null)&&(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7730)!=0|true))||(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7731)==0&false))) {{
            __CLR4_5_25yn5ynlx1h0a1w.R.inc(7732);message = cause.getMessage();
            __CLR4_5_25yn5ynlx1h0a1w.R.inc(7733);if ((((message == null || message.trim().isEmpty())&&(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7734)!=0|true))||(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7735)==0&false))) {{
                __CLR4_5_25yn5ynlx1h0a1w.R.inc(7736);StringWriter stringWriter = new StringWriter();
                __CLR4_5_25yn5ynlx1h0a1w.R.inc(7737);PrintWriter writer = new PrintWriter(stringWriter);
                __CLR4_5_25yn5ynlx1h0a1w.R.inc(7738);cause.printStackTrace(writer);
                __CLR4_5_25yn5ynlx1h0a1w.R.inc(7739);writer.close();
                __CLR4_5_25yn5ynlx1h0a1w.R.inc(7740);message = stringWriter.toString();
            }
        }}
        }__CLR4_5_25yn5ynlx1h0a1w.R.inc(7741);if ((((message == null)&&(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7742)!=0|true))||(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7743)==0&false))) {{
            __CLR4_5_25yn5ynlx1h0a1w.R.inc(7744);message = "No message supplied.";
        }
        }__CLR4_5_25yn5ynlx1h0a1w.R.inc(7745);logger.debug("{}: {}", title, cause);
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7746);message = message.replaceAll("\n", "<br/>");
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7747);message = message.replaceAll("\r", "");
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7748);message = "<html><body width=\"400\">" + message + "</body></html>";
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7749);JOptionPane.showMessageDialog(parent, message, title, JOptionPane.ERROR_MESSAGE);
    }finally{__CLR4_5_25yn5ynlx1h0a1w.R.flushNeeded();}}

    public static void errorBox(Component parent, String title, String message) {try{__CLR4_5_25yn5ynlx1h0a1w.R.inc(7750);
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7751);if ((((message == null)&&(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7752)!=0|true))||(__CLR4_5_25yn5ynlx1h0a1w.R.iget(7753)==0&false))) {{
            __CLR4_5_25yn5ynlx1h0a1w.R.inc(7754);message = "";
        }
        }__CLR4_5_25yn5ynlx1h0a1w.R.inc(7755);logger.debug("{}: {}", title, message);
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7756);message = message.replaceAll("\n", "<br/>");
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7757);message = message.replaceAll("\r", "");
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7758);message = "<html><body width=\"400\">" + message + "</body></html>";
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7759);JOptionPane.showMessageDialog(parent, message, title, JOptionPane.ERROR_MESSAGE);
    }finally{__CLR4_5_25yn5ynlx1h0a1w.R.flushNeeded();}}

    public static void notYetImplemented(Component parent) {try{__CLR4_5_25yn5ynlx1h0a1w.R.inc(7760);
        __CLR4_5_25yn5ynlx1h0a1w.R.inc(7761);errorBox(parent, "Not Yet Implemented", "This function is not yet implemented.");
    }finally{__CLR4_5_25yn5ynlx1h0a1w.R.flushNeeded();}}
}
