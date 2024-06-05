/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.openpnp.machine.reference.driver;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeoutException;

import javax.swing.Action;
import javax.swing.Icon;

import org.openpnp.gui.support.PropertySheetWizardAdapter;
import org.openpnp.gui.support.Wizard;
import org.openpnp.machine.reference.ReferenceDriver;
import org.openpnp.machine.reference.ReferencePasteDispenser;
import org.openpnp.machine.reference.driver.wizards.AbstractSerialPortDriverConfigurationWizard;
import org.openpnp.model.Location;
import org.openpnp.spi.PropertySheetHolder;
import org.openpnp.spi.PropertySheetHolder.PropertySheet;
import org.simpleframework.xml.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;
import jssc.SerialPortTimeoutException;

/**
 * A base class for basic SerialPort based Drivers. Includes functions for connecting,
 * disconnecting, reading and sending lines.
 */
public abstract class AbstractSerialPortDriver implements ReferenceDriver, Closeable {public static class __CLR4_5_28fn8fnlx1h37es{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u006f\u0070\u0065\u006e\u0070\u006e\u0070\u002d\u0031\u0033\u0030\u0032\u0034\u0036\u0038\u0035\u0030\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717570421651L,8589935092L,11073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger logger = LoggerFactory.getLogger(AbstractSerialPortDriver.class);

    @Attribute(required = false)
    protected String portName;
    @Attribute(required = false)
    protected int baud = 115200;

    protected SerialPort serialPort;
    protected SerialInputStream input;
    protected OutputStream output;

    protected synchronized void connect() throws Exception {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10931);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10932);disconnect();
        __CLR4_5_28fn8fnlx1h37es.R.inc(10933);serialPort = new SerialPort(portName);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10934);serialPort.openPort();
        __CLR4_5_28fn8fnlx1h37es.R.inc(10935);serialPort.setParams(baud, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE, false, false);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10936);input = new SerialInputStream(serialPort);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10937);input.setTimeout(500);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10938);output = new SerialOutputStream(serialPort);
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    protected synchronized void disconnect() throws Exception {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10939);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10940);if ((((serialPort != null && serialPort.isOpened())&&(__CLR4_5_28fn8fnlx1h37es.R.iget(10941)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(10942)==0&false))) {{
            __CLR4_5_28fn8fnlx1h37es.R.inc(10943);serialPort.closePort();
            __CLR4_5_28fn8fnlx1h37es.R.inc(10944);input = null;
            __CLR4_5_28fn8fnlx1h37es.R.inc(10945);output = null;
            __CLR4_5_28fn8fnlx1h37es.R.inc(10946);serialPort = null;
        }
    }}finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public void dispense(ReferencePasteDispenser dispenser, Location startLocation,
            Location endLocation, long dispenseTimeMilliseconds) throws Exception {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10947);
        // Do nothing. This is just stubbed in so that it can be released
        // without breaking every driver in the wild.
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    public String[] getPortNames() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10948);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10949);return SerialPortList.getPortNames();
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    /**
     * Read a line from the serial port. Blocks for the default timeout. If the read times out a
     * TimeoutException is thrown. Any other failure to read results in an IOExeption;
     * 
     * @return
     * @throws TimeoutException
     * @throws IOException
     */
    protected String readLine() throws TimeoutException, IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10950);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10951);StringBuffer line = new StringBuffer();
        __CLR4_5_28fn8fnlx1h37es.R.inc(10952);while (true) {{
            __CLR4_5_28fn8fnlx1h37es.R.inc(10953);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(10954);int ch = input.read();
                __CLR4_5_28fn8fnlx1h37es.R.inc(10955);if ((((ch == -1)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(10956)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(10957)==0&false))) {{
                    __CLR4_5_28fn8fnlx1h37es.R.inc(10958);return null;
                }
                }else {__CLR4_5_28fn8fnlx1h37es.R.inc(10959);if ((((ch == '\n' || ch == '\r')&&(__CLR4_5_28fn8fnlx1h37es.R.iget(10960)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(10961)==0&false))) {{
                    __CLR4_5_28fn8fnlx1h37es.R.inc(10962);if ((((line.length() > 0)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(10963)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(10964)==0&false))) {{
                        __CLR4_5_28fn8fnlx1h37es.R.inc(10965);return line.toString();
                    }
                }}
                }else {{
                    __CLR4_5_28fn8fnlx1h37es.R.inc(10966);line.append((char) ch);
                }
            }}}
            catch (IOException ex) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(10967);if ((((ex.getCause() instanceof SerialPortTimeoutException)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(10968)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(10969)==0&false))) {{
                    __CLR4_5_28fn8fnlx1h37es.R.inc(10970);throw new TimeoutException(ex.getMessage());
                }
                }__CLR4_5_28fn8fnlx1h37es.R.inc(10971);throw ex;
            }
        }
    }}finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10972);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10973);try {
            __CLR4_5_28fn8fnlx1h37es.R.inc(10974);disconnect();
        }
        catch (Exception e) {
            __CLR4_5_28fn8fnlx1h37es.R.inc(10975);throw new IOException(e);
        }
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    public String getPortName() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10976);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10977);return portName;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    public void setPortName(String portName) {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10978);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10979);this.portName = portName;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    public int getBaud() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10980);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10981);return baud;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    public void setBaud(int baud) {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10982);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10983);this.baud = baud;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public Icon getPropertySheetHolderIcon() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10984);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10985);return null;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}
    
    @Override
    public String getPropertySheetHolderTitle() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10986);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10987);return getClass().getSimpleName();
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public PropertySheetHolder[] getChildPropertySheetHolders() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10988);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10989);return null;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public Action[] getPropertySheetHolderActions() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10990);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10991);return null;
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public PropertySheet[] getPropertySheets() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10992);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10993);return new PropertySheet[] {new PropertySheetWizardAdapter(getConfigurationWizard())};
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    @Override
    public Wizard getConfigurationWizard() {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10994);
        __CLR4_5_28fn8fnlx1h37es.R.inc(10995);return new AbstractSerialPortDriverConfigurationWizard(this);
    }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}
    
    /**
     * SerialInputStream and SerialOutputStream are from the pull request referenced in:
     * https://github.com/scream3r/java-simple-serial-connector/issues/17
     * 
     * If that pull request is ever merged we can update and remove these.
     */

    /**
     * Class that wraps a {@link SerialPort} to provide {@link InputStream} functionality. This
     * stream also provides support for performing blocking reads with timeouts. <br>
     * It is instantiated by passing the constructor a {@link SerialPort} instance. Do not create
     * multiple streams for the same serial port unless you implement your own synchronization.
     * 
     * @author Charles Hache <chalz@member.fsf.org>
     *
     */
    public class SerialInputStream extends InputStream {

        private SerialPort serialPort;
        private int defaultTimeout = 0;

        /**
         * Instantiates a SerialInputStream for the given {@link SerialPort} Do not create multiple
         * streams for the same serial port unless you implement your own synchronization.
         * 
         * @param sp The serial port to stream.
         */
        public SerialInputStream(SerialPort sp) {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10996);
            __CLR4_5_28fn8fnlx1h37es.R.inc(10997);serialPort = sp;
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * Set the default timeout (ms) of this SerialInputStream. This affects subsequent calls to
         * {@link #read()}, {@link #blockingRead(int[])}, and {@link #blockingRead(int[], int, int)}
         * The default timeout can be 'unset' by setting it to 0.
         * 
         * @param time The timeout in milliseconds.
         */
        public void setTimeout(int time) {try{__CLR4_5_28fn8fnlx1h37es.R.inc(10998);
            __CLR4_5_28fn8fnlx1h37es.R.inc(10999);defaultTimeout = time;
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * Reads the next byte from the port. If the timeout of this stream has been set, then this
         * method blocks until data is available or until the timeout has been hit. If the timeout
         * is not set or has been set to 0, then this method blocks indefinitely.
         */
        @Override
        public int read() throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11000);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11001);return read(defaultTimeout);
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * The same contract as {@link #read()}, except overrides this stream's default timeout with
         * the given timeout in milliseconds.
         * 
         * @param timeout The timeout in milliseconds.
         * @return The read byte.
         * @throws IOException On serial port error or timeout
         */
        public int read(int timeout) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11002);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11003);byte[] buf = new byte[1];
            __CLR4_5_28fn8fnlx1h37es.R.inc(11004);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11005);if ((((timeout > 0)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(11006)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(11007)==0&false))) {{
                    __CLR4_5_28fn8fnlx1h37es.R.inc(11008);buf = serialPort.readBytes(1, timeout);
                }
                }else {{
                    __CLR4_5_28fn8fnlx1h37es.R.inc(11009);buf = serialPort.readBytes(1);
                }
                }__CLR4_5_28fn8fnlx1h37es.R.inc(11010);return buf[0];
            }
            catch (Exception e) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11011);throw new IOException(e);
            }
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * Non-blocking read of up to buf.length bytes from the stream. This call behaves as
         * read(buf, 0, buf.length) would.
         * 
         * @param buf The buffer to fill.
         * @return The number of bytes read, which can be 0.
         * @throws IOException on error.
         */
        @Override
        public int read(byte[] buf) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11012);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11013);return read(buf, 0, buf.length);
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * Non-blocking read of up to length bytes from the stream. This method returns what is
         * immediately available in the input buffer.
         * 
         * @param buf The buffer to fill.
         * @param offset The offset into the buffer to start copying data.
         * @param length The maximum number of bytes to read.
         * @return The actual number of bytes read, which can be 0.
         * @throws IOException on error.
         */
        @Override
        public int read(byte[] buf, int offset, int length) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11014);

            __CLR4_5_28fn8fnlx1h37es.R.inc(11015);if ((((buf.length < offset + length)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(11016)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(11017)==0&false)))
                {__CLR4_5_28fn8fnlx1h37es.R.inc(11018);length = buf.length - offset;

            }__CLR4_5_28fn8fnlx1h37es.R.inc(11019);int available = this.available();

            __CLR4_5_28fn8fnlx1h37es.R.inc(11020);if ((((available > length)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(11021)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(11022)==0&false)))
                {__CLR4_5_28fn8fnlx1h37es.R.inc(11023);available = length;

            }__CLR4_5_28fn8fnlx1h37es.R.inc(11024);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11025);byte[] readBuf = serialPort.readBytes(available);
                __CLR4_5_28fn8fnlx1h37es.R.inc(11026);System.arraycopy(readBuf, 0, buf, offset, length);
                __CLR4_5_28fn8fnlx1h37es.R.inc(11027);return readBuf.length;
            }
            catch (Exception e) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11028);throw new IOException(e);
            }
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * Blocks until buf.length bytes are read, an error occurs, or the default timeout is hit
         * (if specified). This behaves as blockingRead(buf, 0, buf.length) would.
         * 
         * @param buf The buffer to fill with data.
         * @return The number of bytes read.
         * @throws IOException On error or timeout.
         */
        public int blockingRead(byte[] buf) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11029);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11030);return blockingRead(buf, 0, buf.length, defaultTimeout);
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * The same contract as {@link #blockingRead(byte[])} except overrides this stream's default
         * timeout with the given one.
         * 
         * @param buf The buffer to fill.
         * @param timeout The timeout in milliseconds.
         * @return The number of bytes read.
         * @throws IOException On error or timeout.
         */
        public int blockingRead(byte[] buf, int timeout) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11031);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11032);return blockingRead(buf, 0, buf.length, timeout);
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * Blocks until length bytes are read, an error occurs, or the default timeout is hit (if
         * specified). Saves the data into the given buffer at the specified offset. If the stream's
         * timeout is not set, behaves as {@link #read(byte[], int, int)} would.
         * 
         * @param buf The buffer to fill.
         * @param offset The offset in buffer to save the data.
         * @param length The number of bytes to read.
         * @return the number of bytes read.
         * @throws IOException on error or timeout.
         */
        public int blockingRead(byte[] buf, int offset, int length) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11033);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11034);return blockingRead(buf, offset, length, defaultTimeout);
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        /**
         * The same contract as {@link #blockingRead(byte[], int, int)} except overrides this
         * stream's default timeout with the given one.
         * 
         * @param buf The buffer to fill.
         * @param offset Offset in the buffer to start saving data.
         * @param length The number of bytes to read.
         * @param timeout The timeout in milliseconds.
         * @return The number of bytes read.
         * @throws IOException On error or timeout.
         */
        public int blockingRead(byte[] buf, int offset, int length, int timeout)
                throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11035);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11036);if ((((buf.length < offset + length)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(11037)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(11038)==0&false)))
                {__CLR4_5_28fn8fnlx1h37es.R.inc(11039);throw new IOException("Not enough buffer space for serial data");

            }__CLR4_5_28fn8fnlx1h37es.R.inc(11040);if ((((timeout < 1)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(11041)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(11042)==0&false)))
                {__CLR4_5_28fn8fnlx1h37es.R.inc(11043);return read(buf, offset, length);

            }__CLR4_5_28fn8fnlx1h37es.R.inc(11044);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11045);byte[] readBuf = serialPort.readBytes(length, timeout);
                __CLR4_5_28fn8fnlx1h37es.R.inc(11046);System.arraycopy(readBuf, 0, buf, offset, length);
                __CLR4_5_28fn8fnlx1h37es.R.inc(11047);return readBuf.length;
            }
            catch (Exception e) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11048);throw new IOException(e);
            }
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        @Override
        public int available() throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11049);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11050);int ret;
            __CLR4_5_28fn8fnlx1h37es.R.inc(11051);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11052);ret = serialPort.getInputBufferBytesCount();
                __CLR4_5_28fn8fnlx1h37es.R.inc(11053);if ((((ret >= 0)&&(__CLR4_5_28fn8fnlx1h37es.R.iget(11054)!=0|true))||(__CLR4_5_28fn8fnlx1h37es.R.iget(11055)==0&false)))
                    {__CLR4_5_28fn8fnlx1h37es.R.inc(11056);return ret;
                }__CLR4_5_28fn8fnlx1h37es.R.inc(11057);throw new IOException("Error checking available bytes from the serial port.");
            }
            catch (Exception e) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11058);throw new IOException("Error checking available bytes from the serial port.");
            }
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

    }

    /**
     * Class that wraps a {@link SerialPort} to provide {@link OutputStream} functionality. <br>
     * It is instantiated by passing the constructor a {@link SerialPort} instance. Do not create
     * multiple streams for the same serial port unless you implement your own synchronization.
     * 
     * @author Charles Hache <chalz@member.fsf.org>
     *
     */
    public class SerialOutputStream extends OutputStream {

        SerialPort serialPort;

        /**
         * Instantiates a SerialOutputStream for the given {@link SerialPort} Do not create multiple
         * streams for the same serial port unless you implement your own synchronization.
         * 
         * @param sp The serial port to stream.
         */
        public SerialOutputStream(SerialPort sp) {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11059);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11060);serialPort = sp;
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        @Override
        public void write(int b) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11061);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11062);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11063);serialPort.writeInt(b);
            }
            catch (SerialPortException e) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11064);throw new IOException(e);
            }
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        @Override
        public void write(byte[] b) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11065);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11066);write(b, 0, b.length);

        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}

        @Override
        public void write(byte[] b, int off, int len) throws IOException {try{__CLR4_5_28fn8fnlx1h37es.R.inc(11067);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11068);byte[] buffer = new byte[len];
            __CLR4_5_28fn8fnlx1h37es.R.inc(11069);System.arraycopy(b, off, buffer, 0, len);
            __CLR4_5_28fn8fnlx1h37es.R.inc(11070);try {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11071);serialPort.writeBytes(buffer);
            }
            catch (SerialPortException e) {
                __CLR4_5_28fn8fnlx1h37es.R.inc(11072);throw new IOException(e);
            }
        }finally{__CLR4_5_28fn8fnlx1h37es.R.flushNeeded();}}
    }
}

