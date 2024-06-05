/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * 
 * File: OSXAdapter.java
 * 
 * Abstract: Hooks existing preferences/about/quit functionality from an existing Java app into
 * handlers for the Mac OS X application menu. Uses a Proxy object to dynamically implement the
 * com.apple.eawt.ApplicationListener interface and register it with the com.apple.eawt.Application
 * object. This allows the complete project to be both built and run on any platform without any
 * stubs or placeholders. Useful for developers looking to implement Mac OS X features while
 * supporting multiple platforms with minimal impact.
 * 
 * Version: 2.0
 * 
 * Disclaimer: IMPORTANT: This Apple software is supplied to you by Apple Inc. ("Apple") in
 * consideration of your agreement to the following terms, and your use, installation, modification
 * or redistribution of this Apple software constitutes acceptance of these terms. If you do not
 * agree with these terms, please do not use, install, modify or redistribute this Apple software.
 * 
 * In consideration of your agreement to abide by the following terms, and subject to these terms,
 * Apple grants you a personal, non-exclusive license, under Apple's copyrights in this original
 * Apple software (the "Apple Software"), to use, reproduce, modify and redistribute the Apple
 * Software, with or without modifications, in source and/or binary forms; provided that if you
 * redistribute the Apple Software in its entirety and without modifications, you must retain this
 * notice and the following text and disclaimers in all such redistributions of the Apple Software.
 * Neither the name, trademarks, service marks or logos of Apple Inc. may be used to endorse or
 * promote products derived from the Apple Software without specific prior written permission from
 * Apple. Except as expressly stated in this notice, no other rights or licenses, express or
 * implied, are granted by Apple herein, including but not limited to any patent rights that may be
 * infringed by your derivative works or by other works in which the Apple Software may be
 * incorporated.
 * 
 * The Apple Software is provided by Apple on an "AS IS" basis. APPLE MAKES NO WARRANTIES, EXPRESS
 * OR IMPLIED, INCLUDING WITHOUT LIMITATION THE IMPLIED WARRANTIES OF NON-INFRINGEMENT,
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, REGARDING THE APPLE SOFTWARE OR ITS USE AND
 * OPERATION ALONE OR IN COMBINATION WITH YOUR PRODUCTS.
 * 
 * IN NO EVENT SHALL APPLE BE LIABLE FOR ANY SPECIAL, INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) ARISING IN ANY WAY OUT OF THE USE, REPRODUCTION,
 * MODIFICATION AND/OR DISTRIBUTION OF THE APPLE SOFTWARE, HOWEVER CAUSED AND WHETHER UNDER THEORY
 * OF CONTRACT, TORT (INCLUDING NEGLIGENCE), STRICT LIABILITY OR OTHERWISE, EVEN IF APPLE HAS BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * Copyright \u00a9 2003-2007 Apple, Inc., All Rights Reserved
 * 
 */

package org.openpnp.gui.support;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OSXAdapter implements InvocationHandler {public static class __CLR4_5_261e61elx1h1txi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570358223L,8589935092L,7904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Object targetObject;
    protected Method targetMethod;
    protected String proxySignature;

    static Object macOSXApplication;

    // Pass this method an Object and Method equipped to perform application shutdown logic
    // The method passed should return a boolean stating whether or not the quit should occur
    public static void setQuitHandler(Object target, Method quitHandler) {try{__CLR4_5_261e61elx1h1txi.R.inc(7826);
        __CLR4_5_261e61elx1h1txi.R.inc(7827);setHandler(new OSXAdapter("handleQuit", target, quitHandler));
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // Pass this method an Object and Method equipped to display application info
    // They will be called when the About menu item is selected from the application menu
    public static void setAboutHandler(Object target, Method aboutHandler) {try{__CLR4_5_261e61elx1h1txi.R.inc(7828);
        __CLR4_5_261e61elx1h1txi.R.inc(7829);boolean enableAboutMenu = (target != null && aboutHandler != null);
        __CLR4_5_261e61elx1h1txi.R.inc(7830);if ((((enableAboutMenu)&&(__CLR4_5_261e61elx1h1txi.R.iget(7831)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7832)==0&false))) {{
            __CLR4_5_261e61elx1h1txi.R.inc(7833);setHandler(new OSXAdapter("handleAbout", target, aboutHandler));
        }
        // If we're setting a handler, enable the About menu item by calling
        // com.apple.eawt.Application reflectively
        }__CLR4_5_261e61elx1h1txi.R.inc(7834);try {
            __CLR4_5_261e61elx1h1txi.R.inc(7835);Method enableAboutMethod = macOSXApplication.getClass()
                    .getDeclaredMethod("setEnabledAboutMenu", new Class[] {boolean.class});
            __CLR4_5_261e61elx1h1txi.R.inc(7836);enableAboutMethod.invoke(macOSXApplication,
                    new Object[] {Boolean.valueOf(enableAboutMenu)});
        }
        catch (Exception ex) {
            __CLR4_5_261e61elx1h1txi.R.inc(7837);System.err.println("OSXAdapter could not access the About Menu");
            __CLR4_5_261e61elx1h1txi.R.inc(7838);ex.printStackTrace();
        }
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // Pass this method an Object and a Method equipped to display application options
    // They will be called when the Preferences menu item is selected from the application menu
    public static void setPreferencesHandler(Object target, Method prefsHandler) {try{__CLR4_5_261e61elx1h1txi.R.inc(7839);
        __CLR4_5_261e61elx1h1txi.R.inc(7840);boolean enablePrefsMenu = (target != null && prefsHandler != null);
        __CLR4_5_261e61elx1h1txi.R.inc(7841);if ((((enablePrefsMenu)&&(__CLR4_5_261e61elx1h1txi.R.iget(7842)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7843)==0&false))) {{
            __CLR4_5_261e61elx1h1txi.R.inc(7844);setHandler(new OSXAdapter("handlePreferences", target, prefsHandler));
        }
        // If we're setting a handler, enable the Preferences menu item by calling
        // com.apple.eawt.Application reflectively
        }__CLR4_5_261e61elx1h1txi.R.inc(7845);try {
            __CLR4_5_261e61elx1h1txi.R.inc(7846);Method enablePrefsMethod = macOSXApplication.getClass()
                    .getDeclaredMethod("setEnabledPreferencesMenu", new Class[] {boolean.class});
            __CLR4_5_261e61elx1h1txi.R.inc(7847);enablePrefsMethod.invoke(macOSXApplication,
                    new Object[] {Boolean.valueOf(enablePrefsMenu)});
        }
        catch (Exception ex) {
            __CLR4_5_261e61elx1h1txi.R.inc(7848);System.err.println("OSXAdapter could not access the About Menu");
            __CLR4_5_261e61elx1h1txi.R.inc(7849);ex.printStackTrace();
        }
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // Pass this method an Object and a Method equipped to handle document events from the Finder
    // Documents are registered with the Finder via the CFBundleDocumentTypes dictionary in the
    // application bundle's Info.plist
    public static void setFileHandler(Object target, Method fileHandler) {try{__CLR4_5_261e61elx1h1txi.R.inc(7850);
        __CLR4_5_261e61elx1h1txi.R.inc(7851);setHandler(new OSXAdapter("handleOpenFile", target, fileHandler) {
            // Override OSXAdapter.callTarget to send information on the
            // file to be opened
            public boolean callTarget(Object appleEvent) {try{__CLR4_5_261e61elx1h1txi.R.inc(7852);
                __CLR4_5_261e61elx1h1txi.R.inc(7853);if ((((appleEvent != null)&&(__CLR4_5_261e61elx1h1txi.R.iget(7854)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7855)==0&false))) {{
                    __CLR4_5_261e61elx1h1txi.R.inc(7856);try {
                        __CLR4_5_261e61elx1h1txi.R.inc(7857);Method getFilenameMethod = appleEvent.getClass()
                                .getDeclaredMethod("getFilename", (Class[]) null);
                        __CLR4_5_261e61elx1h1txi.R.inc(7858);String filename =
                                (String) getFilenameMethod.invoke(appleEvent, (Object[]) null);
                        __CLR4_5_261e61elx1h1txi.R.inc(7859);this.targetMethod.invoke(this.targetObject, new Object[] {filename});
                    }
                    catch (Exception ex) {

                    }
                }
                }__CLR4_5_261e61elx1h1txi.R.inc(7860);return true;
            }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}
        });
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // setHandler creates a Proxy object from the passed OSXAdapter and adds it as an
    // ApplicationListener
    public static void setHandler(OSXAdapter adapter) {try{__CLR4_5_261e61elx1h1txi.R.inc(7861);
        __CLR4_5_261e61elx1h1txi.R.inc(7862);try {
            __CLR4_5_261e61elx1h1txi.R.inc(7863);Class applicationClass = Class.forName("com.apple.eawt.Application");
            __CLR4_5_261e61elx1h1txi.R.inc(7864);if ((((macOSXApplication == null)&&(__CLR4_5_261e61elx1h1txi.R.iget(7865)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7866)==0&false))) {{
                __CLR4_5_261e61elx1h1txi.R.inc(7867);macOSXApplication = applicationClass.getConstructor((Class[]) null)
                        .newInstance((Object[]) null);
            }
            }__CLR4_5_261e61elx1h1txi.R.inc(7868);Class applicationListenerClass = Class.forName("com.apple.eawt.ApplicationListener");
            __CLR4_5_261e61elx1h1txi.R.inc(7869);Method addListenerMethod = applicationClass.getDeclaredMethod("addApplicationListener",
                    new Class[] {applicationListenerClass});
            // Create a proxy object around this handler that can be reflectively added as an Apple
            // ApplicationListener
            __CLR4_5_261e61elx1h1txi.R.inc(7870);Object osxAdapterProxy = Proxy.newProxyInstance(OSXAdapter.class.getClassLoader(),
                    new Class[] {applicationListenerClass}, adapter);
            __CLR4_5_261e61elx1h1txi.R.inc(7871);addListenerMethod.invoke(macOSXApplication, new Object[] {osxAdapterProxy});
        }
        catch (ClassNotFoundException cnfe) {
            __CLR4_5_261e61elx1h1txi.R.inc(7872);System.err.println(
                    "This version of Mac OS X does not support the Apple EAWT.  ApplicationEvent handling has been disabled ("
                            + cnfe + ")");
        }
        catch (Exception ex) { // Likely a NoSuchMethodException or an IllegalAccessException
                               // loading/invoking eawt.Application methods
            __CLR4_5_261e61elx1h1txi.R.inc(7873);System.err.println("Mac OS X Adapter could not talk to EAWT:");
            __CLR4_5_261e61elx1h1txi.R.inc(7874);ex.printStackTrace();
        }
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // Each OSXAdapter has the name of the EAWT method it intends to listen for (handleAbout, for
    // example),
    // the Object that will ultimately perform the task, and the Method to be called on that Object
    protected OSXAdapter(String proxySignature, Object target, Method handler) {try{__CLR4_5_261e61elx1h1txi.R.inc(7875);
        __CLR4_5_261e61elx1h1txi.R.inc(7876);this.proxySignature = proxySignature;
        __CLR4_5_261e61elx1h1txi.R.inc(7877);this.targetObject = target;
        __CLR4_5_261e61elx1h1txi.R.inc(7878);this.targetMethod = handler;
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // Override this method to perform any operations on the event
    // that comes with the various callbacks
    // See setFileHandler above for an example
    public boolean callTarget(Object appleEvent)
            throws InvocationTargetException, IllegalAccessException {try{__CLR4_5_261e61elx1h1txi.R.inc(7879);
        __CLR4_5_261e61elx1h1txi.R.inc(7880);Object result = targetMethod.invoke(targetObject, (Object[]) null);
        __CLR4_5_261e61elx1h1txi.R.inc(7881);if ((((result == null)&&(__CLR4_5_261e61elx1h1txi.R.iget(7882)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7883)==0&false))) {{
            __CLR4_5_261e61elx1h1txi.R.inc(7884);return true;
        }
        }__CLR4_5_261e61elx1h1txi.R.inc(7885);return Boolean.valueOf(result.toString()).booleanValue();
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // InvocationHandler implementation
    // This is the entry point for our proxy object; it is called every time an ApplicationListener
    // method is invoked
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {try{__CLR4_5_261e61elx1h1txi.R.inc(7886);
        __CLR4_5_261e61elx1h1txi.R.inc(7887);if ((((isCorrectMethod(method, args))&&(__CLR4_5_261e61elx1h1txi.R.iget(7888)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7889)==0&false))) {{
            __CLR4_5_261e61elx1h1txi.R.inc(7890);boolean handled = callTarget(args[0]);
            __CLR4_5_261e61elx1h1txi.R.inc(7891);setApplicationEventHandled(args[0], handled);
        }
        // All of the ApplicationListener methods are void; return null regardless of what happens
        }__CLR4_5_261e61elx1h1txi.R.inc(7892);return null;
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // Compare the method that was called to the intended method when the OSXAdapter instance was
    // created
    // (e.g. handleAbout, handleQuit, handleOpenFile, etc.)
    protected boolean isCorrectMethod(Method method, Object[] args) {try{__CLR4_5_261e61elx1h1txi.R.inc(7893);
        __CLR4_5_261e61elx1h1txi.R.inc(7894);return (targetMethod != null && proxySignature.equals(method.getName())
                && args.length == 1);
    }finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}

    // It is important to mark the ApplicationEvent as handled and cancel the default behavior
    // This method checks for a boolean result from the proxy method and sets the event accordingly
    protected void setApplicationEventHandled(Object event, boolean handled) {try{__CLR4_5_261e61elx1h1txi.R.inc(7895);
        __CLR4_5_261e61elx1h1txi.R.inc(7896);if ((((event != null)&&(__CLR4_5_261e61elx1h1txi.R.iget(7897)!=0|true))||(__CLR4_5_261e61elx1h1txi.R.iget(7898)==0&false))) {{
            __CLR4_5_261e61elx1h1txi.R.inc(7899);try {
                __CLR4_5_261e61elx1h1txi.R.inc(7900);Method setHandledMethod = event.getClass().getDeclaredMethod("setHandled",
                        new Class[] {boolean.class});
                // If the target method returns a boolean, use that as a hint
                __CLR4_5_261e61elx1h1txi.R.inc(7901);setHandledMethod.invoke(event, new Object[] {Boolean.valueOf(handled)});
            }
            catch (Exception ex) {
                __CLR4_5_261e61elx1h1txi.R.inc(7902);System.err.println("OSXAdapter was unable to handle an ApplicationEvent: " + event);
                __CLR4_5_261e61elx1h1txi.R.inc(7903);ex.printStackTrace();
            }
        }
    }}finally{__CLR4_5_261e61elx1h1txi.R.flushNeeded();}}
}
