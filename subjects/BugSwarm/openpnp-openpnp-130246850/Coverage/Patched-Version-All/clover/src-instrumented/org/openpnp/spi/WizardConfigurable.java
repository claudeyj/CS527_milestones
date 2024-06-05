/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.spi;

import org.openpnp.gui.support.Wizard;

public interface WizardConfigurable {
    /**
     * Gets a Wizard that can be used to configure this object.
     * 
     * @return
     */
    Wizard getConfigurationWizard();
}
