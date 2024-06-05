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

package org.openpnp.gui.processes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.openpnp.gui.JobPanel;
import org.openpnp.gui.MainFrame;
import org.openpnp.gui.support.MessageBoxes;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Location;
import org.openpnp.model.Placement;
import org.openpnp.spi.Camera;
import org.openpnp.util.MovableUtils;
import org.openpnp.util.UiUtils;
import org.openpnp.util.Utils2D;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Guides the user through the two point board location operation using step by step instructions.
 * 
 * TODO: Disable the BoardLocation table while active.
 */
public class TwoPlacementBoardLocationProcess {public static class __CLR4_5_25mc5mclx1h73nj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570604297L,8589935092L,7380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger =
            LoggerFactory.getLogger(TwoPlacementBoardLocationProcess.class);

    private final MainFrame mainFrame;
    private final JobPanel jobPanel;
    private final Camera camera;

    private int step = -1;
    private String[] instructions = new String[] {
            "<html><body>Select an easily identifiable placement from the table below. It should be near the left edge of the board. Click Next to continue.</body></html>",
            "<html><body>Now, line up the camera's crosshairs with the center of the selected placement. Click Next to continue.</body></html>",
            "<html><body>Next, select a second placement from the table below. It should be near the right edge of the board. Click Next to continue.</body></html>",
            "<html><body>Finally, line up the camera's crosshairs with the center of the selected placement. Click Next to continue.</body></html>",
            "<html><body>The board's location and rotation has been set. Click Finish to position the camera at the board's origin, or Cancel to quit.</body></html>",};

    private Placement placementA, placementB;
    private Location actualLocationA, actualLocationB;

    public TwoPlacementBoardLocationProcess(MainFrame mainFrame, JobPanel jobPanel)
            throws Exception {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7284);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7285);this.mainFrame = mainFrame;
        __CLR4_5_25mc5mclx1h73nj.R.inc(7286);this.jobPanel = jobPanel;
        __CLR4_5_25mc5mclx1h73nj.R.inc(7287);this.camera = MainFrame.machineControlsPanel.getSelectedTool().getHead().getDefaultCamera();
        __CLR4_5_25mc5mclx1h73nj.R.inc(7288);advance();
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private void advance() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7289);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7290);boolean stepResult = true;
        __CLR4_5_25mc5mclx1h73nj.R.inc(7291);if ((((step == 0)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7292)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7293)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7294);stepResult = step1();
        }
        }else {__CLR4_5_25mc5mclx1h73nj.R.inc(7295);if ((((step == 1)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7296)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7297)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7298);stepResult = step2();
        }
        }else {__CLR4_5_25mc5mclx1h73nj.R.inc(7299);if ((((step == 2)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7300)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7301)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7302);stepResult = step3();
        }
        }else {__CLR4_5_25mc5mclx1h73nj.R.inc(7303);if ((((step == 3)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7304)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7305)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7306);stepResult = step4();
        }
        }else {__CLR4_5_25mc5mclx1h73nj.R.inc(7307);if ((((step == 4)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7308)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7309)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7310);stepResult = step5();
        }
        }}}}}__CLR4_5_25mc5mclx1h73nj.R.inc(7311);if ((((!stepResult)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7312)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7313)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7314);return;
        }
        }__CLR4_5_25mc5mclx1h73nj.R.inc(7315);step++;
        __CLR4_5_25mc5mclx1h73nj.R.inc(7316);if ((((step == 5)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7317)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7318)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7319);mainFrame.hideInstructions();
        }
        }else {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7320);String title = String.format("Set Board Location (%d / 5)", step + 1);
            __CLR4_5_25mc5mclx1h73nj.R.inc(7321);mainFrame.showInstructions(title, instructions[step], true, true,
                    (((step == 4 )&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7322)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7323)==0&false))? "Finish" : "Next", cancelActionListener, proceedActionListener);
        }
    }}finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private boolean step1() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7324);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7325);placementA = jobPanel.getJobPlacementsPanel().getSelection();
        __CLR4_5_25mc5mclx1h73nj.R.inc(7326);if ((((placementA == null)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7327)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7328)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7329);MessageBoxes.errorBox(mainFrame, "Error", "Please select a placement.");
            __CLR4_5_25mc5mclx1h73nj.R.inc(7330);return false;
        }
        }__CLR4_5_25mc5mclx1h73nj.R.inc(7331);return true;
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private boolean step2() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7332);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7333);actualLocationA = camera.getLocation();
        __CLR4_5_25mc5mclx1h73nj.R.inc(7334);if ((((actualLocationA == null)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7335)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7336)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7337);MessageBoxes.errorBox(mainFrame, "Error", "Please position the camera.");
            __CLR4_5_25mc5mclx1h73nj.R.inc(7338);return false;
        }
        }__CLR4_5_25mc5mclx1h73nj.R.inc(7339);return true;
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private boolean step3() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7340);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7341);placementB = jobPanel.getJobPlacementsPanel().getSelection();
        __CLR4_5_25mc5mclx1h73nj.R.inc(7342);if ((((placementB == null || placementB == placementA)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7343)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7344)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7345);MessageBoxes.errorBox(mainFrame, "Error", "Please select a second placement.");
            __CLR4_5_25mc5mclx1h73nj.R.inc(7346);return false;
        }

        }__CLR4_5_25mc5mclx1h73nj.R.inc(7347);if ((((placementA.getSide() != placementB.getSide())&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7348)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7349)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7350);MessageBoxes.errorBox(mainFrame, "Error",
                    "Both placements must be on the same side of the board.");
            __CLR4_5_25mc5mclx1h73nj.R.inc(7351);return false;
        }
        }__CLR4_5_25mc5mclx1h73nj.R.inc(7352);return true;
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private boolean step4() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7353);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7354);actualLocationB = camera.getLocation();
        __CLR4_5_25mc5mclx1h73nj.R.inc(7355);if ((((actualLocationB == null)&&(__CLR4_5_25mc5mclx1h73nj.R.iget(7356)!=0|true))||(__CLR4_5_25mc5mclx1h73nj.R.iget(7357)==0&false))) {{
            __CLR4_5_25mc5mclx1h73nj.R.inc(7358);MessageBoxes.errorBox(mainFrame, "Error", "Please position the camera.");
            __CLR4_5_25mc5mclx1h73nj.R.inc(7359);return false;
        }

        // Calculate the angle and offset from the results
        }__CLR4_5_25mc5mclx1h73nj.R.inc(7360);BoardLocation boardLocation = jobPanel.getSelectedBoardLocation();
        __CLR4_5_25mc5mclx1h73nj.R.inc(7361);Location idealLocationA =
                Utils2D.calculateBoardPlacementLocation(boardLocation, placementA.getLocation());
        __CLR4_5_25mc5mclx1h73nj.R.inc(7362);Location idealLocationB =
                Utils2D.calculateBoardPlacementLocation(boardLocation, placementB.getLocation());
        __CLR4_5_25mc5mclx1h73nj.R.inc(7363);Location location = Utils2D.calculateAngleAndOffset2(idealLocationA, idealLocationB,
                actualLocationA, actualLocationB);

        __CLR4_5_25mc5mclx1h73nj.R.inc(7364);location = boardLocation.getLocation().addWithRotation(location);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7365);location = location.derive(null, null,
                boardLocation.getLocation().convertToUnits(location.getUnits()).getZ(), null);

        __CLR4_5_25mc5mclx1h73nj.R.inc(7366);jobPanel.getSelectedBoardLocation().setLocation(location);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7367);jobPanel.refreshSelectedBoardRow();

        __CLR4_5_25mc5mclx1h73nj.R.inc(7368);return true;
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private boolean step5() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7369);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7370);UiUtils.submitUiMachineTask(() -> {
            __CLR4_5_25mc5mclx1h73nj.R.inc(7371);Location location = jobPanel.getSelectedBoardLocation().getLocation();
            __CLR4_5_25mc5mclx1h73nj.R.inc(7372);MovableUtils.moveToLocationAtSafeZ(camera, location);
        });

        __CLR4_5_25mc5mclx1h73nj.R.inc(7373);return true;
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private void cancel() {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7374);
        __CLR4_5_25mc5mclx1h73nj.R.inc(7375);mainFrame.hideInstructions();
    }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}

    private final ActionListener proceedActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7376);
            __CLR4_5_25mc5mclx1h73nj.R.inc(7377);advance();
        }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}
    };

    private final ActionListener cancelActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_25mc5mclx1h73nj.R.inc(7378);
            __CLR4_5_25mc5mclx1h73nj.R.inc(7379);cancel();
        }finally{__CLR4_5_25mc5mclx1h73nj.R.flushNeeded();}}
    };
}
