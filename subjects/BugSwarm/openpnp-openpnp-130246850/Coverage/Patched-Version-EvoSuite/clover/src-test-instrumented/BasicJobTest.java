/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openpnp.JobProcessorDelegate;
import org.openpnp.JobProcessorListener;
import org.openpnp.machine.reference.ReferenceActuator;
import org.openpnp.machine.reference.ReferenceHeadMountable;
import org.openpnp.machine.reference.ReferenceMachine;
import org.openpnp.machine.reference.ReferenceNozzle;
import org.openpnp.machine.reference.driver.test.TestDriver;
import org.openpnp.machine.reference.driver.test.TestDriver.TestDriverDelegate;
import org.openpnp.model.Board;
import org.openpnp.model.Board.Side;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.LengthUnit;
import org.openpnp.model.Location;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.Head;
import org.openpnp.spi.HeadMountable;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.JobProcessor.JobError;
import org.openpnp.spi.JobProcessor.JobState;
import org.openpnp.spi.JobProcessor.PickRetryAction;
import org.openpnp.spi.Machine;
import org.openpnp.spi.Nozzle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.io.Files;

public class BasicJobTest {static class __CLR4_5_2gtfgtflx1h5tna{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570554387L,8589935092L,21953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(TestDriver.class);

    /**
     * Creates a basic job in memory and attempts to run it. The Driver is monitored to make sure it
     * performs a pre-defined set of expected moves. This test is intended to test the primary
     * motions and operation of the entire system, including feeding, picking, placing and basic job
     * processing.
     * 
     * TODO: Don't ignore additional movements after the expected movements complete. This should
     * cause the test to fail and it does not currently.
     * 
     * @throws Exception
     */
    @Test
    public void testSimpleJob() throws Exception {__CLR4_5_2gtfgtflx1h5tna.R.globalSliceStart(getClass().getName(),21795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bam7oggtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gtfgtflx1h5tna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gtfgtflx1h5tna.R.globalSliceEnd(getClass().getName(),"BasicJobTest.testSimpleJob",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),21795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bam7oggtf() throws Exception{try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21795);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21796);File workingDirectory = Files.createTempDir();
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21797);workingDirectory = new File(workingDirectory, ".openpnp");
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21798);System.out.println("Configuration directory: " + workingDirectory);

        // Copy the required configuration files over to the new configuration
        // directory.
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21799);FileUtils.copyURLToFile(ClassLoader.getSystemResource("config/BasicJobTest/machine.xml"),
                new File(workingDirectory, "machine.xml"));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21800);FileUtils.copyURLToFile(ClassLoader.getSystemResource("config/BasicJobTest/packages.xml"),
                new File(workingDirectory, "packages.xml"));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21801);FileUtils.copyURLToFile(ClassLoader.getSystemResource("config/BasicJobTest/parts.xml"),
                new File(workingDirectory, "parts.xml"));

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21802);Configuration.initialize(workingDirectory);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21803);Configuration.get().load();

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21804);Machine machine = Configuration.get().getMachine();
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21805);ReferenceMachine referenceMachine = (ReferenceMachine) machine;
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21806);TestDriver testDriver = (TestDriver) referenceMachine.getDriver();
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21807);BasicJobTestDriverDelegate delegate = new BasicJobTestDriverDelegate();
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21808);testDriver.setDelegate(delegate);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21809);TestCompleteNotifier notifier = new TestCompleteNotifier();

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21810);JobProcessor jobProcessor = machine.getJobProcessors().get(JobProcessor.Type.PickAndPlace);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21811);jobProcessor.addListener(new BasicJobTestProcessorListener(notifier));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21812);jobProcessor.setDelegate(new BasicJobTestJobProcessorDelegate());

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21813);Job job = createSimpleJob();

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21814);Head h1 = machine.getHead("H1");
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21815);Nozzle n1 = h1.getNozzle("N1");
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21816);Nozzle n2 = h1.getNozzle("N2");

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21817);delegate.expectMove("Move N1 to F1", n1, new Location(LengthUnit.Millimeters, -10, 0, 0, 0),
                1.0);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21818);delegate.expectPick(n1);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21819);delegate.expectMove("Move N2 to F1", n2, new Location(LengthUnit.Millimeters, -20, 0, 0, 0),
                1.0);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21820);delegate.expectPick(n2);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21821);delegate.expectMove("Move N1 to R1, Safe-Z", n1,
                new Location(LengthUnit.Millimeters, 0, 10, 0, 45), 1.0);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21822);delegate.expectMove("Move N1 to R1, Z", n1,
                new Location(LengthUnit.Millimeters, 0, 10, 0.825500, 45), 1.0);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21823);delegate.expectPlace(n1);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21824);delegate.expectMove("Move N1 to R1, Safe-Z", n1,
                new Location(LengthUnit.Millimeters, 0, 10, 0, 45), 1.0);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21825);delegate.expectMove("Move N2 to R2, Safe-Z", n2,
                new Location(LengthUnit.Millimeters, 00, 20, 0, 90), 1.0);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21826);delegate.expectMove("Move N2 to R2, Z", n2,
                new Location(LengthUnit.Millimeters, 00, 20, 0.825500, 90), 1.0);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21827);delegate.expectPlace(n2);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21828);delegate.expectMove("Move N2 to R2, Safe-Z", n2,
                new Location(LengthUnit.Millimeters, 00, 20, 0, 90), 1.0);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21829);jobProcessor.load(job);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21830);machine.setEnabled(true);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21831);synchronized (notifier) {
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21832);jobProcessor.start();
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21833);notifier.wait();
        }
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21834);if ((((notifier.failed)&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21835)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21836)==0&false))) {{
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21837);throw notifier.exception;
        }
    }}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

    private Job createSimpleJob() {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21838);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21839);Job job = new Job();

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21840);Board board = new Board();
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21841);board.setName("test");

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21842);board.addPlacement(createPlacement("R1", "R-0805-10K", 10, 10, 0, 45, Side.Top));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21843);board.addPlacement(createPlacement("R2", "R-0805-10K", 20, 20, 0, 90, Side.Top));

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21844);BoardLocation boardLocation = new BoardLocation(board);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21845);boardLocation.setLocation(new Location(LengthUnit.Millimeters, 0, 0, 0, 0));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21846);boardLocation.setSide(Side.Top);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21847);job.addBoardLocation(boardLocation);

        __CLR4_5_2gtfgtflx1h5tna.R.inc(21848);return job;
    }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

    public static Placement createPlacement(String id, String partId, double x, double y, double z,
            double rotation, Side side) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21849);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21850);Placement placement = new Placement(id);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21851);placement.setPart(Configuration.get().getPart(partId));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21852);placement.setLocation(new Location(LengthUnit.Millimeters, x, y, z, rotation));
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21853);placement.setSide(side);
        __CLR4_5_2gtfgtflx1h5tna.R.inc(21854);return placement;
    }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

    public static class BasicJobTestJobProcessorDelegate implements JobProcessorDelegate {
        @Override
        public PickRetryAction partPickFailed(BoardLocation board, Part part, Feeder feeder) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21855);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21856);return null;
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}
    }

    public static class BasicJobTestProcessorListener extends JobProcessorListener.Adapter {
        final private TestCompleteNotifier notifier;

        public BasicJobTestProcessorListener(TestCompleteNotifier notifier) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21857);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21858);this.notifier = notifier;
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void jobLoaded(Job job) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21859);}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void jobStateChanged(JobState state) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21860);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21861);if ((((state == JobState.Stopped)&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21862)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21863)==0&false))) {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21864);synchronized (notifier) {
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21865);notifier.notifyAll();
                }
            }
        }}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void jobEncounteredError(JobError error, String description) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21866);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21867);synchronized (notifier) {
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21868);notifier.failed = true;
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21869);notifier.exception = new Exception(error + " " + description);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21870);notifier.notifyAll();
            }
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void partProcessingStarted(BoardLocation board, Placement placement) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21871);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21872);logger.info("Start " + placement.getId());
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void partPicked(BoardLocation board, Placement placement) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21873);}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void partPlaced(BoardLocation board, Placement placement) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21874);}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void partProcessingCompleted(BoardLocation board, Placement placement) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21875);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21876);logger.info("Finish " + placement.getId());
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void detailedStatusUpdated(String status) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21877);}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}
    }

    /**
     * TODO: Allow passing of null for the expect methods to ignore a particular field.
     */
    public static class BasicJobTestDriverDelegate extends TestDriverDelegate {
        private Queue<ExpectedOp> expectedOps = new LinkedList<>();

        public void expectMove(String description, HeadMountable hm, Location location,
                double speed) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21878);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21879);ExpectedMove o = new ExpectedMove(description, hm, location, speed);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21880);expectedOps.add(o);
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        public void expectPick(Nozzle nozzle) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21881);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21882);expectedOps.add(new ExpectedPick(nozzle));
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        public void expectPlace(Nozzle nozzle) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21883);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21884);expectedOps.add(new ExpectedPlace(nozzle));
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        public void expectedActuate() {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21885);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21886);expectedOps.add(new ExpectedActuate());
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void moveTo(ReferenceHeadMountable hm, Location location, double speed)
                throws Exception {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21887);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21888);if ((((expectedOps.isEmpty())&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21889)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21890)==0&false))) {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21891);throw new Exception("Unexpected Move " + location + ".");
            }
            }else {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21892);ExpectedOp op = expectedOps.remove();

                __CLR4_5_2gtfgtflx1h5tna.R.inc(21893);if ((((!(op instanceof ExpectedMove))&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21894)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21895)==0&false))) {{
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21896);throw new Exception("Unexpected Move " + location + ". Expected " + op);
                }

                }__CLR4_5_2gtfgtflx1h5tna.R.inc(21897);ExpectedMove move = (ExpectedMove) op;

                __CLR4_5_2gtfgtflx1h5tna.R.inc(21898);if ((((!move.location.equals(location) || hm != move.headMountable)&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21899)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21900)==0&false))) {{
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21901);throw new Exception("Unexpected Move " + location + ". Expected " + op);
                }
            }}
        }}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void pick(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21902);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21903);if ((((expectedOps.isEmpty())&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21904)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21905)==0&false))) {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21906);throw new Exception("Unexpected Pick " + nozzle + ".");
            }
            }else {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21907);ExpectedOp op = expectedOps.remove();
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21908);if ((((!(op instanceof ExpectedPick))&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21909)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21910)==0&false))) {{
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21911);throw new Exception("Unexpected Pick " + nozzle + ". Expected " + op);
                }

                }__CLR4_5_2gtfgtflx1h5tna.R.inc(21912);ExpectedPick pick = (ExpectedPick) op;

                __CLR4_5_2gtfgtflx1h5tna.R.inc(21913);if ((((pick.nozzle != nozzle)&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21914)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21915)==0&false))) {{
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21916);throw new Exception("Unexpected Pick " + nozzle + ". Expected " + op);
                }
            }}
        }}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void place(ReferenceNozzle nozzle) throws Exception {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21917);
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21918);if ((((expectedOps.isEmpty())&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21919)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21920)==0&false))) {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21921);throw new Exception("Unexpected Place " + nozzle + ".");
            }
            }else {{
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21922);ExpectedOp op = expectedOps.remove();
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21923);if ((((!(op instanceof ExpectedPlace))&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21924)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21925)==0&false))) {{
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21926);throw new Exception("Unexpected Place " + nozzle + ". Expected " + op);
                }

                }__CLR4_5_2gtfgtflx1h5tna.R.inc(21927);ExpectedPlace place = (ExpectedPlace) op;

                __CLR4_5_2gtfgtflx1h5tna.R.inc(21928);if ((((place.nozzle != nozzle)&&(__CLR4_5_2gtfgtflx1h5tna.R.iget(21929)!=0|true))||(__CLR4_5_2gtfgtflx1h5tna.R.iget(21930)==0&false))) {{
                    __CLR4_5_2gtfgtflx1h5tna.R.inc(21931);throw new Exception("Unexpected Place " + nozzle + ". Expected " + op);
                }
            }}
        }}finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void actuate(ReferenceActuator actuator, boolean on) throws Exception {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21932);
            // TODO Auto-generated method stub
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21933);super.actuate(actuator, on);
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        @Override
        public void actuate(ReferenceActuator actuator, double value) throws Exception {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21934);
            // TODO Auto-generated method stub
            __CLR4_5_2gtfgtflx1h5tna.R.inc(21935);super.actuate(actuator, value);
        }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

        class ExpectedOp {
        }

        class ExpectedPick extends ExpectedOp {
            public Nozzle nozzle;

            public ExpectedPick(Nozzle nozzle) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21936);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21937);this.nozzle = nozzle;
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21938);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21939);return "Pick " + nozzle + " " + nozzle.getNozzleTip().getName();
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}
        }

        class ExpectedPlace extends ExpectedOp {
            public Nozzle nozzle;

            public ExpectedPlace(Nozzle nozzle) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21940);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21941);this.nozzle = nozzle;
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21942);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21943);return "Place " + nozzle + " " + nozzle.getNozzleTip().getName();
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}
        }

        class ExpectedActuate extends ExpectedOp {
            @Override
            public String toString() {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21944);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21945);return "Actuate";
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}
        }

        class ExpectedMove extends ExpectedOp {
            public HeadMountable headMountable;
            public Location location;
            public double speed;
            public String description;

            public ExpectedMove(String description, HeadMountable headMountable, Location location,
                    double speed) {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21946);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21947);this.headMountable = headMountable;
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21948);this.location = location;
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21949);this.speed = speed;
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21950);this.description = description;
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2gtfgtflx1h5tna.R.inc(21951);
                __CLR4_5_2gtfgtflx1h5tna.R.inc(21952);return "Move (" + description + ") " + headMountable + " " + location.toString();
            }finally{__CLR4_5_2gtfgtflx1h5tna.R.flushNeeded();}}
        }
    }

    public static class TestCompleteNotifier {
        public boolean failed;
        public Exception exception;
    }
}
