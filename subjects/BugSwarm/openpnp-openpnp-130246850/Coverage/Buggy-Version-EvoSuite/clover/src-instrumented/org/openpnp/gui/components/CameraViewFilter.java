/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.gui.components;

import java.awt.image.BufferedImage;

import org.openpnp.spi.Camera;

public interface CameraViewFilter {
    public BufferedImage filterCameraImage(Camera camera, BufferedImage image);
}
