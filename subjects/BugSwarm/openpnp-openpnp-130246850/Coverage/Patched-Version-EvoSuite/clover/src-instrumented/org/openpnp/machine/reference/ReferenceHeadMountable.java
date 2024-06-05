/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference;

import org.openpnp.model.Location;
import org.openpnp.spi.HeadMountable;

public interface ReferenceHeadMountable extends HeadMountable {
    public Location getHeadOffsets();

    public void setHeadOffsets(Location headOffsets);
}
