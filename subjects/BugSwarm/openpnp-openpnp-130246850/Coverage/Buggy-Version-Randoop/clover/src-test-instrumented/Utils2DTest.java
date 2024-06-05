/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.junit.Test;
import org.openpnp.model.Board.Side;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.util.Utils2D;

public class Utils2DTest {static class __CLR4_5_2igzigzlx1h20d2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570375972L,8589935092L,24077,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testCalculateAngleAndOffset() throws Exception {__CLR4_5_2igzigzlx1h20d2.R.globalSliceStart(getClass().getName(),23939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x5h7zmigz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2igzigzlx1h20d2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2igzigzlx1h20d2.R.globalSliceEnd(getClass().getName(),"Utils2DTest.testCalculateAngleAndOffset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x5h7zmigz() throws Exception{try{__CLR4_5_2igzigzlx1h20d2.R.inc(23939);
        // Create two placements to test with.
        __CLR4_5_2igzigzlx1h20d2.R.inc(23940);Location idealA, idealB, actualA, actualB, board, offset;

        __CLR4_5_2igzigzlx1h20d2.R.inc(23941);idealA = new Location(LengthUnit.Millimeters, 5, 35, 0, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23942);idealB = new Location(LengthUnit.Millimeters, 55, 5, 0, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23943);board = new Location(LengthUnit.Millimeters, 5, 4, 0, 10);

        // Rotate and translate the placements to simulate a board that has
        // been placed on the table
        __CLR4_5_2igzigzlx1h20d2.R.inc(23944);offset = new Location(idealA.getUnits(), 10, 10, 0, -3);

        // determinate ideal locations
        __CLR4_5_2igzigzlx1h20d2.R.inc(23945);idealA = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23946);idealB = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., idealB);

        // determinate actual locations
        __CLR4_5_2igzigzlx1h20d2.R.inc(23947);actualA = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23948);actualB = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., idealB);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23949);actualA = Utils2D.calculateBoardPlacementLocation(board.addWithRotation(offset), Side.Top,
                100., actualA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23950);actualB = Utils2D.calculateBoardPlacementLocation(board.addWithRotation(offset), Side.Top,
                100., actualB);

        __CLR4_5_2igzigzlx1h20d2.R.inc(23951);System.out.println("idealA " + idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23952);System.out.println("idealB " + idealB);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23953);System.out.println("offset " + offset);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23954);System.out.println("actualA " + actualA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23955);System.out.println("actualB " + actualB);

        __CLR4_5_2igzigzlx1h20d2.R.inc(23956);Location results = Utils2D.calculateAngleAndOffset(idealA, idealB, actualA, actualB);


        __CLR4_5_2igzigzlx1h20d2.R.inc(23957);System.out.println("results " + results);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23958);check(results, 9.797509, 10.267162, 0.000000, -3.000000);

        __CLR4_5_2igzigzlx1h20d2.R.inc(23959);board = new Location(LengthUnit.Millimeters, 5, 4, 0, -92);
        // determinate ideal locations
        __CLR4_5_2igzigzlx1h20d2.R.inc(23960);idealA = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23961);idealB = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., idealB);

        // determinate actual locations
        __CLR4_5_2igzigzlx1h20d2.R.inc(23962);actualA = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23963);actualB = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., idealB);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23964);actualA = Utils2D.calculateBoardPlacementLocation(board.addWithRotation(offset), Side.Top,
                100., actualA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23965);actualB = Utils2D.calculateBoardPlacementLocation(board.addWithRotation(offset), Side.Top,
                100., actualB);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23966);results = Utils2D.calculateAngleAndOffset(idealA, idealB, actualA, actualB);

        __CLR4_5_2igzigzlx1h20d2.R.inc(23967);System.out.println("results " + results);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23968);check(results, 9.797509, 10.267162, 0.000000, -3.000000);


        __CLR4_5_2igzigzlx1h20d2.R.inc(23969);board = new Location(LengthUnit.Millimeters, 5, 8, 0, 92);
        // determinate ideal locations
        __CLR4_5_2igzigzlx1h20d2.R.inc(23970);idealA = Utils2D.calculateBoardPlacementLocation(board, Side.Bottom, 100., idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23971);idealB = Utils2D.calculateBoardPlacementLocation(board, Side.Bottom, 100., idealB);

        // determinate actual locations
        __CLR4_5_2igzigzlx1h20d2.R.inc(23972);actualA = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Bottom, 100., idealA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23973);actualB = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Bottom, 100., idealB);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23974);actualA = Utils2D.calculateBoardPlacementLocation(board.addWithRotation(offset),
                Side.Bottom, 100., actualA);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23975);actualB = Utils2D.calculateBoardPlacementLocation(board.addWithRotation(offset),
                Side.Bottom, 100., actualB);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23976);results = Utils2D.calculateAngleAndOffset(idealA, idealB, actualA, actualB);

        __CLR4_5_2igzigzlx1h20d2.R.inc(23977);System.out.println("results " + results);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23978);check(results, 9.588165, 10.272644, 0.000000, -3.000000);

    }finally{__CLR4_5_2igzigzlx1h20d2.R.flushNeeded();}}

    private static void check(Location loc, Location tst) throws Exception {try{__CLR4_5_2igzigzlx1h20d2.R.inc(23979);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23980);check(loc, tst.getX(), tst.getY(), tst.getZ(), tst.getRotation());
    }finally{__CLR4_5_2igzigzlx1h20d2.R.flushNeeded();}}

    private static void check(Location results, double x, double y, double z, double c)
            throws Exception {try{__CLR4_5_2igzigzlx1h20d2.R.inc(23981);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23982);within("angle", results.getRotation(), c, 0.001);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23983);within("x", results.getX(), x, 0.01);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23984);within("y", results.getY(), y, 0.01);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23985);within("z", results.getZ(), z, 0.01);
    }finally{__CLR4_5_2igzigzlx1h20d2.R.flushNeeded();}}

    public static void within(String name, double value, double target, double plusMinus)
            throws Exception {try{__CLR4_5_2igzigzlx1h20d2.R.inc(23986);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23987);if ((((value > target + plusMinus)&&(__CLR4_5_2igzigzlx1h20d2.R.iget(23988)!=0|true))||(__CLR4_5_2igzigzlx1h20d2.R.iget(23989)==0&false))) {{
            __CLR4_5_2igzigzlx1h20d2.R.inc(23990);throw new Exception(name + " " + value + " is greater than " + (target + plusMinus));
        }
        }else {__CLR4_5_2igzigzlx1h20d2.R.inc(23991);if ((((value < target - plusMinus)&&(__CLR4_5_2igzigzlx1h20d2.R.iget(23992)!=0|true))||(__CLR4_5_2igzigzlx1h20d2.R.iget(23993)==0&false))) {{
            __CLR4_5_2igzigzlx1h20d2.R.inc(23994);throw new Exception(name + " " + value + " is less than " + (target - plusMinus));
        }
    }}}finally{__CLR4_5_2igzigzlx1h20d2.R.flushNeeded();}}


    @Test
    public void testCalculateBoardPlacementLocation() throws Exception {__CLR4_5_2igzigzlx1h20d2.R.globalSliceStart(getClass().getName(),23995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgdqghiij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2igzigzlx1h20d2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2igzigzlx1h20d2.R.globalSliceEnd(getClass().getName(),"Utils2DTest.testCalculateBoardPlacementLocation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgdqghiij() throws Exception{try{__CLR4_5_2igzigzlx1h20d2.R.inc(23995);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23996);Location board = new Location(LengthUnit.Millimeters, 5, 15, -8, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23997);Location place = new Location(LengthUnit.Millimeters, 55, 5, 0, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(23998);Location loc, loc1, loc2;
        __CLR4_5_2igzigzlx1h20d2.R.inc(23999);int i = 0;
        __CLR4_5_2igzigzlx1h20d2.R.inc(24000);loc2 = board;
        // simple verification:
        __CLR4_5_2igzigzlx1h20d2.R.inc(24001);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24002);System.out.println("board: " + board + " 100mm");
        __CLR4_5_2igzigzlx1h20d2.R.inc(24003);System.out.println("place: " + place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24004);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24005);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24006);check(loc, 60, 20, -8, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24007);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24008);check(loc1, place);
        // now test some rotation.
        __CLR4_5_2igzigzlx1h20d2.R.inc(24009);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24010);board = board.rotateXy(55);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24011);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24012);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24013);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24014);check(loc, board.addWithRotation(place));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24015);check(loc1, place);

        __CLR4_5_2igzigzlx1h20d2.R.inc(24016);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24017);board = board.rotateXy(222);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24018);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24019);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24020);check(loc, board.addWithRotation(place));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24021);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24022);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24023);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24024);check(loc1, place);

        __CLR4_5_2igzigzlx1h20d2.R.inc(24025);board = board.rotateXy(-322);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24026);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24027);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24028);check(loc, board.addWithRotation(place));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24029);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24030);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24031);check(loc1, place);

        __CLR4_5_2igzigzlx1h20d2.R.inc(24032);board = new Location(LengthUnit.Millimeters, 30.004, 31.386, -8, 74.646);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24033);loc1 = new Location(LengthUnit.Millimeters, 31, 6, 0, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24034);System.out.println("board: " + board + " 100mm");
        __CLR4_5_2igzigzlx1h20d2.R.inc(24035);System.out.println("place: " + loc1);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24036);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Top, 100., loc1);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24037);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24038);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Top, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24039);System.out.println("inverse: " + loc1);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24040);check(loc, 32.426392, 62.868249, -8, 74.646);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24041);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24042);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24043);check(loc1, 31, 6, 0, 0);

        // simple verification: BOT
        __CLR4_5_2igzigzlx1h20d2.R.inc(24044);board = loc2;
        __CLR4_5_2igzigzlx1h20d2.R.inc(24045);loc2 = place.multiply(-1., 1., 1., 1.)
                .add(new Location(LengthUnit.Millimeters, 100., 0., 0., 0.0));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24046);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24047);System.out.println("board: " + board + " Width=" + 100.);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24048);System.out.println("place: " + place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24049);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Bottom, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24050);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24051);check(loc, 5 + -55 + 100, 20, -8, 0);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24052);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Bottom, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24053);check(loc1, place);
        // now test some rotation.
        __CLR4_5_2igzigzlx1h20d2.R.inc(24054);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24055);board = board.rotateXy(55);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24056);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Bottom, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24057);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Bottom, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24058);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24059);check(loc, board.addWithRotation(loc2));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24060);check(loc1, place);

        __CLR4_5_2igzigzlx1h20d2.R.inc(24061);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24062);board = board.rotateXy(222);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24063);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Bottom, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24064);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Bottom, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24065);check(loc, board.addWithRotation(loc2));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24066);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24067);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24068);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24069);check(loc1, place);

        __CLR4_5_2igzigzlx1h20d2.R.inc(24070);board = board.rotateXy(-322);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24071);loc = Utils2D.calculateBoardPlacementLocation(board, Side.Bottom, 100., place);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24072);loc1 = Utils2D.calculateBoardPlacementLocationInverse(board, Side.Bottom, 100., loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24073);check(loc, board.addWithRotation(loc2));
        __CLR4_5_2igzigzlx1h20d2.R.inc(24074);System.out.println("results " + loc);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24075);System.out.println("test" + ++i);
        __CLR4_5_2igzigzlx1h20d2.R.inc(24076);check(loc1, place);
    }finally{__CLR4_5_2igzigzlx1h20d2.R.flushNeeded();}}
}


