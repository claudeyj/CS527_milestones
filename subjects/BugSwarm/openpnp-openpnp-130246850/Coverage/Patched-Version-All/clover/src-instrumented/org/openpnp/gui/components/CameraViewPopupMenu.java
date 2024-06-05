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

package org.openpnp.gui.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

import org.openpnp.gui.components.reticle.CrosshairReticle;
import org.openpnp.gui.components.reticle.FiducialReticle;
import org.openpnp.gui.components.reticle.Reticle;
import org.openpnp.gui.components.reticle.RulerReticle;
import org.openpnp.model.LengthUnit;

// TODO: For the time being, since setting a property on the reticle doesn't re-save it we are
// making a redundant call to setReticle on every property update. Fix that somehow.
@SuppressWarnings("serial")
public class CameraViewPopupMenu extends JPopupMenu {public static class __CLR4_5_235q35qlx1h8hl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570671240L,8589935092L,4584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private CameraView cameraView;
    private JMenu reticleMenu;
    private JMenu reticleOptionsMenu;

    public CameraViewPopupMenu(CameraView cameraView) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4094);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4095);this.cameraView = cameraView;

        __CLR4_5_235q35qlx1h8hl2.R.inc(4096);reticleMenu = createReticleMenu();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4097);JMenu maxFpsMenu = createMaxFpsMenu();

        __CLR4_5_235q35qlx1h8hl2.R.inc(4098);add(reticleMenu);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4099);add(maxFpsMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4100);JCheckBoxMenuItem chkShowImageInfo = new JCheckBoxMenuItem(showImageInfoAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4101);chkShowImageInfo.setSelected(cameraView.isShowImageInfo());
        __CLR4_5_235q35qlx1h8hl2.R.inc(4102);add(chkShowImageInfo);


        __CLR4_5_235q35qlx1h8hl2.R.inc(4103);if ((((cameraView.getDefaultReticle() != null)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4104)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4105)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4106);if ((((cameraView.getDefaultReticle() instanceof RulerReticle)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4107)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4108)==0&false))) {{
                __CLR4_5_235q35qlx1h8hl2.R.inc(4109);setReticleOptionsMenu(createRulerReticleOptionsMenu(
                        (RulerReticle) cameraView.getDefaultReticle()));
            }
            }else {__CLR4_5_235q35qlx1h8hl2.R.inc(4110);if ((((cameraView.getDefaultReticle() instanceof FiducialReticle)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4111)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4112)==0&false))) {{
                __CLR4_5_235q35qlx1h8hl2.R.inc(4113);setReticleOptionsMenu(createFiducialReticleOptionsMenu(
                        (FiducialReticle) cameraView.getDefaultReticle()));
            }
            }else {__CLR4_5_235q35qlx1h8hl2.R.inc(4114);if ((((cameraView.getDefaultReticle() instanceof CrosshairReticle)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4115)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4116)==0&false))) {{
                __CLR4_5_235q35qlx1h8hl2.R.inc(4117);setReticleOptionsMenu(createCrosshairReticleOptionsMenu(
                        (CrosshairReticle) cameraView.getDefaultReticle()));
            }
        }}}}
    }}finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private JMenu createMaxFpsMenu() {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4118);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4119);ButtonGroup buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4120);JMenu menu = new JMenu("Maximum FPS");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4121);JRadioButtonMenuItem menuItem;

        __CLR4_5_235q35qlx1h8hl2.R.inc(4122);menuItem = new JRadioButtonMenuItem("1");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4123);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4124);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4125);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4126);menuItem = new JRadioButtonMenuItem("5");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4127);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4128);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4129);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4130);menuItem = new JRadioButtonMenuItem("10");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4131);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4132);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4133);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4134);menuItem = new JRadioButtonMenuItem("15");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4135);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4136);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4137);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4138);menuItem = new JRadioButtonMenuItem("24");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4139);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4140);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4141);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4142);menuItem = new JRadioButtonMenuItem("30");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4143);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4144);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4145);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4146);menuItem = new JRadioButtonMenuItem("45");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4147);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4148);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4149);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4150);menuItem = new JRadioButtonMenuItem("60");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4151);menuItem.addActionListener(maxFpsAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4152);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4153);menu.add(menuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4154);return menu;
    }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private JMenu createReticleMenu() {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4155);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4156);JMenu menu = new JMenu("Reticle");

        __CLR4_5_235q35qlx1h8hl2.R.inc(4157);ButtonGroup buttonGroup = new ButtonGroup();

        __CLR4_5_235q35qlx1h8hl2.R.inc(4158);JRadioButtonMenuItem menuItem;

        __CLR4_5_235q35qlx1h8hl2.R.inc(4159);Reticle reticle = cameraView.getDefaultReticle();

        __CLR4_5_235q35qlx1h8hl2.R.inc(4160);menuItem = new JRadioButtonMenuItem(noReticleAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4161);if ((((reticle == null)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4162)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4163)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4164);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4165);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4166);menu.add(menuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4167);menuItem = new JRadioButtonMenuItem(crosshairReticleAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4168);if ((((reticle != null && reticle.getClass() == CrosshairReticle.class)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4169)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4170)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4171);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4172);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4173);menu.add(menuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4174);menuItem = new JRadioButtonMenuItem(rulerReticleAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4175);if ((((reticle != null && reticle.getClass() == RulerReticle.class)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4176)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4177)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4178);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4179);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4180);menu.add(menuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4181);menuItem = new JRadioButtonMenuItem(fiducialReticleAction);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4182);if ((((reticle != null && reticle.getClass() == FiducialReticle.class)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4183)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4184)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4185);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4186);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4187);menu.add(menuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4188);return menu;
    }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private JMenu createCrosshairReticleOptionsMenu(final CrosshairReticle reticle) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4189);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4190);JMenu menu = new JMenu("Options");

        __CLR4_5_235q35qlx1h8hl2.R.inc(4191);ButtonGroup buttonGroup = new ButtonGroup();

        __CLR4_5_235q35qlx1h8hl2.R.inc(4192);JRadioButtonMenuItem menuItem;

        __CLR4_5_235q35qlx1h8hl2.R.inc(4193);menuItem = new JRadioButtonMenuItem("Red");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4194);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4195);if ((((reticle.getColor() == Color.red)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4196)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4197)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4198);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4199);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4200);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4201);reticle.setColor(Color.red);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4202);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4203);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4204);menuItem = new JRadioButtonMenuItem("Green");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4205);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4206);if ((((reticle.getColor() == Color.green)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4207)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4208)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4209);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4210);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4211);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4212);reticle.setColor(Color.green);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4213);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4214);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4215);menuItem = new JRadioButtonMenuItem("Yellow");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4216);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4217);if ((((reticle.getColor() == Color.yellow)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4218)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4219)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4220);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4221);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4222);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4223);reticle.setColor(Color.yellow);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4224);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4225);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4226);menuItem = new JRadioButtonMenuItem("Blue");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4227);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4228);if ((((reticle.getColor() == Color.blue)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4229)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4230)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4231);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4232);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4233);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4234);reticle.setColor(Color.blue);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4235);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4236);menu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4237);menuItem = new JRadioButtonMenuItem("White");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4238);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4239);if ((((reticle.getColor() == Color.white)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4240)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4241)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4242);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4243);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4244);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4245);reticle.setColor(Color.white);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4246);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4247);menu.add(menuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4248);return menu;
    }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private JMenu createRulerReticleOptionsMenu(final RulerReticle reticle) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4249);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4250);JMenu menu = new JMenu("Options");

        __CLR4_5_235q35qlx1h8hl2.R.inc(4251);JMenu subMenu;
        __CLR4_5_235q35qlx1h8hl2.R.inc(4252);JRadioButtonMenuItem menuItem;
        __CLR4_5_235q35qlx1h8hl2.R.inc(4253);ButtonGroup buttonGroup;

        __CLR4_5_235q35qlx1h8hl2.R.inc(4254);subMenu = new JMenu("Color");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4255);buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4256);menuItem = new JRadioButtonMenuItem("Red");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4257);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4258);if ((((reticle.getColor() == Color.red)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4259)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4260)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4261);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4262);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4263);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4264);reticle.setColor(Color.red);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4265);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4266);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4267);menuItem = new JRadioButtonMenuItem("Green");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4268);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4269);if ((((reticle.getColor() == Color.green)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4270)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4271)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4272);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4273);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4274);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4275);reticle.setColor(Color.green);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4276);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4277);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4278);menuItem = new JRadioButtonMenuItem("Yellow");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4279);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4280);if ((((reticle.getColor() == Color.yellow)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4281)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4282)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4283);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4284);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4285);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4286);reticle.setColor(Color.yellow);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4287);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4288);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4289);menuItem = new JRadioButtonMenuItem("Blue");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4290);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4291);if ((((reticle.getColor() == Color.blue)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4292)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4293)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4294);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4295);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4296);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4297);reticle.setColor(Color.blue);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4298);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4299);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4300);menuItem = new JRadioButtonMenuItem("White");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4301);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4302);if ((((reticle.getColor() == Color.white)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4303)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4304)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4305);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4306);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4307);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4308);reticle.setColor(Color.white);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4309);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4310);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4311);menu.add(subMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4312);subMenu = new JMenu("Units");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4313);buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4314);menuItem = new JRadioButtonMenuItem("Millimeters");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4315);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4316);if ((((reticle.getUnits() == LengthUnit.Millimeters)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4317)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4318)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4319);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4320);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4321);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4322);reticle.setUnits(LengthUnit.Millimeters);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4323);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4324);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4325);menuItem = new JRadioButtonMenuItem("Inches");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4326);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4327);if ((((reticle.getUnits() == LengthUnit.Inches)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4328)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4329)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4330);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4331);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4332);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4333);reticle.setUnits(LengthUnit.Inches);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4334);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4335);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4336);menu.add(subMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4337);subMenu = new JMenu("Units Per Tick");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4338);buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4339);menuItem = new JRadioButtonMenuItem("0.1");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4340);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4341);if ((((reticle.getUnitsPerTick() == 0.1)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4342)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4343)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4344);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4345);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4346);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4347);reticle.setUnitsPerTick(0.1);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4348);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4349);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4350);menuItem = new JRadioButtonMenuItem("0.25");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4351);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4352);if ((((reticle.getUnitsPerTick() == 0.25)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4353)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4354)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4355);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4356);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4357);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4358);reticle.setUnitsPerTick(0.25);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4359);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4360);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4361);menuItem = new JRadioButtonMenuItem("0.50");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4362);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4363);if ((((reticle.getUnitsPerTick() == 0.50)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4364)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4365)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4366);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4367);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4368);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4369);reticle.setUnitsPerTick(0.50);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4370);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4371);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4372);menuItem = new JRadioButtonMenuItem("1");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4373);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4374);if ((((reticle.getUnitsPerTick() == 1)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4375)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4376)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4377);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4378);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4379);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4380);reticle.setUnitsPerTick(1);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4381);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4382);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4383);menuItem = new JRadioButtonMenuItem("2");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4384);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4385);if ((((reticle.getUnitsPerTick() == 2)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4386)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4387)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4388);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4389);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4390);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4391);reticle.setUnitsPerTick(2);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4392);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4393);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4394);menuItem = new JRadioButtonMenuItem("5");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4395);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4396);if ((((reticle.getUnitsPerTick() == 5)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4397)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4398)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4399);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4400);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4401);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4402);reticle.setUnitsPerTick(5);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4403);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4404);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4405);menuItem = new JRadioButtonMenuItem("10");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4406);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4407);if ((((reticle.getUnitsPerTick() == 10)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4408)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4409)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4410);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4411);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4412);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4413);reticle.setUnitsPerTick(10);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4414);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4415);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4416);menu.add(subMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4417);return menu;
    }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private JMenu createFiducialReticleOptionsMenu(final FiducialReticle reticle) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4418);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4419);JMenu menu = new JMenu("Options");

        __CLR4_5_235q35qlx1h8hl2.R.inc(4420);JMenu subMenu;
        __CLR4_5_235q35qlx1h8hl2.R.inc(4421);JRadioButtonMenuItem menuItem;
        __CLR4_5_235q35qlx1h8hl2.R.inc(4422);ButtonGroup buttonGroup;

        __CLR4_5_235q35qlx1h8hl2.R.inc(4423);subMenu = new JMenu("Color");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4424);buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4425);menuItem = new JRadioButtonMenuItem("Red");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4426);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4427);if ((((reticle.getColor() == Color.red)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4428)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4429)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4430);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4431);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4432);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4433);reticle.setColor(Color.red);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4434);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4435);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4436);menuItem = new JRadioButtonMenuItem("Green");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4437);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4438);if ((((reticle.getColor() == Color.green)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4439)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4440)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4441);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4442);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4443);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4444);reticle.setColor(Color.green);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4445);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4446);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4447);menuItem = new JRadioButtonMenuItem("Yellow");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4448);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4449);if ((((reticle.getColor() == Color.yellow)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4450)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4451)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4452);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4453);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4454);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4455);reticle.setColor(Color.yellow);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4456);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4457);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4458);menuItem = new JRadioButtonMenuItem("Blue");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4459);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4460);if ((((reticle.getColor() == Color.blue)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4461)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4462)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4463);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4464);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4465);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4466);reticle.setColor(Color.blue);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4467);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4468);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4469);menuItem = new JRadioButtonMenuItem("White");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4470);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4471);if ((((reticle.getColor() == Color.white)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4472)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4473)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4474);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4475);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4476);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4477);reticle.setColor(Color.white);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4478);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4479);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4480);menu.add(subMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4481);subMenu = new JMenu("Units");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4482);buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4483);menuItem = new JRadioButtonMenuItem("Millimeters");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4484);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4485);if ((((reticle.getUnits() == LengthUnit.Millimeters)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4486)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4487)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4488);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4489);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4490);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4491);reticle.setUnits(LengthUnit.Millimeters);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4492);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4493);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4494);menuItem = new JRadioButtonMenuItem("Inches");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4495);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4496);if ((((reticle.getUnits() == LengthUnit.Inches)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4497)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4498)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4499);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4500);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4501);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4502);reticle.setUnits(LengthUnit.Inches);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4503);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4504);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4505);menu.add(subMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4506);subMenu = new JMenu("Shape");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4507);buttonGroup = new ButtonGroup();
        __CLR4_5_235q35qlx1h8hl2.R.inc(4508);menuItem = new JRadioButtonMenuItem("Circle");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4509);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4510);if ((((reticle.getShape() == FiducialReticle.Shape.Circle)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4511)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4512)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4513);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4514);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4515);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4516);reticle.setShape(FiducialReticle.Shape.Circle);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4517);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4518);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4519);menuItem = new JRadioButtonMenuItem("Square");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4520);buttonGroup.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4521);if ((((reticle.getShape() == FiducialReticle.Shape.Square)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4522)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4523)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4524);menuItem.setSelected(true);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4525);menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4526);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4527);reticle.setShape(FiducialReticle.Shape.Square);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4528);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4529);subMenu.add(menuItem);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4530);menu.add(subMenu);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4531);JCheckBoxMenuItem chkMenuItem = new JCheckBoxMenuItem("Filled");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4532);chkMenuItem.setSelected(reticle.isFilled());
        __CLR4_5_235q35qlx1h8hl2.R.inc(4533);chkMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4534);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4535);reticle.setFilled(((JCheckBoxMenuItem) e.getSource()).isSelected());
                __CLR4_5_235q35qlx1h8hl2.R.inc(4536);cameraView.setDefaultReticle(reticle);
            }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4537);menu.add(chkMenuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4538);JMenuItem inputMenuItem = new JMenuItem("Size");
        __CLR4_5_235q35qlx1h8hl2.R.inc(4539);inputMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4540);
                __CLR4_5_235q35qlx1h8hl2.R.inc(4541);String result = JOptionPane.showInputDialog(cameraView,
                        String.format("Enter the size in %s",
                                reticle.getUnits().toString().toLowerCase()),
                        reticle.getSize() + "");
                __CLR4_5_235q35qlx1h8hl2.R.inc(4542);if ((((result != null)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4543)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4544)==0&false))) {{
                    __CLR4_5_235q35qlx1h8hl2.R.inc(4545);reticle.setSize(Double.valueOf(result));
                    __CLR4_5_235q35qlx1h8hl2.R.inc(4546);cameraView.setDefaultReticle(reticle);
                }
            }}finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
        });
        __CLR4_5_235q35qlx1h8hl2.R.inc(4547);menu.add(inputMenuItem);

        __CLR4_5_235q35qlx1h8hl2.R.inc(4548);return menu;
    }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private void setReticleOptionsMenu(JMenu menu) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4549);
        __CLR4_5_235q35qlx1h8hl2.R.inc(4550);if ((((reticleOptionsMenu != null)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4551)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4552)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4553);reticleMenu.remove(reticleMenu.getMenuComponentCount() - 1);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4554);reticleMenu.remove(reticleMenu.getMenuComponentCount() - 1);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4555);if ((((menu != null)&&(__CLR4_5_235q35qlx1h8hl2.R.iget(4556)!=0|true))||(__CLR4_5_235q35qlx1h8hl2.R.iget(4557)==0&false))) {{
            __CLR4_5_235q35qlx1h8hl2.R.inc(4558);reticleMenu.addSeparator();
            __CLR4_5_235q35qlx1h8hl2.R.inc(4559);reticleMenu.add(menu);
        }
        }__CLR4_5_235q35qlx1h8hl2.R.inc(4560);reticleOptionsMenu = menu;
    }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}

    private Action showImageInfoAction = new AbstractAction("Show Image Info?") {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4561);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4562);cameraView.setShowImageInfo(((JCheckBoxMenuItem) e.getSource()).isSelected());
        }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
    };

    private Action noReticleAction = new AbstractAction("None") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4563);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4564);setReticleOptionsMenu(null);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4565);cameraView.setDefaultReticle(null);
        }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
    };

    private Action crosshairReticleAction = new AbstractAction("Crosshair") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4566);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4567);CrosshairReticle reticle = new CrosshairReticle();
            __CLR4_5_235q35qlx1h8hl2.R.inc(4568);JMenu optionsMenu = createCrosshairReticleOptionsMenu(reticle);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4569);setReticleOptionsMenu(optionsMenu);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4570);cameraView.setDefaultReticle(reticle);
        }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
    };

    private Action rulerReticleAction = new AbstractAction("Ruler") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4571);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4572);RulerReticle reticle = new RulerReticle();
            __CLR4_5_235q35qlx1h8hl2.R.inc(4573);JMenu optionsMenu = createRulerReticleOptionsMenu(reticle);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4574);setReticleOptionsMenu(optionsMenu);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4575);cameraView.setDefaultReticle(reticle);
        }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
    };

    private Action fiducialReticleAction = new AbstractAction("Fiducial") {
        @Override
        public void actionPerformed(ActionEvent arg0) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4576);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4577);FiducialReticle reticle = new FiducialReticle();
            __CLR4_5_235q35qlx1h8hl2.R.inc(4578);JMenu optionsMenu = createFiducialReticleOptionsMenu(reticle);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4579);setReticleOptionsMenu(optionsMenu);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4580);cameraView.setDefaultReticle(reticle);
        }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
    };

    private Action maxFpsAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {try{__CLR4_5_235q35qlx1h8hl2.R.inc(4581);
            __CLR4_5_235q35qlx1h8hl2.R.inc(4582);int maximumFps = Integer.parseInt(e.getActionCommand());
            __CLR4_5_235q35qlx1h8hl2.R.inc(4583);cameraView.setMaximumFps(maximumFps);
        }finally{__CLR4_5_235q35qlx1h8hl2.R.flushNeeded();}}
    };
}
