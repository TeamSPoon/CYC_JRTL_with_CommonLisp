/*
 * Main.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id$
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */
package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*; 

import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.JVMImpl;
import org.logicmoo.system.SystemCurrent;
import org.logicmoo.system.UpdateZip;
import org.logicmoo.system.SystemCurrent.In;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess.TerminationRequest;

//import static org.armedbear.lisp.Options.*;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Main {

	/**
	 * @author Administrator
	 *
	 */
	public static final class ABCLMainUncaughtExceptionHandler implements UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread arg0, Throwable e) {
			addUncaught(e);
		}
	}

	static final UncaughtExceptionHandler uncaughtExceptionHandler = new ABCLMainUncaughtExceptionHandler();

	static boolean useMainThread = false;
	static int exitCode = 0;
	static List<Throwable> unexpectedThrowable = new ArrayList<Throwable>(0);
	public static final long startTimeMillis = System.currentTimeMillis();

	private static void reportUncaughts() {
		PrintStream err = getNoticeStream();
		if (unexpectedThrowable != null) {

			for (Iterator<Throwable> iterator = unexpectedThrowable.iterator(); iterator.hasNext();) {
				Throwable throwable = iterator.next();
				try {
					err.print("unexpectedThrowable: " + throwable);
					throwable.printStackTrace(err);
					err.flush();
				} catch (Throwable e) {
					// TODO: handle exception
				}
			}

		}
	}

	private static PrintStream getNoticeStream() {
		PrintStream err = System.err;
		if (err == null)
			err = System.out;
		return err;
	}

	public static void addUncaught(Throwable e) {
		unexpectedThrowable.add(e);
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static void setupABCLOptions() {
		SystemCurrent.setupIO();
		SystemCurrent.attachConsole();
		assert (System.in instanceof In);
		SystemCurrent.attachConsole();
		SystemCurrent.takeOwnerShip();
		abclProcessArgs = true;
		noProlog = true;
		//noPrologJNI = false;
		noBSH = true;
		noExit = false;
	}

	public static void main(final String[] args) throws InterruptedException {
		Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
		setupABCLOptions();
		String[] argsNew = extractOptions(args);
		Thread t = mainUnjoined(argsNew);
		runThread(t);
		System.exit(exitCode);
	}

	public static Thread mainUnjoined(final String[] args) throws InterruptedException {
		// Run the interpreter in a secondary thread so we can control the stack
		// size.
		// Lisp.checkOutput(Symbol.STANDARD_OUTPUT,Lisp.stdout);
		Runnable r = mainRunnable(args, new Runnable() {
			@Override
			public void run() {
				Interpreter interpreter = Interpreter.getInstance();
				if (interpreter != null)
					interpreter.run();
			}
		});
		final String name = Main.class.getClass().getName();
		Thread t = new SubLThread(null, r, name, 1 << 30L).asJavaTread();
		final UncaughtExceptionHandler uncaughtExceptionHandlerOrignal = t.getUncaughtExceptionHandler();
		if (uncaughtExceptionHandlerOrignal == null)
			t.setUncaughtExceptionHandler(uncaughtExceptionHandler);
		return t;
	}

	static void runThread(Thread t) {
		try {
			if (useMainThread) {
				t.run();
			} else {
				final Thread currentThread = Thread.currentThread();
				currentThread.setName("Old-"+currentThread.getName());
				t.setName("main");
				t.start();
				t.join();
			}
		} catch (InterruptedException e) {
			exitCode = 3;
			addUncaught(e);
		} catch (TerminationRequest e) {
			exitCode = 0;
		} catch (Throwable e) {
			exitCode = 1;
			addUncaught(e);
		}
		reportUncaughts();
	}

	public static Runnable mainRunnable(final String[] argsIn, final Runnable after) {
		final String[] args = extractOptions(argsIn);
		globalContext.set(true);
		needIOConsole = false;
		Lisp.initLisp();
		passedArgs = args;
		if(!noProlog) BeanShellCntrl.start_prolog_from_lisp();
		Runnable r = new SubLProcess("main") {
			@Override
			public void safeRun() {
				boolean wasSubLisp = isSubLisp();
				try {
					try {
						globalContext.set(true);
						// SubLMain.commonSymbolsOK = true;
						setSubLisp(false);
						// Main.noSubLisp =true;
						// File initialDir = new File("./");
						Interpreter.createDefaultInstance(args);
						/*
						 * Interpreter interpreter = Interpreter.createNewLispInstance(SystemCurrent.in,
						 * SystemCurrent.out, initialDir.getCanonicalPath(),
						 * Version.getLongVersionString());
						 */
						//BeanShellCntrl.registerSelf();
						if (after != null)
							after.run();
					} catch (ProcessingTerminated e) {
						Lisp.exit(e.getStatus());
					} catch (Throwable e) {
						throw JVMImpl.doThrow(e);
					}
				} finally {
					setSubLisp(wasSubLisp);
				}
			}
		};
		return r;
	}

	public static boolean isSubLisp() {
		return isSubLisp.get();
	}

	public static void setSubLisp(boolean isSubLisp) {
		Main.isSubLisp.set(isSubLisp);
	}

	public static boolean isNoDebug() {
		return isNoDebug.get();
	}
	
	public static boolean noGUI = false;
	
	public static void setNoDebug(boolean isNoDebug) {
		Main.isNoDebug.set(isNoDebug);
	}

	public static boolean noProlog = false;
	public static boolean noPrologJNI = false;
	public static boolean disablePrologSync = true;
	public static boolean disableLispSync = false;

	public static boolean trackStructs = true;
	public static boolean noBSH = false;
	public static boolean noBSHGUI = true;

	public static String subLisp = null;
	public static int lispInstances = 0;
	public static boolean needIOConsole = true;
	public static boolean needABCL = true;
	public static boolean needSubLMAIN = false;
	// public static boolean commonSymbolsOK;
	public static boolean noExit = true;
	public static boolean abclProcessArgs = false;
	public static String[] passedArgs;
	public static ThreadLocal<Boolean> globalContext = new ThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return false;
		};
	};

	public static boolean isSublispDefault = false;
	public static InheritableThreadLocal<Boolean> isSubLisp = new InheritableThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return isSublispDefault;
		}
	};
	public static InheritableThreadLocal<Boolean> isNoDebug = new InheritableThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return Boolean.FALSE;
		}
	};
	public static boolean isSubLispBindingMode;

	public static String[] extractOptions(String[] args) {
		ArrayList<String> argsList = new ArrayList<String>(Arrays.asList(args));
		if (argsList.remove("--main-thread")) {
			Main.useMainThread = true;
		}
		if (argsList.remove("--abcl")) {
			argsList.add(0, "--lisp");
		}
		if (argsList.remove("--lisp")) {
			argsList.add(0, "--nocyc");
			argsList.add(0, "--noprolog");
		}
		if (argsList.remove("--noprolog") || argsList.remove("--noswi")) {
			noPrologJNI = true;
		}
		if (argsList.remove("--opencyc")) {
			SubLMain.OPENCYC = true;
			isSublispDefault = true;
			try {
				UpdateZip.updateUnits("5022");
			} catch (Throwable e) {
				e.printStackTrace();
				throw new RuntimeException(" UpdateZip.updateUnits throw " + e, e);
			}
		}
		if (argsList.remove("--rcyc")) {
			SubLMain.OPENCYC = false;
			isSublispDefault = true;
			try {
				UpdateZip.updateUnits("7166");
			} catch (Throwable e) {
				e.printStackTrace();
				throw new RuntimeException(" UpdateZip.updateUnits throw " + e, e);
			}
		}
		if (argsList.remove("--cyc")) {
			Main.subLisp = "cyc-init";
			Main.noBSHGUI = false;
			needSubLMAIN = true;
			Main.needABCL = false;
			isSublispDefault = true;
			SubLMain.noInitCyc = false;
		}
		if (argsList.remove("--nocyc")) {
			needSubLMAIN = false;
		}
		if (argsList.remove("--prologsync")) {
			disablePrologSync = false;
			trackStructs = true;
			noPrologJNI = false;
		}
		if (argsList.remove("--noprologsync")) {
			disablePrologSync = true;
		}
		
		if (argsList.remove("--lispsync")) {
			disableLispSync = false;
			trackStructs = true;
		}
		if (argsList.remove("--nolispsync")) {
			disableLispSync = true;
		}
		
		if (argsList.remove("--headless") || argsList.remove("--nogui")) {
			noGUI = true;
			noBSHGUI = true;
		}
		if (argsList.remove("--prolog")) {
			noProlog = false;
			noPrologJNI = false;
		}
		if (argsList.remove("--beandesk")) {
			noBSHGUI = false;
		}
		String[] argsNew = jiggleEvalArgs(argsList.toArray(new String[argsList.size()]));
		for (int i = 0; i < argsNew.length; i++) {
			if (argsNew[i].equals("-L")) {
				argsNew[i] = "--load";
				noPrologJNI = true;
			} else if (argsNew[i].equals("-E"))
				argsNew[i] = "--eval";
		}
		if (argsNew.length > 0) {
			final java.io.File file = new java.io.File(argsNew[0]);
			if (file.exists() && file.isFile() && file.canRead()) {
				argsList = new ArrayList<String>(Arrays.asList(argsNew));
				argsList.add(0, "--load");
				argsNew = argsList.toArray(new String[argsList.size()]);
			}
		}
		return argsNew;
	}

	public static String[] copyParams(String[] args) {
		List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		String[] argsNew = argsList.toArray(new String[argsList.size()]);
		return argsNew;
	}

	/**
	 * @param array
	 * @return
	 */
	private static String[] jiggleEvalArgs(String[] args0) {
		String[] args = copyParams(args0);
		String lastArg = null;
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (lastArg != null && !lastArg.startsWith("--")) {
				if (thisArg.startsWith("\"") || thisArg.startsWith(" ")) {
					args[i - 1] += " " + thisArg;
					args[i] = null;
				}
			}
			lastArg = args[i];
		}
		List<String> argsList = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			String thisArg = args[i];
			if (thisArg != null) {
				argsList.add(thisArg);
			}
		}
		String[] argsNew = argsList.toArray(new String[argsList.size()]);
		return argsNew;
	}
}
