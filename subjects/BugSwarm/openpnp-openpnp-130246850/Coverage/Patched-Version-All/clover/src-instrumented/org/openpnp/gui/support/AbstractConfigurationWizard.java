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

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.Converter;
import org.openpnp.gui.support.JBindings.WrappedBinding;
import org.openpnp.model.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractConfigurationWizard extends JPanel implements Wizard {public static class __CLR4_5_25p05p0lx1h8jgt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,7446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    protected WizardContainer wizardContainer;
    private JButton btnApply;
    private JButton btnReset;
    protected JPanel contentPanel;
    private JScrollPane scrollPane;

    private List<WrappedBinding> wrappedBindings = new ArrayList<>();
    private ApplyResetBindingListener listener;

    public AbstractConfigurationWizard() {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7380);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7381);setLayout(new BorderLayout());

        __CLR4_5_25p05p0lx1h8jgt.R.inc(7382);contentPanel = new JPanel();
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7383);contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        __CLR4_5_25p05p0lx1h8jgt.R.inc(7384);scrollPane = new JScrollPane(contentPanel);

        __CLR4_5_25p05p0lx1h8jgt.R.inc(7385);scrollPane.setBorder(null);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7386);add(scrollPane, BorderLayout.CENTER);

        __CLR4_5_25p05p0lx1h8jgt.R.inc(7387);JPanel panelActions = new JPanel();
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7388);panelActions.setLayout(new FlowLayout(FlowLayout.RIGHT));
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7389);add(panelActions, BorderLayout.SOUTH);

        __CLR4_5_25p05p0lx1h8jgt.R.inc(7390);btnReset = new JButton(resetAction);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7391);panelActions.add(btnReset);

        __CLR4_5_25p05p0lx1h8jgt.R.inc(7392);btnApply = new JButton(applyAction);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7393);panelActions.add(btnApply);
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    public abstract void createBindings();

    public void validateInput() throws Exception {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7394);

    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    /**
     * This method should be called when the caller wishes to notify the user that there has been a
     * change to the state of the wizard. This is done automatically for wrapped bindings but this
     * method is provided for operations that do not use wrapped bindings.
     */
    protected void notifyChange() {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7395);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7396);applyAction.setEnabled(true);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7397);resetAction.setEnabled(true);
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    /**
     * When overriding this method you should call super.loadFromModel() AFTER doing any work that
     * you need to do, not before.
     */
    protected void loadFromModel() {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7398);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7399);for (WrappedBinding wrappedBinding : wrappedBindings) {{
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7400);wrappedBinding.reset();
        }
        }__CLR4_5_25p05p0lx1h8jgt.R.inc(7401);applyAction.setEnabled(false);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7402);resetAction.setEnabled(false);
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    /**
     * When overriding this method you should call super.loadFromModel() AFTER doing any work that
     * you need to do, not before.
     */
    protected void saveToModel() {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7403);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7404);try {
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7405);validateInput();
        }
        catch (Exception e) {
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7406);MessageBoxes.errorBox(getTopLevelAncestor(), "Validation Error", e.getMessage());
        }
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7407);for (WrappedBinding wrappedBinding : wrappedBindings) {{
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7408);wrappedBinding.save();
        }
        }__CLR4_5_25p05p0lx1h8jgt.R.inc(7409);applyAction.setEnabled(false);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7410);resetAction.setEnabled(false);
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    public WrappedBinding addWrappedBinding(Object source, String sourceProperty,
            JComponent component, String componentProperty, Converter converter) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7411);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7412);return addWrappedBinding(
                JBindings.bind(source, sourceProperty, component, componentProperty, converter));
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    public WrappedBinding addWrappedBinding(Object source, String sourceProperty,
            JComponent component, String componentProperty) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7413);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7414);return addWrappedBinding(
                JBindings.bind(source, sourceProperty, component, componentProperty));
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    public AutoBinding bind(UpdateStrategy updateStrategy, Object source, String sourceProperty,
            Object target, String targetProperty) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7415);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7416);AutoBinding binding = Bindings.createAutoBinding(updateStrategy, source,
                BeanProperty.create(sourceProperty), target, BeanProperty.create(targetProperty));
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7417);binding.bind();
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7418);return binding;
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    public AutoBinding bind(UpdateStrategy updateStrategy, Object source, String sourceProperty,
            Object target, String targetProperty, Converter converter) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7419);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7420);AutoBinding binding = Bindings.createAutoBinding(updateStrategy, source,
                BeanProperty.create(sourceProperty), target, BeanProperty.create(targetProperty));
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7421);if ((((converter != null)&&(__CLR4_5_25p05p0lx1h8jgt.R.iget(7422)!=0|true))||(__CLR4_5_25p05p0lx1h8jgt.R.iget(7423)==0&false))) {{
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7424);binding.setConverter(converter);
        }
        }__CLR4_5_25p05p0lx1h8jgt.R.inc(7425);binding.bind();
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7426);return binding;
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    public WrappedBinding addWrappedBinding(WrappedBinding binding) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7427);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7428);binding.addBindingListener(listener);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7429);wrappedBindings.add(binding);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7430);return binding;
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    @Override
    public void setWizardContainer(WizardContainer wizardContainer) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7431);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7432);this.wizardContainer = wizardContainer;
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7433);scrollPane.getVerticalScrollBar()
                .setUnitIncrement(Configuration.get().getVerticalScrollUnitIncrement());
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7434);listener = new ApplyResetBindingListener(applyAction, resetAction);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7435);createBindings();
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7436);loadFromModel();
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    @Override
    public JPanel getWizardPanel() {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7437);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7438);return this;
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    @Override
    public String getWizardName() {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7439);
        __CLR4_5_25p05p0lx1h8jgt.R.inc(7440);return null;
    }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}

    protected Action applyAction = new AbstractAction("Apply") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7441);
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7442);saveToModel();
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7443);wizardContainer.wizardCompleted(AbstractConfigurationWizard.this);
        }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}
    };

    protected Action resetAction = new AbstractAction("Reset") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_25p05p0lx1h8jgt.R.inc(7444);
            __CLR4_5_25p05p0lx1h8jgt.R.inc(7445);loadFromModel();
        }finally{__CLR4_5_25p05p0lx1h8jgt.R.flushNeeded();}}
    };
}
