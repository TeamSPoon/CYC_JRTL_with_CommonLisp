/* For LarKC */
package org.logicmoo.system;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Formatter;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

import org.armedbear.lisp.ReaderInputStream;
import org.armedbear.lisp.WriterOutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class SystemCurrent {
	private static final Object DRASTIC_CHANGE = new Object() {
		@Override
		public String toString() {
			return "DRASTIC_CHANGE";
		}
	};

	static public boolean DONT_USE = false;

	public static Thread originalSystemThread = Thread.currentThread();
	public static InOutErr originalInOutErr = new InOutErr("originalInOutErr " + originalSystemThread.getName());

	public static InputStream originalSystemIn = (InputStream) checkNonTLStream(System.in);
	public static PrintStream originalSystemOut = System.out;
	public static PrintStream originalSystemErr = System.err;

	public static class Constituents {

		private Set objects;
		private Set parts;

		public boolean addObject(Object i, Set partz) {
			if (isTLStream(i))
				return false;
			for (Object p : partz) {
				if (parts.contains(p))
					return false;
			}
			if (objects.add(i)) {
				return parts.addAll(partz);
			}
			return false;
		}

		public Constituents(Set os, Set pts) {
			objects = os;
			parts = pts;
		}

		public boolean contains(Object p) {
			if (isTLStream(p))
				return true;
			return parts.contains(p) || objects.contains(p);
		}

		public Collection getObjects() {
			return objects;
		}

		public Collection getParts() {
			return parts;
		}

	}

	public static void installSM() {
		try {
			System.setSecurityManager(new IOSecurityManager());
		} catch (SecurityException se) {
			System.err.println("SecurityManager already set!");
		}

		try {
			DataInputStream fis = new DataInputStream(new FileInputStream("inputtext.txt"));
			DataOutputStream fos = new DataOutputStream(new FileOutputStream("outputtext.txt"));
			String inputString;
			while ((inputString = fis.readLine()) != null) {
				fos.writeBytes(inputString);
				fos.writeByte('\n');
			}
			fis.close();
			fos.close();
		} catch (IOException ioe) {
			System.err.println("I/O failed for SecurityManagerTest.");
		}
	}

	static final class TlIO extends InheritableThreadLocal<InOutErr> {
		@Override
		protected InOutErr initialValue() {
			return new InOutErr(Thread.currentThread().getName());
		}

		@Override
		protected InOutErr childValue(InOutErr parentValue) {
			if (parentValue == null) {
				bp();
			}

			InOutErr inOutErr = new InOutErr(Thread.currentThread().getName());
			inOutErr.parent = parentValue;
			return inOutErr;
		}
	}

	public interface ThreadLocalStream {

	}

	static {
		originalInOutErr.in = originalSystemIn;
		originalInOutErr.out = originalSystemOut;
		originalInOutErr.err = originalSystemErr;
	}

	final private static TlIO threadLocalIO = new TlIO();

	/**
	 * Reassigns the "standard" input stream.
	 *
	 * <p>
	 * First, if there is a security manager, its <code>checkPermission</code>
	 * method is called with a <code>RuntimePermission("setIO")</code> permission to
	 * see if it's ok to reassign the "standard" input stream.
	 * <p>
	 *
	 * @param s the new standard input stream.
	 *
	 * @throws SecurityException if a security manager exists and its
	 *                           <code>checkPermission</code> method doesn't allow
	 *                           reassigning of the standard input stream.
	 *
	 * @see SecurityManager#checkPermission
	 * @see java.lang.RuntimePermission
	 *
	 * @since JDK1.1
	 */
	public static void setIn(Object sObj) {
		synchronized (DRASTIC_CHANGE) {

			if (DONT_USE) {
				System.setIn((InputStream) sObj);
				return;
			}
			final InOutErr currentIO = currentIO();
			if (sObj == null) {
				currentIO.in = null;
				return;
			}
			Object under = getNonTLStream(sObj, 'i');
			if (under == null) {
				if (isTLStream(sObj)) {
					currentIO.in = originalSystemIn;
					return;
				}
				return;
			} else {
				currentIO.in = asInputStream(sObj);
			}
		}
	}

	private static Object checkNonTLStream(Object in2) {
		if (isTLStream(in2)) {
			Object o = getNonTLStream(in2, '?');
			bp();
			return o;
		}
		return in2;
	}

	public static Thread takeOwnerShip() {
		synchronized (DRASTIC_CHANGE) {
			final Thread currentThread = Thread.currentThread();
			// final InOutErr inOutErr = currentIO();
			// if (inOutErr.in != null && inOutErr.in != originalSystemIn) { return
			// currentThread; }
			Thread was;
			synchronized (justSuspended) {
				was = currentOwner;
				if (currentOwner == null) {
					currentOwner = currentThread;
				} else if (currentOwner == currentThread) {

				} else {
					// currentOwner.suspend();
					justSuspended.set(currentOwner);
					currentOwner = currentThread;
				}
			}
			return was;
		}
	}

	public static void releaseOwnerShip() {
		final Thread currentThread = Thread.currentThread();
		final InOutErr inOutErr = currentIO();
		if (inOutErr.in != originalSystemIn) {
			return;
		}

		synchronized (justSuspended) {
			final Thread suspendedWhom = justSuspended.get();
			if (currentOwner == null) {
				if (suspendedWhom != null) {
					suspendedWhom.resume();
					currentOwner = suspendedWhom;
				}
				return;
			} else if (currentOwner == currentThread) {
				currentOwner = null;
				if (suspendedWhom != null) {
					suspendedWhom.resume();
					currentOwner = suspendedWhom;
				}
				return;
			} else {
				if (suspendedWhom != null) {
					suspendedWhom.resume();
					currentOwner = suspendedWhom;
				}
				return;
			}

		}
	}

	static Thread currentOwner = null;
	public static Thread attactedConsoleThread = null;
	static ThreadLocal<Thread> justSuspended = new ThreadLocal<Thread>();

	public static InputStream getBestInput() {
		synchronized (DRASTIC_CHANGE) {
			final Thread currentThread = Thread.currentThread();
			final InOutErr inOutErr = currentIO();

			if (originalInOutErr == inOutErr) {
				synchronized (justSuspended) {
					if (currentOwner == null) {
						currentOwner = currentThread;
					} else if (currentOwner != currentThread) {
						//
						// throw new Error("Take owership first!");
					}
				}
			}

			InputStream is = inOutErr.in;
			if (is == null) {
				if (currentThread == originalSystemThread) {
					return originalSystemIn;
				}
				return originalSystemIn;
			}
			if (isTLStream(is)) {
				return originalSystemIn;
			}
			return is;
		}
	}

	public static InOutErr currentIO() {
		InOutErr ioe = threadLocalIO.get();
		if (ioe == null) {
			ioe = new InOutErr(Thread.currentThread().getName());
			threadLocalIO.set(ioe);
		}
		return ioe;
	}

	public static boolean isTLStream(Object s) {
		try {
			return isTLStream(s, newIdentitySet());
		} catch (Throwable t) {
			printStackTrace(t);
			return false;
		}
	}

	private static boolean isTLStream(final Object s, Set depth) {

		if (s instanceof ThreadLocalStream)
			return true;
		if (depth.contains(s)) {
			return false;
		}
		depth.add(s);
		Class clz = s.getClass();
		while (clz != null && clz != Object.class) {
			for (Field f : clz.getDeclaredFields()) {

				if (Modifier.isStatic(f.getModifiers()))
					continue;
				final Class<?> type = f.getType();
				if (type.isPrimitive()) {
					continue;
				}
				f.setAccessible(true);
				Object a = null;
				try {
					a = f.get(s);

					if (a == null)
						continue;

				} catch (IllegalArgumentException | IllegalAccessException e) {
					printStackTrace(e);
				}
				if (!isStreamOfDirection(a, '?')) {
					continue;
				}
				if (isTLStream(a, depth))
					return true;
			}
			clz = clz.getSuperclass();
		}
		return false;
	}

	private static boolean anyMembes(Object s, Set depth, Set foundFrom) {
		boolean added = false;
		if (isIO(s)) {
			if (foundFrom.contains(s))
				return true;
			added = depth.add(s);
		}
		Class clz = s.getClass();
		while (clz != null && clz != Object.class) {
			for (Field f : clz.getDeclaredFields()) {

				if (Modifier.isStatic(f.getModifiers()))
					continue;
				final Class<?> type = f.getType();
				if (type.isPrimitive()) {
					continue;
				}
				f.setAccessible(true);
				Object a = null;

				try {
					a = f.get(s);
					if (isIO(a)) {
						if (depth.add(depth)) {
							added |= anyMembes(a, depth, foundFrom);
							if (added)
								return true;
						}
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			clz = clz.getSuperclass();
		}
		return false;
	}

	private static boolean addAllMembes(Object s, Set depth) {
		boolean added = false;
		if (isIO(s)) {
			added = depth.add(s);
		}
		Class clz = s.getClass();
		while (clz != null && clz != Object.class) {
			for (Field f : clz.getDeclaredFields()) {

				if (Modifier.isStatic(f.getModifiers()))
					continue;
				final Class<?> type = f.getType();
				if (type.isPrimitive()) {
					continue;
				}
				f.setAccessible(true);
				Object a = null;

				try {
					a = f.get(s);
					if (isIO(a)) {
						if (depth.add(depth)) {
							added |= addAllMembes(a, depth);
						}
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			clz = clz.getSuperclass();
		}
		return added;
	}

	/**
	 * @param s
	 * @return
	 */
	public static boolean isIO(Object s) {
		return s instanceof Closeable || s instanceof Appendable || s instanceof Readable || s instanceof Flushable;
	}

	public static Object getNonTLStream(final Object s, char outOrIn) {
		return getNonTLStream(s, outOrIn, newIdentitySet());
	}

	private static Object getNonTLStream(final Object s, char outOrIn, Set depth) {
		if (s instanceof ThreadLocalStream)
			return null;
		if (depth.contains(s))
			return null;
		if (!isStreamOfDirection(s, '?')) {
			return null;
		}
		depth.add(s);
		if (isStreamOfDirection(s, outOrIn)) {
			if (!isTLStream(s))
				return s;
		}
		Class clz = s.getClass();
		while (clz != null && clz != Object.class) {
			for (Field f : clz.getDeclaredFields()) {

				if (Modifier.isStatic(f.getModifiers()))
					continue;
				final Class<?> type = f.getType();
				if (type.isPrimitive()) {
					continue;
				}
				f.setAccessible(true);
				Object a = null;
				try {
					a = f.get(s);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
				if (a == null)
					continue;
				if (isTLStream(a))
					continue;
				Class ca = a.getClass();

				if (!isStreamOfDirection(a, '?')) {
					continue;
				}
				if (a instanceof Comparable) {
					continue;
				}
				Object a1 = getNonTLStream(a, outOrIn, depth);
				if (a1 != null) {
					return a1;
				}
			}
			clz = clz.getSuperclass();
		}
		return null;
	}

	private static boolean isStreamOfDirection(Object s, char outOrIn) {
		if (outOrIn == 'i') {
			if (s instanceof InputStream)
				return true;
			if (s instanceof Readable)
				return true;
		} else if (outOrIn == 'o') {
			if (s instanceof OutputStream)
				return true;
			if (s instanceof Appendable)
				return true;
		} else if (outOrIn == '?') {
			if (s instanceof Appendable)
				return true;
			if (s instanceof Readable)
				return true;
			if (s instanceof Flushable)
				return true;
			if (s instanceof Closeable)
				return true;
		}
		return false;
	}

	public static InputStream in = System.in;

	public static InputStream tlin = new InputStream() {

		@Override
		public int read() throws IOException {
			return getBestInput().read();
		}
	};
	static {
		//if (!DONT_USE) {
		in = new SystemCurrent.In("#<System.in>", tlin);
		//}
	}

	/**
	 * Reassigns the "standard" output stream.
	 *
	 * <p>
	 * First, if there is a security manager, its <code>checkPermission</code>
	 * method is called with a <code>RuntimePermission("setIO")</code> permission to
	 * see if it's ok to reassign the "standard" output stream.
	 *
	 * @param out the new standard output stream
	 *
	 * @throws SecurityException if a security manager exists and its
	 *                           <code>checkPermission</code> method doesn't allow
	 *                           reassigning of the standard output stream.
	 *
	 * @see SecurityManager#checkPermission
	 * @see java.lang.RuntimePermission
	 *
	 * @since JDK1.1
	 */
	public static void setOut(Object sObj) {
		synchronized (DRASTIC_CHANGE) {
			if (DONT_USE) {
				System.setOut((PrintStream) sObj);
				return;
			}
			final InOutErr currentIO = currentIO();
			if (cantSetOut) {
				if (currentIO == originalInOutErr) {
					bp();
					return;
				} else {
					bp();
				}
			}
			if (sObj == null) {
				currentIO.out = null;
				return;
			}
			Object under = getNonTLStream(sObj, 'o');
			if (under == null) {
				if (isTLStream(sObj)) {
					currentIO.out = originalSystemOut;
					return;
				}
				return;
			} else {
				currentIO.out = asPrintStream(sObj);
			}
		}
	}

	public static final ThreadLocalPrintStream tlout = new ThreadLocalPrintStream() {
		@Override
		public OutputStream getOutputStream() {
			PrintStream os = getBestOut();
			//currentIO.out = os;
			return os;
		}
	};
	public static PrintStream out = System.out;

	//public static PrintStream out = System.out;
	static {
		//if (!DONT_USE) {
		out = new Out("#<System.out>", tlout);
		//}
	}

	/**
	 * Reassigns the "standard" error output stream.
	 *
	 * <p>
	 * First, if there is a security manager, its <code>checkPermission</code>
	 * method is called with a <code>RuntimePermission("setIO")</code> permission to
	 * see if it's ok to reassign the "standard" error output stream.
	 *
	 * @param err the new standard error output stream.
	 *
	 * @throws SecurityException if a security manager exists and its
	 *                           <code>checkPermission</code> method doesn't allow
	 *                           reassigning of the standard error output stream.
	 *
	 * @see SecurityManager#checkPermission
	 * @see java.lang.RuntimePermission
	 *
	 * @since JDK1.1
	 */
	public static void setErr(Object sObj) {
		synchronized (DRASTIC_CHANGE) {
			if (DONT_USE) {
				System.setErr((PrintStream) sObj);
				return;
			}
			final InOutErr currentIO = currentIO();
			if (sObj == null) {
				currentIO.err = null;
				return;
			}
			Object under = getNonTLStream(sObj, 'o');
			if (under == null) {
				if (isTLStream(sObj)) {
					currentIO.err = originalSystemErr;
					return;
				}
				return;
			} else {
				currentIO.err = asPrintStream(sObj);
			}
		}
	}

	public static PrintStream getBestOut() {
		synchronized (DRASTIC_CHANGE) {
			final InOutErr currentIO = currentIO();
			OutputStream is = currentIO.out;
			if (is == null) {
				is = originalSystemOut;
				if (is == null)
					if (is == null) {
						is = currentIO.err;
						if (is == null)
							is = originalSystemErr;
					}
			}
			Object is2 = getNonTLStream(is, 'o');
			if (is2 == null)
				return originalSystemOut;
			return asPrintStream(is2);
		}
	}

	public static PrintStream getBestErr() {
		synchronized (DRASTIC_CHANGE) {
			final InOutErr currentIO = currentIO();
			OutputStream is = currentIO.err;
			if (is == null) {
				is = originalSystemErr;
				if (is == null)
					if (is == null) {
						is = currentIO.out;
						if (is == null)
							is = originalSystemOut;
					}
			}
			Object is2 = getNonTLStream(is, 'o');
			if (is2 == null)
				return errTee;
			return asPrintStream(is2);
		}
	}

	public static final ThreadLocalPrintStream tlerr = new ThreadLocalPrintStream() {
		@Override
		public OutputStream getOutputStream() {
			final InOutErr currentIO = currentIO();
			PrintStream os = getBestErr();
			//currentIO.err = os;
			return os;
		}
	};

	public static PrintStream err = System.err;
	public static boolean cantSetOut;
	static {
		//if (!DONT_USE) {
		err = new Out("#<System.err>", tlerr);
		//}
	}
	//public static final Out err = new Err("#<System.err>", tlerr);

	private static final String NewLine = "\n";

	static {
		// setupIO();
	}

	static public class In extends BufferedInputStream implements ThreadLocalStream {
		private String named;

		public In(String n, InputStream tlin) {
			super(tlin);
			this.named = n;
		}

		@Override
		public String toString() {
			final InOutErr inOutErr = currentIO();
			return named + " @ " + inOutErr;
		}

		@Override
		public int read() throws IOException {
			InputStream is0 = getBestInput();
			if (is0 instanceof ThreadLocalStream || is0 == null) {
				is0 = originalSystemIn;
			}
			final InputStream is = is0;
			return when_ready(() -> is.read());
		}

		@Override
		public int read(byte[] array, int n, int n2) throws IOException {
			InputStream is0 = getBestInput();
			if (is0 instanceof ThreadLocalStream || is0 == null) {
				is0 = originalSystemIn;
			}
			final InputStream is = is0;
			return when_ready(() -> is.read(array, n, n2));
		}

		private int when_ready(Callable<Integer> call) throws IOException {
			boolean interrupted = false;
			boolean mayMessage = true;

			long startTime = System.currentTimeMillis();
			long elapsed = 0;
			do {
				if (Startup.shutdownRequested != null) {
					out.println(";; shutdownRequested: " + Startup.shutdownRequested);
					return -1;
				}
				try {
					long nowTime = System.currentTimeMillis();
					elapsed = nowTime - startTime;
					if (elapsed > 60000) {
						startTime = System.currentTimeMillis();
						mayMessage = true;
						//originalSystemErr.println(";; Waiting For Input(" + timeString() + ") " + Thread.currentThread().getName());
					}
					if (interrupted) {
						originalSystemErr.println(";; Iinterrupted For Input(" + timeString() + ") " + Thread.currentThread().getName());
						interrupted = false;
						Thread.sleep(100);
						return 0;
					}
					if (!canAccessConsole(false)) {
					}
					int available = available();
					if (available == 0) {
						Thread.sleep(200);
						continue;
					}
					if (!canAccessConsole(false)) {
						if (mayMessage) {
							mayMessage = false;
							originalSystemErr.println(";; !canAccessConsole For Input " + timeString() + ") " + Thread.currentThread().getName());
						} else {
							Thread.sleep(500);
							continue;
						}
					}
					int retval = call.call();
					return retval;
				} catch (InterruptedException e) {
					interrupted = true;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new IOException(e);
				}

			} while (true);
		}

		public boolean canAccessConsole(boolean expectedTo) {
			if (currentOwner == null)
				return true;
			final Thread currentThread = Thread.currentThread();
			if (currentThread == currentOwner) {
				return true;
			}
			if (!expectedTo) {
				return false;
			}
			return false;
		}

		static String timeString() {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			return dtf.format(now);
		}

		@Override
		public int available() throws IOException {
			return getBestInput().available();
		}

		@Override
		public synchronized void mark(final int n) {
			getBestInput().mark(n);
		}

		@Override
		public synchronized void reset() throws IOException {
			getBestInput().reset();
		}

		@Override
		public boolean markSupported() {
			return getBestInput().markSupported();
		}

		@Override
		public void close() throws IOException {
			getBestInput().close();
		}
	}

	static public class Err extends Out implements ThreadLocalStream {

		protected Err(String n, ThreadLocalPrintStream out) {
			super(n, out);
		}

		@Override
		public void print(String x) {
			printErr(String.valueOf(x));
		}

		@Override
		public void println() {
			printErr(NewLine);
		}
	}

	private static PrintStream errTee = new PrintStream(new OutputStream() {
		@Override
		public void write(int b) throws IOException {
			printErr(String.valueOf((char) b));
		}
	});

	static public class Out extends PrintStream implements ThreadLocalStream {
		private String named;
		private Formatter _formatter_;

		protected Out(String n, ThreadLocalPrintStream out) {
			super(out);
			this.named = n;
		}

		@Override
		public void print(String x) {
			printOut(String.valueOf(x));
		}

		@Override
		public void println() {
			printOut(NewLine);
		}

		@Override
		public void print(boolean b) {
			super.print(b);
		}

		@Override
		public void print(Object x) {
			print(String.valueOf(x));
		}

		@Override
		public void println(Object x) {
			print(String.valueOf(x));
			println();
		}

		@Override
		public void println(String x) {
			print(String.valueOf(x));
			println();
		}

		@Override
		public String toString() {
			return named + " @ " + currentIO();
		}

		@Override
		public PrintStream printf(Locale l, String format, Object... args) {
			return format(l, format, args);
		}

		@Override
		public PrintStream printf(String format, Object... args) {
			return format(format, args);
		}

		@Override
		public void print(char c) {
			print("" + c);
		}

		@Override
		public void println(char[] x) {
			println(new String(x));
		}

		@Override
		public void println(char x) {
			println("" + x);
		}

		@Override
		public void print(char[] s) {
			print(new String(s));
		}

		@Override
		public PrintStream format(Locale l, String format, Object... args) {
			try {
				synchronized (this) {
					//ensureOpen();
					if ((_formatter_ == null) || (_formatter_.locale() != l))
						_formatter_ = new Formatter(this, l);
					_formatter_.format(l, format, args);
				}
				//			} catch (InterruptedIOException x) {
				//				Thread.currentThread().interrupt();
				//			} catch (IOException x) {
				//				return super.format(l, format, args);
			} catch (Throwable x) {
				return super.format(l, format, args);
			}
			return this;
		}

		public PrintStream format(String format, Object... args) {
			try {
				synchronized (this) {
					//	ensureOpen();
					if ((this._formatter_ == null) || (_formatter_.locale() != Locale.getDefault()))
						_formatter_ = new Formatter((Appendable) this);
					_formatter_.format(Locale.getDefault(), format, args);
				}
				//} catch (InterruptedIOException x) {
				//	Thread.currentThread().interrupt();
			} catch (Throwable x) {
				//trouble = true;
				return super.format(format, args);
			}
			return this;
		}

		@Override
		public PrintStream append(CharSequence csq) {
			return super.append(csq);
		}

		public PrintStream append(CharSequence csq, int start, int end) {
			CharSequence cs = (csq == null ? "null" : csq);
			print(cs.subSequence(start, end).toString());
			return this;
		}

		/**
		 * Appends the specified character to this output stream.
		 *
		 * <p> An invocation of this method of the form <tt>out.append(c)</tt>
		 * behaves in exactly the same way as the invocation
		 *
		 * <pre>
		 *     out.print(c) </pre>
		 *
		 * @param  c
		 *         The 16-bit character to append
		 *
		 * @return  This output stream
		 *
		 * @since  1.5
		 */
		public PrintStream append(char c) {
			print("" + c);
			return this;
		}
	}

	private static abstract class ThreadLocalPrintStream extends OutputStream implements ThreadLocalStream {
		@Override
		public void write(int b) throws IOException {
			OutputStream redirect = getOutputStream();
			if (redirect == this) {
				Errors.warn("Looped " + this);
				return;
			}
			if (redirect != null) {
				redirect.write(b);
			} else {
				originalSystemOut.write(b);
			}
		}

		@Override
		public String toString() {
			return "TLPS: " + getOutputStream();
		}

		abstract OutputStream getOutputStream();

		@Override
		final public void close() {
			OutputStream redirect = getOutputStream();
			if (redirect != null)
				try {
					redirect.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		@Override
		public void flush() throws IOException {
			OutputStream redirect = getOutputStream();
			if (redirect != null) {
				try {
					redirect.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				super.flush();
			}
		}

	}

	static boolean hasSetupIO = false;
	private static Constituents inputTees = new Constituents(newIdentitySet(), newIdentitySet());
	private static Constituents outputTees = new Constituents(newIdentitySet(), newIdentitySet());
	private static Constituents errorTees = new Constituents(newIdentitySet(), newIdentitySet());

	static {
		addTee(errorTees, System.err);
	}
	public static boolean mustShow;

	private static Map<String, InOutErr> interactiveConsoles = new HashMap();

	public static void recheckStdIO() {
		synchronized (DRASTIC_CHANGE) {
			if (!hasSetupIO) {
				setupIO();
			}
			PrintStream alterr = System.err;
			if (!(alterr instanceof ThreadLocalStream)) {
				System.setErr(err);
				PrintStream nonTL = (PrintStream) getNonTLStream(alterr);
				if (nonTL != null) {
					addTee(errorTees, alterr);
				}
			}
			if (DONT_USE)
				return;
			PrintStream altout = System.out;
			if (!(altout instanceof ThreadLocalStream)) {
				System.setOut(out);
				PrintStream nonTL = (PrintStream) getNonTLStream(altout);
				if (nonTL != null) {
					addTee(outputTees, altout);
				}
			}
			InputStream altIn = System.in;
			if (!(altIn instanceof ThreadLocalStream)) {
				System.setIn(in);
				InputStream nonTL = (InputStream) getNonTLStream(altIn);
				if (nonTL != null) {
					addTee(inputTees, altIn);
				}
			}
		}
	}

	public static Set newIdentitySet() {
		return java.util.Collections.newSetFromMap(new IdentityHashMap());
	}

	private static Object getNonTLStream(Object alterr) {
		return getNonTLStream(alterr, '?');
	}

	public static boolean addTee(Constituents tee, Object t) {
		synchronized (DRASTIC_CHANGE) {

			if (tee.parts.contains(t)) {
				return false;
			}
			Set s1 = newIdentitySet();
			addAllMembes(t, s1);
			tee.addObject(t, s1);
			return true;
		}
	}

	public static boolean sharesMemebers(Object o1, Object o2) {
		Set s1 = newIdentitySet();
		addAllMembes(o1, s1);
		return anyMembes(o2, newIdentitySet(), s1);
	}

	static public boolean actOn(Constituents o, Function<Object, Boolean> prn) {
		List<PrintStream> l = new LinkedList();
		synchronized (o) {
			l.addAll(o.getObjects());
			l.addAll(o.getParts());
		}
		for (Object ps : l) {
			if (isTLStream(ps)) {
				bp();
				continue;
			}
			try {
				boolean a = prn.apply(ps);
				if (a) {
					return true;
				}
			} catch (Throwable e) {
				printStackTrace(e);
			}
		}
		return false;
	}

	public static void printOut(String s) {
		printTo("stdout", originalSystemOut, outputTees, s);
	}

	public static void printErr(String s) {
		printTo("stderr", originalSystemErr, errorTees, s);
	}

	final public static InputStream originalSystemIn0 = (InputStream) checkNonTLStream(System.in);
	final public static PrintStream originalSystemOut0 = System.out;
	final public static PrintStream originalSystemErr0 = (PrintStream) checkNonTLStream(System.err);

	public static void printTo(String desc, PrintStream where, Constituents group, String s) {
		try {
			if (where == null && group == null) {
				throw new NullPointerException("Print To Where?! " + desc);
			}

			boolean failedWrite = true;
			if (where != null) {
				if (mustShow) {
					failedWrite = !writeTo(s, where);
				} else {
					failedWrite = !writeTo(s, where);
				}
			}
			final boolean needsGroup = group != null && where != null && !group.contains(where);

			if (needsGroup) {
				if (group != null)
					failedWrite = !actOn(group, (o) -> writeTo(s, o));
			}

			if (s == NewLine) {
				if (where != null) {
					flustIt(where);
				}
				if (needsGroup) {
					if (group != null)
						actOn(group, SystemCurrent::flustIt);
				}
			}

		} catch (Throwable e2) {
			printStackTrace(e2);
		}
	}

	/**
	 * @return
	 */
	public static boolean flustIt(Object o) {
		try {
			if (o instanceof Flushable) {
				((Flushable) o).flush();
				return true;
			}
		} catch (IOException e) {
			printStackTrace(e);
		}
		return false;
	}

	/**
	 * @param s
	 * @param o
	 * @return
	 */
	public static boolean writeTo(String s, Object o) {
		if (o instanceof Writer) {
			try {
				((Writer) o).write(s);
				return true;
			} catch (IOException e) {
			}
		}
		if (o instanceof OutputStream) {
			try {
				((OutputStream) o).write(s.getBytes(StandardCharsets.UTF_8));
				return true;
			} catch (IOException e) {
			}
		}
		if (o instanceof PrintStream) {
			try {
				((PrintStream) o).write(s.getBytes(StandardCharsets.UTF_8));
				return true;
			} catch (IOException e) {
			}
		}
		if (o instanceof Appendable) {
			try {
				((Appendable) o).append(s);
				return true;
			} catch (IOException e) {
			}
		}
		bp();
		return false;
	}

	public static void setupIO() {
		synchronized (DRASTIC_CHANGE) {
			if (hasSetupIO)
				return;
			hasSetupIO = true;
			if (DONT_USE)
				return;
			try {
				new IOSecurityManager(true).setSecurityManager();
			} catch (Throwable e) {
			}
			recheckStdIO();

			final InputStream wasIn = System.in;
			if (!isTLStream(wasIn) || wasIn != in) {
				System.setIn(in);
				setIn(wasIn);
			}
			final PrintStream wasOut = System.out;
			if (!isTLStream(wasOut) || wasOut != out) {
				System.setOut(out);
				setOut(wasOut);
			}
			final PrintStream wasErr = System.err;
			if (!isTLStream(wasErr) || wasErr != err) {
				System.setErr(err);
				setErr(wasErr);
			}
		}
	}

	public static void setupIO(Object in, Object out, Object err) {
		synchronized (DRASTIC_CHANGE) {
			if (DONT_USE)
				return;
			setupIO();
			setIn(asInputStream(in));
			setOut(asPrintStream(out));
			setErr(asPrintStream(err));
		}
	}

	private static PrintStream asPrintStream(Object out) {
		if (out instanceof PrintStream) {
			return (PrintStream) out;
		}
		bp();
		if (out instanceof ByteBuffer) {
			ByteBuffer w = (ByteBuffer) out;
			out = new ByteBufferBackedOutputStream(w);
		} else if (out instanceof File) {
			try {
				out = new FileOutputStream((File) out, true);
			} catch (FileNotFoundException e) {
				printStackTrace(e);
			}
		}
		if (out instanceof OutputStream) {
			return new PrintStream((OutputStream) out, true);
		}
		if (out instanceof Appendable) {
			Appendable w = (Appendable) out;
			out = NewWriterForAppendable.newWriterForAppendable(w);
		}
		if (out instanceof Writer) {
			Writer w = (Writer) out;
			OutputStream os = new WriterOutputStream(w, Charset.defaultCharset().name());
			return new PrintStream(os, true);
		}
		Errors.unimplementedMethod("Auto-generated method stub:  SystemCurrent.asPrintStream");
		return null;
	}

	private static InputStream asInputStream(Object in) {
		if (in instanceof InputStream) {
			return (InputStream) in;
		}
		bp();
		if (in instanceof Reader) {
			return new ReaderInputStream((Reader) in);
		}
		if (in instanceof ByteBuffer) {
			ByteBuffer w = (ByteBuffer) in;
			return new ByteBufferBackedInputStream(w);
		} else if (in instanceof File) {
			try {
				return new FileInputStream((File) in);
			} catch (FileNotFoundException e) {
				printStackTrace(e);
			}
		}

		if (in instanceof CharBuffer) {
			return new ByteBufferBackedInputStream((CharBuffer) in);
		}
		if (in instanceof String) {
			return new ReaderInputStream(new StringReader((String) in));
		}
		Startup.bp();
		Errors.unimplementedMethod("Auto-generated method stub:  SystemCurrent.asPrintStream");
		return null;
	}

	private static void printStackTrace(Throwable e) {
		Startup.printStackTrace(e);
	}

	private static void bp() {
		Startup.bp();
	}

	public static void attachConsole(boolean becomeOwner) {
		synchronized (DRASTIC_CHANGE) {

			setupIO();
			InOutErr oldIO = currentIO();
			if (!becomeOwner) {
				if (attactedConsoleThread != null) {
					return;
				}
			} else {
				if (attactedConsoleThread != null) {
					bp();
				}
				attactedConsoleThread = Thread.currentThread();
			}
			if (oldIO.in != null) {
				originalInOutErr = oldIO;
			} else {
				threadLocalIO.set(originalInOutErr);
			}
			setOriginals(originalInOutErr);
		}
	}

	/**
	 *
	 */
	public static void setOriginals(InOutErr wif) {
		synchronized (DRASTIC_CHANGE) {

			if (!isTLStream(wif.in)) {
				originalInOutErr.in = originalSystemIn = (InputStream) checkNonTLStream(wif.in);
			}
			if (!isTLStream(wif.out)) {
				originalInOutErr.out = originalSystemOut = (PrintStream) checkNonTLStream(wif.out);
			}
			if (!isTLStream(wif.err)) {
				originalInOutErr.err = originalSystemOut = (PrintStream) checkNonTLStream(wif.err);
			}
		}
	}

	static public class InOutErr {
		public InOutErr parent;
		private String name;

		public InOutErr(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name + "(in=" + in + " out=" + out + " err=" + err + ")";
		}

		public transient InputStream in;
		public transient PrintStream out;
		public transient PrintStream err;

		public InputStream mustIn() {
			if (in == null) {
				if (parent != null) {
					in = parent.in;
				}
			}
			in.toString();
			return in;
		}

		public PrintStream mustOut() {
			if (out == null) {
				if (parent != null) {
					out = parent.out;
				}
			}
			out.toString();
			return out;
		}

	}

	public static void setIO(InOutErr mainIO) {
		threadLocalIO.set(mainIO);
	}

	public static void registerAsInteractive(String name, InputStream inputStream, PrintStream outStream, PrintStream errStream) {
		InOutErr inOutErr = new InOutErr(name);
		inOutErr.in = inputStream;
		inOutErr.out = outStream;
		inOutErr.err = errStream;
		addTee(errorTees, errStream);
		interactiveConsoles.put(name, inOutErr);
	}

	public static InputStream mustIn() {
		return currentIO().mustIn();
	}

	public static PrintStream mustOut() {
		return currentIO().mustOut();
	}

}

class NewWriterForAppendable {
	/**
	   <P>Demonstrates {@code newWriterForAppendable(apbl)} for creating a new {@code Writer} that wraps around {@code System.out} (writes to the console).</P>
	 **/
	public static final void main(String[] igno_red) {
		try {
			NewWriterForAppendable.newWriterForAppendable(System.out).write("hello");
		} catch (IOException iox) {
			throw new RuntimeException("WriterForAppendableXmpl", iox);
		}
	}

	/**
	   <P>A {@code Flushable} whose {@code flush()} function does nothing. This is used by {@link #newWriterForAppendable(Appendable ap_bl) newWriterForAppendable}{@code (apbl)} as a (Java 1.5) delta.</P>

	   @see  #newWriterForAppendable(Appendable) newWriterForAppendable(apbl)
	 **/
	public static final Flushable FLUSHABLE_DO_NOTHING = new Flushable() {
		public void flush() {
		}
	};
	/**
	   <P>A {@code Closeable} whose {@code close()} function does nothing. This is used by {@link #newWriterForAppendable(Appendable ap_bl) newWriterForAppendable}{@code (apbl)} as a (Java 1.5) delta.</P>

	   @see  #newWriterForAppendable(Appendable) newWriterForAppendable(apbl)
	 **/
	public static final Closeable CLOSEABLE_DO_NOTHING = new Closeable() {
		public void close() {
		}
	};

	/**
	   <P>Creates a new {@code java.io.Writer} that wraps around a {@code java.lang.Appendable}. It properly {@link java.io.Writer#flush() flush}es and {@link java.io.Writer#close() close}s appendables that happened to also be {@link java.io.Flushable}s and/or {@link java.io.Closeable Closeable}s. This uses {@code instanceof} only in the constructor, and a (Java 1.5) delta in {@code flush()} and {@code close()}, which avoids having to use any logic or reflection after object construction.</P>

	   <P>This function is released as a <A HREF="https://gist.github.com/aliteralmind/8494917">gist</A>, and is an example of the <A HREF="http://en.wikipedia.org/wiki/Adapter_pattern#Object_Adapter_pattern">Object Adapter pattern</A>. Thanks to <A HREF="http://stackoverflow.com/users/1211906/marc-baumbach">Marc Baumbach</A> on <A HREF="http://stackoverflow.com">{@code stackoverflow}</A> for the assistance. See (viewed 1/18/2014)
	   <BR> &nbsp; &nbsp; <CODE><A HREF="http://stackoverflow.com/questions/21200421/how-to-wrap-a-java-lang-appendable-into-a-java-io-writer">http://stackoverflow.com/questions/21200421/how-to-wrap-a-java-lang-appendable-into-a-java-io-writer</A></CODE></P>

	   @return  A new writer that uses an appendable to do its output.
	   @see  #FLUSHABLE_DO_NOTHING
	   @see  #CLOSEABLE_DO_NOTHING
	 **/
	public static final Writer newWriterForAppendable(Appendable ap_bl) {
		return (new WFA(ap_bl));
	}

	private NewWriterForAppendable() {
		throw new IllegalStateException("constructor: Do not instantiate.");
	}
}

class WFA extends Writer {
	private final Appendable apbl;
	private final Flushable flbl;
	private final Closeable clbl;

	public WFA(Appendable ap_bl) {
		if (ap_bl == null) {
			throw new NullPointerException("newWriterForAppendable: ap_bl");
		}
		apbl = ap_bl;

		//Avoids instanceof at every call to flush() and close()
		flbl = (Flushable) ((ap_bl instanceof Flushable) ? ap_bl : NewWriterForAppendable.FLUSHABLE_DO_NOTHING);
		clbl = (Closeable) ((ap_bl instanceof Closeable) ? ap_bl : NewWriterForAppendable.CLOSEABLE_DO_NOTHING);
	}

	@Override
	public void write(char[] a_c, int i_ndexStart, int i_ndexEndX) throws IOException {
		apbl.append(String.valueOf(a_c), i_ndexStart, i_ndexEndX);
	}

	@Override
	public Writer append(char c_c) throws IOException {
		apbl.append(c_c);
		return this;
	}

	@Override
	public Writer append(CharSequence c_q) throws IOException {
		apbl.append(c_q);
		return this;
	}

	@Override
	public Writer append(CharSequence c_q, int i_ndexStart, int i_ndexEndX) throws IOException {
		apbl.append(c_q, i_ndexStart, i_ndexEndX);
		return this;
	}

	@Override
	public void flush() throws IOException {
		flbl.flush();
	}

	@Override
	public void close() throws IOException {
		flush();
		clbl.close();
	}

}

class ByteBufferBackedInputStream extends InputStream {

	ByteBuffer buf;

	ByteBufferBackedInputStream(CharBuffer buf) {
		Charset cs = Charset.defaultCharset();
		this.buf = cs.encode(buf);
	}

	ByteBufferBackedInputStream(ByteBuffer buf) {
		this.buf = buf;
	}

	public synchronized int read() throws IOException {
		if (!buf.hasRemaining()) {
			return -1;
		}
		return buf.get();
	}

	public synchronized int read(byte[] bytes, int off, int len) throws IOException {
		len = Math.min(len, buf.remaining());
		buf.get(bytes, off, len);
		return len;
	}
}

class ByteBufferBackedOutputStream extends OutputStream {
	ByteBuffer buf;

	ByteBufferBackedOutputStream(ByteBuffer buf) {
		this.buf = buf;
	}

	public synchronized void write(int b) throws IOException {
		buf.put((byte) b);
	}

	public synchronized void write(byte[] bytes, int off, int len) throws IOException {
		buf.put(bytes, off, len);
	}

}
//
///** A ThreadPrintStream replaces the normal System.out and ensures
// * that output to System.out goes to a different PrintStream for
// * each thread.  It does this by using ThreadLocal to maintain a
// * PrintStream for each thread. */
//class ThreadPrintStream extends PrintStream {
//
//	/** Changes System.out to a ThreadPrintStream which will
//	 * send output to a separate file for each thread. */
//	public static void replaceSystemOut() {
//
//		// Save the existing System.out
//		PrintStream console = System.out;
//
//		// Create a ThreadPrintStream and install it as System.out
//		ThreadPrintStream threadOut = new ThreadPrintStream();
//		System.setOut(threadOut)
//
//		// Use the original System.out as the current thread's System.out
//		threadOut.setThreadOut(console);
//	}
//
//	/** Thread specific storage to hold a PrintStream for each thread */
//	private ThreadLocal<PrintStream> out;
//
//	private ThreadPrintStream() {
//		super(new ByteArrayOutputStream(0));
//		out = new ThreadLocal<PrintStream>();
//	}
//
//	/** Sets the PrintStream for the currently executing thread. */
//	public void setThreadOut(PrintStream out) {
//		this.out.set(out);
//	}
//
//	/** Returns the PrintStream for the currently executing thread. */
//	public PrintStream getThreadOut() {
//		PrintStream ps = this.out.get();
//		if (ps != null) {
//			return ps;
//		}
//		return SystemCurrent.originalSystemOut;
//	}
//
//	@Override
//	public boolean checkError() {
//		return getThreadOut().checkError();
//	}
//
//	@Override
//	public void write(byte[] buf, int off, int len) {
//		getThreadOut().write(buf, off, len);
//	}
//
//	@Override
//	public void write(int b) {
//		getThreadOut().write(b);
//	}
//
//	@Override
//	public void flush() {
//		getThreadOut().flush();
//	}
//
//	@Override
//	public void close() {
//		getThreadOut().close();
//	}
//}
