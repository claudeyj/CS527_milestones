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

import java.awt.Color;

import javax.swing.JComponent;

import org.jdesktop.beansbinding.AbstractBindingListener;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.Converter;
import org.openpnp.model.AbstractModelObject;

/**
 * Provides convenience bindings for JComponents that add value buffering and visual feedback on
 * conversion failure. Buffered values have a read-write binding with the JComponent and a read
 * binding with the source value. The returned WrappedBinding allows you to save the buffered value
 * to the source or to reset it from the source.
 * 
 * @author Jason von Nieda <jason@vonnieda.org>
 */
public class JBindings {public static class __CLR4_5_25vo5volx1h36bi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,7671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static <SS, SV, TS extends JComponent, TV> WrappedBinding<SS, SV, TS, TV> bind(SS source,
            String sourcePropertyName, TS component, String targetPropertyName) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7620);
        __CLR4_5_25vo5volx1h36bi.R.inc(7621);return new WrappedBinding<>(source, sourcePropertyName, component, targetPropertyName, null,
                (BindingListener[]) null);
    }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

    public static <SS, SV, TS extends JComponent, TV> WrappedBinding<SS, SV, TS, TV> bind(SS source,
            String sourcePropertyName, TS component, String targetPropertyName,
            Converter<SV, TV> converter) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7622);
        __CLR4_5_25vo5volx1h36bi.R.inc(7623);return new WrappedBinding<>(source, sourcePropertyName, component, targetPropertyName,
                converter, (BindingListener[]) null);
    }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

    public static <SS, SV, TS extends JComponent, TV> WrappedBinding<SS, SV, TS, TV> bind(SS source,
            String sourcePropertyName, TS component, String targetPropertyName,
            Converter<SV, TV> converter, BindingListener... listeners) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7624);
        __CLR4_5_25vo5volx1h36bi.R.inc(7625);return new WrappedBinding<>(source, sourcePropertyName, component, targetPropertyName,
                converter, listeners);
    }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

    public static <SS, SV, TS extends JComponent, TV> WrappedBinding<SS, SV, TS, TV> bind(SS source,
            String sourcePropertyName, TS component, String targetPropertyName,
            BindingListener... listeners) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7626);
        __CLR4_5_25vo5volx1h36bi.R.inc(7627);return new WrappedBinding<>(source, sourcePropertyName, component, targetPropertyName, null,
                listeners);
    }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

    public static class WrappedBinding<SS, SV, TS extends JComponent, TV> {
        private SS source;
        private BeanProperty<SS, SV> sourceProperty;
        private Wrapper<SV> wrapper;
        private AutoBinding wrappedBinding;

        public final void addBindingListener(BindingListener listener) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7628);
            __CLR4_5_25vo5volx1h36bi.R.inc(7629);wrappedBinding.addBindingListener(listener);
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        public WrappedBinding(SS source, String sourcePropertyName, TS component,
                String targetPropertyName, Converter<SV, TV> converter,
                BindingListener... listeners) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7630);
            __CLR4_5_25vo5volx1h36bi.R.inc(7631);this.source = source;
            __CLR4_5_25vo5volx1h36bi.R.inc(7632);this.sourceProperty = BeanProperty.create(sourcePropertyName);
            __CLR4_5_25vo5volx1h36bi.R.inc(7633);this.wrapper = new Wrapper<>(sourceProperty.getValue(source));
            __CLR4_5_25vo5volx1h36bi.R.inc(7634);BeanProperty<Wrapper<SV>, SV> wrapperProperty = BeanProperty.create("value");
            __CLR4_5_25vo5volx1h36bi.R.inc(7635);BeanProperty<TS, TV> targetProperty = BeanProperty.create(targetPropertyName);
            __CLR4_5_25vo5volx1h36bi.R.inc(7636);wrappedBinding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, wrapper,
                    wrapperProperty, component, targetProperty);
            __CLR4_5_25vo5volx1h36bi.R.inc(7637);if ((((converter != null)&&(__CLR4_5_25vo5volx1h36bi.R.iget(7638)!=0|true))||(__CLR4_5_25vo5volx1h36bi.R.iget(7639)==0&false))) {{
                __CLR4_5_25vo5volx1h36bi.R.inc(7640);wrappedBinding.setConverter(converter);
            }
            }__CLR4_5_25vo5volx1h36bi.R.inc(7641);wrappedBinding.addBindingListener(new JComponentBackgroundUpdater(component));
            __CLR4_5_25vo5volx1h36bi.R.inc(7642);if ((((listeners != null)&&(__CLR4_5_25vo5volx1h36bi.R.iget(7643)!=0|true))||(__CLR4_5_25vo5volx1h36bi.R.iget(7644)==0&false))) {{
                __CLR4_5_25vo5volx1h36bi.R.inc(7645);for (BindingListener listener : listeners) {{
                    __CLR4_5_25vo5volx1h36bi.R.inc(7646);wrappedBinding.addBindingListener(listener);
                }
            }}
            }__CLR4_5_25vo5volx1h36bi.R.inc(7647);wrappedBinding.bind();
            __CLR4_5_25vo5volx1h36bi.R.inc(7648);AutoBinding<SS, SV, Wrapper<SV>, SV> binding = Bindings.createAutoBinding(
                    UpdateStrategy.READ, source, sourceProperty, wrapper, wrapperProperty);
            __CLR4_5_25vo5volx1h36bi.R.inc(7649);binding.bind();
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        public void save() {try{__CLR4_5_25vo5volx1h36bi.R.inc(7650);
            __CLR4_5_25vo5volx1h36bi.R.inc(7651);sourceProperty.setValue(source, wrapper.getValue());
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        public void reset() {try{__CLR4_5_25vo5volx1h36bi.R.inc(7652);
            __CLR4_5_25vo5volx1h36bi.R.inc(7653);wrapper.setValue(sourceProperty.getValue(source));
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        public Wrapper<SV> getWrapper() {try{__CLR4_5_25vo5volx1h36bi.R.inc(7654);
            __CLR4_5_25vo5volx1h36bi.R.inc(7655);return wrapper;
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}
    }

    public static class Wrapper<T> extends AbstractModelObject {
        private T value;

        public Wrapper(T value) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7656);
            __CLR4_5_25vo5volx1h36bi.R.inc(7657);this.value = value;
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        public T getValue() {try{__CLR4_5_25vo5volx1h36bi.R.inc(7658);
            __CLR4_5_25vo5volx1h36bi.R.inc(7659);return value;
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        public void setValue(T value) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7660);
            __CLR4_5_25vo5volx1h36bi.R.inc(7661);T oldValue = this.value;
            __CLR4_5_25vo5volx1h36bi.R.inc(7662);this.value = value;
            __CLR4_5_25vo5volx1h36bi.R.inc(7663);firePropertyChange("value", oldValue, this.value);
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}
    }

    private static class JComponentBackgroundUpdater extends AbstractBindingListener {
        private static Color errorColor = new Color(0xff, 0xdd, 0xdd);
        private JComponent component;
        private Color oldBackground;

        public JComponentBackgroundUpdater(JComponent component) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7664);
            __CLR4_5_25vo5volx1h36bi.R.inc(7665);this.component = component;
            __CLR4_5_25vo5volx1h36bi.R.inc(7666);oldBackground = component.getBackground();
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        @Override
        public void syncFailed(Binding binding, SyncFailure failure) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7667);
            __CLR4_5_25vo5volx1h36bi.R.inc(7668);component.setBackground(errorColor);
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}

        @Override
        public void synced(Binding binding) {try{__CLR4_5_25vo5volx1h36bi.R.inc(7669);
            __CLR4_5_25vo5volx1h36bi.R.inc(7670);component.setBackground(oldBackground);
        }finally{__CLR4_5_25vo5volx1h36bi.R.flushNeeded();}}
    }
}
