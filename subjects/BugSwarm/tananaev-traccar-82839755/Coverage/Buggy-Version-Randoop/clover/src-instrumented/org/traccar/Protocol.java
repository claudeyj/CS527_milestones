/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import java.util.List;
import org.traccar.database.ActiveDevice;
import org.traccar.model.Command;

public interface Protocol {

    public String getName();

    void sendCommand(ActiveDevice activeDevice, Command command);

    void initTrackerServers(List<TrackerServer> serverList);

}
