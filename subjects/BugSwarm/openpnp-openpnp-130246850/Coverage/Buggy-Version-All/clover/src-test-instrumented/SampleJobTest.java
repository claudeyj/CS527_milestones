/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import org.jcodec.api.awt.SequenceEncoder;
import org.junit.Test;
import org.openpnp.CameraListener;
import org.openpnp.JobProcessorDelegate;
import org.openpnp.JobProcessorListener;
import org.openpnp.machine.reference.ReferenceMachine;
import org.openpnp.machine.reference.driver.NullDriver;
import org.openpnp.machine.reference.driver.test.TestDriver;
import org.openpnp.model.BoardLocation;
import org.openpnp.model.Configuration;
import org.openpnp.model.Job;
import org.openpnp.model.Part;
import org.openpnp.model.Placement;
import org.openpnp.spi.Camera;
import org.openpnp.spi.Feeder;
import org.openpnp.spi.JobProcessor;
import org.openpnp.spi.JobProcessor.JobError;
import org.openpnp.spi.JobProcessor.JobState;
import org.openpnp.spi.JobProcessor.PickRetryAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.io.Files;

public class SampleJobTest {static class __CLR4_5_2if3if3lx1h3ear{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570440782L,8589935092L,23939,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static Logger logger = LoggerFactory.getLogger(TestDriver.class);

    /**
     * Loads the pnp-test job that is included in the samples and attempts to run it within a test
     * harness. The job is expected to complete successfully without throwing any exceptions.
     * 
     * This test is intended to exercise the basic job processing functions, image processing,
     * vision, feeder handling and fiducial handling. It's intended to act as a smoke test for large
     * changes.
     */
    @Test
    public void testSampleJob() throws Exception {__CLR4_5_2if3if3lx1h3ear.R.globalSliceStart(getClass().getName(),23871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mqwyooif3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2if3if3lx1h3ear.R.rethrow($CLV_t2$);}finally{__CLR4_5_2if3if3lx1h3ear.R.globalSliceEnd(getClass().getName(),"SampleJobTest.testSampleJob",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mqwyooif3() throws Exception{try{__CLR4_5_2if3if3lx1h3ear.R.inc(23871);
        __CLR4_5_2if3if3lx1h3ear.R.inc(23872);File workingDirectory = Files.createTempDir();
        __CLR4_5_2if3if3lx1h3ear.R.inc(23873);workingDirectory = new File(workingDirectory, ".openpnp");
        __CLR4_5_2if3if3lx1h3ear.R.inc(23874);System.out.println("Configuration directory: " + workingDirectory);

        __CLR4_5_2if3if3lx1h3ear.R.inc(23875);Configuration.initialize(workingDirectory);
        __CLR4_5_2if3if3lx1h3ear.R.inc(23876);Configuration.get().load();

        __CLR4_5_2if3if3lx1h3ear.R.inc(23877);ReferenceMachine machine = (ReferenceMachine) Configuration.get().getMachine();

        __CLR4_5_2if3if3lx1h3ear.R.inc(23878);NullDriver driver = (NullDriver) machine.getDriver();
        __CLR4_5_2if3if3lx1h3ear.R.inc(23879);driver.setFeedRateMmPerMinute(0);

        __CLR4_5_2if3if3lx1h3ear.R.inc(23880);Camera camera = machine.getDefaultHead().getDefaultCamera();
        // File videoFile = new File("target");
        // videoFile = new File(videoFile, "SampleJobTest.mp4");
        // MpegEncodingCameraListener encoder = new MpegEncodingCameraListener(videoFile);
        // camera.startContinuousCapture(encoder, 25);

        __CLR4_5_2if3if3lx1h3ear.R.inc(23881);TestCompleteNotifier notifier = new TestCompleteNotifier();

        __CLR4_5_2if3if3lx1h3ear.R.inc(23882);JobProcessor jobProcessor = machine.getJobProcessors().get(JobProcessor.Type.PickAndPlace);
        __CLR4_5_2if3if3lx1h3ear.R.inc(23883);jobProcessor.addListener(new SampleJobTestProcessorListener(notifier));
        __CLR4_5_2if3if3lx1h3ear.R.inc(23884);jobProcessor.setDelegate(new SampleJobTestJobProcessorDelegate());

        __CLR4_5_2if3if3lx1h3ear.R.inc(23885);File jobFile = new File("samples");
        __CLR4_5_2if3if3lx1h3ear.R.inc(23886);jobFile = new File(jobFile, "pnp-test");
        __CLR4_5_2if3if3lx1h3ear.R.inc(23887);jobFile = new File(jobFile, "pnp-test.job.xml");
        __CLR4_5_2if3if3lx1h3ear.R.inc(23888);Job job = Configuration.get().loadJob(jobFile);

        __CLR4_5_2if3if3lx1h3ear.R.inc(23889);jobProcessor.load(job);
        __CLR4_5_2if3if3lx1h3ear.R.inc(23890);machine.setEnabled(true);
        __CLR4_5_2if3if3lx1h3ear.R.inc(23891);synchronized (notifier) {
            __CLR4_5_2if3if3lx1h3ear.R.inc(23892);jobProcessor.start();
            __CLR4_5_2if3if3lx1h3ear.R.inc(23893);notifier.wait();
        }
        // camera.stopContinuousCapture(encoder);
        // encoder.finish();
        __CLR4_5_2if3if3lx1h3ear.R.inc(23894);if ((((notifier.failed)&&(__CLR4_5_2if3if3lx1h3ear.R.iget(23895)!=0|true))||(__CLR4_5_2if3if3lx1h3ear.R.iget(23896)==0&false))) {{
            __CLR4_5_2if3if3lx1h3ear.R.inc(23897);throw notifier.exception;
        }
    }}finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

    public static class SampleJobTestJobProcessorDelegate implements JobProcessorDelegate {
        @Override
        public PickRetryAction partPickFailed(BoardLocation board, Part part, Feeder feeder) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23898);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23899);return null;
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}
    }

    public static class SampleJobTestProcessorListener extends JobProcessorListener.Adapter {
        final private TestCompleteNotifier notifier;

        public SampleJobTestProcessorListener(TestCompleteNotifier notifier) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23900);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23901);this.notifier = notifier;
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void jobLoaded(Job job) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23902);}finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void jobStateChanged(JobState state) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23903);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23904);if ((((state == JobState.Stopped)&&(__CLR4_5_2if3if3lx1h3ear.R.iget(23905)!=0|true))||(__CLR4_5_2if3if3lx1h3ear.R.iget(23906)==0&false))) {{
                __CLR4_5_2if3if3lx1h3ear.R.inc(23907);synchronized (notifier) {
                    __CLR4_5_2if3if3lx1h3ear.R.inc(23908);notifier.notifyAll();
                }
            }
        }}finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void jobEncounteredError(JobError error, String description) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23909);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23910);synchronized (notifier) {
                __CLR4_5_2if3if3lx1h3ear.R.inc(23911);notifier.failed = true;
                __CLR4_5_2if3if3lx1h3ear.R.inc(23912);notifier.exception = new Exception(error + " " + description);
                __CLR4_5_2if3if3lx1h3ear.R.inc(23913);notifier.notifyAll();
            }
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void partProcessingStarted(BoardLocation board, Placement placement) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23914);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23915);logger.info("Start " + placement.getId());
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void partPicked(BoardLocation board, Placement placement) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23916);}finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void partPlaced(BoardLocation board, Placement placement) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23917);}finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void partProcessingCompleted(BoardLocation board, Placement placement) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23918);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23919);logger.info("Finish " + placement.getId());
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public void detailedStatusUpdated(String status) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23920);}finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}
    }

    public static class TestCompleteNotifier {
        public boolean failed;
        public Exception exception;
    }

    public static class MpegEncodingCameraListener implements CameraListener {
        private SequenceEncoder enc;
        private boolean finished = false;

        public MpegEncodingCameraListener(File file) throws Exception {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23921);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23922);enc = new SequenceEncoder(file);
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        @Override
        public synchronized void frameReceived(BufferedImage img) {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23923);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23924);if ((((finished)&&(__CLR4_5_2if3if3lx1h3ear.R.iget(23925)!=0|true))||(__CLR4_5_2if3if3lx1h3ear.R.iget(23926)==0&false))) {{
                __CLR4_5_2if3if3lx1h3ear.R.inc(23927);return;
            }
            }__CLR4_5_2if3if3lx1h3ear.R.inc(23928);try {
                __CLR4_5_2if3if3lx1h3ear.R.inc(23929);Graphics g = img.getGraphics();
                __CLR4_5_2if3if3lx1h3ear.R.inc(23930);g.setColor(Color.white);
                __CLR4_5_2if3if3lx1h3ear.R.inc(23931);g.drawLine(0, img.getHeight() / 2, img.getWidth(), img.getHeight() / 2);
                __CLR4_5_2if3if3lx1h3ear.R.inc(23932);g.drawLine(img.getWidth() / 2, 0, img.getWidth() / 2, img.getHeight());
                __CLR4_5_2if3if3lx1h3ear.R.inc(23933);g.dispose();
                __CLR4_5_2if3if3lx1h3ear.R.inc(23934);enc.encodeImage(img);
            }
            catch (Exception e) {
                __CLR4_5_2if3if3lx1h3ear.R.inc(23935);e.printStackTrace();
            }
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}

        public synchronized void finish() throws Exception {try{__CLR4_5_2if3if3lx1h3ear.R.inc(23936);
            __CLR4_5_2if3if3lx1h3ear.R.inc(23937);finished = true;
            __CLR4_5_2if3if3lx1h3ear.R.inc(23938);enc.finish();
        }finally{__CLR4_5_2if3if3lx1h3ear.R.flushNeeded();}}
    }
}
