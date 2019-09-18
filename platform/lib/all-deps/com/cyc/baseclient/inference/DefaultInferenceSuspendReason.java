/* $Id: DefaultInferenceSuspendReason.java 150734 2014-04-24 22:32:49Z nwinant $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.baseclient.inference;

//// Internal Imports
import com.cyc.base.inference.InferenceSuspendReason;
import java.util.HashMap;
import java.util.Map;
import static com.cyc.baseclient.CycObjectFactory.makeCycSymbol;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycSymbol;

//// External Imports
/**
 * <P>DefaultInferenceSuspendReason is designed to...

 <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author bklimt
 * @date October 31, 2005, 10:29 AM
 * @version $Id: DefaultInferenceSuspendReason.java 150734 2014-04-24 22:32:49Z nwinant $
 */
public final class DefaultInferenceSuspendReason implements InferenceSuspendReason {

  private static final Map<CycSymbol, DefaultInferenceSuspendReason> SYMBOL_MAP =
          new HashMap<CycSymbol, DefaultInferenceSuspendReason>();

  /**
   * Parse an inference suspend reason as returned from Cyc.
   * @param cycSuspendReason the value of cycSuspendReason
   * @return the suspend reason.
   * @throws RuntimeException if cycSuspendReason cannot be understood.
   */
  public static DefaultInferenceSuspendReason fromCycSuspendReason(Object cycSuspendReason) throws RuntimeException {
    if (cycSuspendReason instanceof CycSymbol || cycSuspendReason == null) {
      return fromCycSymbol((CycSymbol) cycSuspendReason);
    } else if (cycSuspendReason instanceof CycArrayList && ERROR_SYMBOL.equals(((CycArrayList) cycSuspendReason).get(0))) {
      return createFromErrorString((String) ((CycArrayList) cycSuspendReason).get(1));
    } else {
      throw new RuntimeException("Unable to create InferenceWorkerSuspendReason from (" + cycSuspendReason.getClass().getName() + ") " + cycSuspendReason.toString());
    }
  }

  //// Constructors
  /** Creates a new instance of InferenceSuspendReason. */
  private DefaultInferenceSuspendReason(String description, final String statusString,
          final boolean isExceptional, final String cycSymbolName,
          final boolean isContinuable, final boolean allowStop,
          final boolean allowReset) {
    this.description = description;
    this.inferenceStatusString = addHTMLFontColor(statusString, isExceptional);
    this.isContinuable = isContinuable;
    this.allowStop = allowStop;
    this.allowReset = allowReset;
    SYMBOL_MAP.put(makeCycSymbol(cycSymbolName), this);
  }
  //// Public Area

  /** Create a new error reason. */
  public static DefaultInferenceSuspendReason createFromErrorString(final String errorString) {
    final DefaultInferenceSuspendReason reason = new DefaultInferenceSuspendReason("Error: " + errorString,
            "Error", true, ":ERROR", true, true, true);
    reason.setErrorFlag(true);
    return reason;
  }

  /** Was inference suspended because of an error? */
  @Override
  public boolean isError() {
    return isError;
  }

  public static DefaultInferenceSuspendReason fromCycSymbol(final CycSymbol symbol) {
    final DefaultInferenceSuspendReason reason = SYMBOL_MAP.get(symbol);
    if (reason != null) {
      return reason;
    } else if (symbol == null) {
      return UNKNOWN;
    } else {
      throw new IllegalArgumentException("Unable to find InferenceWorkerSuspendReason from " + symbol);
    }
  }

  @Override
  public String toString() {
    return description;
  }

  /** A string to describe the status of the inference. */
  @Override
  public String getInferenceStatusString() {
    return inferenceStatusString;
  }

  /** Can an inference suspended for this reason be reset? */
  @Override
  public boolean allowReset() {
    return allowReset;
  }

  /** Can an inference suspended for this reason be stopped? */
  @Override
  public boolean allowStop() {
    return allowStop;
  }

  /** Can an inference suspended for this reason be continued? */
  @Override
  public boolean isContinuable() {
    return isContinuable;
  }
  //// Suspend reasons referenced from other packages: 
  public static final DefaultInferenceSuspendReason MAX_TIME =
          new DefaultInferenceSuspendReason("Max time reached", "Timed out", false,
          ":MAX-TIME", true, false, true);
  public static final DefaultInferenceSuspendReason MAX_NUMBER =
          new DefaultInferenceSuspendReason("Max results reached", "Result limit",
          false, ":MAX-NUMBER", true, false, true);
  public static final DefaultInferenceSuspendReason MAX_STEPS =
          new DefaultInferenceSuspendReason("Max steps performed", "Inference Step Limit",
          false, ":MAX-STEP", false, false, false);
  public static final DefaultInferenceSuspendReason EXHAUST =
          new DefaultInferenceSuspendReason("Exhausted", "Finished", false, ":EXHAUST",
          false, false, false);

  static {
    // This one has two corresponding Cyc symbols:
    SYMBOL_MAP.put(makeCycSymbol(":EXHAUST-TOTAL"), EXHAUST);
  }
  public static final DefaultInferenceSuspendReason ABORTED =
          new DefaultInferenceSuspendReason("Aborted", "Aborted", true, ":ABORT",
          false, false, false);
  public static final DefaultInferenceSuspendReason INTERRUPT =
          new DefaultInferenceSuspendReason("Interrupted", "Paused", true, ":INTERRUPT",
          true, true, true);
  //// Protected Area
  //// Private Area

  private void setErrorFlag(boolean b) {
    isError = b;
  }

  private static String addHTMLFontColor(final String text, final boolean isExceptional) {
    return "<html><body><font color=" + (isExceptional ? "red" : "green") + ">" + text + "</font></body></html>";
  }
  //// Assorted suspend reasons not directly referenced in java code:

  static {
    new DefaultInferenceSuspendReason("Max depth reached", "Depth limit", false,
            ":LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS", true, true, false);
    new DefaultInferenceSuspendReason("Max problem count reached", "Problem limit",
            false, ":MAX-PROBLEM-COUNT", true, true, false);
    new DefaultInferenceSuspendReason("Max proof count reached", "Proof limit",
            false, ":MAX-PROOF-COUNT", true, true, false);

    new DefaultInferenceSuspendReason("Probably approximately done", "P.A.D.",
            false, ":PROBABLY-APPROXIMATELY-DONE", true, true, false);

  }
  static CycSymbol ERROR_SYMBOL = makeCycSymbol(":ERROR");
  private static final DefaultInferenceSuspendReason UNKNOWN =
          new DefaultInferenceSuspendReason("Unknown", "Unknown", true, "NIL", true, true, false);
  //// Internal Rep
  private final String description;
  private boolean isError = false; // true iff inference suspended because of an error
  private final boolean isContinuable;
  private final boolean allowStop;
  private final boolean allowReset;
  private final String inferenceStatusString;
  //// Main
}
