/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar;

import org.traccar.database.ActiveDevice;
import org.traccar.model.Command;

import java.util.Collection;
import java.util.List;

public interface Protocol {

    String getName();

    Collection<String> getSupportedCommands();

    void sendCommand(ActiveDevice activeDevice, Command command);

    void initTrackerServers(List<TrackerServer> serverList);

}
