/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl.inference.modules.removal;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_modules_backchain_required extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_backchain_required() {}
  public static final SubLFile me = new removal_modules_backchain_required();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_backchain_required";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 1859) 
  public static final SubLObject current_problem_store_transformation_allowedP(SubLObject dummy) {
    if ((dummy == UNPROVIDED)) {
      dummy = NIL;
    }
    {
      SubLObject store = inference_worker.currently_active_problem_store();
      return makeBoolean(((NIL != store)
             && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store))));
    }
  }

  public static final class $current_problem_store_transformation_allowedP$ZeroArityFunction extends ZeroArityFunction {
    public $current_problem_store_transformation_allowedP$ZeroArityFunction() { super(extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")); }
    public SubLObject processItem() { return current_problem_store_transformation_allowedP(UNPROVIDED); }
  }

  public static final class $current_problem_store_transformation_allowedP$UnaryFunction extends UnaryFunction {
    public $current_problem_store_transformation_allowedP$UnaryFunction() { super(extractFunctionNamed("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")); }
    public SubLObject processItem(SubLObject arg1) { return current_problem_store_transformation_allowedP(arg1); }
  }

  /** A version of @xref inference-backchain-required-asent? that assumes *mt* */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-backchain-required.lisp", position = 2953) 
  public static final SubLObject inference_backchain_required_asent_in_relevant_mtP(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
  }

  public static final class $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction extends UnaryFunction {
    public $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction() { super(extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")); }
    public SubLObject processItem(SubLObject arg1) { return inference_backchain_required_asent_in_relevant_mtP(arg1, UNPROVIDED); }
  }

  public static final class $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction extends BinaryFunction {
    public $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction() { super(extractFunctionNamed("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return inference_backchain_required_asent_in_relevant_mtP(arg1, arg2); }
  }

  public static final SubLObject declare_removal_modules_backchain_required_file() {
    declareFunction("current_problem_store_transformation_allowedP", "CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 0, 1, false); new $current_problem_store_transformation_allowedP$ZeroArityFunction(); new $current_problem_store_transformation_allowedP$UnaryFunction();
    declareFunction("inference_backchain_forbidden_unless_arg_chosen_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?", 1, 0, false);
    declareFunction("removal_backchain_required_prune_required", "REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED", 1, 1, false);
    declareFunction("inference_backchain_required_asent_in_relevant_mtP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?", 1, 1, false); new $inference_backchain_required_asent_in_relevant_mtP$UnaryFunction(); new $inference_backchain_required_asent_in_relevant_mtP$BinaryFunction();
    return NIL;
  }

  public static final SubLObject init_removal_modules_backchain_required_file() {
    return NIL;
  }

  public static final SubLObject setup_removal_modules_backchain_required_file() {
        preference_modules.inference_preference_module($kw0$BACKCHAIN_REQUIRED_POS, $list1);
    preference_modules.inference_preference_module($kw2$BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY, $list3);
    inference_modules.inference_removal_module($kw4$REMOVAL_BACKCHAIN_REQUIRED_PRUNE, $list5);
    utilities_macros.note_funcall_helper_function($sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED);
    utilities_macros.note_funcall_helper_function($sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$BACKCHAIN_REQUIRED_POS = makeKeyword("BACKCHAIN-REQUIRED-POS");
  public static final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"));
  public static final SubLSymbol $kw2$BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_DELAY = makeKeyword("BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-DELAY");
  public static final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("CURRENT-PROBLEM-STORE-TRANSFORMATION-ALLOWED?")), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-IN-RELEVANT-MT?"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
  public static final SubLSymbol $kw4$REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>)\n    in all cases where <fort> is #$backchainRequired should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$sentenceTruth (#$isa ?X #$Integer))")});
  public static final SubLSymbol $sym6$REMOVAL_BACKCHAIN_REQUIRED_PRUNE_REQUIRED = makeSymbol("REMOVAL-BACKCHAIN-REQUIRED-PRUNE-REQUIRED");
  public static final SubLSymbol $sym7$INFERENCE_BACKCHAIN_REQUIRED_ASENT_IN_RELEVANT_MT_ = makeSymbol("INFERENCE-BACKCHAIN-REQUIRED-ASENT-IN-RELEVANT-MT?");

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_backchain_required_file();
  }

  public void initializeVariables() {
    init_removal_modules_backchain_required_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_backchain_required_file();
  }

}
